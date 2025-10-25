package org.barghos.api.core.supplier.ints;

@FunctionalInterface
public interface ISuppExI3A
{
	int[][][] get() throws Exception;
	
	public static ISuppExI3A of(int[][][] value)
	{
		return () -> value;
	}
}
