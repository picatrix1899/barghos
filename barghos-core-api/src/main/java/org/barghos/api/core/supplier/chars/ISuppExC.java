package org.barghos.api.core.supplier.chars;

@FunctionalInterface
public interface ISuppExC
{
	char get() throws Exception;
	
	public static ISuppExC of(char value)
	{
		return () -> value;
	}
}
