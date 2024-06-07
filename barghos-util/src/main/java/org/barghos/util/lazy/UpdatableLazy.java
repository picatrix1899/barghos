package org.barghos.util.lazy;


public interface UpdatableLazy<T> extends Lazy<T>
{
	void clear();
	void update();
}
