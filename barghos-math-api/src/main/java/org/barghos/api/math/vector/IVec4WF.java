package org.barghos.api.math.vector;

import org.barghos.api.core.tuple.floats.ITup4RF;
import org.barghos.api.core.tuple.floats.ITup4WF;
import org.barghos.api.core.tuple.floats.ITupRF;

/**
 * This interface provides the common functions and methods for float vectors with two dimensions.
 */
public interface IVec4WF extends IVec4RF, ITup4WF
{
	
	/** {@inheritDoc} */
	IVec4WF x(float x);
	
	/** {@inheritDoc} */
	IVec4WF y(float y);
	
	/** {@inheritDoc} */
	IVec4WF z(float z);
	
	/** {@inheritDoc} */
	IVec4WF w(float w);
	
	/** {@inheritDoc} */
	@Override
	IVec4WF set(ITup4RF v);
	
	/** {@inheritDoc} */
	@Override
	IVec4WF set(ITupRF v);
	
	/** {@inheritDoc} */
	@Override
	IVec4WF set(float[] v);
	
	/** {@inheritDoc} */
	@Override
	IVec4WF set(float x, float y, float z, float w);
	
	/** {@inheritDoc} */
	@Override
	IVec4WF at(int index, float value);

	IVec4WF add(ITup4RF v);
	
	IVec4WF add(ITupRF v);
	
	IVec4WF add(float[] v);

	IVec4WF add(float value);

	IVec4WF add(float x, float y, float z, float w);
	
	/** {@inheritDoc} */
	@Override
	IVec4WF addN(ITup4RF v);
	
	/** {@inheritDoc} */
	@Override
	IVec4WF addN(ITupRF v);
	
	/** {@inheritDoc} */
	@Override
	IVec4WF addN(float[] v);
	
	/** {@inheritDoc} */
	@Override
	IVec4WF addN(float value);
	
	/** {@inheritDoc} */
	@Override
	IVec4WF addN(float x, float y, float z, float w);

	IVec4WF sub(ITup4RF v);
	
	IVec4WF sub(ITupRF v);

	IVec4WF sub(float[] v);

	IVec4WF sub(float value);

	IVec4WF sub(float x, float y, float z, float w);
	
	/** {@inheritDoc} */
	@Override
	IVec4WF subN(ITup4RF v);
	
	/** {@inheritDoc} */
	@Override
	IVec4WF subN(ITupRF v);
	
	/** {@inheritDoc} */
	@Override
	IVec4WF subN(float[] v);
	
	/** {@inheritDoc} */
	@Override
	IVec4WF subN(float value);
	
	/** {@inheritDoc} */
	@Override
	IVec4WF subN(float x, float y, float z, float w);

	IVec4WF revSub(ITup4RF v);
	
	IVec4WF revSub(ITupRF v);

	IVec4WF revSub(float[] v);

	IVec4WF revSub(float value);

	IVec4WF revSub(float x, float y, float z, float w);
	
	/** {@inheritDoc} */
	@Override
	IVec4WF revSubN(ITup4RF v);
	
	/** {@inheritDoc} */
	@Override
	IVec4WF revSubN(ITupRF v);
	
	/** {@inheritDoc} */
	@Override
	IVec4WF revSubN(float[] v);
	
	/** {@inheritDoc} */
	@Override
	IVec4WF revSubN(float value);
	
	/** {@inheritDoc} */
	@Override
	IVec4WF revSubN(float x, float y, float z, float w);

	IVec4WF mul(ITup4RF v);
	
	IVec4WF mul(ITupRF v);

	IVec4WF mul(float[] v);

	IVec4WF mul(float value);

	IVec4WF mul(float x, float y, float z, float w);
	
	/** {@inheritDoc} */
	@Override
	IVec4WF mulN(ITup4RF v);
	
	/** {@inheritDoc} */
	@Override
	IVec4WF mulN(ITupRF v);
	
	/** {@inheritDoc} */
	@Override
	IVec4WF mulN(float[] v);
	
	/** {@inheritDoc} */
	@Override
	IVec4WF mulN(float value);
	
	/** {@inheritDoc} */
	@Override
	IVec4WF mulN(float x, float y, float z, float w);

	IVec4WF div(ITup4RF v);
	
	IVec4WF div(ITupRF v);

	IVec4WF div(float[] v);

	IVec4WF div(float value);

	IVec4WF div(float x, float y, float z, float w);
	
	/** {@inheritDoc} */
	@Override
	IVec4WF divN(ITup4RF v);
	
	/** {@inheritDoc} */
	@Override
	IVec4WF divN(ITupRF v);
	
	/** {@inheritDoc} */
	@Override
	IVec4WF divN(float[] v);
	
	/** {@inheritDoc} */
	@Override
	IVec4WF divN(float value);
	
	/** {@inheritDoc} */
	@Override
	IVec4WF divN(float x, float y, float z, float w);

	IVec4WF revDiv(ITup4RF v);
	
	IVec4WF revDiv(ITupRF v);

	IVec4WF revDiv(float[] v);
	
	IVec4WF revDiv(float value);

	IVec4WF revDiv(float x, float y, float z, float w);
	
	/** {@inheritDoc} */
	@Override
	IVec4WF revDivN(ITup4RF v);
	
	/** {@inheritDoc} */
	@Override
	IVec4WF revDivN(ITupRF v);
	
	/** {@inheritDoc} */
	@Override
	IVec4WF revDivN(float[] v);
	
	/** {@inheritDoc} */
	@Override
	IVec4WF revDivN(float value);
	
	/** {@inheritDoc} */
	@Override
	IVec4WF revDivN(float x, float y, float z, float w);
	
	IVec4WF negate();
	
	/** {@inheritDoc} */
	@Override
	IVec4WF negateN();

	IVec4WF reciprocal();
	
	/** {@inheritDoc} */
	@Override
	IVec4WF reciprocalN();

	IVec4WF normalize();
	
	/** {@inheritDoc} */
	@Override
	IVec4WF normalizeN();
	
	IVec4WF abs();
	
	/** {@inheritDoc} */
	@Override
	IVec4WF absN();

	IVec4WF signum();
	
	/** {@inheritDoc} */
	@Override
	IVec4WF signumN();
	
}
