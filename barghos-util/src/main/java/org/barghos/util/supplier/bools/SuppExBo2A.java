package org.barghos.util.supplier.bools;

@FunctionalInterface
public interface SuppExBo2A
{
	boolean[][] get() throws Exception;
	
	public static SuppExBo2A of(boolean[][] value)
	{
		return () -> value;
	}
}
