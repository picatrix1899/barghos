package org.barghos.api.core.supplier.bools;

@FunctionalInterface
public interface SuppExBo2A
{
	boolean[][] get() throws Exception;
	
	public static SuppExBo2A of(boolean[][] value)
	{
		return () -> value;
	}
}
