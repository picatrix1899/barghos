package org.barghos.api.core.supplier.chars;

@FunctionalInterface
public interface SuppC
{
	char get();
	
	public static SuppC of(char value)
	{
		return () -> value;
	}
}
