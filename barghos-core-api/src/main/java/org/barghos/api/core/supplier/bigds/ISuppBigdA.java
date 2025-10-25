package org.barghos.api.core.supplier.bigds;

import java.math.BigDecimal;

@FunctionalInterface
public interface ISuppBigdA
{
	BigDecimal[] get();
	
	public static ISuppBigdA of(BigDecimal[] value)
	{
		return () -> value;
	}
}
