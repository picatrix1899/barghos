package org.barghos.api.core.supplier.shorts;

@FunctionalInterface
public interface ISuppS3A
{
	short[][][] get();
	
	public static ISuppS3A of(short[][][] value)
	{
		return () -> value;
	}
}
