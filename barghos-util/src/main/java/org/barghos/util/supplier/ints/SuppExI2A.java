package org.barghos.util.supplier.ints;

@FunctionalInterface
public interface SuppExI2A
{
	int[][] get() throws Exception;
	
	public static SuppExI2A of(int[][] value)
	{
		return () -> value;
	}
}
