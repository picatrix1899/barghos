package org.barghos.util.supplier.longs;

import org.barghos.util.supplier.Supplier;

/**
 * Represents a supplier of 2-dimensional long arrays.
 *
 * <p>
 * There is no requirement that a new or distinct result be returned each
 * time the supplier is invoked.
 *
 * <p>
 * This is a functional interface whose functional method is
 * {@link #getLong2DArray()}.
 * 
 * @see SupplierLA2
 * @see SupplierExLA2
 */
@FunctionalInterface
public interface SupplierLA2 extends Supplier<long[][]>
{
    /**
     * Gets a result.
     *
     * @return A result.
     */
	long[][] getLong2DArray();
    
    /**
     * @deprecated Use {@link #getLong2DArray()} instead.
     */
    @Override
    @Deprecated(since = "1.0", forRemoval = false)
    default long[][] getGeneric()
    {
    	return getLong2DArray();
    }
}
