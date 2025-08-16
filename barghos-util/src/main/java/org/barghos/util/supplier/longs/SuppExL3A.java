package org.barghos.util.supplier.longs;

@FunctionalInterface
public interface SuppExL3A
{
	long[][][] get() throws Exception;
	
	public static SuppExL3A of(long[][][] value)
	{
		return () -> value;
	}
}
