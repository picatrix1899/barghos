package org.barghos.util.supplier.ints;

import org.barghos.util.supplier.Supplier;

/**
 * Represents a supplier of 2-dimensional int arrays.
 *
 * <p>
 * There is no requirement that a new or distinct result be returned each
 * time the supplier is invoked.
 *
 * <p>
 * This is a functional interface whose functional method is
 * {@link #getInt2DArray()}.
 * 
 * @see SupplierIA2
 * @see SupplierExIA2
 */
@FunctionalInterface
public interface SupplierIA2 extends Supplier<int[][]>
{
    /**
     * Gets a result.
     *
     * @return A result.
     */
	int[][] getInt2DArray();
    
    /**
     * @deprecated Use {@link #getInt2DArray()} instead.
     */
    @Override
    @Deprecated(since = "1.0", forRemoval = false)
    default int[][] getGeneric()
    {
    	return getInt2DArray();
    }
}
