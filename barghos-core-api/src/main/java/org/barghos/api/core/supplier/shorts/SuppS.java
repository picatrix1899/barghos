package org.barghos.api.core.supplier.shorts;

@FunctionalInterface
public interface SuppS
{
	short get();
	
	public static SuppS of(short value)
	{
		return () -> value;
	}
}
