package org.barghos.util.supplier.shorts;

import org.barghos.util.supplier.Supplier;

/**
 * Represents a supplier of short.
 *
 * <p>
 * There is no requirement that a new or distinct result be returned each
 * time the supplier is invoked.
 *
 * <p>
 * This is a functional interface whose functional method is
 * {@link #getS()}.
 * 
 * @see SupplierS
 * @see SupplierExS
 */
@FunctionalInterface
public interface SupplierS extends Supplier<Short>
{
	
	/**
	 * Gets a result.
	 *
	 * @return A result.
	 */
	short getS();
	
	@Override
	default Short get()
	{
		return getS();
	}
	
	public static SupplierS of(short value)
	{
		return () -> value;
	}
	
}
