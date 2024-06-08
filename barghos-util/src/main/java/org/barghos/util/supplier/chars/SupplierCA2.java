package org.barghos.util.supplier.chars;

import org.barghos.util.supplier.Supplier;

/**
 * Represents a supplier of 2-dimensional char arrays.
 *
 * <p>
 * There is no requirement that a new or distinct result be returned each
 * time the supplier is invoked.
 *
 * <p>
 * This is a functional interface whose functional method is
 * {@link #getChar2DArray()}.
 * 
 * @see SupplierCA2
 * @see SupplierExCA2
 */
@FunctionalInterface
public interface SupplierCA2 extends Supplier<char[][]>
{
    /**
     * Gets a result.
     *
     * @return A result.
     */
	char[][] getChar2DArray();
    
    /**
     * @deprecated Use {@link #getChar2DArray()} instead.
     */
    @Override
    @Deprecated(since = "1.0", forRemoval = false)
    default char[][] getGeneric()
    {
    	return getChar2DArray();
    }
}
