package org.barghos.math.api.vector;

import org.barghos.core.api.tuple.TupdR;
import org.barghos.core.api.tuple2.Tup2dBase;
import org.barghos.core.api.tuple2.Tup2dR;

/**
 * This interface represents any modifiable 2-dimensional double vector.
 * 
 * <p>
 * It should be prefered by design before direct usage of a type in method parameters,
 * if the method only writes data to the parameter.
 * 
 * @author picatrix1899
 */
public interface Vec2dBase extends Vec2dR, Tup2dBase
{
	/**
	 * Sets the x component of the vector.
	 * 
	 * @param x The new x value.
	 * 
	 * @return The current vector.
	 */
	@Override
	Vec2dBase setX(double x);
	
	/**
	 * Sets the y component of the vector.
	 * 
	 * @param y The new y value.
	 * 
	 * @return The current vector.
	 */
	@Override
	Vec2dBase setY(double y);
	
	/**
	 * Adopts the values from an existing instance of {@link Tup2dR}.
	 * 
	 * @param t An existing implementation of {@link Tup2dR} to adopt the values from.
	 * 
	 * @return The current vector.
	 */
	@Override
	default Vec2dBase set(Tup2dR t)
	{
		return (Vec2dBase)Tup2dBase.super.set(t);
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
	default Vec2dBase set(double value)
	{
		return (Vec2dBase)Tup2dBase.super.set(value);
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
	default Vec2dBase set(double x, double y)
	{
		return (Vec2dBase)Tup2dBase.super.set(x, y);
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
	default Vec2dBase setByIndex(int index, double value)
	{
		return (Vec2dBase)Tup2dBase.super.setByIndex(index, value);
	}
	
	/**
	 * Sets the components to the corresponding components.
	 * 
	 * @param values The values to store in the components of the vector.
	 * 
	 * @return The current vector.
	 */
	@Override
	default Vec2dBase setArray(double... values)
	{
		return (Vec2dBase)Tup2dBase.super.setArray(values);
	}
	
	/**
	 * Adopts the values from an existing instance of {@link TupdR}.
	 * 
	 * @param t An existing implementation of {@link TupdR} to adopt the values from.
	 * 
	 * @return The current vector.
	 */
	@Override
	default Vec2dBase set(TupdR t)
	{
		return (Vec2dBase)Tup2dBase.super.set(t);
	}
	
	/** {@inheritDoc} */
	@Override
	Vec2dBase clone();
	
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
	default Vec2dBase add(Tup2dR t)
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
	default Vec2dBase add(double value)
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
	default Vec2dBase add(double x, double y)
	{
		return Vec2dUtil.add(getX(), getX(), x, y, this);
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
	default Vec2dBase sub(Tup2dR t)
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
	default Vec2dBase sub(double value)
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
	default Vec2dBase sub(double x, double y)
	{
		return Vec2dUtil.sub(getX(), getY(), x, y, this);
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
	default Vec2dBase revSub(Tup2dR t)
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
	default Vec2dBase revSub(double value)
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
	default Vec2dBase revSub(double x, double y)
	{
		return Vec2dUtil.revSub(getX(), getY(), x, y, this);
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
	default Vec2dBase mul(Tup2dR t)
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
	default Vec2dBase mul(double value)
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
	default Vec2dBase mul(double x, double y)
	{
		return Vec2dUtil.mul(getX(), getY(), x, y, this);
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
	default Vec2dBase div(Tup2dR t)
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
	default Vec2dBase div(double value)
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
	default Vec2dBase div(double x, double y)
	{
		return Vec2dUtil.div(getX(), getY(), x, y, this);
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
	default Vec2dBase revDiv(Tup2dR t)
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
	default Vec2dBase revDiv(double value)
	{
		return revDiv(value, value);
	}
	
	/**
	 * Divides the second tuple defined by the given components values by the current vector.
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
	default Vec2dBase revDiv(double x, double y)
	{
		return Vec2dUtil.revDiv(getX(), getY(), x, y, this);
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
	default Vec2dBase fma(Tup2dR m, Tup2dR a)
	{
		return fma(m.getX(), m.getY(), a.getX(), a.getY());
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
	default Vec2dBase fma(Tup2dR m, double aX, double aY)
	{
		return fma(m.getX(), m.getY(), aX, aY);
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
	default Vec2dBase fma(double mX, double mY, Tup2dR a)
	{
		return fma(mX, mY, a.getX(), a.getY());
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
	default Vec2dBase fma(double mX, double mY, double aX, double aY)
	{
		return Vec2dUtil.fma(getX(), getY(), mX, mY, aX, aY, this);
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
	default Vec2dBase mulAdd(Tup2dR m1, Tup2dR m2)
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
	default Vec2dBase mulAdd(Tup2dR m1, double mX2, double mY2)
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
	default Vec2dBase mulAdd(double mX1, double mY1, Tup2dR m2)
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
	default Vec2dBase mulAdd(double mX1, double mY1, double mX2, double mY2)
	{
		return Vec2dUtil.mulAdd(getX(), getY(), mX1, mY1, mX2, mY2, this);
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
	default Vec2dBase normal()
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
	default Vec2dBase normalSafe()
	{
		if(isZero()) return set(0.0);
		
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
	default Vec2dBase normalSafeWithMargin(double tolerance)
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
	default Vec2dBase invert()
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
	default Vec2dBase inverse()
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
	default Vec2dBase inverse(Tup2dR t)
	{
		return inverse(t.getX(), t.getY());
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
	default Vec2dBase inverse(double value)
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
	default Vec2dBase inverse(double x, double y)
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
	default double dot(Tup2dR t)
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
	default double dot(double value)
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
	default double dot(double x, double y)
	{
		return getX() * x + getY() * y;
	}
	
	/**
	 * Makes all components of the vector absolute.
	 * This operation alters the current vector.
	 * 
	 * @return The current vector.
	 */
	default Vec2dBase abs()
	{
		return set(Math.abs(getX()), Math.abs(getY()));
	}
	
	/**
	 * Rounds all components down to the next integer closer to negative infinity.
	 * This operation alters the current vector.
	 * 
	 * @return The current vector.
	 */
	default Vec2dBase floor()
	{
		return set(Math.floor(getX()), Math.floor(getY()));
	}
	
	/**
	 * Rounds all components up to the next integer closer to positive infinity.
	 * This operation alters the current vector.
	 * 
	 * @return The current vector.
	 */
	default Vec2dBase ceil()
	{
		return set(Math.ceil(getX()), Math.ceil(getY()));
	}
	
	/**
	 * Rounds all components up to the next integer closer to positive infinity or negative infinity.
	 * This operation alters the current vector.
	 * 
	 * @return The current vector.
	 */
	default Vec2dBase round()
	{
		return set(Math.round(getX()), Math.round(getY()));
	}
	
	/**
	 * Truncates the decimals of the components.
	 * This operation alters the current vector.
	 * 
	 * @return The current vector.
	 */
	default Vec2dBase trunc()
	{
		return set((int)getX(), (int)getY());
	}
	
	/**
	 * Sets the vector to the signums of the components.
	 * This operation alters the current vector.
	 * 
	 * @return The current vector.
	 */
	default Vec2dBase signum()
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
	default Vec2dBase addN(Tup2dR t)
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
	default Vec2dBase addN(double value)
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
	default Vec2dBase addN(double x, double y)
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
	default Vec2dBase subN(Tup2dR t)
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
	default Vec2dBase subN(double value)
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
	default Vec2dBase subN(double x, double y)
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
	default Vec2dBase revSubN(Tup2dR t)
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
	default Vec2dBase revSubN(double value)
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
	default Vec2dBase revSubN(double x, double y)
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
	default Vec2dBase mulN(Tup2dR t)
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
	default Vec2dBase mulN(double value)
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
	default Vec2dBase mulN(double x, double y)
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
	default Vec2dBase divN(Tup2dR t)
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
	default Vec2dBase divN(double value)
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
	default Vec2dBase divN(double x, double y)
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
	default Vec2dBase revDivN(Tup2dR t)
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
	default Vec2dBase revDivN(double value)
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
	default Vec2dBase revDivN(double x, double y)
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
	default Vec2dBase fmaN(Tup2dR m, Tup2dR a)
	{
		return clone().fma(m, a);
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
	default Vec2dBase fmaN(Tup2dR m, double aX, double aY)
	{
		return clone().fma(m, aX, aY);
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
	default Vec2dBase fmaN(double mX, double mY, Tup2dR a)
	{
		return clone().fma(mX, mY, a);
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
	default Vec2dBase fmaN(double mX, double mY, double aX, double aY)
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
	default Vec2dBase mulAddN(Tup2dR m1, Tup2dR m2)
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
	default Vec2dBase mulAddN(Tup2dR m1, double mX2, double mY2)
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
	default Vec2dBase mulAddN(double mX1, double mY1, Tup2dR m2)
	{
		return clone().mulAdd(mX1, mY1, m2);
	}
	
	/**
	 * Performs an fma ({@link Math#fma}) combined multiplication and addition operation with the two
	 * given tuples defined by the given components and saves the result in
	 * a new instance.
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
	default Vec2dBase mulAddN(double mX1, double mY1, double mX2, double mY2)
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
	default Vec2dBase normalN()
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
	default Vec2dBase normalSafeN()
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
	default Vec2dBase normalSafeWithMarginN(double tolerance)
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
	default Vec2dBase invertN()
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
	default Vec2dBase inverseN()
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
	default Vec2dBase inverseN(Tup2dR t)
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
	default Vec2dBase inverseN(double value)
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
	default Vec2dBase inverseN(double x, double y)
	{
		return clone().inverse(x, y);
	}
	
	/**
	 * Makes all components of the vector absolute and saves the result in a new instance.
	 * This operation does not alter the current vector.
	 * 
	 * @return The new instance with the result.
	 */
	default Vec2dBase absN()
	{
		return clone().abs();
	}
	
	/**
	 * Rounds all components down to the next integer closer to negative infinity and saves the result in a new instance.
	 * This operation does not alter the current vector.
	 * 
	 * @return The new instance with the result.
	 */
	default Vec2dBase floorN()
	{
		return clone().floor();
	}
	
	/**
	 * Rounds all components up to the next integer closer to positive infinity and saves the result in a new instance.
	 * This operation does not alter the current vector.
	 * 
	 * @return The new instance with the result.
	 */
	default Vec2dBase ceilN()
	{
		return clone().ceil();
	}
	
	/**
	 * Rounds all components up to the next integer closer to positive infinity or negative infinity and saves the result in a new instance.
	 * This operation does not alter the current vector.
	 * 
	 * @return The new instance with the result.
	 */
	default Vec2dBase roundN()
	{
		return clone().round();
	}
	
	/**
	 * Truncates the decimals of the components and saves the result in a new instance.
	 * This operation does not alter the current vector.
	 * 
	 * @return The new instance with the result.
	 */
	default Vec2dBase truncN()
	{
		return clone().trunc();
	}
	
	/**
	 * Sets the vector to the signums of the components and saves the result in a new instance.
	 * This operation does not alter the current vector.
	 * 
	 * @return The new instance with the result.
	 */
	default Vec2dBase signumN()
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
	default <T extends Vec2dBase> T addR(Tup2dR t, T res)
	{
		return addR(t.getX(), t.getY(), res);
	}
	
	/**
	 * Adds the second tuple defined by the given value to the current vector and saves the result in a new instance.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation:
	 * v + (value, value)
	 * 
	 * @param <T> The type of the query parameter.
	 * 
	 * @param value The value of all the components of the second tuple.
	 * @param res The query parameter.
	 * 
	 * @return The query parameter with the result.
	 */
	default <T extends Vec2dBase> T addR(double value, T res)
	{
		return addR(value, value, res);
	}
	
	/**
	 * Adds the second tuple defined by the given component values to the current vector and saves the result in
	 * the query parameter.
	 * the current vector is of.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation:
	 * v + (x, y)
	 * 
	 * @param <T> The type of the query parameter.
	 * 
	 * @param x The value of the x component of the second tuple.
	 * @param y The value of the y component of the second tuple.
	 * @param res The query parameter.
	 * 
	 * @return The query parameter with the result.
	 */
	default <T extends Vec2dBase> T addR(double x, double y, T res)
	{
		return Vec2dUtil.add(getX(), getY(), x, y, res);
	}
}
