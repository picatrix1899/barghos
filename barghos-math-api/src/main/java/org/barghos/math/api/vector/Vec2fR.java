package org.barghos.math.api.vector;

import org.barghos.core.api.math.BarghosMath;
import org.barghos.core.api.math.FloatRoundMethod;
import org.barghos.core.api.math.MathProvider;
import org.barghos.annotation.ExtractionParam;
import org.barghos.annotation.FloatMinValue;
import org.barghos.annotation.MinLength;
import org.barghos.math.api.util.ComponentValueFloat;
import org.barghos.tuple.api.t2.Tup2fC;
import org.barghos.tuple.api.t2.Tup2fR;

/**
 * This interface provides non invasive (readonly) functions and methods for float vectors with two dimensions.
 */
public interface Vec2fR extends SimpleVec2fR
{
	/**
	 * Creates a new instance of the type of this vector.
	 * 
	 * @return A new instance.
	 */
	Vec2fR createNew();
	
	/**
	 * Creates a new instance of the type of this vector and adopts the component values from the givewn vector {@code (v)}.
	 * 
	 * @param v The vector to adopt the component values from.
	 * 
	 * @return A new instance.
	 */
	default Vec2fR createNew(Tup2fR v)
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
	default Vec2fR createNew(@MinLength(2) float[] v)
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
	default Vec2fR createNew(float value)
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
	Vec2fR createNew(float x, float y);
	
	/** {@inheritDoc} */
	@Override
	Vec2fR copy();
	
	/**
	 * Returns the length (magnitude, norm) of this vector.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |v|}
	 * 
	 * @return The length of this vector.
	 */
	default float length()
	{
		return Vec2fUtils.length(this);
	}
	
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
	 * @param mathProvider The provider of fundamental math functions that should be used for calculation.
	 * 
	 * @return The length of this vector.
	 */
	default float length(MathProvider mathProvider)
	{
		return Vec2fUtils.length(this, mathProvider);
	}
	
	/**
	 * Returns the length (magnitude, norm) of this vector.
	 * 
	 * <p>
	 * If all the component values are within the given inclusive margin around zero defined by {@code tolerance},
	 * the length will be zero.
	 * This allows to account for floating point precision errors.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |v|}
	 * 
	 * @param tolerance The inclusive margin around zero to still count as zero.
	 * 
	 * @return The length of this vector.
	 * 
	 * @throws IllegalArgumentException If the given {@code tolerance} is below zero.
	 */
	default float length(@FloatMinValue(0.0f) float tolerance)
	{
		return Vec2fUtils.length(this, tolerance);
	}
	
	/**
	 * Returns the length (magnitude, norm) of this vector.
	 * 
	 * <p>
	 * If all the component values are within the given inclusive margin around zero defined by {@code tolerance},
	 * the length will be zero.
	 * This allows to account for floating point precision errors.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |v|}
	 * 
	 * @param tolerance The inclusive margin around zero to still count as zero.
	 * @param mathProvider The provider of fundamental math functions that should be used for calculation.
	 * 
	 * @return The length of this vector.
	 * 
	 * @throws IllegalArgumentException If the given {@code tolerance} is below zero.
	 */
	default float length(@FloatMinValue(0.0f) float tolerance, MathProvider mathProvider)
	{
		return Vec2fUtils.length(this, tolerance, mathProvider);
	}
	
	/**
	 * Returns the inverse (reciprocal) length (magnitude, norm) of this vector.
	 * If the length of this vector is zero, an {@link ArithmeticException} is thrown.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code 1 / |v|}
	 * 
	 * @return The inverse length of this vector.
	 * 
	 * @throws ArithmeticException If the vector has a length of zero.
	 */
	default float inverseLength()
	{
		return Vec2fUtils.inverseLength(this);
	}

	/**
	 * Returns the inverse (reciprocal) length (magnitude, norm) of this vector.
	 * If the length of this vector is zero, an {@link ArithmeticException} is thrown.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code 1 / |v|}
	 * 
	 * @param mathProvider The provider of fundamental math functions that should be used for calculation.
	 * 
	 * @return The inverse length of this vector.
	 * 
	 * @throws ArithmeticException If the vector has a length of zero.
	 */
	default float inverseLength(MathProvider mathProvider)
	{
		return Vec2fUtils.inverseLength(this, mathProvider);
	}
	
	/**
	 * Returns the distance between the endpoint of this vector and the endpoint of the given vector {@code (v2)}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |v2 - v|}
	 * 
	 * @param v2 The second vector.
	 * 
	 * @return The distance between the endpoint of this vector and the endpoint of the given vector.
	 */
	default float distanceTo(Tup2fR v2)
	{
		return Vec2fUtils.distanceTo(this, v2);
	}
	
	/**
	 * Returns the distance between the endpoint of this vector and the endpoint of the given vector {@code (v2)}.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |v2 - v|}
	 * 
	 * @param v2 The second vector.
	 * @param mathProvider The provider of fundamental math functions that should be used for calculation.
	 * 
	 * @return The distance between the endpoint of this vector and the endpoint of the given vector.
	 */
	default float distanceTo(Tup2fR v2, MathProvider mathProvider)
	{
		return Vec2fUtils.distanceTo(this, v2, mathProvider);
	}
	
	/**
	 * Returns the distance between the endpoint of this vector and the endpoint of the given vector {@code (v2)}.
	 * 
	 * <p>
	 * If the distance is less or equal to the given inclusive {@code tolerance} the distance will be zero.
	 * This allows to account for floating point precision errors.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |v2 - v|}
	 * 
	 * @param v2 The second vector.
	 * @param tolerance The inclusive margin around zero to still count as zero.
	 * 
	 * @return The distance between the endpoint of this vector and the endpoint of the given vector.
	 * 
	 * @throws IllegalArgumentException If the given {@code tolerance} is below zero.
	 */
	default float distanceTo(Tup2fR v2, @FloatMinValue(0.0f) float tolerance)
	{
		return Vec2fUtils.distanceTo(this, v2, tolerance);
	}
	
	/**
	 * Returns the distance between the endpoint of this vector and the endpoint of the given vector {@code (v2)}.
	 * 
	 * <p>
	 * If the distance is less or equal to the given inclusive {@code tolerance} the distance will be zero.
	 * This allows to account for floating point precision errors.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |v2 - v|}
	 * 
	 * @param v2 The second vector.
	 * @param tolerance The inclusive margin around zero to still count as zero.
	 * @param mathProvider The provider of fundamental math functions that should be used for calculation.
	 * 
	 * @return The distance between the endpoint of this vector and the endpoint of the given vector.
	 * 
	 * @throws IllegalArgumentException If the given {@code tolerance} is below zero.
	 */
	default float distanceTo(Tup2fR v2, @FloatMinValue(0.0f) float tolerance, MathProvider mathProvider)
	{
		return Vec2fUtils.distanceTo(this, v2, tolerance);
	}
	
	/**
	 * Returns the distance between the endpoint of this vector and the endpoint of the given vector {@code (v2[0], v2[1])}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(v2[0], v2[1]) - v|}
	 * 
	 * @param v2 The second vector as an array with at least two entries.
	 * 
	 * @return The distance between the endpoint of this vector and the endpoint of the given vector.
	 */
	default float distanceTo(@MinLength(2) float[] v2)
	{
		return Vec2fUtils.distanceTo(this, v2);
	}
	
	/**
	 * Returns the distance between the endpoint of this vector and the endpoint of the given vector {@code (v2[0], v2[1])}.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(v2[0], v2[1]) - v|}
	 * 
	 * @param v2 The second vector as an array with at least two entries.
	 * @param mathProvider The provider of fundamental math functions that should be used for calculation.
	 * 
	 * @return The distance between the endpoint of this vector and the endpoint of the given vector.
	 */
	default float distanceTo(@MinLength(2) float[] v2, MathProvider mathProvider)
	{
		return Vec2fUtils.distanceTo(this, v2, mathProvider);
	}
	
	/**
	 * Returns the distance between the endpoint of this vector and the endpoint of the given vector {@code (v2[0], v2[1])}.
	 * 
	 * <p>
	 * If the distance is less or equal to the given inclusive {@code tolerance} the distance will be zero.
	 * This allows to account for floating point precision errors.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(v2[0], v2[1]) - v|}
	 * 
	 * @param v2 The second vector as an array with at least two entries.
	 * @param tolerance The inclusive margin around zero to still count as zero.
	 * 
	 * @return The distance between the endpoint of this vector and the endpoint of the given vector.
	 * 
	 * @throws IllegalArgumentException If the given {@code tolerance} is below zero.
	 */
	default float distanceTo(@MinLength(2) float[] v2, @FloatMinValue(0.0f) float tolerance)
	{
		return Vec2fUtils.distanceTo(this, v2, tolerance);
	}
	
	/**
	 * Returns the distance between the endpoint of this vector and the endpoint of the given vector {@code (v2[0], v2[1])}.
	 * 
	 * <p>
	 * If the distance is less or equal to the given inclusive {@code tolerance} the distance will be zero.
	 * This allows to account for floating point precision errors.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(v2[0], v2[1]) - v|}
	 * 
	 * @param v2 The second vector as an array with at least two entries.
	 * @param tolerance The inclusive margin around zero to still count as zero.
	 * @param mathProvider The provider of fundamental math functions that should be used for calculation.
	 * 
	 * @return The distance between the endpoint of this vector and the endpoint of the given vector.
	 * 
	 * @throws IllegalArgumentException If the given {@code tolerance} is below zero.
	 */
	default float distanceTo(@MinLength(2) float[] v2, @FloatMinValue(0.0f) float tolerance, MathProvider mathProvider)
	{
		return Vec2fUtils.distanceTo(this, v2, tolerance, mathProvider);
	}
	
	/**
	 * Returns the distance between the endpoint of this vector and the endpoint of the given vector {@code (v2x, v2y)}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(v2x, v2y) - v|}
	 * 
	 * @param v2x The value of the x component of the second vector.
	 * @param v2y The value of the y component of the second vector.
	 * 
	 * @return The distance between the endpoint of this vector and the endpoint of the given vector.
	 */
	default float distanceTo(float v2x, float v2y)
	{
		return Vec2fUtils.distanceTo(this, v2x, v2y);
	}
	
	/**
	 * Returns the distance between the endpoint of this vector and the endpoint of the given vector {@code (v2x, v2y)}.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(v2x, v2y) - v|}
	 * 
	 * @param v2x The value of the x component of the second vector.
	 * @param v2y The value of the y component of the second vector.
	 * @param mathProvider The provider of fundamental math functions that should be used for calculation.
	 * 
	 * @return The distance between the endpoint of this vector and the endpoint of the given vector.
	 */
	default float distanceTo(float v2x, float v2y, MathProvider mathProvider)
	{
		return Vec2fUtils.distanceTo(this, v2x, v2y, mathProvider);
	}
	
