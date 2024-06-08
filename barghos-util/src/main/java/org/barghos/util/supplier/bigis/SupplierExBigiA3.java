package org.barghos.util.supplier.bigis;

import java.math.BigInteger;

import org.barghos.util.supplier.SupplierEx;

/**
 * Represents a supplier of 3-dimensional {@link BigInteger} arrays.
 * Unlike {@link SupplierBigiA3} this may throw Exceptions.
 *
 * <p>
 * There is no requirement that a new or distinct result be returned each
 * time the supplier is invoked.
 *
 * <p>
 * This is a functional interface whose functional method is
 * {@link #getBigInt3DArray()}.
 * 
 * @see SupplierBigiA3
 * @see SupplierExBigiA3
 */
@FunctionalInterface
public interface SupplierExBigiA3 extends SupplierEx<BigInteger>
{
    /**
     * Gets a result.
     *
     * @return A result.
     * 
     * @throws Exception May throw an exception during execution.
     */
	BigInteger getBigInt3DArray() throws Exception;
	
	/**
     * @deprecated Use {@link #getBigInt3DArray()} instead.
     */
    @Override
    @Deprecated(since = "1.0", forRemoval = false)
    default BigInteger getGeneric() throws Exception
    {
    	return getBigInt3DArray();
    }
}
