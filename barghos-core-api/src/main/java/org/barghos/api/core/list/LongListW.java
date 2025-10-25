package org.barghos.api.core.list;

public interface LongListW<T> extends LongListR<T>
{
	void at(long index, T value);
}
