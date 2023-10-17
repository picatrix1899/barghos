package org.barghos.math.api.vector;

import org.barghos.annotation.ExtractionParam;
import org.barghos.annotation.FloatMinValue;
import org.barghos.annotation.MinLength;
import org.barghos.core.function.FloatBiFunction;
import org.barghos.core.math.BarghosMath;
import org.barghos.core.math.FloatRoundMethod;
import org.barghos.core.math.MathProvider;
import org.barghos.core.tuple.Tup2fC;
import org.barghos.core.tuple.Tup2fR;
import org.barghos.core.util.collection.FloatIndexValuePair;

/**
 * This class provides utilities for working with 2-dimensional float vectors.
 */
public class Vec2fUtils
{
	/**
	 * Adds the second vector {@code (v2)} to the first vector {@code (v1)} and saves the result in
	 * the given extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 + v2}
	 * 
	 * @param v1
	 *     The first vector.
	 * @param v2
	 *     The second vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] add(Tup2fR v1, Tup2fR v2, @ExtractionParam @MinLength(2) float[] res)
	{
		return add(v1.v0(), v1.v1(), v2.v0(), v2.v1(), res);
	}
	
	/**
	 * Adds the second vector {@code (v2[0], v2[1])} to the first vector {@code (v1)} and saves the
	 * result in the given extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 + (v2[0], v2[1])}
	 * 
	 * @param v1
	 *     The first vector.
	 * @param v2
	 *     The second vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] add(Tup2fR v1, @MinLength(2) float[] v2, @ExtractionParam @MinLength(2) float[] res)
	{
		return add(v1.v0(), v1.v1(), v2[0], v2[1], res);
	}
	
	/**
	 * Adds the second vector {@code (v2x, v2y)} to the first vector {@code (v1)} and saves the
	 * result in the given extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 + (v2x, v2y)}
	 * 
	 * @param v1
	 *     The first vector.
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] add(Tup2fR v1, float v2x, float v2y, @ExtractionParam @MinLength(2) float[] res)
	{
		return add(v1.v0(), v1.v1(), v2x, v2y, res);
	}
	
	/**
	 * Adds the second vector {@code (v2)} to the first vector {@code (v1[0], v1[1])} and saves the
	 * result in the given extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1]) + v2}
	 * 
	 * @param v1
	 *     The first vector as an array with at least two entries.
	 * @param v2
	 *     The second vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] add(@MinLength(2) float[] v1, Tup2fR v2, @ExtractionParam @MinLength(2) float[] res)
	{
		return add(v1[0], v1[1], v2.v0(), v2.v1(), res);
	}
	
	/**
	 * Adds the second vector {@code (v2[0], v2[1])} to the first vector {@code (v1[0], v1[1])} and
	 * saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1]) + (v2[0], v2[1])}
	 * 
	 * @param v1
	 *     The first vector as an array with at least two entries.
	 * @param v2
	 *     The second vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] add(@MinLength(2) float[] v1, @MinLength(2) float[] v2,
			@ExtractionParam @MinLength(2) float[] res)
	{
		return add(v1[0], v1[1], v2[0], v2[1], res);
	}
	
	/**
	 * Adds the second vector {@code (v2x, v2y)} to the first vector {@code (v1[0], v1[1])} and
	 * saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1]) + (v2x, v2y)}
	 * 
	 * @param v1
	 *     The first vector as an array with at least two entries.
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] add(@MinLength(2) float[] v1, float v2x, float v2y,
			@ExtractionParam @MinLength(2) float[] res)
	{
		return add(v1[0], v1[1], v2x, v2y, res);
	}
	
	/**
	 * Adds the second vector {@code (v2)} to the first vector {@code (v1x, v1y)} and saves the
	 * result in the given extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y) + v2}
	 * 
	 * @param v1x
	 *     The value of the x component of the first vector.
	 * @param v1y
	 *     The value of the y component of the first vector.
	 * @param v2
	 *     The second vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] add(float v1x, float v1y, Tup2fR v2, @ExtractionParam @MinLength(2) float[] res)
	{
		return add(v1x, v1y, v2.v0(), v2.v1(), res);
	}
	
	/**
	 * Adds the second vector {@code (v2[0], v2[1])} to the first vector {@code (v1x, v1y)} and
	 * saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y) + (v2[0], v2[1])}
	 * 
	 * @param v1x
	 *     The value of the x component of the first vector.
	 * @param v1y
	 *     The value of the y component of the first vector.
	 * @param v2
	 *     The second vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] add(float v1x, float v1y, @MinLength(2) float[] v2,
			@ExtractionParam @MinLength(2) float[] res)
	{
		return add(v1x, v1y, v2[0], v2[1], res);
	}
	
	/**
	 * Adds the second vector {@code (v2x, v2y)} to the first vector {@code (v1x, v1y)} and saves
	 * the result in the given extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y) + (v2x, v2y)}
	 * 
	 * @param v1x
	 *     The value of the x component of the first vector.
	 * @param v1y
	 *     The value of the y component of the first vector.
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] add(float v1x, float v1y, float v2x, float v2y, @ExtractionParam @MinLength(2) float[] res)
	{
		res[0] = v1x + v2x;
		res[1] = v1y + v2y;
		
		return res;
	}
	
	/**
	 * Adds the second vector {@code (v2)} to the first vector {@code (v1)} and saves the result in
	 * the given extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 + v2}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1
	 *     The first vector.
	 * @param v2
	 *     The second vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T add(Tup2fR v1, Tup2fR v2, @ExtractionParam T res)
	{
		return add(v1.v0(), v1.v1(), v2.v0(), v2.v1(), res);
	}
	
	/**
	 * Adds the second vector {@code (v2[0], v2[1])} to the first vector {@code (v1)} and saves the
	 * result in the given extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 + (v2[0], v2[1])}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1
	 *     The first vector.
	 * @param v2
	 *     The second vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T add(Tup2fR v1, @MinLength(2) float[] v2, @ExtractionParam T res)
	{
		return add(v1.v0(), v1.v1(), v2[0], v2[1], res);
	}
	
	/**
	 * Adds the second vector {@code (v2x, v2y)} to the first vector {@code (v1)} and saves the
	 * result in the given extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 + (v2x, v2y)}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1
	 *     The first vector.
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T add(Tup2fR v1, float v2x, float v2y, @ExtractionParam T res)
	{
		return add(v1.v0(), v1.v1(), v2x, v2y, res);
	}
	
	/**
	 * Adds the second vector {@code (v2)} to the first vector {@code (v1[0], v1[1])} and saves the
	 * result in the given extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1]) + v2}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1
	 *     The first vector as an array with at least two entries.
	 * @param v2
	 *     The second vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T add(@MinLength(2) float[] v1, Tup2fR v2, @ExtractionParam T res)
	{
		return add(v1[0], v1[1], v2.v0(), v2.v1(), res);
	}
	
	/**
	 * Adds the second vector {@code (v2[0], v2[1])} to the first vector {@code (v1[0], v1[1])} and
	 * saves the result in the given extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1]) + (v2[0], v2[1])}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1
	 *     The first vector as an array with at least two entries.
	 * @param v2
	 *     The second vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T add(@MinLength(2) float[] v1, @MinLength(2) float[] v2, @ExtractionParam T res)
	{
		return add(v1[0], v1[1], v2[0], v2[1], res);
	}
	
	/**
	 * Adds the second vector {@code (v2x, v2y)} to the first vector {@code (v1[0], v1[1])} and
	 * saves the result in the given extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1]) + (v2x, v2y)}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1
	 *     The first vector as an array with at least two entries.
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T add(@MinLength(2) float[] v1, float v2x, float v2y, @ExtractionParam T res)
	{
		return add(v1[0], v1[1], v2x, v2y, res);
	}
	
	/**
	 * Adds the second vector {@code (v2)} to the first vector {@code (v1x, v1y)} and saves the
	 * result in the given extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y) + v2}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1x
	 *     The value of the x component of the first vector.
	 * @param v1y
	 *     The value of the y component of the first vector.
	 * @param v2
	 *     The second vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T add(float v1x, float v1y, Tup2fR v2, @ExtractionParam T res)
	{
		return add(v1x, v1y, v2.v0(), v2.v1(), res);
	}
	
	/**
	 * Adds the second vector {@code (v2[0], v2[1])} to the first vector {@code (v1x, v1y)} and
	 * saves the result in the given extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y) + (v2[0], v2[1])}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1x
	 *     The value of the x component of the first vector.
	 * @param v1y
	 *     The value of the y component of the first vector.
	 * @param v2
	 *     The second vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T add(float v1x, float v1y, @MinLength(2) float[] v2, @ExtractionParam T res)
	{
		return add(v1x, v1y, v2[0], v2[1], res);
	}
	
	/**
	 * Adds the second vector {@code (v2x, v2y)} to the first vector {@code (v1x, v1y)} and saves
	 * the result in the given extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y) + (v2x, v2y)}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1x
	 *     The value of the x component of the first vector.
	 * @param v1y
	 *     The value of the y component of the first vector.
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T add(float v1x, float v1y, float v2x, float v2y, @ExtractionParam T res)
	{
		res.set(v1x + v2x, v1y + v2y);
		
		return res;
	}
	
	/**
	 * Adds the second vector {@code (v2)} to the first vector {@code (v1)}, supplies the result to
	 * the given implementation of the functional interface and returns the result of that
	 * implementation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 + v2}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1
	 *     The first vector.
	 * @param v2
	 *     The second vector.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T addFunc(Tup2fR v1, Tup2fR v2, FloatBiFunction<T> res)
	{
		return addFunc(v1.v0(), v1.v1(), v2.v0(), v2.v1(), res);
	}
	
	/**
	 * Adds the second vector {@code (v2[0], v2[1])} to the first vector {@code (v1)}, supplies the
	 * result to the given implementation of the functional interface and returns the result of that
	 * implementation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 + (v2[0], v2[1])}
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v1
	 *     The first vector.
	 * @param v2
	 *     The second vector as an array with at least two entries.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T addFunc(Tup2fR v1, @MinLength(2) float[] v2, FloatBiFunction<T> res)
	{
		return addFunc(v1.v0(), v1.v1(), v2[0], v2[1], res);
	}
	
	/**
	 * Adds the second vector {@code (v2x, v2y)} to the first vector {@code (v1)}, supplies the
	 * result to the given implementation of the functional interface and returns the result of that
	 * implementation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 + (v2x, v2y)}
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v1
	 *     The first vector.
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T addFunc(Tup2fR v1, float v2x, float v2y, FloatBiFunction<T> res)
	{
		return addFunc(v1.v0(), v1.v1(), v2x, v2y, res);
	}
	
	/**
	 * Adds the second vector {@code (v2)} to the first vector {@code (v1[0], v1[1])}, supplies the
	 * result to the given implementation of the functional interface and returns the result of that
	 * implementation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1]) + v2}
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v1
	 *     The first vector as an array with at least two entries.
	 * @param v2
	 *     The second vector.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T addFunc(@MinLength(2) float[] v1, Tup2fR v2, FloatBiFunction<T> res)
	{
		return addFunc(v1[0], v1[1], v2.v0(), v2.v1(), res);
	}
	
	/**
	 * Adds the second vector {@code (v2[0], v2[1])} to the first vector {@code (v1[0], v1[1])},
	 * supplies the result to the given implementation of the functional interface and returns the
	 * result of that implementation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1]) + (v2[0], v2[1])}
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v1
	 *     The first vector as an array with at least two entries.
	 * @param v2
	 *     The second vector as an array with at least two entries.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T addFunc(@MinLength(2) float[] v1, @MinLength(2) float[] v2, FloatBiFunction<T> res)
	{
		return addFunc(v1[0], v1[1], v2[0], v2[1], res);
	}
	
	/**
	 * Adds the second vector {@code (v2x, v2y)} to the first vector {@code (v1[0], v1[1])},
	 * supplies the result to the given implementation of the functional interface and returns the
	 * result of that implementation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1]) + (v2x, v2y)}
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v1
	 *     The first vector as an array with at least two entries.
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T addFunc(@MinLength(2) float[] v1, float v2x, float v2y, FloatBiFunction<T> res)
	{
		return addFunc(v1[0], v1[1], v2x, v2y, res);
	}
	
	/**
	 * Adds the second vector {@code (v2)} to the first vector {@code (v1x, v1y)}, supplies the
	 * result to the given implementation of the functional interface and returns the result of that
	 * implementation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y) + v2}
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v1x
	 *     The value of the x component of the first vector.
	 * @param v1y
	 *     The value of the y component of the first vector.
	 * @param v2
	 *     The second vector.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T addFunc(float v1x, float v1y, Tup2fR v2, FloatBiFunction<T> res)
	{
		return addFunc(v1x, v1y, v2.v0(), v2.v1(), res);
	}
	
	/**
	 * Adds the second vector {@code (v2[0], v2[1])} to the first vector {@code (v1x, v1y)},
	 * supplies the result to the given implementation of the functional interface and returns the
	 * result of that implementation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y) + (v2[0], v2[1])}
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v1x
	 *     The value of the x component of the first vector.
	 * @param v1y
	 *     The value of the y component of the first vector.
	 * @param v2
	 *     The second vector as an array with at least two entries.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T addFunc(float v1x, float v1y, @MinLength(2) float[] v2, FloatBiFunction<T> res)
	{
		return addFunc(v1x, v1y, v2[0], v2[1], res);
	}
	
	/**
	 * Adds the second vector {@code (v2x, v2y)} to the first vector {@code (v1x, v1y)}, supplies
	 * the result to the given implementation of the functional interface and returns the result of
	 * that implementation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y) + (v2x, v2y)}
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v1x
	 *     The value of the x component of the first vector.
	 * @param v1y
	 *     The value of the y component of the first vector.
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T addFunc(float v1x, float v1y, float v2x, float v2y, FloatBiFunction<T> res)
	{
		return res.apply(v1x + v2x, v1y + v2y);
	}
	
	/**
	 * Subtracts the second vector {@code (v2)} from the first vector {@code (v1)} and saves the
	 * result in the given extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 - v2}
	 * 
	 * @param v1
	 *     The first vector.
	 * @param v2
	 *     The second vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] sub(Tup2fR v1, Tup2fR v2, @ExtractionParam @MinLength(2) float[] res)
	{
		return sub(v1.v0(), v1.v1(), v2.v0(), v2.v1(), res);
	}
	
	/**
	 * Subtracts the second vector {@code (v2[0], v2[1])} from the first vector {@code (v1)} and
	 * saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 - (v2x, v2y)}
	 * 
	 * @param v1
	 *     The first vector.
	 * @param v2
	 *     The second vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] sub(Tup2fR v1, @MinLength(2) float[] v2, @ExtractionParam @MinLength(2) float[] res)
	{
		return sub(v1.v0(), v1.v1(), v2[0], v2[1], res);
	}
	
	/**
	 * Subtracts the second vector {@code (v2x, v2y)} from the first vector {@code (v1)} and saves
	 * the result in the given extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 - (v2x, v2y)}
	 * 
	 * @param v1
	 *     The first vector.
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] sub(Tup2fR v1, float v2x, float v2y, @ExtractionParam @MinLength(2) float[] res)
	{
		return sub(v1.v0(), v1.v1(), v2x, v2y, res);
	}
	
	/**
	 * Subtracts the second vector {@code (v2)} from the first vector {@code (v1[0], v1[1])} and
	 * saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1]) - v2}
	 * 
	 * @param v1
	 *     The first vector as an array with at least two entries.
	 * @param v2
	 *     The second vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] sub(@MinLength(2) float[] v1, Tup2fR v2, @ExtractionParam @MinLength(2) float[] res)
	{
		return sub(v1[0], v1[1], v2.v0(), v2.v1(), res);
	}
	
	/**
	 * Subtracts the second vector {@code (v2[0], v2[1])} from the first vector
	 * {@code (v1[0], v1[1])} and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1]) - (v2[0], v2[1])}
	 * 
	 * @param v1
	 *     The first vector as an array with at least two entries.
	 * @param v2
	 *     The second vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] sub(@MinLength(2) float[] v1, @MinLength(2) float[] v2,
			@ExtractionParam @MinLength(2) float[] res)
	{
		return sub(v1[0], v1[1], v2[0], v2[1], res);
	}
	
	/**
	 * Subtracts the second vector {@code (v2x, v2y)} from the first vector {@code (v1[0], v1[1])}
	 * and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1]) - (v2x, v2y)}
	 * 
	 * @param v1
	 *     The first vector as an array with at least two entries.
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] sub(@MinLength(2) float[] v1, float v2x, float v2y,
			@ExtractionParam @MinLength(2) float[] res)
	{
		return sub(v1[0], v1[1], v2x, v2y, res);
	}
	
	/**
	 * Subtracts the second vector {@code (v2)} from the first vector {@code (v1x, v1y)} and saves
	 * the result in the given extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y) - v2}
	 * 
	 * @param v1x
	 *     The value of the x component of the first vector.
	 * @param v1y
	 *     The value of the y component of the first vector.
	 * @param v2
	 *     The second vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] sub(float v1x, float v1y, Tup2fR v2, @ExtractionParam @MinLength(2) float[] res)
	{
		return sub(v1x, v1y, v2.v0(), v2.v1(), res);
	}
	
	/**
	 * Subtracts the second vector {@code (v2[0], v2[1])} from the first vector {@code (v1x, v1y)}
	 * and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y) - (v2[0], v2[1])}
	 * 
	 * @param v1x
	 *     The value of the x component of the first vector.
	 * @param v1y
	 *     The value of the y component of the first vector.
	 * @param v2
	 *     The second vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] sub(float v1x, float v1y, @MinLength(2) float[] v2,
			@ExtractionParam @MinLength(2) float[] res)
	{
		return sub(v1x, v1y, v2[0], v2[1], res);
	}
	
	/**
	 * Subtracts the second vector {@code (v2x, v2y)} from the first vector {@code (v1x, v1y)} and
	 * saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y) - (v2x, v2y)}
	 * 
	 * @param v1x
	 *     The value of the x component of the first vector.
	 * @param v1y
	 *     The value of the y component of the first vector.
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] sub(float v1x, float v1y, float v2x, float v2y, @ExtractionParam @MinLength(2) float[] res)
	{
		res[0] = v1x - v2x;
		res[1] = v1y - v2y;
		
		return res;
	}
	
	/**
	 * Subtracts the second vector [@code (v2)} from the first vector {@code (v1)} and saves the
	 * result in the given extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 - v2}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1
	 *     The first vector.
	 * @param v2
	 *     The second vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T sub(Tup2fR v1, Tup2fR v2, @ExtractionParam T res)
	{
		return sub(v1.v0(), v1.v1(), v2.v0(), v2.v1(), res);
	}
	
	/**
	 * Subtracts the second vector [@code (v2[0], v2[1])} from the first vector {@code (v1)} and
	 * saves the result in the given extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 - (v2[0], v2[1])}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1
	 *     The first vector.
	 * @param v2
	 *     The second vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T sub(Tup2fR v1, @MinLength(2) float[] v2, @ExtractionParam T res)
	{
		return sub(v1.v0(), v1.v1(), v2[0], v2[1], res);
	}
	
	/**
	 * Subtracts the second vector [@code (v2x, v2y)} from the first vector {@code (v1)} and saves
	 * the result in the given extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 - (v2x, v2y)}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1
	 *     The first vector.
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T sub(Tup2fR v1, float v2x, float v2y, @ExtractionParam T res)
	{
		return sub(v1.v0(), v1.v1(), v2x, v2y, res);
	}
	
	/**
	 * Subtracts the second vector [@code (v2)} from the first vector {@code (v1[0], v1[1])} and
	 * saves the result in the given extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1]) - v2}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1
	 *     The first vector as an array with at least two entries.
	 * @param v2
	 *     The second vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T sub(@MinLength(2) float[] v1, Tup2fR v2, @ExtractionParam T res)
	{
		return sub(v1[0], v1[1], v2.v0(), v2.v1(), res);
	}
	
	/**
	 * Subtracts the second vector [@code (v2[0], v2[1])} from the first vector
	 * {@code (v1[0], v1[1])} and saves the result in the given extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1]) - (v2[0], v2[1])}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1
	 *     The first vector as an array with at least two entries.
	 * @param v2
	 *     The second vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T sub(@MinLength(2) float[] v1, @MinLength(2) float[] v2, @ExtractionParam T res)
	{
		return sub(v1[0], v1[1], v2[0], v2[1], res);
	}
	
	/**
	 * Subtracts the second vector [@code (v2x, v2y)} from the first vector {@code (v1[0], v1[1])}
	 * and saves the result in the given extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1]) - (v2x, v2y)}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1
	 *     The first vector as an array with at least two entries.
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T sub(@MinLength(2) float[] v1, float v2x, float v2y, @ExtractionParam T res)
	{
		return sub(v1[0], v1[1], v2x, v2y, res);
	}
	
	/**
	 * Subtracts the second vector [@code (v2)} from the first vector {@code (v1x, v1y)} and saves
	 * the result in the given extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y) - v2}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1x
	 *     The value of the x component of the first vector.
	 * @param v1y
	 *     The value of the y component of the first vector.
	 * @param v2
	 *     The second vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T sub(float v1x, float v1y, Tup2fR v2, @ExtractionParam T res)
	{
		return sub(v1x, v1y, v2.v0(), v2.v1(), res);
	}
	
	/**
	 * Subtracts the second vector [@code (v2[0], v2[1])} from the first vector {@code (v1x, v1y)}
	 * and saves the result in the given extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y) - (v2[0], v2[1])}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1x
	 *     The value of the x component of the first vector.
	 * @param v1y
	 *     The value of the y component of the first vector.
	 * @param v2
	 *     The second vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T sub(float v1x, float v1y, @MinLength(2) float[] v2, @ExtractionParam T res)
	{
		return sub(v1x, v1y, v2[0], v2[1], res);
	}
	
	/**
	 * Subtracts the second vector [@code (v2x, v2y)} from the first vector {@code (v1x, v1y)} and
	 * saves the result in the given extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y) - (v2x, v2y)}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1x
	 *     The value of the x component of the first vector.
	 * @param v1y
	 *     The value of the y component of the first vector.
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T sub(float v1x, float v1y, float v2x, float v2y, @ExtractionParam T res)
	{
		res.set(v1x - v2x, v1y - v2y);
		
		return res;
	}
	
	/**
	 * Subtracts the second vector [@code (v2)} from the first vector {@code (v1)}, supplies the
	 * result to the given implementation of the functional interface and returns the result of that
	 * implementation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 - v2}
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v1
	 *     The first vector.
	 * @param v2
	 *     The second vector.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T subFunc(Tup2fR v1, Tup2fR v2, FloatBiFunction<T> res)
	{
		return subFunc(v1.v0(), v1.v1(), v2.v0(), v2.v1(), res);
	}
	
	/**
	 * Subtracts the second vector [@code (v2[0], v2[1])} from the first vector {@code (v1)},
	 * supplies the result to the given implementation of the functional interface and returns the
	 * result of that implementation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 - (v2[0], v2[1])}
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v1
	 *     The first vector.
	 * @param v2
	 *     The second vector as an array with at least two entries.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T subFunc(Tup2fR v1, @MinLength(2) float[] v2, FloatBiFunction<T> res)
	{
		return subFunc(v1.v0(), v1.v1(), v2[0], v2[1], res);
	}
	
	/**
	 * Subtracts the second vector [@code (v2x, v2y)} from the first vector {@code (v1)}, supplies
	 * the result to the given implementation of the functional interface and returns the result of
	 * that implementation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 - (v2x, v2y)}
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v1
	 *     The first vector.
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T subFunc(Tup2fR v1, float v2x, float v2y, FloatBiFunction<T> res)
	{
		return subFunc(v1.v0(), v1.v1(), v2x, v2y, res);
	}
	
	/**
	 * Subtracts the second vector [@code (v2)} from the first vector {@code (v1[0], v1[1])},
	 * supplies the result to the given implementation of the functional interface and returns the
	 * result of that implementation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1]) - v2}
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v1
	 *     The first vector as an array with at least two entries.
	 * @param v2
	 *     The second vector.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T subFunc(@MinLength(2) float[] v1, Tup2fR v2, FloatBiFunction<T> res)
	{
		return subFunc(v1[0], v1[1], v2.v0(), v2.v1(), res);
	}
	
	/**
	 * Subtracts the second vector [@code (v2[0], v2[1])} from the first vector
	 * {@code (v1[0], v1[1])}, supplies the result to the given implementation of the functional
	 * interface and returns the result of that implementation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1]) - (v2[0], v2[1])}
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v1
	 *     The first vector as an array with at least two entries.
	 * @param v2
	 *     The second vector as an array with at least two entries.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T subFunc(@MinLength(2) float[] v1, @MinLength(2) float[] v2, FloatBiFunction<T> res)
	{
		return subFunc(v1[0], v1[1], v2[0], v2[1], res);
	}
	
	/**
	 * Subtracts the second vector [@code (v2x, v2y)} from the first vector {@code (v1[0], v1[1])},
	 * supplies the result to the given implementation of the functional interface and returns the
	 * result of that implementation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1]) - (v2x, v2y)}
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v1
	 *     The first vector as an array with at least two entries.
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T subFunc(@MinLength(2) float[] v1, float v2x, float v2y, FloatBiFunction<T> res)
	{
		return subFunc(v1[0], v1[1], v2x, v2y, res);
	}
	
	/**
	 * Subtracts the second vector [@code (v2)} from the first vector {@code (v1x, v1y)}, supplies
	 * the result to the given implementation of the functional interface and returns the result of
	 * that implementation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y) - v2}
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v1x
	 *     The value of the x component of the first vector.
	 * @param v1y
	 *     The value of the y component of the first vector.
	 * @param v2
	 *     The second vector.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T subFunc(float v1x, float v1y, Tup2fR v2, FloatBiFunction<T> res)
	{
		return subFunc(v1x, v1y, v2.v0(), v2.v1(), res);
	}
	
	/**
	 * Subtracts the second vector [@code (v2[0], v2[1])} from the first vector {@code (v1x, v1y)},
	 * supplies the result to the given implementation of the functional interface and returns the
	 * result of that implementation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y) - (v2[0], v2[1])}
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v1x
	 *     The value of the x component of the first vector.
	 * @param v1y
	 *     The value of the y component of the first vector.
	 * @param v2
	 *     The second vector as an array with at least two entries.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T subFunc(float v1x, float v1y, @MinLength(2) float[] v2, FloatBiFunction<T> res)
	{
		return subFunc(v1x, v1y, v2[0], v2[1], res);
	}
	
	/**
	 * Subtracts the second vector [@code (v2x, v2y)} from the first vector {@code (v1x, v1y)},
	 * supplies the result to the given implementation of the functional interface and returns the
	 * result of that implementation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y) - (v2x, v2y)}
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v1x
	 *     The value of the x component of the first vector.
	 * @param v1y
	 *     The value of the y component of the first vector.
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T subFunc(float v1x, float v1y, float v2x, float v2y, FloatBiFunction<T> res)
	{
		return res.apply(v1x - v2x, v1y - v2y);
	}
	
	/**
	 * Subtracts the first vector {@code (v1)} from the second vector {@code (v2)} and saves the
	 * result in the given extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v2 - v1}
	 * 
	 * @param v1
	 *     The first vector.
	 * @param v2
	 *     The second vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] revSub(Tup2fR v1, Tup2fR v2, @ExtractionParam @MinLength(2) float[] res)
	{
		return revSub(v1.v0(), v1.v1(), v2.v0(), v2.v1(), res);
	}
	
	/**
	 * Subtracts the first vector {@code (v1)} from the second vector {@code (v2[0], v2[1])} and
	 * saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2[0], v2[1]) - v1}
	 * 
	 * @param v1
	 *     The first vector.
	 * @param v2
	 *     The second vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] revSub(Tup2fR v1, @MinLength(2) float[] v2, @ExtractionParam @MinLength(2) float[] res)
	{
		return revSub(v1.v0(), v1.v1(), v2[0], v2[1], res);
	}
	
	/**
	 * Subtracts the first vector {@code (v1)} from the second vector {@code (v2x, v2y)} and saves
	 * the result in the given extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2x, v2y) - v1}
	 * 
	 * @param v1
	 *     The first vector.
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] revSub(Tup2fR v1, float v2x, float v2y, @ExtractionParam @MinLength(2) float[] res)
	{
		return revSub(v1.v0(), v1.v1(), v2x, v2y, res);
	}
	
	/**
	 * Subtracts the first vector {@code (v1[0], v1[1])} from the second vector {@code (v2)} and
	 * saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v2 - (v1[0], v1[1])}
	 * 
	 * @param v1
	 *     The first vector as an array with at least two entries.
	 * @param v2
	 *     second vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] revSub(@MinLength(2) float[] v1, Tup2fR v2, @ExtractionParam @MinLength(2) float[] res)
	{
		return revSub(v1[0], v1[1], v2.v0(), v2.v1(), res);
	}
	
	/**
	 * Subtracts the first vector {@code (v1[0], v1[1])} from the second vector
	 * {@code (v2[0], v2[1])} and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2[0], v2[1]) - (v1[0], v1[1])}
	 * 
	 * @param v1
	 *     The first vector as an array with at least two entries.
	 * @param v2
	 *     second vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] revSub(@MinLength(2) float[] v1, @MinLength(2) float[] v2,
			@ExtractionParam @MinLength(2) float[] res)
	{
		return revSub(v1[0], v1[1], v2[0], v2[1], res);
	}
	
	/**
	 * Subtracts the first vector {@code (v1[0], v1[1])} from the second vector {@code (v2x, v2y)}
	 * and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2x, v2y) - (v1[0], v1[1])}
	 * 
	 * @param v1
	 *     The first vector as an array with at least two entries.
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] revSub(@MinLength(2) float[] v1, float v2x, float v2y,
			@ExtractionParam @MinLength(2) float[] res)
	{
		return revSub(v1[0], v1[1], v2x, v2y, res);
	}
	
	/**
	 * Subtracts the first vector {@code (v1x, v1y)} from the second vector {@code (v2)} and saves
	 * the result in the given extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v2 - (v1x, v1y)}
	 * 
	 * @param v1x
	 *     The value of the x component of the first vector.
	 * @param v1y
	 *     The value of the y component of the first vector.
	 * @param v2
	 *     The second vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] revSub(float v1x, float v1y, Tup2fR v2, @ExtractionParam @MinLength(2) float[] res)
	{
		return revSub(v1x, v1y, v2.v0(), v2.v1(), res);
	}
	
	/**
	 * Subtracts the first vector {@code (v1x, v1y)} from the second vector {@code (v2[0], v2[1])}
	 * and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2[0], v2[1]) - (v1x, v1y)}
	 * 
	 * @param v1x
	 *     The value of the x component of the first vector.
	 * @param v1y
	 *     The value of the y component of the first vector.
	 * @param v2
	 *     The second vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] revSub(float v1x, float v1y, @MinLength(2) float[] v2,
			@ExtractionParam @MinLength(2) float[] res)
	{
		return revSub(v1x, v1y, v2[0], v2[1], res);
	}
	
	/**
	 * Subtracts the first vector {@code (v1x, v1y)} from the second vector {@code (v2x, v2y)} and
	 * saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2x, v2y) - (v1x, v1y)}
	 * 
	 * @param v1x
	 *     The value of the x component of the first vector.
	 * @param v1y
	 *     The value of the y component of the first vector.
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] revSub(float v1x, float v1y, float v2x, float v2y, @ExtractionParam @MinLength(2) float[] res)
	{
		res[0] = v2x - v1x;
		res[1] = v2y - v1y;
		
		return res;
	}
	
	/**
	 * Subtracts the first vector {@code (v1)} from the second vector {@code (v2)} and saves the
	 * result in the given extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v2 - v1}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1
	 *     The first vector.
	 * @param v2
	 *     The second vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T revSub(Tup2fR v1, Tup2fR v2, @ExtractionParam T res)
	{
		return revSub(v1.v0(), v1.v1(), v2.v0(), v2.v1(), res);
	}
	
	/**
	 * Subtracts the first vector {@code (v1)} from the second vector {@code (v2[0], v2[1])} and
	 * saves the result in the given extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2[0], v2[1]) - v1}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1
	 *     The first vector.
	 * @param v2
	 *     The second vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T revSub(Tup2fR v1, @MinLength(2) float[] v2, @ExtractionParam T res)
	{
		return revSub(v1.v0(), v1.v1(), v2[0], v2[1], res);
	}
	
	/**
	 * Subtracts the first vector {@code (v1)} from the second vector {@code (v2x, v2y)} and saves
	 * the result in the given extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2x, v2y) - v1}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1
	 *     The first vector.
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T revSub(Tup2fR v1, float v2x, float v2y, @ExtractionParam T res)
	{
		return revSub(v1.v0(), v1.v1(), v2x, v2y, res);
	}
	
	/**
	 * Subtracts the first vector {@code (v1[0], v1[1])} from the second vector {@code (v2)} and
	 * saves the result in the given extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v2 - (v1[0], v1[1])}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1
	 *     The first vector as an array with at least two entries.
	 * @param v2
	 *     The second vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T revSub(@MinLength(2) float[] v1, Tup2fR v2, @ExtractionParam T res)
	{
		return revSub(v1[0], v1[1], v2.v0(), v2.v1(), res);
	}
	
	/**
	 * Subtracts the first vector {@code (v1[0], v1[1])} from the second vector
	 * {@code (v2[0], v2[1])} and saves the result in the given extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2[0], v2[1]) - (v1[0], v1[1])}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1
	 *     The first vector as an array with at least two entries.
	 * @param v2
	 *     The second vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T revSub(@MinLength(2) float[] v1, @MinLength(2) float[] v2,
			@ExtractionParam T res)
	{
		return revSub(v1[0], v1[1], v2[0], v2[1], res);
	}
	
	/**
	 * Subtracts the first vector {@code (v1[0], v1[1])} from the second vector {@code (v2x, v2y)}
	 * and saves the result in the given extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2x, v2y) - (v1[0], v1[1])}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1
	 *     The first vector as an array with at least two entries.
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T revSub(@MinLength(2) float[] v1, float v2x, float v2y, @ExtractionParam T res)
	{
		return revSub(v1[0], v1[1], v2x, v2y, res);
	}
	
	/**
	 * Subtracts the first vector {@code (v1x, v1y)} from the second vector {@code (v2)} and saves
	 * the result in the given extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v2 - (v1x, v1y)}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1x
	 *     The value of the x component of the first vector.
	 * @param v1y
	 *     The value of the y component of the first vector.
	 * @param v2
	 *     The second vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T revSub(float v1x, float v1y, Tup2fR v2, @ExtractionParam T res)
	{
		return revSub(v1x, v1y, v2.v0(), v2.v1(), res);
	}
	
	/**
	 * Subtracts the first vector {@code (v1x, v1y)} from the second vector {@code (v2[0], v2[1])}
	 * and saves the result in the given extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2[0], v2[1]) - (v1x, v1y)}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1x
	 *     The value of the x component of the first vector.
	 * @param v1y
	 *     The value of the y component of the first vector.
	 * @param v2
	 *     The second vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T revSub(float v1x, float v1y, @MinLength(2) float[] v2, @ExtractionParam T res)
	{
		return revSub(v1x, v1y, v2[0], v2[1], res);
	}
	
	/**
	 * Subtracts the first vector {@code (v1x, v1y)} from the second vector {@code (v2x, v2y)} and
	 * saves the result in the given extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2x, v2y) - (v1x, v1y)}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1x
	 *     The value of the x component of the first vector.
	 * @param v1y
	 *     The value of the y component of the first vector.
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T revSub(float v1x, float v1y, float v2x, float v2y, @ExtractionParam T res)
	{
		res.set(v2x - v1x, v2y - v1y);
		
		return res;
	}
	
	/**
	 * Subtracts the first vector {@code (v1)} from the second vector {@code (v2)}, supplies the
	 * result to the given implementation of the functional interface and returns the result of that
	 * implementation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v2 - v1}
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v1
	 *     The first vector.
	 * @param v2
	 *     The second vector.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T revSubFunc(Tup2fR v1, Tup2fR v2, FloatBiFunction<T> res)
	{
		return revSubFunc(v1.v0(), v1.v1(), v2.v0(), v2.v1(), res);
	}
	
	/**
	 * Subtracts the first vector {@code (v1)} from the second vector {@code (v2[0], v2[1])},
	 * supplies the result to the given implementation of the functional interface and returns the
	 * result of that implementation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2[0], v2[1]) - v1}
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v1
	 *     The first vector.
	 * @param v2
	 *     The second vector as an array with at least two entries.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T revSubFunc(Tup2fR v1, @MinLength(2) float[] v2, FloatBiFunction<T> res)
	{
		return revSubFunc(v1.v0(), v1.v1(), v2[0], v2[1], res);
	}
	
	/**
	 * Subtracts the first vector {@code (v1)} from the second vector {@code (v2x, v2y)}, supplies
	 * the result to the given implementation of the functional interface and returns the result of
	 * that implementation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2x, v2y) - v1}
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v1
	 *     The first vector.
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T revSubFunc(Tup2fR v1, float v2x, float v2y, FloatBiFunction<T> res)
	{
		return revSubFunc(v1.v0(), v1.v1(), v2x, v2y, res);
	}
	
	/**
	 * Subtracts the first vector {@code (v1[0], v1[1])} from the second vector {@code (v2)},
	 * supplies the result to the given implementation of the functional interface and returns the
	 * result of that implementation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v2 - (v1[0], v1[1])}
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v1
	 *     The first vector as an array with at least two entries.
	 * @param v2
	 *     The second vector.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T revSubFunc(@MinLength(2) float[] v1, Tup2fR v2, FloatBiFunction<T> res)
	{
		return revSubFunc(v1[0], v1[1], v2.v0(), v2.v1(), res);
	}
	
	/**
	 * Subtracts the first vector {@code (v1[0], v1[1])} from the second vector
	 * {@code (v2[0], v2[1])}, supplies the result to the given implementation of the functional
	 * interface and returns the result of that implementation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2[0], v2[1]) - (v1[0], v1[1])}
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v1
	 *     The first vector as an array with at least two entries.
	 * @param v2
	 *     The second vector as an array with at least two entries.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T revSubFunc(@MinLength(2) float[] v1, @MinLength(2) float[] v2, FloatBiFunction<T> res)
	{
		return revSubFunc(v1[0], v1[1], v2[0], v2[1], res);
	}
	
	/**
	 * Subtracts the first vector {@code (v1[0], v1[1])} from the second vector {@code (v2x, v2y)},
	 * supplies the result to the given implementation of the functional interface and returns the
	 * result of that implementation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2x, v2y) - (v1[0], v1[1])}
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v1
	 *     The first vector as an array with at least two entries.
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T revSubFunc(@MinLength(2) float[] v1, float v2x, float v2y, FloatBiFunction<T> res)
	{
		return revSubFunc(v1[0], v1[1], v2x, v2y, res);
	}
	
	/**
	 * Subtracts the first vector {@code (v1x, v1y)} from the second vector {@code (v2)}, supplies
	 * the result to the given implementation of the functional interface and returns the result of
	 * that implementation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v2 - (v1x, v1y)}
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v1x
	 *     The value of the x component of the first vector.
	 * @param v1y
	 *     The value of the y component of the first vector.
	 * @param v2
	 *     The second vector.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T revSubFunc(float v1x, float v1y, Tup2fR v2, FloatBiFunction<T> res)
	{
		return revSubFunc(v1x, v1y, v2.v0(), v2.v1(), res);
	}
	
	/**
	 * Subtracts the first vector {@code (v1x, v1y)} from the second vector {@code (v2[0], v2[1])},
	 * supplies the result to the given implementation of the functional interface and returns the
	 * result of that implementation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2[0], v2[1]) - (v1x, v1y)}
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v1x
	 *     The value of the x component of the first vector.
	 * @param v1y
	 *     The value of the y component of the first vector.
	 * @param v2
	 *     The second vector as an array with at least two entries.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T revSubFunc(float v1x, float v1y, @MinLength(2) float[] v2, FloatBiFunction<T> res)
	{
		return revSubFunc(v1x, v1y, v2[0], v2[1], res);
	}
	
	/**
	 * Subtracts the first vector {@code (v1x, v1y)} from the second vector {@code (v2x, v2y)},
	 * supplies the result to the given implementation of the functional interface and returns the
	 * result of that implementation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2x, v2y) - (v1x, v1y)}
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v1x
	 *     The value of the x component of the first vector.
	 * @param v1y
	 *     The value of the y component of the first vector.
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T revSubFunc(float v1x, float v1y, float v2x, float v2y, FloatBiFunction<T> res)
	{
		return res.apply(v2x - v1x, v2y - v1y);
	}
	
	/**
	 * Multiplies the first vector {@code (v1)} with the second vector {@code (v2)} and saves the
	 * result in the given extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1 * v2}
	 * 
	 * @param v1
	 *     The first vector.
	 * @param v2
	 *     The second vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] mul(Tup2fR v1, Tup2fR v2, @ExtractionParam @MinLength(2) float[] res)
	{
		return mul(v1.v0(), v1.v1(), v2.v0(), v2.v1(), res);
	}
	
	/**
	 * Multiplies the first vector {@code (v1)} with the second vector {@code (v2[0], v2[1])} and
	 * saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1 * (v2[0], v2[1])}
	 * 
	 * @param v1
	 *     The first vector.
	 * @param v2
	 *     The second vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] mul(Tup2fR v1, @MinLength(2) float[] v2, @ExtractionParam @MinLength(2) float[] res)
	{
		return mul(v1.v0(), v1.v1(), v2[0], v2[1], res);
	}
	
	/**
	 * Multiplies the first vector {@code (v1)} with the second vector {@code (v2x, v2y)} and saves
	 * the result in the given extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1 * (v2x, v2y)}
	 * 
	 * @param v1
	 *     The first vector.
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] mul(Tup2fR v1, float v2x, float v2y, @ExtractionParam @MinLength(2) float[] res)
	{
		return mul(v1.v0(), v1.v1(), v2x, v2y, res);
	}
	
	/**
	 * Multiplies the first vector {@code (v1[0], v1[1])} with the second vector {@code (v2)} and
	 * saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1]) * (v2x, v2y)}
	 * 
	 * @param v1
	 *     The first vector as an array with at least two entries.
	 * @param v2
	 *     The second vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] mul(@MinLength(2) float[] v1, Tup2fR v2, @ExtractionParam @MinLength(2) float[] res)
	{
		return mul(v1[0], v1[1], v2.v0(), v2.v1(), res);
	}
	
	/**
	 * Multiplies the first vector {@code (v1[0], v1[1])} with the second vector
	 * {@code (v2[0], v2[1])} and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1]) * (v2[0], v2[1])}
	 * 
	 * @param v1
	 *     The first vector as an array with at least two entries.
	 * @param v2
	 *     The second vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] mul(@MinLength(2) float[] v1, @MinLength(2) float[] v2,
			@ExtractionParam @MinLength(2) float[] res)
	{
		return mul(v1[0], v1[1], v2[0], v2[1], res);
	}
	
	/**
	 * Multiplies the first vector {@code (v1[0], v1[1])} with the second vector {@code (v2x, v2y)}
	 * and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1]) * (v2x, v2y)}
	 * 
	 * @param v1
	 *     The first vector as an array with at least two entries.
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] mul(@MinLength(2) float[] v1, float v2x, float v2y,
			@ExtractionParam @MinLength(2) float[] res)
	{
		return mul(v1[0], v1[1], v2x, v2y, res);
	}
	
	/**
	 * Multiplies the first vector {@code (v1x, v1y)} with the second vector {@code (v2)} and saves
	 * the result in the given extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y) * v2}
	 * 
	 * @param v1x
	 *     The value of the x component of the first vector.
	 * @param v1y
	 *     The value of the y component of the first vector.
	 * @param v2
	 *     The second vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] mul(float v1x, float v1y, Tup2fR v2, @ExtractionParam @MinLength(2) float[] res)
	{
		return mul(v1x, v1y, v2.v0(), v2.v1(), res);
	}
	
	/**
	 * Multiplies the first vector {@code (v1x, v1y)} with the second vector {@code (v2[0], v2[1])}
	 * and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y) * (v2[0], v2[1])}
	 * 
	 * @param v1x
	 *     The value of the x component of the first vector.
	 * @param v1y
	 *     The value of the y component of the first vector.
	 * @param v2
	 *     The second vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] mul(float v1x, float v1y, @MinLength(2) float[] v2,
			@ExtractionParam @MinLength(2) float[] res)
	{
		return mul(v1x, v1y, v2[0], v2[1], res);
	}
	
	/**
	 * Multiplies the first vector {@code (v1x, v1y)} with the second vector {@code (v2x, v2y)} and
	 * saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y) * (v2x, v2y)}
	 * 
	 * @param v1x
	 *     The value of the x component of the first vector.
	 * @param v1y
	 *     The value of the y component of the first vector.
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] mul(float v1x, float v1y, float v2x, float v2y, @ExtractionParam @MinLength(2) float[] res)
	{
		res[0] = v1x * v2x;
		res[1] = v1y * v2y;
		
		return res;
	}
	
	/**
	 * Multiplies the first vector {@code (v1)} with the second vector {@code (v2)} and saves the
	 * result in the given extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 * v2}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1
	 *     The first vector.
	 * @param v2
	 *     The second vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T mul(Tup2fR v1, Tup2fR v2, @ExtractionParam T res)
	{
		return mul(v1.v0(), v1.v1(), v2.v0(), v2.v1(), res);
	}
	
	/**
	 * Multiplies the first vector {@code (v1)} with the second vector {@code (v2[0], v2[1])} and
	 * saves the result in the given extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 * (v2[0], v2[1])}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1
	 *     The first vector.
	 * @param v2
	 *     The second vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T mul(Tup2fR v1, @MinLength(2) float[] v2, @ExtractionParam T res)
	{
		return mul(v1.v0(), v1.v1(), v2[0], v2[1], res);
	}
	
	/**
	 * Multiplies the first vector {@code (v1)} with the second vector {@code (v2x, v2y)} and saves
	 * the result in the given extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 * (v2x, v2y)}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1
	 *     The first vector.
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T mul(Tup2fR v1, float v2x, float v2y, @ExtractionParam T res)
	{
		return mul(v1.v0(), v1.v1(), v2x, v2y, res);
	}
	
	/**
	 * Multiplies the first vector {@code (v1[0], v1[1])} with the second vector {@code (v2)} and
	 * saves the result in the given extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1]) * v2}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1
	 *     The first vector as an array with at least two entries.
	 * @param v2
	 *     The second vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T mul(@MinLength(2) float[] v1, Tup2fR v2, @ExtractionParam T res)
	{
		return mul(v1[0], v1[1], v2.v0(), v2.v1(), res);
	}
	
	/**
	 * Multiplies the first vector {@code (v1[0], v1[1])} with the second vector
	 * {@code (v2[0], v2[1])} and saves the result in the given extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1]) * (v2[0], v2[1])}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1
	 *     The first vector as an array with at least two entries.
	 * @param v2
	 *     The second vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T mul(@MinLength(2) float[] v1, @MinLength(2) float[] v2, @ExtractionParam T res)
	{
		return mul(v1[0], v1[1], v2[0], v2[1], res);
	}
	
	/**
	 * Multiplies the first vector {@code (v1[0], v1[1])} with the second vector {@code (v2x, v2y)}
	 * and saves the result in the given extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1]) * (v2x, v2y)}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1
	 *     The first vector as an array with at least two entries.
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T mul(@MinLength(2) float[] v1, float v2x, float v2y, @ExtractionParam T res)
	{
		return mul(v1[0], v1[1], v2x, v2y, res);
	}
	
	/**
	 * Multiplies the first vector {@code (v1x, v1y)} with the second vector {@code (v2)} and saves
	 * the result in the given extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y) * v2}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1x
	 *     The value of the x component of the first vector.
	 * @param v1y
	 *     The value of the y component of the first vector.
	 * @param v2
	 *     The second vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T mul(float v1x, float v1y, Tup2fR v2, @ExtractionParam T res)
	{
		return mul(v1x, v1y, v2.v0(), v2.v1(), res);
	}
	
	/**
	 * Multiplies the first vector {@code (v1x, v1y)} with the second vector {@code (v2[0], v2[1])}
	 * and saves the result in the given extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y) * (v2[0], v2[1])}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1x
	 *     The value of the x component of the first vector.
	 * @param v1y
	 *     The value of the y component of the first vector.
	 * @param v2
	 *     The second vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T mul(float v1x, float v1y, @MinLength(2) float[] v2, @ExtractionParam T res)
	{
		return mul(v1x, v1y, v2[0], v2[1], res);
	}
	
	/**
	 * Multiplies the first vector {@code (v1x, v1y)} with the second vector {@code (v2x, v2y)} and
	 * saves the result in the given extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y) * (v2x, v2y)}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1x
	 *     The value of the x component of the first vector.
	 * @param v1y
	 *     The value of the y component of the first vector.
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T mul(float v1x, float v1y, float v2x, float v2y, @ExtractionParam T res)
	{
		res.set(v1x * v2x, v1y * v2y);
		
		return res;
	}
	
	/**
	 * Multiplies the first vector {@code (v1)} with the second vector {@code (v2)}, supplies the
	 * result to the given implementation of the functional interface and returns the result of that
	 * implementation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 * v2}
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v1
	 *     The first vector.
	 * @param v2
	 *     The second vector.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T mulFunc(Tup2fR v1, Tup2fR v2, FloatBiFunction<T> res)
	{
		return mulFunc(v1.v0(), v1.v1(), v2.v0(), v2.v1(), res);
	}
	
	/**
	 * Multiplies the first vector {@code (v1)} with the second vector {@code (v2[0], v2[1])},
	 * supplies the result to the given implementation of the functional interface and returns the
	 * result of that implementation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 * (v2[0], v2[1])}
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v1
	 *     The first vector.
	 * @param v2
	 *     The second vector as an array with at least two entries.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T mulFunc(Tup2fR v1, @MinLength(2) float[] v2, FloatBiFunction<T> res)
	{
		return mulFunc(v1.v0(), v1.v1(), v2[0], v2[1], res);
	}
	
	/**
	 * Multiplies the first vector {@code (v1)} with the second vector {@code (v2x, v2y)}, supplies
	 * the result to the given implementation of the functional interface and returns the result of
	 * that implementation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 * (v2x, v2y)}
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v1
	 *     The first vector.
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T mulFunc(Tup2fR v1, float v2x, float v2y, FloatBiFunction<T> res)
	{
		return mulFunc(v1.v0(), v1.v1(), v2x, v2y, res);
	}
	
	/**
	 * Multiplies the first vector {@code (v1[0], v1[1])} with the second vector {@code (v2)},
	 * supplies the result to the given implementation of the functional interface and returns the
	 * result of that implementation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1]) * v2}
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v1
	 *     The first vector as an array with at least two entries.
	 * @param v2
	 *     The second vector.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T mulFunc(@MinLength(2) float[] v1, Tup2fR v2, FloatBiFunction<T> res)
	{
		return mulFunc(v1[0], v1[1], v2.v0(), v2.v1(), res);
	}
	
	/**
	 * Multiplies the first vector {@code (v1[0], v1[1])} with the second vector
	 * {@code (v2[0], v2[1])}, supplies the result to the given implementation of the functional
	 * interface and returns the result of that implementation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1]) * (v2[0], v2[1])}
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v1
	 *     The first vector as an array with at least two entries.
	 * @param v2
	 *     The second vector as an array with at least two entries.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T mulFunc(@MinLength(2) float[] v1, @MinLength(2) float[] v2, FloatBiFunction<T> res)
	{
		return mulFunc(v1[0], v1[1], v2[0], v2[1], res);
	}
	
	/**
	 * Multiplies the first vector {@code (v1[0], v1[1])} with the second vector {@code (v2x, v2y)},
	 * supplies the result to the given implementation of the functional interface and returns the
	 * result of that implementation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1]) * (v2x, v2y)}
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v1
	 *     The first vector as an array with at least two entries.
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T mulFunc(@MinLength(2) float[] v1, float v2x, float v2y, FloatBiFunction<T> res)
	{
		return mulFunc(v1[0], v1[1], v2x, v2y, res);
	}
	
	/**
	 * Multiplies the first vector {@code (v1x, v1y)} with the second vector {@code (v2)}, supplies
	 * the result to the given implementation of the functional interface and returns the result of
	 * that implementation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y) * v2}
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v1x
	 *     The value of the x component of the first vector.
	 * @param v1y
	 *     The value of the y component of the first vector.
	 * @param v2
	 *     The second vector.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T mulFunc(float v1x, float v1y, Tup2fR v2, FloatBiFunction<T> res)
	{
		return mulFunc(v1x, v1y, v2.v0(), v2.v1(), res);
	}
	
	/**
	 * Multiplies the first vector {@code (v1x, v1y)} with the second vector {@code (v2[0], v2[1])},
	 * supplies the result to the given implementation of the functional interface and returns the
	 * result of that implementation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y) * (v2[0], v2[1])}
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v1x
	 *     The value of the x component of the first vector.
	 * @param v1y
	 *     The value of the y component of the first vector.
	 * @param v2
	 *     The second vector as an array with at least two entries.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T mulFunc(float v1x, float v1y, @MinLength(2) float[] v2, FloatBiFunction<T> res)
	{
		return mulFunc(v1x, v1y, v2[0], v2[1], res);
	}
	
	/**
	 * Multiplies the first vector {@code (v1x, v1y)} with the second vector {@code (v2x, v2y)},
	 * supplies the result to the given implementation of the functional interface and returns the
	 * result of that implementation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y) * (v2x, v2y)}
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v1x
	 *     The value of the x component of the first vector.
	 * @param v1y
	 *     The value of the y component of the first vector.
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T mulFunc(float v1x, float v1y, float v2x, float v2y, FloatBiFunction<T> res)
	{
		return res.apply(v1x * v2x, v1y * v2y);
	}
	
	/**
	 * Divides the first vector {@code (v1)} by the second vector [@code (v2)} and saves the result
	 * in the given extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 / v2}
	 * 
	 * @param v1
	 *     The first vector.
	 * @param v2
	 *     The second vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] div(Tup2fR v1, Tup2fR v2, @ExtractionParam @MinLength(2) float[] res)
	{
		return div(v1.v0(), v1.v1(), v2.v0(), v2.v1(), res);
	}
	
	/**
	 * Divides the first vector {@code (v1)} by the second vector [@code (v2[0], v2[1])} and saves
	 * the result in the given extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 / (v2[0], v2[1])}
	 * 
	 * @param v1
	 *     The first vector.
	 * @param v2
	 *     The second vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] div(Tup2fR v1, @MinLength(2) float[] v2, @ExtractionParam @MinLength(2) float[] res)
	{
		return div(v1.v0(), v1.v1(), v2[0], v2[1], res);
	}
	
	/**
	 * Divides the first vector {@code (v1)} by the second vector [@code (v2x, v2y)} and saves the
	 * result in the given extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 / (v2x, v2y)}
	 * 
	 * @param v1
	 *     The first vector.
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] div(Tup2fR v1, float v2x, float v2y, @ExtractionParam @MinLength(2) float[] res)
	{
		return div(v1.v0(), v1.v1(), v2x, v2y, res);
	}
	
	/**
	 * Divides the first vector {@code (v1[0], v1[1])} by the second vector [@code (v2)} and saves
	 * the result in the given extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1]) / v2}
	 * 
	 * @param v1
	 *     The first vector as an array with at least two entries.
	 * @param v2
	 *     The second vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] div(@MinLength(2) float[] v1, Tup2fR v2, @ExtractionParam @MinLength(2) float[] res)
	{
		return div(v1[0], v1[1], v2.v0(), v2.v1(), res);
	}
	
	/**
	 * Divides the first vector {@code (v1[0], v1[1])} by the second vector [@code (v2[0], v2[1])}
	 * and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1]) / (v2[0], v2[1])}
	 * 
	 * @param v1
	 *     The first vector as an array with at least two entries.
	 * @param v2
	 *     The second vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] div(@MinLength(2) float[] v1, @MinLength(2) float[] v2,
			@ExtractionParam @MinLength(2) float[] res)
	{
		return div(v1[0], v1[1], v2[0], v2[1], res);
	}
	
	/**
	 * Divides the first vector {@code (v1[0], v1[1])} by the second vector [@code (v2x, v2y)} and
	 * saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1]) / (v2x, v2y)}
	 * 
	 * @param v1
	 *     The first vector as an array with at least two entries.
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] div(@MinLength(2) float[] v1, float v2x, float v2y,
			@ExtractionParam @MinLength(2) float[] res)
	{
		return div(v1[0], v1[1], v2x, v2y, res);
	}
	
	/**
	 * Divides the first vector {@code (v1x, v1y)} by the second vector [@code (v2)} and saves the
	 * result in the given extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y) / v2}
	 * 
	 * @param v1x
	 *     The value of the x component of the first vector.
	 * @param v1y
	 *     The value of the y component of the first vector.
	 * @param v2
	 *     The second vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] div(float v1x, float v1y, Tup2fR v2, @ExtractionParam @MinLength(2) float[] res)
	{
		return div(v1x, v1y, v2.v0(), v2.v1(), res);
	}
	
	/**
	 * Divides the first vector {@code (v1x, v1y)} by the second vector [@code (v2[0], v2[1])} and
	 * saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y) / (v2[0], v2[1])}
	 * 
	 * @param v1x
	 *     The value of the x component of the first vector.
	 * @param v1y
	 *     The value of the y component of the first vector.
	 * @param v2
	 *     The second vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] div(float v1x, float v1y, @MinLength(2) float[] v2,
			@ExtractionParam @MinLength(2) float[] res)
	{
		return div(v1x, v1y, v2[0], v2[1], res);
	}
	
	/**
	 * Divides the first vector {@code (v1x, v1y)} by the second vector [@code (v2x, v2y)} and saves
	 * the result in the given extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y) / (v2x, v2y)}
	 * 
	 * @param v1x
	 *     The value of the x component of the first vector.
	 * @param v1y
	 *     The value of the y component of the first vector.
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] div(float v1x, float v1y, float v2x, float v2y, @ExtractionParam @MinLength(2) float[] res)
	{
		res[0] = v1x / v2x;
		res[1] = v1y / v2y;
		
		return res;
	}
	
	/**
	 * Divides the first vector {@code (v1)} by the second vector [@code (v2)} and saves the result
	 * in the given extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 / v2}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1
	 *     The first vector.
	 * @param v2
	 *     The second vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T div(Tup2fR v1, Tup2fR v2, @ExtractionParam T res)
	{
		return div(v1.v0(), v1.v1(), v2.v0(), v2.v1(), res);
	}
	
	/**
	 * Divides the first vector {@code (v1)} by the second vector [@code (v2[0], v2[1])} and saves
	 * the result in the given extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 / (v2[0], v2[1])}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1
	 *     The first vector.
	 * @param v2
	 *     The second vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T div(Tup2fR v1, @MinLength(2) float[] v2, @ExtractionParam T res)
	{
		return div(v1.v0(), v1.v1(), v2[0], v2[1], res);
	}
	
	/**
	 * Divides the first vector {@code (v1)} by the second vector [@code (v2x, v2y)} and saves the
	 * result in the given extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 / (v2x, v2y)}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1
	 *     The first vector.
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T div(Tup2fR v1, float v2x, float v2y, @ExtractionParam T res)
	{
		return div(v1.v0(), v1.v1(), v2x, v2y, res);
	}
	
	/**
	 * Divides the first vector {@code (v1[0], v1[1])} by the second vector [@code (v2)} and saves
	 * the result in the given extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1]) / v2}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1
	 *     The first vector as an array with at least two entries.
	 * @param v2
	 *     The second vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T div(@MinLength(2) float[] v1, Tup2fR v2, @ExtractionParam T res)
	{
		return div(v1[0], v1[1], v2.v0(), v2.v1(), res);
	}
	
	/**
	 * Divides the first vector {@code (v1[0], v1[1])} by the second vector [@code (v2[0], v2[1])}
	 * and saves the result in the given extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1]) / (v2[0], v2[1])}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1
	 *     The first vector as an array with at least two entries.
	 * @param v2
	 *     The second vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T div(@MinLength(2) float[] v1, @MinLength(2) float[] v2, @ExtractionParam T res)
	{
		return div(v1[0], v1[1], v2[0], v2[1], res);
	}
	
	/**
	 * Divides the first vector {@code (v1[0], v1[1])} by the second vector [@code (v2x, v2y)} and
	 * saves the result in the given extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1]) / (v2x, v2y)}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1
	 *     The first vector as an array with at least two entries.
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T div(@MinLength(2) float[] v1, float v2x, float v2y, @ExtractionParam T res)
	{
		return div(v1[0], v1[1], v2x, v2y, res);
	}
	
	/**
	 * Divides the first vector {@code (v1x, v1y)} by the second vector [@code (v2)} and saves the
	 * result in the given extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y) / v2}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1x
	 *     The value of the x component of the first vector.
	 * @param v1y
	 *     The value of the y component of the first vector.
	 * @param v2
	 *     The second vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T div(float v1x, float v1y, Tup2fR v2, @ExtractionParam T res)
	{
		return div(v1x, v1y, v2.v0(), v2.v1(), res);
	}
	
	/**
	 * Divides the first vector {@code (v1x, v1y)} by the second vector [@code (v2[0], v2[1])} and
	 * saves the result in the given extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y) / (v2[0], v2[1])}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1x
	 *     The value of the x component of the first vector.
	 * @param v1y
	 *     The value of the y component of the first vector.
	 * @param v2
	 *     The second vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T div(float v1x, float v1y, @MinLength(2) float[] v2, @ExtractionParam T res)
	{
		return div(v1x, v1y, v2[0], v2[1], res);
	}
	
	/**
	 * Divides the first vector {@code (v1x, v1y)} by the second vector [@code (v2x, v2y)} and saves
	 * the result in the given extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y) / (v2x, v2y)}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1x
	 *     The value of the x component of the first vector.
	 * @param v1y
	 *     The value of the y component of the first vector.
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T div(float v1x, float v1y, float v2x, float v2y, @ExtractionParam T res)
	{
		res.set(v1x / v2x, v1y / v2y);
		
		return res;
	}
	
	/**
	 * Divides the first vector {@code (v1)} by the second vector [@code (v2)}, supplies the result
	 * to the given implementation of the functional interface and returns the result of that
	 * implementation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 / v2}
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v1
	 *     The first vector.
	 * @param v2
	 *     The second vector.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T divFunc(Tup2fR v1, Tup2fR v2, FloatBiFunction<T> res)
	{
		return divFunc(v1.v0(), v1.v1(), v2.v0(), v2.v1(), res);
	}
	
	/**
	 * Divides the first vector {@code (v1)} by the second vector [@code (v2[0], v2[1])}, supplies
	 * the result to the given implementation of the functional interface and returns the result of
	 * that implementation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 / (v2[0], v2[1])}
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v1
	 *     The first vector.
	 * @param v2
	 *     The second vector as an array with at least two entries.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T divFunc(Tup2fR v1, @MinLength(2) float[] v2, FloatBiFunction<T> res)
	{
		return divFunc(v1.v0(), v1.v1(), v2[0], v2[1], res);
	}
	
	/**
	 * Divides the first vector {@code (v1)} by the second vector [@code (v2x, v2y)}, supplies the
	 * result to the given implementation of the functional interface and returns the result of that
	 * implementation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 / (v2x, v2y)}
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v1
	 *     The first vector.
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T divFunc(Tup2fR v1, float v2x, float v2y, FloatBiFunction<T> res)
	{
		return divFunc(v1.v0(), v1.v1(), v2x, v2y, res);
	}
	
	/**
	 * Divides the first vector {@code (v1[0], v1[1])} by the second vector [@code (v2)}, supplies
	 * the result to the given implementation of the functional interface and returns the result of
	 * that implementation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1]) / v2}
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v1
	 *     The first vector as an array with at least two entries.
	 * @param v2
	 *     The second vector.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T divFunc(@MinLength(2) float[] v1, Tup2fR v2, FloatBiFunction<T> res)
	{
		return divFunc(v1[0], v1[1], v2.v0(), v2.v1(), res);
	}
	
	/**
	 * Divides the first vector {@code (v1[0], v1[1])} by the second vector [@code (v2[0], v2[1])},
	 * supplies the result to the given implementation of the functional interface and returns the
	 * result of that implementation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1]) / (v2[0], v2[1])}
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v1
	 *     The first vector as an array with at least two entries.
	 * @param v2
	 *     The second vector as an array with at least two entries.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T divFunc(@MinLength(2) float[] v1, @MinLength(2) float[] v2, FloatBiFunction<T> res)
	{
		return divFunc(v1[0], v1[1], v2[0], v2[1], res);
	}
	
	/**
	 * Divides the first vector {@code (v1[0], v1[1])} by the second vector [@code (v2x, v2y)},
	 * supplies the result to the given implementation of the functional interface and returns the
	 * result of that implementation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1]) / (v2x, v2y)}
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v1
	 *     The first vector as an array with at least two entries.
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T divFunc(@MinLength(2) float[] v1, float v2x, float v2y, FloatBiFunction<T> res)
	{
		return divFunc(v1[0], v1[1], v2x, v2y, res);
	}
	
	/**
	 * Divides the first vector {@code (v1x, v1y)} by the second vector [@code (v2)}, supplies the
	 * result to the given implementation of the functional interface and returns the result of that
	 * implementation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y) / v2}
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v1x
	 *     The value of the x component of the first vector.
	 * @param v1y
	 *     The value of the y component of the first vector.
	 * @param v2
	 *     The second vector.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T divFunc(float v1x, float v1y, Tup2fR v2, FloatBiFunction<T> res)
	{
		return divFunc(v1x, v1y, v2.v0(), v2.v1(), res);
	}
	
	/**
	 * Divides the first vector {@code (v1x, v1y)} by the second vector [@code (v2[0], v2[1])},
	 * supplies the result to the given implementation of the functional interface and returns the
	 * result of that implementation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y) / (v2[0], v2[1])}
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v1x
	 *     The value of the x component of the first vector.
	 * @param v1y
	 *     The value of the y component of the first vector.
	 * @param v2
	 *     The second vector as an array with at least two entries.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T divFunc(float v1x, float v1y, @MinLength(2) float[] v2, FloatBiFunction<T> res)
	{
		return divFunc(v1x, v1y, v2[0], v2[1], res);
	}
	
	/**
	 * Divides the first vector {@code (v1x, v1y)} by the second vector [@code (v2x, v2y)}, supplies
	 * the result to the given implementation of the functional interface and returns the result of
	 * that implementation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y) / (v2x, v2y)}
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v1x
	 *     The value of the x component of the first vector.
	 * @param v1y
	 *     The value of the y component of the first vector.
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T divFunc(float v1x, float v1y, float v2x, float v2y, FloatBiFunction<T> res)
	{
		return res.apply(v1x / v2x, v1y / v2y);
	}
	
	/**
	 * Divides the second vector {@code (v2)} by the first vector {@code (v1)} and saves the result
	 * in the given extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v2 / v1}
	 * 
	 * @param v1
	 *     The first vector.
	 * @param v2
	 *     The second vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] revDiv(Tup2fR v1, Tup2fR v2, @ExtractionParam @MinLength(2) float[] res)
	{
		return revDiv(v1.v0(), v1.v1(), v2.v0(), v2.v1(), res);
	}
	
	/**
	 * Divides the second vector {@code (v2[0], v2[1])} by the first vector {@code (v1)} and saves
	 * the result in the given extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2[0], v2[1]) / v1}
	 * 
	 * @param v1
	 *     The first vector.
	 * @param v2
	 *     The second vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] revDiv(Tup2fR v1, @MinLength(2) float[] v2, @ExtractionParam @MinLength(2) float[] res)
	{
		return revDiv(v1.v0(), v1.v1(), v2[0], v2[1], res);
	}
	
	/**
	 * Divides the second vector {@code (v2x, v2y)} by the first vector {@code (v1)} and saves the
	 * result in the given extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2x, v2y) / v1}
	 * 
	 * @param v1
	 *     The first vector.
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] revDiv(Tup2fR v1, float v2x, float v2y, @ExtractionParam @MinLength(2) float[] res)
	{
		return revDiv(v1.v0(), v1.v1(), v2x, v2y, res);
	}
	
	/**
	 * Divides the second vector {@code (v2)} by the first vector {@code (v1[0], v1[1])} and saves
	 * the result in the given extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v2 / (v1[0], v1[1])}
	 * 
	 * @param v1
	 *     The first vector as an array with at least two entries.
	 * @param v2
	 *     The second vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] revDiv(@MinLength(2) float[] v1, Tup2fR v2, @ExtractionParam @MinLength(2) float[] res)
	{
		return revDiv(v1[0], v1[1], v2.v0(), v2.v1(), res);
	}
	
	/**
	 * Divides the second vector {@code (v2[0], v2[1])} by the first vector {@code (v1[0], v1[1])}
	 * and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2[0], v2[1]) / (v1[0], v1[1])}
	 * 
	 * @param v1
	 *     The first vector as an array with at least two entries.
	 * @param v2
	 *     The second vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] revDiv(@MinLength(2) float[] v1, @MinLength(2) float[] v2,
			@ExtractionParam @MinLength(2) float[] res)
	{
		return revDiv(v1[0], v1[1], v2[0], v2[1], res);
	}
	
	/**
	 * Divides the second vector {@code (v2x, v2y)} by the first vector {@code (v1[0], v1[1])} and
	 * saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2x, v2y) / (v1[0], v1[1])}
	 * 
	 * @param v1
	 *     The first vector as an array with at least two entries.
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] revDiv(@MinLength(2) float[] v1, float v2x, float v2y,
			@ExtractionParam @MinLength(2) float[] res)
	{
		return revDiv(v1[0], v1[1], v2x, v2y, res);
	}
	
	/**
	 * Divides the second vector {@code (v2)} by the first vector {@code (v1x, v1y)} and saves the
	 * result in the given extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v2 / (v1x, v1y)}
	 * 
	 * @param v1x
	 *     The value of the x component of the first vector.
	 * @param v1y
	 *     The value of the y component of the first vector.
	 * @param v2
	 *     The second vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] revDiv(float v1x, float v1y, Tup2fR v2, @ExtractionParam @MinLength(2) float[] res)
	{
		return revDiv(v1x, v1y, v2.v0(), v2.v1(), res);
	}
	
	/**
	 * Divides the second vector {@code (v2[0], v2[1])} by the first vector {@code (v1x, v1y)} and
	 * saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2[0], v2[1]) / (v1x, v1y)}
	 * 
	 * @param v1x
	 *     The value of the x component of the first vector.
	 * @param v1y
	 *     The value of the y component of the first vector.
	 * @param v2
	 *     The second vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] revDiv(float v1x, float v1y, @MinLength(2) float[] v2,
			@ExtractionParam @MinLength(2) float[] res)
	{
		return revDiv(v1x, v1y, v2[0], v2[1], res);
	}
	
	/**
	 * Divides the second vector {@code (v2x, v2y)} by the first vector {@code (v1x, v1y)} and saves
	 * the result in the given extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2x, v2y) / (v1x, v1y)}
	 * 
	 * @param v1x
	 *     The value of the x component of the first vector.
	 * @param v1y
	 *     The value of the y component of the first vector.
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] revDiv(float v1x, float v1y, float v2x, float v2y, @ExtractionParam @MinLength(2) float[] res)
	{
		res[0] = v2x / v1x;
		res[1] = v2y / v1y;
		
		return res;
	}
	
	/**
	 * Divides the second vector {@code (v2)} by the first vector {@code (v1)} and saves the result
	 * in the given extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v2 / v1}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter.
	 * 
	 * @param v1
	 *     The first vector.
	 * @param v2
	 *     The second vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T revDiv(Tup2fR v1, Tup2fR v2, @ExtractionParam T res)
	{
		return revDiv(v1.v0(), v1.v1(), v2.v0(), v2.v1(), res);
	}
	
	/**
	 * Divides the second vector {@code (v2[0], v2[1])} by the first vector {@code (v1)} and saves
	 * the result in the given extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2[0], v2[1]) / v1}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter.
	 * 
	 * @param v1
	 *     The first vector.
	 * @param v2
	 *     The second vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T revDiv(Tup2fR v1, @MinLength(2) float[] v2, @ExtractionParam T res)
	{
		return revDiv(v1.v0(), v1.v1(), v2[0], v2[1], res);
	}
	
	/**
	 * Divides the second vector {@code (v2x, v2y)} by the first vector {@code (v1)} and saves the
	 * result in the given extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2x, v2y) / v1}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter.
	 * 
	 * @param v1
	 *     The first vector.
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T revDiv(Tup2fR v1, float v2x, float v2y, @ExtractionParam T res)
	{
		return revDiv(v1.v0(), v1.v1(), v2x, v2y, res);
	}
	
	/**
	 * Divides the second vector {@code (v2)} by the first vector {@code (v1[0], v1[1])} and saves
	 * the result in the given extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v2 / (v1[0], v1[1])}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter.
	 * 
	 * @param v1
	 *     The first vector as an array with at least two entries.
	 * @param v2
	 *     The second vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T revDiv(@MinLength(2) float[] v1, Tup2fR v2, @ExtractionParam T res)
	{
		return revDiv(v1[0], v1[1], v2.v0(), v2.v1(), res);
	}
	
	/**
	 * Divides the second vector {@code (v2[0], v2[1])} by the first vector {@code (v1[0], v1[1])}
	 * and saves the result in the given extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2[0], v2[1]) / (v1[0], v1[1])}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter.
	 * 
	 * @param v1
	 *     The first vector as an array with at least two entries.
	 * @param v2
	 *     The second vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T revDiv(@MinLength(2) float[] v1, @MinLength(2) float[] v2,
			@ExtractionParam T res)
	{
		return revDiv(v1[0], v1[1], v2[0], v2[1], res);
	}
	
	/**
	 * Divides the second vector {@code (v2x, v2y)} by the first vector {@code (v1[0], v1[1])} and
	 * saves the result in the given extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2x, v2y) / (v1[0], v1[1])}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter.
	 * 
	 * @param v1
	 *     The first vector as an array with at least two entries.
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T revDiv(@MinLength(2) float[] v1, float v2x, float v2y, @ExtractionParam T res)
	{
		return revDiv(v1[0], v1[1], v2x, v2y, res);
	}
	
	/**
	 * Divides the second vector {@code (v2)} by the first vector {@code (v1x, v1y)} and saves the
	 * result in the given extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v2 / (v1x, v1y)}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter.
	 * 
	 * @param v1x
	 *     The value of the x component of the first vector.
	 * @param v1y
	 *     The value of the y component of the first vector.
	 * @param v2
	 *     The second vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T revDiv(float v1x, float v1y, Tup2fR v2, @ExtractionParam T res)
	{
		return revDiv(v1x, v1y, v2.v0(), v2.v1(), res);
	}
	
	/**
	 * Divides the second vector {@code (v2[0], v2[1])} by the first vector {@code (v1x, v1y)} and
	 * saves the result in the given extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2[0], v2[1]) / (v1x, v1y)}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter.
	 * 
	 * @param v1x
	 *     The value of the x component of the first vector.
	 * @param v1y
	 *     The value of the y component of the first vector.
	 * @param v2
	 *     The second vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T revDiv(float v1x, float v1y, @MinLength(2) float[] v2, @ExtractionParam T res)
	{
		return revDiv(v1x, v1y, v2[0], v2[1], res);
	}
	
	/**
	 * Divides the second vector {@code (v2x, v2y)} by the first vector {@code (v1x, v1y)} and saves
	 * the result in the given extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2x, v2y) / (v1x, v1y)}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter.
	 * 
	 * @param v1x
	 *     The value of the x component of the first vector.
	 * @param v1y
	 *     The value of the y component of the first vector.
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T revDiv(float v1x, float v1y, float v2x, float v2y, @ExtractionParam T res)
	{
		res.set(v2x / v1x, v2y / v1y);
		
		return res;
	}
	
	/**
	 * Divides the second vector {@code (v2)} by the first vector {@code (v1)}, supplies the result
	 * to the given implementation of the functional interface and returns the result of that
	 * implementation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v2 / v1}
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v1
	 *     The first vector.
	 * @param v2
	 *     The second vector.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T revDivFunc(Tup2fR v1, Tup2fR v2, FloatBiFunction<T> res)
	{
		return revDivFunc(v1.v0(), v1.v1(), v2.v0(), v2.v1(), res);
	}
	
	/**
	 * Divides the second vector {@code (v2[0], v2[1])} by the first vector {@code (v1)}, supplies
	 * the result to the given implementation of the functional interface and returns the result of
	 * that implementation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2[0], v2[1]) / v1}
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v1
	 *     The first vector.
	 * @param v2
	 *     The second vector as an array with at least two entries.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T revDivFunc(Tup2fR v1, @MinLength(2) float[] v2, FloatBiFunction<T> res)
	{
		return revDivFunc(v1.v0(), v1.v1(), v2[0], v2[1], res);
	}
	
	/**
	 * Divides the second vector {@code (v2x, v2y)} by the first vector {@code (v1)}, supplies the
	 * result to the given implementation of the functional interface and returns the result of that
	 * implementation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2x, v2y) / v1}
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v1
	 *     The first vector.
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T revDivFunc(Tup2fR v1, float v2x, float v2y, FloatBiFunction<T> res)
	{
		return revDivFunc(v1.v0(), v1.v1(), v2x, v2y, res);
	}
	
	/**
	 * Divides the second vector {@code (v2)} by the first vector {@code (v1[0], v1[1])}, supplies
	 * the result to the given implementation of the functional interface and returns the result of
	 * that implementation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v2 / (v1[0], v1[1])}
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v1
	 *     The first vector as an array with at least two entries.
	 * @param v2
	 *     The second vector.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T revDivFunc(@MinLength(2) float[] v1, Tup2fR v2, FloatBiFunction<T> res)
	{
		return revDivFunc(v1[0], v1[1], v2.v0(), v2.v1(), res);
	}
	
	/**
	 * Divides the second vector {@code (v2[0], v2[1])} by the first vector {@code (v1[0], v1[1])},
	 * supplies the result to the given implementation of the functional interface and returns the
	 * result of that implementation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2[0], v2[1]) / (v1[0], v1[1])}
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v1
	 *     The first vector as an array with at least two entries.
	 * @param v2
	 *     The second vector as an array with at least two entries.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T revDivFunc(@MinLength(2) float[] v1, @MinLength(2) float[] v2, FloatBiFunction<T> res)
	{
		return revDivFunc(v1[0], v1[1], v2[0], v2[1], res);
	}
	
	/**
	 * Divides the second vector {@code (v2x, v2y)} by the first vector {@code (v1[0], v1[1])},
	 * supplies the result to the given implementation of the functional interface and returns the
	 * result of that implementation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2x, v2y) / (v1[0], v1[1])}
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v1
	 *     The first vector as an array with at least two entries.
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T revDivFunc(@MinLength(2) float[] v1, float v2x, float v2y, FloatBiFunction<T> res)
	{
		return revDivFunc(v1[0], v1[1], v2x, v2y, res);
	}
	
	/**
	 * Divides the second vector {@code (v2)} by the first vector {@code (v1x, v1y)}, supplies the
	 * result to the given implementation of the functional interface and returns the result of that
	 * implementation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v2 / (v1x, v1y)}
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v1x
	 *     The value of the x component of the first vector.
	 * @param v1y
	 *     The value of the y component of the first vector.
	 * @param v2
	 *     The second vector.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T revDivFunc(float v1x, float v1y, Tup2fR v2, FloatBiFunction<T> res)
	{
		return revDivFunc(v1x, v1y, v2.v0(), v2.v1(), res);
	}
	
	/**
	 * Divides the second vector {@code (v2[0], v2[1])} by the first vector {@code (v1x, v1y)},
	 * supplies the result to the given implementation of the functional interface and returns the
	 * result of that implementation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2[0], v2[1]) / (v1x, v1y)}
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v1x
	 *     The value of the x component of the first vector.
	 * @param v1y
	 *     The value of the y component of the first vector.
	 * @param v2
	 *     The second vector as an array with at least two entries.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T revDivFunc(float v1x, float v1y, @MinLength(2) float[] v2, FloatBiFunction<T> res)
	{
		return revDivFunc(v1x, v1y, v2[0], v2[1], res);
	}
	
	/**
	 * Divides the second vector {@code (v2x, v2y)} by the first vector {@code (v1x, v1y)}, supplies
	 * the result to the given implementation of the functional interface and returns the result of
	 * that implementation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2x, v2y) / (v1x, v1y)}
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v1x
	 *     The value of the x component of the first vector.
	 * @param v1y
	 *     The value of the y component of the first vector.
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T revDivFunc(float v1x, float v1y, float v2x, float v2y, FloatBiFunction<T> res)
	{
		return res.apply(v2x / v1x, v2y / v1y);
	}
	
	/**
	 * Multiplies the given vector {@code (v1)} with the given vector {@code (v2)}, adds the given
	 * vector {@code (v3)} to the product result and saves the result in the given extraction
	 * parameter.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code  v1 * v2 + v3}
	 * 
	 * @param v1
	 *     The first multiplicant vector.
	 * @param v2
	 *     The second multiplicant vector.
	 * @param v3
	 *     The addend vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] fma(Tup2fR v1, Tup2fR v2, Tup2fR v3, @ExtractionParam @MinLength(2) float[] res)
	{
		return fma(v1.v0(), v1.v1(), v2.v0(), v2.v1(), v3.v0(), v3.v1(), res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1)} with the given vector {@code (v2)}, adds the given
	 * vector {@code (v3)} to the product result and saves the result in the given extraction
	 * parameter.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code  v1 * v2 + v3}
	 * 
	 * @param v1
	 *     The first multiplicant vector.
	 * @param v2
	 *     The second multiplicant vector.
	 * @param v3
	 *     The addend vector.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] fma(Tup2fR v1, Tup2fR v2, Tup2fR v3, MathProvider mathProvider,
			@ExtractionParam @MinLength(2) float[] res)
	{
		return fma(v1.v0(), v1.v1(), v2.v0(), v2.v1(), v3.v0(), v3.v1(), res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1)} with the given vector {@code (v2)}, adds the given
	 * vector {@code (v3[0], v3[1])} to the product result and saves the result in the given
	 * extraction parameter.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 * v2 + (v3[0], v3[1])}
	 * 
	 * @param v1
	 *     The first multiplicant vector.
	 * @param v2
	 *     The second multiplicant vector.
	 * @param v3
	 *     The addend vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] fma(Tup2fR v1, Tup2fR v2, @MinLength(2) float[] v3,
			@ExtractionParam @MinLength(2) float[] res)
	{
		return fma(v1.v0(), v1.v1(), v2.v0(), v2.v1(), v3[0], v3[1], res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1)} with the given vector {@code (v2)}, adds the given
	 * vector {@code (v3[0], v3[1])} to the product result and saves the result in the given
	 * extraction parameter.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 * v2 + (v3[0], v3[1])}
	 * 
	 * @param v1
	 *     The first multiplicant vector.
	 * @param v2
	 *     The second multiplicant vector.
	 * @param v3
	 *     The addend vector as an array with at least two entries.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] fma(Tup2fR v1, Tup2fR v2, @MinLength(2) float[] v3, MathProvider mathProvider,
			@ExtractionParam @MinLength(2) float[] res)
	{
		return fma(v1.v0(), v1.v1(), v2.v0(), v2.v1(), v3[0], v3[1], mathProvider, res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1)} with the given vector {@code (v2)}, adds the given
	 * vector {@code (v3x, v3y)} to the product result and saves the result in the given extraction
	 * parameter.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 * v2 + (v3x, v3y)}
	 * 
	 * @param v1
	 *     The first multiplicant vector.
	 * @param v2
	 *     The second multiplicant vector.
	 * @param v3x
	 *     The value of the x component of the addend vector.
	 * @param v3y
	 *     The value of the y component of the addend vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] fma(Tup2fR v1, Tup2fR v2, float v3x, float v3y, @ExtractionParam @MinLength(2) float[] res)
	{
		return fma(v1.v0(), v1.v1(), v2.v0(), v2.v1(), v3x, v3y, res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1)} with the given vector {@code (v2)}, adds the given
	 * vector {@code (v3x, v3y)} to the product result and saves the result in the given extraction
	 * parameter.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 * v2 + (v3x, v3y)}
	 * 
	 * @param v1
	 *     The first multiplicant vector.
	 * @param v2
	 *     The second multiplicant vector.
	 * @param v3x
	 *     The value of the x component of the addend vector.
	 * @param v3y
	 *     The value of the y component of the addend vector.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] fma(Tup2fR v1, Tup2fR v2, float v3x, float v3y, MathProvider mathProvider,
			@ExtractionParam @MinLength(2) float[] res)
	{
		return fma(v1.v0(), v1.v1(), v2.v0(), v2.v1(), v3x, v3y, mathProvider, res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1)} with the given vector {@code (v2[0], v2[1])}, adds
	 * the given vector {@code (v3)} to the product result and saves the result in the given
	 * extraction parameter.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 * (v2[0], v2[1]) + v3}
	 * 
	 * @param v1
	 *     The first multiplicant vector.
	 * @param v2
	 *     The second multiplicant vector as an array with at least two entries.
	 * @param v3
	 *     The addend vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] fma(Tup2fR v1, @MinLength(2) float[] v2, Tup2fR v3,
			@ExtractionParam @MinLength(2) float[] res)
	{
		return fma(v1.v0(), v1.v1(), v2[0], v2[1], v3.v0(), v3.v1(), res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1)} with the given vector {@code (v2[0], v2[1])}, adds
	 * the given vector {@code (v3)} to the product result and saves the result in the given
	 * extraction parameter.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 * (v2[0], v2[1]) + v3}
	 * 
	 * @param v1
	 *     The first multiplicant vector.
	 * @param v2
	 *     The second multiplicant vector as an array with at least two entries.
	 * @param v3
	 *     The addend vector.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] fma(Tup2fR v1, @MinLength(2) float[] v2, Tup2fR v3, MathProvider mathProvider,
			@ExtractionParam @MinLength(2) float[] res)
	{
		return fma(v1.v0(), v1.v1(), v2[0], v2[1], v3.v0(), v3.v1(), mathProvider, res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1)} with the given vector {@code (v2[0], v2[1])}, adds
	 * the given vector {@code (v3[0], v3[1])} to the product result and saves the result in the
	 * given extraction parameter.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 * (v2[0], v2[1]) + (v3[0], v3[1])}
	 * 
	 * @param v1
	 *     The first multiplicant vector.
	 * @param v2
	 *     The second multiplicant vector as an array with at least two entries.
	 * @param v3
	 *     The addend vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] fma(Tup2fR v1, @MinLength(2) float[] v2, @MinLength(2) float[] v3,
			@ExtractionParam @MinLength(2) float[] res)
	{
		return fma(v1.v0(), v1.v1(), v2[0], v2[1], v3[0], v3[1], res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1)} with the given vector {@code (v2[0], v2[1])}, adds
	 * the given vector {@code (v3[0], v3[1])} to the product result and saves the result in the
	 * given extraction parameter.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 * (v2[0], v2[1]) + (v3[0], v3[1])}
	 * 
	 * @param v1
	 *     The first multiplicant vector.
	 * @param v2
	 *     The second multiplicant vector as an array with at least two entries.
	 * @param v3
	 *     The addend vector as an array with at least two entries.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] fma(Tup2fR v1, @MinLength(2) float[] v2, @MinLength(2) float[] v3, MathProvider mathProvider,
			@ExtractionParam @MinLength(2) float[] res)
	{
		return fma(v1.v0(), v1.v1(), v2[0], v2[1], v3[0], v3[1], mathProvider, res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1)} with the given vector {@code (v2[0], v2[1])}, adds
	 * the given vector {@code (v3x, v3y)} to the product result and saves the result in the given
	 * extraction parameter.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 * (v2[0], v2[1]) + (v3x, v3y)}
	 * 
	 * @param v1
	 *     The first multiplicant vector.
	 * @param v2
	 *     The second multiplicant vector as an array with at least two entries.
	 * @param v3x
	 *     The value of the x component of the addend vector.
	 * @param v3y
	 *     The value of the y component of the addend vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] fma(Tup2fR v1, @MinLength(2) float[] v2, float v3x, float v3y,
			@ExtractionParam @MinLength(2) float[] res)
	{
		return fma(v1.v0(), v1.v1(), v2[0], v2[1], v3x, v3y, res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1)} with the given vector {@code (v2[0], v2[1])}, adds
	 * the given vector {@code (v3x, v3y)} to the product result and saves the result in the given
	 * extraction parameter.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 * (v2[0], v2[1]) + (v3x, v3y)}
	 * 
	 * @param v1
	 *     The first multiplicant vector.
	 * @param v2
	 *     The second multiplicant vector as an array with at least two entries.
	 * @param v3x
	 *     The value of the x component of the addend vector.
	 * @param v3y
	 *     The value of the y component of the addend vector.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] fma(Tup2fR v1, @MinLength(2) float[] v2, float v3x, float v3y, MathProvider mathProvider,
			@ExtractionParam @MinLength(2) float[] res)
	{
		return fma(v1.v0(), v1.v1(), v2[0], v2[1], v3x, v3y, mathProvider, res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1)} with the given vector {@code (v2x, v2y)}, adds the
	 * given vector {@code (v3)} to the product result and saves the result in the given extraction
	 * parameter.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 * (v2x, v2y) + v3}
	 * 
	 * @param v1
	 *     The first multiplicant vector.
	 * @param v2x
	 *     The value of the x component of the second multiplicant vector.
	 * @param v2y
	 *     The value of the y component of the second multiplicant vector.
	 * @param v3
	 *     The addend vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] fma(Tup2fR v1, float v2x, float v2y, Tup2fR v3, @ExtractionParam @MinLength(2) float[] res)
	{
		return fma(v1.v0(), v1.v1(), v2x, v2y, v3.v0(), v3.v1(), res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1)} with the given vector {@code (v2x, v2y)}, adds the
	 * given vector {@code (v3)} to the product result and saves the result in the given extraction
	 * parameter.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 * (v2x, v2y) + v3}
	 * 
	 * @param v1
	 *     The first multiplicant vector.
	 * @param v2x
	 *     The value of the x component of the second multiplicant vector.
	 * @param v2y
	 *     The value of the y component of the second multiplicant vector.
	 * @param v3
	 *     The addend vector.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] fma(Tup2fR v1, float v2x, float v2y, Tup2fR v3, MathProvider mathProvider,
			@ExtractionParam @MinLength(2) float[] res)
	{
		return fma(v1.v0(), v1.v1(), v2x, v2y, v3.v0(), v3.v1(), mathProvider, res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1)} with the given vector {@code (v2x, v2y)}, adds the
	 * given vector {@code (v3[0], v3[1])} to the product result and saves the result in the given
	 * extraction parameter.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 * (v2x, v2y) + (v3[0], v3[1])}
	 * 
	 * @param v1
	 *     The first multiplicant vector.
	 * @param v2x
	 *     The value of the x component of the second multiplicant vector.
	 * @param v2y
	 *     The value of the y component of the second multiplicant vector.
	 * @param v3
	 *     The addend vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] fma(Tup2fR v1, float v2x, float v2y, @MinLength(2) float[] v3,
			@ExtractionParam @MinLength(2) float[] res)
	{
		return fma(v1.v0(), v1.v1(), v2x, v2y, v3[0], v3[1], res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1)} with the given vector {@code (v2x, v2y)}, adds the
	 * given vector {@code (v3[0], v3[1])} to the product result and saves the result in the given
	 * extraction parameter.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 * (v2x, v2y) + (v3[0], v3[1])}
	 * 
	 * @param v1
	 *     The first multiplicant vector.
	 * @param v2x
	 *     The value of the x component of the second multiplicant vector.
	 * @param v2y
	 *     The value of the y component of the second multiplicant vector.
	 * @param v3
	 *     The addend vector as an array with at least two entries.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] fma(Tup2fR v1, float v2x, float v2y, @MinLength(2) float[] v3, MathProvider mathProvider,
			@ExtractionParam @MinLength(2) float[] res)
	{
		return fma(v1.v0(), v1.v1(), v2x, v2y, v3[0], v3[1], mathProvider, res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1)} with the given vector {@code (v2x, v2y)}, adds the
	 * given vector {@code (v3x, v3y)} to the product result and saves the result in the given
	 * extraction parameter.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 * (v2x, v2y) + (v3x, v3y)}
	 * 
	 * @param v1
	 *     The first multiplicant vector.
	 * @param v2x
	 *     The value of the x component of the second multiplicant vector.
	 * @param v2y
	 *     The value of the y component of the second multiplicant vector.
	 * @param v3x
	 *     The value of the x component of the addend vector.
	 * @param v3y
	 *     The value of the y component of the addend vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] fma(Tup2fR v1, float v2x, float v2y, float v3x, float v3y,
			@ExtractionParam @MinLength(2) float[] res)
	{
		return fma(v1.v0(), v1.v1(), v2x, v2y, v3x, v3y, res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1)} with the given vector {@code (v2x, v2y)}, adds the
	 * given vector {@code (v3x, v3y)} to the product result and saves the result in the given
	 * extraction parameter.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 * (v2x, v2y) + (v3x, v3y)}
	 * 
	 * @param v1
	 *     The first multiplicant vector.
	 * @param v2x
	 *     The value of the x component of the second multiplicant vector.
	 * @param v2y
	 *     The value of the y component of the second multiplicant vector.
	 * @param v3x
	 *     The value of the x component of the addend vector.
	 * @param v3y
	 *     The value of the y component of the addend vector.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] fma(Tup2fR v1, float v2x, float v2y, float v3x, float v3y, MathProvider mathProvider,
			@ExtractionParam @MinLength(2) float[] res)
	{
		return fma(v1.v0(), v1.v1(), v2x, v2y, v3x, v3y, mathProvider, res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1[0], v1[1])} with the given vector {@code (v2)}, adds
	 * the given vector {@code (v3)} to the product result and saves the result in the given
	 * extraction parameter.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1]) * v2 + v3}
	 * 
	 * @param v1
	 *     The first multiplicant vector as an array with at least two entries.
	 * @param v2
	 *     The second multiplicant vector.
	 * @param v3
	 *     The addend vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] fma(@MinLength(2) float[] v1, Tup2fR v2, Tup2fR v3,
			@ExtractionParam @MinLength(2) float[] res)
	{
		return fma(v1[0], v1[1], v2.v0(), v2.v1(), v3.v0(), v3.v1(), res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1[0], v1[1])} with the given vector {@code (v2)}, adds
	 * the given vector {@code (v3)} to the product result and saves the result in the given
	 * extraction parameter.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1]) * v2 + v3}
	 * 
	 * @param v1
	 *     The first multiplicant vector as an array with at least two entries.
	 * @param v2
	 *     The second multiplicant vector.
	 * @param v3
	 *     The addend vector.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] fma(@MinLength(2) float[] v1, Tup2fR v2, Tup2fR v3, MathProvider mathProvider,
			@ExtractionParam @MinLength(2) float[] res)
	{
		return fma(v1[0], v1[1], v2.v0(), v2.v1(), v3.v0(), v3.v1(), mathProvider, res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1[0], v1[1])} with the given vector {@code (v2)}, adds
	 * the given vector {@code (v3[0], v3[1])} to the product result and saves the result in the
	 * given extraction parameter.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1]) * v2 + (v3[0], v3[1])}
	 * 
	 * @param v1
	 *     The first multiplicant vector as an array with at least two entries.
	 * @param v2
	 *     The second multiplicant vector.
	 * @param v3
	 *     The addend vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] fma(@MinLength(2) float[] v1, Tup2fR v2, @MinLength(2) float[] v3,
			@ExtractionParam @MinLength(2) float[] res)
	{
		return fma(v1[0], v1[1], v2.v0(), v2.v1(), v3[0], v3[1], res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1[0], v1[1])} with the given vector {@code (v2)}, adds
	 * the given vector {@code (v3[0], v3[1])} to the product result and saves the result in the
	 * given extraction parameter.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1]) * v2 + (v3[0], v3[1])}
	 * 
	 * @param v1
	 *     The first multiplicant vector as an array with at least two entries.
	 * @param v2
	 *     The second multiplicant vector.
	 * @param v3
	 *     The addend vector as an array with at least two entries.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] fma(@MinLength(2) float[] v1, Tup2fR v2, @MinLength(2) float[] v3, MathProvider mathProvider,
			@ExtractionParam @MinLength(2) float[] res)
	{
		return fma(v1[0], v1[1], v2.v0(), v2.v1(), v3[0], v3[1], mathProvider, res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1[0], v1[1])} with the given vector {@code (v2)}, adds
	 * the given vector {@code (v3x, v3y)} to the product result and saves the result in the given
	 * extraction parameter.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1]) * v2 + (v3x, v3y)}
	 * 
	 * @param v1
	 *     The first multiplicant vector as an array with at least two entries.
	 * @param v2
	 *     The second multiplicant vector.
	 * @param v3x
	 *     The value of the x component of the addend vector.
	 * @param v3y
	 *     The value of the y component of the addend vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] fma(@MinLength(2) float[] v1, Tup2fR v2, float v3x, float v3y,
			@ExtractionParam @MinLength(2) float[] res)
	{
		return fma(v1[0], v1[1], v2.v0(), v2.v1(), v3x, v3y, res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1[0], v1[1])} with the given vector {@code (v2)}, adds
	 * the given vector {@code (v3x, v3y)} to the product result and saves the result in the given
	 * extraction parameter.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1]) * v2 + (v3x, v3y)}
	 * 
	 * @param v1
	 *     The first multiplicant vector as an array with at least two entries.
	 * @param v2
	 *     The second multiplicant vector.
	 * @param v3x
	 *     The value of the x component of the addend vector.
	 * @param v3y
	 *     The value of the y component of the addend vector.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] fma(@MinLength(2) float[] v1, Tup2fR v2, float v3x, float v3y, MathProvider mathProvider,
			@ExtractionParam @MinLength(2) float[] res)
	{
		return fma(v1[0], v1[1], v2.v0(), v2.v1(), v3x, v3y, mathProvider, res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1[0], v1[1])} with the given vector
	 * {@code (v2[0], v2[1])}, adds the given vector {@code (v3)} to the product result and saves
	 * the result in the given extraction parameter.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1]) * (v2[0], v2[1]) + v3}
	 * 
	 * @param v1
	 *     The first multiplicant vector as an array with at least two entries.
	 * @param v2
	 *     The second multiplicant vector as an array with at least two entries.
	 * @param v3
	 *     The addend vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] fma(@MinLength(2) float[] v1, @MinLength(2) float[] v2, Tup2fR v3,
			@ExtractionParam @MinLength(2) float[] res)
	{
		return fma(v1[0], v1[1], v2[0], v2[1], v3.v0(), v3.v1(), res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1[0], v1[1])} with the given vector
	 * {@code (v2[0], v2[1])}, adds the given vector {@code (v3)} to the product result and saves
	 * the result in the given extraction parameter.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1]) * (v2[0], v2[1]) + v3}
	 * 
	 * @param v1
	 *     The first multiplicant vector as an array with at least two entries.
	 * @param v2
	 *     The second multiplicant vector as an array with at least two entries.
	 * @param v3
	 *     The addend vector.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] fma(@MinLength(2) float[] v1, @MinLength(2) float[] v2, Tup2fR v3, MathProvider mathProvider,
			@ExtractionParam @MinLength(2) float[] res)
	{
		return fma(v1[0], v1[1], v2[0], v2[1], v3.v0(), v3.v1(), mathProvider, res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1[0], v1[1])} with the given vector
	 * {@code (v2[0], v2[1])}, adds the given vector {@code (v3[0], v3[1])} to the product result
	 * and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1]) * (v2[0], v2[1]) + (v3[0], v3[1])}
	 * 
	 * @param v1
	 *     The first multiplicant vector as an array with at least two entries.
	 * @param v2
	 *     The second multiplicant vector as an array with at least two entries.
	 * @param v3
	 *     The addend vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] fma(@MinLength(2) float[] v1, @MinLength(2) float[] v2, @MinLength(2) float[] v3,
			@ExtractionParam @MinLength(2) float[] res)
	{
		return fma(v1[0], v1[1], v2[0], v2[1], v3[0], v3[1], res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1[0], v1[1])} with the given vector
	 * {@code (v2[0], v2[1])}, adds the given vector {@code (v3[0], v3[1])} to the product result
	 * and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1]) * (v2[0], v2[1]) + (v3[0], v3[1])}
	 * 
	 * @param v1
	 *     The first multiplicant vector as an array with at least two entries.
	 * @param v2
	 *     The second multiplicant vector as an array with at least two entries.
	 * @param v3
	 *     The addend vector as an array with at least two entries.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] fma(@MinLength(2) float[] v1, @MinLength(2) float[] v2, @MinLength(2) float[] v3,
			MathProvider mathProvider, @ExtractionParam @MinLength(2) float[] res)
	{
		return fma(v1[0], v1[1], v2[0], v2[1], v3[0], v3[1], mathProvider, res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1[0], v1[1])} with the given vector
	 * {@code (v2[0], v2[1])}, adds the given vector {@code (v3x, v3y)} to the product result and
	 * saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1]) * (v2[0], v2[1]) + (v3x, v3y)}
	 * 
	 * @param v1
	 *     The first multiplicant vector as an array with at least two entries.
	 * @param v2
	 *     The second multiplicant vector as an array with at least two entries.
	 * @param v3x
	 *     The value of the x component of the addend vector.
	 * @param v3y
	 *     The value of the y component of the addend vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] fma(@MinLength(2) float[] v1, @MinLength(2) float[] v2, float v3x, float v3y,
			@ExtractionParam @MinLength(2) float[] res)
	{
		return fma(v1[0], v1[1], v2[0], v2[1], v3x, v3y, res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1[0], v1[1])} with the given vector
	 * {@code (v2[0], v2[1])}, adds the given vector {@code (v3x, v3y)} to the product result and
	 * saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1]) * (v2[0], v2[1]) + (v3x, v3y)}
	 * 
	 * @param v1
	 *     The first multiplicant vector as an array with at least two entries.
	 * @param v2
	 *     The second multiplicant vector as an array with at least two entries.
	 * @param v3x
	 *     The value of the x component of the addend vector.
	 * @param v3y
	 *     The value of the y component of the addend vector.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] fma(@MinLength(2) float[] v1, @MinLength(2) float[] v2, float v3x, float v3y,
			MathProvider mathProvider, @ExtractionParam @MinLength(2) float[] res)
	{
		return fma(v1[0], v1[1], v2[0], v2[1], v3x, v3y, mathProvider, res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1[0], v1[1])} with the given vector {@code (v2x, v2y)},
	 * adds the given vector {@code (v3)} to the product result and saves the result in the given
	 * extraction parameter.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1]) * (v2x, v2y) + v3}
	 * 
	 * @param v1
	 *     The first multiplicant vector as an array with at least two entries.
	 * @param v2x
	 *     The value of the x component of the second multiplicant vector.
	 * @param v2y
	 *     The value of the y component of the second multiplicant vector.
	 * @param v3
	 *     The addend vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] fma(@MinLength(2) float[] v1, float v2x, float v2y, Tup2fR v3,
			@ExtractionParam @MinLength(2) float[] res)
	{
		return fma(v1[0], v1[1], v2x, v2y, v3.v0(), v3.v1(), res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1[0], v1[1])} with the given vector {@code (v2x, v2y)},
	 * adds the given vector {@code (v3)} to the product result and saves the result in the given
	 * extraction parameter.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1]) * (v2x, v2y) + v3}
	 * 
	 * @param v1
	 *     The first multiplicant vector as an array with at least two entries.
	 * @param v2x
	 *     The value of the x component of the second multiplicant vector.
	 * @param v2y
	 *     The value of the y component of the second multiplicant vector.
	 * @param v3
	 *     The addend vector.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] fma(@MinLength(2) float[] v1, float v2x, float v2y, Tup2fR v3, MathProvider mathProvider,
			@ExtractionParam @MinLength(2) float[] res)
	{
		return fma(v1[0], v1[1], v2x, v2y, v3.v0(), v3.v1(), mathProvider, res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1[0], v1[1])} with the given vector {@code (v2x, v2y)},
	 * adds the given vector {@code (v3[0], v3[1])} to the product result and saves the result in
	 * the given extraction parameter.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1]) * (v2x, v2y) + (v3[0], v3[1])}
	 * 
	 * @param v1
	 *     The first multiplicant vector as an array with at least two entries.
	 * @param v2x
	 *     The value of the x component of the second multiplicant vector.
	 * @param v2y
	 *     The value of the y component of the second multiplicant vector.
	 * @param v3
	 *     The addend vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] fma(@MinLength(2) float[] v1, float v2x, float v2y, @MinLength(2) float[] v3,
			@ExtractionParam @MinLength(2) float[] res)
	{
		return fma(v1[0], v1[1], v2x, v2y, v3[0], v3[1], res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1[0], v1[1])} with the given vector {@code (v2x, v2y)},
	 * adds the given vector {@code (v3[0], v3[1])} to the product result and saves the result in
	 * the given extraction parameter.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1]) * (v2x, v2y) + (v3[0], v3[1])}
	 * 
	 * @param v1
	 *     The first multiplicant vector as an array with at least two entries.
	 * @param v2x
	 *     The value of the x component of the second multiplicant vector.
	 * @param v2y
	 *     The value of the y component of the second multiplicant vector.
	 * @param v3
	 *     The addend vector as an array with at least two entries.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] fma(@MinLength(2) float[] v1, float v2x, float v2y, @MinLength(2) float[] v3,
			MathProvider mathProvider, @ExtractionParam @MinLength(2) float[] res)
	{
		return fma(v1[0], v1[1], v2x, v2y, v3[0], v3[1], mathProvider, res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1[0], v1[1])} with the given vector {@code (v2x, v2y)},
	 * adds the given vector {@code (v3x, v3y)} to the product result and saves the result in the
	 * given extraction parameter.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1]) * (v2x, v2y) + (v3x, v3y)}
	 * 
	 * @param v1
	 *     The first multiplicant vector as an array with at least two entries.
	 * @param v2x
	 *     The value of the x component of the second multiplicant vector.
	 * @param v2y
	 *     The value of the y component of the second multiplicant vector.
	 * @param v3x
	 *     The value of the x component of the addend vector.
	 * @param v3y
	 *     The value of the y component of the addend vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] fma(@MinLength(2) float[] v1, float v2x, float v2y, float v3x, float v3y,
			@ExtractionParam @MinLength(2) float[] res)
	{
		return fma(v1[0], v1[1], v2x, v2y, v3x, v3y, res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1[0], v1[1])} with the given vector {@code (v2x, v2y)},
	 * adds the given vector {@code (v3x, v3y)} to the product result and saves the result in the
	 * given extraction parameter.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1]) * (v2x, v2y) + (v3x, v3y)}
	 * 
	 * @param v1
	 *     The first multiplicant vector as an array with at least two entries.
	 * @param v2x
	 *     The value of the x component of the second multiplicant vector.
	 * @param v2y
	 *     The value of the y component of the second multiplicant vector.
	 * @param v3x
	 *     The value of the x component of the addend vector.
	 * @param v3y
	 *     The value of the y component of the addend vector.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] fma(@MinLength(2) float[] v1, float v2x, float v2y, float v3x, float v3y,
			MathProvider mathProvider, @ExtractionParam @MinLength(2) float[] res)
	{
		return fma(v1[0], v1[1], v2x, v2y, v3x, v3y, mathProvider, res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1x, v1y)} with the given vector {@code (v2)}, adds the
	 * given vector {@code (v3)} to the product result and saves the result in the given extraction
	 * parameter.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y) * v2 + v3}
	 * 
	 * @param v1x
	 *     The value of the x component of the first multiplicant vector.
	 * @param v1y
	 *     The value of the y component of the first multiplicant vector.
	 * @param v2
	 *     The second multiplicant vector.
	 * @param v3
	 *     The addend vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] fma(float v1x, float v1y, Tup2fR v2, Tup2fR v3, @ExtractionParam @MinLength(2) float[] res)
	{
		return fma(v1x, v1y, v2.v0(), v2.v1(), v3.v0(), v3.v1(), res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1x, v1y)} with the given vector {@code (v2)}, adds the
	 * given vector {@code (v3)} to the product result and saves the result in the given extraction
	 * parameter.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y) * v2 + v3}
	 * 
	 * @param v1x
	 *     The value of the x component of the first multiplicant vector.
	 * @param v1y
	 *     The value of the y component of the first multiplicant vector.
	 * @param v2
	 *     The second multiplicant vector.
	 * @param v3
	 *     The addend vector.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] fma(float v1x, float v1y, Tup2fR v2, Tup2fR v3, MathProvider mathProvider,
			@ExtractionParam @MinLength(2) float[] res)
	{
		return fma(v1x, v1y, v2.v0(), v2.v1(), v3.v0(), v3.v1(), mathProvider, res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1x, v1y)} with the given vector {@code (v2)}, adds the
	 * given vector {@code (v3[0], v3[1])} to the product result and saves the result in the given
	 * extraction parameter.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y) * v2 + (v3[0], v3[1])}
	 * 
	 * @param v1x
	 *     The value of the x component of the first multiplicant vector.
	 * @param v1y
	 *     The value of the y component of the first multiplicant vector.
	 * @param v2
	 *     The second multiplicant vector.
	 * @param v3
	 *     The addend vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] fma(float v1x, float v1y, Tup2fR v2, @MinLength(2) float[] v3,
			@ExtractionParam @MinLength(2) float[] res)
	{
		return fma(v1x, v1y, v2.v0(), v2.v1(), v3[0], v3[1], res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1x, v1y)} with the given vector {@code (v2)}, adds the
	 * given vector {@code (v3[0], v3[1])} to the product result and saves the result in the given
	 * extraction parameter.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y) * v2 + (v3[0], v3[1])}
	 * 
	 * @param v1x
	 *     The value of the x component of the first multiplicant vector.
	 * @param v1y
	 *     The value of the y component of the first multiplicant vector.
	 * @param v2
	 *     The second multiplicant vector.
	 * @param v3
	 *     The addend vector as an array with at least two entries.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] fma(float v1x, float v1y, Tup2fR v2, @MinLength(2) float[] v3, MathProvider mathProvider,
			@ExtractionParam @MinLength(2) float[] res)
	{
		return fma(v1x, v1y, v2.v0(), v2.v1(), v3[0], v3[1], mathProvider, res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1x, v1y)} with the given vector {@code (v2)}, adds the
	 * given vector {@code (v3x, v3y)} to the product result and saves the result in the given
	 * extraction parameter.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y) * v2 + (v3x, v3y)}
	 * 
	 * @param v1x
	 *     The value of the x component of the first multiplicant vector.
	 * @param v1y
	 *     The value of the y component of the first multiplicant vector.
	 * @param v2
	 *     The second multiplicant vector.
	 * @param v3x
	 *     The value of the x component of the addend vector.
	 * @param v3y
	 *     The value of the y component of the addend vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] fma(float v1x, float v1y, Tup2fR v2, float v3x, float v3y,
			@ExtractionParam @MinLength(2) float[] res)
	{
		return fma(v1x, v1y, v2.v0(), v2.v1(), v3x, v3y, res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1x, v1y)} with the given vector {@code (v2)}, adds the
	 * given vector {@code (v3x, v3y)} to the product result and saves the result in the given
	 * extraction parameter.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y) * v2 + (v3x, v3y)}
	 * 
	 * @param v1x
	 *     The value of the x component of the first multiplicant vector.
	 * @param v1y
	 *     The value of the y component of the first multiplicant vector.
	 * @param v2
	 *     The second multiplicant vector.
	 * @param v3x
	 *     The value of the x component of the addend vector.
	 * @param v3y
	 *     The value of the y component of the addend vector.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] fma(float v1x, float v1y, Tup2fR v2, float v3x, float v3y, MathProvider mathProvider,
			@ExtractionParam @MinLength(2) float[] res)
	{
		return fma(v1x, v1y, v2.v0(), v2.v1(), v3x, v3y, mathProvider, res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1x, v1y)} with the given vector {@code (v2[0], v2[1])},
	 * adds the given vector {@code (v3)} to the product result and saves the result in the given
	 * result array.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y) * (v2[0], v2[1]) + v3}
	 * 
	 * @param v1x
	 *     The value of the x component of the first multiplicant vector.
	 * @param v1y
	 *     The value of the y component of the first multiplicant vector.
	 * @param v2
	 *     The second multiplicant vector as an array with at least two entries.
	 * @param v3
	 *     The addend vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] fma(float v1x, float v1y, @MinLength(2) float[] v2, Tup2fR v3,
			@ExtractionParam @MinLength(2) float[] res)
	{
		return fma(v1x, v1y, v2[0], v2[1], v3.v0(), v3.v1(), res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1x, v1y)} with the given vector {@code (v2[0], v2[1])},
	 * adds the given vector {@code (v3)} to the product result and saves the result in the given
	 * result array.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y) * (v2[0], v2[1]) + v3}
	 * 
	 * @param v1x
	 *     The value of the x component of the first multiplicant vector.
	 * @param v1y
	 *     The value of the y component of the first multiplicant vector.
	 * @param v2
	 *     The second multiplicant vector as an array with at least two entries.
	 * @param v3
	 *     The addend vector.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] fma(float v1x, float v1y, @MinLength(2) float[] v2, Tup2fR v3, MathProvider mathProvider,
			@ExtractionParam @MinLength(2) float[] res)
	{
		return fma(v1x, v1y, v2[0], v2[1], v3.v0(), v3.v1(), mathProvider, res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1x, v1y)} with the given vector {@code (v2[0], v2[1])},
	 * adds the given vector {@code (v3[0], v3[1])} to the product result and saves the result in
	 * the given extraction parameter.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y) * (v2[0], v2[1]) + (v3[0], v3[1])}
	 * 
	 * @param v1x
	 *     The value of the x component of the first multiplicant vector.
	 * @param v1y
	 *     The value of the y component of the first multiplicant vector.
	 * @param v2
	 *     The second multiplicant vector as an array with at least two entries.
	 * @param v3
	 *     The addend vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] fma(float v1x, float v1y, @MinLength(2) float[] v2, @MinLength(2) float[] v3,
			@ExtractionParam @MinLength(2) float[] res)
	{
		return fma(v1x, v1y, v2[0], v2[1], v3[0], v3[1], res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1x, v1y)} with the given vector {@code (v2[0], v2[1])},
	 * adds the given vector {@code (v3[0], v3[1])} to the product result and saves the result in
	 * the given extraction parameter.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y) * (v2[0], v2[1]) + (v3[0], v3[1])}
	 * 
	 * @param v1x
	 *     The value of the x component of the first multiplicant vector.
	 * @param v1y
	 *     The value of the y component of the first multiplicant vector.
	 * @param v2
	 *     The second multiplicant vector as an array with at least two entries.
	 * @param v3
	 *     The addend vector as an array with at least two entries.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] fma(float v1x, float v1y, @MinLength(2) float[] v2, @MinLength(2) float[] v3,
			MathProvider mathProvider, @ExtractionParam @MinLength(2) float[] res)
	{
		return fma(v1x, v1y, v2[0], v2[1], v3[0], v3[1], mathProvider, res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1x, v1y)} with the given vector {@code (v2[0], v2[1])},
	 * adds the given vector {@code (v3x, v3y)} to the product result and saves the result in the
	 * given extraction parameter.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y) * (v2[0], v2[1]) + (v3x, v3y)}
	 * 
	 * @param v1x
	 *     The value of the x component of the first multiplicant vector.
	 * @param v1y
	 *     The value of the y component of the first multiplicant vector.
	 * @param v2
	 *     The second multiplicant vector as an array with at least two entries.
	 * @param v3x
	 *     The value of the x component of the addend vector.
	 * @param v3y
	 *     The value of the y component of the addend vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] fma(float v1x, float v1y, @MinLength(2) float[] v2, float v3x, float v3y,
			@ExtractionParam @MinLength(2) float[] res)
	{
		return fma(v1x, v1y, v2[0], v2[1], v3x, v3y, res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1x, v1y)} with the given vector {@code (v2[0], v2[1])},
	 * adds the given vector {@code (v3x, v3y)} to the product result and saves the result in the
	 * given extraction parameter.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y) * (v2[0], v2[1]) + (v3x, v3y)}
	 * 
	 * @param v1x
	 *     The value of the x component of the first multiplicant vector.
	 * @param v1y
	 *     The value of the y component of the first multiplicant vector.
	 * @param v2
	 *     The second multiplicant vector as an array with at least two entries.
	 * @param v3x
	 *     The value of the x component of the addend vector.
	 * @param v3y
	 *     The value of the y component of the addend vector.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] fma(float v1x, float v1y, @MinLength(2) float[] v2, float v3x, float v3y,
			MathProvider mathProvider, @ExtractionParam @MinLength(2) float[] res)
	{
		return fma(v1x, v1y, v2[0], v2[1], v3x, v3y, mathProvider, res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1x, v1y)} with the given vector {@code (v2x, v2y)}, adds
	 * the given vector {@code (v3)} to the product result and saves the result in the given
	 * extraction parameter.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y) * (v2x, v2y) + v3}
	 * 
	 * @param v1x
	 *     The value of the x component of the first multiplicant vector.
	 * @param v1y
	 *     The value of the y component of the first multiplicant vector.
	 * @param v2x
	 *     The value of the x component of the second multiplicant vector.
	 * @param v2y
	 *     The value of the y component of the second multiplicant vector.
	 * @param v3
	 *     The addend vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] fma(float v1x, float v1y, float v2x, float v2y, Tup2fR v3,
			@ExtractionParam @MinLength(2) float[] res)
	{
		return fma(v1x, v1y, v2x, v2y, v3.v0(), v3.v1(), res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1x, v1y)} with the given vector {@code (v2x, v2y)}, adds
	 * the given vector {@code (v3)} to the product result and saves the result in the given
	 * extraction parameter.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y) * (v2x, v2y) + v3}
	 * 
	 * @param v1x
	 *     The value of the x component of the first multiplicant vector.
	 * @param v1y
	 *     The value of the y component of the first multiplicant vector.
	 * @param v2x
	 *     The value of the x component of the second multiplicant vector.
	 * @param v2y
	 *     The value of the y component of the second multiplicant vector.
	 * @param v3
	 *     The addend vector.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] fma(float v1x, float v1y, float v2x, float v2y, Tup2fR v3, MathProvider mathProvider,
			@ExtractionParam @MinLength(2) float[] res)
	{
		return fma(v1x, v1y, v2x, v2y, v3.v0(), v3.v1(), mathProvider, res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1x, v1y)} with the given vector {@code (v2x, v2y)}, adds
	 * the given vector {@code (v3[0], v3[1])} to the product result and saves the result in the
	 * given extraction parameter.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y) * (v2x, v2y) + (v3[0], v3[1])}
	 * 
	 * @param v1x
	 *     The value of the x component of the first multiplicant vector.
	 * @param v1y
	 *     The value of the y component of the first multiplicant vector.
	 * @param v2x
	 *     The value of the x component of the second multiplicant vector.
	 * @param v2y
	 *     The value of the y component of the second multiplicant vector.
	 * @param v3
	 *     The addend vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] fma(float v1x, float v1y, float v2x, float v2y, @MinLength(2) float[] v3,
			@ExtractionParam @MinLength(2) float[] res)
	{
		return fma(v1x, v1y, v2x, v2y, v3[0], v3[1], res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1x, v1y)} with the given vector {@code (v2x, v2y)}, adds
	 * the given vector {@code (v3[0], v3[1])} to the product result and saves the result in the
	 * given extraction parameter.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y) * (v2x, v2y) + (v3[0], v3[1])}
	 * 
	 * @param v1x
	 *     The value of the x component of the first multiplicant vector.
	 * @param v1y
	 *     The value of the y component of the first multiplicant vector.
	 * @param v2x
	 *     The value of the x component of the second multiplicant vector.
	 * @param v2y
	 *     The value of the y component of the second multiplicant vector.
	 * @param v3
	 *     The addend vector as an array with at least two entries.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] fma(float v1x, float v1y, float v2x, float v2y, @MinLength(2) float[] v3,
			MathProvider mathProvider, @ExtractionParam @MinLength(2) float[] res)
	{
		return fma(v1x, v1y, v2x, v2y, v3[0], v3[1], mathProvider, res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1x, v1y)} with the given vector {@code (v2x, v2y)}, adds
	 * the given vector {@code (v3x, v3y)} to the product result and saves the result in the given
	 * extraction parameter.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y) * (v2x, v2y) + (v3x, v3y)}
	 * 
	 * @param v1x
	 *     The value of the x component of the first multiplicant vector.
	 * @param v1y
	 *     The value of the y component of the first multiplicant vector.
	 * @param v2x
	 *     The value of the x component of the second multiplicant vector.
	 * @param v2y
	 *     The value of the y component of the second multiplicant vector.
	 * @param v3x
	 *     The value of the x component of the addend vector.
	 * @param v3y
	 *     The value of the y component of the addend vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] fma(float v1x, float v1y, float v2x, float v2y, float v3x, float v3y,
			@ExtractionParam @MinLength(2) float[] res)
	{
		return fma(v1x, v1y, v2x, v2y, v3x, v3y, BarghosMath.PROVIDER, res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1x, v1y)} with the given vector {@code (v2x, v2y)}, adds
	 * the given vector {@code (v3x, v3y)} to the product result and saves the result in the given
	 * extraction parameter.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y) * (v2x, v2y) + (v3x, v3y)}
	 * 
	 * @param v1x
	 *     The value of the x component of the first multiplicant vector.
	 * @param v1y
	 *     The value of the y component of the first multiplicant vector.
	 * @param v2x
	 *     The value of the x component of the second multiplicant vector.
	 * @param v2y
	 *     The value of the y component of the second multiplicant vector.
	 * @param v3x
	 *     The value of the x component of the addend vector.
	 * @param v3y
	 *     The value of the y component of the addend vector.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] fma(float v1x, float v1y, float v2x, float v2y, float v3x, float v3y,
			MathProvider mathProvider, @ExtractionParam @MinLength(2) float[] res)
	{
		res[0] = mathProvider.fma(v1x, v2x, v3x);
		res[1] = mathProvider.fma(v1y, v2y, v3y);
		
		return res;
	}
	
	/**
	 * Multiplies the given vector {@code (v1)} with the given vector {@code (v2)}, adds the given
	 * vector {@code (v3)} to the product result and saves the result in the given extraction
	 * parameter object.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code  v1 * v2 + v3}
	 * 
	 * @param <T>
	 *     The type of the result vector.
	 * 
	 * @param v1
	 *     The first multiplicant vector.
	 * @param v2
	 *     The second multiplicant vector.
	 * @param v3
	 *     The addend vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T fma(Tup2fR v1, Tup2fR v2, Tup2fR v3, @ExtractionParam T res)
	{
		return fma(v1.v0(), v1.v1(), v2.v0(), v2.v1(), v3.v0(), v3.v1(), res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1)} with the given vector {@code (v2)}, adds the given
	 * vector {@code (v3)} to the product result and saves the result in the given extraction
	 * parameter object.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code  v1 * v2 + v3}
	 * 
	 * @param <T>
	 *     The type of the result vector.
	 * 
	 * @param v1
	 *     The first multiplicant vector.
	 * @param v2
	 *     The second multiplicant vector.
	 * @param v3
	 *     The addend vector.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T fma(Tup2fR v1, Tup2fR v2, Tup2fR v3, MathProvider mathProvider,
			@ExtractionParam T res)
	{
		return fma(v1.v0(), v1.v1(), v2.v0(), v2.v1(), v3.v0(), v3.v1(), res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1)} with the given vector {@code (v2)}, adds the given
	 * vector {@code (v3[0], v3[1])} to the product result and saves the result in the given
	 * extraction parameter object.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 * v2 + (v3[0], v3[1])}
	 * 
	 * @param <T>
	 *     The type of the result vector.
	 * 
	 * @param v1
	 *     The first multiplicant vector.
	 * @param v2
	 *     The second multiplicant vector.
	 * @param v3
	 *     The addend vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T fma(Tup2fR v1, Tup2fR v2, @MinLength(2) float[] v3, @ExtractionParam T res)
	{
		return fma(v1.v0(), v1.v1(), v2.v0(), v2.v1(), v3[0], v3[1], res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1)} with the given vector {@code (v2)}, adds the given
	 * vector {@code (v3[0], v3[1])} to the product result and saves the result in the given
	 * extraction parameter object.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 * v2 + (v3[0], v3[1])}
	 * 
	 * @param <T>
	 *     The type of the result vector.
	 * 
	 * @param v1
	 *     The first multiplicant vector.
	 * @param v2
	 *     The second multiplicant vector.
	 * @param v3
	 *     The addend vector as an array with at least two entries.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T fma(Tup2fR v1, Tup2fR v2, @MinLength(2) float[] v3, MathProvider mathProvider,
			@ExtractionParam T res)
	{
		return fma(v1.v0(), v1.v1(), v2.v0(), v2.v1(), v3[0], v3[1], res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1)} with the given vector {@code (v2)}, adds the given
	 * vector {@code (v3x, v3y)} to the product result and saves the result in the given extraction
	 * parameter object.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 * v2 + (v3x, v3y)}
	 * 
	 * @param <T>
	 *     The type of the result vector.
	 * 
	 * @param v1
	 *     The first multiplicant vector.
	 * @param v2
	 *     The second multiplicant vector.
	 * @param v3x
	 *     The value of the x component of the addend vector.
	 * @param v3y
	 *     The value of the y component of the addend vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T fma(Tup2fR v1, Tup2fR v2, float v3x, float v3y, @ExtractionParam T res)
	{
		return fma(v1.v0(), v1.v1(), v2.v0(), v2.v1(), v3x, v3y, res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1)} with the given vector {@code (v2)}, adds the given
	 * vector {@code (v3x, v3y)} to the product result and saves the result in the given extraction
	 * parameter object.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 * v2 + (v3x, v3y)}
	 * 
	 * @param <T>
	 *     The type of the result vector.
	 * 
	 * @param v1
	 *     The first multiplicant vector.
	 * @param v2
	 *     The second multiplicant vector.
	 * @param v3x
	 *     The value of the x component of the addend vector.
	 * @param v3y
	 *     The value of the y component of the addend vector.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T fma(Tup2fR v1, Tup2fR v2, float v3x, float v3y, MathProvider mathProvider,
			@ExtractionParam T res)
	{
		return fma(v1.v0(), v1.v1(), v2.v0(), v2.v1(), v3x, v3y, res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1)} with the given vector {@code (v2[0], v2[1])}, adds
	 * the given vector {@code (v3)} to the product result and saves the result in the given
	 * extraction parameter object.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 * (v2[0], v2[1]) + v3}
	 * 
	 * @param <T>
	 *     The type of the result vector.
	 * 
	 * @param v1
	 *     The first multiplicant vector.
	 * @param v2
	 *     The second multiplicant vector as an array with at least two entries.
	 * @param v3
	 *     The addend vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T fma(Tup2fR v1, @MinLength(2) float[] v2, Tup2fR v3, @ExtractionParam T res)
	{
		return fma(v1.v0(), v1.v1(), v2[0], v2[1], v3.v0(), v3.v1(), res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1)} with the given vector {@code (v2[0], v2[1])}, adds
	 * the given vector {@code (v3)} to the product result and saves the result in the given
	 * extraction parameter object.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 * (v2[0], v2[1]) + v3}
	 * 
	 * @param <T>
	 *     The type of the result vector.
	 * 
	 * @param v1
	 *     The first multiplicant vector.
	 * @param v2
	 *     The second multiplicant vector as an array with at least two entries.
	 * @param v3
	 *     The addend vector.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T fma(Tup2fR v1, @MinLength(2) float[] v2, Tup2fR v3, MathProvider mathProvider,
			@ExtractionParam T res)
	{
		return fma(v1.v0(), v1.v1(), v2[0], v2[1], v3.v0(), v3.v1(), res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1)} with the given vector {@code (v2[0], v2[1])}, adds
	 * the given vector {@code (v3[0], v3[1])} to the product result and saves the result in the
	 * given extraction parameter object.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 * (v2[0], v2[1]) + (v3[0], v3[1])}
	 * 
	 * @param <T>
	 *     The type of the result vector.
	 * 
	 * @param v1
	 *     The first multiplicant vector.
	 * @param v2
	 *     The second multiplicant vector as an array with at least two entries.
	 * @param v3
	 *     The addend vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T fma(Tup2fR v1, @MinLength(2) float[] v2, @MinLength(2) float[] v3,
			@ExtractionParam T res)
	{
		return fma(v1.v0(), v1.v1(), v2[0], v2[1], v3[0], v3[1], res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1)} with the given vector {@code (v2[0], v2[1])}, adds
	 * the given vector {@code (v3[0], v3[1])} to the product result and saves the result in the
	 * given extraction parameter object.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 * (v2[0], v2[1]) + (v3[0], v3[1])}
	 * 
	 * @param <T>
	 *     The type of the result vector.
	 * 
	 * @param v1
	 *     The first multiplicant vector.
	 * @param v2
	 *     The second multiplicant vector as an array with at least two entries.
	 * @param v3
	 *     The addend vector as an array with at least two entries.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T fma(Tup2fR v1, @MinLength(2) float[] v2, @MinLength(2) float[] v3,
			MathProvider mathProvider, @ExtractionParam T res)
	{
		return fma(v1.v0(), v1.v1(), v2[0], v2[1], v3[0], v3[1], mathProvider, res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1)} with the given vector {@code (v2[0], v2[1])}, adds
	 * the given vector {@code (v3x, v3y)} to the product result and saves the result in the given
	 * extraction parameter object.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 * (v2[0], v2[1]) + (v3x, v3y)}
	 * 
	 * @param <T>
	 *     The type of the result vector.
	 * 
	 * @param v1
	 *     The first multiplicant vector.
	 * @param v2
	 *     The second multiplicant vector as an array with at least two entries.
	 * @param v3x
	 *     The value of the x component of the addend vector.
	 * @param v3y
	 *     The value of the y component of the addend vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T fma(Tup2fR v1, @MinLength(2) float[] v2, float v3x, float v3y,
			@ExtractionParam T res)
	{
		return fma(v1.v0(), v1.v1(), v2[0], v2[1], v3x, v3y, res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1)} with the given vector {@code (v2[0], v2[1])}, adds
	 * the given vector {@code (v3x, v3y)} to the product result and saves the result in the given
	 * extraction parameter object.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 * (v2[0], v2[1]) + (v3x, v3y)}
	 * 
	 * @param <T>
	 *     The type of the result vector.
	 * 
	 * @param v1
	 *     The first multiplicant vector.
	 * @param v2
	 *     The second multiplicant vector as an array with at least two entries.
	 * @param v3x
	 *     The value of the x component of the addend vector.
	 * @param v3y
	 *     The value of the y component of the addend vector.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T fma(Tup2fR v1, @MinLength(2) float[] v2, float v3x, float v3y,
			MathProvider mathProvider, @ExtractionParam T res)
	{
		return fma(v1.v0(), v1.v1(), v2[0], v2[1], v3x, v3y, mathProvider, res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1)} with the given vector {@code (v2x, v2y)}, adds the
	 * given vector {@code (v3)} to the product result and saves the result in the given extraction
	 * parameter object.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 * (v2x, v2y) + v3}
	 * 
	 * @param <T>
	 *     The type of the result vector.
	 * 
	 * @param v1
	 *     The first multiplicant vector.
	 * @param v2x
	 *     The value of the x component of the second multiplicant vector.
	 * @param v2y
	 *     The value of the y component of the second multiplicant vector.
	 * @param v3
	 *     The addend vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T fma(Tup2fR v1, float v2x, float v2y, Tup2fR v3, @ExtractionParam T res)
	{
		return fma(v1.v0(), v1.v1(), v2x, v2y, v3.v0(), v3.v1(), res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1)} with the given vector {@code (v2x, v2y)}, adds the
	 * given vector {@code (v3)} to the product result and saves the result in the given extraction
	 * parameter object.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 * (v2x, v2y) + v3}
	 * 
	 * @param <T>
	 *     The type of the result vector.
	 * 
	 * @param v1
	 *     The first multiplicant vector.
	 * @param v2x
	 *     The value of the x component of the second multiplicant vector.
	 * @param v2y
	 *     The value of the y component of the second multiplicant vector.
	 * @param v3
	 *     The addend vector.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T fma(Tup2fR v1, float v2x, float v2y, Tup2fR v3, MathProvider mathProvider,
			@ExtractionParam T res)
	{
		return fma(v1.v0(), v1.v1(), v2x, v2y, v3.v0(), v3.v1(), mathProvider, res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1)} with the given vector {@code (v2x, v2y)}, adds the
	 * given vector {@code (v3[0], v3[1])} to the product result and saves the result in the given
	 * extraction parameter object.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 * (v2x, v2y) + (v3[0], v3[1])}
	 * 
	 * @param <T>
	 *     The type of the result vector.
	 * 
	 * @param v1
	 *     The first multiplicant vector.
	 * @param v2x
	 *     The value of the x component of the second multiplicant vector.
	 * @param v2y
	 *     The value of the y component of the second multiplicant vector.
	 * @param v3
	 *     The addend vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T fma(Tup2fR v1, float v2x, float v2y, @MinLength(2) float[] v3,
			@ExtractionParam T res)
	{
		return fma(v1.v0(), v1.v1(), v2x, v2y, v3[0], v3[1], res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1)} with the given vector {@code (v2x, v2y)}, adds the
	 * given vector {@code (v3[0], v3[1])} to the product result and saves the result in the given
	 * extraction parameter object.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 * (v2x, v2y) + (v3[0], v3[1])}
	 * 
	 * @param <T>
	 *     The type of the result vector.
	 * 
	 * @param v1
	 *     The first multiplicant vector.
	 * @param v2x
	 *     The value of the x component of the second multiplicant vector.
	 * @param v2y
	 *     The value of the y component of the second multiplicant vector.
	 * @param v3
	 *     The addend vector as an array with at least two entries.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T fma(Tup2fR v1, float v2x, float v2y, @MinLength(2) float[] v3,
			MathProvider mathProvider, @ExtractionParam T res)
	{
		return fma(v1.v0(), v1.v1(), v2x, v2y, v3[0], v3[1], mathProvider, res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1)} with the given vector {@code (v2x, v2y)}, adds the
	 * given vector {@code (v3x, v3y)} to the product result and saves the result in the given
	 * extraction parameter object.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 * (v2x, v2y) + (v3x, v3y)}
	 * 
	 * @param <T>
	 *     The type of the result vector.
	 * 
	 * @param v1
	 *     The first multiplicant vector as an array with at least two entries.
	 * @param v2x
	 *     The value of the x component of the second multiplicant vector.
	 * @param v2y
	 *     The value of the y component of the second multiplicant vector.
	 * @param v3x
	 *     The value of the x component of the addend vector.
	 * @param v3y
	 *     The value of the y component of the addend vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T fma(Tup2fR v1, float v2x, float v2y, float v3x, float v3y,
			@ExtractionParam T res)
	{
		return fma(v1.v0(), v1.v1(), v2x, v2y, v3x, v3y, res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1)} with the given vector {@code (v2x, v2y)}, adds the
	 * given vector {@code (v3x, v3y)} to the product result and saves the result in the given
	 * extraction parameter object.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 * (v2x, v2y) + (v3x, v3y)}
	 * 
	 * @param <T>
	 *     The type of the result vector.
	 * 
	 * @param v1
	 *     The first multiplicant vector as an array with at least two entries.
	 * @param v2x
	 *     The value of the x component of the second multiplicant vector.
	 * @param v2y
	 *     The value of the y component of the second multiplicant vector.
	 * @param v3x
	 *     The value of the x component of the addend vector.
	 * @param v3y
	 *     The value of the y component of the addend vector.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T fma(Tup2fR v1, float v2x, float v2y, float v3x, float v3y,
			MathProvider mathProvider, @ExtractionParam T res)
	{
		return fma(v1.v0(), v1.v1(), v2x, v2y, v3x, v3y, res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1[0], v1[1])} with the given vector {@code (v2)}, adds
	 * the given vector {@code (v3)} to the product result and saves the result in the given
	 * extraction parameter object.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1]) * v2 + v3}
	 * 
	 * @param <T>
	 *     The type of the result vector.
	 * 
	 * @param v1
	 *     The first multiplicant vector as an array with at least two entries.
	 * @param v2
	 *     The second multiplicant vector.
	 * @param v3
	 *     The addend vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T fma(@MinLength(2) float[] v1, Tup2fR v2, Tup2fR v3, @ExtractionParam T res)
	{
		return fma(v1[0], v1[1], v2.v0(), v2.v1(), v3.v0(), v3.v1(), res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1[0], v1[1])} with the given vector {@code (v2)}, adds
	 * the given vector {@code (v3)} to the product result and saves the result in the given
	 * extraction parameter object.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1]) * v2 + v3}
	 * 
	 * @param <T>
	 *     The type of the result vector.
	 * 
	 * @param v1
	 *     The first multiplicant vector as an array with at least two entries.
	 * @param v2
	 *     The second multiplicant vector.
	 * @param v3
	 *     The addend vector.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T fma(@MinLength(2) float[] v1, Tup2fR v2, Tup2fR v3, MathProvider mathProvider,
			@ExtractionParam T res)
	{
		return fma(v1[0], v1[1], v2.v0(), v2.v1(), v3.v0(), v3.v1(), res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1[0], v1[1])} with the given vector {@code (v2)}, adds
	 * the given vector {@code (v3[0], v3[1])} to the product result and saves the result in the
	 * given extraction parameter object.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1]) * v2 + (v3[0], v3[1])}
	 * 
	 * @param <T>
	 *     The type of the result vector.
	 * 
	 * @param v1
	 *     The first multiplicant vector as an array with at least two entries.
	 * @param v2
	 *     The second multiplicant vector.
	 * @param v3
	 *     The addend vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T fma(@MinLength(2) float[] v1, Tup2fR v2, @MinLength(2) float[] v3,
			@ExtractionParam T res)
	{
		return fma(v1[0], v1[1], v2.v0(), v2.v1(), v3[0], v3[1], res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1[0], v1[1])} with the given vector {@code (v2)}, adds
	 * the given vector {@code (v3[0], v3[1])} to the product result and saves the result in the
	 * given extraction parameter object.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1]) * v2 + (v3[0], v3[1])}
	 * 
	 * @param <T>
	 *     The type of the result vector.
	 * 
	 * @param v1
	 *     The first multiplicant vector as an array with at least two entries.
	 * @param v2
	 *     The second multiplicant vector.
	 * @param v3
	 *     The addend vector as an array with at least two entries.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T fma(@MinLength(2) float[] v1, Tup2fR v2, @MinLength(2) float[] v3,
			MathProvider mathProvider, @ExtractionParam T res)
	{
		return fma(v1[0], v1[1], v2.v0(), v2.v1(), v3[0], v3[1], mathProvider, res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1[0], v1[1])} with the given vector {@code (v2)}, adds
	 * the given vector {@code (v3x, v3y)} to the product result and saves the result in the given
	 * extraction parameter object.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1]) * v2 + (v3x, v3y)}
	 * 
	 * @param <T>
	 *     The type of the result vector.
	 * 
	 * @param v1
	 *     The first multiplicant vector as an array with at least two entries.
	 * @param v2
	 *     The second multiplicant vector.
	 * @param v3x
	 *     The value of the x component of the addend vector.
	 * @param v3y
	 *     The value of the y component of the addend vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T fma(@MinLength(2) float[] v1, Tup2fR v2, float v3x, float v3y,
			@ExtractionParam T res)
	{
		return fma(v1[0], v1[1], v2.v0(), v2.v1(), v3x, v3y, res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1[0], v1[1])} with the given vector {@code (v2)}, adds
	 * the given vector {@code (v3x, v3y)} to the product result and saves the result in the given
	 * extraction parameter object.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1]) * v2 + (v3x, v3y)}
	 * 
	 * @param <T>
	 *     The type of the result vector.
	 * 
	 * @param v1
	 *     The first multiplicant vector as an array with at least two entries.
	 * @param v2
	 *     The second multiplicant vector.
	 * @param v3x
	 *     The value of the x component of the addend vector.
	 * @param v3y
	 *     The value of the y component of the addend vector.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T fma(@MinLength(2) float[] v1, Tup2fR v2, float v3x, float v3y,
			MathProvider mathProvider, @ExtractionParam T res)
	{
		return fma(v1[0], v1[1], v2.v0(), v2.v1(), v3x, v3y, mathProvider, res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1[0], v1[1])} with the given vector
	 * {@code (v2[0], v2[1])}, adds the given vector {@code (v3)} to the product result and saves
	 * the result in the given extraction parameter object.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1]) * (v2[0], v2[1]) + v3}
	 * 
	 * @param <T>
	 *     The type of the result vector.
	 * 
	 * @param v1
	 *     The first multiplicant vector as an array with at least two entries.
	 * @param v2
	 *     The second multiplicant vector as an array with at least two entries.
	 * @param v3
	 *     The addend vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T fma(@MinLength(2) float[] v1, @MinLength(2) float[] v2, Tup2fR v3,
			@ExtractionParam T res)
	{
		return fma(v1[0], v1[1], v2[0], v2[1], v3.v0(), v3.v1(), res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1[0], v1[1])} with the given vector
	 * {@code (v2[0], v2[1])}, adds the given vector {@code (v3)} to the product result and saves
	 * the result in the given extraction parameter object.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1]) * (v2[0], v2[1]) + v3}
	 * 
	 * @param <T>
	 *     The type of the result vector.
	 * 
	 * @param v1
	 *     The first multiplicant vector as an array with at least two entries.
	 * @param v2
	 *     The second multiplicant vector as an array with at least two entries.
	 * @param v3
	 *     The addend vector.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T fma(@MinLength(2) float[] v1, @MinLength(2) float[] v2, Tup2fR v3,
			MathProvider mathProvider, @ExtractionParam T res)
	{
		return fma(v1[0], v1[1], v2[0], v2[1], v3.v0(), v3.v1(), mathProvider, res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1[0], v1[1])} with the given vector
	 * {@code (v2[0], v2[1])}, adds the given vector {@code (v3[0], v3[1])} to the product result
	 * and saves the result in the given extraction parameter object.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1]) * (v2[0], v2[1]) + (v3[0], v3[1])}
	 * 
	 * @param <T>
	 *     The type of the result vector.
	 * 
	 * @param v1
	 *     The first multiplicant vector as an array with at least two entries.
	 * @param v2
	 *     The second multiplicant vector as an array with at least two entries.
	 * @param v3
	 *     The addend vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T fma(@MinLength(2) float[] v1, @MinLength(2) float[] v2, @MinLength(2) float[] v3,
			@ExtractionParam T res)
	{
		return fma(v1[0], v1[1], v2[0], v2[1], v3[0], v3[1], res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1[0], v1[1])} with the given vector
	 * {@code (v2[0], v2[1])}, adds the given vector {@code (v3[0], v3[1])} to the product result
	 * and saves the result in the given extraction parameter object.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1]) * (v2[0], v2[1]) + (v3[0], v3[1])}
	 * 
	 * @param <T>
	 *     The type of the result vector.
	 * 
	 * @param v1
	 *     The first multiplicant vector as an array with at least two entries.
	 * @param v2
	 *     The second multiplicant vector as an array with at least two entries.
	 * @param v3
	 *     The addend vector as an array with at least two entries.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T fma(@MinLength(2) float[] v1, @MinLength(2) float[] v2, @MinLength(2) float[] v3,
			MathProvider mathProvider, @ExtractionParam T res)
	{
		return fma(v1[0], v1[1], v2[0], v2[1], v3[0], v3[1], mathProvider, res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1[0], v1[1])} with the given vector
	 * {@code (v2[0], v2[1])}, adds the given vector {@code (v3x, v3y)} to the product result and
	 * saves the result in the given extraction parameter object.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1]) * (v2[0], v2[1]) + (v3x, v3y)}
	 * 
	 * @param <T>
	 *     The type of the result vector.
	 * 
	 * @param v1
	 *     The first multiplicant vector as an array with at least two entries.
	 * @param v2
	 *     The second multiplicant vector as an array with at least two entries.
	 * @param v3x
	 *     The value of the x component of the addend vector.
	 * @param v3y
	 *     The value of the y component of the addend vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T fma(@MinLength(2) float[] v1, @MinLength(2) float[] v2, float v3x, float v3y,
			@ExtractionParam T res)
	{
		return fma(v1[0], v1[1], v2[0], v2[1], v3x, v3y, res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1[0], v1[1])} with the given vector
	 * {@code (v2[0], v2[1])}, adds the given vector {@code (v3x, v3y)} to the product result and
	 * saves the result in the given extraction parameter object.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1]) * (v2[0], v2[1]) + (v3x, v3y)}
	 * 
	 * @param <T>
	 *     The type of the result vector.
	 * 
	 * @param v1
	 *     The first multiplicant vector as an array with at least two entries.
	 * @param v2
	 *     The second multiplicant vector as an array with at least two entries.
	 * @param v3x
	 *     The value of the x component of the addend vector.
	 * @param v3y
	 *     The value of the y component of the addend vector.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T fma(@MinLength(2) float[] v1, @MinLength(2) float[] v2, float v3x, float v3y,
			MathProvider mathProvider, @ExtractionParam T res)
	{
		return fma(v1[0], v1[1], v2[0], v2[1], v3x, v3y, mathProvider, res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1[0], v1[1])} with the given vector {@code (v2x, v2y)},
	 * adds the given vector {@code (v3)} to the product result and saves the result in the given
	 * extraction parameter object.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1]) * (v2x, v2y) + v3}
	 * 
	 * @param <T>
	 *     The type of the result vector.
	 * 
	 * @param v1
	 *     The first multiplicant vector as an array with at least two entries.
	 * @param v2x
	 *     The value of the x component of the second multiplicant vector.
	 * @param v2y
	 *     The value of the y component of the second multiplicant vector.
	 * @param v3
	 *     The addend vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T fma(@MinLength(2) float[] v1, float v2x, float v2y, Tup2fR v3,
			@ExtractionParam T res)
	{
		return fma(v1[0], v1[1], v2x, v2y, v3.v0(), v3.v1(), res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1[0], v1[1])} with the given vector {@code (v2x, v2y)},
	 * adds the given vector {@code (v3)} to the product result and saves the result in the given
	 * extraction parameter object.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1]) * (v2x, v2y) + v3}
	 * 
	 * @param <T>
	 *     The type of the result vector.
	 * 
	 * @param v1
	 *     The first multiplicant vector as an array with at least two entries.
	 * @param v2x
	 *     The value of the x component of the second multiplicant vector.
	 * @param v2y
	 *     The value of the y component of the second multiplicant vector.
	 * @param v3
	 *     The addend vector.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T fma(@MinLength(2) float[] v1, float v2x, float v2y, Tup2fR v3,
			MathProvider mathProvider, @ExtractionParam T res)
	{
		return fma(v1[0], v1[1], v2x, v2y, v3.v0(), v3.v1(), mathProvider, res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1[0], v1[1])} with the given vector {@code (v2x, v2y)},
	 * adds the given vector {@code (v3[0], v3[1])} to the product result and saves the result in
	 * the given extraction parameter object.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1]) * (v2x, v2y) + (v3[0], v3[1])}
	 * 
	 * @param <T>
	 *     The type of the result vector.
	 * 
	 * @param v1
	 *     The first multiplicant vector as an array with at least two entries.
	 * @param v2x
	 *     The value of the x component of the second multiplicant vector.
	 * @param v2y
	 *     The value of the y component of the second multiplicant vector.
	 * @param v3
	 *     The addend vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T fma(@MinLength(2) float[] v1, float v2x, float v2y, @MinLength(2) float[] v3,
			@ExtractionParam T res)
	{
		return fma(v1[0], v1[1], v2x, v2y, v3[0], v3[1], res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1[0], v1[1])} with the given vector {@code (v2x, v2y)},
	 * adds the given vector {@code (v3[0], v3[1])} to the product result and saves the result in
	 * the given extraction parameter object.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1]) * (v2x, v2y) + (v3[0], v3[1])}
	 * 
	 * @param <T>
	 *     The type of the result vector.
	 * 
	 * @param v1
	 *     The first multiplicant vector as an array with at least two entries.
	 * @param v2x
	 *     The value of the x component of the second multiplicant vector.
	 * @param v2y
	 *     The value of the y component of the second multiplicant vector.
	 * @param v3
	 *     The addend vector as an array with at least two entries.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T fma(@MinLength(2) float[] v1, float v2x, float v2y, @MinLength(2) float[] v3,
			MathProvider mathProvider, @ExtractionParam T res)
	{
		return fma(v1[0], v1[1], v2x, v2y, v3[0], v3[1], mathProvider, res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1[0], v1[1])} with the given vector {@code (v2x, v2y)},
	 * adds the given vector {@code (v3x, v3y)} to the product result and saves the result in the
	 * given extraction parameter object.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1]) * (v2x, v2y) + (v3x, v3y)}
	 * 
	 * @param <T>
	 *     The type of the result vector.
	 * 
	 * @param v1
	 *     The first multiplicant vector as an array with at least two entries.
	 * @param v2x
	 *     The value of the x component of the second multiplicant vector.
	 * @param v2y
	 *     The value of the y component of the second multiplicant vector.
	 * @param v3x
	 *     The value of the x component of the addend vector.
	 * @param v3y
	 *     The value of the y component of the addend vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T fma(@MinLength(2) float[] v1, float v2x, float v2y, float v3x, float v3y,
			@ExtractionParam T res)
	{
		return fma(v1[0], v1[1], v2x, v2y, v3x, v3y, res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1[0], v1[1])} with the given vector {@code (v2x, v2y)},
	 * adds the given vector {@code (v3x, v3y)} to the product result and saves the result in the
	 * given extraction parameter object.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1]) * (v2x, v2y) + (v3x, v3y)}
	 * 
	 * @param <T>
	 *     The type of the result vector.
	 * 
	 * @param v1
	 *     The first multiplicant vector as an array with at least two entries.
	 * @param v2x
	 *     The value of the x component of the second multiplicant vector.
	 * @param v2y
	 *     The value of the y component of the second multiplicant vector.
	 * @param v3x
	 *     The value of the x component of the addend vector.
	 * @param v3y
	 *     The value of the y component of the addend vector.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T fma(@MinLength(2) float[] v1, float v2x, float v2y, float v3x, float v3y,
			MathProvider mathProvider, @ExtractionParam T res)
	{
		return fma(v1[0], v1[1], v2x, v2y, v3x, v3y, mathProvider, res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1x, v1y)} with the given vector {@code (v2)}, adds the
	 * given vector {@code (v3)} to the product result and saves the result in the given extraction
	 * parameter object.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y) * v2 + v3}
	 * 
	 * @param <T>
	 *     The type of the result vector.
	 * 
	 * @param v1x
	 *     The value of the x component of the first multiplicant vector.
	 * @param v1y
	 *     The value of the y component of the first multiplicant vector.
	 * @param v2
	 *     The second multiplicant vector.
	 * @param v3
	 *     The addend vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T fma(float v1x, float v1y, Tup2fR v2, Tup2fR v3, @ExtractionParam T res)
	{
		return fma(v1x, v1y, v2.v0(), v2.v1(), v3.v0(), v3.v1(), res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1x, v1y)} with the given vector {@code (v2)}, adds the
	 * given vector {@code (v3)} to the product result and saves the result in the given extraction
	 * parameter object.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y) * v2 + v3}
	 * 
	 * @param <T>
	 *     The type of the result vector.
	 * 
	 * @param v1x
	 *     The value of the x component of the first multiplicant vector.
	 * @param v1y
	 *     The value of the y component of the first multiplicant vector.
	 * @param v2
	 *     The second multiplicant vector.
	 * @param v3
	 *     The addend vector.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T fma(float v1x, float v1y, Tup2fR v2, Tup2fR v3, MathProvider mathProvider,
			@ExtractionParam T res)
	{
		return fma(v1x, v1y, v2.v0(), v2.v1(), v3.v0(), v3.v1(), mathProvider, res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1x, v1y)} with the given vector {@code (v2)}, adds the
	 * given vector {@code (v3[0], v3[1])} to the product result and saves the result in the given
	 * extraction parameter object.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y) * v2 + (v3[0], v3[1])}
	 * 
	 * @param <T>
	 *     The type of the result vector.
	 * 
	 * @param v1x
	 *     The value of the x component of the first multiplicant vector.
	 * @param v1y
	 *     The value of the y component of the first multiplicant vector.
	 * @param v2
	 *     The second multiplicant vector.
	 * @param v3
	 *     The addend vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T fma(float v1x, float v1y, Tup2fR v2, @MinLength(2) float[] v3,
			@ExtractionParam T res)
	{
		return fma(v1x, v1y, v2.v0(), v2.v1(), v3[0], v3[1], res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1x, v1y)} with the given vector {@code (v2)}, adds the
	 * given vector {@code (v3[0], v3[1])} to the product result and saves the result in the given
	 * extraction parameter object.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y) * v2 + (v3[0], v3[1])}
	 * 
	 * @param <T>
	 *     The type of the result vector.
	 * 
	 * @param v1x
	 *     The value of the x component of the first multiplicant vector.
	 * @param v1y
	 *     The value of the y component of the first multiplicant vector.
	 * @param v2
	 *     The second multiplicant vector.
	 * @param v3
	 *     The addend vector as an array with at least two entries.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T fma(float v1x, float v1y, Tup2fR v2, @MinLength(2) float[] v3,
			MathProvider mathProvider, @ExtractionParam T res)
	{
		return fma(v1x, v1y, v2.v0(), v2.v1(), v3[0], v3[1], mathProvider, res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1x, v1y)} with the given vector {@code (v2)}, adds the
	 * given vector {@code (v3x, v3y)} to the product result and saves the result in the given
	 * extraction parameter object.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y) * v2 + (v3x, v3y)}
	 * 
	 * @param <T>
	 *     The type of the result vector.
	 * 
	 * @param v1x
	 *     The value of the x component of the first multiplicant vector.
	 * @param v1y
	 *     The value of the y component of the first multiplicant vector.
	 * @param v2
	 *     The second multiplicant vector.
	 * @param v3x
	 *     The value of the x component of the addend vector.
	 * @param v3y
	 *     The value of the y component of the addend vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T fma(float v1x, float v1y, Tup2fR v2, float v3x, float v3y,
			@ExtractionParam T res)
	{
		return fma(v1x, v1y, v2.v0(), v2.v1(), v3x, v3y, res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1x, v1y)} with the given vector {@code (v2)}, adds the
	 * given vector {@code (v3x, v3y)} to the product result and saves the result in the given
	 * extraction parameter object.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y) * v2 + (v3x, v3y)}
	 * 
	 * @param <T>
	 *     The type of the result vector.
	 * 
	 * @param v1x
	 *     The value of the x component of the first multiplicant vector.
	 * @param v1y
	 *     The value of the y component of the first multiplicant vector.
	 * @param v2
	 *     The second multiplicant vector.
	 * @param v3x
	 *     The value of the x component of the addend vector.
	 * @param v3y
	 *     The value of the y component of the addend vector.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T fma(float v1x, float v1y, Tup2fR v2, float v3x, float v3y,
			MathProvider mathProvider, @ExtractionParam T res)
	{
		return fma(v1x, v1y, v2.v0(), v2.v1(), v3x, v3y, res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1x, v1y)} with the given vector {@code (v2[0], v2[1])},
	 * adds the given vector {@code (v3)} to the product result and saves the result in the given
	 * extraction parameter object.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y) * (v2[0], v2[1]) + v3}
	 * 
	 * @param <T>
	 *     The type of the result vector.
	 * 
	 * @param v1x
	 *     The value of the x component of the first multiplicant vector.
	 * @param v1y
	 *     The value of the y component of the first multiplicant vector.
	 * @param v2
	 *     The second multiplicant vector as an array with at least two entries.
	 * @param v3
	 *     The addend vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T fma(float v1x, float v1y, @MinLength(2) float[] v2, Tup2fR v3,
			@ExtractionParam T res)
	{
		return fma(v1x, v1y, v2[0], v2[1], v3.v0(), v3.v1(), res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1x, v1y)} with the given vector {@code (v2[0], v2[1])},
	 * adds the given vector {@code (v3)} to the product result and saves the result in the given
	 * extraction parameter object.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y) * (v2[0], v2[1]) + v3}
	 * 
	 * @param <T>
	 *     The type of the result vector.
	 * 
	 * @param v1x
	 *     The value of the x component of the first multiplicant vector.
	 * @param v1y
	 *     The value of the y component of the first multiplicant vector.
	 * @param v2
	 *     The second multiplicant vector as an array with at least two entries.
	 * @param v3
	 *     The addend vector.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T fma(float v1x, float v1y, @MinLength(2) float[] v2, Tup2fR v3,
			MathProvider mathProvider, @ExtractionParam T res)
	{
		return fma(v1x, v1y, v2[0], v2[1], v3.v0(), v3.v1(), mathProvider, res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1x, v1y)} with the given vector {@code (v2[0], v2[1])},
	 * adds the given vector {@code (v3[0], v3[1])} to the product result and saves the result in
	 * the given extraction parameter object.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y) * (v2[0], v2[1]) + (v3[0], v3[1])}
	 * 
	 * @param <T>
	 *     The type of the result vector.
	 * 
	 * @param v1x
	 *     The value of the x component of the first multiplicant vector.
	 * @param v1y
	 *     The value of the y component of the first multiplicant vector.
	 * @param v2
	 *     The second multiplicant vector as an array with at least two entries.
	 * @param v3
	 *     The addend vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T fma(float v1x, float v1y, @MinLength(2) float[] v2, @MinLength(2) float[] v3,
			@ExtractionParam T res)
	{
		return fma(v1x, v1y, v2[0], v2[1], v3[0], v3[1], res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1x, v1y)} with the given vector {@code (v2[0], v2[1])},
	 * adds the given vector {@code (v3[0], v3[1])} to the product result and saves the result in
	 * the given extraction parameter object.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y) * (v2[0], v2[1]) + (v3[0], v3[1])}
	 * 
	 * @param <T>
	 *     The type of the result vector.
	 * 
	 * @param v1x
	 *     The value of the x component of the first multiplicant vector.
	 * @param v1y
	 *     The value of the y component of the first multiplicant vector.
	 * @param v2
	 *     The second multiplicant vector as an array with at least two entries.
	 * @param v3
	 *     The addend vector as an array with at least two entries.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T fma(float v1x, float v1y, @MinLength(2) float[] v2, @MinLength(2) float[] v3,
			MathProvider mathProvider, @ExtractionParam T res)
	{
		return fma(v1x, v1y, v2[0], v2[1], v3[0], v3[1], mathProvider, res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1x, v1y)} with the given vector {@code (v2[0], v2[1])},
	 * adds the given vector {@code (v3x, v3y)} to the product result and saves the result in the
	 * given extraction parameter object.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y) * (v2[0], v2[1]) + (v3x, v3y)}
	 * 
	 * @param <T>
	 *     The type of the result vector.
	 * 
	 * @param v1x
	 *     The value of the x component of the first multiplicant vector.
	 * @param v1y
	 *     The value of the y component of the first multiplicant vector.
	 * @param v2
	 *     The second multiplicant vector as an array with at least two entries.
	 * @param v3x
	 *     The value of the x component of the addend vector.
	 * @param v3y
	 *     The value of the y component of the addend vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T fma(float v1x, float v1y, @MinLength(2) float[] v2, float v3x, float v3y,
			@ExtractionParam T res)
	{
		return fma(v1x, v1y, v2[0], v2[1], v3x, v3y, res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1x, v1y)} with the given vector {@code (v2[0], v2[1])},
	 * adds the given vector {@code (v3x, v3y)} to the product result and saves the result in the
	 * given extraction parameter object.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y) * (v2[0], v2[1]) + (v3x, v3y)}
	 * 
	 * @param <T>
	 *     The type of the result vector.
	 * 
	 * @param v1x
	 *     The value of the x component of the first multiplicant vector.
	 * @param v1y
	 *     The value of the y component of the first multiplicant vector.
	 * @param v2
	 *     The second multiplicant vector as an array with at least two entries.
	 * @param v3x
	 *     The value of the x component of the addend vector.
	 * @param v3y
	 *     The value of the y component of the addend vector.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T fma(float v1x, float v1y, @MinLength(2) float[] v2, float v3x, float v3y,
			MathProvider mathProvider, @ExtractionParam T res)
	{
		return fma(v1x, v1y, v2[0], v2[1], v3x, v3y, mathProvider, res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1x, v1y)} with the given vector {@code (v2x, v2y)}, adds
	 * the given vector {@code (v3)} to the product result and saves the result in the given
	 * extraction parameter object.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y) * (v2x, v2y) + v3}
	 * 
	 * @param <T>
	 *     The type of the result vector.
	 * 
	 * @param v1x
	 *     The value of the x component of the first multiplicant vector.
	 * @param v1y
	 *     The value of the y component of the first multiplicant vector.
	 * @param v2x
	 *     The value of the x component of the second multiplicant vector.
	 * @param v2y
	 *     The value of the y component of the second multiplicant vector.
	 * @param v3
	 *     The addend vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T fma(float v1x, float v1y, float v2x, float v2y, Tup2fR v3,
			@ExtractionParam T res)
	{
		return fma(v1x, v1y, v2x, v2y, v3.v0(), v3.v1(), res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1x, v1y)} with the given vector {@code (v2x, v2y)}, adds
	 * the given vector {@code (v3)} to the product result and saves the result in the given
	 * extraction parameter object.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y) * (v2x, v2y) + v3}
	 * 
	 * @param <T>
	 *     The type of the result vector.
	 * 
	 * @param v1x
	 *     The value of the x component of the first multiplicant vector.
	 * @param v1y
	 *     The value of the y component of the first multiplicant vector.
	 * @param v2x
	 *     The value of the x component of the second multiplicant vector.
	 * @param v2y
	 *     The value of the y component of the second multiplicant vector.
	 * @param v3
	 *     The addend vector.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T fma(float v1x, float v1y, float v2x, float v2y, Tup2fR v3,
			MathProvider mathProvider, @ExtractionParam T res)
	{
		return fma(v1x, v1y, v2x, v2y, v3.v0(), v3.v1(), mathProvider, res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1x, v1y)} with the given vector {@code (v2x, v2y)}, adds
	 * the given vector {@code (v3[0], v3[1])} to the product result and saves the result in the
	 * given extraction parameter object.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y) * (v2x, v2y) + (v3[0], v3[1])}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter.
	 * 
	 * @param v1x
	 *     The value of the x component of the first multiplicant vector.
	 * @param v1y
	 *     The value of the y component of the first multiplicant vector.
	 * @param v2x
	 *     The value of the x component of the second multiplicant vector.
	 * @param v2y
	 *     The value of the y component of the second multiplicant vector.
	 * @param v3
	 *     The addend vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T fma(float v1x, float v1y, float v2x, float v2y, @MinLength(2) float[] v3,
			@ExtractionParam T res)
	{
		return fma(v1x, v1y, v2x, v2y, v3[0], v3[1], res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1x, v1y)} with the given vector {@code (v2x, v2y)}, adds
	 * the given vector {@code (v3[0], v3[1])} to the product result and saves the result in the
	 * given extraction parameter object.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y) * (v2x, v2y) + (v3[0], v3[1])}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter.
	 * 
	 * @param v1x
	 *     The value of the x component of the first multiplicant vector.
	 * @param v1y
	 *     The value of the y component of the first multiplicant vector.
	 * @param v2x
	 *     The value of the x component of the second multiplicant vector.
	 * @param v2y
	 *     The value of the y component of the second multiplicant vector.
	 * @param v3
	 *     The addend vector as an array with at least two entries.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T fma(float v1x, float v1y, float v2x, float v2y, @MinLength(2) float[] v3,
			MathProvider mathProvider, @ExtractionParam T res)
	{
		return fma(v1x, v1y, v2x, v2y, v3[0], v3[1], mathProvider, res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1x, v1y)} with the given vector {@code (v2x, v2y)}, adds
	 * the given vector {@code (v3x, v3y)} to the product result and saves the result in the given
	 * extraction parameter object.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y) * (v2x, v2y) + (v3x, v3y)}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter.
	 * 
	 * @param v1x
	 *     The value of the x component of the first multiplicant vector.
	 * @param v1y
	 *     The value of the y component of the first multiplicant vector.
	 * @param v2x
	 *     The value of the x component of the second multiplicant vector.
	 * @param v2y
	 *     The value of the y component of the second multiplicant vector.
	 * @param v3x
	 *     The value of the x component of the addend vector.
	 * @param v3y
	 *     The value of the y component of the addend vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T fma(float v1x, float v1y, float v2x, float v2y, float v3x, float v3y,
			@ExtractionParam T res)
	{
		return fma(v1x, v1y, v2x, v2y, v3x, v3y, BarghosMath.PROVIDER, res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1x, v1y)} with the given vector {@code (v2x, v2y)}, adds
	 * the given vector {@code (v3x, v3y)} to the product result and saves the result in the given
	 * extraction parameter object.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y) * (v2x, v2y) + (v3x, v3y)}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter.
	 * 
	 * @param v1x
	 *     The value of the x component of the first multiplicant vector.
	 * @param v1y
	 *     The value of the y component of the first multiplicant vector.
	 * @param v2x
	 *     The value of the x component of the second multiplicant vector.
	 * @param v2y
	 *     The value of the y component of the second multiplicant vector.
	 * @param v3x
	 *     The value of the x component of the addend vector.
	 * @param v3y
	 *     The value of the y component of the addend vector.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T fma(float v1x, float v1y, float v2x, float v2y, float v3x, float v3y,
			MathProvider mathProvider, @ExtractionParam T res)
	{
		res.set(mathProvider.fma(v1x, v2x, v3x), mathProvider.fma(v1y, v2y, v3y));
		
		return res;
	}
	
	/**
	 * Multiplies the given vector {@code (v1)} with the given vector {@code (v2)}, adds the given
	 * vector {@code (v3)} to the product, supplies the result to the given implementation of the
	 * functional interface and returns the result of that implementation.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code  v1 * v2 + v3}
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v1
	 *     The first multiplicant vector.
	 * @param v2
	 *     The second multiplicant vector.
	 * @param v3
	 *     The addend vector.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T fmaFunc(Tup2fR v1, Tup2fR v2, Tup2fR v3, FloatBiFunction<T> res)
	{
		return fmaFunc(v1.v0(), v1.v1(), v2.v0(), v2.v1(), v3.v0(), v3.v1(), res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1)} with the given vector {@code (v2)}, adds the given
	 * vector {@code (v3)} to the product result, supplies the result to the given implementation of
	 * the functional interface and returns the result of that implementation.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code  v1 * v2 + v3}
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v1
	 *     The first multiplicant vector.
	 * @param v2
	 *     The second multiplicant vector.
	 * @param v3
	 *     The addend vector.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T fmaFunc(Tup2fR v1, Tup2fR v2, Tup2fR v3, MathProvider mathProvider, FloatBiFunction<T> res)
	{
		return fmaFunc(v1.v0(), v1.v1(), v2.v0(), v2.v1(), v3.v0(), v3.v1(), res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1)} with the given vector {@code (v2)}, adds the given
	 * vector {@code (v3[0], v3[1])} to the product result, supplies the result to the given
	 * implementation of the functional interface and returns the result of that implementation.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 * v2 + (v3[0], v3[1])}
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v1
	 *     The first multiplicant vector.
	 * @param v2
	 *     The second multiplicant vector.
	 * @param v3
	 *     The addend vector as an array with at least two entries.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T fmaFunc(Tup2fR v1, Tup2fR v2, @MinLength(2) float[] v3, FloatBiFunction<T> res)
	{
		return fmaFunc(v1.v0(), v1.v1(), v2.v0(), v2.v1(), v3[0], v3[1], res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1)} with the given vector {@code (v2)}, adds the given
	 * vector {@code (v3[0], v3[1])} to the product result, supplies the result to the given
	 * implementation of the functional interface and returns the result of that implementation.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 * v2 + (v3[0], v3[1])}
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v1
	 *     The first multiplicant vector.
	 * @param v2
	 *     The second multiplicant vector.
	 * @param v3
	 *     The addend vector as an array with at least two entries.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T fmaFunc(Tup2fR v1, Tup2fR v2, @MinLength(2) float[] v3, MathProvider mathProvider,
			FloatBiFunction<T> res)
	{
		return fmaFunc(v1.v0(), v1.v1(), v2.v0(), v2.v1(), v3[0], v3[1], res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1)} with the given vector {@code (v2)}, adds the given
	 * vector {@code (v3x, v3y)} to the product result, supplies the result to the given
	 * implementation of the functional interface and returns the result of that implementation.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 * v2 + (v3x, v3y)}
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v1
	 *     The first multiplicant vector.
	 * @param v2
	 *     The second multiplicant vector.
	 * @param v3x
	 *     The value of the x component of the addend vector.
	 * @param v3y
	 *     The value of the y component of the addend vector.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T fmaFunc(Tup2fR v1, Tup2fR v2, float v3x, float v3y, FloatBiFunction<T> res)
	{
		return fmaFunc(v1.v0(), v1.v1(), v2.v0(), v2.v1(), v3x, v3y, res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1)} with the given vector {@code (v2)}, adds the given
	 * vector {@code (v3x, v3y)} to the product result, supplies the result to the given
	 * implementation of the functional interface and returns the result of that implementation.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 * v2 + (v3x, v3y)}
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v1
	 *     The first multiplicant vector.
	 * @param v2
	 *     The second multiplicant vector.
	 * @param v3x
	 *     The value of the x component of the addend vector.
	 * @param v3y
	 *     The value of the y component of the addend vector.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T fmaFunc(Tup2fR v1, Tup2fR v2, float v3x, float v3y, MathProvider mathProvider,
			FloatBiFunction<T> res)
	{
		return fmaFunc(v1.v0(), v1.v1(), v2.v0(), v2.v1(), v3x, v3y, res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1)} with the given vector {@code (v2[0], v2[1])}, adds
	 * the given vector {@code (v3)} to the product result, supplies the result to the given
	 * implementation of the functional interface and returns the result of that implementation.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 * (v2[0], v2[1]) + v3}
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v1
	 *     The first multiplicant vector.
	 * @param v2
	 *     The second multiplicant vector as an array with at least two entries.
	 * @param v3
	 *     The addend vector.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T fmaFunc(Tup2fR v1, @MinLength(2) float[] v2, Tup2fR v3, FloatBiFunction<T> res)
	{
		return fmaFunc(v1.v0(), v1.v1(), v2[0], v2[1], v3.v0(), v3.v1(), res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1)} with the given vector {@code (v2[0], v2[1])}, adds
	 * the given vector {@code (v3)} to the product result, supplies the result to the given
	 * implementation of the functional interface and returns the result of that implementation.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 * (v2[0], v2[1]) + v3}
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v1
	 *     The first multiplicant vector.
	 * @param v2
	 *     The second multiplicant vector as an array with at least two entries.
	 * @param v3
	 *     The addend vector.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T fmaFunc(Tup2fR v1, @MinLength(2) float[] v2, Tup2fR v3, MathProvider mathProvider,
			FloatBiFunction<T> res)
	{
		return fmaFunc(v1.v0(), v1.v1(), v2[0], v2[1], v3.v0(), v3.v1(), res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1)} with the given vector {@code (v2[0], v2[1])}, adds
	 * the given vector {@code (v3[0], v3[1])} to the product result, supplies the result to the
	 * given implementation of the functional interface and returns the result of that
	 * implementation.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 * (v2[0], v2[1]) + (v3[0], v3[1])}
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v1
	 *     The first multiplicant vector.
	 * @param v2
	 *     The second multiplicant vector as an array with at least two entries.
	 * @param v3
	 *     The addend vector as an array with at least two entries.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T fmaFunc(Tup2fR v1, @MinLength(2) float[] v2, @MinLength(2) float[] v3, FloatBiFunction<T> res)
	{
		return fmaFunc(v1.v0(), v1.v1(), v2[0], v2[1], v3[0], v3[1], res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1)} with the given vector {@code (v2[0], v2[1])}, adds
	 * the given vector {@code (v3[0], v3[1])} to the product result, supplies the result to the
	 * given implementation of the functional interface and returns the result of that
	 * implementation.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 * (v2[0], v2[1]) + (v3[0], v3[1])}
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v1
	 *     The first multiplicant vector.
	 * @param v2
	 *     The second multiplicant vector as an array with at least two entries.
	 * @param v3
	 *     The addend vector as an array with at least two entries.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T fmaFunc(Tup2fR v1, @MinLength(2) float[] v2, @MinLength(2) float[] v3,
			MathProvider mathProvider, FloatBiFunction<T> res)
	{
		return fmaFunc(v1.v0(), v1.v1(), v2[0], v2[1], v3[0], v3[1], mathProvider, res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1)} with the given vector {@code (v2[0], v2[1])}, adds
	 * the given vector {@code (v3x, v3y)} to the product result, supplies the result to the given
	 * implementation of the functional interface and returns the result of that implementation.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 * (v2[0], v2[1]) + (v3x, v3y)}
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v1
	 *     The first multiplicant vector.
	 * @param v2
	 *     The second multiplicant vector as an array with at least two entries.
	 * @param v3x
	 *     The value of the x component of the addend vector.
	 * @param v3y
	 *     The value of the y component of the addend vector.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T fmaFunc(Tup2fR v1, @MinLength(2) float[] v2, float v3x, float v3y, FloatBiFunction<T> res)
	{
		return fmaFunc(v1.v0(), v1.v1(), v2[0], v2[1], v3x, v3y, res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1)} with the given vector {@code (v2[0], v2[1])}, adds
	 * the given vector {@code (v3x, v3y)} to the product result, supplies the result to the given
	 * implementation of the functional interface and returns the result of that implementation.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 * (v2[0], v2[1]) + (v3x, v3y)}
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v1
	 *     The first multiplicant vector.
	 * @param v2
	 *     The second multiplicant vector as an array with at least two entries.
	 * @param v3x
	 *     The value of the x component of the addend vector.
	 * @param v3y
	 *     The value of the y component of the addend vector.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T fmaFunc(Tup2fR v1, @MinLength(2) float[] v2, float v3x, float v3y, MathProvider mathProvider,
			FloatBiFunction<T> res)
	{
		return fmaFunc(v1.v0(), v1.v1(), v2[0], v2[1], v3x, v3y, mathProvider, res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1)} with the given vector {@code (v2x, v2y)}, adds the
	 * given vector {@code (v3)} to the product result, supplies the result to the given
	 * implementation of the functional interface and returns the result of that implementation.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 * (v2x, v2y) + v3}
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v1
	 *     The first multiplicant vector.
	 * @param v2x
	 *     The value of the x component of the second multiplicant vector.
	 * @param v2y
	 *     The value of the y component of the second multiplicant vector.
	 * @param v3
	 *     The addend vector.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T fmaFunc(Tup2fR v1, float v2x, float v2y, Tup2fR v3, FloatBiFunction<T> res)
	{
		return fmaFunc(v1.v0(), v1.v1(), v2x, v2y, v3.v0(), v3.v1(), res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1)} with the given vector {@code (v2x, v2y)}, adds the
	 * given vector {@code (v3)} to the product result, supplies the result to the given
	 * implementation of the functional interface and returns the result of that implementation.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 * (v2x, v2y) + v3}
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v1
	 *     The first multiplicant vector.
	 * @param v2x
	 *     The value of the x component of the second multiplicant vector.
	 * @param v2y
	 *     The value of the y component of the second multiplicant vector.
	 * @param v3
	 *     The addend vector.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T fmaFunc(Tup2fR v1, float v2x, float v2y, Tup2fR v3, MathProvider mathProvider,
			FloatBiFunction<T> res)
	{
		return fmaFunc(v1.v0(), v1.v1(), v2x, v2y, v3.v0(), v3.v1(), mathProvider, res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1)} with the given vector {@code (v2x, v2y)}, adds the
	 * given vector {@code (v3[0], v3[1])} to the product, supplies the result to the given
	 * implementation of the functional interface and returns the result of that implementation.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 * (v2x, v2y) + (v3[0], v3[1])}
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v1
	 *     The first multiplicant vector.
	 * @param v2x
	 *     The value of the x component of the second multiplicant vector.
	 * @param v2y
	 *     The value of the y component of the second multiplicant vector.
	 * @param v3
	 *     The addend vector as an array with at least two entries.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T fmaFunc(Tup2fR v1, float v2x, float v2y, @MinLength(2) float[] v3, FloatBiFunction<T> res)
	{
		return fmaFunc(v1.v0(), v1.v1(), v2x, v2y, v3[0], v3[1], res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1)} with the given vector {@code (v2x, v2y)}, adds the
	 * given vector {@code (v3[0], v3[1])} to the product, supplies the result to the given
	 * implementation of the functional interface and returns the result of that implementation.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 * (v2x, v2y) + (v3[0], v3[1])}
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v1
	 *     The first multiplicant vector.
	 * @param v2x
	 *     The value of the x component of the second multiplicant vector.
	 * @param v2y
	 *     The value of the y component of the second multiplicant vector.
	 * @param v3
	 *     The addend vector as an array with at least two entries.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T fmaFunc(Tup2fR v1, float v2x, float v2y, @MinLength(2) float[] v3, MathProvider mathProvider,
			FloatBiFunction<T> res)
	{
		return fmaFunc(v1.v0(), v1.v1(), v2x, v2y, v3[0], v3[1], mathProvider, res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1)} with the given vector {@code (v2x, v2y)}, adds the
	 * given vector {@code (v3x, v3y)} to the product result, supplies the result to the given
	 * implementation of the functional interface and returns the result of that implementation.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 * (v2x, v2y) + (v3x, v3y)}
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v1
	 *     The first multiplicant vector as an array with at least two entries.
	 * @param v2x
	 *     The value of the x component of the second multiplicant vector.
	 * @param v2y
	 *     The value of the y component of the second multiplicant vector.
	 * @param v3x
	 *     The value of the x component of the addend vector.
	 * @param v3y
	 *     The value of the y component of the addend vector.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T fmaFunc(Tup2fR v1, float v2x, float v2y, float v3x, float v3y, FloatBiFunction<T> res)
	{
		return fmaFunc(v1.v0(), v1.v1(), v2x, v2y, v3x, v3y, res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1)} with the given vector {@code (v2x, v2y)}, adds the
	 * given vector {@code (v3x, v3y)} to the product result, supplies the result to the given
	 * implementation of the functional interface and returns the result of that implementation.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 * (v2x, v2y) + (v3x, v3y)}
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v1
	 *     The first multiplicant vector as an array with at least two entries.
	 * @param v2x
	 *     The value of the x component of the second multiplicant vector.
	 * @param v2y
	 *     The value of the y component of the second multiplicant vector.
	 * @param v3x
	 *     The value of the x component of the addend vector.
	 * @param v3y
	 *     The value of the y component of the addend vector.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T fmaFunc(Tup2fR v1, float v2x, float v2y, float v3x, float v3y, MathProvider mathProvider,
			FloatBiFunction<T> res)
	{
		return fmaFunc(v1.v0(), v1.v1(), v2x, v2y, v3x, v3y, res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1[0], v1[1])} with the given vector {@code (v2)}, adds
	 * the given vector {@code (v3)} to the product result, supplies the result to the given
	 * implementation of the functional interface and returns the result of that implementation.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1]) * v2 + v3}
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v1
	 *     The first multiplicant vector as an array with at least two entries.
	 * @param v2
	 *     The second multiplicant vector.
	 * @param v3
	 *     The addend vector.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T fmaFunc(@MinLength(2) float[] v1, Tup2fR v2, Tup2fR v3, FloatBiFunction<T> res)
	{
		return fmaFunc(v1[0], v1[1], v2.v0(), v2.v1(), v3.v0(), v3.v1(), res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1[0], v1[1])} with the given vector {@code (v2)}, adds
	 * the given vector {@code (v3)} to the product result, supplies the result to the given
	 * implementation of the functional interface and returns the result of that implementation.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1]) * v2 + v3}
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v1
	 *     The first multiplicant vector as an array with at least two entries.
	 * @param v2
	 *     The second multiplicant vector.
	 * @param v3
	 *     The addend vector.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T fmaFunc(@MinLength(2) float[] v1, Tup2fR v2, Tup2fR v3, MathProvider mathProvider,
			FloatBiFunction<T> res)
	{
		return fmaFunc(v1[0], v1[1], v2.v0(), v2.v1(), v3.v0(), v3.v1(), res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1[0], v1[1])} with the given vector {@code (v2)}, adds
	 * the given vector {@code (v3[0], v3[1])} to the product result, supplies the result to the
	 * given implementation of the functional interface and returns the result of that
	 * implementation.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1]) * v2 + (v3[0], v3[1])}
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v1
	 *     The first multiplicant vector as an array with at least two entries.
	 * @param v2
	 *     The second multiplicant vector.
	 * @param v3
	 *     The addend vector as an array with at least two entries.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T fmaFunc(@MinLength(2) float[] v1, Tup2fR v2, @MinLength(2) float[] v3, FloatBiFunction<T> res)
	{
		return fmaFunc(v1[0], v1[1], v2.v0(), v2.v1(), v3[0], v3[1], res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1[0], v1[1])} with the given vector {@code (v2)}, adds
	 * the given vector {@code (v3[0], v3[1])} to the product result, supplies the result to the
	 * given implementation of the functional interface and returns the result of that
	 * implementation.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1]) * v2 + (v3[0], v3[1])}
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v1
	 *     The first multiplicant vector as an array with at least two entries.
	 * @param v2
	 *     The second multiplicant vector.
	 * @param v3
	 *     The addend vector as an array with at least two entries.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T fmaFunc(@MinLength(2) float[] v1, Tup2fR v2, @MinLength(2) float[] v3,
			MathProvider mathProvider, FloatBiFunction<T> res)
	{
		return fmaFunc(v1[0], v1[1], v2.v0(), v2.v1(), v3[0], v3[1], mathProvider, res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1[0], v1[1])} with the given vector {@code (v2)}, adds
	 * the given vector {@code (v3x, v3y)} to the product result, supplies the result to the given
	 * implementation of the functional interface and returns the result of that implementation.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1]) * v2 + (v3x, v3y)}
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v1
	 *     The first multiplicant vector as an array with at least two entries.
	 * @param v2
	 *     The second multiplicant vector.
	 * @param v3x
	 *     The value of the x component of the addend vector.
	 * @param v3y
	 *     The value of the y component of the addend vector.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T fmaFunc(@MinLength(2) float[] v1, Tup2fR v2, float v3x, float v3y, FloatBiFunction<T> res)
	{
		return fmaFunc(v1[0], v1[1], v2.v0(), v2.v1(), v3x, v3y, res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1[0], v1[1])} with the given vector {@code (v2)}, adds
	 * the given vector {@code (v3x, v3y)} to the product result, supplies the result to the given
	 * implementation of the functional interface and returns the result of that implementation.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1]) * v2 + (v3x, v3y)}
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v1
	 *     The first multiplicant vector as an array with at least two entries.
	 * @param v2
	 *     The second multiplicant vector.
	 * @param v3x
	 *     The value of the x component of the addend vector.
	 * @param v3y
	 *     The value of the y component of the addend vector.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T fmaFunc(@MinLength(2) float[] v1, Tup2fR v2, float v3x, float v3y, MathProvider mathProvider,
			FloatBiFunction<T> res)
	{
		return fmaFunc(v1[0], v1[1], v2.v0(), v2.v1(), v3x, v3y, mathProvider, res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1[0], v1[1])} with the given vector
	 * {@code (v2[0], v2[1])}, adds the given vector {@code (v3)} to the product result , supplies
	 * the result to the given implementation of the functional interface and returns the result of
	 * that implementation.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1]) * (v2[0], v2[1]) + v3}
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v1
	 *     The first multiplicant vector as an array with at least two entries.
	 * @param v2
	 *     The second multiplicant vector as an array with at least two entries.
	 * @param v3
	 *     The addend vector.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T fmaFunc(@MinLength(2) float[] v1, @MinLength(2) float[] v2, Tup2fR v3, FloatBiFunction<T> res)
	{
		return fmaFunc(v1[0], v1[1], v2[0], v2[1], v3.v0(), v3.v1(), res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1[0], v1[1])} with the given vector
	 * {@code (v2[0], v2[1])}, adds the given vector {@code (v3)} to the product result, supplies
	 * the result to the given implementation of the functional interface and returns the result of
	 * that implementation.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1]) * (v2[0], v2[1]) + v3}
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v1
	 *     The first multiplicant vector as an array with at least two entries.
	 * @param v2
	 *     The second multiplicant vector as an array with at least two entries.
	 * @param v3
	 *     The addend vector.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T fmaFunc(@MinLength(2) float[] v1, @MinLength(2) float[] v2, Tup2fR v3,
			MathProvider mathProvider, FloatBiFunction<T> res)
	{
		return fmaFunc(v1[0], v1[1], v2[0], v2[1], v3.v0(), v3.v1(), mathProvider, res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1[0], v1[1])} with the given vector
	 * {@code (v2[0], v2[1])}, adds the given vector {@code (v3[0], v3[1])} to the product result,
	 * supplies the result to the given implementation of the functional interface and returns the
	 * result of that implementation.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1]) * (v2[0], v2[1]) + (v3[0], v3[1])}
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v1
	 *     The first multiplicant vector as an array with at least two entries.
	 * @param v2
	 *     The second multiplicant vector as an array with at least two entries.
	 * @param v3
	 *     The addend vector as an array with at least two entries.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T fmaFunc(@MinLength(2) float[] v1, @MinLength(2) float[] v2, @MinLength(2) float[] v3,
			FloatBiFunction<T> res)
	{
		return fmaFunc(v1[0], v1[1], v2[0], v2[1], v3[0], v3[1], res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1[0], v1[1])} with the given vector
	 * {@code (v2[0], v2[1])}, adds the given vector {@code (v3[0], v3[1])} to the product result,
	 * supplies the result to the given implementation of the functional interface and returns the
	 * result of that implementation.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1]) * (v2[0], v2[1]) + (v3[0], v3[1])}
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v1
	 *     The first multiplicant vector as an array with at least two entries.
	 * @param v2
	 *     The second multiplicant vector as an array with at least two entries.
	 * @param v3
	 *     The addend vector as an array with at least two entries.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T fmaFunc(@MinLength(2) float[] v1, @MinLength(2) float[] v2, @MinLength(2) float[] v3,
			MathProvider mathProvider, FloatBiFunction<T> res)
	{
		return fmaFunc(v1[0], v1[1], v2[0], v2[1], v3[0], v3[1], mathProvider, res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1[0], v1[1])} with the given vector
	 * {@code (v2[0], v2[1])}, adds the given vector {@code (v3x, v3y)} to the product result,
	 * supplies the result to the given implementation of the functional interface and returns the
	 * result of that implementation.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1]) * (v2[0], v2[1]) + (v3x, v3y)}
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v1
	 *     The first multiplicant vector as an array with at least two entries.
	 * @param v2
	 *     The second multiplicant vector as an array with at least two entries.
	 * @param v3x
	 *     The value of the x component of the addend vector.
	 * @param v3y
	 *     The value of the y component of the addend vector.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T fmaFunc(@MinLength(2) float[] v1, @MinLength(2) float[] v2, float v3x, float v3y,
			FloatBiFunction<T> res)
	{
		return fmaFunc(v1[0], v1[1], v2[0], v2[1], v3x, v3y, res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1[0], v1[1])} with the given vector
	 * {@code (v2[0], v2[1])}, adds the given vector {@code (v3x, v3y)} to the product result,
	 * supplies the result to the given implementation of the functional interface and returns the
	 * result of that implementation.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1]) * (v2[0], v2[1]) + (v3x, v3y)}
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v1
	 *     The first multiplicant vector as an array with at least two entries.
	 * @param v2
	 *     The second multiplicant vector as an array with at least two entries.
	 * @param v3x
	 *     The value of the x component of the addend vector.
	 * @param v3y
	 *     The value of the y component of the addend vector.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T fmaFunc(@MinLength(2) float[] v1, @MinLength(2) float[] v2, float v3x, float v3y,
			MathProvider mathProvider, FloatBiFunction<T> res)
	{
		return fmaFunc(v1[0], v1[1], v2[0], v2[1], v3x, v3y, mathProvider, res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1[0], v1[1])} with the given vector {@code (v2x, v2y)},
	 * adds the given vector {@code (v3)} to the product result, supplies the result to the given
	 * implementation of the functional interface and returns the result of that implementation.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1]) * (v2x, v2y) + v3}
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v1
	 *     The first multiplicant vector as an array with at least two entries.
	 * @param v2x
	 *     The value of the x component of the second multiplicant vector.
	 * @param v2y
	 *     The value of the y component of the second multiplicant vector.
	 * @param v3
	 *     The addend vector.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T fmaFunc(@MinLength(2) float[] v1, float v2x, float v2y, Tup2fR v3, FloatBiFunction<T> res)
	{
		return fmaFunc(v1[0], v1[1], v2x, v2y, v3.v0(), v3.v1(), res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1[0], v1[1])} with the given vector {@code (v2x, v2y)},
	 * adds the given vector {@code (v3)} to the product result, supplies the result to the given
	 * implementation of the functional interface and returns the result of that implementation.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1]) * (v2x, v2y) + v3}
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v1
	 *     The first multiplicant vector as an array with at least two entries.
	 * @param v2x
	 *     The value of the x component of the second multiplicant vector.
	 * @param v2y
	 *     The value of the y component of the second multiplicant vector.
	 * @param v3
	 *     The addend vector.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T fmaFunc(@MinLength(2) float[] v1, float v2x, float v2y, Tup2fR v3, MathProvider mathProvider,
			FloatBiFunction<T> res)
	{
		return fmaFunc(v1[0], v1[1], v2x, v2y, v3.v0(), v3.v1(), mathProvider, res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1[0], v1[1])} with the given vector {@code (v2x, v2y)},
	 * adds the given vector {@code (v3[0], v3[1])} to the product result, supplies the result to
	 * the given implementation of the functional interface and returns the result of that
	 * implementation.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1]) * (v2x, v2y) + (v3[0], v3[1])}
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v1
	 *     The first multiplicant vector as an array with at least two entries.
	 * @param v2x
	 *     The value of the x component of the second multiplicant vector.
	 * @param v2y
	 *     The value of the y component of the second multiplicant vector.
	 * @param v3
	 *     The addend vector as an array with at least two entries.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T fmaFunc(@MinLength(2) float[] v1, float v2x, float v2y, @MinLength(2) float[] v3,
			FloatBiFunction<T> res)
	{
		return fmaFunc(v1[0], v1[1], v2x, v2y, v3[0], v3[1], res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1[0], v1[1])} with the given vector {@code (v2x, v2y)},
	 * adds the given vector {@code (v3[0], v3[1])} to the product result, supplies the result to
	 * the given implementation of the functional interface and returns the result of that
	 * implementation.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1]) * (v2x, v2y) + (v3[0], v3[1])}
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v1
	 *     The first multiplicant vector as an array with at least two entries.
	 * @param v2x
	 *     The value of the x component of the second multiplicant vector.
	 * @param v2y
	 *     The value of the y component of the second multiplicant vector.
	 * @param v3
	 *     The addend vector as an array with at least two entries.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T fmaFunc(@MinLength(2) float[] v1, float v2x, float v2y, @MinLength(2) float[] v3,
			MathProvider mathProvider, FloatBiFunction<T> res)
	{
		return fmaFunc(v1[0], v1[1], v2x, v2y, v3[0], v3[1], mathProvider, res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1[0], v1[1])} with the given vector {@code (v2x, v2y)},
	 * adds the given vector {@code (v3x, v3y)} to the product result, supplies the result to the
	 * given implementation of the functional interface and returns the result of that
	 * implementation.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1]) * (v2x, v2y) + (v3x, v3y)}
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v1
	 *     The first multiplicant vector as an array with at least two entries.
	 * @param v2x
	 *     The value of the x component of the second multiplicant vector.
	 * @param v2y
	 *     The value of the y component of the second multiplicant vector.
	 * @param v3x
	 *     The value of the x component of the addend vector.
	 * @param v3y
	 *     The value of the y component of the addend vector.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T fmaFunc(@MinLength(2) float[] v1, float v2x, float v2y, float v3x, float v3y,
			FloatBiFunction<T> res)
	{
		return fmaFunc(v1[0], v1[1], v2x, v2y, v3x, v3y, res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1[0], v1[1])} with the given vector {@code (v2x, v2y)},
	 * adds the given vector {@code (v3x, v3y)} to the product result, supplies the result to the
	 * given implementation of the functional interface and returns the result of that
	 * implementation.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1]) * (v2x, v2y) + (v3x, v3y)}
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v1
	 *     The first multiplicant vector as an array with at least two entries.
	 * @param v2x
	 *     The value of the x component of the second multiplicant vector.
	 * @param v2y
	 *     The value of the y component of the second multiplicant vector.
	 * @param v3x
	 *     The value of the x component of the addend vector.
	 * @param v3y
	 *     The value of the y component of the addend vector.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T fmaFunc(@MinLength(2) float[] v1, float v2x, float v2y, float v3x, float v3y,
			MathProvider mathProvider, FloatBiFunction<T> res)
	{
		return fmaFunc(v1[0], v1[1], v2x, v2y, v3x, v3y, mathProvider, res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1x, v1y)} with the given vector {@code (v2)}, adds the
	 * given vector {@code (v3)} to the product result, supplies the result to the given
	 * implementation of the functional interface and returns the result of that implementation.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y) * v2 + v3}
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v1x
	 *     The value of the x component of the first multiplicant vector.
	 * @param v1y
	 *     The value of the y component of the first multiplicant vector.
	 * @param v2
	 *     The second multiplicant vector.
	 * @param v3
	 *     The addend vector.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T fmaFunc(float v1x, float v1y, Tup2fR v2, Tup2fR v3, FloatBiFunction<T> res)
	{
		return fmaFunc(v1x, v1y, v2.v0(), v2.v1(), v3.v0(), v3.v1(), res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1x, v1y)} with the given vector {@code (v2)}, adds the
	 * given vector {@code (v3)} to the product result, supplies the result to the given
	 * implementation of the functional interface and returns the result of that implementation.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y) * v2 + v3}
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v1x
	 *     The value of the x component of the first multiplicant vector.
	 * @param v1y
	 *     The value of the y component of the first multiplicant vector.
	 * @param v2
	 *     The second multiplicant vector.
	 * @param v3
	 *     The addend vector.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T fmaFunc(float v1x, float v1y, Tup2fR v2, Tup2fR v3, MathProvider mathProvider,
			FloatBiFunction<T> res)
	{
		return fmaFunc(v1x, v1y, v2.v0(), v2.v1(), v3.v0(), v3.v1(), mathProvider, res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1x, v1y)} with the given vector {@code (v2)}, adds the
	 * given vector {@code (v3[0], v3[1])} to the product result, supplies the result to the given
	 * implementation of the functional interface and returns the result of that implementation.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y) * v2 + (v3[0], v3[1])}
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v1x
	 *     The value of the x component of the first multiplicant vector.
	 * @param v1y
	 *     The value of the y component of the first multiplicant vector.
	 * @param v2
	 *     The second multiplicant vector.
	 * @param v3
	 *     The addend vector as an array with at least two entries.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T fmaFunc(float v1x, float v1y, Tup2fR v2, @MinLength(2) float[] v3, FloatBiFunction<T> res)
	{
		return fmaFunc(v1x, v1y, v2.v0(), v2.v1(), v3[0], v3[1], res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1x, v1y)} with the given vector {@code (v2)}, adds the
	 * given vector {@code (v3[0], v3[1])} to the product result, supplies the result to the given
	 * implementation of the functional interface and returns the result of that implementation.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y) * v2 + (v3[0], v3[1])}
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v1x
	 *     The value of the x component of the first multiplicant vector.
	 * @param v1y
	 *     The value of the y component of the first multiplicant vector.
	 * @param v2
	 *     The second multiplicant vector.
	 * @param v3
	 *     The addend vector as an array with at least two entries.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T fmaFunc(float v1x, float v1y, Tup2fR v2, @MinLength(2) float[] v3, MathProvider mathProvider,
			FloatBiFunction<T> res)
	{
		return fmaFunc(v1x, v1y, v2.v0(), v2.v1(), v3[0], v3[1], mathProvider, res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1x, v1y)} with the given vector {@code (v2)}, adds the
	 * given vector {@code (v3x, v3y)} to the product result, supplies the result to the given
	 * implementation of the functional interface and returns the result of that implementation.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y) * v2 + (v3x, v3y)}
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v1x
	 *     The value of the x component of the first multiplicant vector.
	 * @param v1y
	 *     The value of the y component of the first multiplicant vector.
	 * @param v2
	 *     The second multiplicant vector.
	 * @param v3x
	 *     The value of the x component of the addend vector.
	 * @param v3y
	 *     The value of the y component of the addend vector.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T fmaFunc(float v1x, float v1y, Tup2fR v2, float v3x, float v3y, FloatBiFunction<T> res)
	{
		return fmaFunc(v1x, v1y, v2.v0(), v2.v1(), v3x, v3y, res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1x, v1y)} with the given vector {@code (v2)}, adds the
	 * given vector {@code (v3x, v3y)} to the product result, supplies the result to the given
	 * implementation of the functional interface and returns the result of that implementation.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y) * v2 + (v3x, v3y)}
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v1x
	 *     The value of the x component of the first multiplicant vector.
	 * @param v1y
	 *     The value of the y component of the first multiplicant vector.
	 * @param v2
	 *     The second multiplicant vector.
	 * @param v3x
	 *     The value of the x component of the addend vector.
	 * @param v3y
	 *     The value of the y component of the addend vector.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T fmaFunc(float v1x, float v1y, Tup2fR v2, float v3x, float v3y, MathProvider mathProvider,
			FloatBiFunction<T> res)
	{
		return fmaFunc(v1x, v1y, v2.v0(), v2.v1(), v3x, v3y, res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1x, v1y)} with the given vector {@code (v2[0], v2[1])},
	 * adds the given vector {@code (v3)} to the product result, supplies the result to the given
	 * implementation of the functional interface and returns the result of that implementation.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y) * (v2[0], v2[1]) + v3}
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v1x
	 *     The value of the x component of the first multiplicant vector.
	 * @param v1y
	 *     The value of the y component of the first multiplicant vector.
	 * @param v2
	 *     The second multiplicant vector as an array with at least two entries.
	 * @param v3
	 *     The addend vector.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T fmaFunc(float v1x, float v1y, @MinLength(2) float[] v2, Tup2fR v3, FloatBiFunction<T> res)
	{
		return fmaFunc(v1x, v1y, v2[0], v2[1], v3.v0(), v3.v1(), res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1x, v1y)} with the given vector {@code (v2[0], v2[1])},
	 * adds the given vector {@code (v3)} to the product result, supplies the result to the given
	 * implementation of the functional interface and returns the result of that implementation.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y) * (v2[0], v2[1]) + v3}
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v1x
	 *     The value of the x component of the first multiplicant vector.
	 * @param v1y
	 *     The value of the y component of the first multiplicant vector.
	 * @param v2
	 *     The second multiplicant vector as an array with at least two entries.
	 * @param v3
	 *     The addend vector.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T fmaFunc(float v1x, float v1y, @MinLength(2) float[] v2, Tup2fR v3, MathProvider mathProvider,
			FloatBiFunction<T> res)
	{
		return fmaFunc(v1x, v1y, v2[0], v2[1], v3.v0(), v3.v1(), mathProvider, res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1x, v1y)} with the given vector {@code (v2[0], v2[1])},
	 * adds the given vector {@code (v3[0], v3[1])} to the product result, supplies the result to
	 * the given implementation of the functional interface and returns the result of that
	 * implementation.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y) * (v2[0], v2[1]) + (v3[0], v3[1])}
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v1x
	 *     The value of the x component of the first multiplicant vector.
	 * @param v1y
	 *     The value of the y component of the first multiplicant vector.
	 * @param v2
	 *     The second multiplicant vector as an array with at least two entries.
	 * @param v3
	 *     The addend vector as an array with at least two entries.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T fmaFunc(float v1x, float v1y, @MinLength(2) float[] v2, @MinLength(2) float[] v3,
			FloatBiFunction<T> res)
	{
		return fmaFunc(v1x, v1y, v2[0], v2[1], v3[0], v3[1], res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1x, v1y)} with the given vector {@code (v2[0], v2[1])},
	 * adds the given vector {@code (v3[0], v3[1])} to the product result, supplies the result to
	 * the given implementation of the functional interface and returns the result of that
	 * implementation.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y) * (v2[0], v2[1]) + (v3[0], v3[1])}
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v1x
	 *     The value of the x component of the first multiplicant vector.
	 * @param v1y
	 *     The value of the y component of the first multiplicant vector.
	 * @param v2
	 *     The second multiplicant vector as an array with at least two entries.
	 * @param v3
	 *     The addend vector as an array with at least two entries.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T fmaFunc(float v1x, float v1y, @MinLength(2) float[] v2, @MinLength(2) float[] v3,
			MathProvider mathProvider, FloatBiFunction<T> res)
	{
		return fmaFunc(v1x, v1y, v2[0], v2[1], v3[0], v3[1], mathProvider, res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1x, v1y)} with the given vector {@code (v2[0], v2[1])},
	 * adds the given vector {@code (v3x, v3y)} to the product result, supplies the result to the
	 * given implementation of the functional interface and returns the result of that
	 * implementation.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y) * (v2[0], v2[1]) + (v3x, v3y)}
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v1x
	 *     The value of the x component of the first multiplicant vector.
	 * @param v1y
	 *     The value of the y component of the first multiplicant vector.
	 * @param v2
	 *     The second multiplicant vector as an array with at least two entries.
	 * @param v3x
	 *     The value of the x component of the addend vector.
	 * @param v3y
	 *     The value of the y component of the addend vector.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T fmaFunc(float v1x, float v1y, @MinLength(2) float[] v2, float v3x, float v3y,
			FloatBiFunction<T> res)
	{
		return fmaFunc(v1x, v1y, v2[0], v2[1], v3x, v3y, res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1x, v1y)} with the given vector {@code (v2[0], v2[1])},
	 * adds the given vector {@code (v3x, v3y)} to the product result, supplies the result to the
	 * given implementation of the functional interface and returns the result of that
	 * implementation.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y) * (v2[0], v2[1]) + (v3x, v3y)}
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v1x
	 *     The value of the x component of the first multiplicant vector.
	 * @param v1y
	 *     The value of the y component of the first multiplicant vector.
	 * @param v2
	 *     The second multiplicant vector as an array with at least two entries.
	 * @param v3x
	 *     The value of the x component of the addend vector.
	 * @param v3y
	 *     The value of the y component of the addend vector.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T fmaFunc(float v1x, float v1y, @MinLength(2) float[] v2, float v3x, float v3y,
			MathProvider mathProvider, FloatBiFunction<T> res)
	{
		return fmaFunc(v1x, v1y, v2[0], v2[1], v3x, v3y, mathProvider, res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1x, v1y)} with the given vector {@code (v2x, v2y)}, adds
	 * the given vector {@code (v3)} to the product result, supplies the result to the given
	 * implementation of the functional interface and returns the result of that implementation.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y) * (v2x, v2y) + v3}
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v1x
	 *     The value of the x component of the first multiplicant vector.
	 * @param v1y
	 *     The value of the y component of the first multiplicant vector.
	 * @param v2x
	 *     The value of the x component of the second multiplicant vector.
	 * @param v2y
	 *     The value of the y component of the second multiplicant vector.
	 * @param v3
	 *     The addend vector.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T fmaFunc(float v1x, float v1y, float v2x, float v2y, Tup2fR v3, FloatBiFunction<T> res)
	{
		return fmaFunc(v1x, v1y, v2x, v2y, v3.v0(), v3.v1(), res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1x, v1y)} with the given vector {@code (v2x, v2y)}, adds
	 * the given vector {@code (v3)} to the product result, supplies the result to the given
	 * implementation of the functional interface and returns the result of that implementation.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y) * (v2x, v2y) + v3}
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v1x
	 *     The value of the x component of the first multiplicant vector.
	 * @param v1y
	 *     The value of the y component of the first multiplicant vector.
	 * @param v2x
	 *     The value of the x component of the second multiplicant vector.
	 * @param v2y
	 *     The value of the y component of the second multiplicant vector.
	 * @param v3
	 *     The addend vector.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T fmaFunc(float v1x, float v1y, float v2x, float v2y, Tup2fR v3, MathProvider mathProvider,
			FloatBiFunction<T> res)
	{
		return fmaFunc(v1x, v1y, v2x, v2y, v3.v0(), v3.v1(), mathProvider, res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1x, v1y)} with the given vector {@code (v2x, v2y)}, adds
	 * the given vector {@code (v3[0], v3[1])} to the product result, supplies the result to the
	 * given implementation of the functional interface and returns the result of that
	 * implementation.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y) * (v2x, v2y) + (v3[0], v3[1])}
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v1x
	 *     The value of the x component of the first multiplicant vector.
	 * @param v1y
	 *     The value of the y component of the first multiplicant vector.
	 * @param v2x
	 *     The value of the x component of the second multiplicant vector.
	 * @param v2y
	 *     The value of the y component of the second multiplicant vector.
	 * @param v3
	 *     The addend vector as an array with at least two entries.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T fmaFunc(float v1x, float v1y, float v2x, float v2y, @MinLength(2) float[] v3,
			FloatBiFunction<T> res)
	{
		return fmaFunc(v1x, v1y, v2x, v2y, v3[0], v3[1], res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1x, v1y)} with the given vector {@code (v2x, v2y)}, adds
	 * the given vector {@code (v3[0], v3[1])} to the product result, supplies the result to the
	 * given implementation of the functional interface and returns the result of that
	 * implementation.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y) * (v2x, v2y) + (v3[0], v3[1])}
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v1x
	 *     The value of the x component of the first multiplicant vector.
	 * @param v1y
	 *     The value of the y component of the first multiplicant vector.
	 * @param v2x
	 *     The value of the x component of the second multiplicant vector.
	 * @param v2y
	 *     The value of the y component of the second multiplicant vector.
	 * @param v3
	 *     The addend vector as an array with at least two entries.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T fmaFunc(float v1x, float v1y, float v2x, float v2y, @MinLength(2) float[] v3,
			MathProvider mathProvider, FloatBiFunction<T> res)
	{
		return fmaFunc(v1x, v1y, v2x, v2y, v3[0], v3[1], mathProvider, res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1x, v1y)} with the given vector {@code (v2x, v2y)}, adds
	 * the given vector {@code (v3x, v3y)} to the product result, supplies the result to the given
	 * implementation of the functional interface and returns the result of that implementation.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y) * (v2x, v2y) + (v3x, v3y)}
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v1x
	 *     The value of the x component of the first multiplicant vector.
	 * @param v1y
	 *     The value of the y component of the first multiplicant vector.
	 * @param v2x
	 *     The value of the x component of the second multiplicant vector.
	 * @param v2y
	 *     The value of the y component of the second multiplicant vector.
	 * @param v3x
	 *     The value of the x component of the addend vector.
	 * @param v3y
	 *     The value of the y component of the addend vector.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T fmaFunc(float v1x, float v1y, float v2x, float v2y, float v3x, float v3y, FloatBiFunction<T> res)
	{
		return fmaFunc(v1x, v1y, v2x, v2y, v3x, v3y, BarghosMath.PROVIDER, res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1x, v1y)} with the given vector {@code (v2x, v2y)}, adds
	 * the given vector {@code (v3x, v3y)} to the product result, supplies the result to the given
	 * implementation of the functional interface and returns the result of that implementation.
	 * 
	 * <p>
	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
	 * addition. The actual way of calculation depends on the implementation of the used
	 * {@link MathProvider}.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y) * (v2x, v2y) + (v3x, v3y)}
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v1x
	 *     The value of the x component of the first multiplicant vector.
	 * @param v1y
	 *     The value of the y component of the first multiplicant vector.
	 * @param v2x
	 *     The value of the x component of the second multiplicant vector.
	 * @param v2y
	 *     The value of the y component of the second multiplicant vector.
	 * @param v3x
	 *     The value of the x component of the addend vector.
	 * @param v3y
	 *     The value of the y component of the addend vector.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T fmaFunc(float v1x, float v1y, float v2x, float v2y, float v3x, float v3y,
			MathProvider mathProvider, FloatBiFunction<T> res)
	{
		return res.apply(mathProvider.fma(v1x, v2x, v3x), mathProvider.fma(v1y, v2y, v3y));
	}
	
	/**
	 * Returns the inverse (reciprocal) length (magnitude, norm) of the vector {@code (v)}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code 1 / |v|}
	 * 
	 * @param v
	 *     The vector.
	 * 
	 * @return The inverse length of the vector.
	 */
	public static float inverseLength(Tup2fR v)
	{
		return inverseLength(v.v0(), v.v1());
	}
	
	/**
	 * Returns the inverse (reciprocal) length (magnitude, norm) of the vector {@code (v)}.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code 1 / |v|}
	 * 
	 * @param v
	 *     The vector.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * 
	 * @return The inverse length of the vector.
	 */
	public static float inverseLength(Tup2fR v, MathProvider mathProvider)
	{
		return inverseLength(v.v0(), v.v1(), mathProvider);
	}
	
	/**
	 * Returns the inverse (reciprocal) length (magnitude, norm) of the vector {@code (v[0], v[1])}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code 1 / |(v[0], v[1])|}
	 * 
	 * @param v
	 *     The vector as an array with at least two entries.
	 * 
	 * @return The reciprocal length of the vector.
	 */
	public static float inverseLength(@MinLength(2) float[] v)
	{
		return inverseLength(v[0], v[1]);
	}
	
	/**
	 * Returns the inverse (reciprocal) length (magnitude, norm) of the vector {@code (v[0], v[1])}.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code 1 / |(v[0], v[1])|}
	 * 
	 * @param v
	 *     The vector as an array with at least two entries.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * 
	 * @return The reciprocal length of the vector.
	 */
	public static float inverseLength(@MinLength(2) float[] v, MathProvider mathProvider)
	{
		return inverseLength(v[0], v[1], mathProvider);
	}
	
	/**
	 * Returns the inverse (reciprocal) length (magnitude, norm) of the vector {@code (x, y)}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code 1 / |(x, y)|}
	 * 
	 * @param x
	 *     The value of the x component of the vector.
	 * @param y
	 *     The value of the y component of the vector.
	 * 
	 * @return The reciprocal length of the vector.
	 */
	public static float inverseLength(float x, float y)
	{
		return inverseLength(x, y, BarghosMath.PROVIDER);
	}
	
	/**
	 * Returns the inverse (reciprocal) length (magnitude, norm) of the vector {@code (x, y)}.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code 1 / |(x, y)|}
	 * 
	 * @param x
	 *     The value of the x component of the vector.
	 * @param y
	 *     The value of the y component of the vector.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * 
	 * @return The reciprocal length of the vector.
	 */
	public static float inverseLength(float x, float y, MathProvider mathProvider)
	{
		return mathProvider.invSqrt(squaredLength(x, y));
	}
	
	/**
	 * Returns the length (magnitude, norm) of the vector {@code (v)}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |v|}
	 * 
	 * @param v
	 *     The vector.
	 * 
	 * @return The length of the vector.
	 */
	public static float length(Tup2fR v)
	{
		return length(v.v0(), v.v1());
	}
	
	/**
	 * Returns the length (magnitude, norm) of the vector {@code (v)}.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(v|}
	 * 
	 * @param v
	 *     The vector.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * 
	 * @return The length of the vector.
	 */
	public static float length(Tup2fR v, MathProvider mathProvider)
	{
		return length(v.v0(), v.v1(), mathProvider);
	}
	
	/**
	 * Returns the length (magnitude, norm) of the vector {@code (v)}. If the values of all
	 * components are within the margin defined by {@code (-tolerance <= value <= tolerance)} the
	 * result will be zero.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |v|}
	 * 
	 * @param v
	 *     The vector.
	 * @param tolerance
	 *     The tolerance for defining the margin around zero. Must be positive.
	 * 
	 * @return The length of the vector.
	 */
	public static float length(Tup2fR v, @FloatMinValue(0.0f) float tolerance)
	{
		return length(v.v0(), v.v1(), tolerance);
	}
	
	/**
	 * Returns the length (magnitude, norm) of the vector {@code (v)}. If the values of all
	 * components are within the margin defined by {@code (-tolerance <= value <= tolerance)} the
	 * result will be zero.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(v|}
	 * 
	 * @param v
	 *     The vector.
	 * @param tolerance
	 *     The tolerance for defining the margin around zero. Must be positive.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * 
	 * @return The length of the vector.
	 */
	public static float length(Tup2fR v, @FloatMinValue(0.0f) float tolerance, MathProvider mathProvider)
	{
		return length(v.v0(), v.v1(), tolerance, mathProvider);
	}
	
	/**
	 * Returns the length (magnitude, norm) of the vector {@code (v[0], v[1])}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(v[0], v[1])|}
	 * 
	 * @param v
	 *     The vector as an array with at least two entries.
	 * 
	 * @return The length of the vector.
	 */
	public static float length(@MinLength(2) float[] v)
	{
		return length(v[0], v[1]);
	}
	
	/**
	 * Returns the length (magnitude, norm) of the vector {@code (v[0], v[1])}.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(v[0], v[1])|}
	 * 
	 * @param v
	 *     The vector as an array with at least two entries.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * 
	 * @return The length of the vector.
	 */
	public static float length(@MinLength(2) float[] v, MathProvider mathProvider)
	{
		return length(v[0], v[1], mathProvider);
	}
	
	/**
	 * Returns the length (magnitude, norm) of the vector {@code (v[0], v[1])}. If the values of all
	 * components are within the margin defined by {@code (-tolerance <= value <= tolerance)} the
	 * result will be zero.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(v[0], v[1])|}
	 * 
	 * @param v
	 *     The vector as an array with at least two entries.
	 * @param tolerance
	 *     The tolerance for defining the margin around zero. Must be positive.
	 * 
	 * @return The length of the vector.
	 */
	public static float length(@MinLength(2) float[] v, @FloatMinValue(0.0f) float tolerance)
	{
		return length(v[0], v[1], tolerance);
	}
	
	/**
	 * Returns the length (magnitude, norm) of the vector {@code (v[0], v[1])}. If the values of all
	 * components are within the margin defined by {@code (-tolerance <= value <= tolerance)} the
	 * result will be zero.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(v[0], v[1])|}
	 * 
	 * @param v
	 *     The vector as an array with at least two entries.
	 * @param tolerance
	 *     The tolerance for defining the margin around zero. Must be positive.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * 
	 * @return The length of the vector.
	 */
	public static float length(@MinLength(2) float[] v, @FloatMinValue(0.0f) float tolerance, MathProvider mathProvider)
	{
		return length(v[0], v[1], tolerance, mathProvider);
	}
	
	/**
	 * Returns the length (magnitude, norm) of the vector {@code (x, y)}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(x, y)|}
	 * 
	 * @param x
	 *     The value of the x component of the vector.
	 * @param y
	 *     The value of the y component of the vector.
	 * 
	 * @return The length of the vector.
	 */
	public static float length(float x, float y)
	{
		return length(x, y, BarghosMath.PROVIDER);
	}
	
	/**
	 * Returns the length (magnitude, norm) of the vector {@code (x, y)}.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(x, y)|}
	 * 
	 * @param x
	 *     The value of the x component of the vector.
	 * @param y
	 *     The value of the y component of the vector.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * 
	 * @return The length of the vector.
	 */
	public static float length(float x, float y, MathProvider mathProvider)
	{
		if (x == 0.0f && y == 0.0f) return 0.0f;
		
		return mathProvider.sqrt(squaredLength(x, y));
	}
	
	/**
	 * Returns the length (magnitude, norm) of the vector {@code (x, y)}. If the values of all
	 * components are within the margin defined by {@code (-tolerance <= value <= tolerance)} the
	 * result will be zero.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(x, y)|}
	 * 
	 * @param x
	 *     The value of the x component of the vector.
	 * @param y
	 *     The value of the y component of the vector.
	 * @param tolerance
	 *     The tolerance for defining the margin around zero. Must be positive.
	 * 
	 * @return The length of the vector.
	 */
	public static float length(float x, float y, @FloatMinValue(0.0f) float tolerance)
	{
		return length(x, y, BarghosMath.PROVIDER);
	}
	
	/**
	 * Returns the length (magnitude, norm) of the vector {@code (x, y)}. If the values of all
	 * components are within the margin defined by {@code (-tolerance <= value <= tolerance)} the
	 * result will be zero.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(x, y)|}
	 * 
	 * @param x
	 *     The value of the x component of the vector.
	 * @param y
	 *     The value of the y component of the vector.
	 * @param tolerance
	 *     The tolerance for defining the margin around zero. Must be positive.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * 
	 * @return The length of the vector.
	 */
	public static float length(float x, float y, @FloatMinValue(0.0f) float tolerance, MathProvider mathProvider)
	{
		if (Math.abs(x) <= tolerance && Math.abs(y) <= tolerance) return 0.0f;
		
		return mathProvider.sqrt(squaredLength(x, y));
	}
	
	/**
	 * Returns the squared length (magnitude, norm) of the vector {@code (x, y)}. It doesn't account
	 * for zero-length vectors.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |v|²}
	 * 
	 * @param v
	 *     The vector.
	 * 
	 * @return The squared length of the vector.
	 */
	public static float squaredLength(Tup2fR v)
	{
		return squaredLength(v.v0(), v.v1());
	}
	
	/**
	 * Returns the squared length (magnitude, norm) of the vector {@code (v[0], v[1])}. It doesn't
	 * account for zero-length vectors.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(v[0], v[1])|²}
	 * 
	 * @param v
	 *     The vector as an array with at least two entries.
	 * 
	 * @return The squared length of the vector.
	 */
	public static float squaredLength(@MinLength(2) float[] v)
	{
		return squaredLength(v[0], v[1]);
	}
	
	/**
	 * Returns the squared length (magnitude, norm) of the vector {@code (x, y)}. It doesn't account
	 * for zero-length vectors.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(x, y)|²}
	 * 
	 * @param x
	 *     The value of the x component of the vector.
	 * @param y
	 *     The value of the y component of the vector.
	 * 
	 * @return The squared length of the vector.
	 */
	public static float squaredLength(float x, float y)
	{
		return x * x + y * y;
	}
	
	/**
	 * Determines the smallest value of the components of the vector {@code (v)} and saves the value
	 * and the component index in the extraction parameter object. If two or more components have
	 * the same value the first index will be returned.
	 * 
	 * <p>
	 * The index returned is limited to the range of {@code 0-1}.
	 * 
	 * @param v
	 *     The vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static FloatIndexValuePair min(Tup2fR v, @ExtractionParam FloatIndexValuePair res)
	{
		return min(v.v0(), v.v1(), res);
	}
	
	/**
	 * Determines the smallest value of the components of the vector {@code (v[0], v[1])} and saves
	 * the value and the component index in the extraction parameter object. If two or more
	 * components have the same value the first index will be returned.
	 * 
	 * <p>
	 * The index returned is limited to the range of {@code 0-1}.
	 * 
	 * @param v
	 *     The vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static FloatIndexValuePair min(@MinLength(2) float[] v, @ExtractionParam FloatIndexValuePair res)
	{
		return min(v[0], v[1], res);
	}
	
	/**
	 * Determines the smallest value of the components of the vector {@code (x, y)} and saves the
	 * value and the component index in the extraction parameter object. If two or more components
	 * have the same value the first index will be returned.
	 * 
	 * <p>
	 * The index returned is limited to the range of {@code 0-1}.
	 * 
	 * @param x
	 *     The value of the x component of the vector.
	 * @param y
	 *     The value of the y component of the vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static FloatIndexValuePair min(float x, float y, @ExtractionParam FloatIndexValuePair res)
	{
		float value = x;
		int index = 0;
		
		if (y < value)
		{
			value = y;
			index = 1;
		}
		
		res.set(value, index);
		
		return res;
	}
	
	/**
	 * Determines the smallest value of the components of the vector {@code (v)} and returns it.
	 * 
	 * @param v
	 *     The vector.
	 * 
	 * @return The smallest value of the components.
	 */
	public static float minValue(Tup2fR v)
	{
		return minValue(v.v0(), v.v1());
	}
	
	/**
	 * Determines the smallest value of the components of the vector {@code (v[0], v[1])} and
	 * returns it.
	 * 
	 * @param v
	 *     The vector as an array with at least two entries.
	 * 
	 * @return The smallest value of the components.
	 */
	public static float minValue(@MinLength(2) float[] v)
	{
		return minValue(v[0], v[1]);
	}
	
	/**
	 * Determines the smallest value of the components of the vector {@code (x, y)} and returns it.
	 * 
	 * @param x
	 *     The value of the x component of the vector.
	 * @param y
	 *     The value of the y component of the vector.
	 * 
	 * @return The smallest value of the components.
	 */
	public static float minValue(float x, float y)
	{
		return Math.min(x, y);
	}
	
	/**
	 * Determines the smallest value of the components of the vector {@code (v)} and returns the
	 * index of the component. If two or more components have the same value the first index will be
	 * returned.
	 * 
	 * <p>
	 * The index returned is limited to the range of {@code 0-1}.
	 * 
	 * @param v
	 *     The vector.
	 * 
	 * @return The index of the smallest component.
	 */
	public static int minComponent(Tup2fR v)
	{
		return minComponent(v.v0(), v.v1());
	}
	
	/**
	 * Determines the smallest value of the components of the vector {@code (v[0], v[1])} and
	 * returns the index of the component. If two or more components have the same value the first
	 * index will be returned.
	 * 
	 * <p>
	 * The index returned is limited to the range of {@code 0-1}.
	 * 
	 * @param v
	 *     The vector as an array with at least two entries.
	 * 
	 * @return The index of the smallest component.
	 */
	public static int minComponent(@MinLength(2) float[] v)
	{
		return minComponent(v[0], v[1]);
	}
	
	/**
	 * Determines the smallest value of the components of the vector {@code (x, y)} and returns the
	 * index of the component. If two or more components have the same value the first index will be
	 * returned.
	 * 
	 * <p>
	 * The index returned is limited to the range of {@code 0-1}.
	 * 
	 * @param x
	 *     The value of the x component of the vector.
	 * @param y
	 *     The value of the y component of the vector.
	 * 
	 * @return The index of the smallest component.
	 */
	public static int minComponent(float x, float y)
	{
		float value = x;
		int index = 0;
		
		if (y < value)
		{
			value = y;
			index = 1;
		}
		
		return index;
	}
	
	/**
	 * Determines the component wise smallest value of the vector {@code (v1)} and the vector
	 * {@code (v2)} and saves the result in the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code min(v1, v2)}
	 * 
	 * @param v1
	 *     The first vector.
	 * @param v2
	 *     The second vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] minVector(Tup2fR v1, Tup2fR v2, @ExtractionParam @MinLength(2) float[] res)
	{
		return minVector(v1.v0(), v1.v1(), v2.v0(), v2.v1(), res);
	}
	
	/**
	 * Determines the component wise smallest value of the vector {@code (v1)} and the vector
	 * {@code (v2[0], v2[1])} and saves the result in the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code min(v1, (v2[0], v2[1]))}
	 * 
	 * @param v1
	 *     The first vector.
	 * @param v2
	 *     The second vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] minVector(Tup2fR v1, @MinLength(2) float[] v2, @ExtractionParam @MinLength(2) float[] res)
	{
		return minVector(v1.v0(), v1.v1(), v2[0], v2[1], res);
	}
	
	/**
	 * Determines the component wise smallest value of the vector {@code (v1)} and the vector
	 * {@code (v2x, v2y)} and saves the result in the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code min(v1, (v2x, v2y))}
	 * 
	 * @param v1
	 *     The first vector.
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] minVector(Tup2fR v1, float v2x, float v2y, @ExtractionParam @MinLength(2) float[] res)
	{
		return minVector(v1.v0(), v1.v1(), v2x, v2y, res);
	}
	
	/**
	 * Determines the component wise smallest value of the vector {@code (v1[0], v1[1])} and the
	 * vector {@code (v2)} and saves the result in the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code min((v1[0], v1[1]), v2)}
	 * 
	 * @param v1
	 *     The first vector as an array with at least two entries.
	 * @param v2
	 *     The second vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] minVector(@MinLength(2) float[] v1, Tup2fR v2, @ExtractionParam @MinLength(2) float[] res)
	{
		return minVector(v1[0], v1[1], v2.v0(), v2.v1(), res);
	}
	
	/**
	 * Determines the component wise smallest value of the vector {@code (v1[0], v1[1])} and the
	 * vector {@code (v2[0], v2[1])} and saves the result in the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code min((v1[0], v1[1]), (v2[0], v2[1]))}
	 * 
	 * @param v1
	 *     The first vector as an array with at least two entries.
	 * @param v2
	 *     The second vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] minVector(@MinLength(2) float[] v1, @MinLength(2) float[] v2,
			@ExtractionParam @MinLength(2) float[] res)
	{
		return minVector(v1[0], v1[1], v2[0], v2[1], res);
	}
	
	/**
	 * Determines the component wise smallest value of the vector {@code (v1[0], v1[1])} and the
	 * vector {@code (v2x, v2y)} and saves the result in the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code min((v1[0], v1[1]), (v2x, v2y))}
	 * 
	 * @param v1
	 *     The first vector as an array with at least two entries.
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] minVector(@MinLength(2) float[] v1, float v2x, float v2y,
			@ExtractionParam @MinLength(2) float[] res)
	{
		return minVector(v1[0], v1[1], v2x, v2y, res);
	}
	
	/**
	 * Determines the component wise smallest value of the vector {@code (v1x, v1y)} and the vector
	 * {@code (v2)} and saves the result in the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code min((v1x, v1y), v2)}
	 * 
	 * @param v1x
	 *     The value of the x component of the first vector.
	 * @param v1y
	 *     The value of the y component of the first vector.
	 * @param v2
	 *     The second vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] minVector(float v1x, float v1y, Tup2fR v2, @ExtractionParam @MinLength(2) float[] res)
	{
		return minVector(v1x, v1y, v2.v0(), v2.v1(), res);
	}
	
	/**
	 * Determines the component wise smallest value of the vector {@code (v1x, v1y)} and the vector
	 * {@code (v2[0], v2[1])} and saves the result in the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code min((v1x, v1y), (v2[0], v2[1]))}
	 * 
	 * @param v1x
	 *     The value of the x component of the first vector.
	 * @param v1y
	 *     The value of the y component of the first vector.
	 * @param v2
	 *     The second vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] minVector(float v1x, float v1y, @MinLength(2) float[] v2,
			@ExtractionParam @MinLength(2) float[] res)
	{
		return minVector(v1x, v1y, v2[0], v2[1], res);
	}
	
	/**
	 * Determines the component wise smallest value of the vector {@code (v1x, v1y)} and the vector
	 * {@code (v2x, v2y)} and saves the result in the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code min((v1x, v1y), (v2x, v2y))}
	 * 
	 * @param v1x
	 *     The value of the x component of the first vector.
	 * @param v1y
	 *     The value of the y component of the first vector.
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] minVector(float v1x, float v1y, float v2x, float v2y,
			@ExtractionParam @MinLength(2) float[] res)
	{
		res[0] = Math.min(v1x, v2x);
		res[1] = Math.min(v1y, v2y);
		
		return res;
	}
	
	/**
	 * Determines the component wise smallest value of the vector {@code (v1)} and the vector
	 * {@code (v2)} and saves the result in the extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code min(v1, v2)}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1
	 *     The first vector.
	 * @param v2
	 *     The second vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T minVector(Tup2fR v1, Tup2fR v2, @ExtractionParam T res)
	{
		return minVector(v1.v0(), v1.v1(), v2.v0(), v2.v1(), res);
	}
	
	/**
	 * Determines the component wise smallest value of the vector {@code (v1)} and the vector
	 * {@code (v2[0], v2[1])} and saves the result in the extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code min(v1, (v2[0], v2[1]))}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1
	 *     The first vector.
	 * @param v2
	 *     The second vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T minVector(Tup2fR v1, @MinLength(2) float[] v2, @ExtractionParam T res)
	{
		return minVector(v1.v0(), v1.v1(), v2[0], v2[1], res);
	}
	
	/**
	 * Determines the component wise smallest value of the vector {@code (v1)} and the vector
	 * {@code (v2x, v2y)} and saves the result in the extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code min(v1, (v2x, v2y))}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1
	 *     The first vector.
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T minVector(Tup2fR v1, float v2x, float v2y, @ExtractionParam T res)
	{
		return minVector(v1.v0(), v1.v1(), v2x, v2y, res);
	}
	
	/**
	 * Determines the component wise smallest value of the vector {@code (v1[0], v1[1])} and the
	 * vector {@code (v2)} and saves the result in the extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code min((v1[0], v1[1]), v2)}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1
	 *     The first vector as an array with at least two entries.
	 * @param v2
	 *     The second vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T minVector(@MinLength(2) float[] v1, Tup2fR v2, @ExtractionParam T res)
	{
		return minVector(v1[0], v1[1], v2.v0(), v2.v1(), res);
	}
	
	/**
	 * Determines the component wise smallest value of the vector {@code (v1[0], v1[1])} and the
	 * vector {@code (v2[0], v2[1])} and saves the result in the extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code min((v1[0], v1[1]), (v2[0], v2[1]))}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1
	 *     The first vector as an array with at least two entries.
	 * @param v2
	 *     The second vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T minVector(@MinLength(2) float[] v1, @MinLength(2) float[] v2,
			@ExtractionParam T res)
	{
		return minVector(v1[0], v1[1], v2[0], v2[1], res);
	}
	
	/**
	 * Determines the component wise smallest value of the vector {@code (v1[0], v1[1])} and the
	 * vector {@code (v2x, v2y)} and saves the result in the extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code min((v1[0], v1[1]), (v2x, v2y))}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1
	 *     The first vector as an array with at least two entries.
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T minVector(@MinLength(2) float[] v1, float v2x, float v2y, @ExtractionParam T res)
	{
		return minVector(v1[0], v1[1], v2x, v2y, res);
	}
	
	/**
	 * Determines the component wise smallest value of the vector {@code (v1x, v1y)} and the vector
	 * {@code (v2)} and saves the result in the extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code min((v1x, v1y), v2)}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1x
	 *     The value of the x component of the first vector.
	 * @param v1y
	 *     The value of the y component of the first vector.
	 * @param v2
	 *     The second vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T minVector(float v1x, float v1y, Tup2fR v2, @ExtractionParam T res)
	{
		return minVector(v1x, v1y, v2.v0(), v2.v1(), res);
	}
	
	/**
	 * Determines the component wise smallest value of the vector {@code (v1x, v1y)} and the vector
	 * {@code (v2[0], v2[1])} and saves the result in the extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code min((v1x, v1y), (v2[0], v2[1]))}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1x
	 *     The value of the x component of the first vector.
	 * @param v1y
	 *     The value of the y component of the first vector.
	 * @param v2
	 *     The second vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T minVector(float v1x, float v1y, @MinLength(2) float[] v2, @ExtractionParam T res)
	{
		return minVector(v1x, v1y, v2[0], v2[1], res);
	}
	
	/**
	 * Determines the component wise smallest value of the vector {@code (v1x, v1y)} and the vector
	 * {@code (v2x, v2y)} and saves the result in the extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code min((v1x, v1y), (v2x, v2y))}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1x
	 *     The value of the x component of the first vector.
	 * @param v1y
	 *     The value of the y component of the first vector.
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T minVector(float v1x, float v1y, float v2x, float v2y, @ExtractionParam T res)
	{
		res.set(Math.min(v1x, v2x), Math.min(v1y, v2y));
		
		return res;
	}
	
	/**
	 * Determines the component wise smallest value of the vector {@code (v1)} and the vector
	 * {@code (v2)}, supplies the result to the given implementation of the functional interface and
	 * returns the result of that implementation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code min(v1, v2)}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1
	 *     The first vector.
	 * @param v2
	 *     The second vector.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T minVectorFunc(Tup2fR v1, Tup2fR v2, FloatBiFunction<T> res)
	{
		return minVectorFunc(v1.v0(), v1.v1(), v2.v0(), v2.v1(), res);
	}
	
	/**
	 * Determines the component wise smallest value of the vector {@code (v1)} and the vector
	 * {@code (v2[0], v2[1])}, supplies the result to the given implementation of the functional
	 * interface and returns the result of that implementation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code min(v1, (v2[0], v2[1]))}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1
	 *     The first vector.
	 * @param v2
	 *     The second vector as an array with at least two entries.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T minVectorFunc(Tup2fR v1, @MinLength(2) float[] v2, FloatBiFunction<T> res)
	{
		return minVectorFunc(v1.v0(), v1.v1(), v2[0], v2[1], res);
	}
	
	/**
	 * Determines the component wise smallest value of the vector {@code (v1)} and the vector
	 * {@code (v2x, v2y)}, supplies the result to the given implementation of the functional
	 * interface and returns the result of that implementation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code min(v1, (v2x, v2y))}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1
	 *     The first vector.
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T minVectorFunc(Tup2fR v1, float v2x, float v2y, FloatBiFunction<T> res)
	{
		return minVectorFunc(v1.v0(), v1.v1(), v2x, v2y, res);
	}
	
	/**
	 * Determines the component wise smallest value of the vector {@code (v1[0], v1[1])} and the
	 * vector {@code (v2)}, supplies the result to the given implementation of the functional
	 * interface and returns the result of that implementation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code min((v1[0], v1[1]), v2)}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1
	 *     The first vector as an array with at least two entries.
	 * @param v2
	 *     The second vector.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T minVectorFunc(@MinLength(2) float[] v1, Tup2fR v2, FloatBiFunction<T> res)
	{
		return minVectorFunc(v1[0], v1[1], v2.v0(), v2.v1(), res);
	}
	
	/**
	 * Determines the component wise smallest value of the vector {@code (v1[0], v1[1])} and the
	 * vector {@code (v2[0], v2[1])}, supplies the result to the given implementation of the
	 * functional interface and returns the result of that implementation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code min((v1[0], v1[1]), (v2[0], v2[1]))}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1
	 *     The first vector as an array with at least two entries.
	 * @param v2
	 *     The second vector as an array with at least two entries.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T minVectorFunc(@MinLength(2) float[] v1, @MinLength(2) float[] v2, FloatBiFunction<T> res)
	{
		return minVectorFunc(v1[0], v1[1], v2[0], v2[1], res);
	}
	
	/**
	 * Determines the component wise smallest value of the vector {@code (v1[0], v1[1])} and the
	 * vector {@code (v2x, v2y)}, supplies the result to the given implementation of the functional
	 * interface and returns the result of that implementation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code min((v1[0], v1[1]), (v2x, v2y))}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1
	 *     The first vector as an array with at least two entries.
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T minVectorFunc(@MinLength(2) float[] v1, float v2x, float v2y, FloatBiFunction<T> res)
	{
		return minVectorFunc(v1[0], v1[1], v2x, v2y, res);
	}
	
	/**
	 * Determines the component wise smallest value of the vector {@code (v1x, v1y)} and the vector
	 * {@code (v2)}, supplies the result to the given implementation of the functional interface and
	 * returns the result of that implementation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code min((v1x, v1y), v2)}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1x
	 *     The value of the x component of the first vector.
	 * @param v1y
	 *     The value of the y component of the first vector.
	 * @param v2
	 *     The second vector.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T minVectorFunc(float v1x, float v1y, Tup2fR v2, FloatBiFunction<T> res)
	{
		return minVectorFunc(v1x, v1y, v2.v0(), v2.v1(), res);
	}
	
	/**
	 * Determines the component wise smallest value of the vector {@code (v1x, v1y)} and the vector
	 * {@code (v2[0], v2[1])}, supplies the result to the given implementation of the functional
	 * interface and returns the result of that implementation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code min((v1x, v1y), (v2[0], v2[1]))}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1x
	 *     The value of the x component of the first vector.
	 * @param v1y
	 *     The value of the y component of the first vector.
	 * @param v2
	 *     The second vector as an array with at least two entries.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T minVectorFunc(float v1x, float v1y, @MinLength(2) float[] v2, FloatBiFunction<T> res)
	{
		return minVectorFunc(v1x, v1y, v2[0], v2[1], res);
	}
	
	/**
	 * Determines the component wise smallest value of the vector {@code (v1x, v1y)} and the vector
	 * {@code (v2x, v2y)}, supplies the result to the given implementation of the functional
	 * interface and returns the result of that implementation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code min((v1x, v1y), (v2x, v2y))}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1x
	 *     The value of the x component of the first vector.
	 * @param v1y
	 *     The value of the y component of the first vector.
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T minVectorFunc(float v1x, float v1y, float v2x, float v2y, FloatBiFunction<T> res)
	{
		return res.apply(Math.min(v1x, v2x), Math.min(v1y, v2y));
	}
	
	/**
	 * Determines the greatest value of the components of the vector {@code (v)} and saves the value
	 * and the component index in the extraction parameter object. If two or more components have
	 * the same value the first index will be returned.
	 * 
	 * <p>
	 * The index returned is limited to the range of {@code 0-1}.
	 * 
	 * @param v
	 *     The vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static FloatIndexValuePair max(Tup2fR v, @ExtractionParam FloatIndexValuePair res)
	{
		return max(v.v0(), v.v1(), res);
	}
	
	/**
	 * Determines the greatest value of the components of the vector {@code (v[0], v[1])} and saves
	 * the value and the component index in the extraction parameter object. If two or more
	 * components have the same value the first index will be returned.
	 * 
	 * <p>
	 * The index returned is limited to the range of {@code 0-1}.
	 * 
	 * @param v
	 *     The vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static FloatIndexValuePair max(@MinLength(2) float[] v, @ExtractionParam FloatIndexValuePair res)
	{
		return max(v[0], v[1], res);
	}
	
	/**
	 * Determines the greatest value of the components of the vector {@code (x, y)} and saves the
	 * value and the component index in the extraction parameter object. If two or more components
	 * have the same value the first index will be returned.
	 * 
	 * <p>
	 * The index returned is limited to the range of {@code 0-1}.
	 * 
	 * @param x
	 *     The value of the x component of the vector.
	 * @param y
	 *     The value of the y component of the vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static FloatIndexValuePair max(float x, float y, @ExtractionParam FloatIndexValuePair res)
	{
		float value = x;
		int index = 0;
		
		if (y > value)
		{
			value = y;
			index = 1;
		}
		
		res.set(value, index);
		
		return res;
	}
	
	/**
	 * Determines the greatest value of the components of the vector {@code (v)} and returns it.
	 * 
	 * @param v
	 *     The vector.
	 * 
	 * @return The greatest value of the components.
	 */
	public static float maxValue(Tup2fR v)
	{
		return maxValue(v.v0(), v.v1());
	}
	
	/**
	 * Determines the greatest value of the components of the vector {@code (v[0], v[1])} and
	 * returns it.
	 * 
	 * @param v
	 *     The vector as an array with at least two entries.
	 * 
	 * @return The greatest value of the components.
	 */
	public static float maxValue(@MinLength(2) float[] v)
	{
		return maxValue(v[0], v[1]);
	}
	
	/**
	 * Determines the greatest value of the components of the vector {@code (x, y)} and returns it.
	 * 
	 * @param x
	 *     The value of the x component of the vector.
	 * @param y
	 *     The value of the y component of the vector.
	 * 
	 * @return The greatest value of the components.
	 */
	public static float maxValue(float x, float y)
	{
		return Math.max(x, y);
	}
	
	/**
	 * Determines the greatest value of the components of the vector {@code (v)} and returns the
	 * index of the component. If two or more components have the same value the first index will be
	 * returned.
	 * 
	 * <p>
	 * The index returned is limited to the range of {@code 0-1}.
	 * 
	 * @param v
	 *     The vector.
	 * 
	 * @return The index of the greatest component.
	 */
	public static int maxComponent(Tup2fR v)
	{
		return maxComponent(v.v0(), v.v1());
	}
	
	/**
	 * Determines the greatest value of the components of the vector {@code (v[0], v[1])} and
	 * returns the index of the component. If two or more components have the same value the first
	 * index will be returned.
	 * 
	 * <p>
	 * The index returned is limited to the range of {@code 0-1}.
	 * 
	 * @param v
	 *     The vector as an array with at least two entries.
	 * 
	 * @return The index of the greatest component.
	 */
	public static int maxComponent(float[] v)
	{
		return maxComponent(v[0], v[1]);
	}
	
	/**
	 * Determines the greatest value of the components of the vector {@code (x, y)} and returns the
	 * index of the component. If two or more components have the same value the first index will be
	 * returned.
	 * 
	 * <p>
	 * The index returned is limited to the range of {@code 0-1}.
	 * 
	 * @param x
	 *     The value of the x component of the vector.
	 * @param y
	 *     The value of the y component of the vector.
	 * 
	 * @return The index of the greatest component.
	 */
	public static int maxComponent(float x, float y)
	{
		float value = x;
		int index = 0;
		
		if (y > value)
		{
			value = y;
			index = 1;
		}
		
		return index;
	}
	
	/**
	 * Determines the component wise greatest value of the vector {@code (v1)} and the vector
	 * {@code (v2)} and saves the result in the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code max(v1, v2)}
	 * 
	 * @param v1
	 *     The first vector.
	 * @param v2
	 *     The second vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] maxVector(Tup2fR v1, Tup2fR v2, @ExtractionParam @MinLength(2) float[] res)
	{
		return maxVector(v1.v0(), v1.v1(), v2.v0(), v2.v1(), res);
	}
	
	/**
	 * Determines the component wise greatest value of the vector {@code (v1)} and the vector
	 * {@code (v2[0], v2[1])} and saves the result in the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code max(v1, (v2[0], v2[1]))}
	 * 
	 * @param v1
	 *     The first vector.
	 * @param v2
	 *     The second vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] maxVector(Tup2fR v1, @MinLength(2) float[] v2, @ExtractionParam @MinLength(2) float[] res)
	{
		return maxVector(v1.v0(), v1.v1(), v2[0], v2[1], res);
	}
	
	/**
	 * Determines the component wise greatest value of the vector {@code (v1)} and the vector
	 * {@code (v2x, v2y)} and saves the result in the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code max(v1, (v2x, v2y))}
	 * 
	 * @param v1
	 *     The first vector.
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] maxVector(Tup2fR v1, float v2x, float v2y, @ExtractionParam @MinLength(2) float[] res)
	{
		return maxVector(v1.v0(), v1.v1(), v2x, v2y, res);
	}
	
	/**
	 * Determines the component wise greatest value of the vector {@code (v1[0], v1[1])} and the
	 * vector {@code (v2)} and saves the result in the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code max((v1[0], v1[1]), v2)}
	 * 
	 * @param v1
	 *     The first vector as an array with at least two entries.
	 * @param v2
	 *     The second vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] maxVector(@MinLength(2) float[] v1, Tup2fR v2, @ExtractionParam @MinLength(2) float[] res)
	{
		return maxVector(v1[0], v1[1], v2.v0(), v2.v1(), res);
	}
	
	/**
	 * Determines the component wise greatest value of the vector {@code (v1[0], v1[1])} and the
	 * vector {@code (v2[0], v2[1])} and saves the result in the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code max((v1[0], v1[1]), (v2[0], v2[1]))}
	 * 
	 * @param v1
	 *     The first vector as an array with at least two entries.
	 * @param v2
	 *     The second vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] maxVector(@MinLength(2) float[] v1, @MinLength(2) float[] v2,
			@ExtractionParam @MinLength(2) float[] res)
	{
		return maxVector(v1[0], v1[1], v2[0], v2[1], res);
	}
	
	/**
	 * Determines the component wise greatest value of the vector {@code (v1[0], v1[1])} and the
	 * vector {@code (v2x, v2y)} and saves the result in the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code max((v1[0], v1[1]), (v2x, v2y))}
	 * 
	 * @param v1
	 *     The first vector as an array with at least two entries.
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] maxVector(@MinLength(2) float[] v1, float v2x, float v2y,
			@ExtractionParam @MinLength(2) float[] res)
	{
		return maxVector(v1[0], v1[1], v2x, v2y, res);
	}
	
	/**
	 * Determines the component wise greatest value of the vector {@code (v1x, v1y)} and the vector
	 * {@code (v2)} and saves the result in the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code max((v1x, v1y), v2)}
	 * 
	 * @param v1x
	 *     The value of the x component of the first vector.
	 * @param v1y
	 *     The value of the y component of the first vector.
	 * @param v2
	 *     The second vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] maxVector(float v1x, float v1y, Tup2fR v2, @ExtractionParam @MinLength(2) float[] res)
	{
		return maxVector(v1x, v1y, v2.v0(), v2.v1(), res);
	}
	
	/**
	 * Determines the component wise greatest value of the vector {@code (v1x, v1y)} and the vector
	 * {@code (v2[0], v2[1])} and saves the result in the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code max((v1x, v1y), (v2[0], v2[1]))}
	 * 
	 * @param v1x
	 *     The value of the x component of the first vector.
	 * @param v1y
	 *     The value of the y component of the first vector.
	 * @param v2
	 *     The second vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] maxVector(float v1x, float v1y, @MinLength(2) float[] v2,
			@ExtractionParam @MinLength(2) float[] res)
	{
		return maxVector(v1x, v1y, v2[0], v2[1], res);
	}
	
	/**
	 * Determines the component wise greatest value of the vector {@code (v1x, v1y)} and the vector
	 * {@code (v2x, v2y)} and saves the result in the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code max((v1x, v1y), (v2x, v2y))}
	 * 
	 * @param v1x
	 *     The value of the x component of the first vector.
	 * @param v1y
	 *     The value of the y component of the first vector.
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] maxVector(float v1x, float v1y, float v2x, float v2y,
			@ExtractionParam @MinLength(2) float[] res)
	{
		res[0] = Math.max(v1x, v2x);
		res[1] = Math.max(v1y, v2y);
		
		return res;
	}
	
	/**
	 * Determines the component wise greatest value of the vector {@code (v1)} and the vector
	 * {@code (v2)} and saves the result in the extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code max(v1, v2)}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1
	 *     The first vector.
	 * @param v2
	 *     The second vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T maxVector(Tup2fR v1, Tup2fR v2, @ExtractionParam T res)
	{
		return maxVector(v1.v0(), v1.v1(), v2.v0(), v2.v1(), res);
	}
	
	/**
	 * Determines the component wise greatest value of the vector {@code (v1)} and the vector
	 * {@code (v2[0], v2[1])} and saves the result in the extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code max(v1, (v2[0], v2[1]))}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1
	 *     The first vector.
	 * @param v2
	 *     The second vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T maxVector(Tup2fR v1, @MinLength(2) float[] v2, @ExtractionParam T res)
	{
		return maxVector(v1.v0(), v1.v1(), v2[0], v2[1], res);
	}
	
	/**
	 * Determines the component wise greatest value of the vector {@code (v1)} and the vector
	 * {@code (v2x, v2y)} and saves the result in the extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code max(v1, (v2x, v2y))}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1
	 *     The first vector.
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T maxVector(Tup2fR v1, float v2x, float v2y, @ExtractionParam T res)
	{
		return maxVector(v1.v0(), v1.v1(), v2x, v2y, res);
	}
	
	/**
	 * Determines the component wise greatest value of the vector {@code (v1[0], v1[1])} and the
	 * vector {@code (v2)} and saves the result in the extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code max((v1[0], v1[1]), v2)}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1
	 *     The first vector as an array with at least two entries.
	 * @param v2
	 *     The second vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T maxVector(@MinLength(2) float[] v1, Tup2fR v2, @ExtractionParam T res)
	{
		return maxVector(v1[0], v1[1], v2.v0(), v2.v1(), res);
	}
	
	/**
	 * Determines the component wise greatest value of the vector {@code (v1[0], v1[1])} and the
	 * vector {@code (v2[0], v2[1])} and saves the result in the extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code max((v1[0], v1[1]), (v2[0], v2[1]))}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1
	 *     The first vector as an array with at least two entries.
	 * @param v2
	 *     The second vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T maxVector(@MinLength(2) float[] v1, @MinLength(2) float[] v2,
			@ExtractionParam T res)
	{
		return maxVector(v1[0], v1[1], v2[0], v2[1], res);
	}
	
	/**
	 * Determines the component wise greatest value of the vector {@code (v1[0], v1[1])} and the
	 * vector {@code (v2x, v2y)} and saves the result in the extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code max((v1[0], v1[1]), (v2x, v2y))}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1
	 *     The first vector as an array with at least two entries.
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T maxVector(@MinLength(2) float[] v1, float v2x, float v2y, @ExtractionParam T res)
	{
		return maxVector(v1[0], v1[1], v2x, v2y, res);
	}
	
	/**
	 * Determines the component wise greatest value of the vector {@code (v1x, v1y)} and the vector
	 * {@code (v2)} and saves the result in the extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code max((v1x, v1y), v2)}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1x
	 *     The value of the x component of the first vector.
	 * @param v1y
	 *     The value of the y component of the first vector.
	 * @param v2
	 *     The second vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T maxVector(float v1x, float v1y, Tup2fR v2, @ExtractionParam T res)
	{
		return maxVector(v1x, v1y, v2.v0(), v2.v1(), res);
	}
	
	/**
	 * Determines the component wise greatest value of the vector {@code (v1x, v1y)} and the vector
	 * {@code (v2[0], v2[1])} and saves the result in the extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code max((v1x, v1y), (v2[0], v2[1]))}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1x
	 *     The value of the x component of the first vector.
	 * @param v1y
	 *     The value of the y component of the first vector.
	 * @param v2
	 *     The second vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T maxVector(float v1x, float v1y, @MinLength(2) float[] v2, @ExtractionParam T res)
	{
		return maxVector(v1x, v1y, v2[0], v2[1], res);
	}
	
	/**
	 * Determines the component wise greatest value of the vector {@code (v1x, v1y)} and the vector
	 * {@code (v2x, v2y)} and saves the result in the extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code max((v1x, v1y), (v2x, v2y))}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1x
	 *     The value of the x component of the first vector.
	 * @param v1y
	 *     The value of the y component of the first vector.
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T maxVector(float v1x, float v1y, float v2x, float v2y, @ExtractionParam T res)
	{
		res.set(Math.max(v1x, v2x), Math.max(v1y, v2y));
		
		return res;
	}
	
	/**
	 * Determines the component wise greatest value of the vector {@code (v1)} and the vector
	 * {@code (v2)}, supplies the result to the given implementation of the functional interface and
	 * returns the result of that implementation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code max(v1, v2)}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1
	 *     The first vector.
	 * @param v2
	 *     The second vector.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T maxVectorFunc(Tup2fR v1, Tup2fR v2, FloatBiFunction<T> res)
	{
		return maxVectorFunc(v1.v0(), v1.v1(), v2.v0(), v2.v1(), res);
	}
	
	/**
	 * Determines the component wise greatest value of the vector {@code (v1)} and the vector
	 * {@code (v2[0], v2[1])}, supplies the result to the given implementation of the functional
	 * interface and returns the result of that implementation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code max(v1, (v2[0], v2[1]))}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1
	 *     The first vector.
	 * @param v2
	 *     The second vector as an array with at least two entries.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T maxVectorFunc(Tup2fR v1, @MinLength(2) float[] v2, FloatBiFunction<T> res)
	{
		return maxVectorFunc(v1.v0(), v1.v1(), v2[0], v2[1], res);
	}
	
	/**
	 * Determines the component wise greatest value of the vector {@code (v1)} and the vector
	 * {@code (v2x, v2y)}, supplies the result to the given implementation of the functional
	 * interface and returns the result of that implementation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code max(v1, (v2x, v2y))}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1
	 *     The first vector.
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T maxVectorFunc(Tup2fR v1, float v2x, float v2y, FloatBiFunction<T> res)
	{
		return maxVectorFunc(v1.v0(), v1.v1(), v2x, v2y, res);
	}
	
	/**
	 * Determines the component wise greatest value of the vector {@code (v1[0], v1[1])} and the
	 * vector {@code (v2)}, supplies the result to the given implementation of the functional
	 * interface and returns the result of that implementation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code max((v1[0], v1[1]), v2)}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1
	 *     The first vector as an array with at least two entries.
	 * @param v2
	 *     The second vector.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T maxVectorFunc(@MinLength(2) float[] v1, Tup2fR v2, FloatBiFunction<T> res)
	{
		return maxVectorFunc(v1[0], v1[1], v2.v0(), v2.v1(), res);
	}
	
	/**
	 * Determines the component wise greatest value of the vector {@code (v1[0], v1[1])} and the
	 * vector {@code (v2[0], v2[1])}, supplies the result to the given implementation of the
	 * functional interface and returns the result of that implementation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code max((v1[0], v1[1]), (v2[0], v2[1]))}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1
	 *     The first vector as an array with at least two entries.
	 * @param v2
	 *     The second vector as an array with at least two entries.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T maxVectorFunc(@MinLength(2) float[] v1, @MinLength(2) float[] v2, FloatBiFunction<T> res)
	{
		return maxVectorFunc(v1[0], v1[1], v2[0], v2[1], res);
	}
	
	/**
	 * Determines the component wise greatest value of the vector {@code (v1[0], v1[1])} and the
	 * vector {@code (v2x, v2y)}, supplies the result to the given implementation of the functional
	 * interface and returns the result of that implementation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code max((v1[0], v1[1]), (v2x, v2y))}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1
	 *     The first vector as an array with at least two entries.
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T maxVectorFunc(@MinLength(2) float[] v1, float v2x, float v2y, FloatBiFunction<T> res)
	{
		return maxVectorFunc(v1[0], v1[1], v2x, v2y, res);
	}
	
	/**
	 * Determines the component wise greatest value of the vector {@code (v1x, v1y)} and the vector
	 * {@code (v2)}, supplies the result to the given implementation of the functional interface and
	 * returns the result of that implementation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code max((v1x, v1y), v2)}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1x
	 *     The value of the x component of the first vector.
	 * @param v1y
	 *     The value of the y component of the first vector.
	 * @param v2
	 *     The second vector.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T maxVectorFunc(float v1x, float v1y, Tup2fR v2, FloatBiFunction<T> res)
	{
		return maxVectorFunc(v1x, v1y, v2.v0(), v2.v1(), res);
	}
	
	/**
	 * Determines the component wise greatest value of the vector {@code (v1x, v1y)} and the vector
	 * {@code (v2[0], v2[1])}, supplies the result to the given implementation of the functional
	 * interface and returns the result of that implementation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code max((v1x, v1y), (v2[0], v2[1]))}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1x
	 *     The value of the x component of the first vector.
	 * @param v1y
	 *     The value of the y component of the first vector.
	 * @param v2
	 *     The second vector as an array with at least two entries.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T maxVectorFunc(float v1x, float v1y, @MinLength(2) float[] v2, FloatBiFunction<T> res)
	{
		return maxVectorFunc(v1x, v1y, v2[0], v2[1], res);
	}
	
	/**
	 * Determines the component wise greatest value of the vector {@code (v1x, v1y)} and the vector
	 * {@code (v2x, v2y)}, supplies the result to the given implementation of the functional
	 * interface and returns the result of that implementation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code max((v1x, v1y), (v2x, v2y))}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1x
	 *     The value of the x component of the first vector.
	 * @param v1y
	 *     The value of the y component of the first vector.
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T maxVectorFunc(float v1x, float v1y, float v2x, float v2y, FloatBiFunction<T> res)
	{
		return res.apply(Math.max(v1x, v2x), Math.max(v1y, v2y));
	}
	
	/**
	 * Normalizes the vector {@code (v)} and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v / |v|}
	 * 
	 * @param v
	 *     The vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] normalize(Tup2fR v, @ExtractionParam @MinLength(2) float[] res)
	{
		return normalize(v.v0(), v.v1(), res);
	}
	
	/**
	 * Normalizes the vector {@code (v)} and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v / |v|}
	 * 
	 * @param v
	 *     The vector.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] normalize(Tup2fR v, MathProvider mathProvider, @ExtractionParam @MinLength(2) float[] res)
	{
		return normalize(v.v0(), v.v1(), mathProvider, res);
	}
	
	/**
	 * Normalizes the vector {@code (v)} and saves the result in the given extraction parameter. If
	 * the values of all components are within the margin defined by
	 * {@code (-tolerance <= value <= tolerance)} the result will be a zero vector.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v / |v|}
	 * 
	 * @param v
	 *     The vector.
	 * @param tolerance
	 *     The tolerance for defining the margin around zero. Must be positive.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] normalize(Tup2fR v, @FloatMinValue(0.0f) float tolerance,
			@ExtractionParam @MinLength(2) float[] res)
	{
		return normalize(v.v0(), v.v1(), tolerance, res);
	}
	
	/**
	 * Normalizes the vector {@code (v)} and saves the result in the given extraction parameter. If
	 * the values of all components are within the margin defined by
	 * {@code (-tolerance <= value <= tolerance)} the result will be a zero vector.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v / |v|}
	 * 
	 * @param v
	 *     The vector.
	 * @param tolerance
	 *     The tolerance for defining the margin around zero. Must be positive.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] normalize(Tup2fR v, @FloatMinValue(0.0f) float tolerance, MathProvider mathProvider,
			@ExtractionParam @MinLength(2) float[] res)
	{
		return normalize(v.v0(), v.v1(), tolerance, mathProvider, res);
	}
	
	/**
	 * Normalizes the vector {@code (v[0], v[1])} and saves the result in the given extraction
	 * parameter.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v[0], v[1]) / |(v[0], v[1])|}
	 * 
	 * @param v
	 *     The vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] normalize(@MinLength(2) float[] v, @ExtractionParam @MinLength(2) float[] res)
	{
		return normalize(v[0], v[1], res);
	}
	
	/**
	 * Normalizes the vector {@code (v[0], v[1])} and saves the result in the given extraction
	 * parameter.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v[0], v[1]) / |(v[0], v[1])|}
	 * 
	 * @param v
	 *     The vector as an array with at least two entries.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] normalize(@MinLength(2) float[] v, MathProvider mathProvider,
			@ExtractionParam @MinLength(2) float[] res)
	{
		return normalize(v[0], v[1], mathProvider, res);
	}
	
	/**
	 * Normalizes the vector {@code (v[0], v[1])} and saves the result in the given extraction
	 * parameter. If the values of all components are within the margin defined by
	 * {@code (-tolerance <= value <= tolerance)} the result will be a zero vector.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v[0], v[1]) / |(v[0], v[1])|}
	 * 
	 * @param v
	 *     The vector as an array with at least two entries.
	 * @param tolerance
	 *     The tolerance for defining the margin around zero. Must be positive.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] normalize(@MinLength(2) float[] v, @FloatMinValue(0.0f) float tolerance,
			@ExtractionParam @MinLength(2) float[] res)
	{
		return normalize(v[0], v[1], tolerance, res);
	}
	
	/**
	 * Normalizes the vector {@code (v[0], v[1])} and saves the result in the given extraction
	 * parameter. If the values of all components are within the margin defined by
	 * {@code (-tolerance <= value <= tolerance)} the result will be a zero vector.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v[0], v[1]) / |(v[0], v[1])|}
	 * 
	 * @param v
	 *     The vector as an array with at least two entries.
	 * @param tolerance
	 *     The tolerance for defining the margin around zero. Must be positive.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] normalize(@MinLength(2) float[] v, @FloatMinValue(0.0f) float tolerance,
			MathProvider mathProvider, @ExtractionParam @MinLength(2) float[] res)
	{
		return normalize(v[0], v[1], tolerance, mathProvider, res);
	}
	
	/**
	 * Normalizes the vector {@code (x, y)} and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (x, y) / |(x, y)|}
	 * 
	 * @param x
	 *     The value of the x component of the vector.
	 * @param y
	 *     The value of the y component of the vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] normalize(float x, float y, @ExtractionParam @MinLength(2) float[] res)
	{
		if (x == 0.0f && y == 0.0f)
		{
			res[0] = 0.0f;
			res[1] = 0.0f;
			
			return res;
		}
		
		float invLength = inverseLength(x, y);
		
		res[0] = x * invLength;
		res[1] = y * invLength;
		
		return res;
	}
	
	/**
	 * Normalizes the vector {@code (x, y)} and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (x, y) / |(x, y)|}
	 * 
	 * @param x
	 *     The value of the x component of the vector.
	 * @param y
	 *     The value of the y component of the vector.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] normalize(float x, float y, MathProvider mathProvider,
			@ExtractionParam @MinLength(2) float[] res)
	{
		if (x == 0.0f && y == 0.0f)
		{
			res[0] = 0.0f;
			res[1] = 0.0f;
			
			return res;
		}
		
		float invLength = inverseLength(x, y, mathProvider);
		
		res[0] = x * invLength;
		res[1] = y * invLength;
		
		return res;
	}
	
	/**
	 * Normalizes the vector {@code (x, y)} and saves the result in the given extraction parameter.
	 * If the values of all components are within the margin defined by
	 * {@code (-tolerance <= value <= tolerance)} the result will be a zero vector.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (x, y) / |(x, y)|}
	 * 
	 * @param x
	 *     The value of the x component of the vector.
	 * @param y
	 *     The value of the y component of the vector.
	 * @param tolerance
	 *     The tolerance for defining the margin around zero. Must be positive.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] normalize(float x, float y, @FloatMinValue(0.0f) float tolerance,
			@ExtractionParam @MinLength(2) float[] res)
	{
		if (Math.abs(x) <= tolerance && Math.abs(y) <= tolerance)
		{
			res[0] = 0.0f;
			res[1] = 0.0f;
			
			return res;
		}
		
		float invLength = inverseLength(x, y);
		
		res[0] = x * invLength;
		res[1] = y * invLength;
		
		return res;
	}
	
	/**
	 * Normalizes the vector {@code (x, y)} and saves the result in the given extraction parameter.
	 * If the values of all components are within the margin defined by
	 * {@code (-tolerance <= value <= tolerance)} the result will be a zero vector.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (x, y) / |(x, y)|}
	 * 
	 * @param x
	 *     The value of the x component of the vector.
	 * @param y
	 *     The value of the y component of the vector.
	 * @param tolerance
	 *     The tolerance for defining the margin around zero. Must be positive.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] normalize(float x, float y, @FloatMinValue(0.0f) float tolerance, MathProvider mathProvider,
			@ExtractionParam @MinLength(2) float[] res)
	{
		if (Math.abs(x) <= tolerance && Math.abs(y) <= tolerance)
		{
			res[0] = 0.0f;
			res[1] = 0.0f;
			
			return res;
		}
		
		float invLength = inverseLength(x, y, mathProvider);
		
		res[0] = x * invLength;
		res[1] = y * invLength;
		
		return res;
	}
	
	/**
	 * Normalizes the vector {@code (v)} and saves the result in the given extraction parameter
	 * object.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v / |v|}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v
	 *     The vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T normalize(Tup2fR v, @ExtractionParam T res)
	{
		return normalize(v.v0(), v.v1(), res);
	}
	
	/**
	 * Normalizes the vector {@code (v)} and saves the result in the given extraction parameter
	 * object.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v / |v|}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v
	 *     The vector.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T normalize(Tup2fR v, MathProvider mathProvider, @ExtractionParam T res)
	{
		return normalize(v.v0(), v.v1(), res);
	}
	
	/**
	 * Normalizes the vector {@code (v)} and saves the result in the given extraction parameter
	 * object. If the values of all components are within the margin defined by
	 * {@code (-tolerance <= value <= tolerance)} the result will be a zero vector.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v / |v|}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v
	 *     The vector.
	 * @param tolerance
	 *     The tolerance for defining the margin around zero. Must be positive.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T normalize(Tup2fR v, @FloatMinValue(0.0f) float tolerance, @ExtractionParam T res)
	{
		return normalize(v.v0(), v.v1(), tolerance, res);
	}
	
	/**
	 * Normalizes the vector {@code (v)} and saves the result in the given extraction parameter
	 * object. If the values of all components are within the margin defined by
	 * {@code (-tolerance <= value <= tolerance)} the result will be a zero vector.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v / |v|}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v
	 *     The vector.
	 * @param tolerance
	 *     The tolerance for defining the margin around zero. Must be positive.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T normalize(Tup2fR v, @FloatMinValue(0.0f) float tolerance,
			MathProvider mathProvider, @ExtractionParam T res)
	{
		return normalize(v.v0(), v.v1(), tolerance, res);
	}
	
	/**
	 * Normalizes the vector {@code (v[0], v[1])} and saves the result in the given extraction
	 * parameter object.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v[0], v[1]) / |(v[0], v[1])|}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v
	 *     The vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T normalize(@MinLength(2) float[] v, @ExtractionParam T res)
	{
		return normalize(v[0], v[1], res);
	}
	
	/**
	 * Normalizes the vector {@code (v[0], v[1])} and saves the result in the given extraction
	 * parameter object.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v[0], v[1]) / |(v[0], v[1])|}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v
	 *     The vector as an array with at least two entries.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T normalize(@MinLength(2) float[] v, MathProvider mathProvider,
			@ExtractionParam T res)
	{
		return normalize(v[0], v[1], mathProvider, res);
	}
	
	/**
	 * Normalizes the vector {@code (v[0], v[1])} and saves the result in the given extraction
	 * parameter object. If the values of all components are within the margin defined by
	 * {@code (-tolerance <= value <= tolerance)} the result will be a zero vector.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v[0], v[1]) / |(v[0], v[1])|}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v
	 *     The vector as an array with at least two entries.
	 * @param tolerance
	 *     The tolerance for defining the margin around zero. Must be positive.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T normalize(@MinLength(2) float[] v, @FloatMinValue(0.0f) float tolerance,
			@ExtractionParam T res)
	{
		return normalize(v[0], v[1], tolerance, res);
	}
	
	/**
	 * Normalizes the vector {@code (v[0], v[1])} and saves the result in the given extraction
	 * parameter object. If the values of all components are within the margin defined by
	 * {@code (-tolerance <= value <= tolerance)} the result will be a zero vector.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v[0], v[1]) / |(v[0], v[1])|}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v
	 *     The vector as an array with at least two entries.
	 * @param tolerance
	 *     The tolerance for defining the margin around zero. Must be positive.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T normalize(@MinLength(2) float[] v, @FloatMinValue(0.0f) float tolerance,
			MathProvider mathProvider, @ExtractionParam T res)
	{
		return normalize(v[0], v[1], tolerance, mathProvider, res);
	}
	
	/**
	 * Normalizes the vector {@code (x, y)} and saves the result in the given extraction parameter
	 * object.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (x, y) / |(x, y)|}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param x
	 *     The value of the x component of the vector.
	 * @param y
	 *     The value of the y component of the vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T normalize(float x, float y, @ExtractionParam T res)
	{
		if (x == 0.0f && y == 0.0f)
		{
			res.set(0.0f, 0.0f);
			
			return res;
		}
		
		float invLength = inverseLength(x, y);
		
		res.set(x * invLength, y * invLength);
		
		return res;
	}
	
	/**
	 * Normalizes the vector {@code (x, y)} and saves the result in the given extraction parameter
	 * object.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (x, y) / |(x, y)|}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param x
	 *     The value of the x component of the vector.
	 * @param y
	 *     The value of the y component of the vector.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T normalize(float x, float y, MathProvider mathProvider, @ExtractionParam T res)
	{
		if (x == 0.0f && y == 0.0f)
		{
			res.set(0.0f, 0.0f);
			
			return res;
		}
		
		float invLength = inverseLength(x, y, mathProvider);
		
		res.set(x * invLength, y * invLength);
		
		return res;
	}
	
	/**
	 * Normalizes the vector {@code (x, y)} and saves the result in the given extraction parameter
	 * object. If the values of all components are within the margin defined by
	 * {@code (-tolerance <= value <= tolerance)} the result will be a zero vector.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (x, y) / |(x, y)|}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param x
	 *     The value of the x component of the vector.
	 * @param y
	 *     The value of the y component of the vector.
	 * @param tolerance
	 *     The tolerance for defining the margin around zero. Must be positive.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T normalize(float x, float y, @FloatMinValue(0.0f) float tolerance,
			@ExtractionParam T res)
	{
		if (Math.abs(x) <= tolerance && Math.abs(y) <= tolerance)
		{
			res.set(0.0f, 0.0f);
			
			return res;
		}
		
		float invLength = inverseLength(x, y);
		
		res.set(x * invLength, y * invLength);
		
		return res;
	}
	
	/**
	 * Normalizes the vector {@code (x, y)} and saves the result in the given extraction parameter
	 * object. If the values of all components are within the margin defined by
	 * {@code (-tolerance <= value <= tolerance)} the result will be a zero vector.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (x, y) / |(x, y)|}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param x
	 *     The value of the x component of the vector.
	 * @param y
	 *     The value of the y component of the vector.
	 * @param tolerance
	 *     The tolerance for defining the margin around zero. Must be positive.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T normalize(float x, float y, @FloatMinValue(0.0f) float tolerance,
			MathProvider mathProvider, @ExtractionParam T res)
	{
		if (Math.abs(x) <= tolerance && Math.abs(y) <= tolerance)
		{
			res.set(0.0f, 0.0f);
			
			return res;
		}
		
		float invLength = inverseLength(x, y, mathProvider);
		
		res.set(x * invLength, y * invLength);
		
		return res;
	}
	
	/**
	 * Normalizes the vector {@code (v)}, supplies the result to the given implementation of the
	 * functional interface and returns the result of that implementation.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v / |v|}
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v
	 *     The vector.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T normalizeFunc(Tup2fR v, FloatBiFunction<T> res)
	{
		return normalizeFunc(v.v0(), v.v1(), res);
	}
	
	/**
	 * Normalizes the vector {@code (v)}, supplies the result to the given implementation of the
	 * functional interface and returns the result of that implementation.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v / |v|}
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v
	 *     The vector.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T normalizeFunc(Tup2fR v, MathProvider mathProvider, FloatBiFunction<T> res)
	{
		return normalizeFunc(v.v0(), v.v1(), res);
	}
	
	/**
	 * Normalizes the vector {@code (v)}, supplies the result to the given implementation of the
	 * functional interface and returns the result of that implementation. If the values of all
	 * components are within the margin defined by {@code (-tolerance <= value <= tolerance)} the
	 * result will be a zero vector.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v / |v|}
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v
	 *     The vector.
	 * @param tolerance
	 *     The tolerance for defining the margin around zero. Must be positive.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T normalizeFunc(Tup2fR v, @FloatMinValue(0.0f) float tolerance, FloatBiFunction<T> res)
	{
		return normalizeFunc(v.v0(), v.v1(), tolerance, res);
	}
	
	/**
	 * Normalizes the vector {@code (v)}, supplies the result to the given implementation of the
	 * functional interface and returns the result of that implementation. If the values of all
	 * components are within the margin defined by {@code (-tolerance <= value <= tolerance)} the
	 * result will be a zero vector.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v / |v|}
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v
	 *     The vector.
	 * @param tolerance
	 *     The tolerance for defining the margin around zero. Must be positive.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T normalizeFunc(Tup2fR v, @FloatMinValue(0.0f) float tolerance, MathProvider mathProvider,
			FloatBiFunction<T> res)
	{
		return normalizeFunc(v.v0(), v.v1(), tolerance, res);
	}
	
	/**
	 * Normalizes the vector {@code (v[0], v[1])}, supplies the result to the given implementation
	 * of the functional interface and returns the result of that implementation.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v[0], v[1]) / |(v[0], v[1])|}
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v
	 *     The vector as an array with at least two entries.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T normalizeFunc(@MinLength(2) float[] v, FloatBiFunction<T> res)
	{
		return normalizeFunc(v[0], v[1], res);
	}
	
	/**
	 * Normalizes the vector {@code (v[0], v[1])}, supplies the result to the given implementation
	 * of the functional interface and returns the result of that implementation.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v[0], v[1]) / |(v[0], v[1])|}
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v
	 *     The vector as an array with at least two entries.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T normalizeFunc(@MinLength(2) float[] v, MathProvider mathProvider, FloatBiFunction<T> res)
	{
		return normalizeFunc(v[0], v[1], mathProvider, res);
	}
	
	/**
	 * Normalizes the vector {@code (v[0], v[1])}, supplies the result to the given implementation
	 * of the functional interface and returns the result of that implementation. If the values of
	 * all components are within the margin defined by {@code (-tolerance <= value <= tolerance)}
	 * the result will be a zero vector.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v[0], v[1]) / |(v[0], v[1])|}
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v
	 *     The vector as an array with at least two entries.
	 * @param tolerance
	 *     The tolerance for defining the margin around zero. Must be positive.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T normalizeFunc(@MinLength(2) float[] v, @FloatMinValue(0.0f) float tolerance,
			FloatBiFunction<T> res)
	{
		return normalizeFunc(v[0], v[1], tolerance, res);
	}
	
	/**
	 * Normalizes the vector {@code (v[0], v[1])}, supplies the result to the given implementation
	 * of the functional interface and returns the result of that implementation. If the values of
	 * all components are within the margin defined by {@code (-tolerance <= value <= tolerance)}
	 * the result will be a zero vector.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v[0], v[1]) / |(v[0], v[1])|}
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v
	 *     The vector as an array with at least two entries.
	 * @param tolerance
	 *     The tolerance for defining the margin around zero. Must be positive.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T normalizeFunc(@MinLength(2) float[] v, @FloatMinValue(0.0f) float tolerance,
			MathProvider mathProvider, FloatBiFunction<T> res)
	{
		return normalizeFunc(v[0], v[1], tolerance, mathProvider, res);
	}
	
	/**
	 * Normalizes the vector {@code (x, y)}, supplies the result to the given implementation of the
	 * functional interface and returns the result of that implementation.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (x, y) / |(x, y)|}
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param x
	 *     The value of the x component of the vector.
	 * @param y
	 *     The value of the y component of the vector.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T normalizeFunc(float x, float y, FloatBiFunction<T> res)
	{
		if (x == 0.0f && y == 0.0f)
		{
			return res.apply(0.0f, 0.0f);
		}
		
		float invLength = inverseLength(x, y);
		
		return res.apply(x * invLength, y * invLength);
	}
	
	/**
	 * Normalizes the vector {@code (x, y)}, supplies the result to the given implementation of the
	 * functional interface and returns the result of that implementation.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (x, y) / |(x, y)|}
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param x
	 *     The value of the x component of the vector.
	 * @param y
	 *     The value of the y component of the vector.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T normalizeFunc(float x, float y, MathProvider mathProvider, FloatBiFunction<T> res)
	{
		if (x == 0.0f && y == 0.0f)
		{
			return res.apply(0.0f, 0.0f);
		}
		
		float invLength = inverseLength(x, y, mathProvider);
		
		return res.apply(x * invLength, y * invLength);
	}
	
	/**
	 * Normalizes the vector {@code (x, y)}, supplies the result to the given implementation of the
	 * functional interface and returns the result of that implementation. If the values of all
	 * components are within the margin defined by {@code (-tolerance <= value <= tolerance)} the
	 * result will be a zero vector.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (x, y) / |(x, y)|}
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param x
	 *     The value of the x component of the vector.
	 * @param y
	 *     The value of the y component of the vector.
	 * @param tolerance
	 *     The tolerance for defining the margin around zero. Must be positive.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T normalizeFunc(float x, float y, @FloatMinValue(0.0f) float tolerance, FloatBiFunction<T> res)
	{
		if (Math.abs(x) <= tolerance && Math.abs(y) <= tolerance)
		{
			return res.apply(0.0f, 0.0f);
		}
		
		float invLength = inverseLength(x, y);
		
		return res.apply(x * invLength, y * invLength);
	}
	
	/**
	 * Normalizes the vector {@code (x, y)}, supplies the result to the given implementation of the
	 * functional interface and returns the result of that implementation. If the values of all
	 * components are within the margin defined by {@code (-tolerance <= value <= tolerance)} the
	 * result will be a zero vector.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (x, y) / |(x, y)|}
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param x
	 *     The value of the x component of the vector.
	 * @param y
	 *     The value of the y component of the vector.
	 * @param tolerance
	 *     The tolerance for defining the margin around zero. Must be positive.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T normalizeFunc(float x, float y, @FloatMinValue(0.0f) float tolerance, MathProvider mathProvider,
			FloatBiFunction<T> res)
	{
		if (Math.abs(x) <= tolerance && Math.abs(y) <= tolerance)
		{
			return res.apply(0.0f, 0.0f);
		}
		
		float invLength = inverseLength(x, y, mathProvider);
		
		return res.apply(x * invLength, y * invLength);
	}
	
	/**
	 * Negates the vector {@code (v)} and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Operation: {@code -v}
	 * 
	 * @param v
	 *     The vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] negate(Tup2fR v, @ExtractionParam @MinLength(2) float[] res)
	{
		return negate(v.v0(), v.v1(), res);
	}
	
	/**
	 * Negates the vector {@code (v[0], v[1])} and saves the result in the given extraction
	 * parameter.
	 * 
	 * <p>
	 * Operation: {@code -(v[0], v[1])}
	 * 
	 * @param v
	 *     The vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] negate(@MinLength(2) float[] v, @ExtractionParam @MinLength(2) float[] res)
	{
		return negate(v[0], v[1], res);
	}
	
	/**
	 * Negates the vector {@code (x, y)} and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Operation: {@code -(x, y)}
	 * 
	 * @param x
	 *     The value of the x component of the vector.
	 * @param y
	 *     The value of the y component of the vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] negate(float x, float y, @ExtractionParam @MinLength(2) float[] res)
	{
		res[0] = -x;
		res[1] = -y;
		
		return res;
	}
	
	/**
	 * Negates the vector {@code (v)} and saves the result in the given extraction parameter object.
	 * 
	 * <p>
	 * Operation: {@code -v}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v
	 *     The vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T negate(Tup2fR v, @ExtractionParam T res)
	{
		return negate(v.v0(), v.v1(), res);
	}
	
	/**
	 * Negates the vector {@code (v[0], v[1])} and saves the result in the given extraction
	 * parameter object.
	 * 
	 * <p>
	 * Operation: {@code -(v[0], v[1])}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v
	 *     The vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T negate(@MinLength(2) float[] v, @ExtractionParam T res)
	{
		return negate(v[0], v[1], res);
	}
	
	/**
	 * Negates the vector {@code (x, y)} and saves the result in the given extraction parameter
	 * object.
	 * 
	 * <p>
	 * Operation: {@code -(x, y)}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param x
	 *     The value of the x component of the vector.
	 * @param y
	 *     The value of the y component of the vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T negate(float x, float y, @ExtractionParam T res)
	{
		res.set(-x, -y);
		
		return res;
	}
	
	/**
	 * Negates the vector {@code (v)}, supplies the result to the given implementation of the
	 * functional interface and returns the result of that implementation.
	 * 
	 * <p>
	 * Operation: {@code -v}
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v
	 *     The vector.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T negateFunc(Tup2fR v, FloatBiFunction<T> res)
	{
		return negateFunc(v.v0(), v.v1(), res);
	}
	
	/**
	 * Negates the vector {@code (v[0], v[1])}, supplies the result to the given implementation of
	 * the functional interface and returns the result of that implementation.
	 * 
	 * <p>
	 * Operation: {@code -(v[0], v[1])}
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v
	 *     The vector as an array with at least two entries.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T negateFunc(@MinLength(2) float[] v, FloatBiFunction<T> res)
	{
		return negateFunc(v[0], v[1], res);
	}
	
	/**
	 * Negates the vector {@code (x, y)}, supplies the result to the given implementation of the
	 * functional interface and returns the result of that implementation.
	 * 
	 * <p>
	 * Operation: {@code -(x, y)}
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param x
	 *     The value of the x component of the vector.
	 * @param y
	 *     The value of the y component of the vector.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T negateFunc(float x, float y, FloatBiFunction<T> res)
	{
		return res.apply(-x, -y);
	}
	
	/**
	 * Inverses the vector {@code (v)} and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Operation: {@code 1.0 / v}
	 * 
	 * @param v
	 *     The vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] inverse(Tup2fR v, @ExtractionParam @MinLength(2) float[] res)
	{
		return inverse(v.v0(), v.v1(), res);
	}
	
	/**
	 * Inverses the vector {@code (v[0], v[1])} and saves the result in the given extraction
	 * parameter.
	 * 
	 * <p>
	 * Operation: {@code 1.0 / (v[0], v[1])}
	 * 
	 * @param v
	 *     The vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] inverse(@MinLength(2) float[] v, @ExtractionParam @MinLength(2) float[] res)
	{
		return inverse(v[0], v[1], res);
	}
	
	/**
	 * Inverses the vector {@code (x, y)} and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Operation: {@code 1.0 / (x, y)}
	 * 
	 * @param x
	 *     The value of the x component of the vector.
	 * @param y
	 *     The value of the y component of the vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] inverse(float x, float y, @ExtractionParam @MinLength(2) float[] res)
	{
		res[0] = 1.0f / x;
		res[1] = 1.0f / y;
		
		return res;
	}
	
	/**
	 * Inverses the vector {@code (v)} and saves the result in the given extraction parameter
	 * object.
	 * 
	 * <p>
	 * Operation: {@code 1.0 / v}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v
	 *     The vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T inverse(Tup2fR v, @ExtractionParam T res)
	{
		return inverse(v.v0(), v.v1(), res);
	}
	
	/**
	 * Inverses the vector {@code (v[0], v[1])} and saves the result in the given extraction
	 * parameter object.
	 * 
	 * <p>
	 * Operation: {@code 1.0 / (v[0], v[1])}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v
	 *     The vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T inverse(@MinLength(2) float[] v, @ExtractionParam T res)
	{
		return inverse(v[0], v[1], res);
	}
	
	/**
	 * Inverses the vector {@code (x, y)} and saves the result in the given extraction parameter
	 * object.
	 * 
	 * <p>
	 * Operation: {@code 1.0 / (x, y)}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param x
	 *     The value of the x component of the vector.
	 * @param y
	 *     The value of the y component of the vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T inverse(float x, float y, @ExtractionParam T res)
	{
		res.set(1.0f / x, 1.0f / y);
		
		return res;
	}
	
	/**
	 * Negates the vector {@code (x, y)}, supplies the result to the given implementation of the
	 * functional interface and returns the result of that implementation.
	 * 
	 * <p>
	 * Operation: {@code -(x, y)}
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param x
	 *     The value of the x component of the vector.
	 * @param y
	 *     The value of the y component of the vector.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	
	/**
	 * Inverses the vector {@code (v)}, supplies the result to the given implementation of the
	 * functional interface and returns the result of that implementation.
	 * 
	 * <p>
	 * Operation: {@code 1.0 / v}
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v
	 *     The vector.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T inverseFunc(Tup2fR v, FloatBiFunction<T> res)
	{
		return inverseFunc(v.v0(), v.v1(), res);
	}
	
	/**
	 * Inverses the vector {@code (v[0], v[1])}, supplies the result to the given implementation of
	 * the functional interface and returns the result of that implementation.
	 * 
	 * <p>
	 * Operation: {@code 1.0 / (v[0], v[1])}
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v
	 *     The vector as an array with at least two entries.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T inverseFunc(@MinLength(2) float[] v, FloatBiFunction<T> res)
	{
		return inverseFunc(v[0], v[1], res);
	}
	
	/**
	 * Inverses the vector {@code (x, y)}, supplies the result to the given implementation of the
	 * functional interface and returns the result of that implementation.
	 * 
	 * <p>
	 * Operation: {@code 1.0 / (x, y)}
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param x
	 *     The value of the x component of the vector.
	 * @param y
	 *     The value of the y component of the vector.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T inverseFunc(float x, float y, FloatBiFunction<T> res)
	{
		return res.apply(1.0f / x, 1.0f / y);
	}
	
	/**
	 * Rotates the vector {@code (v)} by the given angle in radians and saves the result in the
	 * given extraction parameter.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * @param v
	 *     The vector.
	 * @param angle
	 *     The angle in radians.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] rotateRad(Tup2fR v, float angle, @ExtractionParam @MinLength(2) float[] res)
	{
		return rotateRad(v.v0(), v.v1(), angle, res);
	}
	
	/**
	 * Rotates the vector {@code (v)} by the given angle in radians and saves the result in the
	 * given extraction parameter.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * @param v
	 *     The vector.
	 * @param angle
	 *     The angle in radians.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] rotateRad(Tup2fR v, float angle, MathProvider mathProvider,
			@ExtractionParam @MinLength(2) float[] res)
	{
		return rotateRad(v.v0(), v.v1(), angle, mathProvider, res);
	}
	
	/**
	 * Rotates the vector {@code (v[0], v[1])} by the given angle in radians and saves the result in
	 * the given extraction parameter.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * @param v
	 *     The vector as an array with at least two entries.
	 * @param angle
	 *     The angle in radians.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] rotateRad(@MinLength(2) float[] v, float angle, @ExtractionParam @MinLength(2) float[] res)
	{
		return rotateRad(v[0], v[1], angle, res);
	}
	
	/**
	 * Rotates the vector {@code (v[0], v[1])} by the given angle in radians and saves the result in
	 * the given extraction parameter.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * @param v
	 *     The vector as an array with at least two entries.
	 * @param angle
	 *     The angle in radians.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] rotateRad(@MinLength(2) float[] v, float angle, MathProvider mathProvider,
			@ExtractionParam @MinLength(2) float[] res)
	{
		return rotateRad(v[0], v[1], angle, mathProvider, res);
	}
	
	/**
	 * Rotates the vector {@code (x, y)} by the given angle in radians and saves the result in the
	 * given extraction parameter.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * @param x
	 *     The value of the x component of the vector.
	 * @param y
	 *     The value of the y component of the vector.
	 * @param angle
	 *     The angle in radians.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] rotateRad(float x, float y, float angle, @ExtractionParam @MinLength(2) float[] res)
	{
		return rotateRad(x, y, angle, BarghosMath.PROVIDER, res);
	}
	
	/**
	 * Rotates the vector {@code (x, y)} by the given angle in radians and saves the result in the
	 * given extraction parameter.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * @param x
	 *     The value of the x component of the vector.
	 * @param y
	 *     The value of the y component of the vector.
	 * @param angle
	 *     The angle in radians.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] rotateRad(float x, float y, float angle, MathProvider mathProvider,
			@ExtractionParam @MinLength(2) float[] res)
	{
		float cos = mathProvider.cos(angle);
		float sin = mathProvider.sin(angle);
		
		res[0] = x * cos - y * sin;
		res[1] = x * sin + y * cos;
		
		return res;
	}
	
	/**
	 * Rotates the vector {@code (v)} by the given angle in degrees and saves the result in the
	 * given extraction parameter.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * @param v
	 *     The vector.
	 * @param angle
	 *     The angle in degrees.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] rotateDeg(Tup2fR v, float angle, @ExtractionParam @MinLength(2) float[] res)
	{
		return rotateDeg(v.v0(), v.v1(), angle, res);
	}
	
	/**
	 * Rotates the vector {@code (v)} by the given angle in degrees and saves the result in the
	 * given extraction parameter.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * @param v
	 *     The vector.
	 * @param angle
	 *     The angle in degrees.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] rotateDeg(Tup2fR v, float angle, MathProvider mathProvider,
			@ExtractionParam @MinLength(2) float[] res)
	{
		return rotateDeg(v.v0(), v.v1(), angle, mathProvider, res);
	}
	
	/**
	 * Rotates the vector {@code (v[0], v[1])} by the given angle in degrees and saves the result in
	 * the given extraction parameter.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * @param v
	 *     The vector as an array with at least two entries.
	 * @param angle
	 *     The angle in degrees.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] rotateDeg(@MinLength(2) float[] v, float angle, @ExtractionParam @MinLength(2) float[] res)
	{
		return rotateDeg(v[0], v[1], angle, res);
	}
	
	/**
	 * Rotates the vector {@code (v[0], v[1])} by the given angle in degrees and saves the result in
	 * the given extraction parameter.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * @param v
	 *     The vector as an array with at least two entries.
	 * @param angle
	 *     The angle in degrees.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] rotateDeg(@MinLength(2) float[] v, float angle, MathProvider mathProvider,
			@ExtractionParam @MinLength(2) float[] res)
	{
		return rotateDeg(v[0], v[1], angle, mathProvider, res);
	}
	
	/**
	 * Rotates the vector {@code (x, y)} by the given angle in degrees and saves the result in the
	 * given extraction parameter.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * @param x
	 *     The value of the x component of the vector.
	 * @param y
	 *     The value of the y component of the vector.
	 * @param angle
	 *     The angle in degrees.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] rotateDeg(float x, float y, float angle, @ExtractionParam @MinLength(2) float[] res)
	{
		return rotateRad(x, y, angle * BarghosMath.DEG_TO_RADf, res);
	}
	
	/**
	 * Rotates the vector {@code (x, y)} by the given angle in degrees and saves the result in the
	 * given extraction parameter.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * @param x
	 *     The value of the x component of the vector.
	 * @param y
	 *     The value of the y component of the vector.
	 * @param angle
	 *     The angle in degrees.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] rotateDeg(float x, float y, float angle, MathProvider mathProvider,
			@ExtractionParam @MinLength(2) float[] res)
	{
		return rotateRad(x, y, angle * BarghosMath.DEG_TO_RADf, mathProvider, res);
	}
	
	/**
	 * Rotates the vector {@code (v)} by the given angle in radians and saves the result in the
	 * given extraction parameter object.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v
	 *     The.
	 * @param angle
	 *     The angle in radians.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T rotateRad(Tup2fR v, float angle, @ExtractionParam T res)
	{
		return rotateRad(v.v0(), v.v1(), angle, res);
	}
	
	/**
	 * Rotates the vector {@code (v)} by the given angle in radians and saves the result in the
	 * given extraction parameter object.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v
	 *     The vector.
	 * @param angle
	 *     The angle in radians.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T rotateRad(Tup2fR v, float angle, MathProvider mathProvider,
			@ExtractionParam T res)
	{
		return rotateRad(v.v0(), v.v1(), angle, mathProvider, res);
	}
	
	/**
	 * Rotates the vector {@code (v[0], v[1])} by the given angle in radians and saves the result in
	 * the given extraction parameter object.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v
	 *     The vector as an array with at least two entries.
	 * @param angle
	 *     The angle in radians.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T rotateRad(@MinLength(2) float[] v, float angle, @ExtractionParam T res)
	{
		return rotateRad(v[0], v[1], angle, res);
	}
	
	/**
	 * Rotates the vector {@code (v[0], v[1])} by the given angle in radians and saves the result in
	 * the given extraction parameter object.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v
	 *     The vector as an array with at least two entries.
	 * @param angle
	 *     The angle in radians.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T rotateRad(@MinLength(2) float[] v, float angle, MathProvider mathProvider,
			@ExtractionParam T res)
	{
		return rotateRad(v[0], v[1], angle, mathProvider, res);
	}
	
	/**
	 * Rotates the vector {@code (x, y)} by the given angle in radians and saves the result in the
	 * given extraction parameter object.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param x
	 *     The value of the x component of the vector.
	 * @param y
	 *     The value of the y component of the vector.
	 * @param angle
	 *     The angle in radians.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T rotateRad(float x, float y, float angle, @ExtractionParam T res)
	{
		return rotateRad(x, y, angle, BarghosMath.PROVIDER, res);
	}
	
	/**
	 * Rotates the vector {@code (x, y)} by the given angle in radians and saves the result in the
	 * given extraction parameter object.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param x
	 *     The value of the x component of the vector.
	 * @param y
	 *     The value of the y component of the vector.
	 * @param angle
	 *     The angle in radians.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T rotateRad(float x, float y, float angle, MathProvider mathProvider,
			@ExtractionParam T res)
	{
		float cos = mathProvider.cos(angle);
		float sin = mathProvider.sin(angle);
		
		res.set(x * cos - y * sin, x * sin + y * cos);
		
		return res;
	}
	
	/**
	 * Rotates the vector {@code (v)} by the given angle in degrees and saves the result in the
	 * given extraction parameter object.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v
	 *     The vector.
	 * @param angle
	 *     The angle in degrees.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T rotateDeg(Tup2fR v, float angle, @ExtractionParam T res)
	{
		return rotateDeg(v.v0(), v.v1(), angle, res);
	}
	
	/**
	 * Rotates the vector {@code (v)} by the given angle in degrees and saves the result in the
	 * given extraction parameter object.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v
	 *     The vector.
	 * @param angle
	 *     The angle in degrees.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T rotateDeg(Tup2fR v, float angle, MathProvider mathProvider,
			@ExtractionParam T res)
	{
		return rotateDeg(v.v0(), v.v1(), angle, mathProvider, res);
	}
	
	/**
	 * Rotates the vector {@code (v[0], v[1])} by the given angle in degrees and saves the result in
	 * the given extraction parameter object.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v
	 *     The vector as an array with at least two entries.
	 * @param angle
	 *     The angle in degrees.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T rotateDeg(@MinLength(2) float[] v, float angle, @ExtractionParam T res)
	{
		return rotateDeg(v[0], v[1], angle, res);
	}
	
	/**
	 * Rotates the vector {@code (v[0], v[1])} by the given angle in degrees and saves the result in
	 * the given extraction parameter object.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v
	 *     The vector as an array with at least two entries.
	 * @param angle
	 *     The angle in degrees.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T rotateDeg(@MinLength(2) float[] v, float angle, MathProvider mathProvider,
			@ExtractionParam T res)
	{
		return rotateDeg(v[0], v[1], angle, mathProvider, res);
	}
	
	/**
	 * Rotates the vector {@code (x, y)} by the given angle in degrees and saves the result in the
	 * given extraction parameter object.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param x
	 *     The value of the x component of the vector.
	 * @param y
	 *     The value of the y component of the vector.
	 * @param angle
	 *     The angle in degrees.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T rotateDeg(float x, float y, float angle, @ExtractionParam T res)
	{
		return rotateRad(x, y, angle * BarghosMath.DEG_TO_RADf, res);
	}
	
	/**
	 * Rotates the vector {@code (x, y)} by the given angle in degrees and saves the result in the
	 * given extraction parameter object.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param x
	 *     The value of the x component of the vector.
	 * @param y
	 *     The value of the y component of the vector.
	 * @param angle
	 *     The angle in degrees.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T rotateDeg(float x, float y, float angle, MathProvider mathProvider,
			@ExtractionParam T res)
	{
		return rotateRad(x, y, angle * BarghosMath.DEG_TO_RADf, mathProvider, res);
	}
	
	/**
	 * Rotates the vector {@code (v)} by the given angle in radians, supplies the result to the
	 * given implementation of the functional interface and returns the result of that
	 * implementation.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v
	 *     The.
	 * @param angle
	 *     The angle in radians.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T rotateRadFunc(Tup2fR v, float angle, FloatBiFunction<T> res)
	{
		return rotateRadFunc(v.v0(), v.v1(), angle, res);
	}
	
	/**
	 * Rotates the vector {@code (v)} by the given angle in radians, supplies the result to the
	 * given implementation of the functional interface and returns the result of that
	 * implementation.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v
	 *     The vector.
	 * @param angle
	 *     The angle in radians.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T rotateRadFunc(Tup2fR v, float angle, MathProvider mathProvider, FloatBiFunction<T> res)
	{
		return rotateRadFunc(v.v0(), v.v1(), angle, mathProvider, res);
	}
	
	/**
	 * Rotates the vector {@code (v[0], v[1])} by the given angle in radians, supplies the result to
	 * the given implementation of the functional interface and returns the result of that
	 * implementation.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v
	 *     The vector as an array with at least two entries.
	 * @param angle
	 *     The angle in radians.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T rotateRadFunc(@MinLength(2) float[] v, float angle, FloatBiFunction<T> res)
	{
		return rotateRadFunc(v[0], v[1], angle, res);
	}
	
	/**
	 * Rotates the vector {@code (v[0], v[1])} by the given angle in radians, supplies the result to
	 * the given implementation of the functional interface and returns the result of that
	 * implementation.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v
	 *     The vector as an array with at least two entries.
	 * @param angle
	 *     The angle in radians.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T rotateRadFunc(@MinLength(2) float[] v, float angle, MathProvider mathProvider,
			FloatBiFunction<T> res)
	{
		return rotateRadFunc(v[0], v[1], angle, mathProvider, res);
	}
	
	/**
	 * Rotates the vector {@code (x, y)} by the given angle in radians, supplies the result to the
	 * given implementation of the functional interface and returns the result of that
	 * implementation.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param x
	 *     The value of the x component of the vector.
	 * @param y
	 *     The value of the y component of the vector.
	 * @param angle
	 *     The angle in radians.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T rotateRadFunc(float x, float y, float angle, FloatBiFunction<T> res)
	{
		return rotateRadFunc(x, y, angle, BarghosMath.PROVIDER, res);
	}
	
	/**
	 * Rotates the vector {@code (x, y)} by the given angle in radians, supplies the result to the
	 * given implementation of the functional interface and returns the result of that
	 * implementation.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param x
	 *     The value of the x component of the vector.
	 * @param y
	 *     The value of the y component of the vector.
	 * @param angle
	 *     The angle in radians.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T rotateRadFunc(float x, float y, float angle, MathProvider mathProvider, FloatBiFunction<T> res)
	{
		float cos = mathProvider.cos(angle);
		float sin = mathProvider.sin(angle);
		
		return res.apply(x * cos - y * sin, x * sin + y * cos);
	}
	
	/**
	 * Rotates the vector {@code (v)} by the given angle in degrees, supplies the result to the
	 * given implementation of the functional interface and returns the result of that
	 * implementation.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v
	 *     The vector.
	 * @param angle
	 *     The angle in degrees.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T rotateDegFunc(Tup2fR v, float angle, FloatBiFunction<T> res)
	{
		return rotateDegFunc(v.v0(), v.v1(), angle, res);
	}
	
	/**
	 * Rotates the vector {@code (v)} by the given angle in degrees, supplies the result to the
	 * given implementation of the functional interface and returns the result of that
	 * implementation.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v
	 *     The vector.
	 * @param angle
	 *     The angle in degrees.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T rotateDegFunc(Tup2fR v, float angle, MathProvider mathProvider, FloatBiFunction<T> res)
	{
		return rotateDegFunc(v.v0(), v.v1(), angle, mathProvider, res);
	}
	
	/**
	 * Rotates the vector {@code (v[0], v[1])} by the given angle in degrees, supplies the result to
	 * the given implementation of the functional interface and returns the result of that
	 * implementation.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v
	 *     The vector as an array with at least two entries.
	 * @param angle
	 *     The angle in degrees.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T rotateDegFunc(@MinLength(2) float[] v, float angle, FloatBiFunction<T> res)
	{
		return rotateDegFunc(v[0], v[1], angle, res);
	}
	
	/**
	 * Rotates the vector {@code (v[0], v[1])} by the given angle in degrees, supplies the result to
	 * the given implementation of the functional interface and returns the result of that
	 * implementation.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v
	 *     The vector as an array with at least two entries.
	 * @param angle
	 *     The angle in degrees.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T rotateDegFunc(@MinLength(2) float[] v, float angle, MathProvider mathProvider,
			FloatBiFunction<T> res)
	{
		return rotateDegFunc(v[0], v[1], angle, mathProvider, res);
	}
	
	/**
	 * Rotates the vector {@code (x, y)} by the given angle in degrees, supplies the result to the
	 * given implementation of the functional interface and returns the result of that
	 * implementation.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param x
	 *     The value of the x component of the vector.
	 * @param y
	 *     The value of the y component of the vector.
	 * @param angle
	 *     The angle in degrees.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T rotateDegFunc(float x, float y, float angle, FloatBiFunction<T> res)
	{
		return rotateDegFunc(x, y, angle * BarghosMath.DEG_TO_RADf, res);
	}
	
	/**
	 * Rotates the vector {@code (x, y)} by the given angle in degrees, supplies the result to the
	 * given implementation of the functional interface and returns the result of that
	 * implementation.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param x
	 *     The value of the x component of the vector.
	 * @param y
	 *     The value of the y component of the vector.
	 * @param angle
	 *     The angle in degrees.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T rotateDegFunc(float x, float y, float angle, MathProvider mathProvider, FloatBiFunction<T> res)
	{
		return rotateRadFunc(x, y, angle * BarghosMath.DEG_TO_RADf, mathProvider, res);
	}
	
	/**
	 * Calculates the orthogonal projection of the vector {@code (v)} onto the normalized target
	 * vector {@code (t)} and saves the result in the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code t * (v . t)}
	 * 
	 * @param v
	 *     The vector.
	 * @param t
	 *     The projection target vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result
	 */
	public static float[] project(Tup2fR v, Tup2fR t, @ExtractionParam @MinLength(2) float[] res)
	{
		return project(v.v0(), v.v1(), t.v0(), t.v1(), res);
	}
	
	/**
	 * Calculates the orthogonal projection of the vector {@code (v)} onto the normalized target
	 * vector {@code (t[0], t[1])} and saves the result in the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (t[0], t[1]) * (v . (t[0], t[1]))}
	 * 
	 * @param v
	 *     The vector.
	 * @param t
	 *     The projection target vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result
	 */
	public static float[] project(Tup2fR v, @MinLength(2) float[] t, @ExtractionParam @MinLength(2) float[] res)
	{
		return project(v.v0(), v.v1(), t[0], t[1], res);
	}
	
	/**
	 * Calculates the orthogonal projection of the vector {@code (v)} onto the normalized target
	 * vector {@code (tX, tY)} and saves the result in the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (tX, tY) * (v . (tX, tY))}
	 * 
	 * @param v
	 *     The vector.
	 * @param tX
	 *     The value of the x component of the projection target vector.
	 * @param tY
	 *     The value of the y component of the projection target vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result
	 */
	public static float[] project(Tup2fR v, float tX, float tY, @ExtractionParam @MinLength(2) float[] res)
	{
		return project(v.v0(), v.v1(), tX, tY, res);
	}
	
	/**
	 * Calculates the orthogonal projection of the vector {@code (v[0], v[1])} onto the normalized
	 * target vector {@code (t)} and saves the result in the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code t * ((v[0], v[1]) . t)}
	 * 
	 * @param v
	 *     The vector as an array with at least two entries.
	 * @param t
	 *     The projection target vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result
	 */
	public static float[] project(@MinLength(2) float[] v, Tup2fR t, @ExtractionParam @MinLength(2) float[] res)
	{
		return project(v[0], v[1], t.v0(), t.v1(), res);
	}
	
	/**
	 * Calculates the orthogonal projection of the vector {@code (v[0], v[1])} onto the normalized
	 * target vector {@code (t[0], t[1])} and saves the result in the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (t[0], t[1]) * ((v[0], v[1]) . (t[0], t[1]))}
	 * 
	 * @param v
	 *     The vector as an array with at least two entries.
	 * @param t
	 *     The projection target vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result
	 */
	public static float[] project(@MinLength(2) float[] v, @MinLength(2) float[] t,
			@ExtractionParam @MinLength(2) float[] res)
	{
		return project(v[0], v[1], t[0], t[1], res);
	}
	
	/**
	 * Calculates the orthogonal projection of the vector {@code (v[0], v[1])} onto the normalized
	 * target vector {@code (tX, tY)} and saves the result in the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (tX, tY) * ((v[0], v[1]) . (tX, tY))}
	 * 
	 * @param v
	 *     The vector as an array with at least two entries.
	 * @param tX
	 *     The value of the x component of the projection target vector.
	 * @param tY
	 *     The value of the y component of the projection target vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result
	 */
	public static float[] project(@MinLength(2) float[] v, float tX, float tY,
			@ExtractionParam @MinLength(2) float[] res)
	{
		return project(v[0], v[1], tX, tY, res);
	}
	
	/**
	 * Calculates the orthogonal projection of the vector {@code (vX, vY)} onto the normalized
	 * target vector {@code (t)} and saves the result in the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code t * ((vX, vY) . t)}
	 * 
	 * @param vX
	 *     The value of the x component of the vector.
	 * @param vY
	 *     The value of the y component of the vector.
	 * @param t
	 *     The projection target vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result
	 */
	public static float[] project(float vX, float vY, Tup2fR t, @ExtractionParam @MinLength(2) float[] res)
	{
		return project(vX, vY, t.v0(), t.v1(), res);
	}
	
	/**
	 * Calculates the orthogonal projection of the vector {@code (vX, vY)} onto the normalized
	 * target vector {@code (t[0], t[1])} and saves the result in the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (t[0], t[1]) * ((vX, vY) . (t[0], t[1]))}
	 * 
	 * @param vX
	 *     The value of the x component of the vector.
	 * @param vY
	 *     The value of the y component of the vector.
	 * @param t
	 *     The projection target vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result
	 */
	public static float[] project(float vX, float vY, @MinLength(2) float[] t,
			@ExtractionParam @MinLength(2) float[] res)
	{
		return project(vX, vY, t[0], t[1], res);
	}
	
	/**
	 * Calculates the orthogonal projection of the vector {@code (vX, vY)} onto the normalized
	 * target vector {@code (tX, tY)} and saves the result in the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (tX, tY) * ((vX, vY) . (tX, tY))}
	 * 
	 * @param vX
	 *     The value of the x component of the vector.
	 * @param vY
	 *     The value of the y component of the vector.
	 * @param tX
	 *     The value of the x component of the projection target vector.
	 * @param tY
	 *     The value of the y component of the projection target vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result
	 */
	public static float[] project(float vX, float vY, float tX, float tY, @ExtractionParam @MinLength(2) float[] res)
	{
		float dot = dot(vX, vY, tX, tY);
		
		res[0] = tX * dot;
		res[1] = tY * dot;
		
		return res;
	}
	
	/**
	 * Calculates the orthogonal projection of the vector {@code (v)} onto the normalized target
	 * vector {@code (t)} and saves the result in the extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code t * (v . t)}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v
	 *     The vector.
	 * @param t
	 *     The projection target vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T project(Tup2fR v, Tup2fR t, @ExtractionParam T res)
	{
		return project(v.v0(), v.v1(), t.v0(), t.v1(), res);
	}
	
	/**
	 * Calculates the orthogonal projection of the vector {@code (v)} onto the normalized target
	 * vector {@code (t[0], t[1])} and saves the result in the extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (t[0], t[1]) * (v . (t[0], t[1]))}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v
	 *     The vector.
	 * @param t
	 *     The projection target vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T project(Tup2fR v, @MinLength(2) float[] t, @ExtractionParam T res)
	{
		return project(v.v0(), v.v1(), t[0], t[1], res);
	}
	
	/**
	 * Calculates the orthogonal projection of the vector {@code (v)} onto the normalized target
	 * vector {@code (tX, tY)} and saves the result in the extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (tX, tY) * (v . (tX, tY))}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v
	 *     The vector.
	 * @param tX
	 *     The value of the x component of the projection target vector.
	 * @param tY
	 *     The value of the y component of the projection target vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T project(Tup2fR v, float tX, float tY, @ExtractionParam T res)
	{
		return project(v.v0(), v.v1(), tX, tY, res);
	}
	
	/**
	 * Calculates the orthogonal projection of the vector {@code (v[0], v[1])} onto the normalized
	 * target vector {@code (t)} and saves the result in the extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code t * ((v[0], v[1]) . t)}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v
	 *     The vector as an array with at least two entries.
	 * @param t
	 *     The projection target vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T project(@MinLength(2) float[] v, Tup2fR t, @ExtractionParam T res)
	{
		return project(v[0], v[1], t.v0(), t.v1(), res);
	}
	
	/**
	 * Calculates the orthogonal projection of the vector {@code (v[0], v[1])} onto the normalized
	 * target vector {@code (t[0], t[1])} and saves the result in the extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (t[0], t[1]) * ((v[0], v[1]) . (t[0], t[1]))}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v
	 *     The vector as an array with at least two entries.
	 * @param t
	 *     The projection target vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T project(@MinLength(2) float[] v, @MinLength(2) float[] t, @ExtractionParam T res)
	{
		return project(v[0], v[1], t[0], t[1], res);
	}
	
	/**
	 * Calculates the orthogonal projection of the vector {@code (v[0], v[1])} onto the normalized
	 * target vector {@code (tX, tY)} and saves the result in the extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (tX, tY) * ((v[0], v[1]) . (tX, tY))}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v
	 *     The vector as an array with at least two entries.
	 * @param tX
	 *     The value of the x component of the projection target vector.
	 * @param tY
	 *     The value of the y component of the projection target vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T project(@MinLength(2) float[] v, float tX, float tY, @ExtractionParam T res)
	{
		return project(v[0], v[1], tX, tY, res);
	}
	
	/**
	 * Calculates the orthogonal projection of the vector {@code (vX, vY)} onto the normalized
	 * target vector {@code (t)} and saves the result in the extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code t * ((vX, vY) . t)}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param vX
	 *     The value of the x component of the vector.
	 * @param vY
	 *     The value of the y component of the vector.
	 * @param t
	 *     The projection target vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T project(float vX, float vY, Tup2fR t, @ExtractionParam T res)
	{
		return project(vX, vY, t.v0(), t.v1(), res);
	}
	
	/**
	 * Calculates the orthogonal projection of the vector {@code (vX, vY)} onto the normalized
	 * target vector {@code (t[0], t[1])} and saves the result in the extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (t[0], t[1]) * ((vX, vY) . (t[0], t[1]))}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param vX
	 *     The value of the x component of the vector.
	 * @param vY
	 *     The value of the y component of the vector.
	 * @param t
	 *     The projection target vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T project(float vX, float vY, @MinLength(2) float[] t, @ExtractionParam T res)
	{
		return project(vX, vY, t[0], t[1], res);
	}
	
	/**
	 * Calculates the orthogonal projection of the vector {@code (vX, vY)} onto the normalized
	 * target vector {@code (tX, tY)} and saves the result in the extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (tX, tY) * ((vX, vY) . (tX, tY))}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param vX
	 *     The value of the x component of the vector.
	 * @param vY
	 *     The value of the y component of the vector.
	 * @param tX
	 *     The value of the x component of the projection target vector.
	 * @param tY
	 *     The value of the y component of the projection target vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T project(float vX, float vY, float tX, float tY, @ExtractionParam T res)
	{
		float dot = dot(vX, vY, tX, tY);
		
		res.set(tX * dot, tY * dot);
		
		return res;
	}
	
	/**
	 * Calculates the orthogonal projection of the vector {@code (v)} onto the normalized target
	 * vector {@code (t)}, supplies the result to the given implementation of the functional
	 * interface and returns the result of that implementation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code t * (v . t)}
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v
	 *     The vector.
	 * @param t
	 *     The projection target vector as an array with at least two entries.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T projectFunc(Tup2fR v, Tup2fR t, FloatBiFunction<T> res)
	{
		return projectFunc(v.v0(), v.v1(), t.v0(), t.v1(), res);
	}
	
	/**
	 * Calculates the orthogonal projection of the vector {@code (v)} onto the normalized target
	 * vector {@code (t[0], t[1])}, supplies the result to the given implementation of the
	 * functional interface and returns the result of that implementation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (t[0], t[1]) * (v . (t[0], t[1]))}
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v
	 *     The vector.
	 * @param t
	 *     The projection target vector as an array with at least two entries.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T projectFunc(Tup2fR v, @MinLength(2) float[] t, FloatBiFunction<T> res)
	{
		return projectFunc(v.v0(), v.v1(), t[0], t[1], res);
	}
	
	/**
	 * Calculates the orthogonal projection of the vector {@code (v)} onto the normalized target
	 * vector {@code (tX, tY)}, supplies the result to the given implementation of the functional
	 * interface and returns the result of that implementation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (tX, tY) * (v . (tX, tY))}
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v
	 *     The vector.
	 * @param tX
	 *     The value of the x component of the projection target vector.
	 * @param tY
	 *     The value of the y component of the projection target vector.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T projectFunc(Tup2fR v, float tX, float tY, FloatBiFunction<T> res)
	{
		return projectFunc(v.v0(), v.v1(), tX, tY, res);
	}
	
	/**
	 * Calculates the orthogonal projection of the vector {@code (v[0], v[1])} onto the normalized
	 * target vector {@code (t)}, supplies the result to the given implementation of the functional
	 * interface and returns the result of that implementation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code t * ((v[0], v[1]) . t)}
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v
	 *     The vector as an array with at least two entries.
	 * @param t
	 *     The projection target vector.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T projectFunc(@MinLength(2) float[] v, Tup2fR t, FloatBiFunction<T> res)
	{
		return projectFunc(v[0], v[1], t.v0(), t.v1(), res);
	}
	
	/**
	 * Calculates the orthogonal projection of the vector {@code (v[0], v[1])} onto the normalized
	 * target vector {@code (t[0], t[1])}, supplies the result to the given implementation of the
	 * functional interface and returns the result of that implementation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (t[0], t[1]) * ((v[0], v[1]) . (t[0], t[1]))}
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v
	 *     The vector as an array with at least two entries.
	 * @param t
	 *     The projection target vector as an array with at least two entries.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T projectFunc(@MinLength(2) float[] v, @MinLength(2) float[] t, FloatBiFunction<T> res)
	{
		return projectFunc(v[0], v[1], t[0], t[1], res);
	}
	
	/**
	 * Calculates the orthogonal projection of the vector {@code (v[0], v[1])} onto the normalized
	 * target vector {@code (tX, tY)}, supplies the result to the given implementation of the
	 * functional interface and returns the result of that implementation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (tX, tY) * ((v[0], v[1]) . (tX, tY))}
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v
	 *     The vector as an array with at least two entries.
	 * @param tX
	 *     The value of the x component of the projection target vector.
	 * @param tY
	 *     The value of the y component of the projection target vector.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T projectFunc(@MinLength(2) float[] v, float tX, float tY, FloatBiFunction<T> res)
	{
		return projectFunc(v[0], v[1], tX, tY, res);
	}
	
	/**
	 * Calculates the orthogonal projection of the vector {@code (vX, vY)} onto the normalized
	 * target vector {@code (t)}, supplies the result to the given implementation of the functional
	 * interface and returns the result of that implementation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code t * ((vX, vY) . t)}
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param vX
	 *     The value of the x component of the vector.
	 * @param vY
	 *     The value of the y component of the vector.
	 * @param t
	 *     The projection target vector.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T projectFunc(float vX, float vY, Tup2fR t, FloatBiFunction<T> res)
	{
		return projectFunc(vX, vY, t.v0(), t.v1(), res);
	}
	
	/**
	 * Calculates the orthogonal projection of the vector {@code (vX, vY)} onto the normalized
	 * target vector {@code (t[0], t[1])}, supplies the result to the given implementation of the
	 * functional interface and returns the result of that implementation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (t[0], t[1]) * ((vX, vY) . (t[0], t[1]))}
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param vX
	 *     The value of the x component of the vector.
	 * @param vY
	 *     The value of the y component of the vector.
	 * @param t
	 *     The projection target vector as an array with at least two entries.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T projectFunc(float vX, float vY, @MinLength(2) float[] t, FloatBiFunction<T> res)
	{
		return projectFunc(vX, vY, t[0], t[1], res);
	}
	
	/**
	 * Calculates the orthogonal projection of the vector {@code (vX, vY)} onto the normalized
	 * target vector {@code (tX, tY)}, supplies the result to the given implementation of the
	 * functional interface and returns the result of that implementation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (tX, tY) * ((vX, vY) . (tX, tY))}
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param vX
	 *     The value of the x component of the vector.
	 * @param vY
	 *     The value of the y component of the vector.
	 * @param tX
	 *     The value of the x component of the projection target vector.
	 * @param tY
	 *     The value of the y component of the projection target vector.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T projectFunc(float vX, float vY, float tX, float tY, FloatBiFunction<T> res)
	{
		float dot = dot(vX, vY, tX, tY);
		
		return res.apply(tX * dot, tY * dot);
	}
	
	/**
	 * Calculates the reflection of the vector {@code (v)} based on the given normalized surface
	 * normal {@code (n)} and saves the result in the given extraction parameter.
	 * 
	 * @param v
	 *     The vector.
	 * @param n
	 *     The surface normal vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] reflect(Tup2fR v, Tup2fR n, @ExtractionParam @MinLength(2) float[] res)
	{
		return reflect(v.v0(), v.v1(), n.v0(), n.v1(), res);
	}
	
	/**
	 * Calculates the reflection of the vector {@code (v)} based on the given normalized surface
	 * normal {@code (n[0], n[1])} and saves the result in the given extraction parameter.
	 * 
	 * @param v
	 *     The vector.
	 * @param n
	 *     The surface normal vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] reflect(Tup2fR v, @MinLength(2) float[] n, @ExtractionParam @MinLength(2) float[] res)
	{
		return reflect(v.v0(), v.v1(), n[0], n[1], res);
	}
	
	/**
	 * Calculates the reflection of the vector {@code (v)} based on the given normalized surface
	 * normal {@code (nX, nY)} and saves the result in the given extraction parameter.
	 * 
	 * @param v
	 *     The vector.
	 * @param nX
	 *     The value of the x component of the surface normal vector.
	 * @param nY
	 *     The value of the y component of the surface normal vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] reflect(Tup2fR v, float nX, float nY, @ExtractionParam @MinLength(2) float[] res)
	{
		return reflect(v.v0(), v.v1(), nX, nY, res);
	}
	
	/**
	 * Calculates the reflection of the vector {@code (v[0], v[1])} based on the given normalized
	 * surface normal {@code (n)} and saves the result in the given extraction parameter.
	 * 
	 * @param v
	 *     The vector as an array with at least two entries.
	 * @param n
	 *     The surface normal vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] reflect(@MinLength(2) float[] v, Tup2fR n, @ExtractionParam @MinLength(2) float[] res)
	{
		return reflect(v[0], v[1], n.v0(), n.v1(), res);
	}
	
	/**
	 * Calculates the reflection of the vector {@code (v[0], v[1])} based on the given normalized
	 * surface normal {@code (n[0], n[1])} and saves the result in the given extraction parameter.
	 * 
	 * @param v
	 *     The vector as an array with at least two entries.
	 * @param n
	 *     The surface normal vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] reflect(@MinLength(2) float[] v, @MinLength(2) float[] n,
			@ExtractionParam @MinLength(2) float[] res)
	{
		return reflect(v[0], v[1], n[0], n[1], res);
	}
	
	/**
	 * Calculates the reflection of the vector {@code (v[0], v[1])} based on the given normalized
	 * surface normal {@code (nX, nY)} and saves the result in the given extraction parameter.
	 * 
	 * @param v
	 *     The vector as an array with at least two entries.
	 * @param nX
	 *     The value of the x component of the surface normal vector.
	 * @param nY
	 *     The value of the y component of the surface normal vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] reflect(@MinLength(2) float[] v, float nX, float nY,
			@ExtractionParam @MinLength(2) float[] res)
	{
		return reflect(v[0], v[1], nX, nY, res);
	}
	
	/**
	 * Calculates the reflection of the vector {@code (vX, vY)} based on the given normalized
	 * surface normal {@code (n)} and saves the result in the given extraction parameter.
	 * 
	 * @param vX
	 *     The value of the x component of the vector.
	 * @param vY
	 *     The value of the y component of the vector.
	 * @param n
	 *     The surface normal vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] reflect(float vX, float vY, Tup2fR n, @ExtractionParam @MinLength(2) float[] res)
	{
		return reflect(vX, vY, n.v0(), n.v1(), res);
	}
	
	/**
	 * Calculates the reflection of the vector {@code (vX, vY)} based on the given normalized
	 * surface normal {@code (n[0], n[1])} and saves the result in the given extraction parameter.
	 * 
	 * @param vX
	 *     The value of the x component of the vector.
	 * @param vY
	 *     The value of the y component of the vector.
	 * @param n
	 *     The surface normal vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] reflect(float vX, float vY, @MinLength(2) float[] n,
			@ExtractionParam @MinLength(2) float[] res)
	{
		return reflect(vX, vY, n[0], n[1], res);
	}
	
	/**
	 * Calculates the reflection of the vector {@code (vX, vY)} based on the given normalized
	 * surface normal {@code (nX, nY)} and saves the result in the given extraction parameter.
	 * 
	 * @param vX
	 *     The value of the x component of the vector.
	 * @param vY
	 *     The value of the y component of the vector.
	 * @param nX
	 *     The value of the x component of the surface normal vector.
	 * @param nY
	 *     The value of the y component of the surface normal vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] reflect(float vX, float vY, float nX, float nY, @ExtractionParam @MinLength(2) float[] res)
	{
		float dot = -2 * dot(vX, vY, nX, nY);
		
		res[0] = nX * dot + vX;
		res[1] = nY * dot + vY;
		
		return res;
	}
	
	/**
	 * Calculates the reflection of the vector {@code (v)} based on the given normalized surface
	 * normal {@code (n)} and saves the result in the given extraction parameter object.
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v
	 *     The vector.
	 * @param n
	 *     The surface normal vector.
	 * @param res
	 *     The extraction parameter object.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T reflect(Tup2fR v, Tup2fR n, @ExtractionParam T res)
	{
		return reflect(v.v0(), v.v1(), n.v0(), n.v1(), res);
	}
	
	/**
	 * Calculates the reflection of the vector {@code (v)} based on the given normalized surface
	 * normal {@code (n[0], n[1])} and saves the result in the given extraction parameter object.
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v
	 *     The vector.
	 * @param n
	 *     The surface normal vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter object.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T reflect(Tup2fR v, @MinLength(2) float[] n, @ExtractionParam T res)
	{
		return reflect(v.v0(), v.v1(), n[0], n[1], res);
	}
	
	/**
	 * Calculates the reflection of the vector {@code (v)} based on the given normalized surface
	 * normal {@code (nX, nY)} and saves the result in the given extraction parameter object.
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v
	 *     The vector.
	 * @param nX
	 *     The value of the x component of the surface normal vector.
	 * @param nY
	 *     The value of the y component of the surface normal vector.
	 * @param res
	 *     The extraction parameter object.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T reflect(Tup2fR v, float nX, float nY, @ExtractionParam T res)
	{
		return reflect(v.v0(), v.v1(), nX, nY, res);
	}
	
	/**
	 * Calculates the reflection of the vector {@code (v[0], v[1])} based on the given normalized
	 * surface normal {@code (n)} and saves the result in the given extraction parameter object.
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v
	 *     The vector as an array with at least two entries.
	 * @param n
	 *     The surface normal vector.
	 * @param res
	 *     The extraction parameter object.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T reflect(@MinLength(2) float[] v, Tup2fR n, @ExtractionParam T res)
	{
		return reflect(v[0], v[1], n.v0(), n.v1(), res);
	}
	
	/**
	 * Calculates the reflection of the vector {@code (v[0], v[1])} based on the given normalized
	 * surface normal {@code (n[0], n[1])} and saves the result in the given extraction parameter
	 * object.
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v
	 *     The vector as an array with at least two entries.
	 * @param n
	 *     The surface normal vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter object.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T reflect(@MinLength(2) float[] v, @MinLength(2) float[] n, @ExtractionParam T res)
	{
		return reflect(v[0], v[1], n[0], n[1], res);
	}
	
	/**
	 * Calculates the reflection of the vector {@code (v[0], v[1])} based on the given normalized
	 * surface normal {@code (nX, nY)} and saves the result in the given extraction parameter
	 * object.
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v
	 *     The vector as an array with at least two entries.
	 * @param nX
	 *     The value of the x component of the surface normal vector.
	 * @param nY
	 *     The value of the y component of the surface normal vector.
	 * @param res
	 *     The extraction parameter object.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T reflect(@MinLength(2) float[] v, float nX, float nY, @ExtractionParam T res)
	{
		return reflect(v[0], v[1], nX, nY, res);
	}
	
	/**
	 * Calculates the reflection of the vector {@code (vX, vY)} based on the given normalized
	 * surface normal {@code (n)} and saves the result in the given extraction parameter object.
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param vX
	 *     The value of the x component of the vector.
	 * @param vY
	 *     The value of the y component of the vector.
	 * @param n
	 *     The surface normal vector.
	 * @param res
	 *     The extraction parameter object.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T reflect(float vX, float vY, Tup2fR n, @ExtractionParam T res)
	{
		return reflect(vX, vY, n.v0(), n.v1(), res);
	}
	
	/**
	 * Calculates the reflection of the vector {@code (vX, vY)} based on the given normalized
	 * surface normal {@code (n[0], n[1])} and saves the result in the given extraction parameter
	 * object.
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param vX
	 *     The value of the x component of the vector.
	 * @param vY
	 *     The value of the y component of the vector.
	 * @param n
	 *     The surface normal vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter object.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T reflect(float vX, float vY, @MinLength(2) float[] n, @ExtractionParam T res)
	{
		return reflect(vX, vY, n[0], n[1], res);
	}
	
	/**
	 * Calculates the reflection of the vector {@code (vX, vY)} based on the given normalized
	 * surface normal {@code (nX, nY)} and saves the result in the given extraction parameter
	 * object.
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param vX
	 *     The value of the x component of the vector.
	 * @param vY
	 *     The value of the y component of the vector.
	 * @param nX
	 *     The value of the x component of the surface normal vector.
	 * @param nY
	 *     The value of the y component of the surface normal vector.
	 * @param res
	 *     The extraction parameter object.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T reflect(float vX, float vY, float nX, float nY, @ExtractionParam T res)
	{
		float dot = -2 * dot(vX, vY, nX, nY);
		
		res.set(nX * dot + vX, nY * dot + vY);
		
		return res;
	}
	
	/**
	 * Calculates the reflection of the vector {@code (v)} based on the given normalized surface
	 * normal {@code (n)}, supplies the result to the given implementation of the functional
	 * interface and returns the result of that implementation.
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v
	 *     The vector.
	 * @param n
	 *     The surface normal vector.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T reflectFunc(Tup2fR v, Tup2fR n, FloatBiFunction<T> res)
	{
		return reflectFunc(v.v0(), v.v1(), n.v0(), n.v1(), res);
	}
	
	/**
	 * Calculates the reflection of the vector {@code (v)} based on the given normalized surface
	 * normal {@code (n[0], n[1])}, supplies the result to the given implementation of the
	 * functional interface and returns the result of that implementation.
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v
	 *     The vector.
	 * @param n
	 *     The surface normal vector as an array with at least two entries.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T reflectFunc(Tup2fR v, @MinLength(2) float[] n, FloatBiFunction<T> res)
	{
		return reflectFunc(v.v0(), v.v1(), n[0], n[1], res);
	}
	
	/**
	 * Calculates the reflection of the vector {@code (v)} based on the given normalized surface
	 * normal {@code (nX, nY)}, supplies the result to the given implementation of the functional
	 * interface and returns the result of that implementation.
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v
	 *     The vector.
	 * @param nX
	 *     The value of the x component of the surface normal vector.
	 * @param nY
	 *     The value of the y component of the surface normal vector.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T reflectFunc(Tup2fR v, float nX, float nY, FloatBiFunction<T> res)
	{
		return reflectFunc(v.v0(), v.v1(), nX, nY, res);
	}
	
	/**
	 * Calculates the reflection of the vector {@code (v[0], v[1])} based on the given normalized
	 * surface normal {@code (n)}, supplies the result to the given implementation of the functional
	 * interface and returns the result of that implementation.
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v
	 *     The vector as an array with at least two entries.
	 * @param n
	 *     The surface normal vector.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T reflectFunc(@MinLength(2) float[] v, Tup2fR n, FloatBiFunction<T> res)
	{
		return reflectFunc(v[0], v[1], n.v0(), n.v1(), res);
	}
	
	/**
	 * Calculates the reflection of the vector {@code (v[0], v[1])} based on the given normalized
	 * surface normal {@code (n[0], n[1])}, supplies the result to the given implementation of the
	 * functional interface and returns the result of that implementation.
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v
	 *     The vector as an array with at least two entries.
	 * @param n
	 *     The surface normal vector as an array with at least two entries.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T reflectFunc(@MinLength(2) float[] v, @MinLength(2) float[] n, FloatBiFunction<T> res)
	{
		return reflectFunc(v[0], v[1], n[0], n[1], res);
	}
	
	/**
	 * Calculates the reflection of the vector {@code (v[0], v[1])} based on the given normalized
	 * surface normal {@code (nX, nY)}, supplies the result to the given implementation of the
	 * functional interface and returns the result of that implementation.
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v
	 *     The vector as an array with at least two entries.
	 * @param nX
	 *     The value of the x component of the surface normal vector.
	 * @param nY
	 *     The value of the y component of the surface normal vector.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T reflectFunc(@MinLength(2) float[] v, float nX, float nY, FloatBiFunction<T> res)
	{
		return reflectFunc(v[0], v[1], nX, nY, res);
	}
	
	/**
	 * Calculates the reflection of the vector {@code (vX, vY)} based on the given normalized
	 * surface normal {@code (n)}, supplies the result to the given implementation of the functional
	 * interface and returns the result of that implementation.
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param vX
	 *     The value of the x component of the vector.
	 * @param vY
	 *     The value of the y component of the vector.
	 * @param n
	 *     The surface normal vector.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T reflectFunc(float vX, float vY, Tup2fR n, FloatBiFunction<T> res)
	{
		return reflectFunc(vX, vY, n.v0(), n.v1(), res);
	}
	
	/**
	 * Calculates the reflection of the vector {@code (vX, vY)} based on the given normalized
	 * surface normal {@code (n[0], n[1])}, supplies the result to the given implementation of the
	 * functional interface and returns the result of that implementation.
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param vX
	 *     The value of the x component of the vector.
	 * @param vY
	 *     The value of the y component of the vector.
	 * @param n
	 *     The surface normal vector as an array with at least two entries.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T reflectFunc(float vX, float vY, @MinLength(2) float[] n, FloatBiFunction<T> res)
	{
		return reflectFunc(vX, vY, n[0], n[1], res);
	}
	
	/**
	 * Calculates the reflection of the vector {@code (vX, vY)} based on the given normalized
	 * surface normal {@code (nX, nY)}, supplies the result to the given implementation of the
	 * functional interface and returns the result of that implementation.
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param vX
	 *     The value of the x component of the vector.
	 * @param vY
	 *     The value of the y component of the vector.
	 * @param nX
	 *     The value of the x component of the surface normal vector.
	 * @param nY
	 *     The value of the y component of the surface normal vector.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T reflectFunc(float vX, float vY, float nX, float nY, FloatBiFunction<T> res)
	{
		float dot = -2 * dot(vX, vY, nX, nY);
		
		return res.apply(nX * dot + vX, nY * dot + vY);
	}
	
	/**
	 * Returns the dot product (scalar product) between the first vector {@code (v1)} and the second
	 * vector {@code (v2)}.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 . v2}
	 * 
	 * @param v1
	 *     The first vector.
	 * @param v2
	 *     The second vector.
	 * 
	 * @return The dot product (scalar product).
	 */
	public static float dot(Tup2fR v1, Tup2fR v2)
	{
		return dot(v1.v0(), v1.v1(), v2.v0(), v2.v1());
	}
	
	/**
	 * Returns the dot product (scalar product) between the first vector {@code (v1)} and the second
	 * vector {@code (v2[0], v2[1])}.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 . (v2[0], v2[1])}
	 * 
	 * @param v1
	 *     The first vector.
	 * @param v2
	 *     The second vector as an array with at least two entries.
	 * 
	 * @return The dot product (scalar product).
	 */
	public static float dot(Tup2fR v1, @MinLength(2) float[] v2)
	{
		return dot(v1.v0(), v1.v1(), v2[0], v2[1]);
	}
	
	/**
	 * Returns the dot product (scalar product) between the first vector {@code (v1)} and the second
	 * vector {@code (v2x, v2y)}.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 . (v2x, v2y)}
	 * 
	 * @param v1
	 *     The first vector.
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * 
	 * @return The dot product (scalar product).
	 */
	public static float dot(Tup2fR v1, float v2x, float v2y)
	{
		return dot(v1.v0(), v1.v1(), v2x, v2y);
	}
	
	/**
	 * Returns the dot product (scalar product) between the first vector {@code (v1[0], v1[1])} and
	 * the second vector {@code (v2)}.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1]) . v2}
	 * 
	 * @param v1
	 *     The first vector as an array with at least two entries.
	 * @param v2
	 *     The second vector.
	 * 
	 * @return The dot product (scalar product).
	 */
	public static float dot(@MinLength(2) float[] v1, Tup2fR v2)
	{
		return dot(v1[0], v1[1], v2.v0(), v2.v1());
	}
	
	/**
	 * Returns the dot product (scalar product) between the first vector {@code (v1[0], v1[1])} and
	 * the second vector {@code (v2[0], v2[1])}.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1]) . (v2[0], v2[1])}
	 * 
	 * @param v1
	 *     The first vector as an array with at least two entries.
	 * @param v2
	 *     The second vector as an array with at least two entries.
	 * 
	 * @return The dot product (scalar product).
	 */
	public static float dot(@MinLength(2) float[] v1, @MinLength(2) float[] v2)
	{
		return dot(v1[0], v1[1], v2[0], v2[1]);
	}
	
	/**
	 * Returns the dot product (scalar product) between the first vector {@code (v1[0], v1[1])} and
	 * the second vector {@code (v2x, v2y)}.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1]) . (v2x, v2y)}
	 * 
	 * @param v1
	 *     The first vector as an array with at least two entries.
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * 
	 * @return The dot product (scalar product).
	 */
	public static float dot(@MinLength(2) float[] v1, float v2x, float v2y)
	{
		return dot(v1[0], v1[1], v2x, v2y);
	}
	
	/**
	 * Returns the dot product (scalar product) between the first vector {@code (v1x, v1y)} and the
	 * second vector {@code (v2)}.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y) . v2}
	 * 
	 * @param v1x
	 *     The value of the x component of the first vector.
	 * @param v1y
	 *     The value of the y component of the first vector.
	 * @param v2
	 *     The second vector.
	 * 
	 * @return The dot product (scalar product).
	 */
	public static float dot(float v1x, float v1y, Tup2fR v2)
	{
		return dot(v1x, v1y, v2.v0(), v2.v1());
	}
	
	/**
	 * Returns the dot product (scalar product) between the first vector {@code (v1x, v1y)} and the
	 * second vector {@code (v2[0], v2[1])}.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y) . (v2[0], v2[1])}
	 * 
	 * @param v1x
	 *     The value of the x component of the first vector.
	 * @param v1y
	 *     The value of the y component of the first vector.
	 * @param v2
	 *     The second vector as an array with at least two entries.
	 * 
	 * @return The dot product (scalar product).
	 */
	public static float dot(float v1x, float v1y, @MinLength(2) float[] v2)
	{
		return dot(v1x, v1y, v2[0], v2[1]);
	}
	
	/**
	 * Returns the dot product (scalar product) between the first vector {@code (v1x, v1y)} and the
	 * second vector {@code (v2x, v2y)}.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y) . (v2x, v2y)}
	 * 
	 * @param v1x
	 *     The value of the x component of the first vector.
	 * @param v1y
	 *     The value of the y component of the first vector.
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * 
	 * @return The dot product (scalar product).
	 */
	public static float dot(float v1x, float v1y, float v2x, float v2y)
	{
		return v1x * v2x + v1y * v2y;
	}
	
	/**
	 * Calculates half the vector from the point given by the origin vector {@code (v1)} to the
	 * point given by the origin vector {@code (v2)} and saves the result in the extraction
	 * parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2 - v1) / 2}
	 * 
	 * @param v1
	 *     The first point.
	 * @param v2
	 *     The second point.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] halfVectorTo(Tup2fR v1, Tup2fR v2, @ExtractionParam @MinLength(2) float[] res)
	{
		return halfVectorTo(v1.v0(), v1.v1(), v2.v0(), v2.v1(), res);
	}
	
	/**
	 * Calculates half the vector from the point given by the origin vector {@code (v1)} to the
	 * point given by the origin vector {@code (v2[0], v2[1])} and saves the result in the
	 * extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ((v2[0], v2[1]) - v1) / 2}
	 * 
	 * @param v1
	 *     The first point.
	 * @param v2
	 *     The second point as an array with at least two entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] halfVectorTo(Tup2fR v1, @MinLength(2) float[] v2, @ExtractionParam @MinLength(2) float[] res)
	{
		return halfVectorTo(v1.v0(), v1.v1(), v2[0], v2[1], res);
	}
	
	/**
	 * Calculates half the vector from the point given by the origin vector {@code (v1)} to the
	 * point given by the origin vector {@code (v2x, v2y)} and saves the result in the extraction
	 * parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ((v2x, v2y) - v1) / 2}
	 * 
	 * @param v1
	 *     The first point.
	 * @param v2x
	 *     The value of the x component of the second point.
	 * @param v2y
	 *     The value of the y component of the second point.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] halfVectorTo(Tup2fR v1, float v2x, float v2y, @ExtractionParam @MinLength(2) float[] res)
	{
		return halfVectorTo(v1.v0(), v1.v1(), v2x, v2y, res);
	}
	
	/**
	 * Calculates half the vector from the point given by the origin vector {@code (v1[0], v1[1])}
	 * to the point given by the origin vector {@code (v2)} and saves the result in the extraction
	 * parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2 - (v1[0], v1[1])) / 2}
	 * 
	 * @param v1
	 *     The first point as an array with at least two entries.
	 * @param v2
	 *     The second point.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] halfVectorTo(@MinLength(2) float[] v1, Tup2fR v2, @ExtractionParam @MinLength(2) float[] res)
	{
		return halfVectorTo(v1[0], v1[1], v2.v0(), v2.v1(), res);
	}
	
	/**
	 * Calculates half the vector from the point given by the origin vector {@code (v1[0], v1[1])}
	 * to the point given by the origin vector {@code (v2[0], v2[1])} and saves the result in the
	 * extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ((v2[0], v2[1]) - (v1[0], v1[1])) / 2}
	 * 
	 * @param v1
	 *     The first point as an array with at least two entries.
	 * @param v2
	 *     The second point as an array with at least two entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] halfVectorTo(@MinLength(2) float[] v1, @MinLength(2) float[] v2,
			@ExtractionParam @MinLength(2) float[] res)
	{
		return halfVectorTo(v1[0], v1[1], v2[0], v2[1], res);
	}
	
	/**
	 * Calculates half the vector from the point given by the origin vector {@code (v1[0], v1[1])}
	 * to the point given by the origin vector {@code (v2x, v2y)} and saves the result in the
	 * extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ((v2x, v2y) - (v1[0], v1[1])) / 2}
	 * 
	 * @param v1
	 *     The first point as an array with at least two entries.
	 * @param v2x
	 *     The value of the x component of the second point.
	 * @param v2y
	 *     The value of the y component of the second point.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] halfVectorTo(@MinLength(2) float[] v1, float v2x, float v2y,
			@ExtractionParam @MinLength(2) float[] res)
	{
		return halfVectorTo(v1[0], v1[1], v2x, v2y, res);
	}
	
	/**
	 * Calculates half the vector from the point given by the origin vector {@code (v1x, v1y)} to
	 * the point given by the origin vector {@code (v2)} and saves the result in the extraction
	 * parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2 - (v1x, v1y)) / 2}
	 * 
	 * @param v1x
	 *     The value of the x component of the first point.
	 * @param v1y
	 *     The value of the y component of the first point.
	 * @param v2
	 *     The second point.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] halfVectorTo(float v1x, float v1y, Tup2fR v2, @ExtractionParam @MinLength(2) float[] res)
	{
		return halfVectorTo(v1x, v1y, v2.v0(), v2.v1(), res);
	}
	
	/**
	 * Calculates half the vector from the point given by the origin vector {@code (v1x, v1y)} to
	 * the point given by the origin vector {@code (v2[0], v2[1])} and saves the result in the
	 * extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ((v2[0], v2[1]) - (v1x, v1y)) / 2}
	 * 
	 * @param v1x
	 *     The value of the x component of the first point.
	 * @param v1y
	 *     The value of the y component of the first point.
	 * @param v2
	 *     The second point as an array with at least two entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] halfVectorTo(float v1x, float v1y, @MinLength(2) float[] v2,
			@ExtractionParam @MinLength(2) float[] res)
	{
		return halfVectorTo(v1x, v1y, v2[0], v2[1], res);
	}
	
	/**
	 * Calculates half the vector from the point given by the origin vector {@code (v1x, v1y)} to
	 * the point given by the origin vector {@code (v2x, v2y)} and saves the result in the
	 * extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ((v2x, v2y) - (v1x, v1y)) / 2}
	 * 
	 * @param v1x
	 *     The value of the x component of the first point.
	 * @param v1y
	 *     The value of the y component of the first point.
	 * @param v2x
	 *     The value of the x component of the second point.
	 * @param v2y
	 *     The value of the y component of the second point.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] halfVectorTo(float v1x, float v1y, float v2x, float v2y,
			@ExtractionParam @MinLength(2) float[] res)
	{
		res[0] = (v2x - v1x) * 0.5f;
		res[1] = (v2y - v1y) * 0.5f;
		
		return res;
	}
	
	/**
	 * Calculates half the vector from the point given by the origin vector {@code (v1)} to the
	 * point given by the origin vector {@code (v2)} and saves the result in the extraction
	 * parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2 - v1) / 2}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1
	 *     The first point.
	 * @param v2
	 *     The second point.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T halfVectorTo(Tup2fR v1, Tup2fR v2, @ExtractionParam T res)
	{
		return halfVectorTo(v1.v0(), v1.v1(), v2.v0(), v2.v1(), res);
	}
	
	/**
	 * Calculates half the vector from the point given by the origin vector {@code (v1)} to the
	 * point given by the origin vector {@code (v2[0], v2[1])} and saves the result in the
	 * extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ((v2[0], v2[1]) - v1) / 2}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1
	 *     The first point.
	 * @param v2
	 *     The second point as an array with at least two entries.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T halfVectorTo(Tup2fR v1, @MinLength(2) float[] v2, @ExtractionParam T res)
	{
		return halfVectorTo(v1.v0(), v1.v1(), v2[0], v2[1], res);
	}
	
	/**
	 * Calculates half the vector from the point given by the origin vector {@code (v1)} to the
	 * point given by the origin vector {@code (v2x, v2y)} and saves the result in the extraction
	 * parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ((v2x, v2y) - v1) / 2}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1
	 *     The first point.
	 * @param v2x
	 *     The value of the x component of the second point.
	 * @param v2y
	 *     The value of the y component of the second point.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T halfVectorTo(Tup2fR v1, float v2x, float v2y, @ExtractionParam T res)
	{
		return halfVectorTo(v1.v0(), v1.v1(), v2x, v2y, res);
	}
	
	/**
	 * Calculates half the vector from the point given by the origin vector {@code (v1[0], v1[1])}
	 * to the point given by the origin vector {@code (v2)} and saves the result in the extraction
	 * parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2 - (v1[0], v1[1])) / 2}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1
	 *     The first point as an array with at least two entries.
	 * @param v2
	 *     The second point.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T halfVectorTo(@MinLength(2) float[] v1, Tup2fR v2, @ExtractionParam T res)
	{
		return halfVectorTo(v1[0], v1[1], v2.v0(), v2.v1(), res);
	}
	
	/**
	 * Calculates half the vector from the point given by the origin vector {@code (v1[0], v1[1])}
	 * to the point given by the origin vector {@code (v2[0], v2[1])} and saves the result in the
	 * extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ((v2[0], v2[1]) - (v1[0], v1[1])) / 2}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1
	 *     The first point as an array with at least two entries.
	 * @param v2
	 *     The second point as an array with at least two entries.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T halfVectorTo(@MinLength(2) float[] v1, @MinLength(2) float[] v2,
			@ExtractionParam T res)
	{
		return halfVectorTo(v1[0], v1[1], v2[0], v2[1], res);
	}
	
	/**
	 * Calculates half the vector from the point given by the origin vector {@code (v1[0], v1[1])}
	 * to the point given by the origin vector {@code (v2x, v2y)} and saves the result in the
	 * extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ((v2x, v2y) - (v1[0], v1[1])) / 2}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1
	 *     The first point as an array with at least two entries.
	 * @param v2x
	 *     The value of the x component of the second point.
	 * @param v2y
	 *     The value of the y component of the second point.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T halfVectorTo(@MinLength(2) float[] v1, float v2x, float v2y,
			@ExtractionParam T res)
	{
		return halfVectorTo(v1[0], v1[1], v2x, v2y, res);
	}
	
	/**
	 * Calculates half the vector from the point given by the origin vector {@code (v1x, v1y)} to
	 * the point given by the origin vector {@code (v2)} and saves the result in the extraction
	 * parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2 - (v1x, v1y)) / 2}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1x
	 *     The value of the x component of the first point.
	 * @param v1y
	 *     The value of the y component of the first point.
	 * @param v2
	 *     The second point.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T halfVectorTo(float v1x, float v1y, Tup2fR v2, @ExtractionParam T res)
	{
		return halfVectorTo(v1x, v1y, v2.v0(), v2.v1(), res);
	}
	
	/**
	 * Calculates half the vector from the point given by the origin vector {@code (v1x, v1y)} to
	 * the point given by the origin vector {@code (v2[0], v2[1])} and saves the result in the
	 * extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ((v2[0], v2[1]) - (v1x, v1y)) / 2}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1x
	 *     The value of the x component of the first point.
	 * @param v1y
	 *     The value of the y component of the first point.
	 * @param v2
	 *     The second point as an array with at least two entries.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T halfVectorTo(float v1x, float v1y, @MinLength(2) float[] v2,
			@ExtractionParam T res)
	{
		return halfVectorTo(v1x, v1y, v2[0], v2[1], res);
	}
	
	/**
	 * Calculates half the vector from the point given by the origin vector {@code (v1x, v1y)} to
	 * the point given by the origin vector {@code (v2x, v2y)} and saves the result in the
	 * extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ((v2x, v2y) - (v1x, v1y)) / 2}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1x
	 *     The value of the x component of the first point.
	 * @param v1y
	 *     The value of the y component of the first point.
	 * @param v2x
	 *     The value of the x component of the second point.
	 * @param v2y
	 *     The value of the y component of the second point.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T halfVectorTo(float v1x, float v1y, float v2x, float v2y, @ExtractionParam T res)
	{
		res.set((v2x - v1x) * 0.5f, (v2y - v1y) * 0.5f);
		
		return res;
	}
	
	/**
	 * Calculates half the vector from the point given by the origin vector {@code (v1)} to the
	 * point given by the origin vector {@code (v2)}, supplies the result to the given
	 * implementation of the functional interface and returns the result of that implementation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2 - v1) / 2}
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v1
	 *     The first point.
	 * @param v2
	 *     The second point.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T halfVectorToFunc(Tup2fR v1, Tup2fR v2, FloatBiFunction<T> res)
	{
		return halfVectorToFunc(v1.v0(), v1.v1(), v2.v0(), v2.v1(), res);
	}
	
	/**
	 * Calculates half the vector from the point given by the origin vector {@code (v1)} to the
	 * point given by the origin vector {@code (v2[0], v2[1])}, supplies the result to the given
	 * implementation of the functional interface and returns the result of that implementation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ((v2[0], v2[1]) - v1) / 2}
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v1
	 *     The first point.
	 * @param v2
	 *     The second point as an array with at least two entries.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T halfVectorToFunc(Tup2fR v1, @MinLength(2) float[] v2, FloatBiFunction<T> res)
	{
		return halfVectorToFunc(v1.v0(), v1.v1(), v2[0], v2[1], res);
	}
	
	/**
	 * Calculates half the vector from the point given by the origin vector {@code (v1)} to the
	 * point given by the origin vector {@code (v2x, v2y)}, supplies the result to the given
	 * implementation of the functional interface and returns the result of that implementation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ((v2x, v2y) - v1) / 2}
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v1
	 *     The first point.
	 * @param v2x
	 *     The value of the x component of the second point.
	 * @param v2y
	 *     The value of the y component of the second point.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T halfVectorToFunc(Tup2fR v1, float v2x, float v2y, FloatBiFunction<T> res)
	{
		return halfVectorToFunc(v1.v0(), v1.v1(), v2x, v2y, res);
	}
	
	/**
	 * Calculates half the vector from the point given by the origin vector {@code (v1[0], v1[1])}
	 * to the point given by the origin vector {@code (v2)}, supplies the result to the given
	 * implementation of the functional interface and returns the result of that implementation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2 - (v1[0], v1[1])) / 2}
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v1
	 *     The first point as an array with at least two entries.
	 * @param v2
	 *     The second point.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T halfVectorToFunc(@MinLength(2) float[] v1, Tup2fR v2, FloatBiFunction<T> res)
	{
		return halfVectorToFunc(v1[0], v1[1], v2.v0(), v2.v1(), res);
	}
	
	/**
	 * Calculates half the vector from the point given by the origin vector {@code (v1[0], v1[1])}
	 * to the point given by the origin vector {@code (v2[0], v2[1])}, supplies the result to the
	 * given implementation of the functional interface and returns the result of that
	 * implementation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ((v2[0], v2[1]) - (v1[0], v1[1])) / 2}
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v1
	 *     The first point as an array with at least two entries.
	 * @param v2
	 *     The second point as an array with at least two entries.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T halfVectorToFunc(@MinLength(2) float[] v1, @MinLength(2) float[] v2, FloatBiFunction<T> res)
	{
		return halfVectorToFunc(v1[0], v1[1], v2[0], v2[1], res);
	}
	
	/**
	 * Calculates half the vector from the point given by the origin vector {@code (v1[0], v1[1])}
	 * to the point given by the origin vector {@code (v2x, v2y)}, supplies the result to the given
	 * implementation of the functional interface and returns the result of that implementation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ((v2x, v2y) - (v1[0], v1[1])) / 2}
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v1
	 *     The first point as an array with at least two entries.
	 * @param v2x
	 *     The value of the x component of the second point.
	 * @param v2y
	 *     The value of the y component of the second point.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T halfVectorToFunc(@MinLength(2) float[] v1, float v2x, float v2y, FloatBiFunction<T> res)
	{
		return halfVectorToFunc(v1[0], v1[1], v2x, v2y, res);
	}
	
	/**
	 * Calculates half the vector from the point given by the origin vector {@code (v1x, v1y)} to
	 * the point given by the origin vector {@code (v2)}, supplies the result to the given
	 * implementation of the functional interface and returns the result of that implementation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2 - (v1x, v1y)) / 2}
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v1x
	 *     The value of the x component of the first point.
	 * @param v1y
	 *     The value of the y component of the first point.
	 * @param v2
	 *     The second point.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T halfVectorToFunc(float v1x, float v1y, Tup2fR v2, FloatBiFunction<T> res)
	{
		return halfVectorToFunc(v1x, v1y, v2.v0(), v2.v1(), res);
	}
	
	/**
	 * Calculates half the vector from the point given by the origin vector {@code (v1x, v1y)} to
	 * the point given by the origin vector {@code (v2[0], v2[1])}, supplies the result to the given
	 * implementation of the functional interface and returns the result of that implementation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ((v2[0], v2[1]) - (v1x, v1y)) / 2}
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v1x
	 *     The value of the x component of the first point.
	 * @param v1y
	 *     The value of the y component of the first point.
	 * @param v2
	 *     The second point as an array with at least two entries.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T halfVectorToFunc(float v1x, float v1y, @MinLength(2) float[] v2, FloatBiFunction<T> res)
	{
		return halfVectorToFunc(v1x, v1y, v2[0], v2[1], res);
	}
	
	/**
	 * Calculates half the vector from the point given by the origin vector {@code (v1x, v1y)} to
	 * the point given by the origin vector {@code (v2x, v2y)}, supplies the result to the given
	 * implementation of the functional interface and returns the result of that implementation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ((v2x, v2y) - (v1x, v1y)) / 2}
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v1x
	 *     The value of the x component of the first point.
	 * @param v1y
	 *     The value of the y component of the first point.
	 * @param v2x
	 *     The value of the x component of the second point.
	 * @param v2y
	 *     The value of the y component of the second point.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T halfVectorToFunc(float v1x, float v1y, float v2x, float v2y, FloatBiFunction<T> res)
	{
		return res.apply((v2x - v1x) * 0.5f, (v2y - v1y) * 0.5f);
	}
	
	/**
	 * Calculates the point that lies half way between the point given by the origin vector
	 * {@code (v1)} and the point given by the origin vector {@code (v2)} and saves the result in
	 * the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2 + v1) / 2}
	 * 
	 * @param v1
	 *     The first point.
	 * @param v2
	 *     The second point.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] halfPointBetween(Tup2fR v1, Tup2fR v2, @ExtractionParam @MinLength(2) float[] res)
	{
		return halfPointBetween(v1.v0(), v1.v1(), v2.v0(), v2.v1(), res);
	}
	
	/**
	 * Calculates the point that lies half way between the point given by the origin vector
	 * {@code (v1)} and the point given by the origin vector {@code (v2[0], v2[1])} and saves the
	 * result in the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ((v2[0], v2[1]) + v1) / 2}
	 * 
	 * @param v1
	 *     The first point.
	 * @param v2
	 *     The second point as an array with at least two entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] halfPointBetween(Tup2fR v1, @MinLength(2) float[] v2,
			@ExtractionParam @MinLength(2) float[] res)
	{
		return halfPointBetween(v1.v0(), v1.v1(), v2[0], v2[1], res);
	}
	
	/**
	 * Calculates the point that lies half way between the point given by the origin vector
	 * {@code (v1)} and the point given by the origin vector {@code (v2x, v2y)} and saves the result
	 * in the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ((v2x, v2y) + v1) / 2}
	 * 
	 * @param v1
	 *     The first point.
	 * @param v2x
	 *     The value of the x component of the second point.
	 * @param v2y
	 *     The value of the y component of the second point.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] halfPointBetween(Tup2fR v1, float v2x, float v2y, @ExtractionParam @MinLength(2) float[] res)
	{
		return halfPointBetween(v1.v0(), v1.v1(), v2x, v2y, res);
	}
	
	/**
	 * Calculates the point that lies half way between the point given by the origin vector
	 * {@code (v1[0], v1[1])} and the point given by the origin vector {@code (v2)} and saves the
	 * result in the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2 + (v1[0], v1[1])) / 2}
	 * 
	 * @param v1
	 *     The first point as an array with at least two entries.
	 * @param v2
	 *     The second point.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] halfPointBetween(@MinLength(2) float[] v1, Tup2fR v2,
			@ExtractionParam @MinLength(2) float[] res)
	{
		return halfPointBetween(v1[0], v1[1], v2.v0(), v2.v1(), res);
	}
	
	/**
	 * Calculates the point that lies half way between the point given by the origin vector
	 * {@code (v1[0], v1[1])} and the point given by the origin vector {@code (v2[0], v2[1])} and
	 * saves the result in the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ((v2[0], v2[1]) + (v1[0], v1[1])) / 2}
	 * 
	 * @param v1
	 *     The first point as an array with at least two entries.
	 * @param v2
	 *     The second point as an array with at least two entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] halfPointBetween(@MinLength(2) float[] v1, @MinLength(2) float[] v2,
			@ExtractionParam @MinLength(2) float[] res)
	{
		return halfPointBetween(v1[0], v1[1], v2[0], v2[1], res);
	}
	
	/**
	 * Calculates the point that lies half way between the point given by the origin vector
	 * {@code (v1[0], v1[1])} and the point given by the origin vector {@code (v2x, v2y)} and saves
	 * the result in the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ((v2x, v2y) + (v1[0], v1[1])) / 2}
	 * 
	 * @param v1
	 *     The first point as an array with at least two entries.
	 * @param v2x
	 *     The value of the x component of the second point.
	 * @param v2y
	 *     The value of the y component of the second point.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] halfPointBetween(@MinLength(2) float[] v1, float v2x, float v2y,
			@ExtractionParam @MinLength(2) float[] res)
	{
		return halfPointBetween(v1[0], v1[1], v2x, v2y, res);
	}
	
	/**
	 * Calculates the point that lies half way between the point given by the origin vector
	 * {@code (v1x, v1y)} and the point given by the origin vector {@code (v2)} and saves the result
	 * in the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2 + (v1x, v1y)) / 2}
	 * 
	 * @param v1x
	 *     The value of the x component of the first point.
	 * @param v1y
	 *     The value of the y component of the first point.
	 * @param v2
	 *     The second point.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] halfPointBetween(float v1x, float v1y, Tup2fR v2, @ExtractionParam @MinLength(2) float[] res)
	{
		return halfPointBetween(v1x, v1y, v2.v0(), v2.v1(), res);
	}
	
	/**
	 * Calculates the point that lies half way between the point given by the origin vector
	 * {@code (v1x, v1y)} and the point given by the origin vector {@code (v2[0], v2[1])} and saves
	 * the result in the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ((v2[0], v2[1]) + (v1x, v1y)) / 2}
	 * 
	 * @param v1x
	 *     The value of the x component of the first point.
	 * @param v1y
	 *     The value of the y component of the first point.
	 * @param v2
	 *     The second point as an array with at least two entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] halfPointBetween(float v1x, float v1y, @MinLength(2) float[] v2,
			@ExtractionParam @MinLength(2) float[] res)
	{
		return halfPointBetween(v1x, v1y, v2[0], v2[1], res);
	}
	
	/**
	 * Calculates the point that lies half way between the point given by the origin vector
	 * {@code (v1x, v1y)} and the point given by the origin vector {@code (v2x, v2y)} and saves the
	 * result in the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ((v2x, v2y) + (v1x, v1y)) / 2}
	 * 
	 * @param v1x
	 *     The value of the x component of the first point.
	 * @param v1y
	 *     The value of the y component of the first point.
	 * @param v2x
	 *     The value of the x component of the second point.
	 * @param v2y
	 *     The value of the y component of the second point.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] halfPointBetween(float v1x, float v1y, float v2x, float v2y,
			@ExtractionParam @MinLength(2) float[] res)
	{
		res[0] = (v2x - v1x) * 0.5f;
		res[1] = (v2y - v1y) * 0.5f;
		
		return res;
	}
	
	/**
	 * Calculates the point that lies half way between the point given by the origin vector
	 * {@code (v1)} and the point given by the origin vector {@code (v2)} and saves the result in
	 * the extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2 + v1) / 2}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1
	 *     The first point.
	 * @param v2
	 *     The second point.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T halfPointBetween(Tup2fR v1, Tup2fR v2, @ExtractionParam T res)
	{
		return halfPointBetween(v1.v0(), v1.v1(), v2.v0(), v2.v1(), res);
	}
	
	/**
	 * Calculates the point that lies half way between the point given by the origin vector
	 * {@code (v1)} and the point given by the origin vector {@code (v2[0], v2[1])} and saves the
	 * result in the extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ((v2[0], v2[1]) + v1) / 2}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1
	 *     The first point.
	 * @param v2
	 *     The second point as an array with at least two entries.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T halfPointBetween(Tup2fR v1, @MinLength(2) float[] v2, @ExtractionParam T res)
	{
		return halfPointBetween(v1.v0(), v1.v1(), v2[0], v2[1], res);
	}
	
	/**
	 * Calculates the point that lies half way between the point given by the origin vector
	 * {@code (v1)} and the point given by the origin vector {@code (v2x, v2y)} and saves the result
	 * in the extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ((v2x, v2y) + v1) / 2}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1
	 *     The first point.
	 * @param v2x
	 *     The value of the x component of the second point.
	 * @param v2y
	 *     The value of the y component of the second point.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T halfPointBetween(Tup2fR v1, float v2x, float v2y, @ExtractionParam T res)
	{
		return halfPointBetween(v1.v0(), v1.v1(), v2x, v2y, res);
	}
	
	/**
	 * Calculates the point that lies half way between the point given by the origin vector
	 * {@code (v1[0], v1[1])} and the point given by the origin vector {@code (v2)} and saves the
	 * result in the extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2 + (v1[0], v1[1])) / 2}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1
	 *     The first point as an array with at least two entries.
	 * @param v2
	 *     The second point
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T halfPointBetween(@MinLength(2) float[] v1, Tup2fR v2, @ExtractionParam T res)
	{
		return halfPointBetween(v1[0], v1[1], v2.v0(), v2.v1(), res);
	}
	
	/**
	 * Calculates the point that lies half way between the point given by the origin vector
	 * {@code (v1[0], v1[1])} and the point given by the origin vector {@code (v2[0], v2[1])} and
	 * saves the result in the extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ((v2[0], v2[1]) + (v1[0], v1[1])) / 2}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1
	 *     The first point as an array with at least two entries.
	 * @param v2
	 *     The second point as an array with at least two entries.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T halfPointBetween(@MinLength(2) float[] v1, @MinLength(2) float[] v2,
			@ExtractionParam T res)
	{
		return halfPointBetween(v1[0], v1[1], v2[0], v2[1], res);
	}
	
	/**
	 * Calculates the point that lies half way between the point given by the origin vector
	 * {@code (v1[0], v1[1])} and the point given by the origin vector {@code (v2x, v2y)} and saves
	 * the result in the extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ((v2x, v2y) + (v1[0], v1[1])) / 2}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1
	 *     The first point as an array with at least two entries.
	 * @param v2x
	 *     The value of the x component of the second point.
	 * @param v2y
	 *     The value of the y component of the second point.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T halfPointBetween(@MinLength(2) float[] v1, float v2x, float v2y,
			@ExtractionParam T res)
	{
		return halfPointBetween(v1[0], v1[1], v2x, v2y, res);
	}
	
	/**
	 * Calculates the point that lies half way between the point given by the origin vector
	 * {@code (v1x, v1y)} and the point given by the origin vector {@code (v2)} and saves the result
	 * in the extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2 + (v1x, v1y)) / 2}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1x
	 *     The value of the x component of the first point.
	 * @param v1y
	 *     The value of the y component of the first point.
	 * @param v2
	 *     The second point.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T halfPointBetween(float v1x, float v1y, Tup2fR v2, @ExtractionParam T res)
	{
		return halfPointBetween(v1x, v1y, v2.v0(), v2.v1(), res);
	}
	
	/**
	 * Calculates the point that lies half way between the point given by the origin vector
	 * {@code (v1x, v1y)} and the point given by the origin vector {@code (v2[0], v2[1])} and saves
	 * the result in the extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ((v2[0], v2[1]) + (v1x, v1y)) / 2}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1x
	 *     The value of the x component of the first point.
	 * @param v1y
	 *     The value of the y component of the first point.
	 * @param v2
	 *     The second point as an array with at least two entries.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T halfPointBetween(float v1x, float v1y, @MinLength(2) float[] v2,
			@ExtractionParam T res)
	{
		return halfPointBetween(v1x, v1y, v2[0], v2[1], res);
	}
	
	/**
	 * Calculates the point that lies half way between the point given by the origin vector
	 * {@code (v1x, v1y)} and the point given by the origin vector {@code (v2x, v2y)} and saves the
	 * result in the extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ((v2x, v2y) + (v1x, v1y)) / 2}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1x
	 *     The value of the x component of the first point.
	 * @param v1y
	 *     The value of the y component of the first point.
	 * @param v2x
	 *     The value of the x component of the second point.
	 * @param v2y
	 *     The value of the y component of the second point.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T halfPointBetween(float v1x, float v1y, float v2x, float v2y,
			@ExtractionParam T res)
	{
		res.set((v2x - v1x) * 0.5f, (v2y - v1y) * 0.5f);
		
		return res;
	}
	
	/**
	 * Calculates the point that lies half way between the point given by the origin vector
	 * {@code (v1)} and the point given by the origin vector {@code (v2)}, supplies the result to
	 * the given implementation of the functional interface and returns the result of that
	 * implementation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2 + v1) / 2}
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v1
	 *     The first point.
	 * @param v2
	 *     The second point.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T halfPointBetweenFunc(Tup2fR v1, Tup2fR v2, FloatBiFunction<T> res)
	{
		return halfPointBetweenFunc(v1.v0(), v1.v1(), v2.v0(), v2.v1(), res);
	}
	
	/**
	 * Calculates the point that lies half way between the point given by the origin vector
	 * {@code (v1)} and the point given by the origin vector {@code (v2[0], v2[1])}, supplies the
	 * result to the given implementation of the functional interface and returns the result of that
	 * implementation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ((v2[0], v2[1]) + v1) / 2}
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v1
	 *     The first point.
	 * @param v2
	 *     The second point as an array wit at least two entries.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T halfPointBetweenFunc(Tup2fR v1, @MinLength(2) float[] v2, FloatBiFunction<T> res)
	{
		return halfPointBetweenFunc(v1.v0(), v1.v1(), v2[0], v2[1], res);
	}
	
	/**
	 * Calculates the point that lies half way between the point given by the origin vector
	 * {@code (v1)} and the point given by the origin vector {@code (v2x, v2y)}, supplies the result
	 * to the given implementation of the functional interface and returns the result of that
	 * implementation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ((v2x, v2y) + v1) / 2}
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v1
	 *     The first point.
	 * @param v2x
	 *     The value of the x component of the second point.
	 * @param v2y
	 *     The value of the y component of the second point.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T halfPointBetweenFunc(Tup2fR v1, float v2x, float v2y, FloatBiFunction<T> res)
	{
		return halfPointBetweenFunc(v1.v0(), v1.v1(), v2x, v2y, res);
	}
	
	/**
	 * Calculates the point that lies half way between the point given by the origin vector
	 * {@code (v1[0], v1[1])} and the point given by the origin vector {@code (v2)}, supplies the
	 * result to the given implementation of the functional interface and returns the result of that
	 * implementation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2 + (v1[0], v1[1])) / 2}
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v1
	 *     The first point as an array with at least two entries.
	 * @param v2
	 *     The second point.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T halfPointBetweenFunc(@MinLength(2) float[] v1, Tup2fR v2, FloatBiFunction<T> res)
	{
		return halfPointBetweenFunc(v1[0], v1[1], v2.v0(), v2.v1(), res);
	}
	
	/**
	 * Calculates the point that lies half way between the point given by the origin vector
	 * {@code (v1[0], v1[1])} and the point given by the origin vector {@code (v2[0], v2[1])},
	 * supplies the result to the given implementation of the functional interface and returns the
	 * result of that implementation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ((v2[0], v2[1]) + (v1[0], v1[1])) / 2}
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v1
	 *     The first point as an array with at least two entries.
	 * @param v2
	 *     The second point as an array with at least two entries.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T halfPointBetweenFunc(@MinLength(2) float[] v1, @MinLength(2) float[] v2, FloatBiFunction<T> res)
	{
		return halfPointBetweenFunc(v1[0], v1[1], v2[0], v2[1], res);
	}
	
	/**
	 * Calculates the point that lies half way between the point given by the origin vector
	 * {@code (v1[0], v1[1])} and the point given by the origin vector {@code (v2x, v2y)}, supplies
	 * the result to the given implementation of the functional interface and returns the result of
	 * that implementation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ((v2x, v2y) + (v1[0], v1[1])) / 2}
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v1
	 *     The first point as an array with at least two entries.
	 * @param v2x
	 *     The value of the x component of the second point.
	 * @param v2y
	 *     The value of the y component of the second point.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T halfPointBetweenFunc(@MinLength(2) float[] v1, float v2x, float v2y, FloatBiFunction<T> res)
	{
		return halfPointBetweenFunc(v1[0], v1[1], v2x, v2y, res);
	}
	
	/**
	 * Calculates the point that lies half way between the point given by the origin vector
	 * {@code (v1x, v1y)} and the point given by the origin vector {@code (v2)}, supplies the result
	 * to the given implementation of the functional interface and returns the result of that
	 * implementation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2 + (v1x, v1y)) / 2}
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v1x
	 *     The value of the x component of the first point.
	 * @param v1y
	 *     The value of the y component of the first point.
	 * @param v2
	 *     The second point.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T halfPointBetweenFunc(float v1x, float v1y, Tup2fR v2, FloatBiFunction<T> res)
	{
		return halfPointBetweenFunc(v1x, v1y, v2.v0(), v2.v1(), res);
	}
	
	/**
	 * Calculates the point that lies half way between the point given by the origin vector
	 * {@code (v1x, v1y)} and the point given by the origin vector {@code (v2[0], v2[1])}, supplies
	 * the result to the given implementation of the functional interface and returns the result of
	 * that implementation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ((v2[0], v2[1]) + (v1x, v1y)) / 2}
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v1x
	 *     The value of the x component of the first point.
	 * @param v1y
	 *     The value of the y component of the first point.
	 * @param v2
	 *     The second point as an array with at least two entries.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T halfPointBetweenFunc(float v1x, float v1y, @MinLength(2) float[] v2, FloatBiFunction<T> res)
	{
		return halfPointBetweenFunc(v1x, v1y, v2[0], v2[1], res);
	}
	
	/**
	 * Calculates the point that lies half way between the point given by the origin vector
	 * {@code (v1x, v1y)} and the point given by the origin vector {@code (v2x, v2y)}, supplies the
	 * result to the given implementation of the functional interface and returns the result of that
	 * implementation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ((v2x, v2y) + (v1x, v1y)) / 2}
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v1x
	 *     The value of the x component of the first point.
	 * @param v1y
	 *     The value of the y component of the first point.
	 * @param v2x
	 *     The value of the x component of the second point.
	 * @param v2y
	 *     The value of the y component of the second point.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T halfPointBetweenFunc(float v1x, float v1y, float v2x, float v2y, FloatBiFunction<T> res)
	{
		return res.apply((v2x - v1x) * 0.5f, (v2y - v1y) * 0.5f);
	}
	
	/**
	 * Returns the distance from the point given by the origin vector {@code (v1)} to the point
	 * given by the origin vector {@code (v2)}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |v2 - v1|}
	 * 
	 * @param v1
	 *     The first point.
	 * @param v2
	 *     The second point.
	 * 
	 * @return The distance between the points.
	 */
	public static float distanceTo(Tup2fR v1, Tup2fR v2)
	{
		return distanceTo(v1.v0(), v1.v1(), v2.v0(), v2.v1());
	}
	
	/**
	 * Returns the distance from the point given by the origin vector {@code (v1)} to the point
	 * given by the origin vector {@code (v2)}.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |v2 - v1|}
	 * 
	 * @param v1
	 *     The first point.
	 * @param v2
	 *     The second point.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * 
	 * @return The distance between the points.
	 */
	public static float distanceTo(Tup2fR v1, Tup2fR v2, MathProvider mathProvider)
	{
		return distanceTo(v1.v0(), v1.v1(), v2.v0(), v2.v1(), mathProvider);
	}
	
	/**
	 * Returns the distance from the point given by the origin vector {@code (v1)} to the point
	 * given by the origin vector {@code (v2)}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |v2 - v1|}
	 * 
	 * @param v1
	 *     The first point.
	 * @param v2
	 *     The second point.
	 * @param tolerance
	 *     The tolerance for defining the margin around zero. Must be positive.
	 * 
	 * @return The distance between the points.
	 */
	public static float distanceTo(Tup2fR v1, Tup2fR v2, @FloatMinValue(0.0f) float tolerance)
	{
		return distanceTo(v1.v0(), v1.v1(), v2.v0(), v2.v1(), tolerance);
	}
	
	/**
	 * Returns the distance from the point given by the origin vector {@code (v1)} to the point
	 * given by the origin vector {@code (v2)}.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |v2 - v1|}
	 * 
	 * @param v1
	 *     The first point.
	 * @param v2
	 *     The second point.
	 * @param tolerance
	 *     The tolerance for defining the margin around zero. Must be positive.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * 
	 * @return The distance between the points.
	 */
	public static float distanceTo(Tup2fR v1, Tup2fR v2, @FloatMinValue(0.0f) float tolerance,
			MathProvider mathProvider)
	{
		return distanceTo(v1.v0(), v1.v1(), v2.v0(), v2.v1(), tolerance, mathProvider);
	}
	
	/**
	 * Returns the distance from the point given by the origin vector {@code (v1)} to the point
	 * given by the origin vector {@code (v2[0], v2[1])}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(v2[0], v2[1]) - v1|}
	 * 
	 * @param v1
	 *     The first point.
	 * @param v2
	 *     The second point as an array with at least two entries.
	 * 
	 * @return The distance between the points.
	 */
	public static float distanceTo(Tup2fR v1, @MinLength(2) float[] v2)
	{
		return distanceTo(v1.v0(), v1.v1(), v2[0], v2[1]);
	}
	
	/**
	 * Returns the distance from the point given by the origin vector {@code (v1)} to the point
	 * given by the origin vector {@code (v2[0], v2[1])}.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(v2[0], v2[1]) - v1|}
	 * 
	 * @param v1
	 *     The first point.
	 * @param v2
	 *     The second point as an array with at least two entries.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * 
	 * @return The distance between the points.
	 */
	public static float distanceTo(Tup2fR v1, @MinLength(2) float[] v2, MathProvider mathProvider)
	{
		return distanceTo(v1.v0(), v1.v1(), v2[0], v2[1], mathProvider);
	}
	
	/**
	 * Returns the distance from the point given by the origin vector {@code (v1)} to the point
	 * given by the origin vector {@code (v2[0], v2[1])}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(v2[0], v2[1]) - v1|}
	 * 
	 * @param v1
	 *     The first point.
	 * @param v2
	 *     The second point as an array with at least two entries.
	 * @param tolerance
	 *     The tolerance for defining the margin around zero. Must be positive.
	 * 
	 * @return The distance between the points.
	 */
	public static float distanceTo(Tup2fR v1, @MinLength(2) float[] v2, @FloatMinValue(0.0f) float tolerance)
	{
		return distanceTo(v1.v0(), v1.v1(), v2[0], v2[1], tolerance);
	}
	
	/**
	 * Returns the distance from the point given by the origin vector {@code (v1)} to the point
	 * given by the origin vector {@code (v2[0], v2[1])}.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(v2[0], v2[1]) - v1|}
	 * 
	 * @param v1
	 *     The first point.
	 * @param v2
	 *     The second point as an array with at least two entries.
	 * @param tolerance
	 *     The tolerance for defining the margin around zero. Must be positive.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * 
	 * @return The distance between the points.
	 */
	public static float distanceTo(Tup2fR v1, @MinLength(2) float[] v2, @FloatMinValue(0.0f) float tolerance,
			MathProvider mathProvider)
	{
		return distanceTo(v1.v0(), v1.v1(), v2[0], v2[1], tolerance, mathProvider);
	}
	
	/**
	 * Returns the distance from the point given by the origin vector {@code (v1)} to the point
	 * given by the origin vector {@code (v2x, v2y)}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(v2x, v2y) - v1|}
	 * 
	 * @param v1
	 *     The first point.
	 * @param v2x
	 *     The value of the x component of the second point.
	 * @param v2y
	 *     The value of the y component of the second point.
	 * 
	 * @return The distance between the points.
	 */
	public static float distanceTo(Tup2fR v1, float v2x, float v2y)
	{
		return distanceTo(v1.v0(), v1.v1(), v2x, v2y);
	}
	
	/**
	 * Returns the distance from the point given by the origin vector {@code (v1)} to the point
	 * given by the origin vector {@code (v2x, v2y)}.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(v2x, v2y) - v1|}
	 * 
	 * @param v1
	 *     The first point.
	 * @param v2x
	 *     The value of the x component of the second point.
	 * @param v2y
	 *     The value of the y component of the second point.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * 
	 * @return The distance between the points.
	 */
	public static float distanceTo(Tup2fR v1, float v2x, float v2y, MathProvider mathProvider)
	{
		return distanceTo(v1.v0(), v1.v1(), v2x, v2y, mathProvider);
	}
	
	/**
	 * Returns the distance from the point given by the origin vector {@code (v1)} to the point
	 * given by the origin vector {@code (v2x, v2y)}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(v2x, v2y) - v1|}
	 * 
	 * @param v1
	 *     The first point.
	 * @param v2x
	 *     The value of the x component of the second point.
	 * @param v2y
	 *     The value of the y component of the second point.
	 * @param tolerance
	 *     The tolerance for defining the margin around zero. Must be positive.
	 * 
	 * @return The distance between the points.
	 */
	public static float distanceTo(Tup2fR v1, float v2x, float v2y, @FloatMinValue(0.0f) float tolerance)
	{
		return distanceTo(v1.v0(), v1.v1(), v2x, v2y, tolerance);
	}
	
	/**
	 * Returns the distance from the point given by the origin vector {@code (v1)} to the point
	 * given by the origin vector {@code (v2x, v2y)}.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(v2x, v2y) - v1|}
	 * 
	 * @param v1
	 *     The first point.
	 * @param v2x
	 *     The value of the x component of the second point.
	 * @param v2y
	 *     The value of the y component of the second point.
	 * @param tolerance
	 *     The tolerance for defining the margin around zero. Must be positive.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * 
	 * @return The distance between the points.
	 */
	public static float distanceTo(Tup2fR v1, float v2x, float v2y, @FloatMinValue(0.0f) float tolerance,
			MathProvider mathProvider)
	{
		return distanceTo(v1.v0(), v1.v1(), v2x, v2y, tolerance, mathProvider);
	}
	
	/**
	 * Returns the distance from the point given by the origin vector {@code (v1[0], v1[1])} to the
	 * point given by the origin vector {@code (v2)}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |v2 - (v1[0], v1[1])|}
	 * 
	 * @param v1
	 *     The first point as an array with at least two entries.
	 * @param v2
	 *     The second point.
	 * 
	 * @return The distance between the points.
	 */
	public static float distanceTo(@MinLength(2) float[] v1, Tup2fR v2)
	{
		return distanceTo(v1[0], v1[1], v2.v0(), v2.v1());
	}
	
	/**
	 * Returns the distance from the point given by the origin vector {@code (v1[0], v1[1])} to the
	 * point given by the origin vector {@code (v2)}.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |v2 - (v1[0], v1[1])|}
	 * 
	 * @param v1
	 *     The first point as an array with at least two entries.
	 * @param v2
	 *     The second point.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * 
	 * @return The distance between the points.
	 */
	public static float distanceTo(@MinLength(2) float[] v1, Tup2fR v2, MathProvider mathProvider)
	{
		return distanceTo(v1[0], v1[1], v2.v0(), v2.v1(), mathProvider);
	}
	
	/**
	 * Returns the distance from the point given by the origin vector {@code (v1[0], v1[1])} to the
	 * point given by the origin vector {@code (v2)}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |v2 - (v1[0], v1[1])|}
	 * 
	 * @param v1
	 *     The first point as an array with at least two entries.
	 * @param v2
	 *     The second point.
	 * @param tolerance
	 *     The tolerance for defining the margin around zero. Must be positive.
	 * 
	 * @return The distance between the points.
	 */
	public static float distanceTo(@MinLength(2) float[] v1, Tup2fR v2, @FloatMinValue(0.0f) float tolerance)
	{
		return distanceTo(v1[0], v1[1], v2.v0(), v2.v1(), tolerance);
	}
	
	/**
	 * Returns the distance from the point given by the origin vector {@code (v1[0], v1[1])} to the
	 * point given by the origin vector {@code (v2)}.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |v2 - (v1[0], v1[1])|}
	 * 
	 * @param v1
	 *     The first point as an array with at least two entries.
	 * @param v2
	 *     The second point.
	 * @param tolerance
	 *     The tolerance for defining the margin around zero. Must be positive.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * 
	 * @return The distance between the points.
	 */
	public static float distanceTo(@MinLength(2) float[] v1, Tup2fR v2, @FloatMinValue(0.0f) float tolerance,
			MathProvider mathProvider)
	{
		return distanceTo(v1[0], v1[1], v2.v0(), v2.v1(), tolerance, mathProvider);
	}
	
	/**
	 * Returns the distance from the point given by the origin vector {@code (v1[0], v1[1])} to the
	 * point given by the origin vector {@code (v2[0], v2[1])}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(v2[0], v2[1]) - (v1[0], v1[1])|}
	 * 
	 * @param v1
	 *     The first point as an array with at least two entries.
	 * @param v2
	 *     The second point as an array with at least two entries.
	 * 
	 * @return The distance between the points.
	 */
	public static float distanceTo(@MinLength(2) float[] v1, @MinLength(2) float[] v2)
	{
		return distanceTo(v1[0], v1[1], v2[0], v2[1]);
	}
	
	/**
	 * Returns the distance from the point given by the origin vector {@code (v1[0], v1[1])} to the
	 * point given by the origin vector {@code (v2[0], v2[1])}.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(v2[0], v2[1]) - (v1[0], v1[1])|}
	 * 
	 * @param v1
	 *     The first point as an array with at least two entries.
	 * @param v2
	 *     The second point as an array with at least two entries.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * 
	 * @return The distance between the points.
	 */
	public static float distanceTo(@MinLength(2) float[] v1, @MinLength(2) float[] v2, MathProvider mathProvider)
	{
		return distanceTo(v1[0], v1[1], v2[0], v2[1], mathProvider);
	}
	
	/**
	 * Returns the distance from the point given by the origin vector {@code (v1[0], v1[1])} to the
	 * point given by the origin vector {@code (v2[0], v2[1])}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(v2[0], v2[1]) - (v1[0], v1[1])|}
	 * 
	 * @param v1
	 *     The first point as an array with at least two entries.
	 * @param v2
	 *     The second point as an array with at least two entries.
	 * @param tolerance
	 *     The tolerance for defining the margin around zero. Must be positive.
	 * 
	 * @return The distance between the points.
	 */
	public static float distanceTo(@MinLength(2) float[] v1, @MinLength(2) float[] v2,
			@FloatMinValue(0.0f) float tolerance)
	{
		return distanceTo(v1[0], v1[1], v2[0], v2[1], tolerance);
	}
	
	/**
	 * Returns the distance from the point given by the origin vector {@code (v1[0], v1[1])} to the
	 * point given by the origin vector {@code (v2[0], v2[1])}.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(v2[0], v2[1]) - (v1[0], v1[1])|}
	 * 
	 * @param v1
	 *     The first point as an array with at least two entries.
	 * @param v2
	 *     The second point as an array with at least two entries.
	 * @param tolerance
	 *     The tolerance for defining the margin around zero. Must be positive.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * 
	 * @return The distance between the points.
	 */
	public static float distanceTo(@MinLength(2) float[] v1, @MinLength(2) float[] v2,
			@FloatMinValue(0.0f) float tolerance, MathProvider mathProvider)
	{
		return distanceTo(v1[0], v1[1], v2[0], v2[1], tolerance, mathProvider);
	}
	
	/**
	 * Returns the distance from the point given by the origin vector {@code (v1[0], v1[1])} to the
	 * point given by the origin vector {@code (v2x, v2y)}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(v2x, v2y) - (v1[0], v1[1])|}
	 * 
	 * @param v1
	 *     The first point as an array with at least two entries.
	 * @param v2x
	 *     The value of the x component of the second point.
	 * @param v2y
	 *     The value of the y component of the second point.
	 * 
	 * @return The distance between the points.
	 */
	public static float distanceTo(@MinLength(2) float[] v1, float v2x, float v2y)
	{
		return distanceTo(v1[0], v1[1], v2x, v2y);
	}
	
	/**
	 * Returns the distance from the point given by the origin vector {@code (v1[0], v1[1])} to the
	 * point given by the origin vector {@code (v2x, v2y)}.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(v2x, v2y) - (v1[0], v1[1])|}
	 * 
	 * @param v1
	 *     The first point as an array with at least two entries.
	 * @param v2x
	 *     The value of the x component of the second point.
	 * @param v2y
	 *     The value of the y component of the second point.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * 
	 * @return The distance between the points.
	 */
	public static float distanceTo(@MinLength(2) float[] v1, float v2x, float v2y, MathProvider mathProvider)
	{
		return distanceTo(v1[0], v1[1], v2x, v2y, mathProvider);
	}
	
	/**
	 * Returns the distance from the point given by the origin vector {@code (v1[0], v1[1])} to the
	 * point given by the origin vector {@code (v2x, v2y)}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(v2x, v2y) - (v1[0], v1[1])|}
	 * 
	 * @param v1
	 *     The first point as an array with at least two entries.
	 * @param v2x
	 *     The value of the x component of the second point.
	 * @param v2y
	 *     The value of the y component of the second point.
	 * @param tolerance
	 *     The tolerance for defining the margin around zero. Must be positive.
	 * 
	 * @return The distance between the points.
	 */
	public static float distanceTo(@MinLength(2) float[] v1, float v2x, float v2y, @FloatMinValue(0.0f) float tolerance)
	{
		return distanceTo(v1[0], v1[1], v2x, v2y, tolerance);
	}
	
	/**
	 * Returns the distance from the point given by the origin vector {@code (v1[0], v1[1])} to the
	 * point given by the origin vector {@code (v2x, v2y)}.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(v2x, v2y) - (v1[0], v1[1])|}
	 * 
	 * @param v1
	 *     The first point as an array with at least two entries.
	 * @param v2x
	 *     The value of the x component of the second point.
	 * @param v2y
	 *     The value of the y component of the second point.
	 * @param tolerance
	 *     The tolerance for defining the margin around zero. Must be positive.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * 
	 * @return The distance between the points.
	 */
	public static float distanceTo(@MinLength(2) float[] v1, float v2x, float v2y, @FloatMinValue(0.0f) float tolerance,
			MathProvider mathProvider)
	{
		return distanceTo(v1[0], v1[1], v2x, v2y, tolerance, mathProvider);
	}
	
	/**
	 * Returns the distance from the point given by the origin vector {@code (v1x, v1y)} to the
	 * point given by the origin vector {@code (v2)}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |v2 - (v1x, v1y)|}
	 * 
	 * @param v1x
	 *     The value of the x component of the first point.
	 * @param v1y
	 *     The value of the y component of the first point.
	 * @param v2
	 *     The second point.
	 * 
	 * @return The distance between the points.
	 */
	public static float distanceTo(float v1x, float v1y, Tup2fR v2)
	{
		return distanceTo(v1x, v1y, v2.v0(), v2.v1());
	}
	
	/**
	 * Returns the distance from the point given by the origin vector {@code (v1x, v1y)} to the
	 * point given by the origin vector {@code (v2)}.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |v2 - (v1x, v1y)|}
	 * 
	 * @param v1x
	 *     The value of the x component of the first point.
	 * @param v1y
	 *     The value of the y component of the first point.
	 * @param v2
	 *     The second point.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * 
	 * @return The distance between the points.
	 */
	public static float distanceTo(float v1x, float v1y, Tup2fR v2, MathProvider mathProvider)
	{
		return distanceTo(v1x, v1y, v2.v0(), v2.v1(), mathProvider);
	}
	
	/**
	 * Returns the distance from the point given by the origin vector {@code (v1x, v1y)} to the
	 * point given by the origin vector {@code (v2)}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |v2 - (v1x, v1y)|}
	 * 
	 * @param v1x
	 *     The value of the x component of the first point.
	 * @param v1y
	 *     The value of the y component of the first point.
	 * @param v2
	 *     The second point.
	 * @param tolerance
	 *     The tolerance for defining the margin around zero. Must be positive.
	 * 
	 * @return The distance between the points.
	 */
	public static float distanceTo(float v1x, float v1y, Tup2fR v2, @FloatMinValue(0.0f) float tolerance)
	{
		return distanceTo(v1x, v1y, v2.v0(), v2.v1(), tolerance);
	}
	
	/**
	 * Returns the distance from the point given by the origin vector {@code (v1x, v1y)} to the
	 * point given by the origin vector {@code (v2)}.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |v2 - (v1x, v1y)|}
	 * 
	 * @param v1x
	 *     The value of the x component of the first point.
	 * @param v1y
	 *     The value of the y component of the first point.
	 * @param v2
	 *     The second point.
	 * @param tolerance
	 *     The tolerance for defining the margin around zero. Must be positive.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * 
	 * @return The distance between the points.
	 */
	public static float distanceTo(float v1x, float v1y, Tup2fR v2, @FloatMinValue(0.0f) float tolerance,
			MathProvider mathProvider)
	{
		return distanceTo(v1x, v1y, v2.v0(), v2.v1(), tolerance, mathProvider);
	}
	
	/**
	 * Returns the distance from the point given by the origin vector {@code (v1x, v1y)} to the
	 * point given by the origin vector {@code (v2[0], v2[1])}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(v2[0], v2[1]) - (v1x, v1y)|}
	 * 
	 * @param v1x
	 *     The value of the x component of the first point.
	 * @param v1y
	 *     The value of the y component of the first point.
	 * @param v2
	 *     The second point as an array with at least two entries.
	 * 
	 * @return The distance between the points.
	 */
	public static float distanceTo(float v1x, float v1y, @MinLength(2) float[] v2)
	{
		return distanceTo(v1x, v1y, v2[0], v2[1]);
	}
	
	/**
	 * Returns the distance from the point given by the origin vector {@code (v1x, v1y)} to the
	 * point given by the origin vector {@code (v2[0], v2[1])}.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(v2[0], v2[1]) - (v1x, v1y)|}
	 * 
	 * @param v1x
	 *     The value of the x component of the first point.
	 * @param v1y
	 *     The value of the y component of the first point.
	 * @param v2
	 *     The second point as an array with at least two entries.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * 
	 * @return The distance between the points.
	 */
	public static float distanceTo(float v1x, float v1y, @MinLength(2) float[] v2, MathProvider mathProvider)
	{
		return distanceTo(v1x, v1y, v2[0], v2[1], mathProvider);
	}
	
	/**
	 * Returns the distance from the point given by the origin vector {@code (v1x, v1y)} to the
	 * point given by the origin vector {@code (v2[0], v2[1])}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(v2[0], v2[1]) - (v1x, v1y)|}
	 * 
	 * @param v1x
	 *     The value of the x component of the first point.
	 * @param v1y
	 *     The value of the y component of the first point.
	 * @param v2
	 *     The second point as an array with at least two entries.
	 * @param tolerance
	 *     The tolerance for defining the margin around zero. Must be positive.
	 * 
	 * @return The distance between the points.
	 */
	public static float distanceTo(float v1x, float v1y, @MinLength(2) float[] v2, @FloatMinValue(0.0f) float tolerance)
	{
		return distanceTo(v1x, v1y, v2[0], v2[1], tolerance);
	}
	
	/**
	 * Returns the distance from the point given by the origin vector {@code (v1x, v1y)} to the
	 * point given by the origin vector {@code (v2[0], v2[1])}.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(v2[0], v2[1]) - (v1x, v1y)|}
	 * 
	 * @param v1x
	 *     The value of the x component of the first point.
	 * @param v1y
	 *     The value of the y component of the first point.
	 * @param v2
	 *     The second point as an array with at least two entries.
	 * @param tolerance
	 *     The tolerance for defining the margin around zero. Must be positive.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * 
	 * @return The distance between the points.
	 */
	public static float distanceTo(float v1x, float v1y, @MinLength(2) float[] v2, @FloatMinValue(0.0f) float tolerance,
			MathProvider mathProvider)
	{
		return distanceTo(v1x, v1y, v2[0], v2[1], tolerance, mathProvider);
	}
	
	/**
	 * Returns the distance from the point given by the origin vector {@code (v1x, v1y)} to the
	 * point given by the origin vector {@code (v2x, v2y)}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(v2x, v2y) - (v1x, v1y)|}
	 * 
	 * @param v1x
	 *     The value of the x component of the first point.
	 * @param v1y
	 *     The value of the y component of the first point.
	 * @param v2x
	 *     The value of the x component of the second point.
	 * @param v2y
	 *     The value of the y component of the second point.
	 * 
	 * @return The distance between the points.
	 */
	public static float distanceTo(float v1x, float v1y, float v2x, float v2y)
	{
		return length(v2x - v1x, v2y - v1y);
	}
	
	/**
	 * Returns the distance from the point given by the origin vector {@code (v1x, v1y)} to the
	 * point given by the origin vector {@code (v2x, v2y)}.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(v2x, v2y) - (v1x, v1y)|}
	 * 
	 * @param v1x
	 *     The value of the x component of the first point.
	 * @param v1y
	 *     The value of the y component of the first point.
	 * @param v2x
	 *     The value of the x component of the second point.
	 * @param v2y
	 *     The value of the y component of the second point.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * 
	 * @return The distance between the points.
	 */
	public static float distanceTo(float v1x, float v1y, float v2x, float v2y, MathProvider mathProvider)
	{
		return length(v2x - v1x, v2y - v1y, mathProvider);
	}
	
	/**
	 * Returns the distance from the point given by the origin vector {@code (v1x, v1y)} to the
	 * point given by the origin vector {@code (v2x, v2y)}. If the values of all components are
	 * within the margin defined by {@code (-tolerance <= value <= tolerance)} around the other
	 * vectors components the result will be zero.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(v2x, v2y) - (v1x, v1y)|}
	 * 
	 * @param v1x
	 *     The value of the x component of the first point.
	 * @param v1y
	 *     The value of the y component of the first point.
	 * @param v2x
	 *     The value of the x component of the second point.
	 * @param v2y
	 *     The value of the y component of the second point.
	 * @param tolerance
	 *     The tolerance for defining the margin around zero. Must be positive.
	 * 
	 * @return The distance between the points.
	 */
	public static float distanceTo(float v1x, float v1y, float v2x, float v2y, @FloatMinValue(0.0f) float tolerance)
	{
		return length(v2x - v1x, v2y - v1y, tolerance);
	}
	
	/**
	 * Returns the distance from the point given by the origin vector {@code (v1x, v1y)} to the
	 * point given by the origin vector {@code (v2x, v2y)}. If the values of all components are
	 * within the margin defined by {@code (-tolerance <= value <= tolerance)} around the other
	 * vectors components the result will be zero.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(v2x, v2y) - (v1x, v1y)|}
	 * 
	 * @param v1x
	 *     The value of the x component of the first point.
	 * @param v1y
	 *     The value of the y component of the first point.
	 * @param v2x
	 *     The value of the x component of the second point.
	 * @param v2y
	 *     The value of the y component of the second point.
	 * @param tolerance
	 *     The tolerance for defining the margin around zero. Must be positive.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * 
	 * @return The distance between the points.
	 */
	public static float distanceTo(float v1x, float v1y, float v2x, float v2y, @FloatMinValue(0.0f) float tolerance,
			MathProvider mathProvider)
	{
		return length(v2x - v1x, v2y - v1y, tolerance, mathProvider);
	}
	
	/**
	 * Returns the squared distance from the point given by the origin vector {@code (v1)} to the
	 * point given by the origin vector {@code (v2)}.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |v2 - v1|²}
	 * 
	 * @param v1
	 *     The first point.
	 * @param v2
	 *     The second point.
	 * 
	 * @return The squared distance between the points.
	 */
	public static float squaredDistanceTo(Tup2fR v1, Tup2fR v2)
	{
		return squaredDistanceTo(v1.v0(), v1.v1(), v2.v0(), v2.v1());
	}
	
	/**
	 * Returns the squared distance from the point given by the origin vector {@code (v1)} to the
	 * point given by the origin vector {@code (v2[0], v2[1])}.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(v2[0], v2[1]) - v1|²}
	 * 
	 * @param v1
	 *     The first point.
	 * @param v2
	 *     The second point as an array with at least two entries.
	 * 
	 * @return The squared distance between the points.
	 */
	public static float squaredDistanceTo(Tup2fR v1, @MinLength(2) float[] v2)
	{
		return squaredDistanceTo(v1.v0(), v1.v1(), v2[0], v2[1]);
	}
	
	/**
	 * Returns the squared distance from the point given by the origin vector {@code (v1)} to the
	 * point given by the origin vector {@code (v2x, v2y)}.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(v2x, v2y) - v1|²}
	 * 
	 * @param v1
	 *     The first point.
	 * @param v2x
	 *     The value of the x component of the second point.
	 * @param v2y
	 *     The value of the y component of the second point.
	 * 
	 * @return The squared distance between the points.
	 */
	public static float squaredDistanceTo(Tup2fR v1, float v2x, float v2y)
	{
		return squaredDistanceTo(v1.v0(), v1.v1(), v2x, v2y);
	}
	
	/**
	 * Returns the squared distance from the point given by the origin vector {@code (v1[0], v1[1])}
	 * to the point given by the origin vector {@code (v2)}.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |v2 - (v1[0], v1[1])|²}
	 * 
	 * @param v1
	 *     The first point as an array with at least two entries.
	 * @param v2
	 *     The second point.
	 * 
	 * @return The squared distance between the points.
	 */
	public static float squaredDistanceTo(@MinLength(2) float[] v1, Tup2fR v2)
	{
		return squaredDistanceTo(v1[0], v1[1], v2.v0(), v2.v1());
	}
	
	/**
	 * Returns the squared distance from the point given by the origin vector {@code (v1[0], v1[1])}
	 * to the point given by the origin vector {@code (v2[0], v2[1])}.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(v2[0], v2[1]) - (v1[0], v1[1])|²}
	 * 
	 * @param v1
	 *     The first point as an array with at least two entries.
	 * @param v2
	 *     The second point as an array with at least two entries.
	 * 
	 * @return The squared distance between the points.
	 */
	public static float squaredDistanceTo(@MinLength(2) float[] v1, @MinLength(2) float[] v2)
	{
		return squaredDistanceTo(v1[0], v1[1], v2[0], v2[1]);
	}
	
	/**
	 * Returns the squared distance from the point given by the origin vector {@code (v1[0], v1[1])}
	 * to the point given by the origin vector {@code (v2x, v2y)}.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(v2x, v2y) - (v1[0], v1[1])|²}
	 * 
	 * @param v1
	 *     The first point as an array with at least two entries.
	 * @param v2x
	 *     The value of the x component of the second point.
	 * @param v2y
	 *     The value of the y component of the second point.
	 * 
	 * @return The squared distance between the points.
	 */
	public static float squaredDistanceTo(@MinLength(2) float[] v1, float v2x, float v2y)
	{
		return squaredDistanceTo(v1[0], v1[1], v2x, v2y);
	}
	
	/**
	 * Returns the squared distance from the point given by the origin vector {@code (v1x, v1y)} to
	 * the point given by the origin vector {@code (v2)}.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |v2 - (v1x, v1y)|²}
	 * 
	 * @param v1x
	 *     The value of the x component of the first point.
	 * @param v1y
	 *     The value of the y component of the first point.
	 * @param v2
	 *     The second point.
	 * 
	 * @return The squared distance between the points.
	 */
	public static float squaredDistanceTo(float v1x, float v1y, Tup2fR v2)
	{
		return squaredDistanceTo(v1x, v1y, v2.v0(), v2.v1());
	}
	
	/**
	 * Returns the squared distance from the point given by the origin vector {@code (v1x, v1y)} to
	 * the point given by the origin vector {@code (v2[0], v2[1])}.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(v2[0], v2[1]) - (v1x, v1y)|²}
	 * 
	 * @param v1x
	 *     The value of the x component of the first point.
	 * @param v1y
	 *     The value of the y component of the first point.
	 * @param v2
	 *     The second point as an array with at least two entries.
	 * 
	 * @return The squared distance between the points.
	 */
	public static float squaredDistanceTo(float v1x, float v1y, @MinLength(2) float[] v2)
	{
		return squaredDistanceTo(v1x, v1y, v2[0], v2[1]);
	}
	
	/**
	 * Returns the squared distance from the point given by the origin vector {@code (v1x, v1y)} to
	 * the point given by the origin vector {@code (v2x, v2y)}.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(v2x, v2y) - (v1x, v1y)|²}
	 * 
	 * @param v1x
	 *     The value of the x component of the first point.
	 * @param v1y
	 *     The value of the y component of the first point.
	 * @param v2x
	 *     The value of the x component of the second point.
	 * @param v2y
	 *     The value of the y component of the second point.
	 * 
	 * @return The squared distance between the points.
	 */
	public static float squaredDistanceTo(float v1x, float v1y, float v2x, float v2y)
	{
		return squaredLength(v2x - v1x, v2y - v1y);
	}
	
	/**
	 * Returns the inverse distance from the point given by the origin vector {@code (v1)} to the
	 * point given by the origin vector {@code (v2)}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code 1 / |v2 - v1|}
	 * 
	 * @param v1
	 *     The first point.
	 * @param v2
	 *     The second point.
	 * 
	 * @return The invers distance between the points.
	 */
	public static float inverseDistanceTo(Tup2fR v1, Tup2fR v2)
	{
		return inverseDistanceTo(v1.v0(), v1.v1(), v2.v0(), v2.v1());
	}
	
	/**
	 * Returns the inverse distance from the point given by the origin vector {@code (v1)} to the
	 * point given by the origin vector {@code (v2)}.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code 1 / |v2 - v1|}
	 * 
	 * @param v1
	 *     The first point.
	 * @param v2
	 *     The second point.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * 
	 * @return The invers distance between the points.
	 */
	public static float inverseDistanceTo(Tup2fR v1, Tup2fR v2, MathProvider mathProvider)
	{
		return inverseDistanceTo(v1.v0(), v1.v1(), v2.v0(), v2.v1(), mathProvider);
	}
	
	/**
	 * Returns the inverse distance from the point given by the origin vector {@code (v1)} to the
	 * point given by the origin vector {@code (v2[0], v2[1])}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code 1 / |(v2[0], v2[1]) - v1|}
	 * 
	 * @param v1
	 *     The first point.
	 * @param v2
	 *     The second point as an array with at least two entries.
	 * 
	 * @return The invers distance between the points.
	 */
	public static float inverseDistanceTo(Tup2fR v1, @MinLength(2) float[] v2)
	{
		return inverseDistanceTo(v1.v0(), v1.v1(), v2[0], v2[1]);
	}
	
	/**
	 * Returns the inverse distance from the point given by the origin vector {@code (v1)} to the
	 * point given by the origin vector {@code (v2[0], v2[1])}.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code 1 / |(v2[0], v2[1]) - v1|}
	 * 
	 * @param v1
	 *     The first point.
	 * @param v2
	 *     The second point as an array with at least two entries.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * 
	 * @return The invers distance between the points.
	 */
	public static float inverseDistanceTo(Tup2fR v1, @MinLength(2) float[] v2, MathProvider mathProvider)
	{
		return inverseDistanceTo(v1.v0(), v1.v1(), v2[0], v2[1], mathProvider);
	}
	
	/**
	 * Returns the inverse distance from the point given by the origin vector {@code (v1)} to the
	 * point given by the origin vector {@code (v2x, v2y)}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code 1 / |(v2x, v2y) - v1|}
	 * 
	 * @param v1
	 *     The first point.
	 * @param v2x
	 *     The value of the x component of the second point.
	 * @param v2y
	 *     The value of the y component of the second point.
	 * 
	 * @return The invers distance between the points.
	 */
	public static float inverseDistanceTo(Tup2fR v1, float v2x, float v2y)
	{
		return inverseDistanceTo(v1.v0(), v1.v1(), v2x, v2y);
	}
	
	/**
	 * Returns the inverse distance from the point given by the origin vector {@code (v1)} to the
	 * point given by the origin vector {@code (v2x, v2y)}.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code 1 / |(v2x, v2y) - v1|}
	 * 
	 * @param v1
	 *     The first point.
	 * @param v2x
	 *     The value of the x component of the second point.
	 * @param v2y
	 *     The value of the y component of the second point.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * 
	 * @return The invers distance between the points.
	 */
	public static float inverseDistanceTo(Tup2fR v1, float v2x, float v2y, MathProvider mathProvider)
	{
		return inverseDistanceTo(v1.v0(), v1.v1(), v2x, v2y, mathProvider);
	}
	
	/**
	 * Returns the inverse distance from the point given by the origin vector {@code (v1[0], v1[1])}
	 * to the point given by the origin vector {@code (v2)}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code 1 / |v2 - (v1[0], v1[1])|}
	 * 
	 * @param v1
	 *     The first point as an array with at least two entries.
	 * @param v2
	 *     The second point.
	 * 
	 * @return The invers distance between the points.
	 */
	public static float inverseDistanceTo(@MinLength(2) float[] v1, Tup2fR v2)
	{
		return inverseDistanceTo(v1[0], v1[1], v2.v0(), v2.v1());
	}
	
	/**
	 * Returns the inverse distance from the point given by the origin vector {@code (v1[0], v1[1])}
	 * to the point given by the origin vector {@code (v2)}.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code 1 / |v2 - (v1[0], v1[1])|}
	 * 
	 * @param v1
	 *     The first point as an array with at least two entries.
	 * @param v2
	 *     The second point.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * 
	 * @return The invers distance between the points.
	 */
	public static float inverseDistanceTo(@MinLength(2) float[] v1, Tup2fR v2, MathProvider mathProvider)
	{
		return inverseDistanceTo(v1[0], v1[1], v2.v0(), v2.v1(), mathProvider);
	}
	
	/**
	 * Returns the inverse distance from the point given by the origin vector {@code (v1[0], v1[1])}
	 * to the point given by the origin vector {@code (v2[0], v2[1])}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code 1 / |(v2[0], v2[1]) - (v1[0], v1[1])|}
	 * 
	 * @param v1
	 *     The first point as an array with at least two entries.
	 * @param v2
	 *     The second point as an array with at least two entries.
	 * 
	 * @return The invers distance between the points.
	 */
	public static float inverseDistanceTo(@MinLength(2) float[] v1, @MinLength(2) float[] v2)
	{
		return inverseDistanceTo(v1[0], v1[1], v2[0], v2[1]);
	}
	
	/**
	 * Returns the inverse distance from the point given by the origin vector {@code (v1[0], v1[1])}
	 * to the point given by the origin vector {@code (v2[0], v2[1])}.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code 1 / |(v2[0], v2[1]) - (v1[0], v1[1])|}
	 * 
	 * @param v1
	 *     The first point as an array with at least two entries.
	 * @param v2
	 *     The second point as an array with at least two entries.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * 
	 * @return The invers distance between the points.
	 */
	public static float inverseDistanceTo(@MinLength(2) float[] v1, @MinLength(2) float[] v2, MathProvider mathProvider)
	{
		return inverseDistanceTo(v1[0], v1[1], v2[0], v2[1], mathProvider);
	}
	
	/**
	 * Returns the inverse distance from the point given by the origin vector {@code (v1[0], v1[1])}
	 * to the point given by the origin vector {@code (v2x, v2y)}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code 1 / |(v2x, v2y) - (v1[0], v1[1])|}
	 * 
	 * @param v1
	 *     The first point as an array with at least two entries.
	 * @param v2x
	 *     The value of the x component of the second point.
	 * @param v2y
	 *     The value of the y component of the second point.
	 * 
	 * @return The invers distance between the points.
	 */
	public static float inverseDistanceTo(@MinLength(2) float[] v1, float v2x, float v2y)
	{
		return inverseDistanceTo(v1[0], v1[1], v2x, v2y);
	}
	
	/**
	 * Returns the inverse distance from the point given by the origin vector {@code (v1[0], v1[1])}
	 * to the point given by the origin vector {@code (v2x, v2y)}.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code 1 / |(v2x, v2y) - (v1[0], v1[1])|}
	 * 
	 * @param v1
	 *     The first point as an array with at least two entries.
	 * @param v2x
	 *     The value of the x component of the second point.
	 * @param v2y
	 *     The value of the y component of the second point.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * 
	 * @return The invers distance between the points.
	 */
	public static float inverseDistanceTo(@MinLength(2) float[] v1, float v2x, float v2y, MathProvider mathProvider)
	{
		return inverseDistanceTo(v1[0], v1[1], v2x, v2y, mathProvider);
	}
	
	/**
	 * Returns the inverse distance from the point given by the origin vector {@code (v1x, v1y)} to
	 * the point given by the origin vector {@code (v2)}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code 1 / |v2 - (v1x, v1y)|}
	 * 
	 * @param v1x
	 *     The value of the x component of the first point.
	 * @param v1y
	 *     The value of the y component of the first point.
	 * @param v2
	 *     The second point.
	 * 
	 * @return The invers distance between the points.
	 */
	public static float inverseDistanceTo(float v1x, float v1y, Tup2fR v2)
	{
		return inverseDistanceTo(v1x, v1y, v2.v0(), v2.v1());
	}
	
	/**
	 * Returns the inverse distance from the point given by the origin vector {@code (v1x, v1y)} to
	 * the point given by the origin vector {@code (v2)}.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code 1 / |v2 - (v1x, v1y)|}
	 * 
	 * @param v1x
	 *     The value of the x component of the first point.
	 * @param v1y
	 *     The value of the y component of the first point.
	 * @param v2
	 *     The second point.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * 
	 * @return The invers distance between the points.
	 */
	public static float inverseDistanceTo(float v1x, float v1y, Tup2fR v2, MathProvider mathProvider)
	{
		return inverseDistanceTo(v1x, v1y, v2.v0(), v2.v1(), mathProvider);
	}
	
	/**
	 * Returns the inverse distance from the point given by the origin vector {@code (v1x, v1y)} to
	 * the point given by the origin vector {@code (v2[0], v2[1])}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code 1 / |(v2[0], v2[1]) - (v1x, v1y)|}
	 * 
	 * @param v1x
	 *     The value of the x component of the first point.
	 * @param v1y
	 *     The value of the y component of the first point.
	 * @param v2
	 *     The second point as an array with at least two entries.
	 * 
	 * @return The invers distance between the points.
	 */
	public static float inverseDistanceTo(float v1x, float v1y, @MinLength(2) float[] v2)
	{
		return inverseDistanceTo(v1x, v1y, v2[0], v2[1]);
	}
	
	/**
	 * Returns the inverse distance from the point given by the origin vector {@code (v1x, v1y)} to
	 * the point given by the origin vector {@code (v2[0], v2[1])}.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code 1 / |(v2[0], v2[1]) - (v1x, v1y)|}
	 * 
	 * @param v1x
	 *     The value of the x component of the first point.
	 * @param v1y
	 *     The value of the y component of the first point.
	 * @param v2
	 *     The second point as an array with at least two entries.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * 
	 * @return The invers distance between the points.
	 */
	public static float inverseDistanceTo(float v1x, float v1y, @MinLength(2) float[] v2, MathProvider mathProvider)
	{
		return inverseDistanceTo(v1x, v1y, v2[0], v2[1], mathProvider);
	}
	
	/**
	 * Returns the inverse distance from the point given by the origin vector {@code (v1x, v1y)} to
	 * the point given by the origin vector {@code (v2x, v2y)}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code 1 / |(v2x, v2y) - (v1x, v1y)|}
	 * 
	 * @param v1x
	 *     The value of the x component of the first point.
	 * @param v1y
	 *     The value of the y component of the first point.
	 * @param v2x
	 *     The value of the x component of the second point.
	 * @param v2y
	 *     The value of the y component of the second point.
	 * 
	 * @return The invers distance between the points.
	 */
	public static float inverseDistanceTo(float v1x, float v1y, float v2x, float v2y)
	{
		return inverseLength(v2x - v1x, v2y - v1y);
	}
	
	/**
	 * Returns the inverse distance from the point given by the origin vector {@code (v1x, v1y)} to
	 * the point given by the origin vector {@code (v2x, v2y)}.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code 1 / |(v2x, v2y) - (v1x, v1y)|}
	 * 
	 * @param v1x
	 *     The value of the x component of the first point.
	 * @param v1y
	 *     The value of the y component of the first point.
	 * @param v2x
	 *     The value of the x component of the second point.
	 * @param v2y
	 *     The value of the y component of the second point.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * 
	 * @return The invers distance between the points.
	 */
	public static float inverseDistanceTo(float v1x, float v1y, float v2x, float v2y, MathProvider mathProvider)
	{
		return inverseLength(v2x - v1x, v2y - v1y, mathProvider);
	}
	
	/**
	 * Rounds the components of the vector {@code (v)} towards the next greater integer and saves
	 * the result in the given extraction parameter object.
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v
	 *     The vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T ceil(Tup2fR v, @ExtractionParam T res)
	{
		return ceil(v.v0(), v.v1(), res);
	}
	
	/**
	 * Rounds the components of the vector {@code (v[0], v[1])} towards the next greater integer and
	 * saves the result in the given extraction parameter object.
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v
	 *     The vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T ceil(@MinLength(2) float[] v, @ExtractionParam T res)
	{
		return ceil(v[0], v[1], res);
	}
	
	/**
	 * Rounds the components of the vector {@code (x, y)} towards the next greater integer and saves
	 * the result in the given extraction parameter object.
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param x
	 *     The value of the x component of the vector.
	 * @param y
	 *     The value of the y component of the vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T ceil(float x, float y, @ExtractionParam T res)
	{
		res.set((float)Math.ceil(x), (float)Math.ceil(y));
		
		return res;
	}
	
	/**
	 * Rounds the components of the vector {@code (v)} towards the next greater integer and saves
	 * the result in the extraction parameter.
	 * 
	 * @param v
	 *     The vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] ceil(Tup2fR v, @ExtractionParam @MinLength(2) float[] res)
	{
		return ceil(v.v0(), v.v1(), res);
	}
	
	/**
	 * Rounds the components of the vector {@code (v[0], v[1])} towards the next greater integer and
	 * saves the result in the extraction parameter.
	 * 
	 * @param v
	 *     The vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] ceil(@MinLength(2) float[] v, @ExtractionParam @MinLength(2) float[] res)
	{
		return ceil(v[0], v[1], res);
	}
	
	/**
	 * Rounds the components of the vector {@code (x, y)} towards the next greater integer and saves
	 * the result in the extraction parameter.
	 * 
	 * @param x
	 *     The value of the x component of the vector.
	 * @param y
	 *     The value of the y component of the vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] ceil(float x, float y, @ExtractionParam @MinLength(2) float[] res)
	{
		res[0] = (float)Math.ceil(x);
		res[1] = (float)Math.ceil(y);
		
		return res;
	}
	
	/**
	 * Rounds the components of the vector {@code (v)} towards the next greater integer, supplies
	 * the result to the given implementation of the functional interface and returns the result of
	 * that implementation.
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v
	 *     The vector.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T ceilFunc(Tup2fR v, FloatBiFunction<T> res)
	{
		return ceilFunc(v.v0(), v.v1(), res);
	}
	
	/**
	 * Rounds the components of the vector {@code (v[0], v[1])} towards the next greater integer,
	 * supplies the result to the given implementation of the functional interface and returns the
	 * result of that implementation.
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v
	 *     The vector as an array with at least two entries.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T ceilFunc(@MinLength(2) float[] v, FloatBiFunction<T> res)
	{
		return ceilFunc(v[0], v[1], res);
	}
	
	/**
	 * Rounds the components of the vector {@code (x, y)} towards the next greater integer, supplies
	 * the result to the given implementation of the functional interface and returns the result of
	 * that implementation.
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param x
	 *     The value of the x component of the vector.
	 * @param y
	 *     The value of the y component of the vector.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T ceilFunc(float x, float y, FloatBiFunction<T> res)
	{
		return res.apply((float)Math.ceil(x), (float)Math.ceil(y));
	}
	
	/**
	 * Rounds the components of the vector {@code (v)} towards the next smaller integer and saves
	 * the result in the given extraction parameter object.
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v
	 *     The vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T floor(Tup2fR v, @ExtractionParam T res)
	{
		return floor(v.v0(), v.v1(), res);
	}
	
	/**
	 * Rounds the components of the vector {@code (v[0], v[1])} towards the next smaller integer and
	 * saves the result in the given extraction parameter object.
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v
	 *     The vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T floor(@MinLength(2) float[] v, @ExtractionParam T res)
	{
		return floor(v[0], v[1], res);
	}
	
	/**
	 * Rounds the components of the vector {@code (x, y)} towards the next smaller integer and saves
	 * the result in the given extraction parameter object.
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param x
	 *     The value of the x component of the vector.
	 * @param y
	 *     The value of the y component of the vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T floor(float x, float y, @ExtractionParam T res)
	{
		res.set((float)Math.floor(x), (float)Math.floor(y));
		
		return res;
	}
	
	/**
	 * Rounds the components of the vector {@code (v)} towards the next smaller integer and saves
	 * the result in the extraction parameter.
	 * 
	 * @param v
	 *     The vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] floor(Tup2fR v, @ExtractionParam @MinLength(2) float[] res)
	{
		return floor(v.v0(), v.v1(), res);
	}
	
	/**
	 * Rounds the components of the vector {@code (v[0], v[1])} towards the next smaller integer and
	 * saves the result in the extraction parameter.
	 * 
	 * @param v
	 *     The vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] floor(@MinLength(2) float[] v, @ExtractionParam @MinLength(2) float[] res)
	{
		return floor(v[0], v[1], res);
	}
	
	/**
	 * Rounds the components of the vector {@code (x, y)} towards the next smaller integer and saves
	 * the result in the extraction parameter.
	 * 
	 * @param x
	 *     The value of the x component of the vector.
	 * @param y
	 *     The value of the y component of the vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] floor(float x, float y, @ExtractionParam @MinLength(2) float[] res)
	{
		res[0] = (float)Math.floor(x);
		res[1] = (float)Math.floor(y);
		
		return res;
	}
	
	/**
	 * Rounds the components of the vector {@code (v)} towards the next smaller integer, supplies
	 * the result to the given implementation of the functional interface and returns the result of
	 * that implementation.
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v
	 *     The vector.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T floorFunc(Tup2fR v, FloatBiFunction<T> res)
	{
		return floorFunc(v.v0(), v.v1(), res);
	}
	
	/**
	 * Rounds the components of the vector {@code (v[0], v[1])} towards the next smaller integer,
	 * supplies the result to the given implementation of the functional interface and returns the
	 * result of that implementation.
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v
	 *     The vector as an array with at least two entries.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T floorFunc(@MinLength(2) float[] v, FloatBiFunction<T> res)
	{
		return floorFunc(v[0], v[1], res);
	}
	
	/**
	 * Rounds the components of the vector {@code (x, y)} towards the next smaller integer, supplies
	 * the result to the given implementation of the functional interface and returns the result of
	 * that implementation.
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param x
	 *     The value of the x component of the vector.
	 * @param y
	 *     The value of the y component of the vector.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T floorFunc(float x, float y, FloatBiFunction<T> res)
	{
		return res.apply((float)Math.floor(x), (float)Math.floor(y));
	}
	
	/**
	 * Rounds the components of the vector {@code (v)} and saves the result in the given extraction
	 * parameter object.
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v
	 *     The vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T round(Tup2fR v, @ExtractionParam T res)
	{
		return round(v.v0(), v.v1(), res);
	}
	
	/**
	 * Rounds the components of the vector {@code (v[0], v[1])} and saves the result in the given
	 * extraction parameter object.
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v
	 *     The vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T round(@MinLength(2) float[] v, @ExtractionParam T res)
	{
		return round(v[0], v[1], res);
	}
	
	/**
	 * Rounds the components of the vector {@code (x, y)} and saves the result in the given
	 * extraction parameter object.
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param x
	 *     The value of the x component of the vector.
	 * @param y
	 *     The value of the y component of the vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T round(float x, float y, @ExtractionParam T res)
	{
		res.set((float)Math.round(x), (float)Math.round(y));
		
		return res;
	}
	
	/**
	 * Rounds the components of the vector {@code (v)} and saves the result in the extraction
	 * parameter.
	 * 
	 * @param v
	 *     The vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] round(Tup2fR v, @ExtractionParam @MinLength(2) float[] res)
	{
		return round(v.v0(), v.v1(), res);
	}
	
	/**
	 * Rounds the components of the vector {@code (v[0], v[1])} and saves the result in the
	 * extraction parameter.
	 * 
	 * @param v
	 *     The vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] round(@MinLength(2) float[] v, @ExtractionParam @MinLength(2) float[] res)
	{
		return round(v[0], v[1], res);
	}
	
	/**
	 * Rounds the components of the vector {@code (x, y)} and saves the result in the extraction
	 * parameter.
	 * 
	 * @param x
	 *     The value of the x component of the vector.
	 * @param y
	 *     The value of the y component of the vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] round(float x, float y, @ExtractionParam @MinLength(2) float[] res)
	{
		res[0] = (float)Math.round(x);
		res[1] = (float)Math.round(y);
		
		return res;
	}
	
	/**
	 * Rounds the components of the vector {@code (v)}, supplies the result to the given
	 * implementation of the functional interface and returns the result of that implementation.
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v
	 *     The vector.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T roundFunc(Tup2fR v, FloatBiFunction<T> res)
	{
		return roundFunc(v.v0(), v.v1(), res);
	}
	
	/**
	 * Rounds the components of the vector {@code (v[0], v[1])}, supplies the result to the given
	 * implementation of the functional interface and returns the result of that implementation.
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v
	 *     The vector as an array with at least two entries.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T roundFunc(@MinLength(2) float[] v, FloatBiFunction<T> res)
	{
		return roundFunc(v[0], v[1], res);
	}
	
	/**
	 * Rounds the components of the vector {@code (x, y)}, supplies the result to the given
	 * implementation of the functional interface and returns the result of that implementation.
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param x
	 *     The value of the x component of the vector.
	 * @param y
	 *     The value of the y component of the vector.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T roundFunc(float x, float y, FloatBiFunction<T> res)
	{
		return res.apply((float)Math.round(x), (float)Math.round(y));
	}
	
	/**
	 * Truncates the decimals of the components of the vector {@code (v)} and saves the result in
	 * the given extraction parameter object.
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v
	 *     The vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T trunc(Tup2fR v, @ExtractionParam T res)
	{
		return trunc(v.v0(), v.v1(), res);
	}
	
	/**
	 * Truncates the decimals of the components of the vector {@code (v[0], v[1])} and saves the
	 * result in the given extraction parameter object.
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v
	 *     The vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T trunc(@MinLength(2) float[] v, @ExtractionParam T res)
	{
		return trunc(v[0], v[1], res);
	}
	
	/**
	 * Truncates the decimals of the components of the vector {@code (x, y)} and saves the result in
	 * the given extraction parameter object.
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param x
	 *     The value of the x component of the vector.
	 * @param y
	 *     The value of the y component of the vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T trunc(float x, float y, @ExtractionParam T res)
	{
		res.set((int)x, (int)y);
		
		return res;
	}
	
	/**
	 * Truncates the decimals of the components of the vector {@code (v)} and saves the result in
	 * the extraction parameter.
	 * 
	 * @param v
	 *     The vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] trunc(Tup2fR v, @ExtractionParam @MinLength(2) float[] res)
	{
		return trunc(v.v0(), v.v1(), res);
	}
	
	/**
	 * Truncates the decimals of the components of the vector {@code (v[0], v[1])} and saves the
	 * result in the extraction parameter.
	 * 
	 * @param v
	 *     The vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] trunc(@MinLength(2) float[] v, @ExtractionParam @MinLength(2) float[] res)
	{
		return trunc(v[0], v[1], res);
	}
	
	/**
	 * Truncates the decimals of the components of the vector {@code (x, y)} and saves the result in
	 * the extraction parameter.
	 * 
	 * @param x
	 *     The value of the x component of the vector.
	 * @param y
	 *     The value of the y component of the vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] trunc(float x, float y, @ExtractionParam @MinLength(2) float[] res)
	{
		res[0] = (int)x;
		res[1] = (int)y;
		
		return res;
	}
	
	/**
	 * Truncates the decimals of the vector {@code (v)}, supplies the result to the given
	 * implementation of the functional interface and returns the result of that implementation.
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v
	 *     The vector.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T truncFunc(Tup2fR v, FloatBiFunction<T> res)
	{
		return truncFunc(v.v0(), v.v1(), res);
	}
	
	/**
	 * Truncates the decimals of the components of the vector {@code (v[0], v[1])}, supplies the
	 * result to the given implementation of the functional interface and returns the result of that
	 * implementation.
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v
	 *     The vector as an array with at least two entries.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T truncFunc(@MinLength(2) float[] v, FloatBiFunction<T> res)
	{
		return truncFunc(v[0], v[1], res);
	}
	
	/**
	 * Truncates the decimals of the components of the vector {@code (x, y)}, supplies the result to
	 * the given implementation of the functional interface and returns the result of that
	 * implementation.
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param x
	 *     The value of the x component of the vector.
	 * @param y
	 *     The value of the y component of the vector.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T truncFunc(float x, float y, FloatBiFunction<T> res)
	{
		return res.apply((int)x, (int)y);
	}
	
	/**
	 * Rounds the components of the vector {@code (v)} using the given method and saves the result
	 * in the given extraction parameter object.
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v
	 *     The vector.
	 * @param method
	 *     The Method to use for rounding.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T round(Tup2fR v, FloatRoundMethod method, @ExtractionParam T res)
	{
		return round(v.v0(), v.v1(), res);
	}
	
	/**
	 * Rounds the components of the vector {@code (v[0], v[1])} using the given method and saves the
	 * result in the given extraction parameter object.
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v
	 *     The vector as an array with at least two entries.
	 * @param method
	 *     The Method to use for rounding.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T round(@MinLength(2) float[] v, FloatRoundMethod method, @ExtractionParam T res)
	{
		return round(v[0], v[1], res);
	}
	
	/**
	 * Rounds the components of the vector {@code (x, y)} using the given method and saves the
	 * result in the given extraction parameter object.
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param x
	 *     The value of the x component of the vector.
	 * @param y
	 *     The value of the y component of the vector.
	 * @param method
	 *     The Method to use for rounding.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T round(float x, float y, FloatRoundMethod method, @ExtractionParam T res)
	{
		res.set(method.round(x), method.round(y));
		
		return res;
	}
	
	/**
	 * Rounds the components of the vector {@code (v)} using the given method and saves the result
	 * in the extraction parameter.
	 * 
	 * @param v
	 *     The vector.
	 * @param method
	 *     The Method to use for rounding.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] round(Tup2fR v, FloatRoundMethod method, @ExtractionParam @MinLength(2) float[] res)
	{
		return round(v.v0(), v.v1(), res);
	}
	
	/**
	 * Rounds the components of the vector {@code (v[0], v[1])} using the given method and saves the
	 * result in the extraction parameter.
	 * 
	 * @param v
	 *     The vector as an array with at least two entries.
	 * @param method
	 *     The Method to use for rounding.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] round(@MinLength(2) float[] v, FloatRoundMethod method,
			@ExtractionParam @MinLength(2) float[] res)
	{
		return round(v[0], v[1], res);
	}
	
	/**
	 * Rounds the components of the vector {@code (x, y)} using the given method and saves the
	 * result in the extraction parameter.
	 * 
	 * @param x
	 *     The value of the x component of the vector.
	 * @param y
	 *     The value of the y component of the vector.
	 * @param method
	 *     The Method to use for rounding.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] round(float x, float y, FloatRoundMethod method, @ExtractionParam @MinLength(2) float[] res)
	{
		res[0] = method.round(x);
		res[1] = method.round(y);
		
		return res;
	}
	
	/**
	 * Rounds the components of the vector {@code (v)} using the given method, supplies the result
	 * to the given implementation of the functional interface and returns the result of that
	 * implementation.
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v
	 *     The vector.
	 * @param method
	 *     The Method to use for rounding.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T roundFunc(Tup2fR v, FloatRoundMethod method, FloatBiFunction<T> res)
	{
		return roundFunc(v.v0(), v.v1(), res);
	}
	
	/**
	 * Rounds the components of the vector {@code (v[0], v[1])} using the given method, supplies the
	 * result to the given implementation of the functional interface and returns the result of that
	 * implementation.
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v
	 *     The vector as an array with at least two entries.
	 * @param method
	 *     The Method to use for rounding.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T roundFunc(@MinLength(2) float[] v, FloatRoundMethod method, FloatBiFunction<T> res)
	{
		return roundFunc(v[0], v[1], res);
	}
	
	/**
	 * Rounds the components of the vector {@code (x, y)} using the given method, supplies the
	 * result to the given implementation of the functional interface and returns the result of that
	 * implementation.
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param x
	 *     The value of the x component of the vector.
	 * @param y
	 *     The value of the y component of the vector.
	 * @param method
	 *     The Method to use for rounding.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T roundFunc(float x, float y, FloatRoundMethod method, FloatBiFunction<T> res)
	{
		return res.apply(method.round(x), method.round(y));
	}
	
	/**
	 * Calculates the absolute value of the component values of the vector {@code (v)} and saves the
	 * result in the extraction parameter.
	 * 
	 * @param v
	 *     The vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] abs(Tup2fR v, @ExtractionParam @MinLength(2) float[] res)
	{
		return abs(v.v0(), v.v1(), res);
	}
	
	/**
	 * Calculates the absolute value of the component values of the vector {@code (v[0], v[1])} and
	 * saves the result in the extraction parameter.
	 * 
	 * @param v
	 *     The vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] abs(@MinLength(2) float[] v, @ExtractionParam @MinLength(2) float[] res)
	{
		return abs(v[0], v[1], res);
	}
	
	/**
	 * Calculates the absolute value of the component values of the vector {@code (x, y)} and saves
	 * the result in the extraction parameter.
	 * 
	 * @param x
	 *     The value of the x component of the vector.
	 * @param y
	 *     The value of the y component of the vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] abs(float x, float y, @ExtractionParam @MinLength(2) float[] res)
	{
		res[0] = Math.abs(x);
		res[1] = Math.abs(y);
		
		return res;
	}
	
	/**
	 * Calculates the absolute value of the component values of the vector {@code (v)} and saves the
	 * result in the given extraction parameter object.
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v
	 *     The vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T abs(Tup2fR v, @ExtractionParam T res)
	{
		return abs(v.v0(), v.v1(), res);
	}
	
	/**
	 * Calculates the absolute value of the component values of the vector {@code (v[0], v[1])} and
	 * saves the result in the given extraction parameter object.
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v
	 *     The vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T abs(@MinLength(2) float[] v, @ExtractionParam T res)
	{
		return abs(v[0], v[1], res);
	}
	
	/**
	 * Calculates the absolute value of the component values of the vector {@code (x, y)} and saves
	 * the result in the given extraction parameter object.
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param x
	 *     The value of the x component of the vector.
	 * @param y
	 *     The value of the y component of the vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T abs(float x, float y, @ExtractionParam T res)
	{
		res.set(Math.abs(x), Math.abs(y));
		
		return res;
	}
	
	/**
	 * Calculates the absolute value of the component values of the vector {@code (v)}, supplies the
	 * result to the given implementation of the functional interface and returns the result of that
	 * implementation.
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v
	 *     The vector.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T absFunc(Tup2fR v, FloatBiFunction<T> res)
	{
		return absFunc(v.v0(), v.v1(), res);
	}
	
	/**
	 * Calculates the absolute value of the component values of the vector {@code (v[0], v[1])},
	 * supplies the result to the given implementation of the functional interface and returns the
	 * result of that implementation.
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v
	 *     The vector as an array with at least two entries.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T absFunc(@MinLength(2) float[] v, FloatBiFunction<T> res)
	{
		return absFunc(v[0], v[1], res);
	}
	
	/**
	 * Calculates the absolute value of the component values of the vector {@code (x, y)}, supplies
	 * the result to the given implementation of the functional interface and returns the result of
	 * that implementation.
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param x
	 *     The value of the x component of the vector.
	 * @param y
	 *     The value of the y component of the vector.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T absFunc(float x, float y, FloatBiFunction<T> res)
	{
		return res.apply(Math.abs(x), Math.abs(y));
	}
	
	/**
	 * Calculates the {@link Math#signum(float) signum} of the components of the given vector
	 * {@code (v)} and saves the result in the extraction parameter.
	 * 
	 * @param v
	 *     The vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] signum(Tup2fR v, @ExtractionParam @MinLength(2) float[] res)
	{
		return signum(v.v0(), v.v1(), res);
	}
	
	/**
	 * Calculates the {@link Math#signum(float) signum} of the components of the given vector
	 * {@code (v[0], v[1])} and saves the result in the extraction parameter.
	 * 
	 * @param v
	 *     The vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] signum(@MinLength(2) float[] v, @ExtractionParam @MinLength(2) float[] res)
	{
		return signum(v[0], v[1], res);
	}
	
	/**
	 * Calculates the {@link Math#signum(float) signum} of the components of the given vector
	 * {@code (x, y)} and saves the result in the extraction parameter.
	 * 
	 * @param x
	 *     The value of the x component of the vector.
	 * @param y
	 *     The value of the y component of the vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] signum(float x, float y, @ExtractionParam @MinLength(2) float[] res)
	{
		res[0] = Math.signum(x);
		res[1] = Math.signum(y);
		
		return res;
	}
	
	/**
	 * Calculates the {@link Math#signum(float) signum} of the components of the given vector
	 * {@code (v)} and saves the result in the given extraction parameter object.
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v
	 *     The vector as an array with at leasts two entries.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T signum(Tup2fR v, @ExtractionParam T res)
	{
		return signum(v.v0(), v.v1(), res);
	}
	
	/**
	 * Calculates the {@link Math#signum(float) signum} of the components of the given vector
	 * {@code (v[0], v[1])} and saves the result in the given extraction parameter object.
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v
	 *     The vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T signum(@MinLength(2) float[] v, @ExtractionParam T res)
	{
		return signum(v[0], v[1], res);
	}
	
	/**
	 * Calculates the {@link Math#signum(float) signum} of the components of the given vector
	 * {@code (x, y)} and saves the result in the given extraction parameter object.
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param x
	 *     The value of the x component of the vector.
	 * @param y
	 *     The value of the y component of the vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2fC> T signum(float x, float y, @ExtractionParam T res)
	{
		res.set(Math.signum(x), Math.signum(y));
		
		return res;
	}
	
	/**
	 * Calculates the {@link Math#signum(float) signum} of the components of the given vector
	 * {@code (v)}, supplies the result to the given implementation of the functional interface and
	 * returns the result of that implementation.
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v
	 *     The vector.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T> T signumFunc(Tup2fR v, FloatBiFunction<T> res)
	{
		return signumFunc(v.v0(), v.v1(), res);
	}
	
	/**
	 * Calculates the {@link Math#signum(float) signum} of the components of the given vector
	 * {@code (v[0], v[1])}, supplies the result to the given implementation of the functional
	 * interface and returns the result of that implementation.
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v
	 *     The vector as an array with at least two entries.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T signumFunc(@MinLength(2) float[] v, FloatBiFunction<T> res)
	{
		return signumFunc(v[0], v[1], res);
	}
	
	/**
	 * Calculates the {@link Math#signum(float) signum} of the components of the given vector
	 * {@code (x, y)}, supplies the result to the given implementation of the functional interface
	 * and returns the result of that implementation.
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param x
	 *     The value of the x component of the vector.
	 * @param y
	 *     The value of the y component of the vector.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T signumFunc(float x, float y, FloatBiFunction<T> res)
	{
		return res.apply(Math.signum(x), Math.signum(y));
	}
}
