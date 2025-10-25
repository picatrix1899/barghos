package org.barghos.api.core.supplier.objs;

@FunctionalInterface
public interface ISuppExO2A
{
	Object[][] get() throws Exception;
	
	public static ISuppExO2A of(Object[][] value)
	{
		return () -> value;
	}
}
