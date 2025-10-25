package org.barghos.api.core.supplier.longs;

@FunctionalInterface
public interface ISuppExLA
{
	long[] get() throws Exception;
	
	public static ISuppExLA of(long[] value)
	{
		return () -> value;
	}
}
