package org.barghos.util.supplier.ints;

@FunctionalInterface
public interface SuppExI3A
{
	int[][][] get() throws Exception;
	
	public static SuppExI3A of(int[][][] value)
	{
		return () -> value;
	}
}
