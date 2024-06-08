package org.barghos.util.supplier.bytes;

import org.barghos.util.supplier.Supplier;

/**
 * Represents a supplier of 3-dimensional byte arrays.
 *
 * <p>
 * There is no requirement that a new or distinct result be returned each
 * time the supplier is invoked.
 *
 * <p>
 * This is a functional interface whose functional method is
 * {@link #getByte3DArray()}.
 * 
 * @see SupplierBA3
 * @see SupplierExBA3
 */
@FunctionalInterface
public interface SupplierBA3 extends Supplier<byte[][][]>
{
    /**
     * Gets a result.
     *
     * @return A result.
     */
	byte[][][] getByte3DArray();
    
    /**
     * @deprecated Use {@link #getByte3DArray()} instead.
     */
    @Override
    @Deprecated(since = "1.0", forRemoval = false)
    default byte[][][] getGeneric()
    {
    	return getByte3DArray();
    }
}
