package org.barghos.api.core.supplier.chars;

@FunctionalInterface
public interface ISuppExC2A
{
	char[][] get() throws Exception;
	
	public static ISuppExC2A of(char[][] value)
	{
		return () -> value;
	}
}
