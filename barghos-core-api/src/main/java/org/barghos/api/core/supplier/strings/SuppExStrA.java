package org.barghos.api.core.supplier.strings;

@FunctionalInterface
public interface SuppExStrA
{
	String[] get() throws Exception;
	
	public static SuppExStrA of(String[] value)
	{
		return () -> value;
	}
}
