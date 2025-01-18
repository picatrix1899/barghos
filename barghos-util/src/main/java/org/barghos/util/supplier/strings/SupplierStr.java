package org.barghos.util.supplier.strings;

import org.barghos.util.supplier.Supplier;

/**
 * Represents a supplier of string.
 *
 * <p>
 * There is no requirement that a new or distinct result be returned each
 * time the supplier is invoked.
 *
 * <p>
 * This is a functional interface whose functional method is {@link #getStr()}.
 * 
 * @see SupplierStr
 * @see SupplierExStr
 */
@FunctionalInterface
public interface SupplierStr extends Supplier<String>
{
	
	/**
	 * Gets a result.
	 *
	 * @return A result.
	 */
	String getStr();
	
	@Override
	default String get()
	{
		return getStr();
	}
	
	public static SupplierStr of(String value)
	{
		return () -> value;
	}
	
}
