package org.barghos.util.supplier.strings;

import org.barghos.util.supplier.SupplierEx;

/**
 * Represents a supplier of string.
 * Unlike {@link SupplierStrA} this may throw Exceptions.
 *
 * <p>
 * There is no requirement that a new or distinct result be returned each
 * time the supplier is invoked.
 *
 * <p>
 * This is a functional interface whose functional method is
 * {@link #getStringArray()}.
 * 
 * @see SupplierStrA
 * @see SupplierExStrA
 */
@FunctionalInterface
public interface SupplierExStrA extends SupplierEx<String[]>
{
    /**
     * Gets a result.
     *
     * @return A result.
     * 
     * @throws Exception May throw an exception during execution.
     */
	String[] getStringArray() throws Exception;
    
    /**
     * @deprecated Use {@link #getStringArray()} instead.
     */
    @Override
    @Deprecated(since = "1.0", forRemoval = false)
    default String[] getGeneric() throws Exception
    {
    	return getStringArray();
    }
}
