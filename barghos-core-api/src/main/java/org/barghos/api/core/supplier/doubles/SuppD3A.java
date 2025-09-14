package org.barghos.api.core.supplier.doubles;

@FunctionalInterface
public interface SuppD3A
{
	double[][][] get();
	
	public static SuppD3A of(double[][][] value)
	{
		return () -> value;
	}
}
