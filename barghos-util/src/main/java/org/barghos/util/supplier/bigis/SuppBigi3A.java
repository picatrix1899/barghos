package org.barghos.util.supplier.bigis;

import java.math.BigInteger;

@FunctionalInterface
public interface SuppBigi3A
{
	BigInteger[][][] get();
	
	public static SuppBigi3A of(BigInteger[][][] value)
	{
		return () -> value;
	}
}
