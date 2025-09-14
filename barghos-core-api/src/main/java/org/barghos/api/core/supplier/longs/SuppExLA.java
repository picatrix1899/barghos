package org.barghos.api.core.supplier.longs;

@FunctionalInterface
public interface SuppExLA
{
	long[] get() throws Exception;
	
	public static SuppExLA of(long[] value)
	{
		return () -> value;
	}
}
