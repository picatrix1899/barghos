package org.barghos.util.lazy.longs;

import org.barghos.util.supplier.longs.SupplierL;
import org.barghos.validation.ParameterValidation;

/**
 * An implementation of the {@link UpdatableLazyL} interface where the provided
 * long value is determined via a given {@link SupplierL}.
 */
public class SuppliedLazyL implements UpdatableLazyL
{
	protected SupplierL supplier;
	
	protected long value;
	protected boolean hasValue;
	
	/**
	 * Creates a new instance of {@link SuppliedLazyL} with the given
	 * {@link SupplierL} to determine the value to provide.
	 * 
	 * @param supplier
	 * The {@link SupplierL} used to determine the value to provide.
	 */
	public SuppliedLazyL(SupplierL supplier)
	{	
		ParameterValidation.pvNotNull("supplier", supplier);
		
		this.supplier = supplier;
	}	
	
	/** {@inheritDoc} */
	@Override
	public long valueLong()
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
		this.value = this.supplier.getLong();
		this.hasValue = true;
	}
	
	/** {@inheritDoc} */
	@Override
	public boolean hasValue()
	{
		return this.hasValue;
	}
}
