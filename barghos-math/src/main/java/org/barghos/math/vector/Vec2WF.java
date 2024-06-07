package org.barghos.math.vector;

import org.barghos.annotation.IntValueRange;
import org.barghos.annotation.MinLength;
import org.barghos.util.math.FloatRoundMethod;
import org.barghos.util.math.MathProvider;
import org.barghos.util.tuple.floats.Tup2RF;
import org.barghos.util.tuple.floats.TupRF;

/**
 * This interface provides the common functions and methods for float vectors with two dimensions.
 */
public interface Vec2WF extends Vec2RF, VecBase2WF
{
	
	/** {@inheritDoc} */
	@Override
	Vec2WF createNew();
	
	/** {@inheritDoc} */
	@Override
	Vec2WF createNew(Tup2RF v);
	
	/** {@inheritDoc} */
	@Override
	Vec2WF createNew(@MinLength(2) float... v);
	
	/** {@inheritDoc} */
	@Override
	Vec2WF createNew(float value);
	
	/** {@inheritDoc} */
	@Override
	Vec2WF createNew(float x, float y);
	
	/** {@inheritDoc} */
	@Override
	Vec2WF copy();
	
	/** {@inheritDoc} */
	@Override
	Vec2WF x(float x);
	
	/** {@inheritDoc} */
	@Override
	Vec2WF y(float y);
	
	/** {@inheritDoc} */
	@Override
	Vec2WF set(Tup2RF t);
	
	/** {@inheritDoc} */
	@Override
	Vec2WF set(float value);
	
	/** {@inheritDoc} */
	@Override
	Vec2WF set(float x, float y);
	
	/** {@inheritDoc} */
	@Override
	Vec2WF set(@MinLength(2) TupRF t);
	
	/** {@inheritDoc} */
	@Override
	Vec2WF setAt(@IntValueRange(min = 0, max = 1) int index, float value);
	
	/** {@inheritDoc} */
	@Override
	Vec2WF set(@MinLength(2) float... values);
	
	/**
	 * Adds the given vector {@code (v2)} to this vector
	 * 
	 * <p>
	 * This operation <u><b>does</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v + v2}
	 * 
	 * @param v2
	 *     The vector to add to this vector.
	 * 
	 * @return The current vector.
	 */
	Vec2WF add(Tup2RF v2);
	
	/**
	 * Adds the given vector {@code (v2[0], v2[1])} to this vector.
	 * 
	 * <p>
	 * This operation <u><b>does</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v + (v2[0], v2[1])}
	 * 
	 * @param v2
	 *     The vector to add to this vector as an array with at least two entries.
	 * 
	 * @return The current vector.
	 */
	Vec2WF add(@MinLength(2) float[] v2);
	
	/**
	 * Adds the given value {@code (value)} to every component of this vector.
	 * 
	 * <p>
	 * This operation <u><b>does</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v + (value, value)}
	 * 
	 * @param value
	 *     The value to add to this vector.
	 * 
	 * @return The current vector.
	 */
	Vec2WF add(float value);
	
	/**
	 * Adds the given vector {@code (v2x, v2y)} to this vector.
	 * 
	 * <p>
	 * This operation <u><b>does</b></u> alter the vector.
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
	 * @return The current vector.
	 */
	Vec2WF add(float v2x, float v2y);
	
	/**
	 * Subtracts the given vector {@code (v2)} from this vector.
	 * 
	 * <p>
	 * This operation <u><b>does</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v - v2}
	 * 
	 * @param v2
	 *     The vector to subtract from this vector.
	 * 
	 * @return The current vector.
	 */
	Vec2WF sub(Tup2RF v2);
	
	/**
	 * Subtracts the given vector {@code (v2[0], v2[1])} from this vector.
	 * 
	 * <p>
	 * This operation <u><b>does</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v - (v2[0], v2[1])}
	 * 
	 * @param v2
	 *     The vector to subtract from this vector as an array with at least two entries.
	 * 
	 * @return The current vector.
	 */
	Vec2WF sub(@MinLength(2) float[] v2);
	
