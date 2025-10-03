package org.barghos.api.core.tuple.floats;

/**
 * This interface provides common operations for float tuples with three
 * components.
 */
public interface ITup3WF extends ITup3RF, ITupWF
{

	ITup3WF v0(float v0);

	ITup3WF v1(float v1);

	ITup3WF v2(float v2);

	@Override
	ITup3WF setAt(int index, float value);

	ITup3WF set(ITup3RF t);

	@Override
	ITup3WF set(ITupRF t);

	@Override
	ITup3WF set(float[] t);

	ITup3WF set(float v0, float v1, float v2);
}