package org.barghos.util.supplier.chars;

import org.barghos.util.supplier.SupplierEx;

/**
 * Represents a supplier of char.
 * Unlike {@link SupplierCA2} this may throw Exceptions.
 *
 * <p>
 * There is no requirement that a new or distinct result be returned each
 * time the supplier is invoked.
 *
 * <p>
 * This is a functional interface whose functional method is
 * {@link #getCA2()}.
 * 
 * @see SupplierCA2
 * @see SupplierExCA2
 */
@FunctionalInterface
public interface SupplierExCA2 extends SupplierEx<char[][]>
{
	/**
	 * Gets a result.
	 *
	 * @return A result.
	 * 
	 * @throws Exception May throw an exception during execution.
	 */
	char[][] getCA2() throws Exception;
	
	/**
	 * @deprecated Use {@link #getCA2()} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default char[][] get() throws Exception
	{
		return getCA2();
	}
}
