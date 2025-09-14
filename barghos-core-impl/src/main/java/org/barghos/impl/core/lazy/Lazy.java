package org.barghos.impl.core.lazy;

import org.barghos.api.core.lazy.ILazyW;
import org.barghos.api.core.supplier.Supp;

/**
 * An implementation of the {@link UpdatableLazy} interface where the provided
 * value is determined via a given {@link Supplier}.
 * 
 * @param <T> The type of the provided value.
 */
public class Lazy<T> implements ILazyW<T>
{
	protected Supp<T> supplier;
	
	protected T value;
	protected boolean hasValue;
	
	/**
	 * Creates a new instance of {@link SuppliedLazy} with the given
	 * {@link Supplier} to determine the value to provide.
	 * 
	 * @param supplier
	 * The {@link Supplier} used to determine the value to provide.
	 */
	public Lazy(Supp<T> supplier)
	{	
		this.supplier = supplier;
	}	
	
	/** {@inheritDoc} */
	@Override
	public T value()
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
		this.value = this.supplier.get();
		this.hasValue = true;
	}
	
	/** {@inheritDoc} */
	@Override
	public boolean hasValue()
	{
		return this.hasValue;
	}
}
