package org.barghos.math.api.vector;

import org.barghos.core.api.util.function.FloatFunction2;

/**
 * This class provides utilities for working with 2-dimensional float vectors.
 * 
 * @author picatrix1899
 */
public class Vec2fUtil
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
	public static <T extends Vec2fBase> T add(float x1, float y1, float x2, float y2, T res)
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
	public static <T extends Vec2fBase> T sub(float x1, float y1, float x2, float y2, T res)
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
	public static <T extends Vec2fBase> T revSub(float x1, float y1, float x2, float y2, T res)
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
	public static <T extends Vec2fBase> T mul(float x1, float y1, float x2, float y2, T res)
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
	public static <T extends Vec2fBase> T div(float x1, float y1, float x2, float y2, T res)
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
	public static <T extends Vec2fBase> T revDiv(float x1, float y1, float x2, float y2, T res)
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
}
