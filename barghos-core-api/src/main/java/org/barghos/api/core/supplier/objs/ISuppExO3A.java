package org.barghos.api.core.supplier.objs;

@FunctionalInterface
public interface ISuppExO3A
{
	Object[][][] get() throws Exception;
	
	public static ISuppExO3A of(Object[][][] value)
	{
		return () -> value;
	}
}
