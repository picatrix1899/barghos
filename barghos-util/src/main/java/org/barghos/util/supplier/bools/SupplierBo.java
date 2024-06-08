package org.barghos.util.supplier.bools;

import org.barghos.util.supplier.Supplier;

/**
 * Represents a supplier of booleans.
 *
 * <p>
 * There is no requirement that a new or distinct result be returned each
 * time the supplier is invoked.
 *
 * <p>
 * This is a functional interface whose functional method is {@link #getBool()}.
 * 
 * @see SupplierBo
 * @see SupplierExBo
 */
@FunctionalInterface
public interface SupplierBo extends Supplier<Boolean>
{
    /**
     * Gets a result.
     *
     * @return A result.
     */
    boolean getBool();
    
    /**
     * @deprecated Use {@link #getBool()} instead.
     */
    @Override
    @Deprecated(since = "1.0", forRemoval = false)
    default Boolean getGeneric()
    {
    	return getBool();
    }
}
