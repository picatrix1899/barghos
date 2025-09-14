package org.barghos.impl.core.accessor.floats;

public interface IIndexAccessorLAWF<T>
{
	T set(T obj, long[] indices, float[] values);
}
