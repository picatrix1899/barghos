package org.barghos.math.api.vector;

import org.barghos.core.api.tuple.TupdR;
import org.barghos.core.api.tuple2.Tup2dC;
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
public interface Vec2dC extends Vec2dR, Tup2dC
{
	/**
	 * Sets the x component of the vector.
	 * 
	 * @param x The new x value.
	 * 
	 * @return The current vector.
	 */
	@Override
	Vec2dC setX(double x);
	
	/**
	 * Sets the y component of the vector.
	 * 
	 * @param y The new y value.
	 * 
	 * @return The current vector.
	 */
	@Override
	Vec2dC setY(double y);
	
	/**
	 * Adopts the values from an existing instance of {@link Tup2dR}.
	 * 
	 * @param t An existing implementation of {@link Tup2dR} to adopt the values from.
	 * 
	 * @return The current vector.
	 */
	@Override
	default Vec2dC set(Tup2dR t)
	{
		return (Vec2dC)Tup2dC.super.set(t);
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
	default Vec2dC set(double value)
	{
		return (Vec2dC)Tup2dC.super.set(value);
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
	default Vec2dC set(double x, double y)
	{
		return (Vec2dC)Tup2dC.super.set(x, y);
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
	default Vec2dC setByIndex(int index, double value)
	{
		return (Vec2dC)Tup2dC.super.setByIndex(index, value);
	}
	
	/**
	 * Sets the components to the corresponding components.
	 * 
	 * @param values The values to store in the components of the vector.
	 * 
	 * @return The current vector.
	 */
	@Override
	default Vec2dC setArray(double... values)
	{
		return (Vec2dC)Tup2dC.super.setArray(values);
	}
	
	/**
	 * Adopts the values from an existing instance of {@link TupdR}.
	 * 
	 * @param t An existing implementation of {@link TupdR} to adopt the values from.
	 * 
	 * @return The current vector.
	 */
	@Override
	default Vec2dC set(TupdR t)
	{
		return (Vec2dC)Tup2dC.super.set(t);
	}
	
	/** {@inheritDoc} */
	@Override
	Vec2dC clone();
	
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
	default Vec2dC add(Tup2dR t)
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
	default Vec2dC add(double value)
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
	default Vec2dC add(double x, double y)
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
	default Vec2dC sub(Tup2dR t)
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
	default Vec2dC sub(double value)
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
	default Vec2dC sub(double x, double y)
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
	default Vec2dC revSub(Tup2dR t)
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
	default Vec2dC revSub(double value)
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
	default Vec2dC revSub(double x, double y)
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
	default Vec2dC mul(Tup2dR t)
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
	default Vec2dC mul(double value)
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
	default Vec2dC mul(double x, double y)
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
	default Vec2dC div(Tup2dR t)
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
	default Vec2dC div(double value)
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
	default Vec2dC div(double x, double y)
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
	default Vec2dC revDiv(Tup2dR t)
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
	default Vec2dC revDiv(double value)
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
	default Vec2dC revDiv(double x, double y)
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
	default Vec2dC fma(Tup2dR m, Tup2dR a)
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
	default Vec2dC fma(Tup2dR m, double aX, double aY)
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
	default Vec2dC fma(double mX, double mY, Tup2dR a)
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
	default Vec2dC fma(double mX, double mY, double aX, double aY)
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
	default Vec2dC mulAdd(Tup2dR m1, Tup2dR m2)
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
	default Vec2dC mulAdd(Tup2dR m1, double mX2, double mY2)
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
	default Vec2dC mulAdd(double mX1, double mY1, Tup2dR m2)
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
	default Vec2dC mulAdd(double mX1, double mY1, double mX2, double mY2)
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

	 * @return The current vector.
	 * 
	 * @throws ArithmeticException Thrown when it is a zero-length vector.
	 */
	default Vec2dC normal()
	{
		return Vec2dUtil.normal(getX(), getY(), this);
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
	 * @return The current vector.
	 * 
	 * @throws ArithmeticException Might be thrown when the length is to close to zero.
	 */
	default Vec2dC normalSafe()
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
	default Vec2dC normalSafeWithMargin(double tolerance)
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
	default Vec2dC invert()
	{
		return Vec2dUtil.invert(getX(), getY(), this);
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
	default Vec2dC inverse()
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
	default Vec2dC inverse(Tup2dR t)
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
	default Vec2dC inverse(double value)
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
	default Vec2dC inverse(double x, double y)
	{
		return Vec2dUtil.inverse(getX(), getY(), x, y, this);
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
		return Vec2dUtil.dot(getX(), getY(), x, y);
	}
	
	/**
	 * Makes all components of the vector absolute.
	 * This operation alters the current vector.
	 * 
	 * @return The current vector.
	 */
	default Vec2dC abs()
	{
		return set(Math.abs(getX()), Math.abs(getY()));
	}
	
	/**
	 * Rounds all components down to the next integer closer to negative infinity.
	 * This operation alters the current vector.
	 * 
	 * @return The current vector.
	 */
	default Vec2dC floor()
	{
		return set(Math.floor(getX()), Math.floor(getY()));
	}
	
	/**
	 * Rounds all components up to the next integer closer to positive infinity.
	 * This operation alters the current vector.
	 * 
	 * @return The current vector.
	 */
	default Vec2dC ceil()
	{
		return set(Math.ceil(getX()), Math.ceil(getY()));
	}
	
	/**
	 * Rounds all components up to the next integer closer to positive infinity or negative infinity.
	 * This operation alters the current vector.
	 * 
	 * @return The current vector.
	 */
	default Vec2dC round()
	{
		return set(Math.round(getX()), Math.round(getY()));
	}
	
	/**
	 * Truncates the decimals of the components.
	 * This operation alters the current vector.
	 * 
	 * @return The current vector.
	 */
	default Vec2dC trunc()
	{
		return set((int)getX(), (int)getY());
	}
	
	/**
	 * Sets the vector to the signums of the components.
	 * This operation alters the current vector.
	 * 
	 * @return The current vector.
	 */
	default Vec2dC signum()
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
	default Vec2dC reflect(Tup2dR normal)
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
	default Vec2dC reflect(double nX, double nY)
	{
		return Vec2dUtil.reflect(getX(), getY(), nX, nY, this);
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
	default Vec2dC project(Tup2dR v)
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
	default Vec2dC project(double vX, double vY)
	{
		return Vec2dUtil.project(getX(), getY(), vX, vY, this);
	}
	
	/**
	 * Rotates the vector by the given angle in radians.
	 * This operation alters the current vector.
	 * 
	 * @param angle The angle in radians.
	 * 
	 * @return The current vector.
	 */
	default Vec2dC rotate(double angle)
	{
		return Vec2dUtil.rotate(getX(), getY(), angle, this);
	}
	
	/**
	 * Halfs the vector.
	 * This operation alters the current vector.
	 * @return
	 */
	default Vec2dC half()
	{
		return Vec2dUtil.half(getX(), getY(), this);
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
	default Vec2dC addN(Tup2dR t)
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
	default Vec2dC addN(double value)
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
	default Vec2dC addN(double x, double y)
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
	default Vec2dC subN(Tup2dR t)
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
	default Vec2dC subN(double value)
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
	default Vec2dC subN(double x, double y)
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
	default Vec2dC revSubN(Tup2dR t)
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
	default Vec2dC revSubN(double value)
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
	default Vec2dC revSubN(double x, double y)
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
	default Vec2dC mulN(Tup2dR t)
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
	default Vec2dC mulN(double value)
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
	default Vec2dC mulN(double x, double y)
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
	default Vec2dC divN(Tup2dR t)
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
	default Vec2dC divN(double value)
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
	default Vec2dC divN(double x, double y)
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
	default Vec2dC revDivN(Tup2dR t)
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
	default Vec2dC revDivN(double value)
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
	default Vec2dC revDivN(double x, double y)
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
	default Vec2dC fmaN(Tup2dR m, Tup2dR a)
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
	default Vec2dC fmaN(Tup2dR m, double aX, double aY)
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
	default Vec2dC fmaN(double mX, double mY, Tup2dR a)
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
	default Vec2dC fmaN(double mX, double mY, double aX, double aY)
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
	default Vec2dC mulAddN(Tup2dR m1, Tup2dR m2)
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
	default Vec2dC mulAddN(Tup2dR m1, double mX2, double mY2)
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
	default Vec2dC mulAddN(double mX1, double mY1, Tup2dR m2)
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
	default Vec2dC mulAddN(double mX1, double mY1, double mX2, double mY2)
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
	default Vec2dC normalN()
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
	default Vec2dC normalSafeN()
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
	default Vec2dC normalSafeWithMarginN(double tolerance)
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
	default Vec2dC invertN()
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
	default Vec2dC inverseN()
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
	default Vec2dC inverseN(Tup2dR t)
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
	default Vec2dC inverseN(double value)
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
	default Vec2dC inverseN(double x, double y)
	{
		return clone().inverse(x, y);
	}
	
	/**
	 * Makes all components of the vector absolute and saves the result in a new instance.
	 * This operation does not alter the current vector.
	 * 
	 * @return The new instance with the result.
	 */
	default Vec2dC absN()
	{
		return clone().abs();
	}
	
	/**
	 * Rounds all components down to the next integer closer to negative infinity and saves the result in a new instance.
	 * This operation does not alter the current vector.
	 * 
	 * @return The new instance with the result.
	 */
	default Vec2dC floorN()
	{
		return clone().floor();
	}
	
	/**
	 * Rounds all components up to the next integer closer to positive infinity and saves the result in a new instance.
	 * This operation does not alter the current vector.
	 * 
	 * @return The new instance with the result.
	 */
	default Vec2dC ceilN()
	{
		return clone().ceil();
	}
	
	/**
	 * Rounds all components up to the next integer closer to positive infinity or negative infinity and saves the result in a new instance.
	 * This operation does not alter the current vector.
	 * 
	 * @return The new instance with the result.
	 */
	default Vec2dC roundN()
	{
		return clone().round();
	}
	
	/**
	 * Truncates the decimals of the components and saves the result in a new instance.
	 * This operation does not alter the current vector.
	 * 
	 * @return The new instance with the result.
	 */
	default Vec2dC truncN()
	{
		return clone().trunc();
	}
	
	/**
	 * Determines the signums of the components and saves the result in a new instance.
	 * This operation does not alter the current vector.
	 * 
	 * @return The new instance with the result.
	 */
	default Vec2dC signumN()
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
	default Vec2dC reflectN(Tup2dR normal)
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
	default Vec2dC reflectN(double nX, double nY)
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
	default Vec2dC projectN(Tup2dR v)
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
	default Vec2dC projectN(double vX, double vY)
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
	default Vec2dC rotateN(double angle)
	{
		return clone().rotate(angle);
	}
	
	/**
	 * Halfs the vector and saves the result in a new instance.
	 * This operation does not alter the current vector.
	 * @return
	 */
	default Vec2dC halfN()
	{
		return clone().half();
	}
}
