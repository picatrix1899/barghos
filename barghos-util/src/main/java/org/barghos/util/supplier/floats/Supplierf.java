package org.barghos.util.supplier.floats;

import org.barghos.util.supplier.Supplier;

/**
 * Represents a supplier of floats.
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
public interface Supplierf extends Supplier<Float>
{
    /**
     * Gets a result.
     *
     * @return A result.
     */
    float getFloat();
    
    /**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link getFloat} instead.
     */
    @Override
    @Deprecated
    default Float get()
    {
    	return getFloat();
    }
}
