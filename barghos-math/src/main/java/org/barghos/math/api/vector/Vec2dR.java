package org.barghos.math.api.vector;

import org.barghos.core.api.tuple2.Tup2dR;
import org.barghos.core.api.tuple2.Tup2oC;
import org.barghos.core.api.util.function.GenericFunction2;

/**
 * This interface grants readonly access to any 2-dimensional double vector.
 * 
 * <p>
 * It should be prefered by design before direct usage of a type in method parameters,
 * if the method only reads data from the parameter.
 * 
 * @author picatrix1899
 */
public interface Vec2dR extends Tup2dR
{
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
		return Vec2dUtil.reciprocalLength(getX(), getY());
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
	 * 
	 * @return The length of the vector.
	 */
	default double length()
	{
		return Vec2dUtil.length(getX(), getY());
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
	 * 
	 * @return The squared length of the vector.
	 */
	default double squaredLength()
	{
		return Vec2dUtil.length(getX(), getY());
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
	default double squaredLengthSafeWithMargin(double tolerance)
	{
		if(isZeroWithMargin(tolerance)) return 0.0;
		
		return squaredLength();
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
	default <T extends Tup2oC<Double,Integer>> T minR(T res)
	{
		return Vec2dUtil.min(getX(), getY(), res);
	}
	
	/**
	 * Determines the smallest value of the components and returns the value and the index of the component.
	 * The index returned is limited to the range of 0 to getDimensions() - 1.
	 * If two or more components have the same value the first index will be returned.
	 * This version provides the result to the given functional interface implementation and returns the result of that call.
	 * 
	 * @param func The functional interface implementation to call with the result.
	 * 
	 * @return The returned result from the functional interface implementation.
	 */
	default <T> T minR(GenericFunction2<Double,Integer,T> func)
	{
		return Vec2dUtil.min(getX(), getY(), func);
	}
	
	/**
	 * Determines the smallest value of the components and returns it.
	 * 
	 * @return The smallest value of the components.
	 */
	default double minValue()
	{
		return Vec2dUtil.minValue(getX(), getY());
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
		return Vec2dUtil.minComponent(getX(), getY());
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
	default <T extends Tup2oC<Double,Integer>> T maxR(T res)
	{
		return Vec2dUtil.max(getX(), getY(), res);
	}
	
	/**
	 * Determines the greatest value of the components and returns the value and the index of the component.
	 * The index returned is limited to the range of 0 to getDimensions() - 1.
	 * If two or more components have the same value the first index will be returned.
	 * This version provides the result to the given functional interface implementation and returns the result of that call.
	 * 
	 * @param func The functional interface implementation to call with the result.
	 * 
	 * @return The returned result from the functional interface implementation.
	 */
	default <T> T maxR(GenericFunction2<Double,Integer,T> func)
	{
		return Vec2dUtil.max(getX(), getY(), func);
	}
	
	/**
	 * Determines the greatest value of the components and returns it.
	 * 
	 * @return The greatest value of the components.
	 */
	default double maxValue()
	{
		return Vec2dUtil.maxValue(getX(), getY());
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
		return Vec2dUtil.maxComponent(getX(), getY());
	}
	
	/**
	 * Creates a new anonymous implementation instance of the interface {@link Vec2dR} with the given values.
	 * As the resulting instance is just a minimal implementation of the interface it does not provide clone,
	 * equals, hashCode or toString operations.
	 * 
	 * @param x The value of the x component.
	 * @param y The value of the y component.
	 * 
	 * @return The anonymous implementation instance.
	 */
	public static Vec2dR of(final double x, final double y)
	{
		return new Vec2dR() {
			public double getX()
			{
				return x;
			}

			public double getY()
			{
				return y;
			}
		};
	}
	
	/**
	 * Creates a new anonymous implementation instance of the interface {@link Vec2dR} with the normalized given values.
	 * As the resulting instance is just a minimal implementation of the interface it does not provide clone,
	 * equals, hashCode or toString operations.
	 * 
	 * @param x The value of the x component.
	 * @param y The value of the y component.
	 * 
	 * @return The anonymous implementation instance.
	 */
	public static Vec2dR ofNormalized(final double x, final double y)
	{
		double recLength = Vec2dUtil.reciprocalLengthSafe(x, y);
		final double _x = x * recLength;
		final double _y = y * recLength;
		
		return new Vec2dR() {
			public double getX()
			{
				return _x;
			}

			public double getY()
			{
				return _y;
			}
		};
	}
}
