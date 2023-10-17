package org.barghos.event.eventbus;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.barghos.event.Event;

/**
 * This interface represents an event bus within the event system.
 * An event bus is used to broadcast events to multiple handlers across an entire program or
 * eventually even across programs. An event bus is not limited to a specific event but instead
 * can broadcast any event. If event handlers are present for the raised event they will receive it.
 * 
 * @author picatrix1899
 */
public interface EventBus
{
	/**
	 * This will subscribe an event bus subscriber to the event bus and therefore registers all the event handlers contained
	 * by calling the {@link EventBusSubscriber#registerDelegates(EventBus)} function.
	 * 
	 * @param subscriber The event bus subscriber instance to register the event handlers from.
	 */
	void subscribe(EventBusSubscriber subscriber);
	
	/**
	 * This will subscribe an event bus subscriber to the event bus and therefore registers all the event handlers contained.
	 * By default the class of the instance has to be annotated with {@link EventBus.Subscriber} and every function that
	 * should be registered as an event handler has to be annotated with {@link EventBus.EventHandler}. This however might
	 * vary from implementation to implementation.
	 * 
	 * @param subscriber The event bus subscriber instance to register the event handlers from.
	 */
	void subscribe(Object subscriber);
	
	/**
	 * This will register an event handler represented by an {@link EventHandlerDelegate} on this event bus for
	 * the given event.
	 * 
	 * @param <T> The event type.
	 * 
	 * @param eventType The class of the event the event handler should be registered for.
	 * 
	 * @param delegate The delegate to the event handler.
	 */
	<T extends Event> void registerEventHandlerDelegate(Class<T> eventType, EventHandlerDelegate<T> delegate);
	
	/**
	 * This broadcasts the given event to all registered event handlers for this event type.
	 * 
	 * @param <T> The event Type.
	 * 
	 * @param event The event to broadcast.
	 */
	<T extends Event> void raise(T event);
	
	/**
	 * This annotation is used to annotate a subscriber of an event bus.
	 * A event bus subscriber is a class that contains event handlers that should be registered for a specific event bus.
	 * This annotation is used for registering event handlers from an event bus subscriber by reflection.
	 * It is therefore only required if the subscriber class does not implement the {@link EventBusSubscriber} interface,
	 * which means that the registration should happen via reflection.
	 * 
	 * @author picatrix1899
	 */
	@Target(ElementType.TYPE)
	@Retention(RetentionPolicy.RUNTIME)
	public static @interface Subscriber
	{
	}
	
	/**
	 * This annotation is used to annotate an event handler within an event bus subscriber class.
	 * It is used to distinguish between functions that should be called as an event handler and casual functions.
	 * Also it specifies the event type the annotated event handler should be registered to.
	 * This annotation is repeatable. Therefore it allows a single event handler to be registered to multiple events.
	 * It is only required if the subscriber class does not implement the {@link EventBusSubscriber} interface,
	 * which means that the registration should happen via reflection.
	 * 
	 * @author picatrix1899
	 */
	@Target(ElementType.METHOD)
	@Retention(RetentionPolicy.RUNTIME)
	@Repeatable(EventBus.EventHandlerAnnotationGroup.class)
	public static @interface EventHandler
	{
		/**
		 * This property holds the type of the event the annotated event handler should be registered to.
		 * 
		 * @return The class type of the event.
		 */
		public Class<? extends Event> eventType();
	}
	
	/**
	 * This annotation is used to group the repeatable annotation {@link EventBus.EventHandler} and must not be
	 * used as an annotation. However it can be used to get a list of all the {@link EventBus.EventHandler} annotations
	 * on a method but only if multiple {@link EventBus.EventHandler} annotations are present.
	 * 
	 * @author picatrix1899
	 */
	@Target(ElementType.METHOD)
	@Retention(RetentionPolicy.RUNTIME)
	public static @interface EventHandlerAnnotationGroup
	{
		/**
		 * This property holds the list of all {@link EventBus.EventHandler} annotations defined for a method.
		 * 
		 * @return A list of all {@link EventBus.EventHandler} annotations defined for a method.
		 */
		public EventHandler[] value();
	}
}