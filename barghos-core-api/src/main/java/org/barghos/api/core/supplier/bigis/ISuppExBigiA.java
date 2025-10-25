package org.barghos.api.core.supplier.bigis;

import java.math.BigInteger;

@FunctionalInterface
public interface ISuppExBigiA
{
	BigInteger[] get() throws Exception;
	
	public static ISuppExBigiA of(BigInteger[] value)
	{
		return () -> value;
	}
}
