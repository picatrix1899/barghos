package org.barghos.math.vector;

import org.barghos.annotation.ExtractionParam;
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
	public static final int INDEX_X = 0;
	public static final int INDEX_Y = 1;
	
	/** {@inheritDoc} */
	@Override
	Vec2RF createNew(Tup2RF v);
	
	/** {@inheritDoc} */
	@Override
	Vec2RF createNew(float[] v);
	
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
	float len(float tolerance);
	
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
	float recLen();
	
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
	float lenTo(Tup2RF v2);
	
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
	float lenTo(Tup2RF v2, float tolerance);
	
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
	float lenTo(float[] v2);
	
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
	float lenTo(float[] v2, float tolerance);
	
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
	float lenTo(float v2x, float v2y);
	
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
	float lenTo(float v2x, float v2y, float tolerance);
	
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
	float recLenTo(Tup2RF v2);
	
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
	float recLenTo(float[] v2);
	
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
	float recLenTo(float v2x, float v2y);
	
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
	float sqrLenTo(Tup2RF v2);
	
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
	float sqrLenTo(float[] v2);
	
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
	float sqrLenTo(float v2x, float v2y);
	
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
	float dot(float[] v2);
	
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
	Vec2RF addN(float[] v2);
	
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
	Vec2RF subN(float[] v2);
	
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
	Vec2RF rSubN(Tup2RF v2);
	
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
	Vec2RF rSubN(float[] v2);
	
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
	Vec2RF rSubN(float value);
	
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
	Vec2RF rSubN(float v2x, float v2y);
	
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
	Vec2RF mulN(float[] v2);
	
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
	Vec2RF divN(float[] v2);
	
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
	Vec2RF rDivN(Tup2RF v2);
	
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
	Vec2RF rDivN(float[] v2);
	
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
	Vec2RF rDivN(float value);
	
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
	Vec2RF rDivN(float v2x, float v2y);
	
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
	Vec2RF halfVecToN(Tup2RF v2);
	
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
	Vec2RF halfVecToN(float[] v2);
	
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
	Vec2RF halfVecToN(float v2x, float v2y);
	
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
	Vec2RF midPointToN(Tup2RF v2);
	
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
	Vec2RF midPointToN(float[] v2);
	
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
	Vec2RF midPointToN(float v2x, float v2y);
	
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
	Vec2RF recN();
	
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
	Vec2RF minN(float[] v2);
	
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
	Vec2RF maxN(float[] v2);
	
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
	Vec2RF projectN(Tup2RF t);
	
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
	Vec2RF projectN(float[] t);
	
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
	Vec2RF projectN(float tX, float tY);
	
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
	Vec2RF reflectN(Tup2RF n);
	
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
	Vec2RF reflectN(float[] n);
	
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
	Vec2RF reflectN(float nX, float nY);
	
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
	IndexValuePairF minComp();
	
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
	IndexValuePairF minComp(@ExtractionParam IndexValuePairF res);

	
	/**
	 * Determines the greatest value of the components and returns the value and the index of the
	 * component. The index returned is limited to the range of {@code 0 to 1}. If two or more
	 * components have the same value the smallest index will be returned. The returned tuple is
	 * immutable.
	 * 
	 * @return An object containing the greatest value of the components and the index of the
	 * corresponding component.
	 */
	IndexValuePairF maxComp();
	
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
	IndexValuePairF maxComp(@ExtractionParam IndexValuePairF res);
	
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
	Vec2RF intVecLinN(float[] v2, float alpha);
	
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
	<T extends Tup2WF> T addT(Tup2RF v2, @ExtractionParam T res);
	
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
	float[] addT(Tup2RF v2, @ExtractionParam float[] res);
	
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
	<T extends Tup2WF> T addT(float[] v2, @ExtractionParam T res);
	
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
	float[] addT(float[] v2, @ExtractionParam float[] res);
	
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
	<T extends Tup2WF> T addT(float value, @ExtractionParam T res);
	
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
	float[] addT(float value, @ExtractionParam float[] res);
	
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
	<T extends Tup2WF> T addT(float v2x, float v2y, @ExtractionParam T res);
	
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
	float[] addT(float v2x, float v2y, @ExtractionParam float[] res);
	
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
	<T extends Tup2WF> T subT(Tup2RF v2, @ExtractionParam T res);
	
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
	float[] subT(Tup2RF v2, @ExtractionParam float[] res);
	
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
	<T extends Tup2WF> T subT(float[] v2, @ExtractionParam T res);
	
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
	float[] subT(float[] v2, @ExtractionParam float[] res);
	
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
	<T extends Tup2WF> T subT(float value, @ExtractionParam T res);
	
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
	float[] subT(float value, @ExtractionParam float[] res);
	
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
	<T extends Tup2WF> T subT(float v2x, float v2y, @ExtractionParam T res);
	
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
	float[] subT(float v2x, float v2y, @ExtractionParam float[] res);
	
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
	<T extends Tup2WF> T rSubT(Tup2RF v2, @ExtractionParam T res);
	
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
	float[] rSubT(Tup2RF v2, @ExtractionParam float[] res);
	
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
	<T extends Tup2WF> T rSubT(float[] v2, @ExtractionParam T res);
	
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
	float[] rSubT(float[] v2, @ExtractionParam float[] res);
	
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
	<T extends Tup2WF> T rSubT(float value, @ExtractionParam T res);
	
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
	float[] rSubT(float value, @ExtractionParam float[] res);
	
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
	<T extends Tup2WF> T rSubT(float v2x, float v2y, @ExtractionParam T res);

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
	float[] rSubT(float v2x, float v2y, @ExtractionParam float[] res);
	
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
	<T extends Tup2WF> T mulT(Tup2RF v2, @ExtractionParam T res);
	
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
	float[] mulT(Tup2RF v2, @ExtractionParam float[] res);
	
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
	<T extends Tup2WF> T mulT(float[] v2, @ExtractionParam T res);
	
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
	float[] mulT(float[] v2, @ExtractionParam float[] res);
	
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
	<T extends Tup2WF> T mulT(float value, @ExtractionParam T res);
	
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
	float[] mulT(float value, @ExtractionParam float[] res);
	
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
	<T extends Tup2WF> T mulT(float v2x, float v2y, @ExtractionParam T res);
	
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
	float[] mulT(float v2x, float v2y, @ExtractionParam float[] res);
	
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
	<T extends Tup2WF> T divT(Tup2RF v2, @ExtractionParam T res);
	
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
	float[] divT(Tup2RF v2, @ExtractionParam float[] res);
	
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
	<T extends Tup2WF> T divT(float[] v2, @ExtractionParam T res);
	
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
	float[] divT(float[] v2, @ExtractionParam float[] res);
	
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
	<T extends Tup2WF> T divT(float value, @ExtractionParam T res);
	
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
	float[] divT(float value, @ExtractionParam float[] res);
	
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
	<T extends Tup2WF> T divT(float v2x, float v2y, @ExtractionParam T res);
	
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
	float[] divT(float v2x, float v2y, @ExtractionParam float[] res);
	
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
	<T extends Tup2WF> T rDivT(Tup2RF v2, @ExtractionParam T res);
	
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
	float[] rDivT(Tup2RF v2, @ExtractionParam float[] res);
	
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
	<T extends Tup2WF> T rDivT(float[] v2, @ExtractionParam T res);
	
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
	float[] rDivT(float[] v2, @ExtractionParam float[] res);
	
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
	<T extends Tup2WF> T rDivT(float value, @ExtractionParam T res);
	
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
	float[] rDivT(float value, @ExtractionParam float[] res);
	
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
	<T extends Tup2WF> T rDivT(float v2x, float v2y, @ExtractionParam T res);
	
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
	float[] rDivT(float v2x, float v2y, @ExtractionParam float[] res);
	
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
	<T extends Tup2WF> T halfVecToT(Tup2RF v2, @ExtractionParam T res);
	
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
	float[] halfVecToT(Tup2RF v2, @ExtractionParam float[] res);
	
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
	<T extends Tup2WF> T halfVecToT(float[] v2, @ExtractionParam T res);
	
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
	float[] halfVecToT(float[] v2, @ExtractionParam float[] res);
	
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
	<T extends Tup2WF> T halfVecToT(float v2x, float v2y, @ExtractionParam T res);
	
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
	float[] halfVecToT(float v2x, float v2y, @ExtractionParam float[] res);
	
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
	<T extends Tup2WF> T midPointToT(Tup2RF v2, @ExtractionParam T res);
	
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
	float[] midPointToT(Tup2RF v2, @ExtractionParam float[] res);
	
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
	<T extends Tup2WF> T midPointToT(float[] v2, @ExtractionParam T res);
	
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
	float[] midPointToT(float[] v2, @ExtractionParam float[] res);
	
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
	<T extends Tup2WF> T midPointToT(float v2x, float v2y, @ExtractionParam T res);
	
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
	float[] midPointToT(float v2x, float v2y, @ExtractionParam float[] res);
	
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
	<T extends Tup2WF> T negT(@ExtractionParam T res);
	
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
	float[] negT(@ExtractionParam float[] res);
	
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
	<T extends Tup2WF> T recT(@ExtractionParam T res);
	
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
	float[] recT(@ExtractionParam float[] res);
	
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
	<T extends Tup2WF> T nrmT(@ExtractionParam T res);
	
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
	float[] nrmT(@ExtractionParam float[] res);
	
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
	<T extends Tup2WF> T minT(Tup2RF v2, @ExtractionParam T res);
	
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
	float[] minT(Tup2RF v2, @ExtractionParam float[] res);
	
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
	<T extends Tup2WF> T minT(float[] v2, @ExtractionParam T res);
	
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
	float[] minT(float[] v2, @ExtractionParam float[] res);
	
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
	<T extends Tup2WF> T minT(float v2x, float v2y, @ExtractionParam T res);
	
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
	float[] minT(float v2x, float v2y, @ExtractionParam float[] res);
	
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
	<T extends Tup2WF> T maxT(Tup2RF v2, @ExtractionParam T res);
	
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
	float[] maxT(Tup2RF v2, @ExtractionParam float[] res);
	
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
	<T extends Tup2WF> T maxT(float[] v2, @ExtractionParam T res);
	
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
	float[] maxT(float[] v2, @ExtractionParam float[] res);
	
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
	<T extends Tup2WF> T maxT(float v2x, float v2y, @ExtractionParam T res);
	
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
	float[] maxT(float v2x, float v2y, @ExtractionParam float[] res);
	
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
	<T extends Tup2WF> T rotRadT(float angle, @ExtractionParam T res);
	
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
	float[] rotRadT(float angle, @ExtractionParam float[] res);
	
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
	<T extends Tup2WF> T rotDegT(float angle, @ExtractionParam T res);
	
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
	float[] rotDegT(float angle, @ExtractionParam float[] res);
	
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
	<T extends Tup2WF> T projectT(Tup2RF t, @ExtractionParam T res);
	
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
	<T extends Tup2WF> T projectT(float[] t, @ExtractionParam T res);
	
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
	<T extends Tup2WF> T projectT(float tX, float tY, @ExtractionParam T res);
	
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
	float[] projectT(Tup2RF t, @ExtractionParam float[] res);
	
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
	float[] projectT(float[] t, @ExtractionParam float[] res);
	
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
	float[] projectT(float tX, float tY, @ExtractionParam float[] res);
	
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
	<T extends Tup2WF> T reflectT(Tup2RF n, @ExtractionParam T res);
	
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
	<T extends Tup2WF> T reflectT(float[] n, @ExtractionParam T res);
	
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
	<T extends Tup2WF> T reflectT(float nX, float nY, @ExtractionParam T res);
	
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
	float[] reflectT(Tup2RF n, @ExtractionParam float[] res);
	
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
	float[] reflectT(float[] n, @ExtractionParam float[] res);
	
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
	float[] reflectT(float nX, float nY, @ExtractionParam float[] res);
	
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
	<T extends Tup2WF> T ceilT(@ExtractionParam T res);
	
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
	float[] ceilT(@ExtractionParam float[] res);
	
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
	<T extends Tup2WF> T floorT(@ExtractionParam T res);
	
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
	float[] floorT(@ExtractionParam float[] res);
	
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
	<T extends Tup2WF> T roundT(@ExtractionParam T res);
	
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
	float[] roundT(@ExtractionParam float[] res);
	
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
	<T extends Tup2WF> T truncT(@ExtractionParam T res);
	
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
	float[] truncT(@ExtractionParam float[] res);
	
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
	<T extends Tup2WF> T roundT(RoundMethodF method, @ExtractionParam T res);
	
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
	float[] roundT(RoundMethodF method, @ExtractionParam float[] res);
	
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
	<T extends Tup2WF> T absT(@ExtractionParam T res);
	
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
	float[] absT(@ExtractionParam float[] res);
	
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
	<T extends Tup2WF> T signT(@ExtractionParam T res);
	
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
	float[] signT(@ExtractionParam float[] res);
	
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
	<T extends Tup2WF> T intVecLinT(Tup2RF v2, float alpha, @ExtractionParam T res);
	
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
	<T extends Tup2WF> T intVecLinT(float[] v2, float alpha, @ExtractionParam T res);
	
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
	<T extends Tup2WF> T intVecLinT(float v2x, float v2y, float alpha, @ExtractionParam T res);
	
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
	float[] intVecLinT(Tup2RF v2, float alpha, @ExtractionParam float[] res);
	
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
	float[] intVecLinR(float[] v2, float alpha, @ExtractionParam float[] res);
	
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
	float[] intVecLinT(float v2x, float v2y, float alpha, @ExtractionParam float[] res);
}
