package org.barghos.math.api.vector2;

import org.barghos.core.api.tuple.TupfR;
import org.barghos.core.api.tuple2.Tup2fR;
import org.barghos.core.api.tuple2.Tup2fW;

/**
 * This interface grants writeonly access to any 2-dimensional float vector.
 * 
 * <p>
 * It should be prefered by design before direct usage of a type in method parameters,
 * if the method only writes data to the parameter.
 * 
 * @author picatrix1899
 * 
 * @since 1.0.0.0
 */
public interface Vec2fW extends Tup2fW
{
	/**
	 * Sets the x component of the vector.
	 * 
	 * @param x The new x value.
	 * 
	 * @return The current vector.
	 * 
	 * @since 1.0.0.0
	 */
	@Override
	Vec2fW setX(float x);
	
	/**
	 * Sets the y component of the vector.
	 * 
	 * @param y The new y value.
	 * 
	 * @return The current vector.
	 * 
	 * @since 1.0.0.0
	 */
	@Override
	Vec2fW setY(float y);
	
	/**
	 * Adopts the values from an existing instance of {@link Tup2fR}.
	 * 
	 * @param t An existing implementation of {@link Tup2fR} to adopt the values from.
	 * 
	 * @return The current vector.
	 * 
	 * @since 1.0.0.0
	 */
	@Override
	default Vec2fW set(Tup2fR t)
	{
		return (Vec2fW)Tup2fW.super.set(t);
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
	default Vec2fW set(float value)
	{
		return (Vec2fW)Tup2fW.super.set(value);
	}
	
	/**
	 * Sets the components to the corresponding paramters.
	 * 
	 * @param x The new x value.
	 * @param y The new y value.
	 * 
	 * @return The current vector.
	 * 
	 * @since 1.0.0.0
	 */
	@Override
	default Vec2fW set(float x, float y)
	{
		return (Vec2fW)Tup2fW.super.set(x, y);
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
	default Vec2fW setByIndex(int index, float value)
	{
		return (Vec2fW)Tup2fW.super.setByIndex(index, value);
	}
	
	/**
	 * Sets the components to the corresponding components.
	 * 
	 * @param values The values to store in the components of the vector.
	 * 
	 * @return The current vector.
	 */
	@Override
	default Vec2fW setArray(float... values)
	{
		return (Vec2fW)Tup2fW.super.setArray(values);
	}
	
	/**
	 * Adopts the values from an existing instance of {@link TupfR}.
	 * 
	 * @param t An existing implementation of {@link TupfR} to adopt the values from.
	 * 
	 * @return The current vector.
	 */
	@Override
	default Vec2fW set(TupfR t)
	{
		return (Vec2fW)Tup2fW.super.set(t);
	}
	
	/**
	 * Adds the second given tuple to the current vector.
	 * This operation alters the current vector.
	 * 
	 * <p>
	 * Operation:
	 * v + t
	 * 
	 * @param t The second tuple to add to the current vector.
	 * 
	 * @return The current vector.
	 */
	default Vec2fW add(Tup2fR t)
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
	default Vec2fW add(float value)
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
	Vec2fW add(float x, float y);
	
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
	default Vec2fW sub(Tup2fR t)
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
	default Vec2fW sub(float value)
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
	Vec2fW sub(float x, float y);
	
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
	default Vec2fW revSub(Tup2fR t)
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
	default Vec2fW revSub(float value)
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
	Vec2fW revSub(float x, float y);
	
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
	default Vec2fW mul(Tup2fR t)
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
	default Vec2fW mul(float value)
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
	Vec2fW mul(float x, float y);
	
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
	default Vec2fW div(Tup2fR t)
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
	default Vec2fW div(float value)
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
	Vec2fW div(float x, float y);
	
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
	default Vec2fW revDiv(Tup2fR t)
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
	default Vec2fW revDiv(float value)
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
	Vec2fW revDiv(float x, float y);
	
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
	Vec2fW normal();
	
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
	Vec2fW normalSafe();
	
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
	Vec2fW normalSafeWithMargin(float tolerance);
	
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
	Vec2fW invert();
	
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
	Vec2fW inverse();
	
	/**
	 * Inverses the current vector based on the given tuple.
	 * It does the same as {@link #revSub(Tup2fR)} and is present for completness.
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
	Vec2fW inverse(Tup2fR t);
	
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
	Vec2fW inverse(float value);
	
	/**
	 * Inverses the current vector based on the given component values.
	 * It does the same as {@link #revSubR(float, float, Object)} and is present for completness.
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
	Vec2fW inverse(float x, float y);
}
