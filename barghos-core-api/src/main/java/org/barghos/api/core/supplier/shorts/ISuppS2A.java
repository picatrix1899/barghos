package org.barghos.api.core.supplier.shorts;

@FunctionalInterface
public interface ISuppS2A
{
	short[][] get();
	
	public static ISuppS2A of(short[][] value)
	{
		return () -> value;
	}
}
