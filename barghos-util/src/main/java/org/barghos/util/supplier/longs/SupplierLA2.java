package org.barghos.util.supplier.longs;

import org.barghos.util.supplier.Supplier;

/**
 * Represents a supplier of 2-dimensional long arrays.
 *
 * <p>
 * There is no requirement that a new or distinct result be returned each
 * time the supplier is invoked.
 *
 * <p>
 * This is a functional interface whose functional method is
 * {@link #getLA2()}.
 * 
 * @see SupplierLA2
 * @see SupplierExLA2
 */
@FunctionalInterface
public interface SupplierLA2 extends Supplier<long[][]>
{
	
	/**
	 * Gets a result.
	 *
	 * @return A result.
	 */
	long[][] getLA2();
	
	@Override
	default long[][] get()
	{
		return getLA2();
	}
	
	public static SupplierLA2 of(long[][] value)
	{
		return () -> value;
	}
	
}
