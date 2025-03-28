package org.barghos.util.supplier.doubles;

import org.barghos.util.supplier.Supplier;

/**
 * Represents a supplier of 2-dimensional double arrays.
 *
 * <p>
 * There is no requirement that a new or distinct result be returned each
 * time the supplier is invoked.
 *
 * <p>
 * This is a functional interface whose functional method is
 * {@link #getDA2()}.
 * 
 * @see SupplierDA2
 * @see SupplierExDA2
 */
@FunctionalInterface
public interface SupplierDA2 extends Supplier<double[][]>
{
	
	/**
	 * Gets a result.
	 *
	 * @return A result.
	 */
	double[][] getDA2();
	
	@Override
	default double[][] get()
	{
		return getDA2();
	}
	
	public static SupplierDA2 of(double[][] value)
	{
		return () -> value;
	}
	
}
