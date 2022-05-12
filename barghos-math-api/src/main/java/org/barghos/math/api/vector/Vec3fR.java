package org.barghos.math.api.vector;

import static org.barghos.core.api.tuple.TupleConstants.*;

import org.barghos.core.api.tuple3.Tup3fR;
import org.barghos.core.api.tuple2.Tup2oC;
import org.barghos.core.api.tuple2.Tup2oR;
import org.barghos.core.api.util.ExtractParam;
import org.barghos.math.api.matrix.Mat4fR;
import org.barghos.math.api.model.AxisAngle3fR;

/**
 * This interface grants readonly access to any 3-dimensional float vector.
 * 
 * <p>
 * It should be prefered by design before direct usage of a type in method parameters,
 * if the method only reads data from the parameter.
 * 
 * @author picatrix1899
 */
public interface Vec3fR extends Tup3fR, Cloneable
{
	/**
	 * @return A new instance of the current vector with the same component values.
	 */
	Vec3fR clone();
	
	/**
	 * Returns the inverse length (inverse magnitude) of the current vector.
	 * This does not account for zero vectors {@code (x=y=z=0)} and will in such case throw an {@link ArithmeticException}
	 * as this would result in a division by zero.
	 * 
	 * <p>
	 * This function is intended to be used in situations where the vector by design cannot be of zero length.
	 * In that case calling this function will avoid the check for zero.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code 1 / |v|}
	 * 
	 * @return The inverse length (inverse magnitude) of the current vector.
	 * 
	 * @throws
	 * ArithmeticException Thrown when the current vector is a zero vector.
	 */
	float inverseLengthUnsafe();
	
	/**
	 * Returns the inverse length (inverse magnitude) of the current vector.
	 * If the vector is a zero vector {@code (x=y=z=0)} the result will be zero.
	 * It assumes the current vector to be a zero vector if all components are exactly zero.
	 * Due to floating-point-errors it might still throw an {@link ArithmeticException} when
	 * the length is too close to zero.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code 1 / |v|}
	 * 
	 * @return The inverse length (inverse magnitude) of the current vector or zero if it is a zero vector {@code (x=y=z=0)}.
	 * 
	 * @throws
	 * ArithmeticException Might be thrown when the length is to close to zero.
	 */
	float inverseLength();
	
	/**
	 * Returns the inverse length (inverse magnitude) of the current vector.
	 * If the vector is a zero vector {@code (x=y=z=0)} the result will be zero.
	 * It assumes the current vector to be a zero vector if all components are inclusivly within the margin defined by
	 * zero plus-minus the given tolerance {@code (-tolerance <= value <= tolerance or [-tolerance,tolerance])}.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code 1 / |v|}
	 * 
	 * @param tolerance The tolerance for defining the margin around zero.
	 * 
	 * @return The inverse length (inverse magnitude) of the current vector or zero if it is a zero vector {@code (x=y=z=0)}.
	 */
	float inverseLength(float tolerance);
	
	/**
	 * Returns the length (magnitude) of the current vector.
	 * This does not account for zero vectors {@code (x=y=z=0)}.
	 * 
	 * <p>
	 * This function is intended to be used in situations where the vector by design cannot be of zero length.
	 * In that case calling this function will avoid the check for zero.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |v|}
	 * 
	 * @return The length (magnitude) of the current vector.
	 */
	float lengthUnsafe();
	
	/**
	 * Returns the length (magnitude) of the current vector.
	 * If the vector is a zero vector {@code (x=y=z=0)} the result will be zero.
	 * It assumes the current vector to be a zero vector if all components are exactly zero.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |v|}
	 * 
	 * @return The length (magnitude) of the current vector or zero if it is a zero vector {@code (x=y=z=0)}.
	 */
	float length();
	
	/**
	 * Returns the length (magnitude) of the current vector.
	 * If the vector is a zero vector {@code (x=y=z=0)} the result will be zero.
	 * It assumes the current vector to be a zero vector if all components are inclusivly within the margin defined by
	 * zero plus-minus the given tolerance {@code (-tolerance <= value <= tolerance or [-tolerance,tolerance])}.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |v|}
	 * 
	 * @param tolerance The tolerance for defining the margin around zero.
	 * 
	 * @return The length (magnitude) of the vector or zero if it is a zero vector {@code (x=y=z=0)}.
	 */
	float length(float tolerance);
	
	/**
	 * Returns the squared length (squared magnitude) of the current vector.
	 * This does not account for zero vectors {@code (x=y=z=0)}.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |v|²}
	 * 
	 * @return The squared length (squared magnitude) of the current vector.
	 */
	float squaredLengthUnsafe();
	
	/**
	 * Returns the squared length (squared magnitude) of the current vector.
	 * If the vector is a zero vector {@code (x=y=z=0)} the result will be zero.
	 * It assumes the current vector to be a zero vector if all components are exactly zero.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |v|²}
	 * 
	 * @return The squared length (squared magnitude) of the current vector or zero if it is a zero vector {@code (x=y=z=0)}.
	 */
	float squaredLength();
	
	/**
	 * Returns the squared length (squared magnitude) of the current vector.
	 * If the vector is a zero vector {@code (x=y=z=0)} the result will be zero.
	 * It assumes the current vector to be a zero vector if all components are inclusivly within the margin defined by
	 * zero plus-minus the given tolerance {@code (-tolerance <= value <= tolerance or [-tolerance,tolerance])}.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |v|²}
	 * 
	 * @param tolerance The tolerance for defining the margin around zero.
	 * 
	 * @return The squared length (squared magnitude) current of the vector or zero if it is a zero vector {@code (x=y=z=0)}.
	 */
	float squaredLength(float tolerance);
	
	/**
	 * Returns the dot product (scalar product) between this vector and the given tuple {@code (t)}.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v . t}
	 * 
	 * @param t The other tuple.
	 * 
	 * @return The dot product (scalar product).
	 */
	default float dot(Tup3fR t)
	{
		return dot(t.getX(), t.getY(), t.getZ());
	}
	
	/**
	 * Returns the dot product (scalar product) between this vector and the given value {@code (value)}.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v . (value, value, value)}
	 * 
	 * @param value The value of all the components of the other tuple.
	 * 
	 * @return The dot product (scalar product).
	 */
	default float dot(float value)
	{
		return dot(value, value, value);
	}
	
	/**
	 * Returns the dot product (scalar product) between this vector and the given tuple {@code (x, y, z)}.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v . (x, y, z)}
	 * 
	 * @param x The value of the x component of the other tuple.
	 * @param y The value of the y component of the other tuple.
	 * @param z The value of the z component of the other tuple.
	 * 
	 * @return The dot product (scalar product).
	 */
	float dot(float x, float y, float z);
	
