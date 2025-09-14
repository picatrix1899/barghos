package org.barghos.api.core.supplier.ints;

@FunctionalInterface
public interface SuppExI2A
{
	int[][] get() throws Exception;
	
	public static SuppExI2A of(int[][] value)
	{
		return () -> value;
	}
}
