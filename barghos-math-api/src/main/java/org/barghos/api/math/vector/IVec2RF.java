package org.barghos.api.math.vector;

import org.barghos.annotation.ExtractionParam;
import org.barghos.api.core.collection.IndexValuePairF;
import org.barghos.api.core.tuple.floats.ITup2RF;
import org.barghos.api.core.tuple.floats.ITup2WF;
import org.barghos.api.core.tuple.floats.ITupRF;

/**
 * This interface provides non-invasive (read only) functions and methods for float vectors with two
 * dimensions.
 */
public interface IVec2RF extends ITup2RF
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
	
	float len();

	float lenEM(float tolerance);

	float lenEM4();

	float lenEM6();

	float lenEM8();

	float lenRc();

	float lenTo(ITup2RF t);
	
	float lenTo(ITupRF t);

	float lenTo(float[] t);
	
	float lenTo(float tx, float ty);
	
	float lenToEM(float tolerance, ITup2RF t);
	
	float lenToEM(float tolerance, ITupRF t);

	float lenToEM(float tolerance, float[] t);

	float lenToEM(float tolerance, float tx, float ty);
	
	float lenToEM4(ITup2RF t);
	
	float lenToEM4(ITupRF t);

	float lenToEM4(float[] t);
	
	float lenToEM4(float tx, float ty);
	
	float lenToEM6(ITup2RF t);
	
	float lenToEM6(ITupRF t);

	float lenToEM6(float[] t);
	
	float lenToEM6(float tx, float ty);
	
	float lenToEM8(ITup2RF t);
	
	float lenToEM8(ITupRF t);

	float lenToEM8(float[] t);
	
	float lenToEM8(float tx, float ty);

	float lenRcTo(ITup2RF t);
	
	float lenRcTo(ITupRF t);

	float lenRcTo(float[] t);

	float lenRcTo(float tx, float ty);

	float lenSq();
	
	float lenSqEM(float tolerance);

	float lenSqEM4();
	
	float lenSqEM6();
	
	float lenSqEM8();
	
	float lenSqTo(ITup2RF t);
	
	float lenSqTo(ITupRF t);

	float lenSqTo(float[] t);

	float lenSqTo(float tx, float ty);

	float lenSqToEM(float tolerance, ITup2RF t);
	
	float lenSqToEM(float tolerance, ITupRF t);

	float lenSqToEM(float tolerance, float[] t);

	float lenSqToEM(float tolerance, float tx, float ty);
	
	float lenSqToEM4(ITup2RF t);
	
	float lenSqToEM4(ITupRF t);

	float lenSqToEM4(float[] t);

	float lenSqToEM4(float tx, float ty);
	
	float lenSqToEM6(ITup2RF t);
	
	float lenSqToEM6(ITupRF t);

	float lenSqToEM6(float[] t);

	float lenSqToEM6(float tx, float ty);
	
	float lenSqToEM8(ITup2RF t);
	
	float lenSqToEM8(ITupRF t);

	float lenSqToEM8(float[] t);

	float lenSqToEM8(float tx, float ty);
	
	float dot(ITup2RF t);
	
	float dot(ITupRF t);

	float dot(float[] t);

	float dot(float tx, float ty);

	IVec2RF addN(ITup2RF t);
	
	IVec2RF addN(ITupRF t);

	IVec2RF addN(float[] t);

	IVec2RF addN(float value);

	IVec2RF addN(float tx, float ty);

	float[] addT(ITup2RF t, @ExtractionParam float[] res);
	
	float[] addT(ITupRF t, @ExtractionParam float[] res);

	float[] addT(float[] t, @ExtractionParam float[] res);

	float[] addT(float value, @ExtractionParam float[] res);

	float[] addT(float tx, float ty, @ExtractionParam float[] res);

	<T extends ITup2WF> T addT(ITup2RF t, @ExtractionParam T res);
	
	<T extends ITup2WF> T addT(ITupRF t, @ExtractionParam T res);

	<T extends ITup2WF> T addT(float[] t, @ExtractionParam T res);

	<T extends ITup2WF> T addT(float value, @ExtractionParam T res);

	<T extends ITup2WF> T addT(float tx, float ty, @ExtractionParam T res);

	IVec2RF subN(ITup2RF t);
	
	IVec2RF subN(ITupRF t);

	IVec2RF subN(float[] t);

	IVec2RF subN(float value);

	IVec2RF subN(float tx, float ty);

	float[] subT(ITup2RF t, @ExtractionParam float[] res);
	
	float[] subT(ITupRF t, @ExtractionParam float[] res);

	float[] subT(float[] t, @ExtractionParam float[] res);

	float[] subT(float value, @ExtractionParam float[] res);

	float[] subT(float tx, float ty, @ExtractionParam float[] res);

	<T extends ITup2WF> T subT(ITup2RF t, @ExtractionParam T res);
	
	<T extends ITup2WF> T subT(ITupRF t, @ExtractionParam T res);

	<T extends ITup2WF> T subT(float[] t, @ExtractionParam T res);

	<T extends ITup2WF> T subT(float value, @ExtractionParam T res);

	<T extends ITup2WF> T subT(float tx, float ty, @ExtractionParam T res);

	IVec2RF rSubN(ITup2RF t);
	
	IVec2RF rSubN(ITupRF t);

	IVec2RF rSubN(float[] t);

	IVec2RF rSubN(float value);

	IVec2RF rSubN(float tx, float ty);
	
	float[] rSubT(ITup2RF t, @ExtractionParam float[] res);
	
	float[] rSubT(ITupRF t, @ExtractionParam float[] res);

	float[] rSubT(float[] t, @ExtractionParam float[] res);

	float[] rSubT(float value, @ExtractionParam float[] res);

	float[] rSubT(float tx, float ty, @ExtractionParam float[] res);

	<T extends ITup2WF> T rSubT(ITup2RF t, @ExtractionParam T res);
	
	<T extends ITup2WF> T rSubT(ITupRF t, @ExtractionParam T res);

	<T extends ITup2WF> T rSubT(float[] t, @ExtractionParam T res);

	<T extends ITup2WF> T rSubT(float value, @ExtractionParam T res);
	
	<T extends ITup2WF> T rSubT(float tx, float ty, @ExtractionParam T res);

	IVec2RF mulN(ITup2RF t);
	
	IVec2RF mulN(ITupRF t);

	IVec2RF mulN(float[] t);

	IVec2RF mulN(float value);

	IVec2RF mulN(float tx, float ty);

	float[] mulT(ITup2RF t, @ExtractionParam float[] res);
	
	float[] mulT(ITupRF t, @ExtractionParam float[] res);

	float[] mulT(float[] t, @ExtractionParam float[] res);

	float[] mulT(float value, @ExtractionParam float[] res);

	float[] mulT(float tx, float ty, @ExtractionParam float[] res);

	<T extends ITup2WF> T mulT(ITup2RF t, @ExtractionParam T res);
	
	<T extends ITup2WF> T mulT(ITupRF t, @ExtractionParam T res);

	<T extends ITup2WF> T mulT(float[] t, @ExtractionParam T res);

	<T extends ITup2WF> T mulT(float value, @ExtractionParam T res);
	
	<T extends ITup2WF> T mulT(float tx, float ty, @ExtractionParam T res);

	IVec2RF divN(ITup2RF t);
	
	IVec2RF divN(ITupRF t);

	IVec2RF divN(float[] t);

	IVec2RF divN(float value);

	IVec2RF divN(float tx, float ty);

	float[] divT(ITup2RF t, @ExtractionParam float[] res);
	
	float[] divT(ITupRF t, @ExtractionParam float[] res);

	float[] divT(float[] t, @ExtractionParam float[] res);

	float[] divT(float value, @ExtractionParam float[] res);

	float[] divT(float tx, float ty, @ExtractionParam float[] res);

	<T extends ITup2WF> T divT(ITup2RF t, @ExtractionParam T res);
	
	<T extends ITup2WF> T divT(ITupRF t, @ExtractionParam T res);

	<T extends ITup2WF> T divT(float[] t, @ExtractionParam T res);
	
	<T extends ITup2WF> T divT(float value, @ExtractionParam T res);

	<T extends ITup2WF> T divT(float tx, float ty, @ExtractionParam T res);

	IVec2RF rDivN(ITup2RF t);
	
	IVec2RF rDivN(ITupRF t);

	IVec2RF rDivN(float[] t);

	IVec2RF rDivN(float value);

	IVec2RF rDivN(float tx, float ty);

	float[] rDivT(ITup2RF t, @ExtractionParam float[] res);
	
	float[] rDivT(ITupRF t, @ExtractionParam float[] res);

	float[] rDivT(float[] t, @ExtractionParam float[] res);

	float[] rDivT(float value, @ExtractionParam float[] res);

	float[] rDivT(float tx, float ty, @ExtractionParam float[] res);

	<T extends ITup2WF> T rDivT(ITup2RF t, @ExtractionParam T res);
	
	<T extends ITup2WF> T rDivT(ITupRF t, @ExtractionParam T res);

	<T extends ITup2WF> T rDivT(float[] t, @ExtractionParam T res);

	<T extends ITup2WF> T rDivT(float value, @ExtractionParam T res);

	<T extends ITup2WF> T rDivT(float tx, float ty, @ExtractionParam T res);

	IVec2RF halfVecToN(ITup2RF t);
	
	IVec2RF halfVecToN(ITupRF t);

	IVec2RF halfVecToN(float[] t);

	IVec2RF halfVecToN(float tx, float ty);

	float[] halfVecToT(ITup2RF t, @ExtractionParam float[] res);
	
	float[] halfVecToT(ITupRF t, @ExtractionParam float[] res);

	float[] halfVecToT(float[] t, @ExtractionParam float[] res);

	float[] halfVecToT(float tx, float ty, @ExtractionParam float[] res);

	<T extends ITup2WF> T halfVecToT(ITup2RF t, @ExtractionParam T res);
	
	<T extends ITup2WF> T halfVecToT(ITupRF t, @ExtractionParam T res);

	<T extends ITup2WF> T halfVecToT(float[] t, @ExtractionParam T res);

	<T extends ITup2WF> T halfVecToT(float tx, float ty, @ExtractionParam T res);

	IVec2RF midPointToN(ITup2RF t);
	
	IVec2RF midPointToN(ITupRF t);

	IVec2RF midPointToN(float[] t);

	IVec2RF midPointToN(float tx, float ty);

	float[] midPointToT(ITup2RF t, @ExtractionParam float[] res);
	
	float[] midPointToT(ITupRF t, @ExtractionParam float[] res);

	float[] midPointToT(float[] t, @ExtractionParam float[] res);

	float[] midPointToT(float tx, float ty, @ExtractionParam float[] res);

	<T extends ITup2WF> T midPointToT(ITup2RF t, @ExtractionParam T res);
	
	<T extends ITup2WF> T midPointToT(ITupRF t, @ExtractionParam T res);

	<T extends ITup2WF> T midPointToT(float[] t, @ExtractionParam T res);

	<T extends ITup2WF> T midPointToT(float tx, float ty, @ExtractionParam T res);

	IVec2RF negN();

	float[] negT(@ExtractionParam float[] res);

	<T extends ITup2WF> T negT(@ExtractionParam T res);

	IVec2RF recN();

	float[] recT(@ExtractionParam float[] res);

	<T extends ITup2WF> T recT(@ExtractionParam T res);

	IVec2RF nrmN();

	float[] nrmT(@ExtractionParam float[] res);

	<T extends ITup2WF> T nrmT(@ExtractionParam T res);

	IVec2RF nrmNEM(float tolerance);

	float[] nrmTEM(float tolerance, @ExtractionParam float[] res);

	<T extends ITup2WF> T nrmTEM(float tolerance, @ExtractionParam T res);

	IVec2RF nrmNEM4();

	float[] nrmTEM4(@ExtractionParam float[] res);

	<T extends ITup2WF> T nrmTEM4(@ExtractionParam T res);

	IVec2RF nrmNEM6();

	float[] nrmTEM6(@ExtractionParam float[] res);

	<T extends ITup2WF> T nrmTEM6(@ExtractionParam T res);

	IVec2RF nrmNEM8();

	float[] nrmTEM8(@ExtractionParam float[] res);

	<T extends ITup2WF> T nrmTEM8(@ExtractionParam T res);

	IVec2RF rotRadN(double angle);

	float[] rotRadT(double angle, @ExtractionParam float[] res);

	<T extends ITup2WF> T rotRadT(double angle, @ExtractionParam T res);

	IVec2RF rotDegN(double angle);

	float[] rotDegT(double angle, @ExtractionParam float[] res);

	<T extends ITup2WF> T rotDegT(double angle, @ExtractionParam T res);

	IVec2RF projectN(ITup2RF t);
	
	IVec2RF projectN(ITupRF t);

	IVec2RF projectN(float[] t);

	IVec2RF projectN(float tx, float ty);

	float[] projectT(ITup2RF t, @ExtractionParam float[] res);
	
	float[] projectT(ITupRF t, @ExtractionParam float[] res);

	float[] projectT(float[] t, @ExtractionParam float[] res);
	
	float[] projectT(float tx, float ty, @ExtractionParam float[] res);

	<T extends ITup2WF> T projectT(ITup2RF t, @ExtractionParam T res);
	
	<T extends ITup2WF> T projectT(ITupRF t, @ExtractionParam T res);

	<T extends ITup2WF> T projectT(float[] t, @ExtractionParam T res);

	<T extends ITup2WF> T projectT(float tx, float ty, @ExtractionParam T res);

	IVec2RF reflectN(ITup2RF n);
	
	IVec2RF reflectN(ITupRF n);

	IVec2RF reflectN(float[] n);

	IVec2RF reflectN(float nx, float ny);

	float[] reflectT(ITup2RF n, @ExtractionParam float[] res);
	
	float[] reflectT(ITupRF n, @ExtractionParam float[] res);

	float[] reflectT(float[] n, @ExtractionParam float[] res);

	float[] reflectT(float nx, float ny, @ExtractionParam float[] res);

	<T extends ITup2WF> T reflectT(ITup2RF n, @ExtractionParam T res);
	
	<T extends ITup2WF> T reflectT(ITupRF n, @ExtractionParam T res);

	<T extends ITup2WF> T reflectT(float[] n, @ExtractionParam T res);

	<T extends ITup2WF> T reflectT(float nx, float ny, @ExtractionParam T res);

	IVec2RF absN();

	float[] absT(@ExtractionParam float[] res);

	<T extends ITup2WF> T absT(@ExtractionParam T res);

	IVec2RF signumN();

	float[] signumT(@ExtractionParam float[] res);

	<T extends ITup2WF> T signumT(@ExtractionParam T res);

	IVec2RF signumNEM(float tolerance);

	float[] signumTEM(float tolerance, @ExtractionParam float[] res);

	<T extends ITup2WF> T signumTEM(float tolerance, @ExtractionParam T res);

	IVec2RF signumNEM4();

	float[] signumTEM4(@ExtractionParam float[] res);

	<T extends ITup2WF> T signumTEM4(@ExtractionParam T res);

	IVec2RF signumNEM6();

	float[] signumTEM6(@ExtractionParam float[] res);

	<T extends ITup2WF> T signumTEM6(@ExtractionParam T res);
	
	IVec2RF signumNEM8();

	float[] signumTEM8(@ExtractionParam float[] res);

	<T extends ITup2WF> T signumTEM8(@ExtractionParam T res);

	IVec2RF swizzleN(int[] indices);
	
	float[] swizzleT(int[] indices, @ExtractionParam float[] res);
	
	<T extends ITup2WF> T swizzleT(int[] indices, @ExtractionParam T res);

	IVec2RF swizzleN(int indexX, int indexY);
	
	float[] swizzleT(int indexV0, int indexV1, @ExtractionParam float[] res);
	
	<T extends ITup2WF> T swizzleT(int indexV0, int indexV1, @ExtractionParam T res);

	IVec2RF swapN(int indexA, int indexB);
	
	float[] swapT(int indexA, int indexB, @ExtractionParam float[] res);
	
	<T extends ITup2WF> T swapT(int indexA, int indexB, @ExtractionParam T res);

	IVec2RF swapV0V1N();

	float[] swapV0V1T(@ExtractionParam float[] res);
	
	<T extends ITup2WF> T swapV0V1T(@ExtractionParam T res);
	
	IVec2RF swapXYN();
	
	IVec2RF minComponentsN(ITup2RF t);
	
	IVec2RF minComponentsN(ITupRF t);
	
	IVec2RF minComponentsN(float[] t);
	
	IVec2RF minComponentsN(float tv0, float tv1);

	float[] minComponentsT(ITup2RF t, @ExtractionParam float[] res);
	
	float[] minComponentsT(ITupRF t, @ExtractionParam float[] res);
	
	float[] minComponentsT(float[] t, @ExtractionParam float[] res);
	
	float[] minComponentsT(float tv0, float tv1, @ExtractionParam float[] res);
	
	<T extends ITup2WF> T minComponentsT(ITup2RF t, @ExtractionParam T res);
	
	<T extends ITup2WF> T minComponentsT(ITupRF t, @ExtractionParam T res);
	
	<T extends ITup2WF> T minComponentsT(float[] t, @ExtractionParam T res);
	
	<T extends ITup2WF> T minComponentsT(float tv0, float tv1, @ExtractionParam T res);
	
	IVec2RF maxComponentsN(ITup2RF t);
	
	IVec2RF maxComponentsN(ITupRF t);
	
	IVec2RF maxComponentsN(float[] t);
	
	IVec2RF maxComponentsN(float tv0, float tv1);
	
	float[] maxComponentsT(ITup2RF t, @ExtractionParam float[] res);
	
	float[] maxComponentsT(ITupRF t, @ExtractionParam float[] res);
	
	float[] maxComponentsT(float[] t, @ExtractionParam float[] res);
	
	float[] maxComponentsT(float tv0, float tv1, @ExtractionParam float[] res);
	
	<T extends ITup2WF> T maxComponentsT(ITup2RF t, @ExtractionParam T res);
	
	<T extends ITup2WF> T maxComponentsT(ITupRF t, @ExtractionParam T res);
	
	<T extends ITup2WF> T maxComponentsT(float[] t, @ExtractionParam T res);
	
	<T extends ITup2WF> T maxComponentsT(float tv0, float tv1, @ExtractionParam T res);

	IndexValuePairF min();
	
	IndexValuePairF min(@ExtractionParam IndexValuePairF res);

	IndexValuePairF max();
	
	IndexValuePairF max(@ExtractionParam IndexValuePairF res);
}
