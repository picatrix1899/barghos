package org.barghos.util.supplier.chars;

@FunctionalInterface
public interface SuppExC2A
{
	char[][] get() throws Exception;
	
	public static SuppExC2A of(char[][] value)
	{
		return () -> value;
	}
}
