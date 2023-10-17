package org.barghos.math.api.vector;

import java.util.Objects;

import org.barghos.annotation.IntValueRange;
import org.barghos.annotation.MinLength;
import org.barghos.core.tuple.Tup3fC;
import org.barghos.core.tuple.Tup3fR;
import org.barghos.core.tuple.TupfR;

/**
 * This interface provides the common functions and methods for basic float vectors with three
 * dimensions.
 */
public interface SimpleVec3fC extends SimpleVec3fR, Tup3fC
{
	/** {@inheritDoc} */
	@Override
	SimpleVec3fC createNew();
	
	/** {@inheritDoc} */
	@Override
	default SimpleVec3fC createNew(Tup3fR v)
	{
		return createNew(v.v0(), v.v1(), v.v2());
	}
	
	/** {@inheritDoc} */
	@Override
	default SimpleVec3fC createNew(@MinLength(3) float[] v)
	{
		return createNew(v[0], v[1], v[2]);
	}
	
	/** {@inheritDoc} */
	@Override
	default SimpleVec3fC createNew(float value)
	{
		return createNew(value, value, value);
	}
	
	/** {@inheritDoc} */
	@Override
	SimpleVec3fC createNew(float x, float y, float z);
	
	/** {@inheritDoc} */
	@Override
	SimpleVec3fC copy();
	
	/**
	 * Sets the value of the x component of the vector.
	 * 
	 * @param x
	 *     The new value.
	 * 
	 * @return The current vector.
	 */
	SimpleVec3fC x(float x);
	
	/**
	 * Sets the value of the y component of the vector.
	 * 
	 * @param y
	 *     The new value.
	 * 
	 * @return The current vector.
	 */
	SimpleVec3fC y(float y);
	
	/**
	 * Sets the value of the z component of the vector.
	 * 
	 * @param z
	 *     The new value.
	 * 
	 * @return The current vector.
	 */
	SimpleVec3fC z(float z);
	
	/** {@inheritDoc} */
	@Override
	default SimpleVec3fC v0(float v0)
	{
		return x(v0);
	}
	
	/** {@inheritDoc} */
	@Override
	default SimpleVec3fC v1(float v1)
	{
		return y(v1);
	}
	
	/** {@inheritDoc} */
	@Override
	default SimpleVec3fC v2(float v2)
	{
		return z(v2);
	}
	
	/**
	 * Adopts the component values from an existing instance of {@link Tup3fR}.
	 * 
	 * @param t
	 *     An existing implementation of {@link Tup3fR} to adopt the component values from.
	 * 
	 * @return The current vector.
	 */
	@Override
	default SimpleVec3fC set(Tup3fR t)
	{
		return set(t.v0(), t.v1(), t.v2());
	}
	
	/**
	 * Sets all component values to a single value.
	 * 
	 * @param value
	 *     The value used for all component values of the vector.
	 * 
	 * @return The current vector.
	 */
	@Override
	default SimpleVec3fC set(float value)
	{
		return set(value, value, value);
	}
	
	/**
	 * Sets the values of all components to the corresponding parameters.
	 * 
	 * @param x
	 *     The new value of the x component.
	 * @param y
	 *     The new value of the y component.
	 * @param z
	 *     The new value of the z component.
	 * 
	 * @return The current vector.
	 */
	@Override
	default SimpleVec3fC set(float x, float y, float z)
	{
		x(x);
		y(y);
		z(z);
		
		return this;
	}
	
	/**
	 * Adopts the component values from an existing instance of {@link TupfR}.
	 * 
	 * @param t
	 *     An existing implementation of {@link TupfR} to adopt the component values from.
	 * 
	 * @return The current vector.
	 */
	@Override
	default SimpleVec3fC set(@MinLength(3) TupfR t)
	{
		return setArray(t.toArray());
	}
	
	/**
	 * Sets the value of the component at the given index.
	 * 
	 * @param index
	 *     The index of the component to store the value in.
	 * @param value
	 *     The new value for the component.
	 * 
	 * @return The current vector.
	 */
	@Override
	default SimpleVec3fC setByIndex(@IntValueRange(min = 0, max = 2) int index, float value)
	{
		Objects.checkIndex(index, 3);
		
		switch (index)
		{
			case 0:
				return x(value);
			case 1:
				return y(value);
			case 2:
				return z(value);
			
			default:
				throw new AssertionError(index);
		}
	}
	
	/**
	 * Sets the component values to the corresponding values in the array.
	 * 
	 * @param values
	 *     The array with the values for the components.
	 * 
	 * @return The current vector.
	 */
	@Override
	default SimpleVec3fC setArray(@MinLength(3) float... values)
	{
		return set(values[0], values[1], values[2]);
	}
}
