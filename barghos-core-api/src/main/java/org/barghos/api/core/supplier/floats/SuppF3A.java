package org.barghos.api.core.supplier.floats;

@FunctionalInterface
public interface SuppF3A
{
	float[][][] get();
	
	public static SuppF3A of(float[][][] value)
	{
		return () -> value;
	}
}
