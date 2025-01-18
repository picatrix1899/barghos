package org.barghos.util.supplier.longs;

import org.barghos.util.supplier.SupplierEx;

/**
 * Represents a supplier of long.
 * Unlike {@link SupplierLA3} this may throw Exceptions.
 *
 * <p>
 * There is no requirement that a new or distinct result be returned each
 * time the supplier is invoked.
 *
 * <p>
 * This is a functional interface whose functional method is
 * {@link #getLA3()}.
 * 
 * @see SupplierLA3
 * @see SupplierExLA3
 */
@FunctionalInterface
public interface SupplierExLA3 extends SupplierEx<long[][][]>
{
	
	/**
	 * Gets a result.
	 *
	 * @return A result.
	 * 
	 * @throws Exception May throw an exception during execution.
	 */
	long[][][] getLA3() throws Exception;
	
	@Override
	default long[][][] get() throws Exception
	{
		return getLA3();
	}
	
	public static SupplierExLA3 of(long[][][] value)
	{
		return () -> value;
	}
	
}
