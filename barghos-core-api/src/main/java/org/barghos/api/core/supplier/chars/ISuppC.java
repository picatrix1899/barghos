package org.barghos.api.core.supplier.chars;

@FunctionalInterface
public interface ISuppC
{
	char get();
	
	public static ISuppC of(char value)
	{
		return () -> value;
	}
}
