package org.barghos.math.api.vector;

import org.barghos.annotation.ExtractionParam;
import org.barghos.annotation.MinLength;
import org.barghos.core.api.math.BarghosMath;
import org.barghos.core.api.math.MathProvider;
import org.barghos.core.api.util.function.FloatFunction4;
import org.barghos.tuple.api.t4.Tup4fC;
import org.barghos.tuple.api.t4.Tup4fR;

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
		return squaredLength(q.getV0(), q.getV1(), q.getV2(), q.getV3());
	}
	
	/**
	 * Returns the squared length (magnitude, norm) of the quaternion
	 * {@code (q[0], q[1], q[2]; q[3])}.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(q[0], q[1], q[2]; q[3])|²}
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
	 * Returns the squared length (magnitude, norm) of the quaternion {@code (x, y, z; w)}.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(x, y, z; w)|²}
	 * 
	 * @param x The value of the x component of the quaternion.
	 * @param y The value of the y component of the quaternion.
	 * @param z The value of the z component of the quaternion.
	 * @param w The value of the w component of the quaternion.
	 * 
	 * @return The squared length of the quaternion.
	 */
	public static float squaredLength(float x, float y, float z, float w)
	{
		return x * x + y * y + z * z + w * w;
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
		return length(q.getV0(), q.getV1(), q.getV2(), q.getV3());
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
		return length(q.getV0(), q.getV1(), q.getV2(), q.getV3(), mathProvider);
	}
	
	/**
	 * Returns the length (magnitude, norm) of the quaternion {@code (q[0], q[1], q[2]; q[3])}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(q[0], q[1], q[2]; q[3])|}
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
	 * Returns the length (magnitude, norm) of the quaternion {@code (q[0], q[1], q[2]; q[3])}.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(q[0], q[1], q[2]; q[3])|}
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
	 * Returns the length (magnitude, norm) of the quaternion {@code (x, y, z; w)}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(x, y, z; w)|}
	 * 
	 * @param x The value of the x component of the quaternion.
	 * @param y The value of the y component of the quaternion.
	 * @param z The value of the z component of the quaternion.
	 * @param w The value of the w component of the quaternion.
	 * 
	 * @return The length of the quaternion.
	 */
	public static float length(float x, float y, float z, float w)
	{
		return length(x, y, z, w, BarghosMath.PROVIDER);
	}
	
	/**
	 * Returns the length (magnitude, norm) of the quaternion {@code (x, y, z; w)}.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(x, y, z; w)|}
	 * 
	 * @param x The value of the x component of the quaternion.
	 * @param y The value of the y component of the quaternion.
	 * @param z The value of the z component of the quaternion.
	 * @param w The value of the w component of the quaternion.
	 * @param mathProvider The provider of fundamental math functions that should be used for
	 * calculation.
	 * 
	 * @return The length of the quaternion.
	 */
	public static float length(float x, float y, float z, float w, MathProvider mathProvider)
	{
		return mathProvider.sqrt(squaredLength(x, y, z, w));
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
	 * {@code (q[0], q[1], q[2]; q[3])}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code 1 / |(q[0], q[1], q[2]; q[3])|}
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
	 * {@code (q[0], q[1], q[2]; q[3])}.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code 1 / |(q[0], q[1], q[2]; q[3])|}
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
	 * {@code (x, y, z; w)}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code 1 / |(x, y, z; w)|}
	 * 
	 * @param x The value of the x component of the quaternion.
	 * @param y The value of the y component of the quaternion.
	 * @param z The value of the z component of the quaternion.
	 * @param w The value of the w component of the quaternion.
	 * 
	 * @return The reciprocal length of the quaternion.
	 */
	public static float inverseLength(float x, float y, float z, float w)
	{
		return inverseLength(x, y, z, w, BarghosMath.PROVIDER);
	}

	/**
	 * Returns the inverse (reciprocal) length (magnitude, norm) of the quaternion
	 * {@code (x, y, z; w)}.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code 1 / |(x, y, z; w)|}
	 * 
	 * @param x The value of the x component of the quaternion.
	 * @param y The value of the y component of the quaternion.
	 * @param z The value of the z component of the quaternion.
	 * @param w The value of the w component of the quaternion.
	 * @param mathProvider
	 * The provider of fundamental math functions that should be used for calculation.
	 * 
	 * @return The reciprocal length of the quaternion.
	 */
	public static float inverseLength(float x, float y, float z, float w, MathProvider mathProvider)
	{
		return mathProvider.invSqrt(squaredLength(x, y, z, w));
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
		return dot(q1.getV0(), q1.getV1(), q1.getV2(), q1.getV3(), q2.getV0(), q2.getV1(), q2.getV2(), q2.getV3());
	}
	
	/**
	 * Calculates the dot (scalar) product between the first given quaternion {@code (q1)} and the
	 * second given quaternion {@code (q2[0], q2[1], q2[2]; q2[3])}.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code q1 . (q2[0], q2[1], q2[2]; q2[3])}
	 * 
	 * @param q1 The first quaternion.
	 * @param q2 The second quaternion as an array with at least four entries.
	 * 
	 * @return The dot (scalar) product.
	 */
	public static float dot(Tup4fR q1, @MinLength(4) float[] q2)
	{
		return dot(q1.getV0(), q1.getV1(), q1.getV2(), q1.getV3(), q2[0], q2[1], q2[2], q2[2]);
	}
	
	/**
	 * Calculates the dot (scalar) product between the first given quaternion {@code (q1)} and the
	 * second given quaternion {@code (q2x, q2y, q2z; q2w)}.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code q1 . (q2x, q2y, q2z; q2w)}
	 * 
	 * @param q1 The first quaternion.
	 * @param q2x The value of the x component of the second quaternion.
	 * @param q2y The value of the y component of the second quaternion.
	 * @param q2z The value of the z component of the second quaternion.
	 * @param q2w The value of the w component of the second quaternion.
	 * 
	 * @return The dot (scalar) product.
	 */
	public static float dot(Tup4fR q1, float q2x, float q2y, float q2z, float q2w)
	{
		return dot(q1.getV0(), q1.getV1(), q1.getV2(), q1.getV3(), q2x, q2y, q2z, q2w);
	}
	
	/**
	 * Calculates the dot (scalar) product between the first given quaternion
	 * {@code (q1[0], q1[1], q1[2]; q1[3])} and the second given quaternion {@code (q2)}.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (q1[0], q1[1], q1[2]; q1[3]) . q2}
	 * 
	 * @param q1 The first quaternion as an array with at least four entries.
	 * @param q2 The second quaternion.
	 * 
	 * @return The dot (scalar) product.
	 */
	public static float dot(@MinLength(4) float[] q1, Tup4fR q2)
	{
		return dot(q1[0], q1[1], q1[2], q1[3], q2.getV0(), q2.getV1(), q2.getV2(), q2.getV3());
	}
	
	/**
	 * Calculates the dot (scalar) product between the first given quaternion
	 * {@code (q1[0], q1[1], q1[2]; q1[3])} and the second given quaternion
	 * {@code (q2[0], q2[1], q2[2]; q2[3])}.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (q1[0], q1[1], q1[2]; q1[3]) . (q2[0], q2[1], q2[2], q2[3])}
	 * 
	 * @param q1 The first quaternion as an array with at least four entries.
	 * @param q2 The second quaternion as an array with at least four entries.
	 * 
	 * @return The dot (scalar) product.
	 */
	public static float dot(@MinLength(4) float[] q1, @MinLength(4) float[] q2)
	{
		return dot(q1[0], q1[1], q1[2], q1[3], q2[0], q2[1], q2[2], q2[2]);
	}
	
	/**
	 * Calculates the dot (scalar) product between the first given quaternion
	 * {@code (q1[0], q1[1], q1[2]; q1[3])} and the second given quaternion
	 * {@code (q2x, q2y, q2z; q2w)}.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (q1[0], q1[1], q1[2]; q1[3]) . (q2x, q2y, q2z; q2w)}
	 * 
	 * @param q1 The first quaternion as an array with at least four entries.
	 * @param q2x The value of the x component of the second quaternion.
	 * @param q2y The value of the y component of the second quaternion.
	 * @param q2z The value of the z component of the second quaternion.
	 * @param q2w The value of the w component of the second quaternion.
	 * 
	 * @return The dot (scalar) product.
	 */
	public static float dot(@MinLength(4) float[] q1, float q2x, float q2y, float q2z, float q2w)
	{
		return dot(q1[0], q1[1], q1[2], q1[3], q2x, q2y, q2z, q2w);
	}
	
	/**
	 * Calculates the dot (scalar) product between the first given quaternion
	 * {@code(q1x, q1y, q1z, q1w)} and the second given quaternion {@code (q2)}.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (q1x, q1y, q1z; q1w) . q2}
	 * 
	 * @param q1x The value of the x component of the first quaternion.
	 * @param q1y The value of the y component of the first quaternion.
	 * @param q1z The value of the z component of the first quaternion.
	 * @param q1w The value of the w component of the first quaternion.
	 * @param q2 The second quaternion.
	 * 
	 * @return The dot (scalar) product.
	 */
	public static float dot(float q1x, float q1y, float q1z, float q1w, Tup4fR q2)
	{
		return dot(q1x, q1y, q1z, q1w, q2.getV0(), q2.getV1(), q2.getV2(), q2.getV3());
	}
	
	/**
	 * Calculates the dot (scalar) product between the first given quaternion
	 * {@code (q1x, q1y, q1z; q1w)} and the second given quaternion
	 * {@code (q2[0], q2[1], q2[2]; q2[3])}.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (q1x, q1y, q1z; q1w) . (q2[0], q2[1], q2[2]; q2[3])}
	 * 
	 * @param q1x The value of the x component of the first quaternion.
	 * @param q1y The value of the y component of the first quaternion.
	 * @param q1z The value of the z component of the first quaternion.
	 * @param q1w The value of the w component of the first quaternion.
	 * @param q2 The second quaternion as an array with at least four entries.
	 * 
	 * @return The dot (scalar) product.
	 */
	public static float dot(float q1x, float q1y, float q1z, float q1w, @MinLength(4) float[] q2)
	{
		return dot(q1x, q1y, q1z, q1w, q2[0], q2[1], q2[2], q2[2]);
	}
	
	/**
	 * Calculates the dot (scalar) product between the first given quaternion
	 * {@code (q1x, q1y, q1z; q1w)} and the second given quaternion {@code (q2x, q2y, q2z; q2w)}.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (q1x, q1y, q1z; q1w) . (q2x, q2y, q2z; q2w)}
	 * 
	 * @param q1x The value of the x component of the first quaternion.
	 * @param q1y The value of the y component of the first quaternion.
	 * @param q1z The value of the z component of the first quaternion.
	 * @param q1w The value of the w component of the first quaternion.
	 * @param q2x The value of the x component of the second quaternion.
	 * @param q2y The value of the y component of the second quaternion.
	 * @param q2z The value of the z component of the second quaternion.
	 * @param q2w The value of the w component of the second quaternion.
	 * 
	 * @return The dot (scalar) product.
	 */
	public static float dot(float q1x, float q1y, float q1z, float q1w, float q2x, float q2y, float q2z, float q2w)
	{
		return q1x * q2x + q1y * q2y + q1z * q2z + q1w * q2w;
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
		return conjugate(q.getV0(), q.getV1(), q.getV2(), q.getV3(), res);
	}
	
	/**
	 * Calculates the conjugate of the quaternion {@code (q[0], q[1], q[2]; q[3])} and saves the
	 * result in the given extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (q[0], q[1], q[2]; q[3])* }
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
	 * Calculates the conjugate of the quaternion {@code (x, y, z; w)} and saves the result in the
	 * given extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (x, y, z; w)* }
	 * 
	 * @param x The value of the x component of the quaternion.
	 * @param y The value of the y component of the quaternion.
	 * @param z The value of the z component of the quaternion.
	 * @param w The value of the w component of the quaternion.
	 * @param res The extraction parameter for the result as an array with at least four entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] conjugate(float x, float y, float z, float w, @ExtractionParam @MinLength(4) float[] res)
	{
		res[0] = -x;
		res[1] = -y;
		res[2] = -z;
		res[3] = w;
		
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
		return conjugate(q.getV0(), q.getV1(), q.getV2(), q.getV3(), res);
	}
	
	/**
	 * Calculates the conjugate of the quaternion {@code (q[0], q[1], q[2]; q[3])} and saves the
	 * result in the given extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (q[0], q[1], q[2]; q[3])* }
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
	 * Calculates the conjugate of the quaternion {@code (x, y, z; w)} and saves the result in the
	 * given extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (x, y, z; w)* }
	 * 
	 * @param <T> The type of the extraction parameter object.
	 * 
	 * @param x The value of the x component of the quaternion.
	 * @param y The value of the y component of the quaternion.
	 * @param z The value of the z component of the quaternion.
	 * @param w The value of the w component of the quaternion.
	 * @param res The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup4fC> T  conjugate(float x, float y, float z, float w, @ExtractionParam T res)
	{
		res.set(-x, -y, -z, w);
		
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
	public static <T> T conjugateFunc(Tup4fR q, FloatFunction4<T> res)
	{
		return conjugateFunc(q.getV0(), q.getV1(), q.getV2(), q.getV3(), res);
	}
	
	/**
	 * Calculates the conjugate of the quaternion {@code (q[0], q[1], q[2]; q[3])}, supplies the
	 * result to the given implementation of the functional interface and returns the result of that
	 * implementation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (q[0], q[1], q[2]; q[3])* }
	 * 
	 * @param <T> The type of the result object.
	 * 
	 * @param q The quaternion as an array with at least four entries.
	 * @param res A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T conjugateFunc(@MinLength(4) float[] q, FloatFunction4<T> res)
	{
		return conjugateFunc(q[0], q[1], q[2], q[3], res);
	}
	
	/**
	 * Calculates the conjugate of the quaternion {@code (x, y, z; w)}, supplies the result to the
	 * given implementation of the functional interface and returns the result of that
	 * implementation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (x, y, z; w)* }
	 * 
	 * @param <T> The type of the result object.
	 * 
	 * @param x The value of the x component of the quaternion.
	 * @param y The value of the y component of the quaternion.
	 * @param z The value of the z component of the quaternion.
	 * @param w The value of the w component of the quaternion.
	 * @param res A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T conjugateFunc(float x, float y, float z, float w, FloatFunction4<T> res)
	{
		return res.apply(-x, -y, -z, w);
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
		return inverse(q.getV0(), q.getV1(), q.getV2(), q.getV3(), res);
	}
	
	/**
	 * Calculates the inverse of the quaternion {@code (q[0], q[1], q[2]; q[3])} and saves the
	 * result in the given extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (q[0], q[1], q[2]; q[3])* / |(q[0], q[1], q[2]; q[3])|² }
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
	 * Calculates the inverse of the quaternion {@code (x, y, z; w)} and saves the result in the
	 * given extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (x, y, z; w)* / |(x, y, z; w)|² }
	 * 
	 * @param x The value of the x component of the quaternion.
	 * @param y The value of the y component of the quaternion.
	 * @param z The value of the z component of the quaternion.
	 * @param w The value of the w component of the quaternion.
	 * @param res The extraction parameter for the result as an array with at least four entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] inverse(float x, float y, float z, float w, @ExtractionParam @MinLength(4) float[] res)
	{
		float invLength = 1.0f / squaredLength(x, y, z, w);
		
		res[0] = -x * invLength;
		res[1] = -y * invLength;
		res[2] = -z * invLength;
		res[3] = w * invLength; 
		
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
		return inverse(q.getV0(), q.getV1(), q.getV2(), q.getV3(), res);
	}
	
	/**
	 * Calculates the inverse of the quaternion {@code (q[0], q[1], q[2]; q[3])} and saves the
	 * result in the given extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (q[0], q[1], q[2]; q[3])* / |(q[0], q[1], q[2]; q[3])|² }
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
	 * Calculates the inverse of the quaternion {@code (x, y, z; w)} and saves the result in the
	 * given extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (x, y, z; w)* / |(x, y, z; w)|² }
	 * 
	 * @param <T> The type of the extraction parameter object.
	 * 
	 * @param x The value of the x component of the quaternion.
	 * @param y The value of the y component of the quaternion.
	 * @param z The value of the z component of the quaternion.
	 * @param w The value of the w component of the quaternion.
	 * @param res The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup4fC> T inverse(float x, float y, float z, float w, @ExtractionParam T res)
	{
		float invLength = 1.0f / squaredLength(x, y, z, w);
		
		res.set(-x * invLength, -y * invLength, -z * invLength, w * invLength);
		
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
	public static <T> T inverseFunc(Tup4fR q, FloatFunction4<T> res)
	{
		return inverseFunc(q.getV0(), q.getV1(), q.getV2(), q.getV3(), res);
	}
	
	/**
	 * Calculates the inverse of the quaternion {@code (q[0], q[1], q[2]; q[3])}, supplies the
	 * result to the given implementation of the functional interface and returns the result of that
	 * implementation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (q[0], q[1], q[2]; q[3])* / |(q[0], q[1], q[2]; q[3])|² }
	 * 
	 * @param <T> The type of the result object.
	 * 
	 * @param q The quaternion as an array with at least four entries.
	 * @param res A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T inverseFunc(@MinLength(4) float[] q, FloatFunction4<T> res)
	{
		return inverseFunc(q[0], q[1], q[2], q[3], res);
	}
	
	/**
	 * Calculates the inverse of the quaternion {@code (x, y, z; w)}, supplies the result to the
	 * given implementation of the functional interface and returns the result of that
	 * implementation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (x, y, z; w)* / |(x, y, z; w)|² }
	 * 
	 * @param <T> The type of the result object.
	 * 
	 * @param x The value of the x component of the quaternion.
	 * @param y The value of the y component of the quaternion.
	 * @param z The value of the z component of the quaternion.
	 * @param w The value of the w component of the quaternion.
	 * @param res A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T inverseFunc(float x, float y, float z, float w, FloatFunction4<T> res)
	{
		float invLength = 1.0f / squaredLength(x, y, z, w);
		
		return res.apply(-x * invLength, -y * invLength, -z * invLength, w * invLength);
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
		return normalize(q.getV0(), q.getV1(), q.getV2(), q.getV3(), res);
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
		return normalize(q.getV0(), q.getV1(), q.getV2(), q.getV3(), mathProvider, res);
	}
	
	/**
	 * Normalizes the quaternion {@code (q[0], q[1], q[2]; q[3])} and saves the result in the given
	 * extraction parameter.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (q[0], q[1], q[2]; q[3]) / |(q[0], q[1], q[2]; q[3])|}
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
	 * Normalizes the quaternion {@code (q[0], q[1], q[2]; q[3])} and saves the result in the given
	 * extraction parameter.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (q[0], q[1], q[2]; q[3]) / |(q[0], q[1], q[2]; q[3])|}
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
	 * Normalizes the quaternion {@code (x, y, z; w)} and saves the result in the given extraction
	 * parameter.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (x, y, z; w) / |(x, y, z; w)|}
	 * 
	 * @param x The value of the x component of the quaternion.
	 * @param y The value of the y component of the quaternion.
	 * @param z The value of the z component of the quaternion.
	 * @param w The value of the w component of the quaternion.
	 * @param res The extraction parameter for the result as an array with at least four entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] normalize(float x, float y, float z, float w, @ExtractionParam @MinLength(4) float[] res)
	{
		return normalize(x, y, z, w, BarghosMath.PROVIDER, res);
	}	

	/**
	 * Normalizes the quaternion {@code (x, y, z; w)} and saves the result in the given extraction
	 * parameter.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (x, y, z; w) / |(x, y, z; w)|}
	 * 
	 * @param x The value of the x component of the quaternion.
	 * @param y The value of the y component of the quaternion.
	 * @param z The value of the z component of the quaternion.
	 * @param w The value of the w component of the quaternion.
	 * @param mathProvider
	 * The provider of fundamental math functions that should be used for calculation.
	 * @param res The extraction parameter for the result as an array with at least four entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] normalize(float x, float y, float z, float w, MathProvider mathProvider, @ExtractionParam @MinLength(4) float[] res)
	{
		float invLength = inverseLength(x, y, z, w, mathProvider);
		
		res[0] = x * invLength;
		res[1] = y * invLength;
		res[2] = z * invLength;
		res[3] = w * invLength;
		
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
		return normalize(q.getV0(), q.getV1(), q.getV2(), q.getV3(), res);
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
		return normalize(q.getV0(), q.getV1(), q.getV2(), q.getV3(), mathProvider, res);
	}
	
	/**
	 * Normalizes the quaternion {@code (q[0], q[1], q[2]; q[3])} and saves the result in the given
	 * extraction parameter object.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (q[0], q[1], q[2]; q[3]) / |(q[0], q[1], q[2]; q[3])|}
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
	 * Normalizes the quaternion {@code (q[0], q[1], q[2]; q[3])} and saves the result in the given
	 * extraction parameter object.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (q[0], q[1], q[2]; q[3]) / |(q[0], q[1], q[2]; q[3])|}
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
	 * Normalizes the quaternion {@code (x, y, z; w)} and saves the result in the given extraction
	 * parameter object.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (x, y, z; w) / |(x, y, z; w)|}
	 * 
	 * @param <T> The type of the extraction parameter object.
	 * 
	 * @param x The value of the x component of the quaternion.
	 * @param y The value of the y component of the quaternion.
	 * @param z The value of the z component of the quaternion.
	 * @param w The value of the w component of the quaternion.
	 * @param res The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup4fC> T normalize(float x, float y, float z, float w, @ExtractionParam T res)
	{
		return normalize(x, y, z, w, BarghosMath.PROVIDER, res);
	}	

	/**
	 * Normalizes the quaternion {@code (x, y, z; w)} and saves the result in the given extraction
	 * parameter object.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (x, y, z; w) / |(x, y, z; w)|}
	 * 
	 * @param <T> The type of the extraction parameter object.
	 * 
	 * @param x The value of the x component of the quaternion.
	 * @param y The value of the y component of the quaternion.
	 * @param z The value of the z component of the quaternion.
	 * @param w The value of the w component of the quaternion.
	 * @param mathProvider
	 * The provider of fundamental math functions that should be used for calculation.
	 * @param res The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup4fC> T normalize(float x, float y, float z, float w, MathProvider mathProvider, @ExtractionParam T res)
	{
		float invLength = inverseLength(x, y, z, w, mathProvider);
		
		res.set(x * invLength, y * invLength, z * invLength, w * invLength);
		
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
	public static <T> T normalizeFunc(Tup4fR q, FloatFunction4<T> res)
	{
		return normalizeFunc(q.getV0(), q.getV1(), q.getV2(), q.getV3(), res);
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
	public static <T> T normalizeFunc(Tup4fR q, MathProvider mathProvider, FloatFunction4<T> res)
	{
		return normalizeFunc(q.getV0(), q.getV1(), q.getV2(), q.getV3(), mathProvider, res);
	}
	
	/**
	 * Normalizes the quaternion {@code (q[0], q[1], q[2]; q[3])}, supplies the result to the given
	 * implementation of the functional interface and returns the result of that implementation.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (q[0], q[1], q[2]; q[3]) / |(q[0], q[1], q[2]; q[3])|}
	 * 
	 * @param <T> The type of the result object.
	 * 
	 * @param q The quaternion as an array with at least four entries.
	 * @param res A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T normalizeFunc(@MinLength(4) float[] q, FloatFunction4<T> res)
	{
		return normalizeFunc(q[0], q[1], q[2], q[3], res);
	}	

	/**
	 * Normalizes the quaternion {@code (q[0], q[1], q[2]; q[3])}, supplies the result to the given
	 * implementation of the functional interface and returns the result of that implementation.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (q[0], q[1], q[2]; q[3]) / |(q[0], q[1], q[2]; q[3])|}
	 * 
	 * @param <T> The type of the result object.
	 * 
	 * @param q The quaternion as an array with at least four entries.
	 * @param mathProvider The provider of fundamental math functions that should be used for calculation.
	 * @param res A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T normalizeFunc(@MinLength(4) float[] q, MathProvider mathProvider, FloatFunction4<T> res)
	{
		return normalizeFunc(q[0], q[1], q[2], q[3], mathProvider, res);
	}
	
	/**
	 * Normalizes the quaternion {@code (x, y, z; w)}, supplies the result to the given
	 * implementation of the functional interface and returns the result of that implementation.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (x, y, z; w) / |(x, y, z; w)|}
	 * 
	 * @param <T> The type of the result object.
	 * 
	 * @param x The value of the x component of the quaternion.
	 * @param y The value of the y component of the quaternion.
	 * @param z The value of the z component of the quaternion.
	 * @param w The value of the w component of the quaternion.
	 * @param res A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T normalizeFunc(float x, float y, float z, float w, FloatFunction4<T> res)
	{
		return normalizeFunc(x, y, z, w, BarghosMath.PROVIDER, res);
	}	

	/**
	 * Normalizes the quaternion {@code (x, y, z; w)}, supplies the result to the given
	 * implementation of the functional interface and returns the result of that implementation.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (x, y, z; w) / |(x, y, z; w)|}
	 * 
	 * @param <T> The type of the result object.
	 * 
	 * @param x The value of the x component of the quaternion.
	 * @param y The value of the y component of the quaternion.
	 * @param z The value of the z component of the quaternion.
	 * @param w The value of the w component of the quaternion.
	 * @param mathProvider
	 * The provider of fundamental math functions that should be used for calculation.
	 * @param res A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T normalizeFunc(float x, float y, float z, float w, MathProvider mathProvider, FloatFunction4<T> res)
	{
		float invLength = inverseLength(x, y, z, w, mathProvider);

		return res.apply(x * invLength, y * invLength, z * invLength, w * invLength);
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
		return mul(q1.getV0(), q1.getV1(), q1.getV2(), q1.getV3(), q2.getV0(), q2.getV1(), q2.getV2(), q2.getV3(), res);
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
		return mul(q1.getV0(), q1.getV1(), q1.getV2(), q1.getV3(), q2.getV0(), q2.getV1(), q2.getV2(), q2.getV3(), mathProvider, res);
	}
	
	/**
	 * Multiplies the first given quaternion {@code (q1)} with the second given quaternion {@code (q2[0], q2[1], q2[2]; q2[3])}, normalizes the result and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code q1 * (q2[0], q2[1], q2[2]; q2[3])}
	 * 
	 * @param q1 The first quaternion.
	 * @param q2 The second quaternion as an array with at least four entries.
	 * @param res The extraction parameter for the result as an array with at least four entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] mul(Tup4fR q1, @MinLength(4) float[] q2, @ExtractionParam @MinLength(4) float[] res)
	{
		return mul(q1.getV0(), q1.getV1(), q1.getV2(), q1.getV3(), q2[0], q2[1], q2[2], q2[3], res);
	}
	
	/**
	 * Multiplies the first given quaternion {@code (q1)} with the second given quaternion {@code (q2[0], q2[1], q2[2]; q2[3])}, normalizes the result and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code q1 * (q2[0], q2[1], q2[2]; q2[3])}
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
		return mul(q1.getV0(), q1.getV1(), q1.getV2(), q1.getV3(), q2[0], q2[1], q2[2], q2[3], mathProvider, res);
	}
	
	/**
	 * Multiplies the first given quaternion {@code (q1)} with the second given quaternion {@code (q2x, q2y, q2z; q2w)}, normalizes the result and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code q1 * (q2x, q2y, q2z; q2w)}
	 * 
	 * @param q1 The first quaternion.
	 * @param q2x The value of the x component of the second quaternion.
	 * @param q2y The value of the y component of the second quaternion.
	 * @param q2z The value of the z component of the second quaternion.
	 * @param q2w The value of the w component of the second quaternion.
	 * @param res The extraction parameter for the result as an array with at least four entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] mul(Tup4fR q1, float q2x, float q2y, float q2z, float q2w, @ExtractionParam @MinLength(4) float[] res)
	{
		return mul(q1.getV0(), q1.getV1(), q1.getV2(), q1.getV3(), q2x, q2y, q2z, q2z, res);
	}
	
	/**
	 * Multiplies the first given quaternion {@code (q1)} with the second given quaternion {@code (q2x, q2y, q2z; q2w)}, normalizes the result and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code q1 * (q2x, q2y, q2z; q2w)}
	 * 
	 * @param q1 The first quaternion.
	 * @param q2x The value of the x component of the second quaternion.
	 * @param q2y The value of the y component of the second quaternion.
	 * @param q2z The value of the z component of the second quaternion.
	 * @param q2w The value of the w component of the second quaternion.
	 * @param mathProvider
	 * The provider of fundamental math functions that should be used for calculation.
	 * @param res The extraction parameter for the result as an array with at least four entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] mul(Tup4fR q1, float q2x, float q2y, float q2z, float q2w, MathProvider mathProvider, @ExtractionParam @MinLength(4) float[] res)
	{
		return mul(q1.getV0(), q1.getV1(), q1.getV2(), q1.getV3(), q2x, q2y, q2z, q2z, mathProvider, res);
	}
	
	/**
	 * Multiplies the first given quaternion {@code (q1[0], q1[1], q1[2]; q1[3])} with the second given quaternion {@code (q2)}, normalizes the result and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (q1[0], q1[1], q1[2]; q1[3]) * q2}
	 * 
	 * @param q1 The first quaternion as an array with at least four entries.
	 * @param q2 The second quaternion.
	 * @param res The extraction parameter for the result as an array with at least four entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] mul(@MinLength(4) float[] q1, Tup4fR q2, @ExtractionParam @MinLength(4) float[] res)
	{
		return mul(q1[0], q1[1], q1[2], q1[3], q2.getV0(), q2.getV1(), q2.getV2(), q2.getV3(), res);
	}
	
	/**
	 * Multiplies the first given quaternion {@code (q1[0], q1[1], q1[2]; q1[3])} with the second given quaternion {@code (q2)}, normalizes the result and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (q1[0], q1[1], q1[2]; q1[3]) * q2}
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
		return mul(q1[0], q1[1], q1[2], q1[3], q2.getV0(), q2.getV1(), q2.getV2(), q2.getV3(), mathProvider, res);
	}
	
	/**
	 * Multiplies the first given quaternion {@code (q1[0], q1[1], q1[2]; q1[3])} with the second given quaternion {@code (q2[0], q2[1], q2[2]; q2[3])}, normalizes the result and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (q1[0], q1[1], q1[2]; q1[3]) * (q2[0], q2[1], q2[2]; q2[3])}
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
	 * Multiplies the first given quaternion {@code (q1[0], q1[1], q1[2]; q1[3])} with the second given quaternion {@code (q2[0], q2[1], q2[2]; q2[3])}, normalizes the result and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (q1[0], q1[1], q1[2]; q1[3]) * (q2[0], q2[1], q2[2]; q2[3])}
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
	 * Multiplies the first given quaternion {@code (q1[0], q1[1], q1[2]; q1[3])} with the second given quaternion {@code (q2x, q2y, q2z; q2w)}, normalizes the result and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (q1[0], q1[1], q1[2]; q1[3]) * (q2x, q2y, q2z; q2w)}
	 * 
	 * @param q1 The first quaternion as an array with at least four entries.
	 * @param q2x The value of the x component of the second quaternion.
	 * @param q2y The value of the y component of the second quaternion.
	 * @param q2z The value of the z component of the second quaternion.
	 * @param q2w The value of the w component of the second quaternion.
	 * @param res The extraction parameter for the result as an array with at least four entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] mul(@MinLength(4) float[] q1, float q2x, float q2y, float q2z, float q2w, @ExtractionParam @MinLength(4) float[] res)
	{
		return mul(q1[0], q1[1], q1[2], q1[3], q2x, q2y, q2z, q2z, res);
	}
	
	/**
	 * Multiplies the first given quaternion {@code (q1[0], q1[1], q1[2]; q1[3])} with the second given quaternion {@code (q2x, q2y, q2z; q2w)}, normalizes the result and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (q1[0], q1[1], q1[2]; q1[3]) * (q2x, q2y, q2z; q2w)}
	 * 
	 * @param q1 The first quaternion as an array with at least four entries.
	 * @param q2x The value of the x component of the second quaternion.
	 * @param q2y The value of the y component of the second quaternion.
	 * @param q2z The value of the z component of the second quaternion.
	 * @param q2w The value of the w component of the second quaternion.
	 * @param mathProvider
	 * The provider of fundamental math functions that should be used for calculation.
	 * @param res The extraction parameter for the result as an array with at least four entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] mul(@MinLength(4) float[] q1, float q2x, float q2y, float q2z, float q2w, MathProvider mathProvider, @ExtractionParam @MinLength(4) float[] res)
	{
		return mul(q1[0], q1[1], q1[2], q1[3], q2x, q2y, q2z, q2z, mathProvider, res);
	}
	
	/**
	 * Multiplies the first given quaternion {@code (q1x, q1y, q1z; q1w)} with the second given quaternion {@code (q2)}, normalizes the result and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (q1x, q1y, q1z; q1w) * q2}
	 * 
	 * @param q1x The value of the x component of the first quaternion.
	 * @param q1y The value of the y component of the first quaternion.
	 * @param q1z The value of the z component of the first quaternion.
	 * @param q1w The value of the w component of the first quaternion.
	 * @param q2 The second quaternion.
	 * @param res The extraction parameter for the result as an array with at least four entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] mul(float q1x, float q1y, float q1z, float q1w, Tup4fR q2, @ExtractionParam @MinLength(4) float[] res)
	{
		return mul(q1x, q1y, q1z, q1w, q2.getV0(), q2.getV1(), q2.getV2(), q2.getV3(), res);
	}
	
	/**
	 * Multiplies the first given quaternion {@code (q1x, q1y, q1z; q1w)} with the second given quaternion {@code (q2)}, normalizes the result and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (q1x, q1y, q1z; q1w) * q2}
	 * 
	 * @param q1x The value of the x component of the first quaternion.
	 * @param q1y The value of the y component of the first quaternion.
	 * @param q1z The value of the z component of the first quaternion.
	 * @param q1w The value of the w component of the first quaternion.
	 * @param q2 The second quaternion.
	 * @param mathProvider
	 * The provider of fundamental math functions that should be used for calculation.
	 * @param res The extraction parameter for the result as an array with at least four entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] mul(float q1x, float q1y, float q1z, float q1w, Tup4fR q2, MathProvider mathProvider, @ExtractionParam @MinLength(4) float[] res)
	{
		return mul(q1x, q1y, q1z, q1w, q2.getV0(), q2.getV1(), q2.getV2(), q2.getV3(), mathProvider, res);
	}
	
	/**
	 * Multiplies the first given quaternion {@code (q1x, q1y, q1z; q1w)} with the second given quaternion {@code (q2[0], q2[1], q2[2]; q2[3])}, normalizes the result and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (q1x, q1y, q1z; q1w) * (q2[0], q2[1], q2[2]; q2[3])}
	 * 
	 * @param q1x The value of the x component of the first quaternion.
	 * @param q1y The value of the y component of the first quaternion.
	 * @param q1z The value of the z component of the first quaternion.
	 * @param q1w The value of the w component of the first quaternion.
	 * @param q2 The second quaternion as an array with at least four entries.
	 * @param res The extraction parameter for the result as an array with at least four entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] mul(float q1x, float q1y, float q1z, float q1w, @MinLength(4) float[] q2, @ExtractionParam @MinLength(4) float[] res)
	{
		return mul(q1x, q1y, q1z, q1w, q2[0], q2[1], q2[2], q2[3], res);
	}
	
	/**
	 * Multiplies the first given quaternion {@code (q1x, q1y, q1z; q1w)} with the second given quaternion {@code (q2[0], q2[1], q2[2]; q2[3])}, normalizes the result and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (q1x, q1y, q1z; q1w) * (q2[0], q2[1], q2[2]; q2[3])}
	 * 
	 * @param q1x The value of the x component of the first quaternion.
	 * @param q1y The value of the y component of the first quaternion.
	 * @param q1z The value of the z component of the first quaternion.
	 * @param q1w The value of the w component of the first quaternion.
	 * @param q2 The second quaternion as an array with at least four entries.
	 * @param mathProvider
	 * The provider of fundamental math functions that should be used for calculation.
	 * @param res The extraction parameter for the result as an array with at least four entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] mul(float q1x, float q1y, float q1z, float q1w, @MinLength(4) float[] q2, MathProvider mathProvider, @ExtractionParam @MinLength(4) float[] res)
	{
		return mul(q1x, q1y, q1z, q1w, q2[0], q2[1], q2[2], q2[3], mathProvider, res);
	}
	
	/**
	 * Multiplies the first given quaternion {@code (q1x, q1y, q1z; q1w)} with the second given quaternion {@code (q2x, q2y, q2z; q2w)}, normalizes the result and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (q1x, q1y, q1z; q1w) * (q2x, q2y, q2z; q2w)}
	 * 
	 * @param q1x The value of the x component of the first quaternion.
	 * @param q1y The value of the y component of the first quaternion.
	 * @param q1z The value of the z component of the first quaternion.
	 * @param q1w The value of the w component of the first quaternion.
	 * @param q2x The value of the x component of the second quaternion.
	 * @param q2y The value of the y component of the second quaternion.
	 * @param q2z The value of the z component of the second quaternion.
	 * @param q2w The value of the w component of the second quaternion.
	 * @param res The extraction parameter for the result as an array with at least four entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] mul(float q1x, float q1y, float q1z, float q1w, float q2x, float q2y, float q2z, float q2w, @ExtractionParam @MinLength(4) float[] res)
	{
		return mul(q1x, q1y, q1z, q1w, q2x, q2y, q2z, q2w, BarghosMath.PROVIDER, res);
	}
	
	/**
	 * Multiplies the first given quaternion {@code (q1x, q1y, q1z; q1w)} with the second given quaternion {@code (q2x, q2y, q2z; q2w)}, normalizes the result and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (q1x, q1y, q1z; q1w) * (q2x, q2y, q2z; q2w)}
	 * 
	 * @param q1x The value of the x component of the first quaternion.
	 * @param q1y The value of the y component of the first quaternion.
	 * @param q1z The value of the z component of the first quaternion.
	 * @param q1w The value of the w component of the first quaternion.
	 * @param q2x The value of the x component of the second quaternion.
	 * @param q2y The value of the y component of the second quaternion.
	 * @param q2z The value of the z component of the second quaternion.
	 * @param q2w The value of the w component of the second quaternion.
	 * @param mathProvider
	 * The provider of fundamental math functions that should be used for calculation.
	 * @param res The extraction parameter for the result as an array with at least four entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] mul(float q1x, float q1y, float q1z, float q1w, float q2x, float q2y, float q2z, float q2w, MathProvider mathProvider, @ExtractionParam @MinLength(4) float[] res)
	{
		/*
		 * Mutliplication happens for (w1; v1) * (w2; v2) by:
		 * 
		 * (w1 * w2 + (-v1) . v2; w1 * v2 + w2 * v1 + v1 x v2)
		 */
		float rx = q1w * q2x + q2w * q1x + q1y * q2z - q1z * q2y;  // s * v'.x + s' * v.x + (V x V').x
		float ry = q1w * q2y + q2w * q1y + q1z * q2x - q1x * q2z; // s * v'.y + s' * v.y + (V x V').y
		float rz = q1w * q2z + q2w * q1z + q1x * q2y - q1y * q2x;  // s * v'.z + s' * v.z + (V x V').z

		float rw = q1w * q2w - q1x * q2x - q1y * q2y - q1z * q2z; // w * w' - v * v'

		normalize(rx, ry, rz, rw, mathProvider, res);

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
		return mul(q1.getV0(), q1.getV1(), q1.getV2(), q1.getV3(), q2.getV0(), q2.getV1(), q2.getV2(), q2.getV3(), res);
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
		return mul(q1.getV0(), q1.getV1(), q1.getV2(), q1.getV3(), q2.getV0(), q2.getV1(), q2.getV2(), q2.getV3(), mathProvider, res);
	}
	
	/**
	 * Multiplies the first given quaternion {@code (q1)} with the second given quaternion {@code (q2[0], q2[1], q2[2]; q2[3])}, normalizes the result and saves the result in the given extraction parameter object.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code q1 * (q2[0], q2[1], q2[2]; q2[3])}
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
		return mul(q1.getV0(), q1.getV1(), q1.getV2(), q1.getV3(), q2[0], q2[1], q2[2], q2[3], res);
	}
	
	/**
	 * Multiplies the first given quaternion {@code (q1)} with the second given quaternion {@code (q2[0], q2[1], q2[2]; q2[3])}, normalizes the result and saves the result in the given extraction parameter object.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code q1 * (q2[0], q2[1], q2[2]; q2[3])}
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
		return mul(q1.getV0(), q1.getV1(), q1.getV2(), q1.getV3(), q2[0], q2[1], q2[2], q2[3], mathProvider, res);
	}
	
	/**
	 * Multiplies the first given quaternion {@code (q1)} with the second given quaternion {@code (q2x, q2y, q2z; q2w)}, normalizes the result and saves the result in the given extraction parameter object.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code q1 * (q2x, q2y, q2z; q2w)}
	 * 
	 * @param <T> The type of the extraction parameter object.
	 * 
	 * @param q1 The first quaternion.
	 * @param q2x The value of the x component of the second quaternion.
	 * @param q2y The value of the y component of the second quaternion.
	 * @param q2z The value of the z component of the second quaternion.
	 * @param q2w The value of the w component of the second quaternion.
	 * @param res The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup4fC> T mul(Tup4fR q1, float q2x, float q2y, float q2z, float q2w, @ExtractionParam T res)
	{
		return mul(q1.getV0(), q1.getV1(), q1.getV2(), q1.getV3(), q2x, q2y, q2z, q2z, res);
	}
	
	/**
	 * Multiplies the first given quaternion {@code (q1)} with the second given quaternion {@code (q2x, q2y, q2z; q2w)}, normalizes the result and saves the result in the given extraction parameter object.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code q1 * (q2x, q2y, q2z; q2w)}
	 * 
	 * @param <T> The type of the extraction parameter object.
	 * 
	 * @param q1 The first quaternion.
	 * @param q2x The value of the x component of the second quaternion.
	 * @param q2y The value of the y component of the second quaternion.
	 * @param q2z The value of the z component of the second quaternion.
	 * @param q2w The value of the w component of the second quaternion.
	 * @param mathProvider
	 * The provider of fundamental math functions that should be used for calculation.
	 * @param res The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup4fC> T mul(Tup4fR q1, float q2x, float q2y, float q2z, float q2w, MathProvider mathProvider, @ExtractionParam T res)
	{
		return mul(q1.getV0(), q1.getV1(), q1.getV2(), q1.getV3(), q2x, q2y, q2z, q2z, mathProvider, res);
	}
	
	/**
	 * Multiplies the first given quaternion {@code (q1[0], q1[1], q1[2]; q1[3])} with the second given quaternion {@code (q2)}, normalizes the result and saves the result in the given extraction parameter object.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (q1[0], q1[1], q1[2]; q1[3]) * q2}
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
		return mul(q1[0], q1[1], q1[2], q1[3], q2.getV0(), q2.getV1(), q2.getV2(), q2.getV3(), res);
	}
	
	/**
	 * Multiplies the first given quaternion {@code (q1[0], q1[1], q1[2]; q1[3])} with the second given quaternion {@code (q2)}, normalizes the result and saves the result in the given extraction parameter object.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (q1[0], q1[1], q1[2]; q1[3]) * q2}
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
		return mul(q1[0], q1[1], q1[2], q1[3], q2.getV0(), q2.getV1(), q2.getV2(), q2.getV3(), mathProvider, res);
	}
	
	/**
	 * Multiplies the first given quaternion {@code (q1[0], q1[1], q1[2]; q1[3])} with the second given quaternion {@code (q2[0], q2[1], q2[2]; q2[3])}, normalizes the result and saves the result in the given extraction parameter object.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (q1[0], q1[1], q1[2]; q1[3]) * (q2[0], q2[1], q2[2]; q2[3])}
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
	 * Multiplies the first given quaternion {@code (q1[0], q1[1], q1[2]; q1[3])} with the second given quaternion {@code (q2[0], q2[1], q2[2]; q2[3])}, normalizes the result and saves the result in the given extraction parameter object.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (q1[0], q1[1], q1[2]; q1[3]) * (q2[0], q2[1], q2[2]; q2[3])}
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
	 * Multiplies the first given quaternion {@code (q1[0], q1[1], q1[2]; q1[3])} with the second given quaternion {@code (q2x, q2y, q2z; q2w)}, normalizes the result and saves the result in the given extraction parameter object.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (q1[0], q1[1], q1[2]; q1[3]) * (q2x, q2y, q2z; q2w)}
	 * 
	 * @param <T> The type of the extraction parameter object.
	 * 
	 * @param q1 The first quaternion as an array with at least four entries.
	 * @param q2x The value of the x component of the second quaternion.
	 * @param q2y The value of the y component of the second quaternion.
	 * @param q2z The value of the z component of the second quaternion.
	 * @param q2w The value of the w component of the second quaternion.
	 * @param res The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup4fC> T mul(@MinLength(4) float[] q1, float q2x, float q2y, float q2z, float q2w, @ExtractionParam T res)
	{
		return mul(q1[0], q1[1], q1[2], q1[3], q2x, q2y, q2z, q2z, res);
	}
	
	/**
	 * Multiplies the first given quaternion {@code (q1[0], q1[1], q1[2]; q1[3])} with the second given quaternion {@code (q2x, q2y, q2z; q2w)}, normalizes the result and saves the result in the given extraction parameter object.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (q1[0], q1[1], q1[2]; q1[3]) * (q2x, q2y, q2z; q2w)}
	 * 
	 * @param <T> The type of the extraction parameter object.
	 * 
	 * @param q1 The first quaternion as an array with at least four entries.
	 * @param q2x The value of the x component of the second quaternion.
	 * @param q2y The value of the y component of the second quaternion.
	 * @param q2z The value of the z component of the second quaternion.
	 * @param q2w The value of the w component of the second quaternion.
	 * @param mathProvider
	 * The provider of fundamental math functions that should be used for calculation.
	 * @param res The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup4fC> T mul(@MinLength(4) float[] q1, float q2x, float q2y, float q2z, float q2w, MathProvider mathProvider, @ExtractionParam T res)
	{
		return mul(q1[0], q1[1], q1[2], q1[3], q2x, q2y, q2z, q2z, mathProvider, res);
	}
	
	/**
	 * Multiplies the first given quaternion {@code (q1x, q1y, q1z; q1w)} with the second given quaternion {@code (q2)}, normalizes the result and saves the result in the given extraction parameter object.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (q1x, q1y, q1z, q1w) * q2}
	 * 
	 * @param <T> The type of the extraction parameter object.
	 * 
	 * @param q1x The value of the x component of the first quaternion.
	 * @param q1y The value of the y component of the first quaternion.
	 * @param q1z The value of the z component of the first quaternion.
	 * @param q1w The value of the w component of the first quaternion.
	 * @param q2 The second quaternion.
	 * @param res The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup4fC> T mul(float q1x, float q1y, float q1z, float q1w, Tup4fR q2, @ExtractionParam T res)
	{
		return mul(q1x, q1y, q1z, q1w, q2.getV0(), q2.getV1(), q2.getV2(), q2.getV3(), res);
	}
	
	/**
	 * Multiplies the first given quaternion {@code (q1x, q1y, q1z; q1w)} with the second given quaternion {@code (q2)}, normalizes the result and saves the result in the given extraction parameter object.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (q1x, q1y, q1z, q1w) * q2}
	 * 
	 * @param <T> The type of the extraction parameter object.
	 * 
	 * @param q1x The value of the x component of the first quaternion.
	 * @param q1y The value of the y component of the first quaternion.
	 * @param q1z The value of the z component of the first quaternion.
	 * @param q1w The value of the w component of the first quaternion.
	 * @param q2 The second quaternion.
	 * @param mathProvider
	 * The provider of fundamental math functions that should be used for calculation.
	 * @param res The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup4fC> T mul(float q1x, float q1y, float q1z, float q1w, Tup4fR q2, MathProvider mathProvider, @ExtractionParam T res)
	{
		return mul(q1x, q1y, q1z, q1w, q2.getV0(), q2.getV1(), q2.getV2(), q2.getV3(), mathProvider, res);
	}
	
	/**
	 * Multiplies the first given quaternion {@code (q1x, q1y, q1z; q1w)} with the second given quaternion {@code (q2[0], q2[1], q2[2]; q2[3])}, normalizes the result and saves the result in the given extraction parameter object.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (q1x, q1y, q1z; q1w) * (q2[0], q2[1], q2[2]; q2[3])}
	 * 
	 * @param <T> The type of the extraction parameter object.
	 * 
	 * @param q1x The value of the x component of the first quaternion.
	 * @param q1y The value of the y component of the first quaternion.
	 * @param q1z The value of the z component of the first quaternion.
	 * @param q1w The value of the w component of the first quaternion.
	 * @param q2 The second quaternion as an array with at least four entries.
	 * @param res The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup4fC> T mul(float q1x, float q1y, float q1z, float q1w, @MinLength(4) float[] q2, @ExtractionParam T res)
	{
		return mul(q1x, q1y, q1z, q1w, q2[0], q2[1], q2[2], q2[3], res);
	}
	
	/**
	 * Multiplies the first given quaternion {@code (q1x, q1y, q1z; q1w)} with the second given quaternion {@code (q2[0], q2[1], q2[2]; q2[3])}, normalizes the result and saves the result in the given extraction parameter object.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (q1x, q1y, q1z; q1w) * (q2[0], q2[1], q2[2]; q2[3])}
	 * 
	 * @param <T> The type of the extraction parameter object.
	 * 
	 * @param q1x The value of the x component of the first quaternion.
	 * @param q1y The value of the y component of the first quaternion.
	 * @param q1z The value of the z component of the first quaternion.
	 * @param q1w The value of the w component of the first quaternion.
	 * @param q2 The second quaternion as an array with at least four entries.
	 * @param mathProvider
	 * The provider of fundamental math functions that should be used for calculation.
	 * @param res The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup4fC> T mul(float q1x, float q1y, float q1z, float q1w, @MinLength(4) float[] q2, MathProvider mathProvider, @ExtractionParam T res)
	{
		return mul(q1x, q1y, q1z, q1w, q2[0], q2[1], q2[2], q2[3], mathProvider, res);
	}
	
	/**
	 * Multiplies the first given quaternion {@code (q1x, q1y, q1z; q1w)} with the second given quaternion {@code (q2x, q2y, q2z; q2w)}, normalizes the result and saves the result in the given extraction parameter object.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (q1x, q1y, q1z; q1w) * (q2x, q2y, q2z; q2w)}
	 * 
	 * @param <T> The type of the extraction parameter object.
	 * 
	 * @param q1x The value of the x component of the first quaternion.
	 * @param q1y The value of the y component of the first quaternion.
	 * @param q1z The value of the z component of the first quaternion.
	 * @param q1w The value of the w component of the first quaternion.
	 * @param q2x The value of the x component of the second quaternion.
	 * @param q2y The value of the y component of the second quaternion.
	 * @param q2z The value of the z component of the second quaternion.
	 * @param q2w The value of the w component of the second quaternion.
	 * @param res The extraction parameter object for the result.
	 * 
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup4fC> T mul(float q1x, float q1y, float q1z, float q1w, float q2x, float q2y, float q2z, float q2w, @ExtractionParam T res)
	{
		return mul(q1x, q1y, q1z, q1w, q2x, q2y, q2z, q2w, BarghosMath.PROVIDER, res);
	}
	
	/**
	 * Multiplies the first given quaternion {@code (q1x, q1y, q1z; q1w)} with the second given quaternion {@code (q2x, q2y, q2z; q2w)}, normalizes the result and saves the result in the given extraction parameter object.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (q1x, q1y, q1z; q1w) * (q2x, q2y, q2z; q2w)}
	 * 
	 * @param <T> The type of the extraction parameter object.
	 * 
	 * @param q1x The value of the x component of the first quaternion.
	 * @param q1y The value of the y component of the first quaternion.
	 * @param q1z The value of the z component of the first quaternion.
	 * @param q1w The value of the w component of the first quaternion.
	 * @param q2x The value of the x component of the second quaternion.
	 * @param q2y The value of the y component of the second quaternion.
	 * @param q2z The value of the z component of the second quaternion.
	 * @param q2w The value of the w component of the second quaternion.
	 * @param mathProvider
	 * The provider of fundamental math functions that should be used for calculation.
	 * @param res The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup4fC> T mul(float q1x, float q1y, float q1z, float q1w, float q2x, float q2y, float q2z, float q2w, MathProvider mathProvider, @ExtractionParam T res)
	{
		/*
		 * Mutliplication happens for (w1; v1) * (w2; v2) by:
		 * 
		 * (w1 * w2 + (-v1) . v2; w1 * v2 + w2 * v1 + v1 x v2)
		 */
		float rx = q1w * q2x + q2w * q1x + q1y * q2z - q1z * q2y;  // s * v'.x + s' * v.x + (V x V').x
		float ry = q1w * q2y + q2w * q1y + q1z * q2x - q1x * q2z; // s * v'.y + s' * v.y + (V x V').y
		float rz = q1w * q2z + q2w * q1z + q1x * q2y - q1y * q2x;  // s * v'.z + s' * v.z + (V x V').z

		float rw = q1w * q2w - q1x * q2x - q1y * q2y - q1z * q2z; // w * w' - v * v'

		normalize(rx, ry, rz, rw, res);
		
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
	public static <T> T mulFunc(Tup4fR q1, Tup4fR q2, FloatFunction4<T> res)
	{
		return mulFunc(q1.getV0(), q1.getV1(), q1.getV2(), q1.getV3(), q2.getV0(), q2.getV1(), q2.getV2(), q2.getV3(), res);
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
	public static <T> T mulFunc(Tup4fR q1, Tup4fR q2, MathProvider mathProvider, FloatFunction4<T> res)
	{
		return mulFunc(q1.getV0(), q1.getV1(), q1.getV2(), q1.getV3(), q2.getV0(), q2.getV1(), q2.getV2(), q2.getV3(), mathProvider, res);
	}
	
	/**
	 * Multiplies the first given quaternion {@code (q1)} with the second given quaternion {@code (q2[0], q2[1], q2[2]; q2[3])}, normalizes the result, supplies the result to the given implementation of the functional interface and returns the result of that implementation.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code q1 * (q2[0], q2[1], q2[2]; q2[3])}
	 * 
	 * @param <T> The type of the result object.
	 * 
	 * @param q1 The first quaternion.
	 * @param q2 The second quaternion as an array with at least four entries.
	 * @param res A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T mulFunc(Tup4fR q1, @MinLength(4) float[] q2, FloatFunction4<T> res)
	{
		return mulFunc(q1.getV0(), q1.getV1(), q1.getV2(), q1.getV3(), q2[0], q2[1], q2[2], q2[3], res);
	}
	
	/**
	 * Multiplies the first given quaternion {@code (q1)} with the second given quaternion {@code (q2[0], q2[1], q2[2]; q2[3])}, normalizes the result, supplies the result to the given implementation of the functional interface and returns the result of that implementation.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code q1 * (q2[0], q2[1], q2[2]; q2[3])}
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
	public static <T> T mulFunc(Tup4fR q1, @MinLength(4) float[] q2, MathProvider mathProvider, FloatFunction4<T> res)
	{
		return mulFunc(q1.getV0(), q1.getV1(), q1.getV2(), q1.getV3(), q2[0], q2[1], q2[2], q2[3], res);
	}
	
	/**
	 * Multiplies the first given quaternion {@code (q1)} with the second given quaternion {@code (q2x, q2y, q2z; q2w)}, normalizes the result, supplies the result to the given implementation of the functional interface and returns the result of that implementation.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code q1 * (q2x, q2y, q2z; q2w)}
	 * 
	 * @param <T> The type of the result object.
	 * 
	 * @param q1 The first quaternion.
	 * @param q2x The value of the x component of the second quaternion.
	 * @param q2y The value of the y component of the second quaternion.
	 * @param q2z The value of the z component of the second quaternion.
	 * @param q2w The value of the w component of the second quaternion.
	 * @param res A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T mulFunc(Tup4fR q1, float q2x, float q2y, float q2z, float q2w, FloatFunction4<T> res)
	{
		return mulFunc(q1.getV0(), q1.getV1(), q1.getV2(), q1.getV3(), q2x, q2y, q2z, q2z, res);
	}
	
	/**
	 * Multiplies the first given quaternion {@code (q1)} with the second given quaternion {@code (q2x, q2y, q2z; q2w)}, normalizes the result, supplies the result to the given implementation of the functional interface and returns the result of that implementation.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code q1 * (q2x, q2y, q2z; q2w)}
	 * 
	 * @param <T> The type of the result object.
	 * 
	 * @param q1 The first quaternion.
	 * @param q2x The value of the x component of the second quaternion.
	 * @param q2y The value of the y component of the second quaternion.
	 * @param q2z The value of the z component of the second quaternion.
	 * @param q2w The value of the w component of the second quaternion.
	 * @param mathProvider
	 * The provider of fundamental math functions that should be used for calculation.
	 * @param res A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T mulFunc(Tup4fR q1, float q2x, float q2y, float q2z, float q2w, MathProvider mathProvider, FloatFunction4<T> res)
	{
		return mulFunc(q1.getV0(), q1.getV1(), q1.getV2(), q1.getV3(), q2x, q2y, q2z, q2z, mathProvider, res);
	}
	
	/**
	 * Multiplies the first given quaternion {@code (q1[0], q1[1], q1[2]; q1[3])} with the second given quaternion {@code (q2)}, normalizes the result, supplies the result to the given implementation of the functional interface and returns the result of that implementation.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (q1[0], q1[1], q1[2]; q1[3]) * q2}
	 * 
	 * @param <T> The type of the result object.
	 * 
	 * @param q1 The first quaternion as an array with at least four entries.
	 * @param q2 The second quaternion.
	 * @param res A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T mulFunc(@MinLength(4) float[] q1, Tup4fR q2, FloatFunction4<T> res)
	{
		return mulFunc(q1[0], q1[1], q1[2], q1[3], q2.getV0(), q2.getV1(), q2.getV2(), q2.getV3(), res);
	}
	
	/**
	 * Multiplies the first given quaternion {@code (q1[0], q1[1], q1[2]; q1[3])} with the second given quaternion {@code (q2)}, normalizes the result, supplies the result to the given implementation of the functional interface and returns the result of that implementation.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (q1[0], q1[1], q1[2]; q1[3]) * q2}
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
	public static <T> T mulFunc(@MinLength(4) float[] q1, Tup4fR q2, MathProvider mathProvider, FloatFunction4<T> res)
	{
		return mulFunc(q1[0], q1[1], q1[2], q1[3], q2.getV0(), q2.getV1(), q2.getV2(), q2.getV3(), mathProvider, res);
	}
	
	/**
	 * Multiplies the first given quaternion {@code (q1[0], q1[1], q1[2]; q1[3])} with the second given quaternion {@code (q2[0], q2[1], q2[2]; q2[3])}, normalizes the result, supplies the result to the given implementation of the functional interface and returns the result of that implementation.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (q1[0], q1[1], q1[2]; q1[3]) * (q2[0], q2[1], q2[2]; q2[3])}
	 * 
	 * @param <T> The type of the result object.
	 * 
	 * @param q1 The first quaternion as an array with at least four entries.
	 * @param q2 The second quaternion as an array with at least four entries.
	 * @param res A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T mulFunc(@MinLength(4) float[] q1, @MinLength(4) float[] q2, FloatFunction4<T> res)
	{
		return mulFunc(q1[0], q1[1], q1[2], q1[3], q2[0], q2[1], q2[2], q2[3], res);
	}
	
	/**
	 * Multiplies the first given quaternion {@code (q1[0], q1[1], q1[2]; q1[3])} with the second given quaternion {@code (q2[0], q2[1], q2[2]; q2[3])}, normalizes the result, supplies the result to the given implementation of the functional interface and returns the result of that implementation.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (q1[0], q1[1], q1[2]; q1[3]) * (q2[0], q2[1], q2[2]; q2[3])}
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
	public static <T> T mulFunc(@MinLength(4) float[] q1, @MinLength(4) float[] q2, MathProvider mathProvider, FloatFunction4<T> res)
	{
		return mulFunc(q1[0], q1[1], q1[2], q1[3], q2[0], q2[1], q2[2], q2[3], mathProvider, res);
	}
	
	/**
	 * Multiplies the first given quaternion {@code (q1[0], q1[1], q1[2]; q1[3])} with the second given quaternion {@code (q2x, q2y, q2z; q2w)}, normalizes the result, supplies the result to the given implementation of the functional interface and returns the result of that implementation.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (q1[0], q1[1], q1[2]; q1[3]) * (q2x, q2y, q2z; q2w)}
	 * 
	 * @param <T> The type of the result object.
	 * 
	 * @param q1 The first quaternion as an array with at least four entries.
	 * @param q2x The value of the x component of the second quaternion.
	 * @param q2y The value of the y component of the second quaternion.
	 * @param q2z The value of the z component of the second quaternion.
	 * @param q2w The value of the w component of the second quaternion.
	 * @param res A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T mulFunc(@MinLength(4) float[] q1, float q2x, float q2y, float q2z, float q2w, FloatFunction4<T> res)
	{
		return mulFunc(q1[0], q1[1], q1[2], q1[3], q2x, q2y, q2z, q2z, res);
	}
	
	/**
	 * Multiplies the first given quaternion {@code (q1[0], q1[1], q1[2]; q1[3])} with the second given quaternion {@code (q2x, q2y, q2z; q2w)}, normalizes the result, supplies the result to the given implementation of the functional interface and returns the result of that implementation.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (q1[0], q1[1], q1[2]; q1[3]) * (q2x, q2y, q2z; q2w)}
	 * 
	 * @param <T> The type of the result object.
	 * 
	 * @param q1 The first quaternion as an array with at least four entries.
	 * @param q2x The value of the x component of the second quaternion.
	 * @param q2y The value of the y component of the second quaternion.
	 * @param q2z The value of the z component of the second quaternion.
	 * @param q2w The value of the w component of the second quaternion.
	 * @param mathProvider
	 * The provider of fundamental math functions that should be used for calculation.
	 * @param res A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T mulFunc(@MinLength(4) float[] q1, float q2x, float q2y, float q2z, float q2w, MathProvider mathProvider, FloatFunction4<T> res)
	{
		return mulFunc(q1[0], q1[1], q1[2], q1[3], q2x, q2y, q2z, q2z, mathProvider, res);
	}
	
	/**
	 * Multiplies the first given quaternion {@code (q1x, q1y, q1z; q1w)} with the second given quaternion {@code (q2)}, normalizes the result, supplies the result to the given implementation of the functional interface and returns the result of that implementation.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (q1x, q1y, q1z, q1w) * q2}
	 * 
	 * @param <T> The type of the result object.
	 * 
	 * @param q1x The value of the x component of the first quaternion.
	 * @param q1y The value of the y component of the first quaternion.
	 * @param q1z The value of the z component of the first quaternion.
	 * @param q1w The value of the w component of the first quaternion.
	 * @param q2 The second quaternion.
	 * @param res A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T mulFunc(float q1x, float q1y, float q1z, float q1w, Tup4fR q2, FloatFunction4<T> res)
	{
		return mulFunc(q1x, q1y, q1z, q1w, q2.getV0(), q2.getV1(), q2.getV2(), q2.getV3(), res);
	}
	
	/**
	 * Multiplies the first given quaternion {@code (q1x, q1y, q1z; q1w)} with the second given quaternion {@code (q2)}, normalizes the result, supplies the result to the given implementation of the functional interface and returns the result of that implementation.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (q1x, q1y, q1z, q1w) * q2}
	 * 
	 * @param <T> The type of the result object.
	 * 
	 * @param q1x The value of the x component of the first quaternion.
	 * @param q1y The value of the y component of the first quaternion.
	 * @param q1z The value of the z component of the first quaternion.
	 * @param q1w The value of the w component of the first quaternion.
	 * @param q2 The second quaternion.
	 * @param mathProvider
	 * The provider of fundamental math functions that should be used for calculation.
	 * @param res A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T mulFunc(float q1x, float q1y, float q1z, float q1w, Tup4fR q2, MathProvider mathProvider, FloatFunction4<T> res)
	{
		return mulFunc(q1x, q1y, q1z, q1w, q2.getV0(), q2.getV1(), q2.getV2(), q2.getV3(), mathProvider, res);
	}
	
	/**
	 * Multiplies the first given quaternion {@code (q1x, q1y, q1z; q1w)} with the second given quaternion {@code (q2[0], q2[1], q2[2]; q2[3])}, normalizes the result, supplies the result to the given implementation of the functional interface and returns the result of that implementation.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (q1x, q1y, q1z; q1w) * (q2[0], q2[1], q2[2]; q2[3])}
	 * 
	 * @param <T> The type of the result object.
	 * 
	 * @param q1x The value of the x component of the first quaternion.
	 * @param q1y The value of the y component of the first quaternion.
	 * @param q1z The value of the z component of the first quaternion.
	 * @param q1w The value of the w component of the first quaternion.
	 * @param q2 The second quaternion as an array with at least four entries.
	 * @param res A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T mulFunc(float q1x, float q1y, float q1z, float q1w, @MinLength(4) float[] q2, FloatFunction4<T> res)
	{
		return mulFunc(q1x, q1y, q1z, q1w, q2[0], q2[1], q2[2], q2[3], res);
	}
	
	/**
	 * Multiplies the first given quaternion {@code (q1x, q1y, q1z; q1w)} with the second given quaternion {@code (q2[0], q2[1], q2[2]; q2[3])}, normalizes the result, supplies the result to the given implementation of the functional interface and returns the result of that implementation.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (q1x, q1y, q1z; q1w) * (q2[0], q2[1], q2[2]; q2[3])}
	 * 
	 * @param <T> The type of the result object.
	 * 
	 * @param q1x The value of the x component of the first quaternion.
	 * @param q1y The value of the y component of the first quaternion.
	 * @param q1z The value of the z component of the first quaternion.
	 * @param q1w The value of the w component of the first quaternion.
	 * @param q2 The second quaternion as an array with at least four entries.
	 * @param mathProvider
	 * The provider of fundamental math functions that should be used for calculation.
	 * @param res A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T mulFunc(float q1x, float q1y, float q1z, float q1w, @MinLength(4) float[] q2, MathProvider mathProvider, FloatFunction4<T> res)
	{
		return mulFunc(q1x, q1y, q1z, q1w, q2[0], q2[1], q2[2], q2[3], mathProvider, res);
	}
	
	/**
	 * Multiplies the first given quaternion {@code (q1x, q1y, q1z; q1w)} with the second given quaternion {@code (q2x, q2y, q2z; q2w)}, normalizes the result, supplies the result to the given implementation of the functional interface and returns the result of that implementation.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (q1x, q1y, q1z; q1w) * (q2x, q2y, q2z; q2w)}
	 * 
	 * @param <T> The type of the result object.
	 * 
	 * @param q1x The value of the x component of the first quaternion.
	 * @param q1y The value of the y component of the first quaternion.
	 * @param q1z The value of the z component of the first quaternion.
	 * @param q1w The value of the w component of the first quaternion.
	 * @param q2x The value of the x component of the second quaternion.
	 * @param q2y The value of the y component of the second quaternion.
	 * @param q2z The value of the z component of the second quaternion.
	 * @param q2w The value of the w component of the second quaternion.
	 * @param res A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T mulFunc(float q1x, float q1y, float q1z, float q1w, float q2x, float q2y, float q2z, float q2w, FloatFunction4<T> res)
	{
		return mulFunc(q1x, q1y, q1z, q1w, q2x, q2y, q2z, q2w, BarghosMath.PROVIDER, res);
	}
	
	/**
	 * Multiplies the first given quaternion {@code (q1x, q1y, q1z; q1w)} with the second given quaternion {@code (q2x, q2y, q2z; q2w)}, normalizes the result, supplies the result to the given implementation of the functional interface and returns the result of that implementation.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (q1x, q1y, q1z; q1w) * (q2x, q2y, q2z; q2w)}
	 * 
	 * @param <T> The type of the result object.
	 * 
	 * @param q1x The value of the x component of the first quaternion.
	 * @param q1y The value of the y component of the first quaternion.
	 * @param q1z The value of the z component of the first quaternion.
	 * @param q1w The value of the w component of the first quaternion.
	 * @param q2x The value of the x component of the second quaternion.
	 * @param q2y The value of the y component of the second quaternion.
	 * @param q2z The value of the z component of the second quaternion.
	 * @param q2w The value of the w component of the second quaternion.
	 * @param mathProvider
	 * The provider of fundamental math functions that should be used for calculation.
	 * @param res A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T mulFunc(float q1x, float q1y, float q1z, float q1w, float q2x, float q2y, float q2z, float q2w, MathProvider mathProvider, FloatFunction4<T> res)
	{
		/*
		 * Mutliplication happens for (w1; v1) * (w2; v2) by:
		 * 
		 * (w1 * w2 + (-v1) . v2; w1 * v2 + w2 * v1 + v1 x v2)
		 */
		float rx = q1w * q2x + q2w * q1x + q1y * q2z - q1z * q2y;  // s * v'.x + s' * v.x + (V x V').x
		float ry = q1w * q2y + q2w * q1y + q1z * q2x - q1x * q2z; // s * v'.y + s' * v.y + (V x V').y
		float rz = q1w * q2z + q2w * q1z + q1x * q2y - q1y * q2x;  // s * v'.z + s' * v.z + (V x V').z

		float rw = q1w * q2w - q1x * q2x - q1y * q2y - q1z * q2z; // w * w' - v * v'

		return normalizeFunc(rx, ry, rz, rw, mathProvider, res);
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
		return mulUnnormalized(q1.getV0(), q1.getV1(), q1.getV2(), q1.getV3(), q2.getV0(), q2.getV1(), q2.getV2(), q2.getV3(), res);
	}
	
	/**
	 * Multiplies the first given quaternion {@code (q1)} with the second given quaternion {@code (q2[0], q2[1], q2[2]; q2[3])} and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code q1 * (q2[0], q2[1], q2[2]; q2[3])}
	 * 
	 * @param q1 The first quaternion.
	 * @param q2 The second quaternion as an array with at least four entries.
	 * @param res The extraction parameter for the result as an array with at least four entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] mulUnnormalized(Tup4fR q1, @MinLength(4) float[] q2, @ExtractionParam @MinLength(4) float[] res)
	{
		return mulUnnormalized(q1.getV0(), q1.getV1(), q1.getV2(), q1.getV3(), q2[0], q2[1], q2[2], q2[3], res);
	}
	
	/**
	 * Multiplies the first given quaternion {@code (q1)} with the second given quaternion {@code (q2x, q2y, q2z; q2w)} and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code q1 * (q2x, q2y, q2z; q2w)}
	 * 
	 * @param q1 The first quaternion.
	 * @param q2x The value of the x component of the second quaternion.
	 * @param q2y The value of the y component of the second quaternion.
	 * @param q2z The value of the z component of the second quaternion.
	 * @param q2w The value of the w component of the second quaternion.
	 * @param res The extraction parameter for the result as an array with at least four entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] mulUnnormalized(Tup4fR q1, float q2x, float q2y, float q2z, float q2w, @ExtractionParam @MinLength(4) float[] res)
	{
		return mulUnnormalized(q1.getV0(), q1.getV1(), q1.getV2(), q1.getV3(), q2x, q2y, q2z, q2z, res);
	}
	
	/**
	 * Multiplies the first given quaternion {@code (q1[0], q1[1], q1[2]; q1[3])} with the second given quaternion {@code (q2)} and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (q1[0], q1[1], q1[2]; q1[3]) * q2}
	 * 
	 * @param q1 The first quaternion as an array with at least four entries.
	 * @param q2 The second quaternion.
	 * @param res The extraction parameter for the result as an array with at least four entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] mulUnnormalized(@MinLength(4) float[] q1, Tup4fR q2, @ExtractionParam @MinLength(4) float[] res)
	{
		return mulUnnormalized(q1[0], q1[1], q1[2], q1[3], q2.getV0(), q2.getV1(), q2.getV2(), q2.getV3(), res);
	}
	
	/**
	 * Multiplies the first given quaternion {@code (q1[0], q1[1], q1[2]; q1[3])} with the second given quaternion {@code (q2[0], q2[1], q2[2]; q2[3])} and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (q1[0], q1[1], q1[2]; q1[3]) * (q2[0], q2[1], q2[2]; q2[3])}
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
	 * Multiplies the first given quaternion {@code (q1[0], q1[1], q1[2]; q1[3])} with the second given quaternion {@code (q2x, q2y, q2z; q2w)} and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (q1[0], q1[1], q1[2]; q1[3]) * (q2x, q2y, q2z; q2w)}
	 * 
	 * @param q1 The first quaternion as an array with at least four entries.
	 * @param q2x The value of the x component of the second quaternion.
	 * @param q2y The value of the y component of the second quaternion.
	 * @param q2z The value of the z component of the second quaternion.
	 * @param q2w The value of the w component of the second quaternion.
	 * @param res The extraction parameter for the result as an array with at least four entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] mulUnnormalized(@MinLength(4) float[] q1, float q2x, float q2y, float q2z, float q2w, @ExtractionParam @MinLength(4) float[] res)
	{
		return mulUnnormalized(q1[0], q1[1], q1[2], q1[3], q2x, q2y, q2z, q2z, res);
	}
	
	/**
	 * Multiplies the first given quaternion {@code (q1x, q1y, q1z; q1w)} with the second given quaternion {@code (q2)} and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (q1x, q1y, q1z; q1w) * q2}
	 * 
	 * @param q1x The value of the x component of the first quaternion.
	 * @param q1y The value of the y component of the first quaternion.
	 * @param q1z The value of the z component of the first quaternion.
	 * @param q1w The value of the w component of the first quaternion.
	 * @param q2 The second quaternion.
	 * @param res The extraction parameter for the result as an array with at least four entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] mulUnnormalized(float q1x, float q1y, float q1z, float q1w, Tup4fR q2, @ExtractionParam @MinLength(4) float[] res)
	{
		return mulUnnormalized(q1x, q1y, q1z, q1w, q2.getV0(), q2.getV1(), q2.getV2(), q2.getV3(), res);
	}
	
	/**
	 * Multiplies the first given quaternion {@code (q1x, q1y, q1z; q1w)} with the second given quaternion {@code (q2[0], q2[1], q2[2]; q2[3])} and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (q1x, q1y, q1z; q1w) * (q2[0], q2[1], q2[2]; q2[3])}
	 * 
	 * @param q1x The value of the x component of the first quaternion.
	 * @param q1y The value of the y component of the first quaternion.
	 * @param q1z The value of the z component of the first quaternion.
	 * @param q1w The value of the w component of the first quaternion.
	 * @param q2 The second quaternion as an array with at least four entries.
	 * @param res The extraction parameter for the result as an array with at least four entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] mulUnnormalized(float q1x, float q1y, float q1z, float q1w, @MinLength(4) float[] q2, @ExtractionParam @MinLength(4) float[] res)
	{
		return mulUnnormalized(q1x, q1y, q1z, q1w, q2[0], q2[1], q2[2], q2[3], res);
	}
	
	/**
	 * Multiplies the first given quaternion {@code (q1x, q1y, q1z; q1w)} with the second given quaternion {@code (q2x, q2y, q2z; q2w)} and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (q1x, q1y, q1z; q1w) * (q2x, q2y, q2z; q2w)}
	 * 
	 * @param q1x The value of the x component of the first quaternion.
	 * @param q1y The value of the y component of the first quaternion.
	 * @param q1z The value of the z component of the first quaternion.
	 * @param q1w The value of the w component of the first quaternion.
	 * @param q2x The value of the x component of the second quaternion.
	 * @param q2y The value of the y component of the second quaternion.
	 * @param q2z The value of the z component of the second quaternion.
	 * @param q2w The value of the w component of the second quaternion.
	 * @param res The extraction parameter for the result as an array with at least four entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] mulUnnormalized(float q1x, float q1y, float q1z, float q1w, float q2x, float q2y, float q2z, float q2w, @ExtractionParam @MinLength(4) float[] res)
	{
		/*
		 * Mutliplication happens for (w1; v1) * (w2; v2) by:
		 * 
		 * (w1 * w2 + (-v1) . v2; w1 * v2 + w2 * v1 + v1 x v2)
		 */
		float rx = q1w * q2x + q2w * q1x + q1y * q2z - q1z * q2y;  // s * v'.x + s' * v.x + (V x V').x
		float ry = q1w * q2y + q2w * q1y + q1z * q2x - q1x * q2z; // s * v'.y + s' * v.y + (V x V').y
		float rz = q1w * q2z + q2w * q1z + q1x * q2y - q1y * q2x;  // s * v'.z + s' * v.z + (V x V').z

		float rw = q1w * q2w - q1x * q2x - q1y * q2y - q1z * q2z; // w * w' - v * v'

		res[0] = rx;
		res[1] = ry;
		res[2] = rz;
		res[3] = rw;
		
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
		return mulUnnormalized(q1.getV0(), q1.getV1(), q1.getV2(), q1.getV3(), q2.getV0(), q2.getV1(), q2.getV2(), q2.getV3(), res);
	}

	/**
	 * Multiplies the first given quaternion {@code (q1)} with the second given quaternion {@code (q2[0], q2[1], q2[2]; q2[3])} and saves the result in the given extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code q1 * (q2[0], q2[1], q2[2]; q2[3])}
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
		return mulUnnormalized(q1.getV0(), q1.getV1(), q1.getV2(), q1.getV3(), q2[0], q2[1], q2[2], q2[3], res);
	}

	/**
	 * Multiplies the first given quaternion {@code (q1)} with the second given quaternion {@code (q2x, q2y, q2z; q2w)} and saves the result in the given extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code q1 * (q2x, q2y, q2z; q2w)}
	 * 
	 * @param <T> The type of the extraction parameter object.
	 * 
	 * @param q1 The first quaternion.
	 * @param q2x The value of the x component of the second quaternion.
	 * @param q2y The value of the y component of the second quaternion.
	 * @param q2z The value of the z component of the second quaternion.
	 * @param q2w The value of the w component of the second quaternion.
	 * @param res The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup4fC> T mulUnnormalized(Tup4fR q1, float q2x, float q2y, float q2z, float q2w, @ExtractionParam T res)
	{
		return mulUnnormalized(q1.getV0(), q1.getV1(), q1.getV2(), q1.getV3(), q2x, q2y, q2z, q2z, res);
	}

	/**
	 * Multiplies the first given quaternion {@code (q1[0], q1[1], q1[2]; q1[3])} with the second given quaternion {@code (q2)} and saves the result in the given extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (q1[0], q1[1], q1[2]; q1[3]) * q2}
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
		return mulUnnormalized(q1[0], q1[1], q1[2], q1[3], q2.getV0(), q2.getV1(), q2.getV2(), q2.getV3(), res);
	}

	/**
	 * Multiplies the first given quaternion {@code (q1[0], q1[1], q1[2]; q1[3])} with the second given quaternion {@code (q2[0], q2[1], q2[2]; q2[3])} and saves the result in the given extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (q1[0], q1[1], q1[2]; q1[3]) * (q2[0], q2[1], q2[2]; q2[3])}
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
	 * Multiplies the first given quaternion {@code (q1[0], q1[1], q1[2]; q1[3])} with the second given quaternion {@code (q2x, q2y, q2z; q2w)} and saves the result in the given extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (q1[0], q1[1], q1[2]; q1[3]) * (q2x, q2y, q2z; q2w)}
	 * 
	 * @param <T> The type of the extraction parameter object.
	 * 
	 * @param q1 The first quaternion as an array with at least four entries.
	 * @param q2x The value of the x component of the second quaternion.
	 * @param q2y The value of the y component of the second quaternion.
	 * @param q2z The value of the z component of the second quaternion.
	 * @param q2w The value of the w component of the second quaternion.
	 * @param res The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup4fC> T mulUnnormalized(@MinLength(4) float[] q1, float q2x, float q2y, float q2z, float q2w, @ExtractionParam T res)
	{
		return mulUnnormalized(q1[0], q1[1], q1[2], q1[3], q2x, q2y, q2z, q2z, res);
	}
	
	/**
	 * Multiplies the first given quaternion {@code (q1x, q1y, q1z; q1w)} with the second given quaternion {@code (q2)} and saves the result in the given extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (q1x, q1y, q1z, q1w) * q2}
	 * 
	 * @param <T> The type of the extraction parameter object.
	 * 
	 * @param q1x The value of the x component of the first quaternion.
	 * @param q1y The value of the y component of the first quaternion.
	 * @param q1z The value of the z component of the first quaternion.
	 * @param q1w The value of the w component of the first quaternion.
	 * @param q2 The second quaternion.
	 * @param res The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup4fC> T mulUnnormalized(float q1x, float q1y, float q1z, float q1w, Tup4fR q2, @ExtractionParam T res)
	{
		return mulUnnormalized(q1x, q1y, q1z, q1w, q2.getV0(), q2.getV1(), q2.getV2(), q2.getV3(), res);
	}
	
	/**
	 * Multiplies the first given quaternion {@code (q1x, q1y, q1z; q1w)} with the second given quaternion {@code (q2[0], q2[1], q2[2]; q2[3])} and saves the result in the given extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (q1x, q1y, q1z; q1w) * (q2[0], q2[1], q2[2]; q2[3])}
	 * 
	 * @param <T> The type of the extraction parameter object.
	 * 
	 * @param q1x The value of the x component of the first quaternion.
	 * @param q1y The value of the y component of the first quaternion.
	 * @param q1z The value of the z component of the first quaternion.
	 * @param q1w The value of the w component of the first quaternion.
	 * @param q2 The second quaternion as an array with at least four entries.
	 * @param res The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup4fC> T mulUnnormalized(float q1x, float q1y, float q1z, float q1w, @MinLength(4) float[] q2, @ExtractionParam T res)
	{
		return mulUnnormalized(q1x, q1y, q1z, q1w, q2[0], q2[1], q2[2], q2[3], res);
	}
	
	/**
	 * Multiplies the first given quaternion {@code (q1x, q1y, q1z; q1w)} with the second given quaternion {@code (q2x, q2y, q2z; q2w)} and saves the result in the given extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (q1x, q1y, q1z; q1w) * (q2x, q2y, q2z; q2w)}
	 * 
	 * @param <T> The type of the extraction parameter object.
	 * 
	 * @param q1x The value of the x component of the first quaternion.
	 * @param q1y The value of the y component of the first quaternion.
	 * @param q1z The value of the z component of the first quaternion.
	 * @param q1w The value of the w component of the first quaternion.
	 * @param q2x The value of the x component of the second quaternion.
	 * @param q2y The value of the y component of the second quaternion.
	 * @param q2z The value of the z component of the second quaternion.
	 * @param q2w The value of the w component of the second quaternion.
	 * @param res The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup4fC> T mulUnnormalized(float q1x, float q1y, float q1z, float q1w, float q2x, float q2y, float q2z, float q2w, @ExtractionParam T res)
	{
		/*
		 * Mutliplication happens for (w1; v1) * (w2; v2) by:
		 * 
		 * (w1 * w2 + (-v1) . v2; w1 * v2 + w2 * v1 + v1 x v2)
		 */
		float rx = q1w * q2x + q2w * q1x + q1y * q2z - q1z * q2y;  // s * v'.x + s' * v.x + (V x V').x
		float ry = q1w * q2y + q2w * q1y + q1z * q2x - q1x * q2z; // s * v'.y + s' * v.y + (V x V').y
		float rz = q1w * q2z + q2w * q1z + q1x * q2y - q1y * q2x;  // s * v'.z + s' * v.z + (V x V').z

		float rw = q1w * q2w - q1x * q2x - q1y * q2y - q1z * q2z; // w * w' - v * v'
		
		res.set(rx, ry, rz, rw);
		
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
	public static <T> T mulUnnormalizedFunc(Tup4fR q1, Tup4fR q2, FloatFunction4<T> res)
	{
		return mulUnnormalizedFunc(q1.getV0(), q1.getV1(), q1.getV2(), q1.getV3(), q2.getV0(), q2.getV1(), q2.getV2(), q2.getV3(), res);
	}

	/**
	 * Multiplies the first given quaternion {@code (q1)} with the second given quaternion {@code (q2[0], q2[1], q2[2]; q2[3])}, supplies the result to the given implementation of the functional interface and returns the result of that implementation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code q1 * (q2[0], q2[1], q2[2]; q2[3])}
	 * 
	 * @param <T> The type of the result object.
	 * 
	 * @param q1 The first quaternion.
	 * @param q2 The second quaternion as an array with at least four entries.
	 * @param res A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T mulUnnormalizedFunc(Tup4fR q1, @MinLength(4) float[] q2, FloatFunction4<T> res)
	{
		return mulUnnormalizedFunc(q1.getV0(), q1.getV1(), q1.getV2(), q1.getV3(), q2[0], q2[1], q2[2], q2[3], res);
	}

	/**
	 * Multiplies the first given quaternion {@code (q1)} with the second given quaternion {@code (q2x, q2y, q2z; q2w)}, supplies the result to the given implementation of the functional interface and returns the result of that implementation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code q1 * (q2x, q2y, q2z; q2w)}
	 * 
	 * @param <T> The type of the result object.
	 * 
	 * @param q1 The first quaternion.
	 * @param q2x The value of the x component of the second quaternion.
	 * @param q2y The value of the y component of the second quaternion.
	 * @param q2z The value of the z component of the second quaternion.
	 * @param q2w The value of the w component of the second quaternion.
	 * @param res A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T mulUnnormalizedFunc(Tup4fR q1, float q2x, float q2y, float q2z, float q2w, FloatFunction4<T> res)
	{
		return mulUnnormalizedFunc(q1.getV0(), q1.getV1(), q1.getV2(), q1.getV3(), q2x, q2y, q2z, q2z, res);
	}

	/**
	 * Multiplies the first given quaternion {@code (q1[0], q1[1], q1[2]; q1[3])} with the second given quaternion {@code (q2)}, supplies the result to the given implementation of the functional interface and returns the result of that implementation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (q1[0], q1[1], q1[2]; q1[3]) * q2}
	 * 
	 * @param <T> The type of the result object.
	 * 
	 * @param q1 The first quaternion as an array with at least four entries.
	 * @param q2 The second quaternion.
	 * @param res A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T mulUnnormalizedFunc(@MinLength(4) float[] q1, Tup4fR q2, FloatFunction4<T> res)
	{
		return mulUnnormalizedFunc(q1[0], q1[1], q1[2], q1[3], q2.getV0(), q2.getV1(), q2.getV2(), q2.getV3(), res);
	}

	/**
	 * Multiplies the first given quaternion {@code (q1[0], q1[1], q1[2]; q1[3])} with the second given quaternion {@code (q2[0], q2[1], q2[2]; q2[3])}, supplies the result to the given implementation of the functional interface and returns the result of that implementation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (q1[0], q1[1], q1[2]; q1[3]) * (q2[0], q2[1], q2[2]; q2[3])}
	 * 
	 * @param <T> The type of the result object.
	 * 
	 * @param q1 The first quaternion as an array with at least four entries.
	 * @param q2 The second quaternion as an array with at least four entries.
	 * @param res A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T mulUnnormalizedFunc(@MinLength(4) float[] q1, @MinLength(4) float[] q2, FloatFunction4<T> res)
	{
		return mulUnnormalizedFunc(q1[0], q1[1], q1[2], q1[3], q2[0], q2[1], q2[2], q2[3], res);
	}

	/**
	 * Multiplies the first given quaternion {@code (q1[0], q1[1], q1[2]; q1[3])} with the second given quaternion {@code (q2x, q2y, q2z; q2w)}, supplies the result to the given implementation of the functional interface and returns the result of that implementation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (q1[0], q1[1], q1[2]; q1[3]) * (q2x, q2y, q2z; q2w)}
	 * 
	 * @param <T> The type of the result object.
	 * 
	 * @param q1 The first quaternion as an array with at least four entries.
	 * @param q2x The value of the x component of the second quaternion.
	 * @param q2y The value of the y component of the second quaternion.
	 * @param q2z The value of the z component of the second quaternion.
	 * @param q2w The value of the w component of the second quaternion.
	 * @param res A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T mulUnnormalizedFunc(@MinLength(4) float[] q1, float q2x, float q2y, float q2z, float q2w, FloatFunction4<T> res)
	{
		return mulUnnormalizedFunc(q1[0], q1[1], q1[2], q1[3], q2x, q2y, q2z, q2z, res);
	}
	
	/**
	 * Multiplies the first given quaternion {@code (q1x, q1y, q1z; q1w)} with the second given quaternion {@code (q2)}, supplies the result to the given implementation of the functional interface and returns the result of that implementation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (q1x, q1y, q1z, q1w) * q2}
	 * 
	 * @param <T> The type of the result object.
	 * 
	 * @param q1x The value of the x component of the first quaternion.
	 * @param q1y The value of the y component of the first quaternion.
	 * @param q1z The value of the z component of the first quaternion.
	 * @param q1w The value of the w component of the first quaternion.
	 * @param q2 The second quaternion.
	 * @param res A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T mulUnnormalizedFunc(float q1x, float q1y, float q1z, float q1w, Tup4fR q2, FloatFunction4<T> res)
	{
		return mulUnnormalizedFunc(q1x, q1y, q1z, q1w, q2.getV0(), q2.getV1(), q2.getV2(), q2.getV3(), res);
	}
	
	/**
	 * Multiplies the first given quaternion {@code (q1x, q1y, q1z; q1w)} with the second given quaternion {@code (q2[0], q2[1], q2[2]; q2[3])}, supplies the result to the given implementation of the functional interface and returns the result of that implementation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (q1x, q1y, q1z; q1w) * (q2[0], q2[1], q2[2]; q2[3])}
	 * 
	 * @param <T> The type of the result object.
	 * 
	 * @param q1x The value of the x component of the first quaternion.
	 * @param q1y The value of the y component of the first quaternion.
	 * @param q1z The value of the z component of the first quaternion.
	 * @param q1w The value of the w component of the first quaternion.
	 * @param q2 The second quaternion as an array with at least four entries.
	 * @param res A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T mulUnnormalizedFunc(float q1x, float q1y, float q1z, float q1w, @MinLength(4) float[] q2, FloatFunction4<T> res)
	{
		return mulUnnormalizedFunc(q1x, q1y, q1z, q1w, q2[0], q2[1], q2[2], q2[3], res);
	}
	
	/**
	 * Multiplies the first given quaternion {@code (q1x, q1y, q1z; q1w)} with the second given quaternion {@code (q2x, q2y, q2z; q2w)}, supplies the result to the given implementation of the functional interface and returns the result of that implementation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (q1x, q1y, q1z; q1w) * (q2x, q2y, q2z; q2w)}
	 * 
	 * @param <T> The type of the result object.
	 * 
	 * @param q1x The value of the x component of the first quaternion.
	 * @param q1y The value of the y component of the first quaternion.
	 * @param q1z The value of the z component of the first quaternion.
	 * @param q1w The value of the w component of the first quaternion.
	 * @param q2x The value of the x component of the second quaternion.
	 * @param q2y The value of the y component of the second quaternion.
	 * @param q2z The value of the z component of the second quaternion.
	 * @param q2w The value of the w component of the second quaternion.
	 * @param res A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T mulUnnormalizedFunc(float q1x, float q1y, float q1z, float q1w, float q2x, float q2y, float q2z, float q2w, FloatFunction4<T> res)
	{
		/*
		 * Mutliplication happens for (w1; v1) * (w2; v2) by:
		 * 
		 * (w1 * w2 + (-v1) . v2; w1 * v2 + w2 * v1 + v1 x v2)
		 */
		float rx = q1w * q2x + q2w * q1x + q1y * q2z - q1z * q2y;  // s * v'.x + s' * v.x + (V x V').x
		float ry = q1w * q2y + q2w * q1y + q1z * q2x - q1x * q2z; // s * v'.y + s' * v.y + (V x V').y
		float rz = q1w * q2z + q2w * q1z + q1x * q2y - q1y * q2x;  // s * v'.z + s' * v.z + (V x V').z

		float rw = q1w * q2w - q1x * q2x - q1y * q2y - q1z * q2z; // w * w' - v * v'

		return res.apply(rx, ry, rz, rw);
	}
}
