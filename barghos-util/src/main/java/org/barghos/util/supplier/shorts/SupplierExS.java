package org.barghos.util.supplier.shorts;

import org.barghos.util.supplier.SupplierEx;

/**
 * Represents a supplier of short.
 * Unlike {@link SupplierS} this may throw Exceptions.
 *
 * <p>
 * There is no requirement that a new or distinct result be returned each
 * time the supplier is invoked.
 *
 * <p>
 * This is a functional interface whose functional method is
 * {@link #getShort()}.
 * 
 * @see SupplierS
 * @see SupplierExS
 */
@FunctionalInterface
public interface SupplierExS extends SupplierEx<Short>
{
    /**
     * Gets a result.
     *
     * @return A result.
     * 
     * @throws Exception May throw an exception during execution.
     */
	short getShort() throws Exception;
    
    /**
     * @deprecated Use {@link #getShort()} instead.
     */
    @Override
    @Deprecated(since = "1.0", forRemoval = false)
    default Short getGeneric() throws Exception
    {
    	return getShort();
    }
}
