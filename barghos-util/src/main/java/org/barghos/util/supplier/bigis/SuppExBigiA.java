package org.barghos.util.supplier.bigis;

import java.math.BigInteger;

@FunctionalInterface
public interface SuppExBigiA
{
	BigInteger[] get() throws Exception;
	
	public static SuppExBigiA of(BigInteger[] value)
	{
		return () -> value;
	}
}
