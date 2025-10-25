package org.barghos.api.core.lazy;

import org.barghos.api.core.supplier.ISupp;

public interface ILateLazyW<T> extends ILazyW<T>
{
	ILateLazyW<T> supplier(ISupp<T> supplier);
	
	ILateLazyW<T> set(T value);
}
