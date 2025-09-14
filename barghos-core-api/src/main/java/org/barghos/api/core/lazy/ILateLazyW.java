package org.barghos.api.core.lazy;

import org.barghos.api.core.supplier.Supp;

public interface ILateLazyW<T> extends ILazyW<T>
{
	ILateLazyW<T> supplier(Supp<T> supplier);
	
	ILateLazyW<T> set(T value);
}
