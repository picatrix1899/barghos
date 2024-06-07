package org.barghos.util.lazy.floats;

import org.barghos.util.supplier.floats.SupplierF;
import org.barghos.validation.ParameterValidation;

public class SuppliedLazyF implements UpdatableLazyF
{
	protected SupplierF supplier;
	
	protected float value;
	protected boolean hasValue;
	
	public SuppliedLazyF(SupplierF supplier)
	{	
		ParameterValidation.pvNotNull("supplier", supplier);
		
		this.supplier = supplier;
	}	
	
	public float valueFloat()
	{
		if(!hasValue) update();
		
		return this.value;
	}
	
	public void clear()
	{
		this.value = 0.0f;
		this.hasValue = false;
	}
	
	public void update()
	{
		this.value = this.supplier.getFloat();
		this.hasValue = true;
	}
	
	public boolean hasValue()
	{
		return this.hasValue;
	}
}
