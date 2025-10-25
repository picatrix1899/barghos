package org.barghos.api.core.supplier.bytes;

@FunctionalInterface
public interface ISuppBA
{
	byte[] get();
	
	public static ISuppBA of(byte[] value)
	{
		return () -> value;
	}
}
