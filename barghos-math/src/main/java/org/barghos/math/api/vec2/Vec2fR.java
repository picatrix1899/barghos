package org.barghos.math.api.vec2;

import org.barghos.core.api.tuple2.Tup2fR;
import org.barghos.core.api.tuple2.Tup2fW;
import org.barghos.core.api.util.Maths;

/**
 * This interface grants readonly access to any 2-dimensional mathematical float vector.
 * 
 * <p>
 * It should be prefered by design before direct usage of a type in method parameters,
 * if the method only reads data from the parameter.
 * 
 * @author picatrix1899
 */
public interface Vec2fR extends Tup2fR
{
	@Override
	default Vec2fR getNewInstance(Tup2fR t)
	{
		return (Vec2fR)Tup2fR.super.getNewInstance(t);
	}
	
	@Override
	default Vec2fR getNewInstance(float value)
	{
		return (Vec2fR)Tup2fR.super.getNewInstance(value);
	}
	
	@Override
	Vec2fR getNewInstance(float x, float y);
	
	/**
	 * Adds the tuple t to the current vector
	 * and stores the result in a new instance of the original type of the vector.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation: (vector.x + t.x, vector.y + t.y)
	 * 
	 * @param t The tuple to add to the current vector.
	 * 
	 * @return The new object with the result.
	 */
	default Vec2fR addN(Tup2fR t)
	{
		return addN(t.getX(), t.getY());
	}
	
	/**
	 * Adds a single value to the components in the current vector
	 * and stores the result in a new instance of the original type of the vector.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation: (vector.x + value, vector.y + value)
	 * 
	 * @param value The value to add to the components.
	 * 
	 * @return The new object with the result.
	 */
	default Vec2fR addN(float value)
	{
		return addN(value, value);
	}
	
	/**
	 * Adds the x and y parameter to their corresponding components in the current vector
	 * and stores the result in a new instance of the original type of the vector.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation: (vector.x + x, vector.y + y)
	 * 
	 * @param x The value to add to the x component of the current vector.
	 * @param y The value to add to the y component of the current vector.
	 * 
	 * @return The new object with the result.
	 */
	default Vec2fR addN(float x, float y)
	{
		return getNewInstance(getX() + x, getY() + y);
	}
	
	/**
	 * Subtracts the tuple t from the current vector
	 * and stores the result in a new instance of the original type of the vector.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation: (vector.x - t.x, vector.y - t.y)
	 * 
	 * @param t The tuple to subtract from the current vector.
	 * 
	 * @return The new object with the result.
	 */
	default Vec2fR subN(Tup2fR t)
	{
		return subN(t.getX(), t.getY());
	}
	
	/**
	 * Subtracts a single value from the components in the current vector
	 * and stores the result in a new instance of the original type of the vector.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation: (vector.x - value, vector.y - value)
	 * 
	 * @param value The value to add to the components.
	 * 
	 * @return The new object with the result.
	 */
	default Vec2fR subN(float value)
	{
		return subN(value, value);
	}
	
	/**
	 * Subtracts the x and y parameter from their corresponding components in the current vector
	 * and stores the result in a new instance of the original type of the vector.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation: (vector.x - x, vector.y - y)
	 * 
	 * @param x The value to subtract from the x component of the current vector.
	 * @param y The value to subtract from the y component of the current vector.
	 * 
	 * @return The new object with the result.
	 */
	default Vec2fR subN(float x, float y)
	{
		return getNewInstance(getX() - x, getY() - y);
	}
	
	/**
	 * Multiplies the tuple t with the current vector
	 * and stores the result in a new instance of the original type of the vector.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation: (vector.x * t.x, vector.y * t.y)
	 * 
	 * @param t The tuple to multiply with the current vector.
	 * 
	 * @return The new object with the result.
	 */
	default Vec2fR mulN(Tup2fR t)
	{
		return mulN(t.getX(), t.getY());
	}
	
	/**
	 * Multiplies a single value with the components in the current vector
	 * and stores the result in a new instance of the original type of the vector.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation: (vector.x * value, vector.y * value)
	 * 
	 * @param value The value to multiply with the components.
	 * 
	 * @return The new object with the result.
	 */
	default Vec2fR mulN(float value)
	{
		return mulN(value, value);
	}
	
