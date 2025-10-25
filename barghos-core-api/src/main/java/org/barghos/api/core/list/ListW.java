package org.barghos.api.core.list;

public interface ListW<T> extends ListR<T>
{
	void at(int index, T value);
}