	/**
	 * Returns the distance between the endpoint of this vector and the endpoint of the given vector {@code (v2x, v2y)}.
	 * 
	 * <p>
	 * If the distance is less or equal to the given inclusive {@code tolerance} the distance will be zero.
	 * This allows to account for floating point precision errors.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(v2x, v2y) - v|}
	 * 
	 * @param v2x The value of the x component of the second vector.
	 * @param v2y The value of the y component of the second vector.
	 * @param tolerance The inclusive margin around zero to still count as zero.
	 * 
	 * @return The distance between the endpoint of this vector and the endpoint of the given vector.
	 * 
	 * @throws IllegalArgumentException If the given {@code tolerance} is below zero.
	 */
	default float distanceTo(float v2x, float v2y, @FloatMinValue(0.0f) float tolerance)
	{
		return Vec2fUtils.distanceTo(this, v2x, v2y, tolerance);
	}
	
	/**
	 * Returns the distance between the endpoint of this vector and the endpoint of the given vector {@code (v2x, v2y)}.
	 * 
	 * <p>
	 * If the distance is less or equal to the given inclusive {@code tolerance} the distance will be zero.
	 * This allows to account for floating point precision errors.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(v2x, v2y) - v|}
	 * 
	 * @param v2x The value of the x component of the second vector.
	 * @param v2y The value of the y component of the second vector.
	 * @param tolerance The inclusive margin around zero to still count as zero.
	 * @param mathProvider The provider of fundamental math functions that should be used for calculation.
	 * 
	 * @return The distance between the endpoint of this vector and the endpoint of the given vector.
	 * 
	 * @throws IllegalArgumentException If the given {@code tolerance} is below zero.
	 */
	default float distanceTo(float v2x, float v2y, @FloatMinValue(0.0f) float tolerance, MathProvider mathProvider)
	{
		return Vec2fUtils.distanceTo(this, v2x, v2y, tolerance, mathProvider);
	}
	
	/**
	 * Returns the inverse (reciprocal) distance between the endpoint of this vector and the endpoint of the given vector {@code (v2)}.
	 * If the distance is zero an {@link ArithmeticException} is thrown.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code 1 / |v2 - v|}
	 * 
	 * @param v2 The second vector.
	 * 
	 * @return The inverse distance between the endpoint of this vector and the endpoint of the given vector.
	 * 
	 * @throws ArithmeticException If the distance between the endpoints is zero.
	 */
	default float inverseDistanceTo(Tup2fR v2)
	{
		return Vec2fUtils.inverseDistanceTo(this, v2);
	}
	
	/**
	 * Returns the inverse (reciprocal) distance between the endpoint of this vector and the endpoint of the given vector {@code (v2)}.
	 * If the distance is zero an {@link ArithmeticException} is thrown.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code 1 / |v2 - v|}
	 * 
	 * @param v2 The second vector.
	 * @param mathProvider The provider of fundamental math functions that should be used for calculation.
	 * 
	 * @return The inverse distance between the endpoint of this vector and the endpoint of the given vector.
	 * 
	 * @throws ArithmeticException If the distance between the endpoints is zero.
	 */
	default float inverseDistanceTo(Tup2fR v2, MathProvider mathProvider)
	{
		return Vec2fUtils.inverseDistanceTo(this, v2, mathProvider);
	}
	
	/**
	 * Returns the inverse (reciprocal) distance between the endpoint of this vector and the endpoint of the given vector {@code (v2[0], v2[1])}.
	 * If the distance is zero an {@link ArithmeticException} is thrown.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code 1 / |(v2[0], v2[1]) - v|}
	 * 
	 * @param v2 The second vector as an array with at least two entries.
	 * 
	 * @return The inverse distance between the endpoint of this vector and the endpoint of the given vector.
	 * 
	 * @throws ArithmeticException If the distance between the endpoints is zero.
	 */
	default float inverseDistanceTo(@MinLength(2) float[] v2)
	{
		return Vec2fUtils.inverseDistanceTo(this, v2);
	}
	
	/**
	 * Returns the inverse (reciprocal) distance between the endpoint of this vector and the endpoint of the given vector {@code (v2[0], v2[1])}.
	 * If the distance is zero an {@link ArithmeticException} is thrown.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code 1 / |(v2[0], v2[1]) - v|}
	 * 
	 * @param v2 The second vector as an array with at least two entries.
	 * @param mathProvider The provider of fundamental math functions that should be used for calculation.
	 * 
	 * @return The inverse distance between the endpoint of this vector and the endpoint of the given vector.
	 * 
	 * @throws ArithmeticException If the distance between the endpoints is zero.
	 */
	default float inverseDistanceTo(@MinLength(2) float[] v2, MathProvider mathProvider)
	{
		return Vec2fUtils.inverseDistanceTo(this, v2, mathProvider);
	}
	
	/**
	 * Returns the inverse (reciprocal) distance between the endpoint of this vector and the endpoint of the given vector {@code (v2x, v2y)}.
	 * If the distance is zero an {@link ArithmeticException} is thrown.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code 1 / |(v2x, v2y) - v|}
	 * 
	 * @param v2x The value of the x component of the second vector.
	 * @param v2y The value of the y component of the second vector.
	 * 
	 * @return The inverse distance between the endpoint of this vector and the endpoint of the given vector.
	 * 
	 * @throws ArithmeticException If the distance between the endpoints is zero.
	 */
	default float inverseDistanceTo(float v2x, float v2y)
	{
		return Vec2fUtils.inverseDistanceTo(this, v2x, v2y);
	}
	
	/**
	 * Returns the inverse (reciprocal) distance between the endpoint of this vector and the endpoint of the given vector {@code (v2x, v2y)}.
	 * If the distance is zero an {@link ArithmeticException} is thrown.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code 1 / |(v2x, v2y) - v|}
	 * 
	 * @param v2x The value of the x component of the second vector.
	 * @param v2y The value of the y component of the second vector.
	 * @param mathProvider The provider of fundamental math functions that should be used for calculation.
	 * 
	 * @return The inverse distance between the endpoint of this vector and the endpoint of the given vector.
	 * 
	 * @throws ArithmeticException If the distance between the endpoints is zero.
	 */
	default float inverseDistanceTo(float v2x, float v2y, MathProvider mathProvider)
	{
		return Vec2fUtils.inverseDistanceTo(this, v2x, v2y, mathProvider);
	}
	
	/**
	 * Returns the squared length (magnitude, norm) of this vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |v|^2}
	 * 
	 * @return The squared length of this vector.
	 */
	default float squaredLength()
	{
		return Vec2fUtils.squaredLength(this);
	}
	
	/**
	 * Returns the squared distance between the endpoint of this vector and the endpoint of the given vector {@code (v2)}.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |v2 - v|^2}
	 * 
	 * @param v2 The second vector.
	 * 
	 * @return The squared distance between the endpoint of this vector and the endpoint of the given vector.
	 */
	default float squaredDistanceTo(Tup2fR v2)
	{
		return Vec2fUtils.squaredDistanceTo(this, v2);
	}
	
	/**
	 * Returns the squared distance between the endpoint of this vector and the endpoint of the given vector {@code (v2[0], v2[1])}.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(v2[0], v2[1]) - v|^2}
	 * 
	 * @param v2 The second vector as an array with at least two entries.
	 * 
	 * @return The squared distance between the endpoint of this vector and the endpoint of the given vector.
	 */
	default float squaredDistanceTo(@MinLength(2) float[] v2)
	{
		return Vec2fUtils.squaredDistanceTo(this, v2);
	}
	
	/**
	 * Returns the squared distance between the endpoint of this vector and the endpoint of the given vector {@code (v2x, v2y)}.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(v2x, v2y) - v|^2}
	 * 
	 * @param v2x The value of the x component of the second vector.
	 * @param v2y The value of the y component of the second vector.
	 * 
	 * @return The squared distance between the endpoint of this vector and the endpoint of the given vector.
	 */
	default float squaredDistanceTo(float v2x, float v2y)
	{
		return Vec2fUtils.squaredDistanceTo(this, v2x, v2y);
	}
	
	/**
	 * Returns the dot product (scalar product) between this vector and the given vector {@code (v2)}.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v . v2}
	 * 
	 * @param v2 The second vector.
	 * @return The dot product.
	 */
	default float dot(Tup2fR v2)
	{
		return Vec2fUtils.dot(this, v2);
	}
	
	/**
	 * Returns the dot product (scalar product) between this vector and the given vector {@code (v2[0], v2[1])}.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v . (v2[0], v2[1])}
	 * 
	 * @param v2 The second vector as an array with at least two entries.
	 * @return The dot product.
	 */
	default float dot(@MinLength(2) float[] v2)
	{
		return Vec2fUtils.dot(this, v2);
	}
	
	/**
	 * Returns the dot product (scalar product) between this vector and the given vector {@code (v2x, v2y)}.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v . (v2x, v2y)}
	 * 
	 * @param v2x The value of the x component of the second vector.
	 * @param v2y The value of the y component of the second vector.
	 * @return The dot product.
	 */
	default float dot(float v2x, float v2y)
	{
		return Vec2fUtils.dot(this, v2x, v2y);
	}
	
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
	 * @param v2 The vector to add to this vector.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	default Vec2fR addN(Tup2fR v2)
	{
		return Vec2fUtils.addFunc(this, v2, (x, y) -> createNew(x, y));
	}
	
	/**
	 * Adds the given vector {@code (v2[0], v2[1])} to this vector and saves the result in a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v + (v2[0], v2[1])}
	 * 
	 * @param v2 The vector to add to this vector as an array with at least two entries.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	default Vec2fR addN(@MinLength(2) float[] v2)
	{
		return Vec2fUtils.addFunc(this, v2, (x, y) -> createNew(x, y));
	}
	
	/**
	 * Adds the given value {@code (value)} to every component of this vector and saves the result in a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v + (value, value)}
	 * 
	 * @param value The value to add to this vector.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	default Vec2fR addN(float value)
	{
		return Vec2fUtils.addFunc(this, value, value, (x, y) -> createNew(x, y));
	}
	
	/**
	 * Adds the given vector {@code (v2x, v2y)} to this vector and saves the result in a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v + (v2x, v2y)}
	 * 
	 * @param v2x The value of the x component to add to this vector.
	 * @param v2y The value of the y component to add to this vector.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	default Vec2fR addN(float v2x, float v2y)
	{
		return Vec2fUtils.addFunc(this, v2x, v2y, (x, y) -> createNew(x, y));
	}
	
	/**
	 * Subtracts the given vector {@code (v2)} from this vector and saves the result in a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v - v2}
	 * 
	 * @param v2 The vector to subtract from this vector.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	default Vec2fR subN(Tup2fR v2)
	{
		return Vec2fUtils.subFunc(this, v2, (x, y) -> createNew(x, y));
	}
	
	/**
	 * Subtracts the given vector {@code (v2[0], v2[1])} from this vector and saves the result in a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v - (v2[0], v2[1])}
	 * 
	 * @param v2 The vector to subtract from this vector as an array with at least two entries.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	default Vec2fR subN(@MinLength(2) float[] v2)
	{
		return Vec2fUtils.subFunc(this, v2, (x, y) -> createNew(x, y));
	}
	
	/**
	 * Subtracts the given value {@code (value)} from every component of this vector and saves the result in a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v - (value, value)}
	 * 
	 * @param value The value to subtract from this vector.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	default Vec2fR subN(float value)
	{
		return Vec2fUtils.subFunc(this, value, value, (x, y) -> createNew(x, y));
	}
	
	/**
	 * Subtracts the given vector {@code (v2x, v2y)} from this vector and saves the result in a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v - (v2x, v2y)}
	 * 
	 * @param v2x The value of the x component to subtract from this vector.
	 * @param v2y The value of the y component to subtract from this vector.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	default Vec2fR subN(float v2x, float v2y)
	{
		return Vec2fUtils.subFunc(this, v2x, v2y, (x, y) -> createNew(x, y));
	}
	
	/**
	 * Subtracts this vector from the given vector {@code (v2)} and saves the result in a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v2 - v}
	 * 
	 * @param v2 The vector this vector is subtracted from.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	default Vec2fR revSubN(Tup2fR v2)
	{
		return Vec2fUtils.revSubFunc(this, v2, (x, y) -> createNew(x, y));
	}
	
	/**
	 * Subtracts this vector from the given vector {@code (v2[0], v2[1])} and saves the result in a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2[0], v2[1]) - v}
	 * 
	 * @param v2 The vector this vector is subtracted from as an array with at least two entries.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	default Vec2fR revSubN(@MinLength(2) float[] v2)
	{
		return Vec2fUtils.revSubFunc(this, v2, (x, y) -> createNew(x, y));
	}
	
	/**
	 * Subtracts every component of this vector from the given value {@code (value)} and saves the result in a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (value, value) - v}
	 * 
	 * @param value The value this vector is subtracted from.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	default Vec2fR revSubN(float value)
	{
		return Vec2fUtils.revSubFunc(this, value, value, (x, y) -> createNew(x, y));
	}
		
	/**
	 * Subtracts this vector from the given vector {@code (v2x, v2y)} and saves the result in a new instance.
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
	 * @return A new instance of this vector with the result.
	 */
	default Vec2fR revSubN(float v2x, float v2y)
	{
		return Vec2fUtils.revSubFunc(this, v2x, v2y, (x, y) -> createNew(x, y));
	}
	
