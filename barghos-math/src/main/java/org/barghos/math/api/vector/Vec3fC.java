package org.barghos.math.api.vector;

import org.barghos.core.api.tuple.TupdR;
import org.barghos.core.api.tuple.TupfR;
import org.barghos.core.api.tuple3.Tup3fR;
import org.barghos.core.api.tuple3.Tup3fC;
import org.barghos.math.api.matrix.Mat4fR;

/**
 * This interface represents any modifiable 3-dimensional float vector.
 * 
 * <p>
 * It should be prefered by design before direct usage of a type in method parameters,
 * if the method only writes data to the parameter.
 * 
 * @author picatrix1899
 */
public interface Vec3fC extends Vec3fR, Tup3fC
{
	/**
	 * Sets the x component of the vector.
	 * 
	 * @param x The new x value.
	 * 
	 * @return The current vector.
	 */
	@Override
	Vec3fC setX(float x);
	
	/**
	 * Sets the y component of the vector.
	 * 
	 * @param y The new y value.
	 * 
	 * @return The current vector.
	 */
	@Override
	Vec3fC setY(float y);
	
	/**
	 * Sets the z component of the vector.
	 * 
	 * @param z The new z value.
	 * 
	 * @return The current vector.
	 */
	@Override
	Vec3fC setZ(float z);
	
	/**
	 * Adopts the values from an existing instance of {@link Tup3fR}.
	 * 
	 * @param t An existing implementation of {@link Tup3fR} to adopt the values from.
	 * 
	 * @return The current vector.
	 */
	@Override
	default Vec3fC set(Tup3fR t)
	{
		return (Vec3fC)Tup3fC.super.set(t);
	}
	
	/**
	 * Sets all components to a single value.
	 * 
	 * <p>
	 * This is usually used for resetting the vector back to 0 again, by calling <code>set(0)</code>.
	 * </p>
	 * 
	 * @param value The value used for all components of the vector.
	 * 
	 * @return The current vector.
	 */
	@Override
	default Vec3fC set(float value)
	{
		return (Vec3fC)Tup3fC.super.set(value);
	}
	
	/**
	 * Sets the components to the corresponding paramters.
	 * 
	 * @param x The new x value.
	 * @param y The new y value.
	 * @param z The new z value.
	 * 
	 * @return The current vector.
	 */
	@Override
	default Vec3fC set(float x, float y, float z)
	{
		return (Vec3fC)Tup3fC.super.set(x, y, z);
	}
	
	/**
	 * Sets the value of the component at the given index.
	 * 
	 * @param index The index of the component to store the value in.
	 * @param value The new value for the component.
	 * 
	 * @return The current vector.
	 */
	@Override
	default Vec3fC setByIndex(int index, float value)
	{
		return (Vec3fC)Tup3fC.super.setByIndex(index, value);
	}
	
	/**
	 * Sets the components to the corresponding components.
	 * 
	 * @param values The values to store in the components of the vector.
	 * 
	 * @return The current vector.
	 */
	@Override
	default Vec3fC setArray(float... values)
	{
		return (Vec3fC)Tup3fC.super.setArray(values);
	}
	
	/**
	 * Adopts the values from an existing instance of {@link TupdR}.
	 * 
	 * @param t An existing implementation of {@link TupdR} to adopt the values from.
	 * 
	 * @return The current vector.
	 */
	@Override
	default Vec3fC set(TupfR t)
	{
		return (Vec3fC)Tup3fC.super.set(t);
	}
	
	/** {@inheritDoc} */
	@Override
	Vec3fC clone();
	
	/**
	 * Adds the second given tuple to the current vector.
	 * This operation alters the current vector.
	 * 
	 * <p>
	 * Operation:
	 * v + t
	 * @param t The second tuple to add to the current vector.
	 * 
	 * @return The current vector.
	 */
	default Vec3fC add(Tup3fR t)
	{
		return add(t.getX(), t.getY(), t.getZ());
	}
	
	/**
	 * Adds the second tuple defined by the given value to the current vector.
	 * This operation alters the current vector.
	 * 
	 * <p>
	 * Operation:
	 * v + (value, value, value)
	 * 
	 * @param value The value of all the components of the second tuple.
	 * 
	 * @return The current vector.
	 */
	default Vec3fC add(float value)
	{
		return add(value, value, value);
	}
	
