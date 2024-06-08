package org.barghos.util.supplier.objs;

import org.barghos.util.supplier.SupplierEx;

/**
 * Represents a supplier of object.
 * Unlike {@link SupplierObjA} this may throw Exceptions.
 *
 * <p>
 * There is no requirement that a new or distinct result be returned each
 * time the supplier is invoked.
 *
 * <p>
 * This is a functional interface whose functional method is
 * {@link #getObjectArray()}.
 * 
 * @see SupplierObjA
 * @see SupplierExObjA
 */
@FunctionalInterface
public interface SupplierExObjA extends SupplierEx<Object[]>
{
    /**
     * Gets a result.
     *
     * @return A result.
     * 
     * @throws Exception May throw an exception during execution.
     */
	Object[] getObjectArray() throws Exception;
    
    /**
     * @deprecated Use {@link #getObjectArray()} instead.
     */
    @Override
    @Deprecated(since = "1.0", forRemoval = false)
    default Object[] getGeneric() throws Exception
    {
    	return getObjectArray();
    }
}
