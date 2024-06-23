package org.barghos.util.supplier.doubles;

import org.barghos.util.supplier.SupplierEx;

/**
 * Represents a supplier of double.
 * Unlike {@link SupplierDA} this may throw Exceptions.
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
public interface SupplierExDA extends SupplierEx<double[]>
{
	/**
	 * Gets a result.
	 *
	 * @return A result.
	 * 
	 * @throws Exception May throw an exception during execution.
	 */
	double[] getDA() throws Exception;
	
	/**
	 * @deprecated Use {@link #getDA()} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default double[] get() throws Exception
	{
		return getDA();
	}
}
