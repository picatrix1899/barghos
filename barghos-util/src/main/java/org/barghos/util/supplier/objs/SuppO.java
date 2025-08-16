package org.barghos.util.supplier.objs;

@FunctionalInterface
public interface SuppO
{
	Object get();
	
	public static SuppO of(Object value)
	{
		return () -> value;
	}
}
