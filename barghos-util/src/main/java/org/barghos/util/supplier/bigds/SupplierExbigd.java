package org.barghos.util.supplier.bigds;

import java.math.BigDecimal;

import org.barghos.util.supplier.SupplierEx;

/**
 * Represents a supplier of {@link BigDecimal}.
 * Unlike {@link Supplierbigd} this may throw Exceptions.
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
public interface SupplierExbigd extends SupplierEx<BigDecimal>
{
    /**
     * Gets a result.
     *
     * @return A result.
     * 
     * @throws Exception May throw an exception during execution.
     */
    BigDecimal getBigDec() throws Exception;
    
    /**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link getBigDec} instead.
     */
    @Override
    @Deprecated
    default BigDecimal get() throws Exception
    {
    	return getBigDec();
    }
}