	/**
	 * Multiplies the x and y parameter with their corresponding components in the current vector
	 * and stores the result in a new instance of the original type of the vector.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation: (vector.x * x, vector.y * y)
	 * 
	 * @param x The value to multiply with the x component of the current vector.
	 * @param y The value to multiply with the y component of the current vector.
	 * 
	 * @return The new object with the result.
	 */
	default Vec2fR mulN(float x, float y)
	{
		return getNewInstance(getX() * x, getY() * y);
	}
	
	/**
	 * Divides the current vector by a tuple t
	 * and stores the result in a new instance of the original type of the vector.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation: (vector.x / t.x, vector.y / t.y)
	 * 
	 * @param t The tuple to divide the current vector by.
	 * 
	 * @return The new object with the result.
	 */
	default Vec2fR divN(Tup2fR t)
	{
		return divN(t.getX(), t.getY());
	}
	
	/**
	 * Divides the components in the current vector by a single value
	 * and stores the result in a new instance of the original type of the vector.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation: (vector.x / value, vector.y / value)
	 * 
	 * @param value The value to divide the components by.
	 * 
	 * @return The new object with the result.
	 */
	default Vec2fR divN(float value)
	{
		return divN(value, value);
	}
	
	/**
	 * Divides the components in the current vector by their corresponding parameters
	 * and stores the result in a new instance of the original type of the vector.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation: (vector.x / x, vector.y / y)
	 * 
	 * @param x The value to divide the x component of the current vector by.
	 * @param y The value to divide the y component of the current vector by.
	 * 
	 * @return The new object with the result.
	 */
	default Vec2fR divN(float x, float y)
	{
		return getNewInstance(getX() / x, getY() / y);
	}
	
	/**
	 * Adds the tuple t to the current vector
	 * and stores the result in the object given by the parameter res.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation: (vector.x + t.x, vector.y + t.y)
	 * 
	 * @param <T> The type of the resulting tuple.
	 * 
	 * @param res The object to store the result of the operation in.
	 * @param t The tuple to add to the current vector.
	 * 
	 * @return The new object with the result.
	 */
	default <T extends Tup2fW> T addR(T res, Tup2fR t)
	{
		return addR(res, t.getX(), t.getY());
	}
	
	/**
	 * Adds a single value to the components in the current vector
	 * and stores the result in the object given by the parameter res.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation: (vector.x + value, vector.y + value)
	 * 
	 * @param <T> The type of the resulting tuple.
	 * 
	 * @param res The object to store the result of the operation in.
	 * @param value The value to add to the components.
	 * 
	 * @return The new object with the result.
	 */
	default <T extends Tup2fW> T addR(T res, float value)
	{
		return addR(res, value, value);
	}
	
	/**
	 * Adds the x and y parameter to their corresponding components in the current vector
	 * and stores the result in the object given by the parameter res.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation: (vector.x + x, vector.y + y)
	 * 
	 * @param <T> The type of the resulting tuple.
	 * 
	 * @param res The object to store the result of the operation in.
	 * @param x The value to add to the x component of the current vector.
	 * @param y The value to add to the y component of the current vector.
	 * 
	 * @return The altered result object.
	 */
	default <T extends Tup2fW> T addR(T res, float x, float y)
	{
		res.set(getX() + x, getY() + y);
		
		return res;
	}
	
	/**
	 * Subtracts the tuple t from the current vector
	 * and stores the result in the object given by the parameter res.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation: (vector.x - t.x, vector.y - t.y)
	 * 
	 * @param <T> The type of the resulting tuple.
	 * 
	 * @param res The object to store the result of the operation in.
	 * @param t The tuple to subtract from the current vector.
	 * 
	 * @return The new object with the result.
	 */
	default <T extends Tup2fW> T subR(T res, Tup2fR t)
	{
		return subR(res, t.getX(), t.getY());
	}
	
	/**
	 * Subtracts a single value from the components in the current vector
	 * and stores the result in the object given by the parameter res.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation: (vector.x - value, vector.y - value)
	 * 
	 * @param <T> The type of the resulting tuple.
	 * 
	 * @param res The object to store the result of the operation in.
	 * @param value The value to add to the components.
	 * 
	 * @return The new object with the result.
	 */
	default <T extends Tup2fW> T subR(T res, float value)
	{
		return subR(res, value, value);
	}
	
	/**
	 * Subtracts the x and y parameter from their corresponding components in the current vector
	 * and stores the result in the object given by the parameter res.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation: (vector.x - x, vector.y - y)
	 * 
	 * @param <T> The type of the resulting tuple.
	 * 
	 * @param res The object to store the result of the operation in.
	 * @param x The value to subtract from the x component of the current vector.
	 * @param y The value to subtract from the y component of the current vector.
	 * 
	 * @return The new object with the result.
	 */
	default <T extends Tup2fW> T subR(T res, float x, float y)
	{
		res.set(getX() - x, getY() - y);
		
		return res;
	}
	
