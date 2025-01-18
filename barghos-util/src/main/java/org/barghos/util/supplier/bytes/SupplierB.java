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
 * This is a functional interface whose functional method is {@link #getB()}.
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
	byte getB();
	
	@Override
	default Byte get()
	{
		return getB();
	}
	
	public static SupplierB of(byte value)
	{
		return () -> value;
	}
	
}
