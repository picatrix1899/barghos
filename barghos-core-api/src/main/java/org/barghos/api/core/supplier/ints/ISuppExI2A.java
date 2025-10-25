package org.barghos.api.core.supplier.ints;

@FunctionalInterface
public interface ISuppExI2A
{
	int[][] get() throws Exception;
	
	public static ISuppExI2A of(int[][] value)
	{
		return () -> value;
	}
}
