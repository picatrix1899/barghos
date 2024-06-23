package org.barghos.util.supplier.bools;

import org.barghos.util.supplier.SupplierEx;

/**
 * Represents a supplier of booleans.
 * Unlike {@link SupplierBo} this may throw Exceptions.
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
public interface SupplierExBo extends SupplierEx<Boolean>
{
	/**
	 * Gets a result.
	 *
	 * @return A result.
	 * 
	 * @throws Exception May throw an exception during execution.
	 */
	boolean getBo() throws Exception;
	
	/**
	 * @deprecated Use {@link #getBool()} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default Boolean get() throws Exception
	{
		return getBo();
	}
}
