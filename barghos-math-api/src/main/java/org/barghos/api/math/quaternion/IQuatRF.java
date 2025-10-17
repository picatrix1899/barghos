package org.barghos.api.math.quaternion;

import org.barghos.annotation.ExtractionParam;
import org.barghos.api.core.tuple.floats.ITup3RF;
import org.barghos.api.core.tuple.floats.ITup3WF;
import org.barghos.api.core.tuple.floats.ITup4RF;

/**
 * This interface provides non invasive (readonly) functions and methods for
 * float quaternions.
 */
public interface IQuatRF extends ITup4RF
{
	float x();
	
	float y();
	
	float z();
	
	float w();
	
	float length();
	
	float lengthSquared();
	
	float lengthReciprocal();

	float dot(ITup4RF q);

	float dot(float[] q);

	float dot(float x, float y, float z, float w);

	IQuatRF conjugateN();

	<T extends IQuatWF> T conjugateT(@ExtractionParam T res);

	float[] conjugateT(@ExtractionParam float[] res);

	IQuatRF inverseN();

	float[] inverseT(@ExtractionParam float[] res);

	<T extends IQuatWF> T inverseT(@ExtractionParam T res);

	IQuatRF normalizeN();

	float[] normalizeT(@ExtractionParam float[] res);

	<T extends IQuatWF> T normalizeT(@ExtractionParam T res);
	
	IQuatRF mulN(ITup4RF q);
	
	IQuatRF mulN(float[] q);
	
	IQuatRF mulN(float x, float y, float z, float w);
	
	float[] mulT(ITup4RF q, @ExtractionParam float[] res);
	
	float[] mulT(float[] q, @ExtractionParam float[] res);
	
	float[] mulT(float x, float y, float z, float w, @ExtractionParam float[] res);
	
	<T extends IQuatWF> T mulT(ITup4RF q, @ExtractionParam T res);
	
	<T extends IQuatWF> T mulT(float[] q, @ExtractionParam T res);
	
	<T extends IQuatWF> T mulT(float x, float y, float z, float w, @ExtractionParam T res);
	
	IQuatRF rMulN(ITup4RF q);
	
	IQuatRF rMulN(float[] q);
	
	IQuatRF rMulN(float x, float y, float z, float w);
	
	float[] rMulT(ITup4RF q, @ExtractionParam float[] res);
	
	float[] rMulT(float[] q, @ExtractionParam float[] res);
	
	float[] rMulT(float x, float y, float z, float w, @ExtractionParam float[] res);
	
	<T extends IQuatWF> T rMulT(ITup4RF q, @ExtractionParam T res);
	
	<T extends IQuatWF> T rMulT(float[] q, @ExtractionParam T res);
	
	<T extends IQuatWF> T rMulT(float x, float y, float z, float w, @ExtractionParam T res);
	
	float[] transformT(ITup3RF v, @ExtractionParam float[] res);
	
	float[] transformT(float[] v, @ExtractionParam float[] res);
	
	float[] transformT(float v0, float v1, float v2, @ExtractionParam float[] res);
	
	<T extends ITup3WF> T transformT(ITup3RF v, @ExtractionParam T res);
	
	<T extends ITup3WF> T transformT(float[] v, @ExtractionParam T res);
	
	<T extends ITup3WF> T transformT(float v0, float v1, float v2, @ExtractionParam T res);
}
