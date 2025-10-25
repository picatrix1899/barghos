package org.barghos.api.core.tuple.ints;

/**
 * This interface provides common operations for float tuples with three
 * components.
 */
public interface ITup4WI extends ITup4RI, ITupWI
{

	ITup4WI v0(int v0);

	ITup4WI v1(int v1);
	
	ITup4WI v2(int v2);

	ITup4WI v3(int v3);

	/** {@inheritDoc} */
	@Override
	ITup4WI at(int index, int value);

	ITup4WI set(ITup4RI t);

	/** {@inheritDoc} */
	@Override
	ITup4WI set(ITupRI t);

	/** {@inheritDoc} */
	@Override
	ITup4WI set(int[] t);

	ITup4WI set(int v0, int v1, int v2, int v3);
	
}