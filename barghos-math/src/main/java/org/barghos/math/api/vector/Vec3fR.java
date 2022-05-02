package org.barghos.math.api.vector;

import org.barghos.core.api.tuple3.Tup3fR;
import org.barghos.core.api.tuple2.Tup2oC;
import org.barghos.core.api.tuple2.Tup2oR;
import org.barghos.core.api.util.function.GenericFunction2;
import org.barghos.math.api.matrix.Mat4fR;

/**
 * This interface grants readonly access to any 3-dimensional float vector.
 * 
 * <p>
 * It should be prefered by design before direct usage of a type in method parameters,
 * if the method only reads data from the parameter.
 * 
 * @author picatrix1899
 */
public interface Vec3fR extends Tup3fR
{
	/** {@inheritDoc} */
	Vec3fR clone();
	
	/**
	 * Returns the reciprocal length of the vector.
	 * It doesn't account for zero-length vectors and will in such case throw an {@link ArithmeticException}
	 * as this would result in a division by zero.
	 * 
	 * <p>
	 * Operation:
	 * 1 / |v|
	 * 
	 * @return The reciprocal length of the vector.
	 * 
	 * @throws
	 * ArithmeticException Thrown when it is a zero-length vector.
	 */
	float reciprocalLength();
	
	/**
	 * Returns the reciprocal length of the vector.
	 * If the vector is a zero-length vector the result will be zero.
	 * It determines a zero-length by checking if all components are exactly zero.
	 * Due to floating-point-errors it might still throw an {@link ArithmeticException} when
	 * the length is too close to zero.
	 * 
	 * <p>
	 * Operation:
	 * 1 / |v|
	 * 
	 * @return The reciprocal length of the vector or zero if it is a zero-length vector.
	 * 
	 * @throws
	 * ArithmeticException Might be thrown when the length is to close to zero.
	 */
	float reciprocalLengthSafe();
	
	/**
	 * Returns the reciprocal length of the vector.
	 * If the vector is a zero-length vector the result will be zero.
	 * It determines a zero-length by checking if all components are within the margin defined by
	 * zero plus-minus the given tolerance inclusive (-tolerance <= value <= tolerance).
	 * 
	 * <p>
	 * Operation:
	 * 1 / |v|
	 * 
	 * @param tolerance The tolerance for defining the margin around zero.
	 * 
	 * @return The reciprocal length of the vector or zero if it is a zero-length vector.
	 */
	float reciprocalLengthSafeWithMargin(float tolerance);
	
	/**
	 * Returns the length of the vector.
	 * It doesn't account for zero-length vectors.
	 * 
	 * <p>
	 * Operation:
	 * |v|
	 * 
	 * @return The length of the vector.
	 */
	float length();
	
	/**
	 * Returns the length of the vector.
	 * If the vector is a zero-length vector the result will be zero.
	 * It determines a zero-length by checking if all components are exactly zero.
	 * 
	 * <p>
	 * Operation:
	 * |v|
	 * 
	 * @return The length of the vector or zero if it is a zero-length vector.
	 */
	float lengthSafe();
	
	/**
	 * Returns the length of the vector.
	 * If the vector is a zero-length vector the result will be zero.
	 * It determines a zero-length by checking if all components are within the margin defined by
	 * zero plus-minus the given tolerance inclusive (-tolerance <= value <= tolerance).
	 * 
	 * <p>
	 * Operation:
	 * |v|
	 * 
	 * @param tolerance The tolerance for defining the margin around zero.
	 * 
	 * @return The length of the vector or zero if it is a zero-length vector.
	 */
	float lengthSafeWithMargin(float tolerance);
	
	/**
	 * Returns the squared length of the vector.
	 * It doesn't account for zero-length vectors.
	 * 
	 * <p>
	 * Operation:
	 * |v|²
	 * 
	 * @return The squared length of the vector.
	 */
	float squaredLength();
	
	/**
	 * Returns the squared length of the vector.
	 * If the vector is a zero-length vector the result will be zero.
	 * It determines a zero-length by checking if all components are exactly zero.
	 * 
	 * <p>
	 * Operation:
	 * |v|²
	 * 
	 * @return The squared length of the vector or zero if it is a zero-length vector.
	 */
	float squaredLengthSafe();
	
