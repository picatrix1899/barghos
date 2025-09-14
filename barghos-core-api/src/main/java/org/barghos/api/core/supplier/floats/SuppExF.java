package org.barghos.api.core.supplier.floats;

@FunctionalInterface
public interface SuppExF
{
	float get() throws Exception;
	
	public static SuppExF of(float value)
	{
		return () -> value;
	}
}
