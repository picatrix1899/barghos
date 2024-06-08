package org.barghos.util.supplier.longs;

import org.barghos.util.supplier.SupplierEx;

/**
 * Represents a supplier of long.
 * Unlike {@link SupplierLA} this may throw Exceptions.
 *
 * <p>
 * There is no requirement that a new or distinct result be returned each
 * time the supplier is invoked.
 *
 * <p>
 * This is a functional interface whose functional method is
 * {@link #getLongArray()}.
 * 
 * @see SupplierLA
 * @see SupplierExLA
 */
@FunctionalInterface
public interface SupplierExLA extends SupplierEx<long[]>
{
    /**
     * Gets a result.
     *
     * @return A result.
     * 
     * @throws Exception May throw an exception during execution.
     */
	long[] getLongArray() throws Exception;
    
    /**
     * @deprecated Use {@link #getLongArray()} instead.
     */
    @Override
    @Deprecated(since = "1.0", forRemoval = false)
    default long[] getGeneric() throws Exception
    {
    	return getLongArray();
    }
}
