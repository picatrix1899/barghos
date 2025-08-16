package org.barghos.util.supplier.bools;

@FunctionalInterface
public interface SuppBo3A
{
	boolean[][][] get();
	
	public static SuppBo3A of(boolean[][][] value)
	{
		return () -> value;
	}
}
