package org.barghos.util.lazy.bytes;

import org.barghos.util.supplier.bytes.SupplierB;
import org.barghos.validation.ParameterValidation;

/**
 * An implementation of the {@link UpdatableLazyB} interface where the provided
 * byte value is determined via a given {@link SupplierB}.
 */
public class SuppliedLazyB implements UpdatableLazyB
{
	protected SupplierB supplier;
	
	protected byte value;
	protected boolean hasValue;
	
	/**
	 * Creates a new instance of {@link SuppliedLazyB} with the given
	 * {@link SupplierB} to determine the value to provide.
	 * 
	 * @param supplier
	 * The {@link SupplierB} used to determine the value to provide.
	 */
	public SuppliedLazyB(SupplierB supplier)
	{	
		ParameterValidation.pvNotNull("supplier", supplier);
		
		this.supplier = supplier;
	}	
	
	/** {@inheritDoc} */
	@Override
	public byte valueByte()
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
		this.value = this.supplier.getByte();
		this.hasValue = true;
	}
	
	/** {@inheritDoc} */
	@Override
	public boolean hasValue()
	{
		return this.hasValue;
	}
}
