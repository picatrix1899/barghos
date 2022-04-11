package org.barghos.math.api.vector;

import org.barghos.core.api.util.function.DoubleFunction2;

/**
 * This class provides utilities for working with 2-dimensional double vectors.
 * 
 * @author picatrix1899
 */
public class Vec2dUtil
{
	/**
	 * Adds the second tuple defined by x2 and y2 to the first vector
	 * defined by x1 and y1 and stores the result in the query parameter.
	 * 
	 * <p>
	 * Operation:
	 * (x1, y1) + (x2, y2)
	 * 
	 * @param <T> The type of the query parameter.
	 * 
	 * @param x1 The value of the x component of the first tuple.
	 * @param y1 The value of the y component of the first tuple.
	 * @param x2 The value of the x component of the second tuple.
	 * @param y2 The value of the y component of the second tuple.
	 * @param res The query parameter.
	 * 
	 * @return The query parameter with the result.
	 */
	public static <T extends Vec2dBase> T add(double x1, double y1, double x2, double y2, T res)
	{
		res.set(x1 + x2, y1 + y2);
		return res;
	}
	
	/**
	 * Adds the second tuple defined by x2 and y2 to the first vector
	 * defined by x1 and y1 and relays the result to the functional interface
	 * which should return an object of any kind that stores the result.
	 * 
	 * <p>
	 * This variant is useful for example for creating readonly instances or to use factories.
	 * 
	 * <p>
	 * Operation:
	 * (x1, y1) + (x2, y2)
	 * 
	 * @param <T> The type of the result object.
	 * 
	 * @param x1 The value of the x component of the first tuple.
	 * @param y1 The value of the y component of the first tuple.
	 * @param x2 The value of the x component of the second tuple.
	 * @param y2 The value of the y component of the second tuple.
	 * @param func A functional interface implementation to create the result object.
	 * 
	 * @return The object returned from the functional interface.
	 */
	public static <T> T add(double x1, double y1, double x2, double y2, DoubleFunction2<T> func)
	{
		return func.apply(x1 + x2, y1 + y2);
	}
	
	/**
	 * Subtracts the second tuple defined by x2 and y2 from the first vector
	 * defined by x1 and y1 and stores the result in the query parameter.
	 * 
	 * <p>
	 * Operation:
	 * (x1, y1) - (x2, y2)
	 * 
	 * @param <T> The type of the query parameter.
	 * 
	 * @param x1 The value of the x component of the first tuple.
	 * @param y1 The value of the y component of the first tuple.
	 * @param x2 The value of the x component of the second tuple.
	 * @param y2 The value of the y component of the second tuple.
	 * @param res The query parameter.
	 * 
	 * @return The query parameter with the result.
	 */
	public static <T extends Vec2dBase> T sub(double x1, double y1, double x2, double y2, T res)
	{
		res.set(x1 - x2, y1 - y2);
		return res;
	}
	
	/**
	 * Subtracts the second tuple defined by x2 and y2 from the first vector
	 * defined by x1 and y1 and relays the result to the functional interface
	 * which should return an object of any kind that stores the result.
	 * 
	 * <p>
	 * This variant is useful for example for creating readonly instances or to use factories.
	 * 
	 * <p>
	 * Operation:
	 * (x1, y1) - (x2, y2)
	 * 
	 * @param <T> The type of the result object.
	 * 
	 * @param x1 The value of the x component of the first tuple.
	 * @param y1 The value of the y component of the first tuple.
	 * @param x2 The value of the x component of the second tuple.
	 * @param y2 The value of the y component of the second tuple.
	 * @param func A functional interface implementation to create the result object.
	 * 
	 * @return The object returned from the functional interface.
	 */
	public static <T> T sub(double x1, double y1, double x2, double y2, DoubleFunction2<T> func)
	{
		return func.apply(x1 - x2, y1 - y2);
	}
	
	/**
	 * Subtracts the first tuple defined by x1 and y1 from the second vector
	 * defined by x2 and y2 and stores the result in the query parameter.
	 * 
	 * <p>
	 * Operation:
	 * (x2, y2) - (x1, y1)
	 * 
	 * @param <T> The type of the query parameter.
	 * 
	 * @param x1 The value of the x component of the first tuple.
	 * @param y1 The value of the y component of the first tuple.
	 * @param x2 The value of the x component of the second tuple.
	 * @param y2 The value of the y component of the second tuple.
	 * @param res The query parameter.
	 * 
	 * @return The query parameter with the result.
	 */
	public static <T extends Vec2dBase> T revSub(double x1, double y1, double x2, double y2, T res)
	{
		res.set(x2 - x1, y2 - y1);
		return res;
	}
	
