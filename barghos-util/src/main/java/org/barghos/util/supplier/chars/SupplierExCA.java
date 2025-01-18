package org.barghos.util.supplier.chars;

import org.barghos.util.supplier.SupplierEx;

/**
 * Represents a supplier of char.
 * Unlike {@link SupplierCA} this may throw Exceptions.
 *
 * <p>
 * There is no requirement that a new or distinct result be returned each
 * time the supplier is invoked.
 *
 * <p>
 * This is a functional interface whose functional method is
 * {@link #getCA()}.
 * 
 * @see SupplierCA
 * @see SupplierExCA
 */
@FunctionalInterface
public interface SupplierExCA extends SupplierEx<char[]>
{
	
	/**
	 * Gets a result.
	 *
	 * @return A result.
	 * 
	 * @throws Exception May throw an exception during execution.
	 */
	char[] getCA() throws Exception;
	
	@Override
	default char[] get() throws Exception
	{
		return getCA();
	}
	
	public static SupplierExCA of(char[] value)
	{
		return () -> value;
	}
	
}
