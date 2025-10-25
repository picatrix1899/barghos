package org.barghos.api.core.supplier.bigis;

import java.math.BigInteger;

@FunctionalInterface
public interface ISuppBigi2A
{
	BigInteger[][] get();
	
	public static ISuppBigi2A of(BigInteger[][] value)
	{
		return () -> value;
	}
}
