package org.barghos.api.core.supplier.shorts;

@FunctionalInterface
public interface ISuppSA
{
	short[] get();
	
	public static ISuppSA of(short[] value)
	{
		return () -> value;
	}
}
