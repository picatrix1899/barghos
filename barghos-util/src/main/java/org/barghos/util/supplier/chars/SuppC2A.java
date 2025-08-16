package org.barghos.util.supplier.chars;

@FunctionalInterface
public interface SuppC2A
{
	char[][] get();
	
	public static SuppC2A of(char[][] value)
	{
		return () -> value;
	}
}
