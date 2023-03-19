package org.barghos.math.api.vector;

import java.util.Objects;

import org.barghos.annotation.IntValueRange;
import org.barghos.annotation.MinLength;

import org.barghos.tuple.api.t3.Tup3fC;
import org.barghos.tuple.api.t3.Tup3fR;
import org.barghos.tuple.api.tn.TupfR;

/**
 * This interface provides the common functions and methods for basic float tuples with three dimensions.
 */
public interface SimpleVec3fC extends SimpleVec3fR, Tup3fC
{
	/** {@inheritDoc} */
	@Override
	SimpleVec3fC copy();
	
	/**
	 * Sets the value of the x component of the vector.
	 * 
	 * @param x The new value.
	 * 
	 * @return The current vector.
	 */
	SimpleVec3fC setX(float x);
	
	/**
	 * Sets the value of the y component of the vector.
	 * 
	 * @param y The new value.
	 * 
	 * @return The current vector.
	 */
	SimpleVec3fC setY(float y);
	
	/**
	 * Sets the value of the z component of the vector.
	 * 
	 * @param z The new value.
	 * 
	 * @return The current vector.
	 */
	SimpleVec3fC setZ(float z);
	
	/** {@inheritDoc} */
	@Override
	default SimpleVec3fC setV0(float v0)
	{
		return setX(v0);
	}
	
	/** {@inheritDoc} */
	@Override
	default SimpleVec3fC setV1(float v1)
	{
		return setY(v1);
	}
	
	/** {@inheritDoc} */
	@Override
	default SimpleVec3fC setV2(float v2)
	{
		return setZ(v2);
	}
	
	/**
	 * Adopts the component values from an existing instance of {@link Tup3fR}.
	 * 
	 * @param t An existing implementation of {@link Tup3fR} to adopt the component values from.
	 * 
	 * @return The current vector.
	 */
	@Override
	default SimpleVec3fC set(Tup3fR t)
	{
		return set(t.getV0(), t.getV1(), t.getV2());
	}
	
	/**
	 * Sets all component values to a single value.
	 * 
	 * @param value The value used for all component values of the vector.
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
	 * @param x The new value of the x component.
	 * @param y The new value of the y component.
	 * @param z The new value of the z component.
	 * 
	 * @return The current vector.
	 */
	@Override
	default SimpleVec3fC set(float x, float y, float z)
	{
		setX(x);
		setY(y);
		setZ(z);
		
		return this;
	}
	
	/**
	 * Adopts the component values from an existing instance of {@link TupfR}.
	 * 
	 * @param t An existing implementation of {@link TupfR} to adopt the component values from.
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
	 * @param index The index of the component to store the value in.
	 * @param value The new value for the component.
	 * 
	 * @return The current vector.
	 */
	@Override
	default SimpleVec3fC setByIndex(@IntValueRange(min=0, max=2) int index, float value)
	{
		Objects.checkIndex(index, 3);

		switch(index)
		{
			case 0: return setX(value);
			case 1: return setY(value);
			case 2: return setZ(value);
			
			default: throw new AssertionError(index);
		}
	}
	
	/**
	 * Sets the component values to the corresponding values in the array.
	 * 
	 * @param values The array with the values for the components.
	 * 
	 * @return The current vector.
	 */
	@Override
	default SimpleVec3fC setArray(@MinLength(3) float... values)
	{
		return set(values[0], values[1], values[2]);
	}
}
