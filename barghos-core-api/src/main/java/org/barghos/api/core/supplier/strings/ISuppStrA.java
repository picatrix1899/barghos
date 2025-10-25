package org.barghos.api.core.supplier.strings;

@FunctionalInterface
public interface ISuppStrA
{
	String[] get();
	
	public static ISuppStrA of(String[] value)
	{
		return () -> value;
	}
}
