package org.barghos.util.supplier.strings;

import org.barghos.util.supplier.SupplierEx;

/**
 * Represents a supplier of string.
 * Unlike {@link SupplierStrA3} this may throw Exceptions.
 *
 * <p>
 * There is no requirement that a new or distinct result be returned each
 * time the supplier is invoked.
 *
 * <p>
 * This is a functional interface whose functional method is
 * {@link #getString3DArray()}.
 * 
 * @see SupplierStrA3
 * @see SupplierExStrA3
 */
@FunctionalInterface
public interface SupplierExStrA3 extends SupplierEx<String[][][]>
{
    /**
     * Gets a result.
     *
     * @return A result.
     * 
     * @throws Exception May throw an exception during execution.
     */
	String[][][] getString3DArray() throws Exception;
    
    /**
     * @deprecated Use {@link #getString3DArray()} instead.
     */
    @Override
    @Deprecated(since = "1.0", forRemoval = false)
    default String[][][] getGeneric() throws Exception
    {
    	return getString3DArray();
    }
}
