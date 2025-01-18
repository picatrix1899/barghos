package org.barghos.util.supplier.bigds;

import java.math.BigDecimal;

import org.barghos.util.supplier.Supplier;
import org.barghos.util.supplier.SupplierEx;
import org.barghos.validation.ExceptionHandler;
import org.barghos.validation.Validate;

/**
 * Represents a supplier of {@link BigDecimal}.
 * Unlike {@link SupplierBigd} this may throw Exceptions.
 *
 * <p>
 * There is no requirement that a new or distinct result be returned each
 * time the supplier is invoked.
 *
 * <p>
 * This is a functional interface whose functional method is
 * {@link #getBigd()}.
 * 
 * @see SupplierBigd
 * @see SupplierExBigd
 */
@FunctionalInterface
public interface SupplierExBigd extends SupplierEx<BigDecimal>
{
	
	/**
	 * Gets a result.
	 *
	 * @return A result.
	 * 
	 * @throws Exception May throw an exception during execution.
	 */
	BigDecimal getBigd() throws Exception;
	
	@Override
	default BigDecimal get() throws Exception
	{
		return getBigd();
	}
	
	default SupplierBigd handleEx(ExceptionHandler handler, BigDecimal exValue)
	{
		Validate.Arg.checkNotNull("handler", handler);
		
		return () -> {
			try
			{
				return getBigd();
			}
			catch(Exception e)
			{
				handler.handle(e);
				
				return exValue;
			}
		};
	}
	
	default SupplierExBigd handleEx(ExceptionHandler handler, SupplierExBigd supplier)
	{
		Validate.Arg.checkNotNull("handler", handler);
		Validate.Arg.checkNotNull("supplier", supplier);
		
		return () -> {
			try
			{
				return getBigd();
			}
			catch(Exception e)
			{
				handler.handle(e);
				
				return supplier.getBigd();
			}
		};
	}
	
	default SupplierExBigd handleEx(ExceptionHandler handler, SupplierEx<? extends BigDecimal> supplier)
	{
		Validate.Arg.checkNotNull("handler", handler);
		Validate.Arg.checkNotNull("supplier", supplier);
		
		return () -> {
			try
			{
				return getBigd();
			}
			catch(Exception e)
			{
				handler.handle(e);
				
				return supplier.get();
			}
		};
	}
	
	default SupplierBigd handleEx(ExceptionHandler handler, SupplierBigd supplier)
	{
		Validate.Arg.checkNotNull("handler", handler);
		Validate.Arg.checkNotNull("supplier", supplier);
		
		return () -> {
			try
			{
				return getBigd();
			}
			catch(Exception e)
			{
				handler.handle(e);
				
				return supplier.getBigd();
			}
		};
	}
	
	default SupplierBigd handleEx(ExceptionHandler handler, Supplier<? extends BigDecimal> supplier)
	{
		Validate.Arg.checkNotNull("handler", handler);
		Validate.Arg.checkNotNull("supplier", supplier);
		
		return () -> {
			try
			{
				return getBigd();
			}
			catch(Exception e)
			{
				handler.handle(e);
				
				return supplier.get();
			}
		};
	}
	
	default SupplierBigd handleEx(ExceptionHandler handler, java.util.function.Supplier<? extends BigDecimal> supplier)
	{
		Validate.Arg.checkNotNull("handler", handler);
		Validate.Arg.checkNotNull("supplier", supplier);
		
		return () -> {
			try
			{
				return getBigd();
			}
			catch(Exception e)
			{
				handler.handle(e);
				
				return supplier.get();
			}
		};
	}
	
	default SupplierExBigd onEx(BigDecimal exValue)
	{
		return () -> {
			try
			{
				return getBigd();
			}
			catch(Exception e)
			{
				return exValue;
			}
		};
	}
	
	default SupplierExBigd onEx(SupplierExBigd supplier)
	{
		Validate.Arg.checkNotNull("supplier", supplier);
		
		return () -> {
			try
			{
				return getBigd();
			}
			catch(Exception e)
			{
				return supplier.getBigd();
			}
		};
	}
	
	default SupplierExBigd onEx(SupplierEx<? extends BigDecimal> supplier)
	{
		Validate.Arg.checkNotNull("supplier", supplier);
		
		return () -> {
			try
			{
				return getBigd();
			}
			catch(Exception e)
			{
				return supplier.get();
			}
		};
	}
	
	default SupplierBigd onEx(SupplierBigd supplier)
	{
		Validate.Arg.checkNotNull("supplier", supplier);
		
		return () -> {
			try
			{
				return getBigd();
			}
			catch(Exception e)
			{
				return supplier.getBigd();
			}
		};
	}
	
	default SupplierBigd onEx(Supplier<? extends BigDecimal> supplier)
	{
		Validate.Arg.checkNotNull("supplier", supplier);
		
		return () -> {
			try
			{
				return getBigd();
			}
			catch(Exception e)
			{
				return supplier.get();
			}
		};
	}
	
	default SupplierBigd onEx(java.util.function.Supplier<? extends BigDecimal> supplier)
	{
		Validate.Arg.checkNotNull("supplier", supplier);
		
		return () -> {
			try
			{
				return getBigd();
			}
			catch(Exception e)
			{
				return supplier.get();
			}
		};
	}
	
	public static SupplierExBigd of(BigDecimal value)
	{
		return () -> value;
	}
	
}
