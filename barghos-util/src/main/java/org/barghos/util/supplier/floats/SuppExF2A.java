package org.barghos.util.supplier.floats;

@FunctionalInterface
public interface SuppExF2A
{
	float[][] get() throws Exception;
	
	public static SuppExF2A of(float[][] value)
	{
		return () -> value;
	}
}
