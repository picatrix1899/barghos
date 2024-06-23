package org.barghos.util.supplier.doubles;

import org.barghos.util.supplier.Supplier;

/**
 * Represents a supplier of double.
 *
 * <p>
 * There is no requirement that a new or distinct result be returned each
 * time the supplier is invoked.
 *
 * <p>
 * This is a functional interface whose functional method is {@link #getD()}.
 * 
 * @see SupplierD
 * @see SupplierExD
 */
@FunctionalInterface
public interface SupplierD extends Supplier<Double>
{
	/**
	 * Gets a result.
	 *
	 * @return A result.
	 */
	double getD();
	
	/**
	 * @deprecated Use {@link #getD()} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default Double get()
	{
		return getD();
	}
}
