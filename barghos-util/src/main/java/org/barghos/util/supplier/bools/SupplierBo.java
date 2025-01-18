package org.barghos.util.supplier.bools;

import org.barghos.util.supplier.Supplier;

/**
 * Represents a supplier of booleans.
 *
 * <p>
 * There is no requirement that a new or distinct result be returned each
 * time the supplier is invoked.
 *
 * <p>
 * This is a functional interface whose functional method is {@link #getBo()}.
 * 
 * @see SupplierBo
 * @see SupplierExBo
 */
@FunctionalInterface
public interface SupplierBo extends Supplier<Boolean>
{
	
	/**
	 * Gets a result.
	 *
	 * @return A result.
	 */
	boolean getBo();
	
	@Override
	default Boolean get()
	{
		return getBo();
	}
	
	public static SupplierBo of(boolean value)
	{
		return () -> value;
	}
	
}
