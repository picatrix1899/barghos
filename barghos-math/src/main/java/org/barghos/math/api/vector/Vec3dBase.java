package org.barghos.math.api.vector;

import org.barghos.core.api.tuple.TupdR;
import org.barghos.core.api.tuple3.Tup3dBase;
import org.barghos.core.api.tuple3.Tup3dR;

/**
 * This interface represents any modifiable 3-dimensional double vector.
 * 
 * <p>
 * It should be prefered by design before direct usage of a type in method parameters,
 * if the method only writes data to the parameter.
 * 
 * @author picatrix1899
 */
public interface Vec3dBase extends Vec3dR, Tup3dBase
{
	/**
	 * Sets the x component of the vector.
	 * 
	 * @param x The new x value.
	 * 
	 * @return The current vector.
	 */
	@Override
	Vec3dBase setX(double x);
	
	/**
	 * Sets the y component of the vector.
	 * 
	 * @param y The new y value.
	 * 
	 * @return The current vector.
	 */
	@Override
	Vec3dBase setY(double y);
	
	/**
	 * Sets the z component of the vector.
	 * 
	 * @param z The new z value.
	 * 
	 * @return The current vector.
	 */
	@Override
	Vec3dBase setZ(double z);
	
	/**
	 * Adopts the values from an existing instance of {@link Tup3dR}.
	 * 
	 * @param t An existing implementation of {@link Tup3dR} to adopt the values from.
	 * 
	 * @return The current vector.
	 */
	@Override
	default Vec3dBase set(Tup3dR t)
	{
		return (Vec3dBase)Tup3dBase.super.set(t);
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
	default Vec3dBase set(double value)
	{
		return (Vec3dBase)Tup3dBase.super.set(value);
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
	default Vec3dBase set(double x, double y, double z)
	{
		return (Vec3dBase)Tup3dBase.super.set(x, y, z);
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
	default Vec3dBase setByIndex(int index, double value)
	{
		return (Vec3dBase)Tup3dBase.super.setByIndex(index, value);
	}
	
	/**
	 * Sets the components to the corresponding components.
	 * 
	 * @param values The values to store in the components of the vector.
	 * 
	 * @return The current vector.
	 */
	@Override
	default Vec3dBase setArray(double... values)
	{
		return (Vec3dBase)Tup3dBase.super.setArray(values);
	}
	
	/**
	 * Adopts the values from an existing instance of {@link TupdR}.
	 * 
	 * @param t An existing implementation of {@link TupdR} to adopt the values from.
	 * 
	 * @return The current vector.
	 */
	@Override
	default Vec3dBase set(TupdR t)
	{
		return (Vec3dBase)Tup3dBase.super.set(t);
	}
	
	/** {@inheritDoc} */
	@Override
	Vec3dBase clone();
	
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
	default Vec3dBase add(Tup3dR t)
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
	default Vec3dBase add(double value)
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
	default Vec3dBase add(double x, double y, double z)
	{
		return Vec3dUtil.add(getX(), getY(), getZ(), x, y, z, this);
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
	default Vec3dBase sub(Tup3dR t)
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
	default Vec3dBase sub(double value)
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
	default Vec3dBase sub(double x, double y, double z)
	{
		return Vec3dUtil.sub(getX(), getY(), getZ(), x, y, z, this);
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
	default Vec3dBase revSub(Tup3dR t)
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
	default Vec3dBase revSub(double value)
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
	default Vec3dBase revSub(double x, double y, double z)
	{
		return Vec3dUtil.revSub(getX(), getY(), getZ(), x, y, z, this);
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
	default Vec3dBase mul(Tup3dR t)
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
	default Vec3dBase mul(double value)
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
	default Vec3dBase mul(double x, double y, double z)
	{
		return Vec3dUtil.mul(getX(), getY(), getZ(), x, y, z, this);
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
	default Vec3dBase div(Tup3dR t)
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
	default Vec3dBase div(double value)
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
	default Vec3dBase div(double x, double y, double z)
	{
		return Vec3dUtil.div(getX(), getY(), getZ(), x, y, z, this);
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
	default Vec3dBase revDiv(Tup3dR t)
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
	default Vec3dBase revDiv(double value)
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
	default Vec3dBase revDiv(double x, double y, double z)
	{
		return Vec3dUtil.revDiv(getX(), getY(), getZ(), x, y, z, this);
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
	default Vec3dBase normal()
	{
		return div(length());
	}
	
	/**
	 * Normalizes the current vector.
	 * Normalization is done by dividing the vector by its length.
	 * If the vector is a zero-length vector the result will be a zero vector.
	 * It determines a zero-length by checking if all components are exactly zero.
	 * Due to doubleing-point-errors it might still throw an {@link ArithmeticException} when
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
	default Vec3dBase normalSafe()
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
	default Vec3dBase normalSafeWithMargin(double tolerance)
	{
		if(isZeroWithMargin(tolerance)) return set(0.0);
		
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
	default Vec3dBase invert()
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
	default Vec3dBase inverse()
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
	default Vec3dBase inverse(Tup3dR t)
	{
		return inverse(t.getX(), t.getY(), t.getZ());
	}
	
	/**
	 * Inverses the current vector based on the given value.
	 * It does the same as {@link #revSub(double)} and is present for completness.
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
	default Vec3dBase inverse(double value)
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
	default Vec3dBase inverse(double x, double y, double z)
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
	default double dot(Tup3dR t)
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
	default double dot(double value)
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
	default double dot(double x, double y, double z)
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
	default Vec3dBase cross(Tup3dR t)
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
	default Vec3dBase cross(double value)
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
	default Vec3dBase cross(double x, double y, double z)
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
	default Vec3dBase crossLH(Tup3dR t)
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
	default Vec3dBase crossLH(double value)
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
	default Vec3dBase crossLH(double x, double y, double z)
	{
		double aX = getX();
		double aY = getY();
		double aZ = getZ();
		
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
	default Vec3dBase crossRH(Tup3dR t)
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
	default Vec3dBase crossRH(double value)
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
	default Vec3dBase crossRH(double x, double y, double z)
	{
		double aX = getX();
		double aY = getY();
		double aZ = getZ();

		return set(aZ * y - aY * z, aX * z - aZ * x, aY * x - aX * y);
	}
	
	/**
	 * Makes all components of the vector absolute.
	 * This operation alters the current vector.
	 * 
	 * @return The current vector.
	 */
	default Vec3dBase abs()
	{
		return set(Math.abs(getX()), Math.abs(getY()), Math.abs(getZ()));
	}
	
	/**
	 * Rounds all components down to the next integer closer to negative infinity.
	 * This operation alters the current vector.
	 * 
	 * @return The current vector.
	 */
	default Vec3dBase floor()
	{
		return set(Math.floor(getX()), Math.floor(getY()), Math.floor(getZ()));
	}
	
	/**
	 * Rounds all components up to the next integer closer to positive infinity.
	 * This operation alters the current vector.
	 * 
	 * @return The current vector.
	 */
	default Vec3dBase ceil()
	{
		return set(Math.ceil(getX()), Math.ceil(getY()), Math.ceil(getZ()));
	}
	
	/**
	 * Rounds all components up to the next integer closer to positive infinity or negative infinity.
	 * This operation alters the current vector.
	 * 
	 * @return The current vector.
	 */
	default Vec3dBase round()
	{
		return set(Math.round(getX()), Math.round(getY()), Math.round(getZ()));
	}
	
	/**
	 * Truncates the decimals of the components.
	 * This operation alters the current vector.
	 * 
	 * @return The current vector.
	 */
	default Vec3dBase trunc()
	{
		return set((int)getX(), (int)getY(), (int)getZ());
	}
	
	/**
	 * Sets the vector to the signums of the components.
	 * This operation alters the current vector.
	 * 
	 * @return The current vector.
	 */
	default Vec3dBase signum()
	{
		return set(Math.signum(getX()), Math.signum(getY()), Math.signum(getZ()));
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
	default Vec3dBase addN(Tup3dR t)
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
	default Vec3dBase addN(double value)
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
	default Vec3dBase addN(double x, double y, double z)
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
	default Vec3dBase subN(Tup3dR t)
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
	default Vec3dBase subN(double value)
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
	default Vec3dBase subN(double x, double y, double z)
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
	default Vec3dBase revSubN(Tup3dR t)
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
	default Vec3dBase revSubN(double value)
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
	default Vec3dBase revSubN(double x, double y, double z)
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
	default Vec3dBase mulN(Tup3dR t)
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
	default Vec3dBase mulN(double value)
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
	default Vec3dBase mulN(double x, double y, double z)
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
	default Vec3dBase divN(Tup3dR t)
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
	default Vec3dBase divN(double value)
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
	default Vec3dBase divN(double x, double y, double z)
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
	default Vec3dBase revDivN(Tup3dR t)
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
	default Vec3dBase revDivN(double value)
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
	default Vec3dBase revDivN(double x, double y, double z)
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
	default Vec3dBase normalN()
	{
		return clone().normal();
	}

	/**
	 * Normalizes the current vector and saves the result in a new instance.
	 * Normalization is done by dividing the vector by its length.
	 * If the vector is a zero-length vector the result will be a zero vector.
	 * It determines a zero-length by checking if all components are exactly zero.
	 * Due to doubleing-point-errors it might still throw an {@link ArithmeticException} when
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
	default Vec3dBase normalSafeN()
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
	default Vec3dBase normalSafeWithMarginN(double tolerance)
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
	default Vec3dBase invertN()
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
	default Vec3dBase inverseN()
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
	default Vec3dBase inverseN(Tup3dR t)
	{
		return clone().inverse(t);
	}

	/**
	 * Inverses the current vector based on the given value and saves the result in a new instance.
	 * It does the same as {@link #revSub(double)} and is present for completness.
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
	default Vec3dBase inverseN(double value)
	{
		return clone().inverse(value);
	}

	/**
	 * Inverses the current vector based on the given component values and saves the result in a new instance.
	 * It does the same as {@link #revSub(double, double)} and is present for completness.
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
	default Vec3dBase inverseN(double x, double y, double z)
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
	default Vec3dBase crossN(Tup3dR t)
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
	default Vec3dBase crossN(double value)
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
	default Vec3dBase crossN(double x, double y, double z)
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
	default Vec3dBase crossLHN(Tup3dR t)
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
	default Vec3dBase crossLHN(double value)
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
	default Vec3dBase crossLHN(double x, double y, double z)
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
	default Vec3dBase crossRHN(Tup3dR t)
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
	default Vec3dBase crossRHN(double value)
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
	default Vec3dBase crossRHN(double x, double y, double z)
	{
		return clone().crossRH(x, y, z);
	}
	
	/**
	 * Makes all components of the vector absolute and saves the result in a new instance.
	 * This operation does not alter the current vector.
	 * 
	 * @return The new instance with the result.
	 */
	default Vec3dBase absN()
	{
		return clone().abs();
	}
	
	/**
	 * Rounds all components down to the next integer closer to negative infinity and saves the result in a new instance.
	 * This operation does not alter the current vector.
	 * 
	 * @return The new instance with the result.
	 */
	default Vec3dBase floorN()
	{
		return clone().floor();
	}
	
	/**
	 * Rounds all components up to the next integer closer to positive infinity and saves the result in a new instance.
	 * This operation does not alter the current vector.
	 * 
	 * @return The new instance with the result.
	 */
	default Vec3dBase ceilN()
	{
		return clone().ceil();
	}
	
	/**
	 * Rounds all components up to the next integer closer to positive infinity or negative infinity and saves the result in a new instance.
	 * This operation does not alter the current vector.
	 * 
	 * @return The new instance with the result.
	 */
	default Vec3dBase roundN()
	{
		return clone().round();
	}
	
	/**
	 * Truncates the decimals of the components and saves the result in a new instance.
	 * This operation does not alter the current vector.
	 * 
	 * @return The new instance with the result.
	 */
	default Vec3dBase truncN()
	{
		return clone().trunc();
	}
	
	/**
	 * Sets the vector to the signums of the components and saves the result in a new instance.
	 * This operation does not alter the current vector.
	 * 
	 * @return The new instance with the result.
	 */
	default Vec3dBase signumN()
	{
		return clone().signum();
	}
	
		/**
	 * Adds the second given tuple to the current vector and saves the result in a new instance.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation:
	 * v + t
	 * 
	 * @param <T> The type of the query parameter.
	 * 
	 * @param t The second tuple to add to the current vector.
	 * @param res The query parameter.
	 * 
	 * @return The query parameter with the result.
	 */
	default <T extends Vec3dBase> T addR(Tup3dR t, T res)
	{
		return addR(t.getX(), t.getY(), t.getZ(), res);
	}
	
	/**
	 * Adds the second tuple defined by the given value to the current vector and saves the result in a new instance.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation:
	 * v + (value, value, value)
	 * 
	 * @param <T> The type of the query parameter.
	 * 
	 * @param value The value of all the components of the second tuple.
	 * @param res The query parameter.
	 * 
	 * @return The query parameter with the result.
	 */
	default <T extends Vec3dBase> T addR(double value, T res)
	{
		return addR(value, value, value, res);
	}
	
	/**
	 * Adds the second tuple defined by the given component values to the current vector and saves the result in
	 * the query parameter.
	 * the current vector is of.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation:
	 * v + (x, y, z)
	 * 
	 * @param <T> The type of the query parameter.
	 * 
	 * @param x The value of the x component of the second tuple.
	 * @param y The value of the y component of the second tuple.
	 * @param z The value of the z component of the second tuple.
	 * @param res The query parameter.
	 * 
	 * @return The query parameter with the result.
	 */
	default <T extends Vec3dBase> T addR(double x, double y, double z, T res)
	{
		res.set(x + x, y + y, z + z);
		return res;
	}
}
