package org.barghos.impl.core.accessor;

public interface IIndexAccessorLAW<T>
{
	T set(T obj, long[] indices, Object values);
}
