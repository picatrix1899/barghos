package org.barghos.util.supplier.doubles;

import org.barghos.util.supplier.SupplierEx;

/**
 * Represents a supplier of double.
 * Unlike {@link SupplierDA3} this may throw Exceptions.
 *
 * <p>
 * There is no requirement that a new or distinct result be returned each
 * time the supplier is invoked.
 *
 * <p>
 * This is a functional interface whose functional method is
 * {@link #getDouble3DArray()}.
 * 
 * @see SupplierDA3
 * @see SupplierExDA3
 */
@FunctionalInterface
public interface SupplierExDA3 extends SupplierEx<double[][][]>
{
    /**
     * Gets a result.
     *
     * @return A result.
     * 
     * @throws Exception May throw an exception during execution.
     */
	double[][][] getDouble3DArray() throws Exception;
    
    /**
     * @deprecated Use {@link #getDouble3DArray()} instead.
     */
    @Override
    @Deprecated(since = "1.0", forRemoval = false)
    default double[][][] getGeneric() throws Exception
    {
    	return getDouble3DArray();
    }
}
