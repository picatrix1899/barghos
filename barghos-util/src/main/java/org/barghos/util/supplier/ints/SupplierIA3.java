package org.barghos.util.supplier.ints;

import org.barghos.util.supplier.Supplier;

/**
 * Represents a supplier of 3-dimensional int arrays.
 *
 * <p>
 * There is no requirement that a new or distinct result be returned each
 * time the supplier is invoked.
 *
 * <p>
 * This is a functional interface whose functional method is
 * {@link #getInt3DArray()}.
 * 
 * @see SupplierIA3
 * @see SupplierExIA3
 */
@FunctionalInterface
public interface SupplierIA3 extends Supplier<int[][][]>
{
    /**
     * Gets a result.
     *
     * @return A result.
     */
	int[][][] getInt3DArray();
    
    /**
     * @deprecated Use {@link #getInt3DArray()} instead.
     */
    @Override
    @Deprecated(since = "1.0", forRemoval = false)
    default int[][][] getGeneric()
    {
    	return getInt3DArray();
    }
}
