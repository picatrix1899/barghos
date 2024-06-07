package org.barghos.math.vector;

import org.barghos.annotation.IntValueRange;
import org.barghos.annotation.MinLength;
import org.barghos.math.matrix.SimpleMat4fR;
import org.barghos.math.quaternion.SimpleQuatfR;
import org.barghos.util.math.FloatRoundMethod;
import org.barghos.util.math.MathProvider;
import org.barghos.util.tuple.floats.Tup3RF;
import org.barghos.util.tuple.floats.Tup4RF;
import org.barghos.util.tuple.floats.TupRF;

/**
 * This interface provides the common functions and methods for float vectors with three dimensions.
 */
public interface Vec3WF extends Vec3RF, VecBase3WF
{
	/** {@inheritDoc} */
	@Override
	Vec3WF createNew();
	
	/** {@inheritDoc} */
	@Override
	Vec3WF createNew(Tup3RF v);
	
	/** {@inheritDoc} */
	@Override
	Vec3WF createNew(@MinLength(3) float... v);
	
	/** {@inheritDoc} */
	@Override
	Vec3WF createNew(float value);
	
	/** {@inheritDoc} */
	@Override
	Vec3WF createNew(float x, float y, float z);
	
	/** {@inheritDoc} */
	@Override
	Vec3WF copy();
	
	/** {@inheritDoc} */
	@Override
	Vec3WF x(float x);
	
	/** {@inheritDoc} */
	@Override
	Vec3WF y(float y);
	
	/** {@inheritDoc} */
	@Override
	Vec3WF z(float z);
	
	/** {@inheritDoc} */
	@Override
	Vec3WF v0(float v0);
	
	/** {@inheritDoc} */
	@Override
	Vec3WF v1(float v1);
	
	/** {@inheritDoc} */
	@Override
	Vec3WF v2(float v2);
	
	/** {@inheritDoc} */
	@Override
	Vec3WF set(Tup3RF t);
	
	/** {@inheritDoc} */
	@Override
	Vec3WF set(float value);
	
	/** {@inheritDoc} */
	@Override
	Vec3WF set(float x, float y, float z);
	
	/** {@inheritDoc} */
	@Override
	Vec3WF set(@MinLength(3) TupRF t);
	
	/** {@inheritDoc} */
	@Override
	Vec3WF setAt(@IntValueRange(min = 0, max = 2) int index, float value);
	
	/** {@inheritDoc} */
	@Override
	Vec3WF set(@MinLength(3) float... values);
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
	Vec3WF add(Tup3RF v2);
	
	/**
	 * Adds the given vector {@code (v2[0], v2[1], v2[2])} to this vector.
	 * 
	 * <p>
	 * This operation <u><b>does</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v + (v2[0], v2[1], v2[2])}
	 * 
	 * @param v2
	 *     The vector to add to this vector as an array with at least three entries.
	 * 
	 * @return The current vector.
	 */
	Vec3WF add(@MinLength(3) float[] v2);
	
	/**
	 * Adds the given value {@code (value)} to every component of this vector.
	 * 
	 * <p>
	 * This operation <u><b>does</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v + (value, value, value)}
	 * 
	 * @param value
	 *     The value to add to this vector.
	 * 
	 * @return The current vector.
	 */
	Vec3WF add(float value);
	
	/**
	 * Adds the given vector {@code (v2x, v2y, v2z)} to this vector.
	 * 
	 * <p>
	 * This operation <u><b>does</b></u> alter the vector.
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
	 * @return The current vector.
	 */
	Vec3WF add(float v2x, float v2y, float v2z);
	
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
	Vec3WF sub(Tup3RF v2);
	
	/**
	 * Subtracts the given vector {@code (v2[0], v2[1], v2[2])} from this vector.
	 * 
	 * <p>
	 * This operation <u><b>does</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v - (v2[0], v2[1], v2[2])}
	 * 
	 * @param v2
	 *     The vector to subtract from this vector as an array with at least three entries.
	 * 
	 * @return The current vector.
	 */
	Vec3WF sub(@MinLength(3) float[] v2);
	
	/**
	 * Subtracts the given value {@code (value)} from every component of this vector.
	 * 
	 * <p>
	 * This operation <u><b>does</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v - (value, value, value)}
	 * 
	 * @param value
	 *     The value to subtract from this vector.
	 * 
	 * @return The current vector.
	 */
	Vec3WF sub(float value);
	
