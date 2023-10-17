package org.barghos.util.supplier.strings;

import org.barghos.util.supplier.Supplier;

/**
 * Represents a supplier of strings.
 *
 * <p>
 * There is no requirement that a new or distinct result be returned each
 * time the supplier is invoked.
 *
 * <p>
 * This is a functional interface whose functional method is {@link #getString()}.
 * 
 * @see StringSupplierstr
 * @see StringSupplierExstr
 */
@FunctionalInterface
public interface Supplierstr extends Supplier<String>
{
    /**
     * Gets a result.
     *
     * @return A result.
     */
    String getString();
    
    /**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link getString} instead.
     */
    @Override
    @Deprecated
    default String get()
    {
    	return getString();
    }
}
