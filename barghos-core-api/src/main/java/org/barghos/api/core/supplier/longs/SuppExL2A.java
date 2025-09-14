package org.barghos.api.core.supplier.longs;

@FunctionalInterface
public interface SuppExL2A
{
	long[][] get() throws Exception;
	
	public static SuppExL2A of(long[][] value)
	{
		return () -> value;
	}
}
