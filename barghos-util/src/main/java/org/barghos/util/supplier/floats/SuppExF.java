package org.barghos.util.supplier.floats;

@FunctionalInterface
public interface SuppExF
{
	float get() throws Exception;
	
	public static SuppExF of(float value)
	{
		return () -> value;
	}
}
