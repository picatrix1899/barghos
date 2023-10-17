package org.barghos.util.supplier.doubles;

import org.barghos.util.supplier.SupplierEx;

/**
 * Represents a supplier of doubles.
 * Unlike {@link Supplierd} this may throw Exceptions.
 *
 * <p>
 * There is no requirement that a new or distinct result be returned each
 * time the supplier is invoked.
 *
 * <p>
 * This is a functional interface whose functional method is {@link #getDouble()}.
 * 
 * @see Supplierd
 * @see SupplierExd
 */
@FunctionalInterface
public interface SupplierExd extends SupplierEx<Double>
{
    /**
     * Gets a result.
     *
     * @return A result.
     * 
     * @throws Exception May throw an exception during execution.
     */
    double getDouble() throws Exception;
    
    /**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link getDouble} instead.
     */
    @Override
    @Deprecated
    default Double get() throws Exception
    {
    	return getDouble();
    }
}
