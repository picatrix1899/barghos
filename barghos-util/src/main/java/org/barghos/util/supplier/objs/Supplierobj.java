package org.barghos.util.supplier.objs;

import org.barghos.util.supplier.Supplier;

/**
 * Represents a supplier of objects.
 *
 * <p>
 * There is no requirement that a new or distinct result be returned each
 * time the supplier is invoked.
 *
 * <p>
 * This is a functional interface whose functional method is {@link #getObject()}.
 * 
 * @see Supplierobj
 * @see SupplierExobj
 */
@FunctionalInterface
public interface Supplierobj extends Supplier<Object>
{
    /**
     * Gets a result.
     *
     * @return A result.
     */
    Object getObject();
    
    /**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link getObject} instead.
     */
    @Override
    @Deprecated
    default Object get()
    {
    	return getObject();
    }
}
