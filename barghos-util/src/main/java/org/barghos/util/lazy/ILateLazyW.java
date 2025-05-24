package org.barghos.util.lazy;

import org.barghos.util.supplier.Supplier;

public interface ILateLazyW<T> extends ILazyW<T>
{
	ILateLazyW<T> supplier(Supplier<T> supplier);
	
	ILateLazyW<T> set(T value);
}
