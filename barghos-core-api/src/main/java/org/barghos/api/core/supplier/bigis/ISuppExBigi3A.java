package org.barghos.api.core.supplier.bigis;

import java.math.BigInteger;

@FunctionalInterface
public interface ISuppExBigi3A
{
	BigInteger[][][] get() throws Exception;
	
	public static ISuppExBigi3A of(BigInteger[][][] value)
	{
		return () -> value;
	}
}
