package org.barghos.util.supplier.bigds;

import java.math.BigDecimal;

import org.barghos.util.supplier.SupplierEx;

/**
 * Represents a supplier of 3-dimensional {@link BigDecimal} arrays.
 * Unlike {@link SupplierBigdA3} this may throw Exceptions.
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
public interface SupplierExBigdA3 extends SupplierEx<BigDecimal[][][]>
{
	/**
	 * Gets a result.
	 *
	 * @return A result.
	 * 
	 * @throws Exception May throw an exception during execution.
	 */
	BigDecimal[][][] getBigdA3() throws Exception;
	
	/**
	 * @deprecated Use {@link #getBigdA3()} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default BigDecimal[][][] get() throws Exception
	{
		return getBigdA3();
	}
}
