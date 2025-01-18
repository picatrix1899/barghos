//package org.barghos.util.lazy.objs;
//
//import org.barghos.util.supplier.objs.SupplierO;
//import org.barghos.validation.ParameterValidation;
//
///**
// * An implementation of the {@link UpdatableLazyO} interface where the
// * provided object value is determined via a given {@link SupplierO}.
// */
//public class SuppliedLazyO implements UpdatableLazyO
//{
//	protected SupplierO supplier;
//	
//	protected Object value;
//	protected boolean hasValue;
//	
//	/**
//	 * Creates a new instance of {@link SuppliedLazyO} with the given
//	 * {@link SupplierO} to determine the value to provide.
//	 * 
//	 * @param supplier
//	 * The {@link SupplierO} used to determine the value to provide.
//	 */
//	public SuppliedLazyO(SupplierO supplier)
//	{	
//		ParameterValidation.pvNotNull("supplier", supplier);
//		
//		this.supplier = supplier;
//	}	
//	
//	/** {@inheritDoc} */
//	@Override
//	public Object valueO()
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
//		this.value = null;
//		this.hasValue = false;
//	}
//	
//	/** {@inheritDoc} */
//	@Override
//	public void update()
//	{
//		this.value = this.supplier.getO();
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
