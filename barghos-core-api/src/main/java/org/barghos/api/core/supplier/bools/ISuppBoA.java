package org.barghos.api.core.supplier.bools;

@FunctionalInterface
public interface ISuppBoA
{
	boolean[] get();
	
	public static ISuppBoA of(boolean[] value)
	{
		return () -> value;
	}
}
