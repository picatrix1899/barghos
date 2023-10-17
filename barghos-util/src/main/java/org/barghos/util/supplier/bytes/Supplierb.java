package org.barghos.util.supplier.bytes;

import org.barghos.util.supplier.Supplier;

/**
 * Represents a supplier of bytes.
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
public interface Supplierb extends Supplier<Byte>
{
    /**
     * Gets a result.
     *
     * @return A result.
     */
    byte getByte();
    
    /**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link getByte} instead.
     */
    @Override
    @Deprecated
    default Byte get()
    {
    	return getByte();
    }
}
