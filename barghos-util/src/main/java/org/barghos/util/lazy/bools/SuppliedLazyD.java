package org.barghos.util.lazy.bools;

import org.barghos.util.supplier.doubles.SupplierD;

import org.barghos.validation.ParameterValidation;

/**
 * An implementation of the {@link UpdatableLazyD} interface where the provided
 * double value is determined via a given {@link SupplierD}.
 */
public class SuppliedLazyD implements UpdatableLazyD
{
	protected SupplierD supplier;
	
	protected double value;
	protected boolean hasValue;
	
	/**
	 * Creates a new instance of {@link SuppliedLazyD} with the given
	 * {@link SupplierD} to determine the value to provide.
	 * 
	 * @param supplier
	 * The {@link SupplierD} used to determine the value to provide.
	 */
	public SuppliedLazyD(SupplierD supplier)
	{	
		ParameterValidation.pvNotNull("supplier", supplier);
		
		this.supplier = supplier;
	}	
	
	/** {@inheritDoc} */
	@Override
	public double valueDouble()
	{
		if(!this.hasValue) update();
		
		return this.value;
	}
	
	/** {@inheritDoc} */
	@Override
	public void clear()
	{
		this.value = 0.0f;
		this.hasValue = false;
	}
	
	/** {@inheritDoc} */
	@Override
	public void update()
	{
		this.value = this.supplier.getDouble();
		this.hasValue = true;
	}
	
	/** {@inheritDoc} */
	@Override
	public boolean hasValue()
	{
		return this.hasValue;
	}
}
