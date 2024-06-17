package org.barghos.util.lazy.strings;

import org.barghos.util.supplier.strings.SupplierStr;
import org.barghos.validation.ParameterValidation;

/**
 * An implementation of the {@link UpdatableLazyStr} interface where the provided
 * short value is determined via a given {@link SupplierStr}.
 */
public class SuppliedLazyStr implements UpdatableLazyStr
{
	protected SupplierStr supplier;
	
	protected String value;
	protected boolean hasValue;
	
	/**
	 * Creates a new instance of {@link SuppliedLazyStr} with the given
	 * {@link SupplierStr} to determine the value to provide.
	 * 
	 * @param supplier
	 * The {@link SupplierStr} used to determine the value to provide.
	 */
	public SuppliedLazyStr(SupplierStr supplier)
	{	
		ParameterValidation.pvNotNull("supplier", supplier);
		
		this.supplier = supplier;
	}	
	
	/** {@inheritDoc} */
	@Override
	public String valueString()
	{
		if(!this.hasValue) update();
		
		return this.value;
	}
	
	/** {@inheritDoc} */
	@Override
	public void clear()
	{
		this.value = "";
		this.hasValue = false;
	}
	
	/** {@inheritDoc} */
	@Override
	public void update()
	{
		this.value = this.supplier.getString();
		this.hasValue = true;
	}
	
	/** {@inheritDoc} */
	@Override
	public boolean hasValue()
	{
		return this.hasValue;
	}
}
