package org.barghos.util.supplier.shorts;

@FunctionalInterface
public interface SuppExSA
{
	short[] get() throws Exception;
	
	public static SuppExSA of(short[] value)
	{
		return () -> value;
	}
}
