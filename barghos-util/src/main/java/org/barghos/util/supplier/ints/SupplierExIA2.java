package org.barghos.util.supplier.ints;

import org.barghos.util.supplier.SupplierEx;

/**
 * Represents a supplier of int.
 * Unlike {@link SupplierIA2} this may throw Exceptions.
 *
 * <p>
 * There is no requirement that a new or distinct result be returned each
 * time the supplier is invoked.
 *
 * <p>
 * This is a functional interface whose functional method is
 * {@link #getIA2()}.
 * 
 * @see SupplierIA2
 * @see SupplierExIA2
 */
@FunctionalInterface
public interface SupplierExIA2 extends SupplierEx<int[][]>
{
	
	/**
	 * Gets a result.
	 *
	 * @return A result.
	 * 
	 * @throws Exception May throw an exception during execution.
	 */
	int[][] getIA2() throws Exception;
	
	@Override
	default int[][] get() throws Exception
	{
		return getIA2();
	}
	
	public static SupplierExIA2 of(int[][] value)
	{
		return () -> value;
	}
	
}
