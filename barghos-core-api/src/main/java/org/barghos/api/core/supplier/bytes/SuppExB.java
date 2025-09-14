package org.barghos.api.core.supplier.bytes;

@FunctionalInterface
public interface SuppExB
{
	byte get() throws Exception;
	
	public static SuppExB of(byte value)
	{
		return () -> value;
	}
}
