package org.barghos.util.supplier.strings;

import org.barghos.util.supplier.Supplier;

/**
 * Represents a supplier of 2-dimensional string arrays.
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
public interface SupplierStrA2 extends Supplier<String[][]>
{
	
	/**
	 * Gets a result.
	 *
	 * @return A result.
	 */
	String[][] getStrA2();
	
	@Override
	default String[][] get()
	{
		return getStrA2();
	}
	
	public static SupplierStrA2 of(String[][] value)
	{
		return () -> value;
	}
	
}
