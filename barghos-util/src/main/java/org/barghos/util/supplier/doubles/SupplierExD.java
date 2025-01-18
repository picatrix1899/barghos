package org.barghos.util.supplier.doubles;

import org.barghos.util.supplier.SupplierEx;

/**
 * Represents a supplier of double.
 * Unlike {@link SupplierD} this may throw Exceptions.
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
public interface SupplierExD extends SupplierEx<Double>
{
	
	/**
	 * Gets a result.
	 *
	 * @return A result.
	 * 
	 * @throws Exception May throw an exception during execution.
	 */
	double getD() throws Exception;
	
	@Override
	default Double get() throws Exception
	{
		return getD();
	}
	
	public static SupplierExD of(double value)
	{
		return () -> value;
	}
	
}
