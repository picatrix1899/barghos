package org.barghos.util.supplier.floats;

import org.barghos.util.supplier.Supplier;

/**
 * Represents a supplier of float.
 *
 * <p>
 * There is no requirement that a new or distinct result be returned each
 * time the supplier is invoked.
 *
 * <p>
 * This is a functional interface whose functional method is {@link #getF()}.
 * 
 * @see SupplierF
 * @see SupplierExF
 */
@FunctionalInterface
public interface SupplierF extends Supplier<Float>
{
    /**
     * Gets a result.
     *
     * @return A result.
     */
    float getF();
    
    /**
     * @deprecated Use {@link #getF()} instead.
     */
    @Override
    @Deprecated(since = "1.0", forRemoval = false)
    default Float get()
    {
    	return getF();
    }
}
