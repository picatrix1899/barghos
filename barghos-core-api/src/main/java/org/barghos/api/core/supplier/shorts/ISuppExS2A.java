package org.barghos.api.core.supplier.shorts;

@FunctionalInterface
public interface ISuppExS2A
{
	short[][] get() throws Exception;
	
	public static ISuppExS2A of(short[][] value)
	{
		return () -> value;
	}
}
