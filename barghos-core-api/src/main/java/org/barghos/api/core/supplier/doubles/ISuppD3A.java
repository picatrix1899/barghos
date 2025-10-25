package org.barghos.api.core.supplier.doubles;

@FunctionalInterface
public interface ISuppD3A
{
	double[][][] get();
	
	public static ISuppD3A of(double[][][] value)
	{
		return () -> value;
	}
}
