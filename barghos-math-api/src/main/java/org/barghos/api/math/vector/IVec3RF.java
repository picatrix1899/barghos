package org.barghos.api.math.vector;

import org.barghos.annotation.ExtractionParam;
import org.barghos.api.core.collection.IndexValuePairF;
import org.barghos.api.core.function.floats.IFunc3F;
import org.barghos.api.core.tuple.floats.ITup3RF;
import org.barghos.api.core.tuple.floats.ITup3WF;
import org.barghos.api.core.tuple.floats.ITupRF;

/**
 * This interface provides non-invasive (read only) functions and methods for float vectors with two
 * dimensions.
 */
public interface IVec3RF extends ITup3RF
{	
	/**
	 * Returns the x component of the vector.
	 * 
	 * @return The x component.
	 */
	float x();
	
	/**
	 * Returns the y component of the vector.
	 * 
	 * @return The y component.
	 */
	float y();
	
	/**
	 * Returns the z component of the vector.
	 * 
	 * @return The z component.
	 */
	float z();

	float len();

	float lenEM(float tolerance);
	
	float lenEM4();
	
	float lenEM6();
	
	float lenEM8();

	float lenRc();
	
	float lenSq();
	
	float lenSqEM(float tolerance);
	
	float lenSqEM4();
	
	float lenSqEM6();
	
	float lenSqEM8();
	
	float lenTo(ITup3RF v);
	
	float lenTo(ITupRF v);
	
	float lenTo(float[] v);

	float lenTo(float x, float y, float z);
	
	float lenToEM(float tolerance, ITup3RF v);
	
	float lenToEM(float tolerance, ITupRF v);

	float lenToEM(float tolerance, float[] v);

	float lenToEM(float tolerance, float x, float y, float z);
	
	float lenToEM4(ITup3RF v);
	
	float lenToEM4(ITupRF v);

	float lenToEM4(float[] v);

	float lenToEM4(float x, float y, float z);
	
	float lenToEM6(ITup3RF v);
	
	float lenToEM6(ITupRF v);

	float lenToEM6(float[] v);

	float lenToEM6(float x, float y, float z);
	
	float lenToEM8(ITup3RF v);
	
	float lenToEM8(ITupRF v);

	float lenToEM8(float[] v);

	float lenToEM8(float x, float y, float z);
	
	float lenRcTo(ITup3RF v);
	
	float lenRcTo(ITupRF v);

	float lenRcTo(float[] v);

	float lenRcTo(float x, float y, float z);

	float lenSqTo(ITup3RF v);
	
	float lenSqTo(ITupRF v);

	float lenSqTo(float[] v);

	float lenSqTo(float x, float y, float z);

	float lenSqToEM(float tolerance, ITup3RF v);
	
	float lenSqToEM(float tolerance, ITupRF v);

	float lenSqToEM(float tolerance, float[] v);

	float lenSqToEM(float tolerance, float x, float y, float z);
	
	float lenSqToEM4(ITup3RF v);
	
	float lenSqToEM4(ITupRF v);

	float lenSqToEM4(float[] v);

	float lenSqToEM4(float x, float y, float z);
	
	float lenSqToEM6(ITup3RF v);
	
	float lenSqToEM6(ITupRF v);

	float lenSqToEM6(float[] v);

	float lenSqToEM6(float x, float y, float z);
	
	float lenSqToEM8(ITup3RF v);
	
	float lenSqToEM8(ITupRF v);

	float lenSqToEM8(float[] v);

	float lenSqToEM8(float x, float y, float z);
	
	float dot(ITup3RF v);
	
	float dot(ITupRF v);

	float dot(float[] v);

	float dot(float x, float y, float z);

	IVec3RF addN(ITup3RF v);
	
	IVec3RF addN(ITupRF v);

	IVec3RF addN(float[] v);

	IVec3RF addN(float value);

	IVec3RF addN(float x, float y, float z);

