package org.barghos.util.supplier.longs;

@FunctionalInterface
public interface SuppExL
{
	long get() throws Exception;
	
	public static SuppExL of(long value)
	{
		return () -> value;
	}
}
