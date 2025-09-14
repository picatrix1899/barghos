package org.barghos.api.core.supplier.strings;

@FunctionalInterface
public interface SuppStrA
{
	String[] get();
	
	public static SuppStrA of(String[] value)
	{
		return () -> value;
	}
}
