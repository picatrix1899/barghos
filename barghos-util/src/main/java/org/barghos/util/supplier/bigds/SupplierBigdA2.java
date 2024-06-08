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
 * {@link #getBigDec2DArray()}.
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
    BigDecimal[][] getBigDec2DArray();
    
    /**
     * @deprecated Use {@link #getBigDec2DArray()} instead.
     */
    @Override
    @Deprecated(since = "1.0", forRemoval = false)
    default BigDecimal[][] getGeneric()
    {
    	return getBigDec2DArray();
    }
}
