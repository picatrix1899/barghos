package org.barghos.util.supplier.doubles;

import org.barghos.util.supplier.SupplierEx;

/**
 * Represents a supplier of double.
 * Unlike {@link SupplierDA3} this may throw Exceptions.
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
public interface SupplierExDA3 extends SupplierEx<double[][][]>
{
	
	/**
	 * Gets a result.
	 *
	 * @return A result.
	 * 
	 * @throws Exception May throw an exception during execution.
	 */
	double[][][] getDA3() throws Exception;
	
	@Override
	default double[][][] get() throws Exception
	{
		return getDA3();
	}
	
	public static SupplierExDA3 of(double[][][] value)
	{
		return () -> value;
	}
	
}
