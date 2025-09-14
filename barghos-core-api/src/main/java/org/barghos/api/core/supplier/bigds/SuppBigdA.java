package org.barghos.api.core.supplier.bigds;

import java.math.BigDecimal;

@FunctionalInterface
public interface SuppBigdA
{
	BigDecimal[] get();
	
	public static SuppBigdA of(BigDecimal[] value)
	{
		return () -> value;
	}
}
