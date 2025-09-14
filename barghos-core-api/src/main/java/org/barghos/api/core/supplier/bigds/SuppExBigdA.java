package org.barghos.api.core.supplier.bigds;

import java.math.BigDecimal;

@FunctionalInterface
public interface SuppExBigdA
{
	BigDecimal[] get() throws Exception;
	
	public static SuppExBigdA of(BigDecimal[] value)
	{
		return () -> value;
	}
}
