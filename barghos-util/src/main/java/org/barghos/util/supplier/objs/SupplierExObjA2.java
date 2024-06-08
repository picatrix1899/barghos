package org.barghos.util.supplier.objs;

import org.barghos.util.supplier.SupplierEx;

/**
 * Represents a supplier of object.
 * Unlike {@link SupplierObjA2} this may throw Exceptions.
 *
 * <p>
 * There is no requirement that a new or distinct result be returned each
 * time the supplier is invoked.
 *
 * <p>
 * This is a functional interface whose functional method is
 * {@link #getObject2DArray()}.
 * 
 * @see SupplierObjA2
 * @see SupplierExObjA2
 */
@FunctionalInterface
public interface SupplierExObjA2 extends SupplierEx<Object[][]>
{
    /**
     * Gets a result.
     *
     * @return A result.
     * 
     * @throws Exception May throw an exception during execution.
     */
	Object[][] getObject2DArray() throws Exception;
    
    /**
     * @deprecated Use {@link #getObject2DArray()} instead.
     */
    @Override
    @Deprecated(since = "1.0", forRemoval = false)
    default Object[][] getGeneric() throws Exception
    {
    	return getObject2DArray();
    }
}
