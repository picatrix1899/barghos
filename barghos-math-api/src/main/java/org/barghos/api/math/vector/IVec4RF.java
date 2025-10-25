package org.barghos.api.math.vector;

import org.barghos.api.core.tuple.floats.ITup4RF;
import org.barghos.api.core.tuple.floats.ITupRF;

/**
 * This interface provides non-invasive (read only) functions and methods for float vectors with two
 * dimensions.
 */
public interface IVec4RF extends ITup4RF
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

	/**
	 * Returns the w component of the vector.
	 * 
	 * @return The w component.
	 */
	float w();
	
	float length();
	
	float length(ITup4RF v);
	
	float length(ITupRF v);
	
	float length(float[] v);

	float length(float x, float y, float z, float w);
	
	float reciprocalLength();
	
	float reciprocalLength(ITup4RF v);
	
	float reciprocalLength(ITupRF v);

	float reciprocalLength(float[] v);

	float reciprocalLength(float x, float y, float z, float w);

	float squaredlength();
	
	float squaredlength(ITup4RF v);
	
	float squaredlength(ITupRF v);

	float squaredlength(float[] v);

	float squaredlength(float x, float y, float z, float w);
	
	float dot(ITup4RF v);
	
	float dot(ITupRF v);

	float dot(float[] v);

	float dot(float x, float y, float z, float w);

	IVec4RF addN(ITup4RF v);
	
	IVec4RF addN(ITupRF v);

	IVec4RF addN(float[] v);

	IVec4RF addN(float value);

	IVec4RF addN(float x, float y, float z, float w);
	
	IVec4RF subN(ITup4RF v);
	
	IVec4RF subN(ITupRF v);

	IVec4RF subN(float[] v);

	IVec4RF subN(float value);

	IVec4RF subN(float x, float y, float z, float w);
	
	IVec4RF revSubN(ITup4RF v);
	
	IVec4RF revSubN(ITupRF v);

	IVec4RF revSubN(float[] v);

	IVec4RF revSubN(float value);

	IVec4RF revSubN(float x, float y, float z, float w);
	
	IVec4RF mulN(ITup4RF v);
	
	IVec4RF mulN(ITupRF v);

	IVec4RF mulN(float[] v);

	IVec4RF mulN(float value);

	IVec4RF mulN(float x, float y, float z, float w);
	
	IVec4RF divN(ITup4RF v);
	
	IVec4RF divN(ITupRF v);

	IVec4RF divN(float[] v);

	IVec4RF divN(float value);

	IVec4RF divN(float x, float y, float z, float w);
	
	IVec4RF revDivN(ITup4RF v);
	
	IVec4RF revDivN(ITupRF v);

	IVec4RF revDivN(float[] v);

	IVec4RF revDivN(float value);

	IVec4RF revDivN(float x, float y, float z, float w);
	
	IVec4RF negateN();
	
	IVec4RF reciprocalN();
	
	IVec4RF normalizeN();
	
	IVec4RF absN();
	
	IVec4RF signumN();
	
}
