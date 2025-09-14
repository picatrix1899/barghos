package org.barghos.api.core.accessor;

public interface IIndexAccessorLAW<T>
{
	T set(T obj, long[] indices, Object values);
}
