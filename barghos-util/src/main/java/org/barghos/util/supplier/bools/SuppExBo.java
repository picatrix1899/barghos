package org.barghos.util.supplier.bools;

@FunctionalInterface
public interface SuppExBo
{
	boolean get() throws Exception;
	
	public static SuppExBo of(boolean value)
	{
		return () -> value;
	}
}
