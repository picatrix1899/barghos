package org.barghos.util.lazy;

import java.util.Optional;

import org.barghos.util.supplier.Supplier;

public class LazyOptional<T>
{
	protected Supplier<T> supplier;
	
	protected Optional<T> value = Optional.empty();
	protected boolean hasValue;
	
	public LazyOptional(Supplier<T> supplier)
	{	
		supplier(supplier);
	}
	
	public Supplier<T> supplier()
	{
		return this.supplier;
	}
	
	public LazyOptional<T> supplier(Supplier<T> supplier)
	{
		this.supplier = supplier;
		
		return this;
	}
	
	public T value()
	{
		if(!hasValue) update();
		
		return this.value.get();
	}
	
	public Optional<T> optionalValue()
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
		this.value = Optional.ofNullable(this.supplier.get());
		this.hasValue = true;
	}
	
	public boolean hasValue()
	{
		return this.hasValue;
	}
	
	public boolean isPresent()
	{
		return this.value.isPresent();
	}
	
	public boolean isEmpty()
	{
		return this.value.isEmpty();
	}
}
