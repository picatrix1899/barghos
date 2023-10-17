package org.barghos.util.supplier.objs;

import org.barghos.util.supplier.SupplierEx;

/**
 * Represents a supplier of objects.
 * Unlike {@link Supplierobj} this may throw Exceptions.
 *
 * <p>
 * There is no requirement that a new or distinct result be returned each
 * time the supplier is invoked.
 *
 * <p>
 * This is a functional interface whose functional method is {@link #getObject()}.
 * 
 * @see Supplierobj
 * @see SupplierExobj
 */
@FunctionalInterface
public interface SupplierExobj extends SupplierEx<Object>
{
    /**
     * Gets a result.
     *
     * @return A result.
     * 
     * @throws Exception May throw an exception during execution.
     */
	Object getObject() throws Exception;
	
	/**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link getObject} instead.
     */
    @Override
    @Deprecated
    default Object get() throws Exception
    {
    	return getObject();
    }
}
