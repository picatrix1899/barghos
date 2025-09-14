package org.barghos.impl.math.vector;

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
	IVec3WF setAt(int index, float value);

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

	IVec3WF rSub(ITup3RF v);
	
	IVec3WF rSub(ITupRF v);

	IVec3WF rSub(float[] v);

	IVec3WF rSub(float value);

	IVec3WF rSub(float x, float y, float z);
	
	/** {@inheritDoc} */
	@Override
	IVec3WF rSubN(ITup3RF v);
	
	/** {@inheritDoc} */
	@Override
	IVec3WF rSubN(ITupRF v);
	
	/** {@inheritDoc} */
	@Override
	IVec3WF rSubN(float[] v);
	
	/** {@inheritDoc} */
	@Override
	IVec3WF rSubN(float value);
	
	/** {@inheritDoc} */
	@Override
	IVec3WF rSubN(float x, float y, float z);

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

	IVec3WF rDiv(ITup3RF v);
	
	IVec3WF rDiv(ITupRF v);

	IVec3WF rDiv(float[] v);
	
	IVec3WF rDiv(float value);

	IVec3WF rDiv(float x, float y, float z);
	
	/** {@inheritDoc} */
	@Override
	IVec3WF rDivN(ITup3RF v);
	
	/** {@inheritDoc} */
	@Override
	IVec3WF rDivN(ITupRF v);
	
	/** {@inheritDoc} */
	@Override
	IVec3WF rDivN(float[] v);
	
	/** {@inheritDoc} */
	@Override
	IVec3WF rDivN(float value);
	
	/** {@inheritDoc} */
	@Override
	IVec3WF rDivN(float x, float y, float z);

	IVec3WF vecTo(ITup3RF v);
	
	IVec3WF vecTo(ITupRF v);

	IVec3WF vecTo(float[] v);

	IVec3WF vecTo(float x, float y, float z);
	
	/** {@inheritDoc} */
	@Override
	IVec3WF vecToN(ITup3RF v);
	
	/** {@inheritDoc} */
	@Override
	IVec3WF vecToN(ITupRF v);

	/** {@inheritDoc} */
	@Override
	IVec3WF vecToN(float[] v);

	/** {@inheritDoc} */
	@Override
	IVec3WF vecToN(float x, float y, float z);
	
	IVec3WF halfVecTo(ITup3RF v);
	
	IVec3WF halfVecTo(ITupRF v);

	IVec3WF halfVecTo(float[] v);

	IVec3WF halfVecTo(float x, float y, float z);
	
	/** {@inheritDoc} */
	@Override
	IVec3WF halfVecToN(ITup3RF v);
	
	/** {@inheritDoc} */
	@Override
	IVec3WF halfVecToN(ITupRF v);
	
	/** {@inheritDoc} */
	@Override
	IVec3WF halfVecToN(float[] v);
	
	/** {@inheritDoc} */
	@Override
	IVec3WF halfVecToN(float x, float y, float z);

	IVec3WF midPointTo(ITup3RF v);
	
	IVec3WF midPointTo(ITupRF v);

	IVec3WF midPointTo(float[] v);

	IVec3WF midPointTo(float x, float y, float z);
	
	/** {@inheritDoc} */
	@Override
	IVec3WF midPointToN(ITup3RF v);
	
	/** {@inheritDoc} */
	@Override
	IVec3WF midPointToN(ITupRF v);
	
	/** {@inheritDoc} */
	@Override
	IVec3WF midPointToN(float[] v);
	
	/** {@inheritDoc} */
	@Override
	IVec3WF midPointToN(float x, float y, float z);

	IVec3WF neg();
	
	/** {@inheritDoc} */
	@Override
	IVec3WF negN();

	IVec3WF rec();
	
	/** {@inheritDoc} */
	@Override
	IVec3WF recN();

	IVec3WF nrm();
	
	/** {@inheritDoc} */
	@Override
	IVec3WF nrmN();

	IVec3WF project(ITup3RF t);
	
	IVec3WF project(ITupRF t);

	IVec3WF project(float[] t);

	IVec3WF project(float tX, float tY, float tZ);
	
	/** {@inheritDoc} */
	@Override
	IVec3WF projectN(ITup3RF t);
	
	/** {@inheritDoc} */
	@Override
	IVec3WF projectN(ITupRF t);
	
	/** {@inheritDoc} */
	@Override
	IVec3WF projectN(float[] t);
	
	/** {@inheritDoc} */
	@Override
	IVec3WF projectN(float tX, float tY, float tZ);

	IVec3WF reflect(ITup3RF n);
	
	IVec3WF reflect(ITupRF n);

	IVec3WF reflect(float[] n);

	IVec3WF reflect(float nX, float nY, float nZ);
	
	/** {@inheritDoc} */
	@Override
	IVec3WF reflectN(ITup3RF n);
	
	/** {@inheritDoc} */
	@Override
	IVec3WF reflectN(ITupRF n);
	
	/** {@inheritDoc} */
	@Override
	IVec3WF reflectN(float[] n);
	
	/** {@inheritDoc} */
	@Override
	IVec3WF reflectN(float nX, float nY, float nZ);

	IVec3WF abs();
	
	/** {@inheritDoc} */
	@Override
	IVec3WF absN();

	IVec3WF sign();
	
	/** {@inheritDoc} */
	@Override
	IVec3WF signN();
	
	IVec3WF swizzle(int[] indices);
	
	/** {@inheritDoc} */
	@Override
	IVec3WF swizzleN(int[] indices);
	
	IVec3WF swizzle(int indexX, int indexY, int indexZ);

	/** {@inheritDoc} */
	@Override
	IVec3WF swizzleN(int indexX, int indexY, int indexZ);
	
	IVec3WF swap(int indexA, int indexB);
	
	/** {@inheritDoc} */
	@Override
	IVec3WF swapN(int indexA, int indexB);
	
	IVec3WF swapV0V1();
	
	IVec3WF swapV0V2();
	
	IVec3WF swapV1V2();
	
	/** {@inheritDoc} */
	@Override
	IVec3WF swapV0V1N();
	
	/** {@inheritDoc} */
	@Override
	IVec3WF swapV0V2N();
	
	/** {@inheritDoc} */
	@Override
	IVec3WF swapV1V2N();
	
	IVec3WF swapXY();
	
	IVec3WF swapXZ();
	
	IVec3WF swapYZ();
	
	/** {@inheritDoc} */
	@Override
	IVec3WF swapXYN();
	
	/** {@inheritDoc} */
	@Override
	IVec3WF swapXZN();
	
	/** {@inheritDoc} */
	@Override
	IVec3WF swapYZN();

	IVec3WF minComponents(ITup3RF v);
	
	IVec3WF minComponents(ITupRF v);
	
	IVec3WF minComponents(float[] v);
	
	IVec3WF minComponents(float x, float y, float z);
	
	/** {@inheritDoc} */
	@Override
	IVec3WF minComponentsN(ITup3RF v);
	
	/** {@inheritDoc} */
	@Override
	IVec3WF minComponentsN(ITupRF v);
	
	/** {@inheritDoc} */
	@Override
	IVec3WF minComponentsN(float[] v);
	
	/** {@inheritDoc} */
	@Override
	IVec3WF minComponentsN(float x, float y, float z);

	IVec3WF maxComponents(ITup3RF v);
	
	IVec3WF maxComponents(ITupRF v);
	
	IVec3WF maxComponents(float[] v);
	
	IVec3WF maxComponents(float x, float y, float z);
	
	/** {@inheritDoc} */
	@Override
	IVec3WF maxComponentsN(ITup3RF v);
	
	/** {@inheritDoc} */
	@Override
	IVec3WF maxComponentsN(ITupRF v);
	
	/** {@inheritDoc} */
	@Override
	IVec3WF maxComponentsN(float[] v);
	
	/** {@inheritDoc} */
	@Override
	IVec3WF maxComponentsN(float x, float y, float z);
	
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
	
	IVec3WF rCross(ITup3RF v);
	
	IVec3WF rCross(ITupRF v);
	
	IVec3WF rCross(float[] v);
	
	IVec3WF rCross(float x, float y, float z);
	
	/** {@inheritDoc} */
	@Override
	IVec3WF rCrossN(ITup3RF v);
	
	/** {@inheritDoc} */
	@Override
	IVec3WF rCrossN(ITupRF v);
	
	/** {@inheritDoc} */
	@Override
	IVec3WF rCrossN(float[] v);
	
	/** {@inheritDoc} */
	@Override
	IVec3WF rCrossN(float x, float y, float z);
}