	float[] addT(ITup3RF v, @ExtractionParam float[] res);
	
	float[] addT(ITupRF v, @ExtractionParam float[] res);

	float[] addT(float[] v, @ExtractionParam float[] res);

	float[] addT(float value, @ExtractionParam float[] res);

	float[] addT(float x, float y, float z, @ExtractionParam float[] res);

	<T extends ITup3WF> T addT(ITup3RF v, @ExtractionParam T res);
	
	<T extends ITup3WF> T addT(ITupRF v, @ExtractionParam T res);

	<T extends ITup3WF> T addT(float[] v, @ExtractionParam T res);

	<T extends ITup3WF> T addT(float value, @ExtractionParam T res);

	<T extends ITup3WF> T addT(float x, float y, float z, @ExtractionParam T res);

	IVec3RF subN(ITup3RF v);
	
	IVec3RF subN(ITupRF v);

	IVec3RF subN(float[] v);

	IVec3RF subN(float value);

	IVec3RF subN(float x, float y, float z);

	float[] subT(ITup3RF v, @ExtractionParam float[] res);
	
	float[] subT(ITupRF v, @ExtractionParam float[] res);

	float[] subT(float[] v, @ExtractionParam float[] res);

	float[] subT(float value, @ExtractionParam float[] res);

	float[] subT(float x, float y, float z, @ExtractionParam float[] res);

	<T extends ITup3WF> T subT(ITup3RF v, @ExtractionParam T res);
	
	<T extends ITup3WF> T subT(ITupRF v, @ExtractionParam T res);

	<T extends ITup3WF> T subT(float[] v, @ExtractionParam T res);

	<T extends ITup3WF> T subT(float value, @ExtractionParam T res);

	<T extends ITup3WF> T subT(float x, float y, float z, @ExtractionParam T res);

	IVec3RF rSubN(ITup3RF v);
	
	IVec3RF rSubN(ITupRF v);

	IVec3RF rSubN(float[] v);

	IVec3RF rSubN(float value);

	IVec3RF rSubN(float x, float y, float z);

	float[] rSubT(ITup3RF v, @ExtractionParam float[] res);
	
	float[] rSubT(ITupRF v, @ExtractionParam float[] res);

	float[] rSubT(float[] v, @ExtractionParam float[] res);

	float[] rSubT(float value, @ExtractionParam float[] res);

	float[] rSubT(float x, float y, float z, @ExtractionParam float[] res);

	<T extends ITup3WF> T rSubT(ITup3RF v, @ExtractionParam T res);
	
	<T extends ITup3WF> T rSubT(ITupRF v, @ExtractionParam T res);

	<T extends ITup3WF> T rSubT(float[] v, @ExtractionParam T res);

	<T extends ITup3WF> T rSubT(float value, @ExtractionParam T res);

	<T extends ITup3WF> T rSubT(float x, float y, float z, @ExtractionParam T res);

	IVec3RF mulN(ITup3RF v);
	
	IVec3RF mulN(ITupRF v);

	IVec3RF mulN(float[] v);

	IVec3RF mulN(float value);

	IVec3RF mulN(float x, float y, float z);

	float[] mulT(ITup3RF v, @ExtractionParam float[] res);
	
	float[] mulT(ITupRF v, @ExtractionParam float[] res);

	float[] mulT(float[] v, @ExtractionParam float[] res);

	float[] mulT(float value, @ExtractionParam float[] res);

	float[] mulT(float x, float y, float z, @ExtractionParam float[] res);

	<T extends ITup3WF> T mulT(ITup3RF v, @ExtractionParam T res);
	
	<T extends ITup3WF> T mulT(ITupRF v, @ExtractionParam T res);

	<T extends ITup3WF> T mulT(float[] v, @ExtractionParam T res);

	<T extends ITup3WF> T mulT(float value, @ExtractionParam T res);
	
