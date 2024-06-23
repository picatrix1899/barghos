package org.barghos.util.supplier.shorts;

import org.barghos.util.supplier.Supplier;

/**
 * Represents a supplier of 3-dimensional short arrays.
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
public interface SupplierSA3 extends Supplier<short[][][]>
{
	/**
	 * Gets a result.
	 *
	 * @return A result.
	 */
	short[][][] getSA3();
	
	/**
	 * @deprecated Use {@link #getSA3()} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default short[][][] get()
	{
		return getSA3();
	}
}
