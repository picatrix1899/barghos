package org.barghos.api.core.tuple.ints;

/**
 * This interface provides common operations for float tuples with three
 * components.
 */
public interface ITup3WI extends ITup3RI, ITupWI
{

	ITup3WI v0(int v0);

	ITup3WI v1(int v1);

	ITup3WI v2(int v2);

	/** {@inheritDoc} */
	@Override
	ITup3WI at(int index, int value);

	ITup3WI set(ITup3RI t);

	/** {@inheritDoc} */
	@Override
	ITup3WI set(ITupRI t);

	/** {@inheritDoc} */
	@Override
	ITup3WI set(int[] t);

	ITup3WI set(int v0, int v1, int v2);
	
}