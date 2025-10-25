package org.barghos.api.core.supplier.floats;

@FunctionalInterface
public interface ISuppExF2A
{
	float[][] get() throws Exception;
	
	public static ISuppExF2A of(float[][] value)
	{
		return () -> value;
	}
}
