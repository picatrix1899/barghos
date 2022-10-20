package org.barghos.event.eventbus;

/**
 * This interface represents an event bus subscriber.
 * It is used for event bus subscribers that should register its event handlers
 * manually and not using reflection. This would be the case for example for performance reasons
 * as reflection is rather slow.
 * 
 * @author picatrix1899
 */
public interface EventBusSubscriber
{
	/**
	 * This registers all event handlers to the given event bus.
	 * It is called by the event bus when subscribing.
	 * Event handlers can be registered to the event bus by calling
	 * {@link EventBus#registerEventHandlerDelegate(Class, EventHandlerDelegate)} with either
	 * an anonymous implementation of
	 * {@link org.barghos.event.eventbus.DirectEventHandlerDelegate DirectEventHandlerDelegate}, an instance of
	 * {@link org.barghos.event.eventbus.ReflectionEventHandlerDelegate ReflectionEventHandlerDelegate} or an
	 * instance of any type that implements the
	 * {@link org.barghos.event.eventbus.EventHandlerDelegate EventHandlerDelegate} interface.
	 * 
	 * @param bus The event bus this event bus subscriber should be subscribed to.
	 */
	void registerDelegates(EventBus bus);
}