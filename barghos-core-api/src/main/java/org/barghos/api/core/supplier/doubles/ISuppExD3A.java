package org.barghos.api.core.supplier.doubles;

@FunctionalInterface
public interface ISuppExD3A
{
	double[][][] get() throws Exception;
	
	public static ISuppExD3A of(double[][][] value)
	{
		return () -> value;
	}
}
