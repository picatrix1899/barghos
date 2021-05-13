package org.barghos.math.api.vec2;

import org.barghos.core.api.tuple2.Tup2dR;
import org.barghos.core.api.tuple2.Tup2dW;
import org.barghos.core.api.util.Maths;

public interface Vec2dR extends Tup2dR
{
	@Override
	default Vec2dR getNewInstance(Tup2dR t)
	{
		return getNewInstance(t.getX(), t.getY());
	}
	
	@Override
	default Vec2dR getNewInstance(double value)
	{
		return getNewInstance(value, value);
	}
	
	@Override
	Vec2dR getNewInstance(double x, double y);
	
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
	default Vec2dR addN(Tup2dR t)
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
	default Vec2dR addN(double value)
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
	default Vec2dR addN(double x, double y)
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
	default Vec2dR subN(Tup2dR t)
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
	default Vec2dR subN(double value)
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
	default Vec2dR subN(double x, double y)
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
	default Vec2dR mulN(Tup2dR t)
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
	default Vec2dR mulN(double value)
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
	default Vec2dR mulN(double x, double y)
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
	default Vec2dR divN(Tup2dR t)
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
	default Vec2dR divN(double value)
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
	default Vec2dR divN(double x, double y)
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
	default <T extends Tup2dW> T addR(T res, Tup2dR t)
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
	default <T extends Tup2dW> T addR(T res, double value)
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
	default <T extends Tup2dW> T addR(T res, double x, double y)
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
	default <T extends Tup2dW> T subR(T res, Tup2dR t)
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
	default <T extends Tup2dW> T subR(T res, double value)
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
	default <T extends Tup2dW> T subR(T res, double x, double y)
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
	default <T extends Tup2dW> T mulR(T res, Tup2dR t)
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
	default <T extends Tup2dW> T mulR(T res, double value)
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
	default <T extends Tup2dW> T mulR(T res, double x, double y)
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
	default <T extends Tup2dW> T divR(T res, Tup2dR t)
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
	default <T extends Tup2dW> T divR(T res, double value)
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
	default <T extends Tup2dW> T divR(T res, double x, double y)
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
	default double dot(Tup2dR t)
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
	default double dot(double value)
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
	default double dot(double x, double y)
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
	default double squaredLength()
	{
		double x = getX();
		double y = getY();
		
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
	default double safeSquaredLength()
	{
		if(isZero()) return 0.0;
		
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
	default double safeTrSquaredLength(double tolerance)
	{
		if(isZero(tolerance)) return 0.0;
		
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
	default double length()
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
	default double safeLength()
	{
		if(isZero()) return 0.0;
		
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
	default double safeTrLength(double tolerance)
	{
		if(isZero(tolerance)) return 0.0;
		
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
	default double reciprocalLength()
	{
		return 1.0 / length();
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
	default double safeReciprocalLength()
	{
		if(isZero()) return 0.0;
		
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
	default double safeTrReciprocalLength(double tolerance)
	{
		if(isZero(tolerance)) return 0.0;
		
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
	default Vec2dR normalizeN()
	{
		double r = reciprocalLength();
		
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
	default Vec2dR safeNormalizeN()
	{
		if(isZero()) return getNewInstance(0.0);
		
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
	default Vec2dR safeTrNormalizeN(double tolerance)
	{
		if(isZero(tolerance)) return getNewInstance(0.0);
		
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
	default <T extends Tup2dW> T normalizeR(T res)
	{
		double r = reciprocalLength();

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
	default <T extends Tup2dW> T safeNormalizeR(T res)
	{
		if(isZero())
		{
			res.set(0.0);
			
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
	default <T extends Tup2dW> T safeTrNormalizeR(T res, double tolerance)
	{
		if(isZero(tolerance))
		{
			res.set(0.0);
			
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
	default Vec2dR invertN()
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
	default <T extends Tup2dW> T invertR(T res)
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
	default Vec2dR reciprocalN()
	{
		return getNewInstance(1.0 / getX(), 1.0 / getY());
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
	default Vec2dR safeReciprocalN()
	{
		if(isZero()) return getNewInstance(0.0);
		
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
	default Vec2dR safeTrReciprocalN(double tolerance)
	{
		if(isZero(tolerance)) return getNewInstance(0.0);
		
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
	default <T extends Tup2dW> T reciprocalR(T res)
	{
		res.set(1.0 / getX(), 1.0 / getY());
		
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
	default <T extends Tup2dW> T safeReciprocalR(T res)
	{
		if(isZero())
		{
			res.set(0.0);
			
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
	default <T extends Tup2dW> T safeTrReciprocalR(T res, double tolerance)
	{
		if(isZero(tolerance))
		{
			res.set(0.0);
			
			return res;
		}
		
		return reciprocalR(res);
	}
}
