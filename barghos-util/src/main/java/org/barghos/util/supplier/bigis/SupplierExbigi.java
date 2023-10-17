package org.barghos.util.supplier.bigis;

import java.math.BigInteger;

import org.barghos.util.supplier.SupplierEx;

/**
 * Represents a supplier of {@link BigInteger}.
 * Unlike {@link Supplierbigi} this may throw Exceptions.
 *
 * <p>
 * There is no requirement that a new or distinct result be returned each
 * time the supplier is invoked.
 *
 * <p>
 * This is a functional interface whose functional method is {@link #getBigInt()}.
 * 
 * @see Supplierbigi
 * @see SupplierExbigi
 */
@FunctionalInterface
public interface SupplierExbigi extends SupplierEx<BigInteger>
{
    /**
     * Gets a result.
     *
     * @return A result.
     * 
     * @throws Exception May throw an exception during execution.
     */
	BigInteger getBigInt() throws Exception;
	
	/**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link getBigInt} instead.
     */
    @Override
    @Deprecated
    default BigInteger get() throws Exception
    {
    	return getBigInt();
    }
}
