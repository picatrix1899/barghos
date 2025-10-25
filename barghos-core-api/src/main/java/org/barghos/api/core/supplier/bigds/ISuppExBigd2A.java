package org.barghos.api.core.supplier.bigds;

import java.math.BigDecimal;

@FunctionalInterface
public interface ISuppExBigd2A
{
	BigDecimal[][] get() throws Exception;
	
	public static ISuppExBigd2A of(BigDecimal[][] value)
	{
		return () -> value;
	}
}