	/**
	 * Subtracts the given vector {@code (v2x, v2y, v2z)} from this vector.
	 * 
	 * <p>
	 * This operation <u><b>does</b></u> alter the vector.
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
	 * @return The current vector.
	 */
	Vec3WF sub(float v2x, float v2y, float v2z);
	
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
	Vec3WF revSub(Tup3RF v2);
	
	/**
	 * Subtracts this vector from the given vector {@code (v2[0], v2[1], v2[2])}.
	 * 
	 * <p>
	 * This operation <u><b>does</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2[0], v2[1], v2[2]) - v}
	 * 
	 * @param v2
	 *     The vector this vector is subtracted from as an array with at least three entries.
	 * 
	 * @return The current vector.
	 */
	Vec3WF revSub(@MinLength(3) float[] v2);
	
	/**
	 * Subtracts every component of this vector from the given value {@code (value)}.
	 * 
	 * <p>
	 * This operation <u><b>does</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (value, value, value) - v}
	 * 
	 * @param value
	 *     The value this vector is subtracted from.
	 * 
	 * @return The current vector.
	 */
	Vec3WF revSub(float value);
	
	/**
	 * Subtracts this vector from the given vector {@code (v2x, v2y, v2z)}.
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
	 * @return The current vector.
	 */
	Vec3WF revSub(float v2x, float v2y, float v2z);
	
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
	Vec3WF mul(Tup3RF v2);
	
	/**
	 * Multiplies this vector with the given vector {@code (v2[0], v2[1], v2[2])}.
	 * 
	 * <p>
	 * This operation <u><b>does</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v * (v2[0], v2[1], v2[2])}
	 * 
	 * @param v2
	 *     The vector to multiply this vector with as an array with at least three entries.
	 * 
	 * @return The current vector.
	 */
	Vec3WF mul(@MinLength(3) float[] v2);
	
	/**
	 * Multiplies every component of this vector with the given value {@code (value)}.
	 * 
	 * <p>
	 * This operation <u><b>does</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v * (value, value, value)}
	 * 
	 * @param value
	 *     The value to multiply this vector with.
	 * 
	 * @return The current vector.
	 */
	Vec3WF mul(float value);
	
	/**
	 * Multiplies this vector with the given vector {@code (v2x, v2y, v2z)}.
	 * 
	 * <p>
	 * This operation <u><b>does</b></u> alter the vector.
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
	 * @return The current vector.
	 */
	Vec3WF mul(float v2x, float v2y, float v2z);
	
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
	Vec3WF div(Tup3RF v2);
	
	/**
	 * Divides this vector by the given vector {@code (v2[0], v2[1], v2[2])}.
	 * 
	 * <p>
	 * This operation <u><b>does</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v / (v2[0], v2[1], v2[2])}
	 * 
	 * @param v2
	 *     The vector to divide this vector by as an array with at least three entries.
	 * 
	 * @return The current vector.
	 */
	Vec3WF div(@MinLength(3) float[] v2);
	
	/**
	 * Divides each component of this vector by the given value {@code (value)}.
	 * 
	 * <p>
	 * This operation <u><b>does</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v / (value, value, value)}
	 * 
	 * @param value
	 *     The value to divide this vector by.
	 * 
	 * @return The current vector.
	 */
	Vec3WF div(float value);
	
	/**
	 * Divides this vector by the given vector {@code (v2x, v2y, v2z)}.
	 * 
	 * <p>
	 * This operation <u><b>does</b></u> alter the vector.
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
	 * @return The current vector.
	 */
	Vec3WF div(float v2x, float v2y, float v2z);
	
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
	Vec3WF revDiv(Tup3RF v2);
	
	/**
	 * Divides the given vector {@code (v2[0], v2[1], v2[2])} by this vector.
	 * 
	 * <p>
	 * This operation <u><b>does</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2[0], v2[1], v2[2]) / v}
	 * 
	 * @param v2
	 *     The vector to divide by this vector as an array with at least three entries.
	 * 
	 * @return The current vector.
	 */
	Vec3WF revDiv(@MinLength(3) float[] v2);
	
	/**
	 * Divides the given value {@code (value)} by each component of this vector.
	 * 
	 * <p>
	 * This operation <u><b>does</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (value, value, value) / v}
	 * 
	 * @param value
	 *     The value to divide by this vector.
	 * 
	 * @return The current vector.
	 */
	Vec3WF revDiv(float value);
	
