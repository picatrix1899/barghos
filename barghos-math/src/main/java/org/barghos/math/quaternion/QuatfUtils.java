package org.barghos.math.quaternion;

import org.barghos.annotation.ExtractionParam;
import org.barghos.annotation.MinLength;
import org.barghos.core.function.FloatTetraFunction;
import org.barghos.core.math.BarghosMath;
import org.barghos.core.math.MathProvider;
import org.barghos.core.tuple.Tup4fC;
import org.barghos.core.tuple.Tup4fR;

/**
 * This class provides utilities for working with float quaternions.
 */
public class QuatfUtils
{
	/**
	 * Returns the squared length (magnitude, norm) of the quaternion {@code (q)}.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |q|²}
	 * 
	 * @param q The quaternion.
	 * 
	 * @return The squared length of the quaternion.
	 */
	public static float squaredLength(Tup4fR q)
	{
		return squaredLength(q.v0(), q.v1(), q.v2(), q.v3());
	}
	
	/**
	 * Returns the squared length (magnitude, norm) of the quaternion
	 * {@code (q[0]; q[1], q[2], q[3])}.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(q[0]; q[1], q[2], q[3])|²}
	 * 
	 * @param q The quaternion as an array with at least four entries.
	 * 
	 * @return The squared length of the quaternion.
	 */
	public static float squaredLength(@MinLength(4) float[] q)
	{
		return squaredLength(q[0], q[1], q[2], q[3]);
	}
	
	/**
	 * Returns the squared length (magnitude, norm) of the quaternion {@code (w; x, y, z)}.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(w; x, y, z)|²}
	 * 
	 * @param w The value of the w component of the quaternion.
	 * @param x The value of the x component of the quaternion.
	 * @param y The value of the y component of the quaternion.
	 * @param z The value of the z component of the quaternion.
	 * 
	 * @return The squared length of the quaternion.
	 */
	public static float squaredLength(float w, float x, float y, float z)
	{
		return w * w + x * x + y * y + z * z;
	}
	
	/**
	 * Returns the length (magnitude, norm) of the quaternion {@code (q)}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |q|}
	 * 
	 * @param q The quaternion.
	 * 
	 * @return The length of the quaternion.
	 */
	public static float length(Tup4fR q)
	{
		return length(q.v0(), q.v1(), q.v2(), q.v3());
	}
	
	/**
	 * Returns the length (magnitude, norm) of the quaternion {@code (q)}.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |q|}
	 * 
	 * @param q The quaternion.
	 * @param mathProvider
	 * The provider of fundamental math functions that should be used for calculation.
	 * 
	 * @return The length of the quaternion.
	 */
	public static float length(Tup4fR q, MathProvider mathProvider)
	{
		return length(q.v0(), q.v1(), q.v2(), q.v3(), mathProvider);
	}
	
	/**
	 * Returns the length (magnitude, norm) of the quaternion {@code (q[0]; q[1], q[2], q[3])}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(q[0]; q[1], q[2], q[3])|}
	 * 
	 * @param q The quaternion as an array with at least four entries.
	 * 
	 * @return The length of the quaternion.
	 */
	public static float length(@MinLength(4) float[] q)
	{
		return length(q[0], q[1], q[2], q[3]);
	}
	
	/**
	 * Returns the length (magnitude, norm) of the quaternion {@code (q[0]; q[1], q[2], q[3])}.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(q[0]; q[1], q[2], q[3])|}
	 * 
	 * @param q The quaternion as an array with at least four entries.
	 * @param mathProvider
	 * The provider of fundamental math functions that should be used for calculation.
	 * 
	 * @return The length of the quaternion.
	 */
	public static float length(@MinLength(4) float[] q, MathProvider mathProvider)
	{
		return length(q[0], q[1], q[2], q[3], mathProvider);
	}
	
	/**
	 * Returns the length (magnitude, norm) of the quaternion {@code (w; x, y, z)}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(w; x, y, z)|}
	 * 
	 * @param w The value of the w component of the quaternion.
	 * @param x The value of the x component of the quaternion.
	 * @param y The value of the y component of the quaternion.
	 * @param z The value of the z component of the quaternion.
	 * 
	 * @return The length of the quaternion.
	 */
	public static float length(float w, float x, float y, float z)
	{
		return length(w, x, y, z, BarghosMath.PROVIDER);
	}
	
	/**
	 * Returns the length (magnitude, norm) of the quaternion {@code (w; x, y, z)}.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(w; x, y, z)|}
	 * 
	 * @param w The value of the w component of the quaternion.
	 * @param x The value of the x component of the quaternion.
	 * @param y The value of the y component of the quaternion.
	 * @param z The value of the z component of the quaternion.
	 * @param mathProvider The provider of fundamental math functions that should be used for
	 * calculation.
	 * 
	 * @return The length of the quaternion.
	 */
	public static float length(float w, float x, float y, float z, MathProvider mathProvider)
	{
		return mathProvider.sqrt(squaredLength(w, x, y, z));
	}
	
	/**
	 * Returns the inverse (reciprocal) length (magnitude, norm) of the quaternion {@code (q)}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code 1 / |q|}
	 * 
	 * @param q The quaternion.
	 * 
	 * @return The reciprocal length of the quaternion.
	 */
	public static float inverseLength(Tup4fR q)
	{
		return inverseLength(q, BarghosMath.PROVIDER);
	}

	/**
	 * Returns the inverse (reciprocal) length (magnitude, norm) of the quaternion {@code (q)}.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code 1 / |q|}
	 * 
	 * @param q The quaternion.
	 * @param mathProvider
	 * The provider of fundamental math functions that should be used for calculation.
	 * 
	 * @return The reciprocal length of the quaternion.
	 */
	public static float inverseLength(Tup4fR q, MathProvider mathProvider)
	{
		return mathProvider.invSqrt(squaredLength(q));
	}
	
	/**
	 * Returns the inverse (reciprocal) length (magnitude, norm) of the quaternion
	 * {@code (q[0]; q[1], q[2], q[3])}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code 1 / |(q[0]; q[1], q[2], q[3])|}
	 * 
	 * @param q The quaternion as an array with at least four entries.
	 * 
	 * @return The reciprocal length of the quaternion.
	 */
	public static float inverseLength(@MinLength(4) float[] q)
	{
		return inverseLength(q, BarghosMath.PROVIDER);
	}

	/**
	 * Returns the inverse (reciprocal) length (magnitude, norm) of the quaternion
	 * {@code (q[0]; q[1], q[2], q[3])}.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code 1 / |(q[0]; q[1], q[2], q[3])|}
	 * 
	 * @param q The quaternion as an array with at least four entries.
	 * @param mathProvider
	 * The provider of fundamental math functions that should be used for calculation.
	 * 
	 * @return The reciprocal length of the quaternion.
	 */
	public static float inverseLength(@MinLength(4) float[] q, MathProvider mathProvider)
	{
		return mathProvider.invSqrt(squaredLength(q));
	}
	
	/**
	 * Returns the inverse (reciprocal) length (magnitude, norm) of the quaternion
	 * {@code (w; x, y, z)}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code 1 / |(w; x, y, z)|}
	 * 
	 * @param w The value of the w component of the quaternion.
	 * @param x The value of the x component of the quaternion.
	 * @param y The value of the y component of the quaternion.
	 * @param z The value of the z component of the quaternion.
	 * 
	 * @return The reciprocal length of the quaternion.
	 */
	public static float inverseLength(float w, float x, float y, float z)
	{
		return inverseLength(w, x, y, z, BarghosMath.PROVIDER);
	}

	/**
	 * Returns the inverse (reciprocal) length (magnitude, norm) of the quaternion
	 * {@code (w; x, y, z)}.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code 1 / |(w; x, y, z)|}
	 * 
	 * @param w The value of the w component of the quaternion.
	 * @param x The value of the x component of the quaternion.
	 * @param y The value of the y component of the quaternion.
	 * @param z The value of the z component of the quaternion.
	 * @param mathProvider
	 * The provider of fundamental math functions that should be used for calculation.
	 * 
	 * @return The reciprocal length of the quaternion.
	 */
	public static float inverseLength(float w, float x, float y, float z, MathProvider mathProvider)
	{
		return mathProvider.invSqrt(squaredLength(w, x, y, z));
	}
	
	/**
	 * Calculates the dot (scalar) product between the first given quaternion {@code (q1)} and the
	 * second given quaternion {@code (q2)}.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code q1 . q2}
	 * 
	 * @param q1 The first quaternion.
	 * @param q2 The second quaternion.
	 * 
	 * @return The dot (scalar) product.
	 */
	public static float dot(Tup4fR q1, Tup4fR q2)
	{
		return dot(q1.v0(), q1.v1(), q1.v2(), q1.v3(), q2.v0(), q2.v1(), q2.v2(), q2.v3());
	}
	
	/**
	 * Calculates the dot (scalar) product between the first given quaternion {@code (q1)} and the
	 * second given quaternion {@code (q2[0]; q2[1], q2[2], q2[3])}.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code q1 . (q2[0]; q2[1], q2[2], q2[3])}
	 * 
	 * @param q1 The first quaternion.
	 * @param q2 The second quaternion as an array with at least four entries.
	 * 
	 * @return The dot (scalar) product.
	 */
	public static float dot(Tup4fR q1, @MinLength(4) float[] q2)
	{
		return dot(q1.v0(), q1.v1(), q1.v2(), q1.v3(), q2[0], q2[1], q2[2], q2[3]);
	}
	
	/**
	 * Calculates the dot (scalar) product between the first given quaternion {@code (q1)} and the
	 * second given quaternion {@code (q2w; q2x, q2y, q2z)}.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code q1 . (q2w; q2x, q2y, q2z)}
	 * 
	 * @param q1 The first quaternion.
	 * @param q2w The value of the w component of the second quaternion.
	 * @param q2x The value of the x component of the second quaternion.
	 * @param q2y The value of the y component of the second quaternion.
	 * @param q2z The value of the z component of the second quaternion.
	 * 
	 * @return The dot (scalar) product.
	 */
	public static float dot(Tup4fR q1, float q2w, float q2x, float q2y, float q2z)
	{
		return dot(q1.v0(), q1.v1(), q1.v2(), q1.v3(), q2w, q2x, q2y, q2z);
	}
	
	/**
	 * Calculates the dot (scalar) product between the first given quaternion
	 * {@code (q1[0]; q1[1], q1[2], q1[3])} and the second given quaternion {@code (q2)}.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (q1[0]; q1[1], q1[2], q1[3]) . q2}
	 * 
	 * @param q1 The first quaternion as an array with at least four entries.
	 * @param q2 The second quaternion.
	 * 
	 * @return The dot (scalar) product.
	 */
	public static float dot(@MinLength(4) float[] q1, Tup4fR q2)
	{
		return dot(q1[0], q1[1], q1[2], q1[3], q2.v0(), q2.v1(), q2.v2(), q2.v3());
	}
	
	/**
	 * Calculates the dot (scalar) product between the first given quaternion
	 * {@code (q1[0]; q1[1], q1[2], q1[3])} and the second given quaternion
	 * {@code (q2[0]; q2[1], q2[2], q2[3])}.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (q1[0]; q1[1], q1[2], q1[3]) . (q2[0]; q2[1], q2[2], q2[3])}
	 * 
	 * @param q1 The first quaternion as an array with at least four entries.
	 * @param q2 The second quaternion as an array with at least four entries.
	 * 
	 * @return The dot (scalar) product.
	 */
	public static float dot(@MinLength(4) float[] q1, @MinLength(4) float[] q2)
	{
		return dot(q1[0], q1[1], q1[2], q1[3], q2[0], q2[1], q2[2], q2[3]);
	}
	
	/**
	 * Calculates the dot (scalar) product between the first given quaternion
	 * {@code (q1[0]; q1[1], q1[2], q1[3])} and the second given quaternion
	 * {@code (q2w; q2x, q2y, q2z)}.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (q1[0]; q1[1], q1[2], q1[3]) . (q2w; q2x, q2y, q2z)}
	 * 
	 * @param q1 The first quaternion as an array with at least four entries.
	 * @param q2w The value of the w component of the second quaternion.
	 * @param q2x The value of the x component of the second quaternion.
	 * @param q2y The value of the y component of the second quaternion.
	 * @param q2z The value of the z component of the second quaternion.
	 * 
	 * @return The dot (scalar) product.
	 */
	public static float dot(@MinLength(4) float[] q1, float q2w, float q2x, float q2y, float q2z)
	{
		return dot(q1[0], q1[1], q1[2], q1[3], q2w, q2x, q2y, q2z);
	}
	
	/**
	 * Calculates the dot (scalar) product between the first given quaternion
	 * {@code(q1w; q1x, q1y, q1z)} and the second given quaternion {@code (q2)}.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (q1w; q1x, q1y, q1z) . q2}
	 * 
	 * @param q1w The value of the w component of the first quaternion.
	 * @param q1x The value of the x component of the first quaternion.
	 * @param q1y The value of the y component of the first quaternion.
	 * @param q1z The value of the z component of the first quaternion.
	 * @param q2 The second quaternion.
	 * 
	 * @return The dot (scalar) product.
	 */
	public static float dot(float q1w, float q1x, float q1y, float q1z, Tup4fR q2)
	{
		return dot(q1w, q1x, q1y, q1z, q2.v0(), q2.v1(), q2.v2(), q2.v3());
	}
	
	/**
	 * Calculates the dot (scalar) product between the first given quaternion
	 * {@code (q1w; q1x, q1y, q1z)} and the second given quaternion
	 * {@code (q2[0]; q2[1], q2[2], q2[3])}.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (q1w; q1x, q1y, q1z) . (q2[0]; q2[1], q2[2], q2[3])}
	 * 
	 * @param q1w The value of the w component of the first quaternion.
	 * @param q1x The value of the x component of the first quaternion.
	 * @param q1y The value of the y component of the first quaternion.
	 * @param q1z The value of the z component of the first quaternion.
	 * @param q2 The second quaternion as an array with at least four entries.
	 * 
	 * @return The dot (scalar) product.
	 */
	public static float dot(float q1w, float q1x, float q1y, float q1z, @MinLength(4) float[] q2)
	{
		return dot(q1w, q1x, q1y, q1z, q2[0], q2[1], q2[2], q2[3]);
	}
	
