package org.barghos.api.core.supplier.ints;

@FunctionalInterface
public interface ISuppI
{
	int get();
	
	public static ISuppI of(int value)
	{
		return () -> value;
	}
}
