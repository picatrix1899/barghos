package org.barghos.util.supplier.longs;

import org.barghos.util.supplier.SupplierEx;

/**
 * Represents a supplier of long.
 * Unlike {@link SupplierL} this may throw Exceptions.
 *
 * <p>
 * There is no requirement that a new or distinct result be returned each
 * time the supplier is invoked.
 *
 * <p>
 * This is a functional interface whose functional method is {@link #getLong()}.
 * 
 * @see SupplierL
 * @see SupplierExL
 */
@FunctionalInterface
public interface SupplierExL extends SupplierEx<Long>
{
    /**
     * Gets a result.
     *
     * @return A result.
     * 
     * @throws Exception May throw an exception during execution.
     */
	long getLong() throws Exception;
    
    /**
     * @deprecated Use {@link #getLong()} instead.
     */
    @Override
    @Deprecated(since = "1.0", forRemoval = false)
    default Long getGeneric() throws Exception
    {
    	return getLong();
    }
}
