package org.barghos.util.supplier.bigds;

import java.math.BigDecimal;

import org.barghos.util.supplier.Supplier;
import org.barghos.util.supplier.SupplierEx;
import org.barghos.validation.ExceptionHandler;
import org.barghos.validation.Validate;

/**
 * Represents a supplier of 2-dimensional {@link BigDecimal} arrays.
 * Unlike {@link SupplierBigdA2} this may throw Exceptions.
 *
 * <p>
 * There is no requirement that a new or distinct result be returned each
 * time the supplier is invoked.
 *
 * <p>
 * This is a functional interface whose functional method is
 * {@link #getBigdA2()}.
 * 
 * @see SupplierBigdA2
 * @see SupplierExBigdA2
 */
@FunctionalInterface
public interface SupplierExBigdA2 extends SupplierEx<BigDecimal[][]>
{
	
	/**
	 * Gets a result.
	 *
	 * @return A result.
	 * 
	 * @throws Exception May throw an exception during execution.
	 */
	BigDecimal[][] getBigdA2() throws Exception;
	
	@Override
	default BigDecimal[][] get() throws Exception
	{
		return getBigdA2();
	}
	
	default SupplierBigdA2 handleEx(ExceptionHandler handler, BigDecimal[][] exValue)
	{
		Validate.Arg.checkNotNull("handler", handler);
		
		return () -> {
			try
			{
				return getBigdA2();
			}
			catch(Exception e)
			{
				handler.handle(e);
				
				return exValue;
			}
		};
	}
	
	default SupplierExBigdA2 handleEx(ExceptionHandler handler, SupplierExBigdA2 supplier)
	{
		Validate.Arg.checkNotNull("handler", handler);
		Validate.Arg.checkNotNull("supplier", supplier);
		
		return () -> {
			try
			{
				return getBigdA2();
			}
			catch(Exception e)
			{
				handler.handle(e);
				
				return supplier.getBigdA2();
			}
		};
	}
	
	default SupplierExBigdA2 handleEx(ExceptionHandler handler, SupplierEx<? extends BigDecimal[][]> supplier)
	{
		Validate.Arg.checkNotNull("handler", handler);
		Validate.Arg.checkNotNull("supplier", supplier);
		
		return () -> {
			try
			{
				return getBigdA2();
			}
			catch(Exception e)
			{
				handler.handle(e);
				
				return supplier.get();
			}
		};
	}
	
	default SupplierBigdA2 handleEx(ExceptionHandler handler, SupplierBigdA2 supplier)
	{
		Validate.Arg.checkNotNull("handler", handler);
		Validate.Arg.checkNotNull("supplier", supplier);
		
		return () -> {
			try
			{
				return getBigdA2();
			}
			catch(Exception e)
			{
				handler.handle(e);
				
				return supplier.getBigdA2();
			}
		};
	}
	
	default SupplierBigdA2 handleEx(ExceptionHandler handler, Supplier<? extends BigDecimal[][]> supplier)
	{
		Validate.Arg.checkNotNull("handler", handler);
		Validate.Arg.checkNotNull("supplier", supplier);
		
		return () -> {
			try
			{
				return getBigdA2();
			}
			catch(Exception e)
			{
				handler.handle(e);
				
				return supplier.get();
			}
		};
	}
	
	default SupplierBigdA2 handleEx(ExceptionHandler handler, java.util.function.Supplier<? extends BigDecimal[][]> supplier)
	{
		Validate.Arg.checkNotNull("handler", handler);
		Validate.Arg.checkNotNull("supplier", supplier);
		
		return () -> {
			try
			{
				return getBigdA2();
			}
			catch(Exception e)
			{
				handler.handle(e);
				
				return supplier.get();
			}
		};
	}
	
	default SupplierExBigdA2 onEx(BigDecimal[][] exValue)
	{
		return () -> {
			try
			{
				return getBigdA2();
			}
			catch(Exception e)
			{
				return exValue;
			}
		};
	}
	
	default SupplierExBigdA2 onEx(SupplierExBigdA2 supplier)
	{
		Validate.Arg.checkNotNull("supplier", supplier);
		
		return () -> {
			try
			{
				return getBigdA2();
			}
			catch(Exception e)
			{
				return supplier.getBigdA2();
			}
		};
	}
	
	default SupplierExBigdA2 onEx(SupplierEx<? extends BigDecimal[][]> supplier)
	{
		Validate.Arg.checkNotNull("supplier", supplier);
		
		return () -> {
			try
			{
				return getBigdA2();
			}
			catch(Exception e)
			{
				return supplier.get();
			}
		};
	}
	
	default SupplierBigdA2 onEx(SupplierBigdA2 supplier)
	{
		Validate.Arg.checkNotNull("supplier", supplier);
		
		return () -> {
			try
			{
				return getBigdA2();
			}
			catch(Exception e)
			{
				return supplier.getBigdA2();
			}
		};
	}
	
	default SupplierBigdA2 onEx(Supplier<? extends BigDecimal[][]> supplier)
	{
		Validate.Arg.checkNotNull("supplier", supplier);
		
		return () -> {
			try
			{
				return getBigdA2();
			}
			catch(Exception e)
			{
				return supplier.get();
			}
		};
	}
	
	default SupplierBigdA2 onEx(java.util.function.Supplier<? extends BigDecimal[][]> supplier)
	{
		Validate.Arg.checkNotNull("supplier", supplier);
		
		return () -> {
			try
			{
				return getBigdA2();
			}
			catch(Exception e)
			{
				return supplier.get();
			}
		};
	}
	
	public static SupplierExBigdA2 of(BigDecimal[][] value)
	{
		return () -> value;
	}
	
}
