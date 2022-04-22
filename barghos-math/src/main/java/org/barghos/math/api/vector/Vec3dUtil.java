package org.barghos.math.api.vector;

import static org.barghos.core.api.tuple.TupleConstants.*;

import org.barghos.core.api.tuple2.Tup2oC;
import org.barghos.core.api.tuple3.Tup3dR;
import org.barghos.core.api.util.ExtractParam;
import org.barghos.core.api.util.function.DoubleFunction3;
import org.barghos.core.api.util.function.GenericFunction2;

/**
 * This class provides utilities for working with 3-dimensional double vectors.
 * 
 * @author picatrix1899
 */
public class Vec3dUtil
{
	/**
	 * Adds the second vector (x2, y2, z2) to the first vector (x1, y1, z1).
	 * The result is saved in the given result array.
	 * 
	 * <p>
	 * Operation:
	 * (x1, y1, z1) + (x2, y2, z2)
	 * 
	 * @param x1 The value of the x component of the first tuple.
	 * @param y1 The value of the y component of the first tuple.
	 * @param z1 The value of the z component of the first tuple.
	 * @param x2 The value of the x component of the second tuple.
	 * @param y2 The value of the y component of the second tuple.
	 * @param z2 The value of the z component of the second tuple.
	 * @param res The result array.
	 * 
	 * @return The result array with the result.
	 */
	public static double[] add(double x1, double y1, double z1, double x2, double y2, double z2, @ExtractParam double[] res)
	{
		res[COMP_X] = x1 + x2;
		res[COMP_Y] = y1 + y2;
		res[COMP_Z] = z1 + z2;
		
		return res;
	}
	
	/**
	 * Adds the second vector (x2, y2, z2) to the first vector (x1, y1, z1).
	 * The result is saved in the extraction parameter object.
	 * 
	 * <p>
	 * Operation:
	 * (x1, y1, z1) + (x2, y2, z2)
	 * 
	 * @param <T> The type of the extraction parameter object.
	 * 
	 * @param x1 The value of the x component of the first tuple.
	 * @param y1 The value of the y component of the first tuple.
	 * @param z1 The value of the z component of the first tuple.
	 * @param x2 The value of the x component of the second tuple.
	 * @param y2 The value of the y component of the second tuple.
	 * @param z2 The value of the z component of the second tuple.
	 * @param res The extraction parameter object.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Vec3dC> T add(double x1, double y1, double z1, double x2, double y2, double z2, @ExtractParam T res)
	{
		res.set(x1 + x2, y1 + y2, z1 + z2);

		return res;
	}
	
	/**
	 * Adds the second vector (x2, y2, z2) to the first vector (x1, y1, z1).
	 * The result is relayed to the functional interface implementation.
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
	 * @param func A functional interface implementation to take the result.
	 * 
	 * @return The object returned from the functional interface.
	 */
	public static <T> T add(double x1, double y1, double z1, double x2, double y2, double z2, @ExtractParam DoubleFunction3<T> func)
	{
		return func.apply(x1 + x2, y1 + y2, z1 + z2);
	}
	
	/**
	 * Subtracts the second vector (x2, y2, z2) from the first vector (x1, y1, z1).
	 * The result is saved in the given result array.
	 * 
	 * <p>
	 * Operation:
	 * (x1, y1, z1) - (x2, y2, z2)
	 * 
	 * @param x1 The value of the x component of the first tuple.
	 * @param y1 The value of the y component of the first tuple.
	 * @param z1 The value of the z component of the first tuple.
	 * @param x2 The value of the x component of the second tuple.
	 * @param y2 The value of the y component of the second tuple.
	 * @param z2 The value of the z component of the second tuple.
	 * @param res The result array.
	 * 
	 * @return The result array with the result.
	 */
	public static double[] sub(double x1, double y1, double z1, double x2, double y2, double z2, @ExtractParam double[] res)
	{
		res[COMP_X] = x1 - x2;
		res[COMP_Y] = y1 - y2;
		res[COMP_Z] = z1 - z2;
		
		return res;
	}
	
	/**
	 * Subtracts the second vector (x2, y2, z2) from the first vector (x1, y1, z1).
	 * The result is saved in the extraction parameter object.
	 * 
	 * <p>
	 * Operation:
	 * (x1, y1, z1) - (x2, y2, z2)
	 * 
	 * @param <T> The type of the extraction parameter object.
	 * 
	 * @param x1 The value of the x component of the first tuple.
	 * @param y1 The value of the y component of the first tuple.
	 * @param z1 The value of the z component of the first tuple.
	 * @param x2 The value of the x component of the second tuple.
	 * @param y2 The value of the y component of the second tuple.
	 * @param z2 The value of the z component of the second tuple.
	 * @param res The extraction parameter object.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Vec3dC> T sub(double x1, double y1, double z1, double x2, double y2, double z2, @ExtractParam T res)
	{
		res.set(x1 - x2, y1 - y2, z1 - z2);
		
		return res;
	}
	
	/**
	 * Subtracts the second vector (x2, y2, z2) from the first vector (x1, y1, z1).
	 * The result is relayed to the functional interface implementation.
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
	 * @param func A functional interface implementation to take the result.
	 * 
	 * @return The object returned from the functional interface.
	 */
	public static <T> T sub(double x1, double y1, double z1, double x2, double y2, double z2, @ExtractParam DoubleFunction3<T> func)
	{
		return func.apply(x1 - x2, y1 - y2, z1- z2);
	}
	
	/**
	 * Subtracts the first vector (x1, y1, z1) from the second vector (x2, y2, z2).
	 * The result is saved in the given result array.
	 * 
	 * <p>
	 * Operation:
	 * (x2, y2, z2) - (x1, y1, z1)
	 * 
	 * @param x1 The value of the x component of the first tuple.
	 * @param y1 The value of the y component of the first tuple.
	 * @param z1 The value of the z component of the first tuple.
	 * @param x2 The value of the x component of the second tuple.
	 * @param y2 The value of the y component of the second tuple.
	 * @param z2 The value of the z component of the second tuple.
	 * @param res The result array.
	 * 
	 * @return The result array with the result.
	 */
	public static double[] revSub(double x1, double y1, double z1, double x2, double y2, double z2, @ExtractParam double[] res)
	{
		res[COMP_X] = x2 - x1;
		res[COMP_Y] = y2 - y1;
		res[COMP_Z] = z2 - z1;
		
		return res;
	}
	
	/**
	 * Subtracts the first vector (x1, y1, z1) from the second vector (x2, y2, z2).
	 * The result is saved in the extraction parameter object.
	 * 
	 * <p>
	 * Operation:
	 * (x2, y2, z2) - (x1, y1, z1)
	 * 
	 * @param <T> The type of the extraction parameter object.
	 * 
	 * @param x1 The value of the x component of the first tuple.
	 * @param y1 The value of the y component of the first tuple.
	 * @param z1 The value of the z component of the first tuple.
	 * @param x2 The value of the x component of the second tuple.
	 * @param y2 The value of the y component of the second tuple.
	 * @param z2 The value of the z component of the second tuple.
	 * @param res The extraction parameter object.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Vec3dC> T revSub(double x1, double y1, double z1, double x2, double y2, double z2, @ExtractParam T res)
	{
		res.set(x2 - x1, y2 - y1, z2 - z1);
		
		return res;
	}
	
	/**
	 * Subtracts the first vector (x1, y1, z1) from the second vector (x2, y2, z2).
	 * The result is relayed to the functional interface implementation.
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
	 * @param func A functional interface implementation to take the result.
	 * 
	 * @return The object returned from the functional interface.
	 */
	public static <T> T revSub(double x1, double y1, double z1, double x2, double y2, double z2, @ExtractParam DoubleFunction3<T> func)
	{
		return func.apply(x2 - x1, y2 - y1, z2 - z1);
	}
	
	/**
	 * Multiplies the first vector(x1, y1, z1) with the second vector (x2, y2, z2).
	 * The result is saved in the given result array.
	 * 
	 * <p>
	 * Operation:
	 * (x1, y1, z1) * (x2, y2, z2)
	 * 
	 * @param x1 The value of the x component of the first tuple.
	 * @param y1 The value of the y component of the first tuple.
	 * @param z1 The value of the z component of the first tuple.
	 * @param x2 The value of the x component of the second tuple.
	 * @param y2 The value of the y component of the second tuple.
	 * @param z2 The value of the z component of the second tuple.
	 * @param res The result array.
	 * 
	 * @return The result array with the result.
	 */
	public static double[] mul(double x1, double y1, double z1, double x2, double y2, double z2, @ExtractParam double[] res)
	{
		res[COMP_X] = x1 * x2;
		res[COMP_Y] = y1 * y2;
		res[COMP_Z] = z1 * z2;
		
		return res;
	}
	
	/**
	 * Multiplies the first vector (x1, y1, z1) with the second vector (x2, y2, z2).
	 * The result is saved in the extraction parameter object.
	 * 
	 * <p>
	 * Operation:
	 * (x1, y1, z1) * (x2, y2, z2)
	 * 
	 * @param <T> The type of the extraction parameter object.
	 * 
	 * @param x1 The value of the x component of the first tuple.
	 * @param y1 The value of the y component of the first tuple.
	 * @param z1 The value of the z component of the first tuple.
	 * @param x2 The value of the x component of the second tuple.
	 * @param y2 The value of the y component of the second tuple.
	 * @param z2 The value of the z component of the second tuple.
	 * @param res The extraction parameter object.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Vec3dC> T mul(double x1, double y1, double z1, double x2, double y2, double z2, @ExtractParam T res)
	{
		res.set(x1 * x2, y1 * y2, z1 * z2);
		
		return res;
	}
	
	/**
	 * Multiplies the first vector (x1, y1, z1) with the second vector (x2, y2, z2)
	 * The result is relayed to the functional interface implementation.
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
	 * @param func A functional interface implementation to take the result.
	 * 
	 * @return The object returned from the functional interface.
	 */
	public static <T> T mul(double x1, double y1, double z1, double x2, double y2, double z2, @ExtractParam DoubleFunction3<T> func)
	{
		return func.apply(x1 * x2, y1 * y2, z1 * z2);
	}
	
	/**
	 * Divides the first vector (x1, y1, z1) by the second vector (x2, y2, z2).
	 * The result is saved in the given result array.
	 * 
	 * <p>
	 * Operation:
	 * (x1, y1, z1) / (x2, y2, z2)
	 * 
	 * @param x1 The value of the x component of the first tuple.
	 * @param y1 The value of the y component of the first tuple.
	 * @param z1 The value of the z component of the first tuple.
	 * @param x2 The value of the x component of the second tuple.
	 * @param y2 The value of the y component of the second tuple.
	 * @param z2 The value of the z component of the second tuple.
	 * @param res The result array.
	 * 
	 * @return The result array with the result.
	 */
	public static double[] div(double x1, double y1, double z1, double x2, double y2, double z2, @ExtractParam double[] res)
	{
		res[COMP_X] = x1 / x2;
		res[COMP_Y] = y1 / y2;
		res[COMP_Z] = z1 / z2;
		
		return res;
	}
	
