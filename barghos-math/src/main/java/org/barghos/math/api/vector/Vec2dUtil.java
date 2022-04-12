package org.barghos.math.api.vector;

import static org.barghos.core.api.tuple.TupleConstants.*;

import org.barghos.core.api.tuple2.Tup2oBase;
import org.barghos.core.api.tuple2.Tup2oR;
import org.barghos.core.api.util.function.DoubleFunction2;
import org.barghos.core.api.util.function.GenericFunction2;

/**
 * This class provides utilities for working with 2-dimensional double vectors.
 * 
 * @author picatrix1899
 */
public class Vec2dUtil
{
	/**
	 * Adds the second tuple defined by x2 and y2 to the first vector
	 * defined by x1 and y1 and stores the result in the array.
	 * 
	 * <p>
	 * Operation:
	 * (x1, y1) + (x2, y2)
	 * 
	 * @param x1 The value of the x component of the first tuple.
	 * @param y1 The value of the y component of the first tuple.
	 * @param x2 The value of the x component of the second tuple.
	 * @param y2 The value of the y component of the second tuple.
	 * @param res The result array.
	 * 
	 * @return The result array with the result.
	 */
	public static double[] add(double x1, double y1, double x2, double y2, double[] res)
	{
		res[COMP_X] = x1 + x2;
		res[COMP_Y] = y1 + y2;
		
		return res;
	}
	
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
	 * defined by x1 and y1 and stores the result in the array.
	 * 
	 * <p>
	 * Operation:
	 * (x1, y1) - (x2, y2)
	 * 
	 * @param x1 The value of the x component of the first tuple.
	 * @param y1 The value of the y component of the first tuple.
	 * @param x2 The value of the x component of the second tuple.
	 * @param y2 The value of the y component of the second tuple.
	 * @param res The result array.
	 * 
	 * @return The result array with the result.
	 */
	public static double[] sub(double x1, double y1, double x2, double y2, double[] res)
	{
		res[COMP_X] = x1 - x2;
		res[COMP_Y] = y1 - y2;
		
		return res;
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
	 * defined by x2 and y2 and stores the result in the array.
	 * 
	 * <p>
	 * Operation:
	 * (x2, y2) - (x1, y1)
	 * 
	 * @param x1 The value of the x component of the first tuple.
	 * @param y1 The value of the y component of the first tuple.
	 * @param x2 The value of the x component of the second tuple.
	 * @param y2 The value of the y component of the second tuple.
	 * @param res The result array.
	 * 
	 * @return The result array with the result.
	 */
	public static double[] revSub(double x1, double y1, double x2, double y2, double[] res)
	{
		res[COMP_X] = x2 - x1;
		res[COMP_Y] = y2 - y1;
		
		return res;
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
	 * defined by x2 and y2 and stores the result in the array.
	 * 
	 * <p>
	 * Operation:
	 * (x1, y1) * (x2, y2)
	 * 
	 * @param x1 The value of the x component of the first tuple.
	 * @param y1 The value of the y component of the first tuple.
	 * @param x2 The value of the x component of the second tuple.
	 * @param y2 The value of the y component of the second tuple.
	 * @param res The result array.
	 * 
	 * @return The result array with the result.
	 */
	public static double[] mul(double x1, double y1, double x2, double y2, double[] res)
	{
		res[COMP_X] = x1 * x2;
		res[COMP_Y] = y1 * y2;
		
		return res;
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
	 * defined by x2 and y2 and stores the result in the array.
	 * 
	 * <p>
	 * Operation:
	 * (x1, y1) / (x2, y2)
	 * 
	 * @param x1 The value of the x component of the first tuple.
	 * @param y1 The value of the y component of the first tuple.
	 * @param x2 The value of the x component of the second tuple.
	 * @param y2 The value of the y component of the second tuple.
	 * @param res The result array.
	 * 
	 * @return The result array with the result.
	 */
	public static double[] div(double x1, double y1, double x2, double y2, double[] res)
	{
		res[COMP_X] = x1 / x2;
		res[COMP_Y] = y1 / y2;
		
		return res;
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
	 * defined by x1 and y1 and stores the result in the array.
	 * 
	 * <p>
	 * Operation:
	 * (x2, y2) / (x1, y1)
	 * 
	 * @param x1 The value of the x component of the first tuple.
	 * @param y1 The value of the y component of the first tuple.
	 * @param x2 The value of the x component of the second tuple.
	 * @param y2 The value of the y component of the second tuple.
	 * @param res The result array.
	 * 
	 * @return The result array with the result.
	 */
	public static double[] revDiv(double x1, double y1, double x2, double y2, double[] res)
	{
		res[COMP_X] = x2 / x1;
		res[COMP_Y] = y2 / y1;
		
		return res;
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
	 * result in the array.
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
	 * @param res The result array.
	 * 
	 * @return The result array with the result.
	 */
	public static double[] fma(double x, double y, double mX, double mY, double aX, double aY, double[] res)
	{
		res[COMP_X] = Math.fma(x, mX, aX);
		res[COMP_Y] = Math.fma(y, mY, aY);
		
		return res;
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
	 * result in the array.
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
	 * @param res The result array.
	 * 
	 * @return The result array with the result.
	 */
	public static double[] mulAdd(double x, double y, double mX1, double mY1, double mX2, double mY2, double[] res)
	{
		res[COMP_X] = Math.fma(mX1, mX2, x);
		res[COMP_Y] = Math.fma(mY1, mY2, y);
		
		return res;
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
	
	/**
	 * Determines the smallest value of the components and returns the value and the index of the component.
	 * The index returned is limited to the range of 0 to 1.
	 * If two or more components have the same value the first index will be returned.
	 * The returned tuple is immutable.
	 * 
	 * @return The smallest value of the components and the index of the corresponding component.
	 */
	public static Tup2oR<Double,Integer> min(double x, double y)
	{
		double value = x;
		int index = COMP_X;
		
		if(y < value)
		{
			value = y;
			index = COMP_Y;
		}
		
		return Tup2oR.of(value, index);
	}
	
	/**
	 * Determines the smallest value of the components and returns the value and the index of the component.
	 * The index returned is limited to the range of 0 to 1.
	 * If two or more components have the same value the first index will be returned.
	 * This version utilizes a query parameter that receives the result and will be returned.
	 * 
	 * @param res The query parameter for the result.
	 * 
	 * @return The instance from the res parameter with the result.
	 */
	public static <T extends Tup2oBase<Double,Integer>> T min(double x, double y, T res)
	{
		double value = x;
		int index = COMP_X;
		
		if(y < value)
		{
			value = y;
			index = COMP_Y;
		}
		
		res.set(value, index);
		
		return res;
	}
	
	/**
	 * Determines the smallest value of the components and returns the value and the index of the component.
	 * The index returned is limited to the range of 0 to 1.
	 * If two or more components have the same value the first index will be returned.
	 * This version provides the result to the given functional interface implementation and returns the result of that call.
	 * 
	 * @param func The functional interface implementation to call with the result.
	 * 
	 * @return The returned result from the functional interface implementation.
	 */
	public static <T> T min(double x, double y, GenericFunction2<Double,Integer,T> func)
	{
		double value = x;
		int index = COMP_X;
		
		if(y < value)
		{
			value = y;
			index = COMP_Y;
		}
		
		return func.apply(value, index);
	}
	
	/**
	 * Determines the smallest value of the components and returns it.
	 * 
	 * @return The smallest value of the components.
	 */
	public static double minValue(double x, double y)
	{
		return Math.min(x, y);
	}
	
	/**
	 * Determines the smallest value of the componensts and returns the index of the component.
	 * The index returned is limited to the range of 0 to1.
	 * If two or more components have the same value the first index will be returned.
	 * 
	 * @return The index of the smallest component.
	 */
	public static int minComponent(double x, double y)
	{
		double value = x;
		int index = COMP_X;
		
		if(y < value)
		{
			value = y;
			index = COMP_Y;
		}
		
		return index;
	}
	
	/**
	 * Determines the greatest value of the components and returns the value and the index of the component.
	 * The index returned is limited to the range of 0 to 1.
	 * If two or more components have the same value the first index will be returned.
	 * The returned tuple is immutable.
	 * 
	 * @return The greatest value of the components and the index of the corresponding component.
	 */
	public static Tup2oR<Double,Integer> max(double x, double y)
	{
		double value = x;
		int index = COMP_X;
		
		if(y > value)
		{
			value = y;
			index = COMP_Y;
		}
		
		return Tup2oR.of(value, index);
	}
	
	/**
	 * Determines the greatest value of the components and returns the value and the index of the component.
	 * The index returned is limited to the range of 0 to 1.
	 * If two or more components have the same value the first index will be returned.
	 * This version utilizes a query parameter that receives the result and will be returned.
	 * 
	 * @param res The query parameter for the result.
	 * 
	 * @return The instance from the res parameter with the result.
	 */
	public static <T extends Tup2oBase<Double,Integer>> T max(double x, double y, T res)
	{
		double value = x;
		int index = COMP_X;
		
		if(y > value)
		{
			value = y;
			index = COMP_Y;
		}
		
		res.set(value, index);
		
		return res;
	}
	
	/**
	 * Determines the greatest value of the components and returns the value and the index of the component.
	 * The index returned is limited to the range of 0 to 1.
	 * If two or more components have the same value the first index will be returned.
	 * This version provides the result to the given functional interface implementation and returns the result of that call.
	 * 
	 * @param func The functional interface implementation to call with the result.
	 * 
	 * @return The returned result from the functional interface implementation.
	 */
	public static <T> T max(double x, double y, GenericFunction2<Double,Integer,T> func)
	{
		double value = x;
		int index = COMP_X;
		
		if(y > value)
		{
			value = y;
			index = COMP_Y;
		}
		
		return func.apply(value, index);
	}
	
	/**
	 * Determines the greatest value of the components and returns it.
	 * 
	 * @return The greatest value of the components.
	 */
	public static double maxValue(double x, double y)
	{
		return Math.max(x, y);
	}
	
	/**
	 * Determines the greatest value of the componensts and returns the index of the component.
	 * The index returned is limited to the range of 0 to 1.
	 * If two or more components have the same value the first index will be returned.
	 * 
	 * @return The index of the greatest component.
	 */
	public static int maxComponent(double x, double y)
	{
		double value = x;
		int index = COMP_X;
		
		if(y > value)
		{
			value = y;
			index = COMP_Y;
		}
		
		return index;
	}
	
	/**
	 * Normalizes the vector defined by x and y and stores the result in the array.
	 * Normalization is done by dividing the vector by its length.
	 * This doesn't account for zero-length vectors and will in such case throw an {@link ArithmeticException}
	 * as this would result in a division by zero.
	 * 
	 * <p>
	 * Operation:
	 * (x, y) / |(x, y)|
	 * 
	 * @param x The value of the x component of the vector.
	 * @param y The value of the y component of the vector.
	 * @param res The result array.
	 * 
	 * @return The result array with the result.
	 * 
	 * @throws ArithmeticException Thrown when it is a zero-length vector.
	 */
	public static double[] normal(double x, double y, double[] res)
	{
		double recLength = 1.0 / Math.sqrt(Math.fma(x, x, y * y));
		
		res[COMP_X] = x * recLength;
		res[COMP_Y] = y * recLength;
		
		return res;
	}
	
	/**
	 * Normalizes the vector defined by x and y and stores the result in the query parameter.
	 * Normalization is done by dividing the vector by its length.
	 * This doesn't account for zero-length vectors and will in such case throw an {@link ArithmeticException}
	 * as this would result in a division by zero.
	 * 
	 * <p>
	 * Operation:
	 * (x, y) / |(x, y)|
	 * 
	 * @param <T> The type of the query parameter.
	 * 
	 * @param x The value of the x component of the vector.
	 * @param y The value of the y component of the vector.
	 * @param res The query parameter.
	 * 
	 * @return The query parameter with the result.
	 * 
	 * @throws ArithmeticException Thrown when it is a zero-length vector.
	 */
	public static <T extends Vec2dBase> T normal(double x, double y, T res)
	{
		double recLength = 1.0 / Math.sqrt(Math.fma(x, x, y * y));
		res.set(x * recLength, y * recLength);
		
		return res;
	}
	
	/**
	 * Normalizes the vector defined by x and y and relays the
	 * result to the functional interface which should return an object of any kind that stores the result.
	 * Normalization is done by dividing the vector by its length.
	 * This doesn't account for zero-length vectors and will in such case throw an {@link ArithmeticException}
	 * as this would result in a division by zero.
	 * 
	 * <p>
	 * Operation:
	 * (x, y) / |(x, y)|
	 * 
	 * @param <T> The type of the result object.
	 * 
	 * @param x The value of the x component of the vector.
	 * @param y The value of the y component of the vector.
	 * @param func A functional interface implementation to create the result object.
	 * 
	 * @return The object returned from the functional interface.
	 * 
	 * @throws ArithmeticException Thrown when it is a zero-length vector.
	 */
	public static <T> T normal(double x, double y, DoubleFunction2<T> func)
	{
		double recLength = 1.0 / Math.sqrt(Math.fma(x, x, y * y));
		
		return func.apply(x * recLength, y * recLength);
	}
	
	/**
	 * Normalizes the vector defined by x and y and stores the result in the array.
	 * Normalization is done by dividing the vector by its length.
	 * If the vector is a zero-length vector the result will be a zero vector.
	 * It determines a zero-length by checking if all components are exactly zero.
	 * Due to floating-point-errors it might still throw an {@link ArithmeticException} when
	 * the length is too close to zero.
	 * 
	 * <p>
	 * Operation:
	 * (x, y) / |(x, y)|
	 * 
	 * @param x The value of the x component of the vector.
	 * @param y The value of the y component of the vector.
	 * @param res The result array.
	 * 
	 * @return The result array with the result.
	 * 
	 * @throws ArithmeticException Might be thrown when the length is to close to zero.
	 */
	public static double[] normalSafe(double x, double y, double[] res)
	{
		if(x + y == 0.0)
		{
			res[COMP_X] = 0.0;
			res[COMP_Y] = 0.0;
			
			return res;
		}
		
		double recLength = 1.0 / Math.sqrt(Math.fma(x, x, y * y));

		res[COMP_X] = x * recLength;
		res[COMP_Y] = y * recLength;
		
		return res;
	}
	
	/**
	 * Normalizes the vector defined by x and y and stores the result in the query parameter.
	 * Normalization is done by dividing the vector by its length.
	 * If the vector is a zero-length vector the result will be a zero vector.
	 * It determines a zero-length by checking if all components are exactly zero.
	 * Due to floating-point-errors it might still throw an {@link ArithmeticException} when
	 * the length is too close to zero.
	 * 
	 * <p>
	 * Operation:
	 * (x, y) / |(x, y)|
	 * 
	 * @param <T> The type of the query parameter.
	 * 
	 * @param x The value of the x component of the vector.
	 * @param y The value of the y component of the vector.
	 * @param res The query parameter.
	 * 
	 * @return The query parameter with the result.
	 * 
	 * @throws ArithmeticException Might be thrown when the length is to close to zero.
	 */
	public static <T extends Vec2dBase> T normalSafe(double x, double y, T res)
	{
		if(x + y == 0.0)
		{
			res.set(0.0);
			return res;
		}
		
		double recLength = 1.0 / Math.sqrt(Math.fma(x, x, y * y));
		res.set(x * recLength, y * recLength);
		
		return res;
	}
	
	/**
	 * Normalizes the vector defined by x and y and relays the
	 * result to the functional interface which should return an object of any kind that stores the result.
	 * Normalization is done by dividing the vector by its length.
	 * If the vector is a zero-length vector the result will be a zero vector.
	 * It determines a zero-length by checking if all components are exactly zero.
	 * Due to floating-point-errors it might still throw an {@link ArithmeticException} when
	 * the length is too close to zero.
	 * 
	 * <p>
	 * Operation:
	 * (x, y) / |(x, y)|
	 * 
	 * @param <T> The type of the result object.
	 * 
	 * @param x The value of the x component of the vector.
	 * @param y The value of the y component of the vector.
	 * @param func A functional interface implementation to create the result object.
	 * 
	 * @return The object returned from the functional interface.
	 * 
	 * @throws ArithmeticException Might be thrown when the length is to close to zero.
	 */
	public static <T> T normalSafe(double x, double y, DoubleFunction2<T> func)
	{
		if(x + y == 0.0) return func.apply(0.0, 0.0);
		
		double recLength = 1.0 / Math.sqrt(Math.fma(x, x, y * y));

		return func.apply(x * recLength, y * recLength);
	}
	
	/**
	 * Normalizes the vector defined by x and y and stores the result in the array.
	 * Normalization is done by dividing the vector by its length.
	 * If the vector is a zero-length vector the result will be a zero vector.
	 * It determines a zero-length by checking if all components are within the margin defined by
	 * zero plus-minus the given tolerance inclusive (-tolerance <= value <= tolerance).
	 * 
	 * <p>
	 * Operation:
	 * (x, y) / |(x, y)|
	 * 
	 * @param x The value of the x component of the vector.
	 * @param y The value of the y component of the vector.
	 * @param tolerance The tolerance for defining the margin around zero.
	 * @param res The result array.
	 * 
	 * @return The result array with the result.
	 */
	public static double[] normalSafeWithMargin(double x, double y, double tolerance, double[] res)
	{
		if(Math.abs(x) <= tolerance && Math.abs(y) <= tolerance)
		{
			res[COMP_X] = 0.0;
			res[COMP_Y] = 0.0;
			
			return res;
		}
		
		double recLength = 1.0 / Math.sqrt(Math.fma(x, x, y * y));
		
		res[COMP_X] = x * recLength;
		res[COMP_Y] = y * recLength;
		
		return res;
	}
	
	/**
	 * Normalizes the vector defined by x and y and stores the result in the query parameter.
	 * Normalization is done by dividing the vector by its length.
	 * If the vector is a zero-length vector the result will be a zero vector.
	 * It determines a zero-length by checking if all components are within the margin defined by
	 * zero plus-minus the given tolerance inclusive (-tolerance <= value <= tolerance).
	 * 
	 * <p>
	 * Operation:
	 * (x, y) / |(x, y)|
	 * 
	 * @param <T> The type of the query parameter.
	 * 
	 * @param x The value of the x component of the vector.
	 * @param y The value of the y component of the vector.
	 * @param tolerance The tolerance for defining the margin around zero.
	 * @param res The query parameter.
	 * 
	 * @return The query parameter with the result.
	 */
	public static <T extends Vec2dBase> T normalSafeWithMargin(double x, double y, double tolerance, T res)
	{
		if(Math.abs(x) <= tolerance && Math.abs(y) <= tolerance)
		{
			res.set(0.0);
			return res;
		}
		
		double recLength = 1.0 / Math.sqrt(Math.fma(x, x, y * y));
		res.set(x * recLength, y * recLength);
		
		return res;
	}
	
	/**
	 * Normalizes the vector defined by x and y and relays the
	 * result to the functional interface which should return an object of any kind that stores the result.
	 * Normalization is done by dividing the vector by its length.
	 * If the vector is a zero-length vector the result will be a zero vector.
	 * It determines a zero-length by checking if all components are within the margin defined by
	 * zero plus-minus the given tolerance inclusive (-tolerance <= value <= tolerance).
	 * 
	 * <p>
	 * Operation:
	 * (x, y) / |(x, y)|
	 * 
	 * @param <T> The type of the result object.
	 * 
	 * @param x The value of the x component of the vector.
	 * @param y The value of the y component of the vector.
	 * @param tolerance The tolerance for defining the margin around zero.
	 * @param func A functional interface implementation to create the result object.
	 * 
	 * @return The object returned from the functional interface.
	 */
	public static <T> T normalSafeWithMargin(double x, double y, double tolerance, DoubleFunction2<T> func)
	{
		if(Math.abs(x) <= tolerance && Math.abs(y) <= tolerance) return func.apply(0.0, 0.0);
		
		double recLength = 1.0 / Math.sqrt(Math.fma(x, x, y * y));

		return func.apply(x * recLength, y * recLength);
	}
	
	/**
	 * Inverts the vector defined by x and y and stores the result in the array.
	 * 
	 * <p>
	 * Operation:
	 * -(x, y)
	 * 
	 * @param <T> The type of the query parameter.
	 * 
	 * @param x The value of the x component of the vector.
	 * @param y The value of the y component of the vector.
	 * @param res The result array.
	 * 
	 * @return The result with the result.
	 */
	public static double[] invert(double x, double y, double[] res)
	{
		res[COMP_X] = -x;
		res[COMP_Y] = -y;
		
		return res;
	}
	
	/**
	 * Inverts the vector defined by x and y and stores the result in the query parameter.
	 * 
	 * <p>
	 * Operation:
	 * -(x, y)
	 * 
	 * @param <T> The type of the query parameter.
	 * 
	 * @param x The value of the x component of the vector.
	 * @param y The value of the y component of the vector.
	 * @param res The query parameter.
	 * 
	 * @return The query parameter with the result.
	 */
	public static <T extends Vec2dBase> T invert(double x, double y, T res)
	{
		res.set(-x, -y);
		
		return res;
	}
	
	/**
	 * Inverts the vector defined by x and y and relays the
	 * result to the functional interface which should return an object of any kind that stores the result.
	 * 
	 * <p>
	 * Operation:
	 * -(x, y)
	 * 
	 * @param <T> The type of the result object.
	 * 
	 * @param x The value of the x component of the vector.
	 * @param y The value of the y component of the vector.
	 * @param func A functional interface implementation to create the result object.
	 * 
	 * @return The object returned from the functional interface.
	 */
	public static <T> T invert(double x, double y,  DoubleFunction2<T> func)
	{
		return func.apply(-x, -y);
	}
	
	/**
	 * Inverses the vector defined by x and y based on the given component values x2 and y2 and stores the result in the array.
	 * 
	 * <p>
	 * Operation:
	 * (x2, y2) - (x, y)
	 * 
	 * @param x The value of the x component of the vector.
	 * @param y The value of the y component of the vector.
	 * @param x2 The value the inversion of the x component is based on.
	 * @param y2 The value the inversion of the y component is based on.
	 * @param res The result array.
	 * 
	 * @return The result array with the result.
	 */
	public static double[] inverse(double x, double y, double x2, double y2, double[] res)
	{
		res[COMP_X] = x2 - x;
		res[COMP_Y] = y2 - y;
		
		return res;
	}
	
	/**
	 * Inverses the vector defined by x and y based on the given component values x2 and y2 and stores the result in the query parameter.
	 * 
	 * <p>
	 * Operation:
	 * (x2, y2) - (x, y)
	 * 
	 * @param <T> The type of the query parameter.
	 * 
	 * @param x The value of the x component of the vector.
	 * @param y The value of the y component of the vector.
	 * @param x2 The value the inversion of the x component is based on.
	 * @param y2 The value the inversion of the y component is based on.
	 * @param res The query parameter.
	 * 
	 * @return The query parameter with the result.
	 */
	public static <T extends Vec2dBase> T inverse(double x, double y, double x2, double y2, T res)
	{
		res.set(x2 - x, y2 - y);
		
		return res;
	}
	
	/**
	 * Inverses the vector defined by x and y based on the given component values x2 and y2 and relays the
	 * result to the functional interface which should return an object of any kind that stores the result.
	 * 
	 * <p>
	 * Operation:
	 * (x2, y2) - (x, y)
	 * 
	 * @param <T> The type of the result object.
	 * 
	 * @param x The value of the x component of the vector.
	 * @param y The value of the y component of the vector.
	 * @param x2 The value the inversion of the x component is based on.
	 * @param y2 The value the inversion of the y component is based on.
	 * @param func A functional interface implementation to create the result object.
	 * 
	 * @return The object returned from the functional interface.
	 */
	public static <T extends Vec2dBase> T inverse(double x, double y, double x2, double y2, DoubleFunction2<T> func)
	{
		return func.apply(x2 - x, y2 - y);
	}
	
	/**
	 * Calculates the half of the vector defined by x and y and stores the result in the array.
	 * 
	 * <p>
	 * Operation:
	 * (x, y) / 2
	 * 
	 * @param x The value of the x component of the vector.
	 * @param y The value of the y component of the vector.
	 * @param res The result array.
	 * 
	 * @return The result array with the result.
	 */
	public static double[] half(double x, double y, double[] res)
	{
		res[COMP_X] = x * 0.5;
		res[COMP_Y] = y * 0.5;
		
		return res;
	}
	
	/**
	 * Calculates the half of the vector defined by x and y and stores the result in the query parameter.
	 * 
	 * <p>
	 * Operation:
	 * (x, y) / 2
	 * 
	 * @param <T> The type of the query parameter.
	 * 
	 * @param x The value of the x component of the vector.
	 * @param y The value of the y component of the vector.
	 * @param res The query parameter.
	 * 
	 * @return The query parameter with the result.
	 */
	public static <T extends Vec2dBase> T half(double x, double y, T res)
	{
		res.set(x * 0.5, y * 0.5);
		
		return res;
	}
	
	/**
	 * Calculates the half of the vector defined by x and y and relays the
	 * result to the functional interface which should return an object of any kind that stores the result.
	 * 
	 * <p>
	 * Operation:
	 * (x, y) / 2
	 * 
	 * @param <T> The type of the result object.
	 * 
	 * @param x The value of the x component of the vector.
	 * @param y The value of the y component of the vector.
	 * @param func A functional interface implementation to create the result object.
	 * 
	 * @return The object returned from the functional interface.
	 */
	public static <T extends Vec2dBase> T half(double x, double y, DoubleFunction2<T> func)
	{
		return func.apply(x * 0.5, y * 0.5);
	}
	
	/**
	 * Rotates the vector defined by x and y by the given angle in radians and stores the result in the array.
	 * 
	 * @param x The value of the x component of the vector.
	 * @param y The value of the y component of the vector.
	 * @param angle The angle in radians.
	 * @param res The result array.
	 * 
	 * @return The result array with the result.
	 */
	public static double[] rotate(double x, double y, double angle, double[] res)
	{
		double cos = Math.cos(angle);
		double sin = Math.sin(angle);

		res[COMP_X] = x * cos - y * sin;
		res[COMP_Y] = x * sin + y * cos;
		
		return res;
	}
	
	/**
	 * Rotates the vector defined by x and y by the given angle in radians and stores the result in the query parameter.
	 * 
	 * @param <T> The type of the query parameter.
	 * 
	 * @param x The value of the x component of the vector.
	 * @param y The value of the y component of the vector.
	 * @param angle The angle in radians.
	 * @param res The query parameter.
	 * 
	 * @return The query parameter with the result.
	 */
	public static <T extends Vec2dBase> T rotate(double x, double y, double angle, T res)
	{
		double cos = Math.cos(angle);
		double sin = Math.sin(angle);

		res.set(x * cos - y * sin, x * sin + y * cos);
		
		return res;
	}
	
	/**
	 * Rotates the vector defined by x and y by the given angle in radians and relays the
	 * result to the functional interface which should return an object of any kind that stores the result.
	 * 
	 * @param <T> The type of the result object.
	 * 
	 * @param x The value of the x component of the vector.
	 * @param y The value of the y component of the vector.
	 * @param angle The angle in radians.
	 * @param func A functional interface implementation to create the result object.
	 * 
	 * @return The object returned from the functional interface.
	 */
	public static <T> T rotate(double x, double y, double angle, DoubleFunction2<T> func)
	{
		double cos = Math.cos(angle);
		double sin = Math.sin(angle);

		return func.apply(x * cos - y * sin, x * sin + y * cos);
	}
	
	/**
	 * Calculates the orthogonal projection of the vector defined by x and y onto the target vector defined by vX and vY
	 * and stores the result in the array.
	 * The vector to project on has to be normalized.
	 * 
	 * @param <T> The type of the query parameter.
	 * 
	 * @param x The value of the x component of the vector.
	 * @param y The value of the y component of the vector.
	 * @param vX The value of the x component of the projection target vector.
	 * @param vY The value of the y component of the projection target vector.
	 * @param res The result array.
	 * 
	 * @return The result array with the result.
	 */
	public static double[] project(double x, double y, double vX, double vY, double[] res)
	{
		double dot = Math.fma(x, vX, y * vY);
		
		res[COMP_X] = vX * dot;
		res[COMP_Y] = vY * dot;
		
		return res;
	}
	
	/**
	 * Calculates the orthogonal projection of the vector defined by x and y onto the target vector defined by vX and vY
	 * and stores the result in the query parameter.
	 * The vector to project on has to be normalized.
	 * 
	 * @param <T> The type of the query parameter.
	 * 
	 * @param x The value of the x component of the vector.
	 * @param y The value of the y component of the vector.
	 * @param vX The value of the x component of the projection target vector.
	 * @param vY The value of the y component of the projection target vector.
	 * @param res The query parameter.
	 * 
	 * @return The query parameter with the result.
	 */
	public static <T extends Vec2dBase> T project(double x, double y, double vX, double vY, T res)
	{
		double dot = Math.fma(x, vX, y * vY);
		
		res.set(vX * dot, vY * dot);
		
		return res;
	}
	
	/**
	 * Calculates the orthogonal projection of the vector defined by x and y onto the target vector defined by vX and vY
	 * and relays the result to the functional interface which should return an object of any kind that stores the result.
	 * The vector to project on has to be normalized.
	 * 
	 * @param <T> The type of the result object.
	 * 
	 * @param x The value of the x component of the vector.
	 * @param y The value of the y component of the vector.
	 * @param vX The value of the x component of the projection target vector.
	 * @param vY The value of the y component of the projection target vector.
	 * @param func A functional interface implementation to create the result object.
	 * 
	 * @return The object returned from the functional interface.
	 */
	public static <T> T project(double x, double y, double vX, double vY, DoubleFunction2<T> func)
	{
		double dot = Math.fma(x, vX, y * vY);

		return func.apply(vX * dot, vY * dot);
	}
	
	/**
	 * Calculates the reflection of the vector defined by x and y based on the given surface normal defined nX and nY 
	 * and stores the result in the array.
	 * The surface normal has to be normalized.
	 * 
	 * @param <T> The type of the query parameter.
	 * 
	 * @param x The value of the x component of the vector.
	 * @param y The value of the y component of the vector.
	 * @param nX The value of the x component of the surface normal.
	 * @param nY The value of the y component of the surface normal.
	 * @param res The result array.
	 * 
	 * @return The result array with the result.
	 */
	public static double[] reflect(double x, double y, double nX, double nY, double[] res)
	{
		double dot = -2 * Math.fma(x, nX, y * nY);
		
		res[COMP_X] = Math.fma(nX, dot, x);
		res[COMP_Y] = Math.fma(nY, dot, y);
		
		return res;
	}
	
	/**
	 * Calculates the reflection of the vector defined by x and y based on the given surface normal defined nX and nY 
	 * and stores the result in the query parameter.
	 * The surface normal has to be normalized.
	 * 
	 * @param <T> The type of the query parameter.
	 * 
	 * @param x The value of the x component of the vector.
	 * @param y The value of the y component of the vector.
	 * @param nX The value of the x component of the surface normal.
	 * @param nY The value of the y component of the surface normal.
	 * @param res The query parameter.
	 * 
	 * @return The query parameter with the result.
	 */
	public static <T extends Vec2dBase> T reflect(double x, double y, double nX, double nY, T res)
	{
		double dot = -2 * Math.fma(x, nX, y * nY);
		
		res.set(Math.fma(nX, dot, x), Math.fma(nY, dot, y));
		
		return res;
	}
	
	/**
	 * Calculates the reflection of the vector defined by x and y based on the given surface normal defined nX and nY 
	 * and relays the result to the functional interface which should return an object of any kind that stores the result.
	 * The surface normal has to be normalized.
	 * 
	 * @param <T> The type of the result object.
	 * 
	 * @param x The value of the x component of the vector.
	 * @param y The value of the y component of the vector.
	 * @param nX The value of the x component of the surface normal.
	 * @param nY The value of the y component of the surface normal.
	 * @param func A functional interface implementation to create the result object.
	 * 
	 * @return The object returned from the functional interface.
	 */
	public static <T> T reflect(double x, double y, double nX, double nY, DoubleFunction2<T> func)
	{
		double dot = -2 * Math.fma(x, nX, y * nY);
		
		return func.apply(Math.fma(nX, dot, x), Math.fma(nY, dot, y));
	}
	
	/**
	 * Returns the dot product (scalar product) between the first vector defined by x1 and y1 and
	 * the second vector defined by x2 and y2
	 * 
	 * <p>
	 * Operation:
	 * (x1, y1) . (x2, y2)
	 * 
	 * @param x1 The value of the x component of the first tuple.
	 * @param y1 The value of the y component of the first tuple.
	 * @param x2 The value of the x component of the second tuple.
	 * @param y2 The value of the y component of the second tuple.
	 * 
	 * @return The dot product (scalar product).
	 */
	public static double dot(double x1, double y1, double x2, double y2)
	{
		return Math.fma(x1, x2, y1 * y2);
	}
}
