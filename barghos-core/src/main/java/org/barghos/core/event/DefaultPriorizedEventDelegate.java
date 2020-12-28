/*
MIT License

Copyright (c) 2020 picatrix1899 (Florian Zilkenat)

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
*/

package org.barghos.core.event;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.barghos.core.Barghos;
import org.barghos.core.event.api.Event;
import org.barghos.core.event.api.EventReceiver;
import org.barghos.core.event.api.HandlerPriority;
import org.barghos.core.event.api.PriorizedEventDelegate;
import org.barghos.core.exception.ArgumentNullException;

/**
 * @author picatrix1899
 *
 */
public class DefaultPriorizedEventDelegate<T extends Event> implements PriorizedEventDelegate<T>
{
	private Map<HandlerPriority, Set<EventReceiver<T>>> receivers = new HashMap<>();
	
	public boolean registerReceiver(HandlerPriority priority, EventReceiver<T> receiver)
	{
		if(Barghos.BUILD_FLAG__PARAMETER_CHECKS)
		{
			if(priority == null) throw new ArgumentNullException("priority");
			if(receiver == null) throw new ArgumentNullException("receiver");
		}
		
		if(!this.receivers.containsKey(priority))
			this.receivers.put(priority, new HashSet<>());
		
		return this.receivers.get(priority).add(receiver);
	}
	
	public boolean registerReceiver(EventReceiver<T> receiver)
	{
		if(Barghos.BUILD_FLAG__PARAMETER_CHECKS)
		{
			if(receiver == null) throw new ArgumentNullException("receiver");
		}
		
		if(!this.receivers.containsKey(HandlerPriority.NORMAL_CANCELLABLE))
			this.receivers.put(HandlerPriority.NORMAL_CANCELLABLE, new HashSet<>());
		
		return this.receivers.get(HandlerPriority.NORMAL_CANCELLABLE).add(receiver);
	}
	
	public boolean unregisterReceiver(EventReceiver<T> receiver)
	{
		if(Barghos.BUILD_FLAG__PARAMETER_CHECKS)
		{
			if(receiver == null) throw new ArgumentNullException("receiver");
		}
		
		boolean removedReceiver = false;
		
		for(HandlerPriority p : this.receivers.keySet())
		{
			removedReceiver = this.receivers.get(p).remove(receiver);
		}
		
		return removedReceiver;
	}
	
	public boolean unregisterReceiver(HandlerPriority priority, EventReceiver<T> receiver)
	{
		if(Barghos.BUILD_FLAG__PARAMETER_CHECKS)
		{
			if(receiver == null) throw new ArgumentNullException("receiver");
		}

		if(this.receivers.containsKey(priority))
		{
			return this.receivers.get(priority).remove(receiver);
		}

		return false;
	}
	
	@SuppressWarnings("unchecked")
	public T raise(T event)
	{
		T currentEvent = (T) event.clone();
		
		if(Barghos.BUILD_FLAG__PARAMETER_CHECKS)
		{
			if(event == null) throw new ArgumentNullException("event");
		}
		
		for(HandlerPriority p : HandlerPriority.values())
		{
			if(receivers.containsKey(p))
			{
				for(EventReceiver<T> r : receivers.get(p))
				{
					r.raise((T)event.clone(), currentEvent);
				}
			}
		}
		
		return currentEvent;
	}
}