	/**
	 * Returns the squared length of the vector.
	 * If the vector is a zero-length vector the result will be zero.
	 * It determines a zero-length by checking if all components are within the margin defined by
	 * zero plus-minus the given tolerance inclusive (-tolerance <= value <= tolerance).
	 * 
	 * <p>
	 * Operation:
	 * |v|²
	 * 
	 * @param tolerance The tolerance for defining the margin around zero.
	 * 
	 * @return The squared length of the vector or zero if it is a zero-length vector.
	 */
	float squaredLengthSafeWithMargin(float tolerance);
	
	/**
	 * Determines the smallest value of the components and returns the value and the index of the component.
	 * The index returned is limited to the range of 0 to getDimensions() - 1.
	 * If two or more components have the same value the first index will be returned.
	 * The returned tuple is immutable.
	 * 
	 * @return The smallest value of the components and the index of the corresponding component.
	 */
	Tup2oR<Float,Integer> min();
	
	/**
	 * Determines the smallest value of the components and returns the value and the index of the component.
	 * The index returned is limited to the range of 0 to getDimensions() - 1.
	 * If two or more components have the same value the first index will be returned.
	 * This version utilizes a query parameter that receives the result and will be returned.
	 * 
	 * @param res The query parameter for the result.
	 * 
	 * @return The instance from the res parameter with the result.
	 */
	<T extends Tup2oC<Float,Integer>> T minR(T res);
	
	/**
	 * Determines the smallest value of the components and returns the value and the index of the component.
	 * The index returned is limited to the range of 0 to getDimensions() - 1.
	 * If two or more components have the same value the first index will be returned.
	 * This version provides the result to the given functional interface implementation and returns the result of that call.
	 * 
	 * @param func The functional interface implementation to call with the result.
	 * 
	 * @return The returned result from the functional interface implementation.
	 */
	<T> T minR(GenericFunction2<Float,Integer,T> func);
	
	/**
	 * Determines the smallest value of the components and returns it.
	 * 
	 * @return The smallest value of the components.
	 */
	float minValue();
	
	/**
	 * Determines the smallest value of the componensts and returns the index of the component.
	 * The index returned is limited to the range of 0 to getDimensions() - 1.
	 * If two or more components have the same value the first index will be returned.
	 * 
	 * @return The index of the smallest component.
	 */
	int minComponent();
	
	/**
	 * Determines the greatest value of the components and returns the value and the index of the component.
	 * The index returned is limited to the range of 0 to getDimensions() - 1.
	 * If two or more components have the same value the first index will be returned.
	 * The returned tuple is immutable.
	 * 
	 * @return The greatest value of the components and the index of the corresponding component.
	 */
	Tup2oR<Float,Integer> max();
	
	/**
	 * Determines the greatest value of the components and returns the value and the index of the component.
	 * The index returned is limited to the range of 0 to getDimensions() - 1.
	 * If two or more components have the same value the first index will be returned.
	 * This version utilizes a query parameter that receives the result and will be returned.
	 * 
	 * @param res The query parameter for the result.
	 * 
	 * @return The instance from the res parameter with the result.
	 */
	<T extends Tup2oC<Float,Integer>> T maxR(T res);
	
	/**
	 * Determines the greatest value of the components and returns the value and the index of the component.
	 * The index returned is limited to the range of 0 to getDimensions() - 1.
	 * If two or more components have the same value the first index will be returned.
	 * This version provides the result to the given functional interface implementation and returns the result of that call.
	 * 
	 * @param func The functional interface implementation to call with the result.
	 * 
	 * @return The returned result from the functional interface implementation.
	 */
	<T> T maxR(GenericFunction2<Float,Integer,T> func);
	
	/**
	 * Determines the greatest value of the components and returns it.
	 * 
	 * @return The greatest value of the components.
	 */
	float maxValue();
	
	/**
	 * Determines the greatest value of the componensts and returns the index of the component.
	 * The index returned is limited to the range of 0 to getDimensions() - 1.
	 * If two or more components have the same value the first index will be returned.
	 * 
	 * @return The index of the greatest component.
	 */
	int maxComponent();
	
	/**
	 * Adds the second given tuple to the current vector and saves the result in a new instance.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation:
	 * v + t
	 * 
	 * @param t The second tuple to add to the current vector.
	 * 
	 * @return The new instance with the result.
	 */
	default Vec3fC addN(Tup3fR t)
	{
		return addN(t.getX(), t.getY(), t.getZ());
	}
	
