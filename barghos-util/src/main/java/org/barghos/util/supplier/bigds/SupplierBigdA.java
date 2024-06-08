package org.barghos.util.supplier.bigds;

import java.math.BigDecimal;

import org.barghos.util.supplier.Supplier;

/**
 * Represents a supplier of 1-dimensional {@link BigDecimal} arrays.
 *
 * <p>
 * There is no requirement that a new or distinct result be returned each
 * time the supplier is invoked.
 *
 * <p>
 * This is a functional interface whose functional method is
 * {@link #getBigDecArray()}.
 * 
 * @see SupplierBigdA
 * @see SupplierExBigdA
 */
@FunctionalInterface
public interface SupplierBigdA extends Supplier<BigDecimal[]>
{
    /**
     * Gets a result.
     *
     * @return A result.
     */
    BigDecimal[] getBigDecArray();
    
    /**
     * @deprecated Use {@link #getBigDecArray()} instead.
     */
    @Override
    @Deprecated(since = "1.0", forRemoval = false)
    default BigDecimal[] getGeneric()
    {
    	return getBigDecArray();
    }
}
