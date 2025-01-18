package org.barghos.util.supplier.bigis;

import java.math.BigInteger;

import org.barghos.util.supplier.SupplierEx;

/**
 * Represents a supplier of 2-dimensional {@link BigInteger} arrays.
 * Unlike {@link SupplierBigiA2} this may throw Exceptions.
 *
 * <p>
 * There is no requirement that a new or distinct result be returned each
 * time the supplier is invoked.
 *
 * <p>
 * This is a functional interface whose functional method is
 * {@link #getBigiA2()}.
 * 
 * @see SupplierBigiA2
 * @see SupplierExBigiA2
 */
@FunctionalInterface
public interface SupplierExBigiA2 extends SupplierEx<BigInteger[][]>
{
	
	/**
	 * Gets a result.
	 *
	 * @return A result.
	 * 
	 * @throws Exception May throw an exception during execution.
	 */
	BigInteger[][] getBigiA2() throws Exception;
	
	@Override
	default BigInteger[][] get() throws Exception
	{
		return getBigiA2();
	}
	
	public static SupplierExBigiA2 of(BigInteger[][] value)
	{
		return () -> value;
	}
	
}
