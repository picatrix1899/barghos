//package org.barghos.math.api.vector;
//
//import org.barghos.core.api.math.BarghosMath;
//import org.barghos.core.api.math.FloatRoundMethod;
//import org.barghos.documentation.ExtractionParam;
//import org.barghos.documentation.MinLength;
//import org.barghos.math.api.util.ComponentValueFloat;
//
///**
// * This interface grants readonly access to any 3-dimensional float vector.
// * 
// * @author picatrix1899
// */
//public interface Vec3fR extends SimpleVec3fR
//{
//	
//	/**
//	 * Creates a new instance of the current class with the same component valuess.
//	 * 
//	 * @return A new instance.
//	 */
//	Vec3fR copy();
//	
//	/**
//	 * Returns the inverse (reciprocal) length (magnitude, norm) of the vector.
//	 * If this vector is a zero-vector {@code (x=y=z=0)} this will throw an {@link ArithmeticException}
//	 * as this would result in a division by zero.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code 1 / |v|}
//	 * 
//	 * @return The inverse length of the vector.
//	 */
//	float inverseLength();
//	
//	/**
//	 * Returns the inverse (reciprocal) distance between the vector
//	 * and the given vector {@code (v2)}.
//	 * If the two vectors are the same this will throw an {@link ArithmeticException}
//	 * as this would result in a division by zero.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code 1 / |v2 - v|}
//	 * 
//	 * @param v2 The second vector.
//	 * 
//	 * @return The inverse distance between the two vectors.
//	 */
//	default float inverseDistance(SimpleVec3fR v2)
//	{
//		return inverseDistance(v2.getX(), v2.getY(), v2.getZ());
//	}
//	
//	/**
//	 * Returns the inverse (reciprocal) distance between the vector
//	 * and the given vector {@code (v2[0], v2[1], v2[2])}.
//	 * If the two vectors are the same this will throw an {@link ArithmeticException}
//	 * as this would result in a division by zero.
//	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
//	 * has to contain at least 3 entries.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code 1 / |(v2[0], v2[1], v2[2]) - v|}
//	 * 
//	 * @param v2 The second vector. Minimum legth: 3.
//	 * 
//	 * @return The inverse distance between the two vectors.
//	 */
//	default float inverseDistance(@MinLength(3) float[] v2)
//	{
//		return inverseDistance(v2[0], v2[1], v2[2]);
//	}
//	
//	/**
//	 * Returns the inverse (reciprocal) distance between the vector
//	 * and the given vector {@code (v2x, v2y, v2z)}.
//	 * If the two vectors are the same this will throw an {@link ArithmeticException}
//	 * as this would result in a division by zero.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code 1 / |(v2x, v2y, v2z) - v|}
//	 * 
//	 * @param v2x The value of the x component of the second vector.
//	 * @param v2y The value of the y component of the second vector.
//	 * @param v2z The value of the z component of the second vector.
//	 * 
//	 * @return The inverse distance between the two vectors.
//	 */
//	float inverseDistance(float v2x, float v2y, float v2z);
//	
//	/**
//	 * Returns the length (magnitude, norm) of the vector.
//	 * If the vector is a zero-vector {@code (x=y=z=0)} this will throw an {@link ArithmeticException}
//	 * as this would result in a division by zero.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code |v|}
//	 * 
//	 * @return The length of the vector.
//	 */
//	float lengthUnsafe();
//	
//	/**
//	 * Returns the distance between the vector and the given vector {@code (v2)}.
//	 * If the vector is a zero-vector {@code (x=y=z=0)} this will throw an {@link ArithmeticException}
//	 * as this would result in a division by zero.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code |v2 - v|}
//	 * 
//	 * @param v2 The second vector.
//	 * 
//	 * @return The distance between the two vectors.
//	 */
//	default float distanceUnsafe(SimpleVec3fR v2)
//	{
//		return distanceUnsafe(v2.getX(), v2.getY(), v2.getZ());
//	}
//	
//	/**
//	 * Returns the distance between the vector and the given vector {@code (v2[0], v2[1], v2[2])}.
//	 * If the vector is a zero-vector {@code (x=y=z=0)} this will throw an {@link ArithmeticException}
//	 * as this would result in a division by zero.
//	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
//	 * has to contain at least 3 entries.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code |(v2[0], v2[1], v2[2]) - v|}
//	 * 
//	 * @param v2 The second vector. Minimum legth: 3.
//	 * 
//	 * @return The distance between the two vectors.
//	 */
//	default float distanceUnsafe(@MinLength(3) float[] v2)
//	{
//		return distanceUnsafe(v2[0], v2[1], v2[2]);
//	}
//	
//	/**
//	 * Returns the distance between the vector and the given vector {@code (v2x, v2y, v2z)}.
//	 * If the vector is a zero-vector {@code (x=y=z=0)} this will throw an {@link ArithmeticException}
//	 * as this would result in a division by zero.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code |(v2x, v2y, v2z) - v|}
//	 * 
//	 * @param v2x The value of the x component of the second vector.
//	 * @param v2y The value of the y component of the second vector.
//	 * @param v2z The value of the z component of the second vector.
//	 * 
//	 * @return The distance between the two vectors.
//	 */
//	float distanceUnsafe(float v2x, float v2y, float v2z);
//	
//	/**
//	 * Returns the length (magnitude, norm) of the vector.
//	 * If the vector is a zero-vector {@code (x=y=z=0)} the result will be zero.
//	 * It determines a length of zero by checking if all components are exactly zero.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code |v|}
//	 * 
//	 * @return The length of the vector or zero if it is a zero-vector.
//	 */
//	float length();
//	
//	/**
//	 * Returns the distance between the vector and the given vector {@code (v2)}.
//	 * If the vectors are equal the result will be zero.
//	 * It determines an equality by checking if all components are exactly the same.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code |v2 - v|}
//	 * 
//	 * @param v2 The second vector.
//	 * 
//	 * @return The distance between the vectors or zero if the two vectors are equal.
//	 */
//	default float distance(SimpleVec3fR v2)
//	{
//		return distance(v2.getX(), v2.getY(), v2.getZ());
//	}
//	
//	/**
//	 * Returns the distance between the vector and the given vector {@code (v2[0], v2[1], v2[2])}.
//	 * If the vectors are equal the result will be zero.
//	 * It determines an equality by checking if all components are exactly the same.
//	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
//	 * has to contain at least 3 entries.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code |(v2[0], v2[1], v2[2]) - v|}
//	 * 
//	 * @param v2 The second vector. Minimum legth: 3.
//	 * 
//	 * @return The distance between the vectors or zero if the two vectors are equal.
//	 */
//	default float distance(@MinLength(3) float[] v2)
//	{
//		return distance(v2[0], v2[1], v2[2]);
//	}
//	
//	/**
//	 * Returns the distance between the vector and the given vector {@code (v2z, v2y, v2z)}.
//	 * If the vectors are equal the result will be zero.
//	 * It determines an equality by checking if all components are exactly the same.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code |(v2x, v2y, v2z) - v|}
//	 * 
//	 * @param v2x The value of the x component of the second vector.
//	 * @param v2y The value of the y component of the second vector.
//	 * @param v2z The value of the z component of the second vector.
//	 * 
//	 * @return The distance between the vectors or zero if the two vectors are equal.
//	 */
//	float distance(float v2x, float v2y, float v2z);
//	
//	/**
//	 * Returns the length (magnitude, norm) of the vector.
//	 * If the vector is a zero-vector {@code (x=y=z=0)} the result will be zero.
//	 * It determines a length of zero by checking if all components are within the margin defined by
//	 * zero plus-minus the given tolerance inclusive {@code (-tolerance <= value <= tolerance)}.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code |v|}
//	 * 
//	 * @param tolerance The tolerance for defining the margin around zero.
//	 * 
//	 * @return The length of the vector or zero if it is a zero-vector.
//	 */
//	float length(@FloatMinValue(0.0f) float tolerance);
//	
//	/**
//	 * Returns the distance between the vector and the given vector {@code (v2)}.
//	 * If the two vectors are equal the result will be zero.
//	 * It determines an equality by checking if all components are equal within a margin of plus-minus the given tolerance inclusive {@code (-tolerance <= value <= tolerance)}
//	 * around the component values.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code |v2 - v|}
//	 * 
//	 * @param v2 The second vector.
//	 * @param tolerance The tolerance for defining the margin.
//	 * 
//	 * @return The distance between the vectors or zero if the two vectors are equal withing the tolerance.
//	 */
//	default float distance(SimpleVec3fR v2, @FloatMinValue(0.0f) float tolerance)
//	{
//		return distance(v2.getX(), v2.getY(), v2.getZ(), tolerance);
//	}
//	
//	/**
//	 * Returns the distance between the vector and the given vector {@code (v2[0], v2[1], v2[2])}.
//	 * If the two vectors are equal the result will be zero.
//	 * It determines an equality by checking if all components are equal within a margin of plus-minus the given tolerance inclusive {@code (-tolerance <= value <= tolerance)}
//	 * around the component values.
//	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
//	 * has to contain at least 3 entries.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code |(v2[0], v2[1], v2[2]) - v|}
//	 * 
//	 * @param v2 The second vector. Minimum legth: 3.
//	 * @param tolerance The tolerance for defining the margin.
//	 * 
//	 * @return The distance between the vectors or zero if the two vectors are equal withing the tolerance.
//	 */
//	default float distance(@MinLength(3) float[] v2, @FloatMinValue(0.0f) float tolerance)
//	{
//		return distance(v2[0], v2[1], v2[2], tolerance);
//	}
//	
//	/**
//	 * Returns the distance between the vector and the given vector {@code (v2x, v2y, v2z)}.
//	 * If the two vectors are equal the result will be zero.
//	 * It determines an equality by checking if all components are equal within a margin of plus-minus the given tolerance inclusive {@code (-tolerance <= value <= tolerance)}
//	 * around the component values.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code |(v2x, v2y, v2z) - v|}
//	 * 
//	 * @param v2x The value of the x component of the second vector.
//	 * @param v2y The value of the y component of the second vector.
//	 * @param v2z The value of the z component of the second vector.
//	 * @param tolerance The tolerance for defining the margin.
//	 * 
//	 * @return The distance between the vectors or zero if the two vectors are equal withing the tolerance.
//	 */
//	float distance(float v2x, float v2y, float v2z, @FloatMinValue(0.0f) float tolerance);
//	
//	/**
//	 * Returns the squared length (magnitude, norm) of the vector.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code |v|^2}
//	 * 
//	 * @return The squared length of the vector.
//	 */
//	float squaredLengthUnsafe();
//	
//	/**
//	 * Returns the squared distance between the vector and the given vector {@code (v2)}.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code |v2 - v|^2}
//	 * 
//	 * @param v2 The second vector.
//	 * 
//	 * @return The squared distance between the vectors.
//	 */
//	default float squaredDistanceUnsafe(SimpleVec3fR v2)
//	{
//		return squaredDistanceUnsafe(v2.getX(), v2.getY(), v2.getZ());
//	}
//	
//	/**
//	 * Returns the squared distance between the vector and the given vector {@code (v2[0], v2[1], v2[2])}.
//	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
//	 * has to contain at least 3 entries.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code |(v2[0], v2[1], v2[2]) - v|^2}
//	 * 
//	 * @param v2 The second vector. Minimum legth: 3.
//	 * 
//	 * @return The squared distance between the vectors.
//	 */
//	default float squaredDistanceUnsafe(@MinLength(3) float[] v2)
//	{
//		return squaredDistanceUnsafe(v2[0], v2[1], v2[2]);
//	}
//	
//	/**
//	 * Returns the squared distance between the vector and the given vector {@code (v2x, v2y, v2z)}.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code |(v2x, v2y, v2z) - v|^2}
//	 * 
//	 * @param v2x The value of the x component of the second vector.
//	 * @param v2y The value of the y component of the second vector.
//	 * @param v2z The value of the z component of the second vector.
//	 * 
//	 * @return The squared distance between the vectors.
//	 */
//	float squaredDistanceUnsafe(float v2x, float v2y, float v2z);
//	
//	/**
//	 * Returns the squared length of the vector {@code (v)}.
//	 * If the vector is a zero-vector {@code (x=y=z=0)} the result will be zero.
//	 * It determines a length of zero by checking if all components are exactly zero.
//	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
//	 * has to contain at least 3 entries.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code |v|^2}
//	 * 
//	 * @return The squared length of the vector or zero if it is a zero-vector.
//	 */
//	float squaredLength();
//	
//	/**
//	 * Returns the squared distance between the vector and the given vector {@code (v2)}.
//	 * If the two vectors are equal the result will be zero.
//	 * It determines an equality by checking if all components are exactly the same.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code |v2 - v|^2}
//	 * 
//	 * @param v2 The second vector.
//	 * 
//	 * @return The squared distance between the vectors or zero if both vectors are equal.
//	 */
//	default float squaredDistance(SimpleVec3fR v2)
//	{
//		return squaredDistance(v2.getX(), v2.getY(), v2.getZ());
//	}
//	
//	/**
//	 * Returns the squared distance between the vector and the given vector {@code (v2[0], v2[1], v2[2])}.
//	 * If the two vectors are equal the result will be zero.
//	 * It determines an equality by checking if all components are exactly the same.
//	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
//	 * has to contain at least 3 entries.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code |(v2[0], v2[1], v2[2]) - v|^2}
//	 * 
//	 * @param v2 The second vector. Minimum legth: 3.
//	 * 
//	 * @return The squared distance between the vectors or zero if both vectors are equal.
//	 */
//	default float squaredDistance(@MinLength(3) float[] v2)
//	{
//		return squaredDistance(v2[0], v2[1], v2[2]);
//	}
//	
//	/**
//	 * Returns the squared distance between the vector and the given vector {@code (v2x, v2y, v2z)}.
//	 * If the two vectors are equal the result will be zero.
//	 * It determines an equality by checking if all components are exactly the same.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code |(v2x, v2y, v2z) - v|^2}
//	 * 
//	 * @param v2x The value of the x component of the second vector.
//	 * @param v2y The value of the y component of the second vector.
//	 * @param v2z The value of the z component of the second vector.
//	 * 
//	 * @return The squared distance between the vectors or zero if both vectors are equal.
//	 */
//	float squaredDistance(float v2x, float v2y, float v2z);
//	
//	/**
//	 * Returns the squared length of the vector.
//	 * If the vector is a zero-vector the result will be zero.
//	 * It determines a length of zero by checking if all components are within the margin defined by
//	 * zero plus-minus the given tolerance inclusive {@code (-tolerance <= value <= tolerance)}.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code |v|^2}
//	 * 
//	 * @param tolerance The tolerance for defining the margin around zero.
//	 * 
//	 * @return The squared length of the vector or zero if it is a zero-length vector.
//	 */
//	float squaredLength(@FloatMinValue(0.0f) float tolerance);
//	
//	/**
//	 * Returns the squared distance between the vector and the given vector {@code (v2)}.
//	 * If the two vectors are equal the result will be zero.
//	 * It determines an equality by checking if all components are equal within a margin of plus-minus the given tolerance inclusive {@code (-tolerance <= value <= tolerance)}
//	 * around the component values.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code |v2 - v|^2}
//	 * 
//	 * @param v2 The second vector.
//	 * @param tolerance The tolerance for defining the margin.
//	 * 
//	 * @return The distance between the vectors or zero if the two vectors are equal withing the tolerance.
//	 */
//	default float squaredDistance(SimpleVec3fR v2, @FloatMinValue(0.0f) float tolerance)
//	{
//		return squaredDistance(v2.getX(), v2.getY(), v2.getZ(), tolerance);
//	}
//	
//	/**
//	 * Returns the squared distance between the vector and the given vector {@code (v2[0], v2[1], v2[2])}.
//	 * If the two vectors are equal the result will be zero.
//	 * It determines an equality by checking if all components are equal within a margin of plus-minus the given tolerance inclusive {@code (-tolerance <= value <= tolerance)}
//	 * around the component values.
//	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
//	 * has to contain at least 3 entries.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code |(v2[0], v2[1], v2[2]) - v|^2}
//	 * 
//	 * @param v2 The second vector. Minimum legth: 3.
//	 * @param tolerance The tolerance for defining the margin.
//	 * 
//	 * @return The distance between the vectors or zero if the two vectors are equal withing the tolerance.
//	 */
//	default float squaredDistance(@MinLength(3) float[] v2, @FloatMinValue(0.0f) float tolerance)
//	{
//		return squaredDistance(v2[0], v2[1], v2[2], tolerance);
//	}
//	
//	/**
//	 * Returns the squared distance between the vector and the given vector {@code (v2x, v2y, v2z)}.
//	 * If the two vectors are equal the result will be zero.
//	 * It determines an equality by checking if all components are equal within a margin of plus-minus the given tolerance inclusive {@code (-tolerance <= value <= tolerance)}
//	 * around the component values.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code |(v2x, v2y, v2z) - v|^2}
//	 * 
//	 * @param v2x The value of the x component of the second vector.
//	 * @param v2y The value of the y component of the second vector.
//	 * @param v2z The value of the z component of the second vector.
//	 * @param tolerance The tolerance for defining the margin.
//	 * 
//	 * @return The distance between the vectors or zero if the two vectors are equal withing the tolerance.
//	 */
//	float squaredDistance(float v2x, float v2y, float v2z, @FloatMinValue(0.0f) float tolerance);
//	
//	/**
//	 * Calculates the half vector from the vector to the given vector {@code (v2)} and returns the result
//	 * as a new instance.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code ( v2 - v ) / 2}
//	 * 
//	 * @param v2 The second vector.
//	 * 
//	 * @return A new instance of the vector with the result.
//	 */
//	default Vec3fR halfVectorN(SimpleVec3fR v2)
//	{
//		return halfVectorN(v2.getX(), v2.getY(), v2.getZ());
//	}
//	
//	/**
//	 * Calculates the half vector from the vector to the given vector {@code (v2[0], v2[1], v2[2])} and returns the result
//	 * as a new instance.
//	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the arrays
//	 * have to contain at least 3 entries.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code ( (v2[0], v2[1], v2[2]) - v ) / 2}
//	 * 
//	 * @param v2 The second vector. Minimum legth: 3.
//	 * 
//	 * @return A new instance of the vector with the result.
//	 */
//	default Vec3fR halfVectorN(@MinLength(3) float[] v2)
//	{
//		return halfVectorN(v2[0], v2[1], v2[2]);
//	}
//	
//	/**
//	 * Calculates the half vector from the vector to the given vector {@code (v2x, v2y, v2z)} and returns the result
//	 * as a new instance.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code ( (v2x, v2y, v2z) - v1 ) / 2}
//	 * 
//	 * @param v2x The value of the x component of the second vector.
//	 * @param v2y The value of the y component of the second vector.
//	 * @param v2z The value of the z component of the second vector.
//	 * 
//	 * @return A new instance of the vector with the result.
//	 */
//	Vec3fR halfVectorN(float v2x, float v2y, float v2z);
//	
//	/**
//	 * Calculates the point that lies in the middle of a vector spanning between the vector and the given vector {@code (v2)}
//	 * and returns the result as a new instance.
//	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
//	 * has to contain at least 3 entries.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code ( v + v2 ) / 2}
//	 * 
//	 * @param v2 The second vector.
//	 * 
//	 * @return A new instance of the vector with the result.
//	 */
//	default Vec3fR halfPointN(SimpleVec3fR v2)
//	{
//		return halfPointN(v2.getX(), v2.getY(), v2.getZ());
//	}
//	
//	/**
//	 * Calculates the point that lies in the middle of a vector spanning between the vector and the given vector {@code (v2[0], v2[1], v2[2])}
//	 * and returns the result as a new instance.
//	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
//	 * has to contain at least 3 entries.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code ( v + (v2[0], v2[1], v2[2]) ) / 2}
//	 * 
//	 * @param v2 The second vector. Minimum legth: 3.
//	 * 
//	 * @return A new instance of the vector with the result.
//	 */
//	default Vec3fR halfPointN(@MinLength(3) float[] v2)
//	{
//		return halfPointN(v2[0], v2[1], v2[2]);
//	}
//	
//	/**
//	 * Calculates the point that lies in the middle of a vector spanning between the vector and the given vector {@code (v2x, v2y, v2z)}
//	 * and returns the result as a new instance.
//	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
//	 * has to contain at least 3 entries.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code ( v + (v2x, v2y, v2z) ) / 2}
//	 * 
//	 * @param v2x The value of the x component of the second vector.
//	 * @param v2y The value of the y component of the second vector.
//	 * @param v2z The value of the z component of the second vector.
//	 * 
//	 * @return A new instance of the vector with the result.
//	 */
//	Vec3fR halfPointN(float v2x, float v2y, float v2z);
//
//	/**
//	 * Calculates a vector consisting of the per component minimum between the vector and the given vector {@code (v2)} and
//	 * returns the result as a new instance.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code min( v, v2 )}
//	 * 
//	 * @param v2 The second vector.
//	 * 
//	 * @return A new instance of the vector with the result.
//	 */
//	default Vec3fR minVectorN(SimpleVec3fR v2)
//	{
//		return minVectorN(v2.getX(), v2.getY(), v2.getZ());
//	}
//	
//	/**
//	 * Calculates a vector consisting of the per component minimum between the vector and the given vector {@code (value, value, value)} and
//	 * returns the result as a new instance.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code min( v, (value, value, value) )}
//	 * 
//	 * @param value The value of all components of the second vector.
//	 * 
//	 * @return A new instance of the vector with the result.
//	 */
//	default Vec3fR minVectorN(float value)
//	{
//		return minVectorN(value, value, value);
//	}
//	
//	/**
//	 * Calculates a vector consisting of the per component minimum between the vector and the given vector {@code (v2[0], v2[1], v2[2])} and
//	 * returns the result as a new instance.
//	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
//	 * has to contain at least 3 entries.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code min( v, (v2[0], v2[1], v2[2]) )}
//	 * 
//	 * @param v2 The second vector. Minimum legth: 3.
//	 * 
//	 * @return A new instance of the vector with the result.
//	 */
//	default Vec3fR minVectorN(@MinLength(3) float[] v2)
//	{
//		return minVectorN(v2[0], v2[1], v2[2]);
//	}
//	
//	/**
//	 * Calculates a vector consisting of the per component minimum between the vector and the given vector {@code (v2x, v2y, v2z)} and
//	 * returns the result as a new instance.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code min( v, (v2x, v2y, v2z) )}
//	 * 
//	 * @param v2x The value of the x component of the second vector.
//	 * @param v2y The value of the y component of the second vector.
//	 * @param v2z The value of the z component of the second vector.
//	 * 
//	 * @return A new instance of the vector with the result.
//	 */
//	Vec3fR minVectorN(float v2x, float v2y, float v2z);
//	
//	/**
//	 * Calculates a vector consisting of the per component maximum between the vector and the given vector {@code (v2)} and
//	 * returns the result as a new instance.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code max( v, v2 )}
//	 * 
//	 * @param v2 The second vector.
//	 * 
//	 * @return A new instance of the vector with the result.
//	 */
//	default Vec3fR maxVectorN(SimpleVec3fR v2)
//	{
//		return maxVectorN(v2.getX(), v2.getY(), v2.getZ());
//	}
//	
//	/**
//	 * Calculates a vector consisting of the per component maximum between the vector and the given vector {@code (value, value, value)} and
//	 * returns the result as a new instance.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code max( v, (value, value, value) )}
//	 * 
//	 * @param value The value of all components of the second vector.
//	 * 
//	 * @return A new instance of the vector with the result.
//	 */
//	default Vec3fR maxVectorN(float value)
//	{
//		return maxVectorN(value, value, value);
//	}
//	
//	/**
//	 * Calculates a vector consisting of the per component maximum between the vector and the given vector {@code (v2[0], v2[1], v2[2])} and
//	 * returns the result as a new instance.
//	 * The x, y and z components are expected to be on the indices 0, 1 and 2. Therefore the array
//	 * has to contain at least 3 entries.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code max( v, (v2[0], v2[1], v2[2]) )}
//	 * 
//	 * @param v2 The second vector. Minimum legth: 3.
//	 * 
//	 * @return A new instance of the vector with the result.
//	 */
//	default Vec3fR maxVectorN(@MinLength(3) float[] v2)
//	{
//		return maxVectorN(v2[0], v2[1], v2[2]);
//	}
//	
//	/**
//	 * Calculates a vector consisting of the per component maximum between the vector and the given vector {@code (v2x, v2y, v2z)} and
//	 * returns the result as a new instance.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code max( v, (v2x, v2y, v2z) )}
//	 * 
//	 * @param v2x The value of the x component of the second vector.
//	 * @param v2y The value of the y component of the second vector.
//	 * @param v2z The value of the z component of the second vector.
//	 * 
//	 * @return A new instance of the vector with the result.
//	 */
//	Vec3fR maxVectorN(float v2x, float v2y, float v2z);
//	
//	/**
//	 * Returns the dot product (scalar product) between this vector and the given vector {@code (v2)}.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code v . v2}
//	 * 
//	 * @param v2 The second vector.
//	 * 
//	 * @return The dot product (scalar product).
//	 */
//	default float dot(SimpleVec3fR v2)
//	{
//		return dot(v2.getX(), v2.getY(), v2.getZ());
//	}
//	
//	/**
//	 * Returns the dot product (scalar product) between this vector and the given vector {@code (value, value, value)}.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code v . (value, value, value)}
//	 * 
//	 * @param value The value of all the components of the other vector.
//	 * 
//	 * @return The dot product (scalar product).
//	 */
//	default float dot(float value)
//	{
//		return dot(value, value, value);
//	}
//	
//	/**
//	 * Returns the dot product (scalar product) between this vector and the given vector {@code (v2[0], v2[1], v2[2])}.
//	 * The components for x, y and z are expected to be on the indices 0, 1 and 2. Therefore the array
//	 * has to contain at least 3 elements.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code v . (v2[0], v2[1], v2[2])}
//	 * 
//	 * @param v2 The array containing the other vector. Minimum length: 3
//	 * 
//	 * @return The dot product (scalar product).
//	 */
//	default float dot(@MinLength(3) float[] v2)
//	{
//		return dot(v2[0], v2[1], v2[2]);
//	}
//	
//	/**
//	 * Returns the dot product (scalar product) between this vector and the given vector {@code (x, y, z)}.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code v . (x, y, z)}
//	 * 
//	 * @param x The value of the x component of the other vector.
//	 * @param y The value of the y component of the other vector.
//	 * @param z The value of the z component of the other vector.
//	 * 
//	 * @return The dot product (scalar product).
//	 */
//	float dot(float x, float y, float z);
//	
//	/**
//	 * Determines the smallest value of the components and returns the value and the index of the component.
//	 * The index returned is limited to the range of {@code 0 to getDimensions() - 1}.
//	 * If two or more components have the same value the first index will be returned.
//	 * The returned tuple is immutable.
//	 * 
//	 * @return The smallest value of the components and the index of the corresponding component.
//	 */
//	ComponentValueFloat min();
//	
//	/**
//	 * Determines the smallest value of the components and returns the value and the index of the component.
//	 * The index returned is limited to the range of {@code 0 to getDimensions() - 1}.
//	 * If two or more components have the same value the first index will be returned.
//	 * This version utilizes an extraction parameter that receives the result and will be returned.
//	 * 
//	 * @param res The extraction parameter for the result.
//	 * 
//	 * @return The extraction parameter with the result.
//	 */
//	ComponentValueFloat min(@ExtractionParam ComponentValueFloat res);
//	
//	/**
//	 * Determines the smallest value of the components and returns it.
//	 * 
//	 * @return The smallest value of the components.
//	 */
//	float minValue();
//	
//	/**
//	 * Determines the smallest value of the componensts and returns the index of the component.
//	 * The index returned is limited to the range of {@code 0 to getDimensions() - 1}.
//	 * If two or more components have the same value the first index will be returned.
//	 * 
//	 * @return The index of the smallest component.
//	 */
//	int minComponent();
//	
//	/**
//	 * Determines the greatest value of the components and returns the value and the index of the component.
//	 * The index returned is limited to the range of {@code 0 to getDimensions() - 1}.
//	 * If two or more components have the same value the first index will be returned.
//	 * The returned tuple is immutable.
//	 * 
//	 * @return The greatest value of the components and the index of the corresponding component.
//	 */
//	ComponentValueFloat max();
//	
//	/**
//	 * Determines the greatest value of the components and returns the value and the index of the component.
//	 * The index returned is limited to the range of {@code 0 to getDimensions() - 1}.
//	 * If two or more components have the same value the first index will be returned.
//	 * This version utilizes an extraction parameter that receives the result and will be returned.
//	 * 
//	 * @param res The extraction parameter for the result.
//	 * 
//	 * @return The extraction parameter with the result.
//	 */
//	ComponentValueFloat max(@ExtractionParam ComponentValueFloat res);
//	
//	/**
//	 * Determines the greatest value of the components and returns it.
//	 * 
//	 * @return The greatest value of the components.
//	 */
//	float maxValue();
//	
//	/**
//	 * Determines the greatest value of the componensts and returns the index of the component.
//	 * The index returned is limited to the range of {@code 0 to getDimensions() - 1}.
//	 * If two or more components have the same value the first index will be returned.
//	 * 
//	 * @return The index of the greatest component.
//	 */
//	int maxComponent();
//	
//	/**
//	 * Adds the given vector {@code (v2)} to the current vector and saves the result in a new instance.
//	 * This operation does not alter the current vector.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code v + v2}
//	 * 
//	 * @param v2 The vector to add to the current vector.
//	 * 
//	 * @return A new instance of the vector with the result.
//	 */
//	default Vec3fR addN(SimpleVec3fR v2)
//	{
//		return addN(v2.getX(), v2.getY(), v2.getZ());
//	}
//	
//	/**
//	 * Adds the given vector {@code (v2[0], v2[1], v2[2])} to the current vector and saves the result in a new instance.
//	 * The components for x, y and z are expected to be on the indices 0, 1 and 2. Therefore the array
//	 * has to contain at least 3 elements.
//	 * This operation does not alter the current vector.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code v + (v2[0], v2[1], v2[2])}
//	 * 
//	 * @param v2 The vector to add to the current vector. Minimum legth: 3.
//	 * 
//	 * @return A new instance of the vector with the result.
//	 */
//	default Vec3fR addN(@MinLength(3) float[] v2)
//	{
//		return addN(v2[0], v2[1], v2[2]);
//	}
//	
//	/**
//	 * Adds the given value {@code (value)} to the current vector and saves the result in a new instance.
//	 * The value is added to every component.
//	 * This operation does not alter the current vector.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code v + (value, value, value)}
//	 * 
//	 * @param value The value to add to the current vector.
//	 * 
//	 * @return A new instance of the vector with the result.
//	 */
//	default Vec3fR addN(float value)
//	{
//		return addN(value, value, value);
//	}
//	
//	/**
//	 * Adds the given vector {@code (v2x, v2y, v2z)} to the current vector and saves the result in a new instance.
//	 * This operation does not alter the current vector.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code v + (v2x, v2y, v2z)}
//	 * 
//	 * @param v2x The value of the x component to add to the current vector.
//	 * @param v2y The value of the y component to add to the current vector.
//	 * @param v2z The value of the z component to add to the current vector.
//	 * 
//	 * @return A new instance of the vector with the result.
//	 */
//	Vec3fR addN(float v2x, float v2y, float v2z);
//	
//	/**
//	 * Subtracts the given vector {@code (v2)} from the current vector and saves the result in a new instance.
//	 * This operation does not alter the current vector.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code v - v2}
//	 * 
//	 * @param v2 The tuple to subtract from the current vector.
//	 * 
//	 * @return A new instance of the vector with the result.
//	 */
//	default Vec3fR subN(SimpleVec3fR v2)
//	{
//		return subN(v2.getX(), v2.getY(), v2.getZ());
//	}
//	
//	/**
//	 * Subtracts the given vector {@code (v2[0], v2[1], v2[2])} from the current vector and saves the result in a new instance.
//	 * The components for x, y and z are expected to be on the indices 0, 1 and 2. Therefore the array
//	 * has to contain at least 3 elements.
//	 * This operation does not alter the current vector.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code v - (v2[0], v2[1], v2[2])}
//	 * 
//	 * @param v2 The array to subtract from the current vector. Minimum length: 3.
//	 * 
//	 * @return A new instance of the vector with the result.
//	 */
//	default Vec3fR subN(@MinLength(3) float[] v2)
//	{
//		return subN(v2[0], v2[1], v2[2]);
//	}
//	
//	/**
//	 * Subtracts the given value {@code (value)} from the current vector and saves the result in a new instance.
//	 * The value is subtracted from every component.
//	 * This operation does not alter the current vector.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code v - (value, value, value)}
//	 * 
//	 * @param value The value to subtract from the current vector.
//	 * 
//	 * @return A new instance of the vector with the result.
//	 */
//	default Vec3fR subN(float value)
//	{
//		return subN(value, value, value);
//	}
//	
//	/**
//	 * Subtracts the given tuple {@code (v2x, v2y, v2z)} from the current vector and saves the result in
//	 * a new instance.
//	 * This operation does not alter the current vector.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code v - (v2x, v2y, v2z)}
//	 * 
//	 * @param v2x The value of the x component to subtract from the current vector.
//	 * @param v2y The value of the y component to subtract from the current vector.
//	 * @param v2z The value of the z component to subtract from the current vector.
//	 * 
//	 * @return A new instance of the vector with the result.
//	 */
//	Vec3fR subN(float v2x, float v2y, float v2z);
//	
//	/**
//	 * Subtracts the current vector from the given tuple {@code (t)} and saves the result in a new instance.
//	 * This operation does not alter the current vector.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code v2 - v}
//	 * 
//	 * @param v2 The tuple the current vector is subtracted from.
//	 * 
//	 * @return A new instance of the vector with the result.
//	 */
//	default Vec3fR revSubN(SimpleVec3fR v2)
//	{
//		return revSubN(v2.getX(), v2.getY(), v2.getZ());
//	}
//	
//	/**
//	 * Subtracts the current vector from the given array {@code (a)} and saves the result in a new instance.
//	 * The components for x, y and z are expected to be on the indices 0, 1 and 2. Therefore the array
//	 * has to contain at least 3 elements.
//	 * This operation does not alter the current vector.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v2[0], v2[1], v2[2]) - v}
//	 * 
//	 * @param v2 The array the current vector is subtracted from. Minimum length: 3.
//	 * 
//	 * @return A new instance of the vector with the result.
//	 */
//	default Vec3fR revSubN(@MinLength(3) float[] v2)
//	{
//		return revSubN(v2[0], v2[1], v2[2]);
//	}
//	
//	/**
//	 * Subtracts the current vector from the given value {@code (value)} and saves the result in a new instance.
//	 * Every component is subtracted from the value.
//	 * This operation does not alter the current vector.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (value, value, value) - v}
//	 * 
//	 * @param value The value the current vector is subtracted from.
//	 * 
//	 * @return A new instance of the vector with the result.
//	 */
//	default Vec3fR revSubN(float value)
//	{
//		return revSubN(value, value, value);
//	}
//		
//	/**
//	 * Subtracts the current vector from the given tuple {@code (x, y, z)} and saves the result in
//	 * a new instance.
//	 * This operation does not alter the current vector.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (x, y, z) - v}
//	 * 
//	 * @param x The value of the x component the current vector is subtracted from.
//	 * @param y The value of the y component the current vector is subtracted from.
//	 * @param z The value of the z component the current vector is subtracted from.
//	 * 
//	 * @return A new instance of the vector with the result.
//	 */
//	Vec3fR revSubN(float x, float y, float z);
//	
//	/**
//	 * Multiplies the current vector with the given tuple {@code (t)} and saves the result in a new instance.
//	 * This operation does not alter the current vector.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code v * v2}
//	 * 
//	 * @param v2 The tuple to multiply the current vector with.
//	 * 
//	 * @return A new instance of the vector with the result.
//	 */
//	default Vec3fR mulN(SimpleVec3fR v2)
//	{
//		return mulN(v2.getX(), v2.getY(), v2.getZ());
//	}
//	
//	/**
//	 * Multiplies the current vector with the given array {@code (a)} and saves the result in a new instance.
//	 * The components for x, y and z are expected to be on the indices 0, 1 and 2. Therefore the array
//	 * has to contain at least 3 elements.
//	 * This operation does not alter the current vector.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code v * (v2[0], v2[1], v2[2])}
//	 * 
//	 * @param v2 The array to multiply the current vector with. Minimum length: 3.
//	 * 
//	 * @return A new instance of the vector with the result.
//	 */
//	default Vec3fR mulN(@MinLength(3) float[] v2)
//	{
//		return mulN(v2[0], v2[1], v2[2]);
//	}
//	
//	/**
//	 * Multiplies the current vector with the given value {@code (value)} and saves the result in a new instance.
//	 * The value is multiplied with every component.
//	 * This operation does not alter the current vector.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code v * (value, value, value)}
//	 * 
//	 * @param value The value to multiply the current vector with.
//	 * 
//	 * @return A new instance of the vector with the result.
//	 */
//	default Vec3fR mulN(float value)
//	{
//		return mulN(value, value, value);
//	}
//	
//	/**
//	 * Multiplies the current vector with the given tuple {@code (x, y, z)} and saves the result in
//	 * a new instance.
//	 * This operation does not alter the current vector.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code v * (x, y, z)}
//	 * 
//	 * @param x The value of the x component to multiply the current vector with.
//	 * @param y The value of the y component to multiply the current vector with.
//	 * @param z The value of the z component to multiply the current vector with.
//	 * 
//	 * @return A new instance of the vector with the result.
//	 */
//	Vec3fR mulN(float x, float y, float z);
//	
//	/**
//	 * Divides the current vector by the given tuple {@code (t)} and saves the result in a new instance.
//	 * This operation does not alter the current vector.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code v / v2}
//	 * 
//	 * @param v2 The tuple to divide the current vector by.
//	 * 
//	 * @return A new instance of the vector with the result.
//	 */
//	default Vec3fR divN(SimpleVec3fR v2)
//	{
//		return divN(v2.getX(), v2.getY(), v2.getZ());
//	}
//	
//	/**
//	 * Divides the current vector by the given array {@code (a)} and saves the result in a new instance.
//	 * The components for x, y and z are expected to be on the indices 0, 1 and 2. Therefore the array
//	 * has to contain at least 3 elements.
//	 * This operation does not alter the current vector.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code v / (v2[0], v2[1], v2[2])}
//	 * 
//	 * @param v2 The array to divide the current vector by. Minimum length: 3.
//	 * 
//	 * @return A new instance of the vector with the result.
//	 */
//	default Vec3fR divN(@MinLength(3) float[] v2)
//	{
//		return divN(v2[0], v2[1], v2[2]);
//	}
//	
//	/**
//	 * Divides the current vector by the given value {@code (value)} and saves the result in a new instance.
//	 * every component is divided by the value.
//	 * This operation does not alter the current vector.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code v / (value, value, value)}
//	 * 
//	 * @param value The value to divide the current vector by.
//	 * 
//	 * @return A new instance of the vector with the result.
//	 */
//	default Vec3fR divN(float value)
//	{
//		return divN(value, value, value);
//	}
//	
//	/**
//	 * Divides the current vector by the given tuple {@code (x, y, z)} and saves the result in
//	 * a new instance.
//	 * This operation does not alter the current vector.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code v / (x, y, z)}
//	 * 
//	 * @param x The value of the x component to divide the current vector by.
//	 * @param y The value of the y component to divide the current vector by.
//	 * @param z The value of the z component to divide the current vector by.
//	 * 
//	 * @return A new instance of the vector with the result.
//	 */
//	Vec3fR divN(float x, float y, float z);
//
//	/**
//	 * Divides the given tuple {@code (t)} by the current vector and saves the result in a new instance.
//	 * This operation does not alter the current vector.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code v2 / v}
//	 * 
//	 * @param t The tuple to divide by the current vector.
//	 * 
//	 * @return A new instance of the vector with the result.
//	 */
//	default Vec3fR revDivN(SimpleVec3fR v2)
//	{
//		return revDivN(v2.getX(), v2.getY(), v2.getZ());
//	}
//
//	/**
//	 * Divides the given array {@code (a)} by the current vector and saves the result in a new instance.
//	 * The components for x, y and z are expected to be on the indices 0, 1 and 2. Therefore the array
//	 * has to contain at least 3 elements.
//	 * This operation does not alter the current vector.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (v2[0], v2[1], v2[2]) / v}
//	 * 
//	 * @param v2 The array to divide by the current vector. Minimum length: 3.
//	 * 
//	 * @return A new instance of the vector with the result.
//	 */
//	default Vec3fR revDivN(@MinLength(3) float[] v2)
//	{
//		return revDivN(v2[COMP_X], v2[COMP_Y], v2[COMP_Z]);
//	}
//	
//	/**
//	 * Divides the given value {@code (value)} by the current vector and saves the result in a new instance.
//	 * The value is divided by every component.
//	 * This operation does not alter the current vector.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (value, value, value) / v}
//	 * 
//	 * @param value The value to divide by the current vector.
//	 * 
//	 * @return A new instance of the vector with the result.
//	 */
//	default Vec3fR revDivN(float value)
//	{
//		return revDivN(value, value, value);
//	}
//
//	/**
//	 * Divides the given tuple {@code (x, y, z)} by the current vector and saves the result in
//	 * a new instance.
//	 * This operation does not alter the current vector.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (x, y, z) / v}
//	 * 
//	 * @param x The value of the x component to divide by the current vector.
//	 * @param y The value of the y component to divide by the current vector.
//	 * @param z The value of the z component to divide by the current vector.
//	 * 
//	 * @return A new instance of the vector with the result.
//	 */
//	Vec3fR revDivN(float x, float y, float z);
//
//	/**
//	 * Normalizes the current vector and saves the result in a new instance.
//	 * Normalization is done by dividing the vector by its length (magnitude, norm).
//	 * This doesn't account for zero-length vectors {@code (x=y=z=0)} and will in such case throw an {@link ArithmeticException}
//	 * as this will result in a division by zero.
//	 * This operation does not alter the current vector.
//	 * 
//	 * <p>
//	 * This function is intended to be used in situations where the vector by design cannot be of zero length.
//	 * In that case calling this function will avoid the check for zero.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code v / |v|}
//	 * 
//	 * @return A new instance of the vector with the result.
//	 * 
//	 * @throws ArithmeticException Thrown when it is a zero-length vector.
//	 */
//	Vec3fR normalizeUnsafeN();
//
//	/**
//	 * Normalizes the current vector and saves the result in a new instance.
//	 * Normalization is done by dividing the vector by its length (magnitude, norm).
//	 * If the vector is a zero-length vector {@code (x=y=z=0)} the result will be a zero vector.
//	 * It determines a length of zero by checking if all components are exactly zero.
//	 * Due to floating-point-errors it might still throw an {@link ArithmeticException} when
//	 * the length is too close to zero.
//	 * This operation does not alter the current vector.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code v / |v|}
//	 * 
//	 * @return A new instance of the vector with the result.
//	 * 
//	 * @throws ArithmeticException Might be thrown when the length is to close to zero.
//	 */
//	Vec3fR normalizeN();
//
//	/**
//	 * Normalizes the current vector and saves the result in a new instance.
//	 * Normalization is done by dividing the vector by its length (magnitude, norm).
//	 * If the vector is a zero-length vector {@code (x=y=z=0)} the result will be a zero vector.
//	 * It determines a zero-length by checking if all components are within the margin defined by
//	 * zero plus-minus the given tolerance inclusive {@code (-tolerance <= value <= tolerance)}.
//	 * This operation does not alter the current vector.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code v / |v|}
//	 * 
//	 * @param tolerance The tolerance for defining the margin around zero.
//	 * 
//	 * @return A new instance of the vector with the result.
//	 */
//	Vec3fR normalizeN(@FloatMinValue(0.0f) float tolerance);
//
//	/**
//	 * Negates (inverts) the current vector and saves the result in a new instance.
//	 * This operation does not alter the current vector.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code -v}
//	 * 
//	 * @return A new instance of the vector with the result.
//	 */
//	Vec3fR negateN();
//	
//	/**
//	 * Calculates the inverse of the vector and saves the result in a new instance.
//	 * This operation does not alter the current vector.
//	 * 
//	 * <p>
//	 * Operation:
//	 * {@code 1 / v}
//	 * 
//	 * @return A new instance of the vector with the result.
//	 */
//	Vec3fR inverseN();
//	
//	/**
//	 * Calculates either the right or left handed cross product between this vector and the given tuple {@code (t)}
//	 * and saves the result in a new instance.
//	 * The handedness is determined by the implementation.
//	 * This operation does not alter the current vector.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code v X t}
//	 * 
//	 * <p>
//	 * Definition:<br>
//	 * In a standard right handed cartesian system there are the following relations between axis assuming a positive direction.
//	 * Imagine looking in the desired direction and using the axis in counterclockwise order.
//	 * In a left handed cartesian system the order is reversed and therefore clockwise.
//	 * 
//	 * <p>
//	 * {@code forward(z) = right(x) X up(y)}<br>
//	 * {@code up(y) = forward(z) X right(x)}<br>
//	 * {@code right(x) = up(y) X forward(z)}
//	 * 
//	 * @param v2 The tuple to calculate the cross product with.
//	 * 
//	 * @return A new instance of the vector with the result.
//	 */
//	default Vec3fR crossN(SimpleVec3fR v2)
//	{
//		return crossN(v2.getX(), v2.getY(), v2.getZ());
//	}
//	
//	/**
//	 * Calculates either the right or left handed cross product between this vector and the given array {@code (a)}
//	 * and saves the result in a new instance.
//	 * The components for x, y and z are expected to be on the indices 0, 1 and 2. Therefore the array
//	 * has to contain at least 3 elements.
//	 * The handedness is determined by the implementation.
//	 * This operation does not alter the current vector.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code v X (a[0], a[1], a[2])}
//	 * 
//	 * <p>
//	 * Definition:<br>
//	 * In a standard right handed cartesian system there are the following relations between axis assuming a positive direction.
//	 * Imagine looking in the desired direction and using the axis in counterclockwise order.
//	 * In a left handed cartesian system the order is reversed and therefore clockwise.
//	 * 
//	 * <p>
//	 * {@code forward(z) = right(x) X up(y)}<br>
//	 * {@code up(y) = forward(z) X right(x)}<br>
//	 * {@code right(x) = up(y) X forward(z)}
//	 * 
//	 * @param v2 The array to calculate the cross product with. Minimum length: 3.
//	 * 
//	 * @return A new instance of the vector with the result.
//	 */
//	default Vec3fR crossN(@MinLength(3) float[] v2)
//	{
//		return crossN(v2[0], v2[1], v2[2]);
//	}
//	
//	/**
//	 * Calculates either the right or left handed cross product between this vector and the given value {@code (value)}
//	 * and saves the result in a new instance.
//	 * The value is seen as a tuple with all component values equal to it.
//	 * The handedness is determined by the implementation.
//	 * This operation does not alter the current vector.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code v X (value, value, value)}
//	 * 
//	 * <p>
//	 * Definition:<br>
//	 * In a standard right handed cartesian system there are the following relations between axis assuming a positive direction.
//	 * Imagine looking in the desired direction and using the axis in counterclockwise order.
//	 * In a left handed cartesian system the order is reversed and therefore clockwise.
//	 * 
//	 * <p>
//	 * {@code forward(z) = right(x) X up(y)}<br>
//	 * {@code up(y) = forward(z) X right(x)}<br>
//	 * {@code right(x) = up(y) X forward(z)}
//	 * 
//	 * @param value The value to calculate the cross product with.
//	 * 
//	 * @return A new instance of the vector with the result.
//	 */
//	default Vec3fR crossN(float value)
//	{
//		return crossN(value, value, value);
//	}
//	
//	/**
//	 * Calculates either the right or left handed cross product between this vector and the given tuple {@code (x, y, z)}
//	 * and saves the result in a new instance.
//	 * The handedness is determined by the implementation.
//	 * This operation does not alter the current vector.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code v X (x, y, z)}
//	 * 
//	 * <p>
//	 * Definition:<br>
//	 * In a standard right handed cartesian system there are the following relations between axis assuming a positive direction.
//	 * Imagine looking in the desired direction and using the axis in counterclockwise order.
//	 * In a left handed cartesian system the order is reversed and therefore clockwise.
//	 * 
//	 * <p>
//	 * {@code forward(z) = right(x) X up(y)}<br>
//	 * {@code up(y) = forward(z) X right(x)}<br>
//	 * {@code right(x) = up(y) X forward(z)}
//	 * 
//	 * @param x The value of the x component to calculate the cross product with.
//	 * @param y The value of the y component to calculate the cross product with.
//	 * @param z The value of the z component to calculate the cross product with.
//	 * 
//	 * @return A new instance of the vector with the result.
//	 */
//	Vec3fR crossN(float x, float y, float z);
//	
//	/**
//	 * Calculates the absolute values of all components of the current vector and saves the result in a new instance.
//	 * This operation does not alter the current vector.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code (|v.x|, |v.y|, |v.z|)}
//	 * 
//	 * @return A new instance of the vector with the result.
//	 */
//	Vec3fR absN();
//	
//	/**
//	 * Rounds all components down to the next integer closer to negative infinity and saves the result in a new instance.
//	 * This operation does not alter the current vector.
//	 * 
//	 * 
//	 * @return A new instance of the vector with the result.
//	 */
//	Vec3fR floorN();
//	
//	/**
//	 * Rounds all components up to the next integer closer to positive infinity and saves the result in a new instance.
//	 * This operation does not alter the current vector.
//	 * 
//	 * @return A new instance of the vector with the result.
//	 */
//	Vec3fR ceilN();
//	
//	/**
//	 * Rounds all components up to the next integer closer to positive infinity or negative infinity and saves the result in a new instance.
//	 * This operation does not alter the current vector.
//	 * 
//	 * @return A new instance of the vector with the result.
//	 */
//	Vec3fR roundN();
//	
//	/**
//	 * Truncates the decimals of the components and saves the result in a new instance.
//	 * This operation does not alter the current vector.
//	 * 
//	 * @return A new instance of the vector with the result.
//	 */
//	Vec3fR truncN();
//	
//	/**
//	 * Rounds all components by the given rounding method and saves the result in a new instance.
//	 * This operation does not alter the current vector.
//	 * 
//	 * @param method The rounding method to use.
//	 * 
//	 * @return A new instance of the vector with the result.
//	 */
//	Vec3fR roundN(FloatRoundMethod method);
//	
//	/**
//	 * Sets the vector to the signums {@code (+1.0f, -1.0f)} of the components and saves the result in a new instance.
//	 * This operation does not alter the current vector.
//	 * 
//	 * @return A new instance of the vector with the result.
//	 */
//	Vec3fR signumN();
//	
//	/**
//	 * Applies the given matrix to the current vector and therefore transforming it and saves the result in a new instance.
//	 * This operation does not alter the current vector.
//	 * 
//	 * <p>
//	 * Operation:<br>
//	 * {@code m * v}
//	 * 
//	 * @param m The matrix to apply.
//	 * 
//	 * @return A new instance of the vector with the result.
//	 */
//	Vec3fR transformN(Mat4fR m);
//	
//	/**
//	 * Rotates the current vector around the x axis by the given angle in radians and saves the result in a new instance.
//	 * This operation does not alter the current vector.
//	 * 
//	 * @param angle The angle to rotate by in radians.
//	 * 
//	 * @return A new instance of the vector with the result.
//	 */
//	Vec3fR rotateXN(float angle);
//	
//	/**
//	 * Rotates the current vector around the x axis by the given angle in degrees and saves the result in a new instance.
//	 * This operation does not alter the current vector.
//	 * 
//	 * @param angle The angle to rotate by in degrees.
//	 * 
//	 * @return A new instance of the vector with the result.
//	 */
//	default Vec3fR rotateXDegN(float angle)
//	{
//		return rotateXN(angle * BarghosMath.DEG_TO_RADf);
//	}
//	
//	/**
//	 * Rotates the current vector around the y axis by the given angle in radians and saves the result in a new instance.
//	 * This operation does not alter the current vector.
//	 * 
//	 * @param angle The angle to rotate by in radians.
//	 * 
//	 * @return A new instance of the vector with the result.
//	 */
//	Vec3fR rotateYN(float angle);
//	
//	/**
//	 * Rotates the current vector around the y axis by the given angle in degrees and saves the result in a new instance.
//	 * This operation does not alter the current vector.
//	 * 
//	 * @param angle The angle to rotate by in degrees.
//	 * 
//	 * @return A new instance of the vector with the result.
//	 */
//	default Vec3fR rotateYDegN(float angle)
//	{
//		return rotateYN(angle * BarghosMath.DEG_TO_RADf);
//	}
//	
//	/**
//	 * Rotates the current vector around the z axis by the given angle in radians and saves the result in a new instance.
//	 * This operation does not alter the current vector.
//	 * 
//	 * @param angle The angle to rotate by in radians.
//	 * 
//	 * @return A new instance of the vector with the result.
//	 */
//	Vec3fR rotateZN(float angle);
//	
//	/**
//	 * Rotates the current vector around the z axis by the given angle in degrees and saves the result in a new instance.
//	 * This operation does not alter the current vector.
//	 * 
//	 * @param angle The angle to rotate by in degrees.
//	 * 
//	 * @return A new instance of the vector with the result.
//	 */
//	default Vec3fR rotateZDegN(float angle)
//	{
//		return rotateZN(angle * BarghosMath.DEG_TO_RADf);
//	}
//	
//	/**
//	 * Rotates the current vector around the give tuple {@code (axis)} as axis and the given angle in radians
//	 * and saves the result in a new instance.
//	 * This operation does not alter the current vector.
//	 * 
//	 * @param axis The rotation axis.
//	 * @param angle The angle to rotate by in radians.
//	 * 
//	 * @return A new instance of the vector with the result.
//	 */
//	default Vec3fR rotateN(SimpleVec3fR axis, float angle)
//	{
//		return rotateN(axis.getX(), axis.getY(), axis.getZ(), angle);
//	}
//	
//	/**
//	 * Rotates the current vector around the give array {@code (axis)} as axis and the given angle in radians
//	 * and saves the result in a new instance.
//	 * The components for x, y and z are expected to be on the indices 0, 1 and 2. Therefore the array
//	 * has to contain at least 3 elements.
//	 * This operation does not alter the current vector.
//	 * 
//	 * @param axis The rotation axis. Minimum length: 3.
//	 * @param angle The angle to rotate by in radians.
//	 * 
//	 * @return A new instance of the vector with the result.
//	 */
//	default Vec3fR rotateN(@MinLength(3) float[] axis, float angle)
//	{
//		return rotateN(axis[0], axis[1], axis[2], angle);
//	}
//	
//	/**
//	 * Rotates the current vector around the give tuple {@code (axisX, axisY, axisZ)} as axis and the given angle in radians
//	 * and saves the result in a new instance.
//	 * This operation does not alter the current vector.
//	 * 
//	 * @param axisX The value of the x component of the rotation axis.
//	 * @param axisY The value of the y component of the rotation axis.
//	 * @param axisZ The value of the z component of the rotation axis.
//	 * @param angle The angle to rotate by in radians.
//	 * 
//	 * @return A new instance of the vector with the result.
//	 */
//	Vec3fR rotateN(float axisX, float axisY, float axisZ, float angle);
//	
//	/**
//	 * Rotates the current vector around the give tuple {@code (axis)} as axis and the given angle in degrees
//	 * and saves the result in a new instance.
//	 * This operation does not alter the current vector.
//	 * 
//	 * @param axis The rotation axis.
//	 * @param angle The angle to rotate by in degrees.
//	 * 
//	 * @return A new instance of the vector with the result.
//	 */
//	default Vec3fR rotateDegN(SimpleVec3fR axis, float angle)
//	{
//		return rotateDegN(axis.getX(), axis.getY(), axis.getZ(), angle);
//	}
//	
//	/**
//	 * Rotates the current vector around the give array {@code (axis)} as axis and the given angle in degrees
//	 * and saves the result in a new instance.
//	 * The components for x, y and z are expected to be on the indices 0, 1 and 2. Therefore the array
//	 * has to contain at least 3 elements.
//	 * This operation does not alter the current vector.
//	 * 
//	 * @param axis The rotation axis. Minimum length: 3.
//	 * @param angle The angle to rotate by in degrees.
//	 * 
//	 * @return A new instance of the vector with the result.
//	 */
//	default Vec3fR rotateDegN(@MinLength(3) float[] axis, float angle)
//	{
//		return rotateDegN(axis[0], axis[1], axis[2], angle);
//	}
//	
//	/**
//	 * Rotates the current vector around the give tuple {@code (axisX, axisY, axisZ)} as axis and the given angle in degrees
//	 * and saves the result in a new instance.
//	 * This operation does not alter the current vector.
//	 * 
//	 * @param axisX The value of the x component of the rotation axis.
//	 * @param axisY The value of the y component of the rotation axis.
//	 * @param axisZ The value of the z component of the rotation axis.
//	 * @param angle The angle to rotate by in degrees.
//	 * 
//	 * @return A new instance of the vector with the result.
//	 */
//	Vec3fR rotateDegN(float axisX, float axisY, float axisZ, float angle);
//	
//	/**
//	 * Rotates the current vector by the given axis-angle and saves the result in a new instance.
//	 * This operation does not alter the current vector.
//	 * 
//	 * @param aa The axis-angle to rotate by.
//	 * 
//	 * @return A new instance of the vector with the result.
//	 */
//	Vec3fR rotateN(AxisAngle3fR aa);
//	
//	/**
//	 * Rotates the current vector by the given quaternion and saves the result in a new instance.
//	 * This operation does not alter the current vector.
//	 * 
//	 * @param q The quaternion to rotate by.
//	 * 
//	 * @return A new instance of the vector with the result.
//	 */
//	Vec3fR rotateN(QuatR q);
//	
//	/**
//	 * Projects the current vector onto the given vector {@code (v2)} and returns the result in a new instance.
//	 * 
//	 * @param v2 The target vector to project on.
//	 * 
//	 * @return An new instance of the vector with the result.
//	 */
//	default Vec3fR projectN(SimpleVec3fR v2)
//	{
//		return projectN(v2.getX(), v2.getY(), v2.getZ());
//	}
//	
//	/**
//	 * Projects the current vector onto the given vector {@code (v2[0], v2[1], v2[2])} and returns the result in a new instance.
//	 * 
//	 * @param v2 The target vector to project on. Minimum length: 3.
//	 * 
//	 * @return An new instance of the vector with the result.
//	 */
//	default Vec3fR projectN(@MinLength(3) float[] v2)
//	{
//		return projectN(v2[0], v2[1], v2[2]);
//	}
//	
//	/**
//	 * Projects the current vector onto the given vector {@code (x, y, z)} and returns the result in a new instance.
//	 * 
//	 * @param x The value of the x component of the target vector.
//	 * @param y The value of the y component of the target vector.
//	 * @param z The value of the z component of the target vector.
//	 * 
//	 * @return An new instance of the vector with the result.
//	 */
//	Vec3fR projectN(float x, float y, float z);
//	
//	/**
//	 * Reflects the current vector by the given normal vector {@code (v2)} and returns the result in a new instance.
//	 * 
//	 * @param v2 The normal vector to reflect on.
//	 * 
//	 * @return An new instance of the vector with the result.
//	 */
//	default Vec3fR reflectN(Vec3fR v2)
//	{
//		return reflectN(v2.getX(), v2.getY(), v2.getZ());
//	}
//	
//	/**
//	 * Reflects the current vector by the given normal vector {@code (v2[0], v2[1], v2[2])} and returns the result in a new instance.
//	 * 
//	 * @param v2 The normal vector to reflect on. Minimum length: 3.
//	 * 
//	 * @return An new instance of the vector with the result.
//	 */
//	default Vec3fR reflectN(@MinLength(3) float[] v2)
//	{
//		return reflectN(v2[0], v2[1], v2[2]);
//	}
//	
//	/**
//	 * Reflects the current vector by the given normal vector {@code (x, y, z)} and returns the result in a new instance.
//	 * 
//	 * @param x The value of the x component of the normal vector.
//	 * @param y The value of the y component of the normal vector.
//	 * @param z The value of the z component of the normal vector.
//	 * 
//	 * @return An new instance of the vector with the result.
//	 */
//	Vec3fR reflectN(float x, float y, float z);
//	
//	default <T extends Vec3fC> T halfVectorR(SimpleVec3fR v2, @ExtractionParam T res)
//	{
//		return halfVectorR(v2.getX(), v2.getY(), v2.getZ(), res);
//	}
//	
//	default <T extends Vec3fC> T halfVectorR(@MinLength(3) float[] v2, @ExtractionParam T res)
//	{
//		return halfVectorR(v2[0], v2[1], v2[2], res);
//	}
//	
//	<T extends Vec3fC> T halfVectorR(float v2x, float v2y, float v2z, @ExtractionParam T res);
//	
//	default float[] halfVectorR(SimpleVec3fR v2, @ExtractionParam @MinLength(3) float[] res)
//	{
//		return halfVectorR(v2.getX(), v2.getY(), v2.getZ(), res);
//	}
//	
//	default float[] halfVectorR(@MinLength(3) float[] v2, @ExtractionParam @MinLength(3) float[] res)
//	{
//		return halfVectorR(v2[0], v2[1], v2[2], res);
//	}
//	
//	float[] halfVectorR(float v2x, float v2y, float v2z, @ExtractionParam @MinLength(3) float[] res);
//	
//	default <T extends Vec3fC> T halfPointR(SimpleVec3fR v2, @ExtractionParam T res)
//	{
//		return halfPointR(v2.getX(), v2.getY(), v2.getZ(), res);
//	}
//	
//	default <T extends Vec3fC> T halfPointR(@MinLength(3) float[] v2, @ExtractionParam T res)
//	{
//		return halfPointR(v2[0], v2[1], v2[2], res);
//	}
//	
//	<T extends Vec3fC> T halfPointR(float v2x, float v2y, float v2z, @ExtractionParam T res);
//	
//	default float[] halfPointR(SimpleVec3fR v2, @ExtractionParam @MinLength(3) float[] res)
//	{
//		return halfPointR(v2.getX(), v2.getY(), v2.getZ(), res);
//	}
//	
//	default float[] halfPointR(@MinLength(3) float[] v2, @ExtractionParam @MinLength(3) float[] res)
//	{
//		return halfPointR(v2[0], v2[1], v2[2], res);
//	}
//	
//	float[] halfPointR(float v2x, float v2y, float v2z, @ExtractionParam @MinLength(3) float[] res);
//	
//	default <T extends Vec3fC> T minVectorR(SimpleVec3fR v2, @ExtractionParam T res)
//	{
//		return minVectorR(v2.getX(), v2.getY(), v2.getZ(), res);
//	}
//	
//	default <T extends Vec3fC> T minVectorR(float value, @ExtractionParam T res)
//	{
//		return minVectorR(value, value, value, res);
//	}
//	
//	default <T extends Vec3fC> T minVectorR(@MinLength(3) float[] v2, @ExtractionParam T res)
//	{
//		return minVectorR(v2[0], v2[1], v2[2], res);
//	}
//	
//	<T extends Vec3fC> T minVectorR(float v2x, float v2y, float v2z, @ExtractionParam T res);
//	
//	default float[] minVectorR(SimpleVec3fR v2, @ExtractionParam @MinLength(3) float[] res)
//	{
//		return minVectorR(v2.getX(), v2.getY(), v2.getZ(), res);
//	}
//	
//	default float[] minVectorR(float value, @ExtractionParam @MinLength(3) float[] res)
//	{
//		return minVectorR(value, value, value, res);
//	}
//	
//	default float[] minVectorR(@MinLength(3) float[] v2, @ExtractionParam @MinLength(3) float[] res)
//	{
//		return minVectorR(v2[0], v2[1], v2[2], res);
//	}
//	
//	float[] minVectorR(float v2x, float v2y, float v2z, @ExtractionParam @MinLength(3) float[] res);
//	
//	default <T extends Vec3fC> T maxVectorR(SimpleVec3fR v2, @ExtractionParam T res)
//	{
//		return maxVectorR(v2.getX(), v2.getY(), v2.getZ(), res);
//	}
//	
//	default <T extends Vec3fC> T maxVectorR(float value, @ExtractionParam T res)
//	{
//		return maxVectorR(value, value, value, res);
//	}
//	
//	default <T extends Vec3fC> T maxVectorR(@MinLength(3) float[] v2, @ExtractionParam T res)
//	{
//		return maxVectorR(v2[0], v2[1], v2[2], res);
//	}
//	
//	<T extends Vec3fC> T maxVectorR(float v2x, float v2y, float v2z, @ExtractionParam T res);
//	
//	default float[] maxVectorR(SimpleVec3fR v2, @ExtractionParam @MinLength(3) float[] res)
//	{
//		return maxVectorR(v2.getX(), v2.getY(), v2.getZ(), res);
//	}
//	
//	default float[] maxVectorR(float value, @ExtractionParam @MinLength(3) float[] res)
//	{
//		return maxVectorR(value, value, value, res);
//	}
//	
//	default float[] maxVectorR(@MinLength(3) float[] v2, @ExtractionParam @MinLength(3) float[] res)
//	{
//		return maxVectorR(v2[0], v2[1], v2[2], res);
//	}
//	
//	float[] maxVectorR(float v2x, float v2y, float v2z, @ExtractionParam @MinLength(3) float[] res);
//	
//	default <T extends Vec3fC> T addR(SimpleVec3fR v2, @ExtractionParam T res)
//	{
//		return addR(v2.getX(), v2.getY(), v2.getZ(), res);
//	}
//	
//	default <T extends Vec3fC> T addR(float value, @ExtractionParam T res)
//	{
//		return addR(value, value, value, res);
//	}
//	
//	default <T extends Vec3fC> T addR(@MinLength(3) float[] v2, @ExtractionParam T res)
//	{
//		return addR(v2[0], v2[1], v2[2], res);
//	}
//	
//	<T extends Vec3fC> T addR(float v2x, float v2y, float v2z, @ExtractionParam T res);
//	
//	default float[] addR(SimpleVec3fR v2, @ExtractionParam @MinLength(3) float[] res)
//	{
//		return addR(v2.getX(), v2.getY(), v2.getZ(), res);
//	}
//	
//	default float[] addR(float value, @ExtractionParam @MinLength(3) float[] res)
//	{
//		return addR(value, value, value, res);
//	}
//	
//	default float[] addR(@MinLength(3) float[] v2, @ExtractionParam @MinLength(3) float[] res)
//	{
//		return addR(v2[0], v2[1], v2[2], res);
//	}
//	
//	float[] addR(float v2x, float v2y, float v2z, @ExtractionParam @MinLength(3) float[] res);
//	
//	default <T extends Vec3fC> T subR(SimpleVec3fR v2, @ExtractionParam T res)
//	{
//		return subR(v2.getX(), v2.getY(), v2.getZ(), res);
//	}
//	
//	default <T extends Vec3fC> T subR(float value, @ExtractionParam T res)
//	{
//		return subR(value, value, value, res);
//	}
//	
//	default <T extends Vec3fC> T subR(@MinLength(3) float[] v2, @ExtractionParam T res)
//	{
//		return subR(v2[0], v2[1], v2[2], res);
//	}
//	
//	<T extends Vec3fC> T subR(float v2x, float v2y, float v2z, @ExtractionParam T res);
//	
//	default float[] subR(SimpleVec3fR v2, @ExtractionParam @MinLength(3) float[] res)
//	{
//		return subR(v2.getX(), v2.getY(), v2.getZ(), res);
//	}
//	
//	default float[] subR(float value, @ExtractionParam @MinLength(3) float[] res)
//	{
//		return subR(value, value, value, res);
//	}
//	
//	default float[] subR(@MinLength(3) float[] v2, @ExtractionParam @MinLength(3) float[] res)
//	{
//		return subR(v2[0], v2[1], v2[2], res);
//	}
//	
//	float[] subR(float v2x, float v2y, float v2z, @ExtractionParam @MinLength(3) float[] res);
//	
//	default <T extends Vec3fC> T revSubR(SimpleVec3fR v2, @ExtractionParam T res)
//	{
//		return revSubR(v2.getX(), v2.getY(), v2.getZ(), res);
//	}
//	
//	default <T extends Vec3fC> T revSubR(float value, @ExtractionParam T res)
//	{
//		return revSubR(value, value, value, res);
//	}
//	
//	default <T extends Vec3fC> T revSubR(@MinLength(3) float[] v2, @ExtractionParam T res)
//	{
//		return revSubR(v2[0], v2[1], v2[2], res);
//	}
//	
//	<T extends Vec3fC> T revSubR(float v2x, float v2y, float v2z, @ExtractionParam T res);
//	
//	default float[] revSubR(SimpleVec3fR v2, @ExtractionParam @MinLength(3) float[] res)
//	{
//		return revSubR(v2.getX(), v2.getY(), v2.getZ(), res);
//	}
//	
//	default float[] revSubR(float value, @ExtractionParam @MinLength(3) float[] res)
//	{
//		return revSubR(value, value, value, res);
//	}
//	
//	default float[] revSubR(@MinLength(3) float[] v2, @ExtractionParam @MinLength(3) float[] res)
//	{
//		return revSubR(v2[0], v2[1], v2[2], res);
//	}
//	
//	float[] revSubR(float v2x, float v2y, float v2z, @ExtractionParam @MinLength(3) float[] res);
//	
//	default <T extends Vec3fC> T mulR(SimpleVec3fR v2, @ExtractionParam T res)
//	{
//		return mulR(v2.getX(), v2.getY(), v2.getZ(), res);
//	}
//	
//	default <T extends Vec3fC> T mulR(float value, @ExtractionParam T res)
//	{
//		return mulR(value, value, value, res);
//	}
//	
//	default <T extends Vec3fC> T mulR(@MinLength(3) float[] v2, @ExtractionParam T res)
//	{
//		return mulR(v2[0], v2[1], v2[2], res);
//	}
//	
//	<T extends Vec3fC> T mulR(float v2x, float v2y, float v2z, @ExtractionParam T res);
//	
//	default float[] mulR(SimpleVec3fR v2, @ExtractionParam @MinLength(3) float[] res)
//	{
//		return mulR(v2.getX(), v2.getY(), v2.getZ(), res);
//	}
//	
//	default float[] mulR(float value, @ExtractionParam @MinLength(3) float[] res)
//	{
//		return mulR(value, value, value, res);
//	}
//	
//	default float[] mulR(@MinLength(3) float[] v2, @ExtractionParam @MinLength(3) float[] res)
//	{
//		return mulR(v2[0], v2[1], v2[2], res);
//	}
//	
//	float[] mulR(float v2x, float v2y, float v2z, @ExtractionParam @MinLength(3) float[] res);
//	
//	default <T extends Vec3fC> T divR(SimpleVec3fR v2, @ExtractionParam T res)
//	{
//		return divR(v2.getX(), v2.getY(), v2.getZ(), res);
//	}
//	
//	default <T extends Vec3fC> T divR(float value, @ExtractionParam T res)
//	{
//		return divR(value, value, value, res);
//	}
//	
//	default <T extends Vec3fC> T divR(@MinLength(3) float[] v2, @ExtractionParam T res)
//	{
//		return divR(v2[0], v2[1], v2[2], res);
//	}
//	
//	<T extends Vec3fC> T divR(float v2x, float v2y, float v2z, @ExtractionParam T res);
//	
//	default float[] divR(SimpleVec3fR v2, @ExtractionParam @MinLength(3) float[] res)
//	{
//		return divR(v2.getX(), v2.getY(), v2.getZ(), res);
//	}
//	
//	default float[] divR(float value, @ExtractionParam @MinLength(3) float[] res)
//	{
//		return divR(value, value, value, res);
//	}
//	
//	default float[] divR(@MinLength(3) float[] v2, @ExtractionParam @MinLength(3) float[] res)
//	{
//		return divR(v2[0], v2[1], v2[2], res);
//	}
//	
//	float[] divR(float v2x, float v2y, float v2z, @ExtractionParam @MinLength(3) float[] res);
//	
//	default <T extends Vec3fC> T revDivR(SimpleVec3fR v2, @ExtractionParam T res)
//	{
//		return revDivR(v2.getX(), v2.getY(), v2.getZ(), res);
//	}
//	
//	default <T extends Vec3fC> T revDivR(float value, @ExtractionParam T res)
//	{
//		return revDivR(value, value, value, res);
//	}
//	
//	default <T extends Vec3fC> T revDivR(@MinLength(3) float[] v2, @ExtractionParam T res)
//	{
//		return revDivR(v2[0], v2[1], v2[2], res);
//	}
//	
//	<T extends Vec3fC> T revDivR(float v2x, float v2y, float v2z, @ExtractionParam T res);
//	
//	default float[] revDivR(SimpleVec3fR v2, @ExtractionParam @MinLength(3) float[] res)
//	{
//		return revDivR(v2.getX(), v2.getY(), v2.getZ(), res);
//	}
//	
//	default float[] revDivR(float value, @ExtractionParam @MinLength(3) float[] res)
//	{
//		return revDivR(value, value, value, res);
//	}
//	
//	default float[] revDivR(@MinLength(3) float[] v2, @ExtractionParam @MinLength(3) float[] res)
//	{
//		return revDivR(v2[0], v2[1], v2[2], res);
//	}
//	
//	float[] revDivR(float v2x, float v2y, float v2z, @ExtractionParam @MinLength(3) float[] res);
//	
//	<T extends Vec3fC> T normalizeUnsafeR(@ExtractionParam T res);
//	
//	float[] normalizeUnsafeR(@ExtractionParam @MinLength(3) float[] res);
//	
//	<T extends Vec3fC> T normalizeR(@ExtractionParam T res);
//	
//	float[] normalizeR(@ExtractionParam @MinLength(3) float[] res);
//	
//	<T extends Vec3fC> T normalizeR(@FloatMinValue(0.0f) float tolerance, @ExtractionParam T res);
//	
//	float[] normalizeR(@FloatMinValue(0.0f) float tolerance, @ExtractionParam @MinLength(3) float[] res);
//	
//	<T extends Vec3fC> T negateR(@ExtractionParam T res);
//	
//	float[] negateR(@ExtractionParam @MinLength(3) float[] res);
//	
//	<T extends Vec3fC> T inverseR(@ExtractionParam T res);
//	
//	float[] inverseR(@ExtractionParam @MinLength(3) float[] res);
//	
//	default <T extends Vec3fC> T crossR(SimpleVec3fR v2, @ExtractionParam T res)
//	{
//		return crossR(v2.getX(), v2.getY(), v2.getZ(), res);
//	}
//	
//	default <T extends Vec3fC> T crossR(float value, @ExtractionParam T res)
//	{
//		return crossR(value, value, value, res);
//	}
//	
//	default <T extends Vec3fC> T crossR(@MinLength(3) float[] v2, @ExtractionParam T res)
//	{
//		return crossR(v2[0], v2[1], v2[2], res);
//	}
//	
//	<T extends Vec3fC> T crossR(float v2x, float v2y, float v2z, @ExtractionParam T res);
//	
//	default float[] crossR(SimpleVec3fR v2, @ExtractionParam @MinLength(3) float[] res)
//	{
//		return crossR(v2.getX(), v2.getY(), v2.getZ(), res);
//	}
//	
//	default float[] crossR(float value, @ExtractionParam @MinLength(3) float[] res)
//	{
//		return crossR(value, value, value, res);
//	}
//	
//	default float[] crossR(@MinLength(3) float[] v2, @ExtractionParam @MinLength(3) float[] res)
//	{
//		return crossR(v2[0], v2[1], v2[2], res);
//	}
//	
//	float[] crossR(float v2x, float v2y, float v2z, @ExtractionParam @MinLength(3) float[] res);
//	
//	<T extends Vec3fC> T absR(@ExtractionParam T res);
//	
//	float[] absR(@ExtractionParam @MinLength(3) float[] res);
//	
//	<T extends Vec3fC> T floorR(@ExtractionParam T res);
//	
//	float[] floorR(@ExtractionParam @MinLength(3) float[] res);
//	
//	<T extends Vec3fC> T ceilR(@ExtractionParam T res);
//	
//	float[] ceilR(@ExtractionParam @MinLength(3) float[] res);
//	
//	<T extends Vec3fC> T roundR(@ExtractionParam T res);
//	
//	float[] roundR(@ExtractionParam @MinLength(3) float[] res);
//	
//	<T extends Vec3fC> T truncR(@ExtractionParam T res);
//	
//	float[] truncR(@ExtractionParam @MinLength(3) float[] res);
//	
//	<T extends Vec3fC> T roundR(FloatRoundMethod method, @ExtractionParam T res);
//	
//	float[] roundR(FloatRoundMethod method, @ExtractionParam @MinLength(3) float[] res);
//	
//	<T extends Vec3fC> T signumR(@ExtractionParam T res);
//	
//	float[] signumR(@ExtractionParam @MinLength(3) float[] res);
//	
//	<T extends Vec3fC> T transformR(Mat4fR m, @ExtractionParam T res);
//	
//	float[] transformR(Mat4fR m, @ExtractionParam @MinLength(3) float[] res);
//	
//	<T extends Vec3fC> T rotateXR(float angle, @ExtractionParam T res);
//	
//	float[] rotateXR(float angle, @ExtractionParam @MinLength(3) float[] res);
//	
//	default <T extends Vec3fC> T rotateXDegR(float angle, @ExtractionParam T res)
//	{
//		return rotateXR(angle * BarghosMath.DEG_TO_RADf, res);
//	}
//	
//	default float[] rotateXDegR(float angle, @ExtractionParam @MinLength(3) float[] res)
//	{
//		return rotateXR(angle * BarghosMath.DEG_TO_RADf, res);
//	}
//	
//	<T extends Vec3fC> T rotateYR(float angle, @ExtractionParam T res);
//	
//	float[] rotateYR(float angle, @ExtractionParam @MinLength(3) float[] res);
//	
//	default <T extends Vec3fC> T rotateYDegR(float angle, @ExtractionParam T res)
//	{
//		return rotateYR(angle * BarghosMath.DEG_TO_RADf, res);
//	}
//	
//	default float[] rotateYDegR(float angle, @ExtractionParam @MinLength(3) float[] res)
//	{
//		return rotateYR(angle * BarghosMath.DEG_TO_RADf, res);
//	}
//	
//	<T extends Vec3fC> T rotateZR(float angle, @ExtractionParam T res);
//	
//	float[] rotateZR(float angle, @ExtractionParam @MinLength(3) float[] res);
//	
//	default <T extends Vec3fC> T rotateZDegR(float angle, @ExtractionParam T res)
//	{
//		return rotateZR(angle * BarghosMath.DEG_TO_RADf, res);
//	}
//	
//	default float[] rotateZDegR(float angle, @ExtractionParam @MinLength(3) float[] res)
//	{
//		return rotateZR(angle * BarghosMath.DEG_TO_RADf, res);
//	}
//	
//	default <T extends Vec3fC> T rotateR(SimpleVec3fR axis, float angle, @ExtractionParam T res)
//	{
//		return rotateR(axis.getX(), axis.getY(), axis.getZ(), angle, res);
//	}
//	
//	default <T extends Vec3fC> T rotateR(@MinLength(3) float[] axis, float angle, @ExtractionParam T res)
//	{
//		return rotateR(axis[0], axis[1], axis[2], angle, res);
//	}
//
//	<T extends Vec3fC> T rotateR(float axisX, float axisY, float axisZ, float angle, @ExtractionParam T res);
//	
//	default float[] rotateR(SimpleVec3fR axis, float angle, @ExtractionParam @MinLength(3) float[] res)
//	{
//		return rotateR(axis.getX(), axis.getY(), axis.getZ(), angle, res);
//	}
//	
//	default float[] rotateR(@MinLength(3) float[] axis, float angle, @ExtractionParam @MinLength(3) float[] res)
//	{
//		return rotateR(axis[0], axis[1], axis[2], angle, res);
//	}
//
//	float[] rotateR(float axisX, float axisY, float axisZ, float angle, @ExtractionParam @MinLength(3) float[] res);
//	
//	default <T extends Vec3fC> T rotateDegR(SimpleVec3fR axis, float angle, @ExtractionParam T res)
//	{
//		return rotateDegR(axis.getX(), axis.getY(), axis.getZ(), angle, res);
//	}
//
//	default <T extends Vec3fC> T rotateDegR(@MinLength(3) float[] axis, float angle, @ExtractionParam T res)
//	{
//		return rotateDegR(axis[0], axis[1], axis[2], angle, res);
//	}
//
//	default <T extends Vec3fC> T rotateDegR(float axisX, float axisY, float axisZ, float angle, @ExtractionParam T res)
//	{
//		return rotateR(axisX, axisY, axisZ, angle * BarghosMath.DEG_TO_RADf, res);
//	}
//	
//	default float[] rotateDegR(SimpleVec3fR axis, float angle, @ExtractionParam @MinLength(3) float[] res)
//	{
//		return rotateDegR(axis.getX(), axis.getY(), axis.getZ(), angle, res);
//	}
//
//	default float[] rotateDegR(@MinLength(3) float[] axis, float angle, @ExtractionParam @MinLength(3) float[] res)
//	{
//		return rotateDegR(axis[0], axis[1], axis[2], angle, res);
//	}
//
//	default float[] rotateDegR(float axisX, float axisY, float axisZ, float angle, @ExtractionParam @MinLength(3) float[] res)
//	{
//		return rotateR(axisX, axisY, axisZ, angle * BarghosMath.DEG_TO_RADf, res);
//	}
//	
//	<T extends Vec3fC> T rotateR(AxisAngle3fR aa, @ExtractionParam T res);
//
//	float[] rotateR(AxisAngle3fR aa, @ExtractionParam @MinLength(3) float[] res);
//	
//	<T extends Vec3fC> T rotateR(QuatR q, @ExtractionParam T res);
//	
//	float[] rotateR(QuatR q, @ExtractionParam @MinLength(3) float[] res);
//	
//	default <T extends Vec3fC> T projectR(SimpleVec3fR v2, @ExtractionParam T res)
//	{
//		return projectR(v2.getX(), v2.getY(), v2.getZ(), res);
//	}
//	
//	default <T extends Vec3fC> T projectR(@MinLength(3) float[] v2, @ExtractionParam T res)
//	{
//		return projectR(v2[0], v2[1], v2[2], res);
//	}
//	
//	<T extends Vec3fC> T projectR(float x, float y, float z, @ExtractionParam T res);
//	
//	default float[] projectR(SimpleVec3fR v2, @ExtractionParam @MinLength(3) float[] res)
//	{
//		return projectR(v2.getX(), v2.getY(), v2.getZ(), res);
//	}
//	
//	default float[] projectR(@MinLength(3) float[] v2, @ExtractionParam @MinLength(3) float[] res)
//	{
//		return projectR(v2[0], v2[1], v2[2], res);
//	}
//	
//	float[] projectR(float x, float y, float z, @ExtractionParam @MinLength(3) float[] res);
//	
//	default <T extends Vec3fC> T reflectR(SimpleVec3fR v2, @ExtractionParam T res)
//	{
//		return reflectR(v2.getX(), v2.getY(), v2.getZ(), res);
//	}
//	
//	default <T extends Vec3fC> T reflectR(@MinLength(3) float[] v2, @ExtractionParam T res)
//	{
//		return reflectR(v2[0], v2[1], v2[2], res);
//	}
//	
//	<T extends Vec3fC> T reflectR(float x, float y, float z, @ExtractionParam T res);
//	
//	default float[] reflectR(SimpleVec3fR v2, @ExtractionParam @MinLength(3) float[] res)
//	{
//		return reflectR(v2.getX(), v2.getY(), v2.getZ(), res);
//	}
//	
//	default float[] reflectR(@MinLength(3) float[] v2, @ExtractionParam @MinLength(3) float[] res)
//	{
//		return reflectR(v2[0], v2[1], v2[2], res);
//	}
//	
//	float[] reflectR(float x, float y, float z, @ExtractionParam @MinLength(3) float[] res);
//	
//	default float cosAngleToUnsafe(Vec3fR v2)
//	{
//		return cosAngleToUnsafe(v2.getX(), v2.getY(), v2.getZ());
//	}
//	
//	default float cosAngleToUnsafe(@MinLength(3) float[] v2)
//	{
//		return cosAngleToUnsafe(v2[0], v2[1], v2[2]);
//	}
//	
//	float cosAngleToUnsafe(float x, float y, float z);
//	
//	default float cosAngleTo(SimpleVec3fR v2)
//	{
//		return cosAngleTo(v2.getX(), v2.getY(), v2.getZ());
//	}
//	
//	default float cosAngleTo(@MinLength(3) float[] v2)
//	{
//		return cosAngleTo(v2[0], v2[1], v2[2]);
//	}
//	
//	float cosAngleTo(float x, float y, float z);
//}
