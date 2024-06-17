package org.barghos.util.lazy.bigis;

import java.math.BigInteger;

import org.barghos.util.supplier.bigis.SupplierBigi;
import org.barghos.validation.ParameterValidation;

/**
 * An implementation of the {@link UpdatableLazyBigi} interface where the
 * provided double value is determined via a given {@link SupplierBigi}.
 */
public class SuppliedLazyBigi implements UpdatableLazyBigi
{
	protected SupplierBigi supplier;
	
	protected BigInteger value;
	protected boolean hasValue;
	
	/**
	 * Creates a new instance of {@link SuppliedLazyBigi} with the given
	 * {@link SupplierBigi} to determine the value to provide.
	 * 
	 * @param supplier
	 * The {@link SupplierBigi} used to determine the value to provide.
	 */
	public SuppliedLazyBigi(SupplierBigi supplier)
	{	
		ParameterValidation.pvNotNull("supplier", supplier);
		
		this.supplier = supplier;
	}	
	
	/** {@inheritDoc} */
	@Override
	public BigInteger valueBigInt()
	{
		if(!this.hasValue) update();
		
		return this.value;
	}
	
	/** {@inheritDoc} */
	@Override
	public void clear()
	{
		this.value = BigInteger.ZERO;
		this.hasValue = false;
	}
	
	/** {@inheritDoc} */
	@Override
	public void update()
	{
		this.value = this.supplier.getBigInt();
		this.hasValue = true;
	}
	
	/** {@inheritDoc} */
	@Override
	public boolean hasValue()
	{
		return this.hasValue;
	}
}
