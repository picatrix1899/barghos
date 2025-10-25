package org.barghos.api.core.supplier.bigis;

import java.math.BigInteger;

@FunctionalInterface
public interface ISuppBigi3A
{
	BigInteger[][][] get();
	
	public static ISuppBigi3A of(BigInteger[][][] value)
	{
		return () -> value;
	}
}