	/**
	 * Adds the second tuple defined by the given component values to the current vector
	 * This operation alters the current vector.
	 * 
	 * <p>
	 * Operation:
	 * v + (x, y, z)
	 * 
	 * @param x The value of the x component of the second tuple.
	 * @param y The value of the y component of the second tuple.
	 * @param z The value of the z component of the second tuple.
	 * 
	 * @return The current vector.
	 */
	Vec3fC add(float x, float y, float z);
	
	/**
	 * Subtracts the second given tuple from the current vector.
	 * This operation alters the current vector.
	 * 
	 * <p>
	 * Operation:
	 * v - t
	 * 
	 * @param t The second tuple to subtract from the current vector.
	 * 
	 * @return The current vector.
	 */
	default Vec3fC sub(Tup3fR t)
	{
		return sub(t.getX(), t.getY(), t.getZ());
	}
	
	/**
	 * Subtracts the second tuple defined by the given value from the current vector.
	 * This operation alters the current vector.
	 * 
	 * <p>
	 * Operation:
	 * v - (value, value, value)
	 * 
	 * @param value The value of all the components of the second tuple.
	 * 
	 * @return The current vector.
	 */
	default Vec3fC sub(float value)
	{
		return sub(value, value, value);
	}
	
	/**
	 * Subtracts the second tuple defined by the given component values from the current vector.
	 * This operation alters the current vector.
	 * 
	 * <p>
	 * Operation:
	 * v - (x, y, z)
	 * 
	 * @param x The value of the x component of the second tuple.
	 * @param y The value of the y component of the second tuple.
	 * @param z The value of the z component of the second tuple.
	 * 
	 * @return The current vector.
	 */
	Vec3fC sub(float x, float y, float z);
	
	/**
	 * Subtracts the current vector from the second given tuple.
	 * This operation alters the current vector.
	 * 
	 * <p>
	 * Operation:
	 * t - v
	 * 
	 * @param t The second tuple of which the current vector is subtracted from.
	 * 
	 * @return The current vector.
	 */
	default Vec3fC revSub(Tup3fR t)
	{
		return revSub(t.getX(), t.getY(), t.getZ());
	}
	
	/**
	 * Subtracts the current vector from the second tuple defined by the given value.
	 * This operation alters the current vector.
	 * 
	 * <p>
	 * Operation:
	 * (value, value, value) - v
	 * 
	 * @param value The value of all the components of the second tuple.
	 * 
	 * @return The current vector.
	 */
	default Vec3fC revSub(float value)
	{
		return revSub(value, value, value);
	}
	
	/**
	 * Subtracts the current vector from the second tuple defined by the given component values.
	 * This operation alters the current vector.
	 * 
	 * <p>
	 * Operation:
	 * (x, y, z) - v 
	 * 
	 * @param x The value of the x component of the second tuple.
	 * @param y The value of the y component of the second tuple.
	 * @param z The value of the z component of the second tuple.
	 * 
	 * @return The current vector.
	 */
	Vec3fC revSub(float x, float y, float z);
	
	/**
	 * Multiplies the current vector with the second given tuple.
	 * This operation alters the current vector.
	 * 
	 * <p>
	 * Operation:
	 * v * t
	 * 
	 * @param t The second tuple to multiply the current vector with.
	 * 
	 * @return The current vector.
	 */
	default Vec3fC mul(Tup3fR t)
	{
		return mul(t.getX(), t.getY(), t.getZ());
	}
	
	/**
	 * Multiplies the current vector with the second tuple defined by the given value
	 * This operation alters the current vector.
	 * 
	 * <p>
	 * Operation:
	 * v * (value, value, value)
	 * 
	 * @param value The value of all the components of the second tuple.
	 * 
	 * @return The current vector.
	 */
	default Vec3fC mul(float value)
	{
		return mul(value, value, value);
	}
	
	/**
	 * Multiplies the current vector with the second tuple defined by the given component values.
	 * This operation alters the current vector.
	 * 
	 * <p>
	 * Operation:
	 * v * (x, y, z)
	 * 
	 * @param x The value of the x component of the second tuple.
	 * @param y The value of the y component of the second tuple.
	 * @param z The value of the z component of the second tuple.
	 * 
	 * @return The current vector.
	 */
	Vec3fC mul(float x, float y, float z);
	
	/**
	 * Divides the current vector by the second given tuple.
	 * This operation alters the current vector.
	 * 
	 * <p>
	 * Operation:
	 * v / t
	 * 
	 * @param t The second tuple to divide the current vector by.
	 * 
	 * @return The current vector.
	 */
	default Vec3fC div(Tup3fR t)
	{
		return div(t.getX(), t.getY(), t.getZ());
	}
	
