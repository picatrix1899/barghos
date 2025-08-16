package org.barghos.util.supplier.floats;

@FunctionalInterface
public interface SuppFA
{
	float[] get();
	
	public static SuppFA of(float[] value)
	{
		return () -> value;
	}
}
