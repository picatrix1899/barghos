package org.barghos.util.supplier.bigis;

import java.math.BigInteger;

@FunctionalInterface
public interface SuppBigi2A
{
	BigInteger[][] get();
	
	public static SuppBigi2A of(BigInteger[][] value)
	{
		return () -> value;
	}
}
