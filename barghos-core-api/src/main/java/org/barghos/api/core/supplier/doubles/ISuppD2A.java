package org.barghos.api.core.supplier.doubles;

@FunctionalInterface
public interface ISuppD2A
{
	double[][] get();
	
	public static ISuppD2A of(double[][] value)
	{
		return () -> value;
	}
}
