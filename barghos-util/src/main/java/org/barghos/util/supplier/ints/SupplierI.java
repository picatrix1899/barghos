package org.barghos.util.supplier.ints;

import org.barghos.util.supplier.Supplier;

/**
 * Represents a supplier of int.
 *
 * <p>
 * There is no requirement that a new or distinct result be returned each
 * time the supplier is invoked.
 *
 * <p>
 * This is a functional interface whose functional method is {@link #getI()}.
 * 
 * @see SupplierI
 * @see SupplierExI
 */
@FunctionalInterface
public interface SupplierI extends Supplier<Integer>
{
    /**
     * Gets a result.
     *
     * @return A result.
     */
    int getI();
    
    /**
     * @deprecated Use {@link #getI()} instead.
     */
    @Override
    @Deprecated(since = "1.0", forRemoval = false)
    default Integer get()
    {
    	return getI();
    }
}
