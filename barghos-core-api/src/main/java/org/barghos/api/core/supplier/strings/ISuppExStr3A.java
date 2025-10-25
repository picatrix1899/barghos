package org.barghos.api.core.supplier.strings;

@FunctionalInterface
public interface ISuppExStr3A
{
	String[][][] get() throws Exception;
	
	public static ISuppExStr3A of(String[][][] value)
	{
		return () -> value;
	}
}
