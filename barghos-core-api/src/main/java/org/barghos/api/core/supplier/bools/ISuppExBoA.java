package org.barghos.api.core.supplier.bools;

@FunctionalInterface
public interface ISuppExBoA
{
	boolean[] get() throws Exception;
	
	public static ISuppExBoA of(boolean[] value)
	{
		return () -> value;
	}
}
