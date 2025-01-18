package org.barghos.util.supplier.bigds;

import java.math.BigDecimal;

import org.barghos.util.supplier.Supplier;

/**
 * Represents a supplier of 3-dimensional {@link BigDecimal} arrays.
 *
 * <p>
 * There is no requirement that a new or distinct result be returned each
 * time the supplier is invoked.
 *
 * <p>
 * This is a functional interface whose functional method is
 * {@link #getBigdA3()}.
 * 
 * @see SupplierBigdA3
 * @see SupplierExBigdA3
 */
@FunctionalInterface
public interface SupplierBigdA3 extends Supplier<BigDecimal[][][]>
{
	
	/**
	 * Gets a result.
	 *
	 * @return A result.
	 */
	BigDecimal[][][] getBigdA3();
	
	@Override
	default BigDecimal[][][] get()
	{
		return getBigdA3();
	}
	
	public static SupplierBigdA3 of(BigDecimal[][][] value)
	{
		return () -> value;
	}
	
}
