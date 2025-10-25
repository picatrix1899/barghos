package org.barghos.api.core.tuple.longs;

/**
 * This interface provides common operations for float tuples with three
 * components.
 */
public interface ITup4WL extends ITup4RL, ITupWL
{

	ITup4WL v0(long v0);

	ITup4WL v1(long v1);
	
	ITup4WL v2(long v2);

	ITup4WL v3(long v3);

	/** {@inheritDoc} */
	@Override
	ITup4WL at(int index, long value);

	ITup4WL set(ITup4RL t);

	/** {@inheritDoc} */
	@Override
	ITup4WL set(ITupRL t);

	/** {@inheritDoc} */
	@Override
	ITup4WL set(long[] t);

	ITup4WL set(long v0, long v1, long v2, long v3);
	
}