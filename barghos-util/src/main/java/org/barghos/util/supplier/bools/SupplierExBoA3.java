package org.barghos.util.supplier.bools;

import org.barghos.util.supplier.SupplierEx;

/**
 * Represents a supplier of booleans.
 * Unlike {@link SupplierBoA3} this may throw Exceptions.
 *
 * <p>
 * There is no requirement that a new or distinct result be returned each
 * time the supplier is invoked.
 *
 * <p>
 * This is a functional interface whose functional method is
 * {@link #getBoA3()}.
 * 
 * @see SupplierBoA3
 * @see SupplierExBoA3
 */
@FunctionalInterface
public interface SupplierExBoA3 extends SupplierEx<boolean[][][]>
{
    /**
     * Gets a result.
     *
     * @return A result.
     * 
     * @throws Exception May throw an exception during execution.
     */
    boolean[][][] getBoA3() throws Exception;
    
    /**
     * @deprecated Use {@link #getBoA3()} instead.
     */
    @Override
    @Deprecated(since = "1.0", forRemoval = false)
    default boolean[][][] get() throws Exception
    {
    	return getBoA3();
    }
}
