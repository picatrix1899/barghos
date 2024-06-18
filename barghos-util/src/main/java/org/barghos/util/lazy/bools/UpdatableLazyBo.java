package org.barghos.util.lazy.bools;

import org.barghos.util.lazy.UpdatableLazy;

/**
 * Represents a boolean value provider, that determines the value to provide on
 * the first call to {@link #valueBo()} and stores it for any further calls.
 * This allows to execute probably complex code for determining the value only
 * if and when the value is really needed. This extends the {@link LazyBo}
 * interface by the possibility to clear and to re-determine the stored value.
 */
public interface UpdatableLazyBo extends LazyBo, UpdatableLazy<Boolean>
{
	
}
