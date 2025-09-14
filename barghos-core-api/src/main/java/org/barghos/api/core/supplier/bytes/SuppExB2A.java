package org.barghos.api.core.supplier.bytes;

@FunctionalInterface
public interface SuppExB2A
{
	byte[][] get() throws Exception;
	
	public static SuppExB2A of(byte[][] value)
	{
		return () -> value;
	}
}
