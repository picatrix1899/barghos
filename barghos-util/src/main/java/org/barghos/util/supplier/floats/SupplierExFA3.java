package org.barghos.util.supplier.floats;

import org.barghos.util.supplier.SupplierEx;

/**
 * Represents a supplier of float.
 * Unlike {@link SupplierFA3} this may throw Exceptions.
 *
 * <p>
 * There is no requirement that a new or distinct result be returned each
 * time the supplier is invoked.
 *
 * <p>
 * This is a functional interface whose functional method is
 * {@link #getFA3()}.
 * 
 * @see SupplierFA3
 * @see SupplierExFA3
 */
@FunctionalInterface
public interface SupplierExFA3 extends SupplierEx<float[][][]>
{
	
	/**
	 * Gets a result.
	 *
	 * @return A result.
	 * 
	 * @throws Exception May throw an exception during execution.
	 */
	float[][][] getFA3() throws Exception;
	
	@Override
	default float[][][] get() throws Exception
	{
		return getFA3();
	}
	
	public static SupplierExFA3 of(float[][][] value)
	{
		return () -> value;
	}
	
}
