package org.barghos.api.math.vector;

import org.barghos.api.core.tuple.floats.ITup2RF;
import org.barghos.api.core.tuple.floats.ITup2WF;
import org.barghos.api.core.tuple.floats.ITupRF;

/**
 * This interface provides the common functions and methods for float vectors with two dimensions.
 */
public interface IVec2WF extends IVec2RF, ITup2WF
{
	
	/** {@inheritDoc} */
	IVec2WF x(float x);
	
	/** {@inheritDoc} */
	IVec2WF y(float y);
	
	/** {@inheritDoc} */
	@Override
	IVec2WF set(ITup2RF t);
	
	/** {@inheritDoc} */
	@Override
	IVec2WF set(ITupRF t);
	
	/** {@inheritDoc} */
	@Override
	IVec2WF set(float[] values);
	
	/** {@inheritDoc} */
	@Override
	IVec2WF set(float x, float y);
	
	/** {@inheritDoc} */
	@Override
	IVec2WF at(int index, float value);

	IVec2WF add(ITup2RF v);
	
	IVec2WF add(ITupRF v);

	IVec2WF add(float[] v);
	
	IVec2WF add(float v);

	IVec2WF add(float vX, float vY);
	
	/** {@inheritDoc} */
	@Override
	IVec2WF addN(ITup2RF v);
	
	/** {@inheritDoc} */
	@Override
	IVec2WF addN(ITupRF v);
	
	/** {@inheritDoc} */
	@Override
	IVec2WF addN(float[] v);
	
	/** {@inheritDoc} */
	@Override
	IVec2WF addN(float value);
	
	/** {@inheritDoc} */
	@Override
	IVec2WF addN(float vX, float vY);

	IVec2WF sub(ITup2RF v);
	
	IVec2WF sub(ITupRF v);

	IVec2WF sub(float[] v);

	IVec2WF sub(float value);

	IVec2WF sub(float vX, float vY);
	
	/** {@inheritDoc} */
	@Override
	IVec2WF subN(ITup2RF v);
	
	/** {@inheritDoc} */
	@Override
	IVec2WF subN(ITupRF v);
	
	/** {@inheritDoc} */
	@Override
	IVec2WF subN(float[] v);
	
	/** {@inheritDoc} */
	@Override
	IVec2WF subN(float value);
	
	/** {@inheritDoc} */
	@Override
	IVec2WF subN(float vX, float vY);

	IVec2WF revSub(ITup2RF v);
	
	IVec2WF revSub(ITupRF v);

	IVec2WF revSub(float[] v);

	IVec2WF revSub(float value);

	IVec2WF revSub(float vX, float vY);
	
	/** {@inheritDoc} */
	@Override
	IVec2WF revSubN(ITup2RF v);
	
	/** {@inheritDoc} */
	@Override
	IVec2WF revSubN(ITupRF v);
	
	/** {@inheritDoc} */
	@Override
	IVec2WF revSubN(float[] v);
	
	/** {@inheritDoc} */
	@Override
	IVec2WF revSubN(float value);
	
	/** {@inheritDoc} */
	@Override
	IVec2WF revSubN(float vX, float vY);

	IVec2WF mul(ITup2RF v);
	
	IVec2WF mul(ITupRF v);

	IVec2WF mul(float[] v);

	IVec2WF mul(float value);

	IVec2WF mul(float vX, float vY);
	
	/** {@inheritDoc} */
	@Override
	IVec2WF mulN(ITup2RF v);
	
	/** {@inheritDoc} */
	@Override
	IVec2WF mulN(ITupRF v);
	
	/** {@inheritDoc} */
	@Override
	IVec2WF mulN(float[] v);
	
	/** {@inheritDoc} */
	@Override
	IVec2WF mulN(float value);
	
	/** {@inheritDoc} */
	@Override
	IVec2WF mulN(float vX, float vY);

	IVec2WF div(ITup2RF v);
	
	IVec2WF div(ITupRF v);

	IVec2WF div(float[] v);
	
	IVec2WF div(float value);

	IVec2WF div(float vX, float vY);
	
	/** {@inheritDoc} */
	@Override
	IVec2WF divN(ITup2RF v);
	
	/** {@inheritDoc} */
	@Override
	IVec2WF divN(ITupRF v);
	
	/** {@inheritDoc} */
	@Override
	IVec2WF divN(float[] v);
	
	/** {@inheritDoc} */
	@Override
	IVec2WF divN(float value);
	
	/** {@inheritDoc} */
	@Override
	IVec2WF divN(float vX, float vY);

	IVec2WF revDiv(ITup2RF v);
	
	IVec2WF revDiv(ITupRF v);

	IVec2WF revDiv(float[] v);

	IVec2WF revDiv(float value);

	IVec2WF revDiv(float vX, float vY);
	
	/** {@inheritDoc} */
	@Override
	IVec2WF revDivN(ITup2RF v);
	
	/** {@inheritDoc} */
	@Override
	IVec2WF revDivN(ITupRF v);
	
	/** {@inheritDoc} */
	@Override
	IVec2WF revDivN(float[] v);
	
	/** {@inheritDoc} */
	@Override
	IVec2WF revDivN(float value);
	
	/** {@inheritDoc} */
	@Override
	IVec2WF revDivN(float vX, float vY);
	
	IVec2WF negate();
	
	/** {@inheritDoc} */
	@Override
	IVec2WF negateN();

	IVec2WF reciprocal();
	
	/** {@inheritDoc} */
	@Override
	IVec2WF reciprocalN();

	IVec2WF normalize();
	
	/** {@inheritDoc} */
	@Override
	IVec2WF normalizeN();
	
	IVec2WF abs();
	
	/** {@inheritDoc} */
	@Override
	IVec2WF absN();

	IVec2WF signum();
	
	/** {@inheritDoc} */
	@Override
	IVec2WF signumN();
	
}
