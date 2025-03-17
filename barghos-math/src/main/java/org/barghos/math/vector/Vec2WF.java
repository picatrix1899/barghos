package org.barghos.math.vector;

import org.barghos.util.tuple.floats.Tup2RF;
import org.barghos.util.tuple.floats.Tup2WF;
import org.barghos.util.tuple.floats.TupRF;

/**
 * This interface provides the common functions and methods for float vectors with two dimensions.
 */
public interface Vec2WF extends Vec2RF, Tup2WF
{
	
	/** {@inheritDoc} */
	Vec2WF createNew();
	
	/** {@inheritDoc} */
	@Override
	Vec2WF createNew(Tup2RF t);
	
	/** {@inheritDoc} */
	@Override
	Vec2WF createNew(TupRF t);
	
	/** {@inheritDoc} */
	@Override
	Vec2WF createNew(float[] t);
	
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
	Vec2WF x(float x);
	
	/** {@inheritDoc} */
	Vec2WF y(float y);
	
	/** {@inheritDoc} */
	@Override
	Vec2WF set(Tup2RF t);
	
	/** {@inheritDoc} */
	@Override
	Vec2WF set(TupRF t);
	
	/** {@inheritDoc} */
	@Override
	Vec2WF set(float[] values);
	
	/** {@inheritDoc} */
	@Override
	Vec2WF set(float value);
	
	/** {@inheritDoc} */
	@Override
	Vec2WF set(float x, float y);
	
	/** {@inheritDoc} */
	@Override
	Vec2WF setAt(int index, float value);
	
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
	Vec2WF add(Tup2RF t);
	
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
	Vec2WF add(float[] t);
	
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
	Vec2WF add(float tx, float ty);
	
	/** {@inheritDoc} */
	@Override
	Vec2WF addN(Tup2RF t);
	
	/** {@inheritDoc} */
	@Override
	Vec2WF addN(float[] t);
	
	/** {@inheritDoc} */
	@Override
	Vec2WF addN(float value);
	
	/** {@inheritDoc} */
	@Override
	Vec2WF addN(float tx, float ty);
	
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
	Vec2WF sub(Tup2RF t);
	
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
	Vec2WF sub(float[] t);
	
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
	Vec2WF sub(float tx, float ty);
	
	/** {@inheritDoc} */
	@Override
	Vec2WF subN(Tup2RF t);
	
	/** {@inheritDoc} */
	@Override
	Vec2WF subN(float[] t);
	
	/** {@inheritDoc} */
	@Override
	Vec2WF subN(float value);
	
	/** {@inheritDoc} */
	@Override
	Vec2WF subN(float tx, float ty);
	
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
	Vec2WF rSub(Tup2RF t);
	
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
	Vec2WF rSub(float[] t);
	
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
	Vec2WF rSub(float value);
	
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
	Vec2WF rSub(float tx, float ty);
	
	/** {@inheritDoc} */
	@Override
	Vec2WF rSubN(Tup2RF t);
	
	/** {@inheritDoc} */
	@Override
	Vec2WF rSubN(float[] t);
	
	/** {@inheritDoc} */
	@Override
	Vec2WF rSubN(float value);
	
	/** {@inheritDoc} */
	@Override
	Vec2WF rSubN(float tx, float ty);
	
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
	Vec2WF mul(Tup2RF t);
	
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
	Vec2WF mul(float[] t);
	
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
	Vec2WF mul(float tx, float ty);
	
	/** {@inheritDoc} */
	@Override
	Vec2WF mulN(Tup2RF t);
	
	/** {@inheritDoc} */
	@Override
	Vec2WF mulN(float[] t);
	
	/** {@inheritDoc} */
	@Override
	Vec2WF mulN(float value);
	
	/** {@inheritDoc} */
	@Override
	Vec2WF mulN(float tx, float ty);
	
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
	Vec2WF div(Tup2RF t);
	
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
	Vec2WF div(float[] t);
	
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
	Vec2WF div(float tx, float ty);
	
	/** {@inheritDoc} */
	@Override
	Vec2WF divN(Tup2RF t);
	
	/** {@inheritDoc} */
	@Override
	Vec2WF divN(float[] t);
	
	/** {@inheritDoc} */
	@Override
	Vec2WF divN(float value);
	
	/** {@inheritDoc} */
	@Override
	Vec2WF divN(float tx, float ty);
	
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
	Vec2WF rDiv(Tup2RF t);
	
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
	Vec2WF rDiv(float[] t);
	
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
	Vec2WF rDiv(float value);

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
	Vec2WF rDiv(float tx, float ty);
	
	/** {@inheritDoc} */
	@Override
	Vec2WF rDivN(Tup2RF t);
	
