package org.barghos.util.supplier.strings;

import org.barghos.util.supplier.Supplier;

/**
 * Represents a supplier of 1-dimensional string arrays.
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
public interface SupplierStrA extends Supplier<String[]>
{
    /**
     * Gets a result.
     *
     * @return A result.
     */
	String[] getStringArray();
    
    /**
     * @deprecated Use {@link #getStringArray()} instead.
     */
    @Override
    @Deprecated(since = "1.0", forRemoval = false)
    default String[] getGeneric()
    {
    	return getStringArray();
    }
}
