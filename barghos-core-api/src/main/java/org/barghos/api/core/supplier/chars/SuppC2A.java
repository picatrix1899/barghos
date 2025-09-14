package org.barghos.api.core.supplier.chars;

@FunctionalInterface
public interface SuppC2A
{
	char[][] get();
	
	public static SuppC2A of(char[][] value)
	{
		return () -> value;
	}
}
