package org.barghos.api.core.supplier.bigds;

import java.math.BigDecimal;

@FunctionalInterface
public interface SuppExBigd
{
	BigDecimal get() throws Exception;
	
	public static SuppExBigd of(BigDecimal value)
	{
		return () -> value;
	}
}
