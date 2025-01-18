package org.barghos.util.supplier.ints;

import org.barghos.util.supplier.Supplier;

/**
 * Represents a supplier of int.
 *
 * <p>
 * There is no requirement that a new or distinct result be returned each
 * time the supplier is invoked.
 *
 * <p>
 * This is a functional interface whose functional method is {@link #getI()}.
 * 
 * @see SupplierI
 * @see SupplierExI
 */
@FunctionalInterface
public interface SupplierI extends Supplier<Integer>
{
	
	/**
	 * Gets a result.
	 *
	 * @return A result.
	 */
	int getI();
	
	@Override
	default Integer get()
	{
		return getI();
	}
	
	public static SupplierI of(int value)
	{
		return () -> value;
	}
	
}
