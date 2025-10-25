package org.barghos.api.core.supplier.bytes;

@FunctionalInterface
public interface ISuppExB
{
	byte get() throws Exception;
	
	public static ISuppExB of(byte value)
	{
		return () -> value;
	}
}
