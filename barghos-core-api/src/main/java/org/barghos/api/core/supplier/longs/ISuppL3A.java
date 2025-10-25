package org.barghos.api.core.supplier.longs;

@FunctionalInterface
public interface ISuppL3A
{
	long[][][] get();
	
	public static ISuppL3A of(long[][][] value)
	{
		return () -> value;
	}
}
