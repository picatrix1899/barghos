package org.barghos.util.supplier.ints;

import org.barghos.util.supplier.SupplierEx;

/**
 * Represents a supplier of int.
 * Unlike {@link SupplierI} this may throw Exceptions.
 *
 * <p>
 * There is no requirement that a new or distinct result be returned each
 * time the supplier is invoked.
 *
 * <p>
 * This is a functional interface whose functional method is {@link #getInt()}.
 * 
 * @see SupplierI
 * @see SupplierExI
 */
@FunctionalInterface
public interface SupplierExI extends SupplierEx<Integer>
{
    /**
     * Gets a result.
     *
     * @return A result.
     * 
     * @throws Exception May throw an exception during execution.
     */
	int getInt() throws Exception;
    
    /**
     * @deprecated Use {@link #getInt()} instead.
     */
    @Override
    @Deprecated(since = "1.0", forRemoval = false)
    default Integer getGeneric() throws Exception
    {
    	return getInt();
    }
}
