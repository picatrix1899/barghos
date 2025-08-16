package org.barghos.util.supplier.chars;

@FunctionalInterface
public interface SuppExCA
{
	char[] get() throws Exception;
	
	public static SuppExCA of(char[] value)
	{
		return () -> value;
	}
}
