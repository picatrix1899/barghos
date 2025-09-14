package org.barghos.api.core.supplier.bigds;

import java.math.BigDecimal;

@FunctionalInterface
public interface SuppExBigd3A
{
	BigDecimal[][][] get() throws Exception;
	
	public static SuppExBigd3A of(BigDecimal[][][] value)
	{
		return () -> value;
	}
}
