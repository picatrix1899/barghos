package org.barghos.math.api.vector;

import static org.barghos.core.api.tuple.TupleConstants.*;

import org.barghos.core.api.tuple2.Tup2dR;
import org.barghos.core.api.tuple2.Tup2oC;
import org.barghos.core.api.util.ExtractParam;
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
	 * Adds the second vector (x2, y2) to the first vector (x1, y1).
	 * The result is saved in the given result array.
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
	public static double[] add(double x1, double y1, double x2, double y2, @ExtractParam double[] res)
	{
		res[COMP_X] = x1 + x2;
		res[COMP_Y] = y1 + y2;
		
		return res;
	}
	
	/**
	 * Adds the second vector (x2, y2) to the first vector (x1, y1).
	 * The result is saved in the extraction parameter object.
	 * 
	 * <p>
	 * Operation:
	 * (x1, y1) + (x2, y2)
	 * 
	 * @param <T> The type of the extraction parameter object.
	 * 
	 * @param x1 The value of the x component of the first tuple.
	 * @param y1 The value of the y component of the first tuple.
	 * @param x2 The value of the x component of the second tuple.
	 * @param y2 The value of the y component of the second tuple.
	 * @param res The extraction parameter object.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Vec2dC> T add(double x1, double y1, double x2, double y2, @ExtractParam T res)
	{
		res.set(x1 + x2, y1 + y2);
		
		return res;
	}
	
	/**
	 * Adds the second vector (x2, y2) to the first vector (x1, y1).
	 * The result is relayed to the functional interface implementation.
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
	 * @param func A functional interface implementation to take the result.
	 * 
	 * @return The object returned from the functional interface.
	 */
	public static <T> T add(double x1, double y1, double x2, double y2, @ExtractParam DoubleFunction2<T> func)
	{
		return func.apply(x1 + x2, y1 + y2);
	}
	
	/**
	 * Subtracts the second vector (x2, y2) from the first vector (x1, y1).
	 * The result is saved in the given result array.
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
	public static double[] sub(double x1, double y1, double x2, double y2, @ExtractParam double[] res)
	{
		res[COMP_X] = x1 - x2;
		res[COMP_Y] = y1 - y2;
		
		return res;
	}
	
	/**
	 * Subtracts the second vector (x2, y2) from the first vector (x1, y1).
	 * The result is saved in the extraction parameter object.
	 * 
	 * <p>
	 * Operation:
	 * (x1, y1) - (x2, y2)
	 * 
	 * @param <T> The type of the extraction parameter object.
	 * 
	 * @param x1 The value of the x component of the first tuple.
	 * @param y1 The value of the y component of the first tuple.
	 * @param x2 The value of the x component of the second tuple.
	 * @param y2 The value of the y component of the second tuple.
	 * @param res The extraction parameter object.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Vec2dC> T sub(double x1, double y1, double x2, double y2, @ExtractParam T res)
	{
		res.set(x1 - x2, y1 - y2);
		
		return res;
	}
	
	/**
	 * Subtracts the second vector (x2, y2) from the first vector (x1, y1).
	 * The result is relayed to the functional interface implementation.
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
	 * @param func A functional interface implementation to take the result.
	 * 
	 * @return The object returned from the functional interface.
	 */
	public static <T> T sub(double x1, double y1, double x2, double y2, @ExtractParam DoubleFunction2<T> func)
	{
		return func.apply(x1 - x2, y1 - y2);
	}
	
	/**
	 * Subtracts the first vector (x1, y1) from the second vector (x2, y2).
	 * The result is saved in the given result array.
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
	public static double[] revSub(double x1, double y1, double x2, double y2, @ExtractParam double[] res)
	{
		res[COMP_X] = x2 - x1;
		res[COMP_Y] = y2 - y1;
		
		return res;
	}
	
	/**
	 * Subtracts the first vector (x1, y1) from the second vector (x2, y2).
	 * The result is saved in the extraction parameter object.
	 * 
	 * <p>
	 * Operation:
	 * (x2, y2) - (x1, y1)
	 * 
	 * @param <T> The type of the extraction parameter object.
	 * 
	 * @param x1 The value of the x component of the first tuple.
	 * @param y1 The value of the y component of the first tuple.
	 * @param x2 The value of the x component of the second tuple.
	 * @param y2 The value of the y component of the second tuple.
	 * @param res The extraction parameter object.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Vec2dC> T revSub(double x1, double y1, double x2, double y2, @ExtractParam T res)
	{
		res.set(x2 - x1, y2 - y1);
		
		return res;
	}
	
	/**
	 * Subtracts the first vector (x1, y1) from the second vector (x2, y2).
	 * The result is relayed to the functional interface implementation.
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
	 * @param func A functional interface implementation to take the result.
	 * 
	 * @return The object returned from the functional interface.
	 */
	public static <T> T revSub(double x1, double y1, double x2, double y2, @ExtractParam DoubleFunction2<T> func)
	{
		return func.apply(x2 - x1, y2 - y1);
	}
	
	/**
	 * Multiplies the first vector(x1, y1) with the second vector (x2, y2).
	 * The result is saved in the given result array.
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
	public static double[] mul(double x1, double y1, double x2, double y2, @ExtractParam double[] res)
	{
		res[COMP_X] = x1 * x2;
		res[COMP_Y] = y1 * y2;
		
		return res;
	}
	
	/**
	 * Multiplies the first vector (x1, y1) with the second vector (x2, y2).
	 * The result is saved in the extraction parameter object.
	 * 
	 * <p>
	 * Operation:
	 * (x1, y1) * (x2, y2)
	 * 
	 * @param <T> The type of the extraction parameter object.
	 * 
	 * @param x1 The value of the x component of the first tuple.
	 * @param y1 The value of the y component of the first tuple.
	 * @param x2 The value of the x component of the second tuple.
	 * @param y2 The value of the y component of the second tuple.
	 * @param res The extraction parameter object.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Vec2dC> T mul(double x1, double y1, double x2, double y2, @ExtractParam T res)
	{
		res.set(x1 * x2, y1 * y2);
		
		return res;
	}
	
	/**
	 * Multiplies the first vector (x1, y1) with the second vector (x2, y2)
	 * The result is relayed to the functional interface implementation.
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
	 * @param func A functional interface implementation to take the result.
	 * 
	 * @return The object returned from the functional interface.
	 */
	public static <T> T mul(double x1, double y1, double x2, double y2, @ExtractParam DoubleFunction2<T> func)
	{
		return func.apply(x1 * x2, y1 * y2);
	}
	
	/**
	 * Divides the first vector (x1, y1) by the second vector (x2, y2).
	 * The result is saved in the given result array.
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
	public static double[] div(double x1, double y1, double x2, double y2, @ExtractParam double[] res)
	{
		res[COMP_X] = x1 / x2;
		res[COMP_Y] = y1 / y2;
		
		return res;
	}
	
	/**
	 * Divides the first vector (x1, y1) by the second vector (x2, y2).
	 * The result is saved in the extraction parameter object.
	 * 
	 * <p>
	 * Operation:
	 * (x1, y1) / (x2, y2)
	 * 
	 * @param <T> The type of the extraction parameter object.
	 * 
	 * @param x1 The value of the x component of the first tuple.
	 * @param y1 The value of the y component of the first tuple.
	 * @param x2 The value of the x component of the second tuple.
	 * @param y2 The value of the y component of the second tuple.
	 * @param res The extraction parameter object.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Vec2dC> T div(double x1, double y1, double x2, double y2, @ExtractParam T res)
	{
		res.set(x1 / x2, y1 / y2);
		
		return res;
	}
	
	/**
	 * Divides the first vector (x1, y1) by the second vector (x2, y2).
	 * The result is relayed to the functional interface implementation.
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
	 * @param func A functional interface implementation to take the result.
	 * 
	 * @return The object returned from the functional interface.
	 */
	public static <T> T div(double x1, double y1, double x2, double y2, @ExtractParam DoubleFunction2<T> func)
	{
		return func.apply(x1 / x2, y1 / y2);
	}
	
	/**
	 * Divides the second vector (x2, y2) by the first vector (x1, y1).
	 * The result is saved in the given result array.
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
	public static double[] revDiv(double x1, double y1, double x2, double y2, @ExtractParam double[] res)
	{
		res[COMP_X] = x2 / x1;
		res[COMP_Y] = y2 / y1;
		
		return res;
	}
	
	/**
	 * Divides the second vector (x2, y2) by the first vector (x1, y1).
	 * The result is saved in the extraction parameter object.
	 * 
	 * <p>
	 * Operation:
	 * (x2, y2) / (x1, y1)
	 * 
	 * @param <T> The type of the extraction parameter.
	 * 
	 * @param x1 The value of the x component of the first tuple.
	 * @param y1 The value of the y component of the first tuple.
	 * @param x2 The value of the x component of the second tuple.
	 * @param y2 The value of the y component of the second tuple.
	 * @param res The extraction parameter.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static <T extends Vec2dC> T revDiv(double x1, double y1, double x2, double y2, @ExtractParam T res)
	{
		res.set(x2 / x1, y2 / y1);
		
		return res;
	}
	
	/**
	 * Divides the second vector (x2, y2) by the first vector (x1, y1).
	 * The result is relayed to the functional interface implementation.
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
	 * @param func A functional interface implementation to take the result.
	 * 
	 * @return The object returned from the functional interface.
	 */
	public static <T> T revDiv(double x1, double y1, double x2, double y2, @ExtractParam DoubleFunction2<T> func)
	{
		return func.apply(x2 / x1, y2 / y1);
	}
	
	/**
	 * Performs an fma ({@link Math#fma}) combined multiplication and addition operation on the vector (x, y)
	 * with the two given vectors (mX, mY) and (aX, aY).
	 * The result is saved in the given result array.
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
	public static double[] fma(double x, double y, double mX, double mY, double aX, double aY, @ExtractParam double[] res)
	{
		res[COMP_X] = Math.fma(x, mX, aX);
		res[COMP_Y] = Math.fma(y, mY, aY);
		
		return res;
	}
	
	/**
	 * Performs an fma ({@link Math#fma}) combined multiplication and addition operation on the vector (x, y)
	 * with the two given vectors (mX, mY) and (aX, aY).
	 * The result is saved in the extraction parameter object.
	 * In this version the vector is used as a multiplicant.
	 * 
	 * <p>
	 * Operation:
	 * (x, y) * (mX, mY) + (aX, aY)
	 * 
	 * @param <T> The type of the extraction parameter object.
	 * 
	 * @param x The value of the x component of the first multiplicant.
	 * @param y The value of the y component of the first multiplicant.
	 * @param mX The value of the x component of the second multiplicant.
	 * @param mY The value of the y component of the second multiplicant.
	 * @param aX The value of the x component of the addend.
	 * @param aY The value of the y component of the addend.
	 * @param res The extraction parameter object.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Vec2dC> T fma(double x, double y, double mX, double mY, double aX, double aY, @ExtractParam T res)
	{
		res.set(Math.fma(x, mX, aX), Math.fma(y, mY, aY));
		return res;
	}
	
	/**
	 * Performs an fma ({@link Math#fma}) combined multiplication and addition operation on the vector (x, y)
	 * with the two given vectors (mX, mY) and (aX, aY).
	 * The result is relayed to the functional interface implementation.
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
	public static <T> T fma(double x, double y, double mX, double mY, double aX, double aY, @ExtractParam DoubleFunction2<T> func)
	{
		return func.apply(Math.fma(x, mX, aX), Math.fma(y, mY, aY));
	}
	
	/**
	 * Performs an fma ({@link Math#fma}) combined multiplication and addition operation on the vector (x, y)
	 * with the two given vector (m1X, m1Y) and (m2X, m2Y).
	 * The result is saved in the given result array.
	 * In this version the vector is used as the addend.
	 * 
	 * <p>
	 * Operation:
	 * (x, y) + (m1X, m1Y) * (m2X, m2Y)
	 * 
	 * @param x The value of the x component of the addend.
	 * @param y The value of the y component of the addend.
	 * @param m1X The value of the x component of the first multiplicant.
	 * @param m1Y The value of the y component of the first multiplicant.
	 * @param m2X The value of the x component of the second multiplicant.
	 * @param m2Y The value of the y component of the second multiplicant.
	 * @param res The result array.
	 * 
	 * @return The result array with the result.
	 */
	public static double[] mulAdd(double x, double y, double mX1, double mY1, double mX2, double mY2, @ExtractParam double[] res)
	{
		res[COMP_X] = Math.fma(mX1, mX2, x);
		res[COMP_Y] = Math.fma(mY1, mY2, y);
		
		return res;
	}
	
	/**
	 * Performs an fma ({@link Math#fma}) combined multiplication and addition operation on the vector (x, y)
	 * with the two given vector (m1X, m1Y) and (m2X, m2Y).
	 * The result is saved in the extraction parameter object.
	 * In this version the vector is used as the addend.
	 * 
	 * <p>
	 * Operation:
	 * (x, y) + (mX1, mY1) * (mX2, mY2)
	 * 
	 * @param <T> The type of the extraction parameter object.
	 * 
	 * @param x The value of the x component of the addend.
	 * @param y The value of the y component of the addend.
	 * @param mX1 The value of the x component of the first multiplicant.
	 * @param mY1 The value of the y component of the first multiplicant.
	 * @param mX2 The value of the x component of the second multiplicant.
	 * @param mY2 The value of the y component of the second multiplicant.
	 * @param res The extraction parameter object.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Vec2dC> T mulAdd(double x, double y, double mX1, double mY1, double mX2, double mY2, @ExtractParam T res)
	{
		res.set(Math.fma(mX1, mX2, x), Math.fma(mY1, mY2, y));
		return res;
	}
	
	/**
	 * Performs an fma ({@link Math#fma}) combined multiplication and addition operation on the vector (x, y)
	 * with the two given vector (m1X, m1Y) and (m2X, m2Y).
	 * The result is relayed to the functional interface implementation.
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
	 * @param func A functional interface implementation to take the result.
	 * 
	 * @return The object returned from the functional interface.
	 */
	public static <T> T mulAdd(double x, double y, double mX1, double mY1, double mX2, double mY2, @ExtractParam DoubleFunction2<T> func)
	{
		return func.apply(Math.fma(mX1, mX2, x), Math.fma(mY1, mY2, y));
	}
	
	/**
	 * Returns the reciprocal length of the vector (x, y).
	 * It doesn't account for zero-length vectors and will in such case throw an {@link ArithmeticException}
	 * as this would result in a division by zero.
	 * 
	 * <p>
	 * Operation:
	 * 1 / |v|
	 * 
	 * @param x The value of the x component of the vector.
	 * @param y The value of the y component of the vector.
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
	 * Returns the reciprocal length of the vector (x, y).
	 * If the vector is a zero-length vector the result will be zero.
	 * It determines a zero-length by checking if all components are exactly zero.
	 * Due to floating-point-errors it might still throw an {@link ArithmeticException} when
	 * the length is too close to zero.
	 * 
	 * <p>
	 * Operation:
	 * 1 / |v|
	 * 
	 * @param x The value of the x component of the vector.
	 * @param y The value of the y component of the vector.
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
	 * Returns the reciprocal length of the vector (x, y).
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
	 * Returns the length of the vector (x, y).
	 * It doesn't account for zero-length vectors.
	 * 
	 * <p>
	 * Operation:
	 * |v|
	 * 
	 * @param x The value of the x component of the vector.
	 * @param y The value of the y component of the vector.
	 * 
	 * @return The length of the vector.
	 */
	public static double length(double x, double y)
	{
		return Math.sqrt(Math.fma(x, x, y * y));
	}
	
	/**
	 * Returns the length of the vector (x, y).
	 * If the vector is a zero-length vector the result will be zero.
	 * It determines a zero-length by checking if all components are exactly zero.
	 * 
	 * <p>
	 * Operation:
	 * |v|
	 * 
	 * @param x The value of the x component of the vector.
	 * @param y The value of the y component of the vector.
	 * 
	 * @return The length of the vector or zero if it is a zero-length vector.
	 */
	public static double lengthSafe(double x, double y)
	{
		if(x + y == 0.0) return 0.0;
		
		return Math.sqrt(Math.fma(x, x, y * y));
	}
	
	/**
	 * Returns the length of the vector (x, y).
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
	 * Returns the squared length of the vector (x, y).
	 * It doesn't account for zero-length vectors.
	 * 
	 * <p>
	 * Operation:
	 * |v|²
	 * 
	 * @param x The value of the x component of the vector.
	 * @param y The value of the y component of the vector.
	 * 
	 * @return The squared length of the vector.
	 */
	public static double squaredLength(double x, double y)
	{
		return Math.fma(x, x, y * y);
	}
	
	/**
	 * Returns the squared length of the vector (x, y).
	 * If the vector is a zero-length vector the result will be zero.
	 * It determines a zero-length by checking if all components are exactly zero.
	 * 
	 * <p>
	 * Operation:
	 * |v|²
	 * 
	 * @param x The value of the x component of the vector.
	 * @param y The value of the y component of the vector.
	 * 
	 * @return The squared length of the vector or zero if it is a zero-length vector.
	 */
	public static double squaredLengthSafe(double x, double y)
	{
		if(x + y == 0.0) return 0.0;
		
		return Math.fma(x, x, y * y);
	}
	
	/**
	 * Returns the squared length of the vector (x, y).
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
	 * Determines the smallest value of the components of the vector (x, y) and returns the value and the index of the component.
	 * The index returned is limited to the range of 0 to 1.
	 * If two or more components have the same value the first index will be returned.
	 * The result is saved in the extraction parameter object.
	 * 
	 * @param <T> The type of the extraction parameter object.
	 * 
	 * @param x The value of the x component of the vector.
	 * @param y The value of the y component of the vector.
	 * @param res The extraction parameter object.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2oC<Double,Integer>> T min(double x, double y, @ExtractParam T res)
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
	 * Determines the smallest value of the components of the vector (x, y) and returns the value and the index of the component.
	 * The index returned is limited to the range of 0 to 1.
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
	 * @param func A functional interface implementation to take the result.
	 * 
	 * @return The object returned from the functional interface.
	 */
	public static <T> T min(double x, double y, @ExtractParam GenericFunction2<Double,Integer,T> func)
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
	 * Determines the smallest value of the components of the vector (x, y) and returns it.
	 * 
	 * @param x The value of the x component of the vector.
	 * @param y The value of the y component of the vector.
	 * 
	 * @return The smallest value of the components.
	 */
	public static double minValue(double x, double y)
	{
		return Math.min(x, y);
	}
	
	/**
	 * Determines the smallest value of the components of the vector (x, y) and returns the index of the component.
	 * The index returned is limited to the range of 0 to 1.
	 * If two or more components have the same value the first index will be returned.
	 * 
	 * @param x The value of the x component of the vector.
	 * @param y The value of the y component of the vector.
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
	 * Determines the greatest value of the components of the vector (x, y) and returns the value and the index of the component.
	 * The index returned is limited to the range of 0 to 1.
	 * If two or more components have the same value the first index will be returned.
	 * The result is saved in the extraction parameter object.
	 * 
	 * @param <T> The type of the extraction parameter object.
	 * 
	 * @param x The value of the x component of the vector.
	 * @param y The value of the y component of the vector.
	 * @param res The extraction parameter object.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2oC<Double,Integer>> T max(double x, double y, @ExtractParam T res)
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
	 * Determines the greatest value of the components of the vector (x, y) and returns the value and the index of the component.
	 * The index returned is limited to the range of 0 to 1.
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
	 * @param func A functional interface implementation to take the result.
	 * 
	 * @return The object returned from the functional interface.
	 */
	public static <T> T max(double x, double y, @ExtractParam GenericFunction2<Double,Integer,T> func)
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
	 * Determines the greatest value of the components of the vector (x, y) and returns it.
	 * 
	 * @param x The value of the x component of the vector.
	 * @param y The value of the y component of the vector.
	 * 
	 * @return The greatest value of the components.
	 */
	public static double maxValue(double x, double y)
	{
		return Math.max(x, y);
	}
	
	/**
	 * Determines the greatest value of the components of the vector (x, y) and returns the index of the component.
	 * The index returned is limited to the range of 0 to 1.
	 * If two or more components have the same value the first index will be returned.
	 * 
	 * @param x The value of the x component of the vector.
	 * @param y The value of the y component of the vector.
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
	 * Normalizes the vector (x, y).
	 * Normalization is done by dividing the vector by its length.
	 * This doesn't account for zero-length vectors and will in such case throw an {@link ArithmeticException}
	 * as this would result in a division by zero.
	 * The result is saved in the given result array.
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
	public static double[] normal(double x, double y, @ExtractParam double[] res)
	{
		double recLength = 1.0 / Math.sqrt(Math.fma(x, x, y * y));
		
		res[COMP_X] = x * recLength;
		res[COMP_Y] = y * recLength;
		
		return res;
	}
	
	/**
	 * Normalizes the vector (x, y).
	 * Normalization is done by dividing the vector by its length.
	 * This doesn't account for zero-length vectors and will in such case throw an {@link ArithmeticException}
	 * as this would result in a division by zero.
	 * The result is saved in the extraction parameter object.
	 * 
	 * <p>
	 * Operation:
	 * (x, y) / |(x, y)|
	 * 
	 * @param <T> The type of the extraction parameter object.
	 * 
	 * @param x The value of the x component of the vector.
	 * @param y The value of the y component of the vector.
	 * @param res The extraction parameter object.
	 * 
	 * @return The extraction parameter object with the result.
	 * 
	 * @throws ArithmeticException Thrown when it is a zero-length vector.
	 */
	public static <T extends Vec2dC> T normal(double x, double y, @ExtractParam T res)
	{
		double recLength = 1.0 / Math.sqrt(Math.fma(x, x, y * y));
		
		res.set(x * recLength, y * recLength);
		
		return res;
	}
	
	/**
	 * Normalizes the vector (x, y).
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
	 * (x, y) / |(x, y)|
	 * 
	 * @param <T> The type of the result object.
	 * 
	 * @param x The value of the x component of the vector.
	 * @param y The value of the y component of the vector.
	 * @param func A functional interface implementation to take the result.
	 * 
	 * @return The object returned from the functional interface.
	 * 
	 * @throws ArithmeticException Thrown when it is a zero-length vector.
	 */
	public static <T> T normal(double x, double y, @ExtractParam DoubleFunction2<T> func)
	{
		double recLength = 1.0 / Math.sqrt(Math.fma(x, x, y * y));
		
		return func.apply(x * recLength, y * recLength);
	}
	
	/**
	 * Normalizes the vector (x, y).
	 * Normalization is done by dividing the vector by its length.
	 * If the vector is a zero-length vector the result will be a zero vector.
	 * It determines a zero-length by checking if all components are exactly zero.
	 * Due to floating-point-errors it might still throw an {@link ArithmeticException} when
	 * the length is too close to zero.
	 * The result is saved in the given result array.
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
	public static double[] normalSafe(double x, double y, @ExtractParam double[] res)
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
	 * Normalizes the vector (x, y).
	 * Normalization is done by dividing the vector by its length.
	 * If the vector is a zero-length vector the result will be a zero vector.
	 * It determines a zero-length by checking if all components are exactly zero.
	 * Due to floating-point-errors it might still throw an {@link ArithmeticException} when
	 * the length is too close to zero.
	 * The result is saved in the extraction parameter object.
	 * 
	 * <p>
	 * Operation:
	 * (x, y) / |(x, y)|
	 * 
	 * @param <T> The type of the extraction parameter object.
	 * 
	 * @param x The value of the x component of the vector.
	 * @param y The value of the y component of the vector.
	 * @param res The extraction parameter object.
	 * 
	 * @return The extraction parameter object with the result.
	 * 
	 * @throws ArithmeticException Might be thrown when the length is to close to zero.
	 */
	public static <T extends Vec2dC> T normalSafe(double x, double y, @ExtractParam T res)
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
	 * Normalizes the vector (x, y).
	 * Normalization is done by dividing the vector by its length.
	 * If the vector is a zero-length vector the result will be a zero vector.
	 * It determines a zero-length by checking if all components are exactly zero.
	 * Due to floating-point-errors it might still throw an {@link ArithmeticException} when
	 * the length is too close to zero.
	 * The result is relayed to the functional interface implementation.
	 * 
	 * <p>
	 * This variant is useful for example for creating readonly instances or to use factories.
	 * 
	 * <p>
	 * Operation:
	 * (x, y) / |(x, y)|
	 * 
	 * @param <T> The type of the result object.
	 * 
	 * @param x The value of the x component of the vector.
	 * @param y The value of the y component of the vector.
	 * @param func A functional interface implementation to take the result.
	 * 
	 * @return The object returned from the functional interface.
	 * 
	 * @throws ArithmeticException Might be thrown when the length is to close to zero.
	 */
	public static <T> T normalSafe(double x, double y, @ExtractParam DoubleFunction2<T> func)
	{
		if(x + y == 0.0) return func.apply(0.0, 0.0);
		
		double recLength = 1.0 / Math.sqrt(Math.fma(x, x, y * y));

		return func.apply(x * recLength, y * recLength);
	}
	
	/**
	 * Normalizes the vector (x, y).
	 * Normalization is done by dividing the vector by its length.
	 * If the vector is a zero-length vector the result will be a zero vector.
	 * It determines a zero-length by checking if all components are within the margin defined by
	 * zero plus-minus the given tolerance inclusive (-tolerance <= value <= tolerance).
	 * The result is saved in the given result array.
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
	public static double[] normalSafeWithMargin(double x, double y, double tolerance, @ExtractParam double[] res)
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
	 * Normalizes the vector (x, y).
	 * Normalization is done by dividing the vector by its length.
	 * If the vector is a zero-length vector the result will be a zero vector.
	 * It determines a zero-length by checking if all components are within the margin defined by
	 * zero plus-minus the given tolerance inclusive (-tolerance <= value <= tolerance).
	 * The result is saved in the extraction parameter object.
	 * 
	 * <p>
	 * Operation:
	 * (x, y) / |(x, y)|
	 * 
	 * @param <T> The type of the extraction parameter object.
	 * 
	 * @param x The value of the x component of the vector.
	 * @param y The value of the y component of the vector.
	 * @param tolerance The tolerance for defining the margin around zero.
	 * @param res The extraction parameter object.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Vec2dC> T normalSafeWithMargin(double x, double y, double tolerance, @ExtractParam T res)
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
	 * Normalizes the vector (x, y)
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
	 * (x, y) / |(x, y)|
	 * 
	 * @param <T> The type of the result object.
	 * 
	 * @param x The value of the x component of the vector.
	 * @param y The value of the y component of the vector.
	 * @param tolerance The tolerance for defining the margin around zero.
	 * @param func A functional interface implementation to take the result.
	 * 
	 * @return The object returned from the functional interface.
	 */
	public static <T> T normalSafeWithMargin(double x, double y, double tolerance, @ExtractParam DoubleFunction2<T> func)
	{
		if(Math.abs(x) <= tolerance && Math.abs(y) <= tolerance) return func.apply(0.0, 0.0);
		
		double recLength = 1.0 / Math.sqrt(Math.fma(x, x, y * y));

		return func.apply(x * recLength, y * recLength);
	}
	
	/**
	 * Inverts the vector (x, y).
	 * The result is saved in the given result array.
	 * 
	 * <p>
	 * Operation:
	 * -(x, y)
	 * 
	 * @param x The value of the x component of the vector.
	 * @param y The value of the y component of the vector.
	 * @param res The result array.
	 * 
	 * @return The result array with the result.
	 */
	public static double[] invert(double x, double y, @ExtractParam double[] res)
	{
		res[COMP_X] = -x;
		res[COMP_Y] = -y;
		
		return res;
	}
	
	/**
	 * Inverts the vector (x, y).
	 * The result is saved in the extraction parameter object.
	 * 
	 * <p>
	 * Operation:
	 * -(x, y)
	 * 
	 * @param <T> The type of the extraction parameter object.
	 * 
	 * @param x The value of the x component of the vector.
	 * @param y The value of the y component of the vector.
	 * @param res The extraction parameter object.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Vec2dC> T invert(double x, double y, @ExtractParam T res)
	{
		res.set(-x, -y);
		
		return res;
	}
	
	/**
	 * Inverts the vector (x, y).
	 * The result is relayed to the functional interface implementation.
	 * 
	 * <p>
	 * This variant is useful for example for creating readonly instances or to use factories.
	 * 
	 * <p>
	 * Operation:
	 * -(x, y)
	 * 
	 * @param <T> The type of the result object.
	 * 
	 * @param x The value of the x component of the vector.
	 * @param y The value of the y component of the vector.
	 * @param func A functional interface implementation to take the result.
	 * 
	 * @return The object returned from the functional interface.
	 */
	public static <T> T invert(double x, double y, @ExtractParam DoubleFunction2<T> func)
	{
		return func.apply(-x, -y);
	}
	
	/**
	 * Inverses the vector (x, y) based on the vector (x2, y2).
	 * The result is saved in the given result array.
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
	public static double[] inverse(double x, double y, double x2, double y2, @ExtractParam double[] res)
	{
		res[COMP_X] = x2 - x;
		res[COMP_Y] = y2 - y;
		
		return res;
	}
	
	/**
	 * Inverses the vector (x, y) based on the vector (x2, y2).
	 * The result is saved in the extraction parameter object.
	 * 
	 * <p>
	 * Operation:
	 * (x2, y2) - (x, y)
	 * 
	 * @param <T> The type of the extraction parameter object.
	 * 
	 * @param x The value of the x component of the vector.
	 * @param y The value of the y component of the vector.
	 * @param x2 The value the inversion of the x component is based on.
	 * @param y2 The value the inversion of the y component is based on.
	 * @param res The extraction parameter object.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Vec2dC> T inverse(double x, double y, double x2, double y2, @ExtractParam T res)
	{
		res.set(x2 - x, y2 - y);
		
		return res;
	}
	
	/**
	 * Inverses the vector (x, y) based on the vector (x2, y2).
	 * The result is relayed to the functional interface implementation.
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
	 * @param func A functional interface implementation to take the result.
	 * 
	 * @return The object returned from the functional interface.
	 */
	public static <T extends Vec2dC> T inverse(double x, double y, double x2, double y2, @ExtractParam DoubleFunction2<T> func)
	{
		return func.apply(x2 - x, y2 - y);
	}
	
	/**
	 * Calculates the half of the vector (x, y).
	 * The result is saved in the given result array.
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
	public static double[] half(double x, double y, @ExtractParam double[] res)
	{
		res[COMP_X] = x * 0.5;
		res[COMP_Y] = y * 0.5;
		
		return res;
	}
	
	/**
	 * Calculates the half of the vector (x, y).
	 * The result is saved in the extraction parameter object.
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
	public static <T extends Vec2dC> T half(double x, double y, @ExtractParam T res)
	{
		res.set(x * 0.5, y * 0.5);
		
		return res;
	}
	
	/**
	 * Calculates the half of the vector (x, y).
	 * The result is relayed to the functional interface implementation.
	 * 
	 * <p>
	 * Operation:
	 * (x, y) / 2
	 * 
	 * @param <T> The type of the result object.
	 * 
	 * @param x The value of the x component of the vector.
	 * @param y The value of the y component of the vector.
	 * @param func A functional interface implementation to take the result.
	 * 
	 * @return The object returned from the functional interface.
	 */
	public static <T extends Vec2dC> T half(double x, double y, @ExtractParam DoubleFunction2<T> func)
	{
		return func.apply(x * 0.5, y * 0.5);
	}
	
	/**
	 * Rotates the vector (x, y) by the given angle in radians.
	 * The result is saved in the given result array.
	 * 
	 * @param x The value of the x component of the vector.
	 * @param y The value of the y component of the vector.
	 * @param angle The angle in radians.
	 * @param res The result array.
	 * 
	 * @return The result array with the result.
	 */
	public static double[] rotate(double x, double y, double angle, @ExtractParam double[] res)
	{
		double cos = Math.cos(angle);
		double sin = Math.sin(angle);

		res[COMP_X] = x * cos - y * sin;
		res[COMP_Y] = x * sin + y * cos;
		
		return res;
	}
	
	/**
	 * Rotates the vector (x, y) by the given angle in radians.
	 * The result is saved in the extraction parameter object.
	 * 
	 * @param <T> The type of the extraction parameter object..
	 * 
	 * @param x The value of the x component of the vector.
	 * @param y The value of the y component of the vector.
	 * @param angle The angle in radians.
	 * @param res The extraction parameter object..
	 * 
	 * @return The extraction parameter object. with the result.
	 */
	public static <T extends Vec2dC> T rotate(double x, double y, double angle, @ExtractParam T res)
	{
		double cos = Math.cos(angle);
		double sin = Math.sin(angle);

		res.set(x * cos - y * sin, x * sin + y * cos);
		
		return res;
	}
	
	/**
	 * Rotates the vector (x, y) by the given angle in radians.
	 * The result is relayed to the functional interface implementation.
	 * 
	 * @param <T> The type of the result object.
	 * 
	 * @param x The value of the x component of the vector.
	 * @param y The value of the y component of the vector.
	 * @param angle The angle in radians.
	 * @param func A functional interface implementation to take the result.
	 * 
	 * @return The object returned from the functional interface.
	 */
	public static <T> T rotate(double x, double y, double angle, @ExtractParam DoubleFunction2<T> func)
	{
		double cos = Math.cos(angle);
		double sin = Math.sin(angle);

		return func.apply(x * cos - y * sin, x * sin + y * cos);
	}
	
	/**
	 * Calculates the orthogonal projection of the vector(x, y) onto the target vector (vX, vY).
	 * The vector to project on has to be normalized.
	 * The result is saved in the given result array.
	 * 
	 * @param x The value of the x component of the vector.
	 * @param y The value of the y component of the vector.
	 * @param vX The value of the x component of the projection target vector.
	 * @param vY The value of the y component of the projection target vector.
	 * @param res The result array.
	 * 
	 * @return The result array with the result.
	 */
	public static double[] project(double x, double y, double vX, double vY, @ExtractParam double[] res)
	{
		double dot = Math.fma(x, vX, y * vY);
		
		res[COMP_X] = vX * dot;
		res[COMP_Y] = vY * dot;
		
		return res;
	}
	
	/**
	 * Calculates the orthogonal projection of the vector(x, y) onto the target vector (vX, vY).
	 * The vector to project on has to be normalized.
	 * The result is saved in the extraction parameter object.
	 * 
	 * @param <T> The type of the extraction parameter object.
	 * 
	 * @param x The value of the x component of the vector.
	 * @param y The value of the y component of the vector.
	 * @param vX The value of the x component of the projection target vector.
	 * @param vY The value of the y component of the projection target vector.
	 * @param res The extraction parameter object.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Vec2dC> T project(double x, double y, double vX, double vY, @ExtractParam T res)
	{
		double dot = Math.fma(x, vX, y * vY);
		
		res.set(vX * dot, vY * dot);
		
		return res;
	}
	
	/**
	 * Calculates the orthogonal projection of the vector(x, y) onto the target vector (vX, vY).
	 * The vector to project on has to be normalized.
	 * The result is relayed to the functional interface implementation.
	 * 
	 * @param <T> The type of the result object.
	 * 
	 * @param x The value of the x component of the vector.
	 * @param y The value of the y component of the vector.
	 * @param vX The value of the x component of the projection target vector.
	 * @param vY The value of the y component of the projection target vector.
	 * @param func A functional interface implementation to take the result.
	 * 
	 * @return The object returned from the functional interface.
	 */
	public static <T> T project(double x, double y, double vX, double vY, @ExtractParam DoubleFunction2<T> func)
	{
		double dot = Math.fma(x, vX, y * vY);

		return func.apply(vX * dot, vY * dot);
	}
	
	/**
	 * Calculates the reflection of the vector (x, y) based on the given surface normal (nX, nY).
	 * The surface normal has to be normalized.
	 * The result is saved in the given result array.
	 * 
	 * @param x The value of the x component of the vector.
	 * @param y The value of the y component of the vector.
	 * @param nX The value of the x component of the surface normal.
	 * @param nY The value of the y component of the surface normal.
	 * @param res The result array.
	 * 
	 * @return The result array with the result.
	 */
	public static double[] reflect(double x, double y, double nX, double nY, @ExtractParam double[] res)
	{
		double dot = -2 * Math.fma(x, nX, y * nY);
		
		res[COMP_X] = Math.fma(nX, dot, x);
		res[COMP_Y] = Math.fma(nY, dot, y);
		
		return res;
	}
	
	/**
	 * Calculates the reflection of the vector (x, y) based on the given surface normal (nX, nY).
	 * The surface normal has to be normalized.
	 * The result is saved in the extraction parameter object.
	 * 
	 * @param <T> The type of the extraction parameter object.
	 * 
	 * @param x The value of the x component of the vector.
	 * @param y The value of the y component of the vector.
	 * @param nX The value of the x component of the surface normal.
	 * @param nY The value of the y component of the surface normal.
	 * @param res The extraction parameter object.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Vec2dC> T reflect(double x, double y, double nX, double nY, @ExtractParam T res)
	{
		double dot = -2 * Math.fma(x, nX, y * nY);
		
		res.set(Math.fma(nX, dot, x), Math.fma(nY, dot, y));
		
		return res;
	}
	
	/**
	 * Calculates the reflection of the vector (x, y) based on the given surface normal (nX, nY).
	 * The surface normal has to be normalized.
	 * The result is relayed to the functional interface implementation.
	 * 
	 * @param <T> The type of the result object.
	 * 
	 * @param x The value of the x component of the vector.
	 * @param y The value of the y component of the vector.
	 * @param nX The value of the x component of the surface normal.
	 * @param nY The value of the y component of the surface normal.
	 * @param func A functional interface implementation to take the result.
	 * 
	 * @return The object returned from the functional interface.
	 */
	public static <T> T reflect(double x, double y, double nX, double nY, @ExtractParam DoubleFunction2<T> func)
	{
		double dot = -2 * Math.fma(x, nX, y * nY);
		
		return func.apply(Math.fma(nX, dot, x), Math.fma(nY, dot, y));
	}
	
	/**
	 * Returns the dot product (scalar product) between the first vector (x1, y1) and
	 * the second vector (x2, y2).
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
	public static double[] fastLerp(Tup2dR t1, Tup2dR t2, double alpha, @ExtractParam double[] res)
	{
		return fastLerp(t1.getX(), t1.getY(), t2.getX(), t2.getY(), alpha, res);
	}
	
	/**
	 * Performs a fast linear interpolation between the two vectors t1 and (x2, y2).
	 * This sacrifices for reduced calculations the precision and the applicability.
	 * The interpolation happens over the interpolator value alpha in the range of 0.0 to 1.0
	 * where a value of 0.0 is exacly t1 and a value of 1.0 is aproximatly (x2, y2). As the fast
	 * lerp sacrifices a lot of precision a value of 1.0 will very likely not yield the values of (x2, y2)
	 * but a biased result.
	 * The result is saved in the result array.
	 * 
	 * <p>
	 * Operation:
	 * t1 + ( (x2, y2) - t1 ) * alpha
	 * 
	 * @param t1 The first vector.
	 * @param x2 The value of the x component of the second vector.
	 * @param y2 The value of the y component of the second vector.
	 * @param alpha The interpolator in range of 0.0 to 1.0.
	 * @param res The result array.
	 * 
	 * @return The result array with the result.
	 */
	public static double[] fastLerp(Tup2dR t1, double x2, double y2, double alpha, @ExtractParam double[] res)
	{
		return fastLerp(t1.getX(), t1.getY(), x2, y2, alpha, res);
	}
	
	/**
	 * Performs a fast linear interpolation between the two vectors (x1, y1) and t2.
	 * This sacrifices for reduced calculations the precision and the applicability.
	 * The interpolation happens over the interpolator value alpha in the range of 0.0 to 1.0
	 * where a value of 0.0 is exacly (x1, y1) and a value of 1.0 is aproximatly t2. As the fast
	 * lerp sacrifices a lot of precision a value of 1.0 will very likely not yield the values of t2
	 * but a biased result.
	 * The result is saved in the result array.
	 * 
	 * <p>
	 * Operation:
	 * (x1, y1) + ( t2 - (x1, y1) ) * alpha
	 * 
	 * @param x1 The value of the x component of the first vector.
	 * @param y1 The value of the y component of the first vector.
	 * @param t2 The second vector.
	 * @param alpha The interpolator in range of 0.0 to 1.0.
	 * @param res The result array.
	 * 
	 * @return The result array with the result.
	 */
	public static double[] fastLerp(double x1, double y1, Tup2dR t2, double alpha, @ExtractParam double[] res)
	{
		return fastLerp(x1, y1, t2.getX(), t2.getY(), alpha, res);
	}
	
	/**
	 * Performs a fast linear interpolation between the two vectors (x1, y1) and (x2, y2).
	 * This sacrifices for reduced calculations the precision and the applicability.
	 * The interpolation happens over the interpolator value alpha in the range of 0.0 to 1.0
	 * where a value of 0.0 is exacly (x1, y1) and a value of 1.0 is aproximatly (x2, y2). As the fast
	 * lerp sacrifices a lot of precision a value of 1.0 will very likely not yield the values of (x2, y2)
	 * but a biased result.
	 * The result is saved in the result array.
	 * 
	 * <p>
	 * Operation:
	 * (x1, y1) + ( (x2, y2) - (x1, y1) ) * alpha
	 * 
	 * @param x1 The value of the x component of the first vector.
	 * @param y1 The value of the y component of the first vector.
	 * @param x2 The value of the x component of the second vector.
	 * @param y2 The value of the y component of the second vector.
	 * @param alpha The interpolator in range of 0.0 to 1.0.
	 * @param res The result array.
	 * 
	 * @return The result array with the result.
	 */
	public static double[] fastLerp(double x1, double y1, double x2, double y2, double alpha, @ExtractParam double[] res)
	{
		res[COMP_X] = Math.fma(alpha, x2 - x1, x1);
		res[COMP_Y] = Math.fma(alpha, y2 - y1, y1);
		
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
	public static <T extends Vec2dC> T fastLerp(Tup2dR t1, Tup2dR t2, double alpha, @ExtractParam T res)
	{
		return fastLerp(t1.getX(), t1.getY(), t2.getX(), t2.getY(), alpha, res);
	}
	
	/**
	 * Performs a fast linear interpolation between the two vectors t1 and (x2, y2).
	 * This sacrifices for reduced calculations the precision and the applicability.
	 * The interpolation happens over the interpolator value alpha in the range of 0.0 to 1.0
	 * where a value of 0.0 is exacly t1 and a value of 1.0 is aproximatly (x2, y2). As the fast
	 * lerp sacrifices a lot of precision a value of 1.0 will very likely not yield the values of (x2, y2)
	 * but a biased result.
	 * The result is saved in the extraction parameter object.
	 * 
	 * <p>
	 * Operation:
	 * t1 + ( (x2, y2) - t1 ) * alpha
	 * 
	 * @param t1 The first vector.
	 * @param x2 The value of the x component of the second vector.
	 * @param y2 The value of the y component of the second vector.
	 * @param alpha The interpolator in range of 0.0 to 1.0.
	 * @param res The extraction parameter object.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Vec2dC> T fastLerp(Tup2dR t1, double x2, double y2, double alpha, @ExtractParam T res)
	{
		return fastLerp(t1.getX(), t1.getY(), x2, y2, alpha, res);
	}
	
	/**
	 * Performs a fast linear interpolation between the two vectors (x1, y1) and t2.
	 * This sacrifices for reduced calculations the precision and the applicability.
	 * The interpolation happens over the interpolator value alpha in the range of 0.0 to 1.0
	 * where a value of 0.0 is exacly (x1, y1) and a value of 1.0 is aproximatly t2. As the fast
	 * lerp sacrifices a lot of precision a value of 1.0 will very likely not yield the values of t2
	 * but a biased result.
	 * The result is saved in the extraction parameter object.
	 * 
	 * <p>
	 * Operation:
	 * (x1, y1) + ( t2 - (x1, y1) ) * alpha
	 * 
	 * @param x1 The value of the x component of the first vector.
	 * @param y1 The value of the y component of the first vector.
	 * @param t2 The second vector.
	 * @param alpha The interpolator in range of 0.0 to 1.0.
	 * @param res The extraction parameter object.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Vec2dC> T fastLerp(double x1, double y1, Tup2dR t2, double alpha, @ExtractParam T res)
	{
		return fastLerp(x1, y1, t2.getX(), t2.getY(), alpha, res);
	}
	
	/**
	 * Performs a fast linear interpolation between the two vectors (x1, y1) and (x2, y2).
	 * This sacrifices for reduced calculations the precision and the applicability.
	 * The interpolation happens over the interpolator value alpha in the range of 0.0 to 1.0
	 * where a value of 0.0 is exacly (x1, y1) and a value of 1.0 is aproximatly (x2, y2). As the fast
	 * lerp sacrifices a lot of precision a value of 1.0 will very likely not yield the values of (x2, y2)
	 * but a biased result.
	 * The result is saved in the extraction parameter object.
	 * 
	 * <p>
	 * Operation:
	 * (x1, y1) + ( (x2, y2) - (x1, y1) ) * alpha
	 * 
	 * @param x1 The value of the x component of the first vector.
	 * @param y1 The value of the y component of the first vector.
	 * @param x2 The value of the x component of the second vector.
	 * @param y2 The value of the y component of the second vector.
	 * @param alpha The interpolator in range of 0.0 to 1.0.
	 * @param res The extraction parameter object.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Vec2dC> T fastLerp(double x1, double y1, double x2, double y2, double alpha, @ExtractParam T res)
	{
		res.set(Math.fma(alpha, x2 - x1, x1), Math.fma(alpha, y2 - y1, y1));
		
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
	public static <T> T fastLerp(Tup2dR t1, Tup2dR t2, double alpha, @ExtractParam DoubleFunction2<T> func)
	{
		return fastLerp(t1.getX(), t1.getY(), t2.getX(), t2.getY(), alpha, func);
	}
	
	/**
	 * Performs a fast linear interpolation between the two vectors t1 and (x2, y2).
	 * This sacrifices for reduced calculations the precision and the applicability.
	 * The interpolation happens over the interpolator value alpha in the range of 0.0 to 1.0
	 * where a value of 0.0 is exacly t1 and a value of 1.0 is aproximatly (x2, y2). As the fast
	 * lerp sacrifices a lot of precision a value of 1.0 will very likely not yield the values of (x2, y2)
	 * but a biased result.
	 * The result is relayed to the functional interface implementation.
	 * 
	 * <p>
	 * Operation:
	 * t1 + ( (x2, y2) - t1 ) * alpha
	 * 
	 * @param t1 The first vector.
	 * @param x2 The value of the x component of the second vector.
	 * @param y2 The value of the y component of the second vector.
	 * @param alpha The interpolator in range of 0.0 to 1.0.
	 * @param func A functional interface implementation to take the result.
	 * 
	 * @return The object returned from the functional interface.
	 */
	public static <T> T fastLerp(Tup2dR t1, double x2, double y2, double alpha, @ExtractParam DoubleFunction2<T> func)
	{
		return fastLerp(t1.getX(), t1.getY(), x2, y2, alpha, func);
	}
	
	/**
	 * Performs a fast linear interpolation between the two vectors (x1, y1) and t2.
	 * This sacrifices for reduced calculations the precision and the applicability.
	 * The interpolation happens over the interpolator value alpha in the range of 0.0 to 1.0
	 * where a value of 0.0 is exacly (x1, y1) and a value of 1.0 is aproximatly t2. As the fast
	 * lerp sacrifices a lot of precision a value of 1.0 will very likely not yield the values of t2
	 * but a biased result.
	 * The result is relayed to the functional interface implementation.
	 * 
	 * <p>
	 * Operation:
	 * (x1, y1) + ( t2 - (x1, y1) ) * alpha
	 * 
	 * @param x1 The value of the x component of the first vector.
	 * @param y1 The value of the y component of the first vector.
	 * @param t2 The second vector.
	 * @param alpha The interpolator in range of 0.0 to 1.0.
	 * @param func A functional interface implementation to take the result.
	 * 
	 * @return The object returned from the functional interface.
	 */
	public static <T> T fastLerp(double x1, double y1, Tup2dR t2, double alpha, @ExtractParam DoubleFunction2<T> func)
	{
		return fastLerp(x1, y1, t2.getX(), t2.getY(), alpha, func);
	}
	
	/**
	 * Performs a fast linear interpolation between the two vectors (x1, y1) and (x2, y2).
	 * This sacrifices for reduced calculations the precision and the applicability.
	 * The interpolation happens over the interpolator value alpha in the range of 0.0 to 1.0
	 * where a value of 0.0 is exacly (x1, y1) and a value of 1.0 is aproximatly (x2, y2). As the fast
	 * lerp sacrifices a lot of precision a value of 1.0 will very likely not yield the values of (x2, y2)
	 * but a biased result.
	 * The result is relayed to the functional interface implementation.
	 * 
	 * <p>
	 * Operation:
	 * (x1, y1) + ( (x2, y2) - (x1, y1) ) * alpha
	 * 
	 * @param x1 The value of the x component of the first vector.
	 * @param y1 The value of the y component of the first vector.
	 * @param x2 The value of the x component of the second vector.
	 * @param y2 The value of the y component of the second vector.
	 * @param alpha The interpolator in range of 0.0 to 1.0.
	 * @param func A functional interface implementation to take the result.
	 * 
	 * @return The object returned from the functional interface.
	 */
	public static <T> T fastLerp(double x1, double y1, double x2, double y2, double alpha, @ExtractParam DoubleFunction2<T> func)
	{
		return func.apply(Math.fma(alpha, x2 - x1, x1), Math.fma(alpha, y2 - y1, y1));
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
	public static double[] lerp(Tup2dR t1, Tup2dR t2, double alpha, @ExtractParam double[] res)
	{
		return lerp(t1.getX(), t1.getY(), t2.getX(), t2.getY(), alpha, res);
	}
	
	/**
	 * Performs a linear interpolation between the two vectors t1 and (x2, y2).
	 * The interpolation happens over the interpolator value alpha in the range of 0.0 to 1.0
	 * where a value of 0.0 is exacly t1 and a value of 1.0 is exactly (x2, y2).
	 * The result is saved in the result array.
	 * 
	 * <p>
	 * Operation:
	 * (1.0 - alpha) * t1 + alpha * (x2, y2)
	 * 
	 * @param t1 The first vector.
	 * @param x2 The value of the x component of the second vector.
	 * @param y2 The value of the y component of the second vector.
	 * @param alpha The interpolator in range of 0.0 to 1.0.
	 * @param res The result array.
	 * 
	 * @return The result array with the result.
	 */
	public static double[] lerp(Tup2dR t1, double x2, double y2, double alpha, @ExtractParam double[] res)
	{
		return lerp(t1.getX(), t1.getY(), x2, y2, alpha, res);
	}
	
	/**
	 * Performs a linear interpolation between the two vectors (x1, y1) and t2.
	 * The interpolation happens over the interpolator value alpha in the range of 0.0 to 1.0
	 * where a value of 0.0 is exacly (x1, y1) and a value of 1.0 is exactly t2.
	 * The result is saved in the result array.
	 * 
	 * <p>
	 * Operation:
	 * (1.0 - alpha) * (x1, y1) + alpha * t2
	 * 
	 * @param x1 The value of the x component of the first vector.
	 * @param y1 The value of the y component of the first vector.
	 * @param t2 The second vector.
	 * @param alpha The interpolator in range of 0.0 to 1.0.
	 * @param res The result array.
	 * 
	 * @return The result array with the result.
	 */
	public static double[] lerp(double x1, double y1, Tup2dR t2, double alpha, @ExtractParam double[] res)
	{
		return lerp(x1, y1, t2.getX(), t2.getY(), alpha, res);
	}
	
	/**
	 * Performs a linear interpolation between the two vectors (x1, y1) and (x2, y2).
	 * The interpolation happens over the interpolator value alpha in the range of 0.0 to 1.0
	 * where a value of 0.0 is exacly (x1, y1) and a value of 1.0 is exactly (x2, y2).
	 * The result is saved in the result array.
	 * 
	 * <p>
	 * Operation:
	 * (1.0 - alpha) * (x1, y1) + alpha * (x2, y2)
	 * 
	 * @param x1 The value of the x component of the first vector.
	 * @param y1 The value of the y component of the first vector.
	 * @param x2 The value of the x component of the second vector.
	 * @param y2 The value of the y component of the second vector.
	 * @param alpha The interpolator in range of 0.0 to 1.0.
	 * @param res The result array.
	 * 
	 * @return The result array with the result.
	 */
	public static double[] lerp(double x1, double y1, double x2, double y2, double alpha, @ExtractParam double[] res)
	{
		res[COMP_X] = Math.fma(1.0 - alpha, x1, alpha * x2);
		res[COMP_Y] = Math.fma(1.0 - alpha, y1, alpha * y2);
		
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
	public static <T extends Vec2dC> T lerp(Tup2dR t1, Tup2dR t2, double alpha, @ExtractParam T res)
	{
		return lerp(t1.getX(), t1.getY(), t2.getX(), t2.getY(), alpha, res);
	}
	
	/**
	 * Performs a linear interpolation between the two vectors t1 and (x2, y2).
	 * The interpolation happens over the interpolator value alpha in the range of 0.0 to 1.0
	 * where a value of 0.0 is exacly t1 and a value of 1.0 is exactly (x2, y2).
	 * The result is saved in the extraction parameter object.
	 * 
	 * <p>
	 * Operation:
	 * (1.0 - alpha) * t1 + alpha * (x2, y2)
	 * 
	 * @param t1 The first vector.
	 * @param x2 The value of the x component of the second vector.
	 * @param y2 The value of the y component of the second vector.
	 * @param alpha The interpolator in range of 0.0 to 1.0.
	 * @param res The extraction parameter object.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Vec2dC> T lerp(Tup2dR t1, double x2, double y2, double alpha, @ExtractParam T res)
	{
		return lerp(t1.getX(), t1.getY(), x2, y2, alpha, res);
	}
	
	/**
	 * Performs a linear interpolation between the two vectors (x1, y1) and t2.
	 * The interpolation happens over the interpolator value alpha in the range of 0.0 to 1.0
	 * where a value of 0.0 is exacly (x1, y1) and a value of 1.0 is exactly t2.
	 * The result is saved in the extraction parameter object.
	 * 
	 * <p>
	 * Operation:
	 * (1.0 - alpha) * (x1, y1) + alpha * t2
	 * 
	 * @param x1 The value of the x component of the first vector.
	 * @param y1 The value of the y component of the first vector.
	 * @param t2 The second vector.
	 * @param alpha The interpolator in range of 0.0 to 1.0.
	 * @param res The extraction parameter object.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Vec2dC> T lerp(double x1, double y1, Tup2dR t2, double alpha, @ExtractParam T res)
	{
		return lerp(x1, y1, t2.getX(), t2.getY(), alpha, res);
	}
	
	/**
	 * Performs a linear interpolation between the two vectors (x1, y1) and (x2, y2).
	 * The interpolation happens over the interpolator value alpha in the range of 0.0 to 1.0
	 * where a value of 0.0 is exacly (x1, y1) and a value of 1.0 is exactly (x2, y2).
	 * The result is saved in the extraction parameter object.
	 * 
	 * <p>
	 * Operation:
	 * (1.0 - alpha) * (x1, y1) + alpha * (x2, y2)
	 * 
	 * @param x1 The value of the x component of the first vector.
	 * @param y1 The value of the y component of the first vector.
	 * @param x2 The value of the x component of the second vector.
	 * @param y2 The value of the y component of the second vector.
	 * @param alpha The interpolator in range of 0.0 to 1.0.
	 * @param res The extraction parameter object.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Vec2dC> T lerp(double x1, double y1, double x2, double y2, double alpha, @ExtractParam T res)
	{
		res.set(Math.fma(1.0 - alpha, x1, alpha * x2), Math.fma(1.0 - alpha, y1, alpha * y2));
		
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
	public static <T> T lerp(Tup2dR t1, Tup2dR t2, double alpha, @ExtractParam DoubleFunction2<T> func)
	{
		return lerp(t1.getX(), t1.getY(), t2.getX(), t2.getY(), alpha, func);
	}
	
	/**
	 * Performs a linear interpolation between the two vectors t1 and (x2, y2).
	 * The interpolation happens over the interpolator value alpha in the range of 0.0 to 1.0
	 * where a value of 0.0 is exacly t1 and a value of 1.0 is exactly (x2, y2).
	 * The result is relayed to the functional interface implementation.
	 * 
	 * <p>
	 * Operation:
	 * (1.0 - alpha) * t1 + alpha * (x2, y2)
	 * 
	 * @param t1 The first vector.
	 * @param x2 The value of the x component of the second vector.
	 * @param y2 The value of the y component of the second vector.
	 * @param alpha The interpolator in range of 0.0 to 1.0.
	 * @param func A functional interface implementation to take the result.
	 * 
	 * @return The object returned from the functional interface.
	 */
	public static <T> T lerp(Tup2dR t1, double x2, double y2, double alpha, @ExtractParam DoubleFunction2<T> func)
	{
		return lerp(t1.getX(), t1.getY(), x2, y2, alpha, func);
	}
	
	/**
	 * Performs a linear interpolation between the two vectors (x1, y1) and t2.
	 * The interpolation happens over the interpolator value alpha in the range of 0.0 to 1.0
	 * where a value of 0.0 is exacly (x1, y1) and a value of 1.0 is exactly t2.
	 * The result is relayed to the functional interface implementation.
	 * 
	 * <p>
	 * Operation:
	 * (1.0 - alpha) * (x1, y1) + alpha * t2
	 * 
	 * @param x1 The value of the x component of the first vector.
	 * @param y1 The value of the y component of the first vector.
	 * @param t2 The second vector.
	 * @param alpha The interpolator in range of 0.0 to 1.0.
	 * @param func A functional interface implementation to take the result.
	 * 
	 * @return The object returned from the functional interface.
	 */
	public static <T> T lerp(double x1, double y1, Tup2dR t2, double alpha, @ExtractParam DoubleFunction2<T> func)
	{
		return lerp(x1, y1, t2.getX(), t2.getY(), alpha, func);
	}
	
	/**
	 * Performs a linear interpolation between the two vectors (x1, y1) and (x2, y2).
	 * The interpolation happens over the interpolator value alpha in the range of 0.0 to 1.0
	 * where a value of 0.0 is exacly (x1, y1) and a value of 1.0 is exactly (x2, y2).
	 * The result is relayed to the functional interface implementation.
	 * 
	 * <p>
	 * Operation:
	 * (1.0 - alpha) * (x1, y1) + alpha * (x2, y2)
	 * 
	 * @param x1 The value of the x component of the first vector.
	 * @param y1 The value of the y component of the first vector.
	 * @param x2 The value of the x component of the second vector.
	 * @param y2 The value of the y component of the second vector.
	 * @param alpha The interpolator in range of 0.0 to 1.0.
	 * @param func A functional interface implementation to take the result.
	 * 
	 * @return The object returned from the functional interface.
	 */
	public static <T> T lerp(double x1, double y1, double x2, double y2, double alpha, @ExtractParam DoubleFunction2<T> func)
	{
		return func.apply(Math.fma(alpha, x2 - x1, x1), Math.fma(alpha, y2 - y1, y1));
	}
}
