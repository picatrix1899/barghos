package org.barghos.core.eventbus;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.barghos.core.api.event.Event;
import org.barghos.core.api.eventbus.EventBus;
import org.barghos.core.api.eventbus.EventBusSubscriber;
import org.barghos.core.api.eventbus.EventHandlerDelegate;
import org.barghos.core.api.eventbus.ReflectionEventHandlerDelegate;
import org.barghos.core.api.reflect.ClassHelper;
import org.barghos.core.api.util.ArgumentNullException;

import org.barghos.core.Barghos;

/**
 * This class is a simple implementation of an {@link EventBus}.
 * 
 * @author picatrix1899
 */
public class SimpleEventBus implements EventBus
{
	private Map<Class<? extends Event>,Set<EventHandlerDelegate<?>>> delegates = new HashMap<>();

	@Override
	public void subscribe(EventBusSubscriber subscriber)
	{
		if(Barghos.BUILD_FLAG__PARAMETER_CHECKS)
		{
			if(subscriber == null) throw new ArgumentNullException("subscriber");
		}
		
		subscriber.registerDelegates(this);
	}

	@Override
	public void subscribe(Object obj)
	{
		if(Barghos.BUILD_FLAG__PARAMETER_CHECKS)
		{
			if(obj == null) throw new ArgumentNullException("obj");
		}

		if(!obj.getClass().isAnnotationPresent(EventBus.Subscriber.class))
		{
			return;
		}
		
		for(Method method : ClassHelper.getAnnotatedMethods(obj.getClass(), EventBus.EventHandler.class))
		{
			if(method.getParameterCount() != 1)
			{
				continue;
			}
			
			EventBus.EventHandler eventHandlerAnnotation = method.getAnnotation(EventBus.EventHandler.class);

			Class<?> parameterType = method.getParameterTypes()[0];

			if(parameterType.isAssignableFrom(eventHandlerAnnotation.eventType()))
			{
				registerEventHandlerDelegate(eventHandlerAnnotation.eventType(), new ReflectionEventHandlerDelegate<>(obj, method));
			}
		}
		
		for(Method method : ClassHelper.getAnnotatedMethods(obj.getClass(), EventBus.EventHandlerAnnotationGroup.class))
		{
			if(method.getParameterCount() != 1)
			{
				continue;
			}

			EventBus.EventHandlerAnnotationGroup eventHandlerAnnotationGroup = method.getAnnotation(EventBus.EventHandlerAnnotationGroup.class);

			EventBus.EventHandler[] eventHandlerAnnotations = eventHandlerAnnotationGroup.value();

			Class<?> parameterType = method.getParameterTypes()[0];
			
			for(EventBus.EventHandler eventHandlerAnnotation : eventHandlerAnnotations)
			{
				if(parameterType.isAssignableFrom(eventHandlerAnnotation.eventType()))
				{
					registerEventHandlerDelegate(eventHandlerAnnotation.eventType(), new ReflectionEventHandlerDelegate<>(obj, method));
				}
			}
		}
	}
	
	@Override
	public <T extends Event> void raise(T event)
	{
		if(Barghos.BUILD_FLAG__PARAMETER_CHECKS)
		{
			if(event == null) throw new ArgumentNullException("event");
		}
		
		if(delegates.containsKey(event.getClass()))
		{
			for(EventHandlerDelegate<?> delegate : delegates.get(event.getClass()))
			{
				@SuppressWarnings("unchecked")
				EventHandlerDelegate<T> typedDelegate = (EventHandlerDelegate<T>)delegate;
				typedDelegate.call(event);
			}
		}
	}

	@Override
	public <T extends Event> void registerEventHandlerDelegate(Class<T> eventType, EventHandlerDelegate<T> delegate)
	{
		if(Barghos.BUILD_FLAG__PARAMETER_CHECKS)
		{
			if(eventType == null) throw new ArgumentNullException("eventType");
			if(delegate == null) throw new ArgumentNullException("delegate");
		}
		
		if(!this.delegates.containsKey(eventType))
		{
			this.delegates.put(eventType, new HashSet<>());
		}
		
		this.delegates.get(eventType).add(delegate);
	}
}
