package org.barghos.util.supplier.bools;

import org.barghos.util.supplier.Supplier;

/**
 * Represents a supplier of 3-dimensional booleans arrays.
 *
 * <p>
 * There is no requirement that a new or distinct result be returned each
 * time the supplier is invoked.
 *
 * <p>
 * This is a functional interface whose functional method is
 * {@link #getBoA3()}.
 * 
 * @see SupplierBoA3
 * @see SupplierExBoA3
 */
@FunctionalInterface
public interface SupplierBoA3 extends Supplier<boolean[][][]>
{
	
	/**
	 * Gets a result.
	 *
	 * @return A result.
	 */
	boolean[][][] getBoA3();
	
	@Override
	default boolean[][][] get()
	{
		return getBoA3();
	}
	
	public static SupplierBoA3 of(boolean[][][] value)
	{
		return () -> value;
	}
	
}
