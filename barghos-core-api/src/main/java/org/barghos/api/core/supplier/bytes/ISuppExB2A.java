package org.barghos.api.core.supplier.bytes;

@FunctionalInterface
public interface ISuppExB2A
{
	byte[][] get() throws Exception;
	
	public static ISuppExB2A of(byte[][] value)
	{
		return () -> value;
	}
}
