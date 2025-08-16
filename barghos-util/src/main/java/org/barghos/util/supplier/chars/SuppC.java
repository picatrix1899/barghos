package org.barghos.util.supplier.chars;

@FunctionalInterface
public interface SuppC
{
	char get();
	
	public static SuppC of(char value)
	{
		return () -> value;
	}
}
