package org.barghos.util.supplier.bools;

@FunctionalInterface
public interface SuppBo
{
	boolean get();
	
	public static SuppBo of(boolean value)
	{
		return () -> value;
	}
}
