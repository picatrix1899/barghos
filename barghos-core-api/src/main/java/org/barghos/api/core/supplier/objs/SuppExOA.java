package org.barghos.api.core.supplier.objs;

@FunctionalInterface
public interface SuppExOA
{
	Object[] get() throws Exception;
	
	public static SuppExOA of(Object[] value)
	{
		return () -> value;
	}
}