	/**
	 * Divides the first vector (x1, y1, z1) by the second vector (x2, y2, z2).
	 * The result is saved in the extraction parameter object.
	 * 
	 * <p>
	 * Operation:
	 * (x1, y1, z1) / (x2, y2, z2)
	 * 
	 * @param <T> The type of the extraction parameter object.
	 * 
	 * @param x1 The value of the x component of the first tuple.
	 * @param y1 The value of the y component of the first tuple.
	 * @param z1 The value of the z component of the first tuple.
	 * @param x2 The value of the x component of the second tuple.
	 * @param y2 The value of the y component of the second tuple.
	 * @param z2 The value of the z component of the second tuple.
	 * @param res The extraction parameter object.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Vec3dC> T div(double x1, double y1, double z1, double x2, double y2, double z2, @ExtractParam T res)
	{
		res.set(x1 / x2, y1 / y2, z1 / z2);
		
		return res;
	}
	
	/**
	 * Divides the first vector (x1, y1, z1) by the second vector (x2, y2, z2).
	 * The result is relayed to the functional interface implementation.
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
	 * @param func A functional interface implementation to take the result.
	 * 
	 * @return The object returned from the functional interface.
	 */
	public static <T> T div(double x1, double y1, double z1, double x2, double y2, double z2, @ExtractParam DoubleFunction3<T> func)
	{
		return func.apply(x1 / x2, y1 / y2, z1 / z2);
	}
	
	/**
	 * Divides the second vector (x2, y2, z2) by the first vector (x1, y1, z1).
	 * The result is saved in the given result array.
	 * 
	 * <p>
	 * Operation:
	 * (x2, y2, z2) / (x1, y1, z1)
	 * 
	 * @param x1 The value of the x component of the first tuple.
	 * @param y1 The value of the y component of the first tuple.
	 * @param z1 The value of the z component of the first tuple.
	 * @param x2 The value of the x component of the second tuple.
	 * @param y2 The value of the y component of the second tuple.
	 * @param z2 The value of the z component of the second tuple.
	 * @param res The result array.
	 * 
	 * @return The result array with the result.
	 */
	public static double[] revDiv(double x1, double y1, double z1, double x2, double y2, double z2, @ExtractParam double[] res)
	{
		res[COMP_X] = x2 / x1;
		res[COMP_Y] = y2 / y1;
		res[COMP_Z] = z2 / z1;
		
		return res;
	}
	
	/**
	 * Divides the second vector (x2, y2, z2) by the first vector (x1, y1, z1).
	 * The result is saved in the extraction parameter object.
	 * 
	 * <p>
	 * Operation:
	 * (x2, y2, z2) / (x1, y1, z1)
	 * 
	 * @param <T> The type of the extraction parameter.
	 * 
	 * @param x1 The value of the x component of the first tuple.
	 * @param y1 The value of the y component of the first tuple.
	 * @param z1 The value of the z component of the first tuple.
	 * @param x2 The value of the x component of the second tuple.
	 * @param y2 The value of the y component of the second tuple.
	 * @param z2 The value of the z component of the second tuple.
	 * @param res The extraction parameter.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static <T extends Vec3dC> T revDiv(double x1, double y1, double z1, double x2, double y2, double z2, @ExtractParam T res)
	{
		res.set(x2 / x1, y2 / y1, z2 / z1);
		
		return res;
	}
	
	/**
	 * Divides the second vector (x2, y2, z2) by the first vector (x1, y1, z1).
	 * The result is relayed to the functional interface implementation.
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
	 * @param func A functional interface implementation to take the result.
	 * 
	 * @return The object returned from the functional interface.
	 */
	public static <T> T revDiv(double x1, double y1, double z1, double x2, double y2, double z2, @ExtractParam DoubleFunction3<T> func)
	{
		return func.apply(x2 / x1, y2 / y1, z2 / z1);
	}
	
	/**
	 * Performs an fma ({@link Math#fma}) combined multiplication and addition operation on the vector (x, y, z)
	 * with the two given vectors (mX, mY, mZ) and (aX, aY, aZ).
	 * The result is saved in the given result array.
	 * In this version the vector is used as a multiplicant.
	 * 
	 * <p>
	 * Operation:
	 * (x, y, z) * (mX, mY, mZ) + (aX, aY, aZ)
	 * 
	 * @param x The value of the x component of the first multiplicant.
	 * @param y The value of the y component of the first multiplicant.
	 * @param z The value of the z component of the first multiplicant.
	 * @param mX The value of the x component of the second multiplicant.
	 * @param mY The value of the y component of the second multiplicant.
	 * @param mZ The value of the z component of the second multiplicant.
	 * @param aX The value of the x component of the addend.
	 * @param aY The value of the y component of the addend.
	 * @param aZ The value of the z component of the addend.
	 * @param res The result array.
	 * 
	 * @return The result array with the result.
	 */
	public static double[] fma(double x, double y, double z, double mX, double mY, double mZ, double aX, double aY, double aZ, @ExtractParam double[] res)
	{
		res[COMP_X] = Math.fma(x, mX, aX);
		res[COMP_Y] = Math.fma(y, mY, aY);
		res[COMP_Z] = Math.fma(z, mZ, aZ);
		
		return res;
	}
	
	/**
	 * Performs an fma ({@link Math#fma}) combined multiplication and addition operation on the vector (x, y, z)
	 * with the two given vectors (mX, mY, mZ) and (aX, aY, aZ).
	 * The result is saved in the extraction parameter object.
	 * In this version the vector is used as a multiplicant.
	 * 
	 * <p>
	 * Operation:
	 * (x, y, z) * (mX, mY, mZ) + (aX, aY, aZ)
	 * 
	 * @param <T> The type of the extraction parameter object.
	 * 
	 * @param x The value of the x component of the first multiplicant.
	 * @param y The value of the y component of the first multiplicant.
	 * @param z The value of the z component of the first multiplicant.
	 * @param mX The value of the x component of the second multiplicant.
	 * @param mY The value of the y component of the second multiplicant.
	 * @param mZ The value of the z component of the second multiplicant.
	 * @param aX The value of the x component of the addend.
	 * @param aY The value of the y component of the addend.
	 * @param aZ The value of the z component of the addend.
	 * @param res The extraction parameter object.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Vec3dC> T fma(double x, double y, double z, double mX, double mY, double mZ, double aX, double aY, double aZ, @ExtractParam T res)
	{
		res.set(Math.fma(x, mX, aX), Math.fma(y, mY, aY), Math.fma(z, mZ, aZ));
		
		return res;
	}
	
	/**
	 * Performs an fma ({@link Math#fma}) combined multiplication and addition operation on the vector (x, y, z)
	 * with the two given vectors (mX, mY, mZ) and (aX, aY, aZ).
	 * The result is relayed to the functional interface implementation.
	 * In this version the vector is used as a multiplicant.
	 * 
	 * <p>
	 * This variant is useful for example for creating readonly instances or to use factories.
	 * 
	 * <p>
	 * Operation:
	 * (x, y, z) * (mX, mY, mZ) + (aX, aY, aZ)
	 * 
	 * @param <T> The type of the result object.
	 * 
	 * @param x The value of the x component of the first multiplicant.
	 * @param y The value of the y component of the first multiplicant.
	 * @param z The value of the z component of the first multiplicant.
	 * @param mX The value of the x component of the second multiplicant.
	 * @param mY The value of the y component of the second multiplicant.
	 * @param mZ The value of the z component of the second multiplicant.
	 * @param aX The value of the x component of the addend.
	 * @param aY The value of the y component of the addend.
	 * @param aZ The value of the z component of the addend.
	 * @param func A functional interface implementation to create the result object.
	 * 
	 * @return The object returned from the functional interface.
	 */
	public static <T> T fma(double x, double y, double z, double mX, double mY, double mZ, double aX, double aY, double aZ, @ExtractParam DoubleFunction3<T> func)
	{
		return func.apply(Math.fma(x, mX, aX), Math.fma(y, mY, aY), Math.fma(z, mZ, aZ));
	}
	
	/**
	 * Performs an fma ({@link Math#fma}) combined multiplication and addition operation on the vector (x, y, z)
	 * with the two given vector (m1X, m1Y, m1Z) and (m2X, m2Y, m2Z).
	 * The result is saved in the given result array.
	 * In this version the vector is used as the addend.
	 * 
	 * <p>
	 * Operation:
	 * (x, y, z) + (m1X, m1Y, m1Z) * (m2X, m2Y, m2Z)
	 * 
	 * @param x The value of the x component of the addend.
	 * @param y The value of the y component of the addend.
	 * @param z The value of the z component of the addend.
	 * @param m1X The value of the x component of the first multiplicant.
	 * @param m1Y The value of the y component of the first multiplicant.
	 * @param m1Z The value of the z component of the first multiplicant.
	 * @param m2X The value of the x component of the second multiplicant.
	 * @param m2Y The value of the y component of the second multiplicant.
	 * @param m2Z The value of the z component of the second multiplicant.
	 * @param res The result array.
	 * 
	 * @return The result array with the result.
	 */
	public static double[] mulAdd(double x, double y, double z, double m1X, double m1Y, double m1Z, double m2X, double m2Y, double m2Z, @ExtractParam double[] res)
	{
		res[COMP_X] = Math.fma(m1X, m2X, x);
		res[COMP_Y] = Math.fma(m1Y, m2Y, y);
		res[COMP_Z] = Math.fma(m1Z, m2Z, z);
		
		return res;
	}
	
	/**
	 * Performs an fma ({@link Math#fma}) combined multiplication and addition operation on the vector (x, y, z)
	 * with the two given vector (m1X, m1Y, m1Z) and (m2X, m2Y, m2Z).
	 * The result is saved in the extraction parameter object.
	 * In this version the vector is used as the addend.
	 * 
	 * <p>
	 * Operation:
	 * (x, y, z) + (mX1, mY1, mZ1) * (mX2, mY2, mZ2)
	 * 
	 * @param <T> The type of the extraction parameter object.
	 * 
	 * @param x The value of the x component of the addend.
	 * @param y The value of the y component of the addend.
	 * @param z The value of the z component of the addend.
	 * @param mX1 The value of the x component of the first multiplicant.
	 * @param mY1 The value of the y component of the first multiplicant.
	 * @param mZ1 The value of the z component of the first multiplicant.
	 * @param mX2 The value of the x component of the second multiplicant.
	 * @param mY2 The value of the y component of the second multiplicant.
	 * @param mZ2 The value of the z component of the second multiplicant.
	 * @param res The extraction parameter object.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Vec3dC> T mulAdd(double x, double y, double z, double mX1, double mY1, double mZ1, double mX2, double mY2, double mZ2, @ExtractParam T res)
	{
		res.set(Math.fma(mX1, mX2, x), Math.fma(mY1, mY2, y), Math.fma(mZ1, mZ2, z));
		return res;
	}
	
	/**
	 * Performs an fma ({@link Math#fma}) combined multiplication and addition operation on the vector (x, y, z)
	 * with the two given vector (m1X, m1Y, m1Z) and (m2X, m2Y, m2Z).
	 * The result is relayed to the functional interface implementation.
	 * In this version the vector is used as the addend.
	 * 
	 * <p>
	 * This variant is useful for example for creating readonly instances or to use factories.
	 * 
	 * <p>
	 * Operation:
	 * (x, y, z) + (mX1, mY1, mZ1) * (mX2, mY2, mZ2)
	 * 
	 * @param <T> The type of the result object.
	 * 
	 * @param x The value of the x component of the addend.
	 * @param y The value of the y component of the addend.
	 * @param z The value of the z component of the addend.
	 * @param mX1 The value of the x component of the first multiplicant.
	 * @param mY1 The value of the y component of the first multiplicant.
	 * @param mZ1 The value of the z component of the first multiplicant.
	 * @param mX2 The value of the x component of the second multiplicant.
	 * @param mY2 The value of the y component of the second multiplicant.
	 * @param mZ2 The value of the z component of the second multiplicant.
	 * @param func A functional interface implementation to take the result.
	 * 
	 * @return The object returned from the functional interface.
	 */
	public static <T> T mulAdd(double x, double y, double z, double mX1, double mY1, double mZ1, double mX2, double mY2, double mZ2, @ExtractParam DoubleFunction3<T> func)
	{
		return func.apply(Math.fma(mX1, mX2, x), Math.fma(mY1, mY2, y), Math.fma(mZ1, mZ2, z));
	}
	
