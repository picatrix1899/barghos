package org.barghos.math.vector;

import org.barghos.annotation.ExtractionParam;
import org.barghos.annotation.FloatMinValue;
import org.barghos.annotation.MinLength;
import org.barghos.util.collection.IndexValuePairF;
import org.barghos.util.math.MathProvider;
import org.barghos.util.math.RoundMethodF;
import org.barghos.util.tuple.floats.Tup2RF;
import org.barghos.util.tuple.floats.Tup2WF;

/**
 * This interface provides non-invasive (read only) functions and methods for float vectors with two
 * dimensions.
 */
public interface Vec2RF extends Tup2RF
{	
	/** {@inheritDoc} */
	@Override
	Vec2RF createNew(Tup2RF v);
	
	/** {@inheritDoc} */
	@Override
	Vec2RF createNew(@MinLength(2) float... v);
	
	/** {@inheritDoc} */
	@Override
	Vec2RF createNew(float value);
	
	/** {@inheritDoc} */
	@Override
	Vec2RF createNew(float x, float y);
	
	/** {@inheritDoc} */
	@Override
	Vec2RF copy();
	
	/**
	 * Returns the x component of the vector.
	 * 
	 * @return The x component.
	 */
	float x();
	
	/**
	 * Returns the y component of the vector.
	 * 
	 * @return The y component.
	 */
	float y();
	
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
	float len();
	
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
	float len(@FloatMinValue(0.0f) float tolerance);
	
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
	float invLen();
	
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
	float dist(Tup2RF v2);
	
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
	float dist(Tup2RF v2, @FloatMinValue(0.0f) float tolerance);
	
	/**
	 * Returns the distance between the endpoint of this vector and the endpoint of the given vector
	 * {@code (v2[0], v2[1])}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(v2[0], v2[1]) - v|}
	 * 
	 * @param v2
	 *     The second vector as an array with at least two entries.
	 * 
	 * @return The distance between the endpoint of this vector and the endpoint of the given
	 * vector.
	 */
	float dist(@MinLength(2) float[] v2);
	
	/**
	 * Returns the distance between the endpoint of this vector and the endpoint of the given vector
	 * {@code (v2[0], v2[1])}.
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
	 * {@code |(v2[0], v2[1]) - v|}
	 * 
	 * @param v2
	 *     The second vector as an array with at least two entries.
	 * @param tolerance
	 *     The inclusive margin around zero to still count as zero.
	 * 
	 * @return The distance between the endpoint of this vector and the endpoint of the given
	 * vector.
	 * 
	 * @throws IllegalArgumentException
	 *     If the given {@code tolerance} is below zero.
	 */
	float dist(@MinLength(2) float[] v2, @FloatMinValue(0.0f) float tolerance);
	
	/**
	 * Returns the distance between the endpoint of this vector and the endpoint of the given vector
	 * {@code (v2x, v2y)}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(v2x, v2y) - v|}
	 * 
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * 
	 * @return The distance between the endpoint of this vector and the endpoint of the given
	 * vector.
	 */
	float dist(float v2x, float v2y);
	
	/**
	 * Returns the distance between the endpoint of this vector and the endpoint of the given vector
	 * {@code (v2x, v2y)}.
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
	 * {@code |(v2x, v2y) - v|}
	 * 
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * @param tolerance
	 *     The inclusive margin around zero to still count as zero.
	 * 
	 * @return The distance between the endpoint of this vector and the endpoint of the given
	 * vector.
	 * 
	 * @throws IllegalArgumentException
	 *     If the given {@code tolerance} is below zero.
	 */
	float dist(float v2x, float v2y, @FloatMinValue(0.0f) float tolerance);
	
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
	float invDist(Tup2RF v2);
	
	/**
	 * Returns the inverse (reciprocal) distance between the endpoint of this vector and the
	 * endpoint of the given vector {@code (v2[0], v2[1])}. If the distance is zero an
	 * {@link ArithmeticException} is thrown.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code 1 / |(v2[0], v2[1]) - v|}
	 * 
	 * @param v2
	 *     The second vector as an array with at least two entries.
	 * 
	 * @return The inverse distance between the endpoint of this vector and the endpoint of the
	 * given vector.
	 * 
	 * @throws ArithmeticException
	 *     If the distance between the endpoints is zero.
	 */
	float invDist(@MinLength(2) float[] v2);
	
	/**
	 * Returns the inverse (reciprocal) distance between the endpoint of this vector and the
	 * endpoint of the given vector {@code (v2x, v2y)}. If the distance is zero an
	 * {@link ArithmeticException} is thrown.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code 1 / |(v2x, v2y) - v|}
	 * 
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * 
	 * @return The inverse distance between the endpoint of this vector and the endpoint of the
	 * given vector.
	 * 
	 * @throws ArithmeticException
	 *     If the distance between the endpoints is zero.
	 */
	float invDist(float v2x, float v2y);
	
	/**
	 * Returns the squared length (magnitude, norm) of this vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |v|^2}
	 * 
	 * @return The squared length of this vector.
	 */
	float sqrLen();
	
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
	float sqrDist(Tup2RF v2);
	
	/**
	 * Returns the squared distance between the endpoint of this vector and the endpoint of the
	 * given vector {@code (v2[0], v2[1])}.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(v2[0], v2[1]) - v|^2}
	 * 
	 * @param v2
	 *     The second vector as an array with at least two entries.
	 * 
	 * @return The squared distance between the endpoint of this vector and the endpoint of the
	 * given vector.
	 */
	float sqrDist(@MinLength(2) float[] v2);
	
	/**
	 * Returns the squared distance between the endpoint of this vector and the endpoint of the
	 * given vector {@code (v2x, v2y)}.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(v2x, v2y) - v|^2}
	 * 
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * 
	 * @return The squared distance between the endpoint of this vector and the endpoint of the
	 * given vector.
	 */
	float sqrDist(float v2x, float v2y);
	
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
	float dot(Tup2RF v2);
	