	/**
	 * Divides the given vector {@code (v2x, v2y, v2z)} by this vector.
	 * 
	 * <p>
	 * This operation <u><b>does</b></u> alter the vector.
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
	 * @return The current vector.
	 */
	Vec3WF revDiv(float v2x, float v2y, float v2z);
	
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
	Vec3WF halfVectorTo(Tup3RF v2);
	
	/**
	 * Calculates half the vector from the endpoint of this vector to the endpoint of the given
	 * vector {@code (v2[0], v2[1], v2[2])}.
	 * 
	 * <p>
	 * This operation <u><b>does</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ( (v2[0], v2[1], v2[2]) - v ) / 2}
	 * 
	 * @param v2
	 *     The second vector as an array with at least three entries.
	 * 
	 * @return The current vector.
	 */
	Vec3WF halfVectorTo(@MinLength(3) float[] v2);
	
	/**
	 * Calculates half the vector from the endpoint of this vector to the endpoint of the given
	 * vector {@code (v2x, v2y, v2z)}.
	 * 
	 * <p>
	 * This operation <u><b>does</b></u> alter the vector.
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
	 * @return The current vector.
	 */
	Vec3WF halfVectorTo(float v2x, float v2y, float v2z);
	
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
	Vec3WF halfPointBetween(Tup3RF v2);
	
	/**
	 * Calculates the origin vector to the point that lies half way between the endpoint of this
	 * vector and the endpoint of the given vector {@code (v2[0], v2[1], v2[2])}.
	 * 
	 * <p>
	 * This operation <u><b>does</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ( (v2[0], v2[1], v2[2]) + v ) / 2}
	 * 
	 * @param v2
	 *     The second vector as an array with at least three entries.
	 * 
	 * @return The current vector.
	 */
	Vec3WF halfPointBetween(@MinLength(3) float[] v2);
	
	/**
	 * Calculates the origin vector to the point that lies half way between the endpoint of this
	 * vector and the endpoint of the given vector {@code (v2x, v2y, v2z)}.
	 * 
	 * <p>
	 * This operation <u><b>does</b></u> alter the vector.
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
	 * @return The current vector.
	 */
	Vec3WF halfPointBetween(float v2x, float v2y, float v2z);
	
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
	Vec3WF negate();
	
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
	Vec3WF inverse();
	
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
	Vec3WF normalize();
	
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
	Vec3WF minVector(Tup3RF v2);
	
	/**
	 * Compares each component of this vector with the corresponding component of the given vector
	 * {@code (v2[0], v2[1], v2[2])} and returns the smallest.
	 * 
	 * <p>
	 * This operation <u><b>does</b></u> alter the vector.
	 * 
	 * @param v2
	 *     The second vector as an array with at least three entries.
	 * 
	 * @return The current vector.
	 */
	Vec3WF minVector(@MinLength(3) float[] v2);
	
	/**
	 * Compares each component of this vector with the corresponding component of the given vector
	 * {@code (v2x, v2y, v2z)} and returns the smallest values.
	 * 
	 * <p>
	 * This operation <u><b>does</b></u> alter the vector.
	 * 
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * @param v2z
	 *     The value of the z component of the second vector.
	 * 
	 * @return The current vector.
	 */
	Vec3WF minVector(float v2x, float v2y, float v2z);
	
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
	Vec3WF maxVector(Tup3RF v2);
	
	/**
	 * Compares each component of this vector with the corresponding component of the given vector
	 * {@code (v2[0], v2[1], v2[2])} and returns the greatest values.
	 * 
	 * <p>
	 * This operation <u><b>does</b></u> alter the vector.
	 * 
	 * @param v2
	 *     The second vector as an array with at least three entries.
	 * 
	 * @return The current vector.
	 */
	Vec3WF maxVector(@MinLength(3) float[] v2);
	
	/**
	 * Compares each component of this vector with the corresponding component of the given vector
	 * {@code (v2x, v2y, v2z)} and returns the greatest values.
	 * 
	 * <p>
	 * This operation <u><b>does</b></u> alter the vector.
	 * 
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * @param v2z
	 *     The value of the z component of the second vector.
	 * 
	 * @return The current vector.
	 */
	Vec3WF maxVector(float v2x, float v2y, float v2z);
	
