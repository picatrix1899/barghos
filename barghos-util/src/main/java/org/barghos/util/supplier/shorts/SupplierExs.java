package org.barghos.util.supplier.shorts;

import org.barghos.util.supplier.SupplierEx;

/**
 * Represents a supplier of shorts.
 * Unlike {@link Suppliers} this may throw Exceptions.
 *
 * <p>
 * There is no requirement that a new or distinct result be returned each
 * time the supplier is invoked.
 *
 * <p>
 * This is a functional interface whose functional method is {@link #getShort()}.
 * 
 * @see Suppliers
 * @see SupplierExs
 */
@FunctionalInterface
public interface SupplierExs extends SupplierEx<Short>
{
    /**
     * Gets a result.
     *
     * @return A result.
     * 
     * @throws Exception May throw an exception during execution.
     */
    short getShort() throws Exception;
    
    /**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link getShort} instead.
     */
    @Override
    @Deprecated
    default Short get() throws Exception
    {
    	return getShort();
    }
}
