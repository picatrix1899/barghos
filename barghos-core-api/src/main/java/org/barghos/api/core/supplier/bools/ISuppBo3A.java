package org.barghos.api.core.supplier.bools;

@FunctionalInterface
public interface ISuppBo3A
{
	boolean[][][] get();
	
	public static ISuppBo3A of(boolean[][][] value)
	{
		return () -> value;
	}
}
