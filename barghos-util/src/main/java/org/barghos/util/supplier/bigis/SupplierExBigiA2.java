package org.barghos.util.supplier.bigis;

import java.math.BigInteger;

import org.barghos.util.supplier.SupplierEx;

/**
 * Represents a supplier of 2-dimensional {@link BigInteger} arrays.
 * Unlike {@link SupplierBigiA2} this may throw Exceptions.
 *
 * <p>
 * There is no requirement that a new or distinct result be returned each
 * time the supplier is invoked.
 *
 * <p>
 * This is a functional interface whose functional method is
 * {@link #getBigInt2DArray()}.
 * 
 * @see SupplierBigiA2
 * @see SupplierExBigiA2
 */
@FunctionalInterface
public interface SupplierExBigiA2 extends SupplierEx<BigInteger>
{
    /**
     * Gets a result.
     *
     * @return A result.
     * 
     * @throws Exception May throw an exception during execution.
     */
	BigInteger getBigInt2DArray() throws Exception;
	
	/**
     * @deprecated Use {@link #getBigInt2DArray()} instead.
     */
    @Override
    @Deprecated(since = "1.0", forRemoval = false)
    default BigInteger getGeneric() throws Exception
    {
    	return getBigInt2DArray();
    }
}
