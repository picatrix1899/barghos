package org.barghos.util.supplier.bytes;

@FunctionalInterface
public interface SuppB3A
{
	byte[][][] get();
	
	public static SuppB3A of(byte[][][] value)
	{
		return () -> value;
	}
}
