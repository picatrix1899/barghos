package org.barghos.api.math.vector;

import org.barghos.api.core.tuple.floats.ITup2RF;
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
	
	float length();

	float length(ITup2RF p);
	
	float length(ITupRF p);

	float length(float[] p);
	
	float length(float pX, float pY);

	float reciprocalLength();
	
	float reciprocalLength(ITup2RF p);
	
	float reciprocalLength(ITupRF p);

	float reciprocalLength(float[] p);

	float reciprocalLength(float pX, float pY);

	float squaredLength();

	float squaredLength(ITup2RF p);
	
	float squaredLength(ITupRF p);

	float squaredLength(float[] p);

	float squaredLength(float pX, float pY);
	
	float dot(ITup2RF v);
	
	float dot(ITupRF v);

	float dot(float[] v);

	float dot(float vX, float vY);

	IVec2RF addN(ITup2RF v);
	
	IVec2RF addN(ITupRF v);
	
	IVec2RF addN(float[] v);
	
	IVec2RF addN(float value);

	IVec2RF addN(float vX, float vY);
	
	IVec2RF subN(ITup2RF v);
	
	IVec2RF subN(ITupRF v);

	IVec2RF subN(float[] v);

	IVec2RF subN(float value);

	IVec2RF subN(float vX, float vY);

	IVec2RF revSubN(ITup2RF v);
	
	IVec2RF revSubN(ITupRF v);

	IVec2RF revSubN(float[] v);

	IVec2RF revSubN(float value);

	IVec2RF revSubN(float vX, float vY);

	IVec2RF mulN(ITup2RF v);
	
	IVec2RF mulN(ITupRF v);

	IVec2RF mulN(float[] v);

	IVec2RF mulN(float value);

	IVec2RF mulN(float vX, float vY);

	IVec2RF divN(ITup2RF v);
	
	IVec2RF divN(ITupRF v);

	IVec2RF divN(float[] v);

	IVec2RF divN(float value);

	IVec2RF divN(float vX, float vY);

	IVec2RF revDivN(ITup2RF v);
	
	IVec2RF revDivN(ITupRF v);

	IVec2RF revDivN(float[] v);

	IVec2RF revDivN(float value);

	IVec2RF revDivN(float vX, float vY);

	IVec2RF negateN();

	IVec2RF reciprocalN();

	IVec2RF normalizeN();

	IVec2RF absN();

	IVec2RF signumN();
	
}
