package org.barghos.util.supplier.doubles;

import org.barghos.util.supplier.Supplier;

/**
 * Represents a supplier of 1-dimensional double arrays.
 *
 * <p>
 * There is no requirement that a new or distinct result be returned each
 * time the supplier is invoked.
 *
 * <p>
 * This is a functional interface whose functional method is
 * {@link #getDA()}.
 * 
 * @see SupplierDA
 * @see SupplierExDA
 */
@FunctionalInterface
public interface SupplierDA extends Supplier<double[]>
{
	/**
	 * Gets a result.
	 *
	 * @return A result.
	 */
	double[] getDA();
	
	/**
	 * @deprecated Use {@link #getDA()} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default double[] get()
	{
		return getDA();
	}
}
