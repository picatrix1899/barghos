package org.barghos.math.api.vector;

import org.barghos.core.api.tuple.TupfR;
import org.barghos.core.api.tuple2.Tup2fR;
import org.barghos.core.api.tuple2.Tup2fW;
import org.barghos.core.api.tuple2.Tup2oR;
import org.barghos.core.api.tuple2.Tup2oW;
import org.barghos.core.tuple2.ImmutableTup2o;

/**
 * This interface grants readonly access to any 2-dimensional float vector.
 * 
 * <p>
 * It should be prefered by design before direct usage of a type in method parameters,
 * if the method only reads data from the parameter.
 * 
 * @author picatrix1899
 * 
 * @since 1.0.0.0
 */
public interface Vec2fR extends Tup2fR
{
	/** {@inheritDoc} */
	@Override
	default Vec2fR getNewInstance(Tup2fR t)
	{
		return (Vec2fR)Tup2fR.super.getNewInstance(t);
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2fR getNewInstance(float value)
	{
		return (Vec2fR)Tup2fR.super.getNewInstance(value);
	}
	
	/** {@inheritDoc} */
	@Override
	Vec2fR getNewInstance(float x, float y);
	
	/** {@inheritDoc} */
	@Override
	default Vec2fR getNewInstanceFromArray(float... values)
	{
		return (Vec2fR)Tup2fR.super.getNewInstanceFromArray(values);
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2fR getNewInstance(TupfR t)
	{
		return (Vec2fR)Tup2fR.super.getNewInstance(t);
	}
	
	/**
	 * Returns the reciprocal length of the vector.
	 * It doesn't account for zero-length vectors and will in such case throw an {@link ArithmeticException}
	 * as this would result in a division by zero.
	 * 
	 * <p>
	 * Operation:
	 * 1 / |v|
	 * 
	 * @return The reciprocal length of the vector.
	 * 
	 * @throws
	 * ArithmeticException Thrown when it is a zero-length vector.
	 */
	default double reciprocalLength()
	{
		return 1.0 / length();
	}
	
	/**
	 * Returns the reciprocal length of the vector.
	 * If the vector is a zero-length vector the result will be zero.
	 * It determines a zero-length by checking if all components are exactly zero.
	 * Due to floating-point-errors it might still throw an {@link ArithmeticException} when
	 * the length is too close to zero.
	 * 
	 * <p>
	 * Operation:
	 * 1 / |v|
	 * 
	 * @return The reciprocal length of the vector or zero if it is a zero-length vector.
	 * 
	 * @throws
	 * ArithmeticException Might be thrown when the length is to close to zero.
	 */
	default double reciprocalLengthSafe()
	{
		if(isZero()) return 0.0;
		
		return reciprocalLength();
	}

	/**
	 * Returns the reciprocal length of the vector.
	 * If the vector is a zero-length vector the result will be zero.
	 * It determines a zero-length by checking if all components are within the margin defined by
	 * zero plus-minus the given tolerance inclusive (-tolerance <= value <= tolerance).
	 * 
	 * <p>
	 * Operation:
	 * 1 / |v|
	 * 
	 * @param tolerance The tolerance for defining the margin around zero.
	 * 
	 * @return The reciprocal length of the vector or zero if it is a zero-length vector.
	 */
	default double reciprocalLengthSafeWithMargin(float tolerance)
	{
		if(isZeroWithMargin(tolerance)) return 0.0;
		
		return reciprocalLength();
	}
	
	/**
	 * Returns the length of the vector.
	 * It doesn't account for zero-length vectors.
	 * 
	 * <p>
	 * Operation:
	 * |v|
	 * 
	 * @return The length of the vector.
	 */
	default double length()
	{
		return Math.sqrt(squaredLength());
	}
	
	/**
	 * Returns the length of the vector.
	 * If the vector is a zero-length vector the result will be zero.
	 * It determines a zero-length by checking if all components are exactly zero.
	 * 
	 * <p>
	 * Operation:
	 * |v|
	 * 
	 * @return The length of the vector or zero if it is a zero-length vector.
	 */
	default double lengthSafe()
	{
		if(isZero()) return 0.0;
		
		return length();
	}
	
	/**
	 * Returns the length of the vector.
	 * If the vector is a zero-length vector the result will be zero.
	 * It determines a zero-length by checking if all components are within the margin defined by
	 * zero plus-minus the given tolerance inclusive (-tolerance <= value <= tolerance).
	 * 
	 * <p>
	 * Operation:
	 * |v|
	 * 
	 * @param tolerance The tolerance for defining the margin around zero.
	 * 
	 * @return The length of the vector or zero if it is a zero-length vector.
	 */
	default double lengthSafeWithMargin(float tolerance)
	{
		if(isZeroWithMargin(tolerance)) return 0.0;
		
		return length();
	}
	
	/**
	 * Returns the squared length of the vector.
	 * It doesn't account for zero-length vectors.
	 * 
	 * <p>
	 * Operation:
	 * |v|²
	 * 
	 * @return The squared length of the vector.
	 */
	default double squaredLength()
	{
		float x = getX();
		float y = getY();
		
		return x * x + y * y;
	}
	
	/**
	 * Returns the squared length of the vector.
	 * If the vector is a zero-length vector the result will be zero.
	 * It determines a zero-length by checking if all components are exactly zero.
	 * 
	 * <p>
	 * Operation:
	 * |v|²
	 * 
	 * @return The squared length of the vector or zero if it is a zero-length vector.
	 */
	default double squaredLengthSafe()
	{
		if(isZero()) return 0.0;
		
		return squaredLength();
	}
	
	/**
	 * Returns the squared length of the vector.
	 * If the vector is a zero-length vector the result will be zero.
	 * It determines a zero-length by checking if all components are within the margin defined by
	 * zero plus-minus the given tolerance inclusive (-tolerance <= value <= tolerance).
	 * 
	 * <p>
	 * Operation:
	 * |v|²
	 * 
	 * @param tolerance The tolerance for defining the margin around zero.
	 * 
	 * @return The squared length of the vector or zero if it is a zero-length vector.
	 */
	default double squaredLengthSafeWithMargin(float tolerance)
	{
		if(isZeroWithMargin(tolerance)) return 0.0;
		
		return squaredLength();
	}
	
	/**
	 * Returns the dot product (scalar product) between this vector and the given tuple.
	 * 
	 * <p>
	 * Operation:
	 * v . t
	 * 
	 * @param t The tuple.
	 * 
	 * @return The dot product (scalar product) between this vector and the tuple.
	 */
	default double dot(Tup2fR t)
	{
		return dot(t.getX(), t.getY());
	}
	
	/**
	 * Returns the dot product (scalar product) between this vector and a tuple defined by the given value.
	 * 
	 * <p>
	 * Operation:
	 * v . (value, value)
	 * 
	 * @param value The value of all the components of the second tuple.
	 * 
	 * @return The dot product (scalar product) between this vector and the value.
	 */
	default double dot(float value)
	{
		return dot(value, value);
	}
	
	/**
	 * Returns the dot product (scalar product) between this vector and a tuple defined by the given component values.
	 * 
	 * <p>
	 * Operation:
	 * v . (x, y)
	 * 
	 * @param x The value of the x component of the second tuple.
	 * @param y The value of the y component of the second tuple.
	 * 
	 * @return The dot product (scalar product) between this vector and the values.
	 */
	default double dot(float x, float y)
	{
		return getX() * x + getY() * y;
	}
	
	/**
	 * Determines the smallest value of the components and returns the value and the index of the component.
	 * The index returned is limited to the range of 0 to getDimensions() - 1.
	 * If two or more components have the same value the first index will be returned.
	 * The returned tuple is immutable.
	 * 
	 * @return The smallest value of the components and the index of the corresponding component.
	 */
	default Tup2oR<Float,Integer> min()
	{
		float x = getX();
		float y = getY();
		
		float value = x;
		int index = 0;
		
		if(y < value)
		{
			value = y;
			index = 1;
		}
		
		return new ImmutableTup2o<>(value, index);
	}
	
	/**
	 * Determines the smallest value of the components and returns the value and the index of the component.
	 * The index returned is limited to the range of 0 to getDimensions() - 1.
	 * If two or more components have the same value the first index will be returned.
	 * This version utilizes a query parameter that receives the result and will be returned.
	 * 
	 * @param res The query parameter for the result.
	 * 
	 * @return The instance from the res parameter with the result.
	 */
	default <T extends Tup2oW<Float,Integer>> T minR(T res)
	{
		float x = getX();
		float y = getY();
		
		float value = x;
		int index = 0;
		
		if(y < value)
		{
			value = y;
			index = 1;
		}
		
		res.set(value, index);
		
		return res;
	}
	
	/**
	 * Determines the smallest value of the components and returns it.
	 * 
	 * @return The smallest value of the components.
	 */
	default float minValue()
	{
		float x = getX();
		float y = getY();
		
		float value = x;
		
		if(y < value)
		{
			value = y;
		}
		
		return value;
	}
	
	/**
	 * Determines the smallest value of the componensts and returns the index of the component.
	 * The index returned is limited to the range of 0 to getDimensions() - 1.
	 * If two or more components have the same value the first index will be returned.
	 * 
	 * @return The index of the smallest component.
	 */
	default int minComponent()
	{
		float x = getX();
		float y = getY();
		
		float value = x;
		int index = 0;
		
		if(y < value)
		{
			value = y;
			index = 1;
		}
		
		return index;
	}
	
	/**
	 * Determines the greatest value of the components and returns the value and the index of the component.
	 * The index returned is limited to the range of 0 to getDimensions() - 1.
	 * If two or more components have the same value the first index will be returned.
	 * The returned tuple is immutable.
	 * 
	 * @return The greatest value of the components and the index of the corresponding component.
	 */
	default Tup2oR<Float,Integer> max()
	{
		float x = getX();
		float y = getY();
		
		float value = x;
		int index = 0;
		
		if(y > value)
		{
			value = y;
			index = 1;
		}
		
		return new ImmutableTup2o<>(value, index);
	}
	
	/**
	 * Determines the greatest value of the components and returns the value and the index of the component.
	 * The index returned is limited to the range of 0 to getDimensions() - 1.
	 * If two or more components have the same value the first index will be returned.
	 * This version utilizes a query parameter that receives the result and will be returned.
	 * 
	 * @param res The query parameter for the result.
	 * 
	 * @return The instance from the res parameter with the result.
	 */
	default <T extends Tup2oW<Float,Integer>> T maxR(T res)
	{
		float x = getX();
		float y = getY();
		
		float value = x;
		int index = 0;
		
		if(y > value)
		{
			value = y;
			index = 1;
		}
		
		res.set(value, index);
		
		return res;
	}
	
	/**
	 * Determines the greatest value of the components and returns it.
	 * 
	 * @return The greatest value of the components.
	 */
	default float maxValue()
	{
		float x = getX();
		float y = getY();
		
		float value = x;
		
		if(y > value)
		{
			value = y;
		}
		
		return value;
	}
	
	/**
	 * Determines the greatest value of the componensts and returns the index of the component.
	 * The index returned is limited to the range of 0 to getDimensions() - 1.
	 * If two or more components have the same value the first index will be returned.
	 * 
	 * @return The index of the greatest component.
	 */
	default int maxComponent()
	{
		float x = getX();
		float y = getY();
		
		float value = x;
		int index = 0;
		
		if(y > value)
		{
			value = y;
			index = 1;
		}
		
		return index;
	}
	
	/**
	 * Adds the second given tuple to the current vector and saves the result in the the query parameter.
	 * This operation does not alter the current vector but only the query parameter.
	 * It is however safe to use the current vector as the query parameter.
	 * 
	 * <p>
	 * Operation:
	 * v + t
	 * 
	 * @param <T> The type of the query parameter.
	 * 
	 * @param t The second tuple to add to the current vector.
	 * @param res The query parameter to receive the result.
	 * 
	 * @return The query parameter with the result.
	 */
	default <T extends Tup2fW> T addR(Tup2fR t, T res)
	{
		return addR(t.getX(), t.getY(), res);
	}
	
	/**
	 * Adds the second tuple defined by the given value to the current vector and saves the result in the the query parameter.
	 * This operation does not alter the current vector but only the query parameter.
	 * It is however safe to use the current vector as the query parameter.
	 * 
	 * <p>
	 * Operation:
	 * v + (value, value)
	 * 
	 * @param <T> The type of the query parameter.
	 * 
	 * @param value The value of all the components of the second tuple.
	 * @param res The query parameter to receive the result.
	 * 
	 * @return The query parameter with the result.
	 */
	default <T extends Tup2fW> T addR(float value, T res)
	{
		return addR(value, value, res);
	}
	
	/**
	 * Adds the second tuple defined by the given component values to the current vector and saves the result in the the query parameter.
	 * This operation does not alter the current vector but only the query parameter.
	 * It is however safe to use the current vector as the query parameter.
	 * 
	 * <p>
	 * Operation:
	 * v + (x, y)
	 * 
	 * @param <T> The type of the query parameter.
	 * 
	 * @param x The value of the x component of the second tuple.
	 * @param y The value of the y component of the second tuple.
	 * @param res The query parameter to receive the result.
	 * 
	 * @return The query parameter with the result.
	 */
	default <T extends Tup2fW> T addR(float x, float y, T res)
	{
		res.set(getX() + x, getY() + y);
		
		return res;
	}
	
	/**
	 * Subtracts the second given tuple from the current vector and saves the result in the the query parameter.
	 * This operation does not alter the current vector but only the query parameter.
	 * It is however safe to use the current vector as the query parameter.
	 * 
	 * <p>
	 * Operation:
	 * v - t
	 * 
	 * @param <T> The type of the query parameter.
	 * 
	 * @param t The second tuple to subtract from the current vector.
	 * @param res The query parameter to receive the result.
	 * 
	 * @return The query parameter with the result.
	 */
	default <T extends Tup2fW> T subR(Tup2fR t, T res)
	{
		return subR(t.getX(), t.getY(), res);
	}
	
	/**
	 * Subtracts the second tuple defined by the given value from the current vector and saves the result in the the query parameter.
	 * This operation does not alter the current vector but only the query parameter.
	 * It is however safe to use the current vector as the query parameter.
	 * 
	 * <p>
	 * Operation:
	 * v - (value, value)
	 * 
	 * @param <T> The type of the query parameter.
	 * 
	 * @param value The value of all the components of the second tuple.
	 * @param res The query parameter to receive the result.
	 * 
	 * @return The query parameter with the result.
	 */
	default <T extends Tup2fW> T subR(float value, T res)
	{
		return subR(value, value, res);
	}
	
	/**
	 * Subtracts the second tuple defined by the given component values from the current vector and saves the result in the the query parameter.
	 * This operation does not alter the current vector but only the query parameter.
	 * It is however safe to use the current vector as the query parameter.
	 * 
	 * <p>
	 * Operation:
	 * v - (x, y)
	 * 
	 * @param <T> The type of the query parameter.
	 * 
	 * @param x The value of the x component of the second tuple.
	 * @param y The value of the y component of the second tuple.
	 * @param res The query parameter to receive the result.
	 * 
	 * @return The query parameter with the result.
	 */
	default <T extends Tup2fW> T subR(float x, float y, T res)
	{
		res.set(getX() - x, getY() - y);
		
		return res;
	}
	
	/**
	 * Subtracts the current vector from the second given tuple and saves the result in the the query parameter.
	 * This operation does not alter the current vector but only the query parameter.
	 * It is however safe to use the current vector as the query parameter.
	 * 
	 * <p>
	 * Operation:
	 * t - v
	 * 
	 * @param <T> The type of the query parameter.
	 * 
	 * @param t The second tuple of which the current vector is subtracted from.
	 * @param res The query parameter to receive the result.
	 * 
	 * @return The query parameter with the result.
	 */
	default <T extends Tup2fW> T revSubR(Tup2fR t, T res)
	{
		return revSubR(t.getX(), t.getY(), res);
	}
	
	/**
	 * Subtracts the current vector from the second tuple defined by the given value and saves the result in the the query parameter.
	 * This operation does not alter the current vector but only the query parameter.
	 * It is however safe to use the current vector as the query parameter.
	 * 
	 * <p>
	 * Operation:
	 * (value, value) - v 
	 * 
	 * @param <T> The type of the query parameter.
	 * 
	 * @param value The value of all the components of the second tuple.
	 * @param res The query parameter to receive the result.
	 * 
	 * @return The query parameter with the result.
	 */
	default <T extends Tup2fW> T revSubR(float value, T res)
	{
		return revSubR(value, value, res);
	}
	
	/**
	 * Subtracts the current vector from the second tuple defined by the given component values and saves the result in the the query parameter.
	 * This operation does not alter the current vector but only the query parameter.
	 * It is however safe to use the current vector as the query parameter.
	 * 
	 * <p>
	 * Operation:
	 * (x, y) - v 
	 * 
	 * @param <T> The type of the query parameter.
	 * 
	 * @param x The value of the x component of the second tuple.
	 * @param y The value of the y component of the second tuple.
	 * @param res The query parameter to receive the result.
	 * 
	 * @return The query parameter with the result.
	 */
	default <T extends Tup2fW> T revSubR(float x, float y, T res)
	{
		res.set(x - getX(), y - getY());
		
		return res;
	}
	
	/**
	 * Multiplies the current vector with the second given tuple and saves the result in the the query parameter.
	 * This operation does not alter the current vector but only the query parameter.
	 * It is however safe to use the current vector as the query parameter.
	 * 
	 * <p>
	 * Operation:
	 * v * t
	 * 
	 * @param <T> The type of the query parameter.
	 * 
	 * @param t The second tuple to multiply the current vector with.
	 * @param res The query parameter to receive the result.
	 * 
	 * @return The query parameter with the result.
	 */
	default <T extends Tup2fW> T mulR(Tup2fR t, T res)
	{
		return mulR(t.getX(), t.getY(), res);
	}
	
	/**
	 * Multiplies the current vector with the second tuple defined by the given value and saves the result in the the query parameter.
	 * This operation does not alter the current vector but only the query parameter.
	 * It is however safe to use the current vector as the query parameter.
	 * 
	 * <p>
	 * Operation:
	 * v * (value, value)
	 * 
	 * @param <T> The type of the query parameter.
	 * 
	 * @param value The value of all the components of the second tuple.
	 * @param res The query parameter to receive the result.
	 * 
	 * @return The query parameter with the result.
	 */
	default <T extends Tup2fW> T mulR(float value, T res)
	{
		return mulR(value, value, res);
	}
	
	/**
	 * Multiplies the current vector with the second tuple defined by the given component values and saves the result in the the query parameter.
	 * This operation does not alter the current vector but only the query parameter.
	 * It is however safe to use the current vector as the query parameter.
	 * 
	 * <p>
	 * Operation:
	 * v * (x, y)
	 * 
	 * @param <T> The type of the query parameter.
	 * 
	 * @param x The value of the x component of the second tuple.
	 * @param y The value of the y component of the second tuple.
	 * @param res The query parameter to receive the result.
	 * 
	 * @return The query parameter with the result.
	 */
	default <T extends Tup2fW> T mulR(float x, float y, T res)
	{
		res.set(getX() * x, getY() * y);
		
		return res;
	}
	
	/**
	 * Divides the current vector by the second given tuple and saves the result in the the query parameter.
	 * This operation does not alter the current vector but only the query parameter.
	 * It is however safe to use the current vector as the query parameter.
	 * 
	 * <p>
	 * Operation:
	 * v / t
	 * 
	 * @param <T> The type of the query parameter.
	 * 
	 * @param t The second tuple to divide the current vector by.
	 * @param res The query parameter to receive the result.
	 * 
	 * @return The query parameter with the result.
	 */
	default <T extends Tup2fW> T divR(Tup2fR t, T res)
	{
		return divR(t.getX(), t.getY(), res);
	}
	
	/**
	 * Divides the current vector by the second tuple defined by the given value and saves the result in the the query parameter.
	 * This operation does not alter the current vector but only the query parameter.
	 * It is however safe to use the current vector as the query parameter.
	 * 
	 * <p>
	 * Operation:
	 * v / (value, value)
	 * 
	 * @param <T> The type of the query parameter.
	 * 
	 * @param value The value of all the components of the second tuple.
	 * @param res The query parameter to receive the result.
	 * 
	 * @return The query parameter with the result.
	 */
	default <T extends Tup2fW> T divR(float value, T res)
	{
		return divR(value, value, res);
	}
	
	/**
	 * Divides the current vector by the second tuple defined by the given component values and saves the result in the the query parameter.
	 * This operation does not alter the current vector but only the query parameter.
	 * It is however safe to use the current vector as the query parameter.
	 * 
	 * <p>
	 * Operation:
	 * v / (x, y)
	 * 
	 * @param <T> The type of the query parameter.
	 * 
	 * @param x The value of the x component of the second tuple.
	 * @param y The value of the y component of the second tuple.
	 * @param res The query parameter to receive the result.
	 * 
	 * @return The query parameter with the result.
	 */
	default <T extends Tup2fW> T divR(float x, float y, T res)
	{
		res.set(getX() / x, getY() / y);
		
		return res;
	}
	
	/**
	 * Divides the second given tuple by the current vector and saves the result in the the query parameter.
	 * This operation does not alter the current vector but only the query parameter.
	 * It is however safe to use the current vector as the query parameter.
	 * 
	 * <p>
	 * Operation:
	 * t / v
	 * 
	 * @param <T> The type of the query parameter.
	 * 
	 * @param t The second tuple to divide by the current vector.
	 * @param res The query parameter to receive the result.
	 * 
	 * @return The query parameter with the result.
	 */
	default <T extends Tup2fW> T revDivR(Tup2fR t, T res)
	{
		return revDivR(t.getX(), t.getY(), res);
	}
	
	/**
	 * Divides the second tuple defined by the given value by the current vector and saves the result in the the query parameter.
	 * This operation does not alter the current vector but only the query parameter.
	 * It is however safe to use the current vector as the query parameter.
	 * 
	 * <p>
	 * Operation:
	 * (value, value) / v 
	 * 
	 * @param <T> The type of the query parameter.
	 * 
	 * @param value The value of all the components of the second tuple.
	 * @param res The query parameter to receive the result.
	 * 
	 * @return The query parameter with the result.
	 */
	default <T extends Tup2fW> T revDivR(float value, T res)
	{
		return revDivR(value, value, res);
	}
	
	/**
	 * Divides the second tuple defined by the given component values by the current vector and saves the result in the the query parameter.
	 * This operation does not alter the current vector but only the query parameter.
	 * It is however safe to use the current vector as the query parameter.
	 * 
	 * <p>
	 * Operation:
	 * (x, y) / v
	 * 
	 * @param <T> The type of the query parameter.
	 * 
	 * @param x The value of the x component of the second tuple.
	 * @param y The value of the y component of the second tuple.
	 * @param res The query parameter to receive the result.
	 * 
	 * @return The query parameter with the result.
	 */
	default <T extends Tup2fW> T revDivR(float x, float y, T res)
	{
		res.set(x / getX(), y / getY());
		
		return res;
	}
	
	/**
	 * Normalizes the current vector and saves the result in the query parameter.
	 * Normalization is done by dividing the vector by its length.
	 * This doesn't account for zero-length vectors and will in such case throw an {@link ArithmeticException}
	 * as this would result in a division by zero.
	 * This operation does not alter the current vector but only the query parameter.
	 * It is however safe to use the current vector as the query parameter.
	 * 
	 * <p>
	 * Operation:
	 * v / |v|
	 * 
	 * @param <T> The type of the query parameter.
	 * 
	 * @param res The query parameter to receive the result.
	 * 
	 * @return The query parameter with the result.
	 * 
	 * @throws ArithmeticException Thrown when it is a zero-length vector.
	 */
	default <T extends Tup2fW> T normalR(T res)
	{
		return mulR((float)reciprocalLength(), res);
	}
	
	/**
	 * Normalizes the current vector and saves the result in the query parameter.
	 * Normalization is done by dividing the vector by its length.
	 * If the vector is a zero-length vector the result will be a zero vector.
	 * It determines a zero-length by checking if all components are exactly zero.
	 * Due to floating-point-errors it might still throw an {@link ArithmeticException} when
	 * the length is too close to zero.
	 * This operation does not alter the current vector but only the query parameter.
	 * It is however safe to use the current vector as the query parameter.
	 * 
	 * <p>
	 * Operation:
	 * v / |v|
	 * 
	 * @param <T> The type of the query parameter.
	 * 
	 * @param res The query parameter to receive the result.
	 * 
	 * @return The query parameter with the result.
	 * 
	 * @throws ArithmeticException Might be thrown when the length is to close to zero.
	 */
	default <T extends Tup2fW> T normalSafeR(T res)
	{
		if(isZero())
		{
			res.set(0);
			return res;
		}
		
		return mulR((float)reciprocalLength(), res);
	}
	
	/**
	 * Normalizes the current vector and saves the result in the query parameter.
	 * Normalization is done by dividing the vector by its length.
	 * If the vector is a zero-length vector the result will be a zero vector.
	 * It determines a zero-length by checking if all components are within the margin defined by
	 * zero plus-minus the given tolerance inclusive (-tolerance <= value <= tolerance).
	 * This operation does not alter the current vector but only the query parameter.
	 * It is however safe to use the current vector as the query parameter.
	 * 
	 * <p>
	 * Operation:
	 * v / |v|
	 * 
	 * @param <T> The type of the query parameter.
	 * 
	 * @param tolerance The tolerance for defining the margin around zero.
	 * @param res The query parameter to receive the result.
	 * 
	 * @return The query parameter with the result.
	 */
	default <T extends Tup2fW> T normalSafeWithMarginR(float tolerance, T res)
	{
		if(isZeroWithMargin(tolerance)) return res;
		
		return mulR((float)reciprocalLength(), res);
	}
	
	/**
	 * Inverts the current vector and saves the result in the query parameter.
	 * This operation does not alter the current vector but only the query parameter.
	 * It is however safe to use the current vector as the query parameter.
	 * 
	 * <p>
	 * Operation:
	 * -v
	 * 
	 * @param <T> The type of the query parameter.
	 * 
	 * @param res The query parameter to receive the result.
	 * 
	 * @return The query parameter with the result.
	 */
	default <T extends Tup2fW> T invertR(T res)
	{
		return mulR(-1.0f, res);
	}
	
	/**
	 * Inverses the current vector based on the value one and saves the result in the query parameter.
	 * This operation does not alter the current vector but only the query parameter.
	 * It is however safe to use the current vector as the query parameter.
	 * 
	 * <p>
	 * Operation:
	 * 1 - v
	 * 
	 * @param <T> The type of the query parameter.
	 * 
	 * @param res The query parameter to receive the result.
	 * 
	 * @return The query parameter with the result.
	 */
	default <T extends Tup2fW> T inverseR(T res)
	{
		return revSubR(1.0f, res);
	}
	
	/**
	 * Inverses the current vector based on the given tuple and saves the result in the query parameter.
	 * It does the same as {@link #revSubR(Tup2fR, Object)} and is present for completness.
	 * This operation does not alter the current vector but only the query parameter.
	 * It is however safe to use the current vector as the query parameter.
	 * 
	 * <p>
	 * Operation:
	 * t - v
	 * 
	 * @param <T> The type of the query parameter.
	 * 
	 * @param t The tuple the inversion is based on.
	 * @param res The query parameter to receive the result.
	 * 
	 * @return The query parameter with the result.
	 */
	default <T extends Tup2fW> T inverseR(Tup2fR t, T res)
	{
		return inverseR(t.getX(), t.getY(), res);
	}
	
	/**
	 * Inverses the current vector based on the given value and saves the result in the query parameter.
	 * It does the same as {@link #revSubR(float, Object)} and is present for completness.
	 * This operation does not alter the current vector but only the query parameter.
	 * It is however safe to use the current vector as the query parameter.
	 * 
	 * <p>
	 * Operation:
	 * value - v
	 * 
	 * @param <T> The type of the query parameter.
	 * 
	 * @param value The value the inversion is based on.
	 * @param res The query parameter to receive the result.
	 * 
	 * @return The query parameter with the result.
	 */
	default <T extends Tup2fW> T inverseR(float value, T res)
	{
		return inverseR(value, value, res);
	}
	
	/**
	 * Inverses the current vector based on the given component values and saves the result in the query parameter.
	 * It does the same as {@link #revSubR(float, float, Object)} and is present for completness.
	 * This operation does not alter the current vector but only the query parameter.
	 * It is however safe to use the current vector as the query parameter.
	 * 
	 * <p>
	 * Operation:
	 * (x, y) - v
	 * 
	 * @param <T> The type of the query parameter.
	 * 
	 * @param x The value the inversion of the x component is based on.
	 * @param y The value the inversion of the y component is based on.
	 * @param res The query parameter to receive the result.
	 * 
	 * @return The query parameter with the result.
	 */
	default <T extends Tup2fW> T inverseR(float x, float y, T res)
	{
		return revSubR(x, y, res);
	}
	
	/**
	 * Adds the second given tuple to the current vector and saves the result in a new instance generated by
	 * {@link #getNewInstance(float, float)} which should result in the same type as the current vector is of.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation:
	 * v + t
	 * 
	 * @param t The second tuple to add to the current vector.
	 * 
	 * @return The new instance with the result.
	 */
	default Vec2fR addN(Tup2fR t)
	{
		return addN(t.getX(), t.getY());
	}
	
	/**
	 * Adds the second tuple defined by the given value to the current vector and saves the result in a new instance generated by
	 * {@link #getNewInstance(float, float)} which should result in the same type as the current vector is of.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation:
	 * v + (value, value)
	 * 
	 * @param value The value of all the components of the second tuple.
	 * 
	 * @return The new instance with the result.
	 */
	default Vec2fR addN(float value)
	{
		return addN(value, value);
	}
	
	/**
	 * Adds the second tuple defined by the given component values to the current vector and saves the result in
	 * a new instance generated by {@link #getNewInstance(float, float)} which should result in the same type as
	 * the current vector is of.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation:
	 * v + (x, y)
	 * 
	 * @param x The value of the x component of the second tuple.
	 * @param y The value of the y component of the second tuple.
	 * 
	 * @return The new instance with the result.
	 */
	default Vec2fR addN(float x, float y)
	{
		return getNewInstance(getX() + x, getY() + y);
	}
	
	/**
	 * Subtracts the second given tuple from the current vector and saves the result in a new instance generated by
	 * {@link #getNewInstance(float, float)} which should result in the same type as the current vector is of.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation:
	 * v - t
	 * 
	 * @param t The second tuple to subtract from the current vector.
	 * 
	 * @return The new instance with the result.
	 */
	default Vec2fR subN(Tup2fR t)
	{
		return subN(t.getX(), t.getY());
	}
	
	/**
	 * Subtracts the second tuple defined by the given value from the current vector and saves the result in a new instance generated by
	 * {@link #getNewInstance(float, float)} which should result in the same type as the current vector is of.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation:
	 * v - (value, value)
	 * 
	 * @param value The value of all the components of the second tuple.
	 * 
	 * @return The new instance with the result.
	 */
	default Vec2fR subN(float value)
	{
		return subN(value, value);
	}
	
	/**
	 * Subtracts the second tuple defined by the given component values from the current vector and saves the result in
	 * a new instance generated by {@link #getNewInstance(float, float)} which should result in the same type as
	 * the current vector is of.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation:
	 * v - (x, y)
	 * 
	 * @param x The value of the x component of the second tuple.
	 * @param y The value of the y component of the second tuple.
	 * 
	 * @return The new instance with the result.
	 */
	default Vec2fR subN(float x, float y)
	{
		return getNewInstance(getX() - x, getY() - y);
	}
	
	/**
	 * Subtracts the current vector from the second given tuple and saves the result in a new instance generated by
	 * {@link #getNewInstance(float, float)} which should result in the same type as the current vector is of.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation:
	 * t - v
	 * 
	 * @param t The second tuple of which the current vector is subtracted from.
	 * 
	 * @return The new instance with the result.
	 */
	default Vec2fR revSubN(Tup2fR t)
	{
		return revSubN(t.getX(), t.getY());
	}
	
	/**
	 * Subtracts the current vector from the second tuple defined by the given value and saves the result in a new instance generated by
	 * {@link #getNewInstance(float, float)} which should result in the same type as the current vector is of.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation:
	 * (value, value) - v 
	 * 
	 * @param value The value of all the components of the second tuple.
	 * 
	 * @return The new instance with the result.
	 */
	default Vec2fR revSubN(float value)
	{
		return revSubN(value, value);
	}
	
	/**
	 * Subtracts the current vector from the second tuple defined by the given component values and saves the result in
	 * a new instance generated by {@link #getNewInstance(float, float)} which should result in the same type as
	 * the current vector is of.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation:
	 * (x, y) - v 
	 * 
	 * @param x The value of the x component of the second tuple.
	 * @param y The value of the y component of the second tuple.
	 * 
	 * @return The new instance with the result.
	 */
	default Vec2fR revSubN(float x, float y)
	{
		return getNewInstance(x - getX(), y - getY());
	}
	
	/**
	 * Multiplies the current vector with the second given tuple and saves the result in a new instance generated by
	 * {@link #getNewInstance(float, float)} which should result in the same type as the current vector is of.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation:
	 * v * t
	 * 
	 * @param t The second tuple to multiply the current vector with.
	 * 
	 * @return The new instance with the result.
	 */
	default Vec2fR mulN(Tup2fR t)
	{
		return mulN(t.getX(), t.getY());
	}
	
	/**
	 * Multiplies the current vector with the second tuple defined by the given value and saves the result in a new instance generated by
	 * {@link #getNewInstance(float, float)} which should result in the same type as the current vector is of.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation:
	 * v * (value, value)
	 * 
	 * @param value The value of all the components of the second tuple.
	 * 
	 * @return The new instance with the result.
	 */
	default Vec2fR mulN(float value)
	{
		return mulN(value, value);
	}
	
	/**
	 * Multiplies the current vector with the second tuple defined by the given component values and saves the result in
	 * a new instance generated by {@link #getNewInstance(float, float)} which should result in the same type as the current vector is of.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation:
	 * v * (x, y)
	 * 
	 * @param x The value of the x component of the second tuple.
	 * @param y The value of the y component of the second tuple.
	 * 
	 * @return The new instance with the result.
	 */
	default Vec2fR mulN(float x, float y)
	{
		return getNewInstance(getX() * x, getY() * y);
	}
	
	/**
	 * Divides the current vector by the second given tuple and saves the result in a new instance generated by
	 * {@link #getNewInstance(float, float)} which should result in the same type as the current vector is of.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation:
	 * v / t
	 * 
	 * @param t The second tuple to divide the current vector by.
	 * 
	 * @return The new instance with the result.
	 */
	default Vec2fR divN(Tup2fR t)
	{
		return divN(t.getX(), t.getY());
	}
	
	/**
	 * Divides the current vector by the second tuple defined by the given value and saves the result in a new instance generated by
	 * {@link #getNewInstance(float, float)} which should result in the same type as the current vector is of.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation:
	 * v / (value, value)
	 * 
	 * @param value The value of all the components of the second tuple.
	 * 
	 * @return The new instance with the result.
	 */
	default Vec2fR divN(float value)
	{
		return divN(value, value);
	}
	
	/**
	 * Divides the current vector by the second tuple defined by the given component values and saves the result in
	 * a new instance generated by {@link #getNewInstance(float, float)} which should result in the same type as the current vector is of.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation:
	 * v / (x, y)
	 * 
	 * @param x The value of the x component of the second tuple.
	 * @param y The value of the y component of the second tuple.
	 * 
	 * @return The new instance with the result.
	 */
	default Vec2fR divN(float x, float y)
	{
		return getNewInstance(getX() / x, getY() / y);
	}
	
	/**
	 * Divides the second given tuple by the current vector and saves the result in a new instance generated by
	 * {@link #getNewInstance(float, float)} which should result in the same type as the current vector is of.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation:
	 * t / v
	 * 
	 * @param t The second tuple to divide by the current vector.
	 * 
	 * @return The new instance with the result.
	 */
	default Vec2fR revDivN(Tup2fR t)
	{
		return revDivN(t.getX(), t.getY());
	}
	
	/**
	 * Divides the second tuple defined by the given value by the current vector and saves the result in a new instance generated by
	 * {@link #getNewInstance(float, float)} which should result in the same type as the current vector is of.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation:
	 * (value, value) / v 
	 * 
	 * @param value The value of all the components of the second tuple.
	 * 
	 * @return The new instance with the result.
	 */
	default Vec2fR revDivN(float value)
	{
		return revDivN(value, value);
	}
	
	/**
	 * Divides the second tuple defined by the given component values by the current vector and saves the result in
	 * a new instance generated by {@link #getNewInstance(float, float)} which should result in the same type as the current vector is of.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation:
	 * (x, y) / v
	 * 
	 * @param x The value of the x component of the second tuple.
	 * @param y The value of the y component of the second tuple.
	 * 
	 * @return The new instance with the result.
	 */
	default Vec2fR revDivN(float x, float y)
	{
		return getNewInstance(x / getX(), y / getY());
	}
	
	/**
	 * Normalizes the current vector and saves the result in a new instance generated by
	 * {@link #getNewInstance(float, float)} which should result in the same type as the current vector is of.
	 * Normalization is done by dividing the vector by its length.
	 * This doesn't account for zero-length vectors and will in such case throw an {@link ArithmeticException}
	 * as this would result in a division by zero.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation:
	 * v / |v|
	 * 
	 * @param res The query parameter to receive the result.
	 * 
	 * @return The new instance with the result.
	 * 
	 * @throws ArithmeticException Thrown when it is a zero-length vector.
	 */
	default Vec2fR normalN()
	{
		return mulN((float)reciprocalLength());
	}
	
	/**
	 * Normalizes the current vector and saves the result in a new instance generated by
	 * {@link #getNewInstance(float, float)} which should result in the same type as the current vector is of.
	 * Normalization is done by dividing the vector by its length.
	 * If the vector is a zero-length vector the result will be a zero vector.
	 * It determines a zero-length by checking if all components are exactly zero.
	 * Due to floating-point-errors it might still throw an {@link ArithmeticException} when
	 * the length is too close to zero.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation:
	 * v / |v|
	 * 
	 * @param res The query parameter to receive the result.
	 * 
	 * @return The new instance with the result.
	 * 
	 * @throws ArithmeticException Might be thrown when the length is to close to zero.
	 */
	default Vec2fR normalSafeN()
	{
		if(isZero()) return getNewInstance(this);
		
		return mulN((float)reciprocalLength());
	}
	
	/**
	 * Normalizes the current vector and saves the result in a new instance generated by
	 * {@link #getNewInstance(float, float)} which should result in the same type as the current vector is of.
	 * Normalization is done by dividing the vector by its length.
	 * If the vector is a zero-length vector the result will be a zero vector.
	 * It determines a zero-length by checking if all components are within the margin defined by
	 * zero plus-minus the given tolerance inclusive (-tolerance <= value <= tolerance).
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation:
	 * v / |v|
	 * 
	 * @param tolerance The tolerance for defining the margin around zero.
	 * 
	 * @return The new instance with the result.
	 */
	default Vec2fR normalSafeWithMarginN(float tolerance)
	{
		if(isZeroWithMargin(tolerance)) return getNewInstance(this);
		
		return mulN((float)reciprocalLength());
	}
	
	/**
	 * Inverts the current vector and saves the result in a new instance generated by
	 * {@link #getNewInstance(float, float)} which should result in the same type as the current vector is of.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation:
	 * -v
	 * 
	 * @return The new instance with the result.
	 */
	default Vec2fR invertN()
	{
		return mulN(-1.0f);
	}
	
	/**
	 * Inverses the current vector based on the value one and saves the result in a new instance generated by
	 * {@link #getNewInstance(float, float)} which should result in the same type as the current vector is of.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation:
	 * 1 - v
	 * 
	 * @return The new instance with the result.
	 */
	default Vec2fR inverseN()
	{
		return revSubN(1.0f);
	}
	
	/**
	 * Inverses the current vector based on the given tuple and saves the result in a new instance generated by
	 * {@link #getNewInstance(float, float)} which should result in the same type as the current vector is of.
	 * It does the same as {@link #revSubR(Tup2fR, Object)} and is present for completness.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation:
	 * t - v
	 * 
	 * @param t The tuple the inversion is based on.
	 * 
	 * @return The new instance with the result.
	 */
	default Vec2fR inverseN(Tup2fR t)
	{
		return inverseN(t.getX(), t.getY());
	}
	
	/**
	 * Inverses the current vector based on the given value and saves the result in a new instance generated by
	 * {@link #getNewInstance(float, float)} which should result in the same type as the current vector is of.
	 * It does the same as {@link #revSubR(float, Object)} and is present for completness.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation:
	 * value - v
	 * 
	 * @param value The value the inversion is based on.
	 * 
	 * @return The new instance with the result.
	 */
	default Vec2fR inverseN(float value)
	{
		return inverseN(value, value);
	}
	
	/**
	 * Inverses the current vector based on the given component values and saves the result in a new instance generated by
	 * {@link #getNewInstance(float, float)} which should result in the same type as the current vector is of.
	 * It does the same as {@link #revSubR(float, float, Object)} and is present for completness.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation:
	 * (x, y) - v
	 * 
	 * @param x The value the inversion of the x component is based on.
	 * @param y The value the inversion of the y component is based on.
	 * 
	 * @return The new instance with the result.
	 */
	default Vec2fR inverseN(float x, float y)
	{
		return revSubN(x, y);
	}
}
