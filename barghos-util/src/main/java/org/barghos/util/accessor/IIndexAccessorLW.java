package org.barghos.util.accessor;

public interface IIndexAccessorLW<T,V>
{
	T set(T obj, long index, V value);
}
