package org.barghos.api.core.supplier.ints;

@FunctionalInterface
public interface SuppI
{
	int get();
	
	public static SuppI of(int value)
	{
		return () -> value;
	}
}
