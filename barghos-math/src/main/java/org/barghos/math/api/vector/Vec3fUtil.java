package org.barghos.math.api.vector;

import org.barghos.core.api.tuple3.Tup3fBase;
import org.barghos.core.api.tuple3.Tup3fR;
import org.barghos.core.api.util.function.FloatFunction3;
import org.barghos.math.util.Maths;

/**
 * This class provides utilities for working with 3-dimensional float vectors.
 * 
 * @author picatrix1899
 */
public class Vec3fUtil
{
	/**
	 * Adds the second tuple defined by x2, y2 and z2 to the first vector
	 * defined by x1, y1 and z1 and stores the result in the query parameter.
	 * 
	 * <p>
	 * Operation:
	 * (x1, y1, z1) + (x2, y2, z2)
	 * 
	 * @param <T> The type of the query parameter.
	 * 
	 * @param x1 The value of the x component of the first tuple.
	 * @param y1 The value of the y component of the first tuple.
	 * @param z1 The value of the z component of the first tuple.
	 * @param x2 The value of the x component of the second tuple.
	 * @param y2 The value of the y component of the second tuple.
	 * @param z2 The value of the z component of the second tuple.
	 * @param res The query parameter.
	 * 
	 * @return The query parameter with the result.
	 */
	public static <T extends Vec3fBase> T add(float x1, float y1, float z1, float x2, float y2, float z2, T res)
	{
		res.set(x1 + x2, y1 + y2, z1 + z2);
		return res;
	}
	
	/**
	 * Adds the second tuple defined by x2, y2 and z2 to the first vector
	 * defined by x1, y1 and z1 and relays the result to the functional interface
	 * which should return an object of any kind that stores the result.
	 * 
	 * <p>
	 * This variant is useful for example for creating readonly instances or to use factories.
	 * 
	 * <p>
	 * Operation:
	 * (x1, y1, z1) + (x2, y2, z2)
	 * 
	 * @param <T> The type of the result object.
	 * 
	 * @param x1 The value of the x component of the first tuple.
	 * @param y1 The value of the y component of the first tuple.
	 * @param z1 The value of the z component of the first tuple.
	 * @param x2 The value of the x component of the second tuple.
	 * @param y2 The value of the y component of the second tuple.
	 * @param z2 The value of the z component of the second tuple.
	 * @param func A functional interface implementation to create the result object.
	 * 
	 * @return The object returned from the functional interface.
	 */
	public static <T> T add(float x1, float y1, float z1, float x2, float y2, float z2, FloatFunction3<T> func)
	{
		return func.apply(x1 + x2, y1 + y2, z1 + z2);
	}
	
	/**
	 * Subtracts the second tuple defined by x2, y2 and z2 from the first vector
	 * defined by x1, y1 and z1 and stores the result in the query parameter.
	 * 
	 * <p>
	 * Operation:
	 * (x1, y1, z1) - (x2, y2, z2)
	 * 
	 * @param <T> The type of the query parameter.
	 * 
	 * @param x1 The value of the x component of the first tuple.
	 * @param y1 The value of the y component of the first tuple.
	 * @param z1 The value of the z component of the first tuple.
	 * @param x2 The value of the x component of the second tuple.
	 * @param y2 The value of the y component of the second tuple.
	 * @param z2 The value of the z component of the second tuple.
	 * @param res The query parameter.
	 * 
	 * @return The query parameter with the result.
	 */
	public static <T extends Vec3fBase> T sub(float x1, float y1, float z1, float x2, float y2, float z2, T res)
	{
		res.set(x1 - x2, y1 - y2, z1 - z2);
		return res;
	}
	
	/**
	 * Subtracts the second tuple defined by x2, y2 and z2 from the first vector
	 * defined by x1, y1 and z1 and relays the result to the functional interface
	 * which should return an object of any kind that stores the result.
	 * 
	 * <p>
	 * This variant is useful for example for creating readonly instances or to use factories.
	 * 
	 * <p>
	 * Operation:
	 * (x1, y1, z1) - (x2, y2, z2)
	 * 
	 * @param <T> The type of the result object.
	 * 
	 * @param x1 The value of the x component of the first tuple.
	 * @param y1 The value of the y component of the first tuple.
	 * @param z1 The value of the z component of the first tuple.
	 * @param x2 The value of the x component of the second tuple.
	 * @param y2 The value of the y component of the second tuple.
	 * @param z2 The value of the z component of the second tuple.
	 * @param func A functional interface implementation to create the result object.
	 * 
	 * @return The object returned from the functional interface.
	 */
	public static <T> T sub(float x1, float y1, float z1, float x2, float y2, float z2, FloatFunction3<T> func)
	{
		return func.apply(x1 - x2, y1 - y2, z1 - z2);
	}
	