	/**
	 * Adds the second tuple defined by the given value to the current vector and saves the result in a new instance.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation:
	 * v + (value, value, value)
	 * 
	 * @param value The value of all the components of the second tuple.
	 * 
	 * @return The new instance with the result.
	 */
	default Vec3fC addN(float value)
	{
		return addN(value, value, value);
	}
	
	/**
	 * Adds the second tuple defined by the given component values to the current vector and saves the result in
	 * a new instance.
	 * the current vector is of.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation:
	 * v + (x, y, z)
	 * 
	 * @param x The value of the x component of the second tuple.
	 * @param y The value of the y component of the second tuple.
	 * @param z The value of the z component of the second tuple.
	 * 
	 * @return The new instance with the result.
	 */
	Vec3fC addN(float x, float y, float z);
	
	/**
	 * Subtracts the second given tuple from the current vector and saves the result in a new instance.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation:
	 * v - t
	 * 
	 * @param t The second tuple to subtract from the current vector.
	 * 
	 * @return The new instance with the result.
	 */
	default Vec3fC subN(Tup3fR t)
	{
		return subN(t.getX(), t.getY(), t.getZ());
	}
	
	/**
	 * Subtracts the second tuple defined by the given value from the current vector and saves the result in a new instance.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation:
	 * v - (value, value, value)
	 * 
	 * @param value The value of all the components of the second tuple.
	 * 
	 * @return The new instance with the result.
	 */
	default Vec3fC subN(float value)
	{
		return subN(value, value, value);
	}
	
	/**
	 * Subtracts the second tuple defined by the given component values from the current vector and saves the result in
	 * a new instance.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation:
	 * v - (x, y, z)
	 * 
	 * @param x The value of the x component of the second tuple.
	 * @param y The value of the y component of the second tuple.
	 * @param z The value of the z component of the second tuple.
	 * 
	 * @return The new instance with the result.
	 */
	Vec3fC subN(float x, float y, float z);
	
	/**
	 * Subtracts the current vector from the second given tuple and saves the result in a new instance.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation:
	 * t - v
	 * 
	 * @param t The second tuple of which the current vector is subtracted from.
	 * 
	 * @return The new instance with the result.
	 */
	default Vec3fC revSubN(Tup3fR t)
	{
		return revSubN(t.getX(), t.getY(), t.getZ());
	}
	
	/**
	 * Subtracts the current vector from the second tuple defined by the given value and saves the result in a new instance.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation:
	 * (value, value, value) - v 
	 * 
	 * @param value The value of all the components of the second tuple.
	 * 
	 * @return The new instance with the result.
	 */
	default Vec3fC revSubN(float value)
	{
		return revSubN(value, value, value);
	}
		
	/**
	 * Subtracts the current vector from the second tuple defined by the given component values and saves the result in
	 * a new instance.
	 * the current vector is of.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation:
	 * (x, y, z) - v 
	 * 
	 * @param x The value of the x component of the second tuple.
	 * @param y The value of the y component of the second tuple.
	 * @param z The value of the z component of the second tuple.
	 * 
	 * @return The new instance with the result.
	 */
	Vec3fC revSubN(float x, float y, float z);
	
	/**
	 * Multiplies the current vector with the second given tuple and saves the result in a new instance.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation:
	 * v * t
	 * 
	 * @param t The second tuple to multiply the current vector with.
	 * 
	 * @return The new instance with the result.
	 */
	default Vec3fC mulN(Tup3fR t)
	{
		return mulN(t.getX(), t.getY(), t.getZ());
	}
	
	/**
	 * Multiplies the current vector with the second tuple defined by the given value and saves the result in a new instance.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation:
	 * v * (value, value, value)
	 * 
	 * @param value The value of all the components of the second tuple.
	 * 
	 * @return The new instance with the result.
	 */
	default Vec3fC mulN(float value)
	{
		return mulN(value, value, value);
	}
	
	/**
	 * Multiplies the current vector with the second tuple defined by the given component values and saves the result in
	 * a new instance.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation:
	 * v * (x, y, z)
	 * 
	 * @param x The value of the x component of the second tuple.
	 * @param y The value of the y component of the second tuple.
	 * @param z The value of the z component of the second tuple.
	 * 
	 * @return The new instance with the result.
	 */
	Vec3fC mulN(float x, float y, float z);
	
