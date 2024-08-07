package org.barghos.math.vector;

import org.barghos.annotation.ExtractionParam;
import org.barghos.annotation.FloatMinValue;
import org.barghos.annotation.MinLength;
import org.barghos.math.matrix.SimpleMat4fR;
import org.barghos.math.quaternion.QuatfUtils;
import org.barghos.util.collection.FloatIndexValuePair;
import org.barghos.util.math.BarghosMath;
import org.barghos.util.math.FloatRoundMethod;
import org.barghos.util.tuple.floats.Tup3RF;
import org.barghos.util.tuple.floats.Tup3WF;
import org.barghos.util.tuple.floats.Tup4RF;

/**
 * This class provides utilities for working with 3-dimensional float vectors.
 */
public class VecUtils3F
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
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] add(Tup3RF v1, Tup3RF v2, @ExtractionParam @MinLength(3) float[] res)
	{
		return add(v1.v0(), v1.v1(), v1.v2(), v2.v0(), v2.v1(), v2.v2(), res);
	}
	
	/**
	 * Adds the second vector {@code (v2[0], v2[1], v2[2])} to the first vector {@code (v1)} and
	 * saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 + (v2[0], v2[1], v2[2])}
	 * 
	 * @param v1
	 *     The first vector.
	 * @param v2
	 *     The second vector as an array with at least three entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] add(Tup3RF v1, @MinLength(3) float[] v2, @ExtractionParam @MinLength(3) float[] res)
	{
		return add(v1.v0(), v1.v1(), v1.v2(), v2[0], v2[1], v2[2], res);
	}
	
	/**
	 * Adds the second vector {@code (v2x, v2y, v2z)} to the first vector {@code (v1)} and saves the
	 * result in the given extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 + (v2x, v2y, v2z)}
	 * 
	 * @param v1
	 *     The first vector.
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * @param v2z
	 *     The value of the z component of the second vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] add(Tup3RF v1, float v2x, float v2y, float v2z, @ExtractionParam @MinLength(3) float[] res)
	{
		return add(v1.v0(), v1.v1(), v1.v2(), v2x, v2y, v2z, res);
	}
	
	/**
	 * Adds the second vector {@code (v2)} to the first vector {@code (v1[0], v1[1], v1[2])} and
	 * saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1], v1[2]) + v2}
	 * 
	 * @param v1
	 *     The first vector as an array with at least three entries.
	 * @param v2
	 *     The second vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] add(@MinLength(3) float[] v1, Tup3RF v2, @ExtractionParam @MinLength(3) float[] res)
	{
		return add(v1[0], v1[1], v1[2], v2.v0(), v2.v1(), v2.v2(), res);
	}
	
	/**
	 * Adds the second vector {@code (v2[0], v2[1], v2[2])} to the first vector
	 * {@code (v1[0], v1[1], v1[2])} and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1], v1[2]) + (v2[0], v2[1], v2[2])}
	 * 
	 * @param v1
	 *     The first vector as an array with at least three entries.
	 * @param v2
	 *     The second vector as an array with at least three entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] add(@MinLength(3) float[] v1, @MinLength(3) float[] v2, @ExtractionParam @MinLength(3) float[] res)
	{
		return add(v1[0], v1[1], v1[2], v2[0], v2[1], v2[2], res);
	}
	
	/**
	 * Adds the second vector {@code (v2x, v2y, v2z)} to the first vector
	 * {@code (v1[0], v1[1], v1[2])} and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1], v1[2]) + (v2x, v2y, v2z)}
	 * 
	 * @param v1
	 *     The first vector as an array with at least three entries.
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * @param v2z
	 *     The value of the z component of the second vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] add(@MinLength(3) float[] v1, float v2x, float v2y, float v2z, @ExtractionParam @MinLength(3) float[] res)
	{
		return add(v1[0], v1[1], v1[2], v2x, v2y, v2z, res);
	}
	
	/**
	 * Adds the second vector {@code (v2)} to the first vector {@code (v1x, v1y, v1z)} and saves the
	 * result in the given extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y, v1z) + v2}
	 * 
	 * @param v1x
	 *     The value of the x component of the first vector.
	 * @param v1y
	 *     The value of the y component of the first vector.
	 * @param v1z
	 *     The value of the z component of the first vector.
	 * @param v2
	 *     The second vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] add(float v1x, float v1y, float v1z, Tup3RF v2, @ExtractionParam @MinLength(3) float[] res)
	{
		return add(v1x, v1y, v1z, v2.v0(), v2.v1(), v2.v2(), res);
	}
	
	/**
	 * Adds the second vector {@code (v2[0], v2[1], v2[2])} to the first vector
	 * {@code (v1x, v1y, v1z)} and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y, v1z) + (v2[0], v2[1], v2[2])}
	 * 
	 * @param v1x
	 *     The value of the x component of the first vector.
	 * @param v1y
	 *     The value of the y component of the first vector.
	 * @param v1z
	 *     The value of the z component of the first vector.
	 * @param v2
	 *     The second vector as an array with at least three entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] add(float v1x, float v1y, float v1z, @MinLength(3) float[] v2, @ExtractionParam @MinLength(3) float[] res)
	{
		return add(v1x, v1y, v1z, v2[0], v2[1], v2[2], res);
	}
	
	/**
	 * Adds the second vector {@code (v2x, v2y, v2z)} to the first vector {@code (v1x, v1y, v1z)}
	 * and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y, v1z) + (v2x, v2y, v2z)}
	 * 
	 * @param v1x
	 *     The value of the x component of the first vector.
	 * @param v1y
	 *     The value of the y component of the first vector.
	 * @param v1z
	 *     The value of the z component of the first vector.
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * @param v2z
	 *     The value of the z component of the second vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] add(float v1x, float v1y, float v1z, float v2x, float v2y, float v2z, @ExtractionParam @MinLength(3) float[] res)
	{
		res[0] = v1x + v2x;
		res[1] = v1y + v2y;
		res[2] = v1z + v2z;
		
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
	public static <T extends Tup3WF> T add(Tup3RF v1, Tup3RF v2, @ExtractionParam T res)
	{
		return add(v1.v0(), v1.v1(), v1.v2(), v2.v0(), v2.v1(), v2.v2(), res);
	}
	
	/**
	 * Adds the second vector {@code (v2[0], v2[1], v2[2])} to the first vector {@code (v1)} and
	 * saves the result in the given extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 + (v2[0], v2[1], v2[2])}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1
	 *     The first vector.
	 * @param v2
	 *     The second vector as an array with at least three entries.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T add(Tup3RF v1, @MinLength(3) float[] v2, @ExtractionParam T res)
	{
		return add(v1.v0(), v1.v1(), v1.v2(), v2[0], v2[1], v2[2], res);
	}
	
	/**
	 * Adds the second vector {@code (v2x, v2y, v2z)} to the first vector {@code (v1)} and saves the
	 * result in the given extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 + (v2x, v2y, v2z)}
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
	 * @param v2z
	 *     The value of the z component of the second vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T add(Tup3RF v1, float v2x, float v2y, float v2z, @ExtractionParam T res)
	{
		return add(v1.v0(), v1.v1(), v1.v2(), v2x, v2y, v2z, res);
	}
	
	/**
	 * Adds the second vector {@code (v2)} to the first vector {@code (v1[0], v1[1], v1[2])} and
	 * saves the result in the given extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1], v1[2]) + v2}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1
	 *     The first vector as an array with at least three entries.
	 * @param v2
	 *     The second vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T add(@MinLength(3) float[] v1, Tup3RF v2, @ExtractionParam T res)
	{
		return add(v1[0], v1[1], v1[2], v2.v0(), v2.v1(), v2.v2(), res);
	}
	
	/**
	 * Adds the second vector {@code (v2[0], v2[1], v2[2])} to the first vector
	 * {@code (v1[0], v1[1], v1[2])} and saves the result in the given extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1], v1[2]) + (v2[0], v2[1], v2[2])}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1
	 *     The first vector as an array with at least three entries.
	 * @param v2
	 *     The second vector as an array with at least three entries.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T add(@MinLength(3) float[] v1, @MinLength(3) float[] v2, @ExtractionParam T res)
	{
		return add(v1[0], v1[1], v1[2], v2[0], v2[1], v2[2], res);
	}
	
	/**
	 * Adds the second vector {@code (v2x, v2y, v2z)} to the first vector
	 * {@code (v1[0], v1[1], v1[2])} and saves the result in the given extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1], v1[2]) + (v2x, v2y, v2z)}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1
	 *     The first vector as an array with at least three entries.
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * @param v2z
	 *     The value of the z component of the second vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T add(@MinLength(3) float[] v1, float v2x, float v2y, float v2z, @ExtractionParam T res)
	{
		return add(v1[0], v1[1], v1[2], v2x, v2y, v2z, res);
	}
	
	/**
	 * Adds the second vector {@code (v2)} to the first vector {@code (v1x, v1y, v1z)} and saves the
	 * result in the given extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y, v1z) + v2}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1x
	 *     The value of the x component of the first vector.
	 * @param v1y
	 *     The value of the y component of the first vector.
	 * @param v1z
	 *     The value of the z component of the first vector.
	 * @param v2
	 *     The second vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T add(float v1x, float v1y, float v1z, Tup3RF v2, @ExtractionParam T res)
	{
		return add(v1x, v1y, v1z, v2.v0(), v2.v1(), v2.v2(), res);
	}
	
	/**
	 * Adds the second vector {@code (v2[0], v2[1], v2[2])} to the first vector
	 * {@code (v1x, v1y, v1z)} and saves the result in the given extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y, v1z) + (v2[0], v2[1], v2[2])}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1x
	 *     The value of the x component of the first vector.
	 * @param v1y
	 *     The value of the y component of the first vector.
	 * @param v1z
	 *     The value of the z component of the first vector.
	 * @param v2
	 *     The second vector as an array with at least three entries.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T add(float v1x, float v1y, float v1z, @MinLength(3) float[] v2, @ExtractionParam T res)
	{
		return add(v1x, v1y, v1z, v2[0], v2[1], v2[2], res);
	}
	
	/**
	 * Adds the second vector {@code (v2x, v2y, v2z)} to the first vector {@code (v1x, v1y, v1z)}
	 * and saves the result in the given extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y, v1z) + (v2x, v2y, v2z)}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1x
	 *     The value of the x component of the first vector.
	 * @param v1y
	 *     The value of the y component of the first vector.
	 * @param v1z
	 *     The value of the z component of the first vector.
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * @param v2z
	 *     The value of the z component of the second vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T add(float v1x, float v1y, float v1z, float v2x, float v2y, float v2z, @ExtractionParam T res)
	{
		res.set(v1x + v2x, v1y + v2y, v1z + v2z);
		
		return res;
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
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] sub(Tup3RF v1, Tup3RF v2, @ExtractionParam @MinLength(3) float[] res)
	{
		return sub(v1.v0(), v1.v1(), v1.v2(), v2.v0(), v2.v1(), v2.v2(), res);
	}
	
	/**
	 * Subtracts the second vector {@code (v2[0], v2[1], v2[2])} from the first vector {@code (v1)}
	 * and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 - (v2x, v2y, v2z)}
	 * 
	 * @param v1
	 *     The first vector.
	 * @param v2
	 *     The second vector as an array with at least three entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] sub(Tup3RF v1, @MinLength(3) float[] v2, @ExtractionParam @MinLength(3) float[] res)
	{
		return sub(v1.v0(), v1.v1(), v1.v2(), v2[0], v2[1], v2[2], res);
	}
	
	/**
	 * Subtracts the second vector {@code (v2x, v2y, v2z)} from the first vector {@code (v1)} and
	 * saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 - (v2x, v2y, v2z)}
	 * 
	 * @param v1
	 *     The first vector.
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * @param v2z
	 *     The value of the z component of the second vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] sub(Tup3RF v1, float v2x, float v2y, float v2z, @ExtractionParam @MinLength(3) float[] res)
	{
		return sub(v1.v0(), v1.v1(), v1.v2(), v2x, v2y, v2z, res);
	}
	
	/**
	 * Subtracts the second vector {@code (v2)} from the first vector {@code (v1[0], v1[1], v1[2])}
	 * and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1], v1[2]) - v2}
	 * 
	 * @param v1
	 *     The first vector as an array with at least three entries.
	 * @param v2
	 *     The second vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] sub(@MinLength(3) float[] v1, Tup3RF v2, @ExtractionParam @MinLength(3) float[] res)
	{
		return sub(v1[0], v1[1], v1[2], v2.v0(), v2.v1(), v2.v2(), res);
	}
	
	/**
	 * Subtracts the second vector {@code (v2[0], v2[1], v2[2])} from the first vector
	 * {@code (v1[0], v1[1], v1[2])} and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1], v1[2]) - (v2[0], v2[1], v2[2])}
	 * 
	 * @param v1
	 *     The first vector as an array with at least three entries.
	 * @param v2
	 *     The second vector as an array with at least three entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] sub(@MinLength(3) float[] v1, @MinLength(3) float[] v2, @ExtractionParam @MinLength(3) float[] res)
	{
		return sub(v1[0], v1[1], v1[2], v2[0], v2[1], v2[2], res);
	}
	
	/**
	 * Subtracts the second vector {@code (v2x, v2y, v2z)} from the first vector
	 * {@code (v1[0], v1[1], v1[2])} and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1], v1[2]) - (v2x, v2y, v2z)}
	 * 
	 * @param v1
	 *     The first vector as an array with at least three entries.
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * @param v2z
	 *     The value of the z component of the second vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] sub(@MinLength(3) float[] v1, float v2x, float v2y, float v2z, @ExtractionParam @MinLength(3) float[] res)
	{
		return sub(v1[0], v1[1], v1[2], v2x, v2y, v2z, res);
	}
	
	/**
	 * Subtracts the second vector {@code (v2)} from the first vector {@code (v1x, v1y, v1z)} and
	 * saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y, v1z) - v2}
	 * 
	 * @param v1x
	 *     The value of the x component of the first vector.
	 * @param v1y
	 *     The value of the y component of the first vector.
	 * @param v1z
	 *     The value of the z component of the first vector.
	 * @param v2
	 *     The second vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] sub(float v1x, float v1y, float v1z, Tup3RF v2, @ExtractionParam @MinLength(3) float[] res)
	{
		return sub(v1x, v1y, v1z, v2.v0(), v2.v1(), v2.v2(), res);
	}
	
	/**
	 * Subtracts the second vector {@code (v2[0], v2[1], v2[2])} from the first vector
	 * {@code (v1x, v1y, v1z)} and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y,, v1z) - (v2[0], v2[1], v2[2])}
	 * 
	 * @param v1x
	 *     The value of the x component of the first vector.
	 * @param v1y
	 *     The value of the y component of the first vector.
	 * @param v1z
	 *     The value of the z component of the first vector.
	 * @param v2
	 *     The second vector as an array with at least three entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] sub(float v1x, float v1y, float v1z, @MinLength(3) float[] v2, @ExtractionParam @MinLength(3) float[] res)
	{
		return sub(v1x, v1y, v1z, v2[0], v2[1], v2[2], res);
	}
	
	/**
	 * Subtracts the second vector {@code (v2x, v2y, v2z)} from the first vector
	 * {@code (v1x, v1y, v1z)} and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y, v1z) - (v2x, v2y, v2z)}
	 * 
	 * @param v1x
	 *     The value of the x component of the first vector.
	 * @param v1y
	 *     The value of the y component of the first vector.
	 * @param v1z
	 *     The value of the z component of the first vector.
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * @param v2z
	 *     The value of the z component of the second vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] sub(float v1x, float v1y, float v1z, float v2x, float v2y, float v2z, @ExtractionParam @MinLength(3) float[] res)
	{
		res[0] = v1x - v2x;
		res[1] = v1y - v2y;
		res[2] = v1z - v2z;
		
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
	public static <T extends Tup3WF> T sub(Tup3RF v1, Tup3RF v2, @ExtractionParam T res)
	{
		return sub(v1.v0(), v1.v1(), v1.v2(), v2.v0(), v2.v1(), v2.v2(), res);
	}
	
	/**
	 * Subtracts the second vector [@code (v2[0], v2[1], v2[2])} from the first vector {@code (v1)}
	 * and saves the result in the given extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 - (v2[0], v2[1], v2[2])}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1
	 *     The first vector.
	 * @param v2
	 *     The second vector as an array with at least three entries.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T sub(Tup3RF v1, @MinLength(3) float[] v2, @ExtractionParam T res)
	{
		return sub(v1.v0(), v1.v1(), v1.v2(), v2[0], v2[1], v2[2], res);
	}
	
	/**
	 * Subtracts the second vector [@code (v2x, v2y, v2z)} from the first vector {@code (v1)} and
	 * saves the result in the given extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 - (v2x, v2y, v2z)}
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
	 * @param v2z
	 *     The value of the z component of the second vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T sub(Tup3RF v1, float v2x, float v2y, float v2z, @ExtractionParam T res)
	{
		return sub(v1.v0(), v1.v1(), v1.v2(), v2x, v2y, v2z, res);
	}
	
	/**
	 * Subtracts the second vector [@code (v2)} from the first vector {@code (v1[0], v1[1], v1[2])}
	 * and saves the result in the given extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1], v1[2]) - v2}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1
	 *     The first vector as an array with at least three entries.
	 * @param v2
	 *     The second vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T sub(@MinLength(3) float[] v1, Tup3RF v2, @ExtractionParam T res)
	{
		return sub(v1[0], v1[1], v1[2], v2.v0(), v2.v1(), v2.v2(), res);
	}
	
	/**
	 * Subtracts the second vector [@code (v2[0], v2[1], v2[2])} from the first vector
	 * {@code (v1[0], v1[1], v1[2])} and saves the result in the given extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1], v1[2]) - (v2[0], v2[1], v2[2])}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1
	 *     The first vector as an array with at least three entries.
	 * @param v2
	 *     The second vector as an array with at least three entries.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T sub(@MinLength(3) float[] v1, @MinLength(3) float[] v2, @ExtractionParam T res)
	{
		return sub(v1[0], v1[1], v1[2], v2[0], v2[1], v2[2], res);
	}
	
	/**
	 * Subtracts the second vector [@code (v2x, v2y, v2z)} from the first vector
	 * {@code (v1[0], v1[1], v1[2])} and saves the result in the given extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1], v2[2]) - (v2x, v2y, v2z)}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1
	 *     The first vector as an array with at least three entries.
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * @param v2z
	 *     The value of the z component of the second vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T sub(@MinLength(3) float[] v1, float v2x, float v2y, float v2z, @ExtractionParam T res)
	{
		return sub(v1[0], v1[1], v1[2], v2x, v2y, v2z, res);
	}
	
	/**
	 * Subtracts the second vector [@code (v2)} from the first vector {@code (v1x, v1y, v1z)} and
	 * saves the result in the given extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y, v1z) - v2}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1x
	 *     The value of the x component of the first vector.
	 * @param v1y
	 *     The value of the y component of the first vector.
	 * @param v1z
	 *     The value of the z component of the first vector.
	 * @param v2
	 *     The second vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T sub(float v1x, float v1y, float v1z, Tup3RF v2, @ExtractionParam T res)
	{
		return sub(v1x, v1y, v1z, v2.v0(), v2.v1(), v2.v2(), res);
	}
	
	/**
	 * Subtracts the second vector [@code (v2[0], v2[1], v2[2])} from the first vector
	 * {@code (v1x, v1y, v1z)} and saves the result in the given extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y, v1z) - (v2[0], v2[1], v2[2])}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1x
	 *     The value of the x component of the first vector.
	 * @param v1y
	 *     The value of the y component of the first vector.
	 * @param v1z
	 *     The value of the z component of the first vector.
	 * @param v2
	 *     The second vector as an array with at least three entries.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T sub(float v1x, float v1y, float v1z, @MinLength(3) float[] v2, @ExtractionParam T res)
	{
		return sub(v1x, v1y, v1z, v2[0], v2[1], v2[2], res);
	}
	
	/**
	 * Subtracts the second vector [@code (v2x, v2y, v2z)} from the first vector
	 * {@code (v1x, v1y, v1z)} and saves the result in the given extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y, v1z) - (v2x, v2y, v2z)}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1x
	 *     The value of the x component of the first vector.
	 * @param v1y
	 *     The value of the y component of the first vector.
	 * @param v1z
	 *     The value of the z component of the first vector.
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * @param v2z
	 *     The value of the z component of the second vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T sub(float v1x, float v1y, float v1z, float v2x, float v2y, float v2z, @ExtractionParam T res)
	{
		res.set(v1x - v2x, v1y - v2y, v1z - v2z);
		
		return res;
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
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] revSub(Tup3RF v1, Tup3RF v2, @ExtractionParam @MinLength(2) float[] res)
	{
		return revSub(v1.v0(), v1.v1(), v1.v2(), v2.v0(), v2.v1(), v2.v2(), res);
	}
	
	/**
	 * Subtracts the first vector {@code (v1)} from the second vector {@code (v2[0], v2[1], v2[2])}
	 * and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2[0], v2[1], v2[2]) - v1}
	 * 
	 * @param v1
	 *     The first vector.
	 * @param v2
	 *     The second vector as an array with at least three entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] revSub(Tup3RF v1, @MinLength(3) float[] v2, @ExtractionParam @MinLength(3) float[] res)
	{
		return revSub(v1.v0(), v1.v1(), v1.v2(), v2[0], v2[1], v2[2], res);
	}
	
	/**
	 * Subtracts the first vector {@code (v1)} from the second vector {@code (v2x, v2y, v2z)} and
	 * saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2x, v2y, v2z) - v1}
	 * 
	 * @param v1
	 *     The first vector.
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * @param v2z
	 *     The value of the z component of the second vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] revSub(Tup3RF v1, float v2x, float v2y, float v2z, @ExtractionParam @MinLength(3) float[] res)
	{
		return revSub(v1.v0(), v1.v1(), v1.v2(), v2x, v2y, v2z, res);
	}
	
	/**
	 * Subtracts the first vector {@code (v1[0], v1[1], v1[2])} from the second vector {@code (v2)}
	 * and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v2 - (v1[0], v1[1], v1[2])}
	 * 
	 * @param v1
	 *     The first vector as an array with at least three entries.
	 * @param v2
	 *     second vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] revSub(@MinLength(3) float[] v1, Tup3RF v2, @ExtractionParam @MinLength(3) float[] res)
	{
		return revSub(v1[0], v1[1], v1[2], v2.v0(), v2.v1(), v2.v2(), res);
	}
	
	/**
	 * Subtracts the first vector {@code (v1[0], v1[1], v1[2])} from the second vector
	 * {@code (v2[0], v2[1], v2[2])} and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2[0], v2[1], v2[2]) - (v1[0], v1[1], v1[2])}
	 * 
	 * @param v1
	 *     The first vector as an array with at least thre entries.
	 * @param v2
	 *     second vector as an array with at least three entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] revSub(@MinLength(3) float[] v1, @MinLength(3) float[] v2, @ExtractionParam @MinLength(3) float[] res)
	{
		return revSub(v1[0], v1[1], v1[2], v2[0], v2[1], v2[2], res);
	}
	
	/**
	 * Subtracts the first vector {@code (v1[0], v1[1], v1[2])} from the second vector
	 * {@code (v2x, v2y, v2z)} and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2x, v2y, v2z) - (v1[0], v1[1], v1[2])}
	 * 
	 * @param v1
	 *     The first vector as an array with at least three entries.
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * @param v2z
	 *     The value of the z component of the second vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] revSub(@MinLength(3) float[] v1, float v2x, float v2y, float v2z, @ExtractionParam @MinLength(3) float[] res)
	{
		return revSub(v1[0], v1[1], v1[2], v2x, v2y, v2z, res);
	}
	
	/**
	 * Subtracts the first vector {@code (v1x, v1y, v1z)} from the second vector {@code (v2)} and
	 * saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v2 - (v1x, v1y)}
	 * 
	 * @param v1x
	 *     The value of the x component of the first vector.
	 * @param v1y
	 *     The value of the y component of the first vector.
	 * @param v1z
	 *     The value of the z component of the first vector.
	 * @param v2
	 *     The second vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] revSub(float v1x, float v1y, float v1z, Tup3RF v2, @ExtractionParam @MinLength(3) float[] res)
	{
		return revSub(v1x, v1y, v1z, v2.v0(), v2.v1(), v2.v2(), res);
	}
	
	/**
	 * Subtracts the first vector {@code (v1x, v1y, v1z)} from the second vector
	 * {@code (v2[0], v2[1], v2[2])} and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2[0], v2[1], v2[2]) - (v1x, v1y, v1z)}
	 * 
	 * @param v1x
	 *     The value of the x component of the first vector.
	 * @param v1y
	 *     The value of the y component of the first vector.
	 * @param v1z
	 *     The value of the z component of the first vector.
	 * @param v2
	 *     The second vector as an array with at least three entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] revSub(float v1x, float v1y, float v1z, @MinLength(3) float[] v2, @ExtractionParam @MinLength(3) float[] res)
	{
		return revSub(v1x, v1y, v1z, v2[0], v2[1], v2[2], res);
	}
	
	/**
	 * Subtracts the first vector {@code (v1x, v1y, v1z)} from the second vector
	 * {@code (v2x, v2y, v2z)} and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2x, v2y, v2z) - (v1x, v1y, v1z)}
	 * 
	 * @param v1x
	 *     The value of the x component of the first vector.
	 * @param v1y
	 *     The value of the y component of the first vector.
	 * @param v1z
	 *     The value of the z component of the first vector.
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * @param v2z
	 *     The value of the z component of the second vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] revSub(float v1x, float v1y, float v1z, float v2x, float v2y, float v2z, @ExtractionParam @MinLength(3) float[] res)
	{
		res[0] = v2x - v1x;
		res[1] = v2y - v1y;
		res[2] = v2z - v1z;
		
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
	public static <T extends Tup3WF> T revSub(Tup3RF v1, Tup3RF v2, @ExtractionParam T res)
	{
		return revSub(v1.v0(), v1.v1(), v1.v2(), v2.v0(), v2.v1(), v2.v2(), res);
	}
	
	/**
	 * Subtracts the first vector {@code (v1)} from the second vector {@code (v2[0], v2[1], v2[2])}
	 * and saves the result in the given extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2[0], v2[1], v2[2]) - v1}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1
	 *     The first vector.
	 * @param v2
	 *     The second vector as an array with at least three entries.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T revSub(Tup3RF v1, @MinLength(3) float[] v2, @ExtractionParam T res)
	{
		return revSub(v1.v0(), v1.v1(), v1.v2(), v2[0], v2[1], v2[2], res);
	}
	
	/**
	 * Subtracts the first vector {@code (v1)} from the second vector {@code (v2x, v2y, v2z)} and
	 * saves the result in the given extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2x, v2y, v2z) - v1}
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
	 * @param v2z
	 *     The value of the z component of the second vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T revSub(Tup3RF v1, float v2x, float v2y, float v2z, @ExtractionParam T res)
	{
		return revSub(v1.v0(), v1.v1(), v1.v2(), v2x, v2y, v2z, res);
	}
	
	/**
	 * Subtracts the first vector {@code (v1[0], v1[1], v1[2])} from the second vector {@code (v2)}
	 * and saves the result in the given extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v2 - (v1[0], v1[1], v1[2])}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1
	 *     The first vector as an array with at least three entries.
	 * @param v2
	 *     The second vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T revSub(@MinLength(3) float[] v1, Tup3RF v2, @ExtractionParam T res)
	{
		return revSub(v1[0], v1[1], v1[2], v2.v0(), v2.v1(), v2.v2(), res);
	}
	
	/**
	 * Subtracts the first vector {@code (v1[0], v1[1], v1[2])} from the second vector
	 * {@code (v2[0], v2[1], v2[2])} and saves the result in the given extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2[0], v2[1], v2[2]) - (v1[0], v1[1], v1[1])}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1
	 *     The first vector as an array with at least three entries.
	 * @param v2
	 *     The second vector as an array with at least three entries.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T revSub(@MinLength(3) float[] v1, @MinLength(3) float[] v2, @ExtractionParam T res)
	{
		return revSub(v1[0], v1[1], v1[2], v2[0], v2[1], v2[2], res);
	}
	
	/**
	 * Subtracts the first vector {@code (v1[0], v1[1], v1[2])} from the second vector
	 * {@code (v2x, v2y, v2z)} and saves the result in the given extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2x, v2y, v2z) - (v1[0], v1[1], v1[2])}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1
	 *     The first vector as an array with at least three entries.
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * @param v2z
	 *     The value of the z component of the second vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T revSub(@MinLength(3) float[] v1, float v2x, float v2y, float v2z, @ExtractionParam T res)
	{
		return revSub(v1[0], v1[1], v1[2], v2x, v2y, v2z, res);
	}
	
	/**
	 * Subtracts the first vector {@code (v1x, v1y, v1z)} from the second vector {@code (v2)} and
	 * saves the result in the given extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v2 - (v1x, v1y, v1z)}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1x
	 *     The value of the x component of the first vector.
	 * @param v1y
	 *     The value of the y component of the first vector.
	 * @param v1z
	 *     The value of the z component of the first vector.
	 * @param v2
	 *     The second vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T revSub(float v1x, float v1y, float v1z, Tup3RF v2, @ExtractionParam T res)
	{
		return revSub(v1x, v1y, v1z, v2.v0(), v2.v1(), v2.v2(), res);
	}
	
	/**
	 * Subtracts the first vector {@code (v1x, v1y, v1z)} from the second vector
	 * {@code (v2[0], v2[1], v2[2])} and saves the result in the given extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2[0], v2[1], v2[2]) - (v1x, v1y, v1z)}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1x
	 *     The value of the x component of the first vector.
	 * @param v1y
	 *     The value of the y component of the first vector.
	 * @param v1z
	 *     The value of the z component of the first vector.
	 * @param v2
	 *     The second vector as an array with at least three entries.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T revSub(float v1x, float v1y, float v1z, @MinLength(3) float[] v2, @ExtractionParam T res)
	{
		return revSub(v1x, v1y, v1z, v2[0], v2[1], v2[2], res);
	}
	
	/**
	 * Subtracts the first vector {@code (v1x, v1y, v1z)} from the second vector
	 * {@code (v2x, v2y, v2z)} and saves the result in the given extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2x, v2y, v2z) - (v1x, v1y, v1z)}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1x
	 *     The value of the x component of the first vector.
	 * @param v1y
	 *     The value of the y component of the first vector.
	 * @param v1z
	 *     The value of the z component of the first vector.
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * @param v2z
	 *     The value of the z component of the second vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T revSub(float v1x, float v1y, float v1z, float v2x, float v2y, float v2z, @ExtractionParam T res)
	{
		res.set(v2x - v1x, v2y - v1y, v2z - v1z);
		
		return res;
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
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] mul(Tup3RF v1, Tup3RF v2, @ExtractionParam @MinLength(3) float[] res)
	{
		return mul(v1.v0(), v1.v1(), v1.v2(), v2.v0(), v2.v1(), v2.v2(), res);
	}
	
	/**
	 * Multiplies the first vector {@code (v1)} with the second vector {@code (v2[0], v2[1], v2[2])}
	 * and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1 * (v2[0], v2[1], v2[2])}
	 * 
	 * @param v1
	 *     The first vector.
	 * @param v2
	 *     The second vector as an array with at least three entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] mul(Tup3RF v1, @MinLength(3) float[] v2, @ExtractionParam @MinLength(3) float[] res)
	{
		return mul(v1.v0(), v1.v1(), v1.v2(), v2[0], v2[1], v2[2], res);
	}
	
	/**
	 * Multiplies the first vector {@code (v1)} with the second vector {@code (v2x, v2y, v2z)} and
	 * saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1 * (v2x, v2y, v2z)}
	 * 
	 * @param v1
	 *     The first vector.
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * @param v2z
	 *     The value of the z component of the second vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] mul(Tup3RF v1, float v2x, float v2y, float v2z, @ExtractionParam @MinLength(3) float[] res)
	{
		return mul(v1.v0(), v1.v1(), v1.v2(), v2x, v2y, v2z, res);
	}
	
	/**
	 * Multiplies the first vector {@code (v1[0], v1[1], v1[2])} with the second vector {@code (v2)}
	 * and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1], v1[2]) * (v2x, v2y)}
	 * 
	 * @param v1
	 *     The first vector as an array with at least three entries.
	 * @param v2
	 *     The second vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] mul(@MinLength(3) float[] v1, Tup3RF v2, @ExtractionParam @MinLength(3) float[] res)
	{
		return mul(v1[0], v1[1], v1[2], v2.v0(), v2.v1(), v2.v2(), res);
	}
	
	/**
	 * Multiplies the first vector {@code (v1[0], v1[1], v1[2])} with the second vector
	 * {@code (v2[0], v2[1], v2[2])} and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1], v1[2]) * (v2[0], v2[1], v2[2])}
	 * 
	 * @param v1
	 *     The first vector as an array with at least three entries.
	 * @param v2
	 *     The second vector as an array with at least three entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] mul(@MinLength(3) float[] v1, @MinLength(3) float[] v2, @ExtractionParam @MinLength(3) float[] res)
	{
		return mul(v1[0], v1[1], v1[2], v2[0], v2[1], v2[2], res);
	}
	
	/**
	 * Multiplies the first vector {@code (v1[0], v1[1], v1[2])} with the second vector
	 * {@code (v2x, v2y, v2z)} and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1], v1[2]) * (v2x, v2y, v2z)}
	 * 
	 * @param v1
	 *     The first vector as an array with at least three entries.
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * @param v2z
	 *     The value of the z component of the second vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] mul(@MinLength(3) float[] v1, float v2x, float v2y, float v2z, @ExtractionParam @MinLength(3) float[] res)
	{
		return mul(v1[0], v1[1], v1[2], v2x, v2y, v2z, res);
	}
	
	/**
	 * Multiplies the first vector {@code (v1x, v1y, v1z)} with the second vector {@code (v2)} and
	 * saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y, v1z) * v2}
	 * 
	 * @param v1x
	 *     The value of the x component of the first vector.
	 * @param v1y
	 *     The value of the y component of the first vector.
	 * @param v1z
	 *     The value of the z component of the first vector.
	 * @param v2
	 *     The second vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] mul(float v1x, float v1y, float v1z, Tup3RF v2, @ExtractionParam @MinLength(3) float[] res)
	{
		return mul(v1x, v1y, v1z, v2.v0(), v2.v1(), v2.v2(), res);
	}
	
	/**
	 * Multiplies the first vector {@code (v1x, v1y, v1z)} with the second vector
	 * {@code (v2[0], v2[1], v2[2])} and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y, v1z) * (v2[0], v2[1], v2[2])}
	 * 
	 * @param v1x
	 *     The value of the x component of the first vector.
	 * @param v1y
	 *     The value of the y component of the first vector.
	 * @param v1z
	 *     The value of the z component of the first vector.
	 * @param v2
	 *     The second vector as an array with at least three entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] mul(float v1x, float v1y, float v1z, @MinLength(3) float[] v2, @ExtractionParam @MinLength(3) float[] res)
	{
		return mul(v1x, v1y, v1z, v2[0], v2[1], v2[2], res);
	}
	
	/**
	 * Multiplies the first vector {@code (v1x, v1y, v1z)} with the second vector
	 * {@code (v2x, v2y, v2z)} and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y, v1z) * (v2x, v2y, v2z)}
	 * 
	 * @param v1x
	 *     The value of the x component of the first vector.
	 * @param v1y
	 *     The value of the y component of the first vector.
	 * @param v1z
	 *     The value of the z component of the first vector.
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * @param v2z
	 *     The value of the z component of the second vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] mul(float v1x, float v1y, float v1z, float v2x, float v2y, float v2z, @ExtractionParam @MinLength(3) float[] res)
	{
		res[0] = v1x * v2x;
		res[1] = v1y * v2y;
		res[2] = v1z * v2z;
		
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
	public static <T extends Tup3WF> T mul(Tup3RF v1, Tup3RF v2, @ExtractionParam T res)
	{
		return mul(v1.v0(), v1.v1(), v1.v2(), v2.v0(), v2.v1(), v2.v2(), res);
	}
	
	/**
	 * Multiplies the first vector {@code (v1)} with the second vector {@code (v2[0], v2[1], v2[2])}
	 * and saves the result in the given extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 * (v2[0], v2[1], v2[2])}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1
	 *     The first vector.
	 * @param v2
	 *     The second vector as an array with at least three entries.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T mul(Tup3RF v1, @MinLength(3) float[] v2, @ExtractionParam T res)
	{
		return mul(v1.v0(), v1.v1(), v1.v2(), v2[0], v2[1], v2[2], res);
	}
	
	/**
	 * Multiplies the first vector {@code (v1)} with the second vector {@code (v2x, v2y, v2z)} and
	 * saves the result in the given extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 * (v2x, v2y, v2z)}
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
	 * @param v2z
	 *     The value of the z component of the second vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T mul(Tup3RF v1, float v2x, float v2y, float v2z, @ExtractionParam T res)
	{
		return mul(v1.v0(), v1.v1(), v1.v2(), v2x, v2y, v2z, res);
	}
	
	/**
	 * Multiplies the first vector {@code (v1[0], v1[1], v1[2])} with the second vector {@code (v2)}
	 * and saves the result in the given extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1], v1[2]) * v2}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1
	 *     The first vector as an array with at least three entries.
	 * @param v2
	 *     The second vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T mul(@MinLength(3) float[] v1, Tup3RF v2, @ExtractionParam T res)
	{
		return mul(v1[0], v1[1], v1[2], v2.v0(), v2.v1(), v2.v2(), res);
	}
	
	/**
	 * Multiplies the first vector {@code (v1[0], v1[1], v1[2])} with the second vector
	 * {@code (v2[0], v2[1], v2[2])} and saves the result in the given extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1], v1[2]) * (v2[0], v2[1], v2[2])}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1
	 *     The first vector as an array with at least three entries.
	 * @param v2
	 *     The second vector as an array with at least three entries.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T mul(@MinLength(3) float[] v1, @MinLength(3) float[] v2, @ExtractionParam T res)
	{
		return mul(v1[0], v1[1], v1[2], v2[0], v2[1], v2[2], res);
	}
	
	/**
	 * Multiplies the first vector {@code (v1[0], v1[1], v1[2])} with the second vector
	 * {@code (v2x, v2y, v2z)} and saves the result in the given extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1], v1[2]) * (v2x, v2y, v2z)}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1
	 *     The first vector as an array with at least three entries.
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * @param v2z
	 *     The value of the z component of the second vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T mul(@MinLength(3) float[] v1, float v2x, float v2y, float v2z, @ExtractionParam T res)
	{
		return mul(v1[0], v1[1], v1[2], v2x, v2y, v2z, res);
	}
	
	/**
	 * Multiplies the first vector {@code (v1x, v1y, v1z)} with the second vector {@code (v2)} and
	 * saves the result in the given extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y, v1z) * v2}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1x
	 *     The value of the x component of the first vector.
	 * @param v1y
	 *     The value of the y component of the first vector.
	 * @param v1z
	 *     The value of the z component of the first vector.
	 * @param v2
	 *     The second vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T mul(float v1x, float v1y, float v1z, Tup3RF v2, @ExtractionParam T res)
	{
		return mul(v1x, v1y, v1z, v2.v0(), v2.v1(), v2.v2(), res);
	}
	
	/**
	 * Multiplies the first vector {@code (v1x, v1y, v1z)} with the second vector
	 * {@code (v2[0], v2[1], v2[2])} and saves the result in the given extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y, v1z) * (v2[0], v2[1], v2[2])}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1x
	 *     The value of the x component of the first vector.
	 * @param v1y
	 *     The value of the y component of the first vector.
	 * @param v1z
	 *     The value of the z component of the first vector.
	 * @param v2
	 *     The second vector as an array with at least three entries.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T mul(float v1x, float v1y, float v1z, @MinLength(3) float[] v2, @ExtractionParam T res)
	{
		return mul(v1x, v1y, v1z, v2[0], v2[1], v2[2], res);
	}
	
	/**
	 * Multiplies the first vector {@code (v1x, v1y, v1z)} with the second vector
	 * {@code (v2x, v2y, v2z)} and saves the result in the given extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y, v1z) * (v2x, v2y, v2z)}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1x
	 *     The value of the x component of the first vector.
	 * @param v1y
	 *     The value of the y component of the first vector.
	 * @param v1z
	 *     The value of the z component of the first vector.
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * @param v2z
	 *     The value of the z component of the second vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T mul(float v1x, float v1y, float v1z, float v2x, float v2y, float v2z, @ExtractionParam T res)
	{
		res.set(v1x * v2x, v1y * v2y, v1z * v2z);
		
		return res;
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
	public static float[] div(Tup3RF v1, Tup3RF v2, @ExtractionParam @MinLength(2) float[] res)
	{
		return div(v1.v0(), v1.v1(), v1.v2(), v2.v0(), v2.v1(), v2.v2(), res);
	}
	
	/**
	 * Divides the first vector {@code (v1)} by the second vector [@code (v2[0], v2[1], v2[2])} and
	 * saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 / (v2[0], v2[1], v2[2])}
	 * 
	 * @param v1
	 *     The first vector.
	 * @param v2
	 *     The second vector as an array with at least three entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] div(Tup3RF v1, @MinLength(3) float[] v2, @ExtractionParam @MinLength(3) float[] res)
	{
		return div(v1.v0(), v1.v1(), v1.v2(), v2[0], v2[1], v2[2], res);
	}
	
	/**
	 * Divides the first vector {@code (v1)} by the second vector [@code (v2x, v2y, v2z)} and saves
	 * the result in the given extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 / (v2x, v2y, v2z)}
	 * 
	 * @param v1
	 *     The first vector.
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * @param v2z
	 *     The value of the z component of the second vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] div(Tup3RF v1, float v2x, float v2y, float v2z, @ExtractionParam @MinLength(3) float[] res)
	{
		return div(v1.v0(), v1.v1(), v1.v2(), v2x, v2y, v2z, res);
	}
	
	/**
	 * Divides the first vector {@code (v1[0], v1[1], v1[2])} by the second vector [@code (v2)} and
	 * saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1], v1[2]) / v2}
	 * 
	 * @param v1
	 *     The first vector as an array with at least three entries.
	 * @param v2
	 *     The second vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] div(@MinLength(3) float[] v1, Tup3RF v2, @ExtractionParam @MinLength(3) float[] res)
	{
		return div(v1[0], v1[1], v1[2], v2.v0(), v2.v1(), v2.v2(), res);
	}
	
	/**
	 * Divides the first vector {@code (v1[0], v1[1], v1[2])} by the second vector
	 * {@code (v2[0], v2[1], v2[2])} and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1], v1[2]) / (v2[0], v2[1], v2[2])}
	 * 
	 * @param v1
	 *     The first vector as an array with at least three entries.
	 * @param v2
	 *     The second vector as an array with at least three entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] div(@MinLength(3) float[] v1, @MinLength(3) float[] v2, @ExtractionParam @MinLength(3) float[] res)
	{
		return div(v1[0], v1[1], v1[2], v2[0], v2[1], v2[2], res);
	}
	
	/**
	 * Divides the first vector {@code (v1[0], v1[1], v1[2])} by the second vector
	 * {@code (v2x, v2y, v2z)} and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1], v1[2]) / (v2x, v2y, v2z)}
	 * 
	 * @param v1
	 *     The first vector as an array with at least three entries.
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * @param v2z
	 *     The value of the z component of the second vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] div(@MinLength(3) float[] v1, float v2x, float v2y, float v2z, @ExtractionParam @MinLength(3) float[] res)
	{
		return div(v1[0], v1[1], v1[2], v2x, v2y, v2z, res);
	}
	
	/**
	 * Divides the first vector {@code (v1x, v1y, v1z)} by the second vector [@code (v2)} and saves
	 * the result in the given extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y, v1z) / v2}
	 * 
	 * @param v1x
	 *     The value of the x component of the first vector.
	 * @param v1y
	 *     The value of the y component of the first vector.
	 * @param v1z
	 *     The value of the z component of the first vector.
	 * @param v2
	 *     The second vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] div(float v1x, float v1y, float v1z, Tup3RF v2, @ExtractionParam @MinLength(3) float[] res)
	{
		return div(v1x, v1y, v1z, v2.v0(), v2.v1(), v2.v2(), res);
	}
	
	/**
	 * Divides the first vector {@code (v1x, v1y, v1z)} by the second vector
	 * {@code (v2[0], v2[1], v2[2])} and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y, v1z) / (v2[0], v2[1], v2[2])}
	 * 
	 * @param v1x
	 *     The value of the x component of the first vector.
	 * @param v1y
	 *     The value of the y component of the first vector.
	 * @param v1z
	 *     The value of the z component of the first vector.
	 * @param v2
	 *     The second vector as an array with at least three entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] div(float v1x, float v1y, float v1z, @MinLength(3) float[] v2, @ExtractionParam @MinLength(3) float[] res)
	{
		return div(v1x, v1y, v1z, v2[0], v2[1], v2[2], res);
	}
	
	/**
	 * Divides the first vector {@code (v1x, v1y, v1z)} by the second vector {@code (v2x, v2y, v2z)}
	 * and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y, v1z) / (v2x, v2y, v2z)}
	 * 
	 * @param v1x
	 *     The value of the x component of the first vector.
	 * @param v1y
	 *     The value of the y component of the first vector.
	 * @param v1z
	 *     The value of the z component of the first vector.
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * @param v2z
	 *     The value of the z component of the second vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] div(float v1x, float v1y, float v1z, float v2x, float v2y, float v2z, @ExtractionParam @MinLength(3) float[] res)
	{
		res[0] = v1x / v2x;
		res[1] = v1y / v2y;
		res[2] = v1z / v2z;
		
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
	public static <T extends Tup3WF> T div(Tup3RF v1, Tup3RF v2, @ExtractionParam T res)
	{
		return div(v1.v0(), v1.v1(), v1.v2(), v2.v0(), v2.v1(), v2.v2(), res);
	}
	
	/**
	 * Divides the first vector {@code (v1)} by the second vector [@code (v2[0], v2[1], v2[2])} and
	 * saves the result in the given extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 / (v2[0], v2[1], v2[2])}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1
	 *     The first vector.
	 * @param v2
	 *     The second vector as an array with at least three entries.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T div(Tup3RF v1, @MinLength(3) float[] v2, @ExtractionParam T res)
	{
		return div(v1.v0(), v1.v1(), v1.v2(), v2[0], v2[1], v2[2], res);
	}
	
	/**
	 * Divides the first vector {@code (v1)} by the second vector [@code (v2x, v2y, v2z)} and saves
	 * the result in the given extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 / (v2x, v2y, v2z)}
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
	 * @param v2z
	 *     The value of the z component of the second vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T div(Tup3RF v1, float v2x, float v2y, float v2z, @ExtractionParam T res)
	{
		return div(v1.v0(), v1.v1(), v1.v2(), v2x, v2y, v2z, res);
	}
	
	/**
	 * Divides the first vector {@code (v1[0], v1[1], v1[2])} by the second vector [@code (v2)} and
	 * saves the result in the given extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1], v1[2]) / v2}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1
	 *     The first vector as an array with at least three entries.
	 * @param v2
	 *     The second vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T div(@MinLength(3) float[] v1, Tup3RF v2, @ExtractionParam T res)
	{
		return div(v1[0], v1[1], v1[2], v2.v0(), v2.v1(), v2.v2(), res);
	}
	
	/**
	 * Divides the first vector {@code (v1[0], v1[1], v1[2])} by the second vector
	 * {@code (v2[0], v2[1], v2[2])} and saves the result in the given extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1], v1[2]) / (v2[0], v2[1], v2[2])}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1
	 *     The first vector as an array with at least three entries.
	 * @param v2
	 *     The second vector as an array with at least three entries.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T div(@MinLength(3) float[] v1, @MinLength(3) float[] v2, @ExtractionParam T res)
	{
		return div(v1[0], v1[1], v1[2], v2[0], v2[1], v2[2], res);
	}
	
	/**
	 * Divides the first vector {@code (v1[0], v1[1], v1[2])} by the second vector
	 * {@code (v2x, v2y, v2z)} and saves the result in the given extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1], v1[2]) / (v2x, v2y, v2z)}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1
	 *     The first vector as an array with at least three entries.
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * @param v2z
	 *     The value of the z component of the second vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T div(@MinLength(3) float[] v1, float v2x, float v2y, float v2z, @ExtractionParam T res)
	{
		return div(v1[0], v1[1], v1[2], v2x, v2y, v2z, res);
	}
	
	/**
	 * Divides the first vector {@code (v1x, v1y, v1z)} by the second vector [@code (v2)} and saves
	 * the result in the given extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y, v1z) / v2}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1x
	 *     The value of the x component of the first vector.
	 * @param v1y
	 *     The value of the y component of the first vector.
	 * @param v1z
	 *     The value of the z component of the first vector.
	 * @param v2
	 *     The second vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T div(float v1x, float v1y, float v1z, Tup3RF v2, @ExtractionParam T res)
	{
		return div(v1x, v1y, v1z, v2.v0(), v2.v1(), v2.v2(), res);
	}
	
	/**
	 * Divides the first vector {@code (v1x, v1y, v1z)} by the second vector
	 * {@code (v2[0], v2[1], v2[2])} and saves the result in the given extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y, v1z) / (v2[0], v2[1], v2[2])}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1x
	 *     The value of the x component of the first vector.
	 * @param v1y
	 *     The value of the y component of the first vector.
	 * @param v1z
	 *     The value of the z component of the first vector.
	 * @param v2
	 *     The second vector as an array with at least three entries.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T div(float v1x, float v1y, float v1z, @MinLength(3) float[] v2, @ExtractionParam T res)
	{
		return div(v1x, v1y, v1z, v2[0], v2[1], v2[2], res);
	}
	
	/**
	 * Divides the first vector {@code (v1x, v1y, v1z)} by the second vector {@code (v2x, v2y, v2z)}
	 * and saves the result in the given extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y, v1z) / (v2x, v2y, v2z)}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1x
	 *     The value of the x component of the first vector.
	 * @param v1y
	 *     The value of the y component of the first vector.
	 * @param v1z
	 *     The value of the z component of the first vector.
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * @param v2z
	 *     The value of the z component of the second vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T div(float v1x, float v1y, float v1z, float v2x, float v2y, float v2z, @ExtractionParam T res)
	{
		res.set(v1x / v2x, v1y / v2y, v1z / v2z);
		
		return res;
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
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] revDiv(Tup3RF v1, Tup3RF v2, @ExtractionParam @MinLength(3) float[] res)
	{
		return revDiv(v1.v0(), v1.v1(), v1.v2(), v2.v0(), v2.v1(), v2.v2(), res);
	}
	
	/**
	 * Divides the second vector {@code (v2[0], v2[1], v2[2])} by the first vector {@code (v1)} and
	 * saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2[0], v2[1], v2[2]) / v1}
	 * 
	 * @param v1
	 *     The first vector.
	 * @param v2
	 *     The second vector as an array with at least three entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] revDiv(Tup3RF v1, @MinLength(3) float[] v2, @ExtractionParam @MinLength(3) float[] res)
	{
		return revDiv(v1.v0(), v1.v1(), v1.v2(), v2[0], v2[1], v2[2], res);
	}
	
	/**
	 * Divides the second vector {@code (v2x, v2y, v2z)} by the first vector {@code (v1)} and saves
	 * the result in the given extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2x, v2y, v2z) / v1}
	 * 
	 * @param v1
	 *     The first vector.
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * @param v2z
	 *     The value of the z component of the second vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] revDiv(Tup3RF v1, float v2x, float v2y, float v2z, @ExtractionParam @MinLength(3) float[] res)
	{
		return revDiv(v1.v0(), v1.v1(), v1.v2(), v2x, v2y, v2z, res);
	}
	
	/**
	 * Divides the second vector {@code (v2)} by the first vector {@code (v1[0], v1[1], v1[2])} and
	 * saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v2 / (v1[0], v1[1], v1[2])}
	 * 
	 * @param v1
	 *     The first vector as an array with at least three entries.
	 * @param v2
	 *     The second vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] revDiv(@MinLength(3) float[] v1, Tup3RF v2, @ExtractionParam @MinLength(3) float[] res)
	{
		return revDiv(v1[0], v1[1], v1[2], v2.v0(), v2.v1(), v2.v2(), res);
	}
	
	/**
	 * Divides the second vector {@code (v2[0], v2[1], v2[2])} by the first vector
	 * {@code (v1[0], v1[1], v1[2])} and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2[0], v2[1], v2[2]) / (v1[0], v1[1], v1[2])}
	 * 
	 * @param v1
	 *     The first vector as an array with at least three entries.
	 * @param v2
	 *     The second vector as an array with at least three entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] revDiv(@MinLength(3) float[] v1, @MinLength(3) float[] v2, @ExtractionParam @MinLength(3) float[] res)
	{
		return revDiv(v1[0], v1[1], v1[2], v2[0], v2[1], v2[2], res);
	}
	
	/**
	 * Divides the second vector {@code (v2x, v2y, v2z)} by the first vector
	 * {@code (v1[0], v1[1], v1[2])} and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2x, v2y, v2z) / (v1[0], v1[1], v1[2])}
	 * 
	 * @param v1
	 *     The first vector as an array with at least three entries.
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * @param v2z
	 *     The value of the z component of the second vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] revDiv(@MinLength(3) float[] v1, float v2x, float v2y, float v2z, @ExtractionParam @MinLength(3) float[] res)
	{
		return revDiv(v1[0], v1[1], v1[2], v2x, v2y, v2z, res);
	}
	
	/**
	 * Divides the second vector {@code (v2)} by the first vector {@code (v1x, v1y, v1z)} and saves
	 * the result in the given extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v2 / (v1x, v1y, v1z)}
	 * 
	 * @param v1x
	 *     The value of the x component of the first vector.
	 * @param v1y
	 *     The value of the y component of the first vector.
	 * @param v1z
	 *     The value of the z component of the first vector.
	 * @param v2
	 *     The second vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] revDiv(float v1x, float v1y, float v1z, Tup3RF v2, @ExtractionParam @MinLength(3) float[] res)
	{
		return revDiv(v1x, v1y, v1z, v2.v0(), v2.v1(), v2.v2(), res);
	}
	
	/**
	 * Divides the second vector {@code (v2[0], v2[1], v2[2])} by the first vector
	 * {@code (v1x, v1y, v1z)} and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2[0], v2[1], v2[2]) / (v1x, v1y, v1z)}
	 * 
	 * @param v1x
	 *     The value of the x component of the first vector.
	 * @param v1y
	 *     The value of the y component of the first vector.
	 * @param v1z
	 *     The value of the z component of the first vector.
	 * @param v2
	 *     The second vector as an array with at least three entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] revDiv(float v1x, float v1y, float v1z, @MinLength(3) float[] v2, @ExtractionParam @MinLength(3) float[] res)
	{
		return revDiv(v1x, v1y, v1z, v2[0], v2[1], v2[2], res);
	}
	
	/**
	 * Divides the second vector {@code (v2x, v2y, v2z)} by the first vector {@code (v1x, v1y, v1z)}
	 * and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2x, v2y, v2z) / (v1x, v1y, v1z)}
	 * 
	 * @param v1x
	 *     The value of the x component of the first vector.
	 * @param v1y
	 *     The value of the y component of the first vector.
	 * @param v1z
	 *     The value of the z component of the first vector.
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * @param v2z
	 *     The value of the z component of the second vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] revDiv(float v1x, float v1y, float v1z, float v2x, float v2y, float v2z, @ExtractionParam @MinLength(3) float[] res)
	{
		res[0] = v2x / v1x;
		res[1] = v2y / v1y;
		res[2] = v2z / v1z;
		
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
	public static <T extends Tup3WF> T revDiv(Tup3RF v1, Tup3RF v2, @ExtractionParam T res)
	{
		return revDiv(v1.v0(), v1.v1(), v1.v2(), v2.v0(), v2.v1(), v2.v2(), res);
	}
	
	/**
	 * Divides the second vector {@code (v2[0], v2[1], v2[2])} by the first vector {@code (v1)} and
	 * saves the result in the given extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2[0], v2[1], v2[2]) / v1}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter.
	 * 
	 * @param v1
	 *     The first vector.
	 * @param v2
	 *     The second vector as an array with at least three entries.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T revDiv(Tup3RF v1, @MinLength(3) float[] v2, @ExtractionParam T res)
	{
		return revDiv(v1.v0(), v1.v1(), v1.v2(), v2[0], v2[1], v2[2], res);
	}
	
	/**
	 * Divides the second vector {@code (v2x, v2y, v2z)} by the first vector {@code (v1)} and saves
	 * the result in the given extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2x, v2y, v2z) / v1}
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
	 * @param v2z
	 *     The value of the z component of the second vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T revDiv(Tup3RF v1, float v2x, float v2y, float v2z, @ExtractionParam T res)
	{
		return revDiv(v1.v0(), v1.v1(), v1.v2(), v2x, v2y, v2z, res);
	}
	
	/**
	 * Divides the second vector {@code (v2)} by the first vector {@code (v1[0], v1[1], v1[2])} and
	 * saves the result in the given extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v2 / (v1[0], v1[1], v1[2])}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter.
	 * 
	 * @param v1
	 *     The first vector as an array with at least three entries.
	 * @param v2
	 *     The second vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T revDiv(@MinLength(3) float[] v1, Tup3RF v2, @ExtractionParam T res)
	{
		return revDiv(v1[0], v1[1], v1[2], v2.v0(), v2.v1(), v2.v2(), res);
	}
	
	/**
	 * Divides the second vector {@code (v2[0], v2[1], v2[2])} by the first vector
	 * {@code (v1[0], v1[1], v1[2])} and saves the result in the given extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2[0], v2[1], v2[2]) / (v1[0], v1[1], v1[2])}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter.
	 * 
	 * @param v1
	 *     The first vector as an array with at least three entries.
	 * @param v2
	 *     The second vector as an array with at least three entries.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T revDiv(@MinLength(3) float[] v1, @MinLength(3) float[] v2, @ExtractionParam T res)
	{
		return revDiv(v1[0], v1[1], v1[2], v2[0], v2[1], v2[2], res);
	}
	
	/**
	 * Divides the second vector {@code (v2x, v2y, v2z)} by the first vector
	 * {@code (v1[0], v1[1], v1[2])} and saves the result in the given extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2x, v2y, v2z) / (v1[0], v1[1], v1[2])}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter.
	 * 
	 * @param v1
	 *     The first vector as an array with at least three entries.
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * @param v2z
	 *     The value of the z component of the second vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T revDiv(@MinLength(3) float[] v1, float v2x, float v2y, float v2z, @ExtractionParam T res)
	{
		return revDiv(v1[0], v1[1], v1[2], v2x, v2y, v2z, res);
	}
	
	/**
	 * Divides the second vector {@code (v2)} by the first vector {@code (v1x, v1y, v1z)} and saves
	 * the result in the given extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v2 / (v1x, v1y, v1z)}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter.
	 * 
	 * @param v1x
	 *     The value of the x component of the first vector.
	 * @param v1y
	 *     The value of the y component of the first vector.
	 * @param v1z
	 *     The value of the z component of the first vector.
	 * @param v2
	 *     The second vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T revDiv(float v1x, float v1y, float v1z, Tup3RF v2, @ExtractionParam T res)
	{
		return revDiv(v1x, v1y, v1z, v2.v0(), v2.v1(), v2.v2(), res);
	}
	
	/**
	 * Divides the second vector {@code (v2[0], v2[1], v2[2])} by the first vector
	 * {@code (v1x, v1y, v1z)} and saves the result in the given extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2[0], v2[1], v2[2]) / (v1x, v1y, v1z)}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter.
	 * 
	 * @param v1x
	 *     The value of the x component of the first vector.
	 * @param v1y
	 *     The value of the y component of the first vector.
	 * @param v1z
	 *     The value of the z component of the first vector.
	 * @param v2
	 *     The second vector as an array with at least three entries.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T revDiv(float v1x, float v1y, float v1z, @MinLength(3) float[] v2, @ExtractionParam T res)
	{
		return revDiv(v1x, v1y, v1z, v2[0], v2[1], v2[2], res);
	}
	
	/**
	 * Divides the second vector {@code (v2x, v2y, v2z)} by the first vector {@code (v1x, v1y, v1z)}
	 * and saves the result in the given extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2x, v2y, v2z) / (v1x, v1y, v1z)}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter.
	 * 
	 * @param v1x
	 *     The value of the x component of the first vector.
	 * @param v1y
	 *     The value of the y component of the first vector.
	 * @param v1z
	 *     The value of the z component of the first vector.
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * @param v2z
	 *     The value of the z component of the second vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T revDiv(float v1x, float v1y, float v1z, float v2x, float v2y, float v2z, @ExtractionParam T res)
	{
		res.set(v2x / v1x, v2y / v1y, v2z / v1z);
		
		return res;
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
	public static float[] fma(Tup3RF v1, Tup3RF v2, Tup3RF v3, @ExtractionParam @MinLength(3) float[] res)
	{
		return fma(v1.v0(), v1.v1(), v1.v2(), v2.v0(), v2.v1(), v2.v2(), v3.v0(), v3.v1(), v3.v2(), res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1)} with the given vector {@code (v2)}, adds the given
	 * vector {@code (v3[0], v3[1], v3[2])} to the product result and saves the result in the given
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
	 * {@code v1 * v2 + (v3[0], v3[1], v3[2])}
	 * 
	 * @param v1
	 *     The first multiplicant vector.
	 * @param v2
	 *     The second multiplicant vector.
	 * @param v3
	 *     The addend vector as an array with at least three entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] fma(Tup3RF v1, Tup3RF v2, @MinLength(3) float[] v3, @ExtractionParam @MinLength(3) float[] res)
	{
		return fma(v1.v0(), v1.v1(), v1.v2(), v2.v0(), v2.v1(), v2.v2(), v3[0], v3[1], v3[2], res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1)} with the given vector {@code (v2)}, adds the given
	 * vector {@code (v3x, v3y, v3z)} to the product result and saves the result in the given
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
	 * {@code v1 * v2 + (v3x, v3y, v3z)}
	 * 
	 * @param v1
	 *     The first multiplicant vector.
	 * @param v2
	 *     The second multiplicant vector.
	 * @param v3x
	 *     The value of the x component of the addend vector.
	 * @param v3y
	 *     The value of the y component of the addend vector.
	 * @param v3z
	 *     The value of the z component of the addend vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] fma(Tup3RF v1, Tup3RF v2, float v3x, float v3y, float v3z, @ExtractionParam @MinLength(3) float[] res)
	{
		return fma(v1.v0(), v1.v1(), v1.v2(), v2.v0(), v2.v1(), v2.v2(), v3x, v3y, v3z, res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1)} with the given vector {@code (v2[0], v2[1], v2[2])},
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
	 * {@code v1 * (v2[0], v2[1], v2[2]) + v3}
	 * 
	 * @param v1
	 *     The first multiplicant vector.
	 * @param v2
	 *     The second multiplicant vector as an array with at least three entries.
	 * @param v3
	 *     The addend vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] fma(Tup3RF v1, @MinLength(3) float[] v2, Tup3RF v3, @ExtractionParam @MinLength(3) float[] res)
	{
		return fma(v1.v0(), v1.v1(), v1.v2(), v2[0], v2[1], v2[2], v3.v0(), v3.v1(), v3.v2(), res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1)} with the given vector {@code (v2[0], v2[1], v2[2])},
	 * adds the given vector {@code (v3[0], v3[1], v3[3])} to the product result and saves the
	 * result in the given extraction parameter.
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
	 * {@code v1 * (v2[0], v2[1], v2[2]) + (v3[0], v3[1], v3[2])}
	 * 
	 * @param v1
	 *     The first multiplicant vector.
	 * @param v2
	 *     The second multiplicant vector as an array with at least three entries.
	 * @param v3
	 *     The addend vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] fma(Tup3RF v1, @MinLength(3) float[] v2, @MinLength(3) float[] v3, @ExtractionParam @MinLength(3) float[] res)
	{
		return fma(v1.v0(), v1.v1(), v1.v2(), v2[0], v2[1], v2[2], v3[0], v3[1], v3[2], res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1)} with the given vector {@code (v2[0], v2[1], v2[2])},
	 * adds the given vector {@code (v3x, v3y, v3z)} to the product result and saves the result in
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
	 * {@code v1 * (v2[0], v2[1], v2[2]) + (v3x, v3y, v3z)}
	 * 
	 * @param v1
	 *     The first multiplicant vector.
	 * @param v2
	 *     The second multiplicant vector as an array with at least three entries.
	 * @param v3x
	 *     The value of the x component of the addend vector.
	 * @param v3y
	 *     The value of the y component of the addend vector.
	 * @param v3z
	 *     The value of the z component of the addend vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] fma(Tup3RF v1, @MinLength(3) float[] v2, float v3x, float v3y, float v3z, @ExtractionParam @MinLength(3) float[] res)
	{
		return fma(v1.v0(), v1.v1(), v1.v2(), v2[0], v2[1], v2[2], v3x, v3y, v3z, res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1)} with the given vector {@code (v2x, v2y, v2z)}, adds
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
	 * {@code v1 * (v2x, v2y, v2z) + v3}
	 * 
	 * @param v1
	 *     The first multiplicant vector.
	 * @param v2x
	 *     The value of the x component of the second multiplicant vector.
	 * @param v2y
	 *     The value of the y component of the second multiplicant vector.
	 * @param v2z
	 *     The value of the z component of the second multiplicant vector.
	 * @param v3
	 *     The addend vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] fma(Tup3RF v1, float v2x, float v2y, float v2z, Tup3RF v3, @ExtractionParam @MinLength(3) float[] res)
	{
		return fma(v1.v0(), v1.v1(), v1.v2(), v2x, v2y, v2z, v3.v0(), v3.v1(), v3.v2(), res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1)} with the given vector {@code (v2x, v2y, v2z)}, adds
	 * the given vector {@code (v3[0], v3[1], v3[2])} to the product result and saves the result in
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
	 * {@code v1 * (v2x, v2y, v2z) + (v3[0], v3[1], v3[2])}
	 * 
	 * @param v1
	 *     The first multiplicant vector.
	 * @param v2x
	 *     The value of the x component of the second multiplicant vector.
	 * @param v2y
	 *     The value of the y component of the second multiplicant vector.
	 * @param v2z
	 *     The value of the z component of the second multiplicant vector.
	 * @param v3
	 *     The addend vector as an array with at least three entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] fma(Tup3RF v1, float v2x, float v2y, float v2z, @MinLength(3) float[] v3, @ExtractionParam @MinLength(3) float[] res)
	{
		return fma(v1.v0(), v1.v1(), v1.v2(), v2x, v2y, v2z, v3[0], v3[1], v3[2], res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1)} with the given vector {@code (v2x, v2y, v2z)}, adds
	 * the given vector {@code (v3x, v3y, v3z)} to the product result and saves the result in the
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
	 * {@code v1 * (v2x, v2y, v2z) + (v3x, v3y, v3z)}
	 * 
	 * @param v1
	 *     The first multiplicant vector.
	 * @param v2x
	 *     The value of the x component of the second multiplicant vector.
	 * @param v2y
	 *     The value of the y component of the second multiplicant vector.
	 * @param v2z
	 *     The value of the z component of the second multiplicant vector.
	 * @param v3x
	 *     The value of the x component of the addend vector.
	 * @param v3y
	 *     The value of the y component of the addend vector.
	 * @param v3z
	 *     The value of the z component of the addend vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] fma(Tup3RF v1, float v2x, float v2y, float v2z, float v3x, float v3y, float v3z, @ExtractionParam @MinLength(3) float[] res)
	{
		return fma(v1.v0(), v1.v1(), v1.v2(), v2x, v2y, v2z, v3x, v3y, v3z, res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1[0], v1[1], v1[2])} with the given vector {@code (v2)},
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
	 * {@code (v1[0], v1[1], v1[2]) * v2 + v3}
	 * 
	 * @param v1
	 *     The first multiplicant vector as an array with at least three entries.
	 * @param v2
	 *     The second multiplicant vector.
	 * @param v3
	 *     The addend vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] fma(@MinLength(3) float[] v1, Tup3RF v2, Tup3RF v3, @ExtractionParam @MinLength(3) float[] res)
	{
		return fma(v1[0], v1[1], v1[2], v2.v0(), v2.v1(), v2.v2(), v3.v0(), v3.v1(), v3.v2(), res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1[0], v1[1], v1[2])} with the given vector {@code (v2)},
	 * adds the given vector {@code (v3[0], v3[1], v3[2])} to the product result and saves the
	 * result in the given extraction parameter.
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
	 * {@code (v1[0], v1[1], v1[2]) * v2 + (v3[0], v3[1], v3[2])}
	 * 
	 * @param v1
	 *     The first multiplicant vector as an array with at least three entries.
	 * @param v2
	 *     The second multiplicant vector.
	 * @param v3
	 *     The addend vector as an array with at least three entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] fma(@MinLength(3) float[] v1, Tup3RF v2, @MinLength(3) float[] v3, @ExtractionParam @MinLength(3) float[] res)
	{
		return fma(v1[0], v1[1], v1[2], v2.v0(), v2.v1(), v2.v2(), v3[0], v3[1], v3[2], res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1[0], v1[1], v1[2])} with the given vector {@code (v2)},
	 * adds the given vector {@code (v3x, v3y, v3z)} to the product result and saves the result in
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
	 * {@code (v1[0], v1[1], v1[2]) * v2 + (v3x, v3y, v3z)}
	 * 
	 * @param v1
	 *     The first multiplicant vector as an array with at least three entries.
	 * @param v2
	 *     The second multiplicant vector.
	 * @param v3x
	 *     The value of the x component of the addend vector.
	 * @param v3y
	 *     The value of the y component of the addend vector.
	 * @param v3z
	 *     The value of the z component of the addend vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] fma(@MinLength(3) float[] v1, Tup3RF v2, float v3x, float v3y, float v3z, @ExtractionParam @MinLength(3) float[] res)
	{
		return fma(v1[0], v1[1], v1[2], v2.v0(), v2.v1(), v2.v2(), v3x, v3y, v3z, res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1[0], v1[1], v1[2])} with the given vector
	 * {@code (v2[0], v2[1], v2[2])}, adds the given vector {@code (v3)} to the product result and
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
	 * {@code (v1[0], v1[1], v1[2]) * (v2[0], v2[1], v2[2]) + v3}
	 * 
	 * @param v1
	 *     The first multiplicant vector as an array with at least three entries.
	 * @param v2
	 *     The second multiplicant vector as an array with at least three entries.
	 * @param v3
	 *     The addend vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] fma(@MinLength(3) float[] v1, @MinLength(3) float[] v2, Tup3RF v3, @ExtractionParam @MinLength(3) float[] res)
	{
		return fma(v1[0], v1[1], v1[2], v2[0], v2[1], v2[2], v3.v0(), v3.v1(), v3.v2(), res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1[0], v1[1], v1[2])} with the given vector
	 * {@code (v2[0], v2[1], v2[2])}, adds the given vector {@code (v3[0], v3[1], v3[2])} to the
	 * product result and saves the result in the given extraction parameter.
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
	 * {@code (v1[0], v1[1], v1[2]) * (v2[0], v2[1], v2[2]) + (v3[0], v3[1], v3[2])}
	 * 
	 * @param v1
	 *     The first multiplicant vector as an array with at least three entries.
	 * @param v2
	 *     The second multiplicant vector as an array with at least three entries.
	 * @param v3
	 *     The addend vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] fma(@MinLength(3) float[] v1, @MinLength(3) float[] v2, @MinLength(3) float[] v3, @ExtractionParam @MinLength(3) float[] res)
	{
		return fma(v1[0], v1[1], v1[2], v2[0], v2[1], v2[2], v3[0], v3[1], v3[2], res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1[0], v1[1], v1[2])} with the given vector
	 * {@code (v2[0], v2[1], v2[2])}, adds the given vector {@code (v3x, v3y, v3z)} to the product
	 * result and saves the result in the given extraction parameter.
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
	 * {@code (v1[0], v1[1], v1[2]) * (v2[0], v2[1], v2[2]) + (v3x, v3y, v3z)}
	 * 
	 * @param v1
	 *     The first multiplicant vector as an array with at least three entries.
	 * @param v2
	 *     The second multiplicant vector as an array with at least three entries.
	 * @param v3x
	 *     The value of the x component of the addend vector.
	 * @param v3y
	 *     The value of the y component of the addend vector.
	 * @param v3z
	 *     The value of the z component of the addend vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] fma(@MinLength(3) float[] v1, @MinLength(3) float[] v2, float v3x, float v3y, float v3z, @ExtractionParam @MinLength(3) float[] res)
	{
		return fma(v1[0], v1[1], v1[2], v2[0], v2[1], v2[2], v3x, v3y, v3z, res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1[0], v1[1], v1[2])} with the given vector
	 * {@code (v2x, v2y, v2z)}, adds the given vector {@code (v3)} to the product result and saves
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
	 * {@code (v1[0], v1[1], v1[2]) * (v2x, v2y, v2z) + v3}
	 * 
	 * @param v1
	 *     The first multiplicant vector as an array with at least three entries.
	 * @param v2x
	 *     The value of the x component of the second multiplicant vector.
	 * @param v2y
	 *     The value of the y component of the second multiplicant vector.
	 * @param v2z
	 *     The value of the z component of the second multiplicant vector.
	 * @param v3
	 *     The addend vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] fma(@MinLength(3) float[] v1, float v2x, float v2y, float v2z, Tup3RF v3, @ExtractionParam @MinLength(3) float[] res)
	{
		return fma(v1[0], v1[1], v1[2], v2x, v2y, v2z, v3.v0(), v3.v1(), v3.v2(), res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1[0], v1[1], v1[2])} with the given vector
	 * {@code (v2x, v2y, v2z)}, adds the given vector {@code (v3[0], v3[1], v3[2])} to the product
	 * result and saves the result in the given extraction parameter.
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
	 * {@code (v1[0], v1[1], v1[2]) * (v2x, v2y, v2z) + (v3[0], v3[1], v3[2])}
	 * 
	 * @param v1
	 *     The first multiplicant vector as an array with at least three entries.
	 * @param v2x
	 *     The value of the x component of the second multiplicant vector.
	 * @param v2y
	 *     The value of the y component of the second multiplicant vector.
	 * @param v2z
	 *     The value of the z component of the second multiplicant vector.
	 * @param v3
	 *     The addend vector as an array with at least three entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] fma(@MinLength(3) float[] v1, float v2x, float v2y, float v2z, @MinLength(3) float[] v3, @ExtractionParam @MinLength(3) float[] res)
	{
		return fma(v1[0], v1[1], v1[2], v2x, v2y, v2z, v3[0], v3[1], v3[2], res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1[0], v1[1], v1[2])} with the given vector
	 * {@code (v2x, v2y, v2z)}, adds the given vector {@code (v3x, v3y, v3z)} to the product result
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
	 * {@code (v1[0], v1[1], v1[2]) * (v2x, v2y, v2z) + (v3x, v3y, v3z)}
	 * 
	 * @param v1
	 *     The first multiplicant vector as an array with at least three entries.
	 * @param v2x
	 *     The value of the x component of the second multiplicant vector.
	 * @param v2y
	 *     The value of the y component of the second multiplicant vector.
	 * @param v2z
	 *     The value of the z component of the second multiplicant vector.
	 * @param v3x
	 *     The value of the x component of the addend vector.
	 * @param v3y
	 *     The value of the y component of the addend vector.
	 * @param v3z
	 *     The value of the z component of the addend vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] fma(@MinLength(3) float[] v1, float v2x, float v2y, float v2z, float v3x, float v3y, float v3z, @ExtractionParam @MinLength(3) float[] res)
	{
		return fma(v1[0], v1[1], v1[2], v2x, v2y, v2z, v3x, v3y, v3z, res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1x, v1y, v1z)} with the given vector {@code (v2)}, adds
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
	 * {@code (v1x, v1y, v1z) * v2 + v3}
	 * 
	 * @param v1x
	 *     The value of the x component of the first multiplicant vector.
	 * @param v1y
	 *     The value of the y component of the first multiplicant vector.
	 * @param v1z
	 *     The value of the z component of the first multiplicant vector.
	 * @param v2
	 *     The second multiplicant vector.
	 * @param v3
	 *     The addend vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] fma(float v1x, float v1y, float v1z, Tup3RF v2, Tup3RF v3, @ExtractionParam @MinLength(3) float[] res)
	{
		return fma(v1x, v1y, v1z, v2.v0(), v2.v1(), v2.v2(), v3.v0(), v3.v1(), v3.v2(), res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1x, v1y, v1z)} with the given vector {@code (v2)}, adds
	 * the given vector {@code (v3[0], v3[1], v2[2])} to the product result and saves the result in
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
	 * {@code (v1x, v1y, v1z) * v2 + (v3[0], v3[1], v3[2])}
	 * 
	 * @param v1x
	 *     The value of the x component of the first multiplicant vector.
	 * @param v1y
	 *     The value of the y component of the first multiplicant vector.
	 * @param v1z
	 *     The value of the z component of the first multiplicant vector.
	 * @param v2
	 *     The second multiplicant vector.
	 * @param v3
	 *     The addend vector as an array with at least three entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] fma(float v1x, float v1y, float v1z, Tup3RF v2, @MinLength(3) float[] v3, @ExtractionParam @MinLength(3) float[] res)
	{
		return fma(v1x, v1y, v1z, v2.v0(), v2.v1(), v2.v2(), v3[0], v3[1], v3[2], res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1x, v1y, v1z)} with the given vector {@code (v2)}, adds
	 * the given vector {@code (v3x, v3y, v3z)} to the product result and saves the result in the
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
	 * {@code (v1x, v1y, v1z) * v2 + (v3x, v3y, v3z)}
	 * 
	 * @param v1x
	 *     The value of the x component of the first multiplicant vector.
	 * @param v1y
	 *     The value of the y component of the first multiplicant vector.
	 * @param v1z
	 *     The value of the z component of the first multiplicant vector.
	 * @param v2
	 *     The second multiplicant vector.
	 * @param v3x
	 *     The value of the x component of the addend vector.
	 * @param v3y
	 *     The value of the y component of the addend vector.
	 * @param v3z
	 *     The value of the z component of the addend vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] fma(float v1x, float v1y, float v1z, Tup3RF v2, float v3x, float v3y, float v3z, @ExtractionParam @MinLength(3) float[] res)
	{
		return fma(v1x, v1y, v1z, v2.v0(), v2.v1(), v2.v2(), v3x, v3y, v3z, res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1x, v1y, v1z)} with the given vector
	 * {@code (v2[0], v2[1], v2[2])}, adds the given vector {@code (v3)} to the product result and
	 * saves the result in the given result array.
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
	 * {@code (v1x, v1y, v1z) * (v2[0], v2[1], v2[2]) + v3}
	 * 
	 * @param v1x
	 *     The value of the x component of the first multiplicant vector.
	 * @param v1y
	 *     The value of the y component of the first multiplicant vector.
	 * @param v1z
	 *     The value of the z component of the first multiplicant vector.
	 * @param v2
	 *     The second multiplicant vector as an array with at least three entries.
	 * @param v3
	 *     The addend vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] fma(float v1x, float v1y, float v1z, @MinLength(3) float[] v2, Tup3RF v3, @ExtractionParam @MinLength(3) float[] res)
	{
		return fma(v1x, v1y, v1z, v2[0], v2[1], v2[2], v3.v0(), v3.v1(), v3.v2(), res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1x, v1y, v1z)} with the given vector
	 * {@code (v2[0], v2[1], v2[2])}, adds the given vector {@code (v3[0], v3[1], v3[2])} to the
	 * product result and saves the result in the given extraction parameter.
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
	 * {@code (v1x, v1y, v1z) * (v2[0], v2[1], v2[2]) + (v3[0], v3[1], v3[2])}
	 * 
	 * @param v1x
	 *     The value of the x component of the first multiplicant vector.
	 * @param v1y
	 *     The value of the y component of the first multiplicant vector.
	 * @param v1z
	 *     The value of the z component of the first multiplicant vector.
	 * @param v2
	 *     The second multiplicant vector as an array with at least three entries.
	 * @param v3
	 *     The addend vector as an array with at least three entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] fma(float v1x, float v1y, float v1z, @MinLength(3) float[] v2, @MinLength(3) float[] v3, @ExtractionParam @MinLength(3) float[] res)
	{
		return fma(v1x, v1y, v1z, v2[0], v2[1], v2[2], v3[0], v3[1], v3[2], res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1x, v1y, v1z)} with the given vector
	 * {@code (v2[0], v2[1], v2[2])}, adds the given vector {@code (v3x, v3y, v3z)} to the product
	 * result and saves the result in the given extraction parameter.
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
	 * {@code (v1x, v1y, v1z) * (v2[0], v2[1], v2[2]) + (v3x, v3y, v3z)}
	 * 
	 * @param v1x
	 *     The value of the x component of the first multiplicant vector.
	 * @param v1y
	 *     The value of the y component of the first multiplicant vector.
	 * @param v1z
	 *     The value of the z component of the first multiplicant vector.
	 * @param v2
	 *     The second multiplicant vector as an array with at least three entries.
	 * @param v3x
	 *     The value of the x component of the addend vector.
	 * @param v3y
	 *     The value of the y component of the addend vector.
	 * @param v3z
	 *     The value of the z component of the addend vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] fma(float v1x, float v1y, float v1z, @MinLength(3) float[] v2, float v3x, float v3y, float v3z, @ExtractionParam @MinLength(3) float[] res)
	{
		return fma(v1x, v1y, v1z, v2[0], v2[1], v2[2], v3x, v3y, v3z, res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1x, v1y, v1z)} with the given vector
	 * {@code (v2x, v2y, v2z)}, adds the given vector {@code (v3)} to the product result and saves
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
	 * {@code (v1x, v1y, v1z) * (v2x, v2y, v2z) + v3}
	 * 
	 * @param v1x
	 *     The value of the x component of the first multiplicant vector.
	 * @param v1y
	 *     The value of the y component of the first multiplicant vector.
	 * @param v1z
	 *     The value of the z component of the first multiplicant vector.
	 * @param v2x
	 *     The value of the x component of the second multiplicant vector.
	 * @param v2y
	 *     The value of the y component of the second multiplicant vector.
	 * @param v2z
	 *     The value of the z component of the second multiplicant vector.
	 * @param v3
	 *     The addend vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] fma(float v1x, float v1y, float v1z, float v2x, float v2y, float v2z, Tup3RF v3, @ExtractionParam @MinLength(3) float[] res)
	{
		return fma(v1x, v1y, v1z, v2x, v2y, v2z, v3.v0(), v3.v1(), v3.v2(), res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1x, v1y, v1z)} with the given vector
	 * {@code (v2x, v2y, v2z)}, adds the given vector {@code (v3[0], v3[1], v3[2])} to the product
	 * result and saves the result in the given extraction parameter.
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
	 * {@code (v1x, v1y, v1z) * (v2x, v2y, v2z) + (v3[0], v3[1], v3[2])}
	 * 
	 * @param v1x
	 *     The value of the x component of the first multiplicant vector.
	 * @param v1y
	 *     The value of the y component of the first multiplicant vector.
	 * @param v1z
	 *     The value of the z component of the first multiplicant vector.
	 * @param v2x
	 *     The value of the x component of the second multiplicant vector.
	 * @param v2y
	 *     The value of the y component of the second multiplicant vector.
	 * @param v2z
	 *     The value of the z component of the second multiplicant vector.
	 * @param v3
	 *     The addend vector as an array with at least three entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] fma(float v1x, float v1y, float v1z, float v2x, float v2y, float v2z, @MinLength(3) float[] v3, @ExtractionParam @MinLength(3) float[] res)
	{
		return fma(v1x, v1y, v1z, v2x, v2y, v2z, v3[0], v3[1], v3[2], res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1x, v1y, v1z)} with the given vector
	 * {@code (v2x, v2y, v2z)}, adds the given vector {@code (v3x, v3y, v3z)} to the product result
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
	 * {@code (v1x, v1y, v1z) * (v2x, v2y, v2z) + (v3x, v3y, v3z)}
	 * 
	 * @param v1x
	 *     The value of the x component of the first multiplicant vector.
	 * @param v1y
	 *     The value of the y component of the first multiplicant vector.
	 * @param v1z
	 *     The value of the z component of the first multiplicant vector.
	 * @param v2x
	 *     The value of the x component of the second multiplicant vector.
	 * @param v2y
	 *     The value of the y component of the second multiplicant vector.
	 * @param v2z
	 *     The value of the z component of the second multiplicant vector.
	 * @param v3x
	 *     The value of the x component of the addend vector.
	 * @param v3y
	 *     The value of the y component of the addend vector.
	 * @param v3z
	 *     The value of the z component of the addend vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] fma(float v1x, float v1y, float v1z, float v2x, float v2y, float v2z, float v3x, float v3y, float v3z, @ExtractionParam @MinLength(3) float[] res)
	{
		res[0] = BarghosMath.fma(v1x, v2x, v3x);
		res[1] = BarghosMath.fma(v1y, v2y, v3y);
		res[2] = BarghosMath.fma(v1z, v2z, v3z);
		
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
	public static <T extends Tup3WF> T fma(Tup3RF v1, Tup3RF v2, Tup3RF v3, @ExtractionParam T res)
	{
		return fma(v1.v0(), v1.v1(), v1.v2(), v2.v0(), v2.v1(), v2.v2(), v3.v0(), v3.v1(), v3.v2(), res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1)} with the given vector {@code (v2)}, adds the given
	 * vector {@code (v3[0], v3[1], v3[2])} to the product result and saves the result in the given
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
	 *     The addend vector as an array with at least three entries.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T fma(Tup3RF v1, Tup3RF v2, @MinLength(3) float[] v3, @ExtractionParam T res)
	{
		return fma(v1.v0(), v1.v1(), v1.v2(), v2.v0(), v2.v1(), v2.v2(), v3[0], v3[1], v3[2], res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1)} with the given vector {@code (v2)}, adds the given
	 * vector {@code (v3x, v3y, v3z)} to the product result and saves the result in the given
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
	 * {@code v1 * v2 + (v3x, v3y, v3z)}
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
	 * @param v3z
	 *     The value of the z component of the addend vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T fma(Tup3RF v1, Tup3RF v2, float v3x, float v3y, float v3z, @ExtractionParam T res)
	{
		return fma(v1.v0(), v1.v1(), v1.v2(), v2.v0(), v2.v1(), v2.v2(), v3x, v3y, v3z, res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1)} with the given vector {@code (v2[0], v2[1], v2[2])},
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
	 * {@code v1 * (v2[0], v2[1], v2[2]) + v3}
	 * 
	 * @param <T>
	 *     The type of the result vector.
	 * 
	 * @param v1
	 *     The first multiplicant vector.
	 * @param v2
	 *     The second multiplicant vector as an array with at least three entries.
	 * @param v3
	 *     The addend vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T fma(Tup3RF v1, @MinLength(3) float[] v2, Tup3RF v3, @ExtractionParam T res)
	{
		return fma(v1.v0(), v1.v1(), v1.v2(), v2[0], v2[1], v2[2], v3.v0(), v3.v1(), v3.v2(), res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1)} with the given vector {@code (v2[0], v2[1], v2[2])},
	 * adds the given vector {@code (v3[0], v3[1], v3[2])} to the product result and saves the
	 * result in the given extraction parameter object.
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
	 * {@code v1 * (v2[0], v2[1], v2[2]) + (v3[0], v3[1], v3[2])}
	 * 
	 * @param <T>
	 *     The type of the result vector.
	 * 
	 * @param v1
	 *     The first multiplicant vector.
	 * @param v2
	 *     The second multiplicant vector as an array with at least three entries.
	 * @param v3
	 *     The addend vector as an array with at least three entries.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T fma(Tup3RF v1, @MinLength(2) float[] v2, @MinLength(2) float[] v3, @ExtractionParam T res)
	{
		return fma(v1.v0(), v1.v1(), v1.v2(), v2[0], v2[1], v2[2], v3[0], v3[1], v3[2], res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1)} with the given vector {@code (v2[0], v2[1], v2[2])},
	 * adds the given vector {@code (v3x, v3y, v3z)} to the product result and saves the result in
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
	 * {@code v1 * (v2[0], v2[1], v2[2]) + (v3x, v3y, v3z)}
	 * 
	 * @param <T>
	 *     The type of the result vector.
	 * 
	 * @param v1
	 *     The first multiplicant vector.
	 * @param v2
	 *     The second multiplicant vector as an array with at least three entries.
	 * @param v3x
	 *     The value of the x component of the addend vector.
	 * @param v3y
	 *     The value of the y component of the addend vector.
	 * @param v3z
	 *     The value of the z component of the addend vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T fma(Tup3RF v1, @MinLength(3) float[] v2, float v3x, float v3y, float v3z, @ExtractionParam T res)
	{
		return fma(v1.v0(), v1.v1(), v1.v2(), v2[0], v2[1], v2[2], v3x, v3y, v3z, res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1)} with the given vector {@code (v2x, v2y, v2z)}, adds
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
	 * {@code v1 * (v2x, v2y, v2z) + v3}
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
	 * @param v2z
	 *     The value of the z component of the second multiplicant vector.
	 * @param v3
	 *     The addend vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T fma(Tup3RF v1, float v2x, float v2y, float v2z, Tup3RF v3, @ExtractionParam T res)
	{
		return fma(v1.v0(), v1.v1(), v1.v2(), v2x, v2y, v2z, v3.v0(), v3.v1(), v3.v2(), res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1)} with the given vector {@code (v2x, v2y, v2z)}, adds
	 * the given vector {@code (v3[0], v3[1], v3[2])} to the product result and saves the result in
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
	 * {@code v1 * (v2x, v2y, v2z) + (v3[0], v3[1], v3[2])}
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
	 * @param v2z
	 *     The value of the z component of the second multiplicant vector.
	 * @param v3
	 *     The addend vector as an array with at least three entries.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T fma(Tup3RF v1, float v2x, float v2y, float v2z, @MinLength(3) float[] v3, @ExtractionParam T res)
	{
		return fma(v1.v0(), v1.v1(), v1.v2(), v2x, v2y, v2z, v3[0], v3[1], v3[2], res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1)} with the given vector {@code (v2x, v2y, v2z)}, adds
	 * the given vector {@code (v3x, v3y, v3z)} to the product result and saves the result in the
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
	 * {@code v1 * (v2x, v2y, v2z) + (v3x, v3y v3z)}
	 * 
	 * @param <T>
	 *     The type of the result vector.
	 * 
	 * @param v1
	 *     The first multiplicant vector as an array with at least three entries.
	 * @param v2x
	 *     The value of the x component of the second multiplicant vector.
	 * @param v2y
	 *     The value of the y component of the second multiplicant vector.
	 * @param v2z
	 *     The value of the z component of the second multiplicant vector.
	 * @param v3x
	 *     The value of the x component of the addend vector.
	 * @param v3y
	 *     The value of the y component of the addend vector.
	 * @param v3z
	 *     The value of the z component of the addend vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T fma(Tup3RF v1, float v2x, float v2y, float v2z, float v3x, float v3y, float v3z, @ExtractionParam T res)
	{
		return fma(v1.v0(), v1.v1(), v1.v2(), v2x, v2y, v2z, v3x, v3y, v3z, res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1[0], v1[1], v1[2])} with the given vector {@code (v2)},
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
	 * {@code (v1[0], v1[1], v1[2]) * v2 + v3}
	 * 
	 * @param <T>
	 *     The type of the result vector.
	 * 
	 * @param v1
	 *     The first multiplicant vector as an array with at least three entries.
	 * @param v2
	 *     The second multiplicant vector.
	 * @param v3
	 *     The addend vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T fma(@MinLength(3) float[] v1, Tup3RF v2, Tup3RF v3, @ExtractionParam T res)
	{
		return fma(v1[0], v1[1], v1[2], v2.v0(), v2.v1(), v2.v2(), v3.v0(), v3.v1(), v3.v2(), res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1[0], v1[1], v1[2])} with the given vector {@code (v2)},
	 * adds the given vector {@code (v3[0], v3[1], v3[2])} to the product result and saves the
	 * result in the given extraction parameter object.
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
	 * {@code (v1[0], v1[1], v1[2]) * v2 + (v3[0], v3[1], v3[2])}
	 * 
	 * @param <T>
	 *     The type of the result vector.
	 * 
	 * @param v1
	 *     The first multiplicant vector as an array with at least three entries.
	 * @param v2
	 *     The second multiplicant vector.
	 * @param v3
	 *     The addend vector as an array with at least three entries.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T fma(@MinLength(3) float[] v1, Tup3RF v2, @MinLength(3) float[] v3, @ExtractionParam T res)
	{
		return fma(v1[0], v1[1], v1[2], v2.v0(), v2.v1(), v2.v2(), v3[0], v3[1], v3[2], res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1[0], v1[1], v1[2])} with the given vector {@code (v2)},
	 * adds the given vector {@code (v3x, v3y, v3z)} to the product result and saves the result in
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
	 * {@code (v1[0], v1[1], v1[2]) * v2 + (v3x, v3y, v3z)}
	 * 
	 * @param <T>
	 *     The type of the result vector.
	 * 
	 * @param v1
	 *     The first multiplicant vector as an array with at least three entries.
	 * @param v2
	 *     The second multiplicant vector.
	 * @param v3x
	 *     The value of the x component of the addend vector.
	 * @param v3y
	 *     The value of the y component of the addend vector.
	 * @param v3z
	 *     The value of the z component of the addend vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T fma(@MinLength(3) float[] v1, Tup3RF v2, float v3x, float v3y, float v3z, @ExtractionParam T res)
	{
		return fma(v1[0], v1[1], v1[2], v2.v0(), v2.v1(), v2.v2(), v3x, v3y, v3z, res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1[0], v1[1], v1[2])} with the given vector
	 * {@code (v2[0], v2[1], v2[2])}, adds the given vector {@code (v3)} to the product result and
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
	 * {@code (v1[0], v1[1], v1[2]) * (v2[0], v2[1], v2[2]) + v3}
	 * 
	 * @param <T>
	 *     The type of the result vector.
	 * 
	 * @param v1
	 *     The first multiplicant vector as an array with at least three entries.
	 * @param v2
	 *     The second multiplicant vector as an array with at least three entries.
	 * @param v3
	 *     The addend vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T fma(@MinLength(3) float[] v1, @MinLength(3) float[] v2, Tup3RF v3, @ExtractionParam T res)
	{
		return fma(v1[0], v1[1], v1[2], v2[0], v2[1], v2[2], v3.v0(), v3.v1(), v3.v2(), res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1[0], v1[1], v1[2])} with the given vector
	 * {@code (v2[0], v2[1], v2[2])}, adds the given vector {@code (v3[0], v3[1], v3[2])} to the
	 * product result and saves the result in the given extraction parameter object.
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
	 * {@code (v1[0], v1[1], v1[2]) * (v2[0], v2[1], v2[2]) + (v3[0], v3[1], v3[2])}
	 * 
	 * @param <T>
	 *     The type of the result vector.
	 * 
	 * @param v1
	 *     The first multiplicant vector as an array with at least three entries.
	 * @param v2
	 *     The second multiplicant vector as an array with at least three entries.
	 * @param v3
	 *     The addend vector as an array with at least three entries.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T fma(@MinLength(3) float[] v1, @MinLength(3) float[] v2, @MinLength(3) float[] v3, @ExtractionParam T res)
	{
		return fma(v1[0], v1[1], v1[2], v2[0], v2[1], v2[2], v3[0], v3[1], v3[2], res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1[0], v1[1], v1[2])} with the given vector
	 * {@code (v2[0], v2[1], v2[2])}, adds the given vector {@code (v3x, v3y, v3z)} to the product
	 * result and saves the result in the given extraction parameter object.
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
	 * {@code (v1[0], v1[1], v1[2]) * (v2[0], v2[1], v2[2]) + (v3x, v3y, v3z)}
	 * 
	 * @param <T>
	 *     The type of the result vector.
	 * 
	 * @param v1
	 *     The first multiplicant vector as an array with at least three entries.
	 * @param v2
	 *     The second multiplicant vector as an array with at least three entries.
	 * @param v3x
	 *     The value of the x component of the addend vector.
	 * @param v3y
	 *     The value of the y component of the addend vector.
	 * @param v3z
	 *     The value of the z component of the addend vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T fma(@MinLength(3) float[] v1, @MinLength(3) float[] v2, float v3x, float v3y, float v3z, @ExtractionParam T res)
	{
		return fma(v1[0], v1[1], v1[2], v2[0], v2[1], v2[2], v3x, v3y, v3z, res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1[0], v1[1], v1[2])} with the given vector
	 * {@code (v2x, v2y, v2z)}, adds the given vector {@code (v3)} to the product result and saves
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
	 * {@code (v1[0], v1[1], v1[2]) * (v2x, v2y, v2z) + v3}
	 * 
	 * @param <T>
	 *     The type of the result vector.
	 * 
	 * @param v1
	 *     The first multiplicant vector as an array with at least three entries.
	 * @param v2x
	 *     The value of the x component of the second multiplicant vector.
	 * @param v2y
	 *     The value of the y component of the second multiplicant vector.
	 * @param v2z
	 *     The value of the z component of the second multiplicant vector.
	 * @param v3
	 *     The addend vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T fma(@MinLength(3) float[] v1, float v2x, float v2y, float v2z, Tup3RF v3, @ExtractionParam T res)
	{
		return fma(v1[0], v1[1], v1[2], v2x, v2y, v2z, v3.v0(), v3.v1(), v3.v2(), res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1[0], v1[1], v1[2])} with the given vector
	 * {@code (v2x, v2y, v2z)}, adds the given vector {@code (v3[0], v3[1], v3[2])} to the product
	 * result and saves the result in the given extraction parameter object.
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
	 * {@code (v1[0], v1[1], v1[2]) * (v2x, v2y) + (v3[0], v3[1], v3[2])}
	 * 
	 * @param <T>
	 *     The type of the result vector.
	 * 
	 * @param v1
	 *     The first multiplicant vector as an array with at least three entries.
	 * @param v2x
	 *     The value of the x component of the second multiplicant vector.
	 * @param v2y
	 *     The value of the y component of the second multiplicant vector.
	 * @param v2z
	 *     The value of the z component of the second multiplicant vector.
	 * @param v3
	 *     The addend vector as an array with at least three entries.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T fma(@MinLength(3) float[] v1, float v2x, float v2y, float v2z, @MinLength(3) float[] v3, @ExtractionParam T res)
	{
		return fma(v1[0], v1[1], v1[2], v2x, v2y, v2z, v3[0], v3[1], v3[2], res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1[0], v1[1], v1[2])} with the given vector
	 * {@code (v2x, v2y, v2z)}, adds the given vector {@code (v3x, v3y, v3z)} to the product result
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
	 * {@code (v1[0], v1[1], v1[2]) * (v2x, v2y, v2z) + (v3x, v3y, v3z)}
	 * 
	 * @param <T>
	 *     The type of the result vector.
	 * 
	 * @param v1
	 *     The first multiplicant vector as an array with at least three entries.
	 * @param v2x
	 *     The value of the x component of the second multiplicant vector.
	 * @param v2y
	 *     The value of the y component of the second multiplicant vector.
	 * @param v2z
	 *     The value of the z component of the second multiplicant vector.
	 * @param v3x
	 *     The value of the x component of the addend vector.
	 * @param v3y
	 *     The value of the y component of the addend vector.
	 * @param v3z
	 *     The value of the z component of the addend vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T fma(@MinLength(3) float[] v1, float v2x, float v2y, float v2z, float v3x, float v3y, float v3z, @ExtractionParam T res)
	{
		return fma(v1[0], v1[1], v1[2], v2x, v2y, v2z, v3x, v3y, v3z, res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1x, v1y, v1z)} with the given vector {@code (v2)}, adds
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
	 * {@code (v1x, v1y, v1z) * v2 + v3}
	 * 
	 * @param <T>
	 *     The type of the result vector.
	 * 
	 * @param v1x
	 *     The value of the x component of the first multiplicant vector.
	 * @param v1y
	 *     The value of the y component of the first multiplicant vector.
	 * @param v1z
	 *     The value of the z component of the first multiplicant vector.
	 * @param v2
	 *     The second multiplicant vector.
	 * @param v3
	 *     The addend vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T fma(float v1x, float v1y, float v1z, Tup3RF v2, Tup3RF v3, @ExtractionParam T res)
	{
		return fma(v1x, v1y, v1z, v2.v0(), v2.v1(), v2.v2(), v3.v0(), v3.v1(), v3.v2(), res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1x, v1y, v1z)} with the given vector {@code (v2)}, adds
	 * the given vector {@code (v3[0], v3[1], v3[2])} to the product result and saves the result in
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
	 * {@code (v1x, v1y, v1z) * v2 + (v3[0], v3[1], v3[2])}
	 * 
	 * @param <T>
	 *     The type of the result vector.
	 * 
	 * @param v1x
	 *     The value of the x component of the first multiplicant vector.
	 * @param v1y
	 *     The value of the y component of the first multiplicant vector.
	 * @param v1z
	 *     The value of the z component of the first multiplicant vector.
	 * @param v2
	 *     The second multiplicant vector.
	 * @param v3
	 *     The addend vector as an array with at least three entries.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T fma(float v1x, float v1y, float v1z, Tup3RF v2, @MinLength(3) float[] v3, @ExtractionParam T res)
	{
		return fma(v1x, v1y, v1z, v2.v0(), v2.v1(), v2.v2(), v3[0], v3[1], v3[2], res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1x, v1y, v1z)} with the given vector {@code (v2)}, adds
	 * the given vector {@code (v3x, v3y, v3z)} to the product result and saves the result in the
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
	 * {@code (v1x, v1y, v1z) * v2 + (v3x, v3y, v3z)}
	 * 
	 * @param <T>
	 *     The type of the result vector.
	 * 
	 * @param v1x
	 *     The value of the x component of the first multiplicant vector.
	 * @param v1y
	 *     The value of the y component of the first multiplicant vector.
	 * @param v1z
	 *     The value of the z component of the first multiplicant vector.
	 * @param v2
	 *     The second multiplicant vector.
	 * @param v3x
	 *     The value of the x component of the addend vector.
	 * @param v3y
	 *     The value of the y component of the addend vector.
	 * @param v3z
	 *     The value of the z component of the addend vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T fma(float v1x, float v1y, float v1z, Tup3RF v2, float v3x, float v3y, float v3z, @ExtractionParam T res)
	{
		return fma(v1x, v1y, v1z, v2.v0(), v2.v1(), v2.v2(), v3x, v3y, v3z, res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1x, v1y, v1z)} with the given vector
	 * {@code (v2[0], v2[1], v2[2])}, adds the given vector {@code (v3)} to the product result and
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
	 * {@code (v1x, v1y, v1z) * (v2[0], v2[1], v2[2]) + v3}
	 * 
	 * @param <T>
	 *     The type of the result vector.
	 * 
	 * @param v1x
	 *     The value of the x component of the first multiplicant vector.
	 * @param v1y
	 *     The value of the y component of the first multiplicant vector.
	 * @param v1z
	 *     The value of the z component of the first multiplicant vector.
	 * @param v2
	 *     The second multiplicant vector as an array with at least three entries.
	 * @param v3
	 *     The addend vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T fma(float v1x, float v1y, float v1z, @MinLength(3) float[] v2, Tup3RF v3, @ExtractionParam T res)
	{
		return fma(v1x, v1y, v1z, v2[0], v2[1], v2[2], v3.v0(), v3.v1(), v3.v2(), res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1x, v1y, v1z)} with the given vector
	 * {@code (v2[0], v2[1], v2[2])}, adds the given vector {@code (v3[0], v3[1], v3[2])} to the
	 * product result and saves the result in the given extraction parameter object.
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
	 * {@code (v1x, v1y, v1z) * (v2[0], v2[1], v2[2]) + (v3[0], v3[1], v3[2])}
	 * 
	 * @param <T>
	 *     The type of the result vector.
	 * 
	 * @param v1x
	 *     The value of the x component of the first multiplicant vector.
	 * @param v1y
	 *     The value of the y component of the first multiplicant vector.
	 * @param v1z
	 *     The value of the z component of the first multiplicant vector.
	 * @param v2
	 *     The second multiplicant vector as an array with at least three entries.
	 * @param v3
	 *     The addend vector as an array with at least three entries.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T fma(float v1x, float v1y, float v1z, @MinLength(3) float[] v2, @MinLength(3) float[] v3, @ExtractionParam T res)
	{
		return fma(v1x, v1y, v1z, v2[0], v2[1], v2[2], v3[0], v3[1], v3[2], res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1x, v1y, v1z)} with the given vector
	 * {@code (v2[0], v2[1], v2[2])}, adds the given vector {@code (v3x, v3y, v3z)} to the product
	 * result and saves the result in the given extraction parameter object.
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
	 * {@code (v1x, v1y, v1z) * (v2[0], v2[1], v2[2]) + (v3x, v3y, v3z)}
	 * 
	 * @param <T>
	 *     The type of the result vector.
	 * 
	 * @param v1x
	 *     The value of the x component of the first multiplicant vector.
	 * @param v1y
	 *     The value of the y component of the first multiplicant vector.
	 * @param v1z
	 *     The value of the z component of the first multiplicant vector.
	 * @param v2
	 *     The second multiplicant vector as an array with at least three entries.
	 * @param v3x
	 *     The value of the x component of the addend vector.
	 * @param v3y
	 *     The value of the y component of the addend vector.
	 * @param v3z
	 *     The value of the z component of the addend vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T fma(float v1x, float v1y, float v1z, @MinLength(3) float[] v2, float v3x, float v3y, float v3z, @ExtractionParam T res)
	{
		return fma(v1x, v1y, v1z, v2[0], v2[1], v2[2], v3x, v3y, v3z, res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1x, v1y, v1z)} with the given vector
	 * {@code (v2x, v2y, v2z)}, adds the given vector {@code (v3)} to the product result and saves
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
	 * {@code (v1x, v1y, v1z) * (v2x, v2y, v2z) + v3}
	 * 
	 * @param <T>
	 *     The type of the result vector.
	 * 
	 * @param v1x
	 *     The value of the x component of the first multiplicant vector.
	 * @param v1y
	 *     The value of the y component of the first multiplicant vector.
	 * @param v1z
	 *     The value of the z component of the first multiplicant vector.
	 * @param v2x
	 *     The value of the x component of the second multiplicant vector.
	 * @param v2y
	 *     The value of the y component of the second multiplicant vector.
	 * @param v2z
	 *     The value of the z component of the second multiplicant vector.
	 * @param v3
	 *     The addend vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T fma(float v1x, float v1y, float v1z, float v2x, float v2y, float v2z, Tup3RF v3, @ExtractionParam T res)
	{
		return fma(v1x, v1y, v1z, v2x, v2y, v2z, v3.v0(), v3.v1(), v3.v2(), res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1x, v1y, v1z)} with the given vector
	 * {@code (v2x, v2y, v2z)}, adds the given vector {@code (v3[0], v3[1], v3[2])} to the product
	 * result and saves the result in the given extraction parameter object.
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
	 * {@code (v1x, v1y, v1z) * (v2x, v2y, v2z) + (v3[0], v3[1], v3[2])}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter.
	 * 
	 * @param v1x
	 *     The value of the x component of the first multiplicant vector.
	 * @param v1y
	 *     The value of the y component of the first multiplicant vector.
	 * @param v1z
	 *     The value of the z component of the first multiplicant vector.
	 * @param v2x
	 *     The value of the x component of the second multiplicant vector.
	 * @param v2y
	 *     The value of the y component of the second multiplicant vector.
	 * @param v2z
	 *     The value of the z component of the second multiplicant vector.
	 * @param v3
	 *     The addend vector as an array with at least three entries.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T fma(float v1x, float v1y, float v1z, float v2x, float v2y, float v2z, @MinLength(3) float[] v3, @ExtractionParam T res)
	{
		return fma(v1x, v1y, v1z, v2x, v2y, v2z, v3[0], v3[1], v3[2], res);
	}
	
	/**
	 * Multiplies the given vector {@code (v1x, v1y, v1z)} with the given vector
	 * {@code (v2x, v2y, v2z)}, adds the given vector {@code (v3x, v3y, v3z)} to the product result
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
	 * {@code (v1x, v1y, v1z) * (v2x, v2y, v2z) + (v3x, v3y, v3z)}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter.
	 * 
	 * @param v1x
	 *     The value of the x component of the first multiplicant vector.
	 * @param v1y
	 *     The value of the y component of the first multiplicant vector.
	 * @param v1z
	 *     The value of the z component of the first multiplicant vector.
	 * @param v2x
	 *     The value of the x component of the second multiplicant vector.
	 * @param v2y
	 *     The value of the y component of the second multiplicant vector.
	 * @param v2z
	 *     The value of the z component of the second multiplicant vector.
	 * @param v3x
	 *     The value of the x component of the addend vector.
	 * @param v3y
	 *     The value of the y component of the addend vector.
	 * @param v3z
	 *     The value of the z component of the addend vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T fma(float v1x, float v1y, float v1z, float v2x, float v2y, float v2z, float v3x, float v3y, float v3z, @ExtractionParam T res)
	{
		res.set(BarghosMath.fma(v1x, v2x, v3x), BarghosMath.fma(v1y, v2y, v3y), BarghosMath.fma(v1z, v2z, v3z));
		
		return res;
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
	public static float inverseLength(Tup3RF v)
	{
		return inverseLength(v.v0(), v.v1(), v.v2());
	}
	
	/**
	 * Returns the inverse (reciprocal) length (magnitude, norm) of the vector
	 * {@code (v[0], v[1], v[2])}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code 1 / |(v[0], v[1], v[2])|}
	 * 
	 * @param v
	 *     The vector as an array with at least two entries.
	 * 
	 * @return The reciprocal length of the vector.
	 */
	public static float inverseLength(@MinLength(3) float[] v)
	{
		return inverseLength(v[0], v[1], v[2]);
	}
	
	/**
	 * Returns the inverse (reciprocal) length (magnitude, norm) of the vector {@code (x, y, z)}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code 1 / |(x, y, z)|}
	 * 
	 * @param x
	 *     The value of the x component of the vector.
	 * @param y
	 *     The value of the y component of the vector.
	 * @param z
	 *     The value of the z component of the vector.
	 * 
	 * @return The reciprocal length of the vector.
	 */
	public static float inverseLength(float x, float y, float z)
	{
		return BarghosMath.invSqrt(squaredLength(x, y, z));
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
	public static float length(Tup3RF v)
	{
		return length(v.v0(), v.v1(), v.v2());
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
	public static float length(Tup3RF v, @FloatMinValue(0.0f) float tolerance)
	{
		return length(v.v0(), v.v1(), v.v2(), tolerance);
	}
	
	/**
	 * Returns the length (magnitude, norm) of the vector {@code (v[0], v[1], v[2])}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(v[0], v[1], v[2])|}
	 * 
	 * @param v
	 *     The vector as an array with at least two entries.
	 * 
	 * @return The length of the vector.
	 */
	public static float length(@MinLength(3) float[] v)
	{
		return length(v[0], v[1], v[2]);
	}
	
	/**
	 * Returns the length (magnitude, norm) of the vector {@code (v[0], v[1], v[2])}. If the values
	 * of all components are within the margin defined by {@code (-tolerance <= value <= tolerance)}
	 * the result will be zero.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(v[0], v[1], v[2])|}
	 * 
	 * @param v
	 *     The vector as an array with at least two entries.
	 * @param tolerance
	 *     The tolerance for defining the margin around zero. Must be positive.
	 * 
	 * @return The length of the vector.
	 */
	public static float length(@MinLength(3) float[] v, @FloatMinValue(0.0f) float tolerance)
	{
		return length(v[0], v[1], v[2], tolerance);
	}
	
	/**
	 * Returns the length (magnitude, norm) of the vector {@code (x, y, z)}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(x, y, z)|}
	 * 
	 * @param x
	 *     The value of the x component of the vector.
	 * @param y
	 *     The value of the y component of the vector.
	 * @param z
	 *     The value of the z component of the vector.
	 * 
	 * @return The length of the vector.
	 */
	public static float length(float x, float y, float z)
	{
		if (x == 0.0f && y == 0.0f && z == 0.0f) return 0.0f;
		
		return BarghosMath.sqrt(squaredLength(x, y, z));
	}
	
	/**
	 * Returns the length (magnitude, norm) of the vector {@code (x, y, z)}. If the values of all
	 * components are within the margin defined by {@code (-tolerance <= value <= tolerance)} the
	 * result will be zero.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(x, y, z)|}
	 * 
	 * @param x
	 *     The value of the x component of the vector.
	 * @param y
	 *     The value of the y component of the vector.
	 * @param z
	 *     The value of the z component of the vector.
	 * @param tolerance
	 *     The tolerance for defining the margin around zero. Must be positive.
	 * 
	 * @return The length of the vector.
	 */
	public static float length(float x, float y, float z, @FloatMinValue(0.0f) float tolerance)
	{
		if (Math.abs(x) <= tolerance && Math.abs(y) <= tolerance && Math.abs(z) <= tolerance) return 0.0f;
		
		return BarghosMath.sqrt(squaredLength(x, y, z));
	}

	
	/**
	 * Returns the squared length (magnitude, norm) of the vector {@code (v)}. It doesn't account
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
	public static float squaredLength(Tup3RF v)
	{
		return squaredLength(v.v0(), v.v1(), v.v2());
	}
	
	/**
	 * Returns the squared length (magnitude, norm) of the vector {@code (v[0], v[1], v2[2])}. It
	 * doesn't account for zero-length vectors.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(v[0], v[1], v2[2])|²}
	 * 
	 * @param v
	 *     The vector as an array with at least three entries.
	 * 
	 * @return The squared length of the vector.
	 */
	public static float squaredLength(@MinLength(3) float[] v)
	{
		return squaredLength(v[0], v[1], v[2]);
	}
	
	/**
	 * Returns the squared length (magnitude, norm) of the vector {@code (x, y, z)}. It doesn't
	 * account for zero-length vectors.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(x, y, z)|²}
	 * 
	 * @param x
	 *     The value of the x component of the vector.
	 * @param y
	 *     The value of the y component of the vector.
	 * @param z
	 *     The value of the z component of the vector.
	 * 
	 * @return The squared length of the vector.
	 */
	public static float squaredLength(float x, float y, float z)
	{
		return x * x + y * y + z * z;
	}
	
	/**
	 * Determines the smallest value of the components of the vector {@code (v)} and saves the value
	 * and the component index in the extraction parameter object. If two or more components have
	 * the same value the first index will be returned.
	 * 
	 * <p>
	 * The index returned is limited to the range of {@code 0-2}.
	 * 
	 * @param v
	 *     The vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static FloatIndexValuePair min(Tup3RF v, @ExtractionParam FloatIndexValuePair res)
	{
		return min(v.v0(), v.v1(), v.v2(), res);
	}
	
	/**
	 * Determines the smallest value of the components of the vector {@code (v[0], v[1], v[2])} and
	 * saves the value and the component index in the extraction parameter object. If two or more
	 * components have the same value the first index will be returned.
	 * 
	 * <p>
	 * The index returned is limited to the range of {@code 0-2}.
	 * 
	 * @param v
	 *     The vector as an array with at least three entries.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static FloatIndexValuePair min(@MinLength(3) float[] v, @ExtractionParam FloatIndexValuePair res)
	{
		return min(v[0], v[1], v[2], res);
	}
	
	/**
	 * Determines the smallest value of the components of the vector {@code (x, y, z)} and saves the
	 * value and the component index in the extraction parameter object. If two or more components
	 * have the same value the first index will be returned.
	 * 
	 * <p>
	 * The index returned is limited to the range of {@code 0-2}.
	 * 
	 * @param x
	 *     The value of the x component of the vector.
	 * @param y
	 *     The value of the y component of the vector.
	 * @param z
	 *     The value of the z component of the vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static FloatIndexValuePair min(float x, float y, float z, @ExtractionParam FloatIndexValuePair res)
	{
		float value = x;
		int index = 0;
		
		if (y < value)
		{
			value = y;
			index = 1;
		}
		
		if (z < value)
		{
			value = z;
			index = 2;
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
	public static float minValue(Tup3RF v)
	{
		return minValue(v.v0(), v.v1(), v.v2());
	}
	
	/**
	 * Determines the smallest value of the components of the vector {@code (v[0], v[1], v[2])} and
	 * returns it.
	 * 
	 * @param v
	 *     The vector as an array with at least three entries.
	 * 
	 * @return The smallest value of the components.
	 */
	public static float minValue(@MinLength(3) float[] v)
	{
		return minValue(v[0], v[1], v[2]);
	}
	
	/**
	 * Determines the smallest value of the components of the vector {@code (x, y, z)} and returns
	 * it.
	 * 
	 * @param x
	 *     The value of the x component of the vector.
	 * @param y
	 *     The value of the y component of the vector.
	 * @param z
	 *     The value of the z component of the vector.
	 * 
	 * @return The smallest value of the components.
	 */
	public static float minValue(float x, float y, float z)
	{
		return Math.min(x, Math.min(y, z));
	}
	
	/**
	 * Determines the smallest value of the components of the vector {@code (v)} and returns the
	 * index of the component. If two or more components have the same value the first index will be
	 * returned.
	 * 
	 * <p>
	 * The index returned is limited to the range of {@code 0-2}.
	 * 
	 * @param v
	 *     The vector.
	 * 
	 * @return The index of the smallest component.
	 */
	public static int minComponent(Tup3RF v)
	{
		return minComponent(v.v0(), v.v1(), v.v2());
	}
	
	/**
	 * Determines the smallest value of the components of the vector {@code (v[0], v[1], v[2])} and
	 * returns the index of the component. If two or more components have the same value the first
	 * index will be returned.
	 * 
	 * <p>
	 * The index returned is limited to the range of {@code 0-2}.
	 * 
	 * @param v
	 *     The vector as an array with at least two entries.
	 * 
	 * @return The index of the smallest component.
	 */
	public static int minComponent(@MinLength(3) float[] v)
	{
		return minComponent(v[0], v[1], v[2]);
	}
	
	/**
	 * Determines the smallest value of the components of the vector {@code (x, y, z)} and returns
	 * the index of the component. If two or more components have the same value the first index
	 * will be returned.
	 * 
	 * <p>
	 * The index returned is limited to the range of {@code 0-2}.
	 * 
	 * @param x
	 *     The value of the x component of the vector.
	 * @param y
	 *     The value of the y component of the vector.
	 * @param z
	 *     The value of the z component of the vector.
	 * 
	 * @return The index of the smallest component.
	 */
	public static int minComponent(float x, float y, float z)
	{
		float value = x;
		int index = 0;
		
		if (y < value)
		{
			value = y;
			index = 1;
		}
		
		if (z < value)
		{
			value = z;
			index = 2;
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
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] minVector(Tup3RF v1, Tup3RF v2, @ExtractionParam @MinLength(3) float[] res)
	{
		return minVector(v1.v0(), v1.v1(), v1.v2(), v2.v0(), v2.v1(), v2.v2(), res);
	}
	
	/**
	 * Determines the component wise smallest value of the vector {@code (v1)} and the vector
	 * {@code (v2[0], v2[1], v2[2])} and saves the result in the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code min(v1, (v2[0], v2[1], v2[2]))}
	 * 
	 * @param v1
	 *     The first vector.
	 * @param v2
	 *     The second vector as an array with at least three entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] minVector(Tup3RF v1, @MinLength(3) float[] v2, @ExtractionParam @MinLength(3) float[] res)
	{
		return minVector(v1.v0(), v1.v1(), v1.v2(), v2[0], v2[1], v2[2], res);
	}
	
	/**
	 * Determines the component wise smallest value of the vector {@code (v1)} and the vector
	 * {@code (v2x, v2y, v2z)} and saves the result in the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code min(v1, (v2x, v2y, v2z))}
	 * 
	 * @param v1
	 *     The first vector.
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * @param v2z
	 *     The value of the z component of the second vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] minVector(Tup3RF v1, float v2x, float v2y, float v2z, @ExtractionParam @MinLength(3) float[] res)
	{
		return minVector(v1.v0(), v1.v1(), v1.v2(), v2x, v2y, v2z, res);
	}
	
	/**
	 * Determines the component wise smallest value of the vector {@code (v1[0], v1[1], v1[2])} and
	 * the vector {@code (v2)} and saves the result in the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code min((v1[0], v1[1], v1[2]), v2)}
	 * 
	 * @param v1
	 *     The first vector as an array with at least three entries.
	 * @param v2
	 *     The second vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] minVector(@MinLength(3) float[] v1, Tup3RF v2, @ExtractionParam @MinLength(2) float[] res)
	{
		return minVector(v1[0], v1[1], v1[2], v2.v0(), v2.v1(), v2.v2(), res);
	}
	
	/**
	 * Determines the component wise smallest value of the vector {@code (v1[0], v1[1], v1[2])} and
	 * the vector {@code (v2[0], v2[1], v2[2])} and saves the result in the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code min((v1[0], v1[1], v1[2]), (v2[0], v2[1], v2[2]))}
	 * 
	 * @param v1
	 *     The first vector as an array with at least three entries.
	 * @param v2
	 *     The second vector as an array with at least three entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] minVector(@MinLength(3) float[] v1, @MinLength(3) float[] v2, @ExtractionParam @MinLength(3) float[] res)
	{
		return minVector(v1[0], v1[1], v1[2], v2[0], v2[1], v2[2], res);
	}
	
	/**
	 * Determines the component wise smallest value of the vector {@code (v1[0], v1[1], v1[2])} and
	 * the vector {@code (v2x, v2y, v2z)} and saves the result in the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code min((v1[0], v1[1], v1[2]), (v2x, v2y, v2z))}
	 * 
	 * @param v1
	 *     The first vector as an array with at least three entries.
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * @param v2z
	 *     The value of the z component of the second vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] minVector(@MinLength(3) float[] v1, float v2x, float v2y, float v2z, @ExtractionParam @MinLength(3) float[] res)
	{
		return minVector(v1[0], v1[1], v1[2], v2x, v2y, v2z, res);
	}
	
	/**
	 * Determines the component wise smallest value of the vector {@code (v1x, v1y, v1z)} and the
	 * vector {@code (v2)} and saves the result in the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code min((v1x, v1y, v1z), v2)}
	 * 
	 * @param v1x
	 *     The value of the x component of the first vector.
	 * @param v1y
	 *     The value of the y component of the first vector.
	 * @param v1z
	 *     The value of the z component of the first vector.
	 * @param v2
	 *     The second vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] minVector(float v1x, float v1y, float v1z, Tup3RF v2, @ExtractionParam @MinLength(3) float[] res)
	{
		return minVector(v1x, v1y, v1z, v2.v0(), v2.v1(), v2.v2(), res);
	}
	
	/**
	 * Determines the component wise smallest value of the vector {@code (v1x, v1y, v1z)} and the
	 * vector {@code (v2[0], v2[1], v2[2])} and saves the result in the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code min((v1x, v1y, v1z), (v2[0], v2[1], v2[2]))}
	 * 
	 * @param v1x
	 *     The value of the x component of the first vector.
	 * @param v1y
	 *     The value of the y component of the first vector.
	 * @param v1z
	 *     The value of the z component of the first vector.
	 * @param v2
	 *     The second vector as an array with at least three entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] minVector(float v1x, float v1y, float v1z, @MinLength(3) float[] v2, @ExtractionParam @MinLength(3) float[] res)
	{
		return minVector(v1x, v1y, v1z, v2[0], v2[1], v2[2], res);
	}
	
	/**
	 * Determines the component wise smallest value of the vector {@code (v1x, v1y, v1z)} and the
	 * vector {@code (v2x, v2y, v2z)} and saves the result in the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code min((v1x, v1y, v1z), (v2x, v2y, v2z))}
	 * 
	 * @param v1x
	 *     The value of the x component of the first vector.
	 * @param v1y
	 *     The value of the y component of the first vector.
	 * @param v1z
	 *     The value of the z component of the first vector.
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * @param v2z
	 *     The value of the z component of the second vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] minVector(float v1x, float v1y, float v1z, float v2x, float v2y, float v2z, @ExtractionParam @MinLength(3) float[] res)
	{
		res[0] = Math.min(v1x, v2x);
		res[1] = Math.min(v1y, v2y);
		res[2] = Math.min(v1z, v2z);
		
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
	public static <T extends Tup3WF> T minVector(Tup3RF v1, Tup3RF v2, @ExtractionParam T res)
	{
		return minVector(v1.v0(), v1.v1(), v1.v2(), v2.v0(), v2.v1(), v2.v2(), res);
	}
	
	/**
	 * Determines the component wise smallest value of the vector {@code (v1)} and the vector
	 * {@code (v2[0], v2[1], v2[2])} and saves the result in the extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code min(v1, (v2[0], v2[1], v2[2]))}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1
	 *     The first vector.
	 * @param v2
	 *     The second vector as an array with at least three entries.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T minVector(Tup3RF v1, @MinLength(3) float[] v2, @ExtractionParam T res)
	{
		return minVector(v1.v0(), v1.v1(), v1.v2(), v2[0], v2[1], v2[2], res);
	}
	
	/**
	 * Determines the component wise smallest value of the vector {@code (v1)} and the vector
	 * {@code (v2x, v2y, v2z)} and saves the result in the extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code min(v1, (v2x, v2y, v2z))}
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
	 * @param v2z
	 *     The value of the z component of the second vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T minVector(Tup3RF v1, float v2x, float v2y, float v2z, @ExtractionParam T res)
	{
		return minVector(v1.v0(), v1.v1(), v1.v2(), v2x, v2y, v2z, res);
	}
	
	/**
	 * Determines the component wise smallest value of the vector {@code (v1[0], v1[1], v1[2])} and
	 * the vector {@code (v2)} and saves the result in the extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code min((v1[0], v1[1], v1[2]), v2)}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1
	 *     The first vector as an array with at least three entries.
	 * @param v2
	 *     The second vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T minVector(@MinLength(3) float[] v1, Tup3RF v2, @ExtractionParam T res)
	{
		return minVector(v1[0], v1[1], v1[2], v2.v0(), v2.v1(), v2.v2(), res);
	}
	
	/**
	 * Determines the component wise smallest value of the vector {@code (v1[0], v1[1], v1[2])} and
	 * the vector {@code (v2[0], v2[1], v2[2])} and saves the result in the extraction parameter
	 * object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code min((v1[0], v1[1], v1[2]), (v2[0], v2[1], v2[2]))}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1
	 *     The first vector as an array with at least three entries.
	 * @param v2
	 *     The second vector as an array with at least three entries.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T minVector(@MinLength(3) float[] v1, @MinLength(3) float[] v2, @ExtractionParam T res)
	{
		return minVector(v1[0], v1[1], v1[2], v2[0], v2[1], v2[2], res);
	}
	
	/**
	 * Determines the component wise smallest value of the vector {@code (v1[0], v1[1], v1[2])} and
	 * the vector {@code (v2x, v2y, v2z)} and saves the result in the extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code min((v1[0], v1[1], v1[2]), (v2x, v2y, v2z))}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1
	 *     The first vector as an array with at least three entries.
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * @param v2z
	 *     The value of the z component of the second vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T minVector(@MinLength(3) float[] v1, float v2x, float v2y, float v2z, @ExtractionParam T res)
	{
		return minVector(v1[0], v1[1], v1[2], v2x, v2y, v2z, res);
	}
	
	/**
	 * Determines the component wise smallest value of the vector {@code (v1x, v1y, v1z)} and the
	 * vector {@code (v2)} and saves the result in the extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code min((v1x, v1y, v1z), v2)}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1x
	 *     The value of the x component of the first vector.
	 * @param v1y
	 *     The value of the y component of the first vector.
	 * @param v1z
	 *     The value of the z component of the first vector.
	 * @param v2
	 *     The second vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T minVector(float v1x, float v1y, float v1z, Tup3RF v2, @ExtractionParam T res)
	{
		return minVector(v1x, v1y, v1z, v2.v0(), v2.v1(), v2.v2(), res);
	}
	
	/**
	 * Determines the component wise smallest value of the vector {@code (v1x, v1y, v1z)} and the
	 * vector {@code (v2[0], v2[1], v2[2])} and saves the result in the extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code min((v1x, v1y, v1z), (v2[0], v2[1], v2[2]))}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1x
	 *     The value of the x component of the first vector.
	 * @param v1y
	 *     The value of the y component of the first vector.
	 * @param v1z
	 *     The value of the z component of the first vector.
	 * @param v2
	 *     The second vector as an array with at least three entries.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T minVector(float v1x, float v1y, float v1z, @MinLength(3) float[] v2, @ExtractionParam T res)
	{
		return minVector(v1x, v1y, v1z, v2[0], v2[1], v2[2], res);
	}
	
	/**
	 * Determines the component wise smallest value of the vector {@code (v1x, v1y, v1z)} and the
	 * vector {@code (v2x, v2y, v2z)} and saves the result in the extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code min((v1x, v1y, v1z), (v2x, v2y, v2z))}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1x
	 *     The value of the x component of the first vector.
	 * @param v1y
	 *     The value of the y component of the first vector.
	 * @param v1z
	 *     The value of the z component of the first vector.
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * @param v2z
	 *     The value of the z component of the second vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T minVector(float v1x, float v1y, float v1z, float v2x, float v2y, float v2z, @ExtractionParam T res)
	{
		res.set(Math.min(v1x, v2x), Math.min(v1y, v2y), Math.min(v1z, v2z));
		
		return res;
	}
	
	/**
	 * Determines the greatest value of the components of the vector {@code (v)} and saves the value
	 * and the component index in the extraction parameter object. If two or more components have
	 * the same value the first index will be returned.
	 * 
	 * <p>
	 * The index returned is limited to the range of {@code 0-2}.
	 * 
	 * @param v
	 *     The vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static FloatIndexValuePair max(Tup3RF v, @ExtractionParam FloatIndexValuePair res)
	{
		return max(v.v0(), v.v1(), v.v2(), res);
	}
	
	/**
	 * Determines the greatest value of the components of the vector {@code (v[0], v[1], v[2])} and
	 * saves the value and the component index in the extraction parameter object. If two or more
	 * components have the same value the first index will be returned.
	 * 
	 * <p>
	 * The index returned is limited to the range of {@code 0-2}.
	 * 
	 * @param v
	 *     The vector as an array with at least three entries.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static FloatIndexValuePair max(@MinLength(3) float[] v, @ExtractionParam FloatIndexValuePair res)
	{
		return max(v[0], v[1], v[2], res);
	}
	
	/**
	 * Determines the greatest value of the components of the vector {@code (x, y, z)} and saves the
	 * value and the component index in the extraction parameter object. If two or more components
	 * have the same value the first index will be returned.
	 * 
	 * <p>
	 * The index returned is limited to the range of {@code 0-2}.
	 * 
	 * @param x
	 *     The value of the x component of the vector.
	 * @param y
	 *     The value of the y component of the vector.
	 * @param z
	 *     The value of the z component of the vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static FloatIndexValuePair max(float x, float y, float z, @ExtractionParam FloatIndexValuePair res)
	{
		float value = x;
		int index = 0;
		
		if (y > value)
		{
			value = y;
			index = 1;
		}
		
		if (z > value)
		{
			value = z;
			index = 2;
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
	public static float maxValue(Tup3RF v)
	{
		return maxValue(v.v0(), v.v1(), v.v2());
	}
	
	/**
	 * Determines the greatest value of the components of the vector {@code (v[0], v[1], v[2])} and
	 * returns it.
	 * 
	 * @param v
	 *     The vector as an array with at least three entries.
	 * 
	 * @return The greatest value of the components.
	 */
	public static float maxValue(@MinLength(3) float[] v)
	{
		return maxValue(v[0], v[1], v[2]);
	}
	
	/**
	 * Determines the greatest value of the components of the vector {@code (x, y, z)} and returns
	 * it.
	 * 
	 * @param x
	 *     The value of the x component of the vector.
	 * @param y
	 *     The value of the y component of the vector.
	 * @param z
	 *     The value of the z component of the vector.
	 * 
	 * @return The greatest value of the components.
	 */
	public static float maxValue(float x, float y, float z)
	{
		return Math.max(x, Math.max(y, z));
	}
	
	/**
	 * Determines the greatest value of the components of the vector {@code (v)} and returns the
	 * index of the component. If two or more components have the same value the first index will be
	 * returned.
	 * 
	 * <p>
	 * The index returned is limited to the range of {@code 0-2}.
	 * 
	 * @param v
	 *     The vector.
	 * 
	 * @return The index of the greatest component.
	 */
	public static int maxComponent(Tup3RF v)
	{
		return maxComponent(v.v0(), v.v1(), v.v2());
	}
	
	/**
	 * Determines the greatest value of the components of the vector {@code (v[0], v[1], v[2])} and
	 * returns the index of the component. If two or more components have the same value the first
	 * index will be returned.
	 * 
	 * <p>
	 * The index returned is limited to the range of {@code 0-2}.
	 * 
	 * @param v
	 *     The vector as an array with at least two entries.
	 * 
	 * @return The index of the greatest component.
	 */
	public static int maxComponent(@MinLength(3) float[] v)
	{
		return maxComponent(v[0], v[1], v[2]);
	}
	
	/**
	 * Determines the greatest value of the components of the vector {@code (x, y, z)} and returns
	 * the index of the component. If two or more components have the same value the first index
	 * will be returned.
	 * 
	 * <p>
	 * The index returned is limited to the range of {@code 0-2}.
	 * 
	 * @param x
	 *     The value of the x component of the vector.
	 * @param y
	 *     The value of the y component of the vector.
	 * @param z
	 *     The value of the z component of the vector.
	 * 
	 * @return The index of the greatest component.
	 */
	public static int maxComponent(float x, float y, float z)
	{
		float value = x;
		int index = 0;
		
		if (y > value)
		{
			value = y;
			index = 1;
		}
		
		if (z > value)
		{
			value = z;
			index = 2;
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
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] maxVector(Tup3RF v1, Tup3RF v2, @ExtractionParam @MinLength(3) float[] res)
	{
		return maxVector(v1.v0(), v1.v1(), v1.v2(), v2.v0(), v2.v1(), v2.v2(), res);
	}
	
	/**
	 * Determines the component wise greatest value of the vector {@code (v1)} and the vector
	 * {@code (v2[0], v2[1], v2[2])} and saves the result in the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code max(v1, (v2[0], v2[1], v2[2]))}
	 * 
	 * @param v1
	 *     The first vector.
	 * @param v2
	 *     The second vector as an array with at least three entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] maxVector(Tup3RF v1, @MinLength(3) float[] v2, @ExtractionParam @MinLength(3) float[] res)
	{
		return maxVector(v1.v0(), v1.v1(), v1.v2(), v2[0], v2[1], v2[2], res);
	}
	
	/**
	 * Determines the component wise greatest value of the vector {@code (v1)} and the vector
	 * {@code (v2x, v2y, v2[2])} and saves the result in the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code max(v1, (v2x, v2y, v2z))}
	 * 
	 * @param v1
	 *     The first vector.
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * @param v2z
	 *     The value of the z component of the second vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] maxVector(Tup3RF v1, float v2x, float v2y, float v2z, @ExtractionParam @MinLength(2) float[] res)
	{
		return maxVector(v1.v0(), v1.v1(), v1.v2(), v2x, v2y, v2z, res);
	}
	
	/**
	 * Determines the component wise greatest value of the vector {@code (v1[0], v1[1], v1[2])} and
	 * the vector {@code (v2)} and saves the result in the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code max((v1[0], v1[1], v1[2]), v2)}
	 * 
	 * @param v1
	 *     The first vector as an array with at least three entries.
	 * @param v2
	 *     The second vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] maxVector(@MinLength(3) float[] v1, Tup3RF v2, @ExtractionParam @MinLength(3) float[] res)
	{
		return maxVector(v1[0], v1[1], v1[2], v2.v0(), v2.v1(), v2.v2(), res);
	}
	
	/**
	 * Determines the component wise greatest value of the vector {@code (v1[0], v1[1], v1[2])} and
	 * the vector {@code (v2[0], v2[1], v2[2])} and saves the result in the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code max((v1[0], v1[1], v1[2]), (v2[0], v2[1], v2[2]))}
	 * 
	 * @param v1
	 *     The first vector as an array with at least three entries.
	 * @param v2
	 *     The second vector as an array with at least three entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] maxVector(@MinLength(3) float[] v1, @MinLength(3) float[] v2, @ExtractionParam @MinLength(3) float[] res)
	{
		return maxVector(v1[0], v1[1], v1[2], v2[0], v2[1], v2[2], res);
	}
	
	/**
	 * Determines the component wise greatest value of the vector {@code (v1[0], v1[1], v1[2])} and
	 * the vector {@code (v2x, v2y, v2z)} and saves the result in the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code max((v1[0], v1[1], v1[2]), (v2x, v2y, v2z))}
	 * 
	 * @param v1
	 *     The first vector as an array with at least three entries.
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * @param v2z
	 *     The value of the z component of the second vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] maxVector(@MinLength(3) float[] v1, float v2x, float v2y, float v2z, @ExtractionParam @MinLength(3) float[] res)
	{
		return maxVector(v1[0], v1[1], v1[2], v2x, v2y, v2z, res);
	}
	
	/**
	 * Determines the component wise greatest value of the vector {@code (v1x, v1y, v1z)} and the
	 * vector {@code (v2)} and saves the result in the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code max((v1x, v1y, v1z), v2)}
	 * 
	 * @param v1x
	 *     The value of the x component of the first vector.
	 * @param v1y
	 *     The value of the y component of the first vector.
	 * @param v1z
	 *     The value of the z component of the first vector.
	 * @param v2
	 *     The second vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] maxVector(float v1x, float v1y, float v1z, Tup3RF v2, @ExtractionParam @MinLength(3) float[] res)
	{
		return maxVector(v1x, v1y, v1z, v2.v0(), v2.v1(), v2.v2(), res);
	}
	
	/**
	 * Determines the component wise greatest value of the vector {@code (v1x, v1y, v1z)} and the
	 * vector {@code (v2[0], v2[1], v2[2])} and saves the result in the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code max((v1x, v1y, v1z), (v2[0], v2[1], v2[2]))}
	 * 
	 * @param v1x
	 *     The value of the x component of the first vector.
	 * @param v1y
	 *     The value of the y component of the first vector.
	 * @param v1z
	 *     The value of the z component of the first vector.
	 * @param v2
	 *     The second vector as an array with at least three entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] maxVector(float v1x, float v1y, float v1z, @MinLength(3) float[] v2, @ExtractionParam @MinLength(3) float[] res)
	{
		return maxVector(v1x, v1y, v1z, v2[0], v2[1], v2[2], res);
	}
	
	/**
	 * Determines the component wise greatest value of the vector {@code (v1x, v1y, v1z)} and the
	 * vector {@code (v2x, v2y, v2z)} and saves the result in the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code max((v1x, v1y, v1z), (v2x, v2y, v2z))}
	 * 
	 * @param v1x
	 *     The value of the x component of the first vector.
	 * @param v1y
	 *     The value of the y component of the first vector.
	 * @param v1z
	 *     The value of the z component of the first vector.
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * @param v2z
	 *     The value of the z component of the second vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] maxVector(float v1x, float v1y, float v1z, float v2x, float v2y, float v2z, @ExtractionParam @MinLength(3) float[] res)
	{
		res[0] = Math.max(v1x, v2x);
		res[1] = Math.max(v1y, v2y);
		res[2] = Math.max(v1z, v2z);
		
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
	public static <T extends Tup3WF> T maxVector(Tup3RF v1, Tup3RF v2, @ExtractionParam T res)
	{
		return maxVector(v1.v0(), v1.v1(), v1.v2(), v2.v0(), v2.v1(), v2.v2(), res);
	}
	
	/**
	 * Determines the component wise greatest value of the vector {@code (v1)} and the vector
	 * {@code (v2[0], v2[1], v2[2])} and saves the result in the extraction parameter object.
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
	 *     The second vector as an array with at least three entries.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T maxVector(Tup3RF v1, @MinLength(3) float[] v2, @ExtractionParam T res)
	{
		return maxVector(v1.v0(), v1.v1(), v1.v2(), v2[0], v2[1], v2[2], res);
	}
	
	/**
	 * Determines the component wise greatest value of the vector {@code (v1)} and the vector
	 * {@code (v2x, v2y, v2z)} and saves the result in the extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code max(v1, (v2x, v2y, v2z))}
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
	 * @param v2z
	 *     The value of the z component of the second vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T maxVector(Tup3RF v1, float v2x, float v2y, float v2z, @ExtractionParam T res)
	{
		return maxVector(v1.v0(), v1.v1(), v1.v2(), v2x, v2y, v2z, res);
	}
	
	/**
	 * Determines the component wise greatest value of the vector {@code (v1[0], v1[1], v1[2])} and
	 * the vector {@code (v2)} and saves the result in the extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code max((v1[0], v1[1], v1[2]), v2)}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1
	 *     The first vector as an array with at least three entries.
	 * @param v2
	 *     The second vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T maxVector(@MinLength(3) float[] v1, Tup3RF v2, @ExtractionParam T res)
	{
		return maxVector(v1[0], v1[1], v1[2], v2.v0(), v2.v1(), v2.v2(), res);
	}
	
	/**
	 * Determines the component wise greatest value of the vector {@code (v1[0], v1[1], v1[2])} and
	 * the vector {@code (v2[0], v2[1], v2[2])} and saves the result in the extraction parameter
	 * object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code max((v1[0], v1[1], v1[2]), (v2[0], v2[1], v2[2]))}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1
	 *     The first vector as an array with at least three entries.
	 * @param v2
	 *     The second vector as an array with at least three entries.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T maxVector(@MinLength(3) float[] v1, @MinLength(3) float[] v2, @ExtractionParam T res)
	{
		return maxVector(v1[0], v1[1], v1[2], v2[0], v2[1], v2[2], res);
	}
	
	/**
	 * Determines the component wise greatest value of the vector {@code (v1[0], v1[1], v1[2])} and
	 * the vector {@code (v2x, v2y, v2z)} and saves the result in the extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code max((v1[0], v1[1], v1[2]), (v2x, v2y, v2z))}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1
	 *     The first vector as an array with at least three entries.
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * @param v2z
	 *     The value of the z component of the second vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T maxVector(@MinLength(3) float[] v1, float v2x, float v2y, float v2z, @ExtractionParam T res)
	{
		return maxVector(v1[0], v1[1], v1[2], v2x, v2y, v2z, res);
	}
	
	/**
	 * Determines the component wise greatest value of the vector {@code (v1x, v1y, v1z)} and the
	 * vector {@code (v2)} and saves the result in the extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code max((v1x, v1y, v1z), v2)}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1x
	 *     The value of the x component of the first vector.
	 * @param v1y
	 *     The value of the y component of the first vector.
	 * @param v1z
	 *     The value of the z component of the first vector.
	 * @param v2
	 *     The second vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T maxVector(float v1x, float v1y, float v1z, Tup3RF v2, @ExtractionParam T res)
	{
		return maxVector(v1x, v1y, v1z, v2.v0(), v2.v1(), v2.v2(), res);
	}
	
	/**
	 * Determines the component wise greatest value of the vector {@code (v1x, v1y, v1z)} and the
	 * vector {@code (v2[0], v2[1], v2[2])} and saves the result in the extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code max((v1x, v1y, v1z), (v2[0], v2[1], v2[2]))}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1x
	 *     The value of the x component of the first vector.
	 * @param v1y
	 *     The value of the y component of the first vector.
	 * @param v1z
	 *     The value of the z component of the first vector.
	 * @param v2
	 *     The second vector as an array with at least three entries.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T maxVector(float v1x, float v1y, float v1z, @MinLength(3) float[] v2, @ExtractionParam T res)
	{
		return maxVector(v1x, v1y, v1z, v2[0], v2[1], v2[2], res);
	}
	
	/**
	 * Determines the component wise greatest value of the vector {@code (v1x, v1y, v1z)} and the
	 * vector {@code (v2x, v2y, v2z)} and saves the result in the extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code max((v1x, v1y, v1z), (v2x, v2y, v2z))}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1x
	 *     The value of the x component of the first vector.
	 * @param v1y
	 *     The value of the y component of the first vector.
	 * @param v1z
	 *     The value of the z component of the first vector.
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * @param v2z
	 *     The value of the z component of the second vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T maxVector(float v1x, float v1y, float v1z, float v2x, float v2y, float v2z, @ExtractionParam T res)
	{
		res.set(Math.max(v1x, v2x), Math.max(v1y, v2y), Math.max(v1z, v2z));
		
		return res;
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
	public static float[] normalize(Tup3RF v, @ExtractionParam @MinLength(3) float[] res)
	{
		return normalize(v.v0(), v.v1(), v.v2(), res);
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
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] normalize(Tup3RF v, @FloatMinValue(0.0f) float tolerance, @ExtractionParam @MinLength(3) float[] res)
	{
		return normalize(v.v0(), v.v1(), v.v2(), tolerance, res);
	}
	
	/**
	 * Normalizes the vector {@code (v[0], v[1], v[2])} and saves the result in the given extraction
	 * parameter.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v[0], v[1], v[2]) / |(v[0], v[1], v[2])|}
	 * 
	 * @param v
	 *     The vector as an array with at least three entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] normalize(@MinLength(3) float[] v, @ExtractionParam @MinLength(3) float[] res)
	{
		return normalize(v[0], v[1], v[2], res);
	}
	
	/**
	 * Normalizes the vector {@code (v[0], v[1], v[2])} and saves the result in the given extraction
	 * parameter. If the values of all components are within the margin defined by
	 * {@code (-tolerance <= value <= tolerance)} the result will be a zero vector.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v[0], v[1], v[2]) / |(v[0], v[1], v[2])|}
	 * 
	 * @param v
	 *     The vector as an array with at least three entries.
	 * @param tolerance
	 *     The tolerance for defining the margin around zero. Must be positive.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] normalize(@MinLength(3) float[] v, @FloatMinValue(0.0f) float tolerance, @ExtractionParam @MinLength(3) float[] res)
	{
		return normalize(v[0], v[1], v[2], tolerance, res);
	}
	
	/**
	 * Normalizes the vector {@code (x, y, z)} and saves the result in the given extraction
	 * parameter.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (x, y, z) / |(x, y, z)|}
	 * 
	 * @param x
	 *     The value of the x component of the vector.
	 * @param y
	 *     The value of the y component of the vector.
	 * @param z
	 *     The value of the z component of the vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] normalize(float x, float y, float z, @ExtractionParam @MinLength(3) float[] res)
	{
		if (x == 0.0f && y == 0.0f && z == 0.0f)
		{
			res[0] = 0.0f;
			res[1] = 0.0f;
			res[2] = 0.0f;
			
			return res;
		}
		
		float invLength = inverseLength(x, y, z);
		
		res[0] = x * invLength;
		res[1] = y * invLength;
		res[2] = z * invLength;
		
		return res;
	}
	
	/**
	 * Normalizes the vector {@code (x, y, z)} and saves the result in the given extraction
	 * parameter. If the values of all components are within the margin defined by
	 * {@code (-tolerance <= value <= tolerance)} the result will be a zero vector.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (x, y, z) / |(x, y, z)|}
	 * 
	 * @param x
	 *     The value of the x component of the vector.
	 * @param y
	 *     The value of the y component of the vector.
	 * @param z
	 *     The value of the z component of the vector.
	 * @param tolerance
	 *     The tolerance for defining the margin around zero. Must be positive.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] normalize(float x, float y, float z, @FloatMinValue(0.0f) float tolerance, @ExtractionParam @MinLength(3) float[] res)
	{
		if (Math.abs(x) <= tolerance && Math.abs(y) <= tolerance && Math.abs(z) <= tolerance)
		{
			res[0] = 0.0f;
			res[1] = 0.0f;
			res[2] = 0.0f;
			
			return res;
		}
		
		float invLength = inverseLength(x, y, z);
		
		res[0] = x * invLength;
		res[1] = y * invLength;
		res[2] = z * invLength;
		
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
	public static <T extends Tup3WF> T normalize(Tup3RF v, @ExtractionParam T res)
	{
		return normalize(v.v0(), v.v1(), v.v2(), res);
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
	public static <T extends Tup3WF> T normalize(Tup3RF v, @FloatMinValue(0.0f) float tolerance, @ExtractionParam T res)
	{
		return normalize(v.v0(), v.v1(), v.v2(), tolerance, res);
	}
	
	/**
	 * Normalizes the vector {@code (v[0], v[1], v[2])} and saves the result in the given extraction
	 * parameter object.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v[0], v[1], v[2]) / |(v[0], v[1], v[2])|}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v
	 *     The vector as an array with at least three entries.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T normalize(@MinLength(3) float[] v, @ExtractionParam T res)
	{
		return normalize(v[0], v[1], v[2], res);
	}
	
	/**
	 * Normalizes the vector {@code (v[0], v[1], v[2])} and saves the result in the given extraction
	 * parameter object. If the values of all components are within the margin defined by
	 * {@code (-tolerance <= value <= tolerance)} the result will be a zero vector.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v[0], v[1], v[2]) / |(v[0], v[1], v[2])|}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v
	 *     The vector as an array with at least three entries.
	 * @param tolerance
	 *     The tolerance for defining the margin around zero. Must be positive.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T normalize(@MinLength(3) float[] v, @FloatMinValue(0.0f) float tolerance, @ExtractionParam T res)
	{
		return normalize(v[0], v[1], v[2], tolerance, res);
	}
	
	/**
	 * Normalizes the vector {@code (x, y, z)} and saves the result in the given extraction
	 * parameter object.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (x, y, z) / |(x, y, z)|}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param x
	 *     The value of the x component of the vector.
	 * @param y
	 *     The value of the y component of the vector.
	 * @param z
	 *     The value of the z component of the vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T normalize(float x, float y, float z, @ExtractionParam T res)
	{
		if (x == 0.0f && y == 0.0f && z == 0.0f)
		{
			res.set(0.0f, 0.0f, 0.0f);
			
			return res;
		}
		
		float invLength = inverseLength(x, y, z);
		
		res.set(x * invLength, y * invLength, z * invLength);
		
		return res;
	}
	
	/**
	 * Normalizes the vector {@code (x, y, z)} and saves the result in the given extraction
	 * parameter object. If the values of all components are within the margin defined by
	 * {@code (-tolerance <= value <= tolerance)} the result will be a zero vector.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (x, y, z) / |(x, y, z)|}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param x
	 *     The value of the x component of the vector.
	 * @param y
	 *     The value of the y component of the vector.
	 * @param z
	 *     The value of the z component of the vector.
	 * @param tolerance
	 *     The tolerance for defining the margin around zero. Must be positive.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T normalize(float x, float y, float z, @FloatMinValue(0.0f) float tolerance, @ExtractionParam T res)
	{
		if (Math.abs(x) <= tolerance && Math.abs(y) <= tolerance && Math.abs(z) <= tolerance)
		{
			res.set(0.0f, 0.0f, 0.0f);
			
			return res;
		}
		
		float invLength = inverseLength(x, y, z);
		
		res.set(x * invLength, y * invLength, z * invLength);
		
		return res;
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
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] negate(Tup3RF v, @ExtractionParam @MinLength(3) float[] res)
	{
		return negate(v.v0(), v.v1(), v.v2(), res);
	}
	
	/**
	 * Negates the vector {@code (v[0], v[1], v[2])} and saves the result in the given extraction
	 * parameter.
	 * 
	 * <p>
	 * Operation: {@code -(v[0], v[1], v[2])}
	 * 
	 * @param v
	 *     The vector as an array with at least three entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] negate(@MinLength(3) float[] v, @ExtractionParam @MinLength(3) float[] res)
	{
		return negate(v[0], v[1], v[2], res);
	}
	
	/**
	 * Negates the vector {@code (x, y, z)} and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Operation: {@code -(x, y, z)}
	 * 
	 * @param x
	 *     The value of the x component of the vector.
	 * @param y
	 *     The value of the y component of the vector.
	 * @param z
	 *     The value of the z component of the vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] negate(float x, float y, float z, @ExtractionParam @MinLength(3) float[] res)
	{
		res[0] = -x;
		res[1] = -y;
		res[2] = -z;
		
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
	public static <T extends Tup3WF> T negate(Tup3RF v, @ExtractionParam T res)
	{
		return negate(v.v0(), v.v1(), v.v2(), res);
	}
	
	/**
	 * Negates the vector {@code (v[0], v[1], v[2])} and saves the result in the given extraction
	 * parameter object.
	 * 
	 * <p>
	 * Operation: {@code -(v[0], v[1], v[2])}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v
	 *     The vector as an array with at least three entries.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T negate(@MinLength(3) float[] v, @ExtractionParam T res)
	{
		return negate(v[0], v[1], v[2], res);
	}
	
	/**
	 * Negates the vector {@code (x, y, z)} and saves the result in the given extraction parameter
	 * object.
	 * 
	 * <p>
	 * Operation: {@code -(x, y, z)}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param x
	 *     The value of the x component of the vector.
	 * @param y
	 *     The value of the y component of the vector.
	 * @param z
	 *     The value of the z component of the vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T negate(float x, float y, float z, @ExtractionParam T res)
	{
		res.set(-x, -y, -z);
		
		return res;
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
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] inverse(Tup3RF v, @ExtractionParam @MinLength(3) float[] res)
	{
		return inverse(v.v0(), v.v1(), v.v2(), res);
	}
	
	/**
	 * Inverses the vector {@code (v[0], v[1], v[2])} and saves the result in the given extraction
	 * parameter.
	 * 
	 * <p>
	 * Operation: {@code 1.0 / (v[0], v[1], v[2])}
	 * 
	 * @param v
	 *     The vector as an array with at least three entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] inverse(@MinLength(3) float[] v, @ExtractionParam @MinLength(3) float[] res)
	{
		return inverse(v[0], v[1], v[2], res);
	}
	
	/**
	 * Inverses the vector {@code (x, y, z)} and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Operation: {@code 1.0 / (x, y, z)}
	 * 
	 * @param x
	 *     The value of the x component of the vector.
	 * @param y
	 *     The value of the y component of the vector.
	 * @param z
	 *     The value of the z component of the vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] inverse(float x, float y, float z, @ExtractionParam @MinLength(3) float[] res)
	{
		res[0] = 1.0f / x;
		res[1] = 1.0f / y;
		res[2] = 1.0f / z;
		
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
	public static <T extends Tup3WF> T inverse(Tup3RF v, @ExtractionParam T res)
	{
		return inverse(v.v0(), v.v1(), v.v2(), res);
	}
	
	/**
	 * Inverses the vector {@code (v[0], v[1], v[2])} and saves the result in the given extraction
	 * parameter object.
	 * 
	 * <p>
	 * Operation: {@code 1.0 / (v[0], v[1], v[2])}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v
	 *     The vector as an array with at least three entries.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T inverse(@MinLength(3) float[] v, @ExtractionParam T res)
	{
		return inverse(v[0], v[1], v[2], res);
	}
	
	/**
	 * Inverses the vector {@code (x, y, z)} and saves the result in the given extraction parameter
	 * object.
	 * 
	 * <p>
	 * Operation: {@code 1.0 / (x, y, z)}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param x
	 *     The value of the x component of the vector.
	 * @param y
	 *     The value of the y component of the vector.
	 * @param z
	 *     The value of the z component of the vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T inverse(float x, float y, float z, @ExtractionParam T res)
	{
		res.set(1.0f / x, 1.0f / y, 1.0f / z);
		
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
	 * Rotates the vector {@code (v)} by the given angle in radians around the axis {code (axis)}
	 * and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * @param v
	 *     The vector.
	 * @param axis
	 *     The rotation axis.
	 * @param angle
	 *     The angle in radians.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] rotateRad(Tup3RF v, Tup3RF axis, float angle, @ExtractionParam @MinLength(2) float[] res)
	{
		return rotateRad(v.v0(), v.v1(), v.v2(), axis.v0(), axis.v1(), axis.v2(), angle, res);
	}
	
	/**
	 * Rotates the vector {@code (v)} by the given angle in radians around the axis {code (axis[0],
	 * axis[1], axis[2])} and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * @param v
	 *     The vector.
	 * @param axis
	 *     The rotation axis as an array with at least three entries.
	 * @param angle
	 *     The angle in radians.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] rotateRad(Tup3RF v, @MinLength(3) float[] axis, float angle, @ExtractionParam @MinLength(2) float[] res)
	{
		return rotateRad(v.v0(), v.v1(), v.v2(), axis[0], axis[1], axis[2], angle, res);
	}
	
	/**
	 * Rotates the vector {@code (v)} by the given angle in radians around the axis {code (axisX,
	 * axisY, axisZ)} and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * @param v
	 *     The vector.
	 * @param axisX
	 *     The value of the x component of the rotation axis.
	 * @param axisY
	 *     The value of the y component of the rotation axis.
	 * @param axisZ
	 *     The value of the z component of the rotation axis.
	 * @param angle
	 *     The angle in radians.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] rotateRad(Tup3RF v, float axisX, float axisY, float axisZ, float angle, @ExtractionParam @MinLength(2) float[] res)
	{
		return rotateRad(v.v0(), v.v1(), v.v2(), axisX, axisY, axisZ, angle, res);
	}
	
	/**
	 * Rotates the vector {@code (v[0], v[1], v[2])} by the given angle in radians around the axis
	 * {code (axis)} and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * @param v
	 *     The vector as an array with at least two entries.
	 * @param axis
	 *     The rotation axis.
	 * @param angle
	 *     The angle in radians.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] rotateRad(@MinLength(3) float[] v, Tup3RF axis, float angle, @ExtractionParam @MinLength(2) float[] res)
	{
		return rotateRad(v[0], v[1], v[2], axis.v0(), axis.v1(), axis.v2(), angle, res);
	}
	
	/**
	 * Rotates the vector {@code (v[0], v[1], v[2])} by the given angle in radians around the axis
	 * {code (axis[0], axis[1], axis[2])} and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * @param v
	 *     The vector as an array with at least two entries.
	 * @param axis
	 *     The rotation axis as an array with at least three entries.
	 * @param angle
	 *     The angle in radians.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] rotateRad(@MinLength(3) float[] v, @MinLength(3) float[] axis, float angle, @ExtractionParam @MinLength(2) float[] res)
	{
		return rotateRad(v[0], v[1], v[2], axis[0], axis[1], axis[2], angle, res);
	}
	
	/**
	 * Rotates the vector {@code (v[0], v[1], v[2])} by the given angle in radians around the axis
	 * {code (axisX, axisY, axisZ)} and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * @param v
	 *     The vector as an array with at least two entries.
	 * @param axisX
	 *     The value of the x component of the rotation axis.
	 * @param axisY
	 *     The value of the y component of the rotation axis.
	 * @param axisZ
	 *     The value of the z component of the rotation axis.
	 * @param angle
	 *     The angle in radians.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] rotateRad(@MinLength(3) float[] v, float axisX, float axisY, float axisZ, float angle, @ExtractionParam @MinLength(2) float[] res)
	{
		return rotateRad(v[0], v[1], v[2], axisX, axisY, axisZ, angle, res);
	}
	
	/**
	 * Rotates the vector {@code (x, y, z)} by the given angle in radians around the axis {code
	 * (axis)} and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * @param x
	 *     The value of the x component of the vector.
	 * @param y
	 *     The value of the y component of the vector.
	 * @param z
	 *     The value of the z component of the vector.
	 * @param axis
	 *     The rotation axis.
	 * @param angle
	 *     The angle in radians.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] rotateRad(float x, float y, float z, Tup3RF axis, float angle, @ExtractionParam @MinLength(3) float[] res)
	{
		return rotateRad(x, y, z, axis.v0(), axis.v1(), axis.v2(), angle, res);
	}
	
	/**
	 * Rotates the vector {@code (x, y, z)} by the given angle in radians around the axis {code
	 * (axis[0], axis[1], axis[2])} and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * @param x
	 *     The value of the x component of the vector.
	 * @param y
	 *     The value of the y component of the vector.
	 * @param z
	 *     The value of the z component of the vector.
	 * @param axis
	 *     The rotation axis as an array with at least three entries.
	 * @param angle
	 *     The angle in radians.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] rotateRad(float x, float y, float z, @MinLength(3) float[] axis, float angle, @ExtractionParam @MinLength(3) float[] res)
	{
		return rotateRad(x, y, z, axis[0], axis[1], axis[2], angle, res);
	}
	
	/**
	 * Rotates the vector {@code (x, y, z)} by the given angle in radians around the axis {code
	 * (axisX, axisY, axisZ)} and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * @param x
	 *     The value of the x component of the vector.
	 * @param y
	 *     The value of the y component of the vector.
	 * @param z
	 *     The value of the z component of the vector.
	 * @param axisX
	 *     The value of the x component of the rotation axis.
	 * @param axisY
	 *     The value of the y component of the rotation axis.
	 * @param axisZ
	 *     The value of the z component of the rotation axis.
	 * @param angle
	 *     The angle in radians.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] rotateRad(float x, float y, float z, float axisX, float axisY, float axisZ, float angle, @ExtractionParam @MinLength(3) float[] res)
	{
		// Rodrigues' rotation formula (https://en.wikipedia.org/wiki/Rodrigues%27_rotation_formula)
		// vrot = v * cos(angle) + (axis X v) * sin(angle) + axis * (axis . v) * (1 - cos(angle))
		float sin = BarghosMath.sin(angle);
		float cosAngle = BarghosMath.cos(angle);
		float compCosAngleDot = (1.0f - cosAngle) * (x * axisX + y * axisY + z * axisZ);
		
		res[0] = cosAngle * x + sin * (axisY * z - axisZ * y) + compCosAngleDot * axisX;
		res[1] = cosAngle * y + sin * (axisZ * x - axisX * z) + compCosAngleDot * axisY;
		res[2] = cosAngle * z + sin * (axisX * y - axisY * x) + compCosAngleDot * axisZ;
		
		return res;
	}
	
	/**
	 * Rotates the vector {@code (v)} by the given angle in degrees around the axis {code (axis)}
	 * and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * @param v
	 *     The vector.
	 * @param axis
	 *     The rotation axis.
	 * @param angle
	 *     The angle in degrees.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] rotateDeg(Tup3RF v, Tup3RF axis, float angle, @ExtractionParam @MinLength(2) float[] res)
	{
		return rotateDeg(v.v0(), v.v1(), v.v2(), axis.v0(), axis.v1(), axis.v2(), angle, res);
	}
	
	/**
	 * Rotates the vector {@code (v)} by the given angle in degrees around the axis {code (axis[0],
	 * axis[1], axis[2])} and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * @param v
	 *     The vector.
	 * @param axis
	 *     The rotation axis as an array with at least three entries.
	 * @param angle
	 *     The angle in degrees.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] rotateDeg(Tup3RF v, @MinLength(3) float[] axis, float angle, @ExtractionParam @MinLength(2) float[] res)
	{
		return rotateDeg(v.v0(), v.v1(), v.v2(), axis[0], axis[1], axis[2], angle, res);
	}
	
	/**
	 * Rotates the vector {@code (v)} by the given angle in degrees around the axis {code (axisX,
	 * axisY, axisZ)} and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * @param v
	 *     The vector.
	 * @param axisX
	 *     The value of the x component of the rotation axis.
	 * @param axisY
	 *     The value of the y component of the rotation axis.
	 * @param axisZ
	 *     The value of the z component of the rotation axis.
	 * @param angle
	 *     The angle in degrees.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] rotateDeg(Tup3RF v, float axisX, float axisY, float axisZ, float angle, @ExtractionParam @MinLength(2) float[] res)
	{
		return rotateDeg(v.v0(), v.v1(), v.v2(), axisX, axisY, axisZ, angle, res);
	}
	
	/**
	 * Rotates the vector {@code (v[0], v[1], v[2])} by the given angle in degrees around the axis
	 * {code (axis)} and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * @param v
	 *     The vector as an array with at least two entries.
	 * @param axis
	 *     The rotation axis.
	 * @param angle
	 *     The angle in degrees.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] rotateDeg(@MinLength(3) float[] v, Tup3RF axis, float angle, @ExtractionParam @MinLength(2) float[] res)
	{
		return rotateDeg(v[0], v[1], v[2], axis.v0(), axis.v1(), axis.v2(), angle, res);
	}
	
	/**
	 * Rotates the vector {@code (v[0], v[1], v[2])} by the given angle in degrees around the axis
	 * {code (axis[0], axis[1], axis[2])} and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * @param v
	 *     The vector as an array with at least two entries.
	 * @param axis
	 *     The rotation axis as an array with at least three entries.
	 * @param angle
	 *     The angle in degrees.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] rotateDeg(@MinLength(3) float[] v, @MinLength(3) float[] axis, float angle, @ExtractionParam @MinLength(2) float[] res)
	{
		return rotateDeg(v[0], v[1], v[2], axis[0], axis[1], axis[2], angle, res);
	}
	
	/**
	 * Rotates the vector {@code (v[0], v[1], v[2])} by the given angle in degrees around the axis
	 * {code (axisX, axisY, axisZ)} and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * @param v
	 *     The vector as an array with at least two entries.
	 * @param axisX
	 *     The value of the x component of the rotation axis.
	 * @param axisY
	 *     The value of the y component of the rotation axis.
	 * @param axisZ
	 *     The value of the z component of the rotation axis.
	 * @param angle
	 *     The angle in degrees.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] rotateDeg(@MinLength(3) float[] v, float axisX, float axisY, float axisZ, float angle, @ExtractionParam @MinLength(2) float[] res)
	{
		return rotateDeg(v[0], v[1], v[2], axisX, axisY, axisZ, angle, res);
	}
	
	/**
	 * Rotates the vector {@code (x, y, z)} by the given angle in degrees around the axis {code
	 * (axis)} and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * @param x
	 *     The value of the x component of the vector.
	 * @param y
	 *     The value of the y component of the vector.
	 * @param z
	 *     The value of the z component of the vector.
	 * @param axis
	 *     The rotation axis.
	 * @param angle
	 *     The angle in degrees.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] rotateDeg(float x, float y, float z, Tup3RF axis, float angle, @ExtractionParam @MinLength(3) float[] res)
	{
		return rotateDeg(x, y, z, axis.v0(), axis.v1(), axis.v2(), angle, res);
	}
	
	/**
	 * Rotates the vector {@code (x, y, z)} by the given angle in degrees around the axis {code
	 * (axis[0], axis[1], axis[2])} and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * @param x
	 *     The value of the x component of the vector.
	 * @param y
	 *     The value of the y component of the vector.
	 * @param z
	 *     The value of the z component of the vector.
	 * @param axis
	 *     The rotation axis as an array with at least three entries.
	 * @param angle
	 *     The angle in degrees.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] rotateDeg(float x, float y, float z, @MinLength(3) float[] axis, float angle, @ExtractionParam @MinLength(3) float[] res)
	{
		return rotateDeg(x, y, z, axis[0], axis[1], axis[2], angle, res);
	}
	
	/**
	 * Rotates the vector {@code (x, y, z)} by the given angle in degrees around the axis {code
	 * (axisX, axisY, axisZ)} and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * @param x
	 *     The value of the x component of the vector.
	 * @param y
	 *     The value of the y component of the vector.
	 * @param z
	 *     The value of the z component of the vector.
	 * @param axisX
	 *     The value of the x component of the rotation axis.
	 * @param axisY
	 *     The value of the y component of the rotation axis.
	 * @param axisZ
	 *     The value of the z component of the rotation axis.
	 * @param angle
	 *     The angle in degrees.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] rotateDeg(float x, float y, float z, float axisX, float axisY, float axisZ, float angle, @ExtractionParam @MinLength(3) float[] res)
	{
		return rotateRad(x, y, z, axisX, axisY, axisZ, angle * BarghosMath.DEG_TO_RADf, res);
	}
	
	/**
	 * Rotates the vector {@code (v)} by the given angle in radians around the axis {code (axis)}
	 * and saves the result in the given extraction parameter object.
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
	 * @param axis
	 *     The rotation axis.
	 * @param angle
	 *     The angle in radians.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T rotateRad(Tup3RF v, Tup3RF axis, float angle, @ExtractionParam T res)
	{
		return rotateRad(v.v0(), v.v1(), v.v2(), axis.v0(), axis.v1(), axis.v2(), angle, res);
	}
	
	/**
	 * Rotates the vector {@code (v)} by the given angle in radians around the axis {code (axis[0],
	 * axis[1], axis[2])} and saves the result in the given extraction parameter object.
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
	 * @param axis
	 *     The rotation axis as an array with at least three entries.
	 * @param angle
	 *     The angle in radians.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T rotateRad(Tup3RF v, @MinLength(3) float[] axis, float angle, @ExtractionParam T res)
	{
		return rotateRad(v.v0(), v.v1(), v.v2(), axis[0], axis[1], axis[2], angle, res);
	}
	
	/**
	 * Rotates the vector {@code (v)} by the given angle in radians around the axis {code (axisX,
	 * axisY, axisZ)} and saves the result in the given extraction parameter object.
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
	 * @param axisX
	 *     The value of the x component of the rotation axis.
	 * @param axisY
	 *     The value of the y component of the rotation axis.
	 * @param axisZ
	 *     The value of the z component of the rotation axis.
	 * @param angle
	 *     The angle in radians.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T rotateRad(Tup3RF v, float axisX, float axisY, float axisZ, float angle, @ExtractionParam T res)
	{
		return rotateRad(v.v0(), v.v1(), v.v2(), axisX, axisY, axisZ, angle, res);
	}
	
	/**
	 * Rotates the vector {@code (v[0], v[1], v[2])} by the given angle in radians around the axis
	 * {code (axis)} and saves the result in the given extraction parameter object.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v
	 *     The vector as an array with at least three entries.
	 * @param axis
	 *     The rotation axis.
	 * @param angle
	 *     The angle in radians.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T rotateRad(@MinLength(3) float[] v, Tup3RF axis, float angle, @ExtractionParam T res)
	{
		return rotateRad(v[0], v[1], v[2], axis.v0(), axis.v1(), axis.v2(), angle, res);
	}
	
	/**
	 * Rotates the vector {@code (v[0], v[1], v[2])} by the given angle in radians around the axis
	 * {code (axis[0], axis[1], axis[2])} and saves the result in the given extraction parameter
	 * object.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v
	 *     The vector as an array with at least three entries.
	 * @param axis
	 *     The rotation axis as an array with at least three entries.
	 * @param angle
	 *     The angle in radians.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T rotateRad(@MinLength(3) float[] v, @MinLength(3) float[] axis, float angle, @ExtractionParam T res)
	{
		return rotateRad(v[0], v[1], v[2], axis[0], axis[1], axis[2], angle, res);
	}
	
	/**
	 * Rotates the vector {@code (v[0], v[1], v[2])} by the given angle in radians around the axis
	 * {code (axisX, axisY, axisZ)} and saves the result in the given extraction parameter object.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v
	 *     The vector as an array with at least three entries.
	 * @param axisX
	 *     The value of the x component of the rotation axis.
	 * @param axisY
	 *     The value of the y component of the rotation axis.
	 * @param axisZ
	 *     The value of the z component of the rotation axis.
	 * @param angle
	 *     The angle in radians.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T rotateRad(@MinLength(3) float[] v, float axisX, float axisY, float axisZ, float angle, @ExtractionParam T res)
	{
		return rotateRad(v[0], v[1], v[2], axisX, axisY, axisZ, angle, res);
	}
	
	/**
	 * Rotates the vector {@code (x, y, z)} by the given angle in radians around the axis {code
	 * (axis)} and saves the result in the given extraction parameter object.
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
	 * @param z
	 *     The value of the z component of the vector.
	 * @param axis
	 *     The rotation axis.
	 * @param angle
	 *     The angle in radians.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T rotateRad(float x, float y, float z, Tup3RF axis, float angle, @ExtractionParam T res)
	{
		return rotateRad(x, y, z, axis.v0(), axis.v1(), axis.v2(), angle, res);
	}
	
	/**
	 * Rotates the vector {@code (x, y, z)} by the given angle in radians around the axis {code
	 * (axis[0], axis[1], axis[2])} and saves the result in the given extraction parameter object.
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
	 * @param z
	 *     The value of the z component of the vector.
	 * @param axis
	 *     The rotation axis as an array with at least three entries.
	 * @param angle
	 *     The angle in radians.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T rotateRad(float x, float y, float z, @MinLength(3) float[] axis, float angle, @ExtractionParam T res)
	{
		return rotateRad(x, y, z, axis[0], axis[1], axis[2], angle, res);
	}
	
	/**
	 * Rotates the vector {@code (x, y, z)} by the given angle in radians around the axis {code
	 * (axisX, axisY, axisZ)} and saves the result in the given extraction parameter object.
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
	 * @param z
	 *     The value of the z component of the vector.
	 * @param axisX
	 *     The value of the x component of the rotation axis.
	 * @param axisY
	 *     The value of the y component of the rotation axis.
	 * @param axisZ
	 *     The value of the z component of the rotation axis.
	 * @param angle
	 *     The angle in radians.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T rotateRad(float x, float y, float z, float axisX, float axisY, float axisZ, float angle, @ExtractionParam T res)
	{
		// Rodrigues' rotation formula (https://en.wikipedia.org/wiki/Rodrigues%27_rotation_formula)
		// vrot = v * cos(angle) + (axis X v) * sin(angle) + axis * (axis . v) * (1 - cos(angle))
		float sin = BarghosMath.sin(angle);
		float cosAngle = BarghosMath.cos(angle);
		float compCosAngleDot = (1.0f - cosAngle) * (x * axisX + y * axisY + z * axisZ);
		
		res.set(cosAngle * x + sin * (axisY * z - axisZ * y) + compCosAngleDot * axisX, cosAngle * y + sin * (axisZ * x - axisX * z) + compCosAngleDot * axisY, cosAngle * z + sin * (axisX * y - axisY * x) + compCosAngleDot * axisZ);
		
		return res;
	}
	
	/**
	 * Rotates the vector {@code (v)} by the given angle in degrees around the axis {code (axis)}
	 * and saves the result in the given extraction parameter.
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
	 * @param axis
	 *     The rotation axis.
	 * @param angle
	 *     The angle in degrees.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T rotateDeg(Tup3RF v, Tup3RF axis, float angle, @ExtractionParam T res)
	{
		return rotateDeg(v.v0(), v.v1(), v.v2(), axis.v0(), axis.v1(), axis.v2(), angle, res);
	}
	
	/**
	 * Rotates the vector {@code (v)} by the given angle in degrees around the axis {code (axis[0],
	 * axis[1], axis[2])} and saves the result in the given extraction parameter.
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
	 * @param axis
	 *     The rotation axis as an array with at least three entries.
	 * @param angle
	 *     The angle in degrees.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T rotateDeg(Tup3RF v, @MinLength(3) float[] axis, float angle, @ExtractionParam T res)
	{
		return rotateDeg(v.v0(), v.v1(), v.v2(), axis[0], axis[1], axis[2], angle, res);
	}
	
	/**
	 * Rotates the vector {@code (v)} by the given angle in degrees around the axis {code (axisX,
	 * axisY, axisZ)} and saves the result in the given extraction parameter.
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
	 * @param axisX
	 *     The value of the x component of the rotation axis.
	 * @param axisY
	 *     The value of the y component of the rotation axis.
	 * @param axisZ
	 *     The value of the z component of the rotation axis.
	 * @param angle
	 *     The angle in degrees.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T rotateDeg(Tup3RF v, float axisX, float axisY, float axisZ, float angle, @ExtractionParam T res)
	{
		return rotateDeg(v.v0(), v.v1(), v.v2(), axisX, axisY, axisZ, angle, res);
	}
	
	/**
	 * Rotates the vector {@code (v[0], v[1], v[2])} by the given angle in degrees around the axis
	 * {code (axis)} and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v
	 *     The vector as an array with at least three entries.
	 * @param axis
	 *     The rotation axis.
	 * @param angle
	 *     The angle in degrees.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T rotateDeg(@MinLength(3) float[] v, Tup3RF axis, float angle, @ExtractionParam T res)
	{
		return rotateDeg(v[0], v[1], v[2], axis.v0(), axis.v1(), axis.v2(), angle, res);
	}
	
	/**
	 * Rotates the vector {@code (v[0], v[1], v[2])} by the given angle in degrees around the axis
	 * {code (axis[0], axis[1], axis[2])} and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v
	 *     The vector as an array with at least three entries.
	 * @param axis
	 *     The rotation axis as an array with at least three entries.
	 * @param angle
	 *     The angle in degrees.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T rotateDeg(@MinLength(3) float[] v, @MinLength(3) float[] axis, float angle, @ExtractionParam T res)
	{
		return rotateDeg(v[0], v[1], v[2], axis[0], axis[1], axis[2], angle, res);
	}
	
	/**
	 * Rotates the vector {@code (v[0], v[1], v[2])} by the given angle in degrees around the axis
	 * {code (axisX, axisY, axisZ)} and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v
	 *     The vector as an array with at least three entries.
	 * @param axisX
	 *     The value of the x component of the rotation axis.
	 * @param axisY
	 *     The value of the y component of the rotation axis.
	 * @param axisZ
	 *     The value of the z component of the rotation axis.
	 * @param angle
	 *     The angle in degrees.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T rotateDeg(@MinLength(3) float[] v, float axisX, float axisY, float axisZ, float angle, @ExtractionParam T res)
	{
		return rotateDeg(v[0], v[1], v[2], axisX, axisY, axisZ, angle, res);
	}
	
	/**
	 * Rotates the vector {@code (x, y, z)} by the given angle in degrees around the axis {code
	 * (axis)} and saves the result in the given extraction parameter.
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
	 * @param z
	 *     The value of the z component of the vector.
	 * @param axis
	 *     The rotation axis.
	 * @param angle
	 *     The angle in degrees.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T rotateDeg(float x, float y, float z, Tup3RF axis, float angle, @ExtractionParam T res)
	{
		return rotateDeg(x, y, z, axis.v0(), axis.v1(), axis.v2(), angle, res);
	}
	
	/**
	 * Rotates the vector {@code (x, y, z)} by the given angle in degrees around the axis {code
	 * (axis[0], axis[1], axis[2])} and saves the result in the given extraction parameter.
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
	 * @param z
	 *     The value of the z component of the vector.
	 * @param axis
	 *     The rotation axis as an array with at least three entries.
	 * @param angle
	 *     The angle in degrees.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T rotateDeg(float x, float y, float z, @MinLength(3) float[] axis, float angle, @ExtractionParam T res)
	{
		return rotateDeg(x, y, z, axis[0], axis[1], axis[2], angle, res);
	}
	
	/**
	 * Rotates the vector {@code (x, y, z)} by the given angle in degrees around the axis {code
	 * (axisX, axisY, axisZ)} and saves the result in the given extraction parameter.
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
	 * @param z
	 *     The value of the z component of the vector.
	 * @param axisX
	 *     The value of the x component of the rotation axis.
	 * @param axisY
	 *     The value of the y component of the rotation axis.
	 * @param axisZ
	 *     The value of the z component of the rotation axis.
	 * @param angle
	 *     The angle in degrees.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T rotateDeg(float x, float y, float z, float axisX, float axisY, float axisZ, float angle, @ExtractionParam T res)
	{
		return rotateRad(x, y, z, axisX, axisY, axisZ, angle * BarghosMath.DEG_TO_RADf, res);
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
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result
	 */
	public static float[] project(Tup3RF v, Tup3RF t, @ExtractionParam @MinLength(2) float[] res)
	{
		return project(v.v0(), v.v1(), v.v2(), t.v0(), t.v1(), t.v2(), res);
	}
	
	/**
	 * Calculates the orthogonal projection of the vector {@code (v)} onto the normalized target
	 * vector {@code (t[0], t[1], t[2])} and saves the result in the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (t[0], t[1], t[2]) * (v . (t[0], t[1], t[2]))}
	 * 
	 * @param v
	 *     The vector.
	 * @param t
	 *     The projection target vector as an array with at least three entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result
	 */
	public static float[] project(Tup3RF v, @MinLength(3) float[] t, @ExtractionParam @MinLength(3) float[] res)
	{
		return project(v.v0(), v.v1(), v.v2(), t[0], t[1], t[2], res);
	}
	
	/**
	 * Calculates the orthogonal projection of the vector {@code (v)} onto the normalized target
	 * vector {@code (tX, tY, tZ)} and saves the result in the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (tX, tY, tZ) * (v . (tX, tY, tZ))}
	 * 
	 * @param v
	 *     The vector.
	 * @param tX
	 *     The value of the x component of the projection target vector.
	 * @param tY
	 *     The value of the y component of the projection target vector.
	 * @param tZ
	 *     The value of the z component of the projection target vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result
	 */
	public static float[] project(Tup3RF v, float tX, float tY, float tZ, @ExtractionParam @MinLength(3) float[] res)
	{
		return project(v.v0(), v.v1(), v.v2(), tX, tY, tZ, res);
	}
	
	/**
	 * Calculates the orthogonal projection of the vector {@code (v[0], v[1], v[2])} onto the
	 * normalized target vector {@code (t)} and saves the result in the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code t * ((v[0], v[1], v[2]) . t)}
	 * 
	 * @param v
	 *     The vector as an array with at least three entries.
	 * @param t
	 *     The projection target vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result
	 */
	public static float[] project(@MinLength(3) float[] v, Tup3RF t, @ExtractionParam @MinLength(3) float[] res)
	{
		return project(v[0], v[1], v[2], t.v0(), t.v1(), t.v2(), res);
	}
	
	/**
	 * Calculates the orthogonal projection of the vector {@code (v[0], v[1], v[2])} onto the
	 * normalized target vector {@code (t[0], t[1], t[2])} and saves the result in the extraction
	 * parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (t[0], t[1], t[2]) * ((v[0], v[1], v[2]) . (t[0], t[1], t[2]))}
	 * 
	 * @param v
	 *     The vector as an array with at least three entries.
	 * @param t
	 *     The projection target vector as an array with at least three entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result
	 */
	public static float[] project(@MinLength(3) float[] v, @MinLength(3) float[] t, @ExtractionParam @MinLength(3) float[] res)
	{
		return project(v[0], v[1], v[2], t[0], t[1], t[2], res);
	}
	
	/**
	 * Calculates the orthogonal projection of the vector {@code (v[0], v[1], v[2])} onto the
	 * normalized target vector {@code (tX, tY, tZ)} and saves the result in the extraction
	 * parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (tX, tY, tZ) * ((v[0], v[1], v[2]) . (tX, tY, tZ))}
	 * 
	 * @param v
	 *     The vector as an array with at least three entries.
	 * @param tX
	 *     The value of the x component of the projection target vector.
	 * @param tY
	 *     The value of the y component of the projection target vector.
	 * @param tZ
	 *     The value of the z component of the projection target vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result
	 */
	public static float[] project(@MinLength(3) float[] v, float tX, float tY, float tZ, @ExtractionParam @MinLength(3) float[] res)
	{
		return project(v[0], v[1], v[2], tX, tY, tZ, res);
	}
	
	/**
	 * Calculates the orthogonal projection of the vector {@code (vX, vY, vZ)} onto the normalized
	 * target vector {@code (t)} and saves the result in the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code t * ((vX, vY, vZ) . t)}
	 * 
	 * @param vX
	 *     The value of the x component of the vector.
	 * @param vY
	 *     The value of the y component of the vector.
	 * @param vZ
	 *     The value of the z component of the vector.
	 * @param t
	 *     The projection target vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result
	 */
	public static float[] project(float vX, float vY, float vZ, Tup3RF t, @ExtractionParam @MinLength(3) float[] res)
	{
		return project(vX, vY, vZ, t.v0(), t.v1(), t.v2(), res);
	}
	
	/**
	 * Calculates the orthogonal projection of the vector {@code (vX, vY, vZ)} onto the normalized
	 * target vector {@code (t[0], t[1], t[2])} and saves the result in the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (t[0], t[1], t[2]) * ((vX, vY, vZ) . (t[0], t[1], t[2]))}
	 * 
	 * @param vX
	 *     The value of the x component of the vector.
	 * @param vY
	 *     The value of the y component of the vector.
	 * @param vZ
	 *     The value of the z component of the vector.
	 * @param t
	 *     The projection target vector as an array with at least three entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result
	 */
	public static float[] project(float vX, float vY, float vZ, @MinLength(3) float[] t, @ExtractionParam @MinLength(3) float[] res)
	{
		return project(vX, vY, vZ, t[0], t[1], t[2], res);
	}
	
	/**
	 * Calculates the orthogonal projection of the vector {@code (vX, vY, vZ)} onto the normalized
	 * target vector {@code (tX, tY, tZ)} and saves the result in the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (tX, tY, tZ) * ((vX, vY, vZ) . (tX, tY, tZ))}
	 * 
	 * @param vX
	 *     The value of the x component of the vector.
	 * @param vY
	 *     The value of the y component of the vector.
	 * @param vZ
	 *     The value of the z component of the vector.
	 * @param tX
	 *     The value of the x component of the projection target vector.
	 * @param tY
	 *     The value of the y component of the projection target vector.
	 * @param tZ
	 *     The value of the z component of the projection target vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result
	 */
	public static float[] project(float vX, float vY, float vZ, float tX, float tY, float tZ, @ExtractionParam @MinLength(3) float[] res)
	{
		float dot = dot(vX, vY, vZ, tX, tY, tZ);
		
		res[0] = tX * dot;
		res[1] = tY * dot;
		res[2] = tZ * dot;
		
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
	public static <T extends Tup3WF> T project(Tup3RF v, Tup3RF t, @ExtractionParam T res)
	{
		return project(v.v0(), v.v1(), v.v2(), t.v0(), t.v1(), t.v2(), res);
	}
	
	/**
	 * Calculates the orthogonal projection of the vector {@code (v)} onto the normalized target
	 * vector {@code (t[0], t[1], t[2])} and saves the result in the extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (t[0], t[1], t[2]) * (v . (t[0], t[1], t[2]))}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v
	 *     The vector.
	 * @param t
	 *     The projection target vector as an array with at least three entries.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T project(Tup3RF v, @MinLength(3) float[] t, @ExtractionParam T res)
	{
		return project(v.v0(), v.v1(), v.v2(), t[0], t[1], t[2], res);
	}
	
	/**
	 * Calculates the orthogonal projection of the vector {@code (v)} onto the normalized target
	 * vector {@code (tX, tY, tZ)} and saves the result in the extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (tX, tY, tZ) * (v . (tX, tY, tZ))}
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
	 * @param tZ
	 *     The value of the z component of the projection target vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T project(Tup3RF v, float tX, float tY, float tZ, @ExtractionParam T res)
	{
		return project(v.v0(), v.v1(), v.v2(), tX, tY, tZ, res);
	}
	
	/**
	 * Calculates the orthogonal projection of the vector {@code (v[0], v[1], v[2])} onto the
	 * normalized target vector {@code (t)} and saves the result in the extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code t * ((v[0], v[1], v[2]) . t)}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v
	 *     The vector as an array with at least three entries.
	 * @param t
	 *     The projection target vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T project(@MinLength(3) float[] v, Tup3RF t, @ExtractionParam T res)
	{
		return project(v[0], v[1], v[2], t.v0(), t.v1(), t.v2(), res);
	}
	
	/**
	 * Calculates the orthogonal projection of the vector {@code (v[0], v[1], v[2])} onto the
	 * normalized target vector {@code (t[0], t[1], t[2])} and saves the result in the extraction
	 * parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (t[0], t[1], t[2]) * ((v[0], v[1], v[2]) . (t[0], t[1], t[2]))}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v
	 *     The vector as an array with at least three entries.
	 * @param t
	 *     The projection target vector as an array with at least three entries.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T project(@MinLength(3) float[] v, @MinLength(3) float[] t, @ExtractionParam T res)
	{
		return project(v[0], v[1], v[2], t[0], t[1], t[2], res);
	}
	
	/**
	 * Calculates the orthogonal projection of the vector {@code (v[0], v[1], v[2])} onto the
	 * normalized target vector {@code (tX, tY, tZ)} and saves the result in the extraction
	 * parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (tX, tY, tZ) * ((v[0], v[1], v[2]) . (tX, tY, tZ))}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v
	 *     The vector as an array with at least three entries.
	 * @param tX
	 *     The value of the x component of the projection target vector.
	 * @param tY
	 *     The value of the y component of the projection target vector.
	 * @param tZ
	 *     The value of the z component of the projection target vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T project(@MinLength(3) float[] v, float tX, float tY, float tZ, @ExtractionParam T res)
	{
		return project(v[0], v[1], v[2], tX, tY, tZ, res);
	}
	
	/**
	 * Calculates the orthogonal projection of the vector {@code (vX, vY, vZ)} onto the normalized
	 * target vector {@code (t)} and saves the result in the extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code t * ((vX, vY, vZ) . t)}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param vX
	 *     The value of the x component of the vector.
	 * @param vY
	 *     The value of the y component of the vector.
	 * @param vZ
	 *     The value of the z component of the vector.
	 * @param t
	 *     The projection target vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T project(float vX, float vY, float vZ, Tup3RF t, @ExtractionParam T res)
	{
		return project(vX, vY, vZ, t.v0(), t.v1(), t.v2(), res);
	}
	
	/**
	 * Calculates the orthogonal projection of the vector {@code (vX, vY, vZ)} onto the normalized
	 * target vector {@code (t[0], t[1], t[2])} and saves the result in the extraction parameter
	 * object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (t[0], t[1], t[2]) * ((vX, vY, vZ) . (t[0], t[1], t[2]))}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param vX
	 *     The value of the x component of the vector.
	 * @param vY
	 *     The value of the y component of the vector.
	 * @param vZ
	 *     The value of the z component of the vector.
	 * @param t
	 *     The projection target vector as an array with at least three entries.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T project(float vX, float vY, float vZ, @MinLength(3) float[] t, @ExtractionParam T res)
	{
		return project(vX, vY, vZ, t[0], t[1], t[2], res);
	}
	
	/**
	 * Calculates the orthogonal projection of the vector {@code (vX, vY, vZ)} onto the normalized
	 * target vector {@code (tX, tY, tZ)} and saves the result in the extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (tX, tY, tZ) * ((vX, vY, vZ) . (tX, tY, tZ))}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param vX
	 *     The value of the x component of the vector.
	 * @param vY
	 *     The value of the y component of the vector.
	 * @param vZ
	 *     The value of the z component of the vector.
	 * @param tX
	 *     The value of the x component of the projection target vector.
	 * @param tY
	 *     The value of the y component of the projection target vector.
	 * @param tZ
	 *     The value of the z component of the projection target vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T project(float vX, float vY, float vZ, float tX, float tY, float tZ, @ExtractionParam T res)
	{
		float dot = dot(vX, vY, vZ, tX, tY, tZ);
		
		res.set(tX * dot, tY * dot, tZ * dot);
		
		return res;
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
	public static float[] reflect(Tup3RF v, Tup3RF n, @ExtractionParam @MinLength(2) float[] res)
	{
		return reflect(v.v0(), v.v1(), v.v2(), n.v0(), n.v1(), n.v2(), res);
	}
	
	/**
	 * Calculates the reflection of the vector {@code (v)} based on the given normalized surface
	 * normal {@code (n[0], n[1], n[2])} and saves the result in the given extraction parameter.
	 * 
	 * @param v
	 *     The vector.
	 * @param n
	 *     The surface normal vector as an array with at least three entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] reflect(Tup3RF v, @MinLength(3) float[] n, @ExtractionParam @MinLength(3) float[] res)
	{
		return reflect(v.v0(), v.v1(), v.v2(), n[0], n[1], n[2], res);
	}
	
	/**
	 * Calculates the reflection of the vector {@code (v)} based on the given normalized surface
	 * normal {@code (nX, nY, nZ)} and saves the result in the given extraction parameter.
	 * 
	 * @param v
	 *     The vector.
	 * @param nX
	 *     The value of the x component of the surface normal vector.
	 * @param nY
	 *     The value of the y component of the surface normal vector.
	 * @param nZ
	 *     The value of the z component of the surface normal vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] reflect(Tup3RF v, float nX, float nY, float nZ, @ExtractionParam @MinLength(3) float[] res)
	{
		return reflect(v.v0(), v.v1(), v.v2(), nX, nY, nZ, res);
	}
	
	/**
	 * Calculates the reflection of the vector {@code (v[0], v[1], v[2])} based on the given
	 * normalized surface normal {@code (n)} and saves the result in the given extraction parameter.
	 * 
	 * @param v
	 *     The vector as an array with at least three entries.
	 * @param n
	 *     The surface normal vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] reflect(@MinLength(3) float[] v, Tup3RF n, @ExtractionParam @MinLength(3) float[] res)
	{
		return reflect(v[0], v[1], v[2], n.v0(), n.v1(), n.v2(), res);
	}
	
	/**
	 * Calculates the reflection of the vector {@code (v[0], v[1] v[2])} based on the given
	 * normalized surface normal {@code (n[0], n[1], n[2])} and saves the result in the given
	 * extraction parameter.
	 * 
	 * @param v
	 *     The vector as an array with at least three entries.
	 * @param n
	 *     The surface normal vector as an array with at least three entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] reflect(@MinLength(3) float[] v, @MinLength(3) float[] n, @ExtractionParam @MinLength(3) float[] res)
	{
		return reflect(v[0], v[1], v[2], n[0], n[1], n[2], res);
	}
	
	/**
	 * Calculates the reflection of the vector {@code (v[0], v[1], v[2])} based on the given
	 * normalized surface normal {@code (nX, nY, nZ)} and saves the result in the given extraction
	 * parameter.
	 * 
	 * @param v
	 *     The vector as an array with at least three entries.
	 * @param nX
	 *     The value of the x component of the surface normal vector.
	 * @param nY
	 *     The value of the y component of the surface normal vector.
	 * @param nZ
	 *     The value of the z component of the surface normal vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] reflect(@MinLength(3) float[] v, float nX, float nY, float nZ, @ExtractionParam @MinLength(3) float[] res)
	{
		return reflect(v[0], v[1], v[2], nX, nY, nZ, res);
	}
	
	/**
	 * Calculates the reflection of the vector {@code (vX, vY, vZ)} based on the given normalized
	 * surface normal {@code (n)} and saves the result in the given extraction parameter.
	 * 
	 * @param vX
	 *     The value of the x component of the vector.
	 * @param vY
	 *     The value of the y component of the vector.
	 * @param vZ
	 *     The value of the z component of the vector.
	 * @param n
	 *     The surface normal vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] reflect(float vX, float vY, float vZ, Tup3RF n, @ExtractionParam @MinLength(3) float[] res)
	{
		return reflect(vX, vY, vZ, n.v0(), n.v1(), n.v2(), res);
	}
	
	/**
	 * Calculates the reflection of the vector {@code (vX, vY, vZ)} based on the given normalized
	 * surface normal {@code (n[0], n[1], n[2])} and saves the result in the given extraction
	 * parameter.
	 * 
	 * @param vX
	 *     The value of the x component of the vector.
	 * @param vY
	 *     The value of the y component of the vector.
	 * @param vZ
	 *     The value of the z component of the vector.
	 * @param n
	 *     The surface normal vector as an array with at least three entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] reflect(float vX, float vY, float vZ, @MinLength(3) float[] n, @ExtractionParam @MinLength(3) float[] res)
	{
		return reflect(vX, vY, vZ, n[0], n[1], n[2], res);
	}
	
	/**
	 * Calculates the reflection of the vector {@code (vX, vY, vZ)} based on the given normalized
	 * surface normal {@code (nX, nY, nZ)} and saves the result in the given extraction parameter.
	 * 
	 * @param vX
	 *     The value of the x component of the vector.
	 * @param vY
	 *     The value of the y component of the vector.
	 * @param vZ
	 *     The value of the z component of the vector.
	 * @param nX
	 *     The value of the x component of the surface normal vector.
	 * @param nY
	 *     The value of the y component of the surface normal vector.
	 * @param nZ
	 *     The value of the z component of the surface normal vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] reflect(float vX, float vY, float vZ, float nX, float nY, float nZ, @ExtractionParam @MinLength(3) float[] res)
	{
		float dot = -2 * dot(vX, vY, vZ, nX, nY, nZ);
		
		res[0] = nX * dot + vX;
		res[1] = nY * dot + vY;
		res[2] = nZ * dot + vZ;
		
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
	public static <T extends Tup3WF> T reflect(Tup3RF v, Tup3RF n, @ExtractionParam T res)
	{
		return reflect(v.v0(), v.v1(), v.v2(), n.v0(), n.v1(), n.v2(), res);
	}
	
	/**
	 * Calculates the reflection of the vector {@code (v)} based on the given normalized surface
	 * normal {@code (n[0], n[1], n[2])} and saves the result in the given extraction parameter
	 * object.
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v
	 *     The vector.
	 * @param n
	 *     The surface normal vector as an array with at least three entries.
	 * @param res
	 *     The extraction parameter object.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T reflect(Tup3RF v, @MinLength(3) float[] n, @ExtractionParam T res)
	{
		return reflect(v.v0(), v.v1(), v.v2(), n[0], n[1], n[2], res);
	}
	
	/**
	 * Calculates the reflection of the vector {@code (v)} based on the given normalized surface
	 * normal {@code (nX, nY, nZ)} and saves the result in the given extraction parameter object.
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
	 * @param nZ
	 *     The value of the z component of the surface normal vector.
	 * @param res
	 *     The extraction parameter object.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T reflect(Tup3RF v, float nX, float nY, float nZ, @ExtractionParam T res)
	{
		return reflect(v.v0(), v.v1(), v.v2(), nX, nY, nZ, res);
	}
	
	/**
	 * Calculates the reflection of the vector {@code (v[0], v[1], v[2])} based on the given
	 * normalized surface normal {@code (n)} and saves the result in the given extraction parameter
	 * object.
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v
	 *     The vector as an array with at least three entries.
	 * @param n
	 *     The surface normal vector.
	 * @param res
	 *     The extraction parameter object.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T reflect(@MinLength(3) float[] v, Tup3RF n, @ExtractionParam T res)
	{
		return reflect(v[0], v[1], v[2], n.v0(), n.v1(), n.v2(), res);
	}
	
	/**
	 * Calculates the reflection of the vector {@code (v[0], v[1], v[2])} based on the given
	 * normalized surface normal {@code (n[0], n[1], n[2])} and saves the result in the given
	 * extraction parameter object.
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v
	 *     The vector as an array with at least three entries.
	 * @param n
	 *     The surface normal vector as an array with at least three entries.
	 * @param res
	 *     The extraction parameter object.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T reflect(@MinLength(3) float[] v, @MinLength(3) float[] n, @ExtractionParam T res)
	{
		return reflect(v[0], v[1], v[2], n[0], n[1], n[2], res);
	}
	
	/**
	 * Calculates the reflection of the vector {@code (v[0], v[1], v[2])} based on the given
	 * normalized surface normal {@code (nX, nY, nZ)} and saves the result in the given extraction
	 * parameter object.
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v
	 *     The vector as an array with at least three entries.
	 * @param nX
	 *     The value of the x component of the surface normal vector.
	 * @param nY
	 *     The value of the y component of the surface normal vector.
	 * @param nZ
	 *     The value of the z component of the surface normal vector.
	 * @param res
	 *     The extraction parameter object.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T reflect(@MinLength(3) float[] v, float nX, float nY, float nZ, @ExtractionParam T res)
	{
		return reflect(v[0], v[1], v[2], nX, nY, nZ, res);
	}
	
	/**
	 * Calculates the reflection of the vector {@code (vX, vY, vZ)} based on the given normalized
	 * surface normal {@code (n)} and saves the result in the given extraction parameter object.
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param vX
	 *     The value of the x component of the vector.
	 * @param vY
	 *     The value of the y component of the vector.
	 * @param vZ
	 *     The value of the z component of the vector.
	 * @param n
	 *     The surface normal vector.
	 * @param res
	 *     The extraction parameter object.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T reflect(float vX, float vY, float vZ, Tup3RF n, @ExtractionParam T res)
	{
		return reflect(vX, vY, vZ, n.v0(), n.v1(), n.v2(), res);
	}
	
	/**
	 * Calculates the reflection of the vector {@code (vX, vY, vZ)} based on the given normalized
	 * surface normal {@code (n[0], n[1], n[2])} and saves the result in the given extraction
	 * parameter object.
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param vX
	 *     The value of the x component of the vector.
	 * @param vY
	 *     The value of the y component of the vector.
	 * @param vZ
	 *     The value of the z component of the vector.
	 * @param n
	 *     The surface normal vector as an array with at least three entries.
	 * @param res
	 *     The extraction parameter object.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T reflect(float vX, float vY, float vZ, @MinLength(3) float[] n, @ExtractionParam T res)
	{
		return reflect(vX, vY, vZ, n[0], n[1], n[2], res);
	}
	
	/**
	 * Calculates the reflection of the vector {@code (vX, vY, vZ)} based on the given normalized
	 * surface normal {@code (nX, nY, nZ)} and saves the result in the given extraction parameter
	 * object.
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param vX
	 *     The value of the x component of the vector.
	 * @param vY
	 *     The value of the y component of the vector.
	 * @param vZ
	 *     The value of the z component of the vector.
	 * @param nX
	 *     The value of the x component of the surface normal vector.
	 * @param nY
	 *     The value of the y component of the surface normal vector.
	 * @param nZ
	 *     The value of the z component of the surface normal vector.
	 * @param res
	 *     The extraction parameter object.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T reflect(float vX, float vY, float vZ, float nX, float nY, float nZ, @ExtractionParam T res)
	{
		float dot = -2 * dot(vX, vY, vZ, nX, nY, nZ);
		
		res.set(nX * dot + vX, nY * dot + vY, nZ * dot + vZ);
		
		return res;
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
	public static float dot(Tup3RF v1, Tup3RF v2)
	{
		return dot(v1.v0(), v1.v1(), v1.v2(), v2.v0(), v2.v1(), v2.v2());
	}
	
	/**
	 * Returns the dot product (scalar product) between the first vector {@code (v1)} and the second
	 * vector {@code (v2[0], v2[1], v2[2])}.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 . (v2[0], v2[1], v2[2])}
	 * 
	 * @param v1
	 *     The first vector.
	 * @param v2
	 *     The second vector as an array with at least three entries.
	 * 
	 * @return The dot product (scalar product).
	 */
	public static float dot(Tup3RF v1, @MinLength(3) float[] v2)
	{
		return dot(v1.v0(), v1.v1(), v1.v2(), v2[0], v2[1], v2[2]);
	}
	
	/**
	 * Returns the dot product (scalar product) between the first vector {@code (v1)} and the second
	 * vector {@code (v2x, v2y, v2z)}.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 . (v2x, v2y, v2z)}
	 * 
	 * @param v1
	 *     The first vector.
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * @param v2z
	 *     The value of the z component of the second vector.
	 * 
	 * @return The dot product (scalar product).
	 */
	public static float dot(Tup3RF v1, float v2x, float v2y, float v2z)
	{
		return dot(v1.v0(), v1.v1(), v1.v2(), v2x, v2y, v2z);
	}
	
	/**
	 * Returns the dot product (scalar product) between the first vector
	 * {@code (v1[0], v1[1], v1[2])} and the second vector {@code (v2)}.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1], v1[2]) . v2}
	 * 
	 * @param v1
	 *     The first vector as an array with at least three entries.
	 * @param v2
	 *     The second vector.
	 * 
	 * @return The dot product (scalar product).
	 */
	public static float dot(@MinLength(3) float[] v1, Tup3RF v2)
	{
		return dot(v1[0], v1[1], v1[2], v2.v0(), v2.v1(), v2.v2());
	}
	
	/**
	 * Returns the dot product (scalar product) between the first vector
	 * {@code (v1[0], v1[1], v1[2])} and the second vector {@code (v2[0], v2[1], v2[2])}.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1], v1[2]) . (v2[0], v2[1], v2[2])}
	 * 
	 * @param v1
	 *     The first vector as an array with at least three entries.
	 * @param v2
	 *     The second vector as an array with at least three entries.
	 * 
	 * @return The dot product (scalar product).
	 */
	public static float dot(@MinLength(3) float[] v1, @MinLength(3) float[] v2)
	{
		return dot(v1[0], v1[1], v1[2], v2[0], v2[1], v2[2]);
	}
	
	/**
	 * Returns the dot product (scalar product) between the first vector
	 * {@code (v1[0], v1[1], v1[2])} and the second vector {@code (v2x, v2y, v2z)}.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1], v1[2]) . (v2x, v2y, v2z)}
	 * 
	 * @param v1
	 *     The first vector as an array with at least three entries.
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * @param v2z
	 *     The value of the z component of the second vector.
	 * 
	 * @return The dot product (scalar product).
	 */
	public static float dot(@MinLength(3) float[] v1, float v2x, float v2y, float v2z)
	{
		return dot(v1[0], v1[1], v1[2], v2x, v2y, v2z);
	}
	
	/**
	 * Returns the dot product (scalar product) between the first vector {@code (v1x, v1y, v1z)} and
	 * the second vector {@code (v2)}.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y, v1z) . v2}
	 * 
	 * @param v1x
	 *     The value of the x component of the first vector.
	 * @param v1y
	 *     The value of the y component of the first vector.
	 * @param v1z
	 *     The value of the z component of the first vector.
	 * @param v2
	 *     The second vector.
	 * 
	 * @return The dot product (scalar product).
	 */
	public static float dot(float v1x, float v1y, float v1z, Tup3RF v2)
	{
		return dot(v1x, v1y, v1z, v2.v0(), v2.v1(), v2.v2());
	}
	
	/**
	 * Returns the dot product (scalar product) between the first vector {@code (v1x, v1y, v1z)} and
	 * the second vector {@code (v2[0], v2[1], v2[2])}.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y, v1z) . (v2[0], v2[1], v2[2])}
	 * 
	 * @param v1x
	 *     The value of the x component of the first vector.
	 * @param v1y
	 *     The value of the y component of the first vector.
	 * @param v1z
	 *     The value of the z component of the first vector.
	 * @param v2
	 *     The second vector as an array with at least three entries.
	 * 
	 * @return The dot product (scalar product).
	 */
	public static float dot(float v1x, float v1y, float v1z, @MinLength(3) float[] v2)
	{
		return dot(v1x, v1y, v1z, v2[0], v2[1], v2[2]);
	}
	
	/**
	 * Returns the dot product (scalar product) between the first vector {@code (v1x, v1y, v1z)} and
	 * the second vector {@code (v2x, v2y, v2z)}.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y, v1z) . (v2x, v2y, v2z)}
	 * 
	 * @param v1x
	 *     The value of the x component of the first vector.
	 * @param v1y
	 *     The value of the y component of the first vector.
	 * @param v1z
	 *     The value of the z component of the first vector.
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * @param v2z
	 *     The value of the z component of the second vector.
	 * 
	 * @return The dot product (scalar product).
	 */
	public static float dot(float v1x, float v1y, float v1z, float v2x, float v2y, float v2z)
	{
		return v1x * v2x + v1y * v2y + v1z * v2z;
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
	public static float[] halfVectorTo(Tup3RF v1, Tup3RF v2, @ExtractionParam @MinLength(2) float[] res)
	{
		return halfVectorTo(v1.v0(), v1.v1(), v1.v2(), v2.v0(), v2.v1(), v2.v2(), res);
	}
	
	/**
	 * Calculates half the vector from the point given by the origin vector {@code (v1)} to the
	 * point given by the origin vector {@code (v2[0], v2[1], v2[2])} and saves the result in the
	 * extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ((v2[0], v2[1], v2[2]) - v1) / 2}
	 * 
	 * @param v1
	 *     The first point.
	 * @param v2
	 *     The second point as an array with at least three entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] halfVectorTo(Tup3RF v1, @MinLength(3) float[] v2, @ExtractionParam @MinLength(3) float[] res)
	{
		return halfVectorTo(v1.v0(), v1.v1(), v1.v2(), v2[0], v2[1], v2[2], res);
	}
	
	/**
	 * Calculates half the vector from the point given by the origin vector {@code (v1)} to the
	 * point given by the origin vector {@code (v2x, v2y, v2z)} and saves the result in the
	 * extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ((v2x, v2y, v2z) - v1) / 2}
	 * 
	 * @param v1
	 *     The first point.
	 * @param v2x
	 *     The value of the x component of the second point.
	 * @param v2y
	 *     The value of the y component of the second point.
	 * @param v2z
	 *     The value of the z component of the second point.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] halfVectorTo(Tup3RF v1, float v2x, float v2y, float v2z, @ExtractionParam @MinLength(3) float[] res)
	{
		return halfVectorTo(v1.v0(), v1.v1(), v1.v2(), v2x, v2y, v2z, res);
	}
	
	/**
	 * Calculates half the vector from the point given by the origin vector
	 * {@code (v1[0], v1[1], v1[2])} to the point given by the origin vector {@code (v2)} and saves
	 * the result in the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2 - (v1[0], v1[1], v1[2])) / 2}
	 * 
	 * @param v1
	 *     The first point as an array with at least three entries.
	 * @param v2
	 *     The second point.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] halfVectorTo(@MinLength(3) float[] v1, Tup3RF v2, @ExtractionParam @MinLength(3) float[] res)
	{
		return halfVectorTo(v1[0], v1[1], v1[2], v2.v0(), v2.v1(), v2.v2(), res);
	}
	
	/**
	 * Calculates half the vector from the point given by the origin vector
	 * {@code (v1[0], v1[1], v1[2])} to the point given by the origin vector
	 * {@code (v2[0], v2[1], v2[2])} and saves the result in the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ((v2[0], v2[1], v2[2]) - (v1[0], v1[1], v1[2])) / 2}
	 * 
	 * @param v1
	 *     The first point as an array with at least three entries.
	 * @param v2
	 *     The second point as an array with at least three entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] halfVectorTo(@MinLength(3) float[] v1, @MinLength(3) float[] v2, @ExtractionParam @MinLength(3) float[] res)
	{
		return halfVectorTo(v1[0], v1[1], v1[2], v2[0], v2[1], v2[2], res);
	}
	
	/**
	 * Calculates half the vector from the point given by the origin vector
	 * {@code (v1[0], v1[1], v1[2])} to the point given by the origin vector {@code (v2x, v2y, v2z)}
	 * and saves the result in the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ((v2x, v2y, v2z) - (v1[0], v1[1], v1[2])) / 2}
	 * 
	 * @param v1
	 *     The first point as an array with at least three entries.
	 * @param v2x
	 *     The value of the x component of the second point.
	 * @param v2y
	 *     The value of the y component of the second point.
	 * @param v2z
	 *     The value of the z component of the second point.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] halfVectorTo(@MinLength(3) float[] v1, float v2x, float v2y, float v2z, @ExtractionParam @MinLength(3) float[] res)
	{
		return halfVectorTo(v1[0], v1[1], v1[2], v2x, v2y, v2z, res);
	}
	
	/**
	 * Calculates half the vector from the point given by the origin vector {@code (v1x, v1y, v1z)}
	 * to the point given by the origin vector {@code (v2)} and saves the result in the extraction
	 * parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2 - (v1x, v1y, v1z)) / 2}
	 * 
	 * @param v1x
	 *     The value of the x component of the first point.
	 * @param v1y
	 *     The value of the y component of the first point.
	 * @param v1z
	 *     The value of the z component of the first point.
	 * @param v2
	 *     The second point.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] halfVectorTo(float v1x, float v1y, float v1z, Tup3RF v2, @ExtractionParam @MinLength(3) float[] res)
	{
		return halfVectorTo(v1x, v1y, v1z, v2.v0(), v2.v1(), v2.v2(), res);
	}
	
	/**
	 * Calculates half the vector from the point given by the origin vector {@code (v1x, v1y, v1z)}
	 * to the point given by the origin vector {@code (v2[0], v2[1], v2[2])} and saves the result in
	 * the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ((v2[0], v2[1], v2[2]) - (v1x, v1y, v1z)) / 2}
	 * 
	 * @param v1x
	 *     The value of the x component of the first point.
	 * @param v1y
	 *     The value of the y component of the first point.
	 * @param v1z
	 *     The value of the z component of the first point.
	 * @param v2
	 *     The second point as an array with at least three entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] halfVectorTo(float v1x, float v1y, float v1z, @MinLength(3) float[] v2, @ExtractionParam @MinLength(3) float[] res)
	{
		return halfVectorTo(v1x, v1y, v1z, v2[0], v2[1], v2[2], res);
	}
	
	/**
	 * Calculates half the vector from the point given by the origin vector {@code (v1x, v1y, v1z)}
	 * to the point given by the origin vector {@code (v2x, v2y, v2z)} and saves the result in the
	 * extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ((v2x, v2y, v2z) - (v1x, v1y, v1z)) / 2}
	 * 
	 * @param v1x
	 *     The value of the x component of the first point.
	 * @param v1y
	 *     The value of the y component of the first point.
	 * @param v1z
	 *     The value of the z component of the first point.
	 * @param v2x
	 *     The value of the x component of the second point.
	 * @param v2y
	 *     The value of the y component of the second point.
	 * @param v2z
	 *     The value of the z component of the second point.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] halfVectorTo(float v1x, float v1y, float v1z, float v2x, float v2y, float v2z, @ExtractionParam @MinLength(3) float[] res)
	{
		res[0] = (v2x - v1x) * 0.5f;
		res[1] = (v2y - v1y) * 0.5f;
		res[2] = (v2z - v1z) * 0.5f;
		
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
	public static <T extends Tup3WF> T halfVectorTo(Tup3RF v1, Tup3RF v2, @ExtractionParam T res)
	{
		return halfVectorTo(v1.v0(), v1.v1(), v1.v2(), v2.v0(), v2.v1(), v2.v2(), res);
	}
	
	/**
	 * Calculates half the vector from the point given by the origin vector {@code (v1)} to the
	 * point given by the origin vector {@code (v2[0], v2[1],  v2[2])} and saves the result in the
	 * extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ((v2[0], v2[1], v2[2]) - v1) / 2}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1
	 *     The first point.
	 * @param v2
	 *     The second point as an array with at least three entries.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T halfVectorTo(Tup3RF v1, @MinLength(3) float[] v2, @ExtractionParam T res)
	{
		return halfVectorTo(v1.v0(), v1.v1(), v1.v2(), v2[0], v2[1], v2[2], res);
	}
	
	/**
	 * Calculates half the vector from the point given by the origin vector {@code (v1)} to the
	 * point given by the origin vector {@code (v2x, v2y, v2z)} and saves the result in the
	 * extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ((v2x, v2y, v2z) - v1) / 2}
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
	 * @param v2z
	 *     The value of the z component of the second point.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T halfVectorTo(Tup3RF v1, float v2x, float v2y, float v2z, @ExtractionParam T res)
	{
		return halfVectorTo(v1.v0(), v1.v1(), v1.v2(), v2x, v2y, v2z, res);
	}
	
	/**
	 * Calculates half the vector from the point given by the origin vector
	 * {@code (v1[0], v1[1], v1[2])} to the point given by the origin vector {@code (v2)} and saves
	 * the result in the extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2 - (v1[0], v1[1], v1[2])) / 2}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1
	 *     The first point as an array with at least three entries.
	 * @param v2
	 *     The second point.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T halfVectorTo(@MinLength(3) float[] v1, Tup3RF v2, @ExtractionParam T res)
	{
		return halfVectorTo(v1[0], v1[1], v1[2], v2.v0(), v2.v1(), v2.v2(), res);
	}
	
	/**
	 * Calculates half the vector from the point given by the origin vector
	 * {@code (v1[0], v1[1], v1[2])} to the point given by the origin vector
	 * {@code (v2[0], v2[1], v2[2])} and saves the result in the extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ((v2[0], v2[1], v2[2]) - (v1[0], v1[1], v1[2])) / 2}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1
	 *     The first point as an array with at least three entries.
	 * @param v2
	 *     The second point as an array with at least three entries.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T halfVectorTo(@MinLength(3) float[] v1, @MinLength(3) float[] v2, @ExtractionParam T res)
	{
		return halfVectorTo(v1[0], v1[1], v1[2], v2[0], v2[1], v2[2], res);
	}
	
	/**
	 * Calculates half the vector from the point given by the origin vector
	 * {@code (v1[0], v1[1], v1[2])} to the point given by the origin vector {@code (v2x, v2y, v2z)}
	 * and saves the result in the extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ((v2x, v2y, v2z) - (v1[0], v1[1], v1[2])) / 2}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1
	 *     The first point as an array with at least three entries.
	 * @param v2x
	 *     The value of the x component of the second point.
	 * @param v2y
	 *     The value of the y component of the second point.
	 * @param v2z
	 *     The value of the z component of the second point.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T halfVectorTo(@MinLength(3) float[] v1, float v2x, float v2y, float v2z, @ExtractionParam T res)
	{
		return halfVectorTo(v1[0], v1[1], v1[2], v2x, v2y, v2z, res);
	}
	
	/**
	 * Calculates half the vector from the point given by the origin vector {@code (v1x, v1y, v1z)}
	 * to the point given by the origin vector {@code (v2)} and saves the result in the extraction
	 * parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2 - (v1x, v1y, v1z)) / 2}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1x
	 *     The value of the x component of the first point.
	 * @param v1y
	 *     The value of the y component of the first point.
	 * @param v1z
	 *     The value of the z component of the first point.
	 * @param v2
	 *     The second point.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T halfVectorTo(float v1x, float v1y, float v1z, Tup3RF v2, @ExtractionParam T res)
	{
		return halfVectorTo(v1x, v1y, v1z, v2.v0(), v2.v1(), v2.v2(), res);
	}
	
	/**
	 * Calculates half the vector from the point given by the origin vector {@code (v1x, v1y, v1z)}
	 * to the point given by the origin vector {@code (v2[0], v2[1], v2[2])} and saves the result in
	 * the extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ((v2[0], v2[1], v2[2]) - (v1x, v1y, v1z)) / 2}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1x
	 *     The value of the x component of the first point.
	 * @param v1y
	 *     The value of the y component of the first point.
	 * @param v1z
	 *     The value of the z component of the first point.
	 * @param v2
	 *     The second point as an array with at least three entries.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T halfVectorTo(float v1x, float v1y, float v1z, @MinLength(3) float[] v2, @ExtractionParam T res)
	{
		return halfVectorTo(v1x, v1y, v1z, v2[0], v2[1], v2[2], res);
	}
	
	/**
	 * Calculates half the vector from the point given by the origin vector {@code (v1x, v1y, v1z)}
	 * to the point given by the origin vector {@code (v2x, v2y, v2z)} and saves the result in the
	 * extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ((v2x, v2y, v2z) - (v1x, v1y, v1z)) / 2}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1x
	 *     The value of the x component of the first point.
	 * @param v1y
	 *     The value of the y component of the first point.
	 * @param v1z
	 *     The value of the z component of the first point.
	 * @param v2x
	 *     The value of the x component of the second point.
	 * @param v2y
	 *     The value of the y component of the second point.
	 * @param v2z
	 *     The value of the z component of the second point.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T halfVectorTo(float v1x, float v1y, float v1z, float v2x, float v2y, float v2z, @ExtractionParam T res)
	{
		res.set((v2x - v1x) * 0.5f, (v2y - v1y) * 0.5f, (v2z - v1z) * 0.5f);
		
		return res;
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
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] halfPointBetween(Tup3RF v1, Tup3RF v2, @ExtractionParam @MinLength(3) float[] res)
	{
		return halfPointBetween(v1.v0(), v1.v1(), v1.v2(), v2.v0(), v2.v1(), v2.v2(), res);
	}
	
	/**
	 * Calculates the point that lies half way between the point given by the origin vector
	 * {@code (v1)} and the point given by the origin vector {@code (v2[0], v2[1], v2[2])} and saves
	 * the result in the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ((v2[0], v2[1], v2[2]) + v1) / 2}
	 * 
	 * @param v1
	 *     The first point.
	 * @param v2
	 *     The second point as an array with at least three entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] halfPointBetween(Tup3RF v1, @MinLength(3) float[] v2, @ExtractionParam @MinLength(3) float[] res)
	{
		return halfPointBetween(v1.v0(), v1.v1(), v1.v2(), v2[0], v2[1], v2[2], res);
	}
	
	/**
	 * Calculates the point that lies half way between the point given by the origin vector
	 * {@code (v1)} and the point given by the origin vector {@code (v2x, v2y, v2z)} and saves the
	 * result in the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ((v2x, v2y, v2z) + v1) / 2}
	 * 
	 * @param v1
	 *     The first point.
	 * @param v2x
	 *     The value of the x component of the second point.
	 * @param v2y
	 *     The value of the y component of the second point.
	 * @param v2z
	 *     The value of the z component of the second point.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] halfPointBetween(Tup3RF v1, float v2x, float v2y, float v2z, @ExtractionParam @MinLength(3) float[] res)
	{
		return halfPointBetween(v1.v0(), v1.v1(), v1.v2(), v2x, v2y, v2z, res);
	}
	
	/**
	 * Calculates the point that lies half way between the point given by the origin vector
	 * {@code (v1[0], v1[1], v1[2])} and the point given by the origin vector {@code (v2)} and saves
	 * the result in the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2 + (v1[0], v1[1], v1[2])) / 2}
	 * 
	 * @param v1
	 *     The first point as an array with at least three entries.
	 * @param v2
	 *     The second point.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] halfPointBetween(@MinLength(3) float[] v1, Tup3RF v2, @ExtractionParam @MinLength(3) float[] res)
	{
		return halfPointBetween(v1[0], v1[1], v1[2], v2.v0(), v2.v1(), v2.v2(), res);
	}
	
	/**
	 * Calculates the point that lies half way between the point given by the origin vector
	 * {@code (v1[0], v1[1], v1[2])} and the point given by the origin vector
	 * {@code (v2[0], v2[1], v2[2])} and saves the result in the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ((v2[0], v2[1], v2[2]) + (v1[0], v1[1], v1[2])) / 2}
	 * 
	 * @param v1
	 *     The first point as an array with at least three entries.
	 * @param v2
	 *     The second point as an array with at least three entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] halfPointBetween(@MinLength(3) float[] v1, @MinLength(3) float[] v2, @ExtractionParam @MinLength(3) float[] res)
	{
		return halfPointBetween(v1[0], v1[1], v1[2], v2[0], v2[1], v2[2], res);
	}
	
	/**
	 * Calculates the point that lies half way between the point given by the origin vector
	 * {@code (v1[0], v1[1], v1[2])} and the point given by the origin vector
	 * {@code (v2x, v2y, v2z)} and saves the result in the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ((v2x, v2y, v2z) + (v1[0], v1[1], v1[2])) / 2}
	 * 
	 * @param v1
	 *     The first point as an array with at least three entries.
	 * @param v2x
	 *     The value of the x component of the second point.
	 * @param v2y
	 *     The value of the y component of the second point.
	 * @param v2z
	 *     The value of the z component of the second point.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] halfPointBetween(@MinLength(3) float[] v1, float v2x, float v2y, float v2z, @ExtractionParam @MinLength(3) float[] res)
	{
		return halfPointBetween(v1[0], v1[1], v1[2], v2x, v2y, v2z, res);
	}
	
	/**
	 * Calculates the point that lies half way between the point given by the origin vector
	 * {@code (v1x, v1y, v1z)} and the point given by the origin vector {@code (v2)} and saves the
	 * result in the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2 + (v1x, v1y, v1z)) / 2}
	 * 
	 * @param v1x
	 *     The value of the x component of the first point.
	 * @param v1y
	 *     The value of the y component of the first point.
	 * @param v1z
	 *     The value of the z component of the first point.
	 * @param v2
	 *     The second point.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] halfPointBetween(float v1x, float v1y, float v1z, Tup3RF v2, @ExtractionParam @MinLength(3) float[] res)
	{
		return halfPointBetween(v1x, v1y, v1z, v2.v0(), v2.v1(), v2.v2(), res);
	}
	
	/**
	 * Calculates the point that lies half way between the point given by the origin vector
	 * {@code (v1x, v1y, v1z)} and the point given by the origin vector
	 * {@code (v2[0], v2[1], v2[2])} and saves the result in the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ((v2[0], v2[1], v2[2]) + (v1x, v1y, v1z)) / 2}
	 * 
	 * @param v1x
	 *     The value of the x component of the first point.
	 * @param v1y
	 *     The value of the y component of the first point.
	 * @param v1z
	 *     The value of the z component of the first point.
	 * @param v2
	 *     The second point as an array with at least three entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] halfPointBetween(float v1x, float v1y, float v1z, @MinLength(3) float[] v2, @ExtractionParam @MinLength(3) float[] res)
	{
		return halfPointBetween(v1x, v1y, v1z, v2[0], v2[1], v2[2], res);
	}
	
	/**
	 * Calculates the point that lies half way between the point given by the origin vector
	 * {@code (v1x, v1y, v1z)} and the point given by the origin vector {@code (v2x, v2y, v2z)} and
	 * saves the result in the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ((v2x, v2y, v2z) + (v1x, v1y, v1z)) / 2}
	 * 
	 * @param v1x
	 *     The value of the x component of the first point.
	 * @param v1y
	 *     The value of the y component of the first point.
	 * @param v1z
	 *     The value of the y component of the first point.
	 * @param v2x
	 *     The value of the x component of the second point.
	 * @param v2y
	 *     The value of the y component of the second point.
	 * @param v2z
	 *     The value of the y component of the second point.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] halfPointBetween(float v1x, float v1y, float v1z, float v2x, float v2y, float v2z, @ExtractionParam @MinLength(3) float[] res)
	{
		res[0] = (v2x - v1x) * 0.5f;
		res[1] = (v2y - v1y) * 0.5f;
		res[2] = (v2z - v1z) * 0.5f;
		
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
	public static <T extends Tup3WF> T halfPointBetween(Tup3RF v1, Tup3RF v2, @ExtractionParam T res)
	{
		return halfPointBetween(v1.v0(), v1.v1(), v1.v2(), v2.v0(), v2.v1(), v2.v2(), res);
	}
	
	/**
	 * Calculates the point that lies half way between the point given by the origin vector
	 * {@code (v1)} and the point given by the origin vector {@code (v2[0], v2[1], v2[2])} and saves
	 * the result in the extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ((v2[0], v2[1], v2[2]) + v1) / 2}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1
	 *     The first point.
	 * @param v2
	 *     The second point as an array with at least three entries.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T halfPointBetween(Tup3RF v1, @MinLength(3) float[] v2, @ExtractionParam T res)
	{
		return halfPointBetween(v1.v0(), v1.v1(), v1.v2(), v2[0], v2[1], v2[2], res);
	}
	
	/**
	 * Calculates the point that lies half way between the point given by the origin vector
	 * {@code (v1)} and the point given by the origin vector {@code (v2x, v2y, v2z)} and saves the
	 * result in the extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ((v2x, v2y, v2z) + v1) / 2}
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
	 * @param v2z
	 *     The value of the z component of the second point.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T halfPointBetween(Tup3RF v1, float v2x, float v2y, float v2z, @ExtractionParam T res)
	{
		return halfPointBetween(v1.v0(), v1.v1(), v1.v2(), v2x, v2y, v2z, res);
	}
	
	/**
	 * Calculates the point that lies half way between the point given by the origin vector
	 * {@code (v1[0], v1[1], v1[2])} and the point given by the origin vector {@code (v2)} and saves
	 * the result in the extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2 + (v1[0], v1[1], v1[2])) / 2}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1
	 *     The first point as an array with at least three entries.
	 * @param v2
	 *     The second point
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T halfPointBetween(@MinLength(3) float[] v1, Tup3RF v2, @ExtractionParam T res)
	{
		return halfPointBetween(v1[0], v1[1], v1[2], v2.v0(), v2.v1(), v2.v2(), res);
	}
	
	/**
	 * Calculates the point that lies half way between the point given by the origin vector
	 * {@code (v1[0], v1[1], v1[2])} and the point given by the origin vector
	 * {@code (v2[0], v2[1], v2[2])} and saves the result in the extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ((v2[0], v2[1], v2[2]) + (v1[0], v1[1], v1[2])) / 2}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1
	 *     The first point as an array with at least three entries.
	 * @param v2
	 *     The second point as an array with at least three entries.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T halfPointBetween(@MinLength(3) float[] v1, @MinLength(3) float[] v2, @ExtractionParam T res)
	{
		return halfPointBetween(v1[0], v1[1], v1[2], v2[0], v2[1], v2[2], res);
	}
	
	/**
	 * Calculates the point that lies half way between the point given by the origin vector
	 * {@code (v1[0], v1[1], v1[2])} and the point given by the origin vector
	 * {@code (v2x, v2y, v2z)} and saves the result in the extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ((v2x, v2y, v2z) + (v1[0], v1[1], v1[2])) / 2}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1
	 *     The first point as an array with at least three entries.
	 * @param v2x
	 *     The value of the x component of the second point.
	 * @param v2y
	 *     The value of the y component of the second point.
	 * @param v2z
	 *     The value of the z component of the second point.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T halfPointBetween(@MinLength(3) float[] v1, float v2x, float v2y, float v2z, @ExtractionParam T res)
	{
		return halfPointBetween(v1[0], v1[1], v1[2], v2x, v2y, v2z, res);
	}
	
	/**
	 * Calculates the point that lies half way between the point given by the origin vector
	 * {@code (v1x, v1y, v1z)} and the point given by the origin vector {@code (v2)} and saves the
	 * result in the extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2 + (v1x, v1y, v1z)) / 2}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1x
	 *     The value of the x component of the first point.
	 * @param v1y
	 *     The value of the y component of the first point.
	 * @param v1z
	 *     The value of the z component of the first point.
	 * @param v2
	 *     The second point.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T halfPointBetween(float v1x, float v1y, float v1z, Tup3RF v2, @ExtractionParam T res)
	{
		return halfPointBetween(v1x, v1y, v1z, v2.v0(), v2.v1(), v2.v2(), res);
	}
	
	/**
	 * Calculates the point that lies half way between the point given by the origin vector
	 * {@code (v1x, v1y, v1z)} and the point given by the origin vector
	 * {@code (v2[0], v2[1], v2[2])} and saves the result in the extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ((v2[0], v2[1], v2[2]) + (v1x, v1y, v1z)) / 2}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1x
	 *     The value of the x component of the first point.
	 * @param v1y
	 *     The value of the y component of the first point.
	 * @param v1z
	 *     The value of the z component of the first point.
	 * @param v2
	 *     The second point as an array with at least three entries.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T halfPointBetween(float v1x, float v1y, float v1z, @MinLength(3) float[] v2, @ExtractionParam T res)
	{
		return halfPointBetween(v1x, v1y, v1z, v2[0], v2[1], v2[2], res);
	}
	
	/**
	 * Calculates the point that lies half way between the point given by the origin vector
	 * {@code (v1x, v1y, v1z)} and the point given by the origin vector {@code (v2x, v2y, v2z)} and
	 * saves the result in the extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ((v2x, v2y, v2z) + (v1x, v1y, v1z)) / 2}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1x
	 *     The value of the x component of the first point.
	 * @param v1y
	 *     The value of the y component of the first point.
	 * @param v1z
	 *     The value of the z component of the first point.
	 * @param v2x
	 *     The value of the x component of the second point.
	 * @param v2y
	 *     The value of the y component of the second point.
	 * @param v2z
	 *     The value of the z component of the second point.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T halfPointBetween(float v1x, float v1y, float v1z, float v2x, float v2y, float v2z, @ExtractionParam T res)
	{
		res.set((v2x - v1x) * 0.5f, (v2y - v1y) * 0.5f, (v2z - v1z) * 0.5f);
		
		return res;
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
	public static float distanceTo(Tup3RF v1, Tup3RF v2)
	{
		return distanceTo(v1.v0(), v1.v1(), v1.v2(), v2.v0(), v2.v1(), v2.v2());
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
	public static float distanceTo(Tup3RF v1, Tup3RF v2, @FloatMinValue(0.0f) float tolerance)
	{
		return distanceTo(v1.v0(), v1.v1(), v1.v2(), v2.v0(), v2.v1(), v2.v2(), tolerance);
	}
	
	/**
	 * Returns the distance from the point given by the origin vector {@code (v1)} to the point
	 * given by the origin vector {@code (v2[0], v2[1], v2[2])}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(v2[0], v2[1], v2[2]) - v1|}
	 * 
	 * @param v1
	 *     The first point.
	 * @param v2
	 *     The second point as an array with at least three entries.
	 * 
	 * @return The distance between the points.
	 */
	public static float distanceTo(Tup3RF v1, @MinLength(3) float[] v2)
	{
		return distanceTo(v1.v0(), v1.v1(), v1.v2(), v2[0], v2[1], v2[2]);
	}
	
	/**
	 * Returns the distance from the point given by the origin vector {@code (v1)} to the point
	 * given by the origin vector {@code (v2[0], v2[1], v2[2])}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(v2[0], v2[1], v2[2]) - v1|}
	 * 
	 * @param v1
	 *     The first point.
	 * @param v2
	 *     The second point as an array with at least three entries.
	 * @param tolerance
	 *     The tolerance for defining the margin around zero. Must be positive.
	 * 
	 * @return The distance between the points.
	 */
	public static float distanceTo(Tup3RF v1, @MinLength(3) float[] v2, @FloatMinValue(0.0f) float tolerance)
	{
		return distanceTo(v1.v0(), v1.v1(), v1.v2(), v2[0], v2[1], v2[2], tolerance);
	}
	
	/**
	 * Returns the distance from the point given by the origin vector {@code (v1)} to the point
	 * given by the origin vector {@code (v2x, v2y, v2z)}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(v2x, v2y, v2z) - v1|}
	 * 
	 * @param v1
	 *     The first point.
	 * @param v2x
	 *     The value of the x component of the second point.
	 * @param v2y
	 *     The value of the y component of the second point.
	 * @param v2z
	 *     The value of the z component of the second point.
	 * 
	 * @return The distance between the points.
	 */
	public static float distanceTo(Tup3RF v1, float v2x, float v2y, float v2z)
	{
		return distanceTo(v1.v0(), v1.v1(), v1.v2(), v2x, v2y, v2z);
	}
	
	/**
	 * Returns the distance from the point given by the origin vector {@code (v1)} to the point
	 * given by the origin vector {@code (v2x, v2y, v2z)}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(v2x, v2y, v2z) - v1|}
	 * 
	 * @param v1
	 *     The first point.
	 * @param v2x
	 *     The value of the x component of the second point.
	 * @param v2y
	 *     The value of the y component of the second point.
	 * @param v2z
	 *     The value of the z component of the second point.
	 * @param tolerance
	 *     The tolerance for defining the margin around zero. Must be positive.
	 * 
	 * @return The distance between the points.
	 */
	public static float distanceTo(Tup3RF v1, float v2x, float v2y, float v2z, @FloatMinValue(0.0f) float tolerance)
	{
		return distanceTo(v1.v0(), v1.v1(), v1.v2(), v2x, v2y, v2z, tolerance);
	}
	
	/**
	 * Returns the distance from the point given by the origin vector {@code (v1[0], v1[1], v1[2])}
	 * to the point given by the origin vector {@code (v2)}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |v2 - (v1[0], v1[1], v1[2])|}
	 * 
	 * @param v1
	 *     The first point as an array with at least three entries.
	 * @param v2
	 *     The second point.
	 * 
	 * @return The distance between the points.
	 */
	public static float distanceTo(@MinLength(3) float[] v1, Tup3RF v2)
	{
		return distanceTo(v1[0], v1[1], v1[2], v2.v0(), v2.v1(), v2.v2());
	}
	
	/**
	 * Returns the distance from the point given by the origin vector {@code (v1[0], v1[1], v1[2])}
	 * to the point given by the origin vector {@code (v2)}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |v2 - (v1[0], v1[1], v1[2])|}
	 * 
	 * @param v1
	 *     The first point as an array with at least three entries.
	 * @param v2
	 *     The second point.
	 * @param tolerance
	 *     The tolerance for defining the margin around zero. Must be positive.
	 * 
	 * @return The distance between the points.
	 */
	public static float distanceTo(@MinLength(3) float[] v1, Tup3RF v2, @FloatMinValue(0.0f) float tolerance)
	{
		return distanceTo(v1[0], v1[1], v1[2], v2.v0(), v2.v1(), v2.v2(), tolerance);
	}
	
	/**
	 * Returns the distance from the point given by the origin vector {@code (v1[0], v1[1], v1[2])}
	 * to the point given by the origin vector {@code (v2[0], v2[1], v2[2])}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(v2[0], v2[1], v2[2]) - (v1[0], v1[1], v1[2])|}
	 * 
	 * @param v1
	 *     The first point as an array with at least three entries.
	 * @param v2
	 *     The second point as an array with at least three entries.
	 * 
	 * @return The distance between the points.
	 */
	public static float distanceTo(@MinLength(3) float[] v1, @MinLength(3) float[] v2)
	{
		return distanceTo(v1[0], v1[1], v1[2], v2[0], v2[1], v2[2]);
	}
	
	/**
	 * Returns the distance from the point given by the origin vector {@code (v1[0], v1[1], v1[2])}
	 * to the point given by the origin vector {@code (v2[0], v2[1], v2[2])}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(v2[0], v2[1], v2[2]) - (v1[0], v1[1], v1[2])|}
	 * 
	 * @param v1
	 *     The first point as an array with at least three entries.
	 * @param v2
	 *     The second point as an array with at least three entries.
	 * @param tolerance
	 *     The tolerance for defining the margin around zero. Must be positive.
	 * 
	 * @return The distance between the points.
	 */
	public static float distanceTo(@MinLength(3) float[] v1, @MinLength(3) float[] v2, @FloatMinValue(0.0f) float tolerance)
	{
		return distanceTo(v1[0], v1[1], v1[2], v2[0], v2[1], v2[2], tolerance);
	}
	
	/**
	 * Returns the distance from the point given by the origin vector {@code (v1[0], v1[1], v1[2])}
	 * to the point given by the origin vector {@code (v2x, v2y, v2z)}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(v2x, v2y, v2z) - (v1[0], v1[1], v1[2])|}
	 * 
	 * @param v1
	 *     The first point as an array with at least three entries.
	 * @param v2x
	 *     The value of the x component of the second point.
	 * @param v2y
	 *     The value of the y component of the second point.
	 * @param v2z
	 *     The value of the z component of the second point.
	 * 
	 * @return The distance between the points.
	 */
	public static float distanceTo(@MinLength(3) float[] v1, float v2x, float v2y, float v2z)
	{
		return distanceTo(v1[0], v1[1], v1[2], v2x, v2y, v2z);
	}
	
	/**
	 * Returns the distance from the point given by the origin vector {@code (v1[0], v1[1], v1[2])}
	 * to the point given by the origin vector {@code (v2x, v2y, v2z)}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(v2x, v2y, v2z) - (v1[0], v1[1], v1[2])|}
	 * 
	 * @param v1
	 *     The first point as an array with at least three entries.
	 * @param v2x
	 *     The value of the x component of the second point.
	 * @param v2y
	 *     The value of the y component of the second point.
	 * @param v2z
	 *     The value of the z component of the second point.
	 * @param tolerance
	 *     The tolerance for defining the margin around zero. Must be positive.
	 * 
	 * @return The distance between the points.
	 */
	public static float distanceTo(@MinLength(3) float[] v1, float v2x, float v2y, float v2z, @FloatMinValue(0.0f) float tolerance)
	{
		return distanceTo(v1[0], v1[1], v1[2], v2x, v2y, v2z, tolerance);
	}
	
	/**
	 * Returns the distance from the point given by the origin vector {@code (v1x, v1y, v1z)} to the
	 * point given by the origin vector {@code (v2)}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |v2 - (v1x, v1y, v1z)|}
	 * 
	 * @param v1x
	 *     The value of the x component of the first point.
	 * @param v1y
	 *     The value of the y component of the first point.
	 * @param v1z
	 *     The value of the z component of the first point.
	 * @param v2
	 *     The second point.
	 * 
	 * @return The distance between the points.
	 */
	public static float distanceTo(float v1x, float v1y, float v1z, Tup3RF v2)
	{
		return distanceTo(v1x, v1y, v1z, v2.v0(), v2.v1(), v2.v2());
	}
	
	/**
	 * Returns the distance from the point given by the origin vector {@code (v1x, v1y, v1z)} to the
	 * point given by the origin vector {@code (v2)}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |v2 - (v1x, v1y, v1z)|}
	 * 
	 * @param v1x
	 *     The value of the x component of the first point.
	 * @param v1y
	 *     The value of the y component of the first point.
	 * @param v1z
	 *     The value of the z component of the first point.
	 * @param v2
	 *     The second point.
	 * @param tolerance
	 *     The tolerance for defining the margin around zero. Must be positive.
	 * 
	 * @return The distance between the points.
	 */
	public static float distanceTo(float v1x, float v1y, float v1z, Tup3RF v2, @FloatMinValue(0.0f) float tolerance)
	{
		return distanceTo(v1x, v1y, v1z, v2.v0(), v2.v1(), v2.v2(), tolerance);
	}
	
	/**
	 * Returns the distance from the point given by the origin vector {@code (v1x, v1y, v1z)} to the
	 * point given by the origin vector {@code (v2[0], v2[1], v2[2])}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(v2[0], v2[1], v2[2]) - (v1x, v1y, v1z)|}
	 * 
	 * @param v1x
	 *     The value of the x component of the first point.
	 * @param v1y
	 *     The value of the y component of the first point.
	 * @param v1z
	 *     The value of the z component of the first point.
	 * @param v2
	 *     The second point as an array with at least three entries.
	 * 
	 * @return The distance between the points.
	 */
	public static float distanceTo(float v1x, float v1y, float v1z, @MinLength(3) float[] v2)
	{
		return distanceTo(v1x, v1y, v1z, v2[0], v2[1], v2[2]);
	}
	
	/**
	 * Returns the distance from the point given by the origin vector {@code (v1x, v1y, v1z)} to the
	 * point given by the origin vector {@code (v2[0], v2[1], v2[2])}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(v2[0], v2[1], v2[2]) - (v1x, v1y, v1z)|}
	 * 
	 * @param v1x
	 *     The value of the x component of the first point.
	 * @param v1y
	 *     The value of the y component of the first point.
	 * @param v1z
	 *     The value of the z component of the first point.
	 * @param v2
	 *     The second point as an array with at least three entries.
	 * @param tolerance
	 *     The tolerance for defining the margin around zero. Must be positive.
	 * 
	 * @return The distance between the points.
	 */
	public static float distanceTo(float v1x, float v1y, float v1z, @MinLength(3) float[] v2, @FloatMinValue(0.0f) float tolerance)
	{
		return distanceTo(v1x, v1y, v1z, v2[0], v2[1], v2[2], tolerance);
	}
	
	/**
	 * Returns the distance from the point given by the origin vector {@code (v1x, v1y, v1z)} to the
	 * point given by the origin vector {@code (v2x, v2y, v2z)}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(v2x, v2y, v2z) - (v1x, v1y, v1z)|}
	 * 
	 * @param v1x
	 *     The value of the x component of the first point.
	 * @param v1y
	 *     The value of the y component of the first point.
	 * @param v1z
	 *     The value of the z component of the first point.
	 * @param v2x
	 *     The value of the x component of the second point.
	 * @param v2y
	 *     The value of the y component of the second point.
	 * @param v2z
	 *     The value of the z component of the second point.
	 * 
	 * @return The distance between the points.
	 */
	public static float distanceTo(float v1x, float v1y, float v1z, float v2x, float v2y, float v2z)
	{
		return length(v2x - v1x, v2y - v1y, v2z - v1z);
	}
	
	/**
	 * Returns the distance from the point given by the origin vector {@code (v1x, v1y, v1z)} to the
	 * point given by the origin vector {@code (v2x, v2y, v2z)}. If the values of all components are
	 * within the margin defined by {@code (-tolerance <= value <= tolerance)} around the other
	 * vectors components the result will be zero.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(v2x, v2y, v2z) - (v1x, v1y, v1z)|}
	 * 
	 * @param v1x
	 *     The value of the x component of the first point.
	 * @param v1y
	 *     The value of the y component of the first point.
	 * @param v1z
	 *     The value of the z component of the first point.
	 * @param v2x
	 *     The value of the x component of the second point.
	 * @param v2y
	 *     The value of the y component of the second point.
	 * @param v2z
	 *     The value of the z component of the second point.
	 * @param tolerance
	 *     The tolerance for defining the margin around zero. Must be positive.
	 * 
	 * @return The distance between the points.
	 */
	public static float distanceTo(float v1x, float v1y, float v1z, float v2x, float v2y, float v2z, @FloatMinValue(0.0f) float tolerance)
	{
		return length(v2x - v1x, v2y - v1y, v2z - v1z, tolerance);
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
	public static float squaredDistanceTo(Tup3RF v1, Tup3RF v2)
	{
		return squaredDistanceTo(v1.v0(), v1.v1(), v1.v2(), v2.v0(), v2.v1(), v2.v2());
	}
	
	/**
	 * Returns the squared distance from the point given by the origin vector {@code (v1)} to the
	 * point given by the origin vector {@code (v2[0], v2[1], v2[2])}.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(v2[0], v2[1], v2[2]) - v1|²}
	 * 
	 * @param v1
	 *     The first point.
	 * @param v2
	 *     The second point as an array with at least two entries.
	 * 
	 * @return The squared distance between the points.
	 */
	public static float squaredDistanceTo(Tup3RF v1, @MinLength(2) float[] v2)
	{
		return squaredDistanceTo(v1.v0(), v1.v1(), v1.v2(), v2[0], v2[1], v2[2]);
	}
	
	/**
	 * Returns the squared distance from the point given by the origin vector {@code (v1)} to the
	 * point given by the origin vector {@code (v2x, v2y, v2z)}.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(v2x, v2y, v2z) - v1|²}
	 * 
	 * @param v1
	 *     The first point.
	 * @param v2x
	 *     The value of the x component of the second point.
	 * @param v2y
	 *     The value of the y component of the second point.
	 * @param v2z
	 *     The value of the z component of the second point.
	 * 
	 * @return The squared distance between the points.
	 */
	public static float squaredDistanceTo(Tup3RF v1, float v2x, float v2y, float v2z)
	{
		return squaredDistanceTo(v1.v0(), v1.v1(), v1.v2(), v2x, v2y, v2z);
	}
	
	/**
	 * Returns the squared distance from the point given by the origin vector
	 * {@code (v1[0], v1[1], v1[2])} to the point given by the origin vector {@code (v2)}.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |v2 - (v1[0], v1[1], v1[2])|²}
	 * 
	 * @param v1
	 *     The first point as an array with at least three entries.
	 * @param v2
	 *     The second point.
	 * 
	 * @return The squared distance between the points.
	 */
	public static float squaredDistanceTo(@MinLength(3) float[] v1, Tup3RF v2)
	{
		return squaredDistanceTo(v1[0], v1[1], v1[2], v2.v0(), v2.v1(), v2.v2());
	}
	
	/**
	 * Returns the squared distance from the point given by the origin vector
	 * {@code (v1[0], v1[1], v1[2])} to the point given by the origin vector
	 * {@code (v2[0], v2[1], v2[2])}.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(v2[0], v2[1], v2[2]) - (v1[0], v1[1], v1[2])|²}
	 * 
	 * @param v1
	 *     The first point as an array with at least three entries.
	 * @param v2
	 *     The second point as an array with at least three entries.
	 * 
	 * @return The squared distance between the points.
	 */
	public static float squaredDistanceTo(@MinLength(3) float[] v1, @MinLength(3) float[] v2)
	{
		return squaredDistanceTo(v1[0], v1[1], v1[2], v2[0], v2[1], v2[2]);
	}
	
	/**
	 * Returns the squared distance from the point given by the origin vector
	 * {@code (v1[0], v1[1], v1[2])} to the point given by the origin vector
	 * {@code (v2x, v2y, v2z)}.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(v2x, v2y, v2z) - (v1[0], v1[1], v1[2])|²}
	 * 
	 * @param v1
	 *     The first point as an array with at least three entries.
	 * @param v2x
	 *     The value of the x component of the second point.
	 * @param v2y
	 *     The value of the y component of the second point.
	 * @param v2z
	 *     The value of the z component of the second point.
	 * 
	 * @return The squared distance between the points.
	 */
	public static float squaredDistanceTo(@MinLength(3) float[] v1, float v2x, float v2y, float v2z)
	{
		return squaredDistanceTo(v1[0], v1[1], v1[2], v2x, v2y, v2z);
	}
	
	/**
	 * Returns the squared distance from the point given by the origin vector
	 * {@code (v1x, v1y, v1z)} to the point given by the origin vector {@code (v2)}.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |v2 - (v1x, v1y, v1z)|²}
	 * 
	 * @param v1x
	 *     The value of the x component of the first point.
	 * @param v1y
	 *     The value of the y component of the first point.
	 * @param v1z
	 *     The value of the z component of the first point.
	 * @param v2
	 *     The second point.
	 * 
	 * @return The squared distance between the points.
	 */
	public static float squaredDistanceTo(float v1x, float v1y, float v1z, Tup3RF v2)
	{
		return squaredDistanceTo(v1x, v1y, v1z, v2.v0(), v2.v1(), v2.v2());
	}
	
	/**
	 * Returns the squared distance from the point given by the origin vector
	 * {@code (v1x, v1y, v1z)} to the point given by the origin vector
	 * {@code (v2[0], v2[1], v2[2])}.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(v2[0], v2[1], v2[2]) - (v1x, v1y, v1z)|²}
	 * 
	 * @param v1x
	 *     The value of the x component of the first point.
	 * @param v1y
	 *     The value of the y component of the first point.
	 * @param v1z
	 *     The value of the z component of the first point.
	 * @param v2
	 *     The second point as an array with at least three entries.
	 * 
	 * @return The squared distance between the points.
	 */
	public static float squaredDistanceTo(float v1x, float v1y, float v1z, @MinLength(3) float[] v2)
	{
		return squaredDistanceTo(v1x, v1y, v1z, v2[0], v2[1], v2[2]);
	}
	
	/**
	 * Returns the squared distance from the point given by the origin vector
	 * {@code (v1x, v1y, v1z)} to the point given by the origin vector {@code (v2x, v2y, v2z)}.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(v2x, v2y, v2z) - (v1x, v1y, v1z)|²}
	 * 
	 * @param v1x
	 *     The value of the x component of the first point.
	 * @param v1y
	 *     The value of the y component of the first point.
	 * @param v1z
	 *     The value of the z component of the first point.
	 * @param v2x
	 *     The value of the x component of the second point.
	 * @param v2y
	 *     The value of the y component of the second point.
	 * @param v2z
	 *     The value of the z component of the second point.
	 * 
	 * @return The squared distance between the points.
	 */
	public static float squaredDistanceTo(float v1x, float v1y, float v1z, float v2x, float v2y, float v2z)
	{
		return squaredLength(v2x - v1x, v2y - v1y, v2z - v1z);
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
	public static float inverseDistanceTo(Tup3RF v1, Tup3RF v2)
	{
		return inverseDistanceTo(v1.v0(), v1.v1(), v1.v2(), v2.v0(), v2.v1(), v2.v2());
	}
	
	/**
	 * Returns the inverse distance from the point given by the origin vector {@code (v1)} to the
	 * point given by the origin vector {@code (v2[0], v2[1], v2[2])}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code 1 / |(v2[0], v2[1], v2[2]) - v1|}
	 * 
	 * @param v1
	 *     The first point.
	 * @param v2
	 *     The second point as an array with at least three entries.
	 * 
	 * @return The invers distance between the points.
	 */
	public static float inverseDistanceTo(Tup3RF v1, @MinLength(3) float[] v2)
	{
		return inverseDistanceTo(v1.v0(), v1.v1(), v1.v2(), v2[0], v2[1], v2[2]);
	}
	
	/**
	 * Returns the inverse distance from the point given by the origin vector {@code (v1)} to the
	 * point given by the origin vector {@code (v2x, v2y, v2z)}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code 1 / |(v2x, v2y, v2z) - v1|}
	 * 
	 * @param v1
	 *     The first point.
	 * @param v2x
	 *     The value of the x component of the second point.
	 * @param v2y
	 *     The value of the y component of the second point.
	 * @param v2z
	 *     The value of the z component of the second point.
	 * 
	 * @return The invers distance between the points.
	 */
	public static float inverseDistanceTo(Tup3RF v1, float v2x, float v2y, float v2z)
	{
		return inverseDistanceTo(v1.v0(), v1.v1(), v1.v2(), v2x, v2y, v2z);
	}
	
	/**
	 * Returns the inverse distance from the point given by the origin vector
	 * {@code (v1[0], v1[1], v1[2])} to the point given by the origin vector {@code (v2)}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code 1 / |v2 - (v1[0], v1[1], v1[2])|}
	 * 
	 * @param v1
	 *     The first point as an array with at least three entries.
	 * @param v2
	 *     The second point.
	 * 
	 * @return The invers distance between the points.
	 */
	public static float inverseDistanceTo(@MinLength(3) float[] v1, Tup3RF v2)
	{
		return inverseDistanceTo(v1[0], v1[1], v1[2], v2.v0(), v2.v1(), v2.v2());
	}
	
	/**
	 * Returns the inverse distance from the point given by the origin vector
	 * {@code (v1[0], v1[1], v1[2])} to the point given by the origin vector
	 * {@code (v2[0], v2[1], v2[2])}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code 1 / |(v2[0], v2[1], v2[2]) - (v1[0], v1[1], v1[2])|}
	 * 
	 * @param v1
	 *     The first point as an array with at least three entries.
	 * @param v2
	 *     The second point as an array with at least three entries.
	 * 
	 * @return The invers distance between the points.
	 */
	public static float inverseDistanceTo(@MinLength(3) float[] v1, @MinLength(3) float[] v2)
	{
		return inverseDistanceTo(v1[0], v1[1], v1[2], v2[0], v2[1], v2[2]);
	}
	
	/**
	 * Returns the inverse distance from the point given by the origin vector
	 * {@code (v1[0], v1[1], v1[2])} to the point given by the origin vector
	 * {@code (v2x, v2y, v2z)}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code 1 / |(v2x, v2y, v2z) - (v1[0], v1[1], v1[2])|}
	 * 
	 * @param v1
	 *     The first point as an array with at least three entries.
	 * @param v2x
	 *     The value of the x component of the second point.
	 * @param v2y
	 *     The value of the y component of the second point.
	 * @param v2z
	 *     The value of the z component of the second point.
	 * 
	 * @return The invers distance between the points.
	 */
	public static float inverseDistanceTo(@MinLength(3) float[] v1, float v2x, float v2y, float v2z)
	{
		return inverseDistanceTo(v1[0], v1[1], v1[2], v2x, v2y, v2z);
	}
	
	/**
	 * Returns the inverse distance from the point given by the origin vector
	 * {@code (v1x, v1y, v1z)} to the point given by the origin vector {@code (v2)}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code 1 / |v2 - (v1x, v1y, v1z)|}
	 * 
	 * @param v1x
	 *     The value of the x component of the first point.
	 * @param v1y
	 *     The value of the y component of the first point.
	 * @param v1z
	 *     The value of the z component of the first point.
	 * @param v2
	 *     The second point.
	 * 
	 * @return The invers distance between the points.
	 */
	public static float inverseDistanceTo(float v1x, float v1y, float v1z, Tup3RF v2)
	{
		return inverseDistanceTo(v1x, v1y, v1z, v2.v0(), v2.v1(), v2.v2());
	}
	
	/**
	 * Returns the inverse distance from the point given by the origin vector
	 * {@code (v1x, v1y, v1z)} to the point given by the origin vector
	 * {@code (v2[0], v2[1], v2[2])}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code 1 / |(v2[0], v2[1], v2[2]) - (v1x, v1y, v1z)|}
	 * 
	 * @param v1x
	 *     The value of the x component of the first point.
	 * @param v1y
	 *     The value of the y component of the first point.
	 * @param v1z
	 *     The value of the z component of the first point.
	 * @param v2
	 *     The second point as an array with at least three entries.
	 * 
	 * @return The invers distance between the points.
	 */
	public static float inverseDistanceTo(float v1x, float v1y, float v1z, @MinLength(3) float[] v2)
	{
		return inverseDistanceTo(v1x, v1y, v1z, v2[0], v2[1], v2[2]);
	}
	
	/**
	 * Returns the inverse distance from the point given by the origin vector
	 * {@code (v1x, v1y, v1z)} to the point given by the origin vector {@code (v2x, v2y, v2z)}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code 1 / |(v2x, v2y, v2z) - (v1x, v1y, v1z)|}
	 * 
	 * @param v1x
	 *     The value of the x component of the first point.
	 * @param v1y
	 *     The value of the y component of the first point.
	 * @param v1z
	 *     The value of the z component of the first point.
	 * @param v2x
	 *     The value of the x component of the second point.
	 * @param v2y
	 *     The value of the y component of the second point.
	 * @param v2z
	 *     The value of the z component of the second point.
	 * 
	 * @return The invers distance between the points.
	 */
	public static float inverseDistanceTo(float v1x, float v1y, float v1z, float v2x, float v2y, float v2z)
	{
		return inverseLength(v2x - v1x, v2y - v1y, v2z - v1z);
	}
	
	/**
	 * Rounds the components of the vector {@code (v)} towards the next greater integer and saves
	 * the result in the extraction parameter.
	 * 
	 * @param v
	 *     The vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] ceil(Tup3RF v, @ExtractionParam @MinLength(3) float[] res)
	{
		return ceil(v.v0(), v.v1(), v.v2(), res);
	}
	
	/**
	 * Rounds the components of the vector {@code (v[0], v[1], v[2])} towards the next greater
	 * integer and saves the result in the extraction parameter.
	 * 
	 * @param v
	 *     The vector as an array with at least three entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] ceil(@MinLength(3) float[] v, @ExtractionParam @MinLength(3) float[] res)
	{
		return ceil(v[0], v[1], v[2], res);
	}
	
	/**
	 * Rounds the components of the vector {@code (x, y, z)} towards the next greater integer and
	 * saves the result in the extraction parameter.
	 * 
	 * @param x
	 *     The value of the x component of the vector.
	 * @param y
	 *     The value of the y component of the vector.
	 * @param z
	 *     The value of the z component of the vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] ceil(float x, float y, float z, @ExtractionParam @MinLength(3) float[] res)
	{
		res[0] = (float)Math.ceil(x);
		res[1] = (float)Math.ceil(y);
		res[2] = (float)Math.ceil(z);
		
		return res;
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
	public static <T extends Tup3WF> T ceil(Tup3RF v, @ExtractionParam T res)
	{
		return ceil(v.v0(), v.v1(), v.v2(), res);
	}
	
	/**
	 * Rounds the components of the vector {@code (v[0], v[1], v[2])} towards the next greater
	 * integer and saves the result in the given extraction parameter object.
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v
	 *     The vector as an array with at least three entries.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T ceil(@MinLength(3) float[] v, @ExtractionParam T res)
	{
		return ceil(v[0], v[1], v[2], res);
	}
	
	/**
	 * Rounds the components of the vector {@code (x, y, z)} towards the next greater integer and
	 * saves the result in the given extraction parameter object.
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param x
	 *     The value of the x component of the vector.
	 * @param y
	 *     The value of the y component of the vector.
	 * @param z
	 *     The value of the z component of the vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T ceil(float x, float y, float z, @ExtractionParam T res)
	{
		res.set((float)Math.ceil(x), (float)Math.ceil(y), (float)Math.ceil(z));
		
		return res;
	}
	
	/**
	 * Rounds the components of the vector {@code (v)} towards the next smaller integer and saves
	 * the result in the extraction parameter.
	 * 
	 * @param v
	 *     The vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] floor(Tup3RF v, @ExtractionParam @MinLength(3) float[] res)
	{
		return floor(v.v0(), v.v1(), v.v2(), res);
	}
	
	/**
	 * Rounds the components of the vector {@code (v[0], v[1], v[2])} towards the next smaller
	 * integer and saves the result in the extraction parameter.
	 * 
	 * @param v
	 *     The vector as an array with at least three entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] floor(@MinLength(3) float[] v, @ExtractionParam @MinLength(3) float[] res)
	{
		return floor(v[0], v[1], v[2], res);
	}
	
	/**
	 * Rounds the components of the vector {@code (x, y, z)} towards the next smaller integer and
	 * saves the result in the extraction parameter.
	 * 
	 * @param x
	 *     The value of the x component of the vector.
	 * @param y
	 *     The value of the y component of the vector.
	 * @param z
	 *     The value of the z component of the vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] floor(float x, float y, float z, @ExtractionParam @MinLength(3) float[] res)
	{
		res[0] = (float)Math.floor(x);
		res[1] = (float)Math.floor(y);
		res[2] = (float)Math.floor(z);
		
		return res;
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
	public static <T extends Tup3WF> T floor(Tup3RF v, @ExtractionParam T res)
	{
		return floor(v.v0(), v.v1(), v.v2(), res);
	}
	
	/**
	 * Rounds the components of the vector {@code (v[0], v[1], v[2])} towards the next smaller
	 * integer and saves the result in the given extraction parameter object.
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v
	 *     The vector as an array with at least three entries.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T floor(@MinLength(3) float[] v, @ExtractionParam T res)
	{
		return floor(v[0], v[1], v[2], res);
	}
	
	/**
	 * Rounds the components of the vector {@code (x, y, z)} towards the next smaller integer and
	 * saves the result in the given extraction parameter object.
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param x
	 *     The value of the x component of the vector.
	 * @param y
	 *     The value of the y component of the vector.
	 * @param z
	 *     The value of the z component of the vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T floor(float x, float y, float z, @ExtractionParam T res)
	{
		res.set((float)Math.floor(x), (float)Math.floor(y), (float)Math.floor(z));
		
		return res;
	}
	
	/**
	 * Rounds the components of the vector {@code (v)} and saves the result in the extraction
	 * parameter.
	 * 
	 * @param v
	 *     The vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] round(Tup3RF v, @ExtractionParam @MinLength(3) float[] res)
	{
		return round(v.v0(), v.v1(), v.v2(), res);
	}
	
	/**
	 * Rounds the components of the vector {@code (v[0], v[1], v[2])} and saves the result in the
	 * extraction parameter.
	 * 
	 * @param v
	 *     The vector as an array with at least three entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] round(@MinLength(3) float[] v, @ExtractionParam @MinLength(3) float[] res)
	{
		return round(v[0], v[1], v[2], res);
	}
	
	/**
	 * Rounds the components of the vector {@code (x, y, z)} and saves the result in the extraction
	 * parameter.
	 * 
	 * @param x
	 *     The value of the x component of the vector.
	 * @param y
	 *     The value of the y component of the vector.
	 * @param z
	 *     The value of the z component of the vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] round(float x, float y, float z, @ExtractionParam @MinLength(3) float[] res)
	{
		res[0] = (float)Math.round(x);
		res[1] = (float)Math.round(y);
		res[2] = (float)Math.round(z);
		
		return res;
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
	public static <T extends Tup3WF> T round(Tup3RF v, @ExtractionParam T res)
	{
		return round(v.v0(), v.v1(), v.v2(), res);
	}
	
	/**
	 * Rounds the components of the vector {@code (v[0], v[1], v[2])} and saves the result in the
	 * given extraction parameter object.
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v
	 *     The vector as an array with at least three entries.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T round(@MinLength(3) float[] v, @ExtractionParam T res)
	{
		return round(v[0], v[1], v[2], res);
	}
	
	/**
	 * Rounds the components of the vector {@code (x, y, z)} and saves the result in the given
	 * extraction parameter object.
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param x
	 *     The value of the x component of the vector.
	 * @param y
	 *     The value of the y component of the vector.
	 * @param z
	 *     The value of the z component of the vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T round(float x, float y, float z, @ExtractionParam T res)
	{
		res.set((float)Math.round(x), (float)Math.round(y), (float)Math.round(z));
		
		return res;
	}
	
	/**
	 * Truncates the decimals of the components of the vector {@code (v)} and saves the result in
	 * the extraction parameter.
	 * 
	 * @param v
	 *     The vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] trunc(Tup3RF v, @ExtractionParam @MinLength(3) float[] res)
	{
		return trunc(v.v0(), v.v1(), v.v2(), res);
	}
	
	/**
	 * Truncates the decimals of the components of the vector {@code (v[0], v[1], v[2])} and saves
	 * the result in the extraction parameter.
	 * 
	 * @param v
	 *     The vector as an array with at least three entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] trunc(@MinLength(3) float[] v, @ExtractionParam @MinLength(3) float[] res)
	{
		return trunc(v[0], v[1], v[2], res);
	}
	
	/**
	 * Truncates the decimals of the components of the vector {@code (x, y, z)} and saves the result
	 * in the extraction parameter.
	 * 
	 * @param x
	 *     The value of the x component of the vector.
	 * @param y
	 *     The value of the y component of the vector.
	 * @param z
	 *     The value of the z component of the vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] trunc(float x, float y, float z, @ExtractionParam @MinLength(3) float[] res)
	{
		res[0] = (int)x;
		res[1] = (int)y;
		res[2] = (int)z;
		
		return res;
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
	public static <T extends Tup3WF> T trunc(Tup3RF v, @ExtractionParam T res)
	{
		return trunc(v.v0(), v.v1(), v.v2(), res);
	}
	
	/**
	 * Truncates the decimals of the components of the vector {@code (v[0], v[1], v[2])} and saves
	 * the result in the given extraction parameter object.
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v
	 *     The vector as an array with at least three entries.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T trunc(@MinLength(3) float[] v, @ExtractionParam T res)
	{
		return trunc(v[0], v[1], v[2], res);
	}
	
	/**
	 * Truncates the decimals of the components of the vector {@code (x, y, z)} and saves the result
	 * in the given extraction parameter object.
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param x
	 *     The value of the x component of the vector.
	 * @param y
	 *     The value of the y component of the vector.
	 * @param z
	 *     The value of the z component of the vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T trunc(float x, float y, float z, @ExtractionParam T res)
	{
		res.set((int)x, (int)y, (int)z);
		
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
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] round(Tup3RF v, FloatRoundMethod method, @ExtractionParam @MinLength(3) float[] res)
	{
		return round(v.v0(), v.v1(), v.v2(), res);
	}
	
	/**
	 * Rounds the components of the vector {@code (v[0], v[1], v[2])} using the given method and
	 * saves the result in the extraction parameter.
	 * 
	 * @param v
	 *     The vector as an array with at least three entries.
	 * @param method
	 *     The Method to use for rounding.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] round(@MinLength(3) float[] v, FloatRoundMethod method, @ExtractionParam @MinLength(3) float[] res)
	{
		return round(v[0], v[1], v[2], res);
	}
	
	/**
	 * Rounds the components of the vector {@code (x, y, z)} using the given method and saves the
	 * result in the extraction parameter.
	 * 
	 * @param x
	 *     The value of the x component of the vector.
	 * @param y
	 *     The value of the y component of the vector.
	 * @param z
	 *     The value of the z component of the vector.
	 * @param method
	 *     The Method to use for rounding.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] round(float x, float y, float z, FloatRoundMethod method, @ExtractionParam @MinLength(3) float[] res)
	{
		res[0] = method.round(x);
		res[1] = method.round(y);
		res[2] = method.round(z);
		
		return res;
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
	public static <T extends Tup3WF> T round(Tup3RF v, FloatRoundMethod method, @ExtractionParam T res)
	{
		return round(v.v0(), v.v1(), v.v2(), res);
	}
	
	/**
	 * Rounds the components of the vector {@code (v[0], v[1], v[2])} using the given method and
	 * saves the result in the given extraction parameter object.
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v
	 *     The vector as an array with at least three entries.
	 * @param method
	 *     The Method to use for rounding.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T round(@MinLength(3) float[] v, FloatRoundMethod method, @ExtractionParam T res)
	{
		return round(v[0], v[1], v[2], res);
	}
	
	/**
	 * Rounds the components of the vector {@code (x, y, z)} using the given method and saves the
	 * result in the given extraction parameter object.
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param x
	 *     The value of the x component of the vector.
	 * @param y
	 *     The value of the y component of the vector.
	 * @param z
	 *     The value of the z component of the vector.
	 * @param method
	 *     The Method to use for rounding.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T round(float x, float y, float z, FloatRoundMethod method, @ExtractionParam T res)
	{
		res.set(method.round(x), method.round(y), method.round(z));
		
		return res;
	}
	
	/**
	 * Calculates the absolute value of the component values of the vector {@code (v)} and saves the
	 * result in the extraction parameter.
	 * 
	 * @param v
	 *     The vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] abs(Tup3RF v, @ExtractionParam @MinLength(3) float[] res)
	{
		return abs(v.v0(), v.v1(), v.v2(), res);
	}
	
	/**
	 * Calculates the absolute value of the component values of the vector
	 * {@code (v[0], v[1], v[2])} and saves the result in the extraction parameter.
	 * 
	 * @param v
	 *     The vector as an array with at least three entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] abs(@MinLength(3) float[] v, @ExtractionParam @MinLength(3) float[] res)
	{
		return abs(v[0], v[1], v[2], res);
	}
	
	/**
	 * Calculates the absolute value of the component values of the vector {@code (x, y, z)} and
	 * saves the result in the extraction parameter.
	 * 
	 * @param x
	 *     The value of the x component of the vector.
	 * @param y
	 *     The value of the y component of the vector.
	 * @param z
	 *     The value of the z component of the vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] abs(float x, float y, float z, @ExtractionParam @MinLength(3) float[] res)
	{
		res[0] = Math.abs(x);
		res[1] = Math.abs(y);
		res[2] = Math.abs(z);
		
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
	public static <T extends Tup3WF> T abs(Tup3RF v, @ExtractionParam T res)
	{
		return abs(v.v0(), v.v1(), v.v2(), res);
	}
	
	/**
	 * Calculates the absolute value of the component values of the vector
	 * {@code (v[0], v[1], v[2])} and saves the result in the given extraction parameter object.
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v
	 *     The vector as an array with at least three entries.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T abs(@MinLength(3) float[] v, @ExtractionParam T res)
	{
		return abs(v[0], v[1], v[2], res);
	}
	
	/**
	 * Calculates the absolute value of the component values of the vector {@code (x, y, z)} and
	 * saves the result in the given extraction parameter object.
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param x
	 *     The value of the x component of the vector.
	 * @param y
	 *     The value of the y component of the vector.
	 * @param z
	 *     The value of the z component of the vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T abs(float x, float y, float z, @ExtractionParam T res)
	{
		res.set(Math.abs(x), Math.abs(y), Math.abs(z));
		
		return res;
	}
	
	/**
	 * Calculates the {@link Math#signum(float) signum} of the components of the given vector
	 * {@code (v)} and saves the result in the extraction parameter.
	 * 
	 * @param v
	 *     The vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] signum(Tup3RF v, @ExtractionParam @MinLength(3) float[] res)
	{
		return signum(v.v0(), v.v1(), v.v2(), res);
	}
	
	/**
	 * Calculates the {@link Math#signum(float) signum} of the components of the given vector
	 * {@code (v[0], v[1], v[2])} and saves the result in the extraction parameter.
	 * 
	 * @param v
	 *     The vector as an array with at least three entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] signum(@MinLength(3) float[] v, @ExtractionParam @MinLength(3) float[] res)
	{
		return signum(v[0], v[1], v[2], res);
	}
	
	/**
	 * Calculates the {@link Math#signum(float) signum} of the components of the given vector
	 * {@code (x, y, z)} and saves the result in the extraction parameter.
	 * 
	 * @param x
	 *     The value of the x component of the vector.
	 * @param y
	 *     The value of the y component of the vector.
	 * @param z
	 *     The value of the z component of the vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] signum(float x, float y, float z, @ExtractionParam @MinLength(3) float[] res)
	{
		res[0] = Math.signum(x);
		res[1] = Math.signum(y);
		res[2] = Math.signum(z);
		
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
	 *     The vector as an array with at leaststhree entries.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T signum(Tup3RF v, @ExtractionParam T res)
	{
		return signum(v.v0(), v.v1(), v.v2(), res);
	}
	
	/**
	 * Calculates the {@link Math#signum(float) signum} of the components of the given vector
	 * {@code (v[0], v[1], v[2])} and saves the result in the given extraction parameter object.
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v
	 *     The vector as an array with at least three entries.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T signum(@MinLength(3) float[] v, @ExtractionParam T res)
	{
		return signum(v[0], v[1], v[2], res);
	}
	
	/**
	 * Calculates the {@link Math#signum(float) signum} of the components of the given vector
	 * {@code (x, y, z)} and saves the result in the given extraction parameter object.
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param x
	 *     The value of the x component of the vector.
	 * @param y
	 *     The value of the y component of the vector.
	 * @param z
	 *     The value of the z component of the vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T signum(float x, float y, float z, @ExtractionParam T res)
	{
		res.set(Math.signum(x), Math.signum(y), Math.signum(z));
		
		return res;
	}
	
	/**
	 * Calculates the cross product between the first given vector {@code (v1)} and the second given
	 * vector {@code (v2)} and saves the result in the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1) X (v2)}
	 * 
	 * @param v1
	 *     The first vector.
	 * @param v2
	 *     The second vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] cross(Tup3RF v1, Tup3RF v2, @ExtractionParam @MinLength(3) float[] res)
	{
		return cross(v1.v0(), v1.v1(), v1.v2(), v2.v0(), v2.v1(), v2.v2(), res);
	}
	
	/**
	 * Calculates the cross product between the first given vector {@code (v1)} and the second given
	 * vector {@code (v2[0], v2[1], v2[2])} and saves the result in the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1) X (v2[0], v2[1], v2[2])}
	 * 
	 * @param v1
	 *     The first vector.
	 * @param v2
	 *     The second vector as an array with at least three entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] cross(Tup3RF v1, @MinLength(3) float[] v2, @ExtractionParam @MinLength(3) float[] res)
	{
		return cross(v1.v0(), v1.v1(), v1.v2(), v2[0], v2[1], v2[2], res);
	}
	
	/**
	 * Calculates the cross product between the first given vector {@code (v1)} and the second given
	 * vector {@code (v2x, v2y, v2z)} and saves the result in the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1) X (v2x, v2y, v2z)}
	 * 
	 * @param v1
	 *     The first vector.
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * @param v2z
	 *     The value of the z component of the second vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] cross(Tup3RF v1, float v2x, float v2y, float v2z, @ExtractionParam @MinLength(3) float[] res)
	{
		return cross(v1.v0(), v1.v1(), v1.v2(), v2x, v2y, v2z, res);
	}
	
	/**
	 * Calculates the cross product between the first given vector {@code (v1[0], v1[1], v1[2])} and
	 * the second given vector {@code (v2)} and saves the result in the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1], v1[2]) X (v2)}
	 * 
	 * @param v1
	 *     The first vector as an array with at least three entries.
	 * @param v2
	 *     The second vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] cross(@MinLength(3) float[] v1, Tup3RF v2, @ExtractionParam @MinLength(3) float[] res)
	{
		return cross(v1[0], v1[1], v1[2], v2.v0(), v2.v1(), v2.v2(), res);
	}
	
	/**
	 * Calculates the cross product between the first given vector {@code (v1[0], v1[1], v1[2])} and
	 * the second given vector {@code (v2[0], v2[1], v2[2])} and saves the result in the extraction
	 * parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1], v1[2]) X (v2[0], v2[1], v2[2])}
	 * 
	 * @param v1
	 *     The first vector as an array with at least three entries.
	 * @param v2
	 *     The second vector as an array with at least three entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] cross(@MinLength(3) float[] v1, @MinLength(3) float[] v2, @ExtractionParam @MinLength(3) float[] res)
	{
		return cross(v1[0], v1[1], v1[2], v2[0], v2[1], v2[2], res);
	}
	
	/**
	 * Calculates the cross product between the first given vector {@code (v1[0], v1[1], v1[2])} and
	 * the second given vector {@code (v2x, v2y, v2z)} and saves the result in the extraction
	 * parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1], v1[2]) X (v2x, v2y, v2z)}
	 * 
	 * @param v1
	 *     The first vector as an array with at least three entries.
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * @param v2z
	 *     The value of the z component of the second vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] cross(@MinLength(3) float[] v1, float v2x, float v2y, float v2z, @ExtractionParam @MinLength(3) float[] res)
	{
		return cross(v1[0], v1[1], v1[2], v2x, v2y, v2z, res);
	}
	
	/**
	 * Calculates the cross product between the first given vector {@code (v1x, v1y, v1z)} and the
	 * second given vector {@code (v2)} and saves the result in the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y, v1z) X (v2)}
	 * 
	 * @param v1x
	 *     The value of the x component of the first vector.
	 * @param v1y
	 *     The value of the y component of the first vector.
	 * @param v1z
	 *     The value of the z component of the first vector.
	 * @param v2
	 *     The second vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] cross(float v1x, float v1y, float v1z, Tup3RF v2, @ExtractionParam @MinLength(3) float[] res)
	{
		return cross(v1x, v1y, v1z, v2.v0(), v2.v1(), v2.v2(), res);
	}
	
	/**
	 * Calculates the cross product between the first given vector {@code (v1x, v1y, v1z)} and the
	 * second given vector {@code (v2[0], v2[1], v2[2])} and saves the result in the extraction
	 * parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y, v1z) X (v2[0], v2[1], v2[2])}
	 * 
	 * @param v1x
	 *     The value of the x component of the first vector.
	 * @param v1y
	 *     The value of the y component of the first vector.
	 * @param v1z
	 *     The value of the z component of the first vector.
	 * @param v2
	 *     The second vector as an array with at least three entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] cross(float v1x, float v1y, float v1z, @MinLength(3) float[] v2, @ExtractionParam @MinLength(3) float[] res)
	{
		return cross(v1x, v1y, v1z, v2[0], v2[1], v2[2], res);
	}
	
	/**
	 * Calculates the cross product between the first given vector {@code (v1x, v1y, v1z)} and the
	 * second given vector {@code (v2x, v2y, v2z)} and saves the result in the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y, v1z) X (v2x, v2y, v2z)}
	 * 
	 * @param v1x
	 *     The value of the x component of the first vector.
	 * @param v1y
	 *     The value of the y component of the first vector.
	 * @param v1z
	 *     The value of the z component of the first vector.
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * @param v2z
	 *     The value of the z component of the second vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] cross(float v1x, float v1y, float v1z, float v2x, float v2y, float v2z, @ExtractionParam @MinLength(3) float[] res)
	{
		res[0] = v1y * v2z - v1z * v2y;
		res[1] = v1z * v2x - v1x * v2z;
		res[2] = v1x * v2y - v1y * v2x;
		
		return res;
	}
	
	/**
	 * Calculates the cross product between the first given vector {@code (v1)} and the second given
	 * vector {@code (v2)} and saves the result in the given extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1) X (v2)}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1
	 *     The second vector.
	 * @param v2
	 *     The second vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T cross(Tup3RF v1, Tup3RF v2, @ExtractionParam T res)
	{
		return cross(v1.v0(), v1.v1(), v1.v2(), v2.v0(), v2.v1(), v2.v2(), res);
	}
	
	/**
	 * Calculates the cross product between the first given vector {@code (v1)} and the second given
	 * vector {@code (v2[0], v2[1], v2[2])} and saves the result in the given extraction parameter
	 * object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1) X (v2[0], v2[1], v2[2])}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1
	 *     The second vector.
	 * @param v2
	 *     The second vector as an array with at least three entries.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T cross(Tup3RF v1, @MinLength(3) float[] v2, @ExtractionParam T res)
	{
		return cross(v1.v0(), v1.v1(), v1.v2(), v2[0], v2[1], v2[2], res);
	}
	
	/**
	 * Calculates the cross product between the first given vector {@code (v1)} and the second given
	 * vector {@code (v2x, v2y, v2z)} and saves the result in the given extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1) X (v2x, v2y, v2z)}
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
	 * @param v2z
	 *     The value of the z component of the second vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T cross(Tup3RF v1, float v2x, float v2y, float v2z, @ExtractionParam T res)
	{
		return cross(v1.v0(), v1.v1(), v1.v2(), v2x, v2y, v2z, res);
	}
	
	/**
	 * Calculates the cross product between the first given vector {@code (v1[0], v1[1], v1[2])} and
	 * the second given vector {@code (v2)} and saves the result in the given extraction parameter
	 * object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1], v1[2]) X (v2)}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1
	 *     The second vector as an array with at least three entries.
	 * @param v2
	 *     The second vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T cross(@MinLength(3) float[] v1, Tup3RF v2, @ExtractionParam T res)
	{
		return cross(v1[0], v1[1], v1[2], v2.v0(), v2.v1(), v2.v2(), res);
	}
	
	/**
	 * Calculates the cross product between the first given vector {@code (v1[0], v1[1], v1[2])} and
	 * the second given vector {@code (v2[0], v2[1], v2[2])} and saves the result in the given
	 * extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1], v1[2]) X (v2[0], v2[1], v2[2])}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1
	 *     The second vector as an array with at least three entries.
	 * @param v2
	 *     The second vector as an array with at least three entries.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T cross(@MinLength(3) float[] v1, @MinLength(3) float[] v2, @ExtractionParam T res)
	{
		return cross(v1[0], v1[1], v1[2], v2[0], v2[1], v2[2], res);
	}
	
	/**
	 * Calculates the cross product between the first given vector {@code (v1[0], v1[1], v1[2])} and
	 * the second given vector {@code (v2x, v2y, v2z)} and saves the result in the given extraction
	 * parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1], v1[2]) X (v2x, v2y, v2z)}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1
	 *     The first vector as an array with at least three entries.
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * @param v2z
	 *     The value of the z component of the second vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T cross(@MinLength(3) float[] v1, float v2x, float v2y, float v2z, @ExtractionParam T res)
	{
		return cross(v1[0], v1[1], v1[2], v2x, v2y, v2z, res);
	}
	
	/**
	 * Calculates the cross product between the first given vector {@code (v1x, v1y, v1z)} and the
	 * second given vector {@code (v2)} and saves the result in the given extraction parameter
	 * object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y, v1z) X (v2)}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1x
	 *     The value of the x component of the first vector.
	 * @param v1y
	 *     The value of the y component of the first vector.
	 * @param v1z
	 *     The value of the z component of the first vector.
	 * @param v2
	 *     The second vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T cross(float v1x, float v1y, float v1z, Tup3RF v2, @ExtractionParam T res)
	{
		return cross(v1x, v1y, v1z, v2.v0(), v2.v1(), v2.v2(), res);
	}
	
	/**
	 * Calculates the cross product between the first given vector {@code (v1x, v1y, v1z)} and the
	 * second given vector {@code (v2[0], v2[1], v2[2])} and saves the result in the given
	 * extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y, v1z) X (v2[0], v2[1], v2[2])}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1x
	 *     The value of the x component of the first vector.
	 * @param v1y
	 *     The value of the y component of the first vector.
	 * @param v1z
	 *     The value of the z component of the first vector.
	 * @param v2
	 *     The second vector as an array with at least three entries.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T cross(float v1x, float v1y, float v1z, @MinLength(3) float[] v2, @ExtractionParam T res)
	{
		return cross(v1x, v1y, v1z, v2[0], v2[1], v2[2], res);
	}
	
	/**
	 * Calculates the cross product between the first given vector {@code (v1x, v1y, v1z)} and the
	 * second given vector {@code (v2x, v2y, v2z)} and saves the result in the given extraction
	 * parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y, v1z) X (v2x, v2y, v2z)}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1x
	 *     The value of the x component of the first vector.
	 * @param v1y
	 *     The value of the y component of the first vector.
	 * @param v1z
	 *     The value of the z component of the first vector.
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * @param v2z
	 *     The value of the z component of the second vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T cross(float v1x, float v1y, float v1z, float v2x, float v2y, float v2z, @ExtractionParam T res)
	{
		res.set(v1y * v2z - v1z * v2y, v1z * v2x - v1x * v2z, v1x * v2y - v1y * v2x);
		
		return res;
	}
	
	/**
	 * Transforms the given vector {@code (v)} by the quaternion {@code (q)} and saves the result in
	 * the given extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * q * v * q*
	 * 
	 * @param v
	 *     The vector.
	 * @param q
	 *     The quaternion.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] transformQuat(Tup3RF v, Tup4RF q, @ExtractionParam @MinLength(3) float[] res)
	{
		return transformQuat(v.v0(), v.v1(), v.v2(), q.v0(), q.v1(), q.v2(), q.v3(), res);
	}
	
	/**
	 * Transforms the given vector {@code (v)} by the quaternion {@code (q[0], q[1], q[2], q[3])}
	 * and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * (q[0], q[1], q[2], q[3]) * v * (q[0], q[1], q[2], q[3])*
	 * 
	 * @param v
	 *     The vector.
	 * @param q
	 *     The quaternion as an array with at least four entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] transformQuat(Tup3RF v, @MinLength(4) float[] q, @ExtractionParam @MinLength(3) float[] res)
	{
		return transformQuat(v.v0(), v.v1(), v.v2(), q[0], q[1], q[2], q[3], res);
	}
	
	/**
	 * Transforms the given vector {@code v} by the quaternion {@code (qX, qY, qZ, qW)} and saves
	 * the result in the given extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * (qX, qY, qZ, qw) * v * (qX, qY, qZ, qW)*
	 * 
	 * @param v
	 *     The vector.
	 * @param qW
	 *     The value of the w component of the quaternion.
	 * @param qX
	 *     The value of the x component of the quaternion.
	 * @param qY
	 *     The value of the y component of the quaternion.
	 * @param qZ
	 *     The value of the z component of the quaternion.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] transformQuat(Tup3RF v, float qW, float qX, float qY, float qZ, @ExtractionParam @MinLength(3) float[] res)
	{
		return transformQuat(v.v0(), v.v1(), v.v2(), qW, qX, qY, qZ, res);
	}
	
	/**
	 * Transforms the given vector {@code (v[0], v[1], v[2])} by the quaternion {@code (q)} and
	 * saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * q * (v[0], v[1], v[2]) * q*
	 * 
	 * @param v
	 *     The vector as an array with at least three entries.
	 * @param q
	 *     The quaternion.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] transformQuat(@MinLength(3) float[] v, Tup4RF q, @ExtractionParam @MinLength(3) float[] res)
	{
		return transformQuat(v[0], v[1], v[2], q.v0(), q.v1(), q.v2(), q.v3(), res);
	}
	
	/**
	 * Transforms the given vector {@code (v[0], v[1], v[2])} by the quaternion
	 * {@code (q[0], q[1], q[2], q[3])} and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * (q[0], q[1], q[2], q[3]) * (v[0], v[1], v[2]) * (q[0], q[1], q[2], q[3])*
	 * 
	 * @param v
	 *     The vector as an array with at least three entries.
	 * @param q
	 *     The quaternion as an array with at least four entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] transformQuat(@MinLength(3) float[] v, @MinLength(4) float[] q, @ExtractionParam @MinLength(3) float[] res)
	{
		return transformQuat(v[0], v[1], v[2], q[0], q[1], q[2], q[3], res);
	}
	
	/**
	 * Transforms the given vector {@code (v[0], v[1], v[2])} by the quaternion
	 * {@code (qX, qY, qZ, qW)} and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * (qX, qY, qZ, qw) * (v[0], v[1], v[2]) * (qX, qY, qZ, qW)*
	 * 
	 * @param v
	 *     The vector as an array with at least three entries.
	 * @param qW
	 *     The value of the w component of the quaternion.
	 * @param qX
	 *     The value of the x component of the quaternion.
	 * @param qY
	 *     The value of the y component of the quaternion.
	 * @param qZ
	 *     The value of the z component of the quaternion.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] transformQuat(@MinLength(3) float[] v, float qW, float qX, float qY, float qZ, @ExtractionParam @MinLength(3) float[] res)
	{
		return transformQuat(v[0], v[1], v[2], qW, qX, qY, qZ, res);
	}
	
	/**
	 * Transforms the given vector {@code (vX, vY, vZ)} by the quaternion {@code (q)} and saves the
	 * result in the given extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * q * (vX, vY, vZ) * q*
	 * 
	 * @param vX
	 *     The value of the x component of the vector.
	 * @param vY
	 *     The value of the y component of the vector.
	 * @param vZ
	 *     The value of the z component of the vector.
	 * @param q
	 *     The quaternion.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] transformQuat(float vX, float vY, float vZ, Tup4RF q, @ExtractionParam @MinLength(3) float[] res)
	{
		return transformQuat(vX, vY, vZ, q.v0(), q.v1(), q.v2(), q.v3(), res);
	}
	
	/**
	 * Transforms the given vector {@code (vX, vY, vZ)} by the quaternion
	 * {@code (q[0], q[1], q[2], q[3])} and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * (q[0], q[1], q[2], q[3]) * (vX, vY, vZ) * (q[0], q[1], q[2], q[3])*
	 * 
	 * @param vX
	 *     The value of the x component of the vector.
	 * @param vY
	 *     The value of the y component of the vector.
	 * @param vZ
	 *     The value of the z component of the vector.
	 * @param q
	 *     The quaternion as an array with at least four entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] transformQuat(float vX, float vY, float vZ, @MinLength(4) float[] q, @ExtractionParam @MinLength(3) float[] res)
	{
		return transformQuat(vX, vY, vZ, q[0], q[1], q[2], q[3], res);
	}
	
	/**
	 * Transforms the given vector {@code (vX, vY, vZ)} by the quaternion {@code (qX, qY, qZ, qW)}
	 * and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * (qX, qY, qZ, qw) * (vX, vY, vZ) * (qX, qY, qZ, qW)*
	 * 
	 * @param vX
	 *     The value of the x component of the vector.
	 * @param vY
	 *     The value of the y component of the vector.
	 * @param vZ
	 *     The value of the z component of the vector.
	 * @param qW
	 *     The value of the w component of the quaternion.
	 * @param qX
	 *     The value of the x component of the quaternion.
	 * @param qY
	 *     The value of the y component of the quaternion.
	 * @param qZ
	 *     The value of the z component of the quaternion.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] transformQuat(float vX, float vY, float vZ, float qW, float qX, float qY, float qZ, @ExtractionParam @MinLength(3) float[] res)
	{
		float[] conjugate = QuatfUtils.conjugate(qW, qX, qY, qZ, new float[4]);
		float[] result = QuatfUtils.mulUnnormalized(qW, qX, qY, qZ, vX, vY, vZ, 0.0f, new float[4]);
		result = QuatfUtils.mulUnnormalized(result, conjugate, result);
		
		res[0] = result[1];
		res[1] = result[2];
		res[2] = result[3];
		
		return res;
	}
	
	/**
	 * Transforms the given vector {@code (v)} by the quaternion {@code (q)} and saves the result in
	 * the given extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * q * v * q*
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v
	 *     The vector.
	 * @param q
	 *     The quaternion.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T transformQuat(Tup3RF v, Tup4RF q, @ExtractionParam T res)
	{
		return transformQuat(v.v0(), v.v1(), v.v2(), q.v0(), q.v1(), q.v2(), q.v3(), res);
	}
	
	/**
	 * Transforms the given vector {@code (v)} by the quaternion {@code (q[0], q[1], q[2], q[3])}
	 * and saves the result in the given extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * (q[0], q[1], q[2], q[3]) * v * (q[0], q[1], q[2], q[3])*
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v
	 *     The vector.
	 * @param q
	 *     The quaternion as an array with at least four entries.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T transformQuat(Tup3RF v, @MinLength(4) float[] q, @ExtractionParam T res)
	{
		return transformQuat(v.v0(), v.v1(), v.v2(), q[0], q[1], q[2], q[3], res);
	}
	
	/**
	 * Transforms the given vector {@code v} by the quaternion {@code (qX, qY, qZ, qW)} and saves
	 * the result in the given extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * (qX, qY, qZ, qw) * v * (qX, qY, qZ, qW)*
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v
	 *     The vector.
	 * @param qW
	 *     The value of the w component of the quaternion.
	 * @param qX
	 *     The value of the x component of the quaternion.
	 * @param qY
	 *     The value of the y component of the quaternion.
	 * @param qZ
	 *     The value of the z component of the quaternion.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T transformQuat(Tup3RF v, float qW, float qX, float qY, float qZ, @ExtractionParam T res)
	{
		return transformQuat(v.v0(), v.v1(), v.v2(), qW, qX, qY, qZ, res);
	}
	
	/**
	 * Transforms the given vector {@code (v[0], v[1], v[2])} by the quaternion {@code (q)} and
	 * saves the result in the given extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * q * (v[0], v[1], v[2]) * q*
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v
	 *     The vector as an array with at least three entries.
	 * @param q
	 *     The quaternion.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T transformQuat(@MinLength(3) float[] v, Tup4RF q, @ExtractionParam T res)
	{
		return transformQuat(v[0], v[1], v[2], q.v0(), q.v1(), q.v2(), q.v3(), res);
	}
	
	/**
	 * Transforms the given vector {@code (v[0], v[1], v[2])} by the quaternion
	 * {@code (q[0], q[1], q[2], q[3])} and saves the result in the given extraction parameter
	 * object.
	 * 
	 * <p>
	 * Operation:<br>
	 * (q[0], q[1], q[2], q[3]) * (v[0], v[1], v[2]) * (q[0], q[1], q[2], q[3])*
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v
	 *     The vector as an array with at least three entries.
	 * @param q
	 *     The quaternion as an array with at least four entries.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T transformQuat(@MinLength(3) float[] v, @MinLength(4) float[] q, @ExtractionParam T res)
	{
		return transformQuat(v[0], v[1], v[2], q[0], q[1], q[2], q[3], res);
	}
	
	/**
	 * Transforms the given vector {@code (v[0], v[1], v[2])} by the quaternion
	 * {@code (qX, qY, qZ, qW)} and saves the result in the given extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * (qX, qY, qZ, qw) * (v[0], v[1], v[2]) * (qX, qY, qZ, qW)*
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v
	 *     The vector as an array with at least three entries.
	 * @param qW
	 *     The value of the w component of the quaternion.
	 * @param qX
	 *     The value of the x component of the quaternion.
	 * @param qY
	 *     The value of the y component of the quaternion.
	 * @param qZ
	 *     The value of the z component of the quaternion.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T transformQuat(@MinLength(3) float[] v, float qW, float qX, float qY, float qZ, @ExtractionParam T res)
	{
		return transformQuat(v[0], v[1], v[2], qW, qX, qY, qZ, res);
	}
	
	/**
	 * Transforms the given vector {@code (vX, vY, vZ)} by the quaternion {@code (q)} and saves the
	 * result in the given extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * q * (vX, vY, vZ) * q*
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param vX
	 *     The value of the x component of the vector.
	 * @param vY
	 *     The value of the y component of the vector.
	 * @param vZ
	 *     The value of the z component of the vector.
	 * @param q
	 *     The quaternion.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T transformQuat(float vX, float vY, float vZ, Tup4RF q, @ExtractionParam T res)
	{
		return transformQuat(vX, vY, vZ, q.v0(), q.v1(), q.v2(), q.v3(), res);
	}
	
	/**
	 * Transforms the given vector {@code (vX, vY, vZ)} by the quaternion
	 * {@code (q[0], q[1], q[2], q[3])} and saves the result in the given extraction parameter
	 * object.
	 * 
	 * <p>
	 * Operation:<br>
	 * (q[0], q[1], q[2], q[3]) * (vX, vY, vZ) * (q[0], q[1], q[2], q[3])*
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param vX
	 *     The value of the x component of the vector.
	 * @param vY
	 *     The value of the y component of the vector.
	 * @param vZ
	 *     The value of the z component of the vector.
	 * @param q
	 *     The quaternion as an array with at least four entries.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T transformQuat(float vX, float vY, float vZ, @MinLength(4) float[] q, @ExtractionParam T res)
	{
		return transformQuat(vX, vY, vZ, q[0], q[1], q[2], q[3], res);
	}
	
	/**
	 * Transforms the given vector {@code (vX, vY, vZ)} by the quaternion {@code (qX, qY, qZ, qW)}
	 * and saves the result in the given extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * (qX, qY, qZ, qw) * (vX, vY, vZ) * (qX, qY, qZ, qW)*
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param vX
	 *     The value of the x component of the vector.
	 * @param vY
	 *     The value of the y component of the vector.
	 * @param vZ
	 *     The value of the z component of the vector.
	 * @param qW
	 *     The value of the w component of the quaternion.
	 * @param qX
	 *     The value of the x component of the quaternion.
	 * @param qY
	 *     The value of the y component of the quaternion.
	 * @param qZ
	 *     The value of the z component of the quaternion.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3WF> T transformQuat(float vX, float vY, float vZ, float qW, float qX, float qY, float qZ, @ExtractionParam T res)
	{
		float[] conjugate = QuatfUtils.conjugate(qW, qX, qY, qZ, new float[4]);
		float[] result = QuatfUtils.mulUnnormalized(qW, qX, qY, qZ, vX, vY, vZ, 0.0f, new float[4]);
		result = QuatfUtils.mulUnnormalized(result, conjugate, result);
		
		res.set(result[1], result[2], result[3]);
		
		return res;
	}
	
	public static float[] transformMat4(Tup3RF v, boolean useW, SimpleMat4fR m, float[] res)
	{
		return transformMat4(v.v0(), v.v1(), v.v2(), useW, m.toArray(), res);
	}
	
	public static float[] transformMat4(Tup3RF v, boolean useW, float[][] m, float[] res)
	{
		return transformMat4(v.v0(), v.v1(), v.v2(), useW, m, res);
	}
	
	public static float[] transformMat4(float[] v, boolean useW, SimpleMat4fR m, float[] res)
	{
		return transformMat4(v[0], v[1], v[2], useW, m.toArray(), res);
	}
	
	public static float[] transformMat4(float[] v, boolean useW, float[][] m, float[] res)
	{
		return transformMat4(v[0], v[1], v[2], useW, m, res);
	}
	
	public static float[] transformMat4(float vX, float vY, float vZ, boolean useW, SimpleMat4fR m, float[] res)
	{
		return transformMat4(vX, vY, vZ, useW, m.toArray(), res);
	}
	
	public static float[] transformMat4(float vX, float vY, float vZ, boolean useW, float[][] m, float[] res)
	{
		float x_ = m[0][0] * vX + m[0][1] * vY + m[0][2] * vZ;
		float y_ = m[1][0] * vX + m[1][1] * vY + m[1][2] * vZ;
		float z_ = m[2][0] * vX + m[2][1] * vY + m[2][2] * vZ;

		if(useW)
		{
			x_ += m[0][3];
			y_ += m[1][3];
			z_ += m[2][3];
		}
		
		res[0] = x_;
		res[1] = y_;
		res[2] = z_;

		return res;
	}
	
	public static <T extends Tup3WF> T transformMat4(Tup3RF v, boolean useW, SimpleMat4fR m, T res)
	{
		return transformMat4(v.v0(), v.v1(), v.v2(), useW, m.toArray(), res);
	}
	
	public static <T extends Tup3WF> T transformMat4(Tup3RF v, boolean useW, float[][] m, T res)
	{
			return transformMat4(v.v0(), v.v1(), v.v2(), useW, m, res);
	}
	
	public static <T extends Tup3WF> T transformMat4(float[] v, boolean useW, SimpleMat4fR m, T res)
	{
		return transformMat4(v[0], v[1], v[2], useW, m.toArray(), res);
	}
	
	public static <T extends Tup3WF> T transformMat4(float[] v, boolean useW, float[][] m, T res)
	{
			return transformMat4(v[0], v[1], v[2], useW, m, res);
	}
	
	public static <T extends Tup3WF> T transformMat4(float vX, float vY, float vZ, boolean useW, SimpleMat4fR m, T res)
	{
		return transformMat4(vX, vY, vZ, useW, m.toArray(), res);
	}
	
	public static <T extends Tup3WF> T transformMat4(float vX, float vY, float vZ, boolean useW, float[][] m, T res)
	{
		float x_ = m[0][0] * vX + m[0][1] * vY + m[0][2] * vZ;
		float y_ = m[1][0] * vX + m[1][1] * vY + m[1][2] * vZ;
		float z_ = m[2][0] * vX + m[2][1] * vY + m[2][2] * vZ;

		if(useW)
		{
			x_ += m[0][3];
			y_ += m[1][3];
			z_ += m[2][3];
		}
		
		res.set(x_, y_, z_);

		return res;
	}
}
