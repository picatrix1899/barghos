package org.barghos.util.supplier.bools;

import org.barghos.util.supplier.Supplier;

/**
 * Represents a supplier of 3-dimensional booleans arrays.
 *
 * <p>
 * There is no requirement that a new or distinct result be returned each
 * time the supplier is invoked.
 *
 * <p>
 * This is a functional interface whose functional method is
 * {@link #getBool3DArray()}.
 * 
 * @see SupplierBoA3
 * @see SupplierExBoA3
 */
@FunctionalInterface
public interface SupplierBoA3 extends Supplier<boolean[][][]>
{
    /**
     * Gets a result.
     *
     * @return A result.
     */
    boolean[][][] getBool3DArray();
    
    /**
     * @deprecated Use {@link #getBool3DArray()} instead.
     */
    @Override
    @Deprecated(since = "1.0", forRemoval = false)
    default boolean[][][] getGeneric()
    {
    	return getBool3DArray();
    }
}
