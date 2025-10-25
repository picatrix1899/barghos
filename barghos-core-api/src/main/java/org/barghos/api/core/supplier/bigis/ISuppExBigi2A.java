package org.barghos.api.core.supplier.bigis;

import java.math.BigInteger;

@FunctionalInterface
public interface ISuppExBigi2A
{
	BigInteger[][] get() throws Exception;
	
	public static ISuppExBigi2A of(BigInteger[][] value)
	{
		return () -> value;
	}
}
