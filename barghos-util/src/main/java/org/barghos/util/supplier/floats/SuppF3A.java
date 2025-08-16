package org.barghos.util.supplier.floats;

@FunctionalInterface
public interface SuppF3A
{
	float[][][] get();
	
	public static SuppF3A of(float[][][] value)
	{
		return () -> value;
	}
}
