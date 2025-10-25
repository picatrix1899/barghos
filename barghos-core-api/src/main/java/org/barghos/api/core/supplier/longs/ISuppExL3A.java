package org.barghos.api.core.supplier.longs;

@FunctionalInterface
public interface ISuppExL3A
{
	long[][][] get() throws Exception;
	
	public static ISuppExL3A of(long[][][] value)
	{
		return () -> value;
	}
}