	/**
	 * Subtracts the given value {@code (value)} from every component of this vector.
	 * 
	 * <p>
	 * This operation <u><b>does</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v - (value, value)}
	 * 
	 * @param value
	 *     The value to subtract from this vector.
	 * 
	 * @return The current vector.
	 */
	Vec2WF sub(float value);
	
	/**
	 * Subtracts the given vector {@code (v2x, v2y)} from this vector.
	 * 
	 * <p>
	 * This operation <u><b>does</b></u> alter the vector.
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
	 * @return The current vector.
	 */
	Vec2WF sub(float v2x, float v2y);
	
	/**
	 * Subtracts this vector from the given vector {@code (v2)}.
	 * 
	 * <p>
	 * This operation <u><b>does</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v2 - v}
	 * 
	 * @param v2
	 *     The vector this vector is subtracted from.
	 * 
	 * @return The current vector.
	 */
	Vec2WF revSub(Tup2RF v2);
	
	/**
	 * Subtracts this vector from the given vector {@code (v2[0], v2[1])}.
	 * 
	 * <p>
	 * This operation <u><b>does</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2[0], v2[1]) - v}
	 * 
	 * @param v2
	 *     The vector this vector is subtracted from as an array with at least two entries.
	 * 
	 * @return The current vector.
	 */
	Vec2WF revSub(@MinLength(2) float[] v2);
	
	/**
	 * Subtracts every component of this vector from the given value {@code (value)}.
	 * 
	 * <p>
	 * This operation <u><b>does</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (value, value) - v}
	 * 
	 * @param value
	 *     The value this vector is subtracted from.
	 * 
	 * @return The current vector.
	 */
	Vec2WF revSub(float value);
	
	/**
	 * Subtracts this vector from the given vector {@code (v2x, v2y)}.
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
	 * @return The current vector.
	 */
	Vec2WF revSub(float v2x, float v2y);
	
	/**
	 * Multiplies this vector with the given vector {@code (v2)}.
	 * 
	 * <p>
	 * This operation <u><b>does</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v * v2}
	 * 
	 * @param v2
	 *     The vector to multiply this vector with.
	 * 
	 * @return The current vector.
	 */
	Vec2WF mul(Tup2RF v2);
	
	/**
	 * Multiplies this vector with the given vector {@code (v2[0], v2[1])}.
	 * 
	 * <p>
	 * This operation <u><b>does</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v * (v2[0], v2[1])}
	 * 
	 * @param v2
	 *     The vector to multiply this vector with as an array with at least two entries.
	 * 
	 * @return The current vector.
	 */
	Vec2WF mul(@MinLength(2) float[] v2);
	
	/**
	 * Multiplies every component of this vector with the given value {@code (value)}.
	 * 
	 * <p>
	 * This operation <u><b>does</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v * (value, value)}
	 * 
	 * @param value
	 *     The value to multiply this vector with.
	 * 
	 * @return The current vector.
	 */
	Vec2WF mul(float value);

	/**
	 * Multiplies this vector with the given vector {@code (v2x, v2y)}.
	 * 
	 * <p>
	 * This operation <u><b>does</b></u> alter the vector.
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
	 * @return The current vector.
	 */
	Vec2WF mul(float v2x, float v2y);
	
	/**
	 * Divides this vector by the given vector {@code (v2)}.
	 * 
	 * <p>
	 * This operation <u><b>does</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v / v2}
	 * 
	 * @param v2
	 *     The vector to divide this vector by.
	 * 
	 * @return The current vector.
	 */
	Vec2WF div(Tup2RF v2);
	
	/**
	 * Divides this vector by the given vector {@code (v2[0], v2[1])}.
	 * 
	 * <p>
	 * This operation <u><b>does</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v / (v2[0], v2[1])}
	 * 
	 * @param v2
	 *     The vector to divide this vector by as an array with at least two entries.
	 * 
	 * @return The current vector.
	 */
	Vec2WF div(@MinLength(2) float[] v2);
	
