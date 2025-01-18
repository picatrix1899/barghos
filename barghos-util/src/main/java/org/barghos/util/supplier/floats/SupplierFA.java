package org.barghos.util.supplier.floats;

import org.barghos.util.supplier.Supplier;

/**
 * Represents a supplier of 1-dimensional float arrays.
 *
 * <p>
 * There is no requirement that a new or distinct result be returned each
 * time the supplier is invoked.
 *
 * <p>
 * This is a functional interface whose functional method is
 * {@link #getFA()}.
 * 
 * @see SupplierFA
 * @see SupplierExFA
 */
@FunctionalInterface
public interface SupplierFA extends Supplier<float[]>
{
	
	/**
	 * Gets a result.
	 *
	 * @return A result.
	 */
	float[] getFA();
	
	@Override
	default float[] get()
	{
		return getFA();
	}
	
	public static SupplierFA of(float[] value)
	{
		return () -> value;
	}
	
}
