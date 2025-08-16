package org.barghos.util.supplier.chars;

@FunctionalInterface
public interface SuppExC
{
	char get() throws Exception;
	
	public static SuppExC of(char value)
	{
		return () -> value;
	}
}
