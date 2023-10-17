package org.barghos.util.supplier.floats;

import org.barghos.util.supplier.SupplierEx;

/**
 * Represents a supplier of floats.
 * Unlike {@link Supplierf} this may throw Exceptions.
 *
 * <p>
 * There is no requirement that a new or distinct result be returned each
 * time the supplier is invoked.
 *
 * <p>
 * This is a functional interface whose functional method is {@link #getFloat()}.
 * 
 * @see Supplierf
 * @see SupplierExf
 */
@FunctionalInterface
public interface SupplierExf extends SupplierEx<Float>
{
    /**
     * Gets a result.
     *
     * @return A result.
     * 
     * @throws Exception May throw an exception during execution.
     */
    float getFloat() throws Exception;
    
    /**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link getFloat} instead.
     */
    @Override
    @Deprecated
    default Float get() throws Exception
    {
    	return getFloat();
    }
}
