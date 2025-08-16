package org.barghos.util.supplier.longs;

@FunctionalInterface
public interface SuppExL2A
{
	long[][] get() throws Exception;
	
	public static SuppExL2A of(long[][] value)
	{
		return () -> value;
	}
}