	<T extends ITup3WF> T mulT(float x, float y, float z, @ExtractionParam T res);

	IVec3RF divN(ITup3RF v);
	
	IVec3RF divN(ITupRF v);

	IVec3RF divN(float[] v);

	IVec3RF divN(float value);

	IVec3RF divN(float x, float y, float z);

	float[] divT(ITup3RF v, @ExtractionParam float[] res);
	
	float[] divT(ITupRF v, @ExtractionParam float[] res);

	float[] divT(float[] v, @ExtractionParam float[] res);

	float[] divT(float value, @ExtractionParam float[] res);

	float[] divT(float x, float y, float z, @ExtractionParam float[] res);

	<T extends ITup3WF> T divT(ITup3RF v, @ExtractionParam T res);
	
	<T extends ITup3WF> T divT(ITupRF v, @ExtractionParam T res);

	<T extends ITup3WF> T divT(float[] v, @ExtractionParam T res);

	<T extends ITup3WF> T divT(float value, @ExtractionParam T res);

	<T extends ITup3WF> T divT(float x, float y, float z, @ExtractionParam T res);

	IVec3RF rDivN(ITup3RF v);
	
	IVec3RF rDivN(ITupRF v);

	IVec3RF rDivN(float[] v);

	IVec3RF rDivN(float value);

	IVec3RF rDivN(float x, float y, float z);

	float[] rDivT(ITup3RF v, @ExtractionParam float[] res);
	
	float[] rDivT(ITupRF v, @ExtractionParam float[] res);

	float[] rDivT(float[] v, @ExtractionParam float[] res);

	float[] rDivT(float value, @ExtractionParam float[] res);

	float[] rDivT(float x, float y, float z, @ExtractionParam float[] res);

	<T extends ITup3WF> T rDivT(ITup3RF v, @ExtractionParam T res);
	
	<T extends ITup3WF> T rDivT(ITupRF v, @ExtractionParam T res);

	<T extends ITup3WF> T rDivT(float[] v, @ExtractionParam T res);

	<T extends ITup3WF> T rDivT(float value, @ExtractionParam T res);

	<T extends ITup3WF> T rDivT(float x, float y, float z, @ExtractionParam T res);

	IVec3RF vecToN(ITup3RF v);
	
	IVec3RF vecToN(ITupRF v);

	IVec3RF vecToN(float[] v);

	IVec3RF vecToN(float x, float y, float z);

	float[] vecToT(ITup3RF v, @ExtractionParam float[] res);
	
	float[] vecToT(ITupRF v, @ExtractionParam float[] res);

	float[] vecToT(float[] v, @ExtractionParam float[] res);

	float[] vecToT(float x, float y, float z, @ExtractionParam float[] res);
	
	<T extends ITup3WF> T vecToT(ITup3RF v, @ExtractionParam T res);
	
	<T extends ITup3WF> T vecToT(ITupRF v, @ExtractionParam T res);

	<T extends ITup3WF> T vecToT(float[] v, @ExtractionParam T res);

	<T extends ITup3WF> T vecToT(float x, float y, float z, @ExtractionParam T res);
	
	IVec3RF halfVecToN(ITup3RF v);
	
	IVec3RF halfVecToN(ITupRF v);

	IVec3RF halfVecToN(float[] v);

	IVec3RF halfVecToN(float x, float y, float z);

	float[] halfVecToT(ITup3RF v, @ExtractionParam float[] res);
	
	float[] halfVecToT(ITupRF v, @ExtractionParam float[] res);

	float[] halfVecToT(float[] v, @ExtractionParam float[] res);

	float[] halfVecToT(float x, float y, float z, @ExtractionParam float[] res);
	
	<T extends ITup3WF> T halfVecToT(ITup3RF v, @ExtractionParam T res);
	
	<T extends ITup3WF> T halfVecToT(ITupRF v, @ExtractionParam T res);

	<T extends ITup3WF> T halfVecToT(float[] v, @ExtractionParam T res);

