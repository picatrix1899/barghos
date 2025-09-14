package org.barghos.api.core.supplier.ints;

@FunctionalInterface
public interface SuppExI
{
	int get() throws Exception;
	
	public static SuppExI of(int value)
	{
		return () -> value;
	}
}
