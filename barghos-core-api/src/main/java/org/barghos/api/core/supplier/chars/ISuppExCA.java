package org.barghos.api.core.supplier.chars;

@FunctionalInterface
public interface ISuppExCA
{
	char[] get() throws Exception;
	
	public static ISuppExCA of(char[] value)
	{
		return () -> value;
	}
}