	/**
	 * Calculates the dot (scalar) product between the first given quaternion
	 * {@code (q1w; q1x, q1y, q1z)} and the second given quaternion {@code (q2w; q2x, q2y, q2z)}.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (q1w; q1x, q1y, q1z) . (q2w; q2x, q2y, q2z)}
	 * 
	 * @param q1w The value of the w component of the first quaternion.
	 * @param q1x The value of the x component of the first quaternion.
	 * @param q1y The value of the y component of the first quaternion.
	 * @param q1z The value of the z component of the first quaternion.
	 * @param q2w The value of the w component of the second quaternion.
	 * @param q2x The value of the x component of the second quaternion.
	 * @param q2y The value of the y component of the second quaternion.
	 * @param q2z The value of the z component of the second quaternion.
	 * 
	 * @return The dot (scalar) product.
	 */
	public static float dot(float q1w, float q1x, float q1y, float q1z, float q2w, float q2x, float q2y, float q2z)
	{
		return q1w * q2w + q1x * q2x + q1y * q2y + q1z * q2z;
	}
	
	/**
	 * Calculates the conjugate of the quaternion {@code (q)} and saves the result in the given
	 * extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code q* }
	 * 
	 * @param q The quaternion as an array with at least four entries.
	 * @param res The extraction parameter for the result as an array with at least four entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] conjugate(Tup4fR q, @ExtractionParam @MinLength(4) float[] res)
	{
		return conjugate(q.v0(), q.v1(), q.v2(), q.v3(), res);
	}
	
	/**
	 * Calculates the conjugate of the quaternion {@code (q[0]; q[1], q[2], q[3])} and saves the
	 * result in the given extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (q[0]; q[1], q[2], q[3])* }
	 * 
	 * @param q The quaternion as an array with at least four entries.
	 * @param res The extraction parameter for the result as an array with at least four entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] conjugate(@MinLength(4) float[] q, @ExtractionParam @MinLength(4) float[] res)
	{
		return conjugate(q[0], q[1], q[2], q[3], res);
	}
	
	/**
	 * Calculates the conjugate of the quaternion {@code (w; x, y, z)} and saves the result in the
	 * given extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (w; x, y, z)* }
	 * 
	 * @param w The value of the w component of the quaternion.
	 * @param x The value of the x component of the quaternion.
	 * @param y The value of the y component of the quaternion.
	 * @param z The value of the z component of the quaternion.
	 * @param res The extraction parameter for the result as an array with at least four entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] conjugate(float w, float x, float y, float z, @ExtractionParam @MinLength(4) float[] res)
	{
		res[0] = w;
		res[1] = -x;
		res[2] = -y;
		res[3] = -z;
		
		return res;
	}
	
	/**
	 * Calculates the conjugate of the quaternion {@code (q)} and saves the result in the given
	 * extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code q* }
	 * 
	 * @param <T> The type of the extraction parameter object.
	 * 
	 * @param q The quaternion as an array with at least four entries.
	 * @param res The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup4fC> T conjugate(Tup4fR q, @ExtractionParam T res)
	{
		return conjugate(q.v0(), q.v1(), q.v2(), q.v3(), res);
	}
	
	/**
	 * Calculates the conjugate of the quaternion {@code (q[0]; q[1], q[2], q[3])} and saves the
	 * result in the given extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (q[0]; q[1], q[2], q[3])* }
	 * 
	 * @param <T> The type of the extraction parameter object.
	 * 
	 * @param q The quaternion as an array with at least four entries.
	 * @param res The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup4fC> T conjugate(@MinLength(4) float[] q, @ExtractionParam T res)
	{
		return conjugate(q[0], q[1], q[2], q[3], res);
	}
	
	/**
	 * Calculates the conjugate of the quaternion {@code (w; x, y, z)} and saves the result in the
	 * given extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (w; x, y, z)* }
	 * 
	 * @param <T> The type of the extraction parameter object.
	 * 
	 * @param w The value of the w component of the quaternion.
	 * @param x The value of the x component of the quaternion.
	 * @param y The value of the y component of the quaternion.
	 * @param z The value of the z component of the quaternion.
	 * @param res The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup4fC> T  conjugate(float w, float x, float y, float z, @ExtractionParam T res)
	{
		res.set(w, -x, -y, -z);
		
		return res;
	}
	
	/**
	 * Calculates the conjugate of the quaternion {@code (q)}, supplies the result to the given
	 * implementation of the functional interface and returns the result of that implementation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code q* }
	 * 
	 * @param <T> The type of the result object.
	 * 
	 * @param q The quaternion as an array with at least four entries.
	 * @param res A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T conjugateFunc(Tup4fR q, FloatTetraFunction<T> res)
	{
		return conjugateFunc(q.v0(), q.v1(), q.v2(), q.v3(), res);
	}
	
	/**
	 * Calculates the conjugate of the quaternion {@code (q[0]; q[1], q[2], q[3])}, supplies the
	 * result to the given implementation of the functional interface and returns the result of that
	 * implementation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (q[0]; q[1], q[2], q[3])* }
	 * 
	 * @param <T> The type of the result object.
	 * 
	 * @param q The quaternion as an array with at least four entries.
	 * @param res A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T conjugateFunc(@MinLength(4) float[] q, FloatTetraFunction<T> res)
	{
		return conjugateFunc(q[0], q[1], q[2], q[3], res);
	}
	
	/**
	 * Calculates the conjugate of the quaternion {@code (w; x, y, z)}, supplies the result to the
	 * given implementation of the functional interface and returns the result of that
	 * implementation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (w; x, y, z)* }
	 * 
	 * @param <T> The type of the result object.
	 * 
	 * @param w The value of the w component of the quaternion.
	 * @param x The value of the x component of the quaternion.
	 * @param y The value of the y component of the quaternion.
	 * @param z The value of the z component of the quaternion.
	 * @param res A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T conjugateFunc(float w, float x, float y, float z, FloatTetraFunction<T> res)
	{
		return res.apply(w, -x, -y, -z);
	}
	
	/**
	 * Calculates the inverse of the quaternion {@code (q)} and saves the result in the given
	 * extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code q* / |q|² }
	 * 
	 * @param q The quaternion.
	 * @param res The extraction parameter for the result as an array with at least four entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] inverse(Tup4fR q, @ExtractionParam @MinLength(4) float[] res)
	{
		return inverse(q.v0(), q.v1(), q.v2(), q.v3(), res);
	}
	
	/**
	 * Calculates the inverse of the quaternion {@code (q[0]; q[1], q[2], q[3])} and saves the
	 * result in the given extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (q[0]; q[1], q[2], q[3])* / |(q[0]; q[1], q[2], q[3])|² }
	 * 
	 * @param q The quaternion as an array with at least four entries.
	 * @param res The extraction parameter for the result as an array with at least four entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] inverse(@MinLength(4) float[] q, @ExtractionParam @MinLength(4) float[] res)
	{
		return inverse(q[0], q[1], q[2], q[3], res);
	}
	
	/**
	 * Calculates the inverse of the quaternion {@code (w; x, y, z)} and saves the result in the
	 * given extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (w; x, y, z)* / |(w; x, y, z)|² }
	 * 
	 * @param w The value of the w component of the quaternion.
	 * @param x The value of the x component of the quaternion.
	 * @param y The value of the y component of the quaternion.
	 * @param z The value of the z component of the quaternion.
	 * @param res The extraction parameter for the result as an array with at least four entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] inverse(float w, float x, float y, float z, @ExtractionParam @MinLength(4) float[] res)
	{
		float invLength = 1.0f / squaredLength(w, x, y, z);
		
		res[0] = w * invLength; 
		res[1] = -x * invLength;
		res[2] = -y * invLength;
		res[3] = -z * invLength;
		
		return res;
	}
	
	/**
	 * Calculates the inverse of the quaternion {@code (q)} and saves the result in the given
	 * extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code q* / |q|² }
	 * 
	 * @param <T> The type of the extraction parameter object.
	 * 
	 * @param q The quaternion.
	 * @param res The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup4fC> T inverse(Tup4fR q, @ExtractionParam T res)
	{
		return inverse(q.v0(), q.v1(), q.v2(), q.v3(), res);
	}
	
	/**
	 * Calculates the inverse of the quaternion {@code (q[0]; q[1], q[2], q[3])} and saves the
	 * result in the given extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (q[0]; q[1], q[2], q[3])* / |(q[0]; q[1], q[2], q[3])|² }
	 * 
	 * @param <T> The type of the extraction parameter object.
	 * 
	 * @param q The quaternion as an array with at least four entries.
	 * @param res The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup4fC> T inverse(@MinLength(4) float[] q, @ExtractionParam T res)
	{
		return inverse(q[0], q[1], q[2], q[3], res);
	}
	
	/**
	 * Calculates the inverse of the quaternion {@code (w; x, y, z)} and saves the result in the
	 * given extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (w; x, y, z)* / |(w; x, y, z)|² }
	 * 
	 * @param <T> The type of the extraction parameter object.
	 * 
	 * @param w The value of the w component of the quaternion.
	 * @param x The value of the x component of the quaternion.
	 * @param y The value of the y component of the quaternion.
	 * @param z The value of the z component of the quaternion.
	 * @param res The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup4fC> T inverse(float w, float x, float y, float z, @ExtractionParam T res)
	{
		float invLength = 1.0f / squaredLength(w, x, y, z);
		
		res.set(w * invLength, -x * invLength, -y * invLength, -z * invLength);
		
		return res;
	}
	
	/**
	 * Calculates the inverse of the quaternion {@code (q)}, supplies the result to the given
	 * implementation of the functional interface and returns the result of that implementation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code q* / |q|² }
	 * 
	 * @param <T> The type of the result object.
	 * 
	 * @param q The quaternion.
	 * @param res A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T inverseFunc(Tup4fR q, FloatTetraFunction<T> res)
	{
		return inverseFunc(q.v0(), q.v1(), q.v2(), q.v3(), res);
	}
	
	/**
	 * Calculates the inverse of the quaternion {@code (q[0]; q[1], q[2], q[3])}, supplies the
	 * result to the given implementation of the functional interface and returns the result of that
	 * implementation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (q[0]; q[1], q[2], q[3])* / |(q[0]; q[1], q[2], q[3])|² }
	 * 
	 * @param <T> The type of the result object.
	 * 
	 * @param q The quaternion as an array with at least four entries.
	 * @param res A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T inverseFunc(@MinLength(4) float[] q, FloatTetraFunction<T> res)
	{
		return inverseFunc(q[0], q[1], q[2], q[3], res);
	}
	
	/**
	 * Calculates the inverse of the quaternion {@code (w; x, y, z)}, supplies the result to the
	 * given implementation of the functional interface and returns the result of that
	 * implementation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (w; x, y, z)* / |(w; x, y, z)|² }
	 * 
	 * @param <T> The type of the result object.
	 * 
	 * @param w The value of the w component of the quaternion.
	 * @param x The value of the x component of the quaternion.
	 * @param y The value of the y component of the quaternion.
	 * @param z The value of the z component of the quaternion.
	 * @param res A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T inverseFunc(float w, float x, float y, float z, FloatTetraFunction<T> res)
	{
		float invLength = 1.0f / squaredLength(w, x, y, z);
		
		return res.apply(w * invLength, -x * invLength, -y * invLength, -z * invLength);
	}
	
	/**
	 * Normalizes the quaternion {@code (q)} and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code q / |q|}
	 * 
	 * @param q The quaternion.
	 * @param res The extraction parameter for the result as an array with at least four entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] normalize(Tup4fR q, @ExtractionParam @MinLength(4) float[] res)
	{
		return normalize(q.v0(), q.v1(), q.v2(), q.v3(), res);
	}	

	/**
	 * Normalizes the quaternion {@code (q)} and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code q / |q|}
	 * 
	 * @param q The quaternion.
	 * @param mathProvider
	 * The provider of fundamental math functions that should be used for calculation.
	 * @param res The extraction parameter for the result as an array with at least four entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] normalize(Tup4fR q, MathProvider mathProvider, @ExtractionParam @MinLength(4) float[] res)
	{
		return normalize(q.v0(), q.v1(), q.v2(), q.v3(), mathProvider, res);
	}
	
	/**
	 * Normalizes the quaternion {@code (q[0]; q[1], q[2], q[3])} and saves the result in the given
	 * extraction parameter.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (q[0]; q[1], q[2], q[3]) / |(q[0]; q[1], q[2], q[3])|}
	 * 
	 * @param q The quaternion as an array with at least four entries.
	 * @param res The extraction parameter for the result as an array with at least four entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] normalize(@MinLength(4) float[] q, @ExtractionParam @MinLength(4) float[] res)
	{
		return normalize(q[0], q[1], q[2], q[3], res);
	}	

	/**
	 * Normalizes the quaternion {@code (q[0]; q[1], q[2], q[3])} and saves the result in the given
	 * extraction parameter.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (q[0]; q[1], q[2], q[3]) / |(q[0]; q[1], q[2], q[3])|}
	 * 
	 * @param q The quaternion as an array with at least four entries.
	 * @param mathProvider
	 * The provider of fundamental math functions that should be used for calculation.
	 * @param res The extraction parameter for the result as an array with at least four entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] normalize(@MinLength(4) float[] q, MathProvider mathProvider, @ExtractionParam @MinLength(4) float[] res)
	{
		return normalize(q[0], q[1], q[2], q[3], mathProvider, res);
	}
	
	/**
	 * Normalizes the quaternion {@code (w; x, y, z)} and saves the result in the given extraction
	 * parameter.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (w; x, y, z) / |(w; x, y, z)|}
	 * 
	 * @param w The value of the w component of the quaternion.
	 * @param x The value of the x component of the quaternion.
	 * @param y The value of the y component of the quaternion.
	 * @param z The value of the z component of the quaternion.
	 * @param res The extraction parameter for the result as an array with at least four entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] normalize(float w, float x, float y, float z, @ExtractionParam @MinLength(4) float[] res)
	{
		return normalize(w, x, y, z, BarghosMath.PROVIDER, res);
	}	

	/**
	 * Normalizes the quaternion {@code (w; x, y, z)} and saves the result in the given extraction
	 * parameter.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (w; x, y, z) / |(w; x, y, z)|}
	 * 
	 * @param w The value of the w component of the quaternion.
	 * @param x The value of the x component of the quaternion.
	 * @param y The value of the y component of the quaternion.
	 * @param z The value of the z component of the quaternion.
	 * @param mathProvider
	 * The provider of fundamental math functions that should be used for calculation.
	 * @param res The extraction parameter for the result as an array with at least four entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] normalize(float w, float x, float y, float z, MathProvider mathProvider, @ExtractionParam @MinLength(4) float[] res)
	{
		float invLength = inverseLength(w, x, y, z, mathProvider);
		
		res[0] = w * invLength;
		res[1] = x * invLength;
		res[2] = y * invLength;
		res[3] = z * invLength;
		
		return res;
	}
	
	/**
	 * Normalizes the quaternion {@code (q)} and saves the result in the given extraction parameter
	 * object.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code q / |q|}
	 * 
	 * @param <T> The type of the extraction parameter object.
	 * 
	 * @param q The quaternion.
	 * @param res The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup4fC> T normalize(Tup4fR q, @ExtractionParam T res)
	{
		return normalize(q.v0(), q.v1(), q.v2(), q.v3(), res);
	}	

	/**
	 * Normalizes the quaternion {@code (q)} and saves the result in the given extraction parameter
	 * object.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code q / |q|}
	 * 
	 * @param <T> The type of the extraction parameter object.
	 * 
	 * @param q The quaternion.
	 * @param mathProvider
	 * The provider of fundamental math functions that should be used for calculation.
	 * @param res The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup4fC> T normalize(Tup4fR q, MathProvider mathProvider, @ExtractionParam T res)
	{
		return normalize(q.v0(), q.v1(), q.v2(), q.v3(), mathProvider, res);
	}
	
	/**
	 * Normalizes the quaternion {@code (q[0]; q[1], q[2], q[3])} and saves the result in the given
	 * extraction parameter object.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (q[0]; q[1], q[2], q[3]) / |(q[0]; q[1], q[2], q[3])|}
	 * 
	 * @param <T> The type of the extraction parameter object.
	 * 
	 * @param q The quaternion as an array with at least four entries.
	 * @param res The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup4fC> T normalize(@MinLength(4) float[] q, @ExtractionParam T res)
	{
		return normalize(q[0], q[1], q[2], q[3], res);
	}	

	/**
	 * Normalizes the quaternion {@code (q[0]; q[1], q[2], q[3])} and saves the result in the given
	 * extraction parameter object.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (q[0]; q[1], q[2], q[3]) / |(q[0]; q[1], q[2], q[3])|}
	 * 
	 * @param <T> The type of the extraction parameter object.
	 * 
	 * @param q The quaternion as an array with at least four entries.
	 * @param mathProvider
	 * The provider of fundamental math functions that should be used for calculation.
	 * @param res The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup4fC> T normalize(@MinLength(4) float[] q, MathProvider mathProvider, @ExtractionParam T res)
	{
		return normalize(q[0], q[1], q[2], q[3], mathProvider, res);
	}
	
	/**
	 * Normalizes the quaternion {@code (w; x, y, z)} and saves the result in the given extraction
	 * parameter object.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (w; x, y, z) / |(w; x, y, z)|}
	 * 
	 * @param <T> The type of the extraction parameter object.
	 * 
	 * @param w The value of the w component of the quaternion.
	 * @param x The value of the x component of the quaternion.
	 * @param y The value of the y component of the quaternion.
	 * @param z The value of the z component of the quaternion.
	 * @param res The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup4fC> T normalize(float w, float x, float y, float z, @ExtractionParam T res)
	{
		return normalize(w, x, y, z, BarghosMath.PROVIDER, res);
	}	

	/**
	 * Normalizes the quaternion {@code (w; x, y, z)} and saves the result in the given extraction
	 * parameter object.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (w; x, y, z) / |(w; x, y, z)|}
	 * 
	 * @param <T> The type of the extraction parameter object.
	 * 
	 * @param w The value of the w component of the quaternion.
	 * @param x The value of the x component of the quaternion.
	 * @param y The value of the y component of the quaternion.
	 * @param z The value of the z component of the quaternion.
	 * @param mathProvider
	 * The provider of fundamental math functions that should be used for calculation.
	 * @param res The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup4fC> T normalize(float w, float x, float y, float z, MathProvider mathProvider, @ExtractionParam T res)
	{
		float invLength = inverseLength(w, x, y, z, mathProvider);
		
		res.set(w * invLength, x * invLength, y * invLength, z * invLength);
		
		return res;
	}
	
	/**
	 * Normalizes the quaternion {@code (q)}, supplies the result to the given implementation of the
	 * functional interface and returns the result of that implementation.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code q / |q|}
	 * 
	 * @param <T> The type of the result object.
	 * 
	 * @param q The quaternion.
	 * @param res A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T normalizeFunc(Tup4fR q, FloatTetraFunction<T> res)
	{
		return normalizeFunc(q.v0(), q.v1(), q.v2(), q.v3(), res);
	}	

	/**
	 * Normalizes the quaternion {@code (q)}, supplies the result to the given implementation of the
	 * functional interface and returns the result of that implementation.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code q / |q|}
	 * 
	 * @param <T> The type of the result object.
	 * 
	 * @param q The quaternion.
	 * @param mathProvider The provider of fundamental math functions that should be used for calculation.
	 * @param res A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T normalizeFunc(Tup4fR q, MathProvider mathProvider, FloatTetraFunction<T> res)
	{
		return normalizeFunc(q.v0(), q.v1(), q.v2(), q.v3(), mathProvider, res);
	}
	
	/**
	 * Normalizes the quaternion {@code (q[0]; q[1], q[2], q[3])}, supplies the result to the given
	 * implementation of the functional interface and returns the result of that implementation.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (q[0]; q[1], q[2], q[3]) / |(q[0]; q[1], q[2], q[3])|}
	 * 
	 * @param <T> The type of the result object.
	 * 
	 * @param q The quaternion as an array with at least four entries.
	 * @param res A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T normalizeFunc(@MinLength(4) float[] q, FloatTetraFunction<T> res)
	{
		return normalizeFunc(q[0], q[1], q[2], q[3], res);
	}	

	/**
	 * Normalizes the quaternion {@code (q[0]; q[1], q[2], q[3])}, supplies the result to the given
	 * implementation of the functional interface and returns the result of that implementation.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (q[0]; q[1], q[2], q[3]) / |(q[0]; q[1], q[2], q[3])|}
	 * 
	 * @param <T> The type of the result object.
	 * 
	 * @param q The quaternion as an array with at least four entries.
	 * @param mathProvider The provider of fundamental math functions that should be used for calculation.
	 * @param res A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T normalizeFunc(@MinLength(4) float[] q, MathProvider mathProvider, FloatTetraFunction<T> res)
	{
		return normalizeFunc(q[0], q[1], q[2], q[3], mathProvider, res);
	}
	
	/**
	 * Normalizes the quaternion {@code (w; x, y, z)}, supplies the result to the given
	 * implementation of the functional interface and returns the result of that implementation.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (w; x, y, z) / |(w; x, y, z)|}
	 * 
	 * @param <T> The type of the result object.
	 * 
	 * @param w The value of the w component of the quaternion.
	 * @param x The value of the x component of the quaternion.
	 * @param y The value of the y component of the quaternion.
	 * @param z The value of the z component of the quaternion.
	 * @param res A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T normalizeFunc(float w, float x, float y, float z, FloatTetraFunction<T> res)
	{
		return normalizeFunc(w, x, y, z, BarghosMath.PROVIDER, res);
	}	

	/**
	 * Normalizes the quaternion {@code (w; x, y, z)}, supplies the result to the given
	 * implementation of the functional interface and returns the result of that implementation.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (w; x, y, z) / |(w; x, y, z)|}
	 * 
	 * @param <T> The type of the result object.
	 * 
	 * @param w The value of the w component of the quaternion.
	 * @param x The value of the x component of the quaternion.
	 * @param y The value of the y component of the quaternion.
	 * @param z The value of the z component of the quaternion.
	 * @param mathProvider
	 * The provider of fundamental math functions that should be used for calculation.
	 * @param res A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T normalizeFunc(float w, float x, float y, float z, MathProvider mathProvider, FloatTetraFunction<T> res)
	{
		float invLength = inverseLength(w, x, y, z, mathProvider);

		return res.apply(w * invLength, x * invLength, y * invLength, z * invLength);
	}
	
	/**
	 * Multiplies the first given quaternion {@code (q1)} with the second given quaternion {@code (q2)}, normalizes the result and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code q1 * q2}
	 * 
	 * @param q1 The first quaternion.
	 * @param q2 The second quaternion.
	 * @param res The extraction parameter for the result as an array with at least four entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] mul(Tup4fR q1, Tup4fR q2, @ExtractionParam @MinLength(4) float[] res)
	{
		return mul(q1.v0(), q1.v1(), q1.v2(), q1.v3(), q2.v0(), q2.v1(), q2.v2(), q2.v3(), res);
	}
	
	/**
	 * Multiplies the first given quaternion {@code (q1)} with the second given quaternion {@code (q2)}, normalizes the result and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code q1 * q2}
	 * 
	 * @param q1 The first quaternion.
	 * @param q2 The second quaternion.
	 * @param mathProvider
	 * The provider of fundamental math functions that should be used for calculation.
	 * @param res The extraction parameter for the result as an array with at least four entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] mul(Tup4fR q1, Tup4fR q2, MathProvider mathProvider, @ExtractionParam @MinLength(4) float[] res)
	{
		return mul(q1.v0(), q1.v1(), q1.v2(), q1.v3(), q2.v0(), q2.v1(), q2.v2(), q2.v3(), mathProvider, res);
	}
	
	/**
	 * Multiplies the first given quaternion {@code (q1)} with the second given quaternion {@code (q2[0]; q2[1], q2[2], q2[3])}, normalizes the result and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code q1 * (q2[0]; q2[1], q2[2], q2[3])}
	 * 
	 * @param q1 The first quaternion.
	 * @param q2 The second quaternion as an array with at least four entries.
	 * @param res The extraction parameter for the result as an array with at least four entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] mul(Tup4fR q1, @MinLength(4) float[] q2, @ExtractionParam @MinLength(4) float[] res)
	{
		return mul(q1.v0(), q1.v1(), q1.v2(), q1.v3(), q2[0], q2[1], q2[2], q2[3], res);
	}
	
	/**
	 * Multiplies the first given quaternion {@code (q1)} with the second given quaternion {@code (q2[0]; q2[1], q2[2], q2[3])}, normalizes the result and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code q1 * (q2[0]; q2[1], q2[2], q2[3])}
	 * 
	 * @param q1 The first quaternion.
	 * @param q2 The second quaternion as an array with at least four entries.
	 * @param mathProvider
	 * The provider of fundamental math functions that should be used for calculation.
	 * @param res The extraction parameter for the result as an array with at least four entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] mul(Tup4fR q1, @MinLength(4) float[] q2, MathProvider mathProvider, @ExtractionParam @MinLength(4) float[] res)
	{
		return mul(q1.v0(), q1.v1(), q1.v2(), q1.v3(), q2[0], q2[1], q2[2], q2[3], mathProvider, res);
	}
	
	/**
	 * Multiplies the first given quaternion {@code (q1)} with the second given quaternion {@code (q2w; q2x, q2y, q2z)}, normalizes the result and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code q1 * (q2w; q2x, q2y, q2z)}
	 * 
	 * @param q1 The first quaternion.
	 * @param q2w The value of the w component of the second quaternion.
	 * @param q2x The value of the x component of the second quaternion.
	 * @param q2y The value of the y component of the second quaternion.
	 * @param q2z The value of the z component of the second quaternion.
	 * @param res The extraction parameter for the result as an array with at least four entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] mul(Tup4fR q1, float q2w, float q2x, float q2y, float q2z, @ExtractionParam @MinLength(4) float[] res)
	{
		return mul(q1.v0(), q1.v1(), q1.v2(), q1.v3(), q2w, q2x, q2y, q2z, res);
	}
	
	/**
	 * Multiplies the first given quaternion {@code (q1)} with the second given quaternion {@code (q2w; q2x, q2y, q2z)}, normalizes the result and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code q1 * (q2w; q2x, q2y, q2z)}
	 * 
	 * @param q1 The first quaternion.
	 * @param q2w The value of the w component of the second quaternion.
	 * @param q2x The value of the x component of the second quaternion.
	 * @param q2y The value of the y component of the second quaternion.
	 * @param q2z The value of the z component of the second quaternion.
	 * @param mathProvider
	 * The provider of fundamental math functions that should be used for calculation.
	 * @param res The extraction parameter for the result as an array with at least four entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] mul(Tup4fR q1, float q2w, float q2x, float q2y, float q2z, MathProvider mathProvider, @ExtractionParam @MinLength(4) float[] res)
	{
		return mul(q1.v0(), q1.v1(), q1.v2(), q1.v3(), q2w, q2x, q2y, q2z, mathProvider, res);
	}
	
	/**
	 * Multiplies the first given quaternion {@code (q1[0]; q1[1], q1[2], q1[3])} with the second given quaternion {@code (q2)}, normalizes the result and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (q1[0]; q1[1], q1[2], q1[3]) * q2}
	 * 
	 * @param q1 The first quaternion as an array with at least four entries.
	 * @param q2 The second quaternion.
	 * @param res The extraction parameter for the result as an array with at least four entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] mul(@MinLength(4) float[] q1, Tup4fR q2, @ExtractionParam @MinLength(4) float[] res)
	{
		return mul(q1[0], q1[1], q1[2], q1[3], q2.v0(), q2.v1(), q2.v2(), q2.v3(), res);
	}
	
	/**
	 * Multiplies the first given quaternion {@code (q1[0]; q1[1], q1[2], q1[3])} with the second given quaternion {@code (q2)}, normalizes the result and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (q1[0]; q1[1], q1[2], q1[3]) * q2}
	 * 
	 * @param q1 The first quaternion as an array with at least four entries.
	 * @param q2 The second quaternion.
	 * @param mathProvider
	 * The provider of fundamental math functions that should be used for calculation.
	 * @param res The extraction parameter for the result as an array with at least four entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] mul(@MinLength(4) float[] q1, Tup4fR q2, MathProvider mathProvider, @ExtractionParam @MinLength(4) float[] res)
	{
		return mul(q1[0], q1[1], q1[2], q1[3], q2.v0(), q2.v1(), q2.v2(), q2.v3(), mathProvider, res);
	}
	
	/**
	 * Multiplies the first given quaternion {@code (q1[0]; q1[1], q1[2], q1[3])} with the second given quaternion {@code (q2[0]; q2[1], q2[2], q2[3])}, normalizes the result and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (q1[0]; q1[1], q1[2], q1[3]) * (q2[0]; q2[1], q2[2], q2[3])}
	 * 
	 * @param q1 The first quaternion as an array with at least four entries.
	 * @param q2 The second quaternion as an array with at least four entries.
	 * @param res The extraction parameter for the result as an array with at least four entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] mul(@MinLength(4) float[] q1, @MinLength(4) float[] q2, @ExtractionParam @MinLength(4) float[] res)
	{
		return mul(q1[0], q1[1], q1[2], q1[3], q2[0], q2[1], q2[2], q2[3], res);
	}
	
	/**
	 * Multiplies the first given quaternion {@code (q1[0]; q1[1], q1[2], q1[3])} with the second given quaternion {@code (q2[0]; q2[1], q2[2], q2[3])}, normalizes the result and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (q1[0]; q1[1], q1[2], q1[3]) * (q2[0]; q2[1], q2[2], q2[3])}
	 * 
	 * @param q1 The first quaternion as an array with at least four entries.
	 * @param q2 The second quaternion as an array with at least four entries.
	 * @param mathProvider
	 * The provider of fundamental math functions that should be used for calculation.
	 * @param res The extraction parameter for the result as an array with at least four entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] mul(@MinLength(4) float[] q1, @MinLength(4) float[] q2, MathProvider mathProvider, @ExtractionParam @MinLength(4) float[] res)
	{
		return mul(q1[0], q1[1], q1[2], q1[3], q2[0], q2[1], q2[2], q2[3], mathProvider, res);
	}
	
	/**
	 * Multiplies the first given quaternion {@code (q1[0]; q1[1], q1[2], q1[3])} with the second given quaternion {@code (q2w; q2x, q2y, q2z)}, normalizes the result and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (q1[0]; q1[1], q1[2], q1[3]) * (q2w; q2x, q2y, q2z)}
	 * 
	 * @param q1 The first quaternion as an array with at least four entries.
	 * @param q2w The value of the w component of the second quaternion.
	 * @param q2x The value of the x component of the second quaternion.
	 * @param q2y The value of the y component of the second quaternion.
	 * @param q2z The value of the z component of the second quaternion.
	 * @param res The extraction parameter for the result as an array with at least four entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] mul(@MinLength(4) float[] q1, float q2w, float q2x, float q2y, float q2z, @ExtractionParam @MinLength(4) float[] res)
	{
		return mul(q1[0], q1[1], q1[2], q1[3], q2w, q2x, q2y, q2z, res);
	}
	
	/**
	 * Multiplies the first given quaternion {@code (q1[0]; q1[1], q1[2], q1[3])} with the second given quaternion {@code (q2w; q2x, q2y, q2z)}, normalizes the result and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (q1[0]; q1[1], q1[2], q1[3]) * (q2w; q2x, q2y, q2z)}
	 * 
	 * @param q1 The first quaternion as an array with at least four entries.
	 * @param q2w The value of the w component of the second quaternion.
	 * @param q2x The value of the x component of the second quaternion.
	 * @param q2y The value of the y component of the second quaternion.
	 * @param q2z The value of the z component of the second quaternion.
	 * @param mathProvider
	 * The provider of fundamental math functions that should be used for calculation.
	 * @param res The extraction parameter for the result as an array with at least four entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] mul(@MinLength(4) float[] q1, float q2w, float q2x, float q2y, float q2z, MathProvider mathProvider, @ExtractionParam @MinLength(4) float[] res)
	{
		return mul(q1[0], q1[1], q1[2], q1[3], q2w, q2x, q2y, q2z, mathProvider, res);
	}
	
	/**
	 * Multiplies the first given quaternion {@code (q1w; q1x, q1y, q1z)} with the second given quaternion {@code (q2)}, normalizes the result and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (q1w; q1x, q1y, q1z) * q2}
	 * 
	 * @param q1w The value of the w component of the first quaternion.
	 * @param q1x The value of the x component of the first quaternion.
	 * @param q1y The value of the y component of the first quaternion.
	 * @param q1z The value of the z component of the first quaternion.
	 * @param q2 The second quaternion.
	 * @param res The extraction parameter for the result as an array with at least four entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] mul(float q1w, float q1x, float q1y, float q1z, Tup4fR q2, @ExtractionParam @MinLength(4) float[] res)
	{
		return mul(q1w, q1x, q1y, q1z, q2.v0(), q2.v1(), q2.v2(), q2.v3(), res);
	}
	
	/**
	 * Multiplies the first given quaternion {@code (q1w; q1x, q1y, q1z)} with the second given quaternion {@code (q2)}, normalizes the result and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (q1w; q1x, q1y, q1z) * q2}
	 * 
	 * @param q1w The value of the w component of the first quaternion.
	 * @param q1x The value of the x component of the first quaternion.
	 * @param q1y The value of the y component of the first quaternion.
	 * @param q1z The value of the z component of the first quaternion.
	 * @param q2 The second quaternion.
	 * @param mathProvider
	 * The provider of fundamental math functions that should be used for calculation.
	 * @param res The extraction parameter for the result as an array with at least four entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] mul(float q1w, float q1x, float q1y, float q1z, Tup4fR q2, MathProvider mathProvider, @ExtractionParam @MinLength(4) float[] res)
	{
		return mul(q1w, q1x, q1y, q1z, q2.v0(), q2.v1(), q2.v2(), q2.v3(), mathProvider, res);
	}
	
	/**
	 * Multiplies the first given quaternion {@code (q1w; q1x, q1y, q1z)} with the second given quaternion {@code (q2[0]; q2[1], q2[2], q2[3])}, normalizes the result and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (q1w; q1x, q1y, q1z) * (q2[0]; q2[1], q2[2], q2[3])}
	 * 
	 * @param q1w The value of the w component of the first quaternion.
	 * @param q1x The value of the x component of the first quaternion.
	 * @param q1y The value of the y component of the first quaternion.
	 * @param q1z The value of the z component of the first quaternion.
	 * @param q2 The second quaternion as an array with at least four entries.
	 * @param res The extraction parameter for the result as an array with at least four entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] mul(float q1w, float q1x, float q1y, float q1z, @MinLength(4) float[] q2, @ExtractionParam @MinLength(4) float[] res)
	{
		return mul(q1w, q1x, q1y, q1z, q2[0], q2[1], q2[2], q2[3], res);
	}
	
	/**
	 * Multiplies the first given quaternion {@code (q1w; q1x, q1y, q1z)} with the second given quaternion {@code (q2[0]; q2[1], q2[2], q2[3])}, normalizes the result and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (q1w; q1x, q1y, q1z) * (q2[0]; q2[1], q2[2], q2[3])}
	 * 
	 * @param q1w The value of the w component of the first quaternion.
	 * @param q1x The value of the x component of the first quaternion.
	 * @param q1y The value of the y component of the first quaternion.
	 * @param q1z The value of the z component of the first quaternion.
	 * @param q2 The second quaternion as an array with at least four entries.
	 * @param mathProvider
	 * The provider of fundamental math functions that should be used for calculation.
	 * @param res The extraction parameter for the result as an array with at least four entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] mul(float q1w, float q1x, float q1y, float q1z, @MinLength(4) float[] q2, MathProvider mathProvider, @ExtractionParam @MinLength(4) float[] res)
	{
		return mul(q1w, q1x, q1y, q1z, q2[0], q2[1], q2[2], q2[3], mathProvider, res);
	}
	
	/**
	 * Multiplies the first given quaternion {@code (q1w; q1x, q1y, q1z)} with the second given quaternion {@code (q2w; q2x, q2y, q2z)}, normalizes the result and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (q1w; q1x, q1y, q1z) * (q2w; q2x, q2y, q2z)}
	 * 
	 * @param q1w The value of the w component of the first quaternion.
	 * @param q1x The value of the x component of the first quaternion.
	 * @param q1y The value of the y component of the first quaternion.
	 * @param q1z The value of the z component of the first quaternion.
	 * @param q2w The value of the w component of the second quaternion.
	 * @param q2x The value of the x component of the second quaternion.
	 * @param q2y The value of the y component of the second quaternion.
	 * @param q2z The value of the z component of the second quaternion.
	 * @param res The extraction parameter for the result as an array with at least four entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] mul(float q1w, float q1x, float q1y, float q1z, float q2w, float q2x, float q2y, float q2z, @ExtractionParam @MinLength(4) float[] res)
	{
		return mul(q1w, q1x, q1y, q1z, q2w, q2x, q2y, q2z, BarghosMath.PROVIDER, res);
	}
	
	/**
	 * Multiplies the first given quaternion {@code (q1w; q1x, q1y, q1z)} with the second given quaternion {@code (q2w; q2x, q2y, q2z)}, normalizes the result and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (q1w; q1x, q1y, q1z) * (q2w; q2x, q2y, q2z)}
	 * 
	 * @param q1w The value of the w component of the first quaternion.
	 * @param q1x The value of the x component of the first quaternion.
	 * @param q1y The value of the y component of the first quaternion.
	 * @param q1z The value of the z component of the first quaternion.
	 * @param q2w The value of the w component of the second quaternion.
	 * @param q2x The value of the x component of the second quaternion.
	 * @param q2y The value of the y component of the second quaternion.
	 * @param q2z The value of the z component of the second quaternion.
	 * @param mathProvider
	 * The provider of fundamental math functions that should be used for calculation.
	 * @param res The extraction parameter for the result as an array with at least four entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] mul(float q1w, float q1x, float q1y, float q1z, float q2w, float q2x, float q2y, float q2z, MathProvider mathProvider, @ExtractionParam @MinLength(4) float[] res)
	{
		/*
		 * Mutliplication happens for (w1; v1) * (w2; v2) by:
		 * 
		 * (w1 * w2 + (-v1) . v2; w1 * v2 + w2 * v1 + v1 x v2)
		 */
		float rw = q1w * q2w - q1x * q2x - q1y * q2y - q1z * q2z; // w * w' - v * v'
		