	/**
	 * Determines the smallest value of the components and returns the value and the index of the component.
	 * The index returned is limited to the range of {@code 0 to getDimensions() - 1}.
	 * If two or more components have the same value the first index will be returned.
	 * The returned tuple is immutable.
	 * 
	 * @return The smallest value of the components and the index of the corresponding component.
	 */
	Tup2oR<Float,Integer> getMin();
	
	/**
	 * Determines the smallest value of the components and returns the value and the index of the component.
	 * The index returned is limited to the range of {@code 0 to getDimensions() - 1}.
	 * If two or more components have the same value the first index will be returned.
	 * This version utilizes an extraction parameter that receives the result and will be returned.
	 * 
	 * @param <T> The type of the extraction parameter.
	 * 
	 * @param res The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	<T extends Tup2oC<Float,Integer>> T getMin(@ExtractParam T res);
	
	/**
	 * Determines the smallest value of the components and returns it.
	 * 
	 * @return The smallest value of the components.
	 */
	float getMinValue();
	
	/**
	 * Determines the smallest value of the componensts and returns the index of the component.
	 * The index returned is limited to the range of {@code 0 to getDimensions() - 1}.
	 * If two or more components have the same value the first index will be returned.
	 * 
	 * @return The index of the smallest component.
	 */
	int getMinComponent();
	
	/**
	 * Determines the greatest value of the components and returns the value and the index of the component.
	 * The index returned is limited to the range of {@code 0 to getDimensions() - 1}.
	 * If two or more components have the same value the first index will be returned.
	 * The returned tuple is immutable.
	 * 
	 * @return The greatest value of the components and the index of the corresponding component.
	 */
	Tup2oR<Float,Integer> getMax();
	
	/**
	 * Determines the greatest value of the components and returns the value and the index of the component.
	 * The index returned is limited to the range of {@code 0 to getDimensions() - 1}.
	 * If two or more components have the same value the first index will be returned.
	 * This version utilizes an extraction parameter that receives the result and will be returned.
	 * 
	 * @param <T> The type of the extraction parameter.
	 * 
	 * @param res The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	<T extends Tup2oC<Float,Integer>> T getMax(@ExtractParam T res);
	
	/**
	 * Determines the greatest value of the components and returns it.
	 * 
	 * @return The greatest value of the components.
	 */
	float getMaxValue();
	
	/**
	 * Determines the greatest value of the componensts and returns the index of the component.
	 * The index returned is limited to the range of {@code 0 to getDimensions() - 1}.
	 * If two or more components have the same value the first index will be returned.
	 * 
	 * @return The index of the greatest component.
	 */
	int getMaxComponent();
	
	/**
	 * Adds the given tuple {@code (t)} to the current vector and saves the result in a new instance.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v + t}
	 * 
	 * @param t The tuple to add to the current vector.
	 * 
	 * @return A new instance of the vector with the result.
	 */
	default Vec3fR addN(Tup3fR t)
	{
		return addN(t.getX(), t.getY(), t.getZ());
	}
	
	/**
	 * Adds the given array {@code (a)} to the current vector and saves the result in a new instance.
	 * The components for x, y and z are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 elements.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v + (a[0], a[1], a[2])}
	 * 
	 * @param a The array to add to the current vector. Minimum legth: 3.
	 * 
	 * @return A new instance of the vector with the result.
	 */
	default Vec3fR addN(float[] a)
	{
		return addN(a[COMP_X], a[COMP_Y], a[COMP_Z]);
	}
	
	/**
	 * Adds the given array {@code (a)} to the current vector and saves the result in a new instance.
	 * The indices for the components are given by the parameters. Therefore the array
	 * has to contain at least 1 element.
	 * This operation does not alter the current vector.
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
	 * @return A new instance of the vector with the result.
	 */
	default Vec3fR addN(int indexX, int indexY, int indexZ, float[] a)
	{
		return addN(a[indexX], a[indexY], a[indexZ]);
	}
	
	/**
	 * Adds the given value {@code (value)} to the current vector and saves the result in a new instance.
	 * The value is added to every component.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v + (value, value, value)}
	 * 
	 * @param value The value to add to the current vector.
	 * 
	 * @return A new instance of the vector with the result.
	 */
	default Vec3fR addN(float value)
	{
		return addN(value, value, value);
	}
	
	/**
	 * Adds the given tuple {@code (x, y, z)} to the current vector and saves the result in a new instance.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v + (x, y, z)}
	 * 
	 * @param x The value of the x component to add to the current vector.
	 * @param y The value of the y component to add to the current vector.
	 * @param z The value of the z component to add to the current vector.
	 * 
	 * @return A new instance of the vector with the result.
	 */
	Vec3fR addN(float x, float y, float z);
	
	/**
	 * Subtracts the given tuple {@code (t)} from the current vector and saves the result in a new instance.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v - t}
	 * 
	 * @param t The tuple to subtract from the current vector.
	 * 
	 * @return A new instance of the vector with the result.
	 */
	default Vec3fR subN(Tup3fR t)
	{
		return subN(t.getX(), t.getY(), t.getZ());
	}
	
	/**
	 * Subtracts the given array {@code (a)} from the current vector and saves the result in a new instance.
	 * The components for x, y and z are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 elements.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v - (a[0], a[1], a[2])}
	 * 
	 * @param a The array to subtract from the current vector. Minimum length: 3.
	 * 
	 * @return A new instance of the vector with the result.
	 */
	default Vec3fR subN(float[] a)
	{
		return subN(a[COMP_X], a[COMP_Y], a[COMP_Z]);
	}
	
	/**
	 * Subtracts the given array {@code (a)} from the current vector and saves the result in a new instance.
	 * The indices for the components are given by the parameters. Therefore the array
	 * has to contain at least 1 element.
	 * This operation does not alter the current vector.
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
	 * @return A new instance of the vector with the result.
	 */
	default Vec3fR subN(int indexX, int indexY, int indexZ, float[] a)
	{
		return subN(a[indexX], a[indexY], a[indexZ]);
	}
	
	/**
	 * Subtracts the given value {@code (value)} from the current vector and saves the result in a new instance.
	 * The value is subtracted from every component.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v - (value, value, value)}
	 * 
	 * @param value The value to subtract from the current vector.
	 * 
	 * @return A new instance of the vector with the result.
	 */
	default Vec3fR subN(float value)
	{
		return subN(value, value, value);
	}
	
	/**
	 * Subtracts the given tuple {@code (x, y, z)} from the current vector and saves the result in
	 * a new instance.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v - (x, y, z)}
	 * 
	 * @param x The value of the x component to subtract from the current vector.
	 * @param y The value of the y component to subtract from the current vector.
	 * @param z The value of the z component to subtract from the current vector.
	 * 
	 * @return A new instance of the vector with the result.
	 */
	Vec3fR subN(float x, float y, float z);
	