	/**
	 * Subtracts the first tuple defined by x1 and y1 from the second vector
	 * defined by x2 and y2 and relays the result to the functional interface
	 * which should return an object of any kind that stores the result.
	 * 
	 * <p>
	 * This variant is useful for example for creating readonly instances or to use factories.
	 * 
	 * <p>
	 * Operation:
	 * (x2, y2) - (x1, y1)
	 * 
	 * @param <T> The type of the result object.
	 * 
	 * @param x1 The value of the x component of the first tuple.
	 * @param y1 The value of the y component of the first tuple.
	 * @param x2 The value of the x component of the second tuple.
	 * @param y2 The value of the y component of the second tuple.
	 * @param func A functional interface implementation to create the result object.
	 * 
	 * @return The object returned from the functional interface.
	 */
	public static <T> T revSub(double x1, double y1, double x2, double y2, DoubleFunction2<T> func)
	{
		return func.apply(x2 - x1, y2 - y1);
	}
	
	/**
	 * Multiplies the first tuple defined by x1 and y1 with the second vector
	 * defined by x2 and y2 and stores the result in the query parameter.
	 * 
	 * <p>
	 * Operation:
	 * (x1, y1) * (x2, y2)
	 * 
	 * @param <T> The type of the query parameter.
	 * 
	 * @param x1 The value of the x component of the first tuple.
	 * @param y1 The value of the y component of the first tuple.
	 * @param x2 The value of the x component of the second tuple.
	 * @param y2 The value of the y component of the second tuple.
	 * @param res The query parameter.
	 * 
	 * @return The query parameter with the result.
	 */
	public static <T extends Vec2dBase> T mul(double x1, double y1, double x2, double y2, T res)
	{
		res.set(x1 * x2, y1 * y2);
		return res;
	}
	
	/**
	 * Multiplies the first tuple defined by x1 and y1 with the second vector
	 * defined by x2 and y2 and relays the result to the functional interface
	 * which should return an object of any kind that stores the result.
	 * 
	 * <p>
	 * This variant is useful for example for creating readonly instances or to use factories.
	 * 
	 * <p>
	 * Operation:
	 * (x1, y1) * (x2, y2)
	 * 
	 * @param <T> The type of the result object.
	 * 
	 * @param x1 The value of the x component of the first tuple.
	 * @param y1 The value of the y component of the first tuple.
	 * @param x2 The value of the x component of the second tuple.
	 * @param y2 The value of the y component of the second tuple.
	 * @param func A functional interface implementation to create the result object.
	 * 
	 * @return The object returned from the functional interface.
	 */
	public static <T> T mul(double x1, double y1, double x2, double y2, DoubleFunction2<T> func)
	{
		return func.apply(x1 * x2, y1 * y2);
	}
	
	/**
	 * Divides the first tuple defined by x1 and y1 by the second vector
	 * defined by x2 and y2 and stores the result in the query parameter.
	 * 
	 * <p>
	 * Operation:
	 * (x1, y1) / (x2, y2)
	 * 
	 * @param <T> The type of the query parameter.
	 * 
	 * @param x1 The value of the x component of the first tuple.
	 * @param y1 The value of the y component of the first tuple.
	 * @param x2 The value of the x component of the second tuple.
	 * @param y2 The value of the y component of the second tuple.
	 * @param res The query parameter.
	 * 
	 * @return The query parameter with the result.
	 */
	public static <T extends Vec2dBase> T div(double x1, double y1, double x2, double y2, T res)
	{
		res.set(x1 / x2, y1 / y2);
		return res;
	}
	
	/**
	 * Divides the first tuple defined by x1 and y1 by the second vector
	 * defined by x2 and y2 and relays the result to the functional interface
	 * which should return an object of any kind that stores the result.
	 * 
	 * <p>
	 * This variant is useful for example for creating readonly instances or to use factories.
	 * 
	 * <p>
	 * Operation:
	 * (x1, y1) / (x2, y2)
	 * 
	 * @param <T> The type of the result object.
	 * 
	 * @param x1 The value of the x component of the first tuple.
	 * @param y1 The value of the y component of the first tuple.
	 * @param x2 The value of the x component of the second tuple.
	 * @param y2 The value of the y component of the second tuple.
	 * @param func A functional interface implementation to create the result object.
	 * 
	 * @return The object returned from the functional interface.
	 */
	public static <T> T div(double x1, double y1, double x2, double y2, DoubleFunction2<T> func)
	{
		return func.apply(x1 / x2, y1 / y2);
	}
	
