package org.barghos.hid;

public interface IHidDevice
{
	String id();
	
	void reset();
	
	void poll();
	
	IHidDeviceInputSnapshot query();
	
}
