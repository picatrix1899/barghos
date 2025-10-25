package org.barghos.api.core.supplier.objs;

@FunctionalInterface
public interface ISuppO2A
{
	Object[][] get();
	
	public static ISuppO2A of(Object[][] value)
	{
		return () -> value;
	}
}
