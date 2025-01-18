package org.barghos.util.supplier.bigds;

import java.math.BigDecimal;

import org.barghos.util.supplier.Supplier;
import org.barghos.util.supplier.SupplierEx;
import org.barghos.validation.ExceptionHandler;
import org.barghos.validation.Validate;

/**
 * Represents a supplier of 1-dimensional {@link BigDecimal} arrays.
 * Unlike {@link SupplierBigdA} this may throw Exceptions.
 *
 * <p>
 * There is no requirement that a new or distinct result be returned each
 * time the supplier is invoked.
 *
 * <p>
 * This is a functional interface whose functional method is
 * {@link #getBigdA()}.
 * 
 * @see SupplierBigdA
 * @see SupplierExBigdA
 */
@FunctionalInterface
public interface SupplierExBigdA extends SupplierEx<BigDecimal[]>
{
	
	/**
	 * Gets a result.
	 *
	 * @return A result.
	 * 
	 * @throws Exception May throw an exception during execution.
	 */
	BigDecimal[] getBigdA() throws Exception;
	
	@Override
	default BigDecimal[] get() throws Exception
	{
		return getBigdA();
	}
	
	default SupplierBigdA handleEx(ExceptionHandler handler, BigDecimal[] exValue)
	{
		Validate.Arg.checkNotNull("handler", handler);
		
		return () -> {
			try
			{
				return getBigdA();
			}
			catch(Exception e)
			{
				handler.handle(e);
				
				return exValue;
			}
		};
	}
	
	default SupplierExBigdA handleEx(ExceptionHandler handler, SupplierExBigdA supplier)
	{
		Validate.Arg.checkNotNull("handler", handler);
		Validate.Arg.checkNotNull("supplier", supplier);
		
		return () -> {
			try
			{
				return getBigdA();
			}
			catch(Exception e)
			{
				handler.handle(e);
				
				return supplier.getBigdA();
			}
		};
	}
	
	default SupplierExBigdA handleEx(ExceptionHandler handler, SupplierEx<? extends BigDecimal[]> supplier)
	{
		Validate.Arg.checkNotNull("handler", handler);
		Validate.Arg.checkNotNull("supplier", supplier);
		
		return () -> {
			try
			{
				return getBigdA();
			}
			catch(Exception e)
			{
				handler.handle(e);
				
				return supplier.get();
			}
		};
	}
	
	default SupplierBigdA handleEx(ExceptionHandler handler, SupplierBigdA supplier)
	{
		Validate.Arg.checkNotNull("handler", handler);
		Validate.Arg.checkNotNull("supplier", supplier);
		
		return () -> {
			try
			{
				return getBigdA();
			}
			catch(Exception e)
			{
				handler.handle(e);
				
				return supplier.getBigdA();
			}
		};
	}
	
	default SupplierBigdA handleEx(ExceptionHandler handler, Supplier<? extends BigDecimal[]> supplier)
	{
		Validate.Arg.checkNotNull("handler", handler);
		Validate.Arg.checkNotNull("supplier", supplier);
		
		return () -> {
			try
			{
				return getBigdA();
			}
			catch(Exception e)
			{
				handler.handle(e);
				
				return supplier.get();
			}
		};
	}
	
	default SupplierBigdA handleEx(ExceptionHandler handler, java.util.function.Supplier<? extends BigDecimal[]> supplier)
	{
		Validate.Arg.checkNotNull("handler", handler);
		Validate.Arg.checkNotNull("supplier", supplier);
		
		return () -> {
			try
			{
				return getBigdA();
			}
			catch(Exception e)
			{
				handler.handle(e);
				
				return supplier.get();
			}
		};
	}
	
	default SupplierExBigdA onEx(BigDecimal[] exValue)
	{
		return () -> {
			try
			{
				return getBigdA();
			}
			catch(Exception e)
			{
				return exValue;
			}
		};
	}
	
	default SupplierExBigdA onEx(SupplierExBigdA supplier)
	{
		Validate.Arg.checkNotNull("supplier", supplier);
		
		return () -> {
			try
			{
				return getBigdA();
			}
			catch(Exception e)
			{
				return supplier.getBigdA();
			}
		};
	}
	
	default SupplierExBigdA onEx(SupplierEx<? extends BigDecimal[]> supplier)
	{
		Validate.Arg.checkNotNull("supplier", supplier);
		
		return () -> {
			try
			{
				return getBigdA();
			}
			catch(Exception e)
			{
				return supplier.get();
			}
		};
	}
	
	default SupplierBigdA onEx(SupplierBigdA supplier)
	{
		Validate.Arg.checkNotNull("supplier", supplier);
		
		return () -> {
			try
			{
				return getBigdA();
			}
			catch(Exception e)
			{
				return supplier.getBigdA();
			}
		};
	}
	
	default SupplierBigdA onEx(Supplier<? extends BigDecimal[]> supplier)
	{
		Validate.Arg.checkNotNull("supplier", supplier);
		
		return () -> {
			try
			{
				return getBigdA();
			}
			catch(Exception e)
			{
				return supplier.get();
			}
		};
	}
	
	default SupplierBigdA onEx(java.util.function.Supplier<? extends BigDecimal[]> supplier)
	{
		Validate.Arg.checkNotNull("supplier", supplier);
		
		return () -> {
			try
			{
				return getBigdA();
			}
			catch(Exception e)
			{
				return supplier.get();
			}
		};
	}
	
	public static SupplierExBigdA of(BigDecimal... value)
	{
		return () -> value;
	}
	
}
