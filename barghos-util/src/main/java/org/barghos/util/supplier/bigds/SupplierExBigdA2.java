package org.barghos.util.supplier.bigds;

import java.math.BigDecimal;

import org.barghos.util.supplier.SupplierEx;

/**
 * Represents a supplier of 2-dimensional {@link BigDecimal} arrays.
 * Unlike {@link SupplierBigdA2} this may throw Exceptions.
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
public interface SupplierExBigdA2 extends SupplierEx<BigDecimal[][]>
{
    /**
     * Gets a result.
     *
     * @return A result.
     * 
     * @throws Exception May throw an exception during execution.
     */
    BigDecimal[][] getBigDec2DArray() throws Exception;
    
    /**
     * @deprecated Use {@link #getBigDec2DArray()} instead.
     */
    @Override
    @Deprecated(since = "1.0", forRemoval = false)
    default BigDecimal[][] getGeneric() throws Exception
    {
    	return getBigDec2DArray();
    }
}
