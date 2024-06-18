package org.barghos.util.lazy.bigds;

import java.math.BigDecimal;

import org.barghos.util.supplier.bigds.SupplierBigd;

import org.barghos.validation.ParameterValidation;

/**
 * An implementation of the {@link UpdatableLazyBigd} interface where the
 * provided double value is determined via a given {@link SupplierBigd}.
 */
public class SuppliedLazyBigd implements UpdatableLazyBigd
{
	protected SupplierBigd supplier;
	
	protected BigDecimal value;
	protected boolean hasValue;
	
	/**
	 * Creates a new instance of {@link SuppliedLazyBigd} with the given
	 * {@link SupplierBigd} to determine the value to provide.
	 * 
	 * @param supplier
	 * The {@link SupplierBigd} used to determine the value to provide.
	 */
	public SuppliedLazyBigd(SupplierBigd supplier)
	{	
		ParameterValidation.pvNotNull("supplier", supplier);
		
		this.supplier = supplier;
	}	
	
	/** {@inheritDoc} */
	@Override
	public BigDecimal valueBigd()
	{
		if(!this.hasValue) update();
		
		return this.value;
	}
	
	/** {@inheritDoc} */
	@Override
	public void clear()
	{
		this.value = BigDecimal.ZERO;
		this.hasValue = false;
	}
	
	/** {@inheritDoc} */
	@Override
	public void update()
	{
		this.value = this.supplier.getBigd();
		this.hasValue = true;
	}
	
	/** {@inheritDoc} */
	@Override
	public boolean hasValue()
	{
		return this.hasValue;
	}
}