	/**
	 * Subtracts the current vector from the given tuple {@code (t)} and saves the result in a new instance.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code t - v}
	 * 
	 * @param t The tuple the current vector is subtracted from.
	 * 
	 * @return A new instance of the vector with the result.
	 */
	default Vec3fR revSubN(Tup3fR t)
	{
		return revSubN(t.getX(), t.getY(), t.getZ());
	}
	
	/**
	 * Subtracts the current vector from the given array {@code (a)} and saves the result in a new instance.
	 * The components for x, y and z are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 elements.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (a[0], a[1], a[2]) - v}
	 * 
	 * @param a The array the current vector is subtracted from. Minimum length: 3.
	 * 
	 * @return A new instance of the vector with the result.
	 */
	default Vec3fR revSubN(float[] a)
	{
		return revSubN(a[COMP_X], a[COMP_Y], a[COMP_Z]);
	}
	
	/**
	 * Subtracts the current vector from the given array {@code (a)} and saves the result in a new instance.
	 * The indices for the components are given by the parameters. Therefore the array
	 * has to contain at least 1 element.
	 * This operation does not alter the current vector.
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
	 * @return A new instance of the vector with the result.
	 */
	default Vec3fR revSubN(int indexX, int indexY, int indexZ, float[] a)
	{
		return revSubN(a[indexX], a[indexY], a[indexZ]);
	}
	
	/**
	 * Subtracts the current vector from the given value {@code (value)} and saves the result in a new instance.
	 * Every component is subtracted from the value.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (value, value, value) - v}
	 * 
	 * @param value The value the current vector is subtracted from.
	 * 
	 * @return A new instance of the vector with the result.
	 */
	default Vec3fR revSubN(float value)
	{
		return revSubN(value, value, value);
	}
		
	/**
	 * Subtracts the current vector from the given tuple {@code (x, y, z)} and saves the result in
	 * a new instance.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (x, y, z) - v}
	 * 
	 * @param x The value of the x component the current vector is subtracted from.
	 * @param y The value of the y component the current vector is subtracted from.
	 * @param z The value of the z component the current vector is subtracted from.
	 * 
	 * @return A new instance of the vector with the result.
	 */
	Vec3fR revSubN(float x, float y, float z);
	
	/**
	 * Multiplies the current vector with the given tuple {@code (t)} and saves the result in a new instance.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v * t}
	 * 
	 * @param t The tuple to multiply the current vector with.
	 * 
	 * @return A new instance of the vector with the result.
	 */
	default Vec3fR mulN(Tup3fR t)
	{
		return mulN(t.getX(), t.getY(), t.getZ());
	}
	
	/**
	 * Multiplies the current vector with the given array {@code (a)} and saves the result in a new instance.
	 * The components for x, y and z are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 elements.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v * (a[0], a[1], a[2])}
	 * 
	 * @param a The array to multiply the current vector with. Minimum length: 3.
	 * 
	 * @return A new instance of the vector with the result.
	 */
	default Vec3fR mulN(float[] a)
	{
		return mulN(a[COMP_X], a[COMP_Y], a[COMP_Z]);
	}
	
	/**
	 * Multiplies the current vector with the given array {@code (a)} and saves the result in a new instance.
	 * The indices for the components are given by the parameters. Therefore the array
	 * has to contain at least 1 element.
	 * This operation does not alter the current vector.
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
	 * @return A new instance of the vector with the result.
	 */
	default Vec3fR mulN(int indexX, int indexY, int indexZ, float[] a)
	{
		return mulN(a[indexX], a[indexY], a[indexZ]);
	}
	
	/**
	 * Multiplies the current vector with the given value {@code (value)} and saves the result in a new instance.
	 * The value is multiplied with every component.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v * (value, value, value)}
	 * 
	 * @param value The value to multiply the current vector with.
	 * 
	 * @return A new instance of the vector with the result.
	 */
	default Vec3fR mulN(float value)
	{
		return mulN(value, value, value);
	}
	
	/**
	 * Multiplies the current vector with the given tuple {@code (x, y, z)} and saves the result in
	 * a new instance.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v * (x, y, z)}
	 * 
	 * @param x The value of the x component to multiply the current vector with.
	 * @param y The value of the y component to multiply the current vector with.
	 * @param z The value of the z component to multiply the current vector with.
	 * 
	 * @return A new instance of the vector with the result.
	 */
	Vec3fR mulN(float x, float y, float z);
	
	/**
	 * Divides the current vector by the given tuple {@code (t)} and saves the result in a new instance.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v / t}
	 * 
	 * @param t The tuple to divide the current vector by.
	 * 
	 * @return A new instance of the vector with the result.
	 */
	default Vec3fR divN(Tup3fR t)
	{
		return divN(t.getX(), t.getY(), t.getZ());
	}
	
	/**
	 * Divides the current vector by the given array {@code (a)} and saves the result in a new instance.
	 * The components for x, y and z are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 elements.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v / (a[0], a[1], a[2])}
	 * 
	 * @param a The array to divide the current vector by. Minimum length: 3.
	 * 
	 * @return A new instance of the vector with the result.
	 */
	default Vec3fR divN(float[] a)
	{
		return divN(a[COMP_X], a[COMP_Y], a[COMP_Z]);
	}
	
	/**
	 * Divides the current vector by the given array {@code (a)} and saves the result in a new instance.
	 * The indices for the components are given by the parameters. Therefore the array
	 * has to contain at least 1 element.
	 * This operation does not alter the current vector.
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
	 * @return A new instance of the vector with the result.
	 */
	default Vec3fR divN(int indexX, int indexY, int indexZ, float[] a)
	{
		return divN(a[indexX], a[indexY], a[indexZ]);
	}
	
	/**
	 * Divides the current vector by the given value {@code (value)} and saves the result in a new instance.
	 * every component is divided by the value.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v / (value, value, value)}
	 * 
	 * @param value The value to divide the current vector by.
	 * 
	 * @return A new instance of the vector with the result.
	 */
	default Vec3fR divN(float value)
	{
		return divN(value, value, value);
	}
	
	/**
	 * Divides the current vector by the given tuple {@code (x, y, z)} and saves the result in
	 * a new instance.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v / (x, y, z)}
	 * 
	 * @param x The value of the x component to divide the current vector by.
	 * @param y The value of the y component to divide the current vector by.
	 * @param z The value of the z component to divide the current vector by.
	 * 
	 * @return A new instance of the vector with the result.
	 */
	Vec3fR divN(float x, float y, float z);

