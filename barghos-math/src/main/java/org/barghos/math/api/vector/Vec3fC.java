package org.barghos.math.api.vector;

import static org.barghos.core.api.tuple.TupleConstants.COMP_X;
import static org.barghos.core.api.tuple.TupleConstants.COMP_Y;
import static org.barghos.core.api.tuple.TupleConstants.COMP_Z;

import org.barghos.core.api.tuple.TupdR;
import org.barghos.core.api.tuple.TupfR;
import org.barghos.core.api.tuple3.Tup3fR;
import org.barghos.core.api.tuple3.Tup3fC;
import org.barghos.math.api.matrix.Mat4fR;
import org.barghos.math.api.model.AxisAngle3fR;

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
		return set(t.getX(), t.getY(), t.getZ());
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
		return set(value, value, value);
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
	Vec3fC set(float x, float y, float z);
	
	/**
	 * Sets the value of the component at the given index.
	 * 
	 * @param index The index of the component to store the value in.
	 * @param value The new value for the component.
	 * 
	 * @return The current vector.
	 */
	@Override
	Vec3fC setByIndex(int index, float value);
	
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
		return set(values[0], values[1], values[2]);
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
		return setArray(t.toArray());
	}
	
	/** {@inheritDoc} */
	@Override
	Vec3fC clone();
	
	/**
	 * Adds the given tuple {@code (t)} to the current vector.
	 * This operation alters the current vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v + t}
	 * 
	 * @param t The tuple to add to the current vector.
	 * 
	 * @return The current vector.
	 */
	default Vec3fC add(Tup3fR t)
	{
		return add(t.getX(), t.getY(), t.getZ());
	}
	
	/**
	 * Adds the given array {@code (a)} to the current vector.
	 * The components for x, y and z are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 elements.
	 * This operation alters the current vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v + (a[0], a[1], a[2])}
	 * 
	 * @param a The array to add to the current vector. Minimum legth: 3.
	 * 
	 * @return The current vector.
	 */
	default Vec3fC add(float[] a)
	{
		return add(a[COMP_X], a[COMP_Y], a[COMP_Z]);
	}
	
	/**
	 * Adds the given array {@code (a)} to the current vector.
	 * The indices for the components are given by the parameters. Therefore the array
	 * has to contain at least 1 element.
	 * This operation alters the current vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v + (a[indexX], a[indexY], a[indexZ])}
	 * 
	 * @param indexX The index in the array for the x component.
	 * @param indexY The index in the array for the y component.
	 * @param indexZ The index in the array for the z component.
	 * @param a The array to add to the current vector. Minimum length: 1.
	 * 
	 * @return The current vector.
	 */
	default Vec3fC add(int indexX, int indexY, int indexZ, float[] a)
	{
		return add(a[indexX], a[indexY], a[indexZ]);
	}
	
	/**
	 * Adds the given value {@code (value)} to the current vector.
	 * The value is added to every component.
	 * This operation alters the current vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v + (value, value, value)}
	 * 
	 * @param value The value to add to the current vector.
	 * 
	 * @return The current vector.
	 */
	default Vec3fC add(float value)
	{
		return add(value, value, value);
	}
	
	/**
	 * Adds the given tuple {@code (x, y, z)} to the current vector.
	 * This operation alters the current vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v + (x, y, z)}
	 * 
	 * @param x The value of the x component to add to the current vector.
	 * @param y The value of the y component to add to the current vector.
	 * @param z The value of the z component to add to the current vector.
	 * 
	 * @return The current vector.
	 */
	Vec3fC add(float x, float y, float z);
	
	/**
	 * Subtracts the given tuple {@code (t)} from the current vector.
	 * This operation alters the current vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v - t}
	 * 
	 * @param t The tuple to subtract from the current vector.
	 * 
	 * @return The current vector.
	 */
	default Vec3fC sub(Tup3fR t)
	{
		return sub(t.getX(), t.getY(), t.getZ());
	}
	
	/**
	 * Subtracts the given array {@code (a)} from the current vector.
	 * The components for x, y and z are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 elements.
	 * This operation alters the current vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v - (a[0], a[1], a[2])}
	 * 
	 * @param a The array to subtract from the current vector. Minimum length: 3.
	 * 
	 * @return The current vector.
	 */
	default Vec3fC sub(float[] a)
	{
		return sub(a[COMP_X], a[COMP_Y], a[COMP_Z]);
	}
	
	/**
	 * Subtracts the given array {@code (a)} from the current vector.
	 * The indices for the components are given by the parameters. Therefore the array
	 * has to contain at least 1 element.
	 * This operation alters the current vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v - (a[indexX], a[indexY], a[indexZ])}
	 * 
	 * @param indexX The index in the array for the x component.
	 * @param indexY The index in the array for the y component.
	 * @param indexZ The index in the array for the z component.
	 * @param a The array to subtract from the current vector. Minimum length: 1.
	 * 
	 * @return The current vector.
	 */
	default Vec3fC sub(int indexX, int indexY, int indexZ, float[] a)
	{
		return sub(a[indexX], a[indexY], a[indexZ]);
	}
	
	/**
	 * Subtracts the given value {@code (value)} from the current vector.
	 * The value is subtracted from every component.
	 * This operation alters the current vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v - (value, value, value)}
	 * 
	 * @param value The value to subtract from the current vector.
	 * 
	 * @return The current vector.
	 */
	default Vec3fC sub(float value)
	{
		return sub(value, value, value);
	}
	
	/**
	 * Subtracts the given tuple {@code (x, y, z)} from the current vector.
	 * This operation alters the current vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v - (x, y, z)}
	 * 
	 * @param x The value of the x component to subtract from the current vector.
	 * @param y The value of the y component to subtract from the current vector.
	 * @param z The value of the z component to subtract from the current vector.
	 * 
	 * @return The current vector.
	 */
	Vec3fC sub(float x, float y, float z);
	
	/**
	 * Subtracts the current vector from the given tuple {@code (t)}.
	 * This operation alters the current vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code t - v}
	 * 
	 * @param t The tuple the current vector is subtracted from.
	 * 
	 * @return The current vector.
	 */
	default Vec3fC revSub(Tup3fR t)
	{
		return revSub(t.getX(), t.getY(), t.getZ());
	}
	
	/**
	 * Subtracts the current vector from the given array {@code (a)}.
	 * The components for x, y and z are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 elements.
	 * This operation alters the current vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (a[0], a[1], a[2]) - v}
	 * 
	 * @param a The array the current vector is subtracted from. Minimum length: 3.
	 * 
	 * @return The current vector.
	 */
	default Vec3fC revSub(float[] a)
	{
		return revSub(a[COMP_X], a[COMP_Y], a[COMP_Z]);
	}
	
	/**
	 * Subtracts the current vector from the given array {@code (a)}.
	 * The indices for the components are given by the parameters. Therefore the array
	 * has to contain at least 1 element.
	 * This operation alters the current vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (a[indexX], a[indexY], a[indexZ]) - v}
	 * 
	 * @param indexX The index in the array for the x component.
	 * @param indexY The index in the array for the y component.
	 * @param indexZ The index in the array for the z component.
	 * @param a The array the current vector is subtracted from. Minimum length: 1.
	 * 
	 * @return The current vector.
	 */
	default Vec3fC revSub(int indexX, int indexY, int indexZ, float[] a)
	{
		return revSub(a[indexX], a[indexY], a[indexZ]);
	}
	
	/**
	 * Subtracts the current vector from the given value {@code (value)}.
	 * Every component is subtracted from the value.
	 * This operation alters the current vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (value, value, value) - v}
	 * 
	 * @param value The value the current vector is subtracted from.
	 * 
	 * @return The current vector.
	 */
	default Vec3fC revSub(float value)
	{
		return revSub(value, value, value);
	}
		
	/**
	 * Subtracts the current vector from the given tuple {@code (x, y, z)}.
	 * This operation alters the current vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (x, y, z) - v}
	 * 
	 * @param x The value of the x component the current vector is subtracted from.
	 * @param y The value of the y component the current vector is subtracted from.
	 * @param z The value of the z component the current vector is subtracted from.
	 * 
	 * @return The current vector.
	 */
	Vec3fC revSub(float x, float y, float z);
	
	/**
	 * Multiplies the current vector with the given tuple {@code (t)}.
	 * This operation alters the current vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v * t}
	 * 
	 * @param t The tuple to multiply the current vector with.
	 * 
	 * @return The current vector.
	 */
	default Vec3fC mul(Tup3fR t)
	{
		return mul(t.getX(), t.getY(), t.getZ());
	}
	
	/**
	 * Multiplies the current vector with the given array {@code (a)}.
	 * The components for x, y and z are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 elements.
	 * This operation alters the current vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v * (a[0], a[1], a[2])}
	 * 
	 * @param a The array to multiply the current vector with. Minimum length: 3.
	 * 
	 * @return The current vector.
	 */
	default Vec3fC mul(float[] a)
	{
		return mul(a[COMP_X], a[COMP_Y], a[COMP_Z]);
	}
	
	/**
	 * Multiplies the current vector with the given array {@code (a)}.
	 * The indices for the components are given by the parameters. Therefore the array
	 * has to contain at least 1 element.
	 * This operation alters the current vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v * (a[indexX], a[indexY], a[indexZ])}
	 * 
	 * @param indexX The index in the array for the x component.
	 * @param indexY The index in the array for the y component.
	 * @param indexZ The index in the array for the z component.
	 * @param a The array to multiply the current vector with. Minimum length: 1.
	 * 
	 * @return The current vector.
	 */
	default Vec3fC mul(int indexX, int indexY, int indexZ, float[] a)
	{
		return mul(a[indexX], a[indexY], a[indexZ]);
	}
	
	/**
	 * Multiplies the current vector with the given value {@code (value)}.
	 * The value is multiplied with every component.
	 * This operation alters the current vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v * (value, value, value)}
	 * 
	 * @param value The value to multiply the current vector with.
	 * 
	 * @return The current vector.
	 */
	default Vec3fC mul(float value)
	{
		return mul(value, value, value);
	}
	
	/**
	 * Multiplies the current vector with the given tuple {@code (x, y, z)}.
	 * This operation alters the current vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v * (x, y, z)}
	 * 
	 * @param x The value of the x component to multiply the current vector with.
	 * @param y The value of the y component to multiply the current vector with.
	 * @param z The value of the z component to multiply the current vector with.
	 * 
	 * @return The current vector.
	 */
	Vec3fC mul(float x, float y, float z);
	
	/**
	 * Divides the current vector by the given tuple {@code (t)}.
	 * This operation alters the current vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v / t}
	 * 
	 * @param t The tuple to divide the current vector by.
	 * 
	 * @return The current vector.
	 */
	default Vec3fC div(Tup3fR t)
	{
		return div(t.getX(), t.getY(), t.getZ());
	}
	
	/**
	 * Divides the current vector by the given array {@code (a)}.
	 * The components for x, y and z are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 elements.
	 * This operation alters the current vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v / (a[0], a[1], a[2])}
	 * 
	 * @param a The array to divide the current vector by. Minimum length: 3.
	 * 
	 * @return The current vector.
	 */
	default Vec3fC div(float[] a)
	{
		return div(a[COMP_X], a[COMP_Y], a[COMP_Z]);
	}
	
	/**
	 * Divides the current vector by the given array {@code (a)}.
	 * The indices for the components are given by the parameters. Therefore the array
	 * has to contain at least 1 element.
	 * This operation alters the current vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v / (a[indexX], a[indexY], a[indexZ])}
	 * 
	 * @param indexX The index in the array for the x component.
	 * @param indexY The index in the array for the y component.
	 * @param indexZ The index in the array for the z component.
	 * @param a The array to divide the current vector by. Minimum length: 1.
	 * 
	 * @return The current vector.
	 */
	default Vec3fC div(int indexX, int indexY, int indexZ, float[] a)
	{
		return div(a[indexX], a[indexY], a[indexZ]);
	}
	
	/**
	 * Divides the current vector by the given value {@code (value)}.
	 * every component is divided by the value.
	 * This operation alters the current vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v / (value, value, value)}
	 * 
	 * @param value The value to divide the current vector by.
	 * 
	 * @return The current vector.
	 */
	default Vec3fC div(float value)
	{
		return div(value, value, value);
	}
	
	/**
	 * Divides the current vector by the given tuple {@code (x, y, z)}.
	 * This operation alters the current vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v / (x, y, z)}
	 * 
	 * @param x The value of the x component to divide the current vector by.
	 * @param y The value of the y component to divide the current vector by.
	 * @param z The value of the z component to divide the current vector by.
	 * 
	 * @return The current vector.
	 */
	Vec3fC div(float x, float y, float z);

	/**
	 * Divides the given tuple {@code (t)} by the current vector.
	 * This operation alters the current vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code t / v}
	 * 
	 * @param t The tuple to divide by the current vector.
	 * 
	 * @return The current vector.
	 */
	default Vec3fC revDiv(Tup3fR t)
	{
		return revDiv(t.getX(), t.getY(), t.getZ());
	}

	/**
	 * Divides the given array {@code (a)} by the current vector.
	 * The components for x, y and z are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 elements.
	 * This operation alters the current vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (a[0], a[1], a[2]) / v}
	 * 
	 * @param a The array to divide by the current vector. Minimum length: 3.
	 * 
	 * @return The current vector.
	 */
	default Vec3fC revDiv(float[] a)
	{
		return revDiv(a[COMP_X], a[COMP_Y], a[COMP_Z]);
	}
	
	/**
	 * Divides the given array {@code (a)} by the current vector.
	 * The indices for the components are given by the parameters. Therefore the array
	 * has to contain at least 1 element.
	 * This operation alters the current vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (a[indexX], a[indexY], a[indexZ]) / v}
	 * 
	 * @param indexX The index in the array for the x component.
	 * @param indexY The index in the array for the y component.
	 * @param indexZ The index in the array for the z component.
	 * @param a The array to divide by the current vector. Minimum length: 1.
	 * 
	 * @return The current vector.
	 */
	default Vec3fC revDiv(int indexX, int indexY, int indexZ, float[] a)
	{
		return revDiv(a[indexX], a[indexY], a[indexZ]);
	}
	
	/**
	 * Divides the given value {@code (value)} by the current vector.
	 * The value is divided by every component.
	 * This operation alters the current vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (value, value, value) / v}
	 * 
	 * @param value The value to divide by the current vector.
	 * 
	 * @return The current vector.
	 */
	default Vec3fC revDiv(float value)
	{
		return revDiv(value, value, value);
	}

	/**
	 * Divides the given tuple {@code (x, y, z)} by the current vector.
	 * This operation alters the current vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (x, y, z) / v}
	 * 
	 * @param x The value of the x component to divide by the current vector.
	 * @param y The value of the y component to divide by the current vector.
	 * @param z The value of the z component to divide by the current vector.
	 * 
	 * @return The current vector.
	 */
	Vec3fC revDiv(float x, float y, float z);

	/**
	 * Normalizes the current vector.
	 * Normalization is done by dividing the vector by its length (magnitude).
	 * This doesn't account for zero-length vectors {@code (x=y=z=0)} and will in such case throw an {@link ArithmeticException}
	 * as this would result in a division by zero.
	 * This operation alters the current vector.
	 * 
	 * <p>
	 * This function is intended to be used in situations where the vector by design cannot be of zero length.
	 * In that case calling this function will avoid the check for zero.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v / |v|}
	 * 
	 * @return The current vector.
	 * 
	 * @throws ArithmeticException Thrown when it is a zero-length vector.
	 */
	Vec3fC normalUnsafe();

	/**
	 * Normalizes the current vector.
	 * Normalization is done by dividing the vector by its length (magnitude).
	 * If the vector is a zero-length vector {@code (x=y=z=0)} the result will be a zero vector.
	 * It determines a length of zero by checking if all components are exactly zero.
	 * Due to floating-point-errors it might still throw an {@link ArithmeticException} when
	 * the length is too close to zero.
	 * This operation alters the current vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v / |v|}
	 * 
	 * @return The current vector.
	 * 
	 * @throws ArithmeticException Might be thrown when the length is to close to zero.
	 */
	Vec3fC normal();

	/**
	 * Normalizes the current vector.
	 * Normalization is done by dividing the vector by its length (magnitude).
	 * If the vector is a zero-length vector {@code (x=y=z=0)} the result will be a zero vector.
	 * It determines a zero-length by checking if all components are within the margin defined by
	 * zero plus-minus the given tolerance inclusive {@code (-tolerance <= value <= tolerance)}.
	 * This operation alters the current vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v / |v|}
	 * 
	 * @param tolerance The tolerance for defining the margin around zero.
	 * 
	 * @return The current vector.
	 */
	Vec3fC normal(float tolerance);

	/**
	 * Negates (inverts) the current vector.
	 * This operation alters the current vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code -v}
	 * 
	 * @return The current vector.
	 */
	Vec3fC negate();
	
	/**
	 * Calculates the inverse of the current vector.
	 * This operation alters the current vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code 1 - v}
	 * 
	 * @return The current vector.
	 */
	Vec3fC inverse();
	
	/**
	 * Calculates either the right or left handed cross product between this vector and the given tuple {@code (t)}.
	 * The handedness is determined by the implementation.
	 * This operation alters the current vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v X t}
	 * 
	 * <p>
	 * Definition:<br>
	 * In a standard right handed cartesian system there are the following relations between axis assuming a positive direction.
	 * Imagine looking in the desired direction and using the axis in counterclockwise order.
	 * In a left handed cartesian system the order is reversed and therefore clockwise.
	 * 
	 * <p>
	 * {@code forward(z) = right(x) X up(y)}<br>
	 * {@code up(y) = forward(z) X right(x)}<br>
	 * {@code right(x) = up(y) X forward(z)}
	 * 
	 * @param t The tuple to calculate the cross product with.
	 * 
	 * @return The current vector.
	 */
	default Vec3fC cross(Tup3fR t)
	{
		return cross(t.getX(), t.getY(), t.getZ());
	}
	
	/**
	 * Calculates either the right or left handed cross product between this vector and the given array {@code (a)}.
	 * The components for x, y and z are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 elements.
	 * The handedness is determined by the implementation.
	 * This operation alters the current vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v X (a[0], a[1], a[2])}
	 * 
	 * <p>
	 * Definition:<br>
	 * In a standard right handed cartesian system there are the following relations between axis assuming a positive direction.
	 * Imagine looking in the desired direction and using the axis in counterclockwise order.
	 * In a left handed cartesian system the order is reversed and therefore clockwise.
	 * 
	 * <p>
	 * {@code forward(z) = right(x) X up(y)}<br>
	 * {@code up(y) = forward(z) X right(x)}<br>
	 * {@code right(x) = up(y) X forward(z)}
	 * 
	 * @param a The array to calculate the cross product with. Minimum length: 3.
	 * 
	 * @return The current vector.
	 */
	default Vec3fC cross(float[] a)
	{
		return cross(a[COMP_X], a[COMP_Y], a[COMP_Z]);
	}
	
	/**
	 * Calculates either the right or left handed cross product between this vector and the given array {@code (a)}.
	 * The indices for the components are given by the parameters. Therefore the array
	 * has to contain at least 1 element.
	 * The handedness is determined by the implementation.
	 * This operation alters the current vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v X (a[indexX], a[indexY], a[indexZ])}
	 * 
	 * <p>
	 * Definition:<br>
	 * In a standard right handed cartesian system there are the following relations between axis assuming a positive direction.
	 * Imagine looking in the desired direction and using the axis in counterclockwise order.
	 * In a left handed cartesian system the order is reversed and therefore clockwise.
	 * 
	 * <p>
	 * {@code forward(z) = right(x) X up(y)}<br>
	 * {@code up(y) = forward(z) X right(x)}<br>
	 * {@code right(x) = up(y) X forward(z)}
	 * 
	 * @param indexX The index in the array for the x component.
	 * @param indexY The index in the array for the y component.
	 * @param indexZ The index in the array for the z component.
	 * @param a The array to calculate the cross product with. Minimum length: 1.
	 * 
	 * @return The current vector.
	 */
	default Vec3fC cross(int indexX, int indexY, int indexZ, float[] a)
	{
		return cross(a[indexX], a[indexY], a[indexZ]);
	}
	
	/**
	 * Calculates either the right or left handed cross product between this vector and the given value {@code (value)}.
	 * The value is seen as a tuple with all component values equal to it.
	 * The handedness is determined by the implementation.
	 * This operation alters the current vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v X (value, value, value)}
	 * 
	 * <p>
	 * Definition:<br>
	 * In a standard right handed cartesian system there are the following relations between axis assuming a positive direction.
	 * Imagine looking in the desired direction and using the axis in counterclockwise order.
	 * In a left handed cartesian system the order is reversed and therefore clockwise.
	 * 
	 * <p>
	 * {@code forward(z) = right(x) X up(y)}<br>
	 * {@code up(y) = forward(z) X right(x)}<br>
	 * {@code right(x) = up(y) X forward(z)}
	 * 
	 * @param value The value to calculate the cross product with.
	 * 
	 * @return The current vector.
	 */
	default Vec3fC cross(float value)
	{
		return cross(value, value, value);
	}
	
	/**
	 * Calculates either the right or left handed cross product between this vector and the given tuple {@code (x, y, z)}.
	 * The handedness is determined by the implementation.
	 * This operation alters the current vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v X (x, y, z)}
	 * 
	 * <p>
	 * Definition:<br>
	 * In a standard right handed cartesian system there are the following relations between axis assuming a positive direction.
	 * Imagine looking in the desired direction and using the axis in counterclockwise order.
	 * In a left handed cartesian system the order is reversed and therefore clockwise.
	 * 
	 * <p>
	 * {@code forward(z) = right(x) X up(y)}<br>
	 * {@code up(y) = forward(z) X right(x)}<br>
	 * {@code right(x) = up(y) X forward(z)}
	 * 
	 * @param x The value of the x component to calculate the cross product with.
	 * @param y The value of the y component to calculate the cross product with.
	 * @param z The value of the z component to calculate the cross product with.
	 * 
	 * @return The current vector.
	 */
	Vec3fC cross(float x, float y, float z);
	
	/**
	 * Calculates either the right or left handed cross product between this vector and the given tuple {@code (t)}.
	 * The handedness is determined by the parameter {@code rightHanded}.
	 * This operation alters the current vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v X t}
	 * 
	 * <p>
	 * Definition:<br>
	 * In a standard right handed cartesian system there are the following relations between axis assuming a positive direction.
	 * Imagine looking in the desired direction and using the axis in counterclockwise order.
	 * In a left handed cartesian system the order is reversed and therefore clockwise.
	 * 
	 * <p>
	 * {@code forward(z) = right(x) X up(y)}<br>
	 * {@code up(y) = forward(z) X right(x)}<br>
	 * {@code right(x) = up(y) X forward(z)}
	 * 
	 * @param t The tuple to calculate the cross product with.
	 * @param rightHanded Specifies that the operation should be right handed if true. Left handed otherwise.
	 * 
	 * @return The current vector.
	 */
	default Vec3fC cross(Tup3fR t, boolean rightHanded)
	{
		return cross(t.getX(), t.getY(), t.getZ(), rightHanded);
	}
	
	/**
	 * Calculates either the right or left handed cross product between this vector and the given array {@code (a)}.
	 * The components for x, y and z are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 elements.
	 * The handedness is determined by the parameter {@code rightHanded}.
	 * This operation alters the current vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v X (a[0], a[1], a[2])}
	 * 
	 * <p>
	 * Definition:<br>
	 * In a standard right handed cartesian system there are the following relations between axis assuming a positive direction.
	 * Imagine looking in the desired direction and using the axis in counterclockwise order.
	 * In a left handed cartesian system the order is reversed and therefore clockwise.
	 * 
	 * <p>
	 * {@code forward(z) = right(x) X up(y)}<br>
	 * {@code up(y) = forward(z) X right(x)}<br>
	 * {@code right(x) = up(y) X forward(z)}
	 * 
	 * @param a The array to calculate the cross product with. Minimum length: 3.
	 * @param rightHanded Specifies that the operation should be right handed if true. Left handed otherwise.
	 * 
	 * @return The current vector.
	 */
	default Vec3fC cross(float[] a, boolean rightHanded)
	{
		return cross(a[COMP_X], a[COMP_Y], a[COMP_Z], rightHanded);
	}
	
	/**
	 * Calculates either the right or left handed cross product between this vector and the given array {@code (a)}.
	 * The indices for the components are given by the parameters. Therefore the array
	 * has to contain at least 1 element.
	 * The handedness is determined by the parameter {@code rightHanded}.
	 * This operation alters the current vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v X (a[indexX], a[indexY], a[indexZ])}
	 * 
	 * <p>
	 * Definition:<br>
	 * In a standard right handed cartesian system there are the following relations between axis assuming a positive direction.
	 * Imagine looking in the desired direction and using the axis in counterclockwise order.
	 * In a left handed cartesian system the order is reversed and therefore clockwise.
	 * 
	 * <p>
	 * {@code forward(z) = right(x) X up(y)}<br>
	 * {@code up(y) = forward(z) X right(x)}<br>
	 * {@code right(x) = up(y) X forward(z)}
	 * 
	 * @param indexX The index in the array for the x component.
	 * @param indexY The index in the array for the y component.
	 * @param indexZ The index in the array for the z component.
	 * @param a The array to calculate the cross product with. Minimum length: 1.
	 * @param rightHanded Specifies that the operation should be right handed if true. Left handed otherwise.
	 * 
	 * @return The current vector.
	 */
	default Vec3fC cross(int indexX, int indexY, int indexZ, float[] a, boolean rightHanded)
	{
		return cross(a[indexX], a[indexY], a[indexZ], rightHanded);
	}
	
	/**
	 * Calculates either the right or left handed cross product between this vector and the given value {@code (value)}.
	 * The value is seen as a tuple with all component values equal to it.
	 * The handedness is determined by the parameter {@code rightHanded}.
	 * This operation alters the current vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v X (value, value, value)}
	 * 
	 * <p>
	 * Definition:<br>
	 * In a standard right handed cartesian system there are the following relations between axis assuming a positive direction.
	 * Imagine looking in the desired direction and using the axis in counterclockwise order.
	 * In a left handed cartesian system the order is reversed and therefore clockwise.
	 * 
	 * <p>
	 * {@code forward(z) = right(x) X up(y)}<br>
	 * {@code up(y) = forward(z) X right(x)}<br>
	 * {@code right(x) = up(y) X forward(z)}
	 * 
	 * @param value The value to calculate the cross product with.
	 * @param rightHanded Specifies that the operation should be right handed if true. Left handed otherwise.
	 * 
	 * @return The current vector.
	 */
	default Vec3fC cross(float value, boolean rightHanded)
	{
		return cross(value, value, value, rightHanded);
	}
	
	/**
	 * Calculates either the right or left handed cross product between this vector and the given tuple {@code (x, y, z)}.
	 * The handedness is determined by the parameter {@code rightHanded}.
	 * This operation alters the current vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v X (x, y, z)}
	 * 
	 * <p>
	 * Definition:<br>
	 * In a standard right handed cartesian system there are the following relations between axis assuming a positive direction.
	 * Imagine looking in the desired direction and using the axis in counterclockwise order.
	 * In a left handed cartesian system the order is reversed and therefore clockwise.
	 * 
	 * <p>
	 * {@code forward(z) = right(x) X up(y)}<br>
	 * {@code up(y) = forward(z) X right(x)}<br>
	 * {@code right(x) = up(y) X forward(z)}
	 * 
	 * @param x The value of the x component to calculate the cross product with.
	 * @param y The value of the y component to calculate the cross product with.
	 * @param z The value of the z component to calculate the cross product with.
	 * @param rightHanded Specifies that the operation should be right handed if true. Left handed otherwise.
	 * 
	 * @return The current vector.
	 */
	Vec3fC cross(float x, float y, float z, boolean rightHanded);
	
	/**
	 * Calculates the right handed cross product between this vector and the given tuple {@code (t)}.
	 * This operation alters the current vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v X t}
	 * 
	 * <p>
	 * Definition:<br>
	 * In a standard right handed cartesian system there are the following relations between axis assuming a positive direction.
	 * Imagine looking in the desired direction and using the axis in counterclockwise order.
	 * 
	 * <p>
	 * {@code forward(z) = right(x) X up(y)}<br>
	 * {@code up(y) = forward(z) X right(x)}<br>
	 * {@code right(x) = up(y) X forward(z)}
	 * 
	 * @param t The tuple to calculate the cross product with.
	 * 
	 * @return The current vector.
	 */
	default Vec3fC crossRH(Tup3fR t)
	{
		return crossRH(t.getX(), t.getY(), t.getZ());
	}
	
	/**
	 * Calculates the right handed cross product between this vector and the given array {@code (a)}.
	 * The components for x, y and z are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 elements.
	 * This operation alters the current vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v X (a[0], a[1], a[2])}
	 * 
	 * <p>
	 * Definition:<br>
	 * In a standard right handed cartesian system there are the following relations between axis assuming a positive direction.
	 * Imagine looking in the desired direction and using the axis in counterclockwise order.
	 * 
	 * <p>
	 * {@code forward(z) = right(x) X up(y)}<br>
	 * {@code up(y) = forward(z) X right(x)}<br>
	 * {@code right(x) = up(y) X forward(z)}
	 * 
	 * @param a The array to calculate the cross product with. Minimum length: 3.
	 * 
	 * @return The current vector.
	 */
	default Vec3fC crossRH(float[] a)
	{
		return crossRH(a[COMP_X], a[COMP_Y], a[COMP_Z]);
	}
	
	/**
	 * Calculates the right handed cross product between this vector and the given array {@code (a)}.
	 * The indices for the components are given by the parameters. Therefore the array
	 * has to contain at least 1 element.
	 * This operation alters the current vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v X (a[indexX], a[indexY], a[indexZ])}
	 * 
	 * <p>
	 * Definition:<br>
	 * In a standard right handed cartesian system there are the following relations between axis assuming a positive direction.
	 * Imagine looking in the desired direction and using the axis in counterclockwise order.
	 * 
	 * <p>
	 * {@code forward(z) = right(x) X up(y)}<br>
	 * {@code up(y) = forward(z) X right(x)}<br>
	 * {@code right(x) = up(y) X forward(z)}
	 * 
	 * @param indexX The index in the array for the x component.
	 * @param indexY The index in the array for the y component.
	 * @param indexZ The index in the array for the z component.
	 * @param a The array to calculate the cross product with. Minimum length: 1.
	 * 
	 * @return The current vector.
	 */
	default Vec3fC crossRH(int indexX, int indexY, int indexZ, float[] a)
	{
		return crossRH(a[indexX], a[indexY], a[indexZ]);
	}
	
	/**
	 * Calculates the right handed cross product between this vector and the given value {@code (value)}.
	 * The value is seen as a tuple with all component values equal to it.
	 * This operation alters the current vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v X (value, value, value)}
	 * 
	 * <p>
	 * Definition:<br>
	 * In a standard right handed cartesian system there are the following relations between axis assuming a positive direction.
	 * Imagine looking in the desired direction and using the axis in counterclockwise order.
	 * 
	 * <p>
	 * {@code forward(z) = right(x) X up(y)}<br>
	 * {@code up(y) = forward(z) X right(x)}<br>
	 * {@code right(x) = up(y) X forward(z)}
	 * 
	 * @param value The value to calculate the cross product with.
	 * 
	 * @return The current vector.
	 */
	default Vec3fC crossRH(float value)
	{
		return crossRH(value, value, value);
	}
	
	/**
	 * Calculates the right handed cross product between this vector and the given tuple {@code (x, y, z)}.
	 * This operation alters the current vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v X (x, y, z)}
	 * 
	 * <p>
	 * Definition:<br>
	 * In a standard right handed cartesian system there are the following relations between axis assuming a positive direction.
	 * Imagine looking in the desired direction and using the axis in counterclockwise order.
	 * 
	 * <p>
	 * {@code forward(z) = right(x) X up(y)}<br>
	 * {@code up(y) = forward(z) X right(x)}<br>
	 * {@code right(x) = up(y) X forward(z)}
	 * 
	 * @param x The value of the x component to calculate the cross product with.
	 * @param y The value of the y component to calculate the cross product with.
	 * @param z The value of the z component to calculate the cross product with.
	 * 
	 * @return The current vector.
	 */
	Vec3fC crossRH(float x, float y, float z);
	
	/**
	 * Calculates the left handed cross product between this vector and the given tuple {@code (t)}.
	 * This operation alters the current vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code t X v}
	 * 
	 * <p>
	 * Definition:<br>
	 * In a left handed cartesian system there are the following relations between axis assuming a positive direction.
	 * Imagine looking in the desired direction and using the axis in clockwise order.
	 * 
	 * <p>
	 * {@code forward(z) = up(y) X right(x)}<br>
	 * {@code up(y) = right(x) X forward(z)}<br>
	 * {@code right(x) = forward(z) X up(y)}
	 * 
	 * @param t The tuple to calculate the cross product with.
	 * 
	 * @return The current vector.
	 */
	default Vec3fC crossLH(Tup3fR t)
	{
		return crossLH(t.getX(), t.getY(), t.getZ());
	}
	
	/**
	 * Calculates the left handed cross product between this vector and the given array {@code (a)}.
	 * The components for x, y and z are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 elements.
	 * This operation alters the current vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (a[0], a[1], a[2]) X v}
	 * 
	 * <p>
	 * Definition:<br>
	 * In a left handed cartesian system there are the following relations between axis assuming a positive direction.
	 * Imagine looking in the desired direction and using the axis in clockwise order.
	 * 
	 * <p>
	 * {@code forward(z) = up(y) X right(x)}<br>
	 * {@code up(y) = right(x) X forward(z)}<br>
	 * {@code right(x) = forward(z) X up(y)}
	 * 
	 * @param a The array to calculate the cross product with. Minimum length: 3.
	 * 
	 * @return The current vector.
	 */
	default Vec3fC crossLH(float[] a)
	{
		return crossLH(a[COMP_X], a[COMP_Y], a[COMP_Z]);
	}
	
	/**
	 * Calculates the left handed cross product between this vector and the given array {@code (a)}.
	 * The indices for the components are given by the parameters. Therefore the array
	 * has to contain at least 1 element.
	 * This operation alters the current vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (a[indexX], a[indexY], a[indexZ]) X v}
	 * 
	 * <p>
	 * Definition:<br>
	 * In a left handed cartesian system there are the following relations between axis assuming a positive direction.
	 * Imagine looking in the desired direction and using the axis in clockwise order.
	 * 
	 * <p>
	 * {@code forward(z) = up(y) X right(x)}<br>
	 * {@code up(y) = right(x) X forward(z)}<br>
	 * {@code right(x) = forward(z) X up(y)}
	 * 
	 * @param indexX The index in the array for the x component.
	 * @param indexY The index in the array for the y component.
	 * @param indexZ The index in the array for the z component.
	 * @param a The array to calculate the cross product with. Minimum length: 1.
	 * 
	 * @return The current vector.
	 */
	default Vec3fC crossLH(int indexX, int indexY, int indexZ, float[] a)
	{
		return crossLH(a[indexX], a[indexY], a[indexZ]);
	}
	
	/**
	 * Calculates the left handed cross product between this vector and the given value {@code (value)}.
	 * The value is seen as a tuple with all component values equal to it.
	 * This operation alters the current vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (value, value, value) X v}
	 * 
	 * <p>
	 * Definition:<br>
	 * In a left handed cartesian system there are the following relations between axis assuming a positive direction.
	 * Imagine looking in the desired direction and using the axis in clockwise order.
	 * 
	 * <p>
	 * {@code forward(z) = up(y) X right(x)}<br>
	 * {@code up(y) = right(x) X forward(z)}<br>
	 * {@code right(x) = forward(z) X up(y)}
	 * 
	 * @param value The value to calculate the cross product with.
	 * 
	 * @return The current vector.
	 */
	default Vec3fC crossLH(float value)
	{
		return crossLH(value, value, value);
	}
	
	/**
	 * Calculates the left handed cross product between this vector and the given tuple {@code (x, y, z)}.
	 * This operation alters the current vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (x, y, z) X v}
	 * 
	 * <p>
	 * Definition:<br>
	 * In a left handed cartesian system there are the following relations between axis assuming a positive direction.
	 * Imagine looking in the desired direction and using the axis in clockwise order.
	 * 
	 * <p>
	 * {@code forward(z) = up(y) X right(x)}<br>
	 * {@code up(y) = right(x) X forward(z)}<br>
	 * {@code right(x) = forward(z) X up(y)}
	 * 
	 * @param x The value of the x component to calculate the cross product with.
	 * @param y The value of the y component to calculate the cross product with.
	 * @param z The value of the z component to calculate the cross product with.
	 * 
	 * @return The current vector.
	 */
	Vec3fC crossLH(float x, float y, float z);
	
	/**
	 * Calculates the absolute values of all components of the current vector.
	 * This operation alters the current vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (|v.x|, |v.y|, |v.z|)}
	 * 
	 * @return The current vector.
	 */
	Vec3fC abs();
	
	/**
	 * Rounds all components down to the next integer closer to negative infinity.
	 * This operation alters the current vector.
	 * 
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
	 * Sets the vector to the signums {@code (+1.0f, -1.0f)} of the components.
	 * This operation alters the current vector.
	 * 
	 * @return The current vector.
	 */
	Vec3fC signum();
	
	/**
	 * Applies the given matrix to the current vector and therefore transforming it.
	 * This operation alters the current vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code m * v}
	 * 
	 * @param m The matrix to apply.
	 * 
	 * @return The current vector.
	 */
	Vec3fC transform(Mat4fR m);
	
	/**
	 * Sets the vector to the componentwise minimum values of the current vector and the given tuple {@code (t)}.
	 * Therefore it uses for each component the smaller value of either the current vector or the tuple.
	 * This operation alters the current vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (min(v.x, t.x), min(v.y, t.y), min(v.z, t.z))}
	 * 
	 * @param t The other tuple.
	 * 
	 * @return The current vector.
	 */
	default Vec3fC min(Tup3fR t)
	{
		return min(t.getX(), t.getY(), t.getZ());
	}
	
	/**
	 * Sets the vector to the componentwise minimum values of the current vector and the given array {@code (a)}.
	 * Therefore it uses for each component the smaller value of either the current vector or the array.
	 * The components for x, y and z are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 elements.
	 * This operation alters the current vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (min(v.x, a[0]), min(v.y, a[1]), min(v.z, a[2]))}
	 * 
	 * @param a The other array. Minimum length: 3.
	 * 
	 * @return The current vector.
	 */
	default Vec3fC min(float[] a)
	{
		return min(a[COMP_X], a[COMP_Y], a[COMP_Z]);
	}
	
	/**
	 * Sets the vector to the componentwise minimum values of the current vector and the given array {@code (a)}.
	 * Therefore it uses for each component the smaller value of either the current vector or the array.
	 * The indices for the components are given by the parameters. Therefore the array
	 * has to contain at least 1 element.
	 * This operation alters the current vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (min(v.x, a[indexX]), min(v.y, a[indexY]), min(v.z, a[indexZ]))}
	 * 
	 * @param indexX The index in the array for the x component.
	 * @param indexY The index in the array for the y component.
	 * @param indexZ The index in the array for the z component.
	 * @param a The other array. Minimum length: 1.
	 * 
	 * @return The current vector.
	 */
	default Vec3fC min(int indexX, int indexY, int indexZ, float[] a)
	{
		return min(a[indexX], a[indexY], a[indexZ]);
	}
	
	/**
	 * Sets the vector to the componentwise minimum values of the current vector and the given value {@code (value)}.
	 * Therefore it uses for each component the smaller value of either the current vector or the value.
	 * This operation alters the current vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (min(v.x, value), min(v.y, value), min(v.z, value))}
	 * 
	 * @param value The other value.
	 * 
	 * @return The current vector.
	 */
	default Vec3fC min(float value)
	{
		return min(value, value, value);
	}
	
	/**
	 * Sets the vector to the componentwise minimum values of the current vector and the given tuple {@code (x, y, z)}.
	 * Therefore it uses for each component the smaller value of either the current vector or the tuple.
	 * This operation alters the current vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (min(v.x, x), min(v.y, y), min(v.z, z))}
	 * 
	 * @param x The value of the x component of the tuple.
	 * @param y The value of the y component of the tuple.
	 * @param z The value of the z component of the tuple.
	 * 
	 * @return The current vector.
	 */
	Vec3fC min(float x, float y, float z);
	
	/**
	 * Sets the vector to the componentwise maximum values of the current vector and the given tuple {@code (t)}.
	 * Therefore it uses for each component the greater value of either the current vector or the tuple.
	 * This operation alters the current vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (max(v.x, t.x), max(v.y, t.y), max(v.z, t.z))}
	 * 
	 * @param t The other tuple.
	 * 
	 * @return The current vector.
	 */
	default Vec3fC max(Tup3fR t)
	{
		return max(t.getX(), t.getY(), t.getZ());
	}
	
	/**
	 * Sets the vector to the componentwise maximum values of the current vector and the given array {@code (a)}.
	 * Therefore it uses for each component the greater value of either the current vector or the array.
	 * The components for x, y and z are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 elements.
	 * This operation alters the current vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (max(v.x, a[0]), max(v.y, a[1]), max(v.z, a[2]))}
	 * 
	 * @param a The other array. Minimum length: 3.
	 * 
	 * @return The current vector.
	 */
	default Vec3fC max(float[] a)
	{
		return max(a[COMP_X], a[COMP_Y], a[COMP_Z]);
	}
	
	/**
	 * Sets the vector to the componentwise maximum values of the current vector and the given array {@code (a)}.
	 * Therefore it uses for each component the greater value of either the current vector or the array.
	 * The indices for the components are given by the parameters. Therefore the array
	 * has to contain at least 1 element.
	 * This operation alters the current vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (max(v.x, a[indexX]), max(v.y, a[indexY]), max(v.z, a[indexZ]))}
	 * 
	 * @param indexX The index in the array for the x component.
	 * @param indexY The index in the array for the y component.
	 * @param indexZ The index in the array for the z component.
	 * @param a The other array. Minimum length: 1.
	 * 
	 * @return The current vector.
	 */
	default Vec3fC max(int indexX, int indexY, int indexZ, float[] a)
	{
		return max(a[indexX], a[indexY], a[indexZ]);
	}
	
	/**
	 * Sets the vector to the componentwise maximum values of the current vector and the given value {@code (value)}.
	 * Therefore it uses for each component the greater value of either the current vector or the value.
	 * This operation alters the current vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (max(v.x, value), max(v.y, value), max(v.z, value))}
	 * 
	 * @param value The other value.
	 * 
	 * @return The current vector.
	 */
	default Vec3fC max(float value)
	{
		return max(value, value, value);
	}
	
	/**
	 * Sets the vector to the componentwise maximum values of the current vector and the given tuple {@code (x, y, z)}.
	 * Therefore it uses for each component the greater value of either the current vector or the tuple.
	 * This operation alters the current vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (max(v.x, x), max(v.y, y), max(v.z, z))}
	 * 
	 * @param x The value of the x component of the tuple.
	 * @param y The value of the y component of the tuple.
	 * @param z The value of the z component of the tuple.
	 * 
	 * @return The current vector.
	 */
	Vec3fC max(float x, float y, float z);
	
	/**
	 * Interpolates between the current vector and the given tuple {@code (t)} by the factor of {@code alpha}.
	 * This operation alters the current vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v * (1-alpha) + t * alpha}
	 * 
	 * @param t The other tuple.
	 * @param alpha The factor for the interpolation in range of {@code 0.0f-1.0f}.
	 * 
	 * @return The current vector.
	 */
	default Vec3fC lerp(Tup3fR t, float alpha)
	{
		return lerp(t.getX(), t.getY(), t.getZ(), alpha);
	}
	
	/**
	 * Interpolates between the current vector and the given array {@code (a)} by the factor of {@code alpha}.
	 * The components for x, y and z are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 elements.
	 * This operation alters the current vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v * (1-alpha) + (a[0], a[1], a[2]) * alpha}
	 * 
	 * @param a The other array. Minimum length: 3.
	 * @param alpha The factor for the interpolation in range of {@code 0.0f-1.0f}.
	 * 
	 * @return The current vector.
	 */
	default Vec3fC lerp(float[] a, float alpha)
	{
		return lerp(a[COMP_X], a[COMP_Y], a[COMP_Z], alpha);
	}
	
	 /**
	 * Interpolates between the current vector and the given array {@code (a)} by the factor of {@code alpha}.
	 * The indices for the components are given by the parameters. Therefore the array
	 * has to contain at least 1 element.
	 * This operation alters the current vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v * (1-alpha) + (a[indexX], a[indexY], a[indexZ]) * alpha}
	 * 
	 * @param indexX The index in the array for the x component.
	 * @param indexY The index in the array for the y component.
	 * @param indexZ The index in the array for the z component.
	 * @param a The other array. Minimum length: 1.
	 * @param alpha The factor for the interpolation in range of {@code 0.0f-1.0f}.
	 * 
	 * @return The current vector.
	 */
	default Vec3fC lerp(int indexX, int indexY, int indexZ, float[] a, float alpha)
	{
		return lerp(a[indexX], a[indexY], a[indexZ], alpha);
	}
	 
	/**
	 * Interpolates between the current vector and the given value {@code (value)} by the factor of {@code alpha}.
	 * This operation alters the current vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v * (1-alpha) + (value, value, value) * alpha}
	 * 
	 * @param value The other value.
	 * @param alpha The factor for the interpolation in range of {@code 0.0f-1.0f}.
	 * 
	 * @return The current vector.
	 */
	default Vec3fC lerp(float value, float alpha)
	{
		return lerp(value, value, value, alpha);
	}
	
	/**
	 * Interpolates between the current vector and the given tuple {@code (x, y, z)} by the factor of {@code alpha}.
	 * This operation alters the current vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v * (1-alpha) + (x, y, z) * alpha}
	 * 
	 * @param x The value of the x component of the tuple.
	 * @param y The value of the y component of the tuple.
	 * @param z The value of the z component of the tuple.
	 * @param alpha The factor for the interpolation in range of {@code 0.0f-1.0f}.
	 * 
	 * @return The current vector.
	 */
	Vec3fC lerp(float x, float y, float z, float alpha);
	
	/**
	 * Scales the given tuple {@code (t)} by the factor {@code alpha}, adds it to the current vector.
	 * This is useful for example for adding a velocity vector that is interpolated over a timeframe.
	 * This operation alters the current vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v + t * alpha}.
	 * 
	 * @param t The other tuple.
	 * @param alpha The factor for the interpolation in range of {@code 0.0f-1.0f}.
	 * 
	 * @return The current vector.
	 */
	default Vec3fC lerpAdd(Tup3fR t, float alpha)
	{
		return lerpAdd(t.getX(), t.getY(), t.getZ(), alpha);
	}
	
	/**
	 * Scales the given array {@code (a)} by the factor {@code alpha}, adds it to the current vector.
	 * This is useful for example for adding a velocity vector that is interpolated over a timeframe.
	 * The components for x, y and z are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 elements.
	 * This operation alters the current vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v + (a[0], a[1], a[2]) * alpha}.
	 * 
	 * @param a The other array. Minimum length: 3.
	 * @param alpha The factor for the interpolation in range of {@code 0.0f-1.0f}.
	 * 
	 * @return The current vector.
	 */
	default Vec3fC lerpAdd(float[] a, float alpha)
	{
		return lerpAdd(a[COMP_X], a[COMP_Y], a[COMP_Z], alpha);
	}
	
	/**
	 * Scales the given array {@code (a)} by the factor {@code alpha}, adds it to the current vector.
	 * This is useful for example for adding a velocity vector that is interpolated over a timeframe.
	 * The indices for the components are given by the parameters. Therefore the array
	 * has to contain at least 1 element.
	 * This operation alters the current vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v + (a[indexX], a[indexY], a[indexZ]) * alpha}.
	 * 
	 * @param indexX The index in the array for the x component.
	 * @param indexY The index in the array for the y component.
	 * @param indexZ The index in the array for the z component.
	 * @param a The other array. Minimum length: 1.
	 * @param alpha The factor for the interpolation in range of {@code 0.0f-1.0f}.
	 * 
	 * @return The current vector.
	 */
	default Vec3fC lerpAdd(int indexX, int indexY, int indexZ, float[] a, float alpha)
	{
		return lerpAdd(a[indexX], a[indexY], a[indexZ], alpha);
	}
	
	/**
	 * Scales the given value {@code (value)} by the factor {@code alpha}, adds it to the current vector.
	 * This is useful for example for adding a velocity vector that is interpolated over a timeframe.
	 * This operation alters the current vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v + (value, value, value) * alpha}.
	 * 
	 * @param value The other value.
	 * @param alpha The factor for the interpolation in range of {@code 0.0f-1.0f}.
	 * 
	 * @return The current vector.
	 */
	default Vec3fC lerpAdd(float value, float alpha)
	{
		return lerpAdd(value, value, value, alpha);
	}
	
	/**
	 * Scales the given tuple {@code (x, y, z)} by the factor {@code alpha}, adds it to the current vector.
	 * This is useful for example for adding a velocity vector that is interpolated over a timeframe.
	 * This operation alters the current vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v + (x, y, z) * alpha}.
	 * 
	 * @param x The value of the x component of the tuple.
	 * @param y The value of the x component of the tuple.
	 * @param z The value of the x component of the tuple.
	 * @param alpha The factor for the interpolation in range of {@code 0.0f-1.0f}.
	 * 
	 * @return The current vector.
	 */
	Vec3fC lerpAdd(float x, float y, float z, float alpha);
	
	/**
	 * Rotates the current vector around the x axis by the given angle in radians.
	 * This operation alters the current vector.
	 * 
	 * @param angle The angle to rotate by in radians.
	 * 
	 * @return The current vector.
	 */
	Vec3fC rotateX(float angle);
	
	/**
	 * Rotates the current vector around the x axis by the given angle in degrees.
	 * This operation alters the current vector.
	 * 
	 * @param angle The angle to rotate by in degrees.
	 * 
	 * @return The current vector.
	 */
	Vec3fC rotateXDeg(float angle);
	
	/**
	 * Rotates the current vector around the y axis by the given angle in radians.
	 * This operation alters the current vector.
	 * 
	 * @param angle The angle to rotate by in radians.
	 * 
	 * @return The current vector.
	 */
	Vec3fC rotateY(float angle);
	
	/**
	 * Rotates the current vector around the y axis by the given angle in degrees.
	 * This operation alters the current vector.
	 * 
	 * @param angle The angle to rotate by in degrees.
	 * 
	 * @return The current vector.
	 */
	Vec3fC rotateYDeg(float angle);
	
	/**
	 * Rotates the current vector around the z axis by the given angle in radians.
	 * This operation alters the current vector.
	 * 
	 * @param angle The angle to rotate by in radians.
	 * 
	 * @return The current vector.
	 */
	Vec3fC rotateZ(float angle);
	
	/**
	 * Rotates the current vector around the z axis by the given angle in degrees.
	 * This operation alters the current vector.
	 * 
	 * @param angle The angle to rotate by in degrees.
	 * 
	 * @return The current vector.
	 */
	Vec3fC rotateZDeg(float angle);
	
	/**
	 * Rotates the current vector around the give tuple {@code (axis)} as axis and the given angle in radians.
	 * This operation alters the current vector.
	 * 
	 * @param axis The rotation axis.
	 * @param angle The angle to rotate by in radians.
	 * 
	 * @return The current vector.
	 */
	default Vec3fC rotate(Tup3fR axis, float angle)
	{
		return rotate(axis.getX(), axis.getY(), axis.getZ(), angle);
	}
	
	/**
	 * Rotates the current vector around the give array {@code (axis)} as axis and the given angle in radians.
	 * The components for x, y and z are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 elements.
	 * This operation alters the current vector.
	 * 
	 * @param axis The rotation axis. Minimum length: 3.
	 * @param angle The angle to rotate by in radians.
	 * 
	 * @return The current vector.
	 */
	default Vec3fC rotate(float[] axis, float angle)
	{
		return rotate(axis[0], axis[1], axis[2], angle);
	}
	
	/**
	 * Rotates the current vector around the give array {@code (axis)} as axis and the given angle in radians.
	 * The indices for the components are given by the parameters. Therefore the array
	 * has to contain at least 1 element.
	 * This operation alters the current vector.
	 * 
	 * @param indexX The index in the array for the x component.
	 * @param indexY The index in the array for the y component.
	 * @param indexZ The index in the array for the z component.
	 * @param axis The rotation axis. Minimum length: 1.
	 * @param angle The angle to rotate by in radians.
	 * 
	 * @return The current vector.
	 */
	default Vec3fC rotate(int indexX, int indexY, int indexZ, float[] axis, float angle)
	{
		return rotate(axis[indexX], axis[indexY], axis[indexZ], angle);
	}
	
	/**
	 * Rotates the current vector around the give tuple {@code (axisX, axisY, axisZ)} as axis and the given angle in radians.
	 * This operation alters the current vector.
	 * 
	 * @param axisX The value of the x component of the rotation axis.
	 * @param axisY The value of the y component of the rotation axis.
	 * @param axisZ The value of the z component of the rotation axis.
	 * @param angle The angle to rotate by in radians.
	 * 
	 * @return The current vector.
	 */
	Vec3fC rotate(float axisX, float axisY, float axisZ, float angle);
	
	/**
	 * Rotates the current vector around the give tuple {@code (axis)} as axis and the given angle in degrees.
	 * This operation alters the current vector.
	 * 
	 * @param axis The rotation axis.
	 * @param angle The angle to rotate by in degrees.
	 * 
	 * @return The current vector.
	 */
	default Vec3fC rotateDeg(Tup3fR axis, float angle)
	{
		return rotateDeg(axis.getX(), axis.getY(), axis.getZ(), angle);
	}
	
	/**
	 * Rotates the current vector around the give array {@code (axis)} as axis and the given angle in degrees.
	 * The components for x, y and z are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 elements.
	 * This operation alters the current vector.
	 * 
	 * @param axis The rotation axis. Minimum length: 3.
	 * @param angle The angle to rotate by in degrees.
	 * 
	 * @return The current vector.
	 */
	default Vec3fC rotateDeg(float[] axis, float angle)
	{
		return rotateDeg(axis[0], axis[1], axis[2], angle);
	}
	
	/**
	 * Rotates the current vector around the give array {@code (axis)} as axis and the given angle in degrees.
	 * The indices for the components are given by the parameters. Therefore the array
	 * has to contain at least 1 element.
	 * This operation alters the current vector.
	 * 
	 * @param indexX The index in the array for the x component.
	 * @param indexY The index in the array for the y component.
	 * @param indexZ The index in the array for the z component.
	 * @param axis The rotation axis. Minimum length: 1.
	 * @param angle The angle to rotate by in degrees.
	 * 
	 * @return The current vector.
	 */
	default Vec3fC rotateDeg(int indexX, int indexY, int indexZ, float[] axis, float angle)
	{
		return rotateDeg(axis[indexX], axis[indexY], axis[indexZ], angle);
	}
	
	/**
	 * Rotates the current vector around the give tuple {@code (axisX, axisY, axisZ)} as axis and the given angle in degrees.
	 * This operation alters the current vector.
	 * 
	 * @param axisX The value of the x component of the rotation axis.
	 * @param axisY The value of the y component of the rotation axis.
	 * @param axisZ The value of the z component of the rotation axis.
	 * @param angle The angle to rotate by in degrees.
	 * 
	 * @return The current vector.
	 */
	Vec3fC rotateDeg(float axisX, float axisY, float axisZ, float angle);
	
	/**
	 * Rotates the current vector by the given axis-angle and saves the result in a new instance.
	 * This operation alters the current vector.
	 * 
	 * @param aa The axis-angle to rotate by.
	 * 
	 * @return The current vector.
	 */
	Vec3fC rotate(AxisAngle3fR aa);
	
	/**
	 * Rotates the current vector by the given quaternion.
	 * This operation alters the current vector.
	 * 
	 * @param q The quaternion to rotate by.
	 * 
	 * @return The current vector.
	 */
	Vec3fC rotate(QuatfR q);
	
	/**{@inheritDoc} */
	@Override
	default Vec3fC addN(Tup3fR t)
	{
		return addN(t.getX(), t.getY(), t.getZ());
	}
	
	/**{@inheritDoc} */
	@Override
	default Vec3fC addN(float[] a)
	{
		return addN(a[COMP_X], a[COMP_Y], a[COMP_Z]);
	}
	
	/**{@inheritDoc} */
	@Override
	default Vec3fC addN(int indexX, int indexY, int indexZ, float[] a)
	{
		return addN(a[indexX], a[indexY], a[indexZ]);
	}
	
	/**{@inheritDoc} */
	@Override
	default Vec3fC addN(float value)
	{
		return addN(value, value, value);
	}
	
	/**{@inheritDoc} */
	@Override
	Vec3fC addN(float x, float y, float z);
	
	/**{@inheritDoc} */
	@Override
	default Vec3fC subN(Tup3fR t)
	{
		return subN(t.getX(), t.getY(), t.getZ());
	}
	
	/**{@inheritDoc} */
	@Override
	default Vec3fC subN(float[] a)
	{
		return subN(a[COMP_X], a[COMP_Y], a[COMP_Z]);
	}
	
	/**{@inheritDoc} */
	@Override
	default Vec3fC subN(int indexX, int indexY, int indexZ, float[] a)
	{
		return subN(a[indexX], a[indexY], a[indexZ]);
	}
	
	/**{@inheritDoc} */
	@Override
	default Vec3fC subN(float value)
	{
		return subN(value, value, value);
	}
	
	/**{@inheritDoc} */
	@Override
	Vec3fC subN(float x, float y, float z);
	
	/**{@inheritDoc} */
	@Override
	default Vec3fC revSubN(Tup3fR t)
	{
		return revSubN(t.getX(), t.getY(), t.getZ());
	}
	
	/**{@inheritDoc} */
	@Override
	default Vec3fC revSubN(float[] a)
	{
		return revSubN(a[COMP_X], a[COMP_Y], a[COMP_Z]);
	}
	
	/**{@inheritDoc} */
	@Override
	default Vec3fC revSubN(int indexX, int indexY, int indexZ, float[] a)
	{
		return revSubN(a[indexX], a[indexY], a[indexZ]);
	}
	
	/**{@inheritDoc} */
	@Override
	default Vec3fC revSubN(float value)
	{
		return revSubN(value, value, value);
	}
		
	/**{@inheritDoc} */
	@Override
	Vec3fC revSubN(float x, float y, float z);
	
	/**{@inheritDoc} */
	@Override
	default Vec3fC mulN(Tup3fR t)
	{
		return mulN(t.getX(), t.getY(), t.getZ());
	}
	
	/**{@inheritDoc} */
	@Override
	default Vec3fC mulN(float[] a)
	{
		return mulN(a[COMP_X], a[COMP_Y], a[COMP_Z]);
	}
	
	/**{@inheritDoc} */
	@Override
	default Vec3fC mulN(int indexX, int indexY, int indexZ, float[] a)
	{
		return mulN(a[indexX], a[indexY], a[indexZ]);
	}
	
	/**{@inheritDoc} */
	@Override
	default Vec3fC mulN(float value)
	{
		return mulN(value, value, value);
	}
	
	/**{@inheritDoc} */
	@Override
	Vec3fC mulN(float x, float y, float z);
	
	/**{@inheritDoc} */
	@Override
	default Vec3fC divN(Tup3fR t)
	{
		return divN(t.getX(), t.getY(), t.getZ());
	}
	
	/**{@inheritDoc} */
	@Override
	default Vec3fC divN(float[] a)
	{
		return divN(a[COMP_X], a[COMP_Y], a[COMP_Z]);
	}
	
	/**{@inheritDoc} */
	@Override
	default Vec3fC divN(int indexX, int indexY, int indexZ, float[] a)
	{
		return divN(a[indexX], a[indexY], a[indexZ]);
	}
	
	/**{@inheritDoc} */
	@Override
	default Vec3fC divN(float value)
	{
		return divN(value, value, value);
	}
	
	/**{@inheritDoc} */
	@Override
	Vec3fC divN(float x, float y, float z);

	/**{@inheritDoc} */
	@Override
	default Vec3fC revDivN(Tup3fR t)
	{
		return revDivN(t.getX(), t.getY(), t.getZ());
	}

	/**{@inheritDoc} */
	@Override
	default Vec3fC revDivN(float[] a)
	{
		return revDivN(a[COMP_X], a[COMP_Y], a[COMP_Z]);
	}
	
	/**{@inheritDoc} */
	@Override
	default Vec3fC revDivN(int indexX, int indexY, int indexZ, float[] a)
	{
		return revDivN(a[indexX], a[indexY], a[indexZ]);
	}
	
	/**{@inheritDoc} */
	@Override
	default Vec3fC revDivN(float value)
	{
		return revDivN(value, value, value);
	}

	/**{@inheritDoc} */
	@Override
	Vec3fC revDivN(float x, float y, float z);

	/**{@inheritDoc} */
	@Override
	Vec3fC normalUnsafeN();

	/**{@inheritDoc} */
	@Override
	Vec3fC normalN();

	/**{@inheritDoc} */
	@Override
	Vec3fC normalN(float tolerance);

	/**{@inheritDoc} */
	@Override
	Vec3fC negateN();
	
	/**{@inheritDoc} */
	@Override
	Vec3fC inverseN();
	
	/**{@inheritDoc} */
	@Override
	default Vec3fC crossN(Tup3fR t)
	{
		return crossN(t.getX(), t.getY(), t.getZ());
	}
	
	/**{@inheritDoc} */
	@Override
	default Vec3fC crossN(float[] a)
	{
		return crossN(a[COMP_X], a[COMP_Y], a[COMP_Z]);
	}
	
	/**{@inheritDoc} */
	@Override
	default Vec3fC crossN(int indexX, int indexY, int indexZ, float[] a)
	{
		return crossN(a[indexX], a[indexY], a[indexZ]);
	}
	
	/**{@inheritDoc} */
	@Override
	default Vec3fC crossN(float value)
	{
		return crossN(value, value, value);
	}
	
	/**{@inheritDoc} */
	@Override
	Vec3fC crossN(float x, float y, float z);
	
	/**{@inheritDoc} */
	@Override
	default Vec3fC crossN(Tup3fR t, boolean rightHanded)
	{
		return crossN(t.getX(), t.getY(), t.getZ(), rightHanded);
	}
	
	/**{@inheritDoc} */
	@Override
	default Vec3fC crossN(float[] a, boolean rightHanded)
	{
		return crossN(a[COMP_X], a[COMP_Y], a[COMP_Z], rightHanded);
	}
	
	/**{@inheritDoc} */
	@Override
	default Vec3fC crossN(int indexX, int indexY, int indexZ, float[] a, boolean rightHanded)
	{
		return crossN(a[indexX], a[indexY], a[indexZ], rightHanded);
	}
	
	/**{@inheritDoc} */
	@Override
	default Vec3fC crossN(float value, boolean rightHanded)
	{
		return crossN(value, value, value, rightHanded);
	}
	
	/**{@inheritDoc} */
	@Override
	Vec3fC crossN(float x, float y, float z, boolean rightHanded);
	
	/**{@inheritDoc} */
	@Override
	default Vec3fC crossRHN(Tup3fR t)
	{
		return crossRHN(t.getX(), t.getY(), t.getZ());
	}
	
	/**{@inheritDoc} */
	@Override
	default Vec3fC crossRHN(float[] a)
	{
		return crossRHN(a[COMP_X], a[COMP_Y], a[COMP_Z]);
	}
	
	/**{@inheritDoc} */
	@Override
	default Vec3fC crossRHN(int indexX, int indexY, int indexZ, float[] a)
	{
		return crossRHN(a[indexX], a[indexY], a[indexZ]);
	}
	
	/**{@inheritDoc} */
	@Override
	default Vec3fC crossRHN(float value)
	{
		return crossRHN(value, value, value);
	}
	
	/**{@inheritDoc} */
	@Override
	Vec3fC crossRHN(float x, float y, float z);
	
	/**{@inheritDoc} */
	@Override
	default Vec3fC crossLHN(Tup3fR t)
	{
		return crossLHN(t.getX(), t.getY(), t.getZ());
	}
	
	/**{@inheritDoc} */
	@Override
	default Vec3fC crossLHN(float[] a)
	{
		return crossLHN(a[COMP_X], a[COMP_Y], a[COMP_Z]);
	}
	
	/**{@inheritDoc} */
	@Override
	default Vec3fC crossLHN(int indexX, int indexY, int indexZ, float[] a)
	{
		return crossLHN(a[indexX], a[indexY], a[indexZ]);
	}
	
	/**{@inheritDoc} */
	@Override
	default Vec3fC crossLHN(float value)
	{
		return crossLHN(value, value, value);
	}
	
	/**{@inheritDoc} */
	@Override
	Vec3fC crossLHN(float x, float y, float z);
	
	/**{@inheritDoc} */
	@Override
	Vec3fC absN();
	
	/**{@inheritDoc} */
	@Override
	Vec3fC floorN();
	
	/**{@inheritDoc} */
	@Override
	Vec3fC ceilN();
	
	/**{@inheritDoc} */
	@Override
	Vec3fC roundN();
	
	/**{@inheritDoc} */
	@Override
	Vec3fC truncN();
	
	/**{@inheritDoc} */
	@Override
	Vec3fC signumN();
	
	/**{@inheritDoc} */
	@Override
	Vec3fC transformN(Mat4fR m);
	
	/**{@inheritDoc} */
	@Override
	default Vec3fC minN(Tup3fR t)
	{
		return minN(t.getX(), t.getY(), t.getZ());
	}
	
	/**{@inheritDoc} */
	@Override
	default Vec3fC minN(float[] a)
	{
		return minN(a[COMP_X], a[COMP_Y], a[COMP_Z]);
	}
	
	/**{@inheritDoc} */
	@Override
	default Vec3fC minN(int indexX, int indexY, int indexZ, float[] a)
	{
		return minN(a[indexX], a[indexY], a[indexZ]);
	}
	
	/**{@inheritDoc} */
	@Override
	default Vec3fC minN(float value)
	{
		return minN(value, value, value);
	}
	
	/**{@inheritDoc} */
	@Override
	Vec3fC minN(float x, float y, float z);
	
	/**{@inheritDoc} */
	@Override
	default Vec3fC maxN(Tup3fR t)
	{
		return maxN(t.getX(), t.getY(), t.getZ());
	}
	
	/**{@inheritDoc} */
	@Override
	default Vec3fC maxN(float[] a)
	{
		return maxN(a[COMP_X], a[COMP_Y], a[COMP_Z]);
	}
	
	/**{@inheritDoc} */
	@Override
	default Vec3fC maxN(int indexX, int indexY, int indexZ, float[] a)
	{
		return maxN(a[indexX], a[indexY], a[indexZ]);
	}
	
	/**{@inheritDoc} */
	@Override
	default Vec3fC maxN(float value)
	{
		return maxN(value, value, value);
	}
	
	/**{@inheritDoc} */
	@Override
	Vec3fC maxN(float x, float y, float z);
	
	/**{@inheritDoc} */
	@Override
	default Vec3fC lerpN(Tup3fR t, float alpha)
	{
		return lerpN(t.getX(), t.getY(), t.getZ(), alpha);
	}
	
	/**{@inheritDoc} */
	@Override
	default Vec3fC lerpN(float[] a, float alpha)
	{
		return lerpN(a[COMP_X], a[COMP_Y], a[COMP_Z], alpha);
	}
	
	/**{@inheritDoc} */
	@Override
	default Vec3fC lerpN(int indexX, int indexY, int indexZ, float[] a, float alpha)
	{
		return lerpN(a[indexX], a[indexY], a[indexZ], alpha);
	}
	 
	/**{@inheritDoc} */
	@Override
	default Vec3fC lerpN(float value, float alpha)
	{
		return lerpN(value, value, value, alpha);
	}
	
	/**{@inheritDoc} */
	@Override
	Vec3fC lerpN(float x, float y, float z, float alpha);
	
	/**{@inheritDoc} */
	@Override
	default Vec3fC lerpAddN(Tup3fR t, float alpha)
	{
		return lerpAddN(t.getX(), t.getY(), t.getZ(), alpha);
	}
	
	/**{@inheritDoc} */
	@Override
	default Vec3fC lerpAddN(float[] a, float alpha)
	{
		return lerpAddN(a[COMP_X], a[COMP_Y], a[COMP_Z], alpha);
	}
	
	/**{@inheritDoc} */
	@Override
	default Vec3fC lerpAddN(int indexX, int indexY, int indexZ, float[] a, float alpha)
	{
		return lerpAddN(a[indexX], a[indexY], a[indexZ], alpha);
	}
	
	/**{@inheritDoc} */
	@Override
	default Vec3fC lerpAddN(float value, float alpha)
	{
		return lerpAddN(value, value, value, alpha);
	}
	
	/**{@inheritDoc} */
	@Override
	Vec3fC lerpAddN(float x, float y, float z, float alpha);
	
	/**{@inheritDoc} */
	@Override
	Vec3fC rotateXN(float angle);
	
	/**{@inheritDoc} */
	@Override
	Vec3fC rotateXDegN(float angle);
	
	/**{@inheritDoc} */
	@Override
	Vec3fC rotateYN(float angle);
	
	/**{@inheritDoc} */
	@Override
	Vec3fC rotateYDegN(float angle);
	
	/**{@inheritDoc} */
	@Override
	Vec3fC rotateZN(float angle);
	
	/**{@inheritDoc} */
	@Override
	Vec3fC rotateZDegN(float angle);
	
	/**{@inheritDoc} */
	@Override
	default Vec3fC rotateN(Tup3fR axis, float angle)
	{
		return rotateN(axis.getX(), axis.getY(), axis.getZ(), angle);
	}
	
	/**{@inheritDoc} */
	@Override
	default Vec3fC rotateN(float[] axis, float angle)
	{
		return rotateN(axis[0], axis[1], axis[2], angle);
	}
	
	/**{@inheritDoc} */
	@Override
	default Vec3fC rotateN(int indexX, int indexY, int indexZ, float[] axis, float angle)
	{
		return rotateN(axis[indexX], axis[indexY], axis[indexZ], angle);
	}
	
	/**{@inheritDoc} */
	@Override
	Vec3fC rotateN(float axisX, float axisY, float axisZ, float angle);
	
	/**{@inheritDoc} */
	@Override
	default Vec3fC rotateDegN(Tup3fR axis, float angle)
	{
		return rotateDegN(axis.getX(), axis.getY(), axis.getZ(), angle);
	}
	
	/**{@inheritDoc} */
	@Override
	default Vec3fC rotateDegN(float[] axis, float angle)
	{
		return rotateDegN(axis[0], axis[1], axis[2], angle);
	}
	
	/**{@inheritDoc} */
	@Override
	default Vec3fC rotateDegN(int indexX, int indexY, int indexZ, float[] axis, float angle)
	{
		return rotateDegN(axis[indexX], axis[indexY], axis[indexZ], angle);
	}
	
	/**{@inheritDoc} */
	@Override
	Vec3fC rotateDegN(float axisX, float axisY, float axisZ, float angle);
	
	/**{@inheritDoc} */
	@Override
	Vec3fC rotateN(AxisAngle3fR aa);
	
	/**{@inheritDoc} */
	@Override
	Vec3fC rotateN(QuatfR q);
}