	<T extends ITup3WF> T halfVecToT(float x, float y, float z, @ExtractionParam T res);

	IVec3RF midPointToN(ITup3RF v);
	
	IVec3RF midPointToN(ITupRF v);

	IVec3RF midPointToN(float[] v);

	IVec3RF midPointToN(float x, float y, float z);

	float[] midPointToT(ITup3RF v, @ExtractionParam float[] res);
	
	float[] midPointToT(ITupRF v, @ExtractionParam float[] res);

	float[] midPointToT(float[] v, @ExtractionParam float[] res);

	float[] midPointToT(float x, float y, float tzz, @ExtractionParam float[] res);

	<T extends ITup3WF> T midPointToT(ITup3RF v, @ExtractionParam T res);
	
	<T extends ITup3WF> T midPointToT(ITupRF v, @ExtractionParam T res);

	<T extends ITup3WF> T midPointToT(float[] v, @ExtractionParam T res);

	<T extends ITup3WF> T midPointToT(float x, float y, float z, @ExtractionParam T res);

	IVec3RF negN();

	float[] negT(@ExtractionParam float[] res);

	<T extends ITup3WF> T negT(@ExtractionParam T res);

	IVec3RF recN();

	float[] recT(@ExtractionParam float[] res);

	<T extends ITup3WF> T recT(@ExtractionParam T res);

	IVec3RF nrmN();

	float[] nrmT(@ExtractionParam float[] res);

	<T extends ITup3WF> T nrmT(@ExtractionParam T res);

	IVec3RF nrmNEM(float tolerance);

	float[] nrmTEM(float tolerance, @ExtractionParam float[] res);

	<T extends ITup3WF> T nrmTEM(float tolerance, @ExtractionParam T res);
	
	IVec3RF nrmNEM4();

	float[] nrmTEM4(@ExtractionParam float[] res);

	<T extends ITup3WF> T nrmTEM4(@ExtractionParam T res);
	
	IVec3RF nrmNEM6();

	float[] nrmTEM6(@ExtractionParam float[] res);

	<T extends ITup3WF> T nrmTEM6(@ExtractionParam T res);
	
	IVec3RF nrmNEM8();

	float[] nrmTEM8(@ExtractionParam float[] res);

	<T extends ITup3WF> T nrmTEM8(@ExtractionParam T res);
	
	IVec3RF projectN(ITup3RF t);
	
	IVec3RF projectN(ITupRF t);

	IVec3RF projectN(float[] t);

	IVec3RF projectN(float tX, float tY, float tZ);

	float[] projectT(ITup3RF t, @ExtractionParam float[] res);
	
	float[] projectT(ITupRF t, @ExtractionParam float[] res);

	float[] projectT(float[] t, @ExtractionParam float[] res);

	float[] projectT(float tX, float tY, float tZ, @ExtractionParam float[] res);

	<T extends ITup3WF> T projectT(ITup3RF t, @ExtractionParam T res);
	
	<T extends ITup3WF> T projectT(ITupRF t, @ExtractionParam T res);

	<T extends ITup3WF> T projectT(float[] t, @ExtractionParam T res);

	<T extends ITup3WF> T projectT(float tX, float tY, float tZ, @ExtractionParam T res);

	IVec3RF reflectN(ITup3RF n);
	
	IVec3RF reflectN(ITupRF n);

	IVec3RF reflectN(float[] n);

	IVec3RF reflectN(float nX, float nY, float nZ);

	float[] reflectT(ITup3RF n, @ExtractionParam float[] res);
	
	float[] reflectT(ITupRF n, @ExtractionParam float[] res);

	float[] reflectT(float[] n, @ExtractionParam float[] res);

	float[] reflectT(float nX, float nY, float nZ, @ExtractionParam float[] res);

	<T extends ITup3WF> T reflectT(ITup3RF n, @ExtractionParam T res);
	
