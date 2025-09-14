package org.barghos.api.core.supplier.longs;

@FunctionalInterface
public interface SuppL3A
{
	long[][][] get();
	
	public static SuppL3A of(long[][][] value)
	{
		return () -> value;
	}
}
