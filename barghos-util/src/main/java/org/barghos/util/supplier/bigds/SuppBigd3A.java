package org.barghos.util.supplier.bigds;

import java.math.BigDecimal;

@FunctionalInterface
public interface SuppBigd3A
{
	BigDecimal[][][] get();
	
	public static SuppBigd3A of(BigDecimal[][][] value)
	{
		return () -> value;
	}
}
