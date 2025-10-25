package org.barghos.api.core.supplier.chars;

@FunctionalInterface
public interface ISuppCA
{
	char[] get();
	
	public static ISuppCA of(char[] value)
	{
		return () -> value;
	}
}
