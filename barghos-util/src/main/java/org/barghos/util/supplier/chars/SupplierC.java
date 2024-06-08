package org.barghos.util.supplier.chars;

import org.barghos.util.supplier.Supplier;

/**
 * Represents a supplier of char.
 *
 * <p>
 * There is no requirement that a new or distinct result be returned each
 * time the supplier is invoked.
 *
 * <p>
 * This is a functional interface whose functional method is {@link #getChar()}.
 * 
 * @see SupplierC
 * @see SupplierExC
 */
@FunctionalInterface
public interface SupplierC extends Supplier<Character>
{
    /**
     * Gets a result.
     *
     * @return A result.
     */
    char getChar();
    
    /**
     * @deprecated Use {@link #getChar()} instead.
     */
    @Override
    @Deprecated(since = "1.0", forRemoval = false)
    default Character getGeneric()
    {
    	return getChar();
    }
}
