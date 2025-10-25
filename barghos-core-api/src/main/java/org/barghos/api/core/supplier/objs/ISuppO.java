package org.barghos.api.core.supplier.objs;

@FunctionalInterface
public interface ISuppO
{
	Object get();
	
	public static ISuppO of(Object value)
	{
		return () -> value;
	}
}
