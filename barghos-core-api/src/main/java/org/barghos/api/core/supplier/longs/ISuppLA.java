package org.barghos.api.core.supplier.longs;

@FunctionalInterface
public interface ISuppLA
{
	long[] get();
	
	public static ISuppLA of(long[] value)
	{
		return () -> value;
	}
}
