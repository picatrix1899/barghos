package org.barghos.api.core.supplier.longs;

@FunctionalInterface
public interface SuppExL
{
	long get() throws Exception;
	
	public static SuppExL of(long value)
	{
		return () -> value;
	}
}
