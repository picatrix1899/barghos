package org.barghos.api.core.supplier.strings;

@FunctionalInterface
public interface SuppStr
{
	String get();
	
	public static SuppStr of(String value)
	{
		return () -> value;
	}
}
