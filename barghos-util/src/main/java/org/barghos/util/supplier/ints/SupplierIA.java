package org.barghos.util.supplier.ints;

import org.barghos.util.supplier.Supplier;

/**
 * Represents a supplier of 1-dimensional int arrays.
 *
 * <p>
 * There is no requirement that a new or distinct result be returned each
 * time the supplier is invoked.
 *
 * <p>
 * This is a functional interface whose functional method is
 * {@link #getIA()}.
 * 
 * @see SupplierIA
 * @see SupplierExIA
 */
@FunctionalInterface
public interface SupplierIA extends Supplier<int[]>
{
	
	/**
	 * Gets a result.
	 *
	 * @return A result.
	 */
	int[] getIA();
	
	@Override
	default int[] get()
	{
		return getIA();
	}
	
	public static SupplierIA of(int[] value)
	{
		return () -> value;
	}
	
}
