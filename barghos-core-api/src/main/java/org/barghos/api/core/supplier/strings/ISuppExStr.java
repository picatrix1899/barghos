package org.barghos.api.core.supplier.strings;

@FunctionalInterface
public interface ISuppExStr
{
	String get() throws Exception;
	
	public static ISuppExStr of(String value)
	{
		return () -> value;
	}
}
