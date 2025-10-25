package org.barghos.api.core.supplier.doubles;

@FunctionalInterface
public interface ISuppDA
{
	double[] get();
	
	public static ISuppDA of(double[] value)
	{
		return () -> value;
	}
}
