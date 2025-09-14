package org.barghos.api.core.supplier.objs;

@FunctionalInterface
public interface SuppExO2A
{
	Object[][] get() throws Exception;
	
	public static SuppExO2A of(Object[][] value)
	{
		return () -> value;
	}
}
