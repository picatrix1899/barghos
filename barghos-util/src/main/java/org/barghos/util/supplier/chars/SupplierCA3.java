package org.barghos.util.supplier.chars;

import org.barghos.util.supplier.Supplier;

/**
 * Represents a supplier of 3-dimensional char arrays.
 *
 * <p>
 * There is no requirement that a new or distinct result be returned each
 * time the supplier is invoked.
 *
 * <p>
 * This is a functional interface whose functional method is
 * {@link #getCA3()}.
 * 
 * @see SupplierCA3
 * @see SupplierExCA3
 */
@FunctionalInterface
public interface SupplierCA3 extends Supplier<char[][][]>
{
	
	/**
	 * Gets a result.
	 *
	 * @return A result.
	 */
	char[][][] getCA3();
	
	@Override
	default char[][][] get()
	{
		return getCA3();
	}
	
	public static SupplierCA3 of(char[][][] value)
	{
		return () -> value;
	}
	
}
