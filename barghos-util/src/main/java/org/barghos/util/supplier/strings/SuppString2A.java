package org.barghos.util.supplier.strings;

@FunctionalInterface
public interface SuppString2A
{
	String[][] get();
	
	public static SuppString2A of(String[][] value)
	{
		return () -> value;
	}
}
