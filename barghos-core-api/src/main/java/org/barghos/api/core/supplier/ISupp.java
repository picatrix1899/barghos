package org.barghos.api.core.supplier;

@FunctionalInterface
public interface ISupp<T>
{
	T get();
	
	public static <T> ISupp<T> of(T value)
	{
		return () -> value;
	}
}