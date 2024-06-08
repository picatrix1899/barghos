package org.barghos.util.supplier.bytes;

import org.barghos.util.supplier.Supplier;

/**
 * Represents a supplier of byte.
 *
 * <p>
 * There is no requirement that a new or distinct result be returned each
 * time the supplier is invoked.
 *
 * <p>
 * This is a functional interface whose functional method is {@link #getByte()}.
 * 
 * @see SupplierB
 * @see SupplierExB
 */
@FunctionalInterface
public interface SupplierB extends Supplier<Byte>
{
    /**
     * Gets a result.
     *
     * @return A result.
     */
    byte getByte();
    
    /**
     * @deprecated Use {@link #getByte()} instead.
     */
    @Override
    @Deprecated(since = "1.0", forRemoval = false)
    default Byte getGeneric()
    {
    	return getByte();
    }
}
