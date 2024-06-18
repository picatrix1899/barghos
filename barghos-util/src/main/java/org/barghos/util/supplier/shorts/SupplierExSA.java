package org.barghos.util.supplier.shorts;

import org.barghos.util.supplier.SupplierEx;

/**
 * Represents a supplier of short.
 * Unlike {@link SupplierSA} this may throw Exceptions.
 *
 * <p>
 * There is no requirement that a new or distinct result be returned each
 * time the supplier is invoked.
 *
 * <p>
 * This is a functional interface whose functional method is
 * {@link #getSA()}.
 * 
 * @see SupplierSA
 * @see SupplierExSA
 */
@FunctionalInterface
public interface SupplierExSA extends SupplierEx<short[]>
{
    /**
     * Gets a result.
     *
     * @return A result.
     * 
     * @throws Exception May throw an exception during execution.
     */
	short[] getSA() throws Exception;
    
    /**
     * @deprecated Use {@link #getSA()} instead.
     */
    @Override
    @Deprecated(since = "1.0", forRemoval = false)
    default short[] get() throws Exception
    {
    	return getSA();
    }
}
