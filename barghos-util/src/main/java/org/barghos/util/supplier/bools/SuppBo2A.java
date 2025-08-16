package org.barghos.util.supplier.bools;

@FunctionalInterface
public interface SuppBo2A
{
	boolean[][] get();
	
	public static SuppBo2A of(boolean[][] value)
	{
		return () -> value;
	}
}
