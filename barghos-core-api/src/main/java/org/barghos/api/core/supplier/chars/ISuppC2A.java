package org.barghos.api.core.supplier.chars;

@FunctionalInterface
public interface ISuppC2A
{
	char[][] get();
	
	public static ISuppC2A of(char[][] value)
	{
		return () -> value;
	}
}
