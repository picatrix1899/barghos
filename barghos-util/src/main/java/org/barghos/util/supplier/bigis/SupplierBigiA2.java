package org.barghos.util.supplier.bigis;

import java.math.BigInteger;

import org.barghos.util.supplier.Supplier;

/**
 * Represents a supplier of 2-dimensional {@link BigInteger} arrays.
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
public interface SupplierBigiA2 extends Supplier<BigInteger[][]>
{
	
	/**
	 * Gets a result.
	 *
	 * @return A result.
	 */
	BigInteger[][] getBigiA2();
	
	@Override
	default BigInteger[][] get()
	{
		return getBigiA2();
	}
	
	public static SupplierBigiA2 of(BigInteger[][] value)
	{
		return () -> value;
	}
	
}
