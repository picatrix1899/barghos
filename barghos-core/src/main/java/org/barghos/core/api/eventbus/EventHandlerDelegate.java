package org.barghos.core.api.eventbus;

/**
 * This interface represents a delegate for an event handler function.
 * It is used to store the calls to the event handler functions for the given event.
 * 
 * @author picatrix1899
 */
public interface EventHandlerDelegate<T>
{
	/**
	 * Calling this function will call the delegated event handler functions that are stored
	 * by this implementation.
	 * 
	 * @param event The event to pass to all stored delegated event handler functions.
	 */
	void call(T event);
}