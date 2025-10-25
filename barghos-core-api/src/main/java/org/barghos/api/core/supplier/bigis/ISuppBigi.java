package org.barghos.api.core.supplier.bigis;

import java.math.BigInteger;

@FunctionalInterface
public interface ISuppBigi
{
	BigInteger get();
	
	public static ISuppBigi of(BigInteger value)
	{
		return () -> value;
	}
}
