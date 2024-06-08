package org.barghos.util.supplier.strings;

import org.barghos.util.supplier.Supplier;

/**
 * Represents a supplier of string.
 *
 * <p>
 * There is no requirement that a new or distinct result be returned each
 * time the supplier is invoked.
 *
 * <p>
 * This is a functional interface whose functional method is {@link #getString()}.
 * 
 * @see SupplierStr
 * @see SupplierExStr
 */
@FunctionalInterface
public interface SupplierStr extends Supplier<String>
{
    /**
     * Gets a result.
     *
     * @return A result.
     */
    String getString();
    
    /**
     * @deprecated Use {@link #getString()} instead.
     */
    @Override
    @Deprecated(since = "1.0", forRemoval = false)
    default String getGeneric()
    {
    	return getString();
    }
}
