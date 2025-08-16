package org.barghos.util.supplier.bools;

@FunctionalInterface
public interface SuppExBo3A
{
	boolean[][][] get() throws Exception;
	
	public static SuppExBo3A of(boolean[][][] value)
	{
		return () -> value;
	}
}
