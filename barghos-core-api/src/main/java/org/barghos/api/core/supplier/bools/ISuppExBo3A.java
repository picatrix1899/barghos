package org.barghos.api.core.supplier.bools;

@FunctionalInterface
public interface ISuppExBo3A
{
	boolean[][][] get() throws Exception;
	
	public static ISuppExBo3A of(boolean[][][] value)
	{
		return () -> value;
	}
}