	/**
	 * Returns the dot product (scalar product) between this vector and the given vector
	 * {@code (v2[0], v2[1])}.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v . (v2[0], v2[1])}
	 * 
	 * @param v2
	 *     The second vector as an array with at least two entries.
	 * 
	 * @return The dot product.
	 */
	float dot(@MinLength(2) float[] v2);
	
	/**
	 * Returns the dot product (scalar product) between this vector and the given vector
	 * {@code (v2x, v2y)}.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v . (v2x, v2y)}
	 * 
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * 
	 * @return The dot product.
	 */
	float dot(float v2x, float v2y);
	
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
	Vec2RF addN(Tup2RF v2);
	
	/**
	 * Adds the given vector {@code (v2[0], v2[1])} to this vector and saves the result in a new
	 * instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v + (v2[0], v2[1])}
	 * 
	 * @param v2
	 *     The vector to add to this vector as an array with at least two entries.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	Vec2RF addN(@MinLength(2) float[] v2);
	
	/**
	 * Adds the given value {@code (value)} to every component of this vector and saves the result
	 * in a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v + (value, value)}
	 * 
	 * @param value
	 *     The value to add to this vector.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	Vec2RF addN(float value);
	
	/**
	 * Adds the given vector {@code (v2x, v2y)} to this vector and saves the result in a new
	 * instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v + (v2x, v2y)}
	 * 
	 * @param v2x
	 *     The value of the x component to add to this vector.
	 * @param v2y
	 *     The value of the y component to add to this vector.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	Vec2RF addN(float v2x, float v2y);
	
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
	Vec2RF subN(Tup2RF v2);
	
	/**
	 * Subtracts the given vector {@code (v2[0], v2[1])} from this vector and saves the result in a
	 * new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v - (v2[0], v2[1])}
	 * 
	 * @param v2
	 *     The vector to subtract from this vector as an array with at least two entries.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	Vec2RF subN(@MinLength(2) float[] v2);
	
	/**
	 * Subtracts the given value {@code (value)} from every component of this vector and saves the
	 * result in a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v - (value, value)}
	 * 
	 * @param value
	 *     The value to subtract from this vector.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	Vec2RF subN(float value);
	
	/**
	 * Subtracts the given vector {@code (v2x, v2y)} from this vector and saves the result in a new
	 * instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v - (v2x, v2y)}
	 * 
	 * @param v2x
	 *     The value of the x component to subtract from this vector.
	 * @param v2y
	 *     The value of the y component to subtract from this vector.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	Vec2RF subN(float v2x, float v2y);
	
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
	Vec2RF revSubN(Tup2RF v2);
	
	/**
	 * Subtracts this vector from the given vector {@code (v2[0], v2[1])} and saves the result in a
	 * new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2[0], v2[1]) - v}
	 * 
	 * @param v2
	 *     The vector this vector is subtracted from as an array with at least two entries.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	Vec2RF revSubN(@MinLength(2) float[] v2);
	
	/**
	 * Subtracts every component of this vector from the given value {@code (value)} and saves the
	 * result in a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (value, value) - v}
	 * 
	 * @param value
	 *     The value this vector is subtracted from.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	Vec2RF revSubN(float value);
	
	/**
	 * Subtracts this vector from the given vector {@code (v2x, v2y)} and saves the result in a new
	 * instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2x, v2y) - v}
	 * 
	 * @param v2x
	 *     The value of the x component this vector is subtracted from.
	 * @param v2y
	 *     The value of the y component this vector is subtracted from.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	Vec2RF revSubN(float v2x, float v2y);
	
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
	Vec2RF mulN(Tup2RF v2);
	
	/**
	 * Multiplies this vector with the given vector {@code (v2[0], v2[1])} and saves the result in a
	 * new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v * (v2[0], v2[1])}
	 * 
	 * @param v2
	 *     The vector to multiply this vector with as an array with at least two entries.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	Vec2RF mulN(@MinLength(2) float[] v2);
	
	/**
	 * Multiplies every component of this vector with the given value {@code (value)} and saves the
	 * result in a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v * (value, value)}
	 * 
	 * @param value
	 *     The value to multiply this vector with.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	Vec2RF mulN(float value);
	
	/**
	 * Multiplies this vector with the given vector {@code (v2x, v2y)} and saves the result in a new
	 * instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v * (v2x, v2y)}
	 * 
	 * @param v2x
	 *     The value of the x component to multiply this vector with.
	 * @param v2y
	 *     The value of the y component to multiply this vector with.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	Vec2RF mulN(float v2x, float v2y);
	
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
	Vec2RF divN(Tup2RF v2);
	
	/**
	 * Divides this vector by the given vector {@code (v2[0], v2[1])} and saves the result in a new
	 * instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v / (v2[0], v2[1])}
	 * 
	 * @param v2
	 *     The vector to divide this vector by as an array with at least two entries.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	Vec2RF divN(@MinLength(2) float[] v2);
	
	/**
	 * Divides each component of this vector by the given value {@code (value)} and saves the result
	 * in a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v / (value, value)}
	 * 
	 * @param value
	 *     The value to divide this vector by.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	Vec2RF divN(float value);
	
	/**
	 * Divides this vector by the given vector {@code (v2x, v2y)} and saves the result in a new
	 * instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v / (v2x, v2y)}
	 * 
	 * @param v2x
	 *     The value of the x component to divide this vector by.
	 * @param v2y
	 *     The value of the y component to divide this vector by.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	Vec2RF divN(float v2x, float v2y);
	
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
	Vec2RF revDivN(Tup2RF v2);
	
	/**
	 * Divides the given vector {@code (v2[0], v2[1])} by this vector and saves the result in a new
	 * instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2[0], v2[1]) / v}
	 * 
	 * @param v2
	 *     The vector to divide by this vector as an array with at least two entries.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	Vec2RF revDivN(@MinLength(2) float[] v2);
	
	/**
	 * Divides the given value {@code (value)} by each component of this vector and saves the result
	 * in a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (value, value) / v}
	 * 
	 * @param value
	 *     The value to divide by this vector.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	Vec2RF revDivN(float value);
	
	/**
	 * Divides the given vector {@code (v2x, v2y)} by this vector and saves the result in a new
	 * instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2x, v2y) / v}
	 * 
	 * @param v2x
	 *     The value of the x component to divide by this vector.
	 * @param v2y
	 *     The value of the y component to divide by this vector.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	Vec2RF revDivN(float v2x, float v2y);
	
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
	Vec2RF halfVecN(Tup2RF v2);
	
	/**
	 * Returns half the vector from the endpoint of this vector to the endpoint of the given vector
	 * {@code (v2[0], v2[1])} as a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ( (v2[0], v2[1]) - v ) / 2}
	 * 
	 * @param v2
	 *     The second vector as an array with at least two entries.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	Vec2RF halfVecN(@MinLength(2) float[] v2);
	
	/**
	 * Returns half the vector from the endpoint of this vector to the endpoint of the given vector
	 * {@code (v2x, v2y)} as a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ( (v2x, v2y) - v ) / 2}
	 * 
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	Vec2RF halfVecN(float v2x, float v2y);
	
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
	Vec2RF halfPointN(Tup2RF v2);
	
	/**
	 * Returns the origin vector to the point that lies half way between the endpoint of this vector
	 * and the endpoint of the given vector {@code (v2[0], v2[1])} as a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ( (v2[0], v2[1]) + v ) / 2}
	 * 
	 * @param v2
	 *     The second vector as an array with at least two entries.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	Vec2RF halfPointN(@MinLength(2) float[] v2);
	
	/**
	 * Returns the origin vector to the point that lies half way between the endpoint of this vector
	 * and the endpoint of the given vector {@code (v2x, v2y)} as a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ( (v2x, v2y) + v ) / 2}
	 * 
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	Vec2RF halfPointN(float v2x, float v2y);
	
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
	Vec2RF negN();
	
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
	Vec2RF invN();
	
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
	Vec2RF nrmN();
	
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
	Vec2RF minN(Tup2RF v2);
	
	/**
	 * Compares each component of this vector with the corresponding component of the given vector
	 * {@code (v2[0], v2[1])} and returns the smallest values as a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * @param v2
	 *     The second vector as an array with at least two entries.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	Vec2RF minN(@MinLength(2) float[] v2);
	
	/**
	 * Compares each component of this vector with the corresponding component of the given vector
	 * {@code (v2x, v2y)} and returns the smallest values as a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	Vec2RF minN(float v2x, float v2y);
	
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
	Vec2RF maxN(Tup2RF v2);
	
	/**
	 * Compares each component of this vector with the corresponding component of the given vector
	 * {@code (v2[0], v2[1])} and returns the greatest values as a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * @param v2
	 *     The second vector as an array with at least two entries.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	Vec2RF maxN(@MinLength(2) float[] v2);
	
	/**
	 * Compares each component of this vector with the corresponding component of the given vector
	 * {@code (v2x, v2y)} and returns the greatest values as a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	Vec2RF maxN(float v2x, float v2y);
	
	/**
	 * Rotates this vector by the given angle in radians and returns the result as a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * @param angle
	 *     The angle in radians.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	Vec2RF rotRadN(float angle);
	
	/**
	 * Rotates this vector by the given angle in degrees and returns the result as a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * @param angle
	 *     The angle in radians.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	Vec2RF rotDegN(float angle);
	
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
	Vec2RF prjN(Tup2RF t);
	
	/**
	 * Calculates the orthogonal projection of this vector onto the normalized target vector
	 * {@code (t[0], t[1])} and returns the result as a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (t[0], t[1]) * (v . (t[0], t[1]))}
	 * 
	 * @param t
	 *     The projection target vector as an array with at least two entries.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	Vec2RF prjN(@MinLength(2) float[] t);
	
	/**
	 * Calculates the orthogonal projection of this vector onto the normalized target vector
	 * {@code (tX, tY)} and returns the result as a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (tX, tY) * (v . (tX, tY))}
	 * 
	 * @param tX
	 *     The value of the x component of the projection target vector.
	 * @param tY
	 *     The value of the y component of the projection target vector.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	Vec2RF prjN(float tX, float tY);
	
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
	Vec2RF rflN(Tup2RF n);
	
	/**
	 * Calculates the reflection of this vector based on the given normalized surface normal
	 * {@code (n[0], n[1])} and returns the result as a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * @param n
	 *     The surface normal vector as an array with at least two entries.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	Vec2RF rflN(@MinLength(2) float[] n);
	
	/**
	 * Calculates the reflection of this vector based on the given normalized surface normal
	 * {@code (nX, nY)} and returns the result as a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * @param nX
	 *     The value of the x component of the surface normal vector.
	 * @param nY
	 *     The value of the y component of the surface normal vector.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	Vec2RF rflN(float nX, float nY);
	
	/**
	 * Rounds the components of this vector towards the next greater integer and saves the result in
	 * a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	Vec2RF ceilN();
	
	/**
	 * Rounds the components of this vector towards the next smaller integer and saves the result in
	 * a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	Vec2RF floorN();
	
	/**
	 * Rounds the components of this vector and saves the result in a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	Vec2RF roundN();
	
	/**
	 * Truncates the decimals of the components of this vector and saves the result in a new
	 * instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	Vec2RF truncN();
	
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
	Vec2RF roundN(RoundMethodF method);
	
	/**
	 * Determines the smallest value of the components and returns the value and the index of the
	 * component. The index returned is limited to the range of {@code 0 to 1}. If two or more
	 * components have the same value the smallest index will be returned. The returned object is
	 * immutable.
	 * 
	 * @return An object containing the smallest value of the components and the index of the
	 * corresponding component.
	 */
	IndexValuePairF minEntry();
	
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
	IndexValuePairF minEntry(@ExtractionParam IndexValuePairF res);
	
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
	IndexValuePairF maxEntry();
	
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
	IndexValuePairF maxEntry(@ExtractionParam IndexValuePairF res);
	
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
	Vec2RF absN();
	
