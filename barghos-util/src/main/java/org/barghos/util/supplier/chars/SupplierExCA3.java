package org.barghos.util.supplier.chars;

import org.barghos.util.supplier.SupplierEx;

/**
 * Represents a supplier of char.
 * Unlike {@link SupplierCA3} this may throw Exceptions.
 *
 * <p>
 * There is no requirement that a new or distinct result be returned each
 * time the supplier is invoked.
 *
 * <p>
 * This is a functional interface whose functional method is
 * {@link #getCA3()}.
 * 
 * @see SupplierCA3
 * @see SupplierExCA3
 */
@FunctionalInterface
public interface SupplierExCA3 extends SupplierEx<char[][][]>
{
	
	/**
	 * Gets a result.
	 *
	 * @return A result.
	 * 
	 * @throws Exception May throw an exception during execution.
	 */
	char[][][] getCA3() throws Exception;
	
	@Override
	default char[][][] get() throws Exception
	{
		return getCA3();
	}
	
	public static SupplierExCA3 of(char[][][] value)
	{
		return () -> value;
	}
	
}
