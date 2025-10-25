package org.barghos.api.core.supplier.bigds;

import java.math.BigDecimal;

@FunctionalInterface
public interface ISuppBigd3A
{
	BigDecimal[][][] get();
	
	public static ISuppBigd3A of(BigDecimal[][][] value)
	{
		return () -> value;
	}
}
