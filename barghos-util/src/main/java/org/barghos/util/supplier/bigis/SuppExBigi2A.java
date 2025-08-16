package org.barghos.util.supplier.bigis;

import java.math.BigInteger;

@FunctionalInterface
public interface SuppExBigi2A
{
	BigInteger[][] get() throws Exception;
	
	public static SuppExBigi2A of(BigInteger[][] value)
	{
		return () -> value;
	}
}
