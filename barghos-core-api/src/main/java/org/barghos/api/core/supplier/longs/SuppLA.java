package org.barghos.api.core.supplier.longs;

@FunctionalInterface
public interface SuppLA
{
	long[] get();
	
	public static SuppLA of(long[] value)
	{
		return () -> value;
	}
}
