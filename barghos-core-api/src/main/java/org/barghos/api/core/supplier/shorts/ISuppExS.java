package org.barghos.api.core.supplier.shorts;

@FunctionalInterface
public interface ISuppExS
{
	short get() throws Exception;
	
	public static ISuppExS of(short value)
	{
		return () -> value;
	}
}
