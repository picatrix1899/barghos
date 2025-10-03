package org.barghos.api.core.tuple.floats;

/**
 * This interface provides common operations for float tuples with two
 * components.
 */
public interface ITup2WF extends ITup2RF, ITupWF
{

	ITup2WF v0(float v0);

	ITup2WF v1(float v1);

	@Override
	ITup2WF setAt(int index, float value);

	ITup2WF set(ITup2RF t);

	@Override
	ITup2WF set(ITupRF t);

	@Override
	ITup2WF set(float[] t);

	ITup2WF set(float v0, float v1);
}