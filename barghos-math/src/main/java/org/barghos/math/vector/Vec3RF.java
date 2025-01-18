package org.barghos.math.vector;

import org.barghos.annotation.ExtractionParam;
import org.barghos.annotation.FloatMinValue;
import org.barghos.annotation.MinLength;
import org.barghos.annotation.MinLength2d;
import org.barghos.math.quaternion.SimpleQuatfR;
import org.barghos.util.collection.IndexValuePairF;
import org.barghos.util.math.RoundMethodF;
import org.barghos.util.math.MathProvider;
import org.barghos.util.tuple.floats.Tup3RF;
import org.barghos.util.tuple.floats.Tup3WF;
import org.barghos.util.tuple.floats.Tup4RF;

/**
 * This interface provides non-invasive (read only) functions and methods for float vectors with
 * three dimensions.
 */
public interface Vec3RF extends Tup3RF
{
	
	/** {@inheritDoc} */
	@Override
	Vec3RF createNew(Tup3RF v);
	
	/** {@inheritDoc} */
	@Override
	Vec3RF createNew(@MinLength(3) float... v);
	
	/** {@inheritDoc} */
	@Override
	Vec3RF createNew(float value);
	
	/** {@inheritDoc} */
	@Override
	Vec3RF createNew(float x, float y, float z);
	
	/** {@inheritDoc} */
	@Override
	Vec3RF copy();
	
	/**
	 * Returns the length (magnitude, norm) of this vector.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |v|}
	 * 
	 * @return The length of this vector.
	 */
	float length();
	
	/**
	 * Returns the length (magnitude, norm) of this vector.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |v|}
	 * 
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * 
	 * @return The length of this vector.
	 */
	float length(MathProvider mathProvider);
	
	/**
	 * Returns the length (magnitude, norm) of this vector.
	 * 
	 * <p>
	 * If all the component values are within the given inclusive margin around zero defined by
	 * {@code tolerance}, the length will be zero. This allows to account for floating point
	 * precision errors.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |v|}
	 * 
	 * @param tolerance
	 *     The inclusive margin around zero to still count as zero.
	 * 
	 * @return The length of this vector.
	 * 
	 * @throws IllegalArgumentException
	 *     If the given {@code tolerance} is below zero.
	 */
	float length(@FloatMinValue(0.0f) float tolerance);
	
	/**
	 * Returns the length (magnitude, norm) of this vector.
	 * 
	 * <p>
	 * If all the component values are within the given inclusive margin around zero defined by
	 * {@code tolerance}, the length will be zero. This allows to account for floating point
	 * precision errors.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |v|}
	 * 
	 * @param tolerance
	 *     The inclusive margin around zero to still count as zero.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * 
	 * @return The length of this vector.
	 * 
	 * @throws IllegalArgumentException
	 *     If the given {@code tolerance} is below zero.
	 */
	float length(@FloatMinValue(0.0f) float tolerance, MathProvider mathProvider);
	
	/**
	 * Returns the inverse (reciprocal) length (magnitude, norm) of this vector. If the length of
	 * this vector is zero, an {@link ArithmeticException} is thrown.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code 1 / |v|}
	 * 
	 * @return The inverse length of this vector.
	 * 
	 * @throws ArithmeticException
	 *     If the vector has a length of zero.
	 */
	float inverseLength();
	
	/**
	 * Returns the inverse (reciprocal) length (magnitude, norm) of this vector. If the length of
	 * this vector is zero, an {@link ArithmeticException} is thrown.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code 1 / |v|}
	 * 
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * 
	 * @return The inverse length of this vector.
	 * 
	 * @throws ArithmeticException
	 *     If the vector has a length of zero.
	 */
	float inverseLength(MathProvider mathProvider);
	
	/**
	 * Returns the distance between the endpoint of this vector and the endpoint of the given vector
	 * {@code (v2)}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |v2 - v|}
	 * 
	 * @param v2
	 *     The second vector.
	 * 
	 * @return The distance between the endpoint of this vector and the endpoint of the given
	 * vector.
	 */
	float distanceTo(Tup3RF v2);
	
	/**
	 * Returns the distance between the endpoint of this vector and the endpoint of the given vector
	 * {@code (v2)}.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |v2 - v|}
	 * 
	 * @param v2
	 *     The second vector.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * 
	 * @return The distance between the endpoint of this vector and the endpoint of the given
	 * vector.
	 */
	float distanceTo(Tup3RF v2, MathProvider mathProvider);
	
	/**
	 * Returns the distance between the endpoint of this vector and the endpoint of the given vector
	 * {@code (v2)}.
	 * 
	 * <p>
	 * If the distance is less or equal to the given inclusive {@code tolerance} the distance will
	 * be zero. This allows to account for floating point precision errors.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |v2 - v|}
	 * 
	 * @param v2
	 *     The second vector.
	 * @param tolerance
	 *     The inclusive margin around zero to still count as zero.
	 * 
	 * @return The distance between the endpoint of this vector and the endpoint of the given
	 * vector.
	 * 
	 * @throws IllegalArgumentException
	 *     If the given {@code tolerance} is below zero.
	 */
	float distanceTo(Tup3RF v2, @FloatMinValue(0.0f) float tolerance);
	
	/**
	 * Returns the distance between the endpoint of this vector and the endpoint of the given vector
	 * {@code (v2)}.
	 * 
	 * <p>
	 * If the distance is less or equal to the given inclusive {@code tolerance} the distance will
	 * be zero. This allows to account for floating point precision errors.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |v2 - v|}
	 * 
	 * @param v2
	 *     The second vector.
	 * @param tolerance
	 *     The inclusive margin around zero to still count as zero.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * 
	 * @return The distance between the endpoint of this vector and the endpoint of the given
	 * vector.
	 * 
	 * @throws IllegalArgumentException
	 *     If the given {@code tolerance} is below zero.
	 */
	float distanceTo(Tup3RF v2, @FloatMinValue(0.0f) float tolerance, MathProvider mathProvider);
	
	/**
	 * Returns the distance between the endpoint of this vector and the endpoint of the given vector
	 * {@code (v2[0], v2[1], v2[2])}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(v2[0], v2[1], v2[2]) - v|}
	 * 
	 * @param v2
	 *     The second vector as an array with at least three entries.
	 * 
	 * @return The distance between the endpoint of this vector and the endpoint of the given
	 * vector.
	 */
	float distanceTo(@MinLength(3) float[] v2);
	
	/**
	 * Returns the distance between the endpoint of this vector and the endpoint of the given vector
	 * {@code (v2[0], v2[1], v2[2])}.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(v2[0], v2[1], v2[2]) - v|}
	 * 
	 * @param v2
	 *     The second vector as an array with at least three entries.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * 
	 * @return The distance between the endpoint of this vector and the endpoint of the given
	 * vector.
	 */
	float distanceTo(@MinLength(3) float[] v2, MathProvider mathProvider);
	
	/**
	 * Returns the distance between the endpoint of this vector and the endpoint of the given vector
	 * {@code (v2[0], v2[1], v2[2])}.
	 * 
	 * <p>
	 * If the distance is less or equal to the given inclusive {@code tolerance} the distance will
	 * be zero. This allows to account for floating point precision errors.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(v2[0], v2[1], v2[2]) - v|}
	 * 
	 * @param v2
	 *     The second vector as an array with at least three entries.
	 * @param tolerance
	 *     The inclusive margin around zero to still count as zero.
	 * 
	 * @return The distance between the endpoint of this vector and the endpoint of the given
	 * vector.
	 * 
	 * @throws IllegalArgumentException
	 *     If the given {@code tolerance} is below zero.
	 */
	float distanceTo(@MinLength(3) float[] v2, @FloatMinValue(0.0f) float tolerance);
	
	/**
	 * Returns the distance between the endpoint of this vector and the endpoint of the given vector
	 * {@code (v2[0], v2[1], v2[2])}.
	 * 
	 * <p>
	 * If the distance is less or equal to the given inclusive {@code tolerance} the distance will
	 * be zero. This allows to account for floating point precision errors.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(v2[0], v2[1], v2[2]) - v|}
	 * 
	 * @param v2
	 *     The second vector as an array with at least three entries.
	 * @param tolerance
	 *     The inclusive margin around zero to still count as zero.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * 
	 * @return The distance between the endpoint of this vector and the endpoint of the given
	 * vector.
	 * 
	 * @throws IllegalArgumentException
	 *     If the given {@code tolerance} is below zero.
	 */
	float distanceTo(@MinLength(2) float[] v2, @FloatMinValue(0.0f) float tolerance, MathProvider mathProvider);
	
	/**
	 * Returns the distance between the endpoint of this vector and the endpoint of the given vector
	 * {@code (v2x, v2y, v2z)}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(v2x, v2y, v2z) - v|}
	 * 
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * @param v2z
	 *     The value of the z component of the second vector.
	 * 
	 * @return The distance between the endpoint of this vector and the endpoint of the given
	 * vector.
	 */
	float distanceTo(float v2x, float v2y, float v2z);
	
	/**
	 * Returns the distance between the endpoint of this vector and the endpoint of the given vector
	 * {@code (v2x, v2y, v2z)}.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(v2x, v2y, v2z) - v|}
	 * 
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * @param v2z
	 *     The value of the z component of the second vector.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * 
	 * @return The distance between the endpoint of this vector and the endpoint of the given
	 * vector.
	 */
	float distanceTo(float v2x, float v2y, float v2z, MathProvider mathProvider);
	
	/**
	 * Returns the distance between the endpoint of this vector and the endpoint of the given vector
	 * {@code (v2x, v2y, v2z)}.
	 * 
	 * <p>
	 * If the distance is less or equal to the given inclusive {@code tolerance} the distance will
	 * be zero. This allows to account for floating point precision errors.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(v2x, v2y, v2z) - v|}
	 * 
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * @param v2z
	 *     The value of the z component of the second vector.
	 * @param tolerance
	 *     The inclusive margin around zero to still count as zero.
	 * 
	 * @return The distance between the endpoint of this vector and the endpoint of the given
	 * vector.
	 * 
	 * @throws IllegalArgumentException
	 *     If the given {@code tolerance} is below zero.
	 */
	float distanceTo(float v2x, float v2y, float v2z, @FloatMinValue(0.0f) float tolerance);
	
	/**
	 * Returns the distance between the endpoint of this vector and the endpoint of the given vector
	 * {@code (v2x, v2y, v2z)}.
	 * 
	 * <p>
	 * If the distance is less or equal to the given inclusive {@code tolerance} the distance will
	 * be zero. This allows to account for floating point precision errors.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(v2x, v2y, v2z) - v|}
	 * 
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * @param v2z
	 *     The value of the z component of the second vector.
	 * @param tolerance
	 *     The inclusive margin around zero to still count as zero.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * 
	 * @return The distance between the endpoint of this vector and the endpoint of the given
	 * vector.
	 * 
	 * @throws IllegalArgumentException
	 *     If the given {@code tolerance} is below zero.
	 */
	float distanceTo(float v2x, float v2y, float v2z, @FloatMinValue(0.0f) float tolerance, MathProvider mathProvider);
	
	/**
	 * Returns the inverse (reciprocal) distance between the endpoint of this vector and the
	 * endpoint of the given vector {@code (v2)}. If the distance is zero an
	 * {@link ArithmeticException} is thrown.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code 1 / |v2 - v|}
	 * 
	 * @param v2
	 *     The second vector.
	 * 
	 * @return The inverse distance between the endpoint of this vector and the endpoint of the
	 * given vector.
	 * 
	 * @throws ArithmeticException
	 *     If the distance between the endpoints is zero.
	 */
	float inverseDistanceTo(Tup3RF v2);
	
	/**
	 * Returns the inverse (reciprocal) distance between the endpoint of this vector and the
	 * endpoint of the given vector {@code (v2)}. If the distance is zero an
	 * {@link ArithmeticException} is thrown.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code 1 / |v2 - v|}
	 * 
	 * @param v2
	 *     The second vector.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * 
	 * @return The inverse distance between the endpoint of this vector and the endpoint of the
	 * given vector.
	 * 
	 * @throws ArithmeticException
	 *     If the distance between the endpoints is zero.
	 */
	float inverseDistanceTo(Tup3RF v2, MathProvider mathProvider);
	
	/**
	 * Returns the inverse (reciprocal) distance between the endpoint of this vector and the
	 * endpoint of the given vector {@code (v2[0], v2[1], v2[2])}. If the distance is zero an
	 * {@link ArithmeticException} is thrown.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code 1 / |(v2[0], v2[1], v2[2]) - v|}
	 * 
	 * @param v2
	 *     The second vector as an array with at least three entries.
	 * 
	 * @return The inverse distance between the endpoint of this vector and the endpoint of the
	 * given vector.
	 * 
	 * @throws ArithmeticException
	 *     If the distance between the endpoints is zero.
	 */
	float inverseDistanceTo(@MinLength(3) float[] v2);
	
	/**
	 * Returns the inverse (reciprocal) distance between the endpoint of this vector and the
	 * endpoint of the given vector {@code (v2[0], v2[1], v2[2])}. If the distance is zero an
	 * {@link ArithmeticException} is thrown.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code 1 / |(v2[0], v2[1], v2[2]) - v|}
	 * 
	 * @param v2
	 *     The second vector as an array with at least three entries.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * 
	 * @return The inverse distance between the endpoint of this vector and the endpoint of the
	 * given vector.
	 * 
	 * @throws ArithmeticException
	 *     If the distance between the endpoints is zero.
	 */
	float inverseDistanceTo(@MinLength(3) float[] v2, MathProvider mathProvider);
	
