package org.barghos.api.core.supplier.floats;

@FunctionalInterface
public interface SuppF
{
	float get();
	
	public static SuppF of(float value)
	{
		return () -> value;
	}
}
