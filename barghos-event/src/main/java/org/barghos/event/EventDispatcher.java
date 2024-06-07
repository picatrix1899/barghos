package org.barghos.event;

import java.util.ArrayList;
import java.util.List;

public class EventDispatcher<T>
{
	private List<EventHandler<T>> eventHandlers = new ArrayList<>();

	public void subscribe(EventHandler<T> handler)
	{
		this.eventHandlers.add(handler);
	}

	public void unsubscribe(EventHandler<T> handler)
	{
		this.eventHandlers.remove(handler);
	}
	
	public void dispatch(T event)
	{
		for(EventHandler<T> handler : this.eventHandlers)
		{
			handler.raise(event);
		}
	}
}
