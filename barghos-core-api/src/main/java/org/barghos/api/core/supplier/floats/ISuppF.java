package org.barghos.api.core.supplier.floats;

@FunctionalInterface
public interface ISuppF
{
	float get();
	
	public static ISuppF of(float value)
	{
		return () -> value;
	}
}