	/**
	 * Rotates this vector by the given angle in radians around the rotation axis {@code (axis)}.
	 * 
	 * <p>
	 * This operation <u><b>does</b></u> alter the vector.
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
	 * @return The current vector.
	 */
	Vec3WF rotateRad(Tup3RF axis, float angle);
	
	/**
	 * Rotates this vector by the given angle in radians around the rotation axis {@code (axis)}.
	 * 
	 * <p>
	 * This operation <u><b>does</b></u> alter the vector.
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
	 * @return The current vector.
	 */
	Vec3WF rotateRad(Tup3RF axis, float angle, MathProvider mathProvider);
	
	/**
	 * Rotates this vector by the given angle in radians around the rotation axis
	 * {@code (axis[0], axis[1], axis[2])}.
	 * 
	 * <p>
	 * This operation <u><b>does</b></u> alter the vector.
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
	 * @return The current vector.
	 */
	Vec3WF rotateRad(@MinLength(3) float[] axis, float angle);
	
	/**
	 * Rotates this vector by the given angle in radians around the rotation axis
	 * {@code (axis[0], axis[1], axis[2])}.
	 * 
	 * <p>
	 * This operation <u><b>does</b></u> alter the vector.
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
	 * @return The current vector.
	 */
	Vec3WF rotateRad(@MinLength(3) float[] axis, float angle, MathProvider mathProvider);
	
	/**
	 * Rotates this vector by the given angle in radians around the rotation axis
	 * {@code (axisX, axisY, axisZ)}.
	 * 
	 * <p>
	 * This operation <u><b>does</b></u> alter the vector.
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
	 * @return The current vector.
	 */
	Vec3WF rotateRad(float axisX, float axisY, float axisZ, float angle);
	
	/**
	 * Rotates this vector by the given angle in radians around the rotation axis
	 * {@code (axisX, axisY, axisZ)}.
	 * 
	 * <p>
	 * This operation <u><b>does</b></u> alter the vector.
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
	 * @return The current vector.
	 */
	Vec3WF rotateRad(float axisX, float axisY, float axisZ, float angle, MathProvider mathProvider);
	
	/**
	 * Rotates this vector by the given angle in degrees around the rotation axis {@code (axis)}.
	 * 
	 * <p>
	 * This operation <u><b>does</b></u> alter the vector.
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
	 * @return The current vector.
	 */
	Vec3WF rotateDeg(Tup3RF axis, float angle);
	
	/**
	 * Rotates this vector by the given angle in degrees around the rotation axis {@code (axis)}.
	 * 
	 * <p>
	 * This operation <u><b>does</b></u> alter the vector.
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
	 * @return The current vector.
	 */
	Vec3WF rotateDeg(Tup3RF axis, float angle, MathProvider mathProvider);
	
	/**
	 * Rotates this vector by the given angle in degrees around the rotation axis
	 * {@code (axis[0], axis[1], axis[2])}.
	 * 
	 * <p>
	 * This operation <u><b>does</b></u> alter the vector.
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
	 * @return The current vector.
	 */
	Vec3WF rotateDeg(@MinLength(3) float[] axis, float angle);
	
	/**
	 * Rotates this vector by the given angle in degrees around the rotation axis
	 * {@code (axis[0], axis[1], axis[2])}.
	 * 
	 * <p>
	 * This operation <u><b>does</b></u> alter the vector.
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
	 * @return The current vector.
	 */
	Vec3WF rotateDeg(@MinLength(3) float[] axis, float angle, MathProvider mathProvider);
	
	/**
	 * Rotates this vector by the given angle in degrees around the rotation axis
	 * {@code (axisX, axisY, axisZ)}.
	 * 
	 * <p>
	 * This operation <u><b>does</b></u> alter the vector.
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
	 * @return The current vector.
	 */
	Vec3WF rotateDeg(float axisX, float axisY, float axisZ, float angle);
	
	/**
	 * Rotates this vector by the given angle in degrees around the rotation axis
	 * {@code (axisX, axisY, axisZ)}.
	 * 
	 * <p>
	 * This operation <u><b>does</b></u> alter the vector.
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
	 * @return The current vector.
	 */
	Vec3WF rotateDeg(float axisX, float axisY, float axisZ, float angle, MathProvider mathProvider);
	
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
	Vec3WF project(Tup3RF t);
	
