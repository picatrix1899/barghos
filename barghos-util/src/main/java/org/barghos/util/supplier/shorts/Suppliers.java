package org.barghos.util.supplier.shorts;

import org.barghos.util.supplier.Supplier;

/**
 * Represents a supplier of shorts.
 *
 * <p>
 * There is no requirement that a new or distinct result be returned each
 * time the supplier is invoked.
 *
 * <p>
 * This is a functional interface whose functional method is {@link #getShort()}.
 * 
 * @see Suppliers
 * @see SupplierExs
 */
@FunctionalInterface
public interface Suppliers extends Supplier<Short>
{
    /**
     * Gets a result.
     *
     * @return A result.
     */
    short getShort();
    
    /**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link getShort} instead.
     */
    @Override
    @Deprecated
    default Short get()
    {
    	return getShort();
    }
}
