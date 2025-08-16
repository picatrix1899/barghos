package org.barghos.util.supplier.longs;

@FunctionalInterface
public interface SuppL2A
{
	long[][] get();
	
	public static SuppL2A of(long[][] value)
	{
		return () -> value;
	}
}
