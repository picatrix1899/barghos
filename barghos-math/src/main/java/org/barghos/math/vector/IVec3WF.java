package org.barghos.math.vector;

import org.barghos.util.tuple.floats.ITup3RF;
import org.barghos.util.tuple.floats.ITup3WF;
import org.barghos.util.tuple.floats.ITupRF;

/**
 * This interface provides the common functions and methods for float vectors with two dimensions.
 */
public interface IVec3WF extends IVec3RF, ITup3WF
{
	
	/** {@inheritDoc} */
	IVec3WF createNew();
	
	/** {@inheritDoc} */
	@Override
	IVec3WF createNew(ITup3RF t);
	
	/** {@inheritDoc} */
	@Override
	IVec3WF createNew(ITupRF t);
	
	/** {@inheritDoc} */
	@Override
	IVec3WF createNew(float[] t);
	
	/** {@inheritDoc} */
	@Override
	IVec3WF createNew(float value);
	
	/** {@inheritDoc} */
	@Override
	IVec3WF createNew(float x, float y, float z);
	
	/** {@inheritDoc} */
	@Override
	IVec3WF copy();
	
	/** {@inheritDoc} */
	IVec3WF x(float x);
	
	/** {@inheritDoc} */
	IVec3WF y(float y);
	
	/** {@inheritDoc} */
	IVec3WF z(float z);
	
	/** {@inheritDoc} */
	@Override
	IVec3WF set(ITup3RF t);
	
	/** {@inheritDoc} */
	@Override
	IVec3WF set(ITupRF t);
	
	/** {@inheritDoc} */
	@Override
	IVec3WF set(float[] values);
	
	/** {@inheritDoc} */
	@Override
	IVec3WF set(float value);
	
	/** {@inheritDoc} */
	@Override
	IVec3WF set(float x, float y, float z);
	
	/** {@inheritDoc} */
	@Override
	IVec3WF setAt(int index, float value);

	IVec3WF add(ITup3RF t);
	
	IVec3WF add(ITupRF t);
	
	IVec3WF add(float[] t);

	IVec3WF add(float value);

	IVec3WF add(float tx, float ty, float tz);
	
	/** {@inheritDoc} */
	@Override
	IVec3WF addN(ITup3RF t);
	
	/** {@inheritDoc} */
	@Override
	IVec3WF addN(ITupRF t);
	
	/** {@inheritDoc} */
	@Override
	IVec3WF addN(float[] t);
	
	/** {@inheritDoc} */
	@Override
	IVec3WF addN(float value);
	
	/** {@inheritDoc} */
	@Override
	IVec3WF addN(float tx, float ty, float tz);

	IVec3WF sub(ITup3RF t);
	
	IVec3WF sub(ITupRF t);

	IVec3WF sub(float[] t);

	IVec3WF sub(float value);

	IVec3WF sub(float tx, float ty, float tz);
	
	/** {@inheritDoc} */
	@Override
	IVec3WF subN(ITup3RF t);
	
	/** {@inheritDoc} */
	@Override
	IVec3WF subN(ITupRF t);
	
	/** {@inheritDoc} */
	@Override
	IVec3WF subN(float[] t);
	
	/** {@inheritDoc} */
	@Override
	IVec3WF subN(float value);
	
	/** {@inheritDoc} */
	@Override
	IVec3WF subN(float tx, float ty, float tz);

	IVec3WF rSub(ITup3RF t);
	
	IVec3WF rSub(ITupRF t);

	IVec3WF rSub(float[] t);

	IVec3WF rSub(float value);

	IVec3WF rSub(float tx, float ty, float tz);
	
	/** {@inheritDoc} */
	@Override
	IVec3WF rSubN(ITup3RF t);
	
	/** {@inheritDoc} */
	@Override
	IVec3WF rSubN(ITupRF t);
	
	/** {@inheritDoc} */
	@Override
	IVec3WF rSubN(float[] t);
	
	/** {@inheritDoc} */
	@Override
	IVec3WF rSubN(float value);
	
	/** {@inheritDoc} */
	@Override
	IVec3WF rSubN(float tx, float ty, float tz);

	IVec3WF mul(ITup3RF t);
	
	IVec3WF mul(ITupRF t);