	/**
	 * Divides each component of this vector by the given value {@code (value)}.
	 * 
	 * <p>
	 * This operation <u><b>does</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v / (value, value)}
	 * 
	 * @param value
	 *     The value to divide this vector by.
	 * 
	 * @return The current vector.
	 */
	Vec2WF div(float value);
	
	/**
	 * Divides this vector by the given vector {@code (v2x, v2y)}.
	 * 
	 * <p>
	 * This operation <u><b>does</b></u> alter the vector.
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
	 * @return The current vector.
	 */
	Vec2WF div(float v2x, float v2y);
	
	/**
	 * Divides the given vector {@code (v2)} by this vector.
	 * 
	 * <p>
	 * This operation <u><b>does</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v2 / v}
	 * 
	 * @param v2
	 *     The vector to divide by this vector.
	 * 
	 * @return The current vector.
	 */
	Vec2WF revDiv(Tup2RF v2);
	
	/**
	 * Divides the given vector {@code (v2[0], v2[1])} by this vector.
	 * 
	 * <p>
	 * This operation <u><b>does</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2[0], v2[1]) / v}
	 * 
	 * @param v2
	 *     The vector to divide by this vector as an array with at least two entries.
	 * 
	 * @return The current vector.
	 */
	Vec2WF revDiv(@MinLength(2) float[] v2);
	
	/**
	 * Divides the given value {@code (value)} by each component of this vector.
	 * 
	 * <p>
	 * This operation <u><b>does</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (value, value) / v}
	 * 
	 * @param value
	 *     The value to divide by this vector.
	 * 
	 * @return The current vector.
	 */
	Vec2WF revDiv(float value);

	/**
	 * Divides the given vector {@code (v2x, v2y)} by this vector.
	 * 
	 * <p>
	 * This operation <u><b>does</b></u> alter the vector.
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
	 * @return The current vector.
	 */
	Vec2WF revDiv(float v2x, float v2y);
	
	/**
	 * Calculates half the vector from the endpoint of this vector to the endpoint of the given
	 * vector {@code (v2)}.
	 * 
	 * <p>
	 * This operation <u><b>does</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ( v2 - v ) / 2}
	 * 
	 * @param v2
	 *     The second vector.
	 * 
	 * @return The current vector.
	 */
	Vec2WF halfVectorTo(Tup2RF v2);
	
	/**
	 * Calculates half the vector from the endpoint of this vector to the endpoint of the given
	 * vector {@code (v2[0], v2[1])}.
	 * 
	 * <p>
	 * This operation <u><b>does</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ( (v2[0], v2[1]) - v ) / 2}
	 * 
	 * @param v2
	 *     The second vector as an array with at least two entries.
	 * 
	 * @return The current vector.
	 */
	Vec2WF halfVectorTo(@MinLength(2) float[] v2);
	
	/**
	 * Calculates half the vector from the endpoint of this vector to the endpoint of the given
	 * vector {@code (v2x, v2y)}.
	 * 
	 * <p>
	 * This operation <u><b>does</b></u> alter the vector.
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
	 * @return The current vector.
	 */
	Vec2WF halfVectorTo(float v2x, float v2y);
	
	/**
	 * Calculates the origin vector to the point that lies half way between the endpoint of this
	 * vector and the endpoint of the given vector {@code (v2)}.
	 * 
	 * <p>
	 * This operation <u><b>does</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ( v2 + v ) / 2}
	 * 
	 * @param v2
	 *     The second vector.
	 * 
	 * @return The current vector.
	 */
	Vec2WF halfPointBetween(Tup2RF v2);
	
	/**
	 * Calculates the origin vector to the point that lies half way between the endpoint of this
	 * vector and the endpoint of the given vector {@code (v2[0], v2[1])}.
	 * 
	 * <p>
	 * This operation <u><b>does</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ( (v2[0], v2[1]) + v ) / 2}
	 * 
	 * @param v2
	 *     The second vector as an array with at least two entries.
	 * 
	 * @return The current vector.
	 */
	Vec2WF halfPointBetween(@MinLength(2) float[] v2);
	
