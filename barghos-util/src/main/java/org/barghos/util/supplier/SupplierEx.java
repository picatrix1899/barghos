package org.barghos.util.supplier;

import org.barghos.validation.ExceptionHandler;
import org.barghos.validation.Validate;

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
 * {@link #get()}.
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
	T get() throws Exception;
	
	default Supplier<T> handleEx(ExceptionHandler handler, T exValue)
	{
		Validate.Arg.checkNotNull("handler", handler);
		
		return () -> {
			try
			{
				return get();
			}
			catch(Exception e)
			{
				handler.handle(e);
				
				return exValue;
			}
		};
	}
	
	default SupplierEx<T> handleEx(ExceptionHandler handler, SupplierEx<? extends T> supplier)
	{
		Validate.Arg.checkNotNull("handler", handler);
		Validate.Arg.checkNotNull("supplier", supplier);
		
		return () -> {
			try
			{
				return get();
			}
			catch(Exception e)
			{
				handler.handle(e);
				
				return supplier.get();
			}
		};
	}
	
	default Supplier<T> handleEx(ExceptionHandler handler, Supplier<? extends T> supplier)
	{
		Validate.Arg.checkNotNull("handler", handler);
		Validate.Arg.checkNotNull("supplier", supplier);
		
		return () -> {
			try
			{
				return get();
			}
			catch(Exception e)
			{
				handler.handle(e);
				
				return supplier.get();
			}
		};
	}
	
	default SupplierEx<T> onEx(T exValue)
	{
		return () -> {
			try
			{
				return get();
			}
			catch(Exception e)
			{
				return exValue;
			}
		};
	}
	
	default SupplierEx<T> onEx(SupplierEx<? extends T> supplier)
	{
		Validate.Arg.checkNotNull("supplier", supplier);
		
		return () -> {
			try
			{
				return get();
			}
			catch(Exception e)
			{
				return supplier.get();
			}
		};
	}
	
	default Supplier<T> onEx(Supplier<? extends T> supplier)
	{
		Validate.Arg.checkNotNull("supplier", supplier);
		
		return () -> {
			try
			{
				return get();
			}
			catch(Exception e)
			{
				return supplier.get();
			}
		};
	}
	
	public static <T> SupplierEx<T> of(T value)
	{
		return () -> value;
	}
	
}