package org.barghos.util.supplier.chars;

@FunctionalInterface
public interface SuppCA
{
	char[] get();
	
	public static SuppCA of(char[] value)
	{
		return () -> value;
	}
}
