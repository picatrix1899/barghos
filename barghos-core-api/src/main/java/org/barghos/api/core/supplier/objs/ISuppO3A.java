package org.barghos.api.core.supplier.objs;

@FunctionalInterface
public interface ISuppO3A
{
	Object[][][] get();
	
	public static ISuppO3A of(Object[][][] value)
	{
		return () -> value;
	}
}
