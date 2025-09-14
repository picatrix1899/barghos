package org.barghos.api.core.supplier;

@FunctionalInterface
public interface SuppEx<T>
{
	T get() throws Exception;
	
	public static <T> SuppEx<T> of(T value)
	{
		return () -> value;
	}
}