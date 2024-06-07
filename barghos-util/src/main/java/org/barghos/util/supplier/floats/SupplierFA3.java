package org.barghos.util.supplier.floats;

import org.barghos.util.supplier.Supplier;

/**
 * Represents a supplier of 3-dimensional float arrays.
 *
 * <p>
 * There is no requirement that a new or distinct result be returned each
 * time the supplier is invoked.
 *
 * <p>
 * This is a functional interface whose functional method is
 * {@link #getFloat3DArray()}.
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
public interface SupplierFA3 extends Supplier<float[][][]>
{
    /**
     * Gets a result.
     *
     * @return A result.
     */
    float[][][] getFloat3DArray();
    
    /**
     * @deprecated
     * Use {@link #getFloat3DArray()} instead.
     */
    @Override
    @Deprecated(since = "1.0", forRemoval = false)
    default float[][][] get()
    {
    	return getFloat3DArray();
    }
}