	/**
	 * Calculates the orthogonal projection of this vector onto the normalized target vector
	 * {@code (t[0], t[1], t[2])}.
	 * 
	 * <p>
	 * This operation <u><b>does</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (t[0], t[1], t[2]) * (v . (t[0], t[1],, t[2]))}
	 * 
	 * @param t
	 *     The projection target vector as an array with at least three entries.
	 * 
	 * @return The current vector.
	 */
	Vec3WF project(@MinLength(3) float[] t);
	
	/**
	 * Calculates the orthogonal projection of this vector onto the normalized target vector
	 * {@code (tX, tY, tZ)}.
	 * 
	 * <p>
	 * This operation <u><b>does</b></u> alter the vector.
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
	 * @return The current vector.
	 */
	Vec3WF project(float tX, float tY, float tZ);
	
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
	Vec3WF reflect(Tup3RF n);
	
	/**
	 * Calculates the reflection of this vector based on the given normalized surface normal
	 * {@code (n[0], n[1], n[2])}.
	 * 
	 * <p>
	 * This operation <u><b>does</b></u> alter the vector.
	 * 
	 * @param n
	 *     The surface normal vector as an array with at least three entries.
	 * 
	 * @return The current vector.
	 */
	Vec3WF reflect(@MinLength(3) float[] n);
	
	/**
	 * Calculates the reflection of this vector based on the given normalized surface normal
	 * {@code (nX, nY, nZ)}.
	 * 
	 * <p>
	 * This operation <u><b>does</b></u> alter the vector.
	 * 
	 * @param nX
	 *     The value of the x component of the surface normal vector.
	 * @param nY
	 *     The value of the y component of the surface normal vector.
	 * @param nZ
	 *     The value of the z component of the surface normal vector.
	 * 
	 * @return The current vector.
	 */
	Vec3WF reflect(float nX, float nY, float nZ);
	
	/**
	 * Rounds the components of this vector towards the next greater integer.
	 * 
	 * <p>
	 * This operation <u><b>does</b></u> alter the vector.
	 * 
	 * @return The current vector.
	 */
	Vec3WF ceil();
	
	/**
	 * Rounds the components of this vector towards the next smaller integer.
	 * 
	 * <p>
	 * This operation <u><b>does</b></u> alter the vector.
	 * 
	 * @return The current vector.
	 */
	Vec3WF floor();
	
	/**
	 * Rounds the components of this vector.
	 * 
	 * <p>
	 * This operation <u><b>does</b></u> alter the vector.
	 * 
	 * @return The current vector.
	 */
	Vec3WF round();
	
	/**
	 * Truncates the decimals of the components of this vector.
	 * 
	 * <p>
	 * This operation <u><b>does</b></u> alter the vector.
	 * 
	 * @return The current vector.
	 */
	Vec3WF trunc();
	
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
	Vec3WF round(FloatRoundMethod method);
	
	/**
	 * Calculates the absolute value of the component values.
	 * 
	 * <p>
	 * This operation <u><b>does</b></u> alter the vector.
	 * 
	 * @return The current vector.
	 */
	Vec3WF abs();
	
	/**
	 * Calculates the cross product between this vector and the second given vector {@code (v2)}.
	 * 
	 * <p>
	 * This operation <u><b>does</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v X v2}
	 * 
	 * @param v2
	 *     The second vector.
	 * 
	 * @return The current vector.
	 */
	Vec3WF cross(Tup3RF v2);
	
	/**
	 * Calculates the cross product between this vector and the second given vector
	 * {@code (v2[0], v2[1], v2[2])}.
	 * 
	 * <p>
	 * This operation <u><b>does</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v X (v2[0], v2[1], v2[2])}
	 * 
	 * @param v2
	 *     The second vector as an array with at least three entries.
	 * 
	 * @return The current vector.
	 */
	Vec3WF cross(@MinLength(3) float[] v2);
	
	/**
	 * Calculates the cross product between this vector and the second given vector
	 * {@code (value, value, value)}.
	 * 
	 * <p>
	 * This operation <u><b>does</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v X (value, value, value)}
	 * 
	 * @param value
	 *     The value for all the components of the second vector.
	 * 
	 * @return The current vector.
	 */
	Vec3WF cross(float value);
	
	/**
	 * Calculates the cross product between this vector and the second given vector
	 * {@code (v2x, v2y, v2z)}.
	 * 
	 * <p>
	 * This operation <u><b>does</b></u> alter the vector.
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
	 * @return The current vector.
	 */
	Vec3WF cross(float v2x, float v2y, float v2z);
	
