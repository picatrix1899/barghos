package org.barghos.api.core.supplier.doubles;

@FunctionalInterface
public interface SuppD2A
{
	double[][] get();
	
	public static SuppD2A of(double[][] value)
	{
		return () -> value;
	}
}
