package org.barghos.api.core.supplier.ints;

@FunctionalInterface
public interface SuppIA
{
	int[] get();
	
	public static SuppIA of(int[] value)
	{
		return () -> value;
	}
}
