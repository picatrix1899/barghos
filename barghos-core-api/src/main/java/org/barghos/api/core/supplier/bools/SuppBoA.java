package org.barghos.api.core.supplier.bools;

@FunctionalInterface
public interface SuppBoA
{
	boolean[] get();
	
	public static SuppBoA of(boolean[] value)
	{
		return () -> value;
	}
}
