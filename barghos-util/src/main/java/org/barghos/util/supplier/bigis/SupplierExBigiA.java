package org.barghos.util.supplier.bigis;

import java.math.BigInteger;

import org.barghos.util.supplier.SupplierEx;

/**
 * Represents a supplier of 1-dimensional {@link BigInteger} arrays.
 * Unlike {@link SupplierBigiA} this may throw Exceptions.
 *
 * <p>
 * There is no requirement that a new or distinct result be returned each
 * time the supplier is invoked.
 *
 * <p>
 * This is a functional interface whose functional method is
 * {@link #getBigiA()}.
 * 
 * @see SupplierBigiA
 * @see SupplierExBigiA
 */
@FunctionalInterface
public interface SupplierExBigiA extends SupplierEx<BigInteger>
{
	/**
	 * Gets a result.
	 *
	 * @return A result.
	 * 
	 * @throws Exception May throw an exception during execution.
	 */
	BigInteger getBigiA() throws Exception;
	
	/**
	 * @deprecated Use {@link #getBigiA()} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default BigInteger get() throws Exception
	{
		return getBigiA();
	}
}
