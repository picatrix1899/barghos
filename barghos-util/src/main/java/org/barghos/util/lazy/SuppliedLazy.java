package org.barghos.util.lazy;

import org.barghos.util.supplier.Supplier;
import org.barghos.validation.ParameterValidation;

public class SuppliedLazy<T> implements UpdatableLazy<T>
{
	protected Supplier<T> supplier;
	
	protected T value;
	protected boolean hasValue;
	
	public SuppliedLazy(Supplier<T> supplier)
	{	
		ParameterValidation.pvNotNull("supplier", supplier);
		
		this.supplier = supplier;
	}	
	
	public T value()
	{
		if(!hasValue) update();
		
		return this.value;
	}
	
	public void clear()
	{
		this.value = null;
		this.hasValue = false;
	}
	
	public void update()
	{
		this.value = this.supplier.get();
		this.hasValue = true;
	}
	
	public boolean hasValue()
	{
		return this.hasValue;
	}
}
