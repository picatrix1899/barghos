package org.barghos.math.api.vector;

import java.util.Objects;

import org.barghos.annotation.IntValueRange;
import org.barghos.annotation.MinLength;
import org.barghos.tuple.api.t4.Tup4fC;
import org.barghos.tuple.api.t4.Tup4fR;
import org.barghos.tuple.api.tn.TupfR;

/**
 * This interface provides the common functions and methods for basic float quaternions.
 */
public interface SimpleQuatfC extends SimpleQuatfR, Tup4fC
{
	/** {@inheritDoc} */
	@Override
	SimpleQuatfC copy();
	
	/**
	 * Sets the value of the x component of the quaternion.
	 * 
	 * @param x The new value.
	 * 
	 * @return The current quaternion.
	 */
	SimpleQuatfC setX(float x);
	
	/**
	 * Sets the value of the y component of the quaternion.
	 * 
	 * @param y The new value.
	 * 
	 * @return The current quaternion.
	 */
	SimpleQuatfC setY(float y);
	
	/**
	 * Sets the value of the z component of the quaternion.
	 * 
	 * @param z The new value.
	 * 
	 * @return The current quaternion.
	 */
	SimpleQuatfC setZ(float z);
	
	/**
	 * Sets the value of the w component of the quaternion.
	 * 
	 * @param w The new value.
	 * 
	 * @return The current quaternion.
	 */
	SimpleQuatfC setW(float w);
	
	/** {@inheritDoc} */
	@Override
	default SimpleQuatfC setV0(float v0)
	{
		return setX(v0);
	}
	
	/** {@inheritDoc} */
	@Override
	default SimpleQuatfC setV1(float v1)
	{
		return setY(v1);
	}
	
	/** {@inheritDoc} */
	@Override
	default SimpleQuatfC setV2(float v2)
	{
		return setZ(v2);
	}
	
	/** {@inheritDoc} */
	@Override
	default SimpleQuatfC setV3(float v3)
	{
		return setW(v3);
	}
	
	/**
	 * Adopts the component values from an existing instance of {@link Tup4fR}.
	 * 
	 * @param t An existing implementation of {@link Tup4fR} to adopt the component values from.
	 * 
	 * @return The current quaternion.
	 */
	@Override
	default SimpleQuatfC set(Tup4fR t)
	{
		return set(t.getV0(), t.getV1(), t.getV2(), t.getV3());
	}
	
	/**
	 * This operation is not supported by any quaternion.
	 * 
	 * @throws UnsupportedOperationException
	 */
	@Override
	default SimpleQuatfC set(float value)
	{
		throw new UnsupportedOperationException();
	}
	
	/**
	 * Sets the values of all components to the corresponding parameters.
	 * 
	 * @param x The new value of the x component.
	 * @param y The new value of the y component.
	 * @param z The new value of the z component.
	 * @param w The new value of the w component.
	 * 
	 * @return The current quaternion.
	 */
	@Override
	default SimpleQuatfC set(float x, float y, float z, float w)
	{
		setX(x);
		setY(y);
		setZ(z);
		setW(w);
		
		return this;
	}
	
	/**
	 * Adopts the component values from an existing instance of {@link TupfR}.
	 * 
	 * @param t An existing implementation of {@link TupfR} to adopt the component values from.
	 * 
	 * @return The current quaternion.
	 */
	@Override
	default SimpleQuatfC set(@MinLength(4) TupfR t)
	{
		return setArray(t.toArray());
	}
	
	/**
	 * Sets the value of the component at the given index.
	 * 
	 * @param index The index of the component to store the value in.
	 * @param value The new value for the component.
	 * 
	 * @return The current quaternion.
	 */
	@Override
	default SimpleQuatfC setByIndex(@IntValueRange(min=0, max=3) int index, float value)
	{
		Objects.checkIndex(index, 2);

		switch(index)
		{
			case 0: return setX(value);
			case 1: return setY(value);
			case 2: return setZ(value);
			case 3: return setW(value);
			
			default: throw new AssertionError(index);
		}
	}
	
	/**
	 * Sets the component values to the corresponding values in the array.
	 * 
	 * @param values The array with the values for the components.
	 * 
	 * @return The current quaternion.
	 */
	@Override
	default SimpleQuatfC setArray(@MinLength(4) float... values)
	{
		return set(values[0], values[1], values[2], values[3]);
	}
}
