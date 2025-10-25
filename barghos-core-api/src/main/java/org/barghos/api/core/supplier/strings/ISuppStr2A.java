package org.barghos.api.core.supplier.strings;

@FunctionalInterface
public interface ISuppStr2A
{
	String[][] get();
	
	public static ISuppStr2A of(String[][] value)
	{
		return () -> value;
	}
}
