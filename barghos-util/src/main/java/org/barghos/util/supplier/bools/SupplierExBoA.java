package org.barghos.util.supplier.bools;

import org.barghos.util.supplier.SupplierEx;

/**
 * Represents a supplier of booleans.
 * Unlike {@link SupplierBoA} this may throw Exceptions.
 *
 * <p>
 * There is no requirement that a new or distinct result be returned each
 * time the supplier is invoked.
 *
 * <p>
 * This is a functional interface whose functional method is
 * {@link #getBoolArray()}.
 * 
 * @see SupplierBoA
 * @see SupplierExBoA
 */
@FunctionalInterface
public interface SupplierExBoA extends SupplierEx<boolean[]>
{
    /**
     * Gets a result.
     *
     * @return A result.
     * 
     * @throws Exception May throw an exception during execution.
     */
    boolean[] getBoolArray() throws Exception;
    
    /**
     * @deprecated Use {@link #getBoolArray()} instead.
     */
    @Override
    @Deprecated(since = "1.0", forRemoval = false)
    default boolean[] getGeneric() throws Exception
    {
    	return getBoolArray();
    }
}