	/**
	 * Multiplies this vector with the given vector {@code (v2)} and saves the result in a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v * v2}
	 * 
	 * @param v2 The vector to multiply this vector with.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	default Vec2fR mulN(Tup2fR v2)
	{
		return Vec2fUtils.mulFunc(this, v2, (x, y) -> createNew(x, y));
	}
	
	/**
	 * Multiplies this vector with the given vector {@code (v2[0], v2[1])} and saves the result in a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v * (v2[0], v2[1])}
	 * 
	 * @param v2 The vector to multiply this vector with as an array with at least two entries.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	default Vec2fR mulN(@MinLength(2) float[] v2)
	{
		return Vec2fUtils.mulFunc(this, v2, (x, y) -> createNew(x, y));
	}
	
	/**
	 * Multiplies every component of this vector with the given value {@code (value)} and saves the result in a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v * (value, value)}
	 * 
	 * @param value The value to multiply this vector with.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	default Vec2fR mulN(float value)
	{
		return Vec2fUtils.mulFunc(this, value, value, (x, y) -> createNew(x, y));
	}
	
	/**
	 * Multiplies this vector with the given vector {@code (v2x, v2y)} and saves the result in a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v * (v2x, v2y)}
	 * 
	 * @param v2x The value of the x component to multiply this vector with.
	 * @param v2y The value of the y component to multiply this vector with.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	default Vec2fR mulN(float v2x, float v2y)
	{
		return Vec2fUtils.mulFunc(this, v2x, v2y, (x, y) -> createNew(x, y));
	}
	
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
	 * @param v2 The vector to divide this vector by.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	default Vec2fR divN(Tup2fR v2)
	{
		return Vec2fUtils.divFunc(this, v2, (x, y) -> createNew(x, y));
	}
	
	/**
	 * Divides this vector by the given vector {@code (v2[0], v2[1])} and saves the result in a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v / (v2[0], v2[1])}
	 * 
	 * @param v2 The vector to divide this vector by as an array with at least two entries.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	default Vec2fR divN(@MinLength(2) float[] v2)
	{
		return Vec2fUtils.divFunc(this, v2, (x, y) -> createNew(x, y));
	}
	
	/**
	 * Divides each component of this vector by the given value {@code (value)} and saves the result in a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v / (value, value)}
	 * 
	 * @param value The value to divide this vector by.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	default Vec2fR divN(float value)
	{
		return Vec2fUtils.divFunc(this, value, value, (x, y) -> createNew(x, y));
	}
	
	/**
	 * Divides this vector by the given vector {@code (v2x, v2y)} and saves the result in a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v / (v2x, v2y)}
	 * 
	 * @param v2x The value of the x component to divide this vector by.
	 * @param v2y The value of the y component to divide this vector by.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	default Vec2fR divN(float v2x, float v2y)
	{
		return Vec2fUtils.divFunc(this, v2x, v2y, (x, y) -> createNew(x, y));
	}

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
	 * @param v2 The vector to divide by this vector.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	default Vec2fR revDivN(Tup2fR v2)
	{
		return Vec2fUtils.revDivFunc(this, v2, (x, y) -> createNew(x, y));
	}

	/**
	 * Divides the given vector {@code (v2[0], v2[1])} by this vector and saves the result in a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2[0], v2[1]) / v}
	 * 
	 * @param v2 The vector to divide by this vector as an array with at least two entries.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	default Vec2fR revDivN(@MinLength(2) float[] v2)
	{
		return Vec2fUtils.revDivFunc(this, v2, (x, y) -> createNew(x, y));
	}
	
	/**
	 * Divides the given value {@code (value)} by each component of this vector and saves the result in a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (value, value) / v}
	 * 
	 * @param value The value to divide by this vector.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	default Vec2fR revDivN(float value)
	{
		return Vec2fUtils.revDivFunc(this, value, value, (x, y) -> createNew(x, y));
	}

	/**
	 * Divides the given vector {@code (v2x, v2y)} by this vector and saves the result in a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2x, v2y) / v}
	 * 
	 * @param v2x The value of the x component to divide by this vector.
	 * @param v2y The value of the y component to divide by this vector.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	default Vec2fR revDivN(float v2x, float v2y)
	{
		return Vec2fUtils.revDivFunc(this, v2x, v2y, (x, y) -> createNew(x, y));
	}
	
	/**
	 * Returns half the vector from the endpoint of this vector to the endpoint of the given vector {@code (v2)} as a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ( v2 - v ) / 2}
	 * 
	 * @param v2 The second vector.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	default Vec2fR halfVectorToN(Tup2fR v2)
	{
		return Vec2fUtils.halfVectorToFunc(this, v2, (x, y) -> createNew(x, y));
	}
	
	/**
	 * Returns half the vector from the endpoint of this vector to the endpoint of the given vector {@code (v2[0], v2[1])} as a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ( (v2[0], v2[1]) - v ) / 2}
	 * 
	 * @param v2 The second vector as an array with at least two entries.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	default Vec2fR halfVectorToN(@MinLength(2) float[] v2)
	{
		return Vec2fUtils.halfVectorToFunc(this, v2, (x, y) -> createNew(x, y));
	}
	
	/**
	 * Returns half the vector from the endpoint of this vector to the endpoint of the given vector {@code (v2x, v2y)} as a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ( (v2x, v2y) - v ) / 2}
	 * 
	 * @param v2x The value of the x component of the second vector.
	 * @param v2y The value of the y component of the second vector.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	default Vec2fR halfVectorToN(float v2x, float v2y)
	{
		return Vec2fUtils.halfVectorToFunc(this, v2x, v2y, (x, y) -> createNew(x, y));
	}
	
	/**
	 * Returns the origin vector to the point that lies half way between the endpoint of this vector and the endpoint of the given vector {@code (v2)} as a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ( v2 + v ) / 2}
	 * 
	 * @param v2 The second vector.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	default Vec2fR halfPointBetweenN(Tup2fR v2)
	{
		return Vec2fUtils.halfPointBetweenFunc(this, v2, (x, y) -> createNew(x, y));
	}
	
	/**
	 * Returns the origin vector to the point that lies half way between the endpoint of this vector and the endpoint of the given vector {@code (v2[0], v2[1])} as a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ( (v2[0], v2[1]) + v ) / 2}
	 * 
	 * @param v2 The second vector as an array with at least two entries.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	default Vec2fR halfPointBetweenN(@MinLength(2) float[] v2)
	{
		return Vec2fUtils.halfPointBetweenFunc(this, v2, (x, y) -> createNew(x, y));
	}
	
	/**
	 * Returns the origin vector to the point that lies half way between the endpoint of this vector and the endpoint of the given vector {@code (v2x, v2y)} as a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ( (v2x, v2y) + v ) / 2}
	 * 
	 * @param v2x The value of the x component of the second vector.
	 * @param v2y The value of the y component of the second vector.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	default Vec2fR halfPointBetweenN(float v2x, float v2y)
	{
		return Vec2fUtils.halfPointBetweenFunc(this, v2x, v2y, (x, y) -> createNew(x, y));
	}
	
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
	default Vec2fR negateN()
	{
		return Vec2fUtils.negateFunc(this, (x, y) -> createNew(x, y));
	}
	
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
	default Vec2fR inverseN()
	{
		return Vec2fUtils.inverseFunc(this, (x, y) -> createNew(x, y));
	}
	
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
	default Vec2fR normalizeN()
	{
		return Vec2fUtils.normalizeFunc(this, (x, y) -> createNew(x, y));
	}
	
	/**
	 * Compares each component of this vector with the corresponding component of the given vector {@code (v2)} and
	 * returns the smallest values as a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * @param v2 The second vector.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	default Vec2fR minVectorN(Tup2fR v2)
	{
		return Vec2fUtils.minVectorFunc(this, v2, (x, y) -> createNew(x, y));
	}
	
	/**
	 * Compares each component of this vector with the corresponding component of the given vector {@code (v2[0], v2[1])} and
	 * returns the smallest values as a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * @param v2 The second vector as an array with at least two entries.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	default Vec2fR minVectorN(@MinLength(2) float[] v2)
	{
		return Vec2fUtils.minVectorFunc(this, v2, (x, y) -> createNew(x, y));
	}
	
	/**
	 * Compares each component of this vector with the corresponding component of the given vector {@code (v2x, v2y)} and
	 * returns the smallest values as a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * @param v2x The value of the x component of the second vector.
	 * @param v2y The value of the y component of the second vector.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	default Vec2fR minVectorN(float v2x, float v2y)
	{
		return Vec2fUtils.minVectorFunc(this, v2x, v2y, (x, y) -> createNew(x, y));
	}
	
	/**
	 * Compares each component of this vector with the corresponding component of the given vector {@code (v2)} and
	 * returns the greatest values as a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * @param v2 The second vector.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	default Vec2fR maxVectorN(Tup2fR v2)
	{
		return Vec2fUtils.maxVectorFunc(this, v2, (x, y) -> createNew(x, y));
	}
	
	/**
	 * Compares each component of this vector with the corresponding component of the given vector {@code (v2[0], v2[1])} and
	 * returns the greatest values as a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * @param v2 The second vector as an array with at least two entries.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	default Vec2fR maxVectorN(@MinLength(2) float[] v2)
	{
		return Vec2fUtils.maxVectorFunc(this, v2, (x, y) -> createNew(x, y));
	}
	
	/**
	 * Compares each component of this vector with the corresponding component of the given vector {@code (v2x, v2y)} and
	 * returns the greatest values as a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * @param v2x The value of the x component of the second vector.
	 * @param v2y The value of the y component of the second vector.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	default Vec2fR maxVectorN(float v2x, float v2y)
	{
		return Vec2fUtils.maxVectorFunc(this, v2x, v2y, (x, y) -> createNew(x, y));
	}
	
	/**
	 * Rotates this vector by the given angle in radians and returns the result as a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for calculation.
	 * 
	 * @param angle The angle in radians.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	default Vec2fR rotateRadN(float angle)
	{
		return Vec2fUtils.rotateRadFunc(this, angle, (x, y) -> createNew(x, y));
	}
	
	/**
	 * Rotates this vector by the given angle in radians and returns the result as a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * @param angle The angle in radians.
	 * @param mathProvider The provider of fundamental math functions that should be used for calculation.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	default Vec2fR rotateRadN(float angle, MathProvider mathProvider)
	{
		return Vec2fUtils.rotateRadFunc(this, angle, mathProvider, (x, y) -> createNew(x, y));
	}
	
	/**
	 * Rotates this vector by the given angle in degrees and returns the result as a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for calculation.
	 * 
	 * @param angle The angle in radians.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	default Vec2fR rotateDegN(float angle)
	{
		return Vec2fUtils.rotateDegFunc(this, angle, (x, y) -> createNew(x, y));
	}
	
	/**
	 * Rotates this vector by the given angle in degrees and returns the result as a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * @param angle The angle in radians.
	 * @param mathProvider The provider of fundamental math functions that should be used for calculation.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	default Vec2fR rotateDegN(float angle, MathProvider mathProvider)
	{
		return Vec2fUtils.rotateDegFunc(this, angle, mathProvider, (x, y) -> createNew(x, y));
	}
	
	/**
	 * Calculates the orthogonal projection of this vector onto the normalized target vector {@code (t)}
	 * and returns the result as a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code t * (v . t)}
	 * 
	 * @param t The projection target vector.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	default Vec2fR projectN(Tup2fR t)
	{
		return Vec2fUtils.projectFunc(this, t, (x, y) -> createNew(x, y));
	}
	
	/**
	 * Calculates the orthogonal projection of this vector onto the normalized target vector {@code (t[0], t[1])}
	 * and returns the result as a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (t[0], t[1]) * (v . (t[0], t[1]))}
	 * 
	 * @param t The projection target vector as an array with at least two entries.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	default Vec2fR projectN(@MinLength(2) float[] t)
	{
		return Vec2fUtils.projectFunc(this, t, (x, y) -> createNew(x, y));
	}
	
	/**
	 * Calculates the orthogonal projection of this vector onto the normalized target vector {@code (tX, tY)}
	 * and returns the result as a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (tX, tY) * (v . (tX, tY))}
	 * 
	 * @param tX The value of the x component of the projection target vector.
	 * @param tY The value of the y component of the projection target vector.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	default Vec2fR projectN(float tX, float tY)
	{
		return Vec2fUtils.projectFunc(this, tX, tY, (x, y) -> createNew(x, y));
	}
	
	/**
	 * Calculates the reflection of this vector based on the given normalized surface normal {@code (n)}
	 * and returns the result as a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * @param n The surface normal vector.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	default Vec2fR reflectN(Tup2fR n)
	{
		return Vec2fUtils.reflectFunc(this, n, (x, y) -> createNew(x, y));
	}
	
	/**
	 * Calculates the reflection of this vector based on the given normalized surface normal {@code (n[0], n[1])}
	 * and returns the result as a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * @param n The surface normal vector as an array with at least two entries.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	default Vec2fR reflectN(@MinLength(2) float[] n)
	{
		return Vec2fUtils.reflectFunc(this, n, (x, y) -> createNew(x, y));
	}
	
	/**
	 * Calculates the reflection of this vector based on the given normalized surface normal {@code (nX, nY)}
	 * and returns the result as a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * @param nX The value of the x component of the surface normal vector.
	 * @param nY The value of the y component of the surface normal vector.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	default Vec2fR reflectN(float nX, float nY)
	{
		return Vec2fUtils.reflectFunc(this, nX, nY, (x, y) -> createNew(x, y));
	}
	
	/**
	 * Rounds the components of this vector towards the next greater integer and saves the result in a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	default Vec2fR ceilN()
	{
		return Vec2fUtils.ceilFunc(this, (x, y) -> createNew(x, y));
	}
	
	/**
	 * Rounds the components of this vector towards the next smaller integer and saves the result in a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	default Vec2fR floorN()
	{
		return Vec2fUtils.floorFunc(this, (x, y) -> createNew(x, y));
	}
	
	/**
	 * Rounds the components of this vector and saves the result in a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	default Vec2fR roundN()
	{
		return Vec2fUtils.roundFunc(this, (x, y) -> createNew(x, y));
	}
	
	/**
	 * Truncates the decimals of the components of this vector and saves the result in a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.

	 * @return A new instance of this vector with the result.
	 */
	default Vec2fR truncN()
	{
		return Vec2fUtils.truncFunc(this, (x, y) -> createNew(x, y));
	}
	