	<T extends ITup3WF> T reflectT(ITupRF n, @ExtractionParam T res);

	<T extends ITup3WF> T reflectT(float[] n, @ExtractionParam T res);

	<T extends ITup3WF> T reflectT(float nX, float nY, float nZ, @ExtractionParam T res);

	IVec3RF absN();

	float[] absT(@ExtractionParam float[] res);

	<T extends ITup3WF> T absT(@ExtractionParam T res);

	IVec3RF signumN();

	float[] signumT(@ExtractionParam float[] res);

	<T extends ITup3WF> T signumT(@ExtractionParam T res);

	IVec3RF signumNEM(float tolerance);

	float[] signumTEM(float tolerance, @ExtractionParam float[] res);

	<T extends ITup3WF> T signumTEM(float tolerance, @ExtractionParam T res);
	
	IVec3RF signumNEM4();

	float[] signumTEM4(@ExtractionParam float[] res);

	<T extends ITup3WF> T signumTEM4(@ExtractionParam T res);
	
	IVec3RF signumNEM6();

	float[] signumTEM6(@ExtractionParam float[] res);

	<T extends ITup3WF> T signumTEM6(@ExtractionParam T res);
	
	IVec3RF signumNEM8();

	float[] signumTEM8(@ExtractionParam float[] res);

	<T extends ITup3WF> T signumTEM8(@ExtractionParam T res);
	
	IVec3RF swizzleN(int[] indices);

	float[] swizzleT(int[] indices, float[] res);
	
	<T extends ITup3WF> T swizzleT(int[] indices, T res);
	
	IVec3RF swizzleN(int indexX, int indexY, int indexZ);
	
	float[] swizzleT(int indexX, int indexY, int indexZ, float[] res);
	
	<T extends ITup3WF> T swizzleT(int indexX, int indexY, int indexZ, T res);
	
	IVec3RF swapN(int indexA, int indexB);
	
	float[] swapT(int indexA, int indexB, float[] res);
	
	<T extends ITup3WF> T swapT(int indexA, int indexB, T res);
	
	IVec3RF swapV0V1N();

	float[] swapV0V1T(float[] res);
	
	<T extends ITup3WF> T swapV0V1T(T res);

	IVec3RF swapV0V2N();

	float[] swapV0V2T(float[] res);
	
	<T extends ITup3WF> T swapV0V2T(T res);

	IVec3RF swapV1V2N();

	float[] swapV1V2T(float[] res);
	
	<T extends ITup3WF> T swapV1V2T(T res);

	IVec3RF swapXYN();

	<T extends ITup3WF> T swapXYT(T res);
	
	float[] swapXYT(float[] res);
	
	IVec3RF swapXZN();

	<T extends ITup3WF> T swapXZT(T res);
	
	float[] swapXZT(float[] res);
	
	IVec3RF swapYZN();
	
	<T extends ITup3WF> T swapYZT(T res);
	
	float[] swapYZT(float[] res);
	
	IVec3RF minComponentsN(ITup3RF v);
	
	IVec3RF minComponentsN(ITupRF v);
	
	IVec3RF minComponentsN(float[] v);
	
	IVec3RF minComponentsN(float x, float y, float z);

	float[] minComponentsT(ITup3RF v, @ExtractionParam float[] res);
	
	float[] minComponentsT(ITupRF v, @ExtractionParam float[] res);
	
	float[] minComponentsT(float[] v, @ExtractionParam float[] res);
	
	float[] minComponentsT(float x, float y, float z, @ExtractionParam float[] res);
	
	<T extends ITup3WF> T minComponentsT(ITup3RF v, @ExtractionParam T res);
	
	<T extends ITup3WF> T minComponentsT(ITupRF v, @ExtractionParam T res);
	
	<T extends ITup3WF> T minComponentsT(float[] v, @ExtractionParam T res);
	
	<T extends ITup3WF> T minComponentsT(float x, float y, float z, @ExtractionParam T res);
	
