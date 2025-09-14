package org.barghos.impl.core.accessor;

public interface IKeyAccessorR<T,K,R>
{
	R get(T obj, K key, int index);
}
