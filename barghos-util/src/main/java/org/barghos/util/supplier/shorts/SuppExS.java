package org.barghos.util.supplier.shorts;

@FunctionalInterface
public interface SuppExS
{
	short get() throws Exception;
	
	public static SuppExS of(short value)
	{
		return () -> value;
	}
}
