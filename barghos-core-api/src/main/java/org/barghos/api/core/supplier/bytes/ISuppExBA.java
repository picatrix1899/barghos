package org.barghos.api.core.supplier.bytes;

@FunctionalInterface
public interface ISuppExBA
{
	byte[] get() throws Exception;
	
	public static ISuppExBA of(byte[] value)
	{
		return () -> value;
	}
}
