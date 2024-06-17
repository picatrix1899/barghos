package org.barghos.util.supplier.doubles;

import org.barghos.util.supplier.Supplier;

/**
 * Represents a supplier of 2-dimensional double arrays.
 *
 * <p>
 * There is no requirement that a new or distinct result be returned each
 * time the supplier is invoked.
 *
 * <p>
 * This is a functional interface whose functional method is
 * {@link #getDouble2DArray()}.
 * 
 * @see SupplierDA2
 * @see SupplierExDA2
 */
@FunctionalInterface
public interface SupplierDA2 extends Supplier<double[][]>
{
    /**
     * Gets a result.
     *
     * @return A result.
     */
	double[][] getDouble2DArray();
    
    /**
     * @deprecated Use {@link #getDouble2DArray()} instead.
     */
    @Override
    @Deprecated(since = "1.0", forRemoval = false)
    default double[][] getGeneric()
    {
    	return getDouble2DArray();
    }
}