	IVec3WF mul(float[] t);

	IVec3WF mul(float value);

	IVec3WF mul(float tx, float ty, float tz);
	
	/** {@inheritDoc} */
	@Override
	IVec3WF mulN(ITup3RF t);
	
	/** {@inheritDoc} */
	@Override
	IVec3WF mulN(ITupRF t);
	
	/** {@inheritDoc} */
	@Override
	IVec3WF mulN(float[] t);
	
	/** {@inheritDoc} */
	@Override
	IVec3WF mulN(float value);
	
	/** {@inheritDoc} */
	@Override
	IVec3WF mulN(float tx, float ty, float tz);

	IVec3WF div(ITup3RF t);
	
	IVec3WF div(ITupRF t);

	IVec3WF div(float[] t);

	IVec3WF div(float value);

	IVec3WF div(float tx, float ty, float tz);
	
	/** {@inheritDoc} */
	@Override
	IVec3WF divN(ITup3RF t);
	
	/** {@inheritDoc} */
	@Override
	IVec3WF divN(ITupRF t);
	
	/** {@inheritDoc} */
	@Override
	IVec3WF divN(float[] t);
	
	/** {@inheritDoc} */
	@Override
	IVec3WF divN(float value);
	
	/** {@inheritDoc} */
	@Override
	IVec3WF divN(float tx, float ty, float tz);

	IVec3WF rDiv(ITup3RF t);
	
	IVec3WF rDiv(ITupRF t);

	IVec3WF rDiv(float[] t);
	
	IVec3WF rDiv(float value);

	IVec3WF rDiv(float tx, float ty, float tz);
	
	/** {@inheritDoc} */
	@Override
	IVec3WF rDivN(ITup3RF t);
	
	/** {@inheritDoc} */
	@Override
	IVec3WF rDivN(ITupRF t);
	
	/** {@inheritDoc} */
	@Override
	IVec3WF rDivN(float[] t);
	
	/** {@inheritDoc} */
	@Override
	IVec3WF rDivN(float value);
	
	/** {@inheritDoc} */
	@Override
	IVec3WF rDivN(float tx, float ty, float tz);

	IVec3WF halfVecTo(ITup3RF t);
	
	IVec3WF halfVecTo(ITupRF t);

	IVec3WF halfVecTo(float[] t);

	IVec3WF halfVecTo(float tx, float ty, float tz);
	
	/** {@inheritDoc} */
	@Override
	IVec3WF halfVecToN(ITup3RF t);
	
	/** {@inheritDoc} */
	@Override
	IVec3WF halfVecToN(ITupRF t);
	
	/** {@inheritDoc} */
	@Override
	IVec3WF halfVecToN(float[] t);
	
	/** {@inheritDoc} */
	@Override
	IVec3WF halfVecToN(float tx, float ty, float tz);

	IVec3WF midPointTo(ITup3RF t);
	
	IVec3WF midPointTo(ITupRF t);

	IVec3WF midPointTo(float[] t);

	IVec3WF midPointTo(float tx, float ty, float tz);
	
	/** {@inheritDoc} */
	@Override
	IVec3WF midPointToN(ITup3RF t);
	
	/** {@inheritDoc} */
	@Override
	IVec3WF midPointToN(ITupRF t);
	
	/** {@inheritDoc} */
	@Override
	IVec3WF midPointToN(float[] t);
	
	/** {@inheritDoc} */
	@Override
	IVec3WF midPointToN(float tx, float ty, float tz);

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

	IVec3WF project(float tx, float ty, float tz);
	
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
	IVec3WF projectN(float tx, float ty, float tz);

	IVec3WF reflect(ITup3RF n);
	
	IVec3WF reflect(ITupRF n);

	IVec3WF reflect(float[] n);

	IVec3WF reflect(float nx, float ny, float nz);
	
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
	IVec3WF reflectN(float nx, float ny, float nz);

	IVec3WF abs();
	
	/** {@inheritDoc} */
	@Override
	IVec3WF absN();

	IVec3WF sign();
	
	/** {@inheritDoc} */
	@Override
	IVec3WF signN();
	
	/** {@inheritDoc} */
	@Override
	IVec3WF arrange(int[] indices);
	
