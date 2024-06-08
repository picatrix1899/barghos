package org.barghos.util.supplier.floats;

import org.barghos.util.supplier.Supplier;

/**
 * Represents a supplier of 2-dimensional float arrays.
 *
 * <p>
 * There is no requirement that a new or distinct result be returned each
 * time the supplier is invoked.
 *
 * <p>
 * This is a functional interface whose functional method is
 * {@link #getFloat2DArray()}.
 * 
 * @see SupplierFA2
 * @see SupplierExFA2
 */
@FunctionalInterface
public interface SupplierFA2 extends Supplier<float[][]>
{
    /**
     * Gets a result.
     *
     * @return A result.
     */
	float[][] getFloat2DArray();
    
    /**
     * @deprecated Use {@link #getFloat2DArray()} instead.
     */
    @Override
    @Deprecated(since = "1.0", forRemoval = false)
    default float[][] getGeneric()
    {
    	return getFloat2DArray();
    }
}
