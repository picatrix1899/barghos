package org.barghos.api.core.supplier.doubles;

@FunctionalInterface
public interface SuppExD
{
	double get() throws Exception;
	
	public static SuppExD of(double value)
	{
		return () -> value;
	}
}