	/**
	 * Rounds the components of this vector using the given method and saves the result in a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * @param method The Method to use for rounding.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	default Vec2fR roundN(FloatRoundMethod method)
	{
		return Vec2fUtils.roundFunc(this, method, (x, y) -> createNew(x, y));
	}
	
	/**
	 * Determines the smallest value of the components and returns the value and the index of the component.
	 * The index returned is limited to the range of {@code 0 to 1}.
	 * If two or more components have the same value the smallest index will be returned.
	 * The returned object is immutable.
	 * 
	 * @return An object containing the smallest value of the components and the index of the corresponding component.
	 */
	default ComponentValueFloat min()
	{
		return Vec2fUtils.min(this, new ComponentValueFloat());
	}
	
	/**
	 * Determines the smallest value of the components and returns the value and the index of the component.
	 * The index returned is limited to the range of {@code 0 to 1}.
	 * If two or more components have the same value the smallest index will be returned.
	 * This version utilizes an extraction parameter that receives the result and will be returned.
	 * 
	 * @param res The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default ComponentValueFloat min(@ExtractionParam ComponentValueFloat res)
	{
		return Vec2fUtils.min(this, res);
	}
	
	/**
	 * Determines the smallest value of the components and returns it.
	 * 
	 * @return The smallest value of the components.
	 */
	default float minValue()
	{
		return Vec2fUtils.minValue(this);
	}
	
	/**
	 * Determines the smallest value of the componensts and returns the index of the component.
	 * The index returned is limited to the range of {@code 0 to 1}.
	 * If two or more components have the same value the smallest index will be returned.
	 * 
	 * @return The index of the smallest component.
	 */
	default int minComponent()
	{
		return Vec2fUtils.minComponent(this);
	}
	
	/**
	 * Determines the greatest value of the components and returns the value and the index of the component.
	 * The index returned is limited to the range of {@code 0 to 1}.
	 * If two or more components have the same value the smallest index will be returned.
	 * The returned tuple is immutable.
	 * 
	 * @return An object containing the greatest value of the components and the index of the corresponding component.
	 */
	default ComponentValueFloat max()
	{
		return Vec2fUtils.max(this, new ComponentValueFloat());
	}
	
	/**
	 * Determines the greatest value of the components and returns the value and the index of the component.
	 * The index returned is limited to the range of {@code 0 to 1}.
	 * If two or more components have the same value the smallest index will be returned.
	 * This version utilizes an extraction parameter that receives the result and will be returned.
	 * 
	 * @param res The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default ComponentValueFloat max(@ExtractionParam ComponentValueFloat res)
	{
		return Vec2fUtils.max(this, res);
	}
	
	/**
	 * Determines the greatest value of the components and returns it.
	 * 
	 * @return The greatest value of the components.
	 */
	default float maxValue()
	{
		return Vec2fUtils.maxValue(this);
	}
	
	/**
	 * Determines the greatest value of the componensts and returns the index of the component.
	 * The index returned is limited to the range of {@code 0 to getDimensions() - 1}.
	 * If two or more components have the same value the smallest index will be returned.
	 * 
	 * @return The index of the greatest component.
	 */
	default int maxComponent()
	{
		return Vec2fUtils.maxComponent(this);
	}
	
