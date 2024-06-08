package org.barghos.util.supplier.floats;

import org.barghos.util.supplier.SupplierEx;

/**
 * Represents a supplier of float.
 * Unlike {@link SupplierF} this may throw Exceptions.
 *
 * <p>
 * There is no requirement that a new or distinct result be returned each
 * time the supplier is invoked.
 *
 * <p>
 * This is a functional interface whose functional method is {@link #getFloat()}.
 * 
 * @see SupplierF
 * @see SupplierExF
 */
@FunctionalInterface
public interface SupplierExF extends SupplierEx<Float>
{
    /**
     * Gets a result.
     *
     * @return A result.
     * 
     * @throws Exception May throw an exception during execution.
     */
	float getFloat() throws Exception;
    
    /**
     * @deprecated Use {@link #getFloat()} instead.
     */
    @Override
    @Deprecated(since = "1.0", forRemoval = false)
    default Float getGeneric() throws Exception
    {
    	return getFloat();
    }
}