	/**
	 * Returns the inverse (reciprocal) distance between the endpoint of this vector and the
	 * endpoint of the given vector {@code (v2x, v2y, v2z)}. If the distance is zero an
	 * {@link ArithmeticException} is thrown.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code 1 / |(v2x, v2y, v2z) - v|}
	 * 
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * @param v2z
	 *     The value of the z component of the second vector.
	 * 
	 * @return The inverse distance between the endpoint of this vector and the endpoint of the
	 * given vector.
	 * 
	 * @throws ArithmeticException
	 *     If the distance between the endpoints is zero.
	 */
	float inverseDistanceTo(float v2x, float v2y, float v2z);
	
	/**
	 * Returns the inverse (reciprocal) distance between the endpoint of this vector and the
	 * endpoint of the given vector {@code (v2x, v2y, v2z)}. If the distance is zero an
	 * {@link ArithmeticException} is thrown.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code 1 / |(v2x, v2y, v2z) - v|}
	 * 
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * @param v2z
	 *     The value of the z component of the second vector.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * 
	 * @return The inverse distance between the endpoint of this vector and the endpoint of the
	 * given vector.
	 * 
	 * @throws ArithmeticException
	 *     If the distance between the endpoints is zero.
	 */
	float inverseDistanceTo(float v2x, float v2y, float v2z, MathProvider mathProvider);
	
	/**
	 * Returns the squared length (magnitude, norm) of this vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |v|^2}
	 * 
	 * @return The squared length of this vector.
	 */
	float squaredLength();
	
	/**
	 * Returns the squared distance between the endpoint of this vector and the endpoint of the
	 * given vector {@code (v2)}.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |v2 - v|^2}
	 * 
	 * @param v2
	 *     The second vector.
	 * 
	 * @return The squared distance between the endpoint of this vector and the endpoint of the
	 * given vector.
	 */
	float squaredDistanceTo(Tup3RF v2);
	
	/**
	 * Returns the squared distance between the endpoint of this vector and the endpoint of the
	 * given vector {@code (v2[0], v2[1], v2[2])}.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(v2[0], v2[1], v2[2]) - v|^2}
	 * 
	 * @param v2
	 *     The second vector as an array with at least three entries.
	 * 
	 * @return The squared distance between the endpoint of this vector and the endpoint of the
	 * given vector.
	 */
	float squaredDistanceTo(@MinLength(3) float[] v2);
	
	/**
	 * Returns the squared distance between the endpoint of this vector and the endpoint of the
	 * given vector {@code (v2x, v2y, v2z)}.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(v2x, v2y, v2z) - v|^2}
	 * 
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * @param v2z
	 *     The value of the z component of the second vector.
	 * 
	 * @return The squared distance between the endpoint of this vector and the endpoint of the
	 * given vector.
	 */
	float squaredDistanceTo(float v2x, float v2y, float v2z);
	
	/**
	 * Returns the dot product (scalar product) between this vector and the given vector
	 * {@code (v2)}.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v . v2}
	 * 
	 * @param v2
	 *     The second vector.
	 * 
	 * @return The dot product.
	 */
	float dot(Tup3RF v2);
	
	/**
	 * Returns the dot product (scalar product) between this vector and the given vector
	 * {@code (v2[0], v2[1], v2[2])}.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v . (v2[0], v2[1], v2[2])}
	 * 
	 * @param v2
	 *     The second vector as an array with at least three entries.
	 * 
	 * @return The dot product.
	 */
	float dot(@MinLength(3) float[] v2);
	
	/**
	 * Returns the dot product (scalar product) between this vector and the given vector
	 * {@code (v2x, v2y, v2z)}.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v . (v2x, v2y, v2z)}
	 * 
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * @param v2z
	 *     The value of the z component of the second vector.
	 * 
	 * @return The dot product.
	 */
	float dot(float v2x, float v2y, float v2z);
	
	/**
	 * Adds the given vector {@code (v2)} to this vector and saves the result in a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v + v2}
	 * 
	 * @param v2
	 *     The vector to add to this vector.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	Vec3RF addN(Tup3RF v2);
	
	/**
	 * Adds the given vector {@code (v2[0], v2[1], v2[2])} to this vector and saves the result in a
	 * new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v + (v2[0], v2[1], v2[2])}
	 * 
	 * @param v2
	 *     The vector to add to this vector as an array with at least three entries.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	Vec3RF addN(@MinLength(3) float[] v2);
	
	/**
	 * Adds the given value {@code (value)} to every component of this vector and saves the result
	 * in a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v + (value, value, value)}
	 * 
	 * @param value
	 *     The value to add to this vector.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	Vec3RF addN(float value);
	
	/**
	 * Adds the given vector {@code (v2x, v2y, v2z)} to this vector and saves the result in a new
	 * instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v + (v2x, v2y, v2z)}
	 * 
	 * @param v2x
	 *     The value of the x component to add to this vector.
	 * @param v2y
	 *     The value of the y component to add to this vector.
	 * @param v2z
	 *     The value of the z component to add to this vector.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	Vec3RF addN(float v2x, float v2y, float v2z);
	
	/**
	 * Subtracts the given vector {@code (v2)} from this vector and saves the result in a new
	 * instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v - v2}
	 * 
	 * @param v2
	 *     The vector to subtract from this vector.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	Vec3RF subN(Tup3RF v2);
	
	/**
	 * Subtracts the given vector {@code (v2[0], v2[1], v2[2])} from this vector and saves the
	 * result in a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v - (v2[0], v2[1], v2[2])}
	 * 
	 * @param v2
	 *     The vector to subtract from this vector as an array with at least three entries.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	Vec3RF subN(@MinLength(3) float[] v2);
	
	/**
	 * Subtracts the given value {@code (value)} from every component of this vector and saves the
	 * result in a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v - (value, value, value)}
	 * 
	 * @param value
	 *     The value to subtract from this vector.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	Vec3RF subN(float value);
	
	/**
	 * Subtracts the given vector {@code (v2x, v2y, v2z)} from this vector and saves the result in a
	 * new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v - (v2x, v2y, v2z)}
	 * 
	 * @param v2x
	 *     The value of the x component to subtract from this vector.
	 * @param v2y
	 *     The value of the y component to subtract from this vector.
	 * @param v2z
	 *     The value of the z component to subtract from this vector.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	Vec3RF subN(float v2x, float v2y, float v2z);
	
	/**
	 * Subtracts this vector from the given vector {@code (v2)} and saves the result in a new
	 * instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v2 - v}
	 * 
	 * @param v2
	 *     The vector this vector is subtracted from.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	Vec3RF revSubN(Tup3RF v2);
	
	/**
	 * Subtracts this vector from the given vector {@code (v2[0], v2[1], v2[2])} and saves the
	 * result in a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2[0], v2[1], v2[2]) - v}
	 * 
	 * @param v2
	 *     The vector this vector is subtracted from as an array with at least three entries.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	Vec3RF revSubN(@MinLength(3) float[] v2);
	
	/**
	 * Subtracts every component of this vector from the given value {@code (value)} and saves the
	 * result in a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (value, value, value) - v}
	 * 
	 * @param value
	 *     The value this vector is subtracted from.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	Vec3RF revSubN(float value);
	
	/**
	 * Subtracts this vector from the given vector {@code (v2x, v2y, v2z)} and saves the result in a
	 * new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2x, v2y, v2z) - v}
	 * 
	 * @param v2x
	 *     The value of the x component this vector is subtracted from.
	 * @param v2y
	 *     The value of the y component this vector is subtracted from.
	 * @param v2z
	 *     The value of the z component this vector is subtracted from.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	Vec3RF revSubN(float v2x, float v2y, float v2z);
	
	/**
	 * Multiplies this vector with the given vector {@code (v2)} and saves the result in a new
	 * instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v * v2}
	 * 
	 * @param v2
	 *     The vector to multiply this vector with.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	Vec3RF mulN(Tup3RF v2);
	
	/**
	 * Multiplies this vector with the given vector {@code (v2[0], v2[1], v2[2])} and saves the
	 * result in a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v * (v2[0], v2[1], v2[2])}
	 * 
	 * @param v2
	 *     The vector to multiply this vector with as an array with at least three entries.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	Vec3RF mulN(@MinLength(3) float[] v2);
	
	/**
	 * Multiplies every component of this vector with the given value {@code (value)} and saves the
	 * result in a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v * (value, value, value)}
	 * 
	 * @param value
	 *     The value to multiply this vector with.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	Vec3RF mulN(float value);
	
	/**
	 * Multiplies this vector with the given vector {@code (v2x, v2y, v2z)} and saves the result in
	 * a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v * (v2x, v2y, v2z)}
	 * 
	 * @param v2x
	 *     The value of the x component to multiply this vector with.
	 * @param v2y
	 *     The value of the y component to multiply this vector with.
	 * @param v2z
	 *     The value of the z component to multiply this vector with.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	Vec3RF mulN(float v2x, float v2y, float v2z);
	
	/**
	 * Divides this vector by the given vector {@code (v2)} and saves the result in a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v / v2}
	 * 
	 * @param v2
	 *     The vector to divide this vector by.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	Vec3RF divN(Tup3RF v2);
	
	/**
	 * Divides this vector by the given vector {@code (v2[0], v2[1], v2[2])} and saves the result in
	 * a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v / (v2[0], v2[1], v2[2])}
	 * 
	 * @param v2
	 *     The vector to divide this vector by as an array with at least three entries.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	Vec3RF divN(@MinLength(3) float[] v2);
	
	/**
	 * Divides each component of this vector by the given value {@code (value)} and saves the result
	 * in a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v / (value, value, value)}
	 * 
	 * @param value
	 *     The value to divide this vector by.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	Vec3RF divN(float value);
	
	/**
	 * Divides this vector by the given vector {@code (v2x, v2y, v2z)} and saves the result in a new
	 * instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v / (v2x, v2y, v2z)}
	 * 
	 * @param v2x
	 *     The value of the x component to divide this vector by.
	 * @param v2y
	 *     The value of the y component to divide this vector by.
	 * @param v2z
	 *     The value of the z component to divide this vector by.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	Vec3RF divN(float v2x, float v2y, float v2z);
	
	/**
	 * Divides the given vector {@code (v2)} by this vector and saves the result in a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v2 / v}
	 * 
	 * @param v2
	 *     The vector to divide by this vector.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	Vec3RF revDivN(Tup3RF v2);
	
	/**
	 * Divides the given vector {@code (v2[0], v2[1], v2[2])} by this vector and saves the result in
	 * a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2[0], v2[1], v2[2]) / v}
	 * 
	 * @param v2
	 *     The vector to divide by this vector as an array with at least three entries.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	Vec3RF revDivN(@MinLength(3) float[] v2);
	
	/**
	 * Divides the given value {@code (value)} by each component of this vector and saves the result
	 * in a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (value, value, value) / v}
	 * 
	 * @param value
	 *     The value to divide by this vector.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	Vec3RF revDivN(float value);
	
	/**
	 * Divides the given vector {@code (v2x, v2y, v2z)} by this vector and saves the result in a new
	 * instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2x, v2y, v2z) / v}
	 * 
	 * @param v2x
	 *     The value of the x component to divide by this vector.
	 * @param v2y
	 *     The value of the y component to divide by this vector.
	 * @param v2z
	 *     The value of the z component to divide by this vector.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	Vec3RF revDivN(float v2x, float v2y, float v2z);
	
	/**
	 * Returns half the vector from the endpoint of this vector to the endpoint of the given vector
	 * {@code (v2)} as a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ( v2 - v ) / 2}
	 * 
	 * @param v2
	 *     The second vector.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	Vec3RF halfVectorToN(Tup3RF v2);
	
	/**
	 * Returns half the vector from the endpoint of this vector to the endpoint of the given vector
	 * {@code (v2[0], v2[1], v2[2])} as a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ( (v2[0], v2[1], v2[2]) - v ) / 2}
	 * 
	 * @param v2
	 *     The second vector as an array with at least three entries.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	Vec3RF halfVectorToN(@MinLength(3) float[] v2);
	
	/**
	 * Returns half the vector from the endpoint of this vector to the endpoint of the given vector
	 * {@code (v2x, v2y, v2z)} as a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ( (v2x, v2y, v2z) - v ) / 2}
	 * 
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * @param v2z
	 *     The value of the z component of the second vector.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	Vec3RF halfVectorToN(float v2x, float v2y, float v2z);
	
	/**
	 * Returns the origin vector to the point that lies half way between the endpoint of this vector
	 * and the endpoint of the given vector {@code (v2)} as a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ( v2 + v ) / 2}
	 * 
	 * @param v2
	 *     The second vector.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	Vec3RF halfPointBetweenN(Tup3RF v2);
	
	/**
	 * Returns the origin vector to the point that lies half way between the endpoint of this vector
	 * and the endpoint of the given vector {@code (v2[0], v2[1], v2[2])} as a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ( (v2[0], v2[1], v2[2]) + v ) / 2}
	 * 
	 * @param v2
	 *     The second vector as an array with at least three entries.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	Vec3RF halfPointBetweenN(@MinLength(3) float[] v2);
	
	/**
	 * Returns the origin vector to the point that lies half way between the endpoint of this vector
	 * and the endpoint of the given vector {@code (v2x, v2y, v2z)} as a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ( (v2x, v2y, v2z) + v ) / 2}
	 * 
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * @param v2z
	 *     The value of the z component of the second vector.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	Vec3RF halfPointBetweenN(float v2x, float v2y, float v2z);
	
	/**
	 * Negates this vector and returns the result as a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code -v}
	 * 
	 * @return A new instance of this vector with the result.
	 */
	Vec3RF negateN();
	
