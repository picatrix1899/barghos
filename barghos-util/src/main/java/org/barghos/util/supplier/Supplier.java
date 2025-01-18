package org.barghos.util.supplier;

/**
 * Represents a supplier of results.
 *
 * <p>
 * There is no requirement that a new or distinct result be returned each
 * time the supplier is invoked.
 *
 * <p>
 * This is a functional interface whose functional method is
 * {@link #get()}.
 *
 * @param <T> the type of the result supplied by this supplier.
 * 
 * @see Supplier
 * @see SupplierEx
 */
@FunctionalInterface
public interface Supplier<T> extends java.util.function.Supplier<T>
{
	
	/**
	 * Gets a result.
	 *
	 * @return A result.
	 */
	@Override
	T get();
	
	public static <T> Supplier<T> of(T value)
	{
		return () -> value;
	}
	
}