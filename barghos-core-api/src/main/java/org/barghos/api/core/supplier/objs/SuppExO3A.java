package org.barghos.api.core.supplier.objs;

@FunctionalInterface
public interface SuppExO3A
{
	Object[][][] get() throws Exception;
	
	public static SuppExO3A of(Object[][][] value)
	{
		return () -> value;
	}
}
