package org.barghos.util.lazy.bigis;

import java.math.BigInteger;

import org.barghos.util.lazy.UpdatableLazy;

/**
 * Represents a {@link BigInteger} value provider, that determines the value to
 * provide on the first call to {@link #valueBigDec()} and stores it for any
 * further calls. This allows to execute probably complex code for determining
 * the value only if and when the value is really needed. This extends the
 * {@link LazyBigd} interface by the possibility to clear and to re-determine
 * the stored value.
 */
public interface UpdatableLazyBigi extends LazyBigi, UpdatableLazy<BigInteger>
{
	
}
