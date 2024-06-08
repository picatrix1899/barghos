package org.barghos.util.supplier.bytes;

import org.barghos.util.supplier.Supplier;

/**
 * Represents a supplier of 1-dimensional byte arrays.
 *
 * <p>
 * There is no requirement that a new or distinct result be returned each
 * time the supplier is invoked.
 *
 * <p>
 * This is a functional interface whose functional method is
 * {@link #getByteArray()}.
 * 
 * @see SupplierBA
 * @see SupplierExBA
 */
@FunctionalInterface
public interface SupplierBA extends Supplier<byte[]>
{
    /**
     * Gets a result.
     *
     * @return A result.
     */
	byte[] getByteArray();
    
    /**
     * @deprecated Use {@link #getByteArray()} instead.
     */
    @Override
    @Deprecated(since = "1.0", forRemoval = false)
    default byte[] getGeneric()
    {
    	return getByteArray();
    }
}
