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
 * This is a functional interface whose functional method is
 * {@link #getFloat()}.
 * 
 * @see SupplierF
 * @see SupplierExF
 * @see SupplierFA
 * @see SupplierExFA
 * @see SupplierFA2
 * @see SupplierExFA2
 * @see SupplierFA3
 * @see SupplierExFA3
 */
@FunctionalInterface
public interface SupplierF extends Supplier<Float>
{
    /**
     * Gets a result.
     *
     * @return A result.
     */
    float getFloat();
    
    /**
     * @deprecated
     * Use {@link #getFloat()} instead.
     */
    @Override
    @Deprecated(since = "1.0", forRemoval = false)
    default Float get()
    {
    	return getFloat();
    }
}
