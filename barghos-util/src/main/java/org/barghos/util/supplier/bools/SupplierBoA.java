package org.barghos.util.supplier.bools;

import org.barghos.util.supplier.Supplier;

/**
 * Represents a supplier of 1-dimensional booleans arrays.
 *
 * <p>
 * There is no requirement that a new or distinct result be returned each
 * time the supplier is invoked.
 *
 * <p>
 * This is a functional interface whose functional method is
 * {@link #getBoA()}.
 * 
 * @see SupplierBoA
 * @see SupplierExBoA
 */
@FunctionalInterface
public interface SupplierBoA extends Supplier<boolean[]>
{
    /**
     * Gets a result.
     *
     * @return A result.
     */
    boolean[] getBoA();
    
    /**
     * @deprecated Use {@link #getBoA()} instead.
     */
    @Override
    @Deprecated(since = "1.0", forRemoval = false)
    default boolean[] get()
    {
    	return getBoA();
    }
}