	/**
	 * Divides the current vector by the second tuple defined by the given value.
	 * This operation alters the current vector.
	 * 
	 * <p>
	 * Operation:
	 * v / (value, value, value)
	 * 
	 * @param value The value of all the components of the second tuple.
	 * 
	 * @return The current vector.
	 */
	default Vec3fC div(float value)
	{
		return div(value, value, value);
	}
	
	/**
	 * Divides the current vector by the second tuple defined by the given component values.
	 * This operation alters the current vector.
	 * 
	 * <p>
	 * Operation:
	 * v / (x, y, z)
	 * 
	 * @param x The value of the x component of the second tuple.
	 * @param y The value of the y component of the second tuple.
	 * @param z The value of the z component of the second tuple.
	 * 
	 * @return The current vector.
	 */
	Vec3fC div(float x, float y, float z);
	
	/**
	 * Divides the second given tuple by the current vector.
	 * This operation alters the current vector.
	 * 
	 * <p>
	 * Operation:
	 * t / v
	 * 
	 * @param t The second tuple to divide by the current vector.
	 * 
	 * @return The current vector.
	 */
	default Vec3fC revDiv(Tup3fR t)
	{
		return revDiv(t.getX(), t.getY(), t.getZ());
	}
	
	/**
	 * Divides the second tuple defined by the given value by the current vector.
	 * This operation alters the current vector.
	 * 
	 * <p>
	 * Operation:
	 * (value, value, value) / v 
	 * 
	 * @param value The value of all the components of the second tuple.
	 * 
	 * @return The current vector.
	 */
	default Vec3fC revDiv(float value)
	{
		return revDiv(value, value, value);
	}
	
	/**
	 * Divides the second tuple defined by the given component values by the current vector.
	 * This operation alters the current vector.
	 * 
	 * <p>
	 * Operation:
	 * (x, y, z) / v
	 * 
	 * @param x The value of the x component of the second tuple.
	 * @param y The value of the y component of the second tuple.
	 * @param z The value of the z component of the second tuple.
	 * 
	 * @return The current vector.
	 */
	Vec3fC revDiv(float x, float y, float z);
	
	/**
	 * Normalizes the current vector.
	 * Normalization is done by dividing the vector by its length.
	 * This doesn't account for zero-length vectors and will in such case throw an {@link ArithmeticException}
	 * as this would result in a division by zero.
	 * This operation alters the current vector.
	 * 
	 * <p>
	 * Operation:
	 * v / |v|
	 * 
	 * @param res The query parameter to receive the result.
	 * 
	 * @return The current vector.
	 * 
	 * @throws ArithmeticException Thrown when it is a zero-length vector.
	 */
	Vec3fC normal();
	
	/**
	 * Normalizes the current vector.
	 * Normalization is done by dividing the vector by its length.
	 * If the vector is a zero-length vector the result will be a zero vector.
	 * It determines a zero-length by checking if all components are exactly zero.
	 * Due to floating-point-errors it might still throw an {@link ArithmeticException} when
	 * the length is too close to zero.
	 * This operation alters the current vector.
	 * 
	 * <p>
	 * Operation:
	 * v / |v|
	 * 
	 * @param res The query parameter to receive the result.
	 * 
	 * @return The current vector.
	 * 
	 * @throws ArithmeticException Might be thrown when the length is to close to zero.
	 */
	Vec3fC normalSafe();
	
	/**
	 * Normalizes the current vector.
	 * Normalization is done by dividing the vector by its length.
	 * If the vector is a zero-length vector the result will be a zero vector.
	 * It determines a zero-length by checking if all components are within the margin defined by
	 * zero plus-minus the given tolerance inclusive (-tolerance <= value <= tolerance).
	 * This operation alters the current vector.
	 * 
	 * <p>
	 * Operation:
	 * v / |v|
	 * 
	 * @param tolerance The tolerance for defining the margin around zero.
	 * 
	 * @return The current vector.
	 */
	Vec3fC normalSafeWithMargin(float tolerance);
	
	/**
	 * Inverts the current vector.
	 * This operation alters the current vector.
	 * 
	 * <p>
	 * Operation:
	 * -v
	 * 
	 * @return The current vector.
	 */
	Vec3fC invert();
	
	/**
	 * Inverses the current vector based on the value one.
	 * This operation alters the current vector.
	 * 
	 * <p>
	 * Operation:
	 * 1 - v
	 * 
	 * @return The current vector.
	 */
	Vec3fC inverse();
	
