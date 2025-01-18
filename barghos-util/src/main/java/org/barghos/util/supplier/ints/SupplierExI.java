package org.barghos.util.supplier.ints;

import org.barghos.util.supplier.SupplierEx;

/**
 * Represents a supplier of int.
 * Unlike {@link SupplierI} this may throw Exceptions.
 *
 * <p>
 * There is no requirement that a new or distinct result be returned each
 * time the supplier is invoked.
 *
 * <p>
 * This is a functional interface whose functional method is {@link #getI()}.
 * 
 * @see SupplierI
 * @see SupplierExI
 */
@FunctionalInterface
public interface SupplierExI extends SupplierEx<Integer>
{
	
	/**
	 * Gets a result.
	 *
	 * @return A result.
	 * 
	 * @throws Exception May throw an exception during execution.
	 */
	int getI() throws Exception;
	
	@Override
	default Integer get() throws Exception
	{
		return getI();
	}
	
	public static SupplierExI of(int value)
	{
		return () -> value;
	}
	
}