	/**
	 * Calculates the origin vector to the point that lies half way between the endpoint of this
	 * vector and the endpoint of the given vector {@code (v2x, v2y)}.
	 * 
	 * <p>
	 * This operation <u><b>does</b></u> alter the vector.
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
	 * @return The current vector.
	 */
	Vec2WF halfPointBetween(float v2x, float v2y);
	
	/**
	 * Negates this vector.
	 * 
	 * <p>
	 * This operation <u><b>does</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code -v}
	 * 
	 * @return The current vector.
	 */
	Vec2WF negate();
	
	/**
	 * Inverses this vector.
	 * 
	 * <p>
	 * This operation <u><b>does</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code 1 / v}
	 * 
	 * @return The current vector.
	 */
	Vec2WF inverse();
	
	/**
	 * Normalizes this vector.
	 * 
	 * <p>
	 * This operation <u><b>does</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v / |v|}
	 * 
	 * @return The current vector.
	 */
	Vec2WF normalize();
	
	/**
	 * Compares each component of this vector with the corresponding component of the given vector
	 * {@code (v2)} and returns the smallest values.
	 * 
	 * <p>
	 * This operation <u><b>does</b></u> alter the vector.
	 * 
	 * @param v2
	 *     The second vector.
	 * 
	 * @return The current vector.
	 */
	Vec2WF minVector(Tup2RF v2);
	
	/**
	 * Compares each component of this vector with the corresponding component of the given vector
	 * {@code (v2[0], v2[1])} and returns the smallest.
	 * 
	 * <p>
	 * This operation <u><b>does</b></u> alter the vector.
	 * 
	 * @param v2
	 *     The second vector as an array with at least two entries.
	 * 
	 * @return The current vector.
	 */
	Vec2WF minVector(@MinLength(2) float[] v2);
	
	/**
	 * Compares each component of this vector with the corresponding component of the given vector
	 * {@code (v2x, v2y)} and returns the smallest values.
	 * 
	 * <p>
	 * This operation <u><b>does</b></u> alter the vector.
	 * 
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * 
	 * @return The current vector.
	 */
	Vec2WF minVector(float v2x, float v2y);
	
	/**
	 * Compares each component of this vector with the corresponding component of the given vector
	 * {@code (v2)} and returns the greatest values.
	 * 
	 * <p>
	 * This operation <u><b>does</b></u> alter the vector.
	 * 
	 * @param v2
	 *     The second vector.
	 * 
	 * @return The current vector.
	 */
	Vec2WF maxVector(Tup2RF v2);
	
	/**
	 * Compares each component of this vector with the corresponding component of the given vector
	 * {@code (v2[0], v2[1])} and returns the greatest values.
	 * 
	 * <p>
	 * This operation <u><b>does</b></u> alter the vector.
	 * 
	 * @param v2
	 *     The second vector as an array with at least two entries.
	 * 
	 * @return The current vector.
	 */
	Vec2WF maxVector(@MinLength(2) float[] v2);
	
	/**
	 * Compares each component of this vector with the corresponding component of the given vector
	 * {@code (v2x, v2y)} and returns the greatest values.
	 * 
	 * <p>
	 * This operation <u><b>does</b></u> alter the vector.
	 * 
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * 
	 * @return The current vector.
	 */
	Vec2WF maxVector(float v2x, float v2y);
	
	/**
	 * Rotates this vector by the given angle in radians.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * This operation <u><b>does</b></u> alter the vector.
	 * 
	 * @param angle
	 *     The angle in radians.
	 * 
	 * @return The current vector.
	 */
	Vec2WF rotateRad(float angle);
	
