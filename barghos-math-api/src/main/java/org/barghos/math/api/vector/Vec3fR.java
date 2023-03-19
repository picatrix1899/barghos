package org.barghos.math.api.vector;

import org.barghos.core.api.math.BarghosMath;
import org.barghos.core.api.math.FloatRoundMethod;
import org.barghos.core.api.math.MathProvider;
import org.barghos.annotation.ExtractionParam;
import org.barghos.annotation.FloatMinValue;
import org.barghos.annotation.MinLength;
import org.barghos.math.api.util.ComponentValueFloat;
import org.barghos.tuple.api.t3.Tup3fC;
import org.barghos.tuple.api.t3.Tup3fR;

/**
 * This interface provides non invasive (readonly) functions and methods for float vectors with three dimensions.
 */
public interface Vec3fR extends SimpleVec3fR
{
	/**
	 * Creates a new instance of the type of this vector.
	 * 
	 * @return A new instance.
	 */
	Vec3fR createNew();
	
	/**
	 * Creates a new instance of the type of this vector and adopts the component values from the givewn vector {@code (v)}.
	 * 
	 * @param v The vector to adopt the component values from.
	 * 
	 * @return A new instance.
	 */
	default Vec3fR createNew(Tup3fR v)
	{
		return createNew(v.getV0(), v.getV1(), v.getV2());
	}
	
	/**
	 * Creates a new instance of the type of this vector and adopts the component values from the given vector {@code (v[0], v[1], v[2])}.
	 * 
	 * @param v The vector as an array with at least three entries to adopt the component values from.
	 * 
	 * @return A new instance.
	 */
	default Vec3fR createNew(@MinLength(3) float[] v)
	{
		return createNew(v[0], v[1], v[2]);
	}
	
	/**
	 * Creates a new instance of the type of this vector and sets the component values to the given value {@code (value)}.
	 * 
	 * @param value The value that will be used for all component values.
	 * 
	 * @return A new instance.
	 */
	default Vec3fR createNew(float value)
	{
		return createNew(value, value, value);
	}
	
	/**
	 * Creates a new instance of the type of this vector and adopts the component values from the given vector {@code (x, y, z)}.
	 * 
	 * @param x The value of the x component.
	 * @param y The value of the y component.
	 * @param z The value of the z component.
	 * 
	 * @return A new instance.
	 */
	Vec3fR createNew(float x, float y, float z);
	
