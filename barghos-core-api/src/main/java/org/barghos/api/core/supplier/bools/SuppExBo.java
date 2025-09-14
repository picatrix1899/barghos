package org.barghos.api.core.supplier.bools;

@FunctionalInterface
public interface SuppExBo
{
	boolean get() throws Exception;
	
	public static SuppExBo of(boolean value)
	{
		return () -> value;
	}
}
