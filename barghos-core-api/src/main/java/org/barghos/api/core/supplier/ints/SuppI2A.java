package org.barghos.api.core.supplier.ints;

@FunctionalInterface
public interface SuppI2A
{
	int[][] get();
	
	public static SuppI2A of(int[][] value)
	{
		return () -> value;
	}
}
