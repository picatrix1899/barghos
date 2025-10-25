package org.barghos.api.core.supplier.bools;

@FunctionalInterface
public interface ISuppExBo2A
{
	boolean[][] get() throws Exception;
	
	public static ISuppExBo2A of(boolean[][] value)
	{
		return () -> value;
	}
}
