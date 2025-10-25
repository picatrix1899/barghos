package org.barghos.api.core.supplier.bigis;

import java.math.BigInteger;

@FunctionalInterface
public interface ISuppBigiA
{
	BigInteger[] get();
	
	public static ISuppBigiA of(BigInteger[] value)
	{
		return () -> value;
	}
}
