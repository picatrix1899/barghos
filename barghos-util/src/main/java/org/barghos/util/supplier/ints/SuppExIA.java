package org.barghos.util.supplier.ints;

@FunctionalInterface
public interface SuppExIA
{
	int[] get() throws Exception;
	
	public static SuppExIA of(int[] value)
	{
		return () -> value;
	}
}
