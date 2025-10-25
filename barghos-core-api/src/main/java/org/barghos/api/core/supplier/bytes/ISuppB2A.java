package org.barghos.api.core.supplier.bytes;

@FunctionalInterface
public interface ISuppB2A
{
	byte[][] get();
	
	public static ISuppB2A of(byte[][] value)
	{
		return () -> value;
	}
}
