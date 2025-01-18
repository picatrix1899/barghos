package org.barghos.util.supplier.longs;

import org.barghos.util.supplier.Supplier;

/**
 * Represents a supplier of 3-dimensional long arrays.
 *
 * <p>
 * There is no requirement that a new or distinct result be returned each
 * time the supplier is invoked.
 *
 * <p>
 * This is a functional interface whose functional method is
 * {@link #getLA3()}.
 * 
 * @see SupplierLA3
 * @see SupplierExLA3
 */
@FunctionalInterface
public interface SupplierLA3 extends Supplier<long[][][]>
{
	
	/**
	 * Gets a result.
	 *
	 * @return A result.
	 */
	long[][][] getLA3();
	
	@Override
	default long[][][] get()
	{
		return getLA3();
	}
	
	public static SupplierLA3 of(long[][][] value)
	{
		return () -> value;
	}
	
}
