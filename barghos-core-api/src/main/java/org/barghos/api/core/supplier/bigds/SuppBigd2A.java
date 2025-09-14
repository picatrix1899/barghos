package org.barghos.api.core.supplier.bigds;

import java.math.BigDecimal;

@FunctionalInterface
public interface SuppBigd2A
{
	BigDecimal[][] get();
	
	public static SuppBigd2A of(BigDecimal[][] value)
	{
		return () -> value;
	}
}
