package org.barghos.util.supplier.objs;

import org.barghos.util.supplier.Supplier;

/**
 * Represents a supplier of 3-dimensional object arrays.
 *
 * <p>
 * There is no requirement that a new or distinct result be returned each
 * time the supplier is invoked.
 *
 * <p>
 * This is a functional interface whose functional method is
 * {@link #getOA3()}.
 * 
 * @see SupplierOA3
 * @see SupplierExOA3
 */
@FunctionalInterface
public interface SupplierOA3 extends Supplier<Object[][][]>
{
    /**
     * Gets a result.
     *
     * @return A result.
     */
	Object[][][] getOA3();
    
    /**
     * @deprecated Use {@link #getOA3()} instead.
     */
    @Override
    @Deprecated(since = "1.0", forRemoval = false)
    default Object[][][] get()
    {
    	return getOA3();
    }
}
