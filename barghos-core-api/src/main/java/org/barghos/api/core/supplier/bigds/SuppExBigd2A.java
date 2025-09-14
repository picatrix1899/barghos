package org.barghos.api.core.supplier.bigds;

import java.math.BigDecimal;

@FunctionalInterface
public interface SuppExBigd2A
{
	BigDecimal[][] get() throws Exception;
	
	public static SuppExBigd2A of(BigDecimal[][] value)
	{
		return () -> value;
	}
}
