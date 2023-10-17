package org.barghos.util.supplier.chars;

import org.barghos.util.supplier.SupplierEx;

/**
 * Represents a supplier of characters.
 * Unlike {@link Supplierc} this may throw Exceptions.
 *
 * <p>
 * There is no requirement that a new or distinct result be returned each
 * time the supplier is invoked.
 *
 * <p>
 * This is a functional interface whose functional method is {@link #getChar()}.
 * 
 * @see Supplierc
 * @see SupplierExc
 */
@FunctionalInterface
public interface SupplierExc extends SupplierEx<Character>
{
    /**
     * Gets a result.
     *
     * @return A result.
     * 
     * @throws Exception May throw an exception during execution.
     */
    char getChar() throws Exception;
    
    /**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link getChar} instead.
     */
    @Override
    @Deprecated
    default Character get() throws Exception
    {
    	return getChar();
    }
}