	/**
	 * Returns the reciprocal length of the vector (x, y, z).
	 * It doesn't account for zero-length vectors and will in such case throw an {@link ArithmeticException}
	 * as this would result in a division by zero.
	 * 
	 * <p>
	 * Operation:
	 * 1 / |v|
	 * 
	 * @param x The value of the x component of the vector.
	 * @param y The value of the y component of the vector.
	 * @param z The value of the z component of the vector.
	 * 
	 * @return The reciprocal length of the vector.
	 * 
	 * @throws
	 * ArithmeticException Thrown when it is a zero-length vector.
	 */
	public static double reciprocalLength(double x, double y, double z)
	{
		return 1.0 / Math.sqrt(Math.fma(x, x, Math.fma(y, y, z * z)));
	}
	
	/**
	 * Returns the reciprocal length of the vector (x, y, z).
	 * If the vector is a zero-length vector the result will be zero.
	 * It determines a zero-length by checking if all components are exactly zero.
	 * Due to doubleing-point-errors it might still throw an {@link ArithmeticException} when
	 * the length is too close to zero.
	 * 
	 * <p>
	 * Operation:
	 * 1 / |v|
	 * 
	 * @param x The value of the x component of the vector.
	 * @param y The value of the y component of the vector.
	 * @param z The value of the z component of the vector.
	 * 
	 * @return The reciprocal length of the vector or zero if it is a zero-length vector.
	 * 
	 * @throws
	 * ArithmeticException Might be thrown when the length is to close to zero.
	 */
	public static double reciprocalLengthSafe(double x, double y, double z)
	{
		if(x + y + z == 0.0) return 0.0;
		
		return 1.0 / Math.sqrt(Math.fma(x, x, Math.fma(y, y, z * z)));
	}
	
	/**
	 * Returns the reciprocal length of the vector (x, y, z).
	 * If the vector is a zero-length vector the result will be zero.
	 * It determines a zero-length by checking if all components are within the margin defined by
	 * zero plus-minus the given tolerance inclusive (-tolerance <= value <= tolerance).
	 * 
	 * <p>
	 * Operation:
	 * 1 / |v|
	 * 
	 * @param x The value of the x component of the vector.
	 * @param y The value of the y component of the vector.
	 * @param z The value of the z component of the vector.
	 * @param tolerance The tolerance for defining the margin around zero.
	 * 
	 * @return The reciprocal length of the vector or zero if it is a zero-length vector.
	 */
	public static double reciprocalLengthSafeWithMargin(double x, double y, double z, double tolerance)
	{
		if(Math.abs(x) <= tolerance && Math.abs(y) <= tolerance && Math.abs(z) <= tolerance) return 0.0;
		
		return 1.0 / Math.sqrt(Math.fma(x, x, Math.fma(y, y, z * z)));
	}
	
	/**
	 * Returns the length of the vector (x, y, z).
	 * It doesn't account for zero-length vectors.
	 * 
	 * <p>
	 * Operation:
	 * |v|
	 * 
	 * @param x The value of the x component of the vector.
	 * @param y The value of the y component of the vector.
	 * @param z The value of the z component of the vector.
	 * 
	 * @return The length of the vector.
	 */
	public static double length(double x, double y, double z)
	{
		return Math.sqrt(Math.fma(x, x, Math.fma(y, y, z * z)));
	}
	
	/**
	 * Returns the length of the vector (x, y, z).
	 * If the vector is a zero-length vector the result will be zero.
	 * It determines a zero-length by checking if all components are exactly zero.
	 * 
	 * <p>
	 * Operation:
	 * |v|
	 * 
	 * @param x The value of the x component of the vector.
	 * @param y The value of the y component of the vector.
	 * @param z The value of the z component of the vector.
	 * 
	 * @return The length of the vector or zero if it is a zero-length vector.
	 */
	public static double lengthSafe(double x, double y, double z)
	{
		if(x + y + z == 0.0) return 0.0;
		
		return Math.sqrt(Math.fma(x, x, Math.fma(y, y, z * z)));
	}
	
	/**
	 * Returns the length of the vector (x, y, z).
	 * If the vector is a zero-length vector the result will be zero.
	 * It determines a zero-length by checking if all components are within the margin defined by
	 * zero plus-minus the given tolerance inclusive (-tolerance <= value <= tolerance).
	 * 
	 * <p>
	 * Operation:
	 * |v|
	 * 
	 * @param x The value of the x component of the vector.
	 * @param y The value of the y component of the vector.
	 * @param z The value of the z component of the vector.
	 * @param tolerance The tolerance for defining the margin around zero.
	 * 
	 * @return The length of the vector or zero if it is a zero-length vector.
	 */
	public static double lengthSafeWithMargin(double x, double y, double z , double tolerance)
	{
		if(Math.abs(x) <= tolerance && Math.abs(y) <= tolerance && Math.abs(z) <= tolerance) return 0.0;
		
		return Math.sqrt(Math.fma(x, x, Math.fma(y, y, z * z)));
	}
	
	/**
	 * Returns the squared length of the vector (x, y, z).
	 * It doesn't account for zero-length vectors.
	 * 
	 * <p>
	 * Operation:
	 * |v|²
	 * 
	 * @param x The value of the x component of the vector.
	 * @param y The value of the y component of the vector.
	 * @param z The value of the z component of the vector.
	 * 
	 * @return The squared length of the vector.
	 */
	public static double squaredLength(double x, double y, double z)
	{
		return Math.fma(x, x, Math.fma(y, y, z * z));
	}
	
	/**
	 * Returns the squared length of the vector (x, y, z).
	 * If the vector is a zero-length vector the result will be zero.
	 * It determines a zero-length by checking if all components are exactly zero.
	 * 
	 * <p>
	 * Operation:
	 * |v|²
	 * 
	 * @param x The value of the x component of the vector.
	 * @param y The value of the y component of the vector.
	 * @param z The value of the z component of the vector.
	 * 
	 * @return The squared length of the vector or zero if it is a zero-length vector.
	 */
	public static double squaredLengthSafe(double x, double y, double z)
	{
		if(x + y + z == 0.0) return 0.0;
		
		return Math.fma(x, x, Math.fma(y, y, z * z));
	}
	
	/**
	 * Returns the squared length of the vector (x, y, z).
	 * If the vector is a zero-length vector the result will be zero.
	 * It determines a zero-length by checking if all components are within the margin defined by
	 * zero plus-minus the given tolerance inclusive (-tolerance <= value <= tolerance).
	 * 
	 * <p>
	 * Operation:
	 * |v|²
	 * 
	 * @param x The value of the x component of the vector.
	 * @param y The value of the y component of the vector.
	 * @param z The value of the z component of the vector.
	 * @param tolerance The tolerance for defining the margin around zero.
	 * 
	 * @return The squared length of the vector or zero if it is a zero-length vector.
	 */
	public static double squaredLengthSafeWithMargin(double x, double y, double z, double tolerance)
	{
		if(Math.abs(x) <= tolerance && Math.abs(y) <= tolerance && Math.abs(z) <= tolerance) return 0.0;
		
		return Math.fma(x, x, Math.fma(y, y, z * z));
	}
	
	/**
	 * Determines the smallest value of the components of the vector (x, y, z) and returns the value and the index of the component.
	 * The index returned is limited to the range of 0 to 2.
	 * If two or more components have the same value the first index will be returned.
	 * The result is saved in the extraction parameter object.
	 * 
	 * @param <T> The type of the extraction parameter object.
	 * 
	 * @param x The value of the x component of the vector.
	 * @param y The value of the y component of the vector.
	 * @param z The value of the z component of the vector.
	 * @param res The extraction parameter object.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2oC<Double,Integer>> T min(double x, double y, double z, @ExtractParam T res)
	{
		double value = x;
		int index = COMP_X;
		
		if(y < value)
		{
			value = y;
			index = COMP_Y;
		}
		
		if(z < value)
		{
			value = z;
			index = COMP_Z;
		}
		
		res.set(value, index);
		
		return res;
	}
	
	/**
	 * Determines the smallest value of the components of the vector (x, y, z) and returns the value and the index of the component.
	 * The index returned is limited to the range of 0 to 2.
	 * If two or more components have the same value the first index will be returned.
	 * The result is relayed to the functional interface implementation.
	 * 
	 * <p>
	 * This variant is useful for example for creating readonly instances or to use factories.
	 * 
	 * @param <T> The type of the result object.
	 * 
	 * @param x The value of the x component of the vector.
	 * @param y The value of the y component of the vector.
	 * @param z The value of the z component of the vector.
	 * @param func A functional interface implementation to take the result.
	 * 
	 * @return The object returned from the functional interface.
	 */
	public static <T> T min(double x, double y, double z, @ExtractParam GenericFunction2<Double,Integer,T> func)
	{
		double value = x;
		int index = COMP_X;
		
		if(y < value)
		{
			value = y;
			index = COMP_Y;
		}
		
		if(z < value)
		{
			value = z;
			index = COMP_Z;
		}
		
		return func.apply(value, index);
	}
	
	/**
	 * Determines the smallest value of the components of the vector (x, y, z) and returns it.
	 * 
	 * @param x The value of the x component of the vector.
	 * @param y The value of the y component of the vector.
	 * @param z The value of the z component of the vector.
	 * 
	 * @return The smallest value of the components.
	 */
	public static double minValue(double x, double y, double z)
	{
		return Math.min(x, Math.min(y, z));
	}
	
	/**
	 * Determines the smallest value of the components of the vector (x, y, z) and returns the index of the component.
	 * The index returned is limited to the range of 0 to 2.
	 * If two or more components have the same value the first index will be returned.
	 * 
	 * @param x The value of the x component of the vector.
	 * @param y The value of the y component of the vector.
	 * @param z The value of the z component of the vector.
	 * 
	 * @return The index of the smallest component.
	 */
	public static int minComponent(double x, double y, double z)
	{
		double value = x;
		int index = COMP_X;
		
		if(y < value)
		{
			value = y;
			index = COMP_Y;
		}
		
		if(z < value)
		{
			value = z;
			index = COMP_Z;
		}
		
		return index;
	}

	/**
	 * Determines the greatest value of the components of the vector (x, y, z) and returns the value and the index of the component.
	 * The index returned is limited to the range of 0 to 2.
	 * If two or more components have the same value the first index will be returned.
	 * The result is saved in the extraction parameter object.
	 * 
	 * @param <T> The type of the extraction parameter object.
	 * 
	 * @param x The value of the x component of the vector.
	 * @param y The value of the y component of the vector.
	 * @param z The value of the z component of the vector.
	 * @param res The extraction parameter object.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2oC<Double,Integer>> T max(double x, double y, double z, @ExtractParam T res)
	{
		double value = x;
		int index = COMP_X;
		
		if(y > value)
		{
			value = y;
			index = COMP_Y;
		}
		
		if(z > value)
		{
			value = z;
			index = COMP_Z;
		}
		
		res.set(value, index);
		
		return res;
	}
	
	/**
	 * Determines the greatest value of the components of the vector (x, y, z) and returns the value and the index of the component.
	 * The index returned is limited to the range of 0 to 2.
	 * If two or more components have the same value the first index will be returned.
	 * The result is relayed to the functional interface implementation.
	 * 
	 * <p>
	 * This variant is useful for example for creating readonly instances or to use factories.
	 * 
	 * @param <T> The type of the result object.
	 * 
	 * @param x The value of the x component of the vector.
	 * @param y The value of the y component of the vector.
	 * @param z The value of the z component of the vector.
	 * @param func A functional interface implementation to take the result.
	 * 
	 * @return The object returned from the functional interface.
	 */
	public static <T> T max(double x, double y, double z, @ExtractParam GenericFunction2<Double,Integer,T> func)
	{
		double value = x;
		int index = COMP_X;
		
		if(y > value)
		{
			value = y;
			index = COMP_Y;
		}
		
		if(z > value)
		{
			value = z;
			index = COMP_Z;
		}
		
		return func.apply(value, index);
	}
	
