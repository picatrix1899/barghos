package org.barghos.util.lazy.chars;

import org.barghos.util.supplier.chars.SupplierC;
import org.barghos.validation.ParameterValidation;

/**
 * An implementation of the {@link UpdatableLazyC} interface where the provided
 * byte value is determined via a given {@link SupplierC}.
 */
public class SuppliedLazyC implements UpdatableLazyC
{
	protected SupplierC supplier;
	
	protected char value;
	protected boolean hasValue;
	
	/**
	 * Creates a new instance of {@link SuppliedLazyC} with the given
	 * {@link SupplierC} to determine the value to provide.
	 * 
	 * @param supplier
	 * The {@link SupplierC} used to determine the value to provide.
	 */
	public SuppliedLazyC(SupplierC supplier)
	{	
		ParameterValidation.pvNotNull("supplier", supplier);
		
		this.supplier = supplier;
	}	
	
	/** {@inheritDoc} */
	@Override
	public char valueChar()
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
		this.value = this.supplier.getChar();
		this.hasValue = true;
	}
	
	/** {@inheritDoc} */
	@Override
	public boolean hasValue()
	{
		return this.hasValue;
	}
}
