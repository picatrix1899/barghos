package org.barghos.util.supplier.ints;

import org.barghos.util.supplier.SupplierEx;

/**
 * Represents a supplier of int.
 * Unlike {@link SupplierIA2} this may throw Exceptions.
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
public interface SupplierExIA2 extends SupplierEx<int[][]>
{
    /**
     * Gets a result.
     *
     * @return A result.
     * 
     * @throws Exception May throw an exception during execution.
     */
	int[][] getInt2DArray() throws Exception;
    
    /**
     * @deprecated Use {@link #getInt2DArray()} instead.
     */
    @Override
    @Deprecated(since = "1.0", forRemoval = false)
    default int[][] getGeneric() throws Exception
    {
    	return getInt2DArray();
    }
}
