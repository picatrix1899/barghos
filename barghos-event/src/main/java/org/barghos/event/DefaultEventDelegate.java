/*******************************************************************************
 * Copyright (C) 2021 picatrix1899 (Florian Zilkenat)
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 ******************************************************************************/

package org.barghos.event;

import java.util.ArrayList;
import java.util.List;

/**
 * This is the default event delegate type.
 * 
 * @author picatrix1899
 * 
 * @since 1.0.0.0
 */
public class DefaultEventDelegate<T extends Event> implements EventDelegate<T>
{
	/**
	 * This member contains all registered event receivers for this delegate.
	 */
	private List<EventReceiver<T>> receivers = new ArrayList<>();
	
	@Override
	public boolean registerReceiver(EventReceiver<T> receiver)
	{
		if(receivers.contains(receiver)) return false;
		
		return receivers.add(receiver);
	}

	@Override
	public boolean unregisterReceiver(EventReceiver<T> receiver)
	{
		return receivers.remove(receiver);
	}
	
	@Override
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