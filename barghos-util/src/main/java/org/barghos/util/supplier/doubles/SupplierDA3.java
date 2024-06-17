package org.barghos.util.supplier.doubles;

import org.barghos.util.supplier.Supplier;

/**
 * Represents a supplier of 3-dimensional double arrays.
 *
 * <p>
 * There is no requirement that a new or distinct result be returned each
 * time the supplier is invoked.
 *
 * <p>
 * This is a functional interface whose functional method is
 * {@link #getDouble3DArray()}.
 * 
 * @see SupplierDA3
 * @see SupplierExDA3
 */
@FunctionalInterface
public interface SupplierDA3 extends Supplier<double[][][]>
{
    /**
     * Gets a result.
     *
     * @return A result.
     */
	double[][][] getDouble3DArray();
    
    /**
     * @deprecated Use {@link #getDouble3DArray()} instead.
     */
    @Override
    @Deprecated(since = "1.0", forRemoval = false)
    default double[][][] getGeneric()
    {
    	return getDouble3DArray();
    }
}
