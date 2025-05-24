package org.barghos.util.lazy;

import org.barghos.util.supplier.Supplier;

/**
 * An implementation of the {@link UpdatableLazy} interface where the provided
 * value is determined via a given {@link Supplier}.
 * 
 * @param <T> The type of the provided value.
 */
public class LateLazy<T> implements ILateLazyW<T>
{
	protected Supplier<T> supplier;
	
	protected T value;
	protected boolean hasValue;
	
	/**
	 * Creates a new instance of {@link SuppliedLazy} with the given
	 * {@link Supplier} to determine the value to provide.
	 * 
	 * @param supplier
	 * The {@link Supplier} used to determine the value to provide.
	 */
	public LateLazy(Supplier<T> supplier)
	{	
		this.supplier = supplier;
	}	
	
	public LateLazy()
	{
		
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

	@Override
	public LateLazy<T> supplier(Supplier<T> supplier)
	{
		this.supplier = supplier;
		
		return this;
	}

	@Override
	public LateLazy<T> set(T value)
	{
		this.value = value;
		this.hasValue = true;
		
		return this;
	}
}