	/**
	 * Calculates the {@link Math#signum(float) signum} of the components of this vector.
	 * 
	 * <p>
	 * This operation <u><b>does</b></u> alter the vector.
	 * 
	 * @return The current vector.
	 */
	Vec3WF signum();
	
	/**
	 * Linearly integrates over the second given vector {@code (v2)} by the integrator
	 * {@code (alpha)}, adds the result to this vector. This assumes an integration delta of 1.0 so
	 * that the integration is over {@code (alpha / 1.0)}, therefore if {@code (alpha)} is 1.0 the
	 * unscaled second vector is added. Otherwise it will be scaled before adding.
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
	 * @return The current vector.
	 */
	Vec3WF integrateLinear(Tup3RF v2, float alpha);
	
	/**
	 * Linearly integrates over the second given vector {@code (v2[0], v2[1], v2[2])} by the
	 * integrator {@code (alpha)}, adds the result to this vector. This assumes an integration delta
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
	 * <p>
	 * This operation <u><b>does</b></u> alter the vector.
	 * 
	 * @param v2
	 *     The second vector as an array with at least three entries. This vector will be integrated
	 *     over.
	 * @param alpha
	 *     The integrator with an integration delta of 1.0f {@code (alpha / 1.0f)}.
	 * 
	 * @return The current vector.
	 */
	Vec3WF integrateLinear(@MinLength(3) float[] v2, float alpha);
	
	/**
	 * Linearly integrates over the second given vector {@code (v2x, v2y, v2z)} by the integrator
	 * {@code (alpha)}, adds the result to this vector. This assumes an integration delta of 1.0 so
	 * that the integration is over {@code (alpha / 1.0)}, therefore if {@code (alpha)} is 1.0 the
	 * unscaled second vector is added. Otherwise it will be scaled before adding.
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
	 * @param v2z
	 *     The value of the z component of the second vector. This vector will be integrated over.
	 * @param alpha
	 *     The integrator with an integration delta of 1.0f {@code (alpha / 1.0f)}.
	 * 
	 * @return The current vector.
	 */
	Vec3WF integrateLinear(float v2x, float v2y, float v2z, float alpha);
	
	/**
	 * Transforms this vector by the quaternion {@code (q)}.
	 * 
	 * <p>
	 * This operation <u><b>does</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * q * v * q*
	 * 
	 * @param q
	 *     The quaternion.
	 * 
	 * @return The current vector.
	 */
	Vec3WF transformQuat(SimpleQuatfR q);
	
	/**
	 * Transforms this vector by the quaternion {@code (q)}.
	 * 
	 * <p>
	 * This operation <u><b>does</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * q * v * q*
	 * 
	 * @param q
	 *     The quaternion.
	 * 
	 * @return The current vector.
	 */
	Vec3WF transformQuat(Tup4RF q);
	
	/**
	 * Transforms this vector by the quaternion {@code (q[0], q[1], q[2], q[3])}.
	 * 
	 * <p>
	 * This operation <u><b>does</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * (q[0], q[1], q[2], q[3]) * v * (q[0], q[1], q[2], q[3])*
	 * 
	 * @param q
	 *     The quaternion as an array with at least four entries.
	 * 
	 * @return The current vector.
	 */
	Vec3WF transformQuat(@MinLength(4) float[] q);
	
	/**
	 * Transforms this vector by the quaternion {@code (qX, qY, qZ, qW)}.
	 * 
	 * <p>
	 * This operation <u><b>does</b></u> alter the vector.
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
	 * @return The current vector.
	 */
	Vec3WF transformQuat(float qW, float qX, float qY, float qZ);
	
	Vec3WF transformVectorMat4(SimpleMat4fR m);
	
	Vec3WF transformVectorMat4(float[][] m);
	
	Vec3WF transformPointMat4(SimpleMat4fR m);
	
	Vec3WF transformPointMat4(float[][] m);
	
	/** {@inheritDoc} */
	@Override
	Vec3WF addN(Tup3RF v2);
	
	/** {@inheritDoc} */
	@Override
	Vec3WF addN(@MinLength(3) float[] v2);
	
	/** {@inheritDoc} */
	@Override
	Vec3WF addN(float value);
	
	/** {@inheritDoc} */
	@Override
	Vec3WF addN(float v2x, float v2y, float v2z);
	
