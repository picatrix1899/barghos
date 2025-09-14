package org.barghos.api.core.supplier.objs;

@FunctionalInterface
public interface SuppO3A
{
	Object[][][] get();
	
	public static SuppO3A of(Object[][][] value)
	{
		return () -> value;
	}
}
