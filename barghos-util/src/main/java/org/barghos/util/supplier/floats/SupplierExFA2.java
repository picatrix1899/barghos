package org.barghos.util.supplier.floats;

import org.barghos.util.supplier.SupplierEx;

/**
 * Represents a supplier of float.
 * Unlike {@link SupplierFA2} this may throw Exceptions.
 *
 * <p>
 * There is no requirement that a new or distinct result be returned each
 * time the supplier is invoked.
 *
 * <p>
 * This is a functional interface whose functional method is
 * {@link #getFA2()}.
 * 
 * @see SupplierFA2
 * @see SupplierExFA2
 */
@FunctionalInterface
public interface SupplierExFA2 extends SupplierEx<float[][]>
{
    /**
     * Gets a result.
     *
     * @return A result.
     * 
     * @throws Exception May throw an exception during execution.
     */
	float[][] getFA2() throws Exception;
    
    /**
     * @deprecated Use {@link #getFA2()} instead.
     */
    @Override
    @Deprecated(since = "1.0", forRemoval = false)
    default float[][] get() throws Exception
    {
    	return getFA2();
    }
}
