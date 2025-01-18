package org.barghos.event.layered;

import java.util.ArrayList;
import java.util.List;


public class LayeredEventDispatcher<T>
{
	private Map<Integer,List<T>>
	private IntList order = new IntArrayList();
	
	public void addLayer(int layerId)
	{
		order.add(layerId);
		handlers.put(layerId, new ArrayList<>());
	}
	
	public void addHandler(int layerId, EventHandler<T> handler)
	{
		this.handlers.get(layerId).add(handler);
	}
	
	public void dispatch(T event)
	{
		for(int layerId : order)
		{
			for(EventHandler<T> handler : this.handlers.get(layerId))
			{
				handler.handle(event);
			}
		}
	}
	
	public static interface EventHandler<T>
	{
		void handle(T event);
	}
}
