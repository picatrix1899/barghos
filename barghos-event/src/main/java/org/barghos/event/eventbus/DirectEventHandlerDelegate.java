package org.barghos.event.eventbus;

/**
 * This class represents a delegate to a event handler function call.
 * It is used to manually create anonymous implementations with direct
 * function calls within an event bus subscriber class.
 * 
 * @author picatrix1899
 */
public abstract class DirectEventHandlerDelegate<T> implements EventHandlerDelegate<T>
{
	@Override
	public abstract void call(T event);
}
