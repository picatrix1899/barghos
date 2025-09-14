package org.barghos.api.core.supplier.floats;

@FunctionalInterface
public interface SuppExFA
{
	float[] get() throws Exception;
	
	public static SuppExFA of(float[] value)
	{
		return () -> value;
	}
}
