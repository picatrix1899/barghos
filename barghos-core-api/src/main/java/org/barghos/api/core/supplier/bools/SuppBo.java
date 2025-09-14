package org.barghos.api.core.supplier.bools;

@FunctionalInterface
public interface SuppBo
{
	boolean get();
	
	public static SuppBo of(boolean value)
	{
		return () -> value;
	}
}
