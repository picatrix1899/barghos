package org.barghos.util.supplier.chars;

import org.barghos.util.supplier.Supplier;

/**
 * Represents a supplier of 1-dimensional char arrays.
 *
 * <p>
 * There is no requirement that a new or distinct result be returned each
 * time the supplier is invoked.
 *
 * <p>
 * This is a functional interface whose functional method is
 * {@link #getCA()}.
 * 
 * @see SupplierCA
 * @see SupplierExCA
 */
@FunctionalInterface
public interface SupplierCA extends Supplier<char[]>
{
	
	/**
	 * Gets a result.
	 *
	 * @return A result.
	 */
	char[] getCA();
	
	@Override
	default char[] get()
	{
		return getCA();
	}
	
	public static SupplierCA of(char[] value)
	{
		return () -> value;
	}
	
}
