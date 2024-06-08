package org.barghos.util.supplier.bigds;

import java.math.BigDecimal;

import org.barghos.util.supplier.Supplier;

/**
 * Represents a supplier of {@link BigDecimal}.
 *
 * <p>
 * There is no requirement that a new or distinct result be returned each
 * time the supplier is invoked.
 *
 * <p>
 * This is a functional interface whose functional method is
 * {@link #getBigDec()}.
 * 
 * @see SupplierBigd
 * @see SupplierExBigd
 */
@FunctionalInterface
public interface SupplierBigd extends Supplier<BigDecimal>
{
    /**
     * Gets a result.
     *
     * @return A result.
     */
    BigDecimal getBigDec();
    
    /**
     * @deprecated Use {@link #getBigDec()} instead.
     */
    @Override
    @Deprecated(since = "1.0", forRemoval = false)
    default BigDecimal getGeneric()
    {
    	return getBigDec();
    }
}
