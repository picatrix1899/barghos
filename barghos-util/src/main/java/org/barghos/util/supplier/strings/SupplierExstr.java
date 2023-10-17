package org.barghos.util.supplier.strings;

import org.barghos.util.supplier.SupplierEx;

/**
 * Represents a supplier of strings.
 * Unlike {@link Supplierstr} this may throw Exceptions.
 *
 * <p>
 * There is no requirement that a new or distinct result be returned each
 * time the supplier is invoked.
 *
 * <p>
 * This is a functional interface whose functional method is {@link #getString()}.
 * 
 * @see Supplierstr
 * @see SupplierExstr
 */
@FunctionalInterface
public interface SupplierExstr extends SupplierEx<String>
{
    /**
     * Gets a result.
     *
     * @return A result.
     * 
     * @throws Exception May throw an exception during execution.
     */
	String getString() throws Exception;
	
	/**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link getString} instead.
     */
    @Override
    @Deprecated
    default String get() throws Exception
    {
    	return getString();
    }
}
