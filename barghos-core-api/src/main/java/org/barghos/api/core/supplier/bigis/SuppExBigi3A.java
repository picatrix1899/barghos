package org.barghos.api.core.supplier.bigis;

import java.math.BigInteger;

@FunctionalInterface
public interface SuppExBigi3A
{
	BigInteger[][][] get() throws Exception;
	
	public static SuppExBigi3A of(BigInteger[][][] value)
	{
		return () -> value;
	}
}
