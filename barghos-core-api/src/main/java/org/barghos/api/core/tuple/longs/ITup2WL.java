package org.barghos.api.core.tuple.longs;

/**
 * This interface provides common operations for float tuples with two
 * components.
 */
public interface ITup2WL extends ITup2RL, ITupWL
{

	ITup2WL v0(long v0);

	ITup2WL v1(long v1);

	/** {@inheritDoc} */
	@Override
	ITup2WL at(int index, long value);

	ITup2WL set(ITup2RL t);

	/** {@inheritDoc} */
	@Override
	ITup2WL set(ITupRL t);

	/** {@inheritDoc} */
	@Override
	ITup2WL set(long[] t);

	ITup2WL set(long v0, long v1);
	
}