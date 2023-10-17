package org.barghos.util.supplier.doubles;

import org.barghos.util.supplier.Supplier;

/**
 * Represents a supplier of doubles.
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
public interface Supplierd extends Supplier<Double>
{
    /**
     * Gets a result.
     *
     * @return A result.
     */
    double getDouble();
    
    /**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link getDouble} instead.
     */
    @Override
    @Deprecated
    default Double get()
    {
    	return getDouble();
    }
}
