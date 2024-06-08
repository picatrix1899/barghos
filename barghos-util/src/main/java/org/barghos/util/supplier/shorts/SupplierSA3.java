package org.barghos.util.supplier.shorts;

import org.barghos.util.supplier.Supplier;

/**
 * Represents a supplier of 3-dimensional short arrays.
 *
 * <p>
 * There is no requirement that a new or distinct result be returned each
 * time the supplier is invoked.
 *
 * <p>
 * This is a functional interface whose functional method is
 * {@link #getShort3DArray()}.
 * 
 * @see SupplierSA3
 * @see SupplierExSA3
 */
@FunctionalInterface
public interface SupplierSA3 extends Supplier<short[][][]>
{
    /**
     * Gets a result.
     *
     * @return A result.
     */
	short[][][] getShort3DArray();
    
    /**
     * @deprecated Use {@link #getShort3DArray()} instead.
     */
    @Override
    @Deprecated(since = "1.0", forRemoval = false)
    default short[][][] getGeneric()
    {
    	return getShort3DArray();
    }
}
