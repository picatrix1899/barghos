package org.barghos.api.core.supplier.objs;

@FunctionalInterface
public interface ISuppExO
{
	Object get() throws Exception;
	
	public static ISuppExO of(Object value)
	{
		return () -> value;
	}
}
