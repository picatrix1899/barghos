package org.barghos.util.supplier.ints;

@FunctionalInterface
public interface SuppI
{
	int get();
	
	public static SuppI of(int value)
	{
		return () -> value;
	}
}