	/**
	 * Inverses this vector and returns the result as a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code 1 / v}
	 * 
	 * @return A new instance of this vector with the result.
	 */
	Vec3RF inverseN();
	
	/**
	 * Normalizes this vector and returns the result as a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v / |v|}
	 * 
	 * @return A new instance of this vector with the result.
	 */
	Vec3RF normalizeN();
	
	/**
	 * Compares each component of this vector with the corresponding component of the given vector
	 * {@code (v2)} and returns the smallest values as a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * @param v2
	 *     The second vector.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	Vec3RF minVectorN(Tup3RF v2);
	
	/**
	 * Compares each component of this vector with the corresponding component of the given vector
	 * {@code (v2[0], v2[1], v2[2])} and returns the smallest values as a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * @param v2
	 *     The second vector as an array with at least three entries.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	Vec3RF minVectorN(@MinLength(3) float[] v2);
	
	/**
	 * Compares each component of this vector with the corresponding component of the given vector
	 * {@code (value, value, value)} and returns the smallest values as a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * @param value
	 *     The value for all the components of the second vector.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	Vec3RF minVectorN(float value);
	
	/**
	 * Compares each component of this vector with the corresponding component of the given vector
	 * {@code (v2x, v2y, v2z)} and returns the smallest values as a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * @param v2z
	 *     The value of the z component of the second vector.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	Vec3RF minVectorN(float v2x, float v2y, float v2z);
	
	/**
	 * Compares each component of this vector with the corresponding component of the given vector
	 * {@code (v2)} and returns the greatest values as a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * @param v2
	 *     The second vector.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	Vec3RF maxVectorN(Tup3RF v2);
	
	/**
	 * Compares each component of this vector with the corresponding component of the given vector
	 * {@code (v2[0], v2[1], v2[2])} and returns the greatest values as a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * @param v2
	 *     The second vector as an array with at least three entries.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	Vec3RF maxVectorN(@MinLength(3) float[] v2);
	
	/**
	 * Compares each component of this vector with the corresponding component of the given vector
	 * {@code (value, value, value)} and returns the greatest values as a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * @param value
	 *     The value for all the components of the second vector.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	Vec3RF maxVectorN(float value);
	
	/**
	 * Compares each component of this vector with the corresponding component of the given vector
	 * {@code (v2x, v2y, v2z)} and returns the greatest values as a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * @param v2z
	 *     The value of the z component of the second vector.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	Vec3RF maxVectorN(float v2x, float v2y, float v2z);
	
	/**
	 * Rotates this vector by the given angle in radians around the rotation axis {@code (axis)} and
	 * returns the result as a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * @param axis
	 *     The rotation axis.
	 * @param angle
	 *     The angle in radians.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	Vec3RF rotateRadN(Tup3RF axis, float angle);
	
	/**
	 * Rotates this vector by the given angle in radians around the rotation axis {@code (axis)} and
	 * returns the result as a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * @param axis
	 *     The rotation axis.
	 * @param angle
	 *     The angle in radians.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	Vec3RF rotateRadN(Tup3RF axis, float angle, MathProvider mathProvider);
	
	/**
	 * Rotates this vector by the given angle in radians around the rotation axis
	 * {@code (axis[0], axis[1], axis[2])} and returns the result as a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * @param axis
	 *     The rotation axis as an array with at least three entries.
	 * @param angle
	 *     The angle in radians.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	Vec3RF rotateRadN(@MinLength(3) float[] axis, float angle);
	
	/**
	 * Rotates this vector by the given angle in radians around the rotation axis
	 * {@code (axis[0], axis[1], axis[2])} and returns the result as a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * @param axis
	 *     The rotation axis as an array with at least three entries.
	 * @param angle
	 *     The angle in radians.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	Vec3RF rotateRadN(@MinLength(3) float[] axis, float angle, MathProvider mathProvider);
	
	/**
	 * Rotates this vector by the given angle in radians around the rotation axis
	 * {@code (axisX, axisY, axisZ)} and returns the result as a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * @param axisX
	 *     The value of the x component of the rotation axis.
	 * @param axisY
	 *     The value of the y component of the rotation axis.
	 * @param axisZ
	 *     The value of the z component of the rotation axis.
	 * @param angle
	 *     The angle in radians.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	Vec3RF rotateRadN(float axisX, float axisY, float axisZ, float angle);
	
	/**
	 * Rotates this vector by the given angle in radians around the rotation axis
	 * {@code (axisX, axisY, axisZ)} and returns the result as a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * @param axisX
	 *     The value of the x component of the rotation axis.
	 * @param axisY
	 *     The value of the y component of the rotation axis.
	 * @param axisZ
	 *     The value of the z component of the rotation axis.
	 * @param angle
	 *     The angle in radians.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	Vec3RF rotateRadN(float axisX, float axisY, float axisZ, float angle, MathProvider mathProvider);
	
	/**
	 * Rotates this vector by the given angle in degrees around the rotation axis {@code (axis)} and
	 * returns the result as a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * @param axis
	 *     The rotation axis.
	 * @param angle
	 *     The angle in radians.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	Vec3RF rotateDegN(Tup3RF axis, float angle);
	
	/**
	 * Rotates this vector by the given angle in degrees around the rotation axis {@code (axis)} and
	 * returns the result as a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * @param axis
	 *     The rotation axis.
	 * @param angle
	 *     The angle in radians.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	Vec3RF rotateDegN(Tup3RF axis, float angle, MathProvider mathProvider);
	
	/**
	 * Rotates this vector by the given angle in degrees around the rotation axis
	 * {@code (axis[0], axis[1], axis[2])} and returns the result as a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * @param axis
	 *     The rotation axis as an array with at least three entries.
	 * @param angle
	 *     The angle in radians.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	Vec3RF rotateDegN(@MinLength(3) float[] axis, float angle);
	
	/**
	 * Rotates this vector by the given angle in degrees around the rotation axis
	 * {@code (axis[0], axis[1], axis[2])} and returns the result as a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * @param axis
	 *     The rotation axis as an array with at least three entries.
	 * @param angle
	 *     The angle in radians.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	Vec3RF rotateDegN(@MinLength(3) float[] axis, float angle, MathProvider mathProvider);
	
	/**
	 * Rotates this vector by the given angle in degrees around the rotation axis
	 * {@code (axisX, axisY, axisZ)} and returns the result as a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * @param axisX
	 *     The value of the x component of the rotation axis.
	 * @param axisY
	 *     The value of the y component of the rotation axis.
	 * @param axisZ
	 *     The value of the z component of the rotation axis.
	 * @param angle
	 *     The angle in radians.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	Vec3RF rotateDegN(float axisX, float axisY, float axisZ, float angle);
	
	/**
	 * Rotates this vector by the given angle in degrees around the rotation axis
	 * {@code (axisX, axisY, axisZ)} and returns the result as a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * @param axisX
	 *     The value of the x component of the rotation axis.
	 * @param axisY
	 *     The value of the y component of the rotation axis.
	 * @param axisZ
	 *     The value of the z component of the rotation axis.
	 * @param angle
	 *     The angle in radians.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	Vec3RF rotateDegN(float axisX, float axisY, float axisZ, float angle, MathProvider mathProvider);
	
	/**
	 * Calculates the orthogonal projection of this vector onto the normalized target vector
	 * {@code (t)} and returns the result as a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code t * (v . t)}
	 * 
	 * @param t
	 *     The projection target vector.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	Vec3RF projectN(Tup3RF t);
	
	/**
	 * Calculates the orthogonal projection of this vector onto the normalized target vector
	 * {@code (t[0], t[1], t[2])} and returns the result as a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (t[0], t[1], t[2]) * (v . (t[0], t[1], [2]))}
	 * 
	 * @param t
	 *     The projection target vector as an array with at least three entries.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	Vec3RF projectN(@MinLength(3) float[] t);
	
	/**
	 * Calculates the orthogonal projection of this vector onto the normalized target vector
	 * {@code (tX, tY, tZ)} and returns the result as a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (tX, tY, tZ) * (v . (tX, tY, tZ))}
	 * 
	 * @param tX
	 *     The value of the x component of the projection target vector.
	 * @param tY
	 *     The value of the y component of the projection target vector.
	 * @param tZ
	 *     The value of the z component of the projection target vector.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	Vec3RF projectN(float tX, float tY, float tZ);
	
	/**
	 * Calculates the reflection of this vector based on the given normalized surface normal
	 * {@code (n)} and returns the result as a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * @param n
	 *     The surface normal vector.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	Vec3RF reflectN(Tup3RF n);
	
	/**
	 * Calculates the reflection of this vector based on the given normalized surface normal
	 * {@code (n[0], n[1], n[2])} and returns the result as a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * @param n
	 *     The surface normal vector as an array with at least three entries.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	Vec3RF reflectN(@MinLength(3) float[] n);
	
	/**
	 * Calculates the reflection of this vector based on the given normalized surface normal
	 * {@code (nX, nY, nZ)} and returns the result as a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * @param nX
	 *     The value of the x component of the surface normal vector.
	 * @param nY
	 *     The value of the y component of the surface normal vector.
	 * @param nZ
	 *     The value of the z component of the surface normal vector.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	Vec3RF reflectN(float nX, float nY, float nZ);
	
	/**
	 * Rounds the components of this vector towards the next greater integer and saves the result in
	 * a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	Vec3RF ceilN();
	
	/**
	 * Rounds the components of this vector towards the next smaller integer and saves the result in
	 * a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	Vec3RF floorN();
	
	/**
	 * Rounds the components of this vector and saves the result in a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	Vec3RF roundN();
	
	/**
	 * Truncates the decimals of the components of this vector and saves the result in a new
	 * instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	Vec3RF truncN();
	
	/**
	 * Rounds the components of this vector using the given method and saves the result in a new
	 * instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * @param method
	 *     The Method to use for rounding.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	Vec3RF roundN(FloatRoundMethod method);
	
	/**
	 * Determines the smallest value of the components and returns the value and the index of the
	 * component. The index returned is limited to the range of {@code 0 to 1}. If two or more
	 * components have the same value the smallest index will be returned. The returned object is
	 * immutable.
	 * 
	 * @return An object containing the smallest value of the components and the index of the
	 * corresponding component.
	 */
	FloatIndexValuePair min();
	
	/**
	 * Determines the smallest value of the components and returns the value and the index of the
	 * component. The index returned is limited to the range of {@code 0 to 1}. If two or more
	 * components have the same value the smallest index will be returned. This version utilizes an
	 * extraction parameter that receives the result and will be returned.
	 * 
	 * @param res
	 *     The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	FloatIndexValuePair min(@ExtractionParam FloatIndexValuePair res);
	
	/**
	 * Determines the smallest value of the components and returns it.
	 * 
	 * @return The smallest value of the components.
	 */
	float minValue();
	
	/**
	 * Determines the smallest value of the componensts and returns the index of the component. The
	 * index returned is limited to the range of {@code 0 to 1}. If two or more components have the
	 * same value the smallest index will be returned.
	 * 
	 * @return The index of the smallest component.
	 */
	int minComponent();
	
	/**
	 * Determines the greatest value of the components and returns the value and the index of the
	 * component. The index returned is limited to the range of {@code 0 to 1}. If two or more
	 * components have the same value the smallest index will be returned. The returned tuple is
	 * immutable.
	 * 
	 * @return An object containing the greatest value of the components and the index of the
	 * corresponding component.
	 */
	FloatIndexValuePair max();
	
	/**
	 * Determines the greatest value of the components and returns the value and the index of the
	 * component. The index returned is limited to the range of {@code 0 to 1}. If two or more
	 * components have the same value the smallest index will be returned. This version utilizes an
	 * extraction parameter that receives the result and will be returned.
	 * 
	 * @param res
	 *     The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	FloatIndexValuePair max(@ExtractionParam FloatIndexValuePair res);
	
	/**
	 * Determines the greatest value of the components and returns it.
	 * 
	 * @return The greatest value of the components.
	 */
	float maxValue();
	
	/**
	 * Determines the greatest value of the componensts and returns the index of the component. The
	 * index returned is limited to the range of {@code 0 to getDimensions() - 1}. If two or more
	 * components have the same value the smallest index will be returned.
	 * 
	 * @return The index of the greatest component.
	 */
	int maxComponent();
	
