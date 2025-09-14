package org.barghos.api.core.supplier.bools;

@FunctionalInterface
public interface SuppExBoA
{
	boolean[] get() throws Exception;
	
	public static SuppExBoA of(boolean[] value)
	{
		return () -> value;
	}
}