	/**
	 * Calculates the {@link Math#signum(float) signum} of the components of this vector and saves
	 * the result in a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	Vec2RF signN();
	
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
	Vec2RF intVecLinN(Tup2RF v2, float alpha);
	
	/**
	 * Linearly integrates over the second given vector {@code (v2[0], v2[1])} by the integrator
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
	 *     The second vector as an array with at least two entries. This vector will be integrated
	 *     over.
	 * @param alpha
	 *     The integrator with an integration delta of 1.0f {@code (alpha / 1.0f)}.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	Vec2RF intVecLinN(@MinLength(2) float[] v2, float alpha);
	
	/**
	 * Linearly integrates over the second given vector {@code (v2x, v2y)} by the integrator
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
	 * @param alpha
	 *     The integrator with an integration delta of 1.0f {@code (alpha / 1.0f)}.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	Vec2RF intVecLinN(float v2x, float v2y, float alpha);
	
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
	<T extends Tup2WF> T addR(Tup2RF v2, @ExtractionParam T res);
	
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
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	float[] addR(Tup2RF v2, @ExtractionParam @MinLength(2) float[] res);
	
	/**
	 * Adds the given vector {@code (v2[0], v2[1])} to this vector and saves the result in the
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
	 * {@code v + (v2[0], v2[1])}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter.
	 * 
	 * @param v2
	 *     The vector to add to this vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	<T extends Tup2WF> T addR(@MinLength(2) float[] v2, @ExtractionParam T res);
	
	/**
	 * Adds the given vector {@code (v2[0], v2[1])} to this vector and saves the result in the
	 * extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * It is safe to use the given vector {@code v2} as the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v + (v2[0], v2[1])}
	 * 
	 * @param v2
	 *     The vector to add to this vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	float[] addR(@MinLength(2) float[] v2, @ExtractionParam @MinLength(2) float[] res);
	
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
	 * {@code v + (value, value)}
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
	<T extends Tup2WF> T addR(float value, @ExtractionParam T res);
	
	/**
	 * Adds the given value {@code (value)} to every component of this vector and saves the result
	 * in the extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v + (value, value)}
	 * 
	 * @param value
	 *     The value to add to this vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	float[] addR(float value, @ExtractionParam @MinLength(2) float[] res);
	
	/**
	 * Adds the given vector {@code (v2x, v2y)} to this vector and saves the result in the
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
	 * {@code v + (v2x, v2y)}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter.
	 * 
	 * @param v2x
	 *     The value of the x component to add to this vector.
	 * @param v2y
	 *     The value of the y component to add to this vector.
	 * @param res
	 *     The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	<T extends Tup2WF> T addR(float v2x, float v2y, @ExtractionParam T res);
	
	/**
	 * Adds the given vector {@code (v2x, v2y)} to this vector and saves the result in the
	 * extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v + (v2x, v2y)}
	 * 
	 * @param v2x
	 *     The value of the x component to add to this vector.
	 * @param v2y
	 *     The value of the y component to add to this vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	float[] addR(float v2x, float v2y, @ExtractionParam @MinLength(2) float[] res);
	
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
	<T extends Tup2WF> T subR(Tup2RF v2, @ExtractionParam T res);
	
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
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	float[] subR(Tup2RF v2, @ExtractionParam @MinLength(2) float[] res);
	
	/**
	 * Subtracts the given vector {@code (v2[0], v2[1])} from this vector and saves the result in
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
	 * {@code v - (v2[0], v2[1])}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter.
	 * 
	 * @param v2
	 *     The vector to subtract from this vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	<T extends Tup2WF> T subR(@MinLength(2) float[] v2, @ExtractionParam T res);
	
	/**
	 * Subtracts the given vector {@code (v2[0], v2[1])} from this vector and saves the result in
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
	 * {@code v - (v2[0], v2[1])}
	 * 
	 * 
	 * @param v2
	 *     The vector to subtract from this vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	float[] subR(@MinLength(2) float[] v2, @ExtractionParam @MinLength(2) float[] res);
	
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
	 * {@code v - (value, value)}
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
	<T extends Tup2WF> T subR(float value, @ExtractionParam T res);
	
	/**
	 * Subtracts the given value {@code (value)} from every component of this vector and saves the
	 * result in the extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v - (value, value)}
	 * 
	 * @param value
	 *     The value to subtract from this vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	float[] subR(float value, @ExtractionParam @MinLength(2) float[] res);
	
	/**
	 * Subtracts the given vector {@code (v2x, v2y)} from this vector and saves the result in the
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
	 * {@code v - (v2x, v2y)}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter.
	 * 
	 * @param v2x
	 *     The value of the x component to subtract from this vector.
	 * @param v2y
	 *     The value of the y component to subtract from this vector.
	 * @param res
	 *     The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	<T extends Tup2WF> T subR(float v2x, float v2y, @ExtractionParam T res);
	
	/**
	 * Subtracts the given vector {@code (v2x, v2y)} from this vector and saves the result in the
	 * extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v - (v2x, v2y)}
	 * 
	 * 
	 * @param v2x
	 *     The value of the x component to subtract from this vector.
	 * @param v2y
	 *     The value of the y component to subtract from this vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	float[] subR(float v2x, float v2y, @ExtractionParam @MinLength(2) float[] res);
	
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
	<T extends Tup2WF> T revSubR(Tup2RF v2, @ExtractionParam T res);
	
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
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	float[] revSubR(Tup2RF v2, @ExtractionParam @MinLength(2) float[] res);
	
	/**
	 * Subtracts this vector from the given vector {@code (v2[0], v2[1])} and saves the result in
	 * the extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * It is safe to use this vector or the given vector {@code v2} as the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2[0], v2[1]) - v}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter.
	 * 
	 * @param v2
	 *     The vector this vector is subtracted from as an array with at least two entries.
	 * @param res
	 *     The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	<T extends Tup2WF> T revSubR(@MinLength(2) float[] v2, @ExtractionParam T res);
	
	/**
	 * Subtracts this vector from the given vector {@code (v2[0], v2[1])} and saves the result in
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
	 * {@code (v2[0], v2[1]) - v}
	 * 
	 * @param v2
	 *     The vector this vector is subtracted from as an array with at least two entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	float[] revSubR(@MinLength(2) float[] v2, @ExtractionParam @MinLength(2) float[] res);
	
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
	 * {@code (value, value) - v}
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
	<T extends Tup2WF> T revSubR(float value, @ExtractionParam T res);
	
	/**
	 * Subtracts every component of this vector from the given value {@code (value)} and saves the
	 * result in the extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (value, value) - v}
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
	 * Subtracts this vector from the given vector {@code (v2x, v2y)} and saves the result in the
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
	 * {@code (v2x, v2y) - v}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter.
	 * 
	 * @param v2x
	 *     The value of the x component this vector is subtracted from.
	 * @param v2y
	 *     The value of the y component this vector is subtracted from.
	 * @param res
	 *     The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	<T extends Tup2WF> T revSubR(float v2x, float v2y, @ExtractionParam T res);

	/**
	 * Subtracts this vector from the given vector {@code (v2x, v2y)} and saves the result in the
	 * extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2x, v2y) - v}
	 * 
	 * @param v2x
	 *     The value of the x component this vector is subtracted from.
	 * @param v2y
	 *     The value of the y component this vector is subtracted from.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	float[] revSubR(float v2x, float v2y, @ExtractionParam @MinLength(2) float[] res);
	
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
	<T extends Tup2WF> T mulR(Tup2RF v2, @ExtractionParam T res);
	
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
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	float[] mulR(Tup2RF v2, @ExtractionParam @MinLength(2) float[] res);
	
	/**
	 * Multiplies this vector with the given vector {@code (v2[0], v2[1])} and saves the result in
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
	 * {@code v * (v2[0], v2[1])}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter.
	 * 
	 * @param v2
	 *     The vector to multiply this vector with as an array with at least two entries.
	 * @param res
	 *     The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	<T extends Tup2WF> T mulR(@MinLength(2) float[] v2, @ExtractionParam T res);
	
	/**
	 * Multiplies this vector with the given vector {@code (v2[0], v2[1])} and saves the result in
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
	 * {@code v * (v2[0], v2[1])}
	 * 
	 * @param v2
	 *     The vector to multiply this vector with as an array with at least two entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	float[] mulR(@MinLength(2) float[] v2, @ExtractionParam @MinLength(2) float[] res);
	
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
	 * {@code v * (value, value)}
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
	<T extends Tup2WF> T mulR(float value, @ExtractionParam T res);
	
	/**
	 * Multiplies every component of this vector with the given value {@code (value)} and saves the
	 * result in the extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v * (value, value)}
	 * 
	 * @param value
	 *     The value to multiply this vector with.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	float[] mulR(float value, @ExtractionParam @MinLength(2) float[] res);
	
	/**
	 * Multiplies this vector with the given vector {@code (v2x, v2y)} and saves the result in the
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
	 * {@code v * (v2x, v2y)}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter.
	 * 
	 * @param v2x
	 *     The value of the x component to multiply this vector with.
	 * @param v2y
	 *     The value of the y component to multiply this vector with.
	 * @param res
	 *     The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	<T extends Tup2WF> T mulR(float v2x, float v2y, @ExtractionParam T res);
	
	/**
	 * Multiplies this vector with the given vector {@code (v2x, v2y)} and saves the result in the
	 * extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v * (v2x, v2y)}
	 * 
	 * @param v2x
	 *     The value of the x component to multiply this vector with.
	 * @param v2y
	 *     The value of the y component to multiply this vector with.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	float[] mulR(float v2x, float v2y, @ExtractionParam @MinLength(2) float[] res);
	
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
	<T extends Tup2WF> T divR(Tup2RF v2, @ExtractionParam T res);
	
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
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	float[] divR(Tup2RF v2, @ExtractionParam @MinLength(2) float[] res);
	
	/**
	 * Divides this vector by the given vector {@code (v2[0], v2[1])} and saves the result in the
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
	 * {@code v / (v2[0], v2[1])}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter.
	 * 
	 * @param v2
	 *     The vector to divide this vector by as an array with at least two entries.
	 * @param res
	 *     The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	<T extends Tup2WF> T divR(@MinLength(2) float[] v2, @ExtractionParam T res);
	
	/**
	 * Divides this vector by the given vector {@code (v2[0], v2[1])} and saves the result in the
	 * extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * It is safe to use the given vector {@code v2} as the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v / (v2[0], v2[1])}
	 * 
	 * @param v2
	 *     The vector to divide this vector by as an array with at least two entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	float[] divR(@MinLength(2) float[] v2, @ExtractionParam @MinLength(2) float[] res);
	
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
	 * {@code v / (value, value)}
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
	<T extends Tup2WF> T divR(float value, @ExtractionParam T res);
	
	/**
	 * Divides each component of this vector by the given value {@code (value)} and saves the result
	 * in the extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v / (value, value)}
	 * 
	 * @param value
	 *     The value to divide this vector by.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	float[] divR(float value, @ExtractionParam @MinLength(2) float[] res);
	
	/**
	 * Divides this vector by the given vector {@code (v2x, v2y)} and saves the result in the
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
	 * {@code v / (v2x, v2y)}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter.
	 * 
	 * @param v2x
	 *     The value of the x component to divide this vector by.
	 * @param v2y
	 *     The value of the y component to divide this vector by.
	 * @param res
	 *     The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	<T extends Tup2WF> T divR(float v2x, float v2y, @ExtractionParam T res);
	
	/**
	 * Divides this vector by the given vector {@code (v2x, v2y)} and saves the result in the
	 * extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v / (v2x, v2y)}
	 * 
	 * @param v2x
	 *     The value of the x component to divide this vector by.
	 * @param v2y
	 *     The value of the y component to divide this vector by.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	float[] divR(float v2x, float v2y, @ExtractionParam @MinLength(2) float[] res);
	
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
	<T extends Tup2WF> T revDivR(Tup2RF v2, @ExtractionParam T res);
	
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
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	float[] revDivR(Tup2RF v2, @ExtractionParam float[] res);
	
	/**
	 * Divides the given vector {@code (v2[0], v2[1])} by this vector and saves the result in the
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
	 * {@code (v2[0], v2[1]) / v}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter.
	 * 
	 * @param v2
	 *     The vector to divide by this vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	<T extends Tup2WF> T revDivR(@MinLength(2) float[] v2, @ExtractionParam T res);
	
	/**
	 * Divides the given vector {@code (v2[0], v2[1])} by this vector and saves the result in the
	 * extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * It is safe to use the given vector {@code v2} as the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2[0], v2[1]) / v}
	 * 
	 * @param v2
	 *     The vector to divide by this vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	float[] revDivR(@MinLength(2) float[] v2, @ExtractionParam @MinLength(2) float[] res);
	
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
	 * {@code (value, value) / v}
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
	<T extends Tup2WF> T revDivR(float value, @ExtractionParam T res);
	
	/**
	 * Divides the given value {@code (value)} by each component of this vector and saves the result
	 * in the extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (value, value) / v}
	 * 
	 * @param value
	 *     The value to divide by this vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	float[] revDivR(float value, @ExtractionParam @MinLength(2) float[] res);
	
	/**
	 * Divides the given vector {@code (v2x, v2y)} by this vector and saves the result in the
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
	 * {@code (v2x, v2y) / v}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter.
	 * 
	 * @param v2x
	 *     The value of the x component to divide by this vector.
	 * @param v2y
	 *     The value of the y component to divide by this vector.
	 * @param res
	 *     The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	<T extends Tup2WF> T revDivR(float v2x, float v2y, @ExtractionParam T res);
	
	/**
	 * Divides the given vector {@code (v2x, v2y)} by this vector and saves the result in the
	 * extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2x, v2y) / v}
	 * 
	 * @param v2x
	 *     The value of the x component to divide by this vector.
	 * @param v2y
	 *     The value of the y component to divide by this vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	float[] revDivR(float v2x, float v2y, @ExtractionParam @MinLength(2) float[] res);
	
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
	<T extends Tup2WF> T halfVecR(Tup2RF v2, @ExtractionParam T res);
	
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
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	float[] halfVecR(Tup2RF v2, @ExtractionParam @MinLength(2) float[] res);
	
	/**
	 * Returns half the vector from the endpoint of this vector to the endpoint of the given vector
	 * {@code (v2[0], v2[1])} as the extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * It is safe to use this vector as the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ( (v2[0], v2[1]) - v ) / 2}
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
	<T extends Tup2WF> T halfVecR(@MinLength(2) float[] v2, @ExtractionParam T res);
	
	/**
	 * Returns half the vector from the endpoint of this vector to the endpoint of the given vector
	 * {@code (v2[0], v2[1])} as the extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * It is safe to use the given vector {@code v2} as the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ( (v2[0], v2[1]) - v ) / 2}
	 * 
	 * @param v2
	 *     The second vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	float[] halfVecR(@MinLength(2) float[] v2, @ExtractionParam @MinLength(2) float[] res);
	
	/**
	 * Returns half the vector from the endpoint of this vector to the endpoint of the given vector
	 * {@code (v2x, v2y)} as the extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * It is safe to use this vector as the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ( (v2x, v2y) - v ) / 2}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter.
	 * 
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * @param res
	 *     The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	<T extends Tup2WF> T halfVecR(float v2x, float v2y, @ExtractionParam T res);
	
	/**
	 * Returns half the vector from the endpoint of this vector to the endpoint of the given vector
	 * {@code (v2x, v2y)} as the extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ( (v2x, v2y) - v ) / 2}
	 * 
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	float[] halfVecR(float v2x, float v2y, @ExtractionParam @MinLength(2) float[] res);
	
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
	<T extends Tup2WF> T halfPointR(Tup2RF v2, @ExtractionParam T res);
	
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
	float[] halfPointR(Tup2RF v2, @ExtractionParam @MinLength(2) float[] res);
	
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
	<T extends Tup2WF> T halfPointR(@MinLength(2) float[] v2, @ExtractionParam T res);
	
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
	float[] halfPointR(@MinLength(2) float[] v2, @ExtractionParam @MinLength(2) float[] res);
	
	/**
	 * Returns the origin vector to the point that lies half way between the endpoint of this vector
	 * and the endpoint of the given vector {@code (v2x, v2y)} as the extraction parameter
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
	 * {@code ( (v2x, v2y) + v ) / 2}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter.
	 * 
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * @param res
	 *     The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	<T extends Tup2WF> T halfPointR(float v2x, float v2y, @ExtractionParam T res);
	
	/**
	 * Returns the origin vector to the point that lies half way between the endpoint of this vector
	 * and the endpoint of the given vector {@code (v2x, v2y)} as the extraction parameter
	 * {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ( (v2x, v2y) + v ) / 2}
	 * 
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	float[] halfPointR(float v2x, float v2y, @ExtractionParam @MinLength(2) float[] res);
	
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
	<T extends Tup2WF> T negR(@ExtractionParam T res);
	
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
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	float[] negR(@ExtractionParam @MinLength(2) float[] res);
	
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
	<T extends Tup2WF> T invR(@ExtractionParam T res);
	
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
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	float[] invR(@ExtractionParam @MinLength(2) float[] res);
	
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
	<T extends Tup2WF> T nrmR(@ExtractionParam T res);
	
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
	 *     The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	float[] nrmR(@ExtractionParam @MinLength(2) float[] res);
	
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
	<T extends Tup2WF> T minR(Tup2RF v2, @ExtractionParam T res);
	
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
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	float[] minR(Tup2RF v2, @ExtractionParam @MinLength(2) float[] res);
	
	/**
	 * Compares each component of this vector with the corresponding component of the given vector
	 * {@code (v2[0], v2[1])} and returns the smallest values as the extraction parameter
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
	<T extends Tup2WF> T minR(@MinLength(2) float[] v2, @ExtractionParam T res);
	
	/**
	 * Compares each component of this vector with the corresponding component of the given vector
	 * {@code (v2[0], v2[1])} and returns the smallest values as the extraction parameter
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
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	float[] minR(@MinLength(2) float[] v2, @ExtractionParam @MinLength(2) float[] res);
	
	/**
	 * Compares each component of this vector with the corresponding component of the given vector
	 * {@code (v2x, v2y)} and returns the smallest values as the extraction parameter {@code res}.
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
	 * @param res
	 *     The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	<T extends Tup2WF> T minR(float v2x, float v2y, @ExtractionParam T res);
	
	/**
	 * Compares each component of this vector with the corresponding component of the given vector
	 * {@code (v2x, v2y)} and returns the smallest values as the extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	float[] minR(float v2x, float v2y, @ExtractionParam @MinLength(2) float[] res);
	
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
	<T extends Tup2WF> T maxR(Tup2RF v2, @ExtractionParam T res);
	
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
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	float[] maxR(Tup2RF v2, @ExtractionParam @MinLength(2) float[] res);
	
	/**
	 * Compares each component of this vector with the corresponding component of the given vector
	 * {@code (v2[0], v2[1])} and returns the greatest values as the extraction parameter
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
	<T extends Tup2WF> T maxR(@MinLength(2) float[] v2, @ExtractionParam T res);
	
	/**
	 * Compares each component of this vector with the corresponding component of the given vector
	 * {@code (v2[0], v2[1])} and returns the greatest values as the extraction parameter
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
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	float[] maxR(@MinLength(2) float[] v2, @ExtractionParam @MinLength(2) float[] res);
	
	/**
	 * Compares each component of this vector with the corresponding component of the given vector
	 * {@code (v2x, v2y)} and returns the greatest values as the extraction parameter {@code res}.
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
	 * @param res
	 *     The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	<T extends Tup2WF> T maxR(float v2x, float v2y, @ExtractionParam T res);
	
	/**
	 * Compares each component of this vector with the corresponding component of the given vector
	 * {@code (v2x, v2y)} and returns the greatest values as the extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * @param res
	 *     The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	float[] maxR(float v2x, float v2y, @ExtractionParam @MinLength(2) float[] res);
	
	/**
	 * Rotates this vector by the given angle in radians and saves the result in the given
	 * extraction parameter object.
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
	 * @param angle
	 *     The angle in radians.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	<T extends Tup2WF> T rotRadR(float angle, @ExtractionParam T res);
	
	/**
	 * Rotates this vector by the given angle in radians and saves the result in the given
	 * extraction parameter.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * 
	 * @param angle
	 *     The angle in radians.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	float[] rotRadR(float angle, @ExtractionParam @MinLength(2) float[] res);
	
	/**
	 * Rotates this vector by the given angle in degrees and saves the result in the given
	 * extraction parameter object.
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
	 * @param angle
	 *     The angle in radians.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	<T extends Tup2WF> T rotDegR(float angle, @ExtractionParam T res);
	
	/**
	 * Rotates this vector by the given angle in degrees and saves the result in the given
	 * extraction parameter.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * 
	 * @param angle
	 *     The angle in radians.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	float[] rotDegR(float angle, @ExtractionParam @MinLength(2) float[] res);
	
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
	<T extends Tup2WF> T prjR(Tup2RF t, @ExtractionParam T res);
	
	/**
	 * Calculates the orthogonal projection of this vector onto the normalized target vector
	 * {@code (t[0], t[1])} and saves the result in the given extraction parameter object.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * It is safe to use this vector as the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (t[0], t[1]) * (v . (t[0], t[1]))}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter.
	 * 
	 * @param t
	 *     The projection target vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	<T extends Tup2WF> T prjR(@MinLength(2) float[] t, @ExtractionParam T res);
	
	/**
	 * Calculates the orthogonal projection of this vector onto the normalized target vector
	 * {@code (tX, tY)} and saves the result in the given extraction parameter object.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * It is safe to use this vector as the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (tX, tY) * (v . (tX, tY))}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter.
	 * 
	 * @param tX
	 *     The value of the x component of the projection target vector.
	 * @param tY
	 *     The value of the y component of the projection target vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	<T extends Tup2WF> T prjR(float tX, float tY, @ExtractionParam T res);
	
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
	float[] prjR(Tup2RF t, @ExtractionParam @MinLength(2) float[] res);
	
	/**
	 * Calculates the orthogonal projection of this vector onto the normalized target vector
	 * {@code (t[0], t[1])} and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (t[0], t[1]) * (v . (t[0], t[1]))}
	 * 
	 * @param t
	 *     The projection target vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	float[] prjR(@MinLength(2) float[] t, @ExtractionParam @MinLength(2) float[] res);
	
	/**
	 * Calculates the orthogonal projection of this vector onto the normalized target vector
	 * {@code (tX, tY)} and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (tX, tY) * (v . (tX, tY))}
	 * 
	 * @param tX
	 *     The value of the x component of the projection target vector.
	 * @param tY
	 *     The value of the y component of the projection target vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	float[] prjR(float tX, float tY, @ExtractionParam @MinLength(2) float[] res);
	
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
	<T extends Tup2WF> T rflR(Tup2RF n, @ExtractionParam T res);
	
	/**
	 * Calculates the reflection of this vector based on the given normalized surface normal
	 * {@code (n[0], n[1])} and saves the result in the given extraction parameter object.
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
	 *     The surface normal vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	<T extends Tup2WF> T rflR(@MinLength(2) float[] n, @ExtractionParam T res);
	
	/**
	 * Calculates the reflection of this vector based on the given normalized surface normal
	 * {@code (nX, nY)} and saves the result in the given extraction parameter object.
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
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	<T extends Tup2WF> T rflR(float nX, float nY, @ExtractionParam T res);
	
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
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	float[] rflR(Tup2RF n, @ExtractionParam @MinLength(2) float[] res);
	
	/**
	 * Calculates the reflection of this vector based on the given normalized surface normal
	 * {@code (n[0], n[1])} and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * @param n
	 *     The surface normal vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	float[] rflR(@MinLength(2) float[] n, @ExtractionParam @MinLength(2) float[] res);
	
	/**
	 * Calculates the reflection of this vector based on the given normalized surface normal
	 * {@code (nX, nY)} and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * @param nX
	 *     The value of the x component of the surface normal vector.
	 * @param nY
	 *     The value of the y component of the surface normal vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	float[] rflR(float nX, float nY, @ExtractionParam @MinLength(2) float[] res);
	
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
	<T extends Tup2WF> T ceilR(@ExtractionParam T res);
	
	/**
	 * Rounds the components of this vector towards the next greater integer and saves the result in
	 * the extraction parameter.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	float[] ceilR(@ExtractionParam @MinLength(2) float[] res);
	
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
	<T extends Tup2WF> T floorR(@ExtractionParam T res);
	
	/**
	 * Rounds the components of this vector towards the next smaller integer and saves the result in
	 * the extraction parameter.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	float[] floorR(@ExtractionParam @MinLength(2) float[] res);
	
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
	<T extends Tup2WF> T roundR(@ExtractionParam T res);
	
	/**
	 * Rounds the components of this vector and saves the result in the extraction parameter.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	float[] roundR(@ExtractionParam @MinLength(2) float[] res);
	
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
	<T extends Tup2WF> T truncR(@ExtractionParam T res);
	
	/**
	 * Truncates the decimals of the components of this vector and saves the result in the
	 * extraction parameter.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	float[] truncR(@ExtractionParam @MinLength(2) float[] res);
	
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
	<T extends Tup2WF> T roundR(RoundMethodF method, @ExtractionParam T res);
	
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
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	float[] roundR(RoundMethodF method, @ExtractionParam @MinLength(2) float[] res);
	
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
	<T extends Tup2WF> T absR(@ExtractionParam T res);
	
	/**
	 * Calculates the absolute values of the component values and saves the result in the extraction
	 * parameter.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	float[] absR(@ExtractionParam @MinLength(2) float[] res);
	
	/**
	 * Calculates the {@link Math#signum(float) signum} of the components of this vector and saves
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
	<T extends Tup2WF> T signR(@ExtractionParam T res);
	
	/**
	 * Calculates the {@link Math#signum(float) signum} of the components of this vector and saves
	 * the result in the extraction parameter.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	float[] signR(@ExtractionParam @MinLength(2) float[] res);
	
	/**
	 * Linearly integrates over the second given vector {@code (v2)} by the integrator
	 * {@code (alpha)}, adds the result to this vector and saves the result in the given extraction
	 * parameter object. This assumes an integration delta of 1.0 so that the integration is over
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
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v2
	 *     The second vector. This vector will be integrated over.
	 * @param alpha
	 *     The integrator with an integration delta of 1.0f {@code (alpha / 1.0f)}.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	<T extends Tup2WF> T intVecLinR(Tup2RF v2, float alpha, @ExtractionParam T res);
	
	/**
	 * Linearly integrates over the second given vector {@code (v2[0], v2[1])} by the integrator
	 * {@code (alpha)}, adds the result to this vector and saves the result in the given extraction
	 * parameter object. This assumes an integration delta of 1.0 so that the integration is over
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
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v2
	 *     The second vector as an array with at least two entries. This vector will be integrated
	 *     over.
	 * @param alpha
	 *     The integrator with an integration delta of 1.0f {@code (alpha / 1.0f)}.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	<T extends Tup2WF> T intVecLinR(@MinLength(2) float[] v2, float alpha, @ExtractionParam T res);
	
	/**
	 * Linearly integrates over the second given vector {@code (v2x, v2y)} by the integrator
	 * {@code (alpha)}, adds the result to this vector and saves the result in the given extraction
	 * parameter object. This assumes an integration delta of 1.0 so that the integration is over
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
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v2x
	 *     The value of the x component of the second vector. This vector will be integrated over.
	 * @param v2y
	 *     The value of the y component of the second vector. This vector will be integrated over.
	 * @param alpha
	 *     The integrator with an integration delta of 1.0f {@code (alpha / 1.0f)}.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	<T extends Tup2WF> T intVecLinR(float v2x, float v2y, float alpha, @ExtractionParam T res);
	
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
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	float[] intVecLinR(Tup2RF v2, float alpha, @ExtractionParam @MinLength(2) float[] res);
	
	/**
	 * Linearly integrates over the second given vector {@code (v2[0], v2[1])} by the integrator
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
	 *     The second vector as an array with at least two entries. This vector will be integrated
	 *     over.
	 * @param alpha
	 *     The integrator with an integration delta of 1.0f {@code (alpha / 1.0f)}.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	float[] intVecLinR(@MinLength(2) float[] v2, float alpha, @ExtractionParam @MinLength(2) float[] res);
	
	/**
	 * Linearly integrates over the second given vector {@code (v2x, v2y)} by the integrator
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
	 * @param alpha
	 *     The integrator with an integration delta of 1.0f {@code (alpha / 1.0f)}.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	float[] intVecLinR(float v2x, float v2y, float alpha, @ExtractionParam @MinLength(2) float[] res);
}
