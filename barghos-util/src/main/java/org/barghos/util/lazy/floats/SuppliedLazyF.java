//package org.barghos.util.lazy.floats;
//
//import org.barghos.util.supplier.floats.SupplierF;
//import org.barghos.validation.ParameterValidation;
//
///**
// * An implementation of the {@link UpdatableLazyF} interface where the provided
// * float value is determined via a given {@link SupplierF}.
// */
//public class SuppliedLazyF implements UpdatableLazyF
//{
//	protected SupplierF supplier;
//	
//	protected float value;
//	protected boolean hasValue;
//	
//	/**
//	 * Creates a new instance of {@link SuppliedLazyF} with the given
//	 * {@link SupplierF} to determine the value to provide.
//	 * 
//	 * @param supplier
//	 * The {@link SupplierF} used to determine the value to provide.
//	 */
//	public SuppliedLazyF(SupplierF supplier)
//	{	
//		ParameterValidation.pvNotNull("supplier", supplier);
//		
//		this.supplier = supplier;
//	}	
//	
//	/** {@inheritDoc} */
//	@Override
//	public float valueF()
//	{
//		if(!this.hasValue) update();
//		
//		return this.value;
//	}
//	
//	/** {@inheritDoc} */
//	@Override
//	public void clear()
//	{
//		this.value = 0.0f;
//		this.hasValue = false;
//	}
//	
//	/** {@inheritDoc} */
//	@Override
//	public void update()
//	{
//		this.value = this.supplier.getF();
//		this.hasValue = true;
//	}
//	
//	/** {@inheritDoc} */
//	@Override
//	public boolean hasValue()
//	{
//		return this.hasValue;
//	}
//}
