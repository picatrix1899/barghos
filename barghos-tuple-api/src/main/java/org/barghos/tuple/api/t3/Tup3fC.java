package org.barghos.tuple.api.t3;

import java.util.Objects;

import org.barghos.documentation.IntValueRange;
import org.barghos.documentation.MinLength;
import org.barghos.tuple.api.tn.TupfC;
import org.barghos.tuple.api.tn.TupfR;

/**
 * This interface provides the common functions and methods for float tuples with three dimensions.
 * 
 * @author picatrix1899
 */
public interface Tup3fC extends Tup3fR, TupfC
{
	/**
	 * Sets the value of the x component of the tuple.
	 * 
	 * @param x The new value.
	 * 
	 * @return The current tuple.
	 */
	Tup3fC setX(float x);
	
	/**
	 * Sets the value of the y component of the tuple.
	 * 
	 * @param y The new value.
	 * 
	 * @return The current tuple.
	 */
	Tup3fC setY(float y);
	
	/**
	 * Sets the value of the z component of the tuple.
	 * 
	 * @param z The new value.
	 * 
	 * @return The current tuple.
	 */
	Tup3fC setZ(float z);
	
	/**
	 * Adopts the component values from an existing instance of {@link Tup3fR}.
	 * 
	 * @param t An existing implementation of {@link Tup3fR} to adopt the component values from.
	 * 
	 * @return The current tuple.
	 */
	default Tup3fC set(Tup3fR t)
	{
		return set(t.getX(), t.getY(), t.getZ());
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup3fC set(float value)
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
	 * @return The current tuple.
	 */
	default Tup3fC set(float x, float y, float z)
	{
		setX(x);
		setY(y);
		setZ(z);
		
		return this;
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup3fC set(@MinLength(3) TupfR t)
	{
		return setArray(t.toArray());
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup3fC setByIndex(@IntValueRange(min=0, max=2) int index, float value)
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
	
	/** {@inheritDoc}} */
	@Override
	default Tup3fC setArray(@MinLength(3) float... values)
	{
		return set(values[0], values[1], values[2]);
	}
	
	/** {@inheritDoc}} */
	@Override
	Tup3fC copy();
}