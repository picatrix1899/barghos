package org.barghos.util.supplier.shorts;

import org.barghos.util.supplier.Supplier;

/**
 * Represents a supplier of 1-dimensional short arrays.
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
public interface SupplierSA extends Supplier<short[]>
{
    /**
     * Gets a result.
     *
     * @return A result.
     */
	short[] getShortArray();
    
    /**
     * @deprecated Use {@link #getShortArray()} instead.
     */
    @Override
    @Deprecated(since = "1.0", forRemoval = false)
    default short[] getGeneric()
    {
    	return getShortArray();
    }
}