	/**
	 * Divides the second tuple defined by x2 and y2 by the first vector
	 * defined by x1 and y1 and stores the result in the query parameter.
	 * 
	 * <p>
	 * Operation:
	 * (x2, y2) / (x1, y1)
	 * 
	 * @param <T> The type of the query parameter.
	 * 
	 * @param x1 The value of the x component of the first tuple.
	 * @param y1 The value of the y component of the first tuple.
	 * @param x2 The value of the x component of the second tuple.
	 * @param y2 The value of the y component of the second tuple.
	 * @param res The query parameter.
	 * 
	 * @return The query parameter with the result.
	 */
	public static <T extends Vec2dBase> T revDiv(double x1, double y1, double x2, double y2, T res)
	{
		res.set(x2 / x1, y2 / y1);
		return res;
	}
	
	/**
	 * Divides the second tuple defined by x2 and y2 by the first vector
	 * defined by x1 and y1 and relays the result to the functional interface
	 * which should return an object of any kind that stores the result.
	 * 
	 * <p>
	 * This variant is useful for example for creating readonly instances or to use factories.
	 * 
	 * <p>
	 * Operation:
	 * (x2, y2) / (x1, y1)
	 * 
	 * @param <T> The type of the result object.
	 * 
	 * @param x1 The value of the x component of the first tuple.
	 * @param y1 The value of the y component of the first tuple.
	 * @param x2 The value of the x component of the second tuple.
	 * @param y2 The value of the y component of the second tuple.
	 * @param func A functional interface implementation to create the result object.
	 * 
	 * @return The object returned from the functional interface.
	 */
	public static <T> T revDiv(double x1, double y1, double x2, double y2, DoubleFunction2<T> func)
	{
		return func.apply(x2 / x1, y2 / y1);
	}
	
	/**
	 * Performs an fma ({@link Math#fma}) combined multiplication and addition operation on the vector
	 * defined by x and y with the two given tuples defined by mX and mY and aX and aY and stores the
	 * result in the query parameter.
	 * In this version the vector is used as a multiplicant.
	 * 
	 * <p>
	 * Operation:
	 * (x, y) * (mX, mY) + (aX, aY)
	 * 
	 * @param x The value of the x component of the first multiplicant.
	 * @param y The value of the y component of the first multiplicant.
	 * @param mX The value of the x component of the second multiplicant.
	 * @param mY The value of the y component of the second multiplicant.
	 * @param aX The value of the x component of the addend.
	 * @param aY The value of the y component of the addend.
	 * @param res The query parameter.
	 * 
	 * @return The query parameter with the result.
	 */
	public static <T extends Vec2dBase> T fma(double x, double y, double mX, double mY, double aX, double aY, T res)
	{
		res.set(Math.fma(x, mX, aX), Math.fma(y, mY, aY));
		return res;
	}
	
	/**
	 * Performs an fma ({@link Math#fma}) combined multiplication and addition operation on the vector
	 * defined by x and y with the two given tuples defined by mX and mY and aX and aY and relays the
	 * result to the functional interface which should return an object of any kind that stores the result.
	 * In this version the vector is used as a multiplicant.
	 * 
	 * <p>
	 * This variant is useful for example for creating readonly instances or to use factories.
	 * 
	 * <p>
	 * Operation:
	 * (x, y) * (mX, mY) + (aX, aY)
	 * 
	 * @param <T> The type of the result object.
	 * 
	 * @param x The value of the x component of the first multiplicant.
	 * @param y The value of the y component of the first multiplicant.
	 * @param mX The value of the x component of the second multiplicant.
	 * @param mY The value of the y component of the second multiplicant.
	 * @param aX The value of the x component of the addend.
	 * @param aY The value of the y component of the addend.
	 * @param func A functional interface implementation to create the result object.
	 * 
	 * @return The object returned from the functional interface.
	 */
	public static <T> T fma(double x, double y, double mX, double mY, double aX, double aY, DoubleFunction2<T> func)
	{
		return func.apply(Math.fma(x, mX, aX), Math.fma(y, mY, aY));
	}
	
	/**
	 * Performs an fma ({@link Math#fma}) combined multiplication and addition operation on the vector
	 * defined by x and y with the two given tuples defined by mX and mY and aX and aY and stores the
	 * result in the query parameter.
	 * In this version the vector is used as the addend.
	 * 
	 * <p>
	 * Operation:
	 * (x, y) + (mX1, mY1) * (mX2, mY2)
	 * 
	 * @param x The value of the x component of the addend.
	 * @param y The value of the y component of the addend.
	 * @param mX1 The value of the x component of the first multiplicant.
	 * @param mY1 The value of the y component of the first multiplicant.
	 * @param mX2 The value of the x component of the second multiplicant.
	 * @param mY2 The value of the y component of the second multiplicant.
	 * @param res The query parameter.
	 * 
	 * @return The query parameter with the result.
	 */
	public static <T extends Vec2dBase> T mulAdd(double x, double y, double mX1, double mY1, double mX2, double mY2, T res)
	{
		res.set(Math.fma(mX1, mX2, x), Math.fma(mY1, mY2, y));
		return res;
	}
	
