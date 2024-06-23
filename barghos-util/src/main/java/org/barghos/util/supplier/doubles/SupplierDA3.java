package org.barghos.util.supplier.doubles;

import org.barghos.util.supplier.Supplier;

/**
 * Represents a supplier of 3-dimensional double arrays.
 *
 * <p>
 * There is no requirement that a new or distinct result be returned each
 * time the supplier is invoked.
 *
 * <p>
 * This is a functional interface whose functional method is
 * {@link #getDA3()}.
 * 
 * @see SupplierDA3
 * @see SupplierExDA3
 */
@FunctionalInterface
public interface SupplierDA3 extends Supplier<double[][][]>
{
	/**
	 * Gets a result.
	 *
	 * @return A result.
	 */
	double[][][] getDA3();
	
	/**
	 * @deprecated Use {@link #getDA3()} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default double[][][] get()
	{
		return getDA3();
	}
}
