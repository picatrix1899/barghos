package org.barghos.math.api.vector;

import org.barghos.core.api.util.function.DoubleFunction3;

/**
 * This class provides utilities for working with 3-dimensional double vectors.
 * 
 * @author picatrix1899
 */
public class Vec3dUtil
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
	public static <T extends Vec3dC> T add(double x1, double y1, double z1, double x2, double y2, double z2, T res)
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
	public static <T> T add(double x1, double y1, double z1, double x2, double y2, double z2, DoubleFunction3<T> func)
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
	public static <T extends Vec3dC> T sub(double x1, double y1, double z1, double x2, double y2, double z2, T res)
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
	public static <T> T sub(double x1, double y1, double z1, double x2, double y2, double z2, DoubleFunction3<T> func)
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
	public static <T extends Vec3dC> T revSub(double x1, double y1, double z1, double x2, double y2, double z2, T res)
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
	public static <T> T revSub(double x1, double y1, double z1, double x2, double y2, double z2, DoubleFunction3<T> func)
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
	public static <T extends Vec3dC> T mul(double x1, double y1, double z1, double x2, double y2, double z2, T res)
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
	public static <T> T mul(double x1, double y1, double z1, double x2, double y2, double z2, DoubleFunction3<T> func)
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
	public static <T extends Vec3dC> T div(double x1, double y1, double z1, double x2, double y2, double z2, T res)
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
	public static <T> T div(double x1, double y1, double z1, double x2, double y2, double z2, DoubleFunction3<T> func)
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
	public static <T extends Vec3dC> T revDiv(double x1, double y1, double z1, double x2, double y2, double z2, T res)
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
	public static <T> T revDiv(double x1, double y1, double z1, double x2, double y2, double z2, DoubleFunction3<T> func)
	{
		return func.apply(x2 / x1, y2 / y1, z2 / z1);
	}
}