	/** {@inheritDoc} */
	@Override
	Vec3WF subN(Tup3RF v2);
	
	/** {@inheritDoc} */
	@Override
	Vec3WF subN(@MinLength(3) float[] v2);
	
	/** {@inheritDoc} */
	@Override
	Vec3WF subN(float value);
	
	/** {@inheritDoc} */
	@Override
	Vec3WF subN(float v2x, float v2y, float v2z);
	
	/** {@inheritDoc} */
	@Override
	Vec3WF revSubN(Tup3RF v2);
	
	/** {@inheritDoc} */
	@Override
	Vec3WF revSubN(@MinLength(3) float[] v2);
	
	/** {@inheritDoc} */
	@Override
	Vec3WF revSubN(float value);
	
	/** {@inheritDoc} */
	@Override
	Vec3WF revSubN(float v2x, float v2y, float v2z);
	
	/** {@inheritDoc} */
	@Override
	Vec3WF mulN(Tup3RF v2);
	
	/** {@inheritDoc} */
	@Override
	Vec3WF mulN(@MinLength(3) float[] v2);
	
	/** {@inheritDoc} */
	@Override
	Vec3WF mulN(float value);
	
	/** {@inheritDoc} */
	@Override
	Vec3WF mulN(float v2x, float v2y, float v2z);
	
	/** {@inheritDoc} */
	@Override
	Vec3WF divN(Tup3RF v2);
	
	/** {@inheritDoc} */
	@Override
	Vec3WF divN(@MinLength(2) float[] v2);
	
	/** {@inheritDoc} */
	@Override
	Vec3WF divN(float value);
	
	/** {@inheritDoc} */
	@Override
	Vec3WF divN(float v2x, float v2y, float v2z);
	
	/** {@inheritDoc} */
	@Override
	Vec3WF revDivN(Tup3RF v2);
	
	/** {@inheritDoc} */
	@Override
	Vec3WF revDivN(@MinLength(3) float[] v2);
	
	/** {@inheritDoc} */
	@Override
	Vec3WF revDivN(float value);
	
	/** {@inheritDoc} */
	@Override
	Vec3WF revDivN(float v2x, float v2y, float v2z);
	
	/** {@inheritDoc} */
	@Override
	Vec3WF halfVectorToN(Tup3RF v2);
	
	/** {@inheritDoc} */
	@Override
	Vec3WF halfVectorToN(@MinLength(3) float[] v2);
	
	/** {@inheritDoc} */
	@Override
	Vec3WF halfVectorToN(float v2x, float v2y, float v2z);
	
	/** {@inheritDoc} */
	@Override
	Vec3WF halfPointBetweenN(Tup3RF v2);
	
	/** {@inheritDoc} */
	@Override
	Vec3WF halfPointBetweenN(@MinLength(3) float[] v2);
	
	/** {@inheritDoc} */
	@Override
	Vec3WF halfPointBetweenN(float v2x, float v2y, float v2z);
	
	/** {@inheritDoc} */
	@Override
	Vec3WF negateN();
	
	/** {@inheritDoc} */
	@Override
	Vec3WF inverseN();
	
	/** {@inheritDoc} */
	@Override
	Vec3WF normalizeN();
	
	/** {@inheritDoc} */
	@Override
	Vec3WF minVectorN(Tup3RF v2);
	
	/** {@inheritDoc} */
	@Override
	Vec3WF minVectorN(@MinLength(3) float[] v2);
	
	/** {@inheritDoc} */
	@Override
	Vec3WF minVectorN(float v2x, float v2y, float v2z);
	
	/** {@inheritDoc} */
	@Override
	Vec3WF maxVectorN(Tup3RF v2);
	
	/** {@inheritDoc} */
	@Override
	Vec3WF maxVectorN(@MinLength(3) float[] v2);
	
	/** {@inheritDoc} */
	@Override
	Vec3WF maxVectorN(float v2x, float v2y, float v2z);
	
	/** {@inheritDoc} */
	@Override
	Vec3WF rotateRadN(Tup3RF axis, float angle);
	
	/** {@inheritDoc} */
	@Override
	Vec3WF rotateRadN(Tup3RF axis, float angle, MathProvider mathProvider);
	
	/** {@inheritDoc} */
	@Override
	Vec3WF rotateRadN(@MinLength(3) float[] axis, float angle);
	
