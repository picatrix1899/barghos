package org.barghos.util.supplier.floats;

@FunctionalInterface
public interface SuppF
{
	float get();
	
	public static SuppF of(float value)
	{
		return () -> value;
	}
}
