package org.barghos.util.lazy.chars;

import org.barghos.util.lazy.UpdatableLazy;

/**
 * Represents a char value provider, that determines the value to provide on
 * the first call to {@link #valueC()} and stores it for any further calls.
 * This allows to execute probably complex code for determining the value only
 * if and when the value is really needed. This extends the {@link LazyC}
 * interface by the possibility to clear and to re-determine the stored value.
 */
public interface UpdatableLazyC extends LazyC, UpdatableLazy<Character>
{
	
}
