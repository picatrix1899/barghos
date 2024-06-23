package org.barghos.util.supplier.bigis;

import java.math.BigInteger;

import org.barghos.util.supplier.Supplier;

/**
 * Represents a supplier of {@link BigInteger}.
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
public interface SupplierBigi extends Supplier<BigInteger>
{
	/**
	 * Gets a result.
	 *
	 * @return A result.
	 */
	BigInteger getBigi();
	
	/**
	 * @deprecated Use {@link #getBigi()} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default BigInteger get()
	{
		return getBigi();
	}
}
