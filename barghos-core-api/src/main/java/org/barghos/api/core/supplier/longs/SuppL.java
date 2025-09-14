package org.barghos.api.core.supplier.longs;

@FunctionalInterface
public interface SuppL
{
	long get();
	
	public static SuppL of(long value)
	{
		return () -> value;
	}
}
