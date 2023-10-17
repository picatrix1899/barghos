package org.barghos.util.supplier.bools;

import org.barghos.util.supplier.Supplier;

/**
 * Represents a supplier of booleans.
 *
 * <p>
 * There is no requirement that a new or distinct result be returned each
 * time the supplier is invoked.
 *
 * <p>
 * This is a functional interface whose functional method is {@link #getBool()}.
 * 
 * @see Supplierbo
 * @see SupplierExbo
 */
@FunctionalInterface
public interface Supplierbo extends Supplier<Boolean>
{
    /**
     * Gets a result.
     *
     * @return A result.
     */
    boolean getBool();
    
    /**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link getBool} instead.
     */
    @Override
    @Deprecated
    default Boolean get()
    {
    	return getBool();
    }
}
