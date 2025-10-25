package org.barghos.api.core.supplier.bools;

@FunctionalInterface
public interface ISuppBo2A
{
	boolean[][] get();
	
	public static ISuppBo2A of(boolean[][] value)
	{
		return () -> value;
	}
}
