package org.barghos.api.core.supplier.chars;

@FunctionalInterface
public interface SuppC3A
{
	char[][][] get();
	
	public static SuppC3A of(char[][][] value)
	{
		return () -> value;
	}
}
