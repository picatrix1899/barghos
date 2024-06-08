package org.barghos.util.supplier.objs;

import org.barghos.util.supplier.SupplierEx;

/**
 * Represents a supplier of object.
 * Unlike {@link SupplierObjA3} this may throw Exceptions.
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
public interface SupplierExObjA3 extends SupplierEx<Object[][][]>
{
    /**
     * Gets a result.
     *
     * @return A result.
     * 
     * @throws Exception May throw an exception during execution.
     */
	Object[][][] getObject3DArray() throws Exception;
    
    /**
     * @deprecated Use {@link #getObject3DArray()} instead.
     */
    @Override
    @Deprecated(since = "1.0", forRemoval = false)
    default Object[][][] getGeneric() throws Exception
    {
    	return getObject3DArray();
    }
}
