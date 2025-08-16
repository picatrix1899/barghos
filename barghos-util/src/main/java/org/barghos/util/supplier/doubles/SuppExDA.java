package org.barghos.util.supplier.doubles;

@FunctionalInterface
public interface SuppExDA
{
	double[] get() throws Exception;
	
	public static SuppExDA of(double[] value)
	{
		return () -> value;
	}
}
