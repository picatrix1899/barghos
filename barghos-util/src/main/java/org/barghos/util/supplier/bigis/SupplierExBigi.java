package org.barghos.util.supplier.bigis;

import java.math.BigInteger;

import org.barghos.util.supplier.SupplierEx;

/**
 * Represents a supplier of {@link BigInteger}.
 * Unlike {@link SupplierBigi} this may throw Exceptions.
 *
 * <p>
 * There is no requirement that a new or distinct result be returned each
 * time the supplier is invoked.
 *
 * <p>
 * This is a functional interface whose functional method is
 * {@link #getBigi()}.
 * 
 * @see SupplierBigi
 * @see SupplierExBigi
 */
@FunctionalInterface
public interface SupplierExBigi extends SupplierEx<BigInteger>
{
	
	/**
	 * Gets a result.
	 *
	 * @return A result.
	 * 
	 * @throws Exception May throw an exception during execution.
	 */
	BigInteger getBigi() throws Exception;
	
	@Override
	default BigInteger get() throws Exception
	{
		return getBigi();
	}
	
	public static SupplierExBigi of(BigInteger value)
	{
		return () -> value;
	}
	
}
