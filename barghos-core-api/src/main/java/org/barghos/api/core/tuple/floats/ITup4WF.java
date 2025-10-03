package org.barghos.api.core.tuple.floats;

/**
 * This interface provides common operations for float tuples with three
 * components.
 */
public interface ITup4WF extends ITup4RF, ITupWF
{

	ITup4WF v0(float v0);

	ITup4WF v1(float v1);
	
	ITup4WF v2(float v2);

	ITup4WF v3(float v3);

	@Override
	ITup4WF setAt(int index, float value);

	ITup4WF set(ITup4RF t);

	@Override
	ITup4WF set(ITupRF t);

	@Override
	ITup4WF set(float[] t);

	ITup4WF set(float v0, float v1, float v2, float v3);
}