	<T> T minComponentsFunc(ITup3RF v, IFunc3F<T> func);
	
	<T> T minComponentsFunc(ITupRF v, IFunc3F<T> func);
	
	<T> T minComponentsFunc(float[] v, IFunc3F<T> func);
	
	<T> T minComponentsFunc(float x, float y, float z, IFunc3F<T> func);
	
	IVec3RF maxComponentsN(ITup3RF v);
	
	IVec3RF maxComponentsN(ITupRF v);
	
	IVec3RF maxComponentsN(float[] v);
	
	IVec3RF maxComponentsN(float x, float y, float z);

	float[] maxComponentsT(ITup3RF v, @ExtractionParam float[] res);
	
	float[] maxComponentsT(ITupRF v, @ExtractionParam float[] res);
	
	float[] maxComponentsT(float[] v, @ExtractionParam float[] res);
	
	float[] maxComponentsT(float x, float y, float z, @ExtractionParam float[] res);
	
	<T extends ITup3WF> T maxComponentsT(ITup3RF v, @ExtractionParam T res);
	
	<T extends ITup3WF> T maxComponentsT(ITupRF v, @ExtractionParam T res);
	
	<T extends ITup3WF> T maxComponentsT(float[] v, @ExtractionParam T res);
	
	<T extends ITup3WF> T maxComponentsT(float x, float y, float z, @ExtractionParam T res);
	
	<T> T maxComponentsFunc(ITup3RF v, IFunc3F<T> func);
	
	<T> T maxComponentsFunc(ITupRF v, IFunc3F<T> func);
	
	<T> T maxComponentsFunc(float[] v, IFunc3F<T> func);
	
	<T> T maxComponentsFunc(float x, float y, float z, IFunc3F<T> func);
	
	IndexValuePairF min();
	
	IndexValuePairF min(@ExtractionParam IndexValuePairF res);

	IndexValuePairF max();
	
	IndexValuePairF max(@ExtractionParam IndexValuePairF res);

	IVec3RF crossN(ITup3RF v);
	
	IVec3RF crossN(ITupRF v);
	
	IVec3RF crossN(float[] v);
	
	IVec3RF crossN(float x, float y, float z);
	
	float[] crossT(ITup3RF v, @ExtractionParam float[] res);
	
	float[] crossT(ITupRF v, @ExtractionParam float[] res);
	
	float[] crossT(float[] v, @ExtractionParam float[] res);
	
	float[] crossT(float x, float y, float z, @ExtractionParam float[] res);
	
	<T extends ITup3WF> T crossT(ITup3RF v, @ExtractionParam T res);
	
	<T extends ITup3WF> T crossT(ITupRF v, @ExtractionParam T res);
	
	<T extends ITup3WF> T crossT(float[] v, @ExtractionParam T res);
	
	<T extends ITup3WF> T crossT(float x, float y, float z, @ExtractionParam T res);
	
	IVec3RF rCrossN(ITup3RF v);
	
	IVec3RF rCrossN(ITupRF v);
	
	IVec3RF rCrossN(float[] v);
	
	IVec3RF rCrossN(float x, float y, float z);
	
	float[] rCrossT(ITup3RF v, @ExtractionParam float[] res);
	
	float[] rCrossT(ITupRF v, @ExtractionParam float[] res);
	
	float[] rCrossT(float[] v, @ExtractionParam float[] res);
	
	float[] rCrossT(float x, float y, float z, @ExtractionParam float[] res);
	
	<T extends ITup3WF> T rCrossT(ITup3RF v, @ExtractionParam T res);
	
	<T extends ITup3WF> T rCrossT(ITupRF v, @ExtractionParam T res);
	
	<T extends ITup3WF> T rCrossT(float[] v, @ExtractionParam T res);
	
	<T extends ITup3WF> T rCrossT(float x, float y, float z, @ExtractionParam T res);
}