	/**
	 * Inverses the current vector based on the given tuple.
	 * It does the same as {@link #revSub(TupBase2dR)} and is present for completness.
	 * This operation alters the current vector.
	 * 
	 * <p>
	 * Operation:
	 * t - v
	 * 
	 * @param t The tuple the inversion is based on.
	 * 
	 * @return The current vector.
	 */
	default Vec3fC inverse(Tup3fR t)
	{
		return inverse(t.getX(), t.getY(), t.getZ());
	}
	
	/**
	 * Inverses the current vector based on the given value.
	 * It does the same as {@link #revSub(float)} and is present for completness.
	 * This operation alters the current vector.
	 * 
	 * <p>
	 * Operation:
	 * value - v
	 * 
	 * @param value The value the inversion is based on.
	 * 
	 * @return The current vector.
	 */
	default Vec3fC inverse(float value)
	{
		return inverse(value, value, value);
	}
	
	/**
	 * Inverses the current vector based on the given component values.
	 * This operation alters the current vector.
	 * 
	 * <p>
	 * Operation:
	 * (x, y, z) - v
	 * 
	 * @param x The value the inversion of the x component is based on.
	 * @param y The value the inversion of the y component is based on.
	 * @param z The value the inversion of the z component is based on.
	 * 
	 * @return The current vector.
	 */
	Vec3fC inverse(float x, float y, float z);
	
	/**
	 * Returns the dot product (scalar product) between this vector and the given tuple.
	 * 
	 * <p>
	 * Operation:
	 * v . t
	 * 
	 * @param t The tuple.
	 * 
	 * @return The dot product (scalar product) between this vector and the tuple.
	 */
	default float dot(Tup3fR t)
	{
		return dot(t.getX(), t.getY(), t.getZ());
	}
	
	/**
	 * Returns the dot product (scalar product) between this vector and a tuple defined by the given value.
	 * 
	 * <p>
	 * Operation:
	 * v . (value, value, value)
	 * 
	 * @param value The value of all the components of the second tuple.
	 * 
	 * @return The dot product (scalar product) between this vector and the value.
	 */
	default float dot(float value)
	{
		return dot(value, value, value);
	}
	
	/**
	 * Returns the dot product (scalar product) between this vector and a tuple defined by the given component values.
	 * 
	 * <p>
	 * Operation:
	 * v . (x, y, z)
	 * 
	 * @param x The value of the x component of the second tuple.
	 * @param y The value of the y component of the second tuple.
	 * @param z The value of the z component of the second tuple.
	 * 
	 * @return The dot product (scalar product) between this vector and the values.
	 */
	float dot(float x, float y, float z);
	
	/**
	 * Sets the vector to the cross product between this vector and the given tuple.
	 * This operation alters the current vector.
	 * 
	 * @param t The tuple.
	 * 
	 * @return The current vector.
	 */
	default Vec3fC cross(Tup3fR t)
	{
		return cross(t.getX(), t.getY(), t.getZ());
	}
	
	/**
	 * Sets the vector to the cross product between this vector and a tuple defined by the given value.
	 * This operation alters the current vector.
	 * 
	 * @param value The value of all the components of the second tuple.
	 * 
	 * @return The current vector.
	 */
	default Vec3fC cross(float value)
	{
		return cross(value, value, value);
	}
	
	/**
	 * Sets the vector to the cross product between this vector and a tuple defined by the given component values.
	 * This operation alters the current vector.
	 * 
	 * @param x The value of the x component of the second tuple.
	 * @param y The value of the y component of the second tuple.
	 * @param z The value of the z component of the second tuple.
	 * 
	 * @return The current vector.
	 */
	Vec3fC cross(float x, float y, float z);
	
	/**
	 * Makes all components of the vector absolute.
	 * This operation alters the current vector.
	 * 
	 * @return The current vector.
	 */
	Vec3fC abs();
	
	/**
	 * Rounds all components down to the next integer closer to negative infinity.
	 * This operation alters the current vector.
	 * 
	 * @return The current vector.
	 */
	Vec3fC floor();
	
	/**
	 * Rounds all components up to the next integer closer to positive infinity.
	 * This operation alters the current vector.
	 * 
	 * @return The current vector.
	 */
	Vec3fC ceil();
	
	/**
	 * Rounds all components up to the next integer closer to positive infinity or negative infinity.
	 * This operation alters the current vector.
	 * 
	 * @return The current vector.
	 */
	Vec3fC round();
	