	/**
	 * Multiplies the tuple t with the current vector
	 * and stores the result in the object given by the parameter res.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation: (vector.x * t.x, vector.y * t.y)
	 * 
	 * @param <T> The type of the resulting tuple.
	 * 
	 * @param res The object to store the result of the operation in.
	 * @param t The tuple to multiply with the current vector.
	 * 
	 * @return The new object with the result.
	 */
	default <T extends Tup2fW> T mulR(T res, Tup2fR t)
	{
		return mulR(res, t.getX(), t.getY());
	}
	
	/**
	 * Multiplies a single value with the components in the current vector
	 * and stores the result in the object given by the parameter res.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation: (vector.x * value, vector.y * value)
	 * 
	 * @param <T> The type of the resulting tuple.
	 * 
	 * @param res The object to store the result of the operation in.
	 * @param value The value to multiply with the components.
	 * 
	 * @return The new object with the result.
	 */
	default <T extends Tup2fW> T mulR(T res, float value)
	{
		return mulR(res, value, value);
	}
	
	/**
	 * Multiplies the x and y parameter with their corresponding components in the current vector
	 * and stores the result in the object given by the parameter res.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation: (vector.x * x, vector.y * y)
	 * 
	 * @param <T> The type of the resulting tuple.
	 * 
	 * @param res The object to store the result of the operation in.
	 * @param x The value to multiply with the x component of the current vector.
	 * @param y The value to multiply with the y component of the current vector.
	 * 
	 * @return The new object with the result.
	 */
	default <T extends Tup2fW> T mulR(T res, float x, float y)
	{
		res.set(getX() * x, getY() * y);
		
		return res;
	}
	
	/**
	 * Divides the current vector by a tuple t
	 * and stores the result in the object given by the parameter res.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation: (vector.x / t.x, vector.y / t.y)
	 * 
	 * @param <T> The type of the resulting tuple.
	 * 
	 * @param res The object to store the result of the operation in.
	 * @param t The tuple to divide the current vector by.
	 * 
	 * @return The new object with the result.
	 */
	default <T extends Tup2fW> T divR(T res, Tup2fR t)
	{
		return divR(res, t.getX(), t.getY());
	}
	
	/**
	 * Divides the components in the current vector by a single value
	 * and stores the result in the object given by the parameter res.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation: (vector.x / value, vector.y / value)
	 * 
	 * @param <T> The type of the resulting tuple.
	 * 
	 * @param res The object to store the result of the operation in.
	 * @param value The value to divide the components by.
	 * 
	 * @return The new object with the result.
	 */
	default <T extends Tup2fW> T divR(T res, float value)
	{
		return divR(res, value, value);
	}
	
	/**
	 * Divides the components in the current vector by their corresponding parameters
	 * and stores the result in the object given by the parameter res.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation: (vector.x / x, vector.y / y)
	 * 
	 * @param <T> The type of the resulting tuple.
	 * 
	 * @param res The object to store the result of the operation in.
	 * @param x The value to divide the x component of the current vector by.
	 * @param y The value to divide the y component of the current vector by.
	 * 
	 * @return The new object with the result.
	 */
	default <T extends Tup2fW> T divR(T res, float x, float y)
	{
		res.set(getX() / x, getY() / y);
		
		return res;
	}
	
	/**
	 * Returns the dot product (scalar product) between this vector and the tuple.
	 * 
	 * <p>
	 * Operation: v . t
	 * 
	 * @param t The tuple representing the second vector for the dot product.
	 * 
	 * @return The dot product (scalar product).
	 */
	default float dot(Tup2fR t)
	{
		return dot(t.getX(), t.getY());
	}
	
	/**
	 * Returns the dot product (scalar product) between this vector and a second vector with all components set to value.
	 * 
	 * <p>
	 * Operation: v . (value, value)
	 * 
	 * @param value The value used for the second vector.
	 * 
	 * @return The dot product (scalar product).
	 */
	default float dot(float value)
	{
		return dot(value, value);
	}
	