	/**
	 * Determines the greatest value of the components of the vector (x, y, z) and returns it.
	 * 
	 * @param x The value of the x component of the vector.
	 * @param y The value of the y component of the vector.
	 * @param z The value of the z component of the vector.
	 * 
	 * @return The greatest value of the components.
	 */
	public static double maxValue(double x, double y, double z)
	{
		return Math.max(x, Math.max(y, z));
	}
	
	/**
	 * Determines the greatest value of the components of the vector (x, y, z) and returns the index of the component.
	 * The index returned is limited to the range of 0 to 2.
	 * If two or more components have the same value the first index will be returned.
	 * 
	 * @param x The value of the x component of the vector.
	 * @param y The value of the y component of the vector.
	 * @param z The value of the z component of the vector.
	 * 
	 * @return The index of the greatest component.
	 */
	public static int maxComponent(double x, double y, double z)
	{
		double value = x;
		int index = COMP_X;
		
		if(y > value)
		{
			value = y;
			index = COMP_Y;
		}
		
		if(z > value)
		{
			value = z;
			index = COMP_Z;
		}
		
		return index;
	}
	
	/**
	 * Normalizes the vector (x, y, z).
	 * Normalization is done by dividing the vector by its length.
	 * This doesn't account for zero-length vectors and will in such case throw an {@link ArithmeticException}
	 * as this would result in a division by zero.
	 * The result is saved in the given result array.
	 * 
	 * <p>
	 * Operation:
	 * (x, y, z) / |(x, y, z)|
	 * 
	 * @param x The value of the x component of the vector.
	 * @param y The value of the y component of the vector.
	 * @param z The value of the z component of the vector.
	 * @param res The result array.
	 * 
	 * @return The result array with the result.
	 * 
	 * @throws ArithmeticException Thrown when it is a zero-length vector.
	 */
	public static double[] normal(double x, double y, double z, @ExtractParam double[] res)
	{
		double recLength = 1.0 / Math.sqrt(Math.fma(x, x, Math.fma(y, y, z * z)));
		
		res[COMP_X] = x * recLength;
		res[COMP_Y] = y * recLength;
		res[COMP_Z] = z * recLength;
		
		return res;
	}
	
	/**
	 * Normalizes the vector (x, y, z).
	 * Normalization is done by dividing the vector by its length.
	 * This doesn't account for zero-length vectors and will in such case throw an {@link ArithmeticException}
	 * as this would result in a division by zero.
	 * The result is saved in the extraction parameter object.
	 * 
	 * <p>
	 * Operation:
	 * (x, y, z) / |(x, y, z)|
	 * 
	 * @param <T> The type of the extraction parameter object.
	 * 
	 * @param x The value of the x component of the vector.
	 * @param y The value of the y component of the vector.
	 * @param z The value of the z component of the vector.
	 * @param res The extraction parameter object.
	 * 
	 * @return The extraction parameter object with the result.
	 * 
	 * @throws ArithmeticException Thrown when it is a zero-length vector.
	 */
	public static <T extends Vec3dC> T normal(double x, double y, double z, @ExtractParam T res)
	{
		double recLength = 1.0 / Math.sqrt(Math.fma(x, x, Math.fma(y, y, z * z)));
		
		res.set(x * recLength, y * recLength, z * recLength);
		
		return res;
	}
	
	/**
	 * Normalizes the vector (x, y, z).
	 * Normalization is done by dividing the vector by its length.
	 * This doesn't account for zero-length vectors and will in such case throw an {@link ArithmeticException}
	 * as this would result in a division by zero.
	 * The result is relayed to the functional interface implementation.
	 * 
	 * <p>
	 * This variant is useful for example for creating readonly instances or to use factories.
	 * 
	 * <p>
	 * Operation:
	 * (x, y, z) / |(x, y, z)|
	 * 
	 * @param <T> The type of the result object.
	 * 
	 * @param x The value of the x component of the vector.
	 * @param y The value of the y component of the vector.
	 * @param z The value of the z component of the vector.
	 * @param func A functional interface implementation to take the result.
	 * 
	 * @return The object returned from the functional interface.
	 * 
	 * @throws ArithmeticException Thrown when it is a zero-length vector.
	 */
	public static <T> T normal(double x, double y, double z, @ExtractParam DoubleFunction3<T> func)
	{
		double recLength = 1.0 / Math.sqrt(Math.fma(x, x, Math.fma(y, y, z * z)));
		
		return func.apply(x * recLength, y * recLength, z * recLength);
	}
	
	/**
	 * Normalizes the vector (x, y, z).
	 * Normalization is done by dividing the vector by its length.
	 * If the vector is a zero-length vector the result will be a zero vector.
	 * It determines a zero-length by checking if all components are exactly zero.
	 * Due to doubleing-point-errors it might still throw an {@link ArithmeticException} when
	 * the length is too close to zero.
	 * The result is saved in the given result array.
	 * 
	 * <p>
	 * Operation:
	 * (x, y, z) / |(x, y, z)|
	 * 
	 * @param x The value of the x component of the vector.
	 * @param y The value of the y component of the vector.
	 * @param z The value of the z component of the vector.
	 * @param res The result array.
	 * 
	 * @return The result array with the result.
	 * 
	 * @throws ArithmeticException Might be thrown when the length is to close to zero.
	 */
	public static double[] normalSafe(double x, double y, double z, @ExtractParam double[] res)
	{
		if(x + y + z == 0.0)
		{
			res[COMP_X] = 0.0;
			res[COMP_Y] = 0.0;
			res[COMP_Z] = 0.0;
			
			return res;
		}
		
		double recLength = 1.0 / Math.sqrt(Math.fma(x, x, Math.fma(y, y, z * z)));

		res[COMP_X] = x * recLength;
		res[COMP_Y] = y * recLength;
		res[COMP_Z] = z * recLength;
		
		return res;
	}
	
	/**
	 * Normalizes the vector (x, y, z).
	 * Normalization is done by dividing the vector by its length.
	 * If the vector is a zero-length vector the result will be a zero vector.
	 * It determines a zero-length by checking if all components are exactly zero.
	 * Due to doubleing-point-errors it might still throw an {@link ArithmeticException} when
	 * the length is too close to zero.
	 * The result is saved in the extraction parameter object.
	 * 
	 * <p>
	 * Operation:
	 * (x, y, z) / |(x, y, z)|
	 * 
	 * @param <T> The type of the extraction parameter object.
	 * 
	 * @param x The value of the x component of the vector.
	 * @param y The value of the y component of the vector.
	 * @param z The value of the z component of the vector.
	 * @param res The extraction parameter object.
	 * 
	 * @return The extraction parameter object with the result.
	 * 
	 * @throws ArithmeticException Might be thrown when the length is to close to zero.
	 */
	public static <T extends Vec3dC> T normalSafe(double x, double y, double z, @ExtractParam T res)
	{
		if(x + y + z == 0.0)
		{
			res.set(0.0);
			
			return res;
		}
		
		double recLength = 1.0 / Math.sqrt(Math.fma(x, x, Math.fma(y, y, z * z)));
		
		res.set(x * recLength, y * recLength, z * recLength);
		
		return res;
	}
	
	/**
	 * Normalizes the vector (x, y, z).
	 * Normalization is done by dividing the vector by its length.
	 * If the vector is a zero-length vector the result will be a zero vector.
	 * It determines a zero-length by checking if all components are exactly zero.
	 * Due to doubleing-point-errors it might still throw an {@link ArithmeticException} when
	 * the length is too close to zero.
	 * The result is relayed to the functional interface implementation.
	 * 
	 * <p>
	 * This variant is useful for example for creating readonly instances or to use factories.
	 * 
	 * <p>
	 * Operation:
	 * (x, y, z) / |(x, y, z)|
	 * 
	 * @param <T> The type of the result object.
	 * 
	 * @param x The value of the x component of the vector.
	 * @param y The value of the y component of the vector.
	 * @param z The value of the z component of the vector.
	 * @param func A functional interface implementation to take the result.
	 * 
	 * @return The object returned from the functional interface.
	 * 
	 * @throws ArithmeticException Might be thrown when the length is to close to zero.
	 */
	public static <T> T normalSafe(double x, double y, double z, @ExtractParam DoubleFunction3<T> func)
	{
		if(x + y + z == 0.0) return func.apply(0.0, 0.0, 0.0);
		
		double recLength = 1.0 / Math.sqrt(Math.fma(x, x, Math.fma(y, y, z * z)));

		return func.apply(x * recLength, y * recLength, z * recLength);
	}
	
	/**
	 * Normalizes the vector (x, y, z).
	 * Normalization is done by dividing the vector by its length.
	 * If the vector is a zero-length vector the result will be a zero vector.
	 * It determines a zero-length by checking if all components are within the margin defined by
	 * zero plus-minus the given tolerance inclusive (-tolerance <= value <= tolerance).
	 * The result is saved in the given result array.
	 * 
	 * <p>
	 * Operation:
	 * (x, y, z) / |(x, y, z)|
	 * 
	 * @param x The value of the x component of the vector.
	 * @param y The value of the y component of the vector.
	 * @param z The value of the z component of the vector.
	 * @param tolerance The tolerance for defining the margin around zero.
	 * @param res The result array.
	 * 
	 * @return The result array with the result.
	 */
	public static double[] normalSafeWithMargin(double x, double y, double z, double tolerance, @ExtractParam double[] res)
	{
		if(Math.abs(x) <= tolerance && Math.abs(y) <= tolerance && Math.abs(z) <= tolerance)
		{
			res[COMP_X] = 0.0;
			res[COMP_Y] = 0.0;
			res[COMP_Z] = 0.0;
			
			return res;
		}
		
		double recLength = 1.0 / Math.sqrt(Math.fma(x, x, Math.fma(y, y, z * z)));
		
		res[COMP_X] = x * recLength;
		res[COMP_Y] = y * recLength;
		res[COMP_Z] = z * recLength;
		
		return res;
	}
	
	/**
	 * Normalizes the vector (x, y, z).
	 * Normalization is done by dividing the vector by its length.
	 * If the vector is a zero-length vector the result will be a zero vector.
	 * It determines a zero-length by checking if all components are within the margin defined by
	 * zero plus-minus the given tolerance inclusive (-tolerance <= value <= tolerance).
	 * The result is saved in the extraction parameter object.
	 * 
	 * <p>
	 * Operation:
	 * (x, y, z) / |(x, y, z)|
	 * 
	 * @param <T> The type of the extraction parameter object.
	 * 
	 * @param x The value of the x component of the vector.
	 * @param y The value of the y component of the vector.
	 * @param z The value of the z component of the vector.
	 * @param tolerance The tolerance for defining the margin around zero.
	 * @param res The extraction parameter object.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Vec3dC> T normalSafeWithMargin(double x, double y, double z, double tolerance, @ExtractParam T res)
	{
		if(Math.abs(x) <= tolerance && Math.abs(y) <= tolerance && Math.abs(z) <= tolerance)
		{
			res.set(0.0);
			
			return res;
		}
		
		double recLength = 1.0 / Math.sqrt(Math.fma(x, x, Math.fma(y, y, z * z)));
		
		res.set(x * recLength, y * recLength, z * recLength);
		
		return res;
	}
	
	/**
	 * Normalizes the vector (x, y, z)
	 * Normalization is done by dividing the vector by its length.
	 * If the vector is a zero-length vector the result will be a zero vector.
	 * It determines a zero-length by checking if all components are within the margin defined by
	 * zero plus-minus the given tolerance inclusive (-tolerance <= value <= tolerance).
	 * The result is relayed to the functional interface implementation.
	 * 
	 * <p>
	 * This variant is useful for example for creating readonly instances or to use factories.
	 * 
	 * <p>
	 * Operation:
	 * (x, y, z) / |(x, y, z)|
	 * 
	 * @param <T> The type of the result object.
	 * 
	 * @param x The value of the x component of the vector.
	 * @param y The value of the y component of the vector.
	 * @param z The value of the z component of the vector.
	 * @param tolerance The tolerance for defining the margin around zero.
	 * @param func A functional interface implementation to take the result.
	 * 
	 * @return The object returned from the functional interface.
	 */
	public static <T> T normalSafeWithMargin(double x, double y, double z, double tolerance, @ExtractParam DoubleFunction3<T> func)
	{
		if(Math.abs(x) <= tolerance && Math.abs(y) <= tolerance && Math.abs(z) <= tolerance) return func.apply(0.0, 0.0, 0.0);
		
		double recLength = 1.0 / Math.sqrt(Math.fma(x, x, Math.fma(y, y, z * z)));

		return func.apply(x * recLength, y * recLength, z * recLength);
	}
	
