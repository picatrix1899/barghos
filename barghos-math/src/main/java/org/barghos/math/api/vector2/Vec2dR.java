package org.barghos.math.api.vector2;

import org.barghos.core.api.tuple.TupdR;
import org.barghos.core.api.tuple2.Tup2dR;
import org.barghos.core.api.tuple2.Tup2dW;
import org.barghos.core.api.tuple2.Tup2oR;
import org.barghos.core.api.tuple2.Tup2oW;
import org.barghos.core.tuple2.ImmutableTup2o;

/**
 * This interface grants readonly access to any 2-dimensional double vector.
 * 
 * <p>
 * It should be prefered by design before direct usage of a type in method parameters,
 * if the method only reads data from the parameter.
 * 
 * @author picatrix1899
 * 
 * @since 1.0.0.0
 */
public interface Vec2dR extends Tup2dR
{
	/** {@inheritDoc} */
	@Override
	default Vec2dR getNewInstance(Tup2dR t)
	{
		return (Vec2dR)Tup2dR.super.getNewInstance(t);
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2dR getNewInstance(double value)
	{
		return (Vec2dR)Tup2dR.super.getNewInstance(value);
	}
	
	/** {@inheritDoc} */
	@Override
	Vec2dR getNewInstance(double x, double y);
	
	/** {@inheritDoc} */
	@Override
	default Vec2dR getNewInstanceFromArray(double... values)
	{
		return (Vec2dR)Tup2dR.super.getNewInstanceFromArray(values);
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2dR getNewInstance(TupdR t)
	{
		return (Vec2dR)Tup2dR.super.getNewInstance(t);
	}
	
	/**
	 * Returns the reciprocal length of the vector.
	 * It doesn't account for zero-length vectors and will in such case throw an {@link ArithmeticException}
	 * as this would result in a division by zero.
	 * 
	 * <p>
	 * Operation:
	 * 1 / |v|
	 * </p>
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
	 * </p>
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
	 * </p>
	 * 
	 * @param tolerance The tolerance for defining the margin around zero.
	 * 
	 * @return The reciprocal length of the vector or zero if it is a zero-length vector.
	 */
	default double reciprocalLengthSafeWithMargin(double tolerance)
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
	 * </p>
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
	 * </p>
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
	 * </p>
	 * 
	 * @param tolerance The tolerance for defining the margin around zero.
	 * 
	 * @return The length of the vector or zero if it is a zero-length vector.
	 */
	default double lengthSafeWithMargin(double tolerance)
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
	 * </p>
	 * 
	 * @return The squared length of the vector.
	 */
	default double squaredLength()
	{
		double x = getX();
		double y = getY();
		
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
	 * </p>
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
	 * </p>
	 * 
	 * @param tolerance The tolerance for defining the margin around zero.
	 * 
	 * @return The squared length of the vector or zero if it is a zero-length vector.
	 */
	default double squaredLengthSafeWithMargin(double tolerance)
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
	 * </p>
	 * 
	 * @param t The tuple.
	 * 
	 * @return The dot product (scalar product) between this vector and the tuple.
	 */
	default double dot(Tup2dR t)
	{
		return dot(t.getX(), t.getY());
	}
	
	/**
	 * Returns the dot product (scalar product) between this vector and a tuple defined by the given value.
	 * 
	 * <p>
	 * Operation:
	 * v . (value, value)
	 * </p>
	 * 
	 * @param value The value of all the components of the second tuple.
	 * 
	 * @return The dot product (scalar product) between this vector and the value.
	 */
	default double dot(double value)
	{
		return dot(value, value);
	}
	
	/**
	 * Returns the dot product (scalar product) between this vector and a tuple defined by the given component values.
	 * 
	 * <p>
	 * Operation:
	 * v . (x, y)
	 * </p>
	 * 
	 * @param x The value of the x component of the second tuple.
	 * @param y The value of the y component of the second tuple.
	 * 
	 * @return The dot product (scalar product) between this vector and the values.
	 */
	default double dot(double x, double y)
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
	default Tup2oR<Double,Integer> min()
	{
		double x = getX();
		double y = getY();
		
		double value = x;
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
	default <T extends Tup2oW<Double,Integer>> T minR(T res)
	{
		double x = getX();
		double y = getY();
		
		double value = x;
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
	default double minValue()
	{
		double x = getX();
		double y = getY();
		
		double value = x;
		
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
		double x = getX();
		double y = getY();
		
		double value = x;
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
	default Tup2oR<Double,Integer> max()
	{
		double x = getX();
		double y = getY();
		
		double value = x;
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
	default <T extends Tup2oW<Double,Integer>> T maxR(T res)
	{
		double x = getX();
		double y = getY();
		
		double value = x;
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
	default double maxValue()
	{
		double x = getX();
		double y = getY();
		
		double value = x;
		
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
		double x = getX();
		double y = getY();
		
		double value = x;
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
	 * </p>
	 * 
	 * @param <T> The type of the query parameter.
	 * 
	 * @param t The second tuple to add to the current vector.
	 * @param res The query parameter to receive the result.
	 * 
	 * @return The query parameter with the result.
	 */
	default <T extends Tup2dW> T addR(Tup2dR t, T res)
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
	 * </p>
	 * 
	 * @param <T> The type of the query parameter.
	 * 
	 * @param value The value of all the components of the second tuple.
	 * @param res The query parameter to receive the result.
	 * 
	 * @return The query parameter with the result.
	 */
	default <T extends Tup2dW> T addR(double value, T res)
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
	 * </p>
	 * 
	 * @param <T> The type of the query parameter.
	 * 
	 * @param x The value of the x component of the second tuple.
	 * @param y The value of the y component of the second tuple.
	 * @param res The query parameter to receive the result.
	 * 
	 * @return The query parameter with the result.
	 */
	default <T extends Tup2dW> T addR(double x, double y, T res)
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
	 * </p>
	 * 
	 * @param <T> The type of the query parameter.
	 * 
	 * @param t The second tuple to subtract from the current vector.
	 * @param res The query parameter to receive the result.
	 * 
	 * @return The query parameter with the result.
	 */
	default <T extends Tup2dW> T subR(Tup2dR t, T res)
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
	 * </p>
	 * 
	 * @param <T> The type of the query parameter.
	 * 
	 * @param value The value of all the components of the second tuple.
	 * @param res The query parameter to receive the result.
	 * 
	 * @return The query parameter with the result.
	 */
	default <T extends Tup2dW> T subR(double value, T res)
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
	 * </p>
	 * 
	 * @param <T> The type of the query parameter.
	 * 
	 * @param x The value of the x component of the second tuple.
	 * @param y The value of the y component of the second tuple.
	 * @param res The query parameter to receive the result.
	 * 
	 * @return The query parameter with the result.
	 */
	default <T extends Tup2dW> T subR(double x, double y, T res)
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
	 * </p>
	 * 
	 * @param <T> The type of the query parameter.
	 * 
	 * @param t The second tuple of which the current vector is subtracted from.
	 * @param res The query parameter to receive the result.
	 * 
	 * @return The query parameter with the result.
	 */
	default <T extends Tup2dW> T revSubR(Tup2dR t, T res)
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
	 * </p>
	 * 
	 * @param <T> The type of the query parameter.
	 * 
	 * @param value The value of all the components of the second tuple.
	 * @param res The query parameter to receive the result.
	 * 
	 * @return The query parameter with the result.
	 */
	default <T extends Tup2dW> T revSubR(double value, T res)
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
	 * </p>
	 * 
	 * @param <T> The type of the query parameter.
	 * 
	 * @param x The value of the x component of the second tuple.
	 * @param y The value of the y component of the second tuple.
	 * @param res The query parameter to receive the result.
	 * 
	 * @return The query parameter with the result.
	 */
	default <T extends Tup2dW> T revSubR(double x, double y, T res)
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
	 * </p>
	 * 
	 * @param <T> The type of the query parameter.
	 * 
	 * @param t The second tuple to multiply the current vector with.
	 * @param res The query parameter to receive the result.
	 * 
	 * @return The query parameter with the result.
	 */
	default <T extends Tup2dW> T mulR(Tup2dR t, T res)
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
	 * </p>
	 * 
	 * @param <T> The type of the query parameter.
	 * 
	 * @param value The value of all the components of the second tuple.
	 * @param res The query parameter to receive the result.
	 * 
	 * @return The query parameter with the result.
	 */
	default <T extends Tup2dW> T mulR(double value, T res)
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
	 * </p>
	 * 
	 * @param <T> The type of the query parameter.
	 * 
	 * @param x The value of the x component of the second tuple.
	 * @param y The value of the y component of the second tuple.
	 * @param res The query parameter to receive the result.
	 * 
	 * @return The query parameter with the result.
	 */
	default <T extends Tup2dW> T mulR(double x, double y, T res)
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
	 * </p>
	 * 
	 * @param <T> The type of the query parameter.
	 * 
	 * @param t The second tuple to divide the current vector by.
	 * @param res The query parameter to receive the result.
	 * 
	 * @return The query parameter with the result.
	 */
	default <T extends Tup2dW> T divR(Tup2dR t, T res)
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
	 * </p>
	 * 
	 * @param <T> The type of the query parameter.
	 * 
	 * @param value The value of all the components of the second tuple.
	 * @param res The query parameter to receive the result.
	 * 
	 * @return The query parameter with the result.
	 */
	default <T extends Tup2dW> T divR(double value, T res)
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
	 * </p>
	 * 
	 * @param <T> The type of the query parameter.
	 * 
	 * @param x The value of the x component of the second tuple.
	 * @param y The value of the y component of the second tuple.
	 * @param res The query parameter to receive the result.
	 * 
	 * @return The query parameter with the result.
	 */
	default <T extends Tup2dW> T divR(double x, double y, T res)
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
	 * </p>
	 * 
	 * @param <T> The type of the query parameter.
	 * 
	 * @param t The second tuple to divide by the current vector.
	 * @param res The query parameter to receive the result.
	 * 
	 * @return The query parameter with the result.
	 */
	default <T extends Tup2dW> T revDivR(Tup2dR t, T res)
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
	 * </p>
	 * 
	 * @param <T> The type of the query parameter.
	 * 
	 * @param value The value of all the components of the second tuple.
	 * @param res The query parameter to receive the result.
	 * 
	 * @return The query parameter with the result.
	 */
	default <T extends Tup2dW> T revDivR(double value, T res)
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
	 * </p>
	 * 
	 * @param <T> The type of the query parameter.
	 * 
	 * @param x The value of the x component of the second tuple.
	 * @param y The value of the y component of the second tuple.
	 * @param res The query parameter to receive the result.
	 * 
	 * @return The query parameter with the result.
	 */
	default <T extends Tup2dW> T revDivR(double x, double y, T res)
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
	 * </p>
	 * 
	 * @param <T> The type of the query parameter.
	 * 
	 * @param res The query parameter to receive the result.
	 * 
	 * @return The query parameter with the result.
	 * 
	 * @throws ArithmeticException Thrown when it is a zero-length vector.
	 */
	default <T extends Tup2dW> T normalR(T res)
	{
		return mulR(reciprocalLength(), res);
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
	 * </p>
	 * 
	 * @param <T> The type of the query parameter.
	 * 
	 * @param res The query parameter to receive the result.
	 * 
	 * @return The query parameter with the result.
	 * 
	 * @throws ArithmeticException Might be thrown when the length is to close to zero.
	 */
	default <T extends Tup2dW> T normalSafeR(T res)
	{
		if(isZero())
		{
			res.set(0);
			return res;
		}
		
		return mulR(reciprocalLength(), res);
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
	 * </p>
	 * 
	 * @param <T> The type of the query parameter.
	 * 
	 * @param tolerance The tolerance for defining the margin around zero.
	 * @param res The query parameter to receive the result.
	 * 
	 * @return The query parameter with the result.
	 */
	default <T extends Tup2dW> T normalSafeWithMarginR(double tolerance, T res)
	{
		if(isZeroWithMargin(tolerance)) return res;
		
		return mulR(reciprocalLength(), res);
	}
	
	/**
	 * Inverts the current vector and saves the result in the query parameter.
	 * This operation does not alter the current vector but only the query parameter.
	 * It is however safe to use the current vector as the query parameter.
	 * 
	 * <p>
	 * Operation:
	 * -v
	 * </p>
	 * 
	 * @param <T> The type of the query parameter.
	 * 
	 * @param res The query parameter to receive the result.
	 * 
	 * @return The query parameter with the result.
	 */
	default <T extends Tup2dW> T invertR(T res)
	{
		return mulR(-1.0, res);
	}
	
	/**
	 * Inverses the current vector based on the value one and saves the result in the query parameter.
	 * This operation does not alter the current vector but only the query parameter.
	 * It is however safe to use the current vector as the query parameter.
	 * 
	 * <p>
	 * Operation:
	 * 1 - v
	 * </p>
	 * 
	 * @param <T> The type of the query parameter.
	 * 
	 * @param res The query parameter to receive the result.
	 * 
	 * @return The query parameter with the result.
	 */
	default <T extends Tup2dW> T inverseR(T res)
	{
		return revSubR(1.0, res);
	}
	
	/**
	 * Inverses the current vector based on the given tuple and saves the result in the query parameter.
	 * It does the same as {@link #revSubR(Tup2dR, Object)} and is present for completness.
	 * This operation does not alter the current vector but only the query parameter.
	 * It is however safe to use the current vector as the query parameter.
	 * 
	 * <p>
	 * Operation:
	 * t - v
	 * </p>
	 * 
	 * @param <T> The type of the query parameter.
	 * 
	 * @param t The tuple the inversion is based on.
	 * @param res The query parameter to receive the result.
	 * 
	 * @return The query parameter with the result.
	 */
	default <T extends Tup2dW> T inverseR(Tup2dR t, T res)
	{
		return inverseR(t.getX(), t.getY(), res);
	}
	
	/**
	 * Inverses the current vector based on the given value and saves the result in the query parameter.
	 * It does the same as {@link #revSubR(double, Object)} and is present for completness.
	 * This operation does not alter the current vector but only the query parameter.
	 * It is however safe to use the current vector as the query parameter.
	 * 
	 * <p>
	 * Operation:
	 * value - v
	 * </p>
	 * 
	 * @param <T> The type of the query parameter.
	 * 
	 * @param value The value the inversion is based on.
	 * @param res The query parameter to receive the result.
	 * 
	 * @return The query parameter with the result.
	 */
	default <T extends Tup2dW> T inverseR(double value, T res)
	{
		return inverseR(value, value, res);
	}
	
	/**
	 * Inverses the current vector based on the given component values and saves the result in the query parameter.
	 * It does the same as {@link #revSubR(double, double, Object)} and is present for completness.
	 * This operation does not alter the current vector but only the query parameter.
	 * It is however safe to use the current vector as the query parameter.
	 * 
	 * <p>
	 * Operation:
	 * (x, y) - v
	 * </p>
	 * 
	 * @param <T> The type of the query parameter.
	 * 
	 * @param x The value the inversion of the x component is based on.
	 * @param y The value the inversion of the y component is based on.
	 * @param res The query parameter to receive the result.
	 * 
	 * @return The query parameter with the result.
	 */
	default <T extends Tup2dW> T inverseR(double x, double y, T res)
	{
		return revSubR(x, y, res);
	}
	
	/**
	 * Adds the second given tuple to the current vector and saves the result in a new instance generated by
	 * {@link #getNewInstance(double, double)} which should result in the same type as the current vector is of.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation:
	 * v + t
	 * </p>

	 * @param t The second tuple to add to the current vector.
	 * 
	 * @return The new instance with the result.
	 */
	default Vec2dR addN(Tup2dR t)
	{
		return addN(t.getX(), t.getY());
	}
	
	/**
	 * Adds the second tuple defined by the given value to the current vector and saves the result in a new instance generated by
	 * {@link #getNewInstance(double, double)} which should result in the same type as the current vector is of.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation:
	 * v + (value, value)
	 * </p>
	 * 
	 * @param value The value of all the components of the second tuple.
	 * 
	 * @return The new instance with the result.
	 */
	default Vec2dR addN(double value)
	{
		return addN(value, value);
	}
	
	/**
	 * Adds the second tuple defined by the given component values to the current vector and saves the result in
	 * a new instance generated by {@link #getNewInstance(double, double)} which should result in the same type as
	 * the current vector is of.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation:
	 * v + (x, y)
	 * </p>
	 * 
	 * @param x The value of the x component of the second tuple.
	 * @param y The value of the y component of the second tuple.
	 * 
	 * @return The new instance with the result.
	 */
	default Vec2dR addN(double x, double y)
	{
		return getNewInstance(getX() + x, getY() + y);
	}
	
	/**
	 * Subtracts the second given tuple from the current vector and saves the result in a new instance generated by
	 * {@link #getNewInstance(double, double)} which should result in the same type as the current vector is of.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation:
	 * v - t
	 * </p>
	 * 
	 * @param t The second tuple to subtract from the current vector.
	 * 
	 * @return The new instance with the result.
	 */
	default Vec2dR subN(Tup2dR t)
	{
		return subN(t.getX(), t.getY());
	}
	
	/**
	 * Subtracts the second tuple defined by the given value from the current vector and saves the result in a new instance generated by
	 * {@link #getNewInstance(double, double)} which should result in the same type as the current vector is of.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation:
	 * v - (value, value)
	 * </p>
	 * 
	 * @param value The value of all the components of the second tuple.
	 * 
	 * @return The new instance with the result.
	 */
	default Vec2dR subN(double value)
	{
		return subN(value, value);
	}
	
	/**
	 * Subtracts the second tuple defined by the given component values from the current vector and saves the result in
	 * a new instance generated by {@link #getNewInstance(double, double)} which should result in the same type as
	 * the current vector is of.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation:
	 * v - (x, y)
	 * </p>
	 * 
	 * @param x The value of the x component of the second tuple.
	 * @param y The value of the y component of the second tuple.
	 * 
	 * @return The new instance with the result.
	 */
	default Vec2dR subN(double x, double y)
	{
		return getNewInstance(getX() - x, getY() - y);
	}
	
	/**
	 * Subtracts the current vector from the second given tuple and saves the result in a new instance generated by
	 * {@link #getNewInstance(double, double)} which should result in the same type as the current vector is of.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation:
	 * t - v
	 * </p>
	 * 
	 * @param t The second tuple of which the current vector is subtracted from.
	 * 
	 * @return The new instance with the result.
	 */
	default Vec2dR revSubN(Tup2dR t)
	{
		return revSubN(t.getX(), t.getY());
	}
	
	/**
	 * Subtracts the current vector from the second tuple defined by the given value and saves the result in a new instance generated by
	 * {@link #getNewInstance(double, double)} which should result in the same type as the current vector is of.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation:
	 * (value, value) - v 
	 * </p>
	 * 
	 * @param value The value of all the components of the second tuple.
	 * 
	 * @return The new instance with the result.
	 */
	default Vec2dR revSubN(double value)
	{
		return revSubN(value, value);
	}
	
	/**
	 * Subtracts the current vector from the second tuple defined by the given component values and saves the result in
	 * a new instance generated by {@link #getNewInstance(double, double)} which should result in the same type as
	 * the current vector is of.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation:
	 * (x, y) - v 
	 * </p>
	 * 
	 * @param x The value of the x component of the second tuple.
	 * @param y The value of the y component of the second tuple.
	 * 
	 * @return The new instance with the result.
	 */
	default Vec2dR revSubN(double x, double y)
	{
		return getNewInstance(x - getX(), y - getY());
	}
	
	/**
	 * Multiplies the current vector with the second given tuple and saves the result in a new instance generated by
	 * {@link #getNewInstance(double, double)} which should result in the same type as the current vector is of.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation:
	 * v * t
	 * </p>
	 * 
	 * @param t The second tuple to multiply the current vector with.
	 * 
	 * @return The new instance with the result.
	 */
	default Vec2dR mulN(Tup2dR t)
	{
		return mulN(t.getX(), t.getY());
	}
	
	/**
	 * Multiplies the current vector with the second tuple defined by the given value and saves the result in a new instance generated by
	 * {@link #getNewInstance(double, double)} which should result in the same type as the current vector is of.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation:
	 * v * (value, value)
	 * </p>
	 * 
	 * @param value The value of all the components of the second tuple.
	 * 
	 * @return The new instance with the result.
	 */
	default Vec2dR mulN(double value)
	{
		return mulN(value, value);
	}
	
	/**
	 * Multiplies the current vector with the second tuple defined by the given component values and saves the result in
	 * a new instance generated by {@link #getNewInstance(double, double)} which should result in the same type as the current vector is of.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation:
	 * v * (x, y)
	 * </p>
	 * 
	 * @param x The value of the x component of the second tuple.
	 * @param y The value of the y component of the second tuple.
	 * 
	 * @return The new instance with the result.
	 */
	default Vec2dR mulN(double x, double y)
	{
		return getNewInstance(getX() * x, getY() * y);
	}
	
	/**
	 * Divides the current vector by the second given tuple and saves the result in a new instance generated by
	 * {@link #getNewInstance(double, double)} which should result in the same type as the current vector is of.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation:
	 * v / t
	 * </p>
	 * 
	 * @param t The second tuple to divide the current vector by.
	 * 
	 * @return The new instance with the result.
	 */
	default Vec2dR divN(Tup2dR t)
	{
		return divN(t.getX(), t.getY());
	}
	
	/**
	 * Divides the current vector by the second tuple defined by the given value and saves the result in a new instance generated by
	 * {@link #getNewInstance(double, double)} which should result in the same type as the current vector is of.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation:
	 * v / (value, value)
	 * </p>
	 * 
	 * @param value The value of all the components of the second tuple.
	 * 
	 * @return The new instance with the result.
	 */
	default Vec2dR divN(double value)
	{
		return divN(value, value);
	}
	
	/**
	 * Divides the current vector by the second tuple defined by the given component values and saves the result in
	 * a new instance generated by {@link #getNewInstance(double, double)} which should result in the same type as the current vector is of.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation:
	 * v / (x, y)
	 * </p>
	 * 
	 * @param x The value of the x component of the second tuple.
	 * @param y The value of the y component of the second tuple.
	 * 
	 * @return The new instance with the result.
	 */
	default Vec2dR divN(double x, double y)
	{
		return getNewInstance(getX() / x, getY() / y);
	}
	
	/**
	 * Divides the second given tuple by the current vector and saves the result in a new instance generated by
	 * {@link #getNewInstance(double, double)} which should result in the same type as the current vector is of.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation:
	 * t / v
	 * </p>
	 * 
	 * @param t The second tuple to divide by the current vector.
	 * 
	 * @return The new instance with the result.
	 */
	default Vec2dR revDivN(Tup2dR t)
	{
		return revDivN(t.getX(), t.getY());
	}
	
	/**
	 * Divides the second tuple defined by the given value by the current vector and saves the result in a new instance generated by
	 * {@link #getNewInstance(double, double)} which should result in the same type as the current vector is of.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation:
	 * (value, value) / v 
	 * </p>
	 * 
	 * @param value The value of all the components of the second tuple.
	 * 
	 * @return The new instance with the result.
	 */
	default Vec2dR revDivN(double value)
	{
		return revDivN(value, value);
	}
	
	/**
	 * Divides the second tuple defined by the given component values by the current vector and saves the result in
	 * a new instance generated by {@link #getNewInstance(double, double)} which should result in the same type as the current vector is of.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation:
	 * (x, y) / v
	 * </p>
	 * 
	 * @param x The value of the x component of the second tuple.
	 * @param y The value of the y component of the second tuple.
	 * 
	 * @return The new instance with the result.
	 */
	default Vec2dR revDivN(double x, double y)
	{
		return getNewInstance(x / getX(), y / getY());
	}
	
	/**
	 * Normalizes the current vector and saves the result in a new instance generated by
	 * {@link #getNewInstance(double, double)} which should result in the same type as the current vector is of.
	 * Normalization is done by dividing the vector by its length.
	 * This doesn't account for zero-length vectors and will in such case throw an {@link ArithmeticException}
	 * as this would result in a division by zero.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation:
	 * v / |v|
	 * </p>
	 * 
	 * @param res The query parameter to receive the result.
	 * 
	 * @return The new instance with the result.
	 * 
	 * @throws ArithmeticException Thrown when it is a zero-length vector.
	 */
	default Vec2dR normalN()
	{
		return mulN(reciprocalLength());
	}
	
	/**
	 * Normalizes the current vector and saves the result in a new instance generated by
	 * {@link #getNewInstance(double, double)} which should result in the same type as the current vector is of.
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
	 * </p>
	 * 
	 * @param res The query parameter to receive the result.
	 * 
	 * @return The new instance with the result.
	 * 
	 * @throws ArithmeticException Might be thrown when the length is to close to zero.
	 */
	default Vec2dR normalSafeN()
	{
		if(isZero()) return getNewInstance(this);
		
		return mulN(reciprocalLength());
	}
	
	/**
	 * Normalizes the current vector and saves the result in a new instance generated by
	 * {@link #getNewInstance(double, double)} which should result in the same type as the current vector is of.
	 * Normalization is done by dividing the vector by its length.
	 * If the vector is a zero-length vector the result will be a zero vector.
	 * It determines a zero-length by checking if all components are within the margin defined by
	 * zero plus-minus the given tolerance inclusive (-tolerance <= value <= tolerance).
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation:
	 * v / |v|
	 * </p>
	 * 
	 * @param tolerance The tolerance for defining the margin around zero.
	 * 
	 * @return The new instance with the result.
	 */
	default Vec2dR normalSafeWithMarginN(double tolerance)
	{
		if(isZeroWithMargin(tolerance)) return getNewInstance(this);
		
		return mulN(reciprocalLength());
	}
	
	/**
	 * Inverts the current vector and saves the result in a new instance generated by
	 * {@link #getNewInstance(double, double)} which should result in the same type as the current vector is of.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation:
	 * -v
	 * </p>
	 * 
	 * @return The new instance with the result.
	 */
	default Vec2dR invertN()
	{
		return mulN(-1.0);
	}
	
	/**
	 * Inverses the current vector based on the value one and saves the result in a new instance generated by
	 * {@link #getNewInstance(double, double)} which should result in the same type as the current vector is of.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation:
	 * 1 - v
	 * </p>
	 * 
	 * @return The new instance with the result.
	 */
	default Vec2dR inverseN()
	{
		return revSubN(1.0);
	}
	
	/**
	 * Inverses the current vector based on the given tuple and saves the result in a new instance generated by
	 * {@link #getNewInstance(double, double)} which should result in the same type as the current vector is of.
	 * It does the same as {@link #revSubR(Tup2dR, Object)} and is present for completness.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation:
	 * t - v
	 * </p>
	 * 
	 * @param t The tuple the inversion is based on.
	 * 
	 * @return The new instance with the result.
	 */
	default Vec2dR inverseN(Tup2dR t)
	{
		return inverseN(t.getX(), t.getY());
	}
	
	/**
	 * Inverses the current vector based on the given value and saves the result in a new instance generated by
	 * {@link #getNewInstance(double, double)} which should result in the same type as the current vector is of.
	 * It does the same as {@link #revSubR(double, Object)} and is present for completness.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation:
	 * value - v
	 * </p>
	 * 
	 * @param value The value the inversion is based on.
	 * 
	 * @return The new instance with the result.
	 */
	default Vec2dR inverseN(double value)
	{
		return inverseN(value, value);
	}
	
	/**
	 * Inverses the current vector based on the given component values and saves the result in a new instance generated by
	 * {@link #getNewInstance(double, double)} which should result in the same type as the current vector is of.
	 * It does the same as {@link #revSubR(double, double, Object)} and is present for completness.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation:
	 * (x, y) - v
	 * </p>
	 * 
	 * @param x The value the inversion of the x component is based on.
	 * @param y The value the inversion of the y component is based on.
	 * 
	 * @return The new instance with the result.
	 */
	default Vec2dR inverseN(double x, double y)
	{
		return revSubN(x, y);
	}
}
