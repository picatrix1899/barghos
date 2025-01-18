package org.barghos.util.supplier.floats;

import org.barghos.util.supplier.Supplier;

/**
 * Represents a supplier of 2-dimensional float arrays.
 *
 * <p>
 * There is no requirement that a new or distinct result be returned each
 * time the supplier is invoked.
 *
 * <p>
 * This is a functional interface whose functional method is
 * {@link #getFA2()}.
 * 
 * @see SupplierFA2
 * @see SupplierExFA2
 */
@FunctionalInterface
public interface SupplierFA2 extends Supplier<float[][]>
{
	/**
	 * Gets a result.
	 *
	 * @return A result.
	 */
	float[][] getFA2();
	
	@Override
	default float[][] get()
	{
		return getFA2();
	}
	
	public static SupplierFA2 of(float[][] value)
	{
		return () -> value;
	}
	
}
