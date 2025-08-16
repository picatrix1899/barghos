package org.barghos.util.supplier.bools;

@FunctionalInterface
public interface SuppExBoA
{
	boolean[] get() throws Exception;
	
	public static SuppExBoA of(boolean[] value)
	{
		return () -> value;
	}
}