	/**
	 * Divides the given tuple {@code (t)} by the current vector and saves the result in a new instance.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code t / v}
	 * 
	 * @param t The tuple to divide by the current vector.
	 * 
	 * @return A new instance of the vector with the result.
	 */
	default Vec3fR revDivN(Tup3fR t)
	{
		return revDivN(t.getX(), t.getY(), t.getZ());
	}

	/**
	 * Divides the given array {@code (a)} by the current vector and saves the result in a new instance.
	 * The components for x, y and z are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 elements.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (a[0], a[1], a[2]) / v}
	 * 
	 * @param a The array to divide by the current vector. Minimum length: 3.
	 * 
	 * @return A new instance of the vector with the result.
	 */
	default Vec3fR revDivN(float[] a)
	{
		return revDivN(a[COMP_X], a[COMP_Y], a[COMP_Z]);
	}
	
	/**
	 * Divides the given array {@code (a)} by the current vector and saves the result in a new instance.
	 * The indices for the components are given by the parameters. Therefore the array
	 * has to contain at least 1 element.
	 * This operation does not alter the current vector.
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
	 * @return A new instance of the vector with the result.
	 */
	default Vec3fR revDivN(int indexX, int indexY, int indexZ, float[] a)
	{
		return revDivN(a[indexX], a[indexY], a[indexZ]);
	}
	
	/**
	 * Divides the given value {@code (value)} by the current vector and saves the result in a new instance.
	 * The value is divided by every component.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (value, value, value) / v}
	 * 
	 * @param value The value to divide by the current vector.
	 * 
	 * @return A new instance of the vector with the result.
	 */
	default Vec3fR revDivN(float value)
	{
		return revDivN(value, value, value);
	}

	/**
	 * Divides the given tuple {@code (x, y, z)} by the current vector and saves the result in
	 * a new instance.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (x, y, z) / v}
	 * 
	 * @param x The value of the x component to divide by the current vector.
	 * @param y The value of the y component to divide by the current vector.
	 * @param z The value of the z component to divide by the current vector.
	 * 
	 * @return A new instance of the vector with the result.
	 */
	Vec3fR revDivN(float x, float y, float z);

	/**
	 * Normalizes the current vector and saves the result in a new instance.
	 * Normalization is done by dividing the vector by its length (magnitude).
	 * This doesn't account for zero-length vectors {@code (x=y=z=0)} and will in such case throw an {@link ArithmeticException}
	 * as this would result in a division by zero.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * This function is intended to be used in situations where the vector by design cannot be of zero length.
	 * In that case calling this function will avoid the check for zero.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v / |v|}
	 * 
	 * @return A new instance of the vector with the result.
	 * 
	 * @throws ArithmeticException Thrown when it is a zero-length vector.
	 */
	Vec3fR normalUnsafeN();

	/**
	 * Normalizes the current vector and saves the result in a new instance.
	 * Normalization is done by dividing the vector by its length (magnitude).
	 * If the vector is a zero-length vector {@code (x=y=z=0)} the result will be a zero vector.
	 * It determines a length of zero by checking if all components are exactly zero.
	 * Due to floating-point-errors it might still throw an {@link ArithmeticException} when
	 * the length is too close to zero.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v / |v|}
	 * 
	 * @return A new instance of the vector with the result.
	 * 
	 * @throws ArithmeticException Might be thrown when the length is to close to zero.
	 */
	Vec3fR normalN();

	/**
	 * Normalizes the current vector and saves the result in a new instance.
	 * Normalization is done by dividing the vector by its length (magnitude).
	 * If the vector is a zero-length vector {@code (x=y=z=0)} the result will be a zero vector.
	 * It determines a zero-length by checking if all components are within the margin defined by
	 * zero plus-minus the given tolerance inclusive {@code (-tolerance <= value <= tolerance)}.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v / |v|}
	 * 
	 * @param tolerance The tolerance for defining the margin around zero.
	 * 
	 * @return A new instance of the vector with the result.
	 */
	Vec3fR normalN(float tolerance);

	/**
	 * Negates (inverts) the current vector and saves the result in a new instance.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code -v}
	 * 
	 * @return A new instance of the vector with the result.
	 */
	Vec3fR negateN();
	
	/**
	 * Calculates the inverse of the current vector and saves the result in a new instance.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code 1 - v}
	 * 
	 * @return A new instance of the vector with the result.
	 */
	Vec3fR inverseN();
	
	/**
	 * Calculates either the right or left handed cross product between this vector and the given tuple {@code (t)}
	 * and saves the result in a new instance.
	 * The handedness is determined by the implementation.
	 * This operation does not alter the current vector.
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
	 * @return A new instance of the vector with the result.
	 */
	default Vec3fR crossN(Tup3fR t)
	{
		return crossN(t.getX(), t.getY(), t.getZ());
	}
	
	/**
	 * Calculates either the right or left handed cross product between this vector and the given array {@code (a)}
	 * and saves the result in a new instance.
	 * The components for x, y and z are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 elements.
	 * The handedness is determined by the implementation.
	 * This operation does not alter the current vector.
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
	 * @return A new instance of the vector with the result.
	 */
	default Vec3fR crossN(float[] a)
	{
		return crossN(a[COMP_X], a[COMP_Y], a[COMP_Z]);
	}
	
	/**
	 * Calculates either the right or left handed cross product between this vector and the given array {@code (a)}
	 * and saves the result in a new instance.
	 * The indices for the components are given by the parameters. Therefore the array
	 * has to contain at least 1 element.
	 * The handedness is determined by the implementation.
	 * This operation does not alter the current vector.
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
	 * @return A new instance of the vector with the result.
	 */
	default Vec3fR crossN(int indexX, int indexY, int indexZ, float[] a)
	{
		return crossN(a[indexX], a[indexY], a[indexZ]);
	}
	
	/**
	 * Calculates either the right or left handed cross product between this vector and the given value {@code (value)}
	 * and saves the result in a new instance.
	 * The value is seen as a tuple with all component values equal to it.
	 * The handedness is determined by the implementation.
	 * This operation does not alter the current vector.
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
	 * @return A new instance of the vector with the result.
	 */
	default Vec3fR crossN(float value)
	{
		return crossN(value, value, value);
	}
	
	/**
	 * Calculates either the right or left handed cross product between this vector and the given tuple {@code (x, y, z)}
	 * and saves the result in a new instance.
	 * The handedness is determined by the implementation.
	 * This operation does not alter the current vector.
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
	 * @return A new instance of the vector with the result.
	 */
	Vec3fR crossN(float x, float y, float z);
	
