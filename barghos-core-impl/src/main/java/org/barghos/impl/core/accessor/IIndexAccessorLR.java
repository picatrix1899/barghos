package org.barghos.impl.core.accessor;

public interface IIndexAccessorLR<T,R>
{
	R get(T obj, long index);
}
