package org.barghos.api.core.accessor;

public interface IIndexAccessorIW<T,V>
{
	T set(T obj, int index, V value);
}
