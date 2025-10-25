package org.barghos.api.core.supplier.floats;

@FunctionalInterface
public interface ISuppExF3A
{
	float[][][] get() throws Exception;
	
	public static ISuppExF3A of(float[][][] value)
	{
		return () -> value;
	}
}
