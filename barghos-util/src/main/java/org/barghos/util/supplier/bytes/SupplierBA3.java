package org.barghos.util.supplier.bytes;

import org.barghos.util.supplier.Supplier;

/**
 * Represents a supplier of 3-dimensional byte arrays.
 *
 * <p>
 * There is no requirement that a new or distinct result be returned each
 * time the supplier is invoked.
 *
 * <p>
 * This is a functional interface whose functional method is
 * {@link #getBA3()}.
 * 
 * @see SupplierBA3
 * @see SupplierExBA3
 */
@FunctionalInterface
public interface SupplierBA3 extends Supplier<byte[][][]>
{
	
	/**
	 * Gets a result.
	 *
	 * @return A result.
	 */
	byte[][][] getBA3();
	
	@Override
	default byte[][][] get()
	{
		return getBA3();
	}
	
	public static SupplierBA3 of(byte[][][] value)
	{
		return () -> value;
	}
	
}
