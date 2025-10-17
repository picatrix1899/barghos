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
	IVec2WF setAt(int index, float value);

	IVec2WF add(ITup2RF t);
	
	IVec2WF add(ITupRF t);

	IVec2WF add(float[] t);
	
	IVec2WF add(float t);

	IVec2WF add(float tX, float tY);
	
	/** {@inheritDoc} */
	@Override
	IVec2WF addN(ITup2RF t);
	
	/** {@inheritDoc} */
	@Override
	IVec2WF addN(ITupRF t);
	
	/** {@inheritDoc} */
	@Override
	IVec2WF addN(float[] t);
	
	/** {@inheritDoc} */
	@Override
	IVec2WF addN(float value);
	
	/** {@inheritDoc} */
	@Override
	IVec2WF addN(float tx, float ty);

	IVec2WF sub(ITup2RF t);
	
	IVec2WF sub(ITupRF t);

	IVec2WF sub(float[] t);

	IVec2WF sub(float value);

	IVec2WF sub(float tx, float ty);
	
	/** {@inheritDoc} */
	@Override
	IVec2WF subN(ITup2RF t);
	
	/** {@inheritDoc} */
	@Override
	IVec2WF subN(ITupRF t);
	
	/** {@inheritDoc} */
	@Override
	IVec2WF subN(float[] t);
	
	/** {@inheritDoc} */
	@Override
	IVec2WF subN(float value);
	
	/** {@inheritDoc} */
	@Override
	IVec2WF subN(float tx, float ty);

	IVec2WF rSub(ITup2RF t);
	
	IVec2WF rSub(ITupRF t);

	IVec2WF rSub(float[] t);

	IVec2WF rSub(float value);

	IVec2WF rSub(float tx, float ty);
	
	/** {@inheritDoc} */
	@Override
	IVec2WF rSubN(ITup2RF t);
	
	/** {@inheritDoc} */
	@Override
	IVec2WF rSubN(ITupRF t);
	
	/** {@inheritDoc} */
	@Override
	IVec2WF rSubN(float[] t);
	
	/** {@inheritDoc} */
	@Override
	IVec2WF rSubN(float value);
	
	/** {@inheritDoc} */
	@Override
	IVec2WF rSubN(float tx, float ty);

	IVec2WF mul(ITup2RF t);
	
	IVec2WF mul(ITupRF t);

	IVec2WF mul(float[] t);

	IVec2WF mul(float value);

	IVec2WF mul(float tx, float ty);
	
	/** {@inheritDoc} */
	@Override
	IVec2WF mulN(ITup2RF t);
	
	/** {@inheritDoc} */
	@Override
	IVec2WF mulN(ITupRF t);
	
	/** {@inheritDoc} */
	@Override
	IVec2WF mulN(float[] t);
	
	/** {@inheritDoc} */
	@Override
	IVec2WF mulN(float value);
	
	/** {@inheritDoc} */
	@Override
	IVec2WF mulN(float tx, float ty);

	IVec2WF div(ITup2RF t);
	
	IVec2WF div(ITupRF t);

	IVec2WF div(float[] t);
	
	IVec2WF div(float value);

	IVec2WF div(float tx, float ty);
	
	/** {@inheritDoc} */
	@Override
	IVec2WF divN(ITup2RF t);
	
	/** {@inheritDoc} */
	@Override
	IVec2WF divN(ITupRF t);
	
	/** {@inheritDoc} */
	@Override
	IVec2WF divN(float[] t);
	
	/** {@inheritDoc} */
	@Override
	IVec2WF divN(float value);
	
	/** {@inheritDoc} */
	@Override
	IVec2WF divN(float tx, float ty);

	IVec2WF rDiv(ITup2RF t);
	
	IVec2WF rDiv(ITupRF t);

	IVec2WF rDiv(float[] t);

	IVec2WF rDiv(float value);

	IVec2WF rDiv(float tx, float ty);
	
	/** {@inheritDoc} */
	@Override
	IVec2WF rDivN(ITup2RF t);
	
	/** {@inheritDoc} */
	@Override
	IVec2WF rDivN(ITupRF t);
	
	/** {@inheritDoc} */
	@Override
	IVec2WF rDivN(float[] t);
	
	/** {@inheritDoc} */
	@Override
	IVec2WF rDivN(float value);
	
	/** {@inheritDoc} */
	@Override
	IVec2WF rDivN(float tx, float ty);

	IVec2WF halfVecTo(ITup2RF t);
	
	IVec2WF halfVecTo(ITupRF t);

	IVec2WF halfVecTo(float[] t);

	IVec2WF halfVecTo(float tx, float ty);
	
	/** {@inheritDoc} */
	@Override
	IVec2WF halfVecToN(ITup2RF t);
	
	/** {@inheritDoc} */
	@Override
	IVec2WF halfVecToN(ITupRF t);
	
	/** {@inheritDoc} */
	@Override
	IVec2WF halfVecToN(float[] t);
	
	/** {@inheritDoc} */
	@Override
	IVec2WF halfVecToN(float tx, float ty);

	IVec2WF midPointTo(ITup2RF t);
	
	IVec2WF midPointTo(ITupRF t);

	IVec2WF midPointTo(float[] t);

	IVec2WF midPointTo(float tx, float ty);
	
	/** {@inheritDoc} */
	@Override
	IVec2WF midPointToN(ITup2RF t);
	
	/** {@inheritDoc} */
	@Override
	IVec2WF midPointToN(ITupRF t);
	
	/** {@inheritDoc} */
	@Override
	IVec2WF midPointToN(float[] t);
	
	/** {@inheritDoc} */
	@Override
	IVec2WF midPointToN(float tx, float ty);

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

	IVec2WF normalizeEM(float tolerance);
	
	/** {@inheritDoc} */
	@Override
	IVec2WF normalizeNEM(float tolerance);

	IVec2WF normalizeEM4();
	
	/** {@inheritDoc} */
	@Override
	IVec2WF normalizeNEM4();
	
	IVec2WF normalizeEM6();
	
	/** {@inheritDoc} */
	@Override
	IVec2WF normalizeNEM6();

	IVec2WF normalizeEM8();
	
	/** {@inheritDoc} */
	@Override
	IVec2WF normalizeNEM8();

	IVec2WF rotateRad(double angle);
	
	/** {@inheritDoc} */
	@Override
	IVec2WF rotateRadN(double angle);

	IVec2WF rotateDeg(double angle);
	
	/** {@inheritDoc} */
	@Override
	IVec2WF rotateDegN(double angle);
	
	IVec2WF project(ITup2RF t);
	
	IVec2WF project(ITupRF t);

	IVec2WF project(float[] t);

	IVec2WF project(float tx, float ty);
	
	/** {@inheritDoc} */
	@Override
	IVec2WF projectN(ITup2RF t);
	
	/** {@inheritDoc} */
	@Override
	IVec2WF projectN(ITupRF t);
	
	/** {@inheritDoc} */
	@Override
	IVec2WF projectN(float[] t);
	
	/** {@inheritDoc} */
	@Override
	IVec2WF projectN(float tx, float ty);

	IVec2WF reflect(ITup2RF n);
	
	IVec2WF reflect(ITupRF n);

	IVec2WF reflect(float[] n);

	IVec2WF reflect(float nx, float ny);
	
	/** {@inheritDoc} */
	@Override
	IVec2WF reflectN(ITup2RF n);
	
	IVec2WF reflectN(ITupRF n);
	
	/** {@inheritDoc} */
	@Override
	IVec2WF reflectN(float[] n);
	
	/** {@inheritDoc} */
	@Override
	IVec2WF reflectN(float nx, float ny);

	IVec2WF abs();
	
	/** {@inheritDoc} */
	@Override
	IVec2WF absN();

	IVec2WF signum();
	
	/** {@inheritDoc} */
	@Override
	IVec2WF signumN();

	IVec2WF signumEM(float tolerance);
	
	/** {@inheritDoc} */
	@Override
	IVec2WF signumNEM(float tolerance);

	IVec2WF signumEM4();
	
	/** {@inheritDoc} */
	@Override
	IVec2WF signumNEM4();

	IVec2WF signumEM6();
	
	/** {@inheritDoc} */
	@Override
	IVec2WF signumNEM6();

	IVec2WF signumEM8();
	
	/** {@inheritDoc} */
	@Override
	IVec2WF signumNEM8();
	
	/** {@inheritDoc} */
	IVec2WF swizzle(int[] indices);
	
	/** {@inheritDoc} */
	@Override
	IVec2WF swizzleN(int[] indices);
	
	/** {@inheritDoc} */
	IVec2WF swizzle(int indexX, int indexY);

	/** {@inheritDoc} */
	@Override
	IVec2WF swizzleN(int indexX, int indexY);
	
	/** {@inheritDoc} */
	IVec2WF swap(int indexA, int indexB);
	
	/** {@inheritDoc} */
	@Override
	IVec2WF swapN(int indexA, int indexB);
	
	/** {@inheritDoc} */
	IVec2WF swapV0V1();
	
	/** {@inheritDoc} */
	@Override
	IVec2WF swapV0V1N();
	
	IVec2WF swapXY();
	
	IVec2WF swapXYN();

	IVec2WF minComponents(ITup2RF t);
	
	IVec2WF minComponents(ITupRF t);
	
	IVec2WF minComponents(float[] t);
	
	IVec2WF minComponents(float tv0, float tv1);
	
	IVec2WF minComponentsN(ITup2RF t);
	
	IVec2WF minComponentsN(ITupRF t);
	
	IVec2WF minComponentsN(float[] t);
	
	IVec2WF minComponentsN(float tv0, float tv1);

	IVec2WF maxComponents(ITup2RF t);
	
	IVec2WF maxComponents(ITupRF t);
	
	IVec2WF maxComponents(float[] t);
	
	IVec2WF maxComponents(float tv0, float tv1);
	
	IVec2WF maxComponentsN(ITup2RF t);
	
	IVec2WF maxComponentsN(ITupRF t);
	
	IVec2WF maxComponentsN(float[] t);
	
	IVec2WF maxComponentsN(float tv0, float tv1);
}
