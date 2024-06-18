package org.barghos.util.supplier.longs;

import org.barghos.util.supplier.SupplierEx;

/**
 * Represents a supplier of long.
 * Unlike {@link SupplierLA2} this may throw Exceptions.
 *
 * <p>
 * There is no requirement that a new or distinct result be returned each
 * time the supplier is invoked.
 *
 * <p>
 * This is a functional interface whose functional method is
 * {@link #getLA2()}.
 * 
 * @see SupplierLA2
 * @see SupplierExLA2
 */
@FunctionalInterface
public interface SupplierExLA2 extends SupplierEx<long[][]>
{
    /**
     * Gets a result.
     *
     * @return A result.
     * 
     * @throws Exception May throw an exception during execution.
     */
	long[][] getLA2() throws Exception;
    
    /**
     * @deprecated Use {@link #getLA2()} instead.
     */
    @Override
    @Deprecated(since = "1.0", forRemoval = false)
    default long[][] get() throws Exception
    {
    	return getLA2();
    }
}
