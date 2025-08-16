package org.barghos.util.supplier.bytes;

@FunctionalInterface
public interface SuppB
{
	byte get();
	
	public static SuppB of(byte value)
	{
		return () -> value;
	}
}
