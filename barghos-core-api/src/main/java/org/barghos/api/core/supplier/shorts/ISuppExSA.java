package org.barghos.api.core.supplier.shorts;

@FunctionalInterface
public interface ISuppExSA
{
	short[] get() throws Exception;
	
	public static ISuppExSA of(short[] value)
	{
		return () -> value;
	}
}
