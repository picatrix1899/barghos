package org.barghos.api.core.supplier.bools;

@FunctionalInterface
public interface ISuppBo
{
	boolean get();
	
	public static ISuppBo of(boolean value)
	{
		return () -> value;
	}
}