	/**
	 * Divides the current vector by the second given tuple and saves the result in a new instance.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation:
	 * v / t
	 * 
	 * @param t The second tuple to divide the current vector by.
	 * 
	 * @return The new instance with the result.
	 */
	default Vec3fC divN(Tup3fR t)
	{
		return divN(t.getX(), t.getY(), t.getZ());
	}
	
	/**
	 * Divides the current vector by the second tuple defined by the given value and saves the result in a new instance.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation:
	 * v / (value, value, value)
	 * 
	 * @param value The value of all the components of the second tuple.
	 * 
	 * @return The new instance with the result.
	 */
	default Vec3fC divN(float value)
	{
		return divN(value, value, value);
	}
	
	/**
	 * Divides the current vector by the second tuple defined by the given component values and saves the result in
	 * a new instance.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation:
	 * v / (x, y, z)
	 * 
	 * @param x The value of the x component of the second tuple.
	 * @param y The value of the y component of the second tuple.
	 * @param z The value of the z component of the second tuple.
	 * 
	 * @return The new instance with the result.
	 */
	Vec3fC divN(float x, float y, float z);

	/**
	 * Divides the second given tuple by the current vector and saves the result in a new instance.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation:
	 * t / v
	 * 
	 * @param t The second tuple to divide by the current vector.
	 * 
	 * @return The new instance with the result.
	 */
	default Vec3fC revDivN(Tup3fR t)
	{
		return revDivN(t.getX(), t.getY(), t.getZ());
	}

	/**
	 * Divides the second tuple defined by the given value by the current vector and saves the result in a new instance.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation:
	 * (value, value, value) / v 
	 * 
	 * @param value The value of all the components of the second tuple.
	 * 
	 * @return The new instance with the result.
	 */
	default Vec3fC revDivN(float value)
	{
		return revDivN(value, value, value);
	}

	/**
	 * Divides the second tuple defined by the given component values by the current vector and saves the result in
	 * a new instance.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation:
	 * (x, y, z) / v
	 * 
	 * @param x The value of the x component of the second tuple.
	 * @param y The value of the y component of the second tuple.
	 * @param z The value of the z component of the second tuple.
	 * 
	 * @return The new instance with the result.
	 */
	Vec3fC revDivN(float x, float y, float z);

	/**
	 * Normalizes the current vector and saves the result in a new instance.
	 * Normalization is done by dividing the vector by its length.
	 * This doesn't account for zero-length vectors and will in such case throw an {@link ArithmeticException}
	 * as this would result in a division by zero.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation:
	 * v / |v|
	 * 
	 * @param res The query parameter to receive the result.
	 * 
	 * @return The new instance with the result.
	 * 
	 * @throws ArithmeticException Thrown when it is a zero-length vector.
	 */
	Vec3fC normalN();

	/**
	 * Normalizes the current vector and saves the result in a new instance.
	 * Normalization is done by dividing the vector by its length.
	 * If the vector is a zero-length vector the result will be a zero vector.
	 * It determines a zero-length by checking if all components are exactly zero.
	 * Due to floating-point-errors it might still throw an {@link ArithmeticException} when
	 * the length is too close to zero.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation:
	 * v / |v|
	 * 
	 * @param res The query parameter to receive the result.
	 * 
	 * @return The new instance with the result.
	 * 
	 * @throws ArithmeticException Might be thrown when the length is to close to zero.
	 */
	Vec3fC normalSafeN();

	/**
	 * Normalizes the current vector and saves the result in a new instance.
	 * Normalization is done by dividing the vector by its length.
	 * If the vector is a zero-length vector the result will be a zero vector.
	 * It determines a zero-length by checking if all components are within the margin defined by
	 * zero plus-minus the given tolerance inclusive (-tolerance <= value <= tolerance).
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation:
	 * v / |v|
	 * 
	 * @param tolerance The tolerance for defining the margin around zero.
	 * 
	 * @return The new instance with the result.
	 */
	Vec3fC normalSafeWithMarginN(float tolerance);

	/**
	 * Inverts the current vector and saves the result in a new instance.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation:
	 * -v
	 * 
	 * @return The new instance with the result.
	 */
	Vec3fC invertN();
	
	/**
	 * Inverses the current vector based on the value one and saves the result in a new instance.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation:
	 * 1 - v
	 * 
	 * @return The new instance with the result.
	 */
	Vec3fC inverseN();

