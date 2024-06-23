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
	
	/**
	 * @deprecated Use {@link #getCA3()} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default char[][][] get()
	{
		return getCA3();
	}
}
