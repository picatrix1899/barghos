package org.barghos.util.supplier.objs;

import org.barghos.util.supplier.SupplierEx;

/**
 * Represents a supplier of object.
 * Unlike {@link SupplierOA3} this may throw Exceptions.
 *
 * <p>
 * There is no requirement that a new or distinct result be returned each
 * time the supplier is invoked.
 *
 * <p>
 * This is a functional interface whose functional method is
 * {@link #getOA3()}.
 * 
 * @see SupplierOA3
 * @see SupplierExOA3
 */
@FunctionalInterface
public interface SupplierExOA3 extends SupplierEx<Object[][][]>
{
	
	/**
	 * Gets a result.
	 *
	 * @return A result.
	 * 
	 * @throws Exception May throw an exception during execution.
	 */
	Object[][][] getOA3() throws Exception;
	
	@Override
	default Object[][][] get() throws Exception
	{
		return getOA3();
	}
	
	public static SupplierExOA3 of(Object[][][] value)
	{
		return () -> value;
	}
	
}
