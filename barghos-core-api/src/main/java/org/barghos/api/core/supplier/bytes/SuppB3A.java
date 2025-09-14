package org.barghos.api.core.supplier.bytes;

@FunctionalInterface
public interface SuppB3A
{
	byte[][][] get();
	
	public static SuppB3A of(byte[][][] value)
	{
		return () -> value;
	}
}
