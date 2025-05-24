package org.barghos.util.lazy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import org.barghos.util.supplier.Supplier;

public class LazyProxy
{
	@SuppressWarnings("unchecked")
	public static <T> T create(Class<T> type, Supplier<T> supplier, Class<?>... additional)
	{
		Class<?>[] types = new Class<?>[1 + additional.length];
		types[0] = type;
		
		if(additional.length > 0) System.arraycopy(additional, 0, types, 1, additional.length);
		
		Object proxy = Proxy.newProxyInstance(type.getClassLoader(), types, new InvocationHandler() {
			private volatile T instance;
			
			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable
			{
				if(instance == null)
				{
					synchronized(this)
					{
						if(instance == null) instance = supplier.get();
					}
				}
				
				return method.invoke(instance, args);
			}
		});
		
		return (T) proxy;
	}
		
}
