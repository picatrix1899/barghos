package org.barghos.util.supplier.strings;

@FunctionalInterface
public interface SuppExString
{
	String get() throws Exception;
	
	public static SuppExString of(String value)
	{
		return () -> value;
	}
}
