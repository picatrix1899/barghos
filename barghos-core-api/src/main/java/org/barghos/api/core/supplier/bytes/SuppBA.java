package org.barghos.api.core.supplier.bytes;

@FunctionalInterface
public interface SuppBA
{
	byte[] get();
	
	public static SuppBA of(byte[] value)
	{
		return () -> value;
	}
}
