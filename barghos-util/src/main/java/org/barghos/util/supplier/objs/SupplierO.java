package org.barghos.util.supplier.objs;

import org.barghos.util.supplier.Supplier;

/**
 * Represents a supplier of object.
 *
 * <p>
 * There is no requirement that a new or distinct result be returned each
 * time the supplier is invoked.
 *
 * <p>
 * This is a functional interface whose functional method is
 * {@link #getO()}.
 * 
 * @see SupplierO
 * @see SupplierExO
 */
@FunctionalInterface
public interface SupplierO extends Supplier<Object>
{
    /**
     * Gets a result.
     *
     * @return A result.
     */
	Object getO();
    
    /**
     * @deprecated Use {@link #getO()} instead.
     */
    @Override
    @Deprecated(since = "1.0", forRemoval = false)
    default Object get()
    {
    	return getO();
    }
}