	/**
	 * Rotates this vector by the given angle in degrees.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * This operation <u><b>does</b></u> alter the vector.
	 * 
	 * @param angle
	 *     The angle in radians.
	 * 
	 * @return The current vector.
	 */
	Vec2WF rotateDeg(float angle);
	
	/**
	 * Calculates the orthogonal projection of this vector onto the normalized target vector
	 * {@code (t)}.
	 * 
	 * <p>
	 * This operation <u><b>does</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code t * (v . t)}
	 * 
	 * @param t
	 *     The projection target vector.
	 * 
	 * @return The current vector.
	 */
	Vec2WF project(Tup2RF t);
	
	/**
	 * Calculates the orthogonal projection of this vector onto the normalized target vector
	 * {@code (t[0], t[1])}.
	 * 
	 * <p>
	 * This operation <u><b>does</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (t[0], t[1]) * (v . (t[0], t[1]))}
	 * 
	 * @param t
	 *     The projection target vector as an array with at least two entries.
	 * 
	 * @return The current vector.
	 */
	Vec2WF project(@MinLength(2) float[] t);
	
	/**
	 * Calculates the orthogonal projection of this vector onto the normalized target vector
	 * {@code (tX, tY)}.
	 * 
	 * <p>
	 * This operation <u><b>does</b></u> alter the vector.
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
	 * @return The current vector.
	 */
	Vec2WF project(float tX, float tY);
	
	/**
	 * Calculates the reflection of this vector based on the given normalized surface normal
	 * {@code (n)}.
	 * 
	 * <p>
	 * This operation <u><b>does</b></u> alter the vector.
	 * 
	 * @param n
	 *     The surface normal vector.
	 * 
	 * @return The current vector.
	 */
	Vec2WF reflect(Tup2RF n);
	
	/**
	 * Calculates the reflection of this vector based on the given normalized surface normal
	 * {@code (n[0], n[1])}.
	 * 
	 * <p>
	 * This operation <u><b>does</b></u> alter the vector.
	 * 
	 * @param n
	 *     The surface normal vector as an array with at least two entries.
	 * 
	 * @return The current vector.
	 */
	Vec2WF reflect(@MinLength(2) float[] n);
	
	/**
	 * Calculates the reflection of this vector based on the given normalized surface normal
	 * {@code (nX, nY)}.
	 * 
	 * <p>
	 * This operation <u><b>does</b></u> alter the vector.
	 * 
	 * @param nX
	 *     The value of the x component of the surface normal vector.
	 * @param nY
	 *     The value of the y component of the surface normal vector.
	 * 
	 * @return The current vector.
	 */
	Vec2WF reflect(float nX, float nY);
	
	/**
	 * Rounds the components of this vector towards the next greater integer.
	 * 
	 * <p>
	 * This operation <u><b>does</b></u> alter the vector.
	 * 
	 * @return The current vector.
	 */
	Vec2WF ceil();
	
	/**
	 * Rounds the components of this vector towards the next smaller integer.
	 * 
	 * <p>
	 * This operation <u><b>does</b></u> alter the vector.
	 * 
	 * @return The current vector.
	 */
	Vec2WF floor();
	
	/**
	 * Rounds the components of this vector.
	 * 
	 * <p>
	 * This operation <u><b>does</b></u> alter the vector.
	 * 
	 * @return The current vector.
	 */
	Vec2WF round();
	
	/**
	 * Truncates the decimals of the components of this vector.
	 * 
	 * <p>
	 * This operation <u><b>does</b></u> alter the vector.
	 * 
	 * @return The current vector.
	 */
	Vec2WF trunc();
	
	/**
	 * Rounds the components of this vector using the given method.
	 * 
	 * <p>
	 * This operation <u><b>does</b></u> alter the vector.
	 * 
	 * @param method
	 *     The Method to use for rounding.
	 * 
	 * @return The current vector.
	 */
	Vec2WF round(FloatRoundMethod method);
	
	/**
	 * Calculates the absolute value of the component values.
	 * 
	 * <p>
	 * This operation <u><b>does</b></u> alter the vector.
	 * 
	 * @return The current vector.
	 */
	Vec2WF abs();
	
