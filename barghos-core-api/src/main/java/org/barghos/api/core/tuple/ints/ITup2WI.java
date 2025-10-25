package org.barghos.api.core.tuple.ints;

/**
 * This interface provides common operations for float tuples with two
 * components.
 */
public interface ITup2WI extends ITup2RI, ITupWI
{

	ITup2WI v0(int v0);

	ITup2WI v1(int v1);

	/** {@inheritDoc} */
	@Override
	ITup2WI at(int index, int value);

	ITup2WI set(ITup2RI t);

	/** {@inheritDoc} */
	@Override
	ITup2WI set(ITupRI t);

	/** {@inheritDoc} */
	@Override
	ITup2WI set(int[] t);

	ITup2WI set(int v0, int v1);
	
}