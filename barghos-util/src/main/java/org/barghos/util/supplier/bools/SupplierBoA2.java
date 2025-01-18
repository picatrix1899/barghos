package org.barghos.util.supplier.bools;

import org.barghos.util.supplier.Supplier;

/**
 * Represents a supplier of 2-dimensional booleans arrays.
 *
 * <p>
 * There is no requirement that a new or distinct result be returned each
 * time the supplier is invoked.
 *
 * <p>
 * This is a functional interface whose functional method is
 * {@link #getBoA2()}.
 * 
 * @see SupplierBoA2
 * @see SupplierExBoA2
 */
@FunctionalInterface
public interface SupplierBoA2 extends Supplier<boolean[][]>
{
	
	/**
	 * Gets a result.
	 *
	 * @return A result.
	 */
	boolean[][] getBoA2();
	
	@Override
	default boolean[][] get()
	{
		return getBoA2();
	}
	
	public static SupplierBoA2 of(boolean[][] value)
	{
		return () -> value;
	}
	
}
