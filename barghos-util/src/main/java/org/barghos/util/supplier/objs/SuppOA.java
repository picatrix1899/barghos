package org.barghos.util.supplier.objs;

@FunctionalInterface
public interface SuppOA
{
	Object[] get();
	
	public static SuppOA of(Object[] value)
	{
		return () -> value;
	}
}
