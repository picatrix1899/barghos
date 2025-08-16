package org.barghos.util.supplier.bigds;

import java.math.BigDecimal;

@FunctionalInterface
public interface SuppBigd
{
	BigDecimal get();
	
	public static SuppBigd of(BigDecimal value)
	{
		return () -> value;
	}
}
