package org.barghos.util.supplier.objs;

@FunctionalInterface
public interface SuppO2A
{
	Object[][] get();
	
	public static SuppO2A of(Object[][] value)
	{
		return () -> value;
	}
}
