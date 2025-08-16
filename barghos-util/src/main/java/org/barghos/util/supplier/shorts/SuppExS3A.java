package org.barghos.util.supplier.shorts;

@FunctionalInterface
public interface SuppExS3A
{
	short[][][] get() throws Exception;
	
	public static SuppExS3A of(short[][][] value)
	{
		return () -> value;
	}
}