	/**
	 * Calculates either the right or left handed cross product between this vector and the given tuple {@code (t)}
	 * and saves the result in a new instance.
	 * The handedness is determined by the parameter {@code rightHanded}.
	 * This operation does not alter the current vector.
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
	 * @return A new instance of the vector with the result.
	 */
	default Vec3fR crossN(Tup3fR t, boolean rightHanded)
	{
		return crossN(t.getX(), t.getY(), t.getZ(), rightHanded);
	}
	
	/**
	 * Calculates either the right or left handed cross product between this vector and the given array {@code (a)}
	 * and saves the result in a new instance.
	 * The components for x, y and z are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 elements.
	 * The handedness is determined by the parameter {@code rightHanded}.
	 * This operation does not alter the current vector.
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
	 * @return A new instance of the vector with the result.
	 */
	default Vec3fR crossN(float[] a, boolean rightHanded)
	{
		return crossN(a[COMP_X], a[COMP_Y], a[COMP_Z], rightHanded);
	}
	
	/**
	 * Calculates either the right or left handed cross product between this vector and the given array {@code (a)}
	 * and saves the result in a new instance.
	 * The indices for the components are given by the parameters. Therefore the array
	 * has to contain at least 1 element.
	 * The handedness is determined by the parameter {@code rightHanded}.
	 * This operation does not alter the current vector.
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
	 * @return A new instance of the vector with the result.
	 */
	default Vec3fR crossN(int indexX, int indexY, int indexZ, float[] a, boolean rightHanded)
	{
		return crossN(a[indexX], a[indexY], a[indexZ], rightHanded);
	}
	
	/**
	 * Calculates either the right or left handed cross product between this vector and the given value {@code (value)}
	 * and saves the result in a new instance.
	 * The value is seen as a tuple with all component values equal to it.
	 * The handedness is determined by the parameter {@code rightHanded}.
	 * This operation does not alter the current vector.
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
	 * @return A new instance of the vector with the result.
	 */
	default Vec3fR crossN(float value, boolean rightHanded)
	{
		return crossN(value, value, value, rightHanded);
	}
	
	/**
	 * Calculates either the right or left handed cross product between this vector and the given tuple {@code (x, y, z)}
	 * and saves the result in a new instance.
	 * The handedness is determined by the parameter {@code rightHanded}.
	 * This operation does not alter the current vector.
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
	 * @return A new instance of the vector with the result.
	 */
	Vec3fR crossN(float x, float y, float z, boolean rightHanded);
	
	/**
	 * Calculates the right handed cross product between this vector and the given tuple {@code (t)}
	 * and saves the result in a new instance.
	 * This operation does not alter the current vector.
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
	 * @return A new instance of the vector with the result.
	 */
	default Vec3fR crossRHN(Tup3fR t)
	{
		return crossRHN(t.getX(), t.getY(), t.getZ());
	}
	
	/**
	 * Calculates the right handed cross product between this vector and the given array {@code (a)}
	 * and saves the result in a new instance.
	 * The components for x, y and z are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 elements.
	 * This operation does not alter the current vector.
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
	 * @return A new instance of the vector with the result.
	 */
	default Vec3fR crossRHN(float[] a)
	{
		return crossRHN(a[COMP_X], a[COMP_Y], a[COMP_Z]);
	}
	
	/**
	 * Calculates the right handed cross product between this vector and the given array {@code (a)}
	 * and saves the result in a new instance.
	 * The indices for the components are given by the parameters. Therefore the array
	 * has to contain at least 1 element.
	 * This operation does not alter the current vector.
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
	 * @return A new instance of the vector with the result.
	 */
	default Vec3fR crossRHN(int indexX, int indexY, int indexZ, float[] a)
	{
		return crossRHN(a[indexX], a[indexY], a[indexZ]);
	}
	
	/**
	 * Calculates the right handed cross product between this vector and the given value {@code (value)}
	 * and saves the result in a new instance.
	 * The value is seen as a tuple with all component values equal to it.
	 * This operation does not alter the current vector.
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
	 * @return A new instance of the vector with the result.
	 */
	default Vec3fR crossRHN(float value)
	{
		return crossRHN(value, value, value);
	}
	
	/**
	 * Calculates the right handed cross product between this vector and the given tuple {@code (x, y, z)}
	 * and saves the result in a new instance.
	 * This operation does not alter the current vector.
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
	 * @return A new instance of the vector with the result.
	 */
	Vec3fR crossRHN(float x, float y, float z);
	
	/**
	 * Calculates the left handed cross product between this vector and the given tuple {@code (t)}
	 * and saves the result in a new instance.
	 * This operation does not alter the current vector.
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
	 * @return A new instance of the vector with the result.
	 */
	default Vec3fR crossLHN(Tup3fR t)
	{
		return crossLHN(t.getX(), t.getY(), t.getZ());
	}
	
	/**
	 * Calculates the left handed cross product between this vector and the given array {@code (a)}
	 * and saves the result in a new instance.
	 * The components for x, y and z are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 elements.
	 * This operation does not alter the current vector.
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
	 * @return A new instance of the vector with the result.
	 */
	default Vec3fR crossLHN(float[] a)
	{
		return crossLHN(a[COMP_X], a[COMP_Y], a[COMP_Z]);
	}
	
	/**
	 * Calculates the left handed cross product between this vector and the given array {@code (a)}
	 * and saves the result in a new instance.
	 * The indices for the components are given by the parameters. Therefore the array
	 * has to contain at least 1 element.
	 * This operation does not alter the current vector.
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
	 * @return A new instance of the vector with the result.
	 */
	default Vec3fR crossLHN(int indexX, int indexY, int indexZ, float[] a)
	{
		return crossLHN(a[indexX], a[indexY], a[indexZ]);
	}
	
	/**
	 * Calculates the left handed cross product between this vector and the given value {@code (value)}
	 * and saves the result in a new instance.
	 * The value is seen as a tuple with all component values equal to it.
	 * This operation does not alter the current vector.
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
	 * @return A new instance of the vector with the result.
	 */
	default Vec3fR crossLHN(float value)
	{
		return crossLHN(value, value, value);
	}
	
	/**
	 * Calculates the left handed cross product between this vector and the given tuple {@code (x, y, z)}
	 * and saves the result in a new instance.
	 * This operation does not alter the current vector.
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
	 * @return A new instance of the vector with the result.
	 */
	Vec3fR crossLHN(float x, float y, float z);
	
	/**
	 * Calculates the absolute values of all components of the current vector and saves the result in a new instance.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (|v.x|, |v.y|, |v.z|)}
	 * 
	 * @return A new instance of the vector with the result.
	 */
	Vec3fR absN();
	
	/**
	 * Rounds all components down to the next integer closer to negative infinity and saves the result in a new instance.
	 * This operation does not alter the current vector.
	 * 
	 * 
	 * @return A new instance of the vector with the result.
	 */
	Vec3fR floorN();
	
