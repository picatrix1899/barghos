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
 * This is a functional interface whose functional method is {@link #getBigDec()}.
 * 
 * @see Supplierbigd
 * @see SupplierExbigd
 */
@FunctionalInterface
public interface Supplierbigd extends Supplier<BigDecimal>
{
    /**
     * Gets a result.
     *
     * @return A result.
     */
    BigDecimal getBigDec();
    
    /**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link getBigDec} instead.
     */
    @Override
    @Deprecated
    default BigDecimal get()
    {
    	return getBigDec();
    }
}
