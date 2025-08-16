package org.barghos.util.supplier.bigis;

import java.math.BigInteger;

@FunctionalInterface
public interface SuppBigiA
{
	BigInteger[] get();
	
	public static SuppBigiA of(BigInteger[] value)
	{
		return () -> value;
	}
}
