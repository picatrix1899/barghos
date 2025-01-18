package org.barghos.util.supplier.floats;

import org.barghos.util.supplier.SupplierEx;

/**
 * Represents a supplier of float.
 * Unlike {@link SupplierFA} this may throw Exceptions.
 *
 * <p>
 * There is no requirement that a new or distinct result be returned each
 * time the supplier is invoked.
 *
 * <p>
 * This is a functional interface whose functional method is
 * {@link #getFA()}.
 * 
 * @see SupplierFA
 * @see SupplierExFA
 */
@FunctionalInterface
public interface SupplierExFA extends SupplierEx<float[]>
{
	
	/**
	 * Gets a result.
	 *
	 * @return A result.
	 * 
	 * @throws Exception May throw an exception during execution.
	 */
	float[] getFA() throws Exception;
	
	@Override
	default float[] get() throws Exception
	{
		return getFA();
	}
	
	public static SupplierExFA of(float[] value)
	{
		return () -> value;
	}
	
}
