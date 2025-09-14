package org.barghos.api.core.supplier.objs;

@FunctionalInterface
public interface SuppOA
{
	Object[] get();
	
	public static SuppOA of(Object[] value)
	{
		return () -> value;
	}
}
