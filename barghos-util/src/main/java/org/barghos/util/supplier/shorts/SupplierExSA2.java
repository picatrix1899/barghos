package org.barghos.util.supplier.shorts;

import org.barghos.util.supplier.SupplierEx;

/**
 * Represents a supplier of short.
 * Unlike {@link SupplierSA2} this may throw Exceptions.
 *
 * <p>
 * There is no requirement that a new or distinct result be returned each
 * time the supplier is invoked.
 *
 * <p>
 * This is a functional interface whose functional method is
 * {@link #getSA2()}.
 * 
 * @see SupplierSA2
 * @see SupplierExSA2
 */
@FunctionalInterface
public interface SupplierExSA2 extends SupplierEx<short[][]>
{
	
	/**
	 * Gets a result.
	 *
	 * @return A result.
	 * 
	 * @throws Exception May throw an exception during execution.
	 */
	short[][] getSA2() throws Exception;
	
	@Override
	default short[][] get() throws Exception
	{
		return getSA2();
	}
	
	public static SupplierExSA2 of(short[][] value)
	{
		return () -> value;
	}
	
}
