package org.barghos.util.supplier.shorts;

@FunctionalInterface
public interface SuppS3A
{
	short[][][] get();
	
	public static SuppS3A of(short[][][] value)
	{
		return () -> value;
	}
}
