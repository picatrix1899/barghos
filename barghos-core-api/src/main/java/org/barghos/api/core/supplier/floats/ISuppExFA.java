package org.barghos.api.core.supplier.floats;

@FunctionalInterface
public interface ISuppExFA
{
	float[] get() throws Exception;
	
	public static ISuppExFA of(float[] value)
	{
		return () -> value;
	}
}
