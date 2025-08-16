package org.barghos.util.supplier.doubles;

@FunctionalInterface
public interface SuppDA
{
	double[] get();
	
	public static SuppDA of(double[] value)
	{
		return () -> value;
	}
}
