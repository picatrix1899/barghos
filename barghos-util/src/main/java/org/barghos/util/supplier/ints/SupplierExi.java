package org.barghos.util.supplier.ints;

import org.barghos.util.supplier.SupplierEx;

/**
 * Represents a supplier of integers.
 * Unlike {@link Supplieri} this may throw Exceptions.
 *
 * <p>
 * There is no requirement that a new or distinct result be returned each
 * time the supplier is invoked.
 *
 * <p>
 * This is a functional interface whose functional method is {@link #getInt()}.
 * 
 * @see Supplieri
 * @see SupplierExi
 */
@FunctionalInterface
public interface SupplierExi extends SupplierEx<Integer>
{
    /**
     * Gets a result.
     *
     * @return A result.
     * 
     * @throws Exception May throw an exception during execution.
     */
    int getInt() throws Exception;
    
    /**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link getInt} instead.
     */
    @Override
    @Deprecated
    default Integer get() throws Exception
    {
    	return getInt();
    }
}
