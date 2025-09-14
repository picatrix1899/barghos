package org.barghos.api.core.supplier.floats;

@FunctionalInterface
public interface SuppFA
{
	float[] get();
	
	public static SuppFA of(float[] value)
	{
		return () -> value;
	}
}
