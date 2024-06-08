package org.barghos.util.supplier.objs;

import org.barghos.util.supplier.SupplierEx;

/**
 * Represents a supplier of object.
 * Unlike {@link SupplierObj} this may throw Exceptions.
 *
 * <p>
 * There is no requirement that a new or distinct result be returned each
 * time the supplier is invoked.
 *
 * <p>
 * This is a functional interface whose functional method is
 * {@link #getObject()}.
 * 
 * @see SupplierObj
 * @see SupplierExObj
 */
@FunctionalInterface
public interface SupplierExObj extends SupplierEx<Object>
{
    /**
     * Gets a result.
     *
     * @return A result.
     * 
     * @throws Exception May throw an exception during execution.
     */
	int getObject() throws Exception;
    
    /**
     * @deprecated Use {@link #getObject()} instead.
     */
    @Override
    @Deprecated(since = "1.0", forRemoval = false)
    default Object getGeneric() throws Exception
    {
    	return getObject();
    }
}
