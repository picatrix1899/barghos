package org.barghos.api.core.supplier.longs;

@FunctionalInterface
public interface ISuppL2A
{
	long[][] get();
	
	public static ISuppL2A of(long[][] value)
	{
		return () -> value;
	}
}
