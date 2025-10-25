package org.barghos.api.core.supplier.bigds;

import java.math.BigDecimal;

@FunctionalInterface
public interface ISuppBigd
{
	BigDecimal get();
	
	public static ISuppBigd of(BigDecimal value)
	{
		return () -> value;
	}
}
