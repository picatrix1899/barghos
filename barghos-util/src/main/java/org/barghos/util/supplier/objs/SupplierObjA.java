package org.barghos.util.supplier.objs;

import org.barghos.util.supplier.Supplier;

/**
 * Represents a supplier of 1-dimensional object arrays.
 *
 * <p>
 * There is no requirement that a new or distinct result be returned each
 * time the supplier is invoked.
 *
 * <p>
 * This is a functional interface whose functional method is
 * {@link #getObjectArray()}.
 * 
 * @see SupplierObjA
 * @see SupplierExObjA
 */
@FunctionalInterface
public interface SupplierObjA extends Supplier<Object[]>
{
    /**
     * Gets a result.
     *
     * @return A result.
     */
	Object[] getObjectArray();
    
    /**
     * @deprecated Use {@link #getObjectArray()} instead.
     */
    @Override
    @Deprecated(since = "1.0", forRemoval = false)
    default Object[] getGeneric()
    {
    	return getObjectArray();
    }
}
