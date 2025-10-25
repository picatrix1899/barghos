package org.barghos.api.core.supplier.bools;

@FunctionalInterface
public interface ISuppExBo
{
	boolean get() throws Exception;
	
	public static ISuppExBo of(boolean value)
	{
		return () -> value;
	}
}
