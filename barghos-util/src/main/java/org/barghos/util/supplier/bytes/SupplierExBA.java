package org.barghos.util.supplier.bytes;

import org.barghos.util.supplier.SupplierEx;

/**
 * Represents a supplier of byte.
 * Unlike {@link SupplierBA} this may throw Exceptions.
 *
 * <p>
 * There is no requirement that a new or distinct result be returned each
 * time the supplier is invoked.
 *
 * <p>
 * This is a functional interface whose functional method is
 * {@link #getBA()}.
 * 
 * @see SupplierBA
 * @see SupplierExBA
 */
@FunctionalInterface
public interface SupplierExBA extends SupplierEx<byte[]>
{
	/**
	 * Gets a result.
	 *
	 * @return A result.
	 * 
	 * @throws Exception May throw an exception during execution.
	 */
	byte[] getBA() throws Exception;
	
	/**
	 * @deprecated Use {@link #getBA()} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default byte[] get() throws Exception
	{
		return getBA();
	}
}
