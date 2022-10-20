package org.barghos.math.api.vector;

import org.barghos.core.api.documentation.ExtractionParam;
import org.barghos.core.api.documentation.InlineOnly;
import org.barghos.core.api.documentation.MinLength;
import org.barghos.core.api.math.BarghosMath;
import org.barghos.math.api.util.ComponentValueFloat;

/**
 * This class provides utilities for working with 3-dimensional float vectors.
 * 
 * @author picatrix1899
 */
public class Vec3fUtil
{
	/**
	 * Adds the second given vector {@code (v2)} to the first given vector {@code (v1)} and saves the result in the given result array.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the arrays
	 * have to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 + v2}
	 * 
	 * @param v1 The first vector.
	 * @param v2 The second vector.
	 * @param res The result array. Minimum legth: 3.
	 * 
	 * @return The result array with the result.
	 */
	public static float[] add(Vec3fR v1, Vec3fR v2, @ExtractionParam @MinLength(3) float[] res)
	{
		addInternal(v1.getX(), v1.getY(), v1.getZ(), v2.getX(), v2.getY(), v2.getZ(), res);
		
		return res;
	}
	
	/**
	 * Adds the second given vector {@code (v2[0], v2[1], v2[2])} to the first given vector {@code (v1)} and saves the result in the given result array.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the arrays
	 * have to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 + (v2[0], v2[1], v2[2])}
	 * 
	 * @param v1 The first vector.
	 * @param v2 The second vector. Minimum legth: 3.
	 * @param res The result array. Minimum legth: 3.
	 * 
	 * @return The result array with the result.
	 */
	public static float[] add(Vec3fR v1, @MinLength(3) float[] v2, @ExtractionParam @MinLength(3) float[] res)
	{
		addInternal(v1.getX(), v1.getY(), v1.getZ(), v2[0], v2[1], v2[2], res);
		
		return res;
	}
	
	/**
	 * Adds the second given vector {@code (v2x, v2y, v2z)} to the first given vector {@code (v1)} and saves the result in the given result array.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the arrays
	 * have to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 + (v2x, v2y, v2z)}
	 * 
	 * @param v1 The first vector.
	 * @param v2x The value )of the x component of the second vector.
	 * @param v2y The value of the y component of the second vector.
	 * @param v2z The value of the z component of the second vector.
	 * @param res The result array. Minimum legth: 3.
	 * 
	 * @return The result array with the result.
	 */
	public static float[] add(Vec3fR v1, float v2x, float v2y, float v2z, @ExtractionParam @MinLength(3) float[] res)
	{
		addInternal(v1.getX(), v1.getY(), v1.getZ(), v2x, v2y, v2z, res);
		
		return res;
	}
	
	/**
	 * Adds the second given vector {@code (v2)} to the first given vector {@code (v1[0], v1[1], v1[2])} and saves the result in the given result array.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the arrays
	 * have to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1], v1[2]) + v2}
	 * 
	 * @param v1 The first vector. Minimum legth: 3.
	 * @param v2 The second vector.
	 * @param res The result array. Minimum legth: 3.
	 * 
	 * @return The result array with the result.
	 */
	public static float[] add(@MinLength(3) float[] v1, Vec3fR v2, @ExtractionParam @MinLength(3) float[] res)
	{
		addInternal(v1[0], v1[1], v1[2], v2.getX(), v2.getY(), v2.getZ(), res);
		
		return res;
	}
	
	/**
	 * Adds the second given vector {@code (v2[0], v2[1], v2[2])} to the first given vector {@code (v1[0], v1[1], v1[2])} and saves the result in the given result array.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the arrays
	 * have to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1], v1[2]) + (v2[0], v2[1], v2[2])}
	 * 
	 * @param v1 The first vector. Minimum legth: 3.
	 * @param v2 The second vector. Minimum legth: 3.
	 * @param res The result array. Minimum legth: 3.
	 * 
	 * @return The result array with the result.
	 */
	public static float[] add(@MinLength(3) float[] v1, @MinLength(3) float[] v2, @ExtractionParam @MinLength(3) float[] res)
	{
		addInternal(v1[0], v1[1], v1[2], v2[0], v2[1], v2[2], res);
		
		return res;
	}
	
	/**
	 * Adds the second given vector {@code (v2x, v2y, v2z)} to the first given vector {@code (v1[0], v1[1], v1[2])} and saves the result in the given result array.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the arrays
	 * have to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1], v1[2]) + (v2x, v2y, v2z)}
	 * 
	 * @param v1 The first vector. Minimum legth: 3.
	 * @param v2x The value of the x component of the second vector.
	 * @param v2y The value of the y component of the second vector.
	 * @param v2z The value of the z component of the second vector.
	 * @param res The result array. Minimum legth: 3.
	 * 
	 * @return The result array with the result.
	 */
	public static float[] add(@MinLength(3) float[] v1, float v2x, float v2y, float v2z, @ExtractionParam @MinLength(3) float[] res)
	{
		addInternal(v1[0], v1[1], v1[2], v2x, v2y, v2z, res);
		
		return res;
	}
	
	/**
	 * Adds the second given vector {@code (v2)} to the first given vector {@code (v1x, v1y, v1z)} and saves the result in the given result array.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the arrays
	 * have to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y, v1z) + v2}
	 * 
	 * @param v1x The value of the x component of the first vector.
	 * @param v1y The value of the y component of the first vector.
	 * @param v1z The value of the z component of the first vector.
	 * @param v2 The second vector.
	 * @param res The result array. Minimum legth: 3.
	 * 
	 * @return The result array with the result.
	 */
	public static float[] add(float v1x, float v1y, float v1z, Vec3fR v2, @ExtractionParam @MinLength(3) float[] res)
	{
		addInternal(v1x, v1y, v1z, v2.getX(), v2.getY(), v2.getZ(), res);
		
		return res;
	}
	
	/**
	 * Adds the second given vector {@code (v2[0], v2[1], v2[2])} to the first given vector {@code (v1x, v1y, v1z)} and saves the result in the given result array.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the arrays
	 * have to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y, v1z) + (v2[0], v2[1], v2[2])}
	 * 
	 * @param v1x The value of the x component of the first vector.
	 * @param v1y The value of the y component of the first vector.
	 * @param v1z The value of the z component of the first vector.
	 * @param v2 The second vector. Minimum legth: 3.
	 * @param res The result array. Minimum legth: 3.
	 * 
	 * @return The result array with the result.
	 */
	public static float[] add(float v1x, float v1y, float v1z, @MinLength(3) float[] v2, @ExtractionParam @MinLength(3) float[] res)
	{
		addInternal(v1x, v1y, v1z, v2[0], v2[1], v2[2], res);
		
		return res;
	}
	
	/**
	 * Adds the second given vector {@code (v2x, v2y, v2z)} to the first given vector {@code (v1x, v1y, v1z)} and saves the result in the given result array.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the arrays
	 * have to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y, v1z) + (v2x, v2y, v2z)}
	 * 
	 * @param v1x The value of the x component of the first vector.
	 * @param v1y The value of the y component of the first vector.
	 * @param v1z The value of the z component of the first vector.
	 * @param v2x The value of the x component of the second vector.
	 * @param v2y The value of the y component of the second vector.
	 * @param v2z The value of the z component of the second vector.
	 * @param res The result array. Minimum legth: 3.
	 * 
	 * @return The result array with the result.
	 */
	public static float[] add(float v1x, float v1y, float v1z, float v2x, float v2y, float v2z, @ExtractionParam @MinLength(3) float[] res)
	{
		addInternal(v1x, v1y, v1z, v2x, v2y, v2z, res);
		
		return res;
	}
	
	/**
	 * Only for better maintainability.
	 * 
	 * <p>
	 * Adds the second given vector {@code (v2x, v2y, v2z)} to the first given vector {@code (v1x, v1y, v1z)} and saves the result in the given result array.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the arrays
	 * have to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y, v1z) + (v2x, v2y, v2z)}
	 * 
	 * @param v1x The value of the x component of the first vector.
	 * @param v1y The value of the y component of the first vector.
	 * @param v1z The value of the z component of the first vector.
	 * @param v2x The value of the x component of the second vector.
	 * @param v2y The value of the y component of the second vector.
	 * @param v2z The value of the z component of the second vector.
	 * @param res The result array. Minimum legth: 3.
	 */
	@InlineOnly
	private static void addInternal(float v1x, float v1y, float v1z, float v2x, float v2y, float v2z, @ExtractionParam @MinLength(3) float[] res)
	{
		res[0] = v1x + v2x;
		res[1] = v1y + v2y;
		res[2] = v1z + v2z;
	}
	
	/**
	 * Adds the second given vector {@code (v2)} to the first given vector {@code (v1)}
	 * and saves the result in the given result vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 + v2}
	 * 
	 * @param <T> The type of the result vector.
	 * 
	 * @param v1 The first vector.
	 * @param v2 The second vector.
	 * @param res The result vector.
	 * 
	 * @return The result vector with the result.
	 */
	public static <T extends Vec3fC> T add(Vec3fR v1,  Vec3fR v2, @ExtractionParam T res)
	{
		addInternal(v1.getX(), v1.getY(), v1.getZ(), v2.getX(), v2.getY(), v2.getZ(), res);
		
		return res;
	}
	
	/**
	 * Adds the second given vector {@code (v2[0], v2[1], v2[2])} to the first given vector {@code (v1)}
	 * and saves the result in the given result vector.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the arrays
	 * have to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 + (v2[0], v2[1], v2[2])}
	 * 
	 * @param <T> The type of the result vector.
	 * 
	 * @param v1 The first vector.
	 * @param v2 The second vector. Minimum legth: 3.
	 * @param res The result vector.
	 * 
	 * @return The result vector with the result.
	 */
	public static <T extends Vec3fC> T add(Vec3fR v1, @MinLength(3) float[] v2, @ExtractionParam T res)
	{
		addInternal(v1.getX(), v1.getY(), v1.getZ(), v2[0], v2[1], v2[2], res);

		return res;
	}
	
	/**
	 * Adds the second given vector {@code (v2x, v2y, v2z)} to the first given vector {@code (v1)}
	 * and saves the result in the given result vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 + (v2x, v2y, v2z)}
	 * 
	 * @param <T> The type of the result vector.
	 * 
	 * @param v1 The first vector.
	 * @param v2x The value of the x component of the second vector.
	 * @param v2y The value of the y component of the second vector.
	 * @param v2z The value of the z component of the second vector.
	 * @param res The result vector.
	 * 
	 * @return The result vector with the result.
	 */
	public static <T extends Vec3fC> T add(Vec3fR v1, float v2x, float v2y, float v2z, @ExtractionParam T res)
	{
		addInternal(v1.getX(), v1.getY(), v1.getZ(), v2x, v2y, v2z, res);

		return res;
	}
	
	/**
	 * Adds the second given vector {@code (v2)} to the first given vector {@code (v1[0], v1[1], v1[2])}
	 * and saves the result in the given result vector.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the arrays
	 * have to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1], v1[2]) + v2}
	 * 
	 * @param <T> The type of the result vector.
	 * 
	 * @param v1 The first vector. Minimum legth: 3.
	 * @param v2 The second vector.
	 * @param res The result vector.
	 * 
	 * @return The result vector with the result.
	 */
	public static <T extends Vec3fC> T add(@MinLength(3) float[] v1, Vec3fR v2, @ExtractionParam T res)
	{
		addInternal(v1[0], v1[1], v1[2], v2.getX(), v2.getY(), v2.getZ(), res);

		return res;
	}
	
	/**
	 * Adds the second given vector {@code (v2[0], v2[1], v2[2])} to the first given vector {@code (v1[0], v1[1], v1[2])}
	 * and saves the result in the given result vector.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the arrays
	 * have to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1], v1[2]) + (v2[0], v2[1], v2[2])}
	 * 
	 * @param <T> The type of the result vector.
	 * 
	 * @param v1 The first vector. Minimum legth: 3.
	 * @param v2 The second vector. Minimum legth: 3.
	 * @param res The result vector.
	 * 
	 * @return The result vector with the result.
	 */
	public static <T extends Vec3fC> T add(@MinLength(3) float[] v1, @MinLength(3) float[] v2, @ExtractionParam T res)
	{
		addInternal(v1[0], v1[1], v1[2], v2[0], v2[1], v2[2], res);

		return res;
	}
	
	/**
	 * Adds the second given vector {@code (v2x, v2y, v2z)} to the first given vector {@code (v1[0], v1[1], v1[2])}
	 * and saves the result in the given result vector.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the arrays
	 * have to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1], v1[2]) + (v2x, v2y, v2z)}
	 * 
	 * @param <T> The type of the result vector.
	 * 
	 * @param v1 The first vector. Minimum legth: 3.
	 * @param v2x The value of the x component of the second vector.
	 * @param v2y The value of the y component of the second vector.
	 * @param v2z The value of the z component of the second vector.
	 * @param res The result vector.
	 * 
	 * @return The result vector with the result.
	 */
	public static <T extends Vec3fC> T add(@MinLength(3) float[] v1, float v2x, float v2y, float v2z, @ExtractionParam T res)
	{
		addInternal(v1[0], v1[1], v1[2], v2x, v2y, v2z, res);

		return res;
	}
	
	/**
	 * Adds the second given vector {@code (v2)} to the first given vector {@code (v1x, v1y, v1z)}
	 * and saves the result in the given result vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y, v1z) + v2}
	 * 
	 * @param <T> The type of the result vector.
	 * 
	 * @param v1x The value of the x component of the first vector.
	 * @param v1y The value of the y component of the first vector.
	 * @param v1z The value of the z component of the first vector.
	 * @param v2 The second vector.
	 * @param res The result vector.
	 * 
	 * @return The result vector with the result.
	 */
	public static <T extends Vec3fC> T add(float v1x, float v1y, float v1z, Vec3fR v2, @ExtractionParam T res)
	{
		addInternal(v1x, v1y, v1z, v2.getX(), v2.getY(), v2.getZ(), res);

		return res;
	}
	
	/**
	 * Adds the second given vector {@code (v2[0], v2[1], v2[2])} to the first given vector {@code (v1x, v1y, v1z)}
	 * and saves the result in the given result vector.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the arrays
	 * have to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y, v1z) + (v2[0], v2[1], v2[2])}
	 * 
	 * @param <T> The type of the result vector.
	 * 
	 * @param v1x The value of the x component of the first vector.
	 * @param v1y The value of the y component of the first vector.
	 * @param v1z The value of the z component of the first vector.
	 * @param v2 The second vector. Minimum legth: 3.
	 * @param res The result vector.
	 * 
	 * @return The result vector with the result.
	 */
	public static <T extends Vec3fC> T add(float v1x, float v1y, float v1z, @MinLength(3) float[] v2, @ExtractionParam T res)
	{
		addInternal(v1x, v1y, v1z, v2[0], v2[1], v2[2], res);
		
		return res;
	}
	
	/**
	 * Adds the second given vector {@code (v2x, v2y, v2z)} to the first given vector {@code (v1x, v1y, v1z)}
	 * and saves the result in the given result vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y, v1z) + (v2x, v2y, v2z)}
	 * 
	 * @param <T> The type of the result vector.
	 * 
	 * @param v1x The value of the x component of the first vector.
	 * @param v1y The value of the y component of the first vector.
	 * @param v1z The value of the z component of the first vector.
	 * @param v2x The value of the x component of the second vector.
	 * @param v2y The value of the y component of the second vector.
	 * @param v2z The value of the z component of the second vector.
	 * @param res The result vector.
	 * 
	 * @return The result vector with the result.
	 */
	public static <T extends Vec3fC> T add(float v1x, float v1y, float v1z, float v2x, float v2y, float v2z, @ExtractionParam T res)
	{
		addInternal(v1x, v1y, v1z, v2x, v2y, v2z, res);
		
		return res;
	}
	
	/**
	 * Only for better maintainability.
	 * 
	 * <p>
	 * Adds the second given vector {@code (v2x, v2y, v2z)} to the first given vector {@code (v1x, v1y, v1z)}
	 * and saves the result in the given result vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y, v1z) + (v2x, v2y, v2z)}
	 * 
	 * @param v1x The value of the x component of the first vector.
	 * @param v1y The value of the y component of the first vector.
	 * @param v1z The value of the z component of the first vector.
	 * @param v2x The value of the x component of the second vector.
	 * @param v2y The value of the y component of the second vector.
	 * @param v2z The value of the z component of the second vector.
	 * @param res The result vector.
	 */
	@InlineOnly
	private static void addInternal(float v1x, float v1y, float v1z, float v2x, float v2y, float v2z, @ExtractionParam Vec3fC res)
	{
		res.set(v1x + v2x, v1y + v2y, v1z + v2z);
	}
	
	/**
	 * Subtracts the second given vector {@code (v2)} from the first given vector {@code (v1)}
	 * and saves the result in the given result array.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the arrays
	 * have to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 - v2}
	 * 
	 * 
	 * @param v1 The first vector.
	 * @param v2 The second vector.
	 * @param res The result array. Minimum legth: 3.
	 * 
	 * @return The result array with the result.
	 */
	public static float[] sub(Vec3fR v1, Vec3fR v2, @ExtractionParam @MinLength(3) float[] res)
	{
		subInternal(v1.getX(), v1.getY(), v1.getZ(), v2.getX(), v2.getY(), v2.getZ(), res);
		
		return res;
	}
	
	/**
	 * Subtracts the second given vector {@code (v2[0], v2[1], v2[2])} from the first given vector {@code (v1)}
	 * and saves the result in the given result array.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the arrays
	 * have to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 - (v2[0], v2[1], v2[2])}
	 * 
	 * @param v1 The first vector.
	 * @param v2 The second vector. Minimum legth: 3.
	 * @param res The result array. Minimum legth: 3.
	 * 
	 * @return The result array with the result.
	 */
	public static float[] sub(Vec3fR v1, @MinLength(3) float[] v2, @ExtractionParam @MinLength(3) float[] res)
	{
		subInternal(v1.getX(), v1.getY(), v1.getZ(), v2[0], v2[1], v2[2], res);
		
		return res;
	}
	
	/**
	 * Subtracts the second given vector {@code (v2x, v2y, v2z)} from the first given vector {@code (v1)}
	 * and saves the result in the given result array.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the arrays
	 * have to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 - (v2x, v2y, v2z)}
	 * 
	 * @param v1 The first vector.
	 * @param v2x The value of the x component of the second vector.
	 * @param v2y The value of the y component of the second vector.
	 * @param v2z The value of the z component of the second vector.
	 * @param res The result array. Minimum legth: 3.
	 * 
	 * @return The result array with the result.
	 */
	public static float[] sub(Vec3fR v1, float v2x, float v2y, float v2z, @ExtractionParam @MinLength(3) float[] res)
	{
		subInternal(v1.getX(), v1.getY(), v1.getZ(), v2x, v2y, v2z, res);
		
		return res;
	}
	
	/**
	 * Subtracts the second given vector {@code (v2)} from the first given vector {@code (v1[0], v1[1], v1[2])}
	 * and saves the result in the given result array.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the arrays
	 * have to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1], v1[2]) - v2}
	 * 
	 * @param v1 The first vector. Minimum legth: 3.
	 * @param v2 The second vector.
	 * @param res The result array. Minimum legth: 3.
	 * 
	 * @return The result array with the result.
	 */
	public static float[] sub(@MinLength(3) float[] v1, Vec3fR v2, @ExtractionParam @MinLength(3) float[] res)
	{
		subInternal(v1[0], v1[1], v1[2], v2.getX(), v2.getY(), v2.getZ(), res);
		
		return res;
	}
	
	/**
	 * Subtracts the second given vector {@code (v2[0], v2[1], v2[2])} from the first given vector {@code (v1[0], v1[1], v1[2])}
	 * and saves the result in the given result array.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the arrays
	 * have to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1], v1[2]) - (v2[0], v2[1], v2[2])}
	 * 
	 * @param v1 The first vector. Minimum legth: 3.
	 * @param v2 The second vector. Minimum legth: 3.
	 * @param res The result array. Minimum legth: 3.
	 * 
	 * @return The result array with the result.
	 */
	public static float[] sub(@MinLength(3) float[] v1, @MinLength(3) float[] v2, @ExtractionParam @MinLength(3) float[] res)
	{
		subInternal(v1[0], v1[1], v1[2], v2[0], v2[1], v2[2], res);
		
		return res;
	}
	
	/**
	 * Subtracts the second given vector {@code (v2x, v2y, v2z)} from the first given vector {@code (v1[0], v1[2], v2[2])} and saves the result in the given result array.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the arrays
	 * have to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1], v1[2]) - (v2x, v2y, v2z)}
	 * 
	 * @param v1 The first vector. Minimum legth: 3.
	 * @param v2x The value of the x component of the second vector.
	 * @param v2y The value of the y component of the second vector.
	 * @param v2z The value of the z component of the second vector.
	 * @param res The result array. Minimum legth: 3.
	 * 
	 * @return The result array with the result.
	 */
	public static float[] sub(@MinLength(3) float[] v1, float v2x, float v2y, float v2z, @ExtractionParam @MinLength(3) float[] res)
	{
		subInternal(v1[0], v1[1], v1[2], v2x, v2y, v2z, res);
		
		return res;
	}
	
	/**
	 * Subtracts the second given vector {@code (v2)} from the first given vector {@code (v1x, v1y, v1z)} and saves the result in the given result array.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the arrays
	 * have to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y, v1z) - v2}
	 * 
	 * @param v1x The value of the x component of the first vector.
	 * @param v1y The value of the y component of the first vector.
	 * @param v1z The value of the z component of the first vector.
	 * @param v2 The second vector.
	 * @param res The result array. Minimum legth: 3.
	 * 
	 * @return The result array with the result.
	 */
	public static float[] sub(float v1x, float v1y, float v1z, Vec3fR v2, @ExtractionParam @MinLength(3) float[] res)
	{
		subInternal(v1x, v1y, v1z, v2.getX(), v2.getY(), v2.getZ(), res);
		
		return res;
	}
	
	/**
	 * Subtracts the second given vector {@code (v2[0], v2[1], v2[2])} from the first given vector {@code (v1x, v1y, v1z)} and saves the result in the given result array.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the arrays
	 * have to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y, v1z) - (v2[0], v2[1], v2[2])}
	 * 
	 * @param v1x The value of the x component of the first vector.
	 * @param v1y The value of the y component of the first vector.
	 * @param v1z The value of the z component of the first vector.
	 * @param v2 The second vector. Minimum legth: 3.
	 * @param res The result array. Minimum legth: 3.
	 * 
	 * @return The result array with the result.
	 */
	public static float[] sub(float v1x, float v1y, float v1z, @MinLength(3) float[] v2, @ExtractionParam @MinLength(3) float[] res)
	{
		subInternal(v1x, v1y, v1z, v2[0], v2[1], v2[2], res);
		
		return res;
	}
	
	/**
	 * Subtracts the second given vector {@code (v2x, v2y, v2z)} from the first given vector {@code (v1x, v1y, v1z)} and saves the result in the given result array.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the arrays
	 * have to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y, v1z) - (v2x, v2y, v2z)}
	 * 
	 * @param v1x The value of the x component of the first vector.
	 * @param v1y The value of the y component of the first vector.
	 * @param v1z The value of the z component of the first vector.
	 * @param v2x The value of the x component of the second vector.
	 * @param v2y The value of the y component of the second vector.
	 * @param v2z The value of the z component of the second vector.
	 * @param res The result array. Minimum legth: 3.
	 * 
	 * @return The result array with the result.
	 */
	public static float[] sub(float v1x, float v1y, float v1z, float v2x, float v2y, float v2z, @ExtractionParam @MinLength(3) float[] res)
	{
		subInternal(v1x, v1y, v1z, v2x, v2y, v2z, res);
		
		return res;
	}
	
	/**
	 * Only for better maintainability.
	 * 
	 * <p>
	 * Subtracts the second given vector {@code (v2x, v2y, v2z)} from the first given vector {@code (v1x, v1y, v1z)} and saves the result in the given result array.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the arrays
	 * have to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y, v1z) - (v2x, v2y, v2z)}
	 * 
	 * @param v1x The value of the x component of the first vector.
	 * @param v1y The value of the y component of the first vector.
	 * @param v1z The value of the z component of the first vector.
	 * @param v2x The value of the x component of the second vector.
	 * @param v2y The value of the y component of the second vector.
	 * @param v2z The value of the z component of the second vector.
	 * @param res The result array. Minimum legth: 3.
	 */
	private static void subInternal(float v1x, float v1y, float v1z, float v2x, float v2y, float v2z, @ExtractionParam @MinLength(3) float[] res)
	{
		res[0] = v1x - v2x;
		res[1] = v1y - v2y;
		res[2] = v1z - v2z;
	}
	
	/**
	 * Subtracts the second given vector {@code (v2)} from the first given vector {@code (v1)}
	 * and saves the result in the given result vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 - v2}
	 * 
	 * @param <T> The type of the result vector.
	 * 
	 * @param v1 The first vector.
	 * @param v2 The second vector.
	 * @param res The result vector.
	 * 
	 * @return The result vector with the result.
	 */
	public static <T extends Vec3fC> T sub(Vec3fR v1, Vec3fR v2, @ExtractionParam T res)
	{
		res.set(v1.getX() - v2.getX(), v1.getY() - v2.getY(), v1.getZ() - v2.getZ());
		
		return res;
	}
	
	/**
	 * Subtracts the second given vector {@code (v2[0], v2[1], v2[2])} from the first given vector {@code (v1)}
	 * and saves the result in the given result vector.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the arrays
	 * have to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 - (v2[0], v2[1], v2[2])}
	 * 
	 * @param <T> The type of the result vector.
	 * 
	 * @param v1 The first vector.
	 * @param v2 The second vector. Minimum legth: 3.
	 * @param res The result vector.
	 * 
	 * @return The result vector with the result.
	 */
	public static <T extends Vec3fC> T sub(Vec3fR v1, @MinLength(3) float[] v2, @ExtractionParam T res)
	{
		res.set(v1.getX() - v2[0], v1.getY() - v2[1], v1.getZ() - v2[2]);
		
		return res;
	}
	
	/**
	 * Subtracts the second given vector {@code (v2x, v2y, v2z)} from the first given vector {@code (v1)}
	 * and saves the result in the given result vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 - (v2x, v2y, v2z)}
	 * 
	 * @param <T> The type of the result vector.
	 * 
	 * @param v1 The first vector.
	 * @param v2x The value of the x component of the second vector.
	 * @param v2y The value of the y component of the second vector.
	 * @param v2z The value of the z component of the second vector.
	 * @param res The result vector.
	 * 
	 * @return The result vector with the result.
	 */
	public static <T extends Vec3fC> T sub(Vec3fR v1, float v2x, float v2y, float v2z, @ExtractionParam T res)
	{
		res.set(v1.getX() - v2x, v1.getY() - v2y, v1.getZ() - v2z);
		
		return res;
	}
	
	/**
	 * Subtracts the second given vector {@code (v2)} from the first given vector {@code (v1[0], v1[1], v1[2])}
	 * and saves the result in the given result vector.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the arrays
	 * have to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1], v1[2]) - v2}
	 * 
	 * @param <T> The type of the result vector.
	 * 
	 * @param v1 The first vector. Minimum legth: 3.
	 * @param v2 The second vector.
	 * @param res The result vector.
	 * 
	 * @return The result vector with the result.
	 */
	public static <T extends Vec3fC> T sub(@MinLength(3) float[] v1, Vec3fR v2, @ExtractionParam T res)
	{
		res.set(v1[0] - v2.getX(), v1[1] - v2.getY(), v1[2] - v2.getZ());
		
		return res;
	}
	
	/**
	 * Subtracts the second given vector {@code (v2[0], v2[1], v2[2])} from the first given vector {@code (v1[0], v1[1], v1[2])}
	 * and saves the result in the given result vector.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the arrays
	 * have to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1], v1[2]) - (v2[0], v2[1], v2[2])}
	 * 
	 * @param <T> The type of the result vector.
	 * 
	 * @param v1 The first vector. Minimum legth: 3.
	 * @param v2 The second vector. Minimum legth: 3.
	 * @param res The result vector.
	 * 
	 * @return The result vector with the result.
	 */
	public static <T extends Vec3fC> T sub(@MinLength(3) float[] v1, @MinLength(3) float[] v2, @ExtractionParam T res)
	{
		res.set(v1[0] - v2[0], v1[1] - v2[1], v1[2] - v2[2]);
		
		return res;
	}
	
	/**
	 * Subtracts the second given vector {@code (v2x, v2y, v2z)} from the first given vector {@code (v1[0], v1[2], v2[2])}
	 * and saves the result in the given result vector.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the arrays
	 * have to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1], v1[2]) - (v2x, v2y, v2z)}
	 * 
	 * @param <T> The type of the result vector.
	 * 
	 * @param v1 The first vector. Minimum legth: 3.
	 * @param v2x The value of the x component of the second vector.
	 * @param v2y The value of the y component of the second vector.
	 * @param v2z The value of the z component of the second vector.
	 * @param res The result vector.
	 * 
	 * @return The result vector with the result.
	 */
	public static <T extends Vec3fC> T sub(@MinLength(3) float[] v1, float v2x, float v2y, float v2z, @ExtractionParam T res)
	{
		res.set(v1[0] - v2x, v1[1] - v2y, v1[2] - v2z);
		
		return res;
	}
	
	/**
	 * Subtracts the second given vector {@code (v2)} from the first given vector {@code (v1x, v1y, v1z)}
	 * and saves the result in the given result vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y, v1z) - v2}
	 * 
	 * @param <T> The type of the result vector.
	 * 
	 * @param v1x The value of the x component of the first vector.
	 * @param v1y The value of the y component of the first vector.
	 * @param v1z The value of the z component of the first vector.
	 * @param v2 The second vector.
	 * @param res The result vector.
	 * 
	 * @return The result vector with the result.
	 */
	public static <T extends Vec3fC> T sub(float v1x, float v1y, float v1z, Vec3fR v2, @ExtractionParam T res)
	{
		res.set(v1x - v2.getX(), v1y - v2.getY(), v1z - v2.getZ());
		
		return res;
	}
	
	/**
	 * Subtracts the second given vector {@code (v2[0], v2[1], v2[2])} from the first given vector {@code (v1x, v1y, v1z)}
	 * and saves the result in the given result vector.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the arrays
	 * have to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y, v1z) - (v2[0], v2[1], v2[2])}
	 * 
	 * @param <T> The type of the result vector.
	 * 
	 * @param v1x The value of the x component of the first vector.
	 * @param v1y The value of the y component of the first vector.
	 * @param v1z The value of the z component of the first vector.
	 * @param v2 The second vector. Minimum legth: 3.
	 * @param res The result vector.
	 * 
	 * @return The result vector with the result.
	 */
	public static <T extends Vec3fC> T sub(float v1x, float v1y, float v1z, @MinLength(3) float[] v2, @ExtractionParam T res)
	{
		res.set(v1x - v2[0], v1y - v2[1], v1z - v2[2]);
		
		return res;
	}
	
	/**
	 * Subtracts the second given vector {@code (v2x, v2y, v2z)} from the first given vector {@code (v1x, v1y, v1z)}
	 * and saves the result in the given result vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y, v1z) - (v2x, v2y, v2z)}
	 * 
	 * @param <T> The type of the result vector.
	 * 
	 * @param v1x The value of the x component of the first vector.
	 * @param v1y The value of the y component of the first vector.
	 * @param v1z The value of the z component of the first vector.
	 * @param v2x The value of the x component of the second vector.
	 * @param v2y The value of the y component of the second vector.
	 * @param v2z The value of the z component of the second vector.
	 * @param res The result vector.
	 * 
	 * @return The result vector with the result.
	 */
	public static <T extends Vec3fC> T sub(float v1x, float v1y, float v1z, float v2x, float v2y, float v2z, @ExtractionParam T res)
	{
		res.set(v1x - v2x, v1y - v2y, v1z - v2z);
		
		return res;
	}
	
	
	
	/**
	 * Subtracts the first given vector {@code (v1)} from the second given vector {@code (v2)}
	 * and saves the result in the given result array.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the arrays
	 * have to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v2 - v1}
	 * 
	 * @param v1 The first vector.
	 * @param v2 The second vector.
	 * @param res The result array. Minimum legth: 3.
	 * 
	 * @return The result array with the result.
	 */
	public static float[] revSub(Vec3fR v1, Vec3fR v2, @ExtractionParam @MinLength(3) float[] res)
	{
		res[0] = v2.getX() - v1.getX();
		res[1] = v2.getY() - v1.getY();
		res[2] = v2.getZ() - v1.getZ();
		
		return res;
	}
	
	/**
	 * Subtracts the first given vector {@code (v1)} from the second given vector {@code (v2[0], v2[1], v2[2])}
	 * and saves the result in the given result array.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the arrays
	 * have to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2[0], v2[1], v2[2]) - v1}
	 * 
	 * @param v1 The first vector.
	 * @param v2 The second vector. Minimum legth: 3.
	 * @param res The result array. Minimum legth: 3.
	 * 
	 * @return The result array with the result.
	 */
	public static float[] revSub(Vec3fR v1, @MinLength(3) float[] v2, @ExtractionParam @MinLength(3) float[] res)
	{
		res[0] = v2[0] - v1.getX();
		res[1] = v2[1] - v1.getY();
		res[2] = v2[2] - v1.getZ();
		
		return res;
	}
	
	/**
	 * Subtracts the first given vector {@code (v1)} from the second given vector {@code (v2x, v2y, v2z)}
	 * and saves the result in the given result array.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the arrays
	 * have to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2x, v2y, v2z) - v1}
	 * 
	 * @param v1 The first vector.
	 * @param v2x The value of the x component of the second vector.
	 * @param v2y The value of the y component of the second vector.
	 * @param v2z The value of the z component of the second vector.
	 * @param res The result array. Minimum legth: 3.
	 * 
	 * @return The result array with the result.
	 */
	public static float[] revSub(Vec3fR v1, float v2x, float v2y, float v2z, @ExtractionParam @MinLength(3) float[] res)
	{
		res[0] = v2x - v1.getX();
		res[1] = v2y - v1.getY();
		res[2] = v2z - v1.getZ();
		
		return res;
	}
	
	/**
	 * Subtracts the first given vector {@code (v1[0], v1[2], v1[2])} from the second given vector {@code (v2)}
	 * and saves the result in the given result array.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the arrays
	 * have to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v2 - (v1[0], v1[1], v1[2])}
	 * 
	 * @param v1 The first vector. Minimum legth: 3.
	 * @param v2 The second vector.
	 * @param res The result array. Minimum legth: 3.
	 * 
	 * @return The result array with the result.
	 */
	public static float[] revSub(@MinLength(3) float[] v1, Vec3fR v2, @ExtractionParam @MinLength(3) float[] res)
	{
		res[0] = v2.getX() - v1[0];
		res[1] = v2.getY() - v1[1];
		res[2] = v2.getZ() - v1[2];
		
		return res;
	}
	
	/**
	 * Subtracts the first given vector {@code (v1[0], v1[2], v1[2])} from the second given vector {@code (v2[0], v2[1], v2[2])}
	 * and saves the result in the given result array.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the arrays
	 * have to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2[0], v2[1], v2[2]) - (v1[0], v1[1], v1[2])}
	 * 
	 * @param v1 The first vector. Minimum legth: 3.
	 * @param v2 The second vector. Minimum legth: 3.
	 * @param res The result array. Minimum legth: 3.
	 * 
	 * @return The result array with the result.
	 */
	public static float[] revSub(@MinLength(3) float[] v1, @MinLength(3) float[] v2, @ExtractionParam @MinLength(3) float[] res)
	{
		res[0] = v2[0] - v1[0];
		res[1] = v2[1] - v1[1];
		res[2] = v2[2] - v1[2];
		
		return res;
	}
	
	/**
	 * Subtracts the first given vector {@code (v1[0], v1[1], v1[2])} from the second given vector {@code (v2x, v2y, v2z)}
	 * and saves the result in the given result array.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the arrays
	 * have to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2x, v2y, v2z) - (v1[0], v1[1], v1[2])}
	 * 
	 * @param v1 The first vector. Minimum legth: 3.
	 * @param v2x The value of the x component of the second vector.
	 * @param v2y The value of the y component of the second vector.
	 * @param v2z The value of the z component of the second vector.
	 * @param res The result array. Minimum legth: 3.
	 * 
	 * @return The result array with the result.
	 */
	public static float[] revSub(@MinLength(3) float[] v1, float v2x, float v2y, float v2z, @ExtractionParam @MinLength(3) float[] res)
	{
		res[0] = v2x - v1[0];
		res[1] = v2y - v1[1];
		res[2] = v2z - v1[2];
		
		return res;
	}
	
	/**
	 * Subtracts the first given vector {@code (v1x, v1y, v1z)} from the second given vector {@code (v2)}
	 * and saves the result in the given result array.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the arrays
	 * have to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v2 - (v1x, v1y, v1z)}
	 * 
	 * @param v1x The value of the x component of the first vector.
	 * @param v1y The value of the y component of the first vector.
	 * @param v1z The value of the z component of the first vector.
	 * @param v2 The second vector.
	 * @param res The result array. Minimum legth: 3.
	 * 
	 * @return The result array with the result.
	 */
	public static float[] revSub(float v1x, float v1y, float v1z, Vec3fR v2, @ExtractionParam @MinLength(3) float[] res)
	{
		res[0] = v2.getX() - v1x;
		res[1] = v2.getY() - v1y;
		res[2] = v2.getZ() - v1z;
		
		return res;
	}
	
	/**
	 * Subtracts the first given vector {@code (v1x, v1y, v1z)} from the second given vector {@code (v2[0], v2[1], v2[2])}
	 * and saves the result in the given result array.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the arrays
	 * have to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2[0], v2[1], v2[2]) - (v1x, v1y, v1z)}
	 * 
	 * @param v1x The value of the x component of the first vector.
	 * @param v1y The value of the y component of the first vector.
	 * @param v1z The value of the z component of the first vector.
	 * @param v2 The second vector. Minimum legth: 3.
	 * @param res The result array. Minimum legth: 3.
	 * 
	 * @return The result array with the result.
	 */
	public static float[] revSub(float v1x, float v1y, float v1z, @MinLength(3) float[] v2, @ExtractionParam @MinLength(3) float[] res)
	{
		res[0] = v2[0] - v1x;
		res[1] = v2[1] - v1y;
		res[2] = v2[2] - v1z;
		
		return res;
	}
	
	/**
	 * Subtracts the first given vector {@code (v1x, v1y, v1z)} from the second given vector {@code (v2x, v2y, v2z)} and saves the result in the given result array.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the arrays
	 * have to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2x, v2y, v2z) - (v1x, v1y, v1z)}
	 * 
	 * @param v1x The value of the x component of the first vector.
	 * @param v1y The value of the y component of the first vector.
	 * @param v1z The value of the z component of the first vector.
	 * @param v2x The value of the x component of the second vector.
	 * @param v2y The value of the y component of the second vector.
	 * @param v2z The value of the z component of the second vector.
	 * @param res The result array. Minimum legth: 3.
	 * 
	 * @return The result array with the result.
	 */
	public static float[] revSub(float v1x, float v1y, float v1z, float v2x, float v2y, float v2z, @ExtractionParam @MinLength(3) float[] res)
	{
		res[0] = v2x - v1x;
		res[1] = v2y - v1y;
		res[2] = v2z - v1z;
		
		return res;
	}
	
	/**
	 * Subtracts the first given vector {@code (v1)} from the second given vector {@code (v2)}
	 * and saves the result in the given result vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v2 - v1}
	 * 
	 * @param <T> The type of the result vector.
	 * 
	 * @param v1 The first vector.
	 * @param v2 The second vector.
	 * @param res The result vector.
	 * 
	 * @return The result vector with the result.
	 */
	public static <T extends Vec3fC> T revSub(Vec3fR v1, Vec3fR v2, @ExtractionParam T res)
	{
		res.set(v2.getX() - v1.getX(), v2.getY() - v1.getY(), v2.getZ() - v1.getZ());
		
		return res;
	}
	
	/**
	 * Subtracts the first given vector {@code (v1)} from the second given vector {@code (v2[0], v2[1], v2[2])}
	 * and saves the result in the given result vector.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the arrays
	 * have to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2[0], v2[1], v2[2]) - v1}
	 * 
	 * @param <T> The type of the result vector.
	 * 
	 * @param v1 The first vector.
	 * @param v2 The second vector. Minimum legth: 3.
	 * @param res The result vector.
	 * 
	 * @return The result vector with the result.
	 */
	public static <T extends Vec3fC> T revSub(Vec3fR v1, @MinLength(3) float[] v2, @ExtractionParam T res)
	{
		res.set(v2[0] - v1.getX(), v2[1] - v1.getY(), v2[2] - v1.getZ());
		
		return res;
	}
	
	/**
	 * Subtracts the first given vector {@code (v1)} from the second given vector {@code (v2x, v2y, v2z)}
	 * and saves the result in the given result vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2x, v2y, v2z) - v1}
	 * 
	 * @param <T> The type of the result vector.
	 * 
	 * @param v1 The first vector.
	 * @param v2x The value of the x component of the second vector.
	 * @param v2y The value of the y component of the second vector.
	 * @param v2z The value of the z component of the second vector.
	 * @param res The result vector.
	 * 
	 * @return The result vector with the result.
	 */
	public static <T extends Vec3fC> T revSub(Vec3fR v1, float v2x, float v2y, float v2z, @ExtractionParam T res)
	{
		res.set(v2x - v1.getX(), v2y - v1.getY(), v2z - v1.getZ());
		
		return res;
	}
	
	/**
	 * Subtracts the first given vector {@code (v1[0], v1[2], v1[2])} from the second given vector {@code (v2)}
	 * and saves the result in the given result vector.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the arrays
	 * have to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v2 - (v1[0], v1[1], v1[2])}
	 * 
	 * @param <T> The type of the result vector.
	 * 
	 * @param v1 The first vector. Minimum legth: 3.
	 * @param v2 The second vector.
	 * @param res The result vector.
	 * 
	 * @return The result vector with the result.
	 */
	public static <T extends Vec3fC> T revSub(@MinLength(3) float[] v1, Vec3fR v2, @ExtractionParam T res)
	{
		res.set(v2.getX() - v1[0], v2.getY() - v1[1], v2.getZ() - v1[2]);
		
		return res;
	}
	
	/**
	 * Subtracts the first given vector {@code (v1[0], v1[2], v1[2])} from the second given vector {@code (v2[0], v2[1], v2[2])}
	 * and saves the result in the given result vector.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the arrays
	 * have to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2[0], v2[1], v2[2]) - (v1[0], v1[1], v1[2])}
	 * 
	 * @param <T> The type of the result vector.
	 * 
	 * @param v1 The first vector. Minimum legth: 3.
	 * @param v2 The second vector. Minimum legth: 3.
	 * @param res The result vector.
	 * 
	 * @return The result vector with the result.
	 */
	public static <T extends Vec3fC> T revSub(@MinLength(3) float[] v1, @MinLength(3) float[] v2, @ExtractionParam T res)
	{
		res.set(v2[0] - v1[0], v2[1] - v1[1], v2[1] - v1[1]);
		
		return res;
	}
	
	/**
	 * Subtracts the first given vector {@code (v1[0], v1[1], v1[2])} from the second given vector {@code (v2x, v2y, v2z)}
	 * and saves the result in the given result vector.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the arrays
	 * have to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2x, v2y, v2z) - (v1[0], v1[1], v1[2])}
	 * 
	 * @param <T> The type of the result vector.
	 * 
	 * @param v1 The first vector. Minimum legth: 3.
	 * @param v2x The value of the x component of the second vector.
	 * @param v2y The value of the y component of the second vector.
	 * @param v2z The value of the z component of the second vector.
	 * @param res The result vector.
	 * 
	 * @return The result vector with the result.
	 */
	public static <T extends Vec3fC> T revSub(@MinLength(3) float[] v1, float v2x, float v2y, float v2z, @ExtractionParam T res)
	{
		res.set(v2x - v1[0], v2y - v1[1], v2z - v1[2]);
		
		return res;
	}
	
	/**
	 * Subtracts the first given vector {@code (v1x, v1y, v1z)} from the second given vector {@code (v2)}
	 * and saves the result in the given result vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v2 - (v1x, v1y, v1z)}
	 * 
	 * @param <T> The type of the result vector.
	 * 
	 * @param v1x The value of the x component of the first vector.
	 * @param v1y The value of the y component of the first vector.
	 * @param v1z The value of the z component of the first vector.
	 * @param v2 The second vector.
	 * @param res The result vector.
	 * 
	 * @return The result vector with the result.
	 */
	public static <T extends Vec3fC> T revSub(float v1x, float v1y, float v1z, Vec3fR v2, @ExtractionParam T res)
	{
		res.set(v2.getX() - v1x, v2.getY() - v1y, v2.getZ() - v1z);
		
		return res;
	}
	
	/**
	 * Subtracts the first given vector {@code (v1x, v1y, v1z)} from the second given vector {@code (v2[0], v2[1], v2[2])}
	 * and saves the result in the given result vector.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the arrays
	 * have to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2[0], v2[1], v2[2]) - (v1x, v1y, v1z)}
	 * 
	 * @param <T> The type of the result vector.
	 * 
	 * @param v1x The value of the x component of the first vector.
	 * @param v1y The value of the y component of the first vector.
	 * @param v1z The value of the z component of the first vector.
	 * @param v2 The second vector. Minimum legth: 3.
	 * @param res The result vector.
	 * 
	 * @return The result vector with the result.
	 */
	public static <T extends Vec3fC> T revSub(float v1x, float v1y, float v1z, @MinLength(3) float[] v2, @ExtractionParam T res)
	{
		res.set(v2[0] - v1x, v2[1] - v1y, v2[2] - v1z);
		
		return res;
	}
	
	/**
	 * Subtracts the first given vector {@code (v1x, v1y, v1z)} from the second given vector {@code (v2x, v2y, v2z)}
	 * and saves the result in the given result vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2x, v2y, v2z) - (v1x, v1y, v1z)}
	 * 
	 * @param <T> The type of the result vector.
	 * 
	 * @param v1x The value of the x component of the first vector.
	 * @param v1y The value of the y component of the first vector.
	 * @param v1z The value of the z component of the first vector.
	 * @param v2x The value of the x component of the second vector.
	 * @param v2y The value of the y component of the second vector.
	 * @param v2z The value of the z component of the second vector.
	 * @param res The result vector.
	 * 
	 * @return The result vector with the result.
	 */
	public static <T extends Vec3fC> T revSub(float v1x, float v1y, float v1z, float v2x, float v2y, float v2z, @ExtractionParam T res)
	{
		res.set(v2x - v1x, v2y - v1y, v2z - v1z);
		
		return res;
	}
	
	/**
	 * Multiplies the first given vector {@code (v1)} with the second given vector {@code (v2)}
	 * and saves the result in the given result array.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the arrays
	 * have to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 * v2}
	 * 
	 * @param v1 The first vector.
	 * @param v2 The second vector.
	 * @param res The result array. Minimum legth: 3.
	 * 
	 * @return The result array with the result.
	 */
	public static float[] mul(Vec3fR v1, Vec3fR v2, @ExtractionParam @MinLength(3) float[] res)
	{
		res[0] = v1.getX() * v2.getX();
		res[1] = v1.getY() * v2.getY();
		res[2] = v1.getZ() * v2.getZ();
		
		return res;
	}
	
	/**
	 * Multiplies the first given vector {@code (v1)} with the second given vector {@code (v2[0], v2[1], v2[2])}
	 * and saves the result in the given result array.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the arrays
	 * have to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 * (v2[0], v2[1], v2[3])}
	 * 
	 * @param v1 The first vector.
	 * @param v2 The second vector. Minimum legth: 3.
	 * @param res The result array. Minimum legth: 3.
	 * 
	 * @return The result array with the result.
	 */
	public static float[] mul(Vec3fR v1, @MinLength(3) float[] v2, @ExtractionParam @MinLength(3) float[] res)
	{
		res[0] = v1.getX() * v2[0];
		res[1] = v1.getY() * v2[1];
		res[2] = v1.getZ() * v2[2];
		
		return res;
	}
	
	/**
	 * Multiplies the first given vector {@code (v1)} with the second given vector {@code (v2x, v2y, v2z)}
	 * and saves the result in the given result array.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the arrays
	 * have to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 * (v2x, v2y, v2z)}
	 * 
	 * @param v1 The first vector.
	 * @param v2x The value of the x component of the second vector.
	 * @param v2y The value of the y component of the second vector.
	 * @param v2z The value of the z component of the second vector.
	 * @param res The result array. Minimum legth: 3.
	 * 
	 * @return The result array with the result.
	 */
	public static float[] mul(Vec3fR v1, float v2x, float v2y, float v2z, @ExtractionParam @MinLength(3) float[] res)
	{
		res[0] = v1.getX() * v2x;
		res[1] = v1.getY() * v2y;
		res[2] = v1.getZ() * v2z;
		
		return res;
	}
	
	/**
	 * Multiplies the first given vector {@code (v1[0], v1[1], v1[2])} with the second given vector {@code (v2)}
	 * and saves the result in the given result array.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the arrays
	 * have to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1], v1[2]) * v2}
	 * 
	 * @param v1 The first vector. Minimum legth: 3.
	 * @param v2 The second vector.
	 * @param res The result array. Minimum legth: 3.
	 * 
	 * @return The result array with the result.
	 */
	public static float[] mul(@MinLength(3) float[] v1, Vec3fR v2, @ExtractionParam @MinLength(3) float[] res)
	{
		res[0] = v1[0] * v2.getX();
		res[1] = v1[1] * v2.getY();
		res[2] = v1[2] * v2.getZ();
		
		return res;
	}
	
	/**
	 * Multiplies the first given vector {@code (v1[0], v1[1], v1[2])} with the second given vector {@code (v2[0], v2[1], v2[2])}
	 * and saves the result in the given result array.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the arrays
	 * have to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1], v1[2]) * (v2[0], v2[1], v2[3])}
	 * 
	 * @param v1 The first vector. Minimum legth: 3.
	 * @param v2 The second vector. Minimum legth: 3.
	 * @param res The result array. Minimum legth: 3.
	 * 
	 * @return The result array with the result.
	 */
	public static float[] mul(@MinLength(3) float[] v1, @MinLength(3) float[] v2, @ExtractionParam @MinLength(3) float[] res)
	{
		res[0] = v1[0] * v2[0];
		res[1] = v1[1] * v2[1];
		res[2] = v1[2] * v2[2];
		
		return res;
	}
	
	/**
	 * Multiplies the first given vector {@code (v1[0], v1[1], v1[2])} with the second given vector {@code (v2x, v2y, v2z)}
	 * and saves the result in the given result array.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the arrays
	 * have to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1], v1[2]) * (v2x, v2y, v2z)}
	 * 
	 * @param v1 The first vector. Minimum legth: 3.
	 * @param v2x The value of the x component of the second vector.
	 * @param v2y The value of the y component of the second vector.
	 * @param v2z The value of the z component of the second vector.
	 * @param res The result array. Minimum legth: 3.
	 * 
	 * @return The result array with the result.
	 */
	public static float[] mul(@MinLength(3) float[] v1, float v2x, float v2y, float v2z, @ExtractionParam @MinLength(3) float[] res)
	{
		res[0] = v1[0] * v2x;
		res[1] = v1[1] * v2y;
		res[2] = v1[2] * v2z;
		
		return res;
	}
	
	/**
	 * Multiplies the first given vector {@code (v1x, v1y, v1z)} with the second given vector {@code (v2)}
	 * and saves the result in the given result array.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the arrays
	 * have to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y, v1z) * v2}
	 * 
	 * @param v1x The value of the x component of the first vector.
	 * @param v1y The value of the y component of the first vector.
	 * @param v1z The value of the z component of the first vector.
	 * @param v2 The second vector.
	 * @param res The result array. Minimum legth: 3.
	 * 
	 * @return The result array with the result.
	 */
	public static float[] mul(float v1x, float v1y, float v1z, Vec3fR v2, @ExtractionParam @MinLength(3) float[] res)
	{
		res[0] = v1x * v2.getX();
		res[1] = v1y * v2.getY();
		res[2] = v1z * v2.getZ();
		
		return res;
	}
	
	/**
	 * Multiplies the first given vector {@code (v1x, v1y, v1z)} with the second given vector {@code (v2[0], v2[1], v2[2])}
	 * and saves the result in the given result array.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the arrays
	 * have to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y, v1z) * (v2[0], v2[1], v2[3])}
	 * 
	 * @param v1x The value of the x component of the first vector.
	 * @param v1y The value of the y component of the first vector.
	 * @param v1z The value of the z component of the first vector.
	 * @param v2 The second vector. Minimum legth: 3.
	 * @param res The result array. Minimum legth: 3.
	 * 
	 * @return The result array with the result.
	 */
	public static float[] mul(float v1x, float v1y, float v1z, @MinLength(3) float[] v2, @ExtractionParam @MinLength(3) float[] res)
	{
		res[0] = v1x * v2[0];
		res[1] = v1y * v2[1];
		res[2] = v1z * v2[2];
		
		return res;
	}
	
	/**
	 * Multiplies the first given vector {@code (v1x, v1y, v1z)} with the second given vector {@code (v2x, v2y, v2z)} and saves the result in the given result array.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the arrays
	 * have to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y, v1z) * (v2x, v2y, v2z)}
	 * 
	 * @param v1x The value of the x component of the first vector.
	 * @param v1y The value of the y component of the first vector.
	 * @param v1z The value of the z component of the first vector.
	 * @param v2x The value of the x component of the second vector.
	 * @param v2y The value of the y component of the second vector.
	 * @param v2z The value of the z component of the second vector.
	 * @param res The result array. Minimum legth: 3.
	 * 
	 * @return The result array with the result.
	 */
	public static float[] mul(float v1x, float v1y, float v1z, float v2x, float v2y, float v2z, @ExtractionParam @MinLength(3) float[] res)
	{
		res[0] = v1x * v2x;
		res[1] = v1y * v2y;
		res[2] = v1z * v2z;
		
		return res;
	}
	
	/**
	 * Multiplies the first given vector {@code (v1)} with the second given vector {@code (v2)}
	 * and saves the result in the given result vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 * v2}
	 * 
	 * @param <T> The type of the result vector.
	 * 
	 * @param v1 The first vector.
	 * @param v2 The second vector.
	 * @param res The result vector.
	 * 
	 * @return The result vector with the result.
	 */
	public static <T extends Vec3fC> T mul(Vec3fR v1, Vec3fR v2, @ExtractionParam T res)
	{
		res.set(v1.getX() * v2.getX(), v1.getY() * v2.getY(), v1.getZ() * v2.getZ());
		
		return res;
	}
	
	/**
	 * Multiplies the first given vector {@code (v1)} with the second given vector {@code (v2[0], v2[1], v2[2])}
	 * and saves the result in the given result vector.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the arrays
	 * have to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 * (v2[0], v2[1], v2[3])}
	 * 
	 * @param <T> The type of the result vector.
	 * 
	 * @param v1 The first vector.
	 * @param v2 The second vector. Minimum legth: 3.
	 * @param res The result vector.
	 * 
	 * @return The result vector with the result.
	 */
	public static <T extends Vec3fC> T mul(Vec3fR v1, @MinLength(3) float[] v2, @ExtractionParam T res)
	{
		res.set(v1.getX() * v2[0], v1.getY() * v2[1], v1.getZ() * v2[2]);
		
		return res;
	}
	
	/**
	 * Multiplies the first given vector {@code (v1)} with the second given vector {@code (v2x, v2y, v2z)}
	 * and saves the result in the given result vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 * (v2x, v2y, v2z)}
	 * 
	 * @param <T> The type of the result vector.
	 * 
	 * @param v1 The first vector.
	 * @param v2x The value of the x component of the second vector.
	 * @param v2y The value of the y component of the second vector.
	 * @param v2z The value of the z component of the second vector.
	 * @param res The result vector.
	 * 
	 * @return The result vector with the result.
	 */
	public static <T extends Vec3fC> T mul(Vec3fR v1, float v2x, float v2y, float v2z, @ExtractionParam T res)
	{
		res.set(v1.getX() * v2x, v1.getY() * v2y, v1.getZ() * v2z);
		
		return res;
	}
	
	/**
	 * Multiplies the first given vector {@code (v1[0], v1[1], v1[2])} with the second given vector {@code (v2)}
	 * and saves the result in the given result vector.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the arrays
	 * have to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1], v1[2]) * v2}
	 * 
	 * @param <T> The type of the result vector.
	 * 
	 * @param v1 The first vector. Minimum legth: 3.
	 * @param v2 The second vector.
	 * @param res The result vector.
	 * 
	 * @return The result vector with the result.
	 */
	public static <T extends Vec3fC> T mul(@MinLength(3) float[] v1, Vec3fR v2, @ExtractionParam T res)
	{
		res.set(v1[0] * v2.getX(), v1[1] * v2.getY(), v1[2] * v2.getZ());
		
		return res;
	}
	
	/**
	 * Multiplies the first given vector {@code (v1[0], v1[1], v1[2])} with the second given vector {@code (v2[0], v2[1], v2[2])}
	 * and saves the result in the given result vector.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the arrays
	 * have to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1], v1[2]) * (v2[0], v2[1], v2[3])}
	 * 
	 * @param <T> The type of the result vector.
	 * 
	 * @param v1 The first vector. Minimum legth: 3.
	 * @param v2 The second vector. Minimum legth: 3.
	 * @param res The result vector.
	 * 
	 * @return The result vector with the result.
	 */
	public static <T extends Vec3fC> T mul(@MinLength(3) float[] v1, @MinLength(3) float[] v2, @ExtractionParam T res)
	{
		res.set(v1[0] * v2[0], v1[1] * v2[1], v1[2] * v2[2]);
		
		return res;
	}
	
	/**
	 * Multiplies the first given vector {@code (v1[0], v1[1], v1[2])} with the second given vector {@code (v2x, v2y, v2z)}
	 * and saves the result in the given result vector.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the arrays
	 * have to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1], v1[2]) * (v2x, v2y, v2z)}
	 * 
	 * @param <T> The type of the result vector.
	 * 
	 * @param v1 The first vector. Minimum legth: 3.
	 * @param v2x The value of the x component of the second vector.
	 * @param v2y The value of the y component of the second vector.
	 * @param v2z The value of the z component of the second vector.
	 * @param res The result vector.
	 * 
	 * @return The result vector with the result.
	 */
	public static <T extends Vec3fC> T mul(@MinLength(3) float[] v1, float v2x, float v2y, float v2z, @ExtractionParam T res)
	{
		res.set(v1[0] * v2x, v1[1] * v2y, v1[2] * v2z);
		
		return res;
	}
	
	/**
	 * Multiplies the first given vector {@code (v1x, v1y, v1z)} with the second given vector {@code (v2)}
	 * and saves the result in the given result vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y, v1z) * v2}
	 * 
	 * @param <T> The type of the result vector.
	 * 
	 * @param v1x The value of the x component of the first vector.
	 * @param v1y The value of the y component of the first vector.
	 * @param v1z The value of the z component of the first vector.
	 * @param v2 The second vector.
	 * @param res The result vector.
	 * 
	 * @return The result vector with the result.
	 */
	public static <T extends Vec3fC> T mul(float v1x, float v1y, float v1z, Vec3fR v2, @ExtractionParam T res)
	{
		res.set(v1x * v2.getX(), v1y * v2.getY(), v1z * v2.getZ());
		
		return res;
	}
	
	/**
	 * Multiplies the first given vector {@code (v1x, v1y, v1z)} with the second given vector {@code (v2[0], v2[1], v2[2])}
	 * and saves the result in the given result vector.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the arrays
	 * have to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y, v1z) * (v2[0], v2[1], v2[3])}
	 * 
	 * @param <T> The type of the result vector.
	 * 
	 * @param v1x The value of the x component of the first vector.
	 * @param v1y The value of the y component of the first vector.
	 * @param v1z The value of the z component of the first vector.
	 * @param v2 The second vector. Minimum legth: 3.
	 * @param res The result vector.
	 * 
	 * @return The result vector with the result.
	 */
	public static <T extends Vec3fC> T mul(float v1x, float v1y, float v1z, @MinLength(3) float[] v2, @ExtractionParam T res)
	{
		res.set(v1x * v2[0], v1y * v2[1], v1z * v2[2]);
		
		return res;
	}
	
	/**
	 * Multiplies the first given vector {@code (v1x, v1y, v1z)} with the second given vector {@code (v2x, v2y, v2z)}
	 * and saves the result in the given result vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y, v1z) * (v2x, v2y, v2z)}
	 * 
	 * @param <T> The type of the result vector.
	 * 
	 * @param v1x The value of the x component of the first vector.
	 * @param v1y The value of the y component of the first vector.
	 * @param v1z The value of the z component of the first vector.
	 * @param v2x The value of the x component of the second vector.
	 * @param v2y The value of the y component of the second vector.
	 * @param v2z The value of the z component of the second vector.
	 * @param res The result vector.
	 * 
	 * @return The result vector with the result.
	 */
	public static <T extends Vec3fC> T mul(float v1x, float v1y, float v1z, float v2x, float v2y, float v2z, @ExtractionParam T res)
	{
		res.set(v1x * v2x, v1y * v2y, v1z * v2z);
		
		return res;
	}
	
	/**
	 * Divides the first given vector {@code (v1)} by the second given vector {@code (v2)}
	 * and saves the result in the given result array.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the arrays
	 * have to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 / v2}
	 * 
	 * @param v1 The first vector.
	 * @param v2 The second vector.
	 * @param res The result array. Minimum legth: 3.
	 * 
	 * @return The result array with the result.
	 */
	public static float[] div(Vec3fR v1, Vec3fR v2, @ExtractionParam @MinLength(3) float[] res)
	{
		res[0] = v1.getX() / v2.getX();
		res[1] = v1.getY() / v2.getY();
		res[2] = v1.getZ() / v2.getZ();
		
		return res;
	}
	
	/**
	 * Divides the first given vector {@code (v1)} by the second given vector {@code (v2[0], v2[1], v2[2])}
	 * and saves the result in the given result array.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the arrays
	 * have to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 / (v2[0], v2[1], v2[2])}
	 * 
	 * @param v1 The first vector.
	 * @param v2 The second vector. Minimum legth: 3.
	 * @param res The result array. Minimum legth: 3.
	 * 
	 * @return The result array with the result.
	 */
	public static float[] div(Vec3fR v1, @MinLength(3) float[] v2, @ExtractionParam @MinLength(3) float[] res)
	{
		res[0] = v1.getX() / v2[0];
		res[1] = v1.getY() / v2[1];
		res[2] = v1.getZ() / v2[2];
		
		return res;
	}
	
	/**
	 * Divides the first given vector {@code (v1)} by the second given vector {@code (v2x, v2y, v2z)}
	 * and saves the result in the given result array.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the arrays
	 * have to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 / (v2x, v2y, v2z)}
	 * 
	 * @param v1 The first vector.
	 * @param v2x The value of the x component of the second vector.
	 * @param v2y The value of the y component of the second vector.
	 * @param v2z The value of the z component of the second vector.
	 * @param res The result array. Minimum legth: 3.
	 * 
	 * @return The result array with the result.
	 */
	public static float[] div(Vec3fR v1, float v2x, float v2y, float v2z, @ExtractionParam @MinLength(3) float[] res)
	{
		res[0] = v1.getX() / v2x;
		res[1] = v1.getY() / v2y;
		res[2] = v1.getZ() / v2z;
		
		return res;
	}
	
	/**
	 * Divides the first given vector {@code (v1[0], v1[1], v1[2])} by the second given vector {@code (v2)}
	 * and saves the result in the given result array.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the arrays
	 * have to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1], v1[2]) / v2}
	 * 
	 * @param v1 The first vector. Minimum legth: 3.
	 * @param v2 The second vector.
	 * @param res The result array. Minimum legth: 3.
	 * 
	 * @return The result array with the result.
	 */
	public static float[] div(@MinLength(3) float[] v1, Vec3fR v2, @ExtractionParam @MinLength(3) float[] res)
	{
		res[0] = v1[0] / v2.getX();
		res[1] = v1[1] / v2.getY();
		res[2] = v1[2] / v2.getZ();
		
		return res;
	}
	
	/**
	 * Divides the first given vector {@code (v1[0], v1[1], v1[2])} by the second given vector {@code (v2[0], v2[1], v2[2])}
	 * and saves the result in the given result array.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the arrays
	 * have to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1], v1[2]) / (v2[0], v2[1], v2[2])}
	 * 
	 * @param v1 The first vector. Minimum legth: 3.
	 * @param v2 The second vector. Minimum legth: 3.
	 * @param res The result array. Minimum legth: 3.
	 * 
	 * @return The result array with the result.
	 */
	public static float[] div(@MinLength(3) float[] v1, @MinLength(3) float[] v2, @ExtractionParam @MinLength(3) float[] res)
	{
		res[0] = v1[0] / v2[0];
		res[1] = v1[1] / v2[1];
		res[2] = v1[2] / v2[2];
		
		return res;
	}
	
	/**
	 * Divides the first given vector {@code (v1[0], v1[1], v1[2])} by the second given vector {@code (v2x, v2y, v2z)}
	 * and saves the result in the given result array.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the arrays
	 * have to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1], v1[2]) / (v2x, v2y, v2z)}
	 * 
	 * @param v1 The first vector. Minimum legth: 3.
	 * @param v2x The value of the x component of the second vector.
	 * @param v2y The value of the y component of the second vector.
	 * @param v2z The value of the z component of the second vector.
	 * @param res The result array. Minimum legth: 3.
	 * 
	 * @return The result array with the result.
	 */
	public static float[] div(@MinLength(3) float[] v1, float v2x, float v2y, float v2z, @ExtractionParam @MinLength(3) float[] res)
	{
		res[0] = v1[0] / v2x;
		res[1] = v1[1] / v2y;
		res[2] = v1[2] / v2z;
		
		return res;
	}
	
	/**
	 * Divides the first given vector {@code (v1x, v1y, v1z)} by the second given vector {@code (v2)}
	 * and saves the result in the given result array.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the arrays
	 * have to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y, v1z) / v2}
	 * 
	 * @param v1x The value of the x component of the first vector.
	 * @param v1y The value of the y component of the first vector.
	 * @param v1z The value of the z component of the first vector.
	 * @param v2 The second vector.
	 * @param res The result array. Minimum legth: 3.
	 * 
	 * @return The result array with the result.
	 */
	public static float[] div(float v1x, float v1y, float v1z, Vec3fR v2, @ExtractionParam @MinLength(3) float[] res)
	{
		res[0] = v1x / v2.getX();
		res[1] = v1y / v2.getY();
		res[2] = v1z / v2.getZ();
		
		return res;
	}
	
	/**
	 * Divides the first given vector {@code (v1x, v1y, v1z)} by the second given vector {@code (v2[0], v2[1], v2[2])}
	 * and saves the result in the given result array.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the arrays
	 * have to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y, v1z) / (v2[0], v2[1], v2[2])}
	 * 
	 * @param v1x The value of the x component of the first vector.
	 * @param v1y The value of the y component of the first vector.
	 * @param v1z The value of the z component of the first vector.
	 * @param v2 The second vector. Minimum legth: 3.
	 * @param res The result array. Minimum legth: 3.
	 * 
	 * @return The result array with the result.
	 */
	public static float[] div(float v1x, float v1y, float v1z, @MinLength(3) float[] v2, @ExtractionParam @MinLength(3) float[] res)
	{
		res[0] = v1x / v2[0];
		res[1] = v1y / v2[1];
		res[2] = v1z / v2[2];
		
		return res;
	}
	
	/**
	 * Divides the first given vector {@code (v1x, v1y, v1z)} by the second given vector {@code (v2x, v2y, v2z)} and saves the result in the given result array.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the arrays
	 * have to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y, v1z) / (v2x, v2y, v2z)}
	 * 
	 * @param v1x The value of the x component of the first vector.
	 * @param v1y The value of the y component of the first vector.
	 * @param v1z The value of the z component of the first vector.
	 * @param v2x The value of the x component of the second vector.
	 * @param v2y The value of the y component of the second vector.
	 * @param v2z The value of the z component of the second vector.
	 * @param res The result array. Minimum legth: 3.
	 * 
	 * @return The result array with the result.
	 */
	public static float[] div(float v1x, float v1y, float v1z, float v2x, float v2y, float v2z, @ExtractionParam @MinLength(3) float[] res)
	{
		res[0] = v1x / v2x;
		res[1] = v1y / v2y;
		res[2] = v1z / v2z;
		
		return res;
	}
	
	/**
	 * Divides the first given vector {@code (v1)} by the second given vector {@code (v2)}
	 * and saves the result in the given result vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 / v2}
	 * 
	 * @param <T> The type of the result vector.
	 * 
	 * @param v1 The first vector.
	 * @param v2 The second vector.
	 * @param res The result vector.
	 * 
	 * @return The result vector with the result.
	 */
	public static <T extends Vec3fC> T div(Vec3fR v1, Vec3fR v2, @ExtractionParam T res)
	{
		res.set(v1.getX() / v2.getX(), v1.getY() / v2.getY(), v1.getZ() / v2.getZ());
		
		return res;
	}
	
	/**
	 * Divides the first given vector {@code (v1)} by the second given vector {@code (v2[0], v2[1], v2[2])}
	 * and saves the result in the given result vector.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the arrays
	 * have to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 / (v2[0], v2[1], v2[2])}
	 * 
	 * @param <T> The type of the result vector.
	 * 
	 * @param v1 The first vector.
	 * @param v2 The second vector. Minimum legth: 3.
	 * @param res The result vector.
	 * 
	 * @return The result vector with the result.
	 */
	public static <T extends Vec3fC> T div(Vec3fR v1, @MinLength(3) float[] v2, @ExtractionParam T res)
	{
		res.set(v1.getX() / v2[0], v1.getY() / v2[1], v1.getZ() / v2[2]);
		
		return res;
	}
	
	/**
	 * Divides the first given vector {@code (v1)} by the second given vector {@code (v2x, v2y, v2z)}
	 * and saves the result in the given result vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 / (v2x, v2y, v2z)}
	 * 
	 * @param <T> The type of the result vector.
	 * 
	 * @param v1 The first vector.
	 * @param v2x The value of the x component of the second vector.
	 * @param v2y The value of the y component of the second vector.
	 * @param v2z The value of the z component of the second vector.
	 * @param res The result vector.
	 * 
	 * @return The result vector with the result.
	 */
	public static <T extends Vec3fC> T div(Vec3fR v1, float v2x, float v2y, float v2z, @ExtractionParam T res)
	{
		res.set(v1.getX() / v2x, v1.getY() / v2y, v1.getZ() / v2z);
		
		return res;
	}
	
	/**
	 * Divides the first given vector {@code (v1[0], v1[1], v1[2])} by the second given vector {@code (v2)}
	 * and saves the result in the given result vector.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the arrays
	 * have to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1], v1[2]) / v2}
	 * 
	 * @param <T> The type of the result vector.
	 * 
	 * @param v1 The first vector. Minimum legth: 3.
	 * @param v2 The second vector.
	 * @param res The result vector.
	 * 
	 * @return The result vector with the result.
	 */
	public static <T extends Vec3fC> T div(@MinLength(3) float[] v1, Vec3fR v2, @ExtractionParam T res)
	{
		res.set(v1[0] / v2.getX(), v1[1] / v2.getY(), v1[2] / v2.getZ());
		
		return res;
	}
	
	/**
	 * Divides the first given vector {@code (v1[0], v1[1], v1[2])} by the second given vector {@code (v2[0], v2[1], v2[2])}
	 * and saves the result in the given result vector.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the arrays
	 * have to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1], v1[2]) / (v2[0], v2[1], v2[2])}
	 * 
	 * @param <T> The type of the result vector.
	 * 
	 * @param v1 The first vector. Minimum legth: 3.
	 * @param v2 The second vector. Minimum legth: 3.
	 * @param res The result vector.
	 * 
	 * @return The result vector with the result.
	 */
	public static <T extends Vec3fC> T div(@MinLength(3) float[] v1, @MinLength(3) float[] v2, @ExtractionParam T res)
	{
		res.set(v1[0] / v2[0], v1[1] / v2[1], v1[2] / v2[2]);
		
		return res;
	}
	
	/**
	 * Divides the first given vector {@code (v1[0], v1[1], v1[2])} by the second given vector {@code (v2x, v2y, v2z)}
	 * and saves the result in the given result vector.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the arrays
	 * have to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1], v1[2]) / (v2x, v2y, v2z)}
	 * 
	 * @param <T> The type of the result vector.
	 * 
	 * @param v1 The first vector. Minimum legth: 3.
	 * @param v2x The value of the x component of the second vector.
	 * @param v2y The value of the y component of the second vector.
	 * @param v2z The value of the z component of the second vector.
	 * @param res The result vector.
	 * 
	 * @return The result vector with the result.
	 */
	public static <T extends Vec3fC> T div(@MinLength(3) float[] v1, float v2x, float v2y, float v2z, @ExtractionParam T res)
	{
		res.set(v1[0] / v2x, v1[1] / v2y, v1[2] / v2z);
		
		return res;
	}
	
	/**
	 * Divides the first given vector {@code (v1x, v1y, v1z)} by the second given vector {@code (v2)}
	 * and saves the result in the given result vector.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the arrays
	 * have to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y, v1z) / v2}
	 * 
	 * @param <T> The type of the result vector.
	 * 
	 * @param v1x The value of the x component of the first vector.
	 * @param v1y The value of the y component of the first vector.
	 * @param v1z The value of the z component of the first vector.
	 * @param v2 The second vector.
	 * @param res The result vector.
	 * 
	 * @return The result vector with the result.
	 */
	public static <T extends Vec3fC> T div(float v1x, float v1y, float v1z, Vec3fR v2, @ExtractionParam T res)
	{
		res.set(v1x / v2.getX(), v1y / v2.getY(), v1z / v2.getZ());
		
		return res;
	}
	
	/**
	 * Divides the first given vector {@code (v1x, v1y, v1z)} by the second given vector {@code (v2[0], v2[1], v2[2])}
	 * and saves the result in the given result vector.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the arrays
	 * have to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y, v1z) / (v2[0], v2[1], v2[2])}
	 * 
	 * @param <T> The type of the result vector.
	 * 
	 * @param v1x The value of the x component of the first vector.
	 * @param v1y The value of the y component of the first vector.
	 * @param v1z The value of the z component of the first vector.
	 * @param v2 The second vector. Minimum legth: 3.
	 * @param res The result vector.
	 * 
	 * @return The result vector with the result.
	 */
	public static <T extends Vec3fC> T div(float v1x, float v1y, float v1z, @MinLength(3) float[] v2, @ExtractionParam T res)
	{
		res.set(v1x / v2[0], v1y / v2[1], v1z / v2[2]);
		
		return res;
	}
	
	/**
	 * Divides the first given vector {@code (v1x, v1y, v1z)} by the second given vector {@code (v2x, v2y, v2z)}
	 * and saves the result in the given result vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y, v1z) / (v2x, v2y, v2z)}
	 * 
	 * @param <T> The type of the result vector.
	 * 
	 * @param v1x The value of the x component of the first vector.
	 * @param v1y The value of the y component of the first vector.
	 * @param v1z The value of the z component of the first vector.
	 * @param v2x The value of the x component of the second vector.
	 * @param v2y The value of the y component of the second vector.
	 * @param v2z The value of the z component of the second vector.
	 * @param res The result vector.
	 * 
	 * @return The result vector with the result.
	 */
	public static <T extends Vec3fC> T div(float v1x, float v1y, float v1z, float v2x, float v2y, float v2z, @ExtractionParam T res)
	{
		res.set(v1x / v2x, v1y / v2y, v1z / v2z);
		
		return res;
	}
	
	/**
	 * Divides the second given vector {@code (v2)} by the first given vector {@code (v1)}
	 * and saves the result in the given result array.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the arrays
	 * have to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v2 / v1}
	 * 
	 * @param v1 The first vector.
	 * @param v2 The second vector.
	 * @param res The result array. Minimum legth: 3.
	 * 
	 * @return The result array with the result.
	 */
	public static float[] revDiv(Vec3fR v1, Vec3fR v2, @ExtractionParam @MinLength(3) float[] res)
	{
		res[0] = v2.getX() / v1.getX();
		res[1] = v2.getY() / v1.getY();
		res[2] = v2.getZ() / v1.getZ();
		
		return res;
	}
	
	/**
	 * Divides the second given vector {@code (v2[0], v2[1], v2[2])} by the first given vector {@code (v1)}
	 * and saves the result in the given result array.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the arrays
	 * have to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2[0], v2[1], v2[2]) / v1}
	 * 
	 * @param v1 The first vector.
	 * @param v2 The second vector. Minimum legth: 3.
	 * @param res The result array. Minimum legth: 3.
	 * 
	 * @return The result array with the result.
	 */
	public static float[] revDiv(Vec3fR v1, @MinLength(3) float[] v2, @ExtractionParam @MinLength(3) float[] res)
	{
		res[0] = v2[0] / v1.getX();
		res[1] = v2[1] / v1.getY();
		res[2] = v2[2] / v1.getZ();
		
		return res;
	}
	
	/**
	 * Divides the second given vector {@code (v2x, v2y, v2z)} by the first given vector {@code (v1)}
	 * and saves the result in the given result array.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the arrays
	 * have to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2x, v2y, v2z) / v1}
	 * 
	 * @param v1 The first vector.
	 * @param v2x The value of the x component of the second vector.
	 * @param v2y The value of the y component of the second vector.
	 * @param v2z The value of the z component of the second vector.
	 * @param res The result array. Minimum legth: 3.
	 * 
	 * @return The result array with the result.
	 */
	public static float[] revDiv(Vec3fR v1, float v2x, float v2y, float v2z, @ExtractionParam @MinLength(3) float[] res)
	{
		res[0] = v2x / v1.getX();
		res[1] = v2y / v1.getY();
		res[2] = v2z / v1.getZ();
		
		return res;
	}
	
	/**
	 * Divides the second given vector {@code (v2)} by the first given vector {@code (v1[0], v1[1], v1[2])}
	 * and saves the result in the given result array.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the arrays
	 * have to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v2 / (v1[0], v1[1], v1[2])}
	 * 
	 * @param v1 The first vector. Minimum legth: 3.
	 * @param v2 The second vector.
	 * @param res The result array. Minimum legth: 3.
	 * 
	 * @return The result array with the result.
	 */
	public static float[] revDiv(@MinLength(3) float[] v1, Vec3fR v2, @ExtractionParam @MinLength(3) float[] res)
	{
		res[0] = v2.getX() / v1[0];
		res[1] = v2.getY() / v1[1];
		res[2] = v2.getZ() / v1[2];
		
		return res;
	}
	
	/**
	 * Divides the second given vector {@code (v2[0], v2[1], v2[2])} by the first given vector {@code (v1[0], v1[1], v1[2])}
	 * and saves the result in the given result array.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the arrays
	 * have to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2[0], v2[1], v2[2]) / (v1[0], v1[1], v1[2])}
	 * 
	 * @param v1 The first vector. Minimum legth: 3.
	 * @param v2 The second vector. Minimum legth: 3.
	 * @param res The result array. Minimum legth: 3.
	 * 
	 * @return The result array with the result.
	 */
	public static float[] revDiv(@MinLength(3) float[] v1, @MinLength(3) float[] v2, @ExtractionParam @MinLength(3) float[] res)
	{
		res[0] = v2[0] / v1[0];
		res[1] = v2[1] / v1[1];
		res[2] = v2[2] / v1[2];
		
		return res;
	}
	
	/**
	 * Divides the second given vector {@code (v2x, v2y, v2z)} by the first given vector {@code (v1[0], v1[1], v1[2])}
	 * and saves the result in the given result array.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the arrays
	 * have to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2x, v2y, v2z) / (v1[0], v1[1], v1[2])}
	 * 
	 * @param v1 The first vector. Minimum legth: 3.
	 * @param v2x The value of the x component of the second vector.
	 * @param v2y The value of the y component of the second vector.
	 * @param v2z The value of the z component of the second vector.
	 * @param res The result array. Minimum legth: 3.
	 * 
	 * @return The result array with the result.
	 */
	public static float[] revDiv(@MinLength(3) float[] v1, float v2x, float v2y, float v2z, @ExtractionParam @MinLength(3) float[] res)
	{
		res[0] = v2x / v1[0];
		res[1] = v2y / v1[1];
		res[2] = v2z / v1[2];
		
		return res;
	}
	
	/**
	 * Divides the second given vector {@code (v2)} by the first given vector {@code (v1x, v1y, v1z)}
	 * and saves the result in the given result array.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the arrays
	 * have to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v2 / (v1x, v1y, v1z)}
	 * 
	 * @param v1x The value of the x component of the first vector.
	 * @param v1y The value of the y component of the first vector.
	 * @param v1z The value of the z component of the first vector.
	 * @param v2 The second vector.
	 * @param res The result array. Minimum legth: 3.
	 * 
	 * @return The result array with the result.
	 */
	public static float[] revDiv(float v1x, float v1y, float v1z, Vec3fR v2, @ExtractionParam @MinLength(3) float[] res)
	{
		res[0] = v2.getX() / v1x;
		res[1] = v2.getY() / v1y;
		res[2] = v2.getZ() / v1z;
		
		return res;
	}
	
	/**
	 * Divides the second given vector {@code (v2[0], v2[1], v2[2])} by the first given vector {@code (v1x, v1y, v1z)}
	 * and saves the result in the given result array.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the arrays
	 * have to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2[0], v2[1], v2[2]) / (v1x, v1y, v1z)}
	 * 
	 * @param v1x The value of the x component of the first vector.
	 * @param v1y The value of the y component of the first vector.
	 * @param v1z The value of the z component of the first vector.
	 * @param v2 The second vector. Minimum legth: 3.
	 * @param res The result array. Minimum legth: 3.
	 * 
	 * @return The result array with the result.
	 */
	public static float[] revDiv(float v1x, float v1y, float v1z, @MinLength(3) float[] v2, @ExtractionParam @MinLength(3) float[] res)
	{
		res[0] = v2[0] / v1x;
		res[1] = v2[1] / v1y;
		res[2] = v2[2] / v1z;
		
		return res;
	}
	
	/**
	 * Divides the second given vector {@code (v2x, v2y, v2z)} by the first given vector {@code (v1x, v1y, v1z)} and saves the result in the given result array.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the arrays
	 * have to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2x, v2y, v2z) / (v1x, v1y, v1z)}
	 * 
	 * @param v1x The value of the x component of the first vector.
	 * @param v1y The value of the y component of the first vector.
	 * @param v1z The value of the z component of the first vector.
	 * @param v2x The value of the x component of the second vector.
	 * @param v2y The value of the y component of the second vector.
	 * @param v2z The value of the z component of the second vector.
	 * @param res The result array. Minimum legth: 3.
	 * 
	 * @return The result array with the result.
	 */
	public static float[] revDiv(float v1x, float v1y, float v1z, float v2x, float v2y, float v2z, @ExtractionParam @MinLength(3) float[] res)
	{
		res[0] = v2x / v1x;
		res[1] = v2y / v1y;
		res[2] = v2z / v1z;
		
		return res;
	}
	
	/**
	 * Divides the second given vector {@code (v2)} by the first given vector {@code (v1)}
	 * and saves the result in the given result vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v2 / v1}
	 * 
	 * @param <T> The type of the result vector.
	 * 
	 * @param v1 The first vector.
	 * @param v2 The second vector.
	 * @param res The result vector.
	 * 
	 * @return The result vector with the result.
	 */
	public static <T extends Vec3fC> T revDiv(Vec3fR v1, Vec3fR v2, @ExtractionParam T res)
	{
		res.set(v2.getX() / v1.getX(), v2.getY() / v1.getY(), v2.getZ() / v1.getZ());
		
		return res;
	}
	
	/**
	 * Divides the second given vector {@code (v2[0], v2[1], v2[2])} by the first given vector {@code (v1)}
	 * and saves the result in the given result vector.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the arrays
	 * have to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2[0], v2[1], v2[2]) / v1}
	 * 
	 * @param <T> The type of the result vector.
	 * 
	 * @param v1 The first vector.
	 * @param v2 The second vector. Minimum legth: 3.
	 * @param res The result vector.
	 * 
	 * @return The result vector with the result.
	 */
	public static <T extends Vec3fC> T revDiv(Vec3fR v1, @MinLength(3) float[] v2, @ExtractionParam T res)
	{
		res.set(v2[0] / v1.getX(), v2[1] / v1.getY(), v2[2] / v1.getZ());
		
		return res;
	}
	
	/**
	 * Divides the second given vector {@code (v2x, v2y, v2z)} by the first given vector {@code (v1)}
	 * and saves the result in the given result vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2x, v2y, v2z) / v1}
	 * 
	 * @param <T> The type of the result vector.
	 * 
	 * @param v1 The first vector.
	 * @param v2x The value of the x component of the second vector.
	 * @param v2y The value of the y component of the second vector.
	 * @param v2z The value of the z component of the second vector.
	 * @param res The result vector.
	 * 
	 * @return The result vector with the result.
	 */
	public static <T extends Vec3fC> T revDiv(Vec3fR v1, float v2x, float v2y, float v2z, @ExtractionParam T res)
	{
		res.set(v2x / v1.getX(), v2y / v1.getY(), v2z / v1.getZ());
		
		return res;
	}
	
	/**
	 * Divides the second given vector {@code (v2)} by the first given vector {@code (v1[0], v1[1], v1[2])}
	 * and saves the result in the given result vector.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the arrays
	 * have to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v2 / (v1[0], v1[1], v1[2])}
	 * 
	 * @param <T> The type of the result vector.
	 * 
	 * @param v1 The first vector. Minimum legth: 3.
	 * @param v2 The second vector.
	 * @param res The result vector.
	 * 
	 * @return The result vector with the result.
	 */
	public static <T extends Vec3fC> T revDiv(@MinLength(3) float[] v1, Vec3fR v2, @ExtractionParam T res)
	{
		res.set(v2.getX() / v1[0], v2.getY() / v1[1], v2.getZ() / v1[2]);
		
		return res;
	}
	
	/**
	 * Divides the second given vector {@code (v2[0], v2[1], v2[2])} by the first given vector {@code (v1[0], v1[1], v1[2])}
	 * and saves the result in the given result vector.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the arrays
	 * have to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2[0], v2[1], v2[2]) / (v1[0], v1[1], v1[2])}
	 * 
	 * @param <T> The type of the result vector.
	 * 
	 * @param v1 The first vector. Minimum legth: 3.
	 * @param v2 The second vector. Minimum legth: 3.
	 * @param res The result vector.
	 * 
	 * @return The result vector with the result.
	 */
	public static <T extends Vec3fC> T revDiv(@MinLength(3) float[] v1, @MinLength(3) float[] v2, @ExtractionParam T res)
	{
		res.set(v2[0] / v1[0], v2[1] / v1[1], v2[2] / v1[2]);
		
		return res;
	}
	
	/**
	 * Divides the second given vector {@code (v2x, v2y, v2z)} by the first given vector {@code (v1[0], v1[1], v1[2])}
	 * and saves the result in the given result vector.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the arrays
	 * have to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2x, v2y, v2z) / (v1[0], v1[1], v1[2])}
	 * 
	 * @param <T> The type of the result vector.
	 * 
	 * @param v1 The first vector. Minimum legth: 3.
	 * @param v2x The value of the x component of the second vector.
	 * @param v2y The value of the y component of the second vector.
	 * @param v2z The value of the z component of the second vector.
	 * @param res The result vector.
	 * 
	 * @return The result vector with the result.
	 */
	public static <T extends Vec3fC> T revDiv(@MinLength(3) float[] v1, float v2x, float v2y, float v2z, @ExtractionParam T res)
	{
		res.set(v2x / v1[0], v2y / v1[1], v2z / v1[2]);
		
		return res;
	}
	
	/**
	 * Divides the second given vector {@code (v2)} by the first given vector {@code (v1x, v1y, v1z)}
	 * and saves the result in the given result vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v2 / (v1x, v1y, v1z)}
	 * 
	 * @param <T> The type of the result vector.
	 * 
	 * @param v1x The value of the x component of the first vector.
	 * @param v1y The value of the y component of the first vector.
	 * @param v1z The value of the z component of the first vector.
	 * @param v2 The second vector.
	 * @param res The result vector.
	 * 
	 * @return The result vector with the result.
	 */
	public static <T extends Vec3fC> T revDiv(float v1x, float v1y, float v1z, Vec3fR v2, @ExtractionParam T res)
	{
		res.set(v2.getX() / v1x, v2.getY() / v1y, v2.getZ() / v1z);
		
		return res;
	}
	
	/**
	 * Divides the second given vector {@code (v2[0], v2[1], v2[2])} by the first given vector {@code (v1x, v1y, v1z)}
	 * and saves the result in the given result vector.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the arrays
	 * have to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2[0], v2[1], v2[2]) / (v1x, v1y, v1z)}
	 * 
	 * @param <T> The type of the result vector.
	 * 
	 * @param v1x The value of the x component of the first vector.
	 * @param v1y The value of the y component of the first vector.
	 * @param v1z The value of the z component of the first vector.
	 * @param v2 The second vector. Minimum legth: 3.
	 * @param res The result vector.
	 * 
	 * @return The result vector with the result.
	 */
	public static <T extends Vec3fC> T revDiv(float v1x, float v1y, float v1z, @MinLength(3) float[] v2, @ExtractionParam T res)
	{
		res.set(v2[0] / v1x, v2[1] / v1y, v2[2] / v1z);
		
		return res;
	}
	
	/**
	 * Divides the second given vector {@code (v2x, v2y, v2z)} by the first given vector {@code (v1x, v1y, v1z)}
	 * and saves the result in the given result vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2x, v2y, v2z) / (v1x, v1y, v1z)}
	 * 
	 * @param <T> The type of the result vector.
	 * 
	 * @param v1x The value of the x component of the first vector.
	 * @param v1y The value of the y component of the first vector.
	 * @param v1z The value of the z component of the first vector.
	 * @param v2x The value of the x component of the second vector.
	 * @param v2y The value of the y component of the second vector.
	 * @param v2z The value of the z component of the second vector.
	 * @param res The result vector.
	 * 
	 * @return The result vector with the result.
	 */
	public static <T extends Vec3fC> T revDiv(float v1x, float v1y, float v1z, float v2x, float v2y, float v2z, @ExtractionParam T res)
	{
		res.set(v2x / v1x, v2y / v1y, v2z / v1z);
		
		return res;
	}
	
	/**
	 * Multiplies the given vector {@code (v1)} with the given vector {@code (v2)}, adds the given vector {@code (v3)}
	 * to the product result and saves the result in the given result array.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the arrays
	 * have to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code  v1 * v2 + v3}
	 * 
	 * @param v1 The first multiplicant vector.
	 * @param v2 The second multiplicant vector.
	 * @param v3 The addend vector.
	 * @param res The result array. Minimum legth: 3.
	 * 
	 * @return The result array with the result.
	 */
	public static float[] mulAdd(Vec3fR v1, Vec3fR v2, Vec3fR v3, @ExtractionParam @MinLength(3) float[] res)
	{
		res[0] = v1.getX() * v2.getX() + v3.getX();
		res[1] = v1.getY() * v2.getY() + v3.getY();
		res[2] = v1.getZ() * v2.getZ() + v3.getZ();
		
		return res;
	}
	
	/**
	 * Multiplies the given vector {@code (v1)} with the given vector {@code (v2)}, adds the given vector {@code (v3[0], v3[1], v3[2])}
	 * to the product result and saves the result in the given result array.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the arrays
	 * have to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 * v2 + (v3[0], v3[1], v3[2])}
	 * 
	 * @param v1 The first multiplicant vector.
	 * @param v2 The second multiplicant vector.
	 * @param v3 The addend vector. Minimum legth: 3.
	 * @param res The result array. Minimum legth: 3.
	 * 
	 * @return The result array with the result.
	 */
	public static float[] mulAdd(Vec3fR v1, Vec3fR v2, @MinLength(3) float[] v3, @ExtractionParam @MinLength(3) float[] res)
	{
		res[0] = v1.getX() * v2.getX() + v3[0];
		res[1] = v1.getY() * v2.getY() + v3[1];
		res[2] = v1.getZ() * v2.getZ() + v3[2];
		
		return res;
	}
	
	/**
	 * Multiplies the given vector {@code (v1)} with the given vector {@code (v2)}, adds the given vector {@code (v3x, v3y, v3z)}
	 * to the product result and saves the result in the given result array.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the arrays
	 * have to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 * v2 + (v3x, v3y, v3z)}
	 * 
	 * @param v1 The first multiplicant vector.
	 * @param v2 The second multiplicant vector.
	 * @param v3x The value of the x component of the addend vector.
	 * @param v3y The value of the y component of the addend vector.
	 * @param v3z The value of the z component of the addend vector.
	 * @param res The result array. Minimum legth: 3.
	 * 
	 * @return The result array with the result.
	 */
	public static float[] mulAdd(Vec3fR v1, Vec3fR v2, float v3x, float v3y, float v3z, @ExtractionParam @MinLength(3) float[] res)
	{
		res[0] = v1.getX() * v2.getX() + v3x;
		res[1] = v1.getY() * v2.getY() + v3y;
		res[2] = v1.getZ() * v2.getZ() + v3z;
		
		return res;
	}
	
	/**
	 * Multiplies the given vector {@code (v1)} with the given vector {@code (v2[0], v2[1], v2[2])}, adds the given vector {@code (v3)}
	 * to the product result and saves the result in the given result array.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the arrays
	 * have to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 * (v2[0], v2[1], v2[2]) + v3}
	 * 
	 * @param v1 The first multiplicant vector.
	 * @param v2 The second multiplicant vector. Minimum legth: 3.
	 * @param v3 The addend vector.
	 * @param res The result array. Minimum legth: 3.
	 * 
	 * @return The result array with the result.
	 */
	public static float[] mulAdd(Vec3fR v1, @MinLength(3) float[] v2, Vec3fR v3, @ExtractionParam @MinLength(3) float[] res)
	{
		res[0] = v1.getX() * v2[0] + v3.getX();
		res[1] = v1.getY() * v2[1] + v3.getY();
		res[2] = v1.getZ() * v2[2] + v3.getZ();
		
		return res;
	}
	
	/**
	 * Multiplies the given vector {@code (v1)} with the given vector {@code (v2[0], v2[1], v2[2])}, adds the given vector {@code (v3[0], v3[1], v3[2])}
	 * to the product result and saves the result in the given result array.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the arrays
	 * have to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 * (v2[0], v2[1], v2[2]) + (v3[0], v3[1], v3[2])}
	 * 
	 * @param v1 The first multiplicant vector.
	 * @param v2 The second multiplicant vector. Minimum legth: 3.
	 * @param v3 The addend vector. Minimum legth: 3.
	 * @param res The result array. Minimum legth: 3.
	 * 
	 * @return The result array with the result.
	 */
	public static float[] mulAdd(Vec3fR v1, @MinLength(3) float[] v2, @MinLength(3) float[] v3, @ExtractionParam @MinLength(3) float[] res)
	{
		res[0] = v1.getX() * v2[0] + v3[0];
		res[1] = v1.getY() * v2[1] + v3[1];
		res[2] = v1.getZ() * v2[2] + v3[2];
		
		return res;
	}
	
	/**
	 * Multiplies the given vector {@code (v1)} with the given vector {@code (v2[0], v2[1], v2[2])}, adds the given vector {@code (v3x, v3y, v3z)}
	 * to the product result and saves the result in the given result array.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the arrays
	 * have to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 * (v2[0], v2[1], v2[2]) + (v3x, v3y, v3z)}
	 * 
	 * @param v1 The first multiplicant vector.
	 * @param v2 The second multiplicant vector. Minimum legth: 3.
	 * @param v3x The value of the x component of the addend vector.
	 * @param v3y The value of the y component of the addend vector.
	 * @param v3z The value of the z component of the addend vector.
	 * @param res The result array. Minimum legth: 3.
	 * 
	 * @return The result array with the result.
	 */
	public static float[] mulAdd(Vec3fR v1, @MinLength(3) float[] v2, float v3x, float v3y, float v3z, @ExtractionParam @MinLength(3) float[] res)
	{
		res[0] = v1.getX() * v2[0] + v3x;
		res[1] = v1.getY() * v2[1] + v3y;
		res[2] = v1.getZ() * v2[2] + v3z;
		
		return res;
	}
	
	/**
	 * Multiplies the given vector {@code (v1)} with the given vector {@code (v2x, v2y, v2z)}, adds the given vector {@code (v3)}
	 * to the product result and saves the result in the given result array.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the arrays
	 * have to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 * (v2x, v2y, v2z) + v3}
	 * 
	 * @param v1 The first multiplicant vector.
	 * @param v2x The value of the x component of the second multiplicant vector.
	 * @param v2y The value of the y component of the second multiplicant vector.
	 * @param v2z The value of the z component of the second multiplicant vector.
	 * @param v3 The addend vector.
	 * @param res The result array. Minimum legth: 3.
	 * 
	 * @return The result array with the result.
	 */
	public static float[] mulAdd(Vec3fR v1, float v2x, float v2y, float v2z, Vec3fR v3, @ExtractionParam @MinLength(3) float[] res)
	{
		res[0] = v1.getX() * v2x + v3.getX();
		res[1] = v1.getY() * v2y + v3.getY();
		res[2] = v1.getZ() * v2z + v3.getZ();
		
		return res;
	}
	
	/**
	 * Multiplies the given vector {@code (v1)} with the given vector {@code (v2x, v2y, v2z)}, adds the given vector {@code (v3[0], v3[1], v3[2])}
	 * to the product result and saves the result in the given result array.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the arrays
	 * have to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 * (v2x, v2y, v2z) + (v3[0], v3[1], v3[2])}
	 * 
	 * @param v1 The first multiplicant vector.
	 * @param v2x The value of the x component of the second multiplicant vector.
	 * @param v2y The value of the y component of the second multiplicant vector.
	 * @param v2z The value of the z component of the second multiplicant vector.
	 * @param v3 The addend vector. Minimum legth: 3.
	 * @param res The result array. Minimum legth: 3.
	 * 
	 * @return The result array with the result.
	 */
	public static float[] mulAdd(Vec3fR v1, float v2x, float v2y, float v2z, @MinLength(3) float[] v3, @ExtractionParam @MinLength(3) float[] res)
	{
		res[0] = v1.getX() * v2x + v3[0];
		res[1] = v1.getY() * v2y + v3[1];
		res[2] = v1.getZ() * v2z + v3[2];
		
		return res;
	}
	
	/**
	 * Multiplies the given vector {@code (v1)} with the given vector {@code (v2x, v2y, v2z)}, adds the given vector {@code (v3x, v3y, v3z)}
	 * to the product result and saves the result in the given result array.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the arrays
	 * have to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 * (v2x, v2y, v2z) + (v3x, v3y, v3z)}
	 * 
	 * @param v1 The first multiplicant vector. Minimum legth: 3.
	 * @param v2x The value of the x component of the second multiplicant vector.
	 * @param v2y The value of the y component of the second multiplicant vector.
	 * @param v2z The value of the z component of the second multiplicant vector.
	 * @param v3x The value of the x component of the addend vector.
	 * @param v3y The value of the y component of the addend vector.
	 * @param v3z The value of the z component of the addend vector. 
	 * @param res The result array. Minimum legth: 3.
	 * 
	 * @return The result array with the result.
	 */
	public static float[] mulAdd(Vec3fR v1, float v2x, float v2y, float v2z, float v3x, float v3y, float v3z, @ExtractionParam @MinLength(3) float[] res)
	{
		res[0] = v1.getX() * v2x + v2x;
		res[1] = v1.getY() * v2y + v2y;
		res[2] = v1.getZ() * v2z + v2z;
		
		return res;
	}
	
	/**
	 * Multiplies the given vector {@code (v1[0], v1[1], v1[2])} with the given vector {@code (v2)}, adds the given vector {@code (v3)}
	 * to the product result and saves the result in the given result array.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the arrays
	 * have to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1], v1[2]) * v2 + v3}
	 * 
	 * @param v1 The first multiplicant vector. Minimum legth: 3.
	 * @param v2 The second multiplicant vector.
	 * @param v3 The addend vector.
	 * @param res The result array. Minimum legth: 3.
	 * 
	 * @return The result array with the result.
	 */
	public static float[] mulAdd(@MinLength(3) float[] v1, Vec3fR v2, Vec3fR v3, @ExtractionParam @MinLength(3) float[] res)
	{
		res[0] = v1[0] * v2.getX() + v3.getX();
		res[1] = v1[1] * v2.getY() + v3.getY();
		res[2] = v1[2] * v2.getZ() + v3.getZ();
		
		return res;
	}
	
	/**
	 * Multiplies the given vector {@code (v1[0], v1[1], v1[2])} with the given vector {@code (v2)}, adds the given vector {@code (v3[0], v3[1], v3[2])}
	 * to the product result and saves the result in the given result array.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the arrays
	 * have to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1], v1[2]) * v2 + (v3[0], v3[1], v3[2])}
	 * 
	 * @param v1 The first multiplicant vector. Minimum legth: 3.
	 * @param v2 The second multiplicant vector.
	 * @param v3 The addend vector. Minimum legth: 3.
	 * @param res The result array. Minimum legth: 3.
	 * 
	 * @return The result array with the result.
	 */
	public static float[] mulAdd(@MinLength(3) float[] v1, Vec3fR v2, @MinLength(3) float[] v3, @ExtractionParam @MinLength(3) float[] res)
	{
		res[0] = v1[0] * v2.getX() + v3[0];
		res[1] = v1[1] * v2.getY() + v3[1];
		res[2] = v1[2] * v2.getZ() + v3[2];
		
		return res;
	}
	
	/**
	 * Multiplies the given vector {@code (v1[0], v1[1], v1[2])} with the given vector {@code (v2)}, adds the given vector {@code (v3x, v3y, v3z)}
	 * to the product result and saves the result in the given result array.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the arrays
	 * have to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1], v1[2]) * v2 + (v3x, v3y, v3z)}
	 * 
	 * @param v1 The first multiplicant vector. Minimum legth: 3.
	 * @param v2 The second multiplicant vector.
	 * @param v3x The value of the x component of the addend vector.
	 * @param v3y The value of the y component of the addend vector.
	 * @param v3z The value of the z component of the addend vector.
	 * @param res The result array. Minimum legth: 3.
	 * 
	 * @return The result array with the result.
	 */
	public static float[] mulAdd(@MinLength(3) float[] v1, Vec3fR v2, float v3x, float v3y, float v3z, @ExtractionParam @MinLength(3) float[] res)
	{
		res[0] = v1[0] * v2.getX() + v3x;
		res[1] = v1[1] * v2.getY() + v3y;
		res[2] = v1[2] * v2.getZ() + v3z;
		
		return res;
	}
	
	/**
	 * Multiplies the given vector {@code (v1[0], v1[1], v1[2])} with the given vector {@code (v2[0], v2[1], v2[2])}, adds the given vector {@code (v3)}
	 * to the product result and saves the result in the given result array.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the arrays
	 * have to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1], v1[2]) * (v2[0], v2[1], v2[2]) + v3}
	 * 
	 * @param v1 The first multiplicant vector. Minimum legth: 3.
	 * @param v2 The second multiplicant vector. Minimum legth: 3.
	 * @param v3 The addend vector.
	 * @param res The result array. Minimum legth: 3.
	 * 
	 * @return The result array with the result.
	 */
	public static float[] mulAdd(@MinLength(3) float[] v1, @MinLength(3) float[] v2, Vec3fR v3, @ExtractionParam @MinLength(3) float[] res)
	{
		res[0] = v1[0] * v2[0] + v3.getX();
		res[1] = v1[1] * v2[1] + v3.getY();
		res[2] = v1[2] * v2[2] + v3.getZ();
		
		return res;
	}
	
	/**
	 * Multiplies the given vector {@code (v1[0], v1[1], v1[2])} with the given vector {@code (v2[0], v2[1], v2[2])}, adds the given vector {@code (v3[0], v3[1], v3[2])}
	 * to the product result and saves the result in the given result array.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the arrays
	 * have to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1], v1[2]) * (v2[0], v2[1], v2[2]) + (v3[0], v3[1], v3[2])}
	 * 
	 * @param v1 The first multiplicant vector. Minimum legth: 3.
	 * @param v2 The second multiplicant vector. Minimum legth: 3.
	 * @param v3 The addend vector. Minimum legth: 3.
	 * @param res The result array. Minimum legth: 3.
	 * 
	 * @return The result array with the result.
	 */
	public static float[] mulAdd(@MinLength(3) float[] v1, @MinLength(3) float[] v2, @MinLength(3) float[] v3, @ExtractionParam @MinLength(3) float[] res)
	{
		res[0] = v1[0] * v2[0] + v3[0];
		res[1] = v1[1] * v2[1] + v3[1];
		res[2] = v1[2] * v2[2] + v3[2];
		
		return res;
	}
	
	/**
	 * Multiplies the given vector {@code (v1[0], v1[1], v1[2])} with the given vector {@code (v2[0], v2[1], v2[2])}, adds the given vector {@code (v3x, v3y, v3z)}
	 * to the product result and saves the result in the given result array.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the arrays
	 * have to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1], v1[2]) * (v2[0], v2[1], v2[2]) + (v3x, v3y, v3z)}
	 * 
	 * @param v1 The first multiplicant vector. Minimum legth: 3.
	 * @param v2 The second multiplicant vector. Minimum legth: 3.
	 * @param v3x The value of the x component of the addend vector.
	 * @param v3y The value of the y component of the addend vector.
	 * @param v3z The value of the z component of the addend vector.
	 * @param res The result array. Minimum legth: 3.
	 * 
	 * @return The result array with the result.
	 */
	public static float[] mulAdd(@MinLength(3) float[] v1, @MinLength(3) float[] v2, float v3x, float v3y, float v3z, @ExtractionParam @MinLength(3) float[] res)
	{
		res[0] = v1[0] * v2[0] + v3x;
		res[1] = v1[1] * v2[1] + v3y;
		res[2] = v1[2] * v2[2] + v3z;
		
		return res;
	}

	/**
	 * Multiplies the given vector {@code (v1[0], v1[1], v1[2])} with the given vector {@code (v2x, v2y, v2z)}, adds the given vector {@code (v3)}
	 * to the product result and saves the result in the given result array.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the arrays
	 * have to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1], v1[2]) * (v2x, v2y, v2z) + v3}
	 * 
	 * @param v1 The first multiplicant vector. Minimum legth: 3.
	 * @param v2x The value of the x component of the second multiplicant vector.
	 * @param v2y The value of the y component of the second multiplicant vector.
	 * @param v2z The value of the z component of the second multiplicant vector.
	 * @param v3 The addend vector.
	 * @param res The result array. Minimum legth: 3.
	 * 
	 * @return The result array with the result.
	 */
	public static float[] mulAdd(@MinLength(3) float[] v1, float v2x, float v2y, float v2z, Vec3fR v3, @ExtractionParam @MinLength(3) float[] res)
	{
		res[0] = v1[0] * v2x + v3.getX();
		res[1] = v1[1] * v2y + v3.getY();
		res[2] = v1[2] * v2z + v3.getZ();
		
		return res;
	}
	
	/**
	 * Multiplies the given vector {@code (v1[0], v1[1], v1[2])} with the given vector {@code (v2x, v2y, v2z)}, adds the given vector {@code (v3[0], v3[1], v3[2])}
	 * to the product result and saves the result in the given result array.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the arrays
	 * have to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1], v1[2]) * (v2x, v2y, v2z) + (v3[0], v3[1], v3[2])}
	 * 
	 * @param v1 The first multiplicant vector. Minimum legth: 3.
	 * @param v2x The value of the x component of the second multiplicant vector.
	 * @param v2y The value of the y component of the second multiplicant vector.
	 * @param v2z The value of the z component of the second multiplicant vector.
	 * @param v3 The addend vector. Minimum legth: 3.
	 * @param res The result array. Minimum legth: 3.
	 * 
	 * @return The result array with the result.
	 */
	public static float[] mulAdd(@MinLength(3) float[] v1, float v2x, float v2y, float v2z, @MinLength(3) float[] v3, @ExtractionParam @MinLength(3) float[] res)
	{
		res[0] = v1[0] * v2x + v3[0];
		res[1] = v1[1] * v2y + v3[1];
		res[2] = v1[2] * v2z + v3[2];
		
		return res;
	}
	
	/**
	 * Multiplies the given vector {@code (v1[0], v1[1], v1[2])} with the given vector {@code (v2x, v2y, v2z)}, adds the given vector {@code (v3x, v3y, v3z)}
	 * to the product result and saves the result in the given result array.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the arrays
	 * have to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1], v1[2]) * (v2x, v2y, v2z) + (v3x, v3y, v3z)}
	 * 
	 * @param v1 The first multiplicant vector. Minimum legth: 3.
	 * @param v2x The value of the x component of the second multiplicant vector.
	 * @param v2y The value of the y component of the second multiplicant vector.
	 * @param v2z The value of the z component of the second multiplicant vector.
	 * @param v3x The value of the x component of the addend vector.
	 * @param v3y The value of the y component of the addend vector.
	 * @param v3z The value of the z component of the addend vector. 
	 * @param res The result array. Minimum legth: 3.
	 * 
	 * @return The result array with the result.
	 */
	public static float[] mulAdd(@MinLength(3) float[] v1, float v2x, float v2y, float v2z, float v3x, float v3y, float v3z, @ExtractionParam @MinLength(3) float[] res)
	{
		res[0] = v1[0] * v2x + v2x;
		res[1] = v1[1] * v2y + v2y;
		res[2] = v1[2] * v2z + v2z;
		
		return res;
	}
	
	/**
	 * Multiplies the given vector {@code (v1x, v1y, v1z)} with the given vector {@code (v2)}, adds the given vector {@code (v3)}
	 * to the product result and saves the result in the given result array.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the arrays
	 * have to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y, v1z) * v2 + v3}
	 * 
	 * @param v1x The value of the x component of the first multiplicant vector.
	 * @param v1y The value of the y component of the first multiplicant vector.
	 * @param v1z The value of the z component of the first multiplicant vector.
	 * @param v2 The second multiplicant vector.
	 * @param v3 The addend vector.
	 * @param res The result array. Minimum legth: 3.
	 * 
	 * @return The result array with the result.
	 */
	public static float[] mulAdd(float v1x, float v1y, float v1z, Vec3fR v2, Vec3fR v3, @ExtractionParam @MinLength(3) float[] res)
	{
		res[0] = v1x * v2.getX() + v3.getX();
		res[1] = v1y * v2.getY() + v3.getY();
		res[2] = v1z * v2.getZ() + v3.getZ();
		
		return res;
	}
	
	/**
	 * Multiplies the given vector {@code (v1x, v1y, v1z)} with the given vector {@code (v2)}, adds the given vector {@code (v3[0], v3[1], v3[2])}
	 * to the product result and saves the result in the given result array.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the arrays
	 * have to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y, v1z) * v2 + (v3[0], v3[1], v3[2])}
	 * 
	 * @param v1x The value of the x component of the first multiplicant vector.
	 * @param v1y The value of the y component of the first multiplicant vector.
	 * @param v1z The value of the z component of the first multiplicant vector.
	 * @param v2 The second multiplicant vector.
	 * @param v3 The addend vector. Minimum legth: 3.
	 * @param res The result array. Minimum legth: 3.
	 * 
	 * @return The result array with the result.
	 */
	public static float[] mulAdd(float v1x, float v1y, float v1z, Vec3fR v2, @MinLength(3) float[] v3, @ExtractionParam @MinLength(3) float[] res)
	{
		res[0] = v1x * v2.getX() + v3[0];
		res[1] = v1y * v2.getY() + v3[1];
		res[2] = v1z * v2.getZ() + v3[2];
		
		return res;
	}
	
	/**
	 * Multiplies the given vector {@code (v1x, v1y, v1z)} with the given vector {@code (v2)}, adds the given vector {@code (v3x, v3y, v3z)}
	 * to the product result and saves the result in the given result array.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the arrays
	 * have to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y, v1z) * v2 + (v3x, v3y, v3z)}
	 * 
	 * @param v1x The value of the x component of the first multiplicant vector.
	 * @param v1y The value of the y component of the first multiplicant vector.
	 * @param v1z The value of the z component of the first multiplicant vector.
	 * @param v2 The second multiplicant vector.
	 * @param v3x The value of the x component of the addend vector.
	 * @param v3y The value of the y component of the addend vector.
	 * @param v3z The value of the z component of the addend vector.
	 * @param res The result array. Minimum legth: 3.
	 * 
	 * @return The result array with the result.
	 */
	public static float[] mulAdd(float v1x, float v1y, float v1z, Vec3fR v2, float v3x, float v3y, float v3z, @ExtractionParam @MinLength(3) float[] res)
	{
		res[0] = v1x * v2.getX() + v3x;
		res[1] = v1y * v2.getY() + v3y;
		res[2] = v1z * v2.getZ() + v3z;
		
		return res;
	}
	
	/**
	 * Multiplies the given vector {@code (v1x, v1y, v1z)} with the given vector {@code (v2[0], v2[1], v2[2])}, adds the given vector {@code (v3)}
	 * to the product result and saves the result in the given result array.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the arrays
	 * have to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y, v1z) * (v2[0], v2[1], v2[2]) + v3}
	 * 
	 * @param v1x The value of the x component of the first multiplicant vector.
	 * @param v1y The value of the y component of the first multiplicant vector.
	 * @param v1z The value of the z component of the first multiplicant vector.
	 * @param v2 The second multiplicant vector. Minimum legth: 3.
	 * @param v3 The addend vector.
	 * @param res The result array. Minimum legth: 3.
	 * 
	 * @return The result array with the result.
	 */
	public static float[] mulAdd(float v1x, float v1y, float v1z, @MinLength(3) float[] v2, Vec3fR v3, @ExtractionParam @MinLength(3) float[] res)
	{
		res[0] = v1x * v2[0] + v3.getX();
		res[1] = v1y * v2[1] + v3.getY();
		res[2] = v1z * v2[2] + v3.getZ();
		
		return res;
	}
	
	/**
	 * Multiplies the given vector {@code (v1x, v1y, v1z)} with the given vector {@code (v2[0], v2[1], v2[2])}, adds the given vector {@code (v3[0], v3[1], v3[2])}
	 * to the product result and saves the result in the given result array.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the arrays
	 * have to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y, v1z) * (v2[0], v2[1], v2[2]) + (v3[0], v3[1], v3[2])}
	 * 
	 * @param v1x The value of the x component of the first multiplicant vector.
	 * @param v1y The value of the y component of the first multiplicant vector.
	 * @param v1z The value of the z component of the first multiplicant vector.
	 * @param v2 The second multiplicant vector. Minimum legth: 3.
	 * @param v3 The addend vector. Minimum legth: 3.
	 * @param res The result array. Minimum legth: 3.
	 * 
	 * @return The result array with the result.
	 */
	public static float[] mulAdd(float v1x, float v1y, float v1z, @MinLength(3) float[] v2, @MinLength(3) float[] v3, @ExtractionParam @MinLength(3) float[] res)
	{
		res[0] = v1x * v2[0] + v3[0];
		res[1] = v1y * v2[1] + v3[1];
		res[2] = v1z * v2[2] + v3[2];
		
		return res;
	}
	
	/**
	 * Multiplies the given vector {@code (v1x, v1y, v1z)} with the given vector {@code (v2[0], v2[1], v2[2])}, adds the given vector {@code (v3x, v3y, v3z)}
	 * to the product result and saves the result in the given result array.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the arrays
	 * have to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y, v1z) * (v2[0], v2[1], v2[2]) + (v3x, v3y, v3z)}
	 * 
	 * @param v1x The value of the x component of the first multiplicant vector.
	 * @param v1y The value of the y component of the first multiplicant vector.
	 * @param v1z The value of the z component of the first multiplicant vector.
	 * @param v2 The second multiplicant vector. Minimum legth: 3.
	 * @param v3x The value of the x component of the addend vector.
	 * @param v3y The value of the y component of the addend vector.
	 * @param v3z The value of the z component of the addend vector.
	 * @param res The result array. Minimum legth: 3.
	 * 
	 * @return The result array with the result.
	 */
	public static float[] mulAdd(float v1x, float v1y, float v1z, @MinLength(3) float[] v2, float v3x, float v3y, float v3z, @ExtractionParam @MinLength(3) float[] res)
	{
		res[0] = v1x * v2[0] + v3x;
		res[1] = v1y * v2[1] + v3y;
		res[2] = v1z * v2[2] + v3z;
		
		return res;
	}
	
	/**
	 * Multiplies the given vector {@code (v1x, v1y, v1z)} with the given vector {@code (v2x, v2y, v2z)}, adds the given vector {@code (v3)}
	 * to the product result and saves the result in the given result array.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the arrays
	 * have to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y, v1z) * (v2x, v2y, v2z) + v3}
	 * 
	 * @param v1x The value of the x component of the first multiplicant vector.
	 * @param v1y The value of the y component of the first multiplicant vector.
	 * @param v1z The value of the z component of the first multiplicant vector.
	 * @param v2x The value of the x component of the second multiplicant vector.
	 * @param v2y The value of the y component of the second multiplicant vector.
	 * @param v2z The value of the z component of the second multiplicant vector.
	 * @param v3 The addend vector.
	 * @param res The result array. Minimum legth: 3.
	 * 
	 * @return The result array with the result.
	 */
	public static float[] mulAdd(float v1x, float v1y, float v1z, float v2x, float v2y, float v2z, Vec3fR v3, @ExtractionParam @MinLength(3) float[] res)
	{
		res[0] = v1x * v2x + v3.getX();
		res[1] = v1y * v2y + v3.getY();
		res[2] = v1z * v2z + v3.getZ();
		
		return res;
	}
	
	/**
	 * Multiplies the given vector {@code (v1x, v1y, v1z)} with the given vector {@code (v2x, v2y, v2z)}, adds the given vector {@code (v3[0], v3[1], v3[2])}
	 * to the product result and saves the result in the given result array.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the arrays
	 * have to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y, v1z) * (v2x, v2y, v2z) + (v3[0], v3[1], v3[2])}
	 * 
	 * @param v1x The value of the x component of the first multiplicant vector.
	 * @param v1y The value of the y component of the first multiplicant vector.
	 * @param v1z The value of the z component of the first multiplicant vector.
	 * @param v2x The value of the x component of the second multiplicant vector.
	 * @param v2y The value of the y component of the second multiplicant vector.
	 * @param v2z The value of the z component of the second multiplicant vector.
	 * @param v3 The addend vector. Minimum legth: 3.
	 * @param res The result array. Minimum legth: 3.
	 * 
	 * @return The result array with the result.
	 */
	public static float[] mulAdd(float v1x, float v1y, float v1z, float v2x, float v2y, float v2z, @MinLength(3) float[] v3, @ExtractionParam @MinLength(3) float[] res)
	{
		res[0] = v1x * v2x + v3[0];
		res[1] = v1y * v2y + v3[1];
		res[2] = v1z * v2z + v3[2];
		
		return res;
	}
	
	/**
	 * Multiplies the given vector {@code (v1x, v1y, v1z)} with the given vector {@code (v2x, v2y, v2z)}, adds the given vector {@code (v3x, v3y, v3z)}
	 * to the product result and saves the result in the given result array.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the arrays
	 * have to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y, v1z) * (v2x, v2y, v2z) + (v3x, v3y, v3z)}
	 * 
	 * @param v1x The value of the x component of the first multiplicant vector.
	 * @param v1y The value of the y component of the first multiplicant vector.
	 * @param v1z The value of the z component of the first multiplicant vector.
	 * @param v2x The value of the x component of the second multiplicant vector.
	 * @param v2y The value of the y component of the second multiplicant vector.
	 * @param v2z The value of the z component of the second multiplicant vector.
	 * @param v3x The value of the x component of the addend vector.
	 * @param v3y The value of the y component of the addend vector.
	 * @param v3z The value of the z component of the addend vector.
	 * @param res The result array. Minimum legth: 3.
	 * 
	 * @return The result array with the result.
	 */
	public static float[] mulAdd(float v1x, float v1y, float v1z, float v2x, float v2y, float v2z, float v3x, float v3y, float v3z, @ExtractionParam @MinLength(3) float[] res)
	{
		res[0] = v1x * v2x + v3x;
		res[1] = v1y * v2y + v3y;
		res[2] = v1z * v2z + v3z;
		
		return res;
	}
	
	/**
	 * Multiplies the given vector {@code (v1)} with the given vector {@code (v2)}, adds the given vector {@code (v3)}
	 * to the product result and saves the result in the given result vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code  v1 * v2 + v3}
	 * 
	 * @param <T> The type of the result vector.
	 * 
	 * @param v1 The first multiplicant vector.
	 * @param v2 The second multiplicant vector.
	 * @param v3 The addend vector.
	 * @param res The result vector.
	 * 
	 * @return The result vector with the result.
	 */
	public static <T extends Vec3fC> T mulAdd(Vec3fR v1, Vec3fR v2, Vec3fR v3, @ExtractionParam T res)
	{
		res.set(v1.getX() * v2.getX() + v3.getX(), v1.getY() * v2.getY() + v3.getY(), v1.getZ() * v2.getZ() + v3.getZ());
		
		return res;
	}
	
	/**
	 * Multiplies the given vector {@code (v1)} with the given vector {@code (v2)}, adds the given vector {@code (v3[0], v3[1], v3[2])}
	 * to the product result and saves the result in the given result array.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the arrays
	 * have to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 * v2 + (v3[0], v3[1], v3[2])}
	 * 
	 * @param <T> The type of the result vector.
	 * 
	 * @param v1 The first multiplicant vector.
	 * @param v2 The second multiplicant vector.
	 * @param v3 The addend vector. Minimum legth: 3.
	 * @param res The result vector.
	 * 
	 * @return The result vector with the result.
	 */
	public static <T extends Vec3fC> T mulAdd(Vec3fR v1, Vec3fR v2, @MinLength(3) float[] v3, @ExtractionParam T res)
	{
		res.set(v1.getX() * v2.getX() + v3[0], v1.getY() * v2.getY() + v3[1], v1.getZ() * v2.getZ() + v3[2]);
		
		return res;
	}
	
	/**
	 * Multiplies the given vector {@code (v1)} with the given vector {@code (v2)}, adds the given vector {@code (v3x, v3y, v3z)}
	 * to the product result and saves the result in the given result vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 * v2 + (v3x, v3y, v3z)}
	 * 
	 * @param <T> The type of the result vector.
	 * 
	 * @param v1 The first multiplicant vector.
	 * @param v2 The second multiplicant vector.
	 * @param v3x The value of the x component of the addend vector.
	 * @param v3y The value of the y component of the addend vector.
	 * @param v3z The value of the z component of the addend vector.
	 * @param res The result vector.
	 * 
	 * @return The result vector with the result.
	 */
	public static <T extends Vec3fC> T mulAdd(Vec3fR v1, Vec3fR v2, float v3x, float v3y, float v3z, @ExtractionParam T res)
	{
		res.set(v1.getX() * v2.getX() + v3x, v1.getY() * v2.getY() + v3y, v1.getZ() * v2.getZ() + v3z);
		
		return res;
	}
	
	/**
	 * Multiplies the given vector {@code (v1)} with the given vector {@code (v2[0], v2[1], v2[2])}, adds the given vector {@code (v3)}
	 * to the product result and saves the result in the given result vector.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the arrays
	 * have to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 * (v2[0], v2[1], v2[2]) + v3}
	 * 
	 * @param <T> The type of the result vector.
	 * 
	 * @param v1 The first multiplicant vector.
	 * @param v2 The second multiplicant vector. Minimum legth: 3.
	 * @param v3 The addend vector.
	 * @param res The result vector.
	 * 
	 * @return The result vector with the result.
	 */
	public static <T extends Vec3fC> T mulAdd(Vec3fR v1, @MinLength(3) float[] v2, Vec3fR v3, @ExtractionParam T res)
	{
		res.set(v1.getX() * v2[0] + v3.getX(), v1.getY() * v2[1] + v3.getY(), v1.getZ() * v2[2] + v3.getZ());
		
		return res;
	}
	
	/**
	 * Multiplies the given vector {@code (v1)} with the given vector {@code (v2[0], v2[1], v2[2])}, adds the given vector {@code (v3[0], v3[1], v3[2])}
	 * to the product result and saves the result in the given result vector.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the arrays
	 * have to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 * (v2[0], v2[1], v2[2]) + (v3[0], v3[1], v3[2])}
	 * 
	 * @param <T> The type of the result vector.
	 * 
	 * @param v1 The first multiplicant vector.
	 * @param v2 The second multiplicant vector. Minimum legth: 3.
	 * @param v3 The addend vector. Minimum legth: 3.
	 * @param res The result vector.
	 * 
	 * @return The result vector with the result.
	 */
	public static <T extends Vec3fC> T mulAdd(Vec3fR v1, @MinLength(3) float[] v2, @MinLength(3) float[] v3, @ExtractionParam T res)
	{
		res.set(v1.getX() * v2[0] + v3[0], v1.getY() * v2[1] + v3[1], v1.getZ() * v2[2] + v3[2]);
		
		return res;
	}
	
	/**
	 * Multiplies the given vector {@code (v1)} with the given vector {@code (v2[0], v2[1], v2[2])}, adds the given vector {@code (v3x, v3y, v3z)}
	 * to the product result and saves the result in the given result vector.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the arrays
	 * have to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 * (v2[0], v2[1], v2[2]) + (v3x, v3y, v3z)}
	 * 
	 * @param <T> The type of the result vector.
	 * 
	 * @param v1 The first multiplicant vector.
	 * @param v2 The second multiplicant vector. Minimum legth: 3.
	 * @param v3x The value of the x component of the addend vector.
	 * @param v3y The value of the y component of the addend vector.
	 * @param v3z The value of the z component of the addend vector.
	 * @param res The result vector.
	 * 
	 * @return The result vector with the result.
	 */
	public static <T extends Vec3fC> T mulAdd(Vec3fR v1, @MinLength(3) float[] v2, float v3x, float v3y, float v3z, @ExtractionParam T res)
	{
		res.set(v1.getX() * v2[0] + v3x, v1.getY() * v2[1] + v3y, v1.getZ() * v2[2] + v3z);
		
		return res;
	}
	
	/**
	 * Multiplies the given vector {@code (v1)} with the given vector {@code (v2x, v2y, v2z)}, adds the given vector {@code (v3)}
	 * to the product result and saves the result in the given result vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 * (v2x, v2y, v2z) + v3}
	 * 
	 * @param <T> The type of the result vector.
	 * 
	 * @param v1 The first multiplicant vector.
	 * @param v2x The value of the x component of the second multiplicant vector.
	 * @param v2y The value of the y component of the second multiplicant vector.
	 * @param v2z The value of the z component of the second multiplicant vector.
	 * @param v3 The addend vector.
	 * @param res The result vector.
	 * 
	 * @return The result vector with the result.
	 */
	public static <T extends Vec3fC> T mulAdd(Vec3fR v1, float v2x, float v2y, float v2z, Vec3fR v3, @ExtractionParam T res)
	{
		res.set(v1.getX() * v2x + v3.getX(), v1.getY() * v2y + v3.getY(), v1.getZ() * v2z + v3.getZ());
		
		return res;
	}
	
	/**
	 * Multiplies the given vector {@code (v1)} with the given vector {@code (v2x, v2y, v2z)}, adds the given vector {@code (v3[0], v3[1], v3[2])}
	 * to the product result and saves the result in the given result vector.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the arrays
	 * have to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 * (v2x, v2y, v2z) + (v3[0], v3[1], v3[2])}
	 * 
	 * @param <T> The type of the result vector.
	 * 
	 * @param v1 The first multiplicant vector.
	 * @param v2x The value of the x component of the second multiplicant vector.
	 * @param v2y The value of the y component of the second multiplicant vector.
	 * @param v2z The value of the z component of the second multiplicant vector.
	 * @param v3 The addend vector. Minimum legth: 3.
	 * @param res The result vector.
	 * 
	 * @return The result vector with the result.
	 */
	public static <T extends Vec3fC> T mulAdd(Vec3fR v1, float v2x, float v2y, float v2z, @MinLength(3) float[] v3, @ExtractionParam T res)
	{
		res.set(v1.getX() * v2x + v3[0], v1.getY() * v2y + v3[1], v1.getZ() * v2z + v3[2]);
		
		return res;
	}
	
	/**
	 * Multiplies the given vector {@code (v1)} with the given vector {@code (v2x, v2y, v2z)}, adds the given vector {@code (v3x, v3y, v3z)}
	 * to the product result and saves the result in the given result vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 * (v2x, v2y, v2z) + (v3x, v3y, v3z)}
	 * 
	 * @param <T> The type of the result vector.
	 * 
	 * @param v1 The first multiplicant vector. Minimum legth: 3.
	 * @param v2x The value of the x component of the second multiplicant vector.
	 * @param v2y The value of the y component of the second multiplicant vector.
	 * @param v2z The value of the z component of the second multiplicant vector.
	 * @param v3x The value of the x component of the addend vector.
	 * @param v3y The value of the y component of the addend vector.
	 * @param v3z The value of the z component of the addend vector. 
	 * @param res The result vector.
	 * 
	 * @return The result vector with the result.
	 */
	public static <T extends Vec3fC> T mulAdd(Vec3fR v1, float v2x, float v2y, float v2z, float v3x, float v3y, float v3z, @ExtractionParam T res)
	{
		res.set(v1.getX() * v2x + v2x, v1.getY() * v2y + v2y, v1.getZ() * v2z + v2z);
		
		return res;
	}
	
	/**
	 * Multiplies the given vector {@code (v1[0], v1[1], v1[2])} with the given vector {@code (v2)}, adds the given vector {@code (v3)}
	 * to the product result and saves the result in the given result vector.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the arrays
	 * have to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1], v1[2]) * v2 + v3}
	 * 
	 * @param <T> The type of the result vector.
	 * 
	 * @param v1 The first multiplicant vector. Minimum legth: 3.
	 * @param v2 The second multiplicant vector.
	 * @param v3 The addend vector.
	 * @param res The result vector.
	 * 
	 * @return The result vector with the result.
	 */
	public static <T extends Vec3fC> T mulAdd(@MinLength(3) float[] v1, Vec3fR v2, Vec3fR v3, @ExtractionParam T res)
	{
		res.set(v1[0] * v2.getX() + v3.getX(), v1[1] * v2.getY() + v3.getY(), v1[2] * v2.getZ() + v3.getZ());
		
		return res;
	}
	
	/**
	 * Multiplies the given vector {@code (v1[0], v1[1], v1[2])} with the given vector {@code (v2)}, adds the given vector {@code (v3[0], v3[1], v3[2])}
	 * to the product result and saves the result in the given result vector.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the arrays
	 * have to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1], v1[2]) * v2 + (v3[0], v3[1], v3[2])}
	 * 
	 * @param <T> The type of the result vector.
	 * 
	 * @param v1 The first multiplicant vector. Minimum legth: 3.
	 * @param v2 The second multiplicant vector.
	 * @param v3 The addend vector. Minimum legth: 3.
	 * @param res The result vector
	 * 
	 * @return The result vector with the result.
	 */
	public static <T extends Vec3fC> T mulAdd(@MinLength(3) float[] v1, Vec3fR v2, @MinLength(3) float[] v3, @ExtractionParam T res)
	{
		res.set(v1[0] * v2.getX() + v3[0], v1[1] * v2.getY() + v3[1], v1[2] * v2.getZ() + v3[2]);
		
		return res;
	}
	
	/**
	 * Multiplies the given vector {@code (v1[0], v1[1], v1[2])} with the given vector {@code (v2)}, adds the given vector {@code (v3x, v3y, v3z)}
	 * to the product result and saves the result in the given result vector.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the arrays
	 * have to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1], v1[2]) * v2 + (v3x, v3y, v3z)}
	 * 
	 * @param <T> The type of the result vector.
	 * 
	 * @param v1 The first multiplicant vector. Minimum legth: 3.
	 * @param v2 The second multiplicant vector.
	 * @param v3x The value of the x component of the addend vector.
	 * @param v3y The value of the y component of the addend vector.
	 * @param v3z The value of the z component of the addend vector.
	 * @param res The result vector.
	 * 
	 * @return The result vector with the result.
	 */
	public static <T extends Vec3fC> T mulAdd(@MinLength(3) float[] v1, Vec3fR v2, float v3x, float v3y, float v3z, @ExtractionParam T res)
	{
		res.set(v1[0] * v2.getX() + v3x, v1[1] * v2.getY() + v3y, v1[2] * v2.getZ() + v3z);
		
		return res;
	}
	
	/**
	 * Multiplies the given vector {@code (v1[0], v1[1], v1[2])} with the given vector {@code (v2[0], v2[1], v2[2])}, adds the given vector {@code (v3)}
	 * to the product result and saves the result in the given result vector.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the arrays
	 * have to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1], v1[2]) * (v2[0], v2[1], v2[2]) + v3}
	 * 
	 * @param <T> The type of the result vector.
	 * 
	 * @param v1 The first multiplicant vector. Minimum legth: 3.
	 * @param v2 The second multiplicant vector. Minimum legth: 3.
	 * @param v3 The addend vector.
	 * @param res The result vector.
	 * 
	 * @return The result vector with the result.
	 */
	public static <T extends Vec3fC> T mulAdd(@MinLength(3) float[] v1, @MinLength(3) float[] v2, Vec3fR v3, @ExtractionParam T res)
	{
		res.set(v1[0] * v2[0] + v3.getX(), v1[1] * v2[1] + v3.getY(), v1[2] * v2[2] + v3.getZ());
		
		return res;
	}
	
	/**
	 * Multiplies the given vector {@code (v1[0], v1[1], v1[2])} with the given vector {@code (v2[0], v2[1], v2[2])}, adds the given vector {@code (v3[0], v3[1], v3[2])}
	 * to the product result and saves the result in the given result vector.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the arrays
	 * have to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1], v1[2]) * (v2[0], v2[1], v2[2]) + (v3[0], v3[1], v3[2])}
	 * 
	 * @param <T> The type of the result vector.
	 * 
	 * @param v1 The first multiplicant vector. Minimum legth: 3.
	 * @param v2 The second multiplicant vector. Minimum legth: 3.
	 * @param v3 The addend vector. Minimum legth: 3.
	 * @param res The result vector.
	 * 
	 * @return The result vector with the result.
	 */
	public static <T extends Vec3fC> T mulAdd(@MinLength(3) float[] v1, @MinLength(3) float[] v2, @MinLength(3) float[] v3, @ExtractionParam T res)
	{
		res.set(v1[0] * v2[0] + v3[0], v1[1] * v2[1] + v3[1], v1[2] * v2[2] + v3[2]);
		
		return res;
	}
	
	/**
	 * Multiplies the given vector {@code (v1[0], v1[1], v1[2])} with the given vector {@code (v2[0], v2[1], v2[2])}, adds the given vector {@code (v3x, v3y, v3z)}
	 * to the product result and saves the result in the given result vector.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the arrays
	 * have to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1], v1[2]) * (v2[0], v2[1], v2[2]) + (v3x, v3y, v3z)}
	 * 
	 * @param <T> The type of the result vector.
	 * 
	 * @param v1 The first multiplicant vector. Minimum legth: 3.
	 * @param v2 The second multiplicant vector. Minimum legth: 3.
	 * @param v3x The value of the x component of the addend vector.
	 * @param v3y The value of the y component of the addend vector.
	 * @param v3z The value of the z component of the addend vector.
	 * @param res The result vector.
	 * 
	 * @return The result vector with the result.
	 */
	public static <T extends Vec3fC> T mulAdd(@MinLength(3) float[] v1, @MinLength(3) float[] v2, float v3x, float v3y, float v3z, @ExtractionParam T res)
	{
		res.set(v1[0] * v2[0] + v3x, v1[1] * v2[1] + v3y, v1[2] * v2[2] + v3z);
		
		return res;
	}

	/**
	 * Multiplies the given vector {@code (v1[0], v1[1], v1[2])} with the given vector {@code (v2x, v2y, v2z)}, adds the given vector {@code (v3)}
	 * to the product result and saves the result in the given result vector.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the arrays
	 * have to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1], v1[2]) * (v2x, v2y, v2z) + v3}
	 * 
	 * @param <T> The type of the result vector.
	 * 
	 * @param v1 The first multiplicant vector. Minimum legth: 3.
	 * @param v2x The value of the x component of the second multiplicant vector.
	 * @param v2y The value of the y component of the second multiplicant vector.
	 * @param v2z The value of the z component of the second multiplicant vector.
	 * @param v3 The addend vector.
	 * @param res The result vector.
	 * 
	 * @return The result vector with the result.
	 */
	public static <T extends Vec3fC> T mulAdd(@MinLength(3) float[] v1, float v2x, float v2y, float v2z, Vec3fR v3, @ExtractionParam T res)
	{
		res.set(v1[0] * v2x + v3.getX(), v1[1] * v2y + v3.getY(), v1[2] * v2z + v3.getZ());
		
		return res;
	}
	
	/**
	 * Multiplies the given vector {@code (v1[0], v1[1], v1[2])} with the given vector {@code (v2x, v2y, v2z)}, adds the given vector {@code (v3[0], v3[1], v3[2])}
	 * to the product result and saves the result in the given result vector.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the arrays
	 * have to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1], v1[2]) * (v2x, v2y, v2z) + (v3[0], v3[1], v3[2])}
	 * 
	 * @param <T> The type of the result vector.
	 * 
	 * @param v1 The first multiplicant vector. Minimum legth: 3.
	 * @param v2x The value of the x component of the second multiplicant vector.
	 * @param v2y The value of the y component of the second multiplicant vector.
	 * @param v2z The value of the z component of the second multiplicant vector.
	 * @param v3 The addend vector. Minimum legth: 3.
	 * @param res The result vector.
	 * 
	 * @return The result vector with the result.
	 */
	public static <T extends Vec3fC> T mulAdd(@MinLength(3) float[] v1, float v2x, float v2y, float v2z, @MinLength(3) float[] v3, @ExtractionParam T res)
	{
		res.set(v1[0] * v2x + v3[0], v1[1] * v2y + v3[1], v1[2] * v2z + v3[2]);
		
		return res;
	}
	
	/**
	 * Multiplies the given vector {@code (v1[0], v1[1], v1[2])} with the given vector {@code (v2x, v2y, v2z)}, adds the given vector {@code (v3x, v3y, v3z)}
	 * to the product result and saves the result in the given result vector.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the arrays
	 * have to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1], v1[2]) * (v2x, v2y, v2z) + (v3x, v3y, v3z)}
	 * 
	 * @param <T> The type of the result vector.
	 * 
	 * @param v1 The first multiplicant vector. Minimum legth: 3.
	 * @param v2x The value of the x component of the second multiplicant vector.
	 * @param v2y The value of the y component of the second multiplicant vector.
	 * @param v2z The value of the z component of the second multiplicant vector.
	 * @param v3x The value of the x component of the addend vector.
	 * @param v3y The value of the y component of the addend vector.
	 * @param v3z The value of the z component of the addend vector. 
	 * @param res The result vector.
	 * 
	 * @return The result vector with the result.
	 */
	public static <T extends Vec3fC> T mulAdd(@MinLength(3) float[] v1, float v2x, float v2y, float v2z, float v3x, float v3y, float v3z, @ExtractionParam T res)
	{
		res.set(v1[0] * v2x + v2x, v1[1] * v2y + v2y, v1[2] * v2z + v2z);
		
		return res;
	}
	
	/**
	 * Multiplies the given vector {@code (v1x, v1y, v1z)} with the given vector {@code (v2)}, adds the given vector {@code (v3)}
	 * to the product result and saves the result in the given result vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y, v1z) * v2 + v3}
	 * 
	 * @param <T> The type of the result vector.
	 * 
	 * @param v1x The value of the x component of the first multiplicant vector.
	 * @param v1y The value of the y component of the first multiplicant vector.
	 * @param v1z The value of the z component of the first multiplicant vector.
	 * @param v2 The second multiplicant vector.
	 * @param v3 The addend vector.
	 * @param res The result vector.
	 * 
	 * @return The result vector with the result.
	 */
	public static <T extends Vec3fC> T mulAdd(float v1x, float v1y, float v1z, Vec3fR v2, Vec3fR v3, @ExtractionParam T res)
	{
		res.set(v1x * v2.getX() + v3.getX(), v1y * v2.getY() + v3.getY(), v1z * v2.getZ() + v3.getZ());
		
		return res;
	}
	
	/**
	 * Multiplies the given vector {@code (v1x, v1y, v1z)} with the given vector {@code (v2)}, adds the given vector {@code (v3[0], v3[1], v3[2])}
	 * to the product result and saves the result in the given result vector.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the arrays
	 * have to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y, v1z) * v2 + (v3[0], v3[1], v3[2])}
	 * 
	 * @param <T> The type of the result vector.
	 * 
	 * @param v1x The value of the x component of the first multiplicant vector.
	 * @param v1y The value of the y component of the first multiplicant vector.
	 * @param v1z The value of the z component of the first multiplicant vector.
	 * @param v2 The second multiplicant vector.
	 * @param v3 The addend vector. Minimum legth: 3.
	 * @param res The result vector.
	 * 
	 * @return The result vector with the result.
	 */
	public static <T extends Vec3fC> T mulAdd(float v1x, float v1y, float v1z, Vec3fR v2, @MinLength(3) float[] v3, @ExtractionParam T res)
	{
		res.set(v1x * v2.getX() + v3[0], v1y * v2.getY() + v3[1], v1z * v2.getZ() + v3[2]);
		
		return res;
	}
	
	/**
	 * Multiplies the given vector {@code (v1x, v1y, v1z)} with the given vector {@code (v2)}, adds the given vector {@code (v3x, v3y, v3z)}
	 * to the product result and saves the result in the given result vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y, v1z) * v2 + (v3x, v3y, v3z)}
	 * 
	 * @param <T> The type of the result vector.
	 * 
	 * @param v1x The value of the x component of the first multiplicant vector.
	 * @param v1y The value of the y component of the first multiplicant vector.
	 * @param v1z The value of the z component of the first multiplicant vector.
	 * @param v2 The second multiplicant vector.
	 * @param v3x The value of the x component of the addend vector.
	 * @param v3y The value of the y component of the addend vector.
	 * @param v3z The value of the z component of the addend vector.
	 * @param res The result vector.
	 * 
	 * @return The result vector with the result.
	 */
	public static <T extends Vec3fC> T mulAdd(float v1x, float v1y, float v1z, Vec3fR v2, float v3x, float v3y, float v3z, @ExtractionParam T res)
	{
		res.set(v1x * v2.getX() + v3x, v1y * v2.getY() + v3y, v1z * v2.getZ() + v3z);
		
		return res;
	}
	
	/**
	 * Multiplies the given vector {@code (v1x, v1y, v1z)} with the given vector {@code (v2[0], v2[1], v2[2])}, adds the given vector {@code (v3)}
	 * to the product result and saves the result in the given result vector.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the arrays
	 * have to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y, v1z) * (v2[0], v2[1], v2[2]) + v3}
	 * 
	 * @param <T> The type of the result vector.
	 * 
	 * @param v1x The value of the x component of the first multiplicant vector.
	 * @param v1y The value of the y component of the first multiplicant vector.
	 * @param v1z The value of the z component of the first multiplicant vector.
	 * @param v2 The second multiplicant vector. Minimum legth: 3.
	 * @param v3 The addend vector.
	 * @param res The result vector.
	 * 
	 * @return The result vector with the result.
	 */
	public static <T extends Vec3fC> T mulAdd(float v1x, float v1y, float v1z, @MinLength(3) float[] v2, Vec3fR v3, @ExtractionParam T res)
	{
		res.set(v1x * v2[0] + v3.getX(), v1y * v2[1] + v3.getY(), v1z * v2[2] + v3.getZ());
		
		return res;
	}
	
	/**
	 * Multiplies the given vector {@code (v1x, v1y, v1z)} with the given vector {@code (v2[0], v2[1], v2[2])}, adds the given vector {@code (v3[0], v3[1], v3[2])}
	 * to the product result and saves the result in the given result vector.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the arrays
	 * have to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y, v1z) * (v2[0], v2[1], v2[2]) + (v3[0], v3[1], v3[2])}
	 * 
	 * @param <T> The type of the result vector.
	 * 
	 * @param v1x The value of the x component of the first multiplicant vector.
	 * @param v1y The value of the y component of the first multiplicant vector.
	 * @param v1z The value of the z component of the first multiplicant vector.
	 * @param v2 The second multiplicant vector. Minimum legth: 3.
	 * @param v3 The addend vector. Minimum legth: 3.
	 * @param res The result vector.
	 * 
	 * @return The result vector with the result.
	 */
	public static <T extends Vec3fC> T mulAdd(float v1x, float v1y, float v1z, @MinLength(3) float[] v2, @MinLength(3) float[] v3, @ExtractionParam T res)
	{
		res.set(v1x * v2[0] + v3[0], v1y * v2[1] + v3[1], v1z * v2[2] + v3[2]);
		
		return res;
	}
	
	/**
	 * Multiplies the given vector {@code (v1x, v1y, v1z)} with the given vector {@code (v2[0], v2[1], v2[2])}, adds the given vector {@code (v3x, v3y, v3z)}
	 * to the product result and saves the result in the given result vector.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the arrays
	 * have to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y, v1z) * (v2[0], v2[1], v2[2]) + (v3x, v3y, v3z)}
	 * 
	 * @param <T> The type of the result vector.
	 * 
	 * @param v1x The value of the x component of the first multiplicant vector.
	 * @param v1y The value of the y component of the first multiplicant vector.
	 * @param v1z The value of the z component of the first multiplicant vector.
	 * @param v2 The second multiplicant vector. Minimum legth: 3.
	 * @param v3x The value of the x component of the addend vector.
	 * @param v3y The value of the y component of the addend vector.
	 * @param v3z The value of the z component of the addend vector.
	 * @param res The result vector.
	 * 
	 * @return The result vector with the result.
	 */
	public static <T extends Vec3fC> T mulAdd(float v1x, float v1y, float v1z, @MinLength(3) float[] v2, float v3x, float v3y, float v3z, @ExtractionParam T res)
	{
		res.set(v1x * v2[0] + v3x, v1y * v2[1] + v3y, v1z * v2[2] + v3z);
		
		return res;
	}
	
	/**
	 * Multiplies the given vector {@code (v1x, v1y, v1z)} with the given vector {@code (v2x, v2y, v2z)}, adds the given vector {@code (v3)}
	 * to the product result and saves the result in the given result vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y, v1z) * (v2x, v2y, v2z) + v3}
	 * 
	 * @param <T> The type of the result vector.
	 * 
	 * @param v1x The value of the x component of the first multiplicant vector.
	 * @param v1y The value of the y component of the first multiplicant vector.
	 * @param v1z The value of the z component of the first multiplicant vector.
	 * @param v2x The value of the x component of the second multiplicant vector.
	 * @param v2y The value of the y component of the second multiplicant vector.
	 * @param v2z The value of the z component of the second multiplicant vector.
	 * @param v3 The addend vector.
	 * @param res The result vector.
	 * 
	 * @return The result vector with the result.
	 */
	public static <T extends Vec3fC> T mulAdd(float v1x, float v1y, float v1z, float v2x, float v2y, float v2z, Vec3fR v3, @ExtractionParam T res)
	{
		res.set(v1x * v2x + v3.getX(), v1y * v2y + v3.getY(), v1z * v2z + v3.getZ());
		
		return res;
	}
	
	/**
	 * Multiplies the given vector {@code (v1x, v1y, v1z)} with the given vector {@code (v2x, v2y, v2z)}, adds the given vector {@code (v3[0], v3[1], v3[2])}
	 * to the product result and saves the result in the given result vector.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the arrays
	 * have to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y, v1z) * (v2x, v2y, v2z) + (v3[0], v3[1], v3[2])}
	 * 
	 * @param <T> The type of the result vector.
	 * 
	 * @param v1x The value of the x component of the first multiplicant vector.
	 * @param v1y The value of the y component of the first multiplicant vector.
	 * @param v1z The value of the z component of the first multiplicant vector.
	 * @param v2x The value of the x component of the second multiplicant vector.
	 * @param v2y The value of the y component of the second multiplicant vector.
	 * @param v2z The value of the z component of the second multiplicant vector.
	 * @param v3 The addend vector. Minimum legth: 3.
	 * @param res The result vector.
	 * 
	 * @return The result vector with the result.
	 */
	public static <T extends Vec3fC> T mulAdd(float v1x, float v1y, float v1z, float v2x, float v2y, float v2z, @MinLength(3) float[] v3, @ExtractionParam T res)
	{
		res.set(v1x * v2x + v3[0], v1y * v2y + v3[1], v1z * v2z + v3[2]);
		
		return res;
	}
	
	/**
	 * Multiplies the given vector {@code (v1x, v1y, v1z)} with the given vector {@code (v2x, v2y, v2z)}, adds the given vector {@code (v3x, v3y, v3z)}
	 * to the product result and saves the result in the given result vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y, v1z) * (v2x, v2y, v2z) + (v3x, v3y, v3z)}
	 * 
	 * @param <T> The type of the result vector.
	 * 
	 * @param v1x The value of the x component of the first multiplicant vector.
	 * @param v1y The value of the y component of the first multiplicant vector.
	 * @param v1z The value of the z component of the first multiplicant vector.
	 * @param v2x The value of the x component of the second multiplicant vector.
	 * @param v2y The value of the y component of the second multiplicant vector.
	 * @param v2z The value of the z component of the second multiplicant vector.
	 * @param v3x The value of the x component of the addend vector.
	 * @param v3y The value of the y component of the addend vector.
	 * @param v3z The value of the z component of the addend vector.
	 * @param res The result vector.
	 * 
	 * @return The result vector with the result.
	 */
	public static <T extends Vec3fC> T mulAdd(float v1x, float v1y, float v1z, float v2x, float v2y, float v2z, float v3x, float v3y, float v3z, @ExtractionParam T res)
	{
		res.set(v1x * v2x + v3x, v1y * v2y + v3y, v1z * v2z + v3z);
		
		return res;
	}
	
	/**
	 * Returns the inverse (reciprocal) length (magnitude, norm) of the given vector {@code (v)}.
	 * If the vector is a zero-vector {@code (x=y=z=0)} this will throw an {@link ArithmeticException}
	 * as this would result in a division by zero.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code 1 / |v|}
	 * 
	 * @param v The vector.
	 * 
	 * @return The inverse length of the vector.
	 */
	public static float inverseLength(Vec3fR v)
	{
		float x = v.getX();
		float y = v.getY();
		float z = v.getZ();
		
		return BarghosMath.invSqrt(x * x + y * y + z * z);
	}
	
	/**
	 * Returns the inverse (reciprocal) length (magnitude, norm) of the given vector {@code (v[0], v[1], v[2])}.
	 * If the vector is a zero-vector {@code (x=y=z=0)} this will throw an {@link ArithmeticException}
	 * as this would result in a division by zero.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code 1 / |(v[0], v[1], v[2])|}
	 * 
	 * @param v The vector. Minimum legth: 3.
	 * 
	 * @return The inverse length of the vector.
	 */
	public static float inverseLength(@MinLength(3) float[] v)
	{
		return BarghosMath.invSqrt(v[0] * v[0] + v[1] * v[1] + v[2] * v[2]);
	}
	
	/**
	 * Returns the inverse (reciprocal) length (magnitude, norm) of the given vector {@code (x, y, z)}.
	 * If the vector is a zero-vector {@code (x=y=z=0)} this will throw an {@link ArithmeticException}
	 * as this would result in a division by zero.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code 1 / |(x, y, z)|}
	 * 
	 * @param x The value of the x component of the vector.
	 * @param y The value of the y component of the vector.
	 * @param z The value of the z component of the vector.
	 * 
	 * @return The inverse length of the vector.
	 */
	public static float inverseLength(float x, float y, float z)
	{
		return BarghosMath.invSqrt(x * x + y * y + z * z);
	}
	
	/**
	 * Returns the inverse (reciprocal) distance between the given vector {@code (v1)}
	 * and the given vector {@code (v2)}.
	 * If the two vectors are the same this will throw an {@link ArithmeticException}
	 * as this would result in a division by zero.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code 1 / |v2 - v1|}
	 * 
	 * @param v1 The first vector.
	 * @param v2 The second vector.
	 * 
	 * @return The inverse distance between the two vectors.
	 */
	public static float inverseDistance(Vec3fR v1, Vec3fR v2)
	{
		float x = v2.getX() - v1.getX();
		float y = v2.getY() - v1.getY();
		float z = v2.getZ() - v1.getZ();
		
		return BarghosMath.invSqrt(x * x + y * y + z * z);
	}
	
	/**
	 * Returns the inverse (reciprocal) distance between the given vector {@code (v1)}
	 * and the given vector {@code (v2[0], v2[1], v2[2])}.
	 * If the two vectors are the same this will throw an {@link ArithmeticException}
	 * as this would result in a division by zero.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code 1 / |(v2[0], v2[1], v2[2]) - v1|}
	 * 
	 * @param v1 The first vector.
	 * @param v2 The second vector. Minimum legth: 3.
	 * 
	 * @return The inverse distance between the two vectors.
	 */
	public static float inverseDistance(Vec3fR v1, @MinLength(3) float[] v2)
	{
		float x = v2[0] - v1.getX();
		float y = v2[1] - v1.getY();
		float z = v2[2] - v1.getZ();
		
		return BarghosMath.invSqrt(x * x + y * y + z * z);
	}
	
	/**
	 * Returns the inverse (reciprocal) distance between the given vector {@code (v1)}
	 * and the given vector {@code (v2x, v2y, v2z)}.
	 * If the two vectors are the same this will throw an {@link ArithmeticException}
	 * as this would result in a division by zero.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code 1 / |(v2x, v2y, v2z) - v1|}
	 * 
	 * @param v1 The first vector.
	 * @param v2x The value of the x component of the second vector.
	 * @param v2y The value of the y component of the second vector.
	 * @param v2z The value of the z component of the second vector.
	 * 
	 * @return The inverse distance between the two vectors.
	 */
	public static float inverseDistance(Vec3fR v1, float v2x, float v2y, float v2z)
	{
		float x = v2x - v1.getX();
		float y = v2y - v1.getY();
		float z = v2z - v1.getZ();
		
		return BarghosMath.invSqrt(x * x + y * y + z * z);
	}
	
	/**
	 * Returns the inverse (reciprocal) distance between the given vector {@code (v1[0], v1[1], v1[2])}
	 * and the given vector {@code (v2)}.
	 * If the two vectors are the same this will throw an {@link ArithmeticException}
	 * as this would result in a division by zero.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code 1 / |v2 - (v1[0], v1[1], v1[2])|}
	 * 
	 * @param v1 The first vector. Minimum legth: 3.
	 * @param v2 The second vector.
	 * 
	 * @return The inverse distance between the two vectors.
	 */
	public static float inverseDistance(@MinLength(3) float[] v1, Vec3fR v2)
	{
		float x = v2.getX() - v1[0];
		float y = v2.getY() - v1[1];
		float z = v2.getZ() - v1[2];
		
		return BarghosMath.invSqrt(x * x + y * y + z * z);
	}
	
	/**
	 * Returns the inverse (reciprocal) distance between the given vector {@code (v1[0], v1[1], v1[2])}
	 * and the given vector {@code (v2[0], v2[1], v2[2])}.
	 * If the two vectors are the same this will throw an {@link ArithmeticException}
	 * as this would result in a division by zero.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code 1 / |(v2[0], v2[1], v2[2]) - (v1[0], v1[1], v1[2])|}
	 * 
	 * @param v1 The first vector. Minimum legth: 3.
	 * @param v2 The second vector. Minimum legth: 3.
	 * 
	 * @return The inverse distance between the two vectors.
	 */
	public static float inverseDistance(@MinLength(3) float[] v1, @MinLength(3) float[] v2)
	{
		float x = v2[0] - v1[0];
		float y = v2[1] - v1[1];
		float z = v2[2] - v1[2];
		
		return BarghosMath.invSqrt(x * x + y * y + z * z);
	}
	
	/**
	 * Returns the inverse (reciprocal) distance between the given vector {@code (v1[0], v1[1], v1[2])}
	 * and the given vector {@code (v2x, v2y, v2z)}.
	 * If the two vectors are the same this will throw an {@link ArithmeticException}
	 * as this would result in a division by zero.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code 1 / |(v2x, v2y, v2z) - (v1[0], v1[1], v1[2])|}
	 * 
	 * @param v1 The first vector. Minimum legth: 3.
	 * @param v2x The value of the x component of the second vector.
	 * @param v2y The value of the y component of the second vector.
	 * @param v2z The value of the z component of the second vector.
	 * 
	 * @return The inverse distance between the two vectors.
	 */
	public static float inverseDistance(@MinLength(3) float[] v1, float v2x, float v2y, float v2z)
	{
		float x = v2x - v1[0];
		float y = v2y - v1[1];
		float z = v2z - v1[2];
		
		return BarghosMath.invSqrt(x * x + y * y + z * z);
	}
	
	/**
	 * Returns the inverse (reciprocal) distance between the given vector {@code (v1x, v1y, v1z)}
	 * and the given vector {@code (v2)}.
	 * If the two vectors are the same this will throw an {@link ArithmeticException}
	 * as this would result in a division by zero.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code 1 / |v2 - (v1x, v1y, v1z)|}
	 * 
	 * @param v1x The value of the x component of the first vector.
	 * @param v1y The value of the y component of the first vector.
	 * @param v1z The value of the z component of the first vector.
	 * @param v2 The second vector.
	 * 
	 * @return The inverse distance between the two vectors.
	 */
	public static float inverseDistance(float v1x, float v1y, float v1z, Vec3fR v2)
	{
		float x = v2.getX() - v1x;
		float y = v2.getY() - v1y;
		float z = v2.getZ() - v1z;
		
		return BarghosMath.invSqrt(x * x + y * y + z * z);
	}
	
	/**
	 * Returns the inverse (reciprocal) distance between the given vector {@code (v1x, v1y, v1z)}
	 * and the given vector {@code (v2[0], v2[1], v2[2])}.
	 * If the two vectors are the same this will throw an {@link ArithmeticException}
	 * as this would result in a division by zero.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code 1 / |(v2[0], v2[1], v2[2]) - (v1x, v1y, v1z)|}
	 * 
	 * @param v1x The value of the x component of the first vector.
	 * @param v1y The value of the y component of the first vector.
	 * @param v1z The value of the z component of the first vector.
	 * @param v2 The second vector. Minimum legth: 3.
	 * 
	 * @return The inverse distance between the two vectors.
	 */
	public static float inverseDistance(float v1x, float v1y, float v1z, @MinLength(3) float[] v2)
	{
		float x = v2[0] - v1x;
		float y = v2[1] - v1y;
		float z = v2[2] - v1z;
		
		return BarghosMath.invSqrt(x * x + y * y + z * z);
	}
	
	/**
	 * Returns the inverse (reciprocal) distance between the given vector {@code (v1x, v1y, v1z)}
	 * and the given vector {@code (v2x, v2y, v2z)}.
	 * If the two vectors are the same this will throw an {@link ArithmeticException}
	 * as this would result in a division by zero.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code 1 / |(v2x, v2y, v2z) - (v1x, v1y, v1z)|}
	 * 
	 * @param v1x The value of the x component of the first vector.
	 * @param v1y The value of the y component of the first vector.
	 * @param v1z The value of the z component of the first vector.
	 * @param v2x The value of the x component of the second vector.
	 * @param v2y The value of the y component of the second vector.
	 * @param v2z The value of the z component of the second vector.
	 * 
	 * @return The inverse distance between the two vectors.
	 */
	public static float inverseDistance(float v1x, float v1y, float v1z, float v2x, float v2y, float v2z)
	{
		float x = v2x - v1x;
		float y = v2y - v1y;
		float z = v2z - v1z;
		
		return BarghosMath.invSqrt(x * x + y * y + z * z);
	}
	
	/**
	 * Returns the length (magnitude, norm) of the vector {@code (v)}.
	 * If the vector is a zero-vector {@code (x=y=z=0)} this will throw an {@link ArithmeticException}
	 * as this would result in a division by zero.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |v|}
	 * 
	 * @param v The vector.
	 * 
	 * @return The length of the vector.
	 */
	public static float lengthUnsafe(Vec3fR v)
	{
		float x = v.getX();
		float y = v.getY();
		float z = v.getZ();
		
		return BarghosMath.sqrt(x * x + y * y + z * z);
	}
	
	/**
	 * Returns the length (magnitude, norm) of the vector {@code (v[0], v[1], v[2])}.
	 * If the vector is a zero-vector {@code (x=y=z=0)} this will throw an {@link ArithmeticException}
	 * as this would result in a division by zero.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(v[0], v[1], v[2])|}
	 * 
	 * @param v The vector. Minimum legth: 3.
	 * 
	 * @return The length of the vector.
	 */
	public static float lengthUnsafe(@MinLength(3) float[] v)
	{
		return BarghosMath.sqrt(v[0] * v[0] + v[1] * v[1] + v[2] * v[2]);
	}
	
	/**
	 * Returns the length (magnitude, norm) of the vector {@code (x, y, z)}.
	 * If the vector is a zero-vector {@code (x=y=z=0)} this will throw an {@link ArithmeticException}
	 * as this would result in a division by zero.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(x, y, z)|}
	 * 
	 * @param x The value of the x component of the vector.
	 * @param y The value of the y component of the vector.
	 * @param z The value of the z component of the vector.
	 * 
	 * @return The length of the vector.
	 */
	public static float lengthUnsafe(float x, float y, float z)
	{
		return BarghosMath.sqrt(x * x + y * y + z * z);
	}
	
	/**
	 * Returns the distance between the given vector {@code (v1)} and the given vector {@code (v2)}.
	 * If the vector is a zero-vector {@code (x=y=z=0)} this will throw an {@link ArithmeticException}
	 * as this would result in a division by zero.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |v2 - v1|}
	 * 
	 * @param v1 The first vector.
	 * @param v2 The second vector.
	 * 
	 * @return The distance between the two vectors.
	 */
	public static float distanceUnsafe(Vec3fR v1, Vec3fR v2)
	{
		float x = v2.getX() - v1.getX();
		float y = v2.getY() - v1.getY();
		float z = v2.getZ() - v1.getZ();
		
		return BarghosMath.sqrt(x * x + y * y + z * z);
	}
	
	/**
	 * Returns the distance between the given vector {@code (v1)} and the given vector {@code (v2[0], v2[1], v2[2])}.
	 * If the vector is a zero-vector {@code (x=y=z=0)} this will throw an {@link ArithmeticException}
	 * as this would result in a division by zero.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(v2[0], v2[1], v2[2]) - v1|}
	 * 
	 * @param v1 The first vector.
	 * @param v2 The second vector. Minimum legth: 3.
	 * 
	 * @return The distance between the two vectors.
	 */
	public static float distanceUnsafe(Vec3fR v1, @MinLength(3) float[] v2)
	{
		float x = v2[0] - v1.getX();
		float y = v2[1] - v1.getY();
		float z = v2[2] - v1.getZ();
		
		return BarghosMath.sqrt(x * x + y * y + z * z);
	}
	
	/**
	 * Returns the distance between the given vector {@code (v1)} and the given vector {@code (v2x, v2y, v2z)}.
	 * If the vector is a zero-vector {@code (x=y=z=0)} this will throw an {@link ArithmeticException}
	 * as this would result in a division by zero.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(v2x, v2y, v2z) - v1|}
	 * 
	 * @param v1 The first vector.
	 * @param v2x The value of the x component of the second vector.
	 * @param v2y The value of the y component of the second vector.
	 * @param v2z The value of the z component of the second vector.
	 * 
	 * @return The distance between the two vectors.
	 */
	public static float distanceUnsafe(Vec3fR v1, float v2x, float v2y, float v2z)
	{
		float x = v2x - v1.getX();
		float y = v2y - v1.getY();
		float z = v2z - v1.getZ();
		
		return BarghosMath.sqrt(x * x + y * y + z * z);
	}
	
	/**
	 * Returns the distance between the given vector {@code (v1[0], v1[1], v1[2])} and the given vector {@code (v2)}.
	 * If the vector is a zero-vector {@code (x=y=z=0)} this will throw an {@link ArithmeticException}
	 * as this would result in a division by zero.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |v2 - (v1[0], v1[1], v1[2])|}
	 * 
	 * @param v1 The first vector. Minimum legth: 3.
	 * @param v2 The second vector.
	 * 
	 * @return The distance between the two vectors.
	 */
	public static float distanceUnsafe(@MinLength(3) float[] v1, Vec3fR v2)
	{
		float x = v2.getX() - v1[0];
		float y = v2.getY() - v1[1];
		float z = v2.getZ() - v1[2];
		
		return BarghosMath.sqrt(x * x + y * y + z * z);
	}
	
	/**
	 * Returns the distance between the given vector {@code (v1[0], v1[1], v1[2])} and the given vector {@code (v2[0], v2[1], v2[2])}.
	 * If the vector is a zero-vector {@code (x=y=z=0)} this will throw an {@link ArithmeticException}
	 * as this would result in a division by zero.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(v2[0], v2[1], v2[2]) - (v1[0], v1[1], v1[2])|}
	 * 
	 * @param v1 The first vector. Minimum legth: 3.
	 * @param v2 The second vector. Minimum legth: 3.
	 * 
	 * @return The distance between the two vectors.
	 */
	public static float distanceUnsafe(@MinLength(3) float[] v1, @MinLength(3) float[] v2)
	{
		float x = v2[0] - v1[0];
		float y = v2[1] - v1[1];
		float z = v2[2] - v1[2];
		
		return BarghosMath.sqrt(x * x + y * y + z * z);
	}
	
	/**
	 * Returns the distance between the given vector {@code (v1[0], v1[1], v1[2])} and the given vector {@code (v2x, v2y, v2z)}.
	 * If the vector is a zero-vector {@code (x=y=z=0)} this will throw an {@link ArithmeticException}
	 * as this would result in a division by zero.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(v2x, v2y, v2z) - (v1[0], v1[1], v1[2])|}
	 * 
	 * @param v1 The first vector. Minimum legth: 3.
	 * @param v2x The value of the x component of the second vector.
	 * @param v2y The value of the y component of the second vector.
	 * @param v2z The value of the z component of the second vector.
	 * 
	 * @return The distance between the two vectors.
	 */
	public static float distanceUnsafe(@MinLength(3) float[] v1, float v2x, float v2y, float v2z)
	{
		float x = v2x - v1[0];
		float y = v2y - v1[1];
		float z = v2z - v1[2];
		
		return BarghosMath.sqrt(x * x + y * y + z * z);
	}
	
	/**
	 * Returns the distance between the given vector {@code (v1[0], v1[1], v1[2])} and the given vector {@code (v2)}.
	 * If the vector is a zero-vector {@code (x=y=z=0)} this will throw an {@link ArithmeticException}
	 * as this would result in a division by zero.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |v2 - (v1x, v1y, v1z)|}
	 * 
	 * @param v1x The value of the x component of the first vector.
	 * @param v1y The value of the y component of the first vector.
	 * @param v1z The value of the z component of the first vector.
	 * @param v2 The second vector.
	 * 
	 * @return The distance between the two vectors.
	 */
	public static float distanceUnsafe(float v1x, float v1y, float v1z, Vec3fR v2)
	{
		float x = v2.getX() - v1x;
		float y = v2.getY() - v1y;
		float z = v2.getZ() - v1z;
		
		return BarghosMath.sqrt(x * x + y * y + z * z);
	}
	
	/**
	 * Returns the distance between the given vector {@code (v1[0], v1[1], v1[2])} and the given vector {@code (v2[0], v2[1], v2[2])}.
	 * If the vector is a zero-vector {@code (x=y=z=0)} this will throw an {@link ArithmeticException}
	 * as this would result in a division by zero.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(v2[0], v2[1], v2[2]) - (v1x, v1y, v1z)|}
	 * 
	 * @param v1x The value of the x component of the first vector.
	 * @param v1y The value of the y component of the first vector.
	 * @param v1z The value of the z component of the first vector.
	 * @param v2 The second vector. Minimum legth: 3.
	 * 
	 * @return The distance between the two vectors.
	 */
	public static float distanceUnsafe(float v1x, float v1y, float v1z, @MinLength(3) float[] v2)
	{
		float x = v2[0] - v1x;
		float y = v2[1] - v1y;
		float z = v2[2] - v1z;
		
		return BarghosMath.sqrt(x * x + y * y + z * z);
	}
	
	/**
	 * Returns the distance between the given vector {@code (v1x, v1y, v1z)} and the given vector {@code (v2x, v2y, v2z)}.
	 * If the vector is a zero-vector {@code (x=y=z=0)} this will throw an {@link ArithmeticException}
	 * as this would result in a division by zero.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(v2x, v2y, v2z) - (v1x, v1y, v1z)|}
	 * 
	 * @param v1x The value of the x component of the first vector.
	 * @param v1y The value of the y component of the first vector.
	 * @param v1z The value of the z component of the first vector.
	 * @param v2x The value of the x component of the second vector.
	 * @param v2y The value of the y component of the second vector.
	 * @param v2z The value of the z component of the second vector.
	 * 
	 * @return The distance between the two vectors.
	 */
	public static float distanceUnsafe(float v1x, float v1y, float v1z, float v2x, float v2y, float v2z)
	{
		float x = v2x - v1x;
		float y = v2y - v1y;
		float z = v2z - v1z;
		
		return BarghosMath.sqrt(x * x + y * y + z * z);
	}
	
	/**
	 * Returns the length (magnitude, norm) of the vector {@code (v)}.
	 * If the vector is a zero-vector {@code (x=y=z=0)} the result will be zero.
	 * It determines a length of zero by checking if all components are exactly zero.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |v|}
	 * 
	 * @param v The vector.
	 * 
	 * @return The length of the vector or zero if it is a zero-vector.
	 */
	public static float length(Vec3fR v)
	{
		float x = v.getX();
		float y = v.getY();
		float z = v.getZ();
		
		if(	x == 0.0f &&
			y == 0.0f &&
			z == 0.0f) return 0.0f;

		return BarghosMath.sqrt(x * x + y * y + z * z);
	}
	
	/**
	 * Returns the length (magnitude, norm) of the vector {@code (v[0], v[1], v[2])}.
	 * If the vector is a zero-vector {@code (x=y=z=0)} the result will be zero.
	 * It determines a length of zero by checking if all components are exactly zero.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(v[0], v[1], v[2])|}
	 * 
	 * @param v The vector. Minimum legth: 3.
	 * 
	 * @return The length of the vector or zero if it is a zero-vector.
	 */
	public static float length(@MinLength(3) float[] v)
	{
		if(	v[0] == 0.0f &&
			v[1] == 0.0f &&
			v[2] == 0.0f) return 0.0f;

		return BarghosMath.sqrt(v[0] * v[0] + v[1] * v[1] + v[2] * v[2]);
	}
	
	/**
	 * Returns the length (magnitude, norm) of the vector {@code (x, y, z)}.
	 * If the vector is a zero-vector {@code (x=y=z=0)} the result will be zero.
	 * It determines a length of zero by checking if all components are exactly zero.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(x, y, z)|}
	 * 
	 * @param x The value of the x component of the vector.
	 * @param y The value of the y component of the vector.
	 * @param z The value of the z component of the vector.
	 * 
	 * @return The length of the vector or zero if it is a zero-vector.
	 */
	public static float length(float x, float y, float z)
	{
		if(	x == 0.0f &&
			y == 0.0f &&
			z == 0.0f) return 0.0f;

		return BarghosMath.sqrt(x * x + y * y + z * z);
	}
	
	/**
	 * Returns the distance between the given vector {@code (v1)} and the given vector {@code (v2)}.
	 * If the vectors are equal the result will be zero.
	 * It determines an equality by checking if all components are exactly the same.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |v2 - v1|}
	 * 
	 * @param v1 The first vector.
	 * @param v2 The second vector.
	 * 
	 * @return The distance between the vectors or zero if the two vectors are equal.
	 */
	public static float distance(Vec3fR v1, Vec3fR v2)
	{
		float x = v2.getX() - v1.getX();
		float y = v2.getY() - v1.getY();
		float z = v2.getZ() - v1.getZ();
		
		if(	x == 0.0f &&
			y == 0.0f &&
			z == 0.0f) return 0.0f;

		return BarghosMath.sqrt(x * x + y * y + z * z);
	}
	
	/**
	 * Returns the distance between the given vector {@code (v1)} and the given vector {@code (v2[0], v2[1], v2[2])}.
	 * If the vectors are equal the result will be zero.
	 * It determines an equality by checking if all components are exactly the same.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(v2[0], v2[1], v2[2]) - v1|}
	 * 
	 * @param v1 The first vector.
	 * @param v2 The second vector. Minimum legth: 3.
	 * 
	 * @return The distance between the vectors or zero if the two vectors are equal.
	 */
	public static float distance(Vec3fR v1, @MinLength(3) float[] v2)
	{
		float x = v2[0] - v1.getX();
		float y = v2[1] - v1.getY();
		float z = v2[2] - v1.getZ();
		
		if(	x == 0.0f &&
			y == 0.0f &&
			z == 0.0f) return 0.0f;

		return BarghosMath.sqrt(x * x + y * y + z * z);
	}
	
	/**
	 * Returns the distance between the given vector {@code (v1)} and the given vector {@code (v2z, v2y, v2z)}.
	 * If the vectors are equal the result will be zero.
	 * It determines an equality by checking if all components are exactly the same.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(v2x, v2y, v2z) - v1|}
	 * 
	 * @param v1 The first vector.
	 * @param v2x The value of the x component of the second vector.
	 * @param v2y The value of the y component of the second vector.
	 * @param v2z The value of the z component of the second vector.
	 * 
	 * @return The distance between the vectors or zero if the two vectors are equal.
	 */
	public static float distance(Vec3fR v1, float v2x, float v2y, float v2z)
	{
		float x = v2x - v1.getX();
		float y = v2y - v1.getY();
		float z = v2z - v1.getZ();
		
		if(	x == 0.0f &&
			y == 0.0f &&
			z == 0.0f) return 0.0f;

		return BarghosMath.sqrt(x * x + y * y + z * z);
	}
	
	/**
	 * Returns the distance between the given vector {@code (v1[0], v1[1], v1[2])} and the given vector {@code (v2)}.
	 * If the vectors are equal the result will be zero.
	 * It determines an equality by checking if all components are exactly the same.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |v2 - (v1[0], v1[1], v1[2])|}
	 * 
	 * @param v1 The first vector. Minimum legth: 3.
	 * @param v2 The second vector.
	 * 
	 * @return The distance between the vectors or zero if the two vectors are equal.
	 */
	public static float distance(@MinLength(3) float[] v1, Vec3fR v2)
	{
		float x = v2.getX() - v1[0];
		float y = v2.getY() - v1[1];
		float z = v2.getZ() - v1[2];
		
		if(	x == 0.0f &&
			y == 0.0f &&
			z == 0.0f) return 0.0f;

		return BarghosMath.sqrt(x * x + y * y + z * z);
	}
	
	/**
	 * Returns the distance between the given vector {@code (v1[0], v1[1], v1[2])} and the given vector {@code (v2[0], v2[1], v2[2])}.
	 * If the vectors are equal the result will be zero.
	 * It determines an equality by checking if all components are exactly the same.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(v2[0], v2[1], v2[2]) - (v1[0], v1[1], v1[2])|}
	 * 
	 * @param v1 The first vector. Minimum legth: 3.
	 * @param v2 The second vector. Minimum legth: 3.
	 * 
	 * @return The distance between the vectors or zero if the two vectors are equal.
	 */
	public static float distance(@MinLength(3) float[] v1, @MinLength(3) float[] v2)
	{
		float x = v2[0] - v1[0];
		float y = v2[1] - v1[1];
		float z = v2[2] - v1[2];
		
		if(	x == 0.0f &&
			y == 0.0f &&
			z == 0.0f) return 0.0f;

		return BarghosMath.sqrt(x * x + y * y + z * z);
	}

	/**
	 * Returns the distance between the given vector {@code (v1[0], v1[1], v1[2])} and the given vector {@code (v2z, v2y, v2z)}.
	 * If the vectors are equal the result will be zero.
	 * It determines an equality by checking if all components are exactly the same.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(v2x, v2y, v2z) - (v1[0], v1[1], v1[2])|}
	 * 
	 * @param v1 The first vector. Minimum legth: 3.
	 * @param v2x The value of the x component of the second vector.
	 * @param v2y The value of the y component of the second vector.
	 * @param v2z The value of the z component of the second vector.
	 * 
	 * @return The distance between the vectors or zero if the two vectors are equal.
	 */
	public static float distance(@MinLength(3) float[] v1, float v2x, float v2y, float v2z)
	{
		float x = v2x - v1[0];
		float y = v2y - v1[1];
		float z = v2z - v1[2];
		
		if(	x == 0.0f &&
			y == 0.0f &&
			z == 0.0f) return 0.0f;

		return BarghosMath.sqrt(x * x + y * y + z * z);
	}
	
	/**
	 * Returns the distance between the given vector {@code (v1x, v1y, v1z)} and the given vector {@code (v2)}.
	 * If the vectors are equal the result will be zero.
	 * It determines an equality by checking if all components are exactly the same.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |v2 - (v1x, v1y, v1z)|}
	 * 
	 * @param v1x The value of the x component of the first vector.
	 * @param v1y The value of the y component of the first vector.
	 * @param v1z The value of the z component of the first vector.
	 * @param v2 The second vector.
	 * 
	 * @return The distance between the vectors or zero if the two vectors are equal.
	 */
	public static float distance(float v1x, float v1y, float v1z, Vec3fR v2)
	{
		float x = v2.getX() - v1x;
		float y = v2.getY() - v1y;
		float z = v2.getZ() - v1z;
		
		if(	x == 0.0f &&
			y == 0.0f &&
			z == 0.0f) return 0.0f;

		return BarghosMath.sqrt(x * x + y * y + z * z);
	}
	
	/**
	 * Returns the distance between the given vector {@code (v1x, v1y, v1z)} and the given vector {@code (v2[0], v2[1], v2[2])}.
	 * If the vectors are equal the result will be zero.
	 * It determines an equality by checking if all components are exactly the same.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(v2[0], v2[1], v2[2]) - (v1x, v1y, v1z)|}
	 * 
	 * @param v1x The value of the x component of the first vector.
	 * @param v1y The value of the y component of the first vector.
	 * @param v1z The value of the z component of the first vector.
	 * @param v2 The second vector. Minimum legth: 3.
	 * 
	 * @return The distance between the vectors or zero if the two vectors are equal.
	 */
	public static float distance(float v1x, float v1y, float v1z, @MinLength(3) float[] v2)
	{
		float x = v2[0] - v1x;
		float y = v2[1] - v1y;
		float z = v2[2] - v1z;
		
		if(	x == 0.0f &&
			y == 0.0f &&
			z == 0.0f) return 0.0f;

		return BarghosMath.sqrt(x * x + y * y + z * z);
	}
	
	/**
	 * Returns the distance between the given vector {@code (v1x, v1y, v1z)} and the given vector {@code (v2x, v2y, v2z)}.
	 * If the vectors are equal the result will be zero.
	 * It determines an equality by checking if all components are exactly the same.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(v2x, v2y, v2z) - (v1x, v1y, v1z)|}
	 * 
	 * @param v1x The value of the x component of the first vector.
	 * @param v1y The value of the y component of the first vector.
	 * @param v1z The value of the z component of the first vector.
	 * @param v2x The value of the x component of the second vector.
	 * @param v2y The value of the y component of the second vector.
	 * @param v2z The value of the z component of the second vector.
	 * 
	 * @return The distance between the vectors or zero if the two vectors are equal.
	 */
	public static float distance(float v1x, float v1y, float v1z, float v2x, float v2y, float v2z)
	{
		float x = v2x - v1x;
		float y = v2y - v1y;
		float z = v2z - v1z;
		
		if(	x == 0.0f &&
			y == 0.0f &&
			z == 0.0f) return 0.0f;

		return BarghosMath.sqrt(x * x + y * y + z * z);
	}
	
	/**
	 * Returns the length (magnitude, norm) of the vector {@code (v)}.
	 * If the vector is a zero-vector {@code (x=y=z=0)} the result will be zero.
	 * It determines a length of zero by checking if all components are within the margin defined by
	 * zero plus-minus the given tolerance inclusive {@code (-tolerance <= value <= tolerance)}.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |v|}
	 * 
	 * @param v The vector.
	 * @param tolerance The tolerance for defining the margin around zero.
	 * 
	 * @return The length of the vector or zero if it is a zero-vector.
	 */
	public static float length(Vec3fR v, float tolerance)
	{
		float x = v.getX();
		float y = v.getY();
		float z = v.getZ();
		
		if(	Math.abs(x) <= tolerance &&
			Math.abs(y) <= tolerance &&
			Math.abs(z) <= tolerance) return 0.0f;
		
		return BarghosMath.sqrt(x * x + y * y + z * z);
	}
	
	/**
	 * Returns the length (magnitude, norm) of the vector {@code (v[0], v[1], v[2])}.
	 * If the vector is a zero-vector {@code (x=y=z=0)} the result will be zero.
	 * It determines a length of zero by checking if all components are within the margin defined by
	 * zero plus-minus the given tolerance inclusive {@code (-tolerance <= value <= tolerance)}.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(v[0], v[1], v[2])|}
	 * 
	 * @param v The vector. Minimum legth: 3.
	 * @param tolerance The tolerance for defining the margin around zero.
	 * 
	 * @return The length of the vector or zero if it is a zero-vector.
	 */
	public static float length(@MinLength(3) float[] v, float tolerance)
	{
		if(	Math.abs(v[0]) <= tolerance &&
			Math.abs(v[1]) <= tolerance &&
			Math.abs(v[2]) <= tolerance) return 0.0f;
		
		return BarghosMath.sqrt(v[0] * v[0] + v[1] * v[1] + v[2] * v[2]);
	}
	
	/**
	 * Returns the length (magnitude, norm) of the vector {@code (x, y, z)}.
	 * If the vector is a zero-vector {@code (x=y=z=0)} the result will be zero.
	 * It determines a length of zero by checking if all components are within the margin defined by
	 * zero plus-minus the given tolerance inclusive {@code (-tolerance <= value <= tolerance)}.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(x, y, z)|}
	 * 
	 * @param x The value of the x component of the vector.
	 * @param y The value of the y component of the vector.
	 * @param z The value of the z component of the vector.
	 * @param tolerance The tolerance for defining the margin around zero.
	 * 
	 * @return The length of the vector or zero if it is a zero-vector.
	 */
	public static float length(float x, float y, float z , float tolerance)
	{
		if(	Math.abs(x) <= tolerance &&
			Math.abs(y) <= tolerance &&
			Math.abs(z) <= tolerance) return 0.0f;

		return BarghosMath.sqrt(x * x + y * y + z * z);
	}
	
	/**
	 * Returns the distance between the given vector {@code (v1)} and the given vector {@code (v2)}.
	 * If the two vectors are equal the result will be zero.
	 * It determines an equality by checking if all components are equal within a margin of plus-minus the given tolerance inclusive {@code (-tolerance <= value <= tolerance)}
	 * around the component values.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |v2 - v1|}
	 * 
	 * @param v1 The first vector.
	 * @param v2 The second vector.
	 * @param tolerance The tolerance for defining the margin.
	 * 
	 * @return The distance between the vectors or zero if the two vectors are equal withing the tolerance.
	 */
	public static float distance(Vec3fR v1, Vec3fR v2, float tolerance)
	{
		float x = v2.getX() - v1.getX();
		float y = v2.getY() - v1.getY();
		float z = v2.getZ() - v1.getZ();
		
		if(	Math.abs(x) <= tolerance &&
			Math.abs(y) <= tolerance &&
			Math.abs(z) <= tolerance) return 0.0f;
		
		return BarghosMath.sqrt(x * x + y * y + z * z);
	}
	
	/**
	 * Returns the distance between the given vector {@code (v1)} and the given vector {@code (v2[0], v2[1], v2[2])}.
	 * If the two vectors are equal the result will be zero.
	 * It determines an equality by checking if all components are equal within a margin of plus-minus the given tolerance inclusive {@code (-tolerance <= value <= tolerance)}
	 * around the component values.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(v2[0], v2[1], v2[2]) - v1|}
	 * 
	 * @param v1 The first vector.
	 * @param v2 The second vector. Minimum legth: 3.
	 * @param tolerance The tolerance for defining the margin.
	 * 
	 * @return The distance between the vectors or zero if the two vectors are equal withing the tolerance.
	 */
	public static float distance(Vec3fR v1, @MinLength(3) float[] v2, float tolerance)
	{
		float x = v2[0] - v1.getX();
		float y = v2[1] - v1.getY();
		float z = v2[2] - v1.getZ();
		
		if(	Math.abs(x) <= tolerance &&
			Math.abs(y) <= tolerance &&
			Math.abs(z) <= tolerance) return 0.0f;
		
		return BarghosMath.sqrt(x * x + y * y + z * z);
	}
	
	/**
	 * Returns the distance between the given vector {@code (v1)} and the given vector {@code (v2x, v2y, v2z)}.
	 * If the two vectors are equal the result will be zero.
	 * It determines an equality by checking if all components are equal within a margin of plus-minus the given tolerance inclusive {@code (-tolerance <= value <= tolerance)}
	 * around the component values.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(v2x, v2y, v2z) - v1|}
	 * 
	 * @param v1 The first vector.
	 * @param v2x The value of the x component of the second vector.
	 * @param v2y The value of the y component of the second vector.
	 * @param v2z The value of the z component of the second vector.
	 * @param tolerance The tolerance for defining the margin.
	 * 
	 * @return The distance between the vectors or zero if the two vectors are equal withing the tolerance.
	 */
	public static float distance(Vec3fR v1, float v2x, float v2y, float v2z, float tolerance)
	{
		float x = v2x - v1.getX();
		float y = v2y - v1.getY();
		float z = v2z - v1.getZ();
		
		if(	Math.abs(x) <= tolerance &&
			Math.abs(y) <= tolerance &&
			Math.abs(z) <= tolerance) return 0.0f;
		
		return BarghosMath.sqrt(x * x + y * y + z * z);
	}
	
	/**
	 * Returns the distance between the given vector {@code (v1[0], v1[1], v1[2])} and the given vector {@code (v2)}.
	 * If the two vectors are equal the result will be zero.
	 * It determines an equality by checking if all components are equal within a margin of plus-minus the given tolerance inclusive {@code (-tolerance <= value <= tolerance)}
	 * around the component values.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |v2 - (v1[0], v1[1], v1[2])|}
	 * 
	 * @param v1 The first vector. Minimum legth: 3.
	 * @param v2 The second vector.
	 * @param tolerance The tolerance for defining the margin.
	 * 
	 * @return The distance between the vectors or zero if the two vectors are equal withing the tolerance.
	 */
	public static float distance(@MinLength(3) float[] v1, Vec3fR v2, float tolerance)
	{
		float x = v2.getX() - v1[0];
		float y = v2.getY() - v1[1];
		float z = v2.getZ() - v1[2];
		
		if(	Math.abs(x) <= tolerance &&
			Math.abs(y) <= tolerance &&
			Math.abs(z) <= tolerance) return 0.0f;
		
		return BarghosMath.sqrt(x * x + y * y + z * z);
	}
	
	/**
	 * Returns the distance between the given vector {@code (v1[0], v1[1], v1[2])} and the given vector {@code (v2[0], v2[1], v2[2])}.
	 * If the two vectors are equal the result will be zero.
	 * It determines an equality by checking if all components are equal within a margin of plus-minus the given tolerance inclusive {@code (-tolerance <= value <= tolerance)}
	 * around the component values.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(v2[0], v2[1], v2[2]) - (v1[0], v1[1], v1[2])|}
	 * 
	 * @param v1 The first vector. Minimum legth: 3.
	 * @param v2 The second vector. Minimum legth: 3.
	 * @param tolerance The tolerance for defining the margin.
	 * 
	 * @return The distance between the vectors or zero if the two vectors are equal withing the tolerance.
	 */
	public static float distance(@MinLength(3) float[] v1, @MinLength(3) float[] v2, float tolerance)
	{
		float x = v2[0] - v1[0];
		float y = v2[1] - v1[1];
		float z = v2[2] - v1[2];
		
		if(	Math.abs(x) <= tolerance &&
			Math.abs(y) <= tolerance &&
			Math.abs(z) <= tolerance) return 0.0f;
		
		return BarghosMath.sqrt(x * x + y * y + z * z);
	}
	
	/**
	 * Returns the distance between the given vector {@code (v1[0], v1[1], v1[2])} and the given vector {@code (v2x, v2y, v2z)}.
	 * If the two vectors are equal the result will be zero.
	 * It determines an equality by checking if all components are equal within a margin of plus-minus the given tolerance inclusive {@code (-tolerance <= value <= tolerance)}
	 * around the component values.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(v2x, v2y, v2z) - (v1[0], v1[1], v1[2])|}
	 * 
	 * @param v1 The first vector. Minimum legth: 3.
	 * @param v2x The value of the x component of the second vector.
	 * @param v2y The value of the y component of the second vector.
	 * @param v2z The value of the z component of the second vector.
	 * @param tolerance The tolerance for defining the margin.
	 * 
	 * @return The distance between the vectors or zero if the two vectors are equal withing the tolerance.
	 */
	public static float distance(@MinLength(3) float[] v1, float v2x, float v2y, float v2z, float tolerance)
	{
		float x = v2x - v1[0];
		float y = v2y - v1[1];
		float z = v2z - v1[2];
		
		if(	Math.abs(x) <= tolerance &&
			Math.abs(y) <= tolerance &&
			Math.abs(z) <= tolerance) return 0.0f;
		
		return BarghosMath.sqrt(x * x + y * y + z * z);
	}
	
	/**
	 * Returns the distance between the given vector {@code (v1x, v1y, v1z)} and the given vector {@code (v2)}.
	 * If the two vectors are equal the result will be zero.
	 * It determines an equality by checking if all components are equal within a margin of plus-minus the given tolerance inclusive {@code (-tolerance <= value <= tolerance)}
	 * around the component values.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |v2 - (v1x, v1y, v1z)|}
	 * 
	 * @param v1x The value of the x component of the first vector.
	 * @param v1y The value of the y component of the first vector.
	 * @param v1z The value of the z component of the first vector.
	 * @param v2 The second vector.
	 * @param tolerance The tolerance for defining the margin.
	 * 
	 * @return The distance between the vectors or zero if the two vectors are equal withing the tolerance.
	 */
	public static float distance(float v1x, float v1y, float v1z, Vec3fR v2, float tolerance)
	{
		float x = v2.getX() - v1x;
		float y = v2.getY() - v1y;
		float z = v2.getZ() - v1z;
		
		if(	Math.abs(x) <= tolerance &&
			Math.abs(y) <= tolerance &&
			Math.abs(z) <= tolerance) return 0.0f;
		
		return BarghosMath.sqrt(x * x + y * y + z * z);
	}
	
	/**
	 * Returns the distance between the given vector {@code (v1x, v1y, v1z)} and the given vector {@code (v2[0], v2[1], v2[2])}.
	 * If the two vectors are equal the result will be zero.
	 * It determines an equality by checking if all components are equal within a margin of plus-minus the given tolerance inclusive {@code (-tolerance <= value <= tolerance)}
	 * around the component values.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(v2[0], v2[1], v2[2]) - (v1x, v1y, v1z)|}
	 * 
	 * @param v1x The value of the x component of the first vector.
	 * @param v1y The value of the y component of the first vector.
	 * @param v1z The value of the z component of the first vector.
	 * @param v2 The second vector. Minimum legth: 3.
	 * @param tolerance The tolerance for defining the margin.
	 * 
	 * @return The distance between the vectors or zero if the two vectors are equal withing the tolerance.
	 */
	public static float distance(float v1x, float v1y, float v1z, @MinLength(3) float[] v2, float tolerance)
	{
		float x = v2[0] - v1x;
		float y = v2[1] - v1y;
		float z = v2[2] - v1z;
		
		if(	Math.abs(x) <= tolerance &&
			Math.abs(y) <= tolerance &&
			Math.abs(z) <= tolerance) return 0.0f;
		
		return BarghosMath.sqrt(x * x + y * y + z * z);
	}
	
	/**
	 * Returns the distance between the given vector {@code (v1x, v1y, v1z)} and the given vector {@code (v2x, v2y, v2z)}.
	 * If the two vectors are equal the result will be zero.
	 * It determines an equality by checking if all components are equal within a margin of plus-minus the given tolerance inclusive {@code (-tolerance <= value <= tolerance)}
	 * around the component values.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(v2x, v2y, v2z) - (v1x, v1y, v1z)|}
	 * 
	 * @param v1x The value of the x component of the first vector.
	 * @param v1y The value of the y component of the first vector.
	 * @param v1z The value of the z component of the first vector.
	 * @param v2x The value of the x component of the second vector.
	 * @param v2y The value of the y component of the second vector.
	 * @param v2z The value of the z component of the second vector.
	 * @param tolerance The tolerance for defining the margin.
	 * 
	 * @return The distance between the vectors or zero if the two vectors are equal withing the tolerance.
	 */
	public static float distance(float v1x, float v1y, float v1z, float v2x, float v2y, float v2z, float tolerance)
	{
		float x = v2x - v1x;
		float y = v2y - v1y;
		float z = v2z - v1z;
		
		if(	Math.abs(x) <= tolerance &&
			Math.abs(y) <= tolerance &&
			Math.abs(z) <= tolerance) return 0.0f;
		
		return BarghosMath.sqrt(x * x + y * y + z * z);
	}
	
	/**
	 * Returns the squared length (magnitude, norm) of the vector {@code (v)}.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |v|^2}
	 * 
	 * @param v The vector.
	 * 
	 * @return The squared length of the vector.
	 */
	public static float squaredLengthUnsafe(Vec3fR v)
	{
		float x = v.getX();
		float y = v.getY();
		float z = v.getZ();
		
		return x * x + y * y + z * z;
	}
	
	/**
	 * Returns the squared length (magnitude, norm) of the vector {@code (v[0], v[1], v[2])}.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(v[0], v[1], v[2])|^2}
	 * 
	 * @param v The vector. Minimum legth: 3.
	 * 
	 * @return The squared length of the vector.
	 */
	public static float squaredLengthUnsafe(@MinLength(3) float[] v)
	{
		return v[0] * v[0] + v[1] * v[1] + v[2] * v[2];
	}
	
	/**
	 * Returns the squared length (magnitude, norm) of the vector {@code (x, y, z)}.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(x, y, z)|^2}
	 * 
	 * @param x The value of the x component of the vector.
	 * @param y The value of the y component of the vector.
	 * @param z The value of the z component of the vector.
	 * 
	 * @return The squared length of the vector.
	 */
	public static float squaredLengthUnsafe(float x, float y, float z)
	{
		return x * x + y * y + z * z;
	}
	
	/**
	 * Returns the squared distance between the given vector {@code (v1)} and the given vector {@code (v2)}.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |v2 - v1|^2}
	 * 
	 * @param v1 The first vector.
	 * @param v2 The second vector.
	 * 
	 * @return The squared distance between the vectors.
	 */
	public static float squaredDistanceUnsafe(Vec3fR v1, Vec3fR v2)
	{
		float x = v2.getX() - v1.getX();
		float y = v2.getY() - v1.getY();
		float z = v2.getZ() - v1.getZ();
		
		return x * x + y * y + z * z;
	}
	
	/**
	 * Returns the squared distance between the given vector {@code (v1)} and the given vector {@code (v2[0], v2[1], v2[2])}.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(v2[0], v2[1], v2[2]) - v1|^2}
	 * 
	 * @param v1 The first vector.
	 * @param v2 The second vector. Minimum legth: 3.
	 * 
	 * @return The squared distance between the vectors.
	 */
	public static float squaredDistanceUnsafe(Vec3fR v1, @MinLength(3) float[] v2)
	{
		float x = v2[0] - v1.getX();
		float y = v2[1] - v1.getY();
		float z = v2[2] - v1.getZ();
		
		return x * x + y * y + z * z;
	}
	
	/**
	 * Returns the squared distance between the given vector {@code (v1)} and  the given vector {@code (v2x, v2y, v2z)}.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(v2x, v2y, v2z) - v1|^2}
	 * 
	 * @param v1 The first vector.
	 * @param v2x The value of the x component of the second vector.
	 * @param v2y The value of the y component of the second vector.
	 * @param v2z The value of the z component of the second vector.
	 * 
	 * @return The squared distance between the vectors.
	 */
	public static float squaredDistanceUnsafe(Vec3fR v1, float v2x, float v2y, float v2z)
	{
		float x = v2x - v1.getX();
		float y = v2y - v1.getY();
		float z = v2z - v1.getZ();
		
		return x * x + y * y + z * z;
	}
	
	/**
	 * Returns the squared distance between the given vector {@code (v1[0], v1[1], v1[2])} and  the given vector {@code (v2)}.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |v2 - (v1[0], v1[1], v1[2])|^2}
	 * 
	 * @param v1 The first vector. Minimum legth: 3.
	 * @param v2 The second vector.
	 * 
	 * @return The squared distance between the vectors.
	 */
	public static float squaredDistanceUnsafe(@MinLength(3) float[] v1, Vec3fR v2)
	{
		float x = v2.getX() - v1[0];
		float y = v2.getY() - v1[1];
		float z = v2.getZ() - v1[2];
		
		return x * x + y * y + z * z;
	}
	
	/**
	 * Returns the squared distance between the given vector {@code (v1[0], v1[1], v1[2])} and  the given vector {@code (v2[0], v2[1], v2[2])}.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(v2[0], v2[1], v2[2]) - (v1[0], v1[1], v1[2])|^2}
	 * 
	 * @param v1 The first vector. Minimum legth: 3.
	 * @param v2 The second vector. Minimum legth: 3.
	 * 
	 * @return The squared distance between the vectors.
	 */
	public static float squaredDistanceUnsafe(@MinLength(3) float[] v1, @MinLength(3) float[] v2)
	{
		float x = v2[0] - v1[0];
		float y = v2[1] - v1[1];
		float z = v2[2] - v1[2];
		
		return x * x + y * y + z * z;
	}
	
	/**
	 * Returns the squared distance between the given vector {@code (v1[0], v1[1], v1[2])} and  the given vector {@code (v2x, v2y, v2z)}.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(v2x, v2y, v2z) - (v1[0], v1[1], v1[2])|^2}
	 * 
	 * @param v1 The first vector. Minimum legth: 3.
	 * @param v2x The value of the x component of the second vector.
	 * @param v2y The value of the y component of the second vector.
	 * @param v2z The value of the z component of the second vector.
	 * 
	 * @return The squared distance between the vectors.
	 */
	public static float squaredDistanceUnsafe(@MinLength(3) float[] v1, float v2x, float v2y, float v2z)
	{
		float x = v2x - v1[0];
		float y = v2y - v1[1];
		float z = v2z - v1[2];
		
		return x * x + y * y + z * z;
	}
	
	/**
	 * Returns the squared distance between the given vector {@code (v1x, v1y, v1z)} and  the given vector {@code (v2)}.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |v2 - (v1x, v1y, v1z)|^2}
	 * 
	 * @param v1x The value of the x component of the first vector.
	 * @param v1y The value of the y component of the first vector.
	 * @param v1z The value of the z component of the first vector.
	 * @param v2 The second vector.
	 * 
	 * @return The squared distance between the vectors.
	 */
	public static float squaredDistanceUnsafe(float v1x, float v1y, float v1z, Vec3fR v2)
	{
		float x = v2.getX() - v1x;
		float y = v2.getY() - v1y;
		float z = v2.getZ() - v1z;
		
		return x * x + y * y + z * z;
	}
	
	/**
	 * Returns the squared distance between the given vector {@code (v1x, v1y, v1z)} and  the given vector {@code (v2[0], v2[1], v2[2])}.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(v2[0], v2[1], v2[2]) - (v1x, v1y, v1z)|^2}
	 * 
	 * @param v1x The value of the x component of the first vector.
	 * @param v1y The value of the y component of the first vector.
	 * @param v1z The value of the z component of the first vector.
	 * @param v2 The second vector. Minimum legth: 3.
	 * 
	 * @return The squared distance between the vectors.
	 */
	public static float squaredDistanceUnsafe(float v1x, float v1y, float v1z, @MinLength(3) float[] v2)
	{
		float x = v2[0] - v1x;
		float y = v2[1] - v1y;
		float z = v2[2] - v1z;
		
		return x * x + y * y + z * z;
	}
	
	/**
	 * Returns the squared distance between the given vector {@code (v1x, v1y, v1z)} and  the given vector {@code (v2x, v2y, v2z)}.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(v2x, v2y, v2z) - (v1x, v1y, v1z)|^2}
	 * 
	 * @param v1x The value of the x component of the first vector.
	 * @param v1y The value of the y component of the first vector.
	 * @param v1z The value of the z component of the first vector.
	 * @param v2x The value of the x component of the second vector.
	 * @param v2y The value of the y component of the second vector.
	 * @param v2z The value of the z component of the second vector.
	 * 
	 * @return The squared distance between the vectors.
	 */
	public static float squaredDistanceUnsafe(float v1x, float v1y, float v1z, float v2x, float v2y, float v2z)
	{
		float x = v2x - v1x;
		float y = v2y - v1y;
		float z = v2z - v1z;
		
		return x * x + y * y + z * z;
	}
	
	/**
	 * Returns the squared length of the vector {@code (v)}.
	 * If the vector is a zero-vector {@code (x=y=z=0)} the result will be zero.
	 * It determines a length of zero by checking if all components are exactly zero.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |v|^2}
	 * 
	 * @param v The vector.
	 * 
	 * @return The squared length of the vector or zero if it is a zero-vector.
	 */
	public static float squaredLength(Vec3fR v)
	{
		float x = v.getX();
		float y = v.getY();
		float z = v.getZ();
		
		if(	x == 0.0f &&
			y == 0.0f &&
			z == 0.0f) return 0.0f;

		return x * x + y * y + z * z;
	}
	
	/**
	 * Returns the squared length of the vector {@code (v[0], v[1], v[2])}.
	 * If the vector is a zero-vector {@code (x=y=z=0)} the result will be zero.
	 * It determines a length of zero by checking if all components are exactly zero.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(v[0], v[1], v[2])|^2}
	 * 
	 * @param v The vector. Minimum legth: 3.
	 * 
	 * @return The squared length of the vector or zero if it is a zero-vector.
	 */
	public static float squaredLength(@MinLength(3) float[] v)
	{
		if(	v[0] == 0.0f &&
			v[0] == 0.0f &&
			v[0] == 0.0f) return 0.0f;

		return v[0] * v[0] + v[1] * v[1] + v[2] * v[2];
	}
	
	/**
	 * Returns the squared length of the vector {@code (x, y, z)}.
	 * If the vector is a zero-vector {@code (x=y=z=0)} the result will be zero.
	 * It determines a length of zero by checking if all components are exactly zero.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(x, y, z)|^2}
	 * 
	 * @param x The value of the x component of the vector.
	 * @param y The value of the y component of the vector.
	 * @param z The value of the z component of the vector.
	 * 
	 * @return The squared length of the vector or zero if it is a zero-vector.
	 */
	public static float squaredLength(float x, float y, float z)
	{
		if(	x == 0.0f &&
			y == 0.0f &&
			z == 0.0f) return 0.0f;

		return x * x + y * y + z * z;
	}
	
	/**
	 * Returns the squared distance between the given vector {@code (v1)} and the given vector {@code (v2)}.
	 * If the two vectors are equal the result will be zero.
	 * It determines an equality by checking if all components are exactly the same.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |v2 - v1|^2}
	 * 
	 * @param v1 The first vector.
	 * @param v2 The second vector.
	 * 
	 * @return The squared distance between the vectors or zero if both vectors are equal.
	 */
	public static float squaredDistance(Vec3fR v1, Vec3fR v2)
	{
		float x = v2.getX() - v1.getX();
		float y = v2.getY() - v1.getY();
		float z = v2.getZ() - v1.getZ();
		
		if(	x == 0.0f &&
			y == 0.0f &&
			z == 0.0f) return 0.0f;

		return x * x + y * y + z * z;
	}
	
	/**
	 * Returns the squared distance between the given vector {@code (v1)} and the given vector {@code (v2[0], v2[1], v2[2])}.
	 * If the two vectors are equal the result will be zero.
	 * It determines an equality by checking if all components are exactly the same.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(v2[0], v2[1], v2[2]) - v1|^2}
	 * 
	 * @param v1 The first vector.
	 * @param v2 The second vector. Minimum legth: 3.
	 * 
	 * @return The squared distance between the vectors or zero if both vectors are equal.
	 */
	public static float squaredDistance(Vec3fR v1, @MinLength(3) float[] v2)
	{
		float x = v2[0] - v1.getX();
		float y = v2[1] - v1.getY();
		float z = v2[2] - v1.getZ();
		
		if(	x == 0.0f &&
			y == 0.0f &&
			z == 0.0f) return 0.0f;

		return x * x + y * y + z * z;
	}
	
	/**
	 * Returns the squared distance between the given vector {@code (v1)} and the given vector {@code (v2x, v2y, v2z)}.
	 * If the two vectors are equal the result will be zero.
	 * It determines an equality by checking if all components are exactly the same.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(v2x, v2y, v2z) - v1|^2}
	 * 
	 * @param v1 The first vector.
	 * @param v2x The value of the x component of the second vector.
	 * @param v2y The value of the y component of the second vector.
	 * @param v2z The value of the z component of the second vector.
	 * 
	 * @return The squared distance between the vectors or zero if both vectors are equal.
	 */
	public static float squaredDistance(Vec3fR v1, float v2x, float v2y, float v2z)
	{
		float x = v2x - v1.getX();
		float y = v2y - v1.getY();
		float z = v2z - v1.getZ();
		
		if(	x == 0.0f &&
			y == 0.0f &&
			z == 0.0f) return 0.0f;

		return x * x + y * y + z * z;
	}
	
	/**
	 * Returns the squared distance between the given vector {@code (v1[0], v1[1], v1[2])} and the given vector {@code (v2)}.
	 * If the two vectors are equal the result will be zero.
	 * It determines an equality by checking if all components are exactly the same.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |v2 - (v1[0], v1[1], v1[2])|^2}
	 * 
	 * @param v1 The first vector. Minimum legth: 3.
	 * @param v2 The second vector.
	 * 
	 * @return The squared distance between the vectors or zero if both vectors are equal.
	 */
	public static float squaredDistance(@MinLength(3) float[] v1, Vec3fR v2)
	{
		float x = v2.getX() - v1[0];
		float y = v2.getY() - v1[1];
		float z = v2.getZ() - v1[2];
		
		if(	x == 0.0f &&
			y == 0.0f &&
			z == 0.0f) return 0.0f;

		return x * x + y * y + z * z;
	}
	
	/**
	 * Returns the squared distance between the given vector {@code (v1[0], v1[1], v1[2])} and the given vector {@code (v2[0], v2[1], v2[2])}.
	 * If the two vectors are equal the result will be zero.
	 * It determines an equality by checking if all components are exactly the same.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(v2[0], v2[1], v2[2]) - (v1[0], v1[1], v1[2])|^2}
	 * 
	 * @param v1 The first vector. Minimum legth: 3.
	 * @param v2 The second vector. Minimum legth: 3.
	 * 
	 * @return The squared distance between the vectors or zero if both vectors are equal.
	 */
	public static float squaredDistance(@MinLength(3) float[] v1, @MinLength(3) float[] v2)
	{
		float x = v2[0] - v1[0];
		float y = v2[1] - v1[1];
		float z = v2[2] - v1[2];
		
		if(	x == 0.0f &&
			y == 0.0f &&
			z == 0.0f) return 0.0f;

		return x * x + y * y + z * z;
	}
	
	/**
	 * Returns the squared distance between the given vector {@code (v1[0], v1[1], v1[2])} and the given vector {@code (v2x, v2y, v2z)}.
	 * If the two vectors are equal the result will be zero.
	 * It determines an equality by checking if all components are exactly the same.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(v2x, v2y, v2z) - (v1[0], v1[1], v1[2])|^2}
	 * 
	 * @param v1 The first vector. Minimum legth: 3.
	 * @param v2x The value of the x component of the second vector.
	 * @param v2y The value of the y component of the second vector.
	 * @param v2z The value of the z component of the second vector.
	 * 
	 * @return The squared distance between the vectors or zero if both vectors are equal.
	 */
	public static float squaredDistance(@MinLength(3) float[] v1, float v2x, float v2y, float v2z)
	{
		float x = v2x - v1[0];
		float y = v2y - v1[1];
		float z = v2z - v1[2];
		
		if(	x == 0.0f &&
			y == 0.0f &&
			z == 0.0f) return 0.0f;

		return x * x + y * y + z * z;
	}
	
	/**
	 * Returns the squared distance between the given vector {@code (v1x, v1y, v1z)} and the given vector {@code (v2)}.
	 * If the two vectors are equal the result will be zero.
	 * It determines an equality by checking if all components are exactly the same.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |v2 - (v1x, v1y, v1z)|^2}
	 * 
	 * @param v1x The value of the x component of the first vector.
	 * @param v1y The value of the y component of the first vector.
	 * @param v1z The value of the z component of the first vector.
	 * @param v2 The first vector.
	 * 
	 * @return The squared distance between the vectors or zero if both vectors are equal.
	 */
	public static float squaredDistance(float v1x, float v1y, float v1z, Vec3fR v2)
	{
		float x = v2.getX() - v1x;
		float y = v2.getY() - v1y;
		float z = v2.getZ() - v1z;
		
		if(	x == 0.0f &&
			y == 0.0f &&
			z == 0.0f) return 0.0f;

		return x * x + y * y + z * z;
	}
	
	/**
	 * Returns the squared distance between the given vector {@code (v1x, v1y, v1z)} and the given vector {@code (v2[0], v2[1], v2[2])}.
	 * If the two vectors are equal the result will be zero.
	 * It determines an equality by checking if all components are exactly the same.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(v2[0], v2[1], v2[2]) - (v1x, v1y, v1z)|^2}
	 * 
	 * @param v1x The value of the x component of the first vector.
	 * @param v1y The value of the y component of the first vector.
	 * @param v1z The value of the z component of the first vector.
	 * @param v2 The first vector. Minimum legth: 3.
	 * 
	 * @return The squared distance between the vectors or zero if both vectors are equal.
	 */
	public static float squaredDistance(float v1x, float v1y, float v1z, @MinLength(3) float[] v2)
	{
		float x = v2[0] - v1x;
		float y = v2[1] - v1y;
		float z = v2[2] - v1z;
		
		if(	x == 0.0f &&
			y == 0.0f &&
			z == 0.0f) return 0.0f;

		return x * x + y * y + z * z;
	}
	
	/**
	 * Returns the squared distance between the given vector {@code (v1x, v1y, v1z)} and the given vector {@code (v2x, v2y, v2z)}.
	 * If the two vectors are equal the result will be zero.
	 * It determines an equality by checking if all components are exactly the same.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(v2x, v2y, v2z) - (v1x, v1y, v1z)|^2}
	 * 
	 * @param v1x The value of the x component of the first vector.
	 * @param v1y The value of the y component of the first vector.
	 * @param v1z The value of the z component of the first vector.
	 * @param v2x The value of the x component of the second vector.
	 * @param v2y The value of the y component of the second vector.
	 * @param v2z The value of the z component of the second vector.
	 * 
	 * @return The squared distance between the vectors or zero if both vectors are equal.
	 */
	public static float squaredDistance(float v1x, float v1y, float v1z, float v2x, float v2y, float v2z)
	{
		float x = v2x - v1x;
		float y = v2y - v1y;
		float z = v2z - v1z;
		
		if(	x == 0.0f &&
			y == 0.0f &&
			z == 0.0f) return 0.0f;

		return x * x + y * y + z * z;
	}
	
	/**
	 * Returns the squared length of the vector {@code (v)}.
	 * If the vector is a zero-vector the result will be zero.
	 * It determines a length of zero by checking if all components are within the margin defined by
	 * zero plus-minus the given tolerance inclusive {@code (-tolerance <= value <= tolerance)}.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |v|^2}
	 * 
	 * @param v The vector.
	 * @param tolerance The tolerance for defining the margin around zero.
	 * 
	 * @return The squared length of the vector or zero if it is a zero-length vector.
	 */
	public static float squaredLength(Vec3fR v, float tolerance)
	{
		float x = v.getX();
		float y = v.getY();
		float z = v.getZ();
		
		if(	Math.abs(x) <= tolerance &&
			Math.abs(y) <= tolerance &&
			Math.abs(z) <= tolerance) return 0.0f;

		return x * x + y * y + z * z;
	}
	
	/**
	 * Returns the squared length of the vector {@code (v[0], v[1], v[2])}.
	 * If the vector is a zero-vector the result will be zero.
	 * It determines a length of zero by checking if all components are within the margin defined by
	 * zero plus-minus the given tolerance inclusive {@code (-tolerance <= value <= tolerance)}.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(v[0], v[1], v[2])|^2}
	 * 
	 * @param v The vector. Minimum legth: 3.
	 * @param tolerance The tolerance for defining the margin around zero.
	 * 
	 * @return The squared length of the vector or zero if it is a zero-length vector.
	 */
	public static float squaredLength(@MinLength(3) float[] v, float tolerance)
	{
		if(	Math.abs(v[0]) <= tolerance &&
			Math.abs(v[1]) <= tolerance &&
			Math.abs(v[2]) <= tolerance) return 0.0f;

		return v[0] * v[0] + v[1] * v[1] + v[2] * v[2];
	}
	
	/**
	 * Returns the squared length of the vector {@code (x, y, z)}.
	 * If the vector is a zero-vector the result will be zero.
	 * It determines a length of zero by checking if all components are within the margin defined by
	 * zero plus-minus the given tolerance inclusive {@code (-tolerance <= value <= tolerance)}.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(x, y, z)|^2}
	 * 
	 * @param x The value of the x component of the vector.
	 * @param y The value of the y component of the vector.
	 * @param z The value of the z component of the vector.
	 * @param tolerance The tolerance for defining the margin around zero.
	 * 
	 * @return The squared length of the vector or zero if it is a zero-vector.
	 */
	public static float squaredLength(float x, float y, float z, float tolerance)
	{
		if(	Math.abs(x) <= tolerance &&
			Math.abs(y) <= tolerance &&
			Math.abs(z) <= tolerance) return 0.0f;

		return x * x + y * y + z * z;
	}
	
	/**
	 * Returns the squared distance between the given vector {@code (v1)} and the given vector {@code (v2)}.
	 * If the two vectors are equal the result will be zero.
	 * It determines an equality by checking if all components are equal within a margin of plus-minus the given tolerance inclusive {@code (-tolerance <= value <= tolerance)}
	 * around the component values.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |v2 - v1|^2}
	 * 
	 * @param v1 The first vector.
	 * @param v2 The second vector.
	 * @param tolerance The tolerance for defining the margin.
	 * 
	 * @return The distance between the vectors or zero if the two vectors are equal withing the tolerance.
	 */
	public static float squaredDistance(Vec3fR v1, Vec3fR v2, float tolerance)
	{
		float x = v2.getX() - v1.getX();
		float y = v2.getY() - v1.getY();
		float z = v2.getZ() - v1.getZ();
		
		if(	Math.abs(x) <= tolerance &&
			Math.abs(y) <= tolerance &&
			Math.abs(z) <= tolerance) return 0.0f;

		return x * x + y * y + z * z;
	}
	
	/**
	 * Returns the squared distance between the given vector {@code (v1)} and the given vector {@code (v2[0], v2[1], v2[2])}.
	 * If the two vectors are equal the result will be zero.
	 * It determines an equality by checking if all components are equal within a margin of plus-minus the given tolerance inclusive {@code (-tolerance <= value <= tolerance)}
	 * around the component values.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(v2[0], v2[1], v2[2]) - v1|^2}
	 * 
	 * @param v1 The first vector.
	 * @param v2 The second vector. Minimum legth: 3.
	 * @param tolerance The tolerance for defining the margin.
	 * 
	 * @return The distance between the vectors or zero if the two vectors are equal withing the tolerance.
	 */
	public static float squaredDistance(Vec3fR v1, @MinLength(3) float[] v2, float tolerance)
	{
		float x = v2[0] - v1.getX();
		float y = v2[1] - v1.getY();
		float z = v2[2] - v1.getZ();
		
		if(	Math.abs(x) <= tolerance &&
			Math.abs(y) <= tolerance &&
			Math.abs(z) <= tolerance) return 0.0f;

		return x * x + y * y + z * z;
	}
	
	/**
	 * Returns the squared distance between the given vector {@code (v1)} and the given vector {@code (v2x, v2y, v2z)}.
	 * If the two vectors are equal the result will be zero.
	 * It determines an equality by checking if all components are equal within a margin of plus-minus the given tolerance inclusive {@code (-tolerance <= value <= tolerance)}
	 * around the component values.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(v2x, v2y, v2z) - v1|^2}
	 * 
	 * @param v1 The first vector.
	 * @param v2x The value of the x component of the second vector.
	 * @param v2y The value of the y component of the second vector.
	 * @param v2z The value of the z component of the second vector.
	 * @param tolerance The tolerance for defining the margin.
	 * 
	 * @return The distance between the vectors or zero if the two vectors are equal withing the tolerance.
	 */
	public static float squaredDistance(Vec3fR v1, float v2x, float v2y, float v2z, float tolerance)
	{
		float x = v2x - v1.getX();
		float y = v2y - v1.getY();
		float z = v2z - v1.getZ();
		
		if(	Math.abs(x) <= tolerance &&
			Math.abs(y) <= tolerance &&
			Math.abs(z) <= tolerance) return 0.0f;

		return x * x + y * y + z * z;
	}
	
	/**
	 * Returns the squared distance between the given vector {@code (v1[0], v1[1], v1[2])} and the given vector {@code (v2)}.
	 * If the two vectors are equal the result will be zero.
	 * It determines an equality by checking if all components are equal within a margin of plus-minus the given tolerance inclusive {@code (-tolerance <= value <= tolerance)}
	 * around the component values.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |v2 - (v1[0], v1[1], v1[2])|^2}
	 * 
	 * @param v1 The first vector. Minimum legth: 3.
	 * @param v2 The second vector. Minimum legth: 3.
	 * @param tolerance The tolerance for defining the margin.
	 * 
	 * @return The distance between the vectors or zero if the two vectors are equal withing the tolerance.
	 */
	public static float squaredDistance(@MinLength(3) float[] v1, Vec3fR v2, float tolerance)
	{
		float x = v2.getX() - v1[0];
		float y = v2.getY() - v1[1];
		float z = v2.getZ() - v1[2];
		
		if(	Math.abs(x) <= tolerance &&
			Math.abs(y) <= tolerance &&
			Math.abs(z) <= tolerance) return 0.0f;

		return x * x + y * y + z * z;
	}
	
	/**
	 * Returns the squared distance between the given vector {@code (v1[0], v1[1], v1[2])} and the given vector {@code (v2[0], v2[1], v2[2])}.
	 * If the two vectors are equal the result will be zero.
	 * It determines an equality by checking if all components are equal within a margin of plus-minus the given tolerance inclusive {@code (-tolerance <= value <= tolerance)}
	 * around the component values.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(v2[0], v2[1], v2[2]) - (v1[0], v1[1], v1[2])|^2}
	 * 
	 * @param v1 The first vector. Minimum legth: 3.
	 * @param v2 The second vector. Minimum legth: 3.
	 * @param tolerance The tolerance for defining the margin.
	 * 
	 * @return The distance between the vectors or zero if the two vectors are equal withing the tolerance.
	 */
	public static float squaredDistance(@MinLength(3) float[] v1, @MinLength(3) float[] v2, float tolerance)
	{
		float x = v2[0] - v1[0];
		float y = v2[1] - v1[1];
		float z = v2[2] - v1[2];
		
		if(	Math.abs(x) <= tolerance &&
			Math.abs(y) <= tolerance &&
			Math.abs(z) <= tolerance) return 0.0f;

		return x * x + y * y + z * z;
	}
	
	/**
	 * Returns the squared distance between the given vector {@code (v1[0], v1[1], v1[2])} and the given vector {@code (v2x, v2y, v2z)}.
	 * If the two vectors are equal the result will be zero.
	 * It determines an equality by checking if all components are equal within a margin of plus-minus the given tolerance inclusive {@code (-tolerance <= value <= tolerance)}
	 * around the component values.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(v2x, v2y, v2z) - (v1[0], v1[1], v1[2])|^2}
	 * 
	 * @param v1 The first vector. Minimum legth: 3.
	 * @param v2x The value of the x component of the second vector.
	 * @param v2y The value of the y component of the second vector.
	 * @param v2z The value of the z component of the second vector.
	 * @param tolerance The tolerance for defining the margin.
	 * 
	 * @return The distance between the vectors or zero if the two vectors are equal withing the tolerance.
	 */
	public static float squaredDistance(@MinLength(3) float[] v1, float v2x, float v2y, float v2z, float tolerance)
	{
		float x = v2x - v1[0];
		float y = v2y - v1[1];
		float z = v2z - v1[2];
		
		if(	Math.abs(x) <= tolerance &&
			Math.abs(y) <= tolerance &&
			Math.abs(z) <= tolerance) return 0.0f;

		return x * x + y * y + z * z;
	}
	
	/**
	 * Returns the squared distance between the given vector {@code (v1x, v1y, v1z)} and the given vector {@code (v2)}.
	 * If the two vectors are equal the result will be zero.
	 * It determines an equality by checking if all components are equal within a margin of plus-minus the given tolerance inclusive {@code (-tolerance <= value <= tolerance)}
	 * around the component values.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |v2 - (v1x, v1y, v1z)|^2}
	 * 
	 * @param v1x The value of the x component of the first vector.
	 * @param v1y The value of the y component of the first vector.
	 * @param v1z The value of the z component of the first vector.
	 * @param v2 The second vector.
	 * @param tolerance The tolerance for defining the margin.
	 * 
	 * @return The distance between the vectors or zero if the two vectors are equal withing the tolerance.
	 */
	public static float squaredDistance(float v1x, float v1y, float v1z, Vec3fR v2, float tolerance)
	{
		float x = v2.getX() - v1x;
		float y = v2.getY() - v1y;
		float z = v2.getZ() - v1z;
		
		if(	Math.abs(x) <= tolerance &&
			Math.abs(y) <= tolerance &&
			Math.abs(z) <= tolerance) return 0.0f;

		return x * x + y * y + z * z;
	}
	
	/**
	 * Returns the squared distance between the given vector {@code (v1x, v1y, v1z)} and the given vector {@code (v2[0], v2[1], v2[2])}.
	 * If the two vectors are equal the result will be zero.
	 * It determines an equality by checking if all components are equal within a margin of plus-minus the given tolerance inclusive {@code (-tolerance <= value <= tolerance)}
	 * around the component values.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(v2[0], v2[1], v2[2]) - (v1x, v1y, v1z)|^2}
	 * 
	 * @param v1x The value of the x component of the first vector.
	 * @param v1y The value of the y component of the first vector.
	 * @param v1z The value of the z component of the first vector.
	 * @param v2 The second vector. Minimum legth: 3.
	 * @param tolerance The tolerance for defining the margin.
	 * 
	 * @return The distance between the vectors or zero if the two vectors are equal withing the tolerance.
	 */
	public static float squaredDistance(float v1x, float v1y, float v1z, @MinLength(3) float[] v2, float tolerance)
	{
		float x = v2[0] - v1x;
		float y = v2[1] - v1y;
		float z = v2[2] - v1z;
		
		if(	Math.abs(x) <= tolerance &&
			Math.abs(y) <= tolerance &&
			Math.abs(z) <= tolerance) return 0.0f;

		return x * x + y * y + z * z;
	}
	
	/**
	 * Returns the squared distance between the given vector {@code (v1x, v1y, v1z)} and the given vector {@code (v2x, v2y, v2z)}.
	 * If the two vectors are equal the result will be zero.
	 * It determines an equality by checking if all components are equal within a margin of plus-minus the given tolerance inclusive {@code (-tolerance <= value <= tolerance)}
	 * around the component values.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(v2x, v2y, v2z) - (v1x, v1y, v1z)|^2}
	 * 
	 * @param v1x The value of the x component of the first vector.
	 * @param v1y The value of the y component of the first vector.
	 * @param v1z The value of the z component of the first vector.
	 * @param v2x The value of the x component of the second vector.
	 * @param v2y The value of the y component of the second vector.
	 * @param v2z The value of the z component of the second vector.
	 * @param tolerance The tolerance for defining the margin.
	 * 
	 * @return The distance between the vectors or zero if the two vectors are equal withing the tolerance.
	 */
	public static float squaredDistance(float v1x, float v1y, float v1z, float v2x, float v2y, float v2z, float tolerance)
	{
		float x = v2x - v1x;
		float y = v2y - v1y;
		float z = v2z - v1z;
		
		if(	Math.abs(x) <= tolerance &&
			Math.abs(y) <= tolerance &&
			Math.abs(z) <= tolerance) return 0.0f;

		return x * x + y * y + z * z;
	}
	
	/**
	 * Calculates the half vector from the given vector {@code (v1)} to the given vector {@code (v2)} and
	 * saves the result in the given result array.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the arrays
	 * have to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ( v2 - v1 ) / 2}
	 * 
	 * @param v1 The first vector.
	 * @param v2 The second vector.
	 * @param res The result array. Minimum legth: 3.
	 * 
	 * @return The result array with the result.
	 */
	public static float[] halfVector(Vec3fR v1, Vec3fR v2, @ExtractionParam @MinLength(3) float[] res)
	{
		res[0] = (v2.getX() - v1.getX()) * 0.5f;
		res[1] = (v2.getY() - v1.getY()) * 0.5f;
		res[2] = (v2.getZ() - v1.getZ()) * 0.5f;
		
		return res;
	}
	
	/**
	 * Calculates the half vector from the given vector {@code (v1)} to the given vector {@code (v2[0], v2[1], v2[2])} and
	 * saves the result in the given result array.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the arrays
	 * have to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ( (v2[0], v2[1], v2[2]) - v1 ) / 2}
	 * 
	 * @param v1 The first vector.
	 * @param v2 The second vector. Minimum legth: 3.
	 * @param res The result array. Minimum legth: 3.
	 * 
	 * @return The result array with the result.
	 */
	public static float[] halfVector(Vec3fR v1, @MinLength(3) float[] v2, @ExtractionParam @MinLength(3) float[] res)
	{
		res[0] = (v2[0] - v1.getX()) * 0.5f;
		res[1] = (v2[1] - v1.getY()) * 0.5f;
		res[2] = (v2[2] - v1.getZ()) * 0.5f;
		
		return res;
	}
	
	/**
	 * Calculates the half vector from the given vector {@code (v1)} to the given vector {@code (v2x, v2y, v2z)} and
	 * saves the result in the given result array.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the arrays
	 * have to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ( (v2x, v2y, v2z) - v1 ) / 2}
	 * 
	 * @param v1 The first vector.
	 * @param v2x The value of the x component of the second vector.
	 * @param v2y The value of the y component of the second vector.
	 * @param v2z The value of the z component of the second vector.
	 * @param res The result array. Minimum legth: 3.
	 * 
	 * @return The half vector.
	 */
	public static float[] halfVector(Vec3fR v1, float v2x, float v2y, float v2z, @ExtractionParam @MinLength(3) float[] res)
	{
		res[0] = (v2x - v1.getX()) * 0.5f;
		res[1] = (v2y - v1.getY()) * 0.5f;
		res[2] = (v2z - v1.getZ()) * 0.5f;
		
		return res;
	}
	
	/**
	 * Calculates the half vector from the given vector {@code (v1[0], v1[1], v1[2])} to the given vector {@code (v2)} and
	 * saves the result in the given result array.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the arrays
	 * have to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ( v2 - (v1[0], v1[1], v1[2]) ) / 2}
	 * 
	 * @param v1 The first vector. Minimum legth: 3.
	 * @param v2 The second vector.
	 * @param res The result array. Minimum legth: 3.
	 * 
	 * @return The result array with the result.
	 */
	public static float[] halfVector(@MinLength(3) float[] v1, Vec3fR v2, @ExtractionParam @MinLength(3) float[] res)
	{
		res[0] = (v2.getX() - v1[0]) * 0.5f;
		res[1] = (v2.getY() - v1[1]) * 0.5f;
		res[2] = (v2.getZ() - v1[2]) * 0.5f;
		
		return res;
	}
	
	/**
	 * Calculates the half vector from the given vector {@code (v1[0], v1[1], v1[2])} to the given vector {@code (v2[0], v2[1], v2[2])} and
	 * saves the result in the given result array.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the arrays
	 * have to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ( (v2[0], v2[1], v2[2]) - (v1[0], v1[1], v1[2]) ) / 2}
	 * 
	 * @param v1 The first vector. Minimum legth: 3.
	 * @param v2 The second vector. Minimum legth: 3.
	 * @param res The result array. Minimum legth: 3.
	 * 
	 * @return The result array with the result.
	 */
	public static float[] halfVector(@MinLength(3) float[] v1, @MinLength(3) float[] v2, @ExtractionParam @MinLength(3) float[] res)
	{
		res[0] = (v2[0] - v1[0]) * 0.5f;
		res[1] = (v2[1] - v1[1]) * 0.5f;
		res[2] = (v2[2] - v1[2]) * 0.5f;
		
		return res;
	}
	
	/**
	 * Calculates the half vector from the given vector {@code (v1[0], v1[1], v1[2])} to the given vector {@code (v2x, v2y, v2z)} and
	 * saves the result in the given result array.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the arrays
	 * have to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ( (v2x, v2y, v2z) - (v1[0], v1[1], v1[2]) ) / 2}
	 * 
	 * @param v1 The first vector. Minimum legth: 3.
	 * @param v2x The value of the x component of the second vector.
	 * @param v2y The value of the y component of the second vector.
	 * @param v2z The value of the z component of the second vector.
	 * @param res The result array. Minimum legth: 3.
	 * 
	 * @return The half vector.
	 */
	public static float[] halfVector(@MinLength(3) float[] v1, float v2x, float v2y, float v2z, @ExtractionParam @MinLength(3) float[] res)
	{
		res[0] = (v2x - v1[0]) * 0.5f;
		res[1] = (v2y - v1[1]) * 0.5f;
		res[2] = (v2z - v1[2]) * 0.5f;
		
		return res;
	}
	
	/**
	 * Calculates the half vector from the given vector {@code (v1x, v1y, v1z)} to the given vector {@code (v2)} and
	 * saves the result in the given result array.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the arrays
	 * have to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ( v2 - (v1x, v1y, v1z) ) / 2}
	 * 
	 * @param v1x The value of the x component of the first vector.
	 * @param v1y The value of the y component of the first vector.
	 * @param v1z The value of the z component of the first vector.
	 * @param v2 The second vector.
	 * @param res The result array. Minimum legth: 3.
	 * 
	 * @return The half vector.
	 */
	public static float[] halfVector(float v1x, float v1y, float v1z, Vec3fR v2, @ExtractionParam @MinLength(3) float[] res)
	{
		res[0] = (v2.getX() - v1x) * 0.5f;
		res[1] = (v2.getY() - v1y) * 0.5f;
		res[2] = (v2.getZ() - v1z) * 0.5f;
		
		return res;
	}
	
	/**
	 * Calculates the half vector from the given vector {@code (v1x, v1y, v1z)} to the given vector {@code (v2[0], v2[1], v2[2])} and
	 * saves the result in the given result array.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the arrays
	 * have to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ( (v2[0], v2[1], v2[2]) - (v1x, v1y, v1z) ) / 2}
	 * 
	 * @param v1x The value of the x component of the first vector.
	 * @param v1y The value of the y component of the first vector.
	 * @param v1z The value of the z component of the first vector.
	 * @param v2 The second vector. Minimum legth: 3.
	 * @param res The result array. Minimum legth: 3.
	 * 
	 * @return The half vector.
	 */
	public static float[] halfVector(float v1x, float v1y, float v1z, @MinLength(3) float[] v2, @ExtractionParam @MinLength(3) float[] res)
	{
		res[0] = (v2[0] - v1x) * 0.5f;
		res[1] = (v2[1] - v1y) * 0.5f;
		res[2] = (v2[2] - v1z) * 0.5f;
		
		return res;
	}
	
	/**
	 * Calculates the half vector from the given vector {@code (v1x, v1y, v1z)} to the given vector {@code (v2x, v2y, v2z)} and
	 * saves the result in the given result array.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ( (v2x, v2y, v2z) - (v1x, v1y, v1z) ) / 2}
	 * 
	 * @param v1x The value of the x component of the first vector.
	 * @param v1y The value of the y component of the first vector.
	 * @param v1z The value of the z component of the first vector.
	 * @param v2x The value of the x component of the first vector.
	 * @param v2y The value of the y component of the first vector.
	 * @param v2z The value of the z component of the first vector.
	 * @param res The result array. Minimum legth: 3.
	 * 
	 * @return The half vector.
	 */
	public static float[] halfVector(float v1x, float v1y, float v1z, float v2x, float v2y, float v2z, @ExtractionParam @MinLength(3) float[] res)
	{
		res[0] = (v2x - v1x) * 0.5f;
		res[1] = (v2y - v1y) * 0.5f;
		res[2] = (v2z - v1z) * 0.5f;
		
		return res;
	}
	
	/**
	 * Calculates the half vector from the given vector {@code (v1)} to the given vector {@code (v2)} and
	 * saves the result in the given result vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ( v2 - v1 ) / 2}
	 * 
	 * @param <T> The type of the result vector.
	 * 
	 * @param v1 The first vector.
	 * @param v2 The second vector.
	 * @param res The result vector.
	 * 
	 * @return The result vector with the result.
	 */
	public static <T extends Vec3fC> T halfVector(Vec3fR v1, Vec3fR v2, @ExtractionParam T res)
	{
		res.set((v2.getX() - v1.getX()) * 0.5f, (v2.getY() - v1.getY()) * 0.5f, (v2.getZ() - v1.getZ()) * 0.5f);
		
		return res;
	}
	
	/**
	 * Calculates the half vector from the given vector {@code (v1)} to the given vector {@code (v2[0], v2[1], v2[2])} and
	 * saves the result in the given result vector.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the arrays
	 * have to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ( (v2[0], v2[1], v2[2]) - v1 ) / 2}
	 * 
	 * @param <T> The type of the result vector.
	 * 
	 * @param v1 The first vector.
	 * @param v2 The second vector. Minimum legth: 3.
	 * @param res The result vector.
	 * 
	 * @return The result vector with the result.
	 */
	public static <T extends Vec3fC> T halfVector(Vec3fR v1, @MinLength(3) float[] v2, @ExtractionParam T res)
	{
		res.set((v2[0] - v1.getX()) * 0.5f, (v2[1] - v1.getY()) * 0.5f, (v2[2] - v1.getZ()) * 0.5f);
		
		return res;
	}
	
	/**
	 * Calculates the half vector from the given vector {@code (v1)} to the given vector {@code (v2x, v2y, v2z)} and
	 * saves the result in the given result vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ( (v2x, v2y, v2z) - v1 ) / 2}
	 * 
	 * @param <T> The type of the result vector.
	 * 
	 * @param v1 The first vector.
	 * @param v2x The value of the x component of the second vector.
	 * @param v2y The value of the y component of the second vector.
	 * @param v2z The value of the z component of the second vector.
	 * @param res The result vector.
	 * 
	 * @return The result vector with the result.
	 */
	public static <T extends Vec3fC> T halfVector(Vec3fR v1, float v2x, float v2y, float v2z, @ExtractionParam T res)
	{
		res.set((v2x - v1.getX()) * 0.5f, (v2y - v1.getY()) * 0.5f, (v2z - v1.getZ()) * 0.5f);
		
		return res;
	}
	
	/**
	 * Calculates the half vector from the given vector {@code (v1[0], v1[1], v1[2])} to the given vector {@code (v2)} and
	 * saves the result in the given result vector.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the arrays
	 * have to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ( v2 - (v1[0], v1[1], v1[2]) ) / 2}
	 * 
	 * @param <T> The type of the result vector.
	 * 
	 * @param v1 The first vector. Minimum legth: 3.
	 * @param v2 The second vector.
	 * @param res The result vector.
	 * 
	 * @return The result vector with the result.
	 */
	public static <T extends Vec3fC> T halfVector(@MinLength(3) float[] v1, Vec3fR v2, @ExtractionParam T res)
	{
		res.set((v2.getX() - v1[0]) * 0.5f, (v2.getY() - v1[1]) * 0.5f, (v2.getZ() - v1[2]) * 0.5f);
		
		return res;
	}
	
	/**
	 * Calculates the half vector from the given vector {@code (v1[0], v1[1], v1[2])} to the given vector {@code (v2[0], v2[1], v2[2])} and
	 * saves the result in the given result vector.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the arrays
	 * have to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ( (v2[0], v2[1], v2[2]) - (v1[0], v1[1], v1[2]) ) / 2}
	 * 
	 * @param <T> The type of the result vector.
	 * 
	 * @param v1 The first vector. Minimum legth: 3.
	 * @param v2 The second vector. Minimum legth: 3.
	 * @param res The result vector.
	 * 
	 * @return The result vector with the result.
	 */
	public static <T extends Vec3fC> T halfVector(@MinLength(3) float[] v1, @MinLength(3) float[] v2, @ExtractionParam T res)
	{
		res.set((v2[0] - v1[0]) * 0.5f, (v2[1] - v1[1]) * 0.5f, (v2[2] - v1[2]) * 0.5f);
		
		return res;
	}
	
	/**
	 * Calculates the half vector from the given vector {@code (v1[0], v1[1], v1[2])} to the given vector {@code (v2x, v2y, v2z)} and
	 * saves the result in the given result vector.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the arrays
	 * have to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ( (v2x, v2y, v2z) - (v1[0], v1[1], v1[2]) ) / 2}
	 * 
	 * @param <T> The type of the result vector.
	 * 
	 * @param v1 The first vector. Minimum legth: 3.
	 * @param v2x The value of the x component of the second vector.
	 * @param v2y The value of the y component of the second vector.
	 * @param v2z The value of the z component of the second vector.
	 * @param res The result vector.
	 * 
	 * @return The result vector with the result.
	 */
	public static <T extends Vec3fC> T halfVector(@MinLength(3) float[] v1, float v2x, float v2y, float v2z, @ExtractionParam T res)
	{
		res.set((v2x - v1[0]) * 0.5f, (v2y - v1[1]) * 0.5f, (v2z - v1[2]) * 0.5f);
		
		return res;
	}
	
	/**
	 * Calculates the half vector from the given vector {@code (v1x, v1y, v1z)} to the given vector {@code (v2)} and
	 * saves the result in the given result vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ( v2 - (v1x, v1y, v1z) ) / 2}
	 * 
	 * @param <T> The type of the result vector.
	 * 
	 * @param v1x The value of the x component of the first vector.
	 * @param v1y The value of the y component of the first vector.
	 * @param v1z The value of the z component of the first vector.
	 * @param v2 The second vector.
	 * @param res The result vector.
	 * 
	 * @return The result vector with the result.
	 */
	public static <T extends Vec3fC> T halfVector(float v1x, float v1y, float v1z, Vec3fR v2, @ExtractionParam T res)
	{
		res.set((v2.getX() - v1x) * 0.5f, (v2.getY() - v1y) * 0.5f, (v2.getZ() - v1z) * 0.5f);
		
		return res;
	}
	
	/**
	 * Calculates the half vector from the given vector {@code (v1x, v1y, v1z)} to the given vector {@code (v2[0], v2[1], v2[2])} and
	 * saves the result in the given result vector.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the arrays
	 * have to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ( (v2[0], v2[1], v2[2]) - (v1x, v1y, v1z) ) / 2}
	 * 
	 * @param <T> The type of the result vector.
	 * 
	 * @param v1x The value of the x component of the first vector.
	 * @param v1y The value of the y component of the first vector.
	 * @param v1z The value of the z component of the first vector.
	 * @param v2 The second vector. Minimum legth: 3.
	 * @param res The result vector.
	 * 
	 * @return The result vector with the result.
	 */
	public static <T extends Vec3fC> T halfVector(float v1x, float v1y, float v1z, @MinLength(3) float[] v2, @ExtractionParam T res)
	{
		res.set((v2[0] - v1x) * 0.5f, (v2[1] - v1y) * 0.5f, (v2[2] - v1z) * 0.5f);
		
		return res;
	}
	
	/**
	 * Calculates the half vector from the given vector {@code (v1x, v1y, v1z)} to the given vector {@code (v2x, v2y, v2z)} and
	 * saves the result in the given result vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ( (v2x, v2y, v2z) - (v1x, v1y, v1z) ) / 2}
	 * 
	 * @param <T> The type of the result vector.
	 * 
	 * @param v1x The value of the x component of the first vector.
	 * @param v1y The value of the y component of the first vector.
	 * @param v1z The value of the z component of the first vector.
	 * @param v2x The value of the x component of the first vector.
	 * @param v2y The value of the y component of the first vector.
	 * @param v2z The value of the z component of the first vector.
	 * @param res The result vector.
	 * 
	 * @return The result vector with the result.
	 */
	public static <T extends Vec3fC> T halfVector(float v1x, float v1y, float v1z, float v2x, float v2y, float v2z, @ExtractionParam T res)
	{
		res.set((v2x - v1x) * 0.5f, (v2y - v1y) * 0.5f, (v2z - v1z) * 0.5f);
		
		return res;
	}
	
	/**
	 * Calculates the point that lies in the middle of a vector spanning between the given vector {@code (v1)} and the given vector {@code (v2)}
	 * and saves the result in the given result array.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ( v1 + v2 ) / 2}
	 * 
	 * @param v1 The first vector.
	 * @param v2 The second vector.
	 * @param res The result array. Minimum legth: 3.
	 * 
	 * @return The result array with the result.
	 */
	public static float[] halfPoint(Vec3fR v1, Vec3fR v2, @ExtractionParam @MinLength(3) float[] res)
	{
		res[0] = (v2.getX() + v1.getX()) * 0.5f;
		res[1] = (v2.getY() + v1.getY()) * 0.5f;
		res[2] = (v2.getZ() + v1.getZ()) * 0.5f;
		
		return res;
	}
	
	/**
	 * Calculates the point that lies in the middle of a vector spanning between the given vector {@code (v1)} and the given vector {@code (v2[0], v2[1], v2[2])}
	 * and saves the result in the given result array.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ( v1 + (v2[0], v2[1], v2[2]) ) / 2}
	 * 
	 * @param v1 The first vector.
	 * @param v2 The second vector. Minimum legth: 3.
	 * @param res The result array. Minimum legth: 3.
	 * 
	 * @return The result array with the result.
	 */
	public static float[] halfPoint(Vec3fR v1, @MinLength(3) float[] v2, @ExtractionParam @MinLength(3) float[] res)
	{
		res[0] = (v2[0] + v1.getX()) * 0.5f;
		res[1] = (v2[1] + v1.getY()) * 0.5f;
		res[2] = (v2[2] + v1.getZ()) * 0.5f;
		
		return res;
	}
	
	/**
	 * Calculates the point that lies in the middle of a vector spanning between the given vector {@code (v1)} and the given vector {@code (v2x, v2y, v2z)}
	 * and saves the result in the given result array.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ( v1 + (v2x, v2y, v2z) ) / 2}
	 * 
	 * @param v1 The first vector.
	 * @param v2x The value of the x component of the second vector.
	 * @param v2y The value of the y component of the second vector.
	 * @param v2z The value of the z component of the second vector.
	 * @param res The result array. Minimum legth: 3.
	 * 
	 * @return The result array with the result.
	 */
	public static float[] halfPoint(Vec3fR v1, float v2x, float v2y, float v2z, @ExtractionParam @MinLength(3) float[] res)
	{
		res[0] = (v2x + v1.getX()) * 0.5f;
		res[1] = (v2y + v1.getY()) * 0.5f;
		res[2] = (v2z + v1.getZ()) * 0.5f;
		
		return res;
	}
	
	/**
	 * Calculates the point that lies in the middle of a vector spanning between the given vector {@code (v1[0], v1[1], v1[2])} and the given vector {@code (v2)}
	 * and saves the result in the given result array.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ( (v1[0], v1[1], v1[2]) + v2 ) / 2}
	 * 
	 * @param v1 The first vector. Minimum legth: 3.
	 * @param v2 The second vector.
	 * @param res The result array. Minimum legth: 3.
	 * 
	 * @return The result array with the result.
	 */
	public static float[] halfPoint(@MinLength(3) float[] v1, Vec3fR v2, @ExtractionParam @MinLength(3) float[] res)
	{
		res[0] = (v2.getX() + v1[0]) * 0.5f;
		res[1] = (v2.getY() + v1[1]) * 0.5f;
		res[2] = (v2.getZ() + v1[2]) * 0.5f;
		
		return res;
	}
	
	/**
	 * Calculates the point that lies in the middle of a vector spanning between the given vector {@code (v1[0], v1[1], v1[2])} and the given vector {@code (v2[0], v2[1], v2[2])}
	 * and saves the result in the given result array.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ( (v1[0], v1[1], v1[2]) + (v2[0], v2[1], v2[2]) ) / 2}
	 * 
	 * @param v1 The first vector. Minimum legth: 3.
	 * @param v2 The second vector. Minimum legth: 3.
	 * @param res The result array. Minimum legth: 3.
	 * 
	 * @return The result array with the result.
	 */
	public static float[] halfPoint(@MinLength(3) float[] v1, @MinLength(3) float[] v2, @ExtractionParam @MinLength(3) float[] res)
	{
		res[0] = (v2[0] + v1[0]) * 0.5f;
		res[1] = (v2[1] + v1[1]) * 0.5f;
		res[2] = (v2[2] + v1[2]) * 0.5f;
		
		return res;
	}
	
	/**
	 * Calculates the point that lies in the middle of a vector spanning between the given vector {@code (v1[0], v1[1], v1[2])} and the given vector {@code (v2x, v2y, v2z)}
	 * and saves the result in the given result array.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ( (v1[0], v1[1], v1[2]) + (v2x, v2y, v2z) ) / 2}
	 * 
	 * @param v1 The first vector. Minimum legth: 3.
	 * @param v2x The value of the x component of the second vector.
	 * @param v2y The value of the y component of the second vector.
	 * @param v2z The value of the z component of the second vector.
	 * @param res The result array. Minimum legth: 3.
	 * 
	 * @return The result array with the result.
	 */
	public static float[] halfPoint(@MinLength(3) float[] v1, float v2x, float v2y, float v2z, @ExtractionParam @MinLength(3) float[] res)
	{
		res[0] = (v2x + v1[0]) * 0.5f;
		res[1] = (v2y + v1[1]) * 0.5f;
		res[2] = (v2z + v1[2]) * 0.5f;
		
		return res;
	}
	
	/**
	 * Calculates the point that lies in the middle of a vector spanning between the given vector {@code (v1x, v1y, v1z)} and the given vector {@code (v2)}
	 * and saves the result in the given result array.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ( (v1x, v1y, v1z) + v2 ) / 2}
	 * 
	 * @param v1x The value of the x component of the first vector.
	 * @param v1y The value of the y component of the first vector.
	 * @param v1z The value of the z component of the first vector.
	 * @param v2 The second vector.
	 * @param res The result array. Minimum legth: 3.
	 * 
	 * @return The result array with the result.
	 */
	public static float[] halfPoint(float v1x, float v1y, float v1z, Vec3fR v2, @ExtractionParam @MinLength(3) float[] res)
	{
		res[0] = (v2.getX() + v1x) * 0.5f;
		res[1] = (v2.getY() + v1y) * 0.5f;
		res[2] = (v2.getZ() + v1z) * 0.5f;
		
		return res;
	}
	
	/**
	 * Calculates the point that lies in the middle of a vector spanning between the given vector {@code (v1x, v1y, v1z)} and the given vector {@code (v2[0], v2[1], v2[2])}
	 * and saves the result in the given result array.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ( (v1x, v1y, v1z) + (v2[0], v2[1], v2[2]) ) / 2}
	 * 
	 * @param v1x The value of the x component of the first vector.
	 * @param v1y The value of the y component of the first vector.
	 * @param v1z The value of the z component of the first vector.
	 * @param v2 The second vector. Minimum legth: 3.
	 * @param res The result array. Minimum legth: 3.
	 * 
	 * @return The result array with the result.
	 */
	public static float[] halfPoint(float v1x, float v1y, float v1z, @MinLength(3) float[] v2, @ExtractionParam @MinLength(3) float[] res)
	{
		res[0] = (v2[0] + v1x) * 0.5f;
		res[1] = (v2[1] + v1y) * 0.5f;
		res[2] = (v2[2] + v1z) * 0.5f;
		
		return res;
	}
	
	/**
	 * Calculates the point that lies in the middle of a vector spanning between the given vector {@code (v1x, v1y, v1z)} and the given vector {@code (v2x, v2y, v2z)}
	 * and saves the result in the given result array.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ( (v1x, v1y, v1z) + (v2x, v2y, v2z) ) / 2}
	 * 
	 * @param v1x The value of the x component of the first vector.
	 * @param v1y The value of the y component of the first vector.
	 * @param v1z The value of the z component of the first vector.
	 * @param v2x The value of the x component of the second vector.
	 * @param v2y The value of the y component of the second vector.
	 * @param v2z The value of the z component of the second vector.
	 * @param res The result array. Minimum legth: 3.
	 * 
	 * @return The result array with the result.
	 */
	public static float[] halfPoint(float v1x, float v1y, float v1z, float v2x, float v2y, float v2z, @ExtractionParam @MinLength(3) float[] res)
	{
		res[0] = (v2x + v1x) * 0.5f;
		res[1] = (v2y + v1y) * 0.5f;
		res[2] = (v2z + v1z) * 0.5f;
		
		return res;
	}
	
	/**
	 * Calculates the point that lies in the middle of a vector spanning between the given vector {@code (v1)} and the given vector {@code (v2)}
	 * and saves the result in the given result vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ( v1 + v2 ) / 2}
	 * 
	 * @param <T> The type of the result vector.
	 * 
	 * @param v1 The first vector.
	 * @param v2 The second vector.
	 * @param res The result vector.
	 * 
	 * @return The result vector with the result.
	 */
	public static <T extends Vec3fC> T halfPoint(Vec3fR v1, Vec3fR v2, @ExtractionParam T res)
	{
		res.set((v2.getX() + v1.getX()) * 0.5f, (v2.getY() + v1.getY()) * 0.5f, (v2.getZ() + v1.getZ()) * 0.5f);
		
		return res;
	}
	
	/**
	 * Calculates the point that lies in the middle of a vector spanning between the given vector {@code (v1)} and the given vector {@code (v2[0], v2[1], v2[2])}
	 * and saves the result in the given result vector.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ( v1 + (v2[0], v2[1], v2[2]) ) / 2}
	 * 
	 * @param <T> The type of the result vector.
	 * 
	 * @param v1 The first vector.
	 * @param v2 The second vector. Minimum legth: 3.
	 * @param res The result vector.
	 * 
	 * @return The result vector with the result.
	 */
	public static <T extends Vec3fC> T halfPoint(Vec3fR v1, @MinLength(3) float[] v2, @ExtractionParam T res)
	{
		res.set((v2[0] + v1.getX()) * 0.5f, (v2[1] + v1.getY()) * 0.5f, (v2[2] + v1.getZ()) * 0.5f);
		
		return res;
	}
	
	/**
	 * Calculates the point that lies in the middle of a vector spanning between the given vector {@code (v1)} and the given vector {@code (v2x, v2y, v2z)}
	 * and saves the result in the given result vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ( v1 + (v2x, v2y, v2z) ) / 2}
	 * 
	 * @param <T> The type of the result vector.
	 * 
	 * @param v1 The first vector.
	 * @param v2x The value of the x component of the second vector.
	 * @param v2y The value of the y component of the second vector.
	 * @param v2z The value of the z component of the second vector.
	 * @param res The result vector.
	 * 
	 * @return The result vector with the result.
	 */
	public static <T extends Vec3fC> T halfPoint(Vec3fR v1, float v2x, float v2y, float v2z, @ExtractionParam T res)
	{
		res.set((v2x + v1.getX()) * 0.5f, (v2y + v1.getY()) * 0.5f, (v2z + v1.getZ()) * 0.5f);
		
		return res;
	}
	
	/**
	 * Calculates the point that lies in the middle of a vector spanning between the given vector {@code (v1[0], v1[1], v1[2])} and the given vector {@code (v2)}
	 * and saves the result in the given result vector.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ( (v1[0], v1[1], v1[2]) + v2 ) / 2}
	 * 
	 * @param <T> The type of the result vector.
	 * 
	 * @param v1 The first vector. Minimum legth: 3.
	 * @param v2 The second vector.
	 * @param res The result vector.
	 * 
	 * @return The result vector with the result.
	 */
	public static <T extends Vec3fC> T halfPoint(@MinLength(3) float[] v1, Vec3fR v2, @ExtractionParam T res)
	{
		res.set((v2.getX() + v1[0]) * 0.5f, (v2.getY() + v1[1]) * 0.5f, (v2.getZ() + v1[2]) * 0.5f);
		
		return res;
	}
	
	/**
	 * Calculates the point that lies in the middle of a vector spanning between the given vector {@code (v1[0], v1[1], v1[2])} and the given vector {@code (v2[0], v2[1], v2[2])}
	 * and saves the result in the given result vector.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ( (v1[0], v1[1], v1[2]) + (v2[0], v2[1], v2[2]) ) / 2}
	 * 
	 * @param <T> The type of the result vector.
	 * 
	 * @param v1 The first vector. Minimum legth: 3.
	 * @param v2 The second vector. Minimum legth: 3.
	 * @param res The result vector.
	 * 
	 * @return The result vector with the result.
	 */
	public static <T extends Vec3fC> T halfPoint(@MinLength(3) float[] v1, @MinLength(3) float[] v2, @ExtractionParam T res)
	{
		res.set((v2[0] + v1[0]) * 0.5f, (v2[1] + v1[1]) * 0.5f, (v2[2] + v1[2]) * 0.5f);
		
		return res;
	}
	
	/**
	 * Calculates the point that lies in the middle of a vector spanning between the given vector {@code (v1[0], v1[1], v1[2])} and the given vector {@code (v2x, v2y, v2z)}
	 * and saves the result in the given result vector.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ( (v1[0], v1[1], v1[2]) + (v2x, v2y, v2z) ) / 2}
	 * 
	 * @param <T> The type of the result vector.
	 * 
	 * @param v1 The first vector. Minimum legth: 3.
	 * @param v2x The value of the x component of the second vector.
	 * @param v2y The value of the y component of the second vector.
	 * @param v2z The value of the z component of the second vector.
	 * @param res The result vector.
	 * 
	 * @return The result vector with the result.
	 */
	public static <T extends Vec3fC> T halfPoint(@MinLength(3) float[] v1, float v2x, float v2y, float v2z, @ExtractionParam T res)
	{
		res.set((v2x + v1[0]) * 0.5f, (v2y + v1[1]) * 0.5f, (v2z + v1[2]) * 0.5f);
		
		return res;
	}
	
	/**
	 * Calculates the point that lies in the middle of a vector spanning between the given vector {@code (v1x, v1y, v1z)} and the given vector {@code (v2)}
	 * and saves the result in the given result vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ( (v1x, v1y, v1z) + v2 ) / 2}
	 * 
	 * @param <T> The type of the result vector.
	 * 
	 * @param v1x The value of the x component of the first vector.
	 * @param v1y The value of the y component of the first vector.
	 * @param v1z The value of the z component of the first vector.
	 * @param v2 The second vector.
	 * @param res The result vector.
	 * 
	 * @return The result vector with the result.
	 */
	public static <T extends Vec3fC> T halfPoint(float v1x, float v1y, float v1z, Vec3fR v2, @ExtractionParam T res)
	{
		res.set((v2.getX() + v1x) * 0.5f, (v2.getY() + v1y) * 0.5f, (v2.getZ() + v1z) * 0.5f);
		
		return res;
	}
	
	/**
	 * Calculates the point that lies in the middle of a vector spanning between the given vector {@code (v1x, v1y, v1z)} and the given vector {@code (v2[0], v2[1], v2[2])}
	 * and saves the result in the given result vector.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ( (v1x, v1y, v1z) + (v2[0], v2[1], v2[2]) ) / 2}
	 * 
	 * @param <T> The type of the result vector.
	 * 
	 * @param v1x The value of the x component of the first vector.
	 * @param v1y The value of the y component of the first vector.
	 * @param v1z The value of the z component of the first vector.
	 * @param v2 The second vector. Minimum legth: 3.
	 * @param res The result vector.
	 * 
	 * @return The result vector with the result.
	 */
	public static <T extends Vec3fC> T halfPoint(float v1x, float v1y, float v1z, @MinLength(3) float[] v2, @ExtractionParam T res)
	{
		res.set((v2[0] + v1x) * 0.5f, (v2[1] + v1y) * 0.5f, (v2[2] + v1z) * 0.5f);
		
		return res;
	}
	
	/**
	 * Calculates the point that lies in the middle of a vector spanning between the given vector {@code (v1x, v1y, v1z)} and the given vector {@code (v2x, v2y, v2z)}
	 * and saves the result in the given result vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ( (v1x, v1y, v1z) + (v2x, v2y, v2z) ) / 2}
	 * 
	 * @param <T> The type of the result vector.
	 * 
	 * @param v1x The value of the x component of the first vector.
	 * @param v1y The value of the y component of the first vector.
	 * @param v1z The value of the z component of the first vector.
	 * @param v2x The value of the x component of the second vector.
	 * @param v2y The value of the y component of the second vector.
	 * @param v2z The value of the z component of the second vector.
	 * @param res The result vector.
	 * 
	 * @return The result vector with the result.
	 */
	public static <T extends Vec3fC> T halfPoint(float v1x, float v1y, float v1z, float v2x, float v2y, float v2z, @ExtractionParam T res)
	{
		res.set((v2x + v1x) * 0.5f, (v2y + v1y) * 0.5f, (v2z + v1z) * 0.5f);
		
		return res;
	}
	
	/**
	 * Calculates a vector consisting of the per component minimum between the given vector {@code (v1)} and the given vector {@code (v2)} and
	 * saves the result in the given result array.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code min( v1, v2 )}
	 * 
	 * @param v1 The first vector.
	 * @param v2 The second vector.
	 * @param res The result array. Minimum legth: 3.
	 * 
	 * @return The result array with the result.
	 */
	public static float[] minVector(Vec3fR v1, Vec3fR v2, @ExtractionParam @MinLength(3) float[] res)
	{
		res[0] = Math.min(v1.getX(), v2.getX());
		res[1] = Math.min(v1.getY(), v2.getY());
		res[2] = Math.min(v1.getZ(), v2.getZ());
		
		return res;
	}
	
	/**
	 * Calculates a vector consisting of the per component minimum between the given vector {@code (v1)} and the given vector {@code (v2[0], v2[1], v2[2])} and
	 * saves the result in the given result array.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code min( v1, (v2[0], v2[1], v2[2]) )}
	 * 
	 * @param v1 The first vector.
	 * @param v2 The second vector. Minimum legth: 3.
	 * @param res The result array. Minimum legth: 3.
	 * 
	 * @return The result array with the result.
	 */
	public static float[] minVector(Vec3fR v1, @MinLength(3) float[] v2, @ExtractionParam @MinLength(3) float[] res)
	{
		res[0] = Math.min(v1.getX(), v2[0]);
		res[1] = Math.min(v1.getY(), v2[1]);
		res[2] = Math.min(v1.getZ(), v2[2]);
		
		return res;
	}
	
	/**
	 * Calculates a vector consisting of the per component minimum between the given vector {@code (v1)} and the given vector {@code (v2x, v2y, v2z)} and
	 * saves the result in the given result array.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code min( v1, (v2x, v2y, v2z) )}
	 * 
	 * @param v1 The first vector.
	 * @param v2x The value of the x component of the second vector.
	 * @param v2y The value of the y component of the second vector.
	 * @param v2z The value of the z component of the second vector.
	 * @param res The result array. Minimum legth: 3.
	 * 
	 * @return The result array with the result.
	 */
	public static float[] minVector(Vec3fR v1, float v2x, float v2y, float v2z, @ExtractionParam @MinLength(3) float[] res)
	{
		res[0] = Math.min(v1.getX(), v2x);
		res[1] = Math.min(v1.getY(), v2y);
		res[2] = Math.min(v1.getZ(), v2z);
		
		return res;
	}
	
	/**
	 * Calculates a vector consisting of the per component minimum between the given vector {@code (v1[0], v1[1], v1[2])} and the given vector {@code (v2)} and
	 * saves the result in the given result array.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code min( (v1[0], v1[1], v1[2]), v2 )}
	 * 
	 * @param v1 The first vector. Minimum legth: 3.
	 * @param v2 The second vector.
	 * @param res The result array. Minimum legth: 3.
	 * 
	 * @return The result array with the result.
	 */
	public static float[] minVector(@MinLength(3) float[] v1, Vec3fR v2, @ExtractionParam @MinLength(3) float[] res)
	{
		res[0] = Math.min(v1[0], v2.getX());
		res[1] = Math.min(v1[1], v2.getY());
		res[2] = Math.min(v1[2], v2.getZ());
		
		return res;
	}
	
	/**
	 * Calculates a vector consisting of the per component minimum between the given vector {@code (v1[0], v1[1], v1[2])} and the given vector {@code (v2[0], v2[1], v2[2])} and
	 * saves the result in the given result array.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code min( (v1[0], v1[1], v1[2]), (v2[0], v2[1], v2[2]) )}
	 * 
	 * @param v1 The first vector. Minimum legth: 3.
	 * @param v2 The second vector. Minimum legth: 3.
	 * @param res The result array. Minimum legth: 3.
	 * 
	 * @return The result array with the result.
	 */
	public static float[] minVector(@MinLength(3) float[] v1, @MinLength(3) float[] v2, @ExtractionParam @MinLength(3) float[] res)
	{
		res[0] = Math.min(v1[0], v2[0]);
		res[1] = Math.min(v1[1], v2[1]);
		res[2] = Math.min(v1[2], v2[2]);
		
		return res;
	}
	
	/**
	 * Calculates a vector consisting of the per component minimum between the given vector {@code (v1[0], v1[1], v1[2])} and the given vector {@code (v2x, v2y, v2z)} and
	 * saves the result in the given result array.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code min( (v1[0], v1[1], v1[2]), (v2x, v2y, v2z) )}
	 * 
	 * @param v1 The first vector. Minimum legth: 3.
	 * @param v2x The value of the x component of the second vector.
	 * @param v2y The value of the y component of the second vector.
	 * @param v2z The value of the z component of the second vector.
	 * @param res The result array. Minimum legth: 3.
	 * 
	 * @return The result array with the result.
	 */
	public static float[] minVector(@MinLength(3) float[] v1, float v2x, float v2y, float v2z, @ExtractionParam @MinLength(3) float[] res)
	{
		res[0] = Math.min(v1[0], v2x);
		res[1] = Math.min(v1[1], v2y);
		res[2] = Math.min(v1[2], v2z);
		
		return res;
	}
	
	/**
	 * Calculates a vector consisting of the per component minimum between the given vector {@code (v1x, v1y, v1z)} and the given vector {@code (v2)} and
	 * saves the result in the given result array.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code min( (v1x, v1y, v1z), v2 )}
	 * 
	 * @param v1x The value of the x component of the first vector.
	 * @param v1y The value of the y component of the first vector.
	 * @param v1z The value of the z component of the first vector.
	 * @param v2 The second vector.
	 * @param res The result array. Minimum legth: 3.
	 * 
	 * @return The result array with the result.
	 */
	public static float[] minVector(float v1x, float v1y, float v1z, Vec3fR v2, @ExtractionParam @MinLength(3) float[] res)
	{
		res[0] = Math.min(v1x, v2.getX());
		res[1] = Math.min(v1y, v2.getY());
		res[2] = Math.min(v1z, v2.getZ());
		
		return res;
	}
	
	/**
	 * Calculates a vector consisting of the per component minimum between the given vector {@code (v1x, v1y, v1z)} and the given vector {@code (v2[0], v2[1], v2[2])} and
	 * saves the result in the given result array.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code min( (v1x, v1y, v1z), (v2[0], v2[1], v2[2]) )}
	 * 
	 * @param v1x The value of the x component of the first vector.
	 * @param v1y The value of the y component of the first vector.
	 * @param v1z The value of the z component of the first vector.
	 * @param v2 The second vector. Minimum legth: 3.
	 * @param res The result array. Minimum legth: 3.
	 * 
	 * @return The result array with the result.
	 */
	public static float[] minVector(float v1x, float v1y, float v1z, @MinLength(3) float[] v2, @ExtractionParam @MinLength(3) float[] res)
	{
		res[0] = Math.min(v1x, v2[0]);
		res[1] = Math.min(v1y, v2[1]);
		res[2] = Math.min(v1z, v2[2]);
		
		return res;
	}
	
	/**
	 * Calculates a vector consisting of the per component minimum between the given vector {@code (v1x, v1y, v1z)} and the given vector {@code (v2x, v2y, v2z)} and
	 * saves the result in the given result array.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code min( (v1x, v1y, v1z), (v2x, v2y, v2z) )}
	 * 
	 * @param v1x The value of the x component of the first vector.
	 * @param v1y The value of the y component of the first vector.
	 * @param v1z The value of the z component of the first vector.
	 * @param v2x The value of the x component of the second vector.
	 * @param v2y The value of the y component of the second vector.
	 * @param v2z The value of the z component of the second vector.
	 * @param res The result array. Minimum legth: 3.
	 * 
	 * @return The result array with the result.
	 */
	public static float[] minVector(float v1x, float v1y, float v1z, float v2x, float v2y, float v2z, @ExtractionParam @MinLength(3) float[] res)
	{
		res[0] = Math.min(v1x, v2x);
		res[1] = Math.min(v1y, v2y);
		res[2] = Math.min(v1z, v2z);
		
		return res;
	}
	
	/**
	 * Calculates a vector consisting of the per component minimum between the given vector {@code (v1)} and the given vector {@code (v2)} and
	 * saves the result in the given result vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code min( v1, v2 )}
	 * 
	 * @param <T> The type of the result vector.
	 * 
	 * @param v1 The first vector.
	 * @param v2 The second vector.
	 * @param res The result vector.
	 * 
	 * @return The result vector with the result.
	 */
	public static <T extends Vec3fC> T minVector(Vec3fR v1, Vec3fR v2, @ExtractionParam T res)
	{
		res.set(Math.min(v1.getX(), v2.getX()), Math.min(v1.getY(), v2.getY()), Math.min(v1.getZ(), v2.getZ()));
		
		return res;
	}
	
	/**
	 * Calculates a vector consisting of the per component minimum between the given vector {@code (v1)} and the given vector {@code (v2[0], v2[1], v2[2])} and
	 * saves the result in the given result vector.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code min( v1, (v2[0], v2[1], v2[2]) )}
	 * 
	 * @param <T> The type of the result vector.
	 * 
	 * @param v1 The first vector.
	 * @param v2 The second vector. Minimum legth: 3.
	 * @param res The result vector.
	 * 
	 * @return The result vector with the result.
	 */
	public static <T extends Vec3fC> T minVector(Vec3fR v1, @MinLength(3) float[] v2, @ExtractionParam T res)
	{
		res.set(Math.min(v1.getX(), v2[0]), Math.min(v1.getY(), v2[1]), Math.min(v1.getZ(), v2[2]));
		
		return res;
	}
	
	/**
	 * Calculates a vector consisting of the per component minimum between the given vector {@code (v1)} and the given vector {@code (v2x, v2y, v2z)} and
	 * saves the result in the given result vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code min( v1, (v2x, v2y, v2z) )}
	 * 
	 * @param <T> The type of the result vector.
	 * 
	 * @param v1 The first vector.
	 * @param v2x The value of the x component of the second vector.
	 * @param v2y The value of the y component of the second vector.
	 * @param v2z The value of the z component of the second vector.
	 * @param res The result vector.
	 * 
	 * @return The result vector with the result.
	 */
	public static <T extends Vec3fC> T minVector(Vec3fR v1, float v2x, float v2y, float v2z, @ExtractionParam T res)
	{
		res.set(Math.min(v1.getX(), v2x), Math.min(v1.getY(), v2y), Math.min(v1.getZ(), v2z));
		
		return res;
	}
	
	/**
	 * Calculates a vector consisting of the per component minimum between the given vector {@code (v1[0], v1[1], v1[2])} and the given vector {@code (v2)} and
	 * saves the result in the given result vector.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code min( (v1[0], v1[1], v1[2]), v2 )}
	 * 
	 * @param <T> The type of the result vector.
	 * 
	 * @param v1 The first vector. Minimum legth: 3.
	 * @param v2 The second vector.
	 * @param res The result vector.
	 * 
	 * @return The result vector with the result.
	 */
	public static <T extends Vec3fC> T minVector(@MinLength(3) float[] v1, Vec3fR v2, @ExtractionParam T res)
	{
		res.set(Math.min(v1[0], v2.getX()), Math.min(v1[1], v2.getY()), Math.min(v1[2], v2.getZ()));
		
		return res;
	}
	
	/**
	 * Calculates a vector consisting of the per component minimum between the given vector {@code (v1[0], v1[1], v1[2])} and the given vector {@code (v2[0], v2[1], v2[2])} and
	 * saves the result in the given result vector.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code min( (v1[0], v1[1], v1[2]), (v2[0], v2[1], v2[2]) )}
	 * 
	 * @param <T> The type of the result vector.
	 * 
	 * @param v1 The first vector. Minimum legth: 3.
	 * @param v2 The second vector. Minimum legth: 3.
	 * @param res The result vector.
	 * 
	 * @return The result vector with the result.
	 */
	public static <T extends Vec3fC> T minVector(@MinLength(3) float[] v1, @MinLength(3) float[] v2, @ExtractionParam T res)
	{
		res.set(Math.min(v1[0], v2[0]), Math.min(v1[1], v2[1]), Math.min(v1[2], v2[2]));
		
		return res;
	}
	
	/**
	 * Calculates a vector consisting of the per component minimum between the given vector {@code (v1[0], v1[1], v1[2])} and the given vector {@code (v2x, v2y, v2z)} and
	 * saves the result in the given result vector.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code min( (v1[0], v1[1], v1[2]), (v2x, v2y, v2z) )}
	 * 
	 * @param <T> The type of the result vector.
	 * 
	 * @param v1 The first vector. Minimum legth: 3.
	 * @param v2x The value of the x component of the second vector.
	 * @param v2y The value of the y component of the second vector.
	 * @param v2z The value of the z component of the second vector.
	 * @param res The result vector.
	 * 
	 * @return The result vector with the result.
	 */
	public static <T extends Vec3fC> T minVector(@MinLength(3) float[] v1, float v2x, float v2y, float v2z, @ExtractionParam T res)
	{
		res.set(Math.min(v1[0], v2x), Math.min(v1[1], v2y), Math.min(v1[2], v2z));
		
		return res;
	}
	
	/**
	 * Calculates a vector consisting of the per component minimum between the given vector {@code (v1x, v1y, v1z)} and the given vector {@code (v2)} and
	 * saves the result in the given result vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code min( (v1x, v1y, v1z), v2 )}
	 * 
	 * @param <T> The type of the result vector.
	 * 
	 * @param v1x The value of the x component of the first vector.
	 * @param v1y The value of the y component of the first vector.
	 * @param v1z The value of the z component of the first vector.
	 * @param v2 The second vector.
	 * @param res The result vector.
	 * 
	 * @return The result vector with the result.
	 */
	public static <T extends Vec3fC> T minVector(float v1x, float v1y, float v1z, Vec3fR v2, @ExtractionParam T res)
	{
		res.set(Math.min(v1x, v2.getX()), Math.min(v1y, v2.getY()), Math.min(v1z, v2.getZ()));
		
		return res;
	}
	
	/**
	 * Calculates a vector consisting of the per component minimum between the given vector {@code (v1x, v1y, v1z)} and the given vector {@code (v2[0], v2[1], v2[2])} and
	 * saves the result in the given result vector.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code min( (v1x, v1y, v1z), (v2[0], v2[1], v2[2]) )}
	 * 
	 * @param <T> The type of the result vector.
	 * 
	 * @param v1x The value of the x component of the first vector.
	 * @param v1y The value of the y component of the first vector.
	 * @param v1z The value of the z component of the first vector.
	 * @param v2 The second vector. Minimum legth: 3.
	 * @param res The result vector.
	 * 
	 * @return The result vector with the result.
	 */
	public static <T extends Vec3fC> T minVector(float v1x, float v1y, float v1z, @MinLength(3) float[] v2, @ExtractionParam T res)
	{
		res.set(Math.min(v1x, v2[0]), Math.min(v1y, v2[1]), Math.min(v1z, v2[2]));
		
		return res;
	}
	
	/**
	 * Calculates a vector consisting of the per component minimum between the given vector {@code (v1x, v1y, v1z)} and the given vector {@code (v2x, v2y, v2z)} and
	 * saves the result in the given result vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code min( (v1x, v1y, v1z), (v2x, v2y, v2z) )}
	 * 
	 * @param <T> The type of the result vector.
	 * 
	 * @param v1x The value of the x component of the first vector.
	 * @param v1y The value of the y component of the first vector.
	 * @param v1z The value of the z component of the first vector.
	 * @param v2x The value of the x component of the second vector.
	 * @param v2y The value of the y component of the second vector.
	 * @param v2z The value of the z component of the second vector.
	 * @param res The result vector.
	 * 
	 * @return The result vector with the result.
	 */
	public static <T extends Vec3fC> T minVector(float v1x, float v1y, float v1z, float v2x, float v2y, float v2z, @ExtractionParam T res)
	{
		res.set(Math.min(v1x, v2x), Math.min(v1y, v2y), Math.min(v1z, v2z));
		
		return res;
	}
	
	/**
	 * Calculates a vector consisting of the per component maximum between the given vector {@code (v1)} and the given vector {@code (v2)} and
	 * saves the result in the given result array.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code max( v1, v2 )}
	 * 
	 * @param v1 The first vector.
	 * @param v2 The second vector.
	 * @param res The result array. Minimum legth: 3.
	 * 
	 * @return The result array with the result.
	 */
	public static float[] maxVector(Vec3fR v1, Vec3fR v2, @ExtractionParam @MinLength(3) float[] res)
	{
		res[0] = Math.max(v1.getX(), v2.getX());
		res[1] = Math.max(v1.getY(), v2.getY());
		res[2] = Math.max(v1.getZ(), v2.getZ());
		
		return res;
	}
	
	/**
	 * Calculates a vector consisting of the per component maximum between the given vector {@code (v1)} and the given vector {@code (v2[0], v2[1], v2[2])} and
	 * saves the result in the given result array.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code max( v1, (v2[0], v2[1], v2[2]) )}
	 * 
	 * @param v1 The first vector.
	 * @param v2 The second vector. Minimum legth: 3.
	 * @param res The result array. Minimum legth: 3.
	 * 
	 * @return The result array with the result.
	 */
	public static float[] maxVector(Vec3fR v1, @MinLength(3) float[] v2, @ExtractionParam @MinLength(3) float[] res)
	{
		res[0] = Math.max(v1.getX(), v2[0]);
		res[1] = Math.max(v1.getY(), v2[1]);
		res[2] = Math.max(v1.getZ(), v2[2]);
		
		return res;
	}
	
	/**
	 * Calculates a vector consisting of the per component maximum between the given vector {@code (v1)} and the given vector {@code (v2x, v2y, v2z)} and
	 * saves the result in the given result array.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code max( v1, (v2x, v2y, v2z) )}
	 * 
	 * @param v1 The first vector.
	 * @param v2x The value of the x component of the second vector.
	 * @param v2y The value of the y component of the second vector.
	 * @param v2z The value of the z component of the second vector.
	 * @param res The result array. Minimum legth: 3.
	 * 
	 * @return The result array with the result.
	 */
	public static float[] maxVector(Vec3fR v1, float v2x, float v2y, float v2z, @ExtractionParam @MinLength(3) float[] res)
	{
		res[0] = Math.max(v1.getX(), v2x);
		res[1] = Math.max(v1.getY(), v2y);
		res[2] = Math.max(v1.getZ(), v2z);
		
		return res;
	}
	
	/**
	 * Calculates a vector consisting of the per component maximum between the given vector {@code (v1[0], v1[1], v1[2])} and the given vector {@code (v2)} and
	 * saves the result in the given result array.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code max( (v1[0], v1[1], v1[2]), v2 )}
	 * 
	 * @param v1 The first vector. Minimum legth: 3.
	 * @param v2 The second vector.
	 * @param res The result array. Minimum legth: 3.
	 * 
	 * @return The result array with the result.
	 */
	public static float[] maxVector(@MinLength(3) float[] v1, Vec3fR v2, @ExtractionParam @MinLength(3) float[] res)
	{
		res[0] = Math.max(v1[0], v2.getX());
		res[1] = Math.max(v1[1], v2.getY());
		res[2] = Math.max(v1[2], v2.getZ());
		
		return res;
	}
	
	/**
	 * Calculates a vector consisting of the per component maximum between the given vector {@code (v1[0], v1[1], v1[2])} and the given vector {@code (v2[0], v2[1], v2[2])} and
	 * saves the result in the given result array.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code max( (v1[0], v1[1], v1[2]), (v2[0], v2[1], v2[2]) )}
	 * 
	 * @param v1 The first vector. Minimum legth: 3.
	 * @param v2 The second vector. Minimum legth: 3.
	 * @param res The result array. Minimum legth: 3.
	 * 
	 * @return The result array with the result.
	 */
	public static float[] maxVector(@MinLength(3) float[] v1, @MinLength(3) float[] v2, @ExtractionParam @MinLength(3) float[] res)
	{
		res[0] = Math.max(v1[0], v2[0]);
		res[1] = Math.max(v1[1], v2[1]);
		res[2] = Math.max(v1[2], v2[2]);
		
		return res;
	}
	
	/**
	 * Calculates a vector consisting of the per component maximum between the given vector {@code (v1[0], v1[1], v1[2])} and the given vector {@code (v2x, v2y, v2z)} and
	 * saves the result in the given result array.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code max( (v1[0], v1[1], v1[2]), (v2x, v2y, v2z) )}
	 * 
	 * @param v1 The first vector. Minimum legth: 3.
	 * @param v2x The value of the x component of the second vector.
	 * @param v2y The value of the y component of the second vector.
	 * @param v2z The value of the z component of the second vector.
	 * @param res The result array. Minimum legth: 3.
	 * 
	 * @return The result array with the result.
	 */
	public static float[] maxVector(@MinLength(3) float[] v1, float v2x, float v2y, float v2z, @ExtractionParam @MinLength(3) float[] res)
	{
		res[0] = Math.max(v1[0], v2x);
		res[1] = Math.max(v1[1], v2y);
		res[2] = Math.max(v1[2], v2z);
		
		return res;
	}
	
	/**
	 * Calculates a vector consisting of the per component maximum between the given vector {@code (v1x, v1y, v1z)} and the given vector {@code (v2)} and
	 * saves the result in the given result array.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code max( (v1x, v1y, v1z), v2 )}
	 * 
	 * @param v1x The value of the x component of the first vector.
	 * @param v1y The value of the y component of the first vector.
	 * @param v1z The value of the z component of the first vector.
	 * @param v2 The second vector.
	 * @param res The result array. Minimum legth: 3.
	 * 
	 * @return The result array with the result.
	 */
	public static float[] maxVector(float v1x, float v1y, float v1z, Vec3fR v2, @ExtractionParam @MinLength(3) float[] res)
	{
		res[0] = Math.max(v1x, v2.getX());
		res[1] = Math.max(v1y, v2.getY());
		res[2] = Math.max(v1z, v2.getZ());
		
		return res;
	}
	
	/**
	 * Calculates a vector consisting of the per component maximum between the given vector {@code (v1x, v1y, v1z)} and the given vector {@code (v2[0], v2[1], v2[2])} and
	 * saves the result in the given result array.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code max( (v1x, v1y, v1z), (v2[0], v2[1], v2[2]) )}
	 * 
	 * @param v1x The value of the x component of the first vector.
	 * @param v1y The value of the y component of the first vector.
	 * @param v1z The value of the z component of the first vector.
	 * @param v2 The second vector. Minimum legth: 3.
	 * @param res The result array. Minimum legth: 3.
	 * 
	 * @return The result array with the result.
	 */
	public static float[] maxVector(float v1x, float v1y, float v1z, @MinLength(3) float[] v2, @ExtractionParam @MinLength(3) float[] res)
	{
		res[0] = Math.max(v1x, v2[0]);
		res[1] = Math.max(v1y, v2[1]);
		res[2] = Math.max(v1z, v2[2]);
		
		return res;
	}
	
	/**
	 * Calculates a vector consisting of the per component maximum between the given vector {@code (v1x, v1y, v1z)} and the given vector {@code (v2x, v2y, v2z)} and
	 * saves the result in the given result array.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code max( (v1x, v1y, v1z), (v2x, v2y, v2z) )}
	 * 
	 * @param v1x The value of the x component of the first vector.
	 * @param v1y The value of the y component of the first vector.
	 * @param v1z The value of the z component of the first vector.
	 * @param v2x The value of the x component of the second vector.
	 * @param v2y The value of the y component of the second vector.
	 * @param v2z The value of the z component of the second vector.
	 * @param res The result array. Minimum legth: 3.
	 * 
	 * @return The result array with the result.
	 */
	public static float[] maxVector(float v1x, float v1y, float v1z, float v2x, float v2y, float v2z, @ExtractionParam @MinLength(3) float[] res)
	{
		res[0] = Math.max(v1x, v2x);
		res[1] = Math.max(v1y, v2y);
		res[2] = Math.max(v1z, v2z);
		
		return res;
	}
	
	/**
	 * Calculates a vector consisting of the per component maximum between the given vector {@code (v1)} and the given vector {@code (v2)} and
	 * saves the result in the given result vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code max( v1, v2 )}
	 * 
	 * @param <T> The type of the result vector.
	 * 
	 * @param v1 The first vector.
	 * @param v2 The second vector.
	 * @param res The result vector.
	 * 
	 * @return The result vector with the result.
	 */
	public static <T extends Vec3fC> T maxVector(Vec3fR v1, Vec3fR v2, @ExtractionParam T res)
	{
		res.set(Math.max(v1.getX(), v2.getX()), Math.max(v1.getY(), v2.getY()), Math.max(v1.getZ(), v2.getZ()));
		
		return res;
	}
	
	/**
	 * Calculates a vector consisting of the per component maximum between the given vector {@code (v1)} and the given vector {@code (v2[0], v2[1], v2[2])} and
	 * saves the result in the given result vector.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code max( v1, (v2[0], v2[1], v2[2]) )}
	 * 
	 * @param <T> The type of the result vector.
	 * 
	 * @param v1 The first vector.
	 * @param v2 The second vector. Minimum legth: 3.
	 * @param res The result vector.
	 * 
	 * @return The result vector with the result.
	 */
	public static <T extends Vec3fC> T maxVector(Vec3fR v1, @MinLength(3) float[] v2, @ExtractionParam T res)
	{
		res.set(Math.max(v1.getX(), v2[0]), Math.max(v1.getY(), v2[1]), Math.max(v1.getZ(), v2[2]));
		
		return res;
	}
	
	/**
	 * Calculates a vector consisting of the per component maximum between the given vector {@code (v1)} and the given vector {@code (v2x, v2y, v2z)} and
	 * saves the result in the given result vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code max( v1, (v2x, v2y, v2z) )}
	 * 
	 * @param <T> The type of the result vector.
	 * 
	 * @param v1 The first vector.
	 * @param v2x The value of the x component of the second vector.
	 * @param v2y The value of the y component of the second vector.
	 * @param v2z The value of the z component of the second vector.
	 * @param res The result vector.
	 * 
	 * @return The result vector with the result.
	 */
	public static <T extends Vec3fC> T maxVector(Vec3fR v1, float v2x, float v2y, float v2z, @ExtractionParam T res)
	{
		res.set(Math.max(v1.getX(), v2x), Math.max(v1.getY(), v2y), Math.max(v1.getZ(), v2z));
		
		return res;
	}
	
	/**
	 * Calculates a vector consisting of the per component maximum between the given vector {@code (v1[0], v1[1], v1[2])} and the given vector {@code (v2)} and
	 * saves the result in the given result vector.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code max( (v1[0], v1[1], v1[2]), v2 )}
	 * 
	 * @param <T> The type of the result vector.
	 * 
	 * @param v1 The first vector. Minimum legth: 3.
	 * @param v2 The second vector.
	 * @param res The result vector.
	 * 
	 * @return The result vector with the result.
	 */
	public static <T extends Vec3fC> T maxVector(@MinLength(3) float[] v1, Vec3fR v2, @ExtractionParam T res)
	{
		res.set(Math.max(v1[0], v2.getX()), Math.max(v1[1], v2.getY()), Math.max(v1[2], v2.getZ()));
		
		return res;
	}
	
	/**
	 * Calculates a vector consisting of the per component maximum between the given vector {@code (v1[0], v1[1], v1[2])} and the given vector {@code (v2[0], v2[1], v2[2])} and
	 * saves the result in the given result vector.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code max( (v1[0], v1[1], v1[2]), (v2[0], v2[1], v2[2]) )}
	 * 
	 * @param <T> The type of the result vector.
	 * 
	 * @param v1 The first vector. Minimum legth: 3.
	 * @param v2 The second vector. Minimum legth: 3.
	 * @param res The result vector.
	 * 
	 * @return The result vector with the result.
	 */
	public static <T extends Vec3fC> T maxVector(@MinLength(3) float[] v1, @MinLength(3) float[] v2, @ExtractionParam T res)
	{
		res.set(Math.max(v1[0], v2[0]), Math.max(v1[1], v2[1]), Math.max(v1[2], v2[2]));
		
		return res;
	}
	
	/**
	 * Calculates a vector consisting of the per component maximum between the given vector {@code (v1[0], v1[1], v1[2])} and the given vector {@code (v2x, v2y, v2z)} and
	 * saves the result in the given result vector.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code max( (v1[0], v1[1], v1[2]), (v2x, v2y, v2z) )}
	 * 
	 * @param <T> The type of the result vector.
	 * 
	 * @param v1 The first vector. Minimum legth: 3.
	 * @param v2x The value of the x component of the second vector.
	 * @param v2y The value of the y component of the second vector.
	 * @param v2z The value of the z component of the second vector.
	 * @param res The result vector.
	 * 
	 * @return The result vector with the result.
	 */
	public static <T extends Vec3fC> T maxVector(@MinLength(3) float[] v1, float v2x, float v2y, float v2z, @ExtractionParam T res)
	{
		res.set(Math.max(v1[0], v2x), Math.max(v1[1], v2y), Math.max(v1[2], v2z));
		
		return res;
	}
	
	/**
	 * Calculates a vector consisting of the per component maximum between the given vector {@code (v1x, v1y, v1z)} and the given vector {@code (v2)} and
	 * saves the result in the given result vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code max( (v1x, v1y, v1z), v2 )}
	 * 
	 * @param <T> The type of the result vector.
	 * 
	 * @param v1x The value of the x component of the first vector.
	 * @param v1y The value of the y component of the first vector.
	 * @param v1z The value of the z component of the first vector.
	 * @param v2 The second vector.
	 * @param res The result vector.
	 * 
	 * @return The result vector with the result.
	 */
	public static <T extends Vec3fC> T maxVector(float v1x, float v1y, float v1z, Vec3fR v2, @ExtractionParam T res)
	{
		res.set(Math.max(v1x, v2.getX()), Math.max(v1y, v2.getY()), Math.max(v1z, v2.getZ()));
		
		return res;
	}
	
	/**
	 * Calculates a vector consisting of the per component maximum between the given vector {@code (v1x, v1y, v1z)} and the given vector {@code (v2[0], v2[1], v2[2])} and
	 * saves the result in the given result vector.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code max( (v1x, v1y, v1z), (v2[0], v2[1], v2[2]) )}
	 * 
	 * @param <T> The type of the result vector.
	 * 
	 * @param v1x The value of the x component of the first vector.
	 * @param v1y The value of the y component of the first vector.
	 * @param v1z The value of the z component of the first vector.
	 * @param v2 The second vector. Minimum legth: 3.
	 * @param res The result vector.
	 * 
	 * @return The result vector with the result.
	 */
	public static <T extends Vec3fC> T maxVector(float v1x, float v1y, float v1z, @MinLength(3) float[] v2, @ExtractionParam T res)
	{
		res.set(Math.max(v1x, v2[0]), Math.max(v1y, v2[1]), Math.max(v1z, v2[2]));
		
		return res;
	}
	
	/**
	 * Calculates a vector consisting of the per component maximum between the given vector {@code (v1x, v1y, v1z)} and the given vector {@code (v2x, v2y, v2z)} and
	 * saves the result in the given result vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code max( (v1x, v1y, v1z), (v2x, v2y, v2z) )}
	 * 
	 * @param <T> The type of the result vector.
	 * 
	 * @param v1x The value of the x component of the first vector.
	 * @param v1y The value of the y component of the first vector.
	 * @param v1z The value of the z component of the first vector.
	 * @param v2x The value of the x component of the second vector.
	 * @param v2y The value of the y component of the second vector.
	 * @param v2z The value of the z component of the second vector.
	 * @param res The result vector.
	 * 
	 * @return The result vector with the result.
	 */
	public static <T extends Vec3fC> T maxVector(float v1x, float v1y, float v1z, float v2x, float v2y, float v2z, @ExtractionParam T res)
	{
		res.set(Math.max(v1x, v2x), Math.max(v1y, v2y), Math.max(v1z, v2z));
		
		return res;
	}
	
	/**
	 * Determines the smallest value of the components of the vector {@code (v)}
	 * and returns the value and the index of the component by the result array.
	 * The index returned is limited to the range of 0 to 2.
	 * If two or more components have the same value the first index will be returned.
	 * The index is returned at the index 0 and the value is returned at the index 1 of the result array.
	 * 
	 * @param v The vector.
	 * @param res The result array. Minimum legth: 2.
	 * 
	 * @return The result array with the result.
	 */
	public static float[] min(Vec3fR v, @ExtractionParam @MinLength(2) float[] res)
	{
		float y = v.getY();
		float z = v.getZ();
		
		float value = v.getX();
		int index = 0;
		
		if(y < value)
		{
			value = y;
			index = 1;
		}
		
		if(z < value)
		{
			value = z;
			index = 2;
		}
		
		res[0] = index;
		res[1] = value;
		
		return res;
	}
	
	/**
	 * Determines the smallest value of the components of the vector {@code (v[0], v[1], v[2])}
	 * and returns the value and the index of the component by the result array.
	 * The index returned is limited to the range of 0 to 2.
	 * If two or more components have the same value the first index will be returned.
	 * The index is returned at the index 0 and the value is returned at the index 1 of the result array.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * @param v The vector. Minimum legth: 3.
	 * @param res The result array. Minimum legth: 2.
	 * 
	 * @return The result array with the result.
	 */
	public static float[] min(@MinLength(3) float[] v, @ExtractionParam @MinLength(2) float[] res)
	{
		float value = v[0];
		int index = 0;
		
		if(v[1] < value)
		{
			value = v[1];
			index = 1;
		}
		
		if(v[2] < value)
		{
			value = v[2];
			index = 2;
		}
		
		res[0] = index;
		res[1] = value;
		
		return res;
	}
	
	/**
	 * Determines the smallest value of the components of the vector {@code (x, y, z)}
	 * and returns the value and the index of the component by the result array.
	 * The index returned is limited to the range of 0 to 2.
	 * If two or more components have the same value the first index will be returned.
	 * The index is returned at the index 0 and the value is returned at the index 1 of the result array.
	 * 
	 * @param x The value of the x component of the vector.
	 * @param y The value of the y component of the vector.
	 * @param z The value of the z component of the vector.
	 * @param res The result array. Minimum legth: 2.
	 * 
	 * @return The result array with the result.
	 */
	public static float[] min(float x, float y, float z, @ExtractionParam @MinLength(2) float[] res)
	{
		float value = x;
		int index = 0;
		
		if(y < value)
		{
			value = y;
			index = 1;
		}
		
		if(z < value)
		{
			value = z;
			index = 2;
		}
		
		res[0] = index;
		res[1] = value;
		
		return res;
	}
	
	/**
	 * Determines the smallest value of the components of the vector {@code (v)}
	 * and returns the value and the index of the component by the result tuple.
	 * The index returned is limited to the range of 0 to 2.
	 * If two or more components have the same value the first index will be returned.
	 * The value is returned as first value and the index as second value.
	 * 
	 * @param v The vector.
	 * @param res The result object.
	 * 
	 * @return The result tuple with the result.
	 */
	public static ComponentValueFloat min(Vec3fR v, @ExtractionParam ComponentValueFloat res)
	{
		float y = v.getY();
		float z = v.getZ();
		
		float value = v.getX();
		int index = 0;
		
		if(y < value)
		{
			value = y;
			index = 1;
		}
		
		if(z < value)
		{
			value = z;
			index = 2;
		}
		
		res.set(index, value);
		
		return res;
	}
	
	/**
	 * Determines the smallest value of the components of the vector {@code (v[0], v[1], v[2])}
	 * and returns the value and the index of the component by the result tuple.
	 * The index returned is limited to the range of 0 to 2.
	 * If two or more components have the same value the first index will be returned.
	 * The value is returned as first value and the index as second value.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * @param v The vector. Minimum legth: 3.
	 * @param res The result object.
	 * 
	 * @return The result tuple with the result.
	 */
	public static ComponentValueFloat min(@MinLength(3) float[] v, @ExtractionParam ComponentValueFloat res)
	{
		float value = v[0];
		int index = 0;
		
		if(v[1] < value)
		{
			value = v[1];
			index = 1;
		}
		
		if(v[2] < value)
		{
			value = v[2];
			index = 2;
		}

		res.set(index, value);
		
		return res;
	}
	
	/**
	 * Determines the smallest value of the components of the vector {@code (x, y, z)}
	 * and returns the value and the index of the component by the result tuple.
	 * The index returned is limited to the range of 0 to 2.
	 * If two or more components have the same value the first index will be returned.
	 * The value is returned as first value and the index as second value.
	 * 
	 * @param x The value of the x component of the vector.
	 * @param y The value of the y component of the vector.
	 * @param z The value of the z component of the vector.
	 * @param res The result object.
	 * 
	 * @return The result tuple with the result.
	 */
	public static ComponentValueFloat min(float x, float y, float z, @ExtractionParam ComponentValueFloat res)
	{
		float value = x;
		int index = 0;
		
		if(y < value)
		{
			value = y;
			index = 1;
		}
		
		if(z < value)
		{
			value = z;
			index = 2;
		}

		res.set(index, value);
		
		return res;
	}
	
	/**
	 * Determines the smallest value of the components of the vector {@code (v)} and returns it.
	 * 
	 * @param v The vector.
	 * 
	 * @return The smallest value of the components.
	 */
	public static float minValue(Vec3fR v)
	{
		return BarghosMath.min(v.getX(), v.getY(), v.getZ());
	}
	
	/**
	 * Determines the smallest value of the components of the vector {@code (v[0], v[1], v[2])} and returns it.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * @param v The vector. Minimum legth: 3.
	 * 
	 * @return The smallest value of the components.
	 */
	public static float minValue(@MinLength(3) float[] v)
	{
		return BarghosMath.min(v[0], v[1], v[2]);
	}
	
	/**
	 * Determines the smallest value of the components of the vector {@code (x, y, z)} and returns it.
	 * 
	 * @param x The value of the x component of the vector.
	 * @param y The value of the y component of the vector.
	 * @param z The value of the z component of the vector.
	 * 
	 * @return The smallest value of the components.
	 */
	public static float minValue(float x, float y, float z)
	{
		return BarghosMath.min(x, y, z);
	}
	
	/**
	 * Determines the smallest value of the components of the array {@code (v)} and returns the index of the component.
	 * The index returned is limited to the range of 0 to 2.
	 * If two or more components have the same value the first index will be returned.
	 * 
	 * @param v The vector.
	 * 
	 * @return The index of the smallest component.
	 */
	public static int minComponent(Vec3fR v)
	{
		float y = v.getY();
		float z = v.getZ();
		
		float value = v.getX();
		int index = 0;
		
		if(y < value)
		{
			value = y;
			index = 1;
		}
		
		if(z < value)
		{
			value = z;
			index = 2;
		}
		
		return index;
	}
	
	/**
	 * Determines the smallest value of the components of the array {@code (v[0], v[1], v[2])} and returns the index of the component.
	 * The index returned is limited to the range of 0 to 2.
	 * If two or more components have the same value the first index will be returned.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * @param v The vector. Minimum legth: 3.
	 * 
	 * @return The index of the smallest component.
	 */
	public static int minComponent(@MinLength(3) float[] v)
	{
		float value = v[0];
		int index = 0;
		
		if(v[1] < value)
		{
			value = v[1];
			index = 1;
		}
		
		if(v[2] < value)
		{
			value = v[2];
			index = 2;
		}
		
		return index;
	}
	
	/**
	 * Determines the smallest value of the components of the vector {@code (x, y, z)} and returns the index of the component.
	 * The index returned is limited to the range of 0 to 2.
	 * If two or more components have the same value the first index will be returned.
	 * 
	 * @param x The value of the x component of the vector.
	 * @param y The value of the y component of the vector.
	 * @param z The value of the z component of the vector.
	 * 
	 * @return The index of the smallest component.
	 */
	public static int minComponent(float x, float y, float z)
	{
		float value = x;
		int index = 0;
		
		if(y < value)
		{
			value = y;
			index = 1;
		}
		
		if(z < value)
		{
			value = z;
			index = 2;
		}
		
		return index;
	}
	
	/**
	 * Determines the greatest value of the components of the vector {@code (v)}
	 * and returns the value and the index of the component by the result array.
	 * The index returned is limited to the range of 0 to 2.
	 * If two or more components have the same value the first index will be returned.
	 * The index is returned at the index 0 and the value is returned at the index 1 of the result array.
	 * 
	 * @param v The vector.
	 * @param res The result array. Minimum legth: 2.
	 * 
	 * @return The result array with the result
	 */
	public static float[] max(Vec3fR v, @ExtractionParam @MinLength(2) float[] res)
	{
		maxInternal(v.getX(), v.getY(), v.getZ(), res);
		
		return res;
	}
	
	/**
	 * Determines the greatest value of the components of the vector {@code (v[0], v[1], v[2])}
	 * and returns the value and the index of the component by the result array.
	 * The index returned is limited to the range of 0 to 2.
	 * If two or more components have the same value the first index will be returned.
	 * The index is returned at the index 0 and the value is returned at the index 1 of the result array.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * @param v The vector. Minimum legth: 3.
	 * @param res The result array. Minimum legth: 2.
	 * 
	 * @return The result array with the result
	 */
	public static float[] max(@MinLength(3) float[] v, @ExtractionParam @MinLength(2) float[] res)
	{
		maxInternal(v[0], v[1], v[2], res);
		
		return res;
	}
	
	/**
	 * Determines the greatest value of the components of the vector {@code (x, y, z)}
	 * and returns the value and the index of the component by the result array.
	 * The index returned is limited to the range of 0 to 2.
	 * If two or more components have the same value the first index will be returned.
	 * The index is returned at the index 0 and the value is returned at the index 1 of the result array.
	 * 
	 * @param x The value of the x component of the vector.
	 * @param y The value of the y component of the vector.
	 * @param z The value of the z component of the vector.
	 * @param res The result array. Minimum legth: 2.
	 * 
	 * @return The result array with the result
	 */
	public static float[] max(float x, float y, float z, @ExtractionParam @MinLength(2) float[] res)
	{
		maxInternal(x, y, z, res);
		
		return res;
	}
	
	/**
	 * Only for better maintainability.
	 * 
	 * <p>
	 * Determines the greatest value of the components of the vector {@code (x, y, z)}
	 * and returns the value and the index of the component by the result array.
	 * The index returned is limited to the range of 0 to 2.
	 * If two or more components have the same value the first index will be returned.
	 * The index is returned at the index 0 and the value is returned at the index 1 of the result array.
	 * 
	 * @param x The value of the x component of the vector.
	 * @param y The value of the y component of the vector.
	 * @param z The value of the z component of the vector.
	 * @param res The result array. Minimum legth: 2.
	 */
	@InlineOnly
	private static void maxInternal(float x, float y, float z, @ExtractionParam @MinLength(2) float[] res)
	{
		float value = x;
		int index = 0;
		
		if(y > value)
		{
			value = y;
			index = 1;
		}
		
		if(z > value)
		{
			value = z;
			index = 2;
		}
		
		res[0] = index;
		res[1] = value;
	}
	
	/**
	 * Determines the greatest value of the components of the vector {@code (v)}
	 * and returns the value and the index of the component by the result tuple.
	 * The index returned is limited to the range of 0 to 2.
	 * If two or more components have the same value the first index will be returned.
	 * The value is returned as first value and the index as second value.
	 * 
	 * @param v The vector.
	 * @param res The result object.
	 * 
	 * @return The result tuple with the result.
	 */
	public static ComponentValueFloat max(Vec3fR v, @ExtractionParam ComponentValueFloat res)
	{
		maxInternal(v.getX(), v.getY(), v.getZ(), res);
		
		return res;
	}
	
	/**
	 * Determines the greatest value of the components of the vector {@code (v[0], v[1], v[2])}
	 * and returns the value and the index of the component by the result tuple.
	 * The index returned is limited to the range of 0 to 2.
	 * If two or more components have the same value the first index will be returned.
	 * The value is returned as first value and the index as second value.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * @param v The vector. Minimum legth: 3.
	 * @param res The result object.
	 * 
	 * @return The result tuple with the result.
	 */
	public static ComponentValueFloat max(@MinLength(3) float[] v, @ExtractionParam ComponentValueFloat res)
	{
		maxInternal(v[0], v[1], v[2], res);
		
		return res;
	}
	
	/**
	 * Determines the greatest value of the components of the vector {@code (x, y, z)}
	 * and returns the value and the index of the component by the result tuple.
	 * The index returned is limited to the range of 0 to 2.
	 * If two or more components have the same value the first index will be returned.
	 * The value is returned at the index 0 and the index is returned at the index 1 of the result array.
	 * 
	 * @param x The value of the x component of the vector.
	 * @param y The value of the y component of the vector.
	 * @param z The value of the z component of the vector.
	 * @param res The result object.
	 * 
	 * @return The result tuple with the result.
	 */
	public static ComponentValueFloat max(float x, float y, float z, @ExtractionParam ComponentValueFloat res)
	{
		maxInternal(x, y, z, res);
		
		return res;
	}
	
	/**
	 * Only for better maintainability.
	 * 
	 * <p>
	 * Determines the greatest value of the components of the vector {@code (x, y, z)}
	 * and returns the value and the index of the component by the result tuple.
	 * The index returned is limited to the range of 0 to 2.
	 * If two or more components have the same value the first index will be returned.
	 * The value is returned at the index 0 and the index is returned at the index 1 of the result array.
	 * 
	 * @param x The value of the x component of the vector.
	 * @param y The value of the y component of the vector.
	 * @param z The value of the z component of the vector.
	 * @param res The result object.
	 */
	@InlineOnly
	private static void maxInternal(float x, float y, float z, @ExtractionParam ComponentValueFloat res)
	{
		float value = x;
		int index = 0;
		
		if(y > value)
		{
			value = y;
			index = 1;
		}
		
		if(z > value)
		{
			value = z;
			index = 2;
		}

		res.set(index, value);
	}
	
	/**
	 * Determines the greatest value of the components of the vector {@code (v)} and returns it.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * @param v The vector.
	 * 
	 * @return The greatest value of the components.
	 */
	public static float maxValue(Vec3fR v)
	{
		return BarghosMath.max(v.getX(), v.getY(), v.getZ());
	}
	
	/**
	 * Determines the greatest value of the components of the vector {@code (v[0], v[1], v[2])} and returns it.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * @param v The vector. Minimum legth: 3.
	 * 
	 * @return The greatest value of the components.
	 */
	public static float maxValue(@MinLength(3) float[] v)
	{
		return BarghosMath.max(v[0], v[1], v[2]);
	}
	
	/**
	 * Determines the greatest value of the components of the vector {@code (x, y, z)} and returns it.
	 * 
	 * @param x The value of the x component of the vector.
	 * @param y The value of the y component of the vector.
	 * @param z The value of the z component of the vector.
	 * 
	 * @return The greatest value of the components.
	 */
	public static float maxValue(float x, float y, float z)
	{
		return BarghosMath.max(x, y, z);
	}
	
	/**
	 * Determines the greatest value of the components of the vector {@code (v)} and returns the index of the component.
	 * The index returned is limited to the range of 0 to 2.
	 * If two or more components have the same value the first index will be returned.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * @param v The vector.
	 * 
	 * @return The index of the greatest component.
	 */
	public static int maxComponent(Vec3fR v)
	{
		float y = v.getY();
		float z = v.getZ();
		
		float value = v.getX();
		int index = 0;
		
		if(y > value)
		{
			value = y;
			index = 1;
		}
		
		if(z > value)
		{
			value = z;
			index = 2;
		}
		
		return index;
	}
	
	/**
	 * Determines the greatest value of the components of the vector {@code (v[0], v[1], v[2])} and returns the index of the component.
	 * The index returned is limited to the range of 0 to 2.
	 * If two or more components have the same value the first index will be returned.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * @param v The vector. Minimum legth: 3.
	 * 
	 * @return The index of the greatest component.
	 */
	public static int maxComponent(@MinLength(3) float[] v)
	{
		float value = v[0];
		int index = 0;
		
		if(v[1] > value)
		{
			value = v[1];
			index = 1;
		}
		
		if(v[2] > value)
		{
			value = v[2];
			index = 2;
		}
		
		return index;
	}
	
	/**
	 * Determines the greatest value of the components of the vector {@code (x, y, z)} and returns the index of the component.
	 * The index returned is limited to the range of 0 to 2.
	 * If two or more components have the same value the first index will be returned.
	 * 
	 * @param x The value of the x component of the vector.
	 * @param y The value of the y component of the vector.
	 * @param z The value of the z component of the vector.
	 * 
	 * @return The index of the greatest component.
	 */
	public static int maxComponent(float x, float y, float z)
	{
		float value = x;
		int index = 0;
		
		if(y > value)
		{
			value = y;
			index = 1;
		}
		
		if(z > value)
		{
			value = z;
			index = 2;
		}
		
		return index;
	}
	
	/**
	 * Normalizes the vector {@code (v)} and saves the result in the result array.
	 * Normalization is done by dividing the vector by its length (magnitude, norm).
	 * If the vector is a zero-vector {@code (x=y=z=0)} this will throw an {@link ArithmeticException}
	 * as this will result in a division by zero.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v / |v|}
	 * 
	 * @param v The vector. 
	 * @param res The result array. Minimum legth: 3.
	 * 
	 * @return The result array with the result.
	 */
	public static float[] normalizeUnsafe(Vec3fR v, @ExtractionParam @MinLength(3) float[] res)
	{
		float x = v.getX();
		float y = v.getY();
		float z = v.getZ();
		
		float invLength = BarghosMath.invSqrt(x * x + y * y + z * z);
		
		res[0] = x * invLength;
		res[1] = y * invLength;
		res[2] = z * invLength;
		
		return res;
	}
	
	/**
	 * Normalizes the vector {@code (v[0], v[1], v[2])} and saves the result in the result array.
	 * Normalization is done by dividing the vector by its length (magnitude, norm).
	 * If the vector is a zero-vector {@code (x=y=z=0)} this will throw an {@link ArithmeticException}
	 * as this will result in a division by zero.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v[0], v[1], v[2]) / |(v[0], v[1], v[2])|}
	 * 
	 * @param v The vector. Minimum legth: 3.
	 * @param res The result array. Minimum legth: 3.
	 * 
	 * @return The result array with the result.
	 */
	public static float[] normalizeUnsafe(@MinLength(3) float[] v, @ExtractionParam @MinLength(3) float[] res)
	{
		float invLength = BarghosMath.invSqrt(v[0] * v[0] + v[1] * v[1] + v[2] * v[2]);
		
		res[0] = v[0] * invLength;
		res[1] = v[1] * invLength;
		res[2] = v[2] * invLength;
		
		return res;
	}
	
	/**
	 * Normalizes the vector {@code (x, y, z)} and saves the result in the result array.
	 * Normalization is done by dividing the vector by its length (magnitude, norm).
	 * If the vector is a zero-vector {@code (x=y=z=0)} this will throw an {@link ArithmeticException}
	 * as this will result in a division by zero.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (x, y, z) / |(x, y, z)|}
	 * 
	 * @param x The value of the x component of the vector.
	 * @param y The value of the y component of the vector.
	 * @param z The value of the z component of the vector.
	 * @param res The result array. Minimum legth: 3.
	 * 
	 * @return The result array with the result.
	 */
	public static float[] normalizeUnsafe(float x, float y, float z, @ExtractionParam @MinLength(3) float[] res)
	{
		float invLength = BarghosMath.invSqrt(x * x + y * y + z * z);
		
		res[0] = x * invLength;
		res[1] = y * invLength;
		res[2] = z * invLength;
		
		return res;
	}
	
	/**
	 * Normalizes the vector {@code (v)} and saves the result in the result vector.
	 * Normalization is done by dividing the vector by its length (magnitude, norm).
	 * If the vector is a zero-vector {@code (x=y=z=0)} this will throw an {@link ArithmeticException}
	 * as this will result in a division by zero.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v / |v|}
	 * 
	 * @param <T> The type of the result vector.
	 * 
	 * @param v The vector. 
	 * @param res The result vector.
	 * 
	 * @return The result vector with the result.
	 */
	public static <T extends Vec3fC> T normalizeUnsafe(Vec3fR v, @ExtractionParam T res)
	{
		float x = v.getX();
		float y = v.getY();
		float z = v.getZ();
		
		float invLength = BarghosMath.invSqrt(x * x + y * y + z * z);

		res.set(x * invLength, y * invLength, z * invLength);
		
		return res;
	}
	
	/**
	 * Normalizes the vector {@code (v[0], v[1], v[2])} and saves the result in the result vector.
	 * Normalization is done by dividing the vector by its length (magnitude, norm).
	 * If the vector is a zero-vector {@code (x=y=z=0)} this will throw an {@link ArithmeticException}
	 * as this will result in a division by zero.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v[0], v[1], v[2]) / |(v[0], v[1], v[2])|}
	 * 
	 * @param <T> The type of the result vector.
	 * 
	 * @param v The vector. Minimum legth: 3.
	 * @param res The result vector.
	 * 
	 * @return The result vector with the result.
	 */
	public static <T extends Vec3fC> T normalizeUnsafe(@MinLength(3) float[] v, @ExtractionParam T res)
	{
		float invLength = BarghosMath.invSqrt(v[0] * v[0] + v[1] * v[1] + v[2] * v[2]);
		
		res.set(v[0] * invLength, v[1] * invLength, v[2] * invLength);
		
		return res;
	}
	
	/**
	 * Normalizes the vector {@code (x, y, z)} and saves the result in the result vector.
	 * Normalization is done by dividing the vector by its length (magnitude, norm).
	 * If the vector is a zero-vector {@code (x=y=z=0)} this will throw an {@link ArithmeticException}
	 * as this will result in a division by zero.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (x, y, z) / |(x, y, z)|}
	 * 
	 * @param <T> The type of the result vector.
	 * 
	 * @param x The value of the x component of the vector.
	 * @param y The value of the y component of the vector.
	 * @param z The value of the z component of the vector.
	 * @param res The result vetor.
	 * 
	 * @return The result vector with the result.
	 */
	public static <T extends Vec3fC> T normalizeUnsafe(float x, float y, float z, @ExtractionParam T res)
	{
		float invLength = BarghosMath.invSqrt(x * x + y * y + z * z);

		res.set(x * invLength, y * invLength, z * invLength);
		
		return res;
	}
	
	/**
	 * Normalizes the vector {@code (v)} and saves the result in the result array.
	 * Normalization is done by dividing the vector by its length (magnitude, norm).
	 * If the vector is a zero-vector {@code (x=y=z=0)} the result will be a zero-vector.
	 * It determines a length of zero by checking if all components are exactly zero.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v / |v|}
	 * 
	 * @param v The vector.
	 * @param res The result array. Minimum legth: 3.
	 * 
	 * @return The result array with the result.
	 */
	public static float[] normalize(Vec3fR v, @ExtractionParam @MinLength(3) float[] res)
	{
		float x = v.getX();
		float y = v.getY();
		float z = v.getZ();
		
		if(	x == 0.0f &&
			y == 0.0f &&
			z == 0.0f)
		{
			res[0] = 0.0f;
			res[1] = 0.0f;
			res[2] = 0.0f;
			
			return res;
		}

		float invLength = BarghosMath.invSqrt(x * x + y * y + z * z);
		
		res[0] = x * invLength;
		res[1] = y * invLength;
		res[2] = z * invLength;
		
		return res;
	}
	
	/**
	 * Normalizes the vector {@code (v[0], v[1], v[2])} and saves the result in the result array.
	 * Normalization is done by dividing the vector by its length (magnitude, norm).
	 * If the vector is a zero-vector {@code (x=y=z=0)} the result will be a zero-vector.
	 * It determines a length of zero by checking if all components are exactly zero.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v[0], v[1], v[2]) / |(v[0], v[1], v[2])|}
	 * 
	 * @param v The vector. Minimum legth: 3.
	 * @param res The result array. Minimum legth: 3.
	 * 
	 * @return The result array with the result.
	 */
	public static float[] normalize(@MinLength(3) float[] v, @ExtractionParam @MinLength(3) float[] res)
	{
		if(	v[0] == 0.0f &&
			v[1] == 0.0f &&
			v[2] == 0.0f)
		{
			res[0] = 0.0f;
			res[1] = 0.0f;
			res[2] = 0.0f;
			
			return res;
		}

		float invLength = BarghosMath.invSqrt(v[0] * v[0] + v[1] * v[1] + v[2] * v[2]);
		
		res[0] = v[0] * invLength;
		res[1] = v[1] * invLength;
		res[2] = v[2] * invLength;
		
		return res;
	}
	
	/**
	 * Normalizes the vector {@code (x, y, z)} and saves the result in the result array.
	 * Normalization is done by dividing the vector by its length (magnitude, norm).
	 * If the vector is a zero-vector {@code (x=y=z=0)} the result will be a zero-vector.
	 * It determines a length of zero by checking if all components are exactly zero.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (x, y, z) / |(x, y, z)|}
	 * 
	 * @param x The value of the x component of the vector.
	 * @param y The value of the y component of the vector.
	 * @param z The value of the z component of the vector.
	 * @param res The result array. Minimum legth: 3.
	 * 
	 * @return The result array with the result.
	 */
	public static float[] normalize(float x, float y, float z, @ExtractionParam @MinLength(3) float[] res)
	{
		if(	x == 0.0f &&
			y == 0.0f &&
			z == 0.0f)
		{
			res[0] = 0.0f;
			res[1] = 0.0f;
			res[2] = 0.0f;
			
			return res;
		}

		float invLength = BarghosMath.invSqrt(x * x + y * y + z * z);

		res[0] = x * invLength;
		res[1] = y * invLength;
		res[2] = z * invLength;
		
		return res;
	}
	
	/**
	 * Normalizes the vector {@code (v)} and saves the result in the result vector.
	 * Normalization is done by dividing the vector by its length (magnitude, norm).
	 * If the vector is a zero-vector {@code (x=y=z=0)} the result will be a zero-vector.
	 * It determines a length of zero by checking if all components are exactly zero.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v / |v|}
	 * 
	 * @param <T> The type of the result vector.
	 * 
	 * @param v The vector.
	 * @param res The result vector.
	 * 
	 * @return The result vector with the result.
	 */
	public static <T extends Vec3fC> T normalize(Vec3fR v, @ExtractionParam T res)
	{
		float x = v.getX();
		float y = v.getY();
		float z = v.getZ();
		
		if(	x == 0.0f &&
			y == 0.0f &&
			z == 0.0f)
		{
			res.set(0.0f, 0.0f, 0.0f);
			
			return res;
		}

		float invLength = BarghosMath.invSqrt(x * x + y * y + z * z);

		res.set(x * invLength, y * invLength, z * invLength);
		
		return res;
	}
	
	/**
	 * Normalizes the vector {@code (v[0], v[1], v[2])} and saves the result in the result vector.
	 * Normalization is done by dividing the vector by its length (magnitude, norm).
	 * If the vector is a zero-vector {@code (x=y=z=0)} the result will be a zero-vector.
	 * It determines a length of zero by checking if all components are exactly zero.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v[0], v[1], v[2]) / |(v[0], v[1], v[2])|}
	 * 
	 * @param <T> The type of the result vector.
	 * 
	 * @param v The vector. Minimum legth: 3.
	 * @param res The result vector.
	 * 
	 * @return The result vector with the result.
	 */
	public static <T extends Vec3fC> T normalize(@MinLength(3) float[] v, @ExtractionParam T res)
	{
		if(	v[0] == 0.0f &&
			v[1] == 0.0f &&
			v[2] == 0.0f)
		{
			res.set(0.0f, 0.0f, 0.0f);
			
			return res;
		}

		float invLength = BarghosMath.invSqrt(v[0] * v[0] + v[1] * v[1] + v[2] * v[2]);
		
		res.set(v[0] * invLength, v[1] * invLength, v[2] * invLength);
		
		return res;
	}
	
	/**
	 * Normalizes the vector {@code (x, y, z)} and saves the result in the result vector.
	 * Normalization is done by dividing the vector by its length (magnitude, norm).
	 * If the vector is a zero-vector {@code (x=y=z=0)} the result will be a zero-vector.
	 * It determines a length of zero by checking if all components are exactly zero.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (x, y, z) / |(x, y, z)|}
	 * 
	 * @param <T> The type of the result vector.
	 * 
	 * @param x The value of the x component of the vector.
	 * @param y The value of the y component of the vector.
	 * @param z The value of the z component of the vector.
	 * @param res The result vector.
	 * 
	 * @return The result vector with the result.
	 */
	public static <T extends Vec3fC> T normalize(float x, float y, float z, @ExtractionParam T res)
	{
		if(	x == 0.0f &&
			y == 0.0f &&
			z == 0.0f)
		{
			res.set(0.0f, 0.0f, 0.0f);
			
			return res;
		}

		float invLength = BarghosMath.invSqrt(x * x + y * y + z * z);

		res.set(x * invLength, y * invLength, z * invLength);
		
		return res;
	}
	
	/**
	 * Normalizes the vector {@code (v)} and saves the result in the result array.
	 * Normalization is done by dividing the vector by its length (magnitude, norm).
	 * If the vector is a zero-vector the result will be a zero-vector.
	 * It determines a length of zero by checking if all components are within the margin defined by
	 * zero plus-minus the given tolerance inclusive {@code (-tolerance <= value <= tolerance)}.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v) / |(v)|}
	 * 
	 * @param v The vector.
	 * @param tolerance The tolerance for defining the margin around zero. Must be positive.
	 * @param res The result array. Minimum legth: 3.
	 * 
	 * @return The result array with the result.
	 */
	public static float[] normalize(Vec3fR v, float tolerance, @ExtractionParam @MinLength(3) float[] res)
	{
		float x = v.getX();
		float y = v.getY();
		float z = v.getZ();
		
		if(	BarghosMath.abs(x) <= tolerance &&
			BarghosMath.abs(y) <= tolerance &&
			BarghosMath.abs(z) <= tolerance)
		{
			res[0] = 0.0f;
			res[1] = 0.0f;
			res[2] = 0.0f;
			
			return res;
		}
		
		float invLength = BarghosMath.invSqrt(x * x + y * y + z * z);
		
		res[0] = x * invLength;
		res[1] = y * invLength;
		res[2] = z * invLength;
		
		return res;
	}
	
	/**
	 * Normalizes the vector {@code (v[0], v[1], v[2])} and saves the result in the result array.
	 * Normalization is done by dividing the vector by its length (magnitude, norm).
	 * If the vector is a zero-vector the result will be a zero-vector.
	 * It determines a length of zero by checking if all components are within the margin defined by
	 * zero plus-minus the given tolerance inclusive {@code (-tolerance <= value <= tolerance)}.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v[0], v[1], v[2]) / |(v[0], v[1], v[2])|}
	 * 
	 * @param v The vector. Minimum legth: 3.
	 * @param tolerance The tolerance for defining the margin around zero. Must be positive.
	 * @param res The result array. Minimum legth: 3.
	 * 
	 * @return The result array with the result.
	 */
	public static float[] normalize(@MinLength(3) float[] v, float tolerance, @ExtractionParam @MinLength(3) float[] res)
	{
		if(	BarghosMath.abs(v[0]) <= tolerance &&
			BarghosMath.abs(v[1]) <= tolerance &&
			BarghosMath.abs(v[2]) <= tolerance)
		{
			res[0] = 0.0f;
			res[1] = 0.0f;
			res[2] = 0.0f;
			
			return res;
		}
		
		float invLength = BarghosMath.invSqrt(v[0] * v[0] + v[1] * v[1] + v[2] * v[2]);
		
		res[0] = v[0] * invLength;
		res[1] = v[1] * invLength;
		res[2] = v[2] * invLength;
		
		return res;
	}
	
	/**
	 * Normalizes the vector {@code (x, y, z)} and saves the result in the result array.
	 * Normalization is done by dividing the vector by its length (magnitude, norm).
	 * If the vector is a zero-vector the result will be a zero-vector.
	 * It determines a length of zero by checking if all components are within the margin defined by
	 * zero plus-minus the given tolerance inclusive {@code (-tolerance <= value <= tolerance)}.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (x, y, z) / |(x, y, z)|}
	 * 
	 * @param x The value of the x component of the vector.
	 * @param y The value of the y component of the vector.
	 * @param z The value of the z component of the vector.
	 * @param tolerance The tolerance for defining the margin around zero. Must be positive.
	 * @param res The result array. Minimum legth: 3.
	 * 
	 * @return The result array with the result.
	 */
	public static float[] normalize(float x, float y, float z, float tolerance, @ExtractionParam @MinLength(3) float[] res)
	{
		if(	BarghosMath.abs(x) <= tolerance &&
			BarghosMath.abs(y) <= tolerance &&
			BarghosMath.abs(z) <= tolerance)
		{
			res[0] = 0.0f;
			res[1] = 0.0f;
			res[2] = 0.0f;
			
			return res;
		}

		float invLength = BarghosMath.invSqrt(x * x + y * y + z * z);
		
		res[0] = x * invLength;
		res[1] = y * invLength;
		res[2] = z * invLength;
		
		return res;
	}	
	
	/**
	 * Normalizes the vector {@code (v)} and saves the result in the result vector.
	 * Normalization is done by dividing the vector by its length (magnitude, norm).
	 * If the vector is a zero-vector the result will be a zero-vector.
	 * It determines a length of zero by checking if all components are within the margin defined by
	 * zero plus-minus the given tolerance inclusive {@code (-tolerance <= value <= tolerance)}.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v) / |(v)|}
	 * 
	 * @param <T> The type of the result vector.
	 * 
	 * @param v The vector.
	 * @param tolerance The tolerance for defining the margin around zero. Must be positive.
	 * @param res The result vector.
	 * 
	 * @return The result vector with the result.
	 */
	public static <T extends Vec3fC> T normalize(Vec3fR v, float tolerance, @ExtractionParam T res)
	{
		float x = v.getX();
		float y = v.getY();
		float z = v.getZ();
		
		if(	BarghosMath.abs(x) <= tolerance &&
			BarghosMath.abs(y) <= tolerance &&
			BarghosMath.abs(z) <= tolerance)
		{
			res.set(0.0f, 0.0f, 0.f);
			
			return res;
		}
		
		float invLength = BarghosMath.invSqrt(x * x + y * y + z * z);

		res.set(x * invLength, y * invLength, z * invLength);
		
		return res;
	}
	
	/**
	 * Normalizes the vector {@code (v[0], v[1], v[2])} and saves the result in the result vector.
	 * Normalization is done by dividing the vector by its length (magnitude, norm).
	 * If the vector is a zero-vector the result will be a zero-vector.
	 * It determines a length of zero by checking if all components are within the margin defined by
	 * zero plus-minus the given tolerance inclusive {@code (-tolerance <= value <= tolerance)}.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v[0], v[1], v[2]) / |(v[0], v[1], v[2])|}
	 * 
	 * @param <T> The type of the result vector.
	 * 
	 * @param v The vector. Minimum legth: 3.
	 * @param tolerance The tolerance for defining the margin around zero. Must be positive.
	 * @param res The result vector.
	 * 
	 * @return The result vector with the result.
	 */
	public static <T extends Vec3fC> T normalize(@MinLength(3) float[] v, float tolerance, @ExtractionParam T res)
	{
		if(	BarghosMath.abs(v[0]) <= tolerance &&
			BarghosMath.abs(v[1]) <= tolerance &&
			BarghosMath.abs(v[2]) <= tolerance)
		{
			res.set(0.0f, 0.0f, 0.0f);
			
			return res;
		}
		
		float invLength = BarghosMath.invSqrt(v[0] * v[0] + v[1] * v[1] + v[2] * v[2]);
		
		res.set(v[0] * invLength, v[1] * invLength, v[2] * invLength);
		
		return res;
	}
	
	/**
	 * Normalizes the vector {@code (x, y, z)} and saves the result in the result vector.
	 * Normalization is done by dividing the vector by its length (magnitude, norm).
	 * If the vector is a zero-vector the result will be a zero-vector.
	 * It determines a length of zero by checking if all components are within the margin defined by
	 * zero plus-minus the given tolerance inclusive {@code (-tolerance <= value <= tolerance)}.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (x, y, z) / |(x, y, z)|}
	 * 
	 * @param <T> The type of the result vector.
	 * 
	 * @param x The value of the x component of the vector.
	 * @param y The value of the y component of the vector.
	 * @param z The value of the z component of the vector.
	 * @param tolerance The tolerance for defining the margin around zero. Must be positive.
	 * @param res The result vector.
	 * 
	 * @return The result vector with the result.
	 */
	public static <T extends Vec3fC> T normalize(float x, float y, float z, float tolerance, @ExtractionParam T res)
	{
		if(	BarghosMath.abs(x) <= tolerance &&
			BarghosMath.abs(y) <= tolerance &&
			BarghosMath.abs(z) <= tolerance)
		{
			res.set(0.0f, 0.0f, 0.0f);
			
			return res;
		}

		float invLength = BarghosMath.invSqrt(x * x + y * y + z * z);

		res.set(x * invLength, y * invLength, z * invLength);
		
		return res;
	}
	
	/**
	 * Negates the vector {@code (v)} and saves the result in the result array.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code -v}
	 * 
	 * @param v The vector.
	 * @param res The result array. Minimum legth: 3.
	 * 
	 * @return The result array with the result.
	 */
	public static float[] negate(Vec3fR v, @ExtractionParam @MinLength(3) float[] res)
	{
		res[0] = -v.getX();
		res[1] = -v.getY();
		res[2] = -v.getZ();
		
		return res;
	}
	
	/**
	 * Negates the vector {@code (v[0], v[1], v[2])} and saves the result in the result array.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code -(v[0], v[1], v[2])}
	 * 
	 * @param v The vector. Minimum legth: 3.
	 * @param res The result array. Minimum legth: 3.
	 * 
	 * @return The result array with the result.
	 */
	public static float[] negate(@MinLength(3) float[] v, @ExtractionParam @MinLength(3) float[] res)
	{
		res[0] = -v[0];
		res[1] = -v[1];
		res[2] = -v[2];
		
		return res;
	}
	
	/**
	 * Negates the vector {@code (x, y, z)} and saves the result in the result array.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code -(x, y, z)}
	 * 
	 * @param x The value of the x component of the vector.
	 * @param y The value of the y component of the vector.
	 * @param z The value of the z component of the vector.
	 * @param res The result array. Minimum legth: 3.
	 * 
	 * @return The result array with the result.
	 */
	public static float[] negate(float x, float y, float z, @ExtractionParam @MinLength(3) float[] res)
	{
		res[0] = -x;
		res[1] = -y;
		res[2] = -z;
		
		return res;
	}
	
	/**
	 * Negates the vector {@code (v)} and saves the result in the result vector.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code -v}
	 * 
	 * @param <T> The type of the result vector.
	 * 
	 * @param v The vector.
	 * @param res The result vector.
	 * 
	 * @return The result vector with the result.
	 */
	public static <T extends Vec3fC> T negate(Vec3fR v, @ExtractionParam T res)
	{
		res.set(-v.getX(), -v.getY(), -v.getZ());
		
		return res;
	}
	
	/**
	 * Negates the vector {@code (v[0], v[1], v[2])} and saves the result in the result vector.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code -(v[0], v[1], v[2])}
	 * 
	 * @param <T> The type of the result vector.
	 * 
	 * @param v The vector. Minimum legth: 3.
	 * @param res The result vector.
	 * 
	 * @return The result vector with the result.
	 */
	public static <T extends Vec3fC> T negate(@MinLength(3) float[] v, @ExtractionParam T res)
	{
		res.set(-v[0], -v[1], -v[2]);
		
		return res;
	}
	
	/**
	 * Negates the vector {@code (x, y, z)} and saves the result in the result vector.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code -(x, y, z)}
	 * 
	 * @param <T> The type of the result vector.
	 * 
	 * @param x The value of the x component of the vector.
	 * @param y The value of the y component of the vector.
	 * @param z The value of the z component of the vector.
	 * @param res The result vector.
	 * 
	 * @return The result vector with the result.
	 */
	public static <T extends Vec3fC> T negate(float x, float y, float z, @ExtractionParam T res)
	{
		res.set(-x, -y, -z);
		
		return res;
	}
	
	/**
	 * Calculates the inverse of the vector {@code (v)} and saves the result in the result array.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:
	 * {@code 1 / v}
	 *
	 * @param v The vector.
	 * @param res The result array. Minimum legth: 3.
	 * 
	 * @return The result array with the result.
	 */
	public static float[] inverse(Vec3fR v, @ExtractionParam @MinLength(3) float[] res)
	{
		res[0] = 1.0f / v.getX();
		res[1] = 1.0f / v.getY();
		res[2] = 1.0f / v.getZ();
		
		return res;
	}
	
	/**
	 * Calculates the inverse of the vector {@code (v[0], v[1], v[2])} and saves the result in the result array.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:
	 * {@code 1 / (v[0], v[1], v[2])}
	 *
	 * @param v The vector. Minimum legth: 3.
	 * @param res The result array. Minimum legth: 3.
	 * 
	 * @return The result array with the result.
	 */
	public static float[] inverse(@MinLength(3) float[] v, @ExtractionParam @MinLength(3) float[] res)
	{
		res[0] = 1.0f / v[0];
		res[1] = 1.0f / v[1];
		res[2] = 1.0f / v[2];
		
		return res;
	}
	
	/**
	 * Calculates the inverse of the vector {@code (x, y, z)} and saves the result in the result array.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:
	 * {@code 1 / (x, y, z)}
	 * 
	 * @param x The value of the x component of the vector.
	 * @param y The value of the y component of the vector.
	 * @param z The value of the z component of the vector.
	 * @param res The result array. Minimum legth: 3.
	 * 
	 * @return The result array with the result.
	 */
	public static float[] inverse(float x, float y, float z, @ExtractionParam @MinLength(3) float[] res)
	{
		res[0] = 1.0f / x;
		res[1] = 1.0f / y;
		res[2] = 1.0f / z;
		
		return res;
	}
	
	/**
	 * Calculates the inverse of the vector {@code (v)} and saves the result in the result vector.
	 * 
	 * <p>
	 * Operation:
	 * {@code 1 / v}
	 *
	 * @param <T> The type of the result vector.
	 *
	 * @param v The vector.
	 * @param res The result vector.
	 * 
	 * @return The result vector with the result.
	 */
	public static <T extends Vec3fC> T inverse(Vec3fR v, @ExtractionParam T res)
	{
		res.set(1.0f / v.getX(), 1.0f / v.getY(), 1.0f / v.getZ());
		
		return res;
	}
	
	/**
	 * Calculates the inverse of the vector {@code (v[0], v[1], v[2])} and saves the result in the result vector.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:
	 * {@code 1 / (v[0], v[1], v[2])}
	 *
	 * @param <T> The type of the result vector.
	 *
	 * @param v The vector. Minimum legth: 3.
	 * @param res The result vector.
	 * 
	 * @return The result vector with the result.
	 */
	public static <T extends Vec3fC> T inverse(@MinLength(3) float[] v, @ExtractionParam T res)
	{
		res.set(1.0f / v[0], 1.0f / v[1], 1.0f / v[2]);
		
		return res;
	}
	
	/**
	 * Calculates the inverse of the vector {@code (x, y, z)} and saves the result in the result vector.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:
	 * {@code 1 / (x, y, z)}
	 * 
	 * @param <T> The type of the result vector.
	 * 
	 * @param x The value of the x component of the vector.
	 * @param y The value of the y component of the vector.
	 * @param z The value of the z component of the vector.
	 * @param res The result vector.
	 * 
	 * @return The result vector with the result.
	 */
	public static <T extends Vec3fC> T inverse(float x, float y, float z, @ExtractionParam T res)
	{
		res.set(1.0f / x, 1.0f / y, 1.0f / z);
		
		return res;
	}
	
	/**
	 * Calculates the dot product (scalar product) between the first given vector {@code (v1)} and
	 * the second given vector {@code (v2)}.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 . v2}
	 * 
	 * @param v1 The first vector.
	 * @param v2 The second vector.
	 * 
	 * @return The dot product (scalar product).
	 */
	public static float dot(Vec3fR v1, Vec3fR v2)
	{
		return v1.getX() * v2.getX() + v1.getY() * v2.getY() + v1.getZ() * v2.getZ();
	}
	
	/**
	 * Calculates the dot product (scalar product) between the first given vector {@code (v1)} and
	 * the second given vector {@code (v2[0], v2[1], v2[1])}.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 . (v2[0], v2[1], v2[2])}
	 * 
	 * @param v1 The first vector.
	 * @param v2 The second vector. Minimum legth: 3.
	 * 
	 * @return The dot product (scalar product).
	 */
	public static float dot(Vec3fR v1, @MinLength(3) float[] v2)
	{
		return v1.getX() * v2[0] + v1.getY() * v2[1] + v1.getZ() * v2[2];
	}
	
	/**
	 * Calculates the dot product (scalar product) between the first vector {@code (v1)} and
	 * the second given vector {@code (v2x, v2y, v2z)}.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 . (v2x, v2y, v2z)}
	 * 
	 * @param v1 The first vector.
	 * @param v2x The value of the x component of the second vector.
	 * @param v2y The value of the y component of the second vector.
	 * @param v2z The value of the z component of the second vector.
	 * 
	 * @return The dot product (scalar product).
	 */
	public static float dot(Vec3fR v1, float v2x, float v2y, float v2z)
	{
		return v1.getX() * v2x + v1.getY() * v2y + v1.getZ() * v2z;
	}
	
	/**
	 * Calculates the dot product (scalar product) between the first given vector {@code (v1[0], v1[1], v1[2])} and
	 * the second given vector {@code (v2)}.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1], v1[2]) . v2}
	 * 
	 * @param v1 The first vector. Minimum legth: 3.
	 * @param v2 The second vector.
	 * 
	 * @return The dot product (scalar product).
	 */
	public static float dot(@MinLength(3) float[] v1, Vec3fR v2)
	{
		return v1[0] * v2.getX() + v1[1] * v2.getY() + v1[2] * v2.getZ();
	}
	
	/**
	 * Calculates the dot product (scalar product) between the first given vector {@code (v1[0], v1[1], v1[2])} and
	 * the second given vector {@code (v2[0], v2[1], v2[1])}.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1], v1[2]) . (v2[0], v2[1], v2[2])}
	 * 
	 * @param v1 The first vector. Minimum legth: 3.
	 * @param v2 The second vector. Minimum legth: 3.
	 * 
	 * @return The dot product (scalar product).
	 */
	public static float dot(@MinLength(3) float[] v1, @MinLength(3) float[] v2)
	{
		return v1[0] * v2[0] + v1[1] * v2[1] + v1[2] * v2[2];
	}
	
	/**
	 * Calculates the dot product (scalar product) between the first vector {@code (v1[0], v1[1], v1[2])} and
	 * the second given vector {@code (v2x, v2y, v2z)}.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1], v1[2]) . (v2x, v2y, v2z)}
	 * 
	 * @param v1 The first vector. Minimum legth: 3.
	 * @param v2x The value of the x component of the second vector.
	 * @param v2y The value of the y component of the second vector.
	 * @param v2z The value of the z component of the second vector.
	 * 
	 * @return The dot product (scalar product).
	 */
	public static float dot(@MinLength(3) float[] v1, float v2x, float v2y, float v2z)
	{
		return v1[0] * v2x + v1[1] * v2y + v1[2] * v2z;
	}
	
	/**
	 * Calculates the dot product (scalar product) between the first array {@code (v1x, v1y, v1z)} and
	 * the second given vector {@code (v2)}.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y, v1z) . v2}
	 * 
	 * @param v1x The value of the x component of the first vector.
	 * @param v1y The value of the y component of the first vector.
	 * @param v1z The value of the z component of the first vector.
	 * @param v2 The second vector.
	 * 
	 * @return The dot product (scalar product).
	 */
	public static float dot(float v1x, float v1y, float v1z, Vec3fR v2)
	{
		return v1x * v2.getX() + v1y * v2.getY() + v1z * v2.getZ();
	}
	
	/**
	 * Calculates the dot product (scalar product) between the first array {@code (v1x, v1y, v1z)} and
	 * the second given vector {@code (v2[0], v2[1], v2[2])}.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y, v1z) . (v2[0], v2[1], v2[2])}
	 * 
	 * @param v1x The value of the x component of the first vector.
	 * @param v1y The value of the y component of the first vector.
	 * @param v1z The value of the z component of the first vector.
	 * @param v2 The second vector. Minimum legth: 3.
	 * 
	 * @return The dot product (scalar product).
	 */
	public static float dot(float v1x, float v1y, float v1z, @MinLength(3) float[] v2)
	{
		return v1x * v2[0] + v1y * v2[1] + v1z * v2[2];
	}
	
	/**
	 * Calculates the dot product (scalar product) between the first vector {@code (v1x, v1y, v1z)} and
	 * the second given vector {@code (v2x, v2y, v2z)}.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y, v1z) . (v2x, v2y, v2z)}
	 * 
	 * @param v1x The value of the x component of the first vector.
	 * @param v1y The value of the y component of the first vector.
	 * @param v1z The value of the z component of the first vector.
	 * @param v2x The value of the x component of the second vector.
	 * @param v2y The value of the y component of the second vector.
	 * @param v2z The value of the z component of the second vector.
	 * 
	 * @return The dot product (scalar product).
	 */
	public static float dot(float v1x, float v1y, float v1z, float v2x, float v2y, float v2z)
	{
		return v1x * v2x + v1y * v2y + v1z * v2z;
	}
	
	/**
	 * Calculates the cross product between the first given vector {@code (v1)} and the second given vector {@code (v2)}
	 * and saves the result in the given result array.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 X v2}
	 * 
	 * @param v1 The first vector.
	 * @param v2 The second vector.
	 * @param res The result array. Minimum legth: 3.
	 * 
	 * @return The result array with the result.
	 */
	public static float[] cross(Vec3fR v1, Vec3fR v2, @ExtractionParam @MinLength(3) float[] res)
	{
		res[0] = v1.getY() * v2.getZ() - v1.getZ() * v2.getY();
		res[1] = v1.getZ() * v2.getX() - v1.getX() * v2.getZ();
		res[2] = v1.getX() * v2.getY() - v1.getY() * v2.getX();

		return res;
	}
	
	/**
	 * Calculates the cross product between the first given vector {@code (v1)} and the second given vector {@code (v2[0], v2[1], v2[2])}
	 * and saves the result in the given result array.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 X (v2[0], v2[1], v2[2])}
	 * 
	 * @param v1 The first vector.
	 * @param v2 The second vector. Minimum legth: 3.
	 * @param res The result array. Minimum legth: 3.
	 * 
	 * @return The result array with the result.
	 */
	public static float[] cross(Vec3fR v1, @MinLength(3) float[] v2, @ExtractionParam @MinLength(3) float[] res)
	{
		res[0] = v1.getY() * v2[2] - v1.getZ() * v2[1];
		res[1] = v1.getZ() * v2[0] - v1.getX() * v2[2];
		res[2] = v1.getX() * v2[1] - v1.getY() * v2[0];

		return res;
	}
	
	/**
	 * Calculates the cross product between the first given vector {@code (v1)} and the second given vector {@code (v2x, v2y, v2z)}
	 * and saves the result in the given result array.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 X (v2x, v2y, v2z)}
	 * 
	 * @param v1 The first vector.
	 * @param v2x The value of the x component of the second vector.
	 * @param v2y The value of the y component of the second vector.
	 * @param v2z The value of the z component of the second vector.
	 * @param res The result array. Minimum legth: 3.
	 * 
	 * @return The result array with the result.
	 */
	public static float[] cross(Vec3fR v1, float v2x, float v2y, float v2z, @ExtractionParam @MinLength(3) float[] res)
	{
		res[0] = v1.getY() * v2z - v1.getZ() * v2y;
		res[1] = v1.getZ() * v2x - v1.getX() * v2z;
		res[2] = v1.getX() * v2y - v1.getY() * v2x;

		return res;
	}
	
	/**
	 * Calculates the cross product between the first given vector {@code (v1[0], v1[1], v1[2])} and the second given vector {@code (v2)}
	 * and saves the result in the given result array.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1], v1[2]) X v2}
	 * 
	 * @param v1 The first vector. Minimum legth: 3.
	 * @param v2 The second vector.
	 * @param res The result array. Minimum legth: 3.
	 * 
	 * @return The result array with the result.
	 */
	public static float[] cross(@MinLength(3) float[] v1, Vec3fR v2, @ExtractionParam @MinLength(3) float[] res)
	{
		res[0] = v1[1] * v2.getZ() - v1[2] * v2.getY();
		res[1] = v1[2] * v2.getX() - v1[0] * v2.getZ();
		res[2] = v1[0] * v2.getY() - v1[1] * v2.getX();

		return res;
	}
	
	/**
	 * Calculates the cross product between the first given vector {@code (v1[0], v1[1], v1[2])} and the second given vector {@code (v2[0], v2[1], v2[2])}
	 * and saves the result in the given result array.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1], v1[2]) X (v2[0], v2[1], v2[2])}
	 * 
	 * @param v1 The first vector. Minimum legth: 3.
	 * @param v2 The second vector. Minimum legth: 3.
	 * @param res The result array. Minimum legth: 3.
	 * 
	 * @return The result array with the result.
	 */
	public static float[] cross(@MinLength(3) float[] v1, @MinLength(3) float[] v2, @ExtractionParam @MinLength(3) float[] res)
	{
		res[0] = v1[1] * v2[2] - v1[2] * v2[1];
		res[1] = v1[2] * v2[0] - v1[0] * v2[2];
		res[2] = v1[0] * v2[1] - v1[1] * v2[0];

		return res;
	}
	
	/**
	 * Calculates the cross product between the first given vector {@code (v1[0], v1[1], v1[2])} and the second given vector {@code (v2x, v2y, v2z)}
	 * and saves the result in the given result array.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], a1[1], a1[2]) X (v2x, v2y, v2z)}
	 * 
	 * @param v1 The first vector. Minimum legth: 3.
	 * @param v2x The value of the x component of the second vector.
	 * @param v2y The value of the y component of the second vector.
	 * @param v2z The value of the z component of the second vector.
	 * @param res The result array. Minimum legth: 3.
	 * 
	 * @return The result array with the result.
	 */
	public static float[] cross(@MinLength(3) float[] v1, float v2x, float v2y, float v2z, @ExtractionParam @MinLength(3) float[] res)
	{
		res[0] = v1[1] * v2z - v1[2] * v2y;
		res[1] = v1[2] * v2x - v1[0] * v2z;
		res[2] = v1[0] * v2y - v1[1] * v2x;

		return res;
	}
	
	/**
	 * Calculates the cross product between the first given vector {@code (v1x, v1y, v1z)} and the second given vector {@code (v2)}
	 * and saves the result in the given result array.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y, v1z) X v2}
	 * 
	 * @param v1x The value of the x component of the first vector.
	 * @param v1y The value of the y component of the first vector.
	 * @param v1z The value of the z component of the first vector.
	 * @param v2 The second vector.
	 * @param res The result array. Minimum legth: 3.
	 * 
	 * @return The result array with the result.
	 */
	public static float[] cross(float v1x, float v1y, float v1z, Vec3fR v2, @ExtractionParam @MinLength(3) float[] res)
	{
		res[0] = v1y * v2.getZ() - v1z * v2.getY();
		res[1] = v1z * v2.getX() - v1x * v2.getZ();
		res[2] = v1x * v2.getY() - v1y * v2.getX();

		return res;
	}
	
	/**
	 * Calculates the cross product between the first given vector {@code (v1x, v1y, v1z)} and the second given vector {@code (v2[0], v2[1], v2[2])}
	 * and saves the result in the given result array.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y, v1z) X (v2[0], v2[1], v2[2])}
	 * 
	 * @param v1x The value of the x component of the first vector.
	 * @param v1y The value of the y component of the first vector.
	 * @param v1z The value of the z component of the first vector.
	 * @param v2 The second vector. Minimum legth: 3.
	 * @param res The result array. Minimum legth: 3.
	 * 
	 * @return The result array with the result.
	 */
	public static float[] cross(float v1x, float v1y, float v1z, @MinLength(3) float[] v2, @ExtractionParam @MinLength(3) float[] res)
	{
		res[0] = v1y * v2[2] - v1z * v2[1];
		res[1] = v1z * v2[0] - v1x * v2[2];
		res[2] = v1x * v2[1] - v1y * v2[0];

		return res;
	}
	
	/**
	 * Calculates the cross product between the first given vector {@code (v1x, v1y, v1z)} and the second given vector {@code (v2x, v2y, v2z)}
	 * and saves the result in the given result array.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y, v1z) X (v2x, v2y, v2z)}
	 * 
	 * @param v1x The value of the x component of the first vector.
	 * @param v1y The value of the y component of the first vector.
	 * @param v1z The value of the z component of the first vector.
	 * @param v2x The value of the x component of the second vector.
	 * @param v2y The value of the y component of the second vector.
	 * @param v2z The value of the z component of the second vector.
	 * @param res The result array. Minimum legth: 3.
	 * 
	 * @return The result array with the result.
	 */
	public static float[] cross(float v1x, float v1y, float v1z, float v2x, float v2y, float v2z, @ExtractionParam @MinLength(3) float[] res)
	{
		res[0] = v1y * v2z - v1z * v2y;
		res[1] = v1z * v2x - v1x * v2z;
		res[2] = v1x * v2y - v1y * v2x;

		return res;
	}
	
	/**
	 * Calculates the cross product between the first given vector {@code (v1)} and the second given vector {@code (v2)}
	 * and saves the result in the given result vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 X v2}
	 * 
	 * @param <T> The type of the result vector.
	 * 
	 * @param v1 The first vector.
	 * @param v2 The second vector.
	 * @param res The result vector.
	 * 
	 * @return The result vector with the result.
	 */
	public static <T extends Vec3fC> T cross(Vec3fR v1, Vec3fR v2, @ExtractionParam T res)
	{
		res.set(v1.getY() * v2.getZ() - v1.getZ() * v2.getY(), v1.getZ() * v2.getX() - v1.getX() * v2.getZ(), v1.getX() * v2.getY() - v1.getY() * v2.getX());
		
		return res;
	}
	
	/**
	 * Calculates the cross product between the first given vector {@code (v1)} and the second given vector {@code (v2[0], v2[1], v2[2])}
	 * and saves the result in the given result vector.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 X (v2[0], v2[1], v2[2])}
	 * 
	 * @param <T> The type of the result vector.
	 * 
	 * @param v1 The first vector.
	 * @param v2 The second vector. Minimum legth: 3.
	 * @param res The result vector.
	 * 
	 * @return The result vector with the result.
	 */
	public static <T extends Vec3fC> T cross(Vec3fR v1, @MinLength(3) float[] v2, @ExtractionParam T res)
	{
		res.set(v1.getY() * v2[2] - v1.getZ() * v2[1], v1.getZ() * v2[0] - v1.getX() * v2[2], v1.getX() * v2[1] - v1.getY() * v2[0]);
		
		return res;
	}
	
	/**
	 * Calculates the cross product between the first given vector {@code (v1)} and the second given vector {@code (v2x, v2y, v2z)}
	 * and saves the result in the given result vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 X (v2x, v2y, v2z)}
	 * 
	 * @param <T> The type of the result vector.
	 * 
	 * @param v1 The first vector.
	 * @param v2x The value of the x component of the second vector.
	 * @param v2y The value of the y component of the second vector.
	 * @param v2z The value of the z component of the second vector.
	 * @param res The result vector.
	 * 
	 * @return The result vector with the result.
	 */
	public static <T extends Vec3fC> T cross(Vec3fR v1, float v2x, float v2y, float v2z, @ExtractionParam T res)
	{
		res.set(v1.getY() * v2z - v1.getZ() * v2y, v1.getZ() * v2x - v1.getX() * v2z, v1.getX() * v2y - v1.getY() * v2x);
		
		return res;
	}
	
	/**
	 * Calculates the cross product between the first given vector {@code (v1[0], v1[1], v1[2])} and the second given vector {@code (v2)}
	 * and saves the result in the given result vector.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1], v1[2]) X v2}
	 * 
	 * @param <T> The type of the result vector.
	 * 
	 * @param v1 The first vector. Minimum legth: 3.
	 * @param v2 The second vector.
	 * @param res The result vector.
	 * 
	 * @return The result vector with the result.
	 */
	public static <T extends Vec3fC> T cross(@MinLength(3) float[] v1, Vec3fR v2, @ExtractionParam T res)
	{
		res.set(v1[1] * v2.getZ() - v1[2] * v2.getY(), v1[2] * v2.getX() - v1[0] * v2.getZ(), v1[0] * v2.getY() - v1[1] * v2.getX());
		
		return res;
	}
	
	/**
	 * Calculates the cross product between the first given vector {@code (v1[0], v1[1], v1[2])} and the second given vector {@code (v2[0], v2[1], v2[2])}
	 * and saves the result in the given result vector.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1], v1[2]) X (v2[0], v2[1], v2[2])}
	 * 
	 * @param <T> The type of the result vector.
	 * 
	 * @param v1 The first vector. Minimum legth: 3.
	 * @param v2 The second vector. Minimum legth: 3.
	 * @param res The result vector.
	 * 
	 * @return The result vector with the result.
	 */
	public static <T extends Vec3fC> T cross(@MinLength(3) float[] v1, @MinLength(3) float[] v2, @ExtractionParam T res)
	{
		res.set(v1[1] * v2[2] - v1[2] * v2[1], v1[2] * v2[0] - v1[0] * v2[2], v1[0] * v2[1] - v1[1] * v2[0]);
		
		return res;
	}
	
	/**
	 * Calculates the cross product between the first given vector {@code (v1[0], v1[1], v1[2])} and the second given vector {@code (v2x, v2y, v2z)}
	 * and saves the result in the given result vector.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], a1[1], a1[2]) X (v2x, v2y, v2z)}
	 * 
	 * @param <T> The type of the result vector.
	 * 
	 * @param v1 The first vector. Minimum legth: 3.
	 * @param v2x The value of the x component of the second vector.
	 * @param v2y The value of the y component of the second vector.
	 * @param v2z The value of the z component of the second vector.
	 * @param res The result vector.
	 * 
	 * @return The result vector with the result.
	 */
	public static <T extends Vec3fC> T cross(@MinLength(3) float[] v1, float v2x, float v2y, float v2z, @ExtractionParam T res)
	{
		res.set(v1[1] * v2z - v1[2] * v2y, v1[2] * v2x - v1[0] * v2z, v1[0] * v2y - v1[1] * v2x);
		
		return res;
	}
	
	/**
	 * Calculates the cross product between the first given vector {@code (v1x, v1y, v1z)} and the second given vector {@code (v2)}
	 * and saves the result in the given result vector.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y, v1z) X v2}
	 * 
	 * @param <T> The type of the result vector.
	 * 
	 * @param v1x The value of the x component of the first vector.
	 * @param v1y The value of the y component of the first vector.
	 * @param v1z The value of the z component of the first vector.
	 * @param v2 The second vector.
	 * @param res The result vector.
	 * 
	 * @return The result vector with the result.
	 */
	public static <T extends Vec3fC> T cross(float v1x, float v1y, float v1z, Vec3fR v2, @ExtractionParam T res)
	{
		res.set(v1y * v2.getZ() - v1z * v2.getY(), v1z * v2.getX() - v1x * v2.getZ(), v1x * v2.getY() - v1y * v2.getX());
		
		return res;
	}
	
	/**
	 * Calculates the cross product between the first given vector {@code (v1x, v1y, v1z)} and the second given vector {@code (v2[0], v2[1], v2[2])}
	 * and saves the result in the given result vector.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y, v1z) X (v2[0], v2[1], v2[2])}
	 * 
	 * @param <T> The type of the result vector.
	 * 
	 * @param v1x The value of the x component of the first vector.
	 * @param v1y The value of the y component of the first vector.
	 * @param v1z The value of the z component of the first vector.
	 * @param v2 The second vector. Minimum legth: 3.
	 * @param res The result vector.
	 * 
	 * @return The result vector with the result.
	 */
	public static <T extends Vec3fC> T cross(float v1x, float v1y, float v1z, @MinLength(3) float[] v2, @ExtractionParam T res)
	{
		res.set(v1y * v2[2] - v1z * v2[1], v1z * v2[0] - v1x * v2[2], v1x * v2[1] - v1y * v2[0]);
		
		return res;
	}
	
	/**
	 * Calculates the cross product between the first given vector {@code (v1x, v1y, v1z)} and the second given vector {@code (v2x, v2y, v2z)}
	 * and saves the result in the given result vector.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y, v1z) X (v2x, v2y, v2z)}
	 * 
	 * @param <T> The type of the result vector.
	 * 
	 * @param v1x The value of the x component of the first vector.
	 * @param v1y The value of the y component of the first vector.
	 * @param v1z The value of the z component of the first vector.
	 * @param v2x The value of the x component of the second vector.
	 * @param v2y The value of the y component of the second vector.
	 * @param v2z The value of the z component of the second vector.
	 * @param res The result vector.
	 * 
	 * @return The result vector with the result.
	 */
	public static <T extends Vec3fC> T cross(float v1x, float v1y, float v1z, float v2x, float v2y, float v2z, @ExtractionParam T res)
	{
		res.set(v1y * v2z - v1z * v2y, v1z * v2x - v1x * v2z, v1x * v2y - v1y * v2x);
		
		return res;
	}
	
	/**
	 * Calculates the orthogonal projection of the vector {@code (v)} onto the target vector {@code (t)}
	 * and saves the result in the result array.
	 * The target vector to project on has to be a unit vector.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * @param v The vector to project.
	 * @param t The target vector to project on.
	 * @param res The result array. Minimum legth: 3.
	 * 
	 * @return The result array with the result.
	 */
	public static float[] project(Vec3fR v, Vec3fR t, @ExtractionParam @MinLength(3) float[] res)
	{
		float tX = t.getX();
		float tY = t.getY();
		float tZ = t.getZ();
		
		float dot = v.getX() * tX + v.getY() * tY + v.getZ() * tZ;
		
		res[0] = tX * dot;
		res[1] = tY * dot;
		res[2] = tZ * dot;
		
		return res;
	}
	
	/**
	 * Calculates the orthogonal projection of the vector {@code (v)} onto the target vector {@code (t[0], t[1], t[2])}
	 * and saves the result in the result array.
	 * The target vector to project on has to be a unit vector.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * @param v The vector to project.
	 * @param t The target vector to project on. Minimum legth: 3.
	 * @param res The result array. Minimum legth: 3.
	 * 
	 * @return The result array with the result.
	 */
	public static float[] project(Vec3fR v, @MinLength(3) float[] t, @ExtractionParam @MinLength(3) float[] res)
	{
		float dot = v.getX() * t[0] + v.getY() * t[1] + v.getZ() * t[2];
		
		res[0] = t[0] * dot;
		res[1] = t[1] * dot;
		res[2] = t[2] * dot;
		
		return res;
	}
	
	/**
	 * Calculates the orthogonal projection of the vector {@code (v)} onto the target vector {@code (tX, tY, tZ)}
	 * and saves the result in the result array.
	 * The target vector to project on has to be a unit vector.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * @param v The vector to project.
	 * @param tX The value of the x component of the target vector to project on.
	 * @param tY The value of the y component of the target vector to project on.
	 * @param tZ The value of the z component of the target vector to project on.
	 * @param res The result array. Minimum legth: 3.
	 * 
	 * @return The result array with the result.
	 */
	public static float[] project(Vec3fR v, float tX, float tY, float tZ, @ExtractionParam @MinLength(3) float[] res)
	{
		float dot = v.getX() * tX + v.getY() * tY + v.getZ() * tZ;
		
		res[0] = tX * dot;
		res[1] = tY * dot;
		res[2] = tZ * dot;
		
		return res;
	}
	
	/**
	 * Calculates the orthogonal projection of the vector {@code (v[0], v[1], v[2])} onto the target vector {@code (t)}
	 * and saves the result in the result array.
	 * The target vector to project on has to be a unit vector.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * @param v The vector to project. Minimum legth: 3.
	 * @param t The target vector to project on.
	 * @param res The result array. Minimum legth: 3.
	 * 
	 * @return The result array with the result.
	 */
	public static float[] project(@MinLength(3) float[] v, Vec3fR t, @ExtractionParam @MinLength(3) float[] res)
	{
		float tX = t.getX();
		float tY = t.getY();
		float tZ = t.getZ();
		
		float dot = v[0] * tX + v[1] * tY + v[2] * tZ;
		
		res[0] = tX * dot;
		res[1] = tY * dot;
		res[2] = tZ * dot;
		
		return res;
	}
	
	/**
	 * Calculates the orthogonal projection of the vector {@code (v[0], v[1], v[2])} onto the target vector {@code (t[0], t[1], t[2])}
	 * and saves the result in the result array.
	 * The target vector to project on has to be a unit vector.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * @param v The vector to project. Minimum legth: 3.
	 * @param t The target vector to project on. Minimum legth: 3.
	 * @param res The result array. Minimum legth: 3.
	 * 
	 * @return The result array with the result.
	 */
	public static float[] project(@MinLength(3) float[] v, @MinLength(3) float[] t, @ExtractionParam @MinLength(3) float[] res)
	{
		float dot = v[0] * t[0] + v[1] * t[1] + v[2] * t[2];
		
		res[0] = t[0] * dot;
		res[1] = t[1] * dot;
		res[2] = t[2] * dot;
		
		return res;
	}
	
	/**
	 * Calculates the orthogonal projection of the vector {@code (v[0], v[1], v[2])} onto the target vector {@code (tX, tY, tZ)}
	 * and saves the result in the result array.
	 * The target vector to project on has to be a unit vector.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * @param v The vector to project. Minimum legth: 3.
	 * @param tX The value of the x component of the target vector to project on.
	 * @param tY The value of the y component of the target vector to project on.
	 * @param tZ The value of the z component of the target vector to project on.
	 * @param res The result array. Minimum legth: 3.
	 * 
	 * @return The result array with the result.
	 */
	public static float[] project(@MinLength(3) float[] v, float tX, float tY, float tZ, @ExtractionParam @MinLength(3) float[] res)
	{
		float dot = v[0] * tX + v[1] * tY + v[2] * tZ;
		
		res[0] = tX * dot;
		res[1] = tY * dot;
		res[2] = tZ * dot;
		
		return res;
	}
	
	/**
	 * Calculates the orthogonal projection of the vector {@code (vX, vY, vZ)} onto the target vector {@code (t)}
	 * and saves the result in the result array.
	 * The target vector to project on has to be a unit vector.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * @param vX The value of the x component of the vector to project.
	 * @param vY The value of the y component of the vector to project.
	 * @param vZ The value of the z component of the vector to project.
	 * @param t The target vector to project on.
	 * @param res The result array. Minimum legth: 3.
	 * 
	 * @return The result array with the result.
	 */
	public static float[] project(float vX, float vY, float vZ, Vec3fR t, @ExtractionParam @MinLength(3) float[] res)
	{
		float tX = t.getX();
		float tY = t.getY();
		float tZ = t.getZ();
		
		float dot = vX * tX + vY * tY + vZ * tZ;
		
		res[0] = tX * dot;
		res[1] = tY * dot;
		res[2] = tZ * dot;
		
		return res;
	}
	
	/**
	 * Calculates the orthogonal projection of the vector {@code (vX, vY, vZ)} onto the target vector {@code (t[0], t[1], t[2])}
	 * and saves the result in the result array.
	 * The target vector to project on has to be a unit vector.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * @param vX The value of the x component of the vector to project.
	 * @param vY The value of the y component of the vector to project.
	 * @param vZ The value of the z component of the vector to project.
	 * @param t The target vector to project on. Minimum legth: 3.
	 * @param res The result array. Minimum legth: 3.
	 * 
	 * @return The result array with the result.
	 */
	public static float[] project(float vX, float vY, float vZ, @MinLength(3) float[] t, @ExtractionParam @MinLength(3) float[] res)
	{
		float dot = vX * t[0] + vY * t[1] + vZ * t[2];
		
		res[0] = t[0] * dot;
		res[1] = t[1] * dot;
		res[2] = t[2] * dot;
		
		return res;
	}
	
	/**
	 * Calculates the orthogonal projection of the vector {@code (vX, vY, vZ)} onto the target vector {@code (tX, tY, tZ)}
	 * and saves the result in the result array.
	 * The target vector to project on has to be a unit vector.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * @param vX The value of the x component of the vector to project.
	 * @param vY The value of the y component of the vector to project.
	 * @param vZ The value of the z component of the vector to project.
	 * @param tX The value of the x component of the target vector to project on.
	 * @param tY The value of the y component of the target vector to project on.
	 * @param tZ The value of the z component of the target vector to project on.
	 * @param res The result array. Minimum legth: 3.
	 * 
	 * @return The result array with the result.
	 */
	public static float[] project(float vX, float vY, float vZ, float tX, float tY, float tZ, @ExtractionParam @MinLength(3) float[] res)
	{
		float dot = vX * tX + vY * tY + vZ * tZ;
		
		res[0] = tX * dot;
		res[1] = tY * dot;
		res[2] = tZ * dot;
		
		return res;
	}

	/**
	 * Calculates the orthogonal projection of the vector {@code (v)} onto the target vector {@code (t)}
	 * and saves the result in the given result vector.
	 * The target vector to project on has to be a unit vector.
	 * 
	 * @param <T> The type of the result vector.
	 * 
	 * @param v The vector to project.
	 * @param t The target vector to project on.
	 * @param res The result vector.
	 * 
	 * @return The result vector with the result.
	 */
	public static <T extends Vec3fC> T project(Vec3fR v, Vec3fR t, @ExtractionParam T res)
	{
		float tX = t.getX();
		float tY = t.getY();
		float tZ = t.getZ();
		
		float dot = v.getX() * tX + v.getY() * tY + v.getZ() * tZ;

		res.set(tX * dot, tY * dot, tZ * dot);
		
		return res;
	}
	
	/**
	 * Calculates the orthogonal projection of the vector {@code (v)} onto the target vector {@code (t[0], t[1], t[2])}
	 * and saves the result in the given result vector.
	 * The target vector to project on has to be a unit vector.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * @param <T> The type of the result vector.
	 * 
	 * @param v The vector to project.
	 * @param t The target vector to project on. Minimum legth: 3.
	 * @param res The result vector.
	 * 
	 * @return The result vector with the result.
	 */
	public static <T extends Vec3fC> T project(Vec3fR v, @MinLength(3) float[] t, @ExtractionParam T res)
	{
		float dot = v.getX() * t[0] + v.getY() * t[1] + v.getZ() * t[2];

		res.set(t[0] * dot, t[1] * dot, t[2] * dot);
		
		return res;
	}
	
	/**
	 * Calculates the orthogonal projection of the vector {@code (v)} onto the target vector {@code (tX, tY, tZ)}
	 * and saves the result in the given result vector.
	 * The target vector to project on has to be a unit vector.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * @param <T> The type of the result vector.
	 * 
	 * @param v The vector to project.
	 * @param tX The value of the x component of the target vector to project on.
	 * @param tY The value of the y component of the target vector to project on.
	 * @param tZ The value of the z component of the target vector to project on.
	 * @param res The result vector.
	 * 
	 * @return The result vector with the result.
	 */
	public static <T extends Vec3fC> T project(Vec3fR v, float tX, float tY, float tZ, @ExtractionParam T res)
	{
		float dot = v.getX() * tX + v.getY() * tY + v.getZ() * tZ;

		res.set(tX * dot, tY * dot, tZ * dot);
		
		return res;
	}
	
	/**
	 * Calculates the orthogonal projection of the vector {@code (v[0], v[1], v[2])} onto the target vector {@code (t)}
	 * and saves the result in the given result vector.
	 * The target vector to project on has to be a unit vector.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * @param <T> The type of the result vector.
	 * 
	 * @param v The vector to project. Minimum legth: 3.
	 * @param t The target vector to project on.
	 * @param res The result vector.
	 * 
	 * @return The result vector with the result.
	 */
	public static <T extends Vec3fC> T project(@MinLength(3) float[] v, Vec3fR t, @ExtractionParam T res)
	{
		float tX = t.getX();
		float tY = t.getY();
		float tZ = t.getZ();
		
		float dot = v[0] * tX + v[1] * tY + v[2] * tZ;

		res.set(tX * dot, tY * dot, tZ * dot);
		
		return res;
	}
	
	/**
	 * Calculates the orthogonal projection of the vector {@code (v[0], v[1], v[2])} onto the target vector {@code (t[0], t[1], t[2])}
	 * and saves the result in the given result vector.
	 * The target vector to project on has to be a unit vector.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * @param <T> The type of the result vector.
	 * 
	 * @param v The vector to project. Minimum legth: 3.
	 * @param t The target vector to project on. Minimum legth: 3.
	 * @param res The result vector.
	 * 
	 * @return The result vector with the result.
	 */
	public static <T extends Vec3fC> T project(@MinLength(3) float[] v, @MinLength(3) float[] t, @ExtractionParam T res)
	{
		float dot = v[0] * t[0] + v[1] * t[1] + v[2] * t[2];

		res.set(t[0] * dot, t[1] * dot, t[2] * dot);
		
		return res;
	}
	
	/**
	 * Calculates the orthogonal projection of the vector {@code (v[0], v[1], v[2])} onto the target vector {@code (tX, tY, tZ)}
	 * and saves the result in the given result vector.
	 * The target vector to project on has to be a unit vector.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * @param <T> The type of the result vector.
	 * 
	 * @param v The vector to project. Minimum legth: 3.
	 * @param tX The value of the x component of the target vector to project on.
	 * @param tY The value of the y component of the target vector to project on.
	 * @param tZ The value of the z component of the target vector to project on.
	 * @param res The result vector.
	 * 
	 * @return The result vector with the result.
	 */
	public static <T extends Vec3fC> T project(@MinLength(3) float[] v, float tX, float tY, float tZ, @ExtractionParam T res)
	{
		float dot = v[0] * tX + v[1] * tY + v[2] * tZ;

		res.set(tX * dot, tY * dot, tZ * dot);
		
		return res;
	}
	
	/**
	 * Calculates the orthogonal projection of the vector {@code (vX, vY, vZ)} onto the target vector {@code (t)}
	 * and saves the result in the given result vector.
	 * The target vector to project on has to be a unit vector.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * @param <T> The type of the result vector.
	 * 
	 * @param vX The value of the x component of the vector to project.
	 * @param vY The value of the y component of the vector to project.
	 * @param vZ The value of the z component of the vector to project.
	 * @param t The target vector to project on.
	 * @param res The result vector.
	 * 
	 * @return The result vector with the result.
	 */
	public static <T extends Vec3fC> T project(float vX, float vY, float vZ, Vec3fR t, @ExtractionParam T res)
	{
		float tX = t.getX();
		float tY = t.getY();
		float tZ = t.getZ();
		
		float dot = vX * tX + vY * tY + vZ * tZ;

		res.set(tX * dot, tY * dot, tZ * dot);
		
		return res;
	}
	
	/**
	 * Calculates the orthogonal projection of the vector {@code (vX, vY, vZ)} onto the target vector {@code (t[0], t[1], t[2])}
	 * and saves the result in the given result vector.
	 * The target vector to project on has to be a unit vector.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * @param <T> The type of the result vector.
	 * 
	 * @param vX The value of the x component of the vector to project.
	 * @param vY The value of the y component of the vector to project.
	 * @param vZ The value of the z component of the vector to project.
	 * @param t The target vector to project on. Minimum legth: 3.
	 * @param res The result vector.
	 * 
	 * @return The result vector with the result.
	 */
	public static <T extends Vec3fC> T project(float vX, float vY, float vZ, @MinLength(3) float[] t, @ExtractionParam T res)
	{
		float dot = vX * t[0] + vY * t[1] + vZ * t[2];

		res.set(t[0] * dot, t[1] * dot, t[2] * dot);
		
		return res;
	}
	
	/**
	 * Calculates the orthogonal projection of the vector {@code (vX, vY, vZ)} onto the target vector {@code (tX, tY, tZ)}
	 * and saves the result in the given result vector.
	 * The target vector to project on has to be a unit vector.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * @param <T> The type of the result vector.
	 * 
	 * @param vX The value of the x component of the vector to project.
	 * @param vY The value of the y component of the vector to project.
	 * @param vZ The value of the z component of the vector to project.
	 * @param tX The value of the x component of the target vector to project on.
	 * @param tY The value of the y component of the target vector to project on.
	 * @param tZ The value of the z component of the target vector to project on.
	 * @param res The result vector.
	 * 
	 * @return The result vector with the result.
	 */
	public static <T extends Vec3fC> T project(float vX, float vY, float vZ, float tX, float tY, float tZ, @ExtractionParam T res)
	{
		float dot = vX * tX + vY * tY + vZ * tZ;

		res.set(tX * dot, tY * dot, tZ * dot);
		
		return res;
	}
	
	/**
	 * Calculates the reflection of the vector {@code (v)} based on the given surface normal represented by the vector {@code (n)}
	 * and saves the result in the result array.
	 * The surface normal has to be normalized.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * @param v The vector to reflect.
	 * @param n The surface normal vector.
	 * @param res The result array. Minimum legth: 3.
	 * 
	 * @return The result array with the result.
	 */
	public static float[] reflect(Vec3fR v, Vec3fR n, @ExtractionParam @MinLength(3) float[] res)
	{
		float vX = v.getX();
		float vY = v.getY();
		float vZ = v.getZ();
		float nX = n.getX();
		float nY = n.getY();
		float nZ = n.getZ();
		
		float doubleDot = -2.0f * (vX * nX + vY * nY + vZ * nZ);
		
		res[0] = nX * doubleDot + vX;
		res[1] = nY * doubleDot + vY;
		res[2] = nZ * doubleDot + vZ;
		
		return res;
	}
	
	/**
	 * Calculates the reflection of the vector {@code (v)} based on the given surface normal represented by the vector {@code (n[0], n[1], n[2])}
	 * and saves the result in the result array.
	 * The surface normal has to be normalized.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * @param v The vector to reflect.
	 * @param n The surface normal vector. Minimum legth: 3.
	 * @param res The result array. Minimum legth: 3.
	 * 
	 * @return The result array with the result.
	 */
	public static float[] reflect(Vec3fR v, @MinLength(3) float[] n, @ExtractionParam @MinLength(3) float[] res)
	{
		float vX = v.getX();
		float vY = v.getY();
		float vZ = v.getZ();
		
		float doubleDot = -2.0f * (vX * n[0] + vY * n[1] + vZ * n[2]);
		
		res[0] = n[0] * doubleDot + vX;
		res[1] = n[1] * doubleDot + vY;
		res[2] = n[2] * doubleDot + vZ;
		
		return res;
	}
	
	/**
	 * Calculates the reflection of the vector {@code (v)} based on the given surface normal represented by the vector {@code (nX, nY, nZ)}
	 * and saves the result in the result array.
	 * The surface normal has to be normalized.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * @param v The vector to reflect.
	 * @param nX The value of the x component of the surface normal vector.
	 * @param nY The value of the y component of the surface normal vector.
	 * @param nZ The value of the z component of the surface normal vector.
	 * @param res The result array. Minimum legth: 3.
	 * 
	 * @return The result array with the result.
	 */
	public static float[] reflect(Vec3fR v, float nX, float nY, float nZ, @ExtractionParam @MinLength(3) float[] res)
	{
		float vX = v.getX();
		float vY = v.getY();
		float vZ = v.getZ();
		
		float doubleDot = -2.0f * (vX * nX + vY * nY + vZ * nZ);
		
		res[0] = nX * doubleDot + vX;
		res[1] = nY * doubleDot + vY;
		res[2] = nZ * doubleDot + vZ;
		
		return res;
	}
	
	/**
	 * Calculates the reflection of the vector {@code (v[0], v[1], v[2])} based on the given surface normal represented by the vector {@code (n)}
	 * and saves the result in the result array.
	 * The surface normal has to be normalized.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * @param v The vector to reflect. Minimum legth: 3.
	 * @param n The surface normal vector.
	 * @param res The result array. Minimum legth: 3.
	 * 
	 * @return The result array with the result.
	 */
	public static float[] reflect(@MinLength(3) float[] v, Vec3fR n, @ExtractionParam @MinLength(3) float[] res)
	{
		float nX = n.getX();
		float nY = n.getY();
		float nZ = n.getZ();
		
		float doubleDot = -2.0f * (v[0] * nX + v[1] * nY + v[2] * nZ);
		
		res[0] = nX * doubleDot + v[0];
		res[1] = nY * doubleDot + v[1];
		res[2] = nZ * doubleDot + v[2];
		
		return res;
	}
	
	/**
	 * Calculates the reflection of the vector {@code (v[0], v[1], v[2])} based on the given surface normal represented
	 * by the vector {@code (n[0], n[1], n[2])} and saves the result in the result array.
	 * The surface normal has to be normalized.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * @param v The vector to reflect. Minimum legth: 3.
	 * @param n The surface normal vector. Minimum legth: 3.
	 * @param res The result array. Minimum legth: 3.
	 * 
	 * @return The result array with the result.
	 */
	public static float[] reflect(@MinLength(3) float[] v, @MinLength(3) float[] n, @ExtractionParam @MinLength(3) float[] res)
	{
		float doubleDot = -2.0f * (v[0] * n[0] + v[1] * n[1] + v[2] * n[2]);
		
		res[0] = n[0] * doubleDot + v[0];
		res[1] = n[1] * doubleDot + v[1];
		res[2] = n[2] * doubleDot + v[2];
		
		return res;
	}
	
	/**
	 * Calculates the reflection of the vector {@code (v[0], v[1], v[2])} based on the given surface normal represented
	 * by the vector {@code (nX, nY, nZ)} and saves the result in the result array.
	 * The surface normal has to be normalized.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * @param v The vector to reflect. Minimum legth: 3.
	 * @param nX The value of the x component of the surface normal vector.
	 * @param nY The value of the y component of the surface normal vector.
	 * @param nZ The value of the z component of the surface normal vector.
	 * @param res The result array. Minimum legth: 3.
	 * 
	 * @return The result array with the result.
	 */
	public static float[] reflect(@MinLength(3) float[] v, float nX, float nY, float nZ, @ExtractionParam @MinLength(3) float[] res)
	{
		float doubleDot = -2.0f * (v[0] * nX + v[1] * nY + v[2] * nZ);
		
		res[0] = nX * doubleDot + v[0];
		res[1] = nY * doubleDot + v[1];
		res[2] = nZ * doubleDot + v[2];
		
		return res;
	}
	
	/**
	 * Calculates the reflection of the vector {@code (vX, vY, vZ)} based on the given surface normal represented by the vector {@code (n)}
	 * and saves the result in the result array.
	 * The surface normal has to be normalized.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * @param vX The value of the x component of the vector to reflect.
	 * @param vY The value of the y component of the vector to reflect.
	 * @param vZ The value of the z component of the vector to reflect.
	 * @param n The surface normal vector.
	 * @param res The result array. Minimum legth: 3.
	 * 
	 * @return The result array with the result.
	 */
	public static float[] reflect(float vX, float vY, float vZ, Vec3fR n, @ExtractionParam @MinLength(3) float[] res)
	{
		float nX = n.getX();
		float nY = n.getY();
		float nZ = n.getZ();
		
		float doubleDot = -2.0f * (vX * nX + vY * nY + vZ * nZ);
		
		res[0] = nX * doubleDot + vX;
		res[1] = nY * doubleDot + vY;
		res[2] = nZ * doubleDot + vZ;
		
		return res;
	}
	
	/**
	 * Calculates the reflection of the vector {@code (vX, vY, vZ)} based on the given surface normal represented
	 * by the vector {@code (n[0], n[1], n[2])} and saves the result in the result array.
	 * The surface normal has to be normalized.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * @param vX The value of the x component of the vector to reflect.
	 * @param vY The value of the y component of the vector to reflect.
	 * @param vZ The value of the z component of the vector to reflect.
	 * @param n The surface normal vector. Minimum legth: 3.
	 * @param res The result array. Minimum legth: 3.
	 * 
	 * @return The result array with the result.
	 */
	public static float[] reflect(float vX, float vY, float vZ, @MinLength(3) float[] n, @ExtractionParam @MinLength(3) float[] res)
	{
		float doubleDot = -2.0f * (vX * n[0] + vY * n[1] + vZ * n[2]);
		
		res[0] = n[0] * doubleDot + vX;
		res[1] = n[1] * doubleDot + vY;
		res[2] = n[2] * doubleDot + vZ;
		
		return res;
	}
	
	/**
	 * Calculates the reflection of the vector {@code (vX, vY, vZ)} based on the given surface normal represented
	 * by the vector {@code (nX, nY, nZ)} and saves the result in the result array.
	 * The surface normal has to be normalized.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * @param vX The value of the x component of the vector to reflect.
	 * @param vY The value of the y component of the vector to reflect.
	 * @param vZ The value of the z component of the vector to reflect.
	 * @param nX The value of the x component of the surface normal vector.
	 * @param nY The value of the y component of the surface normal vector.
	 * @param nZ The value of the z component of the surface normal vector.
	 * @param res The result array. Minimum legth: 3.
	 * 
	 * @return The result array with the result.
	 */
	public static float[] reflect(float vX, float vY, float vZ, float nX, float nY, float nZ, @ExtractionParam @MinLength(3) float[] res)
	{
		float doubleDot = -2.0f * (vX * nX + vY * nY + vZ * nZ);
		
		res[0] = nX * doubleDot + vX;
		res[1] = nY * doubleDot + vY;
		res[2] = nZ * doubleDot + vZ;
		
		return res;
	}
	
	/**
	 * Calculates the reflection of the vector {@code (v)} based on the given surface normal represented by the vector {@code (n)}
	 * and saves the result in the given result vector.
	 * The surface normal has to be normalized.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * @param <T> The type of the result vector.
	 * 
	 * @param v The vector to reflect.
	 * @param n The surface normal vector.
	 * @param res The result vector.
	 * 
	 * @return The result vector with the result.
	 */
	public static <T extends Vec3fC> T reflect(Vec3fR v, Vec3fR n, @ExtractionParam T res)
	{
		float vX = v.getX();
		float vY = v.getY();
		float vZ = v.getZ();
		float nX = n.getX();
		float nY = n.getY();
		float nZ = n.getZ();
		
		float doubleDot = -2.0f * (vX * nX + vY * nY + vZ * nZ);

		res.set(nX * doubleDot + vX, nY * doubleDot + vY, nZ * doubleDot + vZ);
		
		return res;
	}
	
	/**
	 * Calculates the reflection of the vector {@code (v)} based on the given surface normal represented by the vector {@code (n[0], n[1], n[2])}
	 * and saves the result in the given result vector.
	 * The surface normal has to be normalized.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * @param <T> The type of the result vector.
	 * 
	 * @param v The vector to reflect.
	 * @param n The surface normal vector. Minimum legth: 3.
	 * @param res The result vector.
	 * 
	 * @return The result vector with the result.
	 */
	public static <T extends Vec3fC> T reflect(Vec3fR v, @MinLength(3) float[] n, @ExtractionParam T res)
	{
		float vX = v.getX();
		float vY = v.getY();
		float vZ = v.getZ();
		
		float doubleDot = -2.0f * (vX * n[0] + vY * n[1] + vZ * n[2]);

		res.set(n[0] * doubleDot + vX, n[1] * doubleDot + vY, n[2] * doubleDot + vZ);
		
		return res;
	}
	
	/**
	 * Calculates the reflection of the vector {@code (v)} based on the given surface normal represented by the vector {@code (nX, nY, nZ)}
	 * and saves the result in the given result vector.
	 * The surface normal has to be normalized.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * @param <T> The type of the result vector.
	 * 
	 * @param v The vector to reflect.
	 * @param nX The value of the x component of the surface normal vector.
	 * @param nY The value of the y component of the surface normal vector.
	 * @param nZ The value of the z component of the surface normal vector.
	 * @param res The result vector.
	 * 
	 * @return The result vector with the result.
	 */
	public static <T extends Vec3fC> T reflect(Vec3fR v, float nX, float nY, float nZ, @ExtractionParam T res)
	{
		float vX = v.getX();
		float vY = v.getY();
		float vZ = v.getZ();
		
		float doubleDot = -2.0f * (vX * nX + vY * nY + vZ * nZ);

		res.set(nX * doubleDot + vX, nY * doubleDot + vY, nZ * doubleDot + vZ);
		
		return res;
	}
	
	/**
	 * Calculates the reflection of the vector {@code (v[0], v[1], v[2])} based on the given surface normal represented by the vector {@code (n)}
	 * and saves the result in the given result vector.
	 * The surface normal has to be normalized.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * @param <T> The type of the result vector.
	 * 
	 * @param v The vector to reflect. Minimum legth: 3.
	 * @param n The surface normal vector.
	 * @param res The result vector.
	 * 
	 * @return The result vector with the result.
	 */
	public static <T extends Vec3fC> T reflect(@MinLength(3) float[] v, Vec3fR n, @ExtractionParam T res)
	{
		float nX = n.getX();
		float nY = n.getY();
		float nZ = n.getZ();
		
		float doubleDot = -2.0f * (v[0] * nX + v[1] * nY + v[2] * nZ);

		res.set(nX * doubleDot + v[0], nY * doubleDot + v[1], nZ * doubleDot + v[2]);
		
		return res;
	}
	
	/**
	 * Calculates the reflection of the vector {@code (v[0], v[1], v[2])} based on the given surface normal represented
	 * by the vector {@code (n[0], n[1], n[2])} and saves the result in the given result vector.
	 * The surface normal has to be normalized.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * @param <T> The type of the result vector.
	 * 
	 * @param v The vector to reflect. Minimum legth: 3.
	 * @param n The surface normal vector. Minimum legth: 3.
	 * @param res The result vector.
	 * 
	 * @return The result vector with the result.
	 */
	public static <T extends Vec3fC> T reflect(@MinLength(3) float[] v, @MinLength(3) float[] n, @ExtractionParam T res)
	{
		float doubleDot = -2.0f * (v[0] * n[0] + v[1] * n[1] + v[2] * n[2]);

		res.set(n[0] * doubleDot + v[0], n[1] * doubleDot + v[1], n[2] * doubleDot + v[2]);
		
		return res;
	}
	
	/**
	 * Calculates the reflection of the vector {@code (v[0], v[1], v[2])} based on the given surface normal represented
	 * by the vector {@code (nX, nY, nZ)} and saves the result in the given result vector.
	 * The surface normal has to be normalized.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * @param <T> The type of the result vector.
	 * 
	 * @param v The vector to reflect. Minimum legth: 3.
	 * @param nX The value of the x component of the surface normal vector.
	 * @param nY The value of the y component of the surface normal vector.
	 * @param nZ The value of the z component of the surface normal vector.
	 * @param res The result vector.
	 * 
	 * @return The result vector with the result.
	 */
	public static <T extends Vec3fC> T reflect(@MinLength(3) float[] v, float nX, float nY, float nZ, @ExtractionParam T res)
	{
		float doubleDot = -2.0f * (v[0] * nX + v[1] * nY + v[2] * nZ);

		res.set(nX * doubleDot + v[0], nY * doubleDot + v[1], nZ * doubleDot + v[2]);
		
		return res;
	}
	
	/**
	 * Calculates the reflection of the vector {@code (vX, vY, vZ)} based on the given surface normal represented by the vector {@code (n)}
	 * and saves the result in the given result vector.
	 * The surface normal has to be normalized.
	 * 
	 * @param <T> The type of the result vector.
	 * 
	 * @param vX The value of the x component of the vector to reflect.
	 * @param vY The value of the y component of the vector to reflect.
	 * @param vZ The value of the z component of the vector to reflect.
	 * @param n The surface normal vector.
	 * @param res The result vector.
	 * 
	 * @return The result vector with the result.
	 */
	public static <T extends Vec3fC> T reflect(float vX, float vY, float vZ, Vec3fR n, @ExtractionParam T res)
	{
		float nX = n.getX();
		float nY = n.getY();
		float nZ = n.getZ();
		
		float doubleDot = -2.0f * (vX * nX + vY * nY + vZ * nZ);

		res.set(nX * doubleDot + vX, nY * doubleDot + vY, nZ * doubleDot + vZ);
		
		return res;
	}
	
	/**
	 * Calculates the reflection of the vector {@code (vX, vY, vZ)} based on the given surface normal represented
	 * by the vector {@code (n[0], n[1], n[2])} and saves the result in the given result vector.
	 * The surface normal has to be normalized.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * @param <T> The type of the result vector.
	 * 
	 * @param vX The value of the x component of the vector to reflect.
	 * @param vY The value of the y component of the vector to reflect.
	 * @param vZ The value of the z component of the vector to reflect.
	 * @param n The surface normal vector. Minimum legth: 3.
	 * @param res The result vector.
	 * 
	 * @return The result vector with the result.
	 */
	public static <T extends Vec3fC> T reflect(float vX, float vY, float vZ, @MinLength(3) float[] n, @ExtractionParam T res)
	{
		float doubleDot = -2.0f * (vX * n[0] + vY * n[1] + vZ * n[2]);
		
		res.set(n[0] * doubleDot + vX, n[1] * doubleDot + vY, n[2] * doubleDot + vZ);
		
		return res;
	}
	
	/**
	 * Calculates the reflection of the vector {@code (vX, vY, vZ)} based on the given surface normal represented
	 * by the vector {@code (nX, nY, nZ)} and saves the result in the given result vector.
	 * The surface normal has to be normalized.
	 * 
	 * @param <T> The type of the result vector.
	 * 
	 * @param vX The value of the x component of the vector to reflect.
	 * @param vY The value of the y component of the vector to reflect.
	 * @param vZ The value of the z component of the vector to reflect.
	 * @param nX The value of the x component of the surface normal vector.
	 * @param nY The value of the y component of the surface normal vector.
	 * @param nZ The value of the z component of the surface normal vector.
	 * @param res The result vector.
	 * 
	 * @return The result vector with the result.
	 */
	public static <T extends Vec3fC> T reflect(float vX, float vY, float vZ, float nX, float nY, float nZ, @ExtractionParam T res)
	{
		float doubleDot = -2.0f * (vX * nX + vY * nY + vZ * nZ);
		
		res.set(nX * doubleDot + vX, nY * doubleDot + vY, nZ * doubleDot + vZ);
		
		return res;
	}
	
	/**
	 * Calculates the absolute of the vector {@code (v)} and saves the result in the given result vector.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * @param v The vector.
	 * @param res The result array. Minimum legth: 3.
	 * 
	 * @return The result array with the result.
	 */
	public static float[] abs(Vec3fR v, @ExtractionParam @MinLength(3) float[] res)
	{
		res[0] = BarghosMath.abs(v.getX());
		res[1] = BarghosMath.abs(v.getY());
		res[2] = BarghosMath.abs(v.getZ());
		
		return res;
	}
	
	/**
	 * Calculates the absolute of the vector {@code (v[0], v[1], v[2])} and saves the result in the given result vector.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * @param v The vector. Minimum legth: 3.
	 * @param res The result array. Minimum legth: 3.
	 * 
	 * @return The result array with the result.
	 */
	public static float[] abs(@MinLength(3) float[] v, @ExtractionParam @MinLength(3) float[] res)
	{
		res[0] = BarghosMath.abs(v[0]);
		res[1] = BarghosMath.abs(v[1]);
		res[2] = BarghosMath.abs(v[2]);
		
		return res;
	}
	
	/**
	 * Calculates the absolute of the vector {@code (vX, vY, vZ)} and saves the result in the given result vector.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * @param vX The value of the x component of the vector.
	 * @param vY The value of the y component of the vector.
	 * @param vZ The value of the z component of the vector.
	 * @param res The result array. Minimum legth: 3.
	 * 
	 * @return The result array with the result.
	 */
	public static float[] abs(float vX, float vY, float vZ, @ExtractionParam @MinLength(3) float[] res)
	{
		res[0] = BarghosMath.abs(vX);
		res[1] = BarghosMath.abs(vY);
		res[2] = BarghosMath.abs(vZ);
		
		return res;
	}
	
	/**
	 * Calculates the absolute of the vector {@code (v)} and saves the result in the given result vector.
	 * 
	 * @param <T> The type of the result vector.
	 * 
	 * @param v The vector.
	 * @param res The result vector.
	 * 
	 * @return The result vector with the result.
	 */
	public static <T extends Vec3fC> T abs(Vec3fR v, @ExtractionParam T res)
	{
		res.set(BarghosMath.abs(v.getX()), BarghosMath.abs(v.getY()), BarghosMath.abs(v.getZ()));
		
		return res;
	}
	
	/**
	 * Calculates the absolute of the vector {@code (v[0], v[1], v[2])} and saves the result in the given result vector.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * @param <T> The type of the result vector.
	 * 
	 * @param v The vector. Minimum legth: 3.
	 * @param res The result vector.
	 * 
	 * @return The result vector with the result.
	 */
	public static <T extends Vec3fC> T abs(@MinLength(3) float[] v, @ExtractionParam T res)
	{
		res.set(BarghosMath.abs(v[0]), BarghosMath.abs(v[1]), BarghosMath.abs(v[2]));
		
		return res;
	}
	
	/**
	 * Calculates the absolute of the vector {@code (vX, vY, vZ)} and saves the result in the given result vector.
	 * 
	 * @param <T> The type of the result vector.
	 * 
	 * @param vX The value of the x component of the vector.
	 * @param vY The value of the y component of the vector.
	 * @param vZ The value of the z component of the vector.
	 * @param res The result vector.
	 * 
	 * @return The result vector with the result.
	 */
	public static <T extends Vec3fC> T abs(float vX, float vY, float vZ, @ExtractionParam T res)
	{
		res.set(BarghosMath.abs(vX), BarghosMath.abs(vY), BarghosMath.abs(vZ));
		
		return res;
	}
	
	/**
	 * Determines the signum of the components of the vector {@code (v)} and saves the result in the given result vector.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * @param v The vector.
	 * @param res The result array. Minimum legth: 3.
	 * 
	 * @return The result array with the result.
	 */
	public static float[] signum(Vec3fR v, @ExtractionParam @MinLength(3) float[] res)
	{
		res[0] = BarghosMath.signum(v.getX());
		res[1] = BarghosMath.signum(v.getY());
		res[2] = BarghosMath.signum(v.getZ());
		
		return res;
	}
	
	/**
	 * Determines the signum of the components of the vector {@code (v[0], v[1], v[2])} and saves the result in the given result vector.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * @param v The vector.
	 * @param res The result array. Minimum legth: 3.
	 * 
	 * @return The result array with the result.
	 */
	public static float[] signum(@MinLength(3) float[] v, @ExtractionParam @MinLength(3) float[] res)
	{
		res[0] = BarghosMath.signum(v[0]);
		res[1] = BarghosMath.signum(v[1]);
		res[2] = BarghosMath.signum(v[2]);
		
		return res;
	}
	
	/**
	 * Determines the signum of the components of the vector {@code (vX, vY, vZ)} and saves the result in the given result vector.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * @param vX The value of the x component of the vector.
	 * @param vY The value of the y component of the vector.
	 * @param vZ The value of the z component of the vector.
	 * @param res The result array. Minimum legth: 3.
	 * 
	 * @return The result array with the result.
	 */
	public static float[] signum(float vX, float vY, float vZ, @ExtractionParam @MinLength(3) float[] res)
	{
		res[0] = BarghosMath.signum(vX);
		res[1] = BarghosMath.signum(vY);
		res[2] = BarghosMath.signum(vZ);
		
		return res;
	}
	
	/**
	 * Determines the signum of the components of the vector {@code (v)} and saves the result in the given result vector.
	 * 
	 * @param <T> The type of the result vector.
	 * 
	 * @param v The vector.
	 * @param res The result vector.
	 * 
	 * @return The result vector with the result.
	 */
	public static <T extends Vec3fC> T signum(Vec3fR v, @ExtractionParam T res)
	{
		res.set(BarghosMath.signum(v.getX()), BarghosMath.signum(v.getY()), BarghosMath.signum(v.getZ()));
		
		return res;
	}
	
	/**
	 * Determines the signum of the components of the vector {@code (v[0], v[1], v[2])} and saves the result in the given result vector.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * @param <T> The type of the result vector.
	 * 
	 * @param v The vector.
	 * @param res The result vector.
	 * 
	 * @return The result vector with the result.
	 */
	public static <T extends Vec3fC> T signum(@MinLength(3) float[] v, @ExtractionParam T res)
	{
		res.set(BarghosMath.signum(v[0]), BarghosMath.signum(v[1]), BarghosMath.signum(v[2]));
		
		return res;
	}
	
	/**
	 * Determines the signum of the components of the vector {@code (vX, vY, vZ)} and saves the result in the given result vector.
	 * 
	 * @param <T> The type of the result vector.
	 * 
	 * @param vX The value of the x component of the vector.
	 * @param vY The value of the y component of the vector.
	 * @param vZ The value of the z component of the vector.
	 * @param res The result vector.
	 * 
	 * @return The result vector with the result.
	 */
	public static <T extends Vec3fC> T signum(float vX, float vY, float vZ, @ExtractionParam T res)
	{
		res.set(BarghosMath.signum(vX), BarghosMath.signum(vY), BarghosMath.signum(vZ));
		
		return res;
	}
	
	/**
	 * Calculates the cosine angle from the vector {@code (v1)} to the vector {@code (v2)} under the assumption
	 * that both vectors are unit vectors. If the vectors are not unit vectors the result will be biased.
	 * 
	 * @param v1 The first vector.
	 * @param v2 The second vector.
	 * 
	 * @return The cosine angle between the two vectors.
	 */
	public static float cosAngleToUnsafe(Vec3fR v1, Vec3fR v2)
	{
		// cos(angle) = (v1 . v2)
		// or: cos(angle) = (v1 . v2) / 1
		return v1.getX() * v2.getX() + v1.getY() * v2.getY() + v1.getZ() * v2.getZ();
	}
	
	/**
	 * Calculates the cosine angle from the vector {@code (v1)} to the vector {@code (v2[0], v2[1], v2[2])} under the assumption
	 * that both vectors are unit vectors. If the vectors are not unit vectors the result will be biased.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * @param v1 The first vector.
	 * @param v2 The second vector. Minimum legth: 3.
	 * 
	 * @return The cosine angle between the two vectors.
	 */
	public static float cosAngleToUnsafe(Vec3fR v1, @MinLength(3) float[] v2)
	{
		// cos(angle) = (v1 . v2)
		// or: cos(angle) = (v1 . v2) / 1
		return v1.getX() * v2[0] + v1.getY() * v2[1] + v1.getZ() * v2[2];
	}
	
	/**
	 * Calculates the cosine angle from the vector {@code (v1)} to the vector {@code (v2x, v2y, v2z)} under the assumption
	 * that both vectors are unit vectors. If the vectors are not unit vectors the result will be biased.
	 * 
	 * @param v1 The first vector.
	 * @param v2x The value of the x component of the second vector.
	 * @param v2y The value of the y component of the second vector.
	 * @param v2z The value of the z component of the second vector.
	 * 
	 * @return The cosine angle between the two vectors.
	 */
	public static float cosAngleToUnsafe(Vec3fR v1, float v2x, float v2y, float v2z)
	{
		// cos(angle) = (v1 . v2)
		// or: cos(angle) = (v1 . v2) / 1
		return v1.getX() * v2x + v1.getY() * v2y + v1.getZ() * v2z;
	}
	
	/**
	 * Calculates the cosine angle from the vector {@code (v1[0], v1[1], v1[2])} to the vector {@code (v2)} under the assumption
	 * that both vectors are unit vectors. If the vectors are not unit vectors the result will be biased.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * @param v1 The first vector. Minimum legth: 3.
	 * @param v2 The second vector.
	 * 
	 * @return The cosine angle between the two vectors.
	 */
	public static float cosAngleToUnsafe(@MinLength(3) float[] v1, Vec3fR v2)
	{
		// cos(angle) = (v1 . v2)
		// or: cos(angle) = (v1 . v2) / 1
		return v1[0] * v2.getX() + v1[1] * v2.getY() + v1[2] * v2.getZ();
	}
	
	/**
	 * Calculates the cosine angle from the vector {@code (v1[0], v1[1], v1[2])} to the vector {@code (v2[0], v2[1], v2[2])} under the assumption
	 * that both vectors are unit vectors. If the vectors are not unit vectors the result will be biased.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * @param v1 The first vector. Minimum legth: 3.
	 * @param v2 The second vector. Minimum legth: 3.
	 * 
	 * @return The cosine angle between the two vectors.
	 */
	public static float cosAngleToUnsafe(@MinLength(3) float[] v1, @MinLength(3) float[] v2)
	{
		// cos(angle) = (v1 . v2)
		// or: cos(angle) = (v1 . v2) / 1
		return v1[0] * v2[0] + v1[1] * v2[1] + v1[2] * v2[2];
	}
	
	/**
	 * Calculates the cosine angle from the vector {@code (v1[0], v1[1], v1[2])} to the vector {@code (v2x, v2y, v2z)} under the assumption
	 * that both vectors are unit vectors. If the vectors are not unit vectors the result will be biased.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * @param v1 The first vector. Minimum legth: 3.
	 * @param v2x The value of the x component of the second vector.
	 * @param v2y The value of the y component of the second vector.
	 * @param v2z The value of the z component of the second vector.
	 * 
	 * @return The cosine angle between the two vectors.
	 */
	public static float cosAngleToUnsafe(@MinLength(3) float[] v1, float v2x, float v2y, float v2z)
	{
		// cos(angle) = (v1 . v2)
		// or: cos(angle) = (v1 . v2) / 1
		return v1[0] * v2x + v1[1] * v2y + v1[2] * v2z;
	}

	/**
	 * Calculates the cosine angle from the vector {@code (v1x, v1y, v1z)} to the vector {@code (v2)} under the assumption
	 * that both vectors are unit vectors. If the vectors are not unit vectors the result will be biased.
	 * 
	 * @param v1x The value of the x component of the first vector.
	 * @param v1y The value of the y component of the first vector.
	 * @param v1z The value of the z component of the first vector.
	 * @param v2 The second vector.
	 * 
	 * @return The cosine angle between the two vectors.
	 */
	public static float cosAngleToUnsafe(float v1x, float v1y, float v1z, Vec3fR v2)
	{
		// cos(angle) = (v1 . v2)
		// or: cos(angle) = (v1 . v2) / 1
		return v1x * v2.getX() + v1y * v2.getY() + v1z * v2.getZ();
	}
	
	/**
	 * Calculates the cosine angle from the vector {@code (v1x, v1y, v1z)} to the vector {@code (v2[0], v2[1], v2[2])} under the assumption
	 * that both vectors are unit vectors. If the vectors are not unit vectors the result will be biased.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * @param v1x The value of the x component of the first vector.
	 * @param v1y The value of the y component of the first vector.
	 * @param v1z The value of the z component of the first vector.
	 * @param v2 The second vector. Minimum legth: 3.
	 * 
	 * @return The cosine angle between the two vectors.
	 */
	public static float cosAngleToUnsafe(float v1x, float v1y, float v1z, @MinLength(3) float[] v2)
	{
		// cos(angle) = (v1 . v2)
		// or: cos(angle) = (v1 . v2) / 1
		return v1x * v2[0] + v1y * v2[1] + v1z * v2[2];
	}
	
	/**
	 * Calculates the cosine angle from the vector {@code (v1x, v1y, v1z)} to the vector {@code (v2x, v2y, v2z)} under the assumption
	 * that both vectors are unit vectors. If the vectors are not unit vectors the result will be biased.
	 * 
	 * @param v1x The value of the x component of the first vector.
	 * @param v1y The value of the y component of the first vector.
	 * @param v1z The value of the z component of the first vector.
	 * @param v2x The value of the x component of the second vector.
	 * @param v2y The value of the y component of the second vector.
	 * @param v2z The value of the z component of the second vector.
	 * 
	 * @return The cosine angle between the two vectors.
	 */
	public static float cosAngleToUnsafe(float v1x, float v1y, float v1z, float v2x, float v2y, float v2z)
	{
		// cos(angle) = (v1 . v2)
		// or: cos(angle) = (v1 . v2) / 1
		return v1x * v2x + v1y * v2y + v1z * v2z;
	}
	
	/**
	 * Calculates the cosine angle from the vector {@code (v1)} to the vector {@code (v2)} taking into acount the lengths.
	 * Therefore this does not require the vectors to be unit vectors.
	 * 
	 * @param v1 The first vector.
	 * @param v2 The second vector.
	 * 
	 * @return The cosine angle between the two vectors.
	 */
	public static float cosAngleTo(Vec3fR v1, Vec3fR v2)
	{
		float v1x = v1.getX();
		float v1y = v1.getY();
		float v1z = v1.getZ();
		float v2x = v2.getX();
		float v2y = v2.getY();
		float v2z = v2.getZ();
		
		if(v1x == 0.0f && v1y == 0.0f && v1z == 0.0f) return 0.0f;
		if(v2x == 0.0f && v2y == 0.0f && v2z == 0.0f) return 0.0f;
		
		// cos(angle) = (v1 . v2) / sqrt(|v1|^2 * |v2|^2)
		return (v1x * v2x + v1y * v2y + v1z * v2z) / BarghosMath.sqrt((v1x * v1x + v1y * v1y + v1z * v1z) * (v2x * v2x + v2y * v2y + v2z * v2z));
	}
	
	/**
	 * Calculates the cosine angle from the vector {@code (v1)} to the vector {@code (v2[0], v2[1], v2[2])} taking into acount the lengths.
	 * Therefore this does not require the vectors to be unit vectors.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * @param v1 The first vector.
	 * @param v2 The second vector. Minimum legth: 3.
	 * 
	 * @return The cosine angle between the two vectors.
	 */
	public static float cosAngleTo(Vec3fR v1, @MinLength(3) float[] v2)
	{
		float v1x = v1.getX();
		float v1y = v1.getY();
		float v1z = v1.getZ();
		
		if(v1x == 0.0f && v1y == 0.0f && v1z == 0.0f) return 0.0f;
		if(v2[0] == 0.0f && v2[1] == 0.0f && v2[2] == 0.0f) return 0.0f;
		
		// cos(angle) = (v1 . v2) / sqrt(|v1|^2 * |v2|^2)
		return (v1x * v2[0] + v1y * v2[1] + v1z * v2[2]) / BarghosMath.sqrt((v1x * v1x + v1y * v1y + v1z * v1z) * (v2[0] * v2[0] + v2[1] * v2[1] + v2[2] * v2[2]));
	}
	
	/**
	 * Calculates the cosine angle from the vector {@code (v1)} to the vector {@code (v2x, v2y, v2z)} taking into acount the lengths.
	 * Therefore this does not require the vectors to be unit vectors.
	 * 
	 * @param v1 The first vector.
	 * @param v2x The value of the x component of the second vector.
	 * @param v2y The value of the y component of the second vector.
	 * @param v2z The value of the z component of the second vector.
	 * 
	 * @return The cosine angle between the two vectors.
	 */
	public static float cosAngleTo(Vec3fR v1, float v2x, float v2y, float v2z)
	{
		float v1x = v1.getX();
		float v1y = v1.getY();
		float v1z = v1.getZ();
		
		if(v1x == 0.0f && v1y == 0.0f && v1z == 0.0f) return 0.0f;
		if(v2x == 0.0f && v2y == 0.0f && v2z == 0.0f) return 0.0f;
		
		// cos(angle) = (v1 . v2) / sqrt(|v1|^2 * |v2|^2)
		return (v1x * v2x + v1y * v2y + v1z * v2z) / BarghosMath.sqrt((v1x * v1x + v1y * v1y + v1z * v1z) * (v2x * v2x + v2y * v2y + v2z * v2z));
	}
	
	/**
	 * Calculates the cosine angle from the vector {@code (v1[0], v1[1], v1[2])} to the vector {@code (v2)} taking into acount the lengths.
	 * Therefore this does not require the vectors to be unit vectors.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * @param v1 The first vector. Minimum legth: 3.
	 * @param v2 The second vector.
	 * 
	 * @return The cosine angle between the two vectors.
	 */
	public static float cosAngleTo(@MinLength(3) float[] v1, Vec3fR v2)
	{
		float v2x = v2.getX();
		float v2y = v2.getY();
		float v2z = v2.getZ();
		
		if(v1[0] == 0.0f && v1[1] == 0.0f && v1[2] == 0.0f) return 0.0f;
		if(v2x == 0.0f && v2y == 0.0f && v2z == 0.0f) return 0.0f;
		
		// cos(angle) = (v1 . v2) / sqrt(|v1|^2 * |v2|^2)
		return (v1[0] * v2x + v1[1] * v2y + v1[2] * v2z) / BarghosMath.sqrt((v1[0] * v1[0] + v1[1] * v1[1] + v1[2] * v1[2]) * (v2x * v2x + v2y * v2y + v2z * v2z));
	}
	
	/**
	 * Calculates the cosine angle from the vector {@code (v1[0], v1[1], v1[2])} to the vector {@code (v2[0], v2[1], v2[2])} taking into acount the lengths.
	 * Therefore this does not require the vectors to be unit vectors.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * @param v1 The first vector. Minimum legth: 3.
	 * @param v2 The second vector. Minimum legth: 3.
	 * 
	 * @return The cosine angle between the two vectors.
	 */
	public static float cosAngleTo(@MinLength(3) float[] v1, @MinLength(3) float[] v2)
	{
		if(v1[0] == 0.0f && v1[1] == 0.0f && v1[2] == 0.0f) return 0.0f;
		if(v2[0] == 0.0f && v2[1] == 0.0f && v2[2] == 0.0f) return 0.0f;
		
		// cos(angle) = (v1 . v2) / sqrt(|v1|^2 * |v2|^2)
		return (v1[0] * v2[0] + v1[1] * v2[1] + v1[2] * v2[2]) / BarghosMath.sqrt((v1[0] * v1[0] + v1[1] * v1[1] + v1[2] * v1[2]) * (v2[0] * v2[0] + v2[1] * v2[1] + v2[2] * v2[2]));
	}
	
	/**
	 * Calculates the cosine angle from the vector {@code (v1[0], v1[1], v1[2])} to the vector {@code (v2x, v2y, v2z)} taking into acount the lengths.
	 * Therefore this does not require the vectors to be unit vectors.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * @param v1 The first vector. Minimum legth: 3.
	 * @param v2x The value of the x component of the second vector.
	 * @param v2y The value of the y component of the second vector.
	 * @param v2z The value of the z component of the second vector.
	 * 
	 * @return The cosine angle between the two vectors.
	 */
	public static float cosAngleTo(@MinLength(3) float[] v1, float v2x, float v2y, float v2z)
	{
		if(v1[0] == 0.0f && v1[1] == 0.0f && v1[2] == 0.0f) return 0.0f;
		if(v2x == 0.0f && v2y == 0.0f && v2z == 0.0f) return 0.0f;
		
		// cos(angle) = (v1 . v2) / sqrt(|v1|^2 * |v2|^2)
		return (v1[0] * v2x + v1[1] * v2y + v1[2] * v2z) / BarghosMath.sqrt((v1[0] * v1[0] + v1[1] * v1[1] + v1[2] * v1[2]) * (v2x * v2x + v2y * v2y + v2z * v2z));
	}
	
	/**
	 * Calculates the cosine angle from the vector {@code (v1x, v1y, v1z)} to the vector {@code (v2)} taking into acount the lengths.
	 * Therefore this does not require the vectors to be unit vectors.
	 * 
	 * @param v1x The value of the x component of the first vector.
	 * @param v1y The value of the y component of the first vector.
	 * @param v1z The value of the z component of the first vector.
	 * @param v2 The second vector.
	 * 
	 * @return The cosine angle between the two vectors.
	 */
	public static float cosAngleTo(float v1x, float v1y, float v1z, Vec3fR v2)
	{
		float v2x = v2.getX();
		float v2y = v2.getY();
		float v2z = v2.getZ();
		
		if(v1x == 0.0f && v1y == 0.0f && v1z == 0.0f) return 0.0f;
		if(v2x == 0.0f && v2y == 0.0f && v2z == 0.0f) return 0.0f;
		
		// cos(angle) = (v1 . v2) / sqrt(|v1|^2 * |v2|^2)
		return (v1x * v2x + v1y * v2y + v1z * v2z) / BarghosMath.sqrt((v1x * v1x + v1y * v1y + v1z * v1z) * (v2x * v2x + v2y * v2y + v2z * v2z));
	}
	
	/**
	 * Calculates the cosine angle from the vector {@code (v1x, v1y, v1z)} to the vector {@code (v2[0], v2[1], v2[2])} taking into acount the lengths.
	 * Therefore this does not require the vectors to be unit vectors.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * @param v1x The value of the x component of the first vector.
	 * @param v1y The value of the y component of the first vector.
	 * @param v1z The value of the z component of the first vector.
	 * @param v2 The second vector. Minimum legth: 3.
	 * 
	 * @return The cosine angle between the two vectors.
	 */
	public static float cosAngleTo(float v1x, float v1y, float v1z, @MinLength(3) float[] v2)
	{
		if(v1x == 0.0f && v1y == 0.0f && v1z == 0.0f) return 0.0f;
		if(v2[0] == 0.0f && v2[1] == 0.0f && v2[2] == 0.0f) return 0.0f;
		
		// cos(angle) = (v1 . v2) / sqrt(|v1|^2 * |v2|^2)
		return (v1x * v2[0] + v1y * v2[1] + v1z * v2[2]) / BarghosMath.sqrt((v1x * v1x + v1y * v1y + v1z * v1z) * (v2[0] * v2[0] + v2[1] * v2[1] + v2[2] * v2[2]));
	}
	
	/**
	 * Calculates the cosine angle from the vector {@code (v1x, v1y, v1z)} to the vector {@code (v2x, v2y, v2z)} taking into acount the lengths.
	 * Therefore this does not require the vectors to be unit vectors.
	 * 
	 * @param v1x The value of the x component of the first vector.
	 * @param v1y The value of the y component of the first vector.
	 * @param v1z The value of the z component of the first vector.
	 * @param v2x The value of the x component of the second vector.
	 * @param v2y The value of the y component of the second vector.
	 * @param v2z The value of the z component of the second vector.
	 * 
	 * @return The cosine angle between the two vectors.
	 */
	public static float cosAngleTo(float v1x, float v1y, float v1z, float v2x, float v2y, float v2z)
	{
		if(v1x == 0.0f && v1y == 0.0f && v1z == 0.0f) return 0.0f;
		if(v2x == 0.0f && v2y == 0.0f && v2z == 0.0f) return 0.0f;
		
		// cos(angle) = (v1 . v2) / sqrt(|v1|^2 * |v2|^2)
		return (v1x * v2x + v1y * v2y + v1z * v2z) / BarghosMath.sqrt((v1x * v1x + v1y * v1y + v1z * v1z) * (v2x * v2x + v2y * v2y + v2z * v2z));
	}
	
	/**
	 * Calculates the angle in radians from the vector {@code (v1)} to the vector {@code (v2)} under the assumption
	 * that both vectors are unit vectors. If the vectors are not unit vectors the result will be biased.
	 * 
	 * @param v1 The first vector.
	 * @param v2 The second vector.
	 * 
	 * @return The angle between the two vectors in radians.
	 */
	public static float angleToUnsafeRad(Vec3fR v1, Vec3fR v2)
	{
		// angle = acos(v1 . v2)
		// or: angle = acos((v1 . v2) / 1)
		return BarghosMath.acos(v1.getX() * v2.getX() + v1.getY() * v2.getY() + v1.getZ() * v2.getZ());
	}
	
	/**
	 * Calculates the angle in radians from the vector {@code (v1)} to the vector {@code (v2[0], v2[1], v2[2])} under the assumption
	 * that both vectors are unit vectors. If the vectors are not unit vectors the result will be biased.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * @param v1 The first vector.
	 * @param v2 The second vector. Minimum legth: 3.
	 * 
	 * @return The angle between the two vectors in radians.
	 */
	public static float angleToUnsafeRad(Vec3fR v1, @MinLength(3) float[] v2)
	{
		// angle = acos(v1 . v2)
		// or: angle = acos((v1 . v2) / 1)
		return BarghosMath.acos(v1.getX() * v2[0] + v1.getY() * v2[1] + v1.getZ() * v2[2]);
	}
	
	/**
	 * Calculates the angle in radians from the vector {@code (v1)} to the vector {@code (v2x, v2y, v2z)} under the assumption
	 * that both vectors are unit vectors. If the vectors are not unit vectors the result will be biased.
	 * 
	 * @param v1 The first vector.
	 * @param v2x The value of the x component of the second vector.
	 * @param v2y The value of the y component of the second vector.
	 * @param v2z The value of the z component of the second vector.
	 * 
	 * @return The angle between the two vectors in radians.
	 */
	public static float angleToUnsafeRad(Vec3fR v1, float v2x, float v2y, float v2z)
	{
		// angle = acos(v1 . v2)
		// or: angle = acos((v1 . v2) / 1)
		return BarghosMath.acos(v1.getX() * v2x + v1.getY() * v2y + v1.getZ() * v2z);
	}
	
	/**
	 * Calculates the angle in radians from the vector {@code (v1[0], v1[1], v1[2])} to the vector {@code (v2)} under the assumption
	 * that both vectors are unit vectors. If the vectors are not unit vectors the result will be biased.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * @param v1 The first vector. Minimum legth: 3.
	 * @param v2 The second vector.
	 * 
	 * @return The angle between the two vectors in radians.
	 */
	public static float angleToUnsafeRad(@MinLength(3) float[] v1, Vec3fR v2)
	{
		// angle = acos(v1 . v2)
		// or: angle = acos((v1 . v2) / 1)
		return BarghosMath.acos(v1[0] * v2.getX() + v1[1] * v2.getY() + v1[2] * v2.getZ());
	}
	
	/**
	 * Calculates the angle in radians from the vector {@code (v1[0], v1[1], v1[2])} to the vector {@code (v2[0], v2[1], v2[2])} under the assumption
	 * that both vectors are unit vectors. If the vectors are not unit vectors the result will be biased.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * @param v1 The first vector. Minimum legth: 3.
	 * @param v2 The second vector. Minimum legth: 3.
	 * 
	 * @return The angle between the two vectors in radians.
	 */
	public static float angleToUnsafeRad(@MinLength(3) float[] v1, @MinLength(3) float[] v2)
	{
		// angle = acos(v1 . v2)
		// or: angle = acos((v1 . v2) / 1)
		return BarghosMath.acos(v1[0] * v2[0] + v1[1] * v2[1] + v1[2] * v2[2]);
	}
	
	/**
	 * Calculates the angle in radians from the vector {@code (v1[0], v1[1], v1[2])} to the vector {@code (v2x, v2y, v2z)} under the assumption
	 * that both vectors are unit vectors. If the vectors are not unit vectors the result will be biased.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * @param v1 The first vector. Minimum legth: 3.
	 * @param v2x The value of the x component of the second vector.
	 * @param v2y The value of the y component of the second vector.
	 * @param v2z The value of the z component of the second vector.
	 * 
	 * @return The angle between the two vectors in radians.
	 */
	public static float angleToUnsafeRad(@MinLength(3) float[] v1, float v2x, float v2y, float v2z)
	{
		// angle = acos(v1 . v2)
		// or: angle = acos((v1 . v2) / 1)
		return BarghosMath.acos(v1[0] * v2x + v1[1] * v2y + v1[2] * v2z);
	}
	
	/**
	 * Calculates the angle in radians from the vector {@code (v1x, v1y, v1z)} to the vector {@code (v2)} under the assumption
	 * that both vectors are unit vectors. If the vectors are not unit vectors the result will be biased.
	 * 
	 * @param v1x The value of the x component of the first vector.
	 * @param v1y The value of the y component of the first vector.
	 * @param v1z The value of the z component of the first vector.
	 * @param v2 The second vector.
	 * 
	 * @return The angle between the two vectors in radians.
	 */
	public static float angleToUnsafeRad(float v1x, float v1y, float v1z, Vec3fR v2)
	{
		// angle = acos(v1 . v2)
		// or: angle = acos((v1 . v2) / 1)
		return BarghosMath.acos(v1x * v2.getX() + v1y * v2.getY() + v1z * v2.getZ());
	}
	
	/**
	 * Calculates the angle in radians from the vector {@code (v1x, v1y, v1z)} to the vector {@code (v2[0], v2[1], v2[2])} under the assumption
	 * that both vectors are unit vectors. If the vectors are not unit vectors the result will be biased.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * @param v1x The value of the x component of the first vector.
	 * @param v1y The value of the y component of the first vector.
	 * @param v1z The value of the z component of the first vector.
	 * @param v2 The second vector. Minimum legth: 3.
	 * 
	 * @return The angle between the two vectors in radians.
	 */
	public static float angleToUnsafeRad(float v1x, float v1y, float v1z, @MinLength(3) float[] v2)
	{
		// angle = acos(v1 . v2)
		// or: angle = acos((v1 . v2) / 1)
		return BarghosMath.acos(v1x * v2[0] + v1y * v2[1] + v1z * v2[2]);
	}
	
	/**
	 * Calculates the angle in radians from the vector {@code (v1x, v1y, v1z)} to the vector {@code (v2x, v2y, v2z)} under the assumption
	 * that both vectors are unit vectors. If the vectors are not unit vectors the result will be biased.
	 * 
	 * @param v1x The value of the x component of the first vector.
	 * @param v1y The value of the y component of the first vector.
	 * @param v1z The value of the z component of the first vector.
	 * @param v2x The value of the x component of the second vector.
	 * @param v2y The value of the y component of the second vector.
	 * @param v2z The value of the z component of the second vector.
	 * 
	 * @return The angle between the two vectors in radians.
	 */
	public static float angleToUnsafeRad(float v1x, float v1y, float v1z, float v2x, float v2y, float v2z)
	{
		// angle = acos(v1 . v2)
		// or: angle = acos((v1 . v2) / 1)
		return BarghosMath.acos(v1x * v2x + v1y * v2y + v1z * v2z);
	}
	
	/**
	 * Calculates the angle in degrees from the vector {@code (v1)} to the vector {@code (v2)} under the assumption
	 * that both vectors are unit vectors. If the vectors are not unit vectors the result will be biased.
	 * 
	 * @param v1 The first vector.
	 * @param v2 The second vector.
	 * 
	 * @return The angle between the two vectors in degrees.
	 */
	public static float angleToUnsafeDeg(Vec3fR v1, Vec3fR v2)
	{
		// angle = acos(v1 . v2)
		// or: angle = acos((v1 . v2) / 1)
		return BarghosMath.acos(v1.getX() * v2.getX() + v1.getY() * v2.getY() + v1.getZ() * v2.getZ()) * BarghosMath.RAD_TO_DEGf;
	}
	
	/**
	 * Calculates the angle in degrees from the vector {@code (v1)} to the vector {@code (v2[0], v2[1], v2[2])} under the assumption
	 * that both vectors are unit vectors. If the vectors are not unit vectors the result will be biased.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * @param v1 The first vector.
	 * @param v2 The second vector. Minimum legth: 3.
	 * 
	 * @return The angle between the two vectors in degrees.
	 */
	public static float angleToUnsafeDeg(Vec3fR v1, @MinLength(3) float[] v2)
	{
		// angle = acos(v1 . v2)
		// or: angle = acos((v1 . v2) / 1)
		return BarghosMath.acos(v1.getX() * v2[0] + v1.getY() * v2[1] + v1.getZ() * v2[2]) * BarghosMath.RAD_TO_DEGf;
	}
	
	/**
	 * Calculates the angle in degrees from the vector {@code (v1)} to the vector {@code (v2x, v2y, v2z)} under the assumption
	 * that both vectors are unit vectors. If the vectors are not unit vectors the result will be biased.
	 * 
	 * @param v1 The first vector.
	 * @param v2x The value of the x component of the second vector.
	 * @param v2y The value of the y component of the second vector.
	 * @param v2z The value of the z component of the second vector.
	 * 
	 * @return The angle between the two vectors in degrees.
	 */
	public static float angleToUnsafeDeg(Vec3fR v1, float v2x, float v2y, float v2z)
	{
		// angle = acos(v1 . v2)
		// or: angle = acos((v1 . v2) / 1)
		return BarghosMath.acos(v1.getX() * v2x + v1.getY() * v2y + v1.getZ() * v2z) * BarghosMath.RAD_TO_DEGf;
	}
	
	/**
	 * Calculates the angle in degrees from the vector {@code (v1[0], v1[1], v1[2])} to the vector {@code (v2)} under the assumption
	 * that both vectors are unit vectors. If the vectors are not unit vectors the result will be biased.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * @param v1 The first vector. Minimum legth: 3.
	 * @param v2 The second vector.
	 * 
	 * @return The angle between the two vectors in degrees.
	 */
	public static float angleToUnsafeDeg(@MinLength(3) float[] v1, Vec3fR v2)
	{
		// angle = acos(v1 . v2)
		// or: angle = acos((v1 . v2) / 1)
		return BarghosMath.acos(v1[0] * v2.getX() + v1[1] * v2.getY() + v1[2] * v2.getZ()) * BarghosMath.RAD_TO_DEGf;
	}
	
	/**
	 * Calculates the angle in degrees from the vector {@code (v1[0], v1[1], v1[2])} to the vector {@code (v2[0], v2[1], v2[2])} under the assumption
	 * that both vectors are unit vectors. If the vectors are not unit vectors the result will be biased.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * @param v1 The first vector. Minimum legth: 3.
	 * @param v2 The second vector. Minimum legth: 3.
	 * 
	 * @return The angle between the two vectors in degrees.
	 */
	public static float angleToUnsafeDeg(@MinLength(3) float[] v1, @MinLength(3) float[] v2)
	{
		// angle = acos(v1 . v2)
		// or: angle = acos((v1 . v2) / 1)
		return BarghosMath.acos(v1[0] * v2[0] + v1[1] * v2[1] + v1[2] * v2[2]) * BarghosMath.RAD_TO_DEGf;
	}
	
	/**
	 * Calculates the angle in degrees from the vector {@code (v1[0], v1[1], v1[2])} to the vector {@code (v2x, v2y, v2z)} under the assumption
	 * that both vectors are unit vectors. If the vectors are not unit vectors the result will be biased.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * @param v1 The first vector. Minimum legth: 3.
	 * @param v2x The value of the x component of the second vector.
	 * @param v2y The value of the y component of the second vector.
	 * @param v2z The value of the z component of the second vector.
	 * 
	 * @return The angle between the two vectors in degrees.
	 */
	public static float angleToUnsafeDeg(@MinLength(3) float[] v1, float v2x, float v2y, float v2z)
	{
		// angle = acos(v1 . v2)
		// or: angle = acos((v1 . v2) / 1)
		return BarghosMath.acos(v1[0] * v2x + v1[1] * v2y + v1[2] * v2z) * BarghosMath.RAD_TO_DEGf;
	}
	
	/**
	 * Calculates the angle in degrees from the vector {@code (v1x, v1y, v1z)} to the vector {@code (v2)} under the assumption
	 * that both vectors are unit vectors. If the vectors are not unit vectors the result will be biased.
	 * 
	 * @param v1x The value of the x component of the first vector.
	 * @param v1y The value of the y component of the first vector.
	 * @param v1z The value of the z component of the first vector.
	 * @param v2 The second vector.
	 * 
	 * @return The angle between the two vectors in degrees.
	 */
	public static float angleToUnsafeDeg(float v1x, float v1y, float v1z, Vec3fR v2)
	{
		// angle = acos(v1 . v2)
		// or: angle = acos((v1 . v2) / 1)
		return BarghosMath.acos(v1x * v2.getX() + v1y * v2.getY() + v1z * v2.getZ()) * BarghosMath.RAD_TO_DEGf;
	}
	
	/**
	 * Calculates the angle in degrees from the vector {@code (v1x, v1y, v1z)} to the vector {@code (v2[0], v2[1], v2[2])} under the assumption
	 * that both vectors are unit vectors. If the vectors are not unit vectors the result will be biased.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * @param v1x The value of the x component of the first vector.
	 * @param v1y The value of the y component of the first vector.
	 * @param v1z The value of the z component of the first vector.
	 * @param v2 The second vector. Minimum legth: 3.
	 * 
	 * @return The angle between the two vectors in degrees.
	 */
	public static float angleToUnsafeDeg(float v1x, float v1y, float v1z, @MinLength(3) float[] v2)
	{
		// angle = acos(v1 . v2)
		// or: angle = acos((v1 . v2) / 1)
		return BarghosMath.acos(v1x * v2[0] + v1y * v2[1] + v1z * v2[2]) * BarghosMath.RAD_TO_DEGf;
	}
	
	/**
	 * Calculates the angle in degrees from the vector {@code (v1x, v1y, v1z)} to the vector {@code (v2x, v2y, v2z)} under the assumption
	 * that both vectors are unit vectors. If the vectors are not unit vectors the result will be biased.
	 * 
	 * @param v1x The value of the x component of the first vector.
	 * @param v1y The value of the y component of the first vector.
	 * @param v1z The value of the z component of the first vector.
	 * @param v2x The value of the x component of the second vector.
	 * @param v2y The value of the y component of the second vector.
	 * @param v2z The value of the z component of the second vector.
	 * 
	 * @return The angle between the two vectors in degrees.
	 */
	public static float angleToUnsafeDeg(float v1x, float v1y, float v1z, float v2x, float v2y, float v2z)
	{
		// angle = acos(v1 . v2)
		// or: angle = acos((v1 . v2) / 1)
		return BarghosMath.acos(v1x * v2x + v1y * v2y + v1z * v2z) * BarghosMath.RAD_TO_DEGf;
	}
	
	/**
	 * Calculates the angle in radians from the vector {@code (v1)} to the vector {@code (v2)} taking into acount the lengths.
	 * Therefore this does not require the vectors to be unit vectors.
	 * 
	 * @param v1 The first vector.
	 * @param v2 The second vector.
	 * 
	 * @return The angle between the two vectors in radians.
	 */
	public static float angleToRad(Vec3fR v1, Vec3fR v2)
	{
		return angleToRadInternal(v1.getX(), v1.getY(), v1.getZ(), v2.getX(), v2.getY(), v2.getZ());
	}
	
	/**
	 * Calculates the angle in radians from the vector {@code (v1)} to the vector {@code (v2[0], v2[1], v2[2])} taking into acount the lengths.
	 * Therefore this does not require the vectors to be unit vectors.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * @param v1 The first vector.
	 * @param v2 The second vector. Minimum legth: 3.
	 * 
	 * @return The angle between the two vectors in radians.
	 */
	public static float angleToRad(Vec3fR v1, @MinLength(3) float[] v2)
	{
		return angleToRadInternal(v1.getX(), v1.getY(), v1.getZ(), v2[0], v2[1], v2[2]);
	}
	
	/**
	 * Calculates the angle in radians from the vector {@code (v1)} to the vector {@code (v2x, v2y, v2z)} taking into acount the lengths.
	 * Therefore this does not require the vectors to be unit vectors.
	 * 
	 * @param v1 The first vector.
	 * @param v2x The value of the x component of the second vector.
	 * @param v2y The value of the y component of the second vector.
	 * @param v2z The value of the z component of the second vector.
	 * 
	 * @return The angle between the two vectors in radians.
	 */
	public static float angleToRad(Vec3fR v1, float v2x, float v2y, float v2z)
	{
		float v1x = v1.getX();
		float v1y = v1.getY();
		float v1z = v1.getZ();
		
		if(v1x == 0.0f && v1y == 0.0f && v1z == 0.0f) return 0.0f;
		if(v2x == 0.0f && v2y == 0.0f && v2z == 0.0f) return 0.0f;
		if(v1x == v2x && v1y == v2y && v1z == v2z) return 0.0f;
		if(v1x == -v2x && v1y == -v2y && v1z == -v2z) return BarghosMath.PIf;
		
		// angle = acos((v1 . v2) / sqrt(|v1|^2 * |v2|^2))
		return BarghosMath.acos((v1x * v2x + v1y * v2y + v1z * v2z) / BarghosMath.sqrt((v1x * v1x + v1y * v1y + v1z * v1z) * (v2x * v2x + v2y * v2y + v2z * v2z)));
	}
	
	/**
	 * Calculates the angle in radians from the vector {@code (v1[0], v1[1], v1[2])} to the vector {@code (v2)} taking into acount the lengths.
	 * Therefore this does not require the vectors to be unit vectors.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * @param v1 The first vector. Minimum legth: 3.
	 * @param v2 The second vector.
	 * 
	 * @return The angle between the two vectors in radians.
	 */
	public static float angleToRad(@MinLength(3) float[] v1, Vec3fR v2)
	{
		float v2x = v2.getX();
		float v2y = v2.getY();
		float v2z = v2.getZ();
		
		if(v1[0] == 0.0f && v1[1] == 0.0f && v1[2] == 0.0f) return 0.0f;
		if(v2x == 0.0f && v2y == 0.0f && v2z == 0.0f) return 0.0f;
		if(v1[0] == v2x && v1[1] == v2y && v1[2] == v2z) return 0.0f;
		if(v1[0] == -v2x && v1[1] == -v2y && v1[2] == -v2z) return BarghosMath.PIf;
		
		// angle = acos((v1 . v2) / sqrt(|v1|^2 * |v2|^2))
		return BarghosMath.acos((v1[0] * v2x + v1[1] * v2y + v1[2] * v2z) / BarghosMath.sqrt((v1[0] * v1[0] + v1[1] * v1[1] + v1[2] * v1[2]) * (v2x * v2x + v2y * v2y + v2z * v2z)));
	}
	
	/**
	 * Calculates the angle in radians from the vector {@code (v1[0], v1[1], v1[2])} to the vector {@code (v2[0], v2[1], v2[2])} taking into acount the lengths.
	 * Therefore this does not require the vectors to be unit vectors.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * @param v1 The first vector. Minimum legth: 3.
	 * @param v2 The second vector. Minimum legth: 3.
	 * 
	 * @return The angle between the two vectors in radians.
	 */
	public static float angleToRad(@MinLength(3) float[] v1, @MinLength(3) float[] v2)
	{
		return angleToRadInternal(v1[0], v1[1], v1[2], v2[0], v2[1], v2[2]);
	}
	
	/**
	 * Calculates the angle in radians from the vector {@code (v1)} to the vector {@code (v2x, v2y, v2z)} taking into acount the lengths.
	 * Therefore this does not require the vectors to be unit vectors.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * @param v1 The first vector. Minimum legth: 3.
	 * @param v2x The value of the x component of the second vector.
	 * @param v2y The value of the y component of the second vector.
	 * @param v2z The value of the z component of the second vector.
	 * 
	 * @return The angle between the two vectors in radians.
	 */
	public static float angleToRad(@MinLength(3) float[] v1, float v2x, float v2y, float v2z)
	{
		return angleToRadInternal(v1[0], v1[1], v1[2], v2x, v2y, v2z);
	}
	
	/**
	 * Calculates the angle in radians from the vector {@code (v1x, v1y, v1z)} to the vector {@code (v2)} taking into acount the lengths.
	 * Therefore this does not require the vectors to be unit vectors.
	 * 
	 * @param v1x The value of the x component of the first vector.
	 * @param v1y The value of the y component of the first vector.
	 * @param v1z The value of the z component of the first vector.
	 * @param v2 The second vector.
	 * 
	 * @return The angle between the two vectors in radians.
	 */
	public static float angleToRad(float v1x, float v1y, float v1z, Vec3fR v2)
	{
		return angleToRadInternal(v1x, v1y, v1z, v2.getX(), v2.getY(), v2.getZ());
	}
	
	/**
	 * Calculates the angle in radians from the vector {@code (v1x, v1y, v1z)} to the vector {@code (v2[0], v2[1], v2[2])} taking into acount the lengths.
	 * Therefore this does not require the vectors to be unit vectors.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * @param v1x The value of the x component of the first vector.
	 * @param v1y The value of the y component of the first vector.
	 * @param v1z The value of the z component of the first vector.
	 * @param v2 The second vector. Minimum legth: 3.
	 * 
	 * @return The angle between the two vectors in radians.
	 */
	public static float angleToRad(float v1x, float v1y, float v1z, @MinLength(3) float[] v2)
	{
		return angleToRadInternal(v1x, v1y, v1z, v2[0], v2[1], v2[2]);
	}
	
	/**
	 * Calculates the angle in radians from the vector {@code (v1x, v1y, v1z)} to the vector {@code (v2x, v2y, v2z)} taking into acount the lengths.
	 * Therefore this does not require the vectors to be unit vectors.
	 * 
	 * @param v1x The value of the x component of the first vector.
	 * @param v1y The value of the y component of the first vector.
	 * @param v1z The value of the z component of the first vector.
	 * @param v2x The value of the x component of the second vector.
	 * @param v2y The value of the y component of the second vector.
	 * @param v2z The value of the z component of the second vector.
	 * 
	 * @return The angle between the two vectors in radians.
	 */
	public static float angleToRad(float v1x, float v1y, float v1z, float v2x, float v2y, float v2z)
	{
		return angleToRadInternal(v1x, v1y, v1z, v2x, v2y, v2z);
	}
	
	/**
	 * Only for better maintainability.
	 * 
	 * <p>
	 * Calculates the angle in radians from the vector {@code (v1x, v1y, v1z)} to the vector {@code (v2x, v2y, v2z)} taking into acount the lengths.
	 * Therefore this does not require the vectors to be unit vectors.
	 * 
	 * @param v1x The value of the x component of the first vector.
	 * @param v1y The value of the y component of the first vector.
	 * @param v1z The value of the z component of the first vector.
	 * @param v2x The value of the x component of the second vector.
	 * @param v2y The value of the y component of the second vector.
	 * @param v2z The value of the z component of the second vector.
	 * 
	 * @return The angle between the two vectors in radians.
	 */
	private static float angleToRadInternal(float v1x, float v1y, float v1z, float v2x, float v2y, float v2z)
	{
		if(v1x == 0.0f && v1y == 0.0f && v1z == 0.0f) return 0.0f;
		if(v2x == 0.0f && v2y == 0.0f && v2z == 0.0f) return 0.0f;
		if(v1x == v2x && v1y == v2y && v1z == v2z) return 0.0f;
		if(v1x == -v2x && v1y == -v2y && v1z == -v2z) return BarghosMath.PIf;
		
		// angle = acos((v1 . v2) / sqrt(|v1|^2 * |v2|^2))
		return BarghosMath.acos((v1x * v2x + v1y * v2y + v1z * v2z) / BarghosMath.sqrt((v1x * v1x + v1y * v1y + v1z * v1z) * (v2x * v2x + v2y * v2y + v2z * v2z)));
	}
	
	/**
	 * Calculates the angle in degrees from the vector {@code (v1)} to the vector {@code (v2)} taking into acount the lengths.
	 * Therefore this does not require the vectors to be unit vectors.
	 * 
	 * @param v1 The first vector.
	 * @param v2 The second vector.
	 * 
	 * @return The angle between the two vectors in degrees.
	 */
	public static float angleToDeg(Vec3fR v1, Vec3fR v2)
	{
		return angleToDegInternal(v1.getX(), v1.getY(), v1.getZ(), v2.getX(), v2.getY(), v2.getZ());
	}
	
	/**
	 * Calculates the angle in degrees from the vector {@code (v1)} to the vector {@code (v2[0], v2[1], v2[2])} taking into acount the lengths.
	 * Therefore this does not require the vectors to be unit vectors.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * @param v1 The first vector.
	 * @param v2 The second vector.
	 * 
	 * @return The angle between the two vectors in degrees.
	 */
	public static float angleToDeg(Vec3fR v1, @MinLength(3) float[] v2)
	{
		return angleToDegInternal(v1.getX(), v1.getY(), v1.getZ(), v2[0], v2[1], v2[2]);
	}
	
	/**
	 * Calculates the angle in degrees from the vector {@code (v1)} to the vector {@code (v2x, v2y, v2z)} taking into acount the lengths.
	 * Therefore this does not require the vectors to be unit vectors.
	 * 
	 * @param v1 The first vector.
	 * @param v2x The value of the x component of the second vector.
	 * @param v2y The value of the y component of the second vector.
	 * @param v2z The value of the z component of the second vector.
	 * 
	 * @return The angle between the two vectors in degrees.
	 */
	public static float angleToDeg(Vec3fR v1, float v2x, float v2y, float v2z)
	{
		return angleToDegInternal(v1.getX(), v1.getY(), v1.getZ(), v2x, v2y, v2z);
	}
	
	/**
	 * Calculates the angle in degrees from the vector {@code (v1[0], v1[1], v1[2])} to the vector {@code (v2)} taking into acount the lengths.
	 * Therefore this does not require the vectors to be unit vectors.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * @param v1 The first vector.
	 * @param v2 The second vector.
	 * 
	 * @return The angle between the two vectors in degrees.
	 */
	public static float angleToDeg(@MinLength(3) float[] v1, Vec3fR v2)
	{
		return angleToDegInternal(v1[0], v1[1], v1[2], v2.getX(), v2.getY(), v2.getZ());
	}
	
	/**
	 * Calculates the angle in degrees from the vector {@code (v1[0], v1[1], v1[2])} to the vector {@code (v2[0], v2[1], v2[2])} taking into acount the lengths.
	 * Therefore this does not require the vectors to be unit vectors.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * @param v1 The first vector.
	 * @param v2 The second vector.
	 * 
	 * @return The angle between the two vectors in degrees.
	 */
	public static float angleToDeg(@MinLength(3) float[] v1, @MinLength(3) float[] v2)
	{
		return angleToDegInternal(v1[0], v1[1], v1[2], v2[0], v2[1], v2[2]);
	}
	
	/**
	 * Calculates the angle in degrees from the vector {@code (v1[0], v1[1], v1[2])} to the vector {@code (v2x, v2y, v2z)} taking into acount the lengths.
	 * Therefore this does not require the vectors to be unit vectors.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * @param v1 The first vector.
	 * @param v2x The value of the x component of the second vector.
	 * @param v2y The value of the y component of the second vector.
	 * @param v2z The value of the z component of the second vector.
	 * 
	 * @return The angle between the two vectors in degrees.
	 */
	public static float angleToDeg(@MinLength(3) float[] v1, float v2x, float v2y, float v2z)
	{
		return angleToDegInternal(v1[0], v1[1], v1[2], v2x, v2y, v2z);
	}
	
	/**
	 * Calculates the angle in degrees from the vector {@code (v1x, v1y, v1z)} to the vector {@code (v2)} taking into acount the lengths.
	 * Therefore this does not require the vectors to be unit vectors.
	 * 
	 * @param v1x The value of the x component of the first vector.
	 * @param v1y The value of the y component of the first vector.
	 * @param v1z The value of the z component of the first vector.
	 * @param v2 The second vector.
	 * 
	 * @return The angle between the two vectors in degrees.
	 */
	public static float angleToDeg(float v1x, float v1y, float v1z, Vec3fR v2)
	{
		return angleToDegInternal(v1x, v1y, v1z, v2.getX(), v2.getY(), v2.getZ());
	}
	
	/**
	 * Calculates the angle in degrees from the vector {@code (v1x, v1y, v1z)} to the vector {@code (v2[0], v2[1], v2[2])} taking into acount the lengths.
	 * Therefore this does not require the vectors to be unit vectors.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * @param v1x The value of the x component of the first vector.
	 * @param v1y The value of the y component of the first vector.
	 * @param v1z The value of the z component of the first vector.
	 * @param v2 The second vector.
	 * 
	 * @return The angle between the two vectors in degrees.
	 */
	public static float angleToDeg(float v1x, float v1y, float v1z, @MinLength(3) float[] v2)
	{
		return angleToDegInternal(v1x, v1y, v1z, v2[0], v2[1], v2[2]);
	}
	
	/**
	 * Calculates the angle in degrees from the vector {@code (v1x, v1y, v1z)} to the vector {@code (v2x, v2y, v2z)} taking into acount the lengths.
	 * Therefore this does not require the vectors to be unit vectors.
	 * 
	 * @param v1x The value of the x component of the first vector.
	 * @param v1y The value of the y component of the first vector.
	 * @param v1z The value of the z component of the first vector.
	 * @param v2x The value of the x component of the second vector.
	 * @param v2y The value of the y component of the second vector.
	 * @param v2z The value of the z component of the second vector.
	 * 
	 * @return The angle between the two vectors in degrees.
	 */
	public static float angleToDeg(float v1x, float v1y, float v1z, float v2x, float v2y, float v2z)
	{
		return angleToDegInternal(v1x, v1y, v1z, v2x, v2y, v2z);
	}
	
	/**
	 * Only for better maintainability.
	 * 
	 * <p>
	 * Calculates the angle in degrees from the vector {@code (v1x, v1y, v1z)} to the vector {@code (v2x, v2y, v2z)} taking into acount the lengths.
	 * Therefore this does not require the vectors to be unit vectors.
	 * 
	 * @param v1x The value of the x component of the first vector.
	 * @param v1y The value of the y component of the first vector.
	 * @param v1z The value of the z component of the first vector.
	 * @param v2x The value of the x component of the second vector.
	 * @param v2y The value of the y component of the second vector.
	 * @param v2z The value of the z component of the second vector.
	 * 
	 * @return The angle between the two vectors in degrees.
	 */
	private static float angleToDegInternal(float v1x, float v1y, float v1z, float v2x, float v2y, float v2z)
	{
		if(v1x == 0.0f && v1y == 0.0f && v1z == 0.0f) return 0.0f;
		if(v2x == 0.0f && v2y == 0.0f && v2z == 0.0f) return 0.0f;
		
		// angle = acos((v1 . v2) / sqrt(|v1|^2 * |v2|^2))
		return BarghosMath.acos((v1x * v2x + v1y * v2y + v1z * v2z) / BarghosMath.sqrt((v1x * v1x + v1y * v1y + v1z * v1z) * (v2x * v2x + v2y * v2y + v2z * v2z))) * BarghosMath.RAD_TO_DEGf;
	}
	
	/**
	 * Calculates the signed angle in radians from the vector {@code (v1x, v1y, v1z)} to the vector {@code (v2x, v2y, v2z)} under the assumption
	 * that both vectors are unit vectors. If the vectors are not unit vectors the result will be biased.
	 * 
	 * @param v1 The first vector.
	 * @param v2 The second vector.
	 * 
	 * @return The angle between the two vectors in radians.
	 */
	public static float signedAngleToUnsafe(Vec3fR v1, Vec3fR v2)
	{
		return signedAngleToUnsafeInternal(v1.getX(), v1.getY(), v1.getZ(), v2.getX(), v2.getY(), v2.getZ());
	}
	
	/**
	 * Calculates the signed angle in radians from the vector {@code (v1x, v1y, v1z)} to the vector {@code (v2x, v2y, v2z)} under the assumption
	 * that both vectors are unit vectors. If the vectors are not unit vectors the result will be biased.
	 * 
	 * @param v1x The value of the x component of the first vector.
	 * @param v1y The value of the y component of the first vector.
	 * @param v1z The value of the z component of the first vector.
	 * @param v2x The value of the x component of the second vector.
	 * @param v2y The value of the y component of the second vector.
	 * @param v2z The value of the z component of the second vector.
	 * 
	 * @return The angle between the two vectors in radians.
	 */
	public static float signedAngleToUnsafe(float v1x, float v1y, float v1z, float v2x, float v2y, float v2z)
	{
		return signedAngleToUnsafeInternal(v1x, v1y, v1z, v2x, v2y, v2z);
	}
	
	/**
	 * Only for better maintainability.
	 * 
	 * <p>
	 * Calculates the signed angle in radians from the vector {@code (v1x, v1y, v1z)} to the vector {@code (v2x, v2y, v2z)} under the assumption
	 * that both vectors are unit vectors. If the vectors are not unit vectors the result will be biased.
	 * 
	 * @param v1x The value of the x component of the first vector.
	 * @param v1y The value of the y component of the first vector.
	 * @param v1z The value of the z component of the first vector.
	 * @param v2x The value of the x component of the second vector.
	 * @param v2y The value of the y component of the second vector.
	 * @param v2z The value of the z component of the second vector.
	 * 
	 * @return The angle between the two vectors in radians.
	 */
	private static float signedAngleToUnsafeInternal(float v1x, float v1y, float v1z, float v2x, float v2y, float v2z)
	{
		float perpX = v1y * v2z - v1z * v2y;
		float perpY = v1z * v2x - v1x * v2z;
		float perpZ = v1x * v2y - v1y * v2x;

		// |v1 X v2| = |v1| * |v2| * sin(angle)
		// v1 . v2 = |v1| * |v2| * cos(angle)
		// angle = atan2(|v1 X v2|, v1 . v2)
		return BarghosMath.atan2(BarghosMath.sqrt(perpX * perpX + perpY * perpY + perpZ * perpZ), v1x * v2x + v1y * v2y + v1z * v2z);
	}
	
	/**
	 * Calculates the signed angle in degrees from the vector {@code (v1x, v1y, v1z)} to the vector {@code (v2x, v2y, v2z)} under the assumption
	 * that both vectors are unit vectors. If the vectors are not unit vectors the result will be biased.
	 * 
	 * @param v1x The value of the x component of the first vector.
	 * @param v1y The value of the y component of the first vector.
	 * @param v1z The value of the z component of the first vector.
	 * @param v2x The value of the x component of the second vector.
	 * @param v2y The value of the y component of the second vector.
	 * @param v2z The value of the z component of the second vector.
	 * 
	 * @return The angle between the two vectors in degrees.
	 */
	public static float signedAngleToUnsafeDeg(float v1x, float v1y, float v1z, float v2x, float v2y, float v2z)
	{
		return signedAngleToUnsafeDegInternal(v1x, v1y, v1z, v2x, v2y, v2z);
	}
	
	/**
	 * Only for better maintainability.
	 * 
	 * <p>
	 * Calculates the signed angle in radians from the vector {@code (v1x, v1y, v1z)} to the vector {@code (v2x, v2y, v2z)} under the assumption
	 * that both vectors are unit vectors. If the vectors are not unit vectors the result will be biased.
	 * 
	 * @param v1x The value of the x component of the first vector.
	 * @param v1y The value of the y component of the first vector.
	 * @param v1z The value of the z component of the first vector.
	 * @param v2x The value of the x component of the second vector.
	 * @param v2y The value of the y component of the second vector.
	 * @param v2z The value of the z component of the second vector.
	 * 
	 * @return The angle between the two vectors in radians.
	 */
	private static float signedAngleToUnsafeDegInternal(float v1x, float v1y, float v1z, float v2x, float v2y, float v2z)
	{
		float perpX = v1y * v2z - v1z * v2y;
		float perpY = v1z * v2x - v1x * v2z;
		float perpZ = v1x * v2y - v1y * v2x;

		// |v1 X v2| = |v1| * |v2| * sin(angle)
		// v1 . v2 = |v1| * |v2| * cos(angle)
		// angle = atan2(|v1 X v2|, v1 . v2)
		return BarghosMath.atan2(BarghosMath.sqrt(perpX * perpX + perpY * perpY + perpZ * perpZ), v1x * v2x + v1y * v2y + v1z * v2z);
	}
	
	/**
	 * Rotates the vector {@code (x, y, z)} around the x-axis by the given angle in radians and saves the result in the result array.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * @param x The value of the x component of the vector to rotate.
	 * @param y The value of the y component of the vector to rotate.
	 * @param z The value of the z component of the vector to rotate.
	 * @param angle The angle to rotate by in radians.
	 * @param res The result array. Minimum Length: 3
	 * 
	 * @return The result array with the result.
	 */
	public static float[] rotateX(float x, float y, float z, float angle, @ExtractionParam @MinLength(3) float[] res)
	{
		rotateXInternal(x, y, z, angle, res);
		
		return res;
	}
	
	/**
	 * Rotates the vector {@code (x, y, z)} around the x-axis by the given angle in degrees and saves the result in the result array.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * @param x The value of the x component of the vector to rotate.
	 * @param y The value of the y component of the vector to rotate.
	 * @param z The value of the z component of the vector to rotate.
	 * @param angle The angle to rotate by in degrees.
	 * @param res The result array. Minimum Length: 3
	 * 
	 * @return The result array with the result.
	 */
	public static float[] rotateXDeg(float x, float y, float z, float angle, @ExtractionParam @MinLength(3) float[] res)
	{
		rotateXInternal(x, y, z, angle * BarghosMath.DEG_TO_RADf, res);
		
		return res;
	}

	/**
	 * Only for better maintainability.
	 * 
	 * <p>
	 * Rotates the vector {@code (x, y, z)} around the x-axis by the given angle in radians and saves the result in the result array.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * @param x The value of the x component of the vector to rotate.
	 * @param y The value of the y component of the vector to rotate.
	 * @param z The value of the z component of the vector to rotate.
	 * @param angle The angle to rotate by in radians.
	 * @param res The result array. Minimum Length: 3
	 */
	@InlineOnly
	private static void rotateXInternal(float x, float y, float z, float angle, @ExtractionParam @MinLength(3) float[] res)
	{
		float cosAngle = BarghosMath.cos(angle);
		float sinAngle = BarghosMath.sin(angle);
		
		res[0] = x;
		res[1] = cosAngle * y - sinAngle * z;
		res[2] = sinAngle * y + cosAngle * z;
	}
	
	/**
	 * Rotates the vector {@code (x, y, z)} around the y-axis by the given angle in radians and saves the result in the result array.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * @param x The value of the x component of the vector to rotate.
	 * @param y The value of the y component of the vector to rotate.
	 * @param z The value of the z component of the vector to rotate.
	 * @param angle The angle to rotate by in radians.
	 * @param res The result array. Minimum Length: 3
	 * 
	 * @return The result array with the result.
	 */
	public static float[] rotateY(float x, float y, float z, float angle, @ExtractionParam @MinLength(3) float[] res)
	{
		rotateYInternal(x, y, z, angle, res);
		
		return res;
	}

	/**
	 * Rotates the vector {@code (x, y, z)} around the y-axis by the given angle in degrees and saves the result in the result array.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * @param x The value of the x component of the vector to rotate.
	 * @param y The value of the y component of the vector to rotate.
	 * @param z The value of the z component of the vector to rotate.
	 * @param angle The angle to rotate by in degrees.
	 * @param res The result array. Minimum Length: 3
	 * 
	 * @return The result array with the result.
	 */
	public static float[] rotateYDeg(float x, float y, float z, float angle, @ExtractionParam @MinLength(3) float[] res)
	{
		rotateYInternal(x, y, z, angle * BarghosMath.DEG_TO_RADf, res);
		
		return res;
	}

	/**
	 * Only for better maintainability.
	 * 
	 * <p>
	 * Rotates the vector {@code (x, y, z)} around the y-axis by the given angle in radians and saves the result in the result array.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * @param x The value of the x component of the vector to rotate.
	 * @param y The value of the y component of the vector to rotate.
	 * @param z The value of the z component of the vector to rotate.
	 * @param angle The angle to rotate by in radians.
	 * @param res The result array. Minimum Length: 3
	 */
	@InlineOnly
	private static void rotateYInternal(float x, float y, float z, float angle, @ExtractionParam @MinLength(3) float[] res)
	{
		float cosAngle = BarghosMath.cos(angle);
		float sinAngle = BarghosMath.sin(angle);

		res[0] = cosAngle * x + sinAngle * z;
		res[1] = y;
		res[2] = -sinAngle * x + cosAngle * z;
	}
	
	/**
	 * Rotates the vector {@code (x, y, z)} around the z-axis by the given angle in radians and saves the result in the result array.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * @param x The value of the x component of the vector to rotate.
	 * @param y The value of the y component of the vector to rotate.
	 * @param z The value of the z component of the vector to rotate.
	 * @param angle The angle to rotate by in radians.
	 * @param res The result array. Minimum Length: 3
	 * 
	 * @return The result array with the result.
	 */
	public static float[] rotateZ(float x, float y, float z, float angle, @ExtractionParam @MinLength(3) float[] res)
	{
		rotateZInternal(x, y, z, angle, res);
		
		return res;
	}

	/**
	 * Rotates the vector {@code (x, y, z)} around the z-axis by the given angle in degrees and saves the result in the result array.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * @param x The value of the x component of the vector to rotate.
	 * @param y The value of the y component of the vector to rotate.
	 * @param z The value of the z component of the vector to rotate.
	 * @param angle The angle to rotate by in degrees.
	 * @param res The result array. Minimum Length: 3
	 * 
	 * @return The result array with the result.
	 */
	public static float[] rotateZDeg(float x, float y, float z, float angle, @ExtractionParam @MinLength(3) float[] res)
	{
		rotateZInternal(x, y, z, angle * BarghosMath.DEG_TO_RADf, res);
		
		return res;
	}

	/**
	 * Only for better maintainability.
	 * 
	 * Rotates the vector {@code (x, y, z)} around the z-axis by the given angle in radians and saves the result in the result array.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * @param x The value of the x component of the vector to rotate.
	 * @param y The value of the y component of the vector to rotate.
	 * @param z The value of the z component of the vector to rotate.
	 * @param angle The angle to rotate by in radians.
	 * @param res The result array. Minimum Length: 3
	 */
	@InlineOnly
	private static void rotateZInternal(float x, float y, float z, float angle, @ExtractionParam @MinLength(3) float[] res)
	{
		float cosAngle = BarghosMath.cos(angle);
		float sinAngle = BarghosMath.sin(angle);

		res[0] = cosAngle * x - sinAngle * y;
		res[1] = sinAngle * x + cosAngle * y;
		res[2] = z;
	}
	
	/**
	 * Rotates the vector {@code (x, y, z)} around the axis {@code (axisX, axisY, axisZ)} by the given angle in radians and saves the result in the result array.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * @param x The value of the x component of the vector to rotate.
	 * @param y The value of the y component of the vector to rotate.
	 * @param z The value of the z component of the vector to rotate.
	 * @param axisX The value of the x component of the rotation axis.
	 * @param axisY The value of the y component of the rotation axis.
	 * @param axisZ The value of the z component of the rotation axis.
	 * @param angle The angle to rotate by in radians.
	 * @param res The result array. Minimum Length: 3
	 * 
	 * @return The result array with the result.
	 */
	public static float[] rotate(float x, float y, float z, float axisX, float axisY, float axisZ, float angle, @ExtractionParam float[] res)
	{
		rotateInternal(x, y, z, axisX, axisY, axisZ, angle, res);
		
		return res;
	}
	
	/**
	 * Rotates the vector {@code (x, y, z)} around the axis {@code (axisX, axisY, axisZ)} by the given angle in degrees and saves the result in the result array.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * @param x The value of the x component of the vector to rotate.
	 * @param y The value of the y component of the vector to rotate.
	 * @param z The value of the z component of the vector to rotate.
	 * @param axisX The value of the x component of the rotation axis.
	 * @param axisY The value of the y component of the rotation axis.
	 * @param axisZ The value of the z component of the rotation axis.
	 * @param angle The angle to rotate by in degrees.
	 * @param res The result array. Minimum Length: 3
	 * 
	 * @return The result array with the result.
	 */
	public static float[] rotateDeg(float x, float y, float z, float axisX, float axisY, float axisZ, float angle, @ExtractionParam float[] res)
	{
		rotateInternal(x, y, z, axisX, axisY, axisZ, angle * BarghosMath.DEG_TO_RADf, res);
		
		return res;
	}
	
	/**
	 * Only for better maintainability.
	 * 
	 * <p>
	 * Rotates the vector {@code (x, y, z)} around the axis {@code (axisX, axisY, axisZ)} by the given angle in radians and saves the result in the result array.
	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 entries.
	 * 
	 * @param x The value of the x component of the vector to rotate.
	 * @param y The value of the y component of the vector to rotate.
	 * @param z The value of the z component of the vector to rotate.
	 * @param axisX The value of the x component of the rotation axis.
	 * @param axisY The value of the y component of the rotation axis.
	 * @param axisZ The value of the z component of the rotation axis.
	 * @param angle The angle to rotate by in radians.
	 * @param res The result array. Minimum Length: 3
	 */
	@InlineOnly
	private static void rotateInternal(float x, float y, float z, float axisX, float axisY, float axisZ, float angle, @ExtractionParam float[] res)
	{
		// Rodrigues' rotation formula (https://en.wikipedia.org/wiki/Rodrigues%27_rotation_formula)
		// vrot = v * cos(angle) + (axis X v) * sin(angle) + axis * (axis . v) * (1 - cos(angle))
		float sin = BarghosMath.sin(angle);
		float cosAngle = BarghosMath.cos(angle);
		float compCosAngleDot = (1.0f - cosAngle) * (x * axisX + y * axisY + z * axisZ);
		
		res[0] = cosAngle * x + sin * (axisY * z - axisZ * y) + compCosAngleDot * axisX;
		res[1] = cosAngle * y + sin * (axisZ * x - axisX * z) + compCosAngleDot * axisY;
		res[2] = cosAngle * z + sin * (axisX * y - axisY * x) + compCosAngleDot * axisZ;
	}
}
