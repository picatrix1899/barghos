package org.barghos.math.api.vector;

import org.barghos.core.api.tuple.TupdR;
import org.barghos.core.api.tuple.TupfR;
import org.barghos.core.api.tuple3.Tup3fR;
import org.barghos.core.api.tuple3.Tup3fBase;

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
public interface Vec3fBase extends Vec3fR, Tup3fBase
{
	/**
	 * Sets the x component of the vector.
	 * 
	 * @param x The new x value.
	 * 
	 * @return The current vector.
	 */
	@Override
	Vec3fBase setX(float x);
	
	/**
	 * Sets the y component of the vector.
	 * 
	 * @param y The new y value.
	 * 
	 * @return The current vector.
	 */
	@Override
	Vec3fBase setY(float y);
	
	/**
	 * Sets the z component of the vector.
	 * 
	 * @param z The new z value.
	 * 
	 * @return The current vector.
	 */
	@Override
	Vec3fBase setZ(float z);
	
	/**
	 * Adopts the values from an existing instance of {@link Tup3fR}.
	 * 
	 * @param t An existing implementation of {@link Tup3fR} to adopt the values from.
	 * 
	 * @return The current vector.
	 */
	@Override
	default Vec3fBase set(Tup3fR t)
	{
		return (Vec3fBase)Tup3fBase.super.set(t);
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
	default Vec3fBase set(float value)
	{
		return (Vec3fBase)Tup3fBase.super.set(value);
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
	default Vec3fBase set(float x, float y, float z)
	{
		return (Vec3fBase)Tup3fBase.super.set(x, y, z);
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
	default Vec3fBase setByIndex(int index, float value)
	{
		return (Vec3fBase)Tup3fBase.super.setByIndex(index, value);
	}
	
	/**
	 * Sets the components to the corresponding components.
	 * 
	 * @param values The values to store in the components of the vector.
	 * 
	 * @return The current vector.
	 */
	@Override
	default Vec3fBase setArray(float... values)
	{
		return (Vec3fBase)Tup3fBase.super.setArray(values);
	}
	
	/**
	 * Adopts the values from an existing instance of {@link TupdR}.
	 * 
	 * @param t An existing implementation of {@link TupdR} to adopt the values from.
	 * 
	 * @return The current vector.
	 */
	@Override
	default Vec3fBase set(TupfR t)
	{
		return (Vec3fBase)Tup3fBase.super.set(t);
	}
	
	/** {@inheritDoc} */
	@Override
	Vec3fBase clone();
	
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
	default Vec3fBase add(Tup3fR t)
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
	default Vec3fBase add(float value)
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
	default Vec3fBase add(float x, float y, float z)
	{
		return Vec3fUtil.add(getX(), getY(), getZ(), x, y, z, this);
	}
	
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
	default Vec3fBase sub(Tup3fR t)
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
	default Vec3fBase sub(float value)
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
	default Vec3fBase sub(float x, float y, float z)
	{
		return Vec3fUtil.sub(getX(), getY(), getZ(), x, y, z, this);
	}
	
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
	default Vec3fBase revSub(Tup3fR t)
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
	default Vec3fBase revSub(float value)
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
	default Vec3fBase revSub(float x, float y, float z)
	{
		return Vec3fUtil.revSub(getX(), getY(), getZ(), x, y, z, this);
	}
	
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
	default Vec3fBase mul(Tup3fR t)
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
	default Vec3fBase mul(float value)
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
	default Vec3fBase mul(float x, float y, float z)
	{
		return Vec3fUtil.mul(getX(), getY(), getZ(), x, y, z, this);
	}
	
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
	default Vec3fBase div(Tup3fR t)
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
	default Vec3fBase div(float value)
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
	default Vec3fBase div(float x, float y, float z)
	{
		return Vec3fUtil.div(getX(), getY(), getZ(), x, y, z, this);
	}
	
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
	default Vec3fBase revDiv(Tup3fR t)
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
	default Vec3fBase revDiv(float value)
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
	default Vec3fBase revDiv(float x, float y, float z)
	{
		return Vec3fUtil.revDiv(getX(), getY(), getZ(), x, y, z, this);
	}
	
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
	default Vec3fBase normal()
	{
		return div(length());
	}
	
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
	default Vec3fBase normalSafe()
	{
		if(isZero()) return set(0.0f);
		
		return normal();
	}
	
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
	default Vec3fBase normalSafeWithMargin(float tolerance)
	{
		if(isZeroWithMargin(tolerance)) return set(0.0f);
		
		return normal();
	}
	
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
	default Vec3fBase invert()
	{
		return set(-getX(), -getY(), -getZ());
	}
	
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
	default Vec3fBase inverse()
	{
		return inverse(1.0f);
	}
	
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
	default Vec3fBase inverse(Tup3fR t)
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
	default Vec3fBase inverse(float value)
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
	default Vec3fBase inverse(float x, float y, float z)
	{
		return set(x - getY(), y - getY(), z - getZ());
	}
	
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
	default float dot(float x, float y, float z)
	{
		return getX() * x + getY() * y + getZ() * z;
	}
	
	/**
	 * Sets the vector to the cross product between this vector and the given tuple.
	 * This operation alters the current vector.
	 * 
	 * @param t The tuple.
	 * 
	 * @return The current vector.
	 */
	default Vec3fBase cross(Tup3fR t)
	{
		return crossLH(t);
	}
	
	/**
	 * Sets the vector to the cross product between this vector and a tuple defined by the given value.
	 * This operation alters the current vector.
	 * 
	 * @param value The value of all the components of the second tuple.
	 * 
	 * @return The current vector.
	 */
	default Vec3fBase cross(float value)
	{
		return crossLH(value);
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
	default Vec3fBase cross(float x, float y, float z)
	{
		return crossLH(x, y, z);
	}
	
	/**
	 * Sets the vector to the left handed cross product between this vector and the given tuple.
	 * This operation alters the current vector.
	 * 
	 * <p>
	 * Operation:
	 * v x t
	 * 
	 * @param t The tuple.
	 * 
	 * @return The current vector.
	 */
	default Vec3fBase crossLH(Tup3fR t)
	{
		return crossLH(t.getX(), t.getY(), t.getZ());
	}
	
	/**
	 * Sets the vector to the left handed cross product between this vector and a tuple defined by the given value.
	 * This operation alters the current vector.
	 * 
	 * <p>
	 * Operation:
	 * v x (value, value, value)
	 * 
	 * @param value The value of all the components of the second tuple.
	 * 
	 * @return The current vector.
	 */
	default Vec3fBase crossLH(float value)
	{
		return crossLH(value, value, value);
	}
	
	/**
	 * Sets the vector to the left handed cross product between this vector and a tuple defined by the given component values.
	 * This operation alters the current vector.
	 * 
	 * <p>
	 * Operation:
	 * v x (x, y, z)
	 * 
	 * @param x The value of the x component of the second tuple.
	 * @param y The value of the y component of the second tuple.
	 * @param z The value of the z component of the second tuple.
	 * 
	 * @return The current vector.
	 */
	default Vec3fBase crossLH(float x, float y, float z)
	{
		float aX = getX();
		float aY = getY();
		float aZ = getZ();
		
		return set(aY * z - aZ * y, aZ * x - aX * z, aX * y - aY * x);
	}
	
	/**
	 * Sets the vector to the right handed cross product between this vector and the given tuple.
	 * This operation alters the current vector.
	 * 
	 * <p>
	 * Operation:
	 * t x v
	 * 
	 * @param t The tuple.
	 * 
	 * @return The current vector.
	 */
	default Vec3fBase crossRH(Tup3fR t)
	{
		return crossRH(t.getX(), t.getY(), t.getZ());
	}
	
	/**
	 * Sets the vector to the right handed cross product between this vector and a tuple defined by the given value.
	 * This operation alters the current vector.
	 * 
	 * <p>
	 * Operation:
	 * (value, value, value) x v
	 * 
	 * @param value The value of all the components of the second tuple.
	 * 
	 * @return The current vector.
	 */
	default Vec3fBase crossRH(float value)
	{
		return crossRH(value, value, value);
	}
	
	/**
	 * Sets the vector to the right handed cross product between this vector and a tuple defined by the given component values.
	 * This operation alters the current vector.
	 * 
	 * <p>
	 * Operation:
	 * (x, y, z) x v
	 * 
	 * @param x The value of the x component of the second tuple.
	 * @param y The value of the y component of the second tuple.
	 * @param z The value of the z component of the second tuple.
	 * 
	 * @return The current vector.
	 */
	default Vec3fBase crossRH(float x, float y, float z)
	{
		float aX = getX();
		float aY = getY();
		float aZ = getZ();

		return set(aZ * y - aY * z, aX * z - aZ * x, aY * x - aX * y);
	}
	
	/**
	 * Makes all components of the vector absolute.
	 * This operation alters the current vector.
	 * 
	 * @return The current vector.
	 */
	default Vec3fBase abs()
	{
		return set(Math.abs(getX()), Math.abs(getY()), Math.abs(getZ()));
	}
	
	/**
	 * Rounds all components down to the next integer closer to negative infinity.
	 * This operation alters the current vector.
	 * 
	 * @return The current vector.
	 */
	default Vec3fBase floor()
	{
		return set((float)Math.floor(getX()), (float)Math.floor(getY()), (float)Math.floor(getZ()));
	}
	
	/**
	 * Rounds all components up to the next integer closer to positive infinity.
	 * This operation alters the current vector.
	 * 
	 * @return The current vector.
	 */
	default Vec3fBase ceil()
	{
		return set((float)Math.ceil(getX()), (float)Math.ceil(getY()), (float)Math.ceil(getZ()));
	}
	
	/**
	 * Rounds all components up to the next integer closer to positive infinity or negative infinity.
	 * This operation alters the current vector.
	 * 
	 * @return The current vector.
	 */
	default Vec3fBase round()
	{
		return set(Math.round(getX()), Math.round(getY()), Math.round(getZ()));
	}
	
	/**
	 * Truncates the decimals of the components.
	 * This operation alters the current vector.
	 * 
	 * @return The current vector.
	 */
	default Vec3fBase trunc()
	{
		return set((int)getX(), (int)getY(), (int)getZ());
	}
	
	/**
	 * Sets the vector to the signums of the components.
	 * This operation alters the current vector.
	 * 
	 * @return The current vector.
	 */
	default Vec3fBase signum()
	{
		return set(Math.signum(getX()), Math.signum(getY()), Math.signum(getZ()));
	}
	
	/**
	 * Applies the given matrix to the current vector and therefore transforming it.
	 * This operation alters the current vector.
	 * 
	 * @param m The matrix to apply.
	 * 
	 * @return The current vector.
	 */
	default Vec3fBase transform(Mat4fR m)
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
	default Vec3fBase addN(Tup3fR t)
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
	default Vec3fBase addN(float value)
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
	default Vec3fBase addN(float x, float y, float z)
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
	default Vec3fBase subN(Tup3fR t)
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
	default Vec3fBase subN(float value)
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
	default Vec3fBase subN(float x, float y, float z)
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
	default Vec3fBase revSubN(Tup3fR t)
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
	default Vec3fBase revSubN(float value)
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
	default Vec3fBase revSubN(float x, float y, float z)
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
	default Vec3fBase mulN(Tup3fR t)
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
	default Vec3fBase mulN(float value)
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
	default Vec3fBase mulN(float x, float y, float z)
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
	default Vec3fBase divN(Tup3fR t)
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
	default Vec3fBase divN(float value)
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
	default Vec3fBase divN(float x, float y, float z)
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
	default Vec3fBase revDivN(Tup3fR t)
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
	default Vec3fBase revDivN(float value)
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
	default Vec3fBase revDivN(float x, float y, float z)
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
	default Vec3fBase normalN()
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
	default Vec3fBase normalSafeN()
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
	default Vec3fBase normalSafeWithMarginN(float tolerance)
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
	default Vec3fBase invertN()
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
	default Vec3fBase inverseN()
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
	default Vec3fBase inverseN(Tup3fR t)
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
	default Vec3fBase inverseN(float value)
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
	default Vec3fBase inverseN(float x, float y, float z)
	{
		return clone().inverse(x, y, z);
	}
	
	/**
	 * Calculates the cross product between this vector and the given tuple
	 * and saves the result in a new instance.
	 * This operation does not alter the current vector.
	 * 
	 * @param t The tuple.
	 * 
	 * @return The new instance with the result.
	 */
	default Vec3fBase crossN(Tup3fR t)
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
	default Vec3fBase crossN(float value)
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
	default Vec3fBase crossN(float x, float y, float z)
	{
		return clone().cross(x, y, z);
	}
	
	/**
	 * Calculates the left handed cross product between this vector and the given tuple
	 * and saves the result in a new instance.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation:
	 * v x t
	 * 
	 * @param t The tuple.
	 * 
	 * @return The new instance with the result.
	 */
	default Vec3fBase crossLHN(Tup3fR t)
	{
		return clone().crossLH(t);
	}
	
	/**
	 * Calculates the left handed cross product between this vector and a tuple defined by the given value
	 * and saves the result in a new instance.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation:
	 * v x (value, value, value)
	 * 
	 * @param value The value of all the components of the second tuple.
	 * 
	 * @return The new instance with the result.
	 */
	default Vec3fBase crossLHN(float value)
	{
		return clone().crossLH(value);
	}
	
	/**
	 * Calculates the left handed cross product between this vector and a tuple defined by the given component values
	 * and saves the result in a new instance.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation:
	 * v x (x, y, z)
	 * 
	 * @param x The value of the x component of the second tuple.
	 * @param y The value of the y component of the second tuple.
	 * @param z The value of the z component of the second tuple.
	 * 
	 * @return The new instance with the result.
	 */
	default Vec3fBase crossLHN(float x, float y, float z)
	{
		return clone().crossLH(x, y, z);
	}
	
	/**
	 * Calculates the right handed cross product between this vector and the given tuple
	 * and saves the result in a new instance.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation:
	 * t x v
	 * 
	 * @param t The tuple.
	 * 
	 * @return The new instance with the result.
	 */
	default Vec3fBase crossRHN(Tup3fR t)
	{
		return clone().crossRH(t);
	}
	
	/**
	 * Calculates the right handed cross product between this vector and a tuple defined by the given value.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation:
	 * (value, value, value) x v
	 * 
	 * @param value The value of all the components of the second tuple.
	 * 
	 * @return The new instance with the result.
	 */
	default Vec3fBase crossRHN(float value)
	{
		return clone().crossRH(value);
	}
	
	/**
	 * Calculates the right handed cross product between this vector and a tuple defined by the given component values.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation:
	 * (x, y, z) x v
	 * 
	 * @param x The value of the x component of the second tuple.
	 * @param y The value of the y component of the second tuple.
	 * @param z The value of the z component of the second tuple.
	 * 
	 * @return The new instance with the result.
	 */
	default Vec3fBase crossRHN(float x, float y, float z)
	{
		return clone().crossRH(x, y, z);
	}
	
	/**
	 * Makes all components of the vector absolute and saves the result in a new instance.
	 * This operation does not alter the current vector.
	 * 
	 * @return The new instance with the result.
	 */
	default Vec3fBase absN()
	{
		return clone().abs();
	}
	
	/**
	 * Rounds all components down to the next integer closer to negative infinity and saves the result in a new instance.
	 * This operation does not alter the current vector.
	 * 
	 * @return The new instance with the result.
	 */
	default Vec3fBase floorN()
	{
		return clone().floor();
	}
	
	/**
	 * Rounds all components up to the next integer closer to positive infinity and saves the result in a new instance.
	 * This operation does not alter the current vector.
	 * 
	 * @return The new instance with the result.
	 */
	default Vec3fBase ceilN()
	{
		return clone().ceil();
	}
	
	/**
	 * Rounds all components up to the next integer closer to positive infinity or negative infinity and saves the result in a new instance.
	 * This operation does not alter the current vector.
	 * 
	 * @return The new instance with the result.
	 */
	default Vec3fBase roundN()
	{
		return clone().round();
	}
	
	/**
	 * Truncates the decimals of the components and saves the result in a new instance.
	 * This operation does not alter the current vector.
	 * 
	 * @return The new instance with the result.
	 */
	default Vec3fBase truncN()
	{
		return clone().trunc();
	}
	
	/**
	 * Sets the vector to the signums of the components and saves the result in a new instance.
	 * This operation does not alter the current vector.
	 * 
	 * @return The new instance with the result.
	 */
	default Vec3fBase signumN()
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
	default Vec3fBase transformN(Mat4fR m)
	{
		return clone().transform(m);
	}
}
