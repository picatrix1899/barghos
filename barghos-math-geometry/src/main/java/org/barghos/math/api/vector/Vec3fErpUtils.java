package org.barghos.math.api.vector;

import org.barghos.annotation.ExtractionParam;
import org.barghos.annotation.MinLength;
import org.barghos.core.function.FloatTriFunction;
import org.barghos.core.tuple.Tup3fC;
import org.barghos.core.tuple.Tup3fR;

/**
 * This class provides interpolation utilities for working with 3-dimensional float vectors.
 */
public class Vec3fErpUtils
{
	/**
	 * Linearly integrates over the second given vector {@code (v2)} by the integrator
	 * {@code (alpha)}, adds the result to the first given vector {@code (v1)} and saves the final
	 * result in the given extraction parameter. This assumes an integration delta of 1.0 so that
	 * the integration is over {@code (alpha / 1.0)}, therefore if {@code (alpha)} is 1.0 the
	 * unscaled second vector is added. Otherwise it will be scaled before adding.
	 * 
	 * <p>
	 * The main difference between interpolation and integration is that interpolation is by default
	 * designed to map a alpha value between 0.0 and 1.0 to the range between a zero-vector and a
	 * given vector. If the alpha value exceeds the range between 0.0 and 1.0 the result might be
	 * unexpected. Whereas an integration can exceed the range and will scale the given vector by
	 * the factor.
	 * 
	 * @param v1
	 *     The first vector.
	 * @param v2
	 *     The second vector. This vector will be integrated over.
	 * @param alpha
	 *     The integrator with an integration delta of 1.0f {@code (alpha / 1.0f)}.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] integrateLinear(Tup3fR v1, Tup3fR v2, float alpha, @ExtractionParam @MinLength(3) float[] res)
	{
		return integrateLinear(v1.v0(), v1.v1(), v1.v2(), v2.v0(), v2.v1(), v2.v2(), alpha, res);
	}
	
	/**
	 * Linearly integrates over the second given vector {@code (v2[0], v2[1], v2[2])} by the
	 * integrator {@code (alpha)}, adds the result to the first given vector {@code (v1)} and saves
	 * the final result in the given extraction parameter. This assumes an integration delta of 1.0
	 * so that the integration is over {@code (alpha / 1.0)}, therefore if {@code (alpha)} is 1.0
	 * the unscaled second vector is added. Otherwise it will be scaled before adding.
	 * 
	 * <p>
	 * The main difference between interpolation and integration is that interpolation is by default
	 * designed to map a alpha value between 0.0 and 1.0 to the range between a zero-vector and a
	 * given vector. If the alpha value exceeds the range between 0.0 and 1.0 the result might be
	 * unexpected. Whereas an integration can exceed the range and will scale the given vector by
	 * the factor.
	 * 
	 * @param v1
	 *     The first vector.
	 * @param v2
	 *     The second vector as an array with at least three entries. This vector will be integrated
	 *     over.
	 * @param alpha
	 *     The integrator with an integration delta of 1.0f {@code (alpha / 1.0f)}.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] integrateLinear(Tup3fR v1, @MinLength(3) float[] v2, float alpha,
			@ExtractionParam @MinLength(3) float[] res)
	{
		return integrateLinear(v1.v0(), v1.v1(), v1.v2(), v2[0], v2[1], v2[2], alpha, res);
	}
	
	/**
	 * Linearly integrates over the second given vector {@code (v2x, v2y, v2z)} by the integrator
	 * {@code (alpha)}, adds the result to the first given vector {@code (v1)} and saves the final
	 * result in the given extraction parameter. This assumes an integration delta of 1.0 so that
	 * the integration is over {@code (alpha / 1.0)}, therefore if {@code (alpha)} is 1.0 the
	 * unscaled second vector is added. Otherwise it will be scaled before adding.
	 * 
	 * <p>
	 * The main difference between interpolation and integration is that interpolation is by default
	 * designed to map a alpha value between 0.0 and 1.0 to the range between a zero-vector and a
	 * given vector. If the alpha value exceeds the range between 0.0 and 1.0 the result might be
	 * unexpected. Whereas an integration can exceed the range and will scale the given vector by
	 * the factor.
	 * 
	 * @param v1
	 *     The first vector.
	 * @param v2x
	 *     The value of the x component of the second vector. This vector will be integrated over.
	 * @param v2y
	 *     The value of the y component of the second vector. This vector will be integrated over.
	 * @param v2z
	 *     The value of the z component of the second vector. This vector will be integrated over.
	 * @param alpha
	 *     The integrator with an integration delta of 1.0f {@code (alpha / 1.0f)}.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] integrateLinear(Tup3fR v1, float v2x, float v2y, float v2z, float alpha,
			@ExtractionParam @MinLength(3) float[] res)
	{
		return integrateLinear(v1.v0(), v1.v1(), v1.v2(), v2x, v2y, v2z, alpha, res);
	}
	
	/**
	 * Linearly integrates over the second given vector {@code (v2)} by the integrator
	 * {@code (alpha)}, adds the result to the first given vector {@code (v1[0], v1[1], v1[2])} and
	 * saves the final result in the given extraction parameter. This assumes an integration delta
	 * of 1.0 so that the integration is over {@code (alpha / 1.0)}, therefore if {@code (alpha)} is
	 * 1.0 the unscaled second vector is added. Otherwise it will be scaled before adding.
	 * 
	 * <p>
	 * The main difference between interpolation and integration is that interpolation is by default
	 * designed to map a alpha value between 0.0 and 1.0 to the range between a zero-vector and a
	 * given vector. If the alpha value exceeds the range between 0.0 and 1.0 the result might be
	 * unexpected. Whereas an integration can exceed the range and will scale the given vector by
	 * the factor.
	 * 
	 * @param v1
	 *     The first vector as an array with at least three entries.
	 * @param v2
	 *     The second vector. This vector will be integrated over.
	 * @param alpha
	 *     The integrator with an integration delta of 1.0f {@code (alpha / 1.0f)}.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] integrateLinear(@MinLength(3) float[] v1, Tup3fR v2, float alpha,
			@ExtractionParam @MinLength(3) float[] res)
	{
		return integrateLinear(v1[0], v1[1], v1[2], v2.v0(), v2.v1(), v2.v2(), alpha, res);
	}
	
	/**
	 * Linearly integrates over the second given vector {@code (v2[0], v2[1], v2[2])} by the
	 * integrator {@code (alpha)}, adds the result to the first given vector
	 * {@code (v1[0], v1[1], v1[2])} and saves the final result in the given extraction parameter.
	 * This assumes an integration delta of 1.0 so that the integration is over
	 * {@code (alpha / 1.0)}, therefore if {@code (alpha)} is 1.0 the unscaled second vector is
	 * added. Otherwise it will be scaled before adding.
	 * 
	 * <p>
	 * The main difference between interpolation and integration is that interpolation is by default
	 * designed to map a alpha value between 0.0 and 1.0 to the range between a zero-vector and a
	 * given vector. If the alpha value exceeds the range between 0.0 and 1.0 the result might be
	 * unexpected. Whereas an integration can exceed the range and will scale the given vector by
	 * the factor.
	 * 
	 * @param v1
	 *     The first vector as an array with at least three entries.
	 * @param v2
	 *     The second vector as an array with at least three entries. This vector will be integrated
	 *     over.
	 * @param alpha
	 *     The integrator with an integration delta of 1.0f {@code (alpha / 1.0f)}.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] integrateLinear(@MinLength(3) float[] v1, @MinLength(3) float[] v2, float alpha,
			@ExtractionParam @MinLength(3) float[] res)
	{
		return integrateLinear(v1[0], v1[1], v1[2], v2[0], v2[1], v2[2], alpha, res);
	}
	
	/**
	 * Linearly integrates over the second given vector {@code (v2x, v2y, v2z)} by the integrator
	 * {@code (alpha)}, adds the result to the first given vector {@code (v1[0], v1[1], v1[2])} and
	 * saves the final result in the given extraction parameter. This assumes an integration delta
	 * of 1.0 so that the integration is over {@code (alpha / 1.0)}, therefore if {@code (alpha)} is
	 * 1.0 the unscaled second vector is added. Otherwise it will be scaled before adding.
	 * 
	 * <p>
	 * The main difference between interpolation and integration is that interpolation is by default
	 * designed to map a alpha value between 0.0 and 1.0 to the range between a zero-vector and a
	 * given vector. If the alpha value exceeds the range between 0.0 and 1.0 the result might be
	 * unexpected. Whereas an integration can exceed the range and will scale the given vector by
	 * the factor.
	 * 
	 * @param v1
	 *     The first vector as an array with at least three entries.
	 * @param v2x
	 *     The value of the x component of the second vector. This vector will be integrated over.
	 * @param v2y
	 *     The value of the y component of the second vector. This vector will be integrated over.
	 * @param v2z
	 *     The value of the z component of the second vector. This vector will be integrated over.
	 * @param alpha
	 *     The integrator with an integration delta of 1.0f {@code (alpha / 1.0f)}.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] integrateLinear(@MinLength(3) float[] v1, float v2x, float v2y, float v2z, float alpha,
			@ExtractionParam @MinLength(3) float[] res)
	{
		return integrateLinear(v1[0], v1[1], v1[2], v2x, v2y, v2z, alpha, res);
	}
	
	/**
	 * Linearly integrates over the second given vector {@code (v2)} by the integrator
	 * {@code (alpha)}, adds the result to the first given vector {@code (v1x, v1y, v1z)} and saves
	 * the final result in the given extraction parameter. This assumes an integration delta of 1.0
	 * so that the integration is over {@code (alpha / 1.0)}, therefore if {@code (alpha)} is 1.0
	 * the unscaled second vector is added. Otherwise it will be scaled before adding.
	 * 
	 * <p>
	 * The main difference between interpolation and integration is that interpolation is by default
	 * designed to map a alpha value between 0.0 and 1.0 to the range between a zero-vector and a
	 * given vector. If the alpha value exceeds the range between 0.0 and 1.0 the result might be
	 * unexpected. Whereas an integration can exceed the range and will scale the given vector by
	 * the factor.
	 * 
	 * @param v1x
	 *     The value of the x component of the first vector.
	 * @param v1y
	 *     The value of the y component of the first vector.
	 * @param v1z
	 *     The value of the z component of the first vector.
	 * @param v2
	 *     The second vector. This vector will be integrated over.
	 * @param alpha
	 *     The integrator with an integration delta of 1.0f {@code (alpha / 1.0f)}.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] integrateLinear(float v1x, float v1y, float v1z, Tup3fR v2, float alpha,
			@ExtractionParam @MinLength(3) float[] res)
	{
		return integrateLinear(v1x, v1y, v1z, v2.v0(), v2.v1(), v2.v2(), alpha, res);
	}
	
	/**
	 * Linearly integrates over the second given vector {@code (v2[0], v2[1], v2[2])} by the
	 * integrator {@code (alpha)}, adds the result to the first given vector {@code (v1x, v1y, v1z)}
	 * and saves the final result in the given extraction parameter. This assumes an integration
	 * delta of 1.0 so that the integration is over {@code (alpha / 1.0)}, therefore if
	 * {@code (alpha)} is 1.0 the unscaled second vector is added. Otherwise it will be scaled
	 * before adding.
	 * 
	 * <p>
	 * The main difference between interpolation and integration is that interpolation is by default
	 * designed to map a alpha value between 0.0 and 1.0 to the range between a zero-vector and a
	 * given vector. If the alpha value exceeds the range between 0.0 and 1.0 the result might be
	 * unexpected. Whereas an integration can exceed the range and will scale the given vector by
	 * the factor.
	 * 
	 * @param v1x
	 *     The value of the x component of the first vector.
	 * @param v1y
	 *     The value of the y component of the first vector.
	 * @param v1z
	 *     The value of the z component of the first vector.
	 * @param v2
	 *     The second vector as an array with at least three entries. This vector will be integrated
	 *     over.
	 * @param alpha
	 *     The integrator with an integration delta of 1.0f {@code (alpha / 1.0f)}.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] integrateLinear(float v1x, float v1y, float v1z, @MinLength(3) float[] v2, float alpha,
			@ExtractionParam @MinLength(3) float[] res)
	{
		return integrateLinear(v1x, v1y, v1z, v2[0], v2[1], v2[2], alpha, res);
	}
	
	/**
	 * Linearly integrates over the second given vector {@code (v2x, v2y, v2z)} by the integrator
	 * {@code (alpha)}, adds the result to the first given vector {@code (v1x, v1y, v1z)} and saves
	 * the final result in the given extraction parameter. This assumes an integration delta of 1.0
	 * so that the integration is over {@code (alpha / 1.0)}, therefore if {@code (alpha)} is 1.0
	 * the unscaled second vector is added. Otherwise it will be scaled before adding.
	 * 
	 * <p>
	 * The main difference between interpolation and integration is that interpolation is by default
	 * designed to map a alpha value between 0.0 and 1.0 to the range between a zero-vector and a
	 * given vector. If the alpha value exceeds the range between 0.0 and 1.0 the result might be
	 * unexpected. Whereas an integration can exceed the range and will scale the given vector by
	 * the factor.
	 * 
	 * @param v1x
	 *     The value of the x component of the first vector.
	 * @param v1y
	 *     The value of the y component of the first vector.
	 * @param v1z
	 *     The value of the z component of the first vector.
	 * @param v2x
	 *     The value of the x component of the second vector. This vector will be integrated over.
	 * @param v2y
	 *     The value of the y component of the second vector. This vector will be integrated over.
	 * @param v2z
	 *     The value of the z component of the second vector. This vector will be integrated over.
	 * @param alpha
	 *     The integrator with an integration delta of 1.0f {@code (alpha / 1.0f)}.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] integrateLinear(float v1x, float v1y, float v1z, float v2x, float v2y, float v2z, float alpha,
			@ExtractionParam @MinLength(3) float[] res)
	{
		// res = v1 + v2 * alpha
		res[0] = alpha * v2x + v1x;
		res[1] = alpha * v2y + v1y;
		res[2] = alpha * v2z + v1z;
		
		return res;
	}
	
	/**
	 * Linearly integrates over the second given vector {@code (v2)} by the integrator
	 * {@code (alpha)}, adds the result to the first given vector {@code (v1)} and saves the result
	 * in the given extraction parameter object. This assumes an integration delta of 1.0 so that
	 * the integration is over {@code (alpha / 1.0)}, therefore if {@code (alpha)} is 1.0 the
	 * unscaled second vector is added. Otherwise it will be scaled before adding.
	 * 
	 * <p>
	 * The main difference between interpolation and integration is that interpolation is by default
	 * designed to map a alpha value between 0.0 and 1.0 to the range between a zero-vector and a
	 * given vector. If the alpha value exceeds the range between 0.0 and 1.0 the result might be
	 * unexpected. Whereas an integration can exceed the range and will scale the given vector by
	 * the factor.
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1
	 *     The first vector.
	 * @param v2
	 *     The second vector. This vector will be integrated over.
	 * @param alpha
	 *     The integrator with an integration delta of 1.0f {@code (alpha / 1.0f)}.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3fC> T integrateLinear(Tup3fR v1, Tup3fR v2, float alpha, @ExtractionParam T res)
	{
		return integrateLinear(v1.v0(), v1.v1(), v1.v2(), v2.v0(), v2.v1(), v2.v2(), alpha, res);
	}
	
	/**
	 * Linearly integrates over the second given vector {@code (v2[0], v2[1], v2[2])} by the
	 * integrator {@code (alpha)}, adds the result to the first given vector {@code (v1)} and saves
	 * the result in the given extraction parameter object. This assumes an integration delta of 1.0
	 * so that the integration is over {@code (alpha / 1.0)}, therefore if {@code (alpha)} is 1.0
	 * the unscaled second vector is added. Otherwise it will be scaled before adding.
	 * 
	 * <p>
	 * The main difference between interpolation and integration is that interpolation is by default
	 * designed to map a alpha value between 0.0 and 1.0 to the range between a zero-vector and a
	 * given vector. If the alpha value exceeds the range between 0.0 and 1.0 the result might be
	 * unexpected. Whereas an integration can exceed the range and will scale the given vector by
	 * the factor.
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1
	 *     The first vector.
	 * @param v2
	 *     The second vector as an array with at least three entries. This vector will be integrated
	 *     over.
	 * @param alpha
	 *     The integrator with an integration delta of 1.0f {@code (alpha / 1.0f)}.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3fC> T integrateLinear(Tup3fR v1, @MinLength(3) float[] v2, float alpha,
			@ExtractionParam T res)
	{
		return integrateLinear(v1.v0(), v1.v1(), v1.v2(), v2[0], v2[1], v2[2], alpha, res);
	}
	
	/**
	 * Linearly integrates over the second given vector {@code (v2x, v2y, v2z)} by the integrator
	 * {@code (alpha)}, adds the result to the first given vector {@code (v1)} and saves the result
	 * in the given extraction parameter object. This assumes an integration delta of 1.0 so that
	 * the integration is over {@code (alpha / 1.0)}, therefore if {@code (alpha)} is 1.0 the
	 * unscaled second vector is added. Otherwise it will be scaled before adding.
	 * 
	 * <p>
	 * The main difference between interpolation and integration is that interpolation is by default
	 * designed to map a alpha value between 0.0 and 1.0 to the range between a zero-vector and a
	 * given vector. If the alpha value exceeds the range between 0.0 and 1.0 the result might be
	 * unexpected. Whereas an integration can exceed the range and will scale the given vector by
	 * the factor.
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1
	 *     The first vector.
	 * @param v2x
	 *     The value of the x component of the second vector. This vector will be integrated over.
	 * @param v2y
	 *     The value of the y component of the second vector. This vector will be integrated over.
	 * @param v2z
	 *     The value of the z component of the second vector. This vector will be integrated over.
	 * @param alpha
	 *     The integrator with an integration delta of 1.0f {@code (alpha / 1.0f)}.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3fC> T integrateLinear(Tup3fR v1, float v2x, float v2y, float v2z, float alpha,
			@ExtractionParam T res)
	{
		return integrateLinear(v1.v0(), v1.v1(), v1.v2(), v2x, v2y, v2z, alpha, res);
	}
	
	/**
	 * Linearly integrates over the second given vector {@code (v2)} by the integrator
	 * {@code (alpha)}, adds the result to the first given vector {@code (v1[0], v1[1], v1[2])}and
	 * saves the result in the given extraction parameter object. This assumes an integration delta
	 * of 1.0 so that the integration is over {@code (alpha / 1.0)}, therefore if {@code (alpha)} is
	 * 1.0 the unscaled second vector is added. Otherwise it will be scaled before adding.
	 * 
	 * <p>
	 * The main difference between interpolation and integration is that interpolation is by default
	 * designed to map a alpha value between 0.0 and 1.0 to the range between a zero-vector and a
	 * given vector. If the alpha value exceeds the range between 0.0 and 1.0 the result might be
	 * unexpected. Whereas an integration can exceed the range and will scale the given vector by
	 * the factor.
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1
	 *     The first vector as an array with at least three entries.
	 * @param v2
	 *     The second vector. This vector will be integrated over.
	 * @param alpha
	 *     The integrator with an integration delta of 1.0f {@code (alpha / 1.0f)}.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3fC> T integrateLinear(@MinLength(3) float[] v1, Tup3fR v2, float alpha,
			@ExtractionParam T res)
	{
		return integrateLinear(v1[0], v1[1], v1[2], v2.v0(), v2.v1(), v2.v2(), alpha, res);
	}
	
	/**
	 * Linearly integrates over the second given vector {@code (v2[0], v2[1], v2[2])} by the
	 * integrator {@code (alpha)}, adds the result to the first given vector
	 * {@code (v1[0], v1[1], v1[2])} and saves the result in the given extraction parameter object.
	 * This assumes an integration delta of 1.0 so that the integration is over
	 * {@code (alpha / 1.0)}, therefore if {@code (alpha)} is 1.0 the unscaled second vector is
	 * added. Otherwise it will be scaled before adding.
	 * 
	 * <p>
	 * The main difference between interpolation and integration is that interpolation is by default
	 * designed to map a alpha value between 0.0 and 1.0 to the range between a zero-vector and a
	 * given vector. If the alpha value exceeds the range between 0.0 and 1.0 the result might be
	 * unexpected. Whereas an integration can exceed the range and will scale the given vector by
	 * the factor.
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1
	 *     The first vector as an array with at least three entries.
	 * @param v2
	 *     The second vector as an array with at least three entries. This vector will be integrated
	 *     over.
	 * @param alpha
	 *     The integrator with an integration delta of 1.0f {@code (alpha / 1.0f)}.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3fC> T integrateLinear(@MinLength(3) float[] v1, @MinLength(3) float[] v2, float alpha,
			@ExtractionParam T res)
	{
		return integrateLinear(v1[0], v1[1], v1[2], v2[0], v2[1], v2[2], alpha, res);
	}
	
	/**
	 * Linearly integrates over the second given vector {@code (v2x, v2y, v2z)} by the integrator
	 * {@code (alpha)}, adds the result to the first given vector {@code (v1[0], v1[1], v1[2])} and
	 * saves the result in the given extraction parameter object. This assumes an integration delta
	 * of 1.0 so that the integration is over {@code (alpha / 1.0)}, therefore if {@code (alpha)} is
	 * 1.0 the unscaled second vector is added. Otherwise it will be scaled before adding.
	 * 
	 * <p>
	 * The main difference between interpolation and integration is that interpolation is by default
	 * designed to map a alpha value between 0.0 and 1.0 to the range between a zero-vector and a
	 * given vector. If the alpha value exceeds the range between 0.0 and 1.0 the result might be
	 * unexpected. Whereas an integration can exceed the range and will scale the given vector by
	 * the factor.
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1
	 *     The first vector as an array with at least three entries.
	 * @param v2x
	 *     The value of the x component of the second vector. This vector will be integrated over.
	 * @param v2y
	 *     The value of the y component of the second vector. This vector will be integrated over.
	 * @param v2z
	 *     The value of the z component of the second vector. This vector will be integrated over.
	 * @param alpha
	 *     The integrator with an integration delta of 1.0f {@code (alpha / 1.0f)}.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3fC> T integrateLinear(@MinLength(3) float[] v1, float v2x, float v2y, float v2z,
			float alpha, @ExtractionParam T res)
	{
		return integrateLinear(v1[0], v1[1], v1[2], v2x, v2y, v2z, alpha, res);
	}
	
	/**
	 * Linearly integrates over the second given vector {@code (v2)} by the integrator
	 * {@code (alpha)}, adds the result to the first given vector {@code (v1x, v1y, v1z)} and saves
	 * the result in the given extraction parameter object. This assumes an integration delta of 1.0
	 * so that the integration is over {@code (alpha / 1.0)}, therefore if {@code (alpha)} is 1.0
	 * the unscaled second vector is added. Otherwise it will be scaled before adding.
	 * 
	 * <p>
	 * The main difference between interpolation and integration is that interpolation is by default
	 * designed to map a alpha value between 0.0 and 1.0 to the range between a zero-vector and a
	 * given vector. If the alpha value exceeds the range between 0.0 and 1.0 the result might be
	 * unexpected. Whereas an integration can exceed the range and will scale the given vector by
	 * the factor.
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
	 *     The second vector. This vector will be integrated over.
	 * @param alpha
	 *     The integrator with an integration delta of 1.0f {@code (alpha / 1.0f)}.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3fC> T integrateLinear(float v1x, float v1y, float v1z, Tup3fR v2, float alpha,
			@ExtractionParam T res)
	{
		return integrateLinear(v1x, v1y, v1z, v2.v0(), v2.v1(), v2.v2(), alpha, res);
	}
	
	/**
	 * Linearly integrates over the second given vector {@code (v2[0], v2[1], v2[2])} by the
	 * integrator {@code (alpha)}, adds the result to the first given vector {@code (v1x, v1y, v1z)}
	 * and saves the result in the given extraction parameter object. This assumes an integration
	 * delta of 1.0 so that the integration is over {@code (alpha / 1.0)}, therefore if
	 * {@code (alpha)} is 1.0 the unscaled second vector is added. Otherwise it will be scaled
	 * before adding.
	 * 
	 * <p>
	 * The main difference between interpolation and integration is that interpolation is by default
	 * designed to map a alpha value between 0.0 and 1.0 to the range between a zero-vector and a
	 * given vector. If the alpha value exceeds the range between 0.0 and 1.0 the result might be
	 * unexpected. Whereas an integration can exceed the range and will scale the given vector by
	 * the factor.
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
	 *     The second vector as an array with at least three entries. This vector will be integrated
	 *     over.
	 * @param alpha
	 *     The integrator with an integration delta of 1.0f {@code (alpha / 1.0f)}.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3fC> T integrateLinear(float v1x, float v1y, float v1z, @MinLength(3) float[] v2,
			float alpha, @ExtractionParam T res)
	{
		return integrateLinear(v1x, v1y, v1z, v2[0], v2[1], v2[2], alpha, res);
	}
	
	/**
	 * Linearly integrates over the second given vector {@code (v2x, v2y, v2z)} by the integrator
	 * {@code (alpha)}, adds the result to the first given vector {@code (v1x, v1y, v1z)} and saves
	 * the result in the given extraction parameter object. This assumes an integration delta of 1.0
	 * so that the integration is over {@code (alpha / 1.0)}, therefore if {@code (alpha)} is 1.0
	 * the unscaled second vector is added. Otherwise it will be scaled before adding.
	 * 
	 * <p>
	 * The main difference between interpolation and integration is that interpolation is by default
	 * designed to map a alpha value between 0.0 and 1.0 to the range between a zero-vector and a
	 * given vector. If the alpha value exceeds the range between 0.0 and 1.0 the result might be
	 * unexpected. Whereas an integration can exceed the range and will scale the given vector by
	 * the factor.
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
	 *     The value of the x component of the second vector. This vector will be integrated over.
	 * @param v2y
	 *     The value of the y component of the second vector. This vector will be integrated over.
	 * @param v2z
	 *     The value of the z component of the second vector. This vector will be integrated over.
	 * @param alpha
	 *     The integrator with an integration delta of 1.0f {@code (alpha / 1.0f)}.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3fC> T integrateLinear(float v1x, float v1y, float v1z, float v2x, float v2y, float v2z,
			float alpha, @ExtractionParam T res)
	{
		// res = v1 + v2 * alpha
		res.set(alpha * v2x + v1x, alpha * v2y + v1y, alpha * v2z + v1z);
		
		return res;
	}
	
	/**
	 * Linearly integrates over the second given vector {@code (v2)} by the integrator
	 * {@code (alpha)}, adds the result to the first given vector {@code (v1)}, supplies the result
	 * to the given implementation of the functional interface and returns the result of that
	 * implementation. This assumes an integration delta of 1.0 so that the integration is over
	 * {@code (alpha / 1.0)}, therefore if {@code (alpha)} is 1.0 the unscaled second vector is
	 * added. Otherwise it will be scaled before adding.
	 * 
	 * <p>
	 * The main difference between interpolation and integration is that interpolation is by default
	 * designed to map a alpha value between 0.0 and 1.0 to the range between a zero-vector and a
	 * given vector. If the alpha value exceeds the range between 0.0 and 1.0 the result might be
	 * unexpected. Whereas an integration can exceed the range and will scale the given vector by
	 * the factor.
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v1
	 *     The first vector.
	 * @param v2
	 *     The second vector. This vector will be integrated over.
	 * @param alpha
	 *     The integrator with an integration delta of 1.0f {@code (alpha / 1.0f)}.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T integrateLinearFunc(Tup3fR v1, Tup3fR v2, float alpha, FloatTriFunction<T> res)
	{
		return integrateLinearFunc(v1.v0(), v1.v1(), v1.v2(), v2.v0(), v2.v1(), v2.v2(), alpha, res);
	}
	
	/**
	 * Linearly integrates over the second given vector {@code (v2[0], v2[1], v2[2])} by the
	 * integrator {@code (alpha)}, adds the result to the first given vector {@code (v1)}, supplies
	 * the result to the given implementation of the functional interface and returns the result of
	 * that implementation. This assumes an integration delta of 1.0 so that the integration is over
	 * {@code (alpha / 1.0)}, therefore if {@code (alpha)} is 1.0 the unscaled second vector is
	 * added. Otherwise it will be scaled before adding.
	 * 
	 * <p>
	 * The main difference between interpolation and integration is that interpolation is by default
	 * designed to map a alpha value between 0.0 and 1.0 to the range between a zero-vector and a
	 * given vector. If the alpha value exceeds the range between 0.0 and 1.0 the result might be
	 * unexpected. Whereas an integration can exceed the range and will scale the given vector by
	 * the factor.
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v1
	 *     The first vector.
	 * @param v2
	 *     The second vector as an array with at least three entries. This vector will be integrated
	 *     over.
	 * @param alpha
	 *     The integrator with an integration delta of 1.0f {@code (alpha / 1.0f)}.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T integrateLinearFunc(Tup3fR v1, @MinLength(3) float[] v2, float alpha, FloatTriFunction<T> res)
	{
		return integrateLinearFunc(v1.v0(), v1.v1(), v1.v2(), v2[0], v2[1], v2[2], alpha, res);
	}
	
	/**
	 * Linearly integrates over the second given vector {@code (v2x, v2y, v2z)} by the integrator
	 * {@code (alpha)}, adds the result to the first given vector {@code (v1)}, supplies the result
	 * to the given implementation of the functional interface and returns the result of that
	 * implementation. This assumes an integration delta of 1.0 so that the integration is over
	 * {@code (alpha / 1.0)}, therefore if {@code (alpha)} is 1.0 the unscaled second vector is
	 * added. Otherwise it will be scaled before adding.
	 * 
	 * <p>
	 * The main difference between interpolation and integration is that interpolation is by default
	 * designed to map a alpha value between 0.0 and 1.0 to the range between a zero-vector and a
	 * given vector. If the alpha value exceeds the range between 0.0 and 1.0 the result might be
	 * unexpected. Whereas an integration can exceed the range and will scale the given vector by
	 * the factor.
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v1
	 *     The first vector.
	 * @param v2x
	 *     The value of the x component of the second vector. This vector will be integrated over.
	 * @param v2y
	 *     The value of the y component of the second vector. This vector will be integrated over.
	 * @param v2z
	 *     The value of the z component of the second vector. This vector will be integrated over.
	 * @param alpha
	 *     The integrator with an integration delta of 1.0f {@code (alpha / 1.0f)}.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T integrateLinearFunc(Tup3fR v1, float v2x, float v2y, float v2z, float alpha,
			FloatTriFunction<T> res)
	{
		return integrateLinearFunc(v1.v0(), v1.v1(), v1.v2(), v2x, v2y, v2z, alpha, res);
	}
	
	/**
	 * Linearly integrates over the second given vector {@code (v2)} by the integrator
	 * {@code (alpha)}, adds the result to the first given vector {@code (v1[0], v1[1], v1[2])},
	 * supplies the result to the given implementation of the functional interface and returns the
	 * result of that implementation. This assumes an integration delta of 1.0 so that the
	 * integration is over {@code (alpha / 1.0)}, therefore if {@code (alpha)} is 1.0 the unscaled
	 * second vector is added. Otherwise it will be scaled before adding.
	 * 
	 * <p>
	 * The main difference between interpolation and integration is that interpolation is by default
	 * designed to map a alpha value between 0.0 and 1.0 to the range between a zero-vector and a
	 * given vector. If the alpha value exceeds the range between 0.0 and 1.0 the result might be
	 * unexpected. Whereas an integration can exceed the range and will scale the given vector by
	 * the factor.
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v1
	 *     The first vector as an array with at least three entries.
	 * @param v2
	 *     The second vector. This vector will be integrated over.
	 * @param alpha
	 *     The integrator with an integration delta of 1.0f {@code (alpha / 1.0f)}.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T integrateLinearFunc(@MinLength(3) float[] v1, Tup3fR v2, float alpha, FloatTriFunction<T> res)
	{
		return integrateLinearFunc(v1[0], v1[1], v1[2], v2.v0(), v2.v1(), v2.v2(), alpha, res);
	}
	
	/**
	 * Linearly integrates over the second given vector {@code (v2[0], v2[1], v2[2])} by the
	 * integrator {@code (alpha)}, adds the result to the first given vector
	 * {@code (v1[0], v1[1], v1[2])}, supplies the result to the given implementation of the
	 * functional interface and returns the result of that implementation. This assumes an
	 * integration delta of 1.0 so that the integration is over {@code (alpha / 1.0)}, therefore if
	 * {@code (alpha)} is 1.0 the unscaled second vector is added. Otherwise it will be scaled
	 * before adding.
	 * 
	 * <p>
	 * The main difference between interpolation and integration is that interpolation is by default
	 * designed to map a alpha value between 0.0 and 1.0 to the range between a zero-vector and a
	 * given vector. If the alpha value exceeds the range between 0.0 and 1.0 the result might be
	 * unexpected. Whereas an integration can exceed the range and will scale the given vector by
	 * the factor.
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v1
	 *     The first vector as an array with at least three entries.
	 * @param v2
	 *     The second vector as an array with at least three entries. This vector will be integrated
	 *     over.
	 * @param alpha
	 *     The integrator with an integration delta of 1.0f {@code (alpha / 1.0f)}.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T integrateLinearFunc(@MinLength(3) float[] v1, @MinLength(3) float[] v2, float alpha,
			FloatTriFunction<T> res)
	{
		return integrateLinearFunc(v1[0], v1[1], v1[2], v2[0], v2[1], v2[2], alpha, res);
	}
	
	/**
	 * Linearly integrates over the second given vector {@code (v2x, v2y, v2z)} by the integrator
	 * {@code (alpha)}, adds the result to the first given vector {@code (v1[0], v1[1], v1[2])},
	 * supplies the result to the given implementation of the functional interface and returns the
	 * result of that implementation. This assumes an integration delta of 1.0 so that the
	 * integration is over {@code (alpha / 1.0)}, therefore if {@code (alpha)} is 1.0 the unscaled
	 * second vector is added. Otherwise it will be scaled before adding.
	 * 
	 * <p>
	 * The main difference between interpolation and integration is that interpolation is by default
	 * designed to map a alpha value between 0.0 and 1.0 to the range between a zero-vector and a
	 * given vector. If the alpha value exceeds the range between 0.0 and 1.0 the result might be
	 * unexpected. Whereas an integration can exceed the range and will scale the given vector by
	 * the factor.
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v1
	 *     The first vector as an array with at least three entries.
	 * @param v2x
	 *     The value of the x component of the second vector. This vector will be integrated over.
	 * @param v2y
	 *     The value of the y component of the second vector. This vector will be integrated over.
	 * @param v2z
	 *     The value of the z component of the second vector. This vector will be integrated over.
	 * @param alpha
	 *     The integrator with an integration delta of 1.0f {@code (alpha / 1.0f)}.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T integrateLinearFunc(@MinLength(3) float[] v1, float v2x, float v2y, float v2z, float alpha,
			FloatTriFunction<T> res)
	{
		return integrateLinearFunc(v1[0], v1[1], v1[2], v2x, v2y, v2z, alpha, res);
	}
	
	/**
	 * Linearly integrates over the second given vector {@code (v2)} by the integrator
	 * {@code (alpha)}, adds the result to the first given vector {@code (v1x, v1y, v1z)}, supplies
	 * the result to the given implementation of the functional interface and returns the result of
	 * that implementation. This assumes an integration delta of 1.0 so that the integration is over
	 * {@code (alpha / 1.0)}, therefore if {@code (alpha)} is 1.0 the unscaled second vector is
	 * added. Otherwise it will be scaled before adding.
	 * 
	 * <p>
	 * The main difference between interpolation and integration is that interpolation is by default
	 * designed to map a alpha value between 0.0 and 1.0 to the range between a zero-vector and a
	 * given vector. If the alpha value exceeds the range between 0.0 and 1.0 the result might be
	 * unexpected. Whereas an integration can exceed the range and will scale the given vector by
	 * the factor.
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v1x
	 *     The value of the x component of the first vector.
	 * @param v1y
	 *     The value of the y component of the first vector.
	 * @param v1z
	 *     The value of the z component of the first vector.
	 * @param v2
	 *     The second vector. This vector will be integrated over.
	 * @param alpha
	 *     The integrator with an integration delta of 1.0f {@code (alpha / 1.0f)}.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T integrateLinearFunc(float v1x, float v1y, float v1z, Tup3fR v2, float alpha,
			FloatTriFunction<T> res)
	{
		return integrateLinearFunc(v1x, v1y, v1z, v2.v0(), v2.v1(), v2.v2(), alpha, res);
	}
	
	/**
	 * Linearly integrates over the second given vector {@code (v2[0], v2[1], v2[2])} by the
	 * integrator {@code (alpha)}, adds the result to the first given vector
	 * {@code (v1x, v1y, v1z)}, supplies the result to the given implementation of the functional
	 * interface and returns the result of that implementation. This assumes an integration delta of
	 * 1.0 so that the integration is over {@code (alpha / 1.0)}, therefore if {@code (alpha)} is
	 * 1.0 the unscaled second vector is added. Otherwise it will be scaled before adding.
	 * 
	 * <p>
	 * The main difference between interpolation and integration is that interpolation is by default
	 * designed to map a alpha value between 0.0 and 1.0 to the range between a zero-vector and a
	 * given vector. If the alpha value exceeds the range between 0.0 and 1.0 the result might be
	 * unexpected. Whereas an integration can exceed the range and will scale the given vector by
	 * the factor.
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v1x
	 *     The value of the x component of the first vector.
	 * @param v1y
	 *     The value of the y component of the first vector.
	 * @param v1z
	 *     The value of the z component of the first vector.
	 * @param v2
	 *     The second vector as an array with at least three entries. This vector will be integrated
	 *     over.
	 * @param alpha
	 *     The integrator with an integration delta of 1.0f {@code (alpha / 1.0f)}.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T integrateLinearFunc(float v1x, float v1y, float v1z, @MinLength(3) float[] v2, float alpha,
			FloatTriFunction<T> res)
	{
		return integrateLinearFunc(v1x, v1y, v1z, v2[0], v2[1], v2[2], alpha, res);
	}
	
	/**
	 * Linearly integrates over the second given vector {@code (v2x, v2y, v2z)} by the integrator
	 * {@code (alpha)}, adds the result to the first given vector {@code (v1x, v1y, v1z)}, supplies
	 * the result to the given implementation of the functional interface and returns the result of
	 * that implementation. This assumes an integration delta of 1.0 so that the integration is over
	 * {@code (alpha / 1.0)}, therefore if {@code (alpha)} is 1.0 the unscaled second vector is
	 * added. Otherwise it will be scaled before adding.
	 * 
	 * <p>
	 * The main difference between interpolation and integration is that interpolation is by default
	 * designed to map a alpha value between 0.0 and 1.0 to the range between a zero-vector and a
	 * given vector. If the alpha value exceeds the range between 0.0 and 1.0 the result might be
	 * unexpected. Whereas an integration can exceed the range and will scale the given vector by
	 * the factor.
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v1x
	 *     The value of the x component of the first vector.
	 * @param v1y
	 *     The value of the y component of the first vector.
	 * @param v1z
	 *     The value of the z component of the first vector.
	 * @param v2x
	 *     The value of the x component of the second vector. This vector will be integrated over.
	 * @param v2y
	 *     The value of the y component of the second vector. This vector will be integrated over.
	 * @param v2z
	 *     The value of the z component of the second vector. This vector will be integrated over.
	 * @param alpha
	 *     The integrator with an integration delta of 1.0f {@code (alpha / 1.0f)}.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T integrateLinearFunc(float v1x, float v1y, float v1z, float v2x, float v2y, float v2z,
			float alpha, FloatTriFunction<T> res)
	{
		// res = v1 + v2 * alpha
		return res.apply(alpha * v2x + v1x, alpha * v2y + v1y, alpha * v2z + v1z);
	}
	
	/**
	 * Performs a linear interpolation between the two vectors (v1) and (v2) and saves the result in
	 * the given extraction parameter. The interpolation happens over the interpolator value alpha
	 * in the range of 0.0 to 1.0 where a value of 0.0 is exacly (v1) and a value of 1.0 is exactly
	 * (v2).
	 * 
	 * <p>
	 * Operation: (1.0 - alpha) * v1 + alpha * v2
	 * 
	 * @param v1
	 *     The first vector.
	 * @param v2
	 *     The second vector.
	 * @param alpha
	 *     The interpolator in range of 0.0 to 1.0.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] lerp(Tup3fR v1, Tup3fR v2, float alpha, @ExtractionParam @MinLength(3) float[] res)
	{
		return lerp(v1.v0(), v1.v1(), v1.v2(), v2.v0(), v2.v1(), v2.v2(), alpha, res);
	}
	
	/**
	 * Performs a linear interpolation between the two vectors (v1) and (v2[0], v2[1], v2[2]) and
	 * saves the result in the given extraction parameter. The interpolation happens over the
	 * interpolator value alpha in the range of 0.0 to 1.0 where a value of 0.0 is exacly (v1) and a
	 * value of 1.0 is exactly (v2[0], v2[1], v2[2]).
	 * 
	 * <p>
	 * Operation: (1.0 - alpha) * v1 + alpha * (v2[0], v2[1], v2[2])
	 * 
	 * @param v1
	 *     The first vector.
	 * @param v2
	 *     The second vector as an array with at least three entries.
	 * @param alpha
	 *     The interpolator in range of 0.0 to 1.0.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] lerp(Tup3fR v1, @MinLength(3) float[] v2, float alpha,
			@ExtractionParam @MinLength(3) float[] res)
	{
		return lerp(v1.v0(), v1.v1(), v1.v2(), v2[0], v2[1], v2[2], alpha, res);
	}
	
	/**
	 * Performs a linear interpolation between the two vectors (v1) and (v2x, v2y, v2z) and saves
	 * the result in the given extraction parameter. The interpolation happens over the interpolator
	 * value alpha in the range of 0.0 to 1.0 where a value of 0.0 is exacly (v1[0], v1[1], v1[2])
	 * and a value of 1.0 is exactly (v2x, v2y, v2z).
	 * 
	 * <p>
	 * Operation: (1.0 - alpha) * v1 + alpha * (v2x, v2y, v2z)
	 * 
	 * @param v1
	 *     The first vector.
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * @param v2z
	 *     The value of the z component of the second vector.
	 * @param alpha
	 *     The interpolator in range of 0.0 to 1.0.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] lerp(Tup3fR v1, float v2x, float v2y, float v2z, float alpha,
			@ExtractionParam @MinLength(3) float[] res)
	{
		return lerp(v1.v0(), v1.v1(), v1.v2(), v2x, v2y, v2z, alpha, res);
	}
	
	/**
	 * Performs a linear interpolation between the two vectors (v1[0], v1[1], v1[2]) and (v2) and
	 * saves the result in the given extraction parameter. The interpolation happens over the
	 * interpolator value alpha in the range of 0.0 to 1.0 where a value of 0.0 is exacly (v1[0],
	 * v1[1], v1[2]) and a value of 1.0 is exactly (v2).
	 * 
	 * <p>
	 * Operation: (1.0 - alpha) * (v1[0], v1[1], v1[2]) + alpha * v2
	 * 
	 * @param v1
	 *     The first vector as an array with at least three entries.
	 * @param v2
	 *     The second vector.
	 * @param alpha
	 *     The interpolator in range of 0.0 to 1.0.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] lerp(@MinLength(3) float[] v1, Tup3fR v2, float alpha,
			@ExtractionParam @MinLength(3) float[] res)
	{
		return lerp(v1[0], v1[1], v1[2], v2.v0(), v2.v1(), v2.v2(), alpha, res);
	}
	
	/**
	 * Performs a linear interpolation between the two vectors (v1[0], v1[1], v1[2]) and (v2[0],
	 * v2[1], v2[2]) and saves the result in the given extraction parameter. The interpolation
	 * happens over the interpolator value alpha in the range of 0.0 to 1.0 where a value of 0.0 is
	 * exacly (v1[0], v1[1], v1[2]) and a value of 1.0 is exactly (v2[0], v2[1], v2[2]).
	 * 
	 * <p>
	 * Operation: (1.0 - alpha) * (v1[0], v1[1], v1[2]) + alpha * (v2[0], v2[1], v2[2])
	 * 
	 * @param v1
	 *     The first vector as an array with at least three entries.
	 * @param v2
	 *     The second vector as an array with at least three entries.
	 * @param alpha
	 *     The interpolator in range of 0.0 to 1.0.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] lerp(@MinLength(3) float[] v1, @MinLength(3) float[] v2, float alpha,
			@ExtractionParam @MinLength(3) float[] res)
	{
		return lerp(v1[0], v1[1], v1[2], v2[0], v2[1], v2[2], alpha, res);
	}
	
	/**
	 * Performs a linear interpolation between the two vectors (v1[0], v1[1], v1[2]) and (v2x, v2y,
	 * v2z) and saves the result in the given extraction parameter. The interpolation happens over
	 * the interpolator value alpha in the range of 0.0 to 1.0 where a value of 0.0 is exacly
	 * (v1[0], v1[1], v1[2]) and a value of 1.0 is exactly (v2x, v2y, v2z).
	 * 
	 * <p>
	 * Operation: (1.0 - alpha) * (v1[0], v1[1], v1[2]) + alpha * (v2x, v2y, v2z)
	 * 
	 * @param v1
	 *     The first vector as an array with at least three entries.
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * @param v2z
	 *     The value of the z component of the second vector.
	 * @param alpha
	 *     The interpolator in range of 0.0 to 1.0.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] lerp(@MinLength(3) float[] v1, float v2x, float v2y, float v2z, float alpha,
			@ExtractionParam @MinLength(3) float[] res)
	{
		return lerp(v1[0], v1[1], v1[2], v2x, v2y, v2z, alpha, res);
	}
	
	/**
	 * Performs a linear interpolation between the two vectors (v1x, v1y, v1z) and (v2) and saves
	 * the result in the given extraction parameter. The interpolation happens over the interpolator
	 * value alpha in the range of 0.0 to 1.0 where a value of 0.0 is exacly (v1x, v1y, v1z) and a
	 * value of 1.0 is exactly (v2).
	 * 
	 * <p>
	 * Operation: (1.0 - alpha) * (v1x, v1y, v1z) + alpha * v2
	 * 
	 * @param v1x
	 *     The value of the x component of the first vector.
	 * @param v1y
	 *     The value of the y component of the first vector.
	 * @param v1z
	 *     The value of the z component of the first vector.
	 * @param v2
	 *     The second vector.
	 * @param alpha
	 *     The interpolator in range of 0.0 to 1.0.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] lerp(float v1x, float v1y, float v1z, Tup3fR v2, float alpha,
			@ExtractionParam @MinLength(3) float[] res)
	{
		return lerp(v1x, v1y, v1z, v2.v0(), v2.v1(), v2.v2(), alpha, res);
	}
	
	/**
	 * Performs a linear interpolation between the two vectors (v1x, v1y, v1z) and (v2[0], v2[1],
	 * v2[2]) and saves the result in the given extraction parameter. The interpolation happens over
	 * the interpolator value alpha in the range of 0.0 to 1.0 where a value of 0.0 is exacly (v1x,
	 * v1y, v1z) and a value of 1.0 is exactly (v2[0], v2[1], v2[2]).
	 * 
	 * <p>
	 * Operation: (1.0 - alpha) * (v1x, v1y, v1z) + alpha * (v2[0], v2[1], v2[2])
	 * 
	 * @param v1x
	 *     The value of the x component of the first vector.
	 * @param v1y
	 *     The value of the y component of the first vector.
	 * @param v1z
	 *     The value of the z component of the first vector.
	 * @param v2
	 *     The second vector as an array with at least three entries.
	 * @param alpha
	 *     The interpolator in range of 0.0 to 1.0.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] lerp(float v1x, float v1y, float v1z, @MinLength(3) float[] v2, float alpha,
			@ExtractionParam @MinLength(3) float[] res)
	{
		return lerp(v1x, v1y, v1z, v2[0], v2[1], v2[2], alpha, res);
	}
	
	/**
	 * Performs a linear interpolation between the two vectors (v1x, v1y, v1z) and (v2x, v2y, v2z)
	 * and saves the result in the given extraction parameter. The interpolation happens over the
	 * interpolator value alpha in the range of 0.0 to 1.0 where a value of 0.0 is exacly (v1x, v1y,
	 * v1z) and a value of 1.0 is exactly (v2x, v2y, v2z).
	 * 
	 * <p>
	 * Operation: (1.0 - alpha) * (v1x, v1y, v1z) + alpha * (v2x, v2y, v2z)
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
	 * @param alpha
	 *     The interpolator in range of 0.0 to 1.0.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] lerp(float v1x, float v1y, float v1z, float v2x, float v2y, float v2z, float alpha,
			@ExtractionParam @MinLength(3) float[] res)
	{
		if (alpha == 0.0f)
		{
			res[0] = v1x;
			res[1] = v1y;
			res[2] = v1z;
			
			return res;
		}
		
		if (alpha == 1.0f)
		{
			res[0] = v2x;
			res[1] = v2y;
			res[2] = v2z;
			
			return res;
		}
		
		float oneMinusAlpha = 1.0f - alpha;
		
		res[0] = oneMinusAlpha * v1x + alpha * v2x;
		res[1] = oneMinusAlpha * v1y + alpha * v2y;
		res[2] = oneMinusAlpha * v1z + alpha * v2z;
		
		return res;
	}
	
	/**
	 * Performs a linear interpolation between the two vectors (v1) and (v2) and saves the result in
	 * the given extraction parameter object. The interpolation happens over the interpolator value
	 * alpha in the range of 0.0 to 1.0 where a value of 0.0 is exacly (v1) and a value of 1.0 is
	 * exactly (v2).
	 * 
	 * <p>
	 * Operation: (1.0 - alpha) * v1 + alpha * v2
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1
	 *     The first vector.
	 * @param v2
	 *     The second vector.
	 * @param alpha
	 *     The interpolator in range of 0.0 to 1.0.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3fC> T lerp(Tup3fR v1, Tup3fR v2, float alpha, @ExtractionParam T res)
	{
		return lerp(v1.v0(), v1.v1(), v1.v2(), v2.v0(), v2.v1(), v2.v2(), alpha, res);
	}
	
	/**
	 * Performs a linear interpolation between the two vectors (v1) and (v2[0], v2[1], v2[2]) and
	 * saves the result in the given extraction parameter object. The interpolation happens over the
	 * interpolator value alpha in the range of 0.0 to 1.0 where a value of 0.0 is exacly (v1) and a
	 * value of 1.0 is exactly (v2[0], v2[1], v2[2]).
	 * 
	 * <p>
	 * Operation: (1.0 - alpha) * v1 + alpha * (v2[0], v2[1], v2[2])
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1
	 *     The first vector.
	 * @param v2
	 *     The second vector as an array with at least three entries.
	 * @param alpha
	 *     The interpolator in range of 0.0 to 1.0.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3fC> T lerp(Tup3fR v1, @MinLength(3) float[] v2, float alpha, @ExtractionParam T res)
	{
		return lerp(v1.v0(), v1.v1(), v1.v2(), v2[0], v2[1], v2[2], alpha, res);
	}
	
	/**
	 * Performs a linear interpolation between the two vectors (v1) and (v2x, v2y, v2z) and saves
	 * the result in the given extraction parameter object. The interpolation happens over the
	 * interpolator value alpha in the range of 0.0 to 1.0 where a value of 0.0 is exacly (v1[0],
	 * v1[1], v1[2]) and a value of 1.0 is exactly (v2x, v2y, v2z).
	 * 
	 * <p>
	 * Operation: (1.0 - alpha) * v1 + alpha * (v2x, v2y, v2z)
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
	 * @param alpha
	 *     The interpolator in range of 0.0 to 1.0.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3fC> T lerp(Tup3fR v1, float v2x, float v2y, float v2z, float alpha,
			@ExtractionParam T res)
	{
		return lerp(v1.v0(), v1.v1(), v1.v2(), v2x, v2y, v2z, alpha, res);
	}
	
	/**
	 * Performs a linear interpolation between the two vectors (v1[0], v1[1], v1[2]) and (v2) and
	 * saves the result in the given extraction parameter object. The interpolation happens over the
	 * interpolator value alpha in the range of 0.0 to 1.0 where a value of 0.0 is exacly (v1[0],
	 * v1[1], v1[2]) and a value of 1.0 is exactly (v2).
	 * 
	 * <p>
	 * Operation: (1.0 - alpha) * (v1[0], v1[1], v1[2]) + alpha * v2
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1
	 *     The first vector as an array with at least three entries.
	 * @param v2
	 *     The second vector.
	 * @param alpha
	 *     The interpolator in range of 0.0 to 1.0.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3fC> T lerp(@MinLength(3) float[] v1, Tup3fR v2, float alpha, @ExtractionParam T res)
	{
		return lerp(v1[0], v1[1], v1[2], v2.v0(), v2.v1(), v2.v2(), alpha, res);
	}
	
	/**
	 * Performs a linear interpolation between the two vectors (v1[0], v1[1], v1[2]) and (v2[0],
	 * v2[1], v2[2]) and saves the result in the given extraction parameter object. The
	 * interpolation happens over the interpolator value alpha in the range of 0.0 to 1.0 where a
	 * value of 0.0 is exacly (v1[0], v1[1], v1[2]) and a value of 1.0 is exactly (v2[0], v2[1],
	 * v2[2]).
	 * 
	 * <p>
	 * Operation: (1.0 - alpha) * (v1[0], v1[1], v1[2]) + alpha * (v2[0], v2[1], v2[2])
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1
	 *     The first vector as an array with at least three entries.
	 * @param v2
	 *     The second vector as an array with at least three entries.
	 * @param alpha
	 *     The interpolator in range of 0.0 to 1.0.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3fC> T lerp(@MinLength(3) float[] v1, @MinLength(3) float[] v2, float alpha,
			@ExtractionParam T res)
	{
		return lerp(v1[0], v1[1], v1[2], v2[0], v2[1], v2[2], alpha, res);
	}
	
	/**
	 * Performs a linear interpolation between the two vectors (v1[0], v1[1], v1[2]) and (v2x, v2y,
	 * v2z) and saves the result in the given extraction parameter object. The interpolation happens
	 * over the interpolator value alpha in the range of 0.0 to 1.0 where a value of 0.0 is exacly
	 * (v1[0], v1[1], v1[2]) and a value of 1.0 is exactly (v2x, v2y, v2z).
	 * 
	 * <p>
	 * Operation: (1.0 - alpha) * (v1[0], v1[1], v1[2]) + alpha * (v2x, v2y, v2z)
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
	 * @param alpha
	 *     The interpolator in range of 0.0 to 1.0.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3fC> T lerp(@MinLength(3) float[] v1, float v2x, float v2y, float v2z, float alpha,
			@ExtractionParam T res)
	{
		return lerp(v1[0], v1[1], v1[2], v2x, v2y, v2z, alpha, res);
	}
	
	/**
	 * Performs a linear interpolation between the two vectors (v1x, v1y, v1z) and (v2) and saves
	 * the result in the given extraction parameter object. The interpolation happens over the
	 * interpolator value alpha in the range of 0.0 to 1.0 where a value of 0.0 is exacly (v1x, v1y,
	 * v1z) and a value of 1.0 is exactly (v2).
	 * 
	 * <p>
	 * Operation: (1.0 - alpha) * (v1x, v1y, v1z) + alpha * v2
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
	 * @param alpha
	 *     The interpolator in range of 0.0 to 1.0.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3fC> T lerp(float v1x, float v1y, float v1z, Tup3fR v2, float alpha,
			@ExtractionParam T res)
	{
		return lerp(v1x, v1y, v1z, v2.v0(), v2.v1(), v2.v2(), alpha, res);
	}
	
	/**
	 * Performs a linear interpolation between the two vectors (v1x, v1y, v1z) and (v2[0], v2[1],
	 * v2[2]) and saves the result in the given extraction parameter object. The interpolation
	 * happens over the interpolator value alpha in the range of 0.0 to 1.0 where a value of 0.0 is
	 * exacly (v1x, v1y, v1z) and a value of 1.0 is exactly (v2[0], v2[1], v2[2]).
	 * 
	 * <p>
	 * Operation: (1.0 - alpha) * (v1x, v1y, v1z) + alpha * (v2[0], v2[1], v2[2])
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
	 * @param alpha
	 *     The interpolator in range of 0.0 to 1.0.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3fC> T lerp(float v1x, float v1y, float v1z, @MinLength(3) float[] v2, float alpha,
			@ExtractionParam T res)
	{
		return lerp(v1x, v1y, v1z, v2[0], v2[1], v2[2], alpha, res);
	}
	
	/**
	 * Performs a linear interpolation between the two vectors (v1x, v1y, v1z) and (v2x, v2y, v2z)
	 * and saves the result in the given extraction parameter object. The interpolation happens over
	 * the interpolator value alpha in the range of 0.0 to 1.0 where a value of 0.0 is exacly (v1x,
	 * v1y, v1z) and a value of 1.0 is exactly (v2x, v2y, v2z).
	 * 
	 * <p>
	 * Operation: (1.0 - alpha) * (v1x, v1y, v1z) + alpha * (v2x, v2y, v2z)
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
	 * @param alpha
	 *     The interpolator in range of 0.0 to 1.0.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3fC> T lerp(float v1x, float v1y, float v1z, float v2x, float v2y, float v2z,
			float alpha, @ExtractionParam T res)
	{
		if (alpha == 0.0f)
		{
			res.set(v1x, v1y, v1z);
			
			return res;
		}
		
		if (alpha == 1.0f)
		{
			res.set(v2x, v2y, v2z);
			
			return res;
		}
		
		float oneMinusAlpha = 1.0f - alpha;
		
		res.set(oneMinusAlpha * v1x + alpha * v2x, oneMinusAlpha * v1y + alpha * v2y,
				oneMinusAlpha * v1z + alpha * v2z);
		
		return res;
	}
	
	/**
	 * Performs a linear interpolation between the two vectors (v1) and (v2), supplies the result to
	 * the given implementation of the functional interface and returns the result of that
	 * implementation. The interpolation happens over the interpolator value alpha in the range of
	 * 0.0 to 1.0 where a value of 0.0 is exacly (v1) and a value of 1.0 is exactly (v2).
	 * 
	 * <p>
	 * Operation: (1.0 - alpha) * v1 + alpha * v2
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v1
	 *     The first vector.
	 * @param v2
	 *     The second vector.
	 * @param alpha
	 *     The interpolator in range of 0.0 to 1.0.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T lerpFunc(Tup3fR v1, Tup3fR v2, float alpha, FloatTriFunction<T> res)
	{
		return lerpFunc(v1.v0(), v1.v1(), v1.v2(), v2.v0(), v2.v1(), v2.v2(), alpha, res);
	}
	
	/**
	 * Performs a linear interpolation between the two vectors (v1) and (v2[0], v2[1], v2[2]),
	 * supplies the result to the given implementation of the functional interface and returns the
	 * result of that implementation. The interpolation happens over the interpolator value alpha in
	 * the range of 0.0 to 1.0 where a value of 0.0 is exacly (v1) and a value of 1.0 is exactly
	 * (v2[0], v2[1], v2[2]).
	 * 
	 * <p>
	 * Operation: (1.0 - alpha) * v1 + alpha * (v2[0], v2[1], v2[2])
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v1
	 *     The first vector.
	 * @param v2
	 *     The second vector as an array with at least three entries.
	 * @param alpha
	 *     The interpolator in range of 0.0 to 1.0.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T lerpFunc(Tup3fR v1, @MinLength(3) float[] v2, float alpha, FloatTriFunction<T> res)
	{
		return lerpFunc(v1.v0(), v1.v1(), v1.v2(), v2[0], v2[1], v2[2], alpha, res);
	}
	
	/**
	 * Performs a linear interpolation between the two vectors (v1) and (v2x, v2y, v2z), supplies
	 * the result to the given implementation of the functional interface and returns the result of
	 * that implementation. The interpolation happens over the interpolator value alpha in the range
	 * of 0.0 to 1.0 where a value of 0.0 is exacly (v1[0], v1[1], v1[2]) and a value of 1.0 is
	 * exactly (v2x, v2y, v2z).
	 * 
	 * <p>
	 * Operation: (1.0 - alpha) * v1 + alpha * (v2x, v2y, v2z)
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
	 * @param v2z
	 *     The value of the z component of the second vector.
	 * @param alpha
	 *     The interpolator in range of 0.0 to 1.0.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T lerpFunc(Tup3fR v1, float v2x, float v2y, float v2z, float alpha, FloatTriFunction<T> res)
	{
		return lerpFunc(v1.v0(), v1.v1(), v1.v2(), v2x, v2y, v2z, alpha, res);
	}
	
	/**
	 * Performs a linear interpolation between the two vectors (v1[0], v1[1], v1[2]) and (v2),
	 * supplies the result to the given implementation of the functional interface and returns the
	 * result of that implementation. The interpolation happens over the interpolator value alpha in
	 * the range of 0.0 to 1.0 where a value of 0.0 is exacly (v1[0], v1[1], v1[2]) and a value of
	 * 1.0 is exactly (v2).
	 * 
	 * <p>
	 * Operation: (1.0 - alpha) * (v1[0], v1[1], v1[2]) + alpha * v2
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v1
	 *     The first vector as an array with at least three entries.
	 * @param v2
	 *     The second vector.
	 * @param alpha
	 *     The interpolator in range of 0.0 to 1.0.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T lerpFunc(@MinLength(3) float[] v1, Tup3fR v2, float alpha, FloatTriFunction<T> res)
	{
		return lerpFunc(v1[0], v1[1], v1[2], v2.v0(), v2.v1(), v2.v2(), alpha, res);
	}
	
	/**
	 * Performs a linear interpolation between the two vectors (v1[0], v1[1], v1[2]) and (v2[0],
	 * v2[1], v2[2]), supplies the result to the given implementation of the functional interface
	 * and returns the result of that implementation. The interpolation happens over the
	 * interpolator value alpha in the range of 0.0 to 1.0 where a value of 0.0 is exacly (v1[0],
	 * v1[1], v1[2]) and a value of 1.0 is exactly (v2[0], v2[1], v2[2]).
	 * 
	 * <p>
	 * Operation: (1.0 - alpha) * (v1[0], v1[1], v1[2]) + alpha * (v2[0], v2[1], v2[2])
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v1
	 *     The first vector as an array with at least three entries.
	 * @param v2
	 *     The second vector as an array with at least three entries.
	 * @param alpha
	 *     The interpolator in range of 0.0 to 1.0.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T lerpFunc(@MinLength(3) float[] v1, @MinLength(3) float[] v2, float alpha, FloatTriFunction<T> res)
	{
		return lerpFunc(v1[0], v1[1], v1[2], v2[0], v2[1], v2[2], alpha, res);
	}
	
	/**
	 * Performs a linear interpolation between the two vectors (v1[0], v1[1], v1[2]) and (v2x, v2y,
	 * v2z), supplies the result to the given implementation of the functional interface and returns
	 * the result of that implementation. The interpolation happens over the interpolator value
	 * alpha in the range of 0.0 to 1.0 where a value of 0.0 is exacly (v1[0], v1[1], v1[2]) and a
	 * value of 1.0 is exactly (v2x, v2y, v2z).
	 * 
	 * <p>
	 * Operation: (1.0 - alpha) * (v1[0], v1[1], v1[2]) + alpha * (v2x, v2y, v2z)
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v1
	 *     The first vector as an array with at least three entries.
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * @param v2z
	 *     The value of the z component of the second vector.
	 * @param alpha
	 *     The interpolator in range of 0.0 to 1.0.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T lerpFunc(@MinLength(3) float[] v1, float v2x, float v2y, float v2z, float alpha,
			FloatTriFunction<T> res)
	{
		return lerpFunc(v1[0], v1[1], v1[2], v2x, v2y, v2z, alpha, res);
	}
	
	/**
	 * Performs a linear interpolation between the two vectors (v1x, v1y, v1z) and (v2), supplies
	 * the result to the given implementation of the functional interface and returns the result of
	 * that implementation. The interpolation happens over the interpolator value alpha in the range
	 * of 0.0 to 1.0 where a value of 0.0 is exacly (v1x, v1y, v1z) and a value of 1.0 is exactly
	 * (v2).
	 * 
	 * <p>
	 * Operation: (1.0 - alpha) * (v1x, v1y, v1z) + alpha * v2
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v1x
	 *     The value of the x component of the first vector.
	 * @param v1y
	 *     The value of the y component of the first vector.
	 * @param v1z
	 *     The value of the z component of the first vector.
	 * @param v2
	 *     The second vector.
	 * @param alpha
	 *     The interpolator in range of 0.0 to 1.0.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T lerpFunc(float v1x, float v1y, float v1z, Tup3fR v2, float alpha, FloatTriFunction<T> res)
	{
		return lerpFunc(v1x, v1y, v1z, v2.v0(), v2.v1(), v2.v2(), alpha, res);
	}
	
	/**
	 * Performs a linear interpolation between the two vectors (v1x, v1y, v1z) and (v2[0], v2[1],
	 * v2[2]), supplies the result to the given implementation of the functional interface and
	 * returns the result of that implementation. The interpolation happens over the interpolator
	 * value alpha in the range of 0.0 to 1.0 where a value of 0.0 is exacly (v1x, v1y, v1z) and a
	 * value of 1.0 is exactly (v2[0], v2[1], v2[2]).
	 * 
	 * <p>
	 * Operation: (1.0 - alpha) * (v1x, v1y, v1z) + alpha * (v2[0], v2[1], v2[2])
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v1x
	 *     The value of the x component of the first vector.
	 * @param v1y
	 *     The value of the y component of the first vector.
	 * @param v1z
	 *     The value of the z component of the first vector.
	 * @param v2
	 *     The second vector as an array with at least three entries.
	 * @param alpha
	 *     The interpolator in range of 0.0 to 1.0.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T lerpFunc(float v1x, float v1y, float v1z, @MinLength(3) float[] v2, float alpha,
			FloatTriFunction<T> res)
	{
		return lerpFunc(v1x, v1y, v1z, v2[0], v2[1], v2[2], alpha, res);
	}
	
	/**
	 * Performs a linear interpolation between the two vectors (v1x, v1y, v1z) and (v2x, v2y, v2z),
	 * supplies the result to the given implementation of the functional interface and returns the
	 * result of that implementation. The interpolation happens over the interpolator value alpha in
	 * the range of 0.0 to 1.0 where a value of 0.0 is exacly (v1x, v1y, v1z) and a value of 1.0 is
	 * exactly (v2x, v2y, v2z).
	 * 
	 * <p>
	 * Operation: (1.0 - alpha) * (v1x, v1y, v1z) + alpha * (v2x, v2y, v2z)
	 * 
	 * @param <T>
	 *     The type of the result object.
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
	 * @param alpha
	 *     The interpolator in range of 0.0 to 1.0.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T lerpFunc(float v1x, float v1y, float v1z, float v2x, float v2y, float v2z, float alpha,
			FloatTriFunction<T> res)
	{
		if (alpha == 0.0f)
		{
			return res.apply(v1x, v1y, v1z);
		}
		
		if (alpha == 1.0f)
		{
			return res.apply(v2x, v2y, v2z);
		}
		
		float oneMinusAlpha = 1.0f - alpha;
		
		return res.apply(oneMinusAlpha * v1x + alpha * v2x, oneMinusAlpha * v1y + alpha * v2y,
				oneMinusAlpha * v1z + alpha * v2z);
	}
	
	/**
	 * Performs a fast linear interpolation between the given tuple {@code (v1)} and the given tuple
	 * {@code (v2)} and saves the result in the given extraction parameter. This sacrifices for
	 * reduced calculations the precision and the applicability. The interpolation happens over the
	 * interpolator value alpha in the range of 0.0 to 1.0.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 + ( v2 - v1 ) * alpha}
	 * 
	 * @param v1
	 *     The first vector.
	 * @param v2
	 *     The second vector.
	 * @param alpha
	 *     The interpolator in range of 0.0 to 1.0.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] fastLerp(Tup3fR v1, Tup3fR v2, float alpha, @ExtractionParam @MinLength(3) float[] res)
	{
		return fastLerp(v1.v0(), v1.v1(), v1.v2(), v2.v0(), v2.v1(), v2.v2(), alpha, res);
	}
	
	/**
	 * Performs a fast linear interpolation between the given tuple {@code (v1)} and the given tuple
	 * {@code (v2[0], v2[1], v2[2])} and saves the result in the given extraction parameter. This
	 * sacrifices for reduced calculations the precision and the applicability. The interpolation
	 * happens over the interpolator value alpha in the range of 0.0 to 1.0.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 + ( (v2[0], v2[1], v2[2]) - v1 ) * alpha}
	 * 
	 * @param v1
	 *     The first vector.
	 * @param v2
	 *     The second vector as an array with at least three entries.
	 * @param alpha
	 *     The interpolator in range of 0.0 to 1.0.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] fastLerp(Tup3fR v1, @MinLength(3) float[] v2, float alpha,
			@ExtractionParam @MinLength(3) float[] res)
	{
		return fastLerp(v1.v0(), v1.v1(), v1.v2(), v2[0], v2[1], v2[2], alpha, res);
	}
	
	/**
	 * Performs a fast linear interpolation between the given tuple {@code (v1)} and the given tuple
	 * {@code (v2x, v2y, v2z)} and saves the result in the given extraction parameter. This
	 * sacrifices for reduced calculations the precision and the applicability. The interpolation
	 * happens over the interpolator value alpha in the range of 0.0 to 1.0.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 + ( (v2x, v2y, v2z) - v1 ) * alpha}
	 * 
	 * @param v1
	 *     The first vector.
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * @param v2z
	 *     The value of the z component of the second vector.
	 * @param alpha
	 *     The interpolator in range of 0.0 to 1.0.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] fastLerp(Tup3fR v1, float v2x, float v2y, float v2z, float alpha,
			@ExtractionParam @MinLength(3) float[] res)
	{
		return fastLerp(v1.v0(), v1.v1(), v1.v2(), v2x, v2y, v2z, alpha, res);
	}
	
	/**
	 * Performs a fast linear interpolation between the given tuple {@code (v1[0], v1[1], v1[2])}
	 * and the given tuple {@code (v2)} and saves the result in the given extraction parameter. This
	 * sacrifices for reduced calculations the precision and the applicability. The interpolation
	 * happens over the interpolator value alpha in the range of 0.0 to 1.0.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1], v1[2]) + ( v2 - (v1[0], v1[1], v1[2]) ) * alpha}
	 * 
	 * @param v1
	 *     The first vector as an array with at least three entries.
	 * @param v2
	 *     The second vector.
	 * @param alpha
	 *     The interpolator in range of 0.0 to 1.0.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] fastLerp(@MinLength(3) float[] v1, Tup3fR v2, float alpha,
			@ExtractionParam @MinLength(3) float[] res)
	{
		return fastLerp(v1[0], v1[1], v1[2], v2.v0(), v2.v1(), v2.v2(), alpha, res);
	}
	
	/**
	 * Performs a fast linear interpolation between the given tuple {@code (v1[0], v1[1], v1[2])}
	 * and the given tuple {@code (v2[0], v2[1], v2[2])} and saves the result in the given
	 * extraction parameter. This sacrifices for reduced calculations the precision and the
	 * applicability. The interpolation happens over the interpolator value alpha in the range of
	 * 0.0 to 1.0.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1], v1[2]) + ( (v2[0], v2[1], v2[2]) - (v1[0], v1[1], v1[2]) ) * alpha}
	 * 
	 * @param v1
	 *     The first vector as an array with at least three entries.
	 * @param v2
	 *     The second vector as an array with at least three entries.
	 * @param alpha
	 *     The interpolator in range of 0.0 to 1.0.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] fastLerp(@MinLength(3) float[] v1, @MinLength(3) float[] v2, float alpha,
			@ExtractionParam @MinLength(3) float[] res)
	{
		return fastLerp(v1[0], v1[1], v1[2], v2[0], v2[1], v2[2], alpha, res);
	}
	
	/**
	 * Performs a fast linear interpolation between the given tuple {@code (v1[0], v1[1], v1[2])}
	 * and the given tuple {@code (v2x, v2y, v2z)} and saves the result in the given extraction
	 * parameter. This sacrifices for reduced calculations the precision and the applicability. The
	 * interpolation happens over the interpolator value alpha in the range of 0.0 to 1.0.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1], v1[2]) + ( (v2x, v2y, v2z) - (v1[0], v1[1], v1[2]) ) * alpha}
	 * 
	 * @param v1
	 *     The first vector as an array with at least three entries.
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * @param v2z
	 *     The value of the z component of the second vector.
	 * @param alpha
	 *     The interpolator in range of 0.0 to 1.0.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] fastLerp(@MinLength(3) float[] v1, float v2x, float v2y, float v2z, float alpha,
			@ExtractionParam @MinLength(3) float[] res)
	{
		return fastLerp(v1[0], v1[1], v1[2], v2x, v2y, v2z, alpha, res);
	}
	
	/**
	 * Performs a fast linear interpolation between the given tuple {@code (v1x, v1y, v1z)} and the
	 * given tuple {@code (v2)} and saves the result in the given extraction parameter. This
	 * sacrifices for reduced calculations the precision and the applicability. The interpolation
	 * happens over the interpolator value alpha in the range of 0.0 to 1.0.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y, v1z) + ( v2 - (v1x, v1y, v1z) ) * alpha}
	 * 
	 * @param v1x
	 *     The value of the x component of the first vector.
	 * @param v1y
	 *     The value of the y component of the first vector.
	 * @param v1z
	 *     The value of the z component of the first vector.
	 * @param v2
	 *     The second vector.
	 * @param alpha
	 *     The interpolator in range of 0.0 to 1.0.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] fastLerp(float v1x, float v1y, float v1z, Tup3fR v2, float alpha,
			@ExtractionParam @MinLength(3) float[] res)
	{
		return fastLerp(v1x, v1y, v1z, v2.v0(), v2.v1(), v2.v2(), alpha, res);
	}
	
	/**
	 * Performs a fast linear interpolation between the given tuple {@code (v1x, v1y, v1z)} and the
	 * given tuple {@code (v2[0], v2[1], v2[2])} and saves the result in the given extraction
	 * parameter. This sacrifices for reduced calculations the precision and the applicability. The
	 * interpolation happens over the interpolator value alpha in the range of 0.0 to 1.0.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y, v1z) + ( (v2[0], v2[1], v2[2]) - (v1x, v1y, v1z) ) * alpha}
	 * 
	 * @param v1x
	 *     The value of the x component of the first vector.
	 * @param v1y
	 *     The value of the y component of the first vector.
	 * @param v1z
	 *     The value of the z component of the first vector.
	 * @param v2
	 *     The second vector as an array with at least three entries.
	 * @param alpha
	 *     The interpolator in range of 0.0 to 1.0.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] fastLerp(float v1x, float v1y, float v1z, @MinLength(3) float[] v2, float alpha,
			@ExtractionParam @MinLength(3) float[] res)
	{
		return fastLerp(v1x, v1y, v1z, v2[0], v2[1], v2[2], alpha, res);
	}
	
	/**
	 * Performs a fast linear interpolation between the given tuple {@code (v1x, v1y, v1z)} and the
	 * given tuple {@code (v2x, v2y, v2z)} and saves the result in the given extraction parameter.
	 * This sacrifices for reduced calculations the precision and the applicability. The
	 * interpolation happens over the interpolator value alpha in the range of 0.0 to 1.0.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y, v1z) + ( (v2x, v2y, v2z) - (v1x, v1y, v1z) ) * alpha}
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
	 * @param alpha
	 *     The interpolator in range of 0.0 to 1.0.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] fastLerp(float v1x, float v1y, float v1z, float v2x, float v2y, float v2z, float alpha,
			@ExtractionParam @MinLength(3) float[] res)
	{
		if (alpha == 0.0f)
		{
			res[0] = v1x;
			res[1] = v1y;
			res[2] = v1z;
			
			return res;
		}
		
		if (alpha == 1.0f)
		{
			res[0] = v2x;
			res[1] = v2y;
			res[2] = v2z;
			
			return res;
		}
		
		res[0] = v1x + alpha * (v2x - v1x);
		res[1] = v1y + alpha * (v2y - v1y);
		res[2] = v1z + alpha * (v2z - v1z);
		
		return res;
	}
	
	/**
	 * Performs a fast linear interpolation between the given tuple {@code (v1)} and the given tuple
	 * {@code (v2)} and saves the result in the given extraction parameter object. This sacrifices
	 * for reduced calculations the precision and the applicability. The interpolation happens over
	 * the interpolator value alpha in the range of 0.0 to 1.0.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 + ( v2 - v1 ) * alpha}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1
	 *     The first vector.
	 * @param v2
	 *     The second vector.
	 * @param alpha
	 *     The interpolator in range of 0.0 to 1.0.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3fC> T fastLerp(Tup3fR v1, Tup3fR v2, float alpha, @ExtractionParam T res)
	{
		return fastLerp(v1.v0(), v1.v1(), v1.v2(), v2.v0(), v2.v1(), v2.v2(), alpha, res);
	}
	
	/**
	 * Performs a fast linear interpolation between the given tuple {@code (v1)} and the given tuple
	 * {@code (v2[0], v2[1], v2[2])} and saves the result in the given extraction parameter object.
	 * This sacrifices for reduced calculations the precision and the applicability. The
	 * interpolation happens over the interpolator value alpha in the range of 0.0 to 1.0.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 + ( (v2[0], v2[1], v2[2]) - v1 ) * alpha}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1
	 *     The first vector.
	 * @param v2
	 *     The second vector as an array with at least three entries.
	 * @param alpha
	 *     The interpolator in range of 0.0 to 1.0.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3fC> T fastLerp(Tup3fR v1, @MinLength(3) float[] v2, float alpha,
			@ExtractionParam T res)
	{
		return fastLerp(v1.v0(), v1.v1(), v1.v2(), v2[0], v2[1], v2[2], alpha, res);
	}
	
	/**
	 * Performs a fast linear interpolation between the given tuple {@code (v1)} and the given tuple
	 * {@code (v2x, v2y, v2z)} and saves the result in the given extraction parameter object. This
	 * sacrifices for reduced calculations the precision and the applicability. The interpolation
	 * happens over the interpolator value alpha in the range of 0.0 to 1.0.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 + ( (v2x, v2y, v2z) - v1 ) * alpha}
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
	 * @param alpha
	 *     The interpolator in range of 0.0 to 1.0.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3fC> T fastLerp(Tup3fR v1, float v2x, float v2y, float v2z, float alpha,
			@ExtractionParam T res)
	{
		return fastLerp(v1.v0(), v1.v1(), v1.v2(), v2x, v2y, v2z, alpha, res);
	}
	
	/**
	 * Performs a fast linear interpolation between the given tuple {@code (v1[0], v1[1], v1[2])}
	 * and the given tuple {@code (v2)} and saves the result in the given extraction parameter
	 * object. This sacrifices for reduced calculations the precision and the applicability. The
	 * interpolation happens over the interpolator value alpha in the range of 0.0 to 1.0.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1], v1[2]) + ( v2 - (v1[0], v1[1], v1[2]) ) * alpha}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1
	 *     The first vector as an array with at least three entries.
	 * @param v2
	 *     The second vector.
	 * @param alpha
	 *     The interpolator in range of 0.0 to 1.0.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3fC> T fastLerp(@MinLength(3) float[] v1, Tup3fR v2, float alpha,
			@ExtractionParam T res)
	{
		return fastLerp(v1[0], v1[1], v1[2], v2.v0(), v2.v1(), v2.v2(), alpha, res);
	}
	
	/**
	 * Performs a fast linear interpolation between the given tuple {@code (v1[0], v1[1], v1[2])}
	 * and the given tuple {@code (v2[0], v2[1], v2[2])} and saves the result in the given
	 * extraction parameter object. This sacrifices for reduced calculations the precision and the
	 * applicability. The interpolation happens over the interpolator value alpha in the range of
	 * 0.0 to 1.0.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1], v1[2]) + ( (v2[0], v2[1], v2[2]) - (v1[0], v1[1], v1[2]) ) * alpha}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1
	 *     The first vector as an array with at least three entries.
	 * @param v2
	 *     The second vector as an array with at least three entries.
	 * @param alpha
	 *     The interpolator in range of 0.0 to 1.0.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3fC> T fastLerp(@MinLength(3) float[] v1, @MinLength(3) float[] v2, float alpha,
			@ExtractionParam T res)
	{
		return fastLerp(v1[0], v1[1], v1[2], v2[0], v2[1], v2[2], alpha, res);
	}
	
	/**
	 * Performs a fast linear interpolation between the given tuple {@code (v1[0], v1[1], v1[2])}
	 * and the given tuple {@code (v2x, v2y, v2z)} and saves the result in the given extraction
	 * parameter object. This sacrifices for reduced calculations the precision and the
	 * applicability. The interpolation happens over the interpolator value alpha in the range of
	 * 0.0 to 1.0.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1], v1[2]) + ( (v2x, v2y, v2z) - (v1[0], v1[1], v1[2]) ) * alpha}
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
	 * @param alpha
	 *     The interpolator in range of 0.0 to 1.0.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3fC> T fastLerp(@MinLength(3) float[] v1, float v2x, float v2y, float v2z, float alpha,
			@ExtractionParam T res)
	{
		return fastLerp(v1[0], v1[1], v1[2], v2x, v2y, v2z, alpha, res);
	}
	
	/**
	 * Performs a fast linear interpolation between the given tuple {@code (v1x, v1y, v1z)} and the
	 * given tuple {@code (v2)} and saves the result in the given extraction parameter object. This
	 * sacrifices for reduced calculations the precision and the applicability. The interpolation
	 * happens over the interpolator value alpha in the range of 0.0 to 1.0.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y, v1z) + ( v2 - (v1x, v1y, v1z) ) * alpha}
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
	 * @param alpha
	 *     The interpolator in range of 0.0 to 1.0.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3fC> T fastLerp(float v1x, float v1y, float v1z, Tup3fR v2, float alpha,
			@ExtractionParam T res)
	{
		return fastLerp(v1x, v1y, v1z, v2.v0(), v2.v1(), v2.v2(), alpha, res);
	}
	
	/**
	 * Performs a fast linear interpolation between the given tuple {@code (v1x, v1y, v1z)} and the
	 * given tuple {@code (v2[0], v2[1], v2[2])} and saves the result in the given extraction
	 * parameter object. This sacrifices for reduced calculations the precision and the
	 * applicability. The interpolation happens over the interpolator value alpha in the range of
	 * 0.0 to 1.0.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y, v1z) + ( (v2[0], v2[1], v2[2]) - (v1x, v1y, v1z) ) * alpha}
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
	 * @param alpha
	 *     The interpolator in range of 0.0 to 1.0.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3fC> T fastLerp(float v1x, float v1y, float v1z, @MinLength(3) float[] v2, float alpha,
			@ExtractionParam T res)
	{
		return fastLerp(v1x, v1y, v1z, v2[0], v2[1], v2[2], alpha, res);
	}
	
	/**
	 * Performs a fast linear interpolation between the given tuple {@code (v1x, v1y, v1z)} and the
	 * given tuple {@code (v2x, v2y, v2z)} and saves the result in the given extraction parameter
	 * object. This sacrifices for reduced calculations the precision and the applicability. The
	 * interpolation happens over the interpolator value alpha in the range of 0.0 to 1.0.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y, v1z) + ( (v2x, v2y, v2z) - (v1x, v1y, v1z) ) * alpha}
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
	 * @param alpha
	 *     The interpolator in range of 0.0 to 1.0.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup3fC> T fastLerp(float v1x, float v1y, float v1z, float v2x, float v2y, float v2z,
			float alpha, @ExtractionParam T res)
	{
		if (alpha == 0.0f)
		{
			res.set(v1x, v1y, v1z);
			
			return res;
		}
		
		if (alpha == 1.0f)
		{
			res.set(v2x, v2y, v2z);
			
			return res;
		}
		
		res.set(v1x + alpha * (v2x - v1x), v1y + alpha * (v2y - v1y), v1z + alpha * (v2z - v1z));
		
		return res;
	}
	
	/**
	 * Performs a fast linear interpolation between the given tuple {@code (v1)} and the given tuple
	 * {@code (v2)}, supplies the result to the given implementation of the functional interface and
	 * returns the result of that implementation. This sacrifices for reduced calculations the
	 * precision and the applicability. The interpolation happens over the interpolator value alpha
	 * in the range of 0.0 to 1.0.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 + ( v2 - v1 ) * alpha}
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v1
	 *     The first vector.
	 * @param v2
	 *     The second vector.
	 * @param alpha
	 *     The interpolator in range of 0.0 to 1.0.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T fastLerpFunc(Tup3fR v1, Tup3fR v2, float alpha, FloatTriFunction<T> res)
	{
		return fastLerpFunc(v1.v0(), v1.v1(), v1.v2(), v2.v0(), v2.v1(), v2.v2(), alpha, res);
	}
	
	/**
	 * Performs a fast linear interpolation between the given tuple {@code (v1)} and the given tuple
	 * {@code (v2[0], v2[1], v2[2])}, supplies the result to the given implementation of the
	 * functional interface and returns the result of that implementation. This sacrifices for
	 * reduced calculations the precision and the applicability. The interpolation happens over the
	 * interpolator value alpha in the range of 0.0 to 1.0.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 + ( (v2[0], v2[1], v2[2]) - v1 ) * alpha}
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v1
	 *     The first vector.
	 * @param v2
	 *     The second vector as an array with at least three entries.
	 * @param alpha
	 *     The interpolator in range of 0.0 to 1.0.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T fastLerpFunc(Tup3fR v1, @MinLength(3) float[] v2, float alpha, FloatTriFunction<T> res)
	{
		return fastLerpFunc(v1.v0(), v1.v1(), v1.v2(), v2[0], v2[1], v2[2], alpha, res);
	}
	
	/**
	 * Performs a fast linear interpolation between the given tuple {@code (v1)} and the given tuple
	 * {@code (v2x, v2y, v2z)}, supplies the result to the given implementation of the functional
	 * interface and returns the result of that implementation. This sacrifices for reduced
	 * calculations the precision and the applicability. The interpolation happens over the
	 * interpolator value alpha in the range of 0.0 to 1.0.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 + ( (v2x, v2y, v2z) - v1 ) * alpha}
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
	 * @param v2z
	 *     The value of the z component of the second vector.
	 * @param alpha
	 *     The interpolator in range of 0.0 to 1.0.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T fastLerpFunc(Tup3fR v1, float v2x, float v2y, float v2z, float alpha, FloatTriFunction<T> res)
	{
		return fastLerpFunc(v1.v0(), v1.v1(), v1.v2(), v2x, v2y, v2z, alpha, res);
	}
	
	/**
	 * Performs a fast linear interpolation between the given tuple {@code (v1[0], v1[1], v1[2])}
	 * and the given tuple {@code (v2)}, supplies the result to the given implementation of the
	 * functional interface and returns the result of that implementation. This sacrifices for
	 * reduced calculations the precision and the applicability. The interpolation happens over the
	 * interpolator value alpha in the range of 0.0 to 1.0.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1], v1[2]) + ( v2 - (v1[0], v1[1], v1[2]) ) * alpha}
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v1
	 *     The first vector as an array with at least three entries.
	 * @param v2
	 *     The second vector.
	 * @param alpha
	 *     The interpolator in range of 0.0 to 1.0.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T fastLerpFunc(@MinLength(3) float[] v1, Tup3fR v2, float alpha, FloatTriFunction<T> res)
	{
		return fastLerpFunc(v1[0], v1[1], v1[2], v2.v0(), v2.v1(), v2.v2(), alpha, res);
	}
	
	/**
	 * Performs a fast linear interpolation between the given tuple {@code (v1[0], v1[1], v1[2])}
	 * and the given tuple {@code (v2[0], v2[1], v2[2])}, supplies the result to the given
	 * implementation of the functional interface and returns the result of that implementation.
	 * This sacrifices for reduced calculations the precision and the applicability. The
	 * interpolation happens over the interpolator value alpha in the range of 0.0 to 1.0.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1], v1[2]) + ( (v2[0], v2[1], v2[2]) - (v1[0], v1[1], v1[2]) ) * alpha}
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v1
	 *     The first vector as an array with at least three entries.
	 * @param v2
	 *     The second vector as an array with at least three entries.
	 * @param alpha
	 *     The interpolator in range of 0.0 to 1.0.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T fastLerpFunc(@MinLength(3) float[] v1, @MinLength(3) float[] v2, float alpha,
			FloatTriFunction<T> res)
	{
		return fastLerpFunc(v1[0], v1[1], v1[2], v2[0], v2[1], v2[2], alpha, res);
	}
	
	/**
	 * Performs a fast linear interpolation between the given tuple {@code (v1[0], v1[1], v1[2])}
	 * and the given tuple {@code (v2x, v2y, v2z)}, supplies the result to the given implementation
	 * of the functional interface and returns the result of that implementation. This sacrifices
	 * for reduced calculations the precision and the applicability. The interpolation happens over
	 * the interpolator value alpha in the range of 0.0 to 1.0.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1], v1[2]) + ( (v2x, v2y, v2z) - (v1[0], v1[1], v1[2]) ) * alpha}
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v1
	 *     The first vector as an array with at least three entries.
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * @param v2z
	 *     The value of the z component of the second vector.
	 * @param alpha
	 *     The interpolator in range of 0.0 to 1.0.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T fastLerpFunc(@MinLength(3) float[] v1, float v2x, float v2y, float v2z, float alpha,
			FloatTriFunction<T> res)
	{
		return fastLerpFunc(v1[0], v1[1], v1[2], v2x, v2y, v2z, alpha, res);
	}
	
	/**
	 * Performs a fast linear interpolation between the given tuple {@code (v1x, v1y, v1z)} and the
	 * given tuple {@code (v2)}, supplies the result to the given implementation of the functional
	 * interface and returns the result of that implementation. This sacrifices for reduced
	 * calculations the precision and the applicability. The interpolation happens over the
	 * interpolator value alpha in the range of 0.0 to 1.0.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y, v1z) + ( v2 - (v1x, v1y, v1z) ) * alpha}
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v1x
	 *     The value of the x component of the first vector.
	 * @param v1y
	 *     The value of the y component of the first vector.
	 * @param v1z
	 *     The value of the z component of the first vector.
	 * @param v2
	 *     The second vector.
	 * @param alpha
	 *     The interpolator in range of 0.0 to 1.0.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T fastLerpFunc(float v1x, float v1y, float v1z, Tup3fR v2, float alpha, FloatTriFunction<T> res)
	{
		return fastLerpFunc(v1x, v1y, v1z, v2.v0(), v2.v1(), v2.v2(), alpha, res);
	}
	
	/**
	 * Performs a fast linear interpolation between the given tuple {@code (v1x, v1y, v1z)} and the
	 * given tuple {@code (v2[0], v2[1], v2[2])}, supplies the result to the given implementation of
	 * the functional interface and returns the result of that implementation. This sacrifices for
	 * reduced calculations the precision and the applicability. The interpolation happens over the
	 * interpolator value alpha in the range of 0.0 to 1.0.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y, v1z) + ( (v2[0], v2[1], v2[2]) - (v1x, v1y, v1z) ) * alpha}
	 * 
	 * @param <T>
	 *     The type of the result object.
	 * 
	 * @param v1x
	 *     The value of the x component of the first vector.
	 * @param v1y
	 *     The value of the y component of the first vector.
	 * @param v1z
	 *     The value of the z component of the first vector.
	 * @param v2
	 *     The second vector as an array with at least three entries.
	 * @param alpha
	 *     The interpolator in range of 0.0 to 1.0.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T fastLerpFunc(float v1x, float v1y, float v1z, @MinLength(3) float[] v2, float alpha,
			FloatTriFunction<T> res)
	{
		return fastLerpFunc(v1x, v1y, v1z, v2[0], v2[1], v2[2], alpha, res);
	}
	
	/**
	 * Performs a fast linear interpolation between the given tuple {@code (v1x, v1y, v1z)} and the
	 * given tuple {@code (v2x, v2y, v2z)}, supplies the result to the given implementation of the
	 * functional interface and returns the result of that implementation. This sacrifices for
	 * reduced calculations the precision and the applicability. The interpolation happens over the
	 * interpolator value alpha in the range of 0.0 to 1.0.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y, v1z) + ( (v2x, v2y, v2z) - (v1x, v1y, v1z) ) * alpha}
	 * 
	 * @param <T>
	 *     The type of the result object.
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
	 * @param alpha
	 *     The interpolator in range of 0.0 to 1.0.
	 * @param res
	 *     A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	public static <T> T fastLerpFunc(float v1x, float v1y, float v1z, float v2x, float v2y, float v2z, float alpha,
			FloatTriFunction<T> res)
	{
		if (alpha == 0.0f)
		{
			return res.apply(v1x, v1y, v1z);
		}
		
		if (alpha == 1.0f)
		{
			return res.apply(v2x, v2y, v2z);
		}
		
		return res.apply(v1x + alpha * (v2x - v1x), v1y + alpha * (v2y - v1y), v1z + alpha * (v2z - v1z));
	}
}
