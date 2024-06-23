package org.barghos.util.supplier.objs;

import org.barghos.util.supplier.SupplierEx;

/**
 * Represents a supplier of object.
 * Unlike {@link SupplierOA2} this may throw Exceptions.
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
public interface SupplierExOA2 extends SupplierEx<Object[][]>
{
	/**
	 * Gets a result.
	 *
	 * @return A result.
	 * 
	 * @throws Exception May throw an exception during execution.
	 */
	Object[][] getOA2() throws Exception;
	
	/**
	 * @deprecated Use {@link #getOA2()} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default Object[][] get() throws Exception
	{
		return getOA2();
	}
}
