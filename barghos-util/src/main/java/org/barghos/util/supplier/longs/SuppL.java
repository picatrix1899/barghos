package org.barghos.util.supplier.longs;

@FunctionalInterface
public interface SuppL
{
	long get();
	
	public static SuppL of(long value)
	{
		return () -> value;
	}
}
