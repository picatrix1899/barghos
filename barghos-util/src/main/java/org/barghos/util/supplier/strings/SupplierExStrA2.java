package org.barghos.util.supplier.strings;

import org.barghos.util.supplier.SupplierEx;

/**
 * Represents a supplier of string.
 * Unlike {@link SupplierStrA2} this may throw Exceptions.
 *
 * <p>
 * There is no requirement that a new or distinct result be returned each
 * time the supplier is invoked.
 *
 * <p>
 * This is a functional interface whose functional method is
 * {@link #getStrA2()}.
 * 
 * @see SupplierStrA2
 * @see SupplierExStrA2
 */
@FunctionalInterface
public interface SupplierExStrA2 extends SupplierEx<String[][]>
{
	
	/**
	 * Gets a result.
	 *
	 * @return A result.
	 * 
	 * @throws Exception May throw an exception during execution.
	 */
	String[][] getStrA2() throws Exception;
	
	@Override
	default String[][] get() throws Exception
	{
		return getStrA2();
	}
	
	public static SupplierExStrA2 of(String[][] value)
	{
		return () -> value;
	}
	
}
