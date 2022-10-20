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

package org.barghos.event.event;

/**
 * The event receiver represents an event handler.
 * After registering it to an event delegate it will receive an event
 * whenever an event is raised over that event delegate.
 * 
 * @author picatrix1899
 * 
 * @since 1.0.0.0
 */
public interface EventReceiver<T extends Event>
{
	/**
	 * This function is called whenever an event is raised over an event delegate this receiver is registered for.
	 * 
	 * @param original A clone of the original raised event instance.
	 * @param current The event instance that is passed from one to another event receiver.
	 * This instance is returned by the {@link EventDelegate#raise(Event)} function.
	 * It allows for altering data.
	 * 
	 * @since 1.0.0.0
	 */
	void raise(T original, T current);
}