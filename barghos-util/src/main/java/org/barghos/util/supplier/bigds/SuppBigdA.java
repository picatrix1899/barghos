package org.barghos.util.supplier.bigds;

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
