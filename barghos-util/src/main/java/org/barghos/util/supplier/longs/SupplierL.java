package org.barghos.util.supplier.longs;

import org.barghos.util.supplier.Supplier;

/**
 * Represents a supplier of long.
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
public interface SupplierL extends Supplier<Long>
{
    /**
     * Gets a result.
     *
     * @return A result.
     */
	long getLong();
    
    /**
     * @deprecated Use {@link #getLong()} instead.
     */
    @Override
    @Deprecated(since = "1.0", forRemoval = false)
    default Long getGeneric()
    {
    	return getLong();
    }
}
