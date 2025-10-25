package org.barghos.api.core.supplier.bigds;

import java.math.BigDecimal;

@FunctionalInterface
public interface ISuppExBigdA
{
	BigDecimal[] get() throws Exception;
	
	public static ISuppExBigdA of(BigDecimal[] value)
	{
		return () -> value;
	}
}