	/**
	 * Inverts the vector (x, y, z).
	 * The result is saved in the given result array.
	 * 
	 * <p>
	 * Operation:
	 * -(x, y, z)
	 * 
	 * @param x The value of the x component of the vector.
	 * @param y The value of the y component of the vector.
	 * @param z The value of the z component of the vector.
	 * @param res The result array.
	 * 
	 * @return The result array with the result.
	 */
	public static double[] invert(double x, double y, double z, @ExtractParam double[] res)
	{
		res[COMP_X] = -x;
		res[COMP_Y] = -y;
		res[COMP_Z] = -z;
		
		return res;
	}
	
	/**
	 * Inverts the vector (x, y, z).
	 * The result is saved in the extraction parameter object.
	 * 
	 * <p>
	 * Operation:
	 * -(x, y, z)
	 * 
	 * @param <T> The type of the extraction parameter object.
	 * 
	 * @param x The value of the x component of the vector.
	 * @param y The value of the y component of the vector.
	 * @param z The value of the z component of the vector.
	 * @param res The extraction parameter object.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Vec3dC> T invert(double x, double y, double z, @ExtractParam T res)
	{
		res.set(-x, -y, -z);
		
		return res;
	}
	
	/**
	 * Inverts the vector (x, y, z).
	 * The result is relayed to the functional interface implementation.
	 * 
	 * <p>
	 * This variant is useful for example for creating readonly instances or to use factories.
	 * 
	 * <p>
	 * Operation:
	 * -(x, y, z)
	 * 
	 * @param <T> The type of the result object.
	 * 
	 * @param x The value of the x component of the vector.
	 * @param y The value of the y component of the vector.
	 * @param z The value of the z component of the vector.
	 * @param func A functional interface implementation to take the result.
	 * 
	 * @return The object returned from the functional interface.
	 */
	public static <T> T invert(double x, double y, double z, @ExtractParam DoubleFunction3<T> func)
	{
		return func.apply(-x, -y, -z);
	}
	
	/**
	 * Inverses the vector (x, y, z) based on the vector (x2, y2, z2).
	 * The result is saved in the given result array.
	 * 
	 * <p>
	 * Operation:
	 * (x2, y2, z2) - (x, y, z)
	 * 
	 * @param x The value of the x component of the vector.
	 * @param y The value of the y component of the vector.
	 * @param z The value of the z component of the vector.
	 * @param x2 The value the inversion of the x component is based on.
	 * @param y2 The value the inversion of the y component is based on.
	 * @param z2 The value the inversion of the z component is based on.
	 * @param res The result array.
	 * 
	 * @return The result array with the result.
	 */
	public static double[] inverse(double x, double y, double z, double x2, double y2, double z2, @ExtractParam double[] res)
	{
		res[COMP_X] = x2 - x;
		res[COMP_Y] = y2 - y;
		res[COMP_Z] = z2 - z;
		
		return res;
	}
	
	/**
	 * Inverses the vector (x, y, z) based on the vector (x2, y2, z2).
	 * The result is saved in the extraction parameter object.
	 * 
	 * <p>
	 * Operation:
	 * (x2, y2, z2) - (x, y, z)
	 * 
	 * @param <T> The type of the extraction parameter object.
	 * 
	 * @param x The value of the x component of the vector.
	 * @param y The value of the y component of the vector.
	 * @param z The value of the z component of the vector.
	 * @param x2 The value the inversion of the x component is based on.
	 * @param y2 The value the inversion of the y component is based on.
	 * @param z2 The value the inversion of the z component is based on.
	 * @param res The extraction parameter object.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Vec3dC> T inverse(double x, double y, double z, double x2, double y2, double z2, @ExtractParam T res)
	{
		res.set(x2 - x, y2 - y, z2 - z);
		
		return res;
	}
	
	/**
	 * Inverses the vector (x, y, z) based on the vector (x2, y2, z2).
	 * The result is relayed to the functional interface implementation.
	 * 
	 * <p>
	 * Operation:
	 * (x2, y2, z2) - (x, y, z)
	 * 
	 * @param <T> The type of the result object.
	 * 
	 * @param x The value of the x component of the vector.
	 * @param y The value of the y component of the vector.
	 * @param z The value of the z component of the vector.
	 * @param x2 The value the inversion of the x component is based on.
	 * @param y2 The value the inversion of the y component is based on.
	 * @param z2 The value the inversion of the z component is based on.
	 * @param func A functional interface implementation to take the result.
	 * 
	 * @return The object returned from the functional interface.
	 */
	public static <T extends Vec3dC> T inverse(double x, double y, double z, double x2, double y2, double z2, @ExtractParam DoubleFunction3<T> func)
	{
		return func.apply(x2 - x, y2 - y, z2 - z);
	}
	
	/**
	 * Calculates the half of the vector (x, y, z).
	 * The result is saved in the given result array.
	 * 
	 * <p>
	 * Operation:
	 * (x, y, z) / 2
	 * 
	 * @param x The value of the x component of the vector.
	 * @param y The value of the y component of the vector.
	 * @param z The value of the z component of the vector.
	 * @param res The result array.
	 * 
	 * @return The result array with the result.
	 */
	public static double[] half(double x, double y, double z, @ExtractParam double[] res)
	{
		res[COMP_X] = x * 0.5;
		res[COMP_Y] = y * 0.5;
		res[COMP_Z] = z * 0.5;
		
		return res;
	}
	
	/**
	 * Calculates the half of the vector (x, y, z).
	 * The result is saved in the extraction parameter object.
	 * 
	 * <p>
	 * Operation:
	 * (x, y, z) / 2
	 * 
	 * @param <T> The type of the query parameter.
	 * 
	 * @param x The value of the x component of the vector.
	 * @param y The value of the y component of the vector.
	 * @param z The value of the z component of the vector.
	 * @param res The query parameter.
	 * 
	 * @return The query parameter with the result.
	 */
	public static <T extends Vec3dC> T half(double x, double y, double z, @ExtractParam T res)
	{
		res.set(x * 0.5, y * 0.5, z * 0.5);
		
		return res;
	}
	
	/**
	 * Calculates the half of the vector (x, y, z).
	 * The result is relayed to the functional interface implementation.
	 * 
	 * <p>
	 * Operation:
	 * (x, y, z) / 2
	 * 
	 * @param <T> The type of the result object.
	 * 
	 * @param x The value of the x component of the vector.
	 * @param y The value of the y component of the vector.
	 * @param z The value of the z component of the vector.
	 * @param func A functional interface implementation to take the result.
	 * 
	 * @return The object returned from the functional interface.
	 */
	public static <T extends Vec3dC> T half(double x, double y, double z, @ExtractParam DoubleFunction3<T> func)
	{
		return func.apply(x * 0.5, y * 0.5, z * 0.5);
	}
	
	
	/**
	 * Calculates the orthogonal projection of the vector(x, y, z) onto the target vector (vX, vY, vZ).
	 * The vector to project on has to be normalized.
	 * The result is saved in the given result array.
	 * 
	 * @param x The value of the x component of the vector.
	 * @param y The value of the y component of the vector.
	 * @param z The value of the z component of the vector.
	 * @param vX The value of the x component of the projection target vector.
	 * @param vY The value of the y component of the projection target vector.
	 * @param vZ The value of the z component of the projection target vector.
	 * @param res The result array.
	 * 
	 * @return The result array with the result.
	 */
	public static double[] project(double x, double y, double z, double vX, double vY, double vZ, @ExtractParam double[] res)
	{
		double dot = Math.fma(x, vX, Math.fma(y, vY, z * vZ));
		
		res[COMP_X] = vX * dot;
		res[COMP_Y] = vY * dot;
		res[COMP_Z] = vZ * dot;
		
		return res;
	}
	
	/**
	 * Calculates the orthogonal projection of the vector(x, y, z) onto the target vector (vX, vY, vZ).
	 * The vector to project on has to be normalized.
	 * The result is saved in the extraction parameter object.
	 * 
	 * @param <T> The type of the extraction parameter object.
	 * 
	 * @param x The value of the x component of the vector.
	 * @param y The value of the y component of the vector.
	 * @param z The value of the z component of the vector.
	 * @param vX The value of the x component of the projection target vector.
	 * @param vY The value of the y component of the projection target vector.
	 * @param vZ The value of the z component of the projection target vector.
	 * @param res The extraction parameter object.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Vec3dC> T project(double x, double y, double z, double vX, double vY, double vZ, @ExtractParam T res)
	{
		double dot = Math.fma(x, vX, Math.fma(y, vY, z * vZ));
		
		res.set(vX * dot, vY * dot, vZ * dot);
		
		return res;
	}
	
	/**
	 * Calculates the orthogonal projection of the vector(x, y, z) onto the target vector (vX, vY, vZ).
	 * The vector to project on has to be normalized.
	 * The result is relayed to the functional interface implementation.
	 * 
	 * @param <T> The type of the result object.
	 * 
	 * @param x The value of the x component of the vector.
	 * @param y The value of the y component of the vector.
	 * @param z The value of the z component of the vector.
	 * @param vX The value of the x component of the projection target vector.
	 * @param vY The value of the y component of the projection target vector.
	 * @param vZ The value of the z component of the projection target vector.
	 * @param func A functional interface implementation to take the result.
	 * 
	 * @return The object returned from the functional interface.
	 */
	public static <T> T project(double x, double y, double z, double vX, double vY, double vZ, @ExtractParam DoubleFunction3<T> func)
	{
		double dot = Math.fma(x, vX, Math.fma(y, vY, z * vZ));

		return func.apply(vX * dot, vY * dot, vZ * dot);
	}
	
	/**
	 * Calculates the reflection of the vector (x, y, z) based on the given surface normal (nX, nY, nZ).
	 * The surface normal has to be normalized.
	 * The result is saved in the given result array.
	 * 
	 * @param x The value of the x component of the vector.
	 * @param y The value of the y component of the vector.
	 * @param z The value of the z component of the vector.
	 * @param nX The value of the x component of the surface normal.
	 * @param nY The value of the y component of the surface normal.
	 * @param nZ The value of the z component of the surface normal.
	 * @param res The result array.
	 * 
	 * @return The result array with the result.
	 */
	public static double[] reflect(double x, double y, double z, double nX, double nY, double nZ, @ExtractParam double[] res)
	{
		double dot = -2 * Math.fma(x, nX, Math.fma(y, nY, z * nZ));
		
		res[COMP_X] = Math.fma(nX, dot, x);
		res[COMP_Y] = Math.fma(nY, dot, y);
		res[COMP_Z] = Math.fma(nZ, dot, z);
		
		return res;
	}
	
