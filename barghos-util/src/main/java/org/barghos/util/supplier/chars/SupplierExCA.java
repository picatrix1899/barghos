package org.barghos.util.supplier.chars;

import org.barghos.util.supplier.SupplierEx;

/**
 * Represents a supplier of char.
 * Unlike {@link SupplierCA} this may throw Exceptions.
 *
 * <p>
 * There is no requirement that a new or distinct result be returned each
 * time the supplier is invoked.
 *
 * <p>
 * This is a functional interface whose functional method is
 * {@link #getCharArray()}.
 * 
 * @see SupplierCA
 * @see SupplierExCA
 */
@FunctionalInterface
public interface SupplierExCA extends SupplierEx<char[]>
{
    /**
     * Gets a result.
     *
     * @return A result.
     * 
     * @throws Exception May throw an exception during execution.
     */
	char[] getCharArray() throws Exception;
    
    /**
     * @deprecated Use {@link #getCharArray()} instead.
     */
    @Override
    @Deprecated(since = "1.0", forRemoval = false)
    default char[] getGeneric() throws Exception
    {
    	return getCharArray();
    }
}
