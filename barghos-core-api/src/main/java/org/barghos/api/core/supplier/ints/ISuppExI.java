package org.barghos.api.core.supplier.ints;

@FunctionalInterface
public interface ISuppExI
{
	int get() throws Exception;
	
	public static ISuppExI of(int value)
	{
		return () -> value;
	}
}
