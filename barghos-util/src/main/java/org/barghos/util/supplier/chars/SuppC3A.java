package org.barghos.util.supplier.chars;

@FunctionalInterface
public interface SuppC3A
{
	char[][][] get();
	
	public static SuppC3A of(char[][][] value)
	{
		return () -> value;
	}
}
