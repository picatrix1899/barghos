package org.barghos.util.supplier.floats;

@FunctionalInterface
public interface SuppExFA
{
	float[] get() throws Exception;
	
	public static SuppExFA of(float[] value)
	{
		return () -> value;
	}
}
