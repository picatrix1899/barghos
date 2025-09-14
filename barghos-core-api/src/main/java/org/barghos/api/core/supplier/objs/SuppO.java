package org.barghos.api.core.supplier.objs;

@FunctionalInterface
public interface SuppO
{
	Object get();
	
	public static SuppO of(Object value)
	{
		return () -> value;
	}
}
