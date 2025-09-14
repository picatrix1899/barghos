//package org.barghos.util.lazy.shorts;
//
//import org.barghos.util.supplier.shorts.SupplierS;
//import org.barghos.validation.ParameterValidation;
//
///**
// * An implementation of the {@link UpdatableLazyS} interface where the provided
// * short value is determined via a given {@link SupplierS}.
// */
//public class SuppliedLazyS implements UpdatableLazyS
//{
//	protected SupplierS supplier;
//	
//	protected short value;
//	protected boolean hasValue;
//	
//	/**
//	 * Creates a new instance of {@link SuppliedLazyS} with the given
//	 * {@link SupplierS} to determine the value to provide.
//	 * 
//	 * @param supplier
//	 * The {@link SupplierS} used to determine the value to provide.
//	 */
//	public SuppliedLazyS(SupplierS supplier)
//	{	
//		ParameterValidation.pvNotNull("supplier", supplier);
//		
//		this.supplier = supplier;
//	}	
//	
//	/** {@inheritDoc} */
//	@Override
//	public short valueS()
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
//		this.value = 0;
//		this.hasValue = false;
//	}
//	
//	/** {@inheritDoc} */
//	@Override
//	public void update()
//	{
//		this.value = this.supplier.getS();
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


