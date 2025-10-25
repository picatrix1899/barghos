package org.barghos.api.core.supplier.bytes;

@FunctionalInterface
public interface ISuppB
{
	byte get();
	
	public static ISuppB of(byte value)
	{
		return () -> value;
	}
}
