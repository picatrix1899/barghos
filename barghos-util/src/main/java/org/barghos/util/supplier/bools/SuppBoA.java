package org.barghos.util.supplier.bools;

@FunctionalInterface
public interface SuppBoA
{
	boolean[] get();
	
	public static SuppBoA of(boolean[] value)
	{
		return () -> value;
	}
}
