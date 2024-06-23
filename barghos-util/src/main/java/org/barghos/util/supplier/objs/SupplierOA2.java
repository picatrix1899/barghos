package org.barghos.util.supplier.objs;

import org.barghos.util.supplier.Supplier;

/**
 * Represents a supplier of 2-dimensional object arrays.
 *
 * <p>
 * There is no requirement that a new or distinct result be returned each
 * time the supplier is invoked.
 *
 * <p>
 * This is a functional interface whose functional method is
 * {@link #getOA2()}.
 * 
 * @see SupplierOA2
 * @see SupplierExOA2
 */
@FunctionalInterface
public interface SupplierOA2 extends Supplier<Object[][]>
{
	/**
	 * Gets a result.
	 *
	 * @return A result.
	 */
	Object[][] getOA2();
	
	/**
	 * @deprecated Use {@link #getOA2()} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default Object[][] get()
	{
		return getOA2();
	}
}
