package org.barghos.api.core.supplier.bigis;

import java.math.BigInteger;

@FunctionalInterface
public interface SuppBigi
{
	BigInteger get();
	
	public static SuppBigi of(BigInteger value)
	{
		return () -> value;
	}
}
