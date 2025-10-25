package org.barghos.api.core.supplier.bigis;

import java.math.BigInteger;

@FunctionalInterface
public interface ISuppExBigi
{
	BigInteger get() throws Exception;
	
	public static ISuppExBigi of(BigInteger value)
	{
		return () -> value;
	}
}
