package org.barghos.util.supplier.ints;

import org.barghos.util.supplier.Supplier;

/**
 * Represents a supplier of 2-dimensional int arrays.
 *
 * <p>
 * There is no requirement that a new or distinct result be returned each
 * time the supplier is invoked.
 *
 * <p>
 * This is a functional interface whose functional method is
 * {@link #getIA2()}.
 * 
 * @see SupplierIA2
 * @see SupplierExIA2
 */
@FunctionalInterface
public interface SupplierIA2 extends Supplier<int[][]>
{
	
	/**
	 * Gets a result.
	 *
	 * @return A result.
	 */
	int[][] getIA2();
	
	@Override
	default int[][] get()
	{
		return getIA2();
	}
	
	public static SupplierIA2 of(int[][] value)
	{
		return () -> value;
	}
	
}