	/**
	 * Performs an fma ({@link Math#fma}) combined multiplication and addition operation on the vector
	 * defined by x and y with the two given tuples defined by mX and mY and aX and aY and relays the
	 * result to the functional interface which should return an object of any kind that stores the result.
	 * In this version the vector is used as the addend.
	 * 
	 * <p>
	 * This variant is useful for example for creating readonly instances or to use factories.
	 * 
	 * <p>
	 * Operation:
	 * (x, y) + (mX1, mY1) * (mX2, mY2)
	 * 
	 * @param <T> The type of the result object.
	 * 
	 * @param x The value of the x component of the addend.
	 * @param y The value of the y component of the addend.
	 * @param mX1 The value of the x component of the first multiplicant.
	 * @param mY1 The value of the y component of the first multiplicant.
	 * @param mX2 The value of the x component of the second multiplicant.
	 * @param mY2 The value of the y component of the second multiplicant.
	 * @param func A functional interface implementation to create the result object.
	 * 
	 * @return The object returned from the functional interface.
	 */
	public static <T> T mulAdd(double x, double y, double mX1, double mY1, double mX2, double mY2, DoubleFunction2<T> func)
	{
		return func.apply(Math.fma(mX1, mX2, x), Math.fma(mY1, mY2, y));
	}
	
	/**
	 * Returns the reciprocal length of the vector defined by x and y.
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
	public static double reciprocalLength(double x, double y)
	{
		return 1.0 / Math.sqrt(Math.fma(x, x, y * y));
	}
	
	/**
	 * Returns the reciprocal length of the vector defined by x and y.
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
	public static double reciprocalLengthSafe(double x, double y)
	{
		if(x + y == 0.0) return 0.0;
		
		return 1.0 / Math.sqrt(Math.fma(x, x, y * y));
	}
	
	/**
	 * Returns the reciprocal length of the vector defined by x and y
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
	public static double reciprocalLengthSafeWithMargin(double x, double y, double tolerance)
	{
		if(Math.abs(x) <= tolerance && Math.abs(y) <= tolerance) return 0.0;
		
		return 1.0 / Math.sqrt(Math.fma(x, x, y * y));
	}
	
	/**
	 * Returns the length of the vector defined by x and y.
	 * It doesn't account for zero-length vectors.
	 * 
	 * <p>
	 * Operation:
	 * |v|
	 * 
	 * @return The length of the vector.
	 */
	public static double length(double x, double y)
	{
		return Math.sqrt(Math.fma(x, x, y * y));
	}
	
	/**
	 * Returns the length of the vector defined by x and y.
	 * If the vector is a zero-length vector the result will be zero.
	 * It determines a zero-length by checking if all components are exactly zero.
	 * 
	 * <p>
	 * Operation:
	 * |v|
	 * 
	 * @return The length of the vector or zero if it is a zero-length vector.
	 */
	public static double lengthSafe(double x, double y)
	{
		if(x + y == 0.0) return 0.0;
		
		return Math.sqrt(Math.fma(x, x, y * y));
	}
	
	/**
	 * Returns the length of the vector defined by x and y.
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
	public static double lengthSafeWithMargin(double x, double y, double tolerance)
	{
		if(Math.abs(x) <= tolerance && Math.abs(y) <= tolerance) return 0.0;
		
		return Math.sqrt(Math.fma(x, x, y * y));
	}
	
	/**
	 * Returns the squared length of the vector defined by x and y.
	 * It doesn't account for zero-length vectors.
	 * 
	 * <p>
	 * Operation:
	 * |v|²
	 * 
	 * @return The squared length of the vector.
	 */
	public static double squaredLength(double x, double y)
	{
		return Math.fma(x, x, y * y);
	}
	
	/**
	 * Returns the squared length of the vector defined by x and y.
	 * If the vector is a zero-length vector the result will be zero.
	 * It determines a zero-length by checking if all components are exactly zero.
	 * 
	 * <p>
	 * Operation:
	 * |v|²
	 * 
	 * @return The squared length of the vector or zero if it is a zero-length vector.
	 */
	public static double squaredLengthSafe(double x, double y)
	{
		if(x + y == 0.0) return 0.0;
		
		return Math.fma(x, x, y * y);
	}
	
	/**
	 * Returns the squared length of the vector defined by x and y.
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
	public static double squaredLengthSafeWithMargin(double x, double y, double tolerance)
	{
		if(Math.abs(x) <= tolerance && Math.abs(y) <= tolerance) return 0.0;
		
		return Math.fma(x, x, y * y);
	}
}