	/**
	 * Calculates the {@link Math#signum(float) signum} of the components of this vector.
	 * 
	 * <p>
	 * This operation <u><b>does</b></u> alter the vector.
	 * 
	 * @return The current vector.
	 */
	Vec2WF signum();
	
	/**
	 * Linearly integrates over the second given vector {@code (v2)} by the integrator
	 * {@code (alpha)} and adds the result to this vector. This assumes an integration delta of 1.0
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
	 * <p>
	 * This operation <u><b>does</b></u> alter the vector.
	 * 
	 * @param v2
	 *     The second vector. This vector will be integrated over.
	 * @param alpha
	 *     The integrator with an integration delta of 1.0f {@code (alpha / 1.0f)}.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	Vec2WF integrateLinear(Tup2RF v2, float alpha);
	
	/**
	 * Linearly integrates over the second given vector {@code (v2[0], v2[1])} by the integrator
	 * {@code (alpha)} and adds the result to this vector. This assumes an integration delta of 1.0
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
	 * <p>
	 * This operation <u><b>does</b></u> alter the vector.
	 * 
	 * @param v2
	 *     The second vector as an array with at least two entries. This vector will be integrated
	 *     over.
	 * @param alpha
	 *     The integrator with an integration delta of 1.0f {@code (alpha / 1.0f)}.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	Vec2WF integrateLinear(@MinLength(2) float[] v2, float alpha);
	
	/**
	 * Linearly integrates over the second given vector {@code (v2x, v2y)} by the integrator
	 * {@code (alpha)} and adds the result to this vector. This assumes an integration delta of 1.0
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
	 * <p>
	 * This operation <u><b>does</b></u> alter the vector.
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
	Vec2WF integrateLinear(float v2x, float v2y, float alpha);
	
	/** {@inheritDoc} */
	@Override
	Vec2WF addN(Tup2RF v2);
	
	/** {@inheritDoc} */
	@Override
	Vec2WF addN(@MinLength(2) float[] v2);
	
	/** {@inheritDoc} */
	@Override
	Vec2WF addN(float value);
	
	/** {@inheritDoc} */
	@Override
	Vec2WF addN(float v2x, float v2y);
	
	/** {@inheritDoc} */
	@Override
	Vec2WF subN(Tup2RF v2);
	
	/** {@inheritDoc} */
	@Override
	Vec2WF subN(@MinLength(2) float[] v2);
	
	/** {@inheritDoc} */
	@Override
	Vec2WF subN(float value);
	
	/** {@inheritDoc} */
	@Override
	Vec2WF subN(float v2x, float v2y);
	
	/** {@inheritDoc} */
	@Override
	Vec2WF revSubN(Tup2RF v2);
	
	/** {@inheritDoc} */
	@Override
	Vec2WF revSubN(@MinLength(2) float[] v2);
	
	/** {@inheritDoc} */
	@Override
	Vec2WF revSubN(float value);
	
	/** {@inheritDoc} */
	@Override
	Vec2WF revSubN(float v2x, float v2y);
	
	/** {@inheritDoc} */
	@Override
	Vec2WF mulN(Tup2RF v2);
	
	/** {@inheritDoc} */
	@Override
	Vec2WF mulN(@MinLength(2) float[] v2);
	
	/** {@inheritDoc} */
	@Override
	Vec2WF mulN(float value);
	
	/** {@inheritDoc} */
	@Override
	Vec2WF mulN(float v2x, float v2y);
	
	/** {@inheritDoc} */
	@Override
	Vec2WF divN(Tup2RF v2);
	
	/** {@inheritDoc} */
	@Override
	Vec2WF divN(@MinLength(2) float[] v2);
	
	/** {@inheritDoc} */
	@Override
	Vec2WF divN(float value);
	
	/** {@inheritDoc} */
	@Override
	Vec2WF divN(float v2x, float v2y);
	
