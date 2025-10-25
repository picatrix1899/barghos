package org.barghos.api.core.supplier.longs;

@FunctionalInterface
public interface ISuppExL
{
	long get() throws Exception;
	
	public static ISuppExL of(long value)
	{
		return () -> value;
	}
}