	/** {@inheritDoc} */
	@Override
	Vec2WF rDivN(float[] t);
	
	/** {@inheritDoc} */
	@Override
	Vec2WF rDivN(float value);
	
	/** {@inheritDoc} */
	@Override
	Vec2WF rDivN(float tx, float ty);
	
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
	Vec2WF halfVecTo(Tup2RF t);
	
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
	Vec2WF halfVecTo(float[] t);
	
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
	Vec2WF halfVecTo(float tx, float ty);
	
	/** {@inheritDoc} */
	@Override
	Vec2WF halfVecToN(Tup2RF t);
	
	/** {@inheritDoc} */
	@Override
	Vec2WF halfVecToN(float[] t);
	
	/** {@inheritDoc} */
	@Override
	Vec2WF halfVecToN(float tx, float ty);
	
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
	Vec2WF midPointTo(Tup2RF t);
	
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
	Vec2WF midPointTo(float[] t);
	
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
	Vec2WF midPointTo(float tx, float ty);
	
	/** {@inheritDoc} */
	@Override
	Vec2WF midPointToN(Tup2RF t);
	
	/** {@inheritDoc} */
	@Override
	Vec2WF midPointToN(float[] t);
	
	/** {@inheritDoc} */
	@Override
	Vec2WF midPointToN(float tx, float ty);
	
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
	Vec2WF neg();
	
	/** {@inheritDoc} */
	@Override
	Vec2WF negN();
	
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
	Vec2WF rec();
	
	/** {@inheritDoc} */
	@Override
	Vec2WF recN();
	
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
	Vec2WF nrm();
	
	/** {@inheritDoc} */
	@Override
	Vec2WF nrmN();
	
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
	Vec2WF rotRad(double angle);
	
	/** {@inheritDoc} */
	@Override
	Vec2WF rotRadN(double angle);
	
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
	Vec2WF rotDeg(double angle);
	
	/** {@inheritDoc} */
	@Override
	Vec2WF rotDegN(double angle);
	
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
	Vec2WF project(float[] t);
	
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
	Vec2WF project(float tx, float ty);
	
	/** {@inheritDoc} */
	@Override
	Vec2WF projectN(Tup2RF t);
	
	/** {@inheritDoc} */
	@Override
	Vec2WF projectN(float[] t);
	
	/** {@inheritDoc} */
	@Override
	Vec2WF projectN(float tx, float ty);
	
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
	Vec2WF reflect(float[] n);
	
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
	Vec2WF reflect(float nx, float ny);
	
	/** {@inheritDoc} */
	@Override
	Vec2WF reflectN(Tup2RF n);
	
	/** {@inheritDoc} */
	@Override
	Vec2WF reflectN(float[] n);
	
	/** {@inheritDoc} */
	@Override
	Vec2WF reflectN(float nx, float ny);
	
	/**
	 * Calculates the absolute value of the component values.
	 * 
	 * <p>
	 * This operation <u><b>does</b></u> alter the vector.
	 * 
	 * @return The current vector.
	 */
	Vec2WF abs();
	
	/** {@inheritDoc} */
	@Override
	Vec2WF absN();
	
	/**
	 * Calculates the {@link Math#signum(float) signum} of the components of this vector.
	 * 
	 * <p>
	 * This operation <u><b>does</b></u> alter the vector.
	 * 
	 * @return The current vector.
	 */
	Vec2WF sign();
	
	/** {@inheritDoc} */
	@Override
	Vec2WF signN();
	
	/** {@inheritDoc} */
	@Override
	Vec2WF arrange(int[] indices);
	
	/** {@inheritDoc} */
	@Override
	Vec2WF arrangeN(int[] indices);
	
	/** {@inheritDoc} */
	@Override
	Vec2WF arrange(int indexX, int indexY);

	/** {@inheritDoc} */
	@Override
	Vec2WF arrangeN(int indexX, int indexY);
	
	/** {@inheritDoc} */
	@Override
	Vec2WF swizzle(int indexA, int indexB);
	
	/** {@inheritDoc} */
	@Override
	Vec2WF swizzleN(int indexA, int indexB);
	
	/** {@inheritDoc} */
	@Override
	Vec2WF swizzleV0V1();
	
	/** {@inheritDoc} */
	@Override
	Vec2WF swizzleV0V1N();
	
	Vec2WF swizzleXY();
	
	Vec2WF swizzleXYN();

	Vec2WF minComponents(Tup2RF t);
	
	Vec2WF minComponentsN(Tup2RF t);
	
	Vec2WF minComponentsN(TupRF t);

	Vec2WF maxComponents(Tup2RF t);
	
	Vec2WF maxComponentsN(Tup2RF t);
	
	Vec2WF maxComponentsN(TupRF t);
}