	/**
	 * Calculates the reflection of the vector (x, y, z) based on the given surface normal (nX, nY, nZ).
	 * The surface normal has to be normalized.
	 * The result is saved in the extraction parameter object.
	 * 
	 * @param <T> The type of the extraction parameter object.
	 * 
	 * @param x The value of the x component of the vector.
	 * @param y The value of the y component of the vector.
	 * @param z The value of the z component of the vector.
	 * @param nX The value of the x component of the surface normal.
	 * @param nY The value of the y component of the surface normal.
	 * @param nZ The value of the z component of the surface normal.
	 * @param res The extraction parameter object.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Vec3dC> T reflect(double x, double y, double z, double nX, double nY, double nZ, @ExtractParam T res)
	{
		double dot = -2 * Math.fma(x, nX, Math.fma(y, nY, z * nZ));
		
		res.set(Math.fma(nX, dot, x), Math.fma(nY, dot, y), Math.fma(nZ, dot, z));
		
		return res;
	}
	
	/**
	 * Calculates the reflection of the vector (x, y, z) based on the given surface normal (nX, nY, nZ).
	 * The surface normal has to be normalized.
	 * The result is relayed to the functional interface implementation.
	 * 
	 * @param <T> The type of the result object.
	 * 
	 * @param x The value of the x component of the vector.
	 * @param y The value of the y component of the vector.
	 * @param z The value of the z component of the vector.
	 * @param nX The value of the x component of the surface normal.
	 * @param nY The value of the y component of the surface normal.
	 * @param nZ The value of the z component of the surface normal.
	 * @param func A functional interface implementation to take the result.
	 * 
	 * @return The object returned from the functional interface.
	 */
	public static <T> T reflect(double x, double y, double z, double nX, double nY, double nZ, @ExtractParam DoubleFunction3<T> func)
	{
		double dot = -2 * Math.fma(x, nX, Math.fma(y, nY, z * nZ));
		
		return func.apply(Math.fma(nX, dot, x), Math.fma(nY, dot, y), Math.fma(nZ, dot, z));
	}
	
	/**
	 * Returns the dot product (scalar product) between the first vector (x1, y1, z1) and
	 * the second vector (x2, y2, z2).
	 * 
	 * <p>
	 * Operation:
	 * (x1, y1, z1) . (x2, y2, z2)
	 * 
	 * @param x1 The value of the x component of the first tuple.
	 * @param y1 The value of the y component of the first tuple.
	 * @param z1 The value of the z component of the first tuple.
	 * @param x2 The value of the x component of the second tuple.
	 * @param y2 The value of the y component of the second tuple.
	 * @param z2 The value of the z component of the second tuple.
	 * 
	 * @return The dot product (scalar product).
	 */
	public static double dot(double x1, double y1, double z1, double x2, double y2, double z2)
	{
		return Math.fma(x1, x2, Math.fma(y1, y2, z1 * z2));
	}
	
	/**
	 * Calculates the cross product between the first vector (x1, y1, z1) and the second vector (x2, y2, z2).
	 * The result is saved in the given result array.
	 * 
	 * <p>
	 * Operation:
	 * (x1, y1, z1) X (x2, y2, z2)
	 * 
	 * @param x1 The value of the x component of the first vector.
	 * @param y1 The value of the y component of the first vector.
	 * @param z1 The value of the z component of the first vector.
	 * @param x2 The value of the x component of the second vector.
	 * @param y2 The value of the y component of the second vector.
	 * @param z2 The value of the z component of the second vector.
	 * @param res The result array.
	 * 
	 * @return The result array with the result.
	 */
	public static double[] cross(double x1, double y1, double z1, double x2, double y2, double z2, @ExtractParam double[] res)
	{
		res[COMP_X] = y1 * z2 - z1 * y2;
		res[COMP_Y] = z1 * x2 - x1 * z2;
		res[COMP_Z] = x1 * y2 - y1 * x2;

		return res;
	}
	
	/**
	 * Calculates the cross product between the first vector (x1, y1, z1) and the second vector (x2, y2, z2).
	 * The result is saved in the extraction parameter object.
	 * 
	 * <p>
	 * Operation:
	 * (x1, y1, z1) X (x2, y2, z2)
	 * 
	 * @param <T> The type of the extraction parameter object.
	 * 
	 * @param x1 The value of the x component of the first vector.
	 * @param y1 The value of the y component of the first vector.
	 * @param z1 The value of the z component of the first vector.
	 * @param x2 The value of the x component of the second vector.
	 * @param y2 The value of the y component of the second vector.
	 * @param z2 The value of the z component of the second vector.
	 * @param res The extraction parameter object.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Vec3dC> T cross(double x1, double y1, double z1, double x2, double y2, double z2, @ExtractParam T res)
	{
		res.set(y1 * z2 - z1 * y2, z1 * x2 - x1 * z2, x1 * y2 - y1 * x2);
		
		return res;
	}
	
	/**
	 * Calculates the cross product between the first vector (x1, y1, z1) and the second vector (x2, y2, z2).
	 * The result is relayed to the functional interface implementation.
	 * 
	 * <p>
	 * Operation:
	 * (x1, y1, z1) X (x2, y2, z2)
	 * 
	 * @param <T> The type of the result object.
	 * 
	 * @param x1 The value of the x component of the first vector.
	 * @param y1 The value of the y component of the first vector.
	 * @param z1 The value of the z component of the first vector.
	 * @param x2 The value of the x component of the second vector.
	 * @param y2 The value of the y component of the second vector.
	 * @param z2 The value of the z component of the second vector.
	 * @param func A functional interface implementation to take the result.
	 * 
	 * @return The object returned from the functional interface.
	 */
	public static <T> T cross(double x1, double y1, double z1, double x2, double y2, double z2, @ExtractParam DoubleFunction3<T> func)
	{
		return func.apply(y1 * z2 - z1 * y2, z1 * x2 - x1 * z2, x1 * y2 - y1 * x2);
	}
	
	/**
	 * Performs a fast linear interpolation between the two vectors t1 and t2.
	 * This sacrifices for reduced calculations the precision and the applicability.
	 * The interpolation happens over the interpolator value alpha in the range of 0.0 to 1.0
	 * where a value of 0.0 is exacly t1 and a value of 1.0 is aproximatly t2. As the fast
	 * lerp sacrifices a lot of precision a value of 1.0 will very likely not yield the values of t2
	 * but a biased result.
	 * The result is saved in the result array.
	 * 
	 * <p>
	 * Operation:
	 * t1 + ( t2 - t1 ) * alpha
	 * 
	 * @param t1 The first vector.
	 * @param t2 The second vector.
	 * @param alpha The interpolator in range of 0.0 to 1.0.
	 * @param res The result array.
	 * 
	 * @return The result array with the result.
	 */
	public static double[] fastLerp(Tup3dR t1, Tup3dR t2, double alpha, @ExtractParam double[] res)
	{
		return fastLerp(t1.getX(), t1.getY(), t1.getZ(), t2.getX(), t2.getY(), t2.getZ(), alpha, res);
	}
	
	/**
	 * Performs a fast linear interpolation between the two vectors t1 and (x2, y2, z2).
	 * This sacrifices for reduced calculations the precision and the applicability.
	 * The interpolation happens over the interpolator value alpha in the range of 0.0 to 1.0
	 * where a value of 0.0 is exacly t1 and a value of 1.0 is aproximatly (x2, y2, z2). As the fast
	 * lerp sacrifices a lot of precision a value of 1.0 will very likely not yield the values of (x2, y2, z2)
	 * but a biased result.
	 * The result is saved in the result array.
	 * 
	 * <p>
	 * Operation:
	 * t1 + ( (x2, y2, z2) - t1 ) * alpha
	 * 
	 * @param t1 The first vector.
	 * @param x2 The value of the x component of the second vector.
	 * @param y2 The value of the y component of the second vector.
	 * @param z2 The value of the z component of the second vector.
	 * @param alpha The interpolator in range of 0.0 to 1.0.
	 * @param res The result array.
	 * 
	 * @return The result array with the result.
	 */
	public static double[] fastLerp(Tup3dR t1, double x2, double y2, double z2, double alpha, @ExtractParam double[] res)
	{
		return fastLerp(t1.getX(), t1.getY(), t1.getZ(), x2, y2, z2, alpha, res);
	}
	
	/**
	 * Performs a fast linear interpolation between the two vectors (x1, y1, z1) and t2.
	 * This sacrifices for reduced calculations the precision and the applicability.
	 * The interpolation happens over the interpolator value alpha in the range of 0.0 to 1.0
	 * where a value of 0.0 is exacly (x1, y1, z1) and a value of 1.0 is aproximatly t2. As the fast
	 * lerp sacrifices a lot of precision a value of 1.0 will very likely not yield the values of t2
	 * but a biased result.
	 * The result is saved in the result array.
	 * 
	 * <p>
	 * Operation:
	 * (x1, y1, z1) + ( t2 - (x1, y1, z1) ) * alpha
	 * 
	 * @param x1 The value of the x component of the first vector.
	 * @param y1 The value of the y component of the first vector.
	 * @param z1 The value of the z component of the first vector.
	 * @param t2 The second vector.
	 * @param alpha The interpolator in range of 0.0 to 1.0.
	 * @param res The result array.
	 * 
	 * @return The result array with the result.
	 */
	public static double[] fastLerp(double x1, double y1, double z1, Tup3dR t2, double alpha, @ExtractParam double[] res)
	{
		return fastLerp(x1, y1, z1, t2.getX(), t2.getY(), t2.getZ(), alpha, res);
	}
	
	/**
	 * Performs a fast linear interpolation between the two vectors (x1, y1, z1) and (x2, y2, z2).
	 * This sacrifices for reduced calculations the precision and the applicability.
	 * The interpolation happens over the interpolator value alpha in the range of 0.0 to 1.0
	 * where a value of 0.0 is exacly (x1, y1, z1) and a value of 1.0 is aproximatly (x2, y2, z2). As the fast
	 * lerp sacrifices a lot of precision a value of 1.0 will very likely not yield the values of (x2, y2, z2)
	 * but a biased result.
	 * The result is saved in the result array.
	 * 
	 * <p>
	 * Operation:
	 * (x1, y1, z1) + ( (x2, y2, z2) - (x1, y1, z1) ) * alpha
	 * 
	 * @param x1 The value of the x component of the first vector.
	 * @param y1 The value of the y component of the first vector.
	 * @param z1 The value of the z component of the first vector.
	 * @param x2 The value of the x component of the second vector.
	 * @param y2 The value of the y component of the second vector.
	 * @param z2 The value of the z component of the second vector.
	 * @param alpha The interpolator in range of 0.0 to 1.0.
	 * @param res The result array.
	 * 
	 * @return The result array with the result.
	 */
	public static double[] fastLerp(double x1, double y1, double z1, double x2, double y2, double z2, double alpha, @ExtractParam double[] res)
	{
		res[COMP_X] = Math.fma(alpha, x2 - x1, x1);
		res[COMP_Y] = Math.fma(alpha, y2 - y1, y1);
		res[COMP_Z] = Math.fma(alpha, z2 - z1, z1);
		
		return res;
	}
	