	/**
	 * Subtracts the first tuple defined by x1, y1 and z1 from the second vector
	 * defined by x2, y2 and z2 and stores the result in the query parameter.
	 * 
	 * <p>
	 * Operation:
	 * (x2, y2, z2) - (x1, y1, z1)
	 * 
	 * @param <T> The type of the query parameter.
	 * 
	 * @param x1 The value of the x component of the first tuple.
	 * @param y1 The value of the y component of the first tuple.
	 * @param z1 The value of the z component of the first tuple.
	 * @param x2 The value of the x component of the second tuple.
	 * @param y2 The value of the y component of the second tuple.
	 * @param z2 The value of the z component of the second tuple.
	 * @param res The query parameter.
	 * 
	 * @return The query parameter with the result.
	 */
	public static <T extends Vec3fBase> T revSub(float x1, float y1, float z1, float x2, float y2, float z2, T res)
	{
		res.set(x2 - x1, y2 - y1, z2 - z1);
		return res;
	}
	
	/**
	 * Subtracts the first tuple defined by x1, y1 and z1 from the second vector
	 * defined by x2, y2 and z2 and relays the result to the functional interface
	 * which should return an object of any kind that stores the result.
	 * 
	 * <p>
	 * This variant is useful for example for creating readonly instances or to use factories.
	 * 
	 * <p>
	 * Operation:
	 * (x2, y2, z2) - (x1, y1, z1)
	 * 
	 * @param <T> The type of the result object.
	 * 
	 * @param x1 The value of the x component of the first tuple.
	 * @param y1 The value of the y component of the first tuple.
	 * @param z1 The value of the z component of the first tuple.
	 * @param x2 The value of the x component of the second tuple.
	 * @param y2 The value of the y component of the second tuple.
	 * @param z2 The value of the z component of the second tuple.
	 * @param func A functional interface implementation to create the result object.
	 * 
	 * @return The object returned from the functional interface.
	 */
	public static <T> T revSub(float x1, float y1, float z1, float x2, float y2, float z2, FloatFunction3<T> func)
	{
		return func.apply(x2 - x1, y2 - y1, z2 - z1);
	}
	
	/**
	 * Multiplies the first tuple defined by x1, y1 and z1 with the second vector
	 * defined by x2, y2 and z2 and stores the result in the query parameter.
	 * 
	 * <p>
	 * Operation:
	 * (x1, y1, z1) * (x2, y2, z2)
	 * 
	 * @param <T> The type of the query parameter.
	 * 
	 * @param x1 The value of the x component of the first tuple.
	 * @param y1 The value of the y component of the first tuple.
	 * @param z1 The value of the z component of the first tuple.
	 * @param x2 The value of the x component of the second tuple.
	 * @param y2 The value of the y component of the second tuple.
	 * @param z2 The value of the z component of the second tuple.
	 * @param res The query parameter.
	 * 
	 * @return The query parameter with the result.
	 */
	public static <T extends Vec3fBase> T mul(float x1, float y1, float z1, float x2, float y2, float z2, T res)
	{
		res.set(x1 * x2, y1 * y2, z1 * z2);
		return res;
	}
	
	/**
	 * Multiplies the first tuple defined by x1, y1 and z1 with the second vector
	 * defined by x2, y2 and z2 and relays the result to the functional interface
	 * which should return an object of any kind that stores the result.
	 * 
	 * <p>
	 * This variant is useful for example for creating readonly instances or to use factories.
	 * 
	 * <p>
	 * Operation:
	 * (x1, y1, z1) * (x2, y2, z2)
	 * 
	 * @param <T> The type of the result object.
	 * 
	 * @param x1 The value of the x component of the first tuple.
	 * @param y1 The value of the y component of the first tuple.
	 * @param z1 The value of the z component of the first tuple.
	 * @param x2 The value of the x component of the second tuple.
	 * @param y2 The value of the y component of the second tuple.
	 * @param z2 The value of the z component of the second tuple.
	 * @param func A functional interface implementation to create the result object.
	 * 
	 * @return The object returned from the functional interface.
	 */
	public static <T> T mul(float x1, float y1, float z1, float x2, float y2, float z2, FloatFunction3<T> func)
	{
		return func.apply(x1 * x2, y1 * y2, z1 * z2);
	}
	
