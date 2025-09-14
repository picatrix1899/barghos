package org.barghos.impl.core.accessor;

public interface IKeyAccessorW<T,K,V>
{
	T set(T obj, K key, V value);
}
