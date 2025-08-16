package org.barghos.util.supplier.bytes;

@FunctionalInterface
public interface SuppExBA
{
	byte[] get() throws Exception;
	
	public static SuppExBA of(byte[] value)
	{
		return () -> value;
	}
}
