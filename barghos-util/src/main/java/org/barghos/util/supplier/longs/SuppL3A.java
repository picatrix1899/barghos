package org.barghos.util.supplier.longs;

@FunctionalInterface
public interface SuppL3A
{
	long[][][] get();
	
	public static SuppL3A of(long[][][] value)
	{
		return () -> value;
	}
}
