package org.barghos.api.core.supplier.floats;

@FunctionalInterface
public interface SuppF2A
{
	float[][] get();
	
	public static SuppF2A of(float[][] value)
	{
		return () -> value;
	}
}
