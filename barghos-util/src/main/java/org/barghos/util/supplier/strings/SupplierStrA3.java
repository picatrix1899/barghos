package org.barghos.util.supplier.strings;

import org.barghos.util.supplier.Supplier;

/**
 * Represents a supplier of 3-dimensional string arrays.
 *
 * <p>
 * There is no requirement that a new or distinct result be returned each
 * time the supplier is invoked.
 *
 * <p>
 * This is a functional interface whose functional method is
 * {@link #getStrA3()}.
 * 
 * @see SupplierStrA3
 * @see SupplierExStrA3
 */
@FunctionalInterface
public interface SupplierStrA3 extends Supplier<String[][][]>
{
	/**
	 * Gets a result.
	 *
	 * @return A result.
	 */
	String[][][] getStrA3();
	
	/**
	 * @deprecated Use {@link #getStrA3()} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default String[][][] get()
	{
		return getStrA3();
	}
}
