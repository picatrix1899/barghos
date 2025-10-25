package org.barghos.api.core.supplier.strings;

@FunctionalInterface
public interface ISuppExStrA
{
	String[] get() throws Exception;
	
	public static ISuppExStrA of(String[] value)
	{
		return () -> value;
	}
}
