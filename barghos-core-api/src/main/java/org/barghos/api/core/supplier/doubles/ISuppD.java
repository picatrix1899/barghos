package org.barghos.api.core.supplier.doubles;

@FunctionalInterface
public interface ISuppD
{
	double get();
	
	public static ISuppD of(double value)
	{
		return () -> value;
	}
}
