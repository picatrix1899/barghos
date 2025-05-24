package org.barghos.util.accessor;

public interface IIndexAccessorLR<T,R>
{
	R get(T obj, long index);
}
