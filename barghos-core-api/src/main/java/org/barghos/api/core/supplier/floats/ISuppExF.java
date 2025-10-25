package org.barghos.api.core.supplier.floats;

@FunctionalInterface
public interface ISuppExF
{
	float get() throws Exception;
	
	public static ISuppExF of(float value)
	{
		return () -> value;
	}
}
