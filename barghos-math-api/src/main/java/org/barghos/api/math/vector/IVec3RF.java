package org.barghos.api.math.vector;

import org.barghos.api.core.tuple.floats.ITup3RF;
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

	float length();
	
	float length(ITup3RF v);
	
	float length(ITupRF v);
	
	float length(float[] v);

	float length(float x, float y, float z);
	
	float reciprocalLength();
	
	float reciprocalLength(ITup3RF v);
	
	float reciprocalLength(ITupRF v);

	float reciprocalLength(float[] v);

	float reciprocalLength(float x, float y, float z);

	float squaredLength();
	
	float squaredLength(ITup3RF v);
	
	float squaredLength(ITupRF v);

	float squaredLength(float[] v);

	float squaredLength(float x, float y, float z);
	
	float dot(ITup3RF v);
	
	float dot(ITupRF v);

	float dot(float[] v);

	float dot(float x, float y, float z);

	IVec3RF addN(ITup3RF v);
	
	IVec3RF addN(ITupRF v);

	IVec3RF addN(float[] v);

	IVec3RF addN(float value);

	IVec3RF addN(float x, float y, float z);
	
	IVec3RF subN(ITup3RF v);
	
	IVec3RF subN(ITupRF v);

	IVec3RF subN(float[] v);

	IVec3RF subN(float value);

	IVec3RF subN(float x, float y, float z);
	
	IVec3RF revSubN(ITup3RF v);
	
	IVec3RF revSubN(ITupRF v);

	IVec3RF revSubN(float[] v);

	IVec3RF revSubN(float value);

	IVec3RF revSubN(float x, float y, float z);
	
	IVec3RF mulN(ITup3RF v);
	
	IVec3RF mulN(ITupRF v);

	IVec3RF mulN(float[] v);

	IVec3RF mulN(float value);

	IVec3RF mulN(float x, float y, float z);
	
	IVec3RF divN(ITup3RF v);
	
	IVec3RF divN(ITupRF v);

	IVec3RF divN(float[] v);

	IVec3RF divN(float value);

	IVec3RF divN(float x, float y, float z);
	
	IVec3RF revDivN(ITup3RF v);
	
	IVec3RF revDivN(ITupRF v);

	IVec3RF revDivN(float[] v);

	IVec3RF revDivN(float value);

	IVec3RF revDivN(float x, float y, float z);
	
	IVec3RF negateN();
	
	IVec3RF reciprocalN();
	
	IVec3RF normalizeN();
	
	IVec3RF absN();
	
	IVec3RF signumN();
	
	IVec3RF crossN(ITup3RF v);
	
	IVec3RF crossN(ITupRF v);
	
	IVec3RF crossN(float[] v);
	
	IVec3RF crossN(float x, float y, float z);
	
	IVec3RF revCrossN(ITup3RF v);
	
	IVec3RF revCrossN(ITupRF v);
	
	IVec3RF revCrossN(float[] v);
	
	IVec3RF revCrossN(float x, float y, float z);
	
}
