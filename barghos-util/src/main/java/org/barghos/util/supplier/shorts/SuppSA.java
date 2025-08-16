package org.barghos.util.supplier.shorts;

@FunctionalInterface
public interface SuppSA
{
	short[] get();
	
	public static SuppSA of(short[] value)
	{
		return () -> value;
	}
}
