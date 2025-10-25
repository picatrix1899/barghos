package org.barghos.api.core.supplier.floats;

@FunctionalInterface
public interface ISuppF2A
{
	float[][] get();
	
	public static ISuppF2A of(float[][] value)
	{
		return () -> value;
	}
}