		float rx = q1w * q2x + q2w * q1x + q1y * q2z - q1z * q2y;  // s * v'.x + s' * v.x + (V x V').x
		float ry = q1w * q2y + q2w * q1y + q1z * q2x - q1x * q2z; // s * v'.y + s' * v.y + (V x V').y
		float rz = q1w * q2z + q2w * q1z + q1x * q2y - q1y * q2x;  // s * v'.z + s' * v.z + (V x V').z

		normalize(rw, rx, ry, rz, mathProvider, res);

		return res;
	}
	
	/**
	 * Multiplies the first given quaternion {@code (q1)} with the second given quaternion {@code (q2)}, normalizes the result and saves the result in the given extraction parameter object.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code q1 * q2}
	 * 
	 * @param <T> The type of the extraction parameter object.
	 * 
	 * @param q1 The first quaternion.
	 * @param q2 The second quaternion.
	 * @param res The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup4fC> T mul(Tup4fR q1, Tup4fR q2, @ExtractionParam T res)
	{
		return mul(q1.v0(), q1.v1(), q1.v2(), q1.v3(), q2.v0(), q2.v1(), q2.v2(), q2.v3(), res);
	}
	
	/**
	 * Multiplies the first given quaternion {@code (q1)} with the second given quaternion {@code (q2)}, normalizes the result and saves the result in the given extraction parameter object.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code q1 * q2}
	 * 
	 * @param <T> The type of the extraction parameter object.
	 * 
	 * @param q1 The first quaternion.
	 * @param q2 The second quaternion.
	 * @param mathProvider
	 * The provider of fundamental math functions that should be used for calculation.
	 * @param res The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup4fC> T mul(Tup4fR q1, Tup4fR q2, MathProvider mathProvider, @ExtractionParam T res)
	{
		return mul(q1.v0(), q1.v1(), q1.v2(), q1.v3(), q2.v0(), q2.v1(), q2.v2(), q2.v3(), mathProvider, res);
	}
	
	/**
	 * Multiplies the first given quaternion {@code (q1)} with the second given quaternion {@code (q2[0]; q2[1], q2[2], q2[3])}, normalizes the result and saves the result in the given extraction parameter object.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code q1 * (q2[0]; q2[1], q2[2], q2[3])}
	 * 
	 * @param <T> The type of the extraction parameter object.
	 * 
	 * @param q1 The first quaternion.
	 * @param q2 The second quaternion as an array with at least four entries.
	 * @param res The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup4fC> T mul(Tup4fR q1, @MinLength(4) float[] q2, @ExtractionParam T res)
	{
		return mul(q1.v0(), q1.v1(), q1.v2(), q1.v3(), q2[0], q2[1], q2[2], q2[3], res);
	}
	
	/**
	 * Multiplies the first given quaternion {@code (q1)} with the second given quaternion {@code (q2[0]; q2[1], q2[2], q2[3])}, normalizes the result and saves the result in the given extraction parameter object.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code q1 * (q2[0]; q2[1], q2[2], q2[3])}
	 * 
	 * @param <T> The type of the extraction parameter object.
	 * 
	 * @param q1 The first quaternion.
	 * @param q2 The second quaternion as an array with at least four entries.
	 * @param mathProvider
	 * The provider of fundamental math functions that should be used for calculation.
	 * @param res The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup4fC> T mul(Tup4fR q1, @MinLength(4) float[] q2, MathProvider mathProvider, @ExtractionParam T res)
	{
		return mul(q1.v0(), q1.v1(), q1.v2(), q1.v3(), q2[0], q2[1], q2[2], q2[3], mathProvider, res);
	}
	
	/**
	 * Multiplies the first given quaternion {@code (q1)} with the second given quaternion {@code (q2w; q2x q2y, q2z)}, normalizes the result and saves the result in the given extraction parameter object.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code q1 * (q2w; q2x, q2y, q2z)}
	 * 
	 * @param <T> The type of the extraction parameter object.
	 * 
	 * @param q1 The first quaternion.
	 * @param q2w The value of the w component of the second quaternion.
	 * @param q2x The value of the x component of the second quaternion.
	 * @param q2y The value of the y component of the second quaternion.
	 * @param q2z The value of the z component of the second quaternion.
	 * @param res The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup4fC> T mul(Tup4fR q1, float q2w, float q2x, float q2y, float q2z, @ExtractionParam T res)
	{
		return mul(q1.v0(), q1.v1(), q1.v2(), q1.v3(), q2w, q2x, q2y, q2z, res);
	}
	
	/**
	 * Multiplies the first given quaternion {@code (q1)} with the second given quaternion {@code (q2w; q2x, q2y, q2z)}, normalizes the result and saves the result in the given extraction parameter object.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code q1 * (q2w; q2x, q2y, q2z)}
	 * 
	 * @param <T> The type of the extraction parameter object.
	 * 
	 * @param q1 The first quaternion.
	 * @param q2w The value of the w component of the second quaternion.
	 * @param q2x The value of the x component of the second quaternion.
	 * @param q2y The value of the y component of the second quaternion.
	 * @param q2z The value of the z component of the second quaternion.
	 * @param mathProvider
	 * The provider of fundamental math functions that should be used for calculation.
	 * @param res The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup4fC> T mul(Tup4fR q1, float q2w, float q2x, float q2y, float q2z, MathProvider mathProvider, @ExtractionParam T res)
	{
		return mul(q1.v0(), q1.v1(), q1.v2(), q1.v3(), q2w, q2x, q2y, q2z, mathProvider, res);
	}
	
	/**
	 * Multiplies the first given quaternion {@code (q1[0]; q1[1], q1[2], q1[3])} with the second given quaternion {@code (q2)}, normalizes the result and saves the result in the given extraction parameter object.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (q1[0]; q1[1], q1[2], q1[3]) * q2}
	 * 
	 * @param <T> The type of the extraction parameter object.
	 * 
	 * @param q1 The first quaternion as an array with at least four entries.
	 * @param q2 The second quaternion.
	 * @param res The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup4fC> T mul(@MinLength(4) float[] q1, Tup4fR q2, @ExtractionParam T res)
	{
		return mul(q1[0], q1[1], q1[2], q1[3], q2.v0(), q2.v1(), q2.v2(), q2.v3(), res);
	}
	
	/**
	 * Multiplies the first given quaternion {@code (q1[0]; q1[1], q1[2], q1[3])} with the second given quaternion {@code (q2)}, normalizes the result and saves the result in the given extraction parameter object.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (q1[0]; q1[1], q1[2], q1[3]) * q2}
	 * 
	 * @param <T> The type of the extraction parameter object.
	 * 
	 * @param q1 The first quaternion as an array with at least four entries.
	 * @param q2 The second quaternion.
	 * @param mathProvider
	 * The provider of fundamental math functions that should be used for calculation.
	 * @param res The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup4fC> T mul(@MinLength(4) float[] q1, Tup4fR q2, MathProvider mathProvider, @ExtractionParam T res)
	{
		return mul(q1[0], q1[1], q1[2], q1[3], q2.v0(), q2.v1(), q2.v2(), q2.v3(), mathProvider, res);
	}
	
	/**
	 * Multiplies the first given quaternion {@code (q1[0]; q1[1], q1[2], q1[3])} with the second given quaternion {@code (q2[0]; q2[1], q2[2], q2[3])}, normalizes the result and saves the result in the given extraction parameter object.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (q1[0]; q1[1], q1[2], q1[3]) * (q2[0]; q2[1], q2[2], q2[3])}
	 * 
	 * @param <T> The type of the extraction parameter object.
	 * 
	 * @param q1 The first quaternion as an array with at least four entries.
	 * @param q2 The second quaternion as an array with at least four entries.
	 * @param res The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup4fC> T mul(@MinLength(4) float[] q1, @MinLength(4) float[] q2, @ExtractionParam T res)
	{
		return mul(q1[0], q1[1], q1[2], q1[3], q2[0], q2[1], q2[2], q2[3], res);
	}
	
	/**
	 * Multiplies the first given quaternion {@code (q1[0]; q1[1], q1[2], q1[3])} with the second given quaternion {@code (q2[0]; q2[1], q2[2], q2[3])}, normalizes the result and saves the result in the given extraction parameter object.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (q1[0]; q1[1], q1[2], q1[3]) * (q2[0]; q2[1], q2[2], q2[3])}
	 * 
	 * @param <T> The type of the extraction parameter object.
	 * 
	 * @param q1 The first quaternion as an array with at least four entries.
	 * @param q2 The second quaternion as an array with at least four entries.
	 * @param mathProvider
	 * The provider of fundamental math functions that should be used for calculation.
	 * @param res The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup4fC> T mul(@MinLength(4) float[] q1, @MinLength(4) float[] q2, MathProvider mathProvider, @ExtractionParam T res)
	{
		return mul(q1[0], q1[1], q1[2], q1[3], q2[0], q2[1], q2[2], q2[3], mathProvider, res);
	}
	
	/**
	 * Multiplies the first given quaternion {@code (q1[0]; q1[1], q1[2], q1[3])} with the second given quaternion {@code (q2w; q2x, q2y, q2z)}, normalizes the result and saves the result in the given extraction parameter object.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (q1[0]; q1[1], q1[2], q1[3]) * (q2w; q2x, q2y, q2z)}
	 * 
	 * @param <T> The type of the extraction parameter object.
	 * 
	 * @param q1 The first quaternion as an array with at least four entries.
	 * @param q2w The value of the w component of the second quaternion.
	 * @param q2x The value of the x component of the second quaternion.
	 * @param q2y The value of the y component of the second quaternion.
	 * @param q2z The value of the z component of the second quaternion.
	 * @param res The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup4fC> T mul(@MinLength(4) float[] q1, float q2w, float q2x, float q2y, float q2z, @ExtractionParam T res)
	{
		return mul(q1[0], q1[1], q1[2], q1[3], q2w, q2x, q2y, q2z, res);
	}
	
	/**
	 * Multiplies the first given quaternion {@code (q1[0]; q1[1], q1[2], q1[3])} with the second given quaternion {@code (q2w; q2x, q2y, q2z)}, normalizes the result and saves the result in the given extraction parameter object.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (q1[0]; q1[1], q1[2], q1[3]) * (q2w; q2x, q2y, q2z)}
	 * 
	 * @param <T> The type of the extraction parameter object.
	 * 
	 * @param q1 The first quaternion as an array with at least four entries.
	 * @param q2w The value of the w component of the second quaternion.
	 * @param q2x The value of the x component of the second quaternion.
	 * @param q2y The value of the y component of the second quaternion.
	 * @param q2z The value of the z component of the second quaternion.
	 * @param mathProvider
	 * The provider of fundamental math functions that should be used for calculation.
	 * @param res The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup4fC> T mul(@MinLength(4) float[] q1, float q2w, float q2x, float q2y, float q2z, MathProvider mathProvider, @ExtractionParam T res)
	{
		return mul(q1[0], q1[1], q1[2], q1[3], q2w, q2x, q2y, q2z, mathProvider, res);
	}
	
	/**
	 * Multiplies the first given quaternion {@code (q1w; q1x, q1y, q1z)} with the second given quaternion {@code (q2)}, normalizes the result and saves the result in the given extraction parameter object.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (q1w; q1x, q1y, q1z) * q2}
	 * 
	 * @param <T> The type of the extraction parameter object.
	 * 
	 * @param q1w The value of the w component of the first quaternion.
	 * @param q1x The value of the x component of the first quaternion.
	 * @param q1y The value of the y component of the first quaternion.
	 * @param q1z The value of the z component of the first quaternion.
	 * @param q2 The second quaternion.
	 * @param res The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup4fC> T mul(float q1w, float q1x, float q1y, float q1z, Tup4fR q2, @ExtractionParam T res)
	{
		return mul(q1w, q1x, q1y, q1z, q2.v0(), q2.v1(), q2.v2(), q2.v3(), res);
	}
	
	/**
	 * Multiplies the first given quaternion {@code (q1w; q1x, q1y, q1z)} with the second given quaternion {@code (q2)}, normalizes the result and saves the result in the given extraction parameter object.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (q1w; q1x, q1y, q1z) * q2}
	 * 
	 * @param <T> The type of the extraction parameter object.
	 * 
	 * @param q1w The value of the w component of the first quaternion.
	 * @param q1x The value of the x component of the first quaternion.
	 * @param q1y The value of the y component of the first quaternion.
	 * @param q1z The value of the z component of the first quaternion.
	 * @param q2 The second quaternion.
	 * @param mathProvider
	 * The provider of fundamental math functions that should be used for calculation.
	 * @param res The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup4fC> T mul(float q1w, float q1x, float q1y, float q1z, Tup4fR q2, MathProvider mathProvider, @ExtractionParam T res)
	{
		return mul(q1w, q1x, q1y, q1z, q2.v0(), q2.v1(), q2.v2(), q2.v3(), mathProvider, res);
	}
	
	/**
	 * Multiplies the first given quaternion {@code (q1w; q1x, q1y, q1z)} with the second given quaternion {@code (q2[0]; q2[1], q2[2], q2[3])}, normalizes the result and saves the result in the given extraction parameter object.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (q1w; q1x, q1y, q1z) * (q2[0]; q2[1], q2[2], q2[3])}
	 * 
	 * @param <T> The type of the extraction parameter object.
	 * 
	 * @param q1w The value of the w component of the first quaternion.
	 * @param q1x The value of the x component of the first quaternion.
	 * @param q1y The value of the y component of the first quaternion.
	 * @param q1z The value of the z component of the first quaternion.
	 * @param q2 The second quaternion as an array with at least four entries.
	 * @param res The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup4fC> T mul(float q1w, float q1x, float q1y, float q1z, @MinLength(4) float[] q2, @ExtractionParam T res)
	{
		return mul(q1w, q1x, q1y, q1z, q2[0], q2[1], q2[2], q2[3], res);
	}
	
	/**
	 * Multiplies the first given quaternion {@code (q1w; q1x, q1y, q1z)} with the second given quaternion {@code (q2[0]; q2[1], q2[2], q2[3])}, normalizes the result and saves the result in the given extraction parameter object.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (q1w; q1x, q1y, q1z) * (q2[0]; q2[1], q2[2], q2[3])}
	 * 
	 * @param <T> The type of the extraction parameter object.
	 * 
	 * @param q1w The value of the w component of the first quaternion.
	 * @param q1x The value of the x component of the first quaternion.
	 * @param q1y The value of the y component of the first quaternion.
	 * @param q1z The value of the z component of the first quaternion.
	 * @param q2 The second quaternion as an array with at least four entries.
	 * @param mathProvider
	 * The provider of fundamental math functions that should be used for calculation.
	 * @param res The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup4fC> T mul(float q1w, float q1x, float q1y, float q1z, @MinLength(4) float[] q2, MathProvider mathProvider, @ExtractionParam T res)
	{
		return mul(q1w, q1x, q1y, q1z, q2[0], q2[1], q2[2], q2[3], mathProvider, res);
	}
	
	/**
	 * Multiplies the first given quaternion {@code (q1w; q1x, q1y, q1z)} with the second given quaternion {@code (q2w; q2x, q2y, q2z)}, normalizes the result and saves the result in the given extraction parameter object.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (q1w; q1x, q1y, q1z) * (q2w; q2x, q2y, q2z)}
	 * 
	 * @param <T> The type of the extraction parameter object.
	 * 
	 * @param q1w The value of the w component of the first quaternion.
	 * @param q1x The value of the x component of the first quaternion.
	 * @param q1y The value of the y component of the first quaternion.
	 * @param q1z The value of the z component of the first quaternion.
	 * @param q2w The value of the w component of the second quaternion.
	 * @param q2x The value of the x component of the second quaternion.
	 * @param q2y The value of the y component of the second quaternion.
	 * @param q2z The value of the z component of the second quaternion.
	 * @param res The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup4fC> T mul(float q1w, float q1x, float q1y, float q1z, float q2w, float q2x, float q2y, float q2z, @ExtractionParam T res)
	{
		return mul(q1w, q1x, q1y, q1z, q2w, q2x, q2y, q2z, BarghosMath.PROVIDER, res);
	}
	
	/**
	 * Multiplies the first given quaternion {@code (q1w; q1x, q1y, q1z)} with the second given quaternion {@code (q2w; q2x, q2y, q2z)}, normalizes the result and saves the result in the given extraction parameter object.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (q1w; q1x, q1y, q1z) * (q2w; q2x, q2y, q2z)}
	 * 
	 * @param <T> The type of the extraction parameter object.
	 * 
	 * @param q1w The value of the w component of the first quaternion.
	 * @param q1x The value of the x component of the first quaternion.
	 * @param q1y The value of the y component of the first quaternion.
	 * @param q1z The value of the z component of the first quaternion.
	 * @param q2w The value of the w component of the second quaternion.
	 * @param q2x The value of the x component of the second quaternion.
	 * @param q2y The value of the y component of the second quaternion.
	 * @param q2z The value of the z component of the second quaternion.
	 * @param mathProvider
	 * The provider of fundamental math functions that should be used for calculation.
	 * @param res The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup4fC> T mul(float q1w, float q1x, float q1y, float q1z, float q2w, float q2x, float q2y, float q2z, MathProvider mathProvider, @ExtractionParam T res)
	{
		/*
		 * Mutliplication happens for (w1; v1) * (w2; v2) by:
		 * 
		 * (w1 * w2 + (-v1) . v2; w1 * v2 + w2 * v1 + v1 x v2)
		 */
		float rw = q1w * q2w - q1x * q2x - q1y * q2y - q1z * q2z; // w * w' - v * v'
		
		float rx = q1w * q2x + q2w * q1x + q1y * q2z - q1z * q2y;  // s * v'.x + s' * v.x + (V x V').x
		float ry = q1w * q2y + q2w * q1y + q1z * q2x - q1x * q2z; // s * v'.y + s' * v.y + (V x V').y
		float rz = q1w * q2z + q2w * q1z + q1x * q2y - q1y * q2x;  // s * v'.z + s' * v.z + (V x V').z

		normalize(rw, rx, ry, rz, res);
		
		return res;
	}
	
	/**
	 * Multiplies the first given quaternion {@code (q1)} with the second given quaternion {@code (q2)}, normalizes the result, supplies the result to the given implementation of the functional interface and returns the result of that implementation.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code q1 * q2}
	 * 
	 * @param <T> The type of the result object.
	 * 
	 * @param q1 The first quaternion.
	 * @param q2 The second quaternion.
	 * @param res A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T mulFunc(Tup4fR q1, Tup4fR q2, FloatTetraFunction<T> res)
	{
		return mulFunc(q1.v0(), q1.v1(), q1.v2(), q1.v3(), q2.v0(), q2.v1(), q2.v2(), q2.v3(), res);
	}
	
	/**
	 * Multiplies the first given quaternion {@code (q1)} with the second given quaternion {@code (q2)}, normalizes the result, supplies the result to the given implementation of the functional interface and returns the result of that implementation.
	 *
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code q1 * q2}
	 * 
	 * @param <T> The type of the result object.
	 * 
	 * @param q1 The first quaternion.
	 * @param q2 The second quaternion.
	 * @param mathProvider
	 * The provider of fundamental math functions that should be used for calculation.
	 * @param res A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T mulFunc(Tup4fR q1, Tup4fR q2, MathProvider mathProvider, FloatTetraFunction<T> res)
	{
		return mulFunc(q1.v0(), q1.v1(), q1.v2(), q1.v3(), q2.v0(), q2.v1(), q2.v2(), q2.v3(), mathProvider, res);
	}
	
	/**
	 * Multiplies the first given quaternion {@code (q1)} with the second given quaternion {@code (q2[0]; q2[1], q2[2], q2[3])}, normalizes the result, supplies the result to the given implementation of the functional interface and returns the result of that implementation.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code q1 * (q2[0]; q2[1], q2[2], q2[3])}
	 * 
	 * @param <T> The type of the result object.
	 * 
	 * @param q1 The first quaternion.
	 * @param q2 The second quaternion as an array with at least four entries.
	 * @param res A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T mulFunc(Tup4fR q1, @MinLength(4) float[] q2, FloatTetraFunction<T> res)
	{
		return mulFunc(q1.v0(), q1.v1(), q1.v2(), q1.v3(), q2[0], q2[1], q2[2], q2[3], res);
	}
	
	/**
	 * Multiplies the first given quaternion {@code (q1)} with the second given quaternion {@code (q2[0]; q2[1], q2[2], q2[3])}, normalizes the result, supplies the result to the given implementation of the functional interface and returns the result of that implementation.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code q1 * (q2[0]; q2[1], q2[2], q2[3])}
	 * 
	 * @param <T> The type of the result object.
	 * 
	 * @param q1 The first quaternion.
	 * @param q2 The second quaternion as an array with at least four entries.
	 * @param mathProvider
	 * The provider of fundamental math functions that should be used for calculation.
	 * @param res A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T mulFunc(Tup4fR q1, @MinLength(4) float[] q2, MathProvider mathProvider, FloatTetraFunction<T> res)
	{
		return mulFunc(q1.v0(), q1.v1(), q1.v2(), q1.v3(), q2[0], q2[1], q2[2], q2[3], res);
	}
	
	/**
	 * Multiplies the first given quaternion {@code (q1)} with the second given quaternion {@code (q2w; q2x, q2y, q2z)}, normalizes the result, supplies the result to the given implementation of the functional interface and returns the result of that implementation.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code q1 * (q2w; q2x, q2y, q2z)}
	 * 
	 * @param <T> The type of the result object.
	 * 
	 * @param q1 The first quaternion.
	 * @param q2w The value of the w component of the second quaternion.
	 * @param q2x The value of the x component of the second quaternion.
	 * @param q2y The value of the y component of the second quaternion.
	 * @param q2z The value of the z component of the second quaternion.
	 * @param res A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T mulFunc(Tup4fR q1, float q2w, float q2x, float q2y, float q2z, FloatTetraFunction<T> res)
	{
		return mulFunc(q1.v0(), q1.v1(), q1.v2(), q1.v3(), q2w, q2x, q2y, q2z, res);
	}
	
	/**
	 * Multiplies the first given quaternion {@code (q1)} with the second given quaternion {@code (q2w; q2x, q2y, q2z)}, normalizes the result, supplies the result to the given implementation of the functional interface and returns the result of that implementation.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code q1 * (q2w; q2x, q2y, q2z)}
	 * 
	 * @param <T> The type of the result object.
	 * 
	 * @param q1 The first quaternion.
	 * @param q2w The value of the w component of the second quaternion.
	 * @param q2x The value of the x component of the second quaternion.
	 * @param q2y The value of the y component of the second quaternion.
	 * @param q2z The value of the z component of the second quaternion.
	 * @param mathProvider
	 * The provider of fundamental math functions that should be used for calculation.
	 * @param res A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T mulFunc(Tup4fR q1, float q2w, float q2x, float q2y, float q2z, MathProvider mathProvider, FloatTetraFunction<T> res)
	{
		return mulFunc(q1.v0(), q1.v1(), q1.v2(), q1.v3(), q2w, q2x, q2y, q2z, mathProvider, res);
	}
	
	/**
	 * Multiplies the first given quaternion {@code (q1[0]; q1[1], q1[2], q1[3])} with the second given quaternion {@code (q2)}, normalizes the result, supplies the result to the given implementation of the functional interface and returns the result of that implementation.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (q1[0]; q1[1], q1[2], q1[3]) * q2}
	 * 
	 * @param <T> The type of the result object.
	 * 
	 * @param q1 The first quaternion as an array with at least four entries.
	 * @param q2 The second quaternion.
	 * @param res A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T mulFunc(@MinLength(4) float[] q1, Tup4fR q2, FloatTetraFunction<T> res)
	{
		return mulFunc(q1[0], q1[1], q1[2], q1[3], q2.v0(), q2.v1(), q2.v2(), q2.v3(), res);
	}
	
	/**
	 * Multiplies the first given quaternion {@code (q1[0]; q1[1], q1[2], q1[3])} with the second given quaternion {@code (q2)}, normalizes the result, supplies the result to the given implementation of the functional interface and returns the result of that implementation.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (q1[0]; q1[1], q1[2], q1[3]) * q2}
	 * 
	 * @param <T> The type of the result object.
	 * 
	 * @param q1 The first quaternion as an array with at least four entries.
	 * @param q2 The second quaternion.
	 * @param mathProvider
	 * The provider of fundamental math functions that should be used for calculation.
	 * @param res A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T mulFunc(@MinLength(4) float[] q1, Tup4fR q2, MathProvider mathProvider, FloatTetraFunction<T> res)
	{
		return mulFunc(q1[0], q1[1], q1[2], q1[3], q2.v0(), q2.v1(), q2.v2(), q2.v3(), mathProvider, res);
	}
	
	/**
	 * Multiplies the first given quaternion {@code (q1[0]; q1[1], q1[2], q1[3])} with the second given quaternion {@code (q2[0]; q2[1], q2[2], q2[3])}, normalizes the result, supplies the result to the given implementation of the functional interface and returns the result of that implementation.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (q1[0]; q1[1], q1[2], q1[3]) * (q2[0]; q2[1], q2[2], q2[3])}
	 * 
	 * @param <T> The type of the result object.
	 * 
	 * @param q1 The first quaternion as an array with at least four entries.
	 * @param q2 The second quaternion as an array with at least four entries.
	 * @param res A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T mulFunc(@MinLength(4) float[] q1, @MinLength(4) float[] q2, FloatTetraFunction<T> res)
	{
		return mulFunc(q1[0], q1[1], q1[2], q1[3], q2[0], q2[1], q2[2], q2[3], res);
	}
	
	/**
	 * Multiplies the first given quaternion {@code (q1[0]; q1[1], q1[2], q1[3])} with the second given quaternion {@code (q2[0]; q2[1], q2[2], q2[3])}, normalizes the result, supplies the result to the given implementation of the functional interface and returns the result of that implementation.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (q1[0]; q1[1], q1[2], q1[3]) * (q2[0]; q2[1], q2[2], q2[3])}
	 * 
	 * @param <T> The type of the result object.
	 * 
	 * @param q1 The first quaternion as an array with at least four entries.
	 * @param q2 The second quaternion as an array with at least four entries.
	 * @param mathProvider
	 * The provider of fundamental math functions that should be used for calculation.
	 * @param res A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T mulFunc(@MinLength(4) float[] q1, @MinLength(4) float[] q2, MathProvider mathProvider, FloatTetraFunction<T> res)
	{
		return mulFunc(q1[0], q1[1], q1[2], q1[3], q2[0], q2[1], q2[2], q2[3], mathProvider, res);
	}
	
	/**
	 * Multiplies the first given quaternion {@code (q1[0]; q1[1], q1[2], q1[3])} with the second given quaternion {@code (q2w; q2x, q2y, q2z)}, normalizes the result, supplies the result to the given implementation of the functional interface and returns the result of that implementation.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (q1[0]; q1[1], q1[2], q1[3]) * (q2w; q2x, q2y, q2z)}
	 * 
	 * @param <T> The type of the result object.
	 * 
	 * @param q1 The first quaternion as an array with at least four entries.
	 * @param q2w The value of the w component of the second quaternion.
	 * @param q2x The value of the x component of the second quaternion.
	 * @param q2y The value of the y component of the second quaternion.
	 * @param q2z The value of the z component of the second quaternion.
	 * @param res A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T mulFunc(@MinLength(4) float[] q1, float q2w, float q2x, float q2y, float q2z, FloatTetraFunction<T> res)
	{
		return mulFunc(q1[0], q1[1], q1[2], q1[3], q2w, q2x, q2y, q2z, res);
	}
	
	/**
	 * Multiplies the first given quaternion {@code (q1[0]; q1[1], q1[2], q1[3])} with the second given quaternion {@code (q2w; q2x, q2y, q2z)}, normalizes the result, supplies the result to the given implementation of the functional interface and returns the result of that implementation.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (q1[0]; q1[1], q1[2], q1[3]) * (q2w; q2x, q2y, q2z)}
	 * 
	 * @param <T> The type of the result object.
	 * 
	 * @param q1 The first quaternion as an array with at least four entries.
	 * @param q2w The value of the w component of the second quaternion.
	 * @param q2x The value of the x component of the second quaternion.
	 * @param q2y The value of the y component of the second quaternion.
	 * @param q2z The value of the z component of the second quaternion.
	 * @param mathProvider
	 * The provider of fundamental math functions that should be used for calculation.
	 * @param res A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T mulFunc(@MinLength(4) float[] q1, float q2w, float q2x, float q2y, float q2z, MathProvider mathProvider, FloatTetraFunction<T> res)
	{
		return mulFunc(q1[0], q1[1], q1[2], q1[3], q2w, q2x, q2y, q2z, mathProvider, res);
	}
	
	/**
	 * Multiplies the first given quaternion {@code (q1w; q1x, q1y, q1z)} with the second given quaternion {@code (q2)}, normalizes the result, supplies the result to the given implementation of the functional interface and returns the result of that implementation.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (q1w; q1x, q1y, q1z) * q2}
	 * 
	 * @param <T> The type of the result object.
	 * 
	 * @param q1w The value of the w component of the first quaternion.
	 * @param q1x The value of the x component of the first quaternion.
	 * @param q1y The value of the y component of the first quaternion.
	 * @param q1z The value of the z component of the first quaternion.
	 * @param q2 The second quaternion.
	 * @param res A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T mulFunc(float q1w, float q1x, float q1y, float q1z, Tup4fR q2, FloatTetraFunction<T> res)
	{
		return mulFunc(q1w, q1x, q1y, q1z, q2.v0(), q2.v1(), q2.v2(), q2.v3(), res);
	}
	
	/**
	 * Multiplies the first given quaternion {@code (q1w; q1x, q1y, q1z)} with the second given quaternion {@code (q2)}, normalizes the result, supplies the result to the given implementation of the functional interface and returns the result of that implementation.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (q1w; q1x, q1y, q1z) * q2}
	 * 
	 * @param <T> The type of the result object.
	 * 
	 * @param q1w The value of the w component of the first quaternion.
	 * @param q1x The value of the x component of the first quaternion.
	 * @param q1y The value of the y component of the first quaternion.
	 * @param q1z The value of the z component of the first quaternion.
	 * @param q2 The second quaternion.
	 * @param mathProvider
	 * The provider of fundamental math functions that should be used for calculation.
	 * @param res A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T mulFunc(float q1w, float q1x, float q1y, float q1z, Tup4fR q2, MathProvider mathProvider, FloatTetraFunction<T> res)
	{
		return mulFunc(q1w, q1x, q1y, q1z, q2.v0(), q2.v1(), q2.v2(), q2.v3(), mathProvider, res);
	}
	
	/**
	 * Multiplies the first given quaternion {@code (q1w; q1x, q1y, q1z)} with the second given quaternion {@code (q2[0]; q2[1], q2[2], q2[3])}, normalizes the result, supplies the result to the given implementation of the functional interface and returns the result of that implementation.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (q1w; q1x, q1y, q1z) * (q2[0]; q2[1], q2[2], q2[3])}
	 * 
	 * @param <T> The type of the result object.
	 * 
	 * @param q1w The value of the w component of the first quaternion.
	 * @param q1x The value of the x component of the first quaternion.
	 * @param q1y The value of the y component of the first quaternion.
	 * @param q1z The value of the z component of the first quaternion.
	 * @param q2 The second quaternion as an array with at least four entries.
	 * @param res A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T mulFunc(float q1w, float q1x, float q1y, float q1z, @MinLength(4) float[] q2, FloatTetraFunction<T> res)
	{
		return mulFunc(q1w, q1x, q1y, q1z, q2[0], q2[1], q2[2], q2[3], res);
	}
	
	/**
	 * Multiplies the first given quaternion {@code (q1w; q1x, q1y, q1z)} with the second given quaternion {@code (q2[0]; q2[1], q2[2], q2[3])}, normalizes the result, supplies the result to the given implementation of the functional interface and returns the result of that implementation.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (q1w; q1x, q1y, q1z) * (q2[0]; q2[1], q2[2], q2[3])}
	 * 
	 * @param <T> The type of the result object.
	 * 
	 * @param q1w The value of the w component of the first quaternion.
	 * @param q1x The value of the x component of the first quaternion.
	 * @param q1y The value of the y component of the first quaternion.
	 * @param q1z The value of the z component of the first quaternion.
	 * @param q2 The second quaternion as an array with at least four entries.
	 * @param mathProvider
	 * The provider of fundamental math functions that should be used for calculation.
	 * @param res A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T mulFunc(float q1w, float q1x, float q1y, float q1z, @MinLength(4) float[] q2, MathProvider mathProvider, FloatTetraFunction<T> res)
	{
		return mulFunc(q1w, q1x, q1y, q1z, q2[0], q2[1], q2[2], q2[3], mathProvider, res);
	}
	
	/**
	 * Multiplies the first given quaternion {@code (q1w; q1x, q1y, q1z)} with the second given quaternion {@code (q2w; q2x, q2y, q2z)}, normalizes the result, supplies the result to the given implementation of the functional interface and returns the result of that implementation.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (q1w; q1x, q1y, q1z) * (q2w; q2x, q2y, q2z)}
	 * 
	 * @param <T> The type of the result object.
	 * 
	 * @param q1w The value of the w component of the first quaternion.
	 * @param q1x The value of the x component of the first quaternion.
	 * @param q1y The value of the y component of the first quaternion.
	 * @param q1z The value of the z component of the first quaternion.
	 * @param q2w The value of the w component of the second quaternion.
	 * @param q2x The value of the x component of the second quaternion.
	 * @param q2y The value of the y component of the second quaternion.
	 * @param q2z The value of the z component of the second quaternion.
	 * @param res A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T mulFunc(float q1w, float q1x, float q1y, float q1z, float q2w, float q2x, float q2y, float q2z, FloatTetraFunction<T> res)
	{
		return mulFunc(q1w, q1x, q1y, q1z, q2w, q2x, q2y, q2z, BarghosMath.PROVIDER, res);
	}
	
	/**
	 * Multiplies the first given quaternion {@code (q1w; q1x, q1y, q1z)} with the second given quaternion {@code (q2w; q2x, q2y, q2z)}, normalizes the result, supplies the result to the given implementation of the functional interface and returns the result of that implementation.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (q1w; q1x, q1y, q1z) * (q2w; q2x, q2y, q2z)}
	 * 
	 * @param <T> The type of the result object.
	 * 
	 * @param q1w The value of the w component of the first quaternion.
	 * @param q1x The value of the x component of the first quaternion.
	 * @param q1y The value of the y component of the first quaternion.
	 * @param q1z The value of the z component of the first quaternion.
	 * @param q2w The value of the w component of the second quaternion.
	 * @param q2x The value of the x component of the second quaternion.
	 * @param q2y The value of the y component of the second quaternion.
	 * @param q2z The value of the z component of the second quaternion.
	 * @param mathProvider
	 * The provider of fundamental math functions that should be used for calculation.
	 * @param res A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T mulFunc(float q1w, float q1x, float q1y, float q1z, float q2w, float q2x, float q2y, float q2z, MathProvider mathProvider, FloatTetraFunction<T> res)
	{
		/*
		 * Mutliplication happens for (w1; v1) * (w2; v2) by:
		 * 
		 * (w1 * w2 + (-v1) . v2; w1 * v2 + w2 * v1 + v1 x v2)
		 */
		float rw = q1w * q2w - q1x * q2x - q1y * q2y - q1z * q2z; // w * w' - v * v'
		
		float rx = q1w * q2x + q2w * q1x + q1y * q2z - q1z * q2y;  // s * v'.x + s' * v.x + (V x V').x
		float ry = q1w * q2y + q2w * q1y + q1z * q2x - q1x * q2z; // s * v'.y + s' * v.y + (V x V').y
		float rz = q1w * q2z + q2w * q1z + q1x * q2y - q1y * q2x;  // s * v'.z + s' * v.z + (V x V').z

		return normalizeFunc(rw, rx, ry, rz, mathProvider, res);
	}
	
	/**
	 * Multiplies the first given quaternion {@code (q1)} with the second given quaternion {@code (q2)} and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code q1 * q2}
	 * 
	 * @param q1 The first quaternion.
	 * @param q2 The second quaternion.
	 * @param res The extraction parameter for the result as an array with at least four entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] mulUnnormalized(Tup4fR q1, Tup4fR q2, @ExtractionParam @MinLength(4) float[] res)
	{
		return mulUnnormalized(q1.v0(), q1.v1(), q1.v2(), q1.v3(), q2.v0(), q2.v1(), q2.v2(), q2.v3(), res);
	}
	
	/**
	 * Multiplies the first given quaternion {@code (q1)} with the second given quaternion {@code (q2[0]; q2[1], q2[2], q2[3])} and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code q1 * (q2[0]; q2[1], q2[2], q2[3])}
	 * 
	 * @param q1 The first quaternion.
	 * @param q2 The second quaternion as an array with at least four entries.
	 * @param res The extraction parameter for the result as an array with at least four entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] mulUnnormalized(Tup4fR q1, @MinLength(4) float[] q2, @ExtractionParam @MinLength(4) float[] res)
	{
		return mulUnnormalized(q1.v0(), q1.v1(), q1.v2(), q1.v3(), q2[0], q2[1], q2[2], q2[3], res);
	}
	
	/**
	 * Multiplies the first given quaternion {@code (q1)} with the second given quaternion {@code (q2w; q2x, q2y, q2z)} and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code q1 * (q2w; q2x, q2y, q2z)}
	 * 
	 * @param q1 The first quaternion.
	 * @param q2w The value of the w component of the second quaternion.
	 * @param q2x The value of the x component of the second quaternion.
	 * @param q2y The value of the y component of the second quaternion.
	 * @param q2z The value of the z component of the second quaternion.
	 * @param res The extraction parameter for the result as an array with at least four entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] mulUnnormalized(Tup4fR q1, float q2w, float q2x, float q2y, float q2z, @ExtractionParam @MinLength(4) float[] res)
	{
		return mulUnnormalized(q1.v0(), q1.v1(), q1.v2(), q1.v3(), q2w, q2x, q2y, q2z, res);
	}
	
	/**
	 * Multiplies the first given quaternion {@code (q1[0]; q1[1], q1[2], q1[3])} with the second given quaternion {@code (q2)} and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (q1[0]; q1[1], q1[2], q1[3]) * q2}
	 * 
	 * @param q1 The first quaternion as an array with at least four entries.
	 * @param q2 The second quaternion.
	 * @param res The extraction parameter for the result as an array with at least four entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] mulUnnormalized(@MinLength(4) float[] q1, Tup4fR q2, @ExtractionParam @MinLength(4) float[] res)
	{
		return mulUnnormalized(q1[0], q1[1], q1[2], q1[3], q2.v0(), q2.v1(), q2.v2(), q2.v3(), res);
	}
	
	/**
	 * Multiplies the first given quaternion {@code (q1[0]; q1[1], q1[2], q1[3])} with the second given quaternion {@code (q2[0]; q2[1], q2[2], q2[3])} and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (q1[0]; q1[1], q1[2], q1[3]) * (q2[0]; q2[1], q2[2], q2[3])}
	 * 
	 * @param q1 The first quaternion as an array with at least four entries.
	 * @param q2 The second quaternion as an array with at least four entries.
	 * @param res The extraction parameter for the result as an array with at least four entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] mulUnnormalized(@MinLength(4) float[] q1, @MinLength(4) float[] q2, @ExtractionParam @MinLength(4) float[] res)
	{
		return mulUnnormalized(q1[0], q1[1], q1[2], q1[3], q2[0], q2[1], q2[2], q2[3], res);
	}
	
	/**
	 * Multiplies the first given quaternion {@code (q1[0]; q1[1], q1[2], q1[3])} with the second given quaternion {@code (q2w; q2x, q2y, q2z)} and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (q1[0]; q1[1], q1[2], q1[3]) * (q2w; q2x, q2y, q2z)}
	 * 
	 * @param q1 The first quaternion as an array with at least four entries.
	 * @param q2w The value of the w component of the second quaternion.
	 * @param q2x The value of the x component of the second quaternion.
	 * @param q2y The value of the y component of the second quaternion.
	 * @param q2z The value of the z component of the second quaternion.
	 * @param res The extraction parameter for the result as an array with at least four entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] mulUnnormalized(@MinLength(4) float[] q1, float q2w, float q2x, float q2y, float q2z, @ExtractionParam @MinLength(4) float[] res)
	{
		return mulUnnormalized(q1[0], q1[1], q1[2], q1[3], q2w, q2x, q2y, q2z, res);
	}
	
	/**
	 * Multiplies the first given quaternion {@code (q1w; q1x, q1y, q1z)} with the second given quaternion {@code (q2)} and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (q1w; q1x, q1y, q1z) * q2}
	 * 
	 * @param q1w The value of the w component of the first quaternion.
	 * @param q1x The value of the x component of the first quaternion.
	 * @param q1y The value of the y component of the first quaternion.
	 * @param q1z The value of the z component of the first quaternion.
	 * @param q2 The second quaternion.
	 * @param res The extraction parameter for the result as an array with at least four entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] mulUnnormalized(float q1w, float q1x, float q1y, float q1z, Tup4fR q2, @ExtractionParam @MinLength(4) float[] res)
	{
		return mulUnnormalized(q1w, q1x, q1y, q1z, q2.v0(), q2.v1(), q2.v2(), q2.v3(), res);
	}
	
	/**
	 * Multiplies the first given quaternion {@code (q1w; q1x, q1y, q1z)} with the second given quaternion {@code (q2[0]; q2[1], q2[2], q2[3])} and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (q1w; q1x, q1y, q1z) * (q2[0]; q2[1], q2[2], q2[3])}
	 * 
	 * @param q1w The value of the w component of the first quaternion.
	 * @param q1x The value of the x component of the first quaternion.
	 * @param q1y The value of the y component of the first quaternion.
	 * @param q1z The value of the z component of the first quaternion.
	 * @param q2 The second quaternion as an array with at least four entries.
	 * @param res The extraction parameter for the result as an array with at least four entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] mulUnnormalized(float q1w, float q1x, float q1y, float q1z, @MinLength(4) float[] q2, @ExtractionParam @MinLength(4) float[] res)
	{
		return mulUnnormalized(q1w, q1x, q1y, q1z, q2[0], q2[1], q2[2], q2[3], res);
	}
	
	/**
	 * Multiplies the first given quaternion {@code (q1w; q1x, q1y, q1z)} with the second given quaternion {@code (q2w; q2x, q2y, q2z)} and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (q1w; q1x, q1y, q1z) * (q2w; q2x, q2y, q2z)}
	 * 
	 * @param q1w The value of the w component of the first quaternion.
	 * @param q1x The value of the x component of the first quaternion.
	 * @param q1y The value of the y component of the first quaternion.
	 * @param q1z The value of the z component of the first quaternion.
	 * @param q2w The value of the w component of the second quaternion.
	 * @param q2x The value of the x component of the second quaternion.
	 * @param q2y The value of the y component of the second quaternion.
	 * @param q2z The value of the z component of the second quaternion.
	 * @param res The extraction parameter for the result as an array with at least four entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] mulUnnormalized(float q1w, float q1x, float q1y, float q1z, float q2w, float q2x, float q2y, float q2z, @ExtractionParam @MinLength(4) float[] res)
	{
		/*
		 * Mutliplication happens for (w1; v1) * (w2; v2) by:
		 * 
		 * (w1 * w2 + (-v1) . v2; w1 * v2 + w2 * v1 + v1 x v2)
		 */
		float rw = q1w * q2w - q1x * q2x - q1y * q2y - q1z * q2z; // w * w' - v * v'
		
		float rx = q1w * q2x + q2w * q1x + q1y * q2z - q1z * q2y;  // s * v'.x + s' * v.x + (V x V').x
		float ry = q1w * q2y + q2w * q1y + q1z * q2x - q1x * q2z; // s * v'.y + s' * v.y + (V x V').y
		float rz = q1w * q2z + q2w * q1z + q1x * q2y - q1y * q2x;  // s * v'.z + s' * v.z + (V x V').z

		res[0] = rw;
		res[1] = rx;
		res[2] = ry;
		res[3] = rz;
		
		return res;
	}
	
	/**
	 * Multiplies the first given quaternion {@code (q1)} with the second given quaternion {@code (q2)} and saves the result in the given extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code q1 * q2}
	 * 
	 * @param <T> The type of the extraction parameter object.
	 * 
	 * @param q1 The first quaternion.
	 * @param q2 The second quaternion.
	 * @param res The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup4fC> T mulUnnormalized(Tup4fR q1, Tup4fR q2, @ExtractionParam T res)
	{
		return mulUnnormalized(q1.v0(), q1.v1(), q1.v2(), q1.v3(), q2.v0(), q2.v1(), q2.v2(), q2.v3(), res);
	}

	/**
	 * Multiplies the first given quaternion {@code (q1)} with the second given quaternion {@code (q2[0]; q2[1], q2[2], q2[3])} and saves the result in the given extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code q1 * (q2[0]; q2[1], q2[2], q2[3])}
	 * 
	 * @param <T> The type of the extraction parameter object.
	 * 
	 * @param q1 The first quaternion.
	 * @param q2 The second quaternion as an array with at least four entries.
	 * @param res The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup4fC> T mulUnnormalized(Tup4fR q1, @MinLength(4) float[] q2, @ExtractionParam T res)
	{
		return mulUnnormalized(q1.v0(), q1.v1(), q1.v2(), q1.v3(), q2[0], q2[1], q2[2], q2[3], res);
	}

	/**
	 * Multiplies the first given quaternion {@code (q1)} with the second given quaternion {@code (q2w; q2x, q2y, q2z)} and saves the result in the given extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code q1 * (q2w; q2x, q2y, q2z)}
	 * 
	 * @param <T> The type of the extraction parameter object.
	 * 
	 * @param q1 The first quaternion.
	 * @param q2w The value of the w component of the second quaternion.
	 * @param q2x The value of the x component of the second quaternion.
	 * @param q2y The value of the y component of the second quaternion.
	 * @param q2z The value of the z component of the second quaternion.
	 * @param res The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup4fC> T mulUnnormalized(Tup4fR q1, float q2w, float q2x, float q2y, float q2z, @ExtractionParam T res)
	{
		return mulUnnormalized(q1.v0(), q1.v1(), q1.v2(), q1.v3(), q2w, q2x, q2y, q2z, res);
	}

	/**
	 * Multiplies the first given quaternion {@code (q1[0]; q1[1], q1[2], q1[3])} with the second given quaternion {@code (q2)} and saves the result in the given extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (q1[0]; q1[1], q1[2], q1[3]) * q2}
	 * 
	 * @param <T> The type of the extraction parameter object.
	 * 
	 * @param q1 The first quaternion as an array with at least four entries.
	 * @param q2 The second quaternion.
	 * @param res The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup4fC> T mulUnnormalized(@MinLength(4) float[] q1, Tup4fR q2, @ExtractionParam T res)
	{
		return mulUnnormalized(q1[0], q1[1], q1[2], q1[3], q2.v0(), q2.v1(), q2.v2(), q2.v3(), res);
	}

	/**
	 * Multiplies the first given quaternion {@code (q1[0]; q1[1], q1[2], q1[3])} with the second given quaternion {@code (q2[0]; q2[1], q2[2], q2[3])} and saves the result in the given extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (q1[0]; q1[1], q1[2], q1[3]) * (q2[0]; q2[1], q2[2], q2[3])}
	 * 
	 * @param <T> The type of the extraction parameter object.
	 * 
	 * @param q1 The first quaternion as an array with at least four entries.
	 * @param q2 The second quaternion as an array with at least four entries.
	 * @param res The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup4fC> T mulUnnormalized(@MinLength(4) float[] q1, @MinLength(4) float[] q2, @ExtractionParam T res)
	{
		return mulUnnormalized(q1[0], q1[1], q1[2], q1[3], q2[0], q2[1], q2[2], q2[3], res);
	}
	
	/**
	 * Multiplies the first given quaternion {@code (q1[0]; q1[1], q1[2], q1[3])} with the second given quaternion {@code (q2w; q2x, q2y, q2z)} and saves the result in the given extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (q1[0]; q1[1], q1[2], q1[3]) * (q2w; q2x, q2y, q2z)}
	 * 
	 * @param <T> The type of the extraction parameter object.
	 * 
	 * @param q1 The first quaternion as an array with at least four entries.
	 * @param q2w The value of the w component of the second quaternion.
	 * @param q2x The value of the x component of the second quaternion.
	 * @param q2y The value of the y component of the second quaternion.
	 * @param q2z The value of the z component of the second quaternion.
	 * @param res The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup4fC> T mulUnnormalized(@MinLength(4) float[] q1, float q2w, float q2x, float q2y, float q2z, @ExtractionParam T res)
	{
		return mulUnnormalized(q1[0], q1[1], q1[2], q1[3], q2w, q2x, q2y, q2z, res);
	}
	
	/**
	 * Multiplies the first given quaternion {@code (q1w; q1x, q1y, q1z)} with the second given quaternion {@code (q2)} and saves the result in the given extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (q1w; q1x, q1y, q1z) * q2}
	 * 
	 * @param <T> The type of the extraction parameter object.
	 * 
	 * @param q1w The value of the w component of the first quaternion.
	 * @param q1x The value of the x component of the first quaternion.
	 * @param q1y The value of the y component of the first quaternion.
	 * @param q1z The value of the z component of the first quaternion.
	 * @param q2 The second quaternion.
	 * @param res The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup4fC> T mulUnnormalized(float q1w, float q1x, float q1y, float q1z, Tup4fR q2, @ExtractionParam T res)
	{
		return mulUnnormalized(q1w, q1x, q1y, q1z, q2.v0(), q2.v1(), q2.v2(), q2.v3(), res);
	}
	
	/**
	 * Multiplies the first given quaternion {@code (q1w; q1x, q1y, q1z)} with the second given quaternion {@code (q2[0]; q2[1], q2[2], q2[3])} and saves the result in the given extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (q1w; q1x, q1y, q1z) * (q2[0]; q2[1], q2[2], q2[3])}
	 * 
	 * @param <T> The type of the extraction parameter object.
	 * 
	 * @param q1w The value of the w component of the first quaternion.
	 * @param q1x The value of the x component of the first quaternion.
	 * @param q1y The value of the y component of the first quaternion.
	 * @param q1z The value of the z component of the first quaternion.
	 * @param q2 The second quaternion as an array with at least four entries.
	 * @param res The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup4fC> T mulUnnormalized(float q1w, float q1x, float q1y, float q1z, @MinLength(4) float[] q2, @ExtractionParam T res)
	{
		return mulUnnormalized(q1w, q1x, q1y, q1z, q2[0], q2[1], q2[2], q2[3], res);
	}
	
	/**
	 * Multiplies the first given quaternion {@code (q1w; q1x, q1y, q1z)} with the second given quaternion {@code (q2w; q2x, q2y, q2z)} and saves the result in the given extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (q1w; q1x, q1y, q1z) * (q2w; q2x, q2y, q2z)}
	 * 
	 * @param <T> The type of the extraction parameter object.
	 * 
	 * @param q1w The value of the w component of the first quaternion.
	 * @param q1x The value of the x component of the first quaternion.
	 * @param q1y The value of the y component of the first quaternion.
	 * @param q1z The value of the z component of the first quaternion.
	 * @param q2w The value of the w component of the second quaternion.
	 * @param q2x The value of the x component of the second quaternion.
	 * @param q2y The value of the y component of the second quaternion.
	 * @param q2z The value of the z component of the second quaternion.
	 * @param res The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup4fC> T mulUnnormalized(float q1w, float q1x, float q1y, float q1z, float q2w, float q2x, float q2y, float q2z, @ExtractionParam T res)
	{
		/*
		 * Mutliplication happens for (w1; v1) * (w2; v2) by:
		 * 
		 * (w1 * w2 + (-v1) . v2; w1 * v2 + w2 * v1 + v1 x v2)
		 */
		float rw = q1w * q2w - q1x * q2x - q1y * q2y - q1z * q2z; // w * w' - v * v'
		
		float rx = q1w * q2x + q2w * q1x + q1y * q2z - q1z * q2y;  // s * v'.x + s' * v.x + (V x V').x
		float ry = q1w * q2y + q2w * q1y + q1z * q2x - q1x * q2z; // s * v'.y + s' * v.y + (V x V').y
		float rz = q1w * q2z + q2w * q1z + q1x * q2y - q1y * q2x;  // s * v'.z + s' * v.z + (V x V').z

		res.set(rw, rx, ry, rz);
		
		return res;
	}
	
	/**
	 * Multiplies the first given quaternion {@code (q1)} with the second given quaternion {@code (q2)}, supplies the result to the given implementation of the functional interface and returns the result of that implementation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code q1 * q2}
	 * 
	 * @param <T> The type of the result object.
	 * 
	 * @param q1 The first quaternion.
	 * @param q2 The second quaternion.
	 * @param res A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T mulUnnormalizedFunc(Tup4fR q1, Tup4fR q2, FloatTetraFunction<T> res)
	{
		return mulUnnormalizedFunc(q1.v0(), q1.v1(), q1.v2(), q1.v3(), q2.v0(), q2.v1(), q2.v2(), q2.v3(), res);
	}

	/**
	 * Multiplies the first given quaternion {@code (q1)} with the second given quaternion {@code (q2[0]; q2[1], q2[2], q2[3])}, supplies the result to the given implementation of the functional interface and returns the result of that implementation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code q1 * (q2[0]; q2[1], q2[2], q2[3])}
	 * 
	 * @param <T> The type of the result object.
	 * 
	 * @param q1 The first quaternion.
	 * @param q2 The second quaternion as an array with at least four entries.
	 * @param res A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T mulUnnormalizedFunc(Tup4fR q1, @MinLength(4) float[] q2, FloatTetraFunction<T> res)
	{
		return mulUnnormalizedFunc(q1.v0(), q1.v1(), q1.v2(), q1.v3(), q2[0], q2[1], q2[2], q2[3], res);
	}

	/**
	 * Multiplies the first given quaternion {@code (q1)} with the second given quaternion {@code (q2w; q2x, q2y, q2z)}, supplies the result to the given implementation of the functional interface and returns the result of that implementation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code q1 * (q2w; q2x, q2y, q2z)}
	 * 
	 * @param <T> The type of the result object.
	 * 
	 * @param q1 The first quaternion.
	 * @param q2w The value of the w component of the second quaternion.
	 * @param q2x The value of the x component of the second quaternion.
	 * @param q2y The value of the y component of the second quaternion.
	 * @param q2z The value of the z component of the second quaternion.
	 * @param res A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T mulUnnormalizedFunc(Tup4fR q1, float q2w, float q2x, float q2y, float q2z, FloatTetraFunction<T> res)
	{
		return mulUnnormalizedFunc(q1.v0(), q1.v1(), q1.v2(), q1.v3(), q2w, q2x, q2y, q2z, res);
	}

	/**
	 * Multiplies the first given quaternion {@code (q1[0]; q1[1], q1[2], q1[3])} with the second given quaternion {@code (q2)}, supplies the result to the given implementation of the functional interface and returns the result of that implementation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (q1[0]; q1[1], q1[2], q1[3]) * q2}
	 * 
	 * @param <T> The type of the result object.
	 * 
	 * @param q1 The first quaternion as an array with at least four entries.
	 * @param q2 The second quaternion.
	 * @param res A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T mulUnnormalizedFunc(@MinLength(4) float[] q1, Tup4fR q2, FloatTetraFunction<T> res)
	{
		return mulUnnormalizedFunc(q1[0], q1[1], q1[2], q1[3], q2.v0(), q2.v1(), q2.v2(), q2.v3(), res);
	}

	/**
	 * Multiplies the first given quaternion {@code (q1[0]; q1[1], q1[2], q1[3])} with the second given quaternion {@code (q2[0]; q2[1], q2[2], q2[3])}, supplies the result to the given implementation of the functional interface and returns the result of that implementation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (q1[0]; q1[1], q1[2], q1[3]) * (q2[0]; q2[1], q2[2], q2[3])}
	 * 
	 * @param <T> The type of the result object.
	 * 
	 * @param q1 The first quaternion as an array with at least four entries.
	 * @param q2 The second quaternion as an array with at least four entries.
	 * @param res A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T mulUnnormalizedFunc(@MinLength(4) float[] q1, @MinLength(4) float[] q2, FloatTetraFunction<T> res)
	{
		return mulUnnormalizedFunc(q1[0], q1[1], q1[2], q1[3], q2[0], q2[1], q2[2], q2[3], res);
	}

	/**
	 * Multiplies the first given quaternion {@code (q1[0]; q1[1], q1[2], q1[3])} with the second given quaternion {@code (q2w; q2x, q2y, q2z)}, supplies the result to the given implementation of the functional interface and returns the result of that implementation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (q1[0]; q1[1], q1[2], q1[3]) * (q2w; q2x, q2y, q2z)}
	 * 
	 * @param <T> The type of the result object.
	 * 
	 * @param q1 The first quaternion as an array with at least four entries.
	 * @param q2w The value of the w component of the second quaternion.
	 * @param q2x The value of the x component of the second quaternion.
	 * @param q2y The value of the y component of the second quaternion.
	 * @param q2z The value of the z component of the second quaternion.
	 * @param res A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T mulUnnormalizedFunc(@MinLength(4) float[] q1, float q2w, float q2x, float q2y, float q2z, FloatTetraFunction<T> res)
	{
		return mulUnnormalizedFunc(q1[0], q1[1], q1[2], q1[3], q2w, q2x, q2y, q2z, res);
	}
	
	/**
	 * Multiplies the first given quaternion {@code (q1w; q1x, q1y, q1z)} with the second given quaternion {@code (q2)}, supplies the result to the given implementation of the functional interface and returns the result of that implementation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (q1w; q1x, q1y, q1z) * q2}
	 * 
	 * @param <T> The type of the result object.
	 * 
	 * @param q1w The value of the w component of the first quaternion.
	 * @param q1x The value of the x component of the first quaternion.
	 * @param q1y The value of the y component of the first quaternion.
	 * @param q1z The value of the z component of the first quaternion.
	 * @param q2 The second quaternion.
	 * @param res A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T mulUnnormalizedFunc(float q1w, float q1x, float q1y, float q1z, Tup4fR q2, FloatTetraFunction<T> res)
	{
		return mulUnnormalizedFunc(q1w, q1x, q1y, q1z, q2.v0(), q2.v1(), q2.v2(), q2.v3(), res);
	}
	
	/**
	 * Multiplies the first given quaternion {@code (q1w; q1x, q1y, q1z)} with the second given quaternion {@code (q2[0]; q2[1], q2[2], q2[3])}, supplies the result to the given implementation of the functional interface and returns the result of that implementation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (q1w; q1x, q1y, q1z) * (q2[0]; q2[1], q2[2], q2[3])}
	 * 
	 * @param <T> The type of the result object.
	 * 
	 * @param q1w The value of the w component of the first quaternion.
	 * @param q1x The value of the x component of the first quaternion.
	 * @param q1y The value of the y component of the first quaternion.
	 * @param q1z The value of the z component of the first quaternion.
	 * @param q2 The second quaternion as an array with at least four entries.
	 * @param res A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T mulUnnormalizedFunc(float q1w, float q1x, float q1y, float q1z, @MinLength(4) float[] q2, FloatTetraFunction<T> res)
	{
		return mulUnnormalizedFunc(q1w, q1x, q1y, q1z, q2[0], q2[1], q2[2], q2[3], res);
	}
	
	/**
	 * Multiplies the first given quaternion {@code (q1w; q1x, q1y, q1z)} with the second given quaternion {@code (q2w; q2x, q2y, q2z)}, supplies the result to the given implementation of the functional interface and returns the result of that implementation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (q1w; q1x, q1y, q1z) * (q2w; q2x, q2y, q2z)}
	 * 
	 * @param <T> The type of the result object.
	 * 
	 * @param q1w The value of the w component of the first quaternion.
	 * @param q1x The value of the x component of the first quaternion.
	 * @param q1y The value of the y component of the first quaternion.
	 * @param q1z The value of the z component of the first quaternion.
	 * @param q2w The value of the w component of the second quaternion.
	 * @param q2x The value of the x component of the second quaternion.
	 * @param q2y The value of the y component of the second quaternion.
	 * @param q2z The value of the z component of the second quaternion.
	 * @param res A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T mulUnnormalizedFunc(float q1w, float q1x, float q1y, float q1z, float q2w, float q2x, float q2y, float q2z, FloatTetraFunction<T> res)
	{
		/*
		 * Mutliplication happens for (w1; v1) * (w2; v2) by:
		 * 
		 * (w1 * w2 + (-v1) . v2; w1 * v2 + w2 * v1 + v1 x v2)
		 */
		float rw = q1w * q2w - q1x * q2x - q1y * q2y - q1z * q2z; // w * w' - v * v'
		
		float rx = q1w * q2x + q2w * q1x + q1y * q2z - q1z * q2y;  // s * v'.x + s' * v.x + (V x V').x
		float ry = q1w * q2y + q2w * q1y + q1z * q2x - q1x * q2z; // s * v'.y + s' * v.y + (V x V').y
		float rz = q1w * q2z + q2w * q1z + q1x * q2y - q1y * q2x;  // s * v'.z + s' * v.z + (V x V').z

		return res.apply(rw, rx, ry, rz);
	}
}