	/**
	 * Performs a fast linear interpolation between the two vectors t1 and t2.
	 * This sacrifices for reduced calculations the precision and the applicability.
	 * The interpolation happens over the interpolator value alpha in the range of 0.0 to 1.0
	 * where a value of 0.0 is exacly t1 and a value of 1.0 is aproximatly t2. As the fast
	 * lerp sacrifices a lot of precision a value of 1.0 will very likely not yield the values of t2
	 * but a biased result.
	 * The result is saved in the extraction parameter object.
	 * 
	 * <p>
	 * Operation:
	 * t1 + ( t2 - t1 ) * alpha
	 * 
	 * @param t1 The first vector.
	 * @param t2 The second vector.
	 * @param alpha The interpolator in range of 0.0 to 1.0.
	 * @param res The extraction parameter object.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Vec3dC> T fastLerp(Tup3dR t1, Tup3dR t2, double alpha, @ExtractParam T res)
	{
		return fastLerp(t1.getX(), t1.getY(), t1.getZ(), t2.getX(), t2.getY(), t2.getZ(), alpha, res);
	}
	
	/**
	 * Performs a fast linear interpolation between the two vectors t1 and (x2, y2, z2).
	 * This sacrifices for reduced calculations the precision and the applicability.
	 * The interpolation happens over the interpolator value alpha in the range of 0.0 to 1.0
	 * where a value of 0.0 is exacly t1 and a value of 1.0 is aproximatly (x2, y2, z2). As the fast
	 * lerp sacrifices a lot of precision a value of 1.0 will very likely not yield the values of (x2, y2, z2)
	 * but a biased result.
	 * The result is saved in the extraction parameter object.
	 * 
	 * <p>
	 * Operation:
	 * t1 + ( (x2, y2, z2) - t1 ) * alpha
	 * 
	 * @param t1 The first vector.
	 * @param x2 The value of the x component of the second vector.
	 * @param y2 The value of the y component of the second vector.
	 * @param z2 The value of the z component of the second vector.
	 * @param alpha The interpolator in range of 0.0 to 1.0.
	 * @param res The extraction parameter object.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Vec3dC> T fastLerp(Tup3dR t1, double x2, double y2, double z2, double alpha, @ExtractParam T res)
	{
		return fastLerp(t1.getX(), t1.getY(), t1.getZ(), x2, y2, z2, alpha, res);
	}
	
	/**
	 * Performs a fast linear interpolation between the two vectors (x1, y1, z1) and t2.
	 * This sacrifices for reduced calculations the precision and the applicability.
	 * The interpolation happens over the interpolator value alpha in the range of 0.0 to 1.0
	 * where a value of 0.0 is exacly (x1, y1, z1) and a value of 1.0 is aproximatly t2. As the fast
	 * lerp sacrifices a lot of precision a value of 1.0 will very likely not yield the values of t2
	 * but a biased result.
	 * The result is saved in the extraction parameter object.
	 * 
	 * <p>
	 * Operation:
	 * (x1, y1, z1) + ( t2 - (x1, y1, z1) ) * alpha
	 * 
	 * @param x1 The value of the x component of the first vector.
	 * @param y1 The value of the y component of the first vector.
	 * @param z1 The value of the z component of the first vector.
	 * @param t2 The second vector.
	 * @param alpha The interpolator in range of 0.0 to 1.0.
	 * @param res The extraction parameter object.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Vec3dC> T fastLerp(double x1, double y1, double z1, Tup3dR t2, double alpha, @ExtractParam T res)
	{
		return fastLerp(x1, y1, z1, t2.getX(), t2.getY(), t2.getZ(), alpha, res);
	}
	
	/**
	 * Performs a fast linear interpolation between the two vectors (x1, y1, z1) and (x2, y2, z2).
	 * This sacrifices for reduced calculations the precision and the applicability.
	 * The interpolation happens over the interpolator value alpha in the range of 0.0 to 1.0
	 * where a value of 0.0 is exacly (x1, y1, z1) and a value of 1.0 is aproximatly (x2, y2, z2). As the fast
	 * lerp sacrifices a lot of precision a value of 1.0 will very likely not yield the values of (x2, y2, z2)
	 * but a biased result.
	 * The result is saved in the extraction parameter object.
	 * 
	 * <p>
	 * Operation:
	 * (x1, y1, z1) + ( (x2, y2, z2) - (x1, y1, z1) ) * alpha
	 * 
	 * @param x1 The value of the x component of the first vector.
	 * @param y1 The value of the y component of the first vector.
	 * @param z1 The value of the z component of the first vector.
	 * @param x2 The value of the x component of the second vector.
	 * @param y2 The value of the y component of the second vector.
	 * @param z2 The value of the z component of the second vector.
	 * @param alpha The interpolator in range of 0.0 to 1.0.
	 * @param res The extraction parameter object.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Vec3dC> T fastLerp(double x1, double y1, double z1, double x2, double y2, double z2, double alpha, @ExtractParam T res)
	{
		res.set(Math.fma(alpha, x2 - x1, x1), Math.fma(alpha, y2 - y1, y1), Math.fma(alpha, z2 - z1, z1));
		
		return res;
	}
	
	/**
	 * Performs a fast linear interpolation between the two vectors t1 and t2.
	 * This sacrifices for reduced calculations the precision and the applicability.
	 * The interpolation happens over the interpolator value alpha in the range of 0.0 to 1.0
	 * where a value of 0.0 is exacly t1 and a value of 1.0 is aproximatly t2. As the fast
	 * lerp sacrifices a lot of precision a value of 1.0 will very likely not yield the values of t2
	 * but a biased result.
	 * The result is relayed to the functional interface implementation.
	 * 
	 * <p>
	 * Operation:
	 * t1 + ( t2 - t1 ) * alpha
	 * 
	 * @param t1 The first vector.
	 * @param t2 The second vector.
	 * @param alpha The interpolator in range of 0.0 to 1.0.
	 * @param func A functional interface implementation to take the result.
	 * 
	 * @return The object returned from the functional interface.
	 */
	public static <T> T fastLerp(Tup3dR t1, Tup3dR t2, double alpha, @ExtractParam DoubleFunction3<T> func)
	{
		return fastLerp(t1.getX(), t1.getY(), t1.getZ(), t2.getX(), t2.getY(), t2.getZ(), alpha, func);
	}
	
	/**
	 * Performs a fast linear interpolation between the two vectors t1 and (x2, y2, z2).
	 * This sacrifices for reduced calculations the precision and the applicability.
	 * The interpolation happens over the interpolator value alpha in the range of 0.0 to 1.0
	 * where a value of 0.0 is exacly t1 and a value of 1.0 is aproximatly (x2, y2, z2). As the fast
	 * lerp sacrifices a lot of precision a value of 1.0 will very likely not yield the values of (x2, y2, z2)
	 * but a biased result.
	 * The result is relayed to the functional interface implementation.
	 * 
	 * <p>
	 * Operation:
	 * t1 + ( (x2, y2, z2) - t1 ) * alpha
	 * 
	 * @param t1 The first vector.
	 * @param x2 The value of the x component of the second vector.
	 * @param y2 The value of the y component of the second vector.
	 * @param z2 The value of the z component of the second vector.
	 * @param alpha The interpolator in range of 0.0 to 1.0.
	 * @param func A functional interface implementation to take the result.
	 * 
	 * @return The object returned from the functional interface.
	 */
	public static <T> T fastLerp(Tup3dR t1, double x2, double y2, double z2, double alpha, @ExtractParam DoubleFunction3<T> func)
	{
		return fastLerp(t1.getX(), t1.getY(), t1.getZ(), x2, y2, z2, alpha, func);
	}
	
	/**
	 * Performs a fast linear interpolation between the two vectors (x1, y1, z1) and t2.
	 * This sacrifices for reduced calculations the precision and the applicability.
	 * The interpolation happens over the interpolator value alpha in the range of 0.0 to 1.0
	 * where a value of 0.0 is exacly (x1, y1, z1) and a value of 1.0 is aproximatly t2. As the fast
	 * lerp sacrifices a lot of precision a value of 1.0 will very likely not yield the values of t2
	 * but a biased result.
	 * The result is relayed to the functional interface implementation.
	 * 
	 * <p>
	 * Operation:
	 * (x1, y1, z1) + ( t2 - (x1, y1, z1) ) * alpha
	 * 
	 * @param x1 The value of the x component of the first vector.
	 * @param y1 The value of the y component of the first vector.
	 * @param z1 The value of the z component of the first vector.
	 * @param t2 The second vector.
	 * @param alpha The interpolator in range of 0.0 to 1.0.
	 * @param func A functional interface implementation to take the result.
	 * 
	 * @return The object returned from the functional interface.
	 */
	public static <T> T fastLerp(double x1, double y1, double z1, Tup3dR t2, double alpha, @ExtractParam DoubleFunction3<T> func)
	{
		return fastLerp(x1, y1, z1, t2.getX(), t2.getY(), t2.getZ(), alpha, func);
	}
	
	/**
	 * Performs a fast linear interpolation between the two vectors (x1, y1, z1) and (x2, y2, z2).
	 * This sacrifices for reduced calculations the precision and the applicability.
	 * The interpolation happens over the interpolator value alpha in the range of 0.0 to 1.0
	 * where a value of 0.0 is exacly (x1, y1, z1) and a value of 1.0 is aproximatly (x2, y2, z2). As the fast
	 * lerp sacrifices a lot of precision a value of 1.0 will very likely not yield the values of (x2, y2, z2)
	 * but a biased result.
	 * The result is relayed to the functional interface implementation.
	 * 
	 * <p>
	 * Operation:
	 * (x1, y1, z1) + ( (x2, y2, z2) - (x1, y1, z1) ) * alpha
	 * 
	 * @param x1 The value of the x component of the first vector.
	 * @param y1 The value of the y component of the first vector.
	 * @param z1 The value of the z component of the first vector.
	 * @param x2 The value of the x component of the second vector.
	 * @param y2 The value of the y component of the second vector.
	 * @param z2 The value of the z component of the second vector.
	 * @param alpha The interpolator in range of 0.0 to 1.0.
	 * @param func A functional interface implementation to take the result.
	 * 
	 * @return The object returned from the functional interface.
	 */
	public static <T> T fastLerp(double x1, double y1, double z1, double x2, double y2, double z2, double alpha, @ExtractParam DoubleFunction3<T> func)
	{
		return func.apply(Math.fma(alpha, x2 - x1, x1), Math.fma(alpha, y2 - y1, y1), Math.fma(alpha, z2 - z1, z1));
	}
	
	/**
	 * Performs a linear interpolation between the two vectors t1 and t2.
	 * The interpolation happens over the interpolator value alpha in the range of 0.0 to 1.0
	 * where a value of 0.0 is exacly t1 and a value of 1.0 is exactly t2.
	 * The result is saved in the result array.
	 * 
	 * <p>
	 * Operation:
	 * (1.0 - alpha) * t1 + alpha * t2
	 * 
	 * @param t1 The first vector.
	 * @param t2 The second vector.
	 * @param alpha The interpolator in range of 0.0 to 1.0.
	 * @param res The result array.
	 * 
	 * @return The result array with the result.
	 */
	public static double[] lerp(Tup3dR t1, Tup3dR t2, double alpha, @ExtractParam double[] res)
	{
		return lerp(t1.getX(), t1.getY(), t1.getZ(), t2.getX(), t2.getY(), t2.getZ(), alpha, res);
	}
	
	/**
	 * Performs a linear interpolation between the two vectors t1 and (x2, y2, z2).
	 * The interpolation happens over the interpolator value alpha in the range of 0.0 to 1.0
	 * where a value of 0.0 is exacly t1 and a value of 1.0 is exactly (x2, y2, z2).
	 * The result is saved in the result array.
	 * 
	 * <p>
	 * Operation:
	 * (1.0 - alpha) * t1 + alpha * (x2, y2, z2)
	 * 
	 * @param t1 The first vector.
	 * @param x2 The value of the x component of the second vector.
	 * @param y2 The value of the y component of the second vector.
	 * @param z2 The value of the z component of the second vector.
	 * @param alpha The interpolator in range of 0.0 to 1.0.
	 * @param res The result array.
	 * 
	 * @return The result array with the result.
	 */
	public static double[] lerp(Tup3dR t1, double x2, double y2, double z2, double alpha, @ExtractParam double[] res)
	{
		return lerp(t1.getX(), t1.getY(), t1.getZ(), x2, y2, z2, alpha, res);
	}
	
