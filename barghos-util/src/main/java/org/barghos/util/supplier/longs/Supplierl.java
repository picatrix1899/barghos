package org.barghos.util.supplier.longs;

import org.barghos.util.supplier.Supplier;

/**
 * Represents a supplier of longs.
 *
 * <p>
 * There is no requirement that a new or distinct result be returned each
 * time the supplier is invoked.
 *
 * <p>
 * This is a functional interface whose functional method is {@link #getLong()}.
 * 
 * @see Supplierl
 * @see SupplierExl
 */
@FunctionalInterface
public interface Supplierl extends Supplier<Long>
{
    /**
     * Gets a result.
     *
     * @return A result.
     */
    long getLong();
    
    /**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link getLong} instead.
     */
    @Override
    @Deprecated
    default Long get()
    {
    	return getLong();
    }
}
