package org.barghos.math.vector;

import org.barghos.annotation.ExtractionParam;
import org.barghos.util.collection.IndexValuePairF;
import org.barghos.util.tuple.floats.ITup3RF;
import org.barghos.util.tuple.floats.ITup3WF;
import org.barghos.util.tuple.floats.ITupRF;

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

	float len(float tolerance);

	float lenRc();
	
	float lenSq();
	
	float lenTo(ITup3RF t);
	
	float lenTo(ITupRF t);
	
	float lenTo(float[] t);

	float lenTo(float tx, float ty, float tz);
	
	float lenTo(float tolerance, ITup3RF t);
	
	float lenTo(float tolerance, ITupRF t);

	float lenTo(float tolerance, float[] t);

	float lenTo(float tolerance, float tx, float ty, float tz);
	
	float lenRcTo(ITup3RF t);
	
	float lenRcTo(ITupRF t);

	float lenRcTo(float[] t);

	float lenRcTo(float tx, float ty, float tz);

	float lenSqTo(ITup3RF t);
	
	float lenSqTo(ITupRF t);

	float lenSqTo(float[] t);

	float lenSqTo(float tx, float ty, float tz);

	float dot(ITup3RF t);
	
	float dot(ITupRF t);

	float dot(float[] t);

	float dot(float tx, float ty,float tz);

	IVec3RF addN(ITup3RF t);
	
	IVec3RF addN(ITupRF t);

	IVec3RF addN(float[] t);

	IVec3RF addN(float value);

	IVec3RF addN(float tx, float ty, float tz);

	float[] addT(ITup3RF t, @ExtractionParam float[] res);
	
	float[] addT(ITupRF t, @ExtractionParam float[] res);

	float[] addT(float[] t, @ExtractionParam float[] res);

	float[] addT(float value, @ExtractionParam float[] res);

	float[] addT(float tx, float ty, float tz, @ExtractionParam float[] res);

	<T extends ITup3WF> T addT(ITup3RF t, @ExtractionParam T res);
	
	<T extends ITup3WF> T addT(ITupRF t, @ExtractionParam T res);

	<T extends ITup3WF> T addT(float[] t, @ExtractionParam T res);

	<T extends ITup3WF> T addT(float value, @ExtractionParam T res);

	<T extends ITup3WF> T addT(float tx, float ty, float tz, @ExtractionParam T res);

	IVec3RF subN(ITup3RF t);
	
	IVec3RF subN(ITupRF t);

	IVec3RF subN(float[] t);

	IVec3RF subN(float value);

	IVec3RF subN(float tx, float ty, float tz);

	float[] subT(ITup3RF t, @ExtractionParam float[] res);
	
	float[] subT(ITupRF t, @ExtractionParam float[] res);

	float[] subT(float[] t, @ExtractionParam float[] res);

	float[] subT(float value, @ExtractionParam float[] res);

	float[] subT(float tx, float ty, float tz, @ExtractionParam float[] res);

	<T extends ITup3WF> T subT(ITup3RF t, @ExtractionParam T res);
	
	<T extends ITup3WF> T subT(ITupRF t, @ExtractionParam T res);

	<T extends ITup3WF> T subT(float[] t, @ExtractionParam T res);

	<T extends ITup3WF> T subT(float value, @ExtractionParam T res);

	<T extends ITup3WF> T subT(float tx, float ty, float tz, @ExtractionParam T res);

	IVec3RF rSubN(ITup3RF t);
	
	IVec3RF rSubN(ITupRF t);

	IVec3RF rSubN(float[] t);

	IVec3RF rSubN(float value);

	IVec3RF rSubN(float tx, float ty, float tz);

	float[] rSubT(ITup3RF t, @ExtractionParam float[] res);
	
	float[] rSubT(ITupRF t, @ExtractionParam float[] res);

	float[] rSubT(float[] t, @ExtractionParam float[] res);

	float[] rSubT(float value, @ExtractionParam float[] res);

	float[] rSubT(float tx, float ty, float tz, @ExtractionParam float[] res);

	<T extends ITup3WF> T rSubT(ITup3RF t, @ExtractionParam T res);
	
	<T extends ITup3WF> T rSubT(ITupRF t, @ExtractionParam T res);

	<T extends ITup3WF> T rSubT(float[] t, @ExtractionParam T res);

	<T extends ITup3WF> T rSubT(float value, @ExtractionParam T res);

	<T extends ITup3WF> T rSubT(float tx, float ty, float tz, @ExtractionParam T res);

	IVec3RF mulN(ITup3RF t);
	
	IVec3RF mulN(ITupRF t);

	IVec3RF mulN(float[] t);

	IVec3RF mulN(float value);

	IVec3RF mulN(float tx, float ty, float tz);

	float[] mulT(ITup3RF t, @ExtractionParam float[] res);
	
	float[] mulT(ITupRF t, @ExtractionParam float[] res);

	float[] mulT(float[] t, @ExtractionParam float[] res);

	float[] mulT(float value, @ExtractionParam float[] res);

	float[] mulT(float tx, float ty, float tz, @ExtractionParam float[] res);

	<T extends ITup3WF> T mulT(ITup3RF t, @ExtractionParam T res);
	
	<T extends ITup3WF> T mulT(ITupRF t, @ExtractionParam T res);

	<T extends ITup3WF> T mulT(float[] t, @ExtractionParam T res);

	<T extends ITup3WF> T mulT(float value, @ExtractionParam T res);
	
	<T extends ITup3WF> T mulT(float tx, float ty, float tz, @ExtractionParam T res);

	IVec3RF divN(ITup3RF t);
	
	IVec3RF divN(ITupRF t);

	IVec3RF divN(float[] t);

	IVec3RF divN(float value);

	IVec3RF divN(float tx, float ty, float tz);

	float[] divT(ITup3RF t, @ExtractionParam float[] res);
	
	float[] divT(ITupRF t, @ExtractionParam float[] res);

	float[] divT(float[] t, @ExtractionParam float[] res);

	float[] divT(float value, @ExtractionParam float[] res);

	float[] divT(float tx, float ty, float tz, @ExtractionParam float[] res);

	<T extends ITup3WF> T divT(ITup3RF t, @ExtractionParam T res);
	
	<T extends ITup3WF> T divT(ITupRF t, @ExtractionParam T res);

	<T extends ITup3WF> T divT(float[] t, @ExtractionParam T res);

	<T extends ITup3WF> T divT(float value, @ExtractionParam T res);

	<T extends ITup3WF> T divT(float tx, float ty, float tz, @ExtractionParam T res);

	IVec3RF rDivN(ITup3RF t);
	
	IVec3RF rDivN(ITupRF t);

	IVec3RF rDivN(float[] t);

	IVec3RF rDivN(float value);

	IVec3RF rDivN(float tx, float ty, float tz);

	float[] rDivT(ITup3RF t, @ExtractionParam float[] res);
	
	float[] rDivT(ITupRF t, @ExtractionParam float[] res);

	float[] rDivT(float[] t, @ExtractionParam float[] res);

	float[] rDivT(float value, @ExtractionParam float[] res);

	float[] rDivT(float tx, float ty, float tz, @ExtractionParam float[] res);

	<T extends ITup3WF> T rDivT(ITup3RF t, @ExtractionParam T res);
	
	<T extends ITup3WF> T rDivT(ITupRF t, @ExtractionParam T res);

	<T extends ITup3WF> T rDivT(float[] t, @ExtractionParam T res);

	<T extends ITup3WF> T rDivT(float value, @ExtractionParam T res);

	<T extends ITup3WF> T rDivT(float tx, float ty, float tz, @ExtractionParam T res);

	IVec3RF halfVecToN(ITup3RF t);
	
	IVec3RF halfVecToN(ITupRF t);

	IVec3RF halfVecToN(float[] t);

	IVec3RF halfVecToN(float tx, float ty, float tz);

	float[] halfVecToT(ITup3RF t, @ExtractionParam float[] res);
	
	float[] halfVecToT(ITupRF t, @ExtractionParam float[] res);

	float[] halfVecToT(float[] t, @ExtractionParam float[] res);

	float[] halfVecToT(float tx, float ty, float tz, @ExtractionParam float[] res);
	
	<T extends ITup3WF> T halfVecToT(ITup3RF t, @ExtractionParam T res);
	
	<T extends ITup3WF> T halfVecToT(ITupRF t, @ExtractionParam T res);

	<T extends ITup3WF> T halfVecToT(float[] t, @ExtractionParam T res);

	<T extends ITup3WF> T halfVecToT(float tx, float ty, float tz, @ExtractionParam T res);

	IVec3RF midPointToN(ITup3RF t);
	
	IVec3RF midPointToN(ITupRF t);

	IVec3RF midPointToN(float[] t);

	IVec3RF midPointToN(float tx, float ty, float tz);

	float[] midPointToT(ITup3RF t, @ExtractionParam float[] res);
	
	float[] midPointToT(ITupRF t, @ExtractionParam float[] res);

	float[] midPointToT(float[] t, @ExtractionParam float[] res);

	float[] midPointToT(float tx, float ty, float tz, @ExtractionParam float[] res);

	<T extends ITup3WF> T midPointToT(ITup3RF t, @ExtractionParam T res);
	
	<T extends ITup3WF> T midPointToT(ITupRF t, @ExtractionParam T res);

	<T extends ITup3WF> T midPointToT(float[] t, @ExtractionParam T res);

	<T extends ITup3WF> T midPointToT(float tx, float ty, float tz, @ExtractionParam T res);

	IVec3RF negN();

	float[] negT(@ExtractionParam float[] res);

	<T extends ITup3WF> T negT(@ExtractionParam T res);

	IVec3RF recN();

	float[] recT(@ExtractionParam float[] res);

	<T extends ITup3WF> T recT(@ExtractionParam T res);

	IVec3RF nrmN();

	float[] nrmT(@ExtractionParam float[] res);

	<T extends ITup3WF> T nrmT(@ExtractionParam T res);

	IVec3RF projectN(ITup3RF t);
	
	IVec3RF projectN(ITupRF t);

	IVec3RF projectN(float[] t);

	IVec3RF projectN(float tx, float ty, float tz);

	float[] projectT(ITup3RF t, @ExtractionParam float[] res);
	
	float[] projectT(ITupRF t, @ExtractionParam float[] res);

	float[] projectT(float[] t, @ExtractionParam float[] res);

	float[] projectT(float tx, float ty, float tz, @ExtractionParam float[] res);

	<T extends ITup3WF> T projectT(ITup3RF t, @ExtractionParam T res);
	
	<T extends ITup3WF> T projectT(ITupRF t, @ExtractionParam T res);

	<T extends ITup3WF> T projectT(float[] t, @ExtractionParam T res);

	<T extends ITup3WF> T projectT(float tx, float ty, float tz, @ExtractionParam T res);

	IVec3RF reflectN(ITup3RF n);
	
	IVec3RF reflectN(ITupRF n);

	IVec3RF reflectN(float[] n);

	IVec3RF reflectN(float nx, float ny, float nz);

	float[] reflectT(ITup3RF n, @ExtractionParam float[] res);
	
	float[] reflectT(ITupRF n, @ExtractionParam float[] res);

	float[] reflectT(float[] n, @ExtractionParam float[] res);

	float[] reflectT(float nx, float ny, float nz, @ExtractionParam float[] res);

	<T extends ITup3WF> T reflectT(ITup3RF n, @ExtractionParam T res);
	
	<T extends ITup3WF> T reflectT(ITupRF n, @ExtractionParam T res);

	<T extends ITup3WF> T reflectT(float[] n, @ExtractionParam T res);

	<T extends ITup3WF> T reflectT(float nx, float ny, float nz, @ExtractionParam T res);

	IVec3RF absN();

	float[] absT(@ExtractionParam float[] res);

	<T extends ITup3WF> T absT(@ExtractionParam T res);

	IVec3RF signN();

	float[] signT(@ExtractionParam float[] res);

	<T extends ITup3WF> T signT(@ExtractionParam T res);

	IVec3RF swizzleN(int[] indices);

	float[] swizzleT(int[] indices, float[] res);
	
	<T extends ITup3WF> T swizzleT(int[] indices, T res);
	
	IVec3RF swizzleN(int indexX, int indexY, int indexZ);
	
	float[] swizzleT(int i0, int i1, int i2, float[] res);
	
	<T extends ITup3WF> T swizzleT(int i0, int i1, int i2, T res);
	
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
	
	IVec3RF minComponentsN(ITup3RF t);
	
	IVec3RF minComponentsN(ITupRF t);
	
	IVec3RF minComponentsN(float[] t);
	
	IVec3RF minComponentsN(float tv0, float tv1, float tv2);

	float[] minComponentsT(ITup3RF t, @ExtractionParam float[] res);
	
	float[] minComponentsT(ITupRF t, @ExtractionParam float[] res);
	
	float[] minComponentsT(float[] t, @ExtractionParam float[] res);
	
	float[] minComponentsT(float tv0, float tv1, float tv2, @ExtractionParam float[] res);
	
	<T extends ITup3WF> T minComponentsT(ITup3RF t, @ExtractionParam T res);
	
	<T extends ITup3WF> T minComponentsT(ITupRF t, @ExtractionParam T res);
	
	<T extends ITup3WF> T minComponentsT(float[] t, @ExtractionParam T res);
	
	<T extends ITup3WF> T minComponentsT(float tv0, float tv1, float tv2, @ExtractionParam T res);
	
	IVec3RF maxComponentsN(ITup3RF t);
	
	IVec3RF maxComponentsN(ITupRF t);
	
	IVec3RF maxComponentsN(float[] t);
	
	IVec3RF maxComponentsN(float tv0, float tv1, float tv2);

	float[] maxComponentsT(ITup3RF t, @ExtractionParam float[] res);
	
	float[] maxComponentsT(ITupRF t, @ExtractionParam float[] res);
	
	float[] maxComponentsT(float[] t, @ExtractionParam float[] res);
	
	float[] maxComponentsT(float tv0, float tv1, float tv2, @ExtractionParam float[] res);
	
	<T extends ITup3WF> T maxComponentsT(ITup3RF t, @ExtractionParam T res);
	
	<T extends ITup3WF> T maxComponentsT(ITupRF t, @ExtractionParam T res);
	
	<T extends ITup3WF> T maxComponentsT(float[] t, @ExtractionParam T res);
	
	<T extends ITup3WF> T maxComponentsT(float tv0, float tv1, float tv2, @ExtractionParam T res);
	
	IndexValuePairF min();
	
	IndexValuePairF min(@ExtractionParam IndexValuePairF res);

	IndexValuePairF max();
	
	IndexValuePairF max(@ExtractionParam IndexValuePairF res);

	IVec3RF crossN(ITup3RF t);
	
	IVec3RF crossN(ITupRF t);
	
	IVec3RF crossN(float[] t);
	
	IVec3RF crossN(float tv0, float tv1, float tv2);
	
	float[] crossT(ITup3RF t, @ExtractionParam float[] res);
	
	float[] crossT(ITupRF t, @ExtractionParam float[] res);
	
	float[] crossT(float[] t, @ExtractionParam float[] res);
	
	float[] crossT(float tv0, float tv1, float tv2, @ExtractionParam float[] res);
	
	<T extends ITup3WF> T crossT(ITup3RF t, @ExtractionParam T res);
	
	<T extends ITup3WF> T crossT(ITupRF t, @ExtractionParam T res);
	
	<T extends ITup3WF> T crossT(float[] t, @ExtractionParam T res);
	
	<T extends ITup3WF> T crossT(float tv0, float tv1, float tv2, @ExtractionParam T res);
	
	IVec3RF rCrossN(ITup3RF t);
	
	IVec3RF rCrossN(ITupRF t);
	
	IVec3RF rCrossN(float[] t);
	
	IVec3RF rCrossN(float tv0, float tv1, float tv2);
	
	float[] rCrossT(ITup3RF t, @ExtractionParam float[] res);
	
	float[] rCrossT(ITupRF t, @ExtractionParam float[] res);
	
	float[] rCrossT(float[] t, @ExtractionParam float[] res);
	
	float[] rCrossT(float tv0, float tv1, float tv2, @ExtractionParam float[] res);
	
	<T extends ITup3WF> T rCrossT(ITup3RF t, @ExtractionParam T res);
	
	<T extends ITup3WF> T rCrossT(ITupRF t, @ExtractionParam T res);
	
	<T extends ITup3WF> T rCrossT(float[] t, @ExtractionParam T res);
	
	<T extends ITup3WF> T rCrossT(float tv0, float tv1, float tv2, @ExtractionParam T res);
}