	/**
	 * Performs a linear interpolation between the two vectors (x1, y1, z1) and t2.
	 * The interpolation happens over the interpolator value alpha in the range of 0.0 to 1.0
	 * where a value of 0.0 is exacly (x1, y1, z1) and a value of 1.0 is exactly t2.
	 * The result is saved in the result array.
	 * 
	 * <p>
	 * Operation:
	 * (1.0 - alpha) * (x1, y1, z1) + alpha * t2
	 * 
	 * @param x1 The value of the x component of the first vector.
	 * @param y1 The value of the y component of the first vector.
	 * @param z1 The value of the z component of the first vector.
	 * @param t2 The second vector.
	 * @param alpha The interpolator in range of 0.0 to 1.0.
	 * @param res The result array.
	 * 
	 * @return The result array with the result.
	 */
	public static double[] lerp(double x1, double y1, double z1, Tup3dR t2, double alpha, @ExtractParam double[] res)
	{
		return lerp(x1, y1, z1, t2.getX(), t2.getY(), t2.getZ(), alpha, res);
	}
	
	/**
	 * Performs a linear interpolation between the two vectors (x1, y1, z1) and (x2, y2, z2).
	 * The interpolation happens over the interpolator value alpha in the range of 0.0 to 1.0
	 * where a value of 0.0 is exacly (x1, y1, z1) and a value of 1.0 is exactly (x2, y2, z2).
	 * The result is saved in the result array.
	 * 
	 * <p>
	 * Operation:
	 * (1.0 - alpha) * (x1, y1, z1) + alpha * (x2, y2, z2)
	 * 
	 * @param x1 The value of the x component of the first vector.
	 * @param y1 The value of the y component of the first vector.
	 * @param z1 The value of the z component of the first vector.
	 * @param x2 The value of the x component of the second vector.
	 * @param y2 The value of the y component of the second vector.
	 * @param z2 The value of the z component of the second vector.
	 * @param alpha The interpolator in range of 0.0 to 1.0.
	 * @param res The result array.
	 * 
	 * @return The result array with the result.
	 */
	public static double[] lerp(double x1, double y1, double z1, double x2, double y2, double z2, double alpha, @ExtractParam double[] res)
	{
		res[COMP_X] = Math.fma(1.0 - alpha, x1, alpha * x2);
		res[COMP_Y] = Math.fma(1.0 - alpha, y1, alpha * y2);
		res[COMP_Z] = Math.fma(1.0 - alpha, z1, alpha * z2);
		
		return res;
	}
	
	/**
	 * Performs a linear interpolation between the two vectors t1 and t2.
	 * The interpolation happens over the interpolator value alpha in the range of 0.0 to 1.0
	 * where a value of 0.0 is exacly t1 and a value of 1.0 is exactly t2.
	 * The result is saved in the extraction parameter object.
	 * 
	 * <p>
	 * Operation:
	 * (1.0 - alpha) * t1 + alpha * t2
	 * 
	 * @param t1 The first vector.
	 * @param t2 The second vector.
	 * @param alpha The interpolator in range of 0.0 to 1.0.
	 * @param res The extraction parameter object.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Vec3dC> T lerp(Tup3dR t1, Tup3dR t2, double alpha, @ExtractParam T res)
	{
		return lerp(t1.getX(), t1.getY(), t1.getZ(), t2.getX(), t2.getY(), t2.getZ(), alpha, res);
	}
	
	/**
	 * Performs a linear interpolation between the two vectors t1 and (x2, y2, z2).
	 * The interpolation happens over the interpolator value alpha in the range of 0.0 to 1.0
	 * where a value of 0.0 is exacly t1 and a value of 1.0 is exactly (x2, y2, z2).
	 * The result is saved in the extraction parameter object.
	 * 
	 * <p>
	 * Operation:
	 * (1.0 - alpha) * t1 + alpha * (x2, y2, z2)
	 * 
	 * @param t1 The first vector.
	 * @param x2 The value of the x component of the second vector.
	 * @param y2 The value of the y component of the second vector.
	 * @param z2 The value of the z component of the second vector.
	 * @param alpha The interpolator in range of 0.0 to 1.0.
	 * @param res The extraction parameter object.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Vec3dC> T lerp(Tup3dR t1, double x2, double y2, double z2, double alpha, @ExtractParam T res)
	{
		return lerp(t1.getX(), t1.getY(), t1.getZ(), x2, y2, z2, alpha, res);
	}
	
	/**
	 * Performs a linear interpolation between the two vectors (x1, y1, z1) and t2.
	 * The interpolation happens over the interpolator value alpha in the range of 0.0 to 1.0
	 * where a value of 0.0 is exacly (x1, y1, z1) and a value of 1.0 is exactly t2.
	 * The result is saved in the extraction parameter object.
	 * 
	 * <p>
	 * Operation:
	 * (1.0 - alpha) * (x1, y1, z1) + alpha * t2
	 * 
	 * @param x1 The value of the x component of the first vector.
	 * @param y1 The value of the y component of the first vector.
	 * @param z1 The value of the z component of the first vector.
	 * @param t2 The second vector.
	 * @param alpha The interpolator in range of 0.0 to 1.0.
	 * @param res The extraction parameter object.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Vec3dC> T lerp(double x1, double y1, double z1, Tup3dR t2, double alpha, @ExtractParam T res)
	{
		return lerp(x1, y1, z1, t2.getX(), t2.getY(), t2.getZ(), alpha, res);
	}
	
	/**
	 * Performs a linear interpolation between the two vectors (x1, y1, z1) and (x2, y2, z2).
	 * The interpolation happens over the interpolator value alpha in the range of 0.0 to 1.0
	 * where a value of 0.0 is exacly (x1, y1, z1) and a value of 1.0 is exactly (x2, y2, z2).
	 * The result is saved in the extraction parameter object.
	 * 
	 * <p>
	 * Operation:
	 * (1.0 - alpha) * (x1, y1, z1) + alpha * (x2, y2, z2)
	 * 
	 * @param x1 The value of the x component of the first vector.
	 * @param y1 The value of the y component of the first vector.
	 * @param z1 The value of the z component of the first vector.
	 * @param x2 The value of the x component of the second vector.
	 * @param y2 The value of the y component of the second vector.
	 * @param z2 The value of the z component of the second vector.
	 * @param alpha The interpolator in range of 0.0 to 1.0.
	 * @param res The extraction parameter object.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Vec3dC> T lerp(double x1, double y1, double z1, double x2, double y2, double z2, double alpha, @ExtractParam T res)
	{
		res.set(Math.fma(1.0 - alpha, x1, alpha * x2), Math.fma(1.0 - alpha, y1, alpha * y2), Math.fma(1.0 - alpha, z1, alpha * z2));
		
		return res;
	}
	
	/**
	 * Performs a linear interpolation between the two vectors t1 and t2.
	 * The interpolation happens over the interpolator value alpha in the range of 0.0 to 1.0
	 * where a value of 0.0 is exacly t1 and a value of 1.0 is exactly t2.
	 * The result is relayed to the functional interface implementation.
	 * 
	 * <p>
	 * Operation:
	 * (1.0 - alpha) * t1 + alpha * t2
	 * 
	 * @param t1 The first vector.
	 * @param t2 The second vector.
	 * @param alpha The interpolator in range of 0.0 to 1.0.
	 * @param func A functional interface implementation to take the result.
	 * 
	 * @return The object returned from the functional interface.
	 */
	public static <T> T lerp(Tup3dR t1, Tup3dR t2, double alpha, @ExtractParam DoubleFunction3<T> func)
	{
		return lerp(t1.getX(), t1.getY(), t1.getZ(), t2.getX(), t2.getY(), t2.getZ(), alpha, func);
	}
	
	/**
	 * Performs a linear interpolation between the two vectors t1 and (x2, y2, z2).
	 * The interpolation happens over the interpolator value alpha in the range of 0.0 to 1.0
	 * where a value of 0.0 is exacly t1 and a value of 1.0 is exactly (x2, y2, z2).
	 * The result is relayed to the functional interface implementation.
	 * 
	 * <p>
	 * Operation:
	 * (1.0 - alpha) * t1 + alpha * (x2, y2, z2)
	 * 
	 * @param t1 The first vector.
	 * @param x2 The value of the x component of the second vector.
	 * @param y2 The value of the y component of the second vector.
	 * @param z2 The value of the z component of the second vector.
	 * @param alpha The interpolator in range of 0.0 to 1.0.
	 * @param func A functional interface implementation to take the result.
	 * 
	 * @return The object returned from the functional interface.
	 */
	public static <T> T lerp(Tup3dR t1, double x2, double y2, double z2, double alpha, @ExtractParam DoubleFunction3<T> func)
	{
		return lerp(t1.getX(), t1.getY(), t1.getZ(), x2, y2, z2, alpha, func);
	}
	
	/**
	 * Performs a linear interpolation between the two vectors (x1, y1, z1) and t2.
	 * The interpolation happens over the interpolator value alpha in the range of 0.0 to 1.0
	 * where a value of 0.0 is exacly (x1, y1, z1) and a value of 1.0 is exactly t2.
	 * The result is relayed to the functional interface implementation.
	 * 
	 * <p>
	 * Operation:
	 * (1.0 - alpha) * (x1, y1, z1) + alpha * t2
	 * 
	 * @param x1 The value of the x component of the first vector.
	 * @param y1 The value of the y component of the first vector.
	 * @param z1 The value of the z component of the first vector.
	 * @param t2 The second vector.
	 * @param alpha The interpolator in range of 0.0 to 1.0.
	 * @param func A functional interface implementation to take the result.
	 * 
	 * @return The object returned from the functional interface.
	 */
	public static <T> T lerp(double x1, double y1, double z1, Tup3dR t2, double alpha, @ExtractParam DoubleFunction3<T> func)
	{
		return lerp(x1, y1, z1, t2.getX(), t2.getY(), t2.getZ(), alpha, func);
	}
	
	/**
	 * Performs a linear interpolation between the two vectors (x1, y1, z1) and (x2, y2, z2).
	 * The interpolation happens over the interpolator value alpha in the range of 0.0 to 1.0
	 * where a value of 0.0 is exacly (x1, y1, z1) and a value of 1.0 is exactly (x2, y2, z2).
	 * The result is relayed to the functional interface implementation.
	 * 
	 * <p>
	 * Operation:
	 * (1.0 - alpha) * (x1, y1, z1) + alpha * (x2, y2, z2)
	 * 
	 * @param x1 The value of the x component of the first vector.
	 * @param y1 The value of the y component of the first vector.
	 * @param z1 The value of the z component of the first vector.
	 * @param x2 The value of the x component of the second vector.
	 * @param y2 The value of the y component of the second vector.
	 * @param z2 The value of the z component of the second vector.
	 * @param alpha The interpolator in range of 0.0 to 1.0.
	 * @param func A functional interface implementation to take the result.
	 * 
	 * @return The object returned from the functional interface.
	 */
	public static <T> T lerp(double x1, double y1, double z1, double x2, double y2, double z2, double alpha, @ExtractParam DoubleFunction3<T> func)
	{
		return func.apply(Math.fma(alpha, x2 - x1, x1), Math.fma(alpha, y2 - y1, y1), Math.fma(alpha, z2 - z1, z1));
	}
}
