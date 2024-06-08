package org.barghos.util.supplier.shorts;

import org.barghos.util.supplier.Supplier;

/**
 * Represents a supplier of 2-dimensional short arrays.
 *
 * <p>
 * There is no requirement that a new or distinct result be returned each
 * time the supplier is invoked.
 *
 * <p>
 * This is a functional interface whose functional method is
 * {@link #getShort2DArray()}.
 * 
 * @see SupplierSA2
 * @see SupplierExSA2
 */
@FunctionalInterface
public interface SupplierSA2 extends Supplier<short[][]>
{
    /**
     * Gets a result.
     *
     * @return A result.
     */
	short[][] getShort2DArray();
    
    /**
     * @deprecated Use {@link #getShort2DArray()} instead.
     */
    @Override
    @Deprecated(since = "1.0", forRemoval = false)
    default short[][] getGeneric()
    {
    	return getShort2DArray();
    }
}
