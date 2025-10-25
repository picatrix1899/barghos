package org.barghos.api.core.supplier.ints;

@FunctionalInterface
public interface ISuppExIA
{
	int[] get() throws Exception;
	
	public static ISuppExIA of(int[] value)
	{
		return () -> value;
	}
}
