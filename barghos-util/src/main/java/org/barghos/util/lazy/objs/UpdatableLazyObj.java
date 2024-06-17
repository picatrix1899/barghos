package org.barghos.util.lazy.objs;

import org.barghos.util.lazy.UpdatableLazy;

/**
 * Represents an object value provider, that determines the value to provide on
 * the first call to {@link #valueObject()} and stores it for any further calls.
 * This allows to execute probably complex code for determining the value only
 * if and when the value is really needed. This extends the {@link LazyObj}
 * interface by the possibility to clear and to re-determine the stored value.
 */
public interface UpdatableLazyObj extends LazyObj, UpdatableLazy<Object>
{
	
}
