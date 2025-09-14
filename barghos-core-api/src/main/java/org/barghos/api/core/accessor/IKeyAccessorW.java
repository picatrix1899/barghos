package org.barghos.api.core.accessor;

public interface IKeyAccessorW<T,K,V>
{
	T set(T obj, K key, V value);
}
