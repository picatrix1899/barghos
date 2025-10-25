package org.barghos.api.core.supplier.doubles;

@FunctionalInterface
public interface ISuppExDA
{
	double[] get() throws Exception;
	
	public static ISuppExDA of(double[] value)
	{
		return () -> value;
	}
}
