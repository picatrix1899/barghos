package org.barghos.util.supplier.shorts;

import org.barghos.util.supplier.SupplierEx;

/**
 * Represents a supplier of short.
 * Unlike {@link SupplierSA3} this may throw Exceptions.
 *
 * <p>
 * There is no requirement that a new or distinct result be returned each
 * time the supplier is invoked.
 *
 * <p>
 * This is a functional interface whose functional method is
 * {@link #getSA3()}.
 * 
 * @see SupplierSA3
 * @see SupplierExSA3
 */
@FunctionalInterface
public interface SupplierExSA3 extends SupplierEx<short[][][]>
{
	
	/**
	 * Gets a result.
	 *
	 * @return A result.
	 * 
	 * @throws Exception May throw an exception during execution.
	 */
	short[][][] getSA3() throws Exception;
	
	@Override
	default short[][][] get() throws Exception
	{
		return getSA3();
	}
	
	public static SupplierExSA3 of(short[][][] value)
	{
		return () -> value;
	}
	
}
