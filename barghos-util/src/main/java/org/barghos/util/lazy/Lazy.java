package org.barghos.util.lazy;

import org.barghos.util.supplier.Supplier;

public class Lazy<T>
{
	protected Supplier<T> supplier;
	
	protected T value;
	protected boolean hasValue;
	
	public Lazy(Supplier<T> supplier)
	{	
		supplier(supplier);
	}
	
	public Supplier<T> supplier()
	{
		return this.supplier;
	}
	
	public Lazy<T> supplier(Supplier<T> supplier)
	{
		this.supplier = supplier;
		
		return this;
	}
	
	public T value()
	{
		if(!hasValue) update();
		
		return this.value;
	}
	
	public T newValue()
	{
		return this.supplier.getGeneric();
	}
	
	public void clear()
	{
		this.value = null;
		this.hasValue = false;
	}
	
	public void update()
	{
		this.value = this.supplier.getGeneric();
		this.hasValue = true;
	}
	
	public boolean hasValue()
	{
		return this.hasValue;
	}
}
