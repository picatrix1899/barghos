package org.barghos.api.core.supplier.shorts;

@FunctionalInterface
public interface SuppExS2A
{
	short[][] get() throws Exception;
	
	public static SuppExS2A of(short[][] value)
	{
		return () -> value;
	}
}
