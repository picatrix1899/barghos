package org.barghos.util.lazy;

import org.barghos.util.supplier.Supplier;
import org.barghos.validation.ParameterValidation;

/**
 * An implementation of the {@link UpdatableLazy} interface where the provided
 * value is determined via a given {@link Supplier}.
 * 
 * @param <T> The type of the provided value.
 */
public class SuppliedLazy<T> implements UpdatableLazy<T>
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
	public SuppliedLazy(Supplier<T> supplier)
	{	
		ParameterValidation.pvNotNull("supplier", supplier);
		
		this.supplier = supplier;
	}	
	
	/** {@inheritDoc} */
	@Override
	public T valueGeneric()
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
		this.value = this.supplier.getGeneric();
		this.hasValue = true;
	}
	
	/** {@inheritDoc} */
	@Override
	public boolean hasValue()
	{
		return this.hasValue;
	}
}
