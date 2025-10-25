package org.barghos.api.core.supplier.longs;

@FunctionalInterface
public interface ISuppExL2A
{
	long[][] get() throws Exception;
	
	public static ISuppExL2A of(long[][] value)
	{
		return () -> value;
	}
}
