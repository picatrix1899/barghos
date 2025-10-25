package org.barghos.api.core.supplier.floats;

@FunctionalInterface
public interface ISuppFA
{
	float[] get();
	
	public static ISuppFA of(float[] value)
	{
		return () -> value;
	}
}
