package org.barghos.api.core.supplier.chars;

@FunctionalInterface
public interface SuppCA
{
	char[] get();
	
	public static SuppCA of(char[] value)
	{
		return () -> value;
	}
}
