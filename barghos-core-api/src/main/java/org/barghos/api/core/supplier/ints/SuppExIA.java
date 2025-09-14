package org.barghos.api.core.supplier.ints;

@FunctionalInterface
public interface SuppExIA
{
	int[] get() throws Exception;
	
	public static SuppExIA of(int[] value)
	{
		return () -> value;
	}
}
