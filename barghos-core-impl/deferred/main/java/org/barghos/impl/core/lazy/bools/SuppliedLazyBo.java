//package org.barghos.util.lazy.bools;
//
//import org.barghos.util.supplier.bools.SupplierBo;
//
//import org.barghos.validation.ParameterValidation;
//
///**
// * An implementation of the {@link UpdatableLazyBo} interface where the provided
// * boolean value is determined via a given {@link SupplierBo}.
// */
//public class SuppliedLazyBo implements UpdatableLazyBo
//{
//	protected SupplierBo supplier;
//	
//	protected boolean value;
//	protected boolean hasValue;
//	
//	/**
//	 * Creates a new instance of {@link SuppliedLazyBo} with the given
//	 * {@link SupplierBo} to determine the value to provide.
//	 * 
//	 * @param supplier
//	 * The {@link SupplierBo} used to determine the value to provide.
//	 */
//	public SuppliedLazyBo(SupplierBo supplier)
//	{	
//		ParameterValidation.pvNotNull("supplier", supplier);
//		
//		this.supplier = supplier;
//	}	
//	
//	/** {@inheritDoc} */
//	@Override
//	public boolean valueBo()
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
//		this.value = false;
//		this.hasValue = false;
//	}
//	
//	/** {@inheritDoc} */
//	@Override
//	public void update()
//	{
//		this.value = this.supplier.getBo();
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