	/**
	 * Rounds all components up to the next integer closer to positive infinity and saves the result in a new instance.
	 * This operation does not alter the current vector.
	 * 
	 * @return A new instance of the vector with the result.
	 */
	Vec3fR ceilN();
	
	/**
	 * Rounds all components up to the next integer closer to positive infinity or negative infinity and saves the result in a new instance.
	 * This operation does not alter the current vector.
	 * 
	 * @return A new instance of the vector with the result.
	 */
	Vec3fR roundN();
	
	/**
	 * Truncates the decimals of the components and saves the result in a new instance.
	 * This operation does not alter the current vector.
	 * 
	 * @return A new instance of the vector with the result.
	 */
	Vec3fR truncN();
	
	/**
	 * Sets the vector to the signums {@code (+1.0f, -1.0f)} of the components and saves the result in a new instance.
	 * This operation does not alter the current vector.
	 * 
	 * @return A new instance of the vector with the result.
	 */
	Vec3fR signumN();
	
	/**
	 * Applies the given matrix to the current vector and therefore transforming it and saves the result in a new instance.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code m * v}
	 * 
	 * @param m The matrix to apply.
	 * 
	 * @return A new instance of the vector with the result.
	 */
	Vec3fR transformN(Mat4fR m);
	
	/**
	 * Sets the vector to the componentwise minimum values of the current vector and the given tuple {@code (t)}
	 * and saves the result in a new instance.
	 * Therefore it uses for each component the smaller value of either the current vector or the tuple.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (min(v.x, t.x), min(v.y, t.y), min(v.z, t.z))}
	 * 
	 * @param t The other tuple.
	 * 
	 * @return A new instance of the vector with the result.
	 */
	default Vec3fR minN(Tup3fR t)
	{
		return minN(t.getX(), t.getY(), t.getZ());
	}
	
	/**
	 * Sets the vector to the componentwise minimum values of the current vector and the given array {@code (a)}
	 * and saves the result in a new instance.
	 * Therefore it uses for each component the smaller value of either the current vector or the array.
	 * The components for x, y and z are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 elements.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (min(v.x, a[0]), min(v.y, a[1]), min(v.z, a[2]))}
	 * 
	 * @param a The other array. Minimum length: 3.
	 * 
	 * @return A new instance of the vector with the result.
	 */
	default Vec3fR minN(float[] a)
	{
		return minN(a[COMP_X], a[COMP_Y], a[COMP_Z]);
	}
	
	/**
	 * Sets the vector to the componentwise minimum values of the current vector and the given array {@code (a)}
	 * and saves the result in a new instance.
	 * Therefore it uses for each component the smaller value of either the current vector or the array.
	 * The indices for the components are given by the parameters. Therefore the array
	 * has to contain at least 1 element.
	 * This operation does not alter the current vector.
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
	 * @return A new instance of the vector with the result.
	 */
	default Vec3fR minN(int indexX, int indexY, int indexZ, float[] a)
	{
		return minN(a[indexX], a[indexY], a[indexZ]);
	}
	
	/**
	 * Sets the vector to the componentwise minimum values of the current vector and the given value {@code (value)}
	 * and saves the result in a new instance.
	 * Therefore it uses for each component the smaller value of either the current vector or the value.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (min(v.x, value), min(v.y, value), min(v.z, value))}
	 * 
	 * @param value The other value.
	 * 
	 * @return A new instance of the vector with the result.
	 */
	default Vec3fR minN(float value)
	{
		return minN(value, value, value);
	}
	
	/**
	 * Sets the vector to the componentwise minimum values of the current vector and the given tuple {@code (x, y, z)}
	 * and saves the result in a new instance.
	 * Therefore it uses for each component the smaller value of either the current vector or the tuple.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (min(v.x, x), min(v.y, y), min(v.z, z))}
	 * 
	 * @param x The value of the x component of the tuple.
	 * @param y The value of the y component of the tuple.
	 * @param z The value of the z component of the tuple.
	 * 
	 * @return A new instance of the vector with the result.
	 */
	Vec3fR minN(float x, float y, float z);
	
	/**
	 * Sets the vector to the componentwise maximum values of the current vector and the given tuple {@code (t)}
	 * and saves the result in a new instance.
	 * Therefore it uses for each component the greater value of either the current vector or the tuple.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (max(v.x, t.x), max(v.y, t.y), max(v.z, t.z))}
	 * 
	 * @param t The other tuple.
	 * 
	 * @return A new instance of the vector with the result.
	 */
	default Vec3fR maxN(Tup3fR t)
	{
		return maxN(t.getX(), t.getY(), t.getZ());
	}
	
	/**
	 * Sets the vector to the componentwise maximum values of the current vector and the given array {@code (a)}
	 * and saves the result in a new instance.
	 * Therefore it uses for each component the greater value of either the current vector or the array.
	 * The components for x, y and z are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 elements.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (max(v.x, a[0]), max(v.y, a[1]), max(v.z, a[2]))}
	 * 
	 * @param a The other array. Minimum length: 3.
	 * 
	 * @return A new instance of the vector with the result.
	 */
	default Vec3fR maxN(float[] a)
	{
		return maxN(a[COMP_X], a[COMP_Y], a[COMP_Z]);
	}
	
	/**
	 * Sets the vector to the componentwise maximum values of the current vector and the given array {@code (a)}
	 * and saves the result in a new instance.
	 * Therefore it uses for each component the greater value of either the current vector or the array.
	 * The indices for the components are given by the parameters. Therefore the array
	 * has to contain at least 1 element.
	 * This operation does not alter the current vector.
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
	 * @return A new instance of the vector with the result.
	 */
	default Vec3fR maxN(int indexX, int indexY, int indexZ, float[] a)
	{
		return maxN(a[indexX], a[indexY], a[indexZ]);
	}
	
	/**
	 * Sets the vector to the componentwise maximum values of the current vector and the given value {@code (value)}
	 * and saves the result in a new instance.
	 * Therefore it uses for each component the greater value of either the current vector or the value.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (max(v.x, value), max(v.y, value), max(v.z, value))}
	 * 
	 * @param value The other value.
	 * 
	 * @return A new instance of the vector with the result.
	 */
	default Vec3fR maxN(float value)
	{
		return maxN(value, value, value);
	}
	
	/**
	 * Sets the vector to the componentwise maximum values of the current vector and the given tuple {@code (x, y, z)}
	 * and saves the result in a new instance.
	 * Therefore it uses for each component the greater value of either the current vector or the tuple.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (max(v.x, x), max(v.y, y), max(v.z, z))}
	 * 
	 * @param x The value of the x component of the tuple.
	 * @param y The value of the y component of the tuple.
	 * @param z The value of the z component of the tuple.
	 * 
	 * @return A new instance of the vector with the result.
	 */
	Vec3fR maxN(float x, float y, float z);
	
