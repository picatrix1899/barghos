package org.barghos.api.math.vector;

import org.barghos.api.core.tuple.floats.ITup3RF;
import org.barghos.api.core.tuple.floats.ITup3WF;
import org.barghos.api.core.tuple.floats.ITupRF;

/**
 * This interface provides the common functions and methods for float vectors with two dimensions.
 */
public interface IVec3WF extends IVec3RF, ITup3WF
{
	
	/** {@inheritDoc} */
	IVec3WF x(float x);
	
	/** {@inheritDoc} */
	IVec3WF y(float y);
	
	/** {@inheritDoc} */
	IVec3WF z(float z);
	
	/** {@inheritDoc} */
	@Override
	IVec3WF set(ITup3RF v);
	
	/** {@inheritDoc} */
	@Override
	IVec3WF set(ITupRF v);
	
	/** {@inheritDoc} */
	@Override
	IVec3WF set(float[] v);
	
	/** {@inheritDoc} */
	@Override
	IVec3WF set(float x, float y, float z);
	
	/** {@inheritDoc} */
	@Override
	IVec3WF at(int index, float value);

	IVec3WF add(ITup3RF v);
	
	IVec3WF add(ITupRF v);
	
	IVec3WF add(float[] v);

	IVec3WF add(float value);

	IVec3WF add(float x, float y, float z);
	
	/** {@inheritDoc} */
	@Override
	IVec3WF addN(ITup3RF v);
	
	/** {@inheritDoc} */
	@Override
	IVec3WF addN(ITupRF v);
	
	/** {@inheritDoc} */
	@Override
	IVec3WF addN(float[] v);
	
	/** {@inheritDoc} */
	@Override
	IVec3WF addN(float value);
	
	/** {@inheritDoc} */
	@Override
	IVec3WF addN(float x, float y, float z);

	IVec3WF sub(ITup3RF v);
	
	IVec3WF sub(ITupRF v);

	IVec3WF sub(float[] v);

	IVec3WF sub(float value);

	IVec3WF sub(float x, float y, float z);
	
	/** {@inheritDoc} */
	@Override
	IVec3WF subN(ITup3RF v);
	
	/** {@inheritDoc} */
	@Override
	IVec3WF subN(ITupRF v);
	
	/** {@inheritDoc} */
	@Override
	IVec3WF subN(float[] v);
	
	/** {@inheritDoc} */
	@Override
	IVec3WF subN(float value);
	
	/** {@inheritDoc} */
	@Override
	IVec3WF subN(float x, float y, float z);

	IVec3WF revSub(ITup3RF v);
	
	IVec3WF revSub(ITupRF v);

	IVec3WF revSub(float[] v);

	IVec3WF revSub(float value);

	IVec3WF revSub(float x, float y, float z);
	
	/** {@inheritDoc} */
	@Override
	IVec3WF revSubN(ITup3RF v);
	
	/** {@inheritDoc} */
	@Override
	IVec3WF revSubN(ITupRF v);
	
	/** {@inheritDoc} */
	@Override
	IVec3WF revSubN(float[] v);
	
	/** {@inheritDoc} */
	@Override
	IVec3WF revSubN(float value);
	
	/** {@inheritDoc} */
	@Override
	IVec3WF revSubN(float x, float y, float z);

	IVec3WF mul(ITup3RF v);
	
	IVec3WF mul(ITupRF v);

	IVec3WF mul(float[] v);

	IVec3WF mul(float value);

	IVec3WF mul(float x, float y, float z);
	
	/** {@inheritDoc} */
	@Override
	IVec3WF mulN(ITup3RF v);
	
	/** {@inheritDoc} */
	@Override
	IVec3WF mulN(ITupRF v);
	
	/** {@inheritDoc} */
	@Override
	IVec3WF mulN(float[] v);
	
	/** {@inheritDoc} */
	@Override
	IVec3WF mulN(float value);
	
	/** {@inheritDoc} */
	@Override
	IVec3WF mulN(float x, float y, float z);

	IVec3WF div(ITup3RF v);
	
	IVec3WF div(ITupRF v);

	IVec3WF div(float[] v);

	IVec3WF div(float value);

	IVec3WF div(float x, float y, float z);
	
	/** {@inheritDoc} */
	@Override
	IVec3WF divN(ITup3RF v);
	
	/** {@inheritDoc} */
	@Override
	IVec3WF divN(ITupRF v);
	
	/** {@inheritDoc} */
	@Override
	IVec3WF divN(float[] v);
	
	/** {@inheritDoc} */
	@Override
	IVec3WF divN(float value);
	
	/** {@inheritDoc} */
	@Override
	IVec3WF divN(float x, float y, float z);

	IVec3WF revDiv(ITup3RF v);
	
	IVec3WF revDiv(ITupRF v);

	IVec3WF revDiv(float[] v);
	
	IVec3WF revDiv(float value);

	IVec3WF revDiv(float x, float y, float z);
	
	/** {@inheritDoc} */
	@Override
	IVec3WF revDivN(ITup3RF v);
	
	/** {@inheritDoc} */
	@Override
	IVec3WF revDivN(ITupRF v);
	
	/** {@inheritDoc} */
	@Override
	IVec3WF revDivN(float[] v);
	
	/** {@inheritDoc} */
	@Override
	IVec3WF revDivN(float value);
	
	/** {@inheritDoc} */
	@Override
	IVec3WF revDivN(float x, float y, float z);
	
	IVec3WF negate();
	
	/** {@inheritDoc} */
	@Override
	IVec3WF negateN();

	IVec3WF reciprocal();
	
	/** {@inheritDoc} */
	@Override
	IVec3WF reciprocalN();

	IVec3WF normalize();
	
	/** {@inheritDoc} */
	@Override
	IVec3WF normalizeN();
	
	IVec3WF abs();
	
	/** {@inheritDoc} */
	@Override
	IVec3WF absN();

	IVec3WF signum();
	
	/** {@inheritDoc} */
	@Override
	IVec3WF signumN();
	
	IVec3WF cross(ITup3RF v);
	
	IVec3WF cross(ITupRF v);
	
	IVec3WF cross(float[] v);
	
	IVec3WF cross(float x, float y, float z);
	
	/** {@inheritDoc} */
	@Override
	IVec3WF crossN(ITup3RF v);
	
	/** {@inheritDoc} */
	@Override
	IVec3WF crossN(ITupRF v);
	
	/** {@inheritDoc} */
	@Override
	IVec3WF crossN(float[] v);
	
	/** {@inheritDoc} */
	@Override
	IVec3WF crossN(float x, float y, float z);
	
	IVec3WF revCross(ITup3RF v);
	
	IVec3WF revCross(ITupRF v);
	
	IVec3WF revCross(float[] v);
	
	IVec3WF revCross(float x, float y, float z);
	
	/** {@inheritDoc} */
	@Override
	IVec3WF revCrossN(ITup3RF v);
	
	/** {@inheritDoc} */
	@Override
	IVec3WF revCrossN(ITupRF v);
	
	/** {@inheritDoc} */
	@Override
	IVec3WF revCrossN(float[] v);
	
	/** {@inheritDoc} */
	@Override
	IVec3WF revCrossN(float x, float y, float z);
	
}
