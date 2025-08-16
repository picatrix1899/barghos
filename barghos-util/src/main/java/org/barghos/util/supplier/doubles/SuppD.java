package org.barghos.util.supplier.doubles;

@FunctionalInterface
public interface SuppD
{
	double get();
	
	public static SuppD of(double value)
	{
		return () -> value;
	}
}
