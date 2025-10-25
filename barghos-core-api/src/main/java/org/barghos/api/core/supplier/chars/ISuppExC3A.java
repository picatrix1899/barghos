package org.barghos.api.core.supplier.chars;

@FunctionalInterface
public interface ISuppExC3A
{
	char[][][] get() throws Exception;
	
	public static ISuppExC3A of(char[][][] value)
	{
		return () -> value;
	}
}
