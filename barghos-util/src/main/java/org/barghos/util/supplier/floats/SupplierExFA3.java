package org.barghos.util.supplier.floats;

import org.barghos.util.supplier.SupplierEx;

/**
 * Represents a supplier of float.
 * Unlike {@link SupplierFA3} this may throw Exceptions.
 *
 * <p>
 * There is no requirement that a new or distinct result be returned each
 * time the supplier is invoked.
 *
 * <p>
 * This is a functional interface whose functional method is
 * {@link #getFloat3DArray()}.
 * 
 * @see SupplierFA3
 * @see SupplierExFA3
 */
@FunctionalInterface
public interface SupplierExFA3 extends SupplierEx<float[][][]>
{
    /**
     * Gets a result.
     *
     * @return A result.
     * 
     * @throws Exception May throw an exception during execution.
     */
	float[][][] getFloat3DArray() throws Exception;
    
    /**
     * @deprecated Use {@link #getFloat3DArray()} instead.
     */
    @Override
    @Deprecated(since = "1.0", forRemoval = false)
    default float[][][] getGeneric() throws Exception
    {
    	return getFloat3DArray();
    }
}
