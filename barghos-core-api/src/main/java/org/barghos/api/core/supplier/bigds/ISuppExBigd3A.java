package org.barghos.api.core.supplier.bigds;

import java.math.BigDecimal;

@FunctionalInterface
public interface ISuppExBigd3A
{
	BigDecimal[][][] get() throws Exception;
	
	public static ISuppExBigd3A of(BigDecimal[][][] value)
	{
		return () -> value;
	}
}
