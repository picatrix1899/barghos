package org.barghos.util.supplier.bytes;

import org.barghos.util.supplier.SupplierEx;

/**
 * Represents a supplier of byte.
 * Unlike {@link SupplierBA3} this may throw Exceptions.
 *
 * <p>
 * There is no requirement that a new or distinct result be returned each
 * time the supplier is invoked.
 *
 * <p>
 * This is a functional interface whose functional method is
 * {@link #getBA3()}.
 * 
 * @see SupplierBA3
 * @see SupplierExBA3
 */
@FunctionalInterface
public interface SupplierExBA3 extends SupplierEx<byte[][][]>
{
	
	/**
	 * Gets a result.
	 *
	 * @return A result.
	 * 
	 * @throws Exception May throw an exception during execution.
	 */
	byte[][][] getBA3() throws Exception;
	
	@Override
	default byte[][][] get() throws Exception
	{
		return getBA3();
	}
	
	public static SupplierExBA3 of(byte[][][] value)
	{
		return () -> value;
	}
	
}
