package org.barghos.util.supplier.longs;

import org.barghos.util.supplier.SupplierEx;

/**
 * Represents a supplier of longs.
 * Unlike {@link Supplierl} this may throw Exceptions.
 *
 * <p>
 * There is no requirement that a new or distinct result be returned each
 * time the supplier is invoked.
 *
 * <p>
 * This is a functional interface whose functional method is {@link #getLong()}.
 * 
 * @see Supplierl
 * @see SupplierExl
 */
@FunctionalInterface
public interface SupplierExl extends SupplierEx<Long>
{
    /**
     * Gets a result.
     *
     * @return A result.
     * 
     * @throws Exception May throw an exception during execution.
     */
    long getLong() throws Exception;
    
    /**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link getLong} instead.
     */
    @Override
    @Deprecated
    default Long get() throws Exception
    {
    	return getLong();
    }
}
