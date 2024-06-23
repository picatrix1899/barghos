package org.barghos.util.supplier.objs;

import org.barghos.util.supplier.Supplier;

/**
 * Represents a supplier of 1-dimensional object arrays.
 *
 * <p>
 * There is no requirement that a new or distinct result be returned each
 * time the supplier is invoked.
 *
 * <p>
 * This is a functional interface whose functional method is
 * {@link #getOA()}.
 * 
 * @see SupplierOA
 * @see SupplierExOA
 */
@FunctionalInterface
public interface SupplierOA extends Supplier<Object[]>
{
	/**
	 * Gets a result.
	 *
	 * @return A result.
	 */
	Object[] getOA();
	
	/**
	 * @deprecated Use {@link #getOA()} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default Object[] get()
	{
		return getOA();
	}
}
