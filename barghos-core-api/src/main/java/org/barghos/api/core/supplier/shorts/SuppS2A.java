package org.barghos.api.core.supplier.shorts;

@FunctionalInterface
public interface SuppS2A
{
	short[][] get();
	
	public static SuppS2A of(short[][] value)
	{
		return () -> value;
	}
}
