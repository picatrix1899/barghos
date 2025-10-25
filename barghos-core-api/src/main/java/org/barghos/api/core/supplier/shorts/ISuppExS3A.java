package org.barghos.api.core.supplier.shorts;

@FunctionalInterface
public interface ISuppExS3A
{
	short[][][] get() throws Exception;
	
	public static ISuppExS3A of(short[][][] value)
	{
		return () -> value;
	}
}
