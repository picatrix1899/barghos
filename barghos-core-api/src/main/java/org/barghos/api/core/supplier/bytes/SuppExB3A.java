package org.barghos.api.core.supplier.bytes;

@FunctionalInterface
public interface SuppExB3A
{
	byte[][][] get() throws Exception;
	
	public static SuppExB3A of(byte[][][] value)
	{
		return () -> value;
	}
}
