package org.barghos.util.accessor;

public interface IKeyAccessorR<T,K,R>
{
	R get(T obj, K key, int index);
}
