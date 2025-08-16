package org.barghos.util.supplier.floats;

@FunctionalInterface
public interface SuppExF3A
{
	float[][][] get() throws Exception;
	
	public static SuppExF3A of(float[][][] value)
	{
		return () -> value;
	}
}
