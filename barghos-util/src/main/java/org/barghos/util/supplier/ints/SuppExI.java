package org.barghos.util.supplier.ints;

@FunctionalInterface
public interface SuppExI
{
	int get() throws Exception;
	
	public static SuppExI of(int value)
	{
		return () -> value;
	}
}