	/**
	 * Returns the dot product (scalar product) between this vector and a second vector represented by individual
	 * parameters for the components.
	 * 
	 * <p>
	 * Operation: v . (x, y)
	 * 
	 * @param x The x component used for the second vector.
	 * @param y The y component used for the second vector.
	 * 
	 * @return The dot product (scalar product).
	 */
	default float dot(float x, float y)
	{
		return getX() * x + getY() * y;
	}
	
	/**
	 * Returns the squared length (squared magnitude) of the vector.
	 * It can be used for inexpensive comparison of the length of two vectors,
	 * as it does not contain a square root.
	 * 
	 * <p>
	 * This does not treat zero length vectors.
	 * This can cause undesired results.
	 * 
	 * <p>
	 * Operation: |v|²
	 * 
	 * @return The squared length (squared magnitude) of the vector.
	 */
	default float squaredLength()
	{
		float x = getX();
		float y = getY();
		
		return x * x + y * y;
	}
	
	/**
	 * Returns the squared length (squared magnitude) of the vector.
	 * It can be used for inexpensive comparison of the length of two vectors,
	 * as it does not contain a square root.
	 * 
	 * <p>
	 * This treats zero length vectors.
	 * If all components are exactly zero this will return zero aswell.
	 * 
	 * <p>
	 * Operation: |v|²
	 * 
	 * @return The squared length (squared magnitude) of the vector.
	 */
	default float safeSquaredLength()
	{
		if(isZero()) return 0.0f;
		
		return squaredLength();
	}
	
	/**
	 * Returns the squared length (squared magnitude) of the vector.
	 * It can be used for inexpensive comparison of the length of two vectors,
	 * as it does not contain a square root.
	 * 
	 * <p>
	 * This treats zero length vectors.
	 * If all components are within an inclusive tolerance around zero (positive and negative),
	 * this will return zero aswell.
	 * 
	 * <p>
	 * Operation: |v|²
	 * 
	 * @param tolerance The inclusive tolerance around zero (positive and negative).
	 * 
	 * @return The squared length (squared magnitude) of the vector.
	 */
	default float safeTrSquaredLength(float tolerance)
	{
		if(isZero(tolerance)) return 0.0f;
		
		return squaredLength();
	}
	
	/**
	 * Returns the length (magnitude) of the vector.
	 * 
	 * <p>
	 * This does not treat zero length vectors.
	 * This can cause undesired results or arithmetic exceptions.
	 * 
	 * <p>
	 * Operation: |v|
	 * 
	 * @return The length (magnitude) of the vector.
	 */
	default float length()
	{
		return Maths.sqrt(squaredLength());
	}
	
	/**
	 * Returns the length (magnitude) of the vector.
	 * 
	 * <p>
	 * This treats zero length vectors.
	 * If all components are exactly zero this will return zero aswell.
	 * 
	 * <p>
	 * Operation: |v|
	 * 
	 * @return The length (magnitude) of the vector.
	 */
	default float safeLength()
	{
		if(isZero()) return 0.0f;
		
		return length();
	}
	
	/**
	 * Returns the length (magnitude) of the vector.
	 * 
	 * <p>
	 * This treats zero length vectors.
	 * If all components are within an inclusive tolerance around zero (positive and negative),
	 * this will return zero aswell.
	 * 
	 * <p>
	 * Operation: |v|
	 * 
	 * @param tolerance The inclusive tolerance around zero (positive and negative).
	 * 
	 * @return The length (magnitude) of the vector.
	 */
	default float safeTrLength(float tolerance)
	{
		if(isZero(tolerance)) return 0.0f;
		
		return length();
	}
	
	/**
	 * Returns the reciprocal of the length (magnitude) of the vector.
	 * 
	 * <p>
	 * This does not treat zero length vectors.
	 * This can cause undesired results or arithmetic exceptions.
	 * 
	 * <p>
	 * Operation: 1 / |v|
	 * 
	 * @return The reciprocal of the length (magnitude) of the vector.
	 */
	default float reciprocalLength()
	{
		return 1.0f / length();
	}
	
	/**
	 * Returns the reciprocal of the length (magnitude) of the vector.
	 * 
	 * <p>
	 * This treats zero length vectors.
	 * If all components are exactly zero this will return zero aswell.
	 * 
	 * <p>
	 * Operation: 1 / |v|
	 * 
	 * @return The reciprocal of the length (magnitude) of the vector.
	 */
	default float safeReciprocalLength()
	{
		if(isZero()) return 0.0f;
		
		return reciprocalLength();
	}
	
