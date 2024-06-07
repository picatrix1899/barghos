package org.barghos.util.supplier.floats;

import org.barghos.util.supplier.Supplier;

/**
 * Represents a supplier of 1-dimensional float arrays.
 *
 * <p>
 * There is no requirement that a new or distinct result be returned each
 * time the supplier is invoked.
 *
 * <p>
 * This is a functional interface whose functional method is
 * {@link #getFloatArray()}.
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
public interface SupplierFA extends Supplier<float[]>
{
    /**
     * Gets a result.
     *
     * @return A result.
     */
    float[] getFloatArray();
    
    /**
     * @deprecated
     * Use {@link #getFloatArray()} instead.
     */
    @Override
    @Deprecated(since = "1.0", forRemoval = false)
    default float[] get()
    {
    	return getFloatArray();
    }
}
