package org.barghos.api.core.supplier.ints;

@FunctionalInterface
public interface ISuppI3A
{
	int[][][] get();
	
	public static ISuppI3A of(int[][][] value)
	{
		return () -> value;
	}
}
