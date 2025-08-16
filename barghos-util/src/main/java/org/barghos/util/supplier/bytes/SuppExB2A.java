package org.barghos.util.supplier.bytes;

@FunctionalInterface
public interface SuppExB2A
{
	byte[][] get() throws Exception;
	
	public static SuppExB2A of(byte[][] value)
	{
		return () -> value;
	}
}
