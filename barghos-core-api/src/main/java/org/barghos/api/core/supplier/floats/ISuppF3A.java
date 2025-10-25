package org.barghos.api.core.supplier.floats;

@FunctionalInterface
public interface ISuppF3A
{
	float[][][] get();
	
	public static ISuppF3A of(float[][][] value)
	{
		return () -> value;
	}
}
