package org.barghos.util.supplier.bytes;

import org.barghos.util.supplier.SupplierEx;

/**
 * Represents a supplier of bytes.
 * Unlike {@link Supplierb} this may throw Exceptions.
 *
 * <p>
 * There is no requirement that a new or distinct result be returned each
 * time the supplier is invoked.
 *
 * <p>
 * This is a functional interface whose functional method is {@link #getByte()}.
 * 
 * @see Supplierb
 * @see SupplierExb
 */
@FunctionalInterface
public interface SupplierExb extends SupplierEx<Byte>
{
    /**
     * Gets a result.
     *
     * @return A result.
     * 
     * @throws Exception May throw an exception during execution.
     */
    byte getByte() throws Exception;
    
    /**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link getByte} instead.
     */
    @Override
    @Deprecated
    default Byte get() throws Exception
    {
    	return getByte();
    }
}
