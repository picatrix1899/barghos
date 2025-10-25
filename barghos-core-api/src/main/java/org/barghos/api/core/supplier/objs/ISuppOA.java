package org.barghos.api.core.supplier.objs;

@FunctionalInterface
public interface ISuppOA
{
	Object[] get();
	
	public static ISuppOA of(Object[] value)
	{
		return () -> value;
	}
}
