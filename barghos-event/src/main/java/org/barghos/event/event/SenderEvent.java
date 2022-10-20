package org.barghos.event.event;


/**
 * This interface represents an event within the event system,
 * that is attached to a specific object like an UI control.
 * 
 * @author picatrix1899
 */
public interface SenderEvent extends Event
{
	/**
	 * Returns the object this event is attached to.
	 *  
	 * @return The object this event is attached to.
	 */
	Object getSender();
}
