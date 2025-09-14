package org.barghos.api.core.accessor;

public interface IIndexAccessorIR<T,R>
{
	R get(T obj, int index);
}
