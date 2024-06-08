package org.barghos.util.supplier.shorts;

import org.barghos.util.supplier.Supplier;

/**
 * Represents a supplier of short.
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
public interface SupplierS extends Supplier<Short>
{
    /**
     * Gets a result.
     *
     * @return A result.
     */
	short getShort();
    
    /**
     * @deprecated Use {@link #getShort()} instead.
     */
    @Override
    @Deprecated(since = "1.0", forRemoval = false)
    default Short getGeneric()
    {
    	return getShort();
    }
}
