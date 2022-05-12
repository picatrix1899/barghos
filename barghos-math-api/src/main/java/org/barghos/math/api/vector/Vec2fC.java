package org.barghos.math.api.vector;

import org.barghos.core.api.tuple.TupfR;
import org.barghos.core.api.tuple2.Tup2fR;
import org.barghos.core.api.tuple2.Tup2fC;

/**
 * This interface represents any modifiable 2-dimensional float vector.
 * 
 * <p>
 * It should be prefered by design before direct usage of a type in method parameters,
 * if the method only writes data to the parameter.
 * 
 * @author picatrix1899
 */
public interface Vec2fC extends Vec2fR, Tup2fC
{
	/**
	 * Sets the x component of the vector.
	 * 
	 * @param x The new x value.
	 * 
	 * @return The current vector.
	 */
	@Override
	Vec2fC setX(float x);
	
	/**
	 * Sets the y component of the vector.
	 * 
	 * @param y The new y value.
	 * 
	 * @return The current vector.
	 */
	@Override
	Vec2fC setY(float y);
	
	/**
	 * Adopts the values from an existing instance of {@link Tup2fR}.
	 * 
	 * @param t An existing implementation of {@link Tup2fR} to adopt the values from.
	 * 
	 * @return The current vector.
	 */
	@Override
	default Vec2fC set(Tup2fR t)
	{
		return (Vec2fC)Tup2fC.super.set(t);
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
	default Vec2fC set(float value)
	{
		return (Vec2fC)Tup2fC.super.set(value);
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
	default Vec2fC set(float x, float y)
	{
		return (Vec2fC)Tup2fC.super.set(x, y);
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
	default Vec2fC setByIndex(int index, float value)
	{
		return (Vec2fC)Tup2fC.super.setByIndex(index, value);
	}
	
	/**
	 * Sets the components to the corresponding components.
	 * 
	 * @param values The values to store in the components of the vector.
	 * 
	 * @return The current vector.
	 */
	@Override
	default Vec2fC setArray(float... values)
	{
		return (Vec2fC)Tup2fC.super.setArray(values);
	}
	
	/**
	 * Adopts the values from an existing instance of {@link TupfR}.
	 * 
	 * @param t An existing implementation of {@link TupfR} to adopt the values from.
	 * 
	 * @return The current vector.
	 */
	@Override
	default Vec2fC set(TupfR t)
	{
		return (Vec2fC)Tup2fC.super.set(t);
	}
	
	/** {@inheritDoc} */
	@Override
	Vec2fC clone();
	
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
	default Vec2fC add(Tup2fR t)
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
	default Vec2fC add(float value)
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
	default Vec2fC add(float x, float y)
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
	default Vec2fC sub(Tup2fR t)
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
	default Vec2fC sub(float value)
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
	default Vec2fC sub(float x, float y)
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
	default Vec2fC revSub(Tup2fR t)
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
	default Vec2fC revSub(float value)
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
	default Vec2fC revSub(float x, float y)
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
	default Vec2fC mul(Tup2fR t)
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
	default Vec2fC mul(float value)
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
	default Vec2fC mul(float x, float y)
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
	default Vec2fC div(Tup2fR t)
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
	default Vec2fC div(float value)
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
	default Vec2fC div(float x, float y)
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
	default Vec2fC revDiv(Tup2fR t)
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
	default Vec2fC revDiv(float value)
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
	default Vec2fC revDiv(float x, float y)
	{
		return Vec2fUtil.revDiv(getX(), getY(), x, y, this);
	}
	
	/**
	 * Performs an fma ({@link Math#fma}) combined multiplication and addition operation with the two
	 * given tuples.
	 * In this version the current vector is used as a multiplicant.
	 * 
	 * <p>
	 * Operation:
	 * v * m + a
	 * 
	 * @param m The second multiplicant.
	 * @param a The addend.
	 * 
	 * @return The current vector.
	 */
	default Vec2fC fma(Tup2fR m, Tup2fR a)
	{
		return fma(m, a);
	}
	
	/**
	 * Performs an fma ({@link Math#fma}) combined multiplication and addition operation with the two
	 * given tuples defined by the given tuple and the components.
	 * In this version the current vector is used as a multiplicant.
	 * 
	 * <p>
	 * Operation:
	 * v * m + (aX, aY)
	 * 
	 * @param m The second multiplicant.
	 * @param aX The value of the x component of the addend.
	 * @param aY The value of the y component of the addend.
	 * 
	 * @return The current vector.
	 */
	default Vec2fC fma(Tup2fR m, float aX, float aY)
	{
		return fma(m, aX, aY);
	}
	
	/**
	 * Performs an fma ({@link Math#fma}) combined multiplication and addition operation with the two
	 * given tuples defined by the given tuple and the components.
	 * In this version the current vector is used as a multiplicant.
	 * 
	 * <p>
	 * Operation:
	 * v * (mX, mY) + a
	 * 
	 * @param mX The value of the x component of the second multiplicant.
	 * @param mY The value of the y component of the second multiplicant.
	 * @param a The addend.
	 * 
	 * @return The current vector.
	 */
	default Vec2fC fma(float mX, float mY, Tup2fR a)
	{
		return fma(mX, mY, a);
	}
	
	/**
	 * Performs an fma ({@link Math#fma}) combined multiplication and addition operation with the two
	 * given tuples defined by the given components.
	 * In this version the current vector is used as a multiplicant.
	 * 
	 * <p>
	 * Operation:
	 * v * (mX, mY) + (aX, aY)
	 * 
	 * @param mX The value of the x component of the second multiplicant.
	 * @param mY The value of the y component of the second multiplicant.
	 * @param aX The value of the x component of the addend.
	 * @param aY The value of the y component of the addend.
	 * 
	 * @return The current vector.
	 */
	default Vec2fC fma(float mX, float mY, float aX, float aY)
	{
		return Vec2fUtil.fma(getX(), getY(), mX, mY, aX, aY, this);
	}
	
	/**
	 * Performs an fma ({@link Math#fma}) combined multiplication and addition operation with the two
	 * given tuples.
	 * In this version the current vector is used as the addend.
	 * 
	 * <p>
	 * Operation:
	 * v + m1 * m2
	 * 
	 * @param m1 The first multiplicant.
	 * @param m2 The second multiplicant.
	 * 
	 * @return The current vector.
	 */
	default Vec2fC mulAdd(Tup2fR m1, Tup2fR m2)
	{
		return mulAdd(m1.getX(), m1.getY(), m2.getX(), m2.getY());
	}
	
	/**
	 * Performs an fma ({@link Math#fma}) combined multiplication and addition operation with the two
	 * given tuples defined by the given tuple and the components.
	 * In this version the current vector is used as the addend.
	 * 
	 * <p>
	 * Operation:
	 * v + m1 * (mX2, mY2)
	 * 
	 * @param m1 The first multiplicant.
	 * @param mX2 The value of the x component of the second multiplicant.
	 * @param mY2 The value of the y component of the second multiplicant.
	 * 
	 * @return The current vector.
	 */
	default Vec2fC mulAdd(Tup2fR m1, float mX2, float mY2)
	{
		return mulAdd(m1.getX(), m1.getY(), mX2, mY2);
	}
	
	/**
	 * Performs an fma ({@link Math#fma}) combined multiplication and addition operation with the two
	 * given tuples defined by the given tuple and the components.
	 * In this version the current vector is used as the addend.
	 * 
	 * <p>
	 * Operation:
	 * v + (mX1, mY1) * m2
	 * 
	 * @param mX1 The value of the x component of the first multiplicant.
	 * @param mY1 The value of the y component of the first multiplicant.
	 * @param m2 The second multiplicant.
	 * 
	 * @return The current vector.
	 */
	default Vec2fC mulAdd(float mX1, float mY1, Tup2fR m2)
	{
		return mulAdd(mX1, mY1, m2.getX(), m2.getY());
	}
	
	/**
	 * Performs an fma ({@link Math#fma}) combined multiplication and addition operation with the two
	 * given tuples defined by the given components.
	 * In this version the current vector is used as the addend.
	 * 
	 * <p>
	 * Operation:
	 * v + (mX1, mY1) * (mX2, mY2)
	 * 
	 * @param mX1 The value of the x component of the first multiplicant.
	 * @param mY1 The value of the y component of the first multiplicant.
	 * @param mX2 The value of the x component of the second multiplicant.
	 * @param mY2 The value of the y component of the second multiplicant.
	 * 
	 * @return The current vector.
	 */
	default Vec2fC mulAdd(float mX1, float mY1, float mX2, float mY2)
	{
		return Vec2fUtil.mulAdd(getX(), getY(), mX1, mY1, mX2, mY2, this);
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
	default Vec2fC normal()
	{
		return Vec2fUtil.normal(getX(), getY(), this);
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
	default Vec2fC normalSafe()
	{
		if(isExactlyZero()) return set(0.0f);
		
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
	default Vec2fC normalSafeWithMargin(float tolerance)
	{
		if(isZero(tolerance)) return set(0.0f);
		
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
	default Vec2fC invert()
	{
		return Vec2fUtil.invert(getX(), getY(), this);
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
	default Vec2fC inverse()
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
	default Vec2fC inverse(Tup2fR t)
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
	default Vec2fC inverse(float value)
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
	default Vec2fC inverse(float x, float y)
	{
		return Vec2fUtil.inverse(getX(), getY(), x, y, this);
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
		return Vec2fUtil.dot(getX(), getY(), x, y);
	}
	
	/**
	 * Makes all components of the vector absolute.
	 * This operation alters the current vector.
	 * 
	 * @return The current vector.
	 */
	default Vec2fC abs()
	{
		return set(Math.abs(getX()), Math.abs(getY()));
	}
	
	/**
	 * Rounds all components down to the next integer closer to negative infinity.
	 * This operation alters the current vector.
	 * 
	 * @return The current vector.
	 */
	default Vec2fC floor()
	{
		return set((float)Math.floor(getX()), (float)Math.floor(getY()));
	}
	
	/**
	 * Rounds all components up to the next integer closer to positive infinity.
	 * This operation alters the current vector.
	 * 
	 * @return The current vector.
	 */
	default Vec2fC ceil()
	{
		return set((float)Math.ceil(getX()), (float)Math.ceil(getY()));
	}
	
	/**
	 * Rounds all components up to the next integer closer to positive infinity or negative infinity.
	 * This operation alters the current vector.
	 * 
	 * @return The current vector.
	 */
	default Vec2fC round()
	{
		return set(Math.round(getX()), Math.round(getY()));
	}
	
	/**
	 * Truncates the decimals of the components.
	 * This operation alters the current vector.
	 * 
	 * @return The current vector.
	 */
	default Vec2fC trunc()
	{
		return set((int)getX(), (int)getY());
	}
	
	/**
	 * Sets the vector to the signums of the components.
	 * This operation alters the current vector.
	 * 
	 * @return The current vector.
	 */
	default Vec2fC signum()
	{
		return set(Math.signum(getX()), Math.signum(getY()));
	}
	
	/**
	 * Sets the vector to its reflection based on the given surface normal.
	 * The surface normal has to be normalized.
	 * This operation alters the current vector.
	 * 
	 * @param normal The surface normal.
	 * 
	 * @return The current vector.
	 */
	default Vec2fC reflect(Tup2fR normal)
	{
		return reflect(normal.getX(), normal.getY());
	}
	
	/**
	 * Sets the vector to its reflection based on the given surface normal defined by the given components.
	 * The surface normal has to be normalized.
	 * This operation alters the current vector.
	 * 
	 * @param nX The value of the x component of the surface normal.
	 * @param nY The value of the y component of the surface normal.
	 * 
	 * @return The current vector.
	 */
	default Vec2fC reflect(float nX, float nY)
	{
		return Vec2fUtil.reflect(getX(), getY(), nX, nY, this);
	}
	
	/**
	 * Set the vector to its orthogonal projection onto the target vector.
	 * The vector to project on has to be normalized.
	 * This operation alters the current vector.
	 * 
	 * @param v The projection target vector.
	 * 
	 * @return The current vector.
	 */
	default Vec2fC project(Tup2fR v)
	{
		return project(v.getX(), v.getY());
	}
	
	/**
	 * Set the vector to its orthogonal projection onto the target vector defined by the given components.
	 * The vector to project on has to be normalized.
	 * This operation alters the current vector.
	 * 
	 * @param vX The value of the x component of the projection target vector.
	 * @param vY The value of the y component of the projection target vector.
	 * 
	 * @return The current vector.
	 */
	default Vec2fC project(float vX, float vY)
	{
		return Vec2fUtil.project(getX(), getY(), vX, vY, this);
	}
	
	/**
	 * Rotates the vector by the given angle in radians.
	 * This operation alters the current vector.
	 * 
	 * @param angle The angle in radians.
	 * 
	 * @return The current vector.
	 */
	default Vec2fC rotate(float angle)
	{
		return Vec2fUtil.rotate(getX(), getY(), angle, this);
	}
	
	/**
	 * Halfs the vector.
	 * This operation alters the current vector.
	 * @return
	 */
	default Vec2fC half()
	{
		return Vec2fUtil.half(getX(), getY(), this);
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
	default Vec2fC addN(Tup2fR t)
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
	default Vec2fC addN(float value)
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
	default Vec2fC addN(float x, float y)
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
	default Vec2fC subN(Tup2fR t)
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
	default Vec2fC subN(float value)
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
	default Vec2fC subN(float x, float y)
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
	default Vec2fC revSubN(Tup2fR t)
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
	default Vec2fC revSubN(float value)
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
	default Vec2fC revSubN(float x, float y)
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
	default Vec2fC mulN(Tup2fR t)
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
	default Vec2fC mulN(float value)
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
	default Vec2fC mulN(float x, float y)
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
	default Vec2fC divN(Tup2fR t)
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
	default Vec2fC divN(float value)
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
	default Vec2fC divN(float x, float y)
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
	default Vec2fC revDivN(Tup2fR t)
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
	default Vec2fC revDivN(float value)
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
	default Vec2fC revDivN(float x, float y)
	{
		return clone().revDiv(x, y);
	}

	/**
	 * Performs an fma ({@link Math#fma}) combined multiplication and addition operation with the two
	 * given tuples and saves the result in a new instance.
	 * In this version the current vector is used as a multiplicant.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation:
	 * v * m + a
	 * 
	 * @param m The second multiplicant.
	 * @param a The addend.
	 * 
	 * @return The new instance with the result.
	 */
	default Vec2fC fmaN(Tup2fR m, Tup2fR a)
	{
		return clone().fma(m.getX(), m.getY(), a.getX(), a.getY());
	}
	
	/**
	 * Performs an fma ({@link Math#fma}) combined multiplication and addition operation with the two
	 * given tuples defined by the given tuple and the components and saves the result in
	 * a new instance.
	 * In this version the current vector is used as a multiplicant.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation:
	 * v * m + (aX, aY)
	 * 
	 * @param mX The second multiplicant.
	 * @param aX The value of the x component of the addend.
	 * @param aY The value of the y component of the addend.
	 * 
	 * @return The new instance with the result.
	 */
	default Vec2fC fmaN(Tup2fR m, float aX, float aY)
	{
		return clone().fma(m.getX(), m.getY(), aX, aY);
	}
	
	/**
	 * Performs an fma ({@link Math#fma}) combined multiplication and addition operation with the two
	 * given tuples defined by the given tuple and the components and saves the result in
	 * a new instance.
	 * In this version the current vector is used as a multiplicant.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation:
	 * v * (mX, mY) + a
	 * 
	 * @param mX The value of the x component of the second multiplicant.
	 * @param mY The value of the y component of the second multiplicant.
	 * @param a The addend.
	 * 
	 * @return The new instance with the result.
	 */
	default Vec2fC fmaN(float mX, float mY, Tup2fR a)
	{
		return clone().fma(mX, mY, a.getX(), a.getY());
	}
	
	/**
	 * Performs an fma ({@link Math#fma}) combined multiplication and addition operation with the two
	 * given tuples defined by the given components and saves the result in
	 * a new instance.
	 * In this version the current vector is used as a multiplicant.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation:
	 * v * (mX, mY) + (aX, aY)
	 * 
	 * @param mX The value of the x component of the second multiplicant.
	 * @param mY The value of the y component of the second multiplicant.
	 * @param aX The value of the x component of the addend.
	 * @param aY The value of the y component of the addend.
	 * 
	 * @return The new instance with the result.
	 */
	default Vec2fC fmaN(float mX, float mY, float aX, float aY)
	{
		return clone().fma(mX, mY, aX, aY);
	}
	
	/**
	 * Performs an fma ({@link Math#fma}) combined multiplication and addition operation with the two
	 * given tuples and saves the result in a new instance.
	 * In this version the current vector is used as the addend.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation:
	 * v + m1 * m2
	 * 
	 * @param m1 The first multiplicant.
	 * @param m2 The second multiplicant.
	 * 
	 * @return The new instance with the result.
	 */
	default Vec2fC mulAddN(Tup2fR m1, Tup2fR m2)
	{
		return clone().mulAdd(m1, m2);
	}
	
	/**
	 * Performs an fma ({@link Math#fma}) combined multiplication and addition operation with the two
	 * given tuples defined by the given tuple and the components and saves the result in
	 * a new instance.
	 * In this version the current vector is used as the addend.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation:
	 * v + m1 * (mX2, mY2)
	 * 
	 * @param m1 The first multiplicant.
	 * @param mX2 The value of the x component of the second multiplicant.
	 * @param mY2 The value of the y component of the second multiplicant.
	 * 
	 * @return The new instance with the result.
	 */
	default Vec2fC mulAddN(Tup2fR m1, float mX2, float mY2)
	{
		return clone().mulAdd(m1, mX2, mY2);
	}
	
	/**
	 * Performs an fma ({@link Math#fma}) combined multiplication and addition operation with the two
	 * given tuples defined by the given tuple and the components and saves the result in
	 * a new instance.
	 * In this version the current vector is used as the addend.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation:
	 * v + (mX1, mY1) * m2
	 * 
	 * @param mX1 The value of the x component of the first multiplicant.
	 * @param mY1 The value of the y component of the first multiplicant.
	 * @param m2 The second multiplicant.
	 * 
	 * @return The new instance with the result.
	 */
	default Vec2fC mulAddN(float mX1, float mY1, Tup2fR m2)
	{
		return clone().mulAdd(mX1, mY1, m2);
	}
	
	/**
	 * Performs an fma ({@link Math#fma}) combined multiplication and addition operation with the two
	 * given tuples defined by the given components and saves the result in
	 * a new instance
	 * In this version the current vector is used as the addend.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation:
	 * v + (mX1, mY1) * (mX2, mY2)
	 * 
	 * @param mX1 The value of the x component of the first multiplicant.
	 * @param mY1 The value of the y component of the first multiplicant.
	 * @param mX2 The value of the x component of the second multiplicant.
	 * @param mY2 The value of the y component of the second multiplicant.
	 * 
	 * @return The new instance with the result.
	 */
	default Vec2fC mulAddN(float mX1, float mY1, float mX2, float mY2)
	{
		return clone().mulAdd(mX1, mY1, mX2, mY2);
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
	default Vec2fC normalN()
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
	default Vec2fC normalSafeN()
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
	default Vec2fC normalSafeWithMarginN(float tolerance)
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
	default Vec2fC invertN()
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
	default Vec2fC inverseN()
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
	default Vec2fC inverseN(Tup2fR t)
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
	default Vec2fC inverseN(float value)
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
	default Vec2fC inverseN(float x, float y)
	{
		return clone().inverse(x, y);
	}
	
	/**
	 * Makes all components of the vector absolute and saves the result in a new instance.
	 * This operation does not alter the current vector.
	 * 
	 * @return The new instance with the result.
	 */
	default Vec2fC absN()
	{
		return clone().abs();
	}
	
	/**
	 * Rounds all components down to the next integer closer to negative infinity and saves the result in a new instance.
	 * This operation does not alter the current vector.
	 * 
	 * @return The new instance with the result.
	 */
	default Vec2fC floorN()
	{
		return clone().floor();
	}
	
	/**
	 * Rounds all components up to the next integer closer to positive infinity and saves the result in a new instance.
	 * This operation does not alter the current vector.
	 * 
	 * @return The new instance with the result.
	 */
	default Vec2fC ceilN()
	{
		return clone().ceil();
	}
	
	/**
	 * Rounds all components up to the next integer closer to positive infinity or negative infinity and saves the result in a new instance.
	 * This operation does not alter the current vector.
	 * 
	 * @return The new instance with the result.
	 */
	default Vec2fC roundN()
	{
		return clone().round();
	}
	
	/**
	 * Truncates the decimals of the components and saves the result in a new instance.
	 * This operation does not alter the current vector.
	 * 
	 * @return The new instance with the result.
	 */
	default Vec2fC truncN()
	{
		return clone().trunc();
	}
	
	/**
	 * Sets the vector to the signums of the components and saves the result in a new instance.
	 * This operation does not alter the current vector.
	 * 
	 * @return The new instance with the result.
	 */
	default Vec2fC signumN()
	{
		return clone().signum();
	}
	
	/**
	 * Calculates the reflection of the vector based on the given surface normal and saves the result in a new instance.
	 * The surface normal has to be normalized.
	 * This operation does not alter the current vector.
	 * 
	 * @param normal The surface normal.
	 * 
	 * @return The new instance with the result.
	 */
	default Vec2fC reflectN(Tup2fR normal)
	{
		return clone().reflect(normal);
	}
	
	/**
	 * Calculates the reflection of the vector based on the given surface normal defined by the given components
	 * and saves the result in a new instance.
	 * The surface normal has to be normalized.
	 * This operation does not alter the current vector.
	 * 
	 * @param nX The value of the x component of the surface normal.
	 * @param nY The value of the y component of the surface normal.
	 * 
	 * @return The new instance with the result.
	 */
	default Vec2fC reflectN(float nX, float nY)
	{
		return clone().reflect(nX, nY);
	}
	
	/**
	 * Calculates the orthogonal projection of the vector onto the target vector
	 * and saves the result in a new instance.
	 * The vector to project on has to be normalized.
	 * This operation does not alter the current vector.
	 * 
	 * @param v The projection target vector.
	 * 
	 * @return The new instance with the result.
	 */
	default Vec2fC projectN(Tup2fR v)
	{
		return clone().project(v);
	}
	
	/**
	 * Calculates the orthogonal projection of the vector onto the target vector defined by the given components
	 * and saves the result in a new instance.
	 * The vector to project on has to be normalized.
	 * This operation does not alter the current vector.
	 * 
	 * @param vX The value of the x component of the projection target vector.
	 * @param vY The value of the y component of the projection target vector.
	 * 
	 * @return The new instance with the result.
	 */
	default Vec2fC projectN(float vX, float vY)
	{
		return clone().project(vX, vY);
	}
	
	/**
	 * Rotates the vector by the given angle in radians and saves the result in a new instance.
	 * This operation does not alter the current vector.
	 * 
	 * @param angle The angle in radians.
	 * 
	 * @return The new instance with the result.
	 */
	default Vec2fC rotateN(float angle)
	{
		return clone().rotate(angle);
	}
	
	/**
	 * Halfs the vector and saves the result in a new instance.
	 * This operation does not alter the current vector.
	 * @return
	 */
	default Vec2fC halfN()
	{
		return clone().half();
	}
}
