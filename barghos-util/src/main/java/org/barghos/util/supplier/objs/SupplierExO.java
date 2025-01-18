package org.barghos.util.supplier.objs;

import org.barghos.util.supplier.SupplierEx;

/**
 * Represents a supplier of object.
 * Unlike {@link SupplierO} this may throw Exceptions.
 *
 * <p>
 * There is no requirement that a new or distinct result be returned each
 * time the supplier is invoked.
 *
 * <p>
 * This is a functional interface whose functional method is
 * {@link #getO()}.
 * 
 * @see SupplierO
 * @see SupplierExO
 */
@FunctionalInterface
public interface SupplierExO extends SupplierEx<Object>
{
	
	/**
	 * Gets a result.
	 *
	 * @return A result.
	 * 
	 * @throws Exception May throw an exception during execution.
	 */
	Object getO() throws Exception;
	
	@Override
	default Object get() throws Exception
	{
		return getO();
	}
	
	public static SupplierExO of(Object value)
	{
		return () -> value;
	}
	
}
