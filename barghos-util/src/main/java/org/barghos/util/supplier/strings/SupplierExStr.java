package org.barghos.util.supplier.strings;

import org.barghos.util.supplier.SupplierEx;

/**
 * Represents a supplier of string.
 * Unlike {@link SupplierStr} this may throw Exceptions.
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
public interface SupplierExStr extends SupplierEx<String>
{
	
	/**
	 * Gets a result.
	 *
	 * @return A result.
	 * 
	 * @throws Exception May throw an exception during execution.
	 */
	String getStr() throws Exception;
	
	@Override
	default String get() throws Exception
	{
		return getStr();
	}
	
	public static SupplierExStr of(String value)
	{
		return () -> value;
	}
	
}
