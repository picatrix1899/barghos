package org.barghos.api.core.supplier.bytes;

@FunctionalInterface
public interface SuppB2A
{
	byte[][] get();
	
	public static SuppB2A of(byte[][] value)
	{
		return () -> value;
	}
}
