package org.barghos.util.supplier.chars;

import org.barghos.util.supplier.Supplier;

/**
 * Represents a supplier of characters.
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
public interface Supplierc extends Supplier<Character>
{
    /**
     * Gets a result.
     *
     * @return A result.
     */
    char getChar();
    
    /**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link getChar} instead.
     */
    @Override
    @Deprecated
    default Character get()
    {
    	return getChar();
    }
}
