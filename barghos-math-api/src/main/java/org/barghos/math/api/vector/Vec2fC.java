package org.barghos.math.api.vector;

import org.barghos.core.api.math.BarghosMath;
import org.barghos.core.api.math.FloatRoundMethod;
import org.barghos.core.api.math.MathProvider;
import org.barghos.annotation.IntValueRange;
import org.barghos.annotation.MinLength;
import org.barghos.tuple.api.t2.Tup2fR;
import org.barghos.tuple.api.tn.TupfR;

/**
 * This interface provides the common functions and methods for float vectors with two dimensions.
 */
public interface Vec2fC extends Vec2fR, SimpleVec2fC
{
	/**
	 * Creates a new instance of the type of this vector.
	 * 
	 * @return A new instance.
	 */
	Vec2fC createNew();
	
	/**
	 * Creates a new instance of the type of this vector and adopts the component values from the givewn vector {@code (v)}.
	 * 
	 * @param v The vector to adopt the component values from.
	 * 
	 * @return A new instance.
	 */
	default Vec2fC createNew(Tup2fR v)
	{
		return createNew(v.getV0(), v.getV1());
	}
	
	/**
	 * Creates a new instance of the type of this vector and adopts the component values from the given vector {@code (v[0], v[1])}.
	 * 
	 * @param v The vector as an array to adopt the component values from.
	 * 
	 * @return A new instance.
	 */
	default Vec2fC createNew(@MinLength(2) float[] v)
	{
		return createNew(v[0], v[1]);
	}
	
	/**
	 * Creates a new instance of the type of this vector and sets the component values to the given value {@code (value)}.
	 * 
	 * @param value The value that will be used for all component values.
	 * 
	 * @return A new instance.
	 */
	default Vec2fC createNew(float value)
	{
		return createNew(value, value);
	}
	
	/**
	 * Creates a new instance of the type of this vector and adopts the component values from the given vector {@code (x, y)}.
	 * 
	 * @param x The value of the x component.
	 * @param y The value of the y component.
	 * 
	 * @return A new instance.
	 */
	Vec2fC createNew(float x, float y);
	
	/** {@inheritDoc} */
	@Override
	Vec2fC copy();
	
	/** {@inheritDoc} */
	@Override
	Vec2fC setX(float x);

	/** {@inheritDoc} */
	@Override
	Vec2fC setY(float y);
	
