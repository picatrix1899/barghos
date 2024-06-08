package org.barghos.util.supplier.chars;

import org.barghos.util.supplier.SupplierEx;

/**
 * Represents a supplier of char.
 * Unlike {@link SupplierC} this may throw Exceptions.
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
public interface SupplierExC extends SupplierEx<Character>
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
     * @deprecated Use {@link #getChar()} instead.
     */
    @Override
    @Deprecated(since = "1.0", forRemoval = false)
    default Character getGeneric() throws Exception
    {
    	return getChar();
    }
}
