package org.barghos.util.supplier.bytes;

import org.barghos.util.supplier.Supplier;

/**
 * Represents a supplier of 2-dimensional byte arrays.
 *
 * <p>
 * There is no requirement that a new or distinct result be returned each
 * time the supplier is invoked.
 *
 * <p>
 * This is a functional interface whose functional method is
 * {@link #getBA2()}.
 * 
 * @see SupplierBA2
 * @see SupplierExBA2
 */
@FunctionalInterface
public interface SupplierBA2 extends Supplier<byte[][]>
{
	
	/**
	 * Gets a result.
	 *
	 * @return A result.
	 */
	byte[][] getBA2();
	
	@Override
	default byte[][] get()
	{
		return getBA2();
	}
	
	public static SupplierBA2 of(byte[][] value)
	{
		return () -> value;
	}
	
}