	/** {@inheritDoc} */
	@Override
	IVec3WF arrangeN(int[] indices);
	
	/** {@inheritDoc} */
	@Override
	IVec3WF arrange(int indexX, int indexY, int indexZ);

	/** {@inheritDoc} */
	@Override
	IVec3WF arrangeN(int indexX, int indexY, int indexZ);
	
	/** {@inheritDoc} */
	@Override
	IVec3WF swizzle(int indexA, int indexB);
	
	/** {@inheritDoc} */
	@Override
	IVec3WF swizzleN(int indexA, int indexB);
	
	/** {@inheritDoc} */
	@Override
	IVec3WF swizzleV0V1();
	
	/** {@inheritDoc} */
	@Override
	IVec3WF swizzleV0V2();
	
	/** {@inheritDoc} */
	@Override
	IVec3WF swizzleV1V2();
	
	/** {@inheritDoc} */
	@Override
	IVec3WF swizzleV0V1N();
	
	/** {@inheritDoc} */
	@Override
	IVec3WF swizzleV0V2N();
	
	/** {@inheritDoc} */
	@Override
	IVec3WF swizzleV1V2N();
	
	IVec3WF swizzleXY();
	
	IVec3WF swizzleXZ();
	
	IVec3WF swizzleYZ();
	
	/** {@inheritDoc} */
	@Override
	IVec3WF swizzleXYN();
	
	/** {@inheritDoc} */
	@Override
	IVec3WF swizzleXZN();
	
	/** {@inheritDoc} */
	@Override
	IVec3WF swizzleYZN();

	IVec3WF minComponents(ITup3RF t);
	
	IVec3WF minComponents(ITupRF t);
	
	IVec3WF minComponents(float[] t);
	
	IVec3WF minComponents(float tv0, float tv1, float tv2);
	
	/** {@inheritDoc} */
	@Override
	IVec3WF minComponentsN(ITup3RF t);
	
	/** {@inheritDoc} */
	@Override
	IVec3WF minComponentsN(ITupRF t);
	
	/** {@inheritDoc} */
	@Override
	IVec3WF minComponentsN(float[] t);
	
	/** {@inheritDoc} */
	@Override
	IVec3WF minComponentsN(float tv0, float tv1, float tv2);

	IVec3WF maxComponents(ITup3RF t);
	
	IVec3WF maxComponents(ITupRF t);
	
	IVec3WF maxComponents(float[] t);
	
	IVec3WF maxComponents(float tv0, float tv1, float tv2);
	
	/** {@inheritDoc} */
	@Override
	IVec3WF maxComponentsN(ITup3RF t);
	
	/** {@inheritDoc} */
	@Override
	IVec3WF maxComponentsN(ITupRF t);
	
	/** {@inheritDoc} */
	@Override
	IVec3WF maxComponentsN(float[] t);
	
	/** {@inheritDoc} */
	@Override
	IVec3WF maxComponentsN(float tv0, float tv1, float tv2);
	
	IVec3WF cross(ITup3RF t);
	
	IVec3WF cross(ITupRF t);
	
	IVec3WF cross(float[] t);
	
	IVec3WF cross(float tv0, float tv1, float tv2);
	
	/** {@inheritDoc} */
	@Override
	IVec3WF crossN(ITup3RF t);
	
	/** {@inheritDoc} */
	@Override
	IVec3WF crossN(ITupRF t);
	
	/** {@inheritDoc} */
	@Override
	IVec3WF crossN(float[] t);
	
	/** {@inheritDoc} */
	@Override
	IVec3WF crossN(float tv0, float tv1, float tv2);
	
	IVec3WF rCross(ITup3RF t);
	
	IVec3WF rCross(ITupRF t);
	
	IVec3WF rCross(float[] t);
	
	IVec3WF rCross(float tv0, float tv1, float tv2);
	
	/** {@inheritDoc} */
	@Override
	IVec3WF rCrossN(ITup3RF t);
	
	/** {@inheritDoc} */
	@Override
	IVec3WF rCrossN(ITupRF t);
	
	/** {@inheritDoc} */
	@Override
	IVec3WF rCrossN(float[] t);
	
	/** {@inheritDoc} */
	@Override
	IVec3WF rCrossN(float tv0, float tv1, float tv2);
}
