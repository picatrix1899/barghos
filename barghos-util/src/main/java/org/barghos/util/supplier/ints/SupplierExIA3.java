package org.barghos.util.supplier.ints;

import org.barghos.util.supplier.SupplierEx;

/**
 * Represents a supplier of int.
 * Unlike {@link SupplierIA3} this may throw Exceptions.
 *
 * <p>
 * There is no requirement that a new or distinct result be returned each
 * time the supplier is invoked.
 *
 * <p>
 * This is a functional interface whose functional method is
 * {@link #getIA3()}.
 * 
 * @see SupplierIA3
 * @see SupplierExIA3
 */
@FunctionalInterface
public interface SupplierExIA3 extends SupplierEx<int[][][]>
{
    /**
     * Gets a result.
     *
     * @return A result.
     * 
     * @throws Exception May throw an exception during execution.
     */
	int[][][] getIA3() throws Exception;
    
    /**
     * @deprecated Use {@link #getIA3()} instead.
     */
    @Override
    @Deprecated(since = "1.0", forRemoval = false)
    default int[][][] get() throws Exception
    {
    	return getIA3();
    }
}