	/**
	 * Returns the reciprocal of the length (magnitude) of the vector.
	 * 
	 * <p>
	 * This treats zero length vectors.
	 * If all components are within an inclusive tolerance around zero (positive and negative),
	 * this will return zero aswell.
	 * 
	 * <p>
	 * Operation: 1 / |v|
	 * 
	 * @param tolerance The inclusive tolerance around zero (positive and negative).
	 * 
	 * @return The reciprocal of the length (magnitude) of the vector.
	 */
	default float safeTrReciprocalLength(float tolerance)
	{
		if(isZero(tolerance)) return 0.0f;
		
		return reciprocalLength();
	}
	
	/**
	 * Normalizes the vector, therefore dividing the vector by its length to get the vector
	 * with its original direction but with a length of ~1
	 * and stores the result in a new instance of the original type of the vector.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * This does not treat zero length vectors.
	 * This can cause undesired results or arithmetic exceptions.
	 * 
	 * <p>
	 * Operation: v / |v|
	 * 
	 * @return The new object with the result.
	 */
	default Vec2fR normalizeN()
	{
		float r = reciprocalLength();
		
		return getNewInstance(getX() * r, getY() * r);
	}
	
	/**
	 * Normalizes the vector, therefore dividing the vector by its length to get the vector
	 * with its original direction but with a length of ~1
	 * and stores the result in a new instance of the original type of the vector.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * This treats zero length vectors.
	 * If all components are exactly zero this will return a new instance of the original type of the vector
	 * with all components set to zero.
	 * 
	 * <p>
	 * Operation: v / |v|
	 * 
	 * @return The new object with the result.
	 */
	default Vec2fR safeNormalizeN()
	{
		if(isZero()) return getNewInstance(0.0f);
		
		return normalizeN();
	}
	
	/**
	 * Normalizes the vector, therefore dividing the vector by its length to get the vector
	 * with its original direction but with a length of ~1
	 * and stores the result in a new instance of the original type of the vector.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * This treats zero length vectors.
	 * If all components are within an inclusive tolerance around zero (positive and negative),
	 * this will return a new instance of the original type of the vector
	 * with all components set to zero.
	 * 
	 * <p>
	 * Operation: v / |v|
	 * 
	 * @param tolerance The inclusive tolerance around zero (positive and negative).
	 * 
	 * @return The new object with the result.
	 */
	default Vec2fR safeTrNormalizeN(float tolerance)
	{
		if(isZero(tolerance)) return getNewInstance(0.0f);
		
		return normalizeN();
	}
	
	/**
	 * Normalizes the vector, therefore dividing the vector by its length to get the vector
	 * with its original direction but with a length of ~1
	 * and stores the result in the object given by the parameter res.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * This does not treat zero length vectors.
	 * This can cause undesired results or arithmetic exceptions.
	 * 
	 * <p>
	 * Operation: v / |v|

	 * @param <T> The type of the resulting tuple.
	 * 
	 * @param res The object to store the result of the operation in.
	 * 
	 * @return The new object with the result.
	 */
	default <T extends Tup2fW> T normalizeR(T res)
	{
		float r = reciprocalLength();

		res.set(getX() * r, getY() * r);
		
		return res;
	}
	
	/**
	 * Normalizes the vector, therefore dividing the vector by its length to get the vector
	 * with its original direction but with a length of ~1
	 * and stores the result in the object given by the parameter res.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * This treats zero length vectors.
	 * If all components are exactly zero this will set all components of the result tuple to zero.
	 * 
	 * <p>
	 * Operation: v / |v|

	 * @param <T> The type of the resulting tuple.
	 * 
	 * @param res The object to store the result of the operation in.
	 * 
	 * @return The new object with the result.
	 */
	default <T extends Tup2fW> T safeNormalizeR(T res)
	{
		if(isZero())
		{
			res.set(0.0f);
			
			return res;
		}
		
		return normalizeR(res);
	}
	
	/**
	 * Normalizes the vector, therefore dividing the vector by its length to get the vector
	 * with its original direction but with a length of ~1
	 * and stores the result in the object given by the parameter res.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * This treats zero length vectors.
	 * If all components are exactly zero this will set all components of the result tuple to zero.
	 * 
	 * <p>
	 * Operation: v / |v|

	 * @param <T> The type of the resulting tuple.
	 * 
	 * @param res The object to store the result of the operation in.
	 * @param tolerance The inclusive tolerance around zero (positive and negative).
	 * 
	 * @return The new object with the result.
	 */
	default <T extends Tup2fW> T safeTrNormalizeR(T res, float tolerance)
	{
		if(isZero(tolerance))
		{
			res.set(0.0f);
			
			return res;
		}
		
		return normalizeR(res);
	}
	
