package org.barghos.api.core.supplier.doubles;

@FunctionalInterface
public interface SuppExD3A
{
	double[][][] get() throws Exception;
	
	public static SuppExD3A of(double[][][] value)
	{
		return () -> value;
	}
}
