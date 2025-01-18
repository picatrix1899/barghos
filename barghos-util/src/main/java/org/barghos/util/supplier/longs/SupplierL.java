package org.barghos.util.supplier.longs;

import org.barghos.util.supplier.Supplier;

/**
 * Represents a supplier of long.
 *
 * <p>
 * There is no requirement that a new or distinct result be returned each
 * time the supplier is invoked.
 *
 * <p>
 * This is a functional interface whose functional method is {@link #getL()}.
 * 
 * @see SupplierL
 * @see SupplierExL
 */
@FunctionalInterface
public interface SupplierL extends Supplier<Long>
{
	
	/**
	 * Gets a result.
	 *
	 * @return A result.
	 */
	long getL();
	
	@Override
	default Long get()
	{
		return getL();
	}
	
	public static SupplierL of(long value)
	{
		return () -> value;
	}
	
}
