package org.barghos.util.supplier.bytes;

import org.barghos.util.supplier.Supplier;

/**
 * Represents a supplier of 1-dimensional byte arrays.
 *
 * <p>
 * There is no requirement that a new or distinct result be returned each
 * time the supplier is invoked.
 *
 * <p>
 * This is a functional interface whose functional method is
 * {@link #getBA()}.
 * 
 * @see SupplierBA
 * @see SupplierExBA
 */
@FunctionalInterface
public interface SupplierBA extends Supplier<byte[]>
{
	
	/**
	 * Gets a result.
	 *
	 * @return A result.
	 */
	byte[] getBA();
	
	@Override
	default byte[] get()
	{
		return getBA();
	}
	
	public static SupplierBA of(byte[] value)
	{
		return () -> value;
	}
	
}
