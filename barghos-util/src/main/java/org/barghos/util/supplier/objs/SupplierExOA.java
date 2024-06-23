package org.barghos.util.supplier.objs;

import org.barghos.util.supplier.SupplierEx;

/**
 * Represents a supplier of object.
 * Unlike {@link SupplierOA} this may throw Exceptions.
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
public interface SupplierExOA extends SupplierEx<Object[]>
{
	/**
	 * Gets a result.
	 *
	 * @return A result.
	 * 
	 * @throws Exception May throw an exception during execution.
	 */
	Object[] getOA() throws Exception;
	
	/**
	 * @deprecated Use {@link #getOA()} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default Object[] get() throws Exception
	{
		return getOA();
	}
}
