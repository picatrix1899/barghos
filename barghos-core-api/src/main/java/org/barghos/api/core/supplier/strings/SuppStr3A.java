package org.barghos.api.core.supplier.strings;

@FunctionalInterface
public interface SuppStr3A
{
	String[][][] get();
	
	public static SuppStr3A of(String[][][] value)
	{
		return () -> value;
	}
}
