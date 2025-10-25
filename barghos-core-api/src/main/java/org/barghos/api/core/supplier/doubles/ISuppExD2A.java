package org.barghos.api.core.supplier.doubles;

@FunctionalInterface
public interface ISuppExD2A
{
	double[][] get() throws Exception;
	
	public static ISuppExD2A of(double[][] value)
	{
		return () -> value;
	}
}
