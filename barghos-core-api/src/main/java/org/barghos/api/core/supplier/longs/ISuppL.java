package org.barghos.api.core.supplier.longs;

@FunctionalInterface
public interface ISuppL
{
	long get();
	
	public static ISuppL of(long value)
	{
		return () -> value;
	}
}