	/**
	 * Interpolates between the current vector and the given tuple {@code (t)} by the factor of {@code alpha}
	 * and saves the result in a new instance.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v * (1-alpha) + t * alpha}
	 * 
	 * @param t The other tuple.
	 * @param alpha The factor for the interpolation in range of {@code 0.0f-1.0f}.
	 * 
	 * @return A new instance of the vector with the result.
	 */
	default Vec3fR lerpN(Tup3fR t, float alpha)
	{
		return lerpN(t.getX(), t.getY(), t.getZ(), alpha);
	}
	
	/**
	 * Interpolates between the current vector and the given array {@code (a)} by the factor of {@code alpha}
	 * and saves the result in a new instance.
	 * The components for x, y and z are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 elements.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v * (1-alpha) + (a[0], a[1], a[2]) * alpha}
	 * 
	 * @param a The other array. Minimum length: 3.
	 * @param alpha The factor for the interpolation in range of {@code 0.0f-1.0f}.
	 * 
	 * @return A new instance of the vector with the result.
	 */
	default Vec3fR lerpN(float[] a, float alpha)
	{
		return lerpN(a[COMP_X], a[COMP_Y], a[COMP_Z], alpha);
	}
	
	 /**
	 * Interpolates between the current vector and the given array {@code (a)} by the factor of {@code alpha}
	 * and saves the result in a new instance.
	 * The indices for the components are given by the parameters. Therefore the array
	 * has to contain at least 1 element.
	 * This operation does not alter the current vector.
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
	 * @return A new instance of the vector with the result.
	 */
	default Vec3fR lerpN(int indexX, int indexY, int indexZ, float[] a, float alpha)
	{
		return lerpN(a[indexX], a[indexY], a[indexZ], alpha);
	}
	 
	/**
	 * Interpolates between the current vector and the given value {@code (value)} by the factor of {@code alpha}
	 * and saves the result in a new instance.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v * (1-alpha) + (value, value, value) * alpha}
	 * 
	 * @param value The other value.
	 * @param alpha The factor for the interpolation in range of {@code 0.0f-1.0f}.
	 * 
	 * @return A new instance of the vector with the result.
	 */
	default Vec3fR lerpN(float value, float alpha)
	{
		return lerpN(value, value, value, alpha);
	}
	
	/**
	 * Interpolates between the current vector and the given tuple {@code (x, y, z)} by the factor of {@code alpha}
	 * and saves the result in a new instance.
	 * This operation does not alter the current vector.
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
	 * @return A new instance of the vector with the result.
	 */
	Vec3fR lerpN(float x, float y, float z, float alpha);
	
	/**
	 * Scales the given tuple {@code (t)} by the factor {@code alpha}, adds it to the current vector
	 * and saves the result in a new instance.
	 * This is useful for example for adding a velocity vector that is interpolated over a timeframe.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v + t * alpha}.
	 * 
	 * @param t The other tuple.
	 * @param alpha The factor for the interpolation in range of {@code 0.0f-1.0f}.
	 * 
	 * @return A new instance of the vector with the result.
	 */
	default Vec3fR lerpAddN(Tup3fR t, float alpha)
	{
		return lerpAddN(t.getX(), t.getY(), t.getZ(), alpha);
	}
	
	/**
	 * Scales the given array {@code (a)} by the factor {@code alpha}, adds it to the current vector
	 * and saves the result in a new instance.
	 * This is useful for example for adding a velocity vector that is interpolated over a timeframe.
	 * The components for x, y and z are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 elements.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v + (a[0], a[1], a[2]) * alpha}.
	 * 
	 * @param a The other array. Minimum length: 3.
	 * @param alpha The factor for the interpolation in range of {@code 0.0f-1.0f}.
	 * 
	 * @return A new instance of the vector with the result.
	 */
	default Vec3fR lerpAddN(float[] a, float alpha)
	{
		return lerpAddN(a[COMP_X], a[COMP_Y], a[COMP_Z], alpha);
	}
	
	/**
	 * Scales the given array {@code (a)} by the factor {@code alpha}, adds it to the current vector
	 * and saves the result in a new instance.
	 * This is useful for example for adding a velocity vector that is interpolated over a timeframe.
	 * The indices for the components are given by the parameters. Therefore the array
	 * has to contain at least 1 element.
	 * This operation does not alter the current vector.
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
	 * @return A new instance of the vector with the result.
	 */
	default Vec3fR lerpAddN(int indexX, int indexY, int indexZ, float[] a, float alpha)
	{
		return lerpAddN(a[indexX], a[indexY], a[indexZ], alpha);
	}
	
	/**
	 * Scales the given value {@code (value)} by the factor {@code alpha}, adds it to the current vector
	 * and saves the result in a new instance.
	 * This is useful for example for adding a velocity vector that is interpolated over a timeframe.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v + (value, value, value) * alpha}.
	 * 
	 * @param value The other value.
	 * @param alpha The factor for the interpolation in range of {@code 0.0f-1.0f}.
	 * 
	 * @return A new instance of the vector with the result.
	 */
	default Vec3fR lerpAddN(float value, float alpha)
	{
		return lerpAddN(value, value, value, alpha);
	}
	
	/**
	 * Scales the given tuple {@code (x, y, z)} by the factor {@code alpha}, adds it to the current vector
	 * and saves the result in a new instance.
	 * This is useful for example for adding a velocity vector that is interpolated over a timeframe.
	 * This operation does not alter the current vector.
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
	 * @return A new instance of the vector with the result.
	 */
	Vec3fR lerpAddN(float x, float y, float z, float alpha);
	
	/**
	 * Rotates the current vector around the x axis by the given angle in radians and saves the result in a new instance.
	 * This operation does not alter the current vector.
	 * 
	 * @param angle The angle to rotate by in radians.
	 * 
	 * @return A new instance of the vector with the result.
	 */
	Vec3fR rotateXN(float angle);
	
	/**
	 * Rotates the current vector around the x axis by the given angle in degrees and saves the result in a new instance.
	 * This operation does not alter the current vector.
	 * 
	 * @param angle The angle to rotate by in degrees.
	 * 
	 * @return A new instance of the vector with the result.
	 */
	Vec3fR rotateXDegN(float angle);
	
	/**
	 * Rotates the current vector around the y axis by the given angle in radians and saves the result in a new instance.
	 * This operation does not alter the current vector.
	 * 
	 * @param angle The angle to rotate by in radians.
	 * 
	 * @return A new instance of the vector with the result.
	 */
	Vec3fR rotateYN(float angle);
	