	/** {@inheritDoc} */
	@Override
	Vec3WF rotateRadN(@MinLength(3) float[] axis, float angle, MathProvider mathProvider);
	
	/** {@inheritDoc} */
	@Override
	Vec3WF rotateRadN(float axisX, float axisY, float axisZ, float angle);
	
	/** {@inheritDoc} */
	@Override
	Vec3WF rotateRadN(float axisX, float axisY, float axisZ, float angle, MathProvider mathProvider);
	
	/** {@inheritDoc} */
	@Override
	Vec3WF rotateDegN(Tup3RF axis, float angle);
	
	/** {@inheritDoc} */
	@Override
	Vec3WF rotateDegN(Tup3RF axis, float angle, MathProvider mathProvider);
	
	/** {@inheritDoc} */
	@Override
	Vec3WF rotateDegN(@MinLength(3) float[] axis, float angle);
	
	/** {@inheritDoc} */
	@Override
	Vec3WF rotateDegN(@MinLength(3) float[] axis, float angle, MathProvider mathProvider);
	
	/** {@inheritDoc} */
	@Override
	Vec3WF rotateDegN(float axisX, float axisY, float axisZ, float angle);
	
	/** {@inheritDoc} */
	@Override
	Vec3WF rotateDegN(float axisX, float axisY, float axisZ, float angle, MathProvider mathProvider);
	
	/** {@inheritDoc} */
	@Override
	Vec3WF projectN(Tup3RF t);
	
	/** {@inheritDoc} */
	@Override
	Vec3WF projectN(@MinLength(3) float[] t);
	
	/** {@inheritDoc} */
	@Override
	Vec3WF projectN(float tX, float tY, float tZ);
	
	/** {@inheritDoc} */
	@Override
	Vec3WF reflectN(Tup3RF n);
	
	/** {@inheritDoc} */
	@Override
	Vec3WF reflectN(@MinLength(3) float[] n);
	
	/** {@inheritDoc} */
	@Override
	Vec3WF reflectN(float nX, float nY, float nZ);
	
	/** {@inheritDoc} */
	@Override
	Vec3WF ceilN();
	
	/** {@inheritDoc} */
	@Override
	Vec3WF floorN();
	
	/** {@inheritDoc} */
	@Override
	Vec3WF roundN();
	
	/** {@inheritDoc} */
	@Override
	Vec3WF truncN();
	
	/** {@inheritDoc} */
	@Override
	Vec3WF roundN(FloatRoundMethod method);
	
	/** {@inheritDoc} */
	@Override
	Vec3WF absN();
	
	/** {@inheritDoc} */
	@Override
	Vec3WF crossN(Tup3RF v2);
	
	/** {@inheritDoc} */
	@Override
	Vec3WF crossN(@MinLength(3) float[] v2);
	
	/** {@inheritDoc} */
	@Override
	Vec3WF crossN(float value);
	
	/** {@inheritDoc} */
	@Override
	Vec3WF crossN(float v2x, float v2y, float v2z);
	
	/** {@inheritDoc} */
	@Override
	Vec3WF signumN();
	
	/** {@inheritDoc} */
	@Override
	Vec3WF integrateLinearN(Tup3RF v2, float alpha);
	
	/** {@inheritDoc} */
	@Override
	Vec3WF integrateLinearN(@MinLength(3) float[] v2, float alpha);
	
	/** {@inheritDoc} */
	@Override
	Vec3WF integrateLinearN(float v2x, float v2y, float v2z, float alpha);
	
	/** {@inheritDoc} */
	@Override
	Vec3WF transformQuatN(SimpleQuatfR q);
	
	/** {@inheritDoc} */
	@Override
	Vec3WF transformQuatN(Tup4RF q);
	
	/** {@inheritDoc} */
	@Override
	Vec3WF transformQuatN(@MinLength(4) float[] q);
	
	/** {@inheritDoc} */
	@Override
	Vec3WF transformQuatN(float qW, float qX, float qY, float qZ);
	
	/** {@inheritDoc} */
	@Override
	Vec3WF transformVectorMat4N(SimpleMat4fR m);
	
	/** {@inheritDoc} */
	@Override
	Vec3WF transformVectorMat4N(float[][] m);
	
	/** {@inheritDoc} */
	@Override
	Vec3WF transformPointMat4N(SimpleMat4fR m);
	
	/** {@inheritDoc} */
	@Override
	Vec3WF transformPointMat4N(float[][] m);
}
