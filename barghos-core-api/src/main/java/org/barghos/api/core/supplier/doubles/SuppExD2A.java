package org.barghos.api.core.supplier.doubles;

@FunctionalInterface
public interface SuppExD2A
{
	double[][] get() throws Exception;
	
	public static SuppExD2A of(double[][] value)
	{
		return () -> value;
	}
}
