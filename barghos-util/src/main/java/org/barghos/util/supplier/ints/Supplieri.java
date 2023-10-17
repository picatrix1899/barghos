package org.barghos.util.supplier.ints;

import org.barghos.util.supplier.Supplier;

/**
 * Represents a supplier of integers.
 *
 * <p>
 * There is no requirement that a new or distinct result be returned each
 * time the supplier is invoked.
 *
 * <p>
 * This is a functional interface whose functional method is {@link #getInt()}.
 * 
 * @see Supplieri
 * @see SupplierExi
 */
@FunctionalInterface
public interface Supplieri extends Supplier<Integer>
{
    /**
     * Gets a result.
     *
     * @return A result.
     */
    int getInt();
    
    /**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link getInt} instead.
     */
    @Override
    @Deprecated
    default Integer get()
    {
    	return getInt();
    }
}
