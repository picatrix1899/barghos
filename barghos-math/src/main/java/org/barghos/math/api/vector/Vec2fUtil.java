package org.barghos.math.api.vector;

import static org.barghos.core.api.tuple.TupleConstants.*;

import org.barghos.core.api.tuple2.Tup2oC;
import org.barghos.core.api.tuple2.Tup2oR;
import org.barghos.core.api.util.function.FloatFunction2;
import org.barghos.core.api.util.function.GenericFunction2;

/**
 * This class provides utilities for working with 2-dimensional float vectors.
 * 
 * @author picatrix1899
 */
public class Vec2fUtil
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
	public static float[] add(float x1, float y1, float x2, float y2, float[] res)
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
	public static <T extends Vec2fC> T add(float x1, float y1, float x2, float y2, T res)
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
	public static <T> T add(float x1, float y1, float x2, float y2, FloatFunction2<T> func)
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
	public static float[] sub(float x1, float y1, float x2, float y2, float[] res)
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
	public static <T extends Vec2fC> T sub(float x1, float y1, float x2, float y2, T res)
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
	public static <T> T sub(float x1, float y1, float x2, float y2, FloatFunction2<T> func)
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
	public static float[] revSub(float x1, float y1, float x2, float y2, float[] res)
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
	public static <T extends Vec2fC> T revSub(float x1, float y1, float x2, float y2, T res)
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
	public static <T> T revSub(float x1, float y1, float x2, float y2, FloatFunction2<T> func)
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
	public static float[] mul(float x1, float y1, float x2, float y2, float[] res)
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
	public static <T extends Vec2fC> T mul(float x1, float y1, float x2, float y2, T res)
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
	public static <T> T mul(float x1, float y1, float x2, float y2, FloatFunction2<T> func)
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
	public static float[] div(float x1, float y1, float x2, float y2, float[] res)
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
	public static <T extends Vec2fC> T div(float x1, float y1, float x2, float y2, T res)
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
	public static <T> T div(float x1, float y1, float x2, float y2, FloatFunction2<T> func)
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
	public static float[] revDiv(float x1, float y1, float x2, float y2, float[] res)
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
	public static <T extends Vec2fC> T revDiv(float x1, float y1, float x2, float y2, T res)
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
	public static <T> T revDiv(float x1, float y1, float x2, float y2, FloatFunction2<T> func)
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
	public static float[] fma(float x, float y, float mX, float mY, float aX, float aY, float[] res)
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
	public static <T extends Vec2fC> T fma(float x, float y, float mX, float mY, float aX, float aY, T res)
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
	public static <T> T fma(float x, float y, float mX, float mY, float aX, float aY, FloatFunction2<T> func)
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
	public static float[] mulAdd(float x, float y, float mX1, float mY1, float mX2, float mY2, float[] res)
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
	public static <T extends Vec2fC> T mulAdd(float x, float y, float mX1, float mY1, float mX2, float mY2, T res)
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
	public static <T> T mulAdd(float x, float y, float mX1, float mY1, float mX2, float mY2, FloatFunction2<T> func)
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
	public static float reciprocalLength(float x, float y)
	{
		return 1.0f / (float)Math.sqrt(Math.fma(x, x, y * y));
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
	public static float reciprocalLengthSafe(float x, float y)
	{
		if(x + y == 0.0f) return 0.0f;
		
		return 1.0f / (float)Math.sqrt(Math.fma(x, x, y * y));
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
	public static float reciprocalLengthSafeWithMargin(float x, float y, float tolerance)
	{
		if(Math.abs(x) <= tolerance && Math.abs(y) <= tolerance) return 0.0f;
		
		return 1.0f / (float)Math.sqrt(Math.fma(x, x, y * y));
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
	public static float length(float x, float y)
	{
		return (float)Math.sqrt(Math.fma(x, x, y * y));
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
	public static float lengthSafe(float x, float y)
	{
		if(x + y == 0.0f) return 0.0f;
		
		return (float)Math.sqrt(Math.fma(x, x, y * y));
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
	public static float lengthSafeWithMargin(float x, float y, float tolerance)
	{
		if(Math.abs(x) <= tolerance && Math.abs(y) <= tolerance) return 0.0f;
		
		return (float)Math.sqrt(Math.fma(x, x, y * y));
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
	public static float squaredLength(float x, float y)
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
	public static float squaredLengthSafe(float x, float y)
	{
		if(x + y == 0.0f) return 0.0f;
		
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
	public static float squaredLengthSafeWithMargin(float x, float y, float tolerance)
	{
		if(Math.abs(x) <= tolerance && Math.abs(y) <= tolerance) return 0.0f;
		
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
	public static Tup2oR<Float,Integer> min(float x, float y)
	{
		float value = x;
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
	public static <T extends Tup2oC<Float,Integer>> T min(float x, float y, T res)
	{
		float value = x;
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
	public static <T> T min(float x, float y, GenericFunction2<Float,Integer,T> func)
	{
		float value = x;
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
	public static float minValue(float x, float y)
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
	public static int minComponent(float x, float y)
	{
		float value = x;
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
	public static Tup2oR<Float,Integer> max(float x, float y)
	{
		float value = x;
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
	public static <T extends Tup2oC<Float,Integer>> T max(float x, float y, T res)
	{
		float value = x;
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
	public static <T> T max(float x, float y, GenericFunction2<Float,Integer,T> func)
	{
		float value = x;
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
	public static float maxValue(float x, float y)
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
	public static int maxComponent(float x, float y)
	{
		float value = x;
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
	public static float[] normal(float x, float y, float[] res)
	{
		float recLength = 1.0f / (float)Math.sqrt(Math.fma(x, x, y * y));
		
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
	public static <T extends Vec2fC> T normal(float x, float y, T res)
	{
		float recLength = 1.0f / (float)Math.sqrt(Math.fma(x, x, y * y));
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
	public static <T> T normal(float x, float y, FloatFunction2<T> func)
	{
		float recLength = 1.0f / (float)Math.sqrt(Math.fma(x, x, y * y));
		
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
	public static float[] normalSafe(float x, float y, float[] res)
	{
		if(x + y == 0.0f)
		{
			res[COMP_X] = 0.0f;
			res[COMP_Y] = 0.0f;
			
			return res;
		}
		
		float recLength = 1.0f / (float)Math.sqrt(Math.fma(x, x, y * y));

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
	public static <T extends Vec2fC> T normalSafe(float x, float y, T res)
	{
		if(x + y == 0.0f)
		{
			res.set(0.0f);
			return res;
		}
		
		float recLength = 1.0f / (float)Math.sqrt(Math.fma(x, x, y * y));
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
	public static <T> T normalSafe(float x, float y, FloatFunction2<T> func)
	{
		if(x + y == 0.0f) return func.apply(0.0f, 0.0f);
		
		float recLength = 1.0f / (float)Math.sqrt(Math.fma(x, x, y * y));

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
	public static float[] normalSafeWithMargin(float x, float y, float tolerance, float[] res)
	{
		if(Math.abs(x) <= tolerance && Math.abs(y) <= tolerance)
		{
			res[COMP_X] = 0.0f;
			res[COMP_Y] = 0.0f;
			
			return res;
		}
		
		float recLength = 1.0f / (float)Math.sqrt(Math.fma(x, x, y * y));
		
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
	public static <T extends Vec2fC> T normalSafeWithMargin(float x, float y, float tolerance, T res)
	{
		if(Math.abs(x) <= tolerance && Math.abs(y) <= tolerance)
		{
			res.set(0.0f);
			return res;
		}
		
		float recLength = 1.0f / (float)Math.sqrt(Math.fma(x, x, y * y));
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
	public static <T> T normalSafeWithMargin(float x, float y, float tolerance, FloatFunction2<T> func)
	{
		if(Math.abs(x) <= tolerance && Math.abs(y) <= tolerance) return func.apply(0.0f, 0.0f);
		
		float recLength = 1.0f / (float)Math.sqrt(Math.fma(x, x, y * y));

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
	public static float[] invert(float x, float y, float[] res)
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
	public static <T extends Vec2fC> T invert(float x, float y, T res)
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
	public static <T> T invert(float x, float y,  FloatFunction2<T> func)
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
	public static float[] inverse(float x, float y, float x2, float y2, float[] res)
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
	public static <T extends Vec2fC> T inverse(float x, float y, float x2, float y2, T res)
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
	public static <T extends Vec2fC> T inverse(float x, float y, float x2, float y2, FloatFunction2<T> func)
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
	public static float[] half(float x, float y, float[] res)
	{
		res[COMP_X] = x * 0.5f;
		res[COMP_Y] = y * 0.5f;
		
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
	public static <T extends Vec2fC> T half(float x, float y, T res)
	{
		res.set(x * 0.5f, y * 0.5f);
		
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
	public static <T extends Vec2fC> T half(float x, float y, FloatFunction2<T> func)
	{
		return func.apply(x * 0.5f, y * 0.5f);
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
	public static float[] rotate(float x, float y, float angle, float[] res)
	{
		float cos = (float)Math.cos(angle);
		float sin = (float)Math.sin(angle);

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
	public static <T extends Vec2fC> T rotate(float x, float y, float angle, T res)
	{
		float cos = (float)Math.cos(angle);
		float sin = (float)Math.sin(angle);

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
	public static <T> T rotate(float x, float y, float angle, FloatFunction2<T> func)
	{
		float cos = (float)Math.cos(angle);
		float sin = (float)Math.sin(angle);

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
	public static float[] project(float x, float y, float vX, float vY, float[] res)
	{
		float dot = Math.fma(x, vX, y * vY);
		
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
	public static <T extends Vec2fC> T project(float x, float y, float vX, float vY, T res)
	{
		float dot = Math.fma(x, vX, y * vY);
		
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
	public static <T> T project(float x, float y, float vX, float vY, FloatFunction2<T> func)
	{
		float dot = Math.fma(x, vX, y * vY);

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
	public static float[] reflect(float x, float y, float nX, float nY, float[] res)
	{
		float dot = -2 * Math.fma(x, nX, y * nY);
		
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
	public static <T extends Vec2fC> T reflect(float x, float y, float nX, float nY, T res)
	{
		float dot = -2 * Math.fma(x, nX, y * nY);
		
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
	public static <T> T reflect(float x, float y, float nX, float nY, FloatFunction2<T> func)
	{
		float dot = -2 * Math.fma(x, nX, y * nY);
		
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
	public static float dot(float x1, float y1, float x2, float y2)
	{
		return Math.fma(x1, x2, y1 * y2);
	}
}
