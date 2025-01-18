package org.barghos.util.supplier.bytes;

import org.barghos.util.supplier.SupplierEx;

/**
 * Represents a supplier of byte.
 * Unlike {@link SupplierB} this may throw Exceptions.
 *
 * <p>
 * There is no requirement that a new or distinct result be returned each
 * time the supplier is invoked.
 *
 * <p>
 * This is a functional interface whose functional method is {@link #getB()}.
 * 
 * @see SupplierB
 * @see SupplierExB
 */
@FunctionalInterface
public interface SupplierExB extends SupplierEx<Byte>
{
	
	/**
	 * Gets a result.
	 *
	 * @return A result.
	 * 
	 * @throws Exception May throw an exception during execution.
	 */
	byte getB() throws Exception;
	
	@Override
	default Byte get() throws Exception
	{
		return getB();
	}
	
	public static SupplierExB of(byte value)
	{
		return () -> value;
	}
	
}
