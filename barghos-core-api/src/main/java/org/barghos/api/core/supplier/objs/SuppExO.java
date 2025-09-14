package org.barghos.api.core.supplier.objs;

@FunctionalInterface
public interface SuppExO
{
	Object get() throws Exception;
	
	public static SuppExO of(Object value)
	{
		return () -> value;
	}
}
