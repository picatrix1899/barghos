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

package org.barghos.core.api.event;

/**
 * The event delegate is used to register and store the event receivers for a single specific event.
 * It is also used to raise an event and therefore send it to the registered event receivers.
 * 
 * @author picatrix1899
 * 
 * @since 1.0.0.0
 */
public interface EventDelegate<T extends Event>
{
	/**
	 * Raises the given event and therefore send it to the registered event receivers.
	 * 
	 * @param event The event to be send to the event receivers.
	 * 
	 * @return The event for retriving altered data from the event receivers.
	 * 
	 * @since 1.0.0.0
	 */
	T raise(T event);
	
	/**
	 * Registers an event receiver for this event.
	 * 
	 * @param receiver The event receiver to register.
	 * 
	 * @return True if the event receiver was registered successfully.
	 * 
	 * @since 1.0.0.0
	 */
	boolean registerReceiver(EventReceiver<T> receiver);
	
	/**
	 * Unregisters an event receiver that was registered for this event.
	 * 
	 * @param receiver The original instance of the event receiver to unregister.
	 * 
	 * @return True if the event receiver was unregistered successfully.
	 * 
	 * @since 1.0.0.0
	 */
	boolean unregisterReceiver(EventReceiver<T> receiver);
}