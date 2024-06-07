package org.barghos.util.lazy.floats;

import org.barghos.util.lazy.UpdatableLazy;

public interface UpdatableLazyF extends LazyF, UpdatableLazy<Float>
{
	void clear();
	void update();
}
