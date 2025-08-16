package org.barghos.util.supplier;

@FunctionalInterface
public interface Supp<T>
{
	T get();
	
	public static <T> Supp<T> of(T value)
	{
		return () -> value;
	}
}