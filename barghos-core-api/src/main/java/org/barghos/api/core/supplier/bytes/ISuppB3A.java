package org.barghos.api.core.supplier.bytes;

@FunctionalInterface
public interface ISuppB3A
{
	byte[][][] get();
	
	public static ISuppB3A of(byte[][][] value)
	{
		return () -> value;
	}
}
