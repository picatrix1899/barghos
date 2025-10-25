package org.barghos.api.core.tuple.longs;

/**
 * This interface provides common operations for float tuples with three
 * components.
 */
public interface ITup3WL extends ITup3RL, ITupWL
{

	ITup3WL v0(long v0);

	ITup3WL v1(long v1);

	ITup3WL v2(long v2);

	/** {@inheritDoc} */
	@Override
	ITup3WL at(int index, long value);

	ITup3WL set(ITup3RL t);

	/** {@inheritDoc} */
	@Override
	ITup3WL set(ITupRL t);

	/** {@inheritDoc} */
	@Override
	ITup3WL set(long[] t);

	ITup3WL set(long v0, long v1, long v2);
	
}