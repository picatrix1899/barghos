package org.barghos.api.core.supplier.bigis;

import java.math.BigInteger;

@FunctionalInterface
public interface SuppExBigi
{
	BigInteger get() throws Exception;
	
	public static SuppExBigi of(BigInteger value)
	{
		return () -> value;
	}
}
