package org.barghos.api.core.supplier.doubles;

@FunctionalInterface
public interface ISuppExD
{
	double get() throws Exception;
	
	public static ISuppExD of(double value)
	{
		return () -> value;
	}
}
