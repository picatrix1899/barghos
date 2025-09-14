package org.barghos.api.core.supplier.strings;

@FunctionalInterface
public interface SuppExStr3A
{
	String[][][] get() throws Exception;
	
	public static SuppExStr3A of(String[][][] value)
	{
		return () -> value;
	}
}
