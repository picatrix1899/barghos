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

import java.util.HashSet;
import java.util.Set;

import org.barghos.core.event.api.Event;
import org.barghos.core.event.api.EventDelegate;
import org.barghos.core.event.api.EventReceiver;

/**
 * @author picatrix1899
 *
 */
public class DefaultEventDelegate<T extends Event> implements EventDelegate<T>
{
	private Set<EventReceiver<T>> receivers = new HashSet<>();
	
	public boolean registerReceiver(EventReceiver<T> receiver)
	{
		return receivers.add(receiver);
	}

	public boolean unregisterReceiver(EventReceiver<T> receiver)
	{
		return receivers.remove(receiver);
	}
	
	@SuppressWarnings("unchecked")
	public T raise(T event)
	{
		T currentEvent = (T) event.clone();
		
		for(EventReceiver<T> r : receivers)
		{
			r.raise((T)event.clone(), currentEvent);
		}
		
		return currentEvent;
	}
}
