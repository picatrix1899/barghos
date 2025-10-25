package org.barghos.api.core.supplier.ints;

@FunctionalInterface
public interface ISuppI2A
{
	int[][] get();
	
	public static ISuppI2A of(int[][] value)
	{
		return () -> value;
	}
}
