package org.barghos.util.supplier.ints;

@FunctionalInterface
public interface SuppI3A
{
	int[][][] get();
	
	public static SuppI3A of(int[][][] value)
	{
		return () -> value;
	}
}