	/**
	 * Calculates the absolute value of the component values and saves the result in a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	Vec3RF absN();
	
	/**
	 * Calculates the cross product between this vector and the second given vector {@code (v2)} and
	 * saves the result in a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v X v2}
	 * 
	 * @param v2
	 *     The second vector.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	Vec3RF crossN(Tup3RF v2);
	
	/**
	 * Calculates the cross product between this vector and the second given vector
	 * {@code (v2[0], v2[1], v2[2])} and saves the result in a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v X (v2[0], v2[1], v2[2])}
	 * 
	 * @param v2
	 *     The second vector as an array with at least three entries.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	Vec3RF crossN(@MinLength(3) float[] v2);
	
	/**
	 * Calculates the cross product between this vector and the second given vector
	 * {@code (value, value, value)} and saves the result in a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v X (value, value, value)}
	 * 
	 * @param value
	 *     The value for all the components of the second vector.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	Vec3RF crossN(float value);
	
	/**
	 * Calculates the cross product between this vector and the second given vector
	 * {@code (v2x, v2y, v2z)} and saves the result in a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v X (v2x, v2y, v2z)}
	 * 
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * @param v2z
	 *     The value of the z component of the second vector.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	Vec3RF crossN(float v2x, float v2y, float v2z);
	
	/**
	 * Calculates the {@link Math#signum(float) signum} of the components of this vecotr and saves
	 * the result in a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	Vec3RF signumN();
	
	/**
	 * Linearly integrates over the second given vector {@code (v2)} by the integrator
	 * {@code (alpha)}, adds the result to this vector and saves the result in a new instance. This
	 * assumes an integration delta of 1.0 so that the integration is over {@code (alpha / 1.0)},
	 * therefore if {@code (alpha)} is 1.0 the unscaled second vector is added. Otherwise it will be
	 * scaled before adding.
	 * 
	 * <p>
	 * The main difference between interpolation and integration is that interpolation is by default
	 * designed to map a alpha value between 0.0 and 1.0 to the range between a zero-vector and a
	 * given vector. If the alpha value exceeds the range between 0.0 and 1.0 the result might be
	 * unexpected. Whereas an integration can exceed the range and will scale the given vector by
	 * the factor.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * @param v2
	 *     The second vector. This vector will be integrated over.
	 * @param alpha
	 *     The integrator with an integration delta of 1.0f {@code (alpha / 1.0f)}.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	Vec3RF integrateLinearN(Tup3RF v2, float alpha);
	
	/**
	 * Linearly integrates over the second given vector {@code (v2[0], v2[1], v2[2])} by the
	 * integrator {@code (alpha)}, adds the result to this vector and saves the result in a new
	 * instance. This assumes an integration delta of 1.0 so that the integration is over
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
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * @param v2
	 *     The second vector as an array with at least three entries. This vector will be integrated
	 *     over.
	 * @param alpha
	 *     The integrator with an integration delta of 1.0f {@code (alpha / 1.0f)}.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	Vec3RF integrateLinearN(@MinLength(3) float[] v2, float alpha);
	
	/**
	 * Linearly integrates over the second given vector {@code (v2x, v2y, v2z)} by the integrator
	 * {@code (alpha)}, adds the result to this vector and saves the result in a new instance. This
	 * assumes an integration delta of 1.0 so that the integration is over {@code (alpha / 1.0)},
	 * therefore if {@code (alpha)} is 1.0 the unscaled second vector is added. Otherwise it will be
	 * scaled before adding.
	 * 
	 * <p>
	 * The main difference between interpolation and integration is that interpolation is by default
	 * designed to map a alpha value between 0.0 and 1.0 to the range between a zero-vector and a
	 * given vector. If the alpha value exceeds the range between 0.0 and 1.0 the result might be
	 * unexpected. Whereas an integration can exceed the range and will scale the given vector by
	 * the factor.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * @param v2x
	 *     The value of the x component of the second vector. This vector will be integrated over.
	 * @param v2y
	 *     The value of the y component of the second vector. This vector will be integrated over.
	 * @param v2z
	 *     The value of the z component of the second vector. This vector will be integrated over.
	 * @param alpha
	 *     The integrator with an integration delta of 1.0f {@code (alpha / 1.0f)}.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	Vec3RF integrateLinearN(float v2x, float v2y, float v2z, float alpha);
	
	/**
	 * Transforms this vector by the quaternion {@code (q)} and saves the result in a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * q * v * q*
	 * 
	 * @param q
	 *     The quaternion.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	Vec3RF transformQuatN(SimpleQuatfR q);
	
	/**
	 * Transforms this vector by the quaternion {@code (q)} and saves the result in a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * q * v * q*
	 * 
	 * @param q
	 *     The quaternion.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	Vec3RF transformQuatN(Tup4RF q);
	
	/**
	 * Transforms this vector by the quaternion {@code (q[0], q[1], q[2], q[3])} and saves the
	 * result in a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * (q[0], q[1], q[2], q[3]) * v * (q[0], q[1], q[2], q[3])*
	 * 
	 * @param q
	 *     The quaternion as an array with at least four entries.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	Vec3RF transformQuatN(@MinLength(4) float[] q);
	
	/**
	 * Transforms this vector by the quaternion {@code (qX, qY, qZ, qW)} and saves the result in a
	 * new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * (qX, qY, qZ, qw) * v * (qX, qY, qZ, qW)*
	 * 
	 * @param qW
	 *     The value of the w component of the quaternion.
	 * @param qX
	 *     The value of the x component of the quaternion.
	 * @param qY
	 *     The value of the y component of the quaternion.
	 * @param qZ
	 *     The value of the z component of the quaternion.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	Vec3RF transformQuatN(float qW, float qX, float qY, float qZ);
	
	Vec3RF transformVectorMat4N(SimpleMat4fR m);
	
	Vec3RF transformVectorMat4N(float[][] m);
	
	Vec3RF transformPointMat4N(SimpleMat4fR m);
	
	Vec3RF transformPointMat4N(float[][] m);
	
	/**
	 * Adds the given vector {@code (v2)} to this vector and saves the result in the extraction
	 * parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * It is safe to use this vector or the given vector {@code v2} as the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v + v2}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter.
	 * 
	 * @param v2
	 *     The vector to add to this vector.
	 * @param res
	 *     The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	<T extends Tup3WF> T addR(Tup3RF v2, @ExtractionParam T res);
	
	/**
	 * Adds the given vector {@code (v2)} to this vector and saves the result in the extraction
	 * parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v + v2}
	 * 
	 * @param v2
	 *     The vector to add to this vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	float[] addR(Tup3RF v2, @ExtractionParam @MinLength(3) float[] res);
	
	/**
	 * Adds the given vector {@code (v2[0], v2[1], v2[2])} to this vector and saves the result in
	 * the extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * It is safe to use this vector as the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v + (v2[0], v2[1], v2[2])}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter.
	 * 
	 * @param v2
	 *     The vector to add to this vector as an array with at least three entries.
	 * @param res
	 *     The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	<T extends Tup3WF> T addR(@MinLength(3) float[] v2, @ExtractionParam T res);
	
	/**
	 * Adds the given vector {@code (v2[0], v2[1], v2[2])} to this vector and saves the result in
	 * the extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * It is safe to use the given vector {@code v2} as the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v + (v2[0], v2[1], v2[2])}
	 * 
	 * @param v2
	 *     The vector to add to this vector as an array with at least three entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	float[] addR(@MinLength(3) float[] v2, @ExtractionParam @MinLength(3) float[] res);
	
	/**
	 * Adds the given value {@code (value)} to every component of this vector and saves the result
	 * in the extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * It is safe to use this vector as the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v + (value, value, value)}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter.
	 * 
	 * @param value
	 *     The value to add to this vector.
	 * @param res
	 *     The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	<T extends Tup3WF> T addR(float value, @ExtractionParam T res);
	
	/**
	 * Adds the given value {@code (value)} to every component of this vector and saves the result
	 * in the extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v + (value, value, value)}
	 * 
	 * @param value
	 *     The value to add to this vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	float[] addR(float value, @ExtractionParam @MinLength(3) float[] res);
	
	/**
	 * Adds the given vector {@code (v2x, v2y, v2z)} to this vector and saves the result in the
	 * extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * It is safe to use this vector as the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v + (v2x, v2y, v2z)}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter.
	 * 
	 * @param v2x
	 *     The value of the x component to add to this vector.
	 * @param v2y
	 *     The value of the y component to add to this vector.
	 * @param v2z
	 *     The value of the z component to add to this vector.
	 * @param res
	 *     The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	<T extends Tup3WF> T addR(float v2x, float v2y, float v2z, @ExtractionParam T res);
	
	/**
	 * Adds the given vector {@code (v2x, v2y, v2z)} to this vector and saves the result in the
	 * extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v + (v2x, v2y, v2z)}
	 * 
	 * @param v2x
	 *     The value of the x component to add to this vector.
	 * @param v2y
	 *     The value of the y component to add to this vector.
	 * @param v2z
	 *     The value of the z component to add to this vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	float[] addR(float v2x, float v2y, float v2z, @ExtractionParam @MinLength(3) float[] res);
	
	/**
	 * Subtracts the given vector {@code (v2)} from this vector and saves the result in the
	 * extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * It is safe to use this vector or the given vector {@code v2} as the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v - v2}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter.
	 * 
	 * @param v2
	 *     The vector to subtract from this vector.
	 * @param res
	 *     The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	<T extends Tup3WF> T subR(Tup3RF v2, @ExtractionParam T res);
	
	/**
	 * Subtracts the given vector {@code (v2)} from this vector and saves the result in the
	 * extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v - v2}
	 * 
	 * @param v2
	 *     The vector to subtract from this vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	float[] subR(Tup3RF v2, @ExtractionParam @MinLength(3) float[] res);
	
	/**
	 * Subtracts the given vector {@code (v2[0], v2[1], v2[2])} from this vector and saves the
	 * result in the extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * It is safe to use this vector as the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v - (v2[0], v2[1], v2[2])}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter.
	 * 
	 * @param v2
	 *     The vector to subtract from this vector as an array with at least three entries.
	 * @param res
	 *     The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	<T extends Tup3WF> T subR(@MinLength(3) float[] v2, @ExtractionParam T res);
	
	/**
	 * Subtracts the given vector {@code (v2[0], v2[1], v2[2])} from this vector and saves the
	 * result in the extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * It is safe to use the given vector {@code v2} as the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v - (v2[0], v2[1], v2[2])}
	 * 
	 * 
	 * @param v2
	 *     The vector to subtract from this vector as an array with at least three entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	float[] subR(@MinLength(3) float[] v2, @ExtractionParam @MinLength(3) float[] res);
	
	/**
	 * Subtracts the given value {@code (value)} from every component of this vector and saves the
	 * result in the extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * It is safe to use this vector as the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v - (value, value, value)}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter.
	 * 
	 * @param value
	 *     The value to subtract from this vector.
	 * @param res
	 *     The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	<T extends Tup3WF> T subR(float value, @ExtractionParam T res);
	
	/**
	 * Subtracts the given value {@code (value)} from every component of this vector and saves the
	 * result in the extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v - (value, value, value)}
	 * 
	 * @param value
	 *     The value to subtract from this vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	float[] subR(float value, @ExtractionParam @MinLength(3) float[] res);
	
	/**
	 * Subtracts the given vector {@code (v2x, v2y, v2z)} from this vector and saves the result in
	 * the extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * It is safe to use this vector as the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v - (v2x, v2y, v2z)}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter.
	 * 
	 * @param v2x
	 *     The value of the x component to subtract from this vector.
	 * @param v2y
	 *     The value of the y component to subtract from this vector.
	 * @param v2z
	 *     The value of the z component to subtract from this vector.
	 * @param res
	 *     The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	<T extends Tup3WF> T subR(float v2x, float v2y, float v2z, @ExtractionParam T res);
	
	/**
	 * Subtracts the given vector {@code (v2x, v2y, v2z)} from this vector and saves the result in
	 * the extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v - (v2x, v2y, v2z)}
	 * 
	 * 
	 * @param v2x
	 *     The value of the x component to subtract from this vector.
	 * @param v2y
	 *     The value of the y component to subtract from this vector.
	 * @param v2z
	 *     The value of the z component to subtract from this vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	float[] subR(float v2x, float v2y, float v2z, @ExtractionParam @MinLength(3) float[] res);
	
	/**
	 * Subtracts this vector from the given vector {@code (v2)} and saves the result in the
	 * extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * It is safe to use this vector or the given vector {@code v2} as the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v2 - v}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter.
	 * 
	 * @param v2
	 *     The vector this vector is subtracted from.
	 * @param res
	 *     The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	<T extends Tup3WF> T revSubR(Tup3RF v2, @ExtractionParam T res);
	
	/**
	 * Subtracts this vector from the given vector {@code (v2)} and saves the result in the
	 * extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v2 - v}
	 * 
	 * @param v2
	 *     The vector this vector is subtracted from.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	float[] revSubR(Tup3RF v2, @ExtractionParam @MinLength(3) float[] res);
	
	/**
	 * Subtracts this vector from the given vector {@code (v2[0], v2[1], v2[2])} and saves the
	 * result in the extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * It is safe to use this vector or the given vector {@code v2} as the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2[0], v2[1], v2[2]) - v}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter.
	 * 
	 * @param v2
	 *     The vector this vector is subtracted from as an array with at least three entries.
	 * @param res
	 *     The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	<T extends Tup3WF> T revSubR(@MinLength(3) float[] v2, @ExtractionParam T res);
	
	/**
	 * Subtracts this vector from the given vector {@code (v2[0], v2[1], v2[2])} and saves the
	 * result in the extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * It is safe to use the given vector {@code v2} as the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2[0], v2[1], v2[2]) - v}
	 * 
	 * @param v2
	 *     The vector this vector is subtracted from as an array with at least three entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	float[] revSubR(@MinLength(3) float[] v2, @ExtractionParam @MinLength(3) float[] res);
	
	/**
	 * Subtracts every component of this vector from the given value {@code (value)} and saves the
	 * result in the extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * It is safe to use this vector as the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (value, value, value) - v}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter.
	 * 
	 * @param value
	 *     The value this vector is subtracted from.
	 * @param res
	 *     The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	<T extends Tup3WF> T revSubR(float value, @ExtractionParam T res);
	
	/**
	 * Subtracts every component of this vector from the given value {@code (value)} and saves the
	 * result in the extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (value, value, value) - v}
	 * 
	 * @param value
	 *     The value this vector is subtracted from.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	float[] revSubR(float value, @ExtractionParam @MinLength(2) float[] res);
	
	/**
	 * Subtracts this vector from the given vector {@code (v2x, v2y, v2z)} and saves the result in
	 * the extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * It is safe to use this vector as the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2x, v2y, v2z) - v}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter.
	 * 
	 * @param v2x
	 *     The value of the x component this vector is subtracted from.
	 * @param v2y
	 *     The value of the y component this vector is subtracted from.
	 * @param v2z
	 *     The value of the z component this vector is subtracted from.
	 * @param res
	 *     The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	<T extends Tup3WF> T revSubR(float v2x, float v2y, float v2z, @ExtractionParam T res);
	
	/**
	 * Subtracts this vector from the given vector {@code (v2x, v2y, v2z)} and saves the result in
	 * the extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2x, v2y, v2z) - v}
	 * 
	 * @param v2x
	 *     The value of the x component this vector is subtracted from.
	 * @param v2y
	 *     The value of the y component this vector is subtracted from.
	 * @param v2z
	 *     The value of the z component this vector is subtracted from.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	float[] revSubR(float v2x, float v2y, float v2z, @ExtractionParam @MinLength(3) float[] res);
	
	/**
	 * Multiplies this vector with the given vector {@code (v2)} and saves the result in the
	 * extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * It is safe to use this vector or the given vector {@code v2} as the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v * v2}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter.
	 * 
	 * @param v2
	 *     The vector to multiply this vector with.
	 * @param res
	 *     The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	<T extends Tup3WF> T mulR(Tup3RF v2, @ExtractionParam T res);
	
	/**
	 * Multiplies this vector with the given vector {@code (v2)} and saves the result in the
	 * extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v * v2}
	 * 
	 * @param v2
	 *     The vector to multiply this vector with.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	float[] mulR(Tup3RF v2, @ExtractionParam @MinLength(3) float[] res);
	
	/**
	 * Multiplies this vector with the given vector {@code (v2[0], v2[1], v2[2])} and saves the
	 * result in the extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * It is safe to use this vector as the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v * (v2[0], v2[1], v2[2])}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter.
	 * 
	 * @param v2
	 *     The vector to multiply this vector with as an array with at least three entries.
	 * @param res
	 *     The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	<T extends Tup3WF> T mulR(@MinLength(3) float[] v2, @ExtractionParam T res);
	
	/**
	 * Multiplies this vector with the given vector {@code (v2[0], v2[1], v2[2])} and saves the
	 * result in the extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * It is safe to use the given vector {@code v2} as the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v * (v2[0], v2[1], v2[2])}
	 * 
	 * @param v2
	 *     The vector to multiply this vector with as an array with at least three entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	float[] mulR(@MinLength(3) float[] v2, @ExtractionParam @MinLength(3) float[] res);
	
	/**
	 * Multiplies every component of this vector with the given value {@code (value)} and saves the
	 * result in the extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * It is safe to use this vector as the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v * (value, value, value)}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter.
	 * 
	 * @param value
	 *     The value to multiply this vector with.
	 * @param res
	 *     The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	<T extends Tup3WF> T mulR(float value, @ExtractionParam T res);
	
	/**
	 * Multiplies every component of this vector with the given value {@code (value)} and saves the
	 * result in the extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v * (value, value, value)}
	 * 
	 * @param value
	 *     The value to multiply this vector with.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	float[] mulR(float value, @ExtractionParam @MinLength(3) float[] res);
	
	/**
	 * Multiplies this vector with the given vector {@code (v2x, v2y, v2z)} and saves the result in
	 * the extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * It is safe to use this vector as the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v * (v2x, v2y, v2z)}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter.
	 * 
	 * @param v2x
	 *     The value of the x component to multiply this vector with.
	 * @param v2y
	 *     The value of the y component to multiply this vector with.
	 * @param v2z
	 *     The value of the z component to multiply this vector with.
	 * @param res
	 *     The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	<T extends Tup3WF> T mulR(float v2x, float v2y, float v2z, @ExtractionParam T res);
	
	/**
	 * Multiplies this vector with the given vector {@code (v2x, v2y, v2z)} and saves the result in
	 * the extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v * (v2x, v2y, v2z)}
	 * 
	 * @param v2x
	 *     The value of the x component to multiply this vector with.
	 * @param v2y
	 *     The value of the y component to multiply this vector with.
	 * @param v2z
	 *     The value of the z component to multiply this vector with.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	float[] mulR(float v2x, float v2y, float v2z, @ExtractionParam @MinLength(3) float[] res);
	
	/**
	 * Divides this vector by the given vector {@code (v2)} and saves the result in the extraction
	 * parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * It is safe to use this vector or the given vector {@code v2} as the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v / v2}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter.
	 * 
	 * @param v2
	 *     The vector to divide this vector by.
	 * @param res
	 *     The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	<T extends Tup3WF> T divR(Tup3RF v2, @ExtractionParam T res);
	
	/**
	 * Divides this vector by the given vector {@code (v2)} and saves the result in the extraction
	 * parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v / v2}
	 * 
	 * @param v2
	 *     The vector to divide this vector by.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	float[] divR(Tup3RF v2, @ExtractionParam @MinLength(3) float[] res);
	
	/**
	 * Divides this vector by the given vector {@code (v2[0], v2[1], v2[2])} and saves the result in
	 * the extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * It is safe to use this vector as the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v / (v2[0], v2[1], v2[2])}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter.
	 * 
	 * @param v2
	 *     The vector to divide this vector by as an array with at least three entries.
	 * @param res
	 *     The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	<T extends Tup3WF> T divR(@MinLength(3) float[] v2, @ExtractionParam T res);
	
	/**
	 * Divides this vector by the given vector {@code (v2[0], v2[1], v2[2])} and saves the result in
	 * the extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * It is safe to use the given vector {@code v2} as the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v / (v2[0], v2[1], v2[2])}
	 * 
	 * @param v2
	 *     The vector to divide this vector by as an array with at least three entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	float[] divR(@MinLength(3) float[] v2, @ExtractionParam @MinLength(3) float[] res);
	
	/**
	 * Divides each component of this vector by the given value {@code (value)} and saves the result
	 * in the extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * It is safe to use this vector as the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v / (value, value, value)}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter.
	 * 
	 * @param value
	 *     The value to divide this vector by.
	 * @param res
	 *     The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	<T extends Tup3WF> T divR(float value, @ExtractionParam T res);
	
	/**
	 * Divides each component of this vector by the given value {@code (value)} and saves the result
	 * in the extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v / (value, value, value)}
	 * 
	 * @param value
	 *     The value to divide this vector by.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	float[] divR(float value, @ExtractionParam @MinLength(3) float[] res);
	
	/**
	 * Divides this vector by the given vector {@code (v2x, v2y, v2z)} and saves the result in the
	 * extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * It is safe to use this vector as the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v / (v2x, v2y, v2z)}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter.
	 * 
	 * @param v2x
	 *     The value of the x component to divide this vector by.
	 * @param v2y
	 *     The value of the y component to divide this vector by.
	 * @param v2z
	 *     The value of the z component to divide this vector by.
	 * @param res
	 *     The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	<T extends Tup3WF> T divR(float v2x, float v2y, float v2z, @ExtractionParam T res);
	
	/**
	 * Divides this vector by the given vector {@code (v2x, v2y, v2z)} and saves the result in the
	 * extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v / (v2x, v2y, v2z)}
	 * 
	 * @param v2x
	 *     The value of the x component to divide this vector by.
	 * @param v2y
	 *     The value of the y component to divide this vector by.
	 * @param v2z
	 *     The value of the z component to divide this vector by.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	float[] divR(float v2x, float v2y, float v2z, @ExtractionParam @MinLength(3) float[] res);
	
	/**
	 * Divides the given vector {@code (v2)} by this vector and saves the result in the extraction
	 * parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * It is safe to use this vector as the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v2 / v}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter.
	 * 
	 * @param v2
	 *     The vector to divide by this vector.
	 * @param res
	 *     The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	<T extends Tup3WF> T revDivR(Tup3RF v2, @ExtractionParam T res);
	
	/**
	 * Divides the given vector {@code (v2)} by this vector and saves the result in the extraction
	 * parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v2 / v}
	 * 
	 * @param v2
	 *     The vector to divide by this vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	float[] revDivR(Tup3RF v2, @ExtractionParam @MinLength(3) float[] res);
	
	/**
	 * Divides the given vector {@code (v2[0], v2[1], v2[2])} by this vector and saves the result in
	 * the extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * It is safe to use this vector as the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2[0], v2[1], v2[2]) / v}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter.
	 * 
	 * @param v2
	 *     The vector to divide by this vector as an array with at least three entries.
	 * @param res
	 *     The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	<T extends Tup3WF> T revDivR(@MinLength(3) float[] v2, @ExtractionParam T res);
	
	/**
	 * Divides the given vector {@code (v2[0], v2[1], v2[2])} by this vector and saves the result in
	 * the extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * It is safe to use the given vector {@code v2} as the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2[0], v2[1], v2[2]) / v}
	 * 
	 * @param v2
	 *     The vector to divide by this vector as an array with at least three entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	float[] revDivR(@MinLength(3) float[] v2, @ExtractionParam @MinLength(3) float[] res);
	
	/**
	 * Divides the given value {@code (value)} by each component of this vector and saves the result
	 * in the extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * It is safe to use this vector as the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (value, value, value) / v}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter.
	 * 
	 * @param value
	 *     The value to divide by this vector.
	 * @param res
	 *     The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	<T extends Tup3WF> T revDivR(float value, @ExtractionParam T res);
	
	/**
	 * Divides the given value {@code (value)} by each component of this vector and saves the result
	 * in the extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (value, value, value) / v}
	 * 
	 * @param value
	 *     The value to divide by this vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	float[] revDivR(float value, @ExtractionParam @MinLength(3) float[] res);
	
	/**
	 * Divides the given vector {@code (v2x, v2y, v2z)} by this vector and saves the result in the
	 * extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * It is safe to use this vector as the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2x, v2y, v2z) / v}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter.
	 * 
	 * @param v2x
	 *     The value of the x component to divide by this vector.
	 * @param v2y
	 *     The value of the y component to divide by this vector.
	 * @param v2z
	 *     The value of the z component to divide by this vector.
	 * @param res
	 *     The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	<T extends Tup3WF> T revDivR(float v2x, float v2y, float v2z, @ExtractionParam T res);
	
	/**
	 * Divides the given vector {@code (v2x, v2y, v2z)} by this vector and saves the result in the
	 * extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2x, v2y, v2z) / v}
	 * 
	 * @param v2x
	 *     The value of the x component to divide by this vector.
	 * @param v2y
	 *     The value of the y component to divide by this vector.
	 * @param v2z
	 *     The value of the z component to divide by this vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	float[] revDivR(float v2x, float v2y, float v2z, @ExtractionParam @MinLength(3) float[] res);
	
	/**
	 * Returns half the vector from the endpoint of this vector to the endpoint of the given vector
	 * {@code (v2)} as the extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * It is safe to use this vector as the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ( v2 - v ) / 2}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter.
	 * 
	 * @param v2
	 *     The second vector.
	 * @param res
	 *     The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	<T extends Tup3WF> T halfVectorToR(Tup3RF v2, @ExtractionParam T res);
	
	/**
	 * Returns half the vector from the endpoint of this vector to the endpoint of the given vector
	 * {@code (v2)} as the extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ( v2 - v ) / 2}
	 * 
	 * @param v2
	 *     The second vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	float[] halfVectorToR(Tup3RF v2, @ExtractionParam @MinLength(3) float[] res);
	
	/**
	 * Returns half the vector from the endpoint of this vector to the endpoint of the given vector
	 * {@code (v2[0], v2[1], v2[2])} as the extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * It is safe to use this vector as the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ( (v2[0], v2[1], v2[2]) - v ) / 2}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter.
	 * 
	 * @param v2
	 *     The second vector as an array with at least three entries.
	 * @param res
	 *     The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	<T extends Tup3WF> T halfVectorToR(@MinLength(3) float[] v2, @ExtractionParam T res);
	
	/**
	 * Returns half the vector from the endpoint of this vector to the endpoint of the given vector
	 * {@code (v2[0], v2[1], v2[2])} as the extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * It is safe to use the given vector {@code v2} as the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ( (v2[0], v2[1], v2[2]) - v ) / 2}
	 * 
	 * @param v2
	 *     The second vector as an array with at least three entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	float[] halfVectorToR(@MinLength(3) float[] v2, @ExtractionParam @MinLength(3) float[] res);
	
	/**
	 * Returns half the vector from the endpoint of this vector to the endpoint of the given vector
	 * {@code (v2x, v2y, v2z)} as the extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * It is safe to use this vector as the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ( (v2x, v2y, v2z) - v ) / 2}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter.
	 * 
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * @param v2z
	 *     The value of the z component of the second vector.
	 * @param res
	 *     The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	<T extends Tup3WF> T halfVectorToR(float v2x, float v2y, float v2z, @ExtractionParam T res);
	
	/**
	 * Returns half the vector from the endpoint of this vector to the endpoint of the given vector
	 * {@code (v2x, v2y, v2z)} as the extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ( (v2x, v2y, v2z) - v ) / 2}
	 * 
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
	float[] halfVectorToR(float v2x, float v2y, float v2z, @ExtractionParam @MinLength(3) float[] res);
	
	/**
	 * Returns the origin vector to the point that lies half way between the endpoint of this vector
	 * and the endpoint of the given vector {@code (v2)} as the extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * It is safe to use this vector as the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ( v2 + v ) / 2}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter.
	 * 
	 * @param v2
	 *     The second vector.
	 * @param res
	 *     The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	<T extends Tup3WF> T halfPointBetweenR(Tup3RF v2, @ExtractionParam T res);
	
	/**
	 * Returns the origin vector to the point that lies half way between the endpoint of this vector
	 * and the endpoint of the given vector {@code (v2)} as the extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ( v2 + v ) / 2}
	 * 
	 * @param v2
	 *     The second vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	float[] halfPointBetweenR(Tup3RF v2, @ExtractionParam @MinLength(2) float[] res);
	
	/**
	 * Returns the origin vector to the point that lies half way between the endpoint of this vector
	 * and the endpoint of the given vector {@code (v2[0], v2[1])} as the extraction parameter
	 * {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * It is safe to use this vector as the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ( (v2[0], v2[1]) + v ) / 2}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter.
	 * 
	 * @param v2
	 *     The second vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	<T extends Tup3WF> T halfPointBetweenR(@MinLength(2) float[] v2, @ExtractionParam T res);
	
	/**
	 * Returns the origin vector to the point that lies half way between the endpoint of this vector
	 * and the endpoint of the given vector {@code (v2[0], v2[1])} as the extraction parameter
	 * {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * It is safe to use the given vector {@code v2} as the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ( (v2[0], v2[1]) + v ) / 2}
	 * 
	 * @param v2
	 *     The second vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	float[] halfPointBetweenR(@MinLength(2) float[] v2, @ExtractionParam @MinLength(2) float[] res);
	
	/**
	 * Returns the origin vector to the point that lies half way between the endpoint of this vector
	 * and the endpoint of the given vector {@code (v2x, v2y, v2z)} as the extraction parameter
	 * {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * It is safe to use this vector as the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ( (v2x, v2y, v2z) + v ) / 2}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter.
	 * 
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * @param v2z
	 *     The value of the z component of the second vector.
	 * @param res
	 *     The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	<T extends Tup3WF> T halfPointBetweenR(float v2x, float v2y, float v2z, @ExtractionParam T res);
	
	/**
	 * Returns the origin vector to the point that lies half way between the endpoint of this vector
	 * and the endpoint of the given vector {@code (v2x, v2y, v2z)} as the extraction parameter
	 * {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ( (v2x, v2y, v2z) + v ) / 2}
	 * 
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
	float[] halfPointBetweenR(float v2x, float v2y, float v2z, @ExtractionParam @MinLength(3) float[] res);
	
	/**
	 * Negates this vector and returns the result as the extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * It is safe to use this vector as the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code -v}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter.
	 * 
	 * @param res
	 *     The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	<T extends Tup3WF> T negateR(@ExtractionParam T res);
	
	/**
	 * Negates this vector and returns the result as the extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code -v}
	 * 
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	float[] negateR(@ExtractionParam @MinLength(3) float[] res);
	
	/**
	 * Inverses this vector and returns the result as the extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * It is safe to use this vector as the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code 1 / v}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter.
	 * 
	 * @param res
	 *     The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	<T extends Tup3WF> T inverseR(@ExtractionParam T res);
	
	/**
	 * Inverses this vector and returns the result as the extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code 1 / v}
	 * 
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	float[] inverseR(@ExtractionParam @MinLength(3) float[] res);
	
	/**
	 * Normalizes this vector and returns the result as the extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * It is safe to use this vector as the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v / |v|}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter.
	 * 
	 * @param res
	 *     The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	<T extends Tup3WF> T normalizeR(@ExtractionParam T res);
	
	/**
	 * Normalizes this vector and returns the result as the extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v / |v|}
	 * 
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	float[] normalizeR(@ExtractionParam @MinLength(3) float[] res);
	
	/**
	 * Compares each component of this vector with the corresponding component of the given vector
	 * {@code (v2)} and returns the smallest values as the extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * It is safe to use this vector as the extraction parameter.
	 * 
	 * @param <T>
	 *     The type of the extraction parameter.
	 * 
	 * @param v2
	 *     The second vector.
	 * @param res
	 *     The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	<T extends Tup3WF> T minVectorR(Tup3RF v2, @ExtractionParam T res);
	
	/**
	 * Compares each component of this vector with the corresponding component of the given vector
	 * {@code (v2)} and returns the smallest values as the extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * @param v2
	 *     The second vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	float[] minVectorR(Tup3RF v2, @ExtractionParam @MinLength(3) float[] res);
	
	/**
	 * Compares each component of this vector with the corresponding component of the given vector
	 * {@code (v2[0], v2[1], v2[2])} and returns the smallest values as the extraction parameter
	 * {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * It is safe to use this vector as the extraction parameter.
	 * 
	 * @param <T>
	 *     The type of the extraction parameter.
	 * 
	 * @param v2
	 *     The second vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	<T extends Tup3WF> T minVectorR(@MinLength(3) float[] v2, @ExtractionParam T res);
	
	/**
	 * Compares each component of this vector with the corresponding component of the given vector
	 * {@code (v2[0], v2[1], v2[2])} and returns the smallest values as the extraction parameter
	 * {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * It is safe to use the given vector {@code v2} as the extraction parameter.
	 * 
	 * @param v2
	 *     The second vector as an array with at least three entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	float[] minVectorR(@MinLength(3) float[] v2, @ExtractionParam @MinLength(3) float[] res);
	
	/**
	 * Compares each component of this vector with the corresponding component of the given vector
	 * {@code (v2x, v2y, v2z)} and returns the smallest values as the extraction parameter
	 * {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * It is safe to use this vector as the extraction parameter.
	 * 
	 * @param <T>
	 *     The type of the extraction parameter.
	 * 
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * @param v2z
	 *     The value of the z component of the second vector.
	 * @param res
	 *     The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	<T extends Tup3WF> T minVectorR(float v2x, float v2y, float v2z, @ExtractionParam T res);
	
	/**
	 * Compares each component of this vector with the corresponding component of the given vector
	 * {@code (v2x, v2y, v2z)} and returns the smallest values as the extraction parameter
	 * {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
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
	float[] minVectorR(float v2x, float v2y, float v2z, @ExtractionParam @MinLength(3) float[] res);
	
	/**
	 * Compares each component of this vector with the corresponding component of the given vector
	 * {@code (v2)} and returns the greatest values as the extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * It is safe to use this vector as the extraction parameter.
	 * 
	 * @param <T>
	 *     The type of the extraction parameter.
	 * 
	 * @param v2
	 *     The second vector.
	 * @param res
	 *     The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	<T extends Tup3WF> T maxVectorR(Tup3RF v2, @ExtractionParam T res);
	
	/**
	 * Compares each component of this vector with the corresponding component of the given vector
	 * {@code (v2)} and returns the greatest values as the extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * @param v2
	 *     The second vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	float[] maxVectorR(Tup3RF v2, @ExtractionParam @MinLength(3) float[] res);
	
	/**
	 * Compares each component of this vector with the corresponding component of the given vector
	 * {@code (v2[0], v2[1],v2[2])} and returns the greatest values as the extraction parameter
	 * {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * It is safe to use this vector as the extraction parameter.
	 * 
	 * @param <T>
	 *     The type of the extraction parameter.
	 * 
	 * @param v2
	 *     The second vector as an array with at least three entries.
	 * @param res
	 *     The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	<T extends Tup3WF> T maxVectorR(@MinLength(3) float[] v2, @ExtractionParam T res);
	
	/**
	 * Compares each component of this vector with the corresponding component of the given vector
	 * {@code (v2[0], v2[1], v2[2])} and returns the greatest values as the extraction parameter
	 * {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * It is safe to use the given vector {@code v2} as the extraction parameter.
	 * 
	 * @param v2
	 *     The second vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	float[] maxVectorR(@MinLength(3) float[] v2, @ExtractionParam @MinLength(3) float[] res);
	
	/**
	 * Compares each component of this vector with the corresponding component of the given vector
	 * {@code (v2x, v2y, v2z)} and returns the greatest values as the extraction parameter
	 * {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * It is safe to use this vector as the extraction parameter.
	 * 
	 * @param <T>
	 *     The type of the extraction parameter.
	 * 
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * @param v2z
	 *     The value of the z component of the second vector.
	 * @param res
	 *     The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	<T extends Tup3WF> T maxVectorR(float v2x, float v2y, float v2z, @ExtractionParam T res);
	
	/**
	 * Compares each component of this vector with the corresponding component of the given vector
	 * {@code (v2x, v2y, v2z)} and returns the greatest values as the extraction parameter
	 * {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
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
	float[] maxVectorR(float v2x, float v2y, float v2z, @ExtractionParam @MinLength(3) float[] res);
	
	/**
	 * Rotates this vector by the given angle in radians around the rotation axis {@code (axis)} and
	 * saves the result in the given extraction parameter object.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * It is safe to use this vector as the extraction parameter.
	 * 
	 * @param <T>
	 *     The type of the extraction parameter.
	 * 
	 * @param axis
	 *     The rotation axis.
	 * @param angle
	 *     The angle in radians.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	<T extends Tup3WF> T rotateRadR(Tup3RF axis, float angle, @ExtractionParam T res);
	
	/**
	 * Rotates this vector by the given angle in radians around the rotation axis {@code (axis)} and
	 * saves the result in the given extraction parameter object.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * It is safe to use this vector as the extraction parameter.
	 * 
	 * @param <T>
	 *     The type of the extraction parameter.
	 * 
	 * @param axis
	 *     The rotation axis.
	 * @param angle
	 *     The angle in radians.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	<T extends Tup3WF> T rotateRadR(Tup3RF axis, float angle, MathProvider mathProvider, @ExtractionParam T res);
	
	/**
	 * Rotates this vector by the given angle in radians around the rotation axis
	 * {@code (axis[0], axis[1], axis[2])} and saves the result in the given extraction parameter
	 * object.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * It is safe to use this vector as the extraction parameter.
	 * 
	 * @param <T>
	 *     The type of the extraction parameter.
	 * 
	 * @param axis
	 *     The rotation axis as an array with at least three entries.
	 * @param angle
	 *     The angle in radians.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	<T extends Tup3WF> T rotateRadR(@MinLength(3) float[] axis, float angle, @ExtractionParam T res);
	
	/**
	 * Rotates this vector by the given angle in radians around the rotation axis
	 * {@code (axis[0], axis[1], axis[2])} and saves the result in the given extraction parameter
	 * object.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * It is safe to use this vector as the extraction parameter.
	 * 
	 * @param <T>
	 *     The type of the extraction parameter.
	 * 
	 * @param axis
	 *     The rotation axis as an array with at least three entries.
	 * @param angle
	 *     The angle in radians.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	<T extends Tup3WF> T rotateRadR(@MinLength(3) float[] axis, float angle, MathProvider mathProvider, @ExtractionParam T res);
	
	/**
	 * Rotates this vector by the given angle in radians around the rotation axis
	 * {@code (axisX, axisY, axisZ)} and saves the result in the given extraction parameter object.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * It is safe to use this vector as the extraction parameter.
	 * 
	 * @param <T>
	 *     The type of the extraction parameter.
	 * 
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
	<T extends Tup3WF> T rotateRadR(float axisX, float axisY, float axisZ, float angle, @ExtractionParam T res);
	
	/**
	 * Rotates this vector by the given angle in radians around the rotation axis
	 * {@code (axisX, axisY, axisZ)} and saves the result in the given extraction parameter object.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * It is safe to use this vector as the extraction parameter.
	 * 
	 * @param <T>
	 *     The type of the extraction parameter.
	 * 
	 * @param axisX
	 *     The value of the x component of the rotation axis.
	 * @param axisY
	 *     The value of the y component of the rotation axis.
	 * @param axisZ
	 *     The value of the z component of the rotation axis.
	 * @param angle
	 *     The angle in radians.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	<T extends Tup3WF> T rotateRadR(float axisX, float axisY, float axisZ, float angle, MathProvider mathProvider, @ExtractionParam T res);
	
	/**
	 * Rotates this vector by the given angle in radians around the rotation axis {@code (axis)} and
	 * saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * @param axis
	 *     The rotation axis.
	 * @param angle
	 *     The angle in radians.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	float[] rotateRadR(Tup3RF axis, float angle, @ExtractionParam @MinLength(3) float[] res);
	
	/**
	 * Rotates this vector by the given angle in radians around the rotation axis {@code (axis)} and
	 * saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * It is safe to use this vector as the extraction parameter.
	 * 
	 * @param axis
	 *     The rotation axis.
	 * @param angle
	 *     The angle in radians.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	float[] rotateRadR(Tup3RF axis, float angle, MathProvider mathProvider, @ExtractionParam @MinLength(2) float[] res);
	
	/**
	 * Rotates this vector by the given angle in radians around the rotation axis
	 * {@code (axis[0], axis[1], axis[2])} and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * @param axis
	 *     The rotation axis as an array with at least three entries.
	 * @param angle
	 *     The angle in radians.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	float[] rotateRadR(@MinLength(3) float[] axis, float angle, @ExtractionParam @MinLength(3) float[] res);
	
	/**
	 * Rotates this vector by the given angle in radians around the rotation axis
	 * {@code (axis[0], axis[1], axis[2])} and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * It is safe to use this vector as the extraction parameter.
	 * 
	 * @param axis
	 *     The rotation axis as an array with at least three entries.
	 * @param angle
	 *     The angle in radians.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	float[] rotateRadR(@MinLength(3) float[] axis, float angle, MathProvider mathProvider, @ExtractionParam @MinLength(2) float[] res);
	
	/**
	 * Rotates this vector by the given angle in radians around the rotation axis
	 * {@code (axisX, axisY, axisZ)} and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
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
	float[] rotateRadR(float axisX, float axisY, float axisZ, float angle, @ExtractionParam @MinLength(3) float[] res);
	
	/**
	 * Rotates this vector by the given angle in radians around the rotation axis
	 * {@code (axisX, axisY, axisZ)} and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * It is safe to use this vector as the extraction parameter.
	 * 
	 * @param axisX
	 *     The value of the x component of the rotation axis.
	 * @param axisY
	 *     The value of the y component of the rotation axis.
	 * @param axisZ
	 *     The value of the z component of the rotation axis.
	 * @param angle
	 *     The angle in radians.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	float[] rotateRadR(float axisX, float axisY, float axisZ, float angle, MathProvider mathProvider, @ExtractionParam @MinLength(2) float[] res);
	
	/**
	 * Rotates this vector by the given angle in degrees around the rotation axis {@code (axis)} and
	 * saves the result in the given extraction parameter object.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * It is safe to use this vector as the extraction parameter.
	 * 
	 * @param <T>
	 *     The type of the extraction parameter.
	 * 
	 * @param axis
	 *     The rotation axis.
	 * @param angle
	 *     The angle in radians.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	<T extends Tup3WF> T rotateDegR(Tup3RF axis, float angle, @ExtractionParam T res);
	
	/**
	 * Rotates this vector by the given angle in degrees around the rotation axis {@code (axis)} and
	 * saves the result in the given extraction parameter object.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * It is safe to use this vector as the extraction parameter.
	 * 
	 * @param <T>
	 *     The type of the extraction parameter.
	 * 
	 * @param axis
	 *     The rotation axis
	 * @param angle
	 *     The angle in radians.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	<T extends Tup3WF> T rotateDegR(Tup3RF axis, float angle, MathProvider mathProvider, @ExtractionParam T res);
	
	/**
	 * Rotates this vector by the given angle in degrees around the rotation axis
	 * {@code (axis[0], axis[1], axis[2])} and saves the result in the given extraction parameter
	 * object.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * It is safe to use this vector as the extraction parameter.
	 * 
	 * @param <T>
	 *     The type of the extraction parameter.
	 * 
	 * @param axis
	 *     The rotation axis as an array with at least three entries.
	 * @param angle
	 *     The angle in radians.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	<T extends Tup3WF> T rotateDegR(@MinLength(3) float[] axis, float angle, @ExtractionParam T res);
	
	/**
	 * Rotates this vector by the given angle in degrees around the rotation axis
	 * {@code (axis[0], axis[1], axis[2])} and saves the result in the given extraction parameter
	 * object.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * It is safe to use this vector as the extraction parameter.
	 * 
	 * @param <T>
	 *     The type of the extraction parameter.
	 * 
	 * @param axis
	 *     The rotation axis as an array with at least three entries.
	 * @param angle
	 *     The angle in radians.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	<T extends Tup3WF> T rotateDegR(@MinLength(3) float[] axis, float angle, MathProvider mathProvider, @ExtractionParam T res);
	
	/**
	 * Rotates this vector by the given angle in degrees around the rotation axis
	 * {@code (axisX, axisY, axisZ)} and saves the result in the given extraction parameter object.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * It is safe to use this vector as the extraction parameter.
	 * 
	 * @param <T>
	 *     The type of the extraction parameter.
	 * 
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
	<T extends Tup3WF> T rotateDegR(float axisX, float axisY, float axisZ, float angle, @ExtractionParam T res);
	
	/**
	 * Rotates this vector by the given angle in degrees around the rotation axis
	 * {@code (axisX, axisY, axisZ)} and saves the result in the given extraction parameter object.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * It is safe to use this vector as the extraction parameter.
	 * 
	 * @param <T>
	 *     The type of the extraction parameter.
	 * 
	 * @param axisX
	 *     The value of the x component of the rotation axis.
	 * @param axisY
	 *     The value of the y component of the rotation axis.
	 * @param axisZ
	 *     The value of the z component of the rotation axis.
	 * @param angle
	 *     The angle in radians.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	<T extends Tup3WF> T rotateDegR(float axisX, float axisY, float axisZ, float angle, MathProvider mathProvider, @ExtractionParam T res);
	
	/**
	 * Rotates this vector by the given angle in degrees around the rotation axis {@code (axis)} and
	 * saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * @param axis
	 *     The rotation axis.
	 * @param angle
	 *     The angle in radians.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	float[] rotateDegR(Tup3RF axis, float angle, @ExtractionParam @MinLength(3) float[] res);
	
	/**
	 * Rotates this vector by the given angle in degrees around the rotation axis {@code (axis)} and
	 * saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * @param axis
	 *     The rotation axis.
	 * @param angle
	 *     The angle in radians.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	float[] rotateDegR(Tup3RF axis, float angle, MathProvider mathProvider, @ExtractionParam @MinLength(3) float[] res);
	
	/**
	 * Rotates this vector by the given angle in degrees around the rotation axis
	 * {@code (axis[0], axis[1], axis[2])} and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * @param axis
	 *     The rotation axis as an array with at least three entries.
	 * @param angle
	 *     The angle in radians.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	float[] rotateDegR(@MinLength(3) float[] axis, float angle, @ExtractionParam @MinLength(3) float[] res);
	
	/**
	 * Rotates this vector by the given angle in degrees around the rotation axis
	 * {@code (axis[0], axis[1], axis[2])} and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * @param axis
	 *     The rotation axis as an array with at least three entries.
	 * @param angle
	 *     The angle in radians.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	float[] rotateDegR(@MinLength(3) float[] axis, float angle, MathProvider mathProvider, @ExtractionParam @MinLength(3) float[] res);
	
	/**
	 * Rotates this vector by the given angle in degrees around the rotation axis
	 * {@code (axisX, axisY, axisZ)} and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
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
	float[] rotateDegR(float axisX, float axisY, float axisZ, float angle, @ExtractionParam @MinLength(3) float[] res);
	
	/**
	 * Rotates this vector by the given angle in degrees around the rotation axis
	 * {@code (axisX, axisY, axisZ)} and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * @param axisX
	 *     The value of the x component of the rotation axis.
	 * @param axisY
	 *     The value of the y component of the rotation axis.
	 * @param axisZ
	 *     The value of the z component of the rotation axis.
	 * @param angle
	 *     The angle in radians.
	 * @param mathProvider
	 *     The provider of fundamental math functions that should be used for calculation.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	float[] rotateDegR(float axisX, float axisY, float axisZ, float angle, MathProvider mathProvider, @ExtractionParam @MinLength(3) float[] res);
	
	/**
	 * Calculates the orthogonal projection of this vector onto the normalized target vector
	 * {@code (t)} and saves the result in the given extraction parameter object.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * It is safe to use this vector as the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code t * (v . t)}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter.
	 * 
	 * @param t
	 *     The projection target vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	<T extends Tup3WF> T projectR(Tup3RF t, @ExtractionParam T res);
	
	/**
	 * Calculates the orthogonal projection of this vector onto the normalized target vector
	 * {@code (t[0], t[1], t[2])} and saves the result in the given extraction parameter object.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * It is safe to use this vector as the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (t[0], t[1], t[2]) * (v . (t[0], t[1], t[2]))}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter.
	 * 
	 * @param t
	 *     The projection target vector as an array with at least three entries.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	<T extends Tup3WF> T projectR(@MinLength(3) float[] t, @ExtractionParam T res);
	
	/**
	 * Calculates the orthogonal projection of this vector onto the normalized target vector
	 * {@code (tX, tY, tZ)} and saves the result in the given extraction parameter object.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * It is safe to use this vector as the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (tX, tY, tZ) * (v . (tX, tY, tZ))}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter.
	 * 
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
	<T extends Tup3WF> T projectR(float tX, float tY, float tZ, @ExtractionParam T res);
	
	/**
	 * Calculates the orthogonal projection of this vector onto the normalized target vector
	 * {@code (t)} and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code t * (v . t)}
	 * 
	 * @param t
	 *     The projection target vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	float[] projectR(Tup3RF t, @ExtractionParam @MinLength(3) float[] res);
	
	/**
	 * Calculates the orthogonal projection of this vector onto the normalized target vector
	 * {@code (t[0], t[1], t[2])} and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (t[0], t[1], t[2]) * (v . (t[0], t[1], t[2]))}
	 * 
	 * @param t
	 *     The projection target vector as an array with at least three entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	float[] projectR(@MinLength(3) float[] t, @ExtractionParam @MinLength(3) float[] res);
	
	/**
	 * Calculates the orthogonal projection of this vector onto the normalized target vector
	 * {@code (tX, tY, tZ)} and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (tX, tY, tZ) * (v . (tX, tY, tZ))}
	 * 
	 * @param tX
	 *     The value of the x component of the projection target vector.
	 * @param tY
	 *     The value of the y component of the projection target vector.
	 * @param tZ
	 *     The value of the z component of the projection target vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	float[] projectR(float tX, float tY, float tZ, @ExtractionParam @MinLength(3) float[] res);
	
	/**
	 * Calculates the reflection of this vector based on the given normalized surface normal
	 * {@code (n)} and saves the result in the given extraction parameter object.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * It is safe to use this vector as the extraction parameter.
	 * 
	 * @param <T>
	 *     The type of the extraction parameter.
	 * 
	 * @param n
	 *     The surface normal vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	<T extends Tup3WF> T reflectR(Tup3RF n, @ExtractionParam T res);
	
	/**
	 * Calculates the reflection of this vector based on the given normalized surface normal
	 * {@code (n[0], n[1], n[2])} and saves the result in the given extraction parameter object.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * It is safe to use this vector as the extraction parameter.
	 * 
	 * @param <T>
	 *     The type of the extraction parameter.
	 * 
	 * @param n
	 *     The surface normal vector as an array with at least three entries.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	<T extends Tup3WF> T reflectR(@MinLength(3) float[] n, @ExtractionParam T res);
	
	/**
	 * Calculates the reflection of this vector based on the given normalized surface normal
	 * {@code (nX, nY, nZ)} and saves the result in the given extraction parameter object.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * It is safe to use this vector as the extraction parameter.
	 * 
	 * @param <T>
	 *     The type of the extraction parameter.
	 * 
	 * @param nX
	 *     The value of the x component of the surface normal vector.
	 * @param nY
	 *     The value of the y component of the surface normal vector.
	 * @param nZ
	 *     The value of the z component of the surface normal vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	<T extends Tup3WF> T reflectR(float nX, float nY, float nZ, @ExtractionParam T res);
	
	/**
	 * Calculates the reflection of this vector based on the given normalized surface normal
	 * {@code (n)} and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * @param n
	 *     The surface normal vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	float[] reflectR(Tup3RF n, @ExtractionParam @MinLength(3) float[] res);
	
	/**
	 * Calculates the reflection of this vector based on the given normalized surface normal
	 * {@code (n[0], n[1], n[2])} and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * @param n
	 *     The surface normal vector as an array with at least three entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	float[] reflectR(@MinLength(3) float[] n, @ExtractionParam @MinLength(3) float[] res);
	
	/**
	 * Calculates the reflection of this vector based on the given normalized surface normal
	 * {@code (nX, nY, nZ)} and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
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
	float[] reflectR(float nX, float nY, float nZ, @ExtractionParam @MinLength(3) float[] res);
	
	/**
	 * Rounds the components of this vector towards the next greater integer and saves the result in
	 * the given extraction parameter object.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	<T extends Tup3WF> T ceilR(@ExtractionParam T res);
	
	/**
	 * Rounds the components of this vector towards the next greater integer and saves the result in
	 * the extraction parameter.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	float[] ceilR(@ExtractionParam @MinLength(3) float[] res);
	
	/**
	 * Rounds the components of this vector towards the next smaller integer and saves the result in
	 * the given extraction parameter object.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	<T extends Tup3WF> T floorR(@ExtractionParam T res);
	
	/**
	 * Rounds the components of this vector towards the next smaller integer and saves the result in
	 * the extraction parameter.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	float[] floorR(@ExtractionParam @MinLength(3) float[] res);
	
	/**
	 * Rounds the components of this vector and saves the result in the given extraction parameter
	 * object.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	<T extends Tup3WF> T roundR(@ExtractionParam T res);
	
	/**
	 * Rounds the components of this vector and saves the result in the extraction parameter.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	float[] roundR(@ExtractionParam @MinLength(3) float[] res);
	
	/**
	 * Truncates the decimals of the components of this vector and saves the result in the given
	 * extraction parameter object.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	<T extends Tup3WF> T truncR(@ExtractionParam T res);
	
	/**
	 * Truncates the decimals of the components of this vector and saves the result in the
	 * extraction parameter.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	float[] truncR(@ExtractionParam @MinLength(3) float[] res);
	
	/**
	 * Rounds the components of this vector using the given method and saves the result in the given
	 * extraction parameter object.
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param method
	 *     The Method to use for rounding.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	<T extends Tup3WF> T roundR(FloatRoundMethod method, @ExtractionParam T res);
	
	/**
	 * Rounds the components of this vector using the given method and saves the result in the
	 * extraction parameter.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * @param method
	 *     The Method to use for rounding.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	float[] roundR(FloatRoundMethod method, @ExtractionParam @MinLength(3) float[] res);
	
	/**
	 * Calculates the absolute values of the component values and saves the result in the extraction
	 * parameter.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * @param <T>
	 *     The type of the extraction parameter.
	 * 
	 * @param res
	 *     The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	<T extends Tup3WF> T absR(@ExtractionParam T res);
	
	/**
	 * Calculates the absolute values of the component values and saves the result in the extraction
	 * parameter.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	float[] absR(@ExtractionParam @MinLength(3) float[] res);
	
	/**
	 * Calculates the cross product between this vector and the second given vector {@code (v2)} and
	 * saves the result in the extraction parameter.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v X v2}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter.
	 * 
	 * @param v2
	 *     The second vector.
	 * @param res
	 *     The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	<T extends Tup3WF> T crossR(Tup3RF v2, @ExtractionParam T res);
	
	/**
	 * Calculates the cross product between this vector and the second given vector
	 * {@code (v2[0], v2[1], v2[2])} and saves the result in the extraction parameter.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v X (v2[0], v2[1], v2[2])}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter.
	 * 
	 * @param v2
	 *     The second vector as an array with at least three entries.
	 * @param res
	 *     The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	<T extends Tup3WF> T crossR(@MinLength(3) float[] v2, @ExtractionParam T res);
	
	/**
	 * Calculates the cross product between this vector and the second given vector
	 * {@code (value, value, value)} and saves the result in the extraction parameter.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v X (value, value, value)}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter.
	 * 
	 * @param value
	 *     The value for all the components of the second vector.
	 * @param res
	 *     The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	<T extends Tup3WF> T crossR(float value, @ExtractionParam T res);
	
	/**
	 * Calculates the cross product between this vector and the second given vector
	 * {@code (v2x, v2y, v2z)} and saves the result in the extraction parameter.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v X (v2x, v2y, v2z)}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter.
	 * 
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * @param v2z
	 *     The value of the z component of the second vector.
	 * @param res
	 *     The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	<T extends Tup3WF> T crossR(float v2x, float v2y, float v2z, @ExtractionParam T res);
	
	/**
	 * Calculates the cross product between this vector and the second given vector {@code (v2)} and
	 * saves the result in the extraction parameter.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v X v2}
	 * 
	 * @param v2
	 *     The second vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	float[] crossR(Tup3RF v2, @ExtractionParam @MinLength(3) float[] res);
	
	/**
	 * Calculates the cross product between this vector and the second given vector
	 * {@code (v2[0], v2[1], v2[2])} and saves the result in the extraction parameter.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v X (v2[0], v2[1], v2[2])}
	 * 
	 * @param v2
	 *     The second vector as an array with at least three entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	float[] crossR(@MinLength(3) float[] v2, @ExtractionParam @MinLength(3) float[] res);
	
	/**
	 * Calculates the cross product between this vector and the second given vector
	 * {@code (value, value, value)} and saves the result in the extraction parameter.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v X (value, value, value)}
	 * 
	 * @param value
	 *     The value for all the components of the second vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	float[] crossR(float value, @ExtractionParam @MinLength(3) float[] res);
	
	/**
	 * Calculates the cross product between this vector and the second given vector
	 * {@code (v2x, v2y, v2z)} and saves the result in the extraction parameter.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v X (v2x, v2y, v2z)}
	 * 
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
	float[] crossR(float v2x, float v2y, float v2z, @ExtractionParam @MinLength(3) float[] res);
	
	/**
	 * Calculates the {@link Math#signum(float) signum} of the components of this vecotr and saves
	 * the result in the extraction parameter.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * @param <T>
	 *     The type of the extraction parameter.
	 * 
	 * @param res
	 *     The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	<T extends Tup3WF> T signumR(@ExtractionParam T res);
	
	/**
	 * Calculates the {@link Math#signum(float) signum} of the components of this vecotr and saves
	 * the result in the extraction parameter.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	float[] signumR(@ExtractionParam @MinLength(3) float[] res);
	
	/**
	 * Linearly integrates over the second given vector {@code (v2)} by the integrator
	 * {@code (alpha)}, adds the result to this vector and saves the final result in the given
	 * extraction parameter. This assumes an integration delta of 1.0 so that the integration is
	 * over {@code (alpha / 1.0)}, therefore if {@code (alpha)} is 1.0 the unscaled second vector is
	 * added. Otherwise it will be scaled before adding.
	 * 
	 * <p>
	 * The main difference between interpolation and integration is that interpolation is by default
	 * designed to map a alpha value between 0.0 and 1.0 to the range between a zero-vector and a
	 * given vector. If the alpha value exceeds the range between 0.0 and 1.0 the result might be
	 * unexpected. Whereas an integration can exceed the range and will scale the given vector by
	 * the factor.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v2
	 *     The second vector. This vector will be integrated over.
	 * @param alpha
	 *     The integrator with an integration delta of 1.0f {@code (alpha / 1.0f)}.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	<T extends Tup3WF> T integrateLinearR(Tup3RF v2, float alpha, @ExtractionParam T res);
	
	/**
	 * Linearly integrates over the second given vector {@code (v2[0], v2[1], v2[2])} by the
	 * integrator {@code (alpha)}, adds the result to this vector and saves the final result in the
	 * given extraction parameter. This assumes an integration delta of 1.0 so that the integration
	 * is over {@code (alpha / 1.0)}, therefore if {@code (alpha)} is 1.0 the unscaled second vector
	 * is added. Otherwise it will be scaled before adding.
	 * 
	 * <p>
	 * The main difference between interpolation and integration is that interpolation is by default
	 * designed to map a alpha value between 0.0 and 1.0 to the range between a zero-vector and a
	 * given vector. If the alpha value exceeds the range between 0.0 and 1.0 the result might be
	 * unexpected. Whereas an integration can exceed the range and will scale the given vector by
	 * the factor.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
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
	<T extends Tup3WF> T integrateLinearR(@MinLength(3) float[] v2, float alpha, @ExtractionParam T res);
	
	/**
	 * Linearly integrates over the second given vector {@code (v2x, v2y, v2z)} by the integrator
	 * {@code (alpha)}, adds the result to this vector and saves the final result in the given
	 * extraction parameter. This assumes an integration delta of 1.0 so that the integration is
	 * over {@code (alpha / 1.0)}, therefore if {@code (alpha)} is 1.0 the unscaled second vector is
	 * added. Otherwise it will be scaled before adding.
	 * 
	 * <p>
	 * The main difference between interpolation and integration is that interpolation is by default
	 * designed to map a alpha value between 0.0 and 1.0 to the range between a zero-vector and a
	 * given vector. If the alpha value exceeds the range between 0.0 and 1.0 the result might be
	 * unexpected. Whereas an integration can exceed the range and will scale the given vector by
	 * the factor.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
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
	<T extends Tup3WF> T integrateLinearR(float v2x, float v2y, float v2z, float alpha, @ExtractionParam T res);
	
	/**
	 * Linearly integrates over the second given vector {@code (v2)} by the integrator
	 * {@code (alpha)}, adds the result to this vector and saves the final result in the given
	 * extraction parameter. This assumes an integration delta of 1.0 so that the integration is
	 * over {@code (alpha / 1.0)}, therefore if {@code (alpha)} is 1.0 the unscaled second vector is
	 * added. Otherwise it will be scaled before adding.
	 * 
	 * <p>
	 * The main difference between interpolation and integration is that interpolation is by default
	 * designed to map a alpha value between 0.0 and 1.0 to the range between a zero-vector and a
	 * given vector. If the alpha value exceeds the range between 0.0 and 1.0 the result might be
	 * unexpected. Whereas an integration can exceed the range and will scale the given vector by
	 * the factor.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * @param v2
	 *     The second vector. This vector will be integrated over.
	 * @param alpha
	 *     The integrator with an integration delta of 1.0f {@code (alpha / 1.0f)}.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	float[] integrateLinearR(Tup3RF v2, float alpha, @ExtractionParam @MinLength(3) float[] res);
	
	/**
	 * Linearly integrates over the second given vector {@code (v2[0], v2[1], v2[2])} by the
	 * integrator {@code (alpha)}, adds the result to this vector and saves the final result in the
	 * given extraction parameter. This assumes an integration delta of 1.0 so that the integration
	 * is over {@code (alpha / 1.0)}, therefore if {@code (alpha)} is 1.0 the unscaled second vector
	 * is added. Otherwise it will be scaled before adding.
	 * 
	 * <p>
	 * The main difference between interpolation and integration is that interpolation is by default
	 * designed to map a alpha value between 0.0 and 1.0 to the range between a zero-vector and a
	 * given vector. If the alpha value exceeds the range between 0.0 and 1.0 the result might be
	 * unexpected. Whereas an integration can exceed the range and will scale the given vector by
	 * the factor.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
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
	float[] integrateLinearR(@MinLength(3) float[] v2, float alpha, @ExtractionParam @MinLength(3) float[] res);
	
	/**
	 * Linearly integrates over the second given vector {@code (v2x, v2y, v2z)} by the integrator
	 * {@code (alpha)}, adds the result to this vector and saves the final result in the given
	 * extraction parameter. This assumes an integration delta of 1.0 so that the integration is
	 * over {@code (alpha / 1.0)}, therefore if {@code (alpha)} is 1.0 the unscaled second vector is
	 * added. Otherwise it will be scaled before adding.
	 * 
	 * <p>
	 * The main difference between interpolation and integration is that interpolation is by default
	 * designed to map a alpha value between 0.0 and 1.0 to the range between a zero-vector and a
	 * given vector. If the alpha value exceeds the range between 0.0 and 1.0 the result might be
	 * unexpected. Whereas an integration can exceed the range and will scale the given vector by
	 * the factor.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
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
	float[] integrateLinearR(float v2x, float v2y, float v2z, float alpha, @ExtractionParam @MinLength(3) float[] res);
	
	/**
	 * Transforms this vector by the quaternion {@code (q)} and saves the result in the given
	 * extraction parameter object.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * q * v * q*
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param q
	 *     The quaternion.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	<T extends Tup3WF> T transformQuatR(SimpleQuatfR q, @ExtractionParam T res);
	
	/**
	 * Transforms this vector by the quaternion {@code (q)} and saves the result in the given
	 * extraction parameter object.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * q * v * q*
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param q
	 *     The quaternion.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	<T extends Tup3WF> T transformQuatR(Tup4RF q, @ExtractionParam T res);
	
	/**
	 * Transforms this vector by the quaternion {@code (q[0], q[1], q[2], q[3])} and saves the
	 * result in the given extraction parameter object.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * (q[0], q[1], q[2], q[3]) * v * (q[0], q[1], q[2], q[3])*
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param q
	 *     The quaternion as an array with at least four entries.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	<T extends Tup3WF> T transformQuatR(@MinLength(4) float[] q, @ExtractionParam T res);
	
	/**
	 * Transforms this vector by the quaternion {@code (qX, qY, qZ, qW)} and saves the result in the
	 * given extraction parameter object.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * (qX, qY, qZ, qw) * v * (qX, qY, qZ, qW)*
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
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
	<T extends Tup3WF> T transformQuatR(float qW, float qX, float qY, float qZ, @ExtractionParam T res);
	
	/**
	 * Transforms this vector by the quaternion {@code (q)} and saves the result in the given
	 * extraction parameter.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * q * v * q*
	 * 
	 * @param q
	 *     The quaternion.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	float[] transformQuatR(SimpleQuatfR q, @ExtractionParam @MinLength(3) float[] res);
	
	/**
	 * Transforms this vector by the quaternion {@code (q)} and saves the result in the given
	 * extraction parameter.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * q * v * q*
	 * 
	 * @param q
	 *     The quaternion.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	float[] transformQuatR(Tup4RF q, @ExtractionParam @MinLength(3) float[] res);
	
	/**
	 * Transforms this vector {@code (v)} by the quaternion {@code (q[0], q[1], q[2], q[3])} and
	 * saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * (q[0], q[1], q[2], q[3]) * v * (q[0], q[1], q[2], q[3])*
	 * 
	 * @param q
	 *     The quaternion as an array with at least four entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	float[] transformQuatR(@MinLength(4) float[] q, @ExtractionParam @MinLength(3) float[] res);
	
	/**
	 * Transforms this vector by the quaternion {@code (qX, qY, qZ, qW)} and saves the result in the
	 * given extraction parameter.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * (qX, qY, qZ, qw) * v * (qX, qY, qZ, qW)*
	 * 
	 * @param qW
	 *     The value of the x component of the quaternion.
	 * @param qX
	 *     The value of the x component of the quaternion.
	 * @param qY
	 *     The value of the x component of the quaternion.
	 * @param qZ
	 *     The value of the x component of the quaternion.
	 * @param res
	 *     The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	float[] transformQuatR(float qW, float qX, float qY, float qZ, @ExtractionParam @MinLength(3) float[] res);
	
	<T extends Tup3WF> T transformVectorMat4R(SimpleMat4fR m, @ExtractionParam T res);
	
	<T extends Tup3WF> T transformVectorMat4R(@MinLength2d(a0=4, a1=4) float[][] m, @ExtractionParam T res);
	
	float[] transformVectorMat4R(SimpleMat4fR m, @ExtractionParam @MinLength(3) float[] res);
	
	<T extends Tup3WF> T transformPointMat4R(SimpleMat4fR m, @ExtractionParam T res);
	
	float[] transformVectorMat4R(@MinLength2d(a0=4, a1=4) float[][] m, @ExtractionParam @MinLength(3) float[] res);
	
	<T extends Tup3WF> T transformPointMat4R(@MinLength2d(a0=4, a1=4) float[][] m, @ExtractionParam T res);
	
	float[] transformPointMat4R(SimpleMat4fR m, @ExtractionParam @MinLength(3) float[] res);
	
	float[] transformPointMat4R(@MinLength2d(a0=4, a1=4) float[][] m, @ExtractionParam @MinLength(3) float[] res);
}
