package org.barghos.util.supplier.ints;

import org.barghos.util.supplier.SupplierEx;

/**
 * Represents a supplier of int.
 * Unlike {@link SupplierIA} this may throw Exceptions.
 *
 * <p>
 * There is no requirement that a new or distinct result be returned each
 * time the supplier is invoked.
 *
 * <p>
 * This is a functional interface whose functional method is
 * {@link #getIntArray()}.
 * 
 * @see SupplierIA
 * @see SupplierExIA
 */
@FunctionalInterface
public interface SupplierExIA extends SupplierEx<int[]>
{
    /**
     * Gets a result.
     *
     * @return A result.
     * 
     * @throws Exception May throw an exception during execution.
     */
	int[] getIntArray() throws Exception;
    
    /**
     * @deprecated Use {@link #getIntArray()} instead.
     */
    @Override
    @Deprecated(since = "1.0", forRemoval = false)
    default int[] getGeneric() throws Exception
    {
    	return getIntArray();
    }
}
