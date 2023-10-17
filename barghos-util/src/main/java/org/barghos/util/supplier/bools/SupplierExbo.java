package org.barghos.util.supplier.bools;

import org.barghos.util.supplier.SupplierEx;

/**
 * Represents a supplier of booleans.
 * Unlike {@link Supplierbo} this may throw Exceptions.
 *
 * <p>
 * There is no requirement that a new or distinct result be returned each
 * time the supplier is invoked.
 *
 * <p>
 * This is a functional interface whose functional method is {@link #getBool()}.
 * 
 * @see Supplierbo
 * @see SupplierExbo
 */
@FunctionalInterface
public interface SupplierExbo extends SupplierEx<Boolean>
{
    /**
     * Gets a result.
     *
     * @return A result.
     * 
     * @throws Exception May throw an exception during execution.
     */
    boolean getBool() throws Exception;
    
    /**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link getBool} instead.
     */
    @Override
    @Deprecated
    default Boolean get() throws Exception
    {
    	return getBool();
    }
}