	/**
	 * Inverts (negates) the vector and stores the result in a new instance of the original type of the vector.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation: -v
	 * 
	 * @return The new object with the result.
	 */
	default Vec2fR invertN()
	{
		return getNewInstance(-getX(), -getY());
	}
	
	
	/**
	 * Inverts (negates) the vector and stores the result in the object given by the parameter res.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation: -v
	 * 
	 * @param <T> The type of the resulting tuple.
	 * 
	 * @param res The object to store the result of the operation in.
	 * 
	 * @return The new object with the result.
	 */
	default <T extends Tup2fW> T invertR(T res)
	{
		res.set(-getX(), -getY());
		
		return res;
	}
	
	/**
	 * Calculates the reciprocals of each component of the vector
	 * and stores the result in a new instance of the original type of the vector.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * This does not treat zero length vectors.
	 * This can cause undesired results or arithmetic exceptions.
	 * 
	 * <p>
	 * Operation: ( 1 / v.x, 1 / v.y )
	 * 
	 * @return The new object with the result.
	 */
	default Vec2fR reciprocalN()
	{
		return getNewInstance(1.0f / getX(), 1.0f / getY());
	}
	
	/**
	 * Calculates the reciprocals of each component of the vector
	 * and stores the result in a new instance of the original type of the vector.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * This treats zero length vectors.
	 * If all components are exactly zero this will return a new instance of the original type of the vector
	 * with all components set to zero.
	 * 
	 * <p>
	 * Operation: ( 1 / v.x, 1 / v.y )
	 * 
	 * @return The new object with the result.
	 */
	default Vec2fR safeReciprocalN()
	{
		if(isZero()) return getNewInstance(0.0f);
		
		return reciprocalN();
	}
	
	/**
	 * Calculates the reciprocals of each component of the vector
	 * and stores the result in a new instance of the original type of the vector.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * This treats zero length vectors.
	 * If all components are exactly zero this will set all components of the result tuple to zero.
	 * 
	 * <p>
	 * Operation: ( 1 / v.x, 1 / v.y )
	 * 
	 * @param tolerance The inclusive tolerance around zero (positive and negative).
	 * 
	 * @return The new object with the result.
	 */
	default Vec2fR safeTrReciprocalN(float tolerance)
	{
		if(isZero(tolerance)) return getNewInstance(0.0f);
		
		return reciprocalN();
	}
	
	/**
	 * Calculates the reciprocals of each component of the vector
	 * and stores the result in the object given by the parameter res.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * This does not treat zero length vectors.
	 * This can cause undesired results or arithmetic exceptions.
	 * 
	 * <p>
	 * Operation: ( 1 / v.x, 1 / v.y )
	 * 
	 * @param res The object to store the result of the operation in.
	 * 
	 * @return The new object with the result.
	 */
	default <T extends Tup2fW> T reciprocalR(T res)
	{
		res.set(1.0f / getX(), 1.0f / getY());
		
		return res;
	}
	
	/**
	 * Calculates the reciprocals of each component of the vector
	 * and stores the result in the object given by the parameter res.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * This treats zero length vectors.
	 * If all components are exactly zero this will return a new instance of the original type of the vector
	 * with all components set to zero.
	 * 
	 * <p>
	 * Operation: ( 1 / v.x, 1 / v.y )
	 * 
	 * @param res The object to store the result of the operation in.
	 * 
	 * @return The new object with the result.
	 */
	default <T extends Tup2fW> T safeReciprocalR(T res)
	{
		if(isZero())
		{
			res.set(0.0f);
			
			return res;
		}
		
		return reciprocalR(res);
	}
	
	/**
	 * Calculates the reciprocals of each component of the vector
	 * and stores the result in the object given by the parameter res.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * This treats zero length vectors.
	 * If all components are exactly zero this will set all components of the result tuple to zero.
	 * 
	 * <p>
	 * Operation: ( 1 / v.x, 1 / v.y )
	 * 
	 * @param res The object to store the result of the operation in.
	 * @param tolerance The inclusive tolerance around zero (positive and negative).
	 * 
	 * @return The new object with the result.
	 */
	default <T extends Tup2fW> T safeTrReciprocalR(T res, float tolerance)
	{
		if(isZero(tolerance))
		{
			res.set(0.0f);
			
			return res;
		}
		
		return reciprocalR(res);
	}
}
