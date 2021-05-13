package org.barghos.math.api.vec2;

import java.math.BigDecimal;
import java.math.MathContext;

import org.barghos.core.api.tuple2.Tup2bigdR;
import org.barghos.core.api.tuple2.Tup2bigdW;

public interface Vec2bigdR extends Tup2bigdR
{
	@Override
	default Vec2bigdR getNewInstance(Tup2bigdR t)
	{
		return getNewInstance(t.getX(), t.getY());
	}
	
	@Override
	default Vec2bigdR getNewInstance(BigDecimal value)
	{
		return getNewInstance(value, value);
	}
	
	@Override
	Vec2bigdR getNewInstance(BigDecimal x, BigDecimal y);
	
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
	default Vec2bigdR addN(Tup2bigdR t)
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
	default Vec2bigdR addN(BigDecimal value)
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
	default Vec2bigdR addN(BigDecimal x, BigDecimal y)
	{
		return getNewInstance(getX().add(x), getY().add(y));
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
	default Vec2bigdR subN(Tup2bigdR t)
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
	default Vec2bigdR subN(BigDecimal value)
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
	default Vec2bigdR subN(BigDecimal x, BigDecimal y)
	{
		return getNewInstance(getX().subtract(x), getY().subtract(y));
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
	default Vec2bigdR mulN(Tup2bigdR t)
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
	default Vec2bigdR mulN(BigDecimal value)
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
	default Vec2bigdR mulN(BigDecimal x, BigDecimal y)
	{
		return getNewInstance(getX().multiply(x), getY().multiply(y));
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
	default Vec2bigdR divN(Tup2bigdR t)
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
	default Vec2bigdR divN(BigDecimal value)
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
	default Vec2bigdR divN(BigDecimal x, BigDecimal y)
	{
		return getNewInstance(getX().divide(x), getY().divide(y));
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
	default <T extends Tup2bigdW> T addR(T res, Tup2bigdR t)
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
	default <T extends Tup2bigdW> T addR(T res, BigDecimal value)
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
	default <T extends Tup2bigdW> T addR(T res, BigDecimal x, BigDecimal y)
	{
		res.set(getX().add(x), getY().add(y));
		
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
	default <T extends Tup2bigdW> T subR(T res, Tup2bigdR t)
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
	default <T extends Tup2bigdW> T subR(T res, BigDecimal value)
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
	default <T extends Tup2bigdW> T subR(T res, BigDecimal x, BigDecimal y)
	{
		res.set(getX().subtract(x), getY().subtract(y));
		
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
	default <T extends Tup2bigdW> T mulR(T res, Tup2bigdR t)
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
	default <T extends Tup2bigdW> T mulR(T res, BigDecimal value)
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
	default <T extends Tup2bigdW> T mulR(T res, BigDecimal x, BigDecimal y)
	{
		res.set(getX().multiply(x), getY().multiply(y));
		
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
	default <T extends Tup2bigdW> T divR(T res, Tup2bigdR t)
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
	default <T extends Tup2bigdW> T divR(T res, BigDecimal value)
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
	default <T extends Tup2bigdW> T divR(T res, BigDecimal x, BigDecimal y)
	{
		res.set(getX().divide(x), getY().divide(y));
		
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
	default BigDecimal dot(Tup2bigdR t)
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
	default BigDecimal dot(BigDecimal value)
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
	default BigDecimal dot(BigDecimal x, BigDecimal y)
	{
		return getX().multiply(x).add(getY().multiply(y));
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
	default BigDecimal squaredLength()
	{
		BigDecimal x = getX();
		BigDecimal y = getY();
		
		return x.multiply(x).add(y.multiply(y));
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
	default BigDecimal safeSquaredLength()
	{
		if(isZero()) return BigDecimal.ZERO;
		
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
	default BigDecimal safeTrSquaredLength(BigDecimal tolerance)
	{
		if(isZero(tolerance)) return BigDecimal.ZERO;
		
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
	default BigDecimal length()
	{
		return squaredLength().sqrt(MathContext.DECIMAL128);
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
	default BigDecimal safeLength()
	{
		if(isZero()) return BigDecimal.ZERO;
		
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
	default BigDecimal safeTrLength(BigDecimal tolerance)
	{
		if(isZero(tolerance)) return BigDecimal.ZERO;
		
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
	default BigDecimal reciprocalLength()
	{
		return BigDecimal.ONE.divide(length());
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
	default BigDecimal safeReciprocalLength()
	{
		if(isZero()) return BigDecimal.ZERO;
		
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
	default BigDecimal safeTrReciprocalLength(BigDecimal tolerance)
	{
		if(isZero(tolerance)) return BigDecimal.ZERO;
		
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
	default Vec2bigdR normalizeN()
	{
		BigDecimal r = reciprocalLength();
		
		return getNewInstance(getX().multiply(r), getY().multiply(r));
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
	default Vec2bigdR safeNormalizeN()
	{
		if(isZero()) return getNewInstance(BigDecimal.ZERO);
		
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
	default Vec2bigdR safeTrNormalizeN(BigDecimal tolerance)
	{
		if(isZero(tolerance)) return getNewInstance(BigDecimal.ZERO);
		
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
	default <T extends Tup2bigdW> T normalizeR(T res)
	{
		BigDecimal r = reciprocalLength();

		res.set(getX().multiply(r), getY().multiply(r));
		
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
	default <T extends Tup2bigdW> T safeNormalizeR(T res)
	{
		if(isZero())
		{
			res.set(BigDecimal.ZERO);
			
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
	default <T extends Tup2bigdW> T safeTrNormalizeR(T res, BigDecimal tolerance)
	{
		if(isZero(tolerance))
		{
			res.set(BigDecimal.ZERO);
			
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
	default Vec2bigdR invertN()
	{
		return getNewInstance(getX().negate(), getY().negate());
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
	default <T extends Tup2bigdW> T invertR(T res)
	{
		res.set(getX().negate(), getY().negate());
		
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
	default Vec2bigdR reciprocalN()
	{
		return getNewInstance(BigDecimal.ONE.divide(getX()), BigDecimal.ONE.divide(getY()));
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
	default Vec2bigdR safeReciprocalN()
	{
		if(isZero()) return getNewInstance(BigDecimal.ZERO);
		
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
	default Vec2bigdR safeTrReciprocalN(BigDecimal tolerance)
	{
		if(isZero(tolerance)) return getNewInstance(BigDecimal.ZERO);
		
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
	default <T extends Tup2bigdW> T reciprocalR(T res)
	{
		res.set(BigDecimal.ONE.divide(getX()), BigDecimal.ONE.divide(getY()));
		
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
	default <T extends Tup2bigdW> T safeReciprocalR(T res)
	{
		if(isZero())
		{
			res.set(BigDecimal.ZERO);
			
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
	default <T extends Tup2bigdW> T safeTrReciprocalR(T res, BigDecimal tolerance)
	{
		if(isZero(tolerance))
		{
			res.set(BigDecimal.ZERO);
			
			return res;
		}
		
		return reciprocalR(res);
	}
}
