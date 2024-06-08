package org.barghos.util.supplier.shorts;

import org.barghos.util.supplier.SupplierEx;

/**
 * Represents a supplier of short.
 * Unlike {@link SupplierSA} this may throw Exceptions.
 *
 * <p>
 * There is no requirement that a new or distinct result be returned each
 * time the supplier is invoked.
 *
 * <p>
 * This is a functional interface whose functional method is
 * {@link #getShortArray()}.
 * 
 * @see SupplierSA
 * @see SupplierExSA
 */
@FunctionalInterface
public interface SupplierExSA extends SupplierEx<short[]>
{
    /**
     * Gets a result.
     *
     * @return A result.
     * 
     * @throws Exception May throw an exception during execution.
     */
	short[] getShortArray() throws Exception;
    
    /**
     * @deprecated Use {@link #getShortArray()} instead.
     */
    @Override
    @Deprecated(since = "1.0", forRemoval = false)
    default short[] getGeneric() throws Exception
    {
    	return getShortArray();
    }
}
