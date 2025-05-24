package org.barghos.util.accessor;

public interface IIndexAccessorLAW<T>
{
	T set(T obj, long[] indices, Object values);
}
