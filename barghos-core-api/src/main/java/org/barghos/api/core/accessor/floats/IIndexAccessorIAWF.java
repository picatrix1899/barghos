package org.barghos.api.core.accessor.floats;

public interface IIndexAccessorIAWF<T>
{
	T set(T obj, int[] indices, float[] values);
}
