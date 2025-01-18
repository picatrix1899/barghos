//package org.barghos.util.tuple.floats;
//
//import org.barghos.annotation.ExtractionParam;
//import org.barghos.annotation.MinLength;
//import org.barghos.annotation.Nullable;
//import org.barghos.util.collection.IndexValuePairF;
//import org.barghos.util.function.floats.Function2F;
//import org.barghos.util.math.MathProvider;
//import org.barghos.util.math.MathUtils;
//import org.barghos.util.math.RoundMethodF;
//import org.barghos.validation.exception.IndexOutOfRangeException;
//
//public class TupUtils2F extends TupUtilsF
//{
//
//	/**
//	 * Adds each component value of the second vector {@code v2} to the value of
//	 * the same component of the first vector {@code v1} and saves the result in
//	 * the given extraction parameter {@code res}.
//	 * 
//	 * <p>
//	 * The result array of the extraction parameter is required to have at least
//	 * two entries. Only the values at the indices 0 and 1 are set, the rest is
//	 * left as it is.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code res = v1 + v2}<br>
//	 * <br>
//	 * {@code res[0] = (v1.x + v2.x)}<br>
//	 * {@code res[1] = (v1.y + v2.y)}
//	 * 
//	 * @param v1 The first vector.
//	 * @param v2 The second vector.
//	 * @param res The extraction parameter containing the result array.
//	 * 
//	 * @return The result array from the extraction parameter with the result.
//	 */
//	public static float[] add(Tup2RF v1, Tup2RF v2, @ExtractionParam float[] res)
//	{
//		return add(v1.v0(), v1.v1(), v2.v0(), v2.v1(), res);
//	}
//
//	/**
//	 * Adds each component value of the second vector {@code (v2[0], v2[1])} to
//	 * the value of the same component of the first vector {@code v1} and saves
//	 * the result in the given extraction parameter {@code res}.
//	 * 
//	 * <p>
//	 * The array {@code v2} representing a 2-dimensional vector is required
//	 * to have at least two entries. Only the values at the indices 0 and 1 are
//	 * used.
//	 * 
//	 * <p>
//	 * The result array of the extraction parameter is required to have at least
//	 * two entries. Only the values at the indices 0 and 1 are set, the rest is
//	 * left as it is.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code res = v1 + (v2[0], v2[1])}<br>
//	 * <br>
//	 * {@code res[0] = (v1.x + v2[0])}<br>
//	 * {@code res[1] = (v1.y + v2[1])}
//	 * 
//	 * @param v1 The first vector.
//	 * @param v2 The second vector as an array.
//	 * @param res The extraction parameter containing the result array.
//	 * 
//	 * @return The result array from the extraction parameter with the result.
//	 */
//	public static float[] add(Tup2RF v1, float[] v2, @ExtractionParam float[] res)
//	{
//		return add(v1.v0(), v1.v1(), v2[0], v2[1], res);
//	}
//
//	/**
//	 * Adds each component value of the second vector {@code (v2x, v2y)} to
//	 * the value of the same component of the first vector {@code v1} and saves
//	 * the result in the given extraction parameter {@code res}.
//	 * 
//	 * <p>
//	 * The result array of the extraction parameter is required to have at least
//	 * two entries. Only the values at the indices 0 and 1 are set, the rest is
//	 * left as it is.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code res = v1 + (v2x, v2y)}<br>
//	 * <br>
//	 * {@code res[0] = (v1.x + v2x)}<br>
//	 * {@code res[1] = (v1.y + v2y)}
//	 * 
//	 * @param v1 The first vector.
//	 * @param v2x The x component of the second vector.
//	 * @param v2y The y component of the second vector.
//	 * @param res The extraction parameter containing the result array.
//	 * 
//	 * @return The result array from the extraction parameter with the result.
//	 */
//	public static float[] add(Tup2RF v1, float v2x, float v2y, @ExtractionParam float[] res)
//	{
//		return add(v1.v0(), v1.v1(), v2x, v2y, res);
//	}
//
//	/**
//	 * Adds each component value of the second vector {@code v2} to
//	 * the value of the same component of the first vector
//	 * {@code (v1[0], v1[1])} and saves the result in the given extraction
//	 * parameter {@code res}.
//	 * 
//	 * <p>
//	 * The array {@code v1} representing a 2-dimensional vector is required
//	 * to have at least two entries. Only the values at the indices 0 and 1 are
//	 * used.
//	 * 
//	 * <p>
//	 * The result array of the extraction parameter is required to have at least
//	 * two entries. Only the values at the indices 0 and 1 are set, the rest is
//	 * left as it is.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code res = (v1[0], v1[1]) + v2}<br>
//	 * <br>
//	 * {@code res[0] = (v1[0] + v2.x)}<br>
//	 * {@code res[1] = (v1[1] + v2.y)}
//	 * 
//	 * @param v1 The first vector as an array.
//	 * @param v2 The second vector.
//	 * @param res The extraction parameter containing the result array.
//	 * 
//	 * @return The result array from the extraction parameter with the result.
//	 */
//	public static float[] add(float[] v1, Tup2RF v2, @ExtractionParam float[] res)
//	{
//		return add(v1[0], v1[1], v2.v0(), v2.v1(), res);
//	}
//
//	/**
//	 * Adds each component value of the second vector {@code (v2[0], v2[1])} to
//	 * the value of the same component of the first vector
//	 * {@code (v1[0], v1[1])} and saves the result in the given extraction
//	 * parameter {@code res}.
//	 * 
//	 * <p>
//	 * The arrays {@code v1} and {@code v2} representing 2-dimensional vectors
//	 * are required to have at least two entries. Only the values at the indices
//	 * 0 and 1 are used.
//	 * 
//	 * <p>
//	 * The result array of the extraction parameter is required to have at least
//	 * two entries. Only the values at the indices 0 and 1 are set, the rest is
//	 * left as it is.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code res = (v1[0], v1[1]) + (v2[0], v2[1])}<br>
//	 * <br>
//	 * {@code res[0] = (v1[0] + v2[0])}<br>
//	 * {@code res[1] = (v1[1] + v2[1])}
//	 * 
//	 * @param v1 The first vector as an array.
//	 * @param v2 The second vector as an array.
//	 * @param res The extraction parameter containing the result array.
//	 * 
//	 * @return The result array from the extraction parameter with the result.
//	 */
//	public static float[] add(float[] v1, float[] v2, @ExtractionParam float[] res)
//	{
//		return add(v1[0], v1[1], v2[0], v2[1], res);
//	}
//
//	/**
//	 * Adds the second vector {@code (v2x, v2y)} to the first vector {@code (v1[0], v1[1])} and
//	 * saves the result in the given extraction parameter.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v1[0], v1[1]) + (v2x, v2y)}
//	 * 
//	 * @param v1
//	 *     The first vector as an array with at least two entries.
//	 * @param v2x
//	 *     The value of the x component of the second vector.
//	 * @param v2y
//	 *     The value of the y component of the second vector.
//	 * @param res
//	 *     The extraction parameter for the result as an array with at least two entries.
//	 * 
//	 * @return The extraction parameter with the result.
//	 */
//	public static float[] add(float[] v1, float v2x, float v2y, @ExtractionParam float[] res)
//	{
//		return add(v1[0], v1[1], v2x, v2y, res);
//	}
//
//	/**
//	 * Adds the second vector {@code (v2)} to the first vector {@code (v1x, v1y)} and saves the
//	 * result in the given extraction parameter.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v1x, v1y) + v2}
//	 * 
//	 * @param v1x
//	 *     The value of the x component of the first vector.
//	 * @param v1y
//	 *     The value of the y component of the first vector.
//	 * @param v2
//	 *     The second vector.
//	 * @param res
//	 *     The extraction parameter for the result as an array with at least two entries.
//	 * 
//	 * @return The extraction parameter with the result.
//	 */
//	public static float[] add(float v1x, float v1y, Tup2RF v2, @ExtractionParam float[] res)
//	{
//		return add(v1x, v1y, v2.v0(), v2.v1(), res);
//	}
//
//	/**
//	 * Adds the second vector {@code (v2[0], v2[1])} to the first vector {@code (v1x, v1y)} and
//	 * saves the result in the given extraction parameter.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v1x, v1y) + (v2[0], v2[1])}
//	 * 
//	 * @param v1x
//	 *     The value of the x component of the first vector.
//	 * @param v1y
//	 *     The value of the y component of the first vector.
//	 * @param v2
//	 *     The second vector as an array with at least two entries.
//	 * @param res
//	 *     The extraction parameter for the result as an array with at least two entries.
//	 * 
//	 * @return The extraction parameter with the result.
//	 */
//	public static float[] add(float v1x, float v1y, float[] v2, @ExtractionParam float[] res)
//	{
//		return add(v1x, v1y, v2[0], v2[1], res);
//	}
//
//	/**
//	 * Adds the second vector {@code (v2x, v2y)} to the first vector {@code (v1x, v1y)} and saves
//	 * the result in the given extraction parameter.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v1x, v1y) + (v2x, v2y)}
//	 * 
//	 * @param v1x
//	 *     The value of the x component of the first vector.
//	 * @param v1y
//	 *     The value of the y component of the first vector.
//	 * @param v2x
//	 *     The value of the x component of the second vector.
//	 * @param v2y
//	 *     The value of the y component of the second vector.
//	 * @param res
//	 *     The extraction parameter for the result as an array with at least two entries.
//	 * 
//	 * @return The extraction parameter with the result.
//	 */
//	public static float[] add(float v1x, float v1y, float v2x, float v2y, @ExtractionParam float[] res)
//	{
//		res[0] = v1x + v2x;
//		res[1] = v1y + v2y;
//		
//		return res;
//	}
//
//	/**
//	 * Adds the second vector {@code (v2)} to the first vector {@code (v1)} and saves the result in
//	 * the given extraction parameter object.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code v1 + v2}
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param v1
//	 *     The first vector.
//	 * @param v2
//	 *     The second vector.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T extends Tup2WF> T add(Tup2RF v1, Tup2RF v2, @ExtractionParam T res)
//	{
//		return add(v1.v0(), v1.v1(), v2.v0(), v2.v1(), res);
//	}
//
//	/**
//	 * Adds the second vector {@code (v2[0], v2[1])} to the first vector {@code (v1)} and saves the
//	 * result in the given extraction parameter object.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code v1 + (v2[0], v2[1])}
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param v1
//	 *     The first vector.
//	 * @param v2
//	 *     The second vector as an array with at least two entries.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T extends Tup2WF> T add(Tup2RF v1, float[] v2, @ExtractionParam T res)
//	{
//		return add(v1.v0(), v1.v1(), v2[0], v2[1], res);
//	}
//
//	/**
//	 * Adds the second vector {@code (v2x, v2y)} to the first vector {@code (v1)} and saves the
//	 * result in the given extraction parameter object.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code v1 + (v2x, v2y)}
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param v1
//	 *     The first vector.
//	 * @param v2x
//	 *     The value of the x component of the second vector.
//	 * @param v2y
//	 *     The value of the y component of the second vector.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T extends Tup2WF> T add(Tup2RF v1, float v2x, float v2y, @ExtractionParam T res)
//	{
//		return add(v1.v0(), v1.v1(), v2x, v2y, res);
//	}
//
//	/**
//	 * Adds the second vector {@code (v2)} to the first vector {@code (v1[0], v1[1])} and saves the
//	 * result in the given extraction parameter object.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v1[0], v1[1]) + v2}
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param v1
//	 *     The first vector as an array with at least two entries.
//	 * @param v2
//	 *     The second vector.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T extends Tup2WF> T add(float[] v1, Tup2RF v2, @ExtractionParam T res)
//	{
//		return add(v1[0], v1[1], v2.v0(), v2.v1(), res);
//	}
//
//	/**
//	 * Adds the second vector {@code (v2[0], v2[1])} to the first vector {@code (v1[0], v1[1])} and
//	 * saves the result in the given extraction parameter object.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v1[0], v1[1]) + (v2[0], v2[1])}
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param v1
//	 *     The first vector as an array with at least two entries.
//	 * @param v2
//	 *     The second vector as an array with at least two entries.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T extends Tup2WF> T add(float[] v1, float[] v2, @ExtractionParam T res)
//	{
//		return add(v1[0], v1[1], v2[0], v2[1], res);
//	}
//
//	/**
//	 * Adds the second vector {@code (v2x, v2y)} to the first vector {@code (v1[0], v1[1])} and
//	 * saves the result in the given extraction parameter object.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v1[0], v1[1]) + (v2x, v2y)}
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param v1
//	 *     The first vector as an array with at least two entries.
//	 * @param v2x
//	 *     The value of the x component of the second vector.
//	 * @param v2y
//	 *     The value of the y component of the second vector.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T extends Tup2WF> T add(float[] v1, float v2x, float v2y, @ExtractionParam T res)
//	{
//		return add(v1[0], v1[1], v2x, v2y, res);
//	}
//
//	/**
//	 * Adds the second vector {@code (v2)} to the first vector {@code (v1x, v1y)} and saves the
//	 * result in the given extraction parameter object.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v1x, v1y) + v2}
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param v1x
//	 *     The value of the x component of the first vector.
//	 * @param v1y
//	 *     The value of the y component of the first vector.
//	 * @param v2
//	 *     The second vector.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T extends Tup2WF> T add(float v1x, float v1y, Tup2RF v2, @ExtractionParam T res)
//	{
//		return add(v1x, v1y, v2.v0(), v2.v1(), res);
//	}
//
//	/**
//	 * Adds the second vector {@code (v2[0], v2[1])} to the first vector {@code (v1x, v1y)} and
//	 * saves the result in the given extraction parameter object.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v1x, v1y) + (v2[0], v2[1])}
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param v1x
//	 *     The value of the x component of the first vector.
//	 * @param v1y
//	 *     The value of the y component of the first vector.
//	 * @param v2
//	 *     The second vector as an array with at least two entries.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T extends Tup2WF> T add(float v1x, float v1y, float[] v2, @ExtractionParam T res)
//	{
//		return add(v1x, v1y, v2[0], v2[1], res);
//	}
//
//	/**
//	 * Adds the second vector {@code (v2x, v2y)} to the first vector {@code (v1x, v1y)} and saves
//	 * the result in the given extraction parameter object.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v1x, v1y) + (v2x, v2y)}
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param v1x
//	 *     The value of the x component of the first vector.
//	 * @param v1y
//	 *     The value of the y component of the first vector.
//	 * @param v2x
//	 *     The value of the x component of the second vector.
//	 * @param v2y
//	 *     The value of the y component of the second vector.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T extends Tup2WF> T add(float v1x, float v1y, float v2x, float v2y, @ExtractionParam T res)
//	{
//		res.set(v1x + v2x, v1y + v2y);
//		
//		return res;
//	}
//
//	/**
//	 * Adds the second vector {@code (v2)} to the first vector {@code (v1)} and saves the result in
//	 * the given extraction parameter object.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code v1 + v2}
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param v1
//	 *     The first vector.
//	 * @param v2
//	 *     The second vector.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T> T addFunc(Tup2RF v1, Tup2RF v2, Function2F<T> func)
//	{
//		return addFunc(v1.v0(), v1.v1(), v2.v0(), v2.v1(), func);
//	}
//
//	/**
//	 * Adds the second vector {@code (v2[0], v2[1])} to the first vector {@code (v1)} and saves the
//	 * result in the given extraction parameter object.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code v1 + (v2[0], v2[1])}
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param v1
//	 *     The first vector.
//	 * @param v2
//	 *     The second vector as an array with at least two entries.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T> T addFunc(Tup2RF v1, float[] v2, Function2F<T> func)
//	{
//		return addFunc(v1.v0(), v1.v1(), v2[0], v2[1], func);
//	}
//
//	/**
//	 * Adds the second vector {@code (v2x, v2y)} to the first vector {@code (v1)} and saves the
//	 * result in the given extraction parameter object.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code v1 + (v2x, v2y)}
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param v1
//	 *     The first vector.
//	 * @param v2x
//	 *     The value of the x component of the second vector.
//	 * @param v2y
//	 *     The value of the y component of the second vector.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T> T addFunc(Tup2RF v1, float v2x, float v2y, Function2F<T> func)
//	{
//		return addFunc(v1.v0(), v1.v1(), v2x, v2y, func);
//	}
//
//	/**
//	 * Adds the second vector {@code (v2)} to the first vector {@code (v1[0], v1[1])} and saves the
//	 * result in the given extraction parameter object.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v1[0], v1[1]) + v2}
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param v1
//	 *     The first vector as an array with at least two entries.
//	 * @param v2
//	 *     The second vector.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T> T addFunc(float[] v1, Tup2RF v2, Function2F<T> func)
//	{
//		return addFunc(v1[0], v1[1], v2.v0(), v2.v1(), func);
//	}
//
//	/**
//	 * Adds the second vector {@code (v2[0], v2[1])} to the first vector {@code (v1[0], v1[1])} and
//	 * saves the result in the given extraction parameter object.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v1[0], v1[1]) + (v2[0], v2[1])}
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param v1
//	 *     The first vector as an array with at least two entries.
//	 * @param v2
//	 *     The second vector as an array with at least two entries.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T> T addFunc(float[] v1, float[] v2, Function2F<T> func)
//	{
//		return addFunc(v1[0], v1[1], v2[0], v2[1], func);
//	}
//
//	/**
//	 * Adds the second vector {@code (v2x, v2y)} to the first vector {@code (v1[0], v1[1])} and
//	 * saves the result in the given extraction parameter object.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v1[0], v1[1]) + (v2x, v2y)}
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param v1
//	 *     The first vector as an array with at least two entries.
//	 * @param v2x
//	 *     The value of the x component of the second vector.
//	 * @param v2y
//	 *     The value of the y component of the second vector.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T> T addFunc(float[] v1, float v2x, float v2y, Function2F<T> func)
//	{
//		return addFunc(v1[0], v1[1], v2x, v2y, func);
//	}
//
//	/**
//	 * Adds the second vector {@code (v2)} to the first vector {@code (v1x, v1y)} and saves the
//	 * result in the given extraction parameter object.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v1x, v1y) + v2}
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param v1x
//	 *     The value of the x component of the first vector.
//	 * @param v1y
//	 *     The value of the y component of the first vector.
//	 * @param v2
//	 *     The second vector.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T> T addFunc(float v1x, float v1y, Tup2RF v2, Function2F<T> func)
//	{
//		return addFunc(v1x, v1y, v2.v0(), v2.v1(), func);
//	}
//
//	/**
//	 * Adds the second vector {@code (v2[0], v2[1])} to the first vector {@code (v1x, v1y)} and
//	 * saves the result in the given extraction parameter object.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v1x, v1y) + (v2[0], v2[1])}
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param v1x
//	 *     The value of the x component of the first vector.
//	 * @param v1y
//	 *     The value of the y component of the first vector.
//	 * @param v2
//	 *     The second vector as an array with at least two entries.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T> T addFunc(float v1x, float v1y, float[] v2, Function2F<T> func)
//	{
//		return addFunc(v1x, v1y, v2[0], v2[1], func);
//	}
//
//	/**
//	 * Adds the second vector {@code (v2x, v2y)} to the first vector {@code (v1x, v1y)} and saves
//	 * the result in the given extraction parameter object.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v1x, v1y) + (v2x, v2y)}
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param v1x
//	 *     The value of the x component of the first vector.
//	 * @param v1y
//	 *     The value of the y component of the first vector.
//	 * @param v2x
//	 *     The value of the x component of the second vector.
//	 * @param v2y
//	 *     The value of the y component of the second vector.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T> T addFunc(float v1x, float v1y, float v2x, float v2y, Function2F<T> func)
//	{
//		return func.apply2F(v1x + v2x, v1y + v2y);
//	}
//	
//	/**
//	 * Subtracts the second vector {@code (v2)} from the first vector {@code (v1)} and saves the
//	 * result in the given extraction parameter.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code v1 - v2}
//	 * 
//	 * @param v1
//	 *     The first vector.
//	 * @param v2
//	 *     The second vector.
//	 * @param res
//	 *     The extraction parameter for the result as an array with at least two entries.
//	 * 
//	 * @return The extraction parameter with the result.
//	 */
//	public static float[] sub(Tup2RF v1, Tup2RF v2, @ExtractionParam float[] res)
//	{
//		return sub(v1.v0(), v1.v1(), v2.v0(), v2.v1(), res);
//	}
//
//	/**
//	 * Subtracts the second vector {@code (v2[0], v2[1])} from the first vector {@code (v1)} and
//	 * saves the result in the given extraction parameter.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code v1 - (v2x, v2y)}
//	 * 
//	 * @param v1
//	 *     The first vector.
//	 * @param v2
//	 *     The second vector as an array with at least two entries.
//	 * @param res
//	 *     The extraction parameter for the result as an array with at least two entries.
//	 * 
//	 * @return The extraction parameter with the result.
//	 */
//	public static float[] sub(Tup2RF v1, float[] v2, @ExtractionParam float[] res)
//	{
//		return sub(v1.v0(), v1.v1(), v2[0], v2[1], res);
//	}
//
//	/**
//	 * Subtracts the second vector {@code (v2x, v2y)} from the first vector {@code (v1)} and saves
//	 * the result in the given extraction parameter.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code v1 - (v2x, v2y)}
//	 * 
//	 * @param v1
//	 *     The first vector.
//	 * @param v2x
//	 *     The value of the x component of the second vector.
//	 * @param v2y
//	 *     The value of the y component of the second vector.
//	 * @param res
//	 *     The extraction parameter for the result as an array with at least two entries.
//	 * 
//	 * @return The extraction parameter with the result.
//	 */
//	public static float[] sub(Tup2RF v1, float v2x, float v2y, @ExtractionParam float[] res)
//	{
//		return sub(v1.v0(), v1.v1(), v2x, v2y, res);
//	}
//
//	/**
//	 * Subtracts the second vector {@code (v2)} from the first vector {@code (v1[0], v1[1])} and
//	 * saves the result in the given extraction parameter.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v1[0], v1[1]) - v2}
//	 * 
//	 * @param v1
//	 *     The first vector as an array with at least two entries.
//	 * @param v2
//	 *     The second vector.
//	 * @param res
//	 *     The extraction parameter for the result as an array with at least two entries.
//	 * 
//	 * @return The extraction parameter with the result.
//	 */
//	public static float[] sub(float[] v1, Tup2RF v2, @ExtractionParam float[] res)
//	{
//		return sub(v1[0], v1[1], v2.v0(), v2.v1(), res);
//	}
//
//	/**
//	 * Subtracts the second vector {@code (v2[0], v2[1])} from the first vector
//	 * {@code (v1[0], v1[1])} and saves the result in the given extraction parameter.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v1[0], v1[1]) - (v2[0], v2[1])}
//	 * 
//	 * @param v1
//	 *     The first vector as an array with at least two entries.
//	 * @param v2
//	 *     The second vector as an array with at least two entries.
//	 * @param res
//	 *     The extraction parameter for the result as an array with at least two entries.
//	 * 
//	 * @return The extraction parameter with the result.
//	 */
//	public static float[] sub(float[] v1, float[] v2, @ExtractionParam float[] res)
//	{
//		return sub(v1[0], v1[1], v2[0], v2[1], res);
//	}
//
//	/**
//	 * Subtracts the second vector {@code (v2x, v2y)} from the first vector {@code (v1[0], v1[1])}
//	 * and saves the result in the given extraction parameter.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v1[0], v1[1]) - (v2x, v2y)}
//	 * 
//	 * @param v1
//	 *     The first vector as an array with at least two entries.
//	 * @param v2x
//	 *     The value of the x component of the second vector.
//	 * @param v2y
//	 *     The value of the y component of the second vector.
//	 * @param res
//	 *     The extraction parameter for the result as an array with at least two entries.
//	 * 
//	 * @return The extraction parameter with the result.
//	 */
//	public static float[] sub(float[] v1, float v2x, float v2y, @ExtractionParam float[] res)
//	{
//		return sub(v1[0], v1[1], v2x, v2y, res);
//	}
//
//	/**
//	 * Subtracts the second vector {@code (v2)} from the first vector {@code (v1x, v1y)} and saves
//	 * the result in the given extraction parameter.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v1x, v1y) - v2}
//	 * 
//	 * @param v1x
//	 *     The value of the x component of the first vector.
//	 * @param v1y
//	 *     The value of the y component of the first vector.
//	 * @param v2
//	 *     The second vector.
//	 * @param res
//	 *     The extraction parameter for the result as an array with at least two entries.
//	 * 
//	 * @return The extraction parameter with the result.
//	 */
//	public static float[] sub(float v1x, float v1y, Tup2RF v2, @ExtractionParam float[] res)
//	{
//		return sub(v1x, v1y, v2.v0(), v2.v1(), res);
//	}
//
//	/**
//	 * Subtracts the second vector {@code (v2[0], v2[1])} from the first vector {@code (v1x, v1y)}
//	 * and saves the result in the given extraction parameter.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v1x, v1y) - (v2[0], v2[1])}
//	 * 
//	 * @param v1x
//	 *     The value of the x component of the first vector.
//	 * @param v1y
//	 *     The value of the y component of the first vector.
//	 * @param v2
//	 *     The second vector as an array with at least two entries.
//	 * @param res
//	 *     The extraction parameter for the result as an array with at least two entries.
//	 * 
//	 * @return The extraction parameter with the result.
//	 */
//	public static float[] sub(float v1x, float v1y, float[] v2, @ExtractionParam float[] res)
//	{
//		return sub(v1x, v1y, v2[0], v2[1], res);
//	}
//
//	/**
//	 * Subtracts the second vector {@code (v2x, v2y)} from the first vector {@code (v1x, v1y)} and
//	 * saves the result in the given extraction parameter.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v1x, v1y) - (v2x, v2y)}
//	 * 
//	 * @param v1x
//	 *     The value of the x component of the first vector.
//	 * @param v1y
//	 *     The value of the y component of the first vector.
//	 * @param v2x
//	 *     The value of the x component of the second vector.
//	 * @param v2y
//	 *     The value of the y component of the second vector.
//	 * @param res
//	 *     The extraction parameter for the result as an array with at least two entries.
//	 * 
//	 * @return The extraction parameter with the result.
//	 */
//	public static float[] sub(float v1x, float v1y, float v2x, float v2y, @ExtractionParam float[] res)
//	{
//		res[0] = v1x - v2x;
//		res[1] = v1y - v2y;
//		
//		return res;
//	}
//
//	/**
//	 * Subtracts the second vector [@code (v2)} from the first vector {@code (v1)} and saves the
//	 * result in the given extraction parameter object.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code v1 - v2}
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param v1
//	 *     The first vector.
//	 * @param v2
//	 *     The second vector.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T extends Tup2WF> T sub(Tup2RF v1, Tup2RF v2, @ExtractionParam T res)
//	{
//		return sub(v1.v0(), v1.v1(), v2.v0(), v2.v1(), res);
//	}
//
//	/**
//	 * Subtracts the second vector [@code (v2[0], v2[1])} from the first vector {@code (v1)} and
//	 * saves the result in the given extraction parameter object.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code v1 - (v2[0], v2[1])}
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param v1
//	 *     The first vector.
//	 * @param v2
//	 *     The second vector as an array with at least two entries.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T extends Tup2WF> T sub(Tup2RF v1, float[] v2, @ExtractionParam T res)
//	{
//		return sub(v1.v0(), v1.v1(), v2[0], v2[1], res);
//	}
//
//	/**
//	 * Subtracts the second vector [@code (v2x, v2y)} from the first vector {@code (v1)} and saves
//	 * the result in the given extraction parameter object.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code v1 - (v2x, v2y)}
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param v1
//	 *     The first vector.
//	 * @param v2x
//	 *     The value of the x component of the second vector.
//	 * @param v2y
//	 *     The value of the y component of the second vector.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T extends Tup2WF> T sub(Tup2RF v1, float v2x, float v2y, @ExtractionParam T res)
//	{
//		return sub(v1.v0(), v1.v1(), v2x, v2y, res);
//	}
//
//	/**
//	 * Subtracts the second vector [@code (v2)} from the first vector {@code (v1[0], v1[1])} and
//	 * saves the result in the given extraction parameter object.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v1[0], v1[1]) - v2}
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param v1
//	 *     The first vector as an array with at least two entries.
//	 * @param v2
//	 *     The second vector.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T extends Tup2WF> T sub(float[] v1, Tup2RF v2, @ExtractionParam T res)
//	{
//		return sub(v1[0], v1[1], v2.v0(), v2.v1(), res);
//	}
//
//	/**
//	 * Subtracts the second vector [@code (v2[0], v2[1])} from the first vector
//	 * {@code (v1[0], v1[1])} and saves the result in the given extraction parameter object.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v1[0], v1[1]) - (v2[0], v2[1])}
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param v1
//	 *     The first vector as an array with at least two entries.
//	 * @param v2
//	 *     The second vector as an array with at least two entries.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T extends Tup2WF> T sub(float[] v1, float[] v2, @ExtractionParam T res)
//	{
//		return sub(v1[0], v1[1], v2[0], v2[1], res);
//	}
//
//	/**
//	 * Subtracts the second vector [@code (v2x, v2y)} from the first vector {@code (v1[0], v1[1])}
//	 * and saves the result in the given extraction parameter object.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v1[0], v1[1]) - (v2x, v2y)}
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param v1
//	 *     The first vector as an array with at least two entries.
//	 * @param v2x
//	 *     The value of the x component of the second vector.
//	 * @param v2y
//	 *     The value of the y component of the second vector.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T extends Tup2WF> T sub(float[] v1, float v2x, float v2y, @ExtractionParam T res)
//	{
//		return sub(v1[0], v1[1], v2x, v2y, res);
//	}
//
//	/**
//	 * Subtracts the second vector [@code (v2)} from the first vector {@code (v1x, v1y)} and saves
//	 * the result in the given extraction parameter object.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v1x, v1y) - v2}
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param v1x
//	 *     The value of the x component of the first vector.
//	 * @param v1y
//	 *     The value of the y component of the first vector.
//	 * @param v2
//	 *     The second vector.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T extends Tup2WF> T sub(float v1x, float v1y, Tup2RF v2, @ExtractionParam T res)
//	{
//		return sub(v1x, v1y, v2.v0(), v2.v1(), res);
//	}
//
//	/**
//	 * Subtracts the second vector [@code (v2[0], v2[1])} from the first vector {@code (v1x, v1y)}
//	 * and saves the result in the given extraction parameter object.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v1x, v1y) - (v2[0], v2[1])}
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param v1x
//	 *     The value of the x component of the first vector.
//	 * @param v1y
//	 *     The value of the y component of the first vector.
//	 * @param v2
//	 *     The second vector as an array with at least two entries.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T extends Tup2WF> T sub(float v1x, float v1y, float[] v2, @ExtractionParam T res)
//	{
//		return sub(v1x, v1y, v2[0], v2[1], res);
//	}
//
//	/**
//	 * Subtracts the second vector [@code (v2x, v2y)} from the first vector {@code (v1x, v1y)} and
//	 * saves the result in the given extraction parameter object.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v1x, v1y) - (v2x, v2y)}
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param v1x
//	 *     The value of the x component of the first vector.
//	 * @param v1y
//	 *     The value of the y component of the first vector.
//	 * @param v2x
//	 *     The value of the x component of the second vector.
//	 * @param v2y
//	 *     The value of the y component of the second vector.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T extends Tup2WF> T sub(float v1x, float v1y, float v2x, float v2y, @ExtractionParam T res)
//	{
//		res.set(v1x - v2x, v1y - v2y);
//		
//		return res;
//	}
//
//	/**
//	 * Subtracts the second vector [@code (v2)} from the first vector {@code (v1)} and saves the
//	 * result in the given extraction parameter object.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code v1 - v2}
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param v1
//	 *     The first vector.
//	 * @param v2
//	 *     The second vector.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T> T subFunc(Tup2RF v1, Tup2RF v2, Function2F<T> func)
//	{
//		return subFunc(v1.v0(), v1.v1(), v2.v0(), v2.v1(), func);
//	}
//
//	/**
//	 * Subtracts the second vector [@code (v2[0], v2[1])} from the first vector {@code (v1)} and
//	 * saves the result in the given extraction parameter object.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code v1 - (v2[0], v2[1])}
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param v1
//	 *     The first vector.
//	 * @param v2
//	 *     The second vector as an array with at least two entries.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T> T subFunc(Tup2RF v1, float[] v2, Function2F<T> func)
//	{
//		return subFunc(v1.v0(), v1.v1(), v2[0], v2[1], func);
//	}
//
//	/**
//	 * Subtracts the second vector [@code (v2x, v2y)} from the first vector {@code (v1)} and saves
//	 * the result in the given extraction parameter object.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code v1 - (v2x, v2y)}
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param v1
//	 *     The first vector.
//	 * @param v2x
//	 *     The value of the x component of the second vector.
//	 * @param v2y
//	 *     The value of the y component of the second vector.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T> T subFunc(Tup2RF v1, float v2x, float v2y, Function2F<T> func)
//	{
//		return subFunc(v1.v0(), v1.v1(), v2x, v2y, func);
//	}
//
//	/**
//	 * Subtracts the second vector [@code (v2)} from the first vector {@code (v1[0], v1[1])} and
//	 * saves the result in the given extraction parameter object.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v1[0], v1[1]) - v2}
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param v1
//	 *     The first vector as an array with at least two entries.
//	 * @param v2
//	 *     The second vector.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T> T subFunc(float[] v1, Tup2RF v2, Function2F<T> func)
//	{
//		return subFunc(v1[0], v1[1], v2.v0(), v2.v1(), func);
//	}
//
//	/**
//	 * Subtracts the second vector [@code (v2[0], v2[1])} from the first vector
//	 * {@code (v1[0], v1[1])} and saves the result in the given extraction parameter object.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v1[0], v1[1]) - (v2[0], v2[1])}
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param v1
//	 *     The first vector as an array with at least two entries.
//	 * @param v2
//	 *     The second vector as an array with at least two entries.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T> T subFunc(float[] v1, float[] v2, Function2F<T> func)
//	{
//		return subFunc(v1[0], v1[1], v2[0], v2[1], func);
//	}
//
//	/**
//	 * Subtracts the second vector [@code (v2x, v2y)} from the first vector {@code (v1[0], v1[1])}
//	 * and saves the result in the given extraction parameter object.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v1[0], v1[1]) - (v2x, v2y)}
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param v1
//	 *     The first vector as an array with at least two entries.
//	 * @param v2x
//	 *     The value of the x component of the second vector.
//	 * @param v2y
//	 *     The value of the y component of the second vector.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T> T subFunc(float[] v1, float v2x, float v2y, Function2F<T> func)
//	{
//		return subFunc(v1[0], v1[1], v2x, v2y, func);
//	}
//
//	/**
//	 * Subtracts the second vector [@code (v2)} from the first vector {@code (v1x, v1y)} and saves
//	 * the result in the given extraction parameter object.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v1x, v1y) - v2}
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param v1x
//	 *     The value of the x component of the first vector.
//	 * @param v1y
//	 *     The value of the y component of the first vector.
//	 * @param v2
//	 *     The second vector.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T> T subFunc(float v1x, float v1y, Tup2RF v2, Function2F<T> func)
//	{
//		return subFunc(v1x, v1y, v2.v0(), v2.v1(), func);
//	}
//
//	/**
//	 * Subtracts the second vector [@code (v2[0], v2[1])} from the first vector {@code (v1x, v1y)}
//	 * and saves the result in the given extraction parameter object.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v1x, v1y) - (v2[0], v2[1])}
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param v1x
//	 *     The value of the x component of the first vector.
//	 * @param v1y
//	 *     The value of the y component of the first vector.
//	 * @param v2
//	 *     The second vector as an array with at least two entries.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T> T subFunc(float v1x, float v1y, float[] v2, Function2F<T> func)
//	{
//		return subFunc(v1x, v1y, v2[0], v2[1], func);
//	}
//
//	/**
//	 * Subtracts the second vector [@code (v2x, v2y)} from the first vector {@code (v1x, v1y)} and
//	 * saves the result in the given extraction parameter object.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v1x, v1y) - (v2x, v2y)}
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param v1x
//	 *     The value of the x component of the first vector.
//	 * @param v1y
//	 *     The value of the y component of the first vector.
//	 * @param v2x
//	 *     The value of the x component of the second vector.
//	 * @param v2y
//	 *     The value of the y component of the second vector.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T> T subFunc(float v1x, float v1y, float v2x, float v2y, Function2F<T> func)
//	{
//		return func.apply2F(v1x - v2x, v1y - v2y);
//	}
//	
//	/**
//	 * Multiplies the first vector {@code (v1)} with the second vector {@code (v2)} and saves the
//	 * result in the given extraction parameter.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v1 * v2}
//	 * 
//	 * @param v1
//	 *     The first vector.
//	 * @param v2
//	 *     The second vector.
//	 * @param res
//	 *     The extraction parameter for the result as an array with at least two entries.
//	 * 
//	 * @return The extraction parameter with the result.
//	 */
//	public static float[] mul(Tup2RF v1, Tup2RF v2, @ExtractionParam float[] res)
//	{
//		return mul(v1.v0(), v1.v1(), v2.v0(), v2.v1(), res);
//	}
//
//	/**
//	 * Multiplies the first vector {@code (v1)} with the second vector {@code (v2[0], v2[1])} and
//	 * saves the result in the given extraction parameter.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v1 * (v2[0], v2[1])}
//	 * 
//	 * @param v1
//	 *     The first vector.
//	 * @param v2
//	 *     The second vector as an array with at least two entries.
//	 * @param res
//	 *     The extraction parameter for the result as an array with at least two entries.
//	 * 
//	 * @return The extraction parameter with the result.
//	 */
//	public static float[] mul(Tup2RF v1, float[] v2, @ExtractionParam float[] res)
//	{
//		return mul(v1.v0(), v1.v1(), v2[0], v2[1], res);
//	}
//
//	/**
//	 * Multiplies the first vector {@code (v1)} with the second vector {@code (v2x, v2y)} and saves
//	 * the result in the given extraction parameter.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v1 * (v2x, v2y)}
//	 * 
//	 * @param v1
//	 *     The first vector.
//	 * @param v2x
//	 *     The value of the x component of the second vector.
//	 * @param v2y
//	 *     The value of the y component of the second vector.
//	 * @param res
//	 *     The extraction parameter for the result as an array with at least two entries.
//	 * 
//	 * @return The extraction parameter with the result.
//	 */
//	public static float[] mul(Tup2RF v1, float v2x, float v2y, @ExtractionParam float[] res)
//	{
//		return mul(v1.v0(), v1.v1(), v2x, v2y, res);
//	}
//
//	/**
//	 * Multiplies the first vector {@code (v1[0], v1[1])} with the second vector {@code (v2)} and
//	 * saves the result in the given extraction parameter.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v1[0], v1[1]) * (v2x, v2y)}
//	 * 
//	 * @param v1
//	 *     The first vector as an array with at least two entries.
//	 * @param v2
//	 *     The second vector.
//	 * @param res
//	 *     The extraction parameter for the result as an array with at least two entries.
//	 * 
//	 * @return The extraction parameter with the result.
//	 */
//	public static float[] mul(float[] v1, Tup2RF v2, @ExtractionParam float[] res)
//	{
//		return mul(v1[0], v1[1], v2.v0(), v2.v1(), res);
//	}
//
//	/**
//	 * Multiplies the first vector {@code (v1[0], v1[1])} with the second vector
//	 * {@code (v2[0], v2[1])} and saves the result in the given extraction parameter.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v1[0], v1[1]) * (v2[0], v2[1])}
//	 * 
//	 * @param v1
//	 *     The first vector as an array with at least two entries.
//	 * @param v2
//	 *     The second vector as an array with at least two entries.
//	 * @param res
//	 *     The extraction parameter for the result as an array with at least two entries.
//	 * 
//	 * @return The extraction parameter with the result.
//	 */
//	public static float[] mul(float[] v1, float[] v2, @ExtractionParam float[] res)
//	{
//		return mul(v1[0], v1[1], v2[0], v2[1], res);
//	}
//
//	/**
//	 * Multiplies the first vector {@code (v1[0], v1[1])} with the second vector {@code (v2x, v2y)}
//	 * and saves the result in the given extraction parameter.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v1[0], v1[1]) * (v2x, v2y)}
//	 * 
//	 * @param v1
//	 *     The first vector as an array with at least two entries.
//	 * @param v2x
//	 *     The value of the x component of the second vector.
//	 * @param v2y
//	 *     The value of the y component of the second vector.
//	 * @param res
//	 *     The extraction parameter for the result as an array with at least two entries.
//	 * 
//	 * @return The extraction parameter with the result.
//	 */
//	public static float[] mul(float[] v1, float v2x, float v2y, @ExtractionParam float[] res)
//	{
//		return mul(v1[0], v1[1], v2x, v2y, res);
//	}
//
//	/**
//	 * Multiplies the first vector {@code (v1x, v1y)} with the second vector {@code (v2)} and saves
//	 * the result in the given extraction parameter.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v1x, v1y) * v2}
//	 * 
//	 * @param v1x
//	 *     The value of the x component of the first vector.
//	 * @param v1y
//	 *     The value of the y component of the first vector.
//	 * @param v2
//	 *     The second vector.
//	 * @param res
//	 *     The extraction parameter for the result as an array with at least two entries.
//	 * 
//	 * @return The extraction parameter with the result.
//	 */
//	public static float[] mul(float v1x, float v1y, Tup2RF v2, @ExtractionParam float[] res)
//	{
//		return mul(v1x, v1y, v2.v0(), v2.v1(), res);
//	}
//
//	/**
//	 * Multiplies the first vector {@code (v1x, v1y)} with the second vector {@code (v2[0], v2[1])}
//	 * and saves the result in the given extraction parameter.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v1x, v1y) * (v2[0], v2[1])}
//	 * 
//	 * @param v1x
//	 *     The value of the x component of the first vector.
//	 * @param v1y
//	 *     The value of the y component of the first vector.
//	 * @param v2
//	 *     The second vector as an array with at least two entries.
//	 * @param res
//	 *     The extraction parameter for the result as an array with at least two entries.
//	 * 
//	 * @return The extraction parameter with the result.
//	 */
//	public static float[] mul(float v1x, float v1y, float[] v2, @ExtractionParam float[] res)
//	{
//		return mul(v1x, v1y, v2[0], v2[1], res);
//	}
//
//	/**
//	 * Multiplies the first vector {@code (v1x, v1y)} with the second vector {@code (v2x, v2y)} and
//	 * saves the result in the given extraction parameter.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v1x, v1y) * (v2x, v2y)}
//	 * 
//	 * @param v1x
//	 *     The value of the x component of the first vector.
//	 * @param v1y
//	 *     The value of the y component of the first vector.
//	 * @param v2x
//	 *     The value of the x component of the second vector.
//	 * @param v2y
//	 *     The value of the y component of the second vector.
//	 * @param res
//	 *     The extraction parameter for the result as an array with at least two entries.
//	 * 
//	 * @return The extraction parameter with the result.
//	 */
//	public static float[] mul(float v1x, float v1y, float v2x, float v2y, @ExtractionParam float[] res)
//	{
//		res[0] = v1x * v2x;
//		res[1] = v1y * v2y;
//		
//		return res;
//	}
//
//	/**
//	 * Multiplies the first vector {@code (v1)} with the second vector {@code (v2)} and saves the
//	 * result in the given extraction parameter object.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code v1 * v2}
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param v1
//	 *     The first vector.
//	 * @param v2
//	 *     The second vector.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T extends Tup2WF> T mul(Tup2RF v1, Tup2RF v2, @ExtractionParam T res)
//	{
//		return mul(v1.v0(), v1.v1(), v2.v0(), v2.v1(), res);
//	}
//
//	/**
//	 * Multiplies the first vector {@code (v1)} with the second vector {@code (v2[0], v2[1])} and
//	 * saves the result in the given extraction parameter object.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code v1 * (v2[0], v2[1])}
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param v1
//	 *     The first vector.
//	 * @param v2
//	 *     The second vector as an array with at least two entries.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T extends Tup2WF> T mul(Tup2RF v1, float[] v2, @ExtractionParam T res)
//	{
//		return mul(v1.v0(), v1.v1(), v2[0], v2[1], res);
//	}
//
//	/**
//	 * Multiplies the first vector {@code (v1)} with the second vector {@code (v2x, v2y)} and saves
//	 * the result in the given extraction parameter object.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code v1 * (v2x, v2y)}
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param v1
//	 *     The first vector.
//	 * @param v2x
//	 *     The value of the x component of the second vector.
//	 * @param v2y
//	 *     The value of the y component of the second vector.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T extends Tup2WF> T mul(Tup2RF v1, float v2x, float v2y, @ExtractionParam T res)
//	{
//		return mul(v1.v0(), v1.v1(), v2x, v2y, res);
//	}
//
//	/**
//	 * Multiplies the first vector {@code (v1[0], v1[1])} with the second vector {@code (v2)} and
//	 * saves the result in the given extraction parameter object.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v1[0], v1[1]) * v2}
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param v1
//	 *     The first vector as an array with at least two entries.
//	 * @param v2
//	 *     The second vector.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T extends Tup2WF> T mul(float[] v1, Tup2RF v2, @ExtractionParam T res)
//	{
//		return mul(v1[0], v1[1], v2.v0(), v2.v1(), res);
//	}
//
//	/**
//	 * Multiplies the first vector {@code (v1[0], v1[1])} with the second vector
//	 * {@code (v2[0], v2[1])} and saves the result in the given extraction parameter object.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v1[0], v1[1]) * (v2[0], v2[1])}
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param v1
//	 *     The first vector as an array with at least two entries.
//	 * @param v2
//	 *     The second vector as an array with at least two entries.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T extends Tup2WF> T mul(float[] v1, float[] v2, @ExtractionParam T res)
//	{
//		return mul(v1[0], v1[1], v2[0], v2[1], res);
//	}
//
//	/**
//	 * Multiplies the first vector {@code (v1[0], v1[1])} with the second vector {@code (v2x, v2y)}
//	 * and saves the result in the given extraction parameter object.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v1[0], v1[1]) * (v2x, v2y)}
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param v1
//	 *     The first vector as an array with at least two entries.
//	 * @param v2x
//	 *     The value of the x component of the second vector.
//	 * @param v2y
//	 *     The value of the y component of the second vector.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T extends Tup2WF> T mul(float[] v1, float v2x, float v2y, @ExtractionParam T res)
//	{
//		return mul(v1[0], v1[1], v2x, v2y, res);
//	}
//
//	/**
//	 * Multiplies the first vector {@code (v1x, v1y)} with the second vector {@code (v2)} and saves
//	 * the result in the given extraction parameter object.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v1x, v1y) * v2}
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param v1x
//	 *     The value of the x component of the first vector.
//	 * @param v1y
//	 *     The value of the y component of the first vector.
//	 * @param v2
//	 *     The second vector.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T extends Tup2WF> T mul(float v1x, float v1y, Tup2RF v2, @ExtractionParam T res)
//	{
//		return mul(v1x, v1y, v2.v0(), v2.v1(), res);
//	}
//
//	/**
//	 * Multiplies the first vector {@code (v1x, v1y)} with the second vector {@code (v2[0], v2[1])}
//	 * and saves the result in the given extraction parameter object.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v1x, v1y) * (v2[0], v2[1])}
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param v1x
//	 *     The value of the x component of the first vector.
//	 * @param v1y
//	 *     The value of the y component of the first vector.
//	 * @param v2
//	 *     The second vector as an array with at least two entries.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T extends Tup2WF> T mul(float v1x, float v1y, float[] v2, @ExtractionParam T res)
//	{
//		return mul(v1x, v1y, v2[0], v2[1], res);
//	}
//
//	/**
//	 * Multiplies the first vector {@code (v1x, v1y)} with the second vector {@code (v2x, v2y)} and
//	 * saves the result in the given extraction parameter object.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v1x, v1y) * (v2x, v2y)}
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param v1x
//	 *     The value of the x component of the first vector.
//	 * @param v1y
//	 *     The value of the y component of the first vector.
//	 * @param v2x
//	 *     The value of the x component of the second vector.
//	 * @param v2y
//	 *     The value of the y component of the second vector.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T extends Tup2WF> T mul(float v1x, float v1y, float v2x, float v2y, @ExtractionParam T res)
//	{
//		res.set(v1x * v2x, v1y * v2y);
//		
//		return res;
//	}
//
//	/**
//	 * Multiplies the first vector {@code (v1)} with the second vector {@code (v2)} and saves the
//	 * result in the given extraction parameter object.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code v1 * v2}
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param v1
//	 *     The first vector.
//	 * @param v2
//	 *     The second vector.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T> T mulFunc(Tup2RF v1, Tup2RF v2, Function2F<T> func)
//	{
//		return mulFunc(v1.v0(), v1.v1(), v2.v0(), v2.v1(), func);
//	}
//
//	/**
//	 * Multiplies the first vector {@code (v1)} with the second vector {@code (v2[0], v2[1])} and
//	 * saves the result in the given extraction parameter object.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code v1 * (v2[0], v2[1])}
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param v1
//	 *     The first vector.
//	 * @param v2
//	 *     The second vector as an array with at least two entries.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T> T mulFunc(Tup2RF v1, float[] v2, Function2F<T> func)
//	{
//		return mulFunc(v1.v0(), v1.v1(), v2[0], v2[1], func);
//	}
//
//	/**
//	 * Multiplies the first vector {@code (v1)} with the second vector {@code (v2x, v2y)} and saves
//	 * the result in the given extraction parameter object.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code v1 * (v2x, v2y)}
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param v1
//	 *     The first vector.
//	 * @param v2x
//	 *     The value of the x component of the second vector.
//	 * @param v2y
//	 *     The value of the y component of the second vector.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T> T mulFunc(Tup2RF v1, float v2x, float v2y, Function2F<T> func)
//	{
//		return mulFunc(v1.v0(), v1.v1(), v2x, v2y, func);
//	}
//
//	/**
//	 * Multiplies the first vector {@code (v1[0], v1[1])} with the second vector {@code (v2)} and
//	 * saves the result in the given extraction parameter object.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v1[0], v1[1]) * v2}
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param v1
//	 *     The first vector as an array with at least two entries.
//	 * @param v2
//	 *     The second vector.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T> T mulFunc(float[] v1, Tup2RF v2, Function2F<T> func)
//	{
//		return mulFunc(v1[0], v1[1], v2.v0(), v2.v1(), func);
//	}
//
//	/**
//	 * Multiplies the first vector {@code (v1[0], v1[1])} with the second vector
//	 * {@code (v2[0], v2[1])} and saves the result in the given extraction parameter object.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v1[0], v1[1]) * (v2[0], v2[1])}
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param v1
//	 *     The first vector as an array with at least two entries.
//	 * @param v2
//	 *     The second vector as an array with at least two entries.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T> T mulFunc(float[] v1, float[] v2, Function2F<T> func)
//	{
//		return mulFunc(v1[0], v1[1], v2[0], v2[1], func);
//	}
//
//	/**
//	 * Multiplies the first vector {@code (v1[0], v1[1])} with the second vector {@code (v2x, v2y)}
//	 * and saves the result in the given extraction parameter object.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v1[0], v1[1]) * (v2x, v2y)}
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param v1
//	 *     The first vector as an array with at least two entries.
//	 * @param v2x
//	 *     The value of the x component of the second vector.
//	 * @param v2y
//	 *     The value of the y component of the second vector.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T> T mulFunc(float[] v1, float v2x, float v2y, Function2F<T> func)
//	{
//		return mulFunc(v1[0], v1[1], v2x, v2y, func);
//	}
//
//	/**
//	 * Multiplies the first vector {@code (v1x, v1y)} with the second vector {@code (v2)} and saves
//	 * the result in the given extraction parameter object.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v1x, v1y) * v2}
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param v1x
//	 *     The value of the x component of the first vector.
//	 * @param v1y
//	 *     The value of the y component of the first vector.
//	 * @param v2
//	 *     The second vector.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T> T mulFunc(float v1x, float v1y, Tup2RF v2, Function2F<T> func)
//	{
//		return mulFunc(v1x, v1y, v2.v0(), v2.v1(), func);
//	}
//
//	/**
//	 * Multiplies the first vector {@code (v1x, v1y)} with the second vector {@code (v2[0], v2[1])}
//	 * and saves the result in the given extraction parameter object.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v1x, v1y) * (v2[0], v2[1])}
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param v1x
//	 *     The value of the x component of the first vector.
//	 * @param v1y
//	 *     The value of the y component of the first vector.
//	 * @param v2
//	 *     The second vector as an array with at least two entries.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T> T mulFunc(float v1x, float v1y, float[] v2, Function2F<T> func)
//	{
//		return mulFunc(v1x, v1y, v2[0], v2[1], func);
//	}
//
//	/**
//	 * Multiplies the first vector {@code (v1x, v1y)} with the second vector {@code (v2x, v2y)} and
//	 * saves the result in the given extraction parameter object.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v1x, v1y) * (v2x, v2y)}
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param v1x
//	 *     The value of the x component of the first vector.
//	 * @param v1y
//	 *     The value of the y component of the first vector.
//	 * @param v2x
//	 *     The value of the x component of the second vector.
//	 * @param v2y
//	 *     The value of the y component of the second vector.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T> T mulFunc(float v1x, float v1y, float v2x, float v2y, Function2F<T> func)
//	{
//		return func.apply2F(v1x * v2x, v1y * v2y);
//	}
//	
//	/**
//	 * Divides the first vector {@code (v1)} by the second vector [@code (v2)} and saves the result
//	 * in the given extraction parameter.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code v1 / v2}
//	 * 
//	 * @param v1
//	 *     The first vector.
//	 * @param v2
//	 *     The second vector.
//	 * @param res
//	 *     The extraction parameter for the result as an array with at least two entries.
//	 * 
//	 * @return The extraction parameter with the result.
//	 */
//	public static float[] div(Tup2RF v1, Tup2RF v2, @ExtractionParam float[] res)
//	{
//		return div(v1.v0(), v1.v1(), v2.v0(), v2.v1(), res);
//	}
//
//	/**
//	 * Divides the first vector {@code (v1)} by the second vector [@code (v2[0], v2[1])} and saves
//	 * the result in the given extraction parameter.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code v1 / (v2[0], v2[1])}
//	 * 
//	 * @param v1
//	 *     The first vector.
//	 * @param v2
//	 *     The second vector as an array with at least two entries.
//	 * @param res
//	 *     The extraction parameter for the result as an array with at least two entries.
//	 * 
//	 * @return The extraction parameter with the result.
//	 */
//	public static float[] div(Tup2RF v1, float[] v2, @ExtractionParam float[] res)
//	{
//		return div(v1.v0(), v1.v1(), v2[0], v2[1], res);
//	}
//
//	/**
//	 * Divides the first vector {@code (v1)} by the second vector [@code (v2x, v2y)} and saves the
//	 * result in the given extraction parameter.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code v1 / (v2x, v2y)}
//	 * 
//	 * @param v1
//	 *     The first vector.
//	 * @param v2x
//	 *     The value of the x component of the second vector.
//	 * @param v2y
//	 *     The value of the y component of the second vector.
//	 * @param res
//	 *     The extraction parameter for the result as an array with at least two entries.
//	 * 
//	 * @return The extraction parameter with the result.
//	 */
//	public static float[] div(Tup2RF v1, float v2x, float v2y, @ExtractionParam float[] res)
//	{
//		return div(v1.v0(), v1.v1(), v2x, v2y, res);
//	}
//
//	/**
//	 * Divides the first vector {@code (v1[0], v1[1])} by the second vector [@code (v2)} and saves
//	 * the result in the given extraction parameter.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v1[0], v1[1]) / v2}
//	 * 
//	 * @param v1
//	 *     The first vector as an array with at least two entries.
//	 * @param v2
//	 *     The second vector.
//	 * @param res
//	 *     The extraction parameter for the result as an array with at least two entries.
//	 * 
//	 * @return The extraction parameter with the result.
//	 */
//	public static float[] div(float[] v1, Tup2RF v2, @ExtractionParam float[] res)
//	{
//		return div(v1[0], v1[1], v2.v0(), v2.v1(), res);
//	}
//
//	/**
//	 * Divides the first vector {@code (v1[0], v1[1])} by the second vector [@code (v2[0], v2[1])}
//	 * and saves the result in the given extraction parameter.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v1[0], v1[1]) / (v2[0], v2[1])}
//	 * 
//	 * @param v1
//	 *     The first vector as an array with at least two entries.
//	 * @param v2
//	 *     The second vector as an array with at least two entries.
//	 * @param res
//	 *     The extraction parameter for the result as an array with at least two entries.
//	 * 
//	 * @return The extraction parameter with the result.
//	 */
//	public static float[] div(float[] v1, float[] v2, @ExtractionParam float[] res)
//	{
//		return div(v1[0], v1[1], v2[0], v2[1], res);
//	}
//
//	/**
//	 * Divides the first vector {@code (v1[0], v1[1])} by the second vector [@code (v2x, v2y)} and
//	 * saves the result in the given extraction parameter.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v1[0], v1[1]) / (v2x, v2y)}
//	 * 
//	 * @param v1
//	 *     The first vector as an array with at least two entries.
//	 * @param v2x
//	 *     The value of the x component of the second vector.
//	 * @param v2y
//	 *     The value of the y component of the second vector.
//	 * @param res
//	 *     The extraction parameter for the result as an array with at least two entries.
//	 * 
//	 * @return The extraction parameter with the result.
//	 */
//	public static float[] div(float[] v1, float v2x, float v2y, @ExtractionParam float[] res)
//	{
//		return div(v1[0], v1[1], v2x, v2y, res);
//	}
//
//	/**
//	 * Divides the first vector {@code (v1x, v1y)} by the second vector [@code (v2)} and saves the
//	 * result in the given extraction parameter.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v1x, v1y) / v2}
//	 * 
//	 * @param v1x
//	 *     The value of the x component of the first vector.
//	 * @param v1y
//	 *     The value of the y component of the first vector.
//	 * @param v2
//	 *     The second vector.
//	 * @param res
//	 *     The extraction parameter for the result as an array with at least two entries.
//	 * 
//	 * @return The extraction parameter with the result.
//	 */
//	public static float[] div(float v1x, float v1y, Tup2RF v2, @ExtractionParam float[] res)
//	{
//		return div(v1x, v1y, v2.v0(), v2.v1(), res);
//	}
//
//	/**
//	 * Divides the first vector {@code (v1x, v1y)} by the second vector [@code (v2[0], v2[1])} and
//	 * saves the result in the given extraction parameter.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v1x, v1y) / (v2[0], v2[1])}
//	 * 
//	 * @param v1x
//	 *     The value of the x component of the first vector.
//	 * @param v1y
//	 *     The value of the y component of the first vector.
//	 * @param v2
//	 *     The second vector as an array with at least two entries.
//	 * @param res
//	 *     The extraction parameter for the result as an array with at least two entries.
//	 * 
//	 * @return The extraction parameter with the result.
//	 */
//	public static float[] div(float v1x, float v1y, float[] v2, @ExtractionParam float[] res)
//	{
//		return div(v1x, v1y, v2[0], v2[1], res);
//	}
//
//	/**
//	 * Divides the first vector {@code (v1x, v1y)} by the second vector [@code (v2x, v2y)} and saves
//	 * the result in the given extraction parameter.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v1x, v1y) / (v2x, v2y)}
//	 * 
//	 * @param v1x
//	 *     The value of the x component of the first vector.
//	 * @param v1y
//	 *     The value of the y component of the first vector.
//	 * @param v2x
//	 *     The value of the x component of the second vector.
//	 * @param v2y
//	 *     The value of the y component of the second vector.
//	 * @param res
//	 *     The extraction parameter for the result as an array with at least two entries.
//	 * 
//	 * @return The extraction parameter with the result.
//	 */
//	public static float[] div(float v1x, float v1y, float v2x, float v2y, @ExtractionParam float[] res)
//	{
//		res[0] = v1x / v2x;
//		res[1] = v1y / v2y;
//		
//		return res;
//	}
//
//	/**
//	 * Divides the first vector {@code (v1)} by the second vector [@code (v2)} and saves the result
//	 * in the given extraction parameter object.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code v1 / v2}
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param v1
//	 *     The first vector.
//	 * @param v2
//	 *     The second vector.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T extends Tup2WF> T div(Tup2RF v1, Tup2RF v2, @ExtractionParam T res)
//	{
//		return div(v1.v0(), v1.v1(), v2.v0(), v2.v1(), res);
//	}
//
//	/**
//	 * Divides the first vector {@code (v1)} by the second vector [@code (v2[0], v2[1])} and saves
//	 * the result in the given extraction parameter object.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code v1 / (v2[0], v2[1])}
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param v1
//	 *     The first vector.
//	 * @param v2
//	 *     The second vector as an array with at least two entries.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T extends Tup2WF> T div(Tup2RF v1, float[] v2, @ExtractionParam T res)
//	{
//		return div(v1.v0(), v1.v1(), v2[0], v2[1], res);
//	}
//
//	/**
//	 * Divides the first vector {@code (v1)} by the second vector [@code (v2x, v2y)} and saves the
//	 * result in the given extraction parameter object.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code v1 / (v2x, v2y)}
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param v1
//	 *     The first vector.
//	 * @param v2x
//	 *     The value of the x component of the second vector.
//	 * @param v2y
//	 *     The value of the y component of the second vector.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T extends Tup2WF> T div(Tup2RF v1, float v2x, float v2y, @ExtractionParam T res)
//	{
//		return div(v1.v0(), v1.v1(), v2x, v2y, res);
//	}
//
//	/**
//	 * Divides the first vector {@code (v1[0], v1[1])} by the second vector [@code (v2)} and saves
//	 * the result in the given extraction parameter object.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v1[0], v1[1]) / v2}
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param v1
//	 *     The first vector as an array with at least two entries.
//	 * @param v2
//	 *     The second vector.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T extends Tup2WF> T div(float[] v1, Tup2RF v2, @ExtractionParam T res)
//	{
//		return div(v1[0], v1[1], v2.v0(), v2.v1(), res);
//	}
//
//	/**
//	 * Divides the first vector {@code (v1[0], v1[1])} by the second vector [@code (v2[0], v2[1])}
//	 * and saves the result in the given extraction parameter object.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v1[0], v1[1]) / (v2[0], v2[1])}
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param v1
//	 *     The first vector as an array with at least two entries.
//	 * @param v2
//	 *     The second vector as an array with at least two entries.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T extends Tup2WF> T div(float[] v1, float[] v2, @ExtractionParam T res)
//	{
//		return div(v1[0], v1[1], v2[0], v2[1], res);
//	}
//
//	/**
//	 * Divides the first vector {@code (v1[0], v1[1])} by the second vector [@code (v2x, v2y)} and
//	 * saves the result in the given extraction parameter object.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v1[0], v1[1]) / (v2x, v2y)}
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param v1
//	 *     The first vector as an array with at least two entries.
//	 * @param v2x
//	 *     The value of the x component of the second vector.
//	 * @param v2y
//	 *     The value of the y component of the second vector.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T extends Tup2WF> T div(float[] v1, float v2x, float v2y, @ExtractionParam T res)
//	{
//		return div(v1[0], v1[1], v2x, v2y, res);
//	}
//
//	/**
//	 * Divides the first vector {@code (v1x, v1y)} by the second vector [@code (v2)} and saves the
//	 * result in the given extraction parameter object.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v1x, v1y) / v2}
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param v1x
//	 *     The value of the x component of the first vector.
//	 * @param v1y
//	 *     The value of the y component of the first vector.
//	 * @param v2
//	 *     The second vector.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T extends Tup2WF> T div(float v1x, float v1y, Tup2RF v2, @ExtractionParam T res)
//	{
//		return div(v1x, v1y, v2.v0(), v2.v1(), res);
//	}
//
//	/**
//	 * Divides the first vector {@code (v1x, v1y)} by the second vector [@code (v2[0], v2[1])} and
//	 * saves the result in the given extraction parameter object.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v1x, v1y) / (v2[0], v2[1])}
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param v1x
//	 *     The value of the x component of the first vector.
//	 * @param v1y
//	 *     The value of the y component of the first vector.
//	 * @param v2
//	 *     The second vector as an array with at least two entries.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T extends Tup2WF> T div(float v1x, float v1y, float[] v2, @ExtractionParam T res)
//	{
//		return div(v1x, v1y, v2[0], v2[1], res);
//	}
//
//	/**
//	 * Divides the first vector {@code (v1x, v1y)} by the second vector [@code (v2x, v2y)} and saves
//	 * the result in the given extraction parameter object.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v1x, v1y) / (v2x, v2y)}
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param v1x
//	 *     The value of the x component of the first vector.
//	 * @param v1y
//	 *     The value of the y component of the first vector.
//	 * @param v2x
//	 *     The value of the x component of the second vector.
//	 * @param v2y
//	 *     The value of the y component of the second vector.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T extends Tup2WF> T div(float v1x, float v1y, float v2x, float v2y, @ExtractionParam T res)
//	{
//		res.set(v1x / v2x, v1y / v2y);
//		
//		return res;
//	}
//
//	/**
//	 * Divides the first vector {@code (v1)} by the second vector [@code (v2)} and saves the result
//	 * in the given extraction parameter object.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code v1 / v2}
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param v1
//	 *     The first vector.
//	 * @param v2
//	 *     The second vector.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T> T divFunc(Tup2RF v1, Tup2RF v2, Function2F<T> func)
//	{
//		return divFunc(v1.v0(), v1.v1(), v2.v0(), v2.v1(), func);
//	}
//
//	/**
//	 * Divides the first vector {@code (v1)} by the second vector [@code (v2[0], v2[1])} and saves
//	 * the result in the given extraction parameter object.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code v1 / (v2[0], v2[1])}
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param v1
//	 *     The first vector.
//	 * @param v2
//	 *     The second vector as an array with at least two entries.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T> T divFunc(Tup2RF v1, float[] v2, Function2F<T> func)
//	{
//		return divFunc(v1.v0(), v1.v1(), v2[0], v2[1], func);
//	}
//
//	/**
//	 * Divides the first vector {@code (v1)} by the second vector [@code (v2x, v2y)} and saves the
//	 * result in the given extraction parameter object.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code v1 / (v2x, v2y)}
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param v1
//	 *     The first vector.
//	 * @param v2x
//	 *     The value of the x component of the second vector.
//	 * @param v2y
//	 *     The value of the y component of the second vector.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T> T divFunc(Tup2RF v1, float v2x, float v2y, Function2F<T> func)
//	{
//		return divFunc(v1.v0(), v1.v1(), v2x, v2y, func);
//	}
//
//	/**
//	 * Divides the first vector {@code (v1[0], v1[1])} by the second vector [@code (v2)} and saves
//	 * the result in the given extraction parameter object.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v1[0], v1[1]) / v2}
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param v1
//	 *     The first vector as an array with at least two entries.
//	 * @param v2
//	 *     The second vector.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T> T divFunc(float[] v1, Tup2RF v2, Function2F<T> func)
//	{
//		return divFunc(v1[0], v1[1], v2.v0(), v2.v1(), func);
//	}
//
//	/**
//	 * Divides the first vector {@code (v1[0], v1[1])} by the second vector [@code (v2[0], v2[1])}
//	 * and saves the result in the given extraction parameter object.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v1[0], v1[1]) / (v2[0], v2[1])}
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param v1
//	 *     The first vector as an array with at least two entries.
//	 * @param v2
//	 *     The second vector as an array with at least two entries.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T> T divFunc(float[] v1, float[] v2, Function2F<T> func)
//	{
//		return divFunc(v1[0], v1[1], v2[0], v2[1], func);
//	}
//
//	/**
//	 * Divides the first vector {@code (v1[0], v1[1])} by the second vector [@code (v2x, v2y)} and
//	 * saves the result in the given extraction parameter object.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v1[0], v1[1]) / (v2x, v2y)}
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param v1
//	 *     The first vector as an array with at least two entries.
//	 * @param v2x
//	 *     The value of the x component of the second vector.
//	 * @param v2y
//	 *     The value of the y component of the second vector.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T> T divFunc(float[] v1, float v2x, float v2y, Function2F<T> func)
//	{
//		return divFunc(v1[0], v1[1], v2x, v2y, func);
//	}
//
//	/**
//	 * Divides the first vector {@code (v1x, v1y)} by the second vector [@code (v2)} and saves the
//	 * result in the given extraction parameter object.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v1x, v1y) / v2}
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param v1x
//	 *     The value of the x component of the first vector.
//	 * @param v1y
//	 *     The value of the y component of the first vector.
//	 * @param v2
//	 *     The second vector.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T> T divFunc(float v1x, float v1y, Tup2RF v2, Function2F<T> func)
//	{
//		return divFunc(v1x, v1y, v2.v0(), v2.v1(), func);
//	}
//
//	/**
//	 * Divides the first vector {@code (v1x, v1y)} by the second vector [@code (v2[0], v2[1])} and
//	 * saves the result in the given extraction parameter object.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v1x, v1y) / (v2[0], v2[1])}
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param v1x
//	 *     The value of the x component of the first vector.
//	 * @param v1y
//	 *     The value of the y component of the first vector.
//	 * @param v2
//	 *     The second vector as an array with at least two entries.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T> T divFunc(float v1x, float v1y, float[] v2, Function2F<T> func)
//	{
//		return divFunc(v1x, v1y, v2[0], v2[1], func);
//	}
//
//	/**
//	 * Divides the first vector {@code (v1x, v1y)} by the second vector [@code (v2x, v2y)} and saves
//	 * the result in the given extraction parameter object.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v1x, v1y) / (v2x, v2y)}
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param v1x
//	 *     The value of the x component of the first vector.
//	 * @param v1y
//	 *     The value of the y component of the first vector.
//	 * @param v2x
//	 *     The value of the x component of the second vector.
//	 * @param v2y
//	 *     The value of the y component of the second vector.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T> T divFunc(float v1x, float v1y, float v2x, float v2y, Function2F<T> func)
//	{
//		return func.apply2F(v1x / v2x, v1y / v2y);
//	}
//	
//	/**
//	 * Multiplies the given vector {@code (v1)} with the given vector {@code (v2)}, adds the given
//	 * vector {@code (v3)} to the product result and saves the result in the given extraction
//	 * parameter.
//	 * 
//	 * <p>
//	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
//	 * addition. The actual way of calculation depends on the implementation of the used
//	 * {@link MathProvider}.
//	 * 
//	 * <p>
//	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
//	 * calculation.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code  v1 * v2 + v3}
//	 * 
//	 * @param v1
//	 *     The first multiplicant vector.
//	 * @param v2
//	 *     The second multiplicant vector.
//	 * @param v3
//	 *     The addend vector.
//	 * @param res
//	 *     The extraction parameter for the result as an array with at least two entries.
//	 * 
//	 * @return The extraction parameter with the result.
//	 */
//	public static float[] fma(Tup2RF v1, Tup2RF v2, Tup2RF v3, @ExtractionParam float[] res)
//	{
//		return fma(v1.v0(), v1.v1(), v2.v0(), v2.v1(), v3.v0(), v3.v1(), res);
//	}
//
//	/**
//	 * Multiplies the given vector {@code (v1)} with the given vector {@code (v2)}, adds the given
//	 * vector {@code (v3[0], v3[1])} to the product result and saves the result in the given
//	 * extraction parameter.
//	 * 
//	 * <p>
//	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
//	 * addition. The actual way of calculation depends on the implementation of the used
//	 * {@link MathProvider}.
//	 * 
//	 * <p>
//	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
//	 * calculation.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code v1 * v2 + (v3[0], v3[1])}
//	 * 
//	 * @param v1
//	 *     The first multiplicant vector.
//	 * @param v2
//	 *     The second multiplicant vector.
//	 * @param v3
//	 *     The addend vector as an array with at least two entries.
//	 * @param res
//	 *     The extraction parameter for the result as an array with at least two entries.
//	 * 
//	 * @return The extraction parameter with the result.
//	 */
//	public static float[] fma(Tup2RF v1, Tup2RF v2, float[] v3, @ExtractionParam float[] res)
//	{
//		return fma(v1.v0(), v1.v1(), v2.v0(), v2.v1(), v3[0], v3[1], res);
//	}
//
//	/**
//	 * Multiplies the given vector {@code (v1)} with the given vector {@code (v2)}, adds the given
//	 * vector {@code (v3x, v3y)} to the product result and saves the result in the given extraction
//	 * parameter.
//	 * 
//	 * <p>
//	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
//	 * addition. The actual way of calculation depends on the implementation of the used
//	 * {@link MathProvider}.
//	 * 
//	 * <p>
//	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
//	 * calculation.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code v1 * v2 + (v3x, v3y)}
//	 * 
//	 * @param v1
//	 *     The first multiplicant vector.
//	 * @param v2
//	 *     The second multiplicant vector.
//	 * @param v3x
//	 *     The value of the x component of the addend vector.
//	 * @param v3y
//	 *     The value of the y component of the addend vector.
//	 * @param res
//	 *     The extraction parameter for the result as an array with at least two entries.
//	 * 
//	 * @return The extraction parameter with the result.
//	 */
//	public static float[] fma(Tup2RF v1, Tup2RF v2, float v3x, float v3y, @ExtractionParam float[] res)
//	{
//		return fma(v1.v0(), v1.v1(), v2.v0(), v2.v1(), v3x, v3y, res);
//	}
//
//	/**
//	 * Multiplies the given vector {@code (v1)} with the given vector {@code (v2[0], v2[1])}, adds
//	 * the given vector {@code (v3)} to the product result and saves the result in the given
//	 * extraction parameter.
//	 * 
//	 * <p>
//	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
//	 * addition. The actual way of calculation depends on the implementation of the used
//	 * {@link MathProvider}.
//	 * 
//	 * <p>
//	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
//	 * calculation.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code v1 * (v2[0], v2[1]) + v3}
//	 * 
//	 * @param v1
//	 *     The first multiplicant vector.
//	 * @param v2
//	 *     The second multiplicant vector as an array with at least two entries.
//	 * @param v3
//	 *     The addend vector.
//	 * @param res
//	 *     The extraction parameter for the result as an array with at least two entries.
//	 * 
//	 * @return The extraction parameter with the result.
//	 */
//	public static float[] fma(Tup2RF v1, float[] v2, Tup2RF v3, @ExtractionParam float[] res)
//	{
//		return fma(v1.v0(), v1.v1(), v2[0], v2[1], v3.v0(), v3.v1(), res);
//	}
//
//	/**
//	 * Multiplies the given vector {@code (v1)} with the given vector {@code (v2[0], v2[1])}, adds
//	 * the given vector {@code (v3[0], v3[1])} to the product result and saves the result in the
//	 * given extraction parameter.
//	 * 
//	 * <p>
//	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
//	 * addition. The actual way of calculation depends on the implementation of the used
//	 * {@link MathProvider}.
//	 * 
//	 * <p>
//	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
//	 * calculation.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code v1 * (v2[0], v2[1]) + (v3[0], v3[1])}
//	 * 
//	 * @param v1
//	 *     The first multiplicant vector.
//	 * @param v2
//	 *     The second multiplicant vector as an array with at least two entries.
//	 * @param v3
//	 *     The addend vector as an array with at least two entries.
//	 * @param res
//	 *     The extraction parameter for the result as an array with at least two entries.
//	 * 
//	 * @return The extraction parameter with the result.
//	 */
//	public static float[] fma(Tup2RF v1, float[] v2, float[] v3, @ExtractionParam float[] res)
//	{
//		return fma(v1.v0(), v1.v1(), v2[0], v2[1], v3[0], v3[1], res);
//	}
//
//	/**
//	 * Multiplies the given vector {@code (v1)} with the given vector {@code (v2[0], v2[1])}, adds
//	 * the given vector {@code (v3x, v3y)} to the product result and saves the result in the given
//	 * extraction parameter.
//	 * 
//	 * <p>
//	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
//	 * addition. The actual way of calculation depends on the implementation of the used
//	 * {@link MathProvider}.
//	 * 
//	 * <p>
//	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
//	 * calculation.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code v1 * (v2[0], v2[1]) + (v3x, v3y)}
//	 * 
//	 * @param v1
//	 *     The first multiplicant vector.
//	 * @param v2
//	 *     The second multiplicant vector as an array with at least two entries.
//	 * @param v3x
//	 *     The value of the x component of the addend vector.
//	 * @param v3y
//	 *     The value of the y component of the addend vector.
//	 * @param res
//	 *     The extraction parameter for the result as an array with at least two entries.
//	 * 
//	 * @return The extraction parameter with the result.
//	 */
//	public static float[] fma(Tup2RF v1, float[] v2, float v3x, float v3y, @ExtractionParam float[] res)
//	{
//		return fma(v1.v0(), v1.v1(), v2[0], v2[1], v3x, v3y, res);
//	}
//
//	/**
//	 * Multiplies the given vector {@code (v1)} with the given vector {@code (v2x, v2y)}, adds the
//	 * given vector {@code (v3)} to the product result and saves the result in the given extraction
//	 * parameter.
//	 * 
//	 * <p>
//	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
//	 * addition. The actual way of calculation depends on the implementation of the used
//	 * {@link MathProvider}.
//	 * 
//	 * <p>
//	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
//	 * calculation.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code v1 * (v2x, v2y) + v3}
//	 * 
//	 * @param v1
//	 *     The first multiplicant vector.
//	 * @param v2x
//	 *     The value of the x component of the second multiplicant vector.
//	 * @param v2y
//	 *     The value of the y component of the second multiplicant vector.
//	 * @param v3
//	 *     The addend vector.
//	 * @param res
//	 *     The extraction parameter for the result as an array with at least two entries.
//	 * 
//	 * @return The extraction parameter with the result.
//	 */
//	public static float[] fma(Tup2RF v1, float v2x, float v2y, Tup2RF v3, @ExtractionParam float[] res)
//	{
//		return fma(v1.v0(), v1.v1(), v2x, v2y, v3.v0(), v3.v1(), res);
//	}
//
//	/**
//	 * Multiplies the given vector {@code (v1)} with the given vector {@code (v2x, v2y)}, adds the
//	 * given vector {@code (v3[0], v3[1])} to the product result and saves the result in the given
//	 * extraction parameter.
//	 * 
//	 * <p>
//	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
//	 * addition. The actual way of calculation depends on the implementation of the used
//	 * {@link MathProvider}.
//	 * 
//	 * <p>
//	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
//	 * calculation.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code v1 * (v2x, v2y) + (v3[0], v3[1])}
//	 * 
//	 * @param v1
//	 *     The first multiplicant vector.
//	 * @param v2x
//	 *     The value of the x component of the second multiplicant vector.
//	 * @param v2y
//	 *     The value of the y component of the second multiplicant vector.
//	 * @param v3
//	 *     The addend vector as an array with at least two entries.
//	 * @param res
//	 *     The extraction parameter for the result as an array with at least two entries.
//	 * 
//	 * @return The extraction parameter with the result.
//	 */
//	public static float[] fma(Tup2RF v1, float v2x, float v2y, float[] v3, @ExtractionParam float[] res)
//	{
//		return fma(v1.v0(), v1.v1(), v2x, v2y, v3[0], v3[1], res);
//	}
//
//	/**
//	 * Multiplies the given vector {@code (v1)} with the given vector {@code (v2x, v2y)}, adds the
//	 * given vector {@code (v3x, v3y)} to the product result and saves the result in the given
//	 * extraction parameter.
//	 * 
//	 * <p>
//	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
//	 * addition. The actual way of calculation depends on the implementation of the used
//	 * {@link MathProvider}.
//	 * 
//	 * <p>
//	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
//	 * calculation.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code v1 * (v2x, v2y) + (v3x, v3y)}
//	 * 
//	 * @param v1
//	 *     The first multiplicant vector.
//	 * @param v2x
//	 *     The value of the x component of the second multiplicant vector.
//	 * @param v2y
//	 *     The value of the y component of the second multiplicant vector.
//	 * @param v3x
//	 *     The value of the x component of the addend vector.
//	 * @param v3y
//	 *     The value of the y component of the addend vector.
//	 * @param res
//	 *     The extraction parameter for the result as an array with at least two entries.
//	 * 
//	 * @return The extraction parameter with the result.
//	 */
//	public static float[] fma(Tup2RF v1, float v2x, float v2y, float v3x, float v3y, @ExtractionParam float[] res)
//	{
//		return fma(v1.v0(), v1.v1(), v2x, v2y, v3x, v3y, res);
//	}
//
//	/**
//	 * Multiplies the given vector {@code (v1[0], v1[1])} with the given vector {@code (v2)}, adds
//	 * the given vector {@code (v3)} to the product result and saves the result in the given
//	 * extraction parameter.
//	 * 
//	 * <p>
//	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
//	 * addition. The actual way of calculation depends on the implementation of the used
//	 * {@link MathProvider}.
//	 * 
//	 * <p>
//	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
//	 * calculation.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v1[0], v1[1]) * v2 + v3}
//	 * 
//	 * @param v1
//	 *     The first multiplicant vector as an array with at least two entries.
//	 * @param v2
//	 *     The second multiplicant vector.
//	 * @param v3
//	 *     The addend vector.
//	 * @param res
//	 *     The extraction parameter for the result as an array with at least two entries.
//	 * 
//	 * @return The extraction parameter with the result.
//	 */
//	public static float[] fma(float[] v1, Tup2RF v2, Tup2RF v3, @ExtractionParam float[] res)
//	{
//		return fma(v1[0], v1[1], v2.v0(), v2.v1(), v3.v0(), v3.v1(), res);
//	}
//
//	/**
//	 * Multiplies the given vector {@code (v1[0], v1[1])} with the given vector {@code (v2)}, adds
//	 * the given vector {@code (v3[0], v3[1])} to the product result and saves the result in the
//	 * given extraction parameter.
//	 * 
//	 * <p>
//	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
//	 * addition. The actual way of calculation depends on the implementation of the used
//	 * {@link MathProvider}.
//	 * 
//	 * <p>
//	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
//	 * calculation.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v1[0], v1[1]) * v2 + (v3[0], v3[1])}
//	 * 
//	 * @param v1
//	 *     The first multiplicant vector as an array with at least two entries.
//	 * @param v2
//	 *     The second multiplicant vector.
//	 * @param v3
//	 *     The addend vector as an array with at least two entries.
//	 * @param res
//	 *     The extraction parameter for the result as an array with at least two entries.
//	 * 
//	 * @return The extraction parameter with the result.
//	 */
//	public static float[] fma(float[] v1, Tup2RF v2, float[] v3, @ExtractionParam float[] res)
//	{
//		return fma(v1[0], v1[1], v2.v0(), v2.v1(), v3[0], v3[1], res);
//	}
//
//	/**
//	 * Multiplies the given vector {@code (v1[0], v1[1])} with the given vector {@code (v2)}, adds
//	 * the given vector {@code (v3x, v3y)} to the product result and saves the result in the given
//	 * extraction parameter.
//	 * 
//	 * <p>
//	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
//	 * addition. The actual way of calculation depends on the implementation of the used
//	 * {@link MathProvider}.
//	 * 
//	 * <p>
//	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
//	 * calculation.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v1[0], v1[1]) * v2 + (v3x, v3y)}
//	 * 
//	 * @param v1
//	 *     The first multiplicant vector as an array with at least two entries.
//	 * @param v2
//	 *     The second multiplicant vector.
//	 * @param v3x
//	 *     The value of the x component of the addend vector.
//	 * @param v3y
//	 *     The value of the y component of the addend vector.
//	 * @param res
//	 *     The extraction parameter for the result as an array with at least two entries.
//	 * 
//	 * @return The extraction parameter with the result.
//	 */
//	public static float[] fma(float[] v1, Tup2RF v2, float v3x, float v3y, @ExtractionParam float[] res)
//	{
//		return fma(v1[0], v1[1], v2.v0(), v2.v1(), v3x, v3y, res);
//	}
//
//	/**
//	 * Multiplies the given vector {@code (v1[0], v1[1])} with the given vector
//	 * {@code (v2[0], v2[1])}, adds the given vector {@code (v3)} to the product result and saves
//	 * the result in the given extraction parameter.
//	 * 
//	 * <p>
//	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
//	 * addition. The actual way of calculation depends on the implementation of the used
//	 * {@link MathProvider}.
//	 * 
//	 * <p>
//	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
//	 * calculation.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v1[0], v1[1]) * (v2[0], v2[1]) + v3}
//	 * 
//	 * @param v1
//	 *     The first multiplicant vector as an array with at least two entries.
//	 * @param v2
//	 *     The second multiplicant vector as an array with at least two entries.
//	 * @param v3
//	 *     The addend vector.
//	 * @param res
//	 *     The extraction parameter for the result as an array with at least two entries.
//	 * 
//	 * @return The extraction parameter with the result.
//	 */
//	public static float[] fma(float[] v1, float[] v2, Tup2RF v3, @ExtractionParam float[] res)
//	{
//		return fma(v1[0], v1[1], v2[0], v2[1], v3.v0(), v3.v1(), res);
//	}
//
//	/**
//	 * Multiplies the given vector {@code (v1[0], v1[1])} with the given vector
//	 * {@code (v2[0], v2[1])}, adds the given vector {@code (v3[0], v3[1])} to the product result
//	 * and saves the result in the given extraction parameter.
//	 * 
//	 * <p>
//	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
//	 * addition. The actual way of calculation depends on the implementation of the used
//	 * {@link MathProvider}.
//	 * 
//	 * <p>
//	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
//	 * calculation.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v1[0], v1[1]) * (v2[0], v2[1]) + (v3[0], v3[1])}
//	 * 
//	 * @param v1
//	 *     The first multiplicant vector as an array with at least two entries.
//	 * @param v2
//	 *     The second multiplicant vector as an array with at least two entries.
//	 * @param v3
//	 *     The addend vector as an array with at least two entries.
//	 * @param res
//	 *     The extraction parameter for the result as an array with at least two entries.
//	 * 
//	 * @return The extraction parameter with the result.
//	 */
//	public static float[] fma(float[] v1, float[] v2, float[] v3, @ExtractionParam float[] res)
//	{
//		return fma(v1[0], v1[1], v2[0], v2[1], v3[0], v3[1], res);
//	}
//
//	/**
//	 * Multiplies the given vector {@code (v1[0], v1[1])} with the given vector
//	 * {@code (v2[0], v2[1])}, adds the given vector {@code (v3x, v3y)} to the product result and
//	 * saves the result in the given extraction parameter.
//	 * 
//	 * <p>
//	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
//	 * addition. The actual way of calculation depends on the implementation of the used
//	 * {@link MathProvider}.
//	 * 
//	 * <p>
//	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
//	 * calculation.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v1[0], v1[1]) * (v2[0], v2[1]) + (v3x, v3y)}
//	 * 
//	 * @param v1
//	 *     The first multiplicant vector as an array with at least two entries.
//	 * @param v2
//	 *     The second multiplicant vector as an array with at least two entries.
//	 * @param v3x
//	 *     The value of the x component of the addend vector.
//	 * @param v3y
//	 *     The value of the y component of the addend vector.
//	 * @param res
//	 *     The extraction parameter for the result as an array with at least two entries.
//	 * 
//	 * @return The extraction parameter with the result.
//	 */
//	public static float[] fma(float[] v1, float[] v2, float v3x, float v3y, @ExtractionParam float[] res)
//	{
//		return fma(v1[0], v1[1], v2[0], v2[1], v3x, v3y, res);
//	}
//
//	/**
//	 * Multiplies the given vector {@code (v1[0], v1[1])} with the given vector {@code (v2x, v2y)},
//	 * adds the given vector {@code (v3)} to the product result and saves the result in the given
//	 * extraction parameter.
//	 * 
//	 * <p>
//	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
//	 * addition. The actual way of calculation depends on the implementation of the used
//	 * {@link MathProvider}.
//	 * 
//	 * <p>
//	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
//	 * calculation.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v1[0], v1[1]) * (v2x, v2y) + v3}
//	 * 
//	 * @param v1
//	 *     The first multiplicant vector as an array with at least two entries.
//	 * @param v2x
//	 *     The value of the x component of the second multiplicant vector.
//	 * @param v2y
//	 *     The value of the y component of the second multiplicant vector.
//	 * @param v3
//	 *     The addend vector.
//	 * @param res
//	 *     The extraction parameter for the result as an array with at least two entries.
//	 * 
//	 * @return The extraction parameter with the result.
//	 */
//	public static float[] fma(float[] v1, float v2x, float v2y, Tup2RF v3, @ExtractionParam float[] res)
//	{
//		return fma(v1[0], v1[1], v2x, v2y, v3.v0(), v3.v1(), res);
//	}
//
//	/**
//	 * Multiplies the given vector {@code (v1[0], v1[1])} with the given vector {@code (v2x, v2y)},
//	 * adds the given vector {@code (v3[0], v3[1])} to the product result and saves the result in
//	 * the given extraction parameter.
//	 * 
//	 * <p>
//	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
//	 * addition. The actual way of calculation depends on the implementation of the used
//	 * {@link MathProvider}.
//	 * 
//	 * <p>
//	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
//	 * calculation.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v1[0], v1[1]) * (v2x, v2y) + (v3[0], v3[1])}
//	 * 
//	 * @param v1
//	 *     The first multiplicant vector as an array with at least two entries.
//	 * @param v2x
//	 *     The value of the x component of the second multiplicant vector.
//	 * @param v2y
//	 *     The value of the y component of the second multiplicant vector.
//	 * @param v3
//	 *     The addend vector as an array with at least two entries.
//	 * @param res
//	 *     The extraction parameter for the result as an array with at least two entries.
//	 * 
//	 * @return The extraction parameter with the result.
//	 */
//	public static float[] fma(float[] v1, float v2x, float v2y, float[] v3, @ExtractionParam float[] res)
//	{
//		return fma(v1[0], v1[1], v2x, v2y, v3[0], v3[1], res);
//	}
//
//	/**
//	 * Multiplies the given vector {@code (v1[0], v1[1])} with the given vector {@code (v2x, v2y)},
//	 * adds the given vector {@code (v3x, v3y)} to the product result and saves the result in the
//	 * given extraction parameter.
//	 * 
//	 * <p>
//	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
//	 * addition. The actual way of calculation depends on the implementation of the used
//	 * {@link MathProvider}.
//	 * 
//	 * <p>
//	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
//	 * calculation.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v1[0], v1[1]) * (v2x, v2y) + (v3x, v3y)}
//	 * 
//	 * @param v1
//	 *     The first multiplicant vector as an array with at least two entries.
//	 * @param v2x
//	 *     The value of the x component of the second multiplicant vector.
//	 * @param v2y
//	 *     The value of the y component of the second multiplicant vector.
//	 * @param v3x
//	 *     The value of the x component of the addend vector.
//	 * @param v3y
//	 *     The value of the y component of the addend vector.
//	 * @param res
//	 *     The extraction parameter for the result as an array with at least two entries.
//	 * 
//	 * @return The extraction parameter with the result.
//	 */
//	public static float[] fma(float[] v1, float v2x, float v2y, float v3x, float v3y, @ExtractionParam float[] res)
//	{
//		return fma(v1[0], v1[1], v2x, v2y, v3x, v3y, res);
//	}
//
//	/**
//	 * Multiplies the given vector {@code (v1x, v1y)} with the given vector {@code (v2)}, adds the
//	 * given vector {@code (v3)} to the product result and saves the result in the given extraction
//	 * parameter.
//	 * 
//	 * <p>
//	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
//	 * addition. The actual way of calculation depends on the implementation of the used
//	 * {@link MathProvider}.
//	 * 
//	 * <p>
//	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
//	 * calculation.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v1x, v1y) * v2 + v3}
//	 * 
//	 * @param v1x
//	 *     The value of the x component of the first multiplicant vector.
//	 * @param v1y
//	 *     The value of the y component of the first multiplicant vector.
//	 * @param v2
//	 *     The second multiplicant vector.
//	 * @param v3
//	 *     The addend vector.
//	 * @param res
//	 *     The extraction parameter for the result as an array with at least two entries.
//	 * 
//	 * @return The extraction parameter with the result.
//	 */
//	public static float[] fma(float v1x, float v1y, Tup2RF v2, Tup2RF v3, @ExtractionParam float[] res)
//	{
//		return fma(v1x, v1y, v2.v0(), v2.v1(), v3.v0(), v3.v1(), res);
//	}
//
//	/**
//	 * Multiplies the given vector {@code (v1x, v1y)} with the given vector {@code (v2)}, adds the
//	 * given vector {@code (v3[0], v3[1])} to the product result and saves the result in the given
//	 * extraction parameter.
//	 * 
//	 * <p>
//	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
//	 * addition. The actual way of calculation depends on the implementation of the used
//	 * {@link MathProvider}.
//	 * 
//	 * <p>
//	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
//	 * calculation.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v1x, v1y) * v2 + (v3[0], v3[1])}
//	 * 
//	 * @param v1x
//	 *     The value of the x component of the first multiplicant vector.
//	 * @param v1y
//	 *     The value of the y component of the first multiplicant vector.
//	 * @param v2
//	 *     The second multiplicant vector.
//	 * @param v3
//	 *     The addend vector as an array with at least two entries.
//	 * @param res
//	 *     The extraction parameter for the result as an array with at least two entries.
//	 * 
//	 * @return The extraction parameter with the result.
//	 */
//	public static float[] fma(float v1x, float v1y, Tup2RF v2, float[] v3, @ExtractionParam float[] res)
//	{
//		return fma(v1x, v1y, v2.v0(), v2.v1(), v3[0], v3[1], res);
//	}
//
//	/**
//	 * Multiplies the given vector {@code (v1x, v1y)} with the given vector {@code (v2)}, adds the
//	 * given vector {@code (v3x, v3y)} to the product result and saves the result in the given
//	 * extraction parameter.
//	 * 
//	 * <p>
//	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
//	 * addition. The actual way of calculation depends on the implementation of the used
//	 * {@link MathProvider}.
//	 * 
//	 * <p>
//	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
//	 * calculation.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v1x, v1y) * v2 + (v3x, v3y)}
//	 * 
//	 * @param v1x
//	 *     The value of the x component of the first multiplicant vector.
//	 * @param v1y
//	 *     The value of the y component of the first multiplicant vector.
//	 * @param v2
//	 *     The second multiplicant vector.
//	 * @param v3x
//	 *     The value of the x component of the addend vector.
//	 * @param v3y
//	 *     The value of the y component of the addend vector.
//	 * @param res
//	 *     The extraction parameter for the result as an array with at least two entries.
//	 * 
//	 * @return The extraction parameter with the result.
//	 */
//	public static float[] fma(float v1x, float v1y, Tup2RF v2, float v3x, float v3y, @ExtractionParam float[] res)
//	{
//		return fma(v1x, v1y, v2.v0(), v2.v1(), v3x, v3y, res);
//	}
//
//	/**
//	 * Multiplies the given vector {@code (v1x, v1y)} with the given vector {@code (v2[0], v2[1])},
//	 * adds the given vector {@code (v3)} to the product result and saves the result in the given
//	 * result array.
//	 * 
//	 * <p>
//	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
//	 * addition. The actual way of calculation depends on the implementation of the used
//	 * {@link MathProvider}.
//	 * 
//	 * <p>
//	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
//	 * calculation.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v1x, v1y) * (v2[0], v2[1]) + v3}
//	 * 
//	 * @param v1x
//	 *     The value of the x component of the first multiplicant vector.
//	 * @param v1y
//	 *     The value of the y component of the first multiplicant vector.
//	 * @param v2
//	 *     The second multiplicant vector as an array with at least two entries.
//	 * @param v3
//	 *     The addend vector.
//	 * @param res
//	 *     The extraction parameter for the result as an array with at least two entries.
//	 * 
//	 * @return The extraction parameter with the result.
//	 */
//	public static float[] fma(float v1x, float v1y, float[] v2, Tup2RF v3, @ExtractionParam float[] res)
//	{
//		return fma(v1x, v1y, v2[0], v2[1], v3.v0(), v3.v1(), res);
//	}
//
//	/**
//	 * Multiplies the given vector {@code (v1x, v1y)} with the given vector {@code (v2[0], v2[1])},
//	 * adds the given vector {@code (v3[0], v3[1])} to the product result and saves the result in
//	 * the given extraction parameter.
//	 * 
//	 * <p>
//	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
//	 * addition. The actual way of calculation depends on the implementation of the used
//	 * {@link MathProvider}.
//	 * 
//	 * <p>
//	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
//	 * calculation.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v1x, v1y) * (v2[0], v2[1]) + (v3[0], v3[1])}
//	 * 
//	 * @param v1x
//	 *     The value of the x component of the first multiplicant vector.
//	 * @param v1y
//	 *     The value of the y component of the first multiplicant vector.
//	 * @param v2
//	 *     The second multiplicant vector as an array with at least two entries.
//	 * @param v3
//	 *     The addend vector as an array with at least two entries.
//	 * @param res
//	 *     The extraction parameter for the result as an array with at least two entries.
//	 * 
//	 * @return The extraction parameter with the result.
//	 */
//	public static float[] fma(float v1x, float v1y, float[] v2, float[] v3, @ExtractionParam float[] res)
//	{
//		return fma(v1x, v1y, v2[0], v2[1], v3[0], v3[1], res);
//	}
//
//	/**
//	 * Multiplies the given vector {@code (v1x, v1y)} with the given vector {@code (v2[0], v2[1])},
//	 * adds the given vector {@code (v3x, v3y)} to the product result and saves the result in the
//	 * given extraction parameter.
//	 * 
//	 * <p>
//	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
//	 * addition. The actual way of calculation depends on the implementation of the used
//	 * {@link MathProvider}.
//	 * 
//	 * <p>
//	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
//	 * calculation.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v1x, v1y) * (v2[0], v2[1]) + (v3x, v3y)}
//	 * 
//	 * @param v1x
//	 *     The value of the x component of the first multiplicant vector.
//	 * @param v1y
//	 *     The value of the y component of the first multiplicant vector.
//	 * @param v2
//	 *     The second multiplicant vector as an array with at least two entries.
//	 * @param v3x
//	 *     The value of the x component of the addend vector.
//	 * @param v3y
//	 *     The value of the y component of the addend vector.
//	 * @param res
//	 *     The extraction parameter for the result as an array with at least two entries.
//	 * 
//	 * @return The extraction parameter with the result.
//	 */
//	public static float[] fma(float v1x, float v1y, float[] v2, float v3x, float v3y, @ExtractionParam float[] res)
//	{
//		return fma(v1x, v1y, v2[0], v2[1], v3x, v3y, res);
//	}
//
//	/**
//	 * Multiplies the given vector {@code (v1x, v1y)} with the given vector {@code (v2x, v2y)}, adds
//	 * the given vector {@code (v3)} to the product result and saves the result in the given
//	 * extraction parameter.
//	 * 
//	 * <p>
//	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
//	 * addition. The actual way of calculation depends on the implementation of the used
//	 * {@link MathProvider}.
//	 * 
//	 * <p>
//	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
//	 * calculation.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v1x, v1y) * (v2x, v2y) + v3}
//	 * 
//	 * @param v1x
//	 *     The value of the x component of the first multiplicant vector.
//	 * @param v1y
//	 *     The value of the y component of the first multiplicant vector.
//	 * @param v2x
//	 *     The value of the x component of the second multiplicant vector.
//	 * @param v2y
//	 *     The value of the y component of the second multiplicant vector.
//	 * @param v3
//	 *     The addend vector.
//	 * @param res
//	 *     The extraction parameter for the result as an array with at least two entries.
//	 * 
//	 * @return The extraction parameter with the result.
//	 */
//	public static float[] fma(float v1x, float v1y, float v2x, float v2y, Tup2RF v3, @ExtractionParam float[] res)
//	{
//		return fma(v1x, v1y, v2x, v2y, v3.v0(), v3.v1(), res);
//	}
//
//	/**
//	 * Multiplies the given vector {@code (v1x, v1y)} with the given vector {@code (v2x, v2y)}, adds
//	 * the given vector {@code (v3[0], v3[1])} to the product result and saves the result in the
//	 * given extraction parameter.
//	 * 
//	 * <p>
//	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
//	 * addition. The actual way of calculation depends on the implementation of the used
//	 * {@link MathProvider}.
//	 * 
//	 * <p>
//	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
//	 * calculation.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v1x, v1y) * (v2x, v2y) + (v3[0], v3[1])}
//	 * 
//	 * @param v1x
//	 *     The value of the x component of the first multiplicant vector.
//	 * @param v1y
//	 *     The value of the y component of the first multiplicant vector.
//	 * @param v2x
//	 *     The value of the x component of the second multiplicant vector.
//	 * @param v2y
//	 *     The value of the y component of the second multiplicant vector.
//	 * @param v3
//	 *     The addend vector as an array with at least two entries.
//	 * @param res
//	 *     The extraction parameter for the result as an array with at least two entries.
//	 * 
//	 * @return The extraction parameter with the result.
//	 */
//	public static float[] fma(float v1x, float v1y, float v2x, float v2y, float[] v3, @ExtractionParam float[] res)
//	{
//		return fma(v1x, v1y, v2x, v2y, v3[0], v3[1], res);
//	}
//
//	/**
//	 * Multiplies the given vector {@code (v1x, v1y)} with the given vector {@code (v2x, v2y)}, adds
//	 * the given vector {@code (v3x, v3y)} to the product result and saves the result in the given
//	 * extraction parameter.
//	 * 
//	 * <p>
//	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
//	 * addition. The actual way of calculation depends on the implementation of the used
//	 * {@link MathProvider}.
//	 * 
//	 * <p>
//	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
//	 * calculation.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v1x, v1y) * (v2x, v2y) + (v3x, v3y)}
//	 * 
//	 * @param v1x
//	 *     The value of the x component of the first multiplicant vector.
//	 * @param v1y
//	 *     The value of the y component of the first multiplicant vector.
//	 * @param v2x
//	 *     The value of the x component of the second multiplicant vector.
//	 * @param v2y
//	 *     The value of the y component of the second multiplicant vector.
//	 * @param v3x
//	 *     The value of the x component of the addend vector.
//	 * @param v3y
//	 *     The value of the y component of the addend vector.
//	 * @param res
//	 *     The extraction parameter for the result as an array with at least two entries.
//	 * 
//	 * @return The extraction parameter with the result.
//	 */
//	public static float[] fma(float v1x, float v1y, float v2x, float v2y, float v3x, float v3y, @ExtractionParam float[] res)
//	{
//		res[0] = MathUtils.fma(v1x, v2x, v3x);
//		res[1] = MathUtils.fma(v1y, v2y, v3y);
//		
//		return res;
//	}
//
//	/**
//	 * Multiplies the given vector {@code (v1)} with the given vector {@code (v2)}, adds the given
//	 * vector {@code (v3)} to the product result and saves the result in the given extraction
//	 * parameter object.
//	 * 
//	 * <p>
//	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
//	 * addition. The actual way of calculation depends on the implementation of the used
//	 * {@link MathProvider}.
//	 * 
//	 * <p>
//	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
//	 * calculation.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code  v1 * v2 + v3}
//	 * 
//	 * @param <T>
//	 *     The type of the result vector.
//	 * 
//	 * @param v1
//	 *     The first multiplicant vector.
//	 * @param v2
//	 *     The second multiplicant vector.
//	 * @param v3
//	 *     The addend vector.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T extends Tup2WF> T fma(Tup2RF v1, Tup2RF v2, Tup2RF v3, @ExtractionParam T res)
//	{
//		return fma(v1.v0(), v1.v1(), v2.v0(), v2.v1(), v3.v0(), v3.v1(), res);
//	}
//
//	/**
//	 * Multiplies the given vector {@code (v1)} with the given vector {@code (v2)}, adds the given
//	 * vector {@code (v3[0], v3[1])} to the product result and saves the result in the given
//	 * extraction parameter object.
//	 * 
//	 * <p>
//	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
//	 * addition. The actual way of calculation depends on the implementation of the used
//	 * {@link MathProvider}.
//	 * 
//	 * <p>
//	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
//	 * calculation.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code v1 * v2 + (v3[0], v3[1])}
//	 * 
//	 * @param <T>
//	 *     The type of the result vector.
//	 * 
//	 * @param v1
//	 *     The first multiplicant vector.
//	 * @param v2
//	 *     The second multiplicant vector.
//	 * @param v3
//	 *     The addend vector as an array with at least two entries.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T extends Tup2WF> T fma(Tup2RF v1, Tup2RF v2, float[] v3, @ExtractionParam T res)
//	{
//		return fma(v1.v0(), v1.v1(), v2.v0(), v2.v1(), v3[0], v3[1], res);
//	}
//
//	/**
//	 * Multiplies the given vector {@code (v1)} with the given vector {@code (v2)}, adds the given
//	 * vector {@code (v3x, v3y)} to the product result and saves the result in the given extraction
//	 * parameter object.
//	 * 
//	 * <p>
//	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
//	 * addition. The actual way of calculation depends on the implementation of the used
//	 * {@link MathProvider}.
//	 * 
//	 * <p>
//	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
//	 * calculation.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code v1 * v2 + (v3x, v3y)}
//	 * 
//	 * @param <T>
//	 *     The type of the result vector.
//	 * 
//	 * @param v1
//	 *     The first multiplicant vector.
//	 * @param v2
//	 *     The second multiplicant vector.
//	 * @param v3x
//	 *     The value of the x component of the addend vector.
//	 * @param v3y
//	 *     The value of the y component of the addend vector.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T extends Tup2WF> T fma(Tup2RF v1, Tup2RF v2, float v3x, float v3y, @ExtractionParam T res)
//	{
//		return fma(v1.v0(), v1.v1(), v2.v0(), v2.v1(), v3x, v3y, res);
//	}
//
//	/**
//	 * Multiplies the given vector {@code (v1)} with the given vector {@code (v2[0], v2[1])}, adds
//	 * the given vector {@code (v3)} to the product result and saves the result in the given
//	 * extraction parameter object.
//	 * 
//	 * <p>
//	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
//	 * addition. The actual way of calculation depends on the implementation of the used
//	 * {@link MathProvider}.
//	 * 
//	 * <p>
//	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
//	 * calculation.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code v1 * (v2[0], v2[1]) + v3}
//	 * 
//	 * @param <T>
//	 *     The type of the result vector.
//	 * 
//	 * @param v1
//	 *     The first multiplicant vector.
//	 * @param v2
//	 *     The second multiplicant vector as an array with at least two entries.
//	 * @param v3
//	 *     The addend vector.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T extends Tup2WF> T fma(Tup2RF v1, float[] v2, Tup2RF v3, @ExtractionParam T res)
//	{
//		return fma(v1.v0(), v1.v1(), v2[0], v2[1], v3.v0(), v3.v1(), res);
//	}
//
//	/**
//	 * Multiplies the given vector {@code (v1)} with the given vector {@code (v2[0], v2[1])}, adds
//	 * the given vector {@code (v3[0], v3[1])} to the product result and saves the result in the
//	 * given extraction parameter object.
//	 * 
//	 * <p>
//	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
//	 * addition. The actual way of calculation depends on the implementation of the used
//	 * {@link MathProvider}.
//	 * 
//	 * <p>
//	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
//	 * calculation.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code v1 * (v2[0], v2[1]) + (v3[0], v3[1])}
//	 * 
//	 * @param <T>
//	 *     The type of the result vector.
//	 * 
//	 * @param v1
//	 *     The first multiplicant vector.
//	 * @param v2
//	 *     The second multiplicant vector as an array with at least two entries.
//	 * @param v3
//	 *     The addend vector as an array with at least two entries.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T extends Tup2WF> T fma(Tup2RF v1, float[] v2, float[] v3, @ExtractionParam T res)
//	{
//		return fma(v1.v0(), v1.v1(), v2[0], v2[1], v3[0], v3[1], res);
//	}
//
//	/**
//	 * Multiplies the given vector {@code (v1)} with the given vector {@code (v2[0], v2[1])}, adds
//	 * the given vector {@code (v3x, v3y)} to the product result and saves the result in the given
//	 * extraction parameter object.
//	 * 
//	 * <p>
//	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
//	 * addition. The actual way of calculation depends on the implementation of the used
//	 * {@link MathProvider}.
//	 * 
//	 * <p>
//	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
//	 * calculation.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code v1 * (v2[0], v2[1]) + (v3x, v3y)}
//	 * 
//	 * @param <T>
//	 *     The type of the result vector.
//	 * 
//	 * @param v1
//	 *     The first multiplicant vector.
//	 * @param v2
//	 *     The second multiplicant vector as an array with at least two entries.
//	 * @param v3x
//	 *     The value of the x component of the addend vector.
//	 * @param v3y
//	 *     The value of the y component of the addend vector.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T extends Tup2WF> T fma(Tup2RF v1, float[] v2, float v3x, float v3y, @ExtractionParam T res)
//	{
//		return fma(v1.v0(), v1.v1(), v2[0], v2[1], v3x, v3y, res);
//	}
//
//	/**
//	 * Multiplies the given vector {@code (v1)} with the given vector {@code (v2x, v2y)}, adds the
//	 * given vector {@code (v3)} to the product result and saves the result in the given extraction
//	 * parameter object.
//	 * 
//	 * <p>
//	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
//	 * addition. The actual way of calculation depends on the implementation of the used
//	 * {@link MathProvider}.
//	 * 
//	 * <p>
//	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
//	 * calculation.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code v1 * (v2x, v2y) + v3}
//	 * 
//	 * @param <T>
//	 *     The type of the result vector.
//	 * 
//	 * @param v1
//	 *     The first multiplicant vector.
//	 * @param v2x
//	 *     The value of the x component of the second multiplicant vector.
//	 * @param v2y
//	 *     The value of the y component of the second multiplicant vector.
//	 * @param v3
//	 *     The addend vector.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T extends Tup2WF> T fma(Tup2RF v1, float v2x, float v2y, Tup2RF v3, @ExtractionParam T res)
//	{
//		return fma(v1.v0(), v1.v1(), v2x, v2y, v3.v0(), v3.v1(), res);
//	}
//
//	/**
//	 * Multiplies the given vector {@code (v1)} with the given vector {@code (v2x, v2y)}, adds the
//	 * given vector {@code (v3[0], v3[1])} to the product result and saves the result in the given
//	 * extraction parameter object.
//	 * 
//	 * <p>
//	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
//	 * addition. The actual way of calculation depends on the implementation of the used
//	 * {@link MathProvider}.
//	 * 
//	 * <p>
//	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
//	 * calculation.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code v1 * (v2x, v2y) + (v3[0], v3[1])}
//	 * 
//	 * @param <T>
//	 *     The type of the result vector.
//	 * 
//	 * @param v1
//	 *     The first multiplicant vector.
//	 * @param v2x
//	 *     The value of the x component of the second multiplicant vector.
//	 * @param v2y
//	 *     The value of the y component of the second multiplicant vector.
//	 * @param v3
//	 *     The addend vector as an array with at least two entries.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T extends Tup2WF> T fma(Tup2RF v1, float v2x, float v2y, float[] v3, @ExtractionParam T res)
//	{
//		return fma(v1.v0(), v1.v1(), v2x, v2y, v3[0], v3[1], res);
//	}
//
//	/**
//	 * Multiplies the given vector {@code (v1)} with the given vector {@code (v2x, v2y)}, adds the
//	 * given vector {@code (v3x, v3y)} to the product result and saves the result in the given
//	 * extraction parameter object.
//	 * 
//	 * <p>
//	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
//	 * addition. The actual way of calculation depends on the implementation of the used
//	 * {@link MathProvider}.
//	 * 
//	 * <p>
//	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
//	 * calculation.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code v1 * (v2x, v2y) + (v3x, v3y)}
//	 * 
//	 * @param <T>
//	 *     The type of the result vector.
//	 * 
//	 * @param v1
//	 *     The first multiplicant vector as an array with at least two entries.
//	 * @param v2x
//	 *     The value of the x component of the second multiplicant vector.
//	 * @param v2y
//	 *     The value of the y component of the second multiplicant vector.
//	 * @param v3x
//	 *     The value of the x component of the addend vector.
//	 * @param v3y
//	 *     The value of the y component of the addend vector.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T extends Tup2WF> T fma(Tup2RF v1, float v2x, float v2y, float v3x, float v3y, @ExtractionParam T res)
//	{
//		return fma(v1.v0(), v1.v1(), v2x, v2y, v3x, v3y, res);
//	}
//
//	/**
//	 * Multiplies the given vector {@code (v1[0], v1[1])} with the given vector {@code (v2)}, adds
//	 * the given vector {@code (v3)} to the product result and saves the result in the given
//	 * extraction parameter object.
//	 * 
//	 * <p>
//	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
//	 * addition. The actual way of calculation depends on the implementation of the used
//	 * {@link MathProvider}.
//	 * 
//	 * <p>
//	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
//	 * calculation.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v1[0], v1[1]) * v2 + v3}
//	 * 
//	 * @param <T>
//	 *     The type of the result vector.
//	 * 
//	 * @param v1
//	 *     The first multiplicant vector as an array with at least two entries.
//	 * @param v2
//	 *     The second multiplicant vector.
//	 * @param v3
//	 *     The addend vector.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T extends Tup2WF> T fma(float[] v1, Tup2RF v2, Tup2RF v3, @ExtractionParam T res)
//	{
//		return fma(v1[0], v1[1], v2.v0(), v2.v1(), v3.v0(), v3.v1(), res);
//	}
//
//	/**
//	 * Multiplies the given vector {@code (v1[0], v1[1])} with the given vector {@code (v2)}, adds
//	 * the given vector {@code (v3[0], v3[1])} to the product result and saves the result in the
//	 * given extraction parameter object.
//	 * 
//	 * <p>
//	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
//	 * addition. The actual way of calculation depends on the implementation of the used
//	 * {@link MathProvider}.
//	 * 
//	 * <p>
//	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
//	 * calculation.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v1[0], v1[1]) * v2 + (v3[0], v3[1])}
//	 * 
//	 * @param <T>
//	 *     The type of the result vector.
//	 * 
//	 * @param v1
//	 *     The first multiplicant vector as an array with at least two entries.
//	 * @param v2
//	 *     The second multiplicant vector.
//	 * @param v3
//	 *     The addend vector as an array with at least two entries.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T extends Tup2WF> T fma(float[] v1, Tup2RF v2, float[] v3, @ExtractionParam T res)
//	{
//		return fma(v1[0], v1[1], v2.v0(), v2.v1(), v3[0], v3[1], res);
//	}
//
//	/**
//	 * Multiplies the given vector {@code (v1[0], v1[1])} with the given vector {@code (v2)}, adds
//	 * the given vector {@code (v3x, v3y)} to the product result and saves the result in the given
//	 * extraction parameter object.
//	 * 
//	 * <p>
//	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
//	 * addition. The actual way of calculation depends on the implementation of the used
//	 * {@link MathProvider}.
//	 * 
//	 * <p>
//	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
//	 * calculation.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v1[0], v1[1]) * v2 + (v3x, v3y)}
//	 * 
//	 * @param <T>
//	 *     The type of the result vector.
//	 * 
//	 * @param v1
//	 *     The first multiplicant vector as an array with at least two entries.
//	 * @param v2
//	 *     The second multiplicant vector.
//	 * @param v3x
//	 *     The value of the x component of the addend vector.
//	 * @param v3y
//	 *     The value of the y component of the addend vector.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T extends Tup2WF> T fma(float[] v1, Tup2RF v2, float v3x, float v3y, @ExtractionParam T res)
//	{
//		return fma(v1[0], v1[1], v2.v0(), v2.v1(), v3x, v3y, res);
//	}
//
//	/**
//	 * Multiplies the given vector {@code (v1[0], v1[1])} with the given vector
//	 * {@code (v2[0], v2[1])}, adds the given vector {@code (v3)} to the product result and saves
//	 * the result in the given extraction parameter object.
//	 * 
//	 * <p>
//	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
//	 * addition. The actual way of calculation depends on the implementation of the used
//	 * {@link MathProvider}.
//	 * 
//	 * <p>
//	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
//	 * calculation.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v1[0], v1[1]) * (v2[0], v2[1]) + v3}
//	 * 
//	 * @param <T>
//	 *     The type of the result vector.
//	 * 
//	 * @param v1
//	 *     The first multiplicant vector as an array with at least two entries.
//	 * @param v2
//	 *     The second multiplicant vector as an array with at least two entries.
//	 * @param v3
//	 *     The addend vector.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T extends Tup2WF> T fma(float[] v1, float[] v2, Tup2RF v3, @ExtractionParam T res)
//	{
//		return fma(v1[0], v1[1], v2[0], v2[1], v3.v0(), v3.v1(), res);
//	}
//
//	/**
//	 * Multiplies the given vector {@code (v1[0], v1[1])} with the given vector
//	 * {@code (v2[0], v2[1])}, adds the given vector {@code (v3[0], v3[1])} to the product result
//	 * and saves the result in the given extraction parameter object.
//	 * 
//	 * <p>
//	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
//	 * addition. The actual way of calculation depends on the implementation of the used
//	 * {@link MathProvider}.
//	 * 
//	 * <p>
//	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
//	 * calculation.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v1[0], v1[1]) * (v2[0], v2[1]) + (v3[0], v3[1])}
//	 * 
//	 * @param <T>
//	 *     The type of the result vector.
//	 * 
//	 * @param v1
//	 *     The first multiplicant vector as an array with at least two entries.
//	 * @param v2
//	 *     The second multiplicant vector as an array with at least two entries.
//	 * @param v3
//	 *     The addend vector as an array with at least two entries.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T extends Tup2WF> T fma(float[] v1, float[] v2, float[] v3, @ExtractionParam T res)
//	{
//		return fma(v1[0], v1[1], v2[0], v2[1], v3[0], v3[1], res);
//	}
//
//	/**
//	 * Multiplies the given vector {@code (v1[0], v1[1])} with the given vector
//	 * {@code (v2[0], v2[1])}, adds the given vector {@code (v3x, v3y)} to the product result and
//	 * saves the result in the given extraction parameter object.
//	 * 
//	 * <p>
//	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
//	 * addition. The actual way of calculation depends on the implementation of the used
//	 * {@link MathProvider}.
//	 * 
//	 * <p>
//	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
//	 * calculation.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v1[0], v1[1]) * (v2[0], v2[1]) + (v3x, v3y)}
//	 * 
//	 * @param <T>
//	 *     The type of the result vector.
//	 * 
//	 * @param v1
//	 *     The first multiplicant vector as an array with at least two entries.
//	 * @param v2
//	 *     The second multiplicant vector as an array with at least two entries.
//	 * @param v3x
//	 *     The value of the x component of the addend vector.
//	 * @param v3y
//	 *     The value of the y component of the addend vector.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T extends Tup2WF> T fma(float[] v1, float[] v2, float v3x, float v3y, @ExtractionParam T res)
//	{
//		return fma(v1[0], v1[1], v2[0], v2[1], v3x, v3y, res);
//	}
//
//	/**
//	 * Multiplies the given vector {@code (v1[0], v1[1])} with the given vector {@code (v2x, v2y)},
//	 * adds the given vector {@code (v3)} to the product result and saves the result in the given
//	 * extraction parameter object.
//	 * 
//	 * <p>
//	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
//	 * addition. The actual way of calculation depends on the implementation of the used
//	 * {@link MathProvider}.
//	 * 
//	 * <p>
//	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
//	 * calculation.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v1[0], v1[1]) * (v2x, v2y) + v3}
//	 * 
//	 * @param <T>
//	 *     The type of the result vector.
//	 * 
//	 * @param v1
//	 *     The first multiplicant vector as an array with at least two entries.
//	 * @param v2x
//	 *     The value of the x component of the second multiplicant vector.
//	 * @param v2y
//	 *     The value of the y component of the second multiplicant vector.
//	 * @param v3
//	 *     The addend vector.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T extends Tup2WF> T fma(float[] v1, float v2x, float v2y, Tup2RF v3, @ExtractionParam T res)
//	{
//		return fma(v1[0], v1[1], v2x, v2y, v3.v0(), v3.v1(), res);
//	}
//
//	/**
//	 * Multiplies the given vector {@code (v1[0], v1[1])} with the given vector {@code (v2x, v2y)},
//	 * adds the given vector {@code (v3[0], v3[1])} to the product result and saves the result in
//	 * the given extraction parameter object.
//	 * 
//	 * <p>
//	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
//	 * addition. The actual way of calculation depends on the implementation of the used
//	 * {@link MathProvider}.
//	 * 
//	 * <p>
//	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
//	 * calculation.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v1[0], v1[1]) * (v2x, v2y) + (v3[0], v3[1])}
//	 * 
//	 * @param <T>
//	 *     The type of the result vector.
//	 * 
//	 * @param v1
//	 *     The first multiplicant vector as an array with at least two entries.
//	 * @param v2x
//	 *     The value of the x component of the second multiplicant vector.
//	 * @param v2y
//	 *     The value of the y component of the second multiplicant vector.
//	 * @param v3
//	 *     The addend vector as an array with at least two entries.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T extends Tup2WF> T fma(float[] v1, float v2x, float v2y, float[] v3, @ExtractionParam T res)
//	{
//		return fma(v1[0], v1[1], v2x, v2y, v3[0], v3[1], res);
//	}
//
//	/**
//	 * Multiplies the given vector {@code (v1[0], v1[1])} with the given vector {@code (v2x, v2y)},
//	 * adds the given vector {@code (v3x, v3y)} to the product result and saves the result in the
//	 * given extraction parameter object.
//	 * 
//	 * <p>
//	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
//	 * addition. The actual way of calculation depends on the implementation of the used
//	 * {@link MathProvider}.
//	 * 
//	 * <p>
//	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
//	 * calculation.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v1[0], v1[1]) * (v2x, v2y) + (v3x, v3y)}
//	 * 
//	 * @param <T>
//	 *     The type of the result vector.
//	 * 
//	 * @param v1
//	 *     The first multiplicant vector as an array with at least two entries.
//	 * @param v2x
//	 *     The value of the x component of the second multiplicant vector.
//	 * @param v2y
//	 *     The value of the y component of the second multiplicant vector.
//	 * @param v3x
//	 *     The value of the x component of the addend vector.
//	 * @param v3y
//	 *     The value of the y component of the addend vector.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T extends Tup2WF> T fma(float[] v1, float v2x, float v2y, float v3x, float v3y, @ExtractionParam T res)
//	{
//		return fma(v1[0], v1[1], v2x, v2y, v3x, v3y, res);
//	}
//
//	/**
//	 * Multiplies the given vector {@code (v1x, v1y)} with the given vector {@code (v2)}, adds the
//	 * given vector {@code (v3)} to the product result and saves the result in the given extraction
//	 * parameter object.
//	 * 
//	 * <p>
//	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
//	 * addition. The actual way of calculation depends on the implementation of the used
//	 * {@link MathProvider}.
//	 * 
//	 * <p>
//	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
//	 * calculation.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v1x, v1y) * v2 + v3}
//	 * 
//	 * @param <T>
//	 *     The type of the result vector.
//	 * 
//	 * @param v1x
//	 *     The value of the x component of the first multiplicant vector.
//	 * @param v1y
//	 *     The value of the y component of the first multiplicant vector.
//	 * @param v2
//	 *     The second multiplicant vector.
//	 * @param v3
//	 *     The addend vector.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T extends Tup2WF> T fma(float v1x, float v1y, Tup2RF v2, Tup2RF v3, @ExtractionParam T res)
//	{
//		return fma(v1x, v1y, v2.v0(), v2.v1(), v3.v0(), v3.v1(), res);
//	}
//
//	/**
//	 * Multiplies the given vector {@code (v1x, v1y)} with the given vector {@code (v2)}, adds the
//	 * given vector {@code (v3[0], v3[1])} to the product result and saves the result in the given
//	 * extraction parameter object.
//	 * 
//	 * <p>
//	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
//	 * addition. The actual way of calculation depends on the implementation of the used
//	 * {@link MathProvider}.
//	 * 
//	 * <p>
//	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
//	 * calculation.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v1x, v1y) * v2 + (v3[0], v3[1])}
//	 * 
//	 * @param <T>
//	 *     The type of the result vector.
//	 * 
//	 * @param v1x
//	 *     The value of the x component of the first multiplicant vector.
//	 * @param v1y
//	 *     The value of the y component of the first multiplicant vector.
//	 * @param v2
//	 *     The second multiplicant vector.
//	 * @param v3
//	 *     The addend vector as an array with at least two entries.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T extends Tup2WF> T fma(float v1x, float v1y, Tup2RF v2, float[] v3, @ExtractionParam T res)
//	{
//		return fma(v1x, v1y, v2.v0(), v2.v1(), v3[0], v3[1], res);
//	}
//
//	/**
//	 * Multiplies the given vector {@code (v1x, v1y)} with the given vector {@code (v2)}, adds the
//	 * given vector {@code (v3x, v3y)} to the product result and saves the result in the given
//	 * extraction parameter object.
//	 * 
//	 * <p>
//	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
//	 * addition. The actual way of calculation depends on the implementation of the used
//	 * {@link MathProvider}.
//	 * 
//	 * <p>
//	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
//	 * calculation.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v1x, v1y) * v2 + (v3x, v3y)}
//	 * 
//	 * @param <T>
//	 *     The type of the result vector.
//	 * 
//	 * @param v1x
//	 *     The value of the x component of the first multiplicant vector.
//	 * @param v1y
//	 *     The value of the y component of the first multiplicant vector.
//	 * @param v2
//	 *     The second multiplicant vector.
//	 * @param v3x
//	 *     The value of the x component of the addend vector.
//	 * @param v3y
//	 *     The value of the y component of the addend vector.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T extends Tup2WF> T fma(float v1x, float v1y, Tup2RF v2, float v3x, float v3y, @ExtractionParam T res)
//	{
//		return fma(v1x, v1y, v2.v0(), v2.v1(), v3x, v3y, res);
//	}
//
//	/**
//	 * Multiplies the given vector {@code (v1x, v1y)} with the given vector {@code (v2[0], v2[1])},
//	 * adds the given vector {@code (v3)} to the product result and saves the result in the given
//	 * extraction parameter object.
//	 * 
//	 * <p>
//	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
//	 * addition. The actual way of calculation depends on the implementation of the used
//	 * {@link MathProvider}.
//	 * 
//	 * <p>
//	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
//	 * calculation.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v1x, v1y) * (v2[0], v2[1]) + v3}
//	 * 
//	 * @param <T>
//	 *     The type of the result vector.
//	 * 
//	 * @param v1x
//	 *     The value of the x component of the first multiplicant vector.
//	 * @param v1y
//	 *     The value of the y component of the first multiplicant vector.
//	 * @param v2
//	 *     The second multiplicant vector as an array with at least two entries.
//	 * @param v3
//	 *     The addend vector.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T extends Tup2WF> T fma(float v1x, float v1y, float[] v2, Tup2RF v3, @ExtractionParam T res)
//	{
//		return fma(v1x, v1y, v2[0], v2[1], v3.v0(), v3.v1(), res);
//	}
//
//	/**
//	 * Multiplies the given vector {@code (v1x, v1y)} with the given vector {@code (v2[0], v2[1])},
//	 * adds the given vector {@code (v3[0], v3[1])} to the product result and saves the result in
//	 * the given extraction parameter object.
//	 * 
//	 * <p>
//	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
//	 * addition. The actual way of calculation depends on the implementation of the used
//	 * {@link MathProvider}.
//	 * 
//	 * <p>
//	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
//	 * calculation.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v1x, v1y) * (v2[0], v2[1]) + (v3[0], v3[1])}
//	 * 
//	 * @param <T>
//	 *     The type of the result vector.
//	 * 
//	 * @param v1x
//	 *     The value of the x component of the first multiplicant vector.
//	 * @param v1y
//	 *     The value of the y component of the first multiplicant vector.
//	 * @param v2
//	 *     The second multiplicant vector as an array with at least two entries.
//	 * @param v3
//	 *     The addend vector as an array with at least two entries.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T extends Tup2WF> T fma(float v1x, float v1y, float[] v2, float[] v3, @ExtractionParam T res)
//	{
//		return fma(v1x, v1y, v2[0], v2[1], v3[0], v3[1], res);
//	}
//
//	/**
//	 * Multiplies the given vector {@code (v1x, v1y)} with the given vector {@code (v2[0], v2[1])},
//	 * adds the given vector {@code (v3x, v3y)} to the product result and saves the result in the
//	 * given extraction parameter object.
//	 * 
//	 * <p>
//	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
//	 * addition. The actual way of calculation depends on the implementation of the used
//	 * {@link MathProvider}.
//	 * 
//	 * <p>
//	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
//	 * calculation.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v1x, v1y) * (v2[0], v2[1]) + (v3x, v3y)}
//	 * 
//	 * @param <T>
//	 *     The type of the result vector.
//	 * 
//	 * @param v1x
//	 *     The value of the x component of the first multiplicant vector.
//	 * @param v1y
//	 *     The value of the y component of the first multiplicant vector.
//	 * @param v2
//	 *     The second multiplicant vector as an array with at least two entries.
//	 * @param v3x
//	 *     The value of the x component of the addend vector.
//	 * @param v3y
//	 *     The value of the y component of the addend vector.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T extends Tup2WF> T fma(float v1x, float v1y, float[] v2, float v3x, float v3y, @ExtractionParam T res)
//	{
//		return fma(v1x, v1y, v2[0], v2[1], v3x, v3y, res);
//	}
//
//	/**
//	 * Multiplies the given vector {@code (v1x, v1y)} with the given vector {@code (v2x, v2y)}, adds
//	 * the given vector {@code (v3)} to the product result and saves the result in the given
//	 * extraction parameter object.
//	 * 
//	 * <p>
//	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
//	 * addition. The actual way of calculation depends on the implementation of the used
//	 * {@link MathProvider}.
//	 * 
//	 * <p>
//	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
//	 * calculation.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v1x, v1y) * (v2x, v2y) + v3}
//	 * 
//	 * @param <T>
//	 *     The type of the result vector.
//	 * 
//	 * @param v1x
//	 *     The value of the x component of the first multiplicant vector.
//	 * @param v1y
//	 *     The value of the y component of the first multiplicant vector.
//	 * @param v2x
//	 *     The value of the x component of the second multiplicant vector.
//	 * @param v2y
//	 *     The value of the y component of the second multiplicant vector.
//	 * @param v3
//	 *     The addend vector.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T extends Tup2WF> T fma(float v1x, float v1y, float v2x, float v2y, Tup2RF v3, @ExtractionParam T res)
//	{
//		return fma(v1x, v1y, v2x, v2y, v3.v0(), v3.v1(), res);
//	}
//
//	/**
//	 * Multiplies the given vector {@code (v1x, v1y)} with the given vector {@code (v2x, v2y)}, adds
//	 * the given vector {@code (v3[0], v3[1])} to the product result and saves the result in the
//	 * given extraction parameter object.
//	 * 
//	 * <p>
//	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
//	 * addition. The actual way of calculation depends on the implementation of the used
//	 * {@link MathProvider}.
//	 * 
//	 * <p>
//	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
//	 * calculation.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v1x, v1y) * (v2x, v2y) + (v3[0], v3[1])}
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter.
//	 * 
//	 * @param v1x
//	 *     The value of the x component of the first multiplicant vector.
//	 * @param v1y
//	 *     The value of the y component of the first multiplicant vector.
//	 * @param v2x
//	 *     The value of the x component of the second multiplicant vector.
//	 * @param v2y
//	 *     The value of the y component of the second multiplicant vector.
//	 * @param v3
//	 *     The addend vector as an array with at least two entries.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T extends Tup2WF> T fma(float v1x, float v1y, float v2x, float v2y, float[] v3, @ExtractionParam T res)
//	{
//		return fma(v1x, v1y, v2x, v2y, v3[0], v3[1], res);
//	}
//
//	/**
//	 * Multiplies the given vector {@code (v1x, v1y)} with the given vector {@code (v2x, v2y)}, adds
//	 * the given vector {@code (v3x, v3y)} to the product result and saves the result in the given
//	 * extraction parameter object.
//	 * 
//	 * <p>
//	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
//	 * addition. The actual way of calculation depends on the implementation of the used
//	 * {@link MathProvider}.
//	 * 
//	 * <p>
//	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
//	 * calculation.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v1x, v1y) * (v2x, v2y) + (v3x, v3y)}
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter.
//	 * 
//	 * @param v1x
//	 *     The value of the x component of the first multiplicant vector.
//	 * @param v1y
//	 *     The value of the y component of the first multiplicant vector.
//	 * @param v2x
//	 *     The value of the x component of the second multiplicant vector.
//	 * @param v2y
//	 *     The value of the y component of the second multiplicant vector.
//	 * @param v3x
//	 *     The value of the x component of the addend vector.
//	 * @param v3y
//	 *     The value of the y component of the addend vector.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T extends Tup2WF> T fma(float v1x, float v1y, float v2x, float v2y, float v3x, float v3y, @ExtractionParam T res)
//	{
//		res.set(MathUtils.fma(v1x, v2x, v3x), MathUtils.fma(v1y, v2y, v3y));
//		
//		return res;
//	}
//
//	/**
//	 * Multiplies the given vector {@code (v1)} with the given vector {@code (v2)}, adds the given
//	 * vector {@code (v3)} to the product result and saves the result in the given extraction
//	 * parameter object.
//	 * 
//	 * <p>
//	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
//	 * addition. The actual way of calculation depends on the implementation of the used
//	 * {@link MathProvider}.
//	 * 
//	 * <p>
//	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
//	 * calculation.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code  v1 * v2 + v3}
//	 * 
//	 * @param <T>
//	 *     The type of the result vector.
//	 * 
//	 * @param v1
//	 *     The first multiplicant vector.
//	 * @param v2
//	 *     The second multiplicant vector.
//	 * @param v3
//	 *     The addend vector.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T> T fmaFunc(Tup2RF v1, Tup2RF v2, Tup2RF v3, Function2F<T> func)
//	{
//		return fmaFunc(v1.v0(), v1.v1(), v2.v0(), v2.v1(), v3.v0(), v3.v1(), func);
//	}
//
//	/**
//	 * Multiplies the given vector {@code (v1)} with the given vector {@code (v2)}, adds the given
//	 * vector {@code (v3[0], v3[1])} to the product result and saves the result in the given
//	 * extraction parameter object.
//	 * 
//	 * <p>
//	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
//	 * addition. The actual way of calculation depends on the implementation of the used
//	 * {@link MathProvider}.
//	 * 
//	 * <p>
//	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
//	 * calculation.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code v1 * v2 + (v3[0], v3[1])}
//	 * 
//	 * @param <T>
//	 *     The type of the result vector.
//	 * 
//	 * @param v1
//	 *     The first multiplicant vector.
//	 * @param v2
//	 *     The second multiplicant vector.
//	 * @param v3
//	 *     The addend vector as an array with at least two entries.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T> T fmaFunc(Tup2RF v1, Tup2RF v2, float[] v3, Function2F<T> func)
//	{
//		return fmaFunc(v1.v0(), v1.v1(), v2.v0(), v2.v1(), v3[0], v3[1], func);
//	}
//
//	/**
//	 * Multiplies the given vector {@code (v1)} with the given vector {@code (v2)}, adds the given
//	 * vector {@code (v3x, v3y)} to the product result and saves the result in the given extraction
//	 * parameter object.
//	 * 
//	 * <p>
//	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
//	 * addition. The actual way of calculation depends on the implementation of the used
//	 * {@link MathProvider}.
//	 * 
//	 * <p>
//	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
//	 * calculation.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code v1 * v2 + (v3x, v3y)}
//	 * 
//	 * @param <T>
//	 *     The type of the result vector.
//	 * 
//	 * @param v1
//	 *     The first multiplicant vector.
//	 * @param v2
//	 *     The second multiplicant vector.
//	 * @param v3x
//	 *     The value of the x component of the addend vector.
//	 * @param v3y
//	 *     The value of the y component of the addend vector.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T> T fmaFunc(Tup2RF v1, Tup2RF v2, float v3x, float v3y, Function2F<T> func)
//	{
//		return fmaFunc(v1.v0(), v1.v1(), v2.v0(), v2.v1(), v3x, v3y, func);
//	}
//
//	/**
//	 * Multiplies the given vector {@code (v1)} with the given vector {@code (v2[0], v2[1])}, adds
//	 * the given vector {@code (v3)} to the product result and saves the result in the given
//	 * extraction parameter object.
//	 * 
//	 * <p>
//	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
//	 * addition. The actual way of calculation depends on the implementation of the used
//	 * {@link MathProvider}.
//	 * 
//	 * <p>
//	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
//	 * calculation.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code v1 * (v2[0], v2[1]) + v3}
//	 * 
//	 * @param <T>
//	 *     The type of the result vector.
//	 * 
//	 * @param v1
//	 *     The first multiplicant vector.
//	 * @param v2
//	 *     The second multiplicant vector as an array with at least two entries.
//	 * @param v3
//	 *     The addend vector.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T> T fmaFunc(Tup2RF v1, float[] v2, Tup2RF v3, Function2F<T> func)
//	{
//		return fmaFunc(v1.v0(), v1.v1(), v2[0], v2[1], v3.v0(), v3.v1(), func);
//	}
//
//	/**
//	 * Multiplies the given vector {@code (v1)} with the given vector {@code (v2[0], v2[1])}, adds
//	 * the given vector {@code (v3[0], v3[1])} to the product result and saves the result in the
//	 * given extraction parameter object.
//	 * 
//	 * <p>
//	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
//	 * addition. The actual way of calculation depends on the implementation of the used
//	 * {@link MathProvider}.
//	 * 
//	 * <p>
//	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
//	 * calculation.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code v1 * (v2[0], v2[1]) + (v3[0], v3[1])}
//	 * 
//	 * @param <T>
//	 *     The type of the result vector.
//	 * 
//	 * @param v1
//	 *     The first multiplicant vector.
//	 * @param v2
//	 *     The second multiplicant vector as an array with at least two entries.
//	 * @param v3
//	 *     The addend vector as an array with at least two entries.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T> T fmaFunc(Tup2RF v1, float[] v2, float[] v3, Function2F<T> func)
//	{
//		return fmaFunc(v1.v0(), v1.v1(), v2[0], v2[1], v3[0], v3[1], func);
//	}
//
//	/**
//	 * Multiplies the given vector {@code (v1)} with the given vector {@code (v2[0], v2[1])}, adds
//	 * the given vector {@code (v3x, v3y)} to the product result and saves the result in the given
//	 * extraction parameter object.
//	 * 
//	 * <p>
//	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
//	 * addition. The actual way of calculation depends on the implementation of the used
//	 * {@link MathProvider}.
//	 * 
//	 * <p>
//	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
//	 * calculation.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code v1 * (v2[0], v2[1]) + (v3x, v3y)}
//	 * 
//	 * @param <T>
//	 *     The type of the result vector.
//	 * 
//	 * @param v1
//	 *     The first multiplicant vector.
//	 * @param v2
//	 *     The second multiplicant vector as an array with at least two entries.
//	 * @param v3x
//	 *     The value of the x component of the addend vector.
//	 * @param v3y
//	 *     The value of the y component of the addend vector.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T> T fmaFunc(Tup2RF v1, float[] v2, float v3x, float v3y, Function2F<T> func)
//	{
//		return fmaFunc(v1.v0(), v1.v1(), v2[0], v2[1], v3x, v3y, func);
//	}
//
//	/**
//	 * Multiplies the given vector {@code (v1)} with the given vector {@code (v2x, v2y)}, adds the
//	 * given vector {@code (v3)} to the product result and saves the result in the given extraction
//	 * parameter object.
//	 * 
//	 * <p>
//	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
//	 * addition. The actual way of calculation depends on the implementation of the used
//	 * {@link MathProvider}.
//	 * 
//	 * <p>
//	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
//	 * calculation.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code v1 * (v2x, v2y) + v3}
//	 * 
//	 * @param <T>
//	 *     The type of the result vector.
//	 * 
//	 * @param v1
//	 *     The first multiplicant vector.
//	 * @param v2x
//	 *     The value of the x component of the second multiplicant vector.
//	 * @param v2y
//	 *     The value of the y component of the second multiplicant vector.
//	 * @param v3
//	 *     The addend vector.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T> T fmaFunc(Tup2RF v1, float v2x, float v2y, Tup2RF v3, Function2F<T> func)
//	{
//		return fmaFunc(v1.v0(), v1.v1(), v2x, v2y, v3.v0(), v3.v1(), func);
//	}
//
//	/**
//	 * Multiplies the given vector {@code (v1)} with the given vector {@code (v2x, v2y)}, adds the
//	 * given vector {@code (v3[0], v3[1])} to the product result and saves the result in the given
//	 * extraction parameter object.
//	 * 
//	 * <p>
//	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
//	 * addition. The actual way of calculation depends on the implementation of the used
//	 * {@link MathProvider}.
//	 * 
//	 * <p>
//	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
//	 * calculation.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code v1 * (v2x, v2y) + (v3[0], v3[1])}
//	 * 
//	 * @param <T>
//	 *     The type of the result vector.
//	 * 
//	 * @param v1
//	 *     The first multiplicant vector.
//	 * @param v2x
//	 *     The value of the x component of the second multiplicant vector.
//	 * @param v2y
//	 *     The value of the y component of the second multiplicant vector.
//	 * @param v3
//	 *     The addend vector as an array with at least two entries.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T> T fmaFunc(Tup2RF v1, float v2x, float v2y, float[] v3, Function2F<T> func)
//	{
//		return fmaFunc(v1.v0(), v1.v1(), v2x, v2y, v3[0], v3[1], func);
//	}
//
//	/**
//	 * Multiplies the given vector {@code (v1)} with the given vector {@code (v2x, v2y)}, adds the
//	 * given vector {@code (v3x, v3y)} to the product result and saves the result in the given
//	 * extraction parameter object.
//	 * 
//	 * <p>
//	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
//	 * addition. The actual way of calculation depends on the implementation of the used
//	 * {@link MathProvider}.
//	 * 
//	 * <p>
//	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
//	 * calculation.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code v1 * (v2x, v2y) + (v3x, v3y)}
//	 * 
//	 * @param <T>
//	 *     The type of the result vector.
//	 * 
//	 * @param v1
//	 *     The first multiplicant vector as an array with at least two entries.
//	 * @param v2x
//	 *     The value of the x component of the second multiplicant vector.
//	 * @param v2y
//	 *     The value of the y component of the second multiplicant vector.
//	 * @param v3x
//	 *     The value of the x component of the addend vector.
//	 * @param v3y
//	 *     The value of the y component of the addend vector.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T> T fmaFunc(Tup2RF v1, float v2x, float v2y, float v3x, float v3y, Function2F<T> func)
//	{
//		return fmaFunc(v1.v0(), v1.v1(), v2x, v2y, v3x, v3y, func);
//	}
//
//	/**
//	 * Multiplies the given vector {@code (v1[0], v1[1])} with the given vector {@code (v2)}, adds
//	 * the given vector {@code (v3)} to the product result and saves the result in the given
//	 * extraction parameter object.
//	 * 
//	 * <p>
//	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
//	 * addition. The actual way of calculation depends on the implementation of the used
//	 * {@link MathProvider}.
//	 * 
//	 * <p>
//	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
//	 * calculation.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v1[0], v1[1]) * v2 + v3}
//	 * 
//	 * @param <T>
//	 *     The type of the result vector.
//	 * 
//	 * @param v1
//	 *     The first multiplicant vector as an array with at least two entries.
//	 * @param v2
//	 *     The second multiplicant vector.
//	 * @param v3
//	 *     The addend vector.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T> T fmaFunc(float[] v1, Tup2RF v2, Tup2RF v3, Function2F<T> func)
//	{
//		return fmaFunc(v1[0], v1[1], v2.v0(), v2.v1(), v3.v0(), v3.v1(), func);
//	}
//
//	/**
//	 * Multiplies the given vector {@code (v1[0], v1[1])} with the given vector {@code (v2)}, adds
//	 * the given vector {@code (v3[0], v3[1])} to the product result and saves the result in the
//	 * given extraction parameter object.
//	 * 
//	 * <p>
//	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
//	 * addition. The actual way of calculation depends on the implementation of the used
//	 * {@link MathProvider}.
//	 * 
//	 * <p>
//	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
//	 * calculation.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v1[0], v1[1]) * v2 + (v3[0], v3[1])}
//	 * 
//	 * @param <T>
//	 *     The type of the result vector.
//	 * 
//	 * @param v1
//	 *     The first multiplicant vector as an array with at least two entries.
//	 * @param v2
//	 *     The second multiplicant vector.
//	 * @param v3
//	 *     The addend vector as an array with at least two entries.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T> T fmaFunc(float[] v1, Tup2RF v2, float[] v3, Function2F<T> func)
//	{
//		return fmaFunc(v1[0], v1[1], v2.v0(), v2.v1(), v3[0], v3[1], func);
//	}
//
//	/**
//	 * Multiplies the given vector {@code (v1[0], v1[1])} with the given vector {@code (v2)}, adds
//	 * the given vector {@code (v3x, v3y)} to the product result and saves the result in the given
//	 * extraction parameter object.
//	 * 
//	 * <p>
//	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
//	 * addition. The actual way of calculation depends on the implementation of the used
//	 * {@link MathProvider}.
//	 * 
//	 * <p>
//	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
//	 * calculation.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v1[0], v1[1]) * v2 + (v3x, v3y)}
//	 * 
//	 * @param <T>
//	 *     The type of the result vector.
//	 * 
//	 * @param v1
//	 *     The first multiplicant vector as an array with at least two entries.
//	 * @param v2
//	 *     The second multiplicant vector.
//	 * @param v3x
//	 *     The value of the x component of the addend vector.
//	 * @param v3y
//	 *     The value of the y component of the addend vector.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T> T fmaFunc(float[] v1, Tup2RF v2, float v3x, float v3y, Function2F<T> func)
//	{
//		return fmaFunc(v1[0], v1[1], v2.v0(), v2.v1(), v3x, v3y, func);
//	}
//
//	/**
//	 * Multiplies the given vector {@code (v1[0], v1[1])} with the given vector
//	 * {@code (v2[0], v2[1])}, adds the given vector {@code (v3)} to the product result and saves
//	 * the result in the given extraction parameter object.
//	 * 
//	 * <p>
//	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
//	 * addition. The actual way of calculation depends on the implementation of the used
//	 * {@link MathProvider}.
//	 * 
//	 * <p>
//	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
//	 * calculation.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v1[0], v1[1]) * (v2[0], v2[1]) + v3}
//	 * 
//	 * @param <T>
//	 *     The type of the result vector.
//	 * 
//	 * @param v1
//	 *     The first multiplicant vector as an array with at least two entries.
//	 * @param v2
//	 *     The second multiplicant vector as an array with at least two entries.
//	 * @param v3
//	 *     The addend vector.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T> T fmaFunc(float[] v1, float[] v2, Tup2RF v3, Function2F<T> func)
//	{
//		return fmaFunc(v1[0], v1[1], v2[0], v2[1], v3.v0(), v3.v1(), func);
//	}
//
//	/**
//	 * Multiplies the given vector {@code (v1[0], v1[1])} with the given vector
//	 * {@code (v2[0], v2[1])}, adds the given vector {@code (v3[0], v3[1])} to the product result
//	 * and saves the result in the given extraction parameter object.
//	 * 
//	 * <p>
//	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
//	 * addition. The actual way of calculation depends on the implementation of the used
//	 * {@link MathProvider}.
//	 * 
//	 * <p>
//	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
//	 * calculation.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v1[0], v1[1]) * (v2[0], v2[1]) + (v3[0], v3[1])}
//	 * 
//	 * @param <T>
//	 *     The type of the result vector.
//	 * 
//	 * @param v1
//	 *     The first multiplicant vector as an array with at least two entries.
//	 * @param v2
//	 *     The second multiplicant vector as an array with at least two entries.
//	 * @param v3
//	 *     The addend vector as an array with at least two entries.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T> T fmaFunc(float[] v1, float[] v2, float[] v3, Function2F<T> func)
//	{
//		return fmaFunc(v1[0], v1[1], v2[0], v2[1], v3[0], v3[1], func);
//	}
//
//	/**
//	 * Multiplies the given vector {@code (v1[0], v1[1])} with the given vector
//	 * {@code (v2[0], v2[1])}, adds the given vector {@code (v3x, v3y)} to the product result and
//	 * saves the result in the given extraction parameter object.
//	 * 
//	 * <p>
//	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
//	 * addition. The actual way of calculation depends on the implementation of the used
//	 * {@link MathProvider}.
//	 * 
//	 * <p>
//	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
//	 * calculation.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v1[0], v1[1]) * (v2[0], v2[1]) + (v3x, v3y)}
//	 * 
//	 * @param <T>
//	 *     The type of the result vector.
//	 * 
//	 * @param v1
//	 *     The first multiplicant vector as an array with at least two entries.
//	 * @param v2
//	 *     The second multiplicant vector as an array with at least two entries.
//	 * @param v3x
//	 *     The value of the x component of the addend vector.
//	 * @param v3y
//	 *     The value of the y component of the addend vector.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T> T fmaFunc(float[] v1, float[] v2, float v3x, float v3y, Function2F<T> func)
//	{
//		return fmaFunc(v1[0], v1[1], v2[0], v2[1], v3x, v3y, func);
//	}
//
//	/**
//	 * Multiplies the given vector {@code (v1[0], v1[1])} with the given vector {@code (v2x, v2y)},
//	 * adds the given vector {@code (v3)} to the product result and saves the result in the given
//	 * extraction parameter object.
//	 * 
//	 * <p>
//	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
//	 * addition. The actual way of calculation depends on the implementation of the used
//	 * {@link MathProvider}.
//	 * 
//	 * <p>
//	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
//	 * calculation.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v1[0], v1[1]) * (v2x, v2y) + v3}
//	 * 
//	 * @param <T>
//	 *     The type of the result vector.
//	 * 
//	 * @param v1
//	 *     The first multiplicant vector as an array with at least two entries.
//	 * @param v2x
//	 *     The value of the x component of the second multiplicant vector.
//	 * @param v2y
//	 *     The value of the y component of the second multiplicant vector.
//	 * @param v3
//	 *     The addend vector.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T> T fmaFunc(float[] v1, float v2x, float v2y, Tup2RF v3, Function2F<T> func)
//	{
//		return fmaFunc(v1[0], v1[1], v2x, v2y, v3.v0(), v3.v1(), func);
//	}
//
//	/**
//	 * Multiplies the given vector {@code (v1[0], v1[1])} with the given vector {@code (v2x, v2y)},
//	 * adds the given vector {@code (v3[0], v3[1])} to the product result and saves the result in
//	 * the given extraction parameter object.
//	 * 
//	 * <p>
//	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
//	 * addition. The actual way of calculation depends on the implementation of the used
//	 * {@link MathProvider}.
//	 * 
//	 * <p>
//	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
//	 * calculation.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v1[0], v1[1]) * (v2x, v2y) + (v3[0], v3[1])}
//	 * 
//	 * @param <T>
//	 *     The type of the result vector.
//	 * 
//	 * @param v1
//	 *     The first multiplicant vector as an array with at least two entries.
//	 * @param v2x
//	 *     The value of the x component of the second multiplicant vector.
//	 * @param v2y
//	 *     The value of the y component of the second multiplicant vector.
//	 * @param v3
//	 *     The addend vector as an array with at least two entries.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T> T fmaFunc(float[] v1, float v2x, float v2y, float[] v3, Function2F<T> func)
//	{
//		return fmaFunc(v1[0], v1[1], v2x, v2y, v3[0], v3[1], func);
//	}
//
//	/**
//	 * Multiplies the given vector {@code (v1[0], v1[1])} with the given vector {@code (v2x, v2y)},
//	 * adds the given vector {@code (v3x, v3y)} to the product result and saves the result in the
//	 * given extraction parameter object.
//	 * 
//	 * <p>
//	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
//	 * addition. The actual way of calculation depends on the implementation of the used
//	 * {@link MathProvider}.
//	 * 
//	 * <p>
//	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
//	 * calculation.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v1[0], v1[1]) * (v2x, v2y) + (v3x, v3y)}
//	 * 
//	 * @param <T>
//	 *     The type of the result vector.
//	 * 
//	 * @param v1
//	 *     The first multiplicant vector as an array with at least two entries.
//	 * @param v2x
//	 *     The value of the x component of the second multiplicant vector.
//	 * @param v2y
//	 *     The value of the y component of the second multiplicant vector.
//	 * @param v3x
//	 *     The value of the x component of the addend vector.
//	 * @param v3y
//	 *     The value of the y component of the addend vector.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T> T fmaFunc(float[] v1, float v2x, float v2y, float v3x, float v3y, Function2F<T> func)
//	{
//		return fmaFunc(v1[0], v1[1], v2x, v2y, v3x, v3y, func);
//	}
//
//	/**
//	 * Multiplies the given vector {@code (v1x, v1y)} with the given vector {@code (v2)}, adds the
//	 * given vector {@code (v3)} to the product result and saves the result in the given extraction
//	 * parameter object.
//	 * 
//	 * <p>
//	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
//	 * addition. The actual way of calculation depends on the implementation of the used
//	 * {@link MathProvider}.
//	 * 
//	 * <p>
//	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
//	 * calculation.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v1x, v1y) * v2 + v3}
//	 * 
//	 * @param <T>
//	 *     The type of the result vector.
//	 * 
//	 * @param v1x
//	 *     The value of the x component of the first multiplicant vector.
//	 * @param v1y
//	 *     The value of the y component of the first multiplicant vector.
//	 * @param v2
//	 *     The second multiplicant vector.
//	 * @param v3
//	 *     The addend vector.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T> T fmaFunc(float v1x, float v1y, Tup2RF v2, Tup2RF v3, Function2F<T> func)
//	{
//		return fmaFunc(v1x, v1y, v2.v0(), v2.v1(), v3.v0(), v3.v1(), func);
//	}
//
//	/**
//	 * Multiplies the given vector {@code (v1x, v1y)} with the given vector {@code (v2)}, adds the
//	 * given vector {@code (v3[0], v3[1])} to the product result and saves the result in the given
//	 * extraction parameter object.
//	 * 
//	 * <p>
//	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
//	 * addition. The actual way of calculation depends on the implementation of the used
//	 * {@link MathProvider}.
//	 * 
//	 * <p>
//	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
//	 * calculation.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v1x, v1y) * v2 + (v3[0], v3[1])}
//	 * 
//	 * @param <T>
//	 *     The type of the result vector.
//	 * 
//	 * @param v1x
//	 *     The value of the x component of the first multiplicant vector.
//	 * @param v1y
//	 *     The value of the y component of the first multiplicant vector.
//	 * @param v2
//	 *     The second multiplicant vector.
//	 * @param v3
//	 *     The addend vector as an array with at least two entries.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T> T fmaFunc(float v1x, float v1y, Tup2RF v2, float[] v3, Function2F<T> func)
//	{
//		return fmaFunc(v1x, v1y, v2.v0(), v2.v1(), v3[0], v3[1], func);
//	}
//
//	/**
//	 * Multiplies the given vector {@code (v1x, v1y)} with the given vector {@code (v2)}, adds the
//	 * given vector {@code (v3x, v3y)} to the product result and saves the result in the given
//	 * extraction parameter object.
//	 * 
//	 * <p>
//	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
//	 * addition. The actual way of calculation depends on the implementation of the used
//	 * {@link MathProvider}.
//	 * 
//	 * <p>
//	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
//	 * calculation.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v1x, v1y) * v2 + (v3x, v3y)}
//	 * 
//	 * @param <T>
//	 *     The type of the result vector.
//	 * 
//	 * @param v1x
//	 *     The value of the x component of the first multiplicant vector.
//	 * @param v1y
//	 *     The value of the y component of the first multiplicant vector.
//	 * @param v2
//	 *     The second multiplicant vector.
//	 * @param v3x
//	 *     The value of the x component of the addend vector.
//	 * @param v3y
//	 *     The value of the y component of the addend vector.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T> T fmaFunc(float v1x, float v1y, Tup2RF v2, float v3x, float v3y, Function2F<T> func)
//	{
//		return fmaFunc(v1x, v1y, v2.v0(), v2.v1(), v3x, v3y, func);
//	}
//
//	/**
//	 * Multiplies the given vector {@code (v1x, v1y)} with the given vector {@code (v2[0], v2[1])},
//	 * adds the given vector {@code (v3)} to the product result and saves the result in the given
//	 * extraction parameter object.
//	 * 
//	 * <p>
//	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
//	 * addition. The actual way of calculation depends on the implementation of the used
//	 * {@link MathProvider}.
//	 * 
//	 * <p>
//	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
//	 * calculation.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v1x, v1y) * (v2[0], v2[1]) + v3}
//	 * 
//	 * @param <T>
//	 *     The type of the result vector.
//	 * 
//	 * @param v1x
//	 *     The value of the x component of the first multiplicant vector.
//	 * @param v1y
//	 *     The value of the y component of the first multiplicant vector.
//	 * @param v2
//	 *     The second multiplicant vector as an array with at least two entries.
//	 * @param v3
//	 *     The addend vector.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T> T fmaFunc(float v1x, float v1y, float[] v2, Tup2RF v3, Function2F<T> func)
//	{
//		return fmaFunc(v1x, v1y, v2[0], v2[1], v3.v0(), v3.v1(), func);
//	}
//
//	/**
//	 * Multiplies the given vector {@code (v1x, v1y)} with the given vector {@code (v2[0], v2[1])},
//	 * adds the given vector {@code (v3[0], v3[1])} to the product result and saves the result in
//	 * the given extraction parameter object.
//	 * 
//	 * <p>
//	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
//	 * addition. The actual way of calculation depends on the implementation of the used
//	 * {@link MathProvider}.
//	 * 
//	 * <p>
//	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
//	 * calculation.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v1x, v1y) * (v2[0], v2[1]) + (v3[0], v3[1])}
//	 * 
//	 * @param <T>
//	 *     The type of the result vector.
//	 * 
//	 * @param v1x
//	 *     The value of the x component of the first multiplicant vector.
//	 * @param v1y
//	 *     The value of the y component of the first multiplicant vector.
//	 * @param v2
//	 *     The second multiplicant vector as an array with at least two entries.
//	 * @param v3
//	 *     The addend vector as an array with at least two entries.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T> T fmaFunc(float v1x, float v1y, float[] v2, float[] v3, Function2F<T> func)
//	{
//		return fmaFunc(v1x, v1y, v2[0], v2[1], v3[0], v3[1], func);
//	}
//
//	/**
//	 * Multiplies the given vector {@code (v1x, v1y)} with the given vector {@code (v2[0], v2[1])},
//	 * adds the given vector {@code (v3x, v3y)} to the product result and saves the result in the
//	 * given extraction parameter object.
//	 * 
//	 * <p>
//	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
//	 * addition. The actual way of calculation depends on the implementation of the used
//	 * {@link MathProvider}.
//	 * 
//	 * <p>
//	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
//	 * calculation.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v1x, v1y) * (v2[0], v2[1]) + (v3x, v3y)}
//	 * 
//	 * @param <T>
//	 *     The type of the result vector.
//	 * 
//	 * @param v1x
//	 *     The value of the x component of the first multiplicant vector.
//	 * @param v1y
//	 *     The value of the y component of the first multiplicant vector.
//	 * @param v2
//	 *     The second multiplicant vector as an array with at least two entries.
//	 * @param v3x
//	 *     The value of the x component of the addend vector.
//	 * @param v3y
//	 *     The value of the y component of the addend vector.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T> T fmaFunc(float v1x, float v1y, float[] v2, float v3x, float v3y, Function2F<T> func)
//	{
//		return fmaFunc(v1x, v1y, v2[0], v2[1], v3x, v3y, func);
//	}
//
//	/**
//	 * Multiplies the given vector {@code (v1x, v1y)} with the given vector {@code (v2x, v2y)}, adds
//	 * the given vector {@code (v3)} to the product result and saves the result in the given
//	 * extraction parameter object.
//	 * 
//	 * <p>
//	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
//	 * addition. The actual way of calculation depends on the implementation of the used
//	 * {@link MathProvider}.
//	 * 
//	 * <p>
//	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
//	 * calculation.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v1x, v1y) * (v2x, v2y) + v3}
//	 * 
//	 * @param <T>
//	 *     The type of the result vector.
//	 * 
//	 * @param v1x
//	 *     The value of the x component of the first multiplicant vector.
//	 * @param v1y
//	 *     The value of the y component of the first multiplicant vector.
//	 * @param v2x
//	 *     The value of the x component of the second multiplicant vector.
//	 * @param v2y
//	 *     The value of the y component of the second multiplicant vector.
//	 * @param v3
//	 *     The addend vector.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T> T fmaFunc(float v1x, float v1y, float v2x, float v2y, Tup2RF v3, Function2F<T> func)
//	{
//		return fmaFunc(v1x, v1y, v2x, v2y, v3.v0(), v3.v1(), func);
//	}
//
//	/**
//	 * Multiplies the given vector {@code (v1x, v1y)} with the given vector {@code (v2x, v2y)}, adds
//	 * the given vector {@code (v3[0], v3[1])} to the product result and saves the result in the
//	 * given extraction parameter object.
//	 * 
//	 * <p>
//	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
//	 * addition. The actual way of calculation depends on the implementation of the used
//	 * {@link MathProvider}.
//	 * 
//	 * <p>
//	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
//	 * calculation.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v1x, v1y) * (v2x, v2y) + (v3[0], v3[1])}
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter.
//	 * 
//	 * @param v1x
//	 *     The value of the x component of the first multiplicant vector.
//	 * @param v1y
//	 *     The value of the y component of the first multiplicant vector.
//	 * @param v2x
//	 *     The value of the x component of the second multiplicant vector.
//	 * @param v2y
//	 *     The value of the y component of the second multiplicant vector.
//	 * @param v3
//	 *     The addend vector as an array with at least two entries.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T> T fmaFunc(float v1x, float v1y, float v2x, float v2y, float[] v3, Function2F<T> func)
//	{
//		return fmaFunc(v1x, v1y, v2x, v2y, v3[0], v3[1], func);
//	}
//
//	/**
//	 * Multiplies the given vector {@code (v1x, v1y)} with the given vector {@code (v2x, v2y)}, adds
//	 * the given vector {@code (v3x, v3y)} to the product result and saves the result in the given
//	 * extraction parameter object.
//	 * 
//	 * <p>
//	 * This performs a {@link Math#fma(float, float, float)} style fused multiplication and
//	 * addition. The actual way of calculation depends on the implementation of the used
//	 * {@link MathProvider}.
//	 * 
//	 * <p>
//	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
//	 * calculation.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v1x, v1y) * (v2x, v2y) + (v3x, v3y)}
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter.
//	 * 
//	 * @param v1x
//	 *     The value of the x component of the first multiplicant vector.
//	 * @param v1y
//	 *     The value of the y component of the first multiplicant vector.
//	 * @param v2x
//	 *     The value of the x component of the second multiplicant vector.
//	 * @param v2y
//	 *     The value of the y component of the second multiplicant vector.
//	 * @param v3x
//	 *     The value of the x component of the addend vector.
//	 * @param v3y
//	 *     The value of the y component of the addend vector.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T> T fmaFunc(float v1x, float v1y, float v2x, float v2y, float v3x, float v3y, Function2F<T> func)
//	{
//		return func.apply2F(MathUtils.fma(v1x, v2x, v3x), MathUtils.fma(v1y, v2y, v3y));
//	}
//	
//	/**
//	 * Determines the smallest value of the components of the vector {@code (v)} and saves the value
//	 * and the component index in the extraction parameter object. If two or more components have
//	 * the same value the first index will be returned.
//	 * 
//	 * <p>
//	 * The index returned is limited to the range of {@code 0-1}.
//	 * 
//	 * @param v
//	 *     The vector.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static IndexValuePairF min(Tup2RF v, @ExtractionParam IndexValuePairF res)
//	{
//		return min(v.v0(), v.v1(), res);
//	}
//
//	/**
//	 * Determines the smallest value of the components of the vector {@code (v[0], v[1])} and saves
//	 * the value and the component index in the extraction parameter object. If two or more
//	 * components have the same value the first index will be returned.
//	 * 
//	 * <p>
//	 * The index returned is limited to the range of {@code 0-1}.
//	 * 
//	 * @param v
//	 *     The vector as an array with at least two entries.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static IndexValuePairF min(float[] v, @ExtractionParam IndexValuePairF res)
//	{
//		return min(v[0], v[1], res);
//	}
//
//	/**
//	 * Determines the smallest value of the components of the vector {@code (x, y)} and saves the
//	 * value and the component index in the extraction parameter object. If two or more components
//	 * have the same value the first index will be returned.
//	 * 
//	 * <p>
//	 * The index returned is limited to the range of {@code 0-1}.
//	 * 
//	 * @param x
//	 *     The value of the x component of the vector.
//	 * @param y
//	 *     The value of the y component of the vector.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static IndexValuePairF min(float x, float y, @ExtractionParam IndexValuePairF res)
//	{
//		float value = x;
//		int index = 0;
//		
//		if (y < value)
//		{
//			value = y;
//			index = 1;
//		}
//		
//		res.set(value, index);
//		
//		return res;
//	}
//
//	/**
//	 * Determines the component wise smallest value of the vector {@code (v1)} and the vector
//	 * {@code (v2)} and saves the result in the extraction parameter.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code min(v1, v2)}
//	 * 
//	 * @param v1
//	 *     The first vector.
//	 * @param v2
//	 *     The second vector.
//	 * @param res
//	 *     The extraction parameter for the result as an array with at least two entries.
//	 * 
//	 * @return The extraction parameter with the result.
//	 */
//	public static float[] compMin(Tup2RF v1, Tup2RF v2, @ExtractionParam float[] res)
//	{
//		return compMin(v1.v0(), v1.v1(), v2.v0(), v2.v1(), res);
//	}
//
//	/**
//	 * Determines the component wise smallest value of the vector {@code (v1)} and the vector
//	 * {@code (v2[0], v2[1])} and saves the result in the extraction parameter.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code min(v1, (v2[0], v2[1]))}
//	 * 
//	 * @param v1
//	 *     The first vector.
//	 * @param v2
//	 *     The second vector as an array with at least two entries.
//	 * @param res
//	 *     The extraction parameter for the result as an array with at least two entries.
//	 * 
//	 * @return The extraction parameter with the result.
//	 */
//	public static float[] compMin(Tup2RF v1, float[] v2, @ExtractionParam float[] res)
//	{
//		return compMin(v1.v0(), v1.v1(), v2[0], v2[1], res);
//	}
//
//	/**
//	 * Determines the component wise smallest value of the vector {@code (v1)} and the vector
//	 * {@code (v2x, v2y)} and saves the result in the extraction parameter.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code min(v1, (v2x, v2y))}
//	 * 
//	 * @param v1
//	 *     The first vector.
//	 * @param v2x
//	 *     The value of the x component of the second vector.
//	 * @param v2y
//	 *     The value of the y component of the second vector.
//	 * @param res
//	 *     The extraction parameter for the result as an array with at least two entries.
//	 * 
//	 * @return The extraction parameter with the result.
//	 */
//	public static float[] compMin(Tup2RF v1, float v2x, float v2y, @ExtractionParam float[] res)
//	{
//		return compMin(v1.v0(), v1.v1(), v2x, v2y, res);
//	}
//
//	/**
//	 * Determines the component wise smallest value of the vector {@code (v1[0], v1[1])} and the
//	 * vector {@code (v2)} and saves the result in the extraction parameter.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code min((v1[0], v1[1]), v2)}
//	 * 
//	 * @param v1
//	 *     The first vector as an array with at least two entries.
//	 * @param v2
//	 *     The second vector.
//	 * @param res
//	 *     The extraction parameter for the result as an array with at least two entries.
//	 * 
//	 * @return The extraction parameter with the result.
//	 */
//	public static float[] compMin(float[] v1, Tup2RF v2, @ExtractionParam float[] res)
//	{
//		return compMin(v1[0], v1[1], v2.v0(), v2.v1(), res);
//	}
//
//	/**
//	 * Determines the component wise smallest value of the vector {@code (v1[0], v1[1])} and the
//	 * vector {@code (v2[0], v2[1])} and saves the result in the extraction parameter.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code min((v1[0], v1[1]), (v2[0], v2[1]))}
//	 * 
//	 * @param v1
//	 *     The first vector as an array with at least two entries.
//	 * @param v2
//	 *     The second vector as an array with at least two entries.
//	 * @param res
//	 *     The extraction parameter for the result as an array with at least two entries.
//	 * 
//	 * @return The extraction parameter with the result.
//	 */
//	public static float[] compMin(float[] v1, float[] v2, @ExtractionParam float[] res)
//	{
//		return compMin(v1[0], v1[1], v2[0], v2[1], res);
//	}
//
//	/**
//	 * Determines the component wise smallest value of the vector {@code (v1[0], v1[1])} and the
//	 * vector {@code (v2x, v2y)} and saves the result in the extraction parameter.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code min((v1[0], v1[1]), (v2x, v2y))}
//	 * 
//	 * @param v1
//	 *     The first vector as an array with at least two entries.
//	 * @param v2x
//	 *     The value of the x component of the second vector.
//	 * @param v2y
//	 *     The value of the y component of the second vector.
//	 * @param res
//	 *     The extraction parameter for the result as an array with at least two entries.
//	 * 
//	 * @return The extraction parameter with the result.
//	 */
//	public static float[] compMin(float[] v1, float v2x, float v2y, @ExtractionParam float[] res)
//	{
//		return compMin(v1[0], v1[1], v2x, v2y, res);
//	}
//
//	/**
//	 * Determines the component wise smallest value of the vector {@code (v1x, v1y)} and the vector
//	 * {@code (v2)} and saves the result in the extraction parameter.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code min((v1x, v1y), v2)}
//	 * 
//	 * @param v1x
//	 *     The value of the x component of the first vector.
//	 * @param v1y
//	 *     The value of the y component of the first vector.
//	 * @param v2
//	 *     The second vector.
//	 * @param res
//	 *     The extraction parameter for the result as an array with at least two entries.
//	 * 
//	 * @return The extraction parameter with the result.
//	 */
//	public static float[] compMin(float v1x, float v1y, Tup2RF v2, @ExtractionParam float[] res)
//	{
//		return compMin(v1x, v1y, v2.v0(), v2.v1(), res);
//	}
//
//	/**
//	 * Determines the component wise smallest value of the vector {@code (v1x, v1y)} and the vector
//	 * {@code (v2[0], v2[1])} and saves the result in the extraction parameter.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code min((v1x, v1y), (v2[0], v2[1]))}
//	 * 
//	 * @param v1x
//	 *     The value of the x component of the first vector.
//	 * @param v1y
//	 *     The value of the y component of the first vector.
//	 * @param v2
//	 *     The second vector as an array with at least two entries.
//	 * @param res
//	 *     The extraction parameter for the result as an array with at least two entries.
//	 * 
//	 * @return The extraction parameter with the result.
//	 */
//	public static float[] compMin(float v1x, float v1y, float[] v2, @ExtractionParam float[] res)
//	{
//		return compMin(v1x, v1y, v2[0], v2[1], res);
//	}
//
//	/**
//	 * Determines the component wise smallest value of the vector {@code (v1x, v1y)} and the vector
//	 * {@code (v2x, v2y)} and saves the result in the extraction parameter.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code min((v1x, v1y), (v2x, v2y))}
//	 * 
//	 * @param v1x
//	 *     The value of the x component of the first vector.
//	 * @param v1y
//	 *     The value of the y component of the first vector.
//	 * @param v2x
//	 *     The value of the x component of the second vector.
//	 * @param v2y
//	 *     The value of the y component of the second vector.
//	 * @param res
//	 *     The extraction parameter for the result as an array with at least two entries.
//	 * 
//	 * @return The extraction parameter with the result.
//	 */
//	public static float[] compMin(float v1x, float v1y, float v2x, float v2y, @ExtractionParam float[] res)
//	{
//		res[0] = Math.min(v1x, v2x);
//		res[1] = Math.min(v1y, v2y);
//		
//		return res;
//	}
//
//	/**
//	 * Determines the component wise smallest value of the vector {@code (v1)} and the vector
//	 * {@code (v2)} and saves the result in the extraction parameter object.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code min(v1, v2)}
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param v1
//	 *     The first vector.
//	 * @param v2
//	 *     The second vector.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T extends Tup2WF> T compMin(Tup2RF v1, Tup2RF v2, @ExtractionParam T res)
//	{
//		return compMin(v1.v0(), v1.v1(), v2.v0(), v2.v1(), res);
//	}
//
//	/**
//	 * Determines the component wise smallest value of the vector {@code (v1)} and the vector
//	 * {@code (v2[0], v2[1])} and saves the result in the extraction parameter object.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code min(v1, (v2[0], v2[1]))}
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param v1
//	 *     The first vector.
//	 * @param v2
//	 *     The second vector as an array with at least two entries.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T extends Tup2WF> T compMin(Tup2RF v1, float[] v2, @ExtractionParam T res)
//	{
//		return compMin(v1.v0(), v1.v1(), v2[0], v2[1], res);
//	}
//
//	/**
//	 * Determines the component wise smallest value of the vector {@code (v1)} and the vector
//	 * {@code (v2x, v2y)} and saves the result in the extraction parameter object.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code min(v1, (v2x, v2y))}
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param v1
//	 *     The first vector.
//	 * @param v2x
//	 *     The value of the x component of the second vector.
//	 * @param v2y
//	 *     The value of the y component of the second vector.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T extends Tup2WF> T compMin(Tup2RF v1, float v2x, float v2y, @ExtractionParam T res)
//	{
//		return compMin(v1.v0(), v1.v1(), v2x, v2y, res);
//	}
//
//	/**
//	 * Determines the component wise smallest value of the vector {@code (v1[0], v1[1])} and the
//	 * vector {@code (v2)} and saves the result in the extraction parameter object.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code min((v1[0], v1[1]), v2)}
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param v1
//	 *     The first vector as an array with at least two entries.
//	 * @param v2
//	 *     The second vector.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T extends Tup2WF> T compMin(float[] v1, Tup2RF v2, @ExtractionParam T res)
//	{
//		return compMin(v1[0], v1[1], v2.v0(), v2.v1(), res);
//	}
//
//	/**
//	 * Determines the component wise smallest value of the vector {@code (v1[0], v1[1])} and the
//	 * vector {@code (v2[0], v2[1])} and saves the result in the extraction parameter object.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code min((v1[0], v1[1]), (v2[0], v2[1]))}
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param v1
//	 *     The first vector as an array with at least two entries.
//	 * @param v2
//	 *     The second vector as an array with at least two entries.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T extends Tup2WF> T compMin(float[] v1, float[] v2, @ExtractionParam T res)
//	{
//		return compMin(v1[0], v1[1], v2[0], v2[1], res);
//	}
//
//	/**
//	 * Determines the component wise smallest value of the vector {@code (v1[0], v1[1])} and the
//	 * vector {@code (v2x, v2y)} and saves the result in the extraction parameter object.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code min((v1[0], v1[1]), (v2x, v2y))}
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param v1
//	 *     The first vector as an array with at least two entries.
//	 * @param v2x
//	 *     The value of the x component of the second vector.
//	 * @param v2y
//	 *     The value of the y component of the second vector.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T extends Tup2WF> T compMin(float[] v1, float v2x, float v2y, @ExtractionParam T res)
//	{
//		return compMin(v1[0], v1[1], v2x, v2y, res);
//	}
//
//	/**
//	 * Determines the component wise smallest value of the vector {@code (v1x, v1y)} and the vector
//	 * {@code (v2)} and saves the result in the extraction parameter object.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code min((v1x, v1y), v2)}
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param v1x
//	 *     The value of the x component of the first vector.
//	 * @param v1y
//	 *     The value of the y component of the first vector.
//	 * @param v2
//	 *     The second vector.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T extends Tup2WF> T compMin(float v1x, float v1y, Tup2RF v2, @ExtractionParam T res)
//	{
//		return compMin(v1x, v1y, v2.v0(), v2.v1(), res);
//	}
//
//	/**
//	 * Determines the component wise smallest value of the vector {@code (v1x, v1y)} and the vector
//	 * {@code (v2[0], v2[1])} and saves the result in the extraction parameter object.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code min((v1x, v1y), (v2[0], v2[1]))}
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param v1x
//	 *     The value of the x component of the first vector.
//	 * @param v1y
//	 *     The value of the y component of the first vector.
//	 * @param v2
//	 *     The second vector as an array with at least two entries.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T extends Tup2WF> T compMin(float v1x, float v1y, float[] v2, @ExtractionParam T res)
//	{
//		return compMin(v1x, v1y, v2[0], v2[1], res);
//	}
//
//	/**
//	 * Determines the component wise smallest value of the vector {@code (v1x, v1y)} and the vector
//	 * {@code (v2x, v2y)} and saves the result in the extraction parameter object.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code min((v1x, v1y), (v2x, v2y))}
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param v1x
//	 *     The value of the x component of the first vector.
//	 * @param v1y
//	 *     The value of the y component of the first vector.
//	 * @param v2x
//	 *     The value of the x component of the second vector.
//	 * @param v2y
//	 *     The value of the y component of the second vector.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T extends Tup2WF> T compMin(float v1x, float v1y, float v2x, float v2y, @ExtractionParam T res)
//	{
//		res.set(Math.min(v1x, v2x), Math.min(v1y, v2y));
//		
//		return res;
//	}
//
//	/**
//	 * Determines the component wise smallest value of the vector {@code (v1)} and the vector
//	 * {@code (v2)} and saves the result in the extraction parameter object.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code min(v1, v2)}
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param v1
//	 *     The first vector.
//	 * @param v2
//	 *     The second vector.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T> T compMinFunc(Tup2RF v1, Tup2RF v2, Function2F<T> func)
//	{
//		return compMinFunc(v1.v0(), v1.v1(), v2.v0(), v2.v1(), func);
//	}
//
//	/**
//	 * Determines the component wise smallest value of the vector {@code (v1)} and the vector
//	 * {@code (v2[0], v2[1])} and saves the result in the extraction parameter object.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code min(v1, (v2[0], v2[1]))}
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param v1
//	 *     The first vector.
//	 * @param v2
//	 *     The second vector as an array with at least two entries.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T> T compMinFunc(Tup2RF v1, float[] v2, Function2F<T> func)
//	{
//		return compMinFunc(v1.v0(), v1.v1(), v2[0], v2[1], func);
//	}
//
//	/**
//	 * Determines the component wise smallest value of the vector {@code (v1)} and the vector
//	 * {@code (v2x, v2y)} and saves the result in the extraction parameter object.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code min(v1, (v2x, v2y))}
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param v1
//	 *     The first vector.
//	 * @param v2x
//	 *     The value of the x component of the second vector.
//	 * @param v2y
//	 *     The value of the y component of the second vector.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T> T compMinFunc(Tup2RF v1, float v2x, float v2y, Function2F<T> func)
//	{
//		return compMinFunc(v1.v0(), v1.v1(), v2x, v2y, func);
//	}
//
//	/**
//	 * Determines the component wise smallest value of the vector {@code (v1[0], v1[1])} and the
//	 * vector {@code (v2)} and saves the result in the extraction parameter object.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code min((v1[0], v1[1]), v2)}
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param v1
//	 *     The first vector as an array with at least two entries.
//	 * @param v2
//	 *     The second vector.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T> T compMinFunc(float[] v1, Tup2RF v2, Function2F<T> func)
//	{
//		return compMinFunc(v1[0], v1[1], v2.v0(), v2.v1(), func);
//	}
//
//	/**
//	 * Determines the component wise smallest value of the vector {@code (v1[0], v1[1])} and the
//	 * vector {@code (v2[0], v2[1])} and saves the result in the extraction parameter object.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code min((v1[0], v1[1]), (v2[0], v2[1]))}
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param v1
//	 *     The first vector as an array with at least two entries.
//	 * @param v2
//	 *     The second vector as an array with at least two entries.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T> T compMinFunc(float[] v1, float[] v2, Function2F<T> func)
//	{
//		return compMinFunc(v1[0], v1[1], v2[0], v2[1], func);
//	}
//
//	/**
//	 * Determines the component wise smallest value of the vector {@code (v1[0], v1[1])} and the
//	 * vector {@code (v2x, v2y)} and saves the result in the extraction parameter object.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code min((v1[0], v1[1]), (v2x, v2y))}
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param v1
//	 *     The first vector as an array with at least two entries.
//	 * @param v2x
//	 *     The value of the x component of the second vector.
//	 * @param v2y
//	 *     The value of the y component of the second vector.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T> T compMinFunc(float[] v1, float v2x, float v2y, Function2F<T> func)
//	{
//		return compMinFunc(v1[0], v1[1], v2x, v2y, func);
//	}
//
//	/**
//	 * Determines the component wise smallest value of the vector {@code (v1x, v1y)} and the vector
//	 * {@code (v2)} and saves the result in the extraction parameter object.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code min((v1x, v1y), v2)}
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param v1x
//	 *     The value of the x component of the first vector.
//	 * @param v1y
//	 *     The value of the y component of the first vector.
//	 * @param v2
//	 *     The second vector.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T> T compMinFunc(float v1x, float v1y, Tup2RF v2, Function2F<T> func)
//	{
//		return compMinFunc(v1x, v1y, v2.v0(), v2.v1(), func);
//	}
//
//	/**
//	 * Determines the component wise smallest value of the vector {@code (v1x, v1y)} and the vector
//	 * {@code (v2[0], v2[1])} and saves the result in the extraction parameter object.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code min((v1x, v1y), (v2[0], v2[1]))}
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param v1x
//	 *     The value of the x component of the first vector.
//	 * @param v1y
//	 *     The value of the y component of the first vector.
//	 * @param v2
//	 *     The second vector as an array with at least two entries.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T> T compMinFunc(float v1x, float v1y, float[] v2, Function2F<T> func)
//	{
//		return compMinFunc(v1x, v1y, v2[0], v2[1], func);
//	}
//
//	/**
//	 * Determines the component wise smallest value of the vector {@code (v1x, v1y)} and the vector
//	 * {@code (v2x, v2y)} and saves the result in the extraction parameter object.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code min((v1x, v1y), (v2x, v2y))}
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param v1x
//	 *     The value of the x component of the first vector.
//	 * @param v1y
//	 *     The value of the y component of the first vector.
//	 * @param v2x
//	 *     The value of the x component of the second vector.
//	 * @param v2y
//	 *     The value of the y component of the second vector.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T> T compMinFunc(float v1x, float v1y, float v2x, float v2y, Function2F<T> func)
//	{
//		return func.apply2F(Math.min(v1x, v2x), Math.min(v1y, v2y));
//	}
//	
//	/**
//	 * Determines the greatest value of the components of the vector {@code (v)} and saves the value
//	 * and the component index in the extraction parameter object. If two or more components have
//	 * the same value the first index will be returned.
//	 * 
//	 * <p>
//	 * The index returned is limited to the range of {@code 0-1}.
//	 * 
//	 * @param v
//	 *     The vector.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static IndexValuePairF max(Tup2RF v, @ExtractionParam IndexValuePairF res)
//	{
//		return max(v.v0(), v.v1(), res);
//	}
//
//	/**
//	 * Determines the greatest value of the components of the vector {@code (v[0], v[1])} and saves
//	 * the value and the component index in the extraction parameter object. If two or more
//	 * components have the same value the first index will be returned.
//	 * 
//	 * <p>
//	 * The index returned is limited to the range of {@code 0-1}.
//	 * 
//	 * @param v
//	 *     The vector as an array with at least two entries.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static IndexValuePairF max(float[] v, @ExtractionParam IndexValuePairF res)
//	{
//		return max(v[0], v[1], res);
//	}
//
//	/**
//	 * Determines the greatest value of the components of the vector {@code (x, y)} and saves the
//	 * value and the component index in the extraction parameter object. If two or more components
//	 * have the same value the first index will be returned.
//	 * 
//	 * <p>
//	 * The index returned is limited to the range of {@code 0-1}.
//	 * 
//	 * @param x
//	 *     The value of the x component of the vector.
//	 * @param y
//	 *     The value of the y component of the vector.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static IndexValuePairF max(float x, float y, @ExtractionParam IndexValuePairF res)
//	{
//		float value = x;
//		int index = 0;
//		
//		if (y > value)
//		{
//			value = y;
//			index = 1;
//		}
//		
//		res.set(value, index);
//		
//		return res;
//	}
//
//	/**
//	 * Determines the component wise greatest value of the vector {@code (v1)} and the vector
//	 * {@code (v2)} and saves the result in the extraction parameter.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code max(v1, v2)}
//	 * 
//	 * @param v1
//	 *     The first vector.
//	 * @param v2
//	 *     The second vector.
//	 * @param res
//	 *     The extraction parameter for the result as an array with at least two entries.
//	 * 
//	 * @return The extraction parameter with the result.
//	 */
//	public static float[] compMax(Tup2RF v1, Tup2RF v2, @ExtractionParam float[] res)
//	{
//		return compMax(v1.v0(), v1.v1(), v2.v0(), v2.v1(), res);
//	}
//
//	/**
//	 * Determines the component wise greatest value of the vector {@code (v1)} and the vector
//	 * {@code (v2[0], v2[1])} and saves the result in the extraction parameter.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code max(v1, (v2[0], v2[1]))}
//	 * 
//	 * @param v1
//	 *     The first vector.
//	 * @param v2
//	 *     The second vector as an array with at least two entries.
//	 * @param res
//	 *     The extraction parameter for the result as an array with at least two entries.
//	 * 
//	 * @return The extraction parameter with the result.
//	 */
//	public static float[] compMax(Tup2RF v1, float[] v2, @ExtractionParam float[] res)
//	{
//		return compMax(v1.v0(), v1.v1(), v2[0], v2[1], res);
//	}
//
//	/**
//	 * Determines the component wise greatest value of the vector {@code (v1)} and the vector
//	 * {@code (v2x, v2y)} and saves the result in the extraction parameter.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code max(v1, (v2x, v2y))}
//	 * 
//	 * @param v1
//	 *     The first vector.
//	 * @param v2x
//	 *     The value of the x component of the second vector.
//	 * @param v2y
//	 *     The value of the y component of the second vector.
//	 * @param res
//	 *     The extraction parameter for the result as an array with at least two entries.
//	 * 
//	 * @return The extraction parameter with the result.
//	 */
//	public static float[] compMax(Tup2RF v1, float v2x, float v2y, @ExtractionParam float[] res)
//	{
//		return compMax(v1.v0(), v1.v1(), v2x, v2y, res);
//	}
//
//	/**
//	 * Determines the component wise greatest value of the vector {@code (v1[0], v1[1])} and the
//	 * vector {@code (v2)} and saves the result in the extraction parameter.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code max((v1[0], v1[1]), v2)}
//	 * 
//	 * @param v1
//	 *     The first vector as an array with at least two entries.
//	 * @param v2
//	 *     The second vector.
//	 * @param res
//	 *     The extraction parameter for the result as an array with at least two entries.
//	 * 
//	 * @return The extraction parameter with the result.
//	 */
//	public static float[] compMax(float[] v1, Tup2RF v2, @ExtractionParam float[] res)
//	{
//		return compMax(v1[0], v1[1], v2.v0(), v2.v1(), res);
//	}
//
//	/**
//	 * Determines the component wise greatest value of the vector {@code (v1[0], v1[1])} and the
//	 * vector {@code (v2[0], v2[1])} and saves the result in the extraction parameter.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code max((v1[0], v1[1]), (v2[0], v2[1]))}
//	 * 
//	 * @param v1
//	 *     The first vector as an array with at least two entries.
//	 * @param v2
//	 *     The second vector as an array with at least two entries.
//	 * @param res
//	 *     The extraction parameter for the result as an array with at least two entries.
//	 * 
//	 * @return The extraction parameter with the result.
//	 */
//	public static float[] compMax(float[] v1, float[] v2, @ExtractionParam float[] res)
//	{
//		return compMax(v1[0], v1[1], v2[0], v2[1], res);
//	}
//
//	/**
//	 * Determines the component wise greatest value of the vector {@code (v1[0], v1[1])} and the
//	 * vector {@code (v2x, v2y)} and saves the result in the extraction parameter.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code max((v1[0], v1[1]), (v2x, v2y))}
//	 * 
//	 * @param v1
//	 *     The first vector as an array with at least two entries.
//	 * @param v2x
//	 *     The value of the x component of the second vector.
//	 * @param v2y
//	 *     The value of the y component of the second vector.
//	 * @param res
//	 *     The extraction parameter for the result as an array with at least two entries.
//	 * 
//	 * @return The extraction parameter with the result.
//	 */
//	public static float[] compMax(float[] v1, float v2x, float v2y, @ExtractionParam float[] res)
//	{
//		return compMax(v1[0], v1[1], v2x, v2y, res);
//	}
//
//	/**
//	 * Determines the component wise greatest value of the vector {@code (v1x, v1y)} and the vector
//	 * {@code (v2)} and saves the result in the extraction parameter.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code max((v1x, v1y), v2)}
//	 * 
//	 * @param v1x
//	 *     The value of the x component of the first vector.
//	 * @param v1y
//	 *     The value of the y component of the first vector.
//	 * @param v2
//	 *     The second vector.
//	 * @param res
//	 *     The extraction parameter for the result as an array with at least two entries.
//	 * 
//	 * @return The extraction parameter with the result.
//	 */
//	public static float[] compMax(float v1x, float v1y, Tup2RF v2, @ExtractionParam float[] res)
//	{
//		return compMax(v1x, v1y, v2.v0(), v2.v1(), res);
//	}
//
//	/**
//	 * Determines the component wise greatest value of the vector {@code (v1x, v1y)} and the vector
//	 * {@code (v2[0], v2[1])} and saves the result in the extraction parameter.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code max((v1x, v1y), (v2[0], v2[1]))}
//	 * 
//	 * @param v1x
//	 *     The value of the x component of the first vector.
//	 * @param v1y
//	 *     The value of the y component of the first vector.
//	 * @param v2
//	 *     The second vector as an array with at least two entries.
//	 * @param res
//	 *     The extraction parameter for the result as an array with at least two entries.
//	 * 
//	 * @return The extraction parameter with the result.
//	 */
//	public static float[] compMax(float v1x, float v1y, float[] v2, @ExtractionParam float[] res)
//	{
//		return compMax(v1x, v1y, v2[0], v2[1], res);
//	}
//
//	/**
//	 * Determines the component wise greatest value of the vector {@code (v1x, v1y)} and the vector
//	 * {@code (v2x, v2y)} and saves the result in the extraction parameter.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code max((v1x, v1y), (v2x, v2y))}
//	 * 
//	 * @param v1x
//	 *     The value of the x component of the first vector.
//	 * @param v1y
//	 *     The value of the y component of the first vector.
//	 * @param v2x
//	 *     The value of the x component of the second vector.
//	 * @param v2y
//	 *     The value of the y component of the second vector.
//	 * @param res
//	 *     The extraction parameter for the result as an array with at least two entries.
//	 * 
//	 * @return The extraction parameter with the result.
//	 */
//	public static float[] compMax(float v1x, float v1y, float v2x, float v2y, @ExtractionParam float[] res)
//	{
//		res[0] = Math.max(v1x, v2x);
//		res[1] = Math.max(v1y, v2y);
//		
//		return res;
//	}
//
//	/**
//	 * Determines the component wise greatest value of the vector {@code (v1)} and the vector
//	 * {@code (v2)} and saves the result in the extraction parameter object.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code max(v1, v2)}
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param v1
//	 *     The first vector.
//	 * @param v2
//	 *     The second vector.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T extends Tup2WF> T compMax(Tup2RF v1, Tup2RF v2, @ExtractionParam T res)
//	{
//		return compMax(v1.v0(), v1.v1(), v2.v0(), v2.v1(), res);
//	}
//
//	/**
//	 * Determines the component wise greatest value of the vector {@code (v1)} and the vector
//	 * {@code (v2[0], v2[1])} and saves the result in the extraction parameter object.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code max(v1, (v2[0], v2[1]))}
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param v1
//	 *     The first vector.
//	 * @param v2
//	 *     The second vector as an array with at least two entries.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T extends Tup2WF> T compMax(Tup2RF v1, float[] v2, @ExtractionParam T res)
//	{
//		return compMax(v1.v0(), v1.v1(), v2[0], v2[1], res);
//	}
//
//	/**
//	 * Determines the component wise greatest value of the vector {@code (v1)} and the vector
//	 * {@code (v2x, v2y)} and saves the result in the extraction parameter object.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code max(v1, (v2x, v2y))}
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param v1
//	 *     The first vector.
//	 * @param v2x
//	 *     The value of the x component of the second vector.
//	 * @param v2y
//	 *     The value of the y component of the second vector.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T extends Tup2WF> T compMax(Tup2RF v1, float v2x, float v2y, @ExtractionParam T res)
//	{
//		return compMax(v1.v0(), v1.v1(), v2x, v2y, res);
//	}
//
//	/**
//	 * Determines the component wise greatest value of the vector {@code (v1[0], v1[1])} and the
//	 * vector {@code (v2)} and saves the result in the extraction parameter object.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code max((v1[0], v1[1]), v2)}
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param v1
//	 *     The first vector as an array with at least two entries.
//	 * @param v2
//	 *     The second vector.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T extends Tup2WF> T compMax(float[] v1, Tup2RF v2, @ExtractionParam T res)
//	{
//		return compMax(v1[0], v1[1], v2.v0(), v2.v1(), res);
//	}
//
//	/**
//	 * Determines the component wise greatest value of the vector {@code (v1[0], v1[1])} and the
//	 * vector {@code (v2[0], v2[1])} and saves the result in the extraction parameter object.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code max((v1[0], v1[1]), (v2[0], v2[1]))}
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param v1
//	 *     The first vector as an array with at least two entries.
//	 * @param v2
//	 *     The second vector as an array with at least two entries.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T extends Tup2WF> T compMax(float[] v1, float[] v2, @ExtractionParam T res)
//	{
//		return compMax(v1[0], v1[1], v2[0], v2[1], res);
//	}
//
//	/**
//	 * Determines the component wise greatest value of the vector {@code (v1[0], v1[1])} and the
//	 * vector {@code (v2x, v2y)} and saves the result in the extraction parameter object.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code max((v1[0], v1[1]), (v2x, v2y))}
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param v1
//	 *     The first vector as an array with at least two entries.
//	 * @param v2x
//	 *     The value of the x component of the second vector.
//	 * @param v2y
//	 *     The value of the y component of the second vector.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T extends Tup2WF> T compMax(float[] v1, float v2x, float v2y, @ExtractionParam T res)
//	{
//		return compMax(v1[0], v1[1], v2x, v2y, res);
//	}
//
//	/**
//	 * Determines the component wise greatest value of the vector {@code (v1x, v1y)} and the vector
//	 * {@code (v2)} and saves the result in the extraction parameter object.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code max((v1x, v1y), v2)}
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param v1x
//	 *     The value of the x component of the first vector.
//	 * @param v1y
//	 *     The value of the y component of the first vector.
//	 * @param v2
//	 *     The second vector.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T extends Tup2WF> T compMax(float v1x, float v1y, Tup2RF v2, @ExtractionParam T res)
//	{
//		return compMax(v1x, v1y, v2.v0(), v2.v1(), res);
//	}
//
//	/**
//	 * Determines the component wise greatest value of the vector {@code (v1x, v1y)} and the vector
//	 * {@code (v2[0], v2[1])} and saves the result in the extraction parameter object.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code max((v1x, v1y), (v2[0], v2[1]))}
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param v1x
//	 *     The value of the x component of the first vector.
//	 * @param v1y
//	 *     The value of the y component of the first vector.
//	 * @param v2
//	 *     The second vector as an array with at least two entries.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T extends Tup2WF> T compMax(float v1x, float v1y, float[] v2, @ExtractionParam T res)
//	{
//		return compMax(v1x, v1y, v2[0], v2[1], res);
//	}
//
//	/**
//	 * Determines the component wise greatest value of the vector {@code (v1x, v1y)} and the vector
//	 * {@code (v2x, v2y)} and saves the result in the extraction parameter object.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code max((v1x, v1y), (v2x, v2y))}
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param v1x
//	 *     The value of the x component of the first vector.
//	 * @param v1y
//	 *     The value of the y component of the first vector.
//	 * @param v2x
//	 *     The value of the x component of the second vector.
//	 * @param v2y
//	 *     The value of the y component of the second vector.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T extends Tup2WF> T compMax(float v1x, float v1y, float v2x, float v2y, @ExtractionParam T res)
//	{
//		res.set(Math.max(v1x, v2x), Math.max(v1y, v2y));
//		
//		return res;
//	}
//
//	/**
//	 * Determines the component wise greatest value of the vector {@code (v1)} and the vector
//	 * {@code (v2)} and saves the result in the extraction parameter object.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code max(v1, v2)}
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param v1
//	 *     The first vector.
//	 * @param v2
//	 *     The second vector.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T> T compMaxFunc(Tup2RF v1, Tup2RF v2, Function2F<T> func)
//	{
//		return compMaxFunc(v1.v0(), v1.v1(), v2.v0(), v2.v1(), func);
//	}
//
//	/**
//	 * Determines the component wise greatest value of the vector {@code (v1)} and the vector
//	 * {@code (v2[0], v2[1])} and saves the result in the extraction parameter object.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code max(v1, (v2[0], v2[1]))}
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param v1
//	 *     The first vector.
//	 * @param v2
//	 *     The second vector as an array with at least two entries.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T> T compMaxFunc(Tup2RF v1, float[] v2, Function2F<T> func)
//	{
//		return compMaxFunc(v1.v0(), v1.v1(), v2[0], v2[1], func);
//	}
//
//	/**
//	 * Determines the component wise greatest value of the vector {@code (v1)} and the vector
//	 * {@code (v2x, v2y)} and saves the result in the extraction parameter object.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code max(v1, (v2x, v2y))}
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param v1
//	 *     The first vector.
//	 * @param v2x
//	 *     The value of the x component of the second vector.
//	 * @param v2y
//	 *     The value of the y component of the second vector.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T> T compMaxFunc(Tup2RF v1, float v2x, float v2y, Function2F<T> func)
//	{
//		return compMaxFunc(v1.v0(), v1.v1(), v2x, v2y, func);
//	}
//
//	/**
//	 * Determines the component wise greatest value of the vector {@code (v1[0], v1[1])} and the
//	 * vector {@code (v2)} and saves the result in the extraction parameter object.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code max((v1[0], v1[1]), v2)}
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param v1
//	 *     The first vector as an array with at least two entries.
//	 * @param v2
//	 *     The second vector.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T> T compMaxFunc(float[] v1, Tup2RF v2, Function2F<T> func)
//	{
//		return compMaxFunc(v1[0], v1[1], v2.v0(), v2.v1(), func);
//	}
//
//	/**
//	 * Determines the component wise greatest value of the vector {@code (v1[0], v1[1])} and the
//	 * vector {@code (v2[0], v2[1])} and saves the result in the extraction parameter object.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code max((v1[0], v1[1]), (v2[0], v2[1]))}
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param v1
//	 *     The first vector as an array with at least two entries.
//	 * @param v2
//	 *     The second vector as an array with at least two entries.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T> T compMaxFunc(float[] v1, float[] v2, Function2F<T> func)
//	{
//		return compMaxFunc(v1[0], v1[1], v2[0], v2[1], func);
//	}
//
//	/**
//	 * Determines the component wise greatest value of the vector {@code (v1[0], v1[1])} and the
//	 * vector {@code (v2x, v2y)} and saves the result in the extraction parameter object.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code max((v1[0], v1[1]), (v2x, v2y))}
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param v1
//	 *     The first vector as an array with at least two entries.
//	 * @param v2x
//	 *     The value of the x component of the second vector.
//	 * @param v2y
//	 *     The value of the y component of the second vector.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T> T compMaxFunc(float[] v1, float v2x, float v2y, Function2F<T> func)
//	{
//		return compMaxFunc(v1[0], v1[1], v2x, v2y, func);
//	}
//
//	/**
//	 * Determines the component wise greatest value of the vector {@code (v1x, v1y)} and the vector
//	 * {@code (v2)} and saves the result in the extraction parameter object.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code max((v1x, v1y), v2)}
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param v1x
//	 *     The value of the x component of the first vector.
//	 * @param v1y
//	 *     The value of the y component of the first vector.
//	 * @param v2
//	 *     The second vector.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T> T compMaxFunc(float v1x, float v1y, Tup2RF v2, Function2F<T> func)
//	{
//		return compMaxFunc(v1x, v1y, v2.v0(), v2.v1(), func);
//	}
//
//	/**
//	 * Determines the component wise greatest value of the vector {@code (v1x, v1y)} and the vector
//	 * {@code (v2[0], v2[1])} and saves the result in the extraction parameter object.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code max((v1x, v1y), (v2[0], v2[1]))}
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param v1x
//	 *     The value of the x component of the first vector.
//	 * @param v1y
//	 *     The value of the y component of the first vector.
//	 * @param v2
//	 *     The second vector as an array with at least two entries.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T> T compMaxFunc(float v1x, float v1y, float[] v2, Function2F<T> func)
//	{
//		return compMaxFunc(v1x, v1y, v2[0], v2[1], func);
//	}
//
//	/**
//	 * Determines the component wise greatest value of the vector {@code (v1x, v1y)} and the vector
//	 * {@code (v2x, v2y)} and saves the result in the extraction parameter object.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code max((v1x, v1y), (v2x, v2y))}
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param v1x
//	 *     The value of the x component of the first vector.
//	 * @param v1y
//	 *     The value of the y component of the first vector.
//	 * @param v2x
//	 *     The value of the x component of the second vector.
//	 * @param v2y
//	 *     The value of the y component of the second vector.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T> T compMaxFunc(float v1x, float v1y, float v2x, float v2y, Function2F<T> func)
//	{
//		return func.apply2F(Math.max(v1x, v2x), Math.max(v1y, v2y));
//	}
//	
//	/**
//	 * Rounds the components of the vector {@code (v)} towards the next greater integer and saves
//	 * the result in the extraction parameter.
//	 * 
//	 * @param v
//	 *     The vector.
//	 * @param res
//	 *     The extraction parameter for the result as an array with at least two entries.
//	 * 
//	 * @return The extraction parameter with the result.
//	 */
//	public static float[] ceil(Tup2RF v, @ExtractionParam float[] res)
//	{
//		return ceil(v.v0(), v.v1(), res);
//	}
//
//	/**
//	 * Rounds the components of the vector {@code (v[0], v[1])} towards the next greater integer and
//	 * saves the result in the extraction parameter.
//	 * 
//	 * @param v
//	 *     The vector as an array with at least two entries.
//	 * @param res
//	 *     The extraction parameter for the result as an array with at least two entries.
//	 * 
//	 * @return The extraction parameter with the result.
//	 */
//	public static float[] ceil(float[] v, @ExtractionParam float[] res)
//	{
//		return ceil(v[0], v[1], res);
//	}
//
//	/**
//	 * Rounds the components of the vector {@code (x, y)} towards the next greater integer and saves
//	 * the result in the extraction parameter.
//	 * 
//	 * @param x
//	 *     The value of the x component of the vector.
//	 * @param y
//	 *     The value of the y component of the vector.
//	 * @param res
//	 *     The extraction parameter for the result as an array with at least two entries.
//	 * 
//	 * @return The extraction parameter with the result.
//	 */
//	public static float[] ceil(float x, float y, @ExtractionParam float[] res)
//	{
//		res[0] = MathUtils.ceil(x);
//		res[1] = MathUtils.ceil(y);
//		
//		return res;
//	}
//	
//	/**
//	 * Rounds the components of the vector {@code (v)} towards the next greater integer and saves
//	 * the result in the given extraction parameter object.
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param v
//	 *     The vector.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T extends Tup2WF> T ceil(Tup2RF v, @ExtractionParam T res)
//	{
//		return ceil(v.v0(), v.v1(), res);
//	}
//
//	/**
//	 * Rounds the components of the vector {@code (v[0], v[1])} towards the next greater integer and
//	 * saves the result in the given extraction parameter object.
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param v
//	 *     The vector as an array with at least two entries.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T extends Tup2WF> T ceil(float[] v, @ExtractionParam T res)
//	{
//		return ceil(v[0], v[1], res);
//	}
//
//	/**
//	 * Rounds the components of the vector {@code (x, y)} towards the next greater integer and saves
//	 * the result in the given extraction parameter object.
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param x
//	 *     The value of the x component of the vector.
//	 * @param y
//	 *     The value of the y component of the vector.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T extends Tup2WF> T ceil(float x, float y, @ExtractionParam T res)
//	{
//		res.set(MathUtils.ceil(x), MathUtils.ceil(y));
//		
//		return res;
//	}
//
//	/**
//	 * Rounds the components of the vector {@code (v)} towards the next greater integer and saves
//	 * the result in the given extraction parameter object.
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param v
//	 *     The vector.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T> T ceilFunc(Tup2RF v, Function2F<T> func)
//	{
//		return ceilFunc(v.v0(), v.v1(), func);
//	}
//
//	/**
//	 * Rounds the components of the vector {@code (v[0], v[1])} towards the next greater integer and
//	 * saves the result in the given extraction parameter object.
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param v
//	 *     The vector as an array with at least two entries.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T> T ceilFunc(float[] v, Function2F<T> func)
//	{
//		return ceilFunc(v[0], v[1], func);
//	}
//
//	/**
//	 * Rounds the components of the vector {@code (x, y)} towards the next greater integer and saves
//	 * the result in the given extraction parameter object.
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param x
//	 *     The value of the x component of the vector.
//	 * @param y
//	 *     The value of the y component of the vector.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T> T ceilFunc(float x, float y, Function2F<T> func)
//	{
//		return func.apply2F(MathUtils.ceil(x), MathUtils.ceil(y));
//	}
//	
//	/**
//	 * Rounds the components of the vector {@code (v)} towards the next smaller integer and saves
//	 * the result in the extraction parameter.
//	 * 
//	 * @param v
//	 *     The vector.
//	 * @param res
//	 *     The extraction parameter for the result as an array with at least two entries.
//	 * 
//	 * @return The extraction parameter with the result.
//	 */
//	public static float[] floor(Tup2RF v, @ExtractionParam float[] res)
//	{
//		return floor(v.v0(), v.v1(), res);
//	}
//
//	/**
//	 * Rounds the components of the vector {@code (v[0], v[1])} towards the next smaller integer and
//	 * saves the result in the extraction parameter.
//	 * 
//	 * @param v
//	 *     The vector as an array with at least two entries.
//	 * @param res
//	 *     The extraction parameter for the result as an array with at least two entries.
//	 * 
//	 * @return The extraction parameter with the result.
//	 */
//	public static float[] floor(float[] v, @ExtractionParam float[] res)
//	{
//		return floor(v[0], v[1], res);
//	}
//
//	/**
//	 * Rounds the components of the vector {@code (x, y)} towards the next smaller integer and saves
//	 * the result in the extraction parameter.
//	 * 
//	 * @param x
//	 *     The value of the x component of the vector.
//	 * @param y
//	 *     The value of the y component of the vector.
//	 * @param res
//	 *     The extraction parameter for the result as an array with at least two entries.
//	 * 
//	 * @return The extraction parameter with the result.
//	 */
//	public static float[] floor(float x, float y, @ExtractionParam float[] res)
//	{
//		res[0] = MathUtils.floor(x);
//		res[1] = MathUtils.floor(y);
//		
//		return res;
//	}
//	
//	/**
//	 * Rounds the components of the vector {@code (v)} towards the next smaller integer and saves
//	 * the result in the given extraction parameter object.
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param v
//	 *     The vector.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T extends Tup2WF> T floor(Tup2RF v, @ExtractionParam T res)
//	{
//		return floor(v.v0(), v.v1(), res);
//	}
//
//	/**
//	 * Rounds the components of the vector {@code (v[0], v[1])} towards the next smaller integer and
//	 * saves the result in the given extraction parameter object.
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param v
//	 *     The vector as an array with at least two entries.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T extends Tup2WF> T floor(float[] v, @ExtractionParam T res)
//	{
//		return floor(v[0], v[1], res);
//	}
//
//	/**
//	 * Rounds the components of the vector {@code (x, y)} towards the next smaller integer and saves
//	 * the result in the given extraction parameter object.
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param x
//	 *     The value of the x component of the vector.
//	 * @param y
//	 *     The value of the y component of the vector.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T extends Tup2WF> T floor(float x, float y, @ExtractionParam T res)
//	{
//		res.set(MathUtils.floor(x), MathUtils.floor(y));
//		
//		return res;
//	}
//
//	/**
//	 * Rounds the components of the vector {@code (v)} towards the next smaller integer and saves
//	 * the result in the given extraction parameter object.
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param v
//	 *     The vector.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T> T floorFunc(Tup2RF v, Function2F<T> func)
//	{
//		return floorFunc(v.v0(), v.v1(), func);
//	}
//
//	/**
//	 * Rounds the components of the vector {@code (v[0], v[1])} towards the next smaller integer and
//	 * saves the result in the given extraction parameter object.
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param v
//	 *     The vector as an array with at least two entries.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T> T floorFunc(float[] v, Function2F<T> func)
//	{
//		return floorFunc(v[0], v[1], func);
//	}
//
//	/**
//	 * Rounds the components of the vector {@code (x, y)} towards the next smaller integer and saves
//	 * the result in the given extraction parameter object.
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param x
//	 *     The value of the x component of the vector.
//	 * @param y
//	 *     The value of the y component of the vector.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T> T floorFunc(float x, float y, Function2F<T> func)
//	{
//		return func.apply2F(MathUtils.floor(x), MathUtils.floor(y));
//	}
//	
//	/**
//	 * Rounds the components of the vector {@code (v)} and saves the result in the extraction
//	 * parameter.
//	 * 
//	 * @param v
//	 *     The vector.
//	 * @param res
//	 *     The extraction parameter for the result as an array with at least two entries.
//	 * 
//	 * @return The extraction parameter with the result.
//	 */
//	public static float[] round(Tup2RF v, @ExtractionParam float[] res)
//	{
//		return round(v.v0(), v.v1(), res);
//	}
//
//	/**
//	 * Rounds the components of the vector {@code (v)} and saves the result in the extraction
//	 * parameter.
//	 * 
//	 * @param v
//	 *     The vector.
//	 * @param res
//	 *     The extraction parameter for the result as an array with at least two entries.
//	 * 
//	 * @return The extraction parameter with the result.
//	 */
//	public static float[] round(Tup2RF v, RoundMethodF method, @ExtractionParam float[] res)
//	{
//		return round(v.v0(), v.v1(), method, res);
//	}
//
//	/**
//	 * Rounds the components of the vector {@code (v[0], v[1])} and saves the result in the
//	 * extraction parameter.
//	 * 
//	 * @param v
//	 *     The vector as an array with at least two entries.
//	 * @param res
//	 *     The extraction parameter for the result as an array with at least two entries.
//	 * 
//	 * @return The extraction parameter with the result.
//	 */
//	public static float[] round(float[] v, @ExtractionParam float[] res)
//	{
//		return round(v[0], v[1], res);
//	}
//
//	/**
//	 * Rounds the components of the vector {@code (v[0], v[1])} and saves the result in the
//	 * extraction parameter.
//	 * 
//	 * @param v
//	 *     The vector as an array with at least two entries.
//	 * @param res
//	 *     The extraction parameter for the result as an array with at least two entries.
//	 * 
//	 * @return The extraction parameter with the result.
//	 */
//	public static float[] round(float[] v, RoundMethodF method, @ExtractionParam float[] res)
//	{
//		return round(v[0], v[1], method, res);
//	}
//
//	/**
//	 * Rounds the components of the vector {@code (x, y)} and saves the result in the extraction
//	 * parameter.
//	 * 
//	 * @param x
//	 *     The value of the x component of the vector.
//	 * @param y
//	 *     The value of the y component of the vector.
//	 * @param res
//	 *     The extraction parameter for the result as an array with at least two entries.
//	 * 
//	 * @return The extraction parameter with the result.
//	 */
//	public static float[] round(float x, float y, @ExtractionParam float[] res)
//	{
//		res[0] = MathUtils.round(x);
//		res[1] = MathUtils.round(y);
//		
//		return res;
//	}
//
//	/**
//	 * Rounds the components of the vector {@code (x, y)} and saves the result in the extraction
//	 * parameter.
//	 * 
//	 * @param x
//	 *     The value of the x component of the vector.
//	 * @param y
//	 *     The value of the y component of the vector.
//	 * @param res
//	 *     The extraction parameter for the result as an array with at least two entries.
//	 * 
//	 * @return The extraction parameter with the result.
//	 */
//	public static float[] round(float x, float y, RoundMethodF method, @ExtractionParam float[] res)
//	{
//		res[0] = method.round(x);
//		res[1] = method.round(y);
//		
//		return res;
//	}
//	
//	/**
//	 * Rounds the components of the vector {@code (v)} and saves the result in the given extraction
//	 * parameter object.
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param v
//	 *     The vector.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T extends Tup2WF> T round(Tup2RF v, @ExtractionParam T res)
//	{
//		return round(v.v0(), v.v1(), res);
//	}
//
//	/**
//	 * Rounds the components of the vector {@code (v)} and saves the result in the given extraction
//	 * parameter object.
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param v
//	 *     The vector.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T extends Tup2WF> T round(Tup2RF v, RoundMethodF method, @ExtractionParam T res)
//	{
//		return round(v.v0(), v.v1(), method, res);
//	}
//
//	/**
//	 * Rounds the components of the vector {@code (v[0], v[1])} and saves the result in the given
//	 * extraction parameter object.
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param v
//	 *     The vector as an array with at least two entries.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T extends Tup2WF> T round(float[] v, @ExtractionParam T res)
//	{
//		return round(v[0], v[1], res);
//	}
//
//	/**
//	 * Rounds the components of the vector {@code (v[0], v[1])} and saves the result in the given
//	 * extraction parameter object.
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param v
//	 *     The vector as an array with at least two entries.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T extends Tup2WF> T round(float[] v, RoundMethodF method, @ExtractionParam T res)
//	{
//		return round(v[0], v[1], method, res);
//	}
//
//	/**
//	 * Rounds the components of the vector {@code (x, y)} and saves the result in the given
//	 * extraction parameter object.
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param x
//	 *     The value of the x component of the vector.
//	 * @param y
//	 *     The value of the y component of the vector.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T extends Tup2WF> T round(float x, float y, @ExtractionParam T res)
//	{
//		res.set(MathUtils.round(x), MathUtils.round(y));
//		
//		return res;
//	}
//
//	/**
//	 * Rounds the components of the vector {@code (x, y)} and saves the result in the given
//	 * extraction parameter object.
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param x
//	 *     The value of the x component of the vector.
//	 * @param y
//	 *     The value of the y component of the vector.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T extends Tup2WF> T round(float x, float y, RoundMethodF method, @ExtractionParam T res)
//	{
//		res.set(method.round(x), method.round(y));
//		
//		return res;
//	}
//
//	/**
//	 * Rounds the components of the vector {@code (v)} and saves the result in the given extraction
//	 * parameter object.
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param v
//	 *     The vector.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T> T roundFunc(Tup2RF v, Function2F<T> func)
//	{
//		return roundFunc(v.v0(), v.v1(), func);
//	}
//
//	/**
//	 * Rounds the components of the vector {@code (v)} and saves the result in the given extraction
//	 * parameter object.
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param v
//	 *     The vector.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T> T roundFunc(Tup2RF v, RoundMethodF method, Function2F<T> func)
//	{
//		return roundFunc(v.v0(), v.v1(), method, func);
//	}
//
//	/**
//	 * Rounds the components of the vector {@code (v[0], v[1])} and saves the result in the given
//	 * extraction parameter object.
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param v
//	 *     The vector as an array with at least two entries.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T> T roundFunc(float[] v, Function2F<T> func)
//	{
//		return roundFunc(v[0], v[1], func);
//	}
//
//	/**
//	 * Rounds the components of the vector {@code (v[0], v[1])} and saves the result in the given
//	 * extraction parameter object.
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param v
//	 *     The vector as an array with at least two entries.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T> T roundFunc(float[] v, RoundMethodF method, Function2F<T> func)
//	{
//		return roundFunc(v[0], v[1], method, func);
//	}
//
//	/**
//	 * Rounds the components of the vector {@code (x, y)} and saves the result in the given
//	 * extraction parameter object.
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param x
//	 *     The value of the x component of the vector.
//	 * @param y
//	 *     The value of the y component of the vector.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T> T roundFunc(float x, float y, Function2F<T> func)
//	{
//		return func.apply2F(MathUtils.round(x), MathUtils.round(y));
//	}
//
//	/**
//	 * Rounds the components of the vector {@code (x, y)} and saves the result in the given
//	 * extraction parameter object.
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param x
//	 *     The value of the x component of the vector.
//	 * @param y
//	 *     The value of the y component of the vector.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T> T roundFunc(float x, float y, RoundMethodF method, Function2F<T> func)
//	{
//		return func.apply2F(method.round(x), method.round(y));
//	}
//	
//	/**
//	 * Truncates the decimals of the components of the vector {@code (v)} and saves the result in
//	 * the extraction parameter.
//	 * 
//	 * @param v
//	 *     The vector.
//	 * @param res
//	 *     The extraction parameter for the result as an array with at least two entries.
//	 * 
//	 * @return The extraction parameter with the result.
//	 */
//	public static float[] trunc(Tup2RF v, @ExtractionParam float[] res)
//	{
//		return trunc(v.v0(), v.v1(), res);
//	}
//
//	/**
//	 * Truncates the decimals of the components of the vector {@code (v[0], v[1])} and saves the
//	 * result in the extraction parameter.
//	 * 
//	 * @param v
//	 *     The vector as an array with at least two entries.
//	 * @param res
//	 *     The extraction parameter for the result as an array with at least two entries.
//	 * 
//	 * @return The extraction parameter with the result.
//	 */
//	public static float[] trunc(float[] v, @ExtractionParam float[] res)
//	{
//		return trunc(v[0], v[1], res);
//	}
//
//	/**
//	 * Truncates the decimals of the components of the vector {@code (x, y)} and saves the result in
//	 * the extraction parameter.
//	 * 
//	 * @param x
//	 *     The value of the x component of the vector.
//	 * @param y
//	 *     The value of the y component of the vector.
//	 * @param res
//	 *     The extraction parameter for the result as an array with at least two entries.
//	 * 
//	 * @return The extraction parameter with the result.
//	 */
//	public static float[] trunc(float x, float y, @ExtractionParam float[] res)
//	{
//		res[0] = (int)x;
//		res[1] = (int)y;
//		
//		return res;
//	}
//	
//	/**
//	 * Truncates the decimals of the components of the vector {@code (v)} and saves the result in
//	 * the given extraction parameter object.
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param v
//	 *     The vector.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T extends Tup2WF> T trunc(Tup2RF v, @ExtractionParam T res)
//	{
//		return trunc(v.v0(), v.v1(), res);
//	}
//
//	/**
//	 * Truncates the decimals of the components of the vector {@code (v[0], v[1])} and saves the
//	 * result in the given extraction parameter object.
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param v
//	 *     The vector as an array with at least two entries.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T extends Tup2WF> T trunc(float[] v, @ExtractionParam T res)
//	{
//		return trunc(v[0], v[1], res);
//	}
//
//	/**
//	 * Truncates the decimals of the components of the vector {@code (x, y)} and saves the result in
//	 * the given extraction parameter object.
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param x
//	 *     The value of the x component of the vector.
//	 * @param y
//	 *     The value of the y component of the vector.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T extends Tup2WF> T trunc(float x, float y, @ExtractionParam T res)
//	{
//		res.set((int)x, (int)y);
//		
//		return res;
//	}
//
//	/**
//	 * Truncates the decimals of the components of the vector {@code (v)} and saves the result in
//	 * the given extraction parameter object.
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param v
//	 *     The vector.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T> T truncFunc(Tup2RF v, Function2F<T> func)
//	{
//		return truncFunc(v.v0(), v.v1(), func);
//	}
//
//	/**
//	 * Truncates the decimals of the components of the vector {@code (v[0], v[1])} and saves the
//	 * result in the given extraction parameter object.
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param v
//	 *     The vector as an array with at least two entries.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T> T truncFunc(float[] v, Function2F<T> func)
//	{
//		return truncFunc(v[0], v[1], func);
//	}
//
//	/**
//	 * Truncates the decimals of the components of the vector {@code (x, y)} and saves the result in
//	 * the given extraction parameter object.
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param x
//	 *     The value of the x component of the vector.
//	 * @param y
//	 *     The value of the y component of the vector.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T> T truncFunc(float x, float y, Function2F<T> func)
//	{
//		return func.apply2F((int)x, (int)y);
//	}
//	
//	/**
//	 * Calculates the absolute value of the component values of the vector {@code (v)} and saves the
//	 * result in the extraction parameter.
//	 * 
//	 * @param v
//	 *     The vector.
//	 * @param res
//	 *     The extraction parameter for the result as an array with at least two entries.
//	 * 
//	 * @return The extraction parameter with the result.
//	 */
//	public static float[] abs(Tup2RF v, @ExtractionParam float[] res)
//	{
//		return abs(v.v0(), v.v1(), res);
//	}
//
//	/**
//	 * Calculates the absolute value of the component values of the vector {@code (v[0], v[1])} and
//	 * saves the result in the extraction parameter.
//	 * 
//	 * @param v
//	 *     The vector as an array with at least two entries.
//	 * @param res
//	 *     The extraction parameter for the result as an array with at least two entries.
//	 * 
//	 * @return The extraction parameter with the result.
//	 */
//	public static float[] abs(float[] v, @ExtractionParam float[] res)
//	{
//		return abs(v[0], v[1], res);
//	}
//
//	/**
//	 * Calculates the absolute value of the component values of the vector {@code (x, y)} and saves
//	 * the result in the extraction parameter.
//	 * 
//	 * @param x
//	 *     The value of the x component of the vector.
//	 * @param y
//	 *     The value of the y component of the vector.
//	 * @param res
//	 *     The extraction parameter for the result as an array with at least two entries.
//	 * 
//	 * @return The extraction parameter with the result.
//	 */
//	public static float[] abs(float x, float y, @ExtractionParam float[] res)
//	{
//		res[0] = MathUtils.abs(x);
//		res[1] = MathUtils.abs(y);
//		
//		return res;
//	}
//
//	/**
//	 * Calculates the absolute value of the component values of the vector {@code (v)} and saves the
//	 * result in the given extraction parameter object.
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param v
//	 *     The vector.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T extends Tup2WF> T abs(Tup2RF v, @ExtractionParam T res)
//	{
//		return abs(v.v0(), v.v1(), res);
//	}
//
//	/**
//	 * Calculates the absolute value of the component values of the vector {@code (v[0], v[1])} and
//	 * saves the result in the given extraction parameter object.
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param v
//	 *     The vector as an array with at least two entries.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T extends Tup2WF> T abs(float[] v, @ExtractionParam T res)
//	{
//		return abs(v[0], v[1], res);
//	}
//
//	/**
//	 * Calculates the absolute value of the component values of the vector {@code (x, y)} and saves
//	 * the result in the given extraction parameter object.
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param x
//	 *     The value of the x component of the vector.
//	 * @param y
//	 *     The value of the y component of the vector.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T extends Tup2WF> T abs(float x, float y, @ExtractionParam T res)
//	{
//		res.set(MathUtils.abs(x), MathUtils.abs(y));
//		
//		return res;
//	}
//
//	/**
//	 * Calculates the absolute value of the component values of the vector {@code (v)} and saves the
//	 * result in the given extraction parameter object.
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param v
//	 *     The vector.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T> T absFunc(Tup2RF v, Function2F<T> func)
//	{
//		return absFunc(v.v0(), v.v1(), func);
//	}
//
//	/**
//	 * Calculates the absolute value of the component values of the vector {@code (v[0], v[1])} and
//	 * saves the result in the given extraction parameter object.
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param v
//	 *     The vector as an array with at least two entries.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T> T absFunc(float[] v, Function2F<T> func)
//	{
//		return absFunc(v[0], v[1], func);
//	}
//
//	/**
//	 * Calculates the absolute value of the component values of the vector {@code (x, y)} and saves
//	 * the result in the given extraction parameter object.
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param x
//	 *     The value of the x component of the vector.
//	 * @param y
//	 *     The value of the y component of the vector.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T> T absFunc(float x, float y, Function2F<T> func)
//	{
//		return func.apply2F(MathUtils.abs(x), MathUtils.abs(y));
//	}
//	
//	/**
//	 * Calculates the {@link Math#signum(float) signum} of the components of the given vector
//	 * {@code (v)} and saves the result in the extraction parameter.
//	 * 
//	 * @param v
//	 *     The vector.
//	 * @param res
//	 *     The extraction parameter for the result as an array with at least two entries.
//	 * 
//	 * @return The extraction parameter with the result.
//	 */
//	public static float[] sign(Tup2RF v, @ExtractionParam float[] res)
//	{
//		return sign(v.v0(), v.v1(), res);
//	}
//
//	/**
//	 * Calculates the {@link Math#signum(float) signum} of the components of the given vector
//	 * {@code (v[0], v[1])} and saves the result in the extraction parameter.
//	 * 
//	 * @param v
//	 *     The vector as an array with at least two entries.
//	 * @param res
//	 *     The extraction parameter for the result as an array with at least two entries.
//	 * 
//	 * @return The extraction parameter with the result.
//	 */
//	public static float[] sign(float[] v, @ExtractionParam float[] res)
//	{
//		return sign(v[0], v[1], res);
//	}
//
//	/**
//	 * Calculates the {@link Math#signum(float) signum} of the components of the given vector
//	 * {@code (x, y)} and saves the result in the extraction parameter.
//	 * 
//	 * @param x
//	 *     The value of the x component of the vector.
//	 * @param y
//	 *     The value of the y component of the vector.
//	 * @param res
//	 *     The extraction parameter for the result as an array with at least two entries.
//	 * 
//	 * @return The extraction parameter with the result.
//	 */
//	public static float[] sign(float x, float y, @ExtractionParam float[] res)
//	{
//		res[0] = MathUtils.signum(x);
//		res[1] = MathUtils.signum(y);
//		
//		return res;
//	}
//
//	/**
//	 * Calculates the {@link Math#signum(float) signum} of the components of the given vector
//	 * {@code (v)} and saves the result in the given extraction parameter object.
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param v
//	 *     The vector as an array with at leasts two entries.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T extends Tup2WF> T sign(Tup2RF v, @ExtractionParam T res)
//	{
//		return sign(v.v0(), v.v1(), res);
//	}
//
//	/**
//	 * Calculates the {@link Math#signum(float) signum} of the components of the given vector
//	 * {@code (v[0], v[1])} and saves the result in the given extraction parameter object.
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param v
//	 *     The vector as an array with at least two entries.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T extends Tup2WF> T sign(float[] v, @ExtractionParam T res)
//	{
//		return sign(v[0], v[1], res);
//	}
//
//	/**
//	 * Calculates the {@link Math#signum(float) signum} of the components of the given vector
//	 * {@code (x, y)} and saves the result in the given extraction parameter object.
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param x
//	 *     The value of the x component of the vector.
//	 * @param y
//	 *     The value of the y component of the vector.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T extends Tup2WF> T sign(float x, float y, @ExtractionParam T res)
//	{
//		res.set(MathUtils.signum(x), MathUtils.signum(y));
//		
//		return res;
//	}
//
//	/**
//	 * Calculates the {@link Math#signum(float) signum} of the components of the given vector
//	 * {@code (v)} and saves the result in the given extraction parameter object.
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param v
//	 *     The vector as an array with at leasts two entries.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T> T signFunc(Tup2RF v, Function2F<T> func)
//	{
//		return signFunc(v.v0(), v.v1(), func);
//	}
//
//	/**
//	 * Calculates the {@link Math#signum(float) signum} of the components of the given vector
//	 * {@code (v[0], v[1])} and saves the result in the given extraction parameter object.
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param v
//	 *     The vector as an array with at least two entries.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T> T signFunc(float[] v, Function2F<T> func)
//	{
//		return signFunc(v[0], v[1], func);
//	}
//
//	/**
//	 * Calculates the {@link Math#signum(float) signum} of the components of the given vector
//	 * {@code (x, y)} and saves the result in the given extraction parameter object.
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param x
//	 *     The value of the x component of the vector.
//	 * @param y
//	 *     The value of the y component of the vector.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T> T signFunc(float x, float y, Function2F<T> func)
//	{
//		return func.apply2F(MathUtils.signum(x), MathUtils.signum(y));
//	}
//	
//	/**
//	 * Negates the vector {@code (v)} and saves the result in the given extraction parameter.
//	 * 
//	 * <p>
//	 * Operation: {@code -v}
//	 * 
//	 * @param v
//	 *     The vector.
//	 * @param res
//	 *     The extraction parameter for the result as an array with at least two entries.
//	 * 
//	 * @return The extraction parameter with the result.
//	 */
//	public static float[] neg(Tup2RF v, @ExtractionParam float[] res)
//	{
//		return neg(v.v0(), v.v1(), res);
//	}
//
//	/**
//	 * Negates the vector {@code (v[0], v[1])} and saves the result in the given extraction
//	 * parameter.
//	 * 
//	 * <p>
//	 * Operation: {@code -(v[0], v[1])}
//	 * 
//	 * @param v
//	 *     The vector as an array with at least two entries.
//	 * @param res
//	 *     The extraction parameter for the result as an array with at least two entries.
//	 * 
//	 * @return The extraction parameter with the result.
//	 */
//	public static float[] neg(float[] v, @ExtractionParam float[] res)
//	{
//		return neg(v[0], v[1], res);
//	}
//
//	/**
//	 * Negates the vector {@code (x, y)} and saves the result in the given extraction parameter.
//	 * 
//	 * <p>
//	 * Operation: {@code -(x, y)}
//	 * 
//	 * @param x
//	 *     The value of the x component of the vector.
//	 * @param y
//	 *     The value of the y component of the vector.
//	 * @param res
//	 *     The extraction parameter for the result as an array with at least two entries.
//	 * 
//	 * @return The extraction parameter with the result.
//	 */
//	public static float[] neg(float x, float y, @ExtractionParam float[] res)
//	{
//		res[0] = -x;
//		res[1] = -y;
//		
//		return res;
//	}
//
//	/**
//	 * Negates the vector {@code (v)} and saves the result in the given extraction parameter object.
//	 * 
//	 * <p>
//	 * Operation: {@code -v}
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param v
//	 *     The vector.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T extends Tup2WF> T neg(Tup2RF v, @ExtractionParam T res)
//	{
//		return neg(v.v0(), v.v1(), res);
//	}
//
//	/**
//	 * Negates the vector {@code (v[0], v[1])} and saves the result in the given extraction
//	 * parameter object.
//	 * 
//	 * <p>
//	 * Operation: {@code -(v[0], v[1])}
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param v
//	 *     The vector as an array with at least two entries.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T extends Tup2WF> T neg(float[] v, @ExtractionParam T res)
//	{
//		return neg(v[0], v[1], res);
//	}
//
//	/**
//	 * Negates the vector {@code (x, y)} and saves the result in the given extraction parameter
//	 * object.
//	 * 
//	 * <p>
//	 * Operation: {@code -(x, y)}
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param x
//	 *     The value of the x component of the vector.
//	 * @param y
//	 *     The value of the y component of the vector.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T extends Tup2WF> T neg(float x, float y, @ExtractionParam T res)
//	{
//		res.set(-x, -y);
//		
//		return res;
//	}
//
//	/**
//	 * Negates the vector {@code (v)} and saves the result in the given extraction parameter object.
//	 * 
//	 * <p>
//	 * Operation: {@code -v}
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param v
//	 *     The vector.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T> T negFunc(Tup2RF v, Function2F<T> func)
//	{
//		return negFunc(v.v0(), v.v1(), func);
//	}
//
//	/**
//	 * Negates the vector {@code (v[0], v[1])} and saves the result in the given extraction
//	 * parameter object.
//	 * 
//	 * <p>
//	 * Operation: {@code -(v[0], v[1])}
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param v
//	 *     The vector as an array with at least two entries.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T> T negFunc(float[] v, Function2F<T> func)
//	{
//		return negFunc(v[0], v[1], func);
//	}
//
//	/**
//	 * Negates the vector {@code (x, y)} and saves the result in the given extraction parameter
//	 * object.
//	 * 
//	 * <p>
//	 * Operation: {@code -(x, y)}
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param x
//	 *     The value of the x component of the vector.
//	 * @param y
//	 *     The value of the y component of the vector.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T> T negFunc(float x, float y, Function2F<T> func)
//	{
//		return func.apply2F(-x, -y);
//	}
//	
//	/**
//	 * Inverses the vector {@code (v)} and saves the result in the given extraction parameter.
//	 * 
//	 * <p>
//	 * Operation: {@code 1.0 / v}
//	 * 
//	 * @param v
//	 *     The vector.
//	 * @param res
//	 *     The extraction parameter for the result as an array with at least two entries.
//	 * 
//	 * @return The extraction parameter with the result.
//	 */
//	public static float[] inv(Tup2RF v, @ExtractionParam float[] res)
//	{
//		return inv(v.v0(), v.v1(), res);
//	}
//
//	/**
//	 * Inverses the vector {@code (v[0], v[1])} and saves the result in the given extraction
//	 * parameter.
//	 * 
//	 * <p>
//	 * Operation: {@code 1.0 / (v[0], v[1])}
//	 * 
//	 * @param v
//	 *     The vector as an array with at least two entries.
//	 * @param res
//	 *     The extraction parameter for the result as an array with at least two entries.
//	 * 
//	 * @return The extraction parameter with the result.
//	 */
//	public static float[] inv(float[] v, @ExtractionParam float[] res)
//	{
//		return inv(v[0], v[1], res);
//	}
//
//	/**
//	 * Inverses the vector {@code (x, y)} and saves the result in the given extraction parameter.
//	 * 
//	 * <p>
//	 * Operation: {@code 1.0 / (x, y)}
//	 * 
//	 * @param x
//	 *     The value of the x component of the vector.
//	 * @param y
//	 *     The value of the y component of the vector.
//	 * @param res
//	 *     The extraction parameter for the result as an array with at least two entries.
//	 * 
//	 * @return The extraction parameter with the result.
//	 */
//	public static float[] inv(float x, float y, @ExtractionParam float[] res)
//	{
//		res[0] = 1.0f / x;
//		res[1] = 1.0f / y;
//		
//		return res;
//	}
//
//	/**
//	 * Inverses the vector {@code (v)} and saves the result in the given extraction parameter
//	 * object.
//	 * 
//	 * <p>
//	 * Operation: {@code 1.0 / v}
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param v
//	 *     The vector.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T extends Tup2WF> T inv(Tup2RF v, @ExtractionParam T res)
//	{
//		return inv(v.v0(), v.v1(), res);
//	}
//
//	/**
//	 * Inverses the vector {@code (v[0], v[1])} and saves the result in the given extraction
//	 * parameter object.
//	 * 
//	 * <p>
//	 * Operation: {@code 1.0 / (v[0], v[1])}
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param v
//	 *     The vector as an array with at least two entries.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T extends Tup2WF> T inv(float[] v, @ExtractionParam T res)
//	{
//		return inv(v[0], v[1], res);
//	}
//
//	/**
//	 * Inverses the vector {@code (x, y)} and saves the result in the given extraction parameter
//	 * object.
//	 * 
//	 * <p>
//	 * Operation: {@code 1.0 / (x, y)}
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param x
//	 *     The value of the x component of the vector.
//	 * @param y
//	 *     The value of the y component of the vector.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T extends Tup2WF> T inv(float x, float y, @ExtractionParam T res)
//	{
//		res.set(1.0f / x, 1.0f / y);
//		
//		return res;
//	}
//
//	/**
//	 * Inverses the vector {@code (v)} and saves the result in the given extraction parameter
//	 * object.
//	 * 
//	 * <p>
//	 * Operation: {@code 1.0 / v}
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param v
//	 *     The vector.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T> T invFunc(Tup2RF v, Function2F<T> func)
//	{
//		return invFunc(v.v0(), v.v1(), func);
//	}
//
//	/**
//	 * Inverses the vector {@code (v[0], v[1])} and saves the result in the given extraction
//	 * parameter object.
//	 * 
//	 * <p>
//	 * Operation: {@code 1.0 / (v[0], v[1])}
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param v
//	 *     The vector as an array with at least two entries.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T> T invFunc(float[] v, Function2F<T> func)
//	{
//		return invFunc(v[0], v[1], func);
//	}
//
//	/**
//	 * Inverses the vector {@code (x, y)} and saves the result in the given extraction parameter
//	 * object.
//	 * 
//	 * <p>
//	 * Operation: {@code 1.0 / (x, y)}
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param x
//	 *     The value of the x component of the vector.
//	 * @param y
//	 *     The value of the y component of the vector.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T> T invFunc(float x, float y, Function2F<T> func)
//	{
//		return func.apply2F(1.0f / x, 1.0f / y);
//	}
//	
//	/**
//	 * Returns whether the component values of this tuple and the component
//	 * values of the given tuple {@code (t)} are exactly equal.
//	 * 
//	 * <p>
//	 * If the given tuple {@code (t)} is null this returns false.
//	 * 
//	 * <p>
//	 * As in most situations only the component values of the tuple are relevant
//	 * when working with tuples, this does not require this tuple and the given
//	 * tuple {@code (t)} to be the same instance.
//	 * 
//	 * <p>
//	 * <b>Formula:</b>
//	 * <br>
//	 * {@code v(0) = t.v0}<br>
//	 * {@code v(1) = t.v1}<br>
//	 * 
//	 * @param t The tuple to compare with.
//	 * 
//	 * @return
//	 * <p>
//	 * {@code true} - If the given tuple {@code (t)} is not {@code null} and the
//	 * component values of this tuple and the given tuple are equal.
//	 * 
//	 * <p>
//	 * {@code false} - Otherwise.
//	 */
//	public static boolean equals(@Nullable Tup2RF t1, @Nullable Tup2RF t2)
//	{
//		if(t1 == t2) return true;
//		if(t1 == null) return false;
//		if(t2 == null) return false;
//		
//		if(t1.v0() != t2.v0()) return false;
//		if(t1.v1() != t2.v1()) return false;
//		
//		return true;
//	}
//
//	/**
//	 * Returns whether the component values of this tuple and the component
//	 * values of the given tuple {@code (t)} are exactly equal.
//	 * 
//	 * <p>
//	 * If the given tuple {@code (t)} is null or of different size this returns
//	 * false.
//	 * 
//	 * <p>
//	 * As in most situations only the component values of the tuple are relevant
//	 * when working with tuples, this does not require this tuple and the given
//	 * tuple {@code (t)} to be the same instance.
//	 * 
//	 * <p>
//	 * <b>Formula:</b>
//	 * <br>
//	 * {@code v(0) = t.v(0)}<b>
//	 * {@code v(1) = t.v(1)}<b>
//	 * 
//	 * @param t The tuple to compare with.
//	 * 
//	 * @return
//	 * <p>
//	 * {@code true} - If the given tuple {@code (t)} is not {@code null}, is of
//	 * the same size as this tuple and the component values of this tuple and
//	 * the given tuple are equal.
//	 * 
//	 * <p>
//	 * {@code false} - Otherwise.
//	 */
//	public static boolean equals(@Nullable Tup2RF t1, @Nullable TupRF t2)
//	{
//		if(t1 == t2) return true;
//		if(t1 == null) return false;
//		if(t2 == null) return false;
//		if(t2.size() != 2) return false;
//		
//		if(t1.v0() != t2.getAt(0)) return false;
//		if(t1.v1() != t2.getAt(1)) return false;
//		
//		return true;
//	}
//
//	/**
//	 * Returns whether the component values of this tuple and the component
//	 * values of the given tuple {@code (t)} are exactly equal.
//	 * 
//	 * <p>
//	 * If the given tuple {@code (t)} is null or of different size this returns
//	 * false.
//	 * 
//	 * <p>
//	 * As in most situations only the component values of the tuple are relevant
//	 * when working with tuples, this does not require this tuple and the given
//	 * tuple {@code (t)} to be the same instance.
//	 * 
//	 * <p>
//	 * <b>Formula:</b>
//	 * <br>
//	 * {@code v(0) = t[0]}<br>
//	 * {@code v(1) = t[1]}<br>
//	 * 
//	 * @param t The tuple to compare with as an array.
//	 * 
//	 * @return
//	 * <p>
//	 * {@code true} - If the given tuple {@code (t)} is not {@code null}, is of
//	 * the same size as this tuple and the component values of this tuple and
//	 * the given tuple are equal.
//	 * 
//	 * <p>
//	 * {@code false} - Otherwise.
//	 */
//	public static boolean equals(@Nullable Tup2RF t1, @Nullable float... t2)
//	{
//		if(t1 == null) return false;
//		if(t2 == null) return false;
//		if(t2.length != 2) return false;
//		
//		if(t1.v0() != t2[0]) return false;
//		if(t1.v1() != t2[1]) return false;
//		
//		return true;
//	}
//
//	/**
//	 * Returns whether the component values of this tuple and the component
//	 * values of the given tuple {@code (v0, v1)} are exactly equal.
//	 * 
//	 * <p>
//	 * <b>Formula:</b>
//	 * <br>
//	 * {@code v(0) = v0}<br>
//	 * {@code v(1) = v1}
//	 * 
//	 * @param v0 The value of the first component of the tuple to compare with.
//	 * @param v1 The value of the second component of the tuple to compare with.
//	 * 
//	 * @return
//	 * <p>
//	 * {@code true} - If the component values of this tuple and the given tuple
//	 * are equal.
//	 * 
//	 * <p>
//	 * {@code false} - Otherwise.
//	 */
//	public static boolean equals(@Nullable Tup2RF t1, float t2v0, float t2v1)
//	{
//		if(t1 == null) return false;
//		
//		if(t1.v0() != t2v0) return false;
//		if(t1.v1() != t2v1) return false;
//		
//		return true;
//	}
//
//	/**
//	 * Returns whether the component values of this tuple and the component
//	 * values of the given tuple {@code (v0, v1)} are exactly equal.
//	 * 
//	 * <p>
//	 * <b>Formula:</b>
//	 * <br>
//	 * {@code v(0) = v0}<br>
//	 * {@code v(1) = v1}
//	 * 
//	 * @param v0 The value of the first component of the tuple to compare with.
//	 * @param v1 The value of the second component of the tuple to compare with.
//	 * 
//	 * @return
//	 * <p>
//	 * {@code true} - If the component values of this tuple and the given tuple
//	 * are equal.
//	 * 
//	 * <p>
//	 * {@code false} - Otherwise.
//	 */
//	public static boolean equals(@Nullable TupRF t1, float t2v0, float t2v1)
//	{
//		if(t1 == null) return false;
//		if(t1.size() != 2) return false;
//		
//		if(t1.getAt(0) != t2v0) return false;
//		if(t1.getAt(1) != t2v1) return false;
//		
//		return true;
//	}
//	
//	/**
//	 * Returns whether the component values of this tuple and the component
//	 * values of the given tuple {@code (v0, v1)} are exactly equal.
//	 * 
//	 * <p>
//	 * <b>Formula:</b>
//	 * <br>
//	 * {@code v(0) = v0}<br>
//	 * {@code v(1) = v1}
//	 * 
//	 * @param v0 The value of the first component of the tuple to compare with.
//	 * @param v1 The value of the second component of the tuple to compare with.
//	 * 
//	 * @return
//	 * <p>
//	 * {@code true} - If the component values of this tuple and the given tuple
//	 * are equal.
//	 * 
//	 * <p>
//	 * {@code false} - Otherwise.
//	 */
//	public static boolean equals(@Nullable float[] t1, float t2v0, float t2v1)
//	{
//		if(t1 == null) return false;
//		if(t1.length != 2) return false;
//		
//		if(t1[0] != t2v0) return false;
//		if(t1[1] != t2v1) return false;
//		
//		return true;
//	}
//	
//	/**
//	 * Returns whether the component values of this tuple and the component
//	 * values of the given tuple {@code (t)} are approximately equal.
//	 * 
//	 * <p>
//	 * This takes into account an inclusive margin of the given tolerance around
//	 * the compared values in positive and negative direction.
//	 * This margin allows for example to compensate for floating point precision
//	 * errors.
//	 * 
//	 * <p>
//	 * If the given tuple {@code (t)} is null this returns false.
//	 * 
//	 * <p>
//	 * As in most situations only the component values of the tuple are relevant
//	 * when working with tuples, this does require this tuple and the given
//	 * tuple {@code t} to be the same instance.
//	 * 
//	 * <p>
//	 * The minimum allowed tolerance is 0.0f. A tolerance of 0.0f behaves like
//	 * {@link #equals(Tup2RF)}.
//	 * 
//	 * <p>
//	 * <b>Formula:</b>
//	 * <br>
//	 * {@code -tolerance <= (v(0) - t.v0) <= tolerance}<br>
//	 * {@code -tolerance <= (v(1) - t.v1) <= tolerance}<br>
//	 * 
//	 * @param tolerance
//	 * The tolerance around the values, that should still count as the value.
//	 * @param t The tuple to compare with.
//	 * 
//	 * @return
//	 * <p>
//	 * {@code true} - If the given tuple {@code (t)} is not {@code null} and the
//	 * component values of this tuple and the given tuple are equal, taking into
//	 * account the given tolerance.
//	 * 
//	 * <p>
//	 * {@code false} - Otherwise.
//	 */
//	public static boolean equals(float tolerance, @Nullable Tup2RF t1, @Nullable Tup2RF t2)
//	{
//		if(t1 == t2) return true;
//		if(t1 == null) return false;
//		if(t2 == null) return false;
//		
//		if(!MathUtils.equals(tolerance, t1.v0(), t2.v0())) return false;
//		if(!MathUtils.equals(tolerance, t1.v1(), t2.v1())) return false;
//		
//		return true;
//	}
//
//	/**
//	 * Returns whether the component values of this tuple and the component
//	 * values of the given tuple {@code (t)} are approximately equal.
//	 * 
//	 * <p>
//	 * This takes into account an inclusive margin of the given tolerance around
//	 * the compared values in positive and negative direction.
//	 * This margin allows for example to compensate for floating point precision
//	 * errors.
//	 * 
//	 * <p>
//	 * If the given tuple {@code (t)} is null or of different size this returns
//	 * false.
//	 * 
//	 * <p>
//	 * As in most situations only the component values of the tuple are relevant
//	 * when working with tuples, this does require this tuple and the given
//	 * tuple {@code t} to be the same instance.
//	 * 
//	 * <p>
//	 * The minimum allowed tolerance is 0.0f. A tolerance of 0.0f behaves like
//	 * {@link #equals(TupRF)}.
//	 * 
//	 * <p>
//	 * <b>Formula:</b>
//	 * <br>
//	 * {@code -tolerance <= (v(0) - t.v(0)) <= tolerance}<br>
//	 * {@code -tolerance <= (v(1) - t.v(1)) <= tolerance}<br>
//	 * 
//	 * @param tolerance
//	 * The tolerance around the values, that should still count as the value.
//	 * @param t The tuple to compare with.
//	 * 
//	 * @return
//	 * <p>
//	 * {@code true} - If the given tuple {@code (t)} is not {@code null}, is of
//	 * the same size as this tuple and the component values of this tuple and
//	 * the given tuple are equal, taking into account the given tolerance.
//	 * 
//	 * <p>
//	 * {@code false} - Otherwise.
//	 */
//	public static boolean equals(float tolerance, @Nullable Tup2RF t1, @Nullable TupRF t2)
//	{
//		if(t1 == t2) return true;
//		if(t1 == null) return false;
//		if(t2 == null) return false;
//		if(t2.size() != 2) return false;
//		
//		if(!MathUtils.equals(tolerance, t1.v0(), t2.getAt(0))) return false;
//		if(!MathUtils.equals(tolerance, t1.v1(), t2.getAt(1))) return false;
//		
//		return true;
//	}
//
//	/**
//	 * Returns whether the component values of this tuple and the component
//	 * values of the given tuple {@code (t)} are approximately equal.
//	 * 
//	 * <p>
//	 * This takes into account an inclusive margin of the given tolerance around
//	 * the compared values in positive and negative direction.
//	 * This margin allows for example to compensate for floating point precision
//	 * errors.
//	 * 
//	 * <p>
//	 * If the given tuple {@code (t)} is null or of different size this returns
//	 * false.
//	 * 
//	 * <p>
//	 * As in most situations only the component values of the tuple are relevant
//	 * when working with tuples, this does require this tuple and the given
//	 * tuple {@code t} to be the same instance.
//	 * 
//	 * <p>
//	 * The minimum allowed tolerance is 0.0f. A tolerance of 0.0f behaves like
//	 * {@link #equals(float[]) equals(float...)}.
//	 * 
//	 * <p>
//	 * <b>Formula:</b>
//	 * <br>
//	 * {@code -tolerance <= (v(0) - t[0]) <= tolerance}<br>
//	 * {@code -tolerance <= (v(1) - t[1]) <= tolerance}<br>
//	 * 
//	 * @param tolerance
//	 * The tolerance around the values, that should still count as the value.
//	 * @param t The tuple to compare with as an array.
//	 * 
//	 * @return
//	 * <p>
//	 * {@code true} - If the given tuple {@code (t)} is not {@code null}, is of
//	 * the same size as this tuple and the component values of this tuple and
//	 * the given tuple are equal, taking into account the given tolerance.
//	 * 
//	 * <p>
//	 * {@code false} - Otherwise.
//	 */
//	public static boolean equals(float tolerance, @Nullable Tup2RF t1, @Nullable float... t2)
//	{
//		if(t1 == null) return false;
//		if(t2 == null) return false;
//		if(t2.length != 2) return false;
//		
//		if(!MathUtils.equals(tolerance, t1.v0(), t2[0])) return false;
//		if(!MathUtils.equals(tolerance, t1.v1(), t2[1])) return false;
//		
//		return true;
//	}
//
//	/**
//	 * Returns whether the component values of this tuple and the component
//	 * values of the given tuple {@code (v0, v1)} are approximately equal.
//	 * 
//	 * <p>
//	 * This takes into account an inclusive margin of the given tolerance around
//	 * the compared values in positive and negative direction.
//	 * This margin allows for example to compensate for floating point precision
//	 * errors.
//	 * 
//	 * <p>
//	 * The minimum allowed tolerance is 0.0f. A tolerance of 0.0f behaves like
//	 * {@link #equals(float, float)}.
//	 * 
//	 * <p>
//	 * <b>Formula:</b>
//	 * <br>
//	 * {@code -tolerance <= (v(0) - v0) <= tolerance}<br>
//	 * {@code -tolerance <= (v(1) - v1) <= tolerance}
//	 * 
//	 * @param tolerance
//	 * The tolerance around the values, that should still count as the value.
//	 * @param v0 The value of the first component of the tuple to compare with.
//	 * @param v1 The value of the second component of the tuple to compare with.
//	 * 
//	 * @return
//	 * <p>
//	 * {@code true} - If the component values of this tuple and the given tuple
//	 * are equal, taking into account the given tolerance.
//	 * 
//	 * <p>
//	 * {@code false} - Otherwise.
//	 */
//	public static boolean equals(float tolerance, @Nullable Tup2RF t1, float t2v0, float t2v1)
//	{
//		if(t1 == null) return false;
//		
//		if(!MathUtils.equals(tolerance, t1.v0(), t2v0)) return false;
//		if(!MathUtils.equals(tolerance, t1.v1(), t2v1)) return false;
//		
//		return true;
//	}
//
//	/**
//	 * Returns whether the component values of this tuple and the component
//	 * values of the given tuple {@code (v0, v1)} are approximately equal.
//	 * 
//	 * <p>
//	 * This takes into account an inclusive margin of the given tolerance around
//	 * the compared values in positive and negative direction.
//	 * This margin allows for example to compensate for floating point precision
//	 * errors.
//	 * 
//	 * <p>
//	 * The minimum allowed tolerance is 0.0f. A tolerance of 0.0f behaves like
//	 * {@link #equals(float, float)}.
//	 * 
//	 * <p>
//	 * <b>Formula:</b>
//	 * <br>
//	 * {@code -tolerance <= (v(0) - v0) <= tolerance}<br>
//	 * {@code -tolerance <= (v(1) - v1) <= tolerance}
//	 * 
//	 * @param tolerance
//	 * The tolerance around the values, that should still count as the value.
//	 * @param v0 The value of the first component of the tuple to compare with.
//	 * @param v1 The value of the second component of the tuple to compare with.
//	 * 
//	 * @return
//	 * <p>
//	 * {@code true} - If the component values of this tuple and the given tuple
//	 * are equal, taking into account the given tolerance.
//	 * 
//	 * <p>
//	 * {@code false} - Otherwise.
//	 */
//	public static boolean equals(float tolerance, @Nullable TupRF t1, float t2v0, float t2v1)
//	{
//		if(t1 == null) return false;
//		if(t1.size() != 2) return false;
//		
//		if(!MathUtils.equals(tolerance, t1.getAt(0), t2v0)) return false;
//		if(!MathUtils.equals(tolerance, t1.getAt(1), t2v1)) return false;
//		
//		return true;
//	}
//	
//	/**
//	 * Returns whether the component values of this tuple and the component
//	 * values of the given tuple {@code (v0, v1)} are approximately equal.
//	 * 
//	 * <p>
//	 * This takes into account an inclusive margin of the given tolerance around
//	 * the compared values in positive and negative direction.
//	 * This margin allows for example to compensate for floating point precision
//	 * errors.
//	 * 
//	 * <p>
//	 * The minimum allowed tolerance is 0.0f. A tolerance of 0.0f behaves like
//	 * {@link #equals(float, float)}.
//	 * 
//	 * <p>
//	 * <b>Formula:</b>
//	 * <br>
//	 * {@code -tolerance <= (v(0) - v0) <= tolerance}<br>
//	 * {@code -tolerance <= (v(1) - v1) <= tolerance}
//	 * 
//	 * @param tolerance
//	 * The tolerance around the values, that should still count as the value.
//	 * @param v0 The value of the first component of the tuple to compare with.
//	 * @param v1 The value of the second component of the tuple to compare with.
//	 * 
//	 * @return
//	 * <p>
//	 * {@code true} - If the component values of this tuple and the given tuple
//	 * are equal, taking into account the given tolerance.
//	 * 
//	 * <p>
//	 * {@code false} - Otherwise.
//	 */
//	public static boolean equals(float tolerance, @Nullable float[] t1, float t2v0, float t2v1)
//	{
//		if(t1 == null) return false;
//		if(t1.length != 2) return false;
//		
//		if(!MathUtils.equals(tolerance, t1[0], t2v0)) return false;
//		if(!MathUtils.equals(tolerance, t1[1], t2v1)) return false;
//		
//		return true;
//	}
//	
//	/**
//	 * Returns whether the component value at the given index of this tuple and
//	 * of the given tuple {@code (t)} are exactly equal.
//	 * 
//	 * <p>
//	 * If the given tuple {@code (t)} is null this returns false.
//	 * 
//	 * <p>
//	 * As in most situations only the component values of the tuple are relevant
//	 * when working with tuples, this does not require this tuple and the given
//	 * tuple {@code (t)} to be the same instance.
//	 * 
//	 * <p>
//	 * The valid index range is from 0 to 1.
//	 * 
//	 * <table>
//	 * <tr><th>Index</th><th>Component</th></tr>
//	 * <tr><td>0</td><td>v0</td></tr>
//	 * <tr><td>1</td><td>v1</td></tr>
//	 * </table>
//	 * 
//	 * <p>
//	 * <b>Formula:</b>
//	 * <br>
//	 * {@code v(index) = t.v(index)}
//	 * 
//	 * @param index
//	 * The index of the component of which the value is to be checked.
//	 * @param t The tuple to compare with.
//	 * 
//	 * @return
//	 * <p>
//	 * {@code true} - If the given tuple {@code (t)} is not {@code null} and
//	 * the component value at the given index of this tuple and the given tuple
//	 * are equal.
//	 * 
//	 * <p>
//	 * {@code false} - Otherwise.
//	 */
//	public static boolean equalsAt(int index, @Nullable Tup2RF t1, @Nullable Tup2RF t2)
//	{
//		if(t1 == t2) return true;
//		if(t1 == null) return false;
//		if(t2 == null) return false;
//		
//		switch(index)
//		{
//			case 0: return t1.v0() == t2.v0();
//			case 1: return t1.v1() == t2.v1();
//			default: throw new IndexOutOfBoundsException();
//		}
//	}
//
//	/**
//	 * Returns whether the component value at the given index of this tuple and
//	 * of the given tuple {@code (t)} are exactly equal.
//	 * 
//	 * <p>
//	 * If the given tuple {@code (t)} is null or the given index is not
//	 * available in the given tuple this returns false.
//	 * 
//	 * <p>
//	 * As in most situations only the component values of the tuple are relevant
//	 * when working with tuples, this does not require this tuple and the given
//	 * tuple {@code (t)} to be the same instance.
//	 * 
//	 * <p>
//	 * The valid index range is from 0 to 1.
//	 * 
//	 * <table>
//	 * <tr><th>Index</th><th>Component</th></tr>
//	 * <tr><td>0</td><td>v0</td></tr>
//	 * <tr><td>1</td><td>v1</td></tr>
//	 * </table>
//	 * 
//	 * <p>
//	 * <b>Formula:</b>
//	 * <br>
//	 * {@code v(index) = t.v(index)}
//	 * 
//	 * @param index
//	 * The index of the component of which the value is to be checked.
//	 * @param t The tuple to compare with.
//	 * 
//	 * @return
//	 * <p>
//	 * {@code true} - If the given tuple {@code (t)} is not {@code null}, the
//	 * component value at the given index is available in the given tuple and
//	 * the component value at the given index of this tuple and the given tuple
//	 * are equal.
//	 * 
//	 * <p>
//	 * {@code false} - Otherwise.
//	 */
//	public static boolean equalsAt(int index, @Nullable Tup2RF t1, @Nullable TupRF t2)
//	{
//		if(t1 == t2) return true;
//		if(t1 == null) return false;
//		if(t2 == null) return false;
//		
//		switch(index)
//		{
//			case 0: return t1.v0() == t2.getAt(0);
//			case 1: return t1.v1() == t2.getAt(1);
//			default: throw new IndexOutOfRangeException(index, 1);
//		}
//	}
//
//
//	/**
//	 * Returns whether the component value at the given index of this tuple and
//	 * of the given tuple {@code (t)} are exactly equal.
//	 * 
//	 * <p>
//	 * If the given tuple {@code (t)} is null or the given index is not
//	 * available in the given tuple this returns false.
//	 * 
//	 * <p>
//	 * As in most situations only the component values of the tuple are relevant
//	 * when working with tuples, this does not require this tuple and the given
//	 * tuple {@code (t)} to be the same instance.
//	 * 
//	 * <p>
//	 * The valid index range is from 0 to 1.
//	 * 
//	 * <table>
//	 * <tr><th>Index</th><th>Component</th></tr>
//	 * <tr><td>0</td><td>v0</td></tr>
//	 * <tr><td>1</td><td>v1</td></tr>
//	 * </table>
//	 * 
//	 * <p>
//	 * <b>Formula:</b>
//	 * <br>
//	 * {@code v(index) = t[index]}
//	 * 
//	 * @param index
//	 * The index of the component of which the value is to be checked.
//	 * @param t The tuple to compare with as an array.
//	 * 
//	 * @return
//	 * <p>
//	 * {@code true} - If the given tuple {@code (t)} is not {@code null}, the
//	 * component value at the given index is available in the given tuple and
//	 * the component value at the given index of this tuple and the given tuple
//	 * are equal.
//	 * 
//	 * <p>
//	 * {@code false} - Otherwise.
//	 */
//	public static boolean equalsAt(int index, @Nullable Tup2RF t1, @Nullable float... t2)
//	{
//		if(t1 == null) return false;
//		if(t2 == null) return false;
//		
//		switch(index)
//		{
//			case 0: return t1.v0() == t2[0];
//			case 1: return t1.v1() == t2[1];
//			default: throw new IndexOutOfRangeException(index, 1);
//		}
//	}
//
//	/**
//	 * Returns whether the component value at the given index of this tuple and
//	 * the given value are exactly equal.
//	 * 
//	 * <p>
//	 * The valid index range is from 0 to 1.
//	 * 
//	 * <table>
//	 * <tr><th>Index</th><th>Component</th></tr>
//	 * <tr><td>0</td><td>v0</td></tr>
//	 * <tr><td>1</td><td>v1</td></tr>
//	 * </table>
//	 * 
//	 * <p>
//	 * <b>Formula:</b>
//	 * <br>
//	 * {@code v(index) = value}
//	 * 
//	 * @param index
//	 * The index of the component of which the value is to be checked.
//	 * @param value The value to compare with.
//	 * 
//	 * @return
//	 * <p>
//	 * {@code true} - If the component value at the given index of this tuple
//	 * and the given value are equal.
//	 * 
//	 * <p>
//	 * {@code false} - Otherwise.
//	 */
//	public static boolean equalsAt(int index, @Nullable Tup2RF t, float value)
//	{
//		if(t == null) return false;
//		
//		switch(index)
//		{
//			case 0: return t.v0() == value;
//			case 1: return t.v1() == value;
//			default: throw new IndexOutOfRangeException(index, 1);
//		}
//	}
//
//	/**
//	 * Returns whether the component value at the given index of this tuple and
//	 * of the given tuple {@code (t)} are approximately equal.
//	 * 
//	 * <p>
//	 * This takes into account an inclusive margin of the given tolerance around
//	 * the compared values in positive and negative direction.
//	 * This margin allows for example to compensate for floating point precision
//	 * errors.
//	 * 
//	 * <p>
//	 * If the given tuple {@code (t)} is null this returns false.
//	 * 
//	 * <p>
//	 * As in most situations only the component values of the tuple are relevant
//	 * when working with tuples, this does require this tuple and the given
//	 * tuple {@code t} to be the same instance.
//	 * 
//	 * <p>
//	 * The minimum allowed tolerance is 0.0f. A tolerance of 0.0f behaves like
//	 * {@link #equalsAt(int, Tup2RF)}.
//	 * 
//	 * <p>
//	 * The valid index range is from 0 to 1.
//	 * 
//	 * <table>
//	 * <tr><th>Index</th><th>Component</th></tr>
//	 * <tr><td>0</td><td>v0</td></tr>
//	 * <tr><td>1</td><td>v1</td></tr>
//	 * </table>
//	 * 
//	 * <p>
//	 * <b>Formula:</b>
//	 * <br>
//	 * {@code -tolerance <= (v(index) - t.v(index)) <= tolerance}
//	 * 
//	 * @param tolerance
//	 * The tolerance around the values, that should still count as the value.
//	 * @param index
//	 * The index of the component of which the value is to be checked.
//	 * @param t The tuple to compare with.
//	 * 
//	 * @return
//	 * <p>
//	 * {@code true} - If the given tuple {@code (t)} is not {@code null} and
//	 * the component value at the given index of this tuple and the given tuple
//	 * are equal, taking into account the given tolerance.
//	 * 
//	 * <p>
//	 * {@code false} - Otherwise.
//	 */
//	public static boolean equalsAt(float tolerance, int index, @Nullable Tup2RF t1, @Nullable Tup2RF t2)
//	{
//		if(t1 == t2) return true;
//		if(t1 == null) return false;
//		if(t2 == null) return false;
//		
//		switch(index)
//		{
//			case 0: return MathUtils.equals(tolerance, t1.v0(), t2.v0());
//			case 1: return MathUtils.equals(tolerance, t1.v1(), t2.v1());
//			default: throw new IndexOutOfRangeException(index, 1);
//		}
//	}
//
//	/**
//	 * Returns whether the component value at the given index of this tuple and
//	 * of the given tuple {@code (t)} are approximately equal.
//	 * 
//	 * <p>
//	 * This takes into account an inclusive margin of the given tolerance around
//	 * the compared values in positive and negative direction.
//	 * This margin allows for example to compensate for floating point precision
//	 * errors.
//	 * 
//	 * <p>
//	 * If the given tuple {@code (t)} is null or the given index is not
//	 * available in the given tuple this returns false.
//	 * 
//	 * <p>
//	 * As in most situations only the component values of the tuple are relevant
//	 * when working with tuples, this does require this tuple and the given
//	 * tuple {@code t} to be the same instance.
//	 * 
//	 * <p>
//	 * The minimum allowed tolerance is 0.0f. A tolerance of 0.0f behaves like
//	 * {@link #equalsAt(int, TupRF)}.
//	 * 
//	 * <p>
//	 * The valid index range is from 0 to 1.
//	 * 
//	 * <table>
//	 * <tr><th>Index</th><th>Component</th></tr>
//	 * <tr><td>0</td><td>v0</td></tr>
//	 * <tr><td>1</td><td>v1</td></tr>
//	 * </table>
//	 * 
//	 * <p>
//	 * <b>Formula:</b>
//	 * <br>
//	 * {@code -tolerance <= (v(index) - t.v(index)) <= tolerance}
//	 * 
//	 * @param tolerance
//	 * The tolerance around the values, that should still count as the value.
//	 * @param index
//	 * The index of the component of which the value is to be checked.
//	 * @param t The tuple to compare with.
//	 * 
//	 * @return
//	 * <p>
//	 * {@code true} - If the given tuple {@code (t)} is not {@code null}, the
//	 * component value at the given index is available in the given tuple and
//	 * the component value at the given index of this tuple and the given tuple
//	 * are equal, taking into account the given tolerance.
//	 * 
//	 * <p>
//	 * {@code false} - Otherwise.
//	 */
//	public static boolean equalsAt(float tolerance, int index, @Nullable Tup2RF t1, @Nullable TupRF t2)
//	{
//		if(t1 == t2) return true;
//		if(t1 == null) return false;
//		if(t2 == null) return false;
//		
//		switch(index)
//		{
//			case 0: return MathUtils.equals(tolerance, t1.v0(), t2.getAt(0));
//			case 1: return MathUtils.equals(tolerance, t1.v1(), t2.getAt(1));
//			default: throw new IndexOutOfRangeException(index, 1);
//		}
//	}
//
//	/**
//	 * Returns whether the component value at the given index of this tuple and
//	 * of the given tuple {@code (t)} are approximately equal.
//	 * 
//	 * <p>
//	 * This takes into account an inclusive margin of the given tolerance around
//	 * the compared values in positive and negative direction.
//	 * This margin allows for example to compensate for floating point precision
//	 * errors.
//	 * 
//	 * <p>
//	 * If the given tuple {@code (t)} is null or the given index is not
//	 * available in the given tuple this returns false.
//	 * 
//	 * <p>
//	 * As in most situations only the component values of the tuple are relevant
//	 * when working with tuples, this does require this tuple and the given
//	 * tuple {@code t} to be the same instance.
//	 * 
//	 * <p>
//	 * The minimum allowed tolerance is 0.0f. A tolerance of 0.0f behaves like
//	 * {@link #equalsAt(int, float[]) equalsAt(int, float...)}.
//	 * 
//	 * <p>
//	 * The valid index range is from 0 to 1.
//	 * 
//	 * <table>
//	 * <tr><th>Index</th><th>Component</th></tr>
//	 * <tr><td>0</td><td>v0</td></tr>
//	 * <tr><td>1</td><td>v1</td></tr>
//	 * </table>
//	 * 
//	 * <p>
//	 * <b>Formula:</b>
//	 * <br>
//	 * {@code -tolerance <= (v(index) - t[index]) <= tolerance}
//	 * 
//	 * @param tolerance
//	 * The tolerance around the values, that should still count as the value.
//	 * @param index
//	 * The index of the component of which the value is to be checked.
//	 * @param t The tuple to compare with as an array.
//	 * 
//	 * @return
//	 * <p>
//	 * {@code true} - If the given tuple {@code (t)} is not {@code null}, the
//	 * component value at the given index is available in the given tuple and
//	 * the component values at the given index of this tuple and the given tuple
//	 * are equal, taking into account the given tolerance.
//	 * 
//	 * <p>
//	 * {@code false} - Otherwise.
//	 */
//	public static boolean equalsAt(float tolerance, int index, @Nullable Tup2RF t1, @Nullable float... t2)
//	{
//		if(t1 == null) return false;
//		if(t2 == null) return false;
//		
//		switch(index)
//		{
//			case 0: return MathUtils.equals(tolerance, t1.v0(), t2[0]);
//			case 1: return MathUtils.equals(tolerance, t1.v1(), t2[1]);
//			default: throw new IndexOutOfRangeException(index, 1);
//		}
//	}
//
//	/**
//	 * Returns whether the component value at the given index of this tuple and
//	 * the given value are approximately equal.
//	 * 
//	 * <p>
//	 * This takes into account an inclusive margin of the given tolerance around
//	 * the compared values in positive and negative direction.
//	 * This margin allows for example to compensate for floating point precision
//	 * errors.
//	 * 
//	 * <p>
//	 * The minimum allowed tolerance is 0.0f. A tolerance of 0.0f behaves like
//	 * {@link #equalsAt(int, float)}.
//	 * 
//	 * <p>
//	 * The valid index range is from 0 to 1.
//	 * 
//	 * <table>
//	 * <tr><th>Index</th><th>Component</th></tr>
//	 * <tr><td>0</td><td>v0</td></tr>
//	 * <tr><td>1</td><td>v1</td></tr>
//	 * </table>
//	 * 
//	 * <p>
//	 * <b>Formula:</b>
//	 * <br>
//	 * {@code -tolerance <= (v(index) - value) <= tolerance}
//	 * 
//	 * @param tolerance
//	 * The tolerance around the values, that should still count as the value.
//	 * @param index
//	 * The index of the component of which the value is to be checked.
//	 * @param value The value to compare with.
//	 * 
//	 * @return
//	 * <p>
//	 * {@code true} - If the component value at the given index of this tuple
//	 * and the given value are equal, taking into account the given tolerance.
//	 * 
//	 * <p>
//	 * {@code false} - Otherwise.
//	 */
//	public static boolean equalsAt(float tolerance, int index, @Nullable Tup2RF t, float value)
//	{
//		if(t == null) return false;
//
//		switch(index)
//		{
//			case 0: return MathUtils.equals(tolerance, t.v0(), value);
//			case 1: return MathUtils.equals(tolerance, t.v1(), value);
//			default: throw new IndexOutOfRangeException(index, 1);
//		}
//	}
//
//	/**
//	 * Returns whether the first component value of this tuple and
//	 * of the given tuple {@code (t)} are exactly equal.
//	 * 
//	 * <p>
//	 * If the given tuple {@code (t)} is null this returns false.
//	 * 
//	 * <p>
//	 * As in most situations only the component values of the tuple are relevant
//	 * when working with tuples, this does not require this tuple and the given
//	 * tuple {@code (t)} to be the same instance.
//	 * 
//	 * <p>
//	 * <b>Formula:</b>
//	 * <br>
//	 * {@code v(0) = t.v0}
//	 * 
//	 * @param t The tuple to compare with.
//	 * 
//	 * @return
//	 * <p>
//	 * {@code true} - If the given tuple {@code (t)} is not {@code null} and the
//	 * first component value of this tuple and the given tuple are equal.
//	 * 
//	 * <p>
//	 * {@code false} - Otherwise.
//	 */
//	public static boolean equalsAtV0(@Nullable Tup2RF t1, @Nullable Tup2RF t2)
//	{
//		if(t1 == t2) return true;
//		if(t1 == null) return false;
//		if(t2 == null) return false;
//		
//		return t1.v0() == t2.v0();
//	}
//
//	/**
//	 * Returns whether the first component value of this tuple and
//	 * of the given tuple {@code (t)} are exactly equal.
//	 * 
//	 * <p>
//	 * If the given tuple {@code (t)} is null or the given tuple has no first
//	 * component this returns false.
//	 * 
//	 * <p>
//	 * As in most situations only the component values of the tuple are relevant
//	 * when working with tuples, this does not require this tuple and the given
//	 * tuple {@code (t)} to be the same instance.
//	 * 
//	 * <p>
//	 * <b>Formula:</b>
//	 * <br>
//	 * {@code v(0) = t.v(0)}
//	 * 
//	 * @param t The tuple to compare with.
//	 * 
//	 * @return
//	 * <p>
//	 * {@code true} - If the given tuple {@code (t)} is not {@code null}, the
//	 * first component value is available in the given tuple and the first
//	 * component value of this tuple and the given tuple are equal.
//	 * 
//	 * <p>
//	 * {@code false} - Otherwise.
//	 */
//	public static boolean equalsAtV0(@Nullable Tup2RF t1, @Nullable TupRF t2)
//	{
//		if(t1 == t2) return true;
//		if(t1 == null) return false;
//		if(t2 == null) return false;
//		
//		return t1.v0() == t2.getAt(0);
//	}
//
//	/**
//	 * Returns whether the first component value of this tuple and
//	 * of the given tuple {@code (t)} are exactly equal.
//	 * 
//	 * <p>
//	 * If the given tuple {@code (t)} is null or the given tuple has no first
//	 * component this returns false.
//	 * 
//	 * <p>
//	 * As in most situations only the component values of the tuple are relevant
//	 * when working with tuples, this does not require this tuple and the given
//	 * tuple {@code (t)} to be the same instance.
//	 * 
//	 * <p>
//	 * <b>Formula:</b>
//	 * <br>
//	 * {@code v(0) = t[0]}
//	 * 
//	 * @param t The tuple to compare with as an array.
//	 * 
//	 * @return
//	 * <p>
//	 * {@code true} - If the given tuple {@code (t)} is not {@code null}, the
//	 * first component value is available in the given tuple and the first
//	 * component value of this tuple and the given tuple are equal.
//	 * 
//	 * <p>
//	 * {@code false} - Otherwise.
//	 */
//	public static boolean equalsAtV0(@Nullable Tup2RF t1, @Nullable float... t2)
//	{
//		if(t1 == null) return false;
//		if(t2 == null) return false;
//		
//		return t1.v0() == t2[0];
//	}
//
//
//	/**
//	 * Returns whether the first component value of this tuple and
//	 * the given value are exactly equal.
//	 * 
//	 * <p>
//	 * <b>Formula:</b>
//	 * <br>
//	 * {@code v(0) = value}
//	 * 
//	 * @param t The value to compare with.
//	 * 
//	 * @return
//	 * <p>
//	 * {@code true} - If the first component value of this tuple and the given
//	 * value are equal.
//	 * 
//	 * <p>
//	 * {@code false} - Otherwise.
//	 */
//	public static boolean equalsAtV0(@Nullable Tup2RF t, float value)
//	{
//		if(t == null) return false;
//		
//		return t.v0() == value;
//	}
//
//	/**
//	 * Returns whether the second component value of this tuple and
//	 * of the given tuple {@code (t)} are exactly equal.
//	 * 
//	 * <p>
//	 * If the given tuple {@code (t)} is null this returns false.
//	 * 
//	 * <p>
//	 * As in most situations only the component values of the tuple are relevant
//	 * when working with tuples, this does not require this tuple and the given
//	 * tuple {@code (t)} to be the same instance.
//	 * 
//	 * <p>
//	 * <b>Formula:</b>
//	 * <br>
//	 * {@code v(1) = t.v1}
//	 * 
//	 * @param t The tuple to compare with.
//	 * 
//	 * @return
//	 * <p>
//	 * {@code true} - If the given tuple {@code (t)} is not {@code null} and the
//	 * second component value of this tuple and the given tuple are equal.
//	 * 
//	 * <p>
//	 * {@code false} - Otherwise.
//	 */
//	public static boolean equalsAtV1(@Nullable Tup2RF t1, @Nullable Tup2RF t2)
//	{
//		if(t1 == t2) return true;
//		if(t1 == null) return false;
//		if(t2 == null) return false;
//		
//		return t1.v1() == t2.v1();
//	}
//	
//	/**
//	 * Returns whether the second component value of this tuple and
//	 * of the given tuple {@code (t)} are exactly equal.
//	 * 
//	 * <p>
//	 * If the given tuple {@code (t)} is null or the given tuple has no second
//	 * component this returns false.
//	 * 
//	 * <p>
//	 * As in most situations only the component values of the tuple are relevant
//	 * when working with tuples, this does not require this tuple and the given
//	 * tuple {@code (t)} to be the same instance.
//	 * 
//	 * <p>
//	 * <b>Formula:</b>
//	 * <br>
//	 * {@code v(1) = t.v(1)}
//	 * 
//	 * @param t The tuple to compare with.
//	 * 
//	 * @return
//	 * <p>
//	 * {@code true} - If the given tuple {@code (t)} is not {@code null}, the
//	 * second component value is available in the given tuple and the second
//	 * component value of this tuple and the given tuple are equal.
//	 * 
//	 * <p>
//	 * {@code false} - Otherwise.
//	 */
//	public static boolean equalsAtV1(@Nullable Tup2RF t1, @Nullable TupRF t2)
//	{
//		if(t1 == t2) return true;
//		if(t1 == null) return false;
//		if(t2 == null) return false;
//		
//		return t1.v1() == t2.getAt(1);
//	}
//
//	/**
//	 * Returns whether the second component value of this tuple and
//	 * of the given tuple {@code (t)} are exactly equal.
//	 * 
//	 * <p>
//	 * If the given tuple {@code (t)} is null or the given tuple has no second
//	 * component this returns false.
//	 * 
//	 * <p>
//	 * As in most situations only the component values of the tuple are relevant
//	 * when working with tuples, this does not require this tuple and the given
//	 * tuple {@code (t)} to be the same instance.
//	 * 
//	 * <p>
//	 * <b>Formula:</b>
//	 * <br>
//	 * {@code v(1) = t[1]}
//	 * 
//	 * @param t The tuple to compare with as an array.
//	 * 
//	 * @return
//	 * <p>
//	 * {@code true} - If the given tuple {@code (t)} is not {@code null}, the
//	 * second component value is available in the given tuple and the second
//	 * component value of this tuple and the given tuple are equal.
//	 * 
//	 * <p>
//	 * {@code false} - Otherwise.
//	 */
//	public static boolean equalsAtV1(@Nullable Tup2RF t1, @Nullable float... t2)
//	{
//		if(t1 == null) return false;
//		if(t2 == null) return false;
//		
//		return t1.v1() == t2[1];
//	}
//
//	/**
//	 * Returns whether the second component value of this tuple and
//	 * the given value are exactly equal.
//	 * 
//	 * <p>
//	 * <b>Formula:</b>
//	 * <br>
//	 * {@code v(1) = value}
//	 * 
//	 * @param t The value to compare with.
//	 * 
//	 * @return
//	 * <p>
//	 * {@code true} - If the second component value of this tuple and the given
//	 * value are equal.
//	 * 
//	 * <p>
//	 * {@code false} - Otherwise.
//	 */
//	public static boolean equalsAtV1(@Nullable Tup2RF t, float value)
//	{
//		if(t == null) return false;
//		
//		return t.v1() == value;
//	}
//
//	/**
//	 * Returns whether the first component value of this tuple and of the given
//	 * tuple {@code (t)} are approximately equal.
//	 * 
//	 * <p>
//	 * This takes into account an inclusive margin of the given tolerance around
//	 * the compared values in positive and negative direction.
//	 * This margin allows for example to compensate for floating point precision
//	 * errors.
//	 * 
//	 * <p>
//	 * If the given tuple {@code (t)} is null this returns false.
//	 * 
//	 * <p>
//	 * As in most situations only the component values of the tuple are relevant
//	 * when working with tuples, this does require this tuple and the given
//	 * tuple {@code t} to be the same instance.
//	 * 
//	 * <p>
//	 * The minimum allowed tolerance is 0.0f. A tolerance of 0.0f behaves like
//	 * {@link #equalsAtV0(Tup2RF)}.
//	 * 
//	 * <p>
//	 * <b>Formula:</b>
//	 * <br>
//	 * {@code -tolerance <= (v(0) - t.v0) <= tolerance}
//	 * 
//	 * @param tolerance
//	 * The tolerance around the values, that should still count as the value.
//	 * @param t The tuple to compare with.
//	 * 
//	 * @return
//	 * <p>
//	 * {@code true} - If the given tuple {@code (t)} is not {@code null} and the
//	 * first component value of this tuple and the given tuple are equal, taking
//	 * into account the given tolerance.
//	 * 
//	 * <p>
//	 * {@code false} - Otherwise.
//	 */
//	public static boolean equalsAtV0(float tolerance, @Nullable Tup2RF t1, @Nullable Tup2RF t2)
//	{
//		if(t1 == t2) return true;
//		if(t1 == null) return false;
//		if(t2 == null) return false;
//		
//		return MathUtils.equals(tolerance, t1.v0(), t2.v0());
//	}
//
//	/**
//	 * Returns whether the first component value of this tuple and of the given
//	 * tuple {@code (t)} are approximately equal.
//	 * 
//	 * <p>
//	 * This takes into account an inclusive margin of the given tolerance around
//	 * the compared values in positive and negative direction.
//	 * This margin allows for example to compensate for floating point precision
//	 * errors.
//	 * 
//	 * <p>
//	 * If the given tuple {@code (t)} is null or the given tuple has no first
//	 * component this returns false.
//	 * 
//	 * <p>
//	 * As in most situations only the component values of the tuple are relevant
//	 * when working with tuples, this does require this tuple and the given
//	 * tuple {@code t} to be the same instance.
//	 * 
//	 * <p>
//	 * The minimum allowed tolerance is 0.0f. A tolerance of 0.0f behaves like
//	 * {@link #equalsAtV0(TupRF)}.
//	 * 
//	 * <p>
//	 * <b>Formula:</b>
//	 * <br>
//	 * {@code -tolerance <= (v(0) - t.v(0)) <= tolerance}
//	 * 
//	 * @param tolerance
//	 * The tolerance around the values, that should still count as the value.
//	 * @param t The tuple to compare with.
//	 * 
//	 * @return
//	 * <p>
//	 * {@code true} - If the given tuple {@code (t)} is not {@code null}, the
//	 * first component value is available in the given tuple and the first
//	 * component value of this tuple and the given tuple are equal, taking into
//	 * account the given tolerance.
//	 * 
//	 * <p>
//	 * {@code false} - Otherwise.
//	 */
//	public static boolean equalsAtV0(float tolerance, @Nullable Tup2RF t1, @Nullable TupRF t2)
//	{
//		if(t1 == t2) return true;
//		if(t1 == null) return false;
//		if(t2 == null) return false;
//		
//		return MathUtils.equals(tolerance, t1.v0(), t2.getAt(0));
//	}
//
//	/**
//	 * Returns whether the first component value of this tuple and of the given
//	 * tuple {@code (t)} are approximately equal.
//	 * 
//	 * <p>
//	 * This takes into account an inclusive margin of the given tolerance around
//	 * the compared values in positive and negative direction.
//	 * This margin allows for example to compensate for floating point precision
//	 * errors.
//	 * 
//	 * <p>
//	 * If the given tuple {@code (t)} is null or the given tuple has no first
//	 * component this returns false.
//	 * 
//	 * <p>
//	 * As in most situations only the component values of the tuple are relevant
//	 * when working with tuples, this does require this tuple and the given
//	 * tuple {@code t} to be the same instance.
//	 * 
//	 * <p>
//	 * The minimum allowed tolerance is 0.0f. A tolerance of 0.0f behaves like
//	 * {@link #equalsAtV0(float[]) equalsAtV0(float...)}.
//	 * 
//	 * <p>
//	 * <b>Formula:</b>
//	 * <br>
//	 * {@code -tolerance <= (v(0) - t[0]) <= tolerance}
//	 * 
//	 * @param tolerance
//	 * The tolerance around the values, that should still count as the value.
//	 * @param t The tuple to compare with as an array.
//	 * 
//	 * @return
//	 * <p>
//	 * {@code true} - If the given tuple {@code (t)} is not {@code null}, the
//	 * first component value is available in the given tuple and the first
//	 * component value of this tuple and the given tuple are equal, taking into
//	 * account the given tolerance.
//	 * 
//	 * <p>
//	 * {@code false} - Otherwise.
//	 */
//	public static boolean equalsAtV0(float tolerance, @Nullable Tup2RF t1, @Nullable float... t2)
//	{
//		if(t1 == null) return false;
//		if(t2 == null) return false;
//		
//		return MathUtils.equals(tolerance, t1.v0(), t2[0]);
//	}
//
//	/**
//	 * Returns whether the first component value of this tuple and the given
//	 * value are approximately equal.
//	 * 
//	 * <p>
//	 * This takes into account an inclusive margin of the given tolerance around
//	 * the compared values in positive and negative direction.
//	 * This margin allows for example to compensate for floating point precision
//	 * errors.
//	 * 
//	 * <p>
//	 * The minimum allowed tolerance is 0.0f. A tolerance of 0.0f behaves like
//	 * {@link #equalsAtV0(float)}.
//	 * 
//	 * <p>
//	 * <b>Formula:</b>
//	 * <br>
//	 * {@code -tolerance <= (v(0) - value) <= tolerance}
//	 * 
//	 * @param tolerance
//	 * The tolerance around the values, that should still count as the value.
//	 * @param t The value to compare with.
//	 * 
//	 * @return
//	 * <p>
//	 * {@code true} - If the first component value of this tuple and the given
//	 * value are equal, taking into account the given tolerance.
//	 * 
//	 * <p>
//	 * {@code false} - Otherwise.
//	 */
//	public static boolean equalsAtV0(float tolerance, @Nullable Tup2RF t, float value)
//	{
//		if(t == null) return false;
//		
//		return MathUtils.equals(tolerance, t.v0(), value);
//	}
//
//	/**
//	 * Returns whether the second component value of this tuple and of the given
//	 * tuple {@code (t)} are approximately equal.
//	 * 
//	 * <p>
//	 * This takes into account an inclusive margin of the given tolerance around
//	 * the compared values in positive and negative direction.
//	 * This margin allows for example to compensate for floating point precision
//	 * errors.
//	 * 
//	 * <p>
//	 * If the given tuple {@code (t)} is null this returns false.
//	 * 
//	 * <p>
//	 * As in most situations only the component values of the tuple are relevant
//	 * when working with tuples, this does require this tuple and the given
//	 * tuple {@code t} to be the same instance.
//	 * 
//	 * <p>
//	 * The minimum allowed tolerance is 0.0f. A tolerance of 0.0f behaves like
//	 * {@link #equalsAtV1(Tup2RF)}.
//	 * 
//	 * <p>
//	 * <b>Formula:</b>
//	 * <br>
//	 * {@code -tolerance <= (v(1) - t.v1) <= tolerance}
//	 * 
//	 * @param tolerance
//	 * The tolerance around the values, that should still count as the value.
//	 * @param t The tuple to compare with.
//	 * 
//	 * @return
//	 * <p>
//	 * {@code true} - If the given tuple {@code (t)} is not {@code null} and the
//	 * second component value of this tuple and the given tuple are equal,
//	 * taking into account the given tolerance.
//	 * 
//	 * <p>
//	 * {@code false} - Otherwise.
//	 */
//	public static boolean equalsAtV1(float tolerance, @Nullable Tup2RF t1, @Nullable Tup2RF t2)
//	{
//		if(t1 == t2) return true;
//		if(t1 == null) return false;
//		if(t2 == null) return false;
//		
//		return MathUtils.equals(tolerance, t1.v1(), t2.v1());
//	}
//
//	/**
//	 * Returns whether the second component value of this tuple and of the given
//	 * tuple {@code (t)} are approximately equal.
//	 * 
//	 * <p>
//	 * This takes into account an inclusive margin of the given tolerance around
//	 * the compared values in positive and negative direction.
//	 * This margin allows for example to compensate for floating point precision
//	 * errors.
//	 * 
//	 * <p>
//	 * If the given tuple {@code (t)} is null or the given tuple has no second
//	 * component this returns false.
//	 * 
//	 * <p>
//	 * As in most situations only the component values of the tuple are relevant
//	 * when working with tuples, this does require this tuple and the given
//	 * tuple {@code t} to be the same instance.
//	 * 
//	 * <p>
//	 * The minimum allowed tolerance is 0.0f. A tolerance of 0.0f behaves like
//	 * {@link #equalsAtV1(TupRF)}.
//	 * 
//	 * <p>
//	 * <b>Formula:</b>
//	 * <br>
//	 * {@code -tolerance <= (v(1) - t.v(1)) <= tolerance}
//	 * 
//	 * @param tolerance
//	 * The tolerance around the values, that should still count as the value.
//	 * @param t The tuple to compare with.
//	 * 
//	 * @return
//	 * <p>
//	 * {@code true} - If the given tuple {@code (t)} is not {@code null}, the
//	 * second component value is available in the given tuple and the second
//	 * component value of this tuple and the given tuple are equal, taking into
//	 * account the given tolerance.
//	 * 
//	 * <p>
//	 * {@code false} - Otherwise.
//	 */
//	public static boolean equalsAtV1(float tolerance, @Nullable Tup2RF t1, @Nullable TupRF t2)
//	{
//		if(t1 == t2) return true;
//		if(t1 == null) return false;
//		if(t2 == null) return false;
//		
//		return MathUtils.equals(tolerance, t1.v1(), t2.getAt(1));
//	}
//
//	/**
//	 * Returns whether the second component value of this tuple and of the given
//	 * tuple {@code (t)} are approximately equal.
//	 * 
//	 * <p>
//	 * This takes into account an inclusive margin of the given tolerance around
//	 * the compared values in positive and negative direction.
//	 * This margin allows for example to compensate for floating point precision
//	 * errors.
//	 * 
//	 * <p>
//	 * If the given tuple {@code (t)} is null or the given tuple has no second
//	 * component this returns false.
//	 * 
//	 * <p>
//	 * As in most situations only the component values of the tuple are relevant
//	 * when working with tuples, this does require this tuple and the given
//	 * tuple {@code t} to be the same instance.
//	 * 
//	 * <p>
//	 * The minimum allowed tolerance is 0.0f. A tolerance of 0.0f behaves like
//	 * {@link #equalsAtV1(float[]) equalsAtV1(float...)}.
//	 * 
//	 * <p>
//	 * <b>Formula:</b>
//	 * <br>
//	 * {@code -tolerance <= (v(1) - t[1]) <= tolerance}
//	 * 
//	 * @param tolerance
//	 * The tolerance around the values, that should still count as the value.
//	 * @param t The tuple to compare with as an array.
//	 * 
//	 * @return
//	 * <p>
//	 * {@code true} - If the given tuple {@code (t)} is not {@code null}, the
//	 * second component value is available in the given tuple and the second
//	 * component value of this tuple and the given tuple are equal, taking into
//	 * account the given tolerance.
//	 * 
//	 * <p>
//	 * {@code false} - Otherwise.
//	 */
//	public static boolean equalsAtV1(float tolerance, @Nullable Tup2RF t1, @Nullable float... t2)
//	{
//		if(t1 == null) return false;
//		if(t2 == null) return false;
//		
//		return MathUtils.equals(tolerance, t1.v1(), t2[1]);
//	}
//
//	/**
//	 * Returns whether the second component value of this tuple and the given
//	 * value are approximately equal.
//	 * 
//	 * <p>
//	 * This takes into account an inclusive margin of the given tolerance around
//	 * the compared values in positive and negative direction.
//	 * This margin allows for example to compensate for floating point precision
//	 * errors.
//	 * 
//	 * <p>
//	 * The minimum allowed tolerance is 0.0f. A tolerance of 0.0f behaves like
//	 * {@link #equalsAtV1(float)}.
//	 * 
//	 * <p>
//	 * <b>Formula:</b>
//	 * <br>
//	 * {@code -tolerance <= (v(1) - value) <= tolerance}
//	 * 
//	 * @param tolerance
//	 * The tolerance around the values, that should still count as the value.
//	 * @param t The value to compare with.
//	 * 
//	 * @return
//	 * <p>
//	 * {@code true} - If the second component value of this tuple and the given
//	 * value are equal, taking into account the given tolerance.
//	 * 
//	 * <p>
//	 * {@code false} - Otherwise.
//	 */
//	public static boolean equalsAtV1(float tolerance, @Nullable Tup2RF t, float value)
//	{
//		if(t == null) return false;
//		
//		return MathUtils.equals(tolerance, t.v1(), value);
//	}
//	
//	/**
//	 * Performs a fast linear interpolation between the given tuple {@code (v1)} and the given tuple
//	 * {@code (v2)} and saves the result in the given extraction parameter. This sacrifices for
//	 * reduced calculations the precision and the applicability. The interpolation happens over the
//	 * interpolator value alpha in the range of 0.0 to 1.0.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code v1 + ( v2 - v1 ) * alpha}
//	 * 
//	 * @param v1
//	 *     The first vector.
//	 * @param v2
//	 *     The second vector.
//	 * @param alpha
//	 *     The interpolator in range of 0.0 to 1.0.
//	 * @param res
//	 *     The extraction parameter for the result as an array with at least two entries.
//	 * 
//	 * @return The extraction parameter with the result.
//	 */
//	public static float[] lerp(Tup2RF v1, Tup2RF v2, float alpha, @ExtractionParam @MinLength(2) float[] res)
//	{
//		return lerp(v1.v0(), v1.v1(), v2.v0(), v2.v1(), alpha, res);
//	}
//	
//	/**
//	 * Performs a fast linear interpolation between the given tuple {@code (v1)} and the given tuple
//	 * {@code (v2[0], v2[1])} and saves the result in the given extraction parameter. This
//	 * sacrifices for reduced calculations the precision and the applicability. The interpolation
//	 * happens over the interpolator value alpha in the range of 0.0 to 1.0.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code v1 + ( (v2[0], v2[1]) - v1 ) * alpha}
//	 * 
//	 * @param v1
//	 *     The first vector.
//	 * @param v2
//	 *     The second vector as an array with at least two entries.
//	 * @param alpha
//	 *     The interpolator in range of 0.0 to 1.0.
//	 * @param res
//	 *     The extraction parameter for the result as an array with at least two entries.
//	 * 
//	 * @return The extraction parameter with the result.
//	 */
//	public static float[] lerp(Tup2RF v1, @MinLength(2) float[] v2, float alpha, @ExtractionParam @MinLength(2) float[] res)
//	{
//		return lerp(v1.v0(), v1.v1(), v2[0], v2[1], alpha, res);
//	}
//	
//	/**
//	 * Performs a fast linear interpolation between the given tuple {@code (v1)} and the given tuple
//	 * {@code (v2x, v2y)} and saves the result in the given extraction parameter. This sacrifices
//	 * for reduced calculations the precision and the applicability. The interpolation happens over
//	 * the interpolator value alpha in the range of 0.0 to 1.0.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code v1 + ( (v2x, v2y) - v1 ) * alpha}
//	 * 
//	 * @param v1
//	 *     The first vector.
//	 * @param v2x
//	 *     The value of the x component of the second vector.
//	 * @param v2y
//	 *     The value of the y component of the second vector.
//	 * @param alpha
//	 *     The interpolator in range of 0.0 to 1.0.
//	 * @param res
//	 *     The extraction parameter for the result as an array with at least two entries.
//	 * 
//	 * @return The extraction parameter with the result.
//	 */
//	public static float[] lerp(Tup2RF v1, float v2x, float v2y, float alpha, @ExtractionParam @MinLength(2) float[] res)
//	{
//		return lerp(v1.v0(), v1.v1(), v2x, v2y, alpha, res);
//	}
//	
//	/**
//	 * Performs a fast linear interpolation between the given tuple {@code (v1[0], v1[1])} and the
//	 * given tuple {@code (v2)} and saves the result in the given extraction parameter. This
//	 * sacrifices for reduced calculations the precision and the applicability. The interpolation
//	 * happens over the interpolator value alpha in the range of 0.0 to 1.0.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v1[0], v1[1]) + ( v2 - (v1[0], v1[1]) ) * alpha}
//	 * 
//	 * @param v1
//	 *     The first vector as an array with at least two entries.
//	 * @param v2
//	 *     The second vector.
//	 * @param alpha
//	 *     The interpolator in range of 0.0 to 1.0.
//	 * @param res
//	 *     The extraction parameter for the result as an array with at least two entries.
//	 * 
//	 * @return The extraction parameter with the result.
//	 */
//	public static float[] lerp(@MinLength(2) float[] v1, Tup2RF v2, float alpha, @ExtractionParam @MinLength(2) float[] res)
//	{
//		return lerp(v1[0], v1[1], v2.v0(), v2.v1(), alpha, res);
//	}
//	
//	/**
//	 * Performs a fast linear interpolation between the given tuple {@code (v1[0], v1[1])} and the
//	 * given tuple {@code (v2[0], v2[1])} and saves the result in the given extraction parameter.
//	 * This sacrifices for reduced calculations the precision and the applicability. The
//	 * interpolation happens over the interpolator value alpha in the range of 0.0 to 1.0.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v1[0], v1[1]) + ( (v2[0], v2[1]) - (v1[0], v1[1]) ) * alpha}
//	 * 
//	 * @param v1
//	 *     The first vector as an array with at least two entries.
//	 * @param v2
//	 *     The second vector as an array with at least two entries.
//	 * @param alpha
//	 *     The interpolator in range of 0.0 to 1.0.
//	 * @param res
//	 *     The extraction parameter for the result as an array with at least two entries.
//	 * 
//	 * @return The extraction parameter with the result.
//	 */
//	public static float[] lerp(@MinLength(2) float[] v1, @MinLength(2) float[] v2, float alpha, @ExtractionParam @MinLength(2) float[] res)
//	{
//		return lerp(v1[0], v1[1], v2[0], v2[1], alpha, res);
//	}
//	
//	/**
//	 * Performs a fast linear interpolation between the given tuple {@code (v1[0], v1[1])} and the
//	 * given tuple {@code (v2x, v2y)} and saves the result in the given extraction parameter. This
//	 * sacrifices for reduced calculations the precision and the applicability. The interpolation
//	 * happens over the interpolator value alpha in the range of 0.0 to 1.0.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v1[0], v1[1]) + ( (v2x, v2y) - (v1[0], v1[1]) ) * alpha}
//	 * 
//	 * @param v1
//	 *     The first vector as an array with at least two entries.
//	 * @param v2x
//	 *     The value of the x component of the second vector.
//	 * @param v2y
//	 *     The value of the y component of the second vector.
//	 * @param alpha
//	 *     The interpolator in range of 0.0 to 1.0.
//	 * @param res
//	 *     The extraction parameter for the result as an array with at least two entries.
//	 * 
//	 * @return The extraction parameter with the result.
//	 */
//	public static float[] lerp(@MinLength(2) float[] v1, float v2x, float v2y, float alpha, @ExtractionParam @MinLength(2) float[] res)
//	{
//		return lerp(v1[0], v1[1], v2x, v2y, alpha, res);
//	}
//	
//	/**
//	 * Performs a fast linear interpolation between the given tuple {@code (v1x, v1y)} and the given
//	 * tuple {@code (v2)} and saves the result in the given extraction parameter. This sacrifices
//	 * for reduced calculations the precision and the applicability. The interpolation happens over
//	 * the interpolator value alpha in the range of 0.0 to 1.0.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v1x, v1y) + ( v2 - (v1x, v1y) ) * alpha}
//	 * 
//	 * @param v1x
//	 *     The value of the x component of the first vector.
//	 * @param v1y
//	 *     The value of the y component of the first vector.
//	 * @param v2
//	 *     The second vector.
//	 * @param alpha
//	 *     The interpolator in range of 0.0 to 1.0.
//	 * @param res
//	 *     The extraction parameter for the result as an array with at least two entries.
//	 * 
//	 * @return The extraction parameter with the result.
//	 */
//	public static float[] lerp(float v1x, float v1y, Tup2RF v2, float alpha, @ExtractionParam @MinLength(2) float[] res)
//	{
//		return lerp(v1x, v1y, v2.v0(), v2.v1(), alpha, res);
//	}
//	
//	/**
//	 * Performs a fast linear interpolation between the given tuple {@code (v1x, v1y)} and the given
//	 * tuple {@code (v2[0], v2[1])} and saves the result in the given extraction parameter. This
//	 * sacrifices for reduced calculations the precision and the applicability. The interpolation
//	 * happens over the interpolator value alpha in the range of 0.0 to 1.0.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v1x, v1y) + ( (v2[0], v2[1]) - (v1x, v1y) ) * alpha}
//	 * 
//	 * @param v1x
//	 *     The value of the x component of the first vector.
//	 * @param v1y
//	 *     The value of the y component of the first vector.
//	 * @param v2
//	 *     The second vector as an array with at least two entries.
//	 * @param alpha
//	 *     The interpolator in range of 0.0 to 1.0.
//	 * @param res
//	 *     The extraction parameter for the result as an array with at least two entries.
//	 * 
//	 * @return The extraction parameter with the result.
//	 */
//	public static float[] lerp(float v1x, float v1y, @MinLength(2) float[] v2, float alpha, @ExtractionParam @MinLength(2) float[] res)
//	{
//		return lerp(v1x, v1y, v2[0], v2[1], alpha, res);
//	}
//	
//	/**
//	 * Performs a fast linear interpolation between the given tuple {@code (v1x, v1y)} and the given
//	 * tuple {@code (v2x, v2y)} and saves the result in the given extraction parameter. This
//	 * sacrifices for reduced calculations the precision and the applicability. The interpolation
//	 * happens over the interpolator value alpha in the range of 0.0 to 1.0.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v1x, v1y) + ( (v2x, v2y) - (v1x, v1y) ) * alpha}
//	 * 
//	 * @param v1x
//	 *     The value of the x component of the first vector.
//	 * @param v1y
//	 *     The value of the y component of the first vector.
//	 * @param v2x
//	 *     The value of the x component of the second vector.
//	 * @param v2y
//	 *     The value of the y component of the second vector.
//	 * @param alpha
//	 *     The interpolator in range of 0.0 to 1.0.
//	 * @param res
//	 *     The extraction parameter for the result as an array with at least two entries.
//	 * 
//	 * @return The extraction parameter with the result.
//	 */
//	public static float[] lerp(float v1x, float v1y, float v2x, float v2y, float alpha, @ExtractionParam @MinLength(2) float[] res)
//	{
//		if (alpha == 0.0f)
//		{
//			res[0] = v1x;
//			res[1] = v1y;
//			
//			return res;
//		}
//		
//		if (alpha == 1.0f)
//		{
//			res[0] = v2x;
//			res[1] = v2y;
//			
//			return res;
//		}
//		
//		res[0] = v1x + alpha * (v2x - v1x);
//		res[1] = v1y + alpha * (v2y - v1y);
//		
//		return res;
//	}
//	
//	/**
//	 * Performs a fast linear interpolation between the given tuple {@code (v1)} and the given tuple
//	 * {@code (v2)} and saves the result in the given extraction parameter object. This sacrifices
//	 * for reduced calculations the precision and the applicability. The interpolation happens over
//	 * the interpolator value alpha in the range of 0.0 to 1.0.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code v1 + ( v2 - v1 ) * alpha}
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param v1
//	 *     The first vector.
//	 * @param v2
//	 *     The second vector.
//	 * @param alpha
//	 *     The interpolator in range of 0.0 to 1.0.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T extends Tup2WF> T lerp(Tup2RF v1, Tup2RF v2, float alpha, @ExtractionParam T res)
//	{
//		return lerp(v1.v0(), v1.v1(), v2.v0(), v2.v1(), alpha, res);
//	}
//	
//	/**
//	 * Performs a fast linear interpolation between the given tuple {@code (v1)} and the given tuple
//	 * {@code (v2[0], v2[1])} and saves the result in the given extraction parameter object. This
//	 * sacrifices for reduced calculations the precision and the applicability. The interpolation
//	 * happens over the interpolator value alpha in the range of 0.0 to 1.0.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code v1 + ( (v2[0], v2[1]) - v1 ) * alpha}
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param v1
//	 *     The first vector.
//	 * @param v2
//	 *     The second vector as an array with at least two entries.
//	 * @param alpha
//	 *     The interpolator in range of 0.0 to 1.0.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T extends Tup2WF> T lerp(Tup2RF v1, @MinLength(2) float[] v2, float alpha, @ExtractionParam T res)
//	{
//		return lerp(v1.v0(), v1.v1(), v2[0], v2[1], alpha, res);
//	}
//	
//	/**
//	 * Performs a fast linear interpolation between the given tuple {@code (v1)} and the given tuple
//	 * {@code (v2x, v2y)} and saves the result in the given extraction parameter object. This
//	 * sacrifices for reduced calculations the precision and the applicability. The interpolation
//	 * happens over the interpolator value alpha in the range of 0.0 to 1.0.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code v1 + ( (v2x, v2y) - v1 ) * alpha}
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param v1
//	 *     The first vector.
//	 * @param v2x
//	 *     The value of the x component of the second vector.
//	 * @param v2y
//	 *     The value of the y component of the second vector.
//	 * @param alpha
//	 *     The interpolator in range of 0.0 to 1.0.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T extends Tup2WF> T lerp(Tup2RF v1, float v2x, float v2y, float alpha, @ExtractionParam T res)
//	{
//		return lerp(v1.v0(), v1.v1(), v2x, v2y, alpha, res);
//	}
//	
//	/**
//	 * Performs a fast linear interpolation between the given tuple {@code (v1[0], v1[1])} and the
//	 * given tuple {@code (v2)} and saves the result in the given extraction parameter object. This
//	 * sacrifices for reduced calculations the precision and the applicability. The interpolation
//	 * happens over the interpolator value alpha in the range of 0.0 to 1.0.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v1[0], v1[1]) + ( v2 - (v1[0], v1[1]) ) * alpha}
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param v1
//	 *     The first vector as an array with at least two entries.
//	 * @param v2
//	 *     The second vector.
//	 * @param alpha
//	 *     The interpolator in range of 0.0 to 1.0.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T extends Tup2WF> T lerp(@MinLength(2) float[] v1, Tup2RF v2, float alpha, @ExtractionParam T res)
//	{
//		return lerp(v1[0], v1[1], v2.v0(), v2.v1(), alpha, res);
//	}
//	
//	/**
//	 * Performs a fast linear interpolation between the given tuple {@code (v1[0], v1[1])} and the
//	 * given tuple {@code (v2[0], v2[1])} and saves the result in the given extraction parameter
//	 * object. This sacrifices for reduced calculations the precision and the applicability. The
//	 * interpolation happens over the interpolator value alpha in the range of 0.0 to 1.0.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v1[0], v1[1]) + ( (v2[0], v2[1]) - (v1[0], v1[1]) ) * alpha}
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param v1
//	 *     The first vector as an array with at least two entries.
//	 * @param v2
//	 *     The second vector as an array with at least two entries.
//	 * @param alpha
//	 *     The interpolator in range of 0.0 to 1.0.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T extends Tup2WF> T lerp(@MinLength(2) float[] v1, @MinLength(2) float[] v2, float alpha, @ExtractionParam T res)
//	{
//		return lerp(v1[0], v1[1], v2[0], v2[1], alpha, res);
//	}
//	
//	/**
//	 * Performs a fast linear interpolation between the given tuple {@code (v1[0], v1[1])} and the
//	 * given tuple {@code (v2x, v2y)} and saves the result in the given extraction parameter object.
//	 * This sacrifices for reduced calculations the precision and the applicability. The
//	 * interpolation happens over the interpolator value alpha in the range of 0.0 to 1.0.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v1[0], v1[1]) + ( (v2x, v2y) - (v1[0], v1[1]) ) * alpha}
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param v1
//	 *     The first vector as an array with at least two entries.
//	 * @param v2x
//	 *     The value of the x component of the second vector.
//	 * @param v2y
//	 *     The value of the y component of the second vector.
//	 * @param alpha
//	 *     The interpolator in range of 0.0 to 1.0.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T extends Tup2WF> T lerp(@MinLength(2) float[] v1, float v2x, float v2y, float alpha, @ExtractionParam T res)
//	{
//		return lerp(v1[0], v1[1], v2x, v2y, alpha, res);
//	}
//	
//	/**
//	 * Performs a fast linear interpolation between the given tuple {@code (v1x, v1y)} and the given
//	 * tuple {@code (v2)} and saves the result in the given extraction parameter object. This
//	 * sacrifices for reduced calculations the precision and the applicability. The interpolation
//	 * happens over the interpolator value alpha in the range of 0.0 to 1.0.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v1x, v1y) + ( v2 - (v1x, v1y) ) * alpha}
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param v1x
//	 *     The value of the x component of the first vector.
//	 * @param v1y
//	 *     The value of the y component of the first vector.
//	 * @param v2
//	 *     The second vector.
//	 * @param alpha
//	 *     The interpolator in range of 0.0 to 1.0.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T extends Tup2WF> T lerp(float v1x, float v1y, Tup2RF v2, float alpha, @ExtractionParam T res)
//	{
//		return lerp(v1x, v1y, v2.v0(), v2.v1(), alpha, res);
//	}
//	
//	/**
//	 * Performs a fast linear interpolation between the given tuple {@code (v1x, v1y)} and the given
//	 * tuple {@code (v2[0], v2[1])} and saves the result in the given extraction parameter object.
//	 * This sacrifices for reduced calculations the precision and the applicability. The
//	 * interpolation happens over the interpolator value alpha in the range of 0.0 to 1.0.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v1x, v1y) + ( (v2[0], v2[1]) - (v1x, v1y) ) * alpha}
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param v1x
//	 *     The value of the x component of the first vector.
//	 * @param v1y
//	 *     The value of the y component of the first vector.
//	 * @param v2
//	 *     The second vector as an array with at least two entries.
//	 * @param alpha
//	 *     The interpolator in range of 0.0 to 1.0.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T extends Tup2WF> T lerp(float v1x, float v1y, @MinLength(2) float[] v2, float alpha, @ExtractionParam T res)
//	{
//		return lerp(v1x, v1y, v2[0], v2[1], alpha, res);
//	}
//	
//	/**
//	 * Performs a fast linear interpolation between the given tuple {@code (v1x, v1y)} and the given
//	 * tuple {@code (v2x, v2y)} and saves the result in the given extraction parameter object. This
//	 * sacrifices for reduced calculations the precision and the applicability. The interpolation
//	 * happens over the interpolator value alpha in the range of 0.0 to 1.0.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v1x, v1y) + ( (v2x, v2y) - (v1x, v1y) ) * alpha}
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param v1x
//	 *     The value of the x component of the first vector.
//	 * @param v1y
//	 *     The value of the y component of the first vector.
//	 * @param v2x
//	 *     The value of the x component of the second vector.
//	 * @param v2y
//	 *     The value of the y component of the second vector.
//	 * @param alpha
//	 *     The interpolator in range of 0.0 to 1.0.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T extends Tup2WF> T lerp(float v1x, float v1y, float v2x, float v2y, float alpha, @ExtractionParam T res)
//	{
//		if (alpha == 0.0f)
//		{
//			res.set(v1x, v1y);
//			
//			return res;
//		}
//		
//		if (alpha == 1.0f)
//		{
//			res.set(v2x, v2y);
//			
//			return res;
//		}
//		
//		res.set(v1x + alpha * (v2x - v1x), v1y + alpha * (v2y - v1y));
//		
//		return res;
//	}
//	
//	/**
//	 * Performs a fast linear interpolation between the given tuple {@code (v1)} and the given tuple
//	 * {@code (v2)} and saves the result in the given extraction parameter object. This sacrifices
//	 * for reduced calculations the precision and the applicability. The interpolation happens over
//	 * the interpolator value alpha in the range of 0.0 to 1.0.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code v1 + ( v2 - v1 ) * alpha}
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param v1
//	 *     The first vector.
//	 * @param v2
//	 *     The second vector.
//	 * @param alpha
//	 *     The interpolator in range of 0.0 to 1.0.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T> T lerpFunc(Tup2RF v1, Tup2RF v2, float alpha, Function2F<T> func)
//	{
//		return lerpFunc(v1.v0(), v1.v1(), v2.v0(), v2.v1(), alpha, func);
//	}
//	
//	/**
//	 * Performs a fast linear interpolation between the given tuple {@code (v1)} and the given tuple
//	 * {@code (v2[0], v2[1])} and saves the result in the given extraction parameter object. This
//	 * sacrifices for reduced calculations the precision and the applicability. The interpolation
//	 * happens over the interpolator value alpha in the range of 0.0 to 1.0.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code v1 + ( (v2[0], v2[1]) - v1 ) * alpha}
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param v1
//	 *     The first vector.
//	 * @param v2
//	 *     The second vector as an array with at least two entries.
//	 * @param alpha
//	 *     The interpolator in range of 0.0 to 1.0.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T> T lerpFunc(Tup2RF v1, float[] v2, float alpha, Function2F<T> func)
//	{
//		return lerpFunc(v1.v0(), v1.v1(), v2[0], v2[1], alpha, func);
//	}
//	
//	/**
//	 * Performs a fast linear interpolation between the given tuple {@code (v1)} and the given tuple
//	 * {@code (v2x, v2y)} and saves the result in the given extraction parameter object. This
//	 * sacrifices for reduced calculations the precision and the applicability. The interpolation
//	 * happens over the interpolator value alpha in the range of 0.0 to 1.0.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code v1 + ( (v2x, v2y) - v1 ) * alpha}
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param v1
//	 *     The first vector.
//	 * @param v2x
//	 *     The value of the x component of the second vector.
//	 * @param v2y
//	 *     The value of the y component of the second vector.
//	 * @param alpha
//	 *     The interpolator in range of 0.0 to 1.0.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T> T lerpFunc(Tup2RF v1, float v2x, float v2y, float alpha, Function2F<T> func)
//	{
//		return lerpFunc(v1.v0(), v1.v1(), v2x, v2y, alpha, func);
//	}
//	
//	/**
//	 * Performs a fast linear interpolation between the given tuple {@code (v1[0], v1[1])} and the
//	 * given tuple {@code (v2)} and saves the result in the given extraction parameter object. This
//	 * sacrifices for reduced calculations the precision and the applicability. The interpolation
//	 * happens over the interpolator value alpha in the range of 0.0 to 1.0.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v1[0], v1[1]) + ( v2 - (v1[0], v1[1]) ) * alpha}
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param v1
//	 *     The first vector as an array with at least two entries.
//	 * @param v2
//	 *     The second vector.
//	 * @param alpha
//	 *     The interpolator in range of 0.0 to 1.0.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T> T lerpFunc(@MinLength(2) float[] v1, Tup2RF v2, float alpha, Function2F<T> func)
//	{
//		return lerpFunc(v1[0], v1[1], v2.v0(), v2.v1(), alpha, func);
//	}
//	
//	/**
//	 * Performs a fast linear interpolation between the given tuple {@code (v1[0], v1[1])} and the
//	 * given tuple {@code (v2[0], v2[1])} and saves the result in the given extraction parameter
//	 * object. This sacrifices for reduced calculations the precision and the applicability. The
//	 * interpolation happens over the interpolator value alpha in the range of 0.0 to 1.0.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v1[0], v1[1]) + ( (v2[0], v2[1]) - (v1[0], v1[1]) ) * alpha}
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param v1
//	 *     The first vector as an array with at least two entries.
//	 * @param v2
//	 *     The second vector as an array with at least two entries.
//	 * @param alpha
//	 *     The interpolator in range of 0.0 to 1.0.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T> T lerpFunc(@MinLength(2) float[] v1, @MinLength(2) float[] v2, float alpha, Function2F<T> func)
//	{
//		return lerpFunc(v1[0], v1[1], v2[0], v2[1], alpha, func);
//	}
//	
//	/**
//	 * Performs a fast linear interpolation between the given tuple {@code (v1[0], v1[1])} and the
//	 * given tuple {@code (v2x, v2y)} and saves the result in the given extraction parameter object.
//	 * This sacrifices for reduced calculations the precision and the applicability. The
//	 * interpolation happens over the interpolator value alpha in the range of 0.0 to 1.0.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v1[0], v1[1]) + ( (v2x, v2y) - (v1[0], v1[1]) ) * alpha}
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param v1
//	 *     The first vector as an array with at least two entries.
//	 * @param v2x
//	 *     The value of the x component of the second vector.
//	 * @param v2y
//	 *     The value of the y component of the second vector.
//	 * @param alpha
//	 *     The interpolator in range of 0.0 to 1.0.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T> T lerpFunc(@MinLength(2) float[] v1, float v2x, float v2y, float alpha, Function2F<T> func)
//	{
//		return lerpFunc(v1[0], v1[1], v2x, v2y, alpha, func);
//	}
//	
//	/**
//	 * Performs a fast linear interpolation between the given tuple {@code (v1x, v1y)} and the given
//	 * tuple {@code (v2)} and saves the result in the given extraction parameter object. This
//	 * sacrifices for reduced calculations the precision and the applicability. The interpolation
//	 * happens over the interpolator value alpha in the range of 0.0 to 1.0.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v1x, v1y) + ( v2 - (v1x, v1y) ) * alpha}
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param v1x
//	 *     The value of the x component of the first vector.
//	 * @param v1y
//	 *     The value of the y component of the first vector.
//	 * @param v2
//	 *     The second vector.
//	 * @param alpha
//	 *     The interpolator in range of 0.0 to 1.0.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T> T lerpFunc(float v1x, float v1y, Tup2RF v2, float alpha, Function2F<T> func)
//	{
//		return lerpFunc(v1x, v1y, v2.v0(), v2.v1(), alpha, func);
//	}
//	
//	/**
//	 * Performs a fast linear interpolation between the given tuple {@code (v1x, v1y)} and the given
//	 * tuple {@code (v2[0], v2[1])} and saves the result in the given extraction parameter object.
//	 * This sacrifices for reduced calculations the precision and the applicability. The
//	 * interpolation happens over the interpolator value alpha in the range of 0.0 to 1.0.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v1x, v1y) + ( (v2[0], v2[1]) - (v1x, v1y) ) * alpha}
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param v1x
//	 *     The value of the x component of the first vector.
//	 * @param v1y
//	 *     The value of the y component of the first vector.
//	 * @param v2
//	 *     The second vector as an array with at least two entries.
//	 * @param alpha
//	 *     The interpolator in range of 0.0 to 1.0.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T> T lerpFunc(float v1x, float v1y, @MinLength(2) float[] v2, float alpha, Function2F<T> func)
//	{
//		return lerpFunc(v1x, v1y, v2[0], v2[1], alpha, func);
//	}
//	
//	/**
//	 * Performs a fast linear interpolation between the given tuple {@code (v1x, v1y)} and the given
//	 * tuple {@code (v2x, v2y)} and saves the result in the given extraction parameter object. This
//	 * sacrifices for reduced calculations the precision and the applicability. The interpolation
//	 * happens over the interpolator value alpha in the range of 0.0 to 1.0.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v1x, v1y) + ( (v2x, v2y) - (v1x, v1y) ) * alpha}
//	 * 
//	 * @param <T>
//	 *     The type of the extraction parameter object.
//	 * 
//	 * @param v1x
//	 *     The value of the x component of the first vector.
//	 * @param v1y
//	 *     The value of the y component of the first vector.
//	 * @param v2x
//	 *     The value of the x component of the second vector.
//	 * @param v2y
//	 *     The value of the y component of the second vector.
//	 * @param alpha
//	 *     The interpolator in range of 0.0 to 1.0.
//	 * @param res
//	 *     The extraction parameter object for the result.
//	 * 
//	 * @return The extraction parameter object with the result.
//	 */
//	public static <T> T lerpFunc(float v1x, float v1y, float v2x, float v2y, float alpha, Function2F<T> func)
//	{
//		if (alpha == 0.0f)
//		{
//			return func.apply2F(v1x, v1y);
//		}
//		
//		if (alpha == 1.0f)
//		{
//			return func.apply2F(v2x, v2y);
//		}
//		
//		return func.apply2F(v1x + alpha * (v2x - v1x), v1y + alpha * (v2y - v1y));
//	}
//}
