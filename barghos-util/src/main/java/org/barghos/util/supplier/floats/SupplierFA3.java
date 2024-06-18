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
 * {@link #getFA3()}.
 * 
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
	float[][][] getFA3();
    
    /**
     * @deprecated Use {@link #getFA3()} instead.
     */
    @Override
    @Deprecated(since = "1.0", forRemoval = false)
    default float[][][] get()
    {
    	return getFA3();
    }
}
