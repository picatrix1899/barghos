package org.barghos.math.api.vector;

import org.barghos.core.api.tuple.TupfR;
import org.barghos.core.api.tuple2.Tup2fBase;
import org.barghos.core.api.tuple2.Tup2fR;

/**
 * This interface represents any modifiable 2-dimensional float vector.
 * 
 * <p>
 * It should be prefered by design before direct usage of a type in method parameters,
 * if the method only writes data to the parameter.
 * 
 * @author picatrix1899
 */
public interface Vec2fBase extends Vec2fR, Tup2fBase
{
	/**
	 * Sets the x component of the vector.
	 * 
	 * @param x The new x value.
	 * 
	 * @return The current vector.
	 */
	@Override
	Vec2fBase setX(float x);
	
	/**
	 * Sets the y component of the vector.
	 * 
	 * @param y The new y value.
	 * 
	 * @return The current vector.
	 */
	@Override
	Vec2fBase setY(float y);
	
	/**
	 * Adopts the values from an existing instance of {@link Tup2fR}.
	 * 
	 * @param t An existing implementation of {@link Tup2fR} to adopt the values from.
	 * 
	 * @return The current vector.
	 */
	@Override
	default Vec2fBase set(Tup2fR t)
	{
		return (Vec2fBase)Tup2fBase.super.set(t);
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
	default Vec2fBase set(float value)
	{
		return (Vec2fBase)Tup2fBase.super.set(value);
	}
	
	/**
	 * Sets the components to the corresponding paramters.
	 * 
	 * @param x The new x value.
	 * @param y The new y value.
	 * 
	 * @return The current vector.
	 */
	@Override
	default Vec2fBase set(float x, float y)
	{
		return (Vec2fBase)Tup2fBase.super.set(x, y);
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
	default Vec2fBase setByIndex(int index, float value)
	{
		return (Vec2fBase)Tup2fBase.super.setByIndex(index, value);
	}
	
	/**
	 * Sets the components to the corresponding components.
	 * 
	 * @param values The values to store in the components of the vector.
	 * 
	 * @return The current vector.
	 */
	@Override
	default Vec2fBase setArray(float... values)
	{
		return (Vec2fBase)Tup2fBase.super.setArray(values);
	}
	
	/**
	 * Adopts the values from an existing instance of {@link TupfR}.
	 * 
	 * @param t An existing implementation of {@link TupfR} to adopt the values from.
	 * 
	 * @return The current vector.
	 */
	@Override
	default Vec2fBase set(TupfR t)
	{
		return (Vec2fBase)Tup2fBase.super.set(t);
	}
	
	/** {@inheritDoc} */
	@Override
	Vec2fBase clone();
	
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
	default Vec2fBase add(Tup2fR t)
	{
		return add(t.getX(), t.getY());
	}
	
	/**
	 * Adds the second tuple defined by the given value to the current vector.
	 * This operation alters the current vector.
	 * 
	 * <p>
	 * Operation:
	 * v + (value, value)
	 * 
	 * @param value The value of all the components of the second tuple.
	 * 
	 * @return The current vector.
	 */
	default Vec2fBase add(float value)
	{
		return add(value, value);
	}
	
	/**
	 * Adds the second tuple defined by the given component values to the current vector
	 * This operation alters the current vector.
	 * 
	 * <p>
	 * Operation:
	 * v + (x, y)
	 * 
	 * @param x The value of the x component of the second tuple.
	 * @param y The value of the y component of the second tuple.
	 * 
	 * @return The current vector.
	 */
	default Vec2fBase add(float x, float y)
	{
		return Vec2fUtil.add(getX(), getY(), x, y, this);
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
	default Vec2fBase sub(Tup2fR t)
	{
		return sub(t.getX(), t.getY());
	}
	
	/**
	 * Subtracts the second tuple defined by the given value from the current vector.
	 * This operation alters the current vector.
	 * 
	 * <p>
	 * Operation:
	 * v - (value, value)
	 * 
	 * @param value The value of all the components of the second tuple.
	 * 
	 * @return The current vector.
	 */
	default Vec2fBase sub(float value)
	{
		return sub(value, value);
	}
	
	/**
	 * Subtracts the second tuple defined by the given component values from the current vector.
	 * This operation alters the current vector.
	 * 
	 * <p>
	 * Operation:
	 * v - (x, y)
	 * 
	 * @param x The value of the x component of the second tuple.
	 * @param y The value of the y component of the second tuple.
	 * 
	 * @return The current vector.
	 */
	default Vec2fBase sub(float x, float y)
	{
		return Vec2fUtil.sub(getX(), getY(), x, y, this);
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
	default Vec2fBase revSub(Tup2fR t)
	{
		return revSub(t.getX(), t.getY());
	}
	
	/**
	 * Subtracts the current vector from the second tuple defined by the given value.
	 * This operation alters the current vector.
	 * 
	 * <p>
	 * Operation:
	 * (value, value) - v
	 * 
	 * @param value The value of all the components of the second tuple.
	 * 
	 * @return The current vector.
	 */
	default Vec2fBase revSub(float value)
	{
		return revSub(value, value);
	}
	
	/**
	 * Subtracts the current vector from the second tuple defined by the given component values.
	 * This operation alters the current vector.
	 * 
	 * <p>
	 * Operation:
	 * (x, y) - v 
	 * 
	 * @param x The value of the x component of the second tuple.
	 * @param y The value of the y component of the second tuple.
	 * 
	 * @return The current vector.
	 */
	default Vec2fBase revSub(float x, float y)
	{
		return Vec2fUtil.revSub(getX(), getY(), x, y, this);
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
	default Vec2fBase mul(Tup2fR t)
	{
		return mul(t.getX(), t.getY());
	}
	
	/**
	 * Multiplies the current vector with the second tuple defined by the given value
	 * This operation alters the current vector.
	 * 
	 * <p>
	 * Operation:
	 * v * (value, value)
	 * 
	 * @param value The value of all the components of the second tuple.
	 * 
	 * @return The current vector.
	 */
	default Vec2fBase mul(float value)
	{
		return mul(value, value);
	}
	
	/**
	 * Multiplies the current vector with the second tuple defined by the given component values.
	 * This operation alters the current vector.
	 * 
	 * <p>
	 * Operation:
	 * v * (x, y)
	 * 
	 * @param x The value of the x component of the second tuple.
	 * @param y The value of the y component of the second tuple.
	 * 
	 * @return The current vector.
	 */
	default Vec2fBase mul(float x, float y)
	{
		return Vec2fUtil.mul(getX(), getY(), x, y, this);
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
	default Vec2fBase div(Tup2fR t)
	{
		return div(t.getX(), t.getY());
	}
	
	/**
	 * Divides the current vector by the second tuple defined by the given value.
	 * This operation alters the current vector.
	 * 
	 * <p>
	 * Operation:
	 * v / (value, value)
	 * 
	 * @param value The value of all the components of the second tuple.
	 * 
	 * @return The current vector.
	 */
	default Vec2fBase div(float value)
	{
		return div(value, value);
	}
	
	/**
	 * Divides the current vector by the second tuple defined by the given component values.
	 * This operation alters the current vector.
	 * 
	 * <p>
	 * Operation:
	 * v / (x, y)
	 * 
	 * @param x The value of the x component of the second tuple.
	 * @param y The value of the y component of the second tuple.
	 * 
	 * @return The current vector.
	 */
	default Vec2fBase div(float x, float y)
	{
		return Vec2fUtil.div(getX(), getY(), x, y, this);
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
	default Vec2fBase revDiv(Tup2fR t)
	{
		return revDiv(t.getX(), t.getY());
	}
	
	/**
	 * Divides the second tuple defined by the given value by the current vector.
	 * This operation alters the current vector.
	 * 
	 * <p>
	 * Operation:
	 * (value, value) / v 
	 * 
	 * @param value The value of all the components of the second tuple.
	 * 
	 * @return The current vector.
	 */
	default Vec2fBase revDiv(float value)
	{
		return revDiv(value, value);
	}
	
	/**
	 * Divides the second tuple defined by the given component values by the current vector.
	 * This operation alters the current vector.
	 * 
	 * <p>
	 * Operation:
	 * (x, y) / v
	 * 
	 * @param x The value of the x component of the second tuple.
	 * @param y The value of the y component of the second tuple.
	 * 
	 * @return The current vector.
	 */
	default Vec2fBase revDiv(float x, float y)
	{
		return Vec2fUtil.revDiv(getX(), getY(), x, y, this);
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
	default Vec2fBase normal()
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
	default Vec2fBase normalSafe()
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
	default Vec2fBase normalSafeWithMargin(float tolerance)
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
	default Vec2fBase invert()
	{
		return set(-getX(), -getY());
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
	default Vec2fBase inverse()
	{
		return inverse(1.0f, 1.0f);
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
	default Vec2fBase inverse(Tup2fR t)
	{
		return inverse(t.getX(), t.getY());
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
	default Vec2fBase inverse(float value)
	{
		return inverse(value, value);
	}
	
	/**
	 * Inverses the current vector based on the given component values.
	 * This operation alters the current vector.
	 * 
	 * <p>
	 * Operation:
	 * (x, y) - v
	 * 
	 * @param x The value the inversion of the x component is based on.
	 * @param y The value the inversion of the y component is based on.
	 * 
	 * @return The current vector.
	 */
	default Vec2fBase inverse(float x, float y)
	{
		return set(x - getY(), y - getY());
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
	default float dot(Tup2fR t)
	{
		return dot(t.getX(), t.getY());
	}
	
	/**
	 * Returns the dot product (scalar product) between this vector and a tuple defined by the given value.
	 * 
	 * <p>
	 * Operation:
	 * v . (value, value)
	 * 
	 * @param value The value of all the components of the second tuple.
	 * 
	 * @return The dot product (scalar product) between this vector and the value.
	 */
	default float dot(float value)
	{
		return dot(value, value);
	}
	
	/**
	 * Returns the dot product (scalar product) between this vector and a tuple defined by the given component values.
	 * 
	 * <p>
	 * Operation:
	 * v . (x, y)
	 * 
	 * @param x The value of the x component of the second tuple.
	 * @param y The value of the y component of the second tuple.
	 * 
	 * @return The dot product (scalar product) between this vector and the values.
	 */
	default float dot(float x, float y)
	{
		return getX() * x + getY() * y;
	}
	
	/**
	 * Makes all components of the vector absolute.
	 * This operation alters the current vector.
	 * 
	 * @return The current vector.
	 */
	default Vec2fBase abs()
	{
		return set(Math.abs(getX()), Math.abs(getY()));
	}
	
	/**
	 * Rounds all components down to the next integer closer to negative infinity.
	 * This operation alters the current vector.
	 * 
	 * @return The current vector.
	 */
	default Vec2fBase floor()
	{
		return set((float)Math.floor(getX()), (float)Math.floor(getY()));
	}
	
	/**
	 * Rounds all components up to the next integer closer to positive infinity.
	 * This operation alters the current vector.
	 * 
	 * @return The current vector.
	 */
	default Vec2fBase ceil()
	{
		return set((float)Math.ceil(getX()), (float)Math.ceil(getY()));
	}
	
	/**
	 * Rounds all components up to the next integer closer to positive infinity or negative infinity.
	 * This operation alters the current vector.
	 * 
	 * @return The current vector.
	 */
	default Vec2fBase round()
	{
		return set(Math.round(getX()), Math.round(getY()));
	}
	
	/**
	 * Truncates the decimals of the components.
	 * This operation alters the current vector.
	 * 
	 * @return The current vector.
	 */
	default Vec2fBase trunc()
	{
		return set((int)getX(), (int)getY());
	}
	
	/**
	 * Sets the vector to the signums of the components.
	 * This operation alters the current vector.
	 * 
	 * @return The current vector.
	 */
	default Vec2fBase signum()
	{
		return set(Math.signum(getX()), Math.signum(getY()));
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
	default Vec2fBase addN(Tup2fR t)
	{
		return clone().add(t);
	}
	
	/**
	 * Adds the second tuple defined by the given value to the current vector and saves the result in a new instance.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation:
	 * v + (value, value)
	 * 
	 * @param value The value of all the components of the second tuple.
	 * 
	 * @return The new instance with the result.
	 */
	default Vec2fBase addN(float value)
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
	 * v + (x, y)
	 * 
	 * @param x The value of the x component of the second tuple.
	 * @param y The value of the y component of the second tuple.
	 * 
	 * @return The new instance with the result.
	 */
	default Vec2fBase addN(float x, float y)
	{
		return clone().add(x, y);
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
	default Vec2fBase subN(Tup2fR t)
	{
		return clone().sub(t);
	}
	
	/**
	 * Subtracts the second tuple defined by the given value from the current vector and saves the result in a new instance.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation:
	 * v - (value, value)
	 * 
	 * @param value The value of all the components of the second tuple.
	 * 
	 * @return The new instance with the result.
	 */
	default Vec2fBase subN(float value)
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
	 * v - (x, y)
	 * 
	 * @param x The value of the x component of the second tuple.
	 * @param y The value of the y component of the second tuple.
	 * 
	 * @return The new instance with the result.
	 */
	default Vec2fBase subN(float x, float y)
	{
		return clone().sub(x, y);
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
	default Vec2fBase revSubN(Tup2fR t)
	{
		return clone().revSub(t);
	}
	
	/**
	 * Subtracts the current vector from the second tuple defined by the given value and saves the result in a new instance.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation:
	 * (value, value) - v 
	 * 
	 * @param value The value of all the components of the second tuple.
	 * 
	 * @return The new instance with the result.
	 */
	default Vec2fBase revSubN(float value)
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
	 * (x, y) - v 
	 * 
	 * @param x The value of the x component of the second tuple.
	 * @param y The value of the y component of the second tuple.
	 * 
	 * @return The new instance with the result.
	 */
	default Vec2fBase revSubN(float x, float y)
	{
		return clone().revSub(x, y);
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
	default Vec2fBase mulN(Tup2fR t)
	{
		return clone().mul(t);
	}
	
	/**
	 * Multiplies the current vector with the second tuple defined by the given value and saves the result in a new instance.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation:
	 * v * (value, value)
	 * 
	 * @param value The value of all the components of the second tuple.
	 * 
	 * @return The new instance with the result.
	 */
	default Vec2fBase mulN(float value)
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
	 * v * (x, y)
	 * 
	 * @param x The value of the x component of the second tuple.
	 * @param y The value of the y component of the second tuple.
	 * 
	 * @return The new instance with the result.
	 */
	default Vec2fBase mulN(float x, float y)
	{
		return clone().mul(x, y);
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
	default Vec2fBase divN(Tup2fR t)
	{
		return clone().div(t);
	}
	
	/**
	 * Divides the current vector by the second tuple defined by the given value and saves the result in a new instance.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation:
	 * v / (value, value)
	 * 
	 * @param value The value of all the components of the second tuple.
	 * 
	 * @return The new instance with the result.
	 */
	default Vec2fBase divN(float value)
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
	 * v / (x, y)
	 * 
	 * @param x The value of the x component of the second tuple.
	 * @param y The value of the y component of the second tuple.
	 * 
	 * @return The new instance with the result.
	 */
	default Vec2fBase divN(float x, float y)
	{
		return clone().div(x, y);
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
	default Vec2fBase revDivN(Tup2fR t)
	{
		return clone().revDiv(t);
	}

	/**
	 * Divides the second tuple defined by the given value by the current vector and saves the result in a new instance.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation:
	 * (value, value) / v 
	 * 
	 * @param value The value of all the components of the second tuple.
	 * 
	 * @return The new instance with the result.
	 */
	default Vec2fBase revDivN(float value)
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
	 * (x, y) / v
	 * 
	 * @param x The value of the x component of the second tuple.
	 * @param y The value of the y component of the second tuple.
	 * 
	 * @return The new instance with the result.
	 */
	default Vec2fBase revDivN(float x, float y)
	{
		return clone().revDiv(x, y);
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
	default Vec2fBase normalN()
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
	default Vec2fBase normalSafeN()
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
	default Vec2fBase normalSafeWithMarginN(float tolerance)
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
	default Vec2fBase invertN()
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
	default Vec2fBase inverseN()
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
	default Vec2fBase inverseN(Tup2fR t)
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
	default Vec2fBase inverseN(float value)
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
	 * (x, y) - v
	 * 
	 * @param x The value the inversion of the x component is based on.
	 * @param y The value the inversion of the y component is based on.
	 * 
	 * @return The new instance with the result.
	 */
	default Vec2fBase inverseN(float x, float y)
	{
		return clone().inverse(x, y);
	}
	
	/**
	 * Makes all components of the vector absolute and saves the result in a new instance.
	 * This operation does not alter the current vector.
	 * 
	 * @return The new instance with the result.
	 */
	default Vec2fBase absN()
	{
		return clone().abs();
	}
	
	/**
	 * Rounds all components down to the next integer closer to negative infinity and saves the result in a new instance.
	 * This operation does not alter the current vector.
	 * 
	 * @return The new instance with the result.
	 */
	default Vec2fBase floorN()
	{
		return clone().floor();
	}
	
	/**
	 * Rounds all components up to the next integer closer to positive infinity and saves the result in a new instance.
	 * This operation does not alter the current vector.
	 * 
	 * @return The new instance with the result.
	 */
	default Vec2fBase ceilN()
	{
		return clone().ceil();
	}
	
	/**
	 * Rounds all components up to the next integer closer to positive infinity or negative infinity and saves the result in a new instance.
	 * This operation does not alter the current vector.
	 * 
	 * @return The new instance with the result.
	 */
	default Vec2fBase roundN()
	{
		return clone().round();
	}
	
	/**
	 * Truncates the decimals of the components and saves the result in a new instance.
	 * This operation does not alter the current vector.
	 * 
	 * @return The new instance with the result.
	 */
	default Vec2fBase truncN()
	{
		return clone().trunc();
	}
	
	/**
	 * Sets the vector to the signums of the components and saves the result in a new instance.
	 * This operation does not alter the current vector.
	 * 
	 * @return The new instance with the result.
	 */
	default Vec2fBase signumN()
	{
		return clone().signum();
	}
}