	/**
	 * Calculates the absolute value of the component values and saves the result in a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	default Vec2fR absN()
	{
		return Vec2fUtils.absFunc(this, (x, y) -> createNew(x, y));
	}
	
	/**
	 * Calculates the {@link Math#signum(float) signum} of the components of this vector and saves the result in a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	default Vec2fR signumN()
	{
		return Vec2fUtils.signumFunc(this, (x, y) -> createNew(x, y));
	}
	
	/**
	 * Adds the given vector {@code (v2)} to this vector and saves the result in the extraction parameter {@code res}.
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
	 * @param <T> The type of the extraction parameter.
	 * 
	 * @param v2 The vector to add to this vector.
	 * @param res The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default <T extends Tup2fC> T addR(Tup2fR v2, @ExtractionParam T res)
	{
		return Vec2fUtils.add(this, v2.getV0(), v2.getV1(), res);
	}
	
	/**
	 * Adds the given vector {@code (v2)} to this vector and saves the result in the extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v + v2}
	 * 
	 * @param v2 The vector to add to this vector.
	 * @param res The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default float[] addR(Tup2fR v2, @ExtractionParam @MinLength(2) float[] res)
	{
		return Vec2fUtils.add(this, v2.getV0(), v2.getV1(), res);
	}
	
	/**
	 * Adds the given vector {@code (v2[0], v2[1])} to this vector and saves the result in the extraction parameter {@code res}.
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
	 * @param <T> The type of the extraction parameter.
	 * 
	 * @param v2 The vector to add to this vector as an array with at least two entries.
	 * @param res The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default <T extends Tup2fC> T addR(@MinLength(2) float[] v2, @ExtractionParam T res)
	{
		return Vec2fUtils.add(this, v2[0], v2[1], res);
	}
	
	/**
	 * Adds the given vector {@code (v2[0], v2[1])} to this vector and saves the result in the extraction parameter {@code res}.
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
	 * @param v2 The vector to add to this vector as an array with at least two entries.
	 * @param res The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default float[] addR(@MinLength(2) float[] v2, @ExtractionParam @MinLength(2) float[] res)
	{
		return Vec2fUtils.add(this, v2[0], v2[1], res);
	}
	
	/**
	 * Adds the given value {@code (value)} to every component of this vector and saves the result in the extraction parameter {@code res}.
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
	 * @param <T> The type of the extraction parameter.
	 * 
	 * @param value The value to add to this vector.
	 * @param res The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default <T extends Tup2fC> T addR(float value, @ExtractionParam T res)
	{
		return Vec2fUtils.add(this, value, value, res);
	}
	
	/**
	 * Adds the given value {@code (value)} to every component of this vector and saves the result in the extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v + (value, value)}
	 * 
	 * @param value The value to add to this vector.
	 * @param res The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default float[] addR(float value, @ExtractionParam @MinLength(2) float[] res)
	{
		return Vec2fUtils.add(this, value, value, res);
	}
	
	/**
	 * Adds the given vector {@code (v2x, v2y)} to this vector and saves the result in the extraction parameter {@code res}.
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
	 * @param <T> The type of the extraction parameter.
	 * 
	 * @param v2x The value of the x component to add to this vector.
	 * @param v2y The value of the y component to add to this vector.
	 * @param res The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default <T extends Tup2fC> T addR(float v2x, float v2y, @ExtractionParam T res)
	{
		return Vec2fUtils.add(this, v2x, v2y, res);
	}
	
	/**
	 * Adds the given vector {@code (v2x, v2y)} to this vector and saves the result in the extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v + (v2x, v2y)}
	 * 
	 * @param v2x The value of the x component to add to this vector.
	 * @param v2y The value of the y component to add to this vector.
	 * @param res The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default float[] addR(float v2x, float v2y, @ExtractionParam @MinLength(2) float[] res)
	{
		return Vec2fUtils.add(this, v2x, v2y, res);
	}
	
	/**
	 * Subtracts the given vector {@code (v2)} from this vector and saves the result in the extraction parameter {@code res}.
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
	 * @param <T> The type of the extraction parameter.
	 * 
	 * @param v2 The vector to subtract from this vector.
	 * @param res The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default <T extends Tup2fC> T subR(Tup2fR v2, @ExtractionParam T res)
	{
		return Vec2fUtils.sub(this, v2.getV0(), v2.getV1(), res);
	}
	
	/**
	 * Subtracts the given vector {@code (v2)} from this vector and saves the result in the extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v - v2}
	 * 
	 * @param v2 The vector to subtract from this vector.
	 * @param res The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default float[] subR(Tup2fR v2, @ExtractionParam @MinLength(2) float[] res)
	{
		return Vec2fUtils.sub(this, v2.getV0(), v2.getV1(), res);
	}
	
	/**
	 * Subtracts the given vector {@code (v2[0], v2[1])} from this vector and saves the result in the extraction parameter {@code res}.
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
	 * @param <T> The type of the extraction parameter.
	 * 
	 * @param v2 The vector to subtract from this vector as an array with at least two entries.
	 * @param res The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default <T extends Tup2fC> T subR(@MinLength(2) float[] v2, @ExtractionParam T res)
	{
		return Vec2fUtils.sub(this, v2[0], v2[1], res);
	}
	
	/**
	 * Subtracts the given vector {@code (v2[0], v2[1])} from this vector and saves the result in the extraction parameter {@code res}.
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

	 * @param v2 The vector to subtract from this vector as an array with at least two entries.
	 * @param res The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default float[] subR(@MinLength(2) float[] v2, @ExtractionParam @MinLength(2) float[] res)
	{
		return Vec2fUtils.sub(this, v2[0], v2[1], res);
	}
	
	/**
	 * Subtracts the given value {@code (value)} from every component of this vector and saves the result in the extraction parameter {@code res}.
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
	 * @param <T> The type of the extraction parameter.
	 * 
	 * @param value The value to subtract from this vector.
	 * @param res The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default <T extends Tup2fC> T subR(float value, @ExtractionParam T res)
	{
		return Vec2fUtils.sub(this, value, value, res);
	}
	
	/**
	 * Subtracts the given value {@code (value)} from every component of this vector and saves the result in the extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v - (value, value)}
	 * 
	 * @param value The value to subtract from this vector.
	 * @param res The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default float[] subR(float value, @ExtractionParam @MinLength(2) float[] res)
	{
		return Vec2fUtils.sub(this, value, value, res);
	}
	
	/**
	 * Subtracts the given vector {@code (v2x, v2y)} from this vector and saves the result in the extraction parameter {@code res}.
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
	 * @param <T> The type of the extraction parameter.
	 * 
	 * @param v2x The value of the x component to subtract from this vector.
	 * @param v2y The value of the y component to subtract from this vector.
	 * @param res The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default <T extends Tup2fC> T subR(float v2x, float v2y, @ExtractionParam T res)
	{
		return Vec2fUtils.sub(this, v2x, v2y, res);
	}
	
	/**
	 * Subtracts the given vector {@code (v2x, v2y)} from this vector and saves the result in the extraction parameter {@code res}.
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
	 * @param v2x The value of the x component to subtract from this vector.
	 * @param v2y The value of the y component to subtract from this vector.
	 * @param res The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default float[] subR(float v2x, float v2y, @ExtractionParam @MinLength(2) float[] res)
	{
		return Vec2fUtils.sub(this, v2x, v2y, res);
	}
	
	/**
	 * Subtracts this vector from the given vector {@code (v2)} and saves the result in the extraction parameter {@code res}.
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
	 * @param <T> The type of the extraction parameter.
	 * 
	 * @param v2 The vector this vector is subtracted from.
	 * @param res The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default <T extends Tup2fC> T revSubR(Tup2fR v2, @ExtractionParam T res)
	{
		return Vec2fUtils.revSub(this, v2.getV0(), v2.getV1(), res);
	}
	
	/**
	 * Subtracts this vector from the given vector {@code (v2)} and saves the result in the extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v2 - v}
	 * 
	 * @param v2 The vector this vector is subtracted from.
	 * @param res The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default float[] revSubR(Tup2fR v2, @ExtractionParam @MinLength(2) float[] res)
	{
		return Vec2fUtils.revSub(this, v2.getV0(), v2.getV1(), res);
	}
	
	/**
	 * Subtracts this vector from the given vector {@code (v2[0], v2[1])} and saves the result in the extraction parameter {@code res}.
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
	 * @param <T> The type of the extraction parameter.
	 * 
	 * @param v2 The vector this vector is subtracted from as an array with at least two entries.
	 * @param res The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default <T extends Tup2fC> T revSubR(@MinLength(2) float[] v2, @ExtractionParam T res)
	{
		return Vec2fUtils.revSub(this, v2[0], v2[1], res);
	}
	
	/**
	 * Subtracts this vector from the given vector {@code (v2[0], v2[1])} and saves the result in the extraction parameter {@code res}.
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
	 * @param v2 The vector this vector is subtracted from as an array with at least two entries.
	 * @param res The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default float[] revSubR(@MinLength(2) float[] v2, @ExtractionParam @MinLength(2) float[] res)
	{
		return Vec2fUtils.revSub(this, v2[0], v2[1], res);
	}
	
	/**
	 * Subtracts every component of this vector from the given value {@code (value)} and saves the result in the extraction parameter {@code res}.
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
	 * @param <T> The type of the extraction parameter.
	 * 
	 * @param value The value this vector is subtracted from.
	 * @param res The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default <T extends Tup2fC> T revSubR(float value, @ExtractionParam T res)
	{
		return Vec2fUtils.revSub(this, value, value, res);
	}
		
	/**
	 * Subtracts every component of this vector from the given value {@code (value)} and saves the result in the extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (value, value) - v}
	 * 
	 * @param value The value this vector is subtracted from.
	 * @param res The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default float[] revSubR(float value, @ExtractionParam @MinLength(2) float[] res)
	{
		return Vec2fUtils.revSub(this, value, value, res);
	}
	
	/**
	 * Subtracts this vector from the given vector {@code (v2x, v2y)} and saves the result in the extraction parameter {@code res}.
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
	 * @param <T> The type of the extraction parameter.
	 * 
	 * @param v2x The value of the x component this vector is subtracted from.
	 * @param v2y The value of the y component this vector is subtracted from.
	 * @param res The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default <T extends Tup2fC> T revSubR(float v2x, float v2y, @ExtractionParam T res)
	{
		return Vec2fUtils.revSub(this, v2x, v2y, res);
	}
	
	/**
	 * Subtracts this vector from the given vector {@code (v2x, v2y)} and saves the result in the extraction parameter {@code res}.
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
	 * @param res The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default float[] revSubR(float v2x, float v2y, @ExtractionParam @MinLength(2) float[] res)
	{
		return Vec2fUtils.revSub(this, v2x, v2y, res);
	}
	
	/**
	 * Multiplies this vector with the given vector {@code (v2)} and saves the result in the extraction parameter {@code res}.
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
	 * @param <T> The type of the extraction parameter.
	 * 
	 * @param v2 The vector to multiply this vector with.
	 * @param res The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default <T extends Tup2fC> T mulR(Tup2fR v2, @ExtractionParam T res)
	{
		return Vec2fUtils.mul(this, v2, res);
	}
	
	/**
	 * Multiplies this vector with the given vector {@code (v2)} and saves the result in the extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v * v2}
	 * 
	 * @param v2 The vector to multiply this vector with.
	 * @param res The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default float[] mulR(Tup2fR v2, @ExtractionParam @MinLength(2) float[] res)
	{
		return Vec2fUtils.mul(this, v2, res);
	}
	
	/**
	 * Multiplies this vector with the given vector {@code (v2[0], v2[1])} and saves the result in the extraction parameter {@code res}.
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
	 * @param <T> The type of the extraction parameter.
	 * 
	 * @param v2 The vector to multiply this vector with as an array with at least two entries.
	 * @param res The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default <T extends Tup2fC> T mulR(@MinLength(2) float[] v2, @ExtractionParam T res)
	{
		return Vec2fUtils.mul(this, v2, res);
	}
	
	/**
	 * Multiplies this vector with the given vector {@code (v2[0], v2[1])} and saves the result in the extraction parameter {@code res}.
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
	 * @param v2 The vector to multiply this vector with as an array with at least two entries.
	 * @param res The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default float[] mulR(@MinLength(2) float[] v2, @ExtractionParam @MinLength(2) float[] res)
	{
		return Vec2fUtils.mul(this, v2, res);
	}
	
	/**
	 * Multiplies every component of this vector with the given value {@code (value)} and saves the result in the extraction parameter {@code res}.
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
	 * @param <T> The type of the extraction parameter.
	 * 
	 * @param value The value to multiply this vector with.
	 * @param res The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default <T extends Tup2fC> T mulR(float value, @ExtractionParam T res)
	{
		return Vec2fUtils.mul(this, value, value, res);
	}
	
	/**
	 * Multiplies every component of this vector with the given value {@code (value)} and saves the result in the extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v * (value, value)}
	 * 
	 * @param value The value to multiply this vector with.
	 * @param res The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default float[] mulR(float value, @ExtractionParam @MinLength(2) float[] res)
	{
		return Vec2fUtils.mul(this, value, value, res);
	}
	
	/**
	 * Multiplies this vector with the given vector {@code (v2x, v2y)} and saves the result in the extraction parameter {@code res}.
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
	 * @param <T> The type of the extraction parameter.
	 * 
	 * @param v2x The value of the x component to multiply this vector with.
	 * @param v2y The value of the y component to multiply this vector with.
	 * @param res The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default <T extends Tup2fC> T mulR(float v2x, float v2y, @ExtractionParam T res)
	{
		return Vec2fUtils.mul(this, v2x, v2y, res);
	}
	
	/**
	 * Multiplies this vector with the given vector {@code (v2x, v2y)} and saves the result in the extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v * (v2x, v2y)}
	 * 
	 * @param v2x The value of the x component to multiply this vector with.
	 * @param v2y The value of the y component to multiply this vector with.
	 * @param res The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default float[] mulR(float v2x, float v2y, @ExtractionParam @MinLength(2) float[] res)
	{
		return Vec2fUtils.mul(this, v2x, v2y, res);
	}
	
	/**
	 * Divides this vector by the given vector {@code (v2)} and saves the result in the extraction parameter {@code res}.
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
	 * @param <T> The type of the extraction parameter.
	 * 
	 * @param v2 The vector to divide this vector by.
	 * @param res The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default <T extends Tup2fC> T divR(Tup2fR v2, @ExtractionParam T res)
	{
		return Vec2fUtils.div(this, v2, res);
	}
	
	/**
	 * Divides this vector by the given vector {@code (v2)} and saves the result in the extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v / v2}
	 * 
	 * @param v2 The vector to divide this vector by.
	 * @param res The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default float[] divR(Tup2fR v2, @ExtractionParam @MinLength(2) float[] res)
	{
		return Vec2fUtils.div(this, v2, res);
	}
	
	/**
	 * Divides this vector by the given vector {@code (v2[0], v2[1])} and saves the result in the extraction parameter {@code res}.
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
	 * @param <T> The type of the extraction parameter.
	 * 
	 * @param v2 The vector to divide this vector by as an array with at least two entries.
	 * @param res The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default <T extends Tup2fC> T divR(@MinLength(2) float[] v2, @ExtractionParam T res)
	{
		return Vec2fUtils.div(this, v2, res);
	}
	
	/**
	 * Divides this vector by the given vector {@code (v2[0], v2[1])} and saves the result in the extraction parameter {@code res}.
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
	 * @param v2 The vector to divide this vector by as an array with at least two entries.
	 * @param res The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default float[] divR(@MinLength(2) float[] v2, @ExtractionParam @MinLength(2) float[] res)
	{
		return Vec2fUtils.div(this, v2, res);
	}
	
	/**
	 * Divides each component of this vector by the given value {@code (value)} and saves the result in the extraction parameter {@code res}.
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
	 * @param <T> The type of the extraction parameter.
	 * 
	 * @param value The value to divide this vector by.
	 * @param res The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default <T extends Tup2fC> T divR(float value, @ExtractionParam T res)
	{
		return Vec2fUtils.div(this, value, value, res);
	}
	
	/**
	 * Divides each component of this vector by the given value {@code (value)} and saves the result in the extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v / (value, value)}
	 * 
	 * @param value The value to divide this vector by.
	 * @param res The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default float[] divR(float value, @ExtractionParam @MinLength(2) float[] res)
	{
		return Vec2fUtils.div(this, value, value, res);
	}
	
	/**
	 * Divides this vector by the given vector {@code (v2x, v2y)} and saves the result in the extraction parameter {@code res}.
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
	 * @param <T> The type of the extraction parameter.
	 * 
	 * @param v2x The value of the x component to divide this vector by.
	 * @param v2y The value of the y component to divide this vector by.
	 * @param res The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default <T extends Tup2fC> T divR(float v2x, float v2y, @ExtractionParam T res)
	{
		return Vec2fUtils.div(this, v2x, v2y, res);
	}

	/**
	 * Divides this vector by the given vector {@code (v2x, v2y)} and saves the result in the extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v / (v2x, v2y)}
	 * 
	 * @param v2x The value of the x component to divide this vector by.
	 * @param v2y The value of the y component to divide this vector by.
	 * @param res The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default float[] divR(float v2x, float v2y, @ExtractionParam @MinLength(2) float[] res)
	{
		return Vec2fUtils.div(this, v2x, v2y, res);
	}
	
	/**
	 * Divides the given vector {@code (v2)} by this vector and saves the result in the extraction parameter {@code res}.
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
	 * @param <T> The type of the extraction parameter.
	 * 
	 * @param v2 The vector to divide by this vector.
	 * @param res The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default <T extends Tup2fC> T revDivR(Tup2fR v2, @ExtractionParam T res)
	{
		return Vec2fUtils.revDiv(this, v2, res);
	}

	/**
	 * Divides the given vector {@code (v2)} by this vector and saves the result in the extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v2 / v}
	 * 
	 * @param v2 The vector to divide by this vector.
	 * @param res The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default float[] revDivR(Tup2fR v2, @ExtractionParam float[] res)
	{
		return Vec2fUtils.revDiv(this, v2, res);
	}
	
	/**
	 * Divides the given vector {@code (v2[0], v2[1])} by this vector and saves the result in the extraction parameter {@code res}.
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
	 * @param <T> The type of the extraction parameter.
	 * 
	 * @param v2 The vector to divide by this vector as an array with at least two entries.
	 * @param res The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default <T extends Tup2fC> T revDivR(@MinLength(2) float[] v2, @ExtractionParam T res)
	{
		return Vec2fUtils.revDiv(this, v2, res);
	}
	
	/**
	 * Divides the given vector {@code (v2[0], v2[1])} by this vector and saves the result in the extraction parameter {@code res}.
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
	 * @param v2 The vector to divide by this vector as an array with at least two entries.
	 * @param res The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default float[] revDivR(@MinLength(2) float[] v2, @ExtractionParam @MinLength(2) float[] res)
	{
		return Vec2fUtils.revDiv(this, v2, res);
	}
	
	/**
	 * Divides the given value {@code (value)} by each component of this vector and saves the result in the extraction parameter {@code res}.
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
	 * @param <T> The type of the extraction parameter.
	 * 
	 * @param value The value to divide by this vector.
	 * @param res The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default <T extends Tup2fC> T revDivR(float value, @ExtractionParam T res)
	{
		return Vec2fUtils.revDiv(this, value, value, res);
	}

	/**
	 * Divides the given value {@code (value)} by each component of this vector and saves the result in the extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (value, value) / v}
	 * 
	 * @param value The value to divide by this vector.
	 * @param res The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default float[] revDivR(float value, @ExtractionParam @MinLength(2) float[] res)
	{
		return Vec2fUtils.revDiv(this, value, value, res);
	}
	
	/**
	 * Divides the given vector {@code (v2x, v2y)} by this vector and saves the result in the extraction parameter {@code res}.
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
	 * @param <T> The type of the extraction parameter.
	 * 
	 * @param v2x The value of the x component to divide by this vector.
	 * @param v2y The value of the y component to divide by this vector.
	 * @param res The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default <T extends Tup2fC> T revDivR(float v2x, float v2y, @ExtractionParam T res)
	{
		return Vec2fUtils.revDiv(this, v2x, v2y, res);
	}
	
	/**
	 * Divides the given vector {@code (v2x, v2y)} by this vector and saves the result in the extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2x, v2y) / v}
	 * 
	 * @param v2x The value of the x component to divide by this vector.
	 * @param v2y The value of the y component to divide by this vector.
	 * @param res The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default float[] revDivR(float v2x, float v2y, @ExtractionParam @MinLength(2) float[] res)
	{
		return Vec2fUtils.revDiv(this, v2x, v2y, res);
	}
	
	/**
	 * Returns half the vector from the endpoint of this vector to the endpoint of the given vector {@code (v2)} as the extraction parameter {@code res}.
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
	 * @param <T> The type of the extraction parameter.
	 * 
	 * @param v2 The second vector.
	 * @param res The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default <T extends Tup2fC> T halfVectorToR(Tup2fR v2, @ExtractionParam T res)
	{
		return Vec2fUtils.halfVectorTo(this, v2, res);
	}
	
	/**
	 * Returns half the vector from the endpoint of this vector to the endpoint of the given vector {@code (v2)} as the extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ( v2 - v ) / 2}
	 * 
	 * @param v2 The second vector.
	 * @param res The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default float[] halfVectorToR(Tup2fR v2, @ExtractionParam @MinLength(2) float[] res)
	{
		return Vec2fUtils.halfVectorTo(this, v2, res);
	}
	
	/**
	 * Returns half the vector from the endpoint of this vector to the endpoint of the given vector {@code (v2[0], v2[1])} as the extraction parameter {@code res}.
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
	 * @param <T> The type of the extraction parameter.
	 * 
	 * @param v2 The second vector as an array with at least two entries.
	 * @param res The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default <T extends Tup2fC> T halfVectorToR(@MinLength(2) float[] v2, @ExtractionParam T res)
	{
		return Vec2fUtils.halfVectorTo(this, v2, res);
	}
	
	/**
	 * Returns half the vector from the endpoint of this vector to the endpoint of the given vector {@code (v2[0], v2[1])} as the extraction parameter {@code res}.
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
	 * @param v2 The second vector as an array with at least two entries.
	 * @param res The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default float[] halfVectorToR(@MinLength(2) float[] v2, @ExtractionParam @MinLength(2) float[] res)
	{
		return Vec2fUtils.halfVectorTo(this, v2, res);
	}
	
	/**
	 * Returns half the vector from the endpoint of this vector to the endpoint of the given vector {@code (v2x, v2y)} as the extraction parameter {@code res}.
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
	 * @param <T> The type of the extraction parameter.
	 * 
	 * @param v2x The value of the x component of the second vector.
	 * @param v2y The value of the y component of the second vector.
	 * @param res The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default <T extends Tup2fC> T halfVectorToR(float v2x, float v2y, @ExtractionParam T res)
	{
		return Vec2fUtils.halfVectorTo(this, v2x, v2y, res);
	}
	
	/**
	 * Returns half the vector from the endpoint of this vector to the endpoint of the given vector {@code (v2x, v2y)} as the extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ( (v2x, v2y) - v ) / 2}
	 * 
	 * @param v2x The value of the x component of the second vector.
	 * @param v2y The value of the y component of the second vector.
	 * @param res The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default float[] halfVectorToR(float v2x, float v2y, @ExtractionParam @MinLength(2) float[] res)
	{
		return Vec2fUtils.halfVectorTo(this, v2x,  v2y, res);
	}
	
	/**
	 * Returns the origin vector to the point that lies half way between the endpoint of this vector and the endpoint of the given vector {@code (v2)} as
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
	 * {@code ( v2 + v ) / 2}
	 * 
	 * @param <T> The type of the extraction parameter.
	 * 
	 * @param v2 The second vector.
	 * @param res The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default <T extends Tup2fC> T halfPointBetweenR(Tup2fR v2, @ExtractionParam T res)
	{
		return Vec2fUtils.halfPointBetween(this, v2, res);
	}
	
	/**
	 * Returns the origin vector to the point that lies half way between the endpoint of this vector and the endpoint of the given vector {@code (v2)} as
	 * the extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ( v2 + v ) / 2}
	 * 
	 * @param v2 The second vector.
	 * @param res The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default float[] halfPointBetweenR(Tup2fR v2, @ExtractionParam @MinLength(2) float[] res)
	{
		return Vec2fUtils.halfPointBetween(this, v2, res);
	}
	
	/**
	 * Returns the origin vector to the point that lies half way between the endpoint of this vector and the endpoint of the given vector {@code (v2[0], v2[1])} as
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
	 * {@code ( (v2[0], v2[1]) + v ) / 2}
	 * 
	 * @param <T> The type of the extraction parameter.
	 * 
	 * @param v2 The second vector as an array with at least two entries.
	 * @param res The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default <T extends Tup2fC> T halfPointBetweenR(@MinLength(2) float[] v2, @ExtractionParam T res)
	{
		return Vec2fUtils.halfPointBetween(this, v2, res);
	}
	
	/**
	 * Returns the origin vector to the point that lies half way between the endpoint of this vector and the endpoint of the given vector {@code (v2[0], v2[1])} as
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
	 * {@code ( (v2[0], v2[1]) + v ) / 2}
	 * 
	 * @param v2 The second vector as an array with at least two entries.
	 * @param res The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default float[] halfPointBetweenR(@MinLength(2) float[] v2, @ExtractionParam @MinLength(2) float[] res)
	{
		return Vec2fUtils.halfPointBetween(this, v2, res);
	}
	
	/**
	 * Returns the origin vector to the point that lies half way between the endpoint of this vector and the endpoint of the given vector {@code (v2x, v2y)} as
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
	 * {@code ( (v2x, v2y) + v ) / 2}
	 * 
	 * @param <T> The type of the extraction parameter.
	 * 
	 * @param v2x The value of the x component of the second vector.
	 * @param v2y The value of the y component of the second vector.
	 * @param res The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default <T extends Tup2fC> T halfPointBetweenR(float v2x, float v2y, @ExtractionParam T res)
	{
		return Vec2fUtils.halfPointBetween(this, v2x, v2y, res);
	}
	
	/**
	 * Returns the origin vector to the point that lies half way between the endpoint of this vector and the endpoint of the given vector {@code (v2x, v2y)} as
	 * the extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ( (v2x, v2y) + v ) / 2}
	 * 
	 * @param v2x The value of the x component of the second vector.
	 * @param v2y The value of the y component of the second vector.
	 * @param res The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default float[] halfPointBetweenR(float v2x, float v2y, @ExtractionParam @MinLength(2) float[] res)
	{
		return Vec2fUtils.halfPointBetween(this, v2x, v2y, res);
	}
	
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
	 * @param <T> The type of the extraction parameter.
	 * 
	 * @param res The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default <T extends Tup2fC> T negateR(@ExtractionParam T res)
	{
		return Vec2fUtils.negate(this, res);
	}
	
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
	 * @param res The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default float[] negateR(@ExtractionParam @MinLength(2) float[] res)
	{
		return Vec2fUtils.negate(this, res);
	}
	
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
	 * @param <T> The type of the extraction parameter.
	 * 
	 * @param res The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default <T extends Tup2fC> T inverseR(@ExtractionParam T res)
	{
		return Vec2fUtils.inverse(this, res);
	}
	
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
	 * @param res The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default float[] inverseR(@ExtractionParam @MinLength(2) float[] res)
	{
		return Vec2fUtils.inverse(this, res);
	}
	
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
	 * @param <T> The type of the extraction parameter.
	 * 
	 * @param res The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default <T extends Tup2fC> T normalizeR(@ExtractionParam T res)
	{
		return Vec2fUtils.normalize(this, res);
	}
	
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
	 * @param res The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default float[] normalizeR(@ExtractionParam @MinLength(2) float[] res)
	{
		return Vec2fUtils.normalize(this, res);
	}
	
	/**
	 * Compares each component of this vector with the corresponding component of the given vector {@code (v2)} and
	 * returns the smallest values as the extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * It is safe to use this vector as the extraction parameter.
	 * 
	 * @param <T> The type of the extraction parameter.
	 * 
	 * @param v2 The second vector.
	 * @param res The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default <T extends Tup2fC> T minVectorR(Tup2fR v2, @ExtractionParam T res)
	{
		return Vec2fUtils.minVector(this, v2, res);
	}
	
	/**
	 * Compares each component of this vector with the corresponding component of the given vector {@code (v2)} and
	 * returns the smallest values as the extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * @param v2 The second vector.
	 * @param res The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default float[] minVectorR(Tup2fR v2, @ExtractionParam @MinLength(2) float[] res)
	{
		return Vec2fUtils.minVector(this, v2, res);
	}
	
	/**
	 * Compares each component of this vector with the corresponding component of the given vector {@code (v2[0], v2[1])} and
	 * returns the smallest values as the extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * It is safe to use this vector as the extraction parameter.
	 * 
	 * @param <T> The type of the extraction parameter.
	 * 
	 * @param v2 The second vector as an array with at least two entries.
	 * @param res The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default <T extends Tup2fC> T minVectorR(@MinLength(2) float[] v2, @ExtractionParam T res)
	{
		return Vec2fUtils.minVector(this, v2, res);
	}
	
	/**
	 * Compares each component of this vector with the corresponding component of the given vector {@code (v2[0], v2[1])} and
	 * returns the smallest values as the extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * It is safe to use the given vector {@code v2} as the extraction parameter.
	 * 
	 * @param v2 The second vector as an array with at least two entries.
	 * @param res The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default float[] minVectorR(@MinLength(2) float[] v2, @ExtractionParam @MinLength(2) float[] res)
	{
		return Vec2fUtils.minVector(this, v2, res);
	}
	
	/**
	 * Compares each component of this vector with the corresponding component of the given vector {@code (v2x, v2y)} and
	 * returns the smallest values as the extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * It is safe to use this vector as the extraction parameter.
	 * 
	 * @param <T> The type of the extraction parameter.
	 * 
	 * @param v2x The value of the x component of the second vector.
	 * @param v2y The value of the y component of the second vector.
	 * @param res The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default <T extends Tup2fC> T minVectorR(float v2x, float v2y, @ExtractionParam T res)
	{
		return Vec2fUtils.minVector(this, v2x, v2y, res);
	}
	
	/**
	 * Compares each component of this vector with the corresponding component of the given vector {@code (v2x, v2y)} and
	 * returns the smallest values as the extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * @param v2x The value of the x component of the second vector.
	 * @param v2y The value of the y component of the second vector.
	 * @param res The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default float[] minVectorR(float v2x, float v2y, @ExtractionParam @MinLength(2) float[] res)
	{
		return Vec2fUtils.minVector(this, v2x, v2y, res);
	}
	
	/**
	 * Compares each component of this vector with the corresponding component of the given vector {@code (v2)} and
	 * returns the greatest values as the extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * It is safe to use this vector as the extraction parameter.
	 * 
	 * @param <T> The type of the extraction parameter.
	 * 
	 * @param v2 The second vector.
	 * @param res The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default <T extends Tup2fC> T maxVectorR(Tup2fR v2, @ExtractionParam T res)
	{
		return Vec2fUtils.maxVector(this,  v2, res);
	}
	
	/**
	 * Compares each component of this vector with the corresponding component of the given vector {@code (v2)} and
	 * returns the greatest values as the extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * @param v2 The second vector.
	 * @param res The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default float[] maxVectorR(Tup2fR v2, @ExtractionParam @MinLength(2) float[] res)
	{
		return Vec2fUtils.maxVector(this, v2, res);
	}
	
	/**
	 * Compares each component of this vector with the corresponding component of the given vector {@code (v2[0], v2[1])} and
	 * returns the greatest values as the extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * It is safe to use this vector as the extraction parameter.
	 * 
	 * @param <T> The type of the extraction parameter.
	 * 
	 * @param v2 The second vector as an array with at least two entries.
	 * @param res The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default <T extends Tup2fC> T maxVectorR(@MinLength(2) float[] v2, @ExtractionParam T res)
	{
		return Vec2fUtils.maxVector(this, v2, res);
	}
	
	/**
	 * Compares each component of this vector with the corresponding component of the given vector {@code (v2[0], v2[1])} and
	 * returns the greatest values as the extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * It is safe to use the given vector {@code v2} as the extraction parameter.
	 * 
	 * @param v2 The second vector as an array with at least two entries.
	 * @param res The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default float[] maxVectorR(@MinLength(2) float[] v2, @ExtractionParam @MinLength(2) float[] res)
	{
		return Vec2fUtils.maxVector(this, v2, res);
	}
	
	/**
	 * Compares each component of this vector with the corresponding component of the given vector {@code (v2x, v2y)} and
	 * returns the greatest values as the extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * It is safe to use this vector as the extraction parameter.
	 * 
	 * @param <T> The type of the extraction parameter.
	 * 
	 * @param v2x The value of the x component of the second vector.
	 * @param v2y The value of the y component of the second vector.
	 * @param res The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default <T extends Tup2fC> T maxVectorR(float v2x, float v2y, @ExtractionParam T res)
	{
		return Vec2fUtils.maxVector(this, v2x, v2y, res);
	}
	
	/**
	 * Compares each component of this vector with the corresponding component of the given vector {@code (v2x, v2y)} and
	 * returns the greatest values as the extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * @param v2x The value of the x component of the second vector.
	 * @param v2y The value of the y component of the second vector.
	 * @param res The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default float[] maxVectorR(float v2x, float v2y, @ExtractionParam @MinLength(2) float[] res)
	{
		return Vec2fUtils.maxVector(this, v2x, v2y, res);
	}
	
	/**
	 * Rotates this vector by the given angle in radians and saves the result in the given extraction parameter object.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for calculation.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * It is safe to use this vector as the extraction parameter.
	 * 
	 * @param <T> The type of the extraction parameter.
	 * 
	 * @param angle The angle in radians.
	 * @param res The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	default <T extends Tup2fC> T rotateRadR(float angle, @ExtractionParam T res)
	{
		return Vec2fUtils.rotateRad(this, angle, res);
	}
	
	/**
	 * Rotates this vector by the given angle in radians and saves the result in the given extraction parameter object.
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
	 * @param <T> The type of the extraction parameter.
	 * 
	 * @param angle The angle in radians.
	 * @param mathProvider The provider of fundamental math functions that should be used for calculation.
	 * @param res The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	default <T extends Tup2fC> T rotateRadR(float angle, MathProvider mathProvider, @ExtractionParam T res)
	{
		return Vec2fUtils.rotateRad(this, angle, mathProvider, res);
	}
	
	/**
	 * Rotates this vector by the given angle in radians and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for calculation.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * 
	 * @param angle The angle in radians.
	 * @param res The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default float[] rotateRadR(float angle, @ExtractionParam @MinLength(2) float[] res)
	{
		return Vec2fUtils.rotateRad(this, angle, res);
	}
	
	/**
	 * Rotates this vector by the given angle in radians and saves the result in the given extraction parameter.
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
	 * @param angle The angle in radians.
	 * @param mathProvider The provider of fundamental math functions that should be used for calculation.
	 * @param res The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default float[] rotateRadR(float angle, MathProvider mathProvider, @ExtractionParam @MinLength(2) float[] res)
	{
		return Vec2fUtils.rotateRad(this, angle, mathProvider, res);
	}
	
	/**
	 * Rotates this vector by the given angle in degrees and saves the result in the given extraction parameter object.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for calculation.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * It is safe to use this vector as the extraction parameter.
	 * 
	 * @param <T> The type of the extraction parameter.
	 * 
	 * @param angle The angle in radians.
	 * @param res The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	default <T extends Tup2fC> T rotateDegR(float angle, @ExtractionParam T res)
	{
		return Vec2fUtils.rotateDeg(this, angle, res);
	}
	
	/**
	 * Rotates this vector by the given angle in degrees and saves the result in the given extraction parameter object.
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
	 * @param <T> The type of the extraction parameter.
	 * 
	 * @param angle The angle in radians.
	 * @param mathProvider The provider of fundamental math functions that should be used for calculation.
	 * @param res The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	default <T extends Tup2fC> T rotateDegR(float angle, MathProvider mathProvider, @ExtractionParam T res)
	{
		return Vec2fUtils.rotateDeg(this, angle, mathProvider, res);
	}
	
	/**
	 * Rotates this vector by the given angle in degrees and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for calculation.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * 
	 * @param angle The angle in radians.
	 * @param res The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default float[] rotateDegR(float angle, @ExtractionParam @MinLength(2) float[] res)
	{
		return Vec2fUtils.rotateDeg(this, angle, res);
	}
	
	/**
	 * Rotates this vector by the given angle in degrees and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * 
	 * @param angle The angle in radians.
	 * @param mathProvider The provider of fundamental math functions that should be used for calculation.
	 * @param res The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default float[] rotateDegR(float angle, MathProvider mathProvider, @ExtractionParam @MinLength(2) float[] res)
	{
		return Vec2fUtils.rotateDeg(this, angle, mathProvider, res);
	}
	
	/**
	 * Calculates the orthogonal projection of this vector onto the normalized target vector {@code (t)}
	 * and saves the result in the given extraction parameter object.
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
	 * @param <T> The type of the extraction parameter.
	 * 
	 * @param t The projection target vector.
	 * @param res The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	default <T extends Tup2fC> T projectR(Tup2fR t, @ExtractionParam T res)
	{
		return Vec2fUtils.project(this, t, res);
	}
	
	/**
	 * Calculates the orthogonal projection of this vector onto the normalized target vector {@code (t[0], t[1])}
	 * and saves the result in the given extraction parameter object.
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
	 * @param <T> The type of the extraction parameter.
	 * 
	 * @param t The projection target vector as an array with at least two entries.
	 * @param res The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	default <T extends Tup2fC> T projectR(@MinLength(2) float[] t, @ExtractionParam T res)
	{
		return Vec2fUtils.project(this, t, res);
	}
	
	/**
	 * Calculates the orthogonal projection of this vector onto the normalized target vector {@code (tX, tY)}
	 * and saves the result in the given extraction parameter object.
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
	 * @param <T> The type of the extraction parameter.
	 * 
	 * @param tX The value of the x component of the projection target vector.
	 * @param tY The value of the y component of the projection target vector.
	 * @param res The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	default <T extends Tup2fC> T projectR(float tX, float tY, @ExtractionParam T res)
	{
		return Vec2fUtils.project(this, tX, tY, res);
	}
	
	/**
	 * Calculates the orthogonal projection of this vector onto the normalized target vector {@code (t)}
	 * and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code t * (v . t)}
	 * 
	 * @param t The projection target vector.
	 * @param res The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default float[] projectR(Tup2fR t, @ExtractionParam @MinLength(2) float[] res)
	{
		return Vec2fUtils.project(this, t, res);
	}
	
	/**
	 * Calculates the orthogonal projection of this vector onto the normalized target vector {@code (t[0], t[1])}
	 * and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (t[0], t[1]) * (v . (t[0], t[1]))}
	 * 
	 * @param t The projection target vector as an array with at least two entries.
	 * @param res The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default float[] projectR(@MinLength(2) float[] t, @ExtractionParam @MinLength(2) float[] res)
	{
		return Vec2fUtils.project(this, t, res);
	}
	
	/**
	 * Calculates the orthogonal projection of this vector onto the normalized target vector {@code (tX, tY)}
	 * and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (tX, tY) * (v . (tX, tY))}
	 * 
	 * @param tX The value of the x component of the projection target vector.
	 * @param tY The value of the y component of the projection target vector.
	 * @param res The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default float[] projectR(float tX, float tY, @ExtractionParam @MinLength(2) float[] res)
	{
		return Vec2fUtils.project(this, tX, tY, res);
	}
	
	/**
	 * Calculates the reflection of this vector based on the given normalized surface normal {@code (n)}
	 * and saves the result in the given extraction parameter object.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * It is safe to use this vector as the extraction parameter.
	 * 
	 * @param <T> The type of the extraction parameter.
	 * 
	 * @param n The surface normal vector.
	 * @param res The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	default <T extends Tup2fC> T reflectR(Tup2fR n, @ExtractionParam T res)
	{
		return Vec2fUtils.reflect(this,  n, res);
	}
	
	/**
	 * Calculates the reflection of this vector based on the given normalized surface normal {@code (n[0], n[1])}
	 * and saves the result in the given extraction parameter object.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * It is safe to use this vector as the extraction parameter.
	 * 
	 * @param <T> The type of the extraction parameter.
	 * 
	 * @param n The surface normal vector as an array with at least two entries.
	 * @param res The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	default <T extends Tup2fC> T reflectR(@MinLength(2) float[] n, @ExtractionParam T res)
	{
		return Vec2fUtils.reflect(this, n, res);
	}
	
	/**
	 * Calculates the reflection of this vector based on the given normalized surface normal {@code (nX, nY)}
	 * and saves the result in the given extraction parameter object.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * It is safe to use this vector as the extraction parameter.
	 * 
	 * @param <T> The type of the extraction parameter.
	 * 
	 * @param nX The value of the x component of the surface normal vector.
	 * @param nY The value of the y component of the surface normal vector.
	 * @param res The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	default <T extends Tup2fC> T reflectR(float nX, float nY, @ExtractionParam T res)
	{
		return Vec2fUtils.reflect(this, nX, nY, res);
	}
	
	/**
	 * Calculates the reflection of this vector based on the given normalized surface normal {@code (n)}
	 * and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * @param n The surface normal vector.
	 * @param res The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default float[] reflectR(Tup2fR n, @ExtractionParam @MinLength(2) float[] res)
	{
		return Vec2fUtils.reflect(this, n, res);
	}
	
	/**
	 * Calculates the reflection of this vector based on the given normalized surface normal {@code (n[0], n[1])}
	 * and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * @param n The surface normal vector as an array with at least two entries.
	 * @param res The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default float[] reflectR(@MinLength(2) float[] n, @ExtractionParam @MinLength(2) float[] res)
	{
		return Vec2fUtils.reflect(this, n, res);
	}
	
	/**
	 * Calculates the reflection of this vector based on the given normalized surface normal {@code (nX, nY)}
	 * and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * @param nX The value of the x component of the surface normal vector.
	 * @param nY The value of the y component of the surface normal vector.
	 * @param res The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default float[] reflectR(float nX, float nY, @ExtractionParam @MinLength(2) float[] res)
	{
		return Vec2fUtils.reflect(this, nX, nY, res);
	}
	
	/**
	 * Rounds the components of this vector towards the next greater integer and saves the result in the given extraction parameter object.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * @param <T> The type of the extraction parameter object.
	 * 
	 * @param res The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	default <T extends Tup2fC> T ceilR(@ExtractionParam T res)
	{
		return Vec2fUtils.ceil(this, res);
	}
	
	/**
	 * Rounds the components of this vector towards the next greater integer and saves the result in the extraction parameter.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * @param res The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default float[] ceilR(@ExtractionParam @MinLength(2) float[] res)
	{
		return Vec2fUtils.ceil(this, res);
	}
	
	/**
	 * Rounds the components of this vector towards the next smaller integer and saves the result in the given extraction parameter object.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * @param <T> The type of the extraction parameter object.
	 * 
	 * @param res The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	default <T extends Tup2fC> T floorR(@ExtractionParam T res)
	{
		return Vec2fUtils.floor(this, res);
	}
	
	/**
	 * Rounds the components of this vector towards the next smaller integer and saves the result in the extraction parameter.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * @param res The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default float[] floorR(@ExtractionParam @MinLength(2) float[] res)
	{
		return Vec2fUtils.floor(this, res);
	}
	
	/**
	 * Rounds the components of this vector and saves the result in the given extraction parameter object.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * @param <T> The type of the extraction parameter object.
	 * 
	 * @param res The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	default <T extends Tup2fC> T roundR(@ExtractionParam T res)
	{
		return Vec2fUtils.round(this, res);
	}
	
	/**
	 * Rounds the components of this vector and saves the result in the extraction parameter.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * @param res The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default float[] roundR(@ExtractionParam @MinLength(2) float[] res)
	{
		return Vec2fUtils.round(this, res);
	}
	
	/**
	 * Truncates the decimals of the components of this vector and saves the result in the given extraction parameter object.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * @param <T> The type of the extraction parameter object.
	 * 
	 * @param res The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	default <T extends Tup2fC> T truncR(@ExtractionParam T res)
	{
		return Vec2fUtils.trunc(this, res);
	}
	
	/**
	 * Truncates the decimals of the components of this vector and saves the result in the extraction parameter.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * @param res The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default float[] truncR(@ExtractionParam @MinLength(2) float[] res)
	{
		return Vec2fUtils.trunc(this, res);
	}
	
	/**
	 * Rounds the components of this vector using the given method and saves the result in the given extraction parameter object.
	 * 
	 * @param <T> The type of the extraction parameter object.
	 * 
	 * @param method The Method to use for rounding.
	 * @param res The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	default <T extends Tup2fC> T roundR(FloatRoundMethod method, @ExtractionParam T res)
	{
		return Vec2fUtils.round(this, method, res);
	}
	
	/**
	 * Rounds the components of this vector using the given method and saves the result in the extraction parameter.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * @param method The Method to use for rounding.
	 * @param res The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default float[] roundR(FloatRoundMethod method, @ExtractionParam @MinLength(2) float[] res)
	{
		return Vec2fUtils.round(this, method, res);
	}
	
	/**
	 * Calculates the absolute values of the component values and saves the result in the extraction parameter.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * @param <T> The type of the extraction parameter.
	 * 
	 * @param res The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default <T extends Tup2fC> T absR(@ExtractionParam T res)
	{
		return Vec2fUtils.abs(this, res);
	}
	
	/**
	 * Calculates the absolute values of the component values and saves the result in the extraction parameter.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * @param res The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default float[] absR(@ExtractionParam @MinLength(2) float[] res)
	{
		return Vec2fUtils.abs(this, res);
	}
	
	/**
	 * Calculates the {@link Math#signum(float) signum} of the components of this vector and saves the result in the extraction parameter.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * @param <T> The type of the extraction parameter.
	 * 
	 * @param res The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default <T extends Tup2fC> T signumN(@ExtractionParam T res)
	{
		return Vec2fUtils.signum(this, res);
	}
	
	/**
	 * Calculates the {@link Math#signum(float) signum} of the components of this vector and saves the result in the extraction parameter.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * @param res The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default float[] signumN(@ExtractionParam @MinLength(2) float[] res)
	{
		return Vec2fUtils.signum(this, res);
	}
}
