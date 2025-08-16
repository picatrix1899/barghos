package org.barghos.util.lazy;

import org.barghos.util.supplier.Supp;

public interface ILateLazyW<T> extends ILazyW<T>
{
	ILateLazyW<T> supplier(Supp<T> supplier);
	
	ILateLazyW<T> set(T value);
}
