package org.barghos.api.core.supplier.strings;

@FunctionalInterface
public interface ISuppExStr2A
{
	String[][] get() throws Exception;
	
	public static ISuppExStr2A of(String[][] value)
	{
		return () -> value;
	}
}
