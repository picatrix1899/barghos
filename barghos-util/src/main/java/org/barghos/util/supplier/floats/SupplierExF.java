package org.barghos.util.supplier.floats;

import org.barghos.util.supplier.SupplierEx;

/**
 * Represents a supplier of float.
 * Unlike {@link SupplierF} this may throw Exceptions.
 *
 * <p>
 * There is no requirement that a new or distinct result be returned each
 * time the supplier is invoked.
 *
 * <p>
 * This is a functional interface whose functional method is {@link #getF()}.
 * 
 * @see SupplierF
 * @see SupplierExF
 */
@FunctionalInterface
public interface SupplierExF extends SupplierEx<Float>
{
	/**
	 * Gets a result.
	 *
	 * @return A result.
	 * 
	 * @throws Exception May throw an exception during execution.
	 */
	float getF() throws Exception;
	
	/**
	 * @deprecated Use {@link #getF()} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default Float get() throws Exception
	{
		return getF();
	}
}
