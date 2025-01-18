package org.barghos.util.supplier.bigds;

import java.math.BigDecimal;

import org.barghos.util.supplier.Supplier;

/**
 * Represents a supplier of 2-dimensional {@link BigDecimal} arrays.
 *
 * <p>
 * There is no requirement that a new or distinct result be returned each
 * time the supplier is invoked.
 *
 * <p>
 * This is a functional interface whose functional method is
 * {@link #getBigdA2()}.
 * 
 * @see SupplierBigdA2
 * @see SupplierExBigdA2
 */
@FunctionalInterface
public interface SupplierBigdA2 extends Supplier<BigDecimal[][]>
{
	
	/**
	 * Gets a result.
	 *
	 * @return A result.
	 */
	BigDecimal[][] getBigdA2();
	
	@Override
	default BigDecimal[][] get()
	{
		return getBigdA2();
	}
	
	public static SupplierBigdA2 of(BigDecimal[][] value)
	{
		return () -> value;
	}
	
}
