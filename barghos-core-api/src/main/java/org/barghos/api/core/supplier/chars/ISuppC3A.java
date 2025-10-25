package org.barghos.api.core.supplier.chars;

@FunctionalInterface
public interface ISuppC3A
{
	char[][][] get();
	
	public static ISuppC3A of(char[][][] value)
	{
		return () -> value;
	}
}
