package org.barghos.util.supplier.bigis;

import java.math.BigInteger;

import org.barghos.util.supplier.Supplier;

/**
 * Represents a supplier of 3-dimensional {@link BigInteger} arrays.
 *
 * <p>
 * There is no requirement that a new or distinct result be returned each
 * time the supplier is invoked.
 *
 * <p>
 * This is a functional interface whose functional method is
 * {@link #getBigiA3()}.
 * 
 * @see SupplierBigiA3
 * @see SupplierExBigiA3
 */
@FunctionalInterface
public interface SupplierBigiA3 extends Supplier<BigInteger[][][]>
{
    /**
     * Gets a result.
     *
     * @return A result.
     */
    BigInteger[][][] getBigiA3();
    
    /**
     * @deprecated Use {@link #getBigiA3()} instead.
     */
    @Override
    @Deprecated(since = "1.0", forRemoval = false)
    default BigInteger[][][] get()
    {
    	return getBigiA3();
    }
}
