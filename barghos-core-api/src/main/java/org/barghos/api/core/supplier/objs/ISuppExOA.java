package org.barghos.api.core.supplier.objs;

@FunctionalInterface
public interface ISuppExOA
{
	Object[] get() throws Exception;
	
	public static ISuppExOA of(Object[] value)
	{
		return () -> value;
	}
}
