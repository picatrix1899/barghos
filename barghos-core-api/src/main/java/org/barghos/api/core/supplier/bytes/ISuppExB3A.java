package org.barghos.api.core.supplier.bytes;

@FunctionalInterface
public interface ISuppExB3A
{
	byte[][][] get() throws Exception;
	
	public static ISuppExB3A of(byte[][][] value)
	{
		return () -> value;
	}
}
