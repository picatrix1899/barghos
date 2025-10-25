package org.barghos.api.core.supplier.bigds;

import java.math.BigDecimal;

@FunctionalInterface
public interface ISuppBigd2A
{
	BigDecimal[][] get();
	
	public static ISuppBigd2A of(BigDecimal[][] value)
	{
		return () -> value;
	}
}