	/**
	 * Truncates the decimals of the components.
	 * This operation alters the current vector.
	 * 
	 * @return The current vector.
	 */
	Vec3fC trunc();
	
	/**
	 * Sets the vector to the signums of the components.
	 * This operation alters the current vector.
	 * 
	 * @return The current vector.
	 */
	Vec3fC signum();
	
	/**
	 * Applies the given matrix to the current vector and therefore transforming it.
	 * This operation alters the current vector.
	 * 
	 * @param m The matrix to apply.
	 * 
	 * @return The current vector.
	 */
	default Vec3fC transform(Mat4fR m)
	{
		m.transform(this, false, this);
		
		return this;
	}
	
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
		return clone().add(t);
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
		return clone().add(value);
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
	default Vec3fC addN(float x, float y, float z)
	{
		return clone().add(x, y, z);
	}
	
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
		return clone().sub(t);
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
		return clone().sub(value);
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
	default Vec3fC subN(float x, float y, float z)
	{
		return clone().sub(x, y, z);
	}
	
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
		return clone().revSub(t);
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
		return clone().revSub(value);
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
	default Vec3fC revSubN(float x, float y, float z)
	{
		return clone().revSub(x, y, z);
	}
	
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
		return clone().mul(t);
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
		return clone().mul(value);
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
	default Vec3fC mulN(float x, float y, float z)
	{
		return clone().mul(x, y, z);
	}
	
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
		return clone().div(t);
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
		return clone().div(value);
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
	default Vec3fC divN(float x, float y, float z)
	{
		return clone().div(x, y, z);
	}

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
		return clone().revDiv(t);
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
		return clone().revDiv(value);
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
	default Vec3fC revDivN(float x, float y, float z)
	{
		return clone().revDiv(x, y, z);
	}

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
	default Vec3fC normalN()
	{
		return clone().normal();
	}

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
	default Vec3fC normalSafeN()
	{
		return clone().normalSafe();
	}

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
	default Vec3fC normalSafeWithMarginN(float tolerance)
	{
		return clone().normalSafeWithMargin(tolerance);
	}

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
	default Vec3fC invertN()
	{
		return clone().invert();
	}
	
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
	default Vec3fC inverseN()
	{
		return clone().inverse();
	}

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
		return clone().inverse(t);
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
		return clone().inverse(value);
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
	default Vec3fC inverseN(float x, float y, float z)
	{
		return clone().inverse(x, y, z);
	}
	
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
		return clone().cross(t);
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
		return clone().cross(value);
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
	default Vec3fC crossN(float x, float y, float z)
	{
		return clone().cross(x, y, z);
	}
	
	/**
	 * Makes all components of the vector absolute and saves the result in a new instance.
	 * This operation does not alter the current vector.
	 * 
	 * @return The new instance with the result.
	 */
	default Vec3fC absN()
	{
		return clone().abs();
	}
	
	/**
	 * Rounds all components down to the next integer closer to negative infinity and saves the result in a new instance.
	 * This operation does not alter the current vector.
	 * 
	 * @return The new instance with the result.
	 */
	default Vec3fC floorN()
	{
		return clone().floor();
	}
	
	/**
	 * Rounds all components up to the next integer closer to positive infinity and saves the result in a new instance.
	 * This operation does not alter the current vector.
	 * 
	 * @return The new instance with the result.
	 */
	default Vec3fC ceilN()
	{
		return clone().ceil();
	}
	
	/**
	 * Rounds all components up to the next integer closer to positive infinity or negative infinity and saves the result in a new instance.
	 * This operation does not alter the current vector.
	 * 
	 * @return The new instance with the result.
	 */
	default Vec3fC roundN()
	{
		return clone().round();
	}
	
	/**
	 * Truncates the decimals of the components and saves the result in a new instance.
	 * This operation does not alter the current vector.
	 * 
	 * @return The new instance with the result.
	 */
	default Vec3fC truncN()
	{
		return clone().trunc();
	}
	
	/**
	 * Sets the vector to the signums of the components and saves the result in a new instance.
	 * This operation does not alter the current vector.
	 * 
	 * @return The new instance with the result.
	 */
	default Vec3fC signumN()
	{
		return clone().signum();
	}
	
	/**
	 * Applies the given matrix to the current vector and therefore transforming it and saves the result in a new instance.
	 * This operation does not alter the current vector.
	 * 
	 * @param m The matrix to apply.
	 * 
	 * @return The current vector.
	 */
	default Vec3fC transformN(Mat4fR m)
	{
		return clone().transform(m);
	}
}
