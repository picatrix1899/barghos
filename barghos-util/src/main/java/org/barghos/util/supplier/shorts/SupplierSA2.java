package org.barghos.util.supplier.shorts;

import org.barghos.util.supplier.Supplier;

/**
 * Represents a supplier of 2-dimensional short arrays.
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
public interface SupplierSA2 extends Supplier<short[][]>
{

	/**
	 * Gets a result.
	 *
	 * @return A result.
	 */
	short[][] getSA2();
	
	@Override
	default short[][] get()
	{
		return getSA2();
	}
	
	public static SupplierSA2 of(short[][] value)
	{
		return () -> value;
	}
	
}
