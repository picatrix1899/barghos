package org.barghos.util.supplier;

/**
 * Represents a supplier of results.
 * Unlike {@link Supplier} this may throw Exceptions.
 *
 * <p>
 * There is no requirement that a new or distinct result be returned each
 * time the supplier is invoked.
 *
 * <p>
 * This is a functional interface whose functional method is
 * {@link #getGeneric()}.
 *
 * @param <T> the type of the result supplied by this supplier.
 * 
 * @see Supplier
 * @see SupplierEx
 */
@FunctionalInterface
public interface SupplierEx<T>
{
	/**
     * Gets a result.
     *
     * @return A result.
     * 
     * @throws Exception May throw an exception during execution.
     */
	T getGeneric() throws Exception;
}