	/**
	 * Divides the first tuple defined by x1, y1 and z1 by the second vector
	 * defined by x2, y2 and z2 and stores the result in the query parameter.
	 * 
	 * <p>
	 * Operation:
	 * (x1, y1, z1) / (x2, y2, z2)
	 * 
	 * @param <T> The type of the query parameter.
	 * 
	 * @param x1 The value of the x component of the first tuple.
	 * @param y1 The value of the y component of the first tuple.
	 * @param z1 The value of the z component of the first tuple.
	 * @param x2 The value of the x component of the second tuple.
	 * @param y2 The value of the y component of the second tuple.
	 * @param z2 The value of the z component of the second tuple.
	 * @param res The query parameter.
	 * 
	 * @return The query parameter with the result.
	 */
	public static <T extends Vec3fBase> T div(float x1, float y1, float z1, float x2, float y2, float z2, T res)
	{
		res.set(x1 / x2, y1 / y2, z1 / z2);
		return res;
	}
	
	/**
	 * Divides the first tuple defined by x1, y1 and z1 by the second vector
	 * defined by x2, y2 and z2 and relays the result to the functional interface
	 * which should return an object of any kind that stores the result.
	 * 
	 * <p>
	 * This variant is useful for example for creating readonly instances or to use factories.
	 * 
	 * <p>
	 * Operation:
	 * (x1, y1, z1) / (x2, y2, z2)
	 * 
	 * @param <T> The type of the result object.
	 * 
	 * @param x1 The value of the x component of the first tuple.
	 * @param y1 The value of the y component of the first tuple.
	 * @param z1 The value of the z component of the first tuple.
	 * @param x2 The value of the x component of the second tuple.
	 * @param y2 The value of the y component of the second tuple.
	 * @param z2 The value of the z component of the second tuple.
	 * @param func A functional interface implementation to create the result object.
	 * 
	 * @return The object returned from the functional interface.
	 */
	public static <T> T div(float x1, float y1, float z1, float x2, float y2, float z2, FloatFunction3<T> func)
	{
		return func.apply(x1 / x2, y1 / y2, z1 / z2);
	}
	
	/**
	 * Divides the second tuple defined by x2, y2 and z2 by the first vector
	 * defined by x1, y1, z1 and stores the result in the query parameter.
	 * 
	 * <p>
	 * Operation:
	 * (x2, y2, z2) / (x1, y1, z1)
	 * 
	 * @param <T> The type of the query parameter.
	 * 
	 * @param x1 The value of the x component of the first tuple.
	 * @param y1 The value of the y component of the first tuple.
	 * @param z1 The value of the z component of the first tuple.
	 * @param x2 The value of the x component of the second tuple.
	 * @param y2 The value of the y component of the second tuple.
	 * @param z2 The value of the z component of the second tuple.
	 * @param res The query parameter.
	 * 
	 * @return The query parameter with the result.
	 */
	public static <T extends Vec3fBase> T revDiv(float x1, float y1, float z1, float x2, float y2, float z2, T res)
	{
		res.set(x2 / x1, y2 / y1, z2 / z1);
		return res;
	}
	
	/**
	 * Divides the second tuple defined by x2, y2 and z2 by the first vector
	 * defined by x1, y1 and z1 and relays the result to the functional interface
	 * which should return an object of any kind that stores the result.
	 * 
	 * <p>
	 * This variant is useful for example for creating readonly instances or to use factories.
	 * 
	 * <p>
	 * Operation:
	 * (x2, y2, z2) / (x1, y1, z1)
	 * 
	 * @param <T> The type of the result object.
	 * 
	 * @param x1 The value of the x component of the first tuple.
	 * @param y1 The value of the y component of the first tuple.
	 * @param z1 The value of the z component of the first tuple.
	 * @param x2 The value of the x component of the second tuple.
	 * @param y2 The value of the y component of the second tuple.
	 * @param z2 The value of the z component of the second tuple.
	 * @param func A functional interface implementation to create the result object.
	 * 
	 * @return The object returned from the functional interface.
	 */
	public static <T> T revDiv(float x1, float y1, float z1, float x2, float y2, float z2, FloatFunction3<T> func)
	{
		return func.apply(x2 / x1, y2 / y1, z2 / z1);
	}
	
	public static <T extends Tup3fBase> T lerp(Tup3fR a, Tup3fR b, float alpha, T res)
	{
		float x =  Maths.lerpf(a.getX(), b.getX(), alpha);
		float y =  Maths.lerpf(a.getY(), b.getY(), alpha);
		float z =  Maths.lerpf(a.getZ(), b.getZ(), alpha);
		
		res.set(x, y, z);
		
		return res;
	}
}
