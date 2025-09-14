package org.barghos.api.core.accessor;

public interface IIndexAccessorLR<T,R>
{
	R get(T obj, long index);
}
