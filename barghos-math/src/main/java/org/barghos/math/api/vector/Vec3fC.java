package org.barghos.math.api.vector;

import org.barghos.annotation.IntValueRange;
import org.barghos.annotation.MinLength;
import org.barghos.core.math.BarghosMath;
import org.barghos.core.math.FloatRoundMethod;
import org.barghos.core.math.MathProvider;
import org.barghos.core.tuple.Tup3fR;
import org.barghos.core.tuple.Tup4fR;
import org.barghos.core.tuple.TupfR;
import org.barghos.math.api.matrix.SimpleMat4fR;
import org.barghos.math.api.quaternion.SimpleQuatfR;

/**
 * This interface provides the common functions and methods for float vectors with three dimensions.
 */
public interface Vec3fC extends Vec3fR, SimpleVec3fC
{
	/** {@inheritDoc} */
	@Override
	Vec3fC createNew();
	
	/** {@inheritDoc} */
	@Override
	default Vec3fC createNew(Tup3fR v)
	{
		return createNew(v.v0(), v.v1(), v.v2());
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec3fC createNew(@MinLength(3) float[] v)
	{
		return createNew(v[0], v[1], v[2]);
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec3fC createNew(float value)
	{
		return createNew(value, value, value);
	}
	
	/** {@inheritDoc} */
	@Override
	Vec3fC createNew(float x, float y, float z);
	
	/** {@inheritDoc} */
	@Override
	Vec3fC copy();
	
	/** {@inheritDoc} */
	@Override
	Vec3fC x(float x);
	
	/** {@inheritDoc} */
	@Override
	Vec3fC y(float y);
	
	/** {@inheritDoc} */
	@Override
	Vec3fC z(float z);
	
	/** {@inheritDoc} */
	@Override
	default Vec3fC v0(float v0)
	{
		return x(v0);
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec3fC v1(float v1)
	{
		return y(v1);
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec3fC v2(float v2)
	{
		return z(v2);
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec3fC set(Tup3fR t)
	{
		return set(t.v0(), t.v1(), t.v2());
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec3fC set(float value)
	{
		return set(value, value, value);
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec3fC set(float x, float y, float z)
	{
		SimpleVec3fC.super.set(x, y, z);
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec3fC set(@MinLength(3) TupfR t)
	{
		SimpleVec3fC.super.set(t);
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec3fC setByIndex(@IntValueRange(min = 0, max = 2) int index, float value)
	{
		SimpleVec3fC.super.setByIndex(index, value);
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec3fC setArray(@MinLength(3) float... values)
	{
		SimpleVec3fC.super.setArray(values);
		
		return this;
	}
	
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
	default Vec3fC add(Tup3fR v2)
	{
		return Vec3fUtils.add(this, v2, this);
	}
	
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
	default Vec3fC add(@MinLength(3) float[] v2)
	{
		return Vec3fUtils.add(this, v2, this);
	}
	
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
	default Vec3fC add(float value)
	{
		return Vec3fUtils.add(this, value, value, value, this);
	}
	
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
	default Vec3fC add(float v2x, float v2y, float v2z)
	{
		return Vec3fUtils.add(this, v2x, v2y, v2z, this);
	}
	
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
	default Vec3fC sub(Tup3fR v2)
	{
		return Vec3fUtils.sub(this, v2, this);
	}
	
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
	default Vec3fC sub(@MinLength(3) float[] v2)
	{
		return Vec3fUtils.sub(this, v2, this);
	}
	
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
	default Vec3fC sub(float value)
	{
		return Vec3fUtils.sub(this, value, value, value, this);
	}
	
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
	default Vec3fC sub(float v2x, float v2y, float v2z)
	{
		return Vec3fUtils.sub(this, v2x, v2y, v2z, this);
	}
	
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
	default Vec3fC revSub(Tup3fR v2)
	{
		return Vec3fUtils.revSub(this, v2, this);
	}
	
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
	default Vec3fC revSub(@MinLength(3) float[] v2)
	{
		return Vec3fUtils.revSub(this, v2, this);
	}
	
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
	default Vec3fC revSub(float value)
	{
		return Vec3fUtils.revSub(this, value, value, value, this);
	}
	
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
	default Vec3fC revSub(float v2x, float v2y, float v2z)
	{
		return Vec3fUtils.revSub(this, v2x, v2y, v2z, this);
	}
	
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
	default Vec3fC mul(Tup3fR v2)
	{
		return Vec3fUtils.mul(this, v2, this);
	}
	
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
	default Vec3fC mul(@MinLength(3) float[] v2)
	{
		return Vec3fUtils.mul(this, v2, this);
	}
	
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
	default Vec3fC mul(float value)
	{
		return Vec3fUtils.mul(this, value, value, value, this);
	}
	
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
	default Vec3fC mul(float v2x, float v2y, float v2z)
	{
		return Vec3fUtils.mul(this, v2x, v2y, v2z, this);
	}
	
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
	default Vec3fC div(Tup3fR v2)
	{
		return Vec3fUtils.div(this, v2, this);
	}
	
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
	default Vec3fC div(@MinLength(3) float[] v2)
	{
		return Vec3fUtils.div(this, v2, this);
	}
	
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
	default Vec3fC div(float value)
	{
		return Vec3fUtils.div(this, value, value, value, this);
	}
	
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
	default Vec3fC div(float v2x, float v2y, float v2z)
	{
		return Vec3fUtils.div(this, v2x, v2y, v2z, this);
	}
	
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
	default Vec3fC revDiv(Tup3fR v2)
	{
		return Vec3fUtils.revDiv(this, v2, this);
	}
	
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
	default Vec3fC revDiv(@MinLength(3) float[] v2)
	{
		return Vec3fUtils.revDiv(this, v2, this);
	}
	
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
	default Vec3fC revDiv(float value)
	{
		return Vec3fUtils.revDiv(this, value, value, value, this);
	}
	
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
	default Vec3fC revDiv(float v2x, float v2y, float v2z)
	{
		return Vec3fUtils.revDiv(this, v2x, v2y, v2z, this);
	}
	
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
	default Vec3fC halfVectorTo(Tup3fR v2)
	{
		return Vec3fUtils.halfVectorTo(this, v2, this);
	}
	
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
	default Vec3fC halfVectorTo(@MinLength(3) float[] v2)
	{
		return Vec3fUtils.halfVectorTo(this, v2, this);
	}
	
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
	default Vec3fC halfVectorTo(float v2x, float v2y, float v2z)
	{
		return Vec3fUtils.halfVectorTo(this, v2x, v2y, v2z, this);
	}
	
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
	default Vec3fC halfPointBetween(Tup3fR v2)
	{
		return Vec3fUtils.halfPointBetween(this, v2, this);
	}
	
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
	default Vec3fC halfPointBetween(@MinLength(3) float[] v2)
	{
		return Vec3fUtils.halfPointBetween(this, v2, this);
	}
	
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
	default Vec3fC halfPointBetween(float v2x, float v2y, float v2z)
	{
		return Vec3fUtils.halfPointBetween(this, v2x, v2y, v2z, this);
	}
	
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
	default Vec3fC negate()
	{
		return Vec3fUtils.negate(this, this);
	}
	
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
	default Vec3fC inverse()
	{
		return Vec3fUtils.inverse(this, this);
	}
	
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
	default Vec3fC normalize()
	{
		return Vec3fUtils.normalize(this, this);
	}
	
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
	default Vec3fC minVector(Tup3fR v2)
	{
		return Vec3fUtils.minVector(this, v2, this);
	}
	
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
	default Vec3fC minVector(@MinLength(3) float[] v2)
	{
		return Vec3fUtils.minVector(this, v2, this);
	}
	
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
	default Vec3fC minVector(float v2x, float v2y, float v2z)
	{
		return Vec3fUtils.minVector(this, v2x, v2y, v2z, this);
	}
	
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
	default Vec3fC maxVector(Tup3fR v2)
	{
		return Vec3fUtils.maxVector(this, v2, this);
	}
	
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
	default Vec3fC maxVector(@MinLength(3) float[] v2)
	{
		return Vec3fUtils.maxVector(this, v2, this);
	}
	
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
	default Vec3fC maxVector(float v2x, float v2y, float v2z)
	{
		return Vec3fUtils.maxVector(this, v2x, v2y, v2z, this);
	}
	
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
	default Vec3fC rotateRad(Tup3fR axis, float angle)
	{
		return Vec3fUtils.rotateRad(this, axis, angle, this);
	}
	
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
	default Vec3fC rotateRad(Tup3fR axis, float angle, MathProvider mathProvider)
	{
		return Vec3fUtils.rotateRad(this, axis, angle, mathProvider, this);
	}
	
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
	default Vec3fC rotateRad(@MinLength(3) float[] axis, float angle)
	{
		return Vec3fUtils.rotateRad(this, axis, angle, this);
	}
	
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
	default Vec3fC rotateRad(@MinLength(3) float[] axis, float angle, MathProvider mathProvider)
	{
		return Vec3fUtils.rotateRad(this, axis, angle, mathProvider, this);
	}
	
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
	default Vec3fC rotateRad(float axisX, float axisY, float axisZ, float angle)
	{
		return Vec3fUtils.rotateRad(this, axisX, axisY, axisZ, angle, this);
	}
	
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
	default Vec3fC rotateRad(float axisX, float axisY, float axisZ, float angle, MathProvider mathProvider)
	{
		return Vec3fUtils.rotateRad(this, axisX, axisY, axisZ, angle, mathProvider, this);
	}
	
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
	default Vec3fC rotateDeg(Tup3fR axis, float angle)
	{
		return Vec3fUtils.rotateDeg(this, axis, angle, this);
	}
	
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
	default Vec3fC rotateDeg(Tup3fR axis, float angle, MathProvider mathProvider)
	{
		return Vec3fUtils.rotateDeg(this, axis, angle, mathProvider, this);
	}
	
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
	default Vec3fC rotateDeg(@MinLength(3) float[] axis, float angle)
	{
		return Vec3fUtils.rotateDeg(this, axis, angle, this);
	}
	
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
	default Vec3fC rotateDeg(@MinLength(3) float[] axis, float angle, MathProvider mathProvider)
	{
		return Vec3fUtils.rotateDeg(this, axis, angle, mathProvider, this);
	}
	
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
	default Vec3fC rotateDeg(float axisX, float axisY, float axisZ, float angle)
	{
		return Vec3fUtils.rotateDeg(this, axisX, axisY, axisZ, angle, this);
	}
	
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
	default Vec3fC rotateDeg(float axisX, float axisY, float axisZ, float angle, MathProvider mathProvider)
	{
		return Vec3fUtils.rotateDeg(this, axisX, axisY, axisZ, angle, mathProvider, this);
	}
	
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
	default Vec3fC project(Tup3fR t)
	{
		return Vec3fUtils.project(this, t, this);
	}
	
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
	default Vec3fC project(@MinLength(3) float[] t)
	{
		return Vec3fUtils.project(this, t, this);
	}
	
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
	default Vec3fC project(float tX, float tY, float tZ)
	{
		return Vec3fUtils.project(this, tX, tY, tZ, this);
	}
	
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
	default Vec3fC reflect(Tup3fR n)
	{
		return Vec3fUtils.reflect(this, n, this);
	}
	
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
	default Vec3fC reflect(@MinLength(3) float[] n)
	{
		return Vec3fUtils.reflect(this, n, this);
	}
	
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
	default Vec3fC reflect(float nX, float nY, float nZ)
	{
		return Vec3fUtils.reflect(this, nX, nY, nZ, this);
	}
	
	/**
	 * Rounds the components of this vector towards the next greater integer.
	 * 
	 * <p>
	 * This operation <u><b>does</b></u> alter the vector.
	 * 
	 * @return The current vector.
	 */
	default Vec3fC ceil()
	{
		return Vec3fUtils.ceil(this, this);
	}
	
	/**
	 * Rounds the components of this vector towards the next smaller integer.
	 * 
	 * <p>
	 * This operation <u><b>does</b></u> alter the vector.
	 * 
	 * @return The current vector.
	 */
	default Vec3fC floor()
	{
		return Vec3fUtils.floor(this, this);
	}
	
	/**
	 * Rounds the components of this vector.
	 * 
	 * <p>
	 * This operation <u><b>does</b></u> alter the vector.
	 * 
	 * @return The current vector.
	 */
	default Vec3fC round()
	{
		return Vec3fUtils.round(this, this);
	}
	
	/**
	 * Truncates the decimals of the components of this vector.
	 * 
	 * <p>
	 * This operation <u><b>does</b></u> alter the vector.
	 * 
	 * @return The current vector.
	 */
	default Vec3fC trunc()
	{
		return Vec3fUtils.trunc(this, this);
	}
	
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
	default Vec3fC round(FloatRoundMethod method)
	{
		return Vec3fUtils.round(this, method, this);
	}
	
	/**
	 * Calculates the absolute value of the component values.
	 * 
	 * <p>
	 * This operation <u><b>does</b></u> alter the vector.
	 * 
	 * @return The current vector.
	 */
	default Vec3fC abs()
	{
		return Vec3fUtils.abs(this, this);
	}
	
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
	default Vec3fC cross(Tup3fR v2)
	{
		return Vec3fUtils.cross(this, v2.v0(), v2.v1(), v2.v2(), this);
	}
	
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
	default Vec3fC cross(@MinLength(3) float[] v2)
	{
		return Vec3fUtils.cross(this, v2[0], v2[1], v2[2], this);
	}
	
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
	default Vec3fC cross(float value)
	{
		return Vec3fUtils.cross(this, value, value, value, this);
	}
	
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
	default Vec3fC cross(float v2x, float v2y, float v2z)
	{
		return Vec3fUtils.cross(this, v2x, v2y, v2z, this);
	}
	
	/**
	 * Calculates the {@link Math#signum(float) signum} of the components of this vector.
	 * 
	 * <p>
	 * This operation <u><b>does</b></u> alter the vector.
	 * 
	 * @return The current vector.
	 */
	default Vec3fC signum()
	{
		return Vec3fUtils.signum(this, this);
	}
	
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
	default Vec3fC integrateLinear(Tup3fR v2, float alpha)
	{
		return Vec3fErpUtils.integrateLinear(this, v2, alpha, this);
	}
	
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
	default Vec3fC integrateLinear(@MinLength(3) float[] v2, float alpha)
	{
		return Vec3fErpUtils.integrateLinear(this, v2, alpha, this);
	}
	
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
	default Vec3fC integrateLinear(float v2x, float v2y, float v2z, float alpha)
	{
		return Vec3fErpUtils.integrateLinear(this, v2x, v2y, v2z, alpha, this);
	}
	
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
	default Vec3fC transformQuat(SimpleQuatfR q)
	{
		return q.transform(this);
	}
	
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
	default Vec3fC transformQuat(Tup4fR q)
	{
		return Vec3fUtils.transformQuat(this, q, this);
	}
	
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
	default Vec3fC transformQuat(@MinLength(4) float[] q)
	{
		return Vec3fUtils.transformQuat(this, q[0], q[1], q[2], q[3], this);
	}
	
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
	default Vec3fC transformQuat(float qW, float qX, float qY, float qZ)
	{
		return Vec3fUtils.transformQuat(this, qW, qX, qY, qZ, this);
	}
	
	default Vec3fC transformVectorMat4(SimpleMat4fR m)
	{
		return m.transform3d(this, false);
	}
	
	default Vec3fC transformVectorMat4(float[][] m)
	{
		return Vec3fUtils.transformMat4(this, false, m, this);
	}
	
	default Vec3fC transformPointMat4(SimpleMat4fR m)
	{
		return m.transform3d(this, true);
	}
	
	default Vec3fC transformPointMat4(float[][] m)
	{
		return Vec3fUtils.transformMat4(this, true, m, this);
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec3fC addN(Tup3fR v2)
	{
		return Vec3fUtils.addFunc(this, v2, (x, y, z) -> createNew(x, y, z));
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec3fC addN(@MinLength(3) float[] v2)
	{
		return Vec3fUtils.addFunc(this, v2, (x, y, z) -> createNew(x, y, z));
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec3fC addN(float value)
	{
		return Vec3fUtils.addFunc(this, value, value, value, (x, y, z) -> createNew(x, y, z));
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec3fC addN(float v2x, float v2y, float v2z)
	{
		return Vec3fUtils.addFunc(this, v2x, v2y, v2z, (x, y, z) -> createNew(x, y, z));
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec3fC subN(Tup3fR v2)
	{
		return Vec3fUtils.subFunc(this, v2, (x, y, z) -> createNew(x, y, z));
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec3fC subN(@MinLength(3) float[] v2)
	{
		return Vec3fUtils.subFunc(this, v2, (x, y, z) -> createNew(x, y, z));
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec3fC subN(float value)
	{
		return Vec3fUtils.subFunc(this, value, value, value, (x, y, z) -> createNew(x, y, z));
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec3fC subN(float v2x, float v2y, float v2z)
	{
		return Vec3fUtils.subFunc(this, v2x, v2y, v2z, (x, y, z) -> createNew(x, y, z));
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec3fC revSubN(Tup3fR v2)
	{
		return Vec3fUtils.revSubFunc(this, v2, (x, y, z) -> createNew(x, y, z));
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec3fC revSubN(@MinLength(3) float[] v2)
	{
		return Vec3fUtils.revSubFunc(this, v2, (x, y, z) -> createNew(x, y, z));
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec3fC revSubN(float value)
	{
		return Vec3fUtils.revSubFunc(this, value, value, value, (x, y, z) -> createNew(x, y, z));
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec3fC revSubN(float v2x, float v2y, float v2z)
	{
		return Vec3fUtils.revSubFunc(this, v2x, v2y, v2z, (x, y, z) -> createNew(x, y, z));
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec3fC mulN(Tup3fR v2)
	{
		return Vec3fUtils.mulFunc(this, v2, (x, y, z) -> createNew(x, y, z));
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec3fC mulN(@MinLength(3) float[] v2)
	{
		return Vec3fUtils.mulFunc(this, v2, (x, y, z) -> createNew(x, y, z));
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec3fC mulN(float value)
	{
		return Vec3fUtils.mulFunc(this, value, value, value, (x, y, z) -> createNew(x, y, z));
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec3fC mulN(float v2x, float v2y, float v2z)
	{
		return Vec3fUtils.mulFunc(this, v2x, v2y, v2z, (x, y, z) -> createNew(x, y, z));
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec3fC divN(Tup3fR v2)
	{
		return Vec3fUtils.divFunc(this, v2, (x, y, z) -> createNew(x, y, z));
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec3fC divN(@MinLength(2) float[] v2)
	{
		return Vec3fUtils.divFunc(this, v2, (x, y, z) -> createNew(x, y, z));
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec3fC divN(float value)
	{
		return Vec3fUtils.divFunc(this, value, value, value, (x, y, z) -> createNew(x, y, z));
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec3fC divN(float v2x, float v2y, float v2z)
	{
		return Vec3fUtils.divFunc(this, v2x, v2y, v2z, (x, y, z) -> createNew(x, y, z));
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec3fC revDivN(Tup3fR v2)
	{
		return Vec3fUtils.revDivFunc(this, v2, (x, y, z) -> createNew(x, y, z));
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec3fC revDivN(@MinLength(3) float[] v2)
	{
		return Vec3fUtils.revDivFunc(this, v2, (x, y, z) -> createNew(x, y, z));
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec3fC revDivN(float value)
	{
		return Vec3fUtils.revDivFunc(this, value, value, value, (x, y, z) -> createNew(x, y, z));
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec3fC revDivN(float v2x, float v2y, float v2z)
	{
		return Vec3fUtils.revDivFunc(this, v2x, v2y, v2z, (x, y, z) -> createNew(x, y, z));
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec3fC halfVectorToN(Tup3fR v2)
	{
		return Vec3fUtils.halfVectorToFunc(this, v2, (x, y, z) -> createNew(x, y, z));
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec3fC halfVectorToN(@MinLength(3) float[] v2)
	{
		return Vec3fUtils.halfVectorToFunc(this, v2, (x, y, z) -> createNew(x, y, z));
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec3fC halfVectorToN(float v2x, float v2y, float v2z)
	{
		return Vec3fUtils.halfVectorToFunc(this, v2x, v2y, v2z, (x, y, z) -> createNew(x, y, z));
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec3fC halfPointBetweenN(Tup3fR v2)
	{
		return Vec3fUtils.halfPointBetweenFunc(this, v2, (x, y, z) -> createNew(x, y, z));
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec3fC halfPointBetweenN(@MinLength(3) float[] v2)
	{
		return Vec3fUtils.halfPointBetweenFunc(this, v2, (x, y, z) -> createNew(x, y, z));
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec3fC halfPointBetweenN(float v2x, float v2y, float v2z)
	{
		return Vec3fUtils.halfPointBetweenFunc(this, v2x, v2y, v2z, (x, y, z) -> createNew(x, y, z));
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec3fC negateN()
	{
		return Vec3fUtils.negateFunc(this, (x, y, z) -> createNew(x, y, z));
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec3fC inverseN()
	{
		return Vec3fUtils.inverseFunc(this, (x, y, z) -> createNew(x, y, z));
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec3fC normalizeN()
	{
		return Vec3fUtils.normalizeFunc(this, (x, y, z) -> createNew(x, y, z));
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec3fC minVectorN(Tup3fR v2)
	{
		return Vec3fUtils.minVectorFunc(this, v2, (x, y, z) -> createNew(x, y, z));
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec3fC minVectorN(@MinLength(3) float[] v2)
	{
		return Vec3fUtils.minVectorFunc(this, v2, (x, y, z) -> createNew(x, y, z));
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec3fC minVectorN(float v2x, float v2y, float v2z)
	{
		return Vec3fUtils.minVectorFunc(this, v2x, v2y, v2z, (x, y, z) -> createNew(x, y, z));
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec3fC maxVectorN(Tup3fR v2)
	{
		return Vec3fUtils.maxVectorFunc(this, v2, (x, y, z) -> createNew(x, y, z));
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec3fC maxVectorN(@MinLength(3) float[] v2)
	{
		return Vec3fUtils.maxVectorFunc(this, v2, (x, y, z) -> createNew(x, y, z));
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec3fC maxVectorN(float v2x, float v2y, float v2z)
	{
		return Vec3fUtils.maxVectorFunc(this, v2x, v2y, v2z, (x, y, z) -> createNew(x, y, z));
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec3fC rotateRadN(Tup3fR axis, float angle)
	{
		return Vec3fUtils.rotateRadFunc(this, axis, angle, (x, y, z) -> createNew(x, y, z));
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec3fC rotateRadN(Tup3fR axis, float angle, MathProvider mathProvider)
	{
		return Vec3fUtils.rotateRadFunc(this, axis, angle, mathProvider, (x, y, z) -> createNew(x, y, z));
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec3fC rotateRadN(@MinLength(3) float[] axis, float angle)
	{
		return Vec3fUtils.rotateRadFunc(this, axis, angle, (x, y, z) -> createNew(x, y, z));
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec3fC rotateRadN(@MinLength(3) float[] axis, float angle, MathProvider mathProvider)
	{
		return Vec3fUtils.rotateRadFunc(this, axis, angle, mathProvider, (x, y, z) -> createNew(x, y, z));
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec3fC rotateRadN(float axisX, float axisY, float axisZ, float angle)
	{
		return Vec3fUtils.rotateRadFunc(this, axisX, axisY, axisZ, angle, (x, y, z) -> createNew(x, y, z));
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec3fC rotateRadN(float axisX, float axisY, float axisZ, float angle, MathProvider mathProvider)
	{
		return Vec3fUtils.rotateRadFunc(this, axisX, axisY, axisZ, angle, mathProvider,
				(x, y, z) -> createNew(x, y, z));
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec3fC rotateDegN(Tup3fR axis, float angle)
	{
		return Vec3fUtils.rotateDegFunc(this, axis, angle, (x, y, z) -> createNew(x, y, z));
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec3fC rotateDegN(Tup3fR axis, float angle, MathProvider mathProvider)
	{
		return Vec3fUtils.rotateDegFunc(this, axis, angle, mathProvider, (x, y, z) -> createNew(x, y, z));
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec3fC rotateDegN(@MinLength(3) float[] axis, float angle)
	{
		return Vec3fUtils.rotateDegFunc(this, axis, angle, (x, y, z) -> createNew(x, y, z));
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec3fC rotateDegN(@MinLength(3) float[] axis, float angle, MathProvider mathProvider)
	{
		return Vec3fUtils.rotateDegFunc(this, axis, angle, mathProvider, (x, y, z) -> createNew(x, y, z));
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec3fC rotateDegN(float axisX, float axisY, float axisZ, float angle)
	{
		return Vec3fUtils.rotateDegFunc(this, axisX, axisY, axisZ, angle, (x, y, z) -> createNew(x, y, z));
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec3fC rotateDegN(float axisX, float axisY, float axisZ, float angle, MathProvider mathProvider)
	{
		return Vec3fUtils.rotateDegFunc(this, axisX, axisY, axisZ, angle, mathProvider,
				(x, y, z) -> createNew(x, y, z));
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec3fC projectN(Tup3fR t)
	{
		return Vec3fUtils.projectFunc(this, t, (x, y, z) -> createNew(x, y, z));
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec3fC projectN(@MinLength(3) float[] t)
	{
		return Vec3fUtils.projectFunc(this, t, (x, y, z) -> createNew(x, y, z));
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec3fC projectN(float tX, float tY, float tZ)
	{
		return Vec3fUtils.projectFunc(this, tX, tY, tZ, (x, y, z) -> createNew(x, y, z));
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec3fC reflectN(Tup3fR n)
	{
		return Vec3fUtils.reflectFunc(this, n, (x, y, z) -> createNew(x, y, z));
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec3fC reflectN(@MinLength(3) float[] n)
	{
		return Vec3fUtils.reflectFunc(this, n, (x, y, z) -> createNew(x, y, z));
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec3fC reflectN(float nX, float nY, float nZ)
	{
		return Vec3fUtils.reflectFunc(this, nX, nY, nZ, (x, y, z) -> createNew(x, y, z));
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec3fC ceilN()
	{
		return Vec3fUtils.ceilFunc(this, (x, y, z) -> createNew(x, y, z));
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec3fC floorN()
	{
		return Vec3fUtils.floorFunc(this, (x, y, z) -> createNew(x, y, z));
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec3fC roundN()
	{
		return Vec3fUtils.roundFunc(this, (x, y, z) -> createNew(x, y, z));
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec3fC truncN()
	{
		return Vec3fUtils.truncFunc(this, (x, y, z) -> createNew(x, y, z));
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec3fC roundN(FloatRoundMethod method)
	{
		return Vec3fUtils.roundFunc(this, method, (x, y, z) -> createNew(x, y, z));
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec3fC absN()
	{
		return Vec3fUtils.absFunc(this, (x, y, z) -> createNew(x, y, z));
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec3fC crossN(Tup3fR v2)
	{
		return Vec3fUtils.crossFunc(this, v2.v0(), v2.v1(), v2.v2(), (x, y, z) -> createNew(x, y, z));
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec3fC crossN(@MinLength(3) float[] v2)
	{
		return Vec3fUtils.crossFunc(this, v2[0], v2[1], v2[2], (x, y, z) -> createNew(x, y, z));
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec3fC crossN(float value)
	{
		return Vec3fUtils.crossFunc(this, value, value, value, (x, y, z) -> createNew(x, y, z));
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec3fC crossN(float v2x, float v2y, float v2z)
	{
		return Vec3fUtils.crossFunc(this, v2x, v2y, v2z, (x, y, z) -> createNew(x, y, z));
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec3fC signumN()
	{
		return Vec3fUtils.signumFunc(this, (x, y, z) -> createNew(x, y, z));
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec3fC integrateLinearN(Tup3fR v2, float alpha)
	{
		return Vec3fErpUtils.integrateLinearFunc(this, v2, alpha, (x, y, z) -> createNew(x, y, z));
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec3fC integrateLinearN(@MinLength(3) float[] v2, float alpha)
	{
		return Vec3fErpUtils.integrateLinearFunc(this, v2, alpha, (x, y, z) -> createNew(x, y, z));
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec3fC integrateLinearN(float v2x, float v2y, float v2z, float alpha)
	{
		return Vec3fErpUtils.integrateLinearFunc(this, v2x, v2y, v2z, alpha, (x, y, z) -> createNew(x, y, z));
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec3fC transformQuatN(SimpleQuatfR q)
	{
		return q.transformFunc(this, (x, y, z) -> createNew(x, y, z));
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec3fC transformQuatN(Tup4fR q)
	{
		return Vec3fUtils.transformQuatFunc(this, q, (x, y, z) -> createNew(x, y, z));
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec3fC transformQuatN(@MinLength(4) float[] q)
	{
		return Vec3fUtils.transformQuatFunc(this, q[0], q[1], q[2], q[3], (x, y, z) -> createNew(x, y, z));
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec3fC transformQuatN(float qW, float qX, float qY, float qZ)
	{
		return Vec3fUtils.transformQuatFunc(this, qW, qX, qY, qZ, (x, y, z) -> createNew(x, y, z));
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec3fC transformVectorMat4N(SimpleMat4fR m)
	{
		return m.transform3dFunc(this, false, (x, y, z) -> createNew(x, y, z));
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec3fC transformVectorMat4N(float[][] m)
	{
		return Vec3fUtils.transformMat4Func(this, false, m, (x, y, z) -> createNew(x, y, z));
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec3fC transformPointMat4N(SimpleMat4fR m)
	{
		return m.transform3dFunc(this, true, (x, y, z) -> createNew(x, y, z));
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec3fC transformPointMat4N(float[][] m)
	{
		return Vec3fUtils.transformMat4Func(this, true, m, (x, y, z) -> createNew(x, y, z));
	}
}
