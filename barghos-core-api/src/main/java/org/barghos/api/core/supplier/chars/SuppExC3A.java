package org.barghos.api.core.supplier.chars;

@FunctionalInterface
public interface SuppExC3A
{
	char[][][] get() throws Exception;
	
	public static SuppExC3A of(char[][][] value)
	{
		return () -> value;
	}
}