	/** {@inheritDoc} */
	@Override
	default Vec2fC setV0(float v0)
	{
		return setX(v0);
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2fC setV1(float v1)
	{
		return setY(v1);
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2fC set(Tup2fR t)
	{
		return set(t.getV0(), t.getV1());
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2fC set(float value)
	{
		return set(value, value);
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2fC set(float x, float y)
	{
		SimpleVec2fC.super.set(x, y);
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2fC set(@MinLength(2) TupfR t)
	{	
		SimpleVec2fC.super.set(t);
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2fC setByIndex(@IntValueRange(min=0, max=1) int index, float value)
	{
		SimpleVec2fC.super.setByIndex(index, value);
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2fC setArray(@MinLength(2) float... values)
	{
		SimpleVec2fC.super.setArray(values);
		
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
	 * @param v2 The vector to add to this vector.
	 * 
	 * @return The current vector.
	 */
	default Vec2fC add(Tup2fR v2)
	{
		return Vec2fUtils.add(this, v2, this);
	}
	
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
	 * @param v2 The vector to add to this vector as an array with at least two entries.
	 * 
	 * @return The current vector.
	 */
	default Vec2fC add(@MinLength(2) float[] v2)
	{
		return Vec2fUtils.add(this, v2, this);
	}
	
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
	 * @param value The value to add to this vector.
	 * 
	 * @return The current vector.
	 */
	default Vec2fC add(float value)
	{
		return Vec2fUtils.add(this, value, value, this);
	}
	
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
	 * @param v2x The value of the x component to add to this vector.
	 * @param v2y The value of the y component to add to this vector.
	 * 
	 * @return The current vector.
	 */
	default Vec2fC add(float v2x, float v2y)
	{
		return Vec2fUtils.add(this, v2x, v2y, this);
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
	 * @param v2 The vector to subtract from this vector.
	 * 
	 * @return The current vector.
	 */
	default Vec2fC sub(Tup2fR v2)
	{
		return Vec2fUtils.sub(this, v2, this);
	}
	
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
	 * @param v2 The vector to subtract from this vector as an array with at least two entries.
	 * 
	 * @return The current vector.
	 */
	default Vec2fC sub(@MinLength(2) float[] v2)
	{
		return Vec2fUtils.sub(this, v2, this);
	}
	
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
	 * @param value The value to subtract from this vector.
	 * 
	 * @return The current vector.
	 */
	default Vec2fC sub(float value)
	{
		return Vec2fUtils.sub(this, value, value, this);
	}
	
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
	 * @param v2x The value of the x component to subtract from this vector.
	 * @param v2y The value of the y component to subtract from this vector.
	 * 
	 * @return The current vector.
	 */
	default Vec2fC sub(float v2x, float v2y)
	{
		return Vec2fUtils.sub(this, v2x, v2y, this);
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
	 * @param v2 The vector this vector is subtracted from.
	 * 
	 * @return The current vector.
	 */
	default Vec2fC revSub(Tup2fR v2)
	{
		return Vec2fUtils.revSub(this, v2, this);
	}
	
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
	 * @param v2 The vector this vector is subtracted from as an array with at least two entries.
	 * 
	 * @return The current vector.
	 */
	default Vec2fC revSub(@MinLength(2) float[] v2)
	{
		return Vec2fUtils.revSub(this, v2, this);
	}
	
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
	 * @param value The value this vector is subtracted from.
	 * 
	 * @return The current vector.
	 */
	default Vec2fC revSub(float value)
	{
		return Vec2fUtils.revSub(this, value, value, this);
	}
		
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
	 * @param v2x The value of the x component this vector is subtracted from.
	 * @param v2y The value of the y component this vector is subtracted from.
	 * 
	 * @return The current vector.
	 */
	default Vec2fC revSub(float v2x, float v2y)
	{
		return Vec2fUtils.revSub(this, v2x, v2y, this);
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
	 * @param v2 The vector to multiply this vector with.
	 * 
	 * @return The current vector.
	 */
	default Vec2fC mul(Tup2fR v2)
	{
		return Vec2fUtils.mul(this, v2, this);
	}
	
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
	 * @param v2 The vector to multiply this vector with as an array with at least two entries.
	 * 
	 * @return The current vector.
	 */
	default Vec2fC mul(@MinLength(2) float[] v2)
	{
		return Vec2fUtils.mul(this, v2, this);
	}
	
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
	 * @param value The value to multiply this vector with.
	 * 
	 * @return The current vector.
	 */
	default Vec2fC mul(float value)
	{
		return Vec2fUtils.mul(this, value, value, this);
	}
	
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
	 * @param v2x The value of the x component to multiply this vector with.
	 * @param v2y The value of the y component to multiply this vector with.
	 * 
	 * @return The current vector.
	 */
	default Vec2fC mul(float v2x, float v2y)
	{
		return Vec2fUtils.mul(this, v2x, v2y, this);
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
	 * @param v2 The vector to divide this vector by.
	 * 
	 * @return The current vector.
	 */
	default Vec2fC div(Tup2fR v2)
	{
		return Vec2fUtils.div(this, v2, this);
	}
	
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
	 * @param v2 The vector to divide this vector by as an array with at least two entries.
	 * 
	 * @return The current vector.
	 */
	default Vec2fC div(@MinLength(2) float[] v2)
	{
		return Vec2fUtils.div(this, v2, this);
	}
	
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
	 * @param value The value to divide this vector by.
	 * 
	 * @return The current vector.
	 */
	default Vec2fC div(float value)
	{
		return Vec2fUtils.div(this, value, value, this);
	}
	
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
	 * @param v2x The value of the x component to divide this vector by.
	 * @param v2y The value of the y component to divide this vector by.
	 * 
	 * @return The current vector.
	 */
	default Vec2fC div(float v2x, float v2y)
	{
		return Vec2fUtils.div(this, v2x, v2y, this);
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
	 * @param v2 The vector to divide by this vector.
	 * 
	 * @return The current vector.
	 */
	default Vec2fC revDiv(Tup2fR v2)
	{
		return Vec2fUtils.revDiv(this, v2, this);
	}

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
	 * @param v2 The vector to divide by this vector as an array with at least two entries.
	 * 
	 * @return The current vector.
	 */
	default Vec2fC revDiv(@MinLength(2) float[] v2)
	{
		return Vec2fUtils.revDiv(this, v2, this);
	}
	
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
	 * @param value The value to divide by this vector.
	 * 
	 * @return The current vector.
	 */
	default Vec2fC revDiv(float value)
	{
		return Vec2fUtils.revDiv(this, value, value, this);
	}

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
	 * @param v2x The value of the x component to divide by this vector.
	 * @param v2y The value of the y component to divide by this vector.
	 * 
	 * @return The current vector.
	 */
	default Vec2fC revDiv(float v2x, float v2y)
	{
		return Vec2fUtils.revDiv(this, v2x, v2y, this);
	}
	
	/**
	 * Calculates half the vector from the endpoint of this vector to the endpoint of the given vector {@code (v2)}.
	 * 
	 * <p>
	 * This operation <u><b>does</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ( v2 - v ) / 2}
	 * 
	 * @param v2 The second vector.
	 * 
	 * @return The current vector.
	 */
	default Vec2fC halfVectorTo(Tup2fR v2)
	{
		return Vec2fUtils.halfVectorTo(this, v2, this);
	}
	
	/**
	 * Calculates half the vector from the endpoint of this vector to the endpoint of the given vector {@code (v2[0], v2[1])}.
	 * 
	 * <p>
	 * This operation <u><b>does</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ( (v2[0], v2[1]) - v ) / 2}
	 * 
	 * @param v2 The second vector as an array with at least two entries.
	 * 
	 * @return The current vector.
	 */
	default Vec2fC halfVectorTo(@MinLength(2) float[] v2)
	{
		return Vec2fUtils.halfVectorTo(this, v2, this);
	}
	
	/**
	 * Calculates half the vector from the endpoint of this vector to the endpoint of the given vector {@code (v2x, v2y)}.
	 * 
	 * <p>
	 * This operation <u><b>does</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ( (v2x, v2y) - v ) / 2}
	 * 
	 * @param v2x The value of the x component of the second vector.
	 * @param v2y The value of the y component of the second vector.
	 * 
	 * @return The current vector.
	 */
	default Vec2fC halfVectorTo(float v2x, float v2y)
	{
		return Vec2fUtils.halfVectorTo(this, v2x, v2y, this);
	}
	
	/**
	 * Calculates the origin vector to the point that lies half way between the endpoint of this vector and the endpoint of the given vector {@code (v2)}.
	 * 
	 * <p>
	 * This operation <u><b>does</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ( v2 + v ) / 2}
	 * 
	 * @param v2 The second vector.
	 * 
	 * @return The current vector.
	 */
	default Vec2fC halfPointBetween(Tup2fR v2)
	{
		return Vec2fUtils.halfPointBetween(this, v2, this);
	}
	
	/**
	 * Calculates the origin vector to the point that lies half way between the endpoint of this vector and the endpoint of the given vector {@code (v2[0], v2[1])}.
	 * 
	 * <p>
	 * This operation <u><b>does</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ( (v2[0], v2[1]) + v ) / 2}
	 * 
	 * @param v2 The second vector as an array with at least two entries.
	 * 
	 * @return The current vector.
	 */
	default Vec2fC halfPointBetween(@MinLength(2) float[] v2)
	{
		return Vec2fUtils.halfPointBetween(this, v2, this);
	}
	
	/**
	 * Calculates the origin vector to the point that lies half way between the endpoint of this vector and the endpoint of the given vector {@code (v2x, v2y)}.
	 * 
	 * <p>
	 * This operation <u><b>does</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ( (v2x, v2y) + v ) / 2}
	 * 
	 * @param v2x The value of the x component of the second vector.
	 * @param v2y The value of the y component of the second vector.
	 * 
	 * @return The current vector.
	 */
	default Vec2fC halfPointBetween(float v2x, float v2y)
	{
		return Vec2fUtils.halfPointBetween(this, v2x, v2y, this);
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
	default Vec2fC negate()
	{
		return Vec2fUtils.negate(this, this);
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
	default Vec2fC inverse()
	{
		return Vec2fUtils.inverse(this, this);
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
	default Vec2fC normalize()
	{
		return Vec2fUtils.normalize(this, this);
	}
	
	/**
	 * Compares each component of this vector with the corresponding component of the given vector {@code (v2)} and
	 * returns the smallest values.
	 * 
	 * <p>
	 * This operation <u><b>does</b></u> alter the vector.
	 * 
	 * @param v2 The second vector.
	 * 
	 * @return The current vector.
	 */
	default Vec2fC minVector(Tup2fR v2)
	{
		return Vec2fUtils.minVector(this, v2, this);
	}
	
	/**
	 * Compares each component of this vector with the corresponding component of the given vector {@code (v2[0], v2[1])} and
	 * returns the smallest.
	 * 
	 * <p>
	 * This operation <u><b>does</b></u> alter the vector.
	 * 
	 * @param v2 The second vector as an array with at least two entries.
	 * 
	 * @return The current vector.
	 */
	default Vec2fC minVector(@MinLength(2) float[] v2)
	{
		return Vec2fUtils.minVector(this, v2, this);
	}
	
	/**
	 * Compares each component of this vector with the corresponding component of the given vector {@code (v2x, v2y)} and
	 * returns the smallest values.
	 * 
	 * <p>
	 * This operation <u><b>does</b></u> alter the vector.
	 * 
	 * @param v2x The value of the x component of the second vector.
	 * @param v2y The value of the y component of the second vector.
	 * 
	 * @return The current vector.
	 */
	default Vec2fC minVector(float v2x, float v2y)
	{
		return Vec2fUtils.minVector(this, v2x, v2y, this);
	}
	
	/**
	 * Compares each component of this vector with the corresponding component of the given vector {@code (v2)} and
	 * returns the greatest values.
	 * 
	 * <p>
	 * This operation <u><b>does</b></u> alter the vector.
	 * 
	 * @param v2 The second vector.
	 * 
	 * @return The current vector.
	 */
	default Vec2fC maxVector(Tup2fR v2)
	{
		return Vec2fUtils.maxVector(this, v2, this);
	}
	
	/**
	 * Compares each component of this vector with the corresponding component of the given vector {@code (v2[0], v2[1])} and
	 * returns the greatest values.
	 * 
	 * <p>
	 * This operation <u><b>does</b></u> alter the vector.
	 * 
	 * @param v2 The second vector as an array with at least two entries.
	 * 
	 * @return The current vector.
	 */
	default Vec2fC maxVector(@MinLength(2) float[] v2)
	{
		return Vec2fUtils.maxVector(this, v2, this);
	}
	
	/**
	 * Compares each component of this vector with the corresponding component of the given vector {@code (v2x, v2y)} and
	 * returns the greatest values.
	 * 
	 * <p>
	 * This operation <u><b>does</b></u> alter the vector.
	 * 
	 * @param v2x The value of the x component of the second vector.
	 * @param v2y The value of the y component of the second vector.
	 * 
	 * @return The current vector.
	 */
	default Vec2fC maxVector(float v2x, float v2y)
	{
		return Vec2fUtils.maxVector(this, v2x, v2y, this);
	}
	
	/**
	 * Rotates this vector by the given angle in radians.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for calculation.
	 * 
	 * <p>
	 * This operation <u><b>does</b></u> alter the vector.
	 * 
	 * @param angle The angle in radians.
	 * 
	 * @return The current vector.
	 */
	default Vec2fC rotateRad(float angle)
	{
		return Vec2fUtils.rotateRad(this, angle, this);
	}
	
	/**
	 * Rotates this vector by the given angle in radians.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * This operation <u><b>does</b></u> alter the vector.
	 * 
	 * @param angle The angle in radians.
	 * @param mathProvider The provider of fundamental math functions that should be used for calculation.
	 * 
	 * @return The current vector.
	 */
	default Vec2fC rotateRad(float angle, MathProvider mathProvider)
	{
		return Vec2fUtils.rotateRad(this, angle, mathProvider, this);
	}
	
	/**
	 * Rotates this vector by the given angle in degrees.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for calculation.
	 * 
	 * <p>
	 * This operation <u><b>does</b></u> alter the vector.
	 * 
	 * @param angle The angle in radians.
	 * 
	 * @return The current vector.
	 */
	default Vec2fC rotateDeg(float angle)
	{
		return Vec2fUtils.rotateDeg(this, angle, this);
	}
	
	/**
	 * Rotates this vector by the given angle in degrees.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * This operation <u><b>does</b></u> alter the vector.
	 * 
	 * @param angle The angle in radians.
	 * @param mathProvider The provider of fundamental math functions that should be used for calculation.
	 * 
	 * @return The current vector.
	 */
	default Vec2fC rotateDeg(float angle, MathProvider mathProvider)
	{
		return Vec2fUtils.rotateDeg(this, angle, mathProvider, this);
	}
	
	/**
	 * Calculates the orthogonal projection of this vector onto the normalized target vector {@code (t)}.
	 * 
	 * <p>
	 * This operation <u><b>does</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code t * (v . t)}
	 * 
	 * @param t The projection target vector.
	 * 
	 * @return The current vector.
	 */
	default Vec2fC project(Tup2fR t)
	{
		return Vec2fUtils.project(this, t, this);
	}
	
	/**
	 * Calculates the orthogonal projection of this vector onto the normalized target vector {@code (t[0], t[1])}.
	 * 
	 * <p>
	 * This operation <u><b>does</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (t[0], t[1]) * (v . (t[0], t[1]))}
	 * 
	 * @param t The projection target vector as an array with at least two entries.
	 * 
	 * @return The current vector.
	 */
	default Vec2fC project(@MinLength(2) float[] t)
	{
		return Vec2fUtils.project(this, t, this);
	}
	
	/**
	 * Calculates the orthogonal projection of this vector onto the normalized target vector {@code (tX, tY)}.
	 * 
	 * <p>
	 * This operation <u><b>does</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (tX, tY) * (v . (tX, tY))}
	 * 
	 * @param tX The value of the x component of the projection target vector.
	 * @param tY The value of the y component of the projection target vector.
	 * 
	 * @return The current vector.
	 */
	default Vec2fC project(float tX, float tY)
	{
		return Vec2fUtils.project(this, tX, tY, this);
	}
	
	/**
	 * Calculates the reflection of this vector based on the given normalized surface normal {@code (n)}.
	 * 
	 * <p>
	 * This operation <u><b>does</b></u> alter the vector.
	 * 
	 * @param n The surface normal vector.
	 * 
	 * @return The current vector.
	 */
	default Vec2fC reflect(Tup2fR n)
	{
		return Vec2fUtils.reflect(this, n, this);
	}
	
	/**
	 * Calculates the reflection of this vector based on the given normalized surface normal {@code (n[0], n[1])}.
	 * 
	 * <p>
	 * This operation <u><b>does</b></u> alter the vector.
	 * 
	 * @param n The surface normal vector as an array with at least two entries.
	 * 
	 * @return The current vector.
	 */
	default Vec2fC reflect(@MinLength(2) float[] n)
	{
		return Vec2fUtils.reflect(this, n, this);
	}
	
	/**
	 * Calculates the reflection of this vector based on the given normalized surface normal {@code (nX, nY)}.
	 * 
	 * <p>
	 * This operation <u><b>does</b></u> alter the vector.
	 * 
	 * @param nX The value of the x component of the surface normal vector.
	 * @param nY The value of the y component of the surface normal vector.
	 * 
	 * @return The current vector.
	 */
	default Vec2fC reflect(float nX, float nY)
	{
		return Vec2fUtils.reflect(this, nX, nY, this);
	}
	
	/**
	 * Rounds the components of this vector towards the next greater integer.
	 * 
	 * <p>
	 * This operation <u><b>does</b></u> alter the vector.
	 * 
	 * @return The current vector.
	 */
	default Vec2fC ceil()
	{
		return Vec2fUtils.ceil(this, this);
	}
	
	/**
	 * Rounds the components of this vector towards the next smaller integer.
	 * 
	 * <p>
	 * This operation <u><b>does</b></u> alter the vector.
	 * 
	 * @return The current vector.
	 */
	default Vec2fC floor()
	{
		return Vec2fUtils.floor(this, this);
	}
	
	/**
	 * Rounds the components of this vector.
	 * 
	 * <p>
	 * This operation <u><b>does</b></u> alter the vector.
	 * 
	 * @return The current vector.
	 */
	default Vec2fC round()
	{
		return Vec2fUtils.round(this, this);
	}
	
	/**
	 * Truncates the decimals of the components of this vector.
	 * 
	 * <p>
	 * This operation <u><b>does</b></u> alter the vector.

	 * @return The current vector.
	 */
	default Vec2fC trunc()
	{
		return Vec2fUtils.trunc(this, this);
	}
	
	/**
	 * Rounds the components of this vector using the given method.
	 * 
	 * <p>
	 * This operation <u><b>does</b></u> alter the vector.
	 * 
	 * @param method The Method to use for rounding.
	 * 
	 * @return The current vector.
	 */
	default Vec2fC round(FloatRoundMethod method)
	{
		return Vec2fUtils.round(this, method, this);
	}
	
	/**
	 * Calculates the absolute value of the component values.
	 * 
	 * <p>
	 * This operation <u><b>does</b></u> alter the vector.
	 * 
	 * @return The current vector.
	 */
	default Vec2fC abs()
	{
		return Vec2fUtils.abs(this, this);
	}
	
	/**
	 * Calculates the {@link Math#signum(float) signum} of the components of this vector.
	 * 
	 * <p>
	 * This operation <u><b>does</b></u> alter the vector.
	 * 
	 * @return The current vector.
	 */
	default Vec2fC signum()
	{
		return Vec2fUtils.signum(this, this);
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2fC addN(Tup2fR v2)
	{
		return Vec2fUtils.addFunc(this, v2, (x, y) -> createNew(x, y));
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2fC addN(@MinLength(2) float[] v2)
	{
		return Vec2fUtils.addFunc(this, v2, (x, y) -> createNew(x, y));
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2fC addN(float value)
	{
		return Vec2fUtils.addFunc(this, value, value, (x, y) -> createNew(x, y));
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2fC addN(float v2x, float v2y)
	{
		return Vec2fUtils.addFunc(this, v2x, v2y, (x, y) -> createNew(x, y));
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2fC subN(Tup2fR v2)
	{
		return Vec2fUtils.subFunc(this, v2, (x, y) -> createNew(x, y));
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2fC subN(@MinLength(2) float[] v2)
	{
		return Vec2fUtils.subFunc(this, v2, (x, y) -> createNew(x, y));
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2fC subN(float value)
	{
		return Vec2fUtils.subFunc(this, value, value, (x, y) -> createNew(x, y));
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2fC subN(float v2x, float v2y)
	{
		return Vec2fUtils.subFunc(this, v2x, v2y, (x, y) -> createNew(x, y));
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2fC revSubN(Tup2fR v2)
	{
		return Vec2fUtils.revSubFunc(this, v2, (x, y) -> createNew(x, y));
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2fC revSubN(@MinLength(2) float[] v2)
	{
		return Vec2fUtils.revSubFunc(this, v2, (x, y) -> createNew(x, y));
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2fC revSubN(float value)
	{
		return Vec2fUtils.revSubFunc(this, value, value, (x, y) -> createNew(x, y));
	}
		
	/** {@inheritDoc} */
	@Override
	default Vec2fC revSubN(float v2x, float v2y)
	{
		return Vec2fUtils.revSubFunc(this, v2x, v2y, (x, y) -> createNew(x, y));
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2fC mulN(Tup2fR v2)
	{
		return Vec2fUtils.mulFunc(this, v2, (x, y) -> createNew(x, y));
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2fC mulN(@MinLength(2) float[] v2)
	{
		return Vec2fUtils.mulFunc(this, v2, (x, y) -> createNew(x, y));
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2fC mulN(float value)
	{
		return Vec2fUtils.mulFunc(this, value, value, (x, y) -> createNew(x, y));
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2fC mulN(float v2x, float v2y)
	{
		return Vec2fUtils.mulFunc(this, v2x, v2y, (x, y) -> createNew(x, y));
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2fC divN(Tup2fR v2)
	{
		return Vec2fUtils.divFunc(this, v2, (x, y) -> createNew(x, y));
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2fC divN(@MinLength(2) float[] v2)
	{
		return Vec2fUtils.divFunc(this, v2, (x, y) -> createNew(x, y));
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2fC divN(float value)
	{
		return Vec2fUtils.divFunc(this, value, value, (x, y) -> createNew(x, y));
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2fC divN(float v2x, float v2y)
	{
		return Vec2fUtils.divFunc(this, v2x, v2y, (x, y) -> createNew(x, y));
	}

	/** {@inheritDoc} */
	@Override
	default Vec2fC revDivN(Tup2fR v2)
	{
		return Vec2fUtils.revDivFunc(this, v2, (x, y) -> createNew(x, y));
	}

	/** {@inheritDoc} */
	@Override
	default Vec2fC revDivN(@MinLength(2) float[] v2)
	{
		return Vec2fUtils.revDivFunc(this, v2, (x, y) -> createNew(x, y));
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2fC revDivN(float value)
	{
		return Vec2fUtils.revDivFunc(this, value, value, (x, y) -> createNew(x, y));
	}

	/** {@inheritDoc} */
	@Override
	default Vec2fC revDivN(float v2x, float v2y)
	{
		return Vec2fUtils.revDivFunc(this, v2x, v2y, (x, y) -> createNew(x, y));
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2fC halfVectorToN(Tup2fR v2)
	{
		return Vec2fUtils.halfVectorToFunc(this, v2, (x, y) -> createNew(x, y));
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2fC halfVectorToN(@MinLength(2) float[] v2)
	{
		return Vec2fUtils.halfVectorToFunc(this, v2, (x, y) -> createNew(x, y));
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2fC halfVectorToN(float v2x, float v2y)
	{
		return Vec2fUtils.halfVectorToFunc(this, v2x, v2y, (x, y) -> createNew(x, y));
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2fC halfPointBetweenN(Tup2fR v2)
	{
		return Vec2fUtils.halfPointBetweenFunc(this, v2, (x, y) -> createNew(x, y));
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2fC halfPointBetweenN(@MinLength(2) float[] v2)
	{
		return Vec2fUtils.halfPointBetweenFunc(this, v2, (x, y) -> createNew(x, y));
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2fC halfPointBetweenN(float v2x, float v2y)
	{
		return Vec2fUtils.halfPointBetweenFunc(this, v2x, v2y, (x, y) -> createNew(x, y));
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2fC negateN()
	{
		return Vec2fUtils.negateFunc(this, (x, y) -> createNew(x, y));
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2fC inverseN()
	{
		return Vec2fUtils.inverseFunc(this, (x, y) -> createNew(x, y));
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2fC normalizeN()
	{
		return Vec2fUtils.normalizeFunc(this, (x, y) -> createNew(x, y));
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2fC minVectorN(Tup2fR v2)
	{
		return Vec2fUtils.minVectorFunc(this, v2, (x, y) -> createNew(x, y));
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2fC minVectorN(@MinLength(2) float[] v2)
	{
		return Vec2fUtils.minVectorFunc(this, v2, (x, y) -> createNew(x, y));
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2fC minVectorN(float v2x, float v2y)
	{
		return Vec2fUtils.minVectorFunc(this, v2x, v2y, (x, y) -> createNew(x, y));
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2fC maxVectorN(Tup2fR v2)
	{
		return Vec2fUtils.maxVectorFunc(this, v2, (x, y) -> createNew(x, y));
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2fC maxVectorN(@MinLength(2) float[] v2)
	{
		return Vec2fUtils.maxVectorFunc(this, v2, (x, y) -> createNew(x, y));
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2fC maxVectorN(float v2x, float v2y)
	{
		return Vec2fUtils.maxVectorFunc(this, v2x, v2y, (x, y) -> createNew(x, y));
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2fC rotateRadN(float angle)
	{
		return Vec2fUtils.rotateRadFunc(this, angle, (x, y) -> createNew(x, y));
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2fC rotateRadN(float angle, MathProvider mathProvider)
	{
		return Vec2fUtils.rotateRadFunc(this, angle, mathProvider, (x, y) -> createNew(x, y));
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2fC rotateDegN(float angle)
	{
		return Vec2fUtils.rotateDegFunc(this, angle, (x, y) -> createNew(x, y));
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2fC rotateDegN(float angle, MathProvider mathProvider)
	{
		return Vec2fUtils.rotateDegFunc(this, angle, mathProvider, (x, y) -> createNew(x, y));
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2fC projectN(Tup2fR t)
	{
		return Vec2fUtils.projectFunc(this, t, (x, y) -> createNew(x, y));
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2fC projectN(@MinLength(2) float[] t)
	{
		return Vec2fUtils.projectFunc(this, t, (x, y) -> createNew(x, y));
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2fC projectN(float tX, float tY)
	{
		return Vec2fUtils.projectFunc(this, tX, tY, (x, y) -> createNew(x, y));
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2fC reflectN(Tup2fR n)
	{
		return Vec2fUtils.reflectFunc(this, n, (x, y) -> createNew(x, y));
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2fC reflectN(@MinLength(2) float[] n)
	{
		return Vec2fUtils.reflectFunc(this, n, (x, y) -> createNew(x, y));
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2fC reflectN(float nX, float nY)
	{
		return Vec2fUtils.reflectFunc(this, nX, nY, (x, y) -> createNew(x, y));
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2fC ceilN()
	{
		return Vec2fUtils.ceilFunc(this, (x, y) -> createNew(x, y));
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2fC floorN()
	{
		return Vec2fUtils.floorFunc(this, (x, y) -> createNew(x, y));
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2fC roundN()
	{
		return Vec2fUtils.roundFunc(this, (x, y) -> createNew(x, y));
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2fC truncN()
	{
		return Vec2fUtils.truncFunc(this, (x, y) -> createNew(x, y));
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2fC roundN(FloatRoundMethod method)
	{
		return Vec2fUtils.roundFunc(this, method, (x, y) -> createNew(x, y));
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2fC absN()
	{
		return Vec2fUtils.absFunc(this, (x, y) -> createNew(x, y));
	}
	
	/** {@inheritDoc} */
	@Override
	default Vec2fC signumN()
	{
		return Vec2fUtils.signumFunc(this, (x, y) -> createNew(x, y));
	}
}
