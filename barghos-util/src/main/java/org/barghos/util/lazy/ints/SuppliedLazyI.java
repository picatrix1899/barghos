package org.barghos.util.lazy.ints;

import org.barghos.util.supplier.ints.SupplierI;
import org.barghos.validation.ParameterValidation;

/**
 * An implementation of the {@link UpdatableLazyI} interface where the provided
 * integer value is determined via a given {@link SupplierI}.
 */
public class SuppliedLazyI implements UpdatableLazyI
{
	protected SupplierI supplier;
	
	protected int value;
	protected boolean hasValue;
	
	/**
	 * Creates a new instance of {@link SuppliedLazyI} with the given
	 * {@link SupplierI} to determine the value to provide.
	 * 
	 * @param supplier
	 * The {@link SupplierI} used to determine the value to provide.
	 */
	public SuppliedLazyI(SupplierI supplier)
	{	
		ParameterValidation.pvNotNull("supplier", supplier);
		
		this.supplier = supplier;
	}	
	
	/** {@inheritDoc} */
	@Override
	public int valueI()
	{
		if(!this.hasValue) update();
		
		return this.value;
	}
	
	/** {@inheritDoc} */
	@Override
	public void clear()
	{
		this.value = 0;
		this.hasValue = false;
	}
	
	/** {@inheritDoc} */
	@Override
	public void update()
	{
		this.value = this.supplier.getI();
		this.hasValue = true;
	}
	
	/** {@inheritDoc} */
	@Override
	public boolean hasValue()
	{
		return this.hasValue;
	}
}
