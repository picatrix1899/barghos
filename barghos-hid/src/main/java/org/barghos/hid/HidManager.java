package org.barghos.hid;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HidManager
{
	private List<IHidPhantomDevice> phantomDevices = new ArrayList<>();
	private Map<Integer,IHidDevice> deviceSlots = new HashMap<>();
	private Map<String,Integer> deviceSlotMapping = new HashMap<>();
	private int nextFreeSlot = 0;
	
	private Map<HidInputKey,HidInputState> states = new HashMap<>();
	
	public void registerPhantom(IHidPhantomDevice device)
	{
		this.phantomDevices.add(device);
	}
	
	public void unregisterPhantom(IHidPhantomDevice device)
	{
		this.phantomDevices.remove(device);
	}
	
	public void register(IHidDevice device)
	{
		if(this.deviceSlots.containsValue(device));
		
		String deviceId = device.id();
		
		if(!this.deviceSlotMapping.containsKey(deviceId))
		{
			this.deviceSlotMapping.put(deviceId, nextFreeSlot);
			
			nextFreeSlot++;
		}
		
		int slot = this.deviceSlotMapping.get(deviceId);
		
		this.deviceSlots.put(slot, device);
	}
	
	public void unregister(IHidDevice device)
	{
		int slot = this.deviceSlotMapping.get(device.id());
		
		this.deviceSlots.remove(slot);
	}
	
	public Map<String,Integer> getDeviceSlotMapping()
	{
		return this.deviceSlotMapping;
	}
	
	public void setDeviceSlotMapping(Map<String,Integer> mapping)
	{
		this.deviceSlotMapping.putAll(mapping);
	}
	
	public void poll()
	{
		for(int slot : this.deviceSlots.keySet())
		{
			IHidDevice device = this.deviceSlots.get(slot);
			
			device.reset();
		}
		
		for(IHidPhantomDevice phantomDevice : this.phantomDevices)
		{
			phantomDevice.poll();
		}
		
		for(int slot : this.deviceSlots.keySet())
		{
			IHidDevice device = this.deviceSlots.get(slot);
			
			device.poll();
			IHidDeviceInputSnapshot snapshot =  device.query();
			
			for(IHidDeviceInputState state : snapshot.states())
			{
				HidInputKey key = new HidInputKey(slot, state.id());
				
				HidInputState inputState = new HidInputState();
				inputState.value = state.value();
				inputState.timestamp = state.timestamp();
				
				this.states.put(key, inputState);
			}
		}
	}
	
	public HidInputState getState(HidInputKey key)
	{
		return this.states.get(key);
	}
}