	/**
	 * Rotates the current vector around the y axis by the given angle in degrees and saves the result in a new instance.
	 * This operation does not alter the current vector.
	 * 
	 * @param angle The angle to rotate by in degrees.
	 * 
	 * @return A new instance of the vector with the result.
	 */
	Vec3fR rotateYDegN(float angle);
	
	/**
	 * Rotates the current vector around the z axis by the given angle in radians and saves the result in a new instance.
	 * This operation does not alter the current vector.
	 * 
	 * @param angle The angle to rotate by in radians.
	 * 
	 * @return A new instance of the vector with the result.
	 */
	Vec3fR rotateZN(float angle);
	
	/**
	 * Rotates the current vector around the z axis by the given angle in degrees and saves the result in a new instance.
	 * This operation does not alter the current vector.
	 * 
	 * @param angle The angle to rotate by in degrees.
	 * 
	 * @return A new instance of the vector with the result.
	 */
	Vec3fR rotateZDegN(float angle);
	
	/**
	 * Rotates the current vector around the give tuple {@code (axis)} as axis and the given angle in radians
	 * and saves the result in a new instance.
	 * This operation does not alter the current vector.
	 * 
	 * @param axis The rotation axis.
	 * @param angle The angle to rotate by in radians.
	 * 
	 * @return A new instance of the vector with the result.
	 */
	default Vec3fR rotateN(Tup3fR axis, float angle)
	{
		return rotateN(axis.getX(), axis.getY(), axis.getZ(), angle);
	}
	
	/**
	 * Rotates the current vector around the give array {@code (axis)} as axis and the given angle in radians
	 * and saves the result in a new instance.
	 * The components for x, y and z are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 elements.
	 * This operation does not alter the current vector.
	 * 
	 * @param axis The rotation axis. Minimum length: 3.
	 * @param angle The angle to rotate by in radians.
	 * 
	 * @return A new instance of the vector with the result.
	 */
	default Vec3fR rotateN(float[] axis, float angle)
	{
		return rotateN(axis[0], axis[1], axis[2], angle);
	}
	
	/**
	 * Rotates the current vector around the give array {@code (axis)} as axis and the given angle in radians
	 * and saves the result in a new instance.
	 * The indices for the components are given by the parameters. Therefore the array
	 * has to contain at least 1 element.
	 * This operation does not alter the current vector.
	 * 
	 * @param indexX The index in the array for the x component.
	 * @param indexY The index in the array for the y component.
	 * @param indexZ The index in the array for the z component.
	 * @param axis The rotation axis. Minimum length: 1.
	 * @param angle The angle to rotate by in radians.
	 * 
	 * @return A new instance of the vector with the result.
	 */
	default Vec3fR rotateN(int indexX, int indexY, int indexZ, float[] axis, float angle)
	{
		return rotateN(axis[indexX], axis[indexY], axis[indexZ], angle);
	}
	
	/**
	 * Rotates the current vector around the give tuple {@code (axisX, axisY, axisZ)} as axis and the given angle in radians
	 * and saves the result in a new instance.
	 * This operation does not alter the current vector.
	 * 
	 * @param axisX The value of the x component of the rotation axis.
	 * @param axisY The value of the y component of the rotation axis.
	 * @param axisZ The value of the z component of the rotation axis.
	 * @param angle The angle to rotate by in radians.
	 * 
	 * @return A new instance of the vector with the result.
	 */
	Vec3fR rotateN(float axisX, float axisY, float axisZ, float angle);
	
	/**
	 * Rotates the current vector around the give tuple {@code (axis)} as axis and the given angle in degrees
	 * and saves the result in a new instance.
	 * This operation does not alter the current vector.
	 * 
	 * @param axis The rotation axis.
	 * @param angle The angle to rotate by in degrees.
	 * 
	 * @return A new instance of the vector with the result.
	 */
	default Vec3fR rotateDegN(Tup3fR axis, float angle)
	{
		return rotateDegN(axis.getX(), axis.getY(), axis.getZ(), angle);
	}
	
	/**
	 * Rotates the current vector around the give array {@code (axis)} as axis and the given angle in degrees
	 * and saves the result in a new instance.
	 * The components for x, y and z are expected to be on the indices 0, 1 and 2. Therefore the array
	 * has to contain at least 3 elements.
	 * This operation does not alter the current vector.
	 * 
	 * @param axis The rotation axis. Minimum length: 3.
	 * @param angle The angle to rotate by in degrees.
	 * 
	 * @return A new instance of the vector with the result.
	 */
	default Vec3fR rotateDegN(float[] axis, float angle)
	{
		return rotateDegN(axis[0], axis[1], axis[2], angle);
	}
	
	/**
	 * Rotates the current vector around the give array {@code (axis)} as axis and the given angle in degrees
	 * and saves the result in a new instance.
	 * The indices for the components are given by the parameters. Therefore the array
	 * has to contain at least 1 element.
	 * This operation does not alter the current vector.
	 * 
	 * @param indexX The index in the array for the x component.
	 * @param indexY The index in the array for the y component.
	 * @param indexZ The index in the array for the z component.
	 * @param axis The rotation axis. Minimum length: 1.
	 * @param angle The angle to rotate by in degrees.
	 * 
	 * @return A new instance of the vector with the result.
	 */
	default Vec3fR rotateDegN(int indexX, int indexY, int indexZ, float[] axis, float angle)
	{
		return rotateDegN(axis[indexX], axis[indexY], axis[indexZ], angle);
	}
	
	/**
	 * Rotates the current vector around the give tuple {@code (axisX, axisY, axisZ)} as axis and the given angle in degrees
	 * and saves the result in a new instance.
	 * This operation does not alter the current vector.
	 * 
	 * @param axisX The value of the x component of the rotation axis.
	 * @param axisY The value of the y component of the rotation axis.
	 * @param axisZ The value of the z component of the rotation axis.
	 * @param angle The angle to rotate by in degrees.
	 * 
	 * @return A new instance of the vector with the result.
	 */
	Vec3fR rotateDegN(float axisX, float axisY, float axisZ, float angle);
	
	/**
	 * Rotates the current vector by the given axis-angle and saves the result in a new instance.
	 * This operation does not alter the current vector.
	 * 
	 * @param aa The axis-angle to rotate by.
	 * 
	 * @return A new instance of the vector with the result.
	 */
	Vec3fR rotateN(AxisAngle3fR aa);
	
	/**
	 * Rotates the current vector by the given quaternion and saves the result in a new instance.
	 * This operation does not alter the current vector.
	 * 
	 * @param q The quaternion to rotate by.
	 * 
	 * @return A new instance of the vector with the result.
	 */
	Vec3fR rotateN(QuatfR q);
}