	/** {@inheritDoc} */
	@Override
	Vec2WF revDivN(Tup2RF v2);
	
	/** {@inheritDoc} */
	@Override
	Vec2WF revDivN(@MinLength(2) float[] v2);
	
	/** {@inheritDoc} */
	@Override
	Vec2WF revDivN(float value);
	
	/** {@inheritDoc} */
	@Override
	Vec2WF revDivN(float v2x, float v2y);
	
	/** {@inheritDoc} */
	@Override
	Vec2WF halfVectorToN(Tup2RF v2);
	
	/** {@inheritDoc} */
	@Override
	Vec2WF halfVectorToN(@MinLength(2) float[] v2);
	
	/** {@inheritDoc} */
	@Override
	Vec2WF halfVectorToN(float v2x, float v2y);
	
	/** {@inheritDoc} */
	@Override
	Vec2WF halfPointBetweenN(Tup2RF v2);
	
	/** {@inheritDoc} */
	@Override
	Vec2WF halfPointBetweenN(@MinLength(2) float[] v2);
	
	/** {@inheritDoc} */
	@Override
	Vec2WF halfPointBetweenN(float v2x, float v2y);
	
	/** {@inheritDoc} */
	@Override
	Vec2WF negateN();
	
	/** {@inheritDoc} */
	@Override
	Vec2WF inverseN();
	
	/** {@inheritDoc} */
	@Override
	Vec2WF normalizeN();
	
	/** {@inheritDoc} */
	@Override
	Vec2WF minVectorN(Tup2RF v2);
	
	/** {@inheritDoc} */
	@Override
	Vec2WF minVectorN(@MinLength(2) float[] v2);
	
	/** {@inheritDoc} */
	@Override
	Vec2WF minVectorN(float v2x, float v2y);
	
	/** {@inheritDoc} */
	@Override
	Vec2WF maxVectorN(Tup2RF v2);
	
	/** {@inheritDoc} */
	@Override
	Vec2WF maxVectorN(@MinLength(2) float[] v2);
	
	/** {@inheritDoc} */
	@Override
	Vec2WF maxVectorN(float v2x, float v2y);
	
	/** {@inheritDoc} */
	@Override
	Vec2WF rotateRadN(float angle);
	
	/** {@inheritDoc} */
	@Override
	Vec2WF rotateDegN(float angle);
	
	/** {@inheritDoc} */
	@Override
	Vec2WF projectN(Tup2RF t);
	
	/** {@inheritDoc} */
	@Override
	Vec2WF projectN(@MinLength(2) float[] t);
	
	/** {@inheritDoc} */
	@Override
	Vec2WF projectN(float tX, float tY);
	
	/** {@inheritDoc} */
	@Override
	Vec2WF reflectN(Tup2RF n);
	
	/** {@inheritDoc} */
	@Override
	Vec2WF reflectN(@MinLength(2) float[] n);
	
	/** {@inheritDoc} */
	@Override
	Vec2WF reflectN(float nX, float nY);
	
	/** {@inheritDoc} */
	@Override
	Vec2WF ceilN();

	/** {@inheritDoc} */
	@Override
	Vec2WF floorN();
	
	/** {@inheritDoc} */
	@Override
	Vec2WF roundN();
	
	/** {@inheritDoc} */
	@Override
	Vec2WF truncN();
	
	/** {@inheritDoc} */
	@Override
	Vec2WF roundN(FloatRoundMethod method);
	
	/** {@inheritDoc} */
	@Override
	Vec2WF absN();
	
	/** {@inheritDoc} */
	@Override
	Vec2WF signumN();
	
	/** {@inheritDoc} */
	@Override
	Vec2WF integrateLinearN(Tup2RF v2, float alpha);
	
	/** {@inheritDoc} */
	@Override
	Vec2WF integrateLinearN(@MinLength(2) float[] v2, float alpha);
	
	/** {@inheritDoc} */
	@Override
	Vec2WF integrateLinearN(float v2x, float v2y, float alpha);
}
