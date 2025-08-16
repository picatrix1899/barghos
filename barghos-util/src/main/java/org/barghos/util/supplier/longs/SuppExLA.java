package org.barghos.util.supplier.longs;

@FunctionalInterface
public interface SuppExLA
{
	long[] get() throws Exception;
	
	public static SuppExLA of(long[] value)
	{
		return () -> value;
	}
}