	/** {@inheritDoc} */
	@Override
	Vec3fR copy();
	
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
		return Vec3fUtils.length(this);
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
		return Vec3fUtils.length(this, mathProvider);
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
		return Vec3fUtils.length(this, tolerance);
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
		return Vec3fUtils.length(this, tolerance, mathProvider);
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
		return Vec3fUtils.inverseLength(this);
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
		return Vec3fUtils.inverseLength(this, mathProvider);
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
	default float distanceTo(Tup3fR v2)
	{
		return Vec3fUtils.distanceTo(this, v2);
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
	default float distanceTo(Tup3fR v2, MathProvider mathProvider)
	{
		return Vec3fUtils.distanceTo(this, v2, mathProvider);
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
	default float distanceTo(Tup3fR v2, @FloatMinValue(0.0f) float tolerance)
	{
		return Vec3fUtils.distanceTo(this, v2, tolerance);
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
	default float distanceTo(Tup3fR v2, @FloatMinValue(0.0f) float tolerance, MathProvider mathProvider)
	{
		return Vec3fUtils.distanceTo(this, v2, tolerance);
	}
	
	/**
	 * Returns the distance between the endpoint of this vector and the endpoint of the given vector {@code (v2[0], v2[1], v2[2])}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(v2[0], v2[1], v2[2]) - v|}
	 * 
	 * @param v2 The second vector as an array with at least three entries.
	 * 
	 * @return The distance between the endpoint of this vector and the endpoint of the given vector.
	 */
	default float distanceTo(@MinLength(3) float[] v2)
	{
		return Vec3fUtils.distanceTo(this, v2);
	}
	
	/**
	 * Returns the distance between the endpoint of this vector and the endpoint of the given vector {@code (v2[0], v2[1], v2[2])}.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(v2[0], v2[1], v2[2]) - v|}
	 * 
	 * @param v2 The second vector as an array with at least three entries.
	 * @param mathProvider The provider of fundamental math functions that should be used for calculation.
	 * 
	 * @return The distance between the endpoint of this vector and the endpoint of the given vector.
	 */
	default float distanceTo(@MinLength(3) float[] v2, MathProvider mathProvider)
	{
		return Vec3fUtils.distanceTo(this, v2, mathProvider);
	}
	
	/**
	 * Returns the distance between the endpoint of this vector and the endpoint of the given vector {@code (v2[0], v2[1], v2[2])}.
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
	 * {@code |(v2[0], v2[1], v2[2]) - v|}
	 * 
	 * @param v2 The second vector as an array with at least three entries.
	 * @param tolerance The inclusive margin around zero to still count as zero.
	 * 
	 * @return The distance between the endpoint of this vector and the endpoint of the given vector.
	 * 
	 * @throws IllegalArgumentException If the given {@code tolerance} is below zero.
	 */
	default float distanceTo(@MinLength(3) float[] v2, @FloatMinValue(0.0f) float tolerance)
	{
		return Vec3fUtils.distanceTo(this, v2, tolerance);
	}
	
	/**
	 * Returns the distance between the endpoint of this vector and the endpoint of the given vector {@code (v2[0], v2[1], v2[2])}.
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
	 * {@code |(v2[0], v2[1], v2[2]) - v|}
	 * 
	 * @param v2 The second vector as an array with at least three entries.
	 * @param tolerance The inclusive margin around zero to still count as zero.
	 * @param mathProvider The provider of fundamental math functions that should be used for calculation.
	 * 
	 * @return The distance between the endpoint of this vector and the endpoint of the given vector.
	 * 
	 * @throws IllegalArgumentException If the given {@code tolerance} is below zero.
	 */
	default float distanceTo(@MinLength(2) float[] v2, @FloatMinValue(0.0f) float tolerance, MathProvider mathProvider)
	{
		return Vec3fUtils.distanceTo(this, v2, tolerance, mathProvider);
	}
	
	/**
	 * Returns the distance between the endpoint of this vector and the endpoint of the given vector {@code (v2x, v2y, v2z)}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(v2x, v2y, v2z) - v|}
	 * 
	 * @param v2x The value of the x component of the second vector.
	 * @param v2y The value of the y component of the second vector.
	 * @param v2z The value of the z component of the second vector.
	 * 
	 * @return The distance between the endpoint of this vector and the endpoint of the given vector.
	 */
	default float distanceTo(float v2x, float v2y, float v2z)
	{
		return Vec3fUtils.distanceTo(this, v2x, v2y, v2z);
	}
	
	/**
	 * Returns the distance between the endpoint of this vector and the endpoint of the given vector {@code (v2x, v2y, v2z)}.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(v2x, v2y, v2z) - v|}
	 * 
	 * @param v2x The value of the x component of the second vector.
	 * @param v2y The value of the y component of the second vector.
	 * @param v2z The value of the z component of the second vector.
	 * @param mathProvider The provider of fundamental math functions that should be used for calculation.
	 * 
	 * @return The distance between the endpoint of this vector and the endpoint of the given vector.
	 */
	default float distanceTo(float v2x, float v2y, float v2z, MathProvider mathProvider)
	{
		return Vec3fUtils.distanceTo(this, v2x, v2y, v2z, mathProvider);
	}
	
	/**
	 * Returns the distance between the endpoint of this vector and the endpoint of the given vector {@code (v2x, v2y, v2z)}.
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
	 * {@code |(v2x, v2y, v2z) - v|}
	 * 
	 * @param v2x The value of the x component of the second vector.
	 * @param v2y The value of the y component of the second vector.
	 * @param v2z The value of the z component of the second vector.
	 * @param tolerance The inclusive margin around zero to still count as zero.
	 * 
	 * @return The distance between the endpoint of this vector and the endpoint of the given vector.
	 * 
	 * @throws IllegalArgumentException If the given {@code tolerance} is below zero.
	 */
	default float distanceTo(float v2x, float v2y, float v2z, @FloatMinValue(0.0f) float tolerance)
	{
		return Vec3fUtils.distanceTo(this, v2x, v2y, v2z, tolerance);
	}
	
	/**
	 * Returns the distance between the endpoint of this vector and the endpoint of the given vector {@code (v2x, v2y, v2z)}.
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
	 * {@code |(v2x, v2y, v2z) - v|}
	 * 
	 * @param v2x The value of the x component of the second vector.
	 * @param v2y The value of the y component of the second vector.
	 * @param v2z The value of the z component of the second vector.
	 * @param tolerance The inclusive margin around zero to still count as zero.
	 * @param mathProvider The provider of fundamental math functions that should be used for calculation.
	 * 
	 * @return The distance between the endpoint of this vector and the endpoint of the given vector.
	 * 
	 * @throws IllegalArgumentException If the given {@code tolerance} is below zero.
	 */
	default float distanceTo(float v2x, float v2y, float v2z, @FloatMinValue(0.0f) float tolerance, MathProvider mathProvider)
	{
		return Vec3fUtils.distanceTo(this, v2x, v2y, v2z, tolerance, mathProvider);
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
	default float inverseDistanceTo(Tup3fR v2)
	{
		return Vec3fUtils.inverseDistanceTo(this, v2);
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
	default float inverseDistanceTo(Tup3fR v2, MathProvider mathProvider)
	{
		return Vec3fUtils.inverseDistanceTo(this, v2, mathProvider);
	}
	
	/**
	 * Returns the inverse (reciprocal) distance between the endpoint of this vector and the endpoint of the given vector {@code (v2[0], v2[1], v2[2])}.
	 * If the distance is zero an {@link ArithmeticException} is thrown.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code 1 / |(v2[0], v2[1], v2[2]) - v|}
	 * 
	 * @param v2 The second vector as an array with at least three entries.
	 * 
	 * @return The inverse distance between the endpoint of this vector and the endpoint of the given vector.
	 * 
	 * @throws ArithmeticException If the distance between the endpoints is zero.
	 */
	default float inverseDistanceTo(@MinLength(3) float[] v2)
	{
		return Vec3fUtils.inverseDistanceTo(this, v2);
	}
	
	/**
	 * Returns the inverse (reciprocal) distance between the endpoint of this vector and the endpoint of the given vector {@code (v2[0], v2[1], v2[2])}.
	 * If the distance is zero an {@link ArithmeticException} is thrown.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code 1 / |(v2[0], v2[1], v2[2]) - v|}
	 * 
	 * @param v2 The second vector as an array with at least three entries.
	 * @param mathProvider The provider of fundamental math functions that should be used for calculation.
	 * 
	 * @return The inverse distance between the endpoint of this vector and the endpoint of the given vector.
	 * 
	 * @throws ArithmeticException If the distance between the endpoints is zero.
	 */
	default float inverseDistanceTo(@MinLength(3) float[] v2, MathProvider mathProvider)
	{
		return Vec3fUtils.inverseDistanceTo(this, v2, mathProvider);
	}
	
	/**
	 * Returns the inverse (reciprocal) distance between the endpoint of this vector and the endpoint of the given vector {@code (v2x, v2y, v2z)}.
	 * If the distance is zero an {@link ArithmeticException} is thrown.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code 1 / |(v2x, v2y, v2z) - v|}
	 * 
	 * @param v2x The value of the x component of the second vector.
	 * @param v2y The value of the y component of the second vector.
	 * @param v2z The value of the z component of the second vector.
	 * 
	 * @return The inverse distance between the endpoint of this vector and the endpoint of the given vector.
	 * 
	 * @throws ArithmeticException If the distance between the endpoints is zero.
	 */
	default float inverseDistanceTo(float v2x, float v2y, float v2z)
	{
		return Vec3fUtils.inverseDistanceTo(this, v2x, v2y, v2z);
	}
	
	/**
	 * Returns the inverse (reciprocal) distance between the endpoint of this vector and the endpoint of the given vector {@code (v2x, v2y, v2z)}.
	 * If the distance is zero an {@link ArithmeticException} is thrown.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code 1 / |(v2x, v2y, v2z) - v|}
	 * 
	 * @param v2x The value of the x component of the second vector.
	 * @param v2y The value of the y component of the second vector.
	 * @param v2z The value of the z component of the second vector.
	 * @param mathProvider The provider of fundamental math functions that should be used for calculation.
	 * 
	 * @return The inverse distance between the endpoint of this vector and the endpoint of the given vector.
	 * 
	 * @throws ArithmeticException If the distance between the endpoints is zero.
	 */
	default float inverseDistanceTo(float v2x, float v2y, float v2z, MathProvider mathProvider)
	{
		return Vec3fUtils.inverseDistanceTo(this, v2x, v2y, v2z, mathProvider);
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
		return Vec3fUtils.squaredLength(this);
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
	default float squaredDistanceTo(Tup3fR v2)
	{
		return Vec3fUtils.squaredDistanceTo(this, v2);
	}
	
	/**
	 * Returns the squared distance between the endpoint of this vector and the endpoint of the given vector {@code (v2[0], v2[1], v2[2])}.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(v2[0], v2[1], v2[2]) - v|^2}
	 * 
	 * @param v2 The second vector as an array with at least three entries.
	 * 
	 * @return The squared distance between the endpoint of this vector and the endpoint of the given vector.
	 */
	default float squaredDistanceTo(@MinLength(3) float[] v2)
	{
		return Vec3fUtils.squaredDistanceTo(this, v2);
	}
	
	/**
	 * Returns the squared distance between the endpoint of this vector and the endpoint of the given vector {@code (v2x, v2y, v2z)}.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(v2x, v2y, v2z) - v|^2}
	 * 
	 * @param v2x The value of the x component of the second vector.
	 * @param v2y The value of the y component of the second vector.
	 * @param v2z The value of the z component of the second vector.
	 * 
	 * @return The squared distance between the endpoint of this vector and the endpoint of the given vector.
	 */
	default float squaredDistanceTo(float v2x, float v2y, float v2z)
	{
		return Vec3fUtils.squaredDistanceTo(this, v2x, v2y, v2z);
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
	default float dot(Tup3fR v2)
	{
		return Vec3fUtils.dot(this, v2);
	}
	
	/**
	 * Returns the dot product (scalar product) between this vector and the given vector {@code (v2[0], v2[1], v2[2])}.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v . (v2[0], v2[1], v2[2])}
	 * 
	 * @param v2 The second vector as an array with at least three entries.
	 * @return The dot product.
	 */
	default float dot(@MinLength(3) float[] v2)
	{
		return Vec3fUtils.dot(this, v2);
	}
	
	/**
	 * Returns the dot product (scalar product) between this vector and the given vector {@code (v2x, v2y, v2z)}.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v . (v2x, v2y, v2z)}
	 * 
	 * @param v2x The value of the x component of the second vector.
	 * @param v2y The value of the y component of the second vector.
	 * @param v2z The value of the z component of the second vector.
	 * @return The dot product.
	 */
	default float dot(float v2x, float v2y, float v2z)
	{
		return Vec3fUtils.dot(this, v2x, v2y, v2z);
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
	default Vec3fR addN(Tup3fR v2)
	{
		return Vec3fUtils.addFunc(this, v2, (x, y, z) -> createNew(x, y, z));
	}
	
	/**
	 * Adds the given vector {@code (v2[0], v2[1], v2[2])} to this vector and saves the result in a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v + (v2[0], v2[1], v2[2])}
	 * 
	 * @param v2 The vector to add to this vector as an array with at least three entries.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	default Vec3fR addN(@MinLength(3) float[] v2)
	{
		return Vec3fUtils.addFunc(this, v2, (x, y, z) -> createNew(x, y, z));
	}
	
	/**
	 * Adds the given value {@code (value)} to every component of this vector and saves the result in a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v + (value, value, value)}
	 * 
	 * @param value The value to add to this vector.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	default Vec3fR addN(float value)
	{
		return Vec3fUtils.addFunc(this, value, value, value, (x, y, z) -> createNew(x, y, z));
	}
	
	/**
	 * Adds the given vector {@code (v2x, v2y, v2z)} to this vector and saves the result in a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v + (v2x, v2y, v2z)}
	 * 
	 * @param v2x The value of the x component to add to this vector.
	 * @param v2y The value of the y component to add to this vector.
	 * @param v2z The value of the z component to add to this vector.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	default Vec3fR addN(float v2x, float v2y, float v2z)
	{
		return Vec3fUtils.addFunc(this, v2x, v2y, v2z, (x, y, z) -> createNew(x, y, z));
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
	default Vec3fR subN(Tup3fR v2)
	{
		return Vec3fUtils.subFunc(this, v2, (x, y, z) -> createNew(x, y, z));
	}
	
	/**
	 * Subtracts the given vector {@code (v2[0], v2[1], v2[2])} from this vector and saves the result in a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v - (v2[0], v2[1], v2[2])}
	 * 
	 * @param v2 The vector to subtract from this vector as an array with at least three entries.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	default Vec3fR subN(@MinLength(3) float[] v2)
	{
		return Vec3fUtils.subFunc(this, v2, (x, y, z) -> createNew(x, y, z));
	}
	
	/**
	 * Subtracts the given value {@code (value)} from every component of this vector and saves the result in a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v - (value, value, value)}
	 * 
	 * @param value The value to subtract from this vector.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	default Vec3fR subN(float value)
	{
		return Vec3fUtils.subFunc(this, value, value, value, (x, y, z) -> createNew(x, y, z));
	}
	
	/**
	 * Subtracts the given vector {@code (v2x, v2y, v2z)} from this vector and saves the result in a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v - (v2x, v2y, v2z)}
	 * 
	 * @param v2x The value of the x component to subtract from this vector.
	 * @param v2y The value of the y component to subtract from this vector.
	 * @param v2z The value of the z component to subtract from this vector.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	default Vec3fR subN(float v2x, float v2y, float v2z)
	{
		return Vec3fUtils.subFunc(this, v2x, v2y, v2z, (x, y, z) -> createNew(x, y, z));
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
	default Vec3fR revSubN(Tup3fR v2)
	{
		return Vec3fUtils.revSubFunc(this, v2, (x, y, z) -> createNew(x, y, z));
	}
	
	/**
	 * Subtracts this vector from the given vector {@code (v2[0], v2[1], v2[2])} and saves the result in a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2[0], v2[1], v2[2]) - v}
	 * 
	 * @param v2 The vector this vector is subtracted from as an array with at least three entries.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	default Vec3fR revSubN(@MinLength(3) float[] v2)
	{
		return Vec3fUtils.revSubFunc(this, v2, (x, y, z) -> createNew(x, y, z));
	}
	
	/**
	 * Subtracts every component of this vector from the given value {@code (value)} and saves the result in a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (value, value, value) - v}
	 * 
	 * @param value The value this vector is subtracted from.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	default Vec3fR revSubN(float value)
	{
		return Vec3fUtils.revSubFunc(this, value, value, value, (x, y, z) -> createNew(x, y, z));
	}
		
	/**
	 * Subtracts this vector from the given vector {@code (v2x, v2y, v2z)} and saves the result in a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2x, v2y, v2z) - v}
	 * 
	 * @param v2x The value of the x component this vector is subtracted from.
	 * @param v2y The value of the y component this vector is subtracted from.
	 * @param v2z The value of the z component this vector is subtracted from.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	default Vec3fR revSubN(float v2x, float v2y, float v2z)
	{
		return Vec3fUtils.revSubFunc(this, v2x, v2y, v2z, (x, y, z) -> createNew(x, y, z));
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
	default Vec3fR mulN(Tup3fR v2)
	{
		return Vec3fUtils.mulFunc(this, v2, (x, y, z) -> createNew(x, y, z));
	}
	
	/**
	 * Multiplies this vector with the given vector {@code (v2[0], v2[1], v2[2])} and saves the result in a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v * (v2[0], v2[1], v2[2])}
	 * 
	 * @param v2 The vector to multiply this vector with as an array with at least three entries.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	default Vec3fR mulN(@MinLength(3) float[] v2)
	{
		return Vec3fUtils.mulFunc(this, v2, (x, y, z) -> createNew(x, y, z));
	}
	
	/**
	 * Multiplies every component of this vector with the given value {@code (value)} and saves the result in a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v * (value, value, value)}
	 * 
	 * @param value The value to multiply this vector with.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	default Vec3fR mulN(float value)
	{
		return Vec3fUtils.mulFunc(this, value, value, value, (x, y, z) -> createNew(x, y, z));
	}
	
	/**
	 * Multiplies this vector with the given vector {@code (v2x, v2y, v2z)} and saves the result in a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v * (v2x, v2y, v2z)}
	 * 
	 * @param v2x The value of the x component to multiply this vector with.
	 * @param v2y The value of the y component to multiply this vector with.
	 * @param v2z The value of the z component to multiply this vector with.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	default Vec3fR mulN(float v2x, float v2y, float v2z)
	{
		return Vec3fUtils.mulFunc(this, v2x, v2y, v2z, (x, y, z) -> createNew(x, y, z));
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
	default Vec3fR divN(Tup3fR v2)
	{
		return Vec3fUtils.divFunc(this, v2, (x, y, z) -> createNew(x, y, z));
	}
	
	/**
	 * Divides this vector by the given vector {@code (v2[0], v2[1], v2[2])} and saves the result in a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v / (v2[0], v2[1], v2[2])}
	 * 
	 * @param v2 The vector to divide this vector by as an array with at least three entries.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	default Vec3fR divN(@MinLength(3) float[] v2)
	{
		return Vec3fUtils.divFunc(this, v2, (x, y, z) -> createNew(x, y, z));
	}
	
	/**
	 * Divides each component of this vector by the given value {@code (value)} and saves the result in a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v / (value, value, value)}
	 * 
	 * @param value The value to divide this vector by.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	default Vec3fR divN(float value)
	{
		return Vec3fUtils.divFunc(this, value, value, value, (x, y, z) -> createNew(x, y, z));
	}
	
	/**
	 * Divides this vector by the given vector {@code (v2x, v2y, v2z)} and saves the result in a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v / (v2x, v2y, v2z)}
	 * 
	 * @param v2x The value of the x component to divide this vector by.
	 * @param v2y The value of the y component to divide this vector by.
	 * @param v2z The value of the z component to divide this vector by.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	default Vec3fR divN(float v2x, float v2y, float v2z)
	{
		return Vec3fUtils.divFunc(this, v2x, v2y, v2z, (x, y, z) -> createNew(x, y, z));
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
	default Vec3fR revDivN(Tup3fR v2)
	{
		return Vec3fUtils.revDivFunc(this, v2, (x, y, z) -> createNew(x, y, z));
	}

	/**
	 * Divides the given vector {@code (v2[0], v2[1], v2[2])} by this vector and saves the result in a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2[0], v2[1], v2[2]) / v}
	 * 
	 * @param v2 The vector to divide by this vector as an array with at least three entries.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	default Vec3fR revDivN(@MinLength(3) float[] v2)
	{
		return Vec3fUtils.revDivFunc(this, v2, (x, y, z) -> createNew(x, y, z));
	}
	
	/**
	 * Divides the given value {@code (value)} by each component of this vector and saves the result in a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (value, value, value) / v}
	 * 
	 * @param value The value to divide by this vector.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	default Vec3fR revDivN(float value)
	{
		return Vec3fUtils.revDivFunc(this, value, value, value, (x, y, z) -> createNew(x, y, z));
	}

	/**
	 * Divides the given vector {@code (v2x, v2y, v2z)} by this vector and saves the result in a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2x, v2y, v2z) / v}
	 * 
	 * @param v2x The value of the x component to divide by this vector.
	 * @param v2y The value of the y component to divide by this vector.
	 * @param v2z The value of the z component to divide by this vector.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	default Vec3fR revDivN(float v2x, float v2y, float v2z)
	{
		return Vec3fUtils.revDivFunc(this, v2x, v2y, v2z, (x, y, z) -> createNew(x, y, z));
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
	default Vec3fR halfVectorToN(Tup3fR v2)
	{
		return Vec3fUtils.halfVectorToFunc(this, v2, (x, y, z) -> createNew(x, y, z));
	}
	
	/**
	 * Returns half the vector from the endpoint of this vector to the endpoint of the given vector {@code (v2[0], v2[1], v2[2])} as a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ( (v2[0], v2[1], v2[2]) - v ) / 2}
	 * 
	 * @param v2 The second vector as an array with at least three entries.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	default Vec3fR halfVectorToN(@MinLength(3) float[] v2)
	{
		return Vec3fUtils.halfVectorToFunc(this, v2, (x, y, z) -> createNew(x, y, z));
	}
	
	/**
	 * Returns half the vector from the endpoint of this vector to the endpoint of the given vector {@code (v2x, v2y, v2z)} as a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ( (v2x, v2y, v2z) - v ) / 2}
	 * 
	 * @param v2x The value of the x component of the second vector.
	 * @param v2y The value of the y component of the second vector.
	 * @param v2z The value of the z component of the second vector.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	default Vec3fR halfVectorToN(float v2x, float v2y, float v2z)
	{
		return Vec3fUtils.halfVectorToFunc(this, v2x, v2y, v2z, (x, y, z) -> createNew(x, y, z));
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
	default Vec3fR halfPointBetweenN(Tup3fR v2)
	{
		return Vec3fUtils.halfPointBetweenFunc(this, v2, (x, y, z) -> createNew(x, y, z));
	}
	
	/**
	 * Returns the origin vector to the point that lies half way between the endpoint of this vector and the endpoint of the given vector {@code (v2[0], v2[1], v2[2])} as a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ( (v2[0], v2[1], v2[2]) + v ) / 2}
	 * 
	 * @param v2 The second vector as an array with at least three entries.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	default Vec3fR halfPointBetweenN(@MinLength(3) float[] v2)
	{
		return Vec3fUtils.halfPointBetweenFunc(this, v2, (x, y, z) -> createNew(x, y, z));
	}
	
	/**
	 * Returns the origin vector to the point that lies half way between the endpoint of this vector and the endpoint of the given vector {@code (v2x, v2y, v2z)} as a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ( (v2x, v2y, v2z) + v ) / 2}
	 * 
	 * @param v2x The value of the x component of the second vector.
	 * @param v2y The value of the y component of the second vector.
	 * @param v2z The value of the z component of the second vector.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	default Vec3fR halfPointBetweenN(float v2x, float v2y, float v2z)
	{
		return Vec3fUtils.halfPointBetweenFunc(this, v2x, v2y, v2z, (x, y, z) -> createNew(x, y, z));
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
	default Vec3fR negateN()
	{
		return Vec3fUtils.negateFunc(this, (x, y, z) -> createNew(x, y, z));
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
	default Vec3fR inverseN()
	{
		return Vec3fUtils.inverseFunc(this, (x, y, z) -> createNew(x, y, z));
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
	default Vec3fR normalizeN()
	{
		return Vec3fUtils.normalizeFunc(this, (x, y, z) -> createNew(x, y, z));
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
	default Vec3fR minVectorN(Tup3fR v2)
	{
		return Vec3fUtils.minVectorFunc(this, v2, (x, y, z) -> createNew(x, y, z));
	}
	
	/**
	 * Compares each component of this vector with the corresponding component of the given vector {@code (v2[0], v2[1], v2[2])} and
	 * returns the smallest values as a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * @param v2 The second vector as an array with at least three entries.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	default Vec3fR minVectorN(@MinLength(3) float[] v2)
	{
		return Vec3fUtils.minVectorFunc(this, v2, (x, y, z) -> createNew(x, y, z));
	}
	
	/**
	 * Compares each component of this vector with the corresponding component of the given vector {@code (value, value, value)} and
	 * returns the smallest values as a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * @param value The value for all the components of the second vector.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	default Vec3fR minVectorN(float value)
	{
		return Vec3fUtils.minVectorFunc(this, value, value, value, (x, y, z) -> createNew(x, y, z));
	}
	
	/**
	 * Compares each component of this vector with the corresponding component of the given vector {@code (v2x, v2y, v2z)} and
	 * returns the smallest values as a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * @param v2x The value of the x component of the second vector.
	 * @param v2y The value of the y component of the second vector.
	 * @param v2z The value of the z component of the second vector.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	default Vec3fR minVectorN(float v2x, float v2y, float v2z)
	{
		return Vec3fUtils.minVectorFunc(this, v2x, v2y, v2z, (x, y, z) -> createNew(x, y, z));
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
	default Vec3fR maxVectorN(Tup3fR v2)
	{
		return Vec3fUtils.maxVectorFunc(this, v2, (x, y, z) -> createNew(x, y, z));
	}
	
	/**
	 * Compares each component of this vector with the corresponding component of the given vector {@code (v2[0], v2[1], v2[2])} and
	 * returns the greatest values as a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * @param v2 The second vector as an array with at least three entries.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	default Vec3fR maxVectorN(@MinLength(3) float[] v2)
	{
		return Vec3fUtils.maxVectorFunc(this, v2, (x, y, z) -> createNew(x, y, z));
	}
	
	/**
	 * Compares each component of this vector with the corresponding component of the given vector {@code (value, value, value)} and
	 * returns the greatest values as a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * @param value The value for all the components of the second vector.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	default Vec3fR maxVectorN(float value)
	{
		return Vec3fUtils.maxVectorFunc(this, value, value, value, (x, y, z) -> createNew(x, y, z));
	}
	
	/**
	 * Compares each component of this vector with the corresponding component of the given vector {@code (v2x, v2y, v2z)} and
	 * returns the greatest values as a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * @param v2x The value of the x component of the second vector.
	 * @param v2y The value of the y component of the second vector.
	 * @param v2z The value of the z component of the second vector.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	default Vec3fR maxVectorN(float v2x, float v2y, float v2z)
	{
		return Vec3fUtils.maxVectorFunc(this, v2x, v2y, v2z, (x, y, z) -> createNew(x, y, z));
	}
	
	/**
	 * Rotates this vector by the given angle in radians around the rotation axis {@code (axis)} and returns the result as a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for calculation.
	 * 
	 * @param axis The rotation axis.
	 * @param angle The angle in radians.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	default Vec3fR rotateRadN(Tup3fR axis, float angle)
	{
		return Vec3fUtils.rotateRadFunc(this, axis, angle, (x, y, z) -> createNew(x, y, z));
	}
	
	/**
	 * Rotates this vector by the given angle in radians around the rotation axis {@code (axis)} and returns the result as a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * @param axis The rotation axis.
	 * @param angle The angle in radians.
	 * @param mathProvider The provider of fundamental math functions that should be used for calculation.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	default Vec3fR rotateRadN(Tup3fR axis, float angle, MathProvider mathProvider)
	{
		return Vec3fUtils.rotateRadFunc(this, axis, angle, mathProvider, (x, y, z) -> createNew(x, y, z));
	}
	
	/**
	 * Rotates this vector by the given angle in radians around the rotation axis {@code (axis[0], axis[1], axis[2])} and returns the result as a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for calculation.
	 * 
	 * @param axis The rotation axis as an array with at least three entries.
	 * @param angle The angle in radians.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	default Vec3fR rotateRadN(@MinLength(3) float[] axis, float angle)
	{
		return Vec3fUtils.rotateRadFunc(this, axis, angle, (x, y, z) -> createNew(x, y, z));
	}
	
	/**
	 * Rotates this vector by the given angle in radians around the rotation axis {@code (axis[0], axis[1], axis[2])} and returns the result as a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * @param axis The rotation axis as an array with at least three entries.
	 * @param angle The angle in radians.
	 * @param mathProvider The provider of fundamental math functions that should be used for calculation.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	default Vec3fR rotateRadN(@MinLength(3) float[] axis, float angle, MathProvider mathProvider)
	{
		return Vec3fUtils.rotateRadFunc(this, axis, angle, mathProvider, (x, y, z) -> createNew(x, y, z));
	}
	
	/**
	 * Rotates this vector by the given angle in radians around the rotation axis {@code (axisX, axisY, axisZ)} and returns the result as a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for calculation.
	 * 
	 * @param axisX The value of the x component of the rotation axis.
	 * @param axisY The value of the y component of the rotation axis.
	 * @param axisZ The value of the z component of the rotation axis.
	 * @param angle The angle in radians.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	default Vec3fR rotateRadN(float axisX, float axisY, float axisZ, float angle)
	{
		return Vec3fUtils.rotateRadFunc(this, axisX, axisY, axisZ, angle, (x, y, z) -> createNew(x, y, z));
	}
	
	/**
	 * Rotates this vector by the given angle in radians around the rotation axis {@code (axisX, axisY, axisZ)} and returns the result as a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * @param axisX The value of the x component of the rotation axis.
	 * @param axisY The value of the y component of the rotation axis.
	 * @param axisZ The value of the z component of the rotation axis.
	 * @param angle The angle in radians.
	 * @param mathProvider The provider of fundamental math functions that should be used for calculation.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	default Vec3fR rotateRadN(float axisX, float axisY, float axisZ, float angle, MathProvider mathProvider)
	{
		return Vec3fUtils.rotateRadFunc(this, axisX, axisY, axisZ, angle, mathProvider, (x, y, z) -> createNew(x, y, z));
	}
	
	/**
	 * Rotates this vector by the given angle in degrees around the rotation axis {@code (axis)} and returns the result as a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for calculation.
	 * 
	 * @param axis The rotation axis.
	 * @param angle The angle in radians.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	default Vec3fR rotateDegN(Tup3fR axis, float angle)
	{
		return Vec3fUtils.rotateDegFunc(this, axis, angle, (x, y, z) -> createNew(x, y, z));
	}
	
	/**
	 * Rotates this vector by the given angle in degrees around the rotation axis {@code (axis)} and returns the result as a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * @param axis The rotation axis.
	 * @param angle The angle in radians.
	 * @param mathProvider The provider of fundamental math functions that should be used for calculation.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	default Vec3fR rotateDegN(Tup3fR axis, float angle, MathProvider mathProvider)
	{
		return Vec3fUtils.rotateDegFunc(this, axis, angle, mathProvider, (x, y, z) -> createNew(x, y, z));
	}
	
	/**
	 * Rotates this vector by the given angle in degrees around the rotation axis {@code (axis[0], axis[1], axis[2])} and returns the result as a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for calculation.
	 * 
	 * @param axis The rotation axis as an array with at least three entries.
	 * @param angle The angle in radians.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	default Vec3fR rotateDegN(@MinLength(3) float[] axis, float angle)
	{
		return Vec3fUtils.rotateDegFunc(this, axis, angle, (x, y, z) -> createNew(x, y, z));
	}
	
	/**
	 * Rotates this vector by the given angle in degrees around the rotation axis {@code (axis[0], axis[1], axis[2])} and returns the result as a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * @param axis The rotation axis as an array with at least three entries.
	 * @param angle The angle in radians.
	 * @param mathProvider The provider of fundamental math functions that should be used for calculation.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	default Vec3fR rotateDegN(@MinLength(3) float[] axis, float angle, MathProvider mathProvider)
	{
		return Vec3fUtils.rotateDegFunc(this, axis, angle, mathProvider, (x, y, z) -> createNew(x, y, z));
	}
	
	/**
	 * Rotates this vector by the given angle in degrees around the rotation axis {@code (axisX, axisY, axisZ)} and returns the result as a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for calculation.
	 * 
	 * @param axisX The value of the x component of the rotation axis.
	 * @param axisY The value of the y component of the rotation axis.
	 * @param axisZ The value of the z component of the rotation axis.
	 * @param angle The angle in radians.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	default Vec3fR rotateDegN(float axisX, float axisY, float axisZ, float angle)
	{
		return Vec3fUtils.rotateDegFunc(this, axisX, axisY, axisZ, angle, (x, y, z) -> createNew(x, y, z));
	}
	
	/**
	 * Rotates this vector by the given angle in degrees around the rotation axis {@code (axisX, axisY, axisZ)} and returns the result as a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * @param axisX The value of the x component of the rotation axis.
	 * @param axisY The value of the y component of the rotation axis.
	 * @param axisZ The value of the z component of the rotation axis.
	 * @param angle The angle in radians.
	 * @param mathProvider The provider of fundamental math functions that should be used for calculation.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	default Vec3fR rotateDegN(float axisX, float axisY, float axisZ, float angle, MathProvider mathProvider)
	{
		return Vec3fUtils.rotateDegFunc(this, axisX, axisY, axisZ, angle, mathProvider, (x, y, z) -> createNew(x, y, z));
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
	default Vec3fR projectN(Tup3fR t)
	{
		return Vec3fUtils.projectFunc(this, t, (x, y, z) -> createNew(x, y, z));
	}
	
	/**
	 * Calculates the orthogonal projection of this vector onto the normalized target vector {@code (t[0], t[1], t[2])}
	 * and returns the result as a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (t[0], t[1], t[2]) * (v . (t[0], t[1], [2]))}
	 * 
	 * @param t The projection target vector as an array with at least three entries.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	default Vec3fR projectN(@MinLength(3) float[] t)
	{
		return Vec3fUtils.projectFunc(this, t, (x, y, z) -> createNew(x, y, z));
	}
	
	/**
	 * Calculates the orthogonal projection of this vector onto the normalized target vector {@code (tX, tY, tZ)}
	 * and returns the result as a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (tX, tY, tZ) * (v . (tX, tY, tZ))}
	 * 
	 * @param tX The value of the x component of the projection target vector.
	 * @param tY The value of the y component of the projection target vector.
	 * @param tZ The value of the z component of the projection target vector.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	default Vec3fR projectN(float tX, float tY, float tZ)
	{
		return Vec3fUtils.projectFunc(this, tX, tY, tZ, (x, y, z) -> createNew(x, y, z));
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
	default Vec3fR reflectN(Tup3fR n)
	{
		return Vec3fUtils.reflectFunc(this, n, (x, y, z) -> createNew(x, y, z));
	}
	
	/**
	 * Calculates the reflection of this vector based on the given normalized surface normal {@code (n[0], n[1], n[2])}
	 * and returns the result as a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * @param n The surface normal vector as an array with at least three entries.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	default Vec3fR reflectN(@MinLength(3) float[] n)
	{
		return Vec3fUtils.reflectFunc(this, n, (x, y, z) -> createNew(x, y, z));
	}
	
	/**
	 * Calculates the reflection of this vector based on the given normalized surface normal {@code (nX, nY, nZ)}
	 * and returns the result as a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * @param nX The value of the x component of the surface normal vector.
	 * @param nY The value of the y component of the surface normal vector.
	 * @param nZ The value of the z component of the surface normal vector.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	default Vec3fR reflectN(float nX, float nY, float nZ)
	{
		return Vec3fUtils.reflectFunc(this, nX, nY, nZ, (x, y, z) -> createNew(x, y, z));
	}
	
	/**
	 * Rounds the components of this vector towards the next greater integer and saves the result in a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	default Vec3fR ceilN()
	{
		return Vec3fUtils.ceilFunc(this, (x, y, z) -> createNew(x, y, z));
	}
	
	/**
	 * Rounds the components of this vector towards the next smaller integer and saves the result in a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	default Vec3fR floorN()
	{
		return Vec3fUtils.floorFunc(this, (x, y, z) -> createNew(x, y, z));
	}
	
	/**
	 * Rounds the components of this vector and saves the result in a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	default Vec3fR roundN()
	{
		return Vec3fUtils.roundFunc(this, (x, y, z) -> createNew(x, y, z));
	}
	
	/**
	 * Truncates the decimals of the components of this vector and saves the result in a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.

	 * @return A new instance of this vector with the result.
	 */
	default Vec3fR truncN()
	{
		return Vec3fUtils.truncFunc(this, (x, y, z) -> createNew(x, y, z));
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
	default Vec3fR roundN(FloatRoundMethod method)
	{
		return Vec3fUtils.roundFunc(this, method, (x, y, z) -> createNew(x, y, z));
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
		return Vec3fUtils.min(this, new ComponentValueFloat());
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
		return Vec3fUtils.min(this, res);
	}
	
	/**
	 * Determines the smallest value of the components and returns it.
	 * 
	 * @return The smallest value of the components.
	 */
	default float minValue()
	{
		return Vec3fUtils.minValue(this);
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
		return Vec3fUtils.minComponent(this);
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
		return Vec3fUtils.max(this, new ComponentValueFloat());
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
		return Vec3fUtils.max(this, res);
	}
	
	/**
	 * Determines the greatest value of the components and returns it.
	 * 
	 * @return The greatest value of the components.
	 */
	default float maxValue()
	{
		return Vec3fUtils.maxValue(this);
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
		return Vec3fUtils.maxComponent(this);
	}
	
	/**
	 * Calculates the absolute value of the component values and saves the result in a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	default Vec3fR absN()
	{
		return Vec3fUtils.absFunc(this, (x, y, z) -> createNew(x, y, z));
	}
	
	/**
	 * Calculates the cross product between this vector and the second given vector {@code (v2)} and saves the result in a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v X v2}
	 * 
	 * @param v2 The second vector.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	default Vec3fR crossN(Tup3fR v2)
	{
		return Vec3fUtils.crossFunc(this, v2.getV0(), v2.getV1(), v2.getV2(), (x, y, z) -> createNew(x, y, z));
	}
	
	/**
	 * Calculates the cross product between this vector and the second given vector {@code (v2[0], v2[1], v2[2])} and saves the result in a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v X (v2[0], v2[1], v2[2])}
	 * 
	 * @param v2 The second vector as an array with at least three entries.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	default Vec3fR crossN(@MinLength(3) float[] v2)
	{
		return Vec3fUtils.crossFunc(this, v2[0], v2[1], v2[2], (x, y, z) -> createNew(x, y, z));
	}
	
	/**
	 * Calculates the cross product between this vector and the second given vector {@code (value, value, value)} and saves the result in a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v X (value, value, value)}
	 * 
	 * @param value The value for all the components of the second vector.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	default Vec3fR crossN(float value)
	{
		return Vec3fUtils.crossFunc(this, value, value, value, (x, y, z) -> createNew(x, y, z));
	}
	
	/**
	 * Calculates the cross product between this vector and the second given vector {@code (v2x, v2y, v2z)} and saves the result in a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v X (v2x, v2y, v2z)}
	 * 
	 * @param v2x The value of the x component of the second vector.
	 * @param v2y The value of the y component of the second vector.
	 * @param v2z The value of the z component of the second vector.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	default Vec3fR crossN(float v2x, float v2y, float v2z)
	{
		return Vec3fUtils.crossFunc(this, v2x, v2y, v2z, (x, y, z) -> createNew(x, y, z));
	}
	
	/**
	 * Calculates the {@link Math#signum(float) signum} of the components of this vecotr and saves the result in a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	default Vec3fR signumN()
	{
		return Vec3fUtils.signumFunc(this, (x, y, z) -> createNew(x, y, z));
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
	default <T extends Tup3fC> T addR(Tup3fR v2, @ExtractionParam T res)
	{
		return Vec3fUtils.add(this, v2.getV0(), v2.getV1(), v2.getV2(), res);
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
	 * @param res The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default float[] addR(Tup3fR v2, @ExtractionParam @MinLength(3) float[] res)
	{
		return Vec3fUtils.add(this, v2.getV0(), v2.getV1(), v2.getV2(), res);
	}
	
	/**
	 * Adds the given vector {@code (v2[0], v2[1], v2[2])} to this vector and saves the result in the extraction parameter {@code res}.
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
	 * @param <T> The type of the extraction parameter.
	 * 
	 * @param v2 The vector to add to this vector as an array with at least three entries.
	 * @param res The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default <T extends Tup3fC> T addR(@MinLength(3) float[] v2, @ExtractionParam T res)
	{
		return Vec3fUtils.add(this, v2[0], v2[1], v2[2], res);
	}
	
	/**
	 * Adds the given vector {@code (v2[0], v2[1], v2[2])} to this vector and saves the result in the extraction parameter {@code res}.
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
	 * @param v2 The vector to add to this vector as an array with at least three entries.
	 * @param res The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default float[] addR(@MinLength(3) float[] v2, @ExtractionParam @MinLength(3) float[] res)
	{
		return Vec3fUtils.add(this, v2[0], v2[1], v2[2], res);
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
	 * {@code v + (value, value, value)}
	 * 
	 * @param <T> The type of the extraction parameter.
	 * 
	 * @param value The value to add to this vector.
	 * @param res The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default <T extends Tup3fC> T addR(float value, @ExtractionParam T res)
	{
		return Vec3fUtils.add(this, value, value, value, res);
	}
	
	/**
	 * Adds the given value {@code (value)} to every component of this vector and saves the result in the extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v + (value, value, value)}
	 * 
	 * @param value The value to add to this vector.
	 * @param res The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default float[] addR(float value, @ExtractionParam @MinLength(3) float[] res)
	{
		return Vec3fUtils.add(this, value, value, value, res);
	}
	
	/**
	 * Adds the given vector {@code (v2x, v2y, v2z)} to this vector and saves the result in the extraction parameter {@code res}.
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
	 * @param <T> The type of the extraction parameter.
	 * 
	 * @param v2x The value of the x component to add to this vector.
	 * @param v2y The value of the y component to add to this vector.
	 * @param v2z The value of the z component to add to this vector.
	 * @param res The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default <T extends Tup3fC> T addR(float v2x, float v2y, float v2z, @ExtractionParam T res)
	{
		return Vec3fUtils.add(this, v2x, v2y, v2z, res);
	}
	
	/**
	 * Adds the given vector {@code (v2x, v2y, v2z)} to this vector and saves the result in the extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v + (v2x, v2y, v2z)}
	 * 
	 * @param v2x The value of the x component to add to this vector.
	 * @param v2y The value of the y component to add to this vector.
	 * @param v2z The value of the z component to add to this vector.
	 * @param res The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default float[] addR(float v2x, float v2y, float v2z, @ExtractionParam @MinLength(3) float[] res)
	{
		return Vec3fUtils.add(this, v2x, v2y, v2z, res);
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
	default <T extends Tup3fC> T subR(Tup3fR v2, @ExtractionParam T res)
	{
		return Vec3fUtils.sub(this, v2.getV0(), v2.getV1(), v2.getV2(), res);
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
	 * @param res The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default float[] subR(Tup3fR v2, @ExtractionParam @MinLength(3) float[] res)
	{
		return Vec3fUtils.sub(this, v2.getV0(), v2.getV1(), v2.getV2(), res);
	}
	
	/**
	 * Subtracts the given vector {@code (v2[0], v2[1], v2[2])} from this vector and saves the result in the extraction parameter {@code res}.
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
	 * @param <T> The type of the extraction parameter.
	 * 
	 * @param v2 The vector to subtract from this vector as an array with at least three entries.
	 * @param res The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default <T extends Tup3fC> T subR(@MinLength(3) float[] v2, @ExtractionParam T res)
	{
		return Vec3fUtils.sub(this, v2[0], v2[1], v2[2], res);
	}
	
	/**
	 * Subtracts the given vector {@code (v2[0], v2[1], v2[2])} from this vector and saves the result in the extraction parameter {@code res}.
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

	 * @param v2 The vector to subtract from this vector as an array with at least three entries.
	 * @param res The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default float[] subR(@MinLength(3) float[] v2, @ExtractionParam @MinLength(3) float[] res)
	{
		return Vec3fUtils.sub(this, v2[0], v2[1], v2[2], res);
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
	 * {@code v - (value, value, value)}
	 * 
	 * @param <T> The type of the extraction parameter.
	 * 
	 * @param value The value to subtract from this vector.
	 * @param res The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default <T extends Tup3fC> T subR(float value, @ExtractionParam T res)
	{
		return Vec3fUtils.sub(this, value, value, value, res);
	}
	
	/**
	 * Subtracts the given value {@code (value)} from every component of this vector and saves the result in the extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v - (value, value, value)}
	 * 
	 * @param value The value to subtract from this vector.
	 * @param res The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default float[] subR(float value, @ExtractionParam @MinLength(3) float[] res)
	{
		return Vec3fUtils.sub(this, value, value, value, res);
	}
	
	/**
	 * Subtracts the given vector {@code (v2x, v2y, v2z)} from this vector and saves the result in the extraction parameter {@code res}.
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
	 * @param <T> The type of the extraction parameter.
	 * 
	 * @param v2x The value of the x component to subtract from this vector.
	 * @param v2y The value of the y component to subtract from this vector.
	 * @param v2z The value of the z component to subtract from this vector.
	 * @param res The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default <T extends Tup3fC> T subR(float v2x, float v2y, float v2z, @ExtractionParam T res)
	{
		return Vec3fUtils.sub(this, v2x, v2y, v2z, res);
	}
	
	/**
	 * Subtracts the given vector {@code (v2x, v2y, v2z)} from this vector and saves the result in the extraction parameter {@code res}.
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
	 * @param v2x The value of the x component to subtract from this vector.
	 * @param v2y The value of the y component to subtract from this vector.
	 * @param v2z The value of the z component to subtract from this vector.
	 * @param res The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default float[] subR(float v2x, float v2y, float v2z, @ExtractionParam @MinLength(3) float[] res)
	{
		return Vec3fUtils.sub(this, v2x, v2y, v2z, res);
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
	default <T extends Tup3fC> T revSubR(Tup3fR v2, @ExtractionParam T res)
	{
		return Vec3fUtils.revSub(this, v2.getV0(), v2.getV1(), v2.getV2(), res);
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
	 * @param res The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default float[] revSubR(Tup3fR v2, @ExtractionParam @MinLength(3) float[] res)
	{
		return Vec3fUtils.revSub(this, v2.getV0(), v2.getV1(), v2.getV2(), res);
	}
	
	/**
	 * Subtracts this vector from the given vector {@code (v2[0], v2[1], v2[2])} and saves the result in the extraction parameter {@code res}.
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
	 * @param <T> The type of the extraction parameter.
	 * 
	 * @param v2 The vector this vector is subtracted from as an array with at least three entries.
	 * @param res The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default <T extends Tup3fC> T revSubR(@MinLength(3) float[] v2, @ExtractionParam T res)
	{
		return Vec3fUtils.revSub(this, v2[0], v2[1], v2[2], res);
	}
	
	/**
	 * Subtracts this vector from the given vector {@code (v2[0], v2[1], v2[2])} and saves the result in the extraction parameter {@code res}.
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
	 * @param v2 The vector this vector is subtracted from as an array with at least three entries.
	 * @param res The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default float[] revSubR(@MinLength(3) float[] v2, @ExtractionParam @MinLength(3) float[] res)
	{
		return Vec3fUtils.revSub(this, v2[0], v2[1], v2[2], res);
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
	 * {@code (value, value, value) - v}
	 * 
	 * @param <T> The type of the extraction parameter.
	 * 
	 * @param value The value this vector is subtracted from.
	 * @param res The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default <T extends Tup3fC> T revSubR(float value, @ExtractionParam T res)
	{
		return Vec3fUtils.revSub(this, value, value, value, res);
	}
		
	/**
	 * Subtracts every component of this vector from the given value {@code (value)} and saves the result in the extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (value, value, value) - v}
	 * 
	 * @param value The value this vector is subtracted from.
	 * @param res The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default float[] revSubR(float value, @ExtractionParam @MinLength(2) float[] res)
	{
		return Vec3fUtils.revSub(this, value, value, value, res);
	}
	
	/**
	 * Subtracts this vector from the given vector {@code (v2x, v2y, v2z)} and saves the result in the extraction parameter {@code res}.
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
	 * @param <T> The type of the extraction parameter.
	 * 
	 * @param v2x The value of the x component this vector is subtracted from.
	 * @param v2y The value of the y component this vector is subtracted from.
	 * @param v2z The value of the z component this vector is subtracted from.
	 * @param res The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default <T extends Tup3fC> T revSubR(float v2x, float v2y, float v2z, @ExtractionParam T res)
	{
		return Vec3fUtils.revSub(this, v2x, v2y, v2z, res);
	}
	
	/**
	 * Subtracts this vector from the given vector {@code (v2x, v2y, v2z)} and saves the result in the extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2x, v2y, v2z) - v}
	 * 
	 * @param v2x The value of the x component this vector is subtracted from.
	 * @param v2y The value of the y component this vector is subtracted from.
	 * @param v2z The value of the z component this vector is subtracted from.
	 * @param res The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default float[] revSubR(float v2x, float v2y, float v2z, @ExtractionParam @MinLength(3) float[] res)
	{
		return Vec3fUtils.revSub(this, v2x, v2y, v2z, res);
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
	default <T extends Tup3fC> T mulR(Tup3fR v2, @ExtractionParam T res)
	{
		return Vec3fUtils.mul(this, v2, res);
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
	 * @param res The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default float[] mulR(Tup3fR v2, @ExtractionParam @MinLength(3) float[] res)
	{
		return Vec3fUtils.mul(this, v2, res);
	}
	
	/**
	 * Multiplies this vector with the given vector {@code (v2[0], v2[1], v2[2])} and saves the result in the extraction parameter {@code res}.
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
	 * @param <T> The type of the extraction parameter.
	 * 
	 * @param v2 The vector to multiply this vector with as an array with at least three entries.
	 * @param res The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default <T extends Tup3fC> T mulR(@MinLength(3) float[] v2, @ExtractionParam T res)
	{
		return Vec3fUtils.mul(this, v2, res);
	}
	
	/**
	 * Multiplies this vector with the given vector {@code (v2[0], v2[1], v2[2])} and saves the result in the extraction parameter {@code res}.
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
	 * @param v2 The vector to multiply this vector with as an array with at least three entries.
	 * @param res The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default float[] mulR(@MinLength(3) float[] v2, @ExtractionParam @MinLength(3) float[] res)
	{
		return Vec3fUtils.mul(this, v2, res);
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
	 * {@code v * (value, value, value)}
	 * 
	 * @param <T> The type of the extraction parameter.
	 * 
	 * @param value The value to multiply this vector with.
	 * @param res The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default <T extends Tup3fC> T mulR(float value, @ExtractionParam T res)
	{
		return Vec3fUtils.mul(this, value, value, value, res);
	}
	
	/**
	 * Multiplies every component of this vector with the given value {@code (value)} and saves the result in the extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v * (value, value, value)}
	 * 
	 * @param value The value to multiply this vector with.
	 * @param res The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default float[] mulR(float value, @ExtractionParam @MinLength(3) float[] res)
	{
		return Vec3fUtils.mul(this, value, value, value, res);
	}
	
	/**
	 * Multiplies this vector with the given vector {@code (v2x, v2y, v2z)} and saves the result in the extraction parameter {@code res}.
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
	 * @param <T> The type of the extraction parameter.
	 * 
	 * @param v2x The value of the x component to multiply this vector with.
	 * @param v2y The value of the y component to multiply this vector with.
	 * @param v2z The value of the z component to multiply this vector with.
	 * @param res The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default <T extends Tup3fC> T mulR(float v2x, float v2y, float v2z, @ExtractionParam T res)
	{
		return Vec3fUtils.mul(this, v2x, v2y, v2z, res);
	}
	
	/**
	 * Multiplies this vector with the given vector {@code (v2x, v2y, v2z)} and saves the result in the extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v * (v2x, v2y, v2z)}
	 * 
	 * @param v2x The value of the x component to multiply this vector with.
	 * @param v2y The value of the y component to multiply this vector with.
	 * @param v2z The value of the z component to multiply this vector with.
	 * @param res The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default float[] mulR(float v2x, float v2y, float v2z, @ExtractionParam @MinLength(3) float[] res)
	{
		return Vec3fUtils.mul(this, v2x, v2y, v2z, res);
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
	default <T extends Tup3fC> T divR(Tup3fR v2, @ExtractionParam T res)
	{
		return Vec3fUtils.div(this, v2, res);
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
	 * @param res The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default float[] divR(Tup3fR v2, @ExtractionParam @MinLength(3) float[] res)
	{
		return Vec3fUtils.div(this, v2, res);
	}
	
	/**
	 * Divides this vector by the given vector {@code (v2[0], v2[1], v2[2])} and saves the result in the extraction parameter {@code res}.
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
	 * @param <T> The type of the extraction parameter.
	 * 
	 * @param v2 The vector to divide this vector by as an array with at least three entries.
	 * @param res The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default <T extends Tup3fC> T divR(@MinLength(3) float[] v2, @ExtractionParam T res)
	{
		return Vec3fUtils.div(this, v2, res);
	}
	
	/**
	 * Divides this vector by the given vector {@code (v2[0], v2[1], v2[2])} and saves the result in the extraction parameter {@code res}.
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
	 * @param v2 The vector to divide this vector by as an array with at least three entries.
	 * @param res The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default float[] divR(@MinLength(3) float[] v2, @ExtractionParam @MinLength(3) float[] res)
	{
		return Vec3fUtils.div(this, v2, res);
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
	 * {@code v / (value, value, value)}
	 * 
	 * @param <T> The type of the extraction parameter.
	 * 
	 * @param value The value to divide this vector by.
	 * @param res The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default <T extends Tup3fC> T divR(float value, @ExtractionParam T res)
	{
		return Vec3fUtils.div(this, value, value, value, res);
	}
	
	/**
	 * Divides each component of this vector by the given value {@code (value)} and saves the result in the extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v / (value, value, value)}
	 * 
	 * @param value The value to divide this vector by.
	 * @param res The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default float[] divR(float value, @ExtractionParam @MinLength(3) float[] res)
	{
		return Vec3fUtils.div(this, value, value, value, res);
	}
	
	/**
	 * Divides this vector by the given vector {@code (v2x, v2y, v2z)} and saves the result in the extraction parameter {@code res}.
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
	 * @param <T> The type of the extraction parameter.
	 * 
	 * @param v2x The value of the x component to divide this vector by.
	 * @param v2y The value of the y component to divide this vector by.
	 * @param v2z The value of the z component to divide this vector by.
	 * @param res The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default <T extends Tup3fC> T divR(float v2x, float v2y, float v2z, @ExtractionParam T res)
	{
		return Vec3fUtils.div(this, v2x, v2y, v2z, res);
	}

	/**
	 * Divides this vector by the given vector {@code (v2x, v2y, v2z)} and saves the result in the extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v / (v2x, v2y, v2z)}
	 * 
	 * @param v2x The value of the x component to divide this vector by.
	 * @param v2y The value of the y component to divide this vector by.
	 * @param v2z The value of the z component to divide this vector by.
	 * @param res The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default float[] divR(float v2x, float v2y, float v2z, @ExtractionParam @MinLength(3) float[] res)
	{
		return Vec3fUtils.div(this, v2x, v2y, v2z, res);
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
	default <T extends Tup3fC> T revDivR(Tup3fR v2, @ExtractionParam T res)
	{
		return Vec3fUtils.revDiv(this, v2, res);
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
	 * @param res The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default float[] revDivR(Tup3fR v2, @ExtractionParam @MinLength(3) float[] res)
	{
		return Vec3fUtils.revDiv(this, v2, res);
	}
	
	/**
	 * Divides the given vector {@code (v2[0], v2[1], v2[2])} by this vector and saves the result in the extraction parameter {@code res}.
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
	 * @param <T> The type of the extraction parameter.
	 * 
	 * @param v2 The vector to divide by this vector as an array with at least three entries.
	 * @param res The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default <T extends Tup3fC> T revDivR(@MinLength(3) float[] v2, @ExtractionParam T res)
	{
		return Vec3fUtils.revDiv(this, v2, res);
	}
	
	/**
	 * Divides the given vector {@code (v2[0], v2[1], v2[2])} by this vector and saves the result in the extraction parameter {@code res}.
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
	 * @param v2 The vector to divide by this vector as an array with at least three entries.
	 * @param res The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default float[] revDivR(@MinLength(3) float[] v2, @ExtractionParam @MinLength(3) float[] res)
	{
		return Vec3fUtils.revDiv(this, v2, res);
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
	 * {@code (value, value, value) / v}
	 * 
	 * @param <T> The type of the extraction parameter.
	 * 
	 * @param value The value to divide by this vector.
	 * @param res The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default <T extends Tup3fC> T revDivR(float value, @ExtractionParam T res)
	{
		return Vec3fUtils.revDiv(this, value, value, value, res);
	}

	/**
	 * Divides the given value {@code (value)} by each component of this vector and saves the result in the extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (value, value, value) / v}
	 * 
	 * @param value The value to divide by this vector.
	 * @param res The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default float[] revDivR(float value, @ExtractionParam @MinLength(3) float[] res)
	{
		return Vec3fUtils.revDiv(this, value, value, value, res);
	}
	
	/**
	 * Divides the given vector {@code (v2x, v2y, v2z)} by this vector and saves the result in the extraction parameter {@code res}.
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
	 * @param <T> The type of the extraction parameter.
	 * 
	 * @param v2x The value of the x component to divide by this vector.
	 * @param v2y The value of the y component to divide by this vector.
	 * @param v2z The value of the z component to divide by this vector.
	 * @param res The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default <T extends Tup3fC> T revDivR(float v2x, float v2y, float v2z, @ExtractionParam T res)
	{
		return Vec3fUtils.revDiv(this, v2x, v2y, v2z, res);
	}
	
	/**
	 * Divides the given vector {@code (v2x, v2y, v2z)} by this vector and saves the result in the extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2x, v2y, v2z) / v}
	 * 
	 * @param v2x The value of the x component to divide by this vector.
	 * @param v2y The value of the y component to divide by this vector.
	 * @param v2z The value of the z component to divide by this vector.
	 * @param res The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default float[] revDivR(float v2x, float v2y, float v2z, @ExtractionParam @MinLength(3) float[] res)
	{
		return Vec3fUtils.revDiv(this, v2x, v2y, v2z, res);
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
	default <T extends Tup3fC> T halfVectorToR(Tup3fR v2, @ExtractionParam T res)
	{
		return Vec3fUtils.halfVectorTo(this, v2, res);
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
	 * @param res The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default float[] halfVectorToR(Tup3fR v2, @ExtractionParam @MinLength(3) float[] res)
	{
		return Vec3fUtils.halfVectorTo(this, v2, res);
	}
	
	/**
	 * Returns half the vector from the endpoint of this vector to the endpoint of the given vector {@code (v2[0], v2[1], v2[2])} as the extraction parameter {@code res}.
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
	 * @param <T> The type of the extraction parameter.
	 * 
	 * @param v2 The second vector as an array with at least three entries.
	 * @param res The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default <T extends Tup3fC> T halfVectorToR(@MinLength(3) float[] v2, @ExtractionParam T res)
	{
		return Vec3fUtils.halfVectorTo(this, v2, res);
	}
	
	/**
	 * Returns half the vector from the endpoint of this vector to the endpoint of the given vector {@code (v2[0], v2[1], v2[2])} as the extraction parameter {@code res}.
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
	 * @param v2 The second vector as an array with at least three entries.
	 * @param res The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default float[] halfVectorToR(@MinLength(3) float[] v2, @ExtractionParam @MinLength(3) float[] res)
	{
		return Vec3fUtils.halfVectorTo(this, v2, res);
	}
	
	/**
	 * Returns half the vector from the endpoint of this vector to the endpoint of the given vector {@code (v2x, v2y, v2z)} as the extraction parameter {@code res}.
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
	 * @param <T> The type of the extraction parameter.
	 * 
	 * @param v2x The value of the x component of the second vector.
	 * @param v2y The value of the y component of the second vector.
	 * @param v2z The value of the z component of the second vector.
	 * @param res The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default <T extends Tup3fC> T halfVectorToR(float v2x, float v2y, float v2z, @ExtractionParam T res)
	{
		return Vec3fUtils.halfVectorTo(this, v2x, v2y, v2z, res);
	}
	
	/**
	 * Returns half the vector from the endpoint of this vector to the endpoint of the given vector {@code (v2x, v2y, v2z)} as the extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ( (v2x, v2y, v2z) - v ) / 2}
	 * 
	 * @param v2x The value of the x component of the second vector.
	 * @param v2y The value of the y component of the second vector.
	 * @param v2z The value of the z component of the second vector.
	 * @param res The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default float[] halfVectorToR(float v2x, float v2y, float v2z, @ExtractionParam @MinLength(3) float[] res)
	{
		return Vec3fUtils.halfVectorTo(this, v2x, v2y, v2z, res);
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
	default <T extends Tup3fC> T halfPointBetweenR(Tup3fR v2, @ExtractionParam T res)
	{
		return Vec3fUtils.halfPointBetween(this, v2, res);
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
	default float[] halfPointBetweenR(Tup3fR v2, @ExtractionParam @MinLength(2) float[] res)
	{
		return Vec3fUtils.halfPointBetween(this, v2, res);
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
	default <T extends Tup3fC> T halfPointBetweenR(@MinLength(2) float[] v2, @ExtractionParam T res)
	{
		return Vec3fUtils.halfPointBetween(this, v2, res);
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
		return Vec3fUtils.halfPointBetween(this, v2, res);
	}
	
	/**
	 * Returns the origin vector to the point that lies half way between the endpoint of this vector and the endpoint of the given vector {@code (v2x, v2y, v2z)} as
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
	 * {@code ( (v2x, v2y, v2z) + v ) / 2}
	 * 
	 * @param <T> The type of the extraction parameter.
	 * 
	 * @param v2x The value of the x component of the second vector.
	 * @param v2y The value of the y component of the second vector.
	 * @param v2z The value of the z component of the second vector.
	 * @param res The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default <T extends Tup3fC> T halfPointBetweenR(float v2x, float v2y, float v2z, @ExtractionParam T res)
	{
		return Vec3fUtils.halfPointBetween(this, v2x, v2y, v2z, res);
	}
	
	/**
	 * Returns the origin vector to the point that lies half way between the endpoint of this vector and the endpoint of the given vector {@code (v2x, v2y, v2z)} as
	 * the extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ( (v2x, v2y, v2z) + v ) / 2}
	 * 
	 * @param v2x The value of the x component of the second vector.
	 * @param v2y The value of the y component of the second vector.
	 * @param v2z The value of the z component of the second vector.
	 * @param res The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default float[] halfPointBetweenR(float v2x, float v2y, float v2z, @ExtractionParam @MinLength(3) float[] res)
	{
		return Vec3fUtils.halfPointBetween(this, v2x, v2y, v2z, res);
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
	default <T extends Tup3fC> T negateR(@ExtractionParam T res)
	{
		return Vec3fUtils.negate(this, res);
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
	 * @param res The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default float[] negateR(@ExtractionParam @MinLength(3) float[] res)
	{
		return Vec3fUtils.negate(this, res);
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
	default <T extends Tup3fC> T inverseR(@ExtractionParam T res)
	{
		return Vec3fUtils.inverse(this, res);
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
	 * @param res The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default float[] inverseR(@ExtractionParam @MinLength(3) float[] res)
	{
		return Vec3fUtils.inverse(this, res);
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
	default <T extends Tup3fC> T normalizeR(@ExtractionParam T res)
	{
		return Vec3fUtils.normalize(this, res);
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
	 * @param res The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default float[] normalizeR(@ExtractionParam @MinLength(3) float[] res)
	{
		return Vec3fUtils.normalize(this, res);
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
	default <T extends Tup3fC> T minVectorR(Tup3fR v2, @ExtractionParam T res)
	{
		return Vec3fUtils.minVector(this, v2, res);
	}
	
	/**
	 * Compares each component of this vector with the corresponding component of the given vector {@code (v2)} and
	 * returns the smallest values as the extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * @param v2 The second vector.
	 * @param res The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default float[] minVectorR(Tup3fR v2, @ExtractionParam @MinLength(3) float[] res)
	{
		return Vec3fUtils.minVector(this, v2, res);
	}
	
	/**
	 * Compares each component of this vector with the corresponding component of the given vector {@code (v2[0], v2[1], v2[2])} and
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
	default <T extends Tup3fC> T minVectorR(@MinLength(3) float[] v2, @ExtractionParam T res)
	{
		return Vec3fUtils.minVector(this, v2, res);
	}
	
	/**
	 * Compares each component of this vector with the corresponding component of the given vector {@code (v2[0], v2[1], v2[2])} and
	 * returns the smallest values as the extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * It is safe to use the given vector {@code v2} as the extraction parameter.
	 * 
	 * @param v2 The second vector as an array with at least three entries.
	 * @param res The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default float[] minVectorR(@MinLength(3) float[] v2, @ExtractionParam @MinLength(3) float[] res)
	{
		return Vec3fUtils.minVector(this, v2, res);
	}
	
	/**
	 * Compares each component of this vector with the corresponding component of the given vector {@code (v2x, v2y, v2z)} and
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
	 * @param v2z The value of the z component of the second vector.
	 * @param res The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default <T extends Tup3fC> T minVectorR(float v2x, float v2y, float v2z, @ExtractionParam T res)
	{
		return Vec3fUtils.minVector(this, v2x, v2y, v2z, res);
	}
	
	/**
	 * Compares each component of this vector with the corresponding component of the given vector {@code (v2x, v2y, v2z)} and
	 * returns the smallest values as the extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * @param v2x The value of the x component of the second vector.
	 * @param v2y The value of the y component of the second vector.
	 * @param v2z The value of the z component of the second vector.
	 * @param res The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default float[] minVectorR(float v2x, float v2y, float v2z, @ExtractionParam @MinLength(3) float[] res)
	{
		return Vec3fUtils.minVector(this, v2x, v2y, v2z, res);
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
	default <T extends Tup3fC> T maxVectorR(Tup3fR v2, @ExtractionParam T res)
	{
		return Vec3fUtils.maxVector(this,  v2, res);
	}
	
	/**
	 * Compares each component of this vector with the corresponding component of the given vector {@code (v2)} and
	 * returns the greatest values as the extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * @param v2 The second vector.
	 * @param res The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default float[] maxVectorR(Tup3fR v2, @ExtractionParam @MinLength(3) float[] res)
	{
		return Vec3fUtils.maxVector(this, v2, res);
	}
	
	/**
	 * Compares each component of this vector with the corresponding component of the given vector {@code (v2[0], v2[1],v2[2])} and
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
	 * @param v2 The second vector as an array with at least three entries.
	 * @param res The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default <T extends Tup3fC> T maxVectorR(@MinLength(3) float[] v2, @ExtractionParam T res)
	{
		return Vec3fUtils.maxVector(this, v2, res);
	}
	
	/**
	 * Compares each component of this vector with the corresponding component of the given vector {@code (v2[0], v2[1], v2[2])} and
	 * returns the greatest values as the extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * It is safe to use the given vector {@code v2} as the extraction parameter.
	 * 
	 * @param v2 The second vector as an array with at least two entries.
	 * @param res The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default float[] maxVectorR(@MinLength(3) float[] v2, @ExtractionParam @MinLength(3) float[] res)
	{
		return Vec3fUtils.maxVector(this, v2, res);
	}
	
	/**
	 * Compares each component of this vector with the corresponding component of the given vector {@code (v2x, v2y, v2z)} and
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
	 * @param v2z The value of the z component of the second vector.
	 * @param res The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default <T extends Tup3fC> T maxVectorR(float v2x, float v2y, float v2z, @ExtractionParam T res)
	{
		return Vec3fUtils.maxVector(this, v2x, v2y, v2z, res);
	}
	
	/**
	 * Compares each component of this vector with the corresponding component of the given vector {@code (v2x, v2y, v2z)} and
	 * returns the greatest values as the extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * @param v2x The value of the x component of the second vector.
	 * @param v2y The value of the y component of the second vector.
	 * @param v2z The value of the z component of the second vector.
	 * @param res The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default float[] maxVectorR(float v2x, float v2y, float v2z, @ExtractionParam @MinLength(3) float[] res)
	{
		return Vec3fUtils.maxVector(this, v2x, v2y, v2z, res);
	}
	
	/**
	 * Rotates this vector by the given angle in radians around the rotation axis {@code (axis)} and saves the result in the given extraction parameter object.
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
	 * @param axis The rotation axis.
	 * @param angle The angle in radians.
	 * @param res The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	default <T extends Tup3fC> T rotateRadR(Tup3fR axis, float angle, @ExtractionParam T res)
	{
		return Vec3fUtils.rotateRad(this, axis, angle, res);
	}
	
	/**
	 * Rotates this vector by the given angle in radians around the rotation axis {@code (axis)} and saves the result in the given extraction parameter object.
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
	 * @param axis The rotation axis.
	 * @param angle The angle in radians.
	 * @param mathProvider The provider of fundamental math functions that should be used for calculation.
	 * @param res The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	default <T extends Tup3fC> T rotateRadR(Tup3fR axis, float angle, MathProvider mathProvider, @ExtractionParam T res)
	{
		return Vec3fUtils.rotateRad(this, axis, angle, mathProvider, res);
	}
	
	/**
	 * Rotates this vector by the given angle in radians around the rotation axis {@code (axis[0], axis[1], axis[2])} and saves the result in the given extraction parameter object.
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
	 * @param axis The rotation axis as an array with at least three entries.
	 * @param angle The angle in radians.
	 * @param res The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	default <T extends Tup3fC> T rotateRadR(@MinLength(3) float[] axis, float angle, @ExtractionParam T res)
	{
		return Vec3fUtils.rotateRad(this, axis, angle, res);
	}
	
	/**
	 * Rotates this vector by the given angle in radians around the rotation axis {@code (axis[0], axis[1], axis[2])} and saves the result in the given extraction parameter object.
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
	 * @param axis The rotation axis as an array with at least three entries.
	 * @param angle The angle in radians.
	 * @param mathProvider The provider of fundamental math functions that should be used for calculation.
	 * @param res The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	default <T extends Tup3fC> T rotateRadR(@MinLength(3) float[] axis, float angle, MathProvider mathProvider, @ExtractionParam T res)
	{
		return Vec3fUtils.rotateRad(this, axis, angle, mathProvider, res);
	}
	
	/**
	 * Rotates this vector by the given angle in radians around the rotation axis {@code (axisX, axisY, axisZ)} and saves the result in the given extraction parameter object.
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
	 * @param axisX The value of the x component of the rotation axis.
	 * @param axisY The value of the y component of the rotation axis.
	 * @param axisZ The value of the z component of the rotation axis.
	 * @param angle The angle in radians.
	 * @param res The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	default <T extends Tup3fC> T rotateRadR(float axisX, float axisY, float axisZ, float angle, @ExtractionParam T res)
	{
		return Vec3fUtils.rotateRad(this, axisX, axisY, axisZ, angle, res);
	}
	
	/**
	 * Rotates this vector by the given angle in radians around the rotation axis {@code (axisX, axisY, axisZ)} and saves the result in the given extraction parameter object.
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
	 * @param axisX The value of the x component of the rotation axis.
	 * @param axisY The value of the y component of the rotation axis.
	 * @param axisZ The value of the z component of the rotation axis.
	 * @param angle The angle in radians.
	 * @param mathProvider The provider of fundamental math functions that should be used for calculation.
	 * @param res The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	default <T extends Tup3fC> T rotateRadR(float axisX, float axisY, float axisZ, float angle, MathProvider mathProvider, @ExtractionParam T res)
	{
		return Vec3fUtils.rotateRad(this, axisX, axisY, axisZ, angle, mathProvider, res);
	}
	
	/**
	 * Rotates this vector by the given angle in radians around the rotation axis {@code (axis)} and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for calculation.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * @param axis The rotation axis.
	 * @param angle The angle in radians.
	 * @param res The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default float[] rotateRadR(Tup3fR axis, float angle, @ExtractionParam @MinLength(3) float[] res)
	{
		return Vec3fUtils.rotateRad(this, axis, angle, res);
	}
	
	/**
	 * Rotates this vector by the given angle in radians around the rotation axis {@code (axis)} and saves the result in the given extraction parameter.
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
	 * @param axis The rotation axis.
	 * @param angle The angle in radians.
	 * @param mathProvider The provider of fundamental math functions that should be used for calculation.
	 * @param res The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default float[] rotateRadR(Tup3fR axis, float angle, MathProvider mathProvider, @ExtractionParam @MinLength(2) float[] res)
	{
		return Vec3fUtils.rotateRad(this, axis, angle, mathProvider, res);
	}
	
	/**
	 * Rotates this vector by the given angle in radians around the rotation axis {@code (axis[0], axis[1], axis[2])} and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for calculation.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * @param axis The rotation axis as an array with at least three entries.
	 * @param angle The angle in radians.
	 * @param res The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default float[] rotateRadR(@MinLength(3) float[] axis, float angle, @ExtractionParam @MinLength(3) float[] res)
	{
		return Vec3fUtils.rotateRad(this, axis, angle, res);
	}
	
	/**
	 * Rotates this vector by the given angle in radians around the rotation axis {@code (axis[0], axis[1], axis[2])} and saves the result in the given extraction parameter.
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
	 * @param axis The rotation axis as an array with at least three entries.
	 * @param angle The angle in radians.
	 * @param mathProvider The provider of fundamental math functions that should be used for calculation.
	 * @param res The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default float[] rotateRadR(@MinLength(3) float[] axis, float angle, MathProvider mathProvider, @ExtractionParam @MinLength(2) float[] res)
	{
		return Vec3fUtils.rotateRad(this, axis, angle, mathProvider, res);
	}
	
	/**
	 * Rotates this vector by the given angle in radians around the rotation axis {@code (axisX, axisY, axisZ)} and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for calculation.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * @param axisX The value of the x component of the rotation axis.
	 * @param axisY The value of the y component of the rotation axis.
	 * @param axisZ The value of the z component of the rotation axis.
	 * @param angle The angle in radians.
	 * @param res The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default float[] rotateRadR(float axisX, float axisY, float axisZ, float angle, @ExtractionParam @MinLength(3) float[] res)
	{
		return Vec3fUtils.rotateRad(this, axisX, axisY, axisZ, angle, res);
	}
	
	/**
	 * Rotates this vector by the given angle in radians around the rotation axis {@code (axisX, axisY, axisZ)} and saves the result in the given extraction parameter.
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
	 * @param axisX The value of the x component of the rotation axis.
	 * @param axisY The value of the y component of the rotation axis.
	 * @param axisZ The value of the z component of the rotation axis.
	 * @param angle The angle in radians.
	 * @param mathProvider The provider of fundamental math functions that should be used for calculation.
	 * @param res The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default float[] rotateRadR(float axisX, float axisY, float axisZ, float angle, MathProvider mathProvider, @ExtractionParam @MinLength(2) float[] res)
	{
		return Vec3fUtils.rotateRad(this, axisX, axisY, axisZ, angle, mathProvider, res);
	}
	
	/**
	 * Rotates this vector by the given angle in degrees around the rotation axis {@code (axis)} and saves the result in the given extraction parameter object.
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
	 * @param axis The rotation axis.
	 * @param angle The angle in radians.
	 * @param res The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	default <T extends Tup3fC> T rotateDegR(Tup3fR axis, float angle, @ExtractionParam T res)
	{
		return Vec3fUtils.rotateDeg(this, axis, angle, res);
	}
	
	/**
	 * Rotates this vector by the given angle in degrees around the rotation axis {@code (axis)} and saves the result in the given extraction parameter object.
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
	 * @param axis The rotation axis
	 * @param angle The angle in radians.
	 * @param mathProvider The provider of fundamental math functions that should be used for calculation.
	 * @param res The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	default <T extends Tup3fC> T rotateDegR(Tup3fR axis, float angle, MathProvider mathProvider, @ExtractionParam T res)
	{
		return Vec3fUtils.rotateDeg(this, axis, angle, mathProvider, res);
	}
	
	/**
	 * Rotates this vector by the given angle in degrees around the rotation axis {@code (axis[0], axis[1], axis[2])} and saves the result in the given extraction parameter object.
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
	 * @param axis The rotation axis as an array with at least three entries.
	 * @param angle The angle in radians.
	 * @param res The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	default <T extends Tup3fC> T rotateDegR(@MinLength(3) float[] axis, float angle, @ExtractionParam T res)
	{
		return Vec3fUtils.rotateDeg(this, axis, angle, res);
	}
	
	/**
	 * Rotates this vector by the given angle in degrees around the rotation axis {@code (axis[0], axis[1], axis[2])} and saves the result in the given extraction parameter object.
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
	 * @param axis The rotation axis as an array with at least three entries.
	 * @param angle The angle in radians.
	 * @param mathProvider The provider of fundamental math functions that should be used for calculation.
	 * @param res The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	default <T extends Tup3fC> T rotateDegR(@MinLength(3) float[] axis, float angle, MathProvider mathProvider, @ExtractionParam T res)
	{
		return Vec3fUtils.rotateDeg(this, axis, angle, mathProvider, res);
	}
	
	/**
	 * Rotates this vector by the given angle in degrees around the rotation axis {@code (axisX, axisY, axisZ)} and saves the result in the given extraction parameter object.
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
	 * @param axisX The value of the x component of the rotation axis.
	 * @param axisY The value of the y component of the rotation axis.
	 * @param axisZ The value of the z component of the rotation axis.
	 * @param angle The angle in radians.
	 * @param res The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	default <T extends Tup3fC> T rotateDegR(float axisX, float axisY, float axisZ, float angle, @ExtractionParam T res)
	{
		return Vec3fUtils.rotateDeg(this, axisX, axisY, axisZ, angle, res);
	}
	
	/**
	 * Rotates this vector by the given angle in degrees around the rotation axis {@code (axisX, axisY, axisZ)} and saves the result in the given extraction parameter object.
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
	 * @param axisX The value of the x component of the rotation axis.
	 * @param axisY The value of the y component of the rotation axis.
	 * @param axisZ The value of the z component of the rotation axis.
	 * @param angle The angle in radians.
	 * @param mathProvider The provider of fundamental math functions that should be used for calculation.
	 * @param res The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	default <T extends Tup3fC> T rotateDegR(float axisX, float axisY, float axisZ, float angle, MathProvider mathProvider, @ExtractionParam T res)
	{
		return Vec3fUtils.rotateDeg(this, axisX, axisY, axisZ, angle, mathProvider, res);
	}
	
	/**
	 * Rotates this vector by the given angle in degrees around the rotation axis {@code (axis)} and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for calculation.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * @param axis The rotation axis.
	 * @param angle The angle in radians.
	 * @param res The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default float[] rotateDegR(Tup3fR axis, float angle, @ExtractionParam @MinLength(3) float[] res)
	{
		return Vec3fUtils.rotateDeg(this, axis, angle, res);
	}
	
	/**
	 * Rotates this vector by the given angle in degrees around the rotation axis {@code (axis)} and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * @param axis The rotation axis.
	 * @param angle The angle in radians.
	 * @param mathProvider The provider of fundamental math functions that should be used for calculation.
	 * @param res The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default float[] rotateDegR(Tup3fR axis, float angle, MathProvider mathProvider, @ExtractionParam @MinLength(3) float[] res)
	{
		return Vec3fUtils.rotateDeg(this, axis, angle, mathProvider, res);
	}
	
	/**
	 * Rotates this vector by the given angle in degrees around the rotation axis {@code (axis[0], axis[1], axis[2])} and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for calculation.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * @param axis The rotation axis as an array with at least three entries.
	 * @param angle The angle in radians.
	 * @param res The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default float[] rotateDegR(@MinLength(3) float[] axis, float angle, @ExtractionParam @MinLength(3) float[] res)
	{
		return Vec3fUtils.rotateDeg(this, axis, angle, res);
	}
	
	/**
	 * Rotates this vector by the given angle in degrees around the rotation axis {@code (axis[0], axis[1], axis[2])} and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * @param axis The rotation axis as an array with at least three entries.
	 * @param angle The angle in radians.
	 * @param mathProvider The provider of fundamental math functions that should be used for calculation.
	 * @param res The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default float[] rotateDegR(@MinLength(3) float[] axis, float angle, MathProvider mathProvider, @ExtractionParam @MinLength(3) float[] res)
	{
		return Vec3fUtils.rotateDeg(this, axis, angle, mathProvider, res);
	}
	
	/**
	 * Rotates this vector by the given angle in degrees around the rotation axis {@code (axisX, axisY, axisZ)} and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for calculation.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * @param axisX The value of the x component of the rotation axis.
	 * @param axisY The value of the y component of the rotation axis.
	 * @param axisZ The value of the z component of the rotation axis.
	 * @param angle The angle in radians.
	 * @param res The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default float[] rotateDegR(float axisX, float axisY, float axisZ, float angle, @ExtractionParam @MinLength(3) float[] res)
	{
		return Vec3fUtils.rotateDeg(this, axisX, axisY, axisZ, angle, res);
	}
	
	/**
	 * Rotates this vector by the given angle in degrees around the rotation axis {@code (axisX, axisY, axisZ)} and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * @param axisX The value of the x component of the rotation axis.
	 * @param axisY The value of the y component of the rotation axis.
	 * @param axisZ The value of the z component of the rotation axis.
	 * @param angle The angle in radians.
	 * @param mathProvider The provider of fundamental math functions that should be used for calculation.
	 * @param res The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default float[] rotateDegR(float axisX, float axisY, float axisZ, float angle, MathProvider mathProvider, @ExtractionParam @MinLength(3) float[] res)
	{
		return Vec3fUtils.rotateDeg(this, axisX, axisY, axisZ, angle, mathProvider, res);
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
	default <T extends Tup3fC> T projectR(Tup3fR t, @ExtractionParam T res)
	{
		return Vec3fUtils.project(this, t, res);
	}
	
	/**
	 * Calculates the orthogonal projection of this vector onto the normalized target vector {@code (t[0], t[1], t[2])}
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
	 * {@code (t[0], t[1], t[2]) * (v . (t[0], t[1], t[2]))}
	 * 
	 * @param <T> The type of the extraction parameter.
	 * 
	 * @param t The projection target vector as an array with at least three entries.
	 * @param res The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	default <T extends Tup3fC> T projectR(@MinLength(3) float[] t, @ExtractionParam T res)
	{
		return Vec3fUtils.project(this, t, res);
	}
	
	/**
	 * Calculates the orthogonal projection of this vector onto the normalized target vector {@code (tX, tY, tZ)}
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
	 * {@code (tX, tY, tZ) * (v . (tX, tY, tZ))}
	 * 
	 * @param <T> The type of the extraction parameter.
	 * 
	 * @param tX The value of the x component of the projection target vector.
	 * @param tY The value of the y component of the projection target vector.
	 * @param tZ The value of the z component of the projection target vector.
	 * @param res The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	default <T extends Tup3fC> T projectR(float tX, float tY, float tZ, @ExtractionParam T res)
	{
		return Vec3fUtils.project(this, tX, tY, tZ, res);
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
	default float[] projectR(Tup3fR t, @ExtractionParam @MinLength(3) float[] res)
	{
		return Vec3fUtils.project(this, t, res);
	}
	
	/**
	 * Calculates the orthogonal projection of this vector onto the normalized target vector {@code (t[0], t[1], t[2])}
	 * and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (t[0], t[1], t[2]) * (v . (t[0], t[1], t[2]))}
	 * 
	 * @param t The projection target vector as an array with at least three entries.
	 * @param res The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default float[] projectR(@MinLength(3) float[] t, @ExtractionParam @MinLength(3) float[] res)
	{
		return Vec3fUtils.project(this, t, res);
	}
	
	/**
	 * Calculates the orthogonal projection of this vector onto the normalized target vector {@code (tX, tY, tZ)}
	 * and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (tX, tY, tZ) * (v . (tX, tY, tZ))}
	 * 
	 * @param tX The value of the x component of the projection target vector.
	 * @param tY The value of the y component of the projection target vector.
	 * @param tZ The value of the z component of the projection target vector.
	 * @param res The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default float[] projectR(float tX, float tY, float tZ, @ExtractionParam @MinLength(3) float[] res)
	{
		return Vec3fUtils.project(this, tX, tY, tZ, res);
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
	default <T extends Tup3fC> T reflectR(Tup3fR n, @ExtractionParam T res)
	{
		return Vec3fUtils.reflect(this,  n, res);
	}
	
	/**
	 * Calculates the reflection of this vector based on the given normalized surface normal {@code (n[0], n[1], n[2])}
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
	 * @param n The surface normal vector as an array with at least three entries.
	 * @param res The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	default <T extends Tup3fC> T reflectR(@MinLength(3) float[] n, @ExtractionParam T res)
	{
		return Vec3fUtils.reflect(this, n, res);
	}
	
	/**
	 * Calculates the reflection of this vector based on the given normalized surface normal {@code (nX, nY, nZ)}
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
	 * @param nZ The value of the z component of the surface normal vector.
	 * @param res The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	default <T extends Tup3fC> T reflectR(float nX, float nY, float nZ, @ExtractionParam T res)
	{
		return Vec3fUtils.reflect(this, nX, nY, nZ, res);
	}
	
	/**
	 * Calculates the reflection of this vector based on the given normalized surface normal {@code (n)}
	 * and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * @param n The surface normal vector.
	 * @param res The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default float[] reflectR(Tup3fR n, @ExtractionParam @MinLength(3) float[] res)
	{
		return Vec3fUtils.reflect(this, n, res);
	}
	
	/**
	 * Calculates the reflection of this vector based on the given normalized surface normal {@code (n[0], n[1], n[2])}
	 * and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * @param n The surface normal vector as an array with at least three entries.
	 * @param res The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default float[] reflectR(@MinLength(3) float[] n, @ExtractionParam @MinLength(3) float[] res)
	{
		return Vec3fUtils.reflect(this, n, res);
	}
	
	/**
	 * Calculates the reflection of this vector based on the given normalized surface normal {@code (nX, nY, nZ)}
	 * and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * @param nX The value of the x component of the surface normal vector.
	 * @param nY The value of the y component of the surface normal vector.
	 * @param nZ The value of the z component of the surface normal vector.
	 * @param res The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default float[] reflectR(float nX, float nY, float nZ, @ExtractionParam @MinLength(3) float[] res)
	{
		return Vec3fUtils.reflect(this, nX, nY, nZ, res);
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
	default <T extends Tup3fC> T ceilR(@ExtractionParam T res)
	{
		return Vec3fUtils.ceil(this, res);
	}
	
	/**
	 * Rounds the components of this vector towards the next greater integer and saves the result in the extraction parameter.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * @param res The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default float[] ceilR(@ExtractionParam @MinLength(3) float[] res)
	{
		return Vec3fUtils.ceil(this, res);
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
	default <T extends Tup3fC> T floorR(@ExtractionParam T res)
	{
		return Vec3fUtils.floor(this, res);
	}
	
	/**
	 * Rounds the components of this vector towards the next smaller integer and saves the result in the extraction parameter.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * @param res The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default float[] floorR(@ExtractionParam @MinLength(3) float[] res)
	{
		return Vec3fUtils.floor(this, res);
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
	default <T extends Tup3fC> T roundR(@ExtractionParam T res)
	{
		return Vec3fUtils.round(this, res);
	}
	
	/**
	 * Rounds the components of this vector and saves the result in the extraction parameter.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * @param res The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default float[] roundR(@ExtractionParam @MinLength(3) float[] res)
	{
		return Vec3fUtils.round(this, res);
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
	default <T extends Tup3fC> T truncR(@ExtractionParam T res)
	{
		return Vec3fUtils.trunc(this, res);
	}
	
	/**
	 * Truncates the decimals of the components of this vector and saves the result in the extraction parameter.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * @param res The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default float[] truncR(@ExtractionParam @MinLength(3) float[] res)
	{
		return Vec3fUtils.trunc(this, res);
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
	default <T extends Tup3fC> T roundR(FloatRoundMethod method, @ExtractionParam T res)
	{
		return Vec3fUtils.round(this, method, res);
	}
	
	/**
	 * Rounds the components of this vector using the given method and saves the result in the extraction parameter.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * @param method The Method to use for rounding.
	 * @param res The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default float[] roundR(FloatRoundMethod method, @ExtractionParam @MinLength(3) float[] res)
	{
		return Vec3fUtils.round(this, method, res);
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
	default <T extends Tup3fC> T absR(@ExtractionParam T res)
	{
		return Vec3fUtils.abs(this, res);
	}
	
	/**
	 * Calculates the absolute values of the component values and saves the result in the extraction parameter.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * @param res The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default float[] absR(@ExtractionParam @MinLength(3) float[] res)
	{
		return Vec3fUtils.abs(this, res);
	}
	
	/**
	 * Calculates the cross product between this vector and the second given vector {@code (v2)} and saves the result in the extraction parameter.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v X v2}
	 * 
	 * @param <T> The type of the extraction parameter.
	 * 
	 * @param v2 The second vector.
	 * @param res The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default <T extends Tup3fC> T crossR(Tup3fR v2, @ExtractionParam T res)
	{
		return Vec3fUtils.cross(this, v2.getV0(), v2.getV1(), v2.getV2(), res);
	}
	
	/**
	 * Calculates the cross product between this vector and the second given vector {@code (v2[0], v2[1], v2[2])} and saves the result in the extraction parameter.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v X (v2[0], v2[1], v2[2])}
	 * 
	 * @param <T> The type of the extraction parameter.
	 * 
	 * @param v2 The second vector as an array with at least three entries.
	 * @param res The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default <T extends Tup3fC> T crossR(@MinLength(3) float[] v2, @ExtractionParam T res)
	{
		return Vec3fUtils.cross(this, v2[0], v2[1], v2[2], res);
	}
	
	/**
	 * Calculates the cross product between this vector and the second given vector {@code (value, value, value)} and saves the result in the extraction parameter.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v X (value, value, value)}
	 * 
	 * @param <T> The type of the extraction parameter.
	 * 
	 * @param value The value for all the components of the second vector.
	 * @param res The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default <T extends Tup3fC> T crossR(float value, @ExtractionParam T res)
	{
		return Vec3fUtils.cross(this, value, value, value, res);
	}
	
	/**
	 * Calculates the cross product between this vector and the second given vector {@code (v2x, v2y, v2z)} and saves the result in the extraction parameter.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v X (v2x, v2y, v2z)}
	 * 
	 * @param <T> The type of the extraction parameter.
	 * 
	 * @param v2x The value of the x component of the second vector.
	 * @param v2y The value of the y component of the second vector.
	 * @param v2z The value of the z component of the second vector.
	 * @param res The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default <T extends Tup3fC> T crossR(float v2x, float v2y, float v2z, @ExtractionParam T res)
	{
		return Vec3fUtils.cross(this, v2x, v2y, v2z, res);
	}
	
	/**
	 * Calculates the cross product between this vector and the second given vector {@code (v2)} and saves the result in the extraction parameter.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v X v2}
	 * 
	 * @param v2 The second vector.
	 * @param res The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default float[] crossR(Tup3fR v2, @ExtractionParam @MinLength(3) float[] res)
	{
		return Vec3fUtils.cross(this, v2.getV0(), v2.getV1(), v2.getV2(), res);
	}
	
	/**
	 * Calculates the cross product between this vector and the second given vector {@code (v2[0], v2[1], v2[2])} and saves the result in the extraction parameter.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v X (v2[0], v2[1], v2[2])}
	 * 
	 * @param v2 The second vector as an array with at least three entries.
	 * @param res The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default float[] crossR(@MinLength(3) float[] v2, @ExtractionParam @MinLength(3) float[] res)
	{
		return Vec3fUtils.cross(this, v2[0], v2[1], v2[2], res);
	}
	
	/**
	 * Calculates the cross product between this vector and the second given vector {@code (value, value, value)} and saves the result in the extraction parameter.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v X (value, value, value)}
	 * 
	 * @param value The value for all the components of the second vector.
	 * @param res The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default float[] crossR(float value, @ExtractionParam @MinLength(3) float[] res)
	{
		return Vec3fUtils.cross(this, value, value, value, res);
	}
	
	/**
	 * Calculates the cross product between this vector and the second given vector {@code (v2x, v2y, v2z)} and saves the result in the extraction parameter.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v X (v2x, v2y, v2z)}
	 * 
	 * @param v2x The value of the x component of the second vector.
	 * @param v2y The value of the y component of the second vector.
	 * @param v2z The value of the z component of the second vector.
	 * @param res The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default float[] crossR(float v2x, float v2y, float v2z, @ExtractionParam @MinLength(3) float[] res)
	{
		return Vec3fUtils.cross(this, v2x, v2y, v2z, res);
	}
	
	/**
	 * Calculates the {@link Math#signum(float) signum} of the components of this vecotr and saves the result in the extraction parameter.
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
	default <T extends Tup3fC> T signumR(@ExtractionParam T res)
	{
		return Vec3fUtils.signum(this, res);
	}
	
	/**
	 * Calculates the {@link Math#signum(float) signum} of the components of this vecotr and saves the result in the extraction parameter.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * @param res The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default float[] signumR(@ExtractionParam @MinLength(3) float[] res)
	{
		return Vec3fUtils.signum(this, res);
	}
}
