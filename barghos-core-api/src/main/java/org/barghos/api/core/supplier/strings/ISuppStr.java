package org.barghos.api.core.supplier.strings;

@FunctionalInterface
public interface ISuppStr
{
	String get();
	
	public static ISuppStr of(String value)
	{
		return () -> value;
	}
}
