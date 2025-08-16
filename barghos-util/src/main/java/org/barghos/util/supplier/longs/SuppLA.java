package org.barghos.util.supplier.longs;

@FunctionalInterface
public interface SuppLA
{
	long[] get();
	
	public static SuppLA of(long[] value)
	{
		return () -> value;
	}
}
