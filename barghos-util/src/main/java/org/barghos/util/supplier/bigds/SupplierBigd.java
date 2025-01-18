package org.barghos.util.supplier.bigds;

import java.math.BigDecimal;

import org.barghos.util.supplier.Supplier;

/**
 * Represents a supplier of {@link BigDecimal}.
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
public interface SupplierBigd extends Supplier<BigDecimal>
{
	
	/**
	 * Gets a result.
	 *
	 * @return A result.
	 */
	BigDecimal getBigd();
	
	@Override
	default BigDecimal get()
	{
		return getBigd();
	}
	
	public static SupplierBigd of(BigDecimal value)
	{
		return () -> value;
	}
	
}
