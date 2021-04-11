package org.barghos.core.api.eventbus;

import java.lang.reflect.Method;

import org.barghos.core.Barghos;
import org.barghos.core.api.util.ArgumentNullException;

/**
 * This class represents a delegate to a event handler function call.
 * It is used to store an event handler function call via reflection.
 * 
 * @author picatrix1899
 */
public final class ReflectionEventHandlerDelegate<T> implements EventHandlerDelegate<T>
{
	private final Method methodReference;
	private final Object instance;
	
	/**
	 * This constructor creates a new instance of a reflection based event handler delegate from
	 * the event subscriber instance and the method to call.
	 * 
	 * @param instance The instance of the event subscriber.
	 * @param method The method to call.
	 */
	public ReflectionEventHandlerDelegate(Object instance, Method method)
	{
		if(Barghos.BUILD_FLAG__PARAMETER_CHECKS)
		{
			if(instance == null) throw new ArgumentNullException("instance");
			if(method == null) throw new ArgumentNullException("method");
		}
		
		this.instance = instance;
		
		this.methodReference = method;
		this.methodReference.trySetAccessible();
	}
	
	@Override
	public void call(T event)
	{
		if(Barghos.BUILD_FLAG__PARAMETER_CHECKS)
		{
			if(event == null) throw new ArgumentNullException("event");
		}
		
		try
		{
			this.methodReference.invoke(instance, event);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}