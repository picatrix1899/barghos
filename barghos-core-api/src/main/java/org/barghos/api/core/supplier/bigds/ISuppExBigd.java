package org.barghos.api.core.supplier.bigds;

import java.math.BigDecimal;

@FunctionalInterface
public interface ISuppExBigd
{
	BigDecimal get() throws Exception;
	
	public static ISuppExBigd of(BigDecimal value)
	{
		return () -> value;
	}
}
