package org.barghos.api.core.supplier.strings;

@FunctionalInterface
public interface ISuppStr3A
{
	String[][][] get();
	
	public static ISuppStr3A of(String[][][] value)
	{
		return () -> value;
	}
}
