package org.barghos.util.supplier.bigds;

import java.math.BigDecimal;

import org.barghos.util.supplier.Supplier;
import org.barghos.util.supplier.SupplierEx;
import org.barghos.validation.ExceptionHandler;
import org.barghos.validation.Validate;

/**
 * Represents a supplier of 3-dimensional {@link BigDecimal} arrays.
 * Unlike {@link SupplierBigdA3} this may throw Exceptions.
 *
 * <p>
 * There is no requirement that a new or distinct result be returned each
 * time the supplier is invoked.
 *
 * <p>
 * This is a functional interface whose functional method is
 * {@link #getBigdA3()}.
 * 
 * @see SupplierBigdA3
 * @see SupplierExBigdA3
 */
@FunctionalInterface
public interface SupplierExBigdA3 extends SupplierEx<BigDecimal[][][]>
{
	/**
	 * Gets a result.
	 *
	 * @return A result.
	 * 
	 * @throws Exception May throw an exception during execution.
	 */
	BigDecimal[][][] getBigdA3() throws Exception;
	
	@Override
	default BigDecimal[][][] get() throws Exception
	{
		return getBigdA3();
	}
	
	default SupplierBigdA3 handleEx(ExceptionHandler handler, BigDecimal[][][] exValue)
	{
		Validate.Arg.checkNotNull("handler", handler);
		
		return () -> {
			try
			{
				return getBigdA3();
			}
			catch(Exception e)
			{
				handler.handle(e);
				
				return exValue;
			}
		};
	}
	
	default SupplierExBigdA3 handleEx(ExceptionHandler handler, SupplierExBigdA3 supplier)
	{
		Validate.Arg.checkNotNull("handler", handler);
		Validate.Arg.checkNotNull("supplier", supplier);
		
		return () -> {
			try
			{
				return getBigdA3();
			}
			catch(Exception e)
			{
				handler.handle(e);
				
				return supplier.getBigdA3();
			}
		};
	}
	
	default SupplierExBigdA3 handleEx(ExceptionHandler handler, SupplierEx<? extends BigDecimal[][][]> supplier)
	{
		Validate.Arg.checkNotNull("handler", handler);
		Validate.Arg.checkNotNull("supplier", supplier);
		
		return () -> {
			try
			{
				return getBigdA3();
			}
			catch(Exception e)
			{
				handler.handle(e);
				
				return supplier.get();
			}
		};
	}
	
	default SupplierBigdA3 handleEx(ExceptionHandler handler, SupplierBigdA3 supplier)
	{
		Validate.Arg.checkNotNull("handler", handler);
		Validate.Arg.checkNotNull("supplier", supplier);
		
		return () -> {
			try
			{
				return getBigdA3();
			}
			catch(Exception e)
			{
				handler.handle(e);
				
				return supplier.getBigdA3();
			}
		};
	}
	
	default SupplierBigdA3 handleEx(ExceptionHandler handler, Supplier<? extends BigDecimal[][][]> supplier)
	{
		Validate.Arg.checkNotNull("handler", handler);
		Validate.Arg.checkNotNull("supplier", supplier);
		
		return () -> {
			try
			{
				return getBigdA3();
			}
			catch(Exception e)
			{
				handler.handle(e);
				
				return supplier.get();
			}
		};
	}
	
	default SupplierBigdA3 handleEx(ExceptionHandler handler, java.util.function.Supplier<? extends BigDecimal[][][]> supplier)
	{
		Validate.Arg.checkNotNull("handler", handler);
		Validate.Arg.checkNotNull("supplier", supplier);
		
		return () -> {
			try
			{
				return getBigdA3();
			}
			catch(Exception e)
			{
				handler.handle(e);
				
				return supplier.get();
			}
		};
	}
	
	default SupplierExBigdA3 onEx(BigDecimal[][][] exValue)
	{
		return () -> {
			try
			{
				return getBigdA3();
			}
			catch(Exception e)
			{
				return exValue;
			}
		};
	}
	
	default SupplierExBigdA3 onEx(SupplierExBigdA3 supplier)
	{
		Validate.Arg.checkNotNull("supplier", supplier);
		
		return () -> {
			try
			{
				return getBigdA3();
			}
			catch(Exception e)
			{
				return supplier.getBigdA3();
			}
		};
	}
	
	default SupplierExBigdA3 onEx(SupplierEx<? extends BigDecimal[][][]> supplier)
	{
		Validate.Arg.checkNotNull("supplier", supplier);
		
		return () -> {
			try
			{
				return getBigdA3();
			}
			catch(Exception e)
			{
				return supplier.get();
			}
		};
	}
	
	default SupplierBigdA3 onEx(SupplierBigdA3 supplier)
	{
		Validate.Arg.checkNotNull("supplier", supplier);
		
		return () -> {
			try
			{
				return getBigdA3();
			}
			catch(Exception e)
			{
				return supplier.getBigdA3();
			}
		};
	}
	
	default SupplierBigdA3 onEx(Supplier<? extends BigDecimal[][][]> supplier)
	{
		Validate.Arg.checkNotNull("supplier", supplier);
		
		return () -> {
			try
			{
				return getBigdA3();
			}
			catch(Exception e)
			{
				return supplier.get();
			}
		};
	}
	
	default SupplierBigdA3 onEx(java.util.function.Supplier<? extends BigDecimal[][][]> supplier)
	{
		Validate.Arg.checkNotNull("supplier", supplier);
		
		return () -> {
			try
			{
				return getBigdA3();
			}
			catch(Exception e)
			{
				return supplier.get();
			}
		};
	}
	
	public static SupplierExBigdA3 of(BigDecimal[][][] value)
	{
		return () -> value;
	}
	
}
