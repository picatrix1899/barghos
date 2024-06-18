package org.barghos.util.supplier.longs;

import org.barghos.util.supplier.Supplier;

/**
 * Represents a supplier of 1-dimensional long arrays.
 *
 * <p>
 * There is no requirement that a new or distinct result be returned each
 * time the supplier is invoked.
 *
 * <p>
 * This is a functional interface whose functional method is
 * {@link #getLA()}.
 * 
 * @see SupplierLA
 * @see SupplierExLA
 */
@FunctionalInterface
public interface SupplierLA extends Supplier<long[]>
{
    /**
     * Gets a result.
     *
     * @return A result.
     */
	long[] getLA();
    
    /**
     * @deprecated Use {@link #getLA()} instead.
     */
    @Override
    @Deprecated(since = "1.0", forRemoval = false)
    default long[] get()
    {
    	return getLA();
    }
}
