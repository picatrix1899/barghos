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
 * {@link #getObject3DArray()}.
 * 
 * @see SupplierObjA3
 * @see SupplierExObjA3
 */
@FunctionalInterface
public interface SupplierObjA3 extends Supplier<Object[][][]>
{
    /**
     * Gets a result.
     *
     * @return A result.
     */
	Object[][][] getObject3DArray();
    
    /**
     * @deprecated Use {@link #getObject3DArray()} instead.
     */
    @Override
    @Deprecated(since = "1.0", forRemoval = false)
    default Object[][][] getGeneric()
    {
    	return getObject3DArray();
    }
}