	/**
	 * Inverses the current vector based on the given tuple and saves the result in a new instance.
	 * It does the same as {@link #revSub(Tup2fR)} and is present for completness.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation:
	 * t - v
	 * 
	 * @param t The tuple the inversion is based on.
	 * 
	 * @return The new instance with the result.
	 */
	default Vec3fC inverseN(Tup3fR t)
	{
		return inverseN(t.getX(), t.getY(), t.getZ());
	}

	/**
	 * Inverses the current vector based on the given value and saves the result in a new instance.
	 * It does the same as {@link #revSub(float)} and is present for completness.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation:
	 * value - v
	 * 
	 * @param value The value the inversion is based on.
	 * 
	 * @return The new instance with the result.
	 */
	default Vec3fC inverseN(float value)
	{
		return inverseN(value, value, value);
	}

	/**
	 * Inverses the current vector based on the given component values and saves the result in a new instance.
	 * It does the same as {@link #revSub(float, float)} and is present for completness.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation:
	 * (x, y, z) - v
	 * 
	 * @param x The value the inversion of the x component is based on.
	 * @param y The value the inversion of the y component is based on.
	 * @param z The value the inversion of the z component is based on.
	 * 
	 * @return The new instance with the result.
	 */
	Vec3fC inverseN(float x, float y, float z);
	
	/**
	 * Calculates the cross product between this vector and the given tuple
	 * and saves the result in a new instance.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Definition:
	 * In a standard right handed cartesian system there are the following relations between axis assuming a positive direction.<br>
	 * Imagine looking in the desired direction and using the axis in counterclockwise order.
	 * 
	 * forward(z) = right(x) X up(y)<br>
	 * up(y) = forward(z) X right(x)<br>
	 * right(x) = up(y) X forward(z)
	 * 
	 * @param t The tuple.
	 * 
	 * @return The new instance with the result.
	 */
	default Vec3fC crossN(Tup3fR t)
	{
		return crossN(t.getX(), t.getY(), t.getZ());
	}
	
	/**
	 * Calculates the cross product between this vector and a tuple defined by the given value
	 * and saves the result in a new instance.
	 * This operation does not alter the current vector.
	 * 
	 * @param value The value of all the components of the second tuple.
	 * 
	 * @return The new instance with the result.
	 */
	default Vec3fC crossN(float value)
	{
		return crossN(value, value, value);
	}
	
	/**
	 * Calculates the cross product between this vector and a tuple defined by the given component values
	 * and saves the result in a new instance.
	 * This operation does not alter the current vector.
	 * 
	 * @param x The value of the x component of the second tuple.
	 * @param y The value of the y component of the second tuple.
	 * @param z The value of the z component of the second tuple.
	 * 
	 * @return The new instance with the result.
	 */
	Vec3fC crossN(float x, float y, float z);
	
	/**
	 * Makes all components of the vector absolute and saves the result in a new instance.
	 * This operation does not alter the current vector.
	 * 
	 * @return The new instance with the result.
	 */
	Vec3fC absN();
	
	/**
	 * Rounds all components down to the next integer closer to negative infinity and saves the result in a new instance.
	 * This operation does not alter the current vector.
	 * 
	 * @return The new instance with the result.
	 */
	Vec3fC floorN();
	
	/**
	 * Rounds all components up to the next integer closer to positive infinity and saves the result in a new instance.
	 * This operation does not alter the current vector.
	 * 
	 * @return The new instance with the result.
	 */
	Vec3fC ceilN();
	
	/**
	 * Rounds all components up to the next integer closer to positive infinity or negative infinity and saves the result in a new instance.
	 * This operation does not alter the current vector.
	 * 
	 * @return The new instance with the result.
	 */
	Vec3fC roundN();
	
	/**
	 * Truncates the decimals of the components and saves the result in a new instance.
	 * This operation does not alter the current vector.
	 * 
	 * @return The new instance with the result.
	 */
	Vec3fC truncN();
	
	/**
	 * Sets the vector to the signums of the components and saves the result in a new instance.
	 * This operation does not alter the current vector.
	 * 
	 * @return The new instance with the result.
	 */
	Vec3fC signumN();
	
	/**
	 * Applies the given matrix to the current vector and therefore transforming it and saves the result in a new instance.
	 * This operation does not alter the current vector.
	 * 
	 * @param m The matrix to apply.
	 * 
	 * @return The current vector.
	 */
	Vec3fC transformN(Mat4fR m);
}
