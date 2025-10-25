package org.barghos.api.core.supplier.shorts;

@FunctionalInterface
public interface ISuppS
{
	short get();
	
	public static ISuppS of(short value)
	{
		return () -> value;
	}
}
