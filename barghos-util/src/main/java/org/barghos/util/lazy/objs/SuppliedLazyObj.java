package org.barghos.util.lazy.objs;

import org.barghos.util.supplier.objs.SupplierObj;
import org.barghos.validation.ParameterValidation;

/**
 * An implementation of the {@link UpdatableLazyObj} interface where the
 * provided object value is determined via a given {@link SupplierObj}.
 */
public class SuppliedLazyObj implements UpdatableLazyObj
{
	protected SupplierObj supplier;
	
	protected Object value;
	protected boolean hasValue;
	
	/**
	 * Creates a new instance of {@link SuppliedLazyObj} with the given
	 * {@link SupplierObj} to determine the value to provide.
	 * 
	 * @param supplier
	 * The {@link SupplierObj} used to determine the value to provide.
	 */
	public SuppliedLazyObj(SupplierObj supplier)
	{	
		ParameterValidation.pvNotNull("supplier", supplier);
		
		this.supplier = supplier;
	}	
	
	/** {@inheritDoc} */
	@Override
	public Object valueObject()
	{
		if(!this.hasValue) update();
		
		return this.value;
	}
	
	/** {@inheritDoc} */
	@Override
	public void clear()
	{
		this.value = null;
		this.hasValue = false;
	}
	
	/** {@inheritDoc} */
	@Override
	public void update()
	{
		this.value = this.supplier.getObject();
		this.hasValue = true;
	}
	
	/** {@inheritDoc} */
	@Override
	public boolean hasValue()
	{
		return this.hasValue;
	}
}
