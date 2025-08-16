package org.barghos.util.supplier.strings;

@FunctionalInterface
public interface SuppExStr2A
{
	String[][] get() throws Exception;
	
	public static SuppExStr2A of(String[][] value)
	{
		return () -> value;
	}
